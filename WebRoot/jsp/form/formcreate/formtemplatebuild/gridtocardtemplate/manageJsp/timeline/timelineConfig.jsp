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
.BASEINFOR{
	padding:10px 5px;
	border: 1px solid #3594cb;
	height:100%;
	overflow-y:auto;
	border-radius:5px;
	overflow-x:hidden;
}
.DIV0{
	width:40%;
	height: 100%;
    overflow-y: hidden;
	padding:10px;
	overflow-x:auto;
	float:left;
}
.DIV1{
	width: 60%;
	height: 100%;
    overflow-y: hidden;
	padding:10px;
	overflow-x:auto;
}
.TemplateColumnList{
	height:100%;
}
.parentColumn{
	height:100%;
	width:20px;
	float:left;
}
.SHOW_JSP{
	width:100%;
	height:85%;
}

ul{list-style:none;height:100%;width:95%;margin:0 auto;min-width:680px;}
.half{
	width:49%;
	display:inline-block;
}
li:after {
	clear: both;
}
li{
	margin-bottom:-5px
}
.leftContent{
	text-align:right;
	float:right;
	width:100%;
	padding-right:30px;
}
.centerLine{
	display:inline-block;
	border-left:5px solid #3594cb;
	position:relative;
}
.rightContent{
	text-align:left;
	float:left;
	width:100%;
	padding-left:30px;
}
h4{
	text-align:left;
	word-break:break-all;
	border:1px solid #3594cb;
	padding:8px;
	border-radius:5px;
	margin:0;
	overflow-y:auto;
}
.image{
	width:100%;
	height:100%;
}
.imageSize{
	position: absolute;
    width: 50px;
    left: -28px;
    height: 50px;
    overflow: hidden;
    border-radius: 25px;
    border: 1px solid #3594cb;
}
.textContent{
}
</style>
<script type="text/javascript" src="../../js/templateConfig.js"></script>
</head>
<body class="gray-bg">
	<div class="row DIV0" id="DIV0">
		<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6 TCINFOR">
			<table id="TemplateColumnList0" class="TemplateColumnList TemplateColumnList0">
			</table>
		</div>
		<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6 BASEINFOR">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">模板编码</label>
					<input type="text" id="TEMPLATE_CODE" class="form-control columnInfo" title="模板编码"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">模板参数编码</label>
					<input type="text" id="TEMPLATE_PARAM_CODE" class="form-control columnInfo" title="模板参数编码"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">模板参数中文名</label>
					<input type="text" id="TEMPLATE_PARAM_CNAME" class="form-control columnInfo" title="模板参数中文名"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">归属参数代码</label>
					<input type="text" id="TEMPLATE_PARAM_VALUE" class="form-control columnInfo" title="归属参数代码"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">参数值</label>
					<input type="text" id="TEMPLATE_INIT_PARAM_VALUE" class="form-control columnInfo" title="参数值"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">参数初始值</label>
					<input type="text" id="TEMPLATE_PARAM_VALUE_TYPE" class="form-control columnInfo" title="参数初始值"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">参数值来源类型</label>
					<input type="text" id="TEMPLATE_PARAM_WIDGET_TYPE" class="form-control columnInfo" title="参数值来源类型"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">参数值控件类型</label>
					<input type="text" id="TEMPLATE_PARAM_XU" class="form-control columnInfo" title="参数值控件类型"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label class="columnInfoLabel">参数值类型</label>
					<input type="text" id="TEMPLATE_PARAM_TYPE" class="form-control columnInfo" title="参数值类型"  >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="buttonList">
					<input type="button" id="save" class="btn btn-success" value="保存"  >
					<input type="button" id="sonInfo" class="btn btn-success" value="子级信息" onclick="getSonColumn()" >
				</div>
			</div>
		</div>
	</div>
	<div class="row DIV1">
		<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 BASEINFOR">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="buttonList">
					<input type="button" id="loadJSp" class="btn btn-success" value="数据重载" onclick="setHtml()" >
					<input type="button" id="yulanJSP" class="btn btn-success" value="预览代码" onclick="yulanJSP()" >
					<input type="button" id="yulanHTML" class="btn btn-success" value="预览效果" onclick="yulanHTML()" >
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="jsp">
					<textarea class="SHOW_JSP"></textarea>
				</div>
			</div>
		</div>
	</div>
<script>
var templateCode = '${param.templateCode}';//模板编码
var lock = false;//子级锁
var nowGrade = 0;//当前字段级
var nowColumnObj;//当前选中字段
var modelBaseHtml;
$(function() {
	queryTemplateColumnList('TemplateColumnList0',0);
	initModelBaseHtml();
})


</script>
</body>
</html>