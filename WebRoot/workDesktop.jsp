<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/commontestForDrag.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<link rel="stylesheet" href="/myehr/commonTable/css/mui.min.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/commonTable/css/reset.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/commonTable/css/app_base.css" type="text/css"></link>
<script type="text/javascript" src="/myehr/commonTable/js/mui.js"></script>

<link rel="stylesheet" href="/myehr/commonTable/css/mui.poppicker.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/commonTable/css/mui.picker.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/commonTable/css/mui.dtpicker.css" type="text/css"></link>

<script type="text/javascript" src="/myehr/commonTable/js/mui.poppicker.js"></script>
<script type="text/javascript" src="/myehr/commonTable/js/mui.picker.min.js"></script>
<script type="text/javascript" src="/myehr/commonTable/js/mui.dtpicker.js"></script>
<script type="text/javascript" src="/myehr/commonTable/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="/myehr/commonTable/js/select2/js/select2.js"></script>
<link rel="stylesheet" href="/myehr/commonTable/icon/css/bootstrap.min.css" type="text/css"></link>
<script type="text/javascript" src="/myehr/commonTable/js/date-format.js"></script>
<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css " rel="stylesheet">


<script type="text/javascript" src="/myehr/common/js/iconfont.js"></script>

<script src="http://cdn.jsdelivr.net/vue/1.0.26/vue.min.js"></script>
<html>
<head>
  <meta name="apple-mobile-web-app-capable" content="yes">
  <meta name="apple-mobile-web-app-status-bar-style" content="black">
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
 
  <style type="text/css">
.hexie-icon{
  font-size: 35px;
  line-height: 80px;
  color:#333;
  -webkit-transition: font-size 0.25s ease-out 0s;
  -moz-transition: font-size 0.25s ease-out 0s;
  transition: font-size 0.25s ease-out 0s;
  /* 通过设置 font-size 来改变图标大小 */
  width: 1em; height: 1em;
  /* 图标和文字相邻时，垂直对齐 */
  vertical-align: -0.15em;
  /* 通过设置 color 来改变 SVG 的颜色/fill */
  fill: currentColor;
  /* path 和 stroke 溢出 viewBox 部分在 IE 下会显示
     normalize.css 中也包含这行 */
  overflow: auto;
}
h3{
	font-size:24.5px;
}
.container-fluid{
	overflow-x:hidden;
}
  </style>
</head>
<body style="padding:0">
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div id="app" >
				<div class="mui-content">    	
					<div class="mui-scroll-wrapper">
						<div class="mui-scroll">
							<div class="menu-2-group" v-for="item in menuItem">
								<ul class="mui-table-view mui-grid-view mui-grid-9">
									<li v-for="cell in item.childrens" class="mui-table-view-cell mui-media mui-col-xs-3 mui-col-sm-3">
										<a :href="cell.menuUrl">
											<!-- <span class="glyphicon" :class ="cell.imgFileId"></span> -->
											<svg v-if="cell.imgFileId !== 'null'" class="hexie-icon" aria-hidden="true">
												<use xlink:href={{cell.imgFileId}}></use>
											</svg>
											<svg v-else class="hexie-icon" aria-hidden="true">
												<use xlink:href="#icon-drxx80"></use>
											</svg>
											<div class="mui-media-body">{{cell.menuName}}</div>
										</a>
									</li>
								</ul> 					
							</div>
							<nav class="mui-bar mui-bar-tab" style="position:relative;">
								<span v-for="item in menu" track-by="$index" v-on:tap="menuTab($index)" @click="menuTab($index)" class="mui-tab-item" :class="{mui-active: $index===currentIndex}">
								<span class="mui-tab-label">{{item.menuName}}</span>
								</span>
							</nav>				
						</div>
					</div> 
				</div>	
			</div>
		</div>	
	</div>
	
	<div class="row-fluid">
		<div class="span12">
			<div class="box-content" id="3638">
				<table id="EMP_EMPLOYEE_PERSON_List"></table>
				<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
				<div class="row" style="margin-left:0" id="EMP_EMPLOYEE_PERSON"></div>
			</div>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span12">
			<div class="row-fluid">
				<div class="span3">
					<div class="box-content" id="3578">
						<table id="COUNT_BIRTHDAY_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="COUNT_BIRTHDAY"></div>
					</div>
				</div>
				<div class="span3">
					<div class="box-content" id="3581">
						<table id="REMIND_UPPARTY_CARD_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIND_UPPARTY_CARD"></div>
					</div>
				</div>
				<div class="span3">
					<div class="box-content" id="3584">
						<table id="REMIND_CONTRACT_CARD_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIND_CONTRACT_CARD"></div>
					</div>
				</div>
				<div class="span3">
					<div class="box-content" id="3585">
						<table id="REMIND_LEAVE_CARD_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIND_LEAVE_CARD"></div>
					</div>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span3">
					<div class="box-content" id="3587">
						<table id="REMIND_PROBATION_CARD_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIND_PROBATION_CARD"></div>
					</div>
				</div>
				<div class="span3">
					<div class="box-content" id="3592">
						<table id="REMIND_RETIRE_CARD_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIND_RETIRE_CARD"></div>
					</div>
				</div>
				<div class="span3">
					<div class="box-content" id="3594">
						<table id="REMIIND_RENEW_CARD_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIIND_RENEW_CARD"></div>
					</div>
				</div>
				<div class="span3">
					<div class="box-content" id="3596">
						<table id="REMIND_RENEWHALEYAER__List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIND_RENEWHALEYAER_"></div>
					</div>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span3">
					<div class="box-content" id="3609">
						<table id="REMIND_RENEWYEAR_CARD_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIND_RENEWYEAR_CARD"></div>
					</div>
				</div>
				<div class="span3">
					<div class="box-content" id="3604">
						<table id="REMIND_CONPOST_CARD_List"></table>
						<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
						<div class="row" style="margin-left:0" id="REMIND_CONPOST_CARD"></div>
					</div>
				</div>
				<div class="span3">
				</div>
				<div class="span3">
				</div>
			</div>
		</div>
	</div>
	<div class="row-fluid"  style="height: 200px">
		<div class="span12" style="height: 200px">
			<h3 style="font-size:24.5px;">
				<strong>新员工</strong>
			</h3>
			
			<div class="box-content" id="3616" style="height:510px;overflow-y:auto">
				<table id="emp_employee_card_List"></table>
				<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
				<div class="row" style="margin-left:0" id="emp_employee_card"></div>
			</div>
		</div>
	</div>
