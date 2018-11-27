<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<html>
<head>
    <style type="text/css" href="./css/bootstrap.min.css"></style>
    <link rel="stylesheet" href="cssjs/animate.css" type="text/css"></link>
	<link rel="stylesheet" href="cssjs/jquery.steps.css" type="text/css"></link>
	<script type="text/javascript" src="cssjs/jquery.steps.min.js"></script>
	<script type="text/javascript" src="cssjs/formCardBuildStep.js"></script>
	<script type="text/javascript" src="cssjs/formGridBuildStep3.js"></script>
	<script type="text/javascript" src="cssjs/formGridBuildStep5.js"></script>
	<script type="text/javascript" src="cssjs/demo1.js"></script>
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
	#form-p-5,#form-p-4,#form-p-3,#form-p-2,#form-p-1{width:100%;height:97%}
	.btn {padding:4px 12px 0 12px}
	
        .sidebar{height: 100%;
            position: relative;
            border-radius: 5px;
            margin-bottom: 10px;
            padding: 10px;}
        .searchInput{position: relative;}
        .searchInfo{position: absolute;top: 0;right: 0;margin-right: 30px;}
        .searchInfoWrapper>div{display: inline-block;}
        .searchInfoWrapper>div a{cursor: pointer;}
        .searchInfoWrapper label {margin: 4px 5px 0;vertical-align: top;}
        .panel-heading {padding: 5px 15px;}
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
                                                        <lable style="float:left">接口方案编码</lable>
                                                        <input id="interfaceSchemeCode" name="interfaceSchemeCode" type="text" class="form-control" style="width:200px;" value="${param.fieldChinaName}"/>
                                                        <input id="interfaceSchemeId" name="interfaceSchemeId" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
													<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
														<lable style="float:left">接口方案名称</lable>
														<input id="interfaceSchemeName" name="interfaceSchemeName" type="text" class="form-control" style="width:200px;" value="${param.controlType}"/>
													</div>
                                                </div>
												<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">接口方案类别</lable>                        
                                                        <select id="interfaceSchemeCategory" title="接口方案类别" styleType="select" name="interfaceSchemeCategory" class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_INTERFACE_CATEGORY" dataField="dicts">
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">接口方案类型</lable>                        
                                                        <select id="interfaceSchemeType" title="接口方案类型" styleType="select" name="interfaceSchemeType" class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_INTERFACE_TYPE" dataField="dicts">
                                                        </select>
                                                    </div>
                                                </div>
												<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">数据是否分页</lable>                        
                                                        <select id="interfaceSchemePager" title="数据是否分页" styleType="select" name="interfaceSchemePager" class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" dataField="dicts">
                                                        </select>
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
                    
                    <h1>字段配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step2" name="form_step2" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;height:100%">
                                        
	                                        <div id="step2_part1" style="height:100%;padding:10px;display:block;overflow:auto">
		                                        <h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;margin:0">自定义sql</h3>
		                                        <div class="row cell" style = "padding-left:15px">
		                                        	
		                                        	<div id="Tree" class="nui-layout" style="height: 89%;position:relative;float:left;width: 17%;margin:0;">
														<div class="zTreeDemoBackground">
													        <div class="tab" role="tabpanel">
													            <!-- Nav tabs -->
													            <ul class="nav nav-tabs" role="tablist">
													                <li role="presentation" class="active"><a href="#Section1" aria-controls="home" role="tab" data-toggle="tab"><span><i class="glyphicon glyphicon-globe"></i></span></a></li>
													                <li role="presentation"><a href="#Section2" aria-controls="profile" role="tab" data-toggle="tab"><span><i class="glyphicon glyphicon-search"></i></span></a></li>
													            </ul>
													            <!-- Tab panes -->
													            <div class="tab-content tabs" style="height:93%">
													                <div role="tabpanel" class="tab-pane panel panel-primary fade in active" id="Section1" style="height:93%;margin:0">
													                    <div class="panel-heading">实体树</div>
													                    <div class="sidebar panel-body">   
													                        <div class="searchInput">
													                            <input type="text"  id="key" class="empty form-control" value="" placeholder="Search..." onkeyup="callNumber()">
													                            <i class="glyphicon glyphicon-search" style="position: absolute;right: 6px;top: 6px;cursor: pointer;"></i>
													                            <div class="searchInfo">  
													                                <label type="text" class="searchInfoWrapper"  id="resultKey">  
													                                    <div>  
													                                        <i id="clickUp" class="glyphicon glyphicon-arrow-up" onclick="clickUp()" style="top:4px;"></i>
													                                        <i id="clickDown" class="glyphicon glyphicon-arrow-down" onclick="clickDown()" style="top:4px;"></i>  
													                                    </div>  
													                                    <label id="number"></label>  
													                                </label>  
													                            </div>                  
													                        </div>  
													                        <ul id="entityTreeDemo" style="overflow-y: auto;overflow-x: hidden;height: 80%;margin-top: 10px;" class="ztree">
													                        </ul>
													                    </div>  
													                </div>
													                <div role="tabpanel" class="tab-pane panel panel-info fade" id="Section2"  style="height:93%;margin:0">
													                    <div class="panel-heading">参数树</div>
													                    <div class="sidebar panel-body">   
													                        <div class="searchInput">
													                            <input type="text"  id="key2" class="empty form-control" placeholder="Search..." onkeyup="callNumber2()">
													                            <i class="glyphicon glyphicon-search" style="position: absolute;right: 6px;top: 6px;cursor: pointer;"></i>
													                            <div class="searchInfo">  
													                                <label type="text" class="searchInfoWrapper" id="resultKey2">  
													                                    <div>  
													                                        <i id="clickUp2" class="glyphicon glyphicon-arrow-up" onclick="clickUp2()" style="top:4px;"></i>
													                                        <i id="clickDown2" class="glyphicon glyphicon-arrow-down" onclick="clickDown2()" style="top:4px;"></i>  
													                                    </div>  
													                                    <label id="number2"></label>  
													                                </label>  
													                            </div>                  
													                        </div>  
													                        <ul id="paramTreeDemo" style="overflow-y: auto;overflow-x: hidden;height: 86%;margin-top: 10px;" class="ztree">
													                        </ul>
													                    </div> 
													                </div>
													            </div>
													        </div>
														</div>
													</div>
													
													<div id="right_part_step2" style="float:left;width: 83%;margin:32px 0 0 0;">
														
														<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "">
															<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
															<div style="margin-right:10px;display:inline-block">
															    <input type="button" id="saveSql"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存SQL")%> onclick="saveInterfaceSchemeSql()"/>
															</div>
															<div style="margin-right:10px;display:inline-block">
															    <input type="button" id="changeSql"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"转换SQL")%> onclick="changeSql()"/>
															</div>
															<div style="margin-right:10px;display:inline-block">
															    <input type="button" id="changeSqlCN"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"转换中文SQL")%> onclick="changeSqlCN()"/>
															</div>
															<div style="margin-right:10px;display:inline-block">
															    <input type="button" id="cleanSql"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"清空")%> onclick="cleanSql()"/>
															</div>
														</div>
		                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
		                                                        <textarea id="formSql" name="formSql"  class="form-control" style="width:100%;height:72%; resize:none; padding:15px 10px 15px 30px;margin-top:9px;"></textarea>
		                                                    </div>
		                                                </div>
													</div>	
		                                        		
												</div>
	                                        </div>
	                                    </div>    
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
					
                    <h1>过滤配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step3" name="form_step3" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                    	<div style="margin:10px 0;height:100%">
                                    		<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="addColumnstep3"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRowstep3()"/>
												</div>
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="save_liststep3"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveDatastep3()"/>
												</div>
											</div>
											<table id="tableListstep3">
											</table>
                                    	</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    
                    <h1>按钮配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="form_step5" name="form_step5" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                    	<div style="margin:10px 0;height:100%">
                                    		<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="addColumnstep5"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRowstep5()"/>
												</div>
												<div style="margin-right:10px;display:inline-block">
												    <input type="button" id="save_liststep5"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveDatastep5()"/>
												</div>
											</div>
											<table id="tableListstep5">
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
var interfaceSehemeId='${param.interfaceSehemeId}';
$(document).ready(function () {
    $("#form").steps({
        bodyTag: "fieldset",
        onStepChanging: function (event, currentIndex, newIndex) {
            if (currentIndex == 0) {//离开基础配置
                return saveFormInfo();
            }
            if (currentIndex == 1) {//离开字段配置
            	query_tablestep3();
                return true;
            }
            if (currentIndex == 2) {//离开过滤配置
            	
            	query_tablestep5();
            }
            if (currentIndex == 3) {//离开按钮配置
                
            }
            
            // Start validation; Prevent going forward if false
            return true;
            
           
        },
        onStepChanged: function (event, currentIndex, priorIndex) {
        },
        onFinishing: function (event, currentIndex) {
            var form = $(this);
            // Start validation; Prevent form submission if false
            return true;
        },
        onFinished: function (event, currentIndex) {
            var form = $(this);
            setForm(formId);//修改完表单信息加入缓存
			clearCheckedAndPoint();
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
 			dataField = dataField+"|${param.interfaceSehemeId}";
 		}
		parame.placeholder="";
		parame.jsonParam.nullItemText='请选择...';
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}	
		
    formInit();//表单类型初始化
    
    jsParamInit();
    
    $('#myTab a').click(function (e) {
		e.preventDefault();
		var x = $(this)[0].innerHTML;
		var data = $("#columnList").bootstrapTable("getSelections")[0];
		if(x=="控件信息"){
			if(data==undefined){
				layer.alert('请选中一条字段', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
					return false;
			}else{
				$(this).tab('show');
				$("#textboxColumnLable").val(data.formColumnLable);
				$("#comboboxFormColumnLable").val(data.formColumnLable);
				$("#dateFormColumnLable").val(data.formColumnLable);
			}
			
		}if(x=="链接信息"){
			if(data==undefined||data.formColumnGuiType!='1'){
				layer.alert('非文本字段不能设置链接', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
					return false;
			}else if(!$("#textboxIsLink").prop('checked')){
						layer.alert('请查看是否勾选设置链接', {
							  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' 
							})
					}else{
						$(this).tab('show');
					}
		}else{
			$(this).tab('show');
		}
	});
    
});

function formInit(){
	var param = {};
	param.formId = '${param.interfaceSehemeId}';
	$.ajax({
		url:'${pageContext.request.contextPath }/form/loadInterfaceScheme.action',
		type:'post',
		data:JSON.stringify(param),
		contentType: 'application/json;charset=utf-8',
		cache: false,
		async: false,
		success: function (data) {
			$("#interfaceSchemeId").val(data.interfaceSchemeId);
			$("#interfaceSchemeCode").val(data.interfaceSchemeCode);
			$("#interfaceSchemeName").val(data.interfaceSchemeName);
			$("#interfaceSchemeType").val(data.interfaceSchemeType);
			$("#interfaceSchemeCategory").val(data.interfaceSchemeCategory);
			$("#interfaceSchemePager").val(data.interfaceSchemePager);
			formSql=data.interfaceSchemeEntitySql;
			realSql=data.interfaceSchemeDefSql;
		}
	});
}

function saveFormInfo(){
	var param = {};
	var flag = false;
	param.interfaceSchemeId = $("#interfaceSchemeId").val();
	param.interfaceSchemeType = $("#interfaceSchemeType").val();
	param.interfaceSchemeName = $("#interfaceSchemeName").val();
	param.interfaceSchemeCode = $("#interfaceSchemeCode").val();
	param.interfaceSchemeCategory = $("#interfaceSchemeCategory").val();
	param.interfaceSchemePager = $("#interfaceSchemePager").val();	
	$.ajax({
		url:'${pageContext.request.contextPath }/form/updataInterfaceScheme.action',
		type:'POST',
		data: JSON.stringify(param),
	    cache: false,
	    contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
				if(data==1){
					//alert("基础配置完成");
					flag = true;
			        loadStep_2();
				}
			}
		});
	
	return flag;
}

function jsParamInit(){
	$("#jsList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/findJsParamList.action?paramTypeValue=1', 
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
			datas[i].paramTypeValue='${param.interfaceSehemeId}';
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

function loadTree(){
	$.fn.zTree.init($("#entityTreeDemo"), setting);
    document.getElementById("key").value = ""; //清空搜索框中的内容  
    //绑定事件  
    key = $("#key");  
    key.bind("focus", focusKey)  
        .bind("blur", blurKey)  
        .bind("propertychange", searchNode) //property(属性)change(改变)的时候，触发事件  
        .bind("input", searchNode); 
	initSelect();
	$.fn.zTree.init($("#paramTreeDemo"), setting2);
	document.getElementById("key2").value = ""; //清空搜索框中的内容  
    //绑定事件  
    key2 = $("#key2");  
    key2.bind("focus", focusKey2)  
        .bind("blur", blurKey2)  
        .bind("propertychange", searchNode2) //property(属性)change(改变)的时候，触发事件  
        .bind("input", searchNode2); 
}



var map = new Map(); 



function changeSql(){
	var entitySql = encodeURI(document.getElementById('formSql').value, "UTF-8");
	var content = "";
	$.ajax({
		url:'${pageContext.request.contextPath }/form/getRealSql.action?entitySql='+entitySql,
		type:'post',
		cache: false,
		async: false,
		success: function (data) {
			content = data;
		}
    });
	content = "<textarea id='xxx' rows='7' cols='63' >"+content+"</textarea>";
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['500px', '300px']
	});
}

function initColumns(){
	$("#columnList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/findColumnList.action?interfaceSehemeId=${param.interfaceSehemeId}', 
		height : '578',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
		async: false,
        clickToSelect: true,
        pagination : false,        
        uniqueId : "formColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    field : 'state',  
		    checkbox : true,  
		    align : 'center',  
		    valign : 'middle'  
		},
		{   
		    field : 'formColumnId', 
		    visible:false
		},
        {   
            field : 'formColumninterfaceSehemeId', 
            visible:false
        },
        {   
            field : 'formColumnEntityId', 
            visible:false
        },
        {   
            field : 'formColumnColumnId', 
            visible:false
        },        
        {  
            title : '实体名称',  
            field : 'formEntityTablename', 
            align: 'center',
            valign: 'middle',
	        formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formEntityTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体名称\">"+value+"</a>";
	        }
        }, {  
            title : '字段名称',  
            field : 'formFieldTablename',  
            align : 'center',  
            valign : 'middle', 
            formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formFieldTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\">"+value+"</a>";
	        }
        }, {  
            title : '字段显示名称',  
            field : 'formColumnLable',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
	            if(value==undefined){
	                value='-';
	            }
	            	  return "<a  class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;\" name=\"formColumnLable\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名称\">"+value+"</a>";
	        }
        }, {  
            title : '控件类型',  
            field : 'formColumnGuiType',  
            align : 'center',  
            valign : 'middle',
		    visible:false,
	        formatter: function (value, row, index) {
	            if((value==undefined || value=="")&&value!=0){
	                value='-';
	            }
	            value = (value+'').replace(/ /g,'');
	            return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"formColumnGuiType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"控件类型\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_FORM_GUI_TYPE&realValue="+value+"+\"></a>";
	        }
        },{  
            title : '显示宽度',  
            field : 'formColumnWidth', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示高度',  
            field : 'formColumnHeight', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示方式',  
            field : 'formColumnShowType', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '显示顺序',  
            field : 'formColumnSort', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '对齐方式',  
            field : 'formColumnAlign', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '是否必填',  
            field : 'formColumnRequired', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '跨字段数',  
            field : 'formColumnColSpan', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '最大字符数',  
            field : 'formColumnMaxLength', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '最小字符数',  
            field : 'formColumnMinLength', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '字段值范围',  
            field : 'formColumnColorCondition', 
            align: 'center',
            valign: 'middle',  
		    visible:false,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        },{  
            title : '字段颜色',  
            field : 'formColumnColor', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '所属分组',  
            field : 'formGroupId', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '列类型',  
            field : 'formColumnType', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '跨行数',  
            field : 'formColumnRowSpan', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '是否合计',  
            field : 'formColumnTotal', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        },{  
            title : '是否开发字段',  
            field : 'formColumnIsDev', 
            align: 'center',
            valign: 'middle',  
		    visible:false
        }
        
        ],
        onClickRow: function (row, $element) {
		        	curRow = row;
		            $('#columnList').bootstrapTable('uncheckAll');//checkBox单选
		            $("#myTab").find("li").eq(0).attr("class","active");
		        	$("#myTab").find("li").eq(1).attr("class","");
		        	$("#myTab").find("li").eq(2).attr("class","");
		        	$("#Tab_1").attr("class","tab-pane active");
		        	$("#Tab_2").attr("class","tab-pane");
		        	$("#Tab_3").attr("class","tab-pane");
		            showExpandInfo(row);//获取并显示字段详细信息(信息在row中)
		            showWidgetInfo(row);//获取字段控件详细信息(根据row中字showWidgetInfo段Id去后台查)
	                
	            },      
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        },
        onLoadSuccess : function(){
        	$("#columnList tbody>tr").each(function(){
        		if($(this).attr("data-uniqueid")==chooseMark){
        			//$(this).find('input:checkbox').attr("checked","true");
        			$(this).find('td').eq(1).click();
        		}
        	})
        }
    });
}
function mapping(){
	layer.msg('确定要映射？将覆盖原字段', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
		    layer.close(index);
		    var entitySql = encodeURI(document.getElementById('formSql').value, "UTF-8");
			if(interfaceSehemeId==null||interfaceSehemeId=='null'){
				layer.alert('表单定义ID参数错误', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
				return;
			}
			if(entitySql==null||entitySql==''){
				layer.alert('请编写实体sql', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
				return ;
			}
			$.ajax({
		        url: "${pageContext.request.contextPath }/form/findColumnListSteps_2.action?interfaceSehemeId=${param.interfaceSehemeId}&entitySql="+entitySql,
		        type: 'POST',
		        cache: false,
		        async: false,
		        success: function (text) {
		        	var data = {};
		        	data.rows = text[1];
		        	data.total = 47;
		            if(1==1) {
		            	realSql = text[1];
		            	formSql = text[0];
		            	$("#columnList").bootstrapTable('refresh');
		            } else {
		            	 layer.alert('字段映射失败，请检查自定义SQl是否正确', {
							  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' 
							})
		            }
		        }
		    });

		  }
		});
}



