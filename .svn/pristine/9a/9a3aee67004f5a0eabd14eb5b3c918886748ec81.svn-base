<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_3622" name="form_3622" style="margin-bottom:50px" >
<div class="container-fluid" style="overflow-y:auto;">
	<div class="my_card" style="margin-top:5px;">
<input id="STR_THEME.STRTHEME_ID_3622" name="STRTHEME_ID" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="STR_THEME.STRTHEME_PARENTID_3622" name="STRTHEME_PARENTID" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<div class='row cell'>
<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名称")%>: </lable><input id="STR_THEME.STRTHEME_CNAME_3622" name="STRTHEME_CNAME" type="hidden" class="form-control"  style=" float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<script type="text/plain" id="STR_THEME__STRTHEME_CNAME_3622" style="width:100%;height:240px;float:left"></script></div>
</div>
<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名称")%>: </lable><input id="STR_THEME.STRTHEME_ENAME_3622" name="STRTHEME_ENAME" type="hidden" class="form-control"  style=" float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<script type="text/plain" id="STR_THEME__STRTHEME_ENAME_3622" style="width:100%;height:240px;float:left"></script></div>
</div>
<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"类型")%>: </lable><input id="STR_THEME.STRTHEME_XTYPE_3622" name="STRTHEME_XTYPE" type="hidden" class="form-control"  style=" float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<script type="text/plain" id="STR_THEME__STRTHEME_XTYPE_3622" style="width:100%;height:240px;float:left"></script></div>
</div>
		</div>
		<div class="BTNGROUP BTNGROUP_3622" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formstr_richText_card"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存(卡片式)")%> onclick="save_formstr_richText_card_click_3622()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closestr_richText_card"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
			</div>
		</div>
<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
</div>
</div>
</form>
<script>
var heightGadedata_3622 =[];
var containerParam_3622 ={};
containerParam_3622 ={};
function changeHeightGadedata_3622(data){
	heightGadedata_3622 = data;
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
	var _formId_3622='3622';
	window.onload=function(){
		cardSelectInitFunction('${param.formType}');
initRoleColumn('3622');
initRoleButtons();


	}

	function save_formstr_richText_card_click_3622(){
		var paramsMap = {};

		var _param = {};
		_param.formId=_formId_3622;
		_param.buttonId=4638;
		_param = getdata(_param.buttonId,_formId_3622);
		_param.paramsMap = paramsMap
		if(checkNull("#form_3622")){
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
	function _initData_3622(pkId){
		var _param = {};
		if(pkId){
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{},pkId:pkId,formId:_formId_3622};
			}else{;
				_param = {pkId:pkId,formId:_formId_3622};
			}
		}else {
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{ID:'${param.businessId}'},pkId:pkId,formId:_formId_3622};
			}else{;
				_param = {requestParam:{},pkId:pkId,formId:_formId_3622};
			}
		}
		_param.containerParam = containerParam;
		var _form = getForm("#form_3622");
		var _Type = getType("#form_3622");
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
						    if(key=='STRTHEME_ID'){
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
	var STR_THEME__STRTHEME_CNAME_3622 = UE.getEditor('STR_THEME__STRTHEME_CNAME_3622');	
	STR_THEME__STRTHEME_CNAME_3622.addListener("contentChange",copyContentTo);
	function copyContentTo(){
		$("[id='STR_THEME.STRTHEME_CNAME_3622']").val(STR_THEME__STRTHEME_CNAME_3622.getContent());
		$("[id='STR_THEME.STRTHEME_ENAME_3622']").val(STR_THEME__STRTHEME_ENAME_3622.getContent());
		$("[id='STR_THEME.STRTHEME_XTYPE_3622']").val(STR_THEME__STRTHEME_XTYPE_3622.getContent());
		alert($("[id='STR_THEME.STRTHEME_CNAME_3622']").val());
	}
	var STR_THEME__STRTHEME_ENAME_3622 = UE.getEditor('STR_THEME__STRTHEME_ENAME_3622');
	STR_THEME__STRTHEME_CNAME_3622.addListener("contentChange",copyContentTo);
	function copyContentTo(){
		$("[id='STR_THEME.STRTHEME_CNAME_3622']").val(STR_THEME__STRTHEME_CNAME_3622.getContent());
		$("[id='STR_THEME.STRTHEME_ENAME_3622']").val(STR_THEME__STRTHEME_ENAME_3622.getContent());
		$("[id='STR_THEME.STRTHEME_XTYPE_3622']").val(STR_THEME__STRTHEME_XTYPE_3622.getContent());
		alert($("[id='STR_THEME.STRTHEME_CNAME_3622']").val());
	}	
	var STR_THEME__STRTHEME_XTYPE_3622 = UE.getEditor('STR_THEME__STRTHEME_XTYPE_3622');	
	STR_THEME__STRTHEME_CNAME_3622.addListener("contentChange",copyContentTo);
	function copyContentTo(){
		$("[id='STR_THEME.STRTHEME_CNAME_3622']").val(STR_THEME__STRTHEME_CNAME_3622.getContent());
		$("[id='STR_THEME.STRTHEME_ENAME_3622']").val(STR_THEME__STRTHEME_ENAME_3622.getContent());
		$("[id='STR_THEME.STRTHEME_XTYPE_3622']").val(STR_THEME__STRTHEME_XTYPE_3622.getContent());
		alert($("[id='STR_THEME.STRTHEME_CNAME_3622']").val());
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
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3622;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3622;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3622;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode.parentNode;
		                    obj.style.display="none";
		                }
	                }
	                if(datas[i].formColumnUsName==2){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3622;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3622;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+3622;
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
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId=3622';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].powerType==4){
                    var obj = $("#"+datas[i].formButtonCode+"str_richText_card");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==3){
                    var obj = $("#"+datas[i].formButtonCode+"str_richText_card");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==2){
                    var obj = $("#"+datas[i].formButtonCode+"str_richText_card");
                    obj[0].disabled=true;
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+"str_richText_card");
                    obj[0].parentNode.style.display="none";
                }
            }
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
	    var pkId = document.getElementById("STR_THEME.ID_3622").value;
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
