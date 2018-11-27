<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/gridbycard.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css">
    /*这行很重要!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    html,body{min-height: 100%;}
</style>
<script type="text/javascript" src="js/testQuestion.js"></script>
<script type="text/javascript" src="js/jquery.knob.js"></script>
</head>
<body class="gray-bg">
<div class="row" style="margin-left:0" id="Card111">
</div>
</div>
<script>
	var _formId_3353='3353';
var realFormId='${param.formId}';
var heightGadedata_3353 =[];
var containerParam_3353 ={};
containerParam_3353 ={};
function changeHeightGadedata_3353(data){
	heightGadedata_3353 = data;
}
$(function() {
loadDataStart();
getEmpPhotoSYS();
});
var filterParam = {};
var queryParams;
function grid_Card111_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Card111_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_3353;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_3353;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3353!=null&&heightGadedata_3353!=undefined){
		pageReqeust.heightGrade = heightGadedata_3353;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Card111_fun11_3353(){
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
				   $("#Employee_Photo_WT").attr("src","data:image/jpg;base64,"+data.c1101);
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
var containerParam_3353={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_Card111_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        main_Datas=data.rows;
        showDate_3353(arr);
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
    data:grid_Card111_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false
}).done(function(data){
        Currentpage++;
        console.log(data);
        var arr=data.rows;
        if(arr.length > 0){
            hasData = true;
            showDate_3353(arr);
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
function showDate_3353(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
		var cellObj = $('<div class="col-md-2 col-sm-2 col-lg-2"  >'+
						'    <div class="widget style1 navy-bg" style="background-color:#fff">'+
						'        <div class="row" id="row">'+
						'            <div style="text-align:center">'+
						//'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=64&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:70;color:#ffffff;font-weight:800;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
						'				<input class="knob" id="hundred_realValue'+i+'" value="50">'+//'+arr[i].VIR_PERNUM+'
						'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#000;font-weight:400;">生日人数</span></div>'+
						'            </div>'+
						'        </div>'+
						'    </div>'+
						'</div>');
	//animationHover(cellObj, 'pulse');
	$('#Card111').append(cellObj);
	}
	$(".knob").knob({
		max: 100,
		min: 0,
		width:200,
		height:200,
		thickness: .1,
		fgColor: 'rgb(135, 206, 235)',
		bgColor: '#F5F5F5',
		'release':function(e){
		}
    });
}
</script>
</body>
</html>