function showWidgetInfo(dataForm){
	var type = dataForm.formColumnGuiType;
	var columnId = dataForm.formColumnId;
	if(type==undefined||type==null||type==""){
		changeWidgetShow(1);
	}else{
		changeWidgetShow(type);
	}
	$("#textboxColumnLable").val(dataForm.formColumnLable);
	if(type=='1'){
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getTextInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showTextInfoStep2(data);
				}
			});
	}else if(type=='2'){
		$("#comboboxFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getComboboxInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showComboboxInfoStep2(data);
				}
			});
	}else if(type=='6'){
		$("#dateFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getDateInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showDateInfoStep2(data);
				}
			});
	}else if(type=='8'){
		$("#textareaFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getTextareaInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showTextareaInfoStep2(data);
				}
			});
	}else if(type=='3'){
		$("#radiolistFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getRadiolistInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showRadiolistInfoStep2(data);
				}
			});
	}else if(type=='4'){
		$("#checkboxlistFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getCheckboxlistInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showCheckboxlistInfoStep2(data);
				}
			});
	}else if(type=='5'){
		$("#checkboxColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getCheckboxInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showCheckboxInfoStep2(data);
				}
			});
	}else if(type=='7'){
		$("#lookupFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getLookupInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showLookupInfoStep2(data);
				}
			});
	}
	else if(type=='9'){
		$("#fileuploadFormColumnLable").val(dataForm.formColumnLable);
		$.ajax({
			url:'${pageContext.request.contextPath }/form/getFileuploadInfoByColumnId.action?columnId='+columnId,
			type:'post',
			cache: false,
			async: false,
			success: function (data) {
					showFileuploadInfoStep2(data);
				}
			});
	}
}

