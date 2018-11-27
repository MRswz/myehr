<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%	
    String formId = request.getParameter("formId");
    String templateFileid = request.getParameter("templateFileid");
    String templateFilename = request.getParameter("templateFilename");
    String buttonId = request.getParameter("buttonId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>选择导入文件</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/ico/favicon.png">
<link href="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/css/font-awesome.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/css/bootstrap.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/css/carousel.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/css/echartsHome.css" rel="stylesheet">
<script src="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/example/www/js/echarts.js"></script>
<script src="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/js/codemirror.js"></script>
<script src="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/js/javascript.js"></script>
<link href="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/css/codemirror.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/jsp/form/button/echarts-2.2.7/doc/asset/css/monokai.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/upload/jquery.uploadify.h5.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/upload/uploadify-min.css" type="text/css"></link>
</head>
<body>
	<div id="test_charts_line_one_chart" style="width:100%;height:400px;"></div>
</body>
<script type="text/javascript">
$(function() {
	initCharts();
});

	function initCharts(){
		document.getElementById('test_charts_line_one_chart').style.width='1000px';
		document.getElementById('test_charts_line_one_chart').style.height='400px';
		var myChart = echarts.init(document.getElementById('test_charts_line_one_chart'));
		option = {
			title : {
				text: 'iphone销量',
				subtext: '纯属虚构',
				x:'center'
			},
			tooltip : {
				trigger: 'item'
			},
			legend: {
				orient: 'vertical',
				x:'left',
				data:['iphone3','iphone4','iphone5']
			},
			dataRange: {
				min: 0,
				max: 2500,
				x: 'left',
				y: 'bottom',
				text:['高','低'],           // 文本，默认为数值文本
				calculable : true
			},
			toolbox: {
				show: true,
				orient : 'vertical',
				x: 'right',
				y: 'center',
				feature : {
					mark : {show: true},
					dataView : {show: true, readOnly: false},
					restore : {show: true},
					saveAsImage : {show: true}
				}
			},
			roamController: {
				show: true,
				x: 'right',
				mapTypeControl: {
					'china': true
				}
			},
			series : [
				{
					name: 'iphone3',
					type: 'map',
					mapType: 'china',
					roam: false,
					itemStyle:{
						normal:{label:{show:true}},
						emphasis:{label:{show:true}}
					},
					data:[
						{name: '北京',value: Math.round(Math.random()*1000)},
						{name: '天津',value: Math.round(Math.random()*1000)},
						{name: '上海',value: Math.round(Math.random()*1000)},
						{name: '重庆',value: Math.round(Math.random()*1000)},
						{name: '河北',value: Math.round(Math.random()*1000)},
						{name: '河南',value: Math.round(Math.random()*1000)},
						{name: '云南',value: Math.round(Math.random()*1000)},
						{name: '辽宁',value: Math.round(Math.random()*1000)},
						{name: '黑龙江',value: Math.round(Math.random()*1000)},
						{name: '湖南',value: Math.round(Math.random()*1000)},
						{name: '安徽',value: Math.round(Math.random()*1000)},
						{name: '山东',value: Math.round(Math.random()*1000)},
						{name: '新疆',value: Math.round(Math.random()*1000)},
						{name: '江苏',value: Math.round(Math.random()*1000)},
						{name: '浙江',value: Math.round(Math.random()*1000)},
						{name: '江西',value: Math.round(Math.random()*1000)},
						{name: '湖北',value: Math.round(Math.random()*1000)},
						{name: '广西',value: Math.round(Math.random()*1000)},
						{name: '甘肃',value: Math.round(Math.random()*1000)},
						{name: '山西',value: Math.round(Math.random()*1000)},
						{name: '内蒙古',value: Math.round(Math.random()*1000)},
						{name: '陕西',value: Math.round(Math.random()*1000)},
						{name: '吉林',value: Math.round(Math.random()*1000)},
						{name: '福建',value: Math.round(Math.random()*1000)},
						{name: '贵州',value: Math.round(Math.random()*1000)},
						{name: '广东',value: Math.round(Math.random()*1000)},
						{name: '青海',value: Math.round(Math.random()*1000)},
						{name: '西藏',value: Math.round(Math.random()*1000)},
						{name: '四川',value: Math.round(Math.random()*1000)},
						{name: '宁夏',value: Math.round(Math.random()*1000)},
						{name: '海南',value: Math.round(Math.random()*1000)},
						{name: '台湾',value: Math.round(Math.random()*1000)},
						{name: '香港',value: Math.round(Math.random()*1000)},
						{name: '澳门',value: Math.round(Math.random()*1000)}
					]
				},
				{
					name: 'iphone4',
					type: 'map',
					mapType: 'china',
					itemStyle:{
						normal:{label:{show:true}},
						emphasis:{label:{show:true}}
					},
					data:[
						{name: '北京',value: Math.round(Math.random()*1000)},
						{name: '天津',value: Math.round(Math.random()*1000)},
						{name: '上海',value: Math.round(Math.random()*1000)},
						{name: '重庆',value: Math.round(Math.random()*1000)},
						{name: '河北',value: Math.round(Math.random()*1000)},
						{name: '安徽',value: Math.round(Math.random()*1000)},
						{name: '新疆',value: Math.round(Math.random()*1000)},
						{name: '浙江',value: Math.round(Math.random()*1000)},
						{name: '江西',value: Math.round(Math.random()*1000)},
						{name: '山西',value: Math.round(Math.random()*1000)},
						{name: '内蒙古',value: Math.round(Math.random()*1000)},
						{name: '吉林',value: Math.round(Math.random()*1000)},
						{name: '福建',value: Math.round(Math.random()*1000)},
						{name: '广东',value: Math.round(Math.random()*1000)},
						{name: '西藏',value: Math.round(Math.random()*1000)},
						{name: '四川',value: Math.round(Math.random()*1000)},
						{name: '宁夏',value: Math.round(Math.random()*1000)},
						{name: '香港',value: Math.round(Math.random()*1000)},
						{name: '澳门',value: Math.round(Math.random()*1000)}
					]
				},
				{
					name: 'iphone5',
					type: 'map',
					mapType: 'china',
					itemStyle:{
						normal:{label:{show:true}},
						emphasis:{label:{show:true}}
					},
					data:[
						{name: '北京',value: Math.round(Math.random()*1000)},
						{name: '天津',value: Math.round(Math.random()*1000)},
						{name: '上海',value: Math.round(Math.random()*1000)},
						{name: '广东',value: Math.round(Math.random()*1000)},
						{name: '台湾',value: Math.round(Math.random()*1000)},
						{name: '香港',value: Math.round(Math.random()*1000)},
						{name: '澳门',value: Math.round(Math.random()*1000)}
					]
				}
			]
		};
    myChart.setOption(option);
}
	
//参数obj为input file对象  
</script>
</html>
