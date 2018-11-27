<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body style="text-align:center">
<form id="form_3322" name="form_3322" style="margin-bottom:50px" >
<div class="container-fluid" style="overflow-y:auto;height:100%;">
	<div class="my_card" style="margin-top:5px;">
<input id="SYS_QUESTION.SYSQUESTION_ID_3322" name="SYSQUESTION_ID" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<div class='row cell'>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目编码")%>: </lable><input id="SYS_QUESTION.SYSQUESTION_CODE_3322" name="SYSQUESTION_CODE" type="text" class="form-control"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目中文名")%>: </lable><input id="SYS_QUESTION.SYSQUESTION_CNAME_3322" name="SYSQUESTION_CNAME" type="text" class="form-control"  vtype="illegalChar;maxLength:4000;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目英文名")%>: </lable><input id="SYS_QUESTION.SYSQUESTION_ENAME_3322" name="SYSQUESTION_ENAME" type="text" class="form-control"  vtype="illegalChar;maxLength:4000;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目分类")%>: </lable>						<select id="SYS_QUESTION.SYSQUESTION_GROUPID_3322" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目分类")%>" styleType="select" name="SYSQUESTION_GROUPID"  class="form-control " emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="SYS_QUESTION" dataField="dicts_form_60005"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题型")%>: </lable>						<select id="SYS_QUESTION.SYSQUESTION_XTYPE_3322" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题型")%>" styleType="select" name="SYSQUESTION_XTYPE"  class="form-control " emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="QUESTIONTYPE" dataField="dicts_form_60006"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"题目描述")%>: </lable><input id="SYS_QUESTION.SYSQUESTION_DESCRIBE_3322" name="SYSQUESTION_DESCRIBE" type="text" class="form-control"  vtype="illegalChar;maxLength:2000;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"分值")%>: </lable><input id="SYS_QUESTION.SYSQUESTION_AMOUNT_3322" name="SYSQUESTION_AMOUNT" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标识")%>: </lable><input id="SYS_QUESTION.SYSQUESTION_REMARK_3322" name="SYSQUESTION_REMARK" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作人")%>: </lable><input id="SYS_QUESTION.SYSQUESTION_OPERATOR_NAME_3322" name="SYSQUESTION_OPERATOR_NAME" type="text" class="form-control"  vtype="illegalChar;maxLength:20;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作时间")%>: </lable>
					<div class='controls input-append date form_date1 input-group' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;margin-top:5px;width: 134px;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="SYSQUESTION_OPERATOR_TIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
							<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					</div><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
		</div>
		<div class="BTNGROUP BTNGROUP_3322" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formQUESTIONSCARD"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save_formQUESTIONSCARD_click_3322()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closeQUESTIONSCARD"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
			</div>
		</div>
<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
</div>

<div class='row cell'>
	<div class="col-sm-12 animated fadeInRight">
		<div class="row">
			<div id="file_wall_view" class="col-sm-12">
				<input id="file-es" name="file-es[]" type="file" multiple/>
				<input id="file-zh" name="file-zh[]" type="file" multiple/>
			</div>
		</div>
	</div>
</div>


</div>
</form>
<script>
var heightGadedata_3322 =[];
var containerParam_3322 ={};
containerParam_3322 ={};
function changeHeightGadedata_3322(data){
	heightGadedata_3322 = data;
}
$(function () {  
	if('isView'=='${param.isView}'){
		cardIsViewFunction();
	}
	cardDateWidInitFunction();
	loadDataStart();
});

