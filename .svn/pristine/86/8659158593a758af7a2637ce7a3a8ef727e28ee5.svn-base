<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body class="gray-bg" style="background-color:#efefef;">
<div class="wrapper wrapper-content animated fadeInRight" style="min-height:100%">
<div class="row" style="margin-left:0" id="zxcx">
</div>
</div>
<script>
	var _formId_2296='2296';
var heightGadedata =[];
function changeHeightGadedata(data){
	heightGadedata = data;
}
var filterParam = {};
function grid_zxcx_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_zxcx_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds='${param.empIds}';
	pageReqeust.formId=_formId_2296;
	pageReqeust.isView=null;
	if(heightGadedata!=null&&heightGadedata!=undefined){
		pageReqeust.heightGrade = heightGadedata;
	}
	return JSON.stringify(pageReqeust);
}
function grid_zxcx_fun11_2296(){
	$('#zxcx_List').bootstrapTable('refresh');
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
    data:grid_zxcx_fun(xx),//HTTP请求类型
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
        '                    <img width="100" style="margin:0 auto" alt="image" title="'+arr[i].see_name+'-'+arr[i].see_emp_code+'" class="img-circle m-t-xs img-responsive" src="http://192.168.1.109:9999/'+arr[i].see_dept+'">'+
        '                    <div class="m-t-xs font-bold" title="'+arr[i].see_name+'-'+arr[i].see_emp_code+'">'+arr[i].see_name+'</div>'+
        '                </div>'+
        '            </div>'+
        '            <div class="col-sm-8">'+
        '                <h3 style="margin-top:0;overflow:hidden;height:26px" title="'+arr[i].see_name+'-'+arr[i].see_emp_code+'"><strong>'+arr[i].see_name+'-'+arr[i].see_emp_code+'</strong></h3>'+
'<div>  			  <p title="'+arr[i].see_sex+'" class="tag1 left" >'+arr[i].see_sex+'</p>  			  <p title="'+arr[i].see_marry+'" class="tag2 left" >'+arr[i].see_marry+'</p>  			  <p title="'+arr[i].see_educational+'" class="tag3 left" >'+arr[i].see_educational+'</p></div>'+
        '                <br><address style="margin-top:5px">'+
        '            毕业院校:'+ arr[i].see_unversity +'<br>'+
        '            专业:'+ arr[i].see_major +'<br>'+
        '            毕业时间:'+ arr[i].see_graduate_date +'<br>'+
        '            户籍地址:'+ arr[i].see_address +'<br>'+
        '                </address>'+
        '            </div>'+
        '            <div class="clearfix"></div>'+
        '        </a>'+
        '    </div>'+
        '</div>');
    animationHover(cellObj, 'pulse');
    $('#zxcx').append(cellObj);
}
};
})
;</script>
</body>
</html>