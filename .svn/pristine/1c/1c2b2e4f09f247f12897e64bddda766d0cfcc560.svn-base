<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/security.js"></script>
<body style="text-align:center">
<div class="container-fluid">
	<div style="margin-top:20px;">
		<table style="margin-top:20px;width: 500px;margin: 100 auto 20px  auto ;" class="cbs-table"  >
		<h1 style="width: 379px;margin: 50 auto;">第一次登录请修改密码</h1>
			<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>用户名: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="userName" name="userName" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;"  readonly="true" style="width: 337px;height: 50;font-size: 20px;"/></td>
			</tr>
			<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>输入旧密码: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
				
				<input id="oldPassword" name="oldPassword" type="text" class="form-control"  style="width: 337px;height: 50;font-size: 20px;"  onfocus="this.type='password'" autocomplete="off" />
			<span id="oldpwd" name="oldpwd" style="color:red;"></span>
				</td>
				
				
			</tr>
			<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>输入新密码: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="newPassword" name="newPassword" type="password" class="form-control"  style="width: 337px;height: 50;font-size: 20px;" readonly="true" onblur="checknewpd()"/>
				<span id="difpwd" name="difpwd" style="color:red;"></span>
				</td>
			</tr>
			<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>重新输入新密码: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="password" name="password" type="password" class="form-control"  style="width: 337px;height: 50;font-size: 20px;" readonly="true"/></td>
				
			</tr>
		</table>
	</div>
	<div style="margin:0 auto">
		<div style="margin-right:10px;display:inline-block;width: 500px;margin:  0 auto;">
		    <input type="button" id="save"  class="btn btn-primary btn-lg btn-block" value="修改密码" onclick="updatePassword()"/>
		</div>
		
	</div>
</div>
<script type="text/javascript">
var mark = "";
var rule='';
var falg = "";
var regx;
function getrule(){
		var url = "${pageContext.request.contextPath }/form/getrule.action"
	 $.ajax({
					url:url,
					type:'post',
					cache: true,
					success: function (result) {
						var rules = result.split("&");
						rule = rules[0];
						falg = rules[1];
						
						regx = rule.split("_");
					}
				});

}
window.onload=function(){
	var userName = getQueryString('userCode');
	$("#userName").val(userName);
	getrule();
 	
}

document.getElementById("oldPassword").oninput = function(){
 	checkOld();
};

function checkOld(){
	  var mark = $("#oldPassword").val();
	  var userCode = $("#userName").val();
	  var updateType = '${param.type}';
	  var url = "${pageContext.request.contextPath }/form/checkPassword.action?password="+b64_md5(mark).replace(/\+/g, "%2B")+"&userCode="+userCode+"&updateType="+updateType+"&pwd="+mark;  
	  if(mark==""){
	    alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"密码不允许为空")%>")
	  	$("#newPassword").attr("readonly",true);
		$("#password").attr("readonly",true);
		return false;
	  }else{
	  $('#oldpwd').html("");
		  $.ajax({
					url:url,
					data:null,
					type:'post',
					contentType: 'application/json;charset=utf-8',
					cache: true,
					success: function (result) {
						if(result[1]=="成功"){
							$("#newPassword").attr("readonly",false);
	  						$("#password").attr("readonly",false);
						}else if(result[1]=="失败"){
							//alert("密码错误,请重新输入");
							$('#oldpwd').html("密码错误,请重新输入");
							//$('#oldpwd').attr("class","glyphicon glyphicon-remove");
						  	$("#newPassword").attr("readonly",true);
						  	$("#password").attr("readonly",true);
						  	return false;
						}
					}
				});
	  		return true;
	  		}
}

$("#password").blur(function(){
  checkDouble();
});


