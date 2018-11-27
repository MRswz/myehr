var _formId_4767='4767';
var heightGadedata_4767 =[];
var containerParam_4767 ={};
containerParam_4767 ={};
function changeHeightGadedata_4767(data){
	heightGadedata_4767 = data;
}
var _formId_4761='4761';
var heightGadedata_4761 =[];
var containerParam_4761 ={};
containerParam_4761 ={};
function changeHeightGadedata_4761(data){
	heightGadedata_4761 = data;
}
var _formId_4771='4771';
var heightGadedata_4771 =[];
var containerParam_4771 ={};
containerParam_4771 ={};
function changeHeightGadedata_4771(data){
	heightGadedata_4771 = data;
}
var _formId_4763='4763';
var heightGadedata_4763 =[];
var containerParam_4763 ={};
containerParam_4763 ={};
function changeHeightGadedata_4763(data){
	heightGadedata_4763 = data;
}
var _formId_4765='4765';
var heightGadedata_4765 =[];
var containerParam_4765 ={};
containerParam_4765 ={};
function changeHeightGadedata_4765(data){
	heightGadedata_4765 = data;
}

var _formId_4794='4794';
var USERID;
var heightGadedata_4794 =[];
var containerParam_4794 ={};
function changeHeightGadedata_4794(data){
	heightGadedata_4794 = data;
}

var _formId_4795='4795';
var heightGadedata_4795 =[];
var containerParam_4795 ={};
containerParam_4795 ={};
function changeHeightGadedata_4795(data){
	heightGadedata_4795 = data;
}

var _formId_4796='4796';
var heightGadedata_4796 =[];
var containerParam_4796 ={};
containerParam_4796 ={};
function changeHeightGadedata_4796(data){
	heightGadedata_4796 = data;
}

var _formId_4797='4797';
var heightGadedata_4797 =[];
var containerParam_4797 ={};
containerParam_4797 ={};
function changeHeightGadedata_4797(data){
	heightGadedata_4797 = data;
}
var _formId_4799='4799';
var heightGadedata_4799 =[];
var containerParam_4799 ={};
containerParam_4799 ={};
function changeHeightGadedata_4799(data){
	heightGadedata_4799 = data;
}
var _formId_4804='4804';
var heightGadedata_4804 =[];
var containerParam_4804 ={};
containerParam_4804 ={};
function changeHeightGadedata_4804(data){
	heightGadedata_4804 = data;
}
var heightGadedata_4813 =[];
var containerParam_4813 ={};
containerParam_4813 ={};
function changeHeightGadedata_4813(data){
	heightGadedata_4813 = data;
}
var _formId_4813='4813';
var heightGadedata_4807 =[];
var containerParam_4807 ={};
containerParam_4807 ={};
function changeHeightGadedata_4807(data){
	heightGadedata_4807 = data;
}
var _formId_5011='5011';
var heightGadedata_5011 =[];
var containerParam_5011 ={};
containerParam_5011 ={};
function changeHeightGadedata_5011(data){
	heightGadedata_5011 = data;
}
var _formId_5010='5010';
var heightGadedata_5010 =[];
var containerParam_5010 ={};
containerParam_5010 ={};
function changeHeightGadedata_5010(data){
	heightGadedata_5010 = data;
}
var _formId_5017='5017';
var heightGadedata_5017 =[];
var containerParam_5017 ={};
containerParam_5017 ={};
function changeHeightGadedata_5017(data){
	heightGadedata_5017 = data;
}
var _formId_3999='3999';
var heightGadedata_3999 =[];
var containerParam_3999 ={};
containerParam_3999 ={};
function changeHeightGadedata_3999(data){
	heightGadedata_3999 = data;
}
var _formId_4017='4017';
var heightGadedata_4017 =[];
var containerParam_4017 ={};
containerParam_4017 ={};
function changeHeightGadedata_4017(data){
	heightGadedata_4017 = data;
}
function grid_WARNING_PRO_CARD_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4017;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4017;
	pageReqeust.isView=null;
	if(heightGadedata_4017!=null&&heightGadedata_4017!=undefined){
		pageReqeust.heightGrade = heightGadedata_4017;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function loaddata(e){
	var ANNOUNCEMENT_TITLE = $("#ANNOUNCEMENT_TITLE").val();
	var url = "/myehr/announcement/queryAnnouncement.action?ANNOUNCEMENT_TITLE="+ANNOUNCEMENT_TITLE; 
	$.ajax({
			url:url,
			cache: true,
			success: function (result) {
				setData(result,e);
			}
		});

	}
	//
	function showNews(){
		var url = '/myehr/jsp/announcement/ShowAnnouncements.jsp';
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['85%','85%'],
			maxmin:true,
			title:'公告',
			content:url,
			success:function(layero,index){			
			}
		 }); 
	}
	function show(id){
		var idx = id+1000;///myehr_0_SQLSERVER/WebRoot/jsp/announcement/announcementDetail.jsp
		parent.addTab(idx,"新闻详情","/myehr/jsp/announcement/announcementDetail.jsp?id="+id);
	}	
	function setData(list,e){
		var temp = '';
		var num = 4;
		if(e=='EMPLOYEE'){
			num = 18;
		}
		for(var i=0; i<num&&i<list.length; i++){
			temp += '<li style="height:30px">'+
					'	<p style="font-size:14px;float:left;width:100px">['+formatDateTime(list[i].createTime)+']</p><p style="font-size:14px;float:left;"><a href="#" onclick="show('+list[i].id+')">'+list[i].title+'</a></p>'+
					'</li>';
		}
		$("#content").html(temp);
	}

	function formatDateTime(inputTime) {    
		var date = new Date(inputTime);  
		var y = date.getFullYear();    
		var m = date.getMonth() + 1;    
		m = m < 10 ? ('0' + m) : m;    
		var d = date.getDate();    
		d = d < 10 ? ('0' + d) : d;    
		var h = date.getHours();  
		h = h < 10 ? ('0' + h) : h;  
		var minute = date.getMinutes();  
		var second = date.getSeconds();  
		minute = minute < 10 ? ('0' + minute) : minute;    
		second = second < 10 ? ('0' + second) : second;   
		return y + '-' + m + '-' + d;   
	}; 
	
