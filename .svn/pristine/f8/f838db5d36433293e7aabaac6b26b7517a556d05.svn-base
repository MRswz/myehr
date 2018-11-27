<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
    <head>
	<script src="http://cdn.bootcss.com/jquery/1.11.0/jquery.min.js" type="text/javascript"></script>
	<script type="text/javascript" src="/myehr/js/security.js"></script>
	</head>
	<body>
    </body>
	<script>
	$(function() {
		var password = batchGetPassword();
		batchUpdatePassword(password);
		closex();
	})
	function batchGetPassword(){
		var passwords = "";
		$.ajax({
			url:'${pageContext.request.contextPath }/form/batchGetPassword.action?userid=${param.SYSUSER_USER_ID}',
			type:'post',
			cache: false,
			async: false,
			success: function (text) {
				passwords = text;
			}
		})
		for(var i = 0 ;i<passwords.length;i++){
			passwords[i]=b64_md5(passwords[i]);
		}
		return passwords;
	}
	function batchUpdatePassword(e){
		$.ajax({
			url:'${pageContext.request.contextPath }/form/batchUpdatePassword.action?userid=${param.SYSUSER_USER_ID}&passwords='+encodeURIComponent(e),
			type:'post',
			cache: false,
			async: false,
			success: function (text) {
			}
		})
	}
	function closex(){
		var index = parent.layer.getFrameIndex(window.name); //��ȡ��ǰ��������
		parent.layer.close(index);//ִ�йر�
	}
	</script>
</html>