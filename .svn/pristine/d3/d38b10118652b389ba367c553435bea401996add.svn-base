<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<html>
<head>
    <style type="text/css" href="./css/bootstrap.min.css"></style>
    <link rel="stylesheet" href="cssjs/animate.css" type="text/css"></link>
	<link rel="stylesheet" href="cssjs/jquery.steps.css" type="text/css"></link>
	<script type="text/javascript" src="cssjs/jquery.steps.min.js"></script>
	<script type="text/javascript" src="cssjs/formQuestionBuild.js"></script>
	<style type="text/css">
	.wrapper{width:98%;margin:0 auto;padding-top:10px}
	.row{margin:0;}
	.wizard > .content > .body{padding: 0.5% 2.5%;}
	.row.cell>div lable{font-weight:600;width:80px}
	.fixed-table-container thead th .th-inner, .fixed-table-container tbody td .th-inner{font-weight:600}
	fieldset{height:100%}
	.ztree li a{width:89%}
	#step2_part2 .fixed-table-body {height:100%}
	.wizard > .content > .body ul > li{list-style:none}
	#step2_part2 .clearfix{display:none}
	.row.cell>div{min-height:30px;margin:10px 0 0 0;}
	.wizard > .steps > ul > li{width:33.3333333333%}
	#question-p-5,#question-p-4,#question-p-3,#question-p-2,#question-p-1{width:100%;height:97%}
	</style></head>

<body>
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div id="question" class="wizard-big">
                    <h1>基本配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="question_step1" name="question_step1" class="col-sm-12" >
                                <div class="container-fluid" style="overflow-y:auto;">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;">
                                        <h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">基础信息</h3>
                                            <div class="row cell" id="question1" >
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">试卷编码</lable>
                                                        <input id="code" title="试卷编码" name="code" type="text" required="true" class="form-control" style="width:200px;" value=""/>
                                                        <input id="id" name="id" type="hidden" class="form-control"  required="true"  style="width:200px;"/>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">试卷中文名</lable>
                                                        <input id="cname" title="试卷中文名" name="cname" type="text" required="true" class="form-control" style="width:200px;" value=""/>
                                                    </div>
                                                </div>
                                                <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">试卷英文名</lable>                        
                                                        <input id="ename" title="试卷英文名" name="ename" type="text" required="true" class="form-control" style="width:200px;" value=""/>
                                                    </div>
                                                </div>
												<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">试卷总分</lable>                        
                                                        <input id="countNumber" title="试卷总分" name="countNumber" type="number" required="true" class="form-control" style="width:200px;" value=""/>
                                                    </div>
                                                </div>
												<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
                                                        <lable style="float:left">标识(试卷类别)</lable>                        
                                                        <select id="remark" title="标识(试卷类别)" styleType="select" name="remark" disabled class="form-control" style="width:200px;" textField="dictName" valueField="dictID" DictName="Question_Type" dataField="dicts">
                                                        </select>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">试卷描述</lable>
                                                        <textarea id="templatedesc" name="templatedesc" rows="7" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">卷首语</lable>
                                                        <textarea id="begindesc" name="begindesc" rows="7" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "">
                                                    <div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
                                                        <lable style="float:left">卷尾语</lable>
                                                        <textarea id="enddesc" name="enddesc" rows="7" class="form-control" style="width:50%;resize:none">
                                                        </textarea>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>  
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    
                    <h1>试卷题目配置</h1>
                    <fieldset>
                        <div class="row">
                            <div id="question_step2" name="question_step2" class="col-sm-12" >
                                <div class="container-fluid" style="">
                                    <div style="margin-top:5px;">
                                        <div style="margin:10px 0;height:100%">
	                                        <div id="step2_part2" style="height:45%;padding:10px;display:block;height:88%;">
	                                        	<h3 style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;margin:0">题目明细</h3>
	                                        	<div class="row cell" style = "padding-left:15px;width:50%;float:left;">
													<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;" >
														<div style="margin-right:10px;display:inline-block">
															<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"类型")%>: </lable>
														    <select id="GROUPID" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"类型")%>" styleType="select" name="GROUPID"  class="form-control" emptyText="请选择..."  style="width:60%;" textField="dictName" valueField="dictID" DictName="SYS_QUESTION" nullItemText="请选择..." dataField="dict" initParam = "_">
															</select>
														</div>
														<div style="margin-right:10px;display:inline-block">
															<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题型")%>: </lable>
														    <select id="XTYPE" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题型")%>" styleType="select" name="XTYPE"  class="form-control" emptyText="请选择..."  style="width:60%;" textField="dictName" valueField="dictID" DictName="QUESTIONTYPE" nullItemText="请选择..." dataField="dict" initParam = "_">
															</select>
														</div>
														<div style="margin-right:10px;display:inline-block">
														    <input type="button" id="pickQuestions"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"进入题库选题")%> onclick="chooseQuestion()"/>
														</div>
													</div>
													<table id="questionList">
													</table>
												</div>
												
												<div class="container-fluid" style="width:50%;float:left;border:none;background-color:#efefef">
													<ul class="nav nav-tabs" id="myTab">
														<li class="active"><a href="#Tab_1">题目信息</a></li>
													</ul>
													<div class="tab-content">
														<div class="tab-pane active" id="Tab_1">
															<div id="columnquestion" class="" style="">
																<div class="row cell" style="border:none;line-height:25px;height:95%;overflow:auto;" >
																	<input id="id" name="id" type="hidden" class="form-control" />
																	<div id="questionInfo2" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"分值")%>: </lable>
																			<input id="amount" name="amount" type="number" class="form-control" style="width:60%;"/>
																		</div>
																	</div>
																	<div id="questionInfo3" class="col-lg-6 col-md-6 col-sm-12 col-xs-12">
																		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;">
																			<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排序")%>: </lable>
																			<input id="xorder" name="xorder" type="text" class="form-control" style="width:60%;"/>
																		</div>
																	</div>
																</div>		
																<div class="BTNGROUP BTNGROUP_1004" style="margin:0 0 0 15px; display:inline-block;height: 30px;">
																	<div style="margin-right:10px;display:inline-block">
																	    <input type="button" id="saveColumnInfo"  class="btn btn-primary" value=保存 onclick="saveColumnInfo()"/>
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
							</div>
						</div>
                    </fieldset>
                    
                    <h1>按钮配置</h1>
                    <fieldset> 
                    </fieldset>	
                </div>
            </div>
        </div>
    </div>
