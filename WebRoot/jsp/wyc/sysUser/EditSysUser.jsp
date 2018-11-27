<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'editDictType.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/tableExport.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
	
	<style type="text/css">
	body{margin-top:20px; }
		td{height:40px;width:80px;   }
		.lable{width:50px}
		input{height:30px;}
		table{width:90%;margin:auto;margin-top:10px;}
	
	</style>
</head>
	
  
  <body>
    <form id="form1" style="width:100%;overflow:hidden;">
        <input id="userId" name="userId" type="hidden" value=1;/>
        <div style="padding-left:11px;padding-bottom:5px;padding-top:3px;">
        
            <table >
               
               <tr>
               		<td class="lable">
               			<label for="userCode">用户编码：</label>
               		</td>
               		<td >
               			 <input id="userCode" name="userCode" style="width:95%;"  readonly="readonly"/>
               		</td>
               		<td class="lable">
               			 <label for="userName">用户名称：</label>
               		</td>
               		<td>
               			<input id="userName" name="userName" style="width:100%;"  readonly="readonly"/>
               		</td>
               </tr>
               <tr>
               		<td class="lable">
               			<label for="userTalephone">用户电话：</label>
               		</td>
               		<td>
               			 <input id="userTalephone" name="userTalephone" style="width:95%;" />
               		</td>
               		<td class="lable">
               			 <label for="userEmail">用户邮箱：</label>
               		</td>
               		<td>
               			 <input id="userEmail" name="userEmail"style="width:100%;"/>
               		</td>
               </tr>
               <tr>
               		<td class="lable">
               			 <label for="userTimeStart">生效时间：</label>
               		</td>
               		<td>
               			 <input id="userTimeStart" name="userTimeStart" style="width:95%;"  />
               		</td>
               		<td class="lable">
               			 <label for="userTimeEnd">失效时间：</label>
               		</td>
               		<td>
               			 <input id="userTimeEnd" name="userTimeEnd" style="width:100%;"/>
               		</td>
               </tr>
               <tr>
               		<td align="right" rowspan="2" class="lable">
               			<label for="userRemark" >备注：</label>
               		</td>
               		<td rowspan="2" colspan="3">
               			 <input id="userRemark" name="userRemark" style="width:100%;height:55px; "/>
               		</td>
               		
               </tr>
               
                
                
            </table>
        </div>
        <div style="padding-left:11px;padding-bottom:5px;padding-top:3px;">
        	<div style="width:300px;margin:auto;">
		        <div style="margin-right:10px;float:left"> 
					<button id="save" class="btn btn-primary" onclick="saveSysUSer()">
						<i class="glyphicon glyphicon-pencil"></i> 保存
					</button>
				</div>
			    <div style="margin-right:10px;float:left"> 
			        <button id="close" class="btn btn-primary" onclick="closex();">
			            <i class="glyphicon glyphicon-off"></i> 关闭
				    </button>
				</div>
			</div>
	    </div>

	
	</form>
	<script>
	$(function(){
		var userId=getQueryString("userId");
		selectById(userId);
	});
	var sysUser;
	
	function selectById(userId){
		 sysUser={userId:userId};
		$.ajax({
			type: 'POST',
			url: "${pageContext.request.contextPath }/SysUserList/findSysUserById.action",
			data:  JSON.stringify(sysUser),
			dataType: 'JSON',
			success: function (data, textStatus, jqXHR) {
			 	 $("#userId").val(data.userId); 
			 	$("#userCode").val(data.userCode);
			 	$("#userName").val(data.userName);
			 	$("#userTalephone").val(data.userTalephone);
			 	$("#userEmail").val(data.userEmail);
			 	if(data.userTimeStart!=null&&data.userTimeStart!=""){
			 		$("#userTimeStart").val(getLocalTime(data.userTimeStart));
			 	}
			 	if(data.userTimeEnd!=null && data.userTimeEnd!=""){
			 		$("#userTimeEnd").val(getTime(data.userTimeEnd));
			 	}
			 	$("#userRemark").val(data.userRemark);
			},
			error: function () { alert("error");}
		});
	}
	
	 function getLocalTime(nS) {     
       return new Date(parseInt(nS)).toLocaleString().replace(/年|月/g, "-").replace(/日/g, " ");      
    }     
	function getTime(nS) {     
	    return new Date(parseInt(nS)).toLocaleString().substr(0,10);
	}   
	function saveSysUSer(){
		 	
			var data=new Object();
			data.userId=$("#userId").val();
			data.userCode=$("#userCode").val();
			data.userName=$("#userName").val();
			data.userTalephone=$("#userTalephone").val();
			data.userEmail=$("#userEmail").val();
			data.userTimeStart=$("#userTimeStart").val();
			data.userTimeEnd=$("#userTimeEnd").val();
			data.userRemark=$("#userRemark").val();
			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysUserList/updateSysUser.action",
				data:  JSON.stringify(data),
				dataType: 'JSON',
				async: false,
				success: function (data, textStatus, jqXHR) {
				    if(data=="0"){
				    	alert("保存成功");
				    	closex();
				    }else{
				    	alert("保存失败");
				    }
				},
				error: function () { alert("error");}
			});
	}
	
	function closex(){
		 var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		 parent.layer.close(index); //执行关闭
	}
	/**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	} 
	
	
	</script>
    
  </body>
</html>
