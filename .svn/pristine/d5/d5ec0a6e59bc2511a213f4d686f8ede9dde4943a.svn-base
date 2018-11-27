<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html><head><link rel="stylesheet" href="animate.css" type="text/css"></link><link rel="stylesheet" href="style.css" type="text/css"></link></head>
<body style="text-align:center">
<form id="form_2644" name="form_2644" >
	<div class="container-fluid">
		<div style="margin-top:20px;">
			<table style="width:100%;table-layout:fixed;padding-top:5px;padding-right:5px;">
				<tr style="height:35px">
					<td style="padding-left:10px;"  width="100"  ><lable style="float:left">审批动作: </lable></td>
					<td style="padding-left:10px;"  align="left"  >
						<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
							<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
								<select id="EMP_EMPLOYEE.APPROVE_TYPE" onchange="approveChange()" title="审批意见" styleType="select" name="APPROVE_TYPE" emptyText="请选择..."  style="width:200px;height:25px;color: #555;background-color: #fff;border: 1px solid #ccc;border-radius: 4px;font-size: 12px;" textField="dictName" valueField="dictID" DictName="APPROVE_TYPE" nullItemText="请选择..." dataField="dicts"></select>
							</div>
						</div>
					</td>
				</tr>	
				<tr style="height:35px">
					<td style="padding-left:10px;"  width="100"  ><lable style="float:left">驳回方式: </lable></td>
					<td style="padding-left:10px;"  align="left"  >
						<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
							<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
								<select id="EMP_EMPLOYEE.REJECT_TYPE" disabled="false" onchange="rejectChange()" title="驳回方式" styleType="select" name="REJECT_TYPE" emptyText="请选择..."  style="width:200px;height:25px;color: #555;background-color: #fff;border: 1px solid #ccc;border-radius: 4px;font-size: 12px;" textField="dictName" valueField="dictID" DictName="REJECT_TYPE" nullItemText="请选择..." dataField="dicts"></select>
							</div>
						</div>
					</td>
				</tr>
				<tr style="height:35px">
					<td style="padding-left:10px;"  width="100"  ><lable style="float:left">驳回节点: </lable></td>
					<td style="padding-left:10px;"  align="left"  >
						<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
							<div id="solutionList" class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
								<select id="EMP_EMPLOYEE.REJECT_TASK" disabled="false" title="驳回节点" styleType="select" name="REJECT_TASK" emptyText="请选择..."  style="width:200px;height:25px;color: #555;background-color: #fff;border: 1px solid #ccc;border-radius: 4px;font-size: 12px;" textField="dictName" valueField="dictID" DictName="REJECT_TYPE" nullItemText="请选择..." dataField="dicts"></select>
							</div>
						</div>
					</td>
				</tr>
				<tr style="height:65px">
					<td colspan="2" style="padding-left:10px;"  width="90"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"审批意见")%>: </lable></td>
				</tr>
				<tr style="height:65px">
					<td style="padding-left:10px;"  align="left"  ><textarea  id="bz" name="bz"  class="form-control"  rows="5"  style="width:400;"> </textarea></td>
				</tr>
			</table>
			<div class="wrapper wrapper-content animated fadeInRight">
				<div class="row" id="approveList">
				</div>
			</div>
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

function animationHover(element, animation) {
    element = $(element);
    element.hover(
        function () {
            element.addClass('animated ' + animation);
        },
        function () {
            //动画完成之前移除class
            window.setTimeout(function () {
                element.removeClass('animated ' + animation);
            }, 2000);
        });
}

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
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
	
	approveList();
}

function closex(){ 
		    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		    parent.layer.close(index);//执行关闭
}
	
		
function approveList(){
	var procInsId = '${param.procInsId}';
	$.ajax({
		url:'/myehr/act/task/queryApproveList.action?procInsId='+procInsId,
		type:'post',
		contentType: 'application/json;charset=utf-8',
        cache: false,
		success: function (text) {
			showDate(text)
		}
	});
}

