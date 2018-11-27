	//formId
	var _formId_3999='3999';
	var _formId_4003='4003';
	var _formId_4017='4017';
	var _formId_4012='4012';
	var _formId_4762='4762';
	var _formId_4765='4765';
	var _formId_4770='4770';
	var _formId_4773='4773';
	
	//数据显示参数
	var Currentpage_3999 = 0;
	var pagesize_3999 = 1;
	var Currentpage_4003 = 0;
	var pagesize_4003 = 1;
	var Currentpage_4017 = 0;
	var pagesize_4017 = 1;
	var Currentpage_4012 = 0;
	var pagesize_4012 = 1;
	//通用参数
	var xx = {};
	//数据集
	var main_Datas_3999 = [];
	var main_Datas_4003 = [];
	var main_Datas_4017 = [];
	var main_Datas_4012 = [];
	//过滤条件
	function grid_WARNING_CONCOUNT_fun(pageReqeust){
		var _filterdata={};
		if(document.getElementById('grid_WARNING_CONCOUNT_filter')){
		}
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam={};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_3999;
		pageReqeust.isView=null;
		pageReqeust.offset=Currentpage_3999*pagesize_3999;
		pageReqeust.limit=pagesize_3999;
		var queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
	function grid_WARNING_BRITHDAY_CARD_fun(pageReqeust){
		var _filterdata={};
		if(document.getElementById('grid_WARNING_BRITHDAY_CARD_filter')){
		}
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam={};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_4003;
		pageReqeust.isView=null;
		pageReqeust.offset=Currentpage_4003*pagesize_4003;
		pageReqeust.limit=pagesize_4003;
		var queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
	function grid_WARNING_PRO_CARD_fun(pageReqeust){
		var _filterdata={};
		if(document.getElementById('grid_WARNING_PRO_CARD_filter')){
		}
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam={};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_4017;
		pageReqeust.isView=null;
		pageReqeust.offset=Currentpage_4017*pagesize_4017;
		pageReqeust.limit=pagesize_4017;
		queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
	function grid_AWRNING_RETIE_CARD_fun(pageReqeust){
		var _filterdata={};
		if(document.getElementById('grid_AWRNING_RETIE_CARD_filter')){
		}
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam={};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_4012;
		pageReqeust.isView=null;
		pageReqeust.offset=Currentpage_4012*pagesize_4012;
		pageReqeust.limit=pagesize_4012;
		queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
	function grid_EMP_V_WORKYEARS_LIST_fun(pageReqeust){
		var _filterdata={};
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam={};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_4762;
		pageReqeust.isView=null;
		queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
	function grid_EMP_V_COMPYEARS_LIST_fun(pageReqeust){
		var _filterdata={};
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam={};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_4765;
		pageReqeust.isView=null;
		queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
	function grid_EMP_V_YEAROLDSTJ_LIST_fun(pageReqeust){
		var _filterdata={};
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam={};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_4770;
		pageReqeust.isView=null;
		queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
	function grid_TJ_V_JOBORDER_LIST_fun(pageReqeust){
		var _filterdata={};
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam={};
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_4773;
		pageReqeust.isView=null;
		queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
	//数据获取
	function loadDataStart_3999(){
		$.ajax({
		    url: "/myehr/form/cardformInitData.action",
		    type: 'post',
		    data:grid_WARNING_CONCOUNT_fun(xx),//HTTP请求类型
		    contentType: 'application/json;charset=utf-8',
		    cache: false,
		    async: false,
		    success: function (data) {
		        main_Datas_3999=data.rows;
		        showDate_3999(main_Datas_3999);
		      }
		});
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
		        main_Datas_4003=data.rows;
		        showDate_4003(main_Datas_4003);
		      }
		});
	}
	function loadDataStart_4017(){
		$.ajax({
		    url: "/myehr/form/cardformInitData.action",
		    type: 'post',
		    data:grid_WARNING_PRO_CARD_fun(xx),//HTTP请求类型
		    contentType: 'application/json;charset=utf-8',
		    cache: false,
		    async: false,
		    success: function (data) {
		        main_Datas_4017=data.rows;
		        showDate_4017(main_Datas_4017);
		      }
		});
	}
	function loadDataStart_4012(){
		$.ajax({
		    url: "/myehr/form/cardformInitData.action",
		    type: 'post',
		    data:grid_AWRNING_RETIE_CARD_fun(xx),//HTTP请求类型
		    contentType: 'application/json;charset=utf-8',
		    cache: false,
		    async: false,
		    success: function (data) {
		        main_Datas_4012=data.rows;
		        showDate_4012(main_Datas_4012);
		      }
		});
	}
	function queryAllData_4769(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_EMP_V_WORKYEARS_LIST_fun(pageReqeust);
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
	function queryAllData_4766(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_EMP_V_COMPYEARS_LIST_fun(pageReqeust);
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
	function queryAllData_4771(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_EMP_V_YEAROLDSTJ_LIST_fun(pageReqeust);
		$.ajax({
			url:url,
			type:'post',
			data: paramData,
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_4771(text.rows);
			},
		});
	}
	function queryAllData_4775(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_TJ_V_JOBORDER_LIST_fun(pageReqeust);
		$.ajax({
			url:url,
			type:'post',
			data: paramData,
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_4775(text.rows);
			},
		});
	}
	function queryAllData_4779(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_TJ_V_JOBORDER_LIST_fun(pageReqeust);
		$.ajax({
			url:url,
			type:'post',
			data: paramData,
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_4779(text.rows);
			},
		});
	}
	function queryAllData_4777(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_TJ_V_JOBORDER_LIST_fun(pageReqeust);
		$.ajax({
			url:url,
			type:'post',
			data: paramData,
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_4777(text.rows);
			},
		});
	}
	//页面加载
	function showDate_3999(arr) {
		for (var i = arr.length - 1; i >= 0; i--) {
			
			var width = '0';
			if(arr[i].VIR_CONTRACTOVER!=undefined){
				width = parseInt(parseInt(arr[i].VIR_CONTRACTOVER)*100/200);
			}
		    var cellObj = $('<div class="col-md-12">'+
							'	<div class="d-flex no-block align-items-center">'+
							'		<div>'+
							'			<i class="iconfont icon-qingjia"></i>'+
							'			<p class="font-16 m-b-5">合同到期人数</p>'+
							'		</div>'+
							'		<div class="ml-auto">'+
							'			<h1 class="font-light text-right">'+arr[i].VIR_CONTRACTOVER+'</h1>'+
							'		</div>'+
							'	</div>'+
							'</div>'+
							'<div class="col-12">'+
							'	<div class="progress">'+
							'		<div class="progress-bar bg-info" role="progressbar" style="width:'+width+'%; height: 6px;" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100"></div>'+
							'	</div>'+
							'</div>');
		    $('.gridcard_3999').append(cellObj);
		}
	}
	function showDate_4003(arr) {
		for (var i = arr.length - 1; i >= 0; i--) {
			var width = '0';
			if(arr[i].VIR_PERNUM!=undefined){
				width = parseInt(parseInt(arr[i].VIR_PERNUM)*100/200);
			}
		    var cellObj = $('<div class="col-md-12">'+
					'	<div class="d-flex no-block align-items-center">'+
					'		<div>'+
					'			<i class="iconfont icon-qingjia"></i>'+
					'			<p class="font-16 m-b-5">下个月生日人数</p>'+
					'		</div>'+
					'		<div class="ml-auto">'+
					'			<h1 class="font-light text-right">'+arr[i].VIR_PERNUM+'</h1>'+
					'		</div>'+
					'	</div>'+
					'</div>'+
					'<div class="col-12">'+
					'	<div class="progress">'+
					'		<div class="progress-bar bg-info" role="progressbar" style="width:'+width+'%; height: 6px;" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>'+
					'	</div>'+
					'</div>');
		    $('.gridcard_4003').append(cellObj);
		}
	}
	function showDate_4017(arr) {
		for (var i = arr.length - 1; i >= 0; i--) {
			var width = '0';
			if(arr[i].VIR_PRO!=undefined){
				width = parseInt(parseInt(arr[i].VIR_PRO)*100/200);
			}
		    var cellObj = $('<div class="col-md-12">'+
							'	<div class="d-flex no-block align-items-center">'+
							'		<div>'+
							'			<i class="iconfont icon-qingjia"></i>'+
							'			<p class="font-16 m-b-5">试用期到期提醒人数</p>'+
							'		</div>'+
							'		<div class="ml-auto">'+
							'			<h1 class="font-light text-right">'+arr[i].VIR_PRO+'</h1>'+
							'		</div>'+
							'	</div>'+
							'</div>'+
							'<div class="col-12">'+
							'	<div class="progress">'+
							'		<div class="progress-bar bg-info" role="progressbar" style="width:'+width+'%; height: 6px;" aria-valuenow="35" aria-valuemin="0" aria-valuemax="100"></div>'+
							'	</div>'+
							'</div>');
		    $('.gridcard_4017').append(cellObj);
		}
	}
	function showDate_4012(arr) {
		for (var i = arr.length - 1; i >= 0; i--) {
		    var width = '0';
			if(arr[i].VIR_RETIRE!=undefined){
				width = parseInt(parseInt(arr[i].VIR_RETIRE)*100/200);
			}
		    var cellObj = $('<div class="col-md-12">'+
							'	<div class="d-flex no-block align-items-center">'+
							'		<div>'+
							'			<i class="iconfont icon-qingjia"></i>'+
							'			<p class="font-16 m-b-5">退休提醒人数</p>'+
							'		</div>'+
							'		<div class="ml-auto">'+
							'			<h1 class="font-light text-right">'+arr[i].VIR_RETIRE+'</h1>'+
							'		</div>'+
							'	</div>'+
							'</div>'+
							'<div class="col-12">'+
							'	<div class="progress">'+
							'		<div class="progress-bar bg-info" role="progressbar" style="width:'+width+'%; height: 6px;" aria-valuenow="35" aria-valuemin="0" aria-valuemax="100"></div>'+
							'	</div>'+
							'</div>');
		    $('.gridcard_4012').append(cellObj);
		}
	}
	//图表数据处理
	function initArrData_4769(datas){
		var xAxisData=[];
		var seriesData=[];
		for(var j=0;j<datas.length;j++){
			var obj={};
			obj.value = datas[j].EMPVWORKYEARS_EMPNUM ;
			obj.name = datas[j].EMPVWORKYEARS_AA;
			xAxisData.push(datas[j].EMPVWORKYEARS_AA);
			seriesData.push(obj);
		}
		initCharts_4769(xAxisData,seriesData);
	}
	function initArrData_4766(datas){
		var xAxisData=[];
		var seriesData=[];
		for(var j=0;j<datas.length;j++){
			var obj={};
			obj.value = datas[j].EMPVCOMPYEARS_EMPNUM ;
			obj.name = datas[j].EMPVCOMPYEARS_AA;
			xAxisData.push(datas[j].EMPVCOMPYEARS_AA);
			seriesData.push(obj);
		}
		initCharts_4766(xAxisData,seriesData);
	}
	function initArrData_4771(datas){
		var xAxisData=[];
		var seriesData=[];
		for(var j=0;j<datas.length;j++){
			var obj={};
			obj.value = datas[j].EMPVYEAROLDSTJ_EMPNUM ;
			obj.name = datas[j].EMPVYEAROLDSTJ_TT;
			xAxisData.push(datas[j].EMPVYEAROLDSTJ_TT);
			seriesData.push(obj);
		}
		initCharts_4771(xAxisData,seriesData);
	}
	function initArrData_4775(datas){
		var xAxisData=[];
		var seriesData=[];
		for(var j=0;j<datas.length;j++){
			var obj={};
			if(datas[j].TJVJOBORDER_CLASS=='MAXEDUCATION'){
				obj.value = datas[j].TJVJOBORDER_EMPNUM ;
				obj.name = datas[j].TJVJOBORDER_CNAME;
				xAxisData.push(datas[j].TJVJOBORDER_CNAME);
				seriesData.push(obj);
			}
		}
		initCharts_4775(xAxisData,seriesData);
	}
	function initArrData_4779(datas){
		var xAxisData=[];
		var seriesData=[];
		for(var j=0;j<datas.length;j++){
			var obj={};
			if(datas[j].TJVJOBORDER_CLASS=='WORKCITY'){
				obj.value = datas[j].TJVJOBORDER_EMPNUM ;
				obj.name = datas[j].TJVJOBORDER_CNAME;
				xAxisData.push(datas[j].TJVJOBORDER_CNAME);
				seriesData.push(obj);
			}
		}
		initCharts_4779(xAxisData,seriesData);
	}
	function initArrData_4777(datas){
		var xAxisData=[];
		var seriesData=[];
		for(var j=0;j<datas.length;j++){
			var obj={};
			if(datas[j].TJVJOBORDER_CLASS=='schooltype'){
				obj.value = datas[j].TJVJOBORDER_EMPNUM ;
				obj.name = datas[j].TJVJOBORDER_CNAME;
				xAxisData.push(datas[j].TJVJOBORDER_CNAME);
				seriesData.push(obj);
			}
		}
		initCharts_4777(xAxisData,seriesData);
	}
	//图表生成
	function initCharts_4769(xAxisData,seriesData){
		var x = '50%';//页面左右
		var y = '50%';//页面上下
		var size = ['25%','45%'];//图形大小
		var titleType = 'horizontal';
		var titlePosition = 50;
		var myChart = echarts.init(document.getElementById('EMP_V_WORKYEARS_SUB_chart'));
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
			
	       legend:{
	           orient: titleType,
	           bottom: titlePosition,
	           data:xAxisData
	       },
	       series:[
	           {
	               name:'人数',
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
	function initCharts_4766(xAxisData,seriesData){
		var x = '50%';//页面左右
		var y = '50%';//页面上下
		var size = ['25%','45%'];//图形大小
		var titleType = 'horizontal';
		var titlePosition = 50;
		var myChart = echarts.init(document.getElementById('EMP_V_COMPYEARS_SUB_chart'));
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
	       legend:{
	           orient: titleType,
	           bottom: titlePosition,
	           data:xAxisData
	       },
	       series:[
	           {
	               name:'人数',
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
	function initCharts_4771(xAxisData,seriesData){
		var x = '50%';//页面左右
		var y = '50%';//页面上下
		var size = ['25%','45%'];//图形大小
		var titleType = 'horizontal';
		var titlePosition = 50;
		var myChart = echarts.init(document.getElementById('EMP_V_YEAROLDSTJ_SUB_chart'));
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
				
		       legend:{
		           orient: titleType,
		           bottom: titlePosition,
		           data:xAxisData
		       },
		       series:[
			           {
			               name:'人数',
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
	function initCharts_4775(xAxisData,seriesData){
		var x = '50%';//页面左右
		var y = '50%';//页面上下
		var size = ['25%','45%'];//图形大小
		var titleType = 'horizontal';
		var titlePosition = 50;
		var myChart = echarts.init(document.getElementById('TJ_V_JOBORDER_EDU_chart'));
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
				
		       legend:{
		           orient: titleType,
		           bottom: titlePosition,
		           data:xAxisData
		       },
		       series:[
			           {
			               name:'人数',
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
	function initCharts_4779(xAxisData,seriesData){
		var x = '50%';//页面左右
		var y = '50%';//页面上下
		var size = ['25%','45%'];//图形大小
		var titleType = 'horizontal';
		var titlePosition = 50;
		var myChart = echarts.init(document.getElementById('TJ_V_JOBORDER_CITY_chart'));
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
				
		       legend:{
		           orient: titleType,
		           bottom: titlePosition,
		           data:xAxisData
		       },
		       series:[
			           {
			               name:'人数',
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
	function initCharts_4777(xAxisData,seriesData){
		var x = '50%';//页面左右
		var y = '50%';//页面上下
		var size = ['25%','45%'];//图形大小
		var titleType = 'horizontal';
		var titlePosition = 50;
		var myChart = echarts.init(document.getElementById('TJ_V_JOBORDER_SHOOL_chart'));
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
				
		       legend:{
		           orient: titleType,
		           bottom: titlePosition,
		           data:xAxisData
		       },
		       series:[
			           {
			               name:'人数',
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