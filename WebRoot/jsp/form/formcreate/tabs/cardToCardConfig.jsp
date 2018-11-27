<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<div class="container-fluid">
	<div style="margin-top:20px;">
		<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><label><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否页面索引")%>: </label></td>
				<td style="padding-left:10px;"  align="left"  >
					<input id="id" name="id" type="hidden" />
					<input id="isDivLink" name="isDivLink" type="checkbox"  />是
				</td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><label><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否打印")%>: </label></td>
				<td style="padding-left:10px;"  align="left"  >
					<input id="isPrint" name="isPrint" type="checkbox"  />是
				</td>
			</tr>
			<tr style="height:65px;" id="get2" >
				<td style="padding-left:10px;"  width="150"  ><label><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"页面主体宽度")%>: </label></td>
				<td style="padding-left:10px;"  align="left"  ><input id="mainWidth" name="mainWidth" type="text" class="form-control" value="70%" style="width:200px"/></td>
			</tr>
		</table>
	</div>
	<div style="margin:0 auto">
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="save"  class="btn btn-primary" value="保存" onclick="save()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="closex"  class="btn btn-primary" value="关闭" onclick="closex()"/>
		</div>
	</div>
</div>
<script type="text/javascript">

var formId = '${param.formId}';
$(document).ready(function () {
	initData();
})
	function initData(){
		$.ajax({
			url:'${pageContext.request.contextPath }/FormCopy/getConfigByFormId.action?formId='+formId,
			type:'post',
		    cache: false,
		    success: function (datas) {
				if(datas!=null&&datas!=""){
					$("#id").val(datas.id);
					if(datas.isDivLink=='N'){
						$("#isDivLink").prop("checked",false);
					}else if(datas.isDivLink=='Y'){
						$("#isDivLink").prop("checked",true);
					}
					if(datas.isPrint=='N'){
						$("#isPrint").prop("checked",false);
					}else if(datas.isPrint=='Y'){
						$("#isPrint").prop("checked",true);
					}
					$("#mainWidth").val(datas.mainWidth);
				}  
			}
		})
	}

	function closex(){ 
		var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		parent.layer.close(index);//执行关闭
	}
	
	function save(){
		var param = {};
		param.formId=${param.formId};
		if($("#isDivLink").prop("checked")==true){
			param.isDivLink='Y';
		} else{
			param.isDivLink='N';
		}
		if($("#isPrint").prop("checked")==true){
			param.isPrint='Y';
		} else{
			param.isPrint='N';
		}
		param.mainWidth=$("#mainWidth").val();
		param.id=$("#id").val();
		
		$.ajax({
			url:'${pageContext.request.contextPath }/FormCopy/saveCCconfig.action',
			type:'post',
		    data: JSON.stringify(param),
		    cache: false,
		    contentType: 'application/json;charset=utf-8',
		    success: function (datas) {  
		    	if(datas=='0'){
		    		alert("更新异常");
		    		closex();
		    	}else {
		    		alert("保存成功");
		    		closex();
		    	}
		    }  
		})
	}
	
</script>
</body>
</html>