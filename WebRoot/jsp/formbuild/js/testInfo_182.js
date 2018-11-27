var Currentpage = 0;
var pagesize = 10;
function initRoleButtons(buttonFormId,buttonFormCode){
    var date = new Date();
    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId+'&'+date;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            if(datas.length==0){
                showMoreBtn($(".BTNGROUP_"+buttonFormId+""));
            }else{
                for(var i=0;i<datas.length;i++){
                    if(datas[i].powerType==4){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                      obj.parent().remove();
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4402() {
        initRoleColumn('4402');
        initRoleButtons('4402','comp_COM_LIST');
        $("#comp_COM_LIST_List").bootstrapTable({
            url :'/myehr/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            queryParams : grid_comp_COM_LIST_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#comp_COM_LIST_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
        	editcomp_COM_LIST_click_4402('isView',row);  
         } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
    };
}
	var _formId_4402='4402';
var realFormId='4401';
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var date = new Date();
    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId+'&'+date;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            if(datas.length==0){
                showMoreBtn($(".BTNGROUP_"+buttonFormId+""));
            }else{
                for(var i=0;i<datas.length;i++){
                    if(datas[i].powerType==4){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                      obj.parent().remove();
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4436() {
        initRoleColumn('4436');
        initRoleButtons('4436','Numberofcadres');
        $("#Numberofcadres_List").bootstrapTable({
            url :'/myehr/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            queryParams : grid_Numberofcadres_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#Numberofcadres_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
        	editNumberofcadres_click_4436('isView',row);  
         } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
    };
}
	var _formId_4436='4436';
var realFormId='4401';
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var date = new Date();
    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId+'&'+date;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            if(datas.length==0){
                showMoreBtn($(".BTNGROUP_"+buttonFormId+""));
            }else{
                for(var i=0;i<datas.length;i++){
                    if(datas[i].powerType==4){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                      obj.parent().remove();
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4434() {
        initRoleColumn('4434');
        initRoleButtons('4434','JOBRANK_TXBT_LIST');
        $("#JOBRANK_TXBT_LIST_List").bootstrapTable({
            url :'/myehr/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            queryParams : grid_JOBRANK_TXBT_LIST_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#JOBRANK_TXBT_LIST_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
        	editJOBRANK_TXBT_LIST_click_4434('isView',row);  
         } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
    };
}
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var date = new Date();
    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId+'&'+date;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            if(datas.length==0){
                showMoreBtn($(".BTNGROUP_"+buttonFormId+""));
            }else{
                for(var i=0;i<datas.length;i++){
                    if(datas[i].powerType==4){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                      obj.parent().remove();
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4438() {
        initRoleColumn('4438');
        initRoleButtons('4438','Agestructuremap');
        $("#Agestructuremap_List").bootstrapTable({
            url :'/myehr/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            queryParams : grid_Agestructuremap_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#Agestructuremap_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
        	editAgestructuremap_click_4438('isView',row);  
         } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
    };
}
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var date = new Date();
    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId+'&'+date;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            if(datas.length==0){
                showMoreBtn($(".BTNGROUP_"+buttonFormId+""));
            }else{
                for(var i=0;i<datas.length;i++){
                    if(datas[i].powerType==4){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj.parent().remove();
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                      obj.parent().remove();
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_4444() {
        initRoleColumn('4444');
        initRoleButtons('4444','MAXEDUCATION_lidt');
        $("#MAXEDUCATION_lidt_List").bootstrapTable({
            url :'/myehr/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            queryParams : grid_MAXEDUCATION_lidt_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,100], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#MAXEDUCATION_lidt_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
        	editMAXEDUCATION_lidt_click_4444('isView',row);  
         } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
    };
}
/** 刷新页面 */ 
function refresh_comp_COM_LIST() { 
    $('#comp_COM_LIST_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#comp_COM_LIST_List td").css("border","none");
    }else if(type == 1){
        $("#comp_COM_LIST_List td").css("border-left","none");
    }else if(type == 2){
        $("#comp_COM_LIST_List td").css("border-top","none");
    }
}
	function grid_comp_COM_LIST_HeighQuery_4402() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"高级查询设置" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_comp_COM_LIST_fun11_4402&formDefId=4402&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4431(xAxisData,seriesData){
   document.getElementById('comp_tye_zhutu_chart').style.width='700px';
   document.getElementById('comp_tye_zhutu_chart').style.height='450px';
	var myChart = echarts.init(document.getElementById('comp_tye_zhutu_chart'));
	var options={
		//定义柱状图颜色
		color: [
                '#5BBFE9','#FEC86B', '#dd70d9', '#34cf34',
	                '#6497ef', '#85802b', '#D7504B', '#C6E579',
	                '#F4E001', '#F0805A', '#26C0C0'
            ],
		tooltip : {
			trigger: 'axis',
			axisPointer : {            // 坐标轴指示器，坐标轴触发有效
				type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
			}
		},
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				magicType: {type: ['line', 'bar']},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'总行部门人数分布',
           x: 'center'
       },grid:{
           x:25,
           y:45,
           x2:5,
           y2:100,
           borderWidth:1
       },
        legend:{
            data:['男','女'],
            orient: 'horizontal',
            bottom: 0
        },
        //X轴设置
        xAxis:{
            data:xAxisData,
    		axisLabel: {
    			show: true,
    			interval:0,
    			inside: false,
    			rotate: 0,
    			margin: 4,
    			showMinLabel: null,
    			showMaxLabel: null,
    			formatter:function(params){
    			    //return value.split("").join("\n");
    				var newParamsName = "";// 最终拼接成的字符串
                    var paramsNameNumber = params.length;// 实际标签的个数
                    var provideNumber = 1;// 每行能显示的字的个数
                    var rowNumber = Math.ceil(paramsNameNumber / provideNumber);// 换行的话，需要显示几行，向上取整
                    /**
                     * 判断标签的个数是否大于规定的个数， 如果大于，则进行换行处理 如果不大于，即等于或小于，就返回原标签
                     */
                    // 条件等同于rowNumber>1
                    if (paramsNameNumber > provideNumber) {
                        /** 循环每一行,p表示行 */
                        for (var p = 0; p < rowNumber; p++) {
                            var tempStr = "";// 表示每一次截取的字符串
                            var start = p * provideNumber;// 开始截取的位置
                            var end = start + provideNumber;// 结束截取的位置
                            // 此处特殊处理最后一行的索引值
                            if (p == rowNumber - 1) {
                                // 最后一次不换行
                                tempStr = params.substring(start, paramsNameNumber);
                            } else {
                                // 每一次拼接字符串并换行
                                tempStr = params.substring(start, end) + "\n";
                            }
                            newParamsName += tempStr;// 最终拼成的字符串
                        }

                    } else {
                        // 将旧标签的值赋给新标签
                        newParamsName = params;
                    }
                    //将最终的字符串返回
                    return newParamsName
    			}
    		}
        },
        yAxis: [
			{
				type : 'value'
			}
		],
        series:seriesData,
		
    };
    myChart.setOption(options);
}
function queryAllData_4431(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_comp_COM_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4431(text.rows);
		},
	});
}
function initArrData_4431(datas){
	var xAxisData=[];
	var seriesData=[];
	var seriesData1=[];
	var seriesData2=[];
	var xAxisColumn = 'EMPVCOMPIDTYPE_COMPID';
	var formDefSql = 'SELECT  EMP_V_COMPIDTYPE.EMPID AS EMPVCOMPIDTYPE_EMPID,EMP_V_COMPIDTYPE.COMPID AS EMPVCOMPIDTYPE_COMPID,EMP_V_COMPIDTYPE.GENDER AS EMPVCOMPIDTYPE_GENDER   FROM   EMP_V_COMPIDTYPE';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84873&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag1=0;
				var flag2=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVCOMPIDTYPE_COMPID==datas[j].EMPVCOMPIDTYPE_COMPID&&datas[j].EMPVCOMPIDTYPE_GENDER==1){
						flag1++;
					}else if(text[i].EMPVCOMPIDTYPE_COMPID==datas[j].EMPVCOMPIDTYPE_COMPID&&datas[j].EMPVCOMPIDTYPE_GENDER==2){
						flag2++;
					}
				}
				seriesData1.push(flag1);
				seriesData2.push(flag2);
			}
			var obj1 = {name: '男',type: 'bar', stack: '性别',data: seriesData1,label:{normal:{show: false,textStyle:{color:'#000'}}}};
			var obj2 = {name: '女',type: 'bar', stack: '性别',data: seriesData2,label:{normal:{show: false,textStyle:{color:'#000'}}}};
			//[{
			//	name: '机构人数',
			//	type: 'bar',
			//	data: seriesData
			//}]
			seriesData.push(obj1);
			seriesData.push(obj2);
			initCharts_4431(xAxisData,seriesData);
		},
	});
}

function initCharts_4460(xAxisData,seriesData){
	   document.getElementById('TJ_V_COMPID_ZHUTU_chart').style.width='700px';
	   document.getElementById('TJ_V_COMPID_ZHUTU_chart').style.height='450px';
		var myChart = echarts.init(document.getElementById('TJ_V_COMPID_ZHUTU_chart'));
		var options={
			//定义柱状图颜色
			color: [
	                '#5BBFE9','#FEC86B', '#dd70d9', '#34cf34',
	                '#6497ef', '#85802b', '#D7504B', '#C6E579',
	                '#F4E001', '#F0805A', '#26C0C0'
	            ],
			tooltip : {
				trigger: 'axis',
				axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
				}
			},
			toolbox: {
				show: true,
				feature: {
					dataView: {readOnly: false},
					magicType: {type: ['line', 'bar']},
					restore: {},
					saveAsImage: {}
				}
			},
			//定义一个标题
	       title:{
	           text:'分支行人员分布',
	           x: 'center'
	       },grid:{
	           x:25,
	           y:45,
	           x2:5,
	           y2:100,
	           borderWidth:1
	       },
	        legend:{
	            data:['男','女'],
	            orient: 'horizontal',
	            bottom: 0
	        },
	        //X轴设置
	        xAxis:{
	            data:xAxisData,
	            axisLabel: {
	    			show: true,
	    			interval:0,
	    			inside: false,
	    			rotate: 0,
	    			margin: 4,
	    			showMinLabel: null,
	    			showMaxLabel: null,
	    			formatter:function(params){
	    			    //return value.split("").join("\n");
	    				var newParamsName = "";// 最终拼接成的字符串
	                    var paramsNameNumber = params.length;// 实际标签的个数
	                    var provideNumber = 1;// 每行能显示的字的个数
	                    var rowNumber = Math.ceil(paramsNameNumber / provideNumber);// 换行的话，需要显示几行，向上取整
	                    /**
	                     * 判断标签的个数是否大于规定的个数， 如果大于，则进行换行处理 如果不大于，即等于或小于，就返回原标签
	                     */
	                    // 条件等同于rowNumber>1
	                    if (paramsNameNumber > provideNumber) {
	                        /** 循环每一行,p表示行 */
	                        for (var p = 0; p < rowNumber; p++) {
	                            var tempStr = "";// 表示每一次截取的字符串
	                            var start = p * provideNumber;// 开始截取的位置
	                            var end = start + provideNumber;// 结束截取的位置
	                            // 此处特殊处理最后一行的索引值
	                            if (p == rowNumber - 1) {
	                                // 最后一次不换行
	                                tempStr = params.substring(start, paramsNameNumber);
	                            } else {
	                                // 每一次拼接字符串并换行
	                                tempStr = params.substring(start, end) + "\n";
	                            }
	                            newParamsName += tempStr;// 最终拼成的字符串
	                        }

	                    } else {
	                        // 将旧标签的值赋给新标签
	                        newParamsName = params;
	                    }
	                    //将最终的字符串返回
	                    return newParamsName
	    			}
	    		}
	        },
	        yAxis: [
				{
					type : 'value'
				}
			],
	        series:seriesData
	    };
	    myChart.setOption(options);
	}
	function queryAllData_4460(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_TJ_V_COMPID_LIST_fun(pageReqeust);
		$.ajax({
			url:url,
			type:'post',
			data: paramData,
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_4460(text.rows);
			},
		});
	}
	function initArrData_4460(datas){
		var xAxisData=[];
		var seriesData=[];
		var seriesData1=[];
		var seriesData2=[];
		var xAxisColumn = 'TJVCOMPID_COMPID';
		var orderColumn = 'TJVCOMPID_TYPE';
		var formDefSql = 'SELECT  TJ_V_COMPID.TYPE AS TJVCOMPID_TYPE,TJ_V_COMPID.EMPID AS TJVCOMPID_EMPID,TJ_V_COMPID.GENDER AS TJVCOMPID_GENDER,TJ_V_COMPID.COMPID AS TJVCOMPID_COMPID  FROM   TJ_V_COMPID';
		var url='/myehr/charts/searchChartsType.action?xColumnId=85011&orderColumn='+orderColumn+'&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
		$.ajax({
			url:url,
			type:'post',
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				for(var i=0;i<text.length;i++){
					xAxisData.push(text[i].dictName);
					var flag1=0;
					var flag2=0;
					for(var j=0;j<datas.length;j++){
						if(text[i].TJVCOMPID_COMPID==datas[j].TJVCOMPID_COMPID&&datas[j].TJVCOMPID_GENDER==1){
							flag1++;
						}else if(text[i].TJVCOMPID_COMPID==datas[j].TJVCOMPID_COMPID&&datas[j].TJVCOMPID_GENDER==2){
							flag2++;
						}
					}
					seriesData1.push(flag1);
					seriesData2.push(flag2);
				}
				var obj1 = {name: '男',type: 'bar', stack: '性别',data: seriesData1,label:{normal:{show: false,textStyle:{color:'#000'}}}};
				var obj2 = {name: '女',type: 'bar', stack: '性别',data: seriesData2,label:{normal:{show: false,textStyle:{color:'#000'}}}};

				seriesData.push(obj1);
				seriesData.push(obj2);
				initCharts_4460(xAxisData,seriesData);
			},
		});
	}
	var filterParam = {};
	var queryParams;
	function grid_TJ_V_COMPID_LIST_fun(pageReqeust){
		var _filterdata={};
		if(document.getElementById('grid_TJ_V_COMPID_LIST_filter')){
		}
		var paramsMap = {};
		var requestParam={};
			requestParam = {};
		pageReqeust.containerParam=containerParam_4459;
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.userIds=getQueryString('empIds');
		pageReqeust.formId=_formId_4459;
		pageReqeust.isView=null;
		if(heightGadedata_4459!=null&&heightGadedata_4459!=undefined){
			pageReqeust.heightGrade = heightGadedata_4459;
		}
		queryParams = JSON.stringify(pageReqeust);
		return queryParams;
	}
/** 刷新页面 */ 
function refresh_Numberofcadres() { 
    $('#Numberofcadres_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#Numberofcadres_List td").css("border","none");
    }else if(type == 1){
        $("#Numberofcadres_List td").css("border-left","none");
    }else if(type == 2){
        $("#Numberofcadres_List td").css("border-top","none");
    }
}

function initCharts_4600(xAxisData,seriesData){
	   document.getElementById('ZM_payemp_TU_chart').style.width='1500px';
	   document.getElementById('ZM_payemp_TU_chart').style.height='350px';
		var myChart = echarts.init(document.getElementById('ZM_payemp_TU_chart'));
		var options={
			//定义柱状图颜色
			color: [
	                '#5BBFE9','#FEC86B', '#dd70d9', '#34cf34',
	                '#6497ef', '#85802b', '#D7504B', '#C6E579',
	                '#F4E001', '#F0805A', '#26C0C0'
	            ],
			tooltip : {
				trigger: 'axis',
				axisPointer : {            // 坐标轴指示器，坐标轴触发有效
					type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
				}
			},
	        legend:{
	            data:['期间'],
	            orient: 'horizontal',
	            bottom:0
	        },
			toolbox: {
				show: true,
				feature: {
					dataView: {readOnly: false},
					magicType: {type: ['line', 'bar']},
					restore: {},
					saveAsImage: {}
				}
			},
			//定义一个标题
	       title:{
	           text:'月工资统计',
	           x: 'center'
	       },grid:{
	           x:45,
	           y:45,
	           x2:15,
	           y2:10,
	           borderWidth:1
	       },
	        //X轴设置
	        xAxis:{
	            data:xAxisData
	        },
	        yAxis: [
				{
					type : 'value'
				}
			],
	        series:[{
		    name: '期间',
		    type: 'bar',
		    barMaxWidth:'30px',
            hoverAnimation:false,
		    data: seriesData
	        }],
			label: {
			    normal: {
			        show: true,
			        position: 'top',
			        textStyle: {
			          color: 'black'
			        }
			    }
			 }
	    };
	    myChart.setOption(options);
	}
	function queryAllData_4600(){
		var url='/myehr/form/cardformInitData.action?queryType=all';
		var pageReqeust = {};
		var paramData = grid_ZM_payemp_LIST11_fun(pageReqeust);
		$.ajax({
			url:url,
			type:'post',
			data: paramData,
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				initArrData_4600(text.rows);
			},
		});
	}
	function initArrData_4600(datas){
		var xAxisData=[];
		var seriesData=[];
		var xAxisColumn = 'PAYFOREMPPAYROLLHIS_PERIOD';
		var formDefSql = 'SELECT  SYS_USER.USER_ID AS SYSUSER_USER_ID, PAY_FOREMPPAYROLL_HIS.PERIOD AS PAYFOREMPPAYROLLHIS_PERIOD ,  PAY_FOREMPPAYROLL_HIS.ID AS PAYFOREMPPAYROLLHIS_ID,  PAY_FOREMPPAYROLL_HIS.EMPID AS PAYFOREMPPAYROLLHIS_EMPID , PAY_FOREMPPAYROLL_HIS.SUMPAY AS PAYFOREMPPAYROLLHIS_SUMPAY    FROM  PAY_FOREMPPAYROLL_HIS  LEFT JOIN    SYS_USER  ON  PAY_FOREMPPAYROLL_HIS.EMPID=SYS_USER.EMP_ID';
		var url='/myehr/charts/searchChartsType.action?xColumnId=86772&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
		$.ajax({
			url:url,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				for(var i=0;i<text.length;i++){
					xAxisData.push(text[i].dictName);
					var flag=0;
					for(var j=0;j<datas.length;j++){
						if(text[i].PAYFOREMPPAYROLLHIS_PERIOD==datas[j].PAYFOREMPPAYROLLHIS_PERIOD){
							seriesData.push(datas[j].PAYFOREMPPAYROLLHIS_SUMPAY);
						}
					}
					
				}
				initCharts_4600(xAxisData,seriesData)
			},
		});
	}
	

	function grid_Numberofcadres_HeighQuery_4436() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"高级查询设置" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_Numberofcadres_fun11_4436&formDefId=4436&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4437(xAxisData,seriesData){
   document.getElementById('JOBRANK_YEAROLDS_chart').style.width='700px';
   document.getElementById('JOBRANK_YEAROLDS_chart').style.height='450px';
	var myChart = echarts.init(document.getElementById('JOBRANK_YEAROLDS_chart'));
	var options={
		//定义柱状图颜色
		color: ['#ff8080',],
		tooltip : {
			trigger: 'axis',
			axisPointer : {            // 坐标轴指示器，坐标轴触发有效
				type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
			}
		},
		barMaxWidth:30,
		toolbox: {
			show: true,
			feature: {
				dataView: {readOnly: false},
				magicType: {type: ['line', 'bar']},
				restore: {},
				saveAsImage: {}
			}
		},
		//定义一个标题
       title:{
           text:'干部人数',
           x: 'center'
       },grid:{
           x:25,
           y:45,
           x2:5,
           y2:100,
           borderWidth:1
       },
        legend:{
            data:['干部名称'],
            orient: 'horizontal',
            bottom:0
        },
        //X轴设置
        xAxis:{
            data:xAxisData,
    		axisLabel: {
    			show: true,
    			interval: 'auto',
    			inside: false,
    			rotate: 0,
    			margin: 4,
    			showMinLabel: null,
    			showMaxLabel: null,
    			formatter:function(params){
    			    //return value.split("").join("\n");
    				var newParamsName = "";// 最终拼接成的字符串
                    var paramsNameNumber = params.length;// 实际标签的个数
                    var provideNumber = 4;// 每行能显示的字的个数
                    var rowNumber = Math.ceil(paramsNameNumber / provideNumber);// 换行的话，需要显示几行，向上取整
                    /**
                     * 判断标签的个数是否大于规定的个数， 如果大于，则进行换行处理 如果不大于，即等于或小于，就返回原标签
                     */
                    // 条件等同于rowNumber>1
                    if (paramsNameNumber > provideNumber) {
                        /** 循环每一行,p表示行 */
                        for (var p = 0; p < rowNumber; p++) {
                            var tempStr = "";// 表示每一次截取的字符串
                            var start = p * provideNumber;// 开始截取的位置
                            var end = start + provideNumber;// 结束截取的位置
                            // 此处特殊处理最后一行的索引值
                            if (p == rowNumber - 1) {
                                // 最后一次不换行
                                tempStr = params.substring(start, paramsNameNumber);
                            } else {
                                // 每一次拼接字符串并换行
                                tempStr = params.substring(start, end) + "\n";
                            }
                            newParamsName += tempStr;// 最终拼成的字符串
                        }

                    } else {
                        // 将旧标签的值赋给新标签
                        newParamsName = params;
                    }
                    //将最终的字符串返回
                    return newParamsName
    			}
    		}
        },
        yAxis: [
			{
				type : 'value'
			}
		],
        series:[{
		    name: '干部名称',
		    type: 'bar',
		    data: seriesData
		}],
		label: {
		    normal: {
		        show: true,
		        position: 'top',
		        textStyle: {
		          color: 'black'
		        }
		    }
		 }
    };
    myChart.setOption(options);
}
function queryAllData_4437(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_Numberofcadres_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4437(text.rows);
		},
	});
}
function initArrData_4437(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVJOBRANK_JOBRANK';
	var formDefSql = 'select   EMP_V_JOBRANK.JOBRANK AS EMPVJOBRANK_JOBRANK,EMP_V_JOBRANK.YEAROLDS AS EMPVJOBRANK_YEAROLDS,EMP_V_JOBRANK.empid AS EMPVJOBRANK_empid   from   EMP_V_JOBRANK';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84884&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVJOBRANK_JOBRANK==datas[j].EMPVJOBRANK_JOBRANK){
						flag++;
					}
				}
				seriesData.push(flag);
			}
			initCharts_4437(xAxisData,seriesData)
		},
	});
}
	function grid_JOBRANK_TXBT_LIST_HeighQuery_4434() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"高级查询设置" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_JOBRANK_TXBT_LIST_fun11_4434&formDefId=4434&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4433(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('EMP_V_JOBORDE_BT_chart'));
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
		//定义一个标题
       title:{
           text:'序列占比',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom:titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'序列',
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
function queryAllData_4433(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_JOBRANK_TXBT_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4433(text.rows);
		},
	});
}
function initArrData_4433(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVJOBORDER_JOBORDER';
	var formDefSql = 'SELECT   EMP_V_JOBORDER.EMPID AS EMPVJOBORDER_EMPID,EMP_V_JOBORDER.JOBORDER AS EMPVJOBORDER_JOBORDER,EMP_V_JOBORDER.COMPID AS EMPVJOBORDER_COMPID   FROM    EMP_V_JOBORDER';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84876&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVJOBORDER_JOBORDER==datas[j].EMPVJOBORDER_JOBORDER){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4433(xAxisData,seriesData)
		},
	});
}
	function grid_Agestructuremap_HeighQuery_4438() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"高级查询设置" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_Agestructuremap_fun11_4438&formDefId=4438&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4439(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('Agestructuremap_txbt_chart'));
	var options={
		color: [
                '#6497ef', '#85802b','#dd70d9', '#34cf34','#ff7e50', '#97d3f9', '#D7504B', '#C6E579','#F4E001', '#F0805A', '#26C0C0'
            ],
            
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
		//定义一个标题
       title:{
           text:'干部年龄结构图',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'干部分类',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: false,
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
function queryAllData_4439(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_Agestructuremap_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4439(text.rows);
		},
	});
}
function initArrData_4439(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVJOBR_TT';
	var formDefSql = 'select  EMP_V_JOBR.EMPID AS EMPVJOBR_EMPID,EMP_V_JOBR.TT AS EMPVJOBR_TT,EMP_V_JOBR.T1 AS EMPVJOBR_T1   from   EMP_V_JOBR';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84887&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVJOBR_TT==datas[j].EMPVJOBR_TT){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4439(xAxisData,seriesData)
		},
	});
}
	function grid_MAXEDUCATION_lidt_HeighQuery_4444() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"高级查询设置" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_MAXEDUCATION_lidt_fun11_4444&formDefId=4444&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
