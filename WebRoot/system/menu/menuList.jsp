<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;">
	<div style="margin-top:5px;">
<div class="input-group">
    <div id="grid_org_list_filter">
        <table class="cbs-table" style="margin-bottom:5px">
             <tr>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP_1041" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增")%> onclick="addorg_list_click_1041()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改")%> onclick="editorg_list_click_1041()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit1org_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"撤销")%> onclick="edit1org_list_click_1041()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="saveorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveorg_list_click_1041()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit2org_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主管机构变更")%> onclick="edit2org_list_click_1041()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit3org_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构变动历史")%> onclick="edit3org_list_click_1041()"/>
			</div>
		</div>
			<div id="grid_org_list_filter" style="float:right;display:inline-block;margin-right:155px;position:relative;">
				<input id="FILTER_1041" name="FILTER_1041" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单名称")%>" type="text" class="form-control" oninput="grid_org_list_fun11()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</div>
</div>
<table id="org_list_List">
</table>
</div>
<script>
$(function() {
    querys_1041();
		$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -58 +"px");
		$(".fixed-table-body").css("height","85%");
	
	    initDict();
	    initDate();
	    console.log($(".BTNGROUP_1041>div").length);
	    var DIVAMOUNT = 5;
	    if($(".BTNGROUP_1041>div").length > DIVAMOUNT){
	    	var len = $(".BTNGROUP_1041>div").length;
	    	$(".BTNGROUP_1041>div:gt(4)").hide();
	    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
	    	$(".BTNGROUP_1041").append(selectObj);
	    	for(var i=DIVAMOUNT;i<len;i++){
	    		var liObj = $('<li style="margin-left:14px;"></li>');
	    		liObj.append($(".BTNGROUP_1041>div").eq(i).clone(true));
	    		selectObj.find('.dropdown-menu').append(liObj);
	    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
	    	}
	    	selectObj.find('.dropdown-menu div').show();
	    }
	});
	var _formId_1041='1041';
    function querys_1041() {
        $("#org_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/SysMenuList/querySysMenuList.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            queryParams : grid_org_list_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [{
                field : 'state',
                checkbox : true,
                align : 'center',
                valign : 'middle'
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
                field : 'defaultXH',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value=index+1;
                    }
                    return "<a style=\"font-size:14px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单Id")%>',
                field : 'menuId',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"menuId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"菜单Id\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单编码")%>',
                field : 'menuCode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"menuCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"菜单编码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单名称")%>',
                field : 'menuName',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"menuName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"菜单名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单类型")%>',
                field : 'menuType',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:60px;\" name=\"menuType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"菜单类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_MENU_TYPE\"></a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单业务类型")%>',
                field : 'menuDicCode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:60px;\" name=\"menuDicCode\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"菜单业务类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_MENU_BUSINESS_TYPE\"></a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级菜单编码")%>',
                field : 'menuParentCode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"menuParentCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上级菜单编码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排序")%>',
                field : 'menuSort',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w50\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"menuSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作者")%>',
                field : 'operatorName',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作时间")%>',
                field : 'operatorTime',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
            			var date = "-";
            			if(value!=null){
            				date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
            			}
                    	return "<a class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">" + date + "</a>";
                	}
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标识")%>',
                field : 'deleteMark',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w50\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"deleteMark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"删除标识\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#org_list_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
            responseHandler : function(res) {  
                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
            'click #remove': function (e, value, row, index) {  
            $.ajax({  
                type: 'POST', 
                data: JSON.stringify(row),  
                url: '${pageContext.request.contextPath }/dictType/removeSysDictType.action',  
                success: function (data) {  
                    alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除成功")%>');
                    window.location.href = window.location.href; 
                    $('#org_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#org_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
/** 刷新页面 */ 
function refresh_org_list() { 
    $('#org_list_List').bootstrapTable('refresh'); 
}
/**查询条件与分页数据 */
function queryParams(pageReqeust) {
    pageReqeust.search = $("#search").val();
    pageReqeust.enabled = $("#enabled").val();
    pageReqeust.querys = $("#querys").val();
    pageReqeust.pageNo = this.offset;
    pageReqeust.pageSize = this.pageNumber;
    return pageReqeust;
}
function addorg_list_click_1041(){
if('${param.ORG_ABBREVIATION}'=="兴业信托"){
   nui.alert('当前默认为兴业信托下，不能新增机构');return ;  
  } else if('${param.MARK}'=="N"){
   nui.alert('当前用户没有权限在此设立机构');return ;  
  };
	if('${param.ORG_NAME}'!='' ||'${param.ORG_ID}'!='' ||'${param.ORG_ABBREVIATION}'!='' ||'${param.ORG_COMP_ID}'!='' ||'${param.ORG_CODE}'!='' ){
		var url='/myehr/form/toForm.action?formId=1042&ORG_NAME=${param.ORG_NAME}&ORG_ID=${param.ORG_ID}&ORG_ABBREVIATION=${param.ORG_ABBREVIATION}&ORG_COMP_ID=${param.ORG_COMP_ID}&ORG_CODE=${param.ORG_CODE}&';
	}else{
		var url='/myehr/form/toForm.action?formId=1042&ORG_NAME='+ORG_NAME+'&ORG_ID='+ORG_ID+'&ORG_ABBREVIATION='+ORG_ABBREVIATION+'&ORG_COMP_ID='+ORG_COMP_ID+'&ORG_CODE='+ORG_CODE+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增机构")%>',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}
function editorg_list_click_1041(){
	var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}

	var url='/myehr/system/menu/menuedit.jsp?menuId='+select.menuId;
	
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改菜单")%>',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}
function edit1org_list_click_1041(){
if('${param.MARK}'=="N"){
   nui.alert('当前用户没有权限撤销此机构');return ;  
};
	var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=1781&isInit=true&ORG_ABBREVIATION='+select.ORG_ABBREVIATION+'&ORG_ID='+select.ORG_ID+'&';
	}else{
		var url='/myehr/form/toForm.action?formId=1781&isInit=true&ORG_ABBREVIATION='+ORG_ABBREVIATION+'&ORG_ID='+ORG_ID+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"撤销机构")%>',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}
function saveorg_list_click(){
	var columnDataRows = grid_org_list.getSelecteds();//if(columnDataRows.length==0){return;}
;
	var paramsMap = {};
;
	grid_org_list.validate();
	if(grid_org_list.isValid() == false) {
		var error = grid_org_list.getCellErrors()[0];
		grid_org_list.beginEditCell(error.record, error.column);
		return;
	}
	 var changeData = grid_org_list.getChanges();
	if(changeData==null||changeData.length==0) return;
	var  _param ={formId:_formId_org_list,datas:changeData,paramsMap:paramsMap};
	_param.buttonId=2422;
	dcf.mask();
	$.ajax({
		url:'com.dcf.form.runtime.gridformButton.saveDatas.biz.ext',
		type:'post',
		data: nui.encode(_param),
		cache: false,
		contentType: 'text/json',
		success: function (text) {
			dcf.unmask();
			if(!text.recode||text.recode[0]=='error'){
				nui.alert(text.recode[1]);
			} else {
				grid_org_list.reload();
				if(window.parent._loadmstmaindata){;
					window.parent._loadmstmaindata();
				};
;
				if("undefined" != typeof mstTab_activechanged ){
					mstTab_activechanged();
				}
				;
			}
		},
		error: function (jqXHR, textStatus, errorThrown) {
		}
	});
}
function edit2org_list_click_1041(){
if('${param.MARK}'=="N"){
   nui.alert('当前用户没有权限对此机构进行主管机构变更');return ;  
};
	var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=1845&isInit=true&ORG_NAME2='+select.ORG_NAME2+'&ORG_ABBREVIATION='+select.ORG_ABBREVIATION+'&ORG_PARENT_ID='+select.ORG_PARENT_ID+'&ORG_ID='+select.ORG_ID+'&';
	}else{
		var url='/myehr/form/toForm.action?formId=1845&isInit=true&ORG_NAME2='+ORG_NAME2+'&ORG_ABBREVIATION='+ORG_ABBREVIATION+'&ORG_PARENT_ID='+ORG_PARENT_ID+'&ORG_ID='+ORG_ID+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主管机构变更")%>',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}
function edit3org_list_click_1041(){
;
	var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=1847&isInit=true&ORG_ID='+select.ORG_ID+'&';
	}else{
		var url='/myehr/form/toForm.action?formId=1847&isInit=true&ORG_ID='+ORG_ID+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构变动历史")%>',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}
function grid_org_list_fun(pageReqeust){
	var _filterdata={};
	
	var searchValue = document.getElementById("FILTER_1041").value;
	_filterdata={searchValue:searchValue};
	var userId = '${sessionScope.userid}';
	var paramsMap = {userId:userId};
	var requestParam={};
	
	requestParam = {menuCode:'${param.menuCode}'};
	
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=_formId_1041;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_org_list_fun11(){
	$('#org_list_List').bootstrapTable('refresh');
}
/**下拉控件 */
var classes = $("select");
var parame={
    id:'',
    value:"N",
    width: "100px",
    height:"45px",
    url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
	  jsonParam:{},
    chang:function (e){
    }
};
function initDict(){
    for(var i=0;i<classes.length;i++){
        parame.id=classes[i].id;
		  var type=$(classes[i]).attr('multiSelect');
        parame.placeholder="";
        parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		  if(type=="true"){
		  	myehr_initSelectMore(parame);
		  }else{
	        myehr_initSelect(parame);
		  }
    }
}
/**初始化日期控件  */
function initDate(){
			$('.form_date1').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date2').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd hh:ii",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 0,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date3').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"hh:ii",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 0,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date4').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 4,  
			 minView: 4,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
} 
/**取url参数值  */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}
</script>
</body>
</html>
