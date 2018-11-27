<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardandcard.jsp" %>
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
.xxxx{margin-bottom:2px !important}
.maodian{height:30px;width:100px;display:block;text-align: center;font-size:15px;margin:0 0 20px 0;}
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
<script type="text/javascript" src="emp_zhucong_tab.js"></script>
<script type="text/javascript" src="test/jQuery.print.js"></script></head>
<body class="gray-bg" >
<div style="position:absolute;left:4%;z-index:999px" id="maodianS">
	<div style="position:absolute">
		<a href="#test_Main_Form"><input type="text" class="maodian form-control" value="置顶"/></a>
		<a href="#fubiao1"><input type="text" class="maodian form-control" value="基本信息"/></a>
		<a href="#fubiao2"><input type="text" class="maodian form-control" value="合同信息"/></a>
		<a href="#fubiao3"><input type="text" class="maodian form-control" value="职称信息"/></a>
		<a href="#fubiao4"><input type="text" class="maodian form-control" value="工作经历"/></a>
		<input type="button" class="btn btn-info" value="打印" onclick="initPrint()"/>
	</div>
</div>
<div class="container-fluid" id="CardAndCardForm" style="height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;width:80%">
<div class="row mainFormElement" style="margin-left:0;padding: 0 15px 0 0;position:relative;" id="test_Main_Form">
</div>
<div id="fubiao1" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">基本信息</h3>
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
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">合同信息</h3>
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
<div id="fubiao3" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">职称信息</h3>
<div class="BTNGROUP" style="padding:0 30px 0 0; display:inline-block;height: 35px;width:100%">
<div name="button" class="CCButton" style="margin-right:10px;float:right;">
	<input type="button" id="zhankai"  class="btn btn-info CCButtonelement" value="展开" onclick="changeFunction('fubiao3')"/>
	<input type="button" id="xinzeng" class="btn btn-info CCButtonelement" value="新增" onclick="addFunction('fubiao3')"/>
</div>
<div class="CCSelect" style="float:right;width:50%">
	<select id="showType" title="显示类型" styletype="select" name="showType" class="form-control CCShow" onchange="changeShowType('fubiao3')" style="float:right;width:95px;margin-left:5px;">
		<option value="youxiao" selected="">有效</option>
		<option value="zuixin">最新</option>
		<option value="all">所有</option>
	</select>
	<select id="showContent" title="显示内容" styletype="select" name="showContent" class="form-control CCShow" onchange="changeShowType('fubiao3')" style="float:right;width:95px;margin-left:5px;">
		<option value="account" selected="">合计</option>
	</select>
</div>
</div>
<!--展示部分-->
<div class="row" style="margin-left:0;padding: 0 15px 0 0;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #5cb85c;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
<div id="fubiao4" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px">工作经历</h3>
<div class="BTNGROUP" style="padding:0 30px 0 0; display:inline-block;height: 35px;width:100%">
<div name="button" class="CCButton" style="margin-right:10px;float:right;">
	<input type="button" id="zhankai"  class="btn btn-info CCButtonelement" value="展开" onclick="changeFunction('fubiao4')"/>
	<input type="button" id="xinzeng" class="btn btn-info CCButtonelement" value="新增" onclick="addFunction('fubiao4')"/>
</div>
<div class="CCSelect" style="float:right;width:50%">
	<select id="showType" title="显示类型" styletype="select" name="showType" class="form-control CCShow" onchange="changeShowType('fubiao4')" style="float:right;width:95px;margin-left:5px;">
		<option value="youxiao" selected="">有效</option>
		<option value="zuixin">最新</option>
		<option value="all">所有</option>
	</select>
	<select id="showContent" title="显示内容" styletype="select" name="showContent" class="form-control CCShow" onchange="changeShowType('fubiao4')" style="float:right;width:95px;margin-left:5px;">
		<option value="account" selected="">合计</option>
	</select>
</div>
</div>
<!--展示部分-->
<div class="row" style="margin-left:0;padding: 0 15px 0 0;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #5bc0de;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
</div>
<script>
var EMPVEMPBASIC_EMPID_parameter='${param.EMPVEMPBASIC_EMPID}';
var EMPVEMPBASIC_EMPID_parameter;
var EMPVEMPBASIC_EMPID_parameter='${param.EMPVEMPBASIC_EMPID}';
var EMPVEMPBASIC_EMPID_parameter;
var EMPVEMPBASIC_EMPID_parameter='${param.EMPVEMPBASIC_EMPID}';
var EMPVEMPBASIC_EMPID_parameter;
var EMPVEMPBASIC_EMPID_parameter='${param.EMPVEMPBASIC_EMPID}';
var EMPVEMPBASIC_EMPID_parameter;
	var _formId_4362='4362';