function loadDataStart_4017(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_WARNING_PRO_CARD_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_4017(arr);
	      }
	});
}

function showDate_4017(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=4013&VIR_PRO='+arr[i].VIR_PRO+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:400;">'+arr[i].VIR_PRO+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">试用期到期提醒</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#WARNING_PRO_CARD').append(cellObj);
	}
}



var _formId_4003='4003';
var heightGadedata_4003 =[];
var containerParam_4003 ={};
containerParam_4003 ={};
function changeHeightGadedata_4003(data){
   heightGadedata_4003 = data;
}


function grid_WARNING_BRITHDAY_CARD_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4003;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4003;
	pageReqeust.isView=null;
	if(heightGadedata_4003!=null&&heightGadedata_4003!=undefined){
		pageReqeust.heightGrade = heightGadedata_4003;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}


function loadDataStart_4003(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_WARNING_BRITHDAY_CARD_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_4003(arr);
	      }
	});
}

function showDate_4003(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#F08080">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=4013&VIR_PRO='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:400;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">下月生日人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#WARNING_BRITHDAY').append(cellObj);
	}
}


var _formId_4032='4032';
var heightGadedata_4032 =[];
var containerParam_4032 ={};
containerParam_4032 ={};
function changeHeightGadedata_4032(data){
   heightGadedata_4032 = data;
}


function grid_WARNING_BORROW_CARD_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4032;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4032;
	pageReqeust.isView=null;
	if(heightGadedata_4032!=null&&heightGadedata_4032!=undefined){
		pageReqeust.heightGrade = heightGadedata_4032;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}


function loadDataStart_4032(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_WARNING_BORROW_CARD_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_4032(arr);
	      }
	});
}

function showDate_4032(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#48D1CC">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=4013&VIR_PRO='+arr[i].VIR_BORROW+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:400;">'+arr[i].VIR_BORROW+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">外单位借调到期人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#WARNING_BORROW').append(cellObj);
	}
}


var _formId_4181='4181';
var heightGadedata_4181 =[];
var containerParam_4181 ={};
containerParam_4181 ={};
function changeHeightGadedata_4181(data){
   heightGadedata_4181 = data;
}


function grid_WARNING_EMP_CADRE_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4181;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4181;
	pageReqeust.isView=null;
	if(heightGadedata_4181!=null&&heightGadedata_4181!=undefined){
		pageReqeust.heightGrade = heightGadedata_4181;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}


function loadDataStart_4181(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_WARNING_EMP_CADRE_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_4181(arr);
	      }
	});
}

function showDate_4181(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#87CEFA">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=4013&VIR_PRO='+arr[i].VIR_CADRE+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:400;">'+arr[i].VIR_CADRE+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">干部试用期到期人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#WARNING_EMP').append(cellObj);
	}
}
function grid_WARNING_CONCOUNT_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
	pageReqeust.containerParam=containerParam_3999;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_3999;
	pageReqeust.isView=null;
	if(heightGadedata_3999!=null&&heightGadedata_3999!=undefined){
		pageReqeust.heightGrade = heightGadedata_3999;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function loadDataStart_3999(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_WARNING_CONCOUNT_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_3999(arr);
	      }
	});
}

function showDate_3999(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=4000&VIR_CONTRACTOVER='+arr[i].VIR_CONTRACTOVER+'"><span style="height:10%;text-align:center;display:block;font-size:60;color:#ffffff;font-weight:400;">'+arr[i].VIR_CONTRACTOVER+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">合同到期共</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#WARNING_CONCOUNT').append(cellObj);
	}
}

