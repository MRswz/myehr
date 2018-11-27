<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontestForDrag.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%
	HttpSession s = request.getSession();
	String userName=(String)session.getAttribute("userName");
	String userCode=(String)session.getAttribute("userCode");
	String softwareTitle=(String)session.getAttribute("softwareTitle");
	String empid=session.getAttribute("empid")+"";
	String userId=session.getAttribute("userid")+"";
%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type="text/javascript" src="../../js/testInfo_116.js"></script>
<style type="text/css">
    /*这行很重要!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    html,body{min-height: 100%;}
.kuangClass{border-radius: 10px;}

.bubbly-button {
  font-family: 'Helvetica', 'Arial', sans-serif;
  display: inline-block;
  font-size: 1em;
  padding: 1em 2em;
  margin-top: 10px;
  margin-bottom: 10px;
  margin-right:20px;
  -webkit-appearance: none;
  appearance: none;
  background-color: #ff0081;
  color: #fff;
  border-radius: 4px;
  border: none;
  cursor: pointer;
  position: relative;
  transition: transform ease-in 0.1s, box-shadow ease-in 0.25s;
  box-shadow: 0 2px 25px rgba(255, 0, 130, 0.5);
}

.bubbly-button:focus {
  outline: 0;
}
.bubbly-button:before, .bubbly-button:after {
  position: absolute;
  content: '';
  display: block;
  width: 140%;
  height: 100%;
  left: -20%;
  z-index: -1000;
  transition: all ease-in-out 0.5s;
  background-repeat: no-repeat;
}
.bubbly-button:before {
  display: none;
  top: -75%;
  background-image: radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, transparent 20%, #ff0081 20%, transparent 30%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, transparent 10%, #ff0081 15%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%);
  background-size: 10% 10%, 20% 20%, 15% 15%, 20% 20%, 18% 18%, 10% 10%, 15% 15%, 10% 10%, 18% 18%;
}
.bubbly-button:after {
  display: none;
  bottom: -75%;
  background-image: radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, transparent 10%, #ff0081 15%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%), radial-gradient(circle, #ff0081 20%, transparent 20%);
  background-size: 15% 15%, 20% 20%, 18% 18%, 20% 20%, 15% 15%, 10% 10%, 20% 20%;
}
.bubbly-button:active {
  transform: scale(0.9);
  background-color: #e60074;
  box-shadow: 0 2px 25px rgba(255, 0, 130, 0.2);
}
.bubbly-button.animate:before {
  display: block;
  animation: topBubbles ease-in-out 0.75s forwards;
}
.bubbly-button.animate:after {
  display: block;
  animation: bottomBubbles ease-in-out 0.75s forwards;
}

@keyframes topBubbles {
  0% {
    background-position: 5% 90%, 10% 90%, 10% 90%, 15% 90%, 25% 90%, 25% 90%, 40% 90%, 55% 90%, 70% 90%;
  }
  50% {
    background-position: 0% 80%, 0% 20%, 10% 40%, 20% 0%, 30% 30%, 22% 50%, 50% 50%, 65% 20%, 90% 30%;
  }
  100% {
    background-position: 0% 70%, 0% 10%, 10% 30%, 20% -10%, 30% 20%, 22% 40%, 50% 40%, 65% 10%, 90% 20%;
    background-size: 0% 0%, 0% 0%,  0% 0%,  0% 0%,  0% 0%,  0% 0%;
  }
}
@keyframes bottomBubbles {
  0% {
    background-position: 10% -10%, 30% 10%, 55% -10%, 70% -10%, 85% -10%, 70% -10%, 70% 0%;
  }
  50% {
    background-position: 0% 80%, 20% 80%, 45% 60%, 60% 100%, 75% 70%, 95% 60%, 105% 0%;
  }
  100% {
    background-position: 0% 90%, 20% 90%, 45% 70%, 60% 110%, 75% 80%, 95% 70%, 110% 10%;
    background-size: 0% 0%, 0% 0%,  0% 0%,  0% 0%,  0% 0%,  0% 0%;
  }
}
.bubbly-button-color1{
	background-color: #ff0081;
}
.bubbly-button-color2{
	background-color: #660099;
}
.bubbly-button-color3{
	background-color: #9933FF;
}
.bubbly-button-color4{
	background-color: #00FF00;
}
.bubbly-button-color0{
	background-color: #3366FF;
}
.widget{
	margin-top:0px;
	padding:5px 20px;
}
.fixed-table-body{
	height:125px;
}
.searchClass{margin: 7px 0;padding:0;}
.label{margin-right:2px}
.bootstrap-select:not([class*="col-"]):not([class*="form-control"]):not(.input-group-btn){width:160px;margin:0 0 0 5px;}
</style>
</head>
<body class="gray-bg">
<div class="container-fluid">
	<div class="row" style="margin-left:0;position:relative" id="TEST_INFO_FORM">
		<div class="col-md-6 col-sm-6 col-lg-6">
			<div class="row" style="margin-left:0;height:180px;"  id="EMP_V_EMPBASIC_list">
				
			</div>
			<h4 style="font-weight:700;text-align:center;">人员检索</h4>
			<div class="row" style="background-color:#FFF;margin:10px 0px 0 15px;border-radius:10px;height:130px;padding:0 0 0 20px"  id="EmpIndex">
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">姓名/工号</label>                        
						<input id="EMPCODE" name="EMPCODE" placeholder="姓名,工号" style="width:160px;height:29px;margin:0 0 0 5px;" title="姓名/工号" type="text" class="form-control">
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">部&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp门</label>                        
						<select id="DEPID" title="部门" name="DEPID"  columnId="87660" onchange="linkage()" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql9" dataField1 = "sql"  nullItemText="" dataField="data_form_46781" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">岗&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp位</label>                      
						<select id="JOBID" title="岗位" name="JOBID"  columnId="87661" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql46" dataField1 = "sql"  nullItemText="" dataField="data_form_46781" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">员工类别</label>                      
						<select id="EMPTYPE" title="员工类别" name="EMPTYPE"  columnId="87664" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="EMP_EMPTYPE" dataField1 = "dict"  nullItemText="" dataField="data_form_46781" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				 <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">学&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp历</label>                      
						<select id="MAXEDUCATIO" title="学历" name="MAXEDUCATIO"  columnId="87730" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="emp_EDUTYPE" dataField1 = "dict"  nullItemText="" dataField="data_form_46781" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				 <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">籍&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp贯</label>                      
						<select id="OGIGIN" title="籍贯" name="OGIGIN"  columnId="87691" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql68" dataField1 = "sql"  nullItemText="" dataField="data_form_46781" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">性&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp别</label>                      
						<select id="GENDER" title="性别" name="GENDER"  columnId="87694" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="emp_SEX" dataField1 = "dict"  nullItemText="" dataField="data_form_46781" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<input style="float:left;height:29px" value="查询" type="button" class="btn btn-primary" onclick="searchEmpInfo()"/>                    
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6 col-sm-6 col-lg-6 kuangClass" style="padding-left:0px">
			<div class="row" style="margin-left:0;height:175px;background-color:#FFF;margin-right: 10px;border-radius:10px;position:relative"  id="">
				<h4 style="font-weight:700;text-align:center;">人事政策</h4><input class="form-control" type="text" style="width:200px;position:absolute;top:10px;right:20px;" placeholder="标题" id="ANNOUNCEMENT_TITLE" onchange="loaddata()"/>
				<div class="col-md-12 col-sm-12 col-lg-12 " style="overflow:auto;padding:0 10px 10px 10px">
					<ul id="content" style="height:110px;overflow-y:hidden;margin-left:140px">
					</ul>
					<input type="button"class="btn btn-primary" style="position:absolute;bottom:10px;right:35px" onclick="showNews()" value="更多"/>
				</div>
			<h4 style="font-weight:700;text-align:center;">流程管理</h4>
			<div class="row" style="margin:15 -5px 0 -15;height:150px;position:relative"  id="knobManage">
			</div>
		</div>
		<div style="display:none">
		<table id="waitActList" style="display:none">
		</table>
		<table id="overActList" style="display:none">
		</table>
		</div>
	</div>

	<div class="row" style="padding:0 12px">
		<h4 style="font-weight:700;text-align:center">提醒</h4>
		<div class="col-md-3 col-sm-3 col-lg-3">
			<div class="box-content" id="4795">
				<table id="emp_depcount_List">
				</table>
				<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
				<div class="row" style="margin-left:0" id="TJ_COUNTEMP_LIST">
				</div>
			</div>
		</div>
		<div class="col-md-3 col-sm-3 col-lg-3">
			<div class="box-content" id="4797">
				<table id="emp_compcount_List">
				</table>
				<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
				<div class="row" style="margin-left:0" id="TJ_NEWJOIN_LIST">
				</div>
			</div>
		</div>
		<div class="col-md-3 col-sm-3 col-lg-3">
			<div class="box-content" id="4796">
				<table id="emp_newemp_List">
				</table>
				<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
				<div class="row" style="margin-left:0" id="TJ_V_EMPDEPCOUNT_LIST">
				</div>
			</div>
		</div>
		<div class="col-md-3 col-sm-3 col-lg-3">
			<div class="box-content" id="4799">
				<table id="emp_newlizhi_List">
				</table>
				<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
				<div class="row" style="margin-left:0" id="TJ_LEAVEDATE_LIST">
				</div>
			</div>
		</div>
	</div>
	<div style="position:relative;height:800px">
		<span class="fa fa-angle-left" id="prev" onclick="changeshowPieForm('prev')" style="position:absolute;left:10px;top:50%;font-size:60px;display:none;font-weight:900"></span>
		<span class="fa fa-angle-right" id="next" onclick="changeshowPieForm('next')" style="position:absolute;right:10px;top:50%;font-size:60px;font-weight:900"></span>
		<div style="width:100%;height:450px;overflow-y:hidden;margin-bottom:20px">
			<div class="row-fluid TUpage TUpage1" style="padding:0 27px;height:450px;margin-bottom:20px">
				<div class="span6">
					<div class="box-content" id="4769">
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div id="comp_sds_chart" style="width:100%;height:450px;"></div>
					</div>
				</div>
				<div class="span6">
					<div class="box-content" id="4805">
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div id="TJ_V_ORIGINEMP_zhutu_chart" style="width:100%;height:450px;"></div>
					</div>
				</div>
			</div>
			<div class="row-fluid TUpage TUpage2" style="padding:0 27px;height:450px;margin-bottom:20px">
				<div class="span4">
					<div class="box-content" id="4770">
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div id="TJ_V_JOBORDER_sex_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
				<div class="span4" style="display:inline-block">
					<div class="box-content" id="4772">
						<div id="TJ_V_JOBORDER_TITLETA_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
				
				<div class="span4" style="display:inline-block">
					<div class="box-content" id="4768">
						<div id="TJ_V_JOBORDER_XUETU_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
			</div>
		</div>
		
		<div style="width:100%;height:400px;overflow-y:hidden">
			<div class="row-fluid TUpage TUpage1" style="padding:0 27px;height:450px">
				<div class="span4" style="display:inline-block">
					<div class="box-content" id="4762">
						<div id="EMP_V_WORKYEARS_TU_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
				<div class="span4" style="display:inline-block">
					<div class="box-content" id="4773">
						<div id="YEAROLDS_BI_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
				<div class="span4" style="display:inline-block">
					<div class="box-content" id="4774">
						<div id="EMP_POLITICALSTATUS_TU_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
			</div>
			<div class="row-fluid TUpage TUpage2" style="padding:0 27px;height:450px">
				<div class="span4" style="display:inline-block">
					<div class="box-content" id="4766">
						<div id="TJ_V_JOBORDER_TU_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
				<div class="span4" style="display:inline-block">
					<div class="box-content" id="4809">
						<div id="EMP_V_EMPLOYEE_TU1_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
				<div class="span4" style="display:inline-block">
					<div class="box-content" id="4810">
						<div id="EMP_V_EMPLOYEE_TU2_chart" style="width:100%;height:450px;margin-bottom:10px"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
<script>

$(function() {

loadDataStart();

getEmpPhotoSYS();
showDate_KNOB();
loadDataStart_4795();
loadDataStart_4796();
loadDataStart_4797();
loadDataStart_4799();
cardSelectInitFunctionx("");
cardDateWidInitFunction();
loaddata();//制度
});

window.onload=function(){ 
       //setTimeout('getTest()',1000); 
    
	initActMenu();
	queryAllData_4769();
	queryAllData_4805();
	queryAllData_4762();
	queryAllData_4766();
	queryAllData_4774();
	queryAllData_4773();
	queryAllData_4768();
	queryAllData_4770();
	queryAllData_4772();
	queryAllData_4810();
	queryAllData_4809();
} 

var _formId_4434='4434';
var _formId_4438='4438';
var _formId_4444='4444';


var filterParam = {};
var queryParams;
function grid_TEST_INFO_FORM_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_INFO_FORM_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3862;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId='4450';
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage_3862*pagesize_3862;
	pageReqeust.limit=pagesize_3862;
	if(heightGadedata_3862!=null&&heightGadedata_3862!=undefined){
		pageReqeust.heightGrade = heightGadedata_3862;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TEST_INFO_FORM_fun11_3862(){
	loadDataStart();
}
function getEmpPhotoSYS(){
	var objs = $("#Employee_Photo_WT");
	if(objs.length>0){
		$.ajax({ 
			   url:'/myehr/FileList/getEmpPhotoSYS.action?EMPID=<%=empid%>',
			   type:'post',
			   cache: false,
			   async: false, 
			   success: function (data){ 
				   $("#Employee_Photo_WT").attr("src",data[0]);
			   }
		   });
	}
}
var containerParam_3862={};
var xx = {};
var main_Datas = [];

function loadDataStart(){
	$.ajax({
		url: "/myehr/form/cardformInitData.action",
		type: 'post',
		data:grid_EMP_V_EMPBASIC_list_fun(xx),//HTTP请求类型
		contentType: 'application/json;charset=utf-8',
		cache: false,
		async: false,
		success: function (data) {
			Currentpage_3862++;
			console.log(data);
			var arr=data.rows;
			main_Datas=data.rows;
			showDate_4794(arr);
		  }
	});
}
function showDate_474(arr) {
	for (var i = arr.length - 1,j=0; i >= 0; i--,j++) {
		var TESTINFOR_china_name = arr[i].TESTINFOR_CHINA_NAME;
		if(arr[i].TESTINFOR_CHINA_NAME==null){
			 TESTINFOR_china_name = '';
		}
		var TESTINFOR_eng_name = arr[i].TESTINFOR_ENG_NAME;
		if(arr[i].TESTINFOR_ENG_NAME==null){
			 TESTINFOR_eng_name = '';
		}
		var TESTINFOR_zhuzhi = arr[i].TESTINFOR_ZHUZHI;
		if(arr[i].TESTINFOR_ZHUZHI==null){
			 TESTINFOR_zhuzhi = '';
		}
		var TESTINFOR_xuli = arr[i].TESTINFOR_XULI;
		if(arr[i].TESTINFOR_XULI==null){
			 TESTINFOR_xuli = '';
		}
		var TESTINFOR_biyeyuanxiao = arr[i].TESTINFOR_BIYEYUANXIAO;
		if(arr[i].TESTINFOR_BIYEYUANXIAO==null){
			 TESTINFOR_biyeyuanxiao = '';
		}
		var TESTINFOR_ruxueshijian = arr[i].TESTINFOR_RUXUESHIJIAN;
		if(arr[i].TESTINFOR_RUXUESHIJIAN!=null){
			 TESTINFOR_ruxueshijian = new Date(TESTINFOR_ruxueshijian).Format("yyyy/MM/dd");
		}
		var TESTINFOR_biyeshijian = arr[i].TESTINFOR_BIYESHIJIAN;
		if(arr[i].TESTINFOR_BIYESHIJIAN==null){
			 TESTINFOR_biyeshijian = '';
		}
		var TESTINFOR_gongsi = arr[i].TESTINFOR_GONGSI;
		if(arr[i].TESTINFOR_GONGSI==null){
			 TESTINFOR_gongsi = '';
		}
		var TESTINFOR_bumen = arr[i].TESTINFOR_BUMEN;
		if(arr[i].TESTINFOR_BUMEN==null){
			 TESTINFOR_bumen = '';
		}

		var carousel_indicators = '';
		if(j==0){
			carousel_indicators = $(
				'<li data-target="#myCarousel" data-slide-to="0" class="active"></li>'
			);
		}else{
			carousel_indicators = $(
				'<li data-target="#myCarousel" data-slide-to="'+j+'" ></li>'
			);
		}
		$('.carousel-indicators').append(carousel_indicators);
		
		var carousel_inner = '';
		if(j==0){
			carousel_inner = $(
				'<div class="item active">'+
				'	<a href="#">'+
				'		<img  style="margin:0 auto" src="http://116.62.243.28:9875/'+arr[i].TESTINFOR_ZHAOPIAN+'" alt="'+arr[i].TESTINFOR_CHINA_NAME+'">'+
				'		<div class="carousel-caption">'+arr[i].TESTINFOR_CHINA_NAME+'</div>'+
				'	</a>'+
				'</div>'
			);
		}else{
			carousel_inner = $(
				'<div class="item" >'+
				'	<a href="#">'+
				'		<img  style="margin:0 auto" src="http://116.62.243.28:9875/'+arr[i].TESTINFOR_ZHAOPIAN+'" alt="'+arr[i].TESTINFOR_CHINA_NAME+'">'+
				'		<div class="carousel-caption">'+arr[i].TESTINFOR_CHINA_NAME+'</div>'+
				'	</a>'+
				'</div>'
			);
		}
		
		$('.carousel-inner').append(carousel_inner);
		
	}
}
	
//初始化流程菜单	
	var ActMenuData;
	function initActMenu(){
		$.ajax({
			url: "/myehr/act/model/searchActModelList.action",
			type: 'post',
			data:grid_act_list_fun(),//HTTP请求类型
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				var arr=data.rows;
				ActMenuData=data.rows;
				showActMenu(arr);
			  }
		});
	}
	function showActMenu(e){
		var num = 0;
		for(var i=0;i<e.length;i++){
			num = i%4;
			var cellObj = $(
				'<button class="bubbly-button bubbly-button-color0 actMenu" onclick="startProcess(this)" formId="'+e[i].actNodeFormId+'" actId="'+e[i].id+'" actKey="'+e[i].key_+'" title="'+e[i].name+'">'+e[i].name+'</button>');
			$('#actMenu').append(cellObj);
		}
		var animateButton = function(e) {
		  e.preventDefault;
		  //reset animation
		  e.target.classList.remove('animate');
		  
		  e.target.classList.add('animate');
		  setTimeout(function(){
			e.target.classList.remove('animate');
		  },700);
		};

		var classname = document.getElementsByClassName("bubbly-button");

		for (var i = 0; i < classname.length; i++) {
		  classname[i].addEventListener('click', animateButton, false);
		}
	}
	//发起,待批
	function grid_act_list_fun(){
		var pageReqeust = {};
		var _filterdata={};
		_filterdata={searchValue:''};
		var userId = '<%=userId%>';
		var paramsMap = {userId:userId};
		var requestParam={};
		requestParam = {flowType:'7'};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.formId=1111;
		pageReqeust.isView=null;
		pageReqeust.limit = '1000';
		pageReqeust.offset = '0';
		return JSON.stringify(pageReqeust);
	}
	
//发起流程
function startProcess(e){
	var formId = $(e).attr("formId");
	var id = $(e).attr("actId");
	var key = $(e).attr("actKey");
	var title = $(e).attr("title");
	var businessId = selectBussinessIdByFormId(formId);
	var url='/myehr/form/toForm.action?formId='+formId+'&businessId='+businessId+'&id='+id+'&key='+key+'&flowAction=start';
	var title = title;
	parent.layer.open({
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
		}
	});
}
//获取流程任务号
function selectBussinessIdByFormId(formId){
	var dataId = '';
	$.ajax({  
		url: '/myehr/form/selectBussinessIdByFormId.action?formId='+formId,  
		type: 'POST', 
		cache: false,
	    async: false,		
		success: function (data) {  
			dataId = data;
		}
	});
	return dataId;
}



function grid_waitActList_fun(pageReqeust){
	var _filterdata={};
	var searchValue = '';
	_filterdata={searchValue:searchValue};
	var userId = '<%=userId%>';
	var paramsMap = {userId:userId,flowCode:'7'};
	var requestParam={};
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=1111;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_waitActList_fun1(){
	$('#waitActList').bootstrapTable('refresh');
}
function grid_overActList_fun(pageReqeust){
	var _filterdata={};
	var searchValue = '';
	_filterdata={searchValue:searchValue};
	var userId = '<%=userId%>';
	var paramsMap = {userId:userId,flowCode:'1'};
	var requestParam={};
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=1111;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_overActList_fun1(){
	$('#overActList').bootstrapTable('refresh');
}

//登陆者信息
var _formId_4667='4667';
var realFormId='4667';
var EMPID;var heightGadedata_4667 =[];
var containerParam_4667 ={};
containerParam_4667 ={};
function changeHeightGadedata_4667(data){
	heightGadedata_4667 = data;
}
var filterParam = {};
var queryParams;

function grid_emp_employee_gridbycard_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_employee_gridbycard_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if(''==''&&'session'=='parameter'){
		if(EMPID==undefined){
			requestParam = {EMPID:''};
		}else{
			requestParam = {};
		}
	}else{
		requestParam = {EMPID:'1'};
	}
	pageReqeust.containerParam=containerParam_4667;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId='4450';
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage_4667*pagesize_4667;
	pageReqeust.limit=pagesize_4667;
	if(heightGadedata_4667!=null&&heightGadedata_4667!=undefined){
		pageReqeust.heightGrade = heightGadedata_4667;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_employee_gridbycard_fun11_4667(){
	loadDataStart();
}
//当前页和一次显示多少条数据
var Currentpage_4794 = 0;
var pagesize_4794 = 8;
var Currentpage_3862 = 0;
var pagesize_3862 = 8;

var containerParam_4667={};
var xx = {};
var main_Datas = [];
function loadDataStart_4667(){
	$.ajax({
		url: "/myehr/form/cardformInitData.action",
		type: 'post',
		data:grid_emp_employee_gridbycard_fun(xx),//HTTP请求类型
		contentType: 'application/json;charset=utf-8',
		cache: false,
		async: false,
		success: function (data) {
			Currentpage_4667++;
			console.log(data);
			var arr=data.rows;
			main_Datas=data.rows;
			showDate_4667(arr);
		  }
	});
}
function showDate_4794(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
		var EMPVEMPBASIC_CNAME = arr[i].EMPVEMPBASIC_CNAME;
		if(arr[i].EMPVEMPBASIC_CNAME==null){
			 EMPVEMPBASIC_CNAME = '';
		}
		var EMPVEMPBASIC_COMPID = arr[i].EMPVEMPBASIC_COMPID;
		if(arr[i].EMPVEMPBASIC_COMPID==null){
			 EMPVEMPBASIC_COMPID = '';
		}
		var EMPVEMPBASIC_DEPID = arr[i].EMPVEMPBASIC_DEPID;
		if(arr[i].EMPVEMPBASIC_DEPID==null){
			 EMPVEMPBASIC_DEPID = '';
		}
		var EMPVEMPBASIC_JOBID = arr[i].EMPVEMPBASIC_JOBID;
		if(arr[i].EMPVEMPBASIC_JOBID==null){
			 EMPVEMPBASIC_JOBID = '';
		}
		var EMPVEMPBASIC_GENDER = arr[i].EMPVEMPBASIC_GENDER;
		if(arr[i].EMPVEMPBASIC_GENDER==null){
			 EMPVEMPBASIC_GENDER = '';
		}
		var EMPVEMPBASIC_BIRTHDAY = arr[i].EMPVEMPBASIC_BIRTHDAY;
		if(arr[i].EMPVEMPBASIC_BIRTHDAY!=null){
			 EMPVEMPBASIC_BIRTHDAY = new Date(EMPVEMPBASIC_BIRTHDAY).Format("yyyy-MM-dd");
		}
		var EMPVEMPBASIC_WORKEMAIL = arr[i].EMPVEMPBASIC_WORKEMAIL;
		if(arr[i].EMPVEMPBASIC_WORKEMAIL==null){
			 EMPVEMPBASIC_WORKEMAIL = '';
		}
		var EMPVEMPBASIC_MOBILE = arr[i].EMPVEMPBASIC_MOBILE;
		if(arr[i].EMPVEMPBASIC_MOBILE==null){
			 EMPVEMPBASIC_MOBILE = '';
		}
			var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
				'    <div class="contact-box" style="border-radius:10px;margin-bottom:10px;max-height: 180px;">'+
				'            <div class="col-sm-4">'+
				'                <div class="text-center">'+
				'                    <img width="100" style="margin:0 auto" alt="image" id="Employee_Photo_WT" class="img-circle m-t-xs img-responsive" >'+
				'                    <div class="m-t-xs font-bold" ></div>'+
				'                </div>'+
				'            </div>'+
				'            <div class="col-sm-8">'+
				'                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+EMPVEMPBASIC_CNAME+'"><strong>'+EMPVEMPBASIC_CNAME+'</strong></h3>'+
				'                <div class="row" id="row" style="width:500px">'+
				 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
				 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
				 '						<label style="float:left;font-size:12px">机构:'+ EMPVEMPBASIC_COMPID +' </label>'+
				 '					</div>'+
				 '				</div>'+
				 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
				 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
				 '						<label style="float:left;font-size:12px">部门:'+ EMPVEMPBASIC_DEPID +' </label>'+
				 '					</div>'+
				 '				</div>'+
				 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
				 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
				 '						<label style="float:left;font-size:12px">岗位:'+ EMPVEMPBASIC_JOBID +' </label>'+
				 '					</div>'+
				 '				</div>'+
				 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
				 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
				 '						<label style="float:left;font-size:12px">性别:'+ EMPVEMPBASIC_GENDER +' </label>'+
				 '					</div>'+
				 '				</div>'+
				 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
				 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
				 '						<label style="float:left;font-size:12px">出生日期:'+ EMPVEMPBASIC_BIRTHDAY +' </label>'+
				 '					</div>'+
				 '				</div>'+
				 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
				 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
				 '						<label style="float:left;font-size:12px">工作邮箱:'+ EMPVEMPBASIC_WORKEMAIL +' </label>'+
				 '					</div>'+
				 '				</div>'+
				 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
				 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
				 '						<label style="float:left;font-size:12px">手机号码:'+ EMPVEMPBASIC_MOBILE +' </label>'+
				 '					</div>'+
				 '				</div>'+
				'                </div>'+
				'            </div>'+
				'            <div class="clearfix"></div>'+
				'        </a>'+
				'    </div>'+
				'</div>');
			$('#EMP_V_EMPBASIC_list').append(cellObj);
}
}
var addtabId = 996;
function openTable(e){
	var url = '';
	var title = '';
	var id = addtabId;
	addtabId++;
	if(e=='alreadyAct'){
		url = '/myehr/jsp/act/actManage/hsiActList.jsp';
		title = '已批流程';
	}else if(e=='waitAct'){
		url = '/myehr/jsp/act/actManage/toDoList.jsp?aa=dd&flowType=7&open=false&flowDicCode=&ORG_DEL=N&flowCode=7&isLeaf=false&isParent=false&expanded=false&flowName=厦门流程&flowParentCode=FlowRoot&name=厦门流程&level=1&tId=tree_org_tree_8&parentTId=tree_org_tree_1&zAsync=true&isFirstNode=false';
		title = '待批流程';
	}else if(e=='startAct'){
		url = '/myehr/jsp/act/actManage/modeStartlList.jsp?aa=dd&flowType=7&open=false&flowDicCode=&ORG_DEL=N&flowCode=7&isLeaf=false&isParent=false&expanded=false&flowName=厦门流程&flowParentCode=FlowRoot&name=厦门流程&level=1&tId=tree_org_tree_8&parentTId=tree_org_tree_1&zAsync=true&isFirstNode=false&isLastNode=true';
		title = '发起流程';
	}
	/*
	layer.open({
		type: 2,
		title: title,
		shadeClose: true,
		shade: 0.8,
		area: ['85%', '85%'],
		content: url, //iframe的url
		success:function(layero,index){
	    },
		end:function(){
			refresh();
		}
	})
	*/
	parent.addTab(id,title,url);
}