//保存控件信息
function saveWidget(){
	var formColumnId = $("#columnList").bootstrapTable("getSelections")[0].formColumnId;
	var widgetType = $("#formColumnGuiType").val();
	var dataForm = $("#columnList").bootstrapTable("getSelections")[0];
	var url="";
	if(widgetType=='1'){
		var sysFormTextbox = {};
		url = "${pageContext.request.contextPath }/form/saveTextBox.action";
		sysFormTextbox.textboxFormColumnId=formColumnId;
		sysFormTextbox.textboxId=$("#textboxId").val();
		sysFormTextbox.textboxCheckType=$("#textboxCheckType").val();
		sysFormTextbox.textboxCheckSelf=$("#textboxCheckSelf").val();
		sysFormTextbox.textboxDataFromType=$("#textboxDataFromType").val();
		sysFormTextbox.textboxDataFromValue=$("#textboxDataFromValue").val();
		sysFormTextbox.textboxCheckFun=$("#textboxCheckFun").val();
		sysFormTextbox.textboxInitFun=$("#textboxInitFun").val();
		sysFormTextbox.textboxValuechangeFun=$("#textboxValuechangeFun").val();
		sysFormTextbox.textboxClickFun=$("#textboxClickFun").val();
		sysFormTextbox.textboxEmptytext=$("#textboxEmptytext").val();
		if($("#textboxIsLink").prop('checked')){
			sysFormTextbox.textboxIsLink='Y';
		}else{
			sysFormTextbox.textboxIsLink='N';
		}
		if($("#textboxLinkIsForm").prop('checked')){
			sysFormTextbox.textboxLinkIsForm='Y';
		}else{
			sysFormTextbox.textboxLinkIsForm='N';
		}
		if(sysFormTextbox.textboxLinkIsForm){
			sysFormTextbox.textboxLinkForm=$("#tabDetailFormId").val();
		}else{
			sysFormTextbox.textboxLinkUrl=$("#textboxLinkUrl1").val();
		}
		sysFormTextbox.textboxLinkWinOpenType=$("input[name='textboxLinkWinOpenType']:checked").val();
		if($("input[name='textboxLinkWinOpenType']:checked").val()=='1'){
			sysFormTextbox.textboxLinkSuccessDeal=$("#textboxLinkSuccessDeal").val();
			sysFormTextbox.textboxLinkWinTitle=$("#textboxLinkWinTitle").val();
			sysFormTextbox.textboxLinkWinWidth=$("#textboxLinkWinWidth").val();
			sysFormTextbox.textboxLinkWinHeight=$("#textboxLinkWinHeight").val();
		}
		saveInfo(url,sysFormTextbox);
		showWidgetInfo(dataForm);
	}else if(widgetType=='2'){
		var sysFormCombobox = {};
		url = "${pageContext.request.contextPath }/form/saveCombobox.action";
		sysFormCombobox.comboboxFormColumnId=formColumnId;
		sysFormCombobox.comboboxId=$("#comboboxId").val();
		sysFormCombobox.comboboxCheckFun=$("#comboboxcheckFun").val();
		sysFormCombobox.comboboxCheckType=$("#comboboxCheckType").val();
		sysFormCombobox.comboboxCheckSelf=$("#comboboxCheckSelf").val();
		sysFormCombobox.comboboxInitFun=$("#comboboxInitFun").val();
		sysFormCombobox.comboboxValuechangeFun=$("#comboboxValuechangeFun").val();
		sysFormCombobox.comboboxClickFun=$("#comboboxClickFun").val();
		sysFormCombobox.comboboxDataFromType=$("#comboboxDataFromType").val();
		sysFormCombobox.comboboxDataFromValue=$("#comboboxDataFromValue").val();
		sysFormCombobox.comboboxGuiInitType=$("#comboboxGuiInitType").val();
		sysFormCombobox.comboboxGuiInitValue=$("#comboboxGuiInitValue2").val();
		sysFormCombobox.comboboxTextfield=$("#comboboxTextfield").val();
		sysFormCombobox.comboboxValuefield=$("#comboboxValuefield").val();
		sysFormCombobox.comboboxDatafield=$("#comboboxDatafield").val();
		sysFormCombobox.comboboxEmptytext=$("#comboboxEmptytext").val();
		if($("#comboboxAllowinput").prop('checked')){
			sysFormCombobox.comboboxAllowinput='Y';
		}else{
			sysFormCombobox.comboboxAllowinput='N';
		}
		if($("#comboboxMultiselect").prop('checked')){
			sysFormCombobox.comboboxMultiselect='Y';
		}else{
			sysFormCombobox.comboboxMultiselect='N';
		}
		sysFormCombobox.comboboxNullitemtext=$("#comboboxNullitemtext").val();
		sysFormCombobox.comboboxDictNameColumn=$("#comboboxDictNameColumn").val();
		sysFormCombobox.comboboxGuiInitExcsqlId=$("#comboboxGuiInitExcsqlId").val();
		sysFormCombobox.comboboxIstext=$("#comboboxIstext").val();	
		sysFormCombobox.comboboxDictSql=$("#comboboxDictSql").val();	
		if($("#comboboxIsSearch").prop('checked')){
			sysFormCombobox.comboboxIsSearch='Y';
		}else{
			sysFormCombobox.comboboxIsSearch='N';
		}
		if($("#comboboxShownullitem").prop('checked')){
			sysFormCombobox.comboboxShownullitem='Y';
		}else{
			sysFormCombobox.comboboxShownullitem='N';
		}
		saveInfo(url,sysFormCombobox);
		showWidgetInfo(dataForm);
	}else if(widgetType=='6'){
		var sysFormDatePicker = {};
		url = "${pageContext.request.contextPath }/form/saveDatePicker.action";
		sysFormDatePicker.datepickerFormColumnId=formColumnId;
		sysFormDatePicker.datepickerId=$("#datepickerId").val();
		sysFormDatePicker.datepickerCheckType=$("#datepickerCheckType").val();
		sysFormDatePicker.datepickerCheckSelf=$("#datepickerCheckSelf").val();
		sysFormDatePicker.datepickerInitFun=$("#datepickerInitFun").val();
		sysFormDatePicker.datepickerValuechangeFun=$("#datepickerValuechangeFun").val();
		sysFormDatePicker.datepickerClickFun=$("#datepickerClickFun").val();		
		sysFormDatePicker.datepickerDataFromType=$("#datepickerDataFromType").val();
		sysFormDatePicker.datepickerDataFromValue=$("#datepickerDataFromValue").val();		
		sysFormDatePicker.datepickerFormat=$("#datepickerFormat").val();		
		
		if($("#datepickerShowtime").prop('checked')){
			sysFormDatePicker.datepickerShowtime='Y';
		}else{
			sysFormDatePicker.datepickerShowtime='N';
		}
		
		if($("#datepickerShowokbutton").prop('checked')){
			sysFormDatePicker.datepickerShowokbutton='Y';
		}else{
			sysFormDatePicker.datepickerShowokbutton='N';
		}
		
		if($("#datepickerShowclearbutton").prop('checked')){
			sysFormDatePicker.datepickerShowclearbutton='Y';
		}else{
			sysFormDatePicker.datepickerShowclearbutton='N';
		}
		
		if($("#datepickerAllowinput").prop('checked')){
			sysFormDatePicker.datepickerAllowinput='Y';
		}else{
			sysFormDatePicker.datepickerAllowinput='N';
		}
		
		if($("#datepickerShowtodaybutton").prop('checked')){
			sysFormDatePicker.datepickerShowtodaybutton='Y';
		}else{
			sysFormDatePicker.datepickerShowtodaybutton='N';
		}
		sysFormDatePicker.datepickerDrawdateFun=$("#datepickerDrawdatefun").val();		
		saveInfo(url,sysFormDatePicker);
		showWidgetInfo(dataForm);
	}else if(widgetType=='8'){
			var sysFormTextarea = {};
			url = "${pageContext.request.contextPath }/form/saveTextarea.action";
			sysFormTextarea.textareaFormColumnId=formColumnId;
			sysFormTextarea.textareaId=$("#textareaId").val();
			sysFormTextarea.textareaCheckType=$("#textareaCheckType").val();
			if($("#textareaCheckType").val()=='fun'){
				sysFormTextarea.textareaCheckFun=$("#textareaCheckFun").val();
			}
			sysFormTextarea.textareaCheckSelf=$("#textareaCheckSelf").val();
			sysFormTextarea.textareaDataFromType=$("#textareaDataFromType").val();
			if($("#textareaDataFromType").val()=='initFun'){
				sysFormTextarea.textareaInitFun=$("#textareaInitFun").val();
			}
			sysFormTextarea.textareaDataFromValue=$("#textareaDataFromValue").val();
			sysFormTextarea.textareaValuechangeFun=$("#textareaValuechangeFun").val();
			sysFormTextarea.textareaClickFun=$("#textareaClickFun").val();
			sysFormTextarea.textareaEmptytext=$("#textareaEmptytext").val();
			saveInfo(url,sysFormTextarea);
			showWidgetInfo(dataForm);
		}else if(widgetType=='4'){
			var sysFormCheckboxlist = {};
			url = "${pageContext.request.contextPath }/form/saveCheckboxlist.action";
			sysFormCheckboxlist.checkboxlistFormColumnId=formColumnId;		
			sysFormCheckboxlist.checkboxlistId=$("#checkboxlistId").val();
			sysFormCheckboxlist.checkboxlistCheckFun=$("#checkboxlistcheckFun").val();
			sysFormCheckboxlist.checkboxlistCheckType=$("#checkboxlistCheckType").val();
			sysFormCheckboxlist.checkboxlistCheckSelf=$("#checkboxlistCheckSelf").val();
			sysFormCheckboxlist.checkboxlistInitFun=$("#checkboxlistInitFun").val();
			sysFormCheckboxlist.checkboxlistValuechangeFun=$("#checkboxlistValuechangeFun").val();
			sysFormCheckboxlist.checkboxlistClickFun=$("#checkboxlistClickFun").val();
			sysFormCheckboxlist.checkboxlistDataFromType=$("#checkboxlistDataFromType").val();
			sysFormCheckboxlist.checkboxlistDataFromValue=$("#checkboxlistDataFromValue").val();
			sysFormCheckboxlist.checkboxlistGuiInitType=$("#checkboxlistGuiInitType").val();
			sysFormCheckboxlist.checkboxlistGuiInitValue=$("#checkboxlistGuiInitValue2").val();
			sysFormCheckboxlist.checkboxlistTextfield=$("#checkboxlistTextfield").val();
			sysFormCheckboxlist.checkboxlistValuefield=$("#checkboxlistValuefield").val();
			sysFormCheckboxlist.checkboxlistDatafield=$("#checkboxlistDatafield").val();
			sysFormCheckboxlist.checkboxlistRepeatitems=$("#checkboxlistRepeatitems").val();
			sysFormCheckboxlist.checkboxlistRepeatlayout=$("#checkboxlistRepeatlayout").val();
			saveInfo(url,sysFormCheckboxlist);
			showWidgetInfo(dataForm);
		}else if(widgetType=='3'){
			var sysFormRadiolist = {};
			url = "${pageContext.request.contextPath }/form/saveRadiolist.action";
			sysFormRadiolist.radiolistFormColumnId=formColumnId;		
			sysFormRadiolist.radiolistId=$("#radiolistId").val();
			sysFormRadiolist.radiolistCheckFun=$("#radiolistcheckFun").val();
			sysFormRadiolist.radiolistCheckType=$("#radiolistCheckType").val();
			sysFormRadiolist.radiolistCheckSelf=$("#radiolistCheckSelf").val();
			sysFormRadiolist.radiolistInitFun=$("#radiolistInitFun").val();
			sysFormRadiolist.radiolistValuechangeFun=$("#radiolistValuechangeFun").val();
			sysFormRadiolist.radiolistClickFun=$("#radiolistClickFun").val();
			sysFormRadiolist.radiolistDataFromType=$("#radiolistDataFromType").val();
			sysFormRadiolist.radiolistDataFromValue=$("#radiolistDataFromValue").val();
			sysFormRadiolist.radiolistGuiInitType=$("#radiolistGuiInitType").val();
			sysFormRadiolist.radiolistGuiInitValue=$("#radiolistGuiInitValue2").val();
			sysFormRadiolist.radiolistTextfield=$("#radiolistTextfield").val();
			sysFormRadiolist.radiolistValuefield=$("#radiolistValuefield").val();
			sysFormRadiolist.radiolistDatafield=$("#radiolistDatafield").val();
			sysFormRadiolist.radiolistRepeatdirection=$("#radiolistRepeatdirection").val();
			sysFormRadiolist.radiolistRepeatitems=$("#radiolistRepeatitems").val();
			sysFormRadiolist.radiolistRepeatlayout=$("#radiolistRepeatlayout").val();
			saveInfo(url,sysFormRadiolist);
			showWidgetInfo(dataForm);
		}else if(widgetType=='5'){
			var sysFormCheckbox = {};
			url = "${pageContext.request.contextPath }/form/saveCheckbox.action";
			sysFormCheckbox.checkboxFormColumnId=formColumnId;
			sysFormCheckbox.checkboxId=$("#checkboxId").val();
			sysFormCheckbox.checkboxDataFromType=$("#checkboxDataFromType").val();
			if($("#checkboxDataFromType").val()=='initFun'){
				sysFormCheckbox.checkboxInitFun=$("#checkboxInitFun").val();
			}
			sysFormCheckbox.checkboxDataFromValue=$("#checkboxDataFromValue").val();
			sysFormCheckbox.checkboxValuechangeFun=$("#checkboxValuechangeFun").val();
			sysFormCheckbox.checkboxClickFun=$("#checkboxClickFun").val();
			sysFormCheckbox.checkboxShowName=$("#checkboxShowName").val();
			saveInfo(url,sysFormCheckbox);
			showWidgetInfo(dataForm);
		}else if(widgetType=='7'){
			var sysFormLookup = {};
			url = "${pageContext.request.contextPath }/form/saveLookup.action";
			sysFormLookup.lookupId=$("#lookupId").val();
			sysFormLookup.lookupFormColumnId=formColumnId;
			sysFormLookup.lookupCheckType=$("#lookupCheckType").val();
			sysFormLookup.lookupCheckSelf=$("#lookupCheckSelf").val();
			sysFormLookup.lookupCheckFun=$("#lookupCheckFun").val();
			
			sysFormLookup.lookupValuechangeFun=$("#lookupValuechangeFun").val();
			sysFormLookup.lookupClickFun=$("#lookupClickFun").val();
			sysFormLookup.lookupDataFromType=$("#lookupDataFromType").val();
			sysFormLookup.lookupDataFromValue=$("#lookupDataFromValue").val();
			if($("#lookupDataFromType").val()=='initFun'){
				sysFormLookup.lookupInitFun=$("#lookupInitFun").val();
			}
			sysFormLookup.lookupFormWinType=$("#lookupFormWinType").val();
			if($("#lookupFormWinType").val()=='1'){
				sysFormLookup.lookupWinTitle=$("#lookupWinTitle").val();
				sysFormLookup.lookupWinWidth=$("#lookupWinWidth").val();
				sysFormLookup.lookupWinHeight=$("#lookupWinHeight").val();
				sysFormLookup.lookupShowProperty=$("#lookupShowProperty").val();
				sysFormLookup.lookupValueProperty=$("#lookupValueProperty").val();
				sysFormLookup.lookupFormId=$("#lookupDetailFormId").val();
				sysFormLookup.lookupCustomDataback=$("#lookupCustomDataback").val();
				if($("#lookupCustomDataback").val()=='Y'){
					sysFormLookup.lookupCustomDatabackFun=$("#lookupCustomDatabackFun").val();
				}
				
			}else if($("#lookupFormWinType").val()=='2'){
				sysFormLookup.lookupWinTitle=$("#lookupWinTitle").val();
				sysFormLookup.lookupWinWidth=$("#lookupWinWidth").val();
				sysFormLookup.lookupWinHeight=$("#lookupWinHeight").val();
				sysFormLookup.lookupShowProperty=$("#lookupShowProperty").val();
				sysFormLookup.lookupValueProperty=$("#lookupValueProperty").val();
				sysFormLookup.lookupFormUrl=$("#lookupFormUrl").val();
			}else if($("#lookupFormWinType").val()=='3'){
				sysFormLookup.lookupButtonclickFun=$("#lookupButtonclickFun").val();
			}
			sysFormLookup.lookupDatabackValue=$("#lookupDatabackValue").val();
			sysFormLookup.lookupDatabackType=$("#lookupDatabackType").val();

			//sysFormLookup.lookupEmptytext=$("#lookupEmptytext").val();
			//sysFormLookup.lookupMuliselect=$("#lookupMuliselect").val();

			saveInfo(url,sysFormLookup);
			showWidgetInfo(dataForm);
		}else if(widgetType=='9'){
			var sysFormFileupload = {};
			url = "${pageContext.request.contextPath }/form/saveFileupload.action";
			sysFormFileupload.fileuploadFormColumnId = formColumnId;
			sysFormFileupload.fileuploadId = $("#fileuploadId").val();
			var arr = $("#fileuploadUploadFiletypes").val();
			var val = "";
			if(arr==null){
			}else{
				for(var i=0;i<arr.length;i++){
					val+=arr[i]+',';
				}
				val = val.substring(0,val.length-1);
			}
			sysFormFileupload.fileuploadUploadFiletypes=val;
			sysFormFileupload.fileuploadMaxFileCount=$("#fileuploadMaxFileCount").val();
			
			if($("#fileuploadAutoUpload").prop('checked')){
				sysFormFileupload.fileuploadAutoUpload='Y';
			}else{
				sysFormFileupload.fileuploadAutoUpload='N';
			}
			sysFormFileupload.fileuploadDataFromType = $("#fileuploadDataFromType").val();
			sysFormFileupload.fileuploadDataFromValue = $("#fileuploadDataFromValue").val();
			sysFormFileupload.fileuploadTagGuiType = $("#fileuploadTagGuiInitValue2").val();
			saveInfo(url,sysFormFileupload);
			showWidgetInfo(dataForm);
		}
	}
	

