<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
String s = request.getParameter("author1");
System.out.println(s+"sssss=");

Map parammap=request.getParameterMap();  
		String b ="";
	    Set keSet=parammap.entrySet();  
	    for(Iterator itr=keSet.iterator();itr.hasNext();){  
	        Map.Entry me=(Map.Entry)itr.next();  
	        Object ok=me.getKey();  
	        Object ov=me.getValue();  
	        String[] value=new String[1];  
	        if(ov instanceof String[]){  
	            value=(String[])ov;  
	        }else{  
	            value[0]=ov.toString();  
	        }  
	        for(int k=0;k<value.length;k++){  
	            System.out.println(ok+"="+value[k]);  
	            StringBuilder bulid = new StringBuilder();
	            	b += bulid.append(ok+"="+value[k]).toString().trim()+"&";
	            	System.out.println(b);  
	        } 
	      }  
	      
	      System.out.println("b="+b);	     
%><html>
<head>
    <style type="text/css" href="./css/bootstrap.min.css"></style>
    <link rel="stylesheet" href="cssjs/animate.css" type="text/css"></link>
	<link rel="stylesheet" href="cssjs/jquery.steps.css" type="text/css"></link>
	<script type="text/javascript" src="cssjs/jquery.steps.min.js"></script>
	<script type="text/javascript" src="cssjs/formCardBuildStep.js"></script>
	<style type="text/css">
	.wrapper{width:98%;margin:0 auto;padding-top:10px}
	.row{margin:0;}
	.wizard > .content > .body{padding: 0.5% 2.5%;}
	.row.cell>div lable{font-weight:600}
	.fixed-table-container thead th .th-inner, .fixed-table-container tbody td .th-inner{font-weight:600}
	fieldset{height:100%}
	.ztree li a{width:89%}
	#step2_part2 .fixed-table-body {height:100%}
	.wizard > .content > .body ul > li{list-style:none}
	#step2_part2 .clearfix{display:none}
	.row.cell>div{min-height:30px;margin:10px 0 0 0;}
	.wizard > .steps > ul > li{width:50%}
	#form-p-5,#form-p-4,#form-p-3,#form-p-2,#form-p-1{width:100%;height:97%}
	</style>
</head>

