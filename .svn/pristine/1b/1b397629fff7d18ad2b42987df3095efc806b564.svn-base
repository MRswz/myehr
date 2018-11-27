<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_1881" name="form_1881" >
<div class="container-fluid">
	<div style="margin-top:5px;">
		<input id="SYS_ICON.buttonAddId" name="buttonAddId" type="hidden" class="form-control"  style="width:200px;"/>
		<input id="SYS_ICON.buttonAddButtonId" name="buttonAddButtonId" type="hidden" class="form-control"  style="width:200px;"/>
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center"></h3>
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px" id="tr1">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增方式")%>：</lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="SYS_ICON.buttonAddType" onchange="changeeSlect1(this)"  title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新增方式")%>" name="buttonAddType"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_BUTTON_ADD_TYPE" nullItemText="" dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  class="td1"><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作方案")%>：</lable></td>
				<td style="padding-left:10px;"  align="left" class="td1" >						<select id="SYS_ICON.buttonAddExcType" onchange="changeeSlect2(this)" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作方案")%>" name="buttonAddExcType"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="" nullItemText="" dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px" id="tr2">
				<td style="padding-left:10px;"  width="150"  ><lable id="url"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关联表单")%>：</lable></td>
				<td style="padding-left:10px;"  align="left" width="20%"  >
					<input id="SYS_ICON.buttonAddUrl" name="buttonAddUrl" type="text" value="url" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;display:none"/>
					<input id="SYS_ICON.buttonFormId" name="buttonFormId" type="text" value="formId" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;display:none"/>
					<input id="SYS_ICON.buttonFormName" name="buttonFormName" type="text" value="formName" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;position:absolute"/><i style="position:relative;left:180px;top:5px" onclick="choseForm()" class="glyphicon glyphicon-plus"></i>
				</td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"标题")%>：</lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_ICON.buttonAddTitle" name="buttonAddTitle" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
			</tr>
			<tr style="height:65px" id="tr3">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"宽度")%>：</lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_ICON.buttonAddWidth" name="buttonAddWidth" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高度")%>：</lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_ICON.buttonAddHeight" name="buttonAddHeight" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
			</tr>
			<tr style="height:65px" id="tr4">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成功之后处理")%>：</lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="SYS_ICON.buttonAddSuccessDeal" onchange="changeeSlect3(this)"  title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成功之后处理：")%>" name="buttonAddSuccessDeal"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_BUTTON_ADD_SUCCESS" nullItemText="" dataField="dicts"></select></td>
			</tr>
			<tr id="tr5">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"按钮初始化方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_ICON.buttonAddInitFun" name="buttonAddInitFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
	      	<tr id="tr6">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义操作方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_ICON.buttonAddFun" name="buttonAddFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
	      	<tr id="tr7">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"成功后处理方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_ICON.buttonAddSuccessSelfFun" name="buttonAddSuccessSelfFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
		</table>
	</div>
	
	<form id="form_list" name="form_list" >
		<div class="" style="width:100%;height:50%;background-color:#f6f6f6">
			<div style="width:98%;height:98%;margin:0 auto;padding-top:10px">
				<div class="form-control" style="width:100%;height:100%;border:0">		
					<div class="" style="height:100%;overflow-y:hidden;padding:10px 0;">
						<div class="BTNGROUP_55" style="margin:0 auto; display:block;height: 35px;">
							<div style="margin-right:10px;display:inline-block">
								<input type="button" id="addColumn"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"增加")%> onclick="addRow()"/>
							</div>
							<div style="margin-right:10px;display:inline-block">
								<input type="button" id="save_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveData()"/>
							</div>
						</div>
						<table id="tableList">
						</table>
					</div>
				</div>
				<div style="width:100%;height:2%;float:left">
				</div>
			</div>	
		</div>
	</form>

	<table style="width:100%;table-layout:fixed;padding-top:5px;padding-right:5px;">
	</table>
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
$(function() {
	
	
})
	
