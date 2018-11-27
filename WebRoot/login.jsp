<%@page pageEncoding="UTF-8"%>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE7" /> 
<LINK href="${pageContext.request.contextPath }/css/mainframe/loginstyle.css?v0.0.04" type=text/css rel=stylesheet>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/security.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.4.4.min.js"></script>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	Object reCodeObj = request.getAttribute("reCode");
	Object userCodeObj = request.getAttribute("userCode");
	String reCode = reCodeObj==null?"":reCodeObj.toString();
	String userCode = userCodeObj==null?"":userCodeObj.toString();
%>
<% 
	String ip = request.getHeader("HTTP_X_FORWARDED_FOR");  

 	if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
  		ip = request.getHeader("http_client_ip");  
 	}  
 	if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
  		ip = request.getRemoteAddr();  
 	}  
 	if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
  		ip = request.getHeader("Proxy-Client-IP");  
 	}  
 	if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
  		ip = request.getHeader("WL-Proxy-Client-IP");  
 	}  
 	if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
  		ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
 	}  
 	// 如果是多级代理，那么取第一个ip为客户ip   
 	if (ip != null && ip.indexOf(",") != -1) {  
  		ip = ip.substring(ip.lastIndexOf(",") + 1, ip.length()).trim();  
 	}
%>
<html>
<script type="text/javascript">
window.onload= function(){
	init();
};
</script>
<head>
  <title>人力资源管理系统-登录</title>
</head>
<body>
<div class="main-panel" id="main-panel">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" class="loginBody" style="position:static;">
<tr class="topRow">
	<td class="top" colspan="3" style="position:relative">
		<div style="width:70%;float: left;height:100%;"><img id = "gongsiname"style="width: 30%;height: 100%;" /></div>
		<div style="position:absolute;top:0;right:0; height: 150%;"><img id = "ruanjianname"style=" height: 65%;" /></div>
		<!--<div style="position:absolute;top:0;right:0;"><img src="<%=request.getContextPath() %>/images/login/logo-ehr.jpg" /></div>-->
	</td>
</tr>
<tr class="centerRow" >
	<td class="emptyTd">&nbsp;</td>
	<td align="center">
		<div align="center" >
				<div class="imgcontainer">
					
				</div>
				
				    <div class="login" style="border-radius: 5px;behavior:url(${pageContext.request.contextPath }/common/nui/PIE.htc);">
				      <form id="form1" class="nui-form" method="post" action="${pageContext.request.contextPath }/user/login.action">
				      	<div style="border-bottom:1px solid #D8D7D7;text-align:left;padding-bottom:3px;">
				      		<img src="${pageContext.request.contextPath }/images/login/login_person.png"/>
				      		<span class="logintitle" >&nbsp;&nbsp;&nbsp;用户登录</span>
				      		<input type="hidden" name="_eosFlowAction" value="login">
						    <input type="hidden" name="winWide" id="winWide">
				      	</div>
					  	<div id="error" class="login-error" style="font-size:14px;color:red;height:16px;">
						</div>
							<div class="form-group">
					          <div class="col-xs-12">		            
					            <div class="control-wrapper" style="background: url('${pageContext.request.contextPath }/images/login/username.png') no-repeat!important;">
					            	<label for="username" class="control-label fa-label"><i class="fa fa-user fa-medium"></i></label>
					            	<input class="login-input-text login-input-focusout form-control" class="login-input-text" type="text"  placeholder="请输入账号" name="userCode" id="userCode" tabindex="1" autocomplete="off" onkeydown="keyDown(event)" value="<%=userCode %>" />
									<input class="login-input-text login-input-focusout form-control" class="login-input-text" type="hidden"  placeholder="请输入账号" name="ipAddress" id="ipAddress" tabindex="1" autocomplete="off" onkeydown="keyDown(event)" value="<%=ip %>" />
					            </div>		            	            
					          </div>              
					        </div>
				        <p>
					        <div class="form-group">
					          <div class="col-md-12">
					          	<div class="control-wrapper" style="background: url('${pageContext.request.contextPath }/images/login/password.png') no-repeat!important;">
					            <label for="password" class="control-label fa-label"><i class="fa fa-lock fa-medium"></i></label>
					            	<input class="login-input-pwd login-input-focusout form-control" class="login-input-text" type="password"  placeholder="请输入密码" name="password" id="password_1" tabindex="1" autocomplete="off" onkeydown="keyDown(event)" value="" />
					            	<input  type="hidden"  name="userPassword" id="userPassword" />
					            </div>
					          </div>
					        </div>
				         </p>
				         <p></p>
				            <div class="radio">
								<label>
								<input  type="hidden"  name="falg" id="falg" />
									<input type="radio" name="optionsRadios" id="optionsRadios1" value="zh" checked> 中文简体
								</label>
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="en">英文
								</label>
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios3" value="euc">日文
								</label>
								<label>
									<input type="radio" name="optionsRadios" id="optionsRadios4" value="big5">中文繁体
								</label>
							</div>
				        <p><a href="${pageContext.request.contextPath }/form/getfile.action?fileId=2" title="google浏览器">google浏览器</a></p>
				        <p class="submit">
				        	<div class="form-group">
					          <div class="col-xs-12">		            
					            <div class="control-wrapper" style="text-align: center">
					            	<label for="btn" class="control-label fa-label"><i class="fa fa-user fa-medium"></i></label>
				        			<input class="login-btn" type="button" name="commit" value="登  录" onclick="login()">
				        	 	</div>		            	            
					          </div>              
					        </div>
				        </p>
				      </form>
				    </div>
		  		
		</div>
	</td>
	<td class="emptyTd">&nbsp;</td>