<body>
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div id="form" class="wizard-big">
                    <h1>基本配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step1" name="form_step1" class="col-sm-12" >
                                <div class="container-fluid" style="overflow-y:auto;">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;">
                                        <h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">基础信息</h3>
                                            <div class="row cell" id="form1" >
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">表单编码</lable>
                                                        <input id="formDefCode" name="formDefCode" type="text" class="form-control" style="width:200px;" value="${param.fieldChinaName}"/>
                                                        <input id="formDefType" name="formDefType" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
                                                        <input id="formDefId" name="formDefId" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
                                                        <input id="formDefFolderId" name="formDefFolderId" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">表单名称</lable>
                                                        <input id="formDefName" name="formDefName" type="text" class="form-control" style="width:200px;" value="${param.controlType}"/>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">表单布局类型</lable>                        
                                                        <select id="formDefLayoutType" title="表单布局类型" styleType="select" name="formDefLayoutType" disabled   class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_LAYOUT" dataField="dicts">
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">是否流程表单</lable>                        
                                                        <select id="formDefIsProcess" title="是否流程表单" styleType="select" name="formDefIsProcess"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">是否不受权限控制</lable>                      
                                                        <select id="formAuthorityIsControl" title="是否不受权限控制" styleType="select" name="formAuthorityIsControl"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">是否移动端表单</lable>                      
                                                        <select id="isApp" title="是否移动端表单" styleType="select" name="isApp"  class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts"></select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">权限SQL</lable>
                                                        <textarea id="powerSql" name="powerSql" rows="2" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">排序SQL</lable>
                                                        <textarea id="orderSql" name="orderSql" rows="2" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">表单描述</lable>
                                                        <textarea id="formDefDesc" name="formDefDesc" rows="2" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">前置初始函数</lable>
                                                        <textarea id="formDefInitQzJs" name="formDefInitQzJs" rows="2" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:40px">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">前置初始SQL</lable>
                                                        <textarea id="formDefInitQzSql" name="formDefInitQzSql" rows="2" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        
                                        	<div id="form2">
	                                          	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">布局扩展信息</h3>
	                                            <div class="row cell"  >
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">每行显示列数</lable>
															<input id="reportRowCount" name="reportRowCount" type="number" value="2" class="form-control" style="width:200px;float:left;text-align:left" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">lable宽度</lable>
															<input id="reportLableWidth" name="reportLableWidth" type="number" value="90" class="form-control" style="width:200px;float:left;text-align:left" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">关联报表ID</lable>
															<input id="reportRelId" name="reportRelId" type="text" placeholder="关联报表ID" class="form-control" style="width:200px;float:left;text-align:left" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">易客报表类型</lable>
															<input id="reportType" name="reportType" type="text" value="DDYW" class="form-control" style="width:200px;float:left;text-align:left" />
														</div>
													</div>
													<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
														<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
															<lable style="float:left">查询按钮名称</lable>
															<input id="reportButtonName" name="reportButtonName" type="text" value="查询" class="form-control" style="width:200px;float:left;text-align:left" />
														</div>
													</div>
	                                            </div>
	                                        </div>
                                        
	                                        <div>
	                                        	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">显示配置JS参数</h3>
	                                        	<div class="row cell" style = "padding-left:15px">
	                                        		<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="saveJS"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存参数")%> onclick="saveJs()"/>
														</div>
													</div>
													<table id="jsList">
													</table>
												</div>
	                                        </div>
                                        
                                        </div>  
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    
                    <h1>参数配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step2" name="form_step2" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;height:100%">
											<table>
												<tr>
													<td>
														<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
															<div style="margin-right:10px;display:inline-block">
																<input type="button" id="addColumn"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加查询控件")%> onclick="addRow()"/>
															</div>
															<div style="margin-right:10px;display:inline-block">
																<input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveDataStep4()"/>
															</div>
														</div>
													</td>
												</tr>
											</table>
											<table id="tableListStep4">
											</table>
	                                    </div>
	                                </div>
	                            </div>
	                        </div>
	                    </div>   
                    </fieldset>
									
                </div>
            </div>
        </div>
    </div>
</body>
<script>
window.onload=function(){
var  author1 ="${param.author1}"; 
var b = "<%=b%>";
if(author1!=""){
			b=b.substring(0,b.indexOf("author1")-1);
			
	        var author = md5(b);
            var  author1 = "${param.author1}"; 
           

	if(!author==author1){
		alert("请求不一致");
		custom_close()
	}
}
}
function custom_close(){  

window.opener=null;  
window.open('','_self');  
window.close();  
 
}var formId='${param.formDefId}';
var reportId = 0 ;
$(document).ready(function () {
    $("#form").steps({
        bodyTag: "fieldset",
        onStepChanging: function (event, currentIndex, newIndex) {
            if (currentIndex == 0) {//离开基础配置
                return saveFormInfo();
            }
            if (currentIndex == 1) {//离开列表配置
                return true;
            }
            
            // Start validation; Prevent going forward if false
            return true;
            
           
        },
        onStepChanged: function (event, currentIndex, priorIndex) {
        },
        onFinishing: function (event, currentIndex) {
            var form = $(this);


            // Start validation; Prevent form submission if false
            return saveFormInfo();
        },
        onFinished: function (event, currentIndex) {
            var form = $(this);
            CloseWebPage();
            //真正完成后调用方法
            // Submit form input
            //form.submit();
        }
    });
    var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#form_step1 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		if(dataField.split("_")[2]=="0000"){
 			dataField = dataField+"|${param.formDefId}";
 		}
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}	
		
    formInit();//表单类型初始化
    
    jsParamInit();
    
});

