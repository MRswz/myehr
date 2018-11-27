<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html><head><script type="text/javascript" src="../cssjs/chooseQuestions3.js"></script></head>
<body>
<div class="container-fluid" style="height:100%;overflow-y:hidden;padding-top:5px;position:relative">
		<table id="SYS_QUESTIONS_choose_List">
		</table>
		<div id="moveDiv" style="width:400px;height:600px;background-color:fff;position:absolute;top:0;right:0;border:1px solid transparent;border-color:#428bca;border-radius:5px">
		    <div id="moveBar" style="background-color:#428bca;height:30px;cursor: move;"></div>
		    <table id="SYS_QUESTIONS_choose_List1">
			</table>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="saveChooseQuestions"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveChooseQuestions()"/>
			</div>
		</div>
</div>
<script>
var templateId = '${param.templateId}';
var code1 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>';
var code2 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>';
var code3 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目编码")%>';
var code4 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目中文名")%>';
var code5 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目英文名")%>';
var code6 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目分类")%>';
var code7 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题型")%>';
var code8 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目描述")%>';
var code9 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"分值")%>';
var code10 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标识")%>';
var code11 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作人")%>';
var code12 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作时间")%>';
var code13 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>';
var code14 = '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据")%>';
var code15 = '${param.formType}';
var code16 = '${param.empIds}';
var GROUPID_PARAM = '${param.GROUPID}';
var XTYPE_PARAM = '${param.XTYPE}';
</script>
</body>
</html>