function initCharts_4445(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('MAXEDUCATION]_TXBT_chart'));
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
		//定义一个标题
       title:{
           text:'干部学历结构图',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'学历',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: false,
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
function initCharts_4385(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('sexy_women_chart'));
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
		//定义一个标题
       title:{
           text:'全行性别比例图',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'性别',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: false,
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
function queryAllData_4385(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_sexy_women_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4385(text.rows);
		},
	});
}
function initArrData_4385(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_GENDER';
	var formDefSql = 'select      EMP_V_EMPLOYEE.COMPID AS EMPVEMPLOYEE_COMPID, EMP_V_EMPLOYEE.MAXEDUCATION AS EMPVEMPLOYEE_MAXEDUCATION , EMP_V_EMPLOYEE.GENDER AS EMPVEMPLOYEE_GENDER , EMP_V_EMPLOYEE.EMPID AS EMPVEMPLOYEE_EMPID    from   EMP_V_EMPLOYEE';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84488&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_GENDER==datas[j].EMPVEMPLOYEE_GENDER){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4385(xAxisData,seriesData)
		},
	});
}


function queryAllData_4445(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var val = $("#filter_4445").val();
	var paramData = grid_MAXEDUCATION_lidt_fun(pageReqeust,val);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4445(text.rows);
		},
	});
}
function initArrData_4445(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVMAXEDUCATION_TT';
	var formDefSql = 'select  EMP_V_MAXEDUCATION.EMPID AS EMPVMAXEDUCATION_EMPID,EMP_V_MAXEDUCATION.TT AS EMPVMAXEDUCATION_TT,EMP_V_MAXEDUCATION.T1 AS EMPVMAXEDUCATION_T1    from  EMP_V_MAXEDUCATION';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84899&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVMAXEDUCATION_TT==datas[j].EMPVMAXEDUCATION_TT){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4445(xAxisData,seriesData)
		},
	});
}

