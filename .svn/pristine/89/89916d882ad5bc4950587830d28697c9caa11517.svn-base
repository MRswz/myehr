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
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/formbuild/TP_management/Attendanceprocess/LC_Entryndexit_TABLE.js"></script>
</head>
<body class="gray-bg" >
<div class="container-fluid" id="CardAndCardForm" style="height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;">
<div class="row mainFormElement" style="margin-left:0;padding: 0 15px 0 0;position:relative;" id="LC_Entryndexit_LIST">
<input type="button" id="zhankai_main"  class="btn btn-info CCButtonelement" value="展开" style="position:absolute;right:30px;bottom:10px;z-index:999" onclick="showDate_Main(main_Datas,0,this)"/>
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
<script>
	var _formId_4420='4420';
var realFormId='${param.formId}';
var COM_COMPID_session_4420='${sessionScope.COM_COMPID}';
var EMPCODE_session_4420='${sessionScope.EMPCODE}';
var EMP_DEPID_session_4420='${sessionScope.EMP_DEPID}';
var EMP_EMPID_session_4420='${sessionScope.EMP_EMPID}';
var EMP_NAME_session_4420='${sessionScope.EMP_NAME}';
var COM_NAME_session_4420='${sessionScope.COM_NAME}';
var A_NAME_session_4420='${sessionScope.A_NAME}';
var EMP_EMPSTATUS_session_4420='${sessionScope.EMP_EMPSTATUS}';
var GENDER_session_4420='${sessionScope.GENDER}';
var MARRIAGESTATUS_session_4420='${sessionScope.MARRIAGESTATUS}';
var BIRTHDAY_session_4420='${sessionScope.BIRTHDAY}';
var POLITICALSTATUS_session_4420='${sessionScope.POLITICALSTATUS}';
var JOBRANK_session_4420='${sessionScope.JOBRANK}';
var JOBTITLENAMEname_session_4420='${sessionScope.JOBTITLENAMEname}';
var JOBRANKname_session_4420='${sessionScope.JOBRANKname}';
var EMP_EMPSTATUSname_session_4420='${sessionScope.EMP_EMPSTATUSname}';
var RESIDENTADDRESS_session_4420='${sessionScope.RESIDENTADDRESS}';
var MAXEDUCATION_session_4420='${sessionScope.MAXEDUCATION}';
var NATION_session_4420='${sessionScope.NATION}';
var JOBTITLENAME_session_4420='${sessionScope.JOBTITLENAME}';
var GENDERname_session_4420='${sessionScope.GENDERname}';
var MARRIAGESTATUSname_session_4420='${sessionScope.MARRIAGESTATUSname}';
var POLITICALSTATUSname_session_4420='${sessionScope.POLITICALSTATUSname}';
var MAXEDUCATIONname_session_4420='${sessionScope.MAXEDUCATIONname}';
var NATIONname_session_4420='${sessionScope.NATIONname}';
var WHELEADER_session_4420='${sessionScope.WHELEADER}';
var WHELEADERname_session_4420='${sessionScope.WHELEADERname}';
var param_empIds = '${param.empIds}';
var isApp = '${param.formType}';
var param_flowAction = '${param.flowAction}';
var param_key = '${param.key}';
var param_taskId = '${param.taskId}';
var param_procInsId = '${param.procInsId}';
var formId_main = '4420';
var flowAction = '${param.flowAction}';
var BUSSINESSID_ACT = '${param.businessId}';
$(document).ready(function () {
loadDataStart();
$("#zhankai_main").click();
$("#fubiao1 #showType").val('youxiao');
changeShowType('fubiao1');
$("#fubiao1 #showContent").remove();
$("#fubiao1 #TEST_FEE_INFO_FORM").remove();
$("#fubiao1 #xinzeng").remove();
var sizeLimit = '50000';
var typeLimit = null;
var numLimit = "1";
initFileManage2('','','','','','fubiao1',numLimit,sizeLimit,typeLimit,'ACT_BUSSINESSID',BUSSINESSID_ACT);
changeFileCss();
$("#zhankaiComment").click();
})
var BUSINESSID;var heightGadedata_4420 =[];
var containerParam_4420 ={};
containerParam_4420 ={};
function changeHeightGadedata_4420(data){
	heightGadedata_4420 = data;
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
function grid_LC_Entryndexit_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_LC_Entryndexit_LIST_filter')){
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
	pageReqeust.containerParam=containerParam_4420;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4420;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4420!=null&&heightGadedata_4420!=undefined){
		pageReqeust.heightGrade = heightGadedata_4420;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_Entryndexit_LIST_fun11_4420(){
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
var containerParam_4420={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_LC_Entryndexit_LIST_fun(xx),//HTTP请求类型
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
function showDate_4420(arr) {
if('${param.flowAction}'=='start'){
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" ></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">员工状态: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">姓名: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">性别: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">婚姻状况: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">出生日期: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">政治面貌: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">户口所在地: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">文化程度: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">民族: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">职称: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请事由: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">函件需求: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否出国: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">目的地: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">年内已出国(境)次数: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">拟出发日期: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">拟返回日期: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">实际是否出国: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">出国(境)开始日期: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">出国(境)结束日期: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">在外停留时间（天）: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">有无公款报销: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">其他需说明事项: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">函件是否上交: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">审批状态: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">流程id: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否一把手: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">职务等级: </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#LC_Entryndexit_LIST').append(cellObj);
}else{
for (var i = arr.length - 1; i >= 0; i--) {
var LCENTRY_COMPID = arr[i].LCENTRY_COMPID;
if(arr[i].LCENTRY_COMPID==null){
	 LCENTRY_COMPID = '';
}
var LCENTRY_depid = arr[i].LCENTRY_DEPID;
if(arr[i].LCENTRY_DEPID==null){
	 LCENTRY_depid = '';
}
var LCENTRY_EMPSTATUS = arr[i].LCENTRY_EMPSTATUS;
if(arr[i].LCENTRY_EMPSTATUS==null){
	 LCENTRY_EMPSTATUS = '';
}
var LCENTRY_EMPID = arr[i].LCENTRY_EMPID;
if(arr[i].LCENTRY_EMPID==null){
	 LCENTRY_EMPID = '';
}
var LCENTRY_GENDER = arr[i].LCENTRY_GENDER;
if(arr[i].LCENTRY_GENDER==null){
	 LCENTRY_GENDER = '';
}
var LCENTRY_MARRIAGESTATUS = arr[i].LCENTRY_MARRIAGESTATUS;
if(arr[i].LCENTRY_MARRIAGESTATUS==null){
	 LCENTRY_MARRIAGESTATUS = '';
}
var LCENTRY_BIRTHDAY = arr[i].LCENTRY_BIRTHDAY;
if(arr[i].LCENTRY_BIRTHDAY!=null){
	 LCENTRY_BIRTHDAY = new Date(LCENTRY_BIRTHDAY).Format("yyyy-MM-dd");
}
var LCENTRY_POLITICALSTATUS = arr[i].LCENTRY_POLITICALSTATUS;
if(arr[i].LCENTRY_POLITICALSTATUS==null){
	 LCENTRY_POLITICALSTATUS = '';
}
var LCENTRY_RESIDENTADDRESS = arr[i].LCENTRY_RESIDENTADDRESS;
if(arr[i].LCENTRY_RESIDENTADDRESS==null){
	 LCENTRY_RESIDENTADDRESS = '';
}
var LCENTRY_MAXEDUCATION = arr[i].LCENTRY_MAXEDUCATION;
if(arr[i].LCENTRY_MAXEDUCATION==null){
	 LCENTRY_MAXEDUCATION = '';
}
var LCENTRY_NATION = arr[i].LCENTRY_NATION;
if(arr[i].LCENTRY_NATION==null){
	 LCENTRY_NATION = '';
}
var LCENTRY_JOBTITLENAME = arr[i].LCENTRY_JOBTITLENAME;
if(arr[i].LCENTRY_JOBTITLENAME==null){
	 LCENTRY_JOBTITLENAME = '';
}
var LCENTRY_APPLICATIO = arr[i].LCENTRY_APPLICATIO;
if(arr[i].LCENTRY_APPLICATIO==null){
	 LCENTRY_APPLICATIO = '';
}
var LCENTRY_DEMAND = arr[i].LCENTRY_DEMAND;
if(arr[i].LCENTRY_DEMAND!=null){
	 LCENTRY_DEMAND = new Date(LCENTRY_DEMAND).Format("dict|LC_ENTRY_DEMAND");
}
var LCENTRY_WHETHER = arr[i].LCENTRY_WHETHER;
if(arr[i].LCENTRY_WHETHER!=null){
	 LCENTRY_WHETHER = new Date(LCENTRY_WHETHER).Format("dict|att_yes_no");
}
var LCENTRY_DESTINATION = arr[i].LCENTRY_DESTINATION;
if(arr[i].LCENTRY_DESTINATION==null){
	 LCENTRY_DESTINATION = '';
}
var LCENTRY_NUMBER = arr[i].LCENTRY_NUMBER;
if(arr[i].LCENTRY_NUMBER==null){
	 LCENTRY_NUMBER = '';
}
var LCENTRY_DEPARTURE = arr[i].LCENTRY_DEPARTURE;
if(arr[i].LCENTRY_DEPARTURE!=null){
	 LCENTRY_DEPARTURE = new Date(LCENTRY_DEPARTURE).Format("yyyy-MM-dd");
}
var LCENTRY_RETURNDATE = arr[i].LCENTRY_RETURNDATE;
if(arr[i].LCENTRY_RETURNDATE!=null){
	 LCENTRY_RETURNDATE = new Date(LCENTRY_RETURNDATE).Format("yyyy-MM-dd");
}
var LCENTRY_Whetheror = arr[i].LCENTRY_WHETHEROR;
if(arr[i].LCENTRY_WHETHEROR!=null){
	 LCENTRY_Whetheror = new Date(LCENTRY_Whetheror).Format("dict|ISBLACKLIST");
}
var LCENTRY_STARTDATE = arr[i].LCENTRY_STARTDATE;
if(arr[i].LCENTRY_STARTDATE!=null){
	 LCENTRY_STARTDATE = new Date(LCENTRY_STARTDATE).Format("yyyy-MM-dd");
}
var LCENTRY_EMDDATE = arr[i].LCENTRY_EMDDATE;
if(arr[i].LCENTRY_EMDDATE!=null){
	 LCENTRY_EMDDATE = new Date(LCENTRY_EMDDATE).Format("yyyy-MM-dd");
}
var LCENTRY_OUTSIDE = arr[i].LCENTRY_OUTSIDE;
if(arr[i].LCENTRY_OUTSIDE==null){
	 LCENTRY_OUTSIDE = '';
}
var LCENTRY_PUBLICREIMBUR = arr[i].LCENTRY_PUBLICREIMBUR;
if(arr[i].LCENTRY_PUBLICREIMBUR==null){
	 LCENTRY_PUBLICREIMBUR = '';
}
var LCENTRY_requirements = arr[i].LCENTRY_REQUIREMENTS;
if(arr[i].LCENTRY_REQUIREMENTS==null){
	 LCENTRY_requirements = '';
}
var LCENTRY_respondence = arr[i].LCENTRY_RESPONDENCE;
if(arr[i].LCENTRY_RESPONDENCE!=null){
	 LCENTRY_respondence = new Date(LCENTRY_respondence).Format("dict|att_yes_no");
}
var LCENTRY_flag = arr[i].LCENTRY_FLAG;
if(arr[i].LCENTRY_FLAG==null){
	 LCENTRY_flag = '';
}
var LCENTRY_businessId = arr[i].LCENTRY_BUSINESSID;
if(arr[i].LCENTRY_BUSINESSID==null){
	 LCENTRY_businessId = '';
}
var LCENTRY_WHELEADER = arr[i].LCENTRY_WHELEADER;
if(arr[i].LCENTRY_WHELEADER==null){
	 LCENTRY_WHELEADER = '';
}
var LCENTRY_JOBRANK = arr[i].LCENTRY_JOBRANK;
if(arr[i].LCENTRY_JOBRANK==null){
	 LCENTRY_JOBRANK = '';
}
var LCENTRY_COMPID = arr[i].LCENTRY_COMPID;
if(arr[i].LCENTRY_COMPID==null){
	 LCENTRY_COMPID = '';
}
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+LCENTRY_COMPID+'"><strong>'+LCENTRY_COMPID+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门:'+ LCENTRY_depid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">员工状态:'+ LCENTRY_EMPSTATUS +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">姓名:'+ LCENTRY_EMPID +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">性别:'+ LCENTRY_GENDER +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">婚姻状况:'+ LCENTRY_MARRIAGESTATUS +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">出生日期:'+ LCENTRY_BIRTHDAY +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">政治面貌:'+ LCENTRY_POLITICALSTATUS +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">户口所在地:'+ LCENTRY_RESIDENTADDRESS +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">文化程度:'+ LCENTRY_MAXEDUCATION +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">民族:'+ LCENTRY_NATION +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">职称:'+ LCENTRY_JOBTITLENAME +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请事由:'+ LCENTRY_APPLICATIO +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">函件需求:'+ LCENTRY_DEMAND +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否出国:'+ LCENTRY_WHETHER +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">目的地:'+ LCENTRY_DESTINATION +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">年内已出国(境)次数:'+ LCENTRY_NUMBER +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">拟出发日期:'+ LCENTRY_DEPARTURE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">拟返回日期:'+ LCENTRY_RETURNDATE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">实际是否出国:'+ LCENTRY_Whetheror +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">出国(境)开始日期:'+ LCENTRY_STARTDATE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">出国(境)结束日期:'+ LCENTRY_EMDDATE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">在外停留时间（天）:'+ LCENTRY_OUTSIDE +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">有无公款报销:'+ LCENTRY_PUBLICREIMBUR +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">其他需说明事项:'+ LCENTRY_requirements +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">函件是否上交:'+ LCENTRY_respondence +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">审批状态:'+ LCENTRY_flag +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">流程id:'+ LCENTRY_businessId +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否一把手:'+ LCENTRY_WHELEADER +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">职务等级:'+ LCENTRY_JOBRANK +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">公司:'+ LCENTRY_COMPID +' </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#LC_Entryndexit_LIST').append(cellObj);
}
}
		if(arr.length>0){
		}
	}
	 function showDate_Main(arr,total,e){
		$(e).css("display","none");$(e).attr("onclick","");
		 var cellObj = '';
		 for (var i = 0; i == 0; i--) {
var LCENTRY_ID = '';
if(arr.length>0&&arr[i].LCENTRY_ID!=null&&flowAction!='start'){
LCENTRY_ID = arr[i].LCENTRY_ID;
}
if(flowAction=='start'){
}
var LCENTRY_TITLE = '';
if(arr.length>0&&arr[i].LCENTRY_TITLE!=null&&flowAction!='start'){
LCENTRY_TITLE = arr[i].LCENTRY_TITLE;
}
if(flowAction=='start'){
}
var LCENTRY_COMPID = '';
if(arr.length>0&&arr[i].LCENTRY_COMPID!=null&&flowAction!='start'){
LCENTRY_COMPID = arr[i].LCENTRY_COMPID;
}
if(flowAction=='start'){
LCENTRY_COMPID = COM_COMPID_session_4420;
}
var LCENTRY_EMPCODE = '';
if(arr.length>0&&arr[i].LCENTRY_EMPCODE!=null&&flowAction!='start'){
LCENTRY_EMPCODE = arr[i].LCENTRY_EMPCODE;
}
if(flowAction=='start'){
LCENTRY_EMPCODE = EMPCODE_session_4420;
}
var LCENTRY_DEPID = '';
if(arr.length>0&&arr[i].LCENTRY_DEPID!=null&&flowAction!='start'){
LCENTRY_DEPID = arr[i].LCENTRY_DEPID;
}
if(flowAction=='start'){
LCENTRY_DEPID = EMP_DEPID_session_4420;
}
var LCENTRY_EMPID = '';
if(arr.length>0&&arr[i].LCENTRY_EMPID!=null&&flowAction!='start'){
LCENTRY_EMPID = arr[i].LCENTRY_EMPID;
}
if(flowAction=='start'){
LCENTRY_EMPID = EMP_EMPID_session_4420;
}
var LCENTRY_EMPIDNAME = '';
if(arr.length>0&&arr[i].LCENTRY_EMPIDNAME!=null&&flowAction!='start'){
LCENTRY_EMPIDNAME = arr[i].LCENTRY_EMPIDNAME;
}
if(flowAction=='start'){
LCENTRY_EMPIDNAME = EMP_NAME_session_4420;
}
var LCENTRY_COMPIDNAME = '';
if(arr.length>0&&arr[i].LCENTRY_COMPIDNAME!=null&&flowAction!='start'){
LCENTRY_COMPIDNAME = arr[i].LCENTRY_COMPIDNAME;
}
if(flowAction=='start'){
LCENTRY_COMPIDNAME = COM_NAME_session_4420;
}
var LCENTRY_DEPIDNAME = '';
if(arr.length>0&&arr[i].LCENTRY_DEPIDNAME!=null&&flowAction!='start'){
LCENTRY_DEPIDNAME = arr[i].LCENTRY_DEPIDNAME;
}
if(flowAction=='start'){
LCENTRY_DEPIDNAME = A_NAME_session_4420;
}
var LCENTRY_EMPSTATUS = '';
if(arr.length>0&&arr[i].LCENTRY_EMPSTATUS!=null&&flowAction!='start'){
LCENTRY_EMPSTATUS = arr[i].LCENTRY_EMPSTATUS;
}
if(flowAction=='start'){
LCENTRY_EMPSTATUS = EMP_EMPSTATUS_session_4420;
}
var LCENTRY_GENDER = '';
if(arr.length>0&&arr[i].LCENTRY_GENDER!=null&&flowAction!='start'){
LCENTRY_GENDER = arr[i].LCENTRY_GENDER;
}
if(flowAction=='start'){
LCENTRY_GENDER = GENDER_session_4420;
}
var LCENTRY_MARRIAGESTATUS = '';
if(arr.length>0&&arr[i].LCENTRY_MARRIAGESTATUS!=null&&flowAction!='start'){
LCENTRY_MARRIAGESTATUS = arr[i].LCENTRY_MARRIAGESTATUS;
}
if(flowAction=='start'){
LCENTRY_MARRIAGESTATUS = MARRIAGESTATUS_session_4420;
}
var LCENTRY_BIRTHDAY = '';
if(arr.length>0&&arr[i].LCENTRY_BIRTHDAY!=null&&flowAction!='start'){
LCENTRY_BIRTHDAY = arr[i].LCENTRY_BIRTHDAY;
}
if(LCENTRY_BIRTHDAY!=null&&LCENTRY_BIRTHDAY!=""){
LCENTRY_BIRTHDAY = new Date(parseInt(LCENTRY_BIRTHDAY)).Format("yyyy-MM-dd");
}else{LCENTRY_BIRTHDAY=""}
if(flowAction=='start'){
LCENTRY_BIRTHDAY = BIRTHDAY_session_4420;
}
var LCENTRY_POLITICALSTATUS = '';
if(arr.length>0&&arr[i].LCENTRY_POLITICALSTATUS!=null&&flowAction!='start'){
LCENTRY_POLITICALSTATUS = arr[i].LCENTRY_POLITICALSTATUS;
}
if(flowAction=='start'){
LCENTRY_POLITICALSTATUS = POLITICALSTATUS_session_4420;
}
var LCENTRY_JOBRANK = '';
if(arr.length>0&&arr[i].LCENTRY_JOBRANK!=null&&flowAction!='start'){
LCENTRY_JOBRANK = arr[i].LCENTRY_JOBRANK;
}
if(flowAction=='start'){
LCENTRY_JOBRANK = JOBRANK_session_4420;
}
var LCENTRY_JOBTITLENAMENAME = '';
if(arr.length>0&&arr[i].LCENTRY_JOBTITLENAMENAME!=null&&flowAction!='start'){
LCENTRY_JOBTITLENAMENAME = arr[i].LCENTRY_JOBTITLENAMENAME;
}
if(flowAction=='start'){
LCENTRY_JOBTITLENAMENAME = JOBTITLENAMEname_session_4420;
}
var LCENTRY_JOBRANKNAME = '';
if(arr.length>0&&arr[i].LCENTRY_JOBRANKNAME!=null&&flowAction!='start'){
LCENTRY_JOBRANKNAME = arr[i].LCENTRY_JOBRANKNAME;
}
if(flowAction=='start'){
LCENTRY_JOBRANKNAME = JOBRANKname_session_4420;
}
var LCENTRY_EMP_EMPSTATUSNAME = '';
if(arr.length>0&&arr[i].LCENTRY_EMP_EMPSTATUSNAME!=null&&flowAction!='start'){
LCENTRY_EMP_EMPSTATUSNAME = arr[i].LCENTRY_EMP_EMPSTATUSNAME;
}
if(flowAction=='start'){
LCENTRY_EMP_EMPSTATUSNAME = EMP_EMPSTATUSname_session_4420;
}
var LCENTRY_RESIDENTADDRESS = '';
if(arr.length>0&&arr[i].LCENTRY_RESIDENTADDRESS!=null&&flowAction!='start'){
LCENTRY_RESIDENTADDRESS = arr[i].LCENTRY_RESIDENTADDRESS;
}
if(flowAction=='start'){
LCENTRY_RESIDENTADDRESS = RESIDENTADDRESS_session_4420;
}
var LCENTRY_MAXEDUCATION = '';
if(arr.length>0&&arr[i].LCENTRY_MAXEDUCATION!=null&&flowAction!='start'){
LCENTRY_MAXEDUCATION = arr[i].LCENTRY_MAXEDUCATION;
}
if(flowAction=='start'){
LCENTRY_MAXEDUCATION = MAXEDUCATION_session_4420;
}
var LCENTRY_NATION = '';
if(arr.length>0&&arr[i].LCENTRY_NATION!=null&&flowAction!='start'){
LCENTRY_NATION = arr[i].LCENTRY_NATION;
}
if(flowAction=='start'){
LCENTRY_NATION = NATION_session_4420;
}
var LCENTRY_JOBTITLENAME = '';
if(arr.length>0&&arr[i].LCENTRY_JOBTITLENAME!=null&&flowAction!='start'){
LCENTRY_JOBTITLENAME = arr[i].LCENTRY_JOBTITLENAME;
}
if(flowAction=='start'){
LCENTRY_JOBTITLENAME = JOBTITLENAME_session_4420;
}
var LCENTRY_POOF = '';
if(arr.length>0&&arr[i].LCENTRY_POOF!=null&&flowAction!='start'){
LCENTRY_POOF = arr[i].LCENTRY_POOF;
}
var LCENTRY_GENDERNAME = '';
if(arr.length>0&&arr[i].LCENTRY_GENDERNAME!=null&&flowAction!='start'){
LCENTRY_GENDERNAME = arr[i].LCENTRY_GENDERNAME;
}
if(flowAction=='start'){
LCENTRY_GENDERNAME = GENDERname_session_4420;
}
var LCENTRY_MARRIAGESTATUSNAME = '';
if(arr.length>0&&arr[i].LCENTRY_MARRIAGESTATUSNAME!=null&&flowAction!='start'){
LCENTRY_MARRIAGESTATUSNAME = arr[i].LCENTRY_MARRIAGESTATUSNAME;
}
if(flowAction=='start'){
LCENTRY_MARRIAGESTATUSNAME = MARRIAGESTATUSname_session_4420;
}
var LCENTRY_APPLICATIO = '';
if(arr.length>0&&arr[i].LCENTRY_APPLICATIO!=null&&flowAction!='start'){
LCENTRY_APPLICATIO = arr[i].LCENTRY_APPLICATIO;
}
var LCENTRY_DOCUMENT = '';
if(arr.length>0&&arr[i].LCENTRY_DOCUMENT!=null&&flowAction!='start'){
LCENTRY_DOCUMENT = arr[i].LCENTRY_DOCUMENT;
}
var LCENTRY_POLITICALSTATUSNAME = '';
if(arr.length>0&&arr[i].LCENTRY_POLITICALSTATUSNAME!=null&&flowAction!='start'){
LCENTRY_POLITICALSTATUSNAME = arr[i].LCENTRY_POLITICALSTATUSNAME;
}
if(flowAction=='start'){
LCENTRY_POLITICALSTATUSNAME = POLITICALSTATUSname_session_4420;
}
var LCENTRY_MAXEDUCATIONNAME = '';
if(arr.length>0&&arr[i].LCENTRY_MAXEDUCATIONNAME!=null&&flowAction!='start'){
LCENTRY_MAXEDUCATIONNAME = arr[i].LCENTRY_MAXEDUCATIONNAME;
}
if(flowAction=='start'){
LCENTRY_MAXEDUCATIONNAME = MAXEDUCATIONname_session_4420;
}
var LCENTRY_DEMAND = '';
if(arr.length>0&&arr[i].LCENTRY_DEMAND!=null&&flowAction!='start'){
LCENTRY_DEMAND = arr[i].LCENTRY_DEMAND;
}
var LCENTRY_WHETHER = '';
if(arr.length>0&&arr[i].LCENTRY_WHETHER!=null&&flowAction!='start'){
LCENTRY_WHETHER = arr[i].LCENTRY_WHETHER;
}
var LCENTRY_NATIONNAME = '';
if(arr.length>0&&arr[i].LCENTRY_NATIONNAME!=null&&flowAction!='start'){
LCENTRY_NATIONNAME = arr[i].LCENTRY_NATIONNAME;
}
if(flowAction=='start'){
LCENTRY_NATIONNAME = NATIONname_session_4420;
}
var LCENTRY_DESTINATION = '';
if(arr.length>0&&arr[i].LCENTRY_DESTINATION!=null&&flowAction!='start'){
LCENTRY_DESTINATION = arr[i].LCENTRY_DESTINATION;
}
var LCENTRY_NUMBER = '';
if(arr.length>0&&arr[i].LCENTRY_NUMBER!=null&&flowAction!='start'){
LCENTRY_NUMBER = arr[i].LCENTRY_NUMBER;
}
var LCENTRY_DEPARTURE = '';
if(arr.length>0&&arr[i].LCENTRY_DEPARTURE!=null&&flowAction!='start'){
LCENTRY_DEPARTURE = arr[i].LCENTRY_DEPARTURE;
}
if(LCENTRY_DEPARTURE!=null&&LCENTRY_DEPARTURE!=""){
LCENTRY_DEPARTURE = new Date(parseInt(LCENTRY_DEPARTURE)).Format("yyyy-MM-dd");
}else{LCENTRY_DEPARTURE=""}
var LCENTRY_RETURNDATE = '';
if(arr.length>0&&arr[i].LCENTRY_RETURNDATE!=null&&flowAction!='start'){
LCENTRY_RETURNDATE = arr[i].LCENTRY_RETURNDATE;
}
if(LCENTRY_RETURNDATE!=null&&LCENTRY_RETURNDATE!=""){
LCENTRY_RETURNDATE = new Date(parseInt(LCENTRY_RETURNDATE)).Format("yyyy-MM-dd");
}else{LCENTRY_RETURNDATE=""}
var LCENTRY_WHETHEROR = '';
if(arr.length>0&&arr[i].LCENTRY_WHETHEROR!=null&&flowAction!='start'){
LCENTRY_WHETHEROR = arr[i].LCENTRY_WHETHEROR;
}
var LCENTRY_STARTDATE = '';
if(arr.length>0&&arr[i].LCENTRY_STARTDATE!=null&&flowAction!='start'){
LCENTRY_STARTDATE = arr[i].LCENTRY_STARTDATE;
}
var LCENTRY_EMDDATE = '';
if(arr.length>0&&arr[i].LCENTRY_EMDDATE!=null&&flowAction!='start'){
LCENTRY_EMDDATE = arr[i].LCENTRY_EMDDATE;
}
var LCENTRY_OUTSIDE = '';
if(arr.length>0&&arr[i].LCENTRY_OUTSIDE!=null&&flowAction!='start'){
LCENTRY_OUTSIDE = arr[i].LCENTRY_OUTSIDE;
}
if(flowAction=='start'){
}
var LCENTRY_PUBLICREIMBUR = '';
if(arr.length>0&&arr[i].LCENTRY_PUBLICREIMBUR!=null&&flowAction!='start'){
LCENTRY_PUBLICREIMBUR = arr[i].LCENTRY_PUBLICREIMBUR;
}
if(flowAction=='start'){
}
var LCENTRY_REQUIREMENTS = '';
if(arr.length>0&&arr[i].LCENTRY_REQUIREMENTS!=null&&flowAction!='start'){
LCENTRY_REQUIREMENTS = arr[i].LCENTRY_REQUIREMENTS;
}
if(flowAction=='start'){
}
var LCENTRY_DOCUMENTS = '';
if(arr.length>0&&arr[i].LCENTRY_DOCUMENTS!=null&&flowAction!='start'){
LCENTRY_DOCUMENTS = arr[i].LCENTRY_DOCUMENTS;
}
var LCENTRY_RESPONDENCE = '';
if(arr.length>0&&arr[i].LCENTRY_RESPONDENCE!=null&&flowAction!='start'){
LCENTRY_RESPONDENCE = arr[i].LCENTRY_RESPONDENCE;
}
var LCENTRY_WHELEADER = '';
if(arr.length>0&&arr[i].LCENTRY_WHELEADER!=null&&flowAction!='start'){
LCENTRY_WHELEADER = arr[i].LCENTRY_WHELEADER;
}
if(flowAction=='start'){
LCENTRY_WHELEADER = WHELEADER_session_4420;
}
var LCENTRY_WHELEADERNAME = '';
if(arr.length>0&&arr[i].LCENTRY_WHELEADERNAME!=null&&flowAction!='start'){
LCENTRY_WHELEADERNAME = arr[i].LCENTRY_WHELEADERNAME;
}
if(flowAction=='start'){
LCENTRY_WHELEADERNAME = WHELEADERname_session_4420;
}
var LCENTRY_DISCIPLINE = '';
if(arr.length>0&&arr[i].LCENTRY_DISCIPLINE!=null&&flowAction!='start'){
LCENTRY_DISCIPLINE = arr[i].LCENTRY_DISCIPLINE;
}
var LCENTRY_FLAG = '';
if(arr.length>0&&arr[i].LCENTRY_FLAG!=null&&flowAction!='start'){
LCENTRY_FLAG = arr[i].LCENTRY_FLAG;
}
if(flowAction=='start'){
}
var LCENTRY_BUSINESSID = '';
if(arr.length>0&&arr[i].LCENTRY_BUSINESSID!=null&&flowAction!='start'){
LCENTRY_BUSINESSID = arr[i].LCENTRY_BUSINESSID;
}
if(flowAction=='start'){
}
var LCENTRY_CNAME = '';
if(arr.length>0&&arr[i].LCENTRY_CNAME!=null&&flowAction!='start'){
LCENTRY_CNAME = arr[i].LCENTRY_CNAME;
}
if(flowAction=='start'){
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" id="MainElement" style="position: static;">'+
							'    <div class="contact-box">'+
							'		<form class="row cell" style="padding-right:50px;padding-bottom:40px">'+
  '	<input id="LC_ENTRY.LCENTRY_ID_4420" name="LCENTRY_ID" value="'+LCENTRY_ID+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_TITLE_4420" name="LCENTRY_TITLE" value="'+LCENTRY_TITLE+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_COMPID_4420" name="LCENTRY_COMPID" value="'+LCENTRY_COMPID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">工号: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_EMPCODE_4420" name="LCENTRY_EMPCODE" dataType="text" type="text" class="form-control" value="'+LCENTRY_EMPCODE+'" oninput="myFunction(this,\'LCENTRY_EMPCODE\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  readonly="true" style="width:200px;height:; border:none;float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_ENTRY.LCENTRY_DEPID_4420" name="LCENTRY_DEPID" value="'+LCENTRY_DEPID+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_EMPID_4420" name="LCENTRY_EMPID" value="'+LCENTRY_EMPID+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">姓名: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_EMPIDNAME_4420" name="LCENTRY_EMPIDNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_EMPIDNAME+'" oninput="myFunction(this,\'LCENTRY_EMPIDNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">公司: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_COMPIDNAME_4420" name="LCENTRY_COMPIDNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_COMPIDNAME+'" oninput="myFunction(this,\'LCENTRY_COMPIDNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">部门: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_DEPIDNAME_4420" name="LCENTRY_DEPIDNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_DEPIDNAME+'" oninput="myFunction(this,\'LCENTRY_DEPIDNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_ENTRY.LCENTRY_EMPSTATUS_4420" name="LCENTRY_EMPSTATUS" value="'+LCENTRY_EMPSTATUS+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_GENDER_4420" name="LCENTRY_GENDER" value="'+LCENTRY_GENDER+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_MARRIAGESTATUS_4420" name="LCENTRY_MARRIAGESTATUS" value="'+LCENTRY_MARRIAGESTATUS+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">出生日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="LC_ENTRY.LCENTRY_BIRTHDAY_4420" styleType="dateTime" value="'+LCENTRY_BIRTHDAY+'"  style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="LCENTRY_BIRTHDAY"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_ENTRY.LCENTRY_POLITICALSTATUS_4420" name="LCENTRY_POLITICALSTATUS" value="'+LCENTRY_POLITICALSTATUS+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_JOBRANK_4420" name="LCENTRY_JOBRANK" value="'+LCENTRY_JOBRANK+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">职称: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_JOBTITLENAMENAME_4420" name="LCENTRY_JOBTITLENAMENAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_JOBTITLENAMENAME+'" oninput="myFunction(this,\'LCENTRY_JOBTITLENAMENAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">职务等级: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_JOBRANKNAME_4420" name="LCENTRY_JOBRANKNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_JOBRANKNAME+'" oninput="myFunction(this,\'LCENTRY_JOBRANKNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">员工状态: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_EMP_EMPSTATUSNAME_4420" name="LCENTRY_EMP_EMPSTATUSNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_EMP_EMPSTATUSNAME+'" oninput="myFunction(this,\'LCENTRY_EMP_EMPSTATUSNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">户口所在地: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_RESIDENTADDRESS_4420" name="LCENTRY_RESIDENTADDRESS" dataType="text" type="text" class="form-control" value="'+LCENTRY_RESIDENTADDRESS+'" oninput="myFunction(this,\'LCENTRY_RESIDENTADDRESS\')"  emptyText=""  vtype="illegalChar;maxLength:100;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_ENTRY.LCENTRY_MAXEDUCATION_4420" name="LCENTRY_MAXEDUCATION" value="'+LCENTRY_MAXEDUCATION+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_NATION_4420" name="LCENTRY_NATION" value="'+LCENTRY_NATION+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_JOBTITLENAME_4420" name="LCENTRY_JOBTITLENAME" value="'+LCENTRY_JOBTITLENAME+'"   type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">证明需求(多选): </label>'+
	'<label for="LC_ENTRY.LCENTRY_POOF_4420"></label>'+
'<select id="LC_ENTRY.LCENTRY_POOF_4420" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证明需求(多选)")%>" name="LCENTRY_POOF"  columnId="84666" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="LC_ENTRY_DOCUMENT" dataField1 = "dict"  dataField="dicts_form_84666" multiSelect="true"initParam = "_"></select><span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">性别: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_GENDERNAME_4420" name="LCENTRY_GENDERNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_GENDERNAME+'" oninput="myFunction(this,\'LCENTRY_GENDERNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">婚姻状况: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_MARRIAGESTATUSNAME_4420" name="LCENTRY_MARRIAGESTATUSNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_MARRIAGESTATUSNAME+'" oninput="myFunction(this,\'LCENTRY_MARRIAGESTATUSNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">申请事由: </label>'+
  '			<textarea id="LC_ENTRY.LCENTRY_APPLICATIO_4420" name="LCENTRY_APPLICATIO" class="CCReadTextarea form-control"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:600px;height:58; float:left;padding:0;background-color:#fff">'+LCENTRY_APPLICATIO+'</textarea>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">证件需求: </label>'+
  '			<select id="LC_ENTRY.LCENTRY_DOCUMENT_4420" title="证件需求" styleType="select" name="LCENTRY_DOCUMENT" columnId="84668"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  dataField1 = "dict"  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="EMP_CERTTYPE" dataField="dicts_form_84668"initParam = "_"></select>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">政治面貌: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_POLITICALSTATUSNAME_4420" name="LCENTRY_POLITICALSTATUSNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_POLITICALSTATUSNAME+'" oninput="myFunction(this,\'LCENTRY_POLITICALSTATUSNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">文化程度: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_MAXEDUCATIONNAME_4420" name="LCENTRY_MAXEDUCATIONNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_MAXEDUCATIONNAME+'" oninput="myFunction(this,\'LCENTRY_MAXEDUCATIONNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">函件需求: </label>'+
	'<label for="LC_ENTRY.LCENTRY_DEMAND_4420"></label>'+
'<select id="LC_ENTRY.LCENTRY_DEMAND_4420" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"函件需求")%>" name="LCENTRY_DEMAND"  columnId="84669" class="selectpicker bla bla bli" multiple data-live-search="true" emptyText=""  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="LC_ENTRY_DEMAND" dataField1 = "dict"  dataField="dicts_form_84669" multiSelect="true"initParam = "_"></select><span style="color:red;line-height:35px;font-size:27px"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">是否出国: </label>'+
  '			<select id="LC_ENTRY.LCENTRY_WHETHER_4420" title="是否出国" styleType="select" name="LCENTRY_WHETHER" columnId="84670"  style="width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff" class="form-control " emptyText=""  onchange="LC_ENTRY_LCENTRY_WHETHER_valueChange_4420(this)" dataField1 = "dict"  required="true"  style="float:left;width:200px;" textField="dictName" valueField="dictId" DictName="att_yes_no" dataField="dicts_form_84670"initParam = "_"></select>'+
  '			<span style="color:red;"> * </span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">民族: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_NATIONNAME_4420" name="LCENTRY_NATIONNAME" dataType="text" type="text" class="form-control" value="'+LCENTRY_NATIONNAME+'" oninput="myFunction(this,\'LCENTRY_NATIONNAME\')"  emptyText=""  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">目的地: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_DESTINATION_4420" name="LCENTRY_DESTINATION" dataType="text" type="text" class="form-control" value="'+LCENTRY_DESTINATION+'" oninput="myFunction(this,\'LCENTRY_DESTINATION\')"  vtype="illegalChar;maxLength:100;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">年内已出国(境)次数: </label>'+
  '			<input id="LC_ENTRY.LCENTRY_NUMBER_4420" name="LCENTRY_NUMBER" dataType="text" type="text" class="form-control" value="'+LCENTRY_NUMBER+'" oninput="myFunction(this,\'LCENTRY_NUMBER\')"  vtype="illegalChar;maxLength:10;minLength:null;"  style="width:200px;height:; float:left;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">拟出发日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="LC_ENTRY.LCENTRY_DEPARTURE_4420" styleType="dateTime" value="'+LCENTRY_DEPARTURE+'"  style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="LCENTRY_DEPARTURE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">拟返回日期: </label>'+
  '			<div class="controls input-append date form_date1 input-group" data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;width: 134px;">'+
  '				<input style="width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff"type="text" readonly class="form-control " dateType="controls input-append date form_date1" id="LC_ENTRY.LCENTRY_RETURNDATE_4420" styleType="dateTime" value="'+LCENTRY_RETURNDATE+'"  style="width:134px;float:left;border-radius: 4px 0 0 4px;" name="LCENTRY_RETURNDATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />'+
	'				<span class="input-group-addon" name="closeButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-remove"></span></span>'+
  '				<span class="input-group-addon" name="clickButton" style="padding:1px 10px 2px 10px;font-size:12px"><span class="glyphicon glyphicon-th"></span></span>'+
  '			</div>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_ENTRY.LCENTRY_WHETHEROR_4420" name="LCENTRY_WHETHEROR" value="'+LCENTRY_WHETHEROR+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_STARTDATE_4420" name="LCENTRY_STARTDATE" value="'+LCENTRY_STARTDATE+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_EMDDATE_4420" name="LCENTRY_EMDDATE" value="'+LCENTRY_EMDDATE+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_OUTSIDE_4420" name="LCENTRY_OUTSIDE" value="'+LCENTRY_OUTSIDE+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_PUBLICREIMBUR_4420" name="LCENTRY_PUBLICREIMBUR" value="'+LCENTRY_PUBLICREIMBUR+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_REQUIREMENTS_4420" name="LCENTRY_REQUIREMENTS" value="'+LCENTRY_REQUIREMENTS+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_DOCUMENTS_4420" name="LCENTRY_DOCUMENTS" value="'+LCENTRY_DOCUMENTS+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_RESPONDENCE_4420" name="LCENTRY_RESPONDENCE" value="'+LCENTRY_RESPONDENCE+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_WHELEADER_4420" name="LCENTRY_WHELEADER" value="'+LCENTRY_WHELEADER+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_WHELEADERNAME_4420" name="LCENTRY_WHELEADERNAME" value="'+LCENTRY_WHELEADERNAME+'"   type="hidden" >'+
  '	<div class="col-lg-12 col-md-12 col-sm-12  col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;">我已阅读外事纪律: </label>'+ 
  '			<ul id="LC_ENTRY.LCENTRY_DISCIPLINE_4420" name="LCENTRY_DISCIPLINE" sonStyle="onclick=\'yyyy()\' readonly style=\'background-color:red\'" dataType="checkBox" class="RADIOT" DictName="att_yes_no" dataField1 = "dict"></ul>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
  '	<input id="LC_ENTRY.LCENTRY_FLAG_4420" name="LCENTRY_FLAG" value="'+LCENTRY_FLAG+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_BUSINESSID_4420" name="LCENTRY_BUSINESSID" value="'+LCENTRY_BUSINESSID+'"   type="hidden" >'+
  '	<input id="LC_ENTRY.LCENTRY_CNAME_4420" name="LCENTRY_CNAME" value="'+LCENTRY_CNAME+'"   type="hidden" >'+
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
			cellObj1 +=		'<input class="btn btn-info submitButton" id="submitButton_main1" type="button" value="提交" style="width:50px" onclick="submitButton_save_6093()"/>';
		}else{
			cellObj1 +=		'		<input class="btn btn-info checkButton" id="approved_main" type="button" value="通过" onclick="approved_refer_6094(\'通过\')"/>'+
'		<input class="btn btn-info checkButton" id="approved1_main" type="button" value="驳回" onclick="approved_refer_6095(\'驳回\')"/>'+
'		<input class="btn btn-info checkButton" id="temporaryStorage_main" type="button" value="暂存" onclick="temporaryStorage_save_6096()"/>'+
							'	</div>';
		}
	$("#CardAndCardForm").append(cellObj1);
	elementsListSelectInitFunction('#submitButton_main');//初始化新增下拉控件
	elementsListCheckboxInitFunction('#submitButton_main');//初始化复选框控件
	elementsListRadioInitFunction('#submitButton_main');//初始化复选框控件
	cardDateWidInitFunction();//初始化新增日期控件
if(LCENTRY_POOF.indexOf(",")>-1){
	$("[id='LC_ENTRY.LCENTRY_POOF_4420']").selectpicker('val',LCENTRY_POOF.split(','));
}
$("[id='LC_ENTRY.LCENTRY_DOCUMENT_4420']").val(LCENTRY_DOCUMENT);
if(LCENTRY_DEMAND.indexOf(",")>-1){
	$("[id='LC_ENTRY.LCENTRY_DEMAND_4420']").selectpicker('val',LCENTRY_DEMAND.split(','));
}
$("[id='LC_ENTRY.LCENTRY_WHETHER_4420']").val(LCENTRY_WHETHER);
	}
	function yyyy(){
		alert(1);
	}
</script>
</body>
</html>