function checkInverse(){
	//$("#step2_part2 .bs-checkboxfind").find("input").prop()
}
function saveInfo(url,datas){
	$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(datas),
			async: false,
			success: function (data) {
				if(data=="true"){  
                	layer.alert('保存成功', {
						  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})

                }else{  
                	layer.alert('保存失败', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})

                }  
				}
			});
}

//保存字段信息
function saveColumnInfo(){
	var column = {};
	var data = $("#columnList").bootstrapTable("getSelections")[0];
	url = "${pageContext.request.contextPath }/form/saveColumn.action";
	if(data.formColumnGuiType == $("#formColumnGuiType").val()&&data.formColumnWidth == $("#formColumnWidth").val()&&data.formColumnHeight == $("#formColumnHeight").val()&&data.formColumnShowType == $("#formColumnShowType").val()&&data.formColumnSort == $("#formColumnSort").val()&&data.formColumnAlign == $("#formColumnAlign").val()&&data.formColumnRequired == $("#formColumnRequired").val()&&data.formColumnColSpan == $("#formColumnColSpan").val()&&data.formColumnMaxLength == $("#formColumnMaxLength").val()&&data.formColumnMinLength == $("#formColumnMinLength").val()&&data.formColumnColorCondition == $("#formColumnColorCondition").val()&&data.formColumnColor == $("#formColumnColor").val()&&data.formColumnType == $("#formColumnType").val()&&data.formColumnRowSpan == $("#formColumnRowSpan").val()&&data.formColumnTotal == $("#formColumnTotal").val()&&data.formColumnIsDev == $("#formColumnIsDev").val()){
		alert("未修改");
	}else{
		column.formColumnId =  data.formColumnId;
		column.formColumninterfaceSehemeId = data.formColumninterfaceSehemeId;
		column.formColumnEntityId = data.formColumnEntityId;
		column.formColumnColumnId = data.formColumnColumnId;
		column.formFieldTablename = data.formFieldTablename;
		column.formColumnUsName = data.formFieldTablename;
		column.formEntityTablename = data.formEntityTablename;
		column.formColumnLable = $("#formColumnLable").val();
		column.formColumnGuiType = $("#formColumnGuiType").val();
		column.formColumnWidth = $("#formColumnWidth").val();
		column.formColumnHeight = $("#formColumnHeight").val();
		column.formColumnShowType = $("#formColumnShowType").val();
		column.formColumnSort = $("#formColumnSort").val();
		column.formColumnAlign = $("#formColumnAlign").val();
		column.formColumnRequired = $("#formColumnRequired").val();
		column.formColumnColSpan = $("#formColumnColSpan").val();
		column.formColumnMaxLength = $("#formColumnMaxLength").val();
		column.formColumnMinLength = $("#formColumnMinLength").val();
		column.formColumnColorCondition = $("#formColumnColorCondition").val();
		column.formColumnColor = $("#formColumnColor").val();
		column.formColumnGroupId = $("#formGroupId").val();
		column.formColumnType = $("#formColumnType").val();
		column.formColumnRowSpan = $("#formColumnRowSpan").val();
		column.formColumnTotal = $("#formColumnTotal").val();
		column.formColumnIsDev = $("#formColumnIsDev").val();
		saveInfo(url,column);		
		$("#columnList").bootstrapTable("refresh");
	}
	chooseMark = data.formColumnId;
}
//根据表单ID获取表单名
function getFormNameById(interfaceSehemeId){
	var formDefName;
	$.ajax({
		url:'${pageContext.request.contextPath}/form/getFormNameById.action?interfaceSehemeId='+interfaceSehemeId,
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

function query_tablestep3() {   
    $("#tableListstep3").bootstrapTable({  
        url : '/myehr/form/queryWhereColumn.action?formId=0', 
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
            field : 'formWhereId', // 字段  
            align: 'center',
            valign: 'middle',
            width:50,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formWhereId\" style=\"width:0px;padding:0px;border:none;\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removestep3(this)\"></i><div>" ;
        	}
		},{
			
            title : '连接条件',  
            field : 'formWhereJoinRule', // 字段  
            align: 'center',
            valign: 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><select id=\"formWhereJoinRule"+index+"\" class=\"form-control\" name=\"formWhereJoinRule\" DictName=\"SYS_FORM_JOIN_RULE\" dataField=\"\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"连接条件\" value=\""+value+"\"/>";
        	}
        },{  
            title : '左括号',  
            field : 'formWhereLeftBracket', // 字段  
            align: 'center',
            valign: 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" name=\"formWhereLeftBracket\" style=\"padding:0 24px 0 12px;\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"左括号\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '查询字段',  
            field : 'formWhereColumnId',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formWhereColumnId"+index+"\" class=\"form-control\" name=\"formWhereColumnId\" DictName=\"\" dataField=\"sql_form_0000\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"查询字段\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '过滤值类型',  
            field : 'formWhereValueType',  
            align : 'center',  
            valign : 'middle',  
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formWhereValueType"+index+"\" class=\"form-control\"  name=\"formWhereValueType\" DictName=\"SYS_FORM_PARAM_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"过滤值类型\" value=\""+value+"\"></selcct>" ;
        	}
        }, {  
            title : '过滤值',  
            field : 'formWhereValue',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formWhereValue\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"过滤值\" value=\""+value+"\"/>";
        	}
        }, {  
            title : '过滤规则',  
            field : 'formWhereCpRule',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formWhereCpRule"+index+"\" class=\"form-control\"  name=\"formWhereCpRule\" DictName=\"SYS_FORM_WHERE_RULE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"过滤规则\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '排序',  
            field : 'formWhereSort',  
            align : 'center',  
            valign : 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formWhereSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '空值是否过滤',  
            field : 'formWhereNullIs',  
            align : 'center',  
            valign : 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<select id=\"formWhereNullIs"+index+"\" class=\"form-control\"  name=\"formWhereNullIs\" DictName=\"SYS_COMMON_YES_NO\" data-type=\"text\" data-pk=\""+row.Id+"\" dataField=\"\" data-title=\"空值是否过滤\" value=\""+value+"\"></select>" ;
        	}
		}, {  
            title : '右括号',  
            field : 'formWhereRightBracket',  
            align : 'center',  
            valign : 'middle',
            width:175,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formWhereRightBracket\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"右括号\" value=\""+value+"\"/>" ;
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelectstep3();
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

function query_tablestep5() {   
    $("#tableListstep5").bootstrapTable({  
        url : '${pageContext.request.contextPath }/form/queryFormButton.action?formId=0', 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "formButtonId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
            title : '操作',  
            field : 'formButtonId', // 字段  
            align: 'center',
            valign: 'middle',
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"formButtonId\" style=\"width:0px;padding:0px;border:none\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-edit\" style=\"position: absolute;opacity: 0.5;right: 25px;top: 5px;cursor: pointer;\" onclick=\"editButtonstep5(this)\"></i>"+
						"<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"removestep5(this)\"></i><div>" ;
        	}
		},{
            title : '按钮类型名称',  
            field : 'formButtonType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"formButtonType"+index+"\" name=\"formButtonType\" DictName=\"SYS_FORM_BUTTON_TYPE\" onchange=\"changeButtonType(this)\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"按钮类型名称\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '按钮显示名称',  
            field : 'formButtonName',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮显示名称\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮编码',  
            field : 'formButtonCode',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮编码\" value=\""+value+"\"/>";
        	}
        }, {  
            title : '按钮显示顺序',  
            field : 'formButtonSort',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonSort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮显示顺序\" value=\""+value+"\"/>";
        	}
		 }, {  
            title : '后置触发',  
            field : 'HZESQL',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\"  name=\"HZESQL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"后置触发\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-plus\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"editESQL(this,'HZ')\"></i></div>";
            }
        }, {  
            title : '自定义图标',  
            field : 'formButtonIcon',  
            align : 'center',  
            valign : 'middle',
            width:150,
            formatter: function (value, row, index) {
            	if(value==undefined){
		        		value = "";
		        	}
            	return "<input class=\"form-control\"  name=\"formButtonIcon\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"自定义图标\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '按钮宽度',  
            field : 'formButtonWidth',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonWidth\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮宽度\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮高度',  
            field : 'formButtonHeight',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonHeight\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮高度\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '按钮样式',  
            field : 'formButtonCss',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCss\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"按钮样式\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '警告框提示内容',  
            field : 'formButtonWarningInfo',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonWarningInfo\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"警告框提示内容\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '前置脚本方案',  
            field : 'formButtonCheckFun',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"formButtonCheckFun\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"前置脚本方案\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '前置触发',  
            field : 'QZESQL',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
            	}
        		return "<div style=\"position:relative\"><input class=\"form-control\"  name=\"QZESQL\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"前置触发\" value=\""+value+"\"/>"+
					   "<i class=\"glyphicon glyphicon-plus\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"editESQL(this,'QZ')\"></i></div>";
	    	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelectstep5();
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

function choseColumn(){
	var url = '/myehr/jsp/form/formcreate/formNameColumnList.jsp?interfaceSehemeId=1';
	layer.open({
		type: 2,
		title:'选择表单字段',
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
		}
	});
}

function selectDictNameColumn(){
	var url = '/myehr/jsp/form/formcreate/formNameColumnList.jsp?interfaceSehemeId=1&type=dictNameColumn';
	var title = '选择字典名称关联字段';
	layer.open({
		type: 2,
		title:title,
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
		}
	});
}


</script>
</html>