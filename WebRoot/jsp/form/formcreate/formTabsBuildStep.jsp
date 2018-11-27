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
%>
<html>
<head>
    <style type="text/css" href="./css/bootstrap.min.css"></style>
    <link rel="stylesheet" href="cssjs/animate.css" type="text/css"></link>
	<link rel="stylesheet" href="cssjs/jquery.steps.css" type="text/css"></link>
	<script type="text/javascript" src="cssjs/jquery.steps.min.js"></script>
	<script type="text/javascript" src="cssjs/formCardBuildStep.js"></script>
	<script type="text/javascript" src="cssjs/formGridBuildStep3.js"></script>
	<script type="text/javascript" src="cssjs/formGridBuildStep5.js"></script>
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
                    
                    <h1>列表配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step2" name="form_step2" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;height:100%">
											<div class="BTNGROUP" style="margin:0 auto; display:inline-block;height: 35px;">
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="add_step2"  class="btn btn-primary" value=添加表单 onclick="addForm_step2()"/>
												</div>
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="editFormSort_step2"  class="btn btn-primary" value=修改表单 onclick="editFormSort_step2()"/>
												</div>
											</div>
											<input id="formDefId_step2" name="formDefId_step2" type="hidden" class="form-control"/>
											<table id="formList_step2">
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
 
}
var formId='${param.formDefId}';
var mstTabId = 0 ;
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
            setForm(formId);//修改完表单信息加入缓存
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
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
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
		url:'${pageContext.request.contextPath }/form/loadMstFormInfo.action',
		type:'post',
		data:JSON.stringify(param),
		contentType: 'application/json;charset=utf-8',
		cache: false,
		async: false,
		success: function (data) {
			//mstTabId = data.formMstTab.mstTabId;
			if(mstTabId!=0){
				mstTabId = data.formMstTab.mstTabId;
			}
			$("#formDefId").val(data.param.formDefId);
			$("#formDefLayoutType").val(data.param.formDefLayoutType);
			$("#formDefFolderId").val(data.param.formDefFolderId);
			$("#formDefName").val(data.param.formDefName);
			$("#formDefCode").val(data.param.formDefCode);
			
			if(data.param.formDefIsProcess!=null&&data.param.formDefIsProcess!=""){
				$("#formDefIsProcess").val(data.param.formDefIsProcess);
			}else{
				$("#formDefIsProcess").val("N");
			}
			if(data.param.formAuthorityIsControl!=null&&data.param.formAuthorityIsControl!=""){
				$("#formAuthorityIsControl").val(data.param.formAuthorityIsControl);
			}else{
				$("#formAuthorityIsControl").val("N");
			}
			if(data.param.isApp!=null&&data.param.isApp!=""){
				$("#isApp").val(data.param.isApp);
			}else{
				$("#isApp").val("N");
			}
			
			$("#powerSql").val(data.param.powerSql);
			$("#orderSql").val(data.param.orderSql);
			$("#formDefDesc").val(data.param.formDefDesc);
			formSql=data.param.formDefEntitySql;
			realSql=data.param.formDefSql;
			$("#formDefInitQzJs").val(data.param.formDefInitQzJs);
			$("#formDefInitQzSql").val(data.param.formDefInitQzSql);
			$("#formLableWidth").val(data.param.formLableWidth);
			}
		});
}

