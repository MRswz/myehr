<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/select2/js/select2.full.js"></script>
<link href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet" />
<link href="${pageContext.request.contextPath }/js/select2/css/select2.min.css" type="text/css" rel="stylesheet" />

<script type="text/javascript" src="${pageContext.request.contextPath }/js/select2.js"></script>

	<style type="text/css">
		.select {width:280px;height:35px;  font-size:35px; }
	
	</style>

</head>
<body>
<div class="input-group" style="width:250px;float:left">
	<input type="hidden" id="selectId" class="form-control" placeholder="请选择">
	<input type="text" id="selectValue" class="form-control" placeholder="请选择" onclick="selectTree()">
</div>
<div id="tableContent" class="tableContent" style="width:30%;border:1px solid rgb(170,170,170);z-index:10;float:left;display:none;">
	<iframe id = "dictList" src="${pageContext.request.contextPath }/treetest1.jsp" width="100%" height="750px"></iframe>
</div>

</body>
<script>
//查询
	function selectTree(){
		$("#tableContent").show();
	}
	
</script>
</html>