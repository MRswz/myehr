package com.myehr.pojo.formmanage.form;


public class SysCardFormBeansUtil {

	//字段存储脚本长度
	public static final int HTML_SILZE = 16;
	//卡片式表单页面开始
	public static final String CARD_FORM_START="<div class=\"container-fluid\">\n <div style=\"margin:20px\">";
	
	//卡片式表单页面结束
	public static final String CARD_FORM_END="</div></div>";
	
	//卡片式表普通表不分组的开始代码
	public static final String CARD_FORM_TABLE_START ="	<form id=\"basic-info\"  class=\"form-horizontal\" role=\"form\">\n";
	
	//卡片式表普通表不分组的结束代码
	public static final String CARD_FORM_TABLE_END ="		</form>\n";
	
	//卡片式普通表单的TR开始i
	public static final String CARD_FORM_TABLE_TR_START ="			<div class=\"form-group\">\n"; 
	
	//卡片式普通表单的TR结束
	public static final String CARD_FORM_TABLE_TR_END ="			</div>\n"; 
	
//	卡片式普通表单字段名的lable
	public static final String CARD_FORM_LABLE_START ="<label class=\"col-sm-2 control-label\">"; 
	
//	卡片式普通表单字段名的lable
	public static final String CARD_FORM_LABLE_END ="</label>"; 
	
	//卡片式普通表单的TD开始
	public static final String CARD_FORM_TABLE_TD_START ="				<td>"; 
	
	//fieldset结束标签
	public static final String CARD_FORM_FIELD_SET_END ="	</fieldset>\n";
	
	//卡片式普通表单的TD结束
	public static final String CARD_FORM_TABLE_TD_END ="</td>\n"; 
	
	//卡片表单只textbox控件class
	public static final String CARD_FORM_TEXT_BOX = "nui-textbox";
	
	//卡片表单只textarea控件class
	public static final String CARD_FORM_TEXT_AREA = "nui-textarea";
	
	//卡片表单只textbox控件class
	public static final String CARD_FORM_COMBO_BOX = "nui-combobox";

	//卡片表单只textbox控件class字典类型的
	public static final String CARD_FORM_DICT_COMBO_BOX = "nui-dictcombobox";
	
//	卡片表单只radiolistbox控件class  dictradiobuttonlist
	public static final String CARD_FORM_RIDIOLIST_BOX = "nui-radiobuttonlist";
	
	//卡片表单只radiolistbox控件class字典类型的
	public static final String CARD_FORM_DICT_RIDIOLIST_BOX = "nui-DictRadioGroup";
	
//	卡片表单只checkboxlis控件class 
	public static final String CARD_FORM_CHECK_BOX_LIST = "nui-checkboxlist"; 
	
	//卡片表单只checkboxlis控件class字典类型的
	public static final String CARD_FORM_DICT_CHECK_BOX_LIST = "nui-DictCheckboxGroup";
	
//	卡片表单只datepicker控件class 
	public static final String CARD_FORM_LOOKUP = "nui-buttonedit"; 
	
//	日期选择控件class 
	public static final String CARD_FORM_DATEPICKER = "nui-datepicker"; 
	
//	年月选择控件class 
	public static final String CARD_FORM_MONTHPICKER = "nui-monthpicker"; 
	
//	卡片表单只checkbox控件class 
	public static final String CARD_FORM_CHECKBOX = "nui-checkbox"; 
	
//	卡片表单影藏控件class
	public static final String CARD_FORM_HIDDEN = "nui-hidden";
	
	public static final String JAVASCRIPT_START = "<script >";
	
	public static final String JAVASCRIPT_VAR = "var ";
	
	public static final String JAVASCRIPT_END = "</script>";
	
	public static final String JAVASCRIPT_WINDOW_ONLOAD = "window.onload=function(){";
	
	public static final String JAVASCRIPT_FUN_START_ONLY = "{";
	
	public static final String JAVASCRIPT_FUN_START = "{\n";
	
	public static final String JAVASCRIPT_FUN_END_ONLY = "}";
	
	public static final String JAVASCRIPT_FUN_END = "}\n";
	
	public static final String JAVASCRIPT_FUNCTION = "function ";
	
	public static final String JAVASCRIPT_PARAM_START = "(";
	
	public static final String JAVASCRIPT_PARAM_END = ")";
	
	public static final String SEM = ";\n";
	
	public static final String NEW_LINE = ";\n";
	
	public static final String NEW_LINE_ONLY = "\n";
	
	public static final String DIV_END="</div>\n";
	
	public static final String LOOKUP_BACK_FUN_NAME = "";
	
	public static final String RICHE_TEXT_UE_VAR_NAME = "UE_"; //ue变量名称组成
	
	public static final String SWF_FILEUPLOAD_VAR_NAME = "UPLOAD_"; //FILEUPLOAD变量名称组成
	
