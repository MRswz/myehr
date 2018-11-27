<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'DemoJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  	<link rel="stylesheet" href="${pageContext.request.contextPath }/css/zTreeStyle/metro.css" type="text/css"></link>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/examples.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.min.css" type="text/css">
   
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-editable.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/tableExport.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/ga.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
    
   
  
  <body>
	  <div id="table" >
		<div class="container">
			<div >   <!-- 用户列表 -->
				<div class="input-group" style="width:550px;clear:both; ">
					
		      	  	<label>姓名： &nbsp</label>
		      	  	<input  id="name" type="text" style="width:150px;" >   &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		      	  	<label>编号： &nbsp</label>
		      	  	<input  id="code" type="text" style="width:150px;" >
		      	  	
		      	  	 <button id="add" class="btn btn-primary" onclick="search()" style="float:right;" >
			            查询
			        </button>
		      	  	
		    	</div>
			    <div id="toolbar">
			        <button id="add" class="btn btn-primary" onclick="appendReal()">
			            增加人员用户
			        </button>
			        <button id="add" class="btn btn-primary" onclick="appendUser()">
			            增加虚拟用户
			        </button>
			        <button id="delete"  class="btn btn-primary" onclick="deleteUser()">
						 删除
					</button>
			    </div>
			    
			    <table id="tradeList">
			    </table>
			</div>
		</div> 
	</div>  
  </body>

  <script>
 	
	//存储每次点中节点的id
 	$(function() {  
	    querys();  
	});
 	
   function querys() {
            $('#tradeList').bootstrapTable({
                url: '${pageContext.request.contextPath }/SysUserRoleController/selectSysUser.action',         //请求后台的URL（*）
                method: 'post',                      //请求方式（*）
                toolbar: '#toolbar',                //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,   				//是否显示分页（*）
                 singleSelect  : true,               //单选    
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParams:queryParams,//传递参数（*）
                sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber:1,                       //初始化加载第一页，默认第一页
                pageSize: 10,                       //每页的记录行数（*）
                pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                strictSearch: true,
                clickToSelect: true,                //是否启用点击选中行
                height: 600,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "id",                     //每一行的唯一标识，一般为主键列
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                columns: [{  
		            field : 'state',  
		            checkbox : true,  
		            align : 'center',  
		            valign : 'middle'  
		        }, {
                    field: 'userCode',
                    width: '191',
                    title: '用户号'
                }, {
                    field: 'userRoleId',
                    width: '191',
                    title: '用户号'
                }, {
                    field: 'userName',
                    width: '191',
                    title: '用户名称'
                }, {
                    field: 'userStatus',
                    width: '191',
                    title: '用户状态'
                }, {
                    field: 'compName',
                    width: '191',
                    title: '单位'
                }, {
                    field: 'orgAbbreviation',
                    width: '191',
                    title: '归属部门或科室'
                },{
                    field: 'roleCode',
                    width: '191',
                    title: '角色编码'
                },{
                    field: 'roleName',
                    width: '191',
                    title: '角色名称'
                },{
                    field: 'empCode',
                    width: '191',
                    title: '员工工号'
                },{
                    field: 'operatorName',
                    width: '191',
                    title: '操作者'
                }, {
                    field: 'operatorTime',
                    width: '191',
                    title: '操作时间'
                }],
                onClickRow: function (row, $element) {
	                curRow = row;
	            },
            });
        }
        
        //隐藏列
        function hide(){
        		 $('#tradeList').bootstrapTable('hideColumn', 'userRoleId');
        	
        }

	//查询
	function search(){
		refresh();
	}
	
	/**查询条件 */  
	function queryParams(pageReqeust) {
		pageReqeust.userName = $("#name").val();
		pageReqeust.userCode = $("#code").val();
		
		var parentCode = "<%=request.getParameter("parentCode")%>" ;
		
		if(parentCode!=null && parentCode!="" && parentCode!="null"){
			
			var roleId= getRoleId(parentCode);
			pageReqeust.roleId =roleId ;
			
		}else{
			pageReqeust.parentCode ="" ;
		}
		
	    return pageReqeust;  
	} 
	
	
	function getRoleId(code){
		var condition=new Object();
		condition.roleCode=code;
		var id;
 		$.ajax({
			    type: 'POST',
			    url: "${pageContext.request.contextPath }/SysUserRoleController/selectRoleId.action",
			    async: false,
			    data:JSON.stringify(condition),
			    success: function (data) {
			    	id=data.roleId;
			    },
			    error: function () { alert("操作有误，请联系管理员");}
			});  	
 			return id;
 	}
	/** 刷新页面 */  
	function refresh() {  
	    $('#tradeList').bootstrapTable('refresh');  
	}  
	
	
	function appendReal(){
		if(checkedRoleId!="" && checkedRoleId!=null ){
			layer.open({
					type: 2,
					title: '编辑用户信息',
					shadeClose: true,
					shade: 0.8,
					area: ['50%', '60%'],
					content: 'jsp/wyc/sysUserRole/appendReal.jsp?roleId='+ checkedRoleId//iframe的url
				});
		}else{
			alert("请选择角色");
		}
	}
	
	
	function deleteUser(){
		var selects = $("#tradeList").bootstrapTable('getSelections');
		if(selects.length>0){
			var condition=new Object();
			condition.userRoleId=selects[0].userRoleId;
			$.ajax({
			    type: 'POST',
			    url: "${pageContext.request.contextPath }/SysUserRoleController/deleteUserRole.action",
			    async: false,
			    data:JSON.stringify(condition),
			    success: function (data) {
			    	refresh();
			    },
			    error: function () { alert("操作有误，请联系管理员");}
			});  	
		}else{
			alert("请选择要删除的数据！");
		}
	
	}
	
	 
	
</script>
  
  
</html>
