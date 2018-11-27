<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardandcard.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css">
html,body{min-height: 100%;}
.row{padding:0 30px 0 15px}
.deleteButton:hover {color: red}
.saveButton:hover {color: red}
.updateButton:hover {color: red}
.contact-box{padding:5px !important ;margin-bottom:10px !important;}
</style>
<script type="text/javascript" src="<%=request.getContextPath() %>/jsp/formbuild/TEST2/cardAndcard.js"></script>
</head>
<body class="gray-bg">
<div class="row" style="margin-left:0;padding: 0 15px 0 30px;" id="TEST_INFO_FORM">
</div>
<div id="fubiao1" name="fubiao">
<div class="BTNGROUP" style="padding:0 30px 0 30px; display:inline-block;height: 35px;width:100%">
<div name="button" style="margin-right:10px;float:right;">
	<input type="button" id="zhankai" class="btn btn-info" value="展开" onclick="changeFunction('fubiao1')"/>
	<input type="button" id="xinzeng" class="btn btn-info" value="新增" onclick="addFunction('fubiao1')"/>
	<input type="button" id="baocun" class="btn btn-info" value="保存" onclick="saveFunction('fubiao1')"/>
</div>
<div name="select" style="margin-right:10px;float:right;width:50%">
	<select id="showType" title="显示类型" styletype="select" name="showType" class="form-control" onchange="changeShowType('fubiao1')" style="float:right;width:20%">
		<option value="youxiao" selected="">有效</option>
		<option value="zuixin">最新</option>
		<option value="all">所有</option>
	</select>
	<select id="showContent" title="显示内容" styletype="select" name="showContent" class="form-control" onchange="changeShowType('fubiao1')" style="float:right;width:20%">
		<option value="account" selected="">合计</option>
		<option value="info" >单条信息</option>
	</select>
</div>
</div>
<!--展示部分-->
<div class="row" style="margin-left:0;padding: 0 15px 0 30px;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row" style="margin-left:25px;border-left: 5px solid #307DE9;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
<div id="fubiao2" name="fubiao">
<div class="BTNGROUP" style="padding:0 30px 0 30px; display:inline-block;height: 35px;width:100%">
<div name="button" style="margin-right:10px;float:right;">
	<input type="button" id="zhankai" class="btn btn-info" value="展开" onclick="changeFunction('fubiao2')"/>
	<input type="button" id="xinzeng" class="btn btn-info" value="新增" onclick="addFunction('fubiao2')"/>
	<input type="button" id="baocun" class="btn btn-info" value="保存" onclick="saveFunction('fubiao2')"/>
</div>
<div name="select" style="margin-right:10px;float:right;width:50%">
	<select id="showType" title="显示类型" styletype="select" name="showType" class="form-control" onchange="changeShowType('fubiao2')" style="float:right;width:20%">
		<option value="youxiao" selected="">有效</option>
		<option value="zuixin">最新</option>
		<option value="all">所有</option>
	</select>
	<select id="showContent" title="显示内容" styletype="select" name="showContent" class="form-control" onchange="changeShowType('fubiao2')" style="float:right;width:20%">
		<option value="account" selected="">合计</option>
		<option value="info" >单条信息</option>
	</select>
