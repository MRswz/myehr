<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body style="background-color:#efefef;">
<div class="wrapper wrapper-content animated fadeInRight">
<div class="row" style="margin-left:0" id="lianxiren">
</div>
</div>
<script>
	var _formId_2539='2539';
var heightGadedata =[];
function changeHeightGadedata(data){
	heightGadedata = data;
}
var filterParam = {};
function grid_lianxiren_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_lianxiren_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2539;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	return JSON.stringify(pageReqeust);
}
function grid_lianxiren_fun11_2539(){
	$('#lianxiren_List').bootstrapTable('refresh');
}
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
var containerParam={};
$(document).ready(function () {
var xx = {};
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_lianxiren_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    success: function (data) {
        console.log(data);
        var arr=data.rows;
        showDate(arr);
      }
});
function showDate(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
        '<div class="col-md-6 col-sm-12 col-lg-4">'+
        '    <div class="contact-box">'+
        '        <a href="profile.html">'+
        '            <div class="col-sm-4">'+
        '                <div class="text-center">'+
        '                    <img width="100" style="margin:0 auto" alt="image" title="'+arr[i].TESTINFOR_china_name+'丶'+arr[i].TESTINFOR_eng_name+'" class="img-circle m-t-xs img-responsive" src="http://192.168.1.109:9999/'+arr[i].TESTINFOR_zhaopian+'">'+
        '                    <div class="m-t-xs font-bold" title="'+arr[i].TESTINFOR_china_name+'丶'+arr[i].TESTINFOR_eng_name+'">'+arr[i].TESTINFOR_china_name+'</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:26px;color:#ff0000;" title="'+arr[i].TESTINFOR_china_name+'丶'+arr[i].TESTINFOR_eng_name+'"><strong>'+arr[i].TESTINFOR_china_name+'丶'+arr[i].TESTINFOR_eng_name+'</strong></h3>'+
        '                <p style="overflow:hidden;height:20px;font-size:10;color:#400040" title="'+arr[i].TESTINFOR_guoji+'*'+arr[i].TESTINFOR_jiguan+'*'+arr[i].TESTINFOR_zhuzhi+'"><i class="fa fa-map-marker"></i> '+arr[i].TESTINFOR_guoji+'*'+arr[i].TESTINFOR_jiguan+'*'+arr[i].TESTINFOR_zhuzhi+'</p>'+
        '                <address style="margin-top:7px">'+
        '            <p style="color:#000000;font-size:14">毕业院校:'+ arr[i].TESTINFOR_biyeyuanxiao +'</p>'+
        '            <p style="color:#000000;font-size:14">入学时间:'+ arr[i].TESTINFOR_ruxueshijian +'</p>'+
        '            <p style="color:#000000;font-size:14">毕业时间:'+ arr[i].TESTINFOR_biyeshijian +'</p>'+
        '            <p style="color:#000000;font-size:14">公司:'+ arr[i].TESTINFOR_gongsi +'</p>'+
        '                </address>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#lianxiren').append(cellObj);
}
};
})
;</script>
</body>
</html>