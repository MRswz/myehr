<%@page import="java.math.BigDecimal"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  	<head>
	<%
		HttpSession s = request.getSession();
    	BigDecimal userid=(BigDecimal)session.getAttribute("userid");
	%>
    
    <title>排班信息</title>
    <%@include file="/common/common.jsp"%>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/bootstrap.min.css" type="text/css"></link>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/font-awesome.css" type="text/css"></link> 
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/custom.css" type="text/css"></link>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/fullcalendar.css" type="text/css"></link>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/fullcalendar.print.css" type="text/css"></link>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/animate.css" type="text/css"></link>
  <link rel="stylesheet" href="<%= request.getContextPath() %>/js/fullcalendar/style.css" type="text/css"></link>
  
  <script src="<%= request.getContextPath() %>/js/fullcalendar/jquery.min.js" type="text/javascript"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/bootstrap.min.js" type="text/javascript"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/content.js" type="text/javascript"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/jquery-ui.custom.min.js" type="text/javascript"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/fullcalendar.min.js" type="text/javascript"></script>
  <script src="<%= request.getContextPath() %>/js/fullcalendar/date-format.js" type="text/javascript"></script>
  <style type="text/css">
  		#calendar{
  			width:1000px;
  			height:700px;  	
  		}
  	
  </style>
  
	<body id="mainContent" style="width:1600px;height:1000px;">
		<div class="ibox-content" id="calendar">
        </div>
        <div class="content" id="updateWork" style="background:#FFF;border-radius:3px;border:1px solid #ccc;width:600px; position:absolute;right:500px;top:150px;display:none;z-index:998;">
        </div>
	</body>
  
<script type="text/javascript">
	var A0190 = getUrlParam("A01_A0190");
	
	var width=window.screen.width;
	document.getElementById("mainContent").style.width=width*0.8 + "px";
	document.getElementById("updateWork").style.width=width*0.8*0.4 + "px";
	document.getElementById("updateWork").style.right=width*0.8*0.3 + "px";

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
		events: function(start,end,callback) {
	        startDay=formatDate(start);
	        end=formatDate(end);
	        $.ajax({
	            url: '${pageContext.request.contextPath }/calendar/queryEmpWorkDay.action?K15A1090='+A0190,
	            type: 'POST',
		        cache: false,
		        contentType: 'application/json;charset=utf-8',
	            success: function(json) { // 获取当前月的数据
	                var events = [];
	                	for(var i=0;i<json.length;i++){
	                		var date = new Date(json[i].d9999).Format("yyyy-MM-dd hh:mm:ss");
							var id = new Date(json[i].d9999).Format("yyyy-MM-dd");
							events.push({
								id:id,
								title: json[i].k1500,
								start: date
	                        });
	                	}
	                callback(events);
	            }
	        });
	    }
	});

	function formatDate(date){
		var y = date.getFullYear();  
		var m = date.getMonth() + 1;  
		m = m < 10 ? '0' + m : m;  
		var d = date.getDate();  
		d = d < 10 ? ('0' + d) : d;  
		var formatDate = y + '-' + m + '-' + d;  
		return formatDate;
	}
	
	function GetQueryString(name)
	{
	     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
	     var r = window.location.search.substr(1).match(reg);
	     if(r!=null)return  unescape(r[2]); return null;
	}
	
	function getUrlParam(key){
    	// 获取参数
	    var url = window.location.search;
	    // 正则筛选地址栏
	    var reg = new RegExp("(^|&)"+ key +"=([^&]*)(&|$)");
	    // 匹配目标参数
	    var result = url.substr(1).match(reg);
	    //返回参数值
	    return result ? decodeURIComponent(result[2]) : null;
	}
  
	</script>
  
  
  		
</html>
