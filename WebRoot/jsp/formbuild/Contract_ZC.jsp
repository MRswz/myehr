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
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/formbuild/contract_process/Contract_ZC.js"></script>
</head>
<body class="gray-bg" >
<div class="row mainFormElement" style="margin-left:0;padding: 0 15px 0 30px;" id="Contract_approval">
</div>
<input type="button" id="zhankai"  class="btn btn-info CCButtonelement" value="展开" onclick="showDate_Main(main_Datas,0,0)"/>
<div id="fubiao1" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color:#666;cursor: pointer;margin:0 0 -40px 28px">交易方</h3>
<div class="BTNGROUP" style="padding:0 30px 0 30px; display:inline-block;height: 35px;width:100%">
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
<div class="row" style="margin-left:0;padding: 0 15px 0 30px;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #307DE9;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
<div id="fubiao2" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color:#666;cursor: pointer;margin:0 0 -40px 28px">标的</h3>
<div class="BTNGROUP" style="padding:0 30px 0 30px; display:inline-block;height: 35px;width:100%">
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
<div class="row" style="margin-left:0;padding: 0 15px 0 30px;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #d9534f;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
<div id="fubiao3" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color:#666;cursor: pointer;margin:0 0 -40px 28px">付款条款</h3>
<div class="BTNGROUP" style="padding:0 30px 0 30px; display:inline-block;height: 35px;width:100%">
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
<div class="row" style="margin-left:0;padding: 0 15px 0 30px;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #5cb85c;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
<div id="fubiao4" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color:#666;cursor: pointer;margin:0 0 -40px 28px">合同条款</h3>
<div class="BTNGROUP" style="padding:0 30px 0 30px; display:inline-block;height: 35px;width:100%">
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
<div class="row" style="margin-left:0;padding: 0 15px 0 30px;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #5bc0de;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
<div id="fubiao5" name="fubiao" class="CCFubiao">
<h3 class="CCFubiaoTitle" style="display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color:#666;cursor: pointer;margin:0 0 -40px 28px">审批历史记录</h3>
<div class="BTNGROUP" style="padding:0 30px 0 30px; display:inline-block;height: 35px;width:100%">
<div name="button" class="CCButton" style="margin-right:10px;float:right;">
	<input type="button" id="zhankai"  class="btn btn-info CCButtonelement" value="展开" onclick="changeFunction('fubiao5')"/>
	<input type="button" id="xinzeng" class="btn btn-info CCButtonelement" value="新增" onclick="addFunction('fubiao5')"/>
</div>
<div class="CCSelect" style="float:right;width:50%">
	<select id="showType" title="显示类型" styletype="select" name="showType" class="form-control CCShow" onchange="changeShowType('fubiao5')" style="float:right;width:95px;margin-left:5px;">
		<option value="youxiao" selected="">有效</option>
		<option value="zuixin">最新</option>
		<option value="all">所有</option>
	</select>
	<select id="showContent" title="显示内容" styletype="select" name="showContent" class="form-control CCShow" onchange="changeShowType('fubiao5')" style="float:right;width:95px;margin-left:5px;">
		<option value="account" selected="">合计</option>
	</select>
</div>
</div>
<!--展示部分-->
<div class="row" style="margin-left:0;padding: 0 15px 0 30px;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row TEST_FEE_INFO_FORM2" style="margin:0 0 0 25px;border-left: 5px solid #f0ad4e;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
<script>
	var _formId_4223='4223';
