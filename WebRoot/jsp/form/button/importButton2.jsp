<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>导入</title>

  <script type="text/javascript" src="../../../common/js/jquery-1.4.4.min.js"></script></head>
  
  <body>
    <div style="width:60%;float:left; border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;margin-top:50px;margin-right:10px;margin-left:10px;">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">导入字段映射</h3>
		<div id="solutionList" style="margin-left:10px;margin-top:10px">
		</div>	
	</div>
	<div id="toolBar" class="nui-toolbar" style="text-align:center;padding-top:5px;padding-bottom:5px;" borderStyle="border:0;">
	    <button  class="btn btn-primary" onclick="importData()">导入</button>
	    <button  class="btn btn-primary" onclick="onCancel()">取消</button>
		<a id="export" href="" type="hidden" value=""></a>
	</div>
	
<script>
$(function() {
    init();
});
var formId=${param.formId};
var buttonId=${param.buttonId};
var fileid='${param.fileid}';
var clientFileName='${param.clientFileName}';
var formFieldsize=0;
function init(){
	var opationhtml="";
	var formField="";
	$.ajax({  
        type: 'POST',  
        url: '${pageContext.request.contextPath }/form/getFormField.action?formId='+formId,  
        success: function (data) {
        	formField=data;
        	$.ajax({  
				type: 'POST',  
				url: '${pageContext.request.contextPath }/form/getImportFileHead.action?fileid='+fileid,  
				success: function (data) {
					var exclecolumn = data.result;
					
					var html="";
					html+="<table>"
					var errorCode = [];
					for ( var p in exclecolumn){
						var flag = 0;
						for(var i=0;i<formField.length;i++){
							if(formField[i].fieldLableName==exclecolumn[p]){
								flag = 1;
							}
						}
						if(flag==0){
							errorCode.push(exclecolumn[p]);
							continue;
						}
					
						opationhtml = "";
						formFieldsize=formFieldsize+1;
						for (var i=0;i<formField.length;i++){
							if(formField[i].fieldLableName==exclecolumn[p]){
								opationhtml+="<option value =\""+formField[i].fieldTalbename+"\" selected = \"selected\">"+formField[i].fieldLableName+"</option>";
							}else{
								opationhtml+="<option value =\""+formField[i].fieldTalbename+"\">"+formField[i].fieldLableName+"</option>";
							}
						}
						var cell = 'cell_'+p.substring(4,p.length);
						var importfield = 'importfield_'+p.substring(4,p.length);
						html+="<tr><td id=\""+cell+"\" width=\"300px\" style=\"text-align:right;height:40px;\" value =\""+p+"\">"+exclecolumn[p]+"--></td><td><select id=\""+importfield+"\" style=\"width:200px;height:30px;\">"+opationhtml+"</select></td></tr>";
					}
					if(errorCode.length>0){
						var alertCode = "";
						for(var i=0;i<errorCode.length;i++){
							alertCode += errorCode[i]+",";
						}
						layer.alert(alertCode+"字段未匹配", {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' //
						})
						return;
					}
					html+="</table>";
					$("#solutionList").html(html);
				}
			});
        }
    }); 
	
    
}
function importData() {
		var repeOper = 1;
		var execptOper = 1;
		if(repeOper=="") {
			alert("请选择重复操作！");
			return;
		}
		if(execptOper=="") {
			alert("请选择导入异常操作！");
			return;
		}
		
		var fieldJson = {};
		var fieldArray = [];
		for(var i=1;i<formFieldsize+1;i++){
			fieldJson = {};
			var importfieldId='importfield_'+i;
			fieldJson["cell"] = 'cell'+i;
			console.log(importfieldId);
			var importfield = document.getElementById(importfieldId).value;
			var obj = document.getElementById(importfieldId);
			//alert(importfield);
			fieldJson["importfield"] = importfield;	
			fieldArray.push(fieldJson);
		}
		var _params = {"formId": formId+'', "filePath": fileid, "clientFileName": clientFileName, "repeOper": repeOper+'', "execptOper": execptOper+'', "fieldSet": fieldArray,"buttonId":buttonId+''};
		//var json = JSON.stringify({"formId": formId, "filePath": filePath, "clientFileName": clientFileName, "repeOper": repeOper, "execptOper": execptOper, "fieldSet": fieldArray,"buttonId":buttonId});
		var errors = [];
	   $.ajax({
            url: '${pageContext.request.contextPath }/form/importExcelData.action',
            type:'post',
			data: JSON.stringify(_params),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
            success: function (datas) {
               	if(datas[0]=='0'){
               		alert("导入成功！");
               	}else{
               		errors = datas;
               	}
               	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
            },
        });
		if(errors[0]=='1'){
			var url='/myehr/form/getImportErrorFile.action?path='+errors[1]+'&filename='+errors[2];
			$("#export").attr("href",url);
			document.getElementById("export").click();
		}
	}
	
	
	function onCancel(){ 
	    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	    parent.layer.close(index);//执行关闭
	}
</script>
  </body>
</html>
