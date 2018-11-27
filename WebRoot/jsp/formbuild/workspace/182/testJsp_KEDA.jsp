<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%
	HttpSession s = request.getSession();
	String userName=(String)session.getAttribute("userName");
	String userCode=(String)session.getAttribute("userCode");
	String softwareTitle=(String)session.getAttribute("softwareTitle");
	String empid=session.getAttribute("empid")+"";
	String userId=session.getAttribute("userid")+"";
%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style type="text/css">
	.searchLabel{
		float:left;
		width:70px;
		line-height:31px;
	}
	.searchSelect{
		width:150px !important;
		border:1px solid #e9ecef;
	}
	.searchSelect .dropdown-toggle{
		background-color:#fff;
	}
	.searchSelect .actions-btn{
		margin:0 3px;
	}
	.searchSelect .pull-left{
		color:#4F5467;
	}
	
	.searchClass{
		margin:5px 0;
	}
	.searchPersons{
		padding:0 20px;
		height:300px;
	}
	.overflowyAuto{
		overflow:hidden;
	}
	.weatherSelect{
		border:none;
		-webkit-appearance:none;
	}
	.secondCard{
		min-height:730px;
	}
	.personInfo{
		padding:0 0 50px 0 !important;
		position:relative;
		margin-bottom:20px;
		flex:none !important;
	}
	.personBackPic{
		border-bottom: 3px solid #5cc0ff;
		width:100%;
	}
	.personBackPic img{
		width:100%;
	}
	.goodSay{
		position: absolute;
		top: 0;
		background-color: rgba(0, 0, 0, 0.6);
		width: 100%;
		height: 100%;
		padding: 1.2em 1em 0 1em;
		color: white;
		text-align: center;
		opacity: 0;
		-webkit-transition-property: all;
		-moz-transition-property: all;
		-o-transition-property: all;
		transition-property: all;
		-webkit-transition-duration: 0.3s;
		-moz-transition-duration: 0.3s;
		-o-transition-duration: 0.3s;
		transition-duration: 0.3s;
		-webkit-transition-timing-function: ease-in;
		-moz-transition-timing-function: ease-in;
		-o-transition-timing-function: ease-in;
		transition-timing-function: ease-in;
	}
	.personPhoto{
		width:100px;
		height:100px;
		margin:0 auto;
		position:absolute;
		bottom:3px;
		right:0;
		left:0;
	}
	.personPhoto img{
		width: 100%;
		height:100%;
		border: 3px solid #5cc0ff;
		-webkit-border-radius: 50%;
		-moz-border-radius: 50%;
		-ms-border-radius: 50%;
		-o-border-radius: 50%;
		border-radius: 50%;
		overflow: hidden;
		position: relative;
	}
	.personContent{
		margin-bottom:30px;
	}
	.contentsx{
		width:200px;
		margin:0 auto;
	}
	.contentx{
		display:block;
		text-align:center;
	}
	.photoUpload{
		position: absolute;
		cursor: pointer;
		width: 100%;
		height: 100%;
		background-color: #3498db;
		top: 0;
		font-size: 2.8em;
		text-align: center;
		color: white;
		line-height: 64px;
		opacity: 0;
		font-family: 'FontAwesome';
		font-weight: 300;
		border: 3px solid #5cc0ff;
		-webkit-border-radius: 50%;
		-moz-border-radius: 50%;
		-ms-border-radius: 50%;
		-o-border-radius: 50%;
		border-radius: 50%;
		-webkit-transition-property: all;
		-moz-transition-property: all;
		-o-transition-property: all;
		transition-property: all;
		-webkit-transition-duration: 0.5s;
		-moz-transition-duration: 0.5s;
		-o-transition-duration: 0.5s;
		transition-duration: 0.5s;
		-webkit-transition-timing-function: ease;
		-moz-transition-timing-function: ease;
		-o-transition-timing-function: ease;
		transition-timing-function: ease;
	}

	.menuIconx{
		height:100px;
	}
	.menuIcon{
		height:100%;
		cursor: pointer;
	}
	.menuIcon i{
		font-size: 32 !important;
		width: 32;
		margin: 0 auto;
		display: flex;
	}
	.menuIcon p{
		margin: 0 auto;
		text-align: center;
	}
	.customMenu2{
		margin-right:0px !important;
	}
	.customMenux{
		height:500px;
	}
	.card-body{
		flex:none !important;
	}
	.LXRtab{
		//border:1px solid;
	}
	.LXRwall{
		display:none !important;
	}
	.LXRaction{
		display:inline-block !important;
	}
	.LXRtabaction{
		background-color:#fff !important;
	}
	.LXRtab{
		background-color:#f2f4f5;
		padding:10px;
	}
