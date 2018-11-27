<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/security.js"></script>
<body style="text-align:center">
<div class="container-fluid">
	<div style="margin-top:20px;">
		<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable>输入新密码: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="newPassword" name="newPassword" type="password" class="form-control" style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable>重新输入新密码: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="password" name="password" type="password" class="form-control" style="width:200px;"/></td>
			</tr>
		</table>
	</div>
	<div style="margin:0 auto">
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="save"  class="btn btn-primary" value="确定" onclick="updatePassword()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="closex"  class="btn btn-primary" value="关闭" onclick="closex()"/>
		</div>
	</div>
</div>
<script type="text/javascript">
var mark = "";
window.onload=function(){
}

$("#password").blur(function(){
  checkDouble();
});

function checkDouble(){
	  if($("#newPassword").val()!=$("#password").val()){
	    	alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"两次输入新密码不一致")%>");
	    	return false;
	  }else{
	  		return true;
	  }
}

function updatePassword(){
  	if(checkDouble()==true){
		var newPassword = $("#newPassword").val();
		var password = $("#password").val();
		var url = "${pageContext.request.contextPath }/form/updatePasswordAdmin.action?newPassword="+URLencode(b64_md5(newPassword))+"&userIds=${param.SYSUSER_USER_ID}";  
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
						closex();
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