</tr>
<tr  class="emptyRow">
	<td colspan="3" class="bottom-info" id="copyright">
		
	</td>
</tr>
</table>
<div>
</body>
</html>
<script type="text/javascript">
	var userCode;
	var password;

	var falg="";
	var path1 ='';
	document.getElementById("userCode").focus();
	var reCode = '<%=reCode %>';
	if(reCode!=null && reCode!="null" && reCode!="") {
		if(reCode=="-1") {
			alert("用户或密码不正确!","提醒",function (){
       			document.getElementById("userCode").focus();
       		});
			
			createCode();
			falg="false";
			$("#t1").css("display","inline-block");
			$("#checkeddata").css("display","inline-block");
			
		} else if(reCode=="2"){
			
			alert("用户不存在!","提醒",function (){
       			document.getElementById("userCode").focus();
       		});
			
			createCode();
			falg="false";
			$("#t1").css("display","inline-block");
			$("#checkeddata").css("display","inline-block");
		} else if(reCode=="-2"){
			alert("用户已登录!","提醒",function (){
       			document.getElementById("userCode").focus();
       		});
			
			
			createCode();
			falg="false";
			$("#t1").css("display","inline-block");
			$("#checkeddata").css("display","inline-block");
		} else if(reCode=="-3"){
			alert("密码已过期,请修改密码!","提醒",function (){
       		});
			
			createCode();
			falg="false";
			$("#t1").css("display","inline-block");
			$("#checkeddata").css("display","inline-block");
		}else if(reCode=="-4"){
			alert("验证码必须填写!");
		}
	}
	
	
	if (self != top) {
		top.location.href=self.location.href;
	}
	 
	function login(){
       	userCode = document.getElementById("userCode").value;
       	var pwd=document.getElementById("password_1").value;
       	if(pwd.length<24){
       		password = b64_md5(pwd);
       		password +="==";
       	}else{
       		password = pwd;
       		//userPassword
       	}
       	
       	if(userCode=="" && password=="") {
       		alert("请输入用户名和密码!","提醒",function (){
       			document.getElementById("userCode").focus();
       		});
       		return;
       	} else if(userCode=="") {
       		alert("请输入用户名!","提醒",function (){
       			document.getElementById("userCode").focus();
       		});
       		return;
       	} else if(password=="") {
       		alert("请输入密码!","提醒",function (){
       			document.getElementById("password_1").focus();
       		});
       		return;
       	}
       	document.getElementById("userPassword").value = password;
       	document.getElementById("falg").value = falg;
        document.getElementById("form1").submit();
	}
	
	function reset(){
		form.reset();
	}
	
	function keyDown(e) {
  		var ev= window.event||e;
  		if (ev.keyCode == 13) {
			login();
  		}
 	}
 	
 	var code; //在全局 定义验证码