</style>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/custom.css" type="text/css"></link>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/fullcalendar.css" type="text/css"></link>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/fullcalendar.print.css" type="text/css"></link>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/animate.css" type="text/css"></link>
  <link rel="stylesheet" href="../icon/style.css?111" type="text/css"></link>
  <link rel="stylesheet" href="${pageContext.request.contextPath }/common/css/gridbycard/bootstrap.min.css" type="text/css"></link>
  <link rel="stylesheet" href="xx.css" type="text/css"></link>
  <link rel="stylesheet" href="../icon/iconfont.css" type="text/css"></link>
  <script type="text/javascript" src="../../js/example/js/jquery-1.10.2.min.js"></script>
  <link  href="../icon/cropper.css" rel="stylesheet">
  <script src="../icon/cropper.js"></script>
  <script src="../icon/workspace.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/css/gridbycard/bootstrap.min.js"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/content.js" type="text/javascript"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/jquery-ui.custom.min.js" type="text/javascript"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/date-format.js" type="text/javascript"></script>
  <!-- 弹框-->
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/js/layer/layer.js"></script>
  <!--下拉选择 -->
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/js/bootstrap-select.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/SELECT/bootstrap-select/bootstrap-select.css" type="text/css"></link>
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/js/select2/js/select2.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/js/select2/js/select2.full.js"></script>
  <link href="${pageContext.request.contextPath }/common/js/select2/css/select2.min.css" type="text/css" rel="stylesheet" />
  <!-- charts图表 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/echarts/echarts.js"></script>
