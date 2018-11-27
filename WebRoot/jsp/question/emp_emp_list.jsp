<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/commonTable/editBootstrap.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<table id="emp_emp_list_List">
	</table>
<script>
var heightGadedata =[];
var containerParam ={};
containerParam ={};
var columns = [];
function changeHeightGadedata(data){
	heightGadedata = data;
}
$(function() {
	$.extend($.fn.bootstrapTable.defaults, $.fn.bootstrapTable.locales['zh-CN']);
	setColumns();
	querys_2131();
	loadData();
});
var ORGVORGANIZATION_ORGCODE='';
var _formId_2131='2131';
function querys_2131() {
	$("#emp_emp_list_List").bootstrapTable({
		//url :'${pageContext.request.contextPath }/form/cardformInitData.action',
		contentType: 'application/json;charset=utf-8',
		dataType:'json',
		method:'post',
		height : '700',
		undefinedText : '-',
		pagination : true,
		striped : true,
		fixedColumns: false,
		fixedNumber:4,
		queryParams : null,
		cache : false, 
		toolbar : "#toolbar",
		clickToSelect: true,
		sidePagination : "server",
		columns : columns,
		onClickRow: function (row, $element) {
			curRow = row;
		},
		onLoadSuccess: function (aa, bb, cc) {
			
		},
		onDblClickCell: function (field, value,row,td) {
			editemp_emp_list_click_2131('isView',row);  
		} ,
		responseHandler : function(res) {  
							return {  
				total : res.total,  
				rows : res.rows  
			};
		},onEditableSave: function (field, row, oldValue, $el) {
            $('#emp_emp_list_List').bootstrapTable('resetView');    
        }
	});
}
/** 刷新页面 */ 
function refresh_emp_emp_list() { 
    $('#emp_emp_list_List').bootstrapTable('refresh'); 
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

/**取url参数值  */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}
	
function setColumns(){
	columns[0] =  [{
					title : '被评人',
					field : 'column1',
					align : 'center',
					valign:'middle',
					colspan: 1,
                    rowspan: 2,
					formatter: function (value, row, index) {
						return "<h name=\"column1\" >"+value+"</h>";
					}
					},
					{
					title : '参考资料',
					field : 'column2',
					align : 'center',
					colspan: 3,
                    rowspan: 1
					},
					{
					title : '履行岗位',
					field : 'column3',
					align : 'center',
					valign:'middle',
					colspan: 1,
                    rowspan: 2,
					formatter: function (value, row, index) {
						return "<a name=\"column1\" >"+value+"</a>";
					}
					},
					{
					title : '综合素质',
					field : 'column4',
					align : 'center',
					colspan: 4,
                    rowspan: 1
					}
				 ];
	columns[1] =  [{
					title : '工作小结',
					field : 'column5',
					align : 'center',
					formatter: function (value, row, index) {
						return "<a name=\"column5\" >"+value+"</a>";
					}
					},
					{
					title : '履职一览',
					field : 'column6',
					align : 'center',
					formatter: function (value, row, index) {
						return "<a name=\"column6\" >"+value+"</a>";
					}
					},
					{
					title : '业绩对比',
					field : 'column7',
					align : 'center',
					formatter: function (value, row, index) {
						return "<a name=\"column7\" >"+value+"</a>";
					}
					},
					{
					title : '职业素养',
					field : 'column8',
					align : 'center',
					formatter: function (value, row, index) {
						return "<a name=\"column8\" >"+value+"</a>";
					}
					},
					{
					title : '专业能力',
					field : 'column9',
					align : 'center',
					formatter: function (value, row, index) {
						return "<a name=\"column9\" >"+value+"</a>";
					}
					},
					{
					title : '决策能力',
					field : 'column10',
					align : 'center',
					formatter: function (value, row, index) {
						return "<a name=\"column10\" >"+value+"</a>";
					}
					},
					{
					title : '执行能力',
					field : 'column11',
					align : 'center',
					formatter: function (value, row, index) {
						return "<a name=\"column11\" >"+value+"</a>";
					}
					}
				 ];
				 
}
	
function loadData(){
	var datas = {};
	
	var rows = [];
	for(var i=0;i<20;i++){
		rows[i]={
				column1 : "张三",
				column5 : 2,
				column3 : 3,
				column6 : 2,
				column7 : 2,
				column8 : 3,
				column9 : 3,
				column10 : 2,
				column11 : 3
				}
	}
	datas.rows = rows;
	datas.total = 20;
	$('#emp_emp_list_List').bootstrapTable('load',datas); 
	
	$("#emp_emp_list_List a").editable({
		type: "text",              //编辑框的类型。支持text|textarea|select|date|checklist等
		title: "修改",           //编辑框的标题
		disabled: false,           //是否禁用编辑
		emptytext: "空文本",       //空值的默认文本
		mode: "popup",            //编辑框的模式：支持popup和inline两种模式，默认是popup
		validate: function (value) { //字段验证
			if (!$.trim(value)) {
				return '不能为空';
			}else{
				$('#emp_emp_list_List').bootstrapTable('resetView');    
			}
		}
	});
}
</script>
</body>
</html>
