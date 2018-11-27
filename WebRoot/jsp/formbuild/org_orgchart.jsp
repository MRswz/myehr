<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/common.jsp"%>
<%
 String ORGVORGANIZATION_ID = request.getParameter("ORGVORGANIZATION_ID");
%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>组织机构图</title>
</head>
<body style="height:670px;">
 <input type="hidden" name="ORGVORGANIZATION_ID" id="ORGVORGANIZATION_ID" value="<%=ORGVORGANIZATION_ID%>"/>
<input type="hidden" value="查询" onclick="buildOrgPicture()"/>
<div style="margin:10px 0 0 10px;"><select onchange="changeChartType(this)">
<option value ="eCharts">eCharts图表</option>
<option value ="orgChart">orgChart图表</option>
</select></div>
<div style="height:95%;width:98%;float:left" id="chart-container"></div>
<div style="height:95%;width:98%;float:left" id="chart-eChart"></div>
<input type="hidden" name="basePath" id="basePath" value="<%= request.getContextPath() %>"/>
</body>
</html>
<script type="text/javascript">
$(function() {
    document.getElementById("chart-container").style.display='none';
 
buildOrgPicture();

});
  function initExecSqlFun(){
var paramsMap = { ORGVORGANIZATION_ID:'${param.ORGVORGANIZATION_ID}'};
var _param = {};
_param.formId=3108;
_param.paramsMap = paramsMap
$.ajax({
	url:'/myehr/form/initExecSql.action',
	type:'post',
	data: JSON.stringify(_param),
	cache: false,
	contentType: 'application/json;charset=utf-8',
	success: function (text) {
	    buildOrgPicture();
	}
});
}
function buildOrgPicture(){
     var ORGVORGANIZATION_ID = document.getElementById("ORGVORGANIZATION_ID").value;
    var basePath = document.getElementById("basePath").value;
    $.ajax({
        url: basePath+"/org/searchTreeData.action?formId=3108&treeSolutionId="+42 +"&ORGVORGANIZATION_ID="+ORGVORGANIZATION_ID,
        type: 'POST',
        cache: false,
        contentType: 'application/json;charset=utf-8',
        success: function(mydata) {
        	  initOrgPicture(mydata);
        	  var total = mydata.total*2;
              document.getElementById("chart-eChart").style.height=total+'%';
        	  initCharts(mydata);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            alert(jqXHR.responseText);
        }
    });
}
function initOrgPicture(mydata){
    var datascource =mydata;
    $('#chart-container').orgchart({
        'data' : datascource,
        'depth': 2,
        'nodeTitle': 'ORGVORGANIZATION_cname',
        'nodeContent': 'ORGVORGANIZATION_ENAME',
        'exportButton': true,
        'exportFilename': 'MyOrgChart',
        'createNode': function($node, data) {
            var secondMenuIcon = $('<i>', {
                'class': 'fa fa-info-circle second-menu-icon',
                click: function() {
                    $(this).siblings('.second-menu').toggle();
                }
            });
            var secondMenu = '';
            if(data.类型=="人员"){
                secondMenu = '<div class="second-menu"><img class="avatar" src="./img/avatar/'+0+'.jpg"></div>'; 
            }
            $node.append(secondMenuIcon).append(secondMenu);
        }
    });
}
function initCharts(mydata){
    var datascource =mydata;
    var myChart = echarts.init(document.getElementById('chart-eChart'));
    var series = {
        type: 'tree',
        name: '行政架构图',
        data: [datascource],
        top: '2%',
        left: '10%',
        bottom: '2%',
        right: '10%',
        symbolSize: 7,
        dataZoom: {
            show: true,
            realtime: true,
            y: 36,
            height: 20,
            start: 20,
            end: 80,
        },
        label: {
            normal: {
                position: 'left',
                verticalAlign: 'middle',
                align: 'right'
            }
        },
        leaves: {
            label: {
                normal: {
                    position: 'right',
                    verticalAlign: 'middle',
                    align: 'left'
                }
            }
        },
        expandAndCollapse: true,
        animationDuration: 550,
        animationDurationUpdate: 750
     },
    options = {
     	tooltip: {
	        trigger: 'item',
	        triggerOn: 'mousemove'
	    },
	    toolbox: {
	    	show: true,
	    	feature: {
	    		restore: {},
	    		saveAsImage: {}
	    	}
	    },
	    legend: {
	        top: '2%',
	        left: '3%',
	        orient: 'vertical',
	        data: [{
	            name: '行政架构图',
	            icon: 'rectangle'
	        } ,
	        {
	            name: 'tree2',
	            icon: 'rectangle'
	        }],
	        borderColor: '#c23531'
	    },
	    series:[series]
	}
	myChart.setOption(options);
}
function changeChartType(obj){
    if(obj.value=='orgChart'){
        document.getElementById("chart-container").style.display='';
        document.getElementById("chart-eChart").style.display='none';
	      document.getElementById("chart-container").style.width='98%';
	      document.getElementById("chart-container").style.height='95%';
    }else{
	      document.getElementById("chart-container").style.display='none';
	      document.getElementById("chart-eChart").style.display='';
	      document.getElementById("chart-eChart").style.width='98%';
	      document.getElementById("chart-eChart").style.height='95%';
    }
}
</script> 