var _formId_4807='4807';
function initCharts_4809(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('EMP_V_EMPLOYEE_TU1_chart'));
	var options={
			color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'全行客户经理等级分布',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'客户经理级别',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4809(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_EMPLOYEE_EMPGRADE_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4809(text.rows);
		},
	});
}
function initArrData_4809(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_EMPGRADE';
	var formDefSql = 'SELECT  EMP_V_EMPLOYEE.EMPGRADE AS EMPVEMPLOYEE_EMPGRADE   FROM  EMP_V_EMPLOYEE  WHERE EMPGRADE IS NOT NULL  AND  empstatus=1';
	var url='/myehr/charts/searchChartsType.action?xColumnId=87947&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_EMPGRADE==datas[j].EMPVEMPLOYEE_EMPGRADE){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4809(xAxisData,seriesData)
		},
	});
}
    //showMoreBtn($(".BTNGROUP_4807"));
var filterParam = {};
var queryParams;
function grid_EMP_V_EMPLOYEE_EMPGRADE_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_EMPLOYEE_EMPGRADE_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4807;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4807;
	pageReqeust.isView=null;
	if(heightGadedata_4807!=null&&heightGadedata_4807!=undefined){
		pageReqeust.heightGrade = heightGadedata_4807;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function initCharts_4810(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('EMP_V_EMPLOYEE_TU2_chart'));
	var options={
			color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'柜员等级',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'柜员级别',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4810(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_EMPLOYEE_EMPLELEVEL_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4810(text.rows);
		},
	});
}
function initArrData_4810(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_EMPLEVEL';
	var formDefSql = 'SELECT  EMP_V_EMPLOYEE.EMPLEVEL AS EMPVEMPLOYEE_EMPLEVEL  FROM  EMP_V_EMPLOYEE  WHERE  EMPLEVEL IS NOT NULL  AND  EMPSTATUS=1';
	var url='/myehr/charts/searchChartsType.action?xColumnId=87948&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_EMPLEVEL==datas[j].EMPVEMPLOYEE_EMPLEVEL){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4810(xAxisData,seriesData)
		},
	});
}
    //showMoreBtn($(".BTNGROUP_4813"));
var filterParam = {};
var queryParams;
function grid_EMP_V_EMPLOYEE_EMPLELEVEL_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_EMPLOYEE_EMPLELEVEL_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4813;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4813;
	pageReqeust.isView=null;
	if(heightGadedata_4813!=null&&heightGadedata_4813!=undefined){
		pageReqeust.heightGrade = heightGadedata_4813;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
var filterParam = {};
var queryParams;
function initCharts_4805(xAxisData,seriesData){
	   document.getElementById('TJ_V_ORIGINEMP_zhutu_chart').style.width='700px';
	   document.getElementById('TJ_V_ORIGINEMP_zhutu_chart').style.height='400px';
		var myChart = echarts.init(document.getElementById('TJ_V_ORIGINEMP_zhutu_chart'));
		var options={
				//定义柱状图颜色
				color: [
		                '#5BBFE9','#FEC86B', '#dd70d9', '#34cf34',
		                '#6497ef', '#85802b', '#D7504B', '#C6E579',
		                '#F4E001', '#F0805A', '#26C0C0'
		            ],
			tooltip : {
				trigger: 'axis',
				axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
				}
			},
			barMaxWidth:30,
			toolbox: {
				show: true,
				feature: {
					dataView: {readOnly: false},
					magicType: {type: ['line', 'bar']},
					restore: {},
					saveAsImage: {}
				}
			},
			//定义一个标题
	       title:{
	           text:'籍贯分布',
	           x: 'center'
	       },grid:{
	           x:25,
	           y:45,
	           x2:5,
	           y2:70,
	           borderWidth:1
	       },
	        legend:{
	            data:['男','女'],
	            orient: 'horizontal',
	            bottom: 0
	        },
	      //X轴设置
	        xAxis:{
	            data:xAxisData,
	            axisLabel: {
	    			show: true,
	    			interval:0,
	    			inside: false,
	    			rotate: 0,
	    			margin: 4,
	    			showMinLabel: null,
	    			showMaxLabel: null,
	    			formatter:function(params){
	    			    //return value.split("").join("\n");
	    				var newParamsName = "";// 最终拼接成的字符串
	                    var paramsNameNumber = params.length;// 实际标签的个数
	                    var provideNumber = 1;// 每行能显示的字的个数
	                    var rowNumber = Math.ceil(paramsNameNumber / provideNumber);// 换行的话，需要显示几行，向上取整
	                    /**
	                     * 判断标签的个数是否大于规定的个数， 如果大于，则进行换行处理 如果不大于，即等于或小于，就返回原标签
	                     */
	                    // 条件等同于rowNumber>1
	                    if (paramsNameNumber > provideNumber) {
	                        /** 循环每一行,p表示行 */
	                        for (var p = 0; p < rowNumber; p++) {
	                            var tempStr = "";// 表示每一次截取的字符串
	                            var start = p * provideNumber;// 开始截取的位置
	                            var end = start + provideNumber;// 结束截取的位置
	                            // 此处特殊处理最后一行的索引值
	                            if (p == rowNumber - 1) {
	                                // 最后一次不换行
	                                tempStr = params.substring(start, paramsNameNumber);
	                            } else {
	                                // 每一次拼接字符串并换行
	                                tempStr = params.substring(start, end) + "\n";
	                            }
	                            newParamsName += tempStr;// 最终拼成的字符串
	                        }

	                    } else {
	                        // 将旧标签的值赋给新标签
	                        newParamsName = params;
	                    }
	                    //将最终的字符串返回
	                    return newParamsName
	    			}
	    		}
	        },
	        yAxis: [
				{
					type : 'value'
				}
			],
	        series:seriesData
	    };
	    myChart.setOption(options);
	}
	function queryAllData_4805(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_TJ_V_ORIGINEMP_LIST_fun(pageReqeust);
		$.ajax({
			url:url,
			type:'post',
			data: paramData,
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_4805(text.rows);
			},
		});
	}
	function initArrData_4805(datas){
		var xAxisData=[];
		var seriesData=[];
		var seriesData1=[];
		var seriesData2=[];
		var xAxisColumn = 'TJVORIGINEMP_ORIGIN';
		var formDefSql = 'SELECT  TJ_V_ORIGINEMP.ORIGIN AS TJVORIGINEMP_ORIGIN,TJ_V_ORIGINEMP.GENDER AS TJVORIGINEMP_GENDER   FROM  TJ_V_ORIGINEMP';
		var url='/myehr/charts/searchChartsType.action?xColumnId=87833&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
		$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				for(var i=0;i<text.length;i++){
					xAxisData.push(text[i].dictName);
					var flag1=0;
					var flag2=0;
					for(var j=0;j<datas.length;j++){
						if(text[i].TJVORIGINEMP_ORIGIN==datas[j].TJVORIGINEMP_ORIGIN&&datas[j].TJVORIGINEMP_GENDER==1){
							seriesData1.push(datas[i].TJVORIGINEMP_EMPNUM);
						}else if(text[i].TJVORIGINEMP_ORIGIN==datas[j].TJVORIGINEMP_ORIGIN&&datas[j].TJVORIGINEMP_GENDER==2){
							seriesData2.push(datas[i].TJVORIGINEMP_EMPNUM);
						}
					}
				}
				var obj1 = {name: '男',type: 'bar', stack: '性别',data: seriesData1,label:{normal:{show: true,textStyle:{color:'#000'}}}};
				var obj2 = {name: '女',type: 'bar', stack: '性别',data: seriesData2,label:{normal:{show: true,textStyle:{color:'#000'}}}};

				seriesData.push(obj1);
				seriesData.push(obj2);
				initCharts_4805(xAxisData,seriesData);
			},
		});
	}
	    //showMoreBtn($(".BTNGROUP_4804"));
	var filterParam = {};
	var queryParams;
