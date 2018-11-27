<%@page pageEncoding="UTF-8" import="com.myehr.common.util.LangUtil" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/common.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title></title>
</head>
<body>
<div id="layout1" class="nui-layout" style="width:100%;height:100%;position:relative">
<div title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"菜单树")%>" region="west" style="float:left;overflow:auto;width:200px;height:100%" bodyStyle="overflow:hidden;" showHeader="false"
	showFilter="false"
	class="sub-sidebar" allowResize="false">
	<div class="form-control" id="jsp" style="height:100%;padding:5px;">
		<ul id="tree_org_tree" class="ztree" parentField="menuParentCode" >
		</ul>
	</div>
	</div>
	<div id="iframe" title="center" region="center" style="border:0;width:60%;height:100%;float:left">
	<iframe id="main" frameborder="0" name="main"  width="100%" height="100%" border="0" scroll="yes" style="margin-top: 0px;" ></iframe>
	</div>
</div>
</body>
<script type="text/javascript">
var width="200px".split("p");
var userId = '${sessionScope.userid}';
var setting = {
			//勾选 checkbox 对于父子节点的关联关系
			check: {enable: false,chkboxType: {"Y":"ps", "N":"ps"}  },
			data: {
				key: {title: "title"},
				//使用简易数据模式，即id  pid,一定要注意大小写
				simpleData: {
					enable: true,
					idKey: "schemeCode",
					pIdKey: "parentCode",
					rootPId: 2 //根节点pid 
				}
			},
			callback: {onCheck: onCheck,onClick:onClick,onAsyncSuccess:onAsyncSuccess,onAsyncError: zTreeOnAsyncError},
			//这个async是插件封装的ajax
			async: {
				enable:true, // 需要异步加载
				type:"get",
				url:"${pageContext.request.contextPath }/SysMenuList/buildSysSchemeTree.action?params={s_userId:userId}",//ajax的请求地址
				autoParam:["id","level=lv"], //传递的参数 id lv（层级，最开始是0）
				dataFilter: filter
			},
			//双击节点时，是否自动展开父节点的标识
			view: { dblClickExpand: false}, 
		};
		var paramtabs_map = {N: [{title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构树")%>', url:'<%= basePath%>system/menu/schemeList.jsp'}]}		
		//数据过滤  childNodes其实是ajax返回的数据
		function filter(treeId, parentNode, childNodes) {
				if (!childNodes) return null;
					for (var i=0, l=childNodes.length; i<l; i++) {
						childNodes[i].name = childNodes[i].schemeName.replace(/\.n/g, '.');
					}
					return childNodes;
				}
		function beforeClick(treeId, treeNode) {
				if (!treeNode.isParent) {
					alert("请选择父节点");
						return false;
					} else {
						return true;
					}
		}
		//节点预加载2级数据，用于捕获异步加载正常结束的事件回调函数
		var maxLevel = 2;
		function onAsyncSuccess(event, treeId, treeNode){
				if(treeNode && treeNode.level >= maxLevel - 1 ){
					return;
				}
				var zTree = $.fn.zTree.getZTreeObj("tree_org_tree");
				var type = 'refresh';//清空后重新加载
				var silent = true;//不展开父节点，其他值或缺省状态都自动展开
				//加载根节点时，treeNode是不存在的null，所以一定要做处理
				var nodes = treeNode ? treeNode.children : zTree.getSelectedNodes();
				for (var i=0, l=nodes.length; i<l; i++) {
					if(nodes[i].isParent){
					//强行异步加载父节点的子节点,点击之后运行这个函数，只传父节点过去,注意设置属性isParent
						zTree.reAsyncChildNodes(nodes[i], type, silent);
						if (!silent) zTree.selectNode(nodes[i]);
					}
				}
				var selectedNode = zTree.getSelectedNodes();
				var nodes = zTree.getNodes();
				zTree.expandNode(nodes[0], true);
				var iFrameWidth = $(window).width()-width[0];
				$("#main").width(iFrameWidth+"px");
						document.getElementById("main").src = setUrlParam(paramtabs_map["N"][0].url, nodes[0].children[0]);
				}
				$(window).resize(function() {
					var iFrameWidth = $(window).width()-width[0];
					$("#main").width(iFrameWidth+"px");
				});
		//点击事件
		function onClick(event, treeId, treeNode){  
				var switchBtn = treeNode.tId+'_switch';
				if(1>2){
					$("#"+switchBtn).click();
				}else{
					if(typeof(paramtabs_map)=='undefined'){
						return;
					}
					var nodeType = treeNode.ORG_DEL;
					var main = document.getElementById("main");
					var paramtabs = paramtabs_map[nodeType];
					if(!paramtabs) return;
					main.src = setUrlParam(paramtabs[0].url,treeNode);
				}
		}; 
		//用于捕获异步加载出现异常错误的事件回调函数
		function zTreeOnAsyncError(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown) {
			alert(XMLHttpRequest);
		};
		//自定义设置节点属性,在本DEMO中并无实质意义
		function setTitle(node) {
				var zTree = $.fn.zTree.getZTreeObj("tree_org_tree");
				var nodes = node ? [node]:zTree.transformToArray(zTree.getNodes());
				for (var i=0, l=nodes.length; i<l; i++) {
					var n = nodes[i];
					n.title = "[" + n.id + "] isFirstNode = " + n.isFirstNode + ", isLastNode = " + n.isLastNode;
					console.log(n.title);
					zTree.updateNode(n);
				}
		}
		//选中后触发函数
		function onCheck(e, treeId, treeNode) {
			var zTree = $.fn.zTree.getZTreeObj("tree_org_tree");
			var selectedNode = zTree.getCheckedNodes(true);alert(treeNode.tId + ", " + treeNode.name + "," + treeNode.checked);
			count();
		}
		//拿到点击的总个数
		function count() {
			function isForceHidden(node) {
				if (!node.parentTId) return false;
				var p = node.getParentNode();
					return !!p.isHidden ? true : isForceHidden(p);
			}
			var zTree = $.fn.zTree.getZTreeObj("tree_org_tree"),
			checkCount = zTree.getCheckedNodes(true).length,
			nocheckCount = zTree.getCheckedNodes(false).length,
			hiddenNodes = zTree.getNodesByParam("isHidden", true),
			hiddenCount = hiddenNodes.length;
			for (var i=0, j=hiddenNodes.length; i<j; i++) {
				var n = hiddenNodes[i];
				if (isForceHidden(n)) {
					hiddenCount -= 1;
				} else if (n.isParent) {
					hiddenCount += zTree.transformToArray(n.children).length;
				}
			}
			$("#checkCount").text(checkCount);
			$("#nocheckCount").text(nocheckCount);
		}
		function showNodes() {
				var zTree = $.fn.zTree.getZTreeObj("tree_org_tree"),
				nodes = zTree.getNodesByParam("isHidden", true);
				zTree.showNodes(nodes);
				setTitle();
				count();
		}
		function hideNodes() {
				var zTree = $.fn.zTree.getZTreeObj("tree_org_tree"),
				nodes = zTree.getSelectedNodes();
				if (nodes.length == 0) {
					alert("Please select one node at least.");
					return;
				}
				zTree.hideNodes(nodes);
				setTitle();
				count();
		}
		$(document).ready(function(){
		var height = $(window).height()-50;
		$("#jsp").css("height","100%");
		//zTree 初始化方法
			$.fn.zTree.init($("#tree_org_tree"), setting);
			$("#hideNodesBtn").bind("click", {type:"rename"}, hideNodes);
			$("#showNodesBtn").bind("click", {type:"icon"}, showNodes);
			setTitle();
			count();
});
var _gparamsobj= {};
//全局参数
var currentNode = null;	
var paramtabs_map;
var _treegridselectedrows=null;
function showNodePage(){
		initflag = 1;
		onNodeClick(currentNode);
}
function onNodeClick(node) {
		if(typeof(paramtabs_map)=='undefined'){
			return;
		}
		var nodeType = node.ORG_DEL;
		var main = document.getElementById("main");
		var paramtabs = paramtabs_map[nodeType];
		if(!paramtabs) return;
		main.src = setUrlParam(paramtabs[0].url, node);
}
function setUrlParam(url,params){
	if(url.indexOf("?")>=0){
		url =  url + "&aa=dd&intrToId=${param.intrToId}&intrButtonId=${param.intrButtonId}";
	}else{
		url =  url + "?aa=dd";
	}
	if(!url){
		return url;
	}
	var paramsStr = [];
	//nui.alert(_gparamsobj);
	if(_gparamsobj){
		for(var prop in _gparamsobj){
			//nui.alert(prop);
			paramsStr.push(prop + "=" + _gparamsobj[prop]);
		}
	}
	for(var prop in params){
		paramsStr.push(prop + "=" + params[prop]);
	}
	if(url.indexOf("?")>=0){
		url =  url + "&" + paramsStr.join("&");
	}else{
		url =  url + "?" + paramsStr.join("&");
	}
	url+="&isInit=true";
	return encodeURI(url);
}
function search() {
	var key = nui.get("key").getValue();
	if (key == "") {
		tree.clearFilter();
	} else {
		key = key.toLowerCase();
		tree.filter(function (node) {
var ORG_ABBREVIATION = node.ORG_ABBREVIATION ? node.ORG_ABBREVIATION.toLowerCase() : "";
	if (ORG_ABBREVIATION.indexOf(key) != -1) {
			return true;
		}
	});
}
}
	function onBeforeOpen(e) {
		var menu = e.sender;
		var node = tree.getSelectedNode();
		if (!node) {
			e.cancel = true;
			return;
		}
	} 
	//刷新
	function reload(){
		 window.location.reload();
	}
	// 展开
	function expandNode() {
		var node = tree.getSelectedNode();
		if (node) {
			tree.expandNode(node);
		}
	}
	//折叠
	function collapseNode() {
		var node = tree.getSelectedNode();
		if (node) {
			tree.collapseNode(node);
		}
	}
	//选中按钮js区域
	//选中按钮使用的GetData方法 （自定生成）
	function GetData(){
		if(_treegridselectedrows!=null){
			return _treegridselectedrows;
		}else{ 
			var selectTree = nui.get('tree_org_tree');  
			var selectNodes = null ;
			var snode = selectTree.getSelectedNode();
			if(snode){;
				selectNodes=[snode];
			}
			if(selectNodes!=null&&selectNodes.length>0){
				return selectNodes;		
			}
		}
	}
	//选中按钮使用的按钮点击方法 （自定生成）
	function SetData(data){
		if(_treegridselectedrows){
			return _treegridselectedrows;
		}else{
			var selectTree = nui.get('tree_org_tree');
			var idarr = data.ORGID.split(',');
			var textarr = data.ORGNAME.split(',');
			for(var i=0; i<idarr.length; i++){
				selectTree.checkNode (selectTree.getNode(idarr[i]))
			}
		}
	}
	function refreshNode() {
		if(!"true".equals("false")){
			var tree = nui.get("tree_org_tree");
			tree.load("${pageContext.request.contextPath }/form/queryTreeSolution.action?formId=1061&params={s_userId:'1'}");
		}
	}
	function closex() {    
		var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);//执行关闭
		}
	/**
	function _closeParentWin(action){
		if(window.parent._closeParentWin){
			window.parent.CloseWindow(action);
		}else {
			CloseWindow(action);
		}
	}
	**/
	</script>
</html>
