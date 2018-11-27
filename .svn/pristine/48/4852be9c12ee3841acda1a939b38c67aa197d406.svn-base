<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
	String nodeId = request.getParameter("nodeId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
	<div  style="text-align:center width:500px;hight:50%;">
	<h1 style="height: 70px;margin-top: 50;">用户密码初始配置：</h1>
<br>
<table>
<div class="container-fluid">
	<div style="margin-top:20px;">
		<table style="width: 500;margin:  0 auto;" class="cbs-table"  >
			<tr>
	<td style="font-size: 19;"  width="200"  ><lable>用户密码初始配置： </lable>
	
	</td>
				<td style="height: 70px;"><select id="password" onchange="func()" class="form-control" style="width:  300;height: 50;font-size: 20;">
					<option value="1" >...请选择...</option>
					<option value="2">默认(000000)</option>
					<option value="3">身份证后六位</option>
					<option value="4">自定义</option>
					</select>
					</td>
			</tr>
			
					
					
				<tr class="table_header">
					<td style="margin-right: 195px;padding-right: 99px;height: 50;"  width="150" align="center" ><lable style="font-size: 19;">密码的位数(x-12位): </lable></td>
					<td align="center" style="height: 70px;"><input id="cb3" name="cb3" type="input"   value="6" class="form-control" onchange="checkt3()" style="width:  300;height: 50;font-size: 20;"></td>
				</tr>
		</table>
				<table style="width: 500;margin:  0 auto;height: 100;font-size: 20px;" class="cbs-table">
					<tr class="table_header">
						<td align="center"><input id="cb" type="checkbox"  value="true" onclick="checkt()">是要含字母</td>
						<td align="center"><input id="cb1" type="checkbox" value="true" onclick="checkt1()">区分大小写</td>
						<td align="center"><input id="cb2" type="checkbox"  value="true" onclick="checkt2()">是否要数字</td>
					</tr> 
				</table>	
					
		
			
		
	</div>
	<div style="margin:0 auto">
		<div style="margin-right:0px;display:inline-block">
		    <input type="button" id="save"  class="btn btn-primary" value="确定" onclick="update()" style="width: 500;height: 50;font-size: 20;"/>
		</div>
	</div>
</div>
</table>
</div>

<script type="text/javascript">
var mark = "";
window.onload=function(){
	init()
}
var password="";
var cb = "false";
var cb1 = "false";
var cb2 = "false";
var cb3 = "true";
var cd = '6';
var pwd='';
var falg = "";
function init(){
	var url = "${pageContext.request.contextPath }/form/getInit.action"
	$.ajax({
					url:url,
					
					type:'post',
					
					cache: true,
					success: function (result) {
						var rules = result.split("&");
						pwd = rules[0];
						falg = rules[1];
						cd = rules[2];
						$("#cb3").val(cd);
						if("000000"==pwd){
		$('#password').val(2);
	}else if("IDCard"==pwd){
		$('#password').val(3);
	}else{
		$('#password').val(4);
	}
	password = pwd;
	var sign = falg.split(",");
	if(sign[0]=="true"){
	$("#cb").prop("checked",true);
	cb = sign[0];
	}
	if(sign[1]=="true"){
	$("#cb1").prop("checked",true);
	cb1 = sign[1];
	}
	if(sign[2]=="true"){
	$("#cb2").prop("checked",true);
	cb2 = sign[2];
	}
	
	$("#cb3").prop("checked",true);
	cb3 = true;
	
	}
	
				});
	
}
function func(){
	var vs = $('#password').val();
	if(vs==2){
	
	password="000000";
	}else if(vs==3){
		
		
		password="IDCard";
	}else if(vs==4){
		
		var pw = prompt("请输入你的:","");
		alert(pw);
		password = pw;
	}
}




 
function checkt(){
	if($("#cb").prop("checked")){
		
		cb = "true";
	}else{
		
		cb = "false";
	}
}

function checkt1(){
	if($("#cb1").prop("checked")){
		
		cb1 = "true";
	}else{
		
		cb1 = "false";
	}
}
function checkt2(){
	if($("#cb2").prop("checked")){
		
		cb2 = "true";
	}else{
		
		cb2 = "false";
	}
}
function checkt3(){
	cd = $("#cb3").val();
}

function update(){
			var cbstr=cb+","+cb1+","+cb2+","+cb3;
			
			var SysParamType = "用户密码初始配置"
			
		  var url = "${pageContext.request.contextPath }/systemParam/saveSystemParamPW.action?password="+password+"&cbstr="+cbstr+"&SysParamType="+SysParamType+"&cd="+cd; 
		  if(password!=""){
			$.ajax({
						url:url,
						data: null,
						type:'post',
						contentType: 'application/json;charset=utf-8',
						cache: true,
						success: function (result) {
							if(result=="1"){
								alert("修改成功");
								closex();
							}else if(result=="2"){
								alert("更新成功");
								 closex();
							}
						}
					});
		  		}else{
				  	alert("新密码不允许为空");
				  	 return false;
				  	}
  	
  	
  
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
</body>
</html>
