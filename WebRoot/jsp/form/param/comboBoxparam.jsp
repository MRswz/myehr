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
	<div style="margin-top:5px;">
		<input id="SYS_SYSTEM_SCHEME.comboboxFormColumnId" name="comboboxFormColumnId" type="hidden" class="form-control"  style="width:200px;"/>
		<input id="SYS_SYSTEM_SCHEME.comboboxId" name="comboboxId" type="hidden" class="form-control"  style="width:200px;"/>
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center"></h3>
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化类型")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><select id="SYS_SYSTEM_SCHEME.comboboxGuiInitType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化类型")%>" name="comboboxGuiInitType"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_GUI_FROM_TYPE" nullItemText="" dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<input id="SYS_SYSTEM_SCHEME.comboboxIsSearch" name="comboboxDict" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;position:absolute"/><i style="position:relative;left:180px;top:5px" onclick="choseDict()" class="glyphicon glyphicon-plus"></i>
					<input id="SYS_SYSTEM_SCHEME.comboboxDict" name="comboboxGuiInitValue" type="hidden" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;position:absolute"/>
				</td>
			</tr>
			
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><select id="SYS_SYSTEM_SCHEME.comboboxDataFromType" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源类型")%>" name="comboboxDataFromType"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_FORM_INIT_DATA_TYPE" nullItemText="" dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始值来源")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_SYSTEM_SCHEME.comboboxDataFromValue" name="comboboxDataFromValue" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"文本显示字段")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_SYSTEM_SCHEME.comboboxTextfield" name="comboboxTextfield" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值字段")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_SYSTEM_SCHEME.comboboxValuefield" name="comboboxValuefield" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据对象名称")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_SYSTEM_SCHEME.comboboxDatafield" name="comboboxDatafield" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"空值文本")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_SYSTEM_SCHEME.comboboxEmptytext" name="comboboxEmptytext" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"空项文本")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_SYSTEM_SCHEME.comboboxNullitemtext" name="comboboxNullitemtext" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
				<td ><input  id="SYS_SYSTEM_SCHEME.comboboxAllowinput"  name="comboboxAllowinput" type="checkbox" value="1"/><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"允许输入")%></td>
				<td ><input  id="SYS_SYSTEM_SCHEME.comboboxShownullitem"  name="comboboxShownullitem" type="checkbox" value="1"/><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"显示空项")%></td>
				<td ><input  id="SYS_SYSTEM_SCHEME.comboboxMultiselect"  name="comboboxMultiselect" type="checkbox" value="1"/><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"允许多选")%></td>
			</tr>
	      	<tr id="tr6">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"值改变事件方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_SYSTEM_SCHEME.comboboxValuechangeFun" name="comboboxValuechangeFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
			<tr id="tr7">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"点击事件方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_SYSTEM_SCHEME.comboboxClickFun" name="comboboxClickFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
		</table>
	</div>

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
			var data=$(classes[i]).attr('data');
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame,dataField,data);
			}else{
				myehr_initSelect(parame,dataField,containerParam,data);
			}
		}

		document.getElementById("SYS_SYSTEM_SCHEME.comboboxFormColumnId").value="${param.sqlParamsId}";
		var sqlParamsId = '${param.sqlParamsId}';
		
		if(sqlParamsId!='' && sqlParamsId!=null){
			_initData(sqlParamsId);
		}
		
		

	}

	function save_formemp_emp_edit_click_1881(){
		var paramsMap = {'userId' : '${sessionScope.userid}'};
		var _param = {};
		_param.formId=_formId_1881;
		_param.buttonId=2803;
		_param = getdata_1881(_param.buttonId,_formId_1881);
		_param.paramsMap = paramsMap;
		$.ajax({
			url:'${pageContext.request.contextPath }/param/saveComboboxInfoParams.action',
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
		var sqlParamsId = '${param.sqlParamsId}';
		
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/param/queryComboboxInfoParamsById.action?sqlParamsId='+sqlParamsId,
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
							if(_Type[key]=="checkbox"){
								if(object[key]==1 ){
									document.getElementById(_form[key]).checked=true;
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
	
	function choseDict(){
	//var choosea=$('#SYS_SYSTEM_SCHEME.comboboxGuiInitType').val();
	 var choosea=$('[id="SYS_SYSTEM_SCHEME.comboboxGuiInitType"]').val();
		var url = '/myehr/jsp/form/param/dictList.jsp?choosea='+choosea;
		layer.open({
			type: 2,
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择字典")%>',
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
				var type = $(this).attr('type');
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
				if(type!=undefined){
					if(type=='checkbox'){
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
						object[id]="checkbox";
					}
				}
			})
		return object;
	}
</script>
</body>
</html>
