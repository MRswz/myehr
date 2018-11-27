<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
	String nodeId = request.getParameter("nodeId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/form/formcreate/UMedit/utf8-jsp/ueditor.config.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/form/formcreate/UMedit/utf8-jsp/ueditor.all.min.js"></script>
</head>
<body style="text-align:center">		
<form id="form" name="form" >
<div class="container-fluid">
	<div style="margin-top:5px;">
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center"></h3>
			<input type="hidden" name="id" id="id" />"
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:100%;margin:10px;">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"模板标题")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="title" name="title" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:100%;"/></td>
				
			</tr>
			<tr style="height:100%;margin:10px;" >
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"短信模板")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<textarea  id="newsTemplate" name="newsTemplate"  class="form-control"  rows="5"  style="margin-top:5px"> </textarea>
					
				</td>
			</tr>
			<tr style="height:100%;margin:10px;" >
				<input type="hidden" name="emailTemplate" id="emailTemplate" />"
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"邮件模板")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class="content" style="width:100%;margin-top:5px;height:100%;">
						 <script id="editor"  type="text.plain"></script>
					</div>
					
				</td>
			</tr>
		</table>
	</div>


	<div style="margin:0 auto; display:inline-block;height: 35px;">
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="save"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveData()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="close"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_1881()"/>
		</div>
	</div>
</div>
</div>
</form>
<script>
var ue;

function loadData(){
	var id = <%=request.getParameter("id") %>;
	if(id!=null&&id!=''){
		
		$.ajax({
				url:'/myehr/message/getTemplatesById.action?id='+id,
				type:'post',
				data: JSON.stringify({id:id}),
				cache: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					alert(text.id);
					$("#id").val(text.id);
					$("#emailTemplate").val(text.emailTemplate);
					$("#title").val(text.title);
					$("#newsTemplate").val(text.newsTemplate);
				}
			});
	}
}

loadData();

function saveData(){
    var param = {};
	var emailTemplate = ue.getContent();
	$("#emailTemplate").val(emailTemplate);
	$.map($('[name=form]').serializeArray(), function(item, index){
		var property =item['name'];
		var value = item['value'];
		param[property] = value;
	});
	
	
	
	$.ajax({
			url:'/myehr/message/saveTemplate.action',
			type:'post',
			data: JSON.stringify(param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text=='1'){
					alert('保存成功');
					return ;
				}
				alert("保存失败！");
				
			}
		});
	
}

initTools();	
function initTools(){
	ue = UE.getEditor('editor',{
		    initialFrameHeight:"100%",
		    enableAutoSave:false,
	});
		
	
}
</script>
</body>
</html>
