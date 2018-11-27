<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>联系人</title>
<style type="text/css">
    /*这行很重要!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    html,body{min-height: 100%;}
</style>
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight" style="overflow-y:auto">

	<div class="row" style="margin-left:0;width:25%;float:left;" id="TEST_GRIDBYCARD_1">
	</div>
	
	<div class="row" style="margin-left:0;width:25%;float:left;" id="TEST_GRIDBYCARD_2">
	</div>
	
	<div class="row" style="margin-left:0;width:25%;float:left;" id="TEST_GRIDBYCARD_3">
	</div>
	
	<div class="row" style="margin-left:0;width:25%;float:left;" id="TEST_GRIDBYCARD_4">
	</div>

</div>
<div class="container-fluid" style="overflow-y:hidden;padding-top:5px;">
	<div class="BTNGROUP BTNGROUP_672" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="edit1ORG_COMP_CARD"  class="btn btn-warning" value=详情 onclick="edit1ORG_COMP_CARD_click_672()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="edit2ORG_COMP_CARD"  class="btn btn-warning" value=添加证件 onclick="edit2ORG_COMP_CARD_click_672()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="introduceORG_COMP_CARD"  class="btn btn-primary" value=公司管理历史 onclick="introduceORG_COMP_CARD_click_672()"/>
		</div>
	</div>
	<table id="ORG_COMP_CARD_List">
	</table>
	<div id="activity_pane" style="position:absolute;left:500px;top:70px">
	</div>
</div>

<div class="container-fluid" style="overflow-y:hidden;padding-top:10px;width:50%;float:left">
	<div id="test_echarts_pie_chart" >
	</div>
</div>

<div class="container-fluid" style="overflow-y:hidden;padding-top:10px;width:50%">
	<div id="test_charts_line_more_chart">
	</div>
</div>

<form id="form_692" name="form_692" style="margin-bottom:50px;width:50%" >
<div class="container-fluid" style="overflow-y:auto;">
	<div class="my_card" style="margin-top:5px;">
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_id_692" name="ORGDEPARTMENTREG_id" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_depid_692" name="ORGDEPARTMENTREG_depid" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692" name="ORGDEPARTMENTREG_xtype" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP1_692" name="ORGDEPARTMENTREG_DEPGROUP1" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP2_692" name="ORGDEPARTMENTREG_DEPGROUP2" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP3_692" name="ORGDEPARTMENTREG_DEPGROUP3" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP4_692" name="ORGDEPARTMENTREG_DEPGROUP4" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_DEPGROUP5_692" name="ORGDEPARTMENTREG_DEPGROUP5" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_valid_692" name="ORGDEPARTMENTREG_valid" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_validby_692" name="ORGDEPARTMENTREG_validby" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_validtime_692" name="ORGDEPARTMENTREG_validtime" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_zuid_692" name="ORGDEPARTMENTREG_zuid" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_orgcode_692" name="ORGDEPARTMENTREG_orgcode" type="hidden" class="form-control"  style="width:200px; float:left"/><span style='color:red;line-height:35px;font-size:27px'></span>
		<div class='row cell'>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">部门编码: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_depcode_692" name="ORGDEPARTMENTREG_depcode" type="text" class="form-control"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px; float:left"/>
					<span style='color:red;line-height:35px;font-size:27px'></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">中文名称: </lable>
					<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_cname_692" name="ORGDEPARTMENTREG_cname" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/>
					<span style='color:red;line-height:35px;font-size:27px'></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">英文名称: </lable>
					<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_ename_692" name="ORGDEPARTMENTREG_ename" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/>
					<span style='color:red;line-height:35px;font-size:27px'></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">所属公司: </lable>
					<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_compid_692" title="所属公司" styleType="select" name="ORGDEPARTMENTREG_compid"  class="form-control " emptyText="请选择..."  style="width:200px;" showNullItem="true" textField="text" valueField="id" nullItemText="请选择..." dataField="data_form_21319"initParam = "_">
					</select>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">上级部门: </lable>						
					<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_parentid_692" title="上级部门" styleType="select" name="ORGDEPARTMENTREG_parentid"  class="form-control " emptyText="请选择..."  style="width:200px;" showNullItem="true" textField="text" valueField="id" DictName="" nullItemText="请选择..." dataField="data_form_21320"initParam = "_">
					</select>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">排序: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xorder_692" name="ORGDEPARTMENTREG_xorder" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px; float:left"/>
					<span style='color:red;line-height:35px;font-size:27px'></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">部门负责人: </lable><input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_director_692" name="ORGDEPARTMENTREG_director" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px; float:left"/>
					<span style='color:red;line-height:35px;font-size:27px'></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">分管领导: </lable>
					<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_leader_692" name="ORGDEPARTMENTREG_leader" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px; float:left"/>
					<span style='color:red;line-height:35px;font-size:27px'></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">人事专员: </lable>
					<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_hrspecialist_692" name="ORGDEPARTMENTREG_hrspecialist" type="text" class="form-control"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px; float:left"/>
					<span style='color:red;line-height:35px;font-size:27px'></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">生效日期: </lable>
					<div class='controls input-append date form_date1 input-group' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;margin-top:5px;width: 134px;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_validdate_692" styleType="dateTime"   style="width:134px;float:left;" name="ORGDEPARTMENTREG_validdate"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true"/>
						<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
						<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					</div>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">备注: </lable>
					<input id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_remark_692" name="ORGDEPARTMENTREG_remark" type="text" class="form-control"  vtype="illegalChar;maxLength:200;minLength:null;"  style="width:200px; float:left"/>
					<span style='color:red;line-height:35px;font-size:27px'></span>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">登记人: </lable>
					<select id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regby_692" title="登记人" styleType="select" name="ORGDEPARTMENTREG_regby"  class="form-control " emptyText="请选择..."  style="width:200px;" showNullItem="true" textField="text" valueField="id" DictName="DEPKIND" nullItemText="请选择..." dataField="data_form_21336"initParam = "_">
					</select>
				</div>
			</div>
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left">登记时间: </lable>
					<div class='controls input-append date form_date1 input-group' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;margin-top:5px;width: 134px;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_regtime_692" styleType="dateTime"   style="width:134px;float:left;" name="ORGDEPARTMENTREG_regtime"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true"/>
							<span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
							<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					</div>
				</div>
			</div>
		</div>
		<div class="BTNGROUP BTNGROUP_692" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formdept_edit_Card"  class="btn btn-success" value=保存(卡片式) onclick="save_formdept_edit_Card_click_692()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closedept_edit_Card"  class="btn btn-primary" value=关闭 onclick="closex_692()"/>
			</div>
		</div>
		<div id="activity_pane" style="position:absolute;left:500px;top:70px;">
		</div>
	</div>
</div>
</form>

<input type="hidden" name="ORGVCOMPANY_id" id="ORGVCOMPANY_id" value="C1"/>
<input type="hidden" value="查询" onclick="buildOrgPicture()"/>
<div style="height:95%;width:98%;float:left" id="chart-eChart">
</div>
<input type="hidden" name="basePath" id="basePath" value="/myehr"/>

<script>
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

var containerParam ={};
containerParam ={};


/*---卡片式列表参数数据----------------------------------------------------------------------------------------*/
var _formId_2563='2563';
var xxx;var heightGadedata =[];
function changeHeightGadedata(data){
	heightGadedata = data;
}
var filterParam = {};
var queryParams;
/*---列表参数数据----------------------------------------------------------------------------------------*/
var orgcode='';
var _formId_672='672';
/*---饼图参数数据----------------------------------------------------------------------------------------*/

