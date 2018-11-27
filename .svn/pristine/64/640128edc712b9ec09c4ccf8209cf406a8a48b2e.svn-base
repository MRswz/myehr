<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/commontest.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>		
	
</head>

<body>
<div class="container-fluid"> 
	<div id="toolbar" class="btn-group" style="width:1100px;">
		<div style="margin-right:10px;float:left"> 
			<button id="add"  class="btn btn-primary" onclick="addDictType()">
				<i class="glyphicon glyphicon-plus"></i> 增加
			</button>
		</div>
		<div style="margin-right:10px;float:left"> 
			<button id="edit" class="btn btn-info" onclick="editDictType()">
				<i class="glyphicon glyphicon-pencil"></i> 编辑类
			</button>
		</div>
		<div style="margin-right:10px;float:left"> 
			<button id="edit" class="btn btn-info" onclick="editDictEntry()">
				<i class="glyphicon glyphicon-pencil"></i> 编辑项
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
		<select id="SYS_COMMON_YES_NO" class="select" name="SYS_COMMON_YES_NO" style="width:40px;height:34px" oninput="querys()">
		</select>
		<select id="SYS_COMMON_YES_NO2" class="select" name="SYS_COMMON_YES_NO" style="width:40px;height:34px" oninput="querys()">
		</select>
		<select id="SYS_FORM_COLUMN_SHOW_TYPE" class="select" style="height:34px"  name="SYS_FORM_COLUMN_SHOW_TYPE" class="form-control select2" placeholder="重要级别..." ></select>
 		<select id="SYS_ROLE_TYPE" class="select" style="height:34px" name="SYS_ROLE_TYPE" class="form-control select2" placeholder="重要级别..." ></select> 
	           
		<div class="input-group" style="float:right;width:250px">
			<input type="text" id="search" class="form-control" placeholder="Search" oninput="search()">
    	</div>
    	
    	<div class="input-group" style="width:100px;float:right;position:reletive;">
			<input type="hidden" id="selectId" class="form-control" placeholder="请选择">
			<input type="text" id="selectValue" class="form-control" placeholder="请选择" onclick="selectTree()">
			<div id="tableContent" class="tableContent" style="width:350px;z-index:1;float:right;display:none;position:absolute;left:0px;top:30px">
				<iframe id = "dictList" src="" width="100%" height="750px"></iframe>
			</div>
		</div>
		
	   
	</div>
	
            
	<table id="dictTypeList" >  
	</table>  <!-- 留意-->  
</div>
    
<script>
	$(function() {  
	    querys();  
	});
  
