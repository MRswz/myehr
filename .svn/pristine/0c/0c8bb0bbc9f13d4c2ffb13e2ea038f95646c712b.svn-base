<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="../bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<script type="text/javascript" src="../bootstrap2/bootstrap-switch.min.js"></script>
<style type="text/css">
.switch{float:left;display:none}
select{float:left;margin-right:5px}
.row.cell {margin-bottom:20px}
.widget{padding:20px 40px}
.row{margin-left:-15px}
#row span{width:100%;display:inline-block;white-space: nowrap;overflow:hidden}
</style>
</head>
<body>
<div class="container-fluid" style="width:100%;height:100%;padding:1% 0">
	<div class="form-control" style="width:75%;height:48%;margin:auto auto;">
		<div id="showCard"  style="width:99%;height:93%;margin:auto auto;overflow:auto">
			<div class="wrapper wrapper-content animated fadeInRight" style="height:100%">
				<div class="row" style="margin-left:0;height:100%;" id="GridByCard">
				</div>
			</div>
		</div>
	</div>
	<div  style="width:75%;height:4%;margin:auto auto;">
		<div class="BTNGROUP BTNGROUP_1042" style="margin:5px auto; display:inline-block;height: 30px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="yulan"  class="btn btn-primary" value=预览 onclick="yulan()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save"  class="btn btn-success" value=保存 onclick="save()"/>
			</div>
		</div>
	</div>
	
	<div id="valueContent" class="form-control" style="width:75%;height:103%;margin:auto auto;position:relative;">
		<div class="row cell" id="right1">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">左侧轴图标: </lable>
					<select id="right1_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="right1_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值对应图标: </lable>
					<input id="right1_linkMark" name="linkMark" type="text" class="form-control"  style="width:150px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="right1_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="12"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="left_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:150px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="right1_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
		<div class="row cell" id="right2">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">内容图像: </lable>
					<select id="right2_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="right2_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值对应图标: </lable>
					<input id="right2_linkMark" name="linkMark" type="text" class="form-control"  style="width:50px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="right2_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="12"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="left_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:150px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="right2_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
		<div class="row cell" id="right3">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">内容姓名: </lable>
					<select id="right3_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="right3_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值间链接符号: </lable>
					<input id="right3_linkMark" name="linkMark" type="text" class="form-control"  style="width:50px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="right3_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="12"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="left_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:150px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="right3_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
		<div class="row cell" id="right4">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">内容正文: </lable>
					<select id="right4_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="right4_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值间链接符号: </lable>
					<input id="right4_linkMark" name="linkMark" type="text" class="form-control"  style="width:50px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="right4_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="12"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体粗细: </lable>
					<input id="left_fontWeight" name="fontWeight" type="number" class="form-control"  style="width:150px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="right4_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
		<div class="row cell" id="left">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="float:left">
					<lable style="float:left;font-size:12px">轴字段: </lable>
					<select id="left_columnValue"  styleType="select" name="columnValue"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_LEVEL" nullItemText="请选择..." dataField="dict_form_3877"initParam = "_">
					</select>
					<input id="left_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="left_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="80"/><span style="float:left">px</span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">排序方式: </lable>
					<input id="left_linkMark" name="linkMark" type="text" class="form-control"  style="width:150px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">背景颜色: </lable>
					<input id="left_bgColor" name="bgColor" type="color" class="form-control"  style="width:150px;float:left" value="400"/><span style="float:left"></span>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="left_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#ffffff"/>
				</div>
			</div>
		</div>
		
	</div>
</div>
<script>
//根据表单ID获取字段信息做下拉项
$(function () { 
	initSelect();
	initData();
})

function initSelect(){
	var data;
	var formDefId = "${param.formDefId}";
	$.ajax({  
        url: '/myehr/formtemplate/getSelect.action?formDefId='+formDefId,  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    dataType:"json",    //服务器返回数据是什么类型  
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	data = result;
	    }  
    });
	$("select").each(function(){
		for(var i=0;i<data.length;i++){
			document.getElementById(this.id).options.add(new Option(data[i].text,data[i].id));		
		}
	});
	
}

