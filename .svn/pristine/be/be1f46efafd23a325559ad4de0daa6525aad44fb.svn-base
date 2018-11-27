<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Bootstrap Table Examples</title>
    <%-- <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/examples.css">
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
<link rel="stylesheet" href="../../../css/zTreeStyle/metro.css" type="text/css"></link> --%>
</head>
<body>
<div id="menuContent" class="menuContent" style="width:23%;height:100%;z-index:10;float:left">
     <ul id="treeDemo" class="ztree" style="margin-top:0; width:100%; height:auto;"></ul>
</div>
<script>
var setting = {
    view: {
        addHoverDom: addHoverDom,
        removeHoverDom: removeHoverDom,
        selectedMulti: false
    },
    check: {
        enable: true
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
                  url: '${pageContext.request.contextPath }/FormList/entityTree.action',  
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
function removeHoverDom(treeId, treeNode) {
    $("#addBtn_" + treeNode.tId).unbind().remove();
};
//节点点击事件
	function onClickNode(e, treeId, treeNode) {
	if(treeNode.pId!=null&&treeNode.pId!="null"){
    	parent.createSql(treeNode.id,treeNode.pId,treeNode.name);
	}
	}
</script>
</html>
