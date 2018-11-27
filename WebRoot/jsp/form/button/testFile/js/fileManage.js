var showType = "all";
var folder = "all";
var tag = "";
var switchType = "view";

$(".kv-file-remove").on('click', function(){
	alert("aa");
})

function changeShowType(type){
	$(".showType").css("color","#666666");
	$("#showType_"+type).css("color","#e35b5a");
	showType = type;
	loadDataStart();
}

function changeFolder(type){
	$(".folderType").css("color","#666666");
	$("#folder_"+type).css("color","#e35b5a");
	folder = type;
	loadDataStart();
}

function changeTag(type){
	tag += type;
	if($("#tag_"+type).attr("class")!="tag"){
		$("#tag_"+type).attr("class","tag");
	}else{
		$("#tag_"+type).attr("class","");
	}
	loadDataStart();
}

function getDictData(dictName){
	var dictEntrys = [];
	$.ajax({
		url:'/myehr/FileList/getDictData.action?DictName='+dictName,
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			dictEntrys = obj;
		}
	});
	return dictEntrys;
}

function supplyHtml(){
	var data = getDictData("fileManage_showType");
	var html = "";
	for(var i=0;i<data.length;i++){
		html += "<a onclick=\"changeShowType('"+data[i].dictEntryCode+"')\" id=\"showType_"+data[i].dictEntryCode+"\" class=\"file-control showType\">"+data[i].dictEntryName+"</a>"
	}
	$("#fileManage_showType").html(html);
	data = getDictData("fileManage_folderType");
	html = "<ul class=\"folder-list\" style=\"padding: 0\">";
	for(var i=0;i<data.length;i++){
		html += "<li><a onclick=\"changeFolder('"+data[i].dictEntryCode+"')\" id=\"folder_"+data[i].dictEntryCode+"\" class=\"folderType\"><i class=\"fa fa-folder\"></i>"+data[i].dictEntryName+"</a></li>"
	}
	html += "</ul>";
	$("#fileManage_folderType").html(html);
	data = getDictData("ORG_TAGS");
	html = "<ul class=\"tag-list\" style=\"padding: 0\">";
	for(var i=0;i<data.length;i++){
		html += "<li onclick=\"changeTag('"+data[i].dictEntryCode+"')\"><a id=\"tag_"+data[i].dictEntryCode+"\" class=\"\">"+data[i].dictEntryName+"</a></li>"
	}
	html += "</ul>";
	$("#fileManage_tagType").html(html);
	loadDataStart();
}

function loadDataStart(){
	$.ajax({
	    url: "/myehr/FileList/cardformInitData.action",
	    type: 'post',
	    data:grid_fileManage_fun(),//HTTP请求类型
	    contentType: 'application/json;charset=utf-8',
	    cache: false,
	    async: false,
	    success: function (data) {
	    	showDate(data);
	    }
	});
}