/*---卡片式表单数据初始化(循环)----------------------------------------------------------------------------------------*/
$(document).ready(function () {
	loadDataStart_1();
	loadDataStart_2();
	loadDataStart_3();
	loadDataStart_4();
	querys_672();
	queryAllData();
	queryAllData_1();
	if('isView'=='undefined'){
		$('input,select,textarea').each(function(){
			$(this).attr('disabled',"true");
			$(this).css('border','none');
			if($(this).attr('styletype')=='dateTime'){
				$(this).next().css('display',"none");
				$(this).next().next().css('display',"none");
				var width = $(this).width()+90;
				$(this).css('width',width+'px');
			}
		});
		$(".BTNGROUP_692").css("display","none");
	}
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
				 format:"yyyy/mm/dd",  
				 weekStart: 1,  
				 todayBtn:  1,  
				 autoclose: 1,  
				 todayHighlight: 1,  
				 startView: 2,  
				 minView: 2,  
				 forceParse: 0,  
				 pickerPosition: "bottom-left"  
				});  
				$('.form_date5').datetimepicker({ 
				 language:  'zh-CN',  
				 format:"yyyymm",  
				 weekStart: 1,  
				 todayBtn:  1,  
				 autoclose: 1,  
				 todayHighlight: 1,  
				 startView: 3,  
				 minView: 3,  
				 forceParse: 0,  
				 pickerPosition: "bottom-left"  
				});  
				buildOrgPicture();
});
/*---卡片式表单查询条件(循环)----------------------------------------------------------------------------------------*/
function grid_TEST_GRIDBYCARD_fun_1(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_GRIDBYCARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.xxx}'==''){
		if(xxx==undefined){
			requestParam = {xxx:'${param.xxx}'};
		}else{
			requestParam = {xxx:xxx+""};
		}
	}else{
		requestParam = {xxx:'${param.xxx}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2563;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage_1*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function grid_TEST_GRIDBYCARD_fun_2(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_GRIDBYCARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.xxx}'==''){
		if(xxx==undefined){
			requestParam = {xxx:'${param.xxx}'};
		}else{
			requestParam = {xxx:xxx+""};
		}
	}else{
		requestParam = {xxx:'${param.xxx}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2563;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage_2*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function grid_TEST_GRIDBYCARD_fun_3(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_GRIDBYCARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.xxx}'==''){
		if(xxx==undefined){
			requestParam = {xxx:'${param.xxx}'};
		}else{
			requestParam = {xxx:xxx+""};
		}
	}else{
		requestParam = {xxx:'${param.xxx}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2563;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage_3*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function grid_TEST_GRIDBYCARD_fun_4(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_GRIDBYCARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.xxx}'==''){
		if(xxx==undefined){
			requestParam = {xxx:'${param.xxx}'};
		}else{
			requestParam = {xxx:xxx+""};
		}
	}else{
		requestParam = {xxx:'${param.xxx}'};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2563;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage_4*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}


/*---卡片式表单----------------------------------------------------------------------------------------*/
function grid_TEST_GRIDBYCARD_fun11_2563_1(){
	loadDataStart_1();
}
function grid_TEST_GRIDBYCARD_fun11_2563_2(){
	loadDataStart_2();
}
function grid_TEST_GRIDBYCARD_fun11_2563_3(){
	loadDataStart_3();
}
function grid_TEST_GRIDBYCARD_fun11_2563_4(){
	loadDataStart_4();
}

/*---卡片式表单----------------------------------------------------------------------------------------*/
var Currentpage_1 = 0;
var Currentpage_2 = 0;
var Currentpage_3 = 0;
var Currentpage_4 = 0;

/*---卡片式表单----------------------------------------------------------------------------------------*/
var pagesize = 10;
function animationHover(element, animation) {
    element = $(element);
    element.hover(
        function () {
           element.addClass('animated ' + animation);
        },
        function () {
            //动画完成之前移除class
            window.setTimeout(function () {
                element.removeClass('animated ' + animation);
            }, 2000);
        });
};

/*---卡片式表单----------------------------------------------------------------------------------------*/
//获取区间中的一个随机数
function rand(n, m){
    var random = Math.floor(Math.random()*(m-n+1)+n);
    return random;
};
var containerParam={};
var xx = {};
/*---卡片式表单----------------------------------------------------------------------------------------*/
function loadDataStart_1(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_TEST_GRIDBYCARD_fun_1(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
		 	 Currentpage_1++;
	        console.log(data);
	        var arr=data.rows;
	        showDate_1(arr);
	      }
	});
}
function loadDataStart_2(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_TEST_GRIDBYCARD_fun_2(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
		 	 Currentpage_2++;
	        console.log(data);
	        var arr=data.rows;
	        showDate_2(arr);
	      }
	});
}
function loadDataStart_3(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_TEST_GRIDBYCARD_fun_3(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
		 	 Currentpage_3++;
	        console.log(data);
	        var arr=data.rows;
	        showDate_3(arr);
	      }
	});
}
function loadDataStart_4(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_TEST_GRIDBYCARD_fun_4(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
		 	 Currentpage_4++;
	        console.log(data);
	        var arr=data.rows;
	        showDate_4(arr);
	      }
	});
}
/*------------------------------------------------------------------------------------*/
function queryAllData(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	$.ajax({
		url:url,
		type:'post',
		data: queryParams,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData(text.rows);
		},
	});
}
function initArrData(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPEMPLOYEE_GENDER';
	var formDefSql = 'select ORG_DEPARTMENT.depcode AS ORGDEPARTMENT_depcode,EMP_EMPLOYEE.EMPSTATUS AS EMPEMPLOYEE_EMPSTATUS, EMP_EMPLOYEE.CNAME AS EMPEMPLOYEE_CNAME,EMP_EMPLOYEE.EMPCODE AS EMPEMPLOYEE_EMPCODE,EMP_EMPLOYEE.EMPID AS EMPEMPLOYEE_EMPID, EMP_EMPLOYEE.GENDER AS EMPEMPLOYEE_GENDER  from  EMP_EMPLOYEE  join ORG_DEPARTMENT    on EMP_EMPLOYEE.DEPID =ORG_DEPARTMENT.depid';
	var url='/myehr/charts/searchChartsType.action?xColumnId=41017&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPEMPLOYEE_GENDER==datas[j].EMPEMPLOYEE_GENDER){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts(xAxisData,seriesData)
		},
	});
}
function initCharts(xAxisData,seriesData){
	   document.getElementById('test_echarts_pie_chart').style.width='500px';
	   document.getElementById('test_echarts_pie_chart').style.height='200px';
		var myChart = echarts.init(document.getElementById('test_echarts_pie_chart'));
		var options={
			tooltip : {
				trigger: 'item',
				formatter : "{a} <br/>{b}: {c} ({d}%)"
			},
			toolbox: {
				show: true,
				feature: {
					dataView: {readOnly: false},
					restore: {},
					saveAsImage: {}
				}
			},
			//定义一个标题
	       title:{
	           text:'人员选择列表'
	       },
	       legend:{
	           data:xAxisData
	       },
	       series:[
	           {
	               name:'性别',
	               type:'pie',
	               radius: ['50%', '70%'],
	               avoidLabelOverlap: false,
	               label: {
	                   normal: {
	                       show: false,
	                       position: 'center'
	                   },
	                   emphasis: {
	                       show: true,
	                       textStyle: {
	                           fontSize: '30',
	                           fontWeight: 'bold'
	                       }
	                   }
	               },
	               labelLine: {
	                   normal: {
	                       show: false
	                   }
	               },
	               data:seriesData
	           }
	       ]
	    };
	    myChart.setOption(options);
	}
	
	