<body style="font-size:14px ">
<div class="page-wrapper" style="display: block;height:100%;overflow-y:auto">
	<div class="container-fluid">
		<div class="card-group">
			<div class="card">
				<div class="card-body ">
					<div class="row gridcard_3999">
						
					</div>
				</div>
			</div>
			<div class="card">
				<div class="card-body">
					<div class="row gridcard_4003">
					</div>
				</div>
			</div>
			<div class="card">
				<div class="card-body">
					<div class="row gridcard_4017">
					</div>
				</div>
			</div>
			<div class="card">
				<div class="card-body">
					<div class="row gridcard_4012">
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-3 col-md-6">
				<div class="card secondCard">
					<div class="card-body personInfo">
						<!--背景-->
						<div id="campaign" class=" personBackPic">
							<img class="" src="http://localhost:9999/其他/up.jpg" alt="background"/>
							<div class="goodSay">
								<h3>@WT</h3>
								<p>没有什么人能打败你,除了你自己!!!安排</p>
							</div>
						</div>
						<!--头像-->
						<div id="personPhoto" class="personPhoto">
							<img src="http://116.62.243.28:9872/人员照片/系统管理员_sysadmin.jpg" alt="personPhoto"/>
							<div class="photoUpload">
								<div class="iconfont icon-sheshengxiao" style="font-size:40px;line-height:100px">
							
								</div>
							</div>
						</div>
					</div>
					<!--文本信息-->
					<div id="personContent" class="personContent">
						<div class="contentsx personInfoContent">
							
						</div>
					</div>
				</div>
			</div>
			
			
			<div class="col-lg-6 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-body" style="min-height:350px">
						<h4 class="card-title">新闻制度</h4>
						<ul class=" nav nav-tabs  m-a-15 justify-content-end m-b-15" id="myTab">
							<li class=" nav-item "> <a href="#content" class="nav-link " data-toggle="tab" aria-expanded="false"><h5>人事政策</h5></a> </li>
							<li class="nav-item "> <a href="#contenta" class="nav-link" data-toggle="tab" aria-expanded="false"><h5>娱乐新闻</h5></a> </li>
							<li class="nav-item "> <a href="#contentb" class="nav-link" data-toggle="tab" aria-expanded="flase"><h5>焦点新闻</h5></a> </li>
							<input class="form-control" type="hidden" style="width:200px;position:absolute;top:10px;right:20px;" placeholder="标题" id="ANNOUNCEMENT_TITLE" onchange="loaddata()"/>
						</ul>
						<br> 
						<br> 
						<div class="tab-content br-n pn">
							<div id="content" class="tab-pane active" aria-expanded="true">
								<div class="row">
								   <div class="col-md-4"> <img src="../icon/1.png" class="img-responsive thumbnail m-r-15"> </div>
									<ul class="col-md-8" id="contenaa" ></ul>
								</div>
							</div>
							<div id="contenta" class="tab-pane " aria-expanded="false">
								<div class="row">
									<ul class="col-md-8" id="contentaa"></ul>
									 <div class="col-md-4"> <img src="../icon/2.png" class="img-responsive thumbnail m-r-15"> </div>
									 </div>
							</div>
							<div id="contentb" class="tab-pane " aria-expanded="false">
								<div class="row">
									<div class="col-md-4"> <img src="../icon/3.png" class="img-responsive thumbnail m-r-15"> </div>
								   
									<ul class="col-md-8" id="contentbb"></ul>
								</div>
							</div>
							 <br> 
							<input type="button"class="btn btn-dribbble waves-effect btn-rounded waves-light" style="position:absolute;bottom:5px;right:20px" onclick="showNews()" value="More"/>
						</div>
					</div>
				</div>
				<div class="col-lg-12 col-md-12 col-sm-12 customMenuParent2" style="padding:0">
					<div class="card customMenux" style="height:360px">
						<div class="card-body">
							<h4 class="card-title">人员检索</h4>
						</div>
						<div class="customMenu3 comment-widgets scrollable ps-container ps-theme-default row searchPersons">
							<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
									<label class="searchLabel">姓名/工号</label>                        
									<input id="EXPAND" name="EMPCODE" placeholder="姓名,工号" style="width:150px;height:29px;margin:0 0 0 5px;" title="姓名/工号" type="text" class="form-control">
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
									<label class="searchLabel">部&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp门</label>                        
									<select id="DEPID" class="selectpicker bla bla bli searchSelect" multiple data-live-search="true" title="部门" name="DEPID" dictType="sql" dictCode="sql11">
									</select>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
									<label class="searchLabel">岗&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp位</label>                      
									<select id="JOBID" class="selectpicker bla bla bli searchSelect" multiple data-live-search="true" title="岗位" name="JOBID" dictType="sql" dictCode="sql50">
									</select>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
									<label class="searchLabel">公司归属</label>                      
									<select id="COMPOWNERSHIP" class="selectpicker bla bla bli searchSelect" multiple data-live-search="true" title="公司归属" name="COMPOWNERSHIP" dictType="sql" dictCode="sql5">
									</select>
								</div>
							</div>
							 <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
									<label class="searchLabel">最高学历</label>                      
									<select id="MAXEDUCATION" class="selectpicker bla bla bli searchSelect" multiple data-live-search="true" title="最高学历" name="MAXEDUCATION" dictType="dict" dictCode="emp_EDUTYPE">
									</select>
								</div>
							</div>
							 <div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
									<label class="searchLabel">政治面貌</label>                      
									<select id="POLITICALSTATUS" class="selectpicker bla bla bli searchSelect" multiple data-live-search="true" title="政治面貌" name="POLITICALSTATUS" dictType="dict" dictCode="emp_PoliticalOut">
									</select>
								</div>
							</div>
							<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12 searchClass">
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
									<input style="float:left;height:29px" value="查询" type="button" class="btn btn-primary" onclick="showPersons()"/>                    
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
			
			<div class="col-lg-3 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-body" style="min-height:310px">
						<h4 class="card-title">天气 预报</h4>
						<hr>
						<div class="d-flex align-items-center flex-row m-t-30">
							<div class="p-2 display-5 text-info"><i class="wi wi-rain-mix"></i><span id="clnid"><sup>°</sup></span> ~ <span id="hotid"><sup>°</sup></span></div>
							<div class="p-2" style="margin-left:50px">
								<h3 class="m-b-0"><span id="dataid"></span></h3>
								<small style="margin-left:10px">
									<select id="skycityid" class="select pull-right weatherSelect"style="width:100px;">
										<option value="101220101" selected>合肥</option>
										<option value="101020100" >上海</option>
										<option value="101230201">厦门</option>
										<option value="101210101">嘉兴</option>
										<option value="101221008">黄山</option>
										<option value="101220901">亳州</option>
										<option value="101110309">洛川</option>
										<option value="101270901">巴中</option>
									</select>
								</small>
							</div>
						</div>
						<table class="table no-border" style="margin-left:30px">
							<tbody>
								<tr>
									<td>风速</td>
									<td id="windid" class="font-medium"></td>
								</tr>
								<tr>
									<td>湿度</td>
									<td id="waterid"class="font-medium"></td>
								</tr>
								<tr>
									<td>风向</td>
									<td id="windleid"class="font-medium"></td>
								</tr>
								<tr>
									<td>天气</td>
									<td id="timeid"class="font-medium"></td>
								</tr>
							</tbody>
						</table>
						
					</div>
				</div>
				<!--skys-->
				<div class="col-lg-12 col-md-12" style="padding:0;">
					<div class="card" style="min-height:395px">
						<div class="card-body">
							<div class="ibox float-e-margins">
								<div class="ibox-title">
									<h4 class="card-title">工作日历</h4>
								</div>
								<div class="ibox-content">
									<div id="calendar"></div>
								</div>
							</div>
						</div>
					</div>
                </div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-body Wchart" style="min-height:310px">
						<div class="ibox-title">
							<h4 class="card-title">工龄统计</h4>
						</div>
						<div id="EMP_V_WORKYEARS_SUB_chart" style="width:100%;height:400px;">
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-body Wchart" style="min-height:310px">
						<div class="ibox-title">
							<h4 class="card-title">司龄统计</h4>
						</div>
						<div id="EMP_V_COMPYEARS_SUB_chart" style="width:100%;height:400px;">
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-body Wchart" style="min-height:310px">
						<div class="ibox-title">
							<h4 class="card-title">年龄统计</h4>
						</div>
						<div id="EMP_V_YEAROLDSTJ_SUB_chart" style="width:100%;height:400px;">
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-body Wchart" style="min-height:310px">
						<div class="ibox-title">
							<h4 class="card-title">学历统计</h4>
						</div>
						<div id="TJ_V_JOBORDER_EDU_chart" style="width:100%;height:400px;">
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-body Wchart" style="min-height:310px">
						<div class="ibox-title">
							<h4 class="card-title">工作地点统计</h4>
						</div>
						<div id="TJ_V_JOBORDER_CITY_chart" style="width:100%;height:400px;">
						</div>
					</div>
				</div>
			</div>
			<div class="col-lg-4 col-md-6 col-sm-12">
				<div class="card">
					<div class="card-body Wchart" style="min-height:310px">
						<div class="ibox-title">
							<h4 class="card-title">学校类型统计</h4>
						</div>
						<div id="TJ_V_JOBORDER_SHOOL_chart" style="width:100%;height:400px;">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script>		
