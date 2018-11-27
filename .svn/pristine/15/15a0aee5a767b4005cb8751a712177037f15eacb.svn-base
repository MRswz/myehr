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
<script type="text/javascript" src="Leaveprocess_tab.js"></script>
<script type="text/javascript" src="../js/html2canvas.js"></script></head>
<body class="gray-bg" >
<div class="container-fluid" id="CardAndCardForm" style="height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;">
<div class="row mainFormElement" style="margin-left:0;padding: 0 15px 0 0;position:relative;" id="Leaveprocess">
<input type="button" id="zhankai_main"  class="btn btn-info CCButtonelement" value="展开" style="position:absolute;right:30px;bottom:10px;z-index:999" onclick="showDate_Main(main_Datas,0,0)"/>
<input type="button" id="print"  class="btn btn-info CCButtonelement" value="展开" style="position:absolute;right:30px;bottom:10px;z-index:999" onclick="printHtml()"/>
</div>
<div id="fubiao1" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">附件</h3>
<div class="BTNGROUP" style="padding:0 30px 0 0; display:inline-block;height: 35px;width:100%">
<div name="button" class="CCButton" style="margin-right:10px;float:right;">
	<input type="button" id="zhankai"  class="btn btn-info CCButtonelement" value="展开" onclick="changeFunction('fubiao1')"/>
	<input type="button" id="xinzeng" class="btn btn-info CCButtonelement" value="新增" onclick="addFunction('fubiao1')"/>
</div>
<div class="CCSelect" style="float:right;width:50%">
	<select id="showType" title="显示类型" styletype="select" name="showType" class="form-control CCShow" onchange="changeShowType('fubiao1')" style="float:right;width:95px;margin-left:5px;">
		<option value="youxiao" selected="">有效</option>
		<option value="zuixin">最新</option>
		<option value="all">所有</option>
	</select>
	<select id="showContent" title="显示内容" styletype="select" name="showContent" class="form-control CCShow" onchange="changeShowType('fubiao1')" style="float:right;width:95px;margin-left:5px;">
		<option value="account" selected="">合计</option>
	</select>
</div>
</div>
<!--展示部分-->
<div class="row" style="margin-left:0;padding: 0 15px 0 0;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #307DE9;padding:0;" id="TEST_FEE_INFO_FORM2">
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

<img src="" id="showImg" alt="上海鲜花港 - 郁金香" />
<script>
	var _formId_4384='4384';
