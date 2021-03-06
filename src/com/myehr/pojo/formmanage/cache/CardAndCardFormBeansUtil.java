package com.myehr.pojo.formmanage.cache;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.weaver.ast.Var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.ecache.impl.EhCacheTestServiceImpl;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpand;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;


/**
 * 静态常用处理方法及属性
 * @author Administrator
 *
 */
public class CardAndCardFormBeansUtil implements Serializable {
	private static Logger logger = LoggerFactory.getLogger(CardAndCardFormBeansUtil.class);
	/*@Autowired
	static
	EhCacheTestService EhCacheService;*/
	private static final long serialVersionUID = 1L;

	public static String formGridByCardHead(){
		String jspBuildString = "<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n"+
								"<%@ include file=\"/common/gridbycard.jsp\" %>\n"+
								"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"+
								"<html>\n"+
								"<head>\n"+
								"<meta charset=\"utf-8\">\n"+
								"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"+
								"<style type=\"text/css\">\n"+
								"    html,body{min-height: 100%;}\n"+
								"	.row{padding:0 30px 0 15px}\n"+
								"	.deleteButton:hover {color: red}\n"+
								"</style>\n"+
								"</head>\n"+
								"<body class=\"gray-bg\">\n"+
								"<!--主表单-->\n"+
								"<div class=\"row\" style=\"margin-left:0;padding:0 15px 0 30px;\" id=\"TEST_INFO_FORM\">\n"+
								"</div>\n"+
								"<!--合计/单信息展示-->\n"+
								"<div>\n"+
								"	<!--操作部分-->\n"+
								"	<div class=\"BTNGROUP\" style=\"margin-left:30px; display:inline-block;height: 35px;width:100%\">\n"+
								"		<div style=\"margin-right:10px;display:inline-block;width:50%\">\n"+
								"			<select id=\"showType\" title=\"显示类型\" styletype=\"select\" name=\"showType\" class=\"form-control \" onchange=\"changeShowType()\" style=\"float:left;width:20%\">\n"+
								"				<option value=\"youxiao\" selected=\"\">有效</option>\n"+
								"				<option value=\"zuixin\">最新</option>\n"+
								"				<option value=\"all\">所有</option>\n"+
								"			</select>\n"+
								"			<select id=\"showContent\" title=\"显示内容\" styletype=\"select\" name=\"showContent\" class=\"form-control \" onchange=\"changeShowType()\" style=\"float:left;width:20%\">\n"+
								"				<option value=\"account\" selected=\"\">合计</option>\n"+
								"				<option value=\"info\" >单条信息</option>\n"+
								"			</select>\n"+
								"		</div>\n"+
								"		<div style=\"margin-right:10px;float:left;\">\n"+
								"			<input type=\"button\" id=\"zhankai\" class=\"btn btn-info\" value=\"展开\" onclick=\"changeFunction()\"/>\n"+
								"			<input type=\"button\" id=\"xinzeng\" class=\"btn btn-info\" value=\"新增\" onclick=\"addFunction()\"/>\n"+
								"			<input type=\"button\" id=\"baocun\" class=\"btn btn-info\" value=\"保存\" onclick=\"saveFunction()\"/>\n"+
								"		</div>\n"+
								"	</div>\n"+
								"	<!--展示部分-->\n"+
								"	<div class=\"row\" style=\"margin-left:0\" id=\"TEST_FEE_INFO_FORM\">\n"+
								"	</div>\n"+
								"</div>\n"+
								"<!--展开部分-->\n"+
								"<div class=\"row\" style=\"margin-left:0;\" id=\"TEST_FEE_INFO_FORM2\">\n"+
								"</div>\n"+
								"<script>";
		return jspBuildString;
	}