function query_table() {   
	var buttonAddId = document.getElementById("SYS_ICON.buttonAddId").value; 
    $("#tableList").bootstrapTable({
    	
        url : '${pageContext.request.contextPath }/button/queryButtonParamByButtonId.action?formButtonId='+buttonAddId, 
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
            field : 'buttonParamId', // 字段  
            align: 'center',
            valign: 'middle',
            width:75,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input type=\"form-control\" name=\"buttonParamId\" style=\"width:0px;padding:0px;border:hidden\" readonly=true data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"操作\" value=\""+value+"\"/>"+
						"<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;left: 5px;top: 5px;cursor: pointer;\" onclick=\"remove(this)\"></i><div>" ;
        	}
		}, {  
            title : '参数名称',  
            field : 'buttonParamName',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"buttonParamName\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数名称\" value=\""+value+"\"/>";
        	}
		},{
            title : '参数来源',  
            field : 'buttonParamFrom',  
            align : 'center',  
            valign : 'middle', 
			width:200,
			formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<select id=\"buttonParamFrom"+index+"\" name=\"buttonParamFrom\" class=\"form-control\" DictName=\"SYS_FORM_BUTTON_ADD_PARAM_FROM\" dataField=\"\" data-type=\"text\" data-pk=\""+row.Id+"\"  data-title=\"参数来源\" value=\""+value+"\"/>" ;
        	}
		}, {  
            title : '参数值',  
            field : 'buttonParamValue',  
            align : 'center',  
            valign : 'middle', 
            width:200,
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"buttonParamValue\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参数值\" value=\""+value+"\"/>";
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

function addRow(insertIndex){
	rowsNum++;
    $('#tableList').bootstrapTable('insertRow',{index:rowsNum,row:{formWhereJoinRule:"and",formWhereCpRule:"=",formWhereSort:rowsNum,formWhereNullIs:"N"}});
	addListSelect();
}

function saveData(){
	var saveDate = getEntityData();
	var param = {};
	param.columns= saveDate;
	var buttonAddId = document.getElementById("SYS_ICON.buttonAddId").value;
	$.ajax({
		url:'${pageContext.request.contextPath }/button/saveButtonParam.action?buttonAddId='+buttonAddId,
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

function getEntityData(){
	var i = 0;
	var data = [];
	var buttonAddId = document.getElementById("SYS_ICON.buttonAddId").value;
	$("#tableList>tbody").find("tr").each(function(){
		if($(this).find("select").eq(0).val()!=""){
			var table = {};
			table.buttonParamId=$(this).find("input").eq(0).val();
			table.buttonParamName=$(this).find("input").eq(1).val();
			table.buttonParamFrom=$(this).find("select").eq(0).val();
			table.buttonParamValue=$(this).find("input").eq(2).val();
			table.buttonAddId=buttonAddId;
			
			data[i] = table;
			i++;
		}
	})
	return data;
}

function remove(obj){
	var data = {};
	data.buttonParamId = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'${pageContext.request.contextPath }/button/deleteButtonParamById.action',
		type:'post',
		cache: false,
		data:JSON.stringify(data),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			$('#tableList').bootstrapTable('refresh');
		}
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
		classes = $("#tableList select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		dataField = dataField+"|"+'${param.formDefId}';
		parame.placeholder="";
		parame.value=$(classes[i]).attr('value');
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
}


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
	var buttonAddExcTypeDict='SYS_FORM_BUTTON_ADD_ROW_DEAL_TYPE';
	
	window.onload=function(){
		$("#tr2").hide();
		$("#tr3").hide();
		$("#tr4").show();
		$("#tr5").show();
		$("#tr6").hide();
		$("#tr7").hide();
		initDict();
		document.getElementById("SYS_ICON.buttonAddButtonId").value="${param.formButtonId}";
		var buttonAddButtonId = '${param.formButtonId}';
		if(buttonAddButtonId!='' && buttonAddButtonId!=null){
			_initData(buttonAddButtonId);
		}
	}
	
	function initDict(obj){
		for(var i=0;i<classes.length;i++){
			if(obj==undefined){
			}else{
				if(classes[i].id=='SYS_ICON.buttonAddExcType'){
					classes[i].options.length=0;
				}else{
					continue;
				}
			}
			if(classes[i].id=='SYS_ICON.buttonAddExcType'){
				parame.jsonParam.dictTypeCode=buttonAddExcTypeDict;
			}else{
				parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			}
			
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			var dataField=$(classes[i]).attr('dataField');
			parame.placeholder="";
			parame.jsonParam.nullItemText=$(classes[i]).attr('nullItemText');
			
			if(type=="true"){
				myehr_initSelectMore(parame,dataField);
			}else{
				myehr_initSelect(parame,dataField);
			}
		}
	}

	function save_formemp_emp_edit_click_1881(){
		var paramsMap = {'userId' : '${sessionScope.userid}'};

		var _param = {};
		_param.formId=formId;
		_param.buttonId='${param.formButtonId}';
		_param = getdata_1881(_param.buttonId,formId);
		_param.paramsMap = paramsMap;
		$.ajax({
			url:'${pageContext.request.contextPath }/button/saveAddButton.action',
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
					closex_1881()
				}
			}
		});
	}

	function _initData(pkId){
		var buttonAddButtonId = pkId;
		
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/button/queryAddButtonById.action?buttonAddButtonId='+buttonAddButtonId,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text !=null){
					var object = text;
					for(var key in object){
						if(_form[key]!=null&&_form[key]!="undefined"){
							if(_Type[key]=="dateTime"){
								date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
								document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
							}else{
								document.getElementById(_form[key]).value=object[key];
							}
						}
					};
					var obj={};
					obj.value = text.buttonAddType;
					changeeSlect1(obj);
					obj.value = text.buttonAddExcType;
					changeeSlect2(obj);
					obj.value = text.buttonAddSuccessDeal;
					changeeSlect3(obj);
					query_table();//初始化实体
					$(".fixed-table-body").css("height","84%");
					$(".no-records-found").css("display","none");
				} else {
					_initAfter();
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	function choseForm(){
		var url = '/myehr/jsp/form/formcreate/button/formChoose.jsp';
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
		if(obj.value=='addUrl'||obj.value=='addUrlAll'){
			buttonAddExcTypeDict='SYS_FORM_BUTTON_ADD_DEAL_TYPE';
			initDict(obj);
			$("#tr2").show();
			$("#tr3").show();
			$("#tr4").show();
			$("#tr5").show();
		}else{
			buttonAddExcTypeDict='SYS_FORM_BUTTON_ADD_ROW_DEAL_TYPE';
			initDict(obj);
			$("#tr2").hide();
			$("#tr3").hide();
			$("#tr4").show();
			$("#tr5").show();
			$("#tr6").hide();
			$("#tr7").hide();
		}
    };
    
    function changeeSlect2(obj){
    	var buttonAddType=document.getElementById("SYS_ICON.buttonAddType").value;
    	if(buttonAddType=='addUrl'||buttonAddType=='addUrlAll'){
    		if(obj.value=='default'){
    			$("#tr2").show();
				$("#tr3").show();
				$("#tr4").show();
				$("#tr5").show();
				$("#tr6").hide();
				$("#tr7").hide();
				document.getElementById('url').innerHTML='关联表单';
				document.getElementById('SYS_ICON.buttonFormName').style.display='block';
	            document.getElementById('SYS_ICON.buttonAddUrl').style.display='none';
    		}else if(obj.value=='fun'){
    			$("#tr2").hide();
				$("#tr3").hide();
				$("#tr4").show();
				$("#tr5").show();
				$("#tr6").show();
				$("#tr7").hide();
    		}else{
    			$("#tr2").show();
				$("#tr3").show();
				$("#tr4").show();
				$("#tr5").show();
				$("#tr6").hide();
				$("#tr7").hide();
				document.getElementById('url').innerHTML='URL';
				document.getElementById('SYS_ICON.buttonAddUrl').style.display='block';
	            document.getElementById('SYS_ICON.buttonFormName').style.display='none';
    		}
    	}else{
    		if(obj.value=='fun'){
				$("#tr2").hide();
				$("#tr3").hide();
				$("#tr4").show();
				$("#tr5").show();
				$("#tr6").show();
				$("#tr7").hide();
			}else{
				$("#tr2").hide();
				$("#tr3").hide();
				$("#tr4").show();
				$("#tr5").show();
				$("#tr6").hide();
				$("#tr7").hide();
			}
    	}
		
    };
    
    function changeeSlect3(obj){
		if(obj.value=='3'){
			$("#tr7").show();
		}else{
			$("#tr7").hide();
		}
    };
</script>
</body>
</html>