function formInit(){
	var param = {};
	param.formId = '${param.formDefId}';
	$.ajax({
		url:'${pageContext.request.contextPath }/form/loadYKInfo.action',
		type:'post',
		data:JSON.stringify(param),
		contentType: 'application/json;charset=utf-8',
		cache: false,
		async: false,
		success: function (data) {
			$("#formDefId").val(data.param.formDefId);
			$("#formDefLayoutType").val(data.param.formDefLayoutType);
			$("#formDefFolderId").val(data.param.formDefFolderId);
			$("#formDefName").val(data.param.formDefName);
			$("#formDefCode").val(data.param.formDefCode);
			if(data.formDefIsProcess!=null&&data.formDefIsProcess!=""){
				$("#formDefIsProcess").val(data.formDefIsProcess);
			}else{
				$("#formDefIsProcess").val("N");
			}
			if(data.formAuthorityIsControl!=null&&data.formAuthorityIsControl!=""){
				$("#formAuthorityIsControl").val(data.formAuthorityIsControl);
			}else{
				$("#formAuthorityIsControl").val("N");
			}
			if(data.isApp!=null&&data.isApp!=""){
				$("#isApp").val(data.isApp);
			}else{
				$("#isApp").val("N");
			}
			$("#powerSql").val(data.param.powerSql);
			$("#orderSql").val(data.param.orderSql);
			$("#formDefDesc").val(data.param.formDefDesc);
			$("#formDefInitQzJs").val(data.param.formDefInitQzJs);
			$("#formDefInitQzSql").val(data.param.formDefInitQzSql);
			if(data.formYkReport!=null){
				reportId = data.formYkReport.reportId+"";
				if(data.formYkReport.reportRowCount!=""||data.formYkReport.reportRowCount!=null){
					$("#reportRowCount").val(data.formYkReport.reportRowCount);
				}else{
					$("#reportRowCount").val(2);
				}
				if(data.formYkReport.reportLableWidth!=""||data.formYkReport.reportLableWidth!=null){
					$("#reportLableWidth").val(data.formYkReport.reportLableWidth);
				}else{
					$("#reportLableWidth").val(90);
				}
				if(data.formYkReport.reportRelId!=""||data.formYkReport.reportRelId!=null){
					$("#reportRelId").val(data.formYkReport.reportRelId);
				}else{
					$("#reportRelId").val("");
				}
				if(data.formYkReport.reportType!=""||data.formYkReport.reportType!=null){
					$("#reportType").val(data.formYkReport.reportType);
				}else{
					$("#reportType").val("DDYW");
				}
				if(data.formYkReport.reportButtonName!=""||data.formYkReport.reportButtonName!=null){
					$("#reportButtonName").val(data.formYkReport.reportButtonName);
				}else{
					$("#reportButtonName").val("查询");
				}
			}
		}
	});
}

function saveFormInfo(){
	var param = {};
	var flag = false;
	param.formAuthorityIsControl = $("#formAuthorityIsControl").val();
	param.formDefCode = $("#formDefCode").val();				
	param.formDefDesc = $("#formDefDesc").val();
	param.formDefEntitySql = "null";
	param.formDefFolderId = $("#formDefFolderId").val();
	param.formDefId = $("#formDefId").val();
	param.formDefInitQzJs = $("#formDefInitQzJs").val();
	param.formDefInitQzSql = $("#formDefInitQzSql").val();
	param.formDefIsProcess = $("#formDefIsProcess").val();
	param.formDefLayoutType = $("#formDefLayoutType").val();
	param.formDefName = $("#formDefName").val();
	param.formDefSql = "null";
	param.isApp = $("#isApp").val();
	param.orderSql = $("#orderSql").val();
	param.powerSql = $("#powerSql").val();
	

	var sysFormYkReport = {};
	if($("#reportButtonName").val()!=null&&$("#reportButtonName").val()!=""){
		sysFormYkReport.reportButtonName = $("#reportButtonName").val();
	}else{
		sysFormYkReport.reportButtonName = '查询';
	}
	sysFormYkReport.reportFormId = '${param.formDefId}';
	sysFormYkReport.reportId = reportId;
	if($("#reportLableWidth").val()!=null&&$("#reportLableWidth").val()!=""){
		sysFormYkReport.reportLableWidth = $("#reportLableWidth").val();
	}else{
		sysFormYkReport.reportLableWidth = '90';
	}
	if($("#reportRelId").val()!=null&&$("#reportRelId").val()!=""){
		sysFormYkReport.reportRelId = $("#reportRelId").val();
	}else{
		sysFormYkReport.reportRelId = '';
	}
	if($("#reportRowCount").val()!=null&&$("#reportRowCount").val()!=""){
		sysFormYkReport.reportRowCount = $("#reportRowCount").val();
	}else{
		sysFormYkReport.reportRowCount = '2';
	}
	
	if($("#reportType").val()!=null&&$("#reportType").val()!=""){
		sysFormYkReport.reportType = $("#reportType").val();
	}else{
		sysFormYkReport.reportType = 'DDYW';
	}

	
	if(updataForm(param)){
		$.ajax({
			url:'${pageContext.request.contextPath }/form/updataFormYkReport.action',
			type:'POST',
			data: JSON.stringify(sysFormYkReport),
		    cache: false,
		    contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (datas) {
					flag = true;
		    		reportId = datas;
		    		query_tableStep4();
				}
			});
	}
	return flag;
}

