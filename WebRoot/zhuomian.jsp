<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/security.js"></script>
<body style="text-align:center">
<div class="container-fluid">
	<div style="margin-top:20px;">
		<table style="margin-top:20px;width: 580px;margin: 100 auto 20px  auto ;" class="cbs-table"  >
		<h1 style="width: 379px;margin: 50 auto;">桌面配置</h1>
			<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>桌面背景图地址: </lable></td>
				<input id="background-imagepath_id" name="id" type="hidden" />
				<td style="padding-left:10px;"  align="left"  ><input id="background-imagepath" name="background-imagepath" type="text" class="form-control paramXName"  vtype="illegalChar;maxLength:null;minLength:null;"   style="width: 337px;height: 50;font-size: 20px;"/></td>
				<td align="center"><input id="cb" type="checkbox"  value="true" onclick="checkt()">是否随机</td>
			</tr>	
			<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>logo图地址: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
				<input id="logopath_id" name="id" type="hidden" />
				<input id="logopath" name="logopath" type="text" class="form-control paramXName"  style="width: 337px;height: 50;font-size: 20px;"  onfocus="this.type='text'" autocomplete="off" />
			<span id="oldpwd" name="oldpwd" style="color:red;"></span>
				</td>
				<input id="logopathsp_id" name="id" type="hidden" />
				<td style="height: 70px;display:none "><select id="logopathsp" onchange="func()" class="form-control paramXName" style="width: 72px;height: 50px;font-size: 11px;">
					<option value="1">备用</option>
					<option value="2">备用</option>
					<option value="3">备用</option>
					<option value="4">备用</option>
					</select>
					</td>
				
			</tr>
			<!--<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>公司名称	:</lable></td>
				<input id="name_id" name="id" type="hidden" />
				<td style="padding-left:10px;"  align="left"  ><input id="name" name="name" type="text" class="form-control paramXName"  style="width: 337px;height: 50;font-size: 20px;" />
				</td>
				<input id="namesp_id" name="id" type="hidden" />
				<td style="height: 70px;display: none;"><select id="namesp" onchange="func()" class="form-control paramXName" style="width: 72px;height: 50px;font-size: 11px;">
					<option value="1" >备用</option>
					<option value="2" >备用</option>
					<option value="3" >备用</option>
					<option value="4" >备用</option>
					</select>
					</td>
			</tr>-->
			
			<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>软件厂商: </lable></td>
				<input id="Software_id" name="id" type="hidden" />
				<td style="padding-left:10px;"  align="left"  ><input id="Software" name="Software " type="text" class="form-control paramXName"  style="width: 337px;height: 50;font-size: 20px;" /></td>
				<input id="Softwaresp_id" name="id" type="hidden"/>
				<td style="height: 70px;display:none"><select id="Softwaresp" onchange="func()" class="form-control paramXName" style="width: 72px;height: 50px;font-size: 11px;">
					<option value="1">备用</option>
					<option value="2">备用</option>
					<option value="3">备用</option>
					<option value="4">备用</option>
					</select>
					</td>
			</tr>
			<tr style="height:65px;margin-top: 80px;">
				<td style="padding-left:10px;font-size: 19;"  width="150"  ><lable>版权信息: </lable></td>
				<input id="copyright_id" name="id" type="hidden" />
				<td style="padding-left:10px;"  align="left"  ><input id="copyright" name="copyright " type="text" class="form-control paramXName"  style="width: 337px;height: 50;font-size: 20px;" /></td>
				<input id="copyrightsp_id" name="id" type="hidden" />
				<td style="height: 70px;display:none"><select id="copyrightsp" onchange="func()" class="form-control paramXName" style="width: 72px;height: 50px;font-size: 11px;">
					<option value="1">备用</option>
					<option value="2">备用</option>
					<option value="3">备用</option>
					<option value="4">备用</option>
					</select>
					</td>
			</tr>
		</table>
	</div>
	<div style="margin:0 auto">
		<div style="margin-right:10px;display:inline-block;width: 500px;margin:  0 auto;">
		    <input type="button" id="save"  class="btn btn-primary btn-lg btn-block" value="保存设置" onclick="updatep()"/>
		</div>
		
		
	</div>
</div>
<script type="text/javascript">

var ids=[];
window.onload=function(){
	init();
}
function updatep(){
			var objval = $(".paramXName");
	
	
	
	

	var objvalue = [];
	var charts = [];
	for(var i=0;i<objval.length;i++){
		var bar={};
		bar.sysParamId = ids[i];
		bar.sysParamCode = objval.eq(i).attr("id");
		bar.sysParamEntry = objval.eq(i).val();

		charts.push(bar);
	}
if($("#cb").prop("checked")){
		
	var	cb = "true";
	charts[0].sysParamEntry = 'randomdate';
		
	}else{
		
		cb = "false";
	}
	var b = JSON.stringify(charts);
		  var url = "${pageContext.request.contextPath }/systemParam/saveSystemParamZM.action";
		  
			$.ajax({
						url:url,
						data:JSON.stringify(charts),
						type:'post',
						contentType: 'application/json;charset=utf-8',
						cache: true,
						success: function (result) {
							if(result=="00"){
								alert("修改成功");
								closex();
							}else{
								alert("修改失败");
								 return false;
							}
						}
					});
		  		
  	}
  	function checkt(){
	
}

function init(){
	
	
			var url = "${pageContext.request.contextPath }/systemParam/InitZM.action";
	$.ajax({
					url:url,
					type:'post',
					contentType: 'application/json;charset=utf-8',
					cache: true,
					success: function (result) {
					
					$('#background-imagepath_id').val(result[0].sysParamId);
					$('#background-imagepath').val(result[0].sysParamEntry);
					
					$('#logopath_id').val(result[1].sysParamId);
					$('#logopath').val(result[1].sysParamEntry);
					$('#logopathsp_id').val(result[2].sysParamId);
					$('#logopathsp').val(result[2].sysParamEntry);
					
					
					
					
					$('#Software_id').val(result[5].sysParamId);
					$('#Software').val(result[5].sysParamEntry);
					$('#Softwaresp_id').val(result[6].sysParamId);
					$('#Softwaresp').val(result[6].sysParamEntry);
					
					$('#copyright_id').val(result[7].sysParamId);
					$('#copyright').val(result[7].sysParamEntry);
					$('#copyrightsp_id').val(result[8].sysParamId);
					$('#copyrightsp').val(result[8].sysParamEntry);
					ids=[result[0].sysParamId,result[1].sysParamId,result[2].sysParamId,result[5].sysParamId,result[6].sysParamId,result[7].sysParamId,result[8].sysParamId];
					
	}
	
				});
	
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