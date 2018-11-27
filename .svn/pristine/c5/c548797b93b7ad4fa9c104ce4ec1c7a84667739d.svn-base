<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<style>
		.clearfix {display:none}
		#FieldList>tbody>tr>td{font-size:12px}
	</style>
</head>
<body>
<div class="container-fluid"> 
    <div class="row cell" style = "padding:10px 0 0 6px">
	    <div class="BTNGROUP_55" style="margin:0 auto; min-height: 20px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="close"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex()"/>
			</div>
			<div id="grid_ORG_comp_info_filter" style="float:right;display:inline-block;position:relative;">
				<input id="search" name="search" placeholder="Search" style="padding: 6px 30px 6px 10px;height:22px" title="Search" type="text" class="form-control" oninput="refresh()" />
				<i class="icon-search" style="position: absolute;right: 12px;top:1px;cursor: pointer;"></i>
			</div>
		</div>
		<table id="FieldList">
		</table>
	</div>
</div>    
<script>
	$(function() {  
    querys();  
})  ;
  
function querys() {   
    $("#FieldList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/FieldList/findStandardsFieldList.action',  
        height : '700',  
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        toolbar : "#toolbar",// 指定工具栏  
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '列名称',  
            field : 'fieldCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true 
        }, {  
            title : '列中文',  
            field : 'fieldName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '表名称',  
            field : 'tableCode',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '表中文',  
            field : 'tableName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '实体名称',  
            field : 'entityCode',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
            }, {  
            title : '列英文',  
            field : 'fieldEnglishname',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '是否必录',  
            field : 'isrequired',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  
        },  {  
            title : '数据库主键',  
            field : 'ispk',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },  {  
            title : '业务主键',  
            field : 'isnk',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },  {  
            title : '数据类型',  
            field : 'fieldType',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },  {  
            title : '类型长度',  
            field : 'fieldLen',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}
/**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	} 

	
	
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {  
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.fieldEntityId = '${param.EntityId}';
	    pageReqeust.condition = $("#search").val().replace(/(^\s+)|(\s+$)/g,"");
	    pageReqeust.sort = 'dt_id';
	    return pageReqeust;  
	}


	function save(){
		var datas = JSON.stringify(getSelectrows());
		$.ajax({  
                  type: 'POST',  
                  data: datas,
                  url: '${pageContext.request.contextPath }/FieldList/leadStandartsField.action',  
                  success: function (data) {  
                      if(data==2)
                  	  {
                  	  	alert('字段名重复');
                  	  }else if(data==1){
                  	  	alert('建字段异常');
                  	  }else{
                  	  	alert('全部成功');
	               		refresh();
	               		closex();	
                  	  }
                  }  
              }); 
	}
	
	function getSelectrows(){
        var data=$("#FieldList").bootstrapTable('getSelections');
        return data;
	}
	
	function closex(){
		 var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		 parent.layer.close(index); //执行关闭
	}
	
	/** 刷新页面 */  
	function refresh() {  
	    $('#FieldList').bootstrapTable('refresh');  
	}  
</script>  
</body>
</html>