function jumpForm(e){
	var url = '';
	var title = '';
	var id = addtabId;
	addtabId++;
	url = '/myehr/form/toForm.action?formId='+e
	if(e=='4824'){
		title = '新入职人员';
		id = '999';
	}else if(e=='4825'){
		title = '已离职人员';
		id = '1000';
	}
	/*
	layer.open({
		type: 2,
		title: title,
		shadeClose: true,
		shade: 0.8,
		area: ['85%', '85%'],
		content: url, //iframe的url
		success:function(layero,index){
	    },
		end:function(){
			refresh();
		}
	})
	*/
	parent.addTab(id,title,url);
}



//信息统计
function showDate_KNOB() {
		var nums = [];
		$.ajax({
			url: "/myehr/act/task/getTotalModel.action",
			type: 'post',
			cache: false,
			async: false,
			success: function (data) {
				nums = data;
			 }
		});
		var cellObj = $('<div class="col-md-4 col-sm-4 col-lg-4"  >'+
						'	 <div style="width:100%;height:100%;z-index:999;position:absolute;" onclick="openTable(\'waitAct\')"></div>'+
						'    <div class="widget style1 navy-bg" style="background-color:#fff">'+
						'        <div class="row" id="row">'+
						'            <div style="text-align:center">'+
						'				<input class="knob" value="'+nums[2]+'">'+
						'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#000;font-weight:400;">待批流程</span></div>'+
						'            </div>'+
						'        </div>'+
						'    </div>'+
						'</div>'+
						'<div class="col-md-4 col-sm-4 col-lg-4"  >'+
						'	 <div style="width:100%;height:100%;z-index:999;position:absolute;" onclick="openTable(\'alreadyAct\')"></div>'+
						'    <div class="widget style1 navy-bg" style="background-color:#fff" >'+
						'        <div class="row" id="row">'+
						'            <div style="text-align:center">'+
						'				<input class="knob2" value="'+nums[1]+'">'+
						'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#000;font-weight:400;">已批流程</span></div>'+
						'            </div>'+
						'        </div>'+
						'    </div>'+
						'</div>'+
						'<div class="col-md-4 col-sm-4 col-lg-4"  >'+
						'	 <div style="width:100%;height:100%;z-index:999;position:absolute;" onclick="openTable(\'startAct\')"></div>'+
						'    <div class="widget style1 navy-bg" style="background-color:#fff">'+
						'        <div class="row" id="row">'+
						'            <div style="text-align:center">'+
						'				<input class="knob3" value="'+nums[0]+'">'+
						'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#000;font-weight:400;">可发起流程数</span></div>'+
						'            </div>'+
						'        </div>'+
						'    </div>'+
						'</div>');
	$('#knobManage').append(cellObj);
	$(".knob").knob({
		max: 50,
		min: 0,
		width:90,
		height:90,
		readonly:"readonly",
		thickness: .1,
		fgColor: 'rgb(135, 206, 235)',
		bgColor: '#F5F5F5',
		'release':function(e){
		},
		'change' : function (v) { console.log(v); }
    });
	$(".knob2").knob({
		max: 500,
		min: 0,
		width:90,
		readonly:"readonly",
		height:90,
		thickness: .1,
		fgColor: '#FF5809',
		bgColor: '#F5F5F5',
		'release':function(e){
		},
		'change' : function (v) { console.log(v); }
    });
	$(".knob3").knob({
		max: 50,
		min: 0,
		width:90,
		height:90,
		readonly:"readonly",
		thickness: .1,
		fgColor: '#AAAAFF',
		bgColor: '#F5F5F5',
		'release':function(e){
		},
		'change' : function (v) { console.log(v); }
    });
}
function testFunction(e){
	var url='/myehr/jsp/formbuild/att_leave_test_add.jsp';
	parent.layer.open({
		type: 2,
		title:'收入证明的工单',
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['1150px', '500px'],
		content: url,
		success:function(layero,index){
		$('.layui-layer-max').click();
		}
	});
}
var TUpageNum = 1;
function changeshowPieForm (e){
	$(".TUpage").css("display","none");
	if(e=='prev'){
		TUpageNum = TUpageNum-1;
		$(".TUpage"+TUpageNum).css("display","block");
	}else if(e=='next'){
		TUpageNum = TUpageNum+1;
		$(".TUpage"+TUpageNum).css("display","block");
	}
	if(TUpageNum==1){
		$("#prev").css("display","none");
		$("#next").css("display","block");
	}else if(TUpageNum==2){
		$("#next").css("display","none");
		$("#prev").css("display","block");
	}
}

