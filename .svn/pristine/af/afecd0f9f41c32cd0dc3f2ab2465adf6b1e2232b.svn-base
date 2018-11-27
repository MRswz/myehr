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
  <script type="text/javascript" src="${pageContext.request.contextPath }/common/js/layer/layer.js"></script>
  <style type="text/css">
  		#calendar{
  			width:1000px;
  			height:700px;  	
  		}
  	
  </style>
  
	<body id="mainContent" style="width:1600px;height:1000px;">
  		<input type="button" class="btn btn-primary" style="margin:10px 0px 10px 20px" value="选择休息日历"   onclick="selectCalClass()">
  		<input type="button" id="saveButton" class="btn btn-primary" style="margin:10px 0px 10px 20px" value="保存"   onclick="startWork()">
  		<input type="button" class="btn btn-primary" style="margin:10px 0px 10px 20px" value="清空排班"   onclick="clearCalClass()">
		<div class="ibox-content" id="calendar">
        </div>
        <div class="content" id="updateWork" style="background:#FFF;border-radius:3px;border:1px solid #ccc;width:600px; position:absolute;right:500px;top:150px;display:none;z-index:998;">
            <div class="content" id="updateWork1" style="margin-left:20px;margin-top:20px;">
            </div>
            <br>
            <br>
            <div class="content" id="buttons" style="margin-left:20px;margin-bottom:20px;">
            	<input type="button" class="btn-xs btn-primary" value="选择"  onclick="save()">
            	<input type="button" class="btn-xs btn-primary" value="取消"  onclick="closex()">
            </div>
           
        </div>
        <div class="content" id="selectCalClass" style="background:#FFF;border-radius:3px;border:1px solid #ccc;position:absolute;left:5px;top:50px;display:none;z-index:999">
        	<div class="content" id="selectCalClass1">
            </div>
        	<input type="button" class="btn-xs btn-primary" value="选择"  onclick="selectCal()">
        </div>
	</body>
  
