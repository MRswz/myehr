<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
	String treeSolutionFolderId = request.getParameter("treeSolutionFolderId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_1881" name="form_1881" >
<div class="container-fluid">
	<div style="margin-top:10px;">
		<input id="SYS_SYSTEM_SCHEME.treeSolutionId" name="treeSolutionId" type="hidden" class="form-control"  style="width:200px;"/>
		<input id="SYS_SYSTEM_SCHEME.treeSolutionFolderId" name="treeSolutionFolderId" type="hidden" class="form-control"  style="width:200px;" value="<%=treeSolutionFolderId %>"/>
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
			<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">基本信息</h3>
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px" width="100%">
				<td style="padding-left:10px;"  width="10%"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"树方案编码")%>: </lable></td>
				<td style="padding-left:10px;"  align="left" width="20%"  ><input id="SYS_SYSTEM_SCHEME.treeSolutionCode" name="treeSolutionCode" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="10%"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"树方案名称")%>: </lable></td>
				<td style="padding-left:10px;"  align="left" width="20%"  ><input id="SYS_SYSTEM_SCHEME.treeSolutionName" name="treeSolutionName" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
			</tr>
		</table>
	</div>
	
	<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;padding:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">编写脚本</h3>
		<div id="step2_part1" style="height:74%;padding:10px;display:block;overflow:auto">
			<div class="row cell" style="border-left:0px">
				<div id="Tree" class="nui-layout" style="height: 100%;position:relative;float:left;width: 17%;margin:0;">
					<div style="height:100%; border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;padding:10px">
						<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">参数</h3>
						<div title="实体树" region="west" style="display:block;height:50%;margin-bottom:1%"   showHeader="false" showFilter="false" class="sub-sidebar" allowResize="false">
							<div class="form-control menuContent" id="entityTree" style="padding:5px;overflow:auto;width:98%;height:100%;margin:0 auto;">
								<ul id="entityTreeDemo" class="ztree"  ></ul>
							</div>
						</div>
						<div title="参数树" region="west" style="display:block;height:50%" bodyStyle="overflow:hidden;" showHeader="false" showFilter="false" class="sub-sidebar" allowResize="false">
							<div class="form-control menuContent" id="paramTree" style="padding:5px;overflow:auto;width:98%;height:100%;margin:0 auto;">
								<ul id="paramTreeDemo" class="ztree"  ></ul>
							</div>
						</div>
					</div>
				</div>
				
				<div id="right_part_step2" style="float:left;width: 83%;height: 100%;margin:0;">
					<div style="height:100%;border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px;margin-left:10px;padding:10px">
						<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">编写脚本</h3>	
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:100%;">
							<div style = "height:50%;">
								<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
									<div style="margin-right:10px;display:inline-block">
										<input type="button" id="changeSql"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"转换SQL")%> onclick="change()"/>
									</div>
									<div style="margin-right:10px;display:inline-block">
										<input type="button" id="cleanSql"  class="btn btn-danger" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"清空")%> onclick="clearSql()"/>
									</div>
									<div style="margin-right:10px;display:inline-block">
										<input type="button" id="closex"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_1881()"/>
									</div>
								</div>
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;height: 80%;">
									<textarea name="treeSolutionEntitySql" id="SYS_SYSTEM_SCHEME.treeSolutionEntitySql" class="form-control" style="width:100%; height: 100%;resize:none; padding:15px 10px 15px 30px;margin-top:9px;"></textarea>
								</div>
								<div class="ui search selection dropdown entitybox field-control" style="display: none;width:100%;height: 80%;">
									<textarea name="treeSolutionExcSql" id="SYS_SYSTEM_SCHEME.treeSolutionExcSql" class="form-control" style="width:100%; height: 100%;resize:none; padding:15px 10px 15px 30px;margin-top:9px;"></textarea>
								</div>
							</div>
							<div style="width:100%;height:50%;background-color:#f6f6f6">
								<div class="form-control" style="width:100%;height:100%;border:0">		
									<div style="height:100%;overflow-y:hidden;padding:10px 0 0 0;">
										<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
											<div style="margin-right:10px;display:inline-block">
												<input type="button" id="addColumn"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"映射字段")%> onclick="ysColumn()"/>
											</div>
											<div style="margin-right:10px;display:inline-block">
												<input type="button" id="addColumn"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加虚拟字段")%> onclick="addXncolumn()"/>
											</div>
											<div style="margin-right:10px;display:inline-block">
												<input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveData()"/>
											</div>
										</div>
										<table id="tableList">
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div style="margin:0 auto; display:inline-block;height: 35px;">
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="save_formemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save_formemp_emp_edit_click_1881()"/>
		</div>
		<div style="margin-right:10px;display:inline-block">
		    <input type="button" id="closeemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_1881()"/>
		</div>
	</div>
