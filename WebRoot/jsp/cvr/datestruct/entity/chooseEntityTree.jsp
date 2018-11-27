<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
<!-- 
<div id="menuContent" class="menuContent" style="width:15%;height:100%;border:1px solid rgb(170,170,170);z-index:10;float:left;overflow:auto">
     <ul id="treeDemo" class="ztree" style="margin-top:0; width:100%; height:auto;"></ul>
</div>
<div id="tableContent" class="tableContent" style="width:85%;height:100%;z-index:10;float:left">
	<iframe id = "dictList" src="SysEntity.jsp?entityId=null" width="100%" height="100%" scroll="yes" style="border:none"></iframe>
</div>
 -->
<div id="layout1" class="nui-layout" style="width:100%;height:100%;position:relative">
	<div role="tabpanel" class="tab-pane panel panel-primary fade in active" id="Section1" style="width:17%;float:left;height:93%;margin:0">
		<div class="panel-heading">公司树</div>
		<div class="sidebar panel-body">
			<div class="searchInput">
				<input type="text"  id="key" class="empty form-control" placeholder="Search..." onkeyup="callNumber()">
				<i class="glyphicon glyphicon-search" style="position: absolute;right: 6px;top: 6px;cursor: pointer;"></i>
				<div class="searchInfo">
					<label type="text" class="searchInfoWrapper"  id="resultKey">
					<div>
						<i id="clickUp" class="glyphicon glyphicon-arrow-up" onclick="clickUp()" style="top:4px"></i>
						<i id="clickDown" class="glyphicon glyphicon-arrow-down" onclick="clickDown()" style="top:4px"></i>
					</div>
					<label id="number"></label>
					</label>
				</div>
			</div>
			<ul id="treeDemo" style="overflow-y: auto;overflow-x: hidden;height: 86%;margin-top: 10px;" class="ztree" value="xtype" parentField="parentid">
			</ul>
		</div>
	</div>
	<div id="iframe" title="center" region="center" style="border:0;width:82%;height:100%;float:left">
		<iframe id = "dictList" src="chooseSysEntity.jsp" width="100%" height="100%" scroll="yes" style="border:none"></iframe>
	</div>
</div>
<script>
var setting = {
    view: {
        addHoverDom: addHoverDom,
        removeHoverDom: removeHoverDom,
        selectedMulti: false,
        showLine: false,       
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
	        onClick: onClickNode
	        }
};
$(document).ready(function () {
	$.ajax({  
                  type: 'POST',  
                  url: '${pageContext.request.contextPath }/EntityList/selectChooseTree.action',  
                  success: function (data) {  
                  $.fn.zTree.init($("#treeDemo"), setting, data); 
                  }
              });
              });

function addHoverDom(treeId, treeNode) {
    var sObj = $("#" + treeNode.tId + "_span");
    if (treeNode.editNameFlag || $("#addBtn_" + treeNode.tId).length > 0) return;
    var addStr = "<span class='button add' id='addBtn_" + treeNode.tId
        + "' title='add node' onfocus='this.blur();'></span>";
    sObj.after(addStr);
    var btn = $("#addBtn_" + treeNode.tId);
    if (btn) btn.bind("click", function () {
        var zTree = $.fn.zTree.getZTreeObj("treeDemo");
        zTree.addNodes(treeNode, { id: (100 + newCount), pId: treeNode.id, name: "new node" + (newCount++) });
        return false;
    });
};

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

function removeHoverDom(treeId, treeNode) {
    $("#addBtn_" + treeNode.tId).unbind().remove();
};
//节点点击事件
function onClickNode(e, treeId, treeNode) {
   	var zTree = $.fn.zTree.getZTreeObj("treeDemo");
   	zTree.checkNode(treeNode, !treeNode.checked, null, true);
   	if(treeNode.isParent==true){
   		if(treeNode.pId==null){
   			document.getElementById("dictList").src="chooseSysEntity.jsp?templateId=${param.templateId}&entityType="+treeNode.pId;
   		}else{
   			document.getElementById("dictList").src="chooseSysEntity.jsp?templateId=${param.templateId}&entityType="+treeNode.id;
   		}
   	}
   	return false;
}
	
function tranData(data){
	window.parent.rturnVal(data);
	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
    parent.layer.close(index);//执行关闭
}

var lastValue = "", nodeList = [], fontCss = {};  
//键盘释放：当输入框的键盘按键被松开时，把查询到的数据结果显示在标签中  
function callNumber(){  
    var zTree = $.fn.zTree.getZTreeObj("treeDemo");  
    //如果结果有值，则显示比例；如果结果为0，则显示"[0/0]"；如果结果为空，则清空标签框;  
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
    var zTree = $.fn.zTree.getZTreeObj("treeDemo");  
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
    var zTree = $.fn.zTree.getZTreeObj("treeDemo");  
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
    var zTree = $.fn.zTree.getZTreeObj("treeDemo");  
    //如果焦点已经移动到了最后一条数据上，就返回第一条重新开始，否则继续移动到下一条  
    if(nodeList.length==0){  
        alert("没有搜索结果！");  
        return ;  
    }else if(clickCount==0) {  
        alert("您已位于第一条记录上！");  
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
//点击向上按钮时，将焦点移向下一条数据  
function clickDown(){  
    var zTree = $.fn.zTree.getZTreeObj("treeDemo");  
    //如果焦点已经移动到了最后一条数据上，则提示用户（或者返回第一条重新开始），否则继续移动到下一条  
    if(nodeList.length==0){  
        alert("没有搜索结果！");  
        return ;  
    }else if(nodeList.length-1==clickCount)  
    {  
        alert("您已位于最后一条记录上！")  
        return;  
    }else{  
        //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
        clickCount ++;  
        zTree.selectNode(nodeList[clickCount], false)  
    }  
    document.getElementById("key").focus();  
    //显示当前所在的条数  
    var num = clickCount + 1;  
    document.getElementById("number").innerHTML = "[" + num + "/" + nodeList.length + "]";
}
</script>
</html>
