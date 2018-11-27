<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>

		<div class="BTNGROUP BTNGROUP_2131" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<!---->
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" class="btn btn-success" value="导入用户" onclick="importAllUserToIM()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" class="btn btn-success" value="生成私钥" onclick="getPrivate()"/>
			</div>
			
			<label>用户编码</label><input type="text" class="form-control" id="userCode"/>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" class="btn btn-success" value="导入所有好友" onclick="importFrendAll()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" class="btn btn-success" value="创建分组" onclick="initGroupInfoAll()"/>
			</div>
		</div>

<script>
function importAllUserToIM(){
 	$.ajax({  
                type: 'POST', 
                url: '${pageContext.request.contextPath }/login/importAllUserToIM.action',  
                success: function (data) {  
                    
                }
            });
}
  
function getPrivate(){
 	$.ajax({  
                type: 'POST', 
                url: '${pageContext.request.contextPath }/appLogin/getPrivateStr.action',  
                success: function (data) {  
                    
                }
            });
} 
var userCode = $("#userCode").val();
function importFrendAll(){
 	$.ajax({  
                type: 'POST', 
                url: '${pageContext.request.contextPath }/login/importFrendAll.action?userCode='+userCode,  
                success: function (data) {  
                    
                }
            });
}  
function initGroupInfoAll(){
 	$.ajax({  
                type: 'POST', 
                url: '${pageContext.request.contextPath }/login/initGroupInfoAll.action?userCode='+userCode,  
                success: function (data) {  
                    
                }
            });
}          
</script>
</body>
</html>
