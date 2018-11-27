
<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String id = request.getParameter("id")==null?"0": request.getParameter("id");
 %>
<%@page import="java.util.List"%>
<%@ include file="/common/cardcommontest.jsp" %>
<html>
<head>

<title>修改信息</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/form/formcreate/UMedit/utf8-jsp/ueditor.config.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/form/formcreate/UMedit/utf8-jsp/ueditor.all.min.js"></script>


<style>
</style>
</head>
<body>
	<div style="margin: 0 auto;">
	
		<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  >
					<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标题")%>：</lable>
				</td>
				<td style="padding-left:10px;"  align="left"  >
					<input id="menuCode" name="menuCode" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/>
				</td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  >
					<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"发布时间")%>：</lable>
				</td>
				<td style="padding-left:10px;"  align="left"  >
					<input id="time" name="time" type="date" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/>
				</td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  >
					<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"来源")%>：</lable>
				</td>
				<td style="padding-left:10px;"  align="left"  >
					<input id="fromp" name="fromp" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/>
				</td>
			</tr>
				<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  >
					<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"责任编辑")%>：</lable>
				</td>
				<td style="padding-left:10px;"  align="left"  >
					<input id="edit" name="edit" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/>
				</td>
			</tr>
			
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  >
					<lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"正文")%>：</lable>
				</td>
				<td style="padding-left:10px;"  align="left"  >
					<div class="content" style="background:#000; color:#FFF;width:100%;" >
				 		<script id="contactus" name="content" class="ckeditor" type="text/plain"></script>
					</div>
					
				</td>
			</tr>
		
		
		</table>
			<div style="margin:0 auto; height: 35px;left: 127px;width:300px;">
						<div style="margin-right:10px;display:inline-block">
					      <input type="button" id="save_formemp_emp_edit"  class="btn btn-primary"  value=保存 onclick="savea()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					<input type="button" id="closeemp_emp_edit"  class="btn btn-primary"  value=关闭 onclick="closexb()"/>
					</div>
					</div>
	
		
    </div>   
    <table id="formlist">		


</table>     
	
   
  
</body>
<script type="text/javascript">
   var ue;
   initTools();
   function initTools(){
		ue = UE.getEditor('editor',{
			    
			    initialFrameHeight:"100%",
			    enableAutoSave:true,
			    });
			    ue.ready(function() {
     ue.setContent('<p>hello!</p>');
        });
	}
      function savea(){
	   var save={};
	   save.title=$("#menuCode").val();
	   save.createTime=$("#time").val();
	   save.pubDepartment=$("#fromp").val();
	   save.createUserName=$("#contactus").val();
       save.infoDetail=UE.getEditor('contactus').getContent();
     
	   var url='${pageContext.request.contextPath }/announcement/updateAnnouncement.action';
         $.ajax({
			url:url,
			type: 'post',
			data: JSON.stringify(save),
			cache: true,
			contentType: 'application/json;charset=utf-8',
			success: function (data) {
					 //$("#formlist").bootstrapTable('load',data);
					// alert(data.infoDetail);
				}
		});
    
    
    }
    $(function() {
 xx();
});

	function xx(){
	  
	var id=${param.id};
		  $.ajax({
				url : '/myehr/announcement/seeAnnouncement.action?id='+id, 
				type:'post',
				cache: false,
				async:false,
				contentType: 'text/json',
				success: function (text) {
					var data = text;
			//	alert(data.title);
				//alert(data.infoDetail);
				
				if(data){
				$('[id="menuCode"]').val(data.title);
				$('[id="time"]').val(formatDateTime(data.createTime));
				$('[id="fromp"]').val(data.pubDepartment);
				$('[id="edit"]').val(data.createUserName);
				$('[id="contactus"]').val(data.infoDetail);
                UE.getEditor('contactus').getContent();
				}else{
					alert("获取信息详情出错，请联系管理员！");
				}
				
			
				}
			});
	
	}
  function formatDateTime(inputTime) {    
	    var date = new Date(inputTime);  
	    var y = date.getFullYear();    
	    var m = date.getMonth() + 1;    
	    m = m < 10 ? ('0' + m) : m;    
	    var d = date.getDate();    
	    d = d < 10 ? ('0' + d) : d;    
	    var h = date.getHours();  
	    h = h < 10 ? ('0' + h) : h;  
	    var minute = date.getMinutes();  
	    var second = date.getSeconds();  
	    minute = minute < 10 ? ('0' + minute) : minute;    
	    second = second < 10 ? ('0' + second) : second;   
	    return y + '-' + m + '-' + d;    
	}
    function docSetValue(id,val){
		document.getElementById(id).innerHTML=val;
	}

</script>
</html>