function showDate(arr) {
	if(switchType=='view'){
		$("#file_wall_view").show();
		$("#file_wall_grid").hide();
		var previewSrcArr = [];
		var configArr = [];
		for (var i = arr.length - 1; i >= 0; i--) {
			previewSrcArr[i]=arr[i].FILEPATH;
			var obj = {};
			obj.caption = arr[i].FILENAME;
			obj.type = arr[i].CLIENTFILENAME;
			if(obj.type=='video'){
				obj.filetype="video/"+obj.caption.split(".")[obj.caption.split(".").length-1];
			}
			if(obj.type=='audio'){
				obj.filetype="audio/"+obj.caption.split(".")[obj.caption.split(".").length-1];
			}
			obj.size = arr[i].FILE_SIZE;
			obj.key = i;
			configArr[i] = obj;
			/*var UPLOADTIME = new Date(arr[i].UPLOADTIME).Format("yyyy-MM-dd hh:mm:ss");
		    var cellObj = $('<div class="file-box">'+
				            '    <div class="file">'+
				            '        <a href="file_manager.html#">'+
				            '            <span class="corner"></span>'+
				
				            '            <div class="icon">'+
				            '                <i class="fa fa-file"></i>'+
				            '            </div>'+
				            '            <div class="file-name">'+
				            '                '+arr[i].FILENAME+''+
				            '                <br/>'+
				            '                <small>添加时间：'+UPLOADTIME+'</small>'+
				            '            </div>'+
				            '        </a>'+
				            '    </div>'+
				            '</div>');
		    $('#file_wall').append(cellObj);*/
		}
		$("#file-es").fileinput({
	        theme: 'fa',
	        language: 'zh',
	        showUpload: false,
	        showCaption: false,
	        browseClass: "btn btn-primary btn-lg",
	        fileType: "any",
	        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
	        overwriteInitial: false,
	        showRemove:false,
	        initialPreviewAsData: true,
	        initialPreview: previewSrcArr,
	        initialPreviewConfig:configArr 
	    });
	}else if(switchType=='grid'){
		$("#file_wall_view").hide();
		$("#file_wall_grid").show();
		$("#fileList").bootstrapTable({  
	        height : '700',  
	        undefinedText : '-',  
	        pagination : true, // 分页  
	        striped : true, // 是否显示行间隔色  
	        cache : false, // 是否使用缓存  
	        pageList : [ 5, 10, 20 ],  
	        toolbar : "#toolbar",// 指定工具栏  
	        clickToSelect: true,
	        uniqueId : "FILEID", // 每一行的唯一标识  
	        //sidePagination : "server",
	        columns : [ {  
	            field : 'state',  
	            checkbox : true,  
	            align : 'center',  
	            valign : 'middle',
	            visible : false
	        }, {  
	            title : '文件名称',  
	            field : 'FILENAME', // 字段  
	            align : 'center', // 对齐方式（左 中 右）  
	            valign : 'middle', //  
	            sortable : true,
	            formatter: function (value, row, index) {
	                    	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:150px;\"  class=\"eli w100px\" name=\"FILENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"文件名称\">"+value+"</a>";
	                	} 
	        }, {  
	            title : '文件内容',  
	            field : 'FILEDATE',  
	            align : 'center',  
	            valign : 'middle',  
	            sortable : true
	        }, {  
	            title : '上传时间',  
	            field : 'UPLOADTIME',  
	            align : 'center',  
	            valign : 'middle',  
	            sortable : true  ,
	            formatter: function (value, row, index) {
		            	var date = "-";
		                if(value!=null){
		                var val = value+"";
		                	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
		                		date = value ;
		                	}else{
		                    date = new Date(value).Format("yyyy-MM-dd");
		                	}
		                }
	                    	return "<a style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" class=\"eli w100px\" name=\"UPLOADTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"上传时间\">"+date+"</a>";
	                	}
	        },{  
	            title : '上传人',  
	            field : 'UPLOADUSER',  
	            align : 'center', // 对齐方式（左 中 右）  
	            valign : 'middle', //  
	            sortable : true 
	        },{  
	            title : '文件类型',  
	            field : 'CONTENTTYPE',  
	            align : 'center', // 对齐方式（左 中 右）  
	            valign : 'middle', //  
	            align : 'center', // 对齐方式（左 中 右）  
	            valign : 'middle', //  
	            sortable : true
	        },{  
	            title : '对象类型',  
	            field : 'OBJ_TYPE',  
	            visible : false 
	        },{  
	            title : '对象ID',  
	            field : 'OBJ_ID',  
	            visible : false 
	        }]
		})
		$("#fileList").bootstrapTable('load',arr);
	}
};

function grid_fileManage_fun(){
	tag="";
	var queryParams = {};
	queryParams.showType = showType;
	queryParams.folder = folder;
	var tags = $(".tag");
	for(var i=0;i<tags.length;i++){
		tag += tags[i].innerText+","
	}
	if(tag.length>0){
		tag.substring(0, tag.length-2);
	}
	queryParams.tag = tag;
	queryParams = JSON.stringify(queryParams);
	return queryParams;
}

function layerUpload(){
	layer.open({
		type: 2,
		title: '上传文件',
		shadeClose: true,
		shade: 0.8,
		area: ['68%', '85%'],
		content: 'addFileInfo.jsp?OBJ_ID='+obj_id+'&OBJ_TYPE='+obj_type, //iframe的url
		success:function(layero,index){
	    },
		end:function(){
			refresh();
		}
	})
}

