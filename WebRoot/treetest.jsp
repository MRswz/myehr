<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bootstrap Table Examples</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/examples.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/zTreeStyle/metro.css" type="text/css"></link>
    <%-- <link rel="stylesheet" href="${pageContext.request.contextPath }/css/tree/zTreeStyle/zTreeStyle.css"> --%>
    <script src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-editable.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/tableExport.js"></script>
    <script src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
    <script src="${pageContext.request.contextPath }/js/ga.js"></script>
    <script src="${pageContext.request.contextPath }/js/jquery.ztree.all-3.5.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/json2/20140204/json2.min.js"></script>
    <![endif]-->
</head>
<body>
<div id="menuContent" class="menuContent" style="width:20%;border:1px solid rgb(170,170,170);z-index:10;float:left">
	<div id="rMenu1">
		<button id="add" class="btn btn-primary btn-xs" onclick="add();"><i class="glyphicon glyphicon-plus"></i> 增加</button>
		<button id="remove" class="btn btn-danger btn-xs" onclick="remove();"><i class="glyphicon glyphicon-remove"></i> 删除</button>
		<button id="update" class="btn btn-info btn-xs"  onclick="update();"><i class="glyphicon glyphicon-pencil"></i> 修改</button>
	</div>
	<ul id="treeDemo" class="ztree" style="margin-top:0; width:20%; height:auto;"></ul>
</div>
<div id="tableContent" class="tableContent" style="width:80%;border:1px solid rgb(170,170,170);z-index:10;float:left">
	<iframe id = "dictList" src="dict/SysDictTypeList.jsp" width="100%" height="750px"></iframe>
</div>
<div id="addMenu" style="display:none;">
	<p><span>父节点ID</span><input id ="pid" value=""/></p>
	<p><span>节点ID</span><input id ="id" value=""/></p>
	<p><span>节点名称</span><input id ="name" value=""/></p>
</div>
<div id="updateMenu" style="display:none;">
	<p><span>父节点ID</span><input id ="pid1" value=""/></p>
	<p><span>节点ID</span><input id ="id1" value=""/></p>
	<p><span>节点名称</span><input id ="name1" value=""/></p>
