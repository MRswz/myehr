<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<%
	String formButtonId = request.getParameter("formButtonId");
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>导入按钮配置</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/js/upload/jquery.uploadify.h5.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/common/js/upload/uploadify-min.css" type="text/css"></link>
</head>
<body style="text-align:center">
<form id="form_1881" name="form_1881" >
	<div class=container-fluid style="position: relative;min-height:100%;">
		<div style="padding: 10px;">
			<input id="SYS_SYSTEM_SCHEME.buttonExportId" name="buttonExportId" type="hidden" class="form-control"  style="width:200px;"/>
			<input id="SYS_SYSTEM_SCHEME.formButtonId" name="formButtonId" type="hidden" class="form-control"  style="width:200px;" value="<%=formButtonId %>"/>
			<div style="border:1px solid #ccc;position:relative;border-radius:5px;margin-bottom:10px;padding:10px;height:80%">
				<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center;z-index:999">待选参数窗口设置</h3>
				<div id="step2_part1" style="height:100%;padding:10px;display:block;overflow:auto">
					<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
						<tr style="height:40px" width="100%">
							<td style="padding-left:10px;"  width="150"  class="td1"><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"按钮操作方案")%>：</lable></td>
							<td style="padding-left:10px;"  align="left" class="td1" >
								<select id="SYS_SYSTEM_SCHEME.buttonExportExcType" onchange="changeeSlect1(this)"  title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"按钮操作方案")%>" name="buttonExportExcType"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_BUTTON_SAVE_EXC_TYPE" nullItemText="请选择" dataField="dicts"></select>
							</td>
						</tr>
						<tr style="height:40px" width="100%">
							<td style="padding-left:10px;"  width="150"><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出文件名称")%>：</lable></td>
							<td colspan="3"  style="padding-left:10px;"  align="left">
								<input type="text" id="SYS_SYSTEM_SCHEME.buttonExportFilename" name="buttonExportFilename" class="form-control"  style="width:200px;display:inline-block"/>
							</td>
						</tr>
						<tr id="tr4">
							<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导出SQL")%>：</lable></td>
							<td colspan="3" style="padding-left:10px;"  align="left">
								<textarea  id="SYS_SYSTEM_SCHEME.buttonExportSql" name="buttonExportSql"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
							</td>
						</tr>
						<tr id="tr5">
							<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"按钮初始化方案")%>：</lable></td>
							<td colspan="3" style="padding-left:10px;"  align="left">
								<textarea  id="SYS_SYSTEM_SCHEME.buttonExportInitFun" name="buttonExportInitFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
							</td>
						</tr>
						<tr id="tr6">
							<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义操作方案")%>：</lable></td>
							<td colspan="3" style="padding-left:10px;"  align="left">
								<textarea  id="SYS_SYSTEM_SCHEME.buttonExportFun" name="buttonExportFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<div style="position:absolute;height:35px;width:100%;padding: 5px 0;bottom: 0;background-color: #FFF;">
			<div style="margin-right:10px;display:inline-block">
				<input type="button" id="save_formemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save_formemp_emp_edit_click_1881()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
				<input type="button" id="closeemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_1881()"/>
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