</body>
<script>
var templateId = ${param.templateId};
var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
		jsonParam:{},
		chang:function (e){
			var aaa = e;
		}
	}

$(document).ready(function () {
    $("#question").steps({
        bodyTag: "fieldset",
        onStepChanging: function (event, currentIndex, newIndex) {
            if (currentIndex == 0) {//离开基础配置
				return savequestionInfo();
            }
            if (currentIndex == 1) {//离开逻辑配置
            	//querys_1041();
                return true;
            }
            if (currentIndex == 2) {//离开节点配置
            	//query_table();
                return true;
            }
            
            // Start validation; Prevent going forward if false
            return true;
            
           
        },
        onStepChanged: function (event, currentIndex, priorIndex) {
        },
        onFinishing: function (event, currentIndex) {
            var question = $(this);


            // Start validation; Prevent question submission if false
            return savequestionInfo();
        },
        onFinished: function (event, currentIndex) {
            var question = $(this);
            CloseWebPage();
            //真正完成后调用方法
            // Submit question input
            //question.submit();
        }
    });
    
    questionInit();//试卷类型初始化
    
});


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


//根据试卷ID获取试卷名
function getquestionNameById(questionDefId){
	var questionDefName;
	$.ajax({
		url:'${pageContext.request.contextPath}/question/getquestionNameById.action?questionDefId='+questionDefId,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
				questionDefName = data.questionDefName;
			}
		});
	return questionDefName;
}

function getDictnameByCode(e){
	var DictName;
	$.ajax({
		url:'${pageContext.request.contextPath}/question/getDictnameByCode.action?dictTypeCode='+e,
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




function getdata_1881(buttonId,questionId){
	var param = {};
	var data = {buttonId:buttonId,questionId:questionId,param:{},paramsMap:{}};
	$.map($('[name=question_step2]').serializeArray(), function(item, index){
		var property =item['name'];
		var value = item['value'];
		param[property] = value;
	});
	data.param = param;
	return data;
}
function getquestion(questionId){
	var object=[];
	$(questionId).find("input").each(function(){
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
	$(questionId).find("textarea").each(function(){
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
	$(questionId).find("select").each(function(){
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

function getType(questionId){
	var object=[];
		$(questionId).find("input").each(function(){
			var vtype = $(this).attr('format');
			var type = $(this).attr('type');
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
			if(type!=undefined){
				if(type=='checkbox'){
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
					object[id]="checkbox";
				}
			}
		})
	return object;
}



</script>
</html>