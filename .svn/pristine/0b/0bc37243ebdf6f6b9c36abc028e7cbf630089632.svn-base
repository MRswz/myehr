var setting = {
	    view: {
	        addHoverDom: addHoverDom,
	        removeHoverDom: removeHoverDom,
	        selectedMulti: false,
	        showLine: false,
	        dblClickExpand: false,
	        addDiyDom: addDiyDom
	    },
	    check: {
	        enable: false
	    },
	    data: {
	        simpleData: {
	            enable: true
	        }
	    },
	    edit: {
	        enable: false
	    },
	    callback: {
		        onClick: onClickNode,
		        onAsyncSuccess:onAsyncSuccess
		        },
	    async: {
			enable: true,
			type:"POST",
			//contentType:"application/json",
			url:"/myehr/EntityList/selectFullTree.action",
			autoParam:["id", "name=n", "level=lv"],
			dataFilter: filter
		}
	};

var setting2 = {
	    view: {
	        addHoverDom: addHoverDom,
	        removeHoverDom: removeHoverDom,
	        selectedMulti: false,
	        showLine: false
	    },
	    check: {
	        enable: false
	    },
	    data: {
	        simpleData: {
	            enable: true
	        }
	    },
	    edit: {
	        enable: false
	    },
	    callback: {
		        onClick: onClickNode,
		        onAsyncSuccess:onAsyncSuccess2
		        },
	    async: {
			enable: true,
			type:"POST",
			//url:"/form/selectParamTree.action?paramTypeValue="+formId,
			autoParam:["id", "name=n", "level=lv"],
			dataFilter: filter
		}
	};

//设置颜色  
function getFontCss(treeId, treeNode) {  
    return (!!treeNode.highlight) ? {color:"#A60000", "font-weight":"bold"} : {color:"#333", "font-weight":"normal"};  
} 
var lastValue = "", nodeList = [], fontCss = {};  
var lastValue2 = "", nodeList2 = [], fontCss = {}; 