var fileid;
$('#uploadify').Huploadify({
	    fileTypeExts: "*.xls;*.xlsx;", // 扩展名
	    uploader: '${pageContext.request.contextPath }/form/uploadData.action',           // 服务器端处理地址
	    auto: true, // 选择之后，自动开始上传
	    showUploadedPercent: false,
	    //swf: '../../../Utility/Ueditor/plugins/uploadify/uploadify.swf',    // 上传使用的 Flash
	    buttonText: "上传文件",                 // 按钮上的文字
	    buttonCursor: 'hand',                // 按钮的鼠标图标
	    fileObjName: 'Filedata',            // 上传参数名称
	    fileTypeDesc: "请选择 xls xlsx 文件",     // 文件说明
	    multi: true,               // 是否支持同时上传多个文件
	    overrideEvents: ['onDialogClose'],
	    fileSizeLimit: '2048',
	    //文件选择后的容器ID
	    queueID: 'uploadfileQueue',
	    onUploadProgress: function (file, bytesUploaded, bytesTotal, totalBytesUploaded, totalBytesTotal) {
	        //有时候上传进度什么想自己个性化控制，可以利用这个方法
	        //使用方法见官方说明
	        alert(1);
	    },
	    //选择上传文件后调用
	    onSelect: function (file) {
	        layer.load();
	    },
	    onComplete:function (event, ID, fileObj, response, data) {	
	    	alert(fileObj);
	    },
	    //返回一个错误，选择文件的时候触发
	    onSelectError: function (file, errorCode, errorMsg) {
	        closeload();
	        var str = '';
	        switch (errorCode) {
	            case -110:
	                alert("上传失败，文件大小不能超过2M");
	                break;
	            case -120:
	                alert("上传失败，文件大小不能超过2M");
	                break;
	            case -130:
	                alert("您上传的文件格式不对，请重新选择");
	                break;
	        }
	    },
	    //检测FLASH失败调用
	    onFallback: function () {
	        $('.xubox_shade').remove();
	        $('.xubox_layer').remove();
	        alert("您未安装FLASH控件，无法上传文件！请安装FLASH控件后再试。");
	    },
	    //上传到服务器，服务器返回相应信息到data里
	    onUploadSuccess: function (file, data, response) {
	        $('.xubox_shade').remove();
	        $('.xubox_layer').remove();
	        if (data === "1") {
	            layer.alert("文件格式不正确！");
	        }
	        else if (data === "0") {
	            layer.alert("上传出错！");
	        } else {
	            document.getElementById("SYS_SYSTEM_SCHEME.buttonImportSql").value=file.name;
	            var file=JSON.parse(data);
	            filepath=file.filepath;
	            fileid=file.fileid;
	            document.getElementById("SYS_SYSTEM_SCHEME.buttonImportUrl").value=file.filepath;
				document.getElementById("SYS_SYSTEM_SCHEME.buttonImportTemplate").value=file.fileid;
	            layer.closeAll();
	        }
	    },
	    onCancel: function (file) {
	    }
	});