	public static final String SWF_FILEIPLOAD_STARTUPLOAD_FUN_NAME = "_START_UPLOAD";//FILEUPLOAD	 上传函数的变量名组成
	
	
	/**
	 * 卡片式表单 保存按钮的默认处理逻辑url
	 *//*
	public static final String CARD_FORM_SAVE_BUTTON_DEFAULT_URL = "com.dcf.form.runtime.cardFormButton.saveButtonSave.biz.ext";
	*//**
	 * 卡片式表单 初始化数据url
	 *//*
	public static final String CARD_FORM_INIT_DATA_URL = "com.dcf.form.runtime.cardFormButton.cardformInitData.biz.ext";
	
	*//**
	 * 调用动态表单url
	 *//*
	public static final String LOOKUP_FORM_URL = "com.dcf.form.toForm.flow";
	
	*//**
	 * LOOKUP控件回填sql查询调用逻辑
	 *//*
	public static final String LOOKUP_SQL_QUERY_URL = "com.dcf.form.runtime.cardFormButton.cardformInitData.biz.ext";
	
	*//**
	 * 查询类sql执行公共url
	 *//*
	public static final String QUERY_SQL_URL = "com.dcf.form.runtime.comboboxComp.queryCombobxInitData.biz.ext";
	
	*//**
	 * lookup 获取数据回填的函数部分名称
	 *//*
	public static final String LOOK_BIZ_BACK_TYPE_FUNNAME_START = "getCardLookupBackVal";

	*//**
	 * 
	 * @param 分组名称
	 * @return 分组开始html代码段
	 *//*
	public static String getCardFormGroupStart(String groupName, String isOpen) {
		return "	<fieldset style=\"border:solid 1px #d2d2d2;padding:2px;\">\n" +
				"	<legend ><span style=\"color:#525151;font-weight:600;font-size:12px;\">"+groupName+"</span></legend>\n" + 
				"		<table style=\"width:100%;table-layout:fixed;\" class=\"cbs-table\"  >\n";
	}
	
	*//**
	 *获取普通卡片textbox控件的html代码
	 *//*
	public static String getTextBoxHtml(String classType, String id, String name, String vtype,String othervtype, String errorText, String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,String height){
		String baseName = (entityName + "_" + name).replaceAll("\\.", "_");
		String valueChangeFunName = isValueChange == true ? " onvaluechanged=\"" + baseName + "_valueChange\"" : "";
		String valueClickFunName = isClick == true ? " onclick=\"" + baseName + "_click\"" : "";
		String isValidationFunName = isValidation == true ? " onvalidation=\"" + baseName + "_validation\"" : "";
		String requiredHtml = isRequired == true ? " required=\"true\" " : "";
		if (vtype != null && !"".equals(vtype)) {
			if (othervtype != null && !"".equals(othervtype)) {
				vtype = vtype + ";" + othervtype;
			}
		} else {
			if (othervtype != null && !"".equals(othervtype)) {
				vtype = othervtype;
			}
		}
		String vtypeHtml = vtype != null ? " vtype=\"" + vtype + "\" " : "";
		String errorTextHtml = errorText != null ? vtype + "ErrorText=\"" + errorText + "\" " : "";
		//String errorTextHtml = "";
		String emptyTextHtml = emptyText != null ? " emptyText=\"" + emptyText + "\" " : "";
		String isDisabledHtml = isDisabled ? " enabled=\"false\"" : "";
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String heightHtml = height != null ? "height:" + height + ";" : "";
		String styleHtml = " style=\"" + widthHtml + heightHtml + "\"";
		
		String tb = "<input id=\""+id+"\" name=\""+name+"\" class=\""+classType+"\"" + 
						emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml +"/>";
		
		return tb;
	}
	
	*//**
	 * textbox区间查询
	 * @param classType
	 * @param string
	 * @param fieldName
	 * @param vtype
	 * @param object
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 * @param entityName
	 * @param gridColumnWidth
	 * @param object2
	 * @return
	 *//*
	public static String getTextBoxHtmlIntervais(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,String height){
		// TODO 自动生成方法存根
		String res1 = getTextBoxHtml(classType , "_INTERVAIL_MIN_"+id,"_INTERVAIL_MIN_"+name, vtype,null, null, emptyText,isRequired,isValueChange,isClick,isValidation,isDisabled,entityName,width, height);
		String res2 = getTextBoxHtml(classType , "_INTERVAIL_MAX_"+id,"_INTERVAIL_MAX_"+name, vtype,null, null, emptyText,isRequired,isValueChange,isClick,isValidation,isDisabled,entityName,width, height);
		return res1 +" 至 "+res2;
	}
	
	*//**
	 *获取普通卡片表单中combox控件的html代码
	 * @param data 
	 * @param url 
	 * @param nullItemText 
	 * @param dictTypeId 
	 * @param showNullItem2 
	 * @param allowInput 
	 * @param valueField 
	 * @param textField 
	 * @param showNullItem 
	 * @param multiselect 
	 *//*
	public static String getComboboxHtml(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width
			, boolean showNullItem, String textField, String valueField, boolean allowInput, String dictTypeId, String nullItemText, String url, String data,String dataField, boolean multiselect){
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onvaluechanged=\""+ baseName+"_valueChange\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String isValidationFunName = isValidation==true?" onvalidation=\""+ baseName+"_validation\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String vtypeHtml =  vtype!=null? " vtype=\""+vtype+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		String isDisabledHtml = isDisabled?" enabled=\"false\"":"";
		String showNullItemHtml = showNullItem==true?" showNullItem=\"true\"":"";
		String textFieldHtml = textField!=null?" textField=\""+textField+"\"":"";
		String valueFieldHtml = valueField!=null?" valueField=\""+valueField+"\"":"";
		String allowInputHtml = allowInput==true?" allowInput=\"true\"":"";
		//String dictTypeIdHtml = dictTypeId!=null?" dictTypeId=\""+dictTypeId+"\"":"";
		
		// 修复dict下拉的查询条件选择问题 begin
		String dictTypeIdHtml = "";
		if (classType.equals(SysCardFormBeansUtil.CARD_FORM_COMBO_BOX) && StringUtil.isNotNullAndBlank(dictTypeId)) {
			dictTypeIdHtml = " url=\"com.primeton.components.nui.DictLoader.getDictData.biz.ext?dictTypeId=" + dictTypeId + "\"";
		} else {
			dictTypeIdHtml = dictTypeId!=null?" dictTypeId=\""+dictTypeId+"\"":"";
		}
		// 修复dict下拉的查询条件选择问题 end
		
		String nullItemTextHtml = nullItemText!=null?" nullItemText=\""+nullItemText+"\"":"";
		String urlHtml = url!=null?" url=\""+url+"\"":"";
		String dataHtml = data!=null?" data=\""+data+"\"":"";
		String dataFieldHtml = dataField!=null?" dataField=\""+dataField+"\"":"";
		String multiselectHtml = multiselect==true?" multiSelect=\"true\"":"";
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "\"";
		
		String tb = "<input id=\"" + id + "\" name=\"" + name + "\" class=\""
				+ classType + "\"" + emptyTextHtml + vtypeHtml
				+ valueChangeFunName + valueClickFunName + requiredHtml
				+ isValidationFunName + isDisabledHtml + styleHtml
				+ showNullItemHtml + textFieldHtml + valueFieldHtml
				+ allowInputHtml + dictTypeIdHtml + nullItemTextHtml + urlHtml
				+ dataHtml + dataFieldHtml + multiselectHtml + "/>";
		
		return tb;
	}
	
	*//**
	 *combox区间查询代码
	 * @param data 
	 * @param url 
	 * @param nullItemText 
	 * @param dictTypeId 
	 * @param showNullItem2 
	 * @param allowInput 
	 * @param valueField 
	 * @param textField 
	 * @param showNullItem 
	 * @param multiselect 
	 *//*
	public static String getTextBoxHtmlIntervais(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width
			, boolean showNullItem, String textField, String valueField, boolean allowInput, String dictTypeId, String nullItemText, String url, String data,String dataField, boolean multiselect){
		
		String res1 = getComboboxHtml( classType ,"_INTERVAIL_MIN_"+id, "_INTERVAIL_MIN_"+name, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width
				,  showNullItem,  textField,  valueField,  allowInput,  dictTypeId,  nullItemText,  url,  data, dataField,  multiselect);
		String res2 =  getComboboxHtml( classType ,  "_INTERVAIL_MAX_"+id, "_INTERVAIL_MAX_"+name, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width
				,  showNullItem,  textField,  valueField,  allowInput,  dictTypeId,  nullItemText,  url,  data, dataField,  multiselect);
		
		return res1+"至"+res2;
	}
	
	*//**
	 * 获取普通表单单选框组html代码
	 * @param classType
	 * @param id
	 * @param name
	 * @param vtype
	 * @param emptyText
	 * @param isRequired
	 * @param isValueChange
	 * @param isClick
	 * @param isValidation
	 * @param isDisabled
	 * @param entityName
	 * @param width
	 * @param repeatItems
	 * @param textField
	 * @param valueField
	 * @param repeatdirection
	 * @param dictTypeId
	 * @param repeatLayout
	 * @param url
	 * @param data
	 * @param dataField
	 * @return
	 *//*
	public static String getRadiolistHtml(String classType, String id, String name, String vtype, String emptyText, boolean isRequired, boolean isValueChange, boolean isClick, boolean isValidation, boolean isDisabled, String entityName,
			String width, String repeatItems, String textField, String valueField, String repeatdirection, String dictTypeId, String repeatLayout, String url, String data, String dataField) {
		// TODO 自动生成方法存根
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onvaluechanged=\""+ baseName+"_valueChange\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String isValidationFunName = isValidation==true?" onvalidation=\""+ baseName+"_validation\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String vtypeHtml =  vtype!=null? " vtype=\""+vtype+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		String isDisabledHtml = isDisabled?" enabled=\"false\"":"";
		String textFieldHtml = textField!=null?" textField=\""+textField+"\"":"";
		String valueFieldHtml = valueField!=null?" valueField=\""+valueField+"\"":"";
		String dictTypeIdHtml = dictTypeId!=null?" dictTypeId=\""+dictTypeId+"\"":"";
		String urlHtml = url!=null?" url=\""+url+"\"":"";
		String dataHtml = data!=null?" data=\""+data+"\"":"";
		String dataFieldHtml = dataField!=null?" dataField=\""+dataField+"\"":"";
		String repeatItemsHtml = repeatItems!=null?" repeatItems=\""+repeatItems+"\"":"";
		String repeatdirectionHtml = repeatdirection!=null?" repeatDirection=\""+repeatdirection+"\"":"";
		String repeatLayoutHtml = repeatLayout!=null?" repeatLayout=\""+repeatLayout+"\"":"";
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "\"";
		
		String tb = "<input id=\"" + id + "\" name=\"" + name + "\" class=\""
				+ classType + "\"" + emptyTextHtml + vtypeHtml
				+ valueChangeFunName + valueClickFunName + requiredHtml
				+ isValidationFunName + isDisabledHtml + styleHtml
				+ repeatItemsHtml + textFieldHtml + valueFieldHtml
				+ repeatdirectionHtml + dictTypeIdHtml + repeatLayoutHtml
				+ urlHtml + dataHtml + dataFieldHtml + "/>";
		
		return tb;
	}
	
	*//**
	 *获取普通卡片textbox控件的html代码
	 * @param isDrawdate 
	 * @param showtodaybutton 
	 * @param allowinput 
	 * @param showclearbutton 
	 * @param showokbutton 
	 * @param showtime 
	 * @param timeformat 
	 * @param format 
	 *//*
	public static String getDatepickerHtml(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String format, String timeformat, boolean showtime, boolean showokbutton, boolean showclearbutton, boolean allowinput, boolean showtodaybutton, boolean isDrawdate){
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onvaluechanged=\""+ baseName+"_valueChange\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String isDrawdateFunName = isDrawdate==true?" ondrawdate=\""+ baseName+"_drawdate\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String formatHtml =  format!=null? " format=\""+format+"\" valueformat=\""+format+"\" ":" format=\"yyyy-MM-dd\" valueformat=\"yyyy-MM-dd\" ";
		String timeFormatHtml =  timeformat!=null? " timeFormat=\""+timeformat+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		String showtimeHtml = showtime?" showTime=\"true\"":"";
		String showokbuttonHtml = showokbutton?" showOkButton=\"true\"":"";
		String showclearbuttonHtml = showclearbutton?" showClearButton=\"true\"":"";
		String showtodaybuttonHtml = showtodaybutton?" showTodayButton=\"true\"":"";
		String allowinputHtml = allowinput?" allowInput=\"false\"":"";
		String enabledHtml =isDisabled? " enabled=\"false\" ":"";
		
		if(SysCardFormBeansUtil.CARD_FORM_MONTHPICKER.equals(classType)){
			emptyTextHtml =  "";
			showtimeHtml = "";
			showokbuttonHtml = "";
			showclearbuttonHtml = "";
			showtodaybuttonHtml = "";
			allowinputHtml = "";
			enabledHtml =isDisabled? " enabled=\"false\" ":"";
		}
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "\"";
		
		String tb = "<input id=\"" + id + "\" name=\"" + name + "\" class=\""
				+ classType + "\"" + emptyTextHtml + valueChangeFunName
				+ valueClickFunName + requiredHtml + styleHtml
				+ isDrawdateFunName + formatHtml + timeFormatHtml
				+ showtimeHtml + showokbuttonHtml + showclearbuttonHtml
				+ showtodaybuttonHtml + allowinputHtml
				+ enabledHtml + "/>";
		
		return tb;
	}
	
	*//**
	 *datepicker区间查询
	 * @param isDrawdate 
	 * @param showtodaybutton 
	 * @param allowinput 
	 * @param showclearbutton 
	 * @param showokbutton 
	 * @param showtime 
	 * @param timeformat 
	 * @param format 
	 *//*
	public static String getDatepickerHtmlIntervais(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String format, String timeformat, boolean showtime, boolean showokbutton, boolean showclearbutton, boolean allowinput, boolean showtodaybutton, boolean isDrawdate){
		String res1 = getDatepickerHtml( classType ,  "_INTERVAIL_MIN_"+id, "_INTERVAIL_MIN_"+name, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width,
				 format,  timeformat,  showtime,  showokbutton,  showclearbutton,  allowinput,  showtodaybutton,  isDrawdate);
		String res2 = getDatepickerHtml( classType ,  "_INTERVAIL_MAX_"+id, "_INTERVAIL_MAX_"+name, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width,
				 format,  timeformat,  showtime,  showokbutton,  showclearbutton,  allowinput,  showtodaybutton,  isDrawdate);
		return res1+"至"+res2;
	}
	

	*//**
	 *获取普通卡片checkbox控件的html代码
	 * @param isDrawdate 
	 * @param showtodaybutton 
	 * @param allowinput 
	 * @param showclearbutton 
	 * @param showokbutton 
	 * @param showtime 
	 * @param timeformat 
	 * @param format 
	 *//*
	public static String getCheckboxHtml(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String showName){
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onvaluechanged=\""+ baseName+"_valueChange\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String showNameHtml =  showName!=null? " text=\""+showName+"\" ":" text:\"null\"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "\"";
		
		String tb = "<input id=\"" + id + "\" name=\"" + name
				+ "\" trueValue=\"1\" falseValue=\"0\" class=\"" + classType
				+ "\"" + emptyTextHtml + valueChangeFunName + valueClickFunName
				+ requiredHtml + styleHtml + showNameHtml + "/>";
		
		return tb;
	}

	
	*//**
	 获取普通卡片lookup控件的html代码
	 * @param classType
	 * @param jsId
	 * @param fieldName
	 * @param vtype
	 * @param emptyText
	 * @param isRequired
	 * @param isValueChange
	 * @param isOnclick
	 * @param isValidation
	 * @param isDisable
	 * @param entityName
	 * @param formColumnWidth
	 * @param buttonClickName 
	 * @return
	 *//*
	public static String getLookupHtml(String classType, String jsId, String fieldName, String vtype, String emptyText, 
			boolean isRequired, boolean isValueChange, boolean isOnclick, boolean isValidation, boolean isDisable, String entityName, String formColumnWidth, String buttonClickName) {
		// TODO 自动生成方法存根
		String baseName = jsId.replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onvaluechanged=\""+ baseName+"_valueChange\"":"";
		String valueClickFunName=isOnclick==true?" onclick=\""+baseName+"_click\"":"";
		String isValidationFunName = isValidation==true?" onvalidation=\""+ baseName+"_validation\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String vtypeHtml =  vtype!=null? " vtype=\""+vtype+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		String isDisabledHtml = isDisable?" enabled=\"false\"":"";
		String buttonclickHtml = "  onbuttonclick=\""+buttonClickName  +"\"";
		
		String widthHtml = formColumnWidth != null ? "width:" + formColumnWidth + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "\"";
		
		String tb = "<input id=\"" + jsId + "\" name=\"" + fieldName
				+ "\" class=\"" + classType + "\"" + emptyTextHtml + vtypeHtml
				+ valueChangeFunName + valueClickFunName + requiredHtml
				+ isValidationFunName + isDisabledHtml + styleHtml
				+ buttonclickHtml + "/>";
		
		return tb;
	}
	
	
	
	*//**
	 *获取datagrid中textbox控件的html代码
	 *//*
	public static String getDatagridTextbox(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation){
		String baseName = name.replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onvaluechanged=\""+ baseName+"_valueChange\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String isValidationFunName = isValidation==true?" onvalidation=\""+ baseName+"_validation\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String vtypeHtml =  vtype!=null? " vtype=\""+vtype+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		
		String tb = "            <input property=\"editor\" class=\""
				+ classType + "\"" + emptyTextHtml + vtypeHtml
				+ valueChangeFunName + valueClickFunName + requiredHtml
				+ isValidationFunName + " style=\"width:100%;\"/>\n";
		
		return tb;
	}
	
	*//**
	 * 获取StringBuffer数组
	 * 角标(普通表单) 
	 * 		0 html 
	 * 	    1 数据初始化js
	 * 		2 click js
	 * 	    3 onvaluechange js
	 * 		4 自定义校验js
	 * @return
	 *//*
	public static StringBuffer[] getSbs(){
		StringBuffer[] sbs = new StringBuffer[HTML_SILZE];
		for(int i=0; i<sbs.length; i++){
			sbs[i] = new StringBuffer();
		}
		return sbs;
	}
	
	*//**
	 * 获取TABLE的td元素
	 * @param align
	 * @return
	 *//*
	public static String getTdHtml(String align,String heigth,String width,String style,int colspan){
		if(heigth!=null){
			heigth = " height=\""+heigth+"\" ";
		}else {
			heigth = "";
		}
		if(align!=null){
			align = " align=\""+align+"\" ";
		}else {
			align = "";
		}
		if(width!=null&&!"0".equals(width)){
			width = " width=\""+width+"\" ";
		}else {
			width = "";
		}
		if(style!=null){
			style = " height=\""+style+"\" ";
		}else {
			style = "";
		}
		String colspanStr ="";
		if(colspan>1){
			colspanStr = " colspan=\""+(colspan*2-1)+"\"";
		}
		
		return "<td style=\"padding-left:10px;\" "+width+heigth+align+style+colspanStr+" >";
	}
	
	public static String setValueJs(String ColumnId,String value){
		return "nui.get('"+ColumnId+"').setValue('"+value+"')";
	}
	

	
	*//**
	 * 格式化js所需要的空格
	 * @param length
	 * @return
	 */
	public static String getNbsp(int length){
		String temp = "";
		for(int i=0; i<length; i++){
			temp+="	";
		}
		return temp;
	}
	
