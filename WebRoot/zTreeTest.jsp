<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title></title>
<style type="text/css">
.wrapper{width:98%;margin:0 auto;padding-top:10px}
.row{margin:0;}
.wizard > .content > .body{padding: 0.5% 2.5%;}
.row.cell>div lable{font-weight:600}
.fixed-table-container thead th .th-inner, .fixed-table-container tbody td .th-inner{font-weight:600}
fieldset{height:100%}
.ztree li a{width:89%}
#step2_part2 .fixed-table-body {height:100%}
.wizard > .content > .body ul > li{list-style:none}
#step2_part2 .clearfix{display:none}
.row.cell>div{min-height:30px;margin:10px 0 0 0;}
#form-p-5,#form-p-4,#form-p-3,#form-p-2,#form-p-1{width:100%;height:97%}


       .sidebar{height: 100%;
           position: relative;
           border-radius: 5px;
           margin-bottom: 10px;
           padding: 10px;}
       .searchInput{position: relative;}
       .searchInfo{position: absolute;top: 0;right: 0;margin-right: 30px;}
       .searchInfoWrapper>div{display: inline-block;}
       .searchInfoWrapper>div a{cursor: pointer;}
       .searchInfoWrapper label {margin: 4px 5px 0;vertical-align: top;}
       .panel-heading {padding: 5px 15px;}
</style>
</head>
<body>
<div id="layout1" class="nui-layout" style="width:100%;height:100%;position:relative">
	
       <div role="tabpanel" class="tab-pane panel panel-primary fade in active" id="Section1" style="height:93%;margin:0">
            <!-- 树标题 -->
               <div class="panel-heading">在职员工树</div>
				 <div class="sidebar panel-body">   
                   <div class="searchInput">
                       <input type="text"  id="key" class="empty form-control" placeholder="Search..." onkeyup="callNumber()">
                   		<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 10px;cursor: pointer;"></i>
		                   <div class="searchInfo">  
		                       <label type="text" class="searchInfoWrapper"  id="resultKey">  
		                           <div>  
		                               <i id="clickUp" class="glyphicon glyphicon-menu-up" onclick="clickUp()"><</i>
		                               <i id="clickDown" class="glyphicon glyphicon-menu-down" onclick="clickDown()">></i>  
		                           </div>  
		                           <label id="number"></label>  
		                       </label>  
		                   </div>                  
			               </div>  
			               <ul id="tree_emp_Personneltree" style="overflow-y: auto;overflow-x: hidden;height: 86%;margin-top: 10px;" class="ztree">
			               </ul>
                 </div>
             </div>
<div id="iframe" title="center" region="center" style="border:0;width:82%;height:100%;float:left">
<iframe id="main" frameborder="0" name="main"  width="100%" height="100%" border="0" scroll="yes" style="margin-top: 0px;" ></iframe>
</div>
</div>
</body>
<script type="text/javascript">
var width="18%".split("p");
var setting = {
			//勾选 checkbox 对于父子节点的关联关系
			check: {enable: false,chkboxType: {"Y":"ps", "N":"ps"}  },
			data: {
				key: {title: "title"},
				//使用简易数据模式，即id  pid,一定要注意大小写
				simpleData: {
					enable: true,
					idKey: "ID",
					pIdKey: "PARENTID",
					rootPId: 2 //根节点pid 
				}
			},
			callback: {onCheck: onCheck,onClick:onClick,onAsyncSuccess:onAsyncSuccess,onAsyncError: zTreeOnAsyncError},
			//这个async是插件封装的ajax
			async: {
				enable:true, // 需要异步加载
				type:"get",
				url:"/myehr/form/queryTreeSolution.action?formId=2140&params={}",//ajax的请求地址
				autoParam:["id","level=lv"], //传递的参数 id lv（层级，最开始是0）
				dataFilter: filter
			},
			//双击节点时，是否自动展开父节点的标识
			view: { dblClickExpand: false,showLine: false,addDiyDom: addDiyDom}, 
		};
		var paramtabs_map = {1: [{title:'人员树', url:'http://myehr430s:8080/myehr/form/toForm.action?formId=2176'}]}		
		//数据过滤  childNodes其实是ajax返回的数据
		function filter(treeId, parentNode, childNodes) {
				if (!childNodes) return null;
					for (var i=0, l=childNodes.length; i<l; i++) {
						childNodes[i].name = childNodes[i].cname.replace(/\.n/g, '.');
					}
					return childNodes;
				}
		function addDiyDom(treeId, treeNode) {
				var spaceWidth = 5;
				var switchObj = $("#" + treeNode.tId + "_switch"),
				icoObj = $('#' + treeNode.tId + '_ico');
				switchObj.remove();
				icoObj.before(switchObj);
				if (treeNode.level > 1) {
						var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level)+ "px'></span>";
						switchObj.before(spaceStr);
		}
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
				var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");
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
					var nodeType = treeNode.XTYPE;
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
		//选中后触发函数
		function onCheck(e, treeId, treeNode) {count();}
		//拿到点击的总个数
		function count() {
			function isForceHidden(node) {
				if (!node.parentTId) return false;
				var p = node.getParentNode();
					return !!p.isHidden ? true : isForceHidden(p);
			}
			var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree"),
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
				var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree"),
				nodes = zTree.getNodesByParam("isHidden", true);
				zTree.showNodes(nodes);
				setTitle();
				count();
		}
		function tree_emp_Personneltree_fun(){
				var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");
				var nodes = zTree.getNodes();
				zTree.expandNode(nodes[0], true);
				var iFrameWidth = $(window).width()-width[0];
				$("#main").width(iFrameWidth+"px");
						document.getElementById("main").src = setUrlParam(paramtabs_map["N"][0].url, nodes[0]);
		}
		function hideNodes() {
				var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree"),
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
					$.fn.zTree.init($("#tree_emp_Personneltree"), setting);
					$("#hideNodesBtn").bind("click", {type:"rename"}, hideNodes);
					$("#showNodesBtn").bind("click", {type:"icon"}, showNodes);
					//setTitle();
					count();
					
					document.getElementById("key").value = ""; //清空搜索框中的内容  
				    //绑定事件  
				    key = $("#key");  
				    key.bind("focus", focusKey)  
				        .bind("blur", blurKey)
				        .bind("propertychange", searchNode) //property(属性)change(改变)的时候，触发事件  
				        .bind("input", searchNode); 
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
		var nodeType = node.XTYPE;
		var main = document.getElementById("main");
		var paramtabs = paramtabs_map[nodeType];
		if(!paramtabs) return;
		main.src = setUrlParam(paramtabs[0].url, node);
}
function setUrlParam(url,params){
	if(url.indexOf("?")>=0){
		url =  url + "&aa=dd&intrToId=&intrButtonId=";
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
	url+="";
	return encodeURI(url);
}
function search() {
	var key = nui.get("key").getValue();
	if (key == "") {
		tree.clearFilter();
	} else {
		key = key.toLowerCase();
		tree.filter(function (node) {
var cname = node.cname ? node.cname.toLowerCase() : "";
	if (cname.indexOf(key) != -1) {
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
			var selectTree = nui.get('tree_emp_Personneltree');  
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
			var selectTree = nui.get('tree_emp_Personneltree');
			var idarr = data.ORGID.split(',');
			var textarr = data.ORGNAME.split(',');
			for(var i=0; i<idarr.length; i++){
				selectTree.checkNode (selectTree.getNode(idarr[i]))
			}
		}
	}
	function refreshNode() {
		if(!"true".equals("false")){
			var tree = nui.get("tree_emp_Personneltree");
			tree.load("/myehr/form/queryTreeSolution.action?formId=2140&params={}");
		}
	}
	function closex() {    
		var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);//执行关闭
		}
	
	var lastValue = "", nodeList = [], fontCss = {};  
	//键盘释放：当输入框的键盘按键被松开时，把查询到的数据结果显示在标签中  
	function callNumber(){  
	    var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
	  
	    //如果结果有值，则显示比例；如果结果为0，则显示"[0/0]"；如果结果为空，则清空标签框；  
	    if(nodeList.length){  
	        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
	        zTree.selectNode(nodeList[0],false );  
	        document.getElementById("key").focus();  
	  
	        clickCount=1; //防止重新输入的搜索信息的时候，没有清空上一次记录  
	  
	        //显示当前所在的是第一条  
	        document.getElementById("number").innerHTML="["+clickCount+"/"+nodeList.length+"]";  
	  
	    }else if(nodeList.length == 0){  
	        document.getElementById("number").innerHTML="[0/0]";  
	        zTree.cancelSelectedNode(); //取消焦点  
	    }  
	  
	    //如果输入框中没有搜索内容，则清空标签框  
	    if(document.getElementById("key").value ==""){  
	        document.getElementById("number").innerHTML="";  
	        zTree.cancelSelectedNode();  
	    }  
	}  
	function focusKey(e) {  
	    if (key.hasClass("empty")) {  
	        key.removeClass("empty");  
	    }  
	}  
	function blurKey(e) {  
	    if (key.get(0).value === "") {  
	        key.addClass("empty");  
	    }  
	}  
	//搜索节点  
	function searchNode(e) {  
	    var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
	    var value = $.trim(key.get(0).value);  
	    var keyType = "name";  
	  
	    if (key.hasClass("empty")) {  
	        value = "";  
	    }  
	    if (lastValue === value) return;  
	    lastValue = value;  
	    if (value === ""){  
	        updateNodes(false);  
	        return;  
	    };  
	    nodeList = zTree.getNodesByParamFuzzy(keyType, value); //调用ztree的模糊查询功能，得到符合条件的节点  
	    updateNodes(true); //更新节点  
	}  	

	//高亮显示被搜索到的节点  
	function updateNodes(highlight) {  
	    var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
	    for( var i=0, l=nodeList.length; i<l; i++) {  
	        nodeList[i].highlight = highlight; //高亮显示搜索到的节点(highlight是自己设置的一个属性)  
	        zTree.expandNode(nodeList[i].getParentNode(), true, false, false); //将搜索到的节点的父节点展开  
	        zTree.updateNode(nodeList[i]); //更新节点数据，主要用于该节点显示属性的更新  
	    }  
	} 

	//设置颜色  
	function getFontCss(treeId, treeNode) {  
	    return (!!treeNode.highlight) ? {color:"#A60000", "font-weight":"bold"} : {color:"#333", "font-weight":"normal"};  
	} 

	//点击向上按钮时，将焦点移向上一条数据  
	function clickUp(){  
	    var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
	    //如果焦点已经移动到了最后一条数据上，就返回第一条重新开始，否则继续移动到下一条  
	    if(nodeList.length==0){  
	        alert("没有搜索结果！");  
	        return ;  
	    }else if(clickCount==1) {  
	        alert("您已位于第一条记录上！");  
	        return;  
	        //让结果集里边的下一个节点获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
	        //zTree.selectNode(nodeList[clickCount], false)  
	    }else{  
	        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
	        zTree.selectNode(nodeList[clickCount], false);  
	        clickCount --;  
	    }  
	    document.getElementById("key").focus();  
	    //显示当前所在的是条数  
	    document.getElementById("number").innerHTML = "[" + clickCount + "/" + nodeList.length + "]";  
	}  
	//点击向上按钮时，将焦点移向下一条数据  
	function clickDown(){  
	    var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
	    //如果焦点已经移动到了最后一条数据上，则提示用户（或者返回第一条重新开始），否则继续移动到下一条  
	    if(nodeList.length==0){  
	        alert("没有搜索结果！");  
	        return ;  
	    }else if(nodeList.length==clickCount)  
	    {  
	        alert("您已位于最后一条记录上！")  
	        return;  
	    }else{  
	        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
	        zTree.selectNode(nodeList[clickCount], false)  
	        clickCount ++;  
	    }  
	    document.getElementById("key").focus();  
	    //显示当前所在的条数  
	    document.getElementById("number").innerHTML = "[" + clickCount + "/" + nodeList.length + "]";  
	}  
	</script>
</html>
