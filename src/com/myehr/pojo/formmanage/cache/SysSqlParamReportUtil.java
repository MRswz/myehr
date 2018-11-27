package com.myehr.pojo.formmanage.cache;


import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.pojo.sysParam.SysRequestParam;

/**
 * 
 * @author Administrator
 *
 */
public class SysSqlParamReportUtil implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String REPORT_URL = "http://baidu.com";
	
	/**
	 *获取普通卡片textbox控件的html代码
	 */
	public static String getTextBoxHtml(String classType,
			String vtype, String errorText, String emptyText,boolean isRequired,boolean isValueChange,
			boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,String height,String inputname){
		String baseName = inputname.replace(".", "_");
		String valueChangeFunName = isValueChange == true ? " onvaluechanged=\"" + baseName+ "_valueChange\"" : "";
		String valueClickFunName = isClick == true ? " onclick=\"" + baseName + "_click\"" : "";
		String isValidationFunName = isValidation == true ? " onvalidation=\"" + baseName + "_validation\"" : "";
		String requiredHtml = isRequired == true ? " required=\"true\" " : "";
		String vtypeHtml = vtype != null ? " vtype=\"" + vtype + "\" " : "";
		String errorTextHtml = errorText != null ? vtype + "ErrorText=\"" + errorText + "\" " : "";
		String emptyTextHtml = emptyText != null ? " emptyText=\"" + emptyText + "\" " : "";
		String isDisabledHtml = isDisabled ? " enabled=\"false\"" : "";
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String heightHtml = height != null ? "height:" + height + ";" : "";
		String styleHtml = " style=\"" + widthHtml + heightHtml + "\"";
		
		String tb = "<input id=\""+inputname+"\" name=\""+inputname+"\" class=\""+classType+"\"" + 
						emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml +"/>";
		
		return tb;
	}
	


	public static Object[] getCardFormGuiHtml(String[] htmls,SysRequestParam request,  String checkType, String checkSelf, String checkFun,
			String dataFromType, String dataFromValue, String valuechangeFun,
			String clickFun, String initFun, String guiInitType,
			String guiInitValue, String busId, SysSqlParamsCache param,
			boolean isAsLabel, Map<String, List<SysFormGeneralParamCache>> params,String jsName,String isApp) {
		Object[] ret = new Object[9];
		String jsId = jsName;
		boolean isValueChange =false;
		boolean isOnclick = false;
		boolean isValidation = false;
		
		String dictTypeId = null;
		String url =  null;
		String data = null;
		
		// 处理js函数
		if("initFun".equals(dataFromType)){
			htmls[1] = initFun;
		}else {
			String _value = SysCardFormColumnUtil.getDefaultValue(request, dataFromType, dataFromValue);SysCardFormColumnUtil.getDefaultValue(request, dataFromType, dataFromValue);
			
					
			if(_value!=null&&!"".equals(_value)){
				String tempjs = SysCardFormBeansUtil.setValueJs(jsId, _value);
				htmls[1] = SysCardFormBeansUtil.getNbsp(2) + tempjs	+ SysCardFormBeansUtil.NEW_LINE;
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
				String paramStr = SysCardFormColumnUtil.getGeneralParamStr(l,request);
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
			//return null;
			//url = SysCardFormBeansUtil.QUERY_SQL_URL + "?sqlType=query&busType=ridiolist&busId=" + busId; 
		}
		//click方案
		if (clickFun != null && !"".equals(clickFun)) {
			isOnclick = true;
			
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+ param.getOnClickFunName(jsName)+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+clickFun+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			
			htmls[2] =temp;
		}
		//valuechange方案
		if (valuechangeFun != null && !"".equals(valuechangeFun)) {
			isValueChange = true;
			
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+ param.getOnValueChangeFunName(jsName)+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+valuechangeFun+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			htmls[3] =temp;
		}
		
		if (!checkType.isEmpty() && checkType!="") {
			if ("fun".equals(checkType)) {
				checkType = null;
				checkSelf = null;
				if (checkFun != null && !"".equals(checkFun)) {
					isValidation = true;
					
					String temp = SysCardFormBeansUtil.getNbsp(1) + SysCardFormBeansUtil.JAVASCRIPT_FUNCTION
							+ param.getOnValidationFunName(jsName) + SysCardFormBeansUtil.JAVASCRIPT_FUN_START + SysCardFormBeansUtil.NEW_LINE_ONLY;
					temp += SysCardFormBeansUtil.getNbsp(2) + checkFun + SysCardFormBeansUtil.NEW_LINE_ONLY;
					temp += SysCardFormBeansUtil.getNbsp(1) 	+ SysCardFormBeansUtil.JAVASCRIPT_FUN_END + SysCardFormBeansUtil.NEW_LINE_ONLY;
					htmls[4] =temp;
				}
			} 
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
	public static Object[] getTextBoxHtml(SysTextBoxCache textbox,String jsName,String[] htmls,SysRequestParam request ,SysSqlParamsCache param, boolean isAsLabel,String isApp){
		return getCardFormGuiHtml(htmls, request, textbox.getTextboxCheckType(), textbox.getTextboxCheckSelf(), textbox.getTextboxCheckFun(), textbox.getTextboxDataFromType(), textbox.getTextboxDataFromValue(), textbox.getTextboxValuechangeFun(), textbox.getTextboxClickFun(),  textbox.getTextboxInitFun(), 
				null, null,null, param,isAsLabel,null,jsName,isApp);
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
	public static Object[] getComboboxHtml(SysFormComboboxCache combobox,String jsName,String[] htmls,SysRequestParam request ,
			SysSqlParamsCache param, boolean isAsLabel,long sqlParamsId,String isApp){
//		是否要生成加载combobox控件数据脚本
		if("sql".equals(combobox.getComboboxGuiInitType())){
			if(htmls[8] ==null){
				htmls[8] = "";
			}
			if(htmls[14] ==null){
				htmls[14] = "";
			}
			//增加报表id值
			htmls[8]+= getCardFormComboboxGuiInitJs(jsName.replace(".", "_"), jsName,combobox,request,sqlParamsId);
			htmls[14] += SysCardFormBeansUtil.getNbsp(1)+"combobox_init_"+jsName.replace(".", "_")+"();\n";
		}
		return getCardFormGuiHtml(htmls, request,null, null, null, combobox.getComboboxDataFromType(),
				combobox.getComboboxDataFromValue(), combobox.getComboboxValuechangeFun(), combobox.getComboboxClickFun(), combobox.getComboboxInitFun(), 
				combobox.getComboboxGuiInitType(), combobox.getComboboxGuiInitValue(),combobox.getComboboxId()+"", param,isAsLabel,combobox.getGeneralParams()
				,jsName,isApp);
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
	public static Object[] getDatepickerHtml(SysDatepickerCache datepicker,String jsName,String[] htmls,SysRequestParam request ,SysSqlParamsCache param,boolean isAsLabel,String isApp){
		Object[] ret = getCardFormGuiHtml(htmls, request, null, null, null, 
				datepicker.getDatepickerDataFromType(),datepicker.getDatepickerDataFromValue(),  datepicker.getDatepickerValuechangeFun(),
				datepicker.getDatepickerClickFun(), datepicker.getDatepickerInitFun(), null, 
				null,datepicker.getDatepickerId()+"", param, 
				isAsLabel,null,jsName,isApp);
		
		if(datepicker.getDatepickerDrawdateFun()!=null&&!"".equals(datepicker.getDatepickerDrawdateFun())){ //生成日期控件的drawdate事件方法
			String temp = SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+""+jsName.replaceAll("\\.", "_")+"_drawdate"+SysCardFormBeansUtil.JAVASCRIPT_FUN_START+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(2)+datepicker.getDatepickerDrawdateFun()+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp += SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY;
			htmls[8] =temp;
		}
		return ret;
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
	 *//*
	public static Object[] getRadiolistHtml(SysRadiobuttonlist radio,String jsName ,String[] htmls,HttpServletRequest request ,SysSqlParamsCache params,boolean isAsLabel){
		return getCardFormGuiHtml(htmls, request, null, null, null, radio.getRadiolistDataFromType(),radio.getRadiolistDataFromValue(), radio.getRadiolistValuechangeFun(), radio.getRadiolistClickFun(), radio.getRadiolistInitFun(), 
				radio.getRadiolistGuiInitType(), radio.getRadiolistGuiInitValue(),radio.getRadiolistId()+"", params, isAsLabel,radio.getGeneralParams(),jsName);
	}*/
	
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
	public static Object[] getCheckboxHtml(SysCheckboxCache checkbox,String jsName,String[] htmls,SysRequestParam request ,SysSqlParamsCache params,boolean isAsLabel,String isApp){
		Object[] ret = getCardFormGuiHtml(htmls, request, null, null,
				null,checkbox.getCheckboxDataFromType(),checkbox.getCheckboxDataFromValue(), checkbox.getCheckboxValuechangeFun(),
				checkbox.getCheckboxClickFun(), checkbox.getCheckboxInitFun(), 
				null, null,checkbox.getCheckboxId()+"", params, isAsLabel,null,jsName,isApp);
		return ret;
	}
	
	/**
	 *获取普通卡片checkbox控件的html代码
	 * @param isDrawdate 
	 * @param showtodaybutton 
	 * @param allowinput 
	 * @param showclearbutton 
	 * @param showokbutton 
	 * @param showtime 
	 * @param timeformat 
	 * @param format 
	 */
	public static String getCheckboxHtml(String classType , String jsName,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String showName){
		String baseName =jsName.replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onvaluechanged=\""+ baseName+"_valueChange\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String showNameHtml =  showName!=null? " text=\""+showName+"\" ":" text:\"null\"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "\"";
		
		String tb = "<input id=\"" + jsName + "\" name=\"" + jsName
				+ "\" trueValue=\"1\" falseValue=\"0\" class=\"" + classType
				+ "\"" + emptyTextHtml + valueChangeFunName + valueClickFunName
				+ requiredHtml + styleHtml + showNameHtml + "/>";
		
		return tb;
	}
	
	
	/**
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
	 */
	public static String getComboboxHtml(String classType , String jsName,String vtype,String emptyText,boolean isRequired,
				boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String width,
				boolean showNullItem, String textField, String valueField, boolean allowInput, String dictTypeId, String nullItemText,
				String url, String data,String dataField, boolean multiselect){
		String baseName = jsName.replaceAll("\\.", "_");
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
		String dictTypeIdHtml = dictTypeId!=null?" dictTypeId=\""+dictTypeId+"\"":"";
		String nullItemTextHtml = nullItemText!=null?" nullItemText=\""+nullItemText+"\"":"";
		String urlHtml = url!=null?" url=\""+url+"\"":"";
		String dataHtml = data!=null?" data=\""+data+"\"":"";
		String dataFieldHtml = dataField!=null?" dataField=\""+dataField+"\"":"";
		String multiselectHtml = multiselect==true?" multiSelect=\"true\"":"";
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "\"";
		
		String tb = "<input id=\"" + jsName + "\" name=\"" + jsName + "\" class=\""
				+ classType + "\"" + emptyTextHtml + vtypeHtml
				+ valueChangeFunName + valueClickFunName + requiredHtml
				+ isValidationFunName + isDisabledHtml + styleHtml
				+ showNullItemHtml + textFieldHtml + valueFieldHtml
				+ allowInputHtml + dictTypeIdHtml + nullItemTextHtml + urlHtml
				+ dataHtml + dataFieldHtml + multiselectHtml + "/>";
		
		return tb;
	}
	
	/**
	 * 获取查询按钮html
	 * @param rowspan
	 * @return
	 */
	public static String getSearchButtonsTdStart(long rowspan){
		String str =  "";
		str += "<td style=\"margin-left:10px;float:left\" align=\"left\" rowspan=\""+rowspan+"\" >";
		str+="<input class=\"nui-button\" text=\"查询\" iconCls=\"icon-search\" onclick=\"search()\"/>";
		str+=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
		//str+=SysCardFormBeansUtil.getTdHtml("left", null, null, null,0);
		return str;
	}
	
	/**
	 *获取普通卡片textbox控件的html代码
	 * @param isDrawdate 
	 * @param showtodaybutton 
	 * @param allowinput 
	 * @param showclearbutton 
	 * @param showokbutton 
	 * @param showtime 
	 * @param timeformat 
	 * @param format 
	 */
	public static String getDatepickerHtml(String classType , String jsName,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String format, String timeformat, boolean showtime, boolean showokbutton, boolean showclearbutton, boolean allowinput, boolean showtodaybutton, boolean isDrawdate){
		String baseName = jsName.replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onvaluechanged=\""+ baseName+"_valueChange\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String isDrawdateFunName = isDrawdate==true?" ondrawdate=\""+ baseName+"_drawdate\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String formatHtml =  format!=null? " format=\""+format+"\" valueformat=\""+format+"\" ":"";
		String timeFormatHtml =  timeformat!=null? " timeFormat=\""+timeformat+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		String showtimeHtml = showtime?" showTime=\"true\"":"";
		String showokbuttonHtml = showokbutton?" showOkButton=\"true\"":"";
		String showclearbuttonHtml = showclearbutton?" showClearButton=\"true\"":"";
		String showtodaybuttonHtml = showtodaybutton?" showTodayButton=\"true\"":"";
		String allowinputHtml = allowinput?" allowInput=\"true\"":"";
		String enabledHtml =isDisabled? " enabled=\"false\" ":"";
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "\"";
		
		String tb = "<input id=\"" + jsName + "\" name=\"" + jsName + "\" class=\""
				+ classType + "\"" + emptyTextHtml + valueChangeFunName
				+ valueClickFunName + requiredHtml + styleHtml
				+ isDrawdateFunName + formatHtml + timeFormatHtml
				+ showtimeHtml + showokbuttonHtml + showclearbuttonHtml
				+ showtodaybuttonHtml + allowinputHtml + widthHtml
				+ enabledHtml + "/>";
		
		return tb;
	}
	
	/**
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
	 */
	public static String getRadiolistHtml(String classType, String jsName, String vtype, String emptyText, boolean isRequired, boolean isValueChange, boolean isClick, boolean isValidation, boolean isDisabled, String entityName,
			String width, String repeatItems, String textField, String valueField, String repeatdirection, String dictTypeId, String repeatLayout, String url, String data, String dataField) {
		// TODO 自动生成方法存根
		String baseName = jsName.replaceAll("\\.", "_");
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
		
		String tb = "<input id=\"" + jsName + "\" name=\"" + jsName + "\" class=\""
				+ classType + "\"" + emptyTextHtml + vtypeHtml
				+ valueChangeFunName + valueClickFunName + requiredHtml
				+ isValidationFunName + isDisabledHtml + styleHtml
				+ repeatItemsHtml + textFieldHtml + valueFieldHtml
				+ repeatdirectionHtml + dictTypeIdHtml + repeatLayoutHtml
				+ urlHtml + dataHtml + dataFieldHtml + "/>";
		
		return tb;
	}
	
	/**
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
	 */
	public static String getLookupHtml(String classType, String jsName, String vtype, String emptyText, 
			boolean isRequired, boolean isValueChange, boolean isOnclick, boolean isValidation, boolean isDisable, String entityName, String formColumnWidth, String buttonClickName) {
		// TODO 自动生成方法存根
		String baseName = jsName;
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
		
		String tb = "<input id=\"" + jsName + "\" name=\"" + jsName
				+ "\" class=\"" + classType + "\"" + emptyTextHtml + vtypeHtml
				+ valueChangeFunName + valueClickFunName + requiredHtml
				+ isValidationFunName + isDisabledHtml + styleHtml
				+ buttonclickHtml + "/>";
		
		return tb;
	}
	
	/**
	 * 生成加载combobox自定义sql的js脚本
	 * @param formCode
	 * @param columnName
	 * @param jsId
	 * @return
	 */
	public static String getCardFormComboboxGuiInitJs(String columnName,String jsId,SysFormComboboxCache combox,SysRequestParam request,long sqlParamId ){
		String temp = "";
		String funname = "combobox_init_"+columnName;
		
		String[] results =SysFormGeneralExecSqlCache.getSqlJsStr(combox,request, columnName,combox.getComboboxFormColumnId(),null,jsId,false) ;
		String paramJson = results[1];
		String qjs = results[0];
		temp+=SysCardFormBeansUtil.getNbsp(1)+"function "+funname+"(e) {"+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp+=SysCardFormBeansUtil.getNbsp(2)+qjs+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp+=SysCardFormBeansUtil.getNbsp(2)+"var url = \""+SysCardFormBeansUtil.QUERY_SQL_URL+"?"+paramJson+"\""+SysCardFormBeansUtil.NEW_LINE;
		temp+=SysCardFormBeansUtil.getNbsp(2)+"var comboxobj = nui.get(\""+jsId+"\");"+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp+=SysCardFormBeansUtil.getNbsp(2)+"comboxobj.setUrl(url);"+ SysCardFormBeansUtil.NEW_LINE_ONLY;
        temp+=SysCardFormBeansUtil.getNbsp(1)+"}"+ SysCardFormBeansUtil.NEW_LINE_ONLY;
		return temp;
	}


	/**
	 * 
	 * @param lookup
	 * @param jsName
	 * @param htmls
	 * @param request
	 * @param params
	 * @param b
	 * @param c
	 * @return
	 *//*
	public static Object[] getLookupHtml(SysLookup lookup, String jsName, String[] htmls, HttpServletRequest request, SysSqlParamsCache params, boolean isAsLabel) {
		// TODO 自动生成方法存根
		Object[] ret = getCardFormGuiHtml(htmls, request, null, null, null, lookup.getLookupDataFromType(),lookup.getLookupDatabackValue(), lookup.getLookupValuechangeFun(),
				lookup.getLookupClickFun(),  lookup.getLookupInitFun(), 
				null, null,lookup.getLookupId()+"", params, isAsLabel,lookup.getGeneralParams(),jsName);
		
		String winType = lookup.getLookupFormWinType();
		String clickFunName =jsName.replace(".", "_")+ "_onbuttonclick";
		//获取该字段的jsId
		String  columnJsId = jsName;
		//根据窗口类型生成onbuttonclick 事件方法
		String onbuttonclickStr = "";
		String otherFieldName = null;
		//生成打开页面方法
		onbuttonclickStr+=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUNCTION+clickFunName+"(e)"+SysCardFormBeansUtil.JAVASCRIPT_FUN_START;
		if("1".equals(winType)||"2".equals(winType)){ //配置窗口
			String[] results = SysCardFormBeansUtil.getLookupOpenJs(request,lookup.getLookupWinTitle(), lookup.getLookupWinWidth(), lookup.getLookupWinHeight(), lookup.getLookupFormWinType(), lookup.getLookupFormUrl(), 
					lookup.getLookupFormId(), columnJsId,"0",lookup.getLookupDatabackType(),lookup.getLookupDatabackValue(),jsName,otherFieldName,lookup.getLookupShowProperty(),lookup.getLookupValueProperty(),true,
					lookup.getGeneralParams(),request,null,lookup.getlookupCustomDataback(),lookup.getlookupCustomDatabackFun(),lookup.getBackSql(), -1);
			//String backType,String backValue,String fieldName,String otherField,String showProperty,String valueProperty
			onbuttonclickStr +=  results[0];
			
			
			htmls[15]=htmls[15]==null?"":htmls[15];
			htmls[15]+=results[2];
		}else  { //自定义onbuttonclick事件函数
			onbuttonclickStr += lookup.getLookupButtonclickFun()+SysCardFormBeansUtil.NEW_LINE_ONLY;
		}
		onbuttonclickStr+=SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END;
		
		htmls[8]=htmls[8]==null?"":htmls[8];
		htmls[8] += onbuttonclickStr+"\n";
		
		return ret;
	}*/
	
	
}
