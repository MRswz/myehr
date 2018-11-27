<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="../bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<script type="text/javascript" src="../bootstrap2/bootstrap-switch.min.js"></script>
<style type="text/css">
.switch{float:left;display:none}
select{float:left;margin-right:5px}
.row.cell {margin-bottom:20px}
.widget{padding:20px 40px}
.row{margin-left:-15px}
#row span{width:100%;display:inline-block;white-space: nowrap;overflow:hidden}
</style>
</head>
<body>
<div class="container-fluid" style="width:100%;height:100%;padding:1% 0">
	<div class="form-control" style="width:75%;height:48%;margin:auto auto;">
		<div id="showCard"  style="width:99%;height:93%;margin:auto auto;overflow:auto">
			<div class="wrapper wrapper-content animated fadeInRight" style="height:100%">
				<div class="row" style="margin-left:0;height:100%;" id="GridByCard">
				</div>
			</div>
		</div>
	</div>
	<div  style="width:75%;height:4%;margin:auto auto;">
		<div class="BTNGROUP BTNGROUP_1042" style="margin:5px auto; display:inline-block;height: 30px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="yulan"  class="btn btn-primary" value=预览 onclick="yulan()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save"  class="btn btn-success" value=保存 onclick="save()"/>
			</div>
		</div>
	</div>
	
	<div id="valueContent" class="form-control" style="width:75%;height:103%;margin:auto auto;position:relative;overflow:auto">
		<div class="row cell" id="divSize">
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">高屏显示列数: </lable>
					<input id="large" name="" type="text" class="form-control"  style="width:220px;"/>
					<input id="divSize_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">中屏显示列数: </lable>
					<input id="middle" name="" type="text" class="form-control"  style="width:220px;"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">低屏显示列数: </lable>
					<input id="small" name="" type="text" class="form-control"  style="width:220px;" />
				</div>
			</div>
			<!-- 
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">卡片背景色1: </lable>
					<input id="divSize_fontColor1" name="fontColor1" type="color" class="form-control"  style="width:150px;" value="#578ebe"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">卡片背景色2: </lable>
					<input id="divSize_fontColor2" name="fontColor2" type="color" class="form-control"  style="width:150px;" value="#e35b5a"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">卡片背景色3: </lable>
					<input id="divSize_fontColor3" name="fontColor3" type="color" class="form-control"  style="width:150px;" value="#44b6ae"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">卡片背景色4: </lable>
					<input id="divSize_fontColor4" name="fontColor4" type="color" class="form-control"  style="width:150px;" value="#8775a7"/>
				</div>
			</div>
			 -->
		</div>
		
		<div class="row cell" id="right1">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">右一元素: </lable>
					<select id="right1_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="right1_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">链接: </lable>
					<input id="right1_linkMark" name="linkMark" type="text" class="form-control"  style="width:220px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="right1_fontSize" name="fontSize" type="number" class="form-control"  style="width:220px;float:left" value="12"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="left_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:220px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="right1_fontColor" name="fontColor" type="color" class="form-control"  style="width:220px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
		<div class="row cell" id="right2">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">右二元素: </lable>
					<select id="right2_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="right2_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">链接: </lable>
					<input id="right2_linkMark" name="linkMark" type="text" class="form-control"  style="width:220px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="right2_fontSize" name="fontSize" type="number" class="form-control"  style="width:220px;float:left" value="12"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="left_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:220px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="right2_fontColor" name="fontColor" type="color" class="form-control"  style="width:220px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
		<div class="row cell" id="right3">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">右三元素: </lable>
					<select id="right3_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="right3_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">链接: </lable>
					<input id="right3_linkMark" name="linkMark" type="text" class="form-control"  style="width:220px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="right3_fontSize" name="fontSize" type="number" class="form-control"  style="width:220px;float:left" value="12"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="right3_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:220px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="right3_fontColor" name="fontColor" type="color" class="form-control"  style="width:220px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
		<div class="row cell" id="right4">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">右四元素: </lable>
					<select id="right4_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="right4_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">链接: </lable>
					<input id="right4_linkMark" name="linkMark" type="text" class="form-control"  style="width:220px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="right4_fontSize" name="fontSize" type="number" class="form-control"  style="width:220px;float:left" value="12"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="left_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:220px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="right4_fontColor" name="fontColor" type="color" class="form-control"  style="width:220px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
		<div class="row cell" id="left">
			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="float:left">
					<lable style="float:left;font-size:12px">图标元素: </lable>
					<!-- 
					<select id="left_columnValue"  styleType="select" name="columnValue"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_LEVEL" nullItemText="请选择..." dataField="dict_form_3877"initParam = "_">
					</select>
					 -->
					<input id="left_columnValue" name="columnValue" type="text" class="form-control"  style="width:220px;float:left" value="fa fa-thumbs-o-up"/>
					<input id="left_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="left_fontSize" name="fontSize" type="number" class="form-control"  style="width:220px;float:left" value="80"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="left_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:220px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="left_fontColor" name="fontColor" type="color" class="form-control"  style="width:220px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
	</div>
