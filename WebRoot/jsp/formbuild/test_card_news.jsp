<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/gridbycard.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script type="text/javascript" src="/myehr/common/js/date-format.js"></script>

<style type="text/css">
    /*这行很重要!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    html,body{min-height: 100%;}
</style>
</head>
<body class="gray-bg">
<div class="wrapper wrapper-content animated fadeInRight" style="height:100%;overflow-y:auto">
<div class="row" style="margin-left:0" id="test_card_news">
</div>
</div>
<script>
	var _formId_3810='3810';
var heightGadedata_3810 =[];
var containerParam_3810 ={};
containerParam_3810 ={};
function changeHeightGadedata_3810(data){
	heightGadedata_3810 = data;
}
var filterParam = {};
var queryParams;
function grid_test_card_news_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_test_card_news_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3810;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3810;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3810!=null&&heightGadedata_3810!=undefined){
		pageReqeust.heightGrade = heightGadedata_3810;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_test_card_news_fun11_3810(){
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
var containerParam_3810={};
var xx = {};
$(document).ready(function () {
loadDataStart();
watchScroll();
});
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_test_card_news_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        showDate_3810(arr);
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
    data:grid_test_card_news_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false
}).done(function(data){
        Currentpage++;
        console.log(data);
        var arr=data.rows;
        if(arr.length > 0){
            hasData = true;
            showDate_3810(arr);
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
function showDate_3810(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
	var SYSNEWS_title = arr[i].SYSNEWS_title;
	var SYSNEWS_img = arr[i].SYSNEWS_img;
	var SYSNEWS_releaser = arr[i].SYSNEWS_releaser;
	var SYSNEWS_releasedate = arr[i].SYSNEWS_releasedate;
	if(arr[i].SYSNEWS_releasedate){
		 SYSNEWS_releasedate = new Date(SYSNEWS_releasedate).Format("yyyy-MM-dd");
	}
	var SYSNEWS_enddate = arr[i].SYSNEWS_enddate;
	if(arr[i].SYSNEWS_enddate){
		 SYSNEWS_enddate = new Date(SYSNEWS_enddate).Format("yyyy-MM-dd");
	}
    var cellObj = $(
        '<div class="col-md-6 col-sm-12 col-lg-3">'+
        '    <div class="contact-box">'+
        '            <div class="col-sm-4">'+
        '                <div class="text-center">'+
        '                    <img width="100" style="margin:0 auto" alt="image" title="'+SYSNEWS_title+'" class="img-circle m-t-xs img-responsive" src="http://192.168.1.109:9999/'+SYSNEWS_img+'">'+
        '                    <div class="m-t-xs font-bold" title="'+SYSNEWS_title+'">'+SYSNEWS_title+'</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#ff8080;" title="'+SYSNEWS_title+'"><strong>'+SYSNEWS_title+'</strong></h3>'+
        '                <address style="margin-top:7px">'+
        '            <p style="color:#000000;font-size:12px">发布人:'+ SYSNEWS_releaser +'</p>'+
        '            <p style="color:#000000;font-size:12px">发布时间:'+SYSNEWS_releasedate+'</p>'+
        '            <p style="color:#000000;font-size:12px">截止日期:'+SYSNEWS_enddate+'</p>'+
        '                </address>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#test_card_news').append(cellObj);
}
};
</script>
</body>
</html>