var formId='${param.formId}';

	
	var realFormId = '${param.formId}';
	var _formId_3322='3322';
	window.onload=function(){
	cardSelectInitFunction('${param.formType}');
	initRoleColumn('3322');
	initRoleButtons();

		var value = '2018-01-29 05:49:24';
			    var id = 'SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322';
if($("[id='SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322']").attr("styleType")=="dateTime"){
		if(value.indexOf(":") > -1){
			if(value.indexOf("-") > -1){
			 	document.getElementById("SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322").value=formatDatebox(value,id);
			}else{
				document.getElementById("SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322").value=value;
			}
		}else{
			if(value==null || value==""|| value=="null"){
				document.getElementById("SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322").value=value;
			}else{
			    var date = new Date(parseInt(value)).Format("yyyy-MM-dd hh:mm:ss");
				document.getElementById("SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322").value = formatDatebox(date,id);
			}
		}
}else if($("[id='SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322']").attr("styleType2")=="search"){
		$("[id='SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322']").selectpicker('val', value);
}else{
    if($("[id='SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322']").attr("styleType")=="inputSelect"){        var dataField = $("[id='SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322']").attr("dataField");
        selectSqlDictEntryByValue("SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322",value,dataField);
    }else{
		   document.getElementById("SYS_QUESTION.SYSQUESTION_OPERATOR_TIME_3322").value=value;
    }
}
;

	}

	function save_formQUESTIONSCARD_click_3322(){
		var paramsMap = {};

		var _param = {};
		_param.formId=_formId_3322;
		_param.buttonId=4234;
		_param = getdata(_param.buttonId,_formId_3322);
		_param.paramsMap = paramsMap
		if(checkNull("#form_3322")){
		}else{
		$.ajax({
			url:'${pageContext.request.contextPath }/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
			if(text[0]=='000000' || text[1]=='保存成功'){
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功！")%>");
				closex()
			}else if(text[0]=='error'){
			    if(text.length>1 &&text[0]=='error'){
					alert(text[1]);
			    }else{
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
			    }
			}else {
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存失败")%>");
			}
			}
		});
		}
	}
	function _initData_3322(pkId){
		var _param = {};
		if(pkId){
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{},pkId:pkId,formId:_formId_3322};
			}else{;
				_param = {pkId:pkId,formId:_formId_3322};
			}
		}else {
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{ID:'${param.businessId}'},pkId:pkId,formId:_formId_3322};
			}else{;
				_param = {requestParam:{},pkId:pkId,formId:_formId_3322};
			}
		}
		_param.containerParam = containerParam;
		var _form = getForm("#form_3322");
		var _Type = getType("#form_3322");
		$.ajax({
			url:'${pageContext.request.contextPath }/form/cardformInitData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text.rows&&text.rows.length>0){
						 var object = text.rows[0];
						 var buttonType = '${param.buttonType}';
						 for(var key in object){
						    if(key=='SYSQUESTION_ID'){
						        if(buttonType=='copyAndUpdate'){
						            continue;
						        }
						    }
								if(_form[key]!=null&&_form[key]!="undefined"){
										if(_Type[key]=="dateTime" && object[key]!=null){
											date = object[key]+"";
											if(date.indexOf(":") > 0){
									    		date = object[key];
											}else{
									    		if(object[key]==null || object[key]==""){
													date = object[key]
												}else{
													date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
												}
											}
											document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
											}else if(_Type[key]=="search" && object[key]!=null){
												$("[id='"+_form[key]+"']").selectpicker('val', object[key]);
											}else if(_Type[key]=="mupick" && object[key]!=null){
												var xxx=(object[key]+"").split(",");
												$("[id='"+_form[key]+"']").selectpicker('val', xxx);
											}else if(_Type[key]=="fileupload" && object[key]!=null){
												document.getElementById(_form[key]).value=object[key];
												var fileName = _form[key]+'_fileName';
												var fileNameValue = getFilenameById(object[key]);
												document.getElementById(fileName).value=fileNameValue;
											}else if(_Type[key]=="inputSelect" && object[key]!=null){
												var obj = document.getElementById(_form[key]);
												var dataField = obj.attributes.dataField.value
;										    	selectSqlDictEntryByValue(_form[key],object[key],dataField);
											}else if(_Type[key]=="richText" && object[key]!=null){
												$("[id='"+_form[key]+"']").val(object[key]);
												$("[id='"+_form[key]+"']").change();
											}else{
												document.getElementById(_form[key]).value=object[key];
											}
									}
							};
										
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();}
				} else {
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	//初始化表单权限字段
	function initRoleColumn(formId){
	    var url = '${pageContext.request.contextPath }/form/queryCardFormColumnsWithUserId.action?formId='+formId;
	    $.ajax({
	        url:url,
	        type:'post',
	        cache: false,
	        async: false,
	        contentType:'application/json',
	        success:function(datas){
	            for(var i=0;i<datas.length;i++){
	                if(datas[i].formColumnShowType=='hide'){
	                    continue;
	                }
	                if(datas[i].formColumnUsName==0 || datas[i].formColumnUsName==3 || datas[i].formColumnUsName==4){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3322;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3322;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3322;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode.parentNode;
		                    obj.style.display="none";
		                }
	                }
	                if(datas[i].formColumnUsName==2){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3322;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3322;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3322;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }
	                }
	            }
	        }
	    });
	}
//初始化表单按钮字段
function initRoleButtons(){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId=3322';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].powerType==4){
                    var obj = $("#"+datas[i].formButtonCode+"QUESTIONSCARD");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==3){
                    var obj = $("#"+datas[i].formButtonCode+"QUESTIONSCARD");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==2){
                    var obj = $("#"+datas[i].formButtonCode+"QUESTIONSCARD");
                    obj[0].disabled=true;
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+"QUESTIONSCARD");
                    obj[0].parentNode.style.display="none";
                }
            }
        }
    });
}
function selectSqlDictEntryByValue(id,value,dataField){
    $.ajax({
        url:'${pageContext.request.contextPath }/dict/selectSqlDictEntryByValue.action?value='+value+'&dataField='+dataField,
        type:'post',
        cache: false,
        contentType: 'application/json;charset=utf-8',
    	 async: false,
        success: function (data) { 
            document.getElementById(id).value=data.DICTENTRY;
        }
    });
}
	//唯一验证
	function uniqueVerifyBlur(obj){ 
	    var id = obj.id;
	    var strs= new Array();
	    strs= id.split("\.");
	    var tableName= strs[0];
	    strs= strs[1].split("_");
	    var fieldName= strs[0];
	    var value = document.getElementById(id).value;
	    var pkId = document.getElementById("SYS_QUESTION.ID_3322").value;
	    $.ajax({ 
		       url:'/myehr/form/checkUniqueVerify.action?tableName='+tableName+'&fieldName='+fieldName+'&value='+value+'&pkId='+pkId+'&pkFieldName=ID',
	        type:'post',
			   cache: false,
			   contentType: 'application/json;charset=utf-8',
			   success: function (text) {
				   if(text[0]=='1'){
					   obj.value='';
					   obj.style['border-color']='red';
					   obj.setAttribute("placeholder",text[1]);
				   }
				   if(text[0]=='0'){
					   obj.style['border-color']='#CCC';
				   }
			   }
		   });
	}
</script>
</body>
</html>