function initCharts_4416(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('EMP_POLITICALSTATUS_TU_chart'));
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
		//定义一个标题
       title:{
           text:'政治面貌比列',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'政治面貌',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: true,
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
function queryAllData_4416(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_EMPJOBTYPE_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4416(text.rows);
		},
	});
}
function initArrData_4416(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPJOBTYPE_POLITICALSTATUS';
	var formDefSql = 'SELECT  EMP_V_EMPJOBTYPE.EMPID AS EMPVEMPJOBTYPE_EMPID,EMP_V_EMPJOBTYPE.POLITICALSTATUS AS EMPVEMPJOBTYPE_POLITICALSTATUS,EMP_V_EMPJOBTYPE.TITLELEVEL AS EMPVEMPJOBTYPE_TITLELEVEL,EMP_V_EMPJOBTYPE.EMPLEVEL AS EMPVEMPJOBTYPE_EMPLEVEL,EMP_V_EMPJOBTYPE.joborder AS EMPVEMPJOBTYPE_joborder  FROM   EMP_V_EMPJOBTYPE';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84644&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPJOBTYPE_POLITICALSTATUS==datas[j].EMPVEMPJOBTYPE_POLITICALSTATUS){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4416(xAxisData,seriesData)
		},
	});
}

function initCharts_4388(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('emp_maxty_chart'));
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
		//定义一个标题
       title:{
           text:'学历比列饼图',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'最高学历',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: true,
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
function queryAllData_4388(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_sexy_women_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4388(text.rows);
		},
	});
}
function initArrData_4388(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_MAXEDUCATION';
	var formDefSql = 'select      EMP_V_EMPLOYEE.COMPID AS EMPVEMPLOYEE_COMPID, EMP_V_EMPLOYEE.MAXEDUCATION AS EMPVEMPLOYEE_MAXEDUCATION , EMP_V_EMPLOYEE.GENDER AS EMPVEMPLOYEE_GENDER , EMP_V_EMPLOYEE.EMPID AS EMPVEMPLOYEE_EMPID    from   EMP_V_EMPLOYEE';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84490&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_MAXEDUCATION==datas[j].EMPVEMPLOYEE_MAXEDUCATION){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4388(xAxisData,seriesData)
		},
	});
}

