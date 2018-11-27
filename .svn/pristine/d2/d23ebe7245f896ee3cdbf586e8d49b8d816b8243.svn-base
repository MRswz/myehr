<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/examples.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.min.css" type="text/css">
   
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-editable.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/tableExport.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
  </head>
	  
  <body>
		
			<div style="width:750px;height:400px;margin:0 auto; padding:15px 0 0 0;   ">   <!-- 列表 -->
			    <div id="toolbar">
			        <button id="add" class="btn btn-info" onclick="append()">
			            <i class="glyphicon glyphicon-plus"></i> 选择
			        </button>
			       
			    </div>
			    <div class="input-group" style="float:right;width:300px;margin-top:10px;">
		      	  	<input  id="search" type="text" class="form-control" placeholder="Search">
		      	  	 <button id="add" class="btn btn-info" onclick="search()">
			            <i class="glyphicon glyphicon-plus"></i> 搜索
			        </button>
		    	</div>
		    	
			    <table id="tradeList">
			    </table>\</div>
  </body>
  
  	<script type="text/javascript">
	  	$(function () {
	        //1.初始化Table
	        var oTable = new TableInit();
	        oTable.Init();
	    
	    });
  	
  	var TableInit = function () {
        var oTableInit = new Object();
        //初始化Table
        oTableInit.Init = function () {
            $('#tradeList').bootstrapTable({
                url: "${pageContext.request.contextPath }/SysUserList/findSysUser.action",         //请求后台的URL（*）
                method: 'post',                      //请求方式（*）
                toolbar: '#toolbar',                //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParams: oTableInit.queryParams,//传递参数（*）
                sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber:1,                       //初始化加载第一页，默认第一页
                pageSize: 10,                       //每页的记录行数（*）
                pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                strictSearch: true,
                clickToSelect: true,                //是否启用点击选中行
                height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "id",                     //每一行的唯一标识，一般为主键列
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                columns: [{  
		            field : 'state',  
		            checkbox : true,  
		            align : 'center',  
		            valign : 'middle'  
		        }, {
                    field: 'orgAbbreviation',
                    width: '191',
                    title: '机构简称'
                },{
                    field: 'empCode',
                    width: '191',
                    title: '工号' 
                }, {
                    field: 'empChinaName',
                    width: '191',
                    title: '姓名',
                }, {
                    field: 'empTime',
                    width: '191',
                    title: '入职时间'
                    
                },{
                    field: 'empStatus',
                    width: '191',
                    title: '入职时间'
                    
                },{
                    field: 'empWorkLine',
                    width: '191',
                    title: '行内工作年限'
                    
                }],
            });
           
        };
        return oTableInit;
    };
  	
  	 
 
  	 
  	 
  	 
  	 
    /* 复选框 */
    function stateFormatter(value, row, index) {
        if (row.id === 2) {
            return {
                disabled: true,
                checked: true
            };
        }
        if (row.id === 0) {
            return {
                disabled: true,
                checked: true
            };
        }
        return value;
    }
    
	
	function save(){
		//获取选中行
		
	    $.ajax({  
                  type: 'POST',  
                  data: data,  
                  url: "${pageContext.request.contextPath }/SysUserList/insertSysUser.action",  
                  success: function (data) {  
                      alert('添加成功');
                      window.location.href = window.location.href; 
                  }  
              });
        }
	
	function search(){
		var pager=new Object();
		pager.condition=document.getElementById("search").value;
		pager.deleteMark="Y";
			$.ajax({  
                  type: 'POST',  
                  data: pager,  
                  url: '${pageContext.request.contextPath }/SysUserList/search.action',  
                  success: function (data) {  
                      $("#tradeList").bootstrapTable('load',data); 
                  }  
              });
	}
	
	
  	</script>
  
  
  
</html>
