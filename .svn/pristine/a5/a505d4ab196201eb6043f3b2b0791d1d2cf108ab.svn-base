<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>任务拖动管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/animate.css" rel="stylesheet">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/jsp/task/addTask/css/style.css">
    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/style.css?v=4.1.0" rel="stylesheet">
	<script src="${pageContext.request.contextPath }/jsp/task/addTask/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/layer/layer.js"></script>

  </head>
  
  <body class="gray-bg" style="padding-top:0px">
	<div class="wrapper wrapper-content  animated fadeInRight" style="margin-top:10px;margin-left:20px;padding:0px">
		<div>
		<label><div style="background:#1ab395;float:left;margin-right:10px;padding:0 10px;color:#ffffff"><input type="checkbox" value="1" onClick='test(this)'>&nbsp&nbsp会议</label></div>
		<label><div style="background:#ee5464;float:left;margin-right:10px;padding:0 10px;color:#ffffff"><input type="checkbox" value="2" onClick='test(this)'>&nbsp&nbsp例行</label></div>
		<label><div style="background:#3e7cbc;float:left;margin-right:10px;padding:0 10px;color:#ffffff"><input type="checkbox" value="3" onClick='test(this)'>&nbsp&nbsp额外</label></div>
		<label><div style="background:#4ebed2;float:left;margin-right:10px;padding:0 10px;color:#ffffff"><input type="checkbox" value="4" onClick='test(this)'>&nbsp&nbsp面试</label></div>
		<label><div style="background:#f8af5d;float:left;margin-right:10px;padding:0 10px;color:#ffffff"><input type="checkbox" value="5" onClick='test(this)'>&nbsp&nbsp客户</label></div>
		</div>
	</div>
    <div class="wrapper wrapper-content  animated fadeInRight">
        <div class="row">
			<div id='addTask' class="col-sm-3" style="height:100%">
				<div class="ibox" style="height:100%">
					<div id='addTaskIboxcontent' class="ibox-content" style="height:100%">
                        <h3>添加任务</h3>
						<header style="height:10%">
							<input type="text" autofocus placeholder="新增任务" id="item">
							<div id='animationDiv'>
								<button id="add">
									<svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px"viewBox="0 0 16 16" style="enable-background:new 0 0 16 16;" xml:space="preserve"><g><path class="fill" d="M16,8c0,0.5-0.5,1-1,1H9v6c0,0.5-0.5,1-1,1s-1-0.5-1-1V9H1C0.5,9,0,8.5,0,8s0.5-1,1-1h6V1c0-0.5,0.5-1,1-1s1,0.5,1,1v6h6C15.5,7,16,7.5,16,8z"/></g></svg>
								</button>
							</div>
						</header>
						
						<div class="container" style="height:70%;overflow-y:auto;padding-top:5px;">
							<ul class="todo" id="todo"></ul>
							<hr class = "divider">
							<ul class="todo" id="completed"></ul>
						</div>
						<script src="${pageContext.request.contextPath }/jsp/task/addTask/js/mo.min.js"></script>
						<script src="${pageContext.request.contextPath }/jsp/task/addTask/js/index.js"></script>
						
					</div>
				</div>
			</div>
            <div class="col-sm-3" style="height:100%">
                <div class="ibox">
                    <div class="ibox-content">
                        <h3>任务列表</h3>
                        <p class="small"><i class="fa fa-hand-o-up"></i> 在列表之间拖动任务面板</p>

                        <ul id="allTaskList" class="sortable-list connectList agile-list" style="height:84%;overflow-y:auto;padding-top:5px;">
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-3" style="height:100%">
                <div class="ibox">
                    <div class="ibox-content">
                        <h3>进行中</h3>
                        <p class="small"><i class="fa fa-hand-o-up"></i> 在列表之间拖动任务面板</p>
                        <ul id="toDoTaskList" class="sortable-list connectList agile-list" style="height:84%;overflow-y:auto;padding-top:5px;">
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-sm-3" style="height:100%">
                <div class="ibox">
                    <div class="ibox-content">
                        <h3>已完成</h3>
                        <p class="small"><i class="fa fa-hand-o-up"></i> 在列表之间拖动任务面板</p>
                        <ul id="finishTaskList" class="sortable-list connectList agile-list" style="height:84%;overflow-y:auto;padding-top:5px;">
                        </ul>
                    </div>
                </div>
            </div>

        </div>


    </div>

    <!-- 全局js -->
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/jquery.min.js?v=2.1.4"></script>
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/bootstrap.min.js?v=3.3.6"></script>
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/jquery-ui-1.10.4.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/date-format.js"></script>

    <!-- 自定义js -->
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/content.js?v=1.0.0"></script>

    <script>
        $(document).ready(function () {
			queryTask();
			queryTask1('all');
			queryToDoTask('all');
			queryFinishTask('all');
			var height = document.getElementById('addTask').clientHeight+40;
			document.getElementById('addTaskIboxcontent').style.height = height+'px';
            $(".sortable-list").sortable({
                connectWith: ".connectList"
            }).disableSelection();
			
			$('.sortable-list').bind('sortstop', function(event, ui) {
				var parentUlId = event.toElement.parentNode.id;
				var id=ui.item.context.children[0].value;
				var taskType = ui.item.context.children[0].attributes.taskType.value;
				if(taskType=='6'){
					alert("流程任务不可移动");
					queryTask1('all');
					queryToDoTask('all');
					queryFinishTask('all');
				}else{
					$.ajax({
						url:'sysTask/moveSysTask.action?sysTaskId='+id+'&parentUlId='+parentUlId,
						type:'post',
						//data: JSON.stringify(_param),
						cache: false,
						async: false,
						contentType: 'application/json;charset=utf-8',
						success: function (text) {
							queryTask1('all');
						}
					});
				}
			}); 

        });
		
		function queryTask1(types){
			$.ajax({
				url:'sysTask/querySysTask1.action?types='+types,
				type:'post',
				//data: JSON.stringify(_param),
				cache: false,
				async: true,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					
					var liListHtml='';
					for(var i=0;i<text.length;i++){
						var time = "";
						time = new Date(text[i].sysTaskCreateTime).Format("yyyy-MM-dd hh:mm:ss");
						var sysTaskUrgencyHtml='';
						if(text[i].sysTaskUrgency=='1'){
							sysTaskUrgencyHtml="danger-element";
						}else if(text[i].sysTaskUrgency=='2'){
							sysTaskUrgencyHtml="warning-element";
						}else{
							sysTaskUrgencyHtml="success-element";
						}
						var approveHtml='';
						if(text[i].procTaskId!=null && text[i].procTaskId!=''){
							var obj = text[i];
							approveHtml='        <a href="javascript:void(0);" onclick ="approveProcess(this)" procFormId="'+obj.procFormId+'" procTaskId="'+obj.procTaskId+'" procInsId="'+obj.procInsId+'" procBusinessId="'+obj.procBusinessId+'" class="pull-right btn btn-xs btn-primary">审批</a>';
						}
						var openFormHtml='';
						if(text[i].sysTaskFormid!=null && text[i].sysTaskFormid!=''){
							var obj = text[i];
							var sysTaskFormid = obj.sysTaskFormid;
							var aa = sysTaskFormid.split(":");
							openFormHtml='        <a href="javascript:void(0);" onclick ="openForm(this)" sysTaskFormid="'+aa[0]+'" formRecorid="'+obj.formRecorid+'" sysTaskContent="'+obj.sysTaskContent+'" sysPkColumn="'+aa[1]+'"  class="pull-right btn btn-xs btn-primary">操作</a>';
						}
						liListHtml+='<li class="'+sysTaskUrgencyHtml+'">'+
								'    <input type="hidden" taskType="'+text[i].sysTaskType+'" value="'+text[i].sysTaskId+'"\>'+
                                '    '+text[i].sysTaskContent+
                                '    <div class="agile-detail">'+
                                '        <a href="#" class="pull-right btn btn-xs btn-white">标签</a>'+
								approveHtml+
								openFormHtml+
                                '        <i class="fa fa-clock-o"></i>'+time+
                                '    </div>'+
                                '</li>';
					}
					$("#allTaskList").html(liListHtml);
				}
			});
		}
		
		function getParam(formId){
			$.ajax({
				url:'sysTask/queryFormWhere.action?formId='+formId,
				type:'post',
				//data: JSON.stringify(_param),
				cache: false,
				async: true,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					return text;
				}
			});
		}
		
		function approveProcess(obj){
			var procformid = obj.attributes.procformid.value;
			var url='/myehr/form/toForm.action?formId='+obj.attributes.procformid.value+'&isInit=true&taskId='+obj.attributes.proctaskid.value+'&procInsId='+obj.attributes.procinsid.value+'&businessId='+obj.attributes.procbusinessid.value;
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
				},
				end:function(){
					queryTask1('all');
					queryToDoTask('all');
					queryFinishTask('all');
				}
			});
		}
		
		function openForm(obj){
			var formId = obj.attributes.sysTaskFormid.value;
			var sysTaskContent = obj.attributes.sysTaskContent.value;
			var pkColumnValue = obj.attributes.sysPkColumn.value;
			var formRecorid = obj.attributes.formRecorid.value;
			var url='/myehr/form/toForm.action?formId='+formId+'&isInit=true&'+pkColumnValue+'='+formRecorid;
			layer.open({
				type: 2,
				title:sysTaskContent,
				shadeClose: true,
				shade: 0.8,
				maxmin:true,
				zIndex:9999,
				area: ['950px', '500px'],
				content: url,
				success:function(layero,index){
				},
				end:function(){
					queryTask1('all');
					queryToDoTask('all');
					queryFinishTask('all');
				}
			});

		}
		
		function queryToDoTask(types){
			$.ajax({
				url:'sysTask/queryToDoTask.action?types='+types,
				type:'post',
				//data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					
					var liListHtml='';
					for(var i=0;i<text.length;i++){
						var time = "";
						time = new Date(text[i].sysTaskCreateTime).Format("yyyy-MM-dd hh:mm:ss");
						var sysTaskUrgencyHtml='';
						if(text[i].sysTaskUrgency=='1'){
							sysTaskUrgencyHtml="danger-element";
						}else if(text[i].sysTaskUrgency=='2'){
							sysTaskUrgencyHtml="warning-element";
						}else{
							sysTaskUrgencyHtml="success-element";
						}
						var approveHtml='';
						if(text[i].procTaskId!=null && text[i].procTaskId!=''){
							var obj = text[i];
							approveHtml='        <a href="javascript:void(0);" onclick ="approveProcess(this)" procFormId="'+obj.procFormId+'" procTaskId="'+obj.procTaskId+'" procInsId="'+obj.procInsId+'" procBusinessId="'+obj.procBusinessId+'" class="pull-right btn btn-xs btn-primary">审批</a>';
						}
						var openFormHtml='';
						if(text[i].sysTaskFormid!=null && text[i].sysTaskFormid!=''){
							var obj = text[i];
							var sysTaskFormid = obj.sysTaskFormid;
							var aa = sysTaskFormid.split(":");
							openFormHtml='        <a href="javascript:void(0);" onclick ="openForm(this)" sysTaskFormid="'+aa[0]+'" formRecorid="'+obj.formRecorid+'" sysTaskContent="'+obj.sysTaskContent+'" sysPkColumn="'+aa[1]+'"  class="pull-right btn btn-xs btn-primary">操作</a>';
						}
						liListHtml+='<li class="'+sysTaskUrgencyHtml+'">'+
								'    <input type="hidden" taskType="'+text[i].sysTaskType+'" value="'+text[i].sysTaskId+'"\>'+
                                '    '+text[i].sysTaskContent+
                                '    <div class="agile-detail">'+
                                '        <a href="#" class="pull-right btn btn-xs btn-white">标签</a>'+
								approveHtml+
								openFormHtml+
                                '        <i class="fa fa-clock-o"></i>'+time+
                                '    </div>'+
                                '</li>';
					}
					$("#toDoTaskList").html(liListHtml);
				}
			});
		}
		function queryFinishTask(types){
			$.ajax({
				url:'sysTask/queryFinishTask.action?types='+types,
				type:'post',
				//data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					
					var liListHtml='';
					for(var i=0;i<text.length;i++){
						var time = "";
						time = new Date(text[i].sysTaskCreateTime).Format("yyyy-MM-dd hh:mm:ss");
						var sysTaskUrgencyHtml='';
						if(text[i].sysTaskUrgency=='1'){
							sysTaskUrgencyHtml="danger-element";
						}else if(text[i].sysTaskUrgency=='2'){
							sysTaskUrgencyHtml="warning-element";
						}else{
							sysTaskUrgencyHtml="success-element";
						}
						liListHtml+='<li class="'+sysTaskUrgencyHtml+'">'+
								'    <input type="hidden" taskType="'+text[i].sysTaskType+'" value="'+text[i].sysTaskId+'"\>'+
                                '    '+text[i].sysTaskContent+
                                '    <div class="agile-detail">'+
                                '        <a href="#" class="pull-right btn btn-xs btn-white">标签</a>'+
                                '        <i class="fa fa-clock-o"></i>'+time+
                                '    </div>'+
                                '</li>';
					}
					$("#finishTaskList").html(liListHtml);
				}
			});
		}
		
		function test(obj){
            var chks = document.querySelectorAll('input[type="checkbox"]');
            var result = '';
            for (var i = 0; i < chks.length; i++) {
                var chk = chks[i];
				if(chk.checked==true){
					result+=chk.value+',';
				}
            } 
			queryTask1(result);
			queryToDoTask(result);
			queryFinishTask(result);
		}
    </script>

    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->
  </body>
</html>