	/**
	 * form表单  按钮区开始div
	 * @return
	 *//*
	public static String getButtonDivStart(){
		return "<div id=\"toolBar\" class=\"nui-toolbar\" style=\"text-align:center;padding-top:5px;padding-bottom:5px;\"  borderStyle=\"border:0;\">\n";
	}
	
	public static String getButtonHtml(String btnCode,String btnName,String icon,String iconSelf,String btnWidth,String btnStyle,String formCode, String type, String enabled){
		icon = iconSelf==null?icon:iconSelf;
		icon=icon==null||"".equals(icon)?"":" iconCls=\""+icon+"\""; 
		btnWidth=btnWidth==null||"".equals(btnWidth)?"":" width=\""+btnWidth+"\"";
		btnStyle=btnStyle==null||"".equals(btnStyle)?"":" style=\""+btnStyle+"\"";
		String clickFunName = btnCode+formCode+"_click()";
		if("close".equals(type)) {
			clickFunName = "CloseWindow('cancel')";
		}
		//String temp =getNbsp(2)+ "<a class=\"nui-button\"  "+icon+btnWidth+btnStyle+enabled+"  onclick=\""+clickFunName+"\">"+btnName+"</a>\n";
		String temp =getNbsp(2)+ "<a  class=\"nui-button\"  "+btnWidth+btnStyle+enabled+" id=\""+btnCode+formCode+"\"  onclick=\""+clickFunName+"\">"+btnName+"</a>\n";
		return temp;
	}
	
	*//**
	 * 获取卡片式表单 保存按钮 的click方法的 default处理方法
	 * @param str10 
	 * @param hzsql 
	 * @return
	 *//*
	public static String getCardFormSaveJs(String funName,String successType, String str10,long buttonId,
			String pkJsId,String pkColumnName, SysFormGeneralExecSql hzsql ,SysFormconfig form,HttpServletRequest request){
		String st = "";
		str10=str10==null?"":str10;
		if("2".equals(successType)){
			st = "CloseWindow('ok')"+SysCardFormBeansUtil.NEW_LINE;
		}
		if("3".equals(successType)){
			st = "window.close()"+SysCardFormBeansUtil.NEW_LINE;
		}
		if("4".equals(successType)){
			st = "_initData(recode[0])"+SysCardFormBeansUtil.NEW_LINE;
		}
		List<String[]> params = hzsql.getParams();
		String paramjs = SysFormGeneralExecSql.getCardParamsJsStr(params, form, request, false);
		st += SysCardFormBeansUtil.getNbsp(6)+"if(window.parent._loadmstmaindata){"+SysCardFormBeansUtil.NEW_LINE;
		st += SysCardFormBeansUtil.getNbsp(7)+"window.parent._loadmstmaindata()"+SysCardFormBeansUtil.NEW_LINE;
		st += SysCardFormBeansUtil.getNbsp(6)+"}"+SysCardFormBeansUtil.NEW_LINE;
		String temp = getNbsp(1)+"function "+funName+"(){" +NEW_LINE_ONLY+str10+
				getNbsp(2)+"var _form = new nui.Form(\"#form1\");" +NEW_LINE_ONLY+
				getNbsp(2)+paramjs+NEW_LINE_ONLY+
				getNbsp(2)+"_form.validate();" +NEW_LINE_ONLY+
				getNbsp(2)+"if (_form.isValid() == false) return;" +NEW_LINE_ONLY+
				getNbsp(2)+"var _data = _form.getData()" +NEW_LINE+
				getNbsp(2)+"var _param = {param:_data,paramsMap:paramsMap}" +NEW_LINE+
				getNbsp(2)+"_param.formId=_formId"+NEW_LINE+
				getNbsp(2)+"_param.buttonId="+buttonId+NEW_LINE+
				getNbsp(2)+"dcf.mask()"+NEW_LINE+
				
				getNbsp(2)+"$.ajax({" +NEW_LINE_ONLY+
				getNbsp(3)+"url:'"+CARD_FORM_SAVE_BUTTON_DEFAULT_URL+"'," +NEW_LINE_ONLY+
				getNbsp(3)+"type:'post'," +NEW_LINE_ONLY+
				getNbsp(3)+"data: nui.encode(_param)," +NEW_LINE_ONLY+
				getNbsp(3)+"cache: false," +NEW_LINE_ONLY+
				getNbsp(3)+"contentType: 'text/json'," +NEW_LINE_ONLY+
				getNbsp(3)+"success: function (text) {" +NEW_LINE_ONLY+
				getNbsp(2)+"dcf.unmask()"+NEW_LINE+
				getNbsp(4)+"if(text.recode.length==0){" +NEW_LINE_ONLY+
				getNbsp(5)+"nui.alert(\"保存失败！\")" +NEW_LINE+
				getNbsp(4)+"}else if(text.recode[0]=='error'){" +NEW_LINE_ONLY+
				getNbsp(5)+"nui.alert(text.recode[1],'提示', function() {})" +NEW_LINE+
				getNbsp(4)+"}else {" +NEW_LINE_ONLY+
				getNbsp(5)+"nui.get('"+pkJsId+"').setValue(text.recode[1])" +NEW_LINE+
				getNbsp(5)+"if(\"undefined\" != typeof mstTab_activechanged ){" +NEW_LINE_ONLY+
				getNbsp(6)+"mstTab_activechanged();" +NEW_LINE_ONLY+
				getNbsp(5)+"}" +NEW_LINE_ONLY+
				getNbsp(5)+"nui.alert('操作成功', '提示', function() { " +NEW_LINE+
				getNbsp(6)+st+NEW_LINE_ONLY+
				getNbsp(5)+"});"+NEW_LINE_ONLY+
				getNbsp(4)+"}" +NEW_LINE_ONLY+
				getNbsp(3)+"}," +NEW_LINE_ONLY+
				getNbsp(3)+"error: function (jqXHR, textStatus, errorThrown) {" +NEW_LINE_ONLY+
				getNbsp(3)+"}" +NEW_LINE_ONLY+
				getNbsp(2)+"});" +NEW_LINE_ONLY+
				getNbsp(1)+"}\n";
		return temp;
		
	}
	
	
	public static String getFormIdJs(String formId){
		return getNbsp(1)+"var _formId='"+formId+"'";
	}
	
	*//**
	 * 获卡片表单初始化函数
	 * @param request
	 * @param form
	 * @return
	 */
	/*public static String getCardFormInitFunction(HttpServletRequest request,SysFormconfig form,StringBuffer[] sbs){
		String funstr ="";
		List<SysFormWhere> wheres = form.getWheres();
		String whereObj = getParamStringJson(wheres,request);
		String str11 = sbs[11].toString(); //u富文本回填js段
		String lookupFun = form.getContainLookup()==true?getNbsp(5)+"var _lookupData=text.datas[0]"+NEW_LINE+getNbsp(5)+LOOKUP_BACK_FUN_NAME+NEW_LINE:"";
		funstr =getNbsp(1)+"function _initData(pkId){"+NEW_LINE_ONLY+
				getNbsp(2)+"var _param = {}"+NEW_LINE+
				getNbsp(2)+"if(pkId){"+NEW_LINE_ONLY+
				getNbsp(3)+"_param = {pkId:pkId,formId:_formId}" +NEW_LINE+
				getNbsp(2)+"}else {"+NEW_LINE_ONLY+
				getNbsp(3)+"_param = {requestParam:"+whereObj+",pkId:pkId,formId:_formId}" +NEW_LINE+
				getNbsp(2)+"}"+NEW_LINE_ONLY+
				getNbsp(2)+"var _form = new nui.Form(\"#form1\")"+NEW_LINE+
				getNbsp(2)+"$.ajax({" +NEW_LINE_ONLY+
				getNbsp(3)+"url:'"+CARD_FORM_INIT_DATA_URL+"'," +NEW_LINE_ONLY+
				getNbsp(3)+"type:'post'," +NEW_LINE_ONLY+
				getNbsp(3)+"data: nui.encode(_param)," +NEW_LINE_ONLY+
				getNbsp(3)+"cache: false," +NEW_LINE_ONLY+
				getNbsp(3)+"contentType: 'text/json'," + NEW_LINE_ONLY +
				getNbsp(3)+"success: function (text) {" + NEW_LINE_ONLY +
				getNbsp(4)+"if(text.datas&&text.datas.length>0){" + NEW_LINE_ONLY +
				getNbsp(5) + "_form.setData(text.datas[0])" + NEW_LINE + lookupFun + str11 +sbs[14]+
			
				getNbsp(5) + sbs[15] +
				
				//	getNbsp(5) + sbs[14]==null?"":sbs[14].toString() + NEW_LINE  +
				getNbsp(5) + "if(\"undefined\" != typeof mstTab_activechanged ){"+NEW_LINE_ONLY+
				getNbsp(6) + "mstTab_activechanged();}" + NEW_LINE_ONLY +
				getNbsp(4) + "} else {" + NEW_LINE_ONLY	+
				getNbsp(5)+"_initAfter()" +NEW_LINE+
				getNbsp(4)+"}" +NEW_LINE_ONLY+
				getNbsp(3)+"}," +NEW_LINE_ONLY+
				getNbsp(3)+"error: function (jqXHR, textStatus, errorThrown) {" +NEW_LINE_ONLY+
				getNbsp(3)+"}" +NEW_LINE_ONLY+
				getNbsp(2)+"});" +NEW_LINE_ONLY+
				getNbsp(1)+"}"+NEW_LINE_ONLY;
		return funstr;
	}*/
	