function grid_TJ_V_ORIGINEMP_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TJ_V_ORIGINEMP_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4804;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4804;
	pageReqeust.isView=null;
	if(heightGadedata_4804!=null&&heightGadedata_4804!=undefined){
		pageReqeust.heightGrade = heightGadedata_4804;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TJ_LEAVEDATE_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TJ_LEAVEDATE_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4799;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4799;
	pageReqeust.isView=null;
	if(heightGadedata_4799!=null&&heightGadedata_4799!=undefined){
		pageReqeust.heightGrade = heightGadedata_4799;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function loadDataStart_4799(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_TJ_LEAVEDATE_LIST_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_4799(arr);
	      }
	});
}
function showDate_4799(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#F5C86B">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a onclick="jumpForm(\'4825\')"><span style="height:10%;text-align:center;display:block;font-size:40;color:#ffffff;font-weight:500;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:16;color:#ffffff;font-weight:400;">本年度离职人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#TJ_LEAVEDATE_LIST').append(cellObj);
	}
}
function showDate_5010(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#e35b5a">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=&ATTENDEMPLEAVEBLANCE_amount='+arr[i].ATTENDVEMPLEAVEBLANCE_AMOUNT+'"><span style="height:10%;text-align:center;display:block;font-size:35;color:#ffffff;font-weight:400;">'+arr[i].ATTENDVEMPLEAVEBLANCE_AMOUNT+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:20;color:#ffffff;font-weight:400;">本年度年假剩余天数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#ZM_ATTEND_EMPLEAVEBLANCE').append(cellObj);
	}
}
function grid_TJ_NEWJOIN_LIST_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
	pageReqeust.containerParam=containerParam_4797;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4797;
	pageReqeust.isView=null;
	if(heightGadedata_4797!=null&&heightGadedata_4797!=undefined){
		pageReqeust.heightGrade = heightGadedata_4797;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}


var filterParam = {};
var queryParams;
function grid_ZM_ATT_LEAVE_HIS_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
	pageReqeust.containerParam=containerParam_5011;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_5011;
	pageReqeust.isView=null;
	if(heightGadedata_5011!=null&&heightGadedata_5011!=undefined){
		pageReqeust.heightGrade = heightGadedata_5011;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function loadDataStart_5011(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_ZM_ATT_LEAVE_HIS_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_5011(arr);
	      }
	});
}


