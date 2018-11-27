<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style>
#columnListStep3>tbody>tr>td,#tableList>tbody>tr>td{padding:3px 6px;}
#columnListStep3>tbody>tr>td input,#tableList>tbody>tr>td input{border:0;}
#columnListStep3>tbody>tr>td select,#tableList>tbody>tr>td select{border:0;}
#columnListStep3 .form-control{height:20px;}
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
					    <input type="button" id="delete_list"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="deleteColumn()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					    <input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveData()"/>
					</div>
				</div>
				<table id="tableListstep3">
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
	query_tablestep3();//初始化实体
	$(".fixed-table-body").css("height","84%");
	$(".no-records-found").css("display","none");
	
})

function initTemplate(){
	//getSql();
}


function deletexx(Index,obj){
	if(Index!=0){
		$(obj).parent().parent().remove();
	}
}
function addRow(insertIndex){
	rowsNum++;
    $('#tableList').bootstrapTable('insertRow',{index:rowsNum,row:{formWhereJoinRule:"and",formWhereCpRule:"=",formWhereSort:rowsNum,formWhereNullIs:"N"}});
	addListSelect();
}

var objx;
function chooseEntity(obj){
	objx = obj;
	saveData();
	addRow();
}

function remove(obj){
	var data = {};
	data.formWhereId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/form/deleteWhereColumn.action',
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
	$.ajax({
		url:'${pageContext.request.contextPath }/form/saveWhereColumn.action?formId='+formId,
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
			table.formWhereId=$(this).find("input").eq(0).val();
			table.formWhereJoinRule=$(this).find("select").eq(0).val();
			table.formWhereLeftBracket=$(this).find("input").eq(1).val();
			table.formWhereColumnId=$(this).find("select").eq(1).val();
			table.formWhereValueType=$(this).find("select").eq(2).val();
			table.formWhereValue=$(this).find("input").eq(2).val();
			table.formWhereCpRule=$(this).find("select").eq(3).val();
			table.formWhereSort=$(this).find("input").eq(3).val();
			table.formWhereNullIs=$(this).find("select").eq(4).val();
			table.formWhereRightBracket=$(this).find("input").eq(4).val();
			
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

function deletexx(Index,obj){
	if(Index!=0){
		$(obj).parent().parent().remove();
	}
}
function addRow(insertIndex){
	rowsNum++;
    $('#tableList').bootstrapTable('insertRow',{index:rowsNum,row:{formWhereJoinRule:"and",formWhereCpRule:"=",formWhereSort:rowsNum,formWhereNullIs:"N"}});
	addListSelect();
}

var objx;
function chooseEntity(obj){
	objx = obj;
	saveData();
	addRow();
}

function remove(obj){
	var data = {};
	data.formWhereId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/form/deleteWhereColumn.action',
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
	$.ajax({
		url:'${pageContext.request.contextPath }/form/saveWhereColumn.action?formId='+formId,
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
			table.formWhereId=$(this).find("input").eq(0).val();
			table.formWhereJoinRule=$(this).find("select").eq(0).val();
			table.formWhereLeftBracket=$(this).find("input").eq(1).val();
			table.formWhereColumnId=$(this).find("select").eq(1).val();
			table.formWhereValueType=$(this).find("select").eq(2).val();
			table.formWhereValue=$(this).find("input").eq(2).val();
			table.formWhereCpRule=$(this).find("select").eq(3).val();
			table.formWhereSort=$(this).find("input").eq(3).val();
			table.formWhereNullIs=$(this).find("select").eq(4).val();
			table.formWhereRightBracket=$(this).find("input").eq(4).val();
			
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