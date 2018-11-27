<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/newcardandcard.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name ="viewport" content ="initial-scale=1, maximum-scale=3, minimum-scale=1, user-scalable=no">
<style type="text/css">
html,body{min-height: 100%;}
.row{padding:0 30px 0 15px}
.deleteButton:hover {color: red}
.saveButton:hover {color: red}
.updateButton:hover {color: red}
.contact-box{padding:5px !important ;margin-bottom:10px !important;}
.maodian{height:30px;width:100px;display:block;text-align: center;font-size:15px;margin:0 0 20px 0;cursor:pointer !important;}
.maodianA{text-decoration:none !important;}
#maodianS:before
{ 
	content: '';
    position: absolute;
    top: 0;
    left: 23px;
    height: 100%;
    width: 2px;
	border:2px dashed pink;
	z-index:1px
}
</style>
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/formbuild/test/LC_DISPATCH_TAB_ENDTWO.js"></script>
<link rel="stylesheet" href="/myehr/commonTable/bootstrap-3.3.7-dist/bootstrapTable/bootstrap-table.css" type="text/css"></link>
<script type="text/javascript" src="/myehr/commonTable/bootstrap-3.3.7-dist/bootstrapTable/bootstrap-table.js"></script>	
</head>
<body class="gray-bg" >
<div class="container-fluid" id="CardAndCardForm" style="height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;">
<div class="row mainFormElement" style="margin-left:0;padding: 0 15px 0 0;position:relative;" id="LC_DISPATCH_ENDTWO">
<input type="button" id="zhankai_main"  class="btn btn-info CCButtonelement" value="展开" style="position:absolute;right:30px;bottom:10px;z-index:999" onclick="showDate_Main(main_Datas,0,this)"/>
</div>
<div id="fubiao1" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">派遣工工资审批附表</h3>
	<div class="BTNGROUP" style="padding:0 30px 0 0; display:inline-block;height: 35px;width:100%">
		<div name="button" class="CCButton" style="margin-right:10px;float:right;">
			<input type="button" id="zhankai"  class="btn btn-info CCButtonelement" value="展开woda" onclick="changeFunctionForGrid('fubiao1')"/>
		</div>
		<div class="CCSelect" style="float:right;width:50%">
		</div>
	</div>
<!--展示部分-->
<div class="row" style="margin-left:0;padding: 0 15px 0 0;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #307DE9;padding:0;" id="TEST_FEE_INFO_FORM2">
	<table id="emp_emp_list_List">
	
	</table>
</div>
</div>
<div id="Comment" name="Comment" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">审批记录</h3>
<div class="BTNGROUP" style="padding:0 30px 0 0; display:inline-block;height: 35px;width:100%">
<div name="button" class="CCButton" style="margin-right:10px;float:right;">
	<input type="button" id="zhankaiComment"  class="btn btn-info CCButtonelement" value="展开" onclick="changeComment()"/>