$(function() {
	//querys_1041();
	$(".fixed-table-toolbar").css("margin-top","0px");
	$(".container-fluid").css("max-height","100%");
	$(".bootstrap-table").css("height","450px");
	$(".fixed-table-container").css("height",$('body').height()*0.7 -90 +"px");
	$(".fixed-table-body").css("height","80%");

	console.log($(".BTNGROUP_1041>div").length);
	var DIVAMOUNT = 5;
	if($(".BTNGROUP_1041>div").length > DIVAMOUNT){
		var len = $(".BTNGROUP_1041>div").length;
		$(".BTNGROUP_1041>div:gt(4)").hide();
		var selectObj = $('<div class="btn-group"><button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">更多 <span class="caret"></span></button><ul class="dropdown-menu" style="min-width:90px;left:-14px;"></ul></div>');
		$(".BTNGROUP_1041").append(selectObj);
		for(var i=DIVAMOUNT;i<len;i++){
			var liObj = $('<li style="margin-left:14px;"></li>');
			liObj.append($(".BTNGROUP_1041>div").eq(i).clone(true));
			selectObj.find('.dropdown-menu').append(liObj);
			selectObj.find('.dropdown-menu').append($('<li role="separator" class="divider"></li>'));
		}
		selectObj.find('.dropdown-menu div').show();
	}
});
	var _formId_1041='${param.formId}';
    function querys_1041() {
        $("#scheme_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/button/queryExportColumnByButtonId.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : '400',
            undefinedText : '-',
            pagination : true,
            striped : true,
            queryParams : grid_org_list_fun,
            cache : false,
            pageSize : 200, 
            pageList : [10,20,50,10000], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [{
                field : 'state',
                checkbox : true,
                align : 'center',
                valign : 'middle'
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
                field : 'defaultXH',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value=index+1;
                    }
                    return "<a style=\"font-size:14px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>"+
							"<input type=\"form-control\" name=\"IMPORT_COLUMN_ID\" style=\"width:0px;padding:0px;border:hidden\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"主键Id\" value=\""+row.EXPORT_COLUMN_ID+"\"/>"+
							"<input type=\"form-control\" name=\"FORM_COLUMN_ID\" style=\"width:0px;padding:0px;border:hidden\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段Id\" value=\""+row.FORM_COLUMN_ID+"\"/>";
                }
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段名称")%>',
                field : 'FORM_FIELD_TABLENAME',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"FORM_FIELD_TABLENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段名称\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>',
                field : 'FORM_COLUMN_LABLE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"FORM_COLUMN_LABLE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"字段显示名称\">"+value+"</a>";
                }
			}, 
			{  
				title : '重导入字段',  
				field : 'IMPORT_RE_COLUMN_REL_ID',  
				align : 'center',  
				valign : 'middle', 
				width:200,
				formatter: function (value, row, index) {
					if(value==undefined){
						value = "";
					}
					return "<select id=\"IMPORT_RE_COLUMN_REL_ID"+index+"\" class=\"form-control\" name=\"IMPORT_RE_COLUMN_REL_ID\" DictName=\"\" dataField=\"sql_form_0000\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"重导入字段\" value=\""+value+"\"/>" ;
				}
			}, 
			{  
				title : '翻译方式',  
				field : 'EXPORT_COLUMN_TYPE',  
				align : 'center',  
				valign : 'middle', 
				width:200,
				formatter: function (value, row, index) {
					if(value==undefined){
						value = "";
					}
					return "<select id=\"EXPORT_COLUMN_TYPE"+index+"\" class=\"form-control\"  name=\"EXPORT_COLUMN_TYPE\" DictName=\"SYS_COLUMN_IMPORT_TYPE\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" nullItemText=\"请选择\" data=\"\" data-title=\"翻译方式\" value=\""+value+"\"/>" ;
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联字典")%>',
                field : 'EXPORT_COLUMN_DICT_TYPE',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                    return "<a  class=\"eli w100\" style=\"font-size:14px;text-decoration:none;color:black;width:200px;\" name=\"EXPORT_COLUMN_DICT_TYPE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"关联字典\">"+value+"</a><i onclick=\"choseDict("+row.EXPORT_COLUMN_ID+")\" class=\"glyphicon glyphicon-plus\"></i>"+
					"<input type=\"form-control\" name=\"EXPORT_COLUMN_DICT_TYPE\" style=\"width:0px;padding:0px;border:hidden\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"关联字典\" value=\""+value+"\"/>";
                }
            },
			{  
				title : '禁止导出',  
				field : 'EXPORT_COLUMN_FORBID',  
				align : 'center',  
				valign : 'middle', 
				width:200,
				formatter: function (value, row, index) {
					if(value==undefined){
						value = "";
					}
					return "<select id=\"EXPORT_COLUMN_FORBID"+index+"\" class=\"form-control\"  name=\"EXPORT_COLUMN_FORBID\" DictName=\"IMPORT_FORBID\" dataField=\"\" data=\"\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"禁止导入\" value=\""+value+"\"/>" ;
				}
            },
			{
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联SQL")%>',
                field : 'ESQL',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='';
                    }
                    return "<input id=\"ESQL"+index+"\" name=\"ESQL\" type=\"hidden\"  class=\"eli w100\" style=\"font-size:14px;color:black;width:150px\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"关联SQL\"\>"+value+"<i onclick=\"choseForm("+row.EXPORT_COLUMN_ID+")\" class=\"glyphicon glyphicon-plus\"></i>";
                }
            },
            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onLoadSuccess: function (aa, bb, cc) {
                addListSelect();
            },
            responseHandler : function(res) {  
                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
            'click #remove': function (e, value, row, index) {  
            $.ajax({  
                type: 'POST', 
                data: JSON.stringify(row),  
                url: '${pageContext.request.contextPath }/dictType/removeSysDictType.action',  
                success: function (data) {  
                    alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除成功")%>');
                    window.location.href = window.location.href; 
                    $('#scheme_list_List').bootstrapTable(
                        'remove', {  
                            field: 'Id',  
                            values: [row.Id],  
                        }
                    );  
                    $('#scheme_list_List').bootstrapTable(
                        'refresh',{
                            url:'${pageContext.request.contextPath }/dictType/findDictTypeList2.action'  
                        }
                    );
                }
            });
        }
    };
}
/** 刷新页面 */ 
function refresh_org_list() { 
    $('#scheme_list_List').bootstrapTable('refresh'); 
}