function initCharts_1(xAxisData,seriesData){
	   document.getElementById('test_charts_line_more_chart').style.width='500px';
	   document.getElementById('test_charts_line_more_chart').style.height='200px';
		var myChart = echarts.init(document.getElementById('test_charts_line_more_chart'));
		var options={
			//定义柱状图颜色
			color: ['#ff0080','#0000ff'],
			tooltip : {
				trigger: 'axis',
				axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
				}
			},
			toolbox: {
				show: true,
				feature: {
					dataView: {readOnly: false},
					magicType: {type: ['line', 'bar']},
					restore: {},
					saveAsImage: {}
				}
			},
			//定义一个标题
	       title:{
	           text:'人员选择列表'
	       },
	        legend:{
	            data:['部门编码','员工状态']
	        },
	        //X轴设置
	        xAxis:{
	            data:xAxisData
	        },
	        yAxis: [
				{
					type : 'value'
				}
			],
	        series:[{
	    name: '部门编码',
	    type: 'bar',
	    data:[1,0,0]
	},{
	    name: '部门编码',
	    type: 'bar',
	    data:[0,0,1]
	},{
	    name: '部门编码',
	    type: 'bar',
	    data:[0,0,1]
	},{
	    name: '部门编码',
	    type: 'bar',
	    data:[0,0,2]
	},{
	    name: '部门编码',
	    type: 'bar',
	    data:[2,4,4]
	},{
	    name: '员工状态',
	    type: 'bar',
	    data:[1,3,2]
	},{
	    name: '员工状态',
	    type: 'bar',
	    data:[1,1,4]
	},{
	    name: '员工状态',
	    type: 'bar',
	    data:[1,0,2]
	}]
	    };
	    myChart.setOption(options);
	}
	function queryAllData_1(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		$.ajax({
			url:url,
			type:'post',
			data: queryParams,
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_1(text.rows);
			},
		});
	}
	function initArrData_1(datas){
		var xAxisData=[];
		var seriesData=[];
		var xAxisColumn = 'EMPEMPLOYEE_GENDER';
		var formDefSql = 'select ORG_DEPARTMENT.depcode AS ORGDEPARTMENT_depcode,EMP_EMPLOYEE.EMPSTATUS AS EMPEMPLOYEE_EMPSTATUS, EMP_EMPLOYEE.CNAME AS EMPEMPLOYEE_CNAME,EMP_EMPLOYEE.EMPCODE AS EMPEMPLOYEE_EMPCODE,EMP_EMPLOYEE.EMPID AS EMPEMPLOYEE_EMPID, EMP_EMPLOYEE.GENDER AS EMPEMPLOYEE_GENDER  from  EMP_EMPLOYEE  join ORG_DEPARTMENT    on EMP_EMPLOYEE.DEPID =ORG_DEPARTMENT.depid';
		var url='/myehr/charts/searchChartsType.action?xColumnId=41017&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
		$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				for(var i=0;i<text.length;i++){
					xAxisData.push(text[i].dictName);
					var flag=0;
					for(var j=0;j<datas.length;j++){
						if(text[i].EMPEMPLOYEE_GENDER==datas[j].EMPEMPLOYEE_GENDER){
							flag++;
						}
					}
					seriesData.push(flag);
				}
				initCharts_1(xAxisData,seriesData)
			},
		});
	}
	function grid_EMP_CHOSE_LIST_fun(pageReqeust){
		var _filterdata={};
		if(document.getElementById('grid_EMP_CHOSE_LIST_filter')){
		}
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam=containerParam;
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds='';
		pageReqeust.formId=_formId_91;
		pageReqeust.isView=null;
		if(heightGadedata!=null&&heightGadedata!=undefined){
			pageReqeust.heightGrade = heightGadedata;
		}
		queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
/*---卡片式表单----------------------------------------------------------------------------------------*/
function showDate_1(arr) {
	var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
	for (var i = arr.length - 1; i >= 0; i--) {
		var colorNum = i%4;
		    var cellObj = $('<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
							'        <div class="row" id="row" >'+
							'            <div class="col-xs-4">'+
							'                <span style="font-size:80;color:#ffffff;" class="fa fa-thumbs-o-up">'+
							'            </div>'+
							'            <div class="col-xs-8 text-right">'+
							'				<div><span style="font-size:40;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_china_name+'</span></div>'+
							'				<div><span style="font-size:30;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'            </div>'+
							'        </div>'+
							'    </div>'+
							'</div>');
		animationHover(cellObj, 'pulse');
		$('#TEST_GRIDBYCARD_1').append(cellObj);
	}
}
function showDate_2(arr) {
	var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
	for (var i = arr.length - 1; i >= 0; i--) {
		var colorNum = i%4;
		    var cellObj = $('<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
							'        <div class="row" id="row" >'+
							'            <div class="col-xs-4">'+
							'                <span style="font-size:80;color:#ffffff;" class="fa fa-thumbs-o-up">'+
							'            </div>'+
							'            <div class="col-xs-8 text-right">'+
							'				<div><span style="font-size:40;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_china_name+'</span></div>'+
							'				<div><span style="font-size:30;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'            </div>'+
							'        </div>'+
							'    </div>'+
							'</div>');
		animationHover(cellObj, 'pulse');
		$('#TEST_GRIDBYCARD_2').append(cellObj);
	}
}
function showDate_3(arr) {
	var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
	for (var i = arr.length - 1; i >= 0; i--) {
		var colorNum = i%4;
		    var cellObj = $('<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
							'        <div class="row" id="row" >'+
							'            <div class="col-xs-4">'+
							'                <span style="font-size:80;color:#ffffff;" class="fa fa-thumbs-o-up">'+
							'            </div>'+
							'            <div class="col-xs-8 text-right">'+
							'				<div><span style="font-size:40;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_china_name+'</span></div>'+
							'				<div><span style="font-size:30;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'            </div>'+
							'        </div>'+
							'    </div>'+
							'</div>');
		animationHover(cellObj, 'pulse');
		$('#TEST_GRIDBYCARD_3').append(cellObj);
	}
}
function showDate_4(arr) {
	var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
	for (var i = arr.length - 1; i >= 0; i--) {
		var colorNum = i%4;
		    var cellObj = $('<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
							'        <div class="row" id="row" >'+
							'            <div class="col-xs-4">'+
							'                <span style="font-size:80;color:#ffffff;" class="fa fa-thumbs-o-up">'+
							'            </div>'+
							'            <div class="col-xs-8 text-right">'+
							'				<div><span style="font-size:40;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_china_name+'</span></div>'+
							'				<div><span style="font-size:30;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
							'            </div>'+
							'        </div>'+
							'    </div>'+
							'</div>');
		animationHover(cellObj, 'pulse');
		$('#TEST_GRIDBYCARD_4').append(cellObj);
	}
}

/*-----列表-------------------------------------------------------------------------------------------------------------------------------------------*/
function querys_672() {
        $("#ORG_COMP_CARD_List").bootstrapTable({
            url :'/myehr/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:4,
            queryParams : grid_ORG_COMP_CARD_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [
            {
                field : 'state',
                checkbox : true,
                align : 'center',
                visible : true,
                valign : 'middle'
            },
            {
                title : '序号',
                field : 'defaultXH',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value=index+1;
                    }
                    return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
  {
                title : '公司ID',
                field : 'ORGCOMPANY_compid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_compid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"公司ID\">"+value+"</a>";
                }
            },
  {
                title : '公司编码',
                field : 'ORGCOMPANY_compcode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_compcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"公司编码\">"+value+"</a>";
                }
            },
  {
                title : '中文名称',
                field : 'ORGCOMPANY_cname',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_cname\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"中文名称\">"+value+"</a>";
                }
            },
  {
                title : '英文名称',
                field : 'ORGCOMPANY_ename',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_ename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"英文名称\">"+value+"</a>";
                }
            },
            {
                title : '上级公司',
                field : 'ORGCOMPANY_parentid',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_parentid\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"上级公司\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark= data_form_20726&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '公司类型',
                field : 'ORGCOMPANY_comptype',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_comptype\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司类型\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=COMPTYPE&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '公司区域',
                field : 'ORGCOMPANY_comparea',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_comparea\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司区域\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=COMPAREA&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '公司行业',
                field : 'ORGCOMPANY_comptrade',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_comptrade\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司行业\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=COMPTRADE&realValue="+value+"+\"></a>";
                }
            },

  {
                title : '预留1',
                field : 'ORGCOMPANY_orggroup1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup1\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANY_orggroup2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup2\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANY_orggroup3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup3\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留3\">"+value+"</a>";
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANY_orggroup4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup4\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留4\">"+value+"</a>";
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANY_orggroup5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orggroup5\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"预留5\">"+value+"</a>";
                }
            },
            {
                title : '成立日期',
                field : 'ORGCOMPANY_createdate',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGCOMPANY_createdate\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
            {
                title : '是否失效',
                field : 'ORGCOMPANY_isdisabled',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_isdisabled\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"是否失效\" data-source=\"/myehr/dict/searchSysDictEntryTypeCode1.action?deleteMark=att_yes_no&realValue="+value+"+\"></a>";
                }
            },

            {
                title : '失效日期',
                field : 'ORGCOMPANY_disableddate',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGCOMPANY_disableddate\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"失效日期\">"+date+"</a>";
                }
            },
  {
                title : '法人',
                field : 'ORGCOMPANY_legalperson',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_legalperson\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"法人\">"+value+"</a>";
                }
            },
  {
                title : '公司地址',
                field : 'ORGCOMPANY_orgaddress',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orgaddress\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"公司地址\">"+value+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANY_regaddress',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_regaddress\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"注册地址\">"+value+"</a>";
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANY_telphone',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_telphone\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
  {
                title : '传真',
                field : 'ORGCOMPANY_fax',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_fax\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"传真\">"+value+"</a>";
                }
            },
  {
                title : '邮编',
                field : 'ORGCOMPANY_postcode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_postcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"邮编\">"+value+"</a>";
                }
            },
  {
                title : '网站',
                field : 'ORGCOMPANY_website',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_website\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"网站\">"+value+"</a>";
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANY_xorder',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_xorder\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\">"+value+"</a>";
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANY_remark',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_remark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
            {
                title : '最近修改日期',
                field : 'ORGCOMPANY_updatetime',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGCOMPANY_updatetime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"最近修改日期\">"+date+"</a>";
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANY_zuid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_zuid\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"租户ID\">"+value+"</a>";
                }
            },
  {
                title : '组织码',
                field : 'ORGCOMPANY_orgcode',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orgcode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#ORG_COMP_CARD_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
        	editORG_COMP_CARD_click_672('isView',row);  
         } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
	}
	