</div>
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #5bc0de;padding:0;" id="CommentContent">
</div>
</div>
</div>
<script>
var LCDISPATCH_ID_parameter='${param.LCDISPATCH_ID}';
var LCDISPATCH_ID_parameter;
var _formId_4716='4716';
var realFormId='${param.formId}';
var EMP_NAME_session_4716='';
if('${sessionScope.EMP_NAME}'!='null'){EMP_NAME_session_4716='${sessionScope.EMP_NAME}'}
var PAYCOMP_session_4716='';
if('${sessionScope.PAYCOMP}'!='null'){PAYCOMP_session_4716='${sessionScope.PAYCOMP}'}
var EMP_EMPID_session_4716='';
if('${sessionScope.EMP_EMPID}'!='null'){EMP_EMPID_session_4716='${sessionScope.EMP_EMPID}'}
var EMP_DEPID_session_4716='';
if('${sessionScope.EMP_DEPID}'!='null'){EMP_DEPID_session_4716='${sessionScope.EMP_DEPID}'}
var PAYCOMPID_session_4716='';
if('${sessionScope.PAYCOMPID}'!='null'){PAYCOMPID_session_4716='${sessionScope.PAYCOMPID}'}
var COMPAREA_session_4716='';
if('${sessionScope.COMPAREA}'!='null'){COMPAREA_session_4716='${sessionScope.COMPAREA}'}
var PARENTID_session_4716='';
if('${sessionScope.PARENTID}'!='null'){PARENTID_session_4716='${sessionScope.PARENTID}'}
var param_empIds = '${param.empIds}';
var isApp = '${param.formType}';
var param_flowAction = '${param.flowAction}';
var param_key = '${param.key}';
var param_taskId = '${param.taskId}';
var param_procInsId = '${param.procInsId}';
var formId_main = '4716';
var flowAction = '${param.flowAction}';
var BUSSINESSID_ACT = '${param.businessId}';
$(document).ready(function () {
	loadDataStart();
	$("#zhankai_main").click();
	changeShowType('fubiao1');
	changeFileCss();
	$("#zhankaiComment").click();
	$("#emp_emp_list_List").bootstrapTable({
				contentType: 'application/json;charset=utf-8',
				dataType:'json',
				method:'post',
				height : '700',
				undefinedText : '-',
				pagination : false,
				striped : true,
				fixedColumns: false,
				fixedNumber:4,
				cache : false, 
				toolbar : "#toolbar",
				sidePagination : "server",
				columns : [
				            {
				                title : '序号',
				                field : 'defaultXH',
				                align : 'center'
				            },
				  {
				                title : '主键',
				                field : 'LCDISPATCHSUB_ID',
				                align : 'center'
				            },
				  {
				                title : '关联ID',
				                field : 'LCDISPATCHSUB_SEQID',
				                align : 'center'
				            },
				  {
				                title : '工号',
				                field : 'LCDISPATCHSUB_EMPCODE',
				                align : 'center'
				            },
				            {
				                title : '姓名',
				                field : 'LCDISPATCHSUB_EMPID',
				                visible :false,
				            },{
				                title : '姓名',
				                field : 'LCDISPATCHSUB_EMPID_DICTNAME',
				                align : 'center'
				            },

				            {
				                title : '机构',
				                field : 'LCDISPATCHSUB_COMPID',
				                visible :false,
				            },{
				                title : '机构',
				                field : 'LCDISPATCHSUB_COMPID_DICTNAME',
				                align : 'center'
				            },

				            {
				                title : '部门',
				                field : 'LCDISPATCHSUB_DEPID',
				                visible :false,
				            },{
				                title : '部门',
				                field : 'LCDISPATCHSUB_DEPID_DICTNAME',
				                align : 'center'
				            },

				            {
				                title : '岗位',
				                field : 'LCDISPATCHSUB_JOBID',
				                visible :false,
				            },{
				                title : '岗位',
				                field : 'LCDISPATCHSUB_JOBID_DICTNAME',
				                align : 'center'
				            },

				  {
				                title : '身份证号码',
				                field : 'LCDISPATCHSUB_CERTNO',
				                align : 'center'
				            },
				  {
				                title : '发薪单位',
				                field : 'LCDISPATCHSUB_PAYCOMPID',
				                align : 'center'
				            },
				  {
				                title : '基本工资',
				                field : 'LCDISPATCHSUB_BASICWAGE',
				                align : 'center'
				            },
				  {
				                title : '通讯费',
				                field : 'LCDISPATCHSUB_COMMUNFEE',
				                align : 'center'
				            },
				  {
				                title : '扣缺勤',
				                field : 'LCDISPATCHSUB_DEDABSENEC',
				                align : 'center'
				            },
				  {
				                title : '车贴',
				                field : 'LCDISPATCHSUB_CARSTICKER',
				                align : 'center'
				            },
				  {
				                title : '加班费',
				                field : 'LCDISPATCHSUB_OVERTIME',
				                align : 'center'
				            },
				  {
				                title : '绩效(年终奖)',
				                field : 'LCDISPATCHSUB_PERFORYEAR',
				                align : 'center'
				            },
				  {
				                title : '绩效奖',
				                field : 'LCDISPATCHSUB_PERFORAWARD',
				                align : 'center'
				            },
				  {
				                title : '绩效(节日)',
				                field : 'LCDISPATCHSUB_PERFORFEST',
				                align : 'center'
				            },
				  {
				                title : '发放小计',
				                field : 'LCDISPATCHSUB_SUBTOTAL',
				                align : 'center'
				            },
				            ],
				onEditableSave: function (field, row, oldValue, $el) {  
		        },
				onClickRow: function (row, $element) {
				},
				onLoadSuccess: function (aa, bb, cc) {
				} 
			});
})
var BUSINESSID;var heightGadedata_4716 =[];
var containerParam_4716 ={};
containerParam_4716 ={};
function changeHeightGadedata_4716(data){
	heightGadedata_4716 = data;
}
var heightGadedata_4526 =[];
var containerParam_4526 ={};
containerParam_4526 ={};
function changeHeightGadedata_4526(data){
	heightGadedata_4526 = data;
}
var _formId_4526='4526';
var filterParam = {};
var queryParams;
function grid_LC_DISPATCH_ENDTWO_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_LC_DISPATCH_ENDTWO_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.BUSINESSID}'==''&&'parameter'=='parameter'){
		if(BUSINESSID==undefined){
			requestParam = {BUSINESSID:'${param.businessId}'};
		}else{
			requestParam = {BUSINESSID:BUSINESSID+""};
		}
	}else{
		requestParam = {BUSINESSID:'${param.BUSINESSID}'};
	}
	pageReqeust.containerParam=containerParam_4716;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4716;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4716!=null&&heightGadedata_4716!=undefined){
		pageReqeust.heightGrade = heightGadedata_4716;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_DISPATCH_ENDTWO_fun11_4716(){
	loadDataStart();

}
//当前页和一次显示多少条数据
var Currentpage = 0;
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
function getEmpPhotoSYS(){
	var objs = $("#Employee_Photo_WT");
	if(objs.length>0){
		$.ajax({ 
			   url:'/myehr/FileList/getEmpPhotoSYS.action?EMPID=${param.EMPVEMPLOYEE_EMPID}',
			   type:'post',
			   cache: false,
			   async: false, 
			   success: function (data){ 
				   $("#Employee_Photo_WT").attr("src",data[0]);
			   }
		   });
	}
}
//作为一个对象的w和h属性返回视口的尺寸
function getViewportSize(w){
    w = w || window;
    if(w.innerWidth != null){
        return {w: w.innerWidth, h: w.innerHeight};}
    var d = w.document;
    if(document.compatMode == "CSS1Compat"){
        return {w: d.documentElement.clientWidth, h: d.documentElement.clientHeight};}
    return {w: d.body.clientWidth, h: d.body.clientHeight};
}
//检测滚动条是否滚动到页面底部
function isScrollToPageBottom(){
    //文档高度
    var documentHeight = document.documentElement.offsetHeight;
    var viewPortHeight = getViewportSize().h;
    var scrollHeight = window.pageYOffset ||
            document.documentElement.scrollTop ||
            document.body.scrollTop || 0;
    return documentHeight - viewPortHeight - scrollHeight < 50;
}
//如果滚动条滚动到页面底部，需要加载新的数据,并且显示加载提示
function watchScroll(){
    if(!isScrollToPageBottom()){
        setTimeout( arguments.callee, 900);
        return;            
    }//loadDataDynamic();
}
//获取区间中的一个随机数
function rand(n, m){
    var random = Math.floor(Math.random()*(m-n+1)+n);
    return random;
};
var containerParam_4716={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_LC_DISPATCH_ENDTWO_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        main_Datas=data.rows;
		if(arr.length>0){
		}
      }
});
}
function showDate_4716(arr) {
if('${param.flowAction}'=='start'){
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-12">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" ></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请单位(发薪单位): </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工资年月: </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#LC_DISPATCH_ENDTWO').append(cellObj);
}else{
for (var i = arr.length - 1; i >= 0; i--) {
var LCDISPATCH_ID = arr[i].LCDISPATCH_ID;
if(arr[i].LCDISPATCH_ID==null){
	 LCDISPATCH_ID = '';
}
var LCDISPATCH_TITLE = arr[i].LCDISPATCH_TITLE;
if(arr[i].LCDISPATCH_TITLE==null){
	 LCDISPATCH_TITLE = '';
}
var LCDISPATCH_APPCOMPID = arr[i].LCDISPATCH_APPCOMPID;
if(arr[i].LCDISPATCH_APPCOMPID==null){
	 LCDISPATCH_APPCOMPID = '';
}
var LCDISPATCH_PAYMON = arr[i].LCDISPATCH_PAYMON;
if(arr[i].LCDISPATCH_PAYMON!=null){
	 LCDISPATCH_PAYMON = new Date(LCDISPATCH_PAYMON).Format("yyyyMM");
}
var LCDISPATCH_PAYCOUNT = arr[i].LCDISPATCH_PAYCOUNT;
if(arr[i].LCDISPATCH_PAYCOUNT==null){
	 LCDISPATCH_PAYCOUNT = '';
}
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-12">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+LCDISPATCH_ID+'"><strong>'+LCDISPATCH_ID+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人:'+ LCDISPATCH_TITLE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请单位(发薪单位):'+ LCDISPATCH_APPCOMPID +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工资年月:'+ LCDISPATCH_PAYMON +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">发放次数:'+ LCDISPATCH_PAYCOUNT +' </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#LC_DISPATCH_ENDTWO').append(cellObj);
}
}
		if(arr.length>0){
		}
	}
	 function showDate_Main(arr,total,e){
		$(e).css("display","none");$(e).attr("onclick","");
		 var cellObj = '';
		 for (var i = 0; i == 0; i--) {
var LCDISPATCH_ID = '';
if(arr.length>0&&arr[i].LCDISPATCH_ID!=null&&flowAction!='start'){
LCDISPATCH_ID = arr[i].LCDISPATCH_ID;
}
if(flowAction=='start'){
}
var LCDISPATCH_TITLE = '';
if(arr.length>0&&arr[i].LCDISPATCH_TITLE!=null&&flowAction!='start'){
LCDISPATCH_TITLE = arr[i].LCDISPATCH_TITLE;
}
if(flowAction=='start'){
LCDISPATCH_TITLE = EMP_NAME_session_4716;
}
var LCDISPATCH_APPCOMPID = '';
if(arr.length>0&&arr[i].LCDISPATCH_APPCOMPID!=null&&flowAction!='start'){
LCDISPATCH_APPCOMPID = arr[i].LCDISPATCH_APPCOMPID;
}
if(flowAction=='start'){
LCDISPATCH_APPCOMPID = PAYCOMP_session_4716;
}
var LCDISPATCH_APPEMPID = '';
if(arr.length>0&&arr[i].LCDISPATCH_APPEMPID!=null&&flowAction!='start'){
LCDISPATCH_APPEMPID = arr[i].LCDISPATCH_APPEMPID;
}
if(flowAction=='start'){
LCDISPATCH_APPEMPID = EMP_EMPID_session_4716;
}
var LCDISPATCH_PAYMON = '';
if(arr.length>0&&arr[i].LCDISPATCH_PAYMON!=null&&flowAction!='start'){
LCDISPATCH_PAYMON = arr[i].LCDISPATCH_PAYMON;
}
if(LCDISPATCH_PAYMON!=null&&LCDISPATCH_PAYMON!=""){
		}else{LCDISPATCH_PAYMON=""}
var LCDISPATCH_PAYCOUNT = '';
if(arr.length>0&&arr[i].LCDISPATCH_PAYCOUNT!=null&&flowAction!='start'){
LCDISPATCH_PAYCOUNT = arr[i].LCDISPATCH_PAYCOUNT;
}
var LCDISPATCH_FLAG = '';
if(arr.length>0&&arr[i].LCDISPATCH_FLAG!=null&&flowAction!='start'){
LCDISPATCH_FLAG = arr[i].LCDISPATCH_FLAG;
}
if(flowAction=='start'){
}
var LCDISPATCH_BUSINESSID = '';
if(arr.length>0&&arr[i].LCDISPATCH_BUSINESSID!=null&&flowAction!='start'){
LCDISPATCH_BUSINESSID = arr[i].LCDISPATCH_BUSINESSID;
}
if(flowAction=='start'){
}
var LCDISPATCH_NEXTAPP = '';
if(arr.length>0&&arr[i].LCDISPATCH_NEXTAPP!=null&&flowAction!='start'){
LCDISPATCH_NEXTAPP = arr[i].LCDISPATCH_NEXTAPP;
}
if(flowAction=='start'){
}
var LCDISPATCH_DEPID = '';
if(arr.length>0&&arr[i].LCDISPATCH_DEPID!=null&&flowAction!='start'){
LCDISPATCH_DEPID = arr[i].LCDISPATCH_DEPID;
}
if(flowAction=='start'){
LCDISPATCH_DEPID = EMP_DEPID_session_4716;
}
var LCDISPATCH_PAYCOMPID = '';
if(arr.length>0&&arr[i].LCDISPATCH_PAYCOMPID!=null&&flowAction!='start'){
LCDISPATCH_PAYCOMPID = arr[i].LCDISPATCH_PAYCOMPID;
}
if(flowAction=='start'){
LCDISPATCH_PAYCOMPID = PAYCOMPID_session_4716;
}
var LCDISPATCH_NEXTTOEMPID = '';
if(arr.length>0&&arr[i].LCDISPATCH_NEXTTOEMPID!=null&&flowAction!='start'){
LCDISPATCH_NEXTTOEMPID = arr[i].LCDISPATCH_NEXTTOEMPID;
}
if(flowAction=='start'){
}
var LCDISPATCH_COMPAREA = '';
if(arr.length>0&&arr[i].LCDISPATCH_COMPAREA!=null&&flowAction!='start'){
LCDISPATCH_COMPAREA = arr[i].LCDISPATCH_COMPAREA;
}
if(flowAction=='start'){
LCDISPATCH_COMPAREA = COMPAREA_session_4716;
}
var LCDISPATCH_XTYPE = '';
if(arr.length>0&&arr[i].LCDISPATCH_XTYPE!=null&&flowAction!='start'){
LCDISPATCH_XTYPE = arr[i].LCDISPATCH_XTYPE;
}
if(flowAction=='start'){
}
var LCDISPATCH_PARENTID = '';
if(arr.length>0&&arr[i].LCDISPATCH_PARENTID!=null&&flowAction!='start'){
LCDISPATCH_PARENTID = arr[i].LCDISPATCH_PARENTID;
}
if(flowAction=='start'){
LCDISPATCH_PARENTID = PARENTID_session_4716;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" id="MainElement" style="position: static;">'+
							'    <div class="contact-box">'+
							'		<form class="row cell" style="padding-right:50px;padding-bottom:40px">'+
  '	<input id="LC_DISPATCH.LCDISPATCH_ID_4716" name="LCDISPATCH_ID" value="'+LCDISPATCH_ID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">申请人: </label>'+
  '			<input id="LC_DISPATCH.LCDISPATCH_TITLE_4716" name="LCDISPATCH_TITLE" dataType="text" type="text" class="form-control" value="'+LCDISPATCH_TITLE+'" oninput="myFunction(this,\'LCDISPATCH_TITLE\')"  emptyText=""  vtype="illegalChar;maxLength:100;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">申请单位(发薪单位): </label>'+
  '			<input id="LC_DISPATCH.LCDISPATCH_APPCOMPID_4716" name="LCDISPATCH_APPCOMPID" dataType="text" type="text" class="form-control" value="'+LCDISPATCH_APPCOMPID+'" oninput="myFunction(this,\'LCDISPATCH_APPCOMPID\')"  emptyText=""  vtype="illegalChar;maxLength:100;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_DISPATCH.LCDISPATCH_APPEMPID_4716" name="LCDISPATCH_APPEMPID" value="'+LCDISPATCH_APPEMPID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工资年月: </label>'+
  '			<input id="LC_DISPATCH.LCDISPATCH_PAYMON_4716" name="LCDISPATCH_PAYMON" type="text" dateType="controls input-append date form_date5" class="form-control" value="'+LCDISPATCH_PAYMON+'" styleType="dateTime" readonly  style="width:200px;float:left;border-radius: 4px 0 0 4px;" format="yyyyMM" valueformat="yyyyMM" />'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">发放次数: </label>'+
  '			<input id="LC_DISPATCH.LCDISPATCH_PAYCOUNT_4716" name="LCDISPATCH_PAYCOUNT" dataType="text" type="text" class="form-control" value="'+LCDISPATCH_PAYCOUNT+'" oninput="myFunction(this,\'LCDISPATCH_PAYCOUNT\')"  vtype="illegalChar;maxLength:10;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_DISPATCH.LCDISPATCH_FLAG_4716" name="LCDISPATCH_FLAG" value="'+LCDISPATCH_FLAG+'"   type="hidden" >'+
  '	<input id="LC_DISPATCH.LCDISPATCH_BUSINESSID_4716" name="LCDISPATCH_BUSINESSID" value="'+LCDISPATCH_BUSINESSID+'"   type="hidden" >'+
  '	<input id="LC_DISPATCH.LCDISPATCH_NEXTAPP_4716" name="LCDISPATCH_NEXTAPP" value="'+LCDISPATCH_NEXTAPP+'"   type="hidden" >'+
  '	<input id="LC_DISPATCH.LCDISPATCH_DEPID_4716" name="LCDISPATCH_DEPID" value="'+LCDISPATCH_DEPID+'"   type="hidden" >'+
  '	<input id="LC_DISPATCH.LCDISPATCH_PAYCOMPID_4716" name="LCDISPATCH_PAYCOMPID" value="'+LCDISPATCH_PAYCOMPID+'"   type="hidden" >'+
  '	<input id="LC_DISPATCH.LCDISPATCH_NEXTTOEMPID_4716" name="LCDISPATCH_NEXTTOEMPID" value="'+LCDISPATCH_NEXTTOEMPID+'"   type="hidden" >'+
  '	<input id="LC_DISPATCH.LCDISPATCH_COMPAREA_4716" name="LCDISPATCH_COMPAREA" value="'+LCDISPATCH_COMPAREA+'"   type="hidden" >'+
  '	<input id="LC_DISPATCH.LCDISPATCH_XTYPE_4716" name="LCDISPATCH_XTYPE" value="'+LCDISPATCH_XTYPE+'"   type="hidden" >'+
  '	<input id="LC_DISPATCH.LCDISPATCH_PARENTID_4716" name="LCDISPATCH_PARENTID" value="'+LCDISPATCH_PARENTID+'"   type="hidden" >'+
							'	<div>'+
							'		<input id="submitButton_main" type="hidden" />'+
							'	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
	$(".mainFormElement").append(cellObj);
		var cellObj1 = '	<div id="main_buttons" style="position:absolute;bottom:0px;left:50%;-webkit-transform: translate(-50%, -50%);">';
		if(flowAction=='start'){
		}else{
			cellObj1 +=		'		<input class="btn btn-info checkButton" id="approved_main" type="button" value="通过" onclick="approved_refer_6406(\'通过\')"/>'+
'		<input class="btn btn-info checkButton" id="approved1_main" type="button" value="驳回" onclick="approved_refer_6407(\'驳回\')"/>'+
'		<input class="btn btn-info checkButton" id="temporaryStorage_main" type="button" value="暂存" onclick="temporaryStorage_save_6408()"/>'+
							'	</div>';
		}
	$("#CardAndCardForm").append(cellObj1);
	elementsListSelectInitFunction('#submitButton_main');//初始化新增下拉控件
	elementsListCheckboxInitFunction('#submitButton_main');//初始化单选控件
	elementsListRadioInitFunction('#submitButton_main');//初始化单选控件
	cardDateWidInitFunction();//初始化新增日期控件
	}
</script>
</body>
</html>