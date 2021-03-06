<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommontest.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body style="width:650px;">
	<div style="width:45%;height:350px;float:left; border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;margin-top:50px;margin-right:10px;">
		<h3 style=" background:#FFF;color:blue;height:13px; display:block;font-size:12;position:absolute; left:10px; top:-30px;text-align:center;z-index:100">方案列表</h3>
		<div style="width:100%;overflow:scroll;height:350px;float:left;">
			<div id="solutionList" style="margin-left:10px;margin-top:10px;z-index:1">
			</div>	
		</div>
	</div>
	<div style="width:45%;height:350px;float:left; border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;margin-top:50px;margin-right:10px;">
		<h3 style=" background:#FFF;color:blue;height:13px; display:block;font-size:12;position:absolute; left:10px; top:-30px;text-align:center;z-index:100">公式列表</h3>
		<div style="width:100%;overflow:scroll;height:350px;float:left;">
			<div id="ruleList" style="margin-left:10px;margin-top:10px;z-index:1">
			</div>
		</div>
	</div>
<div id="toolBar" class="nui-toolbar" style="text-align:center;padding-top:0px;padding-bottom:0px;"  borderStyle="border:0;">
	<button  class="btn btn-primary" onclick="excRule()"  style="margin-right:10px;">开始执行</button>
	<button  class="btn btn-primary" onclick="onCancel()"  style="margin-right:10px;">取消</button>
</div>

<script>
$(function() {
    init();
});
var formId=${param.formId};
var formButtonId=${param.formButtonId};
var rules = [];
var selectrules = [];
var solutionId;
var syssolutions =[];
var sysrules = [];
function init(){
	$.ajax({  
        type: 'POST',  
        url: '${pageContext.request.contextPath }/form/getExcSolutionByFormId.action?formButtonId='+formButtonId+'&formId='+formId,  
        success: function (data) { 
            syssolutions = data;
            var html="";
            for(var i=0;i<data.length;i++){
            	
            	html+="<input type=\"checkbox\" id=\"SysSolution"+data[i].solutionId+"\" name=\"SysSolution\" value=\""+data[i].solutionCode+"\" checked=\"CHECKED\" onclick=\"checkChange(this)\"/><a  href=\"#\" style=\"text-decoration:none;\" onclick=\"initRule(this,"+data[i].solutionId+")\">"+data[i].solutionName+"</a><br>";
            }
            solutionId=data[0].solutionId;
            initRule1(solutionId);
        	$("#solutionList").html(html);
        }
    });
}
function initRule1(solutionId){
	$.ajax({  
        type: 'POST', 
        url: '${pageContext.request.contextPath }/form/getSysRuleBySolutionId.action?solutionId='+solutionId,  
        success: function (data) {
        	sysrules = data;
			//"<input type=\"button\" id=\"chooseButton\" onclick=\"allChoose()\"  class=\"btn btn-danger\" value=\"取消全选\">\n"+
					 
            var html="<input type=\"button\" id=\"chooseButton\" onclick=\"fanChoose()\" style=\"display:block\" class=\"btn btn-danger\" value=\"反选\">";
            for(var i=0;i<data.length;i++){
            	var checked = "";
            	if(data[i].ruleIsexc!=null&&data[i].ruleIsexc=='1'){
            		checked = "checked=true";
            	}
            	html+="<input type=\"checkbox\" class=\"SysRule\"  id=\"SysRule"+data[i].ruleId+"\" name=\"SysRule\" value=\""+data[i].ruleCode+"\" "+checked+" onclick=\"checkRule("+data[i].ruleSolutionId+")\"/>"+data[i].ruleName+"<br>";
            	rules=data;
            	if(rules[i].ruleIsexc=='1'){
					selectrules.push(rules[i]);
				}
            }
        	$("#ruleList").html(html);
        }
    });
}
function initRule(obj,solutionId){
	var alist = document.getElementsByTagName("a"); 
	for(var i =0;i < alist.length;i++){ 
		alist[i].style.color = "#428BCA"; //给所有a标签赋原色 
	}
	if(obj.style!=undefined){
		obj.style.color = "#f00";
	}
	//令当前标签高亮 
	$.ajax({  
        type: 'POST', 
        url: '${pageContext.request.contextPath }/form/getSysRuleBySolutionId.action?solutionId='+solutionId,  
        success: function (data) {
        	sysrules = data;
            var html="";
            for(var i=0;i<data.length;i++){
            	html+="<input type=\"checkbox\" id=\"SysRule"+data[i].ruleId+"\" name=\"SysRule\" value=\""+data[i].ruleCode+"\" checked=\"checked\"  onclick=\"checkRule("+data[i].ruleSolutionId+")\"/>"+data[i].ruleName+"<br>";
            	rules=data;
            	if(rules[i].ruleIsexc=='1'){
					selectrules.push(rules[i]);
				}
            }
        	$("#ruleList").html(html);
        }
    });
}

