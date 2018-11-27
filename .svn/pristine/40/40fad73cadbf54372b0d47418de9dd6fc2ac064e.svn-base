<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_1210" name="form_1210" >
	<div class="container-fluid" style="overflow-y:auto;">
		<div style="margin-top:5px;">
			<div style="margin:10px 0;">
			<h3 style=" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;">字典编辑</h3>
				<div class="row cell"  >
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
							<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段显示名称")%>: </lable>
							<input id="FIELD_CODE" name="FIELD_CODE" type="text" class="form-control" style="width:200px;" readonly="true" value="${param.fieldChinaName}"/>
						</div>
					</div>
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
							<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字段控件类型")%>: </lable>
							<input id="CONTROL_TYPE" name="EMP_NO_CODE" type="text" class="form-control" style="width:200px;" readonly="true" value="${param.controlType}"/>
						</div>
					</div>
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
							<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化方式")%>: </lable>						
							<select id="INIT_FUNCTION" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>" styleType="select" name="EMP_STATUS"  class="form-control" required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="INIT_FUNCTION" dataField="dicts"></select>
						</div>
					</div>
					
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
							<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"数据初始化值")%>: </lable>
							<div class='input-group'  style="width:200px;float:left;">
								<input id="EMP_EMPLOYEE.EMP_SUPER_LEADER_1210" name="EMP_SUPER_LEADER" type="hidden">
								<input type='text' class="form-control" readonly=true id="EMP_EMPLOYEE.EMP_SUPER_LEADER_1210_name"/>
								<span class="input-group-addon" onclick="chooseDict(this)">
									<span class="glyphicon glyphicon-plus">
									</span>
								</span>
							</div>
						</div>
					</div>
					
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
						<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
							<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"初始化方式")%>: </lable>
							<input id="PROPERTY" name="PROPERTY" type="text" class="form-control" style="width:200px;" />
						</div>
					</div>
					
					<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" id="dict" style="display:none">
						<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
							<lable id="DICT_CODE_LABLE" style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典编码")%>: </lable>
							<input id="DICT_CODE" name="DICT_CODE" type="text" class="form-control" style="width:200px;" />
						</div>
					</div>
					
					<div id="zidingyi" style="display:none">
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
								<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典项")%>: </lable>
								<input id="DICT_ENTRY" name="DICT_ENTRY" type="text" class="form-control" style="width:640px"/>
							</div>
						</div>
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:80px">
							<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
								<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查询字典项语句")%>: </lable>
								<textarea id="SEARCH_SQL_DICT" name="SEARCH_SQL_DICT" class="form-control" style="width:640px;">
								</textarea>
								<input type="button" id="STARTUP_DICT"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查询")%> onclick="search_dict_sql()"/>
							</div>
						</div>
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
							<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
								<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"字典项值")%>: </lable>						
								<input id="DICT_ENTRY_VALUE" name="DICT_ENTRY_VALUE" type="text" class="form-control" style="width:640px"/>
							</div>
						</div>
						<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" style = "height:80px">
							<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
								<lable style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查询字典项值语句")%>: </lable>
								<textarea id="SEARCH_SQL_VALUE" name="SEARCH_SQL_VALUE" class="form-control" style="width:640px;">
								</textarea>
								<input type="button" id="STARTUP_VALUE"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"查询")%> onclick="search_value_sql()"/>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="BTNGROUP_1210" style="margin:0 auto; display:inline-block;height: 35px;">
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="saveemp_emp_add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="saveemp_emp_add_click_1210()"/>
				</div>
				<div style="margin-right:10px;display:inline-block">
				    <input type="button" id="closeemp_emp_add"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_1210()"/>
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

