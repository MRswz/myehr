<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'editDictType.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/tableExport.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
</head>

  
  <body>
    <form id="form1" style="width:100%;overflow:hidden;">
        <input id="dictTypeId" name="dictTypeId" type="hidden"/>
        <input id="dictEntryId" name="dictEntryId" type="hidden" />
        <div style="padding-left:11px;padding-bottom:5px;padding-top:3px;">
            <table style="table-layout:fixed;width:100%;margin:auto;"  border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="40%" style="margin:5px;padding:10px">
                        <label for="dictEntryCode">字典项编码：</label>
                    </td>
                    <td align="left" style="margin:5px;padding:10px">
                        <input id="dictEntryCode" name="dictEntryCode" style="width:60%"/>
                    </td>
                </tr>
                <tr>
                    <td width="40%" style="margin:5px;padding:10px">
                        <label for="dictEntryName">字典项名称：</label>
                    </td>
                    <td align="left" style="margin:5px;padding:10px">
                        <input id="dictEntryName" name="dictEntryName" style="width:60%"/>
                    </td>
                </tr>
                <tr>
                    <td width="40%" style="margin:5px;padding:10px">
                        <label for="dictEntrySort">字典项排序：</label>
                    </td>
                    <td align="left" style="margin:5px;padding:10px">
                        <input id="dictEntrySort" name="dictEntrySort" style="width:60%"/>
                    </td>
                </tr>
                <tr>
                    <td width="40%" style="margin:5px;padding:10px">
                        <label for="dictEntryRemark">字典项描述：</label>
                    </td>
                    <td colspan="1" align="left" style="margin:5px;padding:10px">
                        <input id="dictEntryRemark" name="dictEntryRemark" style="width:60%"/>
                    </td>
                </tr>
            </table>
        </div>
        <div style="padding-left:11px;padding-bottom:5px;padding-top:3px;">
        	<div style="width:300px;margin:auto;">
		        <div style="margin-right:10px;float:left"> 
					<button id="save" class="btn btn-primary" onclick="saveDictEntry()">
						<i class="glyphicon glyphicon-pencil"></i> 保存
					</button>
				</div>
			    <div style="margin-right:10px;float:left"> 
			        <button id="close" class="btn btn-primary" onclick="closex();">
			            <i class="glyphicon glyphicon-off"></i> 关闭
				    </button>
				</div>
			</div>
	    </div>

	
	</form>
	<script>
	$(function() { 
		var dictTypeId=getQueryString("dictTypeId");
		if(dictTypeId !=null && dictTypeId!=undefined && dictTypeId!=""){
			$("#dictTypeId").val(dictTypeId); 
		}
		var dictEntryId=getQueryString("dictEntryId");
		if(dictEntryId !=null && dictEntryId!=undefined && dictEntryId!=""){
			$("#dictEntryId").val(dictEntryId);
			selectById(dictEntryId);
		}
	    
	});
	var dictEntry;
	function selectById(dictEntryId){
		dictType={dictEntryId:dictEntryId};
		$.ajax({
			type: 'POST',
			url: "${pageContext.request.contextPath }/dict/searchSysDictEntryById.action",
			data:  JSON.stringify(dictType),
			dataType: 'JSON',
			success: function (data, textStatus, jqXHR) {
			 	$("#dictEntryId").val(data.dictEntryId); 
			 	$("#dictEntryCode").val(data.dictEntryCode);
			 	$("#dictEntryName").val(data.dictEntryName);
			 	$("#dictEntrySort").val(data.dictEntrySort);
			 	$("#dictEntryRemark").val(data.dictEntryRemark);
			    dictEntry=data;
			},
			error: function () { alert("error");}
		});
	}
	
	function saveDictEntry(){
		var dictEntryId=$("#dictEntryId").val();
		if(dictEntryId==undefined || dictEntryId==null || dictEntryId==""){
			var dictEntryCode=$("#dictEntryCode").val();
			var dictEntryName=$("#dictEntryName").val();
			var dictEntrySort=$("#dictEntrySort").val();
			var dictEntryRemark=$("#dictEntryRemark").val();
			var dictTypeId=$("#dictTypeId").val();
			var dictType={dictEntryCode:dictEntryCode,dictEntryName:dictEntryName,dictEntrySort:dictEntrySort,dictEntryRemark:dictEntryRemark,dictTypeId:dictTypeId};
			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/dict/insertSysDictEntry.action",
				data:  JSON.stringify(dictType),
				dataType: 'JSON',
				async: false,
				success: function (data, textStatus, jqXHR) {
				    if(data=="0"){
				    	alert("保存成功");
				    	closex();
				    }else{
				    	alert("保存失败");
				    }
				},
				error: function () { alert("error");}
			});
			
		}else{
			dictEntry.dictEntryCode=$("#dictEntryCode").val();
			dictEntry.dictEntryName=$("#dictEntryName").val();
			dictEntry.dictEntrySort=$("#dictEntrySort").val();
			dictEntry.dictEntryRemark=$("#dictEntryRemark").val();
			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/dict/saveSysDictEntry.action",
				data:  JSON.stringify(dictEntry),
				dataType: 'JSON',
				async: false,
				success: function (data, textStatus, jqXHR) {
				    if(data=="0"){
				    	alert("保存成功");
				    	closex();
				    }else{
				    	alert("保存失败");
				    }
				},
				error: function () { alert("error");}
			});
		}
		
	}
	
	function closex(){
		 var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		 parent.layer.close(index); //执行关闭
	}
	
	/**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	} 
	
	</script>
    
  </body>
</html>
