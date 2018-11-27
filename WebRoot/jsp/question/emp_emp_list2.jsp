<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/commonTable/editBootstrap.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
	<div class="btn-group btn-group-sm" style="float:right">
		<input type="button" class="btn btn-default" value="暂存" onclick="save()">
		<input type="button" class="btn btn-default" value="提交" onclick="refer()">
	</div>
	<table id="emp_emp_list_List">
	</table>
<script>
var columns = [];

var objId = '${param.PERPER360OBJREG_OBJID}' ;
var templateId = '${param.PERPER360OBJREG_TEMPLATEID}' ;
var pid = '${param.PERPER360OBJREG_PID}' ;
var data = {};
data.objIds = objId.split(",");
data.pId = pid.split(",")[0];
data.templateId = templateId.split(",")[0];
$(function() {
	$.extend($.fn.bootstrapTable.defaults, $.fn.bootstrapTable.locales['zh-CN']);
	setColumns();
	querys_2131();
	//loadData();
});
var ORGVORGANIZATION_ORGCODE='';
var _formId_2131='2131';
function querys_2131() {
	$("#emp_emp_list_List").bootstrapTable({
		url :'${pageContext.request.contextPath }/question/getbatchQuestions.action',
		contentType: 'application/json;charset=utf-8',
		dataType:'json',
		method:'post',
		height : '700',
		undefinedText : '-',
		pagination : true,
		striped : true,
		fixedColumns: false,
		fixedNumber:4,
		queryParams : JSON.stringify(data),//JSON.stringify(data)
		cache : false, 
		toolbar : "#toolbar",
		clickToSelect: true,
		sidePagination : "server",
		columns : columns,
		onEditableSave: function (field, row, oldValue, $el) {
            $('#emp_emp_list_List').bootstrapTable('resetView');    
        },
		onClickRow: function (row, $element) {
			curRow = row;
			$('#emp_emp_list_List').bootstrapTable('uncheckAll');//checkBox单选
		},
		onLoadSuccess: function (aa, bb, cc) {
			var trs = $("#emp_emp_list_List tr");
			for(var i=1;i<trs.length;i++){
				var tds = trs.eq(i).find("td");
				for(var j=1;j<tds.length-1;j++){
					var value = tds.eq(j).html();
					tds.eq(j).html("<input class=\"form-control\" type=\"number\" oninput=\"countAll(this)\" weightV=\""+value+"\" value=\""+value+"\" >");
				}
			}
			
			$("#emp_emp_list_List a").editable({
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
        }, 

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
	/*
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
					formatter: function (value, row, index) {return "<input class=\"form-control\"  name=\"column1\" value='"+value+"' >";
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
					formatter: function (value, row, index) {return "<input class=\"form-control\"  name=\"column5\" value='"+value+"' >";}
					},
					{
					title : '履职一览',
					field : 'column6',
					align : 'center',
					formatter: function (value, row, index) {
						return "<input class=\"form-control\"  name=\"column6\" value='"+value+"' >";
					}
					},
					{
					title : '业绩对比',
					field : 'column7',
					align : 'center',
					formatter: function (value, row, index) {
						return "<input class=\"form-control\"  name=\"column7\" value='"+value+"' >";
					}
					},
					{
					title : '职业素养',
					field : 'column8',
					align : 'center',
					formatter: function (value, row, index) {
						return "<input class=\"form-control\"  name=\"column8\" value='"+value+"' >";
					}
					},
					{
					title : '专业能力',
					field : 'column9',
					align : 'center',
					formatter: function (value, row, index) {
						return "<input class=\"form-control\"  name=\"column9\" value='"+value+"' >";
					}
					},
					{
					title : '决策能力',
					field : 'column10',
					align : 'center',
					formatter: function (value, row, index) {
						return "<input class=\"form-control\"  name=\"column10\" value='"+value+"' >";
					}
					},
					{
					title : '执行能力',
					field : 'column11',
					align : 'center',
					formatter: function (value, row, index) {
						return "<input class=\"form-control\"  name=\"column11\" value='"+value+"' >";
					}
					}
				 ];
	*/
	$.ajax({
		url: "/myehr/question/getQuestionsColumns.action",
		type: 'POST',
		cache: false,
		async: false,
		contentType:'application/json',  
		data:JSON.stringify(data),
		success: function (datas) {
			columns = datas;
		}
	});			 
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
	//datas.total = null;
	$('#emp_emp_list_List').bootstrapTable('load',rows); 
	
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

function xx(code,value){
	var str = '<input class="form-control"  name="'+code+'" value="'+value+'" >';
	return str;
}

function save(){
	//var 
	
}

function countAll(e){
	var obj = $(e).parent().parent();
	var inputs = obj.find("input");
	var countAll = 0;
	for(var i=0 ;i<inputs.length;i++){
		var weight = inputs.eq(i).parent().parent().parent().parent().parent().parent().find(".fixed-table-header").eq(0).find("th").eq(i+1).find(".th-inner").html().split(":")[1].split(")")[0];
		countAll += parseInt(inputs.eq(i).val())*weight/100;
	}
	var tds = obj.find("td");
	tds.eq(tds.length-1).html(countAll);
	$('#emp_emp_list_List').bootstrapTable('resetView');  
}
</script>
</body>
</html>
