<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">

<title>时间轴</title>

<script type="text/javascript" src="/myehr/commonNews/js/jquery-1.7.2.min.js"></script>
<link rel="stylesheet" href="/myehr/commonNews/css/style.css" type="text/css"></link>

</head>

<body>

<div class="about4" style="height:600px;overflow:auto;">
	<div class="about4_ch" style="color:#333;">新闻时间轴</div>
	<div class="about4_main">

		<div class="line"></div>
		<ul id="newsxxx" style="list-style:none;margin:0;padding:0;font-family:Arial,"微软雅黑";">
		</ul>
	</div>
</div>

<script type="text/javascript">


$(function(){
		getNewsData();
	})

	
function getNewsData(){
	var data = {};
	$.ajax({
		url : '${pageContext.request.contextPath}/evaluation/findNewsList.action',  
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			setNewsData(obj);
		}
	});
	return data;
}

function setNewsData(data){
	for(var i=0;i<data.length;i++){
		 data[i].releasedate = new Date(data[i].releasedate).Format("yyyy-MM-dd");
		var cellObj = $(
			'<li>'+
			'	<p style="float:left;color:#000000;font-size:18px;">'+data[i].releasedate+'&nbsp;&nbsp;&nbsp;&nbsp</p>'+
			'	<p style="color:#000000;font-size:18px;"><a href="/myehr/newsView.jsp?id='+data[i].id+'">'+data[i].title+'</a></p>'+  
			'</li>');
		$('#newsxxx').append(cellObj);
	}
}
$(document).ready(function(e) {
	var h = $(".about4_main ul li:first-child").height()/2;<!--第一个li高度的一半-->
	var h1 = $(".about4_main ul li:last-child").height()/2;<!--最后一个li高度的一半-->
	$(".line").css("top",h);
	$(".line").height($(".about4_main").height()-h1-h);
});
</script>
</body>
</html>
