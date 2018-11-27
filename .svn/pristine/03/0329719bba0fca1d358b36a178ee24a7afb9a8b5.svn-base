<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_1881" name="form_1881" >
<div class="container-fluid">
	<div style="margin-top:5px;">
		<input id="SYS_ICON.formTreeFormId" name="formTreeFormId" type="hidden" class="form-control"  style="width:200px;"/>
		<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center"></h3>
		<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据来源")%>：</lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="SYS_ICON.formTreeType" onchange="changeeSlect2(this)"  title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据来源")%>" name="formTreeType"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_TREE_LOAD_TYPE" nullItemText="" dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"默认初始值")%>：</lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="SYS_ICON.formTreeValue" name="formTreeValue" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;"/></td>
			</tr>
			<tr style="height:65px" id="tr1">
				<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选中树方案")%>：</lable></td>
				<td style="padding-left:10px;"  align="left" >
					<input id="SYS_ICON.formTreeSolutionName" name="formTreeSolutionName" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;position:absolute"/><i style="position:relative;left:180px;top:5px" onclick="choseScheme()" class="glyphicon glyphicon-plus"></i>
					<input id="SYS_ICON.formTreeSolutionId" name="formTreeSolutionId" type="hidden" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;" style="width:200px;position:absolute"/>
				</td>
			</tr>
			<tr>
				<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始化方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_ICON.formTreeInitFun" name="formTreeInitFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
	      	<tr>
				<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"加载事件方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_ICON.formTreeLoadFun" name="formTreeLoadFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
	      	<tr>
				<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"节点点击事件方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_ICON.formTreeNodeClickFun" name="formTreeNodeClickFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
			<tr>
				<td style="padding-left:10px;"  width="200"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"自定义事件方案")%>：</lable></td>
		        <td colspan="3" align="left">
		        	<textarea  id="SYS_ICON.formTreeCustomFun" name="formTreeCustomFun"  class="form-control"  rows="5"  style="width:400;margin-bottom:5px"> </textarea>
		   		</td>
	      	</tr>
		</table>
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
	var buttonAddExcTypeDict='SYS_FORM_BUTTON_ADD_ROW_DEAL_TYPE';
	
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
			if(type=="true"){
				myehr_initSelectMore(parame,dataField);
			}else{
				myehr_initSelect(parame,dataField);
			}
		}
	}
	
	window.onload=function(){
		$("#tr_menu1").hide();
		$("#tr_menu2").hide();
		$("#tr_menu3").hide();
		initDict();
		document.getElementById("SYS_ICON.formTreeFormId").value="${param.formDefId}";
		var formId = '${param.formDefId}';
		if(formId!='' && formId!=null){
			_initData(formId);
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
		_param.formId='${param.formId}';
		_param.buttonId=2803;
		_param = getdata_1881(_param.buttonId,_formId_1881);
		_param.paramsMap = paramsMap;
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/saveTreeFormStepTwo.action',
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
		var formId = pkId;
		
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/tree/getTreeFormStepTwo.action?formId='+formId,
			type:'post',
			//data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text !=null){
					changeeSlect1(text);
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
						if(_Type[key]=="checkbox"){
							if(object[key]=='Y' ){
								document.getElementById(_form[key]).checked=true;
							}
						}
					};
					
				} else {
					_initAfter();
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	
	$(":checkbox").click(function() {
		if ($(this).is(":checked")) {
			this.value='Y';
			$("#tr_menu2").hide();
			$("#tr_menu3").show();
		} else {
			this.value='N';
			$("#tr_menu2").show();
			$("#tr_menu3").hide();
		}
	});
	
	function choseScheme(){
		var url = '/myehr/jsp/form/tree/treeSolutionManagerSelect.jsp';
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
	
	
	function changeeSlect1(obj){
		if(obj.menuType=='L'){
			if(obj.menuIsDynamicForm=='Y'){
				$("#tr_menu1").show();
				$("#tr_menu2").hide();
				$("#tr_menu3").show();
			}else{
				$("#tr_menu1").show();
				$("#tr_menu2").show();
				$("#tr_menu3").hide();
			}
		}else{
			$("#tr_menu1").hide();
			$("#tr_menu2").hide();
			$("#tr_menu3").hide();
		}
    };
	
	function changeeSlect2(obj){
		if(obj.value=='L'){
			if(obj.menuIsDynamicForm=='Y'){
				$("#tr_menu1").show();
				$("#tr_menu2").hide();
				$("#tr_menu3").show();
			}else{
				$("#tr_menu1").show();
				$("#tr_menu2").show();
				$("#tr_menu3").hide();
			}
		}else{
			$("#tr_menu1").hide();
			$("#tr_menu2").hide();
			$("#tr_menu3").hide();
		}
    };
    
    
</script>
</body>
</html>