function saveFormInfo(){
	var param = {};
	var flag = false;
	param.formDefId = $("#formDefId").val();
	param.formDefFolderId = $("#formDefFolderId").val();
	param.formDefLayoutType = $("#formDefLayoutType").val();
	param.formDefName = $("#formDefName").val();
	param.formDefCode = $("#formDefCode").val();				
	param.formDefIsProcess = $("#formDefIsProcess").val();
	param.isApp = $("#isApp").val();
	param.formAuthorityIsControl = $("#formAuthorityIsControl").val();
	param.powerSql = $("#powerSql").val();
	param.orderSql = $("#orderSql").val();
	param.formDefEntitySql = formSql;
	param.formDefSql = realSql;
	param.formDefDesc = $("#formDefDesc").val();
	param.formDefInitQzJs = $("#formDefInitQzJs").val();
	param.formDefInitQzSql = $("#formDefInitQzSql").val();
	
	$.ajax({
		url:'${pageContext.request.contextPath }/form/saveTabsForm.action?mstTabId='+mstTabId,
		type:'POST',
		data: JSON.stringify(param),
	    cache: false,
	    contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (datas) {
			if(datas[2]=='0'){
				layer.alert('保存失败!表单编码重复', {
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
			} else if(datas[2]=='2'){
				layer.alert('保存失败!表单中存在多个此表单编码', {
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
				$('#formList_step2').bootstrapTable('refresh'); 
			} else if(datas[2]=='1'){
				flag = true;
	    		var mstId = datas[1];
	    		mstTabId = mstId;
	    		querys_step2();
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

function querys_step2() { 
    $("#formList_step2").bootstrapTable({  
        url : "/myehr/form/findformListByformId.action?mstId="+mstTabId,  
        height : '700',  
        undefinedText : '-',  
        pagination : false, // 分页  
        striped : true, // 是否显示行间隔色  
        //queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        clickToSelect: true,
        sidePagination : "server", // 服务端处理分页  
        columns : [
        {  
            title : '操作',  
            field : 'tabDetailId', // 字段  
            align: 'center',
            valign: 'middle',
            width:50,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formWhereId\" style=\"width:0px;padding:0px;border:none;\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removeForm_step2(this)\"></i><div>" ;
        	}
		},
        {  
            title : '是否动态表单',  
            field : 'tabDetailIsForm', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:60px;\" name=\"tabDetailIsForm\" data-type=\"select\" data-title=\"是否动态表单\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO\">"+value+"</a>";
                	} 
        }, {  
            title : '动态表单',  
            field : 'tabDetailFormId',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            		if(value==undefined){
            			value='';
            		}else{
            			value = getFormNameById(value);
            		}
            			
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"tabDetailFormId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"动态表单\">"+value+"</a>";			                    	
                	}
        }, {  
            title : '表单url',  
            field : 'tabDetailFormUrl',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"tabDetailFormUrl\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"表单URL\">"+value+"</a>";
                    	
                	}
        }, {  
            title : '列表标题',  
            field : 'tabDetailFormTitle',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"tabDetailFormTitle\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"列表标题\">"+value+"</a>";
                    	
                	}
        }, {  
            title : '排序',  
            field : 'tabDetailSort',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"tabDetailSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\">"+value+"</a>";
                    	
                	}
            }],
        	onClickRow: function (row, $element) {
	                curRow = row;
	            },
	        onLoadSuccess: function (aa, bb, cc) {
		        	$("#formList a").editable({
	                    disabled: true,
	                    emptytext: "-",
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                    },
	                    type: 'text'
	                });
	            },
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

//添加 
//form/form/mstTab/addDetail.jsp
function addForm_step2(){
	var url = '/myehr/jsp/form/formcreate/tabs/addList.jsp?formId='+formId+'&mstId='+mstTabId;
	layer.open({
		type: 2,
		title:'增加列表',
		shadeClose: true,
		shade: 0.8,
		//offset: ['0px', '0px'],
		maxmin:true,
		area: ['1000', '500'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			$('#formList_step2').bootstrapTable('refresh'); 
		}
	});
}

function editFormSort_step2(){
	var datas = {};
	var sforms = $("#formList_step2").bootstrapTable('getData');
	if(sforms.length>0){
		var content = "";
		for(var i = 0;i<sforms.length;i++){
			content += "<div id='batchUp_"+i+"' class='row cell' style='border:none;line-height:25px;overflow:auto;' >\n";
			content += "<div id='batchUpdate1_"+i+"' class='col-lg-6 col-md-6 col-sm-6 col-xs-6'>\n"+
					   "	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;'>\n"+
					   "		<lable style='float:left;font-size:12px'>列表标题</lable>\n"+
					   "		<input id='tabDetailId_"+i+"' name='tabDetailId' type='hidden' value='"+sforms[i].tabDetailId+"'/>\n"+
					   "		<input id='tabDetailFormTitle_"+i+"' name='tabDetailFormTitle' type='text' class='form-control' value='"+sforms[i].tabDetailFormTitle+"' style='width:200px;'/>\n"+
					   "	</div>\n"+
					   "</div>\n"+
					   "<div id='batchUpdate2_"+i+"' class='col-lg-6 col-md-6 col-sm-6 col-xs-6'>\n"+
					   "	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;'>\n"+
					   "		<lable style='float:left;font-size:12px'>列表顺序</lable>\n"+
					   "		<input id='tabDetailSort_"+i+"' name='tabDetailSort' type='text' class='form-control' value='"+sforms[i].tabDetailSort+"' style='width:200px;'/>\n"+
					   "	</div>\n"+
					   "</div>\n";
			content += "</div>\n";
		}		
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['600px', '570px'],
			btn: ['保存', '取消'],
			success: function(layero, index){
			},
			yes: function(index, layero){
				for(var i = 0 ;i<sforms.length;i++){
					sforms[i].tabDetailId = $("#tabDetailId_"+i).val();
					sforms[i].tabDetailFormTitle = $("#tabDetailFormTitle_"+i).val();
					sforms[i].tabDetailSort = $("#tabDetailSort_"+i).val();
				}
				var url = "/myehr/FormCopy/updateTabDetail.action";//更新附表信息
				$.ajax({
					url:url,
					type:'post',
					cache: false,
					contentType: 'application/json;charset=utf-8',
					data:JSON.stringify(sforms),
					async: false,
					success: function (data) {	
						$("#formList_step2").bootstrapTable('refresh');
						layer.close(index);
						}
					});
				
			  },
			btn2: function(index, layero){
			  }
		});
	}else{
		alert("请至少选中一条数据!!");
	}
}


	//编辑
//form/form/mstTab/addDetail.jsp
function editForm_step2(){
}

//删除
function removeForm_step2(obj){
	var data = $(obj).parent().parent().parent().find("input").eq(0).val();
	layer.msg('确定要删除此表单', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
			layer.close(index);
				$.ajax({
					url:'/myehr/form/delectMstTab.action?tabDetailId='+data,
					type:'post',
					cache: false,
					contentType: 'application/json;charset=utf-8',
					success: function (text) {
						if(text!='1'){
							layer.alert('删除失败', {
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
						} else {
							layer.alert('删除成功', {
								  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' 
								})
							$('#formList_step2').bootstrapTable('refresh'); 
						}
					},
					error: function (jqXHR, textStatus, errorThrown) {
						alert(jqXHR.responseText);
					}
				});
		  }
	})
}



</script>
</html>