function initCharts_4414(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('EMP_V_WORKYEARS_TU_chart'));
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
		//定义一个标题
       title:{
           text:'工龄分析',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'工龄分段',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: true,
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
function queryAllData_4414(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_WORKYEARS_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4414(text.rows);
		},
	});
}
function initArrData_4414(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVWORKYEARS_AA';
	var formDefSql = 'SELECT  EMP_V_WORKYEARS.EMPID AS EMPVWORKYEARS_EMPID,EMP_V_WORKYEARS.AA AS EMPVWORKYEARS_AA  FROM   EMP_V_WORKYEARS';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84642&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVWORKYEARS_AA==datas[j].EMPVWORKYEARS_AA){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4414(xAxisData,seriesData)
		},
	});
}

function initCharts_4390(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('YEAROLDS_BI_chart'));
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
		//定义一个标题
       title:{
           text:'全行年龄结构图',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'年龄分段',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: true,
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
function queryAllData_4390(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_YEAROLDS_list_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4390(text.rows);
		},
	});
}
function initArrData_4390(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVYEAROLDS_TT';
	var formDefSql = 'SELECT   EMP_V_YEAROLDS.EMPID AS EMPVYEAROLDS_EMPID,EMP_V_YEAROLDS.TT AS EMPVYEAROLDS_TT   FROM   EMP_V_YEAROLDS';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84494&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVYEAROLDS_TT==datas[j].EMPVYEAROLDS_TT){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4390(xAxisData,seriesData)
		},
	});
}

