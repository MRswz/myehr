package com.myehr.pojo.formmanage.cache;


import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.myehr.common.util.ChangeCode;
import com.myehr.pojo.sysParam.SysRequestParam;

public class SysCardFormColumnUtil implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 获取textbox控件js代码
	 * @param textbox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @param isAsLabel 
	 * @return
	 */
	public static Object[] getTextBoxHtml(SysTextBoxCache textbox,String entityName,String fieldName,String[] htmls,SysRequestParam request ,SysFormColumnCache column, boolean isAsLabel,String isApp){
		return SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, textbox.getTextboxCheckType(), textbox.getTextboxCheckSelf(), textbox.getTextboxCheckFun(), textbox.getTextboxDataFromType(), textbox.getTextboxDataFromValue(), textbox.getTextboxValuechangeFun(), textbox.getTextboxClickFun(),  textbox.getTextboxInitFun(), 
				null, null,null, column,isAsLabel,null,null,false,null,isApp);
	}
	/**
	 * 获取combobx控件js代码
	 * @param textbox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @return
	 */
	public static Object[] getComboboxHtml(SysFormComboboxCache combobox,String entityName,String fieldName,String[] htmls,
			SysRequestParam request ,SysFormColumnCache column, boolean isAsLabel,String formColumnComboboxGuiInitFun,boolean isFilter,String comboboxDictNameColumn,String isApp){
		//是否要生成加载combobox控件数据脚本
		if("sql".equals(combobox.getComboboxGuiInitType())){
			if(htmls[8] ==null){
				htmls[8] = "";
			}
			if(htmls[14] ==null){
				htmls[14] = "";
			}
			htmls[8]+= SysCardFormColumnUtil.getCardFormComboboxGuiInitJs(column.getFormFiledTablename(), column.getJsId("js",column.getPojo().getFormColumnFormDefId().toString()),combobox,request,column.getForm(),isFilter);
			//htmls[14] += SysCardFormBeansUtil.getNbsp(1)+"combobox_init_"+column.getFormFiledTablename()+"();\n";
		}
		return SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, combobox.getComboboxDataFromType(), combobox.getComboboxDataFromValue(), combobox.getComboboxValuechangeFun(), combobox.getComboboxClickFun(), combobox.getComboboxInitFun(), 
				combobox.getComboboxGuiInitType(), combobox.getComboboxGuiInitValue(),combobox.getComboboxId()+"", column,isAsLabel,combobox.getGeneralParams(),formColumnComboboxGuiInitFun,isFilter,comboboxDictNameColumn,isApp);
	}
	

	/**
	 * 获取radialist控件js代码
	 * @param textbox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @return
	 */
	public static Object[] getRadiolistHtml(SysFormRadiobuttonlistCache radio,String entityName,String fieldName,String[] htmls,SysRequestParam request ,SysFormColumnCache column,boolean isAsLabel,String isApp){
		return SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, radio.getRadiolistDataFromType(),radio.getRadiolistDataFromValue(), radio.getRadiolistValuechangeFun(), radio.getRadiolistClickFun(), radio.getRadiolistInitFun(), 
				radio.getRadiolistGuiInitType(), radio.getRadiolistGuiInitValue(),radio.getRadiolistId()+"", column, isAsLabel,radio.getGeneralParams(),null,false,null,isApp);
	}
	

	/**
	 * 获取Datepicker控件js代码
	 * @param textbox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @return
	 */
	public static Object[] getDatepickerHtml(SysDatepickerCache datepicker,String entityName,String fieldName,String[] htmls,SysRequestParam request ,SysFormColumnCache column,boolean isAsLabel,boolean isFilter,String isApp){
		Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, datepicker.getDatepickerDataFromType(),datepicker.getDatepickerDataFromValue(),  datepicker.getDatepickerValuechangeFun(),
				datepicker.getDatepickerClickFun(), datepicker.getDatepickerInitFun(), 
				null, null,datepicker.getDatepickerId()+"", column, isAsLabel,null,null,isFilter,null,isApp);
		
		if(datepicker.getDatepickerDrawdateFun()!=null&&!"".equals(datepicker.getDatepickerDrawdateFun())){ //生成日期控件的drawdate事件方法
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+column.getOnDrawdateFunName()+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+datepicker.getDatepickerDrawdateFun()+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			htmls[8] =temp;
		}
		return ret;
	}
	

	/**
	 * 获取lookup控件js代码
	 * @param textbox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @param c 
	 * isGridQuery 是否是列表查询需要生成控件  true 代表要生成列表中查询条件控件
	 * @return
	 * @throws Exception 
	 */
	public static Object[] getLookupHtml(SysFormLookupCache lookup, String entityName, String fieldName, String[] htmls, SysRequestParam request, SysFormColumnCache column,boolean isAsLabel,boolean isGridQuery,String isApp) throws Exception {
		// TODO 自动生成方法存根
		Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, lookup.getLookupDataFromType(),lookup.getLookupDatabackValue(),  lookup.getLookupValuechangeFun(),
				lookup.getLookupClickFun(), lookup.getLookupInitFun(), null, null,lookup.getLookupId()+"", column,isAsLabel,null,null,false,null,isApp);
		String winType = lookup.getLookupFormWinType();
		//获取该字段的jsId
		String  columnJsId = column.getJsId("id",String.valueOf(column.getFormColumnFormDefId()));
		//根据窗口类型生成onbuttonclick 事件方法
		String onbuttonclickStr = "";
		String otherFieldName = null;
		//生成打开页面方法
		onbuttonclickStr+=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+(isGridQuery==true?"FILTER_":"")+column.getOnButtonClickFunName(String.valueOf(column.getFormColumnFormDefId()))+"(e)"+SysCardFormBeansUtil.JAVASCRIPT_FUN_START;
		if("1".equals(winType)||"2".equals(winType)){ //配置窗口
			String otherColumnJsId = null;
			if("other".equals(lookup.getLookupDatabackType())){
				SysFormColumnCache c = column.getForm().serchColumnByColumnId(Long.parseLong(lookup.getLookupDatabackValue()));
				otherColumnJsId = c.getJsId("id",String.valueOf(column.getFormColumnFormDefId()));
				otherFieldName = c.getFiledName()[0];
			}
			
			String[] results = SysCardFormBeansUtil.getLookupOpenJs(request,lookup.getLookupWinTitle(), lookup.getLookupWinWidth(), lookup.getLookupWinHeight(), lookup.getLookupFormWinType(), lookup.getLookupFormUrl(), 
					lookup.getLookupFormId(), columnJsId,otherColumnJsId,lookup.getLookupDatabackType(),lookup.getLookupDatabackValue(),fieldName,otherFieldName,lookup.getLookupShowProperty(),lookup.getLookupValueProperty(),isGridQuery,
					lookup.getGeneralParams(),request,column.getForm(),lookup.getlookupCustomDataback(),lookup.getlookupCustomDatabackFun(),lookup.getBackSql(), column.getFormColumnId());
			//String backType,String backValue,String fieldName,String otherField,String showProperty,String valueProperty
			onbuttonclickStr +=  results[0];
			htmls[8]=htmls[8]==null?"":htmls[8];
			htmls[8]+=results[1];
			
			
			htmls[15]=htmls[15]==null?"":htmls[15];
			htmls[15]+=results[2];
		}else  { //自定义onbuttonclick事件函数
			onbuttonclickStr += lookup.getLookupButtonclickFun()+SysCardFormBeansUtil.NEW_LINE_ONLY;
		}
		onbuttonclickStr+=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END;
		//生成数据初始化后需要回填id和text方法
		String  initlookupInitFun = "";
		//initlookupInitFun+=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+SysCardFormBeansUtil.LOOKUP_BACK_FUN_NAME+SysCardFormBeansUtil.JAVASCRIPT_FUN_START;
		String paramType = FormParamConstants.OPENPAGE_DATA_RETURN;
		Map<String,List<SysFormGeneralParamCache>>  gs = lookup.getGeneralParams();
		List<SysFormGeneralParamCache> l = gs.get(paramType);
