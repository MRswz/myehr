<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/gridbycard.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>问卷</title>
<style type="text/css">
    /*这行很重要!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
    html,body{min-height: 100%;}
</style>
<link rel="stylesheet" href="js/star/css/starability-all.min.css" type="text/css"></link>
<script type="text/javascript" src="js/question.js"></script></head>
<body class="gray-bg">
<p style="font-size: 35px;font-weight: 900;text-align: center;">MyeHR第一张问卷</p>
<div class="wrapper wrapper-content animated fadeInRight" style="height:91%;overflow-y:auto">
<div class="row" style="margin-left:0"  id="测试问卷表单">
</div>
</div>
<script>
var _formId_2600='2600';
var heightGadedata =[];
function changeHeightGadedata(data){
	heightGadedata = data;
}
var filterParam = {};
var queryParams;
function grid_测试问卷表单_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_测试问卷表单_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='';
	pageReqeust.formId=_formId_2600;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_测试问卷表单_fun11_2600(){
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
    //loadDataDynamic();
}
//获取区间中的一个随机数
function rand(n, m){
    var random = Math.floor(Math.random()*(m-n+1)+n);
    return random;
};
var containerParam={};
var xx = {};
$(document).ready(function () {
loadDataStart();
//watchScroll();
});
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_测试问卷表单_fun(xx),//HTTP请求类型
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
}
function loadDataDynamic(){
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
    data:grid_测试问卷表单_fun(xx),//HTTP请求类型
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
var parame={
	    id:'',
	    value:"N",
	    width: "100px",
	    height:"45px",
	    url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
		  jsonParam:{},
	    chang:function (e){
	    }
	};
function showDate(arr) {
	var i1 = 0;
	var i2 = 0;
	var i3 = 0;
	var i4 = 0;
	var arr1 = [];
	var arr2 = [];
	var arr3 = [];
	var arr4 = [];
	for(var i = 0; i <= arr.length - 1; i++){
		if(arr[i].SYSTESTQUESTION_ANSWER_TYPE==1){//单选
			arr1[i1] = arr[i];
			i1++;
		}else if(arr[i].SYSTESTQUESTION_ANSWER_TYPE==3){//多选
			arr2[i2] = arr[i];
			i2++;
		}else if(arr[i].SYSTESTQUESTION_ANSWER_TYPE==2){//论述
			arr3[i3] = arr[i];
			i3++;
		}else if(arr[i].SYSTESTQUESTION_ANSWER_TYPE==4){//星条
			arr4[i4] = arr[i];
			i4++;
		}	
	}
	for (var i = 0; i <= arr1.length - 1; i++) {
	    var cellObj = $('<div class="col-md-12 col-sm-12 col-lg-12">'+
						'    <div class="contact-box">'+
						'            <div class="col-sm-11">'+
						'                <h3 style="margin-top:0;color:#000000;" title="'+arr1[i].SYSTESTQUESTION_SORT+'-'+arr1[i].SYSTESTQUESTION_QUESTION+'"><strong>'+arr1[i].SYSTESTQUESTION_SORT+'-'+arr1[i].SYSTESTQUESTION_QUESTION+'[单选题]</strong></h3>'+
						'                <div class="single" id="Single'+i+'" dataField = "'+arr1[i].SYSTESTQUESTION_ANSWER+'"></div>'+
						'            </div>'+
						'            <div class="clearfix"></div>'+
						'    </div>'+
						'</div>');
	    $('#测试问卷表单').append(cellObj);
	}

	for (var i = 0; i <= arr2.length - 1; i++) {
	    var cellObj = $('<div class="col-md-12 col-sm-12 col-lg-12">'+
						'    <div class="contact-box">'+
						'            <div class="col-sm-11">'+
						'                <h3 style="margin-top:0;color:#000000;" title="'+arr2[i].SYSTESTQUESTION_SORT+'-'+arr2[i].SYSTESTQUESTION_QUESTION+'"><strong>'+arr2[i].SYSTESTQUESTION_SORT+'-'+arr2[i].SYSTESTQUESTION_QUESTION+'[多选题]</strong></h3>'+
						'                <div class="Multiple" id="Multiple'+i+'" dataField = "'+arr2[i].SYSTESTQUESTION_ANSWER+'"></div>'+
						'            </div>'+
						'            <div class="clearfix"></div>'+
						'    </div>'+
						'</div>');
	    $('#测试问卷表单').append(cellObj);
	}

	for (var i = 0; i <= arr3.length - 1; i++) {
	    var cellObj = $('<div class="col-md-12 col-sm-12 col-lg-12">'+
						'    <div class="contact-box">'+
						'            <div class="col-sm-11">'+
						'                <h3 style="margin-top:0;color:#000000;" title="'+arr3[i].SYSTESTQUESTION_SORT+'-'+arr3[i].SYSTESTQUESTION_QUESTION+'"><strong>'+arr3[i].SYSTESTQUESTION_SORT+'-'+arr3[i].SYSTESTQUESTION_QUESTION+'[解答题]</strong></h3>'+
						'                <div class="Discuss" id="Discuss'+i+'" dataField = "'+arr3[i].SYSTESTQUESTION_ANSWER+'"></div>'+
						'            </div>'+
						'            <div class="clearfix"></div>'+
						'    </div>'+
						'</div>');
	    $('#测试问卷表单').append(cellObj);
	}
	for (var i = 0; i <= arr4.length - 1; i++) {
	    var cellObj = $('<div class="col-md-12 col-sm-12 col-lg-12">'+
						'    <div class="contact-box">'+
						'            <div class="col-sm-11">'+
						'                <h3 style="margin-top:0;color:#000000;" title="'+arr4[i].SYSTESTQUESTION_SORT+'-'+arr4[i].SYSTESTQUESTION_QUESTION+'"><strong>'+arr4[i].SYSTESTQUESTION_SORT+'-'+arr4[i].SYSTESTQUESTION_QUESTION+'</strong></h3>'+
						'                <div class="Star" id="Star'+i+'" dataField = "'+arr4[i].SYSTESTQUESTION_ANSWER+'"></div>'+
						'            </div>'+
						'            <div class="clearfix"></div>'+
						'    </div>'+
						'</div>');
	    $('#测试问卷表单').append(cellObj);
	}
	initSingleAnwser();
	initMultipleAnwser();
	initStarAnwser();
	initDiscussAnwser();
};
var dataField ;
function initSingleAnwser(){
	var classes = $(".single");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('dataField');
			myehr_initSingle(parame,dataField,i);
		}
}

function initMultipleAnwser(){
	var classes = $(".Multiple");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('dataField');
			myehr_initMultiple(parame,dataField,i);
		}
}

function initStarAnwser(){
	var classes = $(".Star");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('dataField');
			myehr_initStar(parame,dataField,i);
		}
}

function initDiscussAnwser(){
	var classes = $(".Discuss");
	for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var dataField=$(classes[i]).attr('dataField');
			myehr_initDiscuss(parame,dataField,i);
		}
}

</script>
</body>
</html>