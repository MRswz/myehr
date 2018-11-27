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
        url : '${pageContext.request.contextPath }/button/queryParamByIntroduceId.action?introduceId='+'${param.introduceId}'+'&paramType='+'${param.paramType}', 
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
            field : 'paramId', // 字段  
            align: 'center',
            valign: 'middle',
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"paramId\" style=\"width:0px;padding:0px\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
        	}
		}, {  
            title : '参数名称',  
            field : 'paramName',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"paramName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数名称\" value=\""+value+"\"/>";
        	}
		},{
            title : '参数值来源类型',  
            field : 'paramFromType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select class=\"form-control\"  id=\"paramFromType"+index+"\" name=\"paramFromType\" DictName=\"SYS_FORM_BUTTON_ADD_PARAM_FROM\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"参数值来源类型\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '参数值来源',  
            field : 'paramFromValue',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"paramFromValue\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数值来源\" value=\""+value+"\"/>";
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

function remove(obj){
	var data = {};
	data.paramId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/button/deleteIntroduceButtonParamById.action',
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
				if(saveDate[i].paramName==saveDate[j].paramName){
					alert('参数名称重复');
					return;
				}
			}
		}
	}
	$.ajax({
		url:'${pageContext.request.contextPath }/button/saveIntroduceButtonParam.action',
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
	var paramType = '${param.paramType}';
	var paramTypeValue = ${param.introduceId};
	$("#tableList>tbody").find("tr").each(function(){

		var table = {};
		table.paramId=$(this).find("input").eq(0).val();
		table.paramName=$(this).find("input").eq(1).val();
		table.paramFromType=$(this).find("select").eq(0).val();
		table.paramFromValue=$(this).find("input").eq(2).val();
		table.paramType=paramType;
		table.paramTypeValue=paramTypeValue;
		
		data[i] = table;
		i++;
		
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
		dataField = dataField+"|"+'${param.formDefId}';
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
		dataField = dataField+"|"+'${param.formDefId}';
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