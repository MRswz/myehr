<%@ page language='java' import='java.util.*' import='com.myehr.common.util.LangUtil' pageEncoding='UTF-8'%>
<%@ include file='/commonApp/commonApp.jsp' %>
<html>
<head>
<meta charset='utf-8'>
<title>Hello MUI</title>
<meta name='viewport' content='width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no'>
<meta name='apple-mobile-web-app-capable' content='yes'>
<meta name='apple-mobile-web-app-status-bar-style' content='black'>
<style>
form h5 {
height: 25px;line-height: 25px;padding: 2px 0 0 12px;
}
form{clear: both;}
</style>
</head>
<body style="text-align:center">
<form id="form_2955" name="form_2955" >
<div class="container-fluid" style="overflow-y:auto;height:100%;">
	<div class='my_card' style="margin-top:5px;padding-bottom:50px;">
<input id="TEST_INFOR.TESTINFOR_id_2955" name="TESTINFOR_id" type="hidden" class="mui-input-clear price-range-item" placeholder="" />
<form class="mui-input-group">
<h5>其他：</h5>

<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中文名")%>: </label>
<input id="TEST_INFOR.TESTINFOR_china_name_2955" name="TESTINFOR_china_name" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:50;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名")%>: </label>
<input id="TEST_INFOR.TESTINFOR_eng_name_2955" name="TESTINFOR_eng_name" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>: </label>
<input id="TEST_INFOR.TESTINFOR_guoji_2955" name="TESTINFOR_guoji" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>: </label>
<input id="TEST_INFOR.TESTINFOR_jiguan_2955" name="TESTINFOR_jiguan" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"住址")%>: </label>
<input id="TEST_INFOR.TESTINFOR_zhuzhi_2955" name="TESTINFOR_zhuzhi" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"学历")%>: </label>
					<div class='input-group'  style="width:200px;;float:left;">
						<input id="TEST_INFOR.TESTINFOR_xuli_2955" name="TESTINFOR_xuli" type="hidden">
						<input type='text' class="form-control" dateType="lookUp" readonly=true  id="TEST_INFOR.TESTINFOR_xuli_2955_name"/>
						<span class="input-group-addon" onclick="TEST_INFOR_TESTINFOR_xuli_2955_Card1_onbuttonclick(this)">
							<span class="glyphicon glyphicon-plus">
							</span>
						</span>
					</div><span style='color:red;line-height:35px;font-size:27px'></span>
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"毕业院校")%>: </label>
<input id="TEST_INFOR.TESTINFOR_biyeyuanxiao_2955" name="TESTINFOR_biyeyuanxiao" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>: </label>
<input id="TEST_INFOR.TESTINFOR_xingbie_2955" name="TESTINFOR_xingbie" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"年龄")%>: </label>
<input id="TEST_INFOR.TESTINFOR_nianling_2955" name="TESTINFOR_nianling" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入学时间")%>: </label>
<input id="TEST_INFOR.TESTINFOR_ruxueshijian_2955" name="TESTINFOR_ruxueshijian" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"毕业时间")%>: </label>
<input id="TEST_INFOR.TESTINFOR_biyeshijian_2955" name="TESTINFOR_biyeshijian" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>: </label>
<input id="TEST_INFOR.TESTINFOR_gongsi_2955" name="TESTINFOR_gongsi" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>: </label>
<input id="TEST_INFOR.TESTINFOR_bumen_2955" name="TESTINFOR_bumen" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>: </label>
<input id="TEST_INFOR.TESTINFOR_gangwei_2955" name="TESTINFOR_gangwei" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"照片")%>: </label>
<input id="TEST_INFOR.TESTINFOR_zhaopian_2955" name="TESTINFOR_zhaopian" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>


<div class="mui-input-row">
<label style="float:left"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"图标")%>: </label>
<input id="TEST_INFOR.TESTINFOR_tubiao_2955" name="TESTINFOR_tubiao" type="text" class="mui-input-clear price-range-item" placeholder=""  vtype="illegalChar;maxLength:255;minLength:null;" />
</div>

</form>
		<div class="mui-slider-right mui-disabled">
			<span id="save_formCard1" onclick="save_formCard1_click_2955()" class="mui-btn mui-btn-primary">保存</span>
			<span id="closeCard1" onclick="closex()" class="mui-btn mui-btn-danger">关闭</span>
		</div>
		<div class="list-item mui-slider-handle">
