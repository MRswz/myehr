<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>		
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap/js/bootstrap.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/bootstrap-table.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/bootstrap-table-export.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/tableExport.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/src/bootstrap-editable.js"></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/assets/bootstrap/css/bootstrap.css" type="text/css"></link>
	<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/assets/bootstrap-table/bootstrap-table.css" type="text/css"></link>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/assets/index.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/layer/layer.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/date-format.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/select2.js"></script>
</head>

<body>
<div class="container-fluid"> 
	<div id="toolbar" class="btn-group" style="width:1000px;">
		<div style="margin-right:10px;float:left"> 
			<button id="add"  class="btn btn-primary" onclick="addDictEntry()">
				<i class="glyphicon glyphicon-plus"></i> 增加
			</button>
		</div>
		<div style="margin-right:10px;float:left"> 
			<button id="edit" class="btn btn-info" onclick="editDictEntry()">
				<i class="glyphicon glyphicon-pencil"></i> 编辑
			</button>
		</div>
	    <div style="margin-right:10px;float:left"> 
	        <button id="remove" class="btn btn-danger" onclick="deleteDict();">
	            <i class="glyphicon glyphicon-remove"></i> 删除
		    </button>
		</div>
		<div style="margin-right:10px;float:left"> 
		    <button id="recover" class="btn btn-success" onclick="recoverDict();">
		            <i class="glyphicon glyphicon-wrench"></i> 恢复
		    </button>
		</div>
		<div style="margin-right:10px;float:left"> 
		    <button id="close" class="btn btn-warning" onclick="close(this);">
		            <i class="glyphicon glyphicon-off"></i> 关闭
		    </button>
		</div>
		<select id="deleteMark" class="select" name="SYS_COMMON_YES_NO" style="width:40px;height:34px" oninput="querys()">
		</select>
		<select id="SYS_COMMON_YES_NO2" class="select" name="SYS_COMMON_YES_NO" style="width:40px;height:34px" oninput="querys()">
		</select>
		
		<a><button type="button" onclick="deleteHr();" id="delete" class="btn btn-default">  
		   	<i class="glyphicon glyphicon-trash"></i>  
		</button>
		</a>
	       
	           
		<div class="input-group" style="float:right;width:300px">
			<input type="text" id="search" class="form-control" placeholder="Search" oninput="search()">
    	</div>
	   
	</div>  
            
	<table id="dictEntryList" >  
	</table>  <!-- 留意-->  
</div>
    
<script>
	$(function() {  
	    querys();  
	});
  
