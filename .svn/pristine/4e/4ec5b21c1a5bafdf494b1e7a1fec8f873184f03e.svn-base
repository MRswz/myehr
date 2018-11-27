<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<%
	Object code = request.getParameter("code");
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
	 <form id="form1" class="nui-form" method="post" action="${pageContext.request.contextPath }/appLogin/login.action?loginFrom=APP">
	 	  <input type="hidden" name="access_token" id="access_token">
	 	  <input type="hidden" name="DCode" id="DCode">
	 </form>
  </body>
  <script type="text/javascript">
  	$(function() {
  		getuserdetail_dingding();
  		//jump();
  		//$("#mobile").val("18756959019");
	    //document.getElementById("form1").submit();
	})
	var DCode = "";
  	var access_token = "";
	//微信
	function getuserdetail(){
		var data = {};
		data.code = '<%=code%>';
		data.corpid = '';
		data.corpsecret = '';
		$.ajax({
				url:'${pageContext.request.contextPath}/app/getUerInfo.action',
				type:'post',
				cache: false,
				async: false,
				success: function (datas) {
					alert(datas);
				}
				})
	}
  	
  	//钉钉
  	function getuserdetail_dingding(){
		$.ajax({
				url:'/myehr/app/login.action',
				type:'post',
				cache: false,
				success: function (datas) {
					var datas = datas;
					$("#access_token").val(datas.access_token);
					var access_token = datas.access_token;
					dd.config({
					    agentId: "", // 服务端传来的congfig信息
					    corpId: datas.corpId,
					    timeStamp: datas.timeStamp,
					    nonceStr: datas.nonceStr,
					    signature: datas.signature,
					    jsApiList: [ // 所有需要使用到的jsApi需要在config的时候进行注册，写在这里。
					                 'runtime.info',
					                 'biz.contact.choose',
					                 'device.notification.confirm',
					                 'device.notification.alert',
					                 'device.notification.prompt',
					                 'biz.ding.post',
					             'runtime.permission.requestAuthCode',
					             'device.geolocation.get',
					             'biz.ding.post',
					             'biz.contact.complexChoose']
					});
					dd.ready(function() {
					    dd.runtime.permission.requestAuthCode({
					        corpId: datas.corpId,
					        onSuccess: function(result) {
					        /*{
					            code: 'hYLK98jkf0m' //string authCode
					        }*/
					        code = result;
					        DCode = result.code;
					        $("#DCode").val(DCode);
					        document.getElementById("form1").submit();
					        /*
					        $.ajax({
								url:'/myehr/appLogin/login.action?DCode='+DCode+'&access_token='+access_token,
								type:'post',
								cache: false,
								success: function (datas) {
									//location.href="WebForm2.aspx?code="
											
								}
					  		});
					        */
					        },
					        onFail : function(err) {
						        alert("fail");
					        }
					 
					    });
					});
					dd.error(function(err) { 
						 alert('dd error: ' + JSON.stringify(err)); 
					 });
				}
				})
	}
  	
  	function jump(){
  		
  	}
	
  </script>
</html>









