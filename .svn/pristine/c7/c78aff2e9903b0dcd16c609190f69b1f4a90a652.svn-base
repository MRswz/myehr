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
<div class="container-fluid"> 
	<div id="toolbar" class="btn-group" >
		
		<div >
				 <div style="margin-right:10px;float:left;height:30px; ">
				 	<label style="text-align:center;  line-heighe:30px;flaot:left;padding:3px;"> 角色编码</label>
				 </div>
				<div class="input-group"  style="margin-right:10px;float:left;width:150px">
					<input type="text" id="userCode" class="form-control" >
		    	</div>
		    	
				 <div style="margin-right:10px;float:left;height:30px; ">
				 	<label style="text-align:center;  line-heighe:30px;flaot:left;padding:3px;">  用户名称</label>
				 </div>
				<div class="input-group"  style="margin-right:10px;float:left;width:150px">
					<input type="text" id="userName" class="form-control"   >
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
		
		
		
		
		<div>
			<div style="margin-right:10px;float:left"> 
				<button id="import1"  class="btn btn-primary" onclick="import1()">
					 引入
				</button>
			</div>
			<div style="margin-right:10px;float:left"> 
				<button id="addUser"  class="btn btn-primary" onclick="addUser()">
					 新增
				</button>
			</div>
			<div style="margin-right:10px;float:left"> 
				<button id="edit" class="btn btn-primary"  onclick="editUser()">
					修改
				</button>
			</div>
		    <div style="margin-right:10px;float:left"> 
		        <button id="remove" class="btn btn-primary"  onclick="deleteUser();">
		          	   删除
			    </button>
			</div>
			
			<div style="margin-right:10px;float:left"> 
			    <button id="recover" class="btn btn-primary"  onclick="recoverUser();">
			                        恢复
			    </button>
			</div>
			<div style="margin-right:10px;float:left"> 
			    <button id="initialize" class="btn btn-primary"  onclick="initialize();">
			     	 初始化密码
			    </button>
			</div>
		
		</div>
		
	   
	</div>
            
	<table id="sysUserList" >  
	</table>  <!-- 留意-->  
</div>
    
<script>
	$(function() {  
	    querys();  
	    //reload();
	});
  