<div id="activity_pane" style="position:absolute;left:500px;top:70px;"></div>
</div>
</form>
</div>
<script>
var datas = mui('.data');
datas.each(function(i, data) {
	data.addEventListener('tap', function() {
		var optionsJson = this.getAttribute('data-options') || '{}';
		var options = JSON.parse(optionsJson);
		var id = this.getAttribute('id');
		var _this = this;
		var picker = new mui.DtPicker(options);
		picker.show(function(rs) {
			_this.value = rs.text;
			picker.dispose();
		});
	}, false);});
var heightGadedata_2955 =[];
var containerParam_2955 ={};
containerParam_2955 ={};
function changeHeightGadedata_2955(data){
	heightGadedata_2955 = data;
}
$(function () {  
});
function _initParamCard(){
}
	var _formId_2955='2955';
var realFormId='${param.formId}';
	window.onload=function(){
		cardSelectInitFunction('${param.formType}');
initRoleColumn('2955');
initFieldRuleColumn('2955');
initRoleButtons();

initFileManage1(true,true,true,true,'');

	}

	function save_formCard1_click_2955(){
		var paramsMap = {};

		var _param = {};
		_param.formId=_formId_2955;
		_param.buttonId=3550;
		_param = getdata(_param.buttonId,_formId_2955);
		_param.paramsMap = paramsMap
		if(checkNull("#form_2955")){
		}else{
		$.ajax({
			url:'${pageContext.request.contextPath }/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
			if(text[0]=='000000' || text[1]=='保存成功'){
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功！")%>");
				closex()
			}else if(text[0]=='error'){
			    if(text.length>1 &&text[0]=='error'){
					alert(text[1]);
			    }else{
					alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
			    }
			}else {
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存失败")%>");
			}
			}
		});
		}
	}
	function _initData_2955(pkId){
		var _param = {};
		if(pkId){
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{TESTINFOR_id:'${param.TESTINFOR_id}'},pkId:pkId,formId:_formId_2955};
			}else{;
				_param = {pkId:pkId,formId:_formId_2955};
			}
		}else {
			if('${param.businessId}'!=null && '${param.businessId}'!=''){
				_param = {requestParam:{id:'${param.businessId}'},pkId:pkId,formId:_formId_2955};
			}else{;
				_param = {requestParam:{TESTINFOR_id:'${param.TESTINFOR_id}'},pkId:pkId,formId:_formId_2955};
			}
		}
		_param.containerParam = containerParam;
		var _form = getForm("#form_2955");
		var _Type = getType("#form_2955");
		$.ajax({
			url:'${pageContext.request.contextPath }/form/cardformInitData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text.rows&&text.rows.length>0){
						 var object = text.rows[0];
						 var buttonType = '${param.buttonType}';
						 for(var key in object){
						    if(key=='TESTINFOR_id'){
						        if(buttonType=='copyAndUpdate'){
						            continue;
						        }
						    }
								if(_form[key]!=null&&_form[key]!="undefined"){
										if(_Type[key]=="dateTime" && object[key]!=null){
											date = object[key]+"";
											if(date.indexOf(":") > 0){
									    		date = object[key];
											}else{
									    		if(object[key]==null || object[key]==""){
													date = object[key]
												}else{
													date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
												}
											}
											document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
											}else if(_Type[key]=="search" && object[key]!=null){
												$("[id='"+_form[key]+"']").selectpicker('val', object[key]);
											}else if(_Type[key]=="mupick" && object[key]!=null){
												var xxx=(object[key]+"").split(",");
												$("[id='"+_form[key]+"']").selectpicker('val', xxx);
											}else if(_Type[key]=="fileupload" && object[key]!=null){
												document.getElementById(_form[key]).value=object[key];
												var fileName = _form[key]+'_fileName';
												var fileNameValue = getFilenameById(object[key]);
												document.getElementById(fileName).value=fileNameValue;
											}else if(_Type[key]=="inputSelect" && object[key]!=null){
												var obj = document.getElementById(_form[key]);
												var dataField = obj.attributes.dataField.value
;												var DictName = obj.attributes.DictName.value
;										    	selectSqlDictEntryByValue(_form[key],object[key],dataField,DictName);
											}else if(_Type[key]=="richText" && object[key]!=null){
												$("[id='"+_form[key]+"']").val(object[key]);
												$("[id='"+_form[key]+"']").change();
											}else if(_Type[key]=="lookUp" && object[key]!=null){
												$("[id='"+_form[key]+"']").val(object[key]);
												$("[id='"+_form[key]+"_name']").val(getLookupValue(_form[key],object[key]));
											}else{
												document.getElementById(_form[key]).value=object[key];
											}
									}
							};
										var _lookupData=text.rows[0];
					_setLookupText(_lookupData);
					
					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();
					}
					initFormNameWithSelectColumn();
				} else {
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
	function TEST_INFOR_TESTINFOR_xuli_2955_Card1_onbuttonclick(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/form/toForm.action?formId=301'+"&idField=id&textField=text&fatherId="+id+"";
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['500','600'],
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%>',
			content:url,
			success:function(layero,index){
			},
			end:function(){			}
		 }); 
	}

	function _setLookupText(_lookupData){
		document.getElementById('TEST_INFOR.TESTINFOR_xuli_2955').value=_lookupData.TESTINFOR_xuli;
	}
	//初始化表单权限字段
	function initFieldRuleColumn(formId){
	    var url = '${pageContext.request.contextPath }/FieldList/selectColumnWithFieldRule.action?formId='+formId;
	    $.ajax({
	        url:url,
	        type:'post',
	        cache: false,
	        async: false,
	        contentType:'application/json',
	        success:function(datas){
	            for(var i=0;i<datas.length;i++){
		                var obj = $("[id='"+datas[i].fieldRuleJspId+"']")[0];
		                obj.value=datas[i].fieldRuleValue;
	            }
	        }
	    });
	}
	//初始化表单权限字段
	function initRoleColumn(formId){
	    var url = '${pageContext.request.contextPath }/form/queryCardFormColumnsWithUserId.action?formId='+formId;
	    $.ajax({
	        url:url,
	        type:'post',
	        cache: false,
	        async: false,
	        contentType:'application/json',
	        success:function(datas){
	            for(var i=0;i<datas.length;i++){
	                if(datas[i].formColumnShowType=='hide'){
	                    continue;
	                }
	                if(datas[i].formColumnUsName==0 || datas[i].formColumnUsName==3 || datas[i].formColumnUsName==4){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+2955;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+2955;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode;
		                    obj.style.display="none";
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+2955;
		                    var obj = $("[id='"+columnName+"']")[0].parentNode.parentNode.parentNode;
		                    obj.style.display="none";
		                }
	                }
	                if(datas[i].formColumnUsName==2){
		                if(datas[i].formColumnGuiType==1){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+2955;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==2){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+2955;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }else if(datas[i].formColumnGuiType==6){
		                    var entityTablename = datas[i].formEntityTablename;
		                    var fieldTablename = datas[i].formFieldTablename;
		                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+2955;
		                    var obj = $("[id='"+columnName+"']")[0];
		                    obj.disabled=true;
		                }
	                }
	            }
	        }
	    });
	}
