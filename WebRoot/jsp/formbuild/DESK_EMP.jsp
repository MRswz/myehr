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
</head>
<body class="gray-bg">
<div class="row" style="margin-left:0" id="DESK_EMP">
</div>
</div>
<script>
	var _formId_4184='4184';
var realFormId='${param.formId}';
var userid;var heightGadedata_4184 =[];
var containerParam_4184 ={};
containerParam_4184 ={};
function changeHeightGadedata_4184(data){
	heightGadedata_4184 = data;
}
$(function() {
loadDataStart();
getEmpPhotoSYS();
});
var filterParam = {};
var queryParams;
function grid_DESK_EMP_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_DESK_EMP_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.userid}'==''&&'session'=='parameter'){
		if(userid==undefined){
			requestParam = {userid:'${param.userid}'};
		}else{
			requestParam = {};
		}
	}else{
		requestParam = {userid:'${sessionScope.userid}'};
	}
	pageReqeust.containerParam=containerParam_4184;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4184;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4184!=null&&heightGadedata_4184!=undefined){
		pageReqeust.heightGrade = heightGadedata_4184;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_DESK_EMP_fun11_4184(){
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
			   url:'/myehr/FileList/getEmpPhotoSYS.action',
			   type:'post',
			   cache: false,
			   async: false, 
			   success: function (data){ 
				   $("#Employee_Photo_WT").attr("src","data:image/gif;base64,"+data.c1101);
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
var containerParam_4184={};
var xx = {};
var main_Datas = [];
function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_DESK_EMP_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
	 	 Currentpage++;
        console.log(data);
        var arr=data.rows;
        main_Datas=data.rows;
        showDate_4184(arr);
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
    data:grid_DESK_EMP_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false
}).done(function(data){
        Currentpage++;
        console.log(data);
        var arr=data.rows;
        if(arr.length > 0){
            hasData = true;
            showDate_4184(arr);
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
function showDate_4184(arr) {
if('${param.flowAction}'=='start'){
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
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" ></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">性别: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">公司: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门: </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位: </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#DESK_EMP').append(cellObj);
}else{
for (var i = arr.length - 1; i >= 0; i--) {
var DESKNEWEMP01_CNAME = arr[i].DESKNEWEMP01_CNAME;
var DESKNEWEMP01_EMPCODE = arr[i].DESKNEWEMP01_EMPCODE;
var DESKNEWEMP01_VIR_GENDER = arr[i].DESKNEWEMP01_VIR_GENDER;
var DESKNEWEMP01_VIR_COMP = arr[i].DESKNEWEMP01_VIR_COMP;
var DESKNEWEMP01_VIR_DEP = arr[i].DESKNEWEMP01_VIR_DEP;
var DESKNEWEMP01_VIR_JOBNAME = arr[i].DESKNEWEMP01_VIR_JOBNAME;
var DESKNEWEMP01_JOINDATE = arr[i].DESKNEWEMP01_JOINDATE;
if(arr[i].DESKNEWEMP01_JOINDATE!=null){
	 DESKNEWEMP01_JOINDATE = new Date(DESKNEWEMP01_JOINDATE).Format("yyyy-MM-dd");
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
        '                <h3 style="margin-top:0;overflow:hidden;height:35px;color:#000000;" title="'+DESKNEWEMP01_CNAME+'-'+DESKNEWEMP01_EMPCODE+'"><strong>'+DESKNEWEMP01_CNAME+'-'+DESKNEWEMP01_EMPCODE+'</strong></h3>'+
        '                <div class="row" id="row" style="width:500px">'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">性别:'+ DESKNEWEMP01_VIR_GENDER +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">公司:'+ DESKNEWEMP01_VIR_COMP +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">部门:'+ DESKNEWEMP01_VIR_DEP +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">岗位:'+ DESKNEWEMP01_VIR_JOBNAME +' </label>'+
		 '					</div>'+
		 '				</div>'+
		 '				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">'+
		 '					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
		 '						<label style="float:left;font-size:12px">入职日期:'+ DESKNEWEMP01_JOINDATE +' </label>'+
		 '					</div>'+
		 '				</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#DESK_EMP').append(cellObj);
}
}
	}
</script>
</body>
</html>