<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>		
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/tableExport.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/assets/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/date-format.js"></script>
</head>

<body>
<div class="container-fluid" style="margin:10px 10px 10px 10px;"> 
	<div id="toolbar" class="btn-group" style="width:400px;">
		
		<div style="margin-right:10px;display:none;" >
			<select id="deleteMark" name="deleteMark" style="height:30px;width:40px" >  
					<option value="N">否</option>  
					<option value="Y">是</option>
			</select> 
		</div>
	           
		<div class="input-group"  style="margin:0 10px 10px 20px;width:400px;">
			<label  style="float:left;display:block;margin:0 10px 0 0 ; ">用户信息：  </label><input type="text" id="search" class="form-control" style="float:left;width:100px;">
    	
    	
			<button id="import1"  class="btn btn-primary" onclick="reload()"style="float:left;margin:0 0 0 50px;">
				<i class="glyphicon glyphicon-plus"></i> 查询
			</button>
		</div>
		
		<div>
			<div style="margin-right:10px;"> 
				<button id="addUser"  class="btn btn-primary" onclick="addUser()"   >
					<i class="glyphicon glyphicon-plus"></i> 选择
				</button>
			</div>
		
		</div>
	   
	</div>
	
            
	<table id="sysUserList" >  
	</table>  <!-- 留意-->  
</div>
    
<script>
	var roleId=getQueryString("roleId");


	$(function() {  
	    querys(); 
 		reload();
	});
  
function querys() {
    $("#delete").attr({"disabled":"disabled"});  
    
    $("#sysUserList").bootstrapTable({  
        url : '',  
        height : '700',  
        undefinedText : '-', 
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        showColumns : true, // 显示隐藏列  
        showRefresh : true, // 显示刷新按钮  
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
         singleSelect  : true,               //单选    
         clickToSelect: true,                //是否启用点击选中行
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '用户编码',  
            field : 'userCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
             
        }, {  
            title : '用户名称',  
            field : 'userName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
          
        }],
        
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	    })  ;
	}  
	
	
	//用户角色授权
	function addUser(){
    	var selects = $("#sysUserList").bootstrapTable('getSelections');
    	if(selects.length!=1){
    		alert("请选择用户");
    	}else{
    		var condition =new Object();
    		condition.roleId=roleId;
    		condition.userId=selects[0].userId;
	    	var data = JSON.stringify(condition);
			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysUserRoleController/insertSysUserRole.action",
				data: data,
				dataType: 'JSON',
				success: function (data, textStatus, jqXHR) {
					alert("授权成功");
					closex();
				},
				error: function () { alert("error");}
			});
		}
	}
	
	
	function reload(){
		var deleteMark=$("#deleteMark").val();
		var userName=$("#search").val();
		var condition = new Object();
		condition.roleId=roleId;
		condition.deleteMark=deleteMark;
		condition.userName=userName;
		var data=JSON.stringify(condition);
		$.ajax({
                type: 'POST',
                url: "${pageContext.request.contextPath }/SysUserList/findSysUser.action",
                data: data,
                dataType: 'JSON',
                success: function (data, textStatus, jqXHR) {
                    $("#sysUserList").bootstrapTable('load',data); 
                },
                error: function () {alert("error");}
            });

	
	}
	function closex(){
		 window.parent.location.reload(); //刷新父页面
		 var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
		 parent.layer.close(index); //执行关闭
	}
	

	


	/** 替换数据为文字 */  
	function genderFormatter(value) {  
	    if (value == null || value == undefined) {  
	        return "-";  
	    } else if (value==1) {  
	        return "已删除";  
	    } else if(value==0){  
	        return "正常";  
	    }  
	}  
	/** 刷新页面 */  
	function refresh() {  
	    $('#sysUserList').bootstrapTable('refresh');  
	}  
	
	/**取url参数值    多个 ？？？？ */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	}
	
	
	
</script>  
</body>
</html>