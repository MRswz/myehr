<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>绩效考核</title>
		<style type="text/css">
			html,body{min-height: 100%;}
			.row.cell {margin: 0 30px;}
			.ui-slider .ui-slider-handle{height:30px !important;display:none}
			.contact-box{height:200px}
		</style>
		<script type="text/javascript" src="js/testQuestion.js"></script>
		<script type="text/javascript" src="js/jquery.knob.js"></script>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
		<script type="text/javascript" src="js/jquery-ui.min.js"></script>
	</head>
	<body class="gray-bg">
	<div class="container-fluid">
		<p style="font-size: 35px;font-weight: 900;text-align: center;margin:10px">绩效考核</p>
		<div style="margin:10px 0;">
			<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">被评人信息</h3>
			<div class='row cell'>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">考核计划: </lable>
						<input id="CYCLE" name="CYCLE" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
						<input id="pid" name="pid" type="hidden" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">考核模板: </lable>
						<input id="templateid" name="templateid" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">被考核对象: </lable>
						<input id="objid" name="objid" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">考核得分: </lable>
						<input id="score" name="score" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
			</div>
		</div>
		<div style="margin:10px 0;">
			<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">考核官信息</h3>
			<div class='row cell'>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">考核官角色: </lable>
						<input id="relationName" name="relationName" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
						<input id="relationid" name="relationid" type="hidden" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">关系权重: </lable>
						<input id="relationrate" name="relationrate" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">公司: </lable>
						<input id="compName" name="compName" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
						<input id="compid" name="compid" type="hidden" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">部门: </lable>
						<input id="depName" name="depName" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
						<input id="depid" name="" type="hidden" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">工号: </lable>
						<input id="empcode" name="empcode" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<lable style="float:left">姓名: </lable>
						<input id="cname" name="cname" type="text" class="form-control" readonly="true" style="width:200px;height:; border:none;float:left"/>
						<input id="scoreManId" name="scoreManId" type="hidden"/>
					</div>
				</div>
			</div>
		</div>
		<div style="margin:10px 0;">
			<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">考核内容</h3>
			
			<div class="wrapper wrapper-content animated fadeInRight" id="content">
				<div class="row" style="margin-left:0"  id="type1">
					<%--<div class="col-md-12 col-sm-12 col-lg-12 singleShow">
						<div class="contact-box">
							<div class="col-sm-8">
								<h3 style="margin-top:0;color:#000000;font-size:18px" title="重点客户、项目管理"><strong>重点客户、项目管理</strong></h3>
								<h3 style="margin-top:0;color:#000000;font-size:14px" title="重点客户、项目管理">(基本分7分，做出不利于专业小组、部门、研发机构的公共事项1次扣1分，有利的事项1次加1分，上级安排的临时任务圆满完成的加1分，完成不好的扣1分；)</h3>
								<h3 style="margin-top:0;color:#000000;font-size:14px" title="重点客户、项目管理"><strong>指标权重:</strong>20%</h3>
								<h3 style="margin-top:0;color:#000000;font-size:14px" title="重点客户、项目管理"><strong>评分:</strong></h3><input type="text" />
							</div>
							<div class="col-sm-3">
								<div id="knobwrapper">
									<input class="knob" value="10">
									<input class="knob" value="10">
								</div>
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				--%></div>
			</div>
		</div>
		<div class="BTNGROUP BTNGROUP_3335" style="margin:5px auto; display:inline-block;height: 30px;width:100%;z-index: 6;position: relative">
			<div style="margin-left:45%;display:inline-block">
				<input type="button" id="quickSave"  class="btn btn-success" value="暂存" onclick="quickSaveData()"/>
				<input type="button" id="upup"  class="btn btn-success" value="提交" onclick="referData()"/>
			</div>
		</div>
	</div>
		<script>
		var objid = '${param.objid}';
		var objtype = '${param.objtype}';
		var isView = '${param.isQuestionView}';
		var scoreMan = '${param.scorer}';
		$(function() {
			initJsp();
		})
		</script>
	</body>
</html>
