<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_2644" name="form_2644" >
<div class="container-fluid">
	<div style="margin-top:20px;">
<table style="width:100%;table-layout:fixed;padding-top:5px;padding-right:5px;">
			<tr>
				<td style="padding-left:10px;"  width="100"  ><lable style="float:left">审批意见: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
							<select id="EMP_EMPLOYEE.APPROVE_TYPE" title="审批意见" styleType="select" name="EMP_SEX"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="APPROVE_TYPE" nullItemText="请选择..." dataField="dicts"></select>
						</div>
					</div>
				</td>
			</tr>	
			<tr style="height:65px" style="display:none">
				<td style="padding-left:10px;"  width="100"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择审批人")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
							<div class='input-group'  style="width:200px;;float:left;">
								<input id="EMP_EMPLOYEE.EMP_ID" name="EMP_ID" type="hidden">
								<input type='text' class="form-control" readonly=true id="EMP_EMPLOYEE.EMP_CHINA_NAME"/>
								<span class="input-group-addon" onclick="EMP_EMPLOYEE_EMP_SUPER_LEADER_1210_emp_emp_add_onbuttonclick(this)">
									<span class="glyphicon glyphicon-plus">
									</span>
								</span>
							</div>
						</div>
					</div>
				</td>
			</tr>
			<tr style="height:65px">
				<td colspan="2" style="padding-left:10px;"  width="90"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"提交备注信息")%>: </lable></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  align="left"  ><textarea  id="bz" name="bz"  class="form-control"  rows="5"  style="width:400;"> </textarea></td>
			</tr>
		</table>
		<div style="margin:0 auto;margin-top:20px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formposition_add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"确认提交")%> onclick="submit2()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closeposition_add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_2644()"/>
			</div>
		</div>
</div>
</div>
</form>
<script>



var classes = $("select");
var parame={
				id:'',
				value:"N",
				width: "100px",  
				height:"45px",
				url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
				jsonParam:{},
				chang:function (e){
					var aaa = e;
				}
};

window.onload=function(){
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame);
		}else{
			myehr_initSelect(parame);
		}
	}
}

	function closex_2644(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
	
		
	function submit2(){
		var processinstid;
		if('${param.processinstid}'!=''){
			processinstid = '${param.processinstid}';
		}
		
		var taskId;
		if('${param.taskId}'!=''){
			taskId = '${param.taskId}';
		}
		var type='1';
		if(processinstid!=null && processinstid!=''){
			type='2';
		}
		var approveType = document.getElementById("EMP_EMPLOYEE.APPROVE_TYPE").value;
		var user = document.getElementById("EMP_EMPLOYEE.EMP_ID").value;
		var remark = document.getElementById("bz").value;
		var flag = window.parent.submit2(processinstid,type,user,remark,taskId,approveType);
		if(flag){
			closex_2644();
		}else {
			
		}
	}	
	
	function EMP_EMPLOYEE_EMP_SUPER_LEADER_1210_emp_emp_add_onbuttonclick(e){
		var processinstid;
		var approveType = document.getElementById("EMP_EMPLOYEE.APPROVE_TYPE").value;
		if(approveType=='2' || approveType=='4'){
			alert('结束流程，不需选人');
			return;
		}
		var id = $(e).prev().prev()[0].id;
		if(approveType=='3'){
			if(processinstid!=null && processinstid!=''){
				alert('不能选择之前之前');
				return;
			}else{
				var url = '/myehr/jsp/freeFlow/emp/EMP_DONE_LIST.jsp'+"?processinstid="+'${param.processinstid}';
			}		
		}else{
			var url = '/myehr/jsp/freeFlow/emp/EMP_LOOLUP_TREE.jsp'+"?fatherId="+id+"";
		}
		
		
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['1000','500'],
			title:'选择',
			content:url,
			success:function(layero,index){
			},
			end:function(layero,index){			
			}
		 }); 
	}
		
		
			
</script>
</body>
</html>