function changeFileManage(type){
	
}


	var setting = {
		//勾选 checkbox 对于父子节点的关联关系
		check: {enable: false,chkboxType: {"Y":"ps", "N":"ps"}  },
		data: {
			key: {title: "ORGVORGANIZATION_cname"},
			//使用简易数据模式，即id  pid,一定要注意大小写
			simpleData: {
				enable: true,
				idKey: "ORGVORGANIZATION_ID",
				pIdKey: "ORGVORGANIZATION_PARENTID",
				rootPId: 2 //根节点pid 
			}
		},
		callback: {onClick:onClick,onAsyncSuccess:onAsyncSuccess},
		//这个async是插件封装的ajax
		async: {
			enable:true, // 需要异步加载
			type:"get",
			url:"/myehr/form/queryTreeSolution.action?formId=2140&params={}",//ajax的请求地址
			autoParam:["id","level=lv"], //传递的参数 id lv（层级，最开始是0）
			dataFilter: filter
		},
		//双击节点时，是否自动展开父节点的标识
		view: { dblClickExpand: false,showLine: false,addDiyDom: addDiyDom}, 
	};	
	//数据过滤  childNodes其实是ajax返回的数据
	function filter(treeId, parentNode, childNodes) {
			if (!childNodes) return null;
				for (var i=0, l=childNodes.length; i<l; i++) {
					if(childNodes[i].ORGVORGANIZATION_cname!=null){
						childNodes[i].name = childNodes[i].ORGVORGANIZATION_cname.replace(/\.n/g, '.');
					}
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
	
	//节点预加载2级数据，用于捕获异步加载正常结束的事件回调函数
	var maxLevel = 2;
	function onAsyncSuccess(event, treeId, treeNode){
		if(treeNode && treeNode.level >= maxLevel - 1 ){
			return;
		}
		var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");
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
			if(1>2){
				$("#"+switchBtn).click();
			}else{
				var nodeType = treeNode.ORGVORGANIZATION_isdisabled;
				if(!paramtabs) return;
				loadDataStart();
				
			}
	}; 
	function showNodes() {
			var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree"),
			nodes = zTree.getNodesByParam("isHidden", true);
			zTree.showNodes(nodes);
	}
	function hideNodes() {
			var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree"),
			nodes = zTree.getSelectedNodes();
			if (nodes.length == 0) {
				alert("Please select one node at least.");
				return;
			}
			zTree.hideNodes(nodes);
	}
	$(document).ready(function(){
		//zTree 初始化方法
		$.fn.zTree.init($("#tree_emp_Personneltree"), setting);
		$("#hideNodesBtn").bind("click", {type:"rename"}, hideNodes);
		$("#showNodesBtn").bind("click", {type:"icon"}, showNodes);
		document.getElementById("key").value = ""; //清空搜索框中的内容  
		//绑定事件  
		key = $("#key");  
		key.bind("focus", focusKey)  
		.bind("blur", blurKey)
		.bind("propertychange", searchNode) //property(属性)change(改变)的时候，触发事件  
		.bind("input", searchNode); 
	});
var _gparamsobj= {};
//全局参数
var currentNode = null;	
var _treegridselectedrows=null;
function showNodePage(){
	initflag = 1;
	onNodeClick(currentNode);
}
function onNodeClick(node) {
}

function onBeforeOpen(e) {
	var menu = e.sender;
	var node = tree.getSelectedNode();
	if (!node) {
		e.cancel = true;
		return;
	}
} 
//刷新
function reload(){
	 window.location.reload();
}
// 展开
function expandNode() {
	var node = tree.getSelectedNode();
	if (node) {
		tree.expandNode(node);
	}
}
//折叠
function collapseNode() {
	var node = tree.getSelectedNode();
	if (node) {
		tree.collapseNode(node);
	}
}
//选中按钮js区域
function refreshNode() {
	if(!"true".equals("false")){
		var tree = nui.get("tree_emp_Personneltree");
		tree.load("/myehr/form/queryTreeSolution.action?formId=2140&params={}");
	}
}
function closex_2140() {    
	var index = parent.layer.getFrameIndex(window.name);
		parent.layer.close(index);//执行关闭
}

function _closeParentWin(action){
	if(window.parent._closeParentWin){
		window.parent.CloseWindow(action);
	}else {
		CloseWindow(action);
	}
}
var lastValue = "", nodeList = [], fontCss = {};  
//键盘释放：当输入框的键盘按键被松开时，把查询到的数据结果显示在标签中  
function callNumber(){  
var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
//如果结果有值，则显示比例；如果结果为0，则显示"[0/0]"；如果结果为空，则清空标签框;  
if(nodeList.length){  
    //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
    zTree.selectNode(nodeList[0],false );  
    document.getElementById("key").focus();  
    clickCount=0; //防止重新输入的搜索信息的时候，没有清空上一次记录  
   //显示当前所在的是第一条  
    document.getElementById("number").innerHTML="["+1+"/"+nodeList.length+"]";  
}else if(nodeList.length == 0){  
    document.getElementById("number").innerHTML="[0/0]";  
    zTree.cancelSelectedNode(); //取消焦点  
}  
//如果输入框中没有搜索内容，则清空标签框  
if(document.getElementById("key").value ==""){  
    document.getElementById("number").innerHTML="";  
    zTree.cancelSelectedNode();  
}  
}  
function focusKey(e) {  
if (key.hasClass("empty")) {  
    key.removeClass("empty");  
}  
}  
function blurKey(e) {  
if (key.get(0).value === "") {  
    key.addClass("empty");  
}  
}  
//搜索节点  
function searchNode(e) {  
var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
var value = $.trim(key.get(0).value);  
var keyType = "name";  
if (key.hasClass("empty")) {  
    value = "";  
}  
if (lastValue === value) return;  
lastValue = value;  
if (value === ""){  
    updateNodes(false);  
    return;  
};  
nodeList = zTree.getNodesByParamFuzzy(keyType, value); //调用ztree的模糊查询功能，得到符合条件的节点  
updateNodes(true); //更新节点  
}  	
//高亮显示被搜索到的节点  
function updateNodes(highlight) {  
var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
for( var i=0, l=nodeList.length; i<l; i++) {  
    nodeList[i].highlight = highlight; //高亮显示搜索到的节点(highlight是自己设置的一个属性)  
    zTree.expandNode(nodeList[i].getParentNode(), true, false, false); //将搜索到的节点的父节点展开  
    zTree.updateNode(nodeList[i]); //更新节点数据，主要用于该节点显示属性的更新  
}  
} 
//设置颜色  
function getFontCss(treeId, treeNode) {  
return (!!treeNode.highlight) ? {color:"#A60000", "font-weight":"bold"} : {color:"#333", "font-weight":"normal"};  
} 
//点击向上按钮时，将焦点移向上一条数据  
function clickUp(){  
var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
//如果焦点已经移动到了最后一条数据上，就返回第一条重新开始，否则继续移动到下一条  
if(nodeList.length==0){  
    alert("没有搜索结果！");  
    return ;  
}else if(clickCount==0) {  
    alert("您已位于第一条记录上！");  
    return;  
    //让结果集里边的下一个节点获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
    //zTree.selectNode(nodeList[clickCount], false)  
}else{  
    //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
    clickCount --;  
    zTree.selectNode(nodeList[clickCount], false);  
}  
document.getElementById("key").focus();  
//显示当前所在的是条数  
var num = clickCount + 1;  
document.getElementById("number").innerHTML = "[" + num + "/" + nodeList.length + "]";  
}  
//点击向上按钮时，将焦点移向下一条数据  
function clickDown(){  
var zTree = $.fn.zTree.getZTreeObj("tree_emp_Personneltree");  
//如果焦点已经移动到了最后一条数据上，则提示用户（或者返回第一条重新开始），否则继续移动到下一条  
if(nodeList.length==0){  
    alert("没有搜索结果！");  
    return ;  
}else if(nodeList.length-1==clickCount)  
{  
    alert("您已位于最后一条记录上！")  
    return;  
}else{  
    //让结果集里边的第一个获取焦点（主要为了设置背景色），再把焦点返回给搜索框  
    clickCount ++;  
    zTree.selectNode(nodeList[clickCount], false)  
}  
document.getElementById("key").focus();  
//显示当前所在的条数  
var num = clickCount + 1;  
document.getElementById("number").innerHTML = "[" + num + "/" + nodeList.length + "]";
}