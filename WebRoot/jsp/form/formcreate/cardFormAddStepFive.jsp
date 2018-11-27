<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
#columnList>tbody>tr>td,#tableList>tbody>tr>td{padding:3px 6px;}
#columnList>tbody>tr>td input,#tableList>tbody>tr>td input{border:0;}
#columnList>tbody>tr>td select,#tableList>tbody>tr>td select{border:0;}
#columnList .form-control{height:20px;}
.row.cell>div{margin:5px 0;min-height:0;}
</style>
<link rel="stylesheet" href="bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<script type="text/javascript" src="bootstrap2/bootstrap-switch.min.js"></script></head>
<body>
<div class="" style="width:100%;height:100%;background-color:#f6f6f6">
	<div style="width:98%;height:98%;margin:0 auto;padding-top:10px">
		<div class="form-control" style="width:100%;height:100%;border:0">		
			<div class="" style="height:100%;overflow-y:hidden;padding:10px 0;">
				<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
					<div style="margin-right:10px;display:inline-block">
					    <input type="button" id="addColumn"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRow()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					    <input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveData()"/>
					</div>
				</div>
				<table id="tableList">
				</table>
			</div>
		</div>
		<div style="width:100%;height:2%;float:left">
		</div>
	</div>
		
</div>
    
<script>
var formId = ${param.formDefId};
var numRow=0;	
var num=0;	
var xxx="";
var checked1 = "";
var checked2 = "";
var checked3 = "";
var checked4 = "";
var rowsNum=0;
$(function() {
	//初始化模板
	initTemplate();
	query_table();//初始化实体
	$(".fixed-table-body").css("height","84%");
	$(".no-records-found").css("display","none");
	
})

function initTemplate(){
	//getSql();
}

function query_table() {   
    $("#tableList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/queryFormButton.action?formId='+formId, 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
            title : '操作',  
            field : 'formButtonId', // 字段  
            align: 'center',
            valign: 'middle',
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formButtonId\" style=\"width:0px;padding:0px\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-edit\" style=\"position: absolute;opacity: 0.5;right: 25px;top: 5px;cursor: pointer;\" onclick=\"editButton(this)\"></i>"+
						"<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
        	}
		},{
            title : '按钮类型名称',  
            field : 'formButtonType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select class=\"form-control\"  id=\"formButtonType"+index+"\" name=\"formButtonType\" DictName=\"SYS_FORM_BUTTON_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"按钮类型名称\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '按钮显示名称',  
            field : 'formButtonName',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮显示名称\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮编码',  
            field : 'formButtonCode',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮编码\" value=\""+value+"\"/>";
        	}
        }, {  
            title : '按钮显示顺序',  
            field : 'formButtonSort',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮显示顺序\" value=\""+value+"\"/>";
        	}
		 }, {  
            title : '后置触发',  
            field : 'HZESQL',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"HZESQL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"后置触发\" value=\""+value+"\"/>";
        	}
        }, {  
            title : '自定义图标',  
            field : 'formButtonIcon',  
            align : 'center',  
            valign : 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formButtonIcon\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"自定义图标\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '按钮宽度',  
            field : 'formButtonWidth',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonWidth\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮宽度\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮高度',  
            field : 'formButtonHeight',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonHeight\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮高度\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮样式',  
            field : 'formButtonCss',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCss\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮样式\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '警告框提示内容',  
            field : 'formButtonWarningInfo',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonWarningInfo\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"警告框提示内容\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '前置脚本方案',  
            field : 'formButtonCheckFun',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCheckFun\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"前置脚本方案\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '前置触发',  
            field : 'QZESQL',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"QZESQL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"前置触发\" value=\""+value+"\"/>";
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelect();
	            },
	            data:[],       
        responseHandler : function(res) { 
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function addRow(){ 
    var strAppend = '<tr data-index="'+num+'">'+
	    '<td style="text-align: center;padding:6px 10px; vertical-align: left;width:125;color:blue ">'+
		'	<span class="glyphicon glyphicon-plus" onclick="addRow()"></span>'+
		'	<span id="new'+num+'" class="glyphicon glyphicon-trash" onclick="deletexx(this)"></span> '+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:250 ">'+
		'	<input type="text" class="form-control" id="formWhereValue">'+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:125 ">'+
		'	<input type="text" class="form-control" id="formWhereValue">'+
		'</td>'+
		'<td style="text-align: center; vertical-align: left;width:250 ">'+
		'	<input type="text" class="form-control" id="formWhereValue">'+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:125 ">'+
		'	<select id="formWhereCpRule" class="form-control">'+
		'		<option value ="="> = </option>'+
	    '		<option value ="!="> != </option>'+
		'	</select>'+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:375 ">'+
		'	<input type="text" class="form-control"  id="formWhereValue">'+
		'</td>'+
		'<td style="text-align: center;padding:6px 10px; vertical-align: left;width:125 ">'+
		'	<input type="text" class="form-control"  id="formWhereValue">'+
		'</td>'+
		
		'</tr>';
    num++;
    $("#tableList tbody").append(strAppend);       
}

function deletexx(Index,obj){
	if(Index!=0){
		$(obj).parent().parent().remove();
	}
}
function addRow(insertIndex){
	rowsNum++;
    $('#tableList').bootstrapTable('insertRow',{index:rowsNum,row:{formButtonSort:rowsNum}});
	addListSelect();
}

var objx;
function chooseEntity(obj){
	objx = obj;
	saveData();
	addRow();
}


function editButton(obj){
	var selects = $("#tableList").bootstrapTable("getSelections");
	var formButtonId = $(obj).parent().parent().parent().find("input").eq(0).val();
	var formButtonType = $(obj).parent().parent().parent().find("select").eq(0).val();
	var url;
	var title;
	if(formButtonType=="add"){
		url='/myehr/jsp/form/formcreate/button/addbutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【新增】按钮扩张属性';
	}else if(formButtonType=="edit"){
		url='/myehr/jsp/form/formcreate/button/updatebutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【修改】按钮扩张属性';
	}else if(formButtonType=="remove"){
		url='/myehr/jsp/form/formcreate/button/removebutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【删除】按钮扩张属性';
	}else if(formButtonType=="save"){
		url='/myehr/jsp/form/formcreate/button/savebutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【保存】按钮扩张属性';
	}else if(formButtonType=="close"){
		url='/myehr/jsp/form/formcreate/button/savebutton_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
	}else if(formButtonType=="calculate"){
		url='/myehr/jsp/form/formcreate/button/calculate_form.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【计算】按钮扩张属性';
	}else if(formButtonType=="import"){
		url='/myehr/jsp/form/formcreate/button/importButton.jsp?formButtonId='+formButtonId+'&formId='+'${param.formDefId}';
		title='设置【导入】按钮扩张属性';
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
		}
	});
}

