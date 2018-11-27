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
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/select2.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/select2/js/select2.full.js"></script>
	<link href="${pageContext.request.contextPath }/js/select2/css/select2.min.css" type="text/css" rel="stylesheet" />
	
	
	
	
	
	<style type="text/css">
		body{font-size:10px;	 }
		option{font-size:10px;	 }
		
	
	
	</style>
</head>


<body>
	<div>
		<div class="container-fluid" > 
			<div >
				 <div style="margin-right:10px;float:left;height:30px;padding-top:7px; ">
				 	<label style="text-align:center;  line-heighe:30px;flaot:left;padding:3px;"> 角色编码</label>
				 </div>
				<div class="input-group"  style="margin-right:10px;float:left;width:150px">
					<input type="text" id="roleCode" class="form-control" >
		    	</div>
		    	
				 <div style="margin-right:10px;float:left;height:30px;padding-top:7px; ">
				 	<label style="text-align:center;  line-heighe:30px;flaot:left;padding:3px;">  用户名称</label>
				 </div>
				<div class="input-group"  style="margin-right:10px;float:left;width:150px">
					<input type="text" id="roleName" class="form-control"  >
		    	</div>
		    	<div style="margin-right:10px;float:left">
			    	<label>生效标识 </label>
					<select id="roleStatus" name="roleStatus" style="height:30px;width:60px" >
							<option value="" >全部</option>  
							<option value="N">否</option>  
							<option value="Y">是</option>
					</select> 
				</div>
				<div style="margin-right:10px;float:left">
					<label>删除标识 </label>
					<select id="deleteMark" name="deleteMark" style="height:30px;width:60px" >  
							<option value="N">否</option>  
							<option value="Y">是</option>
					</select> 
				</div>      
		    	<button id="addUser"  class="btn btn-primary"  onclick="search()">
						 搜索
				</button>
			</div>
			
			<div style="margin-top:5px; ">
				<div style="margin-right:10px;float:left"> 
					<button id="addUser"  class="btn btn-primary"  onclick="addRole()">
						 增加
					</button>
				</div>
				<div style="margin-right:10px;float:left"> 
					<button id="edit" class="btn btn-primary"  onclick="editRole()">
						 修改
					</button>
				</div>
			    <div style="margin-right:10px;float:left"> 
			        <button id="remove" class="btn btn-primary"  onclick="deleteRole();">
			          	 删除
				    </button>
				</div>
				<div style="margin-right:10px;float:left"> 
				    <button id="recover" class="btn btn-primary"  onclick="recoverRole();">
				            恢复
				    </button>
				</div>
			</div>
		            
			<table id="SysRoleList" >  
			</table>  <!-- 留意-->  
		</div>
    </div>
<script>


	$(function() {  
	    querys();  
	});
 				 
