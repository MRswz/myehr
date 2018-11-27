<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'DemoJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
 
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/nui/nui.js"></script>    
   
  
  <body>
  	  
	  <div  id="top">
	    		<div id="top-left"><img src="images/logo.png"></img></div>
	  </div> 
	  
	
 
	  <div id="table" >
		<div class="container">
		
			<div style="width:200px;float:left;height:600px;">
				 <ul id="tree" class="mini-tree" url="${pageContext.request.contextPath }/SysRoleList/nuiTree.action?method=LoadTree" 
				    	style="width:200px;padding:5px;" showTreeIcon="true" textField="text" idField="id" parentField="pid" 
				    	resultAsTree="false" dataField="treeNodes" showTreeLines="false" expandOnDblClick="true" onNodeClick=""
				    	 >
				</ul>
			</div>
			<div style="width:200px;height:500px;float:left;  ">  <!-- 菜单树 -->
				<div>
					<button id="addUser"  class="btn btn-primary" onclick="authorize()">
							 授权
					</button>
				</div>
				div style="width:200px;float:left;height:600px;">
				 <ul id="tree" class="mini-tree" url="${pageContext.request.contextPath }/SysMenuList/nuiTree.action?method=LoadTree" 
				    	style="width:200px;padding:5px;" showTreeIcon="true" textField="text" idField="id" parentField="pid" 
				    	resultAsTree="false" dataField="treeNodes" showTreeLines="false" expandOnDblClick="true" onNodeClick=""
				    	 >
				</ul>
			</div>
			</div>
		</div> 
	</div>  
  </body>

  <script>
 	
 
 	var zTree;
	var zNodes;
	  //菜单树
	var zTreeMenu;
	var zNodesMenu;
	
	
	$(function() {  
	    sysRoleTree();  
	    reloadTree();
	});
	
		//角色树
   function sysRoleTree() {
		$.ajax({
		    type: 'POST',
		    url:  "${pageContext.request.contextPath }/SysRoleList/searchSysRoleTree.action",
		   
		    dataType: 'JSON',
		    success: function (data, textStatus, jqXHR) {
		    
		    	zNodes = data;
		        zTree = $.fn.zTree.init($("#sysRoleTree"), setting, zNodes);
		    },
		    error: function () { alert("error2");}
		});  
	}
	
	
	
	//角色
	var setting = {
	 	view: {
	 		showLine: false,
	  		selectedMulti: true
	 	},
	 	check: {
	  		enable: true,
        	chkStyle: "radio",
        	radioType: "all",
	 	},
	 	data: {
	  		simpleData: {
	   			enable: true
	  		}
	 	},
	 	callback: {
	        onClick: onClickNodeRole,
	    },
	 	edit: {
	  		enable: false
	 	}
	};
	
	
	//角色 点击事件  根据角色id查询  配置菜单      如何让菜单树让授权的为选中
	
	function onClickNodeRole(e, treeId, treeNode) {
    	var zTree = $.fn.zTree.getZTreeObj("sysRoleTree");
    	var condition=new Object();
    	condition.roleId=getRoleId(treeNode.id);
    	var date= JSON.stringify(condition);
    	$.ajax({
		    type: 'POST',
		    data:date,
		    url: "${pageContext.request.contextPath }/SysMenuRoleList/searchSysMenuRoleList.action",
		    dataType: 'JSON',
		    success: function (data, textStatus, jqXHR) {
		    	//所有的授权的菜单查出来     进行回显     待做！！
		    	
		    },
		    error: function () { alert("error  click");}
		});  
	}
	
	
	//通过code查询roleid   code也是唯一
	function getRoleId(e){
    	var condition=new Object();
    	condition.roleCode=e;
    	var date= JSON.stringify(condition);
		var roleId;
		$.ajax({
		    type: 'POST',
		    data:date,
		    url: "${pageContext.request.contextPath }/SysRoleList/getByRoleCode.action",
		    dataType: 'JSON',
		    async: false,
		    success: function (data) {
		   		 roleId=data.roleId;
		    },
		    error: function () { alert("error roleId");}
		});  
		return roleId;
	}
	
	//通过menucode获取menuid  唯一
	function getMenuId(e){
    	var condition=new Object();
    	condition.menuCode=e;
    	var date= JSON.stringify(condition);
		var menuId;
		$.ajax({
		    type: 'POST',
		    data:date,
		    url: "${pageContext.request.contextPath }/SysMenuList/searchByCode.action",
		    dataType: 'JSON',
		    async: false,
		    success: function (data) {
		   		 menuId=data.rows[0].menuId;
		    },
		    error: function () { alert("error menuId");}
		});  
		return menuId;
	}
	
   function reloadTree() {
		$.ajax({
		    type: 'POST',
		    url: "${pageContext.request.contextPath }/SysMenuList/selectSysMenuTree.action",
		    dataType: 'JSON',
		    success: function (data, textStatus, jqXHR) {
		    	zNodesMenu = data;
		        zTreeMenu = $.fn.zTree.init($("#treeDemo"), setting2, zNodesMenu);
		        
		    },
		    error: function () { alert("error");}
		});  
	}
    
    //菜单
	var setting2 = {
	 	view: {
	 		showLine: false,
	  		selectedMulti: true
	 	},
	 	check: {
	  		enable: true,
			chkStyle: "checkbox",
			chkboxType: { "Y": "s", "N": "ps" }
	 	},
	 	data: {
	  		simpleData: {
	   			enable: true
	  		}
	 	},
	 	callback: {
	        onClick: onClickNode,
	    },
	 	edit: {
	  		enable: false
	 	}
	};
	
	
	//  菜单节点点击事件
	function onClickNode(e, treeId, treeNode) {
    	
	}
 	
 	//授权事件     获取角色树 点击的节点id    roleId         获取菜单树选取的菜单的节点的 id 集合  循环存             
 	function authorize(){
 		var roleId;
 		var menuIds=new Array();
 		var roleObj=$.fn.zTree.getZTreeObj("sysRoleTree");
 		var menuObj=$.fn.zTree.getZTreeObj("treeDemo");
 		nodes=roleObj.getCheckedNodes(true);
		menuNodes=menuObj.getCheckedNodes(true);
 		//判断有没有选中角色和菜单节点
 		if(nodes.length>0 && menuNodes.length>0){
			 //通过id获取到的是   menuCode   改成id   多个的话循环
			 var menuid=0;
			for(var i=0;i<menuNodes.length;i++){
				//判断是不是父节点
				alert(menuNodes[i].isParent);
				if(menuNodes[i].isParent==false){
					var id=menuNodes[i].id;
					menuIds[menuid]=getMenuId(id);
					menuid++;
				};
				//menuIds[i].menuId=getMenuId(menuNodes[i].id);
			}
			 roleId=getRoleId(nodes[0].id); //获取选中节点的值     rolecode;
			 var code=select(roleId);
			 //判断是否存在授权
			 if(code==2){
			 	deleteMenuRole(roleId);
			 }
			 var code = addMenuRole(roleId,menuIds);
			 if(code==2){
			 	alert("授权成功");
			 }else{
			 	alert("授权失败，请联系管理员");
			 }
 		}else{
 			alert("请选择角色及菜单");
 		}
 	}
 	
 	function deleteMenuRole(roleId){
 		var condition=new Object();
    	condition.roleId=roleId;
    	var date= JSON.stringify(condition);
    	$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysMenuRoleList/deleteSysRoleMenu.action",
				data: date,
				dataType: 'JSON',
				 async: false,
				success: function (data, textStatus, jqXHR) {
				},
				error: function () { alert("error");}
			});
 	}
 	
 	function select(roleId){
 		var condition=new Object();
    	condition.roleId=roleId;
    	var data= JSON.stringify(condition);
    	code=1;
    	$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysMenuRoleList/searchSysMenuRoleList.action",
				data: data,
				dataType: 'JSON',
				 async: false,
				success: function (data, textStatus, jqXHR) {
					if(data.rows.length>0){
						code=2;
					}
				},
				error: function () { alert("error");}
			});
			return code;
 	}
 	
 	function addMenuRole(roleId,menuIds){
 		var code=1;
 		for(var i=0;i<menuIds.length;i++){
 			var sys=new Object();
 			sys.roleId=roleId;
 			sys.menuId=menuIds[i];
 			var data= JSON.stringify(sys);
 			
 			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysMenuRoleList/insertSysRoleMenu.action",
				data: data,
				dataType: 'JSON',
				 async: false,
				success: function (data, textStatus, jqXHR) {
					code=2;
				},
				error: function () { alert("error");}
			});
 		}
 		return code;
 	}
 	
 	
 	
	

	
  

</script>
  
  
</html>