function showDate(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
		var message = arr[i].MESSAGE;
		var messages = new Array();
		messages = message.split("|");
		var cellObj = $('<div class="timeline-node">'+arr[i].ACTNAME+'</div>'+
						'<div class="vertical-timeline-block">'+
						'<div class="vertical-timeline-icon"></div>'+
						'<div class="vertical-timeline-content clearfix">'+
						'<div class="pic fl"><img src="http://p.3761.com/pic/43701399945993.png" alt=""></div>'+
						'<div class="content fl">'+
						'<h3 id="shenpiren" class="shenpiren fl">'+arr[i].USER_NAME+'</h3>'+
						'<div id="shenpishijian" class="shenpishijian fr">'+arr[i].ENDTIME+'</div>'+
						'<div class="clearfix"></div>'+
						'		<div class="shenpizhuangtai">'+messages[0]+'</div>'+
						'	</div>'+
						'	<div class="clearfix"></div>'+
						'</div>'+
						'<div id="shenpiyijian" class="shenpiyijian">'+messages[1]+'</div>'+
						'</div>'	
		);
		$('#approveList').append(cellObj);
	}
}


function submit2(){
	var paramsMap = {};
	var _param = {};
	var approveType = document.getElementById("EMP_EMPLOYEE.APPROVE_TYPE").value;
	var rejectType = document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").value;
	var rejectTask = document.getElementById("EMP_EMPLOYEE.REJECT_TASK").value;
	var bz = document.getElementById("bz").value;
	_param.formId=${param.formId};
	_param.buttonId=${param.buttonId};
	_param = window.parent.getdata_${param.formId}(_param.buttonId,_param.formId);
	_param.paramsMap = paramsMap;
	_param.actFlowParams= {taskId:'${param.taskId}',procInsId:'${param.procInsId}',approveType:approveType,rejectType:rejectType,bz:bz,rejectTask:rejectTask};
	$.ajax({
		url:'/myehr/act/task/complete.action',
		type:'post',
		data: JSON.stringify(_param),
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			if(text[0]==0){
				alert("保存失败！");
			}else if(text[0]=='error'){
				alert("操作异常");
			}else {
				alert("操作成功");
				closex();
			}
		}
	});
}

function approveChange(){
	var objS = document.getElementById("EMP_EMPLOYEE.APPROVE_TYPE");
    var value = objS.options[objS.selectedIndex].value;
	if(value=='approveReject'){
		document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").disabled=false;
	}else{
		document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").disabled=true;
		document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").value="";
	}
	
}

function rejectChange(){
	var objS = document.getElementById("EMP_EMPLOYEE.REJECT_TYPE");
    var value = objS.options[objS.selectedIndex].value;
	if(value=='free'){
		var paramsMap = {};
		var _param = {};
		var approveType = document.getElementById("EMP_EMPLOYEE.APPROVE_TYPE").value;
		var rejectType = document.getElementById("EMP_EMPLOYEE.REJECT_TYPE").value;
		var bz = document.getElementById("bz").value;
		_param.formId=${param.formId};
		_param.buttonId=${param.buttonId};
		//_param = window.parent.getdata_${param.formId}(_param.buttonId,_param.formId);
		_param.paramsMap = paramsMap;
		_param.actFlowParams= {taskId:'${param.taskId}',procInsId:'${param.procInsId}',approveType:approveType,rejectType:rejectType,bz:bz};
		$.ajax({
			url:'/myehr/act/task/freeTask.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				var html = '';
				var opationhtml = '';
				for (var i=0;i<text.length;i++){
					opationhtml+="<option value =\""+text[i].actId+"\">"+text[i].actName+"</option>";
				}
				html+="<select id=\"EMP_EMPLOYEE.REJECT_TASK\" disabled=\"false\" title=\"驳回节点\" styleType=\"select\" name=\"REJECT_TASK\"  class=\"form-control\" style=\"width:200px;height:25px;\">"+opationhtml+"</select>";
				$("#solutionList").html(html);
				document.getElementById("EMP_EMPLOYEE.REJECT_TASK").disabled=false;
			}
		});
	}else{
		document.getElementById("EMP_EMPLOYEE.REJECT_TASK").disabled=true;
		document.getElementById("EMP_EMPLOYEE.REJECT_TASK").value="";
	}
}
		
		
			
</script>
</body>
</html>