function querys() {
    $("#delete").attr({"disabled":"disabled"});  
    $("#dictTypeList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/dictType/findDictTypeList2.action',  
        contentType: 'application/json;charset=utf-8',
        dataType:'json',
        method:'post',
        height : '700',  
        undefinedText : '-', 
        pagination : true,
        striped : true,
        queryParams : queryParams,  
        //cache : false, // 是否使用缓存  
        cache : false,
        pageList : [10, 50, 100, 1000], 
        toolbar : "#toolbar",
        showColumns : true,
        showExport : true,
        showRefresh : true,
        sidePagination : "server",
        columns : [ {  
            field : 'state',  
            checkbox : true,  
            align : 'center',  
            valign : 'middle'  
        }, {  
            title : '字典类编码',  
            field : 'dictTypeCode', // 字段  
            align : 'center', // 对齐方式（左 中 右）  
            valign : 'middle', //  
            sortable : true ,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"dictTypeCode\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类编码\">" + value + "</a>";
                	} 
        }, {  
            title : '字典类名称',  
            field : 'dictTypeName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"dictTypeName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类名称\">" + value + "</a>";
                	}
        }, {  
            title : '字典类分类',  
            field : 'dictTypeClass',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	//return "<a href=\"#\" name=\"dictTypeClass\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类分类\">" + value + "</a>";
                    	return "<a href=\"#\" name=\"dictTypeClass\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"字典类分类\" data-type=\"select\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_DICT_CLASS\"></a>";
                	}
        }, {  
            title : '字典类描述',  
            field : 'dictTypeRemark',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"dictTypeRemark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字典类描述\">" + value + "</a>";
                	}
        }, {  
            title : '操作者',  
            field : 'operatorName',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
                    	return "<a href=\"#\" name=\"operatorName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作者\">" + value + "</a>";
                	}
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
                    	return "<a href=\"#\" name=\"operatorTime\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作时间\">" + date + "</a>";
                	}
        }, {  
            title : '删除标识',  
            field : 'deleteMark',  
            align : 'center',  
            valign : 'middle',  
            sortable : true  ,
            formatter: function (value, row, index) {
            			return "<a href=\"#\" name=\"deleteMark\" data-pk=\""+row.dictTypeId+"\" data-value=\""+value+"\" data-title=\"删除标识\" data-type=\"select\" data-source=\"${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode1.action?deleteMark=SYS_COMMON_YES_NO\"></a>";
                    	//return "<a href=\"#\" name=\"deleteMark\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"删除标识\">" + value + "</a>";
                	}
            }, ],
        
        onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#dictTypeList a").editable({
	                	disabled: false,
	                	emptytext: "-",
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
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
            buttonControl('#dictTypeList','#edit','#delete');  
        },  
        onCheckAll:function(){  
            buttonControl('#dictTypeList','#edit','#delete');  
        },  
        onUncheckAll:function(){  
            buttonControl('#dictTypeList','#edit','#delete');  
        },  
        onUncheck:function(){  
            buttonControl('#dictTypeList','#edit','#delete');  
        }  
    });
    
    window.operateEvents = {  
                'click #remove': function (e, value, row, index) {  
                   $.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(row),  
                       url: '${pageContext.request.contextPath }/dictType/removeSysDictType.action',  
                       success: function (data) {  
                           alert('删除成功');
                           window.location.href = window.location.href; 
                           $('#dictTypeList').bootstrapTable(
                           		'remove', {  
	                               field: 'Id',  
	                               values: [row.Id],  
                               	 }
                           );  
                           $('#dictTypeList').bootstrapTable(
                               	 'refresh',{
                 					 url:"${pageContext.request.contextPath }/dictType/findDictTypeList2.action"  
                               	 }
                           );
                           
                       }  
                   });  
               }
           };
	}  

	var num=0;
    /* 增加行 */
    function append() {  
            var strAppend = '<tr style="background: rgb(255, 255, 255) none repeat scroll 0% 0%;">'+
            					'<td><input type="checkbox" checked="true"></td>'+
            					'<td><input type="text" disable="true" name="dictTypeCode"></td>'+
            					'<td><input type="text" editable="true" name="dictTypeName"></td>'+
            					'<td><input type="text" editable="true" name="dictTypeClass"></td>'+
            					'<td><input type="text" editable="true" name="dictTypeRemark"></td>'+
            					'<td><input type="text" editable="true" name="operatorName"></td>'+
            					'<td><input type="text" editable="true" name="operatorTime"></td>'+
            					'<td><input type="text" editable="true" name="deleteMark"></td>'+
            					'<td><button id="new'+num+'" class="btn btn-default btn-sm" onclick="save(this)"><span class="glyphicon glyphicon-ok"></span> Ok </button></td><tr>';   
            num++;
            $("#dictTypeList tbody").append(strAppend);
              
    }  
	
	function save(tdobject){
		var td="#"+tdobject.id;
		var dictTypeCode=$(td).parents("tr").children('td').eq(1).children('input').val();
		var dictTypeName=$(td).parents("tr").children('td').eq(2).children('input').val();
		var dictTypeClass=$(td).parents("tr").children('td').eq(3).children('input').val();
		var dictTypeRemark=$(td).parents("tr").children('td').eq(4).children('input').val();
		var operatorName=$(td).parents("tr").children('td').eq(5).children('input').val();
		var operatorTime=$(td).parents("tr").children('td').eq(6).children('input').val();
		var deleteMark=$(td).parents("tr").children('td').eq(7).children('input').val();
		var curRow=new Object();
		curRow.dictTypeCode = dictTypeCode;
		curRow.dictTypeName = dictTypeName;
		curRow.dictTypeClass = dictTypeClass;
		curRow.dictTypeRemark = dictTypeRemark;
		curRow.operatorName = operatorName;
		curRow.operatorTime = operatorTime;
		curRow.deleteMark = deleteMark;
	    var data = JSON.stringify(curRow);
	    $.ajax({  
                  type: 'POST',  
                  data: data,
                  url: '${pageContext.request.contextPath }/dictType/insertSysDictType.action',  
                  success: function (data) {  
                      alert('添加成功');
                      $('#dictTypeList').bootstrapTable(
		                   	 'refresh',{
		     					 url:"${pageContext.request.contextPath }/dictType/findDictTypeList2.action"  
		                   	 }
               ); 
                  }  
              });
             
        }
        
    function selectTree(){
    	document.getElementById("dictList").src="treetest1.jsp?";
		$("#tableContent").show();
	}
        
    /*新增字典类  */
    function addDictType(){
		layer.open({
			type: 2,
			title: '新增字典类',
			shadeClose: true,
			shade: 0.8,
			area: ['40%', '50%'],
			content: 'editDictType.jsp?', //iframe的url
			success:function(layero,index){
	        },
			end:function(){
				refresh();
			}
		});
		
		
	}
        
    /*编辑字典类  */
    function editDictType(){
    	var selects = $("#dictTypeList").bootstrapTable('getSelections');
    	var dictTypeId = selects[0].dictTypeId;
		layer.open({
			type: 2,
			title: '编辑字典类',
			shadeClose: true,
			shade: 0.8,
			area: ['40%', '50%'],
			content: 'editDictType.jsp?dictTypeId='+dictTypeId,//iframe的url
			success:function(layero,index){
	        },
			end:function(){
				refresh();
			}
		});
	}
	
    /*编辑项  */
    function editDictEntry(){
    	var selects = $("#dictTypeList").bootstrapTable('getSelections');
    	var dictTypeId = selects[0].dictTypeId;
		layer.open({
			type: 2,
			title: '编辑字典项',
			shadeClose: true,
			shade: 0.8,
			area: ['80%', '80%'],
			content: 'SysDictEntryList.jsp?dictTypeId='+dictTypeId, //iframe的url
			success:function(layero,index){
	        },
			end:function(){
				refresh();
			}
		});
	}

	/*删除  */
    function deleteDict(){
    	var selects = $("#dictTypeList").bootstrapTable('getSelections');
    	var data = JSON.stringify(selects[0]);
		$.ajax({
			type: 'POST',
			url: "${pageContext.request.contextPath }/dictType/removeSysDictType.action",
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
    	var selects = $("#dictTypeList").bootstrapTable('getSelections');
    	var data = JSON.stringify(selects[0]);
		$.ajax({
			type: 'POST',
			url: "${pageContext.request.contextPath }/dictType/recoverSysDictType.action",
			data: data,
			dataType: 'JSON',
			success: function (data, textStatus, jqXHR) {
				alert('恢复成功！');
				refresh();
			},
			error: function () { alert("error");}
		});
	}
	
	//查询
	function search(){
		var condition=new Object();
		condition.search = $("#search").val();
		condition.deleteMark = $("#SYS_COMMON_YES_NO").val();
		refresh();
	}
	
	$("#SYS_COMMON_YES_NO").bind('input propertychange', function() {
    	var condition=new Object();
		condition.deleteMark = $("#SYS_COMMON_YES_NO").val();
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
	    $('#dictTypeList').bootstrapTable('refresh');  
	}  
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {
		var dictTypeClass=getQueryString("dictTypeClass");
		pageReqeust.dictTypeClass = dictTypeClass;
		pageReqeust.deleteMark = $("#SYS_COMMON_YES_NO").val();
		if(pageReqeust.deleteMark==null){
			pageReqeust.deleteMark="N";
		}
		pageReqeust.search = $("#search").val();
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;  
	    return pageReqeust;  
	}  
	/** 编辑数据 */  
	function editHr() {  
	    var selectRow = $("#dictTypeList").bootstrapTable('getSelections');  
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
    var hrs = $("#dictTypeList").bootstrapTable('getSelections');  
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

/* 
 * 设备类型下拉树的设置 
 */  
var deviceTypeSetting = {  
    view: {  
        dblClickExpand: false  
    },  
    data: {  
        simpleData: {  
            enable: true  
        }  
    },  
    callback: {  
        onClick: deviceTypeOnClick  
    }  
};  
/* 
 * 设备类型下拉树的点击事件 
 */  
function deviceTypeOnClick(e, treeId, treeNode) {  
    var zTree = $.fn.zTree.getZTreeObj("deviceTypeTree");  
    nodes = zTree.getSelectedNodes();  
    $(".selectDevTypeid").val(nodes[0].id);  
    $("#selectDevType").val(nodes[0].name);  
}  
/* 
 * 初始化设备类型 
 *  
 */  
function initDeviceType(){  
    $.ajax({  
        url:urlDomain+'/Dvice-queryDeviceTypeTree',  
        type:'POST',  
        data:{  
            idevicetypeid:-1,  
            scompanycode:companyCode  
        },  
        async:false,  
        success:function(msg){  
            var obj = eval("("+msg+")");  
            var deviceTypeNodes = [];  
            getDevTypeObj(obj,deviceTypeNodes);  
            $.fn.zTree.init($("#deviceTypeTree"), deviceTypeSetting, deviceTypeNodes);  
        }  
    });  
}  
/* 
 * 展示设备类型SelectTree 
 */  
function showDevTypeTree(){  
    $.ajax({  
        url:"${pageContext.request.contextPath }/dict/selectTree.action",
        type:'POST',  
        data:{  
            idevicetypeid:-1,  
            scompanycode:name  
        },  
        async:false,  
        success:function(msg){  
            var obj = eval("("+msg+")");  
            var deviceTypeNodes = [];  
            getDevTypeObj(obj,deviceTypeNodes);  
            $.fn.zTree.init($("#deviceTypeTree"), deviceTypeSetting, deviceTypeNodes);  
            var deptObj = $("#selectDevType");  
            var deptOffset = $("#selectDevType").offset();  
            $("#devTreeContent").css({left:deptOffset.left + "px", top:deptOffset.top + deptObj.outerHeight() + "px"}).slideDown("fast");  
            $('#deviceTypeTree').css({width:deptObj.outerWidth() - 12 + "px"});  
            var zTree = $.fn.zTree.getZTreeObj("deviceTypeTree");  
            var node = zTree.getNodeByParam("id", $('.selectDevTypeid').val(), null)  
            zTree.selectNode(node);  
            $("body").bind("mousedown", onBodyDownByDevType);  
        }  
    });  
}  
/** 
 * 设备类型 
 *  
 * @param {} dataObj 
 * @param {} treeNodes 
 */  
function getDevTypeObj(dataObj,treeNodes){  
    for (var i = 0; i < dataObj.length; i++) {  
        treeNodes.push({id:dataObj[i].index,pId:dataObj[i].parentId,name:dataObj[i].text});  
        loadChildDevTypeObj(dataObj[i],treeNodes);  
    }  
}  
/** 
 * 查找子节点 
 *  
 * @param {} dataObj 
 * @param {} treeNodes 
 */  
function loadChildDevTypeObj(dataObj,treeNodes){  
    var childObj = dataObj.children;  
    for(var j = 0; j < childObj.length; j++){  
        treeNodes.push({id:childObj[j].index,pId:childObj[j].parentId,name:childObj[j].text});  
        loadChildDevTypeObj(childObj[j],treeNodes);  
    }  
}  
/* 
 * Body鼠标按下事件回调函数 
 */  
function onBodyDownByDevType(event) {  
    if(event.target.id.indexOf('switch') == -1){  
        hideDeviceTypeMenu();  
    }  
}  
/* 
 * 隐藏设备类型Tree 
 */  
function hideDeviceTypeMenu() {  
    $("#devTreeContent").fadeOut("fast");  
    $("body").unbind("mousedown", onBodyDownByDevType);  
}    
</script>  
</body>
</html>