function initCharts_4388(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('emp_maxty_chart'));
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
		//定义一个标题
       title:{
           text:'全行学历图',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'最高学历',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: true,
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
function queryAllData_4388(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_sexy_women_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4388(text.rows);
		},
	});
}
function initArrData_4388(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_MAXEDUCATION';
	var formDefSql = 'select      EMP_V_EMPLOYEE.COMPID AS EMPVEMPLOYEE_COMPID, EMP_V_EMPLOYEE.MAXEDUCATION AS EMPVEMPLOYEE_MAXEDUCATION , EMP_V_EMPLOYEE.GENDER AS EMPVEMPLOYEE_GENDER , EMP_V_EMPLOYEE.EMPID AS EMPVEMPLOYEE_EMPID    from   EMP_V_EMPLOYEE';
	var url='/myehr/charts/searchChartsType.action?xColumnId=84490&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_MAXEDUCATION==datas[j].EMPVEMPLOYEE_MAXEDUCATION){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4388(xAxisData,seriesData)
		},
	});
}

function initCharts_4462(xAxisData,seriesData){
	var x = '50%';//页面左右
	var y = '40%';//页面上下
	var size = ['25%','45%'];//图形大小
	var titleType = 'horizontal';
	var titlePosition = 100;
	var myChart = echarts.init(document.getElementById('EMP_V_ASDWA_ZHUTU_chart'));
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
		//定义一个标题
       title:{
           text:'全行职称',
			x: 'center'
       },
       legend:{
           orient: titleType,
           bottom: titlePosition,
           data:xAxisData
       },
       series:[
           {
               name:'职称级别',
               type:'pie',
               radius : size,
               center: [x,y],
               avoidLabelOverlap: true,
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
function queryAllData_4462(){
	var url='/myehr/form/cardformInitData.action?queryType=all';
	var pageReqeust = {};
	var paramData = grid_EMP_V_ASDWA_LIST_fun(pageReqeust);
	$.ajax({
		url:url,
		type:'post',
		data: paramData,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			initArrData_4462(text.rows);
		},
	});
}
function initArrData_4462(datas){
	var xAxisData=[];
	var seriesData=[];
	var xAxisColumn = 'EMPVEMPLOYEE_TITLELEVEL';
	var formDefSql = 'SELECT  EMP_V_EMPLOYEE.TITLELEVEL AS EMPVEMPLOYEE_TITLELEVEL   FROM   EMP_V_EMPLOYEE   WHERE JOBSTATUS=1';
	var url='/myehr/charts/searchChartsType.action?xColumnId=85013&xAxisColumn='+xAxisColumn+'&formDefSql='+formDefSql;
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (text) {
			for(var i=0;i<text.length;i++){
				xAxisData.push(text[i].dictName);
				var flag=0;
				for(var j=0;j<datas.length;j++){
					if(text[i].EMPVEMPLOYEE_TITLELEVEL==datas[j].EMPVEMPLOYEE_TITLELEVEL){
						flag++;
					}
				}
				var obj={};
				obj.value = flag ;
				obj.name=text[i].dictName;
				seriesData.push(obj);
			}
			initCharts_4462(xAxisData,seriesData)
		},
	});
}
    //showMoreBtn($(".BTNGROUP_4461"));
