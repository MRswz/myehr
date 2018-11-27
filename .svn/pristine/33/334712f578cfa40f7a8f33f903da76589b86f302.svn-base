<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<html>
<head>
<style type="text/css">
	td{padding: 3px 8px 3px!important;}
</style>
</head>
<body>

    <div class="container-fluid" style="height:100%;padding-top: 20px;">
		<div>
			<div style="margin:0 auto; display:inline-block;height: 35px;">
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="pick"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择实体")%> onclick="pick()"/>
				</div>
			</div>
			<div id="grid_ORG_comp_info_filter" style="float:right;display:inline-block;position:relative;">
				<input id="search" name="FILTER_1003" placeholder="Search" style="padding: 6px 30px 6px 10px;" title="Search" type="text" class="form-control" oninput="search()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 7px;cursor: pointer;"></i>
			</div>
		</div>
		<table id="EntityTableList" >  
        </table>  <!-- 留意--> 
	</div>
    
<script>
	var entityType = '${param.entityType}';
	$(function() {  
	    querys();
	    $(".fixed-table-body").css("height","74%");
	})
    var datarows;
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
	/**取url参数值  */
	function getQueryString(name) {
	    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	    var r = window.location.search.substr(1).match(reg);
	    if (r != null) return unescape(r[2]); return null;
	}
	function querys() {   
    $("#EntityTableList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/EntityList/searchEntityListByTemplate.action',  
        height : '520',  
        undefinedText : '-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        clickToSelect: true,
        uniqueId : "entityTablename", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        tableLayout:"fixed",//列宽一致对其
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '实体编码',  
            field : 'entityCode', // 字段  
            align: 'center',
            valign: 'middle',  
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"entityCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体编码\" value=\""+value+"\"/>";
                	}
        }, {  
            title : '实体名',  
            field : 'entityTablename',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"entityTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"用户编号\" value=\""+value+"\"/>";
                	}
        }, {  
            title : '实体分类',  
            field : 'entityType',  
            align : 'center',  
            valign : 'middle',  
            visible: false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true name=\"entityType\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"姓名\" value=\""+value+"\"/>";                    	
                	}
        }, {  
            title : '实体中文名',  
            field : 'entityChinaname',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true  name=\"entityChinaname\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体中文名\" value=\""+value+"\"/>";
                	}
        }, {  
            title : '排序',  
            field : 'entitySort',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
            	return "<input class=\"form-control\" readonly=true  name=\"entitySort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"排序\" value=\""+value+"\"/>";
        	}  
        }, {  
            title : '操作者',  
            field : 'operatorName',  
            align : 'center',  
            valign : 'middle',   
            visible: false,
            formatter: function (value, row, index) {
                    	return "<input class=\"form-control\" readonly=true  name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\" value=\""+value+"\"/>";
                	}
        }, {  
            title : '操作时间',  
            field : 'operatorTime',  
            align : 'center',  
            valign : 'middle',  
            visible: false,
            formatter: function (value, row, index) {
            			if(value!=null&&value!="undefined"){
            				value = new Date(parseInt(value)).toLocaleString().replace(/:\d{1,2}$/,' ');
            			}
                    	return "<input class=\"form-control\" readonly=true  name=\"operatorTime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\" value=\""+value+"\"/>";
                	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                datarows = row;
	                $('#EntityTableList').bootstrapTable('uncheckAll'); 
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	               
	            },
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
    
}  

	function add(){
		 datarows=getSelectrows();
		 $('#EntityTableList').bootstrapTable('insertRow', {index:$('#EntityTableList').bootstrapTable('getOptions').totalRows,row:datarows});
	}
	

	

//查询
	function search(){
		refresh();
	}
 
	/** 刷新页面 */  
	function refresh() {  
	    $('#EntityTableList').bootstrapTable('refresh');  
	}  
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {
		pageReqeust.condition = $("#search").val();
		pageReqeust.entityType=getQueryString("entityType");
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.deleteMark = '${param.templateId}';
	    pageReqeust.sort = 'entity_sort';
	    return pageReqeust;  
	}   
	
	function getSelectrows(){
        var data=$("#EntityTableList").bootstrapTable('getSelections');
        return data;
	}
	/**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	} 
	function pick(){
		var data = getSelectrows();
		parent.tranData(data);
	}
</script>  
</body>
</html>