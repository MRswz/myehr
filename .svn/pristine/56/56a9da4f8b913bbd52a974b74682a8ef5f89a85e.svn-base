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
    <%-- <%@include file="/portal/portalcommon.jsp"%> --%>
    
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
  
	<body id="mainContent" style="width:1600px;height:700px;">
  		<input type="button" class="btn btn-primary" style="margin-left:20px" value="初始化" id="initButton" onclick="init()"/>
  		<input type="button" class="btn btn-primary" style="margin-left:20px" value="清空本月" id="initButton" onclick="deleteThisMonth()"/>
		<div class="ibox-content" id="calendar">
        </div>
        <div class="content" id="updateWork" style="background:#FFF;border-radius:3px;border:1px solid #ccc;height:100px;width:200px; position:absolute;right:700px;top:150px;display:none;z-index:998">
            <div>
	            <input type="radio" name="rest" value="1" title="休息日"/>休息日
	            <input type="radio" name="rest" value="2" title="节假日"/>节假日
	            <input type="radio" name="rest" value="0" title="删除"/>删除
            </div>
            <input type="button" class="btn-xs btn-primary" style="margin-left:20px" value="选择" onclick="save1()">
            <input type="button" class="btn-xs btn-primary" value="取消"  onclick="closex()">
        </div>
	</body>
  
<script type="text/javascript">
	var date = new Date();
    var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();
	var userId=<%=userid%>;
	
	var zoneid = getUrlParam("azId");
	
	var width=window.screen.width;
	document.getElementById("mainContent").style.width=width + "px";
	
	var startDay;
	var selectStart;
	var selectEnd;
	var selectAllDay;

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
	        $.ajax({
	            url: '${pageContext.request.contextPath }/calendar/queryWorkDayNew.action?zoneid='+zoneid,
	            type: 'POST',
		        cache: false,
		        contentType: 'application/json;charset=utf-8',
	            success: function(json) { // 获取当前月的数据
	            	calendar.fullCalendar('removeEvents');
	                var events = [];
                	for(var i=0;i<json.length;i++){
                		var date = new Date(json[i].term).Format("yyyy-MM-dd hh:mm:ss");
						var id = new Date(json[i].term).Format("yyyy-MM-dd");
						var title = '';
						if(json[i].xtype==1){
							title='休息日';
						}else if(json[i].xtype==2){
							title='节假日';
						}else{
							title='工作日';
						}
						events.push({
							id:id,
							title: title,
							start: date
                        });
                	}
	                callback(events);
	            }
	        });
	    }/* ,
	    eventClick: function(event, element) {
	        event.title = "CLICKED!";
	        $('#calendar').fullCalendar('updateEvent', event);
	    } */
	});
	
	function selectThisDay(obj){
		alert(obj);
	}

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
			
			$.ajax({
	            url: '${pageContext.request.contextPath }/calendar/addWorkDayNew.action',
	            data: "zoneid=" + zoneid + "&xtype=" + title+ "&itemDate=" + thisday,
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
	            url: '${pageContext.request.contextPath }/calendar/InitRestCalendarNew.action',
	            data: "zoneid=" + zoneid + "&itemDate=" + datetime,
		        cache: false,
		        contentType: 'application/json;charset=utf-8',
	            success: function(json) { // 获取当前月的数据
	            	alert("初始本月日历成功！");
	            	location.reload();
	            }
	    });
	}
	
	function deleteThisMonth(){
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
	            url: '${pageContext.request.contextPath }/calendar/ClearRestCalendarNew.action',
	            data: "zoneid=" + zoneid + "&itemDate=" + datetime,
		        cache: false,
		        contentType: 'application/json;charset=utf-8',
	            success: function(json) { // 获取当前月的数据
	            	alert("本月清空成功！");
	            	location.reload();
	            }
	    });
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