function updataForm(param){
	
	var flag = false;
	var signstr = JSON.stringify(param);
	var rule ='\"' ;
	var regS = new RegExp(rule,'g');
	var rule2 =':' ;
	var regS2 = new RegExp(rule2,'g');
	signstr = signstr.replace(regS, '');
	signstr = signstr.replace(regS2, '=');
	var sign = md5(signstr);

	$.ajax({
		url:'${pageContext.request.contextPath }/form/updataGridFormParam1.action?sign='+sign,
		type:'POST',
		data: JSON.stringify(param),
	    cache: false,
	    contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {				
				if(data=='0'){
					layer.alert('保存失败!表单编码重复', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				} else if(data=='2'){
					layer.alert('保存失败!表单中存在多个此表单编码', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
					$('#formList_step2').bootstrapTable('refresh'); 
				} else if(data=='1'){
					flag = true;
					layer.alert('保存成功', {
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				}								
			}
		});
	return flag;
}

function jsParamInit(){
	$("#jsList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/findJsParamList.action?paramTypeValue='+${param.formDefId}, 
		height:'200',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    title : '主键',  
		    field : 'paramId', 
		    visible:false
		},
        {  
            title : '操作',  
            field : 'paramType', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {            	
            	return "<div style=\"position:relative\">"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 38px;top: -6px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
        	}
        },{  
            title : '参数名称',  
            field : 'paramName', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '绑定表单ID',  
            field : 'paramTypeValue',  
            align : 'center',  
            valign : 'middle', 
            visible:false
        }, {  
            title : '参数值来源类型',  
            field : 'paramFromType',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
            	var select1,select2,select3,select4;
            	if(value==undefined){
	        		value = "";
	        	}else if(value=="session"){
	        		select1="selected";
	        	}else if(value=="containerParam"){
	        		select2="selected";
	        	}else if(value=="parameter"){
	        		select3="selected";
	        	}else if(value=="constant"){
	        		select4="selected";
	        	}
            	return  "		<select id=\"formDefLayoutType\" title=\"表单布局类型\" styleType=\"select\" name=\"buttonParamFrom\" value=\""+value+"\"  class=\"form-control\" >\n"+
						"			<option value >请选择</option>\n"+
						"			<option value=\"session\" "+select1+">会话参数</option>\n"+
						"			<option value=\"containerParam\" "+select2+">容器参数</option>\n"+
						"			<option value=\"parameter\" "+select3+">请求参数</option>\n"+
						"			<option value=\"constant\" "+select4+">常量</option>\n"+					
						"		</select>\n";
        	}
        }, {  
            title : '参数值来源',  
            field : 'paramFromValue',  
            align : 'center',  
            valign : 'middle', 
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"buttonParamValue\" data-type=\"text\" title=\"参数值来源\" value=\""+value+"\"/>";
        	}
        }  	  
        ],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                
	            },
	            data:[],       
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function saveJs(){
	var datas = $("#jsList").bootstrapTable("getData");
	var saveDatas = [];
	for(var i=0;i<datas.length;i++){
		var paramName = $("#jsList>tbody").find("tr").eq(i).find("input").eq(0).val();
		var paramFromValue = $("#jsList>tbody").find("tr").eq(i).find("input").eq(1).val();
		var paramFromType = $("#jsList>tbody").find("tr").eq(i).find("select").eq(0).val();
		if(paramName!=datas[i].paramName||paramFromValue!=datas[i].paramFromValue||paramFromType!=datas[i].paramFromType){		
		//实体可修改部分是否修改(有一处不同,就需修改)
			datas[i].paramName=paramName;
			datas[i].paramFromValue=paramFromValue;
			datas[i].paramFromType=paramFromType;
			datas[i].paramTypeValue='${param.formDefId}';
			datas[i].paramType = 'FORMCONFIG|JS_VAR';
			saveDatas.push(datas[i]);
		}
	}
	var url = "${pageContext.request.contextPath }/form/updateJsParam.action";//更新实体信息
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDatas),
		async: false,
		success: function (data) {				
			}
		});
	$('#jsList').bootstrapTable('refresh');
}

