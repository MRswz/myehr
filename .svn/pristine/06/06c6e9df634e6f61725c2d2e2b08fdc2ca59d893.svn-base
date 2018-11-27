<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<html>
<head>
</head>

<body>
<div id="form" class="wizard-big">
	<div class="row">
		<div id="group" name="form_step3" class="col-sm-12" >
			<div class="container-fluid" style="">
				<div style="margin-top:5px;">
					<div style="margin:10px 0;height:100%">
						<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
							<div style="margin-right:10px;display:inline-block">
								<input type="button" id="addgroup"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRow()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
								<input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveData()"/>
							</div>
						</div>
						<table id="groupList">
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
<script>
var rowsNum = 0;
$(function() {
	Query_Group();
})
function Query_Group(){
	$("#groupList").bootstrapTable({  
	    url : '/myehr/formtemplate/getGroupList.action?templateId=${param.templateId}', 
		height:'800',
	    queryParams :'',
	    undefinedText : '-',  
	    striped : true, // 是否显示行间隔色  
	    cache : false, // 是否使用缓存  
	    clickToSelect: true,
	    pagination : false,        
	    uniqueId : "formGroupId", // 每一行的唯一标识  
	    sidePagination : "server", // 服务端处理分页  
	    columns : [ 
		{  
	        title : '操作',  
	        field : 'formGroupId', // 字段  
	        align: 'center',
	        valign: 'middle',
	        width:50,
	        formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formGroupId\" style=\"width:0px;padding:0px;border:none;\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
	        		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
	    	}
		},{  
	            title : '关联表单ID',  
	            field : 'groupTemplateId', 
	            align: 'center',
	            valign: 'middle',  
			    visible:false
	    },{
			
	        title : '分组名称',  
	        field : 'formGroupName', // 字段  
	        align: 'center',
	        valign: 'middle',
	        width:150,
	        formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formGroupName\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-title=\"分组名称\" value=\""+value+"\"/>" ;
	    	}
	    },{  
	        title : '是否展开',  
	        field : 'formGroupIsopen', // 字段  
	        align: 'center',
	        valign: 'middle',
	        width:175,
	        formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	return "<select id=\"formGroupIsopen"+index+"\" class=\"form-control\"  name=\"formGroupIsopen\" DictName=\"SYS_COMMON_YES_NO\" dataField=\"\" data-type=\"text\"  data-title=\"是否展开\" value=\""+value+"\"></selcct>" ;
	    	}
	    }, {  
	        title : '每行显示',  
	        field : 'formGroupRowCount',  
	        align : 'center',  
	        valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formGroupRowCount\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-title=\"每行显示\" value=\""+value+"\"/>" ;
	    	}
	    }, {  
	        title : '分组顺序',  
	        field : 'formGroupSort',  
	        align : 'center',  
	        valign : 'middle',  
	        width:200,
	        formatter: function (value, row, index) {
	        	if(value==undefined){
	        		value = "";
	        	}
	        	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formGroupSort\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-title=\"分组顺序\" value=\""+value+"\"/>" ;
	        	
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
		dataField = dataField+"|${param.formDefId}";
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
function addRow(insertIndex){
	rowsNum++;
    $('#groupList').bootstrapTable('insertRow',{index:rowsNum,row:{formButtonSort:rowsNum}});
	addListSelect();
}
var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
		jsonParam:{},
		chang:function (e){
			var aaa = e;
		}
}
function remove(obj){
	var data = {};
	data.formGroupId = $(obj).parent().parent().parent().find("input").eq(0).val();
	data.groupFormDefId = '${param.formDefId}';
	$.ajax({
		url:'/myehr/formtemplate/deleteFormGroup.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#groupList').bootstrapTable('refresh');
		}
	});
}

function saveData(){
	var saveDate = getEntityData();
	$.ajax({
		url:'/myehr/formtemplate/saveFormGroup.action?templateId=${param.templateId}',
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDate),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				$('#groupList').bootstrapTable('refresh');
			}
		}
	});	
}

function getEntityData(){
	var i = 0;
	var data = [];
	$("#groupList>tbody").find("tr").each(function(){
		if($(this).find("select").eq(0).val()!=""){
			var table = {};
			table.formGroupId=$(this).find("input").eq(0).val();
			table.groupTemplateId = '${param.templateId}';
			table.formGroupName=$(this).find("input").eq(1).val();
			table.formGroupRowCount=$(this).find("input").eq(2).val();
			table.formGroupSort=$(this).find("input").eq(3).val();
			table.formGroupIsopen=$(this).find("select").eq(0).val();
			data[i] = table;
			i++;
		}
	})
	return data;
}
</script>
</html>