//键盘释放：当输入框的键盘按键被松开时，把查询到的数据结果显示在标签中  
function callNumber(){  
    var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");  
  
    //如果结果有值，则显示比例；如果结果为0，则显示"[0/0]"；如果结果为空，则清空标签框；  
    if(nodeList.length){  
        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
        zTree.selectNode(nodeList[0],false );  
        document.getElementById("key").focus();  
  
        clickCount=0; //防止重新输入的搜索信息的时候，没有清空上一次记录  
        
        //显示当前所在的是第一条  
        document.getElementById("number").innerHTML="["+1+"/"+nodeList.length+"]";  
  
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
//键盘释放：当输入框的键盘按键被松开时，把查询到的数据结果显示在标签中  
function callNumber2(){  
  var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  

  //如果结果有值，则显示比例；如果结果为0，则显示"[0/0]"；如果结果为空，则清空标签框；  
  if(nodeList2.length){  
      //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
      zTree.selectNode(nodeList2[0],false );  
      document.getElementById("key2").focus();  

      clickCount=0; //防止重新输入的搜索信息的时候，没有清空上一次记录  

      //显示当前所在的是第一条  
      document.getElementById("number2").innerHTML="["+1+"/"+nodeList2.length+"]";  

  }else if(nodeList2.length == 0){  
      document.getElementById("number2").innerHTML="[0/0]";  
      zTree.cancelSelectedNode(); //取消焦点  
  }  

  //如果输入框中没有搜索内容，则清空标签框  
  if(document.getElementById("key2").value ==""){  
      document.getElementById("number2").innerHTML="";  
      zTree.cancelSelectedNode();  
  }  
} 


function focusKey(e) {  
    if (key.hasClass("empty")) {  
        key.removeClass("empty");  
    }  
}  
function focusKey2(e) {  
	if (key2.hasClass("empty")) {  
		key2.removeClass("empty");  
	}  
}  
	 

function blurKey(e) {  
    if (key.get(0).value === "") {  
        key.addClass("empty");  
    }  
}  
function blurKey2(e) {  
	if (key2.get(0).value === "") {  
		key2.addClass("empty");  
	}  
} 

//搜索节点  
function searchNode(e) {  
    var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");  
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
//搜索节点  
function searchNode2(e) {  
  var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
  var value = $.trim(key2.get(0).value);  
  var keyType = "name";  

  if (key2.hasClass("empty")) {  
      value = "";  
  }  
  if (lastValue2 === value) return;  
  lastValue2 = value;  
  if (value === ""){  
      updateNodes2(false);  
      return;  
  };  
  nodeList2 = zTree.getNodesByParamFuzzy(keyType, value); //调用ztree的模糊查询功能，得到符合条件的节点 
  console.log(nodeList2);
  updateNodes2(true); //更新节点  
}   

//高亮显示被搜索到的节点  
function updateNodes(highlight) {  
    var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");  
    for( var i=0, l=nodeList.length; i<l; i++) {  
        nodeList[i].highlight = highlight; //高亮显示搜索到的节点(highlight是自己设置的一个属性)  
        zTree.expandNode(nodeList[i].getParentNode(), true, false, false); //将搜索到的节点的父节点展开  
        zTree.updateNode(nodeList[i]); //更新节点数据，主要用于该节点显示属性的更新  
    }  
} 
//高亮显示被搜索到的节点  
function updateNodes2(highlight) {  
  var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
  for( var i=0, l=nodeList2.length; i<l; i++) {  
      nodeList2[i].highlight = highlight; //高亮显示搜索到的节点(highlight是自己设置的一个属性)  
      zTree.expandNode(nodeList2[i].getParentNode(), true, false, false); //将搜索到的节点的父节点展开  
      zTree.updateNode(nodeList2[i]); //更新节点数据，主要用于该节点显示属性的更新  
  }  
}

//点击向上按钮时，将焦点移向上一条数据  
function clickUp(){  
    var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");  
    //如果焦点已经移动到了最后一条数据上，就返回第一条重新开始，否则继续移动到下一条  
    if(nodeList.length==0){  
        layer.alert('没有搜索结果！', {
			  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
        return ;  
    }else if(clickCount==0) {  
        layer.alert('您已位于第一条记录上！', {
			  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' //
			})
        return;  
        //让结果集里边的下一个节点获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
        //zTree.selectNode(nodeList[clickCount], false)  
    }else{  
        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
        clickCount --;  
        zTree.selectNode(nodeList[clickCount], false);  
    }  
    document.getElementById("key").focus();  
    //显示当前所在的是条数  
    var num = clickCount + 1;
    document.getElementById("number").innerHTML = "[" + num + "/" + nodeList.length + "]";  
}  
//点击向上按钮时，将焦点移向上一条数据  
function clickUp2(){  
  var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
  //如果焦点已经移动到了最后一条数据上，就返回第一条重新开始，否则继续移动到下一条  
  if(nodeList2.length==0){  
      layer.alert('没有搜索结果！', {
		  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
		  skin: 'layer-ext-moon' //
		})
      return ;  
  }else if(clickCount==0) {  
      layer.alert('您已位于第一条记录上！', {
		  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
		  skin: 'layer-ext-moon' //
		})
      return;  
      //让结果集里边的下一个节点获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
      //zTree.selectNode(nodeList[clickCount], false)  
  }else{  
      //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
	  clickCount --;
	  zTree.selectNode(nodeList2[clickCount], false);  
       
  }  
  document.getElementById("key2").focus();  
  //显示当前所在的是条数  
  var num = clickCount + 1;
  document.getElementById("number2").innerHTML = "[" + num + "/" + nodeList2.length + "]";  
}  


//点击向上按钮时，将焦点移向下一条数据  
function clickDown(){  
    var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");  
    //如果焦点已经移动到了最后一条数据上，则提示用户（或者返回第一条重新开始），否则继续移动到下一条  
    if(nodeList.length==0){  
        layer.alert('没有搜索结果！', {
  		  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
  		  skin: 'layer-ext-moon' //
  		})
        return ;  
    }else if(nodeList.length-1==clickCount)  
    {  
        layer.alert('您已位于最后一条记录上！', {
		  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
		  skin: 'layer-ext-moon' //
		})
        return;  
    }else{  
        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
    	clickCount ++;  
    	zTree.selectNode(nodeList[clickCount], false)  ;
        
    }  
    //document.getElementById("key").focus();  
    $("#key").focus();
    //显示当前所在的条数  
    var num = clickCount + 1;
    document.getElementById("number").innerHTML = "[" + num + "/" + nodeList.length + "]";  
}  
//点击向上按钮时，将焦点移向下一条数据  
function clickDown2(){  
  var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");  
  //如果焦点已经移动到了最后一条数据上，则提示用户（或者返回第一条重新开始），否则继续移动到下一条  
  if(nodeList2.length==0){  
      layer.alert('没有搜索结果！', {
		  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
		  skin: 'layer-ext-moon' //
		})
      return ;  
  }else if(nodeList2.length-1==clickCount)  
  {  
      layer.alert('您已位于最后一条记录上！', {
		  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
		  skin: 'layer-ext-moon' //
		})
      return;  
  }else{  
      //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
	  clickCount ++;
	  zTree.selectNode(nodeList2[clickCount], false)  
        
  }  
  document.getElementById("key2").focus();  
  //显示当前所在的条数  
  var num = clickCount + 1;
  document.getElementById("number2").innerHTML = "[" + num + "/" + nodeList2.length + "]";  
}


var maxLevel = 1;
function onAsyncSuccess(event, treeId, treeNode){
		if(treeNode && treeNode.level >= maxLevel - 1 ){
			return;
		}
		var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");
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
}

function onAsyncSuccess2(event, treeId, treeNode){
	if(treeNode && treeNode.level >= maxLevel - 1 ){
		return;
	}
	var zTree = $.fn.zTree.getZTreeObj("paramTreeDemo");
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
} 
 

 



  