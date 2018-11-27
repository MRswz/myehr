<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<script type="text/javascript" src="../../../js/assets/jquery.min.js"></script>
<script type="text/javascript" src="../../../js/assets/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript" src="../../../js/assets/bootstrap-table/bootstrap-table.js"></script>
<script type="text/javascript" src="../../../js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
<script type="text/javascript" src="../../../js/assets/bootstrap-table/src/tableExport.js"></script>
<script src="../../../js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
<link rel="stylesheet" href="../../../js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
<link rel="stylesheet" href="../../../js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>

<script type="text/javascript" src="../../../js/layer/layer.js"></script>
<body>
   
		
<div class="container-fluid">
        <div id="toolbar" class="btn-group">   
		<div class="pull-left search" style="margin:0;margin:5px 255px 5px 0">
      	  	<input class="form-control" id="search" type="text" placeholder="Search" oninput="search()" style="margin-right:3px;float:left;width:67%">
      	  	<button id="update" class="btn btn-success"  onclick="submit()" style="margin-right:20px"><i class="glyphicon glyphicon-wrench"></i>查询</button>
    	</div>  
        	<div id="rMenu1">
				<button id="add" class="btn btn-primary" onclick="append()"><i class="glyphicon glyphicon-plus"></i>新增</button>
				<button id="remove" class="btn btn-danger" onclick="remove()"><i class="glyphicon glyphicon-remove"></i>删除</button>
				<button id="update" class="btn btn-info"  onclick="update()"><i class="glyphicon glyphicon-pencil"></i>修改</button>
				<button id="update" class="btn btn-success"  onclick="submit()"><i class="glyphicon glyphicon-wrench"></i>提交</button>
				<button id="lead" class="btn btn-primary" onclick="move()"><i class="glyphicon glyphicon-plus"></i>移动</button>
				<button id="update" class="btn btn-info"  onclick="show()"><i class="glyphicon glyphicon-pencil"></i>预览</button>
				<button id="update" class="btn btn-success"  onclick="refresh()"><i class="glyphicon glyphicon-wrench"></i>刷新缓存</button>
				<button id="lead" class="btn btn-primary" onclick="copy()"><i class="glyphicon glyphicon-plus"></i>复制</button>
			</div>
        </div>  
        <table id="FormList" style="width:100%">  
        </table>  <!-- 留意-->  
        <input id="formDefLayoutType" style="display:none">
        <input id="formDefId" style="display:none">
        <input id="isProcess" style="display:none">
        <input id="processDefName" style="display:none">
        <input id="isShowFlowTitle" style="display:none">
        <input id="selectFormId" style="display:none">
    </div>
    
<script>
	$(function() {  
    querys();  
})  ;
  
