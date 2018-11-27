<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/date-format.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/select2.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/select2/js/select2.full.js"></script>
	<link href="${pageContext.request.contextPath }/js/select2/css/select2.min.css" type="text/css" rel="stylesheet" />
	
	





	
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
        <input id="roleId" name="roleId" type="hidden" value=1;/>
        <div style="padding-left:11px;padding-bottom:5px;padding-top:3px;">
        
            <table >
               
               <tr>
               		<td class="lable">
               			<label for="roleCode">角色编码：</label>
               		</td>
               		<td >
               			<div class="form-group has-error">
               			 	<input id="roleCode" class="form-control" name="roleCode" style="width:90%;" />
               			 </div>
               		</td>
               		<td class="lable">
               			 <label for="roleName">角色名称：</label>
               		</td>
               		<td>
               			<div class="form-group has-error">
               			 	<input id="roleName" class="form-control" name="roleName" style="width:100%;" />
               			 </div>
               		</td>
               </tr>
               <tr>
               		<td class="lable">
               			<label for="roleType">角色类型：</label>
               		</td>
               		<td>
               			<div class="form-group has-error">
               				 <input id="roleType" class="form-control" name="roleType" style="width:90%;" />
               			</div>
               		</td>
               		<td class="lable">
               			 <label for="roleParentCode">上级角色编码：</label>
               		</td>
               		<td>
               			 <input id="roleParentCode" class="form-control" name="roleParentCode"style="width:100%;" readonly="readonly"/>
               		</td>
               </tr>
               <tr>
               		<td class="lable">
               			 <label for="roleTimeStart">生效时间：</label>
               		</td>
               		<td>
               			 <input id="roleTimeStart" class="form-control" name="roleTimeStart" 
               			 	onclick="laydate({istime: true ,elem: '#roleTimeStart',format: 'YYYY/MM/DD hh:mm:ss',start:laydate.now(),});" 
               			 	style="width:90%;"/>
               		</td>
               		<td class="lable">
               			 <label for="roleTimeEnd">失效时间：</label>
               		</td>
               		<td>
               			<input id="roleTimeEnd"class="form-control"  name="roleTimeEnd" 
               			 	onclick="laydate({elem: '#roleTimeEnd',format: 'YYYY/MM/DD'});"/>
               		</td>
               </tr>
               
               <tr>
               		<td align="left" rowspan="2" class="lable">
               			<label for="roleDesc" >角色描述：</label>
               		</td>
               		<td rowspan="2" colspan="3">
               			 <input id="roleDesc" class="form-control" name="roleDesc" style="width:100%;height:50px; "/>
               		</td>
               </tr>
            </table>
        </div>
        
        
        <div style="padding-left:11px;padding-bottom:5px;padding-top:3px;">
        	<div style="width:300px;margin:auto;">
		        <div style="margin-right:10px;float:left"> 
					<button id="save" class="btn btn-primary" onclick="saveSysRole()">
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
	
	var roleParentCode = "<%=request.getParameter("roleParentCode")%>" ;
	
	function saveSysRole(){
	
			var roleCode=$("#roleCode").val();
			var roleName=$("#roleName").val();
			var roleType=$("#roleType").val();
			
			var roleTimeStart=$("#roleTimeStart").val();
			var roleTimeEnd=$("#roleTimeEnd").val();
			var roleDesc=$("#roleDesc").val();
			var sysRole;
			if(roleParentCode!=null && roleParentCode!="" && roleParentCode!="null"){
				$("#roleParentCode").val(roleParentCode);
				//document.getElementById("roleParentCode").value=roleParentCode;
				sysRole={roleCode:roleCode,roleName:roleName,roleType:roleType,roleParentCode:roleParentCode,roleTimeStart:roleTimeStart,roleTimeEnd:roleTimeEnd,roleDesc:roleDesc};
			}else{
				var parentCode=$("#roleParentCode").val();
				sysRole={roleCode:roleCode,roleName:roleName,roleType:roleType,roleParentCode:parentCode,roleTimeStart:roleTimeStart,roleTimeEnd:roleTimeEnd,roleDesc:roleDesc};
			}
			
			var data=JSON.stringify(sysRole);			
			if(roleCode==null || roleCode=="" || roleName==null || roleName=="" ){
				alert("请填写完整姓名和编码信息");
			}else{
				$.ajax({
					type: 'POST',
					url: "${pageContext.request.contextPath }/SysRoleList/insertSysRole.action",
					data:  data,
					dataType: 'JSON',
					async: false,
					success: function (data, textStatus, jqXHR) {
					    if(data=="0"){
					    	alert("保存成功");
					    	closex();
					    }else{
					    	alert("保存失败");
					    	document.getElementById("roleCode").value=roleCode;
					    	document.getElementById("roleName").value=roleName;
					    	document.getElementById("roleType").value=roleType;
					    	document.getElementById("roleParentCode").value=roleParentCode;
					    	document.getElementById("roleTimeStart").value=roleTimeStart;
					    	document.getElementById("roleTimeEnd").value=roleTimeEnd;
					    	document.getElementById("roleDesc").value=roleDesc;
					    	
					    	
					    }
					},
					error: function () { alert("error");}
				});
			}
			
	}
	
	function closex(){
		 var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		  parent.location.reload();
		 parent.layer.close(index); //执行关闭
		 
	}
	
	laydate({
	  elem: '#roleTimeEnd', //目标元素。由于laydate.js封装了一个轻量级的选择器引擎，因此elem还允许你传入class、tag但必须按照这种方式 '#id .class'
	  event: 'focus', //响应事件。如果没有传入event，则按照默认的click
	  format: 'YYYY/MM/DD', // 分隔符可以任意定义，该例子表示只显示年月
	  festival: true,
      istoday: true,
	});
	
	
	</script>
    
  </body>
</html>