var realFormId='${param.formId}';
var param_empIds = '${param.empIds}';
var isApp = '${param.formType}';
$(document).ready(function () {
loadDataStart();
$("#fubiao1 #showType").val('all');
$("#fubiao2 #showType").val('all');
$("#fubiao3 #showType").val('all');
$("#fubiao4 #showType").val('all');
$("#fubiao5 #showType").val('youxiao');
changeShowType('fubiao1');
changeShowType('fubiao2');
changeShowType('fubiao3');
changeShowType('fubiao4');
changeShowType('fubiao5');
changeFunction('fubiao1');
changeFunction('fubiao3');
changeFunction('fubiao4');
changeFunction('fubiao5');
initFileManage1(true,true,true,true,'','fubiao5');
initFileManage2('','','','','','fubiao5');
changeFileCss();
})
var heightGadedata_4223 =[];
var containerParam_4223 ={};
containerParam_4223 ={};
function changeHeightGadedata_4223(data){
	heightGadedata_4223 = data;
}
var heightGadedata_4224 =[];
var containerParam_4224 ={};
containerParam_4224 ={};
function changeHeightGadedata_4224(data){
	heightGadedata_4224 = data;
}
var _formId_4224='4224';
var heightGadedata_4227 =[];
var containerParam_4227 ={};
containerParam_4227 ={};
function changeHeightGadedata_4227(data){
	heightGadedata_4227 = data;
}
var _formId_4227='4227';
var heightGadedata_4229 =[];
var containerParam_4229 ={};
containerParam_4229 ={};
function changeHeightGadedata_4229(data){
	heightGadedata_4229 = data;
}
var _formId_4229='4229';
var heightGadedata_4230 =[];
var containerParam_4230 ={};
containerParam_4230 ={};
function changeHeightGadedata_4230(data){
	heightGadedata_4230 = data;
}
var _formId_4230='4230';
var heightGadedata_4231 =[];
var containerParam_4231 ={};
containerParam_4231 ={};
function changeHeightGadedata_4231(data){
	heightGadedata_4231 = data;
}
var _formId_4231='4231';
var filterParam = {};
var queryParams;
function grid_Contract_approval_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Contract_approval_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4223;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_4223;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4223!=null&&heightGadedata_4223!=undefined){
		pageReqeust.heightGrade = heightGadedata_4223;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Contract_approval_fun11_4223(){
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
var containerParam_4223={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_Contract_approval_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
		main_Datas=data.rows;
        showDate_4223(arr);
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
    data:grid_Contract_approval_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false
}).done(function(data){
        Currentpage++;
        console.log(data);
        var arr=data.rows;
        if(arr.length > 0){
            hasData = true;
            showDate_4223(arr);
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
function showDate_4223(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
var CONTRACTAPPROVAL_contractName = arr[i].CONTRACTAPPROVAL_contractName;
var CONTRACTAPPROVAL_contractIntention = arr[i].CONTRACTAPPROVAL_contractIntention;
var CONTRACTAPPROVAL_contractCode = arr[i].CONTRACTAPPROVAL_contractCode;
var CONTRACTAPPROVAL_descriptionType = arr[i].CONTRACTAPPROVAL_descriptionType;
var CONTRACTAPPROVAL_contractType = arr[i].CONTRACTAPPROVAL_contractType;
var CONTRACTAPPROVAL_purchaseWay = arr[i].CONTRACTAPPROVAL_purchaseWay;
var CONTRACTAPPROVAL_contractTotal = arr[i].CONTRACTAPPROVAL_contractTotal;
var CONTRACTAPPROVAL_promoter = arr[i].CONTRACTAPPROVAL_promoter;
var CONTRACTAPPROVAL_promoteDepartment = arr[i].CONTRACTAPPROVAL_promoteDepartment;
var CONTRACTAPPROVAL_major = arr[i].CONTRACTAPPROVAL_major;
var CONTRACTAPPROVAL_currency = arr[i].CONTRACTAPPROVAL_currency;
var CONTRACTAPPROVAL_purchaseType = arr[i].CONTRACTAPPROVAL_purchaseType;
var CONTRACTAPPROVAL_isForeign = arr[i].CONTRACTAPPROVAL_isForeign;
var CONTRACTAPPROVAL_isSupplementary = arr[i].CONTRACTAPPROVAL_isSupplementary;
var CONTRACTAPPROVAL_relevant = arr[i].CONTRACTAPPROVAL_relevant;
var CONTRACTAPPROVAL_remark = arr[i].CONTRACTAPPROVAL_remark;
    var cellObj = $(
        '<div class="col-md-12 col-sm-12 col-lg-12">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+CONTRACTAPPROVAL_contractName+'"><strong>'+CONTRACTAPPROVAL_contractName+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">合同意向:'+ CONTRACTAPPROVAL_contractIntention +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">合同编号:'+ CONTRACTAPPROVAL_contractCode +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">合同分类说明:'+ CONTRACTAPPROVAL_descriptionType +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">合同类型:'+ CONTRACTAPPROVAL_contractType +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">采购方式:'+ CONTRACTAPPROVAL_purchaseWay +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">合同总额:'+ CONTRACTAPPROVAL_contractTotal +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">承办人:'+ CONTRACTAPPROVAL_promoter +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">承办部门:'+ CONTRACTAPPROVAL_promoteDepartment +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">重大合同:'+ CONTRACTAPPROVAL_major +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">币种:'+ CONTRACTAPPROVAL_currency +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">采购类型:'+ CONTRACTAPPROVAL_purchaseType +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否涉外合同:'+ CONTRACTAPPROVAL_isForeign +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">是否补充合同:'+ CONTRACTAPPROVAL_isSupplementary +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">相关合同编号:'+ CONTRACTAPPROVAL_relevant +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">备注:'+ CONTRACTAPPROVAL_remark +' </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#Contract_approval').append(cellObj);
}
contractId_parameter = arr[0].contractId;
	}
</script>
</body>
</html>