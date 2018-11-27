<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
	td{padding: 3px 8px 3px!important;}
</style>
<body>
    <div class="container-fluid" style="height:100%;padding:20px 10px 0 10px;">
		<div >
			<div style="margin:0 auto; display:inline-block;height: 35px;">
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="chooseFieldId"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"映射ID字段")%> onclick="chooseFieldId('id')"/>
				</div>
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="chooseFieldPid"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"映射PID字段")%> onclick="chooseFieldId('pid')"/>
				</div>
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="closeHtml"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closeHtml()"/>
				</div>
			</div>
			<div id="grid_ORG_comp_info_filter" style="float:right;display:inline-block;position:relative;">
				<input id="search" name="FILTER_1003" placeholder="Search" style="padding: 6px 30px 6px 10px;" title="Search" type="text" class="form-control" oninput="search()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
			</div>
		</div>
		<table id="FieldList" >  
        </table>  <!-- 留意--> 
	</div>
<script>
	$(function() {  
    	querys(); 
    	$(".fixed-table-body").css("height","72%");
	})  
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
  	
function querys() {   
    $("#FieldList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/FieldList/findFieldListByEntityId.action',
		contentType: 'application/json;charset=utf-8',
        dataType:'json',
        method:'post',
        pagination : false, // 分页  
        height:'578',
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageSize : 10,
        undefinedText : '-', 
        pageList : [ 10, 20 ,200 ],  
        clickToSelect: true,
        uniqueId : "fieldCode", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        },
		{
			title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段ID")%>',
			field : 'fieldId',
			align : 'center',
			visible : false,
			valign : 'left',
			formatter: function (value, row, index) {
				if(value==undefined){
					value='-';
				}
				return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"fieldId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段ID\">"+value+"</a>";
			}
		},
		{
			title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"实体ID")%>',
			field : 'fieldEntityId',
			align : 'center',
			visible : false,
			valign : 'left',
			formatter: function (value, row, index) {
				if(value==undefined){
					value='-';
				}
				return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"fieldEntityId\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体ID\">"+value+"</a>";
			}
		},
		{
			title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段编码")%>',
			field : 'fieldCode',
			align : 'center',
			visible : true,
			valign : 'left',
			formatter: function (value, row, index) {
				if(value==undefined){
					value='-';
				}
				return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"fieldCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段编码\">"+value+"</a>";
			}
		},
		{
			title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段名称")%>',
			field : 'fieldName',
			align : 'center',
			visible : true,
			valign : 'left',
			formatter: function (value, row, index) {
				if(value==undefined){
					value='-';
				}
				return "<a  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px;\" name=\"fieldName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\">"+value+"</a>";
			}
		},],
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	            },
                data:[],
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
    
    window.operateEvents = {  
                
           };
}  

	 
	
	
//查询
	function search(){
    refresh();      
	}
	
	function getSelectrows(){
	        var data=$("#FieldList").bootstrapTable('getSelections');
	        return data;
	}	
	
	/** 刷新页面 */  
	function refresh() {  
	    $('#FieldList').bootstrapTable('refresh');  
	}  
	
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {  
	    var _filterdata={};
	
		var searchValue = document.getElementById("search").value;
		_filterdata={searchValue:searchValue};
		var userId = '${sessionScope.userid}';
		var paramsMap = {userId:userId};
		var requestParam={};
		var entityId = '${param.entityId}';
		entityId = entityId.replace(/[^0-9]/g,'');
		requestParam = {entityId:entityId};
		
		pageReqeust.paramsMap=paramsMap;
		pageReqeust.requestParam=requestParam;
		pageReqeust.filter=_filterdata;
		pageReqeust.formId=0;
		pageReqeust.isView=null;
		return JSON.stringify(pageReqeust);
	}   
	
	function findbyentityid(){
		refresh();
	}
	
  /**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	}
	
	function isSelect(data){
		var url = "selectParam.jsp?controlType="+data.controlType+"&fieldChinaName="+data.fieldChinaName+"&fieldId="+data.fieldId;
		
		if(data.controlType=="2"){
			layer.open({
				type: 2,
				title:'下拉配置',
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
					refresh();
				}
			});
		}
	}
	
	function chooseFieldId(type){
		var selects = $("#FieldList").bootstrapTable('getSelections');
		if(selects!=null && selects.length>0){
			select = selects[0];
		}else {
			alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
		}
		$.ajax({
			url:'${pageContext.request.contextPath }/EntityList/chooseFieldMapping.action?type='+type,
			type:'post',
			cache: false,
			data:JSON.stringify(select),
			contentType: 'application/json;charset=utf-8',
			async: false,
			success: function (data) { 
        		if(data[0]=='0'){
        			return false;
        		}else{
        			return true;
        		} 
            	refresh();
			}
		});
	}
	
	function closeHtml(){
		parent.closexx();
	}
	
</script>  
</body>
</html>