function grid_org_list_fun(pageReqeust){
	var _filterdata={};
	
	var calculateId = document.getElementById("SYS_SYSTEM_SCHEME.formButtonId").value;
	_filterdata={calculateId:calculateId};
	var userId = '${sessionScope.userid}';
	var paramsMap = {userId:userId};
	var requestParam={};
	var formButtonId = '${param.formButtonId}';
	requestParam = {formButtonId:formButtonId};
	
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.formId=_formId_1041;
	pageReqeust.isView=null;
	return JSON.stringify(pageReqeust);
}
function grid_org_list_fun11(){
	$('#scheme_list_List').bootstrapTable('refresh');
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
		$.map($('[name=form_1881]').serializeArray(), function(item, index){
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
	var formId='${param.formId}';
	var containerParam={};
	window.onload=function(){
		$("#tr2").show();
		$("#tr5").show();
		$("#tr6").hide();
		initDict();
		var formButtonId = '${param.formButtonId}';
		if(formButtonId!='' && formButtonId!=null){
			_initData(formButtonId);
		}
	}
	
	function initDict(obj){
		for(var i=0;i<classes.length;i++){
			if(obj==undefined){
			}else{
				classes[i].options.length=0;
			}
			if(classes[i].id=='SYS_ICON.buttonAddExcType'){
				parame.jsonParam.dictTypeCode=buttonAddExcTypeDict;
			}else{
				parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			}
			
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			var dataField=$(classes[i]).attr('dataField');
			var data=$(classes[i]).attr('data');
			parame.placeholder="";
			parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
			parame.dictData = "SYS_FORM_BUTTON_SAVE_EXC_TYPE,default,fun";
			if(type=="true"){
				myehr_initSelectMore(parame,dataField);
			}else{
				myehr_initSelect(parame,dataField,containerParam,data);
			}
		}
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
			dataField = dataField+"|"+${param.formId};
			var data=$(classes[i]).attr('data');
			parame.placeholder="";
			parame.value=$(classes[i]).attr('value');
			parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField);
			}else{
				myehr_initSelect(parame,dataField,containerParam,data);
			}
		}
	}
	
	function addScheme(){
		var calculateId = document.getElementById("SYS_SYSTEM_SCHEME.calculateId").value;
		var url = '/myehr/jsp/form/formcreate/button/queryScheme.jsp?calculateId='+calculateId;
		layer.open({
			type: 2,
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择方案")%>',
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
	
	
	function deleteScheme(){
		var selects = $("#scheme_list_List").bootstrapTable('getSelections');;
		if(selects!=null && selects.length>0){
			select = selects;
		}else {
			alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
		}
		
		var selects = $("#scheme_list_List").bootstrapTable('getSelections');;
		if(selects!=null && selects.length>0){
			select = selects;
		}else {
			alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
		}
		
		
		var paramsMap = {'userId' : '${sessionScope.userid}',selectdata:selects,calculateId:'${param.calculateId}'};
		var _param = {};
		_param.formId=1881;
		_param.buttonId=2803;
		_param.paramsMap = paramsMap;
		$.ajax({
			url:'${pageContext.request.contextPath }/scheme/deleteSelectScheme.action',
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
					$('#scheme_list_List').bootstrapTable('refresh'); 
				}
			}
		});
	}

	function save_formemp_emp_edit_click_1881(){
		var paramsMap = {'userId' : '${sessionScope.userid}'};
		var _param = {};
		_param.formId=formId;
		_param.buttonId='${param.formButtonId}';
		_param = getdata_1881(_param.buttonId,formId);
		_param.paramsMap = paramsMap;
		$.ajax({
			url:'${pageContext.request.contextPath }/button/saveExportButton.action',
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
					//saveData();
				}
			}
		});
	}
	
	function saveData(){
		var saveDate = getEntityData();
		var param = {};
		param.columns= saveDate;
		var formButtonId = document.getElementById("SYS_SYSTEM_SCHEME.formButtonId").value;
		$.ajax({
			url:'${pageContext.request.contextPath }/button/saveExportButtonColumn.action?formButtonId='+formButtonId,
			type:'post',
			cache: false,
			contentType: 'application/json;charset=utf-8',
			data:JSON.stringify(param),
			async: false,
			success: function (data) {
				if(data[0]=="0"){
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功")%>");
					$('#scheme_list_List').bootstrapTable('refresh');
				}
			}
		});
	}
	
	function getEntityData(){
		var i = 0;
		var data = [];
		var formButtonId = document.getElementById("SYS_SYSTEM_SCHEME.formButtonId").value;
		$("#scheme_list_List>tbody").find("tr").each(function(){
			var table = {};
			table.exportColumnId=$(this).find("input").eq(1).val();
			table.exportColumnRelId=$(this).find("input").eq(2).val();
			table.exportColumnDictType=$(this).find("input").eq(3).val();
			table.exportReColumnRelId=$(this).find("select").eq(0).val();
			table.exportColumnType=$(this).find("select").eq(1).val();
			table.exportColumnForbid=$(this).find("select").eq(2).val();
			table.importColumnButtonId=formButtonId;
			
			data[i] = table;
			i++;
		})
		return data;
	}

	function _initData(pkId){
		var formButtonId = '${param.formButtonId}';
		if(formButtonId==undefined || formButtonId=='' ){
			ruleId = '${param.formButtonId}';
		}
		
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/button/queryExportButtonById.action?formButtonId='+formButtonId,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text !=null){
					var object = text;
					if(object.buttonImportTemplate!=null){
						var obja = document.getElementById("uoloadtemplate");
						obja.href = '/myehr/form/getfile.action?fileId='+object.buttonImportTemplate;
						obja.text = object.buttonImportSql;
					}
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
					var obj={};
					obj.value = text.buttonImportExcType;
					changeeSlect1(obj);
				}
				//querys_1041();
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	function choseForm(importColumnId){
		var url = '/myehr/jsp/form/formcreate/button/execute_sql_form.jsp?formId='+${param.formId}+'&formButtonId='+importColumnId+'&execSqlType=EXECSQL_IMPORT_COLUMN_TYPE';
		layer.open({
			type: 2,
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编写脚本")%>',
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
	
	function choseDict(exportColumnId){
		var url = '${pageContext.request.contextPath }/jsp/form/formcreate/chooseDict.jsp?widget=exportColumnDict&formId='+${param.formId}+'&exportColumnId='+exportColumnId;
		layer.open({
			type: 2,
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编写脚本")%>',
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
	
	function changeeSlect1(obj){
		if(obj.value=='default'){
			$("#tr6").hide();
		}else{
			$("#tr6").show();
		}
    };
</script>
</body>
</html>
