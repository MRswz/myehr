<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<div class="container-fluid" style="overflow-y:auto;height:100%;">
<div style="text-align:center;width:100%;height:50px"><span id="formTitle" style="font-size:36px"></span></div><form id="form_692" name="form_692" style="margin-bottom:50px" >
	<div class="my_card" style="margin-top:5px;">
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_depcost_692" name="ORGDEPARTMENTREG_depcost" type="hidden" class="form-control"  emptyText="请选择..."  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_id_692" name="ORGDEPARTMENTREG_id" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_depid_692" name="ORGDEPARTMENTREG_depid" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692" name="ORGDEPARTMENTREG_xtype" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP1_692" name="ORGDEPARTMENTREG_DEPGROUP1" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP2_692" name="ORGDEPARTMENTREG_DEPGROUP2" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP3_692" name="ORGDEPARTMENTREG_DEPGROUP3" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP4_692" name="ORGDEPARTMENTREG_DEPGROUP4" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP5_692" name="ORGDEPARTMENTREG_DEPGROUP5" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_hrspecialist_692" name="ORGDEPARTMENTREG_hrspecialist" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_valid_692" name="ORGDEPARTMENTREG_valid" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_validby_692" name="ORGDEPARTMENTREG_validby" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_zuid_692" name="ORGDEPARTMENTREG_zuid" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_orgcode_692" name="ORGDEPARTMENTREG_orgcode" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_validtime_692" name="ORGDEPARTMENTREG_validtime" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
<div style="margin:10px 0;">
		<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">基本信息</h3>
			<div class="row cell"  >
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门编码")%>: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_depcode_692" name="ORGDEPARTMENTREG_depcode" type="text" class="form-control"  vtype="illegalChar;maxLength:50;minLength:null;"  required="true"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门名称")%>: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_cname_692" name="ORGDEPARTMENTREG_cname" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  required="true"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门简称")%>: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_ename_692" name="ORGDEPARTMENTREG_ename" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  required="true"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
		</div>
</div>
<div style="margin:10px 0;">
		<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">业务信息</h3>
			<div class="row cell"  >
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门级别")%>: </lable>						<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_depgrade_692" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门级别")%>" styleType="select" name="ORGDEPARTMENTREG_depgrade"  class="form-control " emptyText="请选择..."  required="true"  style="float:left;width:200px;" showNullItem="true" textField="dictName" valueField="dictID" DictName="DEPGRADE" nullItemText="请选择..." dataField="dicts_form_21321"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门类型")%>: </lable>						<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_deptype_692" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门类型")%>" styleType="select" name="ORGDEPARTMENTREG_deptype"  class="form-control " emptyText="请选择..."  required="true"  style="float:left;width:200px;" showNullItem="true" textField="dictName" valueField="dictID" DictName="DEPTYPE" nullItemText="请选择..." dataField="dicts_form_21322"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门性质")%>: </lable>						<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_depkind_692" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门性质")%>" styleType="select" name="ORGDEPARTMENTREG_depkind"  class="form-control " emptyText="请选择..."  required="true"  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="DEPKIND" dataField="dicts_form_21324"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属公司")%>: </lable>					<div class='input-group'  style="width:200px;;float:left;">
						<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_compid_692" styleType="lookUp" name="ORGDEPARTMENTREG_compid" type="hidden">
						<input type='text' class="form-control" readonly=true id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_compid_692_name"/>
						<span class="input-group-addon" onclick="ORG_DEPARTMENT_REG_ORGDEPARTMENTREG_compid_692_dept_edit_Card_onbuttonclick(this)">
							<span class="glyphicon glyphicon-plus">
							</span>
						</span>
					</div><span style='color:red;line-height:35px;font-size:27px'> * </span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级部门")%>: </lable>					<div class='input-group'  style="width:200px;;float:left;">
						<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_parentid_692" styleType="lookUp" name="ORGDEPARTMENTREG_parentid" type="hidden">
						<input type='text' class="form-control" readonly=true id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_parentid_692_name"/>
						<span class="input-group-addon" onclick="ORG_DEPARTMENT_REG_ORGDEPARTMENTREG_parentid_692_dept_edit_Card_onbuttonclick(this)">
							<span class="glyphicon glyphicon-plus">
							</span>
						</span>
					</div><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效日期")%>: </lable>
					<div class='controls input-append date form_date1 input-group' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_validdate_692" styleType="dateTime"   style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="ORGDEPARTMENTREG_validdate"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true"/>
							<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
							<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					</div><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门负责人")%>: </lable>						<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_director_692" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门负责人")%>" styleType="select" name="ORGDEPARTMENTREG_director"  class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  style="float:left;width:200px;" textField="text" valueField="id" DictName="" dataField="data_form_21331"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门分管领导")%>: </lable>						<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_leader_692" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门分管领导")%>" styleType="select" name="ORGDEPARTMENTREG_leader"  class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  style="float:left;width:200px;" textField="text" valueField="id" DictName="" dataField="data_form_21332"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"考勤员")%>: </lable>						<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_leadership_692" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"考勤员")%>" styleType="select" name="ORGDEPARTMENTREG_leadership"  class="form-control selectpicker bla bla bli" data-live-search="true" styleType2="search" emptyText=""  style="float:left;width:200px;" textField="text" valueField="id" DictName="" dataField="data_form_50781"initParam = "_"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编制人数")%>: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_bugetvalue_692" name="ORGDEPARTMENTREG_bugetvalue" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
		</div>