function searchEmpInfo(){
	
	var EMPCODE = $("#EMPCODE").val();
	var EMPCODEval = "";
	var CNAMEval = "";
	if(EMPCODE!=''&&EMPCODE!=null){
		EMPCODEval = EMPCODE;
		CNAMEval = EMPCODE;
	}
	var JOBID = $("#JOBID").val();
	var JOBIDval = "";
	if(JOBID==''||JOBID==null){
	}else{
		for(var i=0;i<JOBID.length;i++){
			JOBIDval+=JOBID[i]+',';
		}
		JOBIDval = JOBIDval.substring(0,JOBIDval.length-1);
	}
	var DEPID = $("#DEPID").val();
	var DEPIDval = ""
	if(DEPID==''||DEPID==null){
	}else{
		for(var i=0;i<DEPID.length;i++){
			DEPIDval+=DEPID[i]+',';
		}
		DEPIDval = DEPIDval.substring(0,DEPIDval.length-1);
	}
	var EMPTYPE = $("#EMPTYPE").val();
	var EMPTYPEval = "";
	if(EMPTYPE==''||EMPTYPE==null){
	}else{
		for(var i=0;i<EMPTYPE.length;i++){
			EMPTYPEval+=EMPTYPE[i]+',';
		}
		EMPTYPEval = EMPTYPEval.substring(0,EMPTYPEval.length-1);
	}
	var MAXEDUCATIO = $("#MAXEDUCATIO").val();
	var MAXEDUCATIOval = "";
	if(MAXEDUCATIO==''||MAXEDUCATIO==null){
	}else{
		for(var i=0;i<MAXEDUCATIO.length;i++){
			MAXEDUCATIOval+=MAXEDUCATIO[i]+',';
		}
		MAXEDUCATIOval = MAXEDUCATIOval.substring(0,MAXEDUCATIOval.length-1);
	}
	var OGIGIN = $("#OGIGIN").val();
	var OGIGINval = "";
	if(OGIGIN==''||OGIGIN==null){
	}else{
		for(var i=0;i<OGIGIN.length;i++){
			OGIGINval+=OGIGIN[i]+',';
		}
		OGIGINval = OGIGINval.substring(0,OGIGINval.length-1);
	}
	var GENDER = $("#GENDER").val();
	var GENDERval = "";
	if(GENDER==''||GENDER==null){
	}else{
		for(var i=0;i<GENDER.length;i++){
			GENDERval+=GENDER[i]+',';
		}
		GENDERval = GENDERval.substring(0,GENDERval.length-1);
	}
	//DEPID,JOBID,EMPTYPE,MAXEDUCATIO,OGIGIN,GENDER
	var url = '/myehr/jsp/workDesk/emp_employee_list_116.jsp?formId=4802&EMPCODE='+EMPCODEval+'&CNAME='+CNAMEval+'&DEPID='+DEPIDval+'&JOBID='+JOBIDval+'&EMPTYPE='+EMPTYPEval+'&MAXEDUCATIO='+MAXEDUCATIOval+'&OGIGIN='+OGIGINval+'&GENDER='+GENDERval;
	var title = '人员检索';
	layer.open({
		type: 2,
		title: title,
		shadeClose: true,
		shade: 0.8,
		area: ['85%', '85%'],
		content: url, //iframe的url
		success:function(layero,index){
	    },
		end:function(){
			refresh();
		}
	})
}

</script>
</body>
</html>