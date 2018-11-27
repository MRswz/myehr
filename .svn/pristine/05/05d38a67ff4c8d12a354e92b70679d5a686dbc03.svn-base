<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.myehr.pojo.formmanage.CardForm"%>
<%@page import="com.myehr.pojo.formmanage.form.SysFormColumn"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
    HttpSession s = request.getSession(); 
    CardForm form=(CardForm)session.getAttribute("form");
    String formDefCode=form.getFormDefCode();
    String formDefName=form.getFormDefName();
    String formDefLayoutType=form.getFormDefLayoutType();
    String formDefDesc=form.getFormDefDesc();
    int formDefRowCount=form.getFormDefRowCount();
    String formDefUrl=form.getFormUrl();
    String formDefFolderId=form.getFormDefFolderId();
	String formDefEntitySql=form.getFormDefEntitySql();
	String formSubmitUrl=form.getFormSubmitUrl();
	String formSubmitUserId=form.getFormSubmitUserId();
	String formSubmitStatus=form.getFormSubmitStatus();
	String formDefIsProcess=form.getFormDefIsProcess();
	String formDefProcessDefName=form.getFormDefProcessDefName();
	String formDefProcessDefNameText=form.getFormDefProcessDefNameText();
	String isShowFlowTitle=form.getIsShowFlowTitle();
	String formDefSql=form.getFormDefSql();
	
	String tableHtml = (String)session.getAttribute("tableHtml");
	String jsString = (String)session.getAttribute("jsString");
	
	List<SysFormColumn> columns = form.getFree();
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
    	
    	<!-- <div class="input-group" style="width:100px;float:right;position:reletive;">
			<input type="hidden" id="selectId" class="form-control" placeholder="请选择">
			<input type="text" id="selectValue" class="form-control" placeholder="请选择" onclick="selectTree()">
			<div id="tableContent" class="tableContent" style="width:350px;z-index:1;float:right;display:none;position:absolute;left:0px;top:30px">
				<iframe id = "dictList" src="" width="100%" height="750px"></iframe>
			</div>
		</div> -->
		
	   
	</div>
	
            
	<%=tableHtml %>  <!-- 留意-->  
</div>
    
<script>
	var path = '<%=path %>';
	<%=jsString %>
        
       /*  onClickRow: function (row, $element) {
	                curRow = row;
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                $("#ORG_comp_info-List a").editable({
	                    url: function (params) {
	                        var sName = $(this).attr("name");
	                        curRow[sName] = params.value;
	                        var data = JSON.stringify(curRow);
	                        $.ajax({
	                            type: 'POST',
	                            url: "${pageContext.request.contextPath }/dictType/saveSysDictType.action",
	                            data: data,
	                            dataType: 'JSON',
	                            success: function (data, textStatus, jqXHR) {
	                                alert('保存成功！');
	                                refresh();
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
        },  
        onCheck:function(){  
            buttonControl('#ORG_comp_info-List','#edit','#delete');  
        },  
        onCheckAll:function(){  
            buttonControl('#ORG_comp_info-List','#edit','#delete');  
        },  
        onUncheckAll:function(){  
            buttonControl('#ORG_comp_info-List','#edit','#delete');  
        },  
        onUncheck:function(){  
            buttonControl('#ORG_comp_info-List','#edit','#delete');  
        }  
    }); */
    
    /* window.operateEvents = {  
                'click #remove': function (e, value, row, index) {  
                   $.ajax({  
                       type: 'POST',  
                       data: JSON.stringify(row),  
                       url: '${pageContext.request.contextPath }/dictType/removeSysDictType.action',  
                       success: function (data) {  
                           alert('删除成功');
                           window.location.href = window.location.href; 
                           $('#ORG_comp_info-List').bootstrapTable(
                           		'remove', {  
	                               field: 'Id',  
	                               values: [row.Id],  
                               	 }
                           );  
                           $('#ORG_comp_info-List').bootstrapTable(
                               	 'refresh',{
                 					 url:"${pageContext.request.contextPath }/dictType/findORG_comp_info-List2.action"  
                               	 }
                           );
                           
                       }  
                   });  
               }
           };
	}   */

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
            $("#ORG_comp_info-List tbody").append(strAppend);
              
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
                      $('#ORG_comp_info-List').bootstrapTable(
		                   	 'refresh',{
		     					 url:"${pageContext.request.contextPath }/dictType/findORG_comp_info-List2.action"  
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
    	var selects = $("#ORG_comp_info-List").bootstrapTable('getSelections');
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
    	var selects = $("#ORG_comp_info-List").bootstrapTable('getSelections');
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
    	var selects = $("#ORG_comp_info-List").bootstrapTable('getSelections');
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
    	var selects = $("#ORG_comp_info-List").bootstrapTable('getSelections');
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
	    url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action',
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
	    $('#ORG_comp_info-List').bootstrapTable('refresh');  
	}  
	/**查询条件与分页数据 */  
	function queryParams(pageReqeust) {
		pageReqeust.search = $("#search").val();
	    pageReqeust.enabled = $("#enabled").val();  
	    pageReqeust.querys = $("#querys").val();  
	    pageReqeust.pageNo = this.offset;  
	    pageReqeust.pageSize = this.pageNumber;  
	    return pageReqeust;  
	}  
	/** 编辑数据 */  
	function editHr() {  
	    var selectRow = $("#ORG_comp_info-List").bootstrapTable('getSelections');  
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
    var hrs = $("#ORG_comp_info-List").bootstrapTable('getSelections');  
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
