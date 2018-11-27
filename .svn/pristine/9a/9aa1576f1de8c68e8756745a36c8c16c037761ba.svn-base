<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<%
	Object ImUser = request.getParameter("ImUser");
%>

<html>
<head>
<!-- 
  	<script type="text/javascript" src="http://wechatfe.github.io/vconsole/lib/vconsole.min.js?v=3.0.0.0"></script> 
	  <script>
	  // init vConsole
	  var vConsole = new VConsole();
	  console.log('Hello world');
	</script>
 -->
  <script type="text/javascript" src="common/js/timepicker/jquery/jquery-1.8.3.min.js"></script>
  <!-- <script type="text/javascript" src="common/js/dingtalk.js"></script> -->
  <script type="text/javascript" src="https://g.alicdn.com/dingding/open-develop/1.6.9/dingtalk.js"></script>
  
  </head>  
  <body>
	 <form id="form1" class="nui-form" method="post" action="${pageContext.request.contextPath }/login/login.action?UserCode=<%=ImUser%>">
	 	  <input type="hidden" name="access_token" id="access_token">
	 	  <input type="hidden" name="DCode" id="DCode">
	 </form>
  </body>
  <script type="text/javascript">
  	$(function() {
  		document.getElementById("form1").submit();
	})
	
  </script>
</html>









