<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  	<head>
	<%
		HttpSession s = request.getSession();
    	Integer userid=(Integer)session.getAttribute("userid");
	%>
    
    <title>My JSP 'calendar.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <link rel="stylesheet" href="css/fullcalendar/bootstrap.min.css" type="text/css"></link>
  <link rel="stylesheet" href="css/fullcalendar/font-awesome.css" type="text/css"></link> 
  <link rel="stylesheet" href="css/fullcalendar/custom.css" type="text/css"></link>
  <link rel="stylesheet" href="css/fullcalendar/fullcalendar.css" type="text/css"></link>
  <link rel="stylesheet" href="css/fullcalendar/fullcalendar.print.css" type="text/css"></link>
  <link rel="stylesheet" href="css/fullcalendar/animate.css" type="text/css"></link>
  <link rel="stylesheet" href="css/fullcalendar/style.css" type="text/css"></link>
  
  <script type="text/javascript" src="js/fullcalendar/jquery.min.js"></script>
  <script type="text/javascript" src="js/fullcalendar/bootstrap.min.js"></script>
  <script type="text/javascript" src="js/fullcalendar/content.js"></script>
  <script type="text/javascript" src="js/fullcalendar/jquery-ui.custom.min.js"></script>
  <script type="text/javascript" src="js/fullcalendar/icheck.min.js"></script>
  <script type="text/javascript" src="js/fullcalendar/fullcalendar.min.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/js/date-format.js"></script>
  	<style type="text/css">
  		#calendar{
  			width:1000px;
  			height:700px;  	
  			margin: 0 auto;
  		}
  	
  	
  	</style>
  
	<body style="width:1600px;height:700px;">
  		<input type="button" value="初始化" id="initButton" onclick="init()"/>
		<div class="ibox-content" id="calendar">
        </div>
        <div id="updateWork" style="border:1px solid red;height:100px;width:200px; position:absolute;right:100px;top:150px;text-align:center;display:none;">
            <input type="text" id="title"/>
            <input type="hidden" id="thisDay"/>
            <input type="button" value="保存" id="saveButton" onclick="save()"/>
        </div>
	</body>
  
<script type="text/javascript">
	var date = new Date();
    var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();
	var userId=<%=userid%>;
	
	var startDay;

	var calendar = $('#calendar').fullCalendar({
		header: {
			left: 'prev,next',
			center: 'title',
			right: 'month,agendaWeek,agendaDay'
		},
		lang: 'zh-cn',
		buttonIcons: false, // show the prev/next text
		weekMode: 'liquid',
		editable: true,
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
		/* dayClick: function(date, allDay, jsEvent, view) {
			document.getElementById("updateWork").style.display="block";
			
			var da=formatDate(date);
			//var dat=parserDate(da);
			document.getElementById("thisDay").value=da;
		}, */
		/* events: [
            {
                id: 1,
                title: '这是一个all-day数据',
                allDay: true,
                start: '2016-08-11'
            },
            {
                id: 2,
                title: '开始时间为12PM',
                start: '2017-04-04 12:00'
            },
            {
                id: 3,
                title: '给一点颜色',
                start: '2017-04-01',
                color: 'red'
            },
            {
                id: 4,
                title: '使用className:done',
                start: '2017-04-10 09:00',
                end: '2017-04-11 18:00',
                color: 'blue',
                className: 'done'
            },
            {
                id: 5,
                title: '使用className:doing',
                start: '2017-04-13 09:00',
                end: '2017-04-14 18:00',
                color: 'green',
                className: 'doing'
            },
            {
                id: 6,
                title: '使用URL和字体颜色',
                start: '2017-04-11',
                color: 'pink',
                url: 'http://flovel.xyz',
                className: 'doing',
                textColor: 'black'
            },
            {
                id: 7,
                title: '使用backgroundColor和borderColor',
                start: '2017-04-11 09:00',
                end: '2017-04-12 18:00',
                backgroundColor: 'gray',
                borderColor: 'red',
                className: 'done'
            },

        ] */
        selectHelper: true,
        select: function(start, end, allDay) {
			var title = prompt('Title:');
			if (title) {
				calendar.fullCalendar('renderEvent',
					{
						title: title,
						start: start,
						end: end,
						allDay: allDay
					},
					true 
				);
				var thisday=formatDate(start);
				$.ajax({
		            url: '${pageContext.request.contextPath }/calendar/save.action',
		            dataType: 'JSON',
		            data: "title=" + title + "&datetime=" + thisday,
		            success: function(json) { // 获取当前月的数据
		            	
		            }
		        });
			}
			calendar.fullCalendar('unselect');
		},
		events: function(start,end,callback) {
	        startDay=FormatDate(start);
	        FormatDate(end);
	        $.ajax({
	            url: '${pageContext.request.contextPath }/calendar/search.action',
	            dataType: 'JSON',
	            data: JSON.stringify(calendar),
	            success: function(json) { // 获取当前月的数据
	                var events = [];
	                	for(var i=0;i<json.length;i++){
	                		var date = new Date(json[i].datetime).Format("yyyy-MM-dd hh:mm:ss");
							events.push({
								title: json[i].title,
								start: date// will be parsed
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
	            url: '${pageContext.request.contextPath }/calendar/save.action',
	            dataType: 'JSON',
	            data: "title=" + title + "&datetime=" + thisday,
	            success: function(json) { // 获取当前月的数据
	            	document.getElementById("updateWork").style.display="none";
	                location.reload();
	            }
	        });
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
		//alert(datetime);
		$.ajax({
	            url: '${pageContext.request.contextPath }/calendar/init.action',
	            dataType: 'JSON',
	            data: "datetime=" + datetime,
	            success: function(json) { // 获取当前月的数据
	            	alert("初始当月日历成功！");
	            	location.reload();
	            }
	    });
	}	 
  
	</script>
  
  
  		
</html>
