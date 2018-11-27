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
			    <input type="button" id="yulan"  class="btn btn-primary" value="预览" onclick="yulan()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save"  class="btn btn-success" value="保存" onclick="save()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addElement"  class="btn btn-info" value="增加" onclick="addElement(null)"/>
			</div>
		</div>
	</div>
	
	<div id="valueContent" class="form-control" style="width:75%;height:103%;margin:auto auto;position:relative;overflow:auto">
		<div class="row cell" id="divSize">
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">大屏显示列数: </lable>
					<input id="large" name="" type="text" class="form-control"  style="width:100px;"/>
					<input id="divSize_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">小屏显示列数: </lable>
					<input id="middle" name="" type="text" class="form-control"  style="width:100px;"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">扩展字段显示列数: </lable>
					<input id="small" name="" type="text" class="form-control"  style="width:100px;" />
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值间链接符号: </lable>
					<input id="divSize_linkMark" name="linkMark" type="hidden" class="form-control"  style="width:220px;" value=""/>
					<input id="divSize_linkMarkName" name="linkMarkName" type="text" class="form-control"  style="width:150px;float:left"/>
					<input type="button" id="chooseFormStep2"  class="btn btn-success" style="float:left" value='跳转表单' onclick="chooseFormStep2()"/>
				</div>
			</div>
		</div>
		<div class="row cell" id="title">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">标题元素: </lable>
					<select id="title_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="title_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值间链接符号: </lable>
					<input id="title_linkMark" name="linkMark" type="text" class="form-control"  style="width:50px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="title_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="12"/><p style="float:left">px</p>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="title_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#000000"/>
				</div>
			</div>
		</div>
		<div class="row cell" id="address">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">位置元素: </lable>
					<select id="address_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="address_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值间链接符号: </lable>
					<input id="address_linkMark" name="linkMark" type="text" class="form-control"  style="width:50px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="address_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="12"/><p style="float:left">px</p>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="address_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#000000"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">是否标签化: </lable>
					<input id="address_isTag" name="isTag" type="text" class="form-control"  style="width:150px;" value="N"/>
				</div>
			</div>
		</div>	
		<div class="row cell" id="photo">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="float:left">
					<lable style="float:left;font-size:12px">图片元素: </lable>
					<select id="photo_columnValue"  styleType="select" name="columnValue"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_LEVEL" nullItemText="请选择..." dataField="dict_form_3877"initParam = "_">
					</select>
					<input id="photo_id" name="id" type="hidden"/>
				</div>
			</div>
		</div>
		<div class="row cell" id="name">	
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="float:left">
					<lable style="float:left;font-size:12px">姓名元素: </lable>
					<select id="name_columnValue" title="" styleType="select" name="columnValue"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_LEVEL" nullItemText="请选择..." dataField="dict_form_3877"initParam = "_">
					</select>
					<input id="name_id" name="id" type="hidden"/>
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
		var sysGridbycardTemplateColumn={};
		if(rows[i].id=='divSize'){
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$("#large").val()+','+$("#middle").val()+','+$("#small").val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else{
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$(rows[i]).find('select[name="columnValue"]').val();
			sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}
		sList[i]=sysGridbycardTemplateColumn;
	}
	
	var titlex = sList[1].templateColumnValue;
	if(titlex!=null){
		for(var i = 0 ; i < titlex.length ; i++){
			if(i==0){
				titles = "["+titlex[i].split('\|')[0]+"]" ;
			}else{
				titles = titles +sList[1].templateColumnLinkMark+ "[" + titlex[i].split('\|')[0] + "]";
			}
		}
	}
	
	position = sList[2].templateColumnValue;
	var positionx = position;
	if(position!=null){
		for(var i = 0 ; i < positionx.length ; i++){
			if(i==0){
				positions = "["+ positionx[i].split('\|')[0]+"]";
			}else{
				positions = positions +sList[2].templateColumnLinkMark+"[" + positionx[i].split('\|')[0]+ "]";
			}
		}
	}
	
	photo = sList[3].templateColumnValue;
	name = sList[4].templateColumnValue;
	var model ="";
	var large = 12/sList[0].templateColumnValue.split(",")[0];
	var middle = 12/sList[0].templateColumnValue.split(",")[1];
	var small = 12/sList[0].templateColumnValue.split(",")[2];
	//(b == 5) ? a="true" : a="false";
	for(var i = 0 ;i<4;i++){
		model += '<div class="col-md-'+middle+' col-sm-'+small+' col-lg-'+large+'">'+
			    '    <div class="contact-box">'+
			    '        <a href="http://www.baidu.com">';
	    if(photo!=null&&photo!=""){		
		model +='            <div class="col-sm-4">'+
			    '                <div class="text-center">'+
		        '           		<img width="100" style="margin:0 auto" title="xxx" alt="image" class="img-circle m-t-xs img-responsive" src="http://192.168.1.109:9999/photo/B001.jpg">';			
		if(name!=null&&name!=""){		
		model +='                   <div class="m-t-xs font-bold" title=\"['+name.split('\|')[0]+']\" style=\"\">['+name.split('\|')[0]+']</div>';
		}		
		model +='                </div>'+
			    '            </div>';
		}		
		model +='            <div class="col-sm-8">';		
		if(title!=null&&title!=""){			
		model += '                <h3 style="color:'+sList[1].templateColumnFontColor+';margin-top:0;overflow:hidden;height:26px" title=\"'+titles+'\" ><strong>'+titles+'</strong></h3>';
		}
		if(position!=null&&position!=""){	
		model += '                <p style="color:'+sList[2].templateColumnFontColor+';overflow:hidden;height:15px" title=\"'+positions+'\" ><i class="fa fa-map-marker" ></i>'+positions+'</p>';
		}
		model += '                <div class=\"row\" id=\"row\" >';
		for(var j=5;j<sList.length;j++){
					model+= '				<div class="col-lg-'+small+' col-md-'+small+' col-sm-'+small+' col-xs-'+small+'">'+
							'					<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:200px">'+
							'						<lable style="float:left;font-size:12px">'+sList[j].templateColumnValue.split("|")[1]+': </lable><p>['+sList[j].templateColumnValue.split("|")[0]+']</p>'+
							'					</div>'+
							'				</div>';
				}
		model += '                </div>'+
				 '            </div>'+
				 '            <div class="clearfix"></div>'+
				 '        </a>'+
				 '    </div>'+
				 '</div>';
	}
	$('#GridByCard').html(model);
}




