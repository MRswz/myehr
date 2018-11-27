<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<div class="container-fluid" style="overflow-y:auto;height:100%;">
<div style="text-align:center;width:100%;height:50px"><span id="formTitle" style="font-size:36px"></span></div><form id="form_4352" name="form_4352" style="margin-bottom:50px" >
	<div class="my_card" style="margin-top:5px;">
<input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_ID_4352" name="SYSACTCHECKEDPOINT_ID" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<div class='row cell'>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合规要求")%>: </label><input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_CHECKED_REQUIRE_4352" name="SYSACTCHECKEDPOINT_CHECKED_REQUIRE" type="text" class="form-control"  vtype="illegalChar;maxLength:500;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"检查内容")%>: </label><input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_CHECKED_CONTENT_4352" name="SYSACTCHECKEDPOINT_CHECKED_CONTENT" type="text" class="form-control"  vtype="illegalChar;maxLength:500;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"控制方式")%>: </label>						<select id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_CONTROL_TYPE_4352" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"控制方式")%>" styleType="select" name="SYSACTCHECKEDPOINT_CONTROL_TYPE"  class="form-control " emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="checkedPointControlType" dataField="dicts_form_78955"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否关联附件")%>: </label>						<select id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_IS_FILE_4352" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否关联附件")%>" styleType="select" name="SYSACTCHECKEDPOINT_IS_FILE"  class="form-control " emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_78949"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px">是否必填: </label>						<select id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_IS_REQUIRE_4352" title="是否必填" styleType="select" name="SYSACTCHECKEDPOINT_IS_REQUIRE"  class="form-control " emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="SYS_COMMON_YES_NO" dataField="dicts_form_79032"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"业务类型")%>: </label>						<input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_DUTY_TYPE_4352" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"业务类型")%>" styleType="inputSelect" name="SYSACTCHECKEDPOINT_DUTY_TYPE"  class="form-control " emptyText=""  readonly  style="border:none;width:200px; " textField="dictName" valueField="dictId" DictName="SYSDICTENTRY_DICT_ENTRY_NAME" dataField="dicts_form_78954"initParam = "parameter_SYSDICTENTRY_DICT_ENTRY_NAME"/>
<input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_DUTY_TYPE_4352_value" name="SYSACTCHECKEDPOINT_DUTY_TYPE" type="hidden" />
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"创建人")%>: </label>						<input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_CREATER_NAME_4352" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"创建人")%>" styleType="inputSelect" name="SYSACTCHECKEDPOINT_CREATER_NAME"  class="form-control " emptyText=""  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="" dataField="data_form_78951"initParam = "session_userid"/>
<input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_CREATER_NAME_4352_value" name="SYSACTCHECKEDPOINT_CREATER_NAME" type="hidden" />
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"创建时间")%>: </label><input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_CREATER_TIME_4352" name="SYSACTCHECKEDPOINT_CREATER_TIME" type="text" dateType="controls input-append date form_date1" class="form-control" styleType="dateTime" readonly  style="width:200px;float:left;border-radius: 4px 0 0 4px;" format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最新操作人")%>: </label>						<input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_OPERATOR_NAME_4352" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最新操作人")%>" styleType="inputSelect" name="SYSACTCHECKEDPOINT_OPERATOR_NAME"  class="form-control " emptyText=""  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="TEST_DUTY_TYPE" dataField="data_form_78953"initParam = "session_userid"/>
<input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_OPERATOR_NAME_4352_value" name="SYSACTCHECKEDPOINT_OPERATOR_NAME" type="hidden" />
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最新操作时间")%>: </label><input id="SYS_ACT_CHECKED_POINT.SYSACTCHECKEDPOINT_OPERATOR_TIME_4352" name="SYSACTCHECKEDPOINT_OPERATOR_TIME" type="text" dateType="controls input-append date form_date1" class="form-control" styleType="dateTime" readonly  style="width:200px;float:left;border-radius: 4px 0 0 4px;" format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
</div>
</div>
		</div>
		<div class="BTNGROUP BTNGROUP_4352" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formcheckedPointAddCard"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存(卡片式)")%> onclick="save_formcheckedPointAddCard_click_4352()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closecheckedPointAddCard"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
			</div>
		</div>