</div>
</div>
<!--展示部分-->
<div class="row" style="margin-left:0;padding: 0 15px 0 30px;" id="TEST_FEE_INFO_FORM">
</div>
<!--展开部分-->
<div class="row" style="margin-left:25px;border-left: 5px solid #d9534f;padding:0;" id="TEST_FEE_INFO_FORM2">
</div>
</div>
<script>
var personId_parameter='${param.personId}';
var personId;var personId;var personId_parameter='${param.personId}';
var personId;var personId;	var _formId_3862='3862';
var realFormId='${param.formId}';
var param_empIds = '${param.empIds}';
$(document).ready(function () {
loadDataStart();
changeShowType('fubiao1');
changeShowType('fubiao2');
changeCssForApp1();
})
var CNAME;var heightGadedata_3862 =[];
var containerParam_3862 ={};
containerParam_3862 ={};
function changeHeightGadedata_3862(data){
	heightGadedata_3862 = data;
}
var heightGadedata_3863 =[];
var containerParam_3863 ={};
containerParam_3863 ={};
function changeHeightGadedata_3863(data){
	heightGadedata_3863 = data;
}
var _formId_3863='3863';
var heightGadedata_4059 =[];
var containerParam_4059 ={};
containerParam_4059 ={};
function changeHeightGadedata_4059(data){
	heightGadedata_4059 = data;
}
var _formId_4059='4059';
var filterParam = {};
var queryParams;
function grid_TEST_INFO_FORM_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_INFO_FORM_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.CNAME}'==''&&'parameter'=='parameter'){
		if(CNAME==undefined){
			requestParam = {CNAME:'${param.CNAME}'};
		}else{
			requestParam = {CNAME:CNAME+""};
		}
	}else{
		requestParam = {CNAME:'${param.CNAME}'};
	}
	pageReqeust.containerParam=containerParam_3862;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3862;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3862!=null&&heightGadedata_3862!=undefined){
		pageReqeust.heightGrade = heightGadedata_3862;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TEST_INFO_FORM_fun11_3862(){
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
var containerParam_3862={};
var xx = {};
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_TEST_INFO_FORM_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        showDate_3862(arr);
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
    data:grid_TEST_INFO_FORM_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false
}).done(function(data){
        Currentpage++;
        console.log(data);
        var arr=data.rows;
        if(arr.length > 0){
            hasData = true;
            showDate_3862(arr);
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
function showDate_3862(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
var TESTINFOR_china_name = arr[i].TESTINFOR_china_name;
var TESTINFOR_eng_name = arr[i].TESTINFOR_eng_name;
var TESTINFOR_zhuzhi = arr[i].TESTINFOR_zhuzhi;
var TESTINFOR_xuli = arr[i].TESTINFOR_xuli;
var TESTINFOR_biyeyuanxiao = arr[i].TESTINFOR_biyeyuanxiao;
var TESTINFOR_ruxueshijian = arr[i].TESTINFOR_ruxueshijian;
if(arr[i].TESTINFOR_ruxueshijian!=null){
	 TESTINFOR_ruxueshijian = new Date(TESTINFOR_ruxueshijian).Format("yyyy/MM/dd");
}
var TESTINFOR_biyeshijian = arr[i].TESTINFOR_biyeshijian;
var TESTINFOR_gongsi = arr[i].TESTINFOR_gongsi;
var TESTINFOR_bumen = arr[i].TESTINFOR_bumen;
    var cellObj = $(
        '<div class="col-md-12 col-sm-1 col-lg-12">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-4">'+
        '                <div class="text-center">'+
        '                    <img width="100" style="margin:0 auto" alt="image" title="'+TESTINFOR_china_name+'-'+TESTINFOR_eng_name+'" class="img-circle m-t-xs img-responsive" src="http://116.62.243.28:9875/'+arr[i].TESTINFOR_zhaopian+'">'+
        '                    <div class="m-t-xs font-bold" title="'+TESTINFOR_china_name+'-'+TESTINFOR_eng_name+'">'+arr[i].TESTINFOR_china_name+'</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+TESTINFOR_china_name+'-'+TESTINFOR_eng_name+'"><strong>'+TESTINFOR_china_name+'-'+TESTINFOR_eng_name+'</strong></h3>'+
        '                <p style="overflow:hidden;height:20px;font-size:12px;color:#000000" title="'+TESTINFOR_zhuzhi+'"><i class="fa fa-map-marker"></i> '+TESTINFOR_zhuzhi+'</p>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">学历:'+ TESTINFOR_xuli +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">毕业院校:'+ TESTINFOR_biyeyuanxiao +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">入学时间:'+ TESTINFOR_ruxueshijian +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">毕业时间:'+ TESTINFOR_biyeshijian +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">公司:'+ TESTINFOR_gongsi +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门:'+ TESTINFOR_bumen +' </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#TEST_INFO_FORM').append(cellObj);
}
personId_parameter = arr[0].TESTINFOR_id;
	}
</script>
</body>
</html>