function remove(obj){
	var jsParam = {};
	jsParam.paramName = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/form/deleteJsParam.action',
		type:'post',
		cache: false,
		data:JSON.stringify(jsParam),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			
			}
		});
	$('#jsList').bootstrapTable('refresh');
}

var map = new Map(); 

function saveInfo(url,datas){
	$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(datas),
			async: false,
			success: function (data) {
					
				}
			});
}


//根据表单ID获取表单名
function getFormNameById(formDefId){
	var formDefName;
	$.ajax({
		url:'${pageContext.request.contextPath}/form/getFormNameById.action?formDefId='+formDefId,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
				formDefName = data.formDefName;
			}
		});
	return formDefName;
}

function getDictnameByCode(e){
	var DictName;
	$.ajax({
		url:'${pageContext.request.contextPath}/form/getDictnameByCode.action?dictTypeCode='+e,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
				DictName = data.dictTypeName;
			}
		});
	return DictName;
}

function query_tableStep4() {   
    $("#tableListStep4").bootstrapTable({  
        url : '${pageContext.request.contextPath }/reportForm/queryFormReportParamsByFormId.action?formId='+formId, 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
            title : '操作',  
            field : 'queryParamId', // 字段  
            align: 'center',
            valign: 'middle',
            width:50,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"queryParamId\" style=\"width:0px;padding:0px;border:none\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
					   "<input type=\"hidden\" name=\"paramsId\" style=\"width:0px;padding:0px;border:none\" readonly=true data-type=\"text\" data-pk=\""+row.paramsId+"\" data-title=\"参数ID\" value=\""+row.paramsId+"\"/>"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removeStep4(this)\"></i><div>" ;
        	}
		},{
			
            title : '参数编码',  
            field : 'sqlParamsCode', // 字段  
            align: 'center',
            valign: 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"sqlParamsCode\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数编码\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '参数名称',  
            field : 'sqlParamsName', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"sqlParamsName\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数名称\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '控件类型',  
            field : 'sqlParamsGuiType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"sqlParamsGuiType"+index+"\" class=\"form-control\" name=\"sqlParamsGuiType\" DictName=\"SYS_FORM_GUI_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"控件类型\" value=\""+value+"\"/>" ;
        	}
		},{  
            title : '显示宽度',  
            field : 'paramsWidth', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"paramsWidth\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"显示宽度\" value=\""+value+"\"/>" ;
        	}
		},{  
            title : '跨字段数',  
            field : 'colspanCount', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"colspanCount\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"跨字段数\" value=\""+value+"\"/>" ;
        	}
		},{  
            title : '显示顺序',  
            field : 'sort', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"sort\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"显示顺序\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '显示方式',  
            field : 'showType',  
            align : 'center',  
            valign : 'middle',  
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"showType"+index+"\" class=\"form-control\"  name=\"showType\" DictName=\"SYS_FORM_COLUMN_SHOW_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"显示方式\" value=\""+value+"\"></selcct>" ;
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelect();
	            },
	            data:[],       
        responseHandler : function(res) { 
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function addRow(insertIndex){
	var url = '${pageContext.request.contextPath }/jsp/form/param/paramManager1.jsp?formId='+${param.formDefId}+'&reportId='+reportId;
	layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择表单")%>',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		$('.layui-layer-max').click();
		},
		end:function(){
			$('#tableListStep4').bootstrapTable('refresh');
		}
	});
}

var objx;
function chooseEntity(obj){
	objx = obj;
	saveDataStep4();
	addRow();
}

function removeStep4(obj){
	var data = {};
	data.queryParamId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/reportForm/deleteReportColumn.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#tableListStep4').bootstrapTable('refresh');
		}
	});
}