function remove(obj){
	var data = {};
	data.formButtonId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/form/deleteFormButton.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#tableList').bootstrapTable('refresh');
		}
	});
}

//将对象元素转换成字符串以作比较  
function obj2key(obj, keys){  
    var n = keys.length,  
        key = [];  
    while(n--){  
        key.push(obj[keys[n]]);  
    }  
    return key.join('|');  
}

function saveData(){
	var saveDate = getEntityData();
	for(var i=0;i<saveDate.length;i++){
		for(var j=0;j<saveDate.length;j++){
			if(i==j){
				continue;
			}else{
				if(saveDate[i].formButtonCode==saveDate[j].formButtonCode){
					alert('按钮编码重复');
					return;
				}
			}
		}
	}
	$.ajax({
		url:'${pageContext.request.contextPath }/form/saveFormButton.action?formId='+formId,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDate),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				$('#tableList').bootstrapTable('refresh');
			}
		}
	});
	
}

function getEntityData(){
	var i = 0;
	var data = [];
	$("#tableList>tbody").find("tr").each(function(){
		if($(this).find("select").eq(0).val()!=""){
			var table = {};
			table.formButtonId=$(this).find("input").eq(0).val();
			table.formButtonType=$(this).find("select").eq(0).val();
			table.formButtonName=$(this).find("input").eq(1).val();
			table.formButtonCode=$(this).find("input").eq(2).val();
			table.formButtonSort=$(this).find("input").eq(3).val();
			table.formButtonIcon=$(this).find("input").eq(5).val();
			table.formButtonWidth=$(this).find("input").eq(6).val();
			table.formButtonHeight=$(this).find("input").eq(7).val();
			table.formButtonCss=$(this).find("input").eq(8).val();
			table.formButtonWarningInfo=$(this).find("input").eq(9).val();
			table.formButtonCheckFun=$(this).find("input").eq(10).val();
			
			data[i] = table;
			i++;
		}
	})
	return data;
}

function addListSelect(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+${param.formDefId};
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
}

var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
		jsonParam:{},
		formType:'',
		chang:function (e){
			var aaa = e;
		}
};
window.onload=function(){
	var containerParam={};
	var classes = [];
		if(''=='APP'){
			$("input").each(function(){
				if($(this).attr('dataField') != undefined){
					classes.push($(this)[0]);
				}
			})
		}else{
			classes = $("select");
		}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+${param.formDefId};
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}

}

</script>
</body>
</html>