	public static String getCardAndCardColumnProperty(String fieldName,String lableName,String vtype,String width,String rendereHtml,String alignHtml,String otherHtml,String showtypeString,String colorCondition,String color,SysTextBoxCache textbox,String widgetType){
		String temp = "";
		if (widgetType!=null&&widgetType.equals("TEXTBOX")) {
				temp="  '	<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label style=\"float:left;font-size:14px;width:100px;\">"+lableName+": </label>'+\n"
					+"  '			<input id=\"TEST_INFOR_SON_OF_FEE.fee_code_3863\" name=\"fee_code\"   type=\"text\" class=\"form-control\"  vtype=\"illegalChar;maxLength:10;minLength:null;\"  style=\"width:200px;height:25px;padding:0;border:none;background-color:#fff\"/>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\"  ></span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}else if (widgetType!=null&&widgetType.equals("COMBOBOX")){
				temp="  '	<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label style=\"float:left;font-size:14px;width:100px;\">"+lableName+": </label>'+\n"
					+"  '			<select id=\"TEST_INFOR_SON_OF_FEE.fee_name_3863_'+newElementNum+'\" title=\""+lableName+"\" styleType=\"select\" name=\"fee_name\"  class=\"form-control \" emptyText=\"\"  required=\"true\"  style=\"width:200px;height:25px;padding:0;border:none;background-color:#fff\" showNullItem=\"true\" textField=\"dictName\" valueField=\"dictId\" DictName=\"feeType\" nullItemText=\"\" dataField=\"dict_form_3863\" initParam = \"_\"></select>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" ></span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}else if (widgetType!=null&&widgetType.equals("DATETIME")){
				temp="  '	<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label style=\"float:left;font-size:14px;width:100px;\">"+lableName+": </label>'+\n"
					+"  '			<div class=\"controls input-append date form_date4 input-group\" data-date=\"\"  data-link-field=\"dtp_input2\" data-link-format=\"yyyy-mm-dd\" style=\"float:left;width: 134px;\">'++\n"
					+"  '				<input type=\"text\" readonly class=\"form-control\" dateType=\"controls input-append date form_date4\" id=\"TEST_INFOR_SON_OF_FEE.fee_time_3863_'+newElementNum+'\" styleType=\"dateTime\"   style=\"width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff\" name=\"fee_time\"  format=\"yyyy-MM-dd\" valueformat=\"yyyy-MM-dd\"  timeFormat=\"HH:mm:ss\"  showClearButton=\"true\" showTodayButton=\"true\"/>'+\n"
					+"	'				<span class=\"input-group-addon\" name=\"closeButton\" style=\"padding:1px 10px 2px 10px;font-size:12px\"><span class=\"glyphicon glyphicon-remove\"></span></span>'+"
					+"  '				<span class=\"input-group-addon\" name=\"clickButton\" style=\"padding:1px 10px 2px 10px;font-size:12px\"><span class=\"glyphicon glyphicon-th\"></span></span>'+\n"
					+"  '			</div>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}
		return temp;
	}

	/**
	 *获取普通卡片textbox控件的html代码
	 */
	public static String getTextBoxHtmlForCC(String classType, String id, String name, String vtype,String othervtype, String errorText, String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,String height,long formId,String isApp,String textboxCheckType,String lableName){
		name = name.toUpperCase();
		String baseName = (entityName + "_" + name).replaceAll("\\.", "_");  //增加formDefCode;
		String checkTypeHtml = "";
		if (textboxCheckType != null) {
			if (textboxCheckType.equals("uniqueVerify")) {
				logger.info(textboxCheckType);
				checkTypeHtml = " onblur=\"uniqueVerifyBlur(this)\"";
			}
		}
		String valueChangeFunName = isValueChange == true ? " onchange=\"" + baseName.toUpperCase() + "_valueChange_"+String.valueOf(formId)+"(this)\"" : "";
		String valueClickFunName = isClick == true ? " onclick=\"" + baseName + "_click\"" : "";
		String isValidationFunName = isValidation == true ? " onvalidation=\"" + baseName + "_validation\"" : "";
		String requiredHtml = isRequired == true ? " required=\"true\" " : "";
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		if (vtype != null && !"".equals(vtype)) {
			if (othervtype != null && !"".equals(othervtype)) {
				vtype = vtype + ";" + othervtype;
			}
		} else {
			if (othervtype != null && !"".equals(othervtype)) {
				vtype = othervtype;
			}
		}
		if(vtype!=null&&(vtype.indexOf("int")!=-1||vtype.indexOf("float")!=-1||vtype.indexOf("naturalNumber")!=-1)){
			classType="number";
		}
		String vtypeHtml = vtype != null ? " vtype=\"" + vtype + "\" " : "";
		String errorTextHtml = errorText != null ? vtype + "ErrorText=\"" + errorText + "\" " : "";
		//String errorTextHtml = "";
		String emptyTextHtml = emptyText != null ? " emptyText=\"" + emptyText + "\" " : "";
		String isDisabledHtml = isDisabled ? " readonly=\"true\"" : "";
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String heightHtml = height != null ? "height:" + height + ";" : "";
		String styleHtml = " style=\"" + widthHtml + heightHtml +"font-weight:900;"+ "\"";
		if (isDisabled==true) {
			styleHtml = " style=\"" + widthHtml + heightHtml + "font-weight:900;"+ " border:none;float:left\"";
		} else {
			styleHtml = " style=\"" + widthHtml + heightHtml + "font-weight:900;"+ " float:left\"";
		}
		String tb = "";
		if (classType!=null&&classType.equals("hidden")) {
			tb  =	"  '	<input id=\""+id+"\" name=\""+name+"\" value=\"'+"+name+"+'\"  type=\""+classType+"\" >'+\n";
		}else if (classType!=null&&classType.equals("textarea")) {
			tb  =	 "  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label class=\"CCM_LABEL\">"+lableName+": </label>'+\n"
					+"  '			<textarea id=\""+id+"_'+i+'\" name=\""+name+"\" dataType=\"text\" class=\"CCReadText\"  value=\"'+"+name+"+'\" type=\""+classType+"\" readonly oninput=\"myFunction(this,\\'"+name+"\\')\" "+emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + checkTypeHtml + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + "  style=\"width:200px;height:25px;padding:0;border:none;background-color:#fff\"><textarea/>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		} else {
			tb  =	 "  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label class=\"CCM_LABEL\">"+lableName+": </label>'+\n"
					+"  '			<input id=\""+id+"_'+i+'\" name=\""+name+"\" dataType=\"text\" class=\"CCReadText\"  value=\"'+"+name+"+'\" type=\""+classType+"\" readonly oninput=\"myFunction(this,\\'"+name+"\\')\" "+emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + checkTypeHtml + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + "  style=\"width:200px;height:25px;padding:0;border:none;background-color:#fff\"/>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}

		return tb;
	}
	/**
	 *获取普通卡片textbox控件的html代码
	 */
	public static String getTextBoxHtmlForCC2(String classType, String id, String name, String vtype,String othervtype, String errorText, String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,String height,long formId,String isApp,String textboxCheckType,String lableName){
		String baseName = (entityName + "_" + name).replaceAll("\\.", "_");  //增加formDefCode;
		String checkTypeHtml = "";
		if (textboxCheckType != null) {
			if (textboxCheckType.equals("uniqueVerify")) {
				logger.info(textboxCheckType);
				checkTypeHtml = " onblur=\"uniqueVerifyBlur(this)\"";
			}
		}
		String valueChangeFunName = isValueChange == true ? " onchange=\"" + baseName.toUpperCase() + "_valueChange_"+String.valueOf(formId)+"(this)\"" : "";
		String valueClickFunName = isClick == true ? " onclick=\"" + baseName + "_click\"" : "";
		String isValidationFunName = isValidation == true ? " onvalidation=\"" + baseName + "_validation\"" : "";
		String requiredHtml = isRequired == true ? " required=\"true\" " : "";
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		if (vtype != null && !"".equals(vtype)) {
			if (othervtype != null && !"".equals(othervtype)) {
				vtype = vtype + ";" + othervtype;
			}
		} else {
			if (othervtype != null && !"".equals(othervtype)) {
				vtype = othervtype;
			}
		}
		if(vtype!=null&&(vtype.indexOf("int")!=-1||vtype.indexOf("float")!=-1||vtype.indexOf("naturalNumber")!=-1)){
			classType="number";
		}
		String vtypeHtml = vtype != null ? " vtype=\"" + vtype + "\" " : "";
		String errorTextHtml = errorText != null ? vtype + "ErrorText=\"" + errorText + "\" " : "";
		//String errorTextHtml = "";
		String emptyTextHtml = emptyText != null ? " emptyText=\"" + emptyText + "\" " : "";
		String isDisabledHtml = isDisabled ? " readonly=\"true\"" : "";
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String heightHtml = height != null ? "height:" + height + ";" : "";
		String styleHtml = " style=\"" + widthHtml + heightHtml +"font-weight:900;"+ "\"";
		String disabledCSS = "";
		if (isDisabled==true) {
			//disabledCSS = "CCM_DISABLE_INPUT";
		}else {
			disabledCSS = "CCM_INPUT";
		}
		String tb = "";
		if (classType!=null&&classType.equals("hidden")) {
			   tb  = "  '	<input id=\""+id+"\" name=\""+name+"\"   type=\""+classType+"\" >'+\n";
		}else if (classType!=null&&classType.equals("textarea")) {
			tb  =	 "  '	<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 CCM_COL\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label class=\"CCM_LABEL\">"+lableName+": </label>'+\n"
					+"  '			<textarea id=\""+id+"_add_'+newElementNum+'\" name=\""+name+"\" class=\"CCReadTextarea form-control\" "+emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + checkTypeHtml + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml+"></textarea>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}  else {
			   tb  = "  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label style=\"float:left;font-size:14px;width:100px;\">"+lableName+": </label>'+\n"
					+"  '			<input id=\""+id+"_add_'+newElementNum+'\" name=\""+name+"\" dataType=\"text\" type=\""+classType+"\" class=\"form-control "+disabledCSS+"\" oninput=\"myFunction(this,\\'"+name+"\\')\" "+emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + checkTypeHtml + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml +" />'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}

		return tb;
	}

	public static String getTextBoxHtmlForCC2_MAIN(String classType, String id, String name, String vtype,String othervtype, String errorText, String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,String height,long formId,String isApp,String textboxCheckType,String lableName){
		name = name.toUpperCase();
		String baseName = (entityName + "_" + name).replaceAll("\\.", "_");  //增加formDefCode;
		String checkTypeHtml = "";
		if (textboxCheckType != null) {
			if (textboxCheckType.equals("uniqueVerify")) {
				logger.info(textboxCheckType);
				checkTypeHtml = " onblur=\"uniqueVerifyBlur(this)\"";
			}
		}
		String valueChangeFunName = isValueChange == true ? " onchange=\"" + baseName.toUpperCase() + "_valueChange_"+String.valueOf(formId)+"(this)\"" : "";
		String valueClickFunName = isClick == true ? " onclick=\"" + baseName + "_click\"" : "";
		String isValidationFunName = isValidation == true ? " onvalidation=\"" + baseName + "_validation\"" : "";
		String requiredHtml = isRequired == true ? " required=\"true\" " : "";
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		if (vtype != null && !"".equals(vtype)) {
			if (othervtype != null && !"".equals(othervtype)) {
				vtype = vtype + ";" + othervtype;
			}
		} else {
			if (othervtype != null && !"".equals(othervtype)) {
				vtype = othervtype;
			}
		}
		if(vtype!=null&&(vtype.indexOf("int")!=-1||vtype.indexOf("float")!=-1||vtype.indexOf("naturalNumber")!=-1)){
			classType="number";
		}
		String vtypeHtml = vtype != null ? " vtype=\"" + vtype + "\" " : "";
		String errorTextHtml = errorText != null ? vtype + "ErrorText=\"" + errorText + "\" " : "";
		String emptyTextHtml = emptyText != null ? " emptyText=\"" + emptyText + "\" " : "";
		String isDisabledHtml = isDisabled ? " readonly=\"true\"" : "";
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String heightHtml = height != null ? "height:" + height + ";" : "";
		String styleHtml = " style=\"" + widthHtml + heightHtml +"font-weight:900;"+ "\"";
		String disabledClass = "";
		if (isDisabled==true) {
			styleHtml = " style=\"" + widthHtml + heightHtml +"font-weight:900;"+ "\"";
			//disabledClass = "CCM_DISABLE_INPUT";
		}else if (classType!=null&&classType.equals("textarea")) {
			styleHtml = " style=\"" + widthHtml + heightHtml +"font-weight:900;"+ " \"";
			disabledClass = "CCM_TEXTAREA";
		} else {
			styleHtml = " style=\"" + widthHtml + heightHtml +"font-weight:900;"+ " \"";
			disabledClass = "CCM_INPUT";
		}
		String tb = "";
		String shortNum = "3";
		String middleNum = "6";
		if (Integer.valueOf(width.substring(0,width.length()-2))>300) {
			shortNum = "12";
			middleNum = "12";
		}
		if (classType!=null&&classType.equals("hidden")) {
			   tb  = "  '	<input id=\""+id+"\" name=\""+name+"\" value=\"'+"+name+"+'\"   type=\""+classType+"\" >'+\n";
		}else if (classType!=null&&classType.equals("textarea")) {
			tb  =	 "  '	<div class=\"col-lg-"+shortNum+" col-md-"+shortNum+" col-sm-"+middleNum+" col-xs-12 CCM_COL_TEXTAREA\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label style=\"float:left;font-size:14px;width:100px;line-height:25px\">"+lableName+": </label>'+\n"
					+"  '			<textarea id=\""+id+"\" name=\""+name+"\" class=\"CCReadTextarea form-control "+disabledClass+"\" "+emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + checkTypeHtml + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml +">'+"+name+"+'</textarea>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}else {
			   tb  = "  '	<div class=\"col-lg-"+shortNum+" col-md-"+shortNum+" col-sm-"+middleNum+"  col-xs-12 CCM_COL\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label class=\"CCM_LABEL\">"+lableName+": </label>'+\n"
					+"  '			<input id=\""+id+"\" name=\""+name+"\" dataType=\"text\" type=\""+classType+"\" class=\"form-control "+disabledClass+"\" value=\"'+"+name+"+'\" oninput=\"myFunction(this,\\'"+name+"\\')\" "+emptyTextHtml + vtypeHtml  + valueChangeFunName + checkTypeHtml + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml +"/>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}

		return tb;
	}

	/**
	 *获取CC表单中combox控件的html代码
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
	public static String getComboboxHtmlForCC(String classType , String id,String name,String title,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width
			, boolean showNullItem, String textField, String valueField, boolean allowInput, String dictTypeId, String nullItemText, String url, String data,String dataField, boolean multiselect,long formId,String isApp,String formColumnId,String paramType,String paramValue,String isFilter,String isSearch){
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"(this)\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String isValidationFunName = isValidation==true?" onvalidation=\""+ baseName+"_validation\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String vtypeHtml =  vtype!=null? " vtype=\""+vtype+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		String isDisabledHtml = isDisabled?" disabled=\"false\"":"";
		String showNullItemHtml = showNullItem==true?" showNullItem=\"true\"":"";
		String textFieldHtml = textField!=null?" textField=\""+textField+"\"":"";
		String valueFieldHtml = valueField!=null?" valueField=\""+valueField+"\"":"";
		String allowInputHtml = allowInput==true?" allowInput=\"true\"":"";
		//String dictTypeIdHtml = dictTypeId!=null?" dictTypeId=\""+dictTypeId+"\"":"";
		String isSearchHtml1 = isSearch=="Y"?"selectpicker bla bla bli":"";
		String isSearchHtml2 = isSearch=="Y"?" data-live-search=\"true\" styleType2=\"search\"":"";
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		// 修复dict下拉的查询条件选择问题 begin
		String dictTypeIdHtml = "";
		if (classType.equals(SysCardFormBeansUtil.CARD_FORM_COMBO_BOX) && dictTypeId !=null && !dictTypeId.equals("")) {
			dictTypeIdHtml = " DictName=\""+dictTypeId+"\"";
		} else {
			dictTypeIdHtml = dictTypeId!=null?" DictName=\""+dictTypeId+"\"":"";
		}
		// 修复dict下拉的查询条件选择问题 end
		String dataFieldHtml1 = "";
		if(textField!=null&&textField.equals("dictName")){
			dataFieldHtml1 = " dataField1 = \"dict\" ";
		}else if(textField!=null&&textField.equals("text")){
			dataFieldHtml1 = " dataField1 = \"sql\" ";
		}
		String nullItemTextHtml = nullItemText!=null?" nullItemText=\""+nullItemText+"\"":"";
		String urlHtml = url!=null?" url=\""+url+"\"":"";
		String dataHtml = data!=null?" data=\""+data+"\"":"";
		String dataFieldHtml = dataField!=null?" dataField=\""+dataField+"_form_"+formColumnId+"\"":"";
		String multiselectHtml = multiselect==true?" multiSelect=\"true\"":"";

		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"float:left;" + widthHtml +"font-weight:900;"+ "\"";
		String tb = "";
		String initParam = "";
		if(paramType!=null&&paramValue!=null){
			initParam = "initParam = \""+paramType + "_" + paramValue+"\"";
		}

		if (isDisabledHtml!=null && !isDisabledHtml.equals("")) {
			tb = 	 "  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label class=\"CCM_LABEL\">"+title+": </label>'+\n"
					+"  '			<input id=\"" + id + "_'+newElementNum+'\" title=\""+title+"\" styleType=\"select\" name=\"" + name + "\"  class=\"form-control CCM_DISABLE_INPUT\"  " +isSearchHtml2 + emptyTextHtml + vtypeHtml + valueChangeFunName + valueClickFunName + requiredHtml + isValidationFunName + " readonly " + styleHtml + showNullItemHtml + textFieldHtml + valueFieldHtml + allowInputHtml + dictTypeIdHtml + nullItemTextHtml + urlHtml + dataHtml + dataFieldHtml + multiselectHtml + initParam +"/>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}else {
			tb = 	 "  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label class=\"CCM_LABEL\">"+title+": </label>'+\n"
					+"  '			<select id=\"" + id + "_add_'+newElementNum+'\" title=\""+title+"\" styleType=\"select\" name=\"" + name + "\"  columnId=\""+formColumnId+"\" class=\"form-control "+isSearchHtml1+"\"" +isSearchHtml2 + emptyTextHtml + vtypeHtml + valueChangeFunName + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml + showNullItemHtml +dataFieldHtml1 + textFieldHtml + valueFieldHtml + allowInputHtml + dictTypeIdHtml + nullItemTextHtml + urlHtml + dataHtml + dataFieldHtml + multiselectHtml + initParam +"></select>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}
		return tb;
	}

	public static String getComboboxHtmlForCC_MAIN(String classType , String id,String name,String title,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width
			, boolean showNullItem, String textField, String valueField, boolean allowInput, String dictTypeId, String nullItemText, String url, String data,String dataField, boolean multiselect,long formId,String isApp,String formColumnId,String paramType,String paramValue,String isFilter,String isSearch){
		name = name.toUpperCase();
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"(this)\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String isValidationFunName = isValidation==true?" onvalidation=\""+ baseName+"_validation\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String vtypeHtml =  vtype!=null? " vtype=\""+vtype+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		String isDisabledHtml = isDisabled?" disabled=\"false\"":"";
		String showNullItemHtml = showNullItem==true?" showNullItem=\"true\"":"";
		String textFieldHtml = textField!=null?" textField=\""+textField+"\"":"";
		String valueFieldHtml = valueField!=null?" valueField=\""+valueField+"\"":"";
		String allowInputHtml = allowInput==true?" allowInput=\"true\"":"";
		//String dictTypeIdHtml = dictTypeId!=null?" dictTypeId=\""+dictTypeId+"\"":"";
		String isSearchHtml1 = isSearch=="Y"?"selectpicker bla bla bli":"";
		String isSearchHtml2 = isSearch=="Y"?" data-live-search=\"true\" styleType2=\"search\"":"";
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		// 修复dict下拉的查询条件选择问题 begin
		String dictTypeIdHtml = "";
		if (classType.equals(SysCardFormBeansUtil.CARD_FORM_COMBO_BOX) && dictTypeId !=null && !dictTypeId.equals("")) {
			dictTypeIdHtml = " DictName=\""+dictTypeId+"\"";
		} else {
			dictTypeIdHtml = dictTypeId!=null?" DictName=\""+dictTypeId+"\"":"";
		}
		// 修复dict下拉的查询条件选择问题 end

		String nullItemTextHtml = nullItemText!=null?" nullItemText=\""+nullItemText+"\"":"";
		String urlHtml = url!=null?" url=\""+url+"\"":"";
		String dataHtml = data!=null?" data=\""+data+"\"":"";
		String dataFieldHtml = dataField!=null?" dataField=\""+dataField+"_form_"+formColumnId+"\"":"";
		String multiselectHtml = multiselect==true?" multiSelect=\"true\"":"";

		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"float:left;" + widthHtml +"font-weight:900;"+ "\"";
		String disableCss = "";
		if (isDisabled==true) {
			styleHtml = " style=\"" + widthHtml + " \"";
			//disableCss = "CCM_DISABLE_INPUT";
		}
		String tb = "";
		String initParam = "";
		if(paramType!=null&&paramValue!=null){
			initParam = "initParam = \""+paramType + "_" + paramValue+"\"";
		}
		String dataFieldHtml1 = "";
		if(textField!=null&&textField.equals("dictName")){
			dataFieldHtml1 = " dataField1 = \"dict\" ";
		}else if(textField!=null&&textField.equals("text")){
			dataFieldHtml1 = " dataField1 = \"sql\" ";
		}
		if (multiselect==true) {
			tb = 	"  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"+
					"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"+
					"  '			<label class=\"CCM_LABEL\">"+title+": </label>'+\n"+
					"	'<label for=\"" + id + "\"></label>'+\n" +
					"'<select id=\"" + id + "\" title=\"<%=LangUtil.getLangByCode((String)session.getAttribute(\"langType\"),\""+title+"\")%>\" name=\""+ name +"\"  columnId=\""+formColumnId+"\" class=\"selectpicker bla bla bli CCM_SELECT\" multiple data-live-search=\"true\"" + emptyTextHtml + vtypeHtml
					+ valueChangeFunName + valueClickFunName + requiredHtml
					+ isValidationFunName + isDisabledHtml + styleHtml
					+ showNullItemHtml + textFieldHtml + valueFieldHtml
					+ allowInputHtml + dictTypeIdHtml +dataFieldHtml1 + nullItemTextHtml + urlHtml
					+ dataHtml + dataFieldHtml + multiselectHtml + initParam +"></select><span style=\"color:red;line-height:35px;font-size:27px\">"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";

		}else {
			if (isDisabledHtml!=null && !isDisabledHtml.equals("")) {
				tb = 	 "  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"
						+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
						+"  '			<label class=\"CCM_LABEL\">"+title+": </label>'+\n"
						+"  '			<input id=\"" + id + "\" title=\""+title+"\" styleType=\"select\" name=\"" + name + "\" value=\"'+"+name+"_DICTNAME+'\" class=\"form-control "+disableCss+"\" columnId=\""+formColumnId+"\" style=\"width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff\" " + emptyTextHtml + vtypeHtml + valueChangeFunName + valueClickFunName + requiredHtml +dataFieldHtml1+ isValidationFunName + " readonly " + styleHtml + showNullItemHtml + textFieldHtml + valueFieldHtml + allowInputHtml + dictTypeIdHtml + nullItemTextHtml + urlHtml + dataHtml + dataFieldHtml + multiselectHtml + initParam +"/>'+\n"
						+"	'			<input id=\"" + id + "_value\" name=\"" + name + "\" type=\"hidden\" value=\"'+"+name+"+'\"/>'+\n"
						+"  '		</div>'+\n"
						+"  '	</div>'+\n";
			}else {
				tb = 	 "  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"
						+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
						+"  '			<label class=\"CCM_LABEL\">"+title+": </label>'+\n"
						+"  '			<select id=\"" + id + "\" title=\""+title+"\" styleType=\"select\" name=\"" + name + "\" columnId=\""+formColumnId+"\"  class=\"form-control CCM_SELECT "+isSearchHtml1+"\"" +isSearchHtml2 + emptyTextHtml + vtypeHtml + valueChangeFunName + valueClickFunName +dataFieldHtml1 + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml + showNullItemHtml + textFieldHtml + valueFieldHtml + allowInputHtml + dictTypeIdHtml + nullItemTextHtml + urlHtml + dataHtml + dataFieldHtml + multiselectHtml + initParam +"></select>'+\n"
						+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
						+"  '		</div>'+\n"
						+"  '	</div>'+\n";
			}
		}
		return tb;
	}

	public static String getComboboxHtmlForCC2(String classType , String id,String name,String title,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width
			, boolean showNullItem, String textField, String valueField, boolean allowInput, String dictTypeId, String nullItemText, String url, String data,String dataField, boolean multiselect,long formId,String isApp,String formColumnId,String paramType,String paramValue,String isFilter,String isSearch){
		name = name.toUpperCase();
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"(this)\"":"";
		String valueClickFunName=isClick==true?" onclick=\""+baseName+"_click\"":"";
		String isValidationFunName = isValidation==true?" onvalidation=\""+ baseName+"_validation\"":"";
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String vtypeHtml =  vtype!=null? " vtype=\""+vtype+"\" ":"";
		String emptyTextHtml =  emptyText!=null? " emptyText=\""+emptyText+"\" ":"";
		String isDisabledHtml = isDisabled?" disabled=\"false\"":"";
		String showNullItemHtml = showNullItem==true?" showNullItem=\"true\"":"";
		String textFieldHtml = textField!=null?" textField=\""+textField+"\"":"";
		String valueFieldHtml = valueField!=null?" valueField=\""+valueField+"\"":"";
		String allowInputHtml = allowInput==true?" allowInput=\"true\"":"";
		//String dictTypeIdHtml = dictTypeId!=null?" dictTypeId=\""+dictTypeId+"\"":"";
		String isSearchHtml1 = isSearch=="Y"?"selectpicker bla bla bli":"";
		String isSearchHtml2 = isSearch=="Y"?" data-live-search=\"true\" styleType2=\"search\"":"";
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		// 修复dict下拉的查询条件选择问题 begin
		String dictTypeIdHtml = "";
		if (classType.equals(SysCardFormBeansUtil.CARD_FORM_COMBO_BOX) && dictTypeId !=null && !dictTypeId.equals("")) {
			dictTypeIdHtml = " DictName=\""+dictTypeId+"\"";
		} else {
			dictTypeIdHtml = dictTypeId!=null?" DictName=\""+dictTypeId+"\"":"";
		}
		// 修复dict下拉的查询条件选择问题 end

		String nullItemTextHtml = nullItemText!=null?" nullItemText=\""+nullItemText+"\"":"";
		String urlHtml = url!=null?" url=\""+url+"\"":"";
		String dataHtml = data!=null?" data=\""+data+"\"":"";
		String dataFieldHtml = dataField!=null?" dataField=\""+dataField+"_form_"+formColumnId+"\"":"";
		String multiselectHtml = multiselect==true?" multiSelect=\"true\"":"";

		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"float:left;" + widthHtml + "\"";
		if (isDisabled==true) {
			styleHtml = " style=\"border:none;" + widthHtml + " \"";
		}
		String tb = "";
		String initParam = "";
		if(paramType!=null&&paramValue!=null){
			initParam = "initParam = \""+paramType + "_" + paramValue+"\"";
		}
		String dataFieldHtml1 = "";
		if(textField!=null&&textField.equals("dictName")){
			dataFieldHtml1 = " dataField1 = \"dict\" ";
		}else if(textField!=null&&textField.equals("text")){
			dataFieldHtml1 = " dataField1 = \"sql\" ";
		}
		tb = "  var "+name+"_cellObj = '			<select id=\"" + id + "_'+num+'_select\" title=\""+title+"\"  styleType=\"select\" name=\"" + name + "\" style=\"width:200px;float:left;height:25px;padding:0;border:none;background-color:#fff\" columnId=\""+formColumnId+"\" class=\"form-control "+isSearchHtml1+"\"" +isSearchHtml2 +dataFieldHtml1+ emptyTextHtml + vtypeHtml + valueChangeFunName + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml + showNullItemHtml + textFieldHtml + valueFieldHtml + allowInputHtml + dictTypeIdHtml + nullItemTextHtml + urlHtml + dataHtml + dataFieldHtml + multiselectHtml + initParam +"></select>';\n" +
			 "	xx.find(\"[name='" + name + "']\").eq(1).after("+name+"_cellObj);\n" +
			 //"	xx.find(\"[name='" + baseName + "']\").css(\"display\",\"none\");\n";
			 "	xx.find(\"[name='" + name + "']\").eq(0).remove();\n"+
			 "	xx.find(\"[name='" + name + "']\").eq(0).remove();\n";
		return tb;
	}
	public static String getDatepickerHtmlForCC(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String format, String timeformat, boolean showtime, boolean showokbutton, boolean showclearbutton, boolean allowinput, boolean showtodaybutton, boolean isDrawdate,long formId,String isApp,String lableName){
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"(this)\"":"";
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
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		logger.info(width);
		String widthL = width.split("p")[0];
		if (widthL.equals("")) {
			width = "90px";
		}else if (isDisabled) {
			width = Integer.valueOf(widthL) +"px";
		} else {
			width = Integer.valueOf(widthL) - 66 + "px";
		}

		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "float:left;border-radius: 4px 0 0 4px;\"";
		String flag="readonly";
		if("controls input-append date form_date3".equals(classType)){
			flag="";
		}
		String tb = "";
		if (isDisabled) {
				/*tb = "<input id=\""+id+"\" name=\""+name+"\" type=\"text\" dateType=\""+ classType +"\" class=\"form-control\" styleType=\"dateTime\" readonly " + emptyTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + styleHtml + formatHtml +"/>\n";*/
				tb="  '	<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\" >'+\n"
						+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
						+"  '			<label style=\"float:left;font-size:14px;width:100px;\">"+lableName+": </label>'+\n"
						+"  '			<input id=\""+id+"_'+newElementNum+'\" name=\""+name+"\"  type=\"text\" readonly dateType=\""+ classType +"\" class=\"form-control\" styleType=\"dateTime\" readonly " + emptyTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + styleHtml + formatHtml +"/>'+\n"
						+"  '		</div>'+\n"
						+"  '	</div>'+\n";
		} else {
			tb=		"  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label style=\"float:left;font-size:14px;width:100px;\">"+lableName+": </label>'+\n"
					+"  '			<div class=\""+ classType + " input-group\" data-date=\"\"  data-link-field=\"dtp_input2\" data-link-format=\"yyyy-mm-dd\" style=\"float:left;width: "+width+";\">'+\n"
					+"  '				<input style=\"width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff\"type=\"text\" "+flag+" class=\"form-control \" dateType=\""+ classType +"\" id=\"" + id + "_add_'+newElementNum+'\" styleType=\"dateTime\"  "+styleHtml+" name=\"" + name + "\" " + emptyTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + isDrawdateFunName + formatHtml + timeFormatHtml + showtimeHtml + showokbuttonHtml + showclearbuttonHtml + showtodaybuttonHtml + allowinputHtml + enabledHtml + "/>'+\n"
					+"	'				<span class=\"input-group-addon\" name=\"closeButton\" style=\"padding:1px 10px 2px 10px;font-size:12px\"><span class=\"glyphicon glyphicon-remove\"></span></span>'+\n"
					+"  '				<span class=\"input-group-addon\" name=\"clickButton\" style=\"padding:1px 10px 2px 10px;font-size:12px\"><span class=\"glyphicon glyphicon-th\"></span></span>'+\n"
					+"  '			</div>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}
		return tb;
	}
	//getDatepickerHtmlForCC_MAIN
	public static String getDatepickerHtmlForCC_MAIN(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String format, String timeformat, boolean showtime, boolean showokbutton, boolean showclearbutton, boolean allowinput, boolean showtodaybutton, boolean isDrawdate,long formId,String isApp,String lableName){
		name = name.toUpperCase();
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"(this)\"":"";
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
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		logger.info(width);
		String widthL = width.split("p")[0];
		if (widthL.equals("")) {
			width = "90px";
		}else if (isDisabled) {
			width = Integer.valueOf(widthL) +"px";
		} else {
			width = Integer.valueOf(widthL) - 66 + "px";
		}

		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml +"font-weight:900;"+ "\"";
		String flag="readonly";
		if("controls input-append date form_date3".equals(classType)){
			flag="";
		}
		String tb = "";
		if (isDisabled) {
			tb="  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label class=\"CCM_LABEL\">"+lableName+": </label>'+\n"
					+"  '			<input id=\""+id+"\" name=\""+name+"\" type=\"text\" dateType=\""+ classType +"\" class=\"form-control CCM_DISABLE_INPUT\" value=\"'+"+name+"+'\" styleType=\"dateTime\" readonly "+emptyTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + styleHtml + formatHtml +"/>'+\n"
           			+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		} else {
			tb=		"  '	<div class=\"col-lg-3 col-md-3 col-sm-6 col-xs-12 CCM_COL\" >'+\n"
					+"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"
					+"  '			<label class=\"CCM_LABEL\">"+lableName+": </label>'+\n"
					+"  '			<div class=\""+ classType + " input-group\" data-date=\"\"  data-link-field=\"dtp_input2\" data-link-format=\"yyyy-mm-dd\" style=\"float:left;width: "+width+";\">'+\n"
					+"  '				<input type=\"text\" "+flag+" class=\"form-control CCM_DATE_INPUT\" dateType=\""+ classType +"\" id=\"" + id + "\" styleType=\"dateTime\" value=\"'+"+name+"+'\" "+styleHtml+" name=\"" + name + "\" " + emptyTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + isDrawdateFunName + formatHtml + timeFormatHtml + showtimeHtml + showokbuttonHtml + showclearbuttonHtml + showtodaybuttonHtml + allowinputHtml + enabledHtml + "/>'+\n"
					+"	'				<span class=\"input-group-addon\" name=\"closeButton\" style=\"padding:1px 10px 2px 10px;font-size:12px\"><span class=\"glyphicon glyphicon-remove\"></span></span>'+\n"
					+"  '				<span class=\"input-group-addon\" name=\"clickButton\" style=\"padding:1px 10px 2px 10px;font-size:12px\"><span class=\"glyphicon glyphicon-th\"></span></span>'+\n"
					+"  '			</div>'+\n"
					+"  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>'+\n"
					+"  '		</div>'+\n"
					+"  '	</div>'+\n";
		}
		return tb;
	}
	public static String getDatepickerHtmlForCC2(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String format, String timeformat, boolean showtime, boolean showokbutton, boolean showclearbutton, boolean allowinput, boolean showtodaybutton, boolean isDrawdate,long formId,String isApp,String lableName){
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"(this)\"":"";
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
		String requiredMark = isRequired == true ? " * " : "";
		logger.info(width);
		String widthL = width.split("p")[0];
		if (widthL.equals("")) {
			width = "90px";
		}else if (isDisabled) {
			width = Integer.valueOf(widthL) +"px";
		} else {
			width = Integer.valueOf(widthL) - 66 + "px";
		}
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "float:left;border-radius: 4px 0 0 4px;\"";
		String flag="readonly";
		if("controls input-append date form_date3".equals(classType)){
			flag="";
		}
		String tb = "";
		if (!isDisabled) {
			tb=		"  var fee_time_cellObj = '			<div class=\""+ classType + " input-group\" data-date=\"\"  data-link-field=\"dtp_input2\" data-link-format=\"yyyy-mm-dd\" style=\"float:left;width: "+width+";\">'+\n"
					+"  					  '				<input style=\"width:134px;float:left;height:25px;padding:0;border:none;background-color:#fff\"type=\"text\" "+flag+" class=\"form-control \" dateType=\""+ classType +"\" id=\"" + id + "_'+num+'_datepick\" styleType=\"dateTime\"  "+styleHtml+" name=\"" + name + "\" " + emptyTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + isDrawdateFunName + formatHtml + timeFormatHtml + showtimeHtml + showokbuttonHtml + showclearbuttonHtml + showtodaybuttonHtml + allowinputHtml + enabledHtml + "/>'+\n"
					+"						  '				<span class=\"input-group-addon\" name=\"closeButton\" style=\"padding:1px 10px 2px 10px;font-size:12px\"><span class=\"glyphicon glyphicon-remove\"></span></span>'+\n"
					+"  					  '				<span class=\"input-group-addon\" name=\"clickButton\" style=\"padding:1px 10px 2px 10px;font-size:12px\"><span class=\"glyphicon glyphicon-th\"></span></span>'+\n"
					+"  					  '			</div>'+\n"
					+"  					  '			<span style=\"color:red;\" class=\"CC_REQUMARK\" >"+requiredMark+"</span>';\n"
					+"xx.find(\"[id='"+id+"_\"+num+\"']\").after(fee_time_cellObj);\n"
					+"xx.find(\"[id='"+id+"_\"+num+\"']\").css(\"display\",\"none\");\n";
		}
		return tb;
	}

	public static String addFunctionJsForCC1(){
		String jspBuildString = "	 function addFunction(e){\n";
		return jspBuildString;
	}
	public static String addFunctionJsForCC2(String Num,StringBuffer jsHtml,String formId){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 var cellObj = '';\n"+
								"		 cellObj +=	'<div name=\"fubiaoElement\" class=\"col-md-12 col-sm-12 col-lg-12\" id=\"newElement'+newElementNum+'\">'+\n"+
								"					'    <div class=\"contact-box CCAdd CCD_ADD\">'+\n"+
								"					'<form class=\"row cell add_element\" style=\"padding-right:50px\">';\n"+
								"		 cellObj += '	<span class=\"fa fa-trash-o deleteButton CCD_DELET_BUTTON\" onclick=\"removeElement('+newElementNum+')\"></span>'+\n"+
								"					'	<span class=\"fa fa-save saveButton CCD_SAVE_BUTTON\" onclick=\"saveElement(this,\\\'"+formId+"\\\')\"></span>'+\n"+
								jsHtml+
								"					'</form>'+\n"+
								"					'	</div>'+\n"+
								"					'</div>';\n"+
								"		$(\"#\"+e).find(\"[id='TEST_FEE_INFO_FORM2']\").prepend(cellObj);\n"+
								"		elementSelectInitFunction(newElementNum);//初始化新增下拉控件\n"+
								"		cardDateWidInitFunction();//初始化新增日期控件\n"+
								"		newElementNum++;\n" +
								"		initAddValue(e,newElementNum);\n"+
								"	}\n";
		return jspBuildString;
	}
	public static String addFunctionJsForCC3(){
		String jspBuildString = "	}\n";
		return jspBuildString;
	}

	public static String showDate_3864JsForCC1(){
		String jspBuildString = "	 var newElementNum = 0;\n"+
								"	 function showDate_3864(arr,total,e){\n";
		return jspBuildString;
	}
	public static String showDate_MainJsForCC1(){
		String jspBuildString = "	 function showDate_Main(arr,total,e){\n" +
								"		$(e).css(\"display\",\"none\");$(e).attr(\"onclick\",\"\");\n";
		return jspBuildString;
	}
	public static String showDate_3863JsForCC1(){
		String jspBuildString = "	 function showDate_3863(arr,total,e){\n";
		return jspBuildString;
	}
	public static String showAccountJsForCC1(){
		String jspBuildString = "	 function showAccount(arr,e){\n" ;
		return jspBuildString;
	}
	public static String updateElementJsForCC1(){
		String jspBuildString = "	 function updateElement(e,num,x){\n";
		return jspBuildString;
	}
	public static String loadDataStart2JsForCC1(){
		String jspBuildString = "	 function loadDataStart2(e){\n";
		return jspBuildString;
	}
	public static String loadDataStart3JsForCC1(){
		String jspBuildString = "	 function loadDataStart3(e){\n";
		return jspBuildString;
	}
	public static String loadDataStart4JsForCC1(){
		String jspBuildString = "	 function loadDataStart4(e){\n";
		return jspBuildString;
	}
	public static String loadDataStart2JsForCG1(){
		String jspBuildString = "	 function loadDataStart2ForGrid(e){\n";
		return jspBuildString;
	}
	public static String loadDataStart3JsForCG1(){
		String jspBuildString = "	 function loadDataStart3ForGrid(e){\n";
		return jspBuildString;
	}
	public static String loadDataStart4JsForCG1(){
		String jspBuildString = "	 function loadDataStart4ForGrid(e){\n";
		return jspBuildString;
	}
	public static String initAddValueJsForCC1(){
		String jspBuildString = "	 function initAddValue(e,num){\n";
		return jspBuildString;
	}


	public static String showDate_3864JsForCC2(String Num,StringBuffer varJs,StringBuffer jsHtml1,StringBuffer jsHtml2,String formId,String peizhi){
		String[] peizhis=peizhi.split(",");
		String update="";
		String delete="";
		String saves="";	
		if(peizhis[3].equals("Y")){
		    update="							'		<span class=\"fa fa-edit updateButton\" id=\"updateButton_'+i+'\" title=\"修改\" style=\"position: absolute;right: 25px;font-size: 25px;top: 77px;\" onclick=\"updateElement(this,\\''+i+'\\',\\''+e+'\\')\"></span>'+\n";
			saves ="							'		<span class=\"fa fa-save saveButton\" id=\"saveButton_'+i+'\" title=\"保存\" style=\"position: absolute;right: 29px;font-size: 25px;top: 40px;\" onclick=\"saveElement(this,\\'"+formId+"\\')\"></span>'+\n";
		}
		if(peizhis[4].equals("Y")){
			delete="							'		<span class=\"fa fa-trash-o deleteButton\" id=\"deleteButton_'+i+'\" title=\"删除\" style=\"position: absolute;right: 30px;font-size: 25px;top: 5px;\" onclick=\"deleteElement(this,\\'"+formId+"\\')\"></span>'+\n";
		  }		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 var cellObj = '';\n"+
								"		 if(arr.length>0){\n"+
								"		 for (var i = arr.length - 1; i >= 0; i--) {\n"+
								varJs+
								"			cellObj += 		'<div class=\"col-md-12 col-sm-12 col-lg-12\" name=\"fubiaoElement\" >'+\n"+
								"							'    <div class=\"contact-box\" style=\"min-height:110px\">'+\n"+
								"							'		<form class=\"row cell\" style=\"padding-right:50px\">'+\n"+
								delete+
								saves+
							    update+
								jsHtml1+
								jsHtml2+
								"							'		</form>'+\n"+
								"							'	</div>'+\n"+
								"							'</div>';\n"+
								"	}\n"+
								"		 }\n"+
								"	$(\"#\"+e).find(\"[id='TEST_FEE_INFO_FORM2']\").html(cellObj);\n"+
								"}\n";
		return jspBuildString;
	}

	public static String showDate_MainJsForCC2_ACT(StringBuffer varJs,StringBuffer jsHtml1,String formId,StringBuffer submitButtonJs,StringBuffer approvedJs){
		logger.info(jsHtml1+"");
		String jspBuildString = "		 var cellObj = '';\n"+
								"		 for (var i = 0; i == 0; i--) {\n"+
								varJs+
								"			cellObj += 		'<div class=\"col-md-12 col-sm-12 col-lg-12 CCM_ELEMENT\" id=\"MainElement\" >'+\n"+
								"							'    <div class=\"contact-box\">'+\n"+
								"							'		<form class=\"row cell CCM_ELEMENT_ROW\" style=\"margin-top:50px\">'+\n"+
								jsHtml1+
								"							'	<div>'+\n"+
								"							'		<input id=\"submitButton_main\" type=\"hidden\" />'+\n"+
								"							'	</div>'+\n"+
								"							'		</form>'+\n"+
								"							'	</div>'+\n"+
								"							'</div>';\n"+
								"	}\n"+
								"	$(\".mainFormElement\").append(cellObj);\n" +
								"		var cellObj1 = '	<div id=\"main_buttons\" style=\"position:absolute;bottom:0px;left:50%;-webkit-transform: translate(-50%, -50%);z-index:999\">';\n"+
								"		if(flowAction=='start'){\n";
							if(submitButtonJs.length()>0){
jspBuildString				+=	"			cellObj1 +=		"+submitButtonJs;
							}
jspBuildString				+=	"		}else{\n";
							if(approvedJs.length()>0){
jspBuildString				+=	"			cellObj1 +=		"+approvedJs;
							}
jspBuildString				+=	"							'	</div>';\n"+
								"		}\n"+
								//CardAndCardForm
								"	$(\"#CardAndCardForm\").append(cellObj1);\n" +
								"	elementsListSelectInitFunction('#submitButton_main');//初始化新增下拉控件\n" +
								"	elementsListCheckboxInitFunction('#submitButton_main');//初始化单选控件\n" +
								"	elementsListRadioInitFunction('#submitButton_main');//初始化单选控件\n" +
								"	cardDateWidInitFunction();//初始化新增日期控件\n" ;
		return jspBuildString;
	}

	public static String showDate_MainJsForCC2(StringBuffer varJs,StringBuffer jsHtml1,String formId){
		String jspBuildString = "		 var cellObj = '';\n"+
								"		 for (var i = 0; i == 0; i--) {\n"+
								varJs+
								"			cellObj += 		'<div class=\"col-md-12 col-sm-12 col-lg-12 CCM_ELEMENT\" id=\"MainElement\" >'+\n"+
								"							'    <div class=\"contact-box\">'+\n"+
								"							'		<form class=\"row cell CCM_ELEMENT_ROW\" style=\"margin-top:50px\">'+\n"+
								jsHtml1+
								"							'	<div id=\"main_buttons\" style=\"position:absolute;bottom:0px;left:50%;-webkit-transform: translate(-50%, -50%);z-index:999\">'+\n"+
								"							'		<input class=\"btn btn-info saveButton\" id=\"saveButton_main\" type=\"button\" value=\"保存\" style=\"width:50px\" onclick=\"saveElement_main(this,\\'"+formId+"\\')\"/>'+\n"+
//								"							'		<input class=\"btn btn-info submitButton\" id=\"submitButton_main\" type=\"button\" value=\"提交\" style=\"width:50px\" onclick=\"submit2(\\'提交\\')\"/>'+\n"+
//								"							'		<input class=\"btn btn-info checkButton\" id=\"checkButton_main\" type=\"button\" value=\"通过\" onclick=\"submit2(\\'通过\\')\"/>'+\n"+
//								"							'		<input class=\"btn btn-info closeButton\" id=\"closeButton_main\" type=\"button\" value=\"驳回\" onclick=\"submit2(\\'驳回\\')\"/>'+\n"+
								"							'	</div>'+\n"+
								"							'		</form>'+\n"+
								"							'	</div>'+\n"+
								"							'</div>';\n"+
								"	}\n"+
								"	$(\".mainFormElement\").append(cellObj);\n" +
								"	elementsListSelectInitFunction('#saveButton_main');//初始化新增下拉控件\n" +
								"	cardDateWidInitFunction();//初始化新增日期控件\n" ;
		return jspBuildString;
	}

	public static String showAccountJsForCC2(String Num,StringBuffer varJs,StringBuffer jsHtml){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 var cellObj = '';\n"+
								varJs+
								"			cellObj += 		'<div class=\"col-md-12 col-sm-12 col-lg-12\">'+\n"+
								"							'    <div class=\"contact-box\">'+\n"+
								"							'		<div class=\"row cell\">'+\n"+
								jsHtml+
								"							'		</div>'+\n"+
								"							'	</div>'+\n"+
								"							'</div>';\n"+
								"	$(\"#\"+e).find(\"[id='TEST_FEE_INFO_FORM']\").html(cellObj);\n"+
								"}\n";
		return jspBuildString;
	}

	public static String showAccountJsForCG2(String Num,StringBuffer varJs,StringBuffer jsHtml){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 var cellObj = '';\n"+
								varJs+
								"			cellObj += 		'<div class=\"col-md-12 col-sm-12 col-lg-12\">'+\n"+
								"							'    <div class=\"contact-box\">'+\n"+
								"							'		<div class=\"row cell\">'+\n"+
								jsHtml+
								"							'		</div>'+\n"+
								"							'	</div>'+\n"+
								"							'</div>';\n"+
								"	$(\"#\"+e).find(\"[id='TEST_FEE_INFO_FORM']\").html(cellObj);\n"+
								"}\n";
		return jspBuildString;
	}

	public static String initAddValueJsForCC2(String Num,StringBuffer varJs){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n" +
								"	 	num--;\n"+
								"		var obj = $(\"#newElement\"+num);\n"+
								varJs+
								"	 }\n";
		return jspBuildString;
	}
	public static String loadDataStart2JsForCC2(String Num,String GridName){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 $.ajax({\n"+
								"			url: \"/myehr/form/cardformInitData.action\",\n"+
								"			type: 'post',\n"+
								"			data:grid_"+GridName+"_fun(xx),//HTTP请求类型\n"+
								"			contentType: 'application/json;charset=utf-8',\n"+
								"			cache: false,\n"+
								"			async: false,\n"+
								"			success: function (data) {\n"+
								"				Currentpage0"+Num+"++;\n"+
								"				var arr=data.rows;\n"+
								"				showDate_3863(arr,data.total,e);\n"+
								"			  }\n"+
								"		});\n" +
								"	 }\n";
		return jspBuildString;
	}
	public static String loadDataStart3JsForCC2(String Num,String GridName){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 $.ajax({\n"+
								"			url: \"/myehr/form/cardformInitData.action\",\n"+
								"			type: 'post',\n"+
								"			data:grid_"+GridName+"_funx(xx),//HTTP请求类型\n"+
								"			contentType: 'application/json;charset=utf-8',\n"+
								"			cache: false,\n"+
								"			async: false,\n"+
								"			success: function (data) {\n"+
								"				Currentpage0"+Num+"++;\n"+
								"				var arr=data.rows;\n"+
								"				showDate_3864(arr,data.total,e);\n"+
								"			  }\n"+
								"		});\n" +
								"	 }\n";
		return jspBuildString;
	}
	public static String loadDataStart4JsForCC2(String Num,String GridName){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 $.ajax({\n"+
								"			url: \"/myehr/form/cardformInitData.action\",\n"+
								"			type: 'post',\n"+
								"			data:grid_"+GridName+"_funx(xx),//HTTP请求类型\n"+
								"			contentType: 'application/json;charset=utf-8',\n"+
								"			cache: false,\n"+
								"			async: false,\n"+
								"			success: function (data) {\n"+
								"				Currentpage0"+Num+"++;\n"+
								"				var arr=data.rows;\n"+
								"				showAccount(arr,e);\n"+
								"			  }\n"+
								"		});\n" +
								"	 }\n";
		return jspBuildString;
	}


	public static String loadDataStart2JsForCG2(String Num,String GridName){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 $.ajax({\n"+
								"			url: \"/myehr/form/cardformInitData.action\",\n"+
								"			type: 'post',\n"+
								"			data:grid_"+GridName+"_fun(xx),//HTTP请求类型\n"+
								"			contentType: 'application/json;charset=utf-8',\n"+
								"			cache: false,\n"+
								"			async: false,\n"+
								"			success: function (data) {\n"+
								"				Currentpage0"+Num+"++;\n"+
								"				var arr=data.rows;\n"+
								"				showDate_3863(arr,data.total,e);\n"+
								"			  }\n"+
								"		});\n" +
								"	 }\n";
		return jspBuildString;
	}
	public static StringBuffer loadDataStart3JsForCG2(String Num,String GridName,StringBuffer js,String pageSize,String pageSizeList){
		//判断卡列合计
		String shoot="";
		/*StringBuffer shoots = new StringBuffer();
		shoots.append("footerFormatter");*/
		if(js.toString().contains("footerFormatter")){
			shoot="            showFooter: true,"+"\n";
		}		StringBuffer jspBuildString = new StringBuffer();
		jspBuildString.append("if(e=='fubiao"+Num+"'){\n");
		jspBuildString.append("		var cellObj = '<table id=\""+GridName+"_List\"></table>';\n");
		jspBuildString.append("		$(\"#\"+e).find(\"[id='TEST_FEE_INFO_FORM']\").html(cellObj);\n");
		jspBuildString.append("		\n");
		jspBuildString.append("		\n");
		jspBuildString.append("		\n");
		jspBuildString.append("		\n");
		jspBuildString.append("		\n");
		jspBuildString.append("		\n");
		jspBuildString.append("		\n");
		jspBuildString.append("		$(\"#"+GridName+"_List\").bootstrapTable({\n");
		jspBuildString.append("			url :\"/myehr/form/cardformInitData.action\",\n");
		jspBuildString.append("			contentType: 'application/json;charset=utf-8',\n");
		jspBuildString.append("			dataType:'json',\n");
		jspBuildString.append("			method:'post',\n");
		jspBuildString.append("			height : 450,\n");
		jspBuildString.append("			undefinedText : '-',\n");
		jspBuildString.append("			pagination : true,\n");
		jspBuildString.append(shoot);		jspBuildString.append("			striped : true,\n");
		jspBuildString.append("			queryParams : grid_"+GridName+"_funx,\n");
		jspBuildString.append("			cache : false,\n");
		jspBuildString.append("			pageSize : "+pageSize+", \n");
		jspBuildString.append("			pageList : "+pageSizeList+", \n");
		jspBuildString.append("			sidePagination : \"server\",\n");
		jspBuildString.append("			columns : [\n");
		jspBuildString.append(js);
		jspBuildString.append("			],\n");
		jspBuildString.append("			onLoadSuccess: function (aa, bb, cc) {\n");
		jspBuildString.append("				$(\".bootstrap-table\").css(\"background-color\",\"#fff\");\n");
		jspBuildString.append("			}\n");
		jspBuildString.append("		})\n");
		jspBuildString.append("}\n");
		return jspBuildString;
	}
	public static String loadDataStart4JsForCG2(String Num,String GridName){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 $.ajax({\n"+
								"			url: \"/myehr/form/cardformInitData.action\",\n"+
								"			type: 'post',\n"+
								"			data:grid_"+GridName+"_fun(xx),//HTTP请求类型\n"+
								"			contentType: 'application/json;charset=utf-8',\n"+
								"			cache: false,\n"+
								"			async: false,\n"+
								"			success: function (data) {\n"+
								"				Currentpage0"+Num+"++;\n"+
								"				var arr=data.rows;\n"+
								"				showAccount(arr,e);\n"+
								"			  }\n"+
								"		});\n" +
								"	 }\n";
		return jspBuildString;
	}


	public static String showDate_3863JsForCC2(String Num,StringBuffer varJs,StringBuffer jsHtml1,StringBuffer jsHtml2){
		String jspBuildString = "	 if(e=='fubiao"+Num+"'){\n"+
								"		 var cellObj = '';\n"+
								"		 for (var i = arr.length - 1; i >= 0; i--) {\n"+
								varJs+
								"			if(0 == Currentpage1"+Num+"){\n"+
								"				cellObj += '<span class=\"fa fa-arrow-circle-right\" style=\"font-size:30px;padding-right:15px;float:right\" onclick=\"next(\\''+e+'\\')\"></span>';\n"+
								"			}else if(total-1==Currentpage1"+Num+"){\n"+
								"				cellObj += '<span class=\"fa fa-arrow-circle-left\" style=\"font-size:30px;padding-right:15px;float:right\" onclick=\"last(\\''+e+'\\')\"></span>';\n"+
								"			}else{\n"+
								"				cellObj += '<span class=\"fa fa-arrow-circle-right\" style=\"font-size:30px;padding-right:15px;float:right\" onclick=\"next(\\''+e+'\\')\"></span>'+\n"+
								"						   '<span class=\"fa fa-arrow-circle-left\" style=\"font-size:30px;padding-right:15px;float:right\" onclick=\"last(\\''+e+'\\')\"></span>';\n"+
								"			}\n"+
								"			cellObj += 		'<div name=\"fubiaoElement\"  class=\"col-md-12 col-sm-12 col-lg-12\">'+\n"+
								"							'    <div class=\"contact-box\">'+\n"+
								"							'		<div class=\"row cell\">'+\n"+
								jsHtml1+
								jsHtml2+
								"							'		</div>'+\n"+
								"							'	</div>'+\n"+
								"							'</div>';\n"+
								"			}\n"+
								"	$(\"#\"+e).find(\"[id='TEST_FEE_INFO_FORM']\").html(cellObj);\n"+
								"}\n";
		return jspBuildString;
	}
	public static String updateElementJsForCC2(String Num,StringBuffer varJs,StringBuffer jsHtml1,StringBuffer jsHtml2){
		String jspBuildString = "		if(x=='fubiao"+Num+"'){\n" +
								"		//修改操作行样式\n" +
								"		$(\"#\"+x).find(\"[id='\"+e.id+\"']\").css(\"color\",\"red\");\n" +
								"		$(\"#\"+x).find(\"[id='\"+e.id+\"']\").attr(\"onclick\",\"\");\n" +
								"		$(\"#\"+x).find(\"[id='\"+e.id+\"']\").parent().parent().css(\"border-color\",\"red\");\n" +
								"		$(\"#\"+x).find(\"[id='\"+e.id+\"']\").parent().parent().addClass(\"CCUpdating\");\n" +
								"		$(\"#\"+x).find(\"[id='\"+e.id+\"']\").parent().attr(\"class\",\"row cell editing\");\n" +
								"		var xx=$(\"#\"+x).find(\"[id='\"+e.id+\"']\").parent();//当前操作行,所有下拉日期改变控件样式\n" +
								"		var obj1 ;\n"+
								varJs+
								jsHtml1+
								"		var pid = xx.attr(\"id\");\n" +
								"		elementsListSelectInitFunction(e);\n" +
								"		cardAndCardDateWidInitFunction(e);\n"+
								jsHtml2+
								"}\n";
		return jspBuildString;
	}

	public static String endFunction(){
		String jspBuildString = "	changeCssForApp1();\n" +
								//"	changeCssForApp2();\n" +
								"}\n";
		return jspBuildString;
	}

	public static String talkandreply(){
		String jspBuildString = "	<div class=\"commentbox\">\n"+
								/*"		<div class=\"col-sm-11\">\n"+
								"			<p style=\"margin-top:0;color:#000000;font-size:14px;height: 30px;line-height:  30px;float: left;\" title=\"请您评价\"><strong>请您评价</strong></p> \n"+
								"			<ul class=\"Star\" id=\"Star0\" datafield=\"55\">\n"+
								"				<fieldset id=\"star-num-0\" class=\"starability-slot\" style=\"width: 150px;\"> \n"+
								"				<input type=\"radio\" id=\"rate41-0\" name=\"rating0\" value=\"179\"> \n"+
								"				<label for=\"rate41-0\" title=\"极好\">179 stars</label> \n"+
								"				<input type=\"radio\" id=\"rate31-0\" name=\"rating0\" value=\"178\"> \n"+
								"				<label for=\"rate31-0\" title=\"好\">178 stars</label> \n"+
								"				<input type=\"radio\" id=\"rate21-0\" name=\"rating0\" value=\"177\"> \n"+
								"				<label for=\"rate21-0\" title=\"一般\">177 stars</label> \n"+
								"				<input type=\"radio\" id=\"rate11-0\" name=\"rating0\" value=\"175\"> \n"+
								"				<label for=\"rate11-0\" title=\"差\">175 stars</label> \n"+
								"				<input type=\"radio\" id=\"rate01-0\" name=\"rating0\" value=\"2\"> \n"+
								"				<label for=\"rate01-0\" title=\"极差\">2 stars</label>\n"+
								"				</fieldset>\n"+
								"			</ul>\n"+
								"		</div>\n"+*/
								"		<textarea cols=\"80\" rows=\"50\" placeholder=\"来说几句吧......\" class=\"mytextarea\" id=\"contentx\"></textarea>\n"+
								"		<div style=\"width:100%;display:inline-block\">\n"+
								"			<input type=\"button\" id=\"referData\" style=\"margin:0 auto;display:block;text-align:center\"  class=\"btn btn-success\" value=\"评论\" onclick=\"referDataxxxx()\"/>\n"+
								"		</div>\n"+
								"	</div>\n"+
								"	<span class=\"fa fa-arrow-down\" id=\"zhankai\" title=\"展开\" style=\"display:block;text-align:center;font-size:20px\" onclick=\"getDataxx()\"></span>\n"+
								"	<div class=\"comment-list\" style=\"text-align:left;margin:0 auto\">\n"+
								"		<div class=\"comment-info\">\n"+
								"			<div class=\"comment-right\" id=\"xxxxx\">\n"+
								"			</div>\n"+
								"		</div>\n"+
								"	</div>\n";
		return jspBuildString;
	}
	/**
     * 将接收的二进制流转换成图片保存
     *
     * @param imgByte
     *            二进制流
     * @param imgPath
     *            图片的保存路径
     * @param imgName
     *            图片的名称
     * @return 1：保存正常 0：保存失败
     */
    public static int saveToImgByStr(byte[] imgByte, String imgPath,
            String imgName) {
        int stateInt = 1;
        if (imgByte.length > 0) {
            try {
                File validateCodeFolder = new File(imgPath);
                if (!validateCodeFolder.exists()) {
                    validateCodeFolder.mkdirs();
                }
                // 将字符串转换成二进制，用于显示图片
                // 将上面生成的图片格式字符串 imgStr，还原成图片显示
                InputStream in = new ByteArrayInputStream(imgByte);
                File file = new File(imgPath, imgName);// 可以是任何图片格式.jpg,.png等
                FileOutputStream fos = new FileOutputStream(file);
                byte[] b = new byte[1024];
                int nRead = 0;
                while ((nRead = in.read(b)) != -1) {
                    fos.write(b, 0, nRead);
                }
                fos.flush();
                fos.close();
                in.close();

            } catch (Exception e) {
                stateInt = 0;
                e.printStackTrace();logger.error(e.getMessage(),e);
            } finally {
            }
        }
        return stateInt;
    }
    //fubiaoHtmlForGrid
    public static String fubiaoHtmlForGrid(String Num,String Title){
//    	String[] color = {"f0ad4e","307DE9","d9534f","5cb85c","5bc0de"};
//    	int columnNum = Integer.valueOf(Num)%5;
    	String fubiaoHtml = "<div id=\"fubiao"+Num+"\" name=\"fubiao\" class=\"CCFubiao\">\n"+
    						"<h3 class=\"CCFubiaoTitle\" style=\"display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;color:#666;cursor: pointer;margin:0 0 -40px 15px\">"+Title+"</h3>\n"+
    						"<div class=\"BTNGROUP\" style=\"padding:0 30px 0 0; display:inline-block;height: 35px;width:100%\">\n"+
							"<div name=\"button\" class=\"CCButton\" style=\"margin-right:10px;float:right;\">\n"+
//							"	<input type=\"button\" id=\"zhankai\"  class=\"btn btn-info CCButtonelement\" value=\"展开\" onclick=\"changeFunctionForGrid('fubiao"+Num+"')\"/>\n"+
							"</div>\n"+
							"<div class=\"CCSelect\" style=\"float:right;width:50%\">\n"+
							"</div>\n"+
							"</div>\n"+
							"<!--展示部分-->\n"+
							"<div class=\"row\" style=\"margin-left:0;padding: 0 15px 0 0;\" id=\"TEST_FEE_INFO_FORM\">\n"+
							"</div>\n"+
							"<!--展开部分-->\n"+
							"<div class=\"row TEST_FEE_INFO_FORM2 CCD_ROW\" id=\"TEST_FEE_INFO_FORM2\">\n"+
							"</div>\n"+
							"</div>\n";
		return fubiaoHtml;
	}


    public static String fubiaoHtml(String Num,String Title){
//    	String[] color = {"f0ad4e","307DE9","d9534f","5cb85c","5bc0de"};
//    	int columnNum = Integer.valueOf(Num)%5;
    	String fubiaoHtml = "<div id=\"fubiao"+Num+"\" name=\"fubiao\" class=\"CCFubiao\">\n"+
    						"<h3 class=\"CCFubiaoTitle CCD_TITLE\" >"+Title+"</h3><span id=\"zhankai\" class=\"fa fa-angle-right CCD_TITLE_BUTTON\" onclick=\"changeFunction('fubiao"+Num+"') \" title=\"展开\"></span><span id=\"xinzeng\" class=\"fa fa-plus-square-o CCD_TITLE_BUTTON\" onclick=\"addFunction('fubiao"+Num+"')\" title=\"新增\"></span>\n"+

    						"<!--展示部分-->\n"+
							"<div class=\"row\" style=\"margin-left:0;padding: 0 15px 0 0;margin-bottom:20px;\" id=\"TEST_FEE_INFO_FORM\">\n"+
							"</div>\n"+
							"<!--展开部分-->\n"+
							"<div class=\"row TEST_FEE_INFO_FORM2 CCD_ROW\" id=\"TEST_FEE_INFO_FORM2\">\n"+
							"</div>\n"+
							"</div>\n";
		return fubiaoHtml;
	}

    public static String CommentTextarea() {
    	String fubiaoHtml = "<div id=\"Comment\" name=\"Comment\" class=\"CCFubiao\">\n"+
							"		<h3 class=\"CCFubiaoTitle CCD_TITLE\">审批意见</h3>\n"+
							"		<textarea id='approveRemark' class='SHENPIYIJIANC form-control' rows='7' ></textarea>\n"+
							"</div>\n";
    	return fubiaoHtml;
	}

    public static String CommentHtml(){
    	String[] color = {"5bc0de"};
    	int columnNum = 0;
    	String fubiaoHtml = "<div id=\"Comment\" name=\"Comment\" class=\"CCFubiao\">\n"+
    						"<h3 class=\"CCFubiaoTitle CCD_TITLE\">审批记录</h3><span id=\"zhankaiComment\" class=\"fa fa-angle-right CCD_TITLE_BUTTON\" onclick=\"changeComment()\" title=\"展开\"></span>\n"+

							"<!--展开部分-->\n"+
							"<div class=\"row TEST_FEE_INFO_FORM2 CCD_ROW\" id=\"CommentContent\">\n"+
							"<table id=\"LC_SHENPI_LIST_List\"></table>\n"+
							"</div>\n"+
							"</div>\n";
		return fubiaoHtml;
	}

    public static String ParamByFubiao(String Num){
    	String fubiaoHtml = "//当前页和一次显示多少条数据(单条记录默认一条)\n"+
							"var Currentpage1"+Num+" = 0;\n"+
							"var pagesize1"+Num+" = 1;\n"+
							"var Currentpage2"+Num+" = 0;//(展开数据最大100条)\n"+
							"var pagesize2"+Num+" = 100;\n"+
							"//当前页和一次显示多少条数据\n"+
							"var Currentpage0"+Num+" = 0;\n"+
							"var pagesize0"+Num+" = 1;\n"+
							"//状态变量\n"+
							"var youxiao"+Num+" = 'Y';\n"+
							"var zuixin"+Num+" = null;\n"+
							"var newElementNum"+Num+" = 0;\n";
    	return fubiaoHtml;
    }
    public static String ParamByFubiaoForGrid(String Num){
    	String fubiaoHtml = "//当前页和一次显示多少条数据(单条记录默认一条)\n"+
							"var Currentpage1"+Num+" = 0;\n"+
							"var pagesize1"+Num+" = 1;\n"+
							"var Currentpage2"+Num+" = 0;//(展开数据最大100条)\n"+
							"var pagesize2"+Num+" = 1000;\n"+
							"//当前页和一次显示多少条数据\n"+
							"var Currentpage0"+Num+" = 0;\n"+
							"var pagesize0"+Num+" = 1;\n"+
							"//状态变量\n"+
							"var youxiao"+Num+" = 'Y';\n"+
							"var zuixin"+Num+" = null;\n"+
							"var newElementNum"+Num+" = 0;\n";
    	return fubiaoHtml;
    }
    public static StringBuffer SimpleJsByFubiao(String Num){
    	StringBuffer fubiaoHtml = new StringBuffer();
    	fubiaoHtml.append("function youxiaoFunction(e){\n");
    	for (int i = 1; i <= Integer.valueOf(Num); i++) {
    		fubiaoHtml.append("	if(e=='fubiao"+i+"'){\n");
    		fubiaoHtml.append("		Currentpage1"+i+"=0;\n");
    		fubiaoHtml.append("		zuixin"+i+"=null;\n");
    		fubiaoHtml.append("		youxiao"+i+"='Y';\n");
    		fubiaoHtml.append("	}\n");
		}
    	fubiaoHtml.append("	loadDataStart2(e);\n}\n");
    	fubiaoHtml.append("function zuixinFunction(e){\n");
    	for (int i = 1; i <= Integer.valueOf(Num); i++) {
    		fubiaoHtml.append("	if(e=='fubiao"+i+"'){\n");
    		fubiaoHtml.append("		Currentpage1"+i+"=0;\n");
    		fubiaoHtml.append("		youxiao"+i+"=null;\n");
    		fubiaoHtml.append("		zuixin"+i+"='Y';\n");
    		fubiaoHtml.append("	}\n");
		}
    	fubiaoHtml.append("	loadDataStart2(e);\n}\n");
    	fubiaoHtml.append("function allFunction(e){\n");
    	for (int i = 1; i <= Integer.valueOf(Num); i++) {
    		fubiaoHtml.append("	if(e=='fubiao"+i+"'){\n");
    		fubiaoHtml.append("		Currentpage1"+i+"=0;\n");
    		fubiaoHtml.append("		youxiao"+i+"=null;\n");
    		fubiaoHtml.append("		zuixin"+i+"=null;\n");
    		fubiaoHtml.append("	}\n");
		}
    	fubiaoHtml.append("	loadDataStart2(e);\n}\n");
    	fubiaoHtml.append("function next(e){\n");
    	for (int i = 1; i <= Integer.valueOf(Num); i++) {
    		fubiaoHtml.append("	if(e=='fubiao"+i+"'){\n");
    		fubiaoHtml.append("		Currentpage1"+i+"--;\n");
    		fubiaoHtml.append("		loadDataStart2(e);\n");
    		fubiaoHtml.append("	}\n");
		}
    	fubiaoHtml.append("	loadDataStart2(e);\n}\n");
    	fubiaoHtml.append("function last(e){\n");
    	for (int i = 1; i <= Integer.valueOf(Num); i++) {
    		fubiaoHtml.append("	if(e=='fubiao"+i+"'){\n");
    		fubiaoHtml.append("		Currentpage1"+i+"--;\n");
    		fubiaoHtml.append("		loadDataStart2(e);\n");
    		fubiaoHtml.append("	}\n");
		}
    	fubiaoHtml.append("	loadDataStart2(e);\n}\n");
    	return fubiaoHtml;
    }
    //CardAndCardFormBeansUtil.getGridFormInitFunction
    public static String getGridFormInitFunction(SysRequestParam request, SysFormconfigCache formconfig, StringBuffer[] sbs,String isApp,String Num) {
			String isView = request.getIsView();
			String temp = "";
			String filterdata = "";
			List<SysFormWhereCache> wheres = formconfig.getWheres();
			//获取过滤区参数数据 参数formid生成规则为gridid+filter
			int xnum = 0;
			for(SysFormWhereCache where:wheres){
				sbs[48].append(SysCardFormBeansUtil.getNbsp(0)+"var "+where.getFormWhereValue()+"='';"+SysCardFormBeansUtil.NEW_LINE_ONLY);
			}

			temp+=SysCardFormBeansUtil.getNbsp(0)+"function grid_"+formconfig.getFormDefCode()+"_fun(pageReqeust){"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(1)+"var _filterdata={}"+SysCardFormBeansUtil.NEW_LINE;
			for(int i=0;i<formconfig.getFilter().getFilterColumns().size();i++){
				if (formconfig.getFilter().getFilterColumns().get(i).getPojo().getGridColumnColSpan()!=null&&formconfig.getFilter().getFilterColumns().get(i).getPojo().getGridColumnColSpan().equals("1")) {
					temp +=SysCardFormBeansUtil.getNbsp(2)+"var "+formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename()+" = \"\";\n";
					temp +=SysCardFormBeansUtil.getNbsp(2)+"if(filterParam."+formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename()+"!=undefined){\n";
					temp +=SysCardFormBeansUtil.getNbsp(3)+""+formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename()+" = filterParam."+formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename()+";\n";
					temp +=SysCardFormBeansUtil.getNbsp(2)+"}\n";
				}
			}
			if (formconfig.getFilter().getFilterColumns().size()>0) {
				for(int i=0;i<formconfig.getFilter().getFilterColumns().size();i++){
					SysFormColumnCache sysFormColumn = formconfig.getFilter().getFilterColumns().get(i).getColumn();
					if (i==0) {
						temp +=SysCardFormBeansUtil.getNbsp(3)+"var "+ChangeCode.getUniqueCode(formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormEntityTablename(),formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename())+"=youxiao"+Num+";\n";
					}else if (i==1) {
						temp +=SysCardFormBeansUtil.getNbsp(3)+"var "+ChangeCode.getUniqueCode(formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormEntityTablename(),formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename())+"=zuixin"+Num+";\n";
					}
					filterdata +=ChangeCode.getUniqueCode(formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormEntityTablename(),formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename())+":"+ChangeCode.getUniqueCode(formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormEntityTablename(),formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename())+",";
				}
			}
			if (filterdata.length()>0) {
				temp+=SysCardFormBeansUtil.getNbsp(2)+"_filterdata={"+filterdata.substring(0, filterdata.length()-1)+"};"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			}
			String whereObj = getParamStringJson(wheres,request,null);
			String whereObjMst = SysCardFormBeansUtil.getParamStringJsonMst(wheres,request);
			logger.info(formconfig.getParams()+"");

			//过滤参数定义
			String whereParams = getWhereParams(wheres,request,null);
			//过滤参数赋值
			String requestParam = getRequestParam(wheres,request);

			temp  += SysCardFormBeansUtil.getNbsp(1)+SysFormGeneralExecSqlCache.getDataGridParamsJsStr(formconfig.getParams(), null, request);
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"var requestParam={};"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			if (wheres.size()>0) {
				temp  +=SysCardFormBeansUtil.getNbsp(0)+"requestParam = "+requestParam+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			}else {
				temp  +=SysCardFormBeansUtil.getNbsp(2)+"requestParam = "+whereObj+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			}
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.containerParam=containerParam_"+formconfig.getFormDefId()+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.paramsMap=paramsMap;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.requestParam=requestParam;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.filter=_filterdata;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.userIds=param_empIds;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.formId=_formId_"+formconfig.getFormDefId()+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.isView=null;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.offset=Currentpage1"+Num+"*pagesize1"+Num+";"+SysCardFormBeansUtil.NEW_LINE;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.limit=pagesize1"+Num+";"+SysCardFormBeansUtil.NEW_LINE;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"if(heightGadedata_"+formconfig.getFormDefId()+"!=null&&heightGadedata_"+formconfig.getFormDefId()+"!=undefined){"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(2)+"pageReqeust.heightGrade = heightGadedata_"+formconfig.getFormDefId()+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"}"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"queryParams = JSON.stringify(pageReqeust);"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"return queryParams;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(0)+"}"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			return temp;
	}



    public static String getGridFormInitFunctionx(SysRequestParam request, SysFormconfigCache formconfig, StringBuffer[] sbs,String isApp,String Num) {
		// TODO 自动生成方法存根
    	String isView = request.getIsView();
		String temp = "";
		String filterdata = "";
		List<SysFormWhereCache> wheres = formconfig.getWheres();
		//获取过滤区参数数据 参数formid生成规则为gridid+filter
		int xnum = 0;
		for(SysFormWhereCache where:wheres){
			sbs[48].append(SysCardFormBeansUtil.getNbsp(0)+"var "+where.getFormWhereValue()+"='';"+SysCardFormBeansUtil.NEW_LINE_ONLY);
		}

		temp+=SysCardFormBeansUtil.getNbsp(0)+"function grid_"+formconfig.getFormDefCode()+"_funx(pageReqeust){"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		temp+=SysCardFormBeansUtil.getNbsp(1)+"var _filterdata={}"+SysCardFormBeansUtil.NEW_LINE;

		for(int i=0;i<formconfig.getFilter().getFilterColumns().size();i++){
			if (formconfig.getFilter().getFilterColumns().get(i).getPojo().getGridColumnColSpan()!=null&&formconfig.getFilter().getFilterColumns().get(i).getPojo().getGridColumnColSpan().equals("1")) {
				temp +=SysCardFormBeansUtil.getNbsp(2)+"var "+formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename()+" = \"\";\n";
				temp +=SysCardFormBeansUtil.getNbsp(2)+"if(filterParam."+formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename()+"!=undefined){\n";
				temp +=SysCardFormBeansUtil.getNbsp(3)+""+formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename()+" = filterParam."+formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename()+";\n";
				temp +=SysCardFormBeansUtil.getNbsp(2)+"}\n";
			}
		}
		if (formconfig.getFilter().getFilterColumns().size()>0) {
			for(int i=0;i<formconfig.getFilter().getFilterColumns().size();i++){
				SysFormColumnCache sysFormColumn = formconfig.getFilter().getFilterColumns().get(i).getColumn();
				if (i==0) {
					temp +=SysCardFormBeansUtil.getNbsp(3)+"var "+ChangeCode.getUniqueCode(formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormEntityTablename(),formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename())+"=youxiao"+Num+";\n";
				}else if (i==1) {
					temp +=SysCardFormBeansUtil.getNbsp(3)+"var "+ChangeCode.getUniqueCode(formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormEntityTablename(),formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename())+"=zuixin"+Num+";\n";
				}
				filterdata +=ChangeCode.getUniqueCode(formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormEntityTablename(),formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename())+":"+ChangeCode.getUniqueCode(formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormEntityTablename(),formconfig.getFilter().getFilterColumns().get(i).getColumn().getPojo().getFormFieldTablename())+",";
			}
		}
		if (filterdata.length()>0) {
			temp+=SysCardFormBeansUtil.getNbsp(2)+"_filterdata={"+filterdata.substring(0, filterdata.length()-1)+"};"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		}
		String whereObj = getParamStringJson(wheres,request,null);
		sbs[68].append(getParamStringJson2(wheres,request,null));
		String whereObjMst = SysCardFormBeansUtil.getParamStringJsonMst(wheres,request);

		//过滤参数定义
		String whereParams = getWhereParams(wheres,request,null);
		//过滤参数赋值
		String requestParam = getRequestParam(wheres,request);

		logger.info(formconfig.getParams()+"");
		temp  += SysCardFormBeansUtil.getNbsp(1)+SysFormGeneralExecSqlCache.getDataGridParamsJsStr(formconfig.getParams(), null, request);
		temp  +=SysCardFormBeansUtil.getNbsp(1)+"var requestParam={};"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		if (wheres.size()>0) {
			sbs[40].append(whereParams) ;
			temp  +=SysCardFormBeansUtil.getNbsp(0)+"requestParam = "+requestParam+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		}else {
			temp  +=SysCardFormBeansUtil.getNbsp(2)+"requestParam = "+whereObj+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		}
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.containerParam=containerParam_"+formconfig.getFormDefId()+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.paramsMap=paramsMap;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.requestParam=requestParam;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.filter=_filterdata;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.userIds=param_empIds;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.formId=_formId_"+formconfig.getFormDefId()+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.isView=null;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			if(isApp.equals("CARDANDCARD")){
				temp+=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.offset=Currentpage2"+Num+"*pagesize2"+Num+";"+SysCardFormBeansUtil.NEW_LINE;
				temp+=SysCardFormBeansUtil.getNbsp(1)+"pageReqeust.limit=pagesize2"+Num+";"+SysCardFormBeansUtil.NEW_LINE;
			}

			temp  +=SysCardFormBeansUtil.getNbsp(1)+"if(heightGadedata_"+formconfig.getFormDefId()+"!=null&&heightGadedata_"+formconfig.getFormDefId()+"!=undefined){"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(2)+"pageReqeust.heightGrade = heightGadedata_"+formconfig.getFormDefId()+";"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"}"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"queryParams = JSON.stringify(pageReqeust);"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(1)+"return queryParams;"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			temp  +=SysCardFormBeansUtil.getNbsp(0)+"}"+SysCardFormBeansUtil.NEW_LINE_ONLY;
			return temp;
	}

	private static String getRequestParam(List<SysFormWhereCache> wheres,
			SysRequestParam request) {
		String whereObj = "";
		for(SysFormWhereCache where:wheres){
			String temp ="";
			if("parameter".equals(where.getFormWhereValueType())){
				String _value = where.getFormWhereValue().toUpperCase()+"_parameter";
				temp += ""+where.getFormWhereValue().toUpperCase()+":"+""+_value+",";
			}else if("urlParam".equals(where.getFormWhereValueType())){
				String _value = where.getFormWhereValue().toUpperCase()+"_urlParam";
				temp += ""+where.getFormWhereValue().toUpperCase()+":"+""+_value+",";
			}else if("session".equals(where.getFormWhereValueType())){
				String _value = where.getFormWhereValue().toUpperCase()+"_session";
				temp += ""+where.getFormWhereValue().toUpperCase()+":"+"'"+_value+"',";
			}
			whereObj+=temp;
		}
		//判断固定流程发过来的参数 _workflowBusPrimaryKeyParamName
		String _workflowBusPrimaryKeyParamName = request.get_workflowBusPrimaryKeyParamName();//(String)request.getAttribute("_workflowBusPrimaryKeyParamName");
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

	private static String getWhereParams(List<SysFormWhereCache> wheres,
			SysRequestParam request, Object object) {
		String whereObj = "";
		for(SysFormWhereCache where:wheres){
			if("parameter".equals(where.getFormWhereValueType())){
				whereObj += "var "+where.getFormWhereValue().toUpperCase()+"_parameter;\n";
			}else if("urlParam".equals(where.getFormWhereValueType())){
				whereObj += "var "+where.getFormWhereValue().toUpperCase()+"_urlParam='${param."+where.getFormWhereValue()+"}';\n";
			}else if("session".equals(where.getFormWhereValueType())){
				whereObj += "var "+where.getFormWhereValue().toUpperCase()+"_sessionParam;\n";
			}
		}
		return whereObj;
	}

	public static String formCardAndCardHead(String fileName,String path) {
		String temp = "<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n"+
					  "<%@ include file=\"/common/newcardandcard.jsp\" %>\n"+
					  "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"+
					  "<html>\n"+
					  "<head>\n"+
					  "<meta charset=\"utf-8\">\n"+
					  "<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n"+
					  "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"+
					  "<meta name =\"viewport\" content =\"initial-scale=1, maximum-scale=3, minimum-scale=1, user-scalable=no\">\n"+
					  "<style type=\"text/css\">\n"+
					  "html,body{min-height: 100%;}\n"+
					  ".row{padding:0 30px 0 15px}\n"+
					  ".deleteButton:hover {color: red}\n"+
					  ".saveButton:hover {color: red}\n"+
					  ".updateButton:hover {color: red}\n"+
					  ".contact-box{padding:5px !important ;margin-bottom:10px !important;}\n"+
					  "</style>\n"+
					  "<script type=\"text/javascript\" src=\"<%=request.getContextPath() %>/jsp/formbuild/"+path+fileName+".js\"></script>\n"+
					  "</head>\n"+
					  "<body class=\"gray-bg\" >\n" +
					  "<div class=\"container-fluid\" id=\"CardAndCardForm\" style=\"height: 94%;overflow-y: auto;overflow-x:  hidden;padding: 0px;\">";
		return temp;
	}

	public static String formCardAndCardJsHead(){
		String jspBuildString = "<script>\n";
		return jspBuildString;
	}
	public static String getParamStringJson(List<SysFormWhereCache> wheres ,SysRequestParam request,String mstFormType){
		String whereObj = "";
		for(SysFormWhereCache where:wheres){
			String temp ="";
			if("parameter".equals(where.getFormWhereValueType())){
//				String _value = request.getParameter(where.getFormWhereValue());
				if (mstFormType!=null && mstFormType.equals("follow")) {
					String _value = where.getFormWhereValue();
					temp += ""+where.getFormWhereValue()+":"+_value+",";
				}else {
					String _value = where.getFormWhereValue().toUpperCase()+"_parameter";
					temp += ""+where.getFormWhereValue()+":"+""+_value+",";
				}
			}else if("urlParam".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				if (mstFormType!=null && mstFormType.equals("follow")) {
					String _value = where.getFormWhereValue();
					temp += ""+where.getFormWhereValue()+":"+_value+",";
				}else {
					String _value = where.getFormWhereValue().toUpperCase()+"_urlParam";
					temp += ""+where.getFormWhereValue()+":"+"'"+_value+"',";
				}
			}else if("session".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				if (mstFormType!=null && mstFormType.equals("follow")) {
					String _value = where.getFormWhereValue();
					temp += ""+where.getFormWhereValue()+":"+_value+",";
				}else {
					String _value = where.getFormWhereValue().toUpperCase()+"_session";
					temp += ""+where.getFormWhereValue()+":"+"'"+_value+"',";
				}
			}
			whereObj+=temp;
		}
		//判断固定流程发过来的参数 _workflowBusPrimaryKeyParamName
		String _workflowBusPrimaryKeyParamName = request.get_workflowBusPrimaryKeyParamName();//(String)request.getAttribute("_workflowBusPrimaryKeyParamName");
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
	public static String getParamStringJson2(List<SysFormWhereCache> wheres ,SysRequestParam request,String mstFormType){
		String whereObj = "";
		for(SysFormWhereCache where:wheres){
			String temp ="";
			if("parameter".equals(where.getFormWhereValueType())){
//				String _value = request.getParameter(where.getFormWhereValue());
				String _value = where.getFormWhereValue().toUpperCase()+"_parameter";
				temp += "var "+_value+"='${param."+where.getFormWhereValue()+"}';\n";
			}else if("urlParam".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				String _value = where.getFormWhereValue().toUpperCase()+"_urlparam";
				temp += "var "+_value+"= '${param."+where.getFormWhereValue()+"}';\n";
			}else if("session".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				String _value = where.getFormWhereValue().toUpperCase()+"_session";
				temp += "var "+_value+"= '${sessionScope."+where.getFormWhereValue()+"}';\n";
			}
			whereObj+=temp;
		}
		return whereObj;
	}
	public static String getParamStringJson3(SysFormWhereCache where ,HttpServletRequest request,String mstFormType){
			String temp ="";
			if("parameter".equals(where.getFormWhereValueType())){
//				String _value = request.getParameter(where.getFormWhereValue());
				temp = where.getFormWhereValue()+"_parameter";
			}else if("urlParam".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				temp = where.getFormWhereValue()+"_urlParam";
			}else if("session".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				temp = where.getFormWhereValue()+"_session";
			}
		return temp;
	}
	public static String getDefaultValue(SysRequestParam request,String dataFromType,String dataFromValue){
		//处理js函数
		 if("session".equals(dataFromType)){
			String sessionParamValue = dataFromValue;
			String _value  = "";
			_value =getSessionValue(request,sessionParamValue,null);//获取session对应值
			return _value;
		}else if("global".equals(dataFromType)){
			String _value = "";//获取全局变量对应值
			return _value;
		}else if("parameter".equals(dataFromType)||"request".equals(dataFromType)){
			return dataFromValue.toUpperCase()+"_parameter";// request.getParameter(dataFromValue);
		}else if("constant".equals(dataFromType)){
			String _value =dataFromValue;
			return _value;
		}else if("sql".equals(dataFromType)){
			String _value =""; //sql获取对应的数据
			return _value;
		}else if("currentdate".equals(dataFromType)){ //当前时间
			String _value =""; //sql获取对应的数据
		    java.text.DateFormat format1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		    _value = "'"+format1.format(new Date())+"'";
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
		}else if("urlParam".equals(dataFromType)){ //卡片参数
			String _value = dataFromValue.toUpperCase()+"_urlparam";
			return _value;
		}

		return null;
	}
	public static String getSessionValue(SysRequestParam request,String param,UserObject user){
		if(param==null){
			return null;
		}
		HttpSession session  = request.getSession();
		String user1 = "";
		if (param.equals("userId")) {
			param = "userid";
		}
		logger.info(session.getAttribute("username")+"");
		logger.info(session.getAttribute("userid")+"");
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

	public static String setValueJs(String ColumnId,String value){
		String temp = "var value = "+value+";\n"+
					  "var obj0 = obj.find(\"[name='"+ColumnId+"']\");\n"+
					  "var id = obj0.attr(\"id\");\n"+
					  "if(obj0.attr(\"styleType\")==\"dateTime\"){\n"+
					  "		if(value.indexOf(\":\") > -1){\n"+
					  "			if(value.indexOf(\"-\") > -1){\n"+
					  "			 	obj0.val(formatDatebox(value,id));\n"+
					  "			}else{\n"+
					  "				obj0.val(value);\n"+
					  "			}\n"+
					  "		}else{\n"+
					  "			if(value==null || value==\"\"|| value==\"null\"){\n"+
					  "				obj0.val(value);\n"+
					  "			}else{\n"+
					  "			    var date = new Date(parseInt(value)).Format(\"yyyy-MM-dd hh:mm:ss\");\n"+
					  "				obj0.val(formatDatebox(date,id));\n"+
					  "			}\n"+
					  "		}\n"+
					  "}else if(obj0.attr(\"styleType2\")==\"search\"){\n"+
					  "		obj0.selectpicker('val', value);\n"+
					  "}else{\n"+
					  "    if(obj0.attr(\"styleType\")==\"inputSelect\"){\n"+
					  "        var dataField = obj0.attr(\"dataField1\");\n"+
					  "        var DictName = obj0.attr(\"DictName\");\n"+
					  "        selectSqlDictEntryByValue(id,value,dataField,DictName);\n"+
					  "    }else{\n"+
					  "		   obj0.val(value);\n"+
					  "    }\n"+
					  "}\n";
		return temp;
	}

	public static Object getCardFormGridGroupStart(String groupName,
			String isApp) {
		String htmlString = "'<h3 class=\"CCFubiaoTitle CCD_TITLE\">"+groupName+"</h3>'+\n"+
							"'<div class=\"row cell CCM_GROUP\">'+\n";
		return htmlString;
	}

	public static StringBuffer formCardAndCardHead1(String formDefCode, String path11,String isApp) {
		StringBuffer temp = new StringBuffer();
		temp.append("<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n");
		temp.append("<%@ include file=\"/common/newcardandcard.jsp\" %>\n");
		temp.append("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
		temp.append("<html>\n");
		temp.append("<head>\n");
		temp.append("<meta charset=\"utf-8\">\n");
		temp.append("<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n");
		temp.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
		temp.append("<meta name =\"viewport\" content =\"initial-scale=1, maximum-scale=3, minimum-scale=1, user-scalable=no\">\n");
		temp.append("<style type=\"text/css\">\n");
		temp.append("html,body{min-height: 100%;}\n");
		temp.append(".row{padding:0 30px 0 15px}\n");
		temp.append(".deleteButton:hover {color: red}\n");
		temp.append(".saveButton:hover {color: red}\n");
		temp.append(".updateButton:hover {color: red}\n");
		temp.append(".contact-box{padding:5px !important ;margin-bottom:10px !important;}\n");
		temp.append(".maodian{height:30px;width:100px;display:block;text-align: center;font-size:15px;margin:0 0 20px 0;cursor:pointer !important;}\n");
		temp.append(".maodianA{text-decoration:none !important;}\n");
		temp.append("#maodianS:before\n");
		temp.append("{ \n");
		temp.append("	content: '';\n");
		temp.append("    position: absolute;\n");
		temp.append("    top: 0;\n");
		temp.append("    left: 23px;\n");
		temp.append("    height: 100%;\n");
		temp.append("    width: 2px;\n");
		temp.append("	border:2px dashed pink;\n");
		temp.append("	z-index:1px\n");
		temp.append("}\n");
		temp.append("</style>\n");
		temp.append("<script type=\"text/javascript\" src=\"<%=request.getContextPath() %>/jsp/formbuild/"+path11+formDefCode+".js\"></script>\n");
		if (isApp!=null&&isApp.equals("APP")) {
			temp.append("<link rel=\"stylesheet\" href=\"/myehr/common/js/layer/mobile/need/layer.css\" type=\"text/css\"></link>");
			temp.append("<script type=\"text/javascript\" src=\"/myehr/common/js/layer/mobile/layer.js\"></script>");
		} else {
			temp.append("<script type=\"text/javascript\" src=\"/myehr/common/js/layer/layer.js\"></script>");
		}
		temp.append("</head>\n");
		temp.append("<body class=\"gray-bg\">\n");
	return temp;
	}

	public static Object getDictInfoByForm(SysFormconfigCache form,ISysformconfigService sysformconfigService) {
		List<SysFormColumnCache> columns = form.getColumns();
		StringBuffer dicts = new StringBuffer();
		Map map = new HashMap();
		for (SysFormColumnCache sysFormColumn : columns) {
			if (sysFormColumn.getFormColumnGuiType()!=null&&sysFormColumn.getFormColumnGuiType().equals("2")) {
				SysFormComboboxCache combobox =  (SysFormComboboxCache)sysFormColumn.getFormColumGui();
				String name = combobox.getComboboxGuiInitValue();
				if (map.get(name)==null) {
					dicts.append(getDictDatas(combobox,sysformconfigService));
					map.put(name, "true");
				}
			}
		}
		return dicts;
	}

	public static Object getDictInfoByForms(List<SysFormconfigCache> forms,ISysformconfigService sysformconfigService) {
		List<SysFormColumnCache> columns = new ArrayList<SysFormColumnCache>();
		for (SysFormconfigCache formCache : forms) {
			columns.addAll(formCache.getColumns());
		}
		StringBuffer dicts = new StringBuffer();
		Map map = new HashMap();
		for (SysFormColumnCache sysFormColumn : columns) {
			if (sysFormColumn.getFormColumnGuiType()!=null&&sysFormColumn.getFormColumnGuiType().equals("2")) {
				SysFormComboboxCache combobox =  (SysFormComboboxCache)sysFormColumn.getFormColumGui();
				String name = combobox.getComboboxGuiInitValue();
				if (map.get(name)==null) {
					dicts.append(getDictDatas(combobox,sysformconfigService));
					map.put(name, "true");
				}
			}
		}
		return dicts;
	}

	public static Object getDictNameByForms(List<SysFormconfigCache> forms,ISysformconfigService sysformconfigService) {
		List<SysFormColumnCache> columns = new ArrayList<SysFormColumnCache>();
		for (SysFormconfigCache formCache : forms) {
			columns.addAll(formCache.getColumns());
		}
		StringBuffer dicts = new StringBuffer();
		Map map = new HashMap();
		for (SysFormColumnCache sysFormColumn : columns) {
			if (sysFormColumn.getFormColumnGuiType()!=null&&sysFormColumn.getFormColumnGuiType().equals("2")) {
				SysFormComboboxCache combobox =  (SysFormComboboxCache)sysFormColumn.getFormColumGui();
				String name = combobox.getComboboxGuiInitValue();
				if (map.get(name)==null) {
					dicts.append(getDictNameDatas(combobox,sysformconfigService));
					map.put(name, "true");
				}
			}
		}
		return dicts;
	}

	private static String getDictDatas(SysFormComboboxCache combobox, ISysformconfigService sysformconfigService) {
		String dictStr = "var "+combobox.getComboboxGuiInitValue()+"={";
		try {
			if(combobox.getComboboxGuiInitType().equals("sql")){
				List<DictData> list = sysformconfigService.getCardDictDataByDictTypeCode(combobox.getComboboxGuiInitValue(),"sql");
				if (list.size()>0) {
					for (int i = 0; i < list.size(); i++) {
						if (i==0) {
							dictStr+="'"+list.get(i).getCode()+"':'"+list.get(i).getName()+"'";
						} else {
							dictStr+=",'"+list.get(i).getCode()+"':'"+list.get(i).getName()+"'";
						}
					}
					return dictStr+"};\n";
				}
			}else if(combobox.getComboboxGuiInitType().equals("dict")){
				List<DictData> list = sysformconfigService.getCardDictDataByDictTypeCode(combobox.getComboboxGuiInitValue(),"dict");
				if (list!=null && list.size()>0) {
					int i=0;
					for (DictData sysDictEntryExpand : list) {
						if (i==0) {
							dictStr+="'"+sysDictEntryExpand.getCode()+"':'"+sysDictEntryExpand.getName()+"'";
						} else {
							dictStr+=",'"+sysDictEntryExpand.getCode()+"':'"+sysDictEntryExpand.getName()+"'";
						}
						i++;
					}
					return dictStr+"};\n";
				}
			}
			return "";
		} catch (Exception e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
			return "";
		}
	}

	private static String getDictNameDatas(SysFormComboboxCache combobox, ISysformconfigService sysformconfigService) {
		String dictStr = "var "+combobox.getComboboxGuiInitValue()+"_ByName={";
		try {
			if(combobox.getComboboxGuiInitType().equals("sql")){
				List<DictData> list = sysformconfigService.getCardDictDataByDictTypeCode(combobox.getComboboxGuiInitValue(),"sql");
				if (list.size()>0) {
					for (int i = 0; i < list.size(); i++) {
						if (i==0) {
							dictStr+="'"+list.get(i).getName()+"':'"+list.get(i).getCode()+"'";
						} else {
							dictStr+=",'"+list.get(i).getName()+"':'"+list.get(i).getCode()+"'";
						}
					}
					return dictStr+"};\n";
				}
			}else if(combobox.getComboboxGuiInitType().equals("dict")){
				List<DictData> list = sysformconfigService.getCardDictDataByDictTypeCode(combobox.getComboboxGuiInitValue(),"dict");
				if (list!=null && list.size()>0) {
					int i=0;
					for (DictData sysDictEntryExpand : list) {
						if (i==0) {
							dictStr+="'"+sysDictEntryExpand.getName()+"':'"+sysDictEntryExpand.getCode()+"'";
						} else {
							dictStr+=",'"+sysDictEntryExpand.getName()+"':'"+sysDictEntryExpand.getCode()+"'";
						}
						i++;
					}
					return dictStr+"};\n";
				}
			}
			return "";
		} catch (Exception e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
			return "";
		}
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
	public static String getRadiolistHtml(String classType, String id, String name, String vtype, String emptyText, boolean isRequired, boolean isValueChange, boolean isClick, boolean isValidation, boolean isDisabled, String entityName,
			String width, String repeatItems, String textField, String valueField, String repeatdirection, String dictTypeId, String repeatLayout, String url, String data, String dataField,long formId,String lableName) {
		// TODO 自动生成方法存根
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"()\"":"";
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

		String tb = "  '	<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\" >'+\n"+
					"  '		<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">'+\n"+
					"  '			<label style=\"float:left;font-size:14px;width:100px;\">"+lableName+": </label>'+\n"+
					"  '			<ul id=\"" + id + "\" name=\"" + name + "\" class=\"RADIOT\" " + emptyTextHtml
						+ vtypeHtml+ valueChangeFunName + valueClickFunName + requiredHtml
						+ isValidationFunName + isDisabledHtml + styleHtml+ repeatItemsHtml + textFieldHtml + valueFieldHtml
						+ repeatdirectionHtml + dictTypeIdHtml + repeatLayoutHtml+ urlHtml + dataHtml + dataFieldHtml + "></ul>'+\n"+
					"  '		</div>'+\n"+
					"  '	</div>'+\n";

		return tb;
	}

	public static StringBuffer getFunctionForTitle(String formDefSaveTable,String formCode) {
	    String titleFunction = "";
		if(formDefSaveTable!=null){
			String reg2="(\\[[^\\]]*\\])";
		    Pattern p2 = Pattern.compile(reg2);
		    Matcher m2 = p2.matcher(formDefSaveTable);
		    while(m2.find()){
		    	String temp = m2.group();
		    	String tempx = "["+temp.substring(1, temp.length()-1)+"]";
		    	logger.info(temp);
		    	String[] temps = temp.split(":");
		    	String value = "";
		    	if (temps[0].equals("[p")) {
					value = "$(\"[id='"+temps[1].substring(0,temps[1].length()-1)+"']\").val()";
				}else if (temps[0].equals("[c")) {
					value = "'"+temps[1].substring(0,temps[1].length()-1)+"'";
				}else if (temps[0].equals("[a")) {
					value = temps[1].substring(0,temps[1].length()-1);
				}
		    	formDefSaveTable = formDefSaveTable.replace(temp, value);
		    }
		    titleFunction = formDefSaveTable.replaceAll("\\|", "+");
		}else {
			titleFunction = "''";
		}
	    StringBuffer jsBuffer = new StringBuffer();
	    jsBuffer.append("function getActTitle_"+formCode+"(){\n");
	    jsBuffer.append("	titleModel = "+titleFunction+";\n");
	    jsBuffer.append("	return titleModel;\n");
	    jsBuffer.append("}\n");
	    jsBuffer.append("\n");
	    jsBuffer.append("\n");
	    jsBuffer.append("\n");
	    jsBuffer.append("\n");
	    jsBuffer.append("\n");
	    jsBuffer.append("\n");
		return jsBuffer;
	}
}
