var heightGadedata_3417 =[];
var containerParam_3417 ={};
containerParam_3417 ={};
var XTYPE='';
function changeHeightGadedata_3417(data){
	heightGadedata_3417 = data;
}
$(function() {
    querys_3417();
    querys_3417_1();
	$(".fixed-table-toolbar").css("margin-top","0px");
	$(".fixed-table-body").css("height","76%");

    cardSelectInitFunction(code15);
    cardDateWidInitFunction();
    showMoreBtn($(".BTNGROUP_3417"));
});

var dragJob=false;
$(document).on("mousedown", '#moveBar', function (e) {
    dragJob = true;
});
document.onmousemove = function (e) {
	if (dragJob) {
	    var e = e || window.event;
	    var height = $(document.body).height();
	    var width = $(window).width();
	    var widthJob = $("#moveDiv").width();
	    var heightJob = $("#moveDiv").height();
	    var left = e.clientX - widthJob / 2;
	    var top = e.clientY - 18 + $(document).scrollTop();
	    if (top >= 0 && top < height - heightJob) {
	        $("#moveDiv").css("top", top);
	    }
	    if (left >= 0 && left < width - widthJob) {
	        $("#moveDiv").css("left", left);
	    }
	    return false;
	}
};
$(document).mouseup(function (e) {
	dragJob = false;
});

	var _formId_3417='3417';
    