</div>
<script>
var xx = {};
 mui.init();
 var Currentpage = 0;
 var pagesize = 10;
    //初始化单页的区域滚动
	//mui('.mui-scroll-wrapper').scroll();
	function showList(){
		document.getElementById("showList").classList.add('m-active')
	}
	function hideList(){
		document.getElementById("showList").classList.remove('m-active')
	}

	var app = new Vue({         
		el: '#app',               
	    data: { 
	      currentIndex: 0,
	      menu:[],
	      menuItem:[]
	    },
	    methods: {
	    	menuTab: function(index) {
	    		console.log(index);
	    		this.currentIndex = index;
	    		this.menuItem = this.menu[index].childrens;
	    		Vue.nextTick(function(){
	    			console.log(index);
	    		})
	    	}
	    },
	    created: function(){
	    	mui.ajax('/myehr/form/menuJsonWithScheme.action?schemeId=4&formType=APP',{ 
				dataType:'json',//服务器返回json格式数据 
				type:'post',//HTTP请求类型 
				timeout:10000,//超时时间设置为10秒； 
				//headers:{'Content-Type':'application/json'},	               
				success:function(data){ 
					app.menu = data.data;
					app.menuItem = app.menu[0].childrens;
					app.menuTab(0);
				}, 
				error:function(xhr,type,errorThrown){ 
					//异常处理； 
					console.log(type); 
				} 
			}); 
			
	    }
	  });
	var _formId_3638='3638';
var realFormId='${param.formId}';
var userid;var heightGadedata_3638 =[];
var containerParam_3638 ={};
containerParam_3638 ={};
function changeHeightGadedata_3638(data){
	heightGadedata_3638 = data;
}
	var _formId_3578='3578';
var realFormId='${param.formId}';
var heightGadedata_3578 =[];
var containerParam_3578 ={};
containerParam_3578 ={};
function changeHeightGadedata_3578(data){
	heightGadedata_3578 = data;
}
	var _formId_3581='3581';
var realFormId='${param.formId}';
var heightGadedata_3581 =[];
var containerParam_3581 ={};
containerParam_3581 ={};
function changeHeightGadedata_3581(data){
	heightGadedata_3581 = data;
}
	var _formId_3584='3584';
var realFormId='${param.formId}';
var heightGadedata_3584 =[];
var containerParam_3584 ={};
containerParam_3584 ={};
function changeHeightGadedata_3584(data){
	heightGadedata_3584 = data;
}
	var _formId_3585='3585';