var filterParam = {};
var queryParams;
function grid_ORG_COMP_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_ORG_COMP_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if(''==''){
		if(orgcode==undefined){
			requestParam = {orgcode:''};
		}else{
			requestParam = {orgcode:orgcode+""};
		}
	}else{
		requestParam = {orgcode:''};
	}
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='';
	pageReqeust.formId=_formId_672;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function edit1ORG_COMP_CARD_click_672(isView,data){
	var selects = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='公司详情';
	}else if(data!=null&&isView!=null){
	select = data;
	title='预览';
	}else {
		alert('请选择一行数据');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=673&isInit=true&ORGCOMPANY_compid='+select.ORGCOMPANY_compid+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=673&isInit=true&ORGCOMPANY_compid='+ORGCOMPANY_compid+'&isView='+isView+'';
	}
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
			    refresh_ORG_COMP_CARD();
		}
	});
}
function edit2ORG_COMP_CARD_click_672(isView,data){
	var selects = $("#ORG_COMP_CARD_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='公司证件';
	}else if(data!=null&&isView!=null){
	select = data;
	title='预览';
	}else {
		alert('请选择一行数据');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=674&isInit=true&ORGCOMPANY_compid='+select.ORGCOMPANY_compid+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=674&isInit=true&ORGCOMPANY_compid='+ORGCOMPANY_compid+'&isView='+isView+'';
	}
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
			    refresh_ORG_COMP_CARD();
		}
	});
}
//引入按钮处理函数
	function introduceORG_COMP_CARD_click_672(){
		layer.open({
			type:2,
			content:"/myehr/form/toForm.action?formId=675&intrToId=672&intrButtonId=1713",
			shadeClose: true,
			maxmin:true,
			shade: 0.8,
			zIndex:9999,
			title:"引入公司管理历史列表" ,
			area: ['1000', '500'],
			success:function(layero,index){ 
			$('.layui-layer-max').click();
			},
			end:function(){
				refresh_ORG_COMP_CARD();
			}
		 }); 
	}
