<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>取回数仓数据</title>
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
		<p style="font-size: 35px;font-weight: 900;text-align: center;margin:10px">取回数仓数据</p>
		<div style="margin-left:45%;display:inline-block">
			<input id="date" type="date" value="2018-01-01"/>
			</br>
			<input type="button" class="btn btn-success" value="确认取回" onclick="init()"/>
		</div>
	</div>
		
			
		<script>
		function init(){
		var time = $("#date").val();
		window.location.href="http://127.0.0.1:9875/queryOracleData?time=" + time;
		}
		</script>

		
	</body>
</html>