var realFormId='${param.formId}';
var heightGadedata_3585 =[];
var containerParam_3585 ={};
containerParam_3585 ={};
function changeHeightGadedata_3585(data){
	heightGadedata_3585 = data;
}
	var _formId_3587='3587';
var realFormId='${param.formId}';
var heightGadedata_3587 =[];
var containerParam_3587 ={};
containerParam_3587 ={};
function changeHeightGadedata_3587(data){
	heightGadedata_3587 = data;
}
	var _formId_3592='3592';
var realFormId='${param.formId}';
var heightGadedata_3592 =[];
var containerParam_3592 ={};
containerParam_3592 ={};
function changeHeightGadedata_3592(data){
	heightGadedata_3592 = data;
}
	var _formId_3594='3594';
var realFormId='${param.formId}';
var heightGadedata_3594 =[];
var containerParam_3594 ={};
containerParam_3594 ={};
function changeHeightGadedata_3594(data){
	heightGadedata_3594 = data;
}
	var _formId_3596='3596';
var realFormId='${param.formId}';
var heightGadedata_3596 =[];
var containerParam_3596 ={};
containerParam_3596 ={};
function changeHeightGadedata_3596(data){
	heightGadedata_3596 = data;
}
	var _formId_3609='3609';
var realFormId='${param.formId}';
var heightGadedata_3609 =[];
var containerParam_3609 ={};
containerParam_3609 ={};
function changeHeightGadedata_3609(data){
	heightGadedata_3609 = data;
}
	var _formId_3604='3604';
var realFormId='${param.formId}';
var heightGadedata_3604 =[];
var containerParam_3604 ={};
containerParam_3604 ={};
function changeHeightGadedata_3604(data){
	heightGadedata_3604 = data;
}
	var _formId_3616='3616';
