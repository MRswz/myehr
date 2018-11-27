<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/common.jsp"%>
<html>

<head>
<title>排班日历管理</title>
</head>
<body>
<div id="layout1" class="nui-layout" style="width:100%;height:100%;">
	<div title="排班日历管理" region="west" bodyStyle="overflow:hidden;" width="200" class="sub-sidebar" allowResize="false">
		<ul id="tree" class="nui-tree" style="width:100%;height:100%;padding:5px;" 
			showTreeIcon="true" textField="nodeName"  onnodeclick="onNodeClick"
			idField="nodeId" resultAsTree="true" dataField="treeNodes"  contextMenu="#treeMenu"
			onbeforeload="onBeforeTreeLoad" onload="load" >
	    </ul>
	    <ul id="treeMenu" class="mini-contextmenu"  onbeforeopen="onBeforeOpen">        
			<li id="add" name="add"  onclick="addChildFolder">新增子目录</li>
			<li id="edit" name="edit"  onclick="editSysFormFolder">编辑目录</li>
			<li id="remove" name="remove"  onclick="onRemoveNode">删除目录</li>        
		</ul>
	</div>
	<div title="center" region="center" style="border:0;padding-left:0px;padding-top:0px;">
		<iframe id="main" frameborder="0" name="main"  width="100%" height="100%" border="0" scroll="yes" style="margin-top: 0px;" ></iframe>
    </div>
</div>
</body>
<script type="text/javascript">
	nui.parse();
	var currentNode = null;
    var tree = null;
    
    $(function() {
	    tree = nui.get("tree");
	    var contextPath = "<%=contextPath %>";
	    var defaultNode = {nodeId:"root", nodeParent:"", nodeCode:"root", nodeName: "排班管理树", nodeType: "Default", isLeaf: false, expanded: false, iconCls: "icon-arrow-merge"};
	    
	    tree.addNode(defaultNode);
	    tree.selectNode(defaultNode);
	    currentNode = defaultNode;
	    refreshNode(defaultNode);
	    showNodePage(defaultNode);
	});
	
	function onBeforeTreeLoad(e) {
		e.url = "com.dcf.system.scheme.schemeComp.buildSchemeTree.biz.ext?nodeParent=" + e.node.nodeParent + "&nodeCode=" + e.node.nodeCode + "&nodeId=" + e.node.nodeId + "&nodeExt=" + e.node.nodeExt;
		e.params.nodeType = e.node.nodeType;
	}
	
	var type_list = { title: '计算方案', url: "<%=contextPath %>/system/scheme/queryScheme.jsp" };
	var entry_list = { title: '计算公式', url: "<%=contextPath %>/system/scheme/queryFormula.jsp" };
	var ruleInfo = { title: '公式明细', url: "<%=contextPath %>/system/scheme/editFormula.jsp" };
	
	var paramtabs_map = {
		Default: [type_list],
		FO: [type_list],
		T: [entry_list],
		F: [ruleInfo]
	};
	
	function onNodeClick(e){
		currentNode = e.node;
		showNodePage(e.node);
	}
	
	function showNodePage(node) {
		var nodeType = node.nodeType;
		var main = document.getElementById("main");
		var paramtabs = paramtabs_map[nodeType];
		main.src = setUrlParam(paramtabs[0].url, node);
	}
	
	function setUrlParam(url,params){
		if(!url){
			return url;
		}
		var paramsStr = [];
		for(var prop in params){
			paramsStr.push(prop + "=" + params[prop]);
		}
		if(url.indexOf("?")>=0){
			url =  url + "&" + paramsStr.join("&");
		}else{
			url =  url + "?" + paramsStr.join("&");
		}
		if(params.nodeType=='F'){
			var parentNode = tree.getParentNode(params);
			url =  url + "&solutionId=" +parentNode.nodeId;
		}
		return encodeURI(url);
	}
	
	this.refreshNode = function(node) {
		tree.loadNode(node);
	}
	
	this.getCurrentNode = function() {
		return currentNode;
	}
	
	function refreshCurrentNode() {
		tree.loadNode(currentNode);
	}
	
	function load(e) {
		var nodeType = e.node.nodeType;
		if(nodeType=="Default") {
			var results = tree.getChildNodes(currentNode);
			if(results!=null && results.length>0) {
				refreshNode(results[0]);
			}
		}
	}
	
	//增加子目录
	function addChildFolder(){
		var node = tree.getSelectedNode();
		nui.open({
            url: "<%=request.getContextPath() %>/system/scheme/addSolutionFolder.jsp?parentNodeId="+node.nodeId,
            title: "新增目录", 
            width: 600, height: 350, allowResize: false,
            ondestroy: function (action) {
            	if (action == "ok") {
                	tree.selectNode(node);
                	refreshCurrentNode()
                }
            }
        });
	}
	
	function editSysFormFolder(){
	  var node = tree.getSelectedNode();
		nui.open({
            url: "<%=request.getContextPath() %>/system/scheme/addSolutionFolder.jsp?folderTreeId=" + node.nodeId,
            title: "修改表单目录", 
            width: 450, height: 250, allowResize: false,
            onload: function () {               
           		
            },
            ondestroy: function (action) {
            	if (action == "ok") {
                	tree.selectNode(node);
                	refreshCurrentNode();
                }
            }
        });
	}


	function onRemoveNode(){
		var node = tree.getSelectedNode();
		var json = nui.encode({folderTreeId:node.nodeId});
		$.ajax({
            url: "com.dcf.system.scheme.schemeComp.validateRemoveNode.biz.ext",
            type: 'POST',
            data: json,
            cache: false,
            contentType:'text/json',
            success: function (text) {
            	if(text.reCode=="1"){	            		
            		nui.confirm("确定删除该节点？","删除确认",function(action){
					    if(action!="ok") return;
					    
				        $.ajax({
				            url: "com.dcf.system.scheme.schemeComp.deleteSolutionFolder.biz.ext",
				            type: 'POST',
				            data: json,
				            cache: false,
				            contentType:'text/json',
				            success: function (text) {
				            	if (text.reCode == "1") {
			              			var parentNode = tree.getParentNode(node);
				            		tree.loadNode(parentNode);
				            		tree.selectNode(parentNode);
				            		refreshCurrentNode();
			              		} else {
			              			nui.alert("表单目录删除失败！", "系统提示", function(action){
				              		});
			              		}
				            },
				            error: function () {
            					nui.alert(jqXHR.responseText);
				            }
				        });
			        });
            	}else if(text.reCode=="-1"){
            		nui.alert("请先删除当前节点及子节点下所有目录和表单");
            	}
            },
            error: function () {
            }
        });
	}
	
	//表单目录树右键菜单
	function onBeforeOpen(e) {
	    var menu = e.sender;
	    var tree = mini.get("tree");
	
	    var node = tree.getSelectedNode();
	    if (!node) {
	        e.cancel = true;
	        return;
	    }
	    if (node && node.nodeId == "root") {
	    //    e.cancel = true;
	    	 document.getElementById("edit").style.display="none";
	   		 document.getElementById("remove").style.display="none";
	        //阻止浏览器默认右键菜单
	        e.htmlEvent.preventDefault();
	        return;
	    }else{
	    	 document.getElementById("edit").style.display="block";
	   		 document.getElementById("remove").style.display="block";
	   		  //阻止浏览器默认右键菜单
	        e.htmlEvent.preventDefault();
	        return;
	    }
	}
</script>
</html>