function loadDataStart_4797(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_TJ_NEWJOIN_LIST_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_4797(arr);
	      }
	});
}
function showDate_4797(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#5BBFE9">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a onclick="jumpForm(\'4824\')"><span style="height:10%;text-align:center;display:block;font-size:40;color:#ffffff;font-weight:500;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:16;color:#ffffff;font-weight:400;">本年度新入职人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#TJ_NEWJOIN_LIST').append(cellObj);
	}
}

function showDate_5011(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=&EMPVATTEN_ISUM='+arr[i].EMPVATTEN_ISUM+'"><span style="height:10%;text-align:center;display:block;font-size:35;color:#ffffff;font-weight:400;">'+arr[i].EMPVATTEN_ISUM+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:20;color:#ffffff;font-weight:400;">本年度请假天数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#ZM_ATT_LEAVE_HIS').append(cellObj);
	}
}
function loadDataStart_4795(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_TJ_COUNTEMP_LIST_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_4795(arr);
	      }
	});
}
function loadDataStart_4796(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_TJ_V_EMPDEPCOUNT_LIST_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_4796(arr);
	      }
	});
}
function showDate_4796(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#F88F87">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><span style="height:10%;text-align:center;display:block;font-size:40;color:#ffffff;font-weight:500;">'+arr[i].TJVEMPDEPCOUNT_COUN+'</span></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:16;color:#ffffff;font-weight:400;">总行部门人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#TJ_V_EMPDEPCOUNT_LIST').append(cellObj);
	}
}




function grid_TJ_V_EMPDEPCOUNT_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TJ_V_EMPDEPCOUNT_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4796;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4796;
	pageReqeust.isView=null;
	if(heightGadedata_4796!=null&&heightGadedata_4796!=undefined){
		pageReqeust.heightGrade = heightGadedata_4796;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_TJ_COUNTEMP_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TJ_COUNTEMP_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4795;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4795;
	pageReqeust.isView=null;
	if(heightGadedata_4795!=null&&heightGadedata_4795!=undefined){
		pageReqeust.heightGrade = heightGadedata_4795;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_ZM_ATT_ATTEND_OVERTIME_HIS_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
	pageReqeust.containerParam=containerParam_5017;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_5017;
	pageReqeust.isView=null;
	if(heightGadedata_5017!=null&&heightGadedata_5017!=undefined){
		pageReqeust.heightGrade = heightGadedata_5017;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function loadDataStart_5017(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_ZM_ATT_ATTEND_OVERTIME_HIS_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_5017(arr);
	      }
	});
}