function _initDataStep4(pkId){
	var formId = '${param.formDefId}';
	if(formId==undefined || formId=='' ){
		formId = '${param.formDefId}';
	}
	
	var _form = getForm("#form_1881");
	var _Type = getType("#form_1881");
	$.ajax({
		url:'${pageContext.request.contextPath }/form/queryGridFilterByFormId.action?formId='+formId,
		type:'post',
		//data: JSON.stringify(_param),
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			if(text !=null){
				var object = text;
				for(var key in object){
					if(_form[key]!=null&&_form[key]!="undefined"){
						if(key=='gridFilterHeightGrade'){
							if(object[key]=="true"){
								document.getElementById(_form[key]).checked=true;
							}
						}else if(_Type[key]=="dateTime"){
							date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
							document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
						}else{
							document.getElementById(_form[key]).value=object[key];
						}
					}
				};
			}
		},
		error: function (jqXHR, textStatus, errorThrown) {
		}
	});
}

$(":checkbox").click(function() {
	if ($(this).is(":checked")) {
		this.value="true";
	} else {
		this.value="false";
	}
});

function getForm(formId){
	var object=[];
	$(formId).find("input").each(function(){
		var xxx = this.id.split(".")[1];
		if(xxx!=undefined){
			var xx = xxx.split("_");
			var arr = [];
			var id = "";
			for(var i=0;i<xx.length;i++){
				if(i<xx.length-1){
					id = id+xx[i]+"_";
				}else{
					id = id+xx[i];
				}
			}
			object[id]=this.id;
		}
	})
	$(formId).find("select").each(function(){
		var xxx = this.id.split(".")[1];
		if(xxx!=undefined){
			var xx = xxx.split("_");
			var arr = [];
			var id = "";
			for(var i=0;i<xx.length;i++){
				if(i<xx.length-1){
					id = id+xx[i]+"_";
				}else{
					id = id+xx[i];
				}
			}
			object[id]=this.id;
		}
	})
	$(formId).find("textarea").each(function(){
		var xxx = this.id.split(".")[1];
		if(xxx!=undefined){
			var xx = xxx.split("_");
			var arr = [];
			var id = "";
			for(var i=0;i<xx.length;i++){
				if(i<xx.length-1){
					id = id+xx[i]+"_";
				}else{
					id = id+xx[i];
				}
			}
			object[id]=this.id;
		}
	})
	return object;
}
function getType(formId){
	var object=[];
		$(formId).find("input").each(function(){
			var vtype = $(this).attr('format');
			if(vtype!=undefined){
				var xxx = this.id.split(".")[1];
					var xx = xxx.split("_");
					var arr = [];
					var id = "";
					for(var i=0;i<xx.length;i++){
						if(i<xx.length-1){
							id = id+xx[i]+"_";
						}else{
							id = id+xx[i];
						}
					}
				object[id]="dateTime";
			}
		})
	return object;
}

function getdata_1881(buttonId,formId){
	var param = {};
	var data = {buttonId:buttonId,formId:formId,param:{},paramsMap:{}};
	$.map($('[name=form_'+formId+']').serializeArray(), function(item, index){
		var property =item['name'];
		var value = item['value'];
		param[property] = value;
	});
	data.param = param;
	return data;
}
function formatDatebox(value,key) {
		var type = document.getElementById(key).getAttribute("dateType");
		type = type.substr(type.length-1,1);
	    var year=value.substr(0,4);
	    var index1=value.indexOf("-");
	    var index2=value.lastIndexOf("-");
	    var d1=parseInt(index2)-(parseInt(index1)+1);
	    var month=value.substr((parseInt(index1)+1),d1);
	    var kg=value.indexOf(" ");
	    d2=parseInt(kg)-parseInt(index2);
	    var day=value.substr(parseInt(index2)+1,d2);
	    var mh=value.indexOf(":");
	    d3=parseInt(mh)-(parseInt(kg)+1);
	    var hh=value.substr(parseInt(kg)+1,d3);
	    var mh2=value.lastIndexOf(":");
	    d4=parseInt(mh2)-(parseInt(mh)+1);
	    var mm=value.substr(parseInt(mh)+1,d4);
	    if(mm!=0){
	    	mm = parseInt(mm)+6;
	    	if(parseInt(mm)<10){
	    		mm = "0"+mm;
	    	}else if(parseInt(mm)==60){
	    		mm="00";
	    		hh=parseInt(hh)+1;
	    		}else if(parseInt(mm)>60){
	    			mm=parseInt(mm)-60;
	    			mm="0"+mm;
	    			hh=parseInt(hh)+1;
	    			}
	    }
	    var mh2=value.lastIndexOf(":");
	    var ss=value.substr(parseInt(mh2)+1);
	    if(type == 1){
		        return year+"-"+month+"-"+day;
	    }else if(type == 2){
		        return year+"-"+month+"-"+day+" "+hh+":"+mm;
	    }else if(type == 3){
		        return hh+":"+mm;
	    }else if(type == 4){
		        return year;
	    }else if(type == 5){
		        return year+month;
	    }
}

