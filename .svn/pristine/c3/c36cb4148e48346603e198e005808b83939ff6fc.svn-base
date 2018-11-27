<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:10px;">
	<div>
		<div class="BTNGROUP_2220" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addPAY_COSTCENTER_LIST"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addPAY_COSTCENTER_LIST_click_2220()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editPAY_COSTCENTER_LIST"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编辑")%> onclick="editPAY_COSTCENTER_LIST_click_2220()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="deletePAY_COSTCENTER_LIST"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="deletePAY_COSTCENTER_LIST_click_2220()"/>
			</div>
		</div>
</div>
<table id="PAY_COSTCENTER_LIST_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var heightGadedata =[];
var containerParam ={};
containerParam ={};
function changeHeightGadedata(data){
	heightGadedata = data;
}
$(function() {
    querys_2220();
$(".fixed-table-toolbar").css("margin-top","0px");
$(".fixed-table-body").css("height","76%");

    initDict();
    initDate();
    console.log($(".BTNGROUP_2220>div").length);
    var DIVAMOUNT = 5;
    if($(".BTNGROUP_2220>div").length > DIVAMOUNT){
    	var len = $(".BTNGROUP_2220>div").length;
    	$(".BTNGROUP_2220>div:gt(4)").hide();
    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
    	$(".BTNGROUP_2220").append(selectObj);
    	for(var i=DIVAMOUNT;i<len;i++){
    		var liObj = $('<li style="margin-left:14px;"></li>');
    		liObj.append($(".BTNGROUP_2220>div").eq(i).clone(true));
    		selectObj.find('.dropdown-menu').append(liObj);
    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
    	}
    	selectObj.find('.dropdown-menu div').show();
    }
});
var CODE='';
	var _formId_2220='2220';
    function querys_2220() {
        $("#PAY_COSTCENTER_LIST_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            queryParams : grid_PAY_COSTCENTER_LIST_fun,
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编码")%>',
                field : 'CODE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CODE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"编码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"名称")%>',
                field : 'CNAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名")%>',
                field : 'ENAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"英文名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排名")%>',
                field : 'XORDER',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否失效")%>',
                field : 'ISDISABLED',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ISDISABLED\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"是否失效\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'REMARK',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"父节点ID")%>',
                field : 'PARENTID',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    	  return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"PARENTID\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"父节点ID\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
			onLoadSuccess: function (aa, bb, cc) {
                $("#PAY_COSTCENTER_LIST_List a").editable({
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
            	editPAY_COSTCENTER_LIST_click_2220('isView',row);   
             } ,
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
                    $('#PAY_COSTCENTER_LIST_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#PAY_COSTCENTER_LIST_List').bootstrapTable(
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
function refresh_PAY_COSTCENTER_LIST() { 
    $('#PAY_COSTCENTER_LIST_List').bootstrapTable('refresh'); 
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
function addPAY_COSTCENTER_LIST_click_2220(isView){
	if('${param.ID}'!='' ){
		var url='/myehr/form/toForm.action?formId=2223&ID=${param.ID}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2223&ID='+ID+'&isView='+isView+'';
	}
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成本中心新增")%>',
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
			    refresh_PAY_COSTCENTER_LIST();
		}
	});
}
function editPAY_COSTCENTER_LIST_click_2220(isView,data){
	var selects = $("#PAY_COSTCENTER_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
		title = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成本中心编辑")%>';
	}else if(data!=null&&isView!=null){
		select = data;
		title = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成本中心预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=2224&isInit=true&ID='+select.ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2224&isInit=true&ID='+ID+'&isView='+isView+'';
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
		$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_PAY_COSTCENTER_LIST();
		}
	});
}
function deletePAY_COSTCENTER_LIST_click_2220(){
	var selects = $("#PAY_COSTCENTER_LIST_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>');return ;
	}
	var r=confirm("确定删除选中记录？");
	if (r==true){
		var _rowvalids = [];
		for(var i=0;i<selects.length;i++) {;
			if (selects[i].ID!="") {;
				_rowvalids.push(selects[i]);
			}
		}
		var  _param ={formId:_formId_2220,params:_rowvalids};
		if("undefined" != typeof setCacadeParam ){
			setCacadeParam(_param);
		};
		$.ajax({
			url:'${pageContext.request.contextPath }/form/removeData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text!='1'){
					alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除失败")%>');
				} else {
					refresh_PAY_COSTCENTER_LIST();;
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();
					}
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
				alert(jqXHR.responseText);
			}
		});
	}else{
		return;
	}
}
var filterParam = {};
function grid_PAY_COSTCENTER_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_PAY_COSTCENTER_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.CODE}'==''){
		if(CODE==undefined){
			requestParam = {CODE:'${param.CODE}'};
		}else{
			requestParam = {CODE:CODE+""};
		}
	}else{
		requestParam = {CODE:'${param.CODE}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2220;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	return JSON.stringify(pageReqeust);
}
function grid_PAY_COSTCENTER_LIST_fun11_2220(){
	$('#PAY_COSTCENTER_LIST_List').bootstrapTable('refresh');
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
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
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
			$('.form_date5').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyymm",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 3,  
			 minView: 3,  
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
	function grid_PAY_COSTCENTER_LIST_HeighQuery_2220() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_PAY_COSTCENTER_LIST_fun11_2220&formDefId=2220&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
