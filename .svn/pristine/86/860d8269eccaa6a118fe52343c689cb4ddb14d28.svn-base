'use strict';

(function($){

  $(function() {
	  var orgid = document.getElementById("orgid").value;
	  var basePath = document.getElementById("basePath").value;
  	   $.ajax({
            //url: "com.dcf.emporg.orgchartComp.queryOrgOInfo.biz.ext",
            //url: "com.dcf.emporg.orgchartComp.QueryOrgOInfoSqlServer.biz.ext",
            url: basePath+"/org/searchData.action?orgid="+orgid,
            type: 'POST',
	        cache: false,
	        contentType: 'application/json;charset=utf-8',
            success: function(mydata) {
            	initCharts(mydata);
            	var datascource =mydata;
            	$('#chart-container').orgchart({
			      'data' : datascource,
			      'depth': 2,
			      'nodeTitle': 'DEPT_CODE',
			      'nodeContent': 'name',
			      'exportButton': true,
			      'exportFilename': 'MyOrgChart'/*,
			      'createNode': function($node, data) {
			    	  var secondMenuIcon = $('<i>', {
			    		  'class': 'fa fa-info-circle second-menu-icon',
			    		  click: function() {
			    			  $(this).siblings('.second-menu').toggle();
			    	      }
			    	  });
			    	  var secondMenu = '<div class="second-menu"><img class="avatar" src="../img/avatar/' + 1 + '.jpg"></div>';
			    	  $node.append(secondMenuIcon).append(secondMenu);
			      }*/
			   });
            },
            error: function(jqXHR, textStatus, errorThrown) {
                alert(jqXHR.responseText);
            }
        });


  

  });
  
  function initCharts(mydata){
    var datascource =mydata;
	var myChart = echarts.init(document.getElementById('chart-eChart'));
	var series = {
		type: 'tree',
        name: '组织架构图',
        data: [datascource],
        top: '5%',
        left: '5%',
        bottom: '2%',
        symbolSize: 7,
        width:'1200',
        height:'800',
        label: {
            normal: {
                position: 'left',
                verticalAlign: 'middle',
                align: 'right'
            },
            height:'2%',
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
	            name: '组织架构图',
	            icon: 'rectangle'
	        }],
	        borderColor: '#c23531'
	    },
	    series:[series]
	}
	echarts.util.each(datascource.children, function (datum, index) {
        index % 2 === 0 && (datum.collapsed = true);
    });
	myChart.setOption(options);
}

})(jQuery);