<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="../bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<script type="text/javascript" src="../bootstrap2/bootstrap-switch.min.js"></script>
<style type="text/css">

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
	
	<div id="valueContent" class="form-control" style="width:75%;height:103%;margin:auto auto;position:relative;">
		<div class="row cell" id="left">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="float:left">
					<lable style="float:left;font-size:12px">图标元素: </lable>
					<select id="left_columnValue"  styleType="select" name="columnValue"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_LEVEL" nullItemText="请选择..." dataField="dict_form_3877"initParam = "_">
					</select>
					<input id="left_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="left_fontSize" name="fontSize" type="number" class="form-control"  style="width:220px;float:left" value="80"/><span style="float:left">px</span>
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
</script>
</body>
</html>