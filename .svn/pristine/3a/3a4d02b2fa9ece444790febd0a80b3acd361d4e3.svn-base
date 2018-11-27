<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>		
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/nui/nui.js"></script>
</head>

<body>


	<div>
	
	
		 <div style="width:200px;float:left;height:600px;">
			 <ul id="tree" class="mini-tree" url="${pageContext.request.contextPath }/SysRoleList/nuiTree.action?method=LoadTree" 
			    	style="width:200px;padding:5px;" showTreeIcon="true" textField="text" idField="id" parentField="pid" 
			    	resultAsTree="false" dataField="treeNodes" showTreeLines="false" expandOnDblClick="true" onNodeClick="onNodeClick"
			    	 >
			</ul>
		</div>
		
		<div class="table" style="float:left;height:600px; " >
			
			 <iframe src="SysRole.jsp" marginwidth="1" marginheight="1" name="iframe" id="iframe"  width="1100" height="600" frameborder="0"></iframe>		
 			
 		
 		
 		</div>
 	</div>
	<script>
		function onNodeClick(){
			var tree = mini.get("tree");
            var node=tree.getSelectedNode(); 
            var pid=node.id;            
            
            document.getElementById("iframe").setAttribute("src","SysRole.jsp?parentCode="+pid);
            
		}
		
	
	
		
	</script>  
</body>
</html>