var templateId = "0";
function save(){
	var sList = [];
	var rows = $("#valueContent .row.cell");
	var rightNum=0;
	for(var i=0;i<rows.length;i++){
		var sysGridbycardTemplateColumn={};
		if(rows[i].id=='divSize'){
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$("#large").val()+','+$("#middle").val()+','+$("#small").val();
			sysGridbycardTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else if(rows[i].id=='address'||rows[i].id=='title'){
			var values = "";
			var columnValue = $(rows[i]).find('select[name="columnValue"]').val();
			if(columnValue!=null){
				for(var j = 0; j<columnValue.length ;j++){
					if(j==0){
						values = values + columnValue[0];
					}else{
						values = values +"&"+ columnValue[j];
					}
				}
				sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
				sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
				sysGridbycardTemplateColumn.templateIsTag=$(rows[i]).find('input[name="isTag"]').val();
				sysGridbycardTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			}
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=values;
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else if(rows[i].id=='photo'||rows[i].id=='name'){
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$(rows[i]).find('select[name="columnValue"]').val();
			sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
			rightNum++;
		}else{
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode="right"+rightNum;
			sysGridbycardTemplateColumn.templateColumnValue=$(rows[i]).find('select[name="columnValue"]').val();
			sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
			rightNum++;
		}
		sList[i]=sysGridbycardTemplateColumn;
	}
	
	$.ajax({  
        url: '/myehr/formtemplate/saveCardTemplate.action',  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    data:JSON.stringify(sList),
		contentType: 'application/json;charset=utf-8',
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
			layer.alert('保存成功', {
					  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
	    	closex();
	    }  
    });
}

var cesllObjNum = 0;
function initData(){
	$.ajax({  
        url: '/myehr/formtemplate/getDataInfo.action?formDefId=${param.formDefId}&templateId=${param.templateId}',  
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
				}else if(datas[k].templateColumnCode=='title'||datas[k].templateColumnCode=='address'||datas[k].templateColumnCode=='photo'||datas[k].templateColumnCode=='name'){
					$("#"+datas[k].templateColumnCode).find('input[name="id"]').val(datas[k].templateColumnId);
					$("#"+datas[k].templateColumnCode).find('select[name="columnValue"]').val(datas[k].templateColumnValue.split("&"));
					$("#"+datas[k].templateColumnCode).find('input[name="fontSize"]').val(datas[k].templateColumnFontSize);
					$("#"+datas[k].templateColumnCode).find('input[name="fontColor"]').val(datas[k].templateColumnFontColor);
					$("#"+datas[k].templateColumnCode).find('input[name="isTag"]').val(datas[k].templateIsTag);
					$("#"+datas[k].templateColumnCode).find('input[name="linkMark"]').val(datas[k].templateColumnLinkMark);
				}else{
					addElement(datas[k]);
				}
			}
	    }  
    });
}
var numElement = 0;
function addElement(e){
	var id = '';
	var value = '';
	var fontsize = '12';
	var color = '';
	if(e!=null){
		id=e.templateColumnId;
		fontsize=e.templateColumnFontSize;
		color=e.templateColumnFontColor;
	}
	var cellobj =   '<div class="row cell elementColumn" id="right'+numElement+'" style="border: 1px solid #ccc;border-radius: 12px;position:relative">\n'+
					'	<span class="fa fa-trash" style="font-size: 28px; position: absolute;bottom: 24px;right: 12px;z-index:999" onclick="deleteElement('+numElement+')"></span>\n'+
					'	<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">\n'+
					'		<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">\n'+
					'			<lable style="float:left;font-size:12px">字段元素: </lable>\n'+
					'			<select id="right'+numElement+'_columnValue" title="" styleType="select" name="columnValue"  class="form-control" style="width:200px;" >\n'+
					'			</select>\n'+
					'			<input id="right'+numElement+'_id" name="id" type="hidden" value=\"'+id+'\"/>\n'+
					'		</div>\n'+
					'	</div>\n'+
					'	<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">\n'+
					'		<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">\n'+
					'			<lable style="float:left;font-size:12px">字体大小: </lable>\n'+
					'			<input id="right'+numElement+'_fontSize" name="fontSize" value=\"'+fontsize+'\" type="number" class="form-control"  style="width:220px;float:left" value="12"/><span style="float:left">px</span>\n'+
					'		</div>\n'+
					'	</div>\n'+
					'	<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">\n'+
					'		<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">\n'+
					'			<lable style="float:left;font-size:12px">字体颜色: </lable>\n'+
					'			<input id="right'+numElement+'_fontColor" name="fontColor" value=\"'+color+'\" type="color" class="form-control"  style="width:220px;" value="#ffffff"/>\n'+
					'		</div>\n'+
					'	</div>\n'+
					'</div>\n';
	$("#valueContent").append(cellobj);
	initSelect();
	if(e!=null){
		$("#"+"right"+numElement+"_columnValue").val(e.templateColumnValue.split("&"));
	}
	
	cesllObjNum++;
	numElement++;
}


function chooseFormStep2(e){
	var url = '/myehr/jsp/form/formcreate/formChoose.jsp?fromType=config_form&widget=model5';
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'选择表单',
		content:url,
		success:function(layero,index){
		},
		end:function(){			
			
		}
	 }); 
} 

function closex(){
	var index=parent.layer.getFrameIndex(window.name);
	parent.layer.close(index);
}

function getFormNameById(formDefId){
	var formDefName;
	$.ajax({
		url:'/myehr/form/getFormNameById.action?formDefId='+formDefId,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
			formDefName = data.formDefName;
			}
		});
	return formDefName;
}

function deleteElement(e){
	//$("#right"+e).css("display","none");
	var id = $("#right"+e).find('input[name="id"]').val();
	$("#right"+e).remove();
	//$("#right"+e+"_columnValue").val(0);
	if(id!=null&&id!=""){
		$.ajax({
			url:'/myehr/formtemplate/deleteTemplateColumnById.action?templateColumnId='+id,
			type:'post',
			cache: false,
			success: function (data) {
			}
			
		});
	}
}

</script>
</body>
</html>