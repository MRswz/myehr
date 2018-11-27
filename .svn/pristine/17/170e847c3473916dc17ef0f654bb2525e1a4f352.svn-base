<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
		<div class="BTNGROUP BTNGROUP_4353" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="isReadCheckedGrid"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"可查看")%> onclick="isReadCheckedGrid()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="isEditCheckedGrid"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"可修改")%> onclick="isEditCheckedGrid()"/>
			</div>
		</div>
		<table id="checkedGrid_List">
		</table>
		<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
		</div>
<script>
var heightGadedata_4353 =[];
var containerParam_4353 ={};
containerParam_4353 ={};
function changeHeightGadedata_4353(data){
	heightGadedata_4353 = data;
}
$(function() {

    cardSelectInitFunction('${param.formType}');
    cardDateWidInitFunction();
    //showMoreBtn($(".BTNGROUP_4353"));
    querys_4353();
	$(".fixed-table-toolbar").css("margin-top","0px");
	$(".fixed-table-body").css("height","76%");
});
	var nodeId='';
	var columnvisible={};
	var showButtonNum = 0;

    function querys_4353() {
        $("#checkedGrid_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/checkedController/getcheckedInfo.action?modelId=${param.modelId}',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100], 
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'id',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"流程节点ID")%>',
                field : 'actNodeId',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_ACT_NODE_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"流程节点ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节点编码")%>',
                field : 'actNodeKey',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_ACT_NODE_KEY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"节点编码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"检查点编码")%>',
                field : 'checkedCode',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_CHECKED_CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"检查点编码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"检查点名")%>',
                field : 'checkedName',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_CHECKED_NAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"检查点名\">"+value+"</a>";
                }
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"业务领域")%>',
                field : 'dutyType',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_DUTY_TYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"业务领域\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=TEST_DUTY_TYPE&realValue="+value+"\"></a>";
                }
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"权限")%>',
                field : 'power',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_POWER\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"权限\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=TEST_DUTY_TYPE&realValue="+value+"\"></a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最新操作人")%>',
                field : 'operatorName',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_OPERATOR_NAME\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"最新操作人\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_78962&dataField=SYSCHECKEDANDNODERELATION_OPERATOR_NAME&realValue="+value+"\"></a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最新操作时间")%>',
                field : 'operatorTime',
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"SYSCHECKEDANDNODERELATION_OPERATOR_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"最新操作时间\">"+date+"</a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"创建时间")%>',
                field : 'createrTime',
                align : 'center',
                visible : false,
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
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"SYSCHECKEDANDNODERELATION_CREATER_TIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"创建时间\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"创建人")%>',
                field : 'createrName',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"SYSCHECKEDANDNODERELATION_CREATER_NAME\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"创建人\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=null&realValue="+value+"\"></a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#checkedGrid_List a").editable({
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
        	editcheckedGrid_click_4353('isView',row);  
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
/** 刷新页面 */ 
function refresh_checkedGrid() { 
    $('#checkedGrid_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#checkedGrid_List td").css("border","none");
    }else if(type == 1){
        $("#checkedGrid_List td").css("border-left","none");
    }else if(type == 2){
        $("#checkedGrid_List td").css("border-top","none");
    }
}
function addcheckedGrid_click_4353(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"检查点增加卡片")%>';
	if('${param.nodeId}'!='' ||'${param.nodeKey}'!='' ){
		var url='/myehr/form/toForm.action?formId=4354&nodeId=${param.nodeId}&nodeKey=${param.nodeKey}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=4354&nodeId='+nodeId+'&nodeKey='+nodeKey+'&isView='+isView+'';
	}
	layer.open({
		type: 2,
		title:title,
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_checkedGrid();
		}
	});
}
function editcheckedGrid_click_4353(){
	layer.open({ 
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"正式工卡片")%>',
		shadeClose: true,
		shade: 0.8,
		area: ['1000', '600'],
		maxmin:true,
		zIndex:layer.zIndex,
		content: '/myehr/jsp/createJsp/checkedEditCard.jsp',
		success:function(layero,index){
		layer.setTop(layero);
		$('.layui-layer-max').click();
		},
		end:function(){
			refresh_emp_a01_list();
		}
	});
}
function editcheckedGrid_click_4353(isView,data){
	var selects = $("#checkedGrid_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改检查点")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/jsp/createJsp/checkedEditCard.jsp?isInit=true&SYSCHECKEDANDNODERELATION_ID='+select.SYSCHECKEDANDNODERELATION_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/jsp/createJsp/checkedEditCard.jsp?isInit=true&SYSCHECKEDANDNODERELATION_ID='+SYSCHECKEDANDNODERELATION_ID+'&isView='+isView+'';
	}
	layer.open({
		type: 2,
		title:title,
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_checkedGrid();
		}
	});
}

	function grid_checkedGrid_HeighQuery_4353() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_checkedGrid_fun11_4353&formDefId=4353&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