function querys() {   
    $("#FormList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/FormList/findFormList.action',  
        height : '800',  
        undefinedText : '-',
        nullText:'-',  
        pagination : true, // 分页  
        striped : true, // 是否显示行间隔色  
        queryParams : queryParams,  
        cache : false, // 是否使用缓存  
        pageList : [ 5, 10, 20 ],  
        toolbar : "#toolbar",// 指定工具栏  
        showExport:true, // 显示导出
        showPaginationSwitch:true,//显示展开
        showColumns : true, // 显示隐藏列  
        showRefresh : true, // 显示刷新按钮
        showToggle:true,  
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        tableLayout:"fixed",//列宽一致对其
        /* toolbarAlign: 'right', */
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '表单ID',  
            field : 'formDefId', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true 
        },{  
            title : '表单编码',  
            field : 'formDefCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true 
        }, {  
            title : '表单名称',  
            field : 'formDefName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '表单布局类型',  
            field : 'formDefLayoutType',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '流程表单',  
            field : 'formDefIsProcess',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '提交状态',  
            field : 'formSubmitStatus',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
            }, {  
            title : '提交路径',  
            field : 'formSubmitUrl',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {  
            title : '提交日期',  
            field : 'formSubmitTime',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        },  {  
            title : '表单描述',  
            field : 'formDefDesc',  
            align : 'center',  
            valign : 'middle',  
            sortable : true 
        }, {
            field: 'null',
            eidtable:false,
            title: '操作',
            formatter: function (value, row, index) {  
               var s = '<button type="button" class="btn btn-default btn-sm" id="remove"><span class="glyphicon glyphicon-trash"></span> Trash</button>';
               return s;  
           	},  
           	events: 'operateEvents'  
        }],
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
    $('#FormList').bootstrapTable('hideColumn', 'formDefId');
    window.operateEvents = {  
                'click #remove': function (e, value, row, index) {
                	row.deleteMark=$("#deleteMark").val();
                	$.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(row),  
                       url: '${pageContext.request.contextPath }/FormList/removeField.action',  
                       success: function (data) { 
                       		if(data==0){
                           		alert('删除成功');
                       		}else if(data==1){
                           		alert('删除异常');
                       		}else if(data==2){
                           		alert('主键不允许删除');
                       		} 
                           refresh();
                       }  
                   }); 
               }
           };
}  

	var num=0;
    /* 增加表单第一步 */
    function append() {  
            layer.open({
			type: 2,
			title: '引入标准字段',
			shadeClose: true,
			shade: 0.8,
			area: ['972px', '85%'],
			tips:2,
			content: ['formAddStep1.jsp'], //iframe的url
	        success:function(layero,index){
	        },
			end:function(){
				/* 增加表单第二步 */
				var formDefLayoutType = $("#formDefLayoutType").val();
				if(!formDefLayoutType){
					alert("添加表单失败!")
				}else{
					judge(formDefLayoutType);
				}
			}
        	});
        }
    //根据表单布局类型判断下一步
    function judge(formDefLayout){
    var url;
    	if(formDefLayout=='5'){
	   		  var mstTabFormId = formDefId;
	   		  url="";
	   	}else if(formDefLayout=='4'){
	   	      url="";
	   	}else if(formDefLayout=='9'){
	   	      url="";
	   	}
	   	//新增图片第二步
	   	else if(formDefLayout=='8'){
	   	      url="";
	   	}else if(formDefLayout=='3'){
	   	      url="";
	   	}else {
	   		  url="cardFormAddStepTwo.jsp?formDefId="+$("#formDefId").val()+"&formDefLayout="+$("#formDefLayout").val()+"&isProcess="+$("#isProcess").val();
	   	};
	   	layer.open({
			type: 2,
			title: '引入标准字段',
			shadeClose: true,
			shade: 0.8,
			area: ['90%', '93%'],
			tips:2,
			content: [url], //iframe的url
	        success:function(layero,index){
	        },
			end:function(){
			
			}
			});
    }  
//查询
	function search(){
	var pageReqeust=new Object();
	pageReqeust.condition = $("#search").val();
    refresh();      
	}
	function getSelectrows(){
        var data=$("#FormList").bootstrapTable('getSelections');
        return data;
	}
	/** 刷新页面 */  
	function refresh() {  
	    $('#FormList').bootstrapTable('refresh');  
	}  
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {  
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;
	    pageReqeust.formDefFolderId = "461";
	    pageReqeust.condition = $("#search").val();
	    return pageReqeust;  
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
	
	//批量删除	
	function remove(){
		var data = JSON.stringify(getSelectrows());
	    $.ajax({  
                  type: 'POST',  
                  data: data,
                  url: '${pageContext.request.contextPath }/FormList/removeFields.action',  
                  success: function (data) {  
                      if(data==2)
                  	  {
                  	  	alert('主键不能删');
                  	  }else if(data==1){
                  	  	alert('删除字段异常');
                  	  }else{
                  	  	alert('全部成功');
                  	  }
               		  refresh();	
                  }  
              });
	}
</script>  
</body>
</html>
