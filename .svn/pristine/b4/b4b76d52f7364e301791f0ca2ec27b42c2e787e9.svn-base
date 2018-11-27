<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="width:350px;height:300px">
<div id="form1" style="width:100%;">
<!-- 表单体部分 -->
 <!-- 隐藏域 -->
	<input class="hidden" id="ruleIds" name="ruleIds" value="" />
	<input class="hidden" id="formId" name="formId" value="" />
	<input class="hidden" id="buttonId" name="buttonId" value="" />
 
</div>
 <!-- 表单按钮部分 -->
<div id="toolBar" class="nui-toolbar" style="text-align:center;padding-top:0px;padding-bottom:0px;"  borderStyle="border:0;">
	<button  class="btn btn-primary" onclick="excRule()"  style="margin-right:10px;">开始执行</button>
	<button  class="btn btn-primary" onclick="closeThis()"  style="margin-right:10px;">取消</button>
</div>


<script>
var ruleIds = '${param.ruleIds}';
$(function() {
	initJsp();
}) 

function initJsp(){
	var cellObj ='';
	$.ajax({
		url: '${pageContext.request.contextPath }/form/getParambyruleId.action?ruleIds='+ruleIds,
		type:'post',
		cache: false,
		async: false,  
		success: function (datas) {
	        cellObj += '<div class="col-md-12 col-sm-12 col-lg-12" id="MainElement" style="position: static;">'+
					   '    <div class="contact-box">'+
					   '	   <form class="row cell" name="form_params" style="padding-right:50px;padding-bottom:40px">';
			for(var i=0;i<datas.length;i++){
				cellObj +='	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
						  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
						  '			<label style="float:left;font-size:14px;width:100px;">'+datas[i].paramName+': </label>'+
						  '			<input type="text" class="form-control paramContent" id="'+datas[i].paramName+'" style="width:250px;"/>'+
						  '		</div>'+
						  '	</div>';
			}			
			cellObj +=	'		</form>'+
						'	</div>'+
						'</div>';
			$("#form1").append(cellObj);
		}
	}); 
}


//执行公式
function excRule(){
	var _param = {};
	_param = {ruleIds:ruleIds,formId:${param.formId},buttonId:${param.buttonId}};
	var params = {};
	var paramContents = $(".paramContent");
	for(var i=0;i<paramContents.length;i++){
		var id = paramContents[i].id;
		var val = paramContents[i].value;
		params[id] = val;
	}
	
	_param.params=params;
	_param.oparams = {};
 	//com.dcf.system.scheme.schemaExcComp.excRule
 	$.ajax({
		url: '${pageContext.request.contextPath}/form/excRule.action',
		type:'post',
		data: JSON.stringify(_param),
		cache: false,
		async: false,  
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			if(text=="success"){
				alert("执行成功");
				var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
			}else{
				alert("执行失败");
			}
		},
		error: function (jqXHR, textStatus, errorThrown) {
			dcf.unmask();
			nui.alert(jqXHR.responseText);
		}
	}); 
}

function closeThis(){ 
    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
    parent.layer.close(index);//执行关闭
}

/**取url参数值  */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}

var classes = $("select");
var parame={
	id:'',
	value:"N",
	width: "100px",  
	height:"45px",
	url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action',
	jsonParam:{},
	chang:function (e){
		var aaa = e;
	}
};


</script>
</body>
</html>