/*-----卡片-------------------------------------------------------------------------------------------------------------------------------------------*/
function getdata_692(buttonId,formId){
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
		  if(value!=null){
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
		    var mh2=value.lastIndexOf(":");
		    var ss=value.substr(parseInt(mh2)+1);
		    if(type == 1){
			        return year+"-"+month+"-"+day;
		    }else if(type == 2){
			        return year+"-"+month+"-"+day+" "+hh+":"+mm;
		    }else if(type == 3){
			        return hh+":"+mm;
		    }else if(type == 4){
			        return year+"/"+month+"/"+day;
		    }else if(type == 5){
			        return year+month;
		    }
		  }
	}
function _initParamCard(){
}
var containerParam={};
	var _formId_692='692';
	window.onload=function(){
	var classes = [];
		if(''=='APP'){
			$("input").each(function(){
				if($(this).attr('dataField') != undefined){
					classes.push($(this)[0]);
				}
			})
		}else{
			classes = $("select");
		}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField,containerParam);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}

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
}else{
		document.getElementById("ORG_DEPARTMENT_REG.ORGDEPARTMENTREG_xtype_692").value=value
}
;

		_initData(null);
	}

	function save_formdept_edit_Card_click_692(){
		var paramsMap = {};

		var _param = {};
		_param.formId=_formId_692;
		_param.buttonId=1758;
		_param = getdata_692(_param.buttonId,_formId_692);
		_param.paramsMap = paramsMap
		if(checkNull("#form_692")){
		}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
			if(text[0]=='000000' || text[1]=='保存成功'){
				alert("操作成功！");
				closex_692()
			}else if(text[0]=='error'){
			    if(text.length>1 &&text[0]=='error'){
					alert(text[1]);
			    }else{
					alert("操作异常");
			    }
			}else {
				alert("保存失败");
			}
			}
		});
		}
	}
	function checkNull(id){
		var xxx = "";
		var flag = false;
		$(id).find("input,select").each(function(){
			if($(this).attr('required')!=undefined&&$(this).attr('required')=='required'){
				if($(this).val()==""){
					$(this).css('border-color','red');
					$(this).attr("placeholder","此项不能为空");
					flag = true;
				}else{
					$(this).css('border-color','#000');
				}
			}
			var bb=$(this).val();
			var vtype=$(this).attr('vtype');
			var vtypes= new Array();
			if(vtype!=null&&vtype!=undefined){
				vtypes=vtype.split(";");
				var re=new RegExp("[^?!@#$%\^&*()]+$");
				var errorText = "包含非法字符";
				if (bb !="" && bb!=null) {
					if(vtypes[0].indexOf("letter")==0){
						re = new RegExp("^[a-zA-Z\_]+$");//自定义英文
						errorText = "请输入正确的英文";
					}
					if(vtypes[0].indexOf("zh")==0){
						re = new RegExp("^[\u4e00-\u9fa5]+$");//自定义中文
						errorText = "请输入正确的中文";
					}
					if(vtypes[0].indexOf("chinaMobile")==0){
						re = /1\d{10}/;//自定义手机号码
						errorText = "请输入正确的手机号码";
					}
					if(vtypes[0].indexOf("chinaZipcode")==0){
						re = /[1-9]{1}(\d+){5}/;//自定义邮政编码
						errorText = "请输入正确的英文";
					}
					if(vtypes[0].indexOf("chinaIDNo")==0){
						re = /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;//自定义身份证号码
						errorText = "请输入正确的身份证号码";
					}
					if(vtypes[0].indexOf("email")==0){
						re = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;//自定义邮箱
						errorText = "请输入正确的邮箱";
					}
					if (re.test(bb)) {
					}else{
						$(this).val('');
						$(this).css('border-color','red');
						$(this).attr("placeholder",errorText);
						flag = true
					}
				}
			}
		})
		return flag;
	}
	function _initData(pkId){
		var _param = {};
		if(pkId){
			if(''!=null && ''!=''){
				_param = {requestParam:{ORGDEPARTMENTREG_id:'17'},pkId:pkId,formId:_formId_692};
			}else{;
				_param = {pkId:pkId,formId:_formId_692};
			}
		}else {
			if(''!=null && ''!=''){
				_param = {requestParam:{id:''},pkId:pkId,formId:_formId_692};
			}else{;
				_param = {requestParam:{ORGDEPARTMENTREG_id:'17'},pkId:pkId,formId:_formId_692};
			}
		}
		_param.containerParam = containerParam;
		var _form = getForm("#form_692");
		var _Type = getType("#form_692");
		$.ajax({
			url:'/myehr/form/cardformInitData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text.rows&&text.rows.length>0){
						 var object = text.rows[0];
						 for(var key in object){
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
										}else{
												document.getElementById(_form[key]).value=object[key];
										}
								}
						}
						;
					
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();}
				} else {
					_initAfter();
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
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
	//关闭
	function closex_692(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
	function getForm(formId){
					var object=[];
						$(formId).find("input").each(function(){
								var xxx = this.id.split(".")[1];
								if(xxx!=undefined){
									var xx = xxx.split("_");
									var arr = [];
									var id = "";
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
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
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
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
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
											id = id+xx[i]+"_";
										}else{
											id = id+xx[i];
										}
									}
								object[id]="dateTime";
							}
							})
				$(formId).find("select").each(function(){
					var vtype = $(this).attr('class')
					var xxx = this.id.split(".")[1];
					if(xxx!=undefined&&vtype.indexOf("selectpicker")!=-1){
						if($(this).attr('multiSelect')=="true"){
							var xx = xxx.split("_");
							var arr = [];
							var id = "";
							for(var i=0;i<xx.length-1;i++){
								if(i<xx.length-2){
									id = id+xx[i]+"_";
								}else{
									id = id+xx[i];
								}
							}
							object[id]="mupick";
						}else{
							var xx = xxx.split("_");
							var arr = [];
							var id = "";
							for(var i=0;i<xx.length-1;i++){
								if(i<xx.length-2){
									id = id+xx[i]+"_";
								}else{
									id = id+xx[i];
								}
							}
							object[id]="search";
						}
					}
				})
						return object;
			}
