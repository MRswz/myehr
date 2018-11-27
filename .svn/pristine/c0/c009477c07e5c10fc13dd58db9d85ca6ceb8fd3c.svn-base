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
<div class="row" style="margin-left:0" id="TEST_CARD1">
</div>
</div>
<script>
var _formId_3118='3118';
var china_name;var heightGadedata_3118 =[];
var containerParam_3118 ={};
containerParam_3118 ={};
function changeHeightGadedata_3118(data){
	heightGadedata_3118 = data;
}
var filterParam = {};
var queryParams;
function grid_TEST_CARD1_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TEST_CARD1_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.china_name}'==''){
		if(china_name==undefined){
			requestParam = {china_name:'${param.china_name}'};
		}else{
			requestParam = {china_name:china_name+""};
		}
	}else{
		requestParam = {china_name:'${param.china_name}'};
	}
	pageReqeust.containerParam=containerParam_3118;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_3118;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_3118!=null&&heightGadedata_3118!=undefined){
		pageReqeust.heightGrade = heightGadedata_3118;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TEST_CARD1_fun11_3118(){
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
var xx = {};
$(document).ready(function () {
loadDataStart();
});

function loadDataStart(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_TEST_CARD1_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_3118(arr);
      }
});
}

function showDate_3118(arr) {
var colors = new Array("#578ebe","#e35b5a","#44b6ae","#8775a7");
for (var i = arr.length - 1; i >= 0; i--) {
var colorNum = i%4;
    var cellObj = $(
			'<div class="col-md-4 col-sm-12 col-lg-4">'+
		'    <div class="widget style1 navy-bg" style="background-color:'+colors[colorNum]+'">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-4">'+
		'                <span style="font-size:80;color:#ffffff;" class="fa fa-thumbs-o-up">'+
		'            </div>'+
		'            <div class="col-xs-8 text-right">'+
		'				<div><span style="font-size:25;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_china_name+'</span></div>'+
		'				<div><span style="font-size:20;color:#ffffff;font-weight:400;">'+arr[i].TESTINFOR_biyeshijian+'</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
animationHover(cellObj, 'pulse');
$('#TEST_CARD1').append(cellObj);
}
}
</script>
</body>
</html>