</div>
<script>
//根据表单ID获取字段信息做下拉项
$(function () { 
	initSelect();
	initData();
})

function initSelect(){
	var data;
	var formDefId = "${param.formDefId}";
	$.ajax({  
        url: '/myehr/formtemplate/getSelect.action?formDefId='+formDefId,  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    dataType:"json",    //服务器返回数据是什么类型  
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	data = result;
	    }  
    });
	$("select").each(function(){
		for(var i=0;i<data.length;i++){
			document.getElementById(this.id).options.add(new Option(data[i].text,data[i].id));		
		}
	});
	
}

function yulan(){
	var sList = [];
	var rows = $("#valueContent .row.cell");
	for(var i=0;i<rows.length;i++){
		var sysGridbycardTemplateColumn={};
		if(rows[i].id=='divSize'){
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$("#large").val()+','+$("#middle").val()+','+$("#small").val();
			/*
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
			sysGridbycardTemplateColumn.templateColumnFontColor1=$(rows[i]).find('input[name="fontColor1"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor2=$(rows[i]).find('input[name="fontColor1"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor3=$(rows[i]).find('input[name="fontColor1"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor4=$(rows[i]).find('input[name="fontColor1"]').val();
			*/
		}else if(rows[i].id=='left'){
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$(rows[i]).find('input[name="columnValue"]').val();
			sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysGridbycardTemplateColumn.templateColumnFontWeight=$(rows[i]).find('input[name="fontWeight"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else{
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$(rows[i]).find('select[name="columnValue"]').val();
			sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysGridbycardTemplateColumn.templateColumnFontWeight=$(rows[i]).find('input[name="fontWeight"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}
		sList[i]=sysGridbycardTemplateColumn;
	}
	
	var right1 = sList[1].templateColumnValue;
	var right1s = "";
	
	var right2 = sList[2].templateColumnValue;
	var right2s = "";
	
	var right3 = sList[3].templateColumnValue;
	var right3s = "";
	
	var right4 = sList[4].templateColumnValue;
	var right4s = "";
	
	
	var left = sList[5].templateColumnValue;
	
	var model ="";
	var large = 12/sList[0].templateColumnValue.split(",")[0];
	var middle = 12/sList[0].templateColumnValue.split(",")[1];
	var small = 12/sList[0].templateColumnValue.split(",")[2];
	
	//(b == 5) ? a="true" : a="false";
	var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
	for(var i = 0 ;i<4;i++){
		 colorNum = i%4;
		 if(sList[5].templateColumnValue!=null&&sList[5].templateColumnValue!=''){
			 model+='<div class="col-md-'+middle+' col-sm-'+small+' col-lg-'+large+'">'+
					'    <div class="widget style1 navy-bg" style=\"background-color:'+colors[colorNum]+'\">'+
					'        <div class=\"row\" id=\"row\" >';
				if(left!=null&&left!=''){	
					 model+='            <div class=\"col-xs-4\">'+
							'                <span style=\"font-size:'+sList[5].templateColumnFontSize+';color:'+sList[5].templateColumnFontColor+';\" class=\"'+sList[5].templateColumnValue+'\">'+
							'            </div>';
				}	
			 model+='            <div class="col-xs-8 text-right">';
				if(right1!=null&&right1!=''){
					if(sList[1].templateColumnLinkMark!=null&&sList[1].templateColumnLinkMark!=""){
						for(var k = 0 ; k < right1.length ; k++){
							if(k==0){
								right1s = "["+right1[k].split('\|')[1]+"]" ;
							}else{
								right1s = right1s +"-"+ "[" + right1[k].split('\|')[1] + "]";
							}
						}
						model+='<a target=\"_self\" href=\"http://'+sList[1].templateColumnLinkMark+'\"><div>                <span style=\"font-size:'+sList[1].templateColumnFontSize+';color:'+sList[1].templateColumnFontColor+';font-weight:'+sList[1].templateColumnFontWeight+';\">'+right1s+'</span></div></a>';
					}else{
						for(var k = 0 ; k < right1.length ; k++){
							if(k==0){
								right1s = "["+right1[k].split('\|')[1]+"]" ;
							}else{
								right1s = right1s +"-"+ "[" + right1[k].split('\|')[1] + "]";
							}
						}
						model+='<div>                <span style=\"font-size:'+sList[1].templateColumnFontSize+';color:'+sList[1].templateColumnFontColor+';font-weight:'+sList[1].templateColumnFontWeight+';\">'+right1s+'</span></div>';
					}
					
				}
				if(right2!=null&&right2!=''){
					if(sList[2].templateColumnLinkMark!=null&&sList[2].templateColumnLinkMark!=""){
						for(var k = 0 ; k < right2.length ; k++){
							if(k==0){
								right2s = "["+right2[k].split('\|')[1]+"]" ;
							}else{
								right2s = right2s +"-"+ "[" + right2[k].split('\|')[1] + "]";
							}
						}
						model+='<a target=\"_self\" href=\"http://'+sList[2].templateColumnLinkMark+'\"><div>                <span style=\"font-size:'+sList[2].templateColumnFontSize+';color:'+sList[2].templateColumnFontColor+';font-weight:'+sList[2].templateColumnFontWeight+';\">'+right2s+'</span></div></a>';
					
					}else{
						for(var k = 0 ; k < right2.length ; k++){
							if(k==0){
								right2s = "["+right2[k].split('\|')[1]+"]" ;
							}else{
								right2s = right2s +"-"+ "[" + right2[k].split('\|')[1] + "]";
							}
						}
						model+='<div>                <span style=\"font-size:'+sList[2].templateColumnFontSize+';color:'+sList[2].templateColumnFontColor+';font-weight:'+sList[2].templateColumnFontWeight+';\">'+right2s+'</span></div>';
					
					}
					
				}
				if(right3!=null&&right3!=''){
					if(sList[3].templateColumnLinkMark!=null&&sList[3].templateColumnLinkMark!=""){
						for(var k = 0 ; k < right3.length ; k++){
							if(k==0){
								right3s = "["+right3[k].split('\|')[1]+"]" ;
							}else{
								right3s = right3s +"-"+ "[" + right3[k].split('\|')[1] + "]";
							}
						}
						model+='<a target=\"_self\" href=\"http://'+sList[3].templateColumnLinkMark+'\"><div>                <span style=\"font-size:'+sList[3].templateColumnFontSize+';color:'+sList[3].templateColumnFontColor+';font-weight:'+sList[3].templateColumnFontWeight+';\">'+right3s+'</span></div></a>';
					
					}else{
						for(var k = 0 ; k < right3.length ; k++){
							if(k==0){
								right3s = "["+right3[k].split('\|')[1]+"]" ;
							}else{
								right3s = right3s +"-"+ "[" + right3[k].split('\|')[1] + "]";
							}
						}
						model+='<div>                <span style=\"font-size:'+sList[3].templateColumnFontSize+';color:'+sList[3].templateColumnFontColor+';font-weight:'+sList[3].templateColumnFontWeight+';\">'+right3s+'</span></div>';
					
					}
					
				}
				if(right4!=null&&right4!=''){
					if(sList[4].templateColumnLinkMark!=null&&sList[4].templateColumnLinkMark!=""){
						for(var k = 0 ; k < right4.length ; k++){
							if(k==0){
								right4s = "["+right4[k].split('\|')[1]+"]" ;
							}else{
								right4s = right4s +"-"+ "[" + right4[k].split('\|')[1] + "]";
							}
						}
						model+='<a target=\"_self\" href=\"http://'+sList[4].templateColumnLinkMark+'\"><div>                <span style=\"font-size:'+sList[4].templateColumnFontSize+';color:'+sList[4].templateColumnFontColor+';font-weight:'+sList[4].templateColumnFontWeight+';\">'+right4s+'</span></div></a>';
					
					}else{
						for(var k = 0 ; k < right4.length ; k++){
							if(k==0){
								right4s = "["+right4[k].split('\|')[1]+"]" ;
							}else{
								right4s = right4s +"-"+ "[" + right4[k].split('\|')[1] + "]";
							}
						}
						model+='<div>                <span style=\"font-size:'+sList[4].templateColumnFontSize+';color:'+sList[4].templateColumnFontColor+';font-weight:'+sList[4].templateColumnFontWeight+';\">'+right4s+'</span></div>';
					
					}
					
				}
			 model+='            </div>'+
					'        </div>'+
					'    </div>'+
					'</div>';
		 }else{
			 colorNum = i%4;
			 model+='<div class="col-md-'+middle+' col-sm-'+small+' col-lg-'+large+'">'+
					'    <div class="content-box widget lazur-bg p-lg text-center" style=\"background-color:'+colors[colorNum]+'\">'+
					'        <div class="m-b-md" style=\"width:100%\">'+
					'        	<div class=\"row\" id=\"row\" >';
				if(right1!=null&&right1!=''){
					for(var k = 0 ; k < right1.length ; k++){
						if(k==0){
							right1s = "["+right1[k].split('\|')[1]+"]" ;
						}else{
							right1s = right1s +"-"+ "[" + right1[k].split('\|')[1] + "]";
						}
					}
					model+='                <span style=\"font-size:'+sList[1].templateColumnFontSize+';color:'+sList[1].templateColumnFontColor+';\" class=\"fa fa-cloud\"></span>';
				}
				if(right2!=null&&right2!=''){
					for(var k = 0 ; k < right2.length ; k++){
						if(k==0){
							right2s = "["+right2[k].split('\|')[1]+"]" ;
						}else{
							right2s = right2s +"-"+ "[" + right2[k].split('\|')[1] + "]";
						}
					}
					model+='<div>                <span style=\"font-size:'+sList[2].templateColumnFontSize+';color:'+sList[2].templateColumnFontColor+';font-weight:'+sList[2].templateColumnFontWeight+';\">'+right2s+'</span></div>';
				}
				if(right3!=null&&right3!=''){
					for(var k = 0 ; k < right3.length ; k++){
						if(k==0){
							right3s = "["+right3[k].split('\|')[1]+"]" ;
						}else{
							right3s = right3s +"-"+ "[" + right3[k].split('\|')[1] + "]";
						}
					}
					model+='<div>                <span style=\"font-size:'+sList[3].templateColumnFontSize+';color:'+sList[3].templateColumnFontColor+';font-weight:'+sList[3].templateColumnFontWeight+';\">'+right3s+'</span></div>';
				}
				if(right4!=null&&right4!=''){
					for(var k = 0 ; k < right4.length ; k++){
						if(k==0){
							right4s = "["+right4[k].split('\|')[1]+"]" ;
						}else{
							right4s = right4s +"-"+ "[" + right4[k].split('\|')[1] + "]";
						}
					}
					model+='<div>                <span style=\"font-size:'+sList[4].templateColumnFontSize+';color:'+sList[4].templateColumnFontColor+';font-weight:'+sList[4].templateColumnFontWeight+';\">'+right4s+'</span></div>';
				}
			 model+='        	</div>'+
				 	'        </div>'+
			 		'    </div>'+
			 		'</div>';
		 }
		 
		 
		
		
	}
	$('#GridByCard').html(model);
}




var templateId = "0";
function save(){
	var sList = [];
	var rows = $("#valueContent .row.cell");
	for(var i=0;i<rows.length;i++){
		var sysGridbycardTemplateColumn={};
		if(rows[i].id=='divSize'){
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$("#large").val()+','+$("#middle").val()+','+$("#small").val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else if(rows[i].id=='left'){
			var values = $(rows[i]).find('input[name="columnValue"]').val();
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=values;
			sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else{
			var values = "";
			var columnValue = $(rows[i]).find('select[name="columnValue"]').val();
			if(columnValue!=null&&columnValue!=''){
				for(var j = 0; j<columnValue.length ;j++){
					if(j==0){
						values = values + columnValue[0];
					}else{
						values = values +"&"+ columnValue[j];
					}
				}
				sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
				sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
				sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
				sysGridbycardTemplateColumn.templateColumnValue=values;
				sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
				sysGridbycardTemplateColumn.templateColumnFontWeight=$(rows[i]).find('input[name="fontWeight"]').val();
				sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
				sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
				sysGridbycardTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			}else{
				sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
				sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
				sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
				sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			}
		}
		sList[i]=sysGridbycardTemplateColumn;
	}
	
	$.ajax({  
        url: '/myehr/formtemplate/saveCardTemplate.action',  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    data:JSON.stringify(sList),
		contentType: 'application/json;charset=utf-8',
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
	    	parent.layer.close(index); //再执行关闭  
	    }  
    });
}
function initData(){
	$.ajax({  
        url: '/myehr/formtemplate/getDataInfo.action?formDefId=${param.formDefId}&templateId=${param.templateId}',  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    success:function(datas){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
			for(var k=0;k<datas.length;k++){
				if(datas[k].templateColumnCode=='divSize'){
					$("#"+datas[k].templateColumnCode).find('input[name="id"]').val(datas[k].templateColumnId);
					$("#large").val(datas[k].templateColumnValue.split(",")[0]);
					$("#middle").val(datas[k].templateColumnValue.split(",")[1]);
					$("#small").val(datas[k].templateColumnValue.split(",")[2]);
					$("#"+datas[k].templateColumnCode).find('input[name="fontColor"]').val(datas[k].templateColumnFontColor);
				}else if(datas[k].templateColumnCode=='left'){
					$("#"+datas[k].templateColumnCode).find('input[name="id"]').val(datas[k].templateColumnId);
					$("#"+datas[k].templateColumnCode).find('select[name="columnValue"]').val(datas[k].templateColumnValue);
					$("#"+datas[k].templateColumnCode).find('input[name="fontSize"]').val(datas[k].templateColumnFontSize);
					$("#"+datas[k].templateColumnCode).find('input[name="fontWeight"]').val(datas[k].templateColumnFontWeight);
					$("#"+datas[k].templateColumnCode).find('input[name="fontColor"]').val(datas[k].templateColumnFontColor);
					$("#"+datas[k].templateColumnCode).find('input[name="linkMark"]').val(datas[k].templateColumnLinkMark);
				}else{
					$("#"+datas[k].templateColumnCode).find('input[name="id"]').val(datas[k].templateColumnId);
					if(datas[k].templateColumnValue!=null){
						$("#"+datas[k].templateColumnCode).find('select[name="columnValue"]').val(datas[k].templateColumnValue.split("&"));
					}
					$("#"+datas[k].templateColumnCode).find('input[name="fontSize"]').val(datas[k].templateColumnFontSize);
					$("#"+datas[k].templateColumnCode).find('input[name="fontWeight"]').val(datas[k].templateColumnFontWeight);
					$("#"+datas[k].templateColumnCode).find('input[name="fontColor"]').val(datas[k].templateColumnFontColor);
					$("#"+datas[k].templateColumnCode).find('input[name="linkMark"]').val(datas[k].templateColumnLinkMark);
				}
				
			}
	    }  
    });
}

function closex(){
	var index=parent.layer.getFrameIndex(window.name);
	parent.layer.close(index);
}

</script>
</body>
</html>