var filterParam = {};
var queryParams;
function grid_EMP_V_ASDWA_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_ASDWA_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4461;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4461;
	pageReqeust.isView=null;
	if(heightGadedata_4461!=null&&heightGadedata_4461!=undefined){
		pageReqeust.heightGrade = heightGadedata_4461;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}


    //showMoreBtn($(".BTNGROUP_4386"));
var filterParam = {};
var queryParams;
function grid_sexy_women_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_sexy_women_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4386;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4386;
	pageReqeust.isView=null;
	if(heightGadedata_4386!=null&&heightGadedata_4386!=undefined){
		pageReqeust.heightGrade = heightGadedata_4386;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

    //showMoreBtn($(".BTNGROUP_4389"));
var filterParam = {};
var queryParams;
function grid_EMP_V_YEAROLDS_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_YEAROLDS_list_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4389;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4389;
	pageReqeust.isView=null;
	if(heightGadedata_4389!=null&&heightGadedata_4389!=undefined){
		pageReqeust.heightGrade = heightGadedata_4389;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

    //showMoreBtn($(".BTNGROUP_4413"));
var filterParam = {};
var queryParams;
function grid_EMP_V_WORKYEARS_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_WORKYEARS_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4413;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4413;
	pageReqeust.isView=null;
	if(heightGadedata_4413!=null&&heightGadedata_4413!=undefined){
		pageReqeust.heightGrade = heightGadedata_4413;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
    //showMoreBtn($(".BTNGROUP_4386"));
var filterParam = {};
var queryParams;
function grid_sexy_women_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_sexy_women_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4386;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4386;
	pageReqeust.isView=null;
	if(heightGadedata_4386!=null&&heightGadedata_4386!=undefined){
		pageReqeust.heightGrade = heightGadedata_4386;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}


    //showMoreBtn($(".BTNGROUP_4415"));
var filterParam = {};
var queryParams;
function grid_EMP_V_EMPJOBTYPE_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_EMPJOBTYPE_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4415;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4415;
	pageReqeust.isView=null;
	if(heightGadedata_4415!=null&&heightGadedata_4415!=undefined){
		pageReqeust.heightGrade = heightGadedata_4415;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}

var filterParam = {};
var queryParams;
function grid_sexy_women_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_sexy_women_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4386;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4386;
	pageReqeust.isView=null;
	if(heightGadedata_4386!=null&&heightGadedata_4386!=undefined){
		pageReqeust.heightGrade = heightGadedata_4386;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
var filterParam = {};
var queryParams;
function grid_EMP_V_EMPBASIC_LLIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_EMPBASIC_LLIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
	if(''==''&&'session'=='parameter'){
		if(USERID==undefined){
			requestParam = {USERID:''};
		}else{
			requestParam = {};
		}
	}else{
		requestParam = {USERID:'1'};
	}
	pageReqeust.containerParam=containerParam_4450;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4450;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4450!=null&&heightGadedata_4450!=undefined){
		pageReqeust.heightGrade = heightGadedata_4450;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_EMP_V_EMPBASIC_LLIST_fun11_4450(){
	loadDataStart();

}

var filterParam = {};
var queryParams;
function grid_emp_newemp_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_newemp_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4397;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4397;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4397!=null&&heightGadedata_4397!=undefined){
		pageReqeust.heightGrade = heightGadedata_4397;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_newemp_fun11_4397(){
	loadDataStart();

}
function loadDataStart_4397(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_emp_newemp_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_4397(arr);
      }
});
}function showDate_4397(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div><a href="/myehr/form/toForm.action?formId=4398&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:50;color:#ffffff;font-weight:600;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">本年度新入职人数</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
$('#emp_newemp').append(cellObj);
}
	}