function yulan(){
	var sList = [];
	var rows = $("#valueContent .row.cell");
	for(var i=0;i<rows.length;i++){
		var sysTimeaxisTemplateColumn={};
		if(rows[i].id=='divSize'){
			sysTimeaxisTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysTimeaxisTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysTimeaxisTemplateColumn.templateColumnCode=rows[i].id;
			sysTimeaxisTemplateColumn.templateColumnValue=$("#large").val()+','+$("#middle").val()+','+$("#small").val();
			sysTimeaxisTemplateColumn.templateColumnFormDefId=${param.formDefId};
			sysTimeaxisTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
		}else{
			sysTimeaxisTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysTimeaxisTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			sysTimeaxisTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysTimeaxisTemplateColumn.templateColumnCode=rows[i].id;
			sysTimeaxisTemplateColumn.templateColumnValue=$(rows[i]).find('select[name="columnValue"]').val();
			sysTimeaxisTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysTimeaxisTemplateColumn.templateColumnFontWeight=$(rows[i]).find('input[name="fontWeight"]').val();
			sysTimeaxisTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysTimeaxisTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}
		sList[i]=sysTimeaxisTemplateColumn;
	}
	
	showDate(sList);
}

function showDate(arr) {
	var cellObj = '';
    for (var i = arr.length - 1; i >= 0; i--) {
	    var message = arr[i].templateColumnCode;
	    var messages = new Array();
	    messages = message.split("|");
	    if(messages.length<2){
	        messages[1]=message;
	    }
	    var iconClass;
	    if(messages[0]=="通过"){
	        iconClass='vertical-timeline-icon';
	    }else{
	        iconClass='vertical-timeline-icon1';
	    }
		cellObj += '<div class="vertical-timeline-block">'+
						'    <div class="'+iconClass+'"></div>'+
						'    <div class="vertical-timeline-content clearfix">'+
						'        <div class="pic fl" style="float:left">'+
						'            <img src="http://p.3761.com/pic/43701399945993.png" alt="">'+
						'            <div id="shenpiren" class="shenpirens">'+arr[i].USER_NAME+'</div>'+
						'        </div>'+
						'        <div class="content fl">'+
						'            <div class="clearfix"></div>'+
						'		     <div class="shenpizhuangtai">'+messages[1]+'</div>'+
						'	     </div>'+
						'	     <div class="clearfix"></div>'+
						'    </div>'+
						'    <div id="shenpijieguo" class="shenpijieguo">'+
						'        <div id="shenpishijian" style="font-weight:bold;float:left" class="shenpishijian">'+arr[i].ENDTIME+'</div>'+
						'        <div id="shenpijiedian" style="font-weight:bold;float:left" class="shenpijiedian">'+arr[i].ACTNAME+'</div>'+
						'        <div id="shenpiyijian" style="font-weight:bold;float:left" class="shenpiyijian">'+messages[0]+'</div>'+
						'    </div>'+
						'</div>';
		
	}
	cellObj = '<div class="container-fluid">'+
		'<div style="margin-top:20px;">'+
			'<div class="wrapper wrapper-content animated fadeInRight ibox-content2">'+
				'<div class="row dark-timeline" id="approveList">'+
				cellObj+
				'</div>'+
			'</div>'+
		'</div>'+
	'</div>'+
	$('#GridByCard').html(cellObj);
}