//		initlookupInitFun+= SysCardFormBeansUtil.getLookupSetTextAndValueJs(request, column.getFormColumnFormDefId()+"", columnJsId, fieldName, lookup.getLookupDatabackType(), lookup.getLookupDatabackValue(),l,
//				SysCardFormBeansUtil.LOOK_BIZ_BACK_TYPE_FUNNAME_START+column.getForm().getFormDefCode()+column.getFormFiledTablename());
//		initlookupInitFun+=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END;
		//initlookupInitFun
		if(isGridQuery){
			
			htmls[9] = onbuttonclickStr+"\n"+initlookupInitFun;
			if("biz".equals(lookup.getLookupDataFromType())){
				htmls[9]=htmls[9]==null?"":htmls[9];
				htmls[9]+= SysGridFormBeansUtil.getDefaultLookupBiz(lookup.getLookupShowProperty(), lookup.getLookupValueProperty(), lookup.getLookupDatabackValue(), SysCardFormBeansUtil.LOOK_BIZ_BACK_TYPE_FUNNAME_START+column.getForm().getFormDefCode()+column.getFormFiledTablename());
			}
		}else {
			htmls[8]=htmls[8]==null?"":htmls[8];
			htmls[8] += onbuttonclickStr+"\n"+initlookupInitFun;
			if("biz".equals(lookup.getLookupDatabackType())){
			
				htmls[8]+= SysGridFormBeansUtil.getDefaultLookupBiz(lookup.getLookupShowProperty(), lookup.getLookupValueProperty(), lookup.getLookupDatabackValue(), SysCardFormBeansUtil.LOOK_BIZ_BACK_TYPE_FUNNAME_START+column.getForm().getFormDefCode()+column.getFormFiledTablename());
			}
		}
		
		return ret;
	}

	/**
	 * 获取checkbox控件js代码
	 * @param textbox
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column 
	 * @return
	 */
	public static Object[] getCheckboxHtml(SysCheckboxCache checkbox,String entityName,String fieldName,String[] htmls,SysRequestParam request ,SysFormColumnCache column,boolean isAsLabel,String isApp){
		Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, checkbox.getCheckboxDataFromType(),checkbox.getCheckboxDataFromValue(),  checkbox.getCheckboxValuechangeFun(),
				checkbox.getCheckboxClickFun(), checkbox.getCheckboxInitFun(), 
				null, null,checkbox.getCheckboxId()+"", column, isAsLabel,null,null,false,null,isApp);
		return ret;
	}
	
	/**
	 * 富文本控件生成js代码
	 * @param richtext
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @return
	 */
	public static Object[] getRichtextHtml(SysFormRichtextCache richtext, String entityName, String fieldName, String[] htmls, SysRequestParam request, SysFormColumnCache column,boolean isRequired,boolean isDisabled,boolean isAsLabel) {
		// TODO 自动生成方法存根
		//确认富文本控件类型
		String richeTextType  =  richtext.getRichTextType();
		if("ue".equals(richeTextType)) {
			String key = richeTextType;
//			/SYS_FORM_UE_JS_IMPORT
			String impjsTemp = "";
			impjsTemp+=SysCardFormBeansUtil.getInportJs(request.getContextPath()+"/common/ueditor/ueditor/ueditor.config.js")+SysCardFormBeansUtil.NEW_LINE_ONLY;
			impjsTemp+=SysCardFormBeansUtil.getInportJs(request.getContextPath()+"/common/ueditor/ueditor/ueditor.all.js")+SysCardFormBeansUtil.NEW_LINE_ONLY;
			column.getForm().setImportJs(key, impjsTemp); //引入js文件放入到表单对象的importJs属性中
			//生成全局变量
			String ueNameJsStr = richtext.getRichTextName();
			htmls[9]=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_VAR +ueNameJsStr+SysCardFormBeansUtil.NEW_LINE;
			//
			//生成初始化函数
			String ueInitJs = SysCardFormBeansUtil.getUeInitJs(column,richtext,isDisabled,isAsLabel);
			htmls[1]=ueInitJs;
			//获取数据初始化方案
			String dataFromType = richtext.getRichTextDataFromType();
			String dataFromValue=richtext.getRichTextDataFromValue();
//			处理js函数
			if("initFun".equals(dataFromType)){
				htmls[1] += richtext.getRichTextInitFun();
			}else if("session".equals(dataFromType)){
				String sessionParamValue = dataFromValue;
				String _value  = "";
				_value =getSessionValue(request,sessionParamValue,null);//获取session对应值
				String tempjs = SysCardFormBeansUtil.getUeSetDataJs(ueNameJsStr, _value);
				htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
			}else if("global".equals(dataFromType)){
				String _value = "";//获取session对应值
				String tempjs = SysCardFormBeansUtil.getUeSetDataJs(ueNameJsStr, _value);
				htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
			}else if("parameter".equals(dataFromType)){
				String _value =request.getRequest().getParameter(dataFromValue);
				String tempjs = SysCardFormBeansUtil.getUeSetDataJs(ueNameJsStr, _value);
				htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
			}else if("constant".equals(dataFromType)){
				String _value =dataFromValue;
				String tempjs = SysCardFormBeansUtil.getUeSetDataJs(ueNameJsStr, _value);
				htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
			}else if("sql".equals(dataFromType)){
				String _value =""; //sql获取对应的数据
				String tempjs = SysCardFormBeansUtil.getUeSetDataJs(ueNameJsStr, _value);
				htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
			}else if("currentdate".equals(dataFromType)){ //当前时间
				String _value =""; //sql获取对应的数据
			    java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			    _value = format1.format(new Date());
			    String tempjs = SysCardFormBeansUtil.getUeSetDataJs(ueNameJsStr, _value);
				htmls[1]=tempjs+SysCardFormBeansUtil.NEW_LINE;
			}
			if(isRequired){ //生成校验的js片段 如果必填
				String checkJs = SysCardFormBeansUtil.getUeCheckJs(ueNameJsStr,column.getFormColumnLable());
				if(htmls[10]==null)htmls[10] ="";
				htmls[10] +=checkJs; 
			}
			//提交时把富文本数据设置对应字段的影藏域中
			String ueSetdataJs = SysCardFormBeansUtil.getSaveJs(ueNameJsStr,column.getJsId("id",column.getFormColumnFormDefId()+""),column.getFormColumnFormDefId()+"");
			if(htmls[10]==null)htmls[10] ="";
			htmls[10] +=ueSetdataJs; 
			//生成初始化时需要回填js片段 此片段生成在初始化函数回调之后
			String setUeValueFormHidenJs = SysCardFormBeansUtil.setUeValueFormHidenJs(ueNameJsStr,column.getJsId("id",column.getFormColumnFormDefId()+""));
			System.out.println(setUeValueFormHidenJs);
			if(htmls[11]==null)htmls[11] ="";
			htmls[11] +=setUeValueFormHidenJs ; 
			
		}
		return htmls;
	}
	
	/**
	 * 附件控件js生成
	 * @param fileupload
	 * @param entityName
	 * @param fieldName
	 * @param htmls
	 * @param request
	 * @param column
	 * @param isRequired
	 * @param isDisable
	 * @param isAsLabel
	 * @return
	 */
	public static Object[] getFileuploadHtml(String jsId,SysFormFileuploadCache fileupload, String entityName, String fieldName, String[] htmls, SysRequestParam request, SysFormColumnCache column, boolean isRequired, boolean isDisable, boolean isAsLabel,String columnId) {
		String fileType = fileupload.getPojo().getFileuploadUploadFiletypes();
		String fileTypeExts = "fileTypeExts: \"";
		if (!fileType.equals("*")) {
			String[] fileTypes = fileType.split(",");
			for (int i = 0; i < fileTypes.length; i++) {
				fileTypeExts += "*."+fileTypes[i].substring(1, fileTypes[i].length()-1)+";";
			}
		} else {
			fileTypeExts += "*";
		}
		fileTypeExts += "\", // 扩展名";
		if(fileupload.getPojo().getFileuploadAutoUpload().equals("N")){
			htmls[8] =  "$('#uploadify_"+columnId+"').Huploadify({\n"+
						fileTypeExts+"\n"+
					    "uploader: '/myehr/FileList/newFileUp.action',           // 服务器端处理地址\n"+
					    "auto: true, // 选择之后，自动开始上传\n"+
					    "showUploadedPercent: false,\n"+
					    "buttonText: \"上传文件\",                 // 按钮上的文字\n"+
					    "buttonCursor: 'hand',                // 按钮的鼠标图标\n"+
					    "fileObjName: 'Filedata',            // 上传参数名称\n"+
					    //"fileTypeDesc: \"请选择 xls xlsx 文件\",     // 文件说明\n"+
					    "multi: false,               // 是否支持同时上传多个文件\n"+
					    "overrideEvents: ['onDialogClose'],\n"+
					    "fileSizeLimit: '204800',\n"+
					    "//文件选择后的容器ID\n"+
					    "queueID: 'uploadfileQueue',\n"+
					    "//选择上传文件后调用\n"+
					    "onSelect: function (file) {\n"+
					    "    layer.load();\n"+
					    "},\n"+
					    "onComplete:function (event, ID, fileObj, response, data) {	\n"+
					    "	alert(fileObj);\n"+
					    "},\n"+
					    "//返回一个错误，选择文件的时候触发\n"+
					    "onSelectError: function (file, errorCode, errorMsg) {\n"+
					    "    closeload();\n"+
					    "    var str = '';\n"+
					    "    switch (errorCode) {\n"+
					    "        case -110:\n"+
					    "            alert(\"上传失败，文件大小不能超过2M\");\n"+
					    "            break;\n"+
					    "        case -120:\n"+
					    "            alert(\"上传失败，文件大小不能超过2M\");\n"+
					    "            break;\n"+
					    "        case -130:\n"+
					    "            alert(\"您上传的文件格式不对，请重新选择\");\n"+
					    "            break;\n"+
					    "    }\n"+
					    "},\n"+
					    "//检测FLASH失败调用\n"+
					    "onFallback: function () {\n"+
					    "    $('.xubox_shade').remove();\n"+
					    "    $('.xubox_layer').remove();\n"+
					    "    alert(\"您未安装FLASH控件，无法上传文件！请安装FLASH控件后再试。\");\n"+
					    "},\n"+
					    "//上传到服务器，服务器返回相应信息到data里\n"+
					    "onUploadSuccess: function (file, data, response) {\n"+
					    "    $('.xubox_shade').remove();\n"+
					    "    $('.xubox_layer').remove();\n"+
					    "    if (data === \"1\") {\n"+
					    "        layer.alert(\"文件格式不正确！\");\n"+
					    "    }\n"+
					    "    else if (data === \"0\") {\n"+
					    "        layer.alert(\"上传出错！\");\n"+
					    "    } else {\n"+
					    "        $('[id=\""+jsId+"_fileName\"]').val(file.name);\n"+
					    "        var file=JSON.parse(data);\n"+
					    "        filepath=file.filepath;\n"+
					    "        fileid=file.fileid;\n"+
					    "        //$(\"#filepath\").val(file.filepath);\n"+
					    "      $('[id=\""+jsId+"\"]').val(file.fileid);\n"+
					    "        layer.closeAll();\n"+
					    "    }\n"+
					    "},\n"+
					    "onCancel: function (file) {\n"+
					    "}\n"+
						"})\n";
		}else {
			htmls[8] =  "function fileupload_"+columnId+"(){\n"+
						"	var url = '/myehr/jsp/form/button/testFile/addFileInfoDyn.jsp?OBJ_TYPE="+fileupload.getPojo().getFileuploadDataFromType()+"&OBJ_ID="+fileupload.getPojo().getFileuploadDataFromValue()+"&TAG_TYPE="+fileupload.getPojo().getFileuploadTagGuiType()+"&UPLOADTYPE="+fileType+"&UPLOADNUM="+fileupload.getPojo().getFileuploadMaxFileCount()+"'\n"+
						"	layer.open({\n"+
						"		type:2,\n"+
						"		closeBtn:1,\n"+
						"		shadeClose:true,\n"+
						"		maxmin:true,\n"+
						"		title:'上传文件',\n"+
						"		content:url,\n"+
						"		success:function(layero,index){\n"+
						"			//$('.layui-layer-max').click();\n"+
						"		},\n"+
						"		end:function(){			}\n"+
						"	}); \n"+
						"} ";
		}
		
		return null;
	}
	/*
	public static Object[] getFileuploadHtml(SysFileupload fileupload, String entityName, String fieldName, String[] htmls, HttpServletRequest request, SysFormColumn column, boolean isRequired, boolean isDisable, boolean isAsLabel) {
		// TODO 自动生成方法存根
		生成全局变量
		String fileupladNameJsStr = fileupload.getFileuploadName();
		htmls[9]=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_VAR +fileupladNameJsStr+SysCardFormBeansUtil.NEW_LINE;
//		生成初始化函数
		String ueInitJs = SysCardFormBeansUtil.getFileUploadInitJs(column,fileupload,isDisable,isAsLabel);
		htmls[1]=ueInitJs;
		String impjsTemp = "";
		impjsTemp+=SysCardFormBeansUtil.getInportJs(request.getContextPath()+"/dcf/util/ajaxfileupload/ajaxfileupload.js")+SysCardFormBeansUtil.NEW_LINE_ONLY;
		column.getForm().setImportJs("swfupload", impjsTemp); //引入js文件放入到表单对象的importJs属性中
		
		//生成初始化函数
		@SuppressWarnings("unused")
		String uploadInitJs = SysCardFormBeansUtil.getFileUploadInitJs(column,fileupload,isDisable,isAsLabel);
		htmls[1]=ueInitJs;
		//生成startUpload函数
		String startuploadFunjs = SysCardFormBeansUtil.getFileuploadStartUploadJs(fileupload.getFileuploadName());
		htmls[8] = startuploadFunjs;
		
		//获取数据初始化方案
		String dataFromType = fileupload.getFileuploadDataFromType();
		String dataFromValue=fileupload.getFileuploadDataFromValue();
		if("initFun".equals(dataFromType)){
			htmls[1] += fileupload.getFileuploadInitFun();
		}else if("session".equals(dataFromType)){
			String sessionParamValue = dataFromValue;
			String _value  = "";
			_value =getSessionValue(request,sessionParamValue,null);//获取session对应值
			String tempjs = SysCardFormBeansUtil.getFileupladSetDataJs(fileupladNameJsStr, _value);
			htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("global".equals(dataFromType)){
			String _value = "";//获取session对应值
			String tempjs = SysCardFormBeansUtil.getFileupladSetDataJs(fileupladNameJsStr, _value);
			htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("parameter".equals(dataFromType)){
			String _value =request.getParameter(dataFromValue);
			String tempjs = SysCardFormBeansUtil.getFileupladSetDataJs(fileupladNameJsStr, _value);
			htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("constant".equals(dataFromType)){
			String _value =dataFromValue;
			String tempjs = SysCardFormBeansUtil.getFileupladSetDataJs(fileupladNameJsStr, _value);
			htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("sql".equals(dataFromType)){
			String _value =""; //sql获取对应的数据
			String tempjs = SysCardFormBeansUtil.getFileupladSetDataJs(fileupladNameJsStr, _value);
			htmls[1]+=tempjs+SysCardFormBeansUtil.NEW_LINE;
		}else if("currentdate".equals(dataFromType)){ //当前时间
			String _value =""; //sql获取对应的数据
		    java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		    _value = format1.format(new Date());
		    String tempjs = SysCardFormBeansUtil.getFileupladSetDataJs(fileupladNameJsStr, _value);
			htmls[1]=tempjs+SysCardFormBeansUtil.NEW_LINE;
		}
		if(isRequired){ //生成校验的js片段 如果必填
			String checkJs = SysCardFormBeansUtil.getFileupladCheckJs(fileupladNameJsStr,column.getFormColumnLable(),isDisable,isAsLabel);
			if(htmls[10]==null)htmls[10] ="";
			htmls[10] +=checkJs; 
		}
//		提交时把附件数据设置对应字段的影藏域中
		String fileuploadSetdataJs = SysCardFormBeansUtil.getFileupladSaveJs(fileupladNameJsStr,column.getJsId("id"));
		if (htmls[10] == null) {
			htmls[10] = "";
		}
			
		htmls[10] +=fileuploadSetdataJs; 
		//生成初始化时需要回填js片段 此片段生成在初始化函数回调之后
		String setFileuploadValueFormHidenJs = SysCardFormBeansUtil.setFileuploadValueFormHidenJs(fileupladNameJsStr, column.getJsId("id"));
		if(htmls[11]==null)htmls[11] ="";
		htmls[11] +=setFileuploadValueFormHidenJs ; 
		return null;
	}*/

	
	
	public static String getSessionValue(SysRequestParam request,String param,UserObject user){
		if(param==null){
			return null;
		}
		HttpSession session  = request.getSession();
		String user1 = "";
		if (param.equals("userId")) {
			param = "userid";
		}
		System.out.println(session.getAttribute("username"));
		System.out.println(session.getAttribute("userid"));
		if (session.getAttribute(param)!=null) {
			user1 = session.getAttribute(param)+"";
		}
		
		return user1;
		/*UserObject user = null;
		if(puser!=null){
			user = puser;
		}else {
			//获取userObject对象
			HttpSession session  = request.getSession();
			user = (UserObject)session.getAttribute("userObject");
		}
	
		//解析参数
		String [] arr = param.split("/");
		if(arr.length==1){ //区标准userObject里属性 或者某个attribute下的属性
			if("userId".equals(arr[0])){
				return  user.getUserId();
			}
			if("userName".equals(arr[0])) {
				return  user.getUserName();
			}
			if("orgId".equals(arr[0])) {
				return  user.getUserOrgId();
			}
			if("orgName".equals(arr[0])) {
				return  user.getUserOrgId();
			}
		}
		if(arr.length==2){
			if("attributes".equals(arr[0])){
				//HashMap<String, Object> attributes = (HashMap<String, Object>)user.getAttributes();
				//return (String)attributes.get(arr[1]);
			}
		}*/
		
	}
	
	/**
	 * 生成加载combobox自定义sql的js脚本
	 * @param formCode
	 * @param columnName
	 * @param jsId
	 * @return
	 */
	public static String getCardFormComboboxGuiInitJs(String columnName,String jsId,SysFormComboboxCache combox,SysRequestParam request,SysFormconfigCache form ,boolean isFilter){
		String temp = "";
		//String funname = "combobox_init_"+columnName;
		/*if(isFilter==true){
			jsId = "FILTER_"+jsId;
		}
		String[] results = SysFormGeneralExecSqlCache.getSqlJsStr(combox,request, columnName,combox.getComboboxFormColumnId(),form,jsId,isFilter);
		String paramJson = results[1];
		String qjs = results[0];
		temp+=SysCardFormBeansUtil.getNbsp(1)+"function "+funname+"(e) {"+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp+=SysCardFormBeansUtil.getNbsp(2)+qjs+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp+=SysCardFormBeansUtil.getNbsp(2)+"var url = \""+SysCardFormBeansUtil.QUERY_SQL_URL+"?"+paramJson+"\""+SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp+=SysCardFormBeansUtil.getNbsp(2)+"var comboxobj = nui.get(\""+jsId+"\");"+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp+=SysCardFormBeansUtil.getNbsp(2)+"comboxobj.setUrl(url);"+ SysCardFormBeansUtil.NEW_LINE_ONLY;
        temp+=SysCardFormBeansUtil.getNbsp(1)+"}"+ SysCardFormBeansUtil.NEW_LINE_ONLY;*/
		return temp;
	}
	
	
	public static Object[] getCardFormGuiHtml(String[] htmls,
			SysRequestParam request, String entityName, String fieldName, String checkType, String checkSelf, String checkFun,
			String dataFromType, String dataFromValue, String valuechangeFun,
			String clickFun, String initFun, String guiInitType,
			String guiInitValue, String busId, SysFormColumnCache column,
			boolean isAsLabel, Map<String, List<SysFormGeneralParamCache>> params,String comboboxInitFun,boolean isFilter,String comboboxDictNameColumn,String isApp) {
		Object[] ret = new Object[9];
		String jsId = column.getJsId("id",column.getPojo().getFormColumnFormDefId().toString());
		if(isFilter){
			jsId = "FILTER_"+jsId;
		}
		
		boolean isValueChange = false;
		boolean isOnclick = false;
		boolean isValidation = false;
		
		String dictTypeId = null;
		String url =  null;
		String data = null;
		
		// 处理js函数
		if("initFun".equals(dataFromType)){
			htmls[1] = initFun;
		}else {
//			String _value = getDefaultValue(request, dataFromType, dataFromValue);
			String _value = "";
			if (isApp!=null&&isApp.equals("CARDANDCARD")) {
				_value = CardAndCardFormBeansUtil.getDefaultValue(request, dataFromType, dataFromValue);
			} else {
				_value = SysCardFormColumnUtil.getDefaultValue(request, dataFromType, dataFromValue);
			}
			if(_value!=null&&!_value.equals("")){
//				String tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
				String tempjs = "";
				if (isApp!=null&&isApp.equals("CARDANDCARD")) {
					tempjs = CardAndCardFormBeansUtil.setValueJs(fieldName, _value);
				} else {
					tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
				}
				htmls[1] = SysCardFormBeansUtil.getNbsp(2) + tempjs	+ SysCardFormBeansUtil.NEW_LINE;
			}else {
				htmls[1]="";
			}
			
		}
		
		//初始化控件数据来源
		if ("dict".equals(guiInitType)) { // 字段类型
			//获取字段类型
			dictTypeId = guiInitValue;
			
		} else if ("biz".equals(guiInitType)) {
			url = guiInitValue;
			if(params!=null) {
				String endtype = FormParamConstants.GUI_DATA_INIT_BIZ;
				List<SysFormGeneralParamCache>  l = params.get(endtype);
				String paramStr = getGeneralParamStr(l,request);
				if(paramStr!=null&&!"".equals(paramStr)){
					if(url!=null&&url.indexOf("?")>0){
						url = url +"&" +paramStr;
					}else {
						url = url+"?"+paramStr;
					}
				}
			}
			
		} else if ("json".equals(guiInitType)) {
			data = guiInitValue;
		} else if ("sql".equals(guiInitType)) {
			dictTypeId = guiInitValue;
		}
		//click方案
		if (clickFun != null && !"".equals(clickFun)&&isFilter==false) {
			isOnclick = true;
			
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+column.getOnClickFunName()+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+clickFun+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			
			htmls[2] =temp;
		}
		//valuechange方案
		if (valuechangeFun != null && !"".equals(valuechangeFun)&&isFilter==false) {
			isValueChange = true;
			
			String valueChangeJs = "";
			if (comboboxDictNameColumn!=null && !comboboxDictNameColumn.equals("")) {
				String[] aa = comboboxDictNameColumn.split("[.]");
				String id = aa[0]+"."+ChangeCode.getUniqueCode(aa[0], aa[1])+"_"+column.getFormColumnFormDefId();
				valueChangeJs = "document.getElementById(\""+id+"\").value=e.selectedOptions[0].innerText;\n";
			}
			
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+column.getOnValueChangeFunName(column.getFormColumnFormDefId())+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)
					+valueChangeJs
					+valuechangeFun
					+SysCardFormBeansUtil.NEW_LINE_ONLY+SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END;
			
			htmls[3] =temp;
		}else if(comboboxInitFun!=null){
			isValueChange = true;
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+column.getOnValueChangeFunName(column.getFormColumnFormDefId())+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+comboboxInitFun+SysCardFormBeansUtil.NEW_LINE;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			htmls[3] =temp;
		}
		
		try {
			if (!checkType.isEmpty() && checkType!="") {
				//前端配合
				if ("fun".equals(checkType) ) {
					checkType = null;
					checkSelf = null;
					if (checkFun != null && !"".equals(checkFun)) {
						isValidation = true;
						
						String temp = SysCardFormBeansUtil.getNbsp(1) + SysCardFormBeansUtil.JAVASCRIPT_FUNCTION
								+ column.getOnValidationFunName() + SysCardFormBeansUtil.JAVASCRIPT_FUN_START + SysCardFormBeansUtil.NEW_LINE_ONLY;
						temp += SysCardFormBeansUtil.getNbsp(2) + checkFun + SysCardFormBeansUtil.NEW_LINE_ONLY;
						temp += SysCardFormBeansUtil.getNbsp(1) 	+ SysCardFormBeansUtil.JAVASCRIPT_FUN_END + SysCardFormBeansUtil.NEW_LINE_ONLY;
						htmls[4] =temp;
					}
				} else if("uniqueVerify".equals(checkType)) {
					checkType = null;
					checkSelf = null;	
					isValidation = true;
						//String isInit = request.getParameter("isInit");
						
						/*if("true".equals(isInit)){
							String temp = SysCardFormBeansUtil.getNbsp(1) + SysCardFormBeansUtil.JAVASCRIPT_FUNCTION
							+ column.getOnValidationFunName() + SysCardFormBeansUtil.JAVASCRIPT_FUN_START + SysCardFormBeansUtil.NEW_LINE_ONLY;
							temp += SysCardFormBeansUtil.getNbsp(2) + "return false;" + SysCardFormBeansUtil.NEW_LINE_ONLY;
							temp += SysCardFormBeansUtil.getNbsp(1) + SysCardFormBeansUtil.JAVASCRIPT_FUN_END + SysCardFormBeansUtil.NEW_LINE_ONLY;
							htmls[4] =temp;
						}
						else{*/
						String pkId  = column.getForm().getPkColumn().getJsId("id",column.getPojo().getFormColumnFormDefId().toString());
							String uniqueVerifyCheckFun = 
							"var field = '"+fieldName+"';"  + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(2) + "var val = e.value;" + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(2) + "var pkvalue =nui.get('"+pkId+"').getValue();"+ SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(2) + "var result;"                                                         + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(2) + "$.ajax({"                                                            + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "url:'com.dcf.form.runtime.guicommonComp.checkUniqueVerify.biz.ext'," + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "type:'post',"                                                        + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "data: nui.encode({'formId':_formId, 'field':field, 'value':val,pkvalue:pkvalue}),"   + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "cache: false,"                                                       + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "contentType: 'text/json',"                                           + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "async:false,"                                                         + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "success: function (text) {"                                          + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(6) + "result = text.result;"                                               + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "},"                                                                  + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "error: function (jqXHR, textStatus, errorThrown) {"                  + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "}"                                                                   + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(2) + "});"                                                                 + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(2) + "if (result == true) {"                                              + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "e.errorText = '字段值重复！';"                                         + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(4) + "e.isValid = false;"                                                  + SysCardFormBeansUtil.NEW_LINE_ONLY +
							SysCardFormBeansUtil.getNbsp(2) + "}";
						

							String temp = SysCardFormBeansUtil.getNbsp(1) + SysCardFormBeansUtil.JAVASCRIPT_FUNCTION
									+ column.getOnValidationFunName() + SysCardFormBeansUtil.JAVASCRIPT_FUN_START + SysCardFormBeansUtil.NEW_LINE_ONLY;
							temp += SysCardFormBeansUtil.getNbsp(2) + uniqueVerifyCheckFun + SysCardFormBeansUtil.NEW_LINE_ONLY;
							temp += SysCardFormBeansUtil.getNbsp(1) + SysCardFormBeansUtil.JAVASCRIPT_FUN_END + SysCardFormBeansUtil.NEW_LINE_ONLY;
							htmls[4] =temp;
						//}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		ret[0] = checkType;
		ret[8] = checkSelf;
		ret[2] = isValueChange;
		ret[3] = isOnclick;
		ret[4] = isValidation;  
		ret[5] = dictTypeId;
		ret[6] = url;
		ret[7] = data;
		return ret;
	}
	
	/**
	 * 
	 * @param dataFromType
	 * @param dataFromValue
	 * @param initFun
	 * @return
	 */
	public static String getDefaultValue(SysRequestParam request,String dataFromType,String dataFromValue){
		//处理js函数
		 if("session".equals(dataFromType)){
			String sessionParamValue = dataFromValue;
			String _value  = "";
			if(dataFromValue.equals("userId")){
				dataFromValue = "userid";
			}
//			_value =getSessionValue(request,sessionParamValue,null);//获取session对应值
			_value = "${sessionScope."+dataFromValue+"}";
			return _value;
		}else if("global".equals(dataFromType)){
			String _value = "";//获取全局变量对应值
			return _value;
		}else if("parameter".equals(dataFromType)||"request".equals(dataFromType)){
			return "${param."+dataFromValue.toUpperCase()+"}";// request.getParameter(dataFromValue);
		}else if("constant".equals(dataFromType)){
			String _value =dataFromValue;
			return _value;
		}else if("sql".equals(dataFromType)){
			String _value =""; //sql获取对应的数据
			return _value;
		}else if("currentdate".equals(dataFromType)){ //当前时间
			String _value =""; //sql获取对应的数据
		    java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		    _value = format1.format(new Date());
		    return _value;
		}else if("grid".equals(dataFromType)){ //列表参数
			String _value ="'+_srow."+dataFromValue+"+'";
			return _value;
		}else if("mstform".equals(dataFromType)){ //卡片表单参数
			String _value ="\"+_form_"+dataFromValue+"+\"";
			return _value;
		}else if("treeNode".equals(dataFromType)){ //树节点参数
			String _value ="+e.node."+dataFromValue;
			return _value;
		}else if("card".equals(dataFromType)){ //卡片参数
			String _value ="\"+param_"+dataFromValue+"+\"";
			return _value;
		}
		
		return null;
	}
	
	/**
	 * 获取参数拼接的字符串
	 * @param params
	 * @return
	 */
	public static String getGeneralParamStr(List<SysFormGeneralParamCache> params,SysRequestParam request){
		String temp = "";
		if(params==null){
			return temp;
		}
		for(SysFormGeneralParamCache p:params){
			String dataFromType = p.getParamFromType();
			String dataFromValue = p.getPojo().getParamFromValue();
			String _value = getDefaultValue(request,dataFromType,dataFromValue);
			String paramName = p.getParamName();
			if(_value!=null&&!"".equals(_value)){
				temp += paramName+"="+_value+"&";
			}
		}
		if(!"".equals(temp)){
			temp = temp.substring(0,temp.length()-1);
		}
		return temp;
	}
	

	/**
	 * 获取表单全局js参数拼接的字符串
	 * @param params
	 * @return
	 */
	public static String getGeneralJsParamStr(List<SysFormGeneralParamCache> params,SysRequestParam request, boolean isSetJsObj){
		String temp = "";
		String gtemp = "";
		if(params==null){
			return temp;
		}
		for(SysFormGeneralParamCache p:params){
			String dataFromType = p.getParamFromType();
			String dataFromValue = p.getParamFromTypeValue();
			String _value = getDefaultValue(request,dataFromType,dataFromValue);
			String paramName = p.getParamName();
			if(_value!=null&&!"".equals(_value)){
				temp +="var "+ paramName+"='"+_value+"'"+SysCardFormBeansUtil.NEW_LINE;
				if(isSetJsObj){
					gtemp += "_gparamsobj."+paramName+" = '"+_value+"'"+SysCardFormBeansUtil.NEW_LINE;;
				}
			}else {
				temp +="var "+ paramName+"=null"+SysCardFormBeansUtil.NEW_LINE;
				if(isSetJsObj){
					gtemp += "_gparamsobj."+paramName+" = null"+SysCardFormBeansUtil.NEW_LINE;;
				}
			}
			
		}
		temp+=gtemp;
		return temp;
	}

	
}