/*-----------------------------------------------------------------------------------------*/
 function initExecSqlFun(){
var paramsMap = { ORGVCOMPANY_id:'C1'};
var _param = {};
_param.formId=2545;
_param.paramsMap = paramsMap
$.ajax({
	url:'/myehr/form/initExecSql.action',
	type:'post',
	data: JSON.stringify(_param),
	cache: false,
	contentType: 'application/json;charset=utf-8',
	success: function (text) {
	    buildOrgPicture();
	}
});
}
function buildOrgPicture(){
     var ORGVCOMPANY_id = document.getElementById("ORGVCOMPANY_id").value;
    var basePath = document.getElementById("basePath").value;
    $.ajax({
        url: basePath+"/org/searchTreeData.action?formId=2545&treeSolutionId="+28 +"&ORGVCOMPANY_id="+ORGVCOMPANY_id,
        type: 'POST',
        cache: false,
        contentType: 'application/json;charset=utf-8',
        success: function(mydata) {
        	  initCharts_2(mydata);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });
}

function initCharts_2(mydata){
    var datascource =mydata;
    var myChart = echarts.init(document.getElementById('chart-eChart'));
    var series = {
        type: 'tree',
        name: '行政架构图',
        data: [datascource],
        top: '5%',
        left: '7%',
        bottom: '2%',
        right: '60%',
        symbolSize: 7,
        label: {
            normal: {
                position: 'left',
                verticalAlign: 'middle',
                align: 'right'
            }
        },
        leaves: {
            label: {
                normal: {
                    position: 'right',
                    verticalAlign: 'middle',
                    align: 'left'
                }
            }
        },
        expandAndCollapse: true,
        animationDuration: 550,
        animationDurationUpdate: 750
     },
    options = {
     	tooltip: {
	        trigger: 'item',
	        triggerOn: 'mousemove'
	    },
	    toolbox: {
	    	show: true,
	    	feature: {
	    		restore: {},
	    		saveAsImage: {}
	    	}
	    },
	    legend: {
	        top: '2%',
	        left: '3%',
	        orient: 'vertical',
	        data: [{
	            name: '行政架构图',
	            icon: 'rectangle'
	        } ,
	        {
	            name: 'tree2',
	            icon: 'rectangle'
	        }],
	        borderColor: '#c23531'
	    },
	    series:[series]
	}
	myChart.setOption(options);
}

</script>
</body>
</html>