function querys() {
    $("#sysUserList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/SysUserList/searchSysUserList.action',  
        height : '700',  
        undefinedText : '', 
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        queryParams : queryParams,  
        toolbar : "#toolbar",// 指定工具栏  
        showColumns : true, // 显示隐藏列  
        showRefresh : true, // 显示刷新按钮  
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        clickToSelect: true,      //点击选中
        singleSelect  : true,    //单选  
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
          
        }, {  
            title : '员工工号',  
            field : 'empCode',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            
        }, {  
            title : '归属机构',  
            field : '',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
           
        }, {  
            title : '用户电话',   
            field : 'userTalephone',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
           
        }, {  
            title : '用户邮箱',  
            field : 'userEmail',   
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
           
        },{  
            title : '用户状态',  
            field : 'userStatus',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            
        },{  
            title : '生效时间',  
            field : 'userTimeStart',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			var date = "";
            			if(value!=null){
            				date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
            			}
            			return date;
                	}
        }, {  
            title : '失效时间',  
            field : 'userTimeEnd',    
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			var date = "";
            			if(value!=null){
            				date = new Date(value).Format("yyyy/MM/dd");
            			}
                    	return date;
                	}
        },{  
            title : '最后登录时间',  
            field : 'userLastlogin',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			var date = "";
            			if(value!=null){
            				date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
            			}
                    	return  date;
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
	                $("#sysUserList a").editable({
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                        var data = JSON.stringify(curRow);
	                        $.ajax({
	                            type: 'POST',
	                            url: "${pageContext.request.contextPath }/SysUserList/updateSysUser.action",
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
	
	/**查询条件 */  
	function queryParams(pageReqeust) {
		pageReqeust.deleteMark = $("#deleteMark").val();
		pageReqeust.userName = $("#userName").val();
		pageReqeust.userCode = $("#userCode").val();
	    return pageReqeust;  
	} 
	
	
	
	function reload(){
		var roleId=null;	
		var deleteMark=$("#deleteMark").val();
		var userName=$("#userName").val();
		var userCode=$("#userCode").val();
		var condition = new Object();
		condition.roleId=roleId;
		condition.deleteMark=deleteMark;
		condition.userName=userName;
		condition.userCode=userCode;
		
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
	
	
	
	
    /*新增  */
    function addUser(){
		layer.open({
			type: 2,
			title: '新增用户',
			shadeClose: true,
			shade: 0.8,
			tips:2,
			area: ['45%', '65%'],
			content: ['AddSysUser.jsp'] ,//iframe的url
			success:function(layero,index){
	        },
			end:function(){
					querys();
				}
		});
	}
	
	//引入
    function import1(){
		layer.open({
			type: 2,
			title: '引入用户',
			shadeClose: true,
			shade: 0.8,
			area: ['40%', '50%'],
			content: 'EditDictType.jsp?' //iframe的url
		});
	}
    /*编辑用户信息  */
    function editUser(){
    	var selects = $("#sysUserList").bootstrapTable('getSelections');
    	if(selects.length>1){
    		alert("请选择单行数据编辑");
    	}else if(selects.length>0){
    		var userId = selects[0].userId;
    		layer.open({
				type: 2,
				title: '编辑用户信息',
				shadeClose: true,
				shade: 0.8,
				area: ['45%', '70%'],
				content: 'EditSysUser.jsp?userId='+userId //iframe的url
			});
    	}else{
    		alert("请选择一行数据！");
    	}
	}
	

	/*删除     批量删除    待解决  */
    function deleteUser(){
    	var selects = $("#sysUserList").bootstrapTable('getSelections');
    	if(selects.length>1){
    		alert("请选择单行数据编辑");
    	}else if(selects.length>0){
    		var code=selects[0].userCode;
	    	var user=searchByCode(code);
	    	var data = JSON.stringify(user);
			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysUserList/deleteSysUser.action",
				data: data,
				dataType: 'JSON',
				success: function (data, textStatus, jqXHR) {
					alert('删除成功！');
					refresh();
				},
				error: function () { alert("error");}
			});
		}else{
    		alert("请选择一行数据！");
    	}
	}
	
	/*恢复  */
    function recoverUser(){
    	var selects = $("#sysUserList").bootstrapTable('getSelections');
    	if(selects.length!=1){
    		alert("请选择单行数据编辑");
    	}else if(selects[0].deleteMark=="N"){
    		alert("请确定删除标识有效性");
    	}else{
	    	var code=selects[0].userCode;
	    	var user=searchByCode(code);
	    
	    	var data = JSON.stringify(user);
			$.ajax({
				type: 'POST',
				url: "${pageContext.request.contextPath }/SysUserList/recoverSysUser.action",
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
	
	//初始化密码
	function initialize(){
    	var selects = $("#sysUserList").bootstrapTable('getSelections');
    		var code=selects[0].userCode;
	    	var user=searchByCode(code);
	    	var data = JSON.stringify(user);
		$.ajax({
			type: 'POST',
			url: "${pageContext.request.contextPath }/SysUserList/initializeSysUser.action",
			data: data,
			dataType: 'JSON',
			success: function (date) {
				alert("初始化成功！");
				reload();
			},
			error: function () { alert("error");}
		});
	}
	
	//查询
	function search(){
		
		reload();
	}
	function searchByCode(code){
		var user=new Object();
		user.userCode=code;
		var data=JSON.stringify(user);
		var user;
		$.ajax({
			type: 'POST',
			url: "${pageContext.request.contextPath }/SysUserList/search.action",
			data: data,
			dataType: 'JSON',
			 async:false, 
			success: function (data) {
				user=data[0];
				
			},
			error: function () { alert("error");}
		});
		
		return user;
	
	}
	
	$("#deleteMark").bind('input propertychange', function() {
		reload();
	});

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
	 
	/** 编辑数据 */  
	function editHr() {  
	    var selectRow = $("#sysUserList").bootstrapTable('getSelections');  
	    if (selectRow.length != 1) {  
	        layer.alert('请选择并只能选择一条数据进行编辑！', {icon: 2});  
	        return false;  
	    } else {  
	        window.location = createUrl("admin/hrEmployee/view?username=" + selectRow[0].userName);  
	    }  
	}
	
	/**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
	}
	 
/** 
 * 删除数据 
 */  
function deleteHr() {  
    var hrs = $("#sysUserList").bootstrapTable('getSelections');  
    if (hrs.length < 1) {  
        layer.alert('请选择一条或多条数据进行删除！', {icon: 2});  
    } else {  
        layer.confirm('确定要删除所选数据？', {icon: 3, title:'提示'}, function(){  
            var userNames = [];  
            for (var i=0;i<hrs.length;i++){  
                    userNames.push(hrs[i].userName);  
            }  
            $.ajax({  
                url:'../../../admin/hrEmployee/delete',  
                traditional: true,  //阻止深度序列化，向后台传送数组  
                data:{userNames:userNames},  
                contentType:'application/json',  
                success:function(msg){  
                    if(msg.success){  
                        layer.alert(msg.msg,{icon:1});  
                    }else{  
                        layer.alert(msg.msg,{icon:2});  
                    }  
                    refresh();  
                    $("#edit").attr({"disabled":"disabled"});  
                    $("#delete").attr({"disabled":"disabled"});  
                }  
            })  ;
          });  
    }  
}  
</script>  
</body>
</html>