$(function() {
	var duty = 'newsDatas,personInfo';
	var data = getAllData(duty);
	initPersonInfo(data);
	//initMenu(data);
	//initNewsData(data);
	initWorkDate(data);
	//四个预警
	loadDataStart_3999();
	loadDataStart_4003();
	loadDataStart_4017();
	loadDataStart_4012();
	//人员检索
	searchPersons();
	//图表
	queryAllData_4769();
	queryAllData_4766();
	queryAllData_4771();
	queryAllData_4775();
	queryAllData_4779();
	queryAllData_4777();
	loadWeather();
	$(".waitProcess,.customMenu,.customMenu2,.customMenu3").hover(function(){
		$(this).css("overflow-y","auto");
	},function(){
		$(this).css("overflow","hidden");
	})
	$(".menuIcon").hover(function(){
		$(this).css("background-color","rgba(0,0,0,.03)");
	},function(){
		$(this).css("background-color","#FFF");
	})
	$(".personBackPic").hover(function(){
		$(this).find(".goodSay").css("opacity","0.8");
	},function(){
		$(this).find(".goodSay").css("opacity","0");
	})	
	$(".photoUpload").hover(function(){
		$(this).css("opacity","0.8");
	},function(){
		$(this).css("opacity","0");
	})	
	$('#myTab a').click(function (e) {
			e.preventDefault();
			var x = $(this)[0].innerHTML;
            $(this).tab('show');
	} )
	$(".LXRtab").click(function e(){
		$(".LXRtab").removeClass("LXRtabaction");
		$(this).addClass("LXRtabaction");
		var linkId = $(this).attr("linkx");
		$(".LXRwall").removeClass("LXRaction");
		$("#"+linkId).addClass("LXRaction");
	})
	$("#skycityid").change(function(){
		loadWeather();
    });
});
	
	/*个人信息*/
	function initPersonInfo(e){
		var obj = e.personInfo;
		var cell = '';
		cell =  '<div class="contentx">'+
				'	<p>'+obj.empcode+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>'+obj.cname+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>'+obj.sex+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>'+obj.depid+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>'+obj.jobid+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>'+obj.birthday+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>'+obj.workemail+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>'+obj.mobile+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>'+obj.workphone+'</p>'+
				'</div>'+
				'<div class="contentx">'+
				'	<p>自觉心是进步之母，自贱心是堕落之源，故自觉心不可无，自贱心不可有</p>'+
				'</div>';
		$(".personInfoContent").append(cell);
	}
	
	/*新闻信息*/
	function initNewsData(data){
		var list = data.newsDatas;
		var count=0;
		var temp = '';
		var temps='';
		var tempa='';
		var tempb=''
		for(var j=0; j<list.length;j++){ 
		  if(list[j].state==1){
		  count++;
		 if(count<9){
			temp += '<li class="nav-item" style="height:30px;margin:5px 0;list-style:none;">'+
					'	<p style="float:left;">['+formatDateTime(list[j].createTime)+']</p><p style="float:left;overflow-x:hidden;"><a href="#" title="'+list[j].title+'" onclick="show('+list[j].id+')">'+list[j].title.substring(0,16)+'</a></p>'+
					'</li>';
		 }
		   $("#contenaa").html(temp);
		  }
			if(list[j].state==2){
		   
			temps += '<li class="nav-item" style="height:30px;margin:5px 0;list-style:none;">'+
					'	<p style="float:left;width:100px">['+formatDateTime(list[j].createTime)+']</p><p style="float:left;"><a  href="#" title="'+list[j].title+'" onclick="show('+list[j].id+')">'+list[j].title.substring(0,16)+'</a></p>'+
					'</li>';
		   }
		 $("#contentaa").html(temps);
		 if(list[j].state==3){
		   
			tempa += '<li class="nav-item" style="height:30px;margin:5px 0;list-style:none;">'+
					'	<p style="float:left;width:100px">['+formatDateTime(list[j].createTime)+']</p><p style=";float:left;"><a  href="#" title="'+list[j].title+'" onclick="show('+list[j].id+')">'+list[j].title.substring(0,16)+'</a></p>'+
					'</li>';
					 $("#contentbb").html(tempa);
		   }
		   if(list[j].state==4){
		   
			tempb += '<li class="nav-item" style="height:30px;margin:5px 0;list-style:none;">'+
					'	<p style="float:left;width:100px">['+formatDateTime(list[j].createTime)+']</p><p style="float:left;"><a href="#" onclick="show('+list[j].id+')">'+list[j].title+'</a></p>'+
					'</li>';
					 $("#contentxx").html(tempb);
		   }
		
		}
		
	}
	
	/*日期格式化*/
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
	/*新闻信息*/
	function show(id){
		var idx = id+1000;///myehr_0_SQLSERVER/WebRoot/jsp/announcement/announcementDetail.jsp
		parent.addTab(idx,"新闻详情","/myehr/jsp/announcement/announcementDetail.jsp?id="+id);
	}	
	/*新闻信息*/
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
	/*获取所有数据*/
	function getAllData(e){
		var datas = {};
		$.ajax({
			url: "/myehr/dragconfig/getDragAllDatas.action?duty="+e,
			type: 'post',
			cache: false,
			async: false,
			success: function (data) {
				datas = data;
			 }
		});
		return datas;
	}
	/*待批任务信息*/
	function initWaitLines(e){
		var datas = e.waitDatas.rows; 
		if(datas.length==0){
			$(".waitProcessParent").css("display","none");
			return
		}
		for(var i = 0 ; i < datas.length&&i < 5 ; i++){
			var data = datas[i];
			var cell = '';
			//formId,procDefKey,taskDefKey,taskId,procInsId,businessId
				cell =  '<div class="d-flex flex-row comment-row m-t-0" onclick="approve(\''+data.formId+'\',\''+data.procDefKey+'\',\''+data.taskDefKey+'\',\''+data.taskId+'\',\''+data.procInsId+'\',\''+data.businessId+'\')">'+
						'	<div class="p-2">'+
						'		<img src="'+data.createrPhoto+'" onerror="src=\'http://localhost:9999/人员照片/系统管理员_sysadmin.jpg\'" alt="user" width="50" class="rounded-circle">'+
						'	</div>'+
						'	<div class="comment-text w-100">'+
						'		<h6 class="font-medium">'+data.title+'</h6>'+
						'		<span class="m-b-15 d-block">'+data.prevAssigneeName+'&nbsp&nbsp&nbsp&nbsp'+data.status+'</span>'+
						'		<div class="comment-footer">'+
						'			<span class="text-muted float-right">'+data.createAgo+'</span>'+
						'			<span class="label label-rounded label-primary">紧急</span>'+
						'			<span class="action-icons">'+
						'				<a href="javascript:void(0)" target="_blank" title="流程图">'+
						'					<i class="iconfont icon-liuchengtu "></i>'+
						'				</a>'+
						/*
						'				<a href="javascript:void(0)" title="通过">'+
						'					<i class="iconfont icon-pass-1-copy "></i>'+
						'				</a>'+
						'				<a href="javascript:void(0)" title="驳回">'+
						'					<i class="iconfont icon-notpass-1-copy " ></i>'+
						'				</a>'+
						*/
						'			</span>'+
						'		</div>'+
						'	</div>'+
						'</div>';
			$(".waitProcess").append(cell);
		}
		
	}
	/*菜单信息*/
	function initMenu(datas){
		var str = datas.dragMenus['桌面流程发起'];
		if(str.length==''){
			$(".customMenuParent").css("display","none");
			return
		}
		var objs = JSON.parse(str);
			objs = objs.data;
		var str2 = datas.dragMenus['桌面工单申请'];
		var objs2 = JSON.parse(str2);
			objs2 = objs2.data;
		var str3 = datas.dragMenus['桌面我的菜单'];
		var objs3 = JSON.parse(str3);
			objs3 = objs3.data;
		appendMenuJsp(objs,"customMenu","col-lg-3 col-md-4 col-sm-6");
		appendMenuJsp(objs2,"customMenu2","col-lg-3 col-md-4 col-sm-6");
		appendMenuJsp(objs3,"customMenu3","col-lg-2 col-md-4 col-sm-6");
	}
	var menuIdx = 8888;
	function appendMenuJsp(objs,classCode,size){
		if(objs.length==0){
			return
		}
		if(objs[0].childrens!=undefined){//带二级菜单
			for(var i=0 ; i<objs.length ; i++){
				var obj = objs[i];
				var cell = '';
				cell =  '<div class="card-body">'+
					    '	<h4 class="card-title">'+obj.menuName+'</h4>'+
						'</div>'+
						'<div class="comment-widgets scrollable ps-container ps-theme-default customMenu2 row data-ps-id="bdc7b288-a9a2-7cdc-e8cf-e439e93ee41f">';
				var sonObjs = obj.childrens;
				for(var k=0 ;k<sonObjs.length; k++){
					var sonObj = sonObjs[k];
					cell+=  '<div class="'+size+' menuIconx" title="'+sonObj.menuName+'">'+
							'	<div class="menuIcon" >'+
							'		<i class=" iconfont icon-pass-1-copy "></i>'+
							'		<p >'+sonObj.menuName+'</p>'+
							'	</div>'+
							'</div>';
				}	
				cell+=  '</div>';
				$("."+classCode).append(cell);
			}
		}else{
			for(var i=0 ; i<objs.length ; i++){
				var data = objs[i];
				var cell = '';
				var iconCode = 'iconfont icon-pass-1-copy';
				if(data.imgFileId!='null'){
					iconCode = data.imgFileId;
				}
				var menuId = menuIdx;
				var menuName = data.menuName;
				var menuUrl = data.menuUrl;
				if(data.menuIsDynamicForm == 'Y'){//动态表单
					menuId = data.menuFormId;
					menuUrl = "/myehr/form/toForm.action?formId="+menuId;
				}else{
					menuIdx++;
				}
				
				cell =  '<div class="'+size+' menuIconx" title="'+data.menuName+'">'+
						'	<div class="menuIcon" onclick="getMenuParam(\''+menuId+'\',\''+menuName+'\',\''+menuUrl+'\')">'+
						'		<i class="'+iconCode+'"></i>'+
						'		<p >'+data.menuName+'</p>'+
						'	</div>'+
						'</div>';
				$("."+classCode).append(cell);
			}
		}
	}
	/*任务信息*/							
	function inittaskdate(data){
		var list = data.taskDatas;
		var liListHtml = '';
		for(var i=0;i<list.length;i++){
			var time = "";
			time = formatDateTime(list[i].sysTaskCreateTime);
			var sysTaskUrgencyHtml='';
			if(list[i].sysTaskUrgency=='1'){
				sysTaskUrgencyHtml="danger-element";
			}else if(list[i].sysTaskUrgency=='2'){
				sysTaskUrgencyHtml="warning-element";
			}else{
				sysTaskUrgencyHtml="success-element";
			}
			var approveHtml='';
			if(list[i].procTaskId!=null && list[i].procTaskId!=''){
				var obj = list[i];
				approveHtml='        <a href="javascript:void(0);" onclick ="approveProcess(this)" procFormId="'+obj.procFormId+'" procTaskId="'+obj.procTaskId+'" procInsId="'+obj.procInsId+'" procBusinessId="'+obj.procBusinessId+'" class="pull-right btn btn-xs btn-primary">审批</a>';
			}
			var openFormHtml='';
			if(list[i].sysTaskFormid!=null && list[i].sysTaskFormid!=''){
				var obj = list[i];
				var sysTaskFormid = obj.sysTaskFormid;
				var aa = sysTaskFormid.split(":");
			}
			liListHtml+='<li class="list-group-item todo-item '+sysTaskUrgencyHtml+'"data-role="task" style="background-color:#fff">'+
						'<div class="custom-control custom-checkbox">'+
						'<input type="checkbox" class="custom-control-input" id="customCheck'+i+'" onclick="openForm(this)" value="'+list[i].sysTaskId+'"/>'+
						'<label class="custom-control-label todo-label" for="customCheck'+i+'">'+
						'<div>'+
						'<span class="todo-desc float-left" style="width:400px;">'+
						'    '+list[i].sysTaskContent+
						'</span>'+time+
						'<span>'+
						'</div>'+
						'<span class="badge badge-pill badge-success "style="/* margin-right: 72px; */float: right;margin-top:-23px;" >完成</span>'+
						'</label>'+
						'    <h5 class="agile-detail">'+
						approveHtml+
						openFormHtml+
					//	'        <i class="fa fa-clock-o"></i>'+time+
						'    </h5></div>'+
						'</li>';
		}
		$("#allTaskList").html(liListHtml);
	}
							
	/*打开表单信息*/							
	function openForm(obj){
		//$(obj).parent().children().children()[0];
		if($(obj).parent().children().children()[1].style.textDecorationStyle==""){
			$(obj).parent().children().find("span").css("text-decoration","line-through");
			$(obj).parent().children().find("span").css("text-decoration-color","red");
			var va = $(obj).value;
			$.ajax({
				url:'sysTask/checkSysTask.action?sysTaskId='+va,
				type:'post',
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
	
				}
			});
		}else{
			$(obj).parent().children().find("span").css("text-decoration","");
			var va = $(obj).parent().parent().children()[0].value;
				$.ajax({
				
					url:'sysTask/checkSysTask1.action?sysTaskId='+va,
					type:'post',
					cache: false,
					async: false,
					contentType: 'application/json;charset=utf-8',
					success: function (text) {
		
					}});
		}
	}							
								
	function tomore(){
		window.location.href="${pageContext.request.contextPath }/jsp/task/taskManage/agileBoard.jsp";
	}	

	
	/*日历信息*/
	var date = new Date();
    var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();
	var userId=1;
	
	var A0190 = getUrlParam().substring(getUrlParam().indexOf("=")+1);
	
	
	var startDay;
	var selectStart;
	var selectEnd;
	var selectAllDay;

	function initWorkDate(data){
		var calendar = $('#calendar').fullCalendar({
			header: {
				left: 'prev,next',
				center: 'title',
				right: 'month,agendaWeek,agendaDay'
			},
			lang: 'zh-cn',
			buttonIcons: false, // show the prev/next text
			weekMode: 'liquid',
			editable: false,
			selectable: true,
			defaultView: 'month',
			droppable: true, // this allows things to be dropped onto the calendar !!!
			drop: function (date, allDay) { // this function is called when something is dropped
				// retrieve the dropped element's stored Event Object
				var originalEventObject = $(this).data('eventObject');
				
				// we need to copy it, so that multiple events don't have a reference to the same object
				var copiedEventObject = $.extend({}, originalEventObject);

				// assign it the date that was reported
				copiedEventObject.start = date;
				copiedEventObject.allDay = allDay;

				// render the event on the calendar
				// the last `true` argument determines if the event "sticks" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)
				$('#calendar').fullCalendar('renderEvent', copiedEventObject, true);

				// is the "remove after drop" checkbox checked?
				if ($('#drop-remove').is(':checked')) {
							// if so, remove the element from the "Draggable Events" list
					$(this).remove();
				}
			},
			selectHelper: true,
			select: function(start, end, allDay) {
				selectStart=start;
				selectEnd=end;
				selectAllDay=allDay;
				var aaa=formatDate(end);
				var bbb=aaa.substring(aaa.length-2,aaa.length-1);
				if(bbb==0){
					document.getElementById("updateWork").style.top='150px';
				}
				if(bbb==1){
					document.getElementById("updateWork").style.top='350px';
				}
				if(bbb==2){
					document.getElementById("updateWork").style.top='550px';
				}

				document.getElementById("updateWork").style.display="";
			},
			events: function(start,end,callback) {
				startDay=FormatDate(start);
				FormatDate(end);
				if(data.workDatas!=undefined){
					var workDatas = data.workDatas.workDatas;
				var events = [];
				for(var i=0;i<workDatas.length;i++){
					var date = new Date(workDatas[i].obj.begintime1).Format("yyyy-MM-dd hh:mm:ss");
					var id = new Date(workDatas[i].obj.begintime1).Format("yyyy-MM-dd");
					var tt = workDatas[i].shifttype_cname;
					events.push({
						id:id,
						title: tt,
						start: date
					});
				}
				callback(events);
				}
			}
		});
	}
	
			
	function parserDate(date){
		return new Date(Date.parse(date.replace(/-/g, "/")));  
	}
	
	function getLocalTime(nS) {     
       return new Date(parseInt(nS) * 1000).toLocaleString().replace(/年|月/g, "-").replace(/日/g, " ");      
    }   
	
	function FormatDate (strTime) {
	    var date = new Date(strTime);
	    return date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
	}
			
	function save(){
		var thisday=document.getElementById("thisDay").value;
		var title= document.getElementById("title").value;
		$.ajax({
	            url: '/myehr/calendar/save.action',
	            dataType: 'JSON',
	            data: "title=" + title + "&datetime=" + thisday,
	            success: function(json) { // 获取当前月的数据
	            	document.getElementById("updateWork").style.display="none";
	                //location.reload();
	            }
	        });
	}
	
	function save1(){
		var elm = document.getElementsByName("rest");
    	var title="";
    	var thisday=formatDate(selectStart);
    	for(var i=0;i<elm.length;i++){
    		if(elm[i].checked){
    			title=elm[i].value;
    			zhtitle= elm[i].title;
    		}
    	}
		
		if (title.length>0) {
			calendar.fullCalendar('removeEvents', [thisday]);
			if(zhtitle=='删除'){
				alert("删除成功！");
			}else{
				calendar.fullCalendar('renderEvent',
					{	
						id:thisday,
						title: zhtitle,
						start: selectStart,
						end: selectEnd,
						allDay: selectAllDay
					},
					true 
				);
			}
			
			//var kCalendar={'kguid':kguid,'itemCaption':title,'itemDate':thisday};
			$.ajax({
	            url: '/myehr/calendar/addWorkDay.action',
	            data: "kguid=" + kguid + "&itemCaption=" + title+ "&itemDate=" + thisday,
				cache: false,
				type: 'get',
				contentType: 'application/json;charset=utf-8',
	            success: function(data) { // 获取当前月的数据
	            	if(data!="1"){
	            		alert("添加失败");
	            	}
	            }
	        });
		}
		document.getElementById("updateWork").style.display="none";
		calendar.fullCalendar('unselect');
	}
	
	function closex(){
		document.getElementById("updateWork").style.display="none";
	}
	
	function init(){
		var strs= startDay.split("-");
		var thisstartyear =strs[0];
		var thisstartmonth =strs[1];
		var thisstartday =strs[2];
		if(thisstartday!=1){
			thisstartmonth=parseInt(thisstartmonth)+1;
		}
		var datetime;
		if(thisstartmonth<10){
			datetime=thisstartyear+"-0"+thisstartmonth;
		}else{
			datetime=thisstartyear+"-"+thisstartmonth;
		}
		$.ajax({
	            url: '/myehr/calendar/InitRestCalendar.action',
	            data: "kguid=" + kguid + "&itemDate=" + datetime,
		        cache: false,
		        contentType: 'application/json;charset=utf-8',
	            success: function(json) { // 获取当前月的数据
	            	alert("初始本月日历成功！");
	            	location.reload();
	            }
	    });
	}
	
	
	function getUrlParam(){
    	// 获取参数
	    var url = window.location.search;
	    // 匹配目标参数
	    var result = url.split("\&");
	    //返回参数值
	    return result ? decodeURIComponent(result[1]) : null;
	}

	function getEmpPhotoSYSx(empId){
		var src = "";
		$.ajax({ 
			   url:'/myehr/FileList/getEmpPhotoSYS.action?EMPID='+empId,
			   type:'post',
			   cache: false,
			   async: false, 
			   success: function (data){ 
				  src = data[0];
			   }
		   });
		return src;
	}

	
	
	
	
	
	/**取url参数值  */
	function getQueryString(name) {
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");  
		var l = decodeURI(window.location.search);  
		var r = l.substr(1).match(reg);  
		if (r != null) return unescape(r[2]);  
		return null;  
	}
	function loadWeather(){
		var sel = $("#skycityid").val(); 
		var cityid;
		if(sel==1||sel==""){
		 cityid='101020100';
		}else{
		  cityid=sel;
		}
		 var url = "/myehr/announcement/WeatherReport.action?CityId="+cityid; 
			$.ajax({
				url:url,
				cache: true,
				success: function (result) {
					var now = new Date();
					 var arr_week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
					document.getElementById('clnid').innerText=result.map1.temp1;
					document.getElementById('hotid').innerText=result.map1.temp2;
					//$('h3').html('星期一');
					document.getElementById('dataid').innerText=arr_week[now.getDay()];
					//document.getElementById('citys').innerText="中国,"+result.map1.city;
					document.getElementById('waterid').innerText=result.map2.SD;
					document.getElementById('windid').innerText=result.map2.WS;
					document.getElementById('windleid').innerText=result.map2.WD;
					document.getElementById('timeid').innerText=result.map1.weather;
				}
			});
	}


	//流程审批
	function approve(formId,procDefKey,taskDefKey,taskId,procInsId,businessId){
		var url='/myehr/form/toForm.action?formId='+formId+'&key='+procDefKey+'&orderBy='+taskDefKey+'&taskId='+taskId+'&procInsId='+procInsId+'&businessId='+businessId;
		
		layer.open({
			type: 2,
			title:'流程审批',
			shadeClose: true,
			shade: 0.8,
			maxmin:true,
			zIndex:9999,
			area: ['950px', '500px'],
			content: url,
			success:function(layero,index){
			$('.layui-layer-max').click();
			},
			end:function(){
					refresh_org_list();
			}
		});
		
	}

