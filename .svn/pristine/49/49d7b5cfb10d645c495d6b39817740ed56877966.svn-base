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
<script type="text/javascript" src="../../js/LC_Branchstaffing_tab.js"></script></head>
<body class="gray-bg" >
<div class="container-fluid" id="CardAndCardForm" style="height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;">
<div class="row mainFormElement" style="margin-left:0;padding: 0 15px 0 0;position:relative;" id="LC_Branchstaffing">
<input type="button" id="zhankai_main"  class="btn btn-info CCButtonelement" value="展开" style="position:absolute;right:30px;bottom:10px;z-index:999" onclick="showDate_Main(main_Datas,0,this)"/>
</div>
<div id="fubiao1" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">变动人员情况</h3>
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
<div id="fubiao2" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">备注</h3>
<div class="BTNGROUP" style="padding:0 30px 0 0; display:inline-block;height: 35px;width:100%">
<div name="button" class="CCButton" style="margin-right:10px;float:right;">
	<input type="button" id="zhankai"  class="btn btn-info CCButtonelement" value="展开" onclick="changeFunction('fubiao2')"/>
	<input type="button" id="xinzeng" class="btn btn-info CCButtonelement" value="新增" onclick="addFunction('fubiao2')"/>
</div>
<div class="CCSelect" style="float:right;width:50%">
	<select id="showType" title="显示类型" styletype="select" name="showType" class="form-control CCShow" onchange="changeShowType('fubiao2')" style="float:right;width:95px;margin-left:5px;">
		<option value="youxiao" selected="">有效</option>
		<option value="zuixin">最新</option>
		<option value="all">所有</option>
	</select>
	<select id="showContent" title="显示内容" styletype="select" name="showContent" class="form-control CCShow" onchange="changeShowType('fubiao2')" style="float:right;width:95px;margin-left:5px;">
		<option value="account" selected="">合计</option>
	</select>
</div>
</div>
<!--展示部分-->
<div class="row" style="margin-left:0;padding: 0 15px 0 0;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #d9534f;padding:0;" id="TEST_FEE_INFO_FORM2">
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
var BUSINESSID_urlparam= '${param.businessId}';
var BUSINESSID_urlParam='${param.businessId}';
	var _formId_4091='4091';