$("#INIT_FUNCTION").change(function(){
	if($("#INIT_FUNCTION").val()=="0"){
		$("#dict").css("display","inline-block");
		$("#zidingyi").css("display","none");
	}else{
		$("#dict").css("display","none");
		$("#zidingyi").css("display","inline-block");
	}
});

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
function getdata_1210(buttonId,formId){
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
	var _formId_1210='1210';
	window.onload=function(){
		for(var i=0;i<classes.length;i++){
			parame.id=classes[i].id;
			var type=$(classes[i]).attr('multiSelect');
			parame.placeholder="";
			parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
			if(type=="true"){
				myehr_initSelectMore(parame);
			}else{
				myehr_initSelect(parame);
			}
		}
	}

	function saveemp_emp_add_click_1210(){
		var property = $("#PROPERTY").val();
		var fieldId = '${param.fieldId}';
		var dictCode = $("#DICT_CODE").val();
		var constantDictEntry = $("#DICT_ENTRY").val();
		var constantDictEntryValue = $("#DICT_ENTRY_VALUE").val()
		var dictEntry = $("#SEARCH_SQL_DICT").val();
		var dictEntryValue = $("#SEARCH_SQL_VALUE").val();
		$.ajax({
			url:'${pageContext.request.contextPath }/FieldList/updateSelectInit.action?property='+property+'&fieldId='+fieldId+'&dictCode='+dictCode+'&dictEntry='+dictEntry+'&dictEntryValue='+dictEntryValue+'&constantDictEntry='+constantDictEntry+'&constantDictEntryValue='+constantDictEntryValue,
			type: 'POST',  
		    cache: false,
		    contentType: 'application/json;charset=utf-8',
		    success: function (datas) {  
		    	if(datas==0){
		    		alert("更新成功");
		    	}else if(datas==1){
		    		alert("");
		    	}
		    }  
		})
	}
	
	function EMP_EMPLOYEE_EMP_POLITICAL_valueChange_1210(e){

		var P=nui.get('EMP_EMPLOYEE.EMP_POLITICAL').getValue();
		if(P==13)
		{
		  nui.get("EMP_EMPLOYEE.EMP_JOIN_TIME").setEnabled(false);
		} else {
		  nui.get("EMP_EMPLOYEE.EMP_JOIN_TIME").setEnabled(true);
		}
	}

	function _initData(pkId){
		var _param = {};
		if(pkId){
			_param = {pkId:pkId,formId:_formId_1210};
		}else {
			_param = {requestParam:{},pkId:pkId,formId:_formId_1210};
		}
		var _form = getForm("#form_1210");
		var _Type = getType("#form_1210");
		$.ajax({
			url:'${pageContext.request.contextPath }/form/cardformInitData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text.rows&&text.rows.length>0){
					var object = text.rows[0];
						for(var key in object){
							if(_form[key]!=null&&_form[key]!="undefined"){
									if(_Type[key]=="dateTime"){
										date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
										document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
									}else{
										document.getElementById(_form[key]).value=object[key];
									}
							}
						}
						;
					var _lookupData=text.datas[0];
					_setLookupText(_lookupData);
					
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();}
				} else {
					_initAfter();
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	//查找字典
	<%-- function chooseDict(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/form/toForm.action?formId=1882&POST_DEPT=${param.null}'+"&fatherId="+id+"";
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['800','400'],
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%>',
			content:url,
			success:function(layero,index){
			},
			end:function(){			
			}
		 }); 
	} --%>

	//关闭
	function closex_1210(){ 
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
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
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
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
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
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
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
			
	function search_dict_sql(){
		var sql = $("#SEARCH_SQL_DICT").val();
		$.ajax({  
                       url:'${pageContext.request.contextPath }/FieldList/findDictEntryValBySql.action?sql='+sql,  
                       type: 'POST',  
				       cache: false,
				       contentType: 'application/json;charset=utf-8',
                       success: function (datas) {  
                       	   var dictValue = "";	
                           for(var i=0;i<datas.total;i++){
                           		for(var key in datas.rows[i]){
                           			dictValue = dictValue+datas.rows[i][key]+";";
                           		}
                           }
                           $("#DICT_ENTRY").val(dictValue.substring(0,dictValue.length-1));
                       }  
                   });
	}		
			
	function search_value_sql(){
		var sql = $("#SEARCH_SQL_VALUE").val();
		$.ajax({  
                       url:'${pageContext.request.contextPath }/FieldList/findDictEntryValBySql.action?sql='+sql,  
                       type: 'POST',  
				       cache: false,
				       contentType: 'application/json;charset=utf-8',
                       success: function (datas) {  
                       	   var dictValue = "";	
                           for(var i=0;i<datas.total;i++){
                           		for(var key in datas.rows[i]){
                           			dictValue = dictValue+datas.rows[i][key]+";";
                           		}
                           }
                           $("#DICT_ENTRY_VALUE").val(dictValue.substring(0,dictValue.length-1));
                       }  
                   });
	}
</script>
</body>
</html>