//菜单跳转
	function getMenuParam(menuId,menuName,menuUrl){
		$.ajax({
			url:'/myehr/SysMenuList/queryParamByMenuId.action?menuId='+menuId,
			type:'post',
			contentType: 'application/json;charset=utf-8',
			cache: true,
			success: function (text) {
				if(text.length>0){
					var flag = 0;
					var url = menuUrl;
					for(var i=0;i<text.length;i++){
						if(text[i].MENU_PARAM_TYPE!='hiddenParam'){
							flag++;
						}else{
							if(text[i].MENU_PARAM_CLASS=='sessionParam'){
								
							}else{
								url += '&'+text[i].MENU_PARAM_NAME+'='+text[i].MENU_PARAM_VALUE;
							}
						}							
					}
					if(flag>0){
						var url = '/myehr/jsp/form/param/frontParam.jsp?menuId='+menuId;
						layer.open({
							type: 2,
							title:'请输入参数',
							shadeClose: true,
							shade: 0.8,
							//offset: ['0px', '0px'],
							area: ['500', '500'],
							content: url,
							success:function(layero,index){
							},
							end:function(){
								if(menuId == "null"){
									return;
								}
								addTab(menuId,menuName,menuUrl);
							}
						});
					}else{
						val.name = url;
						addTab(menuId,menuName,menuUrl);
					}
					
				}else{
					if(menuId == "null"&&(menuUrl == ""||menuUrl=="javascript:void(0);")){
						return;
					}else{
						parent.addTab(menuId,menuName,menuUrl);
					}
					
				}
			}
		});
    }
	function searchPersons(){
		var objs = $(".searchPersons").find('select');
		var columns = [];
		for(var i=0;i<objs.length;i++){
			var obj = objs[i];
			var dictType = $(obj).attr("dictType");
			var dictCode = $(obj).attr("dictCode");
			var column = {};
			column.formColumnShowType = 'false';
			column.formColumnUsName = dictCode;
			column.formColumnGuiType = dictType;//字典类型
			columns[i] = column;
		}
		var datas = getselectdatasAll(columns);
		for(var j=0;j<datas.length;j++){
			var data = datas[j];
			for(var i=0;i<data.length;i++){
				document.getElementById(objs[j].id).options.add(new Option(data[i].name,data[i].code));
			}
		}
		$('.searchPersons .selectpicker').selectpicker('refresh');
	}
	function getselectdatasAll(e){
		var dictDatas;
		$.ajax({ 
		   url:'/myehr/dict/getselectdatasAll.action',
		   type:'post',
		   cache: false,
		   async: false,
		   contentType: 'application/json;charset=utf-8',
		   data: JSON.stringify(e),
		   success: function (datas){ 
				dictDatas = datas;
		   }
	   });
	   return dictDatas;
	}
	
	function showPersons(){
		//DEPID&JOBID&MAXEDUCATION&POLITICALSTATUS&COMPOWNERSHIP&EXPAND
		var DEPID = $("#DEPID").val()==null?"":$("#DEPID").val();
		var JOBID = $("#JOBID").val()==null?"":$("#JOBID").val();
		var MAXEDUCATION = $("#MAXEDUCATION").val()==null?"":$("#MAXEDUCATION").val();
		var POLITICALSTATUS = $("#POLITICALSTATUS").val()==null?"":$("#POLITICALSTATUS").val();
		var COMPOWNERSHIP = $("#COMPOWNERSHIP").val()==null?"":$("#COMPOWNERSHIP").val();
		var EXPAND = $("#EXPAND").val()==null?"":$("#EXPAND").val();
		var url='/myehr/jsp/formbuild/workspace/icon/EMP_V_EMPLOYEESS.jsp?DEPID='+DEPID+'&JOBID='+JOBID+'&MAXEDUCATION='+MAXEDUCATION+'&POLITICALSTATUS='+POLITICALSTATUS+'&COMPOWNERSHIP='+COMPOWNERSHIP+'&EXPAND='+EXPAND+'';
		
		layer.open({
			type: 2,
			title:'人员检索',
			shadeClose: true,
			shade: 0.8,
			maxmin:true,
			zIndex:9999,
			area: ['950px', '500px'],
			content: url,
			success:function(layero,index){
			$('.layui-layer-max').click();
			},
			end:function(){
					refresh_org_list();
			}
		});
	}
</script>
</body>
</html>