var realFormId='${param.formId}';
var param_empIds = '${param.empIds}';
var isApp = '${param.formType}';
var formId_main = '4362';
var flowAction = '${param.flowAction}';
$(document).ready(function () {
loadDataStart();
getEmpPhotoSYS();
$("#fubiao1 #showType").val('youxiao');
$("#fubiao2 #showType").val('youxiao');
$("#fubiao3 #showType").val('youxiao');
$("#fubiao4 #showType").val('youxiao');
changeShowType('fubiao1');
changeShowType('fubiao2');
changeShowType('fubiao3');
changeShowType('fubiao4');
$("#fubiao1 #showContent").remove();
$("#fubiao1 #TEST_FEE_INFO_FORM").remove();
changeFunction('fubiao1');
$("#fubiao2 #showContent").remove();
$("#fubiao2 #TEST_FEE_INFO_FORM").remove();
changeFunction('fubiao2');
$("#fubiao3 #showContent").remove();
$("#fubiao3 #TEST_FEE_INFO_FORM").remove();
changeFunction('fubiao3');
$("#fubiao4 #showContent").remove();
$("#fubiao4 #TEST_FEE_INFO_FORM").remove();
changeFunction('fubiao4');
changeFileCss();
})
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
var EMPVEMPLOYEE_EMPID;var heightGadedata_4362 =[];
var containerParam_4362 ={};
containerParam_4362 ={};
function changeHeightGadedata_4362(data){
	heightGadedata_4362 = data;
}
var heightGadedata_4366 =[];
var containerParam_4366 ={};
containerParam_4366 ={};
function changeHeightGadedata_4366(data){
	heightGadedata_4366 = data;
}
var _formId_4366='4366';
var heightGadedata_4363 =[];
var containerParam_4363 ={};
containerParam_4363 ={};
function changeHeightGadedata_4363(data){
	heightGadedata_4363 = data;
}
var _formId_4363='4363';
var heightGadedata_4367 =[];
var containerParam_4367 ={};
containerParam_4367 ={};
function changeHeightGadedata_4367(data){
	heightGadedata_4367 = data;
}
var _formId_4367='4367';
var heightGadedata_4365 =[];
var containerParam_4365 ={};
containerParam_4365 ={};
function changeHeightGadedata_4365(data){
	heightGadedata_4365 = data;
}
var _formId_4365='4365';
var filterParam = {};
var queryParams;
function grid_test_Main_Form_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_test_Main_Form_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.EMPVEMPLOYEE_EMPID}'==''&&'parameter'=='parameter'){
		if(EMPVEMPLOYEE_EMPID==undefined){
			requestParam = {EMPVEMPLOYEE_EMPID:'${param.EMPVEMPLOYEE_EMPID}'};
		}else{
			requestParam = {EMPVEMPLOYEE_EMPID:EMPVEMPLOYEE_EMPID+""};
		}
	}else{
		requestParam = {EMPVEMPLOYEE_EMPID:'${param.EMPVEMPLOYEE_EMPID}'};
	}
	pageReqeust.containerParam=containerParam_4362;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4362;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4362!=null&&heightGadedata_4362!=undefined){
		pageReqeust.heightGrade = heightGadedata_4362;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_test_Main_Form_fun11_4362(){
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
var containerParam_4362={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_test_Main_Form_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        main_Datas=data.rows;
        showDate_4362(arr);
		if(arr.length>0){
			EMPVEMPBASIC_EMPID_parameter = arr[0].EMPVEMPBASIC_EMPID;
		}
      }
});
}function loadDataDynamic(){
//先显示正在加载中
if( $("#loadingLi").length === 0){
     $("#lianxiren").append("<div id='loadingLi' class='loading'>正在加载...</div>");
}else{
    $("#loadingLi").text("正在加载...").removeClass("space");
}
var loadingLi = document.getElementById("loadingLi");
//loadingLi.scrollIntoView();
//加载数据,数据加载完成后需要移除加载提示
var hasData = false, msg = "";
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_test_Main_Form_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false
}).done(function(data){
        Currentpage++;
        console.log(data);
        var arr=data.rows;
        if(arr.length > 0){
            hasData = true;
            showDate_4362(arr);
        }else{
            msg = "数据已加载到底了"
        }
        $("#lianxiren").append(loadingLi);
}).fail(function(){
    msg = "数据加载失败!";
 }).always(function(){
    !hasData && setTimeout(function(){
        $(document.body).scrollTop(document.body.scrollTop -40);
    }, 500);
       msg && $("#loadingLi").text(msg);
    //重新监听滚动
    setTimeout(watchScroll, 900);
 });
}
function showDate_4362(arr) {
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
var EMPVEMPBASIC_CENID = arr[i].EMPVEMPBASIC_CENID;
if(arr[i].EMPVEMPBASIC_CENID==null){
	 EMPVEMPBASIC_CENID = '';
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
}else{
EMPVEMPBASIC_BIRTHDAY = '';}
var EMPVEMPBASIC_WORKEMAIL = arr[i].EMPVEMPBASIC_WORKEMAIL;
if(arr[i].EMPVEMPBASIC_WORKEMAIL==null){
	 EMPVEMPBASIC_WORKEMAIL = '';
}
var EMPVEMPBASIC_MOBILE = arr[i].EMPVEMPBASIC_MOBILE;
if(arr[i].EMPVEMPBASIC_MOBILE==null){
	 EMPVEMPBASIC_MOBILE = '';
}
var EMPVEMPBASIC_WORKPHONE = arr[i].EMPVEMPBASIC_WORKPHONE;
if(arr[i].EMPVEMPBASIC_WORKPHONE==null){
	 EMPVEMPBASIC_WORKPHONE = '';
}
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-12">'+
        '    <div class="contact-box">'+
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
		 '						<label style="float:left;font-size:12px">公司:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:125px;font-size:12px" title="'+ EMPVEMPBASIC_COMPID +'" id=EMPVEMPBASIC_COMPID4362 value="'+ EMPVEMPBASIC_COMPID +'" />'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:100px;font-size:12px" title="'+ EMPVEMPBASIC_DEPID +'" id=EMPVEMPBASIC_DEPID4362 value="'+ EMPVEMPBASIC_DEPID +'" />'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">中心:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:100px;font-size:12px" title="'+ EMPVEMPBASIC_CENID +'" id=EMPVEMPBASIC_CENID4362 value="'+ EMPVEMPBASIC_CENID +'" />'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:100px;font-size:12px" title="'+ EMPVEMPBASIC_JOBID +'" id=EMPVEMPBASIC_JOBID4362 value="'+ EMPVEMPBASIC_JOBID +'" />'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">性别:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:100px;font-size:12px" title="'+ EMPVEMPBASIC_GENDER +'" id=EMPVEMPBASIC_GENDER4362 value="'+ EMPVEMPBASIC_GENDER +'" />'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">出生日期:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:100px;font-size:12px" title="'+ EMPVEMPBASIC_BIRTHDAY +'" id=EMPVEMPBASIC_BIRTHDAY4362 value="'+ EMPVEMPBASIC_BIRTHDAY +'" />'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">工作邮箱:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:100px;font-size:12px" title="'+ EMPVEMPBASIC_WORKEMAIL +'" id=EMPVEMPBASIC_WORKEMAIL4362 value="'+ EMPVEMPBASIC_WORKEMAIL +'" />'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">手机号码:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:100px;font-size:12px" title="'+ EMPVEMPBASIC_MOBILE +'" id=EMPVEMPBASIC_MOBILE4362 value="'+ EMPVEMPBASIC_MOBILE +'" />'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">办公电话:</label><input class="xxxx" style="overflow:hidden;border:none;max-width:100px;font-size:12px" title="'+ EMPVEMPBASIC_WORKPHONE +'" id=EMPVEMPBASIC_WORKPHONE4362 value="'+ EMPVEMPBASIC_WORKPHONE +'" />'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    $('#test_Main_Form').append(cellObj);
}
	}
	function initPrint(){
		$("#CardAndCardForm").css("width","100%");
		$(".CCFubiaoTitle").css("margin","0 0 0 15px");
		$(".TEST_FEE_INFO_FORM2 .col-md-12 .col-lg-4").removeClass("col-xs-12");
		$(".TEST_FEE_INFO_FORM2 .col-md-12 .col-lg-4").addClass("col-xs-6");
		$(".mainFormElement .col-sm-4").addClass("col-xs-4");
		$(".mainFormElement .col-sm-8").addClass("col-xs-8");
		$("#CardAndCardForm").print({
			globalStyles:true,//是否包含父文档的样式，默认为true
			mediaPrint:false,//是否包含media='print'的链接标签。会被globalStyles选项覆盖，默认为false
			stylesheet:null,//外部样式表的URL地址，默认为null
			noPrintSelector:".fa,.BTNGROUP",//不想打印的元素的jQuery选择器，默认为".no-print"
			iframe:true,//是否使用一个iframe来替代打印表单的弹出窗口，true为在本页面进行打印，false就是说新开一个页面打印，默认为true
			append:null,//将内容添加到打印内容的后面
			prepend:null,//将内容添加到打印内容的前面，可以用来作为要打印内容
			deferred:$.Deferred()//回调函数
		}); 
		$(".CCFubiaoTitle").css("margin","0 0 -45px 15px");
		$("#CardAndCardForm").css("width","80%");
		$(".TEST_FEE_INFO_FORM2 .col-md-12 .col-lg-4").addClass("col-xs-12");
		$(".TEST_FEE_INFO_FORM2 .col-md-12 .col-lg-4").removeClass("col-xs-6");
		$(".mainFormElement .col-sm-4").removeClass("col-xs-4");
		$(".mainFormElement .col-sm-8").removeClass("col-xs-8");
	}
</script>
</body>
</html>