var realFormId='${param.formId}';
var initFun4091= '';
var currentdate_4091_78138= getSystemDate();
var EMP_DEPID_session_4091='';
if('${sessionScope.EMP_DEPID}'!='null'){EMP_DEPID_session_4091='${sessionScope.EMP_DEPID}'}
var JOB_NAME_session_4091='';
if('${sessionScope.JOB_NAME}'!='null'){JOB_NAME_session_4091='${sessionScope.JOB_NAME}'}
var A_NAME_session_4091='';
if('${sessionScope.A_NAME}'!='null'){A_NAME_session_4091='${sessionScope.A_NAME}'}
var EMP_JOBID_session_4091='';
if('${sessionScope.EMP_JOBID}'!='null'){EMP_JOBID_session_4091='${sessionScope.EMP_JOBID}'}
var EMP_NAME_session_4091='';
if('${sessionScope.EMP_NAME}'!='null'){EMP_NAME_session_4091='${sessionScope.EMP_NAME}'}
var EMP_EMPID_session_4091='';
if('${sessionScope.EMP_EMPID}'!='null'){EMP_EMPID_session_4091='${sessionScope.EMP_EMPID}'}
var businessId_parameter_4091='${param.businessId}';
var param_empIds = '${param.empIds}';
var isApp = '${param.formType}';
var param_flowAction = '${param.flowAction}';
var param_key = '${param.key}';
var param_taskId = '${param.taskId}';
var param_procInsId = '${param.procInsId}';
var formId_main = '4091';
var flowAction = '${param.flowAction}';
var BUSSINESSID_ACT = '${param.businessId}';
$(document).ready(function () {
loadDataStart();
$("#zhankai_main").click();
$("#fubiao1 #showType").val('youxiao');
$("#fubiao2 #showType").val('youxiao');
changeShowType('fubiao1');
changeShowType('fubiao2');
$("#fubiao1 #showContent").remove();
$("#fubiao1 #TEST_FEE_INFO_FORM").remove();
changeFunction('fubiao1');
$("#fubiao2 #showContent").remove();
$("#fubiao2 #TEST_FEE_INFO_FORM").remove();
changeFunction('fubiao2');
var sizeLimit = '50000';
var typeLimit = null;
var numLimit = "1";
initFileManage2His('','','','','','fubiao2',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID_${param.key}',BUSSINESSID_ACT);
initFileManage2New('','','','','','fubiao2',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID_${param.key}',BUSSINESSID_ACT);
changeFileCss();
changeCssForApp1();

$("#zhankaiComment").click();
})
var BUSINESSID;var heightGadedata_4091 =[];
var containerParam_4091 ={};
containerParam_4091 ={};
function changeHeightGadedata_4091(data){
	heightGadedata_4091 = data;
}
var heightGadedata_4089 =[];
var containerParam_4089 ={};
containerParam_4089 ={};
function changeHeightGadedata_4089(data){
	heightGadedata_4089 = data;
}
var _formId_4089='4089';
var heightGadedata_4373 =[];
var containerParam_4373 ={};
containerParam_4373 ={};
function changeHeightGadedata_4373(data){
	heightGadedata_4373 = data;
}
var _formId_4373='4373';
var filterParam = {};
var queryParams;
function grid_LC_Branchstaffing_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_LC_Branchstaffing_filter')){
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
	pageReqeust.containerParam=containerParam_4091;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4091;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4091!=null&&heightGadedata_4091!=undefined){
		pageReqeust.heightGrade = heightGadedata_4091;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_Branchstaffing_fun11_4091(){
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
var containerParam_4091={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_LC_Branchstaffing_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        main_Datas=data.rows;
		if(arr.length>0){
			ID_parameter = arr[0].ID;
		}
      }
});
}
function showDate_4091(arr) {
if('${param.flowAction}'=='start'){
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" ></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请日期: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人部门: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人职位: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否行长审批: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调入支行综合经理: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调入部室负责人确认人员到位: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">其他-文本: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">到岗日期: </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#LC_Branchstaffing').append(cellObj);
}else{
for (var i = arr.length - 1; i >= 0; i--) {
var PERSONNEL_TITLE = arr[i].PERSONNEL_TITLE;
if(arr[i].PERSONNEL_TITLE==null){
	 PERSONNEL_TITLE = '';
}
var PERSONNEL_date = arr[i].PERSONNEL_DATE;
if(arr[i].PERSONNEL_DATE!=null){
	 PERSONNEL_date = new Date(PERSONNEL_date).Format("yyyy-MM-dd");
}
var PERSONNEL_depidname = arr[i].PERSONNEL_DEPIDNAME;
if(arr[i].PERSONNEL_DEPIDNAME==null){
	 PERSONNEL_depidname = '';
}
var PERSONNEL_jobidname = arr[i].PERSONNEL_JOBIDNAME;
if(arr[i].PERSONNEL_JOBIDNAME==null){
	 PERSONNEL_jobidname = '';
}
var PERSONNEL_empdiname = arr[i].PERSONNEL_EMPDINAME;
if(arr[i].PERSONNEL_EMPDINAME==null){
	 PERSONNEL_empdiname = '';
}
var PERSONNEL_Department = arr[i].PERSONNEL_DEPARTMENT;
if(arr[i].PERSONNEL_DEPARTMENT!=null){
	 PERSONNEL_Department = new Date(PERSONNEL_Department).Format("dict|ISBLACKLIST");
}
var PERSONNEL_Transfer = arr[i].PERSONNEL_TRANSFER;
if(arr[i].PERSONNEL_TRANSFER!=null){
	 PERSONNEL_Transfer = new Date(PERSONNEL_Transfer).Format("sql|sql12");
}
var PERSONNEL_departmentconfirms = arr[i].PERSONNEL_DEPARTMENTCONFIRMS;
if(arr[i].PERSONNEL_DEPARTMENTCONFIRMS!=null){
	 PERSONNEL_departmentconfirms = new Date(PERSONNEL_departmentconfirms).Format("dict|Departmentcharge");
}
var PERSONNEL_Othersingle = arr[i].PERSONNEL_OTHERSINGLE;
if(arr[i].PERSONNEL_OTHERSINGLE==null){
	 PERSONNEL_Othersingle = '';
}
var PERSONNEL_Dutytime = arr[i].PERSONNEL_DUTYTIME;
if(arr[i].PERSONNEL_DUTYTIME!=null){
	 PERSONNEL_Dutytime = new Date(PERSONNEL_Dutytime).Format("yyyy-MM-dd");
}
var PERSONNEL_renson = arr[i].PERSONNEL_RENSON;
if(arr[i].PERSONNEL_RENSON==null){
	 PERSONNEL_renson = '';
}
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+PERSONNEL_TITLE+'"><strong>'+PERSONNEL_TITLE+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请日期:'+ PERSONNEL_date +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人部门:'+ PERSONNEL_depidname +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人职位:'+ PERSONNEL_jobidname +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人:'+ PERSONNEL_empdiname +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否行长审批:'+ PERSONNEL_Department +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调入支行综合经理:'+ PERSONNEL_Transfer +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">调入部室负责人确认人员到位:'+ PERSONNEL_departmentconfirms +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">其他-文本:'+ PERSONNEL_Othersingle +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">到岗日期:'+ PERSONNEL_Dutytime +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">原因:'+ PERSONNEL_renson +' </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#LC_Branchstaffing').append(cellObj);
}
}
		if(arr.length>0){
			ID_parameter = arr[0].ID;
		}
	}
	 function showDate_Main(arr,total,e){
		$(e).css("display","none");$(e).attr("onclick","");
		 var cellObj = '';
		 for (var i = 0; i == 0; i--) {
var PERSONNEL_TITLE = '';
if(arr.length>0&&arr[i].PERSONNEL_TITLE!=null&&flowAction!='start'){
PERSONNEL_TITLE = arr[i].PERSONNEL_TITLE;
}
if(flowAction=='start'){
PERSONNEL_TITLE = '';
var name = '${sessionScope.userName}';
var date = new Date().Format("yyyy-MM-dd");
PERSONNEL_TITLE='人员调配-'+name+'-'+date;;
}
var PERSONNEL_EMPCODE = '';
if(arr.length>0&&arr[i].PERSONNEL_EMPCODE!=null&&flowAction!='start'){
PERSONNEL_EMPCODE = arr[i].PERSONNEL_EMPCODE;
}
if(flowAction=='start'){
}
var PERSONNEL_DATE = '';
if(arr.length>0&&arr[i].PERSONNEL_DATE!=null&&flowAction!='start'){
PERSONNEL_DATE = arr[i].PERSONNEL_DATE;
}
if(PERSONNEL_DATE!=null&&PERSONNEL_DATE!=""){
		PERSONNEL_DATE = new Date(parseInt(PERSONNEL_DATE)).Format("yyyy-MM-dd");
}else{PERSONNEL_DATE=""}
if(flowAction=='start'){
PERSONNEL_DATE = currentdate_4091_78138
}
var PERSONNEL_DEPID = '';
if(arr.length>0&&arr[i].PERSONNEL_DEPID!=null&&flowAction!='start'){
PERSONNEL_DEPID = arr[i].PERSONNEL_DEPID;
}
if(flowAction=='start'){
PERSONNEL_DEPID = EMP_DEPID_session_4091;
}
var PERSONNEL_JOBIDNAME = '';
if(arr.length>0&&arr[i].PERSONNEL_JOBIDNAME!=null&&flowAction!='start'){
PERSONNEL_JOBIDNAME = arr[i].PERSONNEL_JOBIDNAME;
}
if(flowAction=='start'){
PERSONNEL_JOBIDNAME = JOB_NAME_session_4091;
}
var PERSONNEL_DEPIDNAME = '';
if(arr.length>0&&arr[i].PERSONNEL_DEPIDNAME!=null&&flowAction!='start'){
PERSONNEL_DEPIDNAME = arr[i].PERSONNEL_DEPIDNAME;
}
if(flowAction=='start'){
PERSONNEL_DEPIDNAME = A_NAME_session_4091;
}
var PERSONNEL_JOBID = '';
if(arr.length>0&&arr[i].PERSONNEL_JOBID!=null&&flowAction!='start'){
PERSONNEL_JOBID = arr[i].PERSONNEL_JOBID;
}
if(flowAction=='start'){
PERSONNEL_JOBID = EMP_JOBID_session_4091;
}
var PERSONNEL_EMPDINAME = '';
if(arr.length>0&&arr[i].PERSONNEL_EMPDINAME!=null&&flowAction!='start'){
PERSONNEL_EMPDINAME = arr[i].PERSONNEL_EMPDINAME;
}
if(flowAction=='start'){
PERSONNEL_EMPDINAME = EMP_NAME_session_4091;
}
var PERSONNEL_EMPID = '';
if(arr.length>0&&arr[i].PERSONNEL_EMPID!=null&&flowAction!='start'){
PERSONNEL_EMPID = arr[i].PERSONNEL_EMPID;
}
if(flowAction=='start'){
PERSONNEL_EMPID = EMP_EMPID_session_4091;
}
var PERSONNEL_RENSON = '';
if(arr.length>0&&arr[i].PERSONNEL_RENSON!=null&&flowAction!='start'){
PERSONNEL_RENSON = arr[i].PERSONNEL_RENSON;
}
var PERSONNEL_CNAME = '';
if(arr.length>0&&arr[i].PERSONNEL_CNAME!=null&&flowAction!='start'){
PERSONNEL_CNAME = arr[i].PERSONNEL_CNAME;
}
if(flowAction=='start'){
}
var PERSONNEL_COMPID = '';
if(arr.length>0&&arr[i].PERSONNEL_COMPID!=null&&flowAction!='start'){
PERSONNEL_COMPID = arr[i].PERSONNEL_COMPID;
}
var PERSONNEL_DEPARTMENT = '';
if(arr.length>0&&arr[i].PERSONNEL_DEPARTMENT!=null&&flowAction!='start'){
PERSONNEL_DEPARTMENT = arr[i].PERSONNEL_DEPARTMENT;
}
var PERSONNEL_TRANSFER = '';
if(arr.length>0&&arr[i].PERSONNEL_TRANSFER!=null&&flowAction!='start'){
PERSONNEL_TRANSFER = arr[i].PERSONNEL_TRANSFER;
}
var PERSONNEL_TRANSFER_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNEL_TRANSFER_DICTNAME!=null&&flowAction!='start'){
PERSONNEL_TRANSFER_DICTNAME = arr[i].PERSONNEL_TRANSFER_DICTNAME;
}
if(flowAction=='start'){
PERSONNEL_TRANSFER_DICTNAME = PERSONNEL_TRANSFER;
}
var PERSONNEL_DEPARTMENTCONFIRMS = '';
if(arr.length>0&&arr[i].PERSONNEL_DEPARTMENTCONFIRMS!=null&&flowAction!='start'){
PERSONNEL_DEPARTMENTCONFIRMS = arr[i].PERSONNEL_DEPARTMENTCONFIRMS;
}
var PERSONNEL_DEPARTMENTCONFIRMS_DICTNAME = '';
if(arr.length>0&&arr[i].PERSONNEL_DEPARTMENTCONFIRMS_DICTNAME!=null&&flowAction!='start'){
PERSONNEL_DEPARTMENTCONFIRMS_DICTNAME = arr[i].PERSONNEL_DEPARTMENTCONFIRMS_DICTNAME;
}
if(flowAction=='start'){
PERSONNEL_DEPARTMENTCONFIRMS_DICTNAME = PERSONNEL_DEPARTMENTCONFIRMS;
}
var PERSONNEL_OTHERSINGLE = '';
if(arr.length>0&&arr[i].PERSONNEL_OTHERSINGLE!=null&&flowAction!='start'){
PERSONNEL_OTHERSINGLE = arr[i].PERSONNEL_OTHERSINGLE;
}
var PERSONNEL_DUTYTIME = '';
if(arr.length>0&&arr[i].PERSONNEL_DUTYTIME!=null&&flowAction!='start'){
PERSONNEL_DUTYTIME = arr[i].PERSONNEL_DUTYTIME;
}
if(PERSONNEL_DUTYTIME!=null&&PERSONNEL_DUTYTIME!=""){
		PERSONNEL_DUTYTIME = new Date(parseInt(PERSONNEL_DUTYTIME)).Format("yyyy-MM-dd");
}else{PERSONNEL_DUTYTIME=""}
var PERSONNEL_ID = '';
if(arr.length>0&&arr[i].PERSONNEL_ID!=null&&flowAction!='start'){
PERSONNEL_ID = arr[i].PERSONNEL_ID;
}
if(flowAction=='start'){
PERSONNEL_ID = businessId_parameter_4091;
}
var PERSONNEL_BUSINESSID_IS = '';
if(arr.length>0&&arr[i].PERSONNEL_BUSINESSID_IS!=null&&flowAction!='start'){
PERSONNEL_BUSINESSID_IS = arr[i].PERSONNEL_BUSINESSID_IS;
}
if(flowAction=='start'){
PERSONNEL_BUSINESSID_IS= getBUSSINESSID_IS(8,16);
}
var PERSONNEL_FLAG = '';
if(arr.length>0&&arr[i].PERSONNEL_FLAG!=null&&flowAction!='start'){
PERSONNEL_FLAG = arr[i].PERSONNEL_FLAG;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" id="MainElement" style="position: static;">'+
							'    <div class="contact-box">'+
							'		<form class="row cell" style="padding-right:50px;padding-bottom:40px">'+
'<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">申请人信息</h3>'+
'<div class="row cell">'+
  '	<div class="col-lg-12 col-md-12 col-sm-12  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">标题: </label>'+
  '			<input id="PERSONNEL.PERSONNEL_TITLE_4091" name="PERSONNEL_TITLE" dataType="text" type="text" class="form-control" value="'+PERSONNEL_TITLE+'" oninput="myFunction(this,\'PERSONNEL_TITLE\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  required="true"  style="width:600px;height:30px; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="PERSONNEL.PERSONNEL_EMPCODE_4091" name="PERSONNEL_EMPCODE" value="'+PERSONNEL_EMPCODE+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">申请日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="PERSONNEL.PERSONNEL_DATE_4091" styleType="dateTime" value="'+PERSONNEL_DATE+'"  style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="PERSONNEL_DATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="PERSONNEL.PERSONNEL_DEPID_4091" name="PERSONNEL_DEPID" value="'+PERSONNEL_DEPID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">申请人职位: </label>'+
  '			<input id="PERSONNEL.PERSONNEL_JOBIDNAME_4091" name="PERSONNEL_JOBIDNAME" dataType="text" type="text" class="form-control" value="'+PERSONNEL_JOBIDNAME+'" oninput="myFunction(this,\'PERSONNEL_JOBIDNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">申请部门: </label>'+
  '			<input id="PERSONNEL.PERSONNEL_DEPIDNAME_4091" name="PERSONNEL_DEPIDNAME" dataType="text" type="text" class="form-control" value="'+PERSONNEL_DEPIDNAME+'" oninput="myFunction(this,\'PERSONNEL_DEPIDNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="PERSONNEL.PERSONNEL_JOBID_4091" name="PERSONNEL_JOBID" value="'+PERSONNEL_JOBID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">申请人: </label>'+
  '			<input id="PERSONNEL.PERSONNEL_EMPDINAME_4091" name="PERSONNEL_EMPDINAME" dataType="text" type="text" class="form-control" value="'+PERSONNEL_EMPDINAME+'" oninput="myFunction(this,\'PERSONNEL_EMPDINAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="PERSONNEL.PERSONNEL_EMPID_4091" name="PERSONNEL_EMPID" value="'+PERSONNEL_EMPID+'"   type="hidden" >'+
'</div>'+
'<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">调配信息</h3>'+
'<div class="row cell">'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">原因: </label>'+
  '			<textarea id="PERSONNEL.PERSONNEL_RENSON_4091" name="PERSONNEL_RENSON" class="CCReadTextarea form-control"  vtype="illegalChar;maxLength:100;minLength:null;"  required="true"  style="width:600px;height:58px; float:left;padding:0;background-color:#fff">'+PERSONNEL_RENSON+'</textarea>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
'</div>'+
'<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">审批信息</h3>'+
'<div class="row cell">'+
  '	<input id="PERSONNEL.PERSONNEL_CNAME_4091" name="PERSONNEL_CNAME" value="'+PERSONNEL_CNAME+'"   type="hidden" >'+
  '	<input id="PERSONNEL.PERSONNEL_COMPID_4091" name="PERSONNEL_COMPID" value="'+PERSONNEL_COMPID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">是否行长审批: </label>'+
  '			<select id="PERSONNEL.PERSONNEL_DEPARTMENT_4091" title="是否行长审批" styleType="select" name="PERSONNEL_DEPARTMENT" columnId="78192"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  dataField1 = "dict"  required="true"  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="ISBLACKLIST" dataField="dicts_form_78192"initParam = "_"></select>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调入支行综合经理: </label>'+
  '			<input id="PERSONNEL.PERSONNEL_TRANSFER_4091" title="调入支行综合经理" styleType="select" name="PERSONNEL_TRANSFER" value="'+PERSONNEL_TRANSFER_DICTNAME+'" class="form-control " columnId="78193" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "sql"  readonly  style="border:none;width:200px; " textField="text" valueField="id" DictName="sql12" dataField="data_form_78193"initParam = "_"/>'+
	'			<input id="PERSONNEL.PERSONNEL_TRANSFER_4091_value" name="PERSONNEL_TRANSFER" type="hidden" value="'+PERSONNEL_TRANSFER+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">调入部室负责人确认人员到位: </label>'+
  '			<input id="PERSONNEL.PERSONNEL_DEPARTMENTCONFIRMS_4091" title="调入部室负责人确认人员到位" styleType="select" name="PERSONNEL_DEPARTMENTCONFIRMS" value="'+PERSONNEL_DEPARTMENTCONFIRMS_DICTNAME+'" class="form-control " columnId="78194" style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff"  emptyText=""  dataField1 = "dict"  readonly  style="border:none;width:200px; " textField="dictName" valueField="dictId" DictName="Departmentcharge" dataField="dicts_form_78194"initParam = "_"/>'+
	'			<input id="PERSONNEL.PERSONNEL_DEPARTMENTCONFIRMS_4091_value" name="PERSONNEL_DEPARTMENTCONFIRMS" type="hidden" value="'+PERSONNEL_DEPARTMENTCONFIRMS+'"/>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">其他-文本: </label>'+
  '			<input id="PERSONNEL.PERSONNEL_OTHERSINGLE_4091" name="PERSONNEL_OTHERSINGLE" dataType="text" type="text" class="form-control" value="'+PERSONNEL_OTHERSINGLE+'" oninput="myFunction(this,\'PERSONNEL_OTHERSINGLE\')"  vtype="illegalChar;maxLength:10;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">到岗日期: </label>'+
  '			<input id="PERSONNEL.PERSONNEL_DUTYTIME_4091" name="PERSONNEL_DUTYTIME" type="text" dateType="controls input-append date form_date1" class="form-control" value="'+PERSONNEL_DUTYTIME+'" styleType="dateTime" readonly  style="width:200px;float:left;border-radius: 4px 0 0 4px;" format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
  '		</div>'+
  '	</div>'+
'</div>'+
  '	<input id="PERSONNEL.PERSONNEL_ID_4091" name="PERSONNEL_ID" value="'+PERSONNEL_ID+'"   type="hidden" >'+
'<div class="BUSSINESS_ID"><h5 class="BUSSINESS_ID_label">流程单据号:</h5><input class="BUSSINESS_ID_value" readonly type="text" id="PERSONNEL.PERSONNEL_BUSINESSID_IS_4091" name="PERSONNEL_BUSINESSID_IS" value="'+PERSONNEL_BUSINESSID_IS+'"/></div>'+
  '	<input id="PERSONNEL.PERSONNEL_FLAG_4091" name="PERSONNEL_FLAG" value="'+PERSONNEL_FLAG+'"   type="hidden" >'+
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
			cellObj1 +=		'<input class="btn btn-info submitButton" id="submitButton_main1" type="button" value="提交" style="width:50px" onclick="submitButton_save_6735()"/>';
		}else{
			cellObj1 +=		'		<input class="btn btn-info checkButton" id="approved_main" type="button" value="通过" onclick="approved_refer_6764(\'通过\')"/>'+
'		<input class="btn btn-info checkButton" id="approved2_main" type="button" value="驳回" onclick="approved_refer_6765(\'驳回\')"/>'+
'		<input class="btn btn-info checkButton" id="temporaryStorage_main" type="button" value="暂存" onclick="temporaryStorage_save_6914()"/>'+
							'	</div>';
		}
	$("#CardAndCardForm").append(cellObj1);
	elementsListSelectInitFunction('#submitButton_main');//初始化新增下拉控件
	elementsListCheckboxInitFunction('#submitButton_main');//初始化单选控件
	elementsListRadioInitFunction('#submitButton_main');//初始化单选控件
	cardDateWidInitFunction();//初始化新增日期控件
$("[id='PERSONNEL.PERSONNEL_DEPARTMENT_4091']").val(PERSONNEL_DEPARTMENT);
	}
</script>
</body>
</html>