function querys() {  
    $("#dictEntryList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/dict/findDictEntryList2.action',  
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
        uniqueId : "userName", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center', 
            width : 50, 
            valign : 'middle'  
        }, {  
            title : '字典项编码',  
            field : 'dictEntryCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）
            width : 100,   
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
            			if(value==null){
            			 	value="-";
            			}
                    	return "<a href=\"#\" name=\"dictEntryCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典项编码\">" + value + "</a>";
                	} 
        }, {  
            title : '字典项名称',  
            field : 'dictEntryName',  
            align : 'center',  
            width : 100, 
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			if(value==null){
            			 	value="-";
            			}
                    	return "<a href=\"#\" name=\"dictEntryName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典项名称\">" + value + "</a>";
                	}
        }, {  
            title : '字典项排序',  
            field : 'dictEntrySort',  
            align : 'center',  
            width : 100,  
            valign : 'middle', 
            sortable : true  ,
            formatter: function (value, row, index) {
            			if(value==null){
            			 	value="-";
            			}
                    	return "<a href=\"#\" name=\"dictEntrySort\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典项排序\">" + value + "</a>";
                	}
        }, {  
            title : '字典项描述',  
            field : 'dictEntryRemark',  
            align : 'center',  
            width : 100,  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			if(value==null){
            			 	value="-";
            			}
                    	return "<a href=\"#\" name=\"dictEntryRemark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典项描述\">" + value + "</a>";
                	}
        }, {  
            title : '字典类编码',
            field : 'dictTypeCode',
            align : 'center',
            width : 100,  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			if(value==null){
            			 	value="-";
            			}
                    	return "<a href=\"#\" name=\"dictTypeCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类编码\">" + value + "</a>";
                	}
		}, {  
            title : '字典类名称',  
            field : 'dictTypeName',  
            align : 'center',  
            width : 100,   
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			if(value==null){
            			 	value="-";
            			}
                    	return "<a href=\"#\" name=\"dictTypeName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类名称\">" + value + "</a>";
                    }
        }, {  
            title : '父项编码',  
            field : 'dictParentCode',  
            align : 'center',  
            width : 100,   
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			if(value==null){
            			 	value="-";
            			}
                    	return "<a href=\"#\" name=\"dictParentCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"父项编码\">" + value + "</a>";
                    }
        }, {  
            title : '操作者',  
            field : 'operatorName',  
            align : 'center', 
            width : 100,    
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			if(value==null){
            			 	value="-";
            			}
                    	return "<a href=\"#\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">" + value + "</a>";
                    }
        }, {  
            title : '操作时间',  
            field : 'operatorTime',  
            align : 'center',  
            width : 100,   
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			var date = "-";
            			if(value!=null){
            				date = new Date(value).Format("yyyy-MM-dd hh:mm:ss");
            			}
                    	return "<a href=\"#\" name=\"operatorTime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">" + date + "</a>";
                    }
         }, {  
            title : '删除标识',  
            field : 'deleteMark',  
            align : 'center',  
            width : 100,   
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			return "<a href=\"#\" name=\"deleteMark\" data-pk=\""+row.dictTypeId+"\" data-value=\""+value+"\" data-title=\"删除标识\" data-type=\"select\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO\"></a>";
                    }
            }, {
                    field: 'null',
                    width : 100,   
                    eidtable:false,
                    title: '操作',
                    formatter: function (value, row, index) {  
                       var s = '<button type="button" class="btn btn-default btn-sm" id="remove"><span class="glyphicon glyphicon-trash"></span> Trash</button>';
                       return s;  
                   	},  
                   	events: 'operateEvents'  
        }],
        
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#dictEntryList a").editable({
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                        var data = JSON.stringify(curRow);
	                        $.ajax({
	                            type: 'POST',
	                            url: "${pageContext.request.contextPath }/dict/saveSysDictEntry.action",
	                            data: data,
	                            dataType: 'JSON',
	                            success: function (data, textStatus, jqXHR) {
	                                refresh();
	                                alert('保存成功！');
	                            },
	                            error: function () { alert("error");}
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
        },  
        onCheck:function(){  
            buttonControl('#dictEntryList','#edit','#delete');  
        },  
        onCheckAll:function(){  
            buttonControl('#dictEntryList','#edit','#delete');  
        },  
        onUncheckAll:function(){  
            buttonControl('#dictEntryList','#edit','#delete');  
        },  
        onUncheck:function(){  
            buttonControl('#dictEntryList','#edit','#delete');  
        }  
    })  ;
    
    window.operateEvents = {  
		'click #remove': function (e, value, row, index) {  
			$.ajax({  
				type: 'POST',  
 				data: JSON.stringify(row),  
				url: '${pageContext.request.contextPath }/SysUserList/removeSysUser.action',  
				success: function (data) {  
					alert('删除成功');
					window.location.href = window.location.href; 
					$('#dictEntryList').bootstrapTable(
						'remove', {  
							field: 'Id',  
							values: [row.Id],  
							}
						);  
						$('#dictEntryList').bootstrapTable(
							'refresh',{
								url:"${pageContext.request.contextPath }/dict/findDictEntryList2.action"  
							}
						);
                          
					}  
			});  
		}
	};
}
	/*新增字典项  */
    function addDictEntry(){
    	var dictTypeId=getQueryString("dictTypeId");
		layer.open({
			type: 2,
			title: '新增字典项',
			shadeClose: true,
			shade: 0.8,
			area: ['40%', '50%'],
			content: 'editDictEntry.jsp?dictTypeId='+dictTypeId, //iframe的url
			success:function(layero,index){
	        },
			end:function(){
				refresh();
			}
		});
	}
	
	/*编辑字典项  */
    function editDictEntry(){
    	var selects = $("#dictEntryList").bootstrapTable('getSelections');
    	var dictEntryId = selects[0].dictEntryId;
		layer.open({
			type: 2,
			title: '编辑字典类',
			shadeClose: true,
			shade: 0.8,
			area: ['40%', '50%'],
			content: 'editDictEntry.jsp?dictEntryId='+dictEntryId, //iframe的url
			success:function(layero,index){
	        },
			end:function(){
				refresh();
			}
		});
	}
	
	/*删除  */
    function deleteDict(){
    	var selects = $("#dictEntryList").bootstrapTable('getSelections');
    	var data = JSON.stringify(selects[0]);
		$.ajax({
			type: 'POST',
			url: "${pageContext.request.contextPath }/dict/removeSysDictEntry.action",
			data: data,
			dataType: 'JSON',
			success: function (data, textStatus, jqXHR) {
				alert('删除成功！');
				refresh();
			},
			error: function () { alert("error");}
		});
	}
	
	/*恢复  */
    function recoverDict(){
    	var selects = $("#dictEntryList").bootstrapTable('getSelections');
    	var data = JSON.stringify(selects[0]);
		$.ajax({
			type: 'POST',
			url: "${pageContext.request.contextPath }/dict/recoverSysDictEntry.action",
			data: data,
			dataType: 'JSON',
			success: function (data, textStatus, jqXHR) {
				alert('恢复成功！');
				refresh();
			},
			error: function () { alert("error");}
		});
	}

	var num=0;
    /* 增加行 */
    function addDict() {  
            var strAppend = '<tr style="background: rgb(255, 255, 255) none repeat scroll 0% 0%;">'+
            					'<td><input style="width:50px;" type="checkbox" checked="true"></td>'+
            					'<td><input style="width:100px;" type="text" disable="true" name="dictEntryCode"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="dictEntryName"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="dictEntrySort"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="dictEntryRemark"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="dictTypeCode"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="dictTypeName"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="dictParentCode"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="operatorName"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="operatorTime"></td>'+
            					'<td><input style="width:100px;" type="text" editable="true" name="deleteMark"></td>'+
            					'<td><button id="new'+num+'" class="btn btn-default btn-sm" onclick="save(this)"><span class="glyphicon glyphicon-ok"></span> Ok </button></td><tr>';   
            num++;
            $("#dictEntryList tbody").append(strAppend);
              
        }  
	
	function save(tdobject){
		var td="#"+tdobject.id;
		var dictEntryCode=$(td).parents("tr").children('td').eq(1).children('input').val();
		var dictEntryName=$(td).parents("tr").children('td').eq(2).children('input').val();
		var dictEntrySort=$(td).parents("tr").children('td').eq(3).children('input').val();
		var dictEntryRemark=$(td).parents("tr").children('td').eq(4).children('input').val();
		var dictTypeCode=$(td).parents("tr").children('td').eq(5).children('input').val();
		var dictTypeName=$(td).parents("tr").children('td').eq(6).children('input').val();
		var dictParentCode=$(td).parents("tr").children('td').eq(8).children('input').val();
		var operatorTime=$(td).parents("tr").children('td').eq(9).children('input').val();
		var deleteMark=$(td).parents("tr").children('td').eq(10).children('input').val();
		
		var curRow=new Object();
		curRow.dictEntryCode = dictEntryCode;
		curRow.dictEntryName = dictEntryName;
		curRow.dictEntrySort = dictEntrySort;
		curRow.dictEntryRemark = dictEntryRemark;
		curRow.dictTypeCode = dictTypeCode;
		curRow.dictTypeName = dictTypeName;
		curRow.dictParentCode = dictParentCode;
		curRow.operatorName = operatorName;
		curRow.operatorTime = operatorTime;
		curRow.deleteMark = deleteMark;
	    var data = JSON.stringify(curRow);
	    $.ajax({  
                  type: 'POST',  
                  data: data,
                  url: '${pageContext.request.contextPath }/dict/insertSysDictEntry.action',  
                  success: function (data) {  
                      alert('添加成功');
                       $('#dictEntryList').bootstrapTable(
		                   	 'refresh',{
		     					 url:"${pageContext.request.contextPath }/dict/findDictEntryList2.action"  
		                   	 }
               ); 
                  }  
              });
             
        }
	//查询
	function search(){
	var condition=new Object();
	condition.userCode = $("#search").val();
		$.ajax({  
                  type: 'POST',  
                  data: JSON.stringify(condition),  
                  url: '${pageContext.request.contextPath }/SysUserList/searchSysUserList.action',  
                  success: function (data) {  
                      $("#dictEntryList").bootstrapTable('load',data); 
                  }  
              });
	}
	
	$("#deleteMark").bind('input propertychange', function() {
		var condition=new Object();
		condition.deleteMark = $("#deleteMark").val();
		refresh();
	});
	
	/**	字典下拉*/
	var parame={
		id:'',
		value:"N",
		width: "100px",  
	    height:"45px",
	    url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=1',
	    jsonParam:{},
		chang:function (e){
			var aaa = e;
		}
	};
	//获取页面所有的select 的id   通过id动态为下拉列表赋值
	
	var classes = $(".select");
	window.onload=function(){
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			parame.placeholder="";
			parame.jsonParam.dictTypeCode=classes[i].name;;
			myehr_initSelect(parame);	
		}
	};
	
	/**	字典下拉结束*/
	
	/**取url参数值  */
	function getQueryString(name) { 
		var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
		var r = window.location.search.substr(1).match(reg); 
		if (r != null) return unescape(r[2]); return null; 
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
	    $('#dictEntryList').bootstrapTable('refresh');  
	}  
/**查询条件与分页数据 */  
function queryParams(pageReqeust) {
	var dictTypeId=getQueryString("dictTypeId");
	pageReqeust.dictTypeId = dictTypeId;
	pageReqeust.deleteMark = $("#deleteMark").val();
    pageReqeust.enabled = $("#enabled").val();  
    pageReqeust.querys = $("#querys").val();  
    pageReqeust.pageNo = this.offset;  
    pageReqeust.pageSize = this.pageNumber;  
    return pageReqeust;  
}  
/** 编辑数据 */  
function editHr() {  
    var selectRow = $("#dictEntryList").bootstrapTable('getSelections');  
    if (selectRow.length != 1) {  
        layer.alert('请选择并只能选择一条数据进行编辑！', {icon: 2});  
        return false;  
    } else {  
        window.location = createUrl("admin/hrEmployee/view?username=" + selectRow[0].userName);  
    }  
}  
/** 
 * 删除数据 
 */  
function deleteHr() {  
    var hrs = $("#dictEntryList").bootstrapTable('getSelections');  
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