//初始化表单按钮字段
function initRoleButtons(){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId=2955';
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].powerType==4){
                    var obj = $("#"+datas[i].formButtonCode+"Card1");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==3){
                    var obj = $("#"+datas[i].formButtonCode+"Card1");
                    obj[0].parentNode.style.display="none";
                }else if(datas[i].powerType==2){
                    var obj = $("#"+datas[i].formButtonCode+"Card1");
                    obj[0].disabled=true;
                }else if(datas[i].powerType==0){
                    var obj = $("#"+datas[i].formButtonCode+"Card1");
                    obj[0].parentNode.style.display="none";
                }
            }
        }
    });
}
function selectSqlDictEntryByValue(id,value,dataField,DictName){
    $.ajax({
        url:'${pageContext.request.contextPath }/dict/selectSqlDictEntryByValue.action?value='+value+'&dataField='+dataField+'&DictName='+DictName,
        type:'post',
        cache: false,
        contentType: 'application/json;charset=utf-8',
    	 async: false,
        success: function (data) { 
            document.getElementById(id).value=data.DICTENTRY;
            document.getElementById(id+"_value").value=value;
        }
    });
}
function initFormNameWithSelectColumn(){
    var total = '';
    var obj = document.getElementById('formTitle').innerText = total;
}
	//唯一验证
	function uniqueVerifyBlur(obj){ 
	    var id = obj.id;
	    var strs= new Array();
	    strs= id.split("\.");
	    var tableName= strs[0];
	    strs= strs[1].split("_");
	    var fieldName= strs[0];
	    var value = document.getElementById(id).value;
	    var pkId = document.getElementById("TEST_INFOR.id_2955").value;
	    $.ajax({ 
		       url:'/myehr/form/checkUniqueVerify.action?tableName='+tableName+'&fieldName='+fieldName+'&value='+value+'&pkId='+pkId+'&pkFieldName=id',
	        type:'post',
			   cache: false,
			   contentType: 'application/json;charset=utf-8',
			   success: function (text) {
				   if(text[0]=='1'){
					   obj.value='';
					   obj.style['border-color']='red';
					   obj.setAttribute("placeholder",text[1]);
				   }
				   if(text[0]=='0'){
					   obj.style['border-color']='#CCC';
				   }
			   }
		   });
	}
	


</script>
</body>
</html>
