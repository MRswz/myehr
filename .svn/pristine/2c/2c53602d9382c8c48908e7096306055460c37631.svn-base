<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;">
	<div style="margin-top:5px;">
		<div class="input-group">
    		<div id="grid_org_list_filter">
	        	<table class="cbs-table" style="margin-bottom:5px">
	            	<tr>
	            	</tr>
	        	</table>
    		</div>
		</div>
		<div class="BTNGROUP_1041" style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%> onclick="selectParams()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="editorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
			</div>
		</div>
		<div id="grid_org_list_filter" style="float:right;display:inline-block;margin-right:155px;position:relative;">
			<input id="FILTER_1041" name="FILTER_1041" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数编码")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数名称")%>" type="text" class="form-control" oninput="grid_org_list_fun11()" />
			<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
		</div>
	</div>
	<table id="scheme_list_List">
	</table>
</div>
<script>
$(function() {
    querys_1041();
	$(".fixed-table-toolbar").css("margin-top","0px");
		$(".container-fluid").css("max-height","100%");
		$(".fixed-table-container").css("height",$('body').height() -58 +"px");
		$(".fixed-table-body").css("height","85%");
	
	    initDict();
	    initDate();
	    console.log($(".BTNGROUP_1041>div").length);
	    var DIVAMOUNT = 5;
	    if($(".BTNGROUP_1041>div").length > DIVAMOUNT){
	    	var len = $(".BTNGROUP_1041>div").length;
	    	$(".BTNGROUP_1041>div:gt(4)").hide();
	    	var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
	    	$(".BTNGROUP_1041").append(selectObj);
	    	for(var i=DIVAMOUNT;i<len;i++){
	    		var liObj = $('<li style="margin-left:14px;"></li>');
	    		liObj.append($(".BTNGROUP_1041>div").eq(i).clone(true));
	    		selectObj.find('.dropdown-menu').append(liObj);
	    		selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
	    	}
	    	selectObj.find('.dropdown-menu div').show();
	    }
	});
	var _formId_1041='1041';
    function querys_1041() {
        $("#scheme_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/param/queryParamList.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '578',
            undefinedText : '-',
            pagination : true,
            striped : true,
            queryParams : grid_org_list_fun,
            cache : false,
            pageSize : 10, 
            pageList : [10,20,50,10000], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [{
                field : 'state',
                checkbox : true,
                align : 'center',
                valign : 'middle'
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
                field : 'defaultXH',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value=index+1;
                    }
                    return "<a style=\"font-size:14px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数Id")%>',
                field : 'sqlParamsId',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"sqlParamsId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数Id\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数名称")%>',
                field : 'sqlParamsName',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"sqlParamsName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数编码")%>',
                field : 'sqlParamsCode',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"sqlParamsCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数编码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参数类型")%>',
                field : 'sqlParamsType',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:60px;\" name=\"sqlParamsType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"参数类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_SQL_PARAMS\"></a>";
                }
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据类型")%>',
                field : 'sqlParamsDataType',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:60px;\" name=\"sqlParamsDataType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"数据类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_SQL_DATA_TYPE\"></a>";
                }
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"控件类型")%>',
                field : 'sqlParamsGuiType',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:60px;\" name=\"sqlParamsGuiType\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"控件类型\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_SQL_DATA_TYPE\"></a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作者")%>',
                field : 'operatorName',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w50\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">"+value+"</a>";
                }
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作时间")%>',
                field : 'operatorTime',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                   var date = "-";
					if(value!=null){
						date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
					}
					return "<a class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">" + date + "</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除标识")%>',
                field : 'deleteMark',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"deleteMark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"删除标识<\">"+value+"</a>";
                }
            }
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                $("#scheme_list_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
            responseHandler : function(res) {  
                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
            'click #remove': function (e, value, row, index) {  
            $.ajax({  
                type: 'POST', 
                data: JSON.stringify(row),  
                url: '${pageContext.request.contextPath }/dictType/removeSysDictType.action',  
                success: function (data) {  
                    alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除成功")%>');
                    window.location.href = window.location.href; 
                    $('#scheme_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#scheme_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
/** 刷新页面 */ 
function refresh_org_list() { 
    $('#scheme_list_List').bootstrapTable('refresh'); 
}
/**查询条件与分页数据 */
function queryParams(pageReqeust) {
    pageReqeust.search = $("#search").val();
    pageReqeust.enabled = $("#enabled").val();
    pageReqeust.querys = $("#querys").val();
    pageReqeust.pageNo = this.offset;
    pageReqeust.pageSize = this.pageNumber;
    return pageReqeust;
}

function selectParams(){
	
	var reportId='${param.reportId}';
	var selects = $("#scheme_list_List").bootstrapTable('getSelections');
	
	var _param={};
    _param.reportId=reportId;
    _param.selectParams=selects;
	$.ajax({
		url: '/myehr/reportForm/saveSelectParam.action',
		type:'post',
		data: JSON.stringify(_param),
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function(datas) { // 获取当前月的数据
			if(datas=="success"){	
				alert("引入成功");
				closex();
			}
		}
	});
}

function editScheme(){
	var selects = $("#scheme_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}

	var url='/myehr/jsp/form/param/editSqlParam.jsp?sqlParamsId='+select.sqlParamsId;
	
	parent.layer.open({
		type: 2,
		title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改参数")%>',
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

function editScheme1(){
	var selects = $("#scheme_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	var url = '';
	var title ='';
	if(select.sqlParamsGuiType==1){
		url='/myehr/jsp/form/param/textboxparam.jsp?sqlParamsId='+select.sqlParamsId+'&guiType=1';
		title ='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改文本参数信息")%>'
	}else if(select.sqlParamsGuiType==2){
		url='/myehr/jsp/form/param/comboBoxparam.jsp?sqlParamsId='+select.sqlParamsId+'&guiType=2';
		title ='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改下拉参数信息")%>'
	}else if(select.sqlParamsGuiType==6){
		url='/myehr/jsp/form/param/datepickerparam.jsp?sqlParamsId='+select.sqlParamsId+'&guiType=2';
		title ='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"修改日期参数信息")%>'
	}

	
	parent.layer.open({
		type: 2,
		title:title,
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


function deleteScheme(){
	var selects = $("#scheme_list_List").bootstrapTable('getSelections');
	var selectId ="";
	if(selects!=null && selects.length>0){
		for(var i=0;i<selects.length;i++){
			selectId+=selects[i].sqlParamsId+",";
		}
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}

	var url='${pageContext.request.contextPath }/param/deleteSqlParam.action?sqlParamsId='+selectId;
	$.ajax({
			url:url,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]==0){
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存失败！")%>");
				}else if(text[0]=='error'){
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
				}else {
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功")%>");
				}
				refresh_org_list();
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
}


function grid_org_list_fun(pageReqeust){
	var _filterdata={};
	
	var searchValue = document.getElementById("FILTER_1041").value;
	_filterdata={searchValue:searchValue};
	var userId = '${sessionScope.userid}';
	var paramsMap = {userId:userId};
	var requestParam={};
	var nodeId = '${param.nodeId}';
	nodeId = nodeId.replace(/[^0-9]/g,'');
	requestParam = {nodeId:nodeId};
	
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=_formId_1041;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_org_list_fun11(){
	$('#scheme_list_List').bootstrapTable('refresh');
}
/**下拉控件 */
var classes = $("select");
var parame={
    id:'',
    value:"N",
    width: "100px",
    height:"45px",
    url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
	  jsonParam:{},
    chang:function (e){
    }
};
function initDict(){
    for(var i=0;i<classes.length;i++){
        parame.id=classes[i].id;
		  var type=$(classes[i]).attr('multiSelect');
        parame.placeholder="";
        parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		  if(type=="true"){
		  	myehr_initSelectMore(parame);
		  }else{
	        myehr_initSelect(parame);
		  }
    }
}
/**初始化日期控件  */
function initDate(){
			$('.form_date1').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date2').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd hh:ii",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 0,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date3').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"hh:ii",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 0,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date4').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 4,  
			 minView: 4,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
} 
/**取url参数值  */
function getQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]); return null;
}
</script>
</body>
</html>
