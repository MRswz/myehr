<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css">
.MODELTYPE{
	height:30px;
	margin-bottom:10px;
	font-size:15px;
	font-weight:800;
	max-width:150px;
}
.DIV1{
	padding:10px 5px;
}
.DIV0{
	padding:10px;
}
.DIV2{
	padding:0px;
}
.row{
	margin:0;
}
.TEMPLATE_WALL{
	cursor:default;
}
.TEMPLATE_ELEMENT{
	
}
.TEMPLATE_ELEMENT_CONTENT{
	width:400px;
	height:220px;
}
.TEMPLATE_ELEMENT_CONTENT .LEFT{
	display:inline-block;
	width:100px;
	height:100%;
}
.TEMPLATE_ELEMENT_CONTENT .CENTER{
	display:inline-block;
	width:245px;
	height:100%;
}
.TEMPLATE_ELEMENT_CONTENT .CENTER .TITLE{
	font-size:16px;
	font-weight:900;
	overflow-x:hidden;
}
.TEMPLATE_ELEMENT_CONTENT .CENTER .DESC{
	font-size:12px;
	font-weight:400;
	overflow-x:hidden;
}
.TEMPLATE_ELEMENT_CONTENT .RIGHT{
	width:75px;
	position: absolute;
    right: 40px;
    bottom: 110px;
}
.TEMPLATE_ELEMENT_CONTENT .RIGHT input{
	cursor:pointer !important;
}
.TEMPLATE_PHOTO{
	width:100px;
	height:100px;
}
.TEMPLATE_ELEMENT .TOP{
	height:150px;
	margin:0;
}
.TEMPLATE_ELEMENT .BOTTOM{
	height:70px;
	background-color:#FFFFEB;
}
</style>
<script type="text/javascript" src="../js/templateManage.js"></script>
</head>
<body class="gray-bg">
<div class="row DIV0" id="DIV0">
	<div class="col-lg-2 col-md-2 col-sm-0 col-xs-0 DIV1 ">
		<input type="text" readonly class="form-control MODELTYPE" value="时间轴模板">
		<input type="text" readonly class="form-control MODELTYPE" value="模板X">
		<input type="text" readonly class="form-control MODELTYPE" value="模板Y">
	</div>
	<div class="col-lg-10 col-md-10 col-sm-12 col-xs-12 DIV1">
		<div class="row TEMPLATE_WALL">
		
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 TEMPLATE_ELEMENT">
				<div class="TEMPLATE_ELEMENT_CONTENT contact-box TOP">
					<div class="LEFT DIV2">
						<img class="TEMPLATE_PHOTO" src="http://116.62.243.28:9875/Template/ORIGINAL_TIMELINE_WT/ORIGINAL_TIMELINE_WT.png">
					</div>
					<div class="CENTER DIV2">
						<p class="TITLE TEMPLATE_CODE" title="ORIGINAL_TIMELINE_WT">ORIGINAL_TIMELINE_WT</p>
						<p class="DESC" title="时间轴基础配置模板,诞生于2018年7月18日">时间轴基础配置模板,诞生于2018年7月18日</p>
					</div>
					<div class="RIGHT DIV2">
						<input type="text" readonly class="form-control" title="使用模板" value="使用模板" onclick="openTemplateManage(this)">
						<input type="hidden" />
					</div>
				</div>
				<div class="TEMPLATE_ELEMENT_CONTENT contact-box BOTTOM">
					
				</div>
			</div>
			
		</div>
	</div>
</div>
<script>
$(function() {
	loadTempalte();
})
</script>
</body>
</html>