function  checknewpd(){
	$('#difpwd').html("");
   	  var re=new RegExp("[^?!@#$%\^&*]+$");
	  if(regx[0]){
		  //re = new RegExp(".*[a-zA-Z]+.*");//包含字母
		  re = new RegExp(regx[0]);//包含字母
		  if(regx[0]!=="null"){
		  if(re.test($("#newPassword").val())){
			  //re = new RegExp("(?=.*[A-Z].*)(?=.*[a-z].*).");//区分大小写
			  re = new RegExp(regx[1]);//区分大小写
			  if(regx[1]!=="null"){
			  if(re.test($("#newPassword").val())){
				  //return true;
			  }else{
				  $('#difpwd').html("必须包含大小写字母");
			  return false;
			  }
			  }
		  }else{
			  $('#difpwd').html("必须包含字母");
			  return false;
		  }
		  }
	  
		  
		  //re = new RegExp(".*[0-9]+.*");//包含数字
		  re = new RegExp(regx[2]);//包含数字
		  if(regx[2]!=="null"){
		  if(re.test($("#newPassword").val())){
			  
			  //return true;
		  }else{
			  $('#difpwd').html("必须包含数字");
			  
			  return false;
		  }
		  }
		  
		  
		  //re = new RegExp("^[a-zA-Z0-9]{6}$");//限制位数
		  //特殊需求
		  re = new RegExp(regx[3].replace('}',',12}'));//限制位数
		  if(regx[3]!=="null"){
		   if(re.test($("#newPassword").val())){
			  
			  //return true;
		  }else{
			  $('#difpwd').html("位数错误");
			  
			  return false;
		  }
		  }
	  		return true;
	  }else{
	  		return false;
	  }
}

function checkDouble(){
	  mark = b64_md5($("#oldPassword").val());
	  if($("#newPassword").val()!=$("#password").val()){
	    	alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"两次输入新密码不一致")%>");
	    	return false;
	    	
	  }else{
		/*  var re=new RegExp("[^?!@#$%\^&*]+$");
	  if(regx[0]){
		  //re = new RegExp(".*[a-zA-Z]+.*");//包含字母
		  re = new RegExp(regx[0]);//包含字母
		  if(regx[0]!==null||regx[0]!=""){
		  if(re.test($("#newPassword").val())){
			  //re = new RegExp("(?=.*[A-Z].*)(?=.*[a-z].*).");//区分大小写
			  re = new RegExp(regx[1]);//区分大小写
			  if(regx[1]!==null||regx[1]!=""){
			  if(re.test($("#newPassword").val())){
				  //return true;
			  }else{
				  $('#difpwd').html("必须包含大小写字母");
			  return false;
			  }
			  }
		  }else{
			  $('#difpwd').html("必须包含字母");
			  return false;
		  }
		  }
	  
		  
		  //re = new RegExp(".*[0-9]+.*");//包含数字
		  re = new RegExp(regx[2]);//包含数字
		  if(regx[2]!==null||regx[2]!=""){
		  if(re.test($("#newPassword").val())){
			  
			  //return true;
		  }else{
			  $('#difpwd').html("必须包含数字");
			  
			  return false;
		  }
		  }
		  
		  
		  //re = new RegExp("^[a-zA-Z0-9]{6}$");//限制位数
		 //苟军
		  re = new RegExp(regx[3].replace('}',',12}'));//限制位数
		  
		  if(regx[3]!==null||regx[3]!=""){
		   if(re.test($("#newPassword").val())){
			  
			  //return true;
		  }else{
			  $('#difpwd').html("位数错误");
			  
			  return false;
		  }
		  }
	  		return true;
	  }else{
	  		return false;
	  }*/
	  }
}

function updatePassword(){
  if(checkOld()==true){
  	
  		  var newPassword = $("#newPassword").val();
		  var password = $("#password").val();
		  var url = "${pageContext.request.contextPath }/form/updatePassword.action?newPassword="+URLencode(b64_md5(newPassword))+"&password="+URLencode(b64_md5(password))+"&userId=${param.userId}";  
		  if(newPassword!=""){
			$.ajax({
						url:url,
						data:null,
						type:'post',
						contentType: 'application/json;charset=utf-8',
						cache: true,
						success: function (result) {
							if(result[1]=="成功"){
								alert("修改成功");
								go();
							}else if(result[1]=="失败"){
								alert("两次输入新密码不一致");
								 return false;
							}
						}
					});
		  		}else{
				  	alert("新密码不允许为空");
				  	 return false;
				  	}
  	}
  	
  
}
 function  go(){  
                      
window.location.href = "${pageContext.request.contextPath }/login.jsp";  
             }
/**取url参数值  */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");  
    var l = decodeURI(window.location.search);  
    var r = l.substr(1).match(reg);  
    if (r != null) return unescape(r[2]);  
    return null;  
}

function URLencode(url){
	return escape(url).replace(/\+/g,'%2B').replace(/\"/g,'%22').replace(/\'/g,'%27').replace(/\//g,'%2F');
}

function closex(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
</script>
</body>
</html>