</div>
</div>
</form>
<script>
var classes = $("select");
var parame={
	id:'',
	value:"N",
	width: "100px",  
	height:"45px",
	url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
	jsonParam:{},
	chang:function (e){
		var aaa = e;
	}
};


var setting = {
	//勾选 checkbox 对于父子节点的关联关系
	check: {enable: false,chkboxType: {"Y":"ps", "N":"ps"}  },
	data: {
		key: {title: "title"},
		//使用简易数据模式，即id  pid,一定要注意大小写
		simpleData: {
			enable: true,
			idKey: "id",
			pIdKey: "pId",
			rootPId: 2 //根节点pid 
		}
	},
	callback: {onCheck: onCheck,onClick:onClick,onAsyncSuccess:onAsyncSuccess,onAsyncError: zTreeOnAsyncError},
	//这个async是插件封装的ajax
	async: {
		enable:true, // 需要异步加载
		type:"get",
		url:"${pageContext.request.contextPath }/EntityList/selectFullTree.action",//ajax的请求地址
		autoParam:["id","level=lv"], //传递的参数 id lv（层级，最开始是0）
		dataFilter: filter
	},
	//双击节点时，是否自动展开父节点的标识
	view: { dblClickExpand: false,showLine: false,addDiyDom: addDiyDom}, 
};
var paramtabs_map = {N: [{title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"表单目录树")%>', url:'meehr/jsp/form/formcreate/formList2.jsp'}]};	
//数据过滤  childNodes其实是ajax返回的数据
function filter(treeId, parentNode, childNodes) {
	if (!childNodes) return null;
	for (var i=0, l=childNodes.length; i<l; i++) {
		childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
	}
	return childNodes;
}
function addDiyDom(treeId, treeNode) {
	var spaceWidth = 5;
	var switchObj = $("#" + treeNode.tId + "_switch"),
	icoObj = $('#' + treeNode.tId + '_ico');
	switchObj.remove();
	icoObj.before(switchObj);
	if (treeNode.level > 1) {
		var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level)+ "px'></span>";
		switchObj.before(spaceStr);
	}
}
function beforeClick(treeId, treeNode) {
	if (!treeNode.isParent) {
		alert("请选择父节点");
		return false;
	} else {
		return true;
	}
}
//节点预加载2级数据，用于捕获异步加载正常结束的事件回调函数
var maxLevel = 1;
function onAsyncSuccess(event, treeId, treeNode){
	if(treeNode==undefined){
		return;
	}
	if(treeNode && treeNode.level >= maxLevel - 1 ){
		return;
	}
	var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");
	var type = 'refresh';//清空后重新加载
	var silent = true;//不展开父节点，其他值或缺省状态都自动展开
	//加载根节点时，treeNode是不存在的null，所以一定要做处理
	var nodes = treeNode ? treeNode.children : zTree.getSelectedNodes();
	for (var i=0, l=nodes.length; i<l; i++) {
		if(nodes[i].isParent){
		//强行异步加载父节点的子节点,点击之后运行这个函数，只传父节点过去,注意设置属性isParent
			zTree.reAsyncChildNodes(nodes[i], type, silent);
			if (!silent) zTree.selectNode(nodes[i]);
		}
	}
	var selectedNode = zTree.getSelectedNodes();
	var nodes = zTree.getNodes();
	zTree.expandNode(nodes[0], true);
}
//点击事件
function onClick(event, treeId, treeNode){  
	var switchBtn = treeNode.tId+'_switch';
	if(treeNode.level>0){
		var $input = document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionEntitySql");
	    var cursurPosition=0;
		if($input.selectionStart){//非IE
			cursurPosition= $input.selectionStart;
		}else{//IE
			try{
			var range = document.selection.createRange();
			range.moveStart("character",-$input.value.length);
			cursurPosition=range.text.length;
			}catch(e){
			 cursurPosition = 0;
			}
		}
		
		var  sql = document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionEntitySql").value;
		var sql1 = sql.substring(0,cursurPosition);
		var sql2 = sql.substring(cursurPosition,sql.length);
		var parentNode = treeNode.getParentNode();
		var name = treeNode.name+"";
		var parentName = parentNode.name+"";
		var str = name.substring(name.indexOf("(")+1,name.indexOf(")"))
		str = name.replace("("+str+")","");
		
		var str1 = parentName.substring(parentName.indexOf("(")+1,parentName.indexOf(")"))
		str1 = parentName.replace("("+str1+")","");
		if(treeNode.level==1){
			sql = sql1 + '['+str+']' + sql2;
		}else{
			sql = sql1 + '['+str1+'.'+str+']' + sql2;
		}
		
		document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionEntitySql").value = sql;
		document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionEntitySql").focus();
	}
	
}; 
//用于捕获异步加载出现异常错误的事件回调函数
function zTreeOnAsyncError(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown) {
	alert(XMLHttpRequest);
};
//自定义设置节点属性,在本DEMO中并无实质意义
function setTitle(node) {
		var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");
		var nodes = node ? [node]:zTree.transformToArray(zTree.getNodes());
		for (var i=0, l=nodes.length; i<l; i++) {
			var n = nodes[i];
			n.title = "[" + n.id + "] isFirstNode = " + n.isFirstNode + ", isLastNode = " + n.isLastNode;
			console.log(n.title);
			zTree.updateNode(n);
		}
}
//选中后触发函数
function onCheck(e, treeId, treeNode) {count();}
//拿到点击的总个数
function count() {
	function isForceHidden(node) {
		if (!node.parentTId) return false;
		var p = node.getParentNode();
			return !!p.isHidden ? true : isForceHidden(p);
	}
	var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo"),
	checkCount = zTree.getCheckedNodes(true).length,
	nocheckCount = zTree.getCheckedNodes(false).length,
	hiddenNodes = zTree.getNodesByParam("isHidden", true),
	hiddenCount = hiddenNodes.length;
	for (var i=0, j=hiddenNodes.length; i<j; i++) {
		var n = hiddenNodes[i];
		if (isForceHidden(n)) {
			hiddenCount -= 1;
		} else if (n.isParent) {
			hiddenCount += zTree.transformToArray(n.children).length;
		}
	}
	$("#checkCount").text(checkCount);
	$("#nocheckCount").text(nocheckCount);
}
function showNodes() {
	var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo"),
	nodes = zTree.getNodesByParam("isHidden", true);
	zTree.showNodes(nodes);
	setTitle();
	count();
}
function hideNodes() {
	var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo"),
	nodes = zTree.getSelectedNodes();
	if (nodes.length == 0) {
		alert("Please select one node at least.");
		return;
	}
	zTree.hideNodes(nodes);
	setTitle();
	count();
}
$(document).ready(function(){
	var height = $(window).height()-50;
	$("#jsp").css("height","100%");
	//zTree 初始化方法
	$.fn.zTree.init($("#entityTreeDemo"), setting);
	$("#hideNodesBtn").bind("click", {type:"rename"}, hideNodes);
	$("#showNodesBtn").bind("click", {type:"icon"}, showNodes);
	setTitle();
	count();
});

function buildFormField(formID){
	var setting1 = {
		//勾选 checkbox 对于父子节点的关联关系
		check: {enable: false,chkboxType: {"Y":"ps", "N":"ps"}  },
		data: {
			key: {title: "title"},
			//使用简易数据模式，即id  pid,一定要注意大小写
			simpleData: {
				enable: true,
				idKey: "id",
				pIdKey: "pId",
				rootPId: 2 //根节点pid 
			}
		},
		callback: {onCheck: onCheck,onClick:onClick,onAsyncSuccess:onAsyncSuccess,onAsyncError: zTreeOnAsyncError},
		//这个async是插件封装的ajax
		async: {
			enable:true, // 需要异步加载
			type:"get",
			url:"${pageContext.request.contextPath }/form/selectFormField.action?formId="+formID,//ajax的请求地址
			autoParam:["id","level=lv"], //传递的参数 id lv（层级，最开始是0）
			dataFilter: filter
		},
		//双击节点时，是否自动展开父节点的标识
		view: { dblClickExpand: false,showLine: false,addDiyDom: addDiyDom}, 
	};
	
	var height = $(window).height()-50;
	$("#jsp").css("height","100%");
	//zTree 初始化方法
	$.fn.zTree.init($("#paramTreeDemo"), setting1);
	$("#hideNodesBtn").bind("click", {type:"rename"}, hideNodes);
	$("#showNodesBtn").bind("click", {type:"icon"}, showNodes);
	setTitle();
	count();
}

function query_table() {   
    $("#tableList").bootstrapTable({  
        url : '${pageContext.request.contextPath }/tree/queryTreeSolutionColumnBySolutionId.action?treeSolutionId='+'${param.treeSolutionId}', 
		height:'800',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "templateColumnId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
            title : '操作',  
            field : 'treeSluId', // 字段  
            align: 'center',
            valign: 'middle',
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"treeSluId\" style=\"border-style: none;width:0px;padding:0px\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
						"<input type=\"form-control\" name=\"treeEntityId\" style=\"border-style: none;width:0px;padding:0px\" readonly=true data-type=\"text\" data-pk=\""+row.treeEntityId+"\" data-title=\"关联实体ID\" value=\""+row.treeEntityId+"\"/>"+
						"<input type=\"form-control\" name=\"treeColumnId\" style=\"border-style: none;width:0px;padding:0px\" readonly=true data-type=\"text\" data-pk=\""+row.treeColumnId+"\" data-title=\"关联字段ID\" value=\""+row.treeColumnId+"\"/>"+
						"<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 5px;top: 5px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
        	}
		}, {  
            title : '实体名称',  
            field : 'treeEntityTablename',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"treeEntityTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体名称\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '实体中文名称',  
            field : 'entityChinaname',  
            align : 'center',  
            valign : 'middle', 
			visible : false,
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"entityChinaname\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"实体中文名称\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '字段名称',  
            field : 'treeFieldTablename',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"treeFieldTablename\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\" value=\""+value+"\"/>";
        	}
		}, {  
            title : '字段中文名称',  
            field : 'fieldChinaName',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"fieldChinaName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段中文名称\" value=\""+value+"\"/>";
        	}
		},{
            title : '节点设置',  
            field : 'treeColumnType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"treeColumnType"+index+"\" name=\"treeColumnType\" class=\"form-control\" nullItemText=\"-\" DictName=\"SYS_TREE_NODE_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"节点设置\" value=\""+value+"\"/>" ;
        	}
		},{
            title : '列类型',  
            field : 'treeCType',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"treeCType"+index+"\" name=\"treeCType\" class=\"form-control\" nullItemText=\"-\" DictName=\"SYS_FORM_COLUMN_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"列类型\" value=\""+value+"\"/>" ;
        	}
        }],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                addListSelect();
	            },
	            data:[],       
        responseHandler : function(res) { 
        	rowsNum = res.total;
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function addListSelect(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+'${param.formDefId}';
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
}

$(function () {  
	$('.form_date1').datetimepicker({ 
	 language:  'zh-CN',  
	 format:"yyyy-mm-dd",  
	 weekStart: 1,  
	 todayBtn:  1,  
	 autoclose: 1,  
	 todayHighlight: 1,  
	 startView: 2,  
	 minView: 2,  
	 forceParse: 0,  
	 pickerPosition: "bottom-left"  
	});  
	$('.form_date2').datetimepicker({ 
	 language:  'zh-CN',  
	 format:"yyyy-mm-dd hh:ii",  
	 weekStart: 1,  
	 todayBtn:  1,  
	 autoclose: 1,  
	 todayHighlight: 1,  
	 startView: 2,  
	 minView: 0,  
	 forceParse: 0,  
	 pickerPosition: "bottom-left"  
	});  
	$('.form_date3').datetimepicker({ 
	 language:  'zh-CN',  
	 format:"hh:ii",  
	 weekStart: 1,  
	 todayBtn:  1,  
	 autoclose: 1,  
	 todayHighlight: 1,  
	 startView: 0,  
	 minView: 2,  
	 forceParse: 0,  
	 pickerPosition: "bottom-left"  
	});  
	$('.form_date4').datetimepicker({ 
	 language:  'zh-CN',  
	 format:"yyyy-mm-dd",  
	 weekStart: 1,  
	 todayBtn:  1,  
	 autoclose: 1,  
	 todayHighlight: 1,  
	 startView: 4,  
	 minView: 4,  
	 forceParse: 0,  
	 pickerPosition: "bottom-left"  
	});  
});
	function getdata_1881(buttonId,formId){
		var param = {};
		var data = {buttonId:buttonId,formId:formId,param:{},paramsMap:{}};
		$.map($('[name=form_'+formId+']').serializeArray(), function(item, index){
			var property =item['name'];
			var value = item['value'];
			param[property] = value;
		});
		data.param = param;
		return data;
	}
	function formatDatebox(value,key) {
			var type = document.getElementById(key).getAttribute("dateType");
			type = type.substr(type.length-1,1);
		    var year=value.substr(0,4);
		    var index1=value.indexOf("-");
		    var index2=value.lastIndexOf("-");
		    var d1=parseInt(index2)-(parseInt(index1)+1);
		    var month=value.substr((parseInt(index1)+1),d1);
		    var kg=value.indexOf(" ");
		    d2=parseInt(kg)-parseInt(index2);
		    var day=value.substr(parseInt(index2)+1,d2);
		    var mh=value.indexOf(":");
		    d3=parseInt(mh)-(parseInt(kg)+1);
		    var hh=value.substr(parseInt(kg)+1,d3);
		    var mh2=value.lastIndexOf(":");
		    d4=parseInt(mh2)-(parseInt(mh)+1);
		    var mm=value.substr(parseInt(mh)+1,d4);
		    if(mm!=0){
		    	mm = parseInt(mm)+6;
		    	if(parseInt(mm)<10){
		    		mm = "0"+mm;
		    	}else if(parseInt(mm)==60){
		    		mm="00";
		    		hh=parseInt(hh)+1;
		    		}else if(parseInt(mm)>60){
		    			mm=parseInt(mm)-60;
		    			mm="0"+mm;
		    			hh=parseInt(hh)+1;
		    			}
		    }
		    var mh2=value.lastIndexOf(":");
		    var ss=value.substr(parseInt(mh2)+1);
		    if(type == 1){
			        return year+"-"+month+"-"+day;
		    }else if(type == 2){
			        return year+"-"+month+"-"+day+" "+hh+":"+mm;
		    }else if(type == 3){
			        return hh+":"+mm;
		    }else if(type == 4){
			        return year;
		    }else if(type == 5){
			        return year+month;
		    }
	}
	var _formId_1881='1881';
	var containerParam={};
	window.onload=function(){
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			parame.placeholder="";
			var dataField=$(classes[i]).attr('dataField');
			var data=$(classes[i]).attr('data')
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField,data);
			}else{
				myehr_initSelect(parame,dataField,containerParam,data);
			}
		}

		document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionId").value="${param.treeSolutionId}";
		document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionFolderId").value="${param.treeSolutionFolderId}";
		var treeSolutionId = '${param.treeSolutionId}';
		
		if(treeSolutionId!='' && treeSolutionId!=null){
			_initData(treeSolutionId);
		}
		
		query_table();
		$(".fixed-table-body").css("height","70%");
	}

	function save_formemp_emp_edit_click_1881(){
		var paramsMap = {'userId' : '${sessionScope.userid}'};
		var _param = {};
		_param.formId=_formId_1881;
		_param.buttonId=2803;
		_param = getdata_1881(_param.buttonId,_formId_1881);
		_param.paramsMap = paramsMap;
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/saveTreeSolution.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]==0){
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存失败！")%>");
				}else if(text[0]=='error'){
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
				}else {
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功")%>");
					closex_1881();
				}
			}
		});
	}

	function _initData(pkId){
		
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/queryTreeSolutionById.action?treeSolutionId='+pkId,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text !=null){
					var object = text;
					for(var key in object){
						if(_form[key]!=null&&_form[key]!="undefined"){
							if(key=='ruleIsexc'){
								if(object[key]==1){
									document.getElementById(_form[key]).checked=true;
								}
							}else if(_Type[key]=="dateTime"){
								date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
								document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
							}else{
								document.getElementById(_form[key]).value=object[key];
							}
							if(key == 'ruleFormId'){
								if(object[key]!=null && object[key]!=''){
									buildFormField(object[key]);
								}
							}
						}
					};
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	function choseForm(){
		var cardType;
		var ruleId = '${param.ruleId}';
		var nodeId = '${param.nodeId}';
		if(nodeId==undefined || nodeId=='' ){
			cardType = 'listEdit';
		}else{
			cardType = 'treeEdit'
		}
		var url = '/myehr/jsp/form/scheme/formChoose.jsp?cardType='+cardType;
		layer.open({
			type: 2,
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择表单")%>',
			shadeClose: true,
			shade: 0.8,
			maxmin:true,
			zIndex:9999,
			area: ['950px', '500px'],
			content: url,
			success:function(layero,index){
			$('.layui-layer-max').click();
			},
			end:function(){
			}
		});
	
	}
	
	$(":checkbox").click(function() {
		if ($(this).is(":checked")) {
			this.value=1;
		} else {
			this.value=0;
		}
	});
	
	function clearSql(){
		document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionEntitySql").value="";
	}

	function change(){
		var treeSolutionEntitySql = encodeURI(document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionEntitySql").value, "UTF-8");
		var content;
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/getRealSql.action?treeSolutionEntitySql='+treeSolutionEntitySql,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				content=text;
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
		content = "<textarea id='xxx' rows='7' cols='63' >"+content+"</textarea>";
		layer.open({
			title:'查看SQL',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['500px', '300px']
		});
	}
	
	//关闭
	function closex_1881(){ 
	    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	    parent.layer.close(index);//执行关闭
	}
	
	function ysColumn(){
		var treeSolutionEntitySql = encodeURI(document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionEntitySql").value, "UTF-8");
		var treeSolutionId = '${param.treeSolutionId}';
		var content;
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/saveTreeSolutionColumn.action?treeSolutionEntitySql='+treeSolutionEntitySql+'&treeSolutionId='+treeSolutionId,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				layer.alert('映射成功', {
					icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					skin: 'layer-ext-moon' 
				})
				$('#tableList').bootstrapTable('refresh');
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	function saveData(){
		var saveDate = getEntityDataStep4();
		var param = {};
		param.columns= saveDate;
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/saveYsColumnData.action',
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(param),
			async: false,
			success: function (data) {
				if(data[0]=="0"){
					$('#tableList').bootstrapTable('refresh');
				}
			}
		});
		
	}

	function getEntityDataStep4(){
		var i = 0;
		var data = [];
		var treeSolutionId = document.getElementById("SYS_SYSTEM_SCHEME.treeSolutionId").value;
		$("#tableList>tbody").find("tr").each(function(){
			var table = {};
			table.treeSluId=$(this).find("input").eq(0).val();
			table.treeEntityId=$(this).find("input").eq(1).val();
			table.treeColumnId=$(this).find("input").eq(2).val();
			table.treeEntityTablename=$(this).find("input").eq(3).val();
			table.treeFieldTablename=$(this).find("input").eq(4).val();
			table.treeColumnType=$(this).find("select").eq(0).val();
			table.treeCType=$(this).find("select").eq(1).val();
			table.treeSolutionId =treeSolutionId;
			data[i] = table;
			i++;
		})
		return data;
	}
		
	function getForm(formId){
		var object=[];
		$(formId).find("input").each(function(){
			var xxx = this.id.split(".")[1];
			if(xxx!=undefined){
				var xx = xxx.split("_");
				var arr = [];
				var id = "";
				for(var i=0;i<xx.length;i++){
					if(i<xx.length-1){
						id = id+xx[i]+"_";
					}else{
						id = id+xx[i];
					}
				}
				object[id]=this.id;
			}
		})
		$(formId).find("select").each(function(){
			var xxx = this.id.split(".")[1];
			if(xxx!=undefined){
				var xx = xxx.split("_");
				var arr = [];
				var id = "";
				for(var i=0;i<xx.length;i++){
					if(i<xx.length-1){
						id = id+xx[i]+"_";
					}else{
						id = id+xx[i];
					}
				}
				object[id]=this.id;
			}
		})
		$(formId).find("textarea").each(function(){
			var xxx = this.id.split(".")[1];
			if(xxx!=undefined){
				var xx = xxx.split("_");
				var arr = [];
				var id = "";
				for(var i=0;i<xx.length;i++){
					if(i<xx.length-1){
						id = id+xx[i]+"_";
					}else{
						id = id+xx[i];
					}
				}
				object[id]=this.id;
			}
		})
		return object;
	}
	function getType(formId){
		var object=[];
			$(formId).find("input").each(function(){
				var vtype = $(this).attr('format');
				if(vtype!=undefined){
					var xxx = this.id.split(".")[1];
						var xx = xxx.split("_");
						var arr = [];
						var id = "";
						for(var i=0;i<xx.length;i++){
							if(i<xx.length-1){
								id = id+xx[i]+"_";
							}else{
								id = id+xx[i];
							}
						}
					object[id]="dateTime";
				}
			})
		return object;
	}
</script>
</body>
</html>
