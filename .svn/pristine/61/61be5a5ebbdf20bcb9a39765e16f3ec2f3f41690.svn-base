<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>导入</title>

  </head>
  
  <body>
    <div style="width:60%;float:left; border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;margin-top:50px;margin-right:10px;margin-left:10px;">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">导出字段选择</h3>
		<div id="solutionList" style="margin-left:10px;margin-top:10px">
		</div>	
	</div>
	<div id="toolBar" class="nui-toolbar" style="text-align:center;padding-top:5px;padding-bottom:5px;" borderStyle="border:0;">
	    <button  class="btn btn-primary" onclick="importData()">导出</button>
		<button  class="btn btn-primary" onclick="selectAllTrue()">全选</button>
		<button  class="btn btn-primary" onclick="selectAllFalse()">取消全选</button>
	    <button  class="btn btn-primary" onclick="onCancel()">取消</button>
	</div>
	
<script>
$(function() {
    init();
});
var formId=${param.formId};
var buttonId=${param.buttonId};
var formFieldsize=0;
var formField;
function init(){
	$.ajax({  
        type: 'POST',  
        url: '${pageContext.request.contextPath }/form/getFormField.action?formId='+formId,  
        success: function (data) {
        	formField=data;
			var html="";
			html+="<table>"
			for (var i=0;i<formField.length;i++){
				html+="<tr>"+
						"<td id=\""+formField[i].fieldTalbename+"\" width=\"300px\" style=\"text-align:right;height:40px;\" value =\""+formField[i].fieldTalbename+"\">"+formField[i].fieldLableName+"</td>"+
						"<td><select id=\""+formField[i].fieldTalbename+"_check\" style=\"width:200px;height:30px;\">"+
							"<option value =\"Y\">是</option>"+
							"<option value =\"N\"  selected = \"selected\">否</option>"+
						"</select></td>"+
					"</tr>";
			}
			html+="</table>";
			$("#solutionList").html(html);
        }
    });
}
function selectAllTrue(){
	var selects = document.getElementsByTagName("select");
	for(var i=0;i<selects.length;i++){
		selects[i].value = 'Y';
	}
}

function selectAllFalse(){
	var selects = document.getElementsByTagName("select");
	for(var i=0;i<selects.length;i++){
		selects[i].value = 'N';
	}
}


function importData() {
	var fieldJson = {};
	for(var i=0;i<formField.length;i++){
		var fieldCode = formField[i].fieldTalbename;
		var fieldCodeCheck = fieldCode+'_check';
		var fieldCodeCheckValue = document.getElementById(fieldCodeCheck).value;
		fieldJson[fieldCode] = fieldCodeCheckValue;
	}
	parent.exportData(fieldJson,formId);
	onCancel();
}
	
	
	function onCancel(){ 
	    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	    parent.layer.close(index);//执行关闭
	}
</script>
  </body>
</html>
