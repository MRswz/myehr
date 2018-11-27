<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
    <head>
	<script src="http://cdn.bootcss.com/jquery/1.11.0/jquery.min.js" type="text/javascript"></script>
	</head>
	<body>
       <div class="htmleaf-container">
		    <form id="myForm" action="/myehr/FileList/saveToImgByStr.action">
				<input type="hidden" id="code" name="Code" style="width:100px" value=""/>
		    </form>
       </div>
    </body>
	<script>
	$(function() {
		$("#code").val('${param.A01_A0190}');
		exportant();
	})
	function exportant(){
		document.getElementById("myForm").submit();
	}
	function closex(){
		var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		parent.layer.close(index);//执行关闭
	}
	</script>
</html>