function showDate_5017(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#8775a7">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=&EMPVOVERTIME_VALUESQ='+arr[i].EMPVOVERTIME_VALUESQ+'"><span style="height:10%;text-align:center;display:block;font-size:35;color:#ffffff;font-weight:400;">'+arr[i].EMPVOVERTIME_VALUESQ+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:20;color:#ffffff;font-weight:400;">本年度加班天数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	    $('#ZM_ATT_ATTEND_OVERTIME_HIS').append(cellObj);
	}
}
function showDate_4795(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#95EDD5">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><span style="height:10%;text-align:center;display:block;font-size:40;color:#ffffff;font-weight:500;">'+arr[i].TJVEMPCOUNT_COUN+'</span></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:16;color:#ffffff;font-weight:400;">分支行人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	    $('#TJ_COUNTEMP_LIST').append(cellObj);
	}
}
function grid_EMP_V_EMPBASIC_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_EMPBASIC_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if(''==''&&'session'=='parameter'){
		if(USERID==undefined){
			requestParam = {USERID:''};
		}else{
			requestParam = {};
		}
	}else{
		requestParam = {USERID:'1'};
	}
	pageReqeust.containerParam=containerParam_4794;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4794;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage_4794*pagesize_4794;
	pageReqeust.limit=pagesize_4794;
	if(heightGadedata_4794!=null&&heightGadedata_4794!=undefined){
		pageReqeust.heightGrade = heightGadedata_4794;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function initCharts_4769(xAxisData,seriesData){
	   document.getElementById('comp_sds_chart').style.width='700px';
	   document.getElementById('comp_sds_chart').style.height='400px';
		var myChart = echarts.init(document.getElementById('comp_sds_chart'));
		var options={
			//定义柱状图颜色
			color: [
	                '#5BBFE9','#FEC86B', '#dd70d9', '#34cf34',
	                '#6497ef', '#85802b', '#D7504B', '#C6E579',
	                '#F4E001', '#F0805A', '#26C0C0'
	            ],
	        barMaxWidth:30,
			tooltip : {
				trigger: 'axis',
				axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
				}
			},
			toolbox: {
				show: true,
				feature: {
					dataView: {readOnly: false},
					magicType: {type: ['line', 'bar']},
					restore: {},
					saveAsImage: {}
				}
			},
			//定义一个标题
	       title:{
	           text:'分支行人员分布',
	           x: 'center'
	       },grid:{
	           x:25,
	           y:45,
	           x2:5,
	           y2:70,
	           borderWidth:1
	       },
	        legend:{
	            data:['男','女'],
	            orient: 'horizontal',
	            bottom: 0
	        },
	        //X轴设置
	        xAxis:{
	            data:xAxisData,
	            axisLabel: {
	    			show: true,
	    			interval:0,
	    			inside: false,
	    			rotate: 0,
	    			margin: 4,
	    			showMinLabel: null,
	    			showMaxLabel: null,
	    			formatter:function(params){
	    			    //return value.split("").join("\n");
	    				var newParamsName = "";// 最终拼接成的字符串
	                    var paramsNameNumber = params.length;// 实际标签的个数
	                    var provideNumber = 1;// 每行能显示的字的个数
	                    var rowNumber = Math.ceil(paramsNameNumber / provideNumber);// 换行的话，需要显示几行，向上取整
	                    /**
	                     * 判断标签的个数是否大于规定的个数， 如果大于，则进行换行处理 如果不大于，即等于或小于，就返回原标签
	                     */
	                    // 条件等同于rowNumber>1
	                    if (paramsNameNumber > provideNumber) {
	                        /** 循环每一行,p表示行 */
	                        for (var p = 0; p < rowNumber; p++) {
	                            var tempStr = "";// 表示每一次截取的字符串
	                            var start = p * provideNumber;// 开始截取的位置
	                            var end = start + provideNumber;// 结束截取的位置
	                            // 此处特殊处理最后一行的索引值
	                            if (p == rowNumber - 1) {
	                                // 最后一次不换行
	                                tempStr = params.substring(start, paramsNameNumber);
	                            } else {
	                                // 每一次拼接字符串并换行
	                                tempStr = params.substring(start, end) + "\n";
	                            }
	                            newParamsName += tempStr;// 最终拼成的字符串
	                        }

	                    } else {
	                        // 将旧标签的值赋给新标签
	                        newParamsName = params;
	                    }
	                    //将最终的字符串返回
	                    return newParamsName
	    			}
	    		}
	        },
	        yAxis: [
				{
					type : 'value'
				}
			],
	        series:seriesData
	    };
	    myChart.setOption(options);
	}
	function queryAllData_4769(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_comp_COM_LIST_fun(pageReqeust);
		$.ajax({
			url:url,
			type:'post',
			data: paramData,
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_4769(text.rows);
			},
		});
	}
	function initArrData_4769(datas){
		var xAxisData=[];
		var seriesData=[];
		var seriesData1=[];
		var seriesData2=[];
		var xAxisColumn = 'TJVORGVORGANIZ_cname';
		var formDefSql = 'select   TJ_V_ORGVORGANIZ.cname AS TJVORGVORGANIZ_cname,TJ_V_ORGVORGANIZ.GENDER AS TJVORGVORGANIZ_GENDER   from   TJ_V_ORGVORGANIZ';
		var url='/myehr/charts/searchChartsType.action?xColumnId=87344&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
		$.ajax({
			url:url,
			type:'post',
			cache: false,
			success: function (text) {
				for(var i=0;i<text.length;i++){
					xAxisData.push(text[i].dictName);
					var flag1=0;
					var flag2=0;
					for(var j=0;j<datas.length;j++){
						if(text[i].TJVORGVORGANIZ_cname==datas[j].TJVORGVORGANIZ_CNAME&&datas[j].TJVORGVORGANIZ_GENDER==1){
							seriesData1.push(datas[j].TJVORGVORGANIZ_EMPNUM);
						}else if(text[i].TJVORGVORGANIZ_cname==datas[j].TJVORGVORGANIZ_CNAME&&datas[j].TJVORGVORGANIZ_GENDER==2){
							seriesData2.push(datas[j].TJVORGVORGANIZ_EMPNUM);
						}
					}
				}
				var obj1 = {name: '男',type: 'bar', stack: '性别',data: seriesData1,label:{normal:{show: true,textStyle:{color:'#000'}}}};
				var obj2 = {name: '女',type: 'bar', stack: '性别',data: seriesData2,label:{normal:{show: true,textStyle:{color:'#000'}}}};

				seriesData.push(obj1);
				seriesData.push(obj2);
				initCharts_4769(xAxisData,seriesData);
				
			},
		});
	}
	
var filterParam = {};
var queryParams;
function grid_comp_COM_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_comp_COM_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4767;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4767;
	pageReqeust.isView=null;
	if(heightGadedata_4767!=null&&heightGadedata_4767!=undefined){
		pageReqeust.heightGrade = heightGadedata_4767;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}


function initCharts_4762(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('EMP_V_WORKYEARS_TU_chart'));
	var options={
		color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'全行工龄分析',
			x: 'center'
       },
       legend:{
    	   orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'工龄分析',
               type:'pie',
               radius : size,
               center: [x,y],
               hoverAnimation:false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4762(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_WORKYEARS_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async:false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4762(text.rows);
		},
	});
}
function initArrData_4762(datas){
	var xAxisData=[];
	var seriesData=[];
	for(var j=0;j<datas.length;j++){
			var obj={};
			obj.value = datas[j].EMPVWORKYEARS_EMPNUM ;
			obj.name = datas[j].EMPVWORKYEARS_AA;
			xAxisData.push(datas[j].EMPVWORKYEARS_AA);
			seriesData.push(obj);
	}
	initCharts_4762(xAxisData,seriesData);
}
    //showMoreBtn($(".BTNGROUP_4761"));