<script type="text/javascript">
	var empIds = getUrlParam("empIds");
	var empCodes = getUrlParam("empCodes");
	var date = new Date();
    var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();
	var userId=<%=userid%>;
	
	var workdays=new Array();
	var minday;
	var maxday;
	var startDay;
	var selectStart;
	var selectEnd;
	var selectAllDay;
	var kguid;
	
	initItem();
	
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
        selectHelper: true,
        select: function(start, end, allDay) {
        	selectStart=formatDate(start);
        	selectEnd=formatDate(end);
        	selectAllDay=allDay;
        	document.getElementById("updateWork").style.display="";
		},
		events: function(start,end,callback) {
	        startDay=FormatDate(start);
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
		var elm = document.getElementsByName("paiban");
    	var title="";
    	for(var i=0;i<elm.length;i++){
    		if(elm[i].checked){
    			title=elm[i].value;
    			zhtitle= elm[i].title;
    		}
    	}
		//var title = prompt('Title:');
		if (title.length>0) {
			//calendar.fullCalendar('removeEvents', [selectStart]);
			calendar.fullCalendar('renderEvent',
				{	
					id:selectStart,
					title: zhtitle,
					start: selectStart,
					end: selectEnd,
					allDay: selectAllDay
				},
				true 
			);
			var thisday=selectStart;
			var selectdayend=selectEnd;
			if(minday!=null){
				if(parseInt(thisday.substring(thisday.length-2,thisday.length))<parseInt(minday.substring(minday.length-2,minday.length))){
					minday = thisday;
				}
				if(parseInt(selectdayend.substring(selectdayend.length-2,selectdayend.length))>parseInt(maxday.substring(maxday.length-2,maxday.length))){
					maxday = selectdayend;
				}
			}else{
				minday = thisday;
				maxday = selectdayend;
			}
			if(thisday==selectdayend){
				var d={'kguid':kguid,'itemCaption':title,'itemDate':thisday};
				workdays.push(d);
			}else{
				var aaa=thisday.substring(thisday.length-2,thisday.length);
				var bbb=selectdayend.substring(selectdayend.length-2,selectdayend.length);
				var ccc=parseInt(bbb)+1;
				for(var i=aaa;i<ccc;i++){
					var date = parseInt(i);
					if(date<10){
						date = "0"+date;
					}
				    var thisdayselect=thisday.substring(0,thisday.length-2)+date;
					var d={'kguid':kguid,'itemCaption':title,'itemDate':thisdayselect};
					workdays.push(d);
				}
				
			}
			
		}
		document.getElementById("updateWork").style.display="none";
		calendar.fullCalendar('unselect');
	}
	
	function initItem(){
		$.ajax({
            url: '${pageContext.request.contextPath }/calendar/queryItem.action',
            type: 'POST',
	        cache: false,
	        contentType: 'application/json;charset=utf-8',
            success: function(data) { // 获取当前月的数据
            	var html="";
            	var html1="";
            	html1+="<div>"+data[1].parentCode+"：";
            	html1+="<table style=\"font-family:verdana,arial,sans-serif;font-size:11px;color:#333333;border-width: 1px;border-color: #999999;border-collapse: collapse;\"><tr>";
            	html1+="<td style=\"width:70px;border-width:1px;padding:8px;border-style:solid;border-color:#999999;\"><input type=\"radio\" name=\"paiban\" value=\""+data[0].itemName+"\" title=\""+data[0].itemName+"\"/>"+data[0].itemName+"</td>";
            	//html1+="<input type=\"radio\" name=\"paiban\" value=\""+data[1].itemName+"\" title=\""+data[1].itemName+"\"/>"+data[1].itemName;
            	var aaa=1;
            	for(var i=0;i<data.length-1;i++){
            		aaa++;
            		if(data[i].parentCode==data[i+1].parentCode){
            			if(aaa%6==0){
            				html1+="<td style=\"width:80px;border-width:1px;padding:8px;border-style:solid;border-color:#999999;\"><input type=\"radio\" name=\"paiban\" value=\""+data[i+1].itemName+"\" title=\""+data[i+1].itemName+"\"/>"+data[i+1].itemName+"</td>";
            				html1+="</tr><tr>";
            			}else{
            				html1+="<td style=\"width:80px;border-width:1px;padding:8px;border-style:solid;border-color:#999999;\"><input type=\"radio\" name=\"paiban\" value=\""+data[i+1].itemName+"\" title=\""+data[i+1].itemName+"\"/>"+data[i+1].itemName+"</td>";
            			}
            			
            			//html1+="<input type=\"radio\" name=\"paiban\" value=\""+data[i+1].itemName+"\" title=\""+data[i+1].itemName+"\"/>"+data[i+1].itemName;
            		}else{
            			aaa=1;
            			html1+="</tr>";
            			html1+="</table>";
            			html1+="</div>";
            			html1+="<br>";
            			html1+="<div>"+data[i+1].parentCode+"：";
            			html1+="<table style=\"font-family:verdana,arial,sans-serif;font-size:11px;color:#333333;border-width: 1px;border-color: #999999;border-collapse: collapse;\">";
            			html1+="<tr>";
            			//html1+="<input type=\"radio\" name=\"paiban\" value=\""+data[i+1].itemName+"\" title=\""+data[i+1].itemCode+"\"/>"+data[i+1].itemName;
            			html1+="<td style=\"width:80px;border-width:1px;padding:8px;border-style:solid;border-color:#999999;\"><input type=\"radio\" name=\"paiban\" value=\""+data[i+1].itemName+"\" title=\""+data[i+1].itemName+"\"/>"+data[i+1].itemName+"</td>";      			
            		}
            	}
            	html1+="</div>";
            	$("#updateWork1").html(html1);
            }
        });
	}
	
	function selectCalClass(){
		var strs= startDay.split("-");
		var thisstartyear =strs[0];
		var thisstartmonth =strs[1];
		$.ajax({
            url: '${pageContext.request.contextPath }/calendar/queryCalClass.action',
            type: 'POST',
	        cache: false,
	        contentType: 'application/json;charset=utf-8',
            success: function(data) { // 获取当前月的数据
				var html="";
				for(var i=0;i<data.length;i++){
					html+="<input type=\"radio\" style=\"margin:2px 10px\" name=\"calClass\" value=\""+data[i].kguid+"\" title=\""+data[i].itemName+"\"/>"+data[i].itemName+"&nbsp&nbsp<br>";
				}
				$("#selectCalClass1").html(html);
				document.getElementById("selectCalClass").style.display="";
            }
        });
	}
	
	function clearCalClass(){
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
		for(var i=1;i<10;i++){
			var aaa=datetime+"-0"+i;
			calendar.fullCalendar('removeEvents', [aaa]);
		}
		for(var i=10;i<31;i++){
			var aaa=datetime+"-"+i;
			calendar.fullCalendar('removeEvents', [aaa]);
		}
		workdays.length = 0;
	}
	
	function startWork(){
		if(workdays.length==0){
			alert("请选择班次信息");
			return;
		}
		$("#saveButton").attr("onclick","");
		var _param={};
		_param.workdays=workdays;
		_param.empIds=empIds;
		_param.empCodes=empCodes;
		_param.kguid=kguid;
		var indey=layer.load(2);
		$.ajax({
			url: '${pageContext.request.contextPath }/calendar/saveEmpWorkday.action?startDay='+minday+'&endDay='+maxday,
			type: 'POST',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function(json) { // 获取当前月的数据
				closex();
	        	if(json.reCode="2"){
	        		alert("排班成功");
					$("#saveButton").attr("onclick","startWork()");
	        		layer.close(indey);
	        	}
			}
		});
	}
	
	function selectCal(){
		var strs= startDay.split("-");
		var thisstartyear =strs[0];
		var thisstartmonth =strs[1];
		var thisstartday =strs[2];
		if(thisstartday!=1){
			thisstartmonth=parseInt(thisstartmonth)+1;
		}
		var datemonth;
		if(thisstartmonth<10){
			datemonth=thisstartyear+"-0"+thisstartmonth;
		}else{
			datemonth=thisstartyear+"-"+thisstartmonth;
		}
		var elm = document.getElementsByName("calClass");
    	for(var i=0;i<elm.length;i++){
    		if(elm[i].checked){
    			kguid=elm[i].value;
    			document.getElementById("selectCalClass").style.display="none";
    		}
    	}
    	$.ajax({
	            url: '${pageContext.request.contextPath }/calendar/queryWorkDay.action?kguid='+kguid+'&datemonth='+datemonth,
	            type: 'POST',
		        cache: false,
		        contentType: 'application/json;charset=utf-8',
	            success: function(json) { // 获取当前月的数据
	            	calendar.fullCalendar('removeEvents');
                	for(var i=0;i<json.length;i++){
                		var date = new Date(json[i].itemDate).Format("yyyy-MM-dd hh:mm:ss");
						var id = new Date(json[i].itemDate).Format("yyyy-MM-dd");
						
                        calendar.fullCalendar('renderEvent',
							{	
								id:id,
								title: json[i].itemCaption,
								start: date,
								end: date,
								allDay: id
							},
							true 
						);
                	}
	            }
	        });
	}
	
	function closex(){
		document.getElementById("updateWork").style.display="none";
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