var realFormId='${param.formId}';
var EMPCODE_session_4384='${sessionScope.EMPCODE}';
var EMP_EMPID_session_4384='${sessionScope.EMP_EMPID}';
var EMP_NAME_session_4384='${sessionScope.EMP_NAME}';
var COM_COMPID_session_4384='${sessionScope.COM_COMPID}';
var A_NAME_session_4384='${sessionScope.A_NAME}';
var JOB_NAME_session_4384='${sessionScope.JOB_NAME}';
var EMP_DEPID_session_4384='${sessionScope.EMP_DEPID}';
var EMP_JOBID_session_4384='${sessionScope.EMP_JOBID}';
var JOBRANK_session_4384='${sessionScope.JOBRANK}';
var WORKAGE_session_4384='${sessionScope.WORKAGE}';
var JOBRANKname_session_4384='${sessionScope.JOBRANKname}';
var amount_session_4384='${sessionScope.amount}';
var amountone_session_4384='${sessionScope.amountone}';
var xvalueone_session_4384='${sessionScope.xvalueone}';
var xvalue_session_4384='${sessionScope.xvalue}';
var COMPTYPE_session_4384='${sessionScope.COMPTYPE}';
var businessId_parameter_4384='${param.businessId}';
var JOBGRADE_session_4384='${sessionScope.JOBGRADE}';
var WHELEADER_session_4384='${sessionScope.WHELEADER}';
var param_empIds = '${param.empIds}';
var isApp = '${param.formType}';
var formId_main = '4384';
var flowAction = '${param.flowAction}';
var BUSSINESSID_ACT = '${param.businessId}';
$(document).ready(function () {
loadDataStart();
$("#zhankai_main").click();
$("#fubiao1 #showType").val('youxiao');
changeShowType('fubiao1');
var sizeLimit = '0';
var typeLimit = null;
var numLimit = "10";
initFileManage2His('','','','','','fubiao1',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID_${param.key}',BUSSINESSID_ACT);
initFileManage2New('','','','','','fubiao1',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID_${param.key}',BUSSINESSID_ACT);
changeFileCss();
$("#zhankaiComment").click();
})
var BUSINESSID;var heightGadedata_4384 =[];
var containerParam_4384 ={};
containerParam_4384 ={};
function changeHeightGadedata_4384(data){
	heightGadedata_4384 = data;
}
var heightGadedata_4578 =[];
var containerParam_4578 ={};
containerParam_4578 ={};
function changeHeightGadedata_4578(data){
	heightGadedata_4578 = data;
}
var _formId_4578='4578';
var filterParam = {};
var queryParams;
function grid_Leaveprocess_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Leaveprocess_filter')){
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
	pageReqeust.containerParam=containerParam_4384;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4384;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4384!=null&&heightGadedata_4384!=undefined){
		pageReqeust.heightGrade = heightGadedata_4384;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Leaveprocess_fun11_4384(){
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
var containerParam_4384={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_Leaveprocess_fun(xx),//HTTP请求类型
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
function showDate_4384(arr) {
if('${param.flowAction}'=='start'){
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" ></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">姓名: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人机构: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人姓名: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工龄: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工号: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">结余年休: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">结余存休: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">累计事假: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">职务级别: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">累计病假: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">请假类别: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">请假事由: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">请假开始时间: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">请假结束时间: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">合计天数: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">外出工作单位: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">联系人: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">电话: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工作承接人: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">机构类型: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位级别: </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#Leaveprocess').append(cellObj);
}else{
for (var i = arr.length - 1; i >= 0; i--) {
var LCLEAVE_tltie = arr[i].LCLEAVE_TLTIE;
if(arr[i].LCLEAVE_TLTIE==null){
	 LCLEAVE_tltie = '';
}
var LCLEAVE_cname = arr[i].LCLEAVE_CNAME;
if(arr[i].LCLEAVE_CNAME==null){
	 LCLEAVE_cname = '';
}
var LCLEAVE_ncompid = arr[i].LCLEAVE_NCOMPID;
if(arr[i].LCLEAVE_NCOMPID==null){
	 LCLEAVE_ncompid = '';
}
var LCLEAVE_ndepid = arr[i].LCLEAVE_NDEPID;
if(arr[i].LCLEAVE_NDEPID==null){
	 LCLEAVE_ndepid = '';
}
var LCLEAVE_njobid = arr[i].LCLEAVE_NJOBID;
if(arr[i].LCLEAVE_NJOBID==null){
	 LCLEAVE_njobid = '';
}
var LCLEAVE_empidd = arr[i].LCLEAVE_EMPIDD;
if(arr[i].LCLEAVE_EMPIDD==null){
	 LCLEAVE_empidd = '';
}
var LCLEAVE_WORKAGE = arr[i].LCLEAVE_WORKAGE;
if(arr[i].LCLEAVE_WORKAGE==null){
	 LCLEAVE_WORKAGE = '';
}
var LCLEAVE_empcode = arr[i].LCLEAVE_EMPCODE;
if(arr[i].LCLEAVE_EMPCODE==null){
	 LCLEAVE_empcode = '';
}
var LCLEAVE_AMOUNT = arr[i].LCLEAVE_AMOUNT;
if(arr[i].LCLEAVE_AMOUNT==null){
	 LCLEAVE_AMOUNT = '';
}
var LCLEAVE_SURPLUSREST = arr[i].LCLEAVE_SURPLUSREST;
if(arr[i].LCLEAVE_SURPLUSREST==null){
	 LCLEAVE_SURPLUSREST = '';
}
var LCLEAVE_ACCUMULATIVE = arr[i].LCLEAVE_ACCUMULATIVE;
if(arr[i].LCLEAVE_ACCUMULATIVE==null){
	 LCLEAVE_ACCUMULATIVE = '';
}
var LCLEAVE_JOBRANKname = arr[i].LCLEAVE_JOBRANKNAME;
if(arr[i].LCLEAVE_JOBRANKNAME==null){
	 LCLEAVE_JOBRANKname = '';
}
var LCLEAVE_SICKLEAVE = arr[i].LCLEAVE_SICKLEAVE;
if(arr[i].LCLEAVE_SICKLEAVE==null){
	 LCLEAVE_SICKLEAVE = '';
}
var LCLEAVE_LEAVETYPE = arr[i].LCLEAVE_LEAVETYPE;
if(arr[i].LCLEAVE_LEAVETYPE!=null){
	 LCLEAVE_LEAVETYPE = new Date(LCLEAVE_LEAVETYPE).Format("sql|sql121");
}
var LCLEAVE_REASON = arr[i].LCLEAVE_REASON;
if(arr[i].LCLEAVE_REASON==null){
	 LCLEAVE_REASON = '';
}
var LCLEAVE_BEGINTIME = arr[i].LCLEAVE_BEGINTIME;
if(arr[i].LCLEAVE_BEGINTIME!=null){
	 LCLEAVE_BEGINTIME = new Date(LCLEAVE_BEGINTIME).Format("yyyy-MM-dd");
}
var LCLEAVE_EMDTIME = arr[i].LCLEAVE_EMDTIME;
if(arr[i].LCLEAVE_EMDTIME!=null){
	 LCLEAVE_EMDTIME = new Date(LCLEAVE_EMDTIME).Format("yyyy-MM-dd");
}
var LCLEAVE_XVALUE = arr[i].LCLEAVE_XVALUE;
if(arr[i].LCLEAVE_XVALUE==null){
	 LCLEAVE_XVALUE = '';
}
var LCLEAVE_OUTGOING = arr[i].LCLEAVE_OUTGOING;
if(arr[i].LCLEAVE_OUTGOING==null){
	 LCLEAVE_OUTGOING = '';
}
var LCLEAVE_CONTACTS = arr[i].LCLEAVE_CONTACTS;
if(arr[i].LCLEAVE_CONTACTS==null){
	 LCLEAVE_CONTACTS = '';
}
var LCLEAVE_PHONE = arr[i].LCLEAVE_PHONE;
if(arr[i].LCLEAVE_PHONE==null){
	 LCLEAVE_PHONE = '';
}
var LCLEAVE_WORKCONTRACTOR = arr[i].LCLEAVE_WORKCONTRACTOR;
if(arr[i].LCLEAVE_WORKCONTRACTOR==null){
	 LCLEAVE_WORKCONTRACTOR = '';
}
var LCLEAVE_COMPTYPE = arr[i].LCLEAVE_COMPTYPE;
if(arr[i].LCLEAVE_COMPTYPE==null){
	 LCLEAVE_COMPTYPE = '';
}
var LCLEAVE_JOBGRADE = arr[i].LCLEAVE_JOBGRADE;
if(arr[i].LCLEAVE_JOBGRADE==null){
	 LCLEAVE_JOBGRADE = '';
}
var LCLEAVE_WHELEADER = arr[i].LCLEAVE_WHELEADER;
if(arr[i].LCLEAVE_WHELEADER==null){
	 LCLEAVE_WHELEADER = '';
}
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+LCLEAVE_tltie+'"><strong>'+LCLEAVE_tltie+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">姓名:'+ LCLEAVE_cname +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人机构:'+ LCLEAVE_ncompid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门:'+ LCLEAVE_ndepid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位:'+ LCLEAVE_njobid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人姓名:'+ LCLEAVE_empidd +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工龄:'+ LCLEAVE_WORKAGE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工号:'+ LCLEAVE_empcode +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">结余年休:'+ LCLEAVE_AMOUNT +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">结余存休:'+ LCLEAVE_SURPLUSREST +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">累计事假:'+ LCLEAVE_ACCUMULATIVE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">职务级别:'+ LCLEAVE_JOBRANKname +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">累计病假:'+ LCLEAVE_SICKLEAVE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">请假类别:'+ LCLEAVE_LEAVETYPE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">请假事由:'+ LCLEAVE_REASON +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">请假开始时间:'+ LCLEAVE_BEGINTIME +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">请假结束时间:'+ LCLEAVE_EMDTIME +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">合计天数:'+ LCLEAVE_XVALUE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">外出工作单位:'+ LCLEAVE_OUTGOING +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">联系人:'+ LCLEAVE_CONTACTS +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">电话:'+ LCLEAVE_PHONE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工作承接人:'+ LCLEAVE_WORKCONTRACTOR +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">机构类型:'+ LCLEAVE_COMPTYPE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位级别:'+ LCLEAVE_JOBGRADE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否一把手:'+ LCLEAVE_WHELEADER +' </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#Leaveprocess').append(cellObj);
}
}
	}
	 function showDate_Main(arr,total,e){
		$(e).css("display","none");$(e).attr("onclick","");
		 var cellObj = '';
		 for (var i = 0; i == 0; i--) {
var LCLEAVE_EMPCODE = '';
if(arr.length>0&&arr[i].LCLEAVE_EMPCODE!=null&&flowAction!='start'){
LCLEAVE_EMPCODE = arr[i].LCLEAVE_EMPCODE;
}
if(flowAction=='start'){
LCLEAVE_EMPCODE = EMPCODE_session_4384;
}
var LCLEAVE_TLTIE = '';
if(arr.length>0&&arr[i].LCLEAVE_TLTIE!=null&&flowAction!='start'){
LCLEAVE_TLTIE = arr[i].LCLEAVE_TLTIE;
}
if(flowAction=='start'){
}
var LCLEAVE_EMPID = '';
if(arr.length>0&&arr[i].LCLEAVE_EMPID!=null&&flowAction!='start'){
LCLEAVE_EMPID = arr[i].LCLEAVE_EMPID;
}
if(flowAction=='start'){
LCLEAVE_EMPID = EMP_EMPID_session_4384;
}
var LCLEAVE_CNAME = '';
if(arr.length>0&&arr[i].LCLEAVE_CNAME!=null&&flowAction!='start'){
LCLEAVE_CNAME = arr[i].LCLEAVE_CNAME;
}
if(flowAction=='start'){
LCLEAVE_CNAME = EMP_NAME_session_4384;
}
var LCLEAVE_COMPID = '';
if(arr.length>0&&arr[i].LCLEAVE_COMPID!=null&&flowAction!='start'){
LCLEAVE_COMPID = arr[i].LCLEAVE_COMPID;
}
if(flowAction=='start'){
LCLEAVE_COMPID = COM_COMPID_session_4384;
}
var LCLEAVE_NDEPID = '';
if(arr.length>0&&arr[i].LCLEAVE_NDEPID!=null&&flowAction!='start'){
LCLEAVE_NDEPID = arr[i].LCLEAVE_NDEPID;
}
if(flowAction=='start'){
LCLEAVE_NDEPID = A_NAME_session_4384;
}
var LCLEAVE_NJOBID = '';
if(arr.length>0&&arr[i].LCLEAVE_NJOBID!=null&&flowAction!='start'){
LCLEAVE_NJOBID = arr[i].LCLEAVE_NJOBID;
}
if(flowAction=='start'){
LCLEAVE_NJOBID = JOB_NAME_session_4384;
}
var LCLEAVE_DEPID = '';
if(arr.length>0&&arr[i].LCLEAVE_DEPID!=null&&flowAction!='start'){
LCLEAVE_DEPID = arr[i].LCLEAVE_DEPID;
}
if(flowAction=='start'){
LCLEAVE_DEPID = EMP_DEPID_session_4384;
}
var LCLEAVE_JOBID = '';
if(arr.length>0&&arr[i].LCLEAVE_JOBID!=null&&flowAction!='start'){
LCLEAVE_JOBID = arr[i].LCLEAVE_JOBID;
}
if(flowAction=='start'){
LCLEAVE_JOBID = EMP_JOBID_session_4384;
}
var LCLEAVE_JOBRANK = '';
if(arr.length>0&&arr[i].LCLEAVE_JOBRANK!=null&&flowAction!='start'){
LCLEAVE_JOBRANK = arr[i].LCLEAVE_JOBRANK;
}
if(flowAction=='start'){
LCLEAVE_JOBRANK = JOBRANK_session_4384;
}
var LCLEAVE_WORKAGE = '';
if(arr.length>0&&arr[i].LCLEAVE_WORKAGE!=null&&flowAction!='start'){
LCLEAVE_WORKAGE = arr[i].LCLEAVE_WORKAGE;
}
if(flowAction=='start'){
LCLEAVE_WORKAGE = WORKAGE_session_4384;
}
var LCLEAVE_JOBTITLENAME = '';
if(arr.length>0&&arr[i].LCLEAVE_JOBTITLENAME!=null&&flowAction!='start'){
LCLEAVE_JOBTITLENAME = arr[i].LCLEAVE_JOBTITLENAME;
}
var LCLEAVE_JOBRANKNAME = '';
if(arr.length>0&&arr[i].LCLEAVE_JOBRANKNAME!=null&&flowAction!='start'){
LCLEAVE_JOBRANKNAME = arr[i].LCLEAVE_JOBRANKNAME;
}
if(flowAction=='start'){
LCLEAVE_JOBRANKNAME = JOBRANKname_session_4384;
}
var LCLEAVE_AMOUNT = '';
if(arr.length>0&&arr[i].LCLEAVE_AMOUNT!=null&&flowAction!='start'){
LCLEAVE_AMOUNT = arr[i].LCLEAVE_AMOUNT;
}
if(flowAction=='start'){
LCLEAVE_AMOUNT = amount_session_4384;
}
var LCLEAVE_SURPLUSREST = '';
if(arr.length>0&&arr[i].LCLEAVE_SURPLUSREST!=null&&flowAction!='start'){
LCLEAVE_SURPLUSREST = arr[i].LCLEAVE_SURPLUSREST;
}
if(flowAction=='start'){
LCLEAVE_SURPLUSREST = amountone_session_4384;
}
var LCLEAVE_ACCUMULATIVE = '';
if(arr.length>0&&arr[i].LCLEAVE_ACCUMULATIVE!=null&&flowAction!='start'){
LCLEAVE_ACCUMULATIVE = arr[i].LCLEAVE_ACCUMULATIVE;
}
if(flowAction=='start'){
LCLEAVE_ACCUMULATIVE = xvalueone_session_4384;
}
var LCLEAVE_SICKLEAVE = '';
if(arr.length>0&&arr[i].LCLEAVE_SICKLEAVE!=null&&flowAction!='start'){
LCLEAVE_SICKLEAVE = arr[i].LCLEAVE_SICKLEAVE;
}
if(flowAction=='start'){
LCLEAVE_SICKLEAVE = xvalue_session_4384;
}
var LCLEAVE_LEAVETYPE = '';
if(arr.length>0&&arr[i].LCLEAVE_LEAVETYPE!=null&&flowAction!='start'){
LCLEAVE_LEAVETYPE = arr[i].LCLEAVE_LEAVETYPE;
}
var LCLEAVE_REASON = '';
if(arr.length>0&&arr[i].LCLEAVE_REASON!=null&&flowAction!='start'){
LCLEAVE_REASON = arr[i].LCLEAVE_REASON;
}
var LCLEAVE_BEGINTIME = '';
if(arr.length>0&&arr[i].LCLEAVE_BEGINTIME!=null&&flowAction!='start'){
LCLEAVE_BEGINTIME = arr[i].LCLEAVE_BEGINTIME;
}
if(LCLEAVE_BEGINTIME!=null&&LCLEAVE_BEGINTIME!=""){
LCLEAVE_BEGINTIME = new Date(parseInt(LCLEAVE_BEGINTIME)).Format("yyyy-MM-dd");
}else{LCLEAVE_BEGINTIME=""}
var LCLEAVE_EMDTIME = '';
if(arr.length>0&&arr[i].LCLEAVE_EMDTIME!=null&&flowAction!='start'){
LCLEAVE_EMDTIME = arr[i].LCLEAVE_EMDTIME;
}
if(LCLEAVE_EMDTIME!=null&&LCLEAVE_EMDTIME!=""){
LCLEAVE_EMDTIME = new Date(parseInt(LCLEAVE_EMDTIME)).Format("yyyy-MM-dd");
}else{LCLEAVE_EMDTIME=""}
var LCLEAVE_XVALUE = '';
if(arr.length>0&&arr[i].LCLEAVE_XVALUE!=null&&flowAction!='start'){
LCLEAVE_XVALUE = arr[i].LCLEAVE_XVALUE;
}
var LCLEAVE_OUTGOING = '';
if(arr.length>0&&arr[i].LCLEAVE_OUTGOING!=null&&flowAction!='start'){
LCLEAVE_OUTGOING = arr[i].LCLEAVE_OUTGOING;
}
var LCLEAVE_CONTACTS = '';
if(arr.length>0&&arr[i].LCLEAVE_CONTACTS!=null&&flowAction!='start'){
LCLEAVE_CONTACTS = arr[i].LCLEAVE_CONTACTS;
}
var LCLEAVE_PHONE = '';
if(arr.length>0&&arr[i].LCLEAVE_PHONE!=null&&flowAction!='start'){
LCLEAVE_PHONE = arr[i].LCLEAVE_PHONE;
}
var LCLEAVE_WORKCONTRACTOR = '';
if(arr.length>0&&arr[i].LCLEAVE_WORKCONTRACTOR!=null&&flowAction!='start'){
LCLEAVE_WORKCONTRACTOR = arr[i].LCLEAVE_WORKCONTRACTOR;
}
var LCLEAVE_CONTACTNYMBER = '';
if(arr.length>0&&arr[i].LCLEAVE_CONTACTNYMBER!=null&&flowAction!='start'){
LCLEAVE_CONTACTNYMBER = arr[i].LCLEAVE_CONTACTNYMBER;
}
var LCLEAVE_COMPTYPE = '';
if(arr.length>0&&arr[i].LCLEAVE_COMPTYPE!=null&&flowAction!='start'){
LCLEAVE_COMPTYPE = arr[i].LCLEAVE_COMPTYPE;
}
if(flowAction=='start'){
LCLEAVE_COMPTYPE = COMPTYPE_session_4384;
}
var LCLEAVE_ID = '';
if(arr.length>0&&arr[i].LCLEAVE_ID!=null&&flowAction!='start'){
LCLEAVE_ID = arr[i].LCLEAVE_ID;
}
if(flowAction=='start'){
LCLEAVE_ID = businessId_parameter_4384;
}
var LCLEAVE_NCOMPID = '';
if(arr.length>0&&arr[i].LCLEAVE_NCOMPID!=null&&flowAction!='start'){
LCLEAVE_NCOMPID = arr[i].LCLEAVE_NCOMPID;
}
if(flowAction=='start'){
}
var LCLEAVE_EMPIDD = '';
if(arr.length>0&&arr[i].LCLEAVE_EMPIDD!=null&&flowAction!='start'){
LCLEAVE_EMPIDD = arr[i].LCLEAVE_EMPIDD;
}
if(flowAction=='start'){
}
var LCLEAVE_JOBGRADE = '';
if(arr.length>0&&arr[i].LCLEAVE_JOBGRADE!=null&&flowAction!='start'){
LCLEAVE_JOBGRADE = arr[i].LCLEAVE_JOBGRADE;
}
if(flowAction=='start'){
LCLEAVE_JOBGRADE = JOBGRADE_session_4384;
}
var LCLEAVE_JOBSTYLE = '';
if(arr.length>0&&arr[i].LCLEAVE_JOBSTYLE!=null&&flowAction!='start'){
LCLEAVE_JOBSTYLE = arr[i].LCLEAVE_JOBSTYLE;
}
if(flowAction=='start'){
}
var LCLEAVE_WHELEADER = '';
if(arr.length>0&&arr[i].LCLEAVE_WHELEADER!=null&&flowAction!='start'){
LCLEAVE_WHELEADER = arr[i].LCLEAVE_WHELEADER;
}
if(flowAction=='start'){
LCLEAVE_WHELEADER = WHELEADER_session_4384;
}
var LCLEAVE_BELONGLINE = '';
if(arr.length>0&&arr[i].LCLEAVE_BELONGLINE!=null&&flowAction!='start'){
LCLEAVE_BELONGLINE = arr[i].LCLEAVE_BELONGLINE;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" id="MainElement" style="position: static;">'+
							'    <div class="contact-box">'+
							'		<form class="row cell" style="padding-right:50px;padding-bottom:40px">'+
'<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">基本信息</h3>'+
'<div class="row cell">'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工号: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_EMPCODE_4384" name="LCLEAVE_EMPCODE" dataType="text" type="text" class="form-control" value="'+LCLEAVE_EMPCODE+'" oninput="myFunction(this,\'LCLEAVE_EMPCODE\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_LEAVE.LCLEAVE_TLTIE_4384" name="LCLEAVE_TLTIE" value="'+LCLEAVE_TLTIE+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_EMPID_4384" name="LCLEAVE_EMPID" value="'+LCLEAVE_EMPID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_CNAME_4384" name="LCLEAVE_CNAME" dataType="text" type="text" class="form-control" value="'+LCLEAVE_CNAME+'" oninput="myFunction(this,\'LCLEAVE_CNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_LEAVE.LCLEAVE_COMPID_4384" name="LCLEAVE_COMPID" value="'+LCLEAVE_COMPID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">部门: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_NDEPID_4384" name="LCLEAVE_NDEPID" dataType="text" type="text" class="form-control" value="'+LCLEAVE_NDEPID+'" oninput="myFunction(this,\'LCLEAVE_NDEPID\')"  emptyText=""  vtype="illegalChar;maxLength:10;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">岗位: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_NJOBID_4384" name="LCLEAVE_NJOBID" dataType="text" type="text" class="form-control" value="'+LCLEAVE_NJOBID+'" oninput="myFunction(this,\'LCLEAVE_NJOBID\')"  emptyText=""  vtype="illegalChar;maxLength:10;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_LEAVE.LCLEAVE_DEPID_4384" name="LCLEAVE_DEPID" value="'+LCLEAVE_DEPID+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_JOBID_4384" name="LCLEAVE_JOBID" value="'+LCLEAVE_JOBID+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_JOBRANK_4384" name="LCLEAVE_JOBRANK" value="'+LCLEAVE_JOBRANK+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工龄: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_WORKAGE_4384" name="LCLEAVE_WORKAGE" dataType="text" type="text" class="form-control" value="'+LCLEAVE_WORKAGE+'" oninput="myFunction(this,\'LCLEAVE_WORKAGE\')"  emptyText=""  vtype="illegalChar;maxLength:10;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_LEAVE.LCLEAVE_JOBTITLENAME_4384" name="LCLEAVE_JOBTITLENAME" value="'+LCLEAVE_JOBTITLENAME+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">职务级别: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_JOBRANKNAME_4384" name="LCLEAVE_JOBRANKNAME" dataType="text" type="text" class="form-control" value="'+LCLEAVE_JOBRANKNAME+'" oninput="myFunction(this,\'LCLEAVE_JOBRANKNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
'</div>'+
'<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">请假信息</h3>'+
'<div class="row cell">'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">结余年休: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_AMOUNT_4384" name="LCLEAVE_AMOUNT" dataType="text" type="text" class="form-control" value="'+LCLEAVE_AMOUNT+'" oninput="myFunction(this,\'LCLEAVE_AMOUNT\')"  emptyText=""  vtype="illegalChar;maxLength:18;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">结余存休: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_SURPLUSREST_4384" name="LCLEAVE_SURPLUSREST" dataType="text" type="text" class="form-control" value="'+LCLEAVE_SURPLUSREST+'" oninput="myFunction(this,\'LCLEAVE_SURPLUSREST\')"  emptyText=""  vtype="illegalChar;maxLength:18;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">累计事假: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_ACCUMULATIVE_4384" name="LCLEAVE_ACCUMULATIVE" dataType="text" type="text" class="form-control" value="'+LCLEAVE_ACCUMULATIVE+'" oninput="myFunction(this,\'LCLEAVE_ACCUMULATIVE\')"  emptyText=""  vtype="illegalChar;maxLength:18;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">累计病假: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_SICKLEAVE_4384" name="LCLEAVE_SICKLEAVE" dataType="text" type="text" class="form-control" value="'+LCLEAVE_SICKLEAVE+'" oninput="myFunction(this,\'LCLEAVE_SICKLEAVE\')"  emptyText=""  vtype="illegalChar;maxLength:18;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">请假类别: </label>'+
  '			<select id="LC_LEAVE.LCLEAVE_LEAVETYPE_4384" title="请假类别" styleType="select" name="LCLEAVE_LEAVETYPE" columnId="84478"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  dataField1 = "sql"  required="true"  style="float:left;width:200px;" textField="text" valueField="id" DictName="sql121" dataField="data_form_84478"initParam = "_"></select>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">请假事由: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_REASON_4384" name="LCLEAVE_REASON" dataType="text" type="text" class="form-control" value="'+LCLEAVE_REASON+'" oninput="myFunction(this,\'LCLEAVE_REASON\')"  vtype="illegalChar;maxLength:200;minLength:null;"  required="true"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">请假开始时间: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="LC_LEAVE.LCLEAVE_BEGINTIME_4384" styleType="dateTime" value="'+LCLEAVE_BEGINTIME+'"  style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="LCLEAVE_BEGINTIME"  required="true"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">请假结束时间: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="LC_LEAVE.LCLEAVE_EMDTIME_4384" styleType="dateTime" value="'+LCLEAVE_EMDTIME+'"  style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="LCLEAVE_EMDTIME"  required="true"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">合计天数: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_XVALUE_4384" name="LCLEAVE_XVALUE" dataType="text" type="text" class="form-control" value="'+LCLEAVE_XVALUE+'" oninput="myFunction(this,\'LCLEAVE_XVALUE\')"  vtype="illegalChar;maxLength:18;minLength:null;"  required="true"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">外出工作单位: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_OUTGOING_4384" name="LCLEAVE_OUTGOING" dataType="text" type="text" class="form-control" value="'+LCLEAVE_OUTGOING+'" oninput="myFunction(this,\'LCLEAVE_OUTGOING\')"  vtype="illegalChar;maxLength:50;minLength:null;"  required="true"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">联系人: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_CONTACTS_4384" name="LCLEAVE_CONTACTS" dataType="text" type="text" class="form-control" value="'+LCLEAVE_CONTACTS+'" oninput="myFunction(this,\'LCLEAVE_CONTACTS\')"  vtype="illegalChar;maxLength:50;minLength:null;"  required="true"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">电话: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_PHONE_4384" name="LCLEAVE_PHONE" dataType="text" type="text" class="form-control" value="'+LCLEAVE_PHONE+'" oninput="myFunction(this,\'LCLEAVE_PHONE\')"  vtype="illegalChar;maxLength:50;minLength:null;"  required="true"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工作承接人: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_WORKCONTRACTOR_4384" name="LCLEAVE_WORKCONTRACTOR" dataType="text" type="text" class="form-control" value="'+LCLEAVE_WORKCONTRACTOR+'" oninput="myFunction(this,\'LCLEAVE_WORKCONTRACTOR\')"  vtype="illegalChar;maxLength:50;minLength:null;"  required="true"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">联系电话: </label>'+
  '			<input id="LC_LEAVE.LCLEAVE_CONTACTNYMBER_4384" name="LCLEAVE_CONTACTNYMBER" dataType="text" type="text" class="form-control" value="'+LCLEAVE_CONTACTNYMBER+'" oninput="myFunction(this,\'LCLEAVE_CONTACTNYMBER\')"  vtype="illegalChar;maxLength:50;minLength:null;"  required="true"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_LEAVE.LCLEAVE_COMPTYPE_4384" name="LCLEAVE_COMPTYPE" value="'+LCLEAVE_COMPTYPE+'"   type="hidden" >'+
'</div>'+
  '	<input id="LC_LEAVE.LCLEAVE_ID_4384" name="LCLEAVE_ID" value="'+LCLEAVE_ID+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_NCOMPID_4384" name="LCLEAVE_NCOMPID" value="'+LCLEAVE_NCOMPID+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_EMPIDD_4384" name="LCLEAVE_EMPIDD" value="'+LCLEAVE_EMPIDD+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_JOBGRADE_4384" name="LCLEAVE_JOBGRADE" value="'+LCLEAVE_JOBGRADE+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_JOBSTYLE_4384" name="LCLEAVE_JOBSTYLE" value="'+LCLEAVE_JOBSTYLE+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_WHELEADER_4384" name="LCLEAVE_WHELEADER" value="'+LCLEAVE_WHELEADER+'"   type="hidden" >'+
  '	<input id="LC_LEAVE.LCLEAVE_BELONGLINE_4384" name="LCLEAVE_BELONGLINE" value="'+LCLEAVE_BELONGLINE+'"   type="hidden" >'+
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
			cellObj1 +=		'<input class="btn btn-info submitButton" id="submitButton_main1" type="button" value="提交" style="width:50px" onclick="submitButton_save_6074()"/>';
		}else{
			cellObj1 +=		'		<input class="btn btn-info checkButton" id="approved_main" type="button" value="通过" onclick="approved_refer_6075(\'通过\')"/>'+
'		<input class="btn btn-info checkButton" id="approved1_main" type="button" value="驳回" onclick="approved_refer_6076(\'驳回\')"/>'+
'		<input class="btn btn-info checkButton" id="temporaryStorage_main" type="button" value="暂存" onclick="temporaryStorage_save_6077()"/>'+
							'	</div>';
		}
	$("#CardAndCardForm").append(cellObj1);
	elementsListSelectInitFunction('#submitButton_main');//初始化新增下拉控件
	elementsListCheckboxInitFunction('#submitButton_main');//初始化单选控件
	elementsListRadioInitFunction('#submitButton_main');//初始化单选控件
	cardDateWidInitFunction();//初始化新增日期控件
$("[id='LC_LEAVE.LCLEAVE_LEAVETYPE_4384']").val(LCLEAVE_LEAVETYPE);
	}
	
	function printHtml(){
		//$("#CardAndCardForm")
		html2canvas($("#CardAndCardForm")).then(function(canvas) {
	         var imgUri = canvas.toDataURL("image/png"); // 获取生成的图片的url
	         $("#showImg").attr("src",imgUri);
			 //window.location.href= imgUri; // 下载图片
	    });

	}
	
</script>
</body>
</html>