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
				<td style="padding-left:10px;"  width="150"  ><lable>手机号: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="phoneNum" name="phoneNum" type="text" class="form-control" style="width:200px;"/></td>
				<td> <input type="button" id="getMark"  class="btn btn-primary" value="获取验证码" onclick="saveInfo()"/></td>
				<td> <input type="button" id="backInfo"  class="btn btn-primary" value="返回信息" onclick="backInfo()"/></td>
			</tr>
		</table>
	</div>
</div>
<script type="text/javascript">
function getMark(){
	var num = $("#phoneNum").val();
	$.ajax({
		url:'${pageContext.request.contextPath }/formtemplate/getMark.action?phoneNum='+num,
		type:'POST',
		cache: false,
		async: false,
		dataType: 'json',
		success: function (data) {
				if(data[0].errorMsg == ""){
					alert("已成功向您的手机发送验证码");
				}else{
					alert(data[0].errorMsg);
				}
			}
		})
}

var obj = {};
obj.sendto = 'account110';
obj.sendfrom = 'account120';
obj.messagetext = 'account120发的一条消息';
obj.messagetype = 'text';

function saveInfo(){
	$.ajax({
		url:'http://192.168.1.115:8080/myehr/IM/saveMessage.action',
		type:'post',
		data:JSON.stringify(obj),
		contentType: 'application/json;charset=utf-8',
		cache: false,
		success: function (data) {
			alert(data.messageId);
		}
	})
}

var params = [];
var param = {};
param.id = 1;
param.sendto = 'account110';
param.sendstatus = 1;
param.sendfrom = 'account111';
param.messagetype = 1;
param.messagetitle = 'test';
param.messagecontent = '这是一条测试信息';
param.counttimes = 1;
param.isreadtime = new Date();
param.falsereason = '未知原因2';
params[0]=param;
function backInfo(){
	$.ajax({
		url:'/myehr/login/setWaitSendInfo.action?token=2979cf104d5cdede',
		type:'post',
		data:JSON.stringify(params),
		contentType: 'application/json;charset=utf-8',
		cache: false,
		success: function (data) {
		}
	})
}

</script>
</body>
</html>