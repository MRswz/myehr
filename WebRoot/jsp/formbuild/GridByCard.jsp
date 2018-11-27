<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
.contact-box{background-color:#1ab394;border-radius:10px;color:#ffffff}
</style>
</head>
<body style="background-color:#efefef;">
<div class="wrapper wrapper-content animated fadeInRight">
<div class="row" style="margin-left:0" id="GridByCard">
</div>
</div>
<script>
	var _formId_2295='2295';
var heightGadedata =[];
function changeHeightGadedata(data){
	heightGadedata = data;
}
var filterParam = {};
function grid_GridByCard_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_GridByCard_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2295;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	return JSON.stringify(pageReqeust);
}
function grid_GridByCard_fun11_2295(){
	$('#GridByCard_List').bootstrapTable('refresh');
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
    data:grid_GridByCard_fun(xx),//HTTP请求类型
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
        '<div class="col-md-6 col-sm-12 col-lg-3">'+
        '    <div class="contact-box">'+
        '        <a href="profile.html">'+
        '            <div class="col-sm-4">'+
        '                <div class="text-center">'+
        '                    <div class="m-t-xs font-bold" title="'+arr[i].EMPCODE+'-'+arr[i].CNAME+'"><span class=\"fa fa-cloud fa-5x\"></span></div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:26px" title="'+arr[i].EMPCODE+'-'+arr[i].CNAME+'"><strong>'+arr[i].EMPCODE+'-'+arr[i].CNAME+'</strong></h3>'+
		'				 <div>'+
		'  			  		<p title="'+arr[i].COMPID+'" class="tag1 left" >'+arr[i].COMPID+'</p>'+
		'  			  		<p title="'+arr[i].DEPID+'" class="tag2 left" >'+arr[i].DEPID+'</p>'+
		'  			  		<p title="'+arr[i].JOBID+'" class="tag3 left" >'+arr[i].JOBID+'</p></div>'+
		'<br>'+
        '                <address style="margin-top:7px">'+
        '            		国籍:'+ arr[i].COUNTRY +'<br>'+
        '           	            民族:'+ arr[i].NATION +'<br>'+
        '            		家庭住址:'+ arr[i].HOMEADDRESS +'<br>'+
        '            		出生日期:'+ arr[i].BIRTHDAY +'<br>'+
        '                </address>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#GridByCard').append(cellObj);
}
};
})
;</script>
</body>
</html>