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
</style>
<script type="text/javascript" src="js/LC_Branchstaffing_tab.js"></script>
</head>
<body class="gray-bg" >
<div class="container-fluid" style="height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;"><div class="row mainFormElement" style="margin-left:0;padding: 0 15px 0 0;" id="LC_Branchstaffing">
<input type="button" id="zhankai"  class="btn btn-info CCButtonelement" value="展开" style="position:absolute;right:30px;bottom:10px;z-index:999" onclick="showDate_Main(main_Datas,0,0)"/>
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
</div>
<script>
	var _formId_4091='4091';
var realFormId='${param.formId}';
var _currentdate_4091= getSystemDate();
var _currentdate_4091= getSystemDate();
var empid_session_4091='${sessionScope.empid}';
var param_empIds = '${param.empIds}';
var isApp = '${param.formType}';
var formId_main = '4091';
var flowAction = '${param.flowAction}';
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
changeFileCss();
})
var businessId;var heightGadedata_4091 =[];
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
	if('${param.businessId}'==''&&'parameter'=='parameter'){
		if(businessId==undefined){
			requestParam = {businessId:'${param.businessId}'};
		}else{
			requestParam = {businessId:businessId+""};
		}
	}else{
		requestParam = {businessId:'${param.businessId}'};
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
		 '						<label style="float:left;font-size:12px">申请人: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请日期: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">公司: </label>'+
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
    animationHover(cellObj, 'pulse');
    $('#LC_Branchstaffing').append(cellObj);
}else{
for (var i = arr.length - 1; i >= 0; i--) {
var PERSONNEL_TITLE = arr[i].PERSONNEL_TITLE;
var PERSONNEL_empcode = arr[i].PERSONNEL_empcode;
var PERSONNEL_empid = arr[i].PERSONNEL_empid;
var PERSONNEL_date = arr[i].PERSONNEL_date;
if(arr[i].PERSONNEL_date!=null){
	 PERSONNEL_date = new Date(PERSONNEL_date).Format("yyyy-MM-dd");
}
var PERSONNEL_compid = arr[i].PERSONNEL_compid;
var PERSONNEL_depid = arr[i].PERSONNEL_depid;
var PERSONNEL_jobid = arr[i].PERSONNEL_jobid;
var PERSONNEL_Department = arr[i].PERSONNEL_Department;
var PERSONNEL_Transfer = arr[i].PERSONNEL_Transfer;
var PERSONNEL_departmentconfirms = arr[i].PERSONNEL_departmentconfirms;
var PERSONNEL_Othersingle = arr[i].PERSONNEL_Othersingle;
var PERSONNEL_Dutytime = arr[i].PERSONNEL_Dutytime;
if(arr[i].PERSONNEL_Dutytime!=null){
	 PERSONNEL_Dutytime = new Date(PERSONNEL_Dutytime).Format("yyyy-MM-dd");
}
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-6">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+PERSONNEL_TITLE+'-'+PERSONNEL_empcode+'"><strong>'+PERSONNEL_TITLE+'-'+PERSONNEL_empcode+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请人:'+ PERSONNEL_empid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">申请日期:'+ PERSONNEL_date +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">公司:'+ PERSONNEL_compid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门:'+ PERSONNEL_depid +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位:'+ PERSONNEL_jobid +' </label>'+
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
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#LC_Branchstaffing').append(cellObj);
}
}
	}
</script>
</body>
</html>