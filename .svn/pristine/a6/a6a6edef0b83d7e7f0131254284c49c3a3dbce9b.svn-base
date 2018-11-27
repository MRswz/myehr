<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/gridbycard.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>联系人</title>
<style type="text/css">
    /*这行很重要!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    html,body{min-height: 100%;}
</style>
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight" style="height:100%;overflow-y:auto">
<div class="row" style="margin-left:0" id="TEST_GRIDBYCARD">

</div>
</div>
<script>
	var _formId_2563='2563';
var heightGadedata =[];
function changeHeightGadedata(data){
	heightGadedata = data;
}

var filterParam = {};
var containerParam ;
function grid_TEST_GRIDBYCARD_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_GRIDBYCARD_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2563;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	return JSON.stringify(pageReqeust);
}
function grid_TEST_GRIDBYCARD_fun11_2563(){
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
        return;            }
    loadDataDynamic();
}
//获取区间中的一个随机数
function rand(n, m){
    var random = Math.floor(Math.random()*(m-n+1)+n);
    return random;
};
var containerParam={};
var xx = {};
$(document).ready(function () {
	$("span").mouseover(function(){
		  $("span").css("background-color","yellow");
		});
loadDataStart();
watchScroll();
});
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_TEST_GRIDBYCARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        showDate(arr);
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
    data:grid_TEST_GRIDBYCARD_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false
}).done(function(data){
        Currentpage++;
        console.log(data);
        var arr=data.rows;
        if(arr.length > 0){
            hasData = true;
            showDate(arr);
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
function showDate(arr) {
var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
for (var i = arr.length - 1; i >= 0; i--) {
var colorNum = i%4;
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-4">'+
		'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-4">'+
		'                <span name=\"x'+i+'\" style="font-size:80;color:#ffffff;" class="fa fa-'+arr[i].TESTINFOR_tubiao+'">'+
		'            </div>'+
		'            <div class="col-xs-8 text-right">'+
		'				<div><span style="font-size:40;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_nianling+'</span></div>'+
		'				<div><span style="font-size:30;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
		'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
		'				<div><span style="font-size:0;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_ruxueshijian+'</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#TEST_GRIDBYCARD').append(cellObj);
}
}




</script>
</body>
</html>