var filterParam = {};
var queryParams;
function grid_EMP_V_WORKYEARS_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_WORKYEARS_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4761;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4761;
	pageReqeust.isView=null;
	if(heightGadedata_4761!=null&&heightGadedata_4761!=undefined){
		pageReqeust.heightGrade = heightGadedata_4761;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function initCharts_4773(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('YEAROLDS_BI_chart'));
	var options={
			color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'全行年龄结构图',
			x: 'center'
       },
       legend:{
    	   orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'年龄分段',
               type:'pie',
               radius : size,
               center: [x,y],
               hoverAnimation:false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4773(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_YEAROLDS_list_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4773(text.rows);
		},
	});
}
function initArrData_4773(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVYEAROLDS_TT';
	var formDefSql = 'SELECT   EMP_V_YEAROLDS.EMPID AS EMPVYEAROLDS_EMPID,EMP_V_YEAROLDS.TT AS EMPVYEAROLDS_TT   FROM   EMP_V_YEAROLDS';
	var url='/myehr/charts/searchChartsType.action?xColumnId=87350&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVYEAROLDS_TT==datas[j].EMPVYEAROLDS_TT){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4773(xAxisData,seriesData)
		},
	});
}
    //showMoreBtn($(".BTNGROUP_4771"));
var filterParam = {};
var queryParams;
function grid_EMP_V_YEAROLDS_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_YEAROLDS_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4771;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4771;
	pageReqeust.isView=null;
	if(heightGadedata_4771!=null&&heightGadedata_4771!=undefined){
		pageReqeust.heightGrade = heightGadedata_4771;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function initCharts_4774(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('EMP_POLITICALSTATUS_TU_chart'));
	var options={
			color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'全行政治面貌',
			x: 'center'
       },
       legend:{
    	   orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'政治面貌',
               type:'pie',
               radius : size,
               center: [x,y],
               hoverAnimation:false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4774(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_EMPJOBTYPE_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4774(text.rows);
		},
	});
}
function initArrData_4774(datas){
	var xAxisData=[];
	var seriesData=[];
	for(var j=0;j<datas.length;j++){
		if(datas[j].EMPVEMPJOBTYPE_CLASS=='POLITICALSTATUS'){
			var obj={};
			obj.value = datas[j].EMPVEMPJOBTYPE_EMPNUM ;
			obj.name = datas[j].EMPVEMPJOBTYPE_CNAME;
			xAxisData.push(datas[j].EMPVEMPJOBTYPE_CNAME);
			seriesData.push(obj);
		}
	}
	initCharts_4774(xAxisData,seriesData);
}
    //showMoreBtn($(".BTNGROUP_4763"));
var filterParam = {};
var queryParams;
function grid_EMP_V_EMPJOBTYPE_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_EMPJOBTYPE_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4763;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4763;
	pageReqeust.isView=null;
	if(heightGadedata_4763!=null&&heightGadedata_4763!=undefined){
		pageReqeust.heightGrade = heightGadedata_4763;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function loadDataStart_5010(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_ZM_ATTEND_EMPLEAVEBLANCE_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        console.log(data);
	        var arr=data.rows;
	        main_Datas=data.rows;
	        showDate_5010(arr);
	      }
	});
}
function grid_ZM_ATTEND_EMPLEAVEBLANCE_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
	pageReqeust.containerParam=containerParam_5010;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_5010;
	pageReqeust.isView=null;
	if(heightGadedata_5010!=null&&heightGadedata_5010!=undefined){
		pageReqeust.heightGrade = heightGadedata_5010;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function initCharts_4766(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('TJ_V_JOBORDER_TU_chart'));
	var options={
			color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'人员序列分布',
			x: 'center'
       },
       legend:{
    	   orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'序列',
               type:'pie',
               radius : size,
               center: [x,y],
               hoverAnimation:false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4766(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_TJ_V_JOBORDER_list_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4766(text.rows);
		},
	});
}
function initArrData_4766(datas){
	var xAxisData=[];
	var seriesData=[];
	for(var j=0;j<datas.length;j++){
		if(datas[j].TJVJOBORDER_CLASS=='JOBORDER'){
			var obj={};
			obj.value = datas[j].TJVJOBORDER_EMPNUM ;
			obj.name = datas[j].TJVJOBORDER_CNAME;
			xAxisData.push(datas[j].TJVJOBORDER_CNAME);
			seriesData.push(obj);
		}
	}
	initCharts_4766(xAxisData,seriesData);
}
    //showMoreBtn($(".BTNGROUP_4765"));
