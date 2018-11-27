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
<link rel="stylesheet" type="/xx.css" />
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
html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, font, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td{margin:0;padding:0;border:0;outline:0;font-size:100%;vertical-align:baseline;background:transparent}
body{line-height:1}
ol, ul{list-style:none}
blockquote, q{quotes:none}
blockquote:before, blockquote:after, q:before, q:after{content:'';content:none}
:focus{outline:0}
ins{text-decoration:none}
del{text-decoration:line-through}
table{border-collapse:collapse;border-spacing:0}
a{text-decoration:none;color:#fff}
body{font-family:"Kreon";font-weight:300;color:#333;background:#fff;}

#switcher{height:54px;z-index:99999;position:fixed;width:100%;top:0;background:#000;}
.center{width:100%;padding-top:0}
.center ul li{display:inline;float:left;position:relative}
.logoTop,.top2{margin-left:30px;margin-top:20px;color:#fff;font-weight:bold;font-family:"微软雅黑"}

.top2{position:relative;margin-top:16px;font-size:12px;font-weight:normal;background-image:url(../i/2vm.png);background-repeat:no-repeat;background-position:3px center;height:20px;padding-left:25px;line-height:20px;border:1px solid #414141;padding-right:5px;border-radius:5px;}
.vm{position:absolute;top:20px;left:0px;background-color:#fff;height:170px;width:150px;display:none;padding:30px;}
.top2:hover .vm{display:block}
.logoTop a:hover{text-decoration:underline}

li.remove_frame{margin-left:17px;float:right!important;margin-right:30px}
li.remove_frame a{background:url(../i/cross2.png) no-repeat 0 0;width:20px;height:21px;display:block;margin-top:18px;transition:all .3s ease-out 0s}
li.remove_frame a:hover{background-position:0 -21px}
#iframe{margin-top:0}
.icon-monitor, .icon-tablet, .icon-mobile-1, .icon-mobile-2, .icon-mobile-3{margin-right:7px;margin-top:20px;width:17px;height:16px;background:url(../i/mon-spr.png) no-repeat;}

.icon-monitor{margin-left:10px;background-position:0 0;}
.icon-tablet{background-position:-24px 0}
.icon-mobile-1{background-position:-49px 0}
.icon-monitor:hover, .icon-monitor.active{background-position:0 -16px}
.icon-tablet:hover, .icon-tablet.active{background-position:-24px -16px}
.icon-mobile-1:hover, .icon-mobile-1.active{background-position:-49px -16px}
.icon-mobile-2{background-position:-71px 0}
.icon-mobile-3{background-position:-94px 0}
.icon-mobile-2:hover, .icon-mobile-2.active{background-position:-71px -16px}
.icon-mobile-3:hover, .icon-mobile-3.active{background-position:-94px -16px}

#iframe-wrap{height:100%;overflow:visible;position:relative;top:54px;z-index:50}
.tablet-width{height:960px!important;margin:0 auto;padding:175px 100px 115px 100px;width:785px;margin-top:40px;background:url(../i/bg-mob.png) no-repeat 0 0}
.tablet-width iframe{height:960px!important}
.mobile-width{height:703px!important;margin:0 auto;padding:165px 115px 100px 100px;width:1041px;margin-top:40px;background:url(../i/bg-mob.png) no-repeat 0 -1249px}
.mobile-width iframe{height:704px!important}
.mobile-width-2{height:417px!important;margin:0 auto;padding:125px 25px 159px 25px;width:337px;margin-top:40px;background:url(../i/bg-mob.png) no-repeat 0 -2217px}
.mobile-width-2 iframe{height:416px!important}
.mobile-width-3{height:256px!important;margin:0 auto;padding:45px 115px 69px 105px;width:497px;margin-top:40px;background:url(../i/bg-mob.png) no-repeat -387px -2217px}
.mobile-width-3 iframe{height:256px!important}
#by{overflow-y:hidden}
</style>
<link rel="stylesheet" href="xx.css" type="text/css"></link></head>
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
						<select id="DEPID" title="部门" name="DEPID"  columnId="87660" onchange="linkage()" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql9" dataField1 = "sql"  nullItemText="" dataField="data_form_87660" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">岗&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp位</label>                      
						<select id="JOBID" title="岗位" name="JOBID"  columnId="87661" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql46" dataField1 = "sql"  nullItemText="" dataField="data_form_87661" multiSelect="true"initParam = "_">
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
						<select id="MAXEDUCATIO" title="学历" name="MAXEDUCATIO"  columnId="87730" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="emp_EDUTYPE" dataField1 = "dict"  nullItemText="" dataField="data_form_87730" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				 <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">籍&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp贯</label>                      
						<select id="OGIGIN" title="籍贯" name="OGIGIN"  columnId="87691" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="sql68" dataField1 = "sql"  nullItemText="" dataField="data_form_87691" multiSelect="true"initParam = "_">
						</select>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
						<label style="float:left">性&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp别</label>                      
						<select id="GENDER" title="性别" name="GENDER"  columnId="87694" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" showNullItem="true" textField="text" valueField="id" DictName="emp_SEX" dataField1 = "dict"  nullItemText="" dataField="data_form_87694" multiSelect="true"initParam = "_">
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
			<div class="card">
				<div class="card-body">
					<h4 class="card-title">Recent Comments</h4>
				</div>
				<div class="comment-widgets scrollable ps-container ps-theme-default ps-active-y" style="height:430px;" data-ps-id="13b1e281-1636-c7c1-bb05-fd60b137398d">
					<!-- Comment Row -->
					<div class="d-flex flex-row comment-row m-t-0">
						<div class="p-2">
							<img src="http://116.62.243.28:9875/人员照片/系统管理员_sysadmin.jpg" alt="user" width="50" class="rounded-circle">
						</div>
						<div class="comment-text w-100">
							<h6 class="font-medium">James Anderson</h6>
							<span class="m-b-15 d-block">Lorem Ipsum is simply dummy text of the printing and type setting industry. </span>
							<div class="comment-footer">
								<span class="text-muted float-right">April 14, 2016</span>
								<span class="label label-rounded label-primary">Pending</span>
								<span class="action-icons">
									<a href="javascript:void(0)">
										<i class="ti-pencil-alt"></i>
									</a>
									<a href="javascript:void(0)">
										<i class="ti-check"></i>
									</a>
									<a href="javascript:void(0)">
										<i class="ti-heart"></i>
									</a>
								</span>
							</div>
						</div>
					</div>
				</div>
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

</div>
</div>
<script>

$(function() {
	loadDataStart();//登录用户信息
	showDate_KNOB();//流程信息
});

window.onload=function(){ 
    
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