	public static String getEmptyTd(int colspan){
		String res = SysCardFormBeansUtil.getNbsp(3)+"<td colspan=\""+colspan+"\">&nbsp;</td>";
		return res;
		
	}
	
	/**
	 * 生成最终的值 把参数里面值直接获取生成json串
	 *//*
	public static String getParamStringJson(List<SysFormWhere> wheres ,HttpServletRequest request){
		String whereObj = "";
		for(SysFormWhere where:wheres){
			String temp ="";
			if("parameter".equals(where.getFormWhereValueType())){
				String _value = request.getParameter(where.getFormWhereValue());
				if(_value==null){
					temp += ""+where.getFormWhereValue()+":"+"null"+",";
				}else {
					temp += ""+where.getFormWhereValue()+":"+"'"+_value+"',";
				}
				
			}
			whereObj+=temp;
		}
		//判断固定流程发过来的参数 _workflowBusPrimaryKeyParamName
		String _workflowBusPrimaryKeyParamName = (String)request.getAttribute("_workflowBusPrimaryKeyParamName");
		if(_workflowBusPrimaryKeyParamName!=null&&!_workflowBusPrimaryKeyParamName.equals("")&&!"null".equals(_workflowBusPrimaryKeyParamName)){
			whereObj += "_workflowBusPrimaryKeyParamName:"+_workflowBusPrimaryKeyParamName+",";
		}
		
		if(!"".equals(whereObj)){
			whereObj = whereObj.substring(0,whereObj.length()-1);
			whereObj = "{"+whereObj+"}";
			//var _form = new nui.Form("#form1");
		}else {
			whereObj = "{}";
		}
		return whereObj;
	}
	
	*//**
	 * 用jsp方式生成参数集。
	 *//*
	public static String getParamJspJson(List<SysFormWhere> wheres ,HttpServletRequest request){
		String whereObj = "{}";
		for(SysFormWhere where:wheres){
			String temp ="";
			if("parameter".equals(where.getFormWhereValueType())){
				//String _value = request.getParameter( where.getFormWhereValue());
				//if(_value==null){
					//temp += ""+where.getFormWhereValue()+":"+"null"+",";
				//}else {
					temp += ""+where.getFormWhereValue()+":"+"'<%=request.getParameter(\""+where.getFormWhereValue()+"\")',";
				//}
			}
			whereObj+=temp;
		}
		if(!"{}".equals(whereObj)){
			whereObj = whereObj.substring(0,whereObj.length()-1);
			whereObj = "{"+whereObj+"}";
			//var _form = new nui.Form("#form1");
		}
		return whereObj;
	}
	
	*//**
	 *生成  普通表单保存按钮的自定url保存方法。
	 * @param string
	 * @param buttonSaveUrl
	 * @param buttonSaveSuccessDeal
	 * @return
	 *//*
	public static String getCardFormUrlSaveJs(String string, String buttonSaveUrl, String buttonSaveSuccessDeal) {
		// TODO 自动生成方法存根
		return null;
	}
	
	*//**
	 *生成  普通表单保存按钮的自定url保存方法。
	 * @param string
	 * @param buttonSaveUrl
	 * @param buttonSaveSuccessDeal
	 * @return
	 *//*
	public static String getCardFormFunSaveJs(String funName, String js) {
		// TODO 自动生成方法存根
		
		String temp = getNbsp(1)+"function "+funName+"(){" +NEW_LINE_ONLY+js+NEW_LINE_ONLY+
				getNbsp(1)+"}\n";
		return temp;
		
	}
	
	*//**
	 * 判断某个字段是否在权限集合内
	 * @param objs
	 * @param fieldId
	 * @return
	 *//*
	public static boolean hasButtons(DataObject[] objs,String buttonId, String isView){
		boolean isHas = false;
		if (!"true".equals(isView)) {
			if (objs != null && objs.length > 0) {
				for(int i=0; i<objs.length; i++){
					String buttonIdTemp = objs[i].getString("buttonId");
					if(buttonId.equals(buttonIdTemp)){
						return true;
					}
				}
			}
		} else {
			isHas = true;
		}
		
		return isHas;
	}
	
	*//**
	 * 判断某个按钮是否有权限
	 * @param objs
	 * @param fieldId
	 * @return
	 *//*
	public static boolean hasFiled(DataObject[] objs, String columnId, String isView,String formAuthorityIsControl){
		boolean isHas = false;
		
		boolean isControl = "Y".equals(formAuthorityIsControl);
		if(isControl ==false){
			if (!"true".equals(isView) ) {
				if (objs != null && objs.length > 0) {
					for (int i = 0; i < objs.length; i++) {
						String columnIdTemp = objs[i].getString("formColumnId");
						if(columnId.equals(columnIdTemp)){
							isHas = true;
							break;
						}
					}
				}
			} else {
				isHas = true;
			}
		}else{
			isHas = true;
		}
		
		return isHas;
	}
	
	
	
	public static String[] getLookupOpenJs(HttpServletRequest requst ,String title,String width,String height,String winType,String formurl,String formId,String jsId,String otherColumnJsId,
			String backType,String backValue,String fieldName,String otherField,String showProperty,String valueProperty,boolean isGridQuery,
			Map<String, List<SysGeneralParam>> params, HttpServletRequest request,SysFormconfig form,String lookupCustomDataback,
			String lookupCustomDatabackFun,SysFormGeneralExecSql backsql, long columnId){
		String realUrl = "";
		String paramtt="";
		String [] results = new String[3];
			
		if("1".equals(winType)){
			realUrl = requst.getContextPath()+"/"+LOOKUP_FORM_URL+"?formId="+formId;
		}else {
			realUrl = requst.getContextPath()+"/"+formurl;
		}
		if(params!=null){
			String endtype = FormParamConstants.COLUMN_LOOKUP_OPENPAGE;
			List<SysGeneralParam>  l = params.get(endtype);			
						
			String paramStr = SysCardFormColumnUtil.getGeneralParamStr(l,request);
		    if(l!=null){
				for(int i=0;i<l.size();i++){
					if("card".equals(l.get(i).getParamFromType())){
						String cid = form.serchColumnByColumnName(l.get(i).getParamFromTypeValue()).getJsId("id");
						if(columnId == -1) { //代表从参数查询调用
							cid = jsId;
						}
						paramtt+=getNbsp(2)+"var param_"+l.get(i).getParamFromTypeValue()+"=nui.get('"+cid+"').getValue();\n";
						
					}
						
				}
		    }
			
			
			if(paramStr!=null&&!"".equals(paramStr)){
				if(realUrl!=null&&realUrl.indexOf("?")>0){
					realUrl = realUrl +"&" +paramStr;
				}else {
					realUrl = realUrl+"?"+paramStr;
				}
			}
		}
		String backValueJs = "";
		String onloadJs = "";
		String backSqljs = "";
		String backSqljsFunname= "";
		
		if("self".equals(backType)||"other".equals(backType)){
			boolean flag = false;
			if(otherField==null){
				otherField = fieldName;
				flag = true;
			}
			if(isGridQuery&&columnId!=-1){ //查询条件时候控件生成方式
				jsId = "FILTER_"+jsId;
				backValueJs += SysCardFormBeansUtil.getNbsp(6)+"nui.get('"+jsId+"').setValue(id);"+SysCardFormBeansUtil.NEW_LINE_ONLY;
				backValueJs += SysCardFormBeansUtil.getNbsp(6)+"nui.get('"+jsId+"').setText(text);"+SysCardFormBeansUtil.NEW_LINE_ONLY;
				onloadJs+=getNbsp(4)+"var lookupId = nui.get('"+jsId+"').getValue();\n";

				onloadJs+=getNbsp(4)+"var lookupText = nui.get('"+jsId+"').getText();\n";
			}else {
				backValueJs += !flag?SysCardFormBeansUtil.getNbsp(6)+"nui.get('"+otherColumnJsId+"').setValue(text);"+SysCardFormBeansUtil.NEW_LINE_ONLY
						+SysCardFormBeansUtil.getNbsp(6)+"nui.get('"+jsId+"').setText(text);"
						:SysCardFormBeansUtil.getNbsp(6)+"nui.get('"+jsId+"').setText(text);";
				//		backValueJs += SysCardFormBeansUtil.getNbsp(6)+"_setLookupText({valueProperty:id});"+SysCardFormBeansUtil.NEW_LINE_ONLY;
//						onloadJs+=SysCardFormBeansUtil.getNbsp(5)+"var lookuptext =row."+otherField+SysCardFormBeansUtil.NEW_LINE;
			//			onloadJs+=getNbsp(4)+"alert(11);\n";
				onloadJs+=getNbsp(4)+"var lookupId = nui.get('"+jsId+"').getValue();\n";
				onloadJs+=getNbsp(4)+"var lookupText = nui.get('"+jsId+"').getText();\n";
			}
		}else if("biz".equals(backType)){
			if(isGridQuery){ //查询条件时候控件生成方式
				jsId = "FILTER_"+jsId;
				backValueJs += SysCardFormBeansUtil.getNbsp(6)+"nui.get('"+jsId+"').setText(text);"+SysCardFormBeansUtil.NEW_LINE_ONLY;
				onloadJs+=getNbsp(4)+"var lookupId = nui.get('"+jsId+"').getValue();\n";
				onloadJs+=getNbsp(4)+"var lookupText = nui.get('"+jsId+"').getText();\n";
			}else {
				backValueJs += SysCardFormBeansUtil.getNbsp(6)+"nui.get('"+jsId+"').setText(text);"+SysCardFormBeansUtil.NEW_LINE_ONLY;
				onloadJs+=getNbsp(4)+"var lookupId = nui.get('"+jsId+"').getValue();\n";
				onloadJs+=getNbsp(4)+"var lookupText = nui.get('"+jsId+"').getText();\n";
				//
			}
		} else if ("sql".equals(backType)) {
			
			
			List<String[]> params1 = backsql.getParams();
			String jsParams = new String("var paramsMap = {");
			
			for(String[] param : params1){
				if("c".equals(param[0])){
					String str = param[1].substring(param[1].indexOf("_")+1);
					SysFormColumn sfc = form.serchColumnByColumnId(Long.parseLong(str));
					String str1 = sfc.getJsId("id");
					
					String str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + "nui.get('" + str1 +"').getValue(),\n" ;
					jsParams += str3;
				} else if("s".equals(param[0])){
					String str = param[1];
					String str1 = SysCardFormColumnUtil.getDefaultValue(request,"session",str);
					if(str1!=null){
						String str2 = SysCardFormBeansUtil.getNbsp(2) + "'s_" + param[1] + "' : '" + str1 + "',\n";
						jsParams += str2;
					}
				} else if("r".equals(param[0])){
					String str = param[1];
					String str1 = SysCardFormColumnUtil.getDefaultValue(request,"request",str);
					if(str1!=null){
						String str2 = SysCardFormBeansUtil.getNbsp(2) + "'r_" + param[1] + "' : '" + str1 + "',\n";
						jsParams += str2;
					}
				}
			}
			if(jsParams.endsWith(",\n")){
				jsParams = jsParams.substring(0,jsParams.length()-2);
			}
			jsParams += "};\n";
			
			String funName = fieldName+"_"+form.getFormDefCode();
			backSqljsFunname = funName+"_lookup();"+ SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(2) + "function "+funName+"_lookup(){\n";
			backSqljs += getNbsp(2) + jsParams;
			backSqljs += getNbsp(3) +   "var data = {" + SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(3) +		"'formId' : _formId," + SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(3) +		"'columnId' : "+columnId+"," + SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(3) +		"'execSqlRelaid' : "+backsql.getExecSqlRelaid()+"," + SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(3) +		"'params' : paramsMap" + SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(3) +     "};" +   SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(3) + "$.ajax({"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "url: \"com.dcf.form.runtime.exexSqlForNameComp.execSqlForColumnName.biz.ext\","+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "type: 'POST',"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "data: nui.encode(data),"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "cache: false,"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "contentType: 'text/json',"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "success: function(text) {"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(5) + "if (text.datas[0] == '000000') {"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			
			backSqljs += getNbsp(6) + "nui.get('"+jsId+"').setText(text.datas[1]);"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			
			backSqljs += getNbsp(5) + "}"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "},"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "error: function(jqXHR, textStatus, errorThrown) {"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(4) + "}"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(3) + "});"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			backSqljs += getNbsp(1) + "}\n";
			
			backValueJs += SysCardFormBeansUtil.getNbsp(6)+"nui.get('"+jsId+"').setText(text);"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		}
		 
		
		
		String temp = "";
		temp+= paramtt;
		temp+=getNbsp(2)+"nui.open({\n";

		if (realUrl.indexOf("encodeURI") < 0) {
			realUrl = "encodeURI(\"" + realUrl + "\")";
		}
		
		temp+=getNbsp(3)+"url:" + realUrl + ",\n"; //showMaxButton: false,
		temp+=getNbsp(3)+"showMaxButton: true,\n";
		temp+=getNbsp(3)+"title:\""+title+"\" ,\n";
		temp+=getNbsp(3)+"width:\""+width+"\" ,\n";
		temp+=getNbsp(3)+"height:\""+height+"\" ,\n";
		temp+=getNbsp(3)+"onload:function(){ \n"+onloadJs;
		temp+=getNbsp(4)+"var _data = {"+valueProperty+":lookupId,"+showProperty+":lookupText};\n";
		temp+=getNbsp(4)+"var iframe = this.getIFrameEl();\n";
		
	//	temp+=getNbsp(4)+"iframe.contentWindow.SetData(_data);\n";
		temp+=getNbsp(3)+"},\n";
		
		temp+=getNbsp(3)+"ondestroy: function (action){\n";
		temp+=getNbsp(3)+"if (action == 'ok') {\n";
	
		temp+=getNbsp(5)+"iframe = this.getIFrameEl();\n";
		temp+=getNbsp(5)+"var data = iframe.contentWindow.GetData();\n";
		temp+=getNbsp(5)+"data = nui.clone(data);\n";
		temp+=getNbsp(5)+"if (data) {	\n";
	    // var id = '';
		//var name = '';//循环 ，取值
		temp+=getNbsp(6)+"var arr=nui.decode(data);\n";
		
		temp+=getNbsp(6)+"var id='';\n";
		temp+=getNbsp(6)+"var text='';\n";

		temp+=getNbsp(6)+"for(var i=0;i<arr.length;i++){ \n";
		
		temp+=getNbsp(7)+"if(i==arr.length-1) { \n";
		temp+=getNbsp(8)+" id += arr[i]."+valueProperty+";\n";
		temp+=getNbsp(8)+" text += arr[i]."+showProperty+";\n";

		temp+=getNbsp(7)+"} else { \n";
		temp+=getNbsp(8)+" id += arr[i]."+valueProperty+"+',';\n";
		temp+=getNbsp(8)+" text += arr[i]."+showProperty+"+',';\n";
	
		temp+=getNbsp(7)+"}\n";
		temp+=getNbsp(6)+"}\n";
		temp+=backValueJs+"\n";


		temp+=getNbsp(6	)+"nui.get('"+jsId+"').setValue(id);\n";
		//temp+=getNbsp(7)+"nui.get('"+jsId+"').setText(text);\n";

		
		if("Y".equals(lookupCustomDataback)){ //自定义回显方案
			temp+=getNbsp(6)+lookupCustomDatabackFun+"\n";
		}
        

		
		
		temp+=getNbsp(5)+"}\n";
		temp+=getNbsp(4)+"}\n";
		temp+=getNbsp(3)+"}\n";
		temp+= getNbsp(2)+" }); \n";
	
		results[0] = temp;
		results[1] = backSqljs;
		results[2] = backSqljsFunname;
		return results;
	}
	
	
	//
	public static String getLookupSetTextAndValueJs(HttpServletRequest requst,String formId,String jsId,String filedName,String backType,String backValue, List<SysGeneralParam> params, String bizFunName) throws Exception{
		String temp = "";
		//temp+=getNbsp(2)+"alert(1321);\n";
		temp+= getNbsp(2)+"nui.get('"+jsId+"').setValue(_lookupData."+filedName+")"+NEW_LINE;
		//temp+=getNbsp(2)+"alert(121);\n";
		if ("self".equals(backType)) { // 数据本字段回填
			temp+= getNbsp(2)+"nui.get('"+jsId+"').setText(_lookupData."+filedName+")"+NEW_LINE;
		} else if ("other".equals(backType)) {   //数据其他字段回填
			//回填值
			//通过字段ID获取当目标字段ID值
			Long columnId = Long.parseLong(backValue);
			SysFormconfig form =  FormCacheManager.getForm(formId);
			SysFormColumn column = form.serchColumnByColumnId(columnId);
			String targColumnHmtlId = "";
			if(column!=null){
				targColumnHmtlId = column.getJsId("id");
			}else {
				throw new Exception("无法在表单:"+formId+" 获取字段Id为:"+backValue+"对象");
			}
			//temp+=getNbsp(2)+"alert(11);\n";
			temp+= getNbsp(2)+"nui.get('"+jsId+"').setText(nui.get('"+targColumnHmtlId+"').getValue())"+NEW_LINE;
		

		} else if ("biz".equals(backType)) { // 自定义逻辑流
			// 拼接参数
			temp += getNbsp(2) + "nui.get('" + jsId + "').setText(" + bizFunName + "(nui.get('" + jsId + "').getValue()))" + NEW_LINE;
			// temp+=getNbsp(2)+"var _param =
			// {lookupid:nui.get('"+jsId+"').getValue()}"+NEW_LINE;
		} else if ("sql".equals(backType)) {

		}
		return temp;
	}

	*//**
	 * @param isAsLabel 
	 *//*
	public static String getUeInitJs(SysFormColumn column, SysRichText richtext,boolean isDisabled, boolean isAsLabel) {
		
		// TODO 自动生成方法存根
		String w = column.getFormColumnWidth();
		String h = column.getFormColumnHeight();
		if(w!=null){
			w = "'"+w+"'";
			if(w.indexOf("px")!=-1){
				w = w.replaceAll("px", "");
			}
		}
		if(h!=null){
			h = "'"+h+"'";
			if(h.indexOf("px")!=-1){
				h = h.replaceAll("px", "");
			}
		}
		String heigthJs =h!=null?getNbsp(3)+"initialFrameHeight:"+h+","+NEW_LINE_ONLY:"";
		String widthJs = w!=null?getNbsp(3)+"initialFrameWidth:"+w +","+NEW_LINE_ONLY:"";
		String disableStr = "";
		if(isDisabled||isAsLabel){
			disableStr+=getNbsp(3)+"toolbars:[],"+NEW_LINE_ONLY;
			disableStr+=getNbsp(3)+"readonly:true,"+NEW_LINE_ONLY;
		}
		String temp  = "";
		temp+=getNbsp(2)+richtext.getRichTextName()+"="+"UE.getEditor('"+richtext.getRichTextName()+"',{"+NEW_LINE_ONLY;
		temp+=heigthJs+widthJs+disableStr;
		temp+=getNbsp(3)+"enableAutoSave:false"+NEW_LINE_ONLY;
		temp+=getNbsp(2)+"});"+NEW_LINE_ONLY;
		return  temp;
	}
	
	*//**
	 * 获取ue控件回填设置数据js
	 * @return
	 *//*
	public static String getUeSetDataJs(String ueVarName,String value){
		if(value==null){
			value = "''"; 
		}else {
			value = "'"+value+"'";
		}
		String temp = "";
		temp+=getNbsp(2)+ueVarName+".addListener( 'ready', function( editor ) {"+NEW_LINE_ONLY;
	    temp+=getNbsp(3)+ueVarName+".setContent("+ value+")"+NEW_LINE;
		temp+=getNbsp(2)+"});"+NEW_LINE_ONLY;
		return temp;
	}

	*//**
	 * ue控件html生成
	 * @param jsId
	 * @param textRichName
	 * @param fieldName
	 * @param entityName
	 * @return
	 *//*
	public static String getRichTextHtml(String jsId, String textRichName, String fieldName, String entityName) {
		// TODO 自动生成方法存根
		// <script id="mailContent"  type="text/plain"></script>
		//增加hidden隐藏域 getTextBoxHtml
		String ueVarName = textRichName;
		String hidenStr = getTextBoxHtml(CARD_FORM_HIDDEN, jsId, fieldName, null,null, null, null, false, false, false, false, false, entityName, null,null);
		//获取ue需要的html片段
		String ueHtml = "<script id=\""+ueVarName+"\"  type=\"text/plain\"></script>";
		return hidenStr+ueHtml;
	}
	
	public static String getInportJs(String src){
		return "<script type=\"text/javascript\" src=\""+src+"\"></script>";
	}

	public static String getUeCheckJs(String ueNameJsStr,String lableName) {
		// TODO 自动生成方法存根
		String checkJs = "";
		checkJs += SysCardFormBeansUtil.getNbsp(2) + "var content_" + ueNameJsStr + " = " + ueNameJsStr + ".getContent()" + SysCardFormBeansUtil.NEW_LINE;
		checkJs += SysCardFormBeansUtil.getNbsp(2) + "if(content_" + ueNameJsStr + "==null||content_" + ueNameJsStr + "==''){" + SysCardFormBeansUtil.NEW_LINE_ONLY;
		checkJs += SysCardFormBeansUtil.getNbsp(3) + "nui.alert('" + lableName + "不能为空')" + SysCardFormBeansUtil.NEW_LINE;
		checkJs += SysCardFormBeansUtil.getNbsp(3) + "return" + SysCardFormBeansUtil.NEW_LINE;
		checkJs += SysCardFormBeansUtil.getNbsp(2) + "}" + SysCardFormBeansUtil.NEW_LINE_ONLY;
		return checkJs;
	}

	*//**
	 * 保存的时候需要把ue的内容设置到表单对应字段的hidden框中
	 * @param ueNameJsStr
	 * @param pkJs
	 * @return
	 *//*
	public static String getSaveJs(String ueNameJsStr,String pkJs) {
		// TODO 自动生成方法存根
		String js  ="";
		js+=SysCardFormBeansUtil.getNbsp(2)+"nui.get('"+pkJs+"').setValue("+ueNameJsStr+".getContent())"+NEW_LINE;
		return js;
	}

	public static String setUeValueFormHidenJs(String ueNameJsStr, String jsId) {
		// TODO 自动生成方法存根
		String js  ="";
		js+=getNbsp(5)+ueNameJsStr+".ready(function() {"+NEW_LINE_ONLY;
		js+=getNbsp(6)+ueNameJsStr+".setContent(nui.get('"+jsId+"').getValue())"+NEW_LINE;
		js+=getNbsp(5)+"});"+NEW_LINE_ONLY;
		return js;
	}

	
	*//**
	 * 获取把nui控件设置label显示 js片段
	 * @param jsId
	 * @return
	 *//*
	public static String getAsLabelJs(String jsId) {
		// TODO 自动生成方法存根
		String js = "";
		js+=getNbsp(2)+"nui.get('"+jsId+"').setReadOnly(true)"+NEW_LINE;
        js+=getNbsp(2)+"nui.get('"+jsId+"').addCls(\"asLabel\")"+NEW_LINE;
        return js;
	}
	
	*//**
	 * 附件上传下载控件初始化代码生成
	 * @param column
	 * @param fileupload
	 * @param isDisable
	 * @param isAsLabel
	 * @return
	 *//*
	public static String getFileUploadInitJs(SysFormColumn column, SysFileupload fileupload, boolean isDisable, boolean isAsLabel) {
		// TODO 自动生成方法存根
		boolean autoUpload = "1".equals(fileupload.getFileuploadAutoUpload())?true:false;
		String uploadJs  = "";
		String disabledjs = "";
		if(isDisable||isAsLabel) {
			disabledjs = getNbsp(3)+"disabled:true,"+NEW_LINE_ONLY;
		}
		String uploadType = fileupload.getUploadType();
		if(uploadType!=null){
			uploadJs = getNbsp(3)+"valid_extensions: [" + uploadType + "]"+NEW_LINE_ONLY;
		}
		long maxcount = fileupload.getFileuploadFileCount();
		if(maxcount>0) {
			maxcount = maxcount+1;
		}
		String temp ="";
		temp+=getNbsp(2)+fileupload.getFileuploadName()+"=new AjaxFileUpload({"+NEW_LINE_ONLY;
		temp+=getNbsp(3)+ "valueTo: '"+column.getFormEntityTablename()+"." + column.getFormFiledTablename()+"',"+NEW_LINE_ONLY;
		temp+=getNbsp(3)+ "renderTo: '"+fileupload.getFileuploadName()+"',"+NEW_LINE_ONLY;
		temp+=getNbsp(3)+ "autoUpload:"+autoUpload+","+NEW_LINE_ONLY;
		temp+=getNbsp(3)+ "title:'',"+NEW_LINE_ONLY+uploadJs+disabledjs;
		//temp+=getNbsp(3)+ "hasCancel:false,"+NEW_LINE_ONLY;
		if(maxcount>0){
			//temp+=getNbsp(3)+ "maxFileCount:"+maxcount+","+NEW_LINE_ONLY;
		}
		//temp+=getNbsp(3)+ "hiddenType:null"+NEW_LINE_ONLY;
		temp+=getNbsp(2)+ "});"+NEW_LINE_ONLY;
		return temp;
	}
	
	*//**
	 * fileupload生成初始化数据js片段
	 * @param fileupladNameJsStr
	 * @param _value
	 * @return
	 *//*
	public static String getFileupladSetDataJs(String fileupladNameJsStr, String _value) {
		// TODO 自动生成方法存根
		if(_value==null){
			_value = "''"; 
		}else {
			_value = "'"+_value+"'";
		}
		String temp = "";
		temp += getNbsp(2) + fileupladNameJsStr + ".setValue(" + _value + ")" + NEW_LINE;
		return temp;
	}

	*//**
	 * 如果附件必须上传，需要在提交的时候校验附件是不是为空
	 * @param fileupladNameJsStr
	 * @param formColumnLable
	 * @return
	 *//*
	public static String getFileupladCheckJs(String fileupladNameJsStr, String formColumnLable) {
		// TODO 自动生成方法存根
		return null;
	}

	public static String getFileupladCheckJs(String fileupladNameJsStr, String formColumnLable, boolean isDisable, boolean isAsLabel) {
		// TODO 自动生成方法存根
		if(isDisable||isDisable){
			return "";
		}
		String checkJs = "";
		checkJs+=SysCardFormBeansUtil.getNbsp(2)+"var content_"+fileupladNameJsStr+" = "+fileupladNameJsStr+".getValue()"+SysCardFormBeansUtil.NEW_LINE;
		checkJs+=SysCardFormBeansUtil.getNbsp(2)+"if(content_"+fileupladNameJsStr+"==null||content_"+fileupladNameJsStr+"==''){"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		checkJs+=SysCardFormBeansUtil.getNbsp(3)+"nui.alert('"+formColumnLable+"不能为空')"+SysCardFormBeansUtil.NEW_LINE;
		checkJs+=SysCardFormBeansUtil.getNbsp(3)+"return"+SysCardFormBeansUtil.NEW_LINE;
		checkJs+=SysCardFormBeansUtil.getNbsp(2)+"}"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		return checkJs;
		
	}

	*//**
	 * 附件保存时把附件上传的id设置到hidden
	 * @param fileupladNameJsStr
	 * @param jsId
	 * @return
	 *//*
	public static String getFileupladSaveJs(String fileupladNameJsStr, String jsId) {
		// TODO 自动生成方法存根
		String js  ="";
		js+=SysCardFormBeansUtil.getNbsp(2)+"nui.get('"+jsId+"').setValue("+fileupladNameJsStr+".getValue())"+NEW_LINE;
		return js;
		
	}

	*//**
	 *附件数据回填至附件上传下载控件
	 * @param fileupladNameJsStr
	 * @param jsId
	 * @return
	 *//*
	public static String setFileuploadValueFormHidenJs(String fileupladNameJsStr, String jsId) {
		// TODO 自动生成方法存根
//		 TODO 自动生成方法存根
		String js  ="";
		js+=getNbsp(6)+fileupladNameJsStr+".setValue(nui.get('"+jsId+"').getValue())"+NEW_LINE;
		return js;
	}

	
	*//**
	 * 生成swfuploadhtml代码
	 * @param jsId
	 * @param fileupload
	 * @param fieldName
	 * @param entityName
	 * @return
	 *//*
	public static String getFileuploadHtml(String jsId, SysFileupload fileupload, String fieldName, String entityName, String width, boolean isDisable) {
		// TODO 自动生成方法存根
		String hidenStr = getTextBoxHtml(CARD_FORM_HIDDEN, jsId, fieldName, null, null,null, null, false, false, false, false, false, entityName, null,null);
		String widthStr =width==null?"":"style=\"width:"+width+";\"" ;
		hidenStr+="<div id=\""+fileupload.getFileuploadName()+"\" "+widthStr+"></div>";
		if(!"1".equals(fileupload.getFileuploadAutoUpload())){
			if (!isDisable == true) {
				hidenStr+="<a  href=\"#\" onclick=\""+fileupload.getFileuploadName()+SysCardFormBeansUtil.SWF_FILEIPLOAD_STARTUPLOAD_FUN_NAME+"()\" >开始上传</a>";
			}
		}
		
		return hidenStr;
	}

	public static String getFileuploadStartUploadJs(String fileuploadName) {
		// TODO 自动生成方法存根
		String temp = "";
		temp+= getNbsp(1)+JAVASCRIPT_FUNCTION+fileuploadName+SWF_FILEIPLOAD_STARTUPLOAD_FUN_NAME+"() {"+NEW_LINE_ONLY;
		temp+=getNbsp(2)+fileuploadName+".startUpload(function () {},function () {nui.alert('上传失败');})"+NEW_LINE;
		temp+=getNbsp(1)+"}";
		return temp;
	}


	
	*//**
	 * 生成grid字段开始代码
	 * @param c
	 * @return
	 *//*
	public static String getGridColumnStart(SysFormColumn c) {
		// TODO 自动生成方法存根
		String temp = " <div field=\""+c.getJsId("name")+"\" width=\"120\">"+c.getFormColumnLable()+"</div>";
		return temp;
		
	}
	
	*//**
	 * 
	 * @param params
	 * @param request
	 * @param isSetJsObj 是否组装到js变量里
	 * @return
	 *//*
	public static StringBuffer getFormJsParam(Map<String, List<SysGeneralParam>>  params,HttpServletRequest request,boolean isSetJsObj){
		//
		StringBuffer sb = new StringBuffer("");
		String endtype = FormParamConstants.JS_VAR;
		List<SysGeneralParam>  l = params.get(endtype);
		sb.append(SysCardFormColumnUtil.getGeneralJsParamStr(l, request,isSetJsObj));
		return sb;
	}

	*//**
	 * 获取combobox中涉及到控件初始化类型为sql并其中有其它参数  生成这段js
	 * @param param
	 * @param jsId
	 *//*
	public static String getComboboxGuiInitJs(String columnname,String ccolumnname,String cjsid,String jsid,String formType) {
		// TODO 自动生成方法存根
		////卡片式
		String temp = "";
		if("1".equals(formType)){
			temp+=SysCardFormBeansUtil.getNbsp(0)+"var c_param_"+ccolumnname+"=nui.get('"+cjsid+"').getValue();"+NEW_LINE;
			temp+=SysCardFormBeansUtil.getNbsp(2)+"if(!c_param_"+ccolumnname+"){"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(3)+"nui.get('"+jsid+"').setData(null);"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(3)+"return ;"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(2)+"}"+NEW_LINE_ONLY;
		}
		if("2".equals(formType)){
			temp+=SysCardFormBeansUtil.getNbsp(0)+"var c_param_"+ccolumnname+"=e.row."+ccolumnname+";"+NEW_LINE;
			temp+=SysCardFormBeansUtil.getNbsp(2)+"if(!c_param_"+ccolumnname+"){"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(3)+"e.row."+columnname+"=null;"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(3)+"return ;"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(2)+"}"+NEW_LINE_ONLY;
		}
		return temp;
	}
	
	*//**
	 * 
	 * @param gridFilterHeightGrade 是否高级查询
	 * @return
	 */
	public static String getSearchButtons(String gridFilterHeightGrade,String formcode,String formId) {
		// TODO 自动生成方法存根
		String str =  "";
		str += "                <td style=\"margin-left:10px;float:left;padding-top:5px\" align=\"left\" >\n";
		str+=	"<div style=\"float:left;display:inline-block;margin-right:15px;position:relative;\">\n" +
				"<input class=\"btn btn-primary\" style=\"width:70px;padding-left:2px;padding-right:25px;\" value=\"查询\" onclick=\"grid_"+formcode+"_fun11_"+formId+"()\">\n" +
				"<i class=\"glyphicon glyphicon-search\" style=\"position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff\">\n" +
				"</i>\n" ;
		if("true".equals(gridFilterHeightGrade)){
//		str+="<button class=\"btn btn-primary\"  onclick=\"grid_"+formcode+"_HeighQuery\"/>";
		str+=	getSearchButtons(formcode,formId);
		}
		str+="</div>\n";
		str+=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
		return str;
	}
	
	public static String getSearchButtons(String formcode,String formId) {
		// TODO 自动生成方法存根
		String str =  "";
		str+=	"<div style=\"float:right;display:inline-block;margin-right:15px;position:relative;\">\n" +
				"<input class=\"btn btn-primary\" style=\"width:100px;padding-left:2px;padding-right:25px;\" value=\"高级查询\" onclick=\"grid_"+formcode+"_HeighQuery_"+formId+"()\">\n" +
				"<i class=\"glyphicon glyphicon-search\" style=\"position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff\">\n" +
				"</i>\n";
		return str;
	}

}
