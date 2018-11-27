<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<body>

<div class="container-fluid"> 
    <div class="row cell" style = "padding:10px 0 0 15px">
	    <div class="BTNGROUP_55" style="margin:0 auto; min-height: 20px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="lead"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="lead()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="close"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
			</div>
			<div id="grid_ORG_comp_info_filter" style="float:right;display:inline-block;position:relative;">
				<input id="search" name="search" placeholder="Search" style="padding: 6px 30px 6px 10px;height:22px" title="Search" type="text" class="form-control" oninput="search()" />
				<i class="icon-search" style="position: absolute;right: 12px;top:1px;cursor: pointer;"></i>
			</div>
		</div>
		<table id="tableNameList">
		</table>
	</div>
</div>
    
    
<script>
	$(function() {  
    	querys();  
	})
  
function querys() {   
    $("#tableNameList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/EntityList/findTableList.action',  
        height : '700',  
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存   
        toolbar : "#toolbar",// 指定工具栏  
        clickToSelect: true,
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [{  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '数据表编码',  
            field : 'entityCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle'
        }, {  
            title : '数据表名',  
            field : 'entityChinaname', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle',
            hidden:true
        }], 
    });
        $('#tableNameList').bootstrapTable('hideColumn', 'entityChinaname');
}   
	
	/** 刷新页面 */  
	function refresh() {  
	    $('#tableNameList').bootstrapTable('refresh');  
	}  
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {  
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.condition = $("#search").val();
	    return pageReqeust;  
	}
  	function lead(){
  		var data = getSelectrows();
  		var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
  		if(data.length==1){
		parent.$("#entityCode").val(data[0].entityCode.toUpperCase( ));
		parent.$("#entityChinaname").val(data[0].entityChinaname);
		closex();
  		}
  		else{
  		alert("请只选中一条数据");
  		} 
	}
	
	
	
	function getSelectrows(){
        var data=$("#tableNameList").bootstrapTable('getSelections');
        return data;
	}
	
	function closex(){
		 var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		 parent.layer.close(index); //执行关闭
	}
	
	//查询
	function search(){
		$("#tableNameList").bootstrapTable('refresh');
	}
</script>  
</body>
</html>
