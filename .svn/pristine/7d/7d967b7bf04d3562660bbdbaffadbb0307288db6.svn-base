<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body >

<table id="org_list_List">

  <div style="margin:0 auto; height: 35px;left: 127px;width:300px;">
						<div style="margin-right:10px;display:inline-block">
					      <input type="button" id="save_formemp_emp_edit"  class="btn btn-primary"  value=保存 onclick="save_formemp_emp_edit_click_1881()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
					<input type="button" id="closeemp_emp_edit"  class="btn btn-primary"  value=关闭 onclick="closex_1881()"/>
					</div>
					</div>
  					
</table>
	

<script type="text/javascript">
window.onload=function(){
	loaddata();
}


function loaddata(){
	  var url = "${pageContext.request.contextPath }/announcement/queryAnnouncement.action";  
	 
		  $.ajax({
				url:url,
				data:null,
				type:'post',
				contentType: 'application/json;charset=utf-8',
				cache: true,
				success: function (result) {
					setData(result);
				}
			});
	  	
}

function setData(list){
	var temp = '';
	for(var i=0; i<list.length; i++){
		temp += '<tr >'+
				'	<td style="padding-left:10px;"  width="150"  ><lable><a href="#" onclick="show('+list[i].id+')">'+list[i].title+'</a></lable><lable style="margin:20px;">'+formatDateTime(list[i].createTime)+'</lable></td>'+
			'</tr>';
	}
	
	$("#table").html(temp);
}

function show(id){
	window.open("announcementDetail.jsp?id="+id);
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
};  

</script>
</body>
</html>