function allChoose(){
	if($("#chooseButton").val()=='取消全选'){
		$(".SysRule").attr("checked",false);
	}
}
function fanChoose(){
	$(".SysRule").each(function(){ 
		if($(this).prop("checked")) 
		{ 
			$(this).removeAttr("checked"); 
		} 
		else 
		{ 
			$(this).prop("checked",true); 
		} 
	}) 
}

function checkChange(obj) {  
    if (obj.checked == false) {  
        var smObj = document.getElementsByName("SysRule");  
        for (var i = 0; i < smObj.length; i++) {
             smObj[i].checked = false;  
        }  
    }  
    if (obj.checked == true) {  
        var smObj = document.getElementsByName("SysRule");  
        for (var i = 0; i < smObj.length; i++) {
             smObj[i].checked = true;  
        }  
    }
}

function checkRule(obj) {  
    var smObj = document.getElementById("SysSolution"+obj);  
    smObj.checked= true;
}
function excRule(){
		//接收各参数
		var checkdata1 = getCheckedDatas();
		var checkdata2 = getCheckedDatas1();
		
		if(checkdata1==null||checkdata1.length==0){
			alert('请至少选择一个方案');
			return ;
		}
		
		if(checkdata2==null||checkdata2.length==0){
			alert('请至少选择一个公式');
			return ;
		}
		var erules = [];
		for(var i=0; i<selectrules.length; i++){
			for(var k=0; k<checkdata1.length; k++){
				if(selectrules[i].ruleSolutionId==checkdata1[k].solutionId){
					erules.push(selectrules[i]);
				}
			}
		}
		if(erules==null||erules.length==0){
			document.getElementById('paramiframe').src = "/default/system/scheme/runtime/norupepage.jsp";
			return;
		}
		var ruleIds =""; 
		for(var i=0; i<checkdata2.length; i++){
			if(i==0){
				ruleIds =ruleIds+checkdata2[i].ruleId;;
			}else {
				ruleIds =ruleIds+","+checkdata2[i].ruleId;
			}
		}
		var eurl = "/myehr/jsp/form/button/excSolutionRule.jsp?ruleIds="+ruleIds+"&buttonId="+formButtonId+"&formId="+formId+"";
		if(checkParam(ruleIds,formButtonId,formId)==true){
			excRule1(ruleIds,formButtonId,formId);
		}else{
			startExcRule(eurl);
		}
	}
	
	function checkParam(ruleIds,buttonId,formId){
		var flag = false;
		$.ajax({  
			type: 'POST',
			async: false,  
			url: '${pageContext.request.contextPath }/form/checkAndExcSolutionParams.action?ruleIds='+ruleIds+'&formId='+formId+'&buttonId='+buttonId,  
			success: function (data) {
				params=data;
				if(data.length<=0){
					flag = true;
				}else{
					flag = false;
				}
			}
		});
		return flag;
	}
	
	//执行公式
	function excRule1(ruleIds,buttonId,formId){
		var _param = {};
		_param = {ruleIds:ruleIds,formId:formId,buttonId:buttonId};
		var params = {};
		_param.params=params;
		var test = window.location.search;
		test = test.substring(1,test.length);
		var oparams = {};
		var ps = test.split("&");
		for(var i=0;i<ps.length;i++){
			var p = ps[i].split("=");
			oparams[p[0]] = p[1];
		}
		_param.oparams = oparams;
		$.ajax({
			url: '${pageContext.request.contextPath }/form/excRule.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
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
	
	function startExcRule(url) {
        var btnEdit = this;
        layer.open({
            type: 2,
			showMaxButton: true,
            title: "参数录入",
            area: ['400', '350'],
            offset: ['0px', '0px'],
            content:url,
            onload:function(){ 
			},
            ondestroy: function (action) {
            	alert(action);   
            	var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
            }
    	});
    }
    
function getCheckedDatas(){ //jquery获取复选框值 
	var chk_value =[]; 
	$('input[name="SysSolution"]:checked').each(function(){ 
		for(var i=0;i<syssolutions.length;i++){
	    	if(syssolutions[i].solutionCode==$(this).val()){
	    		chk_value.push(syssolutions[i]); 
	    	}
	    } 
	}); 
	return chk_value; 
} 

function getCheckedDatas1(){ //jquery获取复选框值 
	var chk_value =[];
	$('input[name="SysRule"]:checked').each(function(){
	    for(var i=0;i<sysrules.length;i++){
	    	if(sysrules[i].ruleCode==$(this).val()){
	    		chk_value.push(sysrules[i]); 
	    	}
	    }
		
	}); 
	return chk_value; 
}

function onCancel(){ 
    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
    parent.layer.close(index);//执行关闭
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