function saveDataStep4(){
	var saveDate = getEntityDataStep4();
	if(saveDate[0].queryParamId==undefined){
		alert("请添加查询字段");
		return;
	}
	var param = {};
	param.columns= saveDate;
	$.ajax({
		url:'${pageContext.request.contextPath }/reportForm/saveReportColumn.action?formId='+formId,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(param),
		async: false,
		success: function (data) {
			if(data[0]=="0"){
				$('#tableListStep4').bootstrapTable('refresh');
			}
		}
	});
	
}

function getEntityDataStep4(){
	var i = 0;
	var data = [];
	var reportId = 3;
	$("#tableListStep4>tbody").find("tr").each(function(){
		if($(this).find("select").eq(0).val()!=""){
			var table = {};
			table.queryParamId=$(this).find("input").eq(0).val();
			table.paramsId=$(this).find("input").eq(1).val();
			table.paramsWidth=$(this).find("input").eq(4).val();
			table.colspanCount=$(this).find("input").eq(5).val();
			table.sort=$(this).find("input").eq(6).val();
			table.showType=$(this).find("select").eq(0).val();
			table.formColumnSort=$(this).find("input").eq(7).val();
			table.reportId =reportId;
			data[i] = table;
			i++;
		}
	})
	return data;
}

function addListSelect(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#tableListStep4 select ");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+${param.formDefId};
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
}

var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
		jsonParam:{},
		formType:'',
		chang:function (e){
			var aaa = e;
		}
};
window.onload=function(){
	var containerParam={};
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#tableListStep4 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+${param.formDefId};
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}
	
	if(formId!='' && formId!=null){
		//_initDataStep4(formId);
	}

}

$(function () {  
	$('.form_date1').datetimepicker({ 
	 language:  'zh-CN',  
	 format:"yyyy-mm-dd",  
	 weekStart: 1,  
	 todayBtn:  1,  
	 autoclose: 1,  
	 todayHighlight: 1,  
	 startView: 2,  
	 minView: 2,  
	 forceParse: 0,  
	 pickerPosition: "bottom-left"  
	});  
	$('.form_date2').datetimepicker({ 
	 language:  'zh-CN',  
	 format:"yyyy-mm-dd hh:ii",  
	 weekStart: 1,  
	 todayBtn:  1,  
	 autoclose: 1,  
	 todayHighlight: 1,  
	 startView: 2,  
	 minView: 0,  
	 forceParse: 0,  
	 pickerPosition: "bottom-left"  
	});  
	$('.form_date3').datetimepicker({ 
	 language:  'zh-CN',  
	 format:"hh:ii",  
	 weekStart: 1,  
	 todayBtn:  1,  
	 autoclose: 1,  
	 todayHighlight: 1,  
	 startView: 0,  
	 minView: 2,  
	 forceParse: 0,  
	 pickerPosition: "bottom-left"  
	});  
	$('.form_date4').datetimepicker({ 
	 language:  'zh-CN',  
	 format:"yyyy-mm-dd",  
	 weekStart: 1,  
	 todayBtn:  1,  
	 autoclose: 1,  
	 todayHighlight: 1,  
	 startView: 4,  
	 minView: 4,  
	 forceParse: 0,  
	 pickerPosition: "bottom-left"  
	});  
});

</script>
</html>