</div>
<div style="margin:10px 0;">
		<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">备注信息</h3>
			<div class="row cell"  >
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"排序")%>: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xorder_692" name="ORGDEPARTMENTREG_xorder" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>: </lable><textarea id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_remark_692" name="ORGDEPARTMENTREG_remark" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:600px;height:58; float:left"></textarea/><span style='color:red;line-height:35px;font-size:27px'></span>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记人")%>: </lable>						<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regby_692" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记人")%>" styleType="inputSelect" name="ORGDEPARTMENTREG_regby"  class="form-control " emptyText="请选择..."  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="" dataField="data_form_21336"initParam = "_"/>
</div>
</div>
<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">
<lable style="float:left;font-size:12px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记时间")%>: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692" name="ORGDEPARTMENTREG_regtime" type="text" dateType="controls input-append date form_date1" class="form-control" styleType="dateTime" readonly  style="width:200px;float:left;border-radius: 4px 0 0 4px;" format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
</div>
</div>
		</div>
</div>
		<div class='row cell'>
		</div>
		<div class="BTNGROUP BTNGROUP_692" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formdept_edit_Card"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save_formdept_edit_Card_click_692()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closedept_edit_Card"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
			</div>
		</div>
<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
</div>
</form>
</div>
<script>
var heightGadedata_692 =[];
var containerParam_692 ={};
containerParam_692 ={};
function changeHeightGadedata_692(data){
	heightGadedata_692 = data;
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
	var _formId_692='692';
var realFormId='${param.formId}';
	window.onload=function(){
		cardSelectInitFunction('${param.formType}');
initRoleColumn('692');
initRoleButtons();

		_initData_692(null);
		var value = '2018-02-08 05:32:21';
			    var id = 'ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692';
if($("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692']").attr("styleType")=="dateTime"){
		if(value.indexOf(":") > -1){
			if(value.indexOf("-") > -1){
			 	document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692").value=formatDatebox(value,id);
			}else{
				document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692").value=value;
			}
		}else{
			if(value==null || value==""|| value=="null"){
				document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692").value=value;
			}else{
			    var date = new Date(parseInt(value)).Format("yyyy-MM-dd hh:mm:ss");
				document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692").value = formatDatebox(date,id);
			}
		}
}else if($("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692']").attr("styleType2")=="search"){
		$("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692']").selectpicker('val', value);
}else{
    if($("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692']").attr("styleType")=="inputSelect"){
        var dataField = $("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692']").attr("dataField");
        var DictName = $("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692']").attr("DictName");
        selectSqlDictEntryByValue("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692",value,dataField,DictName);
    }else{
		   document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692").value=value;
    }
}
;
		var value = '2';
			    var id = 'ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692';
if($("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692']").attr("styleType")=="dateTime"){
		if(value.indexOf(":") > -1){
			if(value.indexOf("-") > -1){
			 	document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692").value=formatDatebox(value,id);
			}else{
				document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692").value=value;
			}
		}else{
			if(value==null || value==""|| value=="null"){
				document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692").value=value;
			}else{
			    var date = new Date(parseInt(value)).Format("yyyy-MM-dd hh:mm:ss");
				document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692").value = formatDatebox(date,id);
			}
		}
}else if($("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692']").attr("styleType2")=="search"){
		$("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692']").selectpicker('val', value);
}else{
    if($("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692']").attr("styleType")=="inputSelect"){
        var dataField = $("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692']").attr("dataField");
        var DictName = $("[id='ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692']").attr("DictName");
        selectSqlDictEntryByValue("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692",value,dataField,DictName);
    }else{
		   document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692").value=value;
    }
}
;

	}

	
	
	function save_formdept_edit_Card_click_692(){
		var paramsMap = {};

		var _param = {};
		_param.formId=_formId_692;
		_param.buttonId=1758;
		_param = getdata(_param.buttonId,_formId_692);
		_param.paramsMap = paramsMap
		if(checkNull("#form_692")){
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
	function _initData_692(pkId){
		var _param = {};
		if(pkId){
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{ORGDEPARTMENTREG_id:'${param.ORGDEPARTMENTREG_id}'},pkId:pkId,formId:_formId_692};
			}else{;
				_param = {pkId:pkId,formId:_formId_692};
			}
		}else {
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{id:'${param.businessId}'},pkId:pkId,formId:_formId_692};
			}else{;
				_param = {requestParam:{ORGDEPARTMENTREG_id:'${param.ORGDEPARTMENTREG_id}'},pkId:pkId,formId:_formId_692};
			}
		}
		_param.containerParam = containerParam;
		var _form = getForm("#form_692");
		var _Type = getType("#form_692");
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
						    if(key=='ORGDEPARTMENTREG_id'){
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
												$("[id='"+_form[key]+"_name']").val(getLookupValue(_form[key],object[key]));
												$("[id='"+_form[key]+"']").val(object[key]);
											}else{
												document.getElementById(_form[key]).value=object[key];
											}
									}
							};
										var _lookupData=text.rows[0];
					_setLookupText(_lookupData);
					
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();
					}
					initFormNameWithSelectColumn();
				} else {
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	function ORG_DEPARTMENT_REG_ORGDEPARTMENTREG_compid_692_dept_edit_Card_onbuttonclick(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/form/toForm.action?formId=3115'+"&idField=ORGVCOMPANY_orgid&textField=ORGVCOMPANY_cname&fatherId="+id+"";
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['500','600'],
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%>',
			content:url,
			success:function(layero,index){
			},
			end:function(){			}
		 }); 
	}

	function _setLookupText(_lookupData){
		document.getElementById('ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_compid_692').value=_lookupData.ORGDEPARTMENTREG_compid;
	}
	function ORG_DEPARTMENT_REG_ORGDEPARTMENTREG_parentid_692_dept_edit_Card_onbuttonclick(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/form/toForm.action?formId=3116'+"&idField=ORGVORGANIZATION_ORGID&textField=ORGVORGANIZATION_cname&fatherId="+id+"";
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['500','600'],
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%>',
			content:url,
			success:function(layero,index){
			},
			end:function(){			}
		 }); 
	}

	function _setLookupText(_lookupData){
		document.getElementById('ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_parentid_692').value=_lookupData.ORGDEPARTMENTREG_parentid;
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
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+692;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+692;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+692;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode.parentNode;
		                    obj.style.display="none";
		                }
	                }
	                if(datas[i].formColumnUsName==2){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+692;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+692;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+692;
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
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId=692';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].powerType==4){
                    var obj = $("#"+datas[i].formButtonCode+"dept_edit_Card");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==3){
                    var obj = $("#"+datas[i].formButtonCode+"dept_edit_Card");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==2){
                    var obj = $("#"+datas[i].formButtonCode+"dept_edit_Card");
                    obj[0].disabled=true;
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+"dept_edit_Card");
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
	    var pkId = document.getElementById("ORG_DEPARTMENT_REG.id_692").value;
	    $.ajax({ 
		       url:'/myehr/form/checkUniqueVerify.action?tableName='+tableName+'&fieldName='+fieldName+'&value='+value+'&pkId='+pkId+'&pkFieldName=id',
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
