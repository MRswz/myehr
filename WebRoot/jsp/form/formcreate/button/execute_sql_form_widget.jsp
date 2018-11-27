<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
	String nodeId = request.getParameter("nodeId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_1881" name="form_1881" >
<div class="container-fluid">
	<div style="margin-top:10px;">
		<input id="SYS_SYSTEM_SCHEME.execSqlRelaid" name="execSqlRelaid" type="hidden" class="form-control"  style="width:200px;"/>
		<input id="SYS_SYSTEM_SCHEME.execSqlId" name="execSqlId" type="hidden" class="form-control"  style="width:200px;"/>
		<input id="SYS_SYSTEM_SCHEME.execSqlType" name="execSqlType" type="hidden" class="form-control"  style="width:200px;"/>
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
								<div class="BTNGROUP_55" style="margin:0 auto; display:inline-block;min-height: 20px;">
									<div style="margin-right:10px;display:inline-block">
										<input type="button" id="changeSql"  class="btn btn-info" value="转换SQL" onclick="change()"/>
									</div>
									<div style="margin-right:10px;display:inline-block">
										<input type="button" id="cleanSql"  class="btn btn-danger" value="清空" onclick="cleanSql1()"/>
									</div>
									<div style="margin-right:10px;display:inline-block">
										<select id="SYS_SYSTEM_SCHEME.afterExecType" onchange="changeeSlect2(this)" title="操作成功后处理" name="afterExecType"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="AFTER_EXEC_ACTION" nullItemText="" dataField="dicts"></select>
									</div>
								</div>
								<div id = "init_fun" >
									<textarea  id="SYS_SYSTEM_SCHEME.afterExecFun" name="afterExecFun"  class="form-control"  rows="5"  style="width:100%;height:15%;margin-top:5px"> </textarea>
								</div>
								<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%;height: 75%;">
									<textarea name="entitySql" id="SYS_SYSTEM_SCHEME.entitySql" class="form-control" style="width:100%; height: 100%;resize:none; padding:15px 10px 15px 30px;margin-top:9px;"></textarea>
								</div>
								<div class="ui search selection dropdown entitybox field-control" style="display:none;width:100%;height: 80%;">
									<textarea name="execSql" id="SYS_SYSTEM_SCHEME.execSql" class="form-control" style="width:100%; height: 100%;resize:none; padding:15px 10px 15px 30px;margin-top:9px;"></textarea>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
				<input type="button" id="save_formemp_emp_edit"  class="btn btn-primary" value="保存" onclick="save_formemp_emp_edit_click_1881()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
				<input type="button" id="closeemp_emp_edit"  class="btn btn-primary" value="关闭" onclick="closex_1881()"/>
			</div>
		</div>
	</div>
</div>

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
	var $input = document.getElementById("SYS_SYSTEM_SCHEME.entitySql");
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
	
	var  sql = document.getElementById("SYS_SYSTEM_SCHEME.entitySql").value;
	var sql1 = sql.substring(0,cursurPosition);
	var sql2 = sql.substring(cursurPosition,sql.length);
	var parentNode = treeNode.getParentNode();
	if(treeId=='entityTreeDemo'){
		if(treeNode.level==1){
			sql = sql1 + '['+treeNode.name+']' + sql2;
		}else{
			sql = sql1 + '['+parentNode.name+'.'+treeNode.name+']' + sql2;
		}
	}else{
		sql = sql1 + '[c:'+treeNode.name+'_'+treeNode.id+']' + sql2;
	}
	document.getElementById("SYS_SYSTEM_SCHEME.entitySql").value = sql;
	document.getElementById("SYS_SYSTEM_SCHEME.entitySql").focus();
}; 
//用于捕获异步加载出现异常错误的事件回调函数
function zTreeOnAsyncError(event, treeId, treeNode, XMLHttpRequest, textStatus, errorThrown) {
	//alert(XMLHttpRequest);
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
		$("#init_fun").hide();
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

		document.getElementById("SYS_SYSTEM_SCHEME.execSqlRelaid").value="${param.execSqlRelaid}";
		document.getElementById("SYS_SYSTEM_SCHEME.execSqlType").value="${param.execSqlType}";
		document.getElementById("SYS_SYSTEM_SCHEME.execSqlId").value="${param.execId}";
		var execSqlRelaid = '${param.execSqlRelaid}';
		var execSqlType = '${param.execSqlType}';
		_initData();
		var formId = '${param.formId}';
		buildFormField(formId);
	}

	function save_formemp_emp_edit_click_1881(){
		var paramsMap = {'userId' : '${sessionScope.userid}'};
		var _param = {};
		_param.formId=_formId_1881;
		_param.buttonId=2803;
		_param = getdata_1881(_param.buttonId,_formId_1881);
		_param.paramsMap = paramsMap;
		$.ajax({
			url:'${pageContext.request.contextPath }/button/saveExecSql.action',
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
					if('${param.execSqlType}'=='timerSql'){
						parent._initData(${param.execSqlRelaid});
					}
					closex_1881();
				}
			}
		});
	}

	function _initData(pkId){
		//var execId = pkId;
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		if('${param.execSqlType}'=='EXECSQL_LOOKUPBACK'||'${param.execSqlType}'=='COMBOBOX_INIT'){
			if('${param.execSqlRelaid}'==null||${param.execSqlRelaid}==undefined||${param.execSqlRelaid}==""){
				layer.alert('查看控间信息是否保存', {
					  icon: 7,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
				closex_1881();
			}
		}
		$.ajax({
			url:'${pageContext.request.contextPath }/button/queryExecSql.action?execSqlRelaid=${param.execSqlRelaid}&execSqlType=${param.execSqlType}',
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text !=null && text!=""){
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
							
						}
					};
				}
				var obj={};
				obj.value = text.afterExecType;
				changeeSlect2(obj);
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	function change(){
		var treeSolutionEntitySql = encodeURI(document.getElementById("SYS_SYSTEM_SCHEME.ruleExeSql").value, "UTF-8");
		var content;
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/getRealSql.action?treeSolutionEntitySql='+treeSolutionEntitySql,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			async: false,
			//contentType: 'application/json;charset=utf-8',
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
	
	function cleanSql1(){
		document.getElementById("SYS_SYSTEM_SCHEME.entitySql").value="";
	}
	
	//关闭
	function closex_1881(){ 
	    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
	    parent.layer.close(index);//执行关闭
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
	
	function changeeSlect2(obj){
		if(obj.value=='self_define'){
			$("#init_fun").show();
		}else{
			$("#init_fun").hide();
		}
    };
	
</script>
</body>
</html>