var templateId = "0";
function save(){
	var sList = [];
	var rows = $("#valueContent .row.cell");
	for(var i=0;i<rows.length;i++){
		var sysTimeaxisTemplateColumn={};
		if(rows[i].id=='divSize'){
			sysTimeaxisTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysTimeaxisTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysTimeaxisTemplateColumn.templateColumnCode=rows[i].id;
			sysTimeaxisTemplateColumn.templateColumnValue=$("#large").val()+','+$("#middle").val()+','+$("#small").val();
			sysTimeaxisTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysTimeaxisTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else if(rows[i].id=='left'){
			var values = $(rows[i]).find('select[name="columnValue"]').val();
			sysTimeaxisTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysTimeaxisTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysTimeaxisTemplateColumn.templateColumnCode=rows[i].id;
			sysTimeaxisTemplateColumn.templateColumnValue=values;
			sysTimeaxisTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysTimeaxisTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysTimeaxisTemplateColumn.templateColumnFormDefId=${param.formDefId};
			sysTimeaxisTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			sysTimeaxisTemplateColumn.templateColumnBgColor=$(rows[i]).find('input[name="bgColor"]').val();
		}else{
			var values = "";
			var columnValue = $(rows[i]).find('select[name="columnValue"]').val();
			if(columnValue!=null&&columnValue!=''){
				for(var j = 0; j<columnValue.length ;j++){
					if(j==0){
						values = values + columnValue[0];
					}else{
						values = values +"&"+ columnValue[j];
					}
				}
				sysTimeaxisTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
				sysTimeaxisTemplateColumn.templateColumnTemplateId=${param.templateId};
				sysTimeaxisTemplateColumn.templateColumnCode=rows[i].id;
				sysTimeaxisTemplateColumn.templateColumnValue=values;
				sysTimeaxisTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
				sysTimeaxisTemplateColumn.templateColumnFontWeight=$(rows[i]).find('input[name="fontWeight"]').val();
				sysTimeaxisTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
				sysTimeaxisTemplateColumn.templateColumnFormDefId=${param.formDefId};
				sysTimeaxisTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			}
		}
		sList[i]=sysTimeaxisTemplateColumn;
	}
	
	$.ajax({  
        url: '/myehr/formtemplate/saveTimeaxisTemplate.action',  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    data:JSON.stringify(sList),
		contentType: 'application/json;charset=utf-8',
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
	    	parent.layer.close(index); //再执行关闭  
	    }  
    });
}
function initData(){
	$.ajax({  
        url: '/myehr/formtemplate/getTimeaxisTemplate.action?formDefId=${param.formDefId}&templateId=${param.templateId}',  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    success:function(datas){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
			for(var k=0;k<datas.length;k++){
				if(datas[k].templateColumnCode=='divSize'){
					$("#"+datas[k].templateColumnCode).find('input[name="id"]').val(datas[k].templateColumnId);
					$("#large").val(datas[k].templateColumnValue.split(",")[0]);
					$("#middle").val(datas[k].templateColumnValue.split(",")[1]);
					$("#small").val(datas[k].templateColumnValue.split(",")[2]);
					$("#"+datas[k].templateColumnCode).find('input[name="fontColor"]').val(datas[k].templateColumnFontColor);
				}else{
					$("#"+datas[k].templateColumnCode).find('input[name="id"]').val(datas[k].templateColumnId);
					$("#"+datas[k].templateColumnCode).find('select[name="columnValue"]').val(datas[k].templateColumnValue.split("&"));
					$("#"+datas[k].templateColumnCode).find('input[name="fontSize"]').val(datas[k].templateColumnFontSize);
					$("#"+datas[k].templateColumnCode).find('input[name="fontWeight"]').val(datas[k].templateColumnFontWeight);
					$("#"+datas[k].templateColumnCode).find('input[name="fontColor"]').val(datas[k].templateColumnFontColor);
					$("#"+datas[k].templateColumnCode).find('input[name="linkMark"]').val(datas[k].templateColumnLinkMark);
					$("#"+datas[k].templateColumnCode).find('input[name="bgColor"]').val(datas[k].templateColumnBgColor);
				}
				
			}
	    }  
    });
}

function closex(){
	var index=parent.layer.getFrameIndex(window.name);
	parent.layer.close(index);
}

</script>
</body>
</html>