var filterParam = {};
var queryParams;
function grid_TJ_V_JOBORDER_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TJ_V_JOBORDER_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4765;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4765;
	pageReqeust.isView=null;
	if(heightGadedata_4765!=null&&heightGadedata_4765!=undefined){
		pageReqeust.heightGrade = heightGadedata_4765;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function initCharts_4768(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('TJ_V_JOBORDER_XUETU_chart'));
	var options={
			color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'全行员工学历统计',
			x: 'center'
       },
       legend:{
    	   orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'学历',
               type:'pie',
               radius : size,
               center: [x,y],
               hoverAnimation:false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4768(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_TJ_V_JOBORDER_list_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4768(text.rows);
		},
	});
}
function initArrData_4768(datas){
	var xAxisData=[];
	var seriesData=[];
	for(var j=0;j<datas.length;j++){
		if(datas[j].TJVJOBORDER_CLASS=='MAXEDUCATION'){
			var obj={};
			obj.value = datas[j].TJVJOBORDER_EMPNUM ;
			obj.name = datas[j].TJVJOBORDER_CNAME;
			xAxisData.push(datas[j].TJVJOBORDER_CNAME);
			seriesData.push(obj);
		}
	}
	initCharts_4768(xAxisData,seriesData);
}
    //showMoreBtn($(".BTNGROUP_4765"));
var filterParam = {};
var queryParams;
function grid_TJ_V_JOBORDER_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TJ_V_JOBORDER_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4765;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4765;
	pageReqeust.isView=null;
	if(heightGadedata_4765!=null&&heightGadedata_4765!=undefined){
		pageReqeust.heightGrade = heightGadedata_4765;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function initCharts_4770(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('TJ_V_JOBORDER_sex_chart'));
	var options={
			color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'全行人员性别分布',
			x: 'center'
       },
       legend:{
    	   orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'性别',
               type:'pie',
               radius : size,
               center: [x,y],
               hoverAnimation:false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4770(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_TJ_V_JOBORDER_list_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4770(text.rows);
		},
	});
}
function initArrData_4770(datas){
	var xAxisData=[];
	var seriesData=[];
	for(var j=0;j<datas.length;j++){
		if(datas[j].TJVJOBORDER_CLASS=='GENDER'){
			var obj={};
			obj.value = datas[j].TJVJOBORDER_EMPNUM ;
			obj.name = datas[j].TJVJOBORDER_CNAME;
			xAxisData.push(datas[j].TJVJOBORDER_CNAME);
			seriesData.push(obj);
		}
	}
	initCharts_4770(xAxisData,seriesData);
}
    //showMoreBtn($(".BTNGROUP_4765"));
var filterParam = {};
var queryParams;
function grid_TJ_V_JOBORDER_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TJ_V_JOBORDER_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4765;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4765;
	pageReqeust.isView=null;
	if(heightGadedata_4765!=null&&heightGadedata_4765!=undefined){
		pageReqeust.heightGrade = heightGadedata_4765;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function initCharts_4772(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('TJ_V_JOBORDER_TITLETA_chart'));
	var options={
			color: ['#5BBFE9','#FEC86B','#95EDD5','#F88F87','#63D7A3','#FF94D3'],
		tooltip : {
			trigger: 'item',
			formatter : "{a} <br/>{b}: {c} ({d}%)"
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'全行职称分布',
			x: 'center'
       },
       legend:{
    	   orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'职称级别',
               type:'pie',
               radius : size,
               center: [x,y],
               hoverAnimation:false,
               label: {
                   normal: {
                       show: true,
                       formatter: '{b}: {c}({d}%)'
                   }
               },
               labelLine: {
                   normal: {
                       show: true,
                       length:10,
                       length2:15
                   }
               },
               data:seriesData
           }
       ]
    };
    myChart.setOption(options);
}
function queryAllData_4772(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_TJ_V_JOBORDER_list_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4772(text.rows);
		},
	});
}
function initArrData_4772(datas){
	var xAxisData=[];
	var seriesData=[];
	for(var j=0;j<datas.length;j++){
		if(datas[j].TJVJOBORDER_CLASS=='TITLELEVEL'){
			var obj={};
			obj.value = datas[j].TJVJOBORDER_EMPNUM ;
			obj.name = datas[j].TJVJOBORDER_CNAME;
			xAxisData.push(datas[j].TJVJOBORDER_CNAME);
			seriesData.push(obj);
		}
	}
	initCharts_4772(xAxisData,seriesData);
}
    //showMoreBtn($(".BTNGROUP_4765"));
var filterParam = {};
var queryParams;
function grid_TJ_V_JOBORDER_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_TJ_V_JOBORDER_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4765;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4765;
	pageReqeust.isView=null;
	if(heightGadedata_4765!=null&&heightGadedata_4765!=undefined){
		pageReqeust.heightGrade = heightGadedata_4765;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

function linkage(){
	//部门
	var DEPID = $('[id="DEPID"]').val();
	if(DEPID!=null&&DEPID!=""){
		var sql = "select jobid  as DICTVALUE,cnname as DICTENTRY from ORG_JOB WHERE DEPID in ("+DEPID+") ";
		//加载子下拉之前,清空子下拉
		$('[id="JOBID"]').html("");
		var id = 'JOBID';
		myehr_initSelect_sql(id,sql);
	}
}