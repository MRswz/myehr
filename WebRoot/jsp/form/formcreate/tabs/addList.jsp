<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<div class="container-fluid">
	<div style="margin-top:20px;">
		<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否动态表单")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<input id="tabDetailIsForm" name="tabDetailIsForm" type="checkbox" checked style="" onclick = "getForm()" />是
				</td>
			</tr>
			<tr style="height:65px" id="get1">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择动态表单")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='input-group'  style="width:200px;float:left;">
						<input id="tabDetailFormId" name="tabDetailFormId" type="hidden"/>
						<input type='text' class="form-control" readonly=true id="tabDetailFormName"/>
						<span class="input-group-addon" onclick="ORG_POST_POST_NAME_2818_emp_InterChange_card_onbuttonclick(this)">
							<span class="glyphicon glyphicon-plus">
							</span>
						</span>
					</div>
				</td>
			</tr>
			<tr style="height:65px;display:none" id="get2" >
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"输入URL")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="tabDetailFormUrl" name="tabDetailFormUrl" type="text" class="form-control" style="width:200px"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"tab标题")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="tabDetailFormTitle" name="tabDetailFormTitle" type="text" class="form-control" style="width:200px;"/></td>
			</tr>
			
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排序")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="tabDetailSort" name="tabDetailSort" type="text" class="form-control" style="width:200px;"/></td>
			</tr>
		</table>
	</div>
	<div style="margin:0 auto">
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="save"  class="btn btn-primary" value="确定" onclick="save()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="closex"  class="btn btn-primary" value="关闭" onclick="closex()"/>
		</div>
	</div>
</div>
<script type="text/javascript">

	function getForm(){
		if($("#tabDetailIsForm").prop("checked")){
			$("#get2").css("display","none");
			$("#get1").css("display",'');
		}else{
			$("#get2").css("display",'');
			$("#get1").css("display","none");
		}
	}

	function closex(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
	
	function save(){
		var param = {};
		param.mstTabId=${param.mstId};
		if($("#tabDetailIsForm").val()=='on'){
			param.tabDetailIsForm='Y';
		} else{
			param.tabDetailIsForm='N';
		}
		param.tabDetailFormUrl=$("#tabDetailFormUrl").val();
		param.tabDetailFormTitle=$("#tabDetailFormTitle").val();
		param.tabDetailFormId=$("#tabDetailFormId").val();
		param.tabDetailSort=$("#tabDetailSort").val();
		
		$.ajax({
			url:'${pageContext.request.contextPath }/form/saveMstTab.action',
			type:'post',
		    data: JSON.stringify(param),
		    cache: false,
		    contentType: 'application/json;charset=utf-8',
		    success: function (datas) {  
		    	if(datas==0){
		    		alert("更新异常");
		    		closex();
		    	}else {
		    		alert("保存成功");
		    		closex();
		    	}
		    }  
		})
	}
	function closex() {    
		var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);//执行关闭
		}
	function ORG_POST_POST_NAME_2818_emp_InterChange_card_onbuttonclick(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/jsp/form/formcreate/formChoose.jsp?widget=';
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['950','700'],
			maxmin:true,
			title:'选择表单',
			content:url,
			success:function(layero,index){
			},
			end:function(){			}
		 }); 
	}
</script>
</body>
</html>