function querys() {
    $("#delete").attr({"disabled":"disabled"});  
    $("#SysRoleList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/SysRoleList/searchSysRoleList.action',  
        height : '700',  
        undefinedText : '-', 
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        showColumns : true, // 显示隐藏列  
        showRefresh : true, // 显示刷新按钮  
        uniqueId : "roleName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        singleSelect:"true",
        clickToSelect:"true",
        columns : [  {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        },{  
            //field: 'Number',//可不加  
            title: '序号',//标题  可不加  
            formatter: function (value, row, index) {  
                return index+1;  
            }  
        }, {  
            title : '角色编码',  
            field : 'roleCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
             
        }, {  
            title : '角色名称',  
            field : 'roleName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
          
        }, {  
            title : '角色描述',  
            field : 'roleDesc',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            
        }, {  
            title : '角色类型',  
            field : 'roleType',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
           
        }, {  
            title : '上级角色编码',   
            field : 'roleParentCode',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            
        }, {  
            title : '角色生效标识',  
            field : 'roleStatus',   
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
        },{  
            title : '角色生效时间',  
            field : 'roleTimeStart',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
         			var date = "-";
         			if(value!=null){
         				date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
         			}
                 	return date;
             	}
            
        },{  
            title : '角色失效时间',  
            field : 'roleTimeEnd',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
         			var date = "-";
         			if(value!=null){
         				date = new Date(value).Format("yyyy-MM-dd");
         			}
                 	return date;
             	}
        },{  
            title : '操作者',  
            field : 'operatorName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            
		}, {  
            title : '操作时间',  
            field : 'operatorTime',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			var date = "-";
            			if(value!=null){
            				date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
            			}
                    	return date;
                	}
           
        }, {  
            title : '删除标识',  
            field : 'deleteMark',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            
           }],
        
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#SysRoleList a").editable({
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                        var data = JSON.stringify(curRow);
	                        $.ajax({
	                            type: 'POST',
	                            url: "${pageContext.request.contextPath }/SysRoleList/updateSysRole.action",
	                            data: data,
	                            dataType: 'JSON',
	                            success: function (data, textStatus, jqXHR) {
	                                alert('保存成功！');
	                            },
	                            error: function () {alert("error");}
	                        });
	                    },
	                    type: 'text'
	                });
	            },
                data:[{id:1,liushuiid:2},{id:1,liushuiid:2}],
          		
          		
          		
	        responseHandler : function(res) {  
	            return {  
	                total : res.total,  
	                rows : res.rows  
	            };  
	        } 
	         
	    })  ;
	}  
	var roleParentCode = "<%=request.getParameter("parentCode")%>" ;

    /*新增  */
    function addRole(){
    	
			layer.open({
				type: 2,
				title: '新增用户',
				shadeClose: true,
				shade: 0.8,
				tips:2,
				area: ['65%', '55%'],
				content: 'AddSysRole.jsp?roleParentCode='+roleParentCode ,//iframe的url
				success:function(layero,index){
		        },
				end:function(){
						querys();
					}
			});
		
	}
	
        
    /*编辑用户信息  */
    function editRole(){
    	var selects = $("#SysRoleList").bootstrapTable('getSelections');
    	if(selects.length>1){
    		alert("请选择单行数据编辑");
    	}else if(selects.length>0){
    		var roleId = selects[0].roleId;
    		layer.open({
				type: 2,
				title: '编辑用户信息',
				shadeClose: true,
				shade: 0.8,
				area: ['70%', '55%'],
				content: 'EditSysRole.jsp?roleId='+roleId //iframe的url
			});
    	}else{
    		alert("请选择一行数据！");
    	}
	}

	/*删除  多选的时候只删除了选择第一个       待解决  */
    function deleteRole(){
    	var selects = $("#SysRoleList").bootstrapTable('getSelections');
    	if(selects.length!=1){
    		alert("请选择单行数据编辑");
    	}else{
    		
    		var r=new Object();
    		r.roleId=selects[0].roleId;
    		var role = getRole(r);
	    	var data = JSON.stringify(role);
	    	
			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysRoleList/deleteSysRole.action",
				data: data,
				dataType: 'JSON',
				success: function (data, textStatus, jqXHR) {
					alert('删除成功！');
					refresh();
				},
				error: function () { alert("error");}
			});
		}
	}
	
	/*恢复  */
    function recoverRole(){
    	var selects = $("#SysRoleList").bootstrapTable('getSelections');
    	if(selects.length!=1){
    		alert("请选择单行数据编辑");
    	}else{
		   	var data = JSON.stringify(selects[0]);
			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysRoleList/recoverSysRole.action",
				data: data,
				dataType: 'JSON',
				success: function (data, textStatus, jqXHR) {
					alert('恢复成功！');
					refresh();
				},
				error: function () { alert("error");}
			});
		}
	}
	
	//查询
	function search(){
		var condition=new Object();
		condition.search = $("#search").val();
		condition.deleteMark = $("#deleteMark").val();
		condition.roleStatus = $("#roleStatus").val();
		refresh();
	}
	 
	
	/**查询条件 */  
	function queryParams(pageReqeust) {
		pageReqeust.deleteMark = $("#deleteMark").val();
		pageReqeust.roleName = $("#roleName").val();
		pageReqeust.roleCode = $("#roleCode").val();
		pageReqeust.roleStatus = $("#roleStatus").val();
		
		var parentCode = "<%=request.getParameter("parentCode")%>" ;
		
		if(parentCode!=null && parentCode !="" && parentCode!="null"){
			pageReqeust.parentCode =parentCode ;
		}else{
			pageReqeust.parentCode ="" ;
		}
	    return pageReqeust;  
	} 
	
	
	/* 
	动态查询	
	
	$("#deleteMark").bind('input propertychange', function() {
    	var condition=new Object();
		condition.deleteMark = $("#deleteMark").val();
		refresh();
	});
	
	$("#roleStatus").bind('input propertychange', function() {
    	var condition=new Object();
		condition.deleteMark = $("#roleStatus").val();
		refresh();
	}); */

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
	    $('#SysRoleList').bootstrapTable('refresh');  
	}  
	
	/**取url参数值    多个 ？？？？ */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	}
	function getRole(e){
		var data=JSON.stringify(e);
		var role=new Object(); 
		$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysRoleList/findSysRoleById.action",
				data: data,
				 async: false,
				dataType: 'JSON',
				success: function (data) {
					role=data;
				},
				error: function () { alert("error");}
			});
		return role;
		
	}




</script>  
</body>
</html>