var filterParam = {};
var queryParams;
function grid_emp_newlizhi_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_newlizhi_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4399;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4399;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4399!=null&&heightGadedata_4399!=undefined){
		pageReqeust.heightGrade = heightGadedata_4399;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_newlizhi_fun11_4399(){
	loadDataStart();

}
function loadDataStart_4399(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_emp_newlizhi_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_4399(arr);
      }
});
}function showDate_4399(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#FBC86D">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div><a href="/myehr/form/toForm.action?formId=2643&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:50;color:#ffffff;font-weight:600;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">本年度离职人数</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
$('#emp_newlizhi').append(cellObj);
}
	}
	var filterParam = {};
var queryParams;
function grid_emp_countempzong_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_countempzong_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4639;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4639;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4639!=null&&heightGadedata_4639!=undefined){
		pageReqeust.heightGrade = heightGadedata_4639;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_countempzong_fun11_4639(){
	loadDataStart();

}
function loadDataStart_4639(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_emp_countempzong_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_4639(arr);
      }
});
}function showDate_4639(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#F88F87">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div><a href="/myehr/form/toForm.action?formId=2643&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:50;color:#ffffff;font-weight:600;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">全行总人数</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
$('#emp_countempzong').append(cellObj);
}
	}
	var filterParam = {};
var queryParams;
function grid_emp_tuix_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_tuix_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4400;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4400;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage*pagesize;;
	pageReqeust.limit=pagesize;;
	if(heightGadedata_4400!=null&&heightGadedata_4400!=undefined){
		pageReqeust.heightGrade = heightGadedata_4400;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_tuix_fun11_4400(){
	loadDataStart();

}
function loadDataStart_4400(){
$.ajax({
    url: "/myehr/form/cardformInitData.action",
    type: 'post',
    data:grid_emp_tuix_fun(xx),//HTTP请求类型
    contentType: 'application/json;charset=utf-8',
    cache: false,
    async: false,
    success: function (data) {
        var arr=data.rows;
        showDate_4400(arr);
      }
});
}function showDate_4400(arr) {
for (var i = arr.length - 1; i >= 0; i--) {
    var cellObj = $(
			'<div class="col-md-12 col-sm-12 col-lg-12">'+
		'    <div class="widget style1 navy-bg" style="background-color:#FF8080">'+
		'        <div class="row" id="row" >'+
		'            <div class="col-xs-12 text-right">'+
		'				<div><a href="/myehr/form/toForm.action?formId=2643&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:50;color:#ffffff;font-weight:600;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
		'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">本年度退休人数</span></div>'+
		'            </div>'+
		'        </div>'+
		'    </div>'+
		'</div>');
$('#emp_tuix').append(cellObj);
}
	}
var filterParam = {};

function loadDataStart_4464(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_emp_depcount_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        var arr=data.rows;
	        showDate_4464(arr);
	      }
	});
}

function loadDataStart_4498(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_ZM_ATTEND_EMPLEAVEBLANCE_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        var arr=data.rows;
	        showDate_4498(arr);
	      }
	});
}
function loadDataStart_4499(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_ZM_ATT_LEAVE_HIS_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        var arr=data.rows;
	        showDate_4499(arr);
	      }
	});
}
function showDate_4499(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=4485&EMPVATTEN_ISUM='+arr[i].EMPVATTEN_ISUM+'"><span style="height:10%;text-align:center;display:block;font-size:50;color:#ffffff;font-weight:400;">'+arr[i].EMPVATTEN_ISUM+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:15;color:#ffffff;font-weight:400;">本年度请假天数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	    $('#ZM_ATT_LEAVE_HIS').append(cellObj);
	}
}
function showDate_4498(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#578ebe">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div style="margin-top:10px"><a href="/myehr/form/toForm.action?formId=4483&ATTENDEMPLEAVEBLANCE_amount='+arr[i].ATTENDEMPLEAVEBLANCE_AMOUNT+'"><span style="height:10%;text-align:center;display:block;font-size:50;color:#ffffff;font-weight:400;">'+arr[i].ATTENDEMPLEAVEBLANCE_AMOUNT+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:16;color:#ffffff;font-weight:400;">剩余年假额度</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	    $('#ZM_ATTEND_EMPLEAVEBLANCE').append(cellObj);
	}
}

