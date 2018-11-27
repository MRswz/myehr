<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:5px;">
		<div class="BTNGROUP BTNGROUP_3445" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="selectsys_user"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%> onclick="selectsys_user_click_3445()"/>
			</div>
		</div>
<table id="sys_user_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var heightGadedata_3445 =[];
var containerParam_3445 ={};
containerParam_3445 ={};
function changeHeightGadedata_3445(data){
	heightGadedata_3445 = data;
}
$(function() {
    querys_3445();
$(".fixed-table-toolbar").css("margin-top","0px");
$(".fixed-table-body").css("height","76%");

    cardSelectInitFunction('${param.formType}');
    cardDateWidInitFunction();
    showMoreBtn($(".BTNGROUP_3445"));
});
	var _formId_3445='3445';
var columnvisible={};
function initRoleColumn(){
    var url = '${pageContext.request.contextPath }/form/queryCardFormColumnsWithUserId.action?formId=3445';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].formColumnUsName==1){
                    var entityTablename = datas[i].formEntityTablename;
                    var fieldTablename = datas[i].formFieldTablename;
                    var columnName=entityTablename.replace('_','')+'_'+fieldTablename;
                    columnvisible[columnName]=true;
                }else{
                    var entityTablename = datas[i].formEntityTablename;
                    var fieldTablename = datas[i].formFieldTablename;
                    var columnName=entityTablename.replace('_','')+'_'+fieldTablename;
                    columnvisible[columnName]=false;
                }
            }
        }
    });
}
function initRoleButtons(){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId=3445';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                var obj = $("#"+datas[i].formButtonCode+"sys_user");
                obj[0].parentNode.remove();
            }
        }
    });
}
    function querys_3445() {
        initRoleColumn();
        initRoleButtons();
        $("#sys_user_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_sys_user_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"人员ID")%>',
                field : 'SYSUSER_EMP_ID',
                align : 'center',
                visible : columnvisible.SYSUSER_EMP_ID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_EMP_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"人员ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用户ID")%>',
                field : 'SYSUSER_USER_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"用户ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用户编码")%>',
                field : 'SYSUSER_USER_CODE',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_CODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"用户编码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用户密码")%>',
                field : 'SYSUSER_USER_PASSWORD',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_PASSWORD,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_PASSWORD\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"用户密码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用户电话")%>',
                field : 'SYSUSER_USER_TALEPHONE',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_TALEPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_TALEPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"用户电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用户邮箱")%>',
                field : 'SYSUSER_USER_EMAIL',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_EMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_EMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"用户邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用户状态")%>',
                field : 'SYSUSER_USER_STATUS',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_STATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_STATUS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"用户状态\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用户名称")%>',
                field : 'SYSUSER_USER_NAME',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_NAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"用户名称\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效时间")%>',
                field : 'SYSUSER_USER_TIME_START',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_TIME_START,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_TIME_START\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效时间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"失效时间")%>',
                field : 'SYSUSER_USER_TIME_END',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_TIME_END,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_TIME_END\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"失效时间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用户菜单或界面风格")%>',
                field : 'SYSUSER_USER_STYLE',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_STYLE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_STYLE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"用户菜单或界面风格\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作者")%>',
                field : 'SYSUSER_OPERATOR_NAME',
                align : 'center',
                visible : columnvisible.SYSUSER_OPERATOR_NAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_OPERATOR_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"操作者\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作时间")%>',
                field : 'SYSUSER_OPERATOR_TIME',
                align : 'center',
                visible : columnvisible.SYSUSER_OPERATOR_TIME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_OPERATOR_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"操作时间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最后登录时间")%>',
                field : 'SYSUSER_USER_LASTLOGIN',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_LASTLOGIN,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_LASTLOGIN\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"最后登录时间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登录错误次数")%>',
                field : 'SYSUSER_USER_ERRCOUNT',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_ERRCOUNT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_ERRCOUNT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"登录错误次数\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"审批者")%>',
                field : 'SYSUSER_APPROVE_NAME',
                align : 'center',
                visible : columnvisible.SYSUSER_APPROVE_NAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_APPROVE_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"审批者\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"审批时间")%>',
                field : 'SYSUSER_APPROVE_TIME',
                align : 'center',
                visible : columnvisible.SYSUSER_APPROVE_TIME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_APPROVE_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"审批时间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"IP地址")%>',
                field : 'SYSUSER_USER_IPADDRESS',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_IPADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_IPADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"IP地址\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'SYSUSER_USER_REMARK',
                align : 'center',
                visible : columnvisible.SYSUSER_USER_REMARK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_USER_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标示")%>',
                field : 'SYSUSER_DELETE_MARK',
                align : 'center',
                visible : columnvisible.SYSUSER_DELETE_MARK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSUSER_DELETE_MARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"删除标示\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#sys_user_List a").editable({
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
        	editsys_user_click_3445('isView',row);  
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
//选中按钮使用的click方法 （自定生成）
function selectsys_user_click_3445(){
	var selectGrid = $("#sys_user_List").bootstrapTable('getSelections');;
	var parentId = '${param.fatherId}';
	var intrToId = '${param.intrToId}';
	var intrButtonId = '${param.intrButtonId}';
	var idField = '${param.idField}';
	var textField = '${param.textField}';
	if(intrToId==''&&intrButtonId==''){
	if(selectGrid!=null&&selectGrid.length>0){
		parent.document.getElementById(parentId).value=selectGrid[0][idField];
		parent.document.getElementById(parentId+'_name').value=selectGrid[0][textField];
		var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		parent.layer.close(index); //执行关闭
	}else {
	alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');
	}
	}else{
		gridIntroduce(selectGrid);
	}
}
function gridIntroduce(selectGrid){
	var introduceParam = {};  
	//var creatParam = {};  
	introduceParam.columns = selectGrid;  
		var creatParams ;
		var creatParam={} ;
		var requestParams ;
		var requestParam={} ;
		$.ajax({
				url:'/myehr/button/getCreateParamById.action?intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}',
				type:'post',
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (data) {
					if(data!=null){
						creatParams = data;
					}else{
						creatParams = null;
					}
				}
			});
			
		$.ajax({
			url:'/myehr/button/getRequestParamById.action?intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}',
			type:'post',
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (data) {
				if(data!=null){
					requestParams = data;
				}else{
					requestParams = null;
				}
			}
		});
	if(requestParams!=null){
		for(var i = 0 ;i<requestParams.length;i++){
			requestParam[requestParams[i]] = getUrlParam(requestParams[i]);
		}
		introduceParam.requestParam = requestParam;
	}
		
	if(creatParams==null){
		return null;
	}else{
		var content = "";
		content +=  "<div id='createParam' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n";
		//循环
		for(var i = 0 ;i<creatParams.length;i++){
			content +=	"	<div id='param1' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
				"		<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
				"			<lable style='float:left;font-size:12px'>"+creatParams[i]+"</lable>\n"+
				"			<input id='"+creatParams[i]+"' type=\"text\" class='form-control ' style='float:left;width:60%;'/>\n"+
				"		</div>\n"+
				"	</div>\n";
				}
			content +=	"</div>\n";
				if(creatParams.length>0){
			layer.open({
				title:'自定义编辑',
				shadeClose: true,
				zIndex:9999,
				content: content,
				area: ['600px', '670px'],
				btn: ['保存', '取消'],
				success: function(layero, index){
				},
				yes: function(index, layero){
					//循环
					for(var i = 0 ;i<creatParams.length;i++){
						creatParam[creatParams[i]] = $("#"+creatParams[i]).val();
					}
	introduceParam.creatParam = creatParam;	  
	$.ajax({  
		type: 'POST', 
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		data: JSON.stringify(introduceParam),  
		url: '${pageContext.request.contextPath }/button/saveIntroduceGrid.action?formId=${param.formId}&intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}',
		success: function (data) {  
		if(data[0]==0){
		layer.alert('引入成功', {
			  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
			}else{
		layer.alert('引入失败', {
			  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
			}
		}
	});
					layer.close(index);
				},
				btn2: function(index, layero){
				}
			});
				}else{
	$.ajax({  
		type: 'POST', 
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		data: JSON.stringify(introduceParam),  
		url: '${pageContext.request.contextPath }/button/saveIntroduceGrid.action?formId=${param.formId}&intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}',
		success: function (data) {  
		if(data[0]==0){
		layer.alert('引入成功', {
			  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
			}else{
		layer.alert('引入失败', {
			  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
			}
		}
	});
				}
		}
	}
/** 刷新页面 */ 
function refresh_sys_user() { 
    $('#sys_user_List').bootstrapTable('refresh'); 
}
var filterParam = {};
var queryParams;
function grid_sys_user_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_sys_user_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3445;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3445;
	pageReqeust.isView=null;
	if(heightGadedata_3445!=null&&heightGadedata_3445!=undefined){
		pageReqeust.heightGrade = heightGadedata_3445;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_sys_user_fun11_3445(){
	$('#sys_user_List').bootstrapTable('refresh');
}
	function grid_sys_user_HeighQuery_3445() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_sys_user_fun11_3445&formDefId=3445&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
	
	function getUrlParam(key){
    	// 获取参数
	    var url = window.location.search;
	    // 正则筛选地址栏
	    var reg = new RegExp("(^|&)"+ key +"=([^&]*)(&|$)");
	    // 匹配目标参数
	    var result = url.substr(1).match(reg);
	    //返回参数值
	    return result ? decodeURIComponent(result[2]) : null;
	}
</script>
</body>
</html>
