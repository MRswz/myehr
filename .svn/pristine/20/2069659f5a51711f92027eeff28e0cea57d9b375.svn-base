<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil"  pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>任务日历</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="shortcut icon" href="favicon.ico"> <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/plugins/iCheck/custom.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/plugins/fullcalendar/fullcalendar.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/plugins/fullcalendar/fullcalendar.print.css" rel="stylesheet">

    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/jsp/task/taskManage/css/style.css?v=4.1.0" rel="stylesheet">

  </head>
  
  <body class="gray-bg">
    <div class="wrapper wrapper-content">
        <div class="row animated fadeInDown">
            <div class="col-sm-3">
                <div class="ibox float-e-margins" style="height:50%;">
                    <div class="ibox-title">
                        <h5>任务列表</h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="dropdown-toggle" data-toggle="dropdown" href="calendar.html#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="calendar.html#">选项1</a>
                                </li>
                                <li><a href="calendar.html#">选项2</a>
                                </li>
                            </ul>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content"  style="height:80%;overflow-y:auto;padding-top:5px;">
                        <div id='external-events'>
                        </div>
                    </div>
                </div>
				<div class="ibox float-e-margins">
                    <div class="ibox-content">
                       <div id='events-type'>
                            <p>任务分类</p>
                            <div class='taskType'><div class='circle' style="background:#1ab395;"></div>会议</div>
                            <div class='taskType'><div class='circle' style="background:#ee5464;"></div>例行</div>
                            <div class='taskType'><div class='circle' style="background:#3e7cbc;"></div>额外</div>
                            <div class='taskType'><div class='circle' style="background:#4ebed2;"></div>面试</div>
							<div class='taskType'><div class='circle' style="background:#f8af5d;"></div>客户</div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-9">
                <div class="ibox float-e-margins">
                    <div class="ibox-title">
                        <h5>任务日历 </h5>
                        <div class="ibox-tools">
                            <a class="collapse-link">
                                <i class="fa fa-chevron-up"></i>
                            </a>
                            <a class="dropdown-toggle" data-toggle="dropdown" href="calendar.html#">
                                <i class="fa fa-wrench"></i>
                            </a>
                            <ul class="dropdown-menu dropdown-user">
                                <li><a href="calendar.html#">选项1</a>
                                </li>
                                <li><a href="calendar.html#">选项2</a>
                                </li>
                            </ul>
                            <a class="close-link">
                                <i class="fa fa-times"></i>
                            </a>
                        </div>
                    </div>
                    <div class="ibox-content" style="height:80%;overflow-y:auto;padding-top:5px;">
                        <div id="calendar"></div>
						</div>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!-- 全局js -->
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/jquery.min.js?v=2.1.4"></script>
	<script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/jquery-ui-1.10.4.min.js"></script>
	<script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/jquery-ui.custom.min.js"></script>
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/bootstrap.min.js?v=3.3.6"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/date-format.js"></script>



    <!-- 自定义js -->
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/content.js?v=1.0.0"></script>


    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/jquery-ui.custom.min.js"></script>

    <!-- iCheck -->
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/plugins/iCheck/icheck.min.js"></script>

    <!-- Full Calendar -->
    <script src="${pageContext.request.contextPath }/jsp/task/taskManage/js/plugins/fullcalendar/fullcalendar.min.js"></script>
	

    <script>
        $(document).ready(function () {
			initTask();

            $('.i-checks').iCheck({
                checkboxClass: 'icheckbox_square-green',
                radioClass: 'iradio_square-green',
            });

            /* initialize the external events
             -----------------------------------------------------------------*/

            $('#external-events div.external-event').each(function () {

                // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
                // it doesn't need to have a start or end
                var eventObject = {
                    title: $.trim($(this).text()) // use the element's text as the event title
                };

                // store the Event Object in the DOM element so we can get to it later
                $(this).data('eventObject', eventObject);

                // make the event draggable using jQuery UI
                $(this).draggable({
                    zIndex: 999,
                    revert: true, // will cause the event to go back to its
                    revertDuration: 0 //  original position after the drag
                });

            });


            /* initialize the calendar
             -----------------------------------------------------------------*/
            var date = new Date();
            var d = date.getDate();
            var m = date.getMonth();
            var y = date.getFullYear();

            var calendar = $('#calendar').fullCalendar({
                header: {
                    left: 'prev,next',
                    center: 'title',
                    right: 'month,agendaWeek,agendaDay'
                },
				defaultView: 'agendaWeek',
				axisFormat:'HH:mm',
				timeFormat: 'yyyy-MM-dd  HH:mm{ -yyyy-MM-dd  HH:mm}',
                editable: true,
				selectable: true,
                droppable: true, // this allows things to be dropped onto the calendar !!!
                drop: function (date, allDay) { // this function is called when something is dropped

                    // retrieve the dropped element's stored Event Object
                    var originalEventObject = $(this).data('eventObject');
					var sysTaskId = this.children[0].value;
					var borderColor = this.style.background;
					var sysTaskCalenderDate = FormatDate(date);

                    // we need to copy it, so that multiple events don't have a reference to the same object
                    var copiedEventObject = $.extend({}, originalEventObject);

                    // assign it the date that was reported
                    copiedEventObject.start = date;
                    copiedEventObject.allDay = allDay;
					copiedEventObject.borderColor = borderColor;
					

                    // render the event on the calendar
                    // the last `true` argument determines if the event "sticks" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)
                    $('#calendar').fullCalendar('renderEvent', copiedEventObject, true);

                    // is the "remove after drop" checkbox checked?
                    if ($('#drop-remove').is(':checked')) {
                        // if so, remove the element from the "Draggable Events" list
                        $(this).remove();
                    }
					
					$.ajax({
						url:'sysTask/addSysTaskCalender.action?sysTaskId='+sysTaskId+'&sysTaskCalenderDate='+sysTaskCalenderDate,
						type:'post',
						//data: JSON.stringify(_param),
						cache: false,
						async: false,
						contentType: 'application/json;charset=utf-8',
						success: function (text) {
						}
					});

                },
				//拖动事件   
				eventDrop: function(event,dayDelta,minuteDelta,allDay,revertFunc) {
					var sysTaskId=event.id;
					var sysTaskCalenderDate=FormatDate(event.start);
					$.ajax({
						url:'sysTask/addSysTaskCalender.action?sysTaskId='+sysTaskId+'&sysTaskCalenderDate='+sysTaskCalenderDate,
						type:'post',
						//data: JSON.stringify(_param),
						cache: false,
						async: false,
						contentType: 'application/json;charset=utf-8',
						success: function (text) {
						}
					});
				},  
				selectHelper: true,
				select: function(start, end, allDay) {
					var sysTaskCalenderStart = start.Format("yyyy-MM-dd hh:mm:ss");
					var sysTaskCalenderEnd = end.Format("yyyy-MM-dd hh:mm:ss");
					var url = '/myehr/jsp/task/addTask/editTask.jsp?sysTaskCalenderStart='+sysTaskCalenderStart+'&sysTaskCalenderEnd='+sysTaskCalenderEnd;
					layer.open({
						type: 2,
						title:'增加任务',
						shadeClose: true,
						shade: 0.8,
						maxmin:true,
						zIndex:9999,
						area: ['450px', '700px'],
						content: url,
						success:function(layero,index){
						$('.layui-layer-max').click();
						},
						end:function(){
							calendar.fullCalendar('refetchEvents');
						}
					});
					return false;
				},
				eventClick: function(calEvent, jsEvent, view) {
					var url = '/myehr/jsp/task/addTask/editTask.jsp?sysTaskId='+calEvent.id;
					layer.open({
						type: 2,
						title:'编辑任务',
						shadeClose: true,
						shade: 0.8,
						maxmin:true,
						zIndex:9999,
						area: ['450px', '700px'],
						content: url,
						success:function(layero,index){
						$('.layui-layer-max').click();
						},
						end:function(){
							calendar.fullCalendar('refetchEvents');
						}
					});
				},
                events: function(start,end,callback) {
					startDay=FormatDate(start);
					FormatDate(end);
					$.ajax({
						url: '${pageContext.request.contextPath }/sysTask/querySysTask1.action',
						type: 'POST',
						cache: false,
						contentType: 'application/json;charset=utf-8',
						success: function(json) { // 获取当前月的数据
							calendar.fullCalendar('removeEvents');
							var events = [];
							for(var i=0;i<json.length;i++){
								var startDate = new Date(json[i].sysTaskCalenderStart).Format("yyyy-MM-dd hh:mm:ss");
								var endDate;
								var allDay;
								if(json[i].sysTaskCalenderEnd!=null){
									endDate = new Date(json[i].sysTaskCalenderEnd).Format("yyyy-MM-dd hh:mm:ss");
									if(startDate==endDate){
										allDay = true;
									}else{
										allDay = false;
									}
								}else{
									endDate = new Date(json[i].sysTaskCalenderStart).Format("yyyy-MM-dd hh:mm:ss");
									allDay = true;
								}
								
								var id = json[i].sysTaskId;
								var title = json[i].sysTaskContent;
								var borderColor = '';
								if(json[i].sysTaskType=='1'){
									borderColor="#1ab395";
								}else if(json[i].sysTaskType=='2'){
									borderColor="#ee5464";
								}else if(json[i].sysTaskType=='3'){
									borderColor="#3e7cbc";
								}else if(json[i].sysTaskType=='4'){
									borderColor="#4ebed2";
								}else if(json[i].sysTaskType=='5'){
									borderColor="#f8af5d";
								}
								
								events.push({
									id:id,
									title: title,
									start: startDate,
									end:endDate,
									allDay:allDay,
									color:borderColor
								});
							}
							callback(events);
						}
					});
				}
            });
        });
		
		function initTask(){
			$.ajax({
				url:'sysTask/querySysTaskWithoutCalender.action',
				type:'post',
				//data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					var liListHtml='';
					for(var i=0;i<text.length;i++){
						var backgroundStyle="";
						if(text[i].sysTaskType=='1'){
							backgroundStyle="background:#1ab395;";
						}else if(text[i].sysTaskType=='2'){
							backgroundStyle="background:#ee5464;";
						}else if(text[i].sysTaskType=='3'){
							backgroundStyle="background:#3e7cbc;";
						}else if(text[i].sysTaskType=='4'){
							backgroundStyle="background:#4ebed2;";
						}else if(text[i].sysTaskType=='5'){
							backgroundStyle="background:#f8af5d;";
						}
						liListHtml+='<div class=\'external-event navy-bg\' style="'+backgroundStyle+'"><input type="hidden" value="'+text[i].sysTaskId+'"\>'+text[i].sysTaskContent+'</div>';
					}
					liListHtml+='<p class="m-t">'+
                                '    <input type=\'checkbox\' id=\'drop-remove\' class="i-checks" checked />'+
                                '    <label for=\'drop-remove\'>移动后删除</label>'+
                                '</p>';
					$("#external-events").html(liListHtml);
				}
			});
		}
		
		function FormatDate (strTime) {
			var date = new Date(strTime);
			return date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
		}
		
		
    </script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
    <!--统计代码，可删除-->
  </body>
</html>