<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
</div>
</form>
</div>
<script>
var heightGadedata_4352 =[];
var containerParam_4352 ={};
containerParam_4352 ={};
function changeHeightGadedata_4352(data){
	heightGadedata_4352 = data;
}
$(function () {  
if('isView'=='${param.isView}'){
	cardIsViewFunction();
}
cardDateWidInitFunction(); 
});
function getdata(buttonId,formId){
	return cardGetdata(buttonId,formId);
}
function _initParamCard(){
}
	var _formId_4352='4352';
	var realFormId='${param.formId}';
	window.onload=function(){
		cardSelectInitFunction('${param.formType}');
		//initRoleColumn('4352');
		//initFieldRuleColumn('4352');
		//initRoleButtons();
		_initData_4352();
		changeFileCss();
	}

	function save_formcheckedPointAddCard_click_4352(){
		var paramsMap = {};

		var _param = {};
		_param.formId=_formId_4352;
		_param.buttonId=5810;
		_param = getdata(_param.buttonId,_formId_4352);
		_param.paramsMap = paramsMap
		if(checkNull("#form_4352")){
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
	function _initData_4352(pkId){
		var _form = getForm("#form_4352");
		var _Type = getType("#form_4352");
		$.ajax({
			url:'${pageContext.request.contextPath }/question/findCheckedPointById.action?id=${param.SYSACTCHECKEDPOINT_ID}',
			type:'post',
			cache: false,
			async: false,
			success: function (text) {
				 var object = text[0];
				 var buttonType = '${param.buttonType}';
				 for(var key in object){
					if(key=='SYSACTCHECKEDPOINT_ID'){
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
;												var DictName = obj.attributes.DictName.value
;										    	selectSqlDictEntryByValue(_form[key],object[key],dataField,DictName);
									}else if(_Type[key]=="richText" && object[key]!=null){
										$("[id='"+_form[key]+"']").val(object[key]);
										$("[id='"+_form[key]+"']").change();
									}else if(_Type[key]=="lookUp" && object[key]!=null){
										$("[id='"+_form[key]+"']").val(object[key]);
										$("[id='"+_form[key]+"_name']").val(getLookupValue(_form[key],object[key]));
									}else{
										document.getElementById(_form[key]).value=object[key];
									}
							}
					};
								
			if("undefined" != typeof mstTab_activechanged ){
				mstTab_activechanged();
			}
			initFormNameWithSelectColumn();
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	//初始化表单权限字段
	function initFieldRuleColumn(formId){
	    var url = '${pageContext.request.contextPath }/FieldList/selectColumnWithFieldRule.action?formId='+formId;
	    $.ajax({
	        url:url,
	        type:'post',
	        cache: false,
	        async: false,
	        contentType:'application/json',
	        success:function(datas){
	            for(var i=0;i<datas.length;i++){
		                var obj = $("[id='"+datas[i].fieldRuleJspId+"']")[0];
		                obj.value=datas[i].fieldRuleValue;
	            }
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
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+4352;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+4352;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+4352;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode.parentNode;
		                    obj.style.display="none";
		                }
	                }
	                if(datas[i].formColumnUsName==2){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+4352;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+4352;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+4352;
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
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId=4352';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].powerType==4){
                    var obj = $("#"+datas[i].formButtonCode+"checkedPointAddCard");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==3){
                    var obj = $("#"+datas[i].formButtonCode+"checkedPointAddCard");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==2){
                    var obj = $("#"+datas[i].formButtonCode+"checkedPointAddCard");
                    obj[0].disabled=true;
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+"checkedPointAddCard");
                    obj[0].parentNode.style.display="none";
                }
            }
        }
    });
}
function selectSqlDictEntryByValue(id,value,dataField,DictName){
    $.ajax({
        url:'${pageContext.request.contextPath }/dict/selectSqlDictEntryByValue.action?value='+value+'&dataField='+dataField+'&DictName='+DictName,
        type:'post',
        cache: false,
        contentType: 'application/json;charset=utf-8',
    	 async: false,
        success: function (data) { 
            document.getElementById(id).value=data.DICTENTRY;
            document.getElementById(id+"_value").value=value;
        }
    });
}
function initFormNameWithSelectColumn(){
    var total = '';
    var obj = document.getElementById('formTitle').innerText = total;
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
	    var pkId = document.getElementById("SYS_ACT_CHECKED_POINT.ID_4352").value;
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
