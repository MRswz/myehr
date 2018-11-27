/*
 * Activiti Modeler component part of the Activiti project
 * Copyright 2005-2014 Alfresco Software, Ltd. All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
'use strict';

angular.module('activitiModeler')
.controller('EditorUnsavedChangesPopupCrtl', ['$rootScope', '$scope', '$http', '$location', '$window', function ($rootScope, $scope, $http, $location, $window) {
   
	$scope.ok = function () {
		if ($scope.handleResponseFunction) {
			$scope.handleResponseFunction(true);

            // Also clear any 'onbeforeunload', added by oryx
            $window.onbeforeunload = undefined;
		}
		$scope.$hide();
	};

	$scope.cancel = function () {
		if ($scope.handleResponseFunction) {
			$scope.handleResponseFunction(false);
		}
        $scope.$hide();
	};
}]);

activitiModule
.directive('autoFocus', ['$timeout', '$parse', function($timeout, $parse) {
    return {
        restrict: 'AC',
        compile: function($element, attr) {

            return function(_scope, _element, _attrs) {
                var firstChild = (_attrs.focusFirstChild !== undefined);
                $timeout(function () {
                    if (firstChild) {
                        // look for first input-element in child-tree and focus that
                        var inputs = _element.find('input');
                        if (inputs && inputs.length > 0) {
                            inputs[0].focus();
                        }
                    } else {
                        // Focus element where the directive is put on
                        _element[0].focus();
                    }
                }, 100);
            }
        }
    };
}]);

activitiModeler.directive('ztree', function () {
	  return { 
		    require: '?ngModel',
		    restrict: 'A',
		    link: function ($scope, element, attrs, ngModel) {
		    	jQuery.fn.zTree.init(element,{
		            data: {
		            	key: {
		    				name:"label"
		    			},
		                simpleData: {
		                    enable: true
		                }
		            },
		            async: {
		    			enable: true,
		    			url: "",
		    			autoParam: ["id","label", "name"]
		    		},
		    		view: {
		    			dblClickExpand: false,
		    			txtSelectedEnable: true,
		    			showLine: false,
		    			showIcon: function (treeId, treeNode) {
		    				return treeNode.level ==0;
		    			}
		    		},
		            callback: {
		            	beforeAsync: function (treeId, treeNode) {
		    				var treeObj = jQuery.fn.zTree.getZTreeObj(treeId);
		    				if (treeNode.level === 0) {
		    					var id = treeNode.id;
		    					var url = treeNode.dataurl;
		    					if (id=="form") {
		    						var formObj = $scope.selectedShape.properties["oryx-formkeydefinition"];
		    						var formkey = "";
		    						if(formObj==undefined){
		    							formkey = "1";
		    						}else{
		    							formkey = $scope.selectedShape.properties["oryx-formkeydefinition"].id;
		    						}
		    						
		    						if (formkey) {
		    							url+="?formkey="+formkey;
		    						}
		    					}
		    					treeObj.setting.async.url=url;
		    				}
		    			    return true;
		    			},
		    			onDblClick: function (event, treeId, treeNode) {
		    				$scope.InsertValue(treeNode.name);
		    				//var tabName=$scope.activeTab.attr("tab");
		    				//var str=InsertText(treeNode.name,tabName);
		    				//if("assigneeField"==tabName){
		    				//	$scope.assignment.assignee=str;
		    				//}
		    				//jQuery("#assigneeField").val(treeNode.name);
		    				
		                }
		            }
		        }, [
		    	       {
		    	    	   id:"session",
		    	    	   label:"会话参数",
		    	    	   isParent:true,
		    	    	   dataurl:baseUrl+"/params/session.action"
		    	       },
		    	       {
		    	    	   id:"form",
		    	    	   label:"表单参数",
		    	    	   isParent:true,
		    	    	   dataurl:baseUrl+"/params/form.action"
		    	       }
		    	    ]);
		    } 
		  }; 
	}); 






















//========================form===============================




var KisBpmFormkeydefinitionCtrl = [ '$scope', '$modal', function($scope, $modal) {
    // Config for the modal window
    var opts = {
        template:  'editor-app/configuration/properties/formkeydefinition-popup.html?version=' + Date.now(),
        scope: $scope
    };
    // Open the dialog
    $modal(opts);
}];


activitiModeler.directive('formtree', function () {
	  return { 
		    require: '?ngModel',
		    restrict: 'A',
		    link: function ($scope, element, attrs, ngModel) {
		    	jQuery.fn.zTree.init(element,{
		            data: {
		            	key: {
		    				name:"name"
		    			},
		                simpleData: {
		                    enable: true,
		                    pIdKey: "pid",
		                }
		            },
		            async: {
		    			enable: true,
		    			url: baseUrl+"/params/forms/data.action",
		    			autoParam: ["id","name"]
		    		},
		    		view: {
		    			dblClickExpand: false,
		    			txtSelectedEnable: true,
		    			showLine: false,
		    			showIcon:true
		    		},
		            callback: {
		    			onClick: function (event, treeId, treeNode) {
		    				$scope.$apply(function () { 
	    		              ngModel.$setViewValue(treeNode); 
	    		            }); 
		                }
		            }
		        },[]);
		    } 
		  }; 
	}); 


var KisBpmFormkeydefinitionPopupCtrl = [ '$scope', '$translate', '$http', function($scope, $translate, $http) {
    if ($scope.property.value) {
        $scope.formkeydefinition =$scope.property.value;
    } else {
        $scope.formkeydefinition = {};
    }
    $scope.save = function() {
        $scope.property.value = $scope.formkeydefinition;
        $scope.updatePropertyInModel($scope.property);
        $scope.close();
    };
    // Close button handler
    $scope.close = function() {
    	$scope.property.mode = 'read';
    	$scope.$hide();
    };
}];








//===================Reject=======================


var KisBpmRejectTypeCtrl = ['$scope', '$modal', function ($scope, $modal) {
    // Config for the modal window
    var opts = {
        template: 'editor-app/configuration/properties/reject-popup.html?version=' + Date.now(),
        scope: $scope
    };
    // Open the dialog
    $modal(opts);
}];


var KisBpmRejectTypePopupCtrl = ['$scope', function ($scope) {
    if ($scope.property.value) {
        $scope.rejectType = $scope.property.value;
    } else {
    	 $scope.rejectType={id:"none",name:"不能驳回"};
    }
    $scope.rejectTypeNames={"none":"不能驳回","previous_node":"驳回到上节点","star_user":"驳回给提交人","free":"办理界面自由指定节点"};
    $scope.save = function () {
        //点击保存
    	$scope.rejectType["name"]=$scope.rejectTypeNames[$scope.rejectType.id];
        $scope.property.value = $scope.rejectType;
        $scope.updatePropertyInModel($scope.property);
        $scope.close();
    };

    // Close button handler
    $scope.close = function () {
        $scope.property.mode = 'read';
        $scope.$hide();
    };

}];








//====================Timeout=======================





var KisBpmTimeoutCtrl = ['$scope', '$modal', function ($scope, $modal) {
    // Config for the modal window
    var opts = {
        template: 'editor-app/configuration/properties/timeout-popup.html?version=' + Date.now(),
        scope: $scope
    };
    $modal(opts);
}];


var KisBpmTimeoutPopupCtrl = ['$scope', function ($scope) {
    if ($scope.property.value) {
        $scope.timeout = $scope.property.value;
    } else {
    	 $scope.timeout={id:"none",name:"不处理"};
    }
    $scope.timeoutNames={"none":"不处理","skip":"跳过","manual_assign":"手动指定处理人"};
    $scope.save = function () {
        //点击保存
    	$scope.timeout["name"]=$scope.timeoutNames[$scope.timeout.id];
        $scope.property.value =$scope.timeout;
        $scope.updatePropertyInModel($scope.property);
        $scope.close();
    };

    // Close button handler
    $scope.close = function () {
        $scope.property.mode = 'read';
        $scope.$hide();
    };

}];



