<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<html>
<head>
</head>

<body>
<div id='updateTab' class='row cell' style='border:none;line-height:25px;overflow:auto;' >
	<div class='col-lg-12 col-md-12 col-sm-12 col-xs-12 updateTab'>
		<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>
			<lable style='float:left;font-size:12px'>附表名称</lable>
			<input id='tabDetailFormTitle' name='tabDetailFormTitle' class='form-control' title='附表名称' type='text'  style='width:60%;'/>
		</div>
	</div>
	<div class='col-lg-12 col-md-12 col-sm-12 col-xs-12 updateTab' >
		<div class='ui search selection dropdown entitybox field-control' class='form-control' style='display: inline-block;width:100%;'>
			<lable style='float:left;font-size:12px'>附表顺序</lable>
			<input id='tabDetailSort' name='tabDetailSort' title='附表顺序' class='form-control' type='text'  style='width:60%;'/>
		</div>
	</div>
	<div class='col-lg-12 col-md-12 col-sm-12 col-xs-12 updateTab' >
		<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>
			<lable style='float:left;font-size:12px'>附表初始化</lable>
			<input id='isOpen' name='isOpen' title='展开' type='checkbox'  style=''/>展开(是否默认展开)
			<input id='isCount' name='isCount' title='合计' type='checkbox'  style=''/>合计(是否需要合计)
			<input id='isAdd' name='isAdd' title='新增' type='checkbox' checked style=''/>新增(是否需要新增)
			<input id='isEdit' name='isEdit' title='修改' type='checkbox' checked style=''/>修改(是否需要修改)
			<input id='isDelete' name='isDelete' title='删除' type='checkbox' checked style=''/>删除(是否需要删除)
			<input id='youxiao' name='config' title='有效' type='radio'  style=''/>有效
			<input id='zuixin' name='config' title='最新' type='radio'  style=''/>最新
			<input id='all' name='config' title='所有' type='radio'  style=''/>所有
		</div>
	</div>
</div>
<div class="BTNGROUP" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
	<div style="margin-right:10px;display:inline-block">
		<input type="button" id="save_formCard1"  class="btn btn-success" value=保存(卡片式) onclick="updateTabDetail()"/>
	</div>
	<div style="margin-right:10px;display:inline-block">
		<input type="button" id="closeCard1"  class="btn btn-primary" value=关闭 onclick="closex()"/>
	</div>
</div>
<script>
var mstTabId = '${param.mstId}';
$(function () {  
	var datas = getData();
	initData(datas);
});
function getData(){
	var objs = {};
	$.ajax({
		url:'/myehr/form/getMstTabDetailById.action?tabDetailId='+mstTabId,
		type:'post',
		async: false,
		cache: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
			objs = data;
		}
	});
	return objs;
}
function initData(e){
	$("#tabDetailFormTitle").val(e.tabDetailFormTitle);
	$("#tabDetailSort").val(e.tabDetailSort);
	var config = e.tabDetailConfig;
	if(config!=null){
		var configs = config.split(",");
		if(configs.length>0){
			if(configs[0]=='Y'){
				$("#isOpen").prop("checked",true);
			}
			if(configs[1]=='Y'){
				$("#isCount").prop("checked",true);
			}
			if(configs[2]=='N'){
				$("#isAdd").prop("checked",false);
			}
			if(configs[3]=='N'){
				$("#isEdit").prop("checked",false);
			}
			if(configs[4]=='N'){
				$("#isDelete").prop("checked",false);
			}
			if(configs[5]=='Y'){
				$("#youxiao").prop("checked",true);
			}
			if(configs[6]=='Y'){
				$("#zuixin").prop("checked",true);
			}
			if(configs[7]=='Y'){
				$("#all").prop("checked",true);
			}
	
		}
	}
}
function updateTabDetail(){
	var obj = {};
	obj.tabDetailFormTitle = $("#tabDetailFormTitle").val();
	obj.tabDetailSort = $("#tabDetailSort").val();
	var config = '';
	if($("#isOpen").prop("checked")){
		config += 'Y'+',';
	}else{
		config += 'N'+',';
	}
	if($("#isCount").prop("checked")){
		config += 'Y'+',';
	}else{
		config += 'N'+',';
	}
	if($("#isAdd").prop("checked")){
		config += 'Y'+',';
	}else{
		config += 'N'+',';
	}
	if($("#isEdit").prop("checked")){
		config += 'Y'+',';
	}else{
		config += 'N'+',';
	}
	if($("#isDelete").prop("checked")){
		config += 'Y'+',';
	}else{
		config += 'N'+',';
	}
	if($("#youxiao").prop("checked")){
		config += 'Y'+',';
	}else{
		config += 'N'+',';
	}
	if($("#zuixin").prop("checked")){
		config += 'Y'+',';
	}else{
		config += 'N'+',';
	}
	if($("#all").prop("checked")){
		config += 'Y';
	}else{
		config += 'N';
	}
	
	obj.tabDetailConfig = config;
	obj.tabDetailId = mstTabId;
	$.ajax({  
		url:'/myehr/form/updateTabDetail.action',  
		type:'post',
		cache: false,
		async: false,
		contentType:'application/json',  
		data:JSON.stringify(obj),
		success:function(msg){  
			if(msg=="1"){  
				layer.alert('修改成功', {
					  offset:'50%',
					  shift: 6,
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})

			}else{  
				layer.alert('修改失败', {
					  offset:'50%',
					  shift: 6,
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
			}  
			refresh();    
		}  
	});
}
</script>
</body>
</html>