var realFormId='${param.formId}';
var heightGadedata_3616 =[];
var containerParam_3616 ={};
containerParam_3616 ={};
function changeHeightGadedata_3616(data){
	heightGadedata_3616 = data;
}
$(function() {
loadDataStart_3638();
loadDataStart_3578();
loadDataStart_3581();
loadDataStart_3584();
loadDataStart_3585();
loadDataStart_3587();
loadDataStart_3592();
loadDataStart_3594();
loadDataStart_3596();
loadDataStart_3609();
loadDataStart_3604();
loadDataStart_3616();
cardSelectInitFunction("${param.formType}");
cardDateWidInitFunction();
});
var filterParam = {};
var queryParams;
function grid_EMP_EMPLOYEE_PERSON_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_EMPLOYEE_PERSON_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.userid}'==''&&'session'=='parameter'){
		if(userid==undefined){
			requestParam = {userid:'${param.userid}'};
		}else{
			requestParam = {};
		}
	}else{
		requestParam = {userid:'${sessionScope.userid}'};
	}
	pageReqeust.containerParam=containerParam_3638;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3638;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3638!=null&&heightGadedata_3638!=undefined){
		pageReqeust.heightGrade = heightGadedata_3638;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_EMPLOYEE_PERSON_fun11_3638(){
	loadDataStart();

}
function loadDataStart_3638(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_EMP_EMPLOYEE_PERSON_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3638(arr);
      }
});
}function showDate_3638(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
var PERVEMPLOYEE_CNAME = arr[i].PERVEMPLOYEE_CNAME;
var PERVEMPLOYEE_EMPCODE = arr[i].PERVEMPLOYEE_EMPCODE;
var PERVEMPLOYEE_VIR_JOBTYPE = arr[i].PERVEMPLOYEE_VIR_JOBTYPE;
var PERVEMPLOYEE_VIR_JOBNAME = arr[i].PERVEMPLOYEE_VIR_JOBNAME;
var PERVEMPLOYEE_VIR_DEP01 = arr[i].PERVEMPLOYEE_VIR_DEP01;
var PERVEMPLOYEE_VIR_DEP02 = arr[i].PERVEMPLOYEE_VIR_DEP02;
var PERVEMPLOYEE_VIR_GENDER = arr[i].PERVEMPLOYEE_VIR_GENDER;
var PERVEMPLOYEE_GRADUASCHOOL = arr[i].PERVEMPLOYEE_GRADUASCHOOL;
var PERVEMPLOYEE_A0175 = arr[i].PERVEMPLOYEE_A0175;
if(arr[i].PERVEMPLOYEE_A0175!=null){
	 PERVEMPLOYEE_A0175 = new Date(PERVEMPLOYEE_A0175).Format("yyyy-MM-dd");
}
var PERVEMPLOYEE_JOINDATE = arr[i].PERVEMPLOYEE_JOINDATE;
if(arr[i].PERVEMPLOYEE_JOINDATE!=null){
	 PERVEMPLOYEE_JOINDATE = new Date(PERVEMPLOYEE_JOINDATE).Format("yyyy-MM-dd");
}
    var cellObj = $(
        '<div class="col-md-12 col-sm-1 col-lg-12">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+PERVEMPLOYEE_CNAME+'-'+PERVEMPLOYEE_EMPCODE+'"><strong>'+PERVEMPLOYEE_CNAME+'-'+PERVEMPLOYEE_EMPCODE+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">职务序列:'+ PERVEMPLOYEE_VIR_JOBTYPE +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">现任职务:'+ PERVEMPLOYEE_VIR_JOBNAME +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">部门:'+ PERVEMPLOYEE_VIR_DEP01 +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">科室:'+ PERVEMPLOYEE_VIR_DEP02 +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">性别:'+ PERVEMPLOYEE_VIR_GENDER +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">毕业院校:'+ PERVEMPLOYEE_GRADUASCHOOL +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">毕业时间:'+ PERVEMPLOYEE_A0175 +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">入司时间:'+ PERVEMPLOYEE_JOINDATE +' </lable>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#EMP_EMPLOYEE_PERSON').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_COUNT_BIRTHDAY_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_COUNT_BIRTHDAY_filter')){
	}
	var paramsMap = {		's_userId' : '1'};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3578;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_3578;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3578!=null&&heightGadedata_3578!=undefined){
		pageReqeust.heightGrade = heightGadedata_3578;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_COUNT_BIRTHDAY_fun11_3578(){
	loadDataStart();

}
function loadDataStart_3578(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_COUNT_BIRTHDAY_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3578(arr);
      }
});
}function showDate_3578(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3576&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">生日提醒共</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#COUNT_BIRTHDAY').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIND_UPPARTY_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIND_UPPARTY_CARD_filter')){
	}
	var paramsMap = {		's_userId' : '1'};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3581;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_3581;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3581!=null&&heightGadedata_3581!=undefined){
		pageReqeust.heightGrade = heightGadedata_3581;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIND_UPPARTY_CARD_fun11_3581(){
	loadDataStart();

}
function loadDataStart_3581(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIND_UPPARTY_CARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3581(arr);
      }
});
}function showDate_3581(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3582&VIR_UPPARTY='+arr[i].VIR_UPPARTY+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_UPPARTY+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">党员转正共</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIND_UPPARTY_CARD').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIND_CONTRACT_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIND_CONTRACT_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3584;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3584;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3584!=null&&heightGadedata_3584!=undefined){
		pageReqeust.heightGrade = heightGadedata_3584;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIND_CONTRACT_CARD_fun11_3584(){
	loadDataStart();

}
function loadDataStart_3584(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIND_CONTRACT_CARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3584(arr);
      }
});
}function showDate_3584(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3583&VIR_CONTRACTOVER='+arr[i].VIR_CONTRACTOVER+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_CONTRACTOVER+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">合同到期共</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIND_CONTRACT_CARD').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIND_LEAVE_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIND_LEAVE_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3585;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3585;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3585!=null&&heightGadedata_3585!=undefined){
		pageReqeust.heightGrade = heightGadedata_3585;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIND_LEAVE_CARD_fun11_3585(){
	loadDataStart();

}
function loadDataStart_3585(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIND_LEAVE_CARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3585(arr);
      }
});
}function showDate_3585(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3586&VIR_LEAVE='+arr[i].VIR_LEAVE+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_LEAVE+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">离职提醒共</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIND_LEAVE_CARD').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIND_PROBATION_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIND_PROBATION_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3587;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3587;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3587!=null&&heightGadedata_3587!=undefined){
		pageReqeust.heightGrade = heightGadedata_3587;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIND_PROBATION_CARD_fun11_3587(){
	loadDataStart();

}
function loadDataStart_3587(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIND_PROBATION_CARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3587(arr);
      }
});
}function showDate_3587(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3588&VIR_TRIAL='+arr[i].VIR_TRIAL+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_TRIAL+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">试用期到期提醒共</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIND_PROBATION_CARD').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIND_RETIRE_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIND_RETIRE_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3592;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3592;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3592!=null&&heightGadedata_3592!=undefined){
		pageReqeust.heightGrade = heightGadedata_3592;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIND_RETIRE_CARD_fun11_3592(){
	loadDataStart();

}
function loadDataStart_3592(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIND_RETIRE_CARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3592(arr);
      }
});
}function showDate_3592(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3591&VIR_RETIRENUMBER='+arr[i].VIR_RETIRENUMBER+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_RETIRENUMBER+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">退休提醒共</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIND_RETIRE_CARD').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIIND_RENEW_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIIND_RENEW_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3594;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3594;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3594!=null&&heightGadedata_3594!=undefined){
		pageReqeust.heightGrade = heightGadedata_3594;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIIND_RENEW_CARD_fun11_3594(){
	loadDataStart();

}
function loadDataStart_3594(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIIND_RENEW_CARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3594(arr);
      }
});
}function showDate_3594(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3593&VIR_RENEW='+arr[i].VIR_RENEW+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_RENEW+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">提前2月续签提醒</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIIND_RENEW_CARD').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIND_RENEWHALEYAER__fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIND_RENEWHALEYAER__filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3596;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3596;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3596!=null&&heightGadedata_3596!=undefined){
		pageReqeust.heightGrade = heightGadedata_3596;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIND_RENEWHALEYAER__fun11_3596(){
	loadDataStart();

}
function loadDataStart_3596(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIND_RENEWHALEYAER__fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3596(arr);
      }
});
}function showDate_3596(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3595&VIR_RENEW='+arr[i].VIR_RENEW+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_RENEW+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">续签提前半年提醒</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIND_RENEWHALEYAER_').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIND_RENEWYEAR_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIND_RENEWYEAR_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3609;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3609;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3609!=null&&heightGadedata_3609!=undefined){
		pageReqeust.heightGrade = heightGadedata_3609;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIND_RENEWYEAR_CARD_fun11_3609(){
	loadDataStart();

}
function loadDataStart_3609(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIND_RENEWYEAR_CARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3609(arr);
      }
});
}function showDate_3609(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3602&VIR_RENEW='+arr[i].VIR_RENEW+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_RENEW+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">续签提前一年提醒</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIND_RENEWYEAR_CARD').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_REMIND_CONPOST_CARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_REMIND_CONPOST_CARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3604;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3604;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3604!=null&&heightGadedata_3604!=undefined){
		pageReqeust.heightGrade = heightGadedata_3604;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_REMIND_CONPOST_CARD_fun11_3604(){
	loadDataStart();

}
function loadDataStart_3604(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_REMIND_CONPOST_CARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3604(arr);
      }
});
}function showDate_3604(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=3603&VIR_CONPOST='+arr[i].VIR_CONPOST+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:600;">'+arr[i].VIR_CONPOST+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">职务续聘提醒共</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#REMIND_CONPOST_CARD').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_emp_employee_card_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_employee_card_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3616;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3616;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3616!=null&&heightGadedata_3616!=undefined){
		pageReqeust.heightGrade = heightGadedata_3616;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_employee_card_fun11_3616(){
	loadDataStart();

}
function loadDataStart_3616(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_emp_employee_card_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3616(arr);
      }
});
}function showDate_3616(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
var PERVEMPLOYEE_CNAME = arr[i].PERVEMPLOYEE_CNAME;
var PERVEMPLOYEE_EMPCODE = arr[i].PERVEMPLOYEE_EMPCODE;
var PERVEMPLOYEE_VIR_DEP01 = arr[i].PERVEMPLOYEE_VIR_DEP01;
var PERVEMPLOYEE_VIR_DEP02 = arr[i].PERVEMPLOYEE_VIR_DEP02;
var PERVEMPLOYEE_VIR_GENDER = arr[i].PERVEMPLOYEE_VIR_GENDER;
var PERVEMPLOYEE_JOINDATE = arr[i].PERVEMPLOYEE_JOINDATE;
if(arr[i].PERVEMPLOYEE_JOINDATE!=null){
	 PERVEMPLOYEE_JOINDATE = new Date(PERVEMPLOYEE_JOINDATE).Format("yyyy-MM-dd");
}
    var cellObj = $(
        '<div class="col-md-6 col-sm-1 col-lg-4">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+PERVEMPLOYEE_CNAME+'-'+PERVEMPLOYEE_EMPCODE+'"><strong>'+PERVEMPLOYEE_CNAME+'-'+PERVEMPLOYEE_EMPCODE+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">部门:'+ PERVEMPLOYEE_VIR_DEP01 +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">科室:'+ PERVEMPLOYEE_VIR_DEP02 +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">性别:'+ PERVEMPLOYEE_VIR_GENDER +' </lable>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<lable style="float:left;font-size:12px">入司时间:'+ PERVEMPLOYEE_JOINDATE +' </lable>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#emp_employee_card').append(cellObj);
}
	}
</script>
</body>
</html>