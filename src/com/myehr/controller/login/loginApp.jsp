<%@page pageEncoding="UTF-8"%>
<html>
<head>
  <title>人力资源管理系统-登录</title>
</head>
<body>

</body>
</html>
<script type="text/javascript">
window.onload=function(){
	 $.ajax({ 
	       	  url:'/myehr/user/loginApp.action,
		      type:'post',
				   cache: false,
				   success: function (text) {
				   }
			   });
	}
</script>  