function loadDataStart_4465(){
	$.ajax({
	    url: "/myehr/form/cardformInitData.action",
	    type: 'post',
	    data:grid_emp_compcount_fun(xx),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	        var arr=data.rows;
	        showDate_4465(arr);
	      }
	});
}

function showDate_4464(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#5BBFE9">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div><a href="/myehr/form/toForm.action?formId=&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:50;color:#ffffff;font-weight:600;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">总行部门人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#emp_depcount').append(cellObj);
	}
}

function showDate_4465(arr) {
	for (var i = arr.length - 1; i >= 0; i--) {
	    var cellObj = $(
				'<div class="col-md-12 col-sm-12 col-lg-12">'+
			'    <div class="widget style1 navy-bg" style="background-color:#95EDD5">'+
			'        <div class="row" id="row" >'+
			'            <div class="col-xs-12 text-right">'+
			'				<div><a href="/myehr/form/toForm.action?formId=&VIR_PERNUM='+arr[i].VIR_PERNUM+'"><span style="height:10%;text-align:center;display:block;font-size:50;color:#ffffff;font-weight:600;">'+arr[i].VIR_PERNUM+'</span></a></div>'+
			'				<div style="margin-top:10px"><span style="text-align:center;display:block;font-size:12;color:#ffffff;font-weight:400;">分支行人数</span></div>'+
			'            </div>'+
			'        </div>'+
			'    </div>'+
			'</div>');
	$('#emp_compcount').append(cellObj);
	}
}

var filterParam = {};
var queryParams;
function grid_emp_compcount_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_compcount_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4465;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=4465;
	pageReqeust.isView=null;
	if(heightGadedata_4465!=null&&heightGadedata_4465!=undefined){
		pageReqeust.heightGrade = heightGadedata_4465;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
var filterParam = {};
var queryParams;
function grid_emp_depcount_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_depcount_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4464;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4464;
	pageReqeust.isView=null;
	if(heightGadedata_4464!=null&&heightGadedata_4464!=undefined){
		pageReqeust.heightGrade = heightGadedata_4464;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
var filterParam = {};
var queryParams;
function grid_comp_COM_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_comp_COM_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4402;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4402;
	pageReqeust.isView=null;
	if(heightGadedata_4402!=null&&heightGadedata_4402!=undefined){
		pageReqeust.heightGrade = heightGadedata_4402;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_comp_COM_LIST_fun11_4402(){
	$('#comp_COM_LIST_List').bootstrapTable('refresh');
}
var filterParam = {};
var queryParams;
function grid_Numberofcadres_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Numberofcadres_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4436;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4436;
	pageReqeust.isView=null;
	if(heightGadedata_4436!=null&&heightGadedata_4436!=undefined){
		pageReqeust.heightGrade = heightGadedata_4436;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Numberofcadres_fun11_4436(){
	$('#Numberofcadres_List').bootstrapTable('refresh');
}
var filterParam = {};
var queryParams;
function grid_JOBRANK_TXBT_LIST_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_EMP_V_JOBORDER_LIST_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4432;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4432;
	pageReqeust.isView=null;
	if(heightGadedata_4432!=null&&heightGadedata_4432!=undefined){
		pageReqeust.heightGrade = heightGadedata_4432;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
var filterParam = {};
var queryParams;
function grid_Agestructuremap_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_Agestructuremap_filter')){
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4438;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4438;
	pageReqeust.isView=null;
	if(heightGadedata_4438!=null&&heightGadedata_4438!=undefined){
		pageReqeust.heightGrade = heightGadedata_4438;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_Agestructuremap_fun11_4438(){
	$('#Agestructuremap_List').bootstrapTable('refresh');
}
var filterParam = {};
var queryParams;
function grid_MAXEDUCATION_lidt_fun(pageReqeust,val){
	var _filterdata={};
	if(val!=null&&val!=undefined){
		_filterdata={EMPVMAXEDUCATION_T1:val};
	}
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4444;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_4444;
	pageReqeust.isView=null;
	if(heightGadedata_4444!=null&&heightGadedata_4444!=undefined){
		pageReqeust.heightGrade = heightGadedata_4444;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_MAXEDUCATION_lidt_fun11_4444(){
	$('#MAXEDUCATION_lidt_List').bootstrapTable('refresh');
}


function loaddata(){
var ANNOUNCEMENT_TITLE = $("#ANNOUNCEMENT_TITLE").val();
var url = "/myehr/announcement/queryAnnouncement.action?ANNOUNCEMENT_TITLE="+ANNOUNCEMENT_TITLE; 
$.ajax({
		url:url,
		cache: true,
		success: function (result) {
			setData(result);
		}
	});

}
//
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

function setData(list){
	var temp = '';
	for(var i=0; i<4; i++){
		temp += '<li style="height:30px">'+
				'	<p style="font-size:14px;float:left;width:100px">['+formatDateTime(list[i].createTime)+']</p><p style="font-size:14px;float:left;"><a href="#" onclick="show('+list[i].id+')">'+list[i].title+'</a></p>'+
				'</li>';
	}
	$("#content").html(temp);
}

function show(id){
	var idx = id+1000;///myehr_0_SQLSERVER/WebRoot/jsp/announcement/announcementDetail.jsp
	parent.addTab(idx,"新闻详情","/myehr/jsp/announcement/announcementDetail.jsp?id="+id);
}	

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

function changeDataForBing(){
	queryAllData_4445();
}