<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  	<head>
    	<title>Bootstrap Table Examples</title>
    	<style type="text/css">
    		.menu{background-color:#f6f6f6}
    		.model{width:98%;height:98%;margin:0 auto;padding:10px;}
    		.treeSpace{width:95%; height:100%;background-color:#ffffff;}
    		.level1{overflow:hidden}
    		.ztree li a{padding:12px 25px 3px 6px;}
    		iframe{border:0}
    	</style>
	</head>
<body>
<div class="menu">
<div class="model">
	<div id="menuContent" class="menuContent" style="width:17%;height:97%;float:left;">
		<div class="treeSpace" >
			<ul id="treeDemo" class="ztree" style="width:90%"></ul>
		</div>
	</div>
	<div id="tableContent" class="tableContent" style="width:83%;height:97%;z-index:10;float:right">
		<iframe id = "dictList" src="chooseSysFieldList.jsp?entityId=null" width="100%" height="100%" scroll="yes"></iframe>
	</div>
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

var getEntityName = "";
$(document).ready(function () {  
	for(var i = 1 ; ;i++){
		if(GetQueryString("entityName"+i)!=null&&GetQueryString("entityName"+i)!=undefined){
			getEntityName = getEntityName + GetQueryString("entityName"+i) + ",";
		}else{
			break;
		}
		
	}
	$.ajax({  
             type: 'POST',  
             url: '${pageContext.request.contextPath }/EntityList/selectChooseField.action?entityName='+getEntityName,  
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
   			document.getElementById("dictList").src="../field/chooseSysFieldList.jsp?templateId=${param.templateId}&entityId="+treeNode.id;
   		}else{
   			document.getElementById("dictList").src="../field/chooseSysFieldList.jsp?templateId=${param.templateId}&entityId="+treeNode.id;
   		}
   	}
   	return false;
}
	
function tranData(data){
	window.parent.rturnFieldVal1(data);
}

function closexx(){
	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
    parent.layer.close(index);//执行关闭
}

//获取url参数(filterName/paramType)
function GetQueryString(key){
        var reg = new RegExp("(^|&)"+key+"=([^&]*)(&|$)");
        var result = window.location.search.substr(1).match(reg);
        return result?decodeURIComponent(result[2]):null;
      }

</script>
</html>