</div>
<script>

	var zTree;
	var zNodes;
	function reloadTree() {
		$.ajax({
		    type: 'POST',
		    url: "${pageContext.request.contextPath }/dict/selectTree.action",
		    dataType: 'JSON',
		    success: function (data, textStatus, jqXHR) {
		    	zNodes = data;
		        zTree = $.fn.zTree.init($("#treeDemo"), setting, zNodes);
		    },
		    error: function () { alert("error");}
		});  
	    hideRMenu();   
	}
	$(function() {  
	    reloadTree();  
	
	    $("body").bind(//鼠标点击事件不在节点上时隐藏右键菜单  
			"mousedown",  
			function(event) {  
	    		if (!(event.target.id == "rMenu" || $(event.target).parents("#rMenu").length > 0)) {  
	        		$("#rMenu").hide();  
	    		}  
		});  
	});
   
    
	var setting = {
	 	view: {
	 		showLine: false,
	  		addHoverDom: addHoverDom,
	  		removeHoverDom: removeHoverDom,
	  		selectedMulti: true
	 	},
	 	check: {
	  		enable: true,
        	chkStyle: "radio",
        	radioType: "all"
	 	},
	 	data: {
	  		simpleData: {
	   			enable: true
	  		}
	 	},
	 	callback: {
	        onClick: onClickNode,
	        onCheck: onCheck,
	        onRightClick:onRightClick//右键事件  
	    },
	 	edit: {
	  		enable: false
	 	}
	};
	
	//鼠标右键事件-创建右键菜单  
    function onRightClick(e, treeId, treeNode) {  
        if (!treeNode) {  
            zTree.cancelSelectedNode();  
            showRMenu("root", event.clientX, event.clientY);  
        } else if (treeNode && !treeNode.noR) { //noR属性为true表示禁止右键菜单  
            if (treeNode.newrole && event.target.tagName != "a" && $(event.target).parents("a").length == 0) {  
                zTree.cancelSelectedNode();  
                showRMenu("root", event.clientX, event.clientY);  
            } else {  
                zTree.selectNode(treeNode);  
                showRMenu("node", event.clientX, event.clientY);  
            }  
        }  
    }  

    //显示右键菜单  
    function showRMenu(type, x, y) {  
        $("#rMenu ul").show();
        x=x+20; 
        y=y-5; 
        if (type=="root") {  
            $("#m_del").hide();  
            $("#m_check").hide();  
            $("#m_unCheck").hide();  
        }  
        $("#rMenu").css({"top":y+"px", "left":x+"px", "display":"block"});  
    }  
    //隐藏右键菜单  
    function hideRMenu() {  
        $("#rMenu").hide();  
    }  
	
	//节点点击事件
	function onClickNode(e, treeId, treeNode) {
    	var zTree = $.fn.zTree.getZTreeObj("treeDemo");
    	zTree.checkNode(treeNode, !treeNode.checked, null, true);
    	if(treeNode.id=="业务类"){
    		document.getElementById("dictList").src="dict/SysDictTypeList.jsp?dictTypeClass="+1;
    	}
    	if(treeNode.id=="技术类"){
    		document.getElementById("dictList").src="dict/SysDictTypeList.jsp?dictTypeClass="+2;
    	}
    	if(treeNode.pId=="业务类" || treeNode.pId=="技术类"){
    		document.getElementById("dictList").src="dict/SysDictEntryList.jsp?dictTypeId="+treeNode.id;
    	}
    	
    	return false;
	}

	//节点选择事件
	function onCheck(e, treeId, treeNode) {
		document.getElementById("pid").value=treeNode.id;
		document.getElementById("pid1").value=treeNode.pId;
		document.getElementById("id1").value=treeNode.id;
		document.getElementById("name1").value=treeNode.name;
    	var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
    	nodes = zTree.getCheckedNodes(true),
		v = "";
		var parentid = "";
    	var parentlevel = "";
    	for (var i = 0, l = nodes.length; i < l; i++) {
        	v += nodes[i].name + ",";
        	parentid += nodes[i].id + ",";
        	parentlevel += nodes[i].menu_level + ",";
    	}
    	if (v.length > 0) {
        	v = v.substring(0, v.length - 1);
        	parentid = parentid.substring(0, parentid.length - 1);
        	parentlevel = parentlevel.substring(0, parentlevel.length - 1);
    	}
    	else {
        	return;
    	}
	}
	 
	function addHoverDom(treeId, treeNode) {
		var newCount;
	 	var sObj = $("#" + treeNode.tId + "_span");
	 	if (treeNode.editNameFlag || $("#addBtn_" + treeNode.tId).length > 0) return;
	 	var addStr = "<span class='button add' id='addBtn_" + treeNode.tId+ "' title='add node' onfocus='this.blur();'></span>";
	 	sObj.after(addStr);
	 	var btn = $("#addBtn_" + treeNode.tId);
	 	if (btn) btn.bind("click", function () {
	 		if (typeof(newCount) == "undefined"){
	 			newCount=1;
	 		} 
	  		var zTree = $.fn.zTree.getZTreeObj("treeDemo");
	  		zTree.addNodes(treeNode, { id: (100 + newCount), pId: treeNode.id, name: "new node" + (newCount++) });
	  		return false;
	 	});
	};
	function removeHoverDom(treeId, treeNode) {
	 	$("#addBtn_" + treeNode.tId).unbind().remove();
	};
	
	function add() {
		$("#addMenu").show();
        var newpId = document.getElementById("pid").value;
        var newId = document.getElementById("id").value;
        var newName = document.getElementById("name").value;
        var newNode ={id:newId,pid:newpId,name:newName};
        alert(newNode);
        $.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/SysUserList/addTreeNode.action',
			contentType:'application/json;charset=utf-8',
			data:JSON.stringify(newNode),
			success:function(data){//返回json结果
				if(data=='1'){
					alert("用户不存在！");
				}else if(data=='2'){
					alert("密码错误！");
				}else if(data=='0'){
					alert("增加成功！");
				}
			}
			
		});
    }
    function remove() {
        var Id = document.getElementById("id1").value;
        var newNode ={id:Id};
        alert(newNode);
        $.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/SysUserList/deleteTreeNode.action',
			contentType:'application/json;charset=utf-8',
			data:JSON.stringify(newNode),
			success:function(data){//返回json结果
				if(data=='1'){
					alert("用户不存在！");
				}else if(data=='2'){
					alert("密码错误！");
				}else if(data=='0'){
					alert("删除成功");
				}
			}
			
		});
    }  
    function update() { 
    	$("#updateMenu").show();  
        var newpId = document.getElementById("pid1").value;
        var newId = document.getElementById("id1").value;
        var newName = document.getElementById("name1").value;
        var newNode ={id:newId,pid:newpId,name:newName};
        alert(newNode);
        $.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/SysUserList/updateTreeNode.action',
			contentType:'application/json;charset=utf-8',
			data:JSON.stringify(newNode),
			success:function(data){//返回json结果
				if(data=='1'){
					alert("用户不存在！");
				}else if(data=='2'){
					alert("密码错误！");
				}else if(data=='0'){
					alert("修改成功！");
				}
			}
			
		});
    } 
    
    $('#test').bind('input propertychange', function() {
    	var test = document.getElementById("test").value; 
    	document.getElementById("test1").value=test;
    	$('#test1').html($(this).val().length + ' characters');  
	});   
</script>
</body>
</html>