/** 刷新页面 */ 
function refresh_SYS_QUESTIONS_choose() { 
    $('#SYS_QUESTIONS_choose_List').bootstrapTable('refresh'); 
}
var filterParam = {};
var queryParams;
function grid_SYS_QUESTIONS_choose_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_SYS_QUESTIONS_choose_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if(XTYPE_PARAM==''){
		if(XTYPE==undefined){
			requestParam = {XTYPE:XTYPE_PARAM};
		}else{
			requestParam = {XTYPE:XTYPE+""};
		}
	}else{
		requestParam = {XTYPE:XTYPE_PARAM};
	}
	pageReqeust.containerParam=containerParam_3417;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=code16;
	pageReqeust.formId=_formId_3417;
	pageReqeust.isView=null;
	if(heightGadedata_3417!=null&&heightGadedata_3417!=undefined){
		pageReqeust.heightGrade = heightGadedata_3417;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_SYS_QUESTIONS_choose_fun11_3417(){
	$('#SYS_QUESTIONS_choose_List').bootstrapTable('refresh');
}
function grid_SYS_QUESTIONS_choose_HeighQuery_3417() {
	layer.open({
		type: 2,
		showMaxButton: true,
		title:code13 ,
		area: ['855', '500'],
		maxmin: true,
		content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_SYS_QUESTIONS_choose_fun11_3417&formDefId=3417&formDefLayout=2',
		success:function(layero,index){
			},
			end:function(){
		}
		});
}
function querys_3417() {
        $("#SYS_QUESTIONS_choose_List").bootstrapTable({
            url :'/myehr/question/cardformInitData.action?templateId='+templateId,
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            undefinedText : '-',
            pagination : false,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_SYS_QUESTIONS_choose_fun,
            cache : false,
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [
            {
                field : 'state',
                checkbox : true,
                align : 'center',
                visible : true,
                valign : 'middle'
            },
            {
                title : code1,
                field : 'defaultXH',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value=index+1;
                    }
                    return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
  {
                title : code2,
                field : 'SYSQUESTION_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : code3,
                field : 'SYSQUESTION_CODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"题目编码\">"+value+"</a>";
                }
            },
  {
                title : code4,
                field : 'SYSQUESTION_CNAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"题目中文名\">"+value+"</a>";
                }
            },
  {
                title : code5,
                field : 'SYSQUESTION_ENAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"题目英文名\">"+value+"</a>";
                }
            },
            {
                title : code6,
                field : 'SYSQUESTION_GROUPID',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_GROUPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"题目分类\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_QUESTION&realValue="+value+"+\"></a>";
                }
            },

            {
                title : code7,
                field : 'SYSQUESTION_XTYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_XTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"题型\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=QUESTIONTYPE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : code8,
                field : 'SYSQUESTION_DESCRIBE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_DESCRIBE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"题目描述\">"+value+"</a>";
                }
            },
  {
                title : code9,
                field : 'SYSQUESTION_AMOUNT',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_AMOUNT\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"分值\">"+value+"</a>";
                }
            },
  {
                title : code10,
                field : 'SYSQUESTION_REMARK',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"标识\">"+value+"</a>";
                }
            },
  {
                title : code11,
                field : 'SYSQUESTION_OPERATOR_NAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_OPERATOR_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作人\">"+value+"</a>";
                }
            },
            {
                title : code12,
                field : 'SYSQUESTION_OPERATOR_TIME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"SYSQUESTION_OPERATOR_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">"+date+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
            onCheck: function (row, $element) {
                loadChooseList();
            },
            onUncheck: function (row, $element) {
                loadChooseList();
            },
            onLoadSuccess: function (aa, bb, cc) {
                $("#SYS_QUESTIONS_choose_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
            onDblClickCell: function (field, value,row,td) {
            	//editSYS_QUESTIONS_choose_click_3417('isView',row);  
            } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
    };
}

function querys_3417_1() {
    $("#SYS_QUESTIONS_choose_List1").bootstrapTable({
        height : 500,
        undefinedText : '-',
        pagination : false,
        striped : true,
        fixedColumns: false,
        pagination : true,
        fixedNumber:4,
        cache : false,
        toolbar : "#toolbar",
        columns : [
        {
            field : 'state',
            checkbox : true,
            align : 'center',
            visible : false
        },
        {
            title : code1,
            field : 'defaultXH',
            align : 'center',
            visible : false
        },
        {
            title : code2,
            field : 'SYSQUESTION_ID',
            align : 'center',
            visible : false
        },
        {
            title : code3,
            field : 'SYSQUESTION_CODE',
            align : 'center',
            visible : false
        },
        {
            title : code4,
            field : 'SYSQUESTION_CNAME',
            align : 'center',
            visible : true,
            valign : 'left',
            formatter: function (value, row, index) {
                if(value==undefined){
                    value='-';
                }
               return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSQUESTION_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"题目中文名\">"+value+"</a>";
            }
        },
        {
            title : code5,
            field : 'SYSQUESTION_ENAME',
            align : 'center',
            visible : false
        },
        {
            title : code6,
            field : 'SYSQUESTION_GROUPID',
            align : 'center',
            visible : false
        },

        {
            title : code7,
            field : 'SYSQUESTION_XTYPE',
            align : 'center',
            visible : false
        },

        {
            title : code8,
            field : 'SYSQUESTION_DESCRIBE',
            align : 'center',
            visible : false
        },
        {
            title : code9,
            field : 'SYSQUESTION_AMOUNT',
            align : 'center',
            visible : false
        },
        {
            title : code10,
            field : 'SYSQUESTION_REMARK',
            align : 'center',
            visible : false
        },
        {
            title : code11,
            field : 'SYSQUESTION_OPERATOR_NAME',
            align : 'center',
            visible : false
        },
        {
            title : code12,
            field : 'SYSQUESTION_OPERATOR_TIME',
            align : 'center',
            visible : false
        },
        ],
        onClickRow: function (row, $element) {
            curRow = row;
        },
        onLoadSuccess: function (aa, bb, cc) {
            $("#SYS_QUESTIONS_choose_List1 a").editable({
                disabled: true,
                emptytext: "-",
                url: function (params) {
                    var sName = $(this).attr("name");
                    curRow[sName] = params.value;
                },
                type: 'text'
            });
        },
        onDblClickCell: function (field, value,row,td) {
        	editSYS_QUESTIONS_choose_click_3417('isView',row);  
        } ,
        responseHandler : function(res) {  
                            return {  
                total : res.total,  
                rows : res.rows  
            };
        }
    });
    window.operateEvents = {  
    };
}

function loadChooseList(){
	var objs = $("#SYS_QUESTIONS_choose_List").bootstrapTable("getSelections");
	$("#SYS_QUESTIONS_choose_List1").bootstrapTable('load',objs);
	/*if(objs.length==1){
		layer.msg('是否保存当前选中', {
			  time: 0 //不自动关闭
			  ,btn: ['确定', '再想想']
			  ,success: function(layero){
					layero.find('.layui-layer-btn').css('text-align', 'center');
				}
			  ,yes: function(index){
			    layer.close(index);
				$("#SYS_QUESTIONS_choose_List1").bootstrapTable('load',objs);
			  }
			});
	}else{
		$("#SYS_QUESTIONS_choose_List1").bootstrapTable('load',objs);
	}*/
}

function saveChooseQuestions(){
	var objs = $("#SYS_QUESTIONS_choose_List").bootstrapTable("getSelections");
	$.ajax({  
		type: 'POST', 
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		data: JSON.stringify(objs),  
		url: '/myehr/question/saveChooseQuestions.action?templateId='+templateId,
		success: function (data) { 
			if(data=='true'){
				layer.alert('保存成功', {
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
				//刷新父页面列表
					window.parent.refresh();
				//刷新弹出页面
					refresh();
			}else{
				
			}
			
		}
	});
}

function refresh(){
	$("#SYS_QUESTIONS_choose_List").bootstrapTable("refresh");
	$("#SYS_QUESTIONS_choose_List1").bootstrapTable("removeAll");
}