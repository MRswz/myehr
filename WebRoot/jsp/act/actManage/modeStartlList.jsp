<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<style type="text/css">


#tt:hover
{
color:red;

}

</style>

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
			    <input type="button" id="addorg_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"发起")%> onclick="startProcess()"/>
			</div>
		</div>
			<div id="grid_org_list_filter" style="float:right;display:inline-block;position:relative;">
				<input id="FILTER_1041" name="FILTER_1041" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"图标名称")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"图标名称")%>" type="text" class="form-control" oninput="grid_org_list_fun11()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</div>
</div>
<table id="org_list_List">
</table>
</div>
<script>
$(function() {
    querys_1041();	
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
        $("#org_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/act/model/searchActModelList.action',
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
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"模型ID")%>',
                field : 'id',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"id\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"模型ID\">"+value+"</a>";
                }
            },
			 {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"乐观锁")%>',
                field : 'rev',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"rev\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"乐观锁\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"流程名称")%>',
                field : 'name',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
					if(value==undefined){
						value='-';
					}
					return "<a  class=\"eli w400\" id=\"tt\" style=\"font-size:14px;text-decoration:none;text-decoration:underline;width:300px;\" name=\"name\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"流程名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"模型KEY")%>',
                field : 'key_',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					if(value==undefined){
						value='-';
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"key\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"模型KEY\">"+value+"</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"创建时间")%>',
                field : 'createTime',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					var date = "-";
					if(value!=null){
						date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"createTime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"创建时间\">"+date+"</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最后更新时间")%>',
                field : 'lastUpdateTime',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					var date = "-";
					if(value!=null){
						date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"lastUpdateTime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"最后更新时间\">"+date+"</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"版本")%>',
                field : 'version',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					if(value==undefined){
						value='-';
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"version\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"版本\">"+value+"</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"流程定义信息")%>',
                field : 'metaInfo',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					if(value==undefined){
						value='-';
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"metaInfo\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"流程定义信息\">"+value+"</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部署ID")%>',
                field : 'deploymentId',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					if(value==undefined){
						value='-';
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"deploymentId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"部署ID\">"+value+"</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"editorSourceValueId")%>',
                field : 'editorSourceValueId',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					if(value==undefined){
						value='-';
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"editorSourceValueId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"editorSourceValueId\">"+value+"</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"editorSourceExtraValueId")%>',
                field : 'editorSourceExtraValueId',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					if(value==undefined){
						value='-';
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"editorSourceExtraValueId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"editorSourceExtraValueId\">"+value+"</a>";
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"tenantId")%>',
                field : 'tenantId',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
					if(value==undefined){
						value='-';
					}
					return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"tenantId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"tenantId\">"+value+"</a>";
				}
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
            onClickCell: function (field,value,row, $element) {
                if(field=='name'){
                	startProcessx(row);
                }
            },
			onLoadSuccess: function (aa, bb, cc) {
                $("#org_list_List a").editable({
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
                    $('#org_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#org_list_List').bootstrapTable(
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
    $('#org_list_List').bootstrapTable('refresh'); 
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
function startProcess(){
	var selects = $("#org_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	var formId = select.actNodeFormId;
	var businessId = selectBussinessIdByFormId(formId);
	var url='/myehr/form/toForm.action?formId='+formId+'&businessId='+businessId+'&id='+select.id+'&key='+select.key_+'&flowAction=start';
	var title = select.name;
	var indexLoading = layer.load(1, {shade: [0.1,'#fff'] });
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
			layer.close(indexLoading);
			$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}

function startProcessx(e){
	var select = e;
	var formId = select.actNodeFormId;
	var businessId = selectBussinessIdByFormId(formId);
	var url='/myehr/form/toForm.action?formId='+formId+'&businessId='+businessId+'&id='+select.id+'&key='+select.key_+'&flowAction=start';
	var title = select.name;
	var indexLoading = layer.load(1, {shade: [0.1,'#fff'] });
	layer.open({
		type: 2,
		title:title,
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
			layer.close(indexLoading);
			$('.layui-layer-max').click();
		},
		end:function(){
			    refresh_org_list();
		}
	});
}

function selectBussinessIdByFormId(formId){
	var dataId = '';
	$.ajax({  
		url: '${pageContext.request.contextPath }/form/selectBussinessIdByFormId.action?formId='+formId,  
		type: 'POST', 
		cache: false,
	    async: false,		
		success: function (data) {  
			dataId = data;
		}
	});
	return dataId;
}

function grid_org_list_fun(pageReqeust){
	var _filterdata={};
	
	var searchValue = document.getElementById("FILTER_1041").value;
	_filterdata={searchValue:searchValue};
	var userId = '${sessionScope.userid}';
	var paramsMap = {userId:userId};
	var requestParam={};
	
	requestParam = {flowType:'${param.flowType}'};
	
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=_formId_1041;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_org_list_fun11(){
	$('#org_list_List').bootstrapTable('refresh');
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

function closex() {    
	var index = parent.layer.getFrameIndex(window.name);
		parent.layer.close(index);//执行关闭
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