function createCode()
{ //创建验证码函数
 code = "";
 var codeLength =4;//验证码的长度
 var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f','g','h','i','j','k',
  'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');//所有候选组成验证码的字符，当然也可以用中文的
 for(var i=0;i<codeLength;i++)
 { 
 var charIndex =Math.floor(Math.random()*36);
 code +=selectChar[charIndex]; 
 }
// 设置验证码的显示样式，并显示
 document.getElementById("discode").style.fontFamily="Fixedsys"; //设置字体
 document.getElementById("discode").style.letterSpacing="5px"; //字体间距
 document.getElementById("discode").style.color="#0ab000"; //字体颜色
 document.getElementById("discode").innerHTML=code; // 显示
}
function but()
{//验证验证码输入是否正确
 var val1=document.getElementById("t1").value;
 var val2=code;
 if(val1!=val2){
  alert("验证码错误!");
 document.getElementById('t1').value="";
		
  }else{
	  falg="true";
  }
 }
	 function init(){
	
	 var url = "${pageContext.request.contextPath }/systemParam/InitZM.action";
	$.ajax({
					url:url,
					type:'post',
					scriptCharset: 'utf-8',
					cache: true,
					success: function (result) {
							if(result[1]!=null){
						path1 ="${pageContext.request.contextPath }/images/login/"+result[1].sysParamEntry;
					}else{
						path1 ="${pageContext.request.contextPath }/images/login/logo.jpg";
						
					}
					if(result[5]!=null){
						var path2 ="${pageContext.request.contextPath }/images/login/"+result[5].sysParamEntry;
						}else{
						path2 ="${pageContext.request.contextPath }/images/login/logo-ehr.jpg";
						
						}
					if(result[7]!=null){				
					var path3 =result[7].sysParamEntry;
					}else{
					path3 ="Copyright © MyeHR高端人力资源管理软件"
					}
					if(result[0]!=null){
					if(result[0].sysParamEntry!="randomdate"){
						var path4 ="${pageContext.request.contextPath }/images/login/"+result[0].sysParamEntry;
					}else{
						var num = Math.random()*11;
						num = parseInt(num, 10);
						path4 = "${pageContext.request.contextPath }/images/login/"+num+".jpg";
					}
					}else{
						path4 ="${pageContext.request.contextPath }/images/login/login_bg.png";
					}
					/*$('#background-imagepath').val(rules[1]);
					
				
					$('#logopath').val(rules[3]);
					
					$('#logopathsp').val(rules[5]);
					
				
					$('#name').val(rules[7]);
				
					$('#namesp').val(rules[9]);
					
				
					$('#Software').val(rules[11]);
				
					$('#Softwaresp').val(rules[13]);
					
				
					$('#copyright').val(rules[15]);
				
					$('#copyrightsp').val(rules[17]);
					
					ids=[rules[0],rules[2],rules[4],rules[6],rules[8],rules[10],rules[12],rules[14],rules[16]];*/
					var path = "${pageContext.request.contextPath }/images/login/logo.jpg";
					$('#gongsiname').attr('src',path1);
					
					$('#ruanjianname').attr('src',path2);
					/*$('#copyright').attr('value',path3);*/
					$("#copyright").html(path3);
					//$('#main-panel').attr('style',path4);
					$('#main-panel').css("background","url("+path4+")");
					
					$('#main-panel').css("background-repeat","no-repeat");
					$('#main-panel').css("background-size","100%");
	}
	
				});
	 }
</script>  