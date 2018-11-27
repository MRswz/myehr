var setting = {
		check: {enable: true,chkboxType: {"Y":"ps", "N":"ps"}  },
		data: {
			key: {title: "title"},
			simpleData: {
				enable: true,
				idKey: "id",
				pIdKey: "pId",
				rootPId: 0 //根节点pid 
			}
		},
		callback: {onCheck: onCheck,onClick:onClick,onAsyncSuccess:onClick},
		async: {
			enable:true, // 需要异步加载
			type:"post",
			url:"",
			autoParam:["pId"], //传递的参数 pId
			dataFilter: filter
		},
		view: { dblClickExpand: false}, 
	};
	//数据过滤
	function filter(treeId, parentNode, childNodes) {
			if (!childNodes) return null;
			for (var i=0, l=childNodes.length; i<l; i++) {
				childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
			}
			return childNodes;
	}
	//节点点击事件
function onClick(event, treeId, treeNode){  
	var treeObj = $.fn.zTree.getZTreeObj("treeDemo1");
	treeObj.expandNode(treeNode);
	alert(treeNode.id);

    var url = "....?pId=";  
    if(treeNode == undefined){  
        url += "1";  
    }  
    else{  
        url += treeNode.id;  
    } 
    $.ajax({  
        type : "post",  
        url : url,  
        data : "",  
        dataType : "json",  
        async : true,  
        success : function(jsonData) {                
            if (jsonData != null) {       
                var data = jsonData;
                if(data != null && data.length != 0){  
                    if(treeNode == undefined){  
                        treeObj.addNodes(null,data,true);// 如果是根节点，那么就在null后面加载数据  
                    }  
                    else{  
                        treeObj.addNodes(treeNode,data,true);//如果是加载子节点，那么就是父节点下面加载  
                    }  
                }  
                treeObj.expandNode(treeNode,true, false, false);// 将新获取的子节点展开  
            } 
        },  
        error : function() { 
            alert("请求错误！");    
        }  
    });  
      
}; 

	
	//自定义设置节点属性
	function setTitle(node) {
		var zTree = $.fn.zTree.getZTreeObj("treeDemo1");
		var nodes = node ? [node]:zTree.transformToArray(zTree.getNodes());
		for (var i=0, l=nodes.length; i<l; i++) {
			var n = nodes[i];
			n.title = "[" + n.id + "] isFirstNode = " + n.isFirstNode + ", isLastNode = " + n.isLastNode;
			console.log(n.title);
			zTree.updateNode(n);
		}
	}
	function onCheck(e, treeId, treeNode) {count();}

	function count() {
		function isForceHidden(node) {
			if (!node.parentTId) return false;
			var p = node.getParentNode();
			return !!p.isHidden ? true : isForceHidden(p);
		}
		var zTree = $.fn.zTree.getZTreeObj("treeDemo1"),
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
		var zTree = $.fn.zTree.getZTreeObj("treeDemo1"),
		nodes = zTree.getNodesByParam("isHidden", true);
		zTree.showNodes(nodes);
		setTitle();
		count();
	}
	function hideNodes() {
		var zTree = $.fn.zTree.getZTreeObj("treeDemo1"),
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
		var data=[
			{ id:"1v", pId:0, name:"自定义图标", open:true, iconSkin:"pIcon01",isParent:true},
			// { id:11, pId:"1v", name:"打开百度", iconSkin:"icon01",url:"http://www.baidu.com/", target:"_blank"},
			// { id:12, pId:"1v", name:"叶子节点2", iconSkin:"pIcon01",isParent:true},
			// { id:13, pId:"1v", name:"叶子节点3", iconSkin:"pIcon02",isParent:true},
			{ id:2, pId:0, name:"自定义图标2", open:true, iconSkin:"pIcon02",isParent:true},
			{ id:21, pId:2, name:"叶子节点4", iconSkin:"icon04",isParent:false},
			{ id:22, pId:2, name:"叶子节点5", iconSkin:"icon05",isParent:false},
			{ id:23, pId:2, name:"叶子节点6", iconSkin:"icon06",isParent:false},
			{ id:3, pId:0, name:"不使用自定义图标", open:true },
			{ id:31, pId:3, name:"叶子节点1"},
			{ id:32, pId:3, name:"叶子节点2"},
			{ id:33, pId:3, name:"叶子节点3"}
];
		$.fn.zTree.init($("#treeDemo1"), setting,data);
		$("#hideNodesBtn").bind("click", {type:"rename"}, hideNodes);
		$("#showNodesBtn").bind("click", {type:"icon"}, showNodes);
		setTitle();
		count();
		
	});	