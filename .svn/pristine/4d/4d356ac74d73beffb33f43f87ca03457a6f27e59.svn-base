package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.ecache.impl.EhCacheTestServiceImpl;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpand;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;


/**
 * 静态常用处理方法及属性
 * @author Administrator
 *
 */
public class SysCardFormBeansUtil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	//字段存储脚本长度
	public static final int HTML_SILZE = 71;
	//卡片式表单页面开始
	public static final String CARD_FORM_START="<div id=\"form1\" style=\"width:100%;\">\n";
	
	//卡片式表单页面开始
	public static final String CARD_FORM_END="</div>";
	
	//卡片式表普通表不分组的开始代码
//	public static final String CARD_FORM_TABLE_START = SysCardFormBeansUtil.getNbsp(2)+"<table style=\"width:100%;table-layout:fixed;padding-top:5px;padding-right:5px;\">\n";
	public static final String CARD_FORM_TABLE_START = SysCardFormBeansUtil.getNbsp(2)+"<div class='row cell'>\n";
	
	//卡片式表普通表不分组的结束代码
	public static final String CARD_FORM_TABLE_END = SysCardFormBeansUtil.getNbsp(2)+"</div>\n";
	
	//卡片式普通表单的TR开始i
//	public static final String CARD_FORM_TABLE_TR_START = SysCardFormBeansUtil.getNbsp(3)+"<tr style=\"height:65px\">\n"; 
	public static final String CARD_FORM_TABLE_TR_START = SysCardFormBeansUtil.getNbsp(3)+"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"; 
	
	//卡片式普通表单的TR结束
	public static final String CARD_FORM_TABLE_TR_END = SysCardFormBeansUtil.getNbsp(3)+"</div>\n"; 
	
//	卡片式普通表单字段名的lable
	public static final String CARD_FORM_lable_START ="<label style=\"float:left;font-size:12px;width:100px;line-height:25px\">"; 
	
	//卡片式普通表单字段名的lable
	public static final String CARD_FORM_lable_END ="</label>"; 
	
	//卡片式普通表单的TD开始
	public static final String CARD_FORM_TABLE_TD_START = "<td>"; 
	
	//fieldset结束标签
	public static final String CARD_FORM_FIELD_SET_END ="</div>\n";
	
	//卡片普通表单单元开始
	public static final String CARD_FORM_CELL_START ="<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;width:100%\">\n";
	//卡片普通表单单元结束
	public static final String CARD_FORM_CELL_END ="</div>\n";
	//APP卡片普通表单单元开始
	public static final String CARD_FORM_CELL_START_APP ="<div class=\"mui-input-row\">\n";
	//APP卡片普通表单大单元开始(单独成行)
	public static final String CARD_FORM_BIG_CELL_START_ONLY_APP ="\n";		
	//APP卡片普通表单大单元结束
	public static final String CARD_FORM_BIG_CELL_END_APP ="\n";
	
//	卡片式普通表单字段名的lable
	public static final String CARD_FORM_lable_START_APP ="<label style=\"float:left\">"; 
	
//	卡片式普通表单字段名的lable
	public static final String CARD_FORM_lable_END_APP ="</label>\n"; 
		
	//卡片普通表单大单元开始
	public static final String CARD_FORM_BIG_CELL_START ="<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n";	
	//卡片普通表单大单元开始(单独成行)
	public static final String CARD_FORM_BIG_CELL_START_ONLY ="<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n";	
	//卡片普通表单大单元开始(占两列)
	public static final String CARD_FORM_BIG_CELL_START_MIDDLE ="<div class=\"col-lg-6 col-md-6 col-sm-12 col-xs-12\">\n";	
		
	//卡片普通表单大单元结束
	public static final String CARD_FORM_BIG_CELL_END ="</div>\n";
	
	//卡片式普通表单的TD结束
	public static final String CARD_FORM_TABLE_TD_END = "</td>\n"; 
	
	//卡片表单只textbox控件class
	public static final String CARD_FORM_TEXT_BOX = "text";
	//卡片表单合计字段
	public static final String CARD_FORM_ACCOUNT = "account";
	//卡片表单只textarea控件class
	public static final String CARD_FORM_TEXT_AREA = "textarea";
	
	//卡片表单只textbox控件class
	public static final String CARD_FORM_COMBO_BOX = "select";

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
	
//	yyyyMM 
	public static final String CARD_FORM_DATEPICKER4 = "controls input-append date form_date5"; 
	
//	hh:mm 
	public static final String CARD_FORM_DATEPICKER3 = "controls input-append date form_date3"; 
	
//	yyyy-MM-dd HH:mm:ss 
	public static final String CARD_FORM_DATEPICKER2 = "controls input-append date form_date2"; 
	
//	yyyy-MM-dd
	public static final String CARD_FORM_DATEPICKER1 = "controls input-append date form_date1"; 
	
//  yyyy/MM/dd
	public static final String CARD_FORM_DATEPICKER5 = "controls input-append date form_date4"; 
	
//	卡片表单只checkbox控件class 
	public static final String CARD_FORM_CHECKBOX = "checkbox"; 
	
//	卡片表单影藏控件class
	public static final String CARD_FORM_HIDDEN = "hidden";
	
	public static final String JAVASCRIPT_START = "<script >";
	
	public static final String JAVASCRIPT_VAR = "var ";
	
	public static final String JAVASCRIPT_END = "</script>";
	
//	public static final String JAVASCRIPT_WINDOW_ONLOAD = "window.onload=function(){";
	public static final String JAVASCRIPT_WINDOW_ONLOAD = "window.onload=function(){\n"+
														   SysCardFormBeansUtil.getNbsp(2)+"cardSelectInitFunctionx('${param.formType}');\n";
	
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
	
	public static final String LOOKUP_BACK_FUN_NAME = "_setLookupText(_lookupData)";
	
	public static final String RICHE_TEXT_UE_VAR_NAME = "UE_"; //ue变量名称组成
	
	public static final String SWF_FILEUPLOAD_VAR_NAME = "UPLOAD_"; //FILEUPLOAD变量名称组成
	
	public static final String SWF_FILEIPLOAD_STARTUPLOAD_FUN_NAME = "_START_UPLOAD";//FILEUPLOAD	 上传函数的变量名组成
	
	
	/**
	 * 卡片式表单 保存按钮的默认处理逻辑url
	 */
	public static final String CARD_FORM_SAVE_BUTTON_DEFAULT_URL = "/myehr/form/saveButtonSave.action";
	/**
	 * 卡片式表单 初始化数据url
	 */
//	public static final String CARD_FORM_INIT_DATA_URL = "com.dcf.form.runtime.cardFormButton.cardformInitData.biz.ext";
	 public static final String CARD_FORM_INIT_DATA_URL = "/myehr/form/cardformInitData.action";
	/**
	 * 调用动态表单url
	 */
	public static final String LOOKUP_FORM_URL = "form/toForm.action";
	
	/**
	 * LOOKUP控件回填sql查询调用逻辑
	 */
	public static final String LOOKUP_SQL_QUERY_URL = "com.dcf.form.runtime.cardFormButton.cardformInitData.biz.ext";
	
	/**
	 * 查询类sql执行公共url
	 */
	public static final String QUERY_SQL_URL = "com.dcf.form.runtime.comboboxComp.queryCombobxInitData.biz.ext";
	
	/**
	 * lookup 获取数据回填的函数部分名称
	 */
	public static final String LOOK_BIZ_BACK_TYPE_FUNNAME_START = "getCardLookupBackVal";

	/**
	 * 
	 * @param 分组名称
	 * @return 分组开始html代码段
	 */
	
	public static String getCardFormGroupStart(String groupName, String isOpen,String isApp) {
		String htmlString = "";
		if (isApp!=null&&isApp.equals("APP")) {
			htmlString = "<div class=\"mui-input-group\">\n"+
						 "<h5>"+groupName+"：</h5>\n";
		} else {
			htmlString = "<div style=\"margin:10px 0;\">\n"+
						 "\t\t<h3 style=\" background:#FFF; display:block;font-size:18;text-align:left;height: 36px;line-height: 33px;padding-left: 16px;color: #666;cursor: pointer;\">"+groupName+"</h3>\n"+
						 "\t\t\t<div class=\"row cell\"  >\n";
		}
		return 	htmlString;
				
	}
	
	/**
	 *获取普通卡片textbox控件的html代码
	 */
	public static String getTextBoxHtml(String classType, String id, String name, String vtype,String othervtype, String errorText, String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,String height,long formId,String isApp,String textboxCheckType,String titlename){
		String baseName = (entityName + "_" + name).replaceAll("\\.", "_");  //增加formDefCode;
		
		String checkTypeHtml = "";
		if (textboxCheckType != null) {
			if (textboxCheckType.equals("uniqueVerify")) {
				System.out.println(textboxCheckType);
				checkTypeHtml = " onblur=\"uniqueVerifyBlur(this)\"";
			}
		}
		String valueChangeFunName = isValueChange == true ? " onchange=\"" + baseName.toUpperCase() + "_valueChange_"+String.valueOf(formId)+"()\"" : "";
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
		String styleHtml = " style=\"" + widthHtml + heightHtml + "\"";
		if (isDisabled==true) {
			styleHtml = " style=\"" + widthHtml + heightHtml + " border:none;float:left\"";
		} else {
			styleHtml = " style=\"" + widthHtml + heightHtml + " float:left;\"";
		}
		String tb = "";
		if (isApp!=null&&isApp.equals("APP")) {
			tb = "<input id=\""+id+"\" name=\""+name+"\" type=\""+classType+"\" class=\"mui-input-clear price-range-item\" placeholder=\"\" " + 
					emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml +"/>\n";
		} else {
			if(classType.equals("textarea")){
				tb = "<"+classType+" id=\""+id+"\" name=\""+name+"\" title='"+titlename+"' class=\"form-control\" " + 
						emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName  + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml +"></"+classType+"/><span style='color:red;line-height:35px;font-size:27px'>"+requiredMark+"</span>\n";
			}else if (classType.equals("richText")) {
				tb = "<input id=\""+id+"\" name=\""+name+"\" type=\"hidden\" title='"+titlename+"' styleType=\"richText\" onchange=\""+id.replace(".", "__")+"_change()\" class=\"form-control\" " + 
						emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + checkTypeHtml + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml +"/><span style='color:red;line-height:35px;font-size:27px'>"+requiredMark+"</span>\n";
			}else {
				tb = "<input id=\""+id+"\" name=\""+name+"\" type=\""+classType+"\" title='"+titlename+"' class=\"form-control\" " + 
						emptyTextHtml + vtypeHtml + errorTextHtml + valueChangeFunName + checkTypeHtml + valueClickFunName + requiredHtml + isValidationFunName + isDisabledHtml + styleHtml +"/><span style='color:red;line-height:35px;font-size:27px'>"+requiredMark+"</span>\n";
			}
		}
		
		return tb;
	}
	
	/**
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
	 */
	public static String getTextBoxHtmlIntervais(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,String height,long formId,String isApp,String chinaName){
		// TODO 自动生成方法存根
		if (isApp!=null&&isApp.equals("APP")) {
			String temp="<div class=\"sift-row price-range-row\">\n"+
						"	<div class=\"row-head\">\n"+
						"		<span class=\"title\">"+chinaName+":</span>\n"+
						"		<span class=\"two-input\">\n";
				   temp = temp + getTextBoxHtml(classType , "_INTERVAIL_MIN_"+id,"_INTERVAIL_MIN_"+name, vtype,null, null, emptyText,isRequired,isValueChange,isClick,isValidation,isDisabled,entityName,width, height,formId,isApp,"","");
				   temp = temp + "			<span class=\"divider\">-</span>\n";
				   temp = temp + getTextBoxHtml(classType , "_INTERVAIL_MAX_"+id,"_INTERVAIL_MAX_"+name, vtype,null, null, emptyText,isRequired,isValueChange,isClick,isValidation,isDisabled,entityName,width, height,formId,isApp,"","");
				   temp = temp + "		</span>\n"+
								 "	</div>\n"+
								 "</div>\n";
			return temp;
		} else {
			String res1 = getTextBoxHtml(classType , "_INTERVAIL_MIN_"+id,"_INTERVAIL_MIN_"+name, vtype,null, null, emptyText,isRequired,isValueChange,isClick,isValidation,isDisabled,entityName,width, height,formId,isApp,"","");
			String res2 = getTextBoxHtml(classType , "_INTERVAIL_MAX_"+id,"_INTERVAIL_MAX_"+name, vtype,null, null, emptyText,isRequired,isValueChange,isClick,isValidation,isDisabled,entityName,width, height,formId,isApp,"","");
			return res1 +" 至 "+res2;
		}
		
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
	public static String getComboboxHtml(String classType , String id,String name,String title,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width
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
		
		String nullItemTextHtml = nullItemText!=null?" nullItemText=\""+nullItemText+"\"":"";
		String urlHtml = url!=null?" url=\""+url+"\"":"";
		String dataHtml = data!=null?" data=\""+data+"\"":"";
		String dataFieldHtml = dataField!=null?" dataField=\""+dataField+"_form_"+formColumnId+"\"":"";
		String multiselectHtml = multiselect==true?" multiSelect=\"true\"":"";
		String dataFieldHtml1 = "";
		if(textField!=null&&textField.equals("dictName")){
			dataFieldHtml1 = " dataField1 = \"dict\" ";
		}else if(textField!=null&&textField.equals("text")){
			dataFieldHtml1 = " dataField1 = \"sql\" ";
		}
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"float:left;" + widthHtml + "\"";
		if (isDisabled==true) {
			styleHtml = " style=\"border:none;" + widthHtml + " \"";
		} 
//		String tb = "<input id=\"" + id + "\" name=\"" + name + "\" class=\""
//				+ classType + "\"" + emptyTextHtml + vtypeHtml
//				+ valueChangeFunName + valueClickFunName + requiredHtml
//				+ isValidationFunName + isDisabledHtml + styleHtml
//				+ showNullItemHtml + textFieldHtml + valueFieldHtml
//				+ allowInputHtml + dictTypeIdHtml + nullItemTextHtml + urlHtml
//				+ dataHtml + dataFieldHtml + multiselectHtml + "/>";
		String tb = "";
		String initParam = "";
		if(paramType!=null&&paramValue!=null){
			initParam = "initParam = \""+paramType + "_" + paramValue+"\"";
		}
		if (isApp!=null&&isApp.equals("APP")) {
			if (isFilter!=null&&isFilter.equals("Filter")) {
				if (multiselect==true) {
					tb = "<div class=\"sift-row mulchoose\" id = \"" + id + "\" styleType=\"select\" "+ dataFieldHtml1+showNullItemHtml+ dictTypeIdHtml + dataFieldHtml + multiselectHtml + initParam +" :class=\"{'sift-row-expand': isDrop}\">\n" +
						 "	<div class=\"row-head J_siftRowExpand\" :class=\"{'sift-row-expand': isDrop}\">\n" +
						 "		<span class=\"title\">"+title+"：</span>\n" +
						 "		<span class=\"selected-items\"></span>\n" +
						 "		<span class=\"icons-sift-down switch-btn\" v-on:click=\"toggleExpand\"></span>\n" +
						 "	</div>\n" +
						 "  <v-mul-chooser :selections=\"mulChooseValArr." + id.split("\\.")[id.split("\\.").length-1] + "List\" @on-change=\"onParamChange( '" + id + "', $event)\"></v-mul-chooser>\n" +
						 "</div>\n";
					
				}else {
					tb = "<div class=\"sift-row choose\" id = \"" + id + "\" styleType=\"select\" "+ dictTypeIdHtml + dataFieldHtml + multiselectHtml + initParam +" :class=\"{'sift-row-expand': isDrop}\">\n" +
						 "	<div class=\"row-head J_siftRowExpand\" :class=\"{'sift-row-expand': isDrop}\">\n" +
						 "		<span class=\"title\">"+title+"：</span>\n" +
						 "		<span class=\"selected-items\"></span>\n" +
						 "		<span class=\"icons-sift-down switch-btn\" v-on:click=\"toggleExpand\"></span>\n" +
						 "	</div>\n" +
						 "  <v-chooser :selections=\"chooseValArr." + id.split("\\.")[id.split("\\.").length-1] + "List\" @on-change=\"onParamChange('" + id + "', $event)\"></v-chooser>\n" +
						 "</div>\n";		
				}
			} else {
				tb = "<input id='" + id + "' type=\"text\" readonly=\"readonly\" placeholder=\"请选择\" "+ dictTypeIdHtml + dataFieldHtml + multiselectHtml + initParam +">\n";
			}
			
		} else {
			if (multiselect==true) {
				tb = "<label for=\"" + id + "\"></label>\n" +
						SysCardFormBeansUtil.getNbsp(5)+"<select id=\"" + id + "\" title=\""+title+"\" name=\""+ name +"\"  columnId=\""+formColumnId+"\" class=\"selectpicker bla bla bli\" multiple data-live-search=\"true\"" + emptyTextHtml + vtypeHtml
						+ valueChangeFunName + valueClickFunName + requiredHtml
						+ isValidationFunName + isDisabledHtml + styleHtml
						+ showNullItemHtml + textFieldHtml + valueFieldHtml
						+ allowInputHtml + dictTypeIdHtml +dataFieldHtml1 + nullItemTextHtml + urlHtml
						+ dataHtml + dataFieldHtml + multiselectHtml + initParam +"></select><span style='color:red;line-height:35px;font-size:27px'>"+requiredMark+"</span>\n";
				
			}else {
				if (isDisabledHtml!=null && !isDisabledHtml.equals("")) {
					tb = SysCardFormBeansUtil.getNbsp(6)+"<input id=\"" + id + "\" title=\""+title+"\" columnId=\""+formColumnId+"\" styleType=\"inputSelect\" name=\"" + name + "\"  class=\"form-control "+isSearchHtml1+"\"" +isSearchHtml2 + emptyTextHtml + vtypeHtml
							+ valueChangeFunName + valueClickFunName + requiredHtml
							+ isValidationFunName + " readonly " + styleHtml
							+ showNullItemHtml + textFieldHtml + valueFieldHtml
							+ allowInputHtml + dictTypeIdHtml +dataFieldHtml1 + nullItemTextHtml + urlHtml
							+ dataHtml + dataFieldHtml + multiselectHtml + initParam +"/>\n" +
							"<input id=\"" + id + "_value\" name=\"" + name + "\" type=\"hidden\" />\n";		
				}else {
					tb = SysCardFormBeansUtil.getNbsp(6)+"<select id=\"" + id + "\" title=\""+title+"\" columnId=\""+formColumnId+"\" styleType=\"select\" name=\"" + name + "\"  class=\"form-control "+isSearchHtml1+"\"" +isSearchHtml2 + emptyTextHtml + vtypeHtml
							+ valueChangeFunName + valueClickFunName + requiredHtml
							+ isValidationFunName + isDisabledHtml + styleHtml
							+ showNullItemHtml + textFieldHtml + valueFieldHtml
							+ allowInputHtml + dictTypeIdHtml +dataFieldHtml1 + nullItemTextHtml + urlHtml
							+ dataHtml + dataFieldHtml + multiselectHtml + initParam +"></select><span style='color:red;line-height:35px;font-size:27px'>"+requiredMark+"</span>\n";		
				}
			}
		}
		
		
		return tb;
	}
	
	/**
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
	 */
	public static String getTextBoxHtmlIntervais(String classType , String id,String name,String title,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width
			, boolean showNullItem, String textField, String valueField, boolean allowInput, String dictTypeId, String nullItemText, String url, String data,String dataField, boolean multiselect,long formId,String isApp,String formColumnId,String paramType,String paramValue,String isFilter,String isSearch){
		
		String res1 = getComboboxHtml( classType ,"_INTERVAIL_MIN_"+id, "_INTERVAIL_MIN_"+name,title, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width
				,  showNullItem,  textField,  valueField,  allowInput,  dictTypeId,  nullItemText,  url,  data, dataField,  multiselect,formId,isApp,formColumnId,paramType,paramValue,isFilter,isSearch);
		String res2 =  getComboboxHtml( classType ,  "_INTERVAIL_MAX_"+id, "_INTERVAIL_MAX_"+name,title, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width
				,  showNullItem,  textField,  valueField,  allowInput,  dictTypeId,  nullItemText,  url,  data, dataField,  multiselect,formId,isApp,formColumnId,paramType,paramValue,isFilter,isSearch);
		
		return res1+"至"+res2;
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
			String width, String repeatItems, String textField, String valueField, String repeatdirection, String dictTypeId, String repeatLayout, String url, String data, String dataField,long formId) {
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
		
		String tb = "<input id=\"" + id + "\" name=\"" + name + "\" class=\""
				+ classType + "\"" + emptyTextHtml + vtypeHtml
				+ valueChangeFunName + valueClickFunName + requiredHtml
				+ isValidationFunName + isDisabledHtml + styleHtml
				+ repeatItemsHtml + textFieldHtml + valueFieldHtml
				+ repeatdirectionHtml + dictTypeIdHtml + repeatLayoutHtml
				+ urlHtml + dataHtml + dataFieldHtml + "/>";
		
		return tb;
	}
	
	/**
	 * 获取卡片表单附件上传html代码
	 * @return
	 */
	public static String getFileuploadHtml(String jsId, SysFormFileuploadCache fileupload, String fieldName, String entityName, String width, boolean isDisable,String columnId) {
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"float:left;" + widthHtml + "\"";
		String isDisabledHtml = isDisable?" enabled=\"false\"":"";
		String tb = "";
		if (fileupload.getPojo().getFileuploadAutoUpload().equals("N")) {
			tb = "<input id=\""+jsId+"\" styleType=\"fileupload\" name=\""+fieldName+"\" type=\"hidden\"><input id=\""+jsId+"_fileName\" class=\"form-control\" type=\"text\" "+styleHtml+"/><span type=\"button\" class=\"btn btn-danger\" id=\"uploadify_"+columnId+"\" style=\"height:25px\"></span>";
		} else {
			tb = "<input id=\""+jsId+"\" styleType=\"fileupload\" name=\""+fieldName+"\" type=\"hidden\"><input id=\""+jsId+"_fileName\" class=\"btn btn-danger\" value=\"文件上传\" onclick=\"fileupload_"+columnId+"()\" type=\"button\" "+styleHtml+"/>";
		}
		
		return tb;
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
	public static String getDatepickerHtml(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String format, String timeformat, boolean showtime, boolean showokbutton, boolean showclearbutton, boolean allowinput, boolean showtodaybutton, boolean isDrawdate,long formId,String isApp,String titlename){
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"()\"":"";
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
		/*if(SysCardFormBeansUtil.CARD_FORM_MONTHPICKER.equals(classType)){
			emptyTextHtml =  "";
			showtimeHtml = "";
			showokbuttonHtml = "";
			showclearbuttonHtml = "";
			showtodaybuttonHtml = "";
			allowinputHtml = "";
			enabledHtml =isDisabled? " enabled=\"false\" ":"";
		}*/
		System.out.println(width);
		String widthL = width.split("p")[0];
		if (widthL.equals("")) {
			width = "90px";
		}else if (isDisabled) {
			width = Integer.valueOf(widthL) +"px";
		} else {
			width = Integer.valueOf(widthL) - 66 + "px";
		}
		
		String widthHtml = width != null ? "width:" + width + ";" : "";
		String styleHtml = " style=\"" + widthHtml + "float:left;border-radius: 4px 0 0 4px;min-height:24px\"";
		
		/*String tb = "<input id=\"" + id + "\" name=\"" + name + "\" class=\""
				+ classType + "\"" + emptyTextHtml + valueChangeFunName
				+ valueClickFunName + requiredHtml + styleHtml
				+ isDrawdateFunName + formatHtml + timeFormatHtml
				+ showtimeHtml + showokbuttonHtml + showclearbuttonHtml
				+ showtodaybuttonHtml + allowinputHtml
				+ enabledHtml + "/>";*/
		String flag="readonly";
		if("controls input-append date form_date3".equals(classType)){
			flag="";
		}
		String tb = "";
		if (isApp!=null&&isApp.equals("APP")) {
			tb = "\n<input id=\"" + id + "\" class=\"data\" dateType=\""+ classType +"\" data-options='{\"type\":\""+classType+"\"}'"+ formatHtml +" styleType=\"dateTime\" type=\"text\" placeholder=\"请选择日期\">\n";
		} else {
			if (isDisabled) {
				tb = "<input id=\""+id+"\" name=\""+name+"\" type=\"text\" title='"+titlename+"' dateType=\""+ classType +"\" class=\"form-control\" styleType=\"dateTime\" readonly " + 
						emptyTextHtml + valueChangeFunName + valueClickFunName + requiredHtml + styleHtml + formatHtml +"/>\n";
			} else {
				tb = "\n"+SysCardFormBeansUtil.getNbsp(5)+"<div class='"+ classType + " input-group' data-date=\"\"  data-link-field=\"dtp_input2\" data-link-format=\"yyyy-mm-dd\" style=\"float:left;width: "+width+";\">\n"+
						SysCardFormBeansUtil.getNbsp(6)+"<input type='text' "+flag+" class=\"form-control \" title='"+titlename+"' dateType=\""+ classType +"\" id=\"" + id + "\" styleType=\"dateTime\"  "+styleHtml+" name=\"" + name + "\" " + emptyTextHtml + valueChangeFunName
						+ valueClickFunName + requiredHtml 
						+ isDrawdateFunName + formatHtml + timeFormatHtml
						+ showtimeHtml + showokbuttonHtml + showclearbuttonHtml
						+ showtodaybuttonHtml + allowinputHtml
						+ enabledHtml + "/>\n"+
						SysCardFormBeansUtil.getNbsp(7)+"<span class=\"input-group-addon\" name=\"closeButton\"><span class=\"glyphicon glyphicon-remove\"></span></span>\n" +
						SysCardFormBeansUtil.getNbsp(7)+"<span class=\"input-group-addon\" name=\"clickButton\"><span class=\"glyphicon glyphicon-th\"></span></span>\n" +
						SysCardFormBeansUtil.getNbsp(5)+"</div><span style='color:red;line-height:35px;font-size:27px'>"+requiredMark+"</span>\n";
			}
			
		}
		return tb;
	}
	
	/**
	 *datepicker区间查询
	 * @param isDrawdate 
	 * @param showtodaybutton 
	 * @param allowinput 
	 * @param showclearbutton 
	 * @param showokbutton 
	 * @param showtime 
	 * @param timeformat 
	 * @param format 
	 */
	public static String getDatepickerHtmlIntervais(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String format, String timeformat, boolean showtime, boolean showokbutton, boolean showclearbutton, boolean allowinput, boolean showtodaybutton, boolean isDrawdate,long formId,String isApp){
		if (isApp!=null&&isApp.equals("APP")) {
			String temp="<div class=\"sift-row price-range-row\">\n"+
					"	<div class=\"row-head\">\n"+
					"		<span class=\"title\">价格区间（元）</span>\n"+
					"		<span class=\"two-input\">\n";
			   temp = temp + getDatepickerHtml( classType ,  "_INTERVAIL_MIN_"+id, "_INTERVAIL_MIN_"+name, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width,
						 format,  timeformat,  showtime,  showokbutton,  showclearbutton,  allowinput,  showtodaybutton,  isDrawdate,formId,isApp,"");
			   temp = temp + "			<span class=\"divider\">-</span>\n";
			   temp = temp + getDatepickerHtml( classType ,  "_INTERVAIL_MAX_"+id, "_INTERVAIL_MAX_"+name, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width,
						 format,  timeformat,  showtime,  showokbutton,  showclearbutton,  allowinput,  showtodaybutton,  isDrawdate,formId,isApp,"");
			   temp = temp + "		</span>\n"+
							 "	</div>\n"+
							 "</div>\n";
			   return temp;
		} else {
			String res1 = getDatepickerHtml( classType ,  "_INTERVAIL_MIN_"+id, "_INTERVAIL_MIN_"+name, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width,
					 format,  timeformat,  showtime,  showokbutton,  showclearbutton,  allowinput,  showtodaybutton,  isDrawdate,formId,isApp,"");
			String res2 = getDatepickerHtml( classType ,  "_INTERVAIL_MAX_"+id, "_INTERVAIL_MAX_"+name, vtype, emptyText, isRequired, isValueChange, isClick, isValidation, isDisabled, entityName, width,
					 format,  timeformat,  showtime,  showokbutton,  showclearbutton,  allowinput,  showtodaybutton,  isDrawdate,formId,isApp,"");
			return res1+"<div style=\"float:left;line-height:34px\">"+"至"+"</div>"+res2;
		}
		
		
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
	public static String getCheckboxHtml(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,boolean isDisabled,String entityName,String width,
			String showName,long formId){
		String baseName = (entityName+"_"+name).replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"()\"":"";
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
	public static String getLookupHtml(String classType, String jsId, String fieldName, String vtype, String emptyText, 
			boolean isRequired, boolean isValueChange, boolean isOnclick, boolean isValidation, boolean isDisabled, String entityName, String formColumnWidth, String buttonClickName,long formId) {
		// TODO 自动生成方法存根
		String baseName = jsId.replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.substring(0, baseName.lastIndexOf("_")).toUpperCase()+"_valueChange_"+String.valueOf(formId)+"()\"":"";
		String widthHtml = formColumnWidth != null ? "width:" + formColumnWidth + ";" : "";
		String styleHtml = " style=\"" + widthHtml + ";float:left;\"";
		String requiredMark = isRequired == true ? " * " : "";//fa fa-asterisk
		String requiredHtml = isRequired==true? " required=\"true\" ":"";
		String tb="";
		if(isDisabled==false){
			tb = getNbsp(5)+"<div class='input-group' "+styleHtml+">\n" +
					getNbsp(6)+"<input id=\"" + jsId + "\" name=\"" + fieldName+ "\" styleType=\"lookUp\" type=\"hidden\">\n" +
					getNbsp(6)+"<input type='text' class=\"form-control\"  readonly=true "+ requiredHtml+" id=\""+jsId  + "_name\" "+valueChangeFunName+"/>\n" +
					getNbsp(6)+"<span class=\"input-group-addon\" onclick=\""+buttonClickName+"(this)\">\n" +
					getNbsp(7)+"<span class=\"glyphicon glyphicon-plus\">\n" +
					getNbsp(7)+"</span>\n" +
					getNbsp(6)+"</span>\n" +
					getNbsp(5)+"</div><span style='color:red;line-height:35px;font-size:27px'>"+requiredMark+"</span>\n" ;
		}else {
			tb = getNbsp(5)+"<div class='input-group' "+styleHtml+">\n" +
					getNbsp(6)+"<input id=\"" + jsId + "\" name=\"" + fieldName+ "\" styleType=\"lookUp\" type=\"hidden\">\n" +
					getNbsp(6)+"<input type='text' class=\"form-control\"  readonly=true "+ requiredHtml+" id=\"" +  jsId + "_name\"/>\n" +
					getNbsp(6)+"<span class=\"input-group-addon\">\n" +
					getNbsp(7)+"<span class=\"glyphicon glyphicon-plus\">\n" +
					getNbsp(7)+"</span>\n" +
					getNbsp(6)+"</span>\n" +
					getNbsp(5)+"</div><span style='color:red;line-height:35px;font-size:27px'>"+requiredMark+"</span>\n" ;
		}
		
		return tb;
	}
	
	
	/**
	 *获取datagrid中textbox控件的html代码
	 */
	public static String getDatagridTextbox(String classType , String id,String name,String vtype,String emptyText,boolean isRequired,boolean isValueChange,boolean isClick,boolean isValidation,long formId){
		String baseName = name.replaceAll("\\.", "_");
		String valueChangeFunName= isValueChange==true?" onchange=\""+ baseName.toUpperCase()+"_valueChange_"+String.valueOf(formId)+"()\"":"";
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
	
	/**
	 * 获取StringBuffer数组
	 * 角标(普通表单) 
	 * 		0 html 
	 * 	    1 数据初始化js
	 * 		2 click js
	 * 	    3 onvaluechange js
	 * 		4 自定义校验js
	 * @return
	 */
	public static StringBuffer[] getSbs(){
		StringBuffer[] sbs = new StringBuffer[HTML_SILZE];
		for(int i=0; i<sbs.length; i++){
			sbs[i] = new StringBuffer();
		}
		return sbs;
	}
	
	/**
	 * 获取TABLE的td元素
	 * @param align
	 * @return
	 */
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
		}/*else {
			width = "width=200px";
		}*/
		if(style!=null){
			style = " height=\""+style+"\" ";
		}else {
			style = "";
		}
		String colspanStr ="";
		if(colspan>1){
			colspanStr = " colspan=\""+(colspan*2-1)+"\"";
		}
		
		return SysCardFormBeansUtil.getNbsp(4)+"<td style=\"padding-left:10px;\" "+width+heigth+align+style+colspanStr+" >";
	}
	/**
	 * 
	 * @param ColumnId
	 * @param value
	 * @return
	 */
	public static String getBuildCardForm9(String width){
		return SysCardFormBeansUtil.getNbsp(4)+"<label style=\"float:left;font-size:12px;width:"+width+";line-height:25px\">";
	}
	public static String setValueJs(String ColumnId,String value){
		String temp = "var value = '"+value+"';\n"+
					  "var id = '"+ColumnId+"';\n"+
					  "if($(\"[id='"+ColumnId+"']\").attr(\"styleType\")==\"dateTime\"){\n"+
					  "		if(value.indexOf(\":\") > -1){\n"+
					  "			if(value.indexOf(\"-\") > -1){\n"+
					  "			 	document.getElementById(\""+ColumnId+"\").value=formatDatebox(value,id);\n"+
					  "			}else{\n"+
					  "				document.getElementById(\""+ColumnId+"\").value=value;\n"+
					  "			}\n"+
					  "		}else{\n"+
					  "			if(value==null || value==\"\"|| value==\"null\"){\n"+
					  "				document.getElementById(\""+ColumnId+"\").value=value;\n"+
					  "			}else{\n"+
					  "			    var date = new Date(parseInt(value)).Format(\"yyyy-MM-dd hh:mm:ss\");\n"+
					  "				document.getElementById(\""+ColumnId+"\").value = formatDatebox(date,id);\n"+
					  "			}\n"+
					  "		}\n"+
					  "}else if($(\"[id='"+ColumnId+"']\").attr(\"styleType2\")==\"search\"){\n"+
					  "		$(\"[id='"+ColumnId+"']\").selectpicker('val', value);\n"+
					  "}else{\n"+
					  "    if($(\"[id='"+ColumnId+"']\").attr(\"styleType\")==\"inputSelect\"){\n"+
					  "        var dataField = $(\"[id='"+ColumnId+"']\").attr(\"dataField1\");\n"+
					  "        var DictName = $(\"[id='"+ColumnId+"']\").attr(\"DictName\");\n"+
					  "        selectSqlDictEntryByValue(\""+ColumnId+"\",value,dataField,DictName);\n"+
					  "    }else{\n"+
					  "		   document.getElementById(\""+ColumnId+"\").value=value;\n"+
					  "    }\n"+
					  "}\n";
		return temp;
	}
	
	/**
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
	 */
	public static String getButtonDivStart(){
		return "<div id=\"toolBar\" class=\"nui-toolbar\" style=\"text-align:center;padding-top:5px;padding-bottom:5px;\"  borderStyle=\"border:0;\">\n";
	}
	
	public static String getButtonHtml(String buttonId,String btnCode,String btnName,String icon,String iconSelf,String btnWidth,String btnStyle,String formCode, String type, String enabled,String formId,String isApp){
		icon = iconSelf==null?icon:iconSelf;
		icon=icon==null||"".equals(icon)?"":" iconCls=\""+icon+"\""; 
		btnWidth=btnWidth==null||"".equals(btnWidth)?"":" width=\""+btnWidth+"\"";
		btnStyle=btnStyle==null||"".equals(btnStyle)?"":" style=\""+btnStyle+"\"";
		String clickFunName = btnCode+formCode+"_click_"+formId+"()";
		if("close".equals(type)) {
			clickFunName = "closex()";
		}else if ("gridBatchEdit".equals(type)) {
			clickFunName = "batchEdit_"+formId+"('"+formCode+"_List','"+formId+"')";
		}
		//String temp =getNbsp(2)+ "<a class=\"nui-button\"  "+icon+btnWidth+btnStyle+enabled+"  onclick=\""+clickFunName+"\">"+btnName+"</a>\n";
		//String temp =getNbsp(2)+ "<button  class=\"btn btn-primary\"  "+btnWidth+btnStyle+enabled+" id=\""+btnCode+formCode+"\"  onclick=\""+clickFunName+"\">"+btnName+"</button>\n";
		String className = "btn-primary\""; 
		//executeSQL
		if (type.equals("import")) {
			className = "btn-info\""; 
		}else if (type.equals("executeSQL")) {
			className = "btn-success\""; 
		}else if (type.equals("remove")) {
			className = "btn-danger\""; 
		}else if (type.equals("edit")||type.equals("copyAndUpdate")) {
			className = "btn-warning\""; 
		}else if (type.equals("submit_form")) {
			className = "btn-primary\" style=\"background-color:pink;border:none\""; 
		}else if (type.equals("calculate")) {
			className = "btn-primary\" style=\"background-color:purple;border:none\""; 
		}else if (type.equals("save")) {
			//className = "btn-primary\" style=\"background-color:#006600;border:none\""; 
			className = "btn-success\"";
		}
		if (isApp!=null&&isApp.equals("APP")) {
			String temp = "";
			if (type!=null&&type.equals("edit")||type!=null&&type.equals("copyAndUpdate")) {
				temp =SysCardFormBeansUtil.getNbsp(3)+"<span id=\""+btnCode+formCode+"\" onclick=\""+clickFunName+"\" class=\"mui-btn mui-btn-yellow mui-icon mui-icon-compose\"></span>\n";
			} else if (type!=null&&type.equals("remove")) {
				temp =SysCardFormBeansUtil.getNbsp(3)+"<span id=\""+btnCode+formCode+"\" onclick=\""+clickFunName+"\" class=\"mui-btn mui-btn-red mui-icon mui-icon-trash\"></span>\n";
			} else if (type!=null&&type.equals("save")) {
				temp =SysCardFormBeansUtil.getNbsp(3)+"<span id=\""+btnCode+formCode+"\" onclick=\""+clickFunName+"\" class=\"mui-btn mui-btn-primary\">保存</span>\n";
			} else if (type!=null&&type.equals("close")) {
				temp =SysCardFormBeansUtil.getNbsp(3)+"<span id=\""+btnCode+formCode+"\" onclick=\""+clickFunName+"\" class=\"mui-btn mui-btn-danger\">关闭</span>\n";
			} else if (type!=null&&type.equals("daiding")) {
				temp =SysCardFormBeansUtil.getNbsp(3)+"<span id=\""+btnCode+formCode+"\" onclick=\""+clickFunName+"\" class=\"mui-btn mui-btn-yellow mui-icon mui-icon-compose\"></span>\n";
			}
			return temp;
		} else {
			if (btnCode.equals("submit_form")) {
				String temp =SysCardFormBeansUtil.getNbsp(3)+"<div style=\"margin-right:10px;display:inline-block\">\n"
						+SysCardFormBeansUtil.getNbsp(3)+"    <input type=\"button\" id=\""+btnCode+formCode+"\"  class=\"btn "+className+" value="+btnName+" onclick=\"submit2()\"/>\n"
						+SysCardFormBeansUtil.getNbsp(3)+"</div>\n";
				return temp;
			}else if (btnCode.equals("free_submit")) {
				String temp =SysCardFormBeansUtil.getNbsp(3)+"<div style=\"margin-right:10px;display:inline-block\">\n"
						+SysCardFormBeansUtil.getNbsp(3)+"    <input type=\"button\" id=\""+btnCode+formCode+"\"  class=\"btn "+className+" value="+btnName+" onclick=\"submit2()\"/>\n"
						+SysCardFormBeansUtil.getNbsp(3)+"</div>\n";
				return temp;
			}else if (btnCode.equals("export")) {
				String temp = SysCardFormBeansUtil.getNbsp(3)+"<div style=\"margin-right:10px;display:inline-block\">\n"
						 +SysCardFormBeansUtil.getNbsp(3)+"    <input type=\"button\" id=\""+btnCode+formCode+"\"  class=\"btn "+className+" value="+btnName+" onclick=\""+clickFunName+"\"/>\n"
						 +SysCardFormBeansUtil.getNbsp(3)+"    <a id=\"export_"+buttonId+"\" href=\"/myehr/form/getExportFile.action?buttonId="+buttonId+"\" type=\"hidden\" value=\"\"></a>\n"
						 +SysCardFormBeansUtil.getNbsp(3)+"    <a id=\"exportBig_"+buttonId+"\" href=\"/myehr/form/getExportBigFile.action?buttonId="+buttonId+"\" type=\"hidden\" value=\"\"></a>\n"
						 +SysCardFormBeansUtil.getNbsp(3)+"</div>\n";
				return temp;
			}else{
				String temp = SysCardFormBeansUtil.getNbsp(3)+"<div style=\"margin-right:10px;display:inline-block\">\n"
						 +SysCardFormBeansUtil.getNbsp(3)+"    <input type=\"button\" id=\""+btnCode+formCode+"\"  class=\"btn "+className+" value="+btnName+" onclick=\""+clickFunName+"\"/>\n"
						 +SysCardFormBeansUtil.getNbsp(3)+"</div>\n";
				return temp;
			}
			
			
			
		}
	}
	
	/**
	 * 获取卡片式表单 保存按钮 的click方法的 default处理方法
	 * @param str10 
	 * @param hzsql 
	 * @return
	 */
	public static String getCardFormSaveJs(String funName,String successType, String str10,long buttonId,
			String pkJsId,String pkColumnName, SysFormGeneralExecSqlCache hzsql ,SysFormconfigCache form,SysRequestParam request){
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
		String paramjs = SysFormGeneralExecSqlCache.getCardParamsJsStr(params, form, request, false);
		st += SysCardFormBeansUtil.getNbsp(6)+"if(window.parent._loadmstmaindata){"+SysCardFormBeansUtil.NEW_LINE;
		st += SysCardFormBeansUtil.getNbsp(7)+"window.parent._loadmstmaindata()"+SysCardFormBeansUtil.NEW_LINE;
		st += SysCardFormBeansUtil.getNbsp(6)+"}"+SysCardFormBeansUtil.NEW_LINE;
		String temp = getNbsp(1)+"function "+funName+"(){" +NEW_LINE_ONLY+str10+
//				getNbsp(2)+"var _form = new nui.Form(\"#form1\");" +NEW_LINE_ONLY+
				getNbsp(2)+paramjs+NEW_LINE_ONLY+
//				getNbsp(2)+"_form.validate();" +NEW_LINE_ONLY+
//				getNbsp(2)+"if (_form.isValid() == false) return;" +NEW_LINE_ONLY+
//				getNbsp(2)+"var _data = _form.getData()" +NEW_LINE+
				getNbsp(2)+"var _param = {}" +NEW_LINE+
				getNbsp(2)+"_param.formId=_formId_"+form.getPojoform().getFormDefId()+NEW_LINE+
				getNbsp(2)+"_param.buttonId="+buttonId+NEW_LINE+
				getNbsp(2)+"_param = getdata(_param.buttonId,_formId_"+form.getPojoform().getFormDefId()+")"+NEW_LINE+
//				getNbsp(2)+"dcf.mask()"+NEW_LINE+
				getNbsp(2)+"_param.paramsMap = paramsMap" +NEW_LINE_ONLY+
				getNbsp(2)+"var hzsParam = [];\n"+
				getNbsp(2)+"var signstr = JSON.stringify(_param);" +NEW_LINE_ONLY+
				getNbsp(2)+"var rule ='\"' ;" +NEW_LINE_ONLY+
				getNbsp(2)+"var regS = new RegExp(rule,'g');" +NEW_LINE_ONLY+
				getNbsp(2)+"signstr = signstr.replace(regS, '');" +NEW_LINE_ONLY+
				
				getNbsp(2)+"var rule2 =':' ;" +NEW_LINE_ONLY+
				getNbsp(2)+"var regS2 = new RegExp(rule2,'g');" +NEW_LINE_ONLY+
				getNbsp(2)+"signstr = signstr.replace(regS2, '=');" +NEW_LINE_ONLY+

				getNbsp(2)+"var sign = md5(signstr);" +NEW_LINE_ONLY+
			
				getNbsp(2)+"console.log(signstr);" +NEW_LINE_ONLY+									



		getNbsp(2)+"if(checkNull(\"#form_"+form.getPojoform().getFormDefId()+"\")){\n"+ 
				getNbsp(2)+"}else{\n"+
				
				getNbsp(2)+"$.ajax({" +NEW_LINE_ONLY+
				getNbsp(3)+"url:'"+CARD_FORM_SAVE_BUTTON_DEFAULT_URL+"?sign='+sign," +NEW_LINE_ONLY+
				getNbsp(3)+"type:'post'," +NEW_LINE_ONLY+
				getNbsp(3)+"data: JSON.stringify(_param)," +NEW_LINE_ONLY+
				getNbsp(3)+"cache: false," +NEW_LINE_ONLY+
				getNbsp(3)+"async: false,\n"+
				getNbsp(3)+"contentType: 'application/json;charset=utf-8'," +NEW_LINE_ONLY+
				getNbsp(3)+"success: function (text) {\n"+
				getNbsp(3)+"if(text[0]=='000000' || text[1]=='保存成功' || text[0]=='000000' || text[1]=='执行成功'){\n"+
				getNbsp(3)+"	alert(\"操作成功！\");\n"+

				getNbsp(3)+"	refreshDictCache(_formId"+"_"+form.getPojoform().getFormDefId()+",'"+buttonId+"');\n"+
				getNbsp(3)+"	closex();\n"+
				getNbsp(3)+"}else if(text[0]=='error'){\n"+
				getNbsp(3)+"    if(text.length>1 &&text[0]=='error'){\n"+
				getNbsp(3)+"		alert(text[1]);\n"+
				getNbsp(3)+"		closex();\n"+
				getNbsp(3)+"    }else{\n"+
				getNbsp(3)+"		alert(\"操作异常\");\n"+
				getNbsp(3)+"    }\n"+
				getNbsp(3)+"}else {\n"+
				
				getNbsp(3)+"	hzsParam = text;\n"+
				
				getNbsp(3)+"}\n"+
				getNbsp(3)+"}" +NEW_LINE_ONLY+
				getNbsp(2)+"});" +NEW_LINE_ONLY+
						   "		if(hzsParam.length>0){\n"+
						   "			_param.excresult = hzsParam;\n"+
							"			$.ajax({\n"+
							"				url:'/myehr/form/hzAction.action',\n"+
							"				type:'post',\n"+
							"				data: JSON.stringify(_param),\n"+
							"				cache: false,\n"+
							"				async: false,\n"+
							"				contentType: 'application/json;charset=utf-8',\n"+
							"				success: function (text) {\n"+
				getNbsp(3)+"if(text[0]=='000000' || text[1]=='执行成功'||text[0]=='0'){\n"+
				getNbsp(3)+"	alert(\"执行成功！\");\n"+
				getNbsp(3)+"	closex();\n"+
				getNbsp(3)+"}else if(text[0]=='error'){\n"+
				getNbsp(3)+"    if(text.length>1 &&text[0]=='error'){\n"+
				getNbsp(3)+"		alert(text[1]);\n"+
				getNbsp(3)+"}else{\n"+
				getNbsp(3)+"	alert(\"执行异常\");\n"+
				getNbsp(3)+"}\n"+
				getNbsp(3)+"}\n"+
							"				}\n"+
							"			});\n"+
							"		}\n"+
				getNbsp(2)+"}\n"+
				
				getNbsp(1)+"}\n";
		return temp;
		
	}
	
	/**
	 * 获取卡片式表单 保存按钮 的click方法的 default处理方法
	 * @param str10 
	 * @param hzsql 
	 * @return
	 */
	public static String getCardFormFreeSubmitJs(String funName,String successType, String str10,long buttonId,
			String pkJsId,String pkColumnName, SysFormGeneralExecSqlCache hzsql ,SysFormconfigCache form,SysRequestParam request){
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
		String paramjs = SysFormGeneralExecSqlCache.getCardParamsJsStr(params, form, request, false);
		st += SysCardFormBeansUtil.getNbsp(6)+"if(window.parent._loadmstmaindata){"+SysCardFormBeansUtil.NEW_LINE;
		st += SysCardFormBeansUtil.getNbsp(7)+"window.parent._loadmstmaindata()"+SysCardFormBeansUtil.NEW_LINE;
		st += SysCardFormBeansUtil.getNbsp(6)+"}"+SysCardFormBeansUtil.NEW_LINE;
		
		
		String temp = getNbsp(0)+"function submit2(){" +NEW_LINE_ONLY+str10+
				getNbsp(1)+"if(1==1){"+NEW_LINE_ONLY+
				getNbsp(2)+"content = \"<div style='margin-bottom:10px'>审批结果<select id='approveType' ><option value ='pass'>通过</option><option value ='reject'>驳回</option><option value ='end'>结束</option></select></div>\";"+NEW_LINE_ONLY+
				getNbsp(2)+"content += \"<div style='margin-bottom:10px'>下一审批人<input id='nextApproveUser' value = \\\"\\\" \\></div>\";"+NEW_LINE_ONLY+
				getNbsp(2)+"content += \"<textarea id='approveRemark' rows='7' cols='63' ></textarea>\";"+NEW_LINE_ONLY+
				getNbsp(1)+"}else if(buttonType=='驳回'){"+NEW_LINE_ONLY+
				getNbsp(2)+"content = \"<div style='margin-bottom:10px'><select id='rejectType' ><option value ='previousNode'>驳回到上节点</option><option value ='startUser'>驳回到发起人</option><option value ='free'>自由选择节点</option></select></div>\";"+NEW_LINE_ONLY+
				getNbsp(2)+"content += \"<textarea id='approveRemark' rows='7' cols='63' ></textarea>\";"+NEW_LINE_ONLY+
				getNbsp(1)+"}else{"+NEW_LINE_ONLY+
				getNbsp(2)+"saveData(buttonType,'','');" +NEW_LINE_ONLY+
				getNbsp(2)+"return;" +NEW_LINE_ONLY+
				getNbsp(1)+"}"+NEW_LINE_ONLY+
				getNbsp(1)+"layer.open({"+NEW_LINE_ONLY+
				getNbsp(2)+"title:'请填写审批意见',"+NEW_LINE_ONLY+
				getNbsp(2)+"shadeClose: true,"+NEW_LINE_ONLY+
				getNbsp(2)+"zIndex:9999,"+NEW_LINE_ONLY+
				getNbsp(2)+"content: content,"+NEW_LINE_ONLY+
				getNbsp(2)+"area: ['500px', '300px'],"+NEW_LINE_ONLY+
				getNbsp(2)+"btn: ['确定', '取消'],"+NEW_LINE_ONLY+
				getNbsp(2)+"yes:function(index, layero){" +NEW_LINE_ONLY+
				getNbsp(3)+"var approveRemark=document.getElementById(\"approveRemark\").value;" +NEW_LINE_ONLY+
				getNbsp(3)+"var nextApproveUser=document.getElementById(\"nextApproveUser\").value;" +NEW_LINE_ONLY+
				getNbsp(3)+"var approveType;"+NEW_LINE_ONLY+
				getNbsp(4)+"approveType=document.getElementById(\"approveType\").value;" +NEW_LINE_ONLY+
				getNbsp(3)+"layer.close(index);" +NEW_LINE_ONLY+
				getNbsp(3)+"saveData(approveRemark,approveType,nextApproveUser);" +NEW_LINE_ONLY+
				getNbsp(2)+"}," +NEW_LINE_ONLY+
				getNbsp(1)+"})"+NEW_LINE_ONLY+
				getNbsp(0)+"}"+NEW_LINE_ONLY+
				
				
				getNbsp(0)+"function saveData(approveRemark,approveType,nextApproveUser){" +NEW_LINE_ONLY+
				getNbsp(1)+"var paramsMap = {};"+NEW_LINE_ONLY+
				getNbsp(1)+"var _param = {}" +NEW_LINE+
				getNbsp(1)+"_param.formId=_formId_"+form.getPojoform().getFormDefId()+NEW_LINE+
				getNbsp(1)+"_param.buttonId="+buttonId+NEW_LINE+
				getNbsp(1)+"_param = getdata(_param.buttonId,_formId_"+form.getPojoform().getFormDefId()+")"+NEW_LINE+
				getNbsp(1)+"_param.paramsMap = paramsMap;" +NEW_LINE_ONLY+
				getNbsp(1)+"$.ajax({" +NEW_LINE_ONLY+
				getNbsp(2)+"url:'/myehr/form/saveButtonSave.action'," +NEW_LINE_ONLY+
				getNbsp(2)+"type:'post'," +NEW_LINE_ONLY+
				getNbsp(2)+"data: JSON.stringify(_param)," +NEW_LINE_ONLY+
				getNbsp(2)+"cache: false," +NEW_LINE_ONLY+
				getNbsp(2)+"contentType: 'application/json;charset=utf-8'," +NEW_LINE_ONLY+
				getNbsp(2)+"success: function (text) {\n"+
				getNbsp(3)+"if(text[0]!=0){\n"+
				getNbsp(3)+"	alert(\"保存失败！\");\n"+
				getNbsp(3)+"}else if(text[0]=='error'){\n"+
				getNbsp(3)+"	alert(\"操作异常\");\n"+
				getNbsp(3)+"}else {\n"+
				getNbsp(3)+"	submit5(_param.buttonId,approveRemark,approveType,nextApproveUser);\n"+
				getNbsp(3)+"}\n"+
				getNbsp(2)+"}" +NEW_LINE_ONLY+
				getNbsp(1)+"});" +NEW_LINE_ONLY+
				getNbsp(0)+"}" +NEW_LINE_ONLY+
				
				
				getNbsp(0)+"function submit5(buttonId,approveRemark,approveType,nextApproveUser){" +NEW_LINE_ONLY+
				getNbsp(1)+"var paramsMap = {};"+NEW_LINE_ONLY+
				getNbsp(1)+"var _param = {}" +NEW_LINE+
				getNbsp(1)+"_param.formId=_formId_"+form.getPojoform().getFormDefId()+NEW_LINE+
				getNbsp(1)+"_param.buttonId="+buttonId+NEW_LINE+
				getNbsp(1)+"_param = getdata(_param.buttonId,_formId_"+form.getPojoform().getFormDefId()+")"+NEW_LINE+
				getNbsp(1)+"paramsMap= {nextApproveUser:nextApproveUser,approveRemark:approveRemark,approveType:approveType,isInit:'${param.isInit}',pkId:'${param.pkId}'};" +NEW_LINE_ONLY+
				getNbsp(1)+"_param.paramsMap = paramsMap;" +NEW_LINE_ONLY+
				
				getNbsp(1)+"$.ajax({" +NEW_LINE_ONLY+
				getNbsp(2)+"url:'/myehr/form/saveFreeSubmit.action'," +NEW_LINE_ONLY+
				getNbsp(2)+"type:'post'," +NEW_LINE_ONLY+
				getNbsp(2)+"data: JSON.stringify(_param)," +NEW_LINE_ONLY+
				getNbsp(2)+"cache: false," +NEW_LINE_ONLY+
				getNbsp(2)+"contentType: 'application/json;charset=utf-8'," +NEW_LINE_ONLY+
				getNbsp(2)+"success: function (text) {\n"+
				getNbsp(3)+"if(text[0]==0){\n"+
				getNbsp(3)+"	alert(\"保存失败！\");\n"+
				getNbsp(3)+"}else if(text[0]=='error'){\n"+
				getNbsp(3)+"	alert(\"操作异常\");\n"+
				getNbsp(3)+"}else {\n"+
				getNbsp(3)+"	alert(\"操作成功\");\n"+
				getNbsp(3)+"	closex()\n"+
				getNbsp(3)+"}\n"+
				getNbsp(2)+"}" +NEW_LINE_ONLY+
				getNbsp(1)+"});" +NEW_LINE_ONLY+
				getNbsp(0)+"}\n";
		return temp;
	}
	
	/**
	 * 获取卡片式表单 保存按钮 的click方法的 default处理方法
	 * @param str10 
	 * @param hzsql 
	 * @return
	 */
	public static String getCardFormSubmitJs(String funName,String successType, String str10,long buttonId,
			String pkJsId,String pkColumnName, SysFormGeneralExecSqlCache hzsql ,SysFormconfigCache form,SysRequestParam request){
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
		String paramjs = SysFormGeneralExecSqlCache.getCardParamsJsStr(params, form, request, false);
		st += SysCardFormBeansUtil.getNbsp(6)+"if(window.parent._loadmstmaindata){"+SysCardFormBeansUtil.NEW_LINE;
		st += SysCardFormBeansUtil.getNbsp(7)+"window.parent._loadmstmaindata()"+SysCardFormBeansUtil.NEW_LINE;
		st += SysCardFormBeansUtil.getNbsp(6)+"}"+SysCardFormBeansUtil.NEW_LINE;
		
		
		String temp = getNbsp(0)+"function submit2(buttonType){" +NEW_LINE_ONLY+str10+
				getNbsp(1)+"if(buttonType=='通过'){"+NEW_LINE_ONLY+
				getNbsp(2)+"content = \"<textarea id='approveRemark' rows='7' cols='63' ></textarea>\";"+NEW_LINE_ONLY+
				getNbsp(1)+"}else if(buttonType=='驳回'){"+NEW_LINE_ONLY+
				getNbsp(2)+"content = \"<div style='margin-bottom:10px'><select id='rejectType' ><option value ='previousNode'>驳回到上节点</option><option value ='startUser'>驳回到发起人</option><option value ='free'>自由选择节点</option></select></div>\";"+NEW_LINE_ONLY+
				getNbsp(2)+"content += \"<textarea id='approveRemark' rows='7' cols='63' ></textarea>\";"+NEW_LINE_ONLY+
				getNbsp(1)+"}else{"+NEW_LINE_ONLY+
				getNbsp(2)+"saveData(buttonType,'','');" +NEW_LINE_ONLY+
				getNbsp(2)+"return;" +NEW_LINE_ONLY+
				getNbsp(1)+"}"+NEW_LINE_ONLY+
				getNbsp(1)+"layer.open({"+NEW_LINE_ONLY+
				getNbsp(2)+"title:'请填写审批意见',"+NEW_LINE_ONLY+
				getNbsp(2)+"shadeClose: true,"+NEW_LINE_ONLY+
				getNbsp(2)+"zIndex:9999,"+NEW_LINE_ONLY+
				getNbsp(2)+"content: content,"+NEW_LINE_ONLY+
				getNbsp(2)+"area: ['500px', '300px'],"+NEW_LINE_ONLY+
				getNbsp(2)+"btn: ['确定', '取消'],"+NEW_LINE_ONLY+
				getNbsp(2)+"yes:function(index, layero){" +NEW_LINE_ONLY+
				getNbsp(3)+"var approveRemark=document.getElementById(\"approveRemark\").value;" +NEW_LINE_ONLY+
				getNbsp(3)+"var rejectType;"+NEW_LINE_ONLY+
				getNbsp(3)+"if(buttonType=='驳回'){"+NEW_LINE_ONLY+
				getNbsp(4)+"rejectType=document.getElementById(\"rejectType\").value;" +NEW_LINE_ONLY+
				getNbsp(3)+"}"+NEW_LINE_ONLY+
				getNbsp(3)+"layer.close(index);" +NEW_LINE_ONLY+
				getNbsp(3)+"saveData(buttonType,approveRemark,rejectType);" +NEW_LINE_ONLY+
				getNbsp(2)+"}," +NEW_LINE_ONLY+
				getNbsp(1)+"})"+NEW_LINE_ONLY+
				getNbsp(0)+"}"+NEW_LINE_ONLY+
				
				
				getNbsp(0)+"function saveData(buttonType,approveRemark,rejectType){" +NEW_LINE_ONLY+
				getNbsp(1)+"var paramsMap = {};"+NEW_LINE_ONLY+
				getNbsp(1)+"var _param = {}" +NEW_LINE+
				getNbsp(1)+"_param.formId=_formId_"+form.getPojoform().getFormDefId()+NEW_LINE+
				getNbsp(1)+"_param.buttonId="+buttonId+NEW_LINE+
				getNbsp(1)+"_param = getdata(_param.buttonId,_formId_"+form.getPojoform().getFormDefId()+")"+NEW_LINE+
				getNbsp(1)+"_param.paramsMap = paramsMap;" +NEW_LINE_ONLY+
				getNbsp(1)+"$.ajax({" +NEW_LINE_ONLY+
				getNbsp(2)+"url:'/myehr/form/saveButtonSave.action'," +NEW_LINE_ONLY+
				getNbsp(2)+"type:'post'," +NEW_LINE_ONLY+
				getNbsp(2)+"data: JSON.stringify(_param)," +NEW_LINE_ONLY+
				getNbsp(2)+"cache: false," +NEW_LINE_ONLY+
				getNbsp(2)+"contentType: 'application/json;charset=utf-8'," +NEW_LINE_ONLY+
				getNbsp(2)+"success: function (text) {\n"+
				getNbsp(3)+"if(text[0]!=0){\n"+
				getNbsp(3)+"	alert(\"保存失败！\");\n"+
				getNbsp(3)+"}else if(text[0]=='error'){\n"+
				getNbsp(3)+"	alert(\"操作异常\");\n"+
				getNbsp(3)+"}else {\n"+
				getNbsp(3)+"	submit5(_param.buttonId,buttonType,approveRemark,rejectType);\n"+
				getNbsp(3)+"}\n"+
				getNbsp(2)+"}" +NEW_LINE_ONLY+
				getNbsp(1)+"});" +NEW_LINE_ONLY+
				getNbsp(0)+"}" +NEW_LINE_ONLY+
				
				getNbsp(0)+"function submit3(){" +NEW_LINE_ONLY+
				getNbsp(1)+"var paramsMap = {};"+NEW_LINE_ONLY+
				getNbsp(1)+"var _param = {}" +NEW_LINE+
				getNbsp(1)+"_param.formId=_formId_"+form.getPojoform().getFormDefId()+NEW_LINE+
				getNbsp(1)+"_param.buttonId="+buttonId+NEW_LINE+
				getNbsp(1)+"_param = getdata(_param.buttonId,_formId_"+form.getPojoform().getFormDefId()+")"+NEW_LINE+
				getNbsp(1)+"_param.paramsMap = paramsMap;" +NEW_LINE_ONLY+
				getNbsp(1)+"_param.actFlowParams= {key:'${param.key}'};" +NEW_LINE_ONLY+
				
				getNbsp(1)+"$.ajax({" +NEW_LINE_ONLY+
				getNbsp(2)+"url:'/myehr/act/task/start.action'," +NEW_LINE_ONLY+
				getNbsp(2)+"type:'post'," +NEW_LINE_ONLY+
				getNbsp(2)+"data: JSON.stringify(_param)," +NEW_LINE_ONLY+
				getNbsp(2)+"cache: false," +NEW_LINE_ONLY+
				getNbsp(2)+"contentType: 'application/json;charset=utf-8'," +NEW_LINE_ONLY+
				getNbsp(2)+"success: function (text) {\n"+
				getNbsp(3)+"if(text[0]==0){\n"+
				getNbsp(3)+"	alert(\"保存失败！\");\n"+
				getNbsp(3)+"}else if(text[0]=='error'){\n"+
				getNbsp(3)+"	alert(\"操作异常\");\n"+
				getNbsp(3)+"}else {\n"+
				getNbsp(3)+"	alert(\"操作成功\");\n"+
				getNbsp(3)+"	closex()\n"+
				getNbsp(3)+"}\n"+
				getNbsp(2)+"}" +NEW_LINE_ONLY+
				getNbsp(1)+"});" +NEW_LINE_ONLY+
				getNbsp(0)+"}\n"+
				
				
				getNbsp(0)+"function submit5(buttonId,buttonType,approveRemark,rejectType){" +NEW_LINE_ONLY+
				getNbsp(1)+"var flowAction = '${param.flowAction}';\n"+
				getNbsp(1)+"if(flowAction=='start'){\n"+
				getNbsp(2)+"submit3(buttonId);\n"+
				getNbsp(1)+"}else{\n"+
				getNbsp(2)+"submit4(buttonId,buttonType,approveRemark,rejectType);\n"+
				getNbsp(1)+"}\n"+
				getNbsp(0)+"}\n";
		return temp;
	}
	
	public static String getFormIdJs(String formId){
		return getNbsp(1)+"var _formId_"+formId+"='"+formId+"';\nvar realFormId='${param.formId}'";
	}
	
	/**
	 * 获卡片表单初始化函数
	 * @param request
	 * @param form
	 * @return
	 */
	public static String getCardFormInitFunction(SysRequestParam request,SysFormconfigCache form,StringBuffer[] sbs,String mstFormType){
		String funstr ="";
		List<SysFormWhereCache> wheres = form.getWheres();
		String whereObj = getParamStringJson(wheres,request,mstFormType);
		String str11 = sbs[11].toString(); //u富文本回填js段
		//String lookupFun = form.getContainLookup()==true?getNbsp(5)+"var _lookupData=text.rows[0]"+NEW_LINE+getNbsp(5)+LOOKUP_BACK_FUN_NAME+NEW_LINE:"";
		String pkColumn = "";
		String initFollowFormJs = "";
		if(form.getPkColumn()!=null){
			pkColumn = form.getPkColumn().getFormFiledTablename();
		}
		if (mstFormType!=null && mstFormType.equals("main")) {
			initFollowFormJs = getNbsp(5) + "	_initParamCard();\n"+
					getNbsp(5) + "	_initFollowCard();\n";
		}
		funstr =getNbsp(1)+"function _initData_"+form.getPojoform().getFormDefId()+"(pkId){"+NEW_LINE_ONLY+
				getNbsp(2)+"var _param = {}"+NEW_LINE+
				getNbsp(2)+"if(pkId){"+NEW_LINE_ONLY+
				getNbsp(3)+"if('${param.businessId}'!=null && '${param.businessId}'!=''){"+NEW_LINE_ONLY+
				getNbsp(4)+"_param = {requestParam:"+whereObj+",pkId:pkId,formId:_formId_"+form.getPojoform().getFormDefId()+"}" +NEW_LINE+
				getNbsp(3)+"}else{" +NEW_LINE+
				getNbsp(4)+"_param = {pkId:pkId,formId:_formId_"+form.getPojoform().getFormDefId()+"}" +NEW_LINE+
				getNbsp(3)+"}"+NEW_LINE_ONLY+
				getNbsp(2)+"}else {"+NEW_LINE_ONLY+
				getNbsp(3)+"if('${param.businessId}'!=null && '${param.businessId}'!=''){"+NEW_LINE_ONLY+
				getNbsp(4)+"_param = {requestParam:{"+pkColumn+":'${param.businessId}'},pkId:pkId,formId:_formId_"+form.getPojoform().getFormDefId()+"}" +NEW_LINE+
				getNbsp(3)+"}else{" +NEW_LINE+
				getNbsp(4)+"_param = {requestParam:"+whereObj+",pkId:pkId,formId:_formId_"+form.getPojoform().getFormDefId()+"}" +NEW_LINE+
				getNbsp(3)+"}"+NEW_LINE_ONLY+
				getNbsp(2)+"}"+NEW_LINE_ONLY+
				getNbsp(2)+"_param.containerParam = containerParam;"+NEW_LINE_ONLY+
				getNbsp(2)+"var _form = getForm(\"#form_"+form.getPojoform().getFormDefId()+"\")"+NEW_LINE+
				getNbsp(2)+"var _Type = getType(\"#form_"+form.getPojoform().getFormDefId()+"\")"+NEW_LINE+
				getNbsp(2)+"$.ajax({" +NEW_LINE_ONLY+
				getNbsp(3)+"url:'"+CARD_FORM_INIT_DATA_URL+"'," +NEW_LINE_ONLY+
				getNbsp(3)+"type:'post'," +NEW_LINE_ONLY+
				getNbsp(3)+"data: JSON.stringify(_param)," +NEW_LINE_ONLY+
				getNbsp(3)+"cache: false," +NEW_LINE_ONLY+
				getNbsp(3)+"async: false," +NEW_LINE_ONLY+
				getNbsp(3)+"contentType: 'application/json;charset=utf-8'," + NEW_LINE_ONLY +
				getNbsp(3)+"success: function (text) {" + NEW_LINE_ONLY +
//				getNbsp(4)+"if(text.datas&&text.datas.length>0){" + NEW_LINE_ONLY +
//				getNbsp(5) + "_form.setData(text.datas[0])" + NEW_LINE + lookupFun + str11 +sbs[14]+
				getNbsp(4) + "if(text.rows&&text.rows.length>0){" + NEW_LINE_ONLY +
				getNbsp(5) + "	 var object = text.rows[0];\n"+
				getNbsp(5) + "	 var buttonType = '${param.buttonType}';\n"+
				getNbsp(5) + "	 for(var key in object){\n"+
				getNbsp(5) + "	    if(key=='"+ChangeCode.getUniqueCode(form.getFormDefSaveTable(), pkColumn)+"'){\n"+
				getNbsp(5) + "	        if(buttonType=='copyAndUpdate'){\n"+
				getNbsp(5) + "	            continue;\n"+
				getNbsp(5) + "	        }\n"+
				getNbsp(5) + "	    }\n"+
				getNbsp(6) + "		if(_form[key]!=null&&_form[key]!=\"undefined\"){\n"+
				getNbsp(7) + "			if(_Type[key]==\"dateTime\" && object[key]!=null){\n"+
				getNbsp(7) + "				date = object[key]+\"\";\n"+
				getNbsp(7) + "				if(date.indexOf(\":\") > 0){\n"+
				getNbsp(7) + "		    		date = object[key];\n"+
				getNbsp(7) + "				}else{\n"+
				getNbsp(7) + "		    		if(object[key]==null || object[key]==\"\"){\n"+
				getNbsp(7) + "						date = object[key]\n"+
				getNbsp(7) + "					}else{\n"+
				getNbsp(7) + "						date = new Date(object[key]).Format(\"yyyy-MM-dd hh:mm:ss\");\n"+
				getNbsp(7) + "					}\n"+
				getNbsp(7) + "				}\n"+
				getNbsp(7) + "				document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);\n"+
				getNbsp(7) + "				}else if(_Type[key]==\"search\" && object[key]!=null){\n"+
				getNbsp(8) + "				$(\"[id='\"+_form[key]+\"']\").selectpicker('val', object[key]);\n"+
				getNbsp(7) + "				}else if(_Type[key]==\"mupick\" && object[key]!=null){\n"+
				getNbsp(8) + "				var xxx=(object[key]+\"\").split(\",\");\n"+
				getNbsp(8) + "				$(\"[id='\"+_form[key]+\"']\").selectpicker('val', xxx);\n"+
				
				getNbsp(7) + "				}else if(_Type[key]==\"fileupload\" && object[key]!=null){\n"+
				getNbsp(7) + "					document.getElementById(_form[key]).value=object[key];\n"+
				getNbsp(7) + "					var fileName = _form[key]+'_fileName';\n"+
				getNbsp(7) + "					var fileNameValue = getFilenameById(object[key]);\n"+
				getNbsp(7) + "					document.getElementById(fileName).value=fileNameValue;\n"+
				getNbsp(7) + "				}else if(_Type[key]==\"inputSelect\" && object[key]!=null){\n"+
				getNbsp(7) + "					var obj = document.getElementById(_form[key]);\n"+
				getNbsp(7) + "					var dataField = obj.attributes.dataField1.value\n;"+
				getNbsp(7) + "					var DictName = obj.attributes.DictName.value\n;"+
				getNbsp(7) + "			    	selectSqlDictEntryByValue(_form[key],object[key],dataField,DictName);\n"+
				getNbsp(7) + "				}else if(_Type[key]==\"richText\" && object[key]!=null){\n"+
				getNbsp(7) + "					$(\"[id='\"+_form[key]+\"']\").val(object[key]);\n"+
				getNbsp(7) + "					$(\"[id='\"+_form[key]+\"']\").change();\n"+
				getNbsp(7) + "				}else if(_Type[key]==\"lookUp\" && object[key]!=null){\n"+
				getNbsp(7) + "					$(\"[id='\"+_form[key]+\"']\").val(object[key]);\n"+
				getNbsp(7) + "					$(\"[id='\"+_form[key]+\"_name']\").val(getLookupValue(_form[key],object[key]));\n"+
				getNbsp(7) + "				}else{\n"+
				getNbsp(7) + "					document.getElementById(_form[key]).value=object[key];\n"+
				getNbsp(7) + "				}\n"+
				getNbsp(6) + "			}\n"+
				getNbsp(5) + "		};\n"+
				
				initFollowFormJs+
				getNbsp(5) + str11 +sbs[14]+
				getNbsp(5) + sbs[15] +"\n"+
				
				//	getNbsp(5) + sbs[14]==null?"":sbs[14].toString() + NEW_LINE  +
				getNbsp(5) + "if(\"undefined\" != typeof mstTab_activechanged ){"+NEW_LINE_ONLY+
				getNbsp(6) + "mstTab_activechanged();" + NEW_LINE_ONLY +
				getNbsp(5) + "}" + NEW_LINE_ONLY +
				getNbsp(5) + "initFormNameWithSelectColumn();\n"+
				//getNbsp(5) + "cardSelectInitValueFunction();" + NEW_LINE_ONLY +
				getNbsp(4) + "} else {" + NEW_LINE_ONLY	+
				//getNbsp(5)+"_initAfter()" +NEW_LINE+
				getNbsp(4)+"}" +NEW_LINE_ONLY+
				getNbsp(3)+"}," +NEW_LINE_ONLY+
				getNbsp(3)+"error: function (jqXHR, textStatus, errorThrown) {" +NEW_LINE_ONLY+
				getNbsp(3)+"}" +NEW_LINE_ONLY+
				getNbsp(2)+"});" +NEW_LINE_ONLY+
				getNbsp(1)+"}"+NEW_LINE_ONLY;
		return funstr;
	}
	
	public static String getEmptyTd(int colspan){
		String res = SysCardFormBeansUtil.getNbsp(3)+"<td colspan=\""+colspan+"\">&nbsp;</td>";
		return res;
		
	}
	
	/**
	 * 生成最终的值 把参数里面值直接获取生成json串
	 */
	public static String getParamStringJson(List<SysFormWhereCache> wheres ,SysRequestParam request,String mstFormType){
		String whereObj = "";
		for(SysFormWhereCache where:wheres){
			String temp ="";
			if("parameter".equals(where.getFormWhereValueType())){
//				String _value = request.getParameter(where.getFormWhereValue());
				if (mstFormType!=null && mstFormType.equals("follow")) {
					String _value = where.getFormWhereValue();
					temp += ""+where.getFormWhereValue().toUpperCase()+":"+_value+",";
				}else {
					String _value = "${param."+where.getFormWhereValue().toUpperCase()+"}";
					temp += ""+where.getFormWhereValue().toUpperCase()+":"+"'"+_value+"',";
				}
			}else if("session".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				if (mstFormType!=null && mstFormType.equals("follow")) {
					String _value = where.getFormWhereValue();
					temp += ""+where.getFormWhereValue().toUpperCase()+":"+_value+",";
				}else {
					String _value = "${sessionScope."+where.getFormWhereValue()+"}";
					temp += ""+where.getFormWhereValue().toUpperCase()+":"+"'"+_value+"',";
				}
			}
			whereObj+=temp;
		}
		//判断固定流程发过来的参数 _workflowBusPrimaryKeyParamName
		String _workflowBusPrimaryKeyParamName = request.get_workflowBusPrimaryKeyParamName();
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
	
	/**
	 * 生成最终的值 把参数里面值直接获取生成json串
	 */
	public static String getParamStringJsonMst(List<SysFormWhereCache> wheres,SysRequestParam request){
		String whereObj = "";
		for(SysFormWhereCache where:wheres){
			String temp ="";
			if("parameter".equals(where.getFormWhereValueType())){
//				String _value = request.getParameter(where.getFormWhereValue());
				String _value = where.getFormWhereValue().toUpperCase();
				temp += ""+where.getFormWhereValue().toUpperCase()+":"+_value+"+\"\",";
				
			}else if("urlParam".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				String _value = where.getFormWhereValue();
				temp += ""+where.getFormWhereValue().toUpperCase()+":"+_value+"+\"\",";
			}/*else if("session".equals(where.getFormWhereValueType())){
				//${sessionScope.ip_alert}
				String _value = where.getFormWhereValue();
				temp += ""+where.getFormWhereValue()+":"+_value+"+\"\",";
			}*/
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
	
	/**
	 * 用jsp方式生成参数集。
	 */
	public static String getParamJspJson(List<SysFormWhereCache> wheres ,HttpServletRequest request){
		String whereObj = "{}";
		for(SysFormWhereCache where:wheres){
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
	
	/**
	 *生成  普通表单保存按钮的自定url保存方法。
	 * @param string
	 * @param buttonSaveUrl
	 * @param buttonSaveSuccessDeal
	 * @return
	 */
	public static String getCardFormUrlSaveJs(String string, String buttonSaveUrl, String buttonSaveSuccessDeal) {
		// TODO 自动生成方法存根
		String temp="";
		temp+=getNbsp(0)+"function "+string+"(){" +NEW_LINE_ONLY;
		temp+=getNbsp(1)+"layer.open({ "+NEW_LINE_ONLY;
		temp+=getNbsp(2)+"type: 2," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"title:'正式工卡片'," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"shadeClose: true," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"shade: 0.8," +NEW_LINE_ONLY;
//		temp+=getNbsp(2)+"offset: ['0px', '0px']," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"area: ['1000', '600']," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"maxmin:true," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"zIndex:layer.zIndex," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"content: '"+buttonSaveUrl+"'," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"success:function(layero,index){" +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"layer.setTop(layero);" +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"$('.layui-layer-max').click();" +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"}," +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"end:function(){" +NEW_LINE_ONLY;
		temp+=getNbsp(3)+"refresh_emp_a01_list();" +NEW_LINE_ONLY;
		temp+=getNbsp(2)+"}" +NEW_LINE_ONLY;
		temp+=getNbsp(1)+"});" +NEW_LINE_ONLY;
		temp+=getNbsp(0)+"}" +NEW_LINE_ONLY;
		return temp;
	}
	
	/**
	 *生成  普通表单保存按钮的自定url保存方法。
	 * @param string
	 * @param buttonSaveUrl
	 * @param buttonSaveSuccessDeal
	 * @return
	 */
	public static String getCardFormFunSaveJs(String funName, String js) {
		// TODO 自动生成方法存根
		
		String temp = getNbsp(1)+"function "+funName+"(){" +NEW_LINE_ONLY+js+NEW_LINE_ONLY+
				getNbsp(1)+"}\n";
		return temp;
		
	}
	
	/**
	 * 判断某个按钮是否有权限
	 * @param objs
	 * @param fieldId
	 * @return
	 */
	public static boolean hasButtons(List<SysFormButtonCache> objs, String string, String isView, String formAuthorityIsControl){
		boolean isHas = false;
		boolean isControl = "Y".equals(formAuthorityIsControl);
		if(isControl ==false){
			if (!"true".equals(isView)) {
				if (objs != null && objs.size() > 0) {
					for(int i=0; i<objs.size(); i++){
						String buttonIdTemp =  objs.get(i).getFormButtonId().toString();
						if(string.equals(buttonIdTemp)){
							return true;
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
	
	/**
	 * 判断某个字段是否在权限集合内
	 * @param objs
	 * @param fieldId
	 * @return
	 */
	public static boolean hasFiled(List<Map> objs,String columnId, String isView, String formAuthorityIsControl){
		boolean isHas = false;
		
		boolean isControl = "Y".equals(formAuthorityIsControl);
		if(isControl ==false){
			if (!"true".equals(isView) ) {
				if (objs != null && objs.size() > 0) {
					for (int i = 0; i < objs.size(); i++) {
						String columnIdTemp = (String) objs.get(i).get("formColumnId");
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
	
	
	
	public static String[] getLookupOpenJs(SysRequestParam requst ,String title,String width,String height,String winType,String formurl,String formId,String jsId,String otherColumnJsId,
			String backType,String backValue,String fieldName,String otherField,String showProperty,String valueProperty,boolean isGridQuery,
			Map<String, List<SysFormGeneralParamCache>> params, SysRequestParam request,SysFormconfigCache form,String lookupCustomDataback,
			String lookupCustomDatabackFun,SysFormGeneralExecSqlCache backsql, long columnId){
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
			List<SysFormGeneralParamCache>  l = params.get(endtype);			
						
			String paramStr = SysCardFormColumnUtil.getGeneralParamStr(l,request);
		    if(l!=null){
				for(int i=0;i<l.size();i++){
					if("card".equals(l.get(i).getParamFromType())){
						String cid = form.serchColumnByColumnName(l.get(i).getParamFromTypeValue(),form.getPojoform().getFormDefId().toString()).getJsId("id",form.getPojoform().getFormDefId().toString());
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
					SysFormColumnCache sfc = form.serchColumnByColumnId(Long.parseLong(str));
					String str1 = sfc.getJsId("id",form.getPojoform().getFormDefId().toString());
					
					String str3 = SysCardFormBeansUtil.getNbsp(2) + "'c_" + str + "' : " + "document.getElementById(\""+str1+"\").value;\n";
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
			if(jsParams.endsWith(";\n")){
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
		 
		/*if(Long.valueOf(height)>1500){
			height = "1500";
		}
		if(Long.valueOf(width)<500){
			width = "500";
		}*/
		
		String temp = "";
		temp+= paramtt;
		temp+=getNbsp(2)+"var id = $(e).prev().prev()[0].id;\n";
		temp+=getNbsp(2)+"var url = '"+realUrl+"'+\"&idField="+valueProperty+"&textField="+showProperty+"&fatherId=\"+id+\"\";\n";
		temp+=getNbsp(2)+"layer.open({\n";
		temp+=getNbsp(3)+"type:2,\n";
		temp+=getNbsp(3)+"closeBtn:1,\n";
		temp+=getNbsp(3)+"shadeClose:true,\n";
		temp+=getNbsp(3)+"area:['"+width+"','"+height+"'],\n";
		temp+=getNbsp(3)+"title:'"+title+"',\n";
		temp+=getNbsp(3)+"content:url,\n";
		temp+=getNbsp(3)+"success:function(layero,index){\n";
		temp+=SysCardFormBeansUtil.getNbsp(3)+"$('.layui-layer-max').click();\n";
		temp+=getNbsp(3)+"},\n";
		temp+=getNbsp(3)+"end:function(){";
		temp+=getNbsp(3)+"}\n";
//		temp+=getNbsp(2)+"nui.open({\n";
//
//		if (realUrl.indexOf("encodeURI") < 0) {
//			realUrl = "encodeURI(\"" + realUrl + "\")";
//		}
//		
//		temp+=getNbsp(3)+"url:" + realUrl + ",\n"; //showMaxButton: false,
//		temp+=getNbsp(3)+"showMaxButton: true,\n";
//		temp+=getNbsp(3)+"title:\""+title+"\" ,\n";
//		temp+=getNbsp(3)+"width:\""+width+"\" ,\n";
//		temp+=getNbsp(3)+"height:\""+height+"\" ,\n";
//		temp+=getNbsp(3)+"onload:function(){ \n"+onloadJs;
//		temp+=getNbsp(4)+"var _data = {"+valueProperty+":lookupId,"+showProperty+":lookupText};\n";
//		temp+=getNbsp(4)+"var iframe = this.getIFrameEl();\n";
//		
//	//	temp+=getNbsp(4)+"iframe.contentWindow.SetData(_data);\n";
//		temp+=getNbsp(3)+"},\n";
//		
//		temp+=getNbsp(3)+"ondestroy: function (action){\n";
//		temp+=getNbsp(3)+"if (action == 'ok') {\n";
//	
//		temp+=getNbsp(5)+"iframe = this.getIFrameEl();\n";
//		temp+=getNbsp(5)+"var data = iframe.contentWindow.GetData();\n";
//		temp+=getNbsp(5)+"data = nui.clone(data);\n";
//		temp+=getNbsp(5)+"if (data) {	\n";
//	    // var id = '';
//		//var name = '';//循环 ，取值
//		temp+=getNbsp(6)+"var arr=nui.decode(data);\n";
//		
//		temp+=getNbsp(6)+"var id='';\n";
//		temp+=getNbsp(6)+"var text='';\n";
//
//		temp+=getNbsp(6)+"for(var i=0;i<arr.length;i++){ \n";
//		
//		temp+=getNbsp(7)+"if(i==arr.length-1) { \n";
//		temp+=getNbsp(8)+" id += arr[i]."+valueProperty+";\n";
//		temp+=getNbsp(8)+" text += arr[i]."+showProperty+";\n";
//
//		temp+=getNbsp(7)+"} else { \n";
//		temp+=getNbsp(8)+" id += arr[i]."+valueProperty+"+',';\n";
//		temp+=getNbsp(8)+" text += arr[i]."+showProperty+"+',';\n";
//	
//		temp+=getNbsp(7)+"}\n";
//		temp+=getNbsp(6)+"}\n";
//		temp+=backValueJs+"\n";
//
//
//		temp+=getNbsp(6	)+"nui.get('"+jsId+"').setValue(id);\n";
//		//temp+=getNbsp(7)+"nui.get('"+jsId+"').setText(text);\n";
//
//		
//		if("Y".equals(lookupCustomDataback)){ //自定义回显方案
//			temp+=getNbsp(6)+lookupCustomDatabackFun+"\n";
//		}
        

		
		
//		temp+=getNbsp(5)+"}\n";
//		temp+=getNbsp(4)+"}\n";
//		temp+=getNbsp(3)+"}\n";
		temp+= getNbsp(2)+" }); \n";
	
		results[0] = temp;
		results[1] = backSqljs;
		results[2] = backSqljsFunname;
		return results;
	}
	
	//判空js
	public static final String checkNullJs(){
	   String str = SysCardFormBeansUtil.getNbsp(1)+"function checkNull(id){\n"+
					SysCardFormBeansUtil.getNbsp(2)+"var xxx = \"\";\n"+
					SysCardFormBeansUtil.getNbsp(2)+"var flag = false;\n"+
					SysCardFormBeansUtil.getNbsp(2)+"$(id).find(\"input,select\").each(function(){\n"+
					SysCardFormBeansUtil.getNbsp(3)+"if($(this).attr(\"required\")!=undefined&&$(this).attr(\"required\")=='true'){\n"+
					SysCardFormBeansUtil.getNbsp(4)+"if($(this).val()==\"\"||$(this).val()==null){\n"+
					SysCardFormBeansUtil.getNbsp(5)+"$(this).css('border-color','red');\n"+
					SysCardFormBeansUtil.getNbsp(5)+"$(this).attr(\"placeholder\",\"此项不能为空\");\n"+
	   				SysCardFormBeansUtil.getNbsp(5)+"flag = true;\n"+
	   				SysCardFormBeansUtil.getNbsp(4)+"}else{\n"+
					SysCardFormBeansUtil.getNbsp(5)+"$(this).css('border-color','#000');\n"+
					SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					SysCardFormBeansUtil.getNbsp(3)+"}\n"+
					SysCardFormBeansUtil.getNbsp(3)+"var bb=$(this).val();\n"+
					SysCardFormBeansUtil.getNbsp(3)+"var vtype=$(this).attr('vtype');\n"+
					SysCardFormBeansUtil.getNbsp(3)+"var vtypes= new Array();\n"+
					SysCardFormBeansUtil.getNbsp(3)+"if(vtype!=null&&vtype!=undefined){\n"+
								
					SysCardFormBeansUtil.getNbsp(4)+"vtypes=vtype.split(\";\");\n"+
	   				SysCardFormBeansUtil.getNbsp(4)+"var re=new RegExp(\"[^?!@#$%\\^&*()]+$\");\n"+
	   				SysCardFormBeansUtil.getNbsp(4)+"var errorText = \"包含非法字符\";\n"+
	   				SysCardFormBeansUtil.getNbsp(4)+"if (bb !=\"\" && bb!=null) {\n"+
					SysCardFormBeansUtil.getNbsp(5)+"if(vtypes[0].indexOf(\"letter\")==0){\n"+
					SysCardFormBeansUtil.getNbsp(6)+"re = new RegExp(\"^[a-zA-Z\\_]+$\");//自定义英文\n"+
					SysCardFormBeansUtil.getNbsp(6)+"errorText = \"请输入正确的英文\";\n"+
	   				SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					SysCardFormBeansUtil.getNbsp(5)+"if(vtypes[0].indexOf(\"zh\")==0){\n"+
					SysCardFormBeansUtil.getNbsp(6)+"re = new RegExp(\"^[\\u4e00-\\u9fa5]+$\");//自定义中文\n"+
					SysCardFormBeansUtil.getNbsp(6)+"errorText = \"请输入正确的中文\";\n"+
	   				SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					SysCardFormBeansUtil.getNbsp(5)+"if(vtypes[0].indexOf(\"chinaMobile\")==0){\n"+
					SysCardFormBeansUtil.getNbsp(6)+"re = /1\\d{10}/;//自定义手机号码\n"+
					SysCardFormBeansUtil.getNbsp(6)+"errorText = \"请输入正确的手机号码\";\n"+
	   				SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					SysCardFormBeansUtil.getNbsp(5)+"if(vtypes[0].indexOf(\"chinaZipcode\")==0){\n"+
					SysCardFormBeansUtil.getNbsp(6)+"re = /[1-9]{1}(\\d+){5}/;//自定义邮政编码\n"+
					SysCardFormBeansUtil.getNbsp(6)+"errorText = \"请输入正确的英文\";\n"+
	   				SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					SysCardFormBeansUtil.getNbsp(5)+"if(vtypes[0].indexOf(\"chinaIDNo\")==0){\n"+
					SysCardFormBeansUtil.getNbsp(6)+"re = /^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$/;//自定义身份证号码\n"+
					SysCardFormBeansUtil.getNbsp(6)+"errorText = \"请输入正确的身份证号码\";\n"+
	   				SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					SysCardFormBeansUtil.getNbsp(5)+"if(vtypes[0].indexOf(\"email\")==0){\n"+
					SysCardFormBeansUtil.getNbsp(6)+"re = /^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;//自定义邮箱\n"+
					SysCardFormBeansUtil.getNbsp(6)+"errorText = \"请输入正确的邮箱\";\n"+
	   				SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					SysCardFormBeansUtil.getNbsp(5)+"if (re.test(bb)) {\n"+
							    	
					SysCardFormBeansUtil.getNbsp(5)+"}else{\n"+
					SysCardFormBeansUtil.getNbsp(6)+"$(this).val('');\n"+
					SysCardFormBeansUtil.getNbsp(6)+"$(this).css('border-color','red');\n"+
					SysCardFormBeansUtil.getNbsp(6)+"$(this).attr(\"placeholder\",errorText);\n"+
					SysCardFormBeansUtil.getNbsp(6)+"flag = true\n"+
					SysCardFormBeansUtil.getNbsp(5)+"}\n"+
					SysCardFormBeansUtil.getNbsp(4)+"}\n"+
					SysCardFormBeansUtil.getNbsp(3)+"}\n"+
					SysCardFormBeansUtil.getNbsp(2)+"})\n"+
					SysCardFormBeansUtil.getNbsp(2)+"return flag;\n"+
					SysCardFormBeansUtil.getNbsp(1)+"}\n";
		return str;
	}	
	
	//
	public static String getLookupSetTextAndValueJs(SysRequestParam requst,String formId,String jsId,String filedName,String backType,String backValue, List<SysFormGeneralParamCache> params, String bizFunName) throws Exception{
		EhCacheTestServiceImpl ehCacheService = new EhCacheTestServiceImpl();
		String temp = "";
		//temp+=getNbsp(2)+"alert(1321);\n";
//		temp+= getNbsp(2)+"nui.get('"+jsId+"').setValue(_lookupData."+filedName+")"+NEW_LINE;
		temp+= getNbsp(2)+"document.getElementById('"+jsId+"').value=_lookupData."+filedName+""+NEW_LINE;
		//temp+=getNbsp(2)+"alert(121);\n";
		if ("self".equals(backType)) { // 数据本字段回填
			//temp+= getNbsp(2)+"nui.get('"+jsId+"').setText(_lookupData."+filedName+")"+NEW_LINE;
			temp+= getNbsp(2)+"document.getElementById('"+jsId+"_name').value=_lookupData."+filedName+""+NEW_LINE;
		} else if ("other".equals(backType)) {   //数据其他字段回填
			//回填值
			//通过字段ID获取当目标字段ID值
			Long columnId = Long.parseLong(backValue);
			Long formId1 = Long.parseLong(formId);
			SysFormconfigCache form =  ehCacheService.getForm(formId1);
			SysFormColumnCache column = form.serchColumnByColumnId(columnId);
			String targColumnHmtlId = "";
			if(column!=null){
				targColumnHmtlId = column.getJsId("id",form.getPojoform().getFormDefId().toString());
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

	/**
	 * @param isAslable 
	 */
	public static String getUeInitJs(SysFormColumnCache column, SysFormRichtextCache richtext,boolean isDisabled, boolean isAslable) {
		
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
		if(isDisabled||isAslable){
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
	
	/**
	 * 获取ue控件回填设置数据js
	 * @return
	 */
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

	/**
	 * ue控件html生成
	 * @param jsId
	 * @param textRichName
	 * @param fieldName
	 * @param entityName
	 * @return
	 */
	public static String getRichTextHtml(String jsId, String textRichName, String fieldName, String entityName,long formId,String isApp,String id) {
		// TODO 自动生成方法存根
		// <script id="mailContent"  type="text/plain"></script>
		//增加hidden隐藏域 getTextBoxHtml
		String ueVarName = textRichName;
		String hidenStr = getTextBoxHtml("richText", jsId, fieldName, null,null, null, null, false, false, false, false, false, entityName, null,null,formId,isApp,"","");
		//获取ue需要的html片段
//		String ueHtml = "<script id=\""+ueVarName+"\"  type=\"text/plain\"></script>";
		String ueHtml = "<script type=\"text/plain\" id=\""+id.split("\\.")[0]+"__"+id.split("\\.")[1]+"\" style=\"width:100%;height:240px;float:left\"></script>\n"+
						"<div style=\"position:absolute;top:0;left:0;width:100%;height:100%;z-index:999;\" id=\""+id.replace(".", "__")+"_cover\"></div>\n"+
						"<span class=\"fa fa-edit\" style=\"position:absolute;top:0;right:0;font-size:20px;z-index:1000\" id=\""+id.replace(".", "__")+"_lock\" onclick=\"changeIndex('"+id.replace(".", "__")+"')\"></span>\n";
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

	/**
	 * 保存的时候需要把ue的内容设置到表单对应字段的hidden框中
	 * @param ueNameJsStr
	 * @param pkJs
	 * @return
	 */
	public static String getSaveJs(String ueNameJsStr,String pkJs,String formId) {
		// TODO 自动生成方法存根
		String js  ="";
		js+=SysCardFormBeansUtil.getNbsp(2)+"$(\"#"+pkJs+"\").val(um_"+ueNameJsStr+"_"+formId+".getContentTxt())"+NEW_LINE;
		return js;
	}

	public static String setUeValueFormHidenJs(String ueNameJsStr, String jsId) {
		// TODO 自动生成方法存根
		String js  ="";
		js+=getNbsp(5)+ueNameJsStr+".ready(function() {"+NEW_LINE_ONLY;
		js+=getNbsp(6)+ueNameJsStr+".setContent($(\"#"+jsId+"\").val())"+NEW_LINE;
		js+=getNbsp(5)+"});"+NEW_LINE_ONLY;
		return js;
	}

	
	/**
	 * 获取把nui控件设置lable显示 js片段
	 * @param jsId
	 * @return
	 */
	public static String getAslableJs(String jsId) {
		// TODO 自动生成方法存根
		String js = "";
		js+=getNbsp(2)+"setReadOnly('"+jsId+"')"+NEW_LINE;
        return js;
	}
	
	/**
	 * 附件上传下载控件初始化代码生成
	 * @param column
	 * @param fileupload
	 * @param isDisable
	 * @param isAslable
	 * @return
	 *//*
	public static String getFileUploadInitJs(SysFormColumnCache column, SysFileupload fileupload, boolean isDisable, boolean isAslable) {
		// TODO 自动生成方法存根
		boolean autoUpload = "1".equals(fileupload.getFileuploadAutoUpload())?true:false;
		String uploadJs  = "";
		String disabledjs = "";
		if(isDisable||isAslable) {
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
	}*/
	
	/**
	 * fileupload生成初始化数据js片段
	 * @param fileupladNameJsStr
	 * @param _value
	 * @return
	 */
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

	/**
	 * 如果附件必须上传，需要在提交的时候校验附件是不是为空
	 * @param fileupladNameJsStr
	 * @param formColumnlable
	 * @return
	 */
	public static String getFileupladCheckJs(String fileupladNameJsStr, String formColumnlable) {
		// TODO 自动生成方法存根
		return null;
	}

	public static String getFileupladCheckJs(String fileupladNameJsStr, String formColumnlable, boolean isDisable, boolean isAslable) {
		// TODO 自动生成方法存根
		if(isDisable||isDisable){
			return "";
		}
		String checkJs = "";
		checkJs+=SysCardFormBeansUtil.getNbsp(2)+"var content_"+fileupladNameJsStr+" = "+fileupladNameJsStr+".getValue()"+SysCardFormBeansUtil.NEW_LINE;
		checkJs+=SysCardFormBeansUtil.getNbsp(2)+"if(content_"+fileupladNameJsStr+"==null||content_"+fileupladNameJsStr+"==''){"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		checkJs+=SysCardFormBeansUtil.getNbsp(3)+"nui.alert('"+formColumnlable+"不能为空')"+SysCardFormBeansUtil.NEW_LINE;
		checkJs+=SysCardFormBeansUtil.getNbsp(3)+"return"+SysCardFormBeansUtil.NEW_LINE;
		checkJs+=SysCardFormBeansUtil.getNbsp(2)+"}"+SysCardFormBeansUtil.NEW_LINE_ONLY;
		return checkJs;
		
	}

	/**
	 * 附件保存时把附件上传的id设置到hidden
	 * @param fileupladNameJsStr
	 * @param jsId
	 * @return
	 */
	public static String getFileupladSaveJs(String fileupladNameJsStr, String jsId) {
		// TODO 自动生成方法存根
		String js  ="";
		js+=SysCardFormBeansUtil.getNbsp(2)+"nui.get('"+jsId+"').setValue("+fileupladNameJsStr+".getValue())"+NEW_LINE;
		return js;
		
	}

	/**
	 *附件数据回填至附件上传下载控件
	 * @param fileupladNameJsStr
	 * @param jsId
	 * @return
	 */
	public static String setFileuploadValueFormHidenJs(String fileupladNameJsStr, String jsId) {
		// TODO 自动生成方法存根
//		 TODO 自动生成方法存根
		String js  ="";
		js+=getNbsp(6)+fileupladNameJsStr+".setValue(nui.get('"+jsId+"').getValue())"+NEW_LINE;
		return js;
	}

	
	/**
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
	}*/

	public static String getFileuploadStartUploadJs(String fileuploadName) {
		// TODO 自动生成方法存根
		String temp = "";
		temp+= getNbsp(1)+JAVASCRIPT_FUNCTION+fileuploadName+SWF_FILEIPLOAD_STARTUPLOAD_FUN_NAME+"() {"+NEW_LINE_ONLY;
		temp+=getNbsp(2)+fileuploadName+".startUpload(function () {},function () {nui.alert('上传失败');})"+NEW_LINE;
		temp+=getNbsp(1)+"}";
		return temp;
	}


	
	/**
	 * 生成grid字段开始代码
	 * @param c
	 * @return
	 */
	public static String getGridColumnStart(SysFormColumnCache c) {
		// TODO 自动生成方法存根
		String temp = " <div field=\""+c.getJsId("name",c.getPojo().getFormColumnFormDefId().toString())+"\" width=\"120\">"+c.getFormColumnLable()+"</div>";
		return temp;
		
	}
	
	/**
	 * 
	 * @param map
	 * @param request
	 * @param isSetJsObj 是否组装到js变量里
	 * @return
	 */
	public static StringBuffer getFormJsParam(Map<String, List<SysFormGeneralParamCache>>  map,SysRequestParam request,boolean isSetJsObj){
		//
		StringBuffer sb = new StringBuffer("");
		String endtype = FormParamConstants.JS_VAR;
		List<SysFormGeneralParamCache>  l = map.get(endtype);
		sb.append(SysCardFormColumnUtil.getGeneralJsParamStr(l, request,isSetJsObj));
		return sb;
	}

	/**
	 * 获取combobox中涉及到控件初始化类型为sql并其中有其它参数  生成这段js
	 * @param param
	 * @param jsId
	 */
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
		if("2".equals(formType)||"10".equals(formType)){
			temp+=SysCardFormBeansUtil.getNbsp(0)+"var c_param_"+ccolumnname+"=e.row."+ccolumnname+";"+NEW_LINE;
			temp+=SysCardFormBeansUtil.getNbsp(2)+"if(!c_param_"+ccolumnname+"){"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(3)+"e.row."+columnname+"=null;"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(3)+"return ;"+NEW_LINE_ONLY;
			temp+=SysCardFormBeansUtil.getNbsp(2)+"}"+NEW_LINE_ONLY;
		}
		return temp;
	}
	
	/**
	 * 
	 * @param gridFilterHeightGrade 是否高级查询
	 * @return
	 */
	public static String getSearchButtons(String gridFilterHeightGrade,String formcode,String formId) {
		// TODO 自动生成方法存根
		String str =  "";
		str += "                <td style=\"margin-left:10px;float:left\" align=\"left\" >";
		str+="<div style=\"float:right;display:inline-block;position:relative;padding-bottom:5px\"><input class=\"btn btn-primary\" style=\"width:70px;padding-left:6px;padding-right:25px;color:#fff\" value=\"查询\" onclick=\"grid_"+formcode+"_fun11_"+formId+"()\"><i class=\"glyphicon glyphicon-search\" style=\"position: absolute;right: 12px;top: 2px;cursor: pointer;\"></i></input></div>";
		if("true".equals(gridFilterHeightGrade)){
			str+="<input class=\"nui-button\" text=\"高级查询\"  onclick=\"grid_"+formcode+"_HeighQuery_"+formId+"()\"/>";
		}
		str+=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
		return str;
	}

	//Card jsp头
	public static final String getBuildCardForm1(String formId,String isApp){
		String str = "";
		if (isApp!=null&&isApp.equals("APP")) {
			str = "<%@ page language='java' import='java.util.*' import='com.myehr.common.util.LangUtil' pageEncoding='UTF-8'%>\n"
					+"<%@ include file='/commonApp/commonApp.jsp' %>\n"
					+"<html>\n"
					+"<head>\n"
					+"<meta charset='utf-8'>\n"
					+"<title>Hello MUI</title>\n"
					+"<meta name='viewport' content='width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no'>\n"
					+"<meta name='apple-mobile-web-app-capable' content='yes'>\n"
					+"<meta name='apple-mobile-web-app-status-bar-style' content='black'>\n"
					+"<style>\n"
					+"form h5 {\n"
					+"height: 25px;line-height: 25px;padding: 2px 0 0 12px;\n"
					+"}\n"
					+"form{clear: both;}\n"
					+"</style>\n"
					+"</head>\n"
					
					+"<body style=\"text-align:center\">\n"
					+"<form id=\"form_"+formId+"\" name=\"form_"+formId+"\" >\n"
					+"<div class=\"container-fluid\" >\n"
					+SysCardFormBeansUtil.getNbsp(1)+"<div class='my_card' style=\"margin-top:5px;padding-bottom:50px;\">\n";	
		} else {
			str = "<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n"
					+"<%@ include file=\"/common/cardcommontest.jsp\" %>\n"
//					+"<%@ include file=\"/common/test3.jsp\" %>\n"
					+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"
					+"<html>\n"
					+"<body style=\"text-align:center\">\n"
					+"<div class=\"container-fluid\" style=\"overflow-y:auto;height:100%;\">\n"
					+"<div style=\"text-align:center;width:100%;height:50px\"><span id=\"formTitle\" style=\"font-size:36px\"></span></div>"
					+"<form id=\"form_"+formId+"\" name=\"form_"+formId+"\" style=\"margin-bottom:60px\" >\n"
					+SysCardFormBeansUtil.getNbsp(1)+"<div class=\"my_card\" style=\"margin-top:5px;\">\n";		
		}
		return str;
	}
	
	//Mst jsp头
	public static final String getBuildCardAndGridForm1(String height,String formId){
		double ht = Long.valueOf(height.split("%")[0]);
		String str = "<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n"
					+"<%@ include file=\"/common/common.jsp\" %>\n"
					+"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n"
					+"<html>\n"
					+"<body style=\"text-align:center\">\n"
					+"<form id=\"form_"+formId+"\" name=\"form_"+formId+"\" >\n"
					+"<div class=\"container-fluid\" style=\"height:"+ht+"%;overflow:auto;\">\n"
					+SysCardFormBeansUtil.getNbsp(1)+"<div style=\"margin-top:5px;\">\n";
		return str;
	}	
		
	//div尾
	public static final String getBuildCardForm2 ="<div id=\"activity_pane\" style=\"position:absolute;left:500px;top:70px;\"></div>\n</div>\n</form>\n</div>\n";
		
		
		public static String getBuildCardForm6(String formId,String isApp) {
			String str = "";
			str+="<div class=\"container-fluid\">\n"+
			"	<div style=\"margin-top:20px;\">\n"+
			"		<div class=\"wrapper wrapper-content animated fadeInRight ibox-content2\" style=\"overflow-y:auto\">\n"+
			"			<div class=\"row dark-timeline\" id=\"approveList\">\n"+
			"			</div>\n"+
			"		</div>\n"+
			"	</div>\n"+
			"</div>\n";
			
			return str;
		}
		
		public static String getActivitiButton(String formId,String isApp,ActNodePropertiesExpand actNodePropertiesExpand) {
			String str = "";
			if(actNodePropertiesExpand!=null){
				if (actNodePropertiesExpand.getShowPassButton().equals("true")) {
					str+="<div style=\"margin-right:10px;display:inline-block\">\n"+
							"	<input type=\"button\" id=\"pass_formpay_count_card\"  class=\"btn btn-primary\" value=\"通过\" onclick=\"submit2(this.value)\"/>\n"+
							"</div>\n";
				}
				if (actNodePropertiesExpand.getShowRejectButton().equals("true")) {
					str+="<div style=\"margin-right:10px;display:inline-block\">\n"+
							"	<input type=\"button\" id=\"reject_formpay_count_card\"  class=\"btn btn-primary\" value=\"驳回\" onclick=\"submit2(this.value)\"/>\n"+
							"</div>\n";
				}
				if (actNodePropertiesExpand.getShowSuspendButton().equals("true")) {
					str+="<div style=\"margin-right:10px;display:inline-block\">\n"+
							"	<input type=\"button\" id=\"suspend_formpay_count_card\"  class=\"btn btn-primary\" value=\"挂起\" onclick=\"submit2(this.value)\"/>\n"+
							"</div>\n";
				}
				if (actNodePropertiesExpand.getShowStopButton().equals("true")) {
					str+="<div style=\"margin-right:10px;display:inline-block\">\n"+
							"	<input type=\"button\" id=\"stop_formpay_count_card\"  class=\"btn btn-primary\" value=\"终止\" onclick=\"submit2(this.value)\"/>\n"+
							"</div>\n";
				}	
			}
			return str;
		}
		
		
		public static String getBuildCardForm7(String formId,String isApp) {
			String str = "";
			
			str+="function animationHover(element, animation) {\n"+
			"    element = $(element);\n"+
			"    element.hover(\n"+
			"        function () {\n"+
			"            element.addClass('animated ' + animation);\n"+
			"        },\n"+
			"        function () {\n"+
			"            //动画完成之前移除class\n"+
			"            window.setTimeout(function () {\n"+
			"                element.removeClass('animated ' + animation);\n"+
			"            }, 2000);\n"+
			"        });\n"+
			"}\n"+
			"\n"+
			"function approveList1(){\n"+
			"	var procInsId = '${param.procInsId}';\n"+
			"	$.ajax({\n"+
			"		url:'/myehr/act/task/queryApproveList.action?procInsId='+procInsId,\n"+
			"		type:'post',\n"+
			"		contentType: 'application/json;charset=utf-8',\n"+
			"        cache: false,\n"+
			"		success: function (text) {\n"+
			"			showDate(text)\n"+
			"		}\n"+
			"	});\n"+
			"}\n"+
			"\n"+
			"function showDate(arr) {\n"+
			"    for (var i = arr.length - 1; i >= 0; i--) {\n"+
			"	     var message = arr[i].MESSAGE;\n"+
			"	     var messages = new Array();\n"+
			"	     messages = message.split(\"|\");\n"+
			"	     if(messages.length<2){\n"+
			"	         messages[1]=message;\n"+
			"	     }\n"+
			"	     var iconClass;\n"+
			"	     if(messages[0]==\"通过\"){\n"+
			"	         iconClass='vertical-timeline-icon';\n"+
			"	     }else{\n"+
			"	         iconClass='vertical-timeline-icon1';\n"+
			"	     }\n"+
			"		 var cellObj = $('<div class=\"vertical-timeline-block\">'+\n"+
			"						'    <div class=\"'+iconClass+'\"></div>'+\n"+
			"						'    <div class=\"vertical-timeline-content clearfix\">'+\n"+
			"						'        <div class=\"pic fl\" style=\"float:left\">'+\n"+
			"						'            <img src=\"http://p.3761.com/pic/43701399945993.png\" alt=\"\">'+\n"+
			"						'            <div id=\"shenpiren\" class=\"shenpirens\">'+arr[i].USER_NAME+'</div>'+\n"+
			"						'        </div>'+\n"+
			"						'        <div class=\"content fl\">'+\n"+
			"						'            <div class=\"clearfix\"></div>'+\n"+
			"						'		     <div class=\"shenpizhuangtai\">'+messages[1]+'</div>'+\n"+
			"						'	     </div>'+\n"+
			"						'	     <div class=\"clearfix\"></div>'+\n"+
			"						'    </div>'+\n"+
			"						'    <div id=\"shenpijieguo\" class=\"shenpijieguo\">'+\n"+
			"						'        <div id=\"shenpishijian\" style=\"font-weight:bold;float:left\" class=\"shenpishijian\">'+arr[i].ENDTIME+'</div>'+\n"+
			"						'        <div id=\"shenpijiedian\" style=\"font-weight:bold;float:left\" class=\"shenpijiedian\">'+arr[i].ACTNAME+'</div>'+\n"+
			"						'        <div id=\"shenpiyijian\" style=\"font-weight:bold;float:left\" class=\"shenpiyijian\">'+messages[0]+'</div>'+\n"+
			"						'    </div>'+\n"+
			"						'</div>'\n"+
			"		);\n"+
			"		$('#approveList').append(cellObj);\n"+
			"	}\n"+
			"}\n"+
			"function approveList(){\n"+
			"	var pkId = '${param.pkId}';\n"+
			"	var formId = '${param.formId}';\n"+
			"	$.ajax({\n"+
			"		url:'/myehr/form/quertFreeCommitByPkId.action?pkId='+pkId+'&formId='+formId,\n"+
			"		type:'post',\n"+
			"		contentType: 'application/json;charset=utf-8',\n"+
			"       cache: false,\n"+
			"		success: function (text) {\n"+
			"			showFreeData(text)\n"+
			"		}\n"+
			"	});\n"+
			"}\n"+
			"\n"+
			"function showFreeData(arr) {\n"+
			"    for (var i = arr.length - 1; i >= 0; i--) {\n"+
			"	     var iconClass;\n"+
			"	     if(arr[i].freeProcessApprove==\"pass\" || arr[i].freeProcessApprove==\"申请\"){\n"+
			"	         iconClass='vertical-timeline-icon';\n"+
			"	     }else{\n"+
			"	         iconClass='vertical-timeline-icon1';\n"+
			"	     }\n"+
			"	     if(arr[i].freeNodeEndTime!=null){\n"+
			"	         date = new Date(arr[i].freeNodeEndTime).Format(\"yyyy-MM-dd hh:mm:ss\");\n"+
			"	     }\n"+


			"		 var cellObj = $('<div class=\"vertical-timeline-block\">'+\n"+
			"						'    <div class=\"'+iconClass+'\"></div>'+\n"+
			"						'    <div class=\"vertical-timeline-content clearfix\">'+\n"+
			"						'        <div class=\"pic fl\" style=\"float:left\">'+\n"+
			"						'            <img src=\"http://p.3761.com/pic/43701399945993.png\" alt=\"\">'+\n"+
			"						'            <div id=\"shenpiren\" class=\"shenpirens\">'+arr[i].freeProcessApproveUser+'</div>'+\n"+
			"						'        </div>'+\n"+
			"						'        <div class=\"content fl\">'+\n"+
			"						'            <div class=\"clearfix\"></div>'+\n"+
			"						'		     <div class=\"shenpizhuangtai\">'+arr[i].freeProcessApprove+'</div>'+\n"+
			"						'	     </div>'+\n"+
			"						'	     <div class=\"clearfix\"></div>'+\n"+
			"						'    </div>'+\n"+
			"						'    <div id=\"shenpijieguo\" class=\"shenpijieguo\">'+\n"+
			"						'        <div id=\"shenpishijian\" style=\"font-weight:bold;float:left\" class=\"shenpishijian\">'+date+'</div>'+\n"+
			"						'        <div id=\"shenpijiedian\" style=\"font-weight:bold;float:left\" class=\"shenpijiedian\">'+arr[i].freeNowUser+'</div>'+\n"+
			"						'        <div id=\"shenpiyijian\" style=\"font-weight:bold;float:left\" class=\"shenpiyijian\">'+arr[i].freeProcessCommit+'</div>'+\n"+
			"						'    </div>'+\n"+
			"						'</div>'\n"+
			"		);\n"+
			"		$('#approveList').append(cellObj);\n"+
			"	}\n"+
			"}\n"+
			"\n"+
			"\n"+
			"function submit4(buttonId,buttonType,approveRemark,rejectType){\n"+
			"    var flowAction = '${param.flowAction}'\n"+
			"    if(flowAction=='start'){\n"+
			"	     var paramsMap = {};\n"+
			"	     var _param = {};\n"+
			"	     _param.formId="+formId+";\n"+
			"	     _param.buttonId=buttonId;\n"+
			"	     _param = getdata(_param.buttonId,_param.formId);\n"+
			"	     _param.paramsMap = paramsMap;\n"+
			"	     _param.actFlowParams= {key:'${param.key}'};\n"+
			"	     $.ajax({\n"+
			"		     url:'/myehr/act/task/start.action',\n"+
			"		     type:'post',\n"+
			"		     data: JSON.stringify(_param),\n"+
			"		     cache: false,\n"+
			"		     contentType: 'application/json;charset=utf-8',\n"+
			"		     success: function (text) {\n"+
			"			     if(text[0]==0){\n"+
			"				     alert(\"保存失败！\");\n"+
			"			     }else if(text[0]=='error'){\n"+
			"				     alert(\"操作异常\");\n"+
			"			     }else {\n"+
			"				     alert(\"操作成功\");\n"+
			"				     closex_"+formId+"();\n"+
			"			     }\n"+
			"		     }\n"+
			"	     });\n"+
			"    }else{\n"+
			"	     var paramsMap = {};\n"+
			"	     var _param = {};\n"+
			"	     _param.formId="+formId+";\n"+
			"	     _param.buttonId=buttonId;\n"+
			"	     _param = getdata(_param.buttonId,_param.formId);\n"+
			"	     _param.paramsMap = paramsMap;\n"+
			"	     _param.actFlowParams= {taskId:'${param.taskId}',procInsId:'${param.procInsId}',buttonType:buttonType,approveRemark:approveRemark,rejectType:rejectType};\n"+
			"	     $.ajax({\n"+
			"		     url:'/myehr/act/task/complete.action',\n"+
			"		     type:'post',\n"+
			"		     data: JSON.stringify(_param),\n"+
			"		     cache: false,\n"+
			"		     contentType: 'application/json;charset=utf-8',\n"+
			"		     success: function (text) {\n"+
			"			     if(text[0]==0){\n"+
			"				     alert(\"保存失败！\");\n"+
			"			     }else if(text[0]=='error'){\n"+
			"				     alert(\"操作异常\");\n"+
			"			     }else {\n"+
			"				     alert(\"操作成功\");\n"+
			"				     closex_"+formId+"();\n"+
			"			     }\n"+
			"		     }\n"+
			"	     });\n"+
			"    }\n"+
			"}\n"+

			"function approveChange(){\n"+
			"	var objS = document.getElementById(\"EMP_EMPLOYEE.APPROVE_TYPE\");\n"+
			"    var value = objS.options[objS.selectedIndex].value;\n"+
			"	if(value=='approveReject'){\n"+
			"		document.getElementById(\"EMP_EMPLOYEE.REJECT_TYPE\").disabled=false;\n"+
			"	}else{\n"+
			"		document.getElementById(\"EMP_EMPLOYEE.REJECT_TYPE\").disabled=true;\n"+
			"		document.getElementById(\"EMP_EMPLOYEE.REJECT_TYPE\").value=\"\";\n"+
			"	}	\n"+
			"}\n"+

			"function rejectChange(){\n"+
			"	 var objS = document.getElementById(\"EMP_EMPLOYEE.REJECT_TYPE\");\n"+
			"    var value = objS.options[objS.selectedIndex].value;\n"+
			"	 if(value=='free'){\n"+
			"		var paramsMap = {};\n"+
			"		var _param = {};\n"+
			"		var approveType = document.getElementById(\"EMP_EMPLOYEE.APPROVE_TYPE\").value;\n"+
			"		var rejectType = document.getElementById(\"EMP_EMPLOYEE.REJECT_TYPE\").value;\n"+
			"		var bz = document.getElementById(\"bz\").value;\n"+
			"		_param.formId=${param.formId};\n"+
			"		_param.buttonId='';\n"+
					//_param = window.parent.getdata_${param.formId}(_param.buttonId,_param.formId);
			"		_param.paramsMap = paramsMap;\n"+
			"		_param.actFlowParams= {taskId:'${param.taskId}',procInsId:'${param.procInsId}',approveType:approveType,rejectType:rejectType,bz:bz};\n"+
			"		$.ajax({\n"+
			"			url:'/myehr/act/task/freeTask.action',\n"+
			"			type:'post',\n"+
			"			data: JSON.stringify(_param),\n"+
			"			cache: false,\n"+
			"			contentType: 'application/json;charset=utf-8',\n"+
			"			success: function (text) {\n"+
			"				var html = '';\n"+
			"				var opationhtml = '';\n"+
			"				for (var i=0;i<text.length;i++){\n"+
			"					opationhtml+=\"<option value =\\\"\"+text[i].actId+\"\\\">\"+text[i].actName+\"</option>\";\n"+
			"				}\n"+
			"				html+=\"<select id=\\\"EMP_EMPLOYEE.REJECT_TASK\\\" disabled=\\\"false\\\" title=\\\"驳回节点\\\" styleType=\\\"select\\\" name=\\\"REJECT_TASK\\\"  class=\\\"form-control\\\" style=\\\"width:200px;height:25px;\\\">\"+opationhtml+\"</select>\";\n"+
			"				$(\"#solutionList\").html(html);\n"+
			"				document.getElementById(\"EMP_EMPLOYEE.REJECT_TASK\").disabled=false;\n"+
			"			}\n"+
			"		});\n"+
			"	}else{\n"+
			"		document.getElementById(\"EMP_EMPLOYEE.REJECT_TASK\").disabled=true;\n"+
			"		document.getElementById(\"EMP_EMPLOYEE.REJECT_TASK\").value=\"\";\n"+
			"	}\n"+
			"}\n";
			
			return str;
		}
		
		
		public static String getBuildCardForm3(SysFormconfigCache form,String isApp) {
			// TODO 自动生成方法存根
			String str = "";
			String formId = form.getPojoform().getFormDefId().toString();
			if (isApp!=null&isApp.equals("APP")) {
				str =  "<script>\n"+
			
						"var datas = mui('.data');\n"+
						"datas.each(function(i, data) {\n"+
						"	data.addEventListener('tap', function() {\n"+
						"		var optionsJson = this.getAttribute('data-options') || '{}';\n"+
					    "		var options = JSON.parse(optionsJson);\n"+
					    "		var id = this.getAttribute('id');\n"+
					    "		var _this = this;\n"+
					    "		var picker = new mui.DtPicker(options);\n"+
						"		picker.show(function(rs) {\n"+
						"			_this.value = rs.text;\n"+
						"			picker.dispose();\n"+
						"		});\n"+
						"	}, false);"+
						"});\n";
			} else {
				str =  "<script>\n";
			}
			return str;
		}	
		
		public static String getBuildCardForm3_1(SysFormconfigCache form,String isApp) {
			String str = "";
			String formId = form.getPojoform().getFormDefId().toString();
			ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
			String paramType = FormParamConstants.FORMCONFIG;
			List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,form.getFormDefId());
			String containerParam="{";
			for (int i = 0; i < params.size(); i++) {
				if (params.get(i).getParamFromType().equals("containerParam")) {
					containerParam+=params.get(i).getParamName()+":'${sessionScope."+params.get(i).getParamFromValue()+"_paramSession}',";
				}
			}
			if (containerParam.length()>1) {
				containerParam = containerParam.substring(0, containerParam.length()-1)+"}";
			}else {
				containerParam = containerParam+"}";
			}
//			if (isApp!=null&isApp.equals("APP")) {
//				
//			}else {
				str =   "var heightGadedata_"+formId+" =[];\n"+
						"var containerParam_"+formId+" ={};\n"+
						"containerParam_"+formId+" ="+containerParam+";\n"+
						"function changeHeightGadedata_"+formId+"(data){\n"+ 
						"	heightGadedata_"+formId+" = data;\n"+ 
						"}\n";
//			}
			return str;
		}
		
		public static String getBuildCardForm3_2(SysFormconfigCache form,String isApp) {
			return "$(function () {  \n";
		}
		
		public static String getBuildCardForm5(String formId,String isApp) {			
			String str = "";
			if (isApp!=null&&isApp.equals("APP")) {
				str = 	"});\n"/*+
						SysCardFormBeansUtil.getNbsp(1)+"function formatDatebox(value,key) {\n"+
						SysCardFormBeansUtil.getNbsp(2)+"  if(value!=null){\n"+
						SysCardFormBeansUtil.getNbsp(2)+"	 var type = document.getElementById(key).getAttribute(\"dateType\");\n"+
						SysCardFormBeansUtil.getNbsp(2)+"	 type = type.substr(type.length-1,1);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var year=value.substr(0,4);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var index1=value.indexOf(\"-\");\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var index2=value.lastIndexOf(\"-\");\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var d1=parseInt(index2)-(parseInt(index1)+1);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var month=value.substr((parseInt(index1)+1),d1);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var kg=value.indexOf(\" \");\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    d2=parseInt(kg)-parseInt(index2);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var day=value.substr(parseInt(index2)+1,d2);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var mh=value.indexOf(\":\");\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    d3=parseInt(mh)-(parseInt(kg)+1);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var hh=value.substr(parseInt(kg)+1,d3);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var mh2=value.lastIndexOf(\":\");\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    d4=parseInt(mh2)-(parseInt(mh)+1);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var mm=value.substr(parseInt(mh)+1,d4);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var mh2=value.lastIndexOf(\":\");\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    var ss=value.substr(parseInt(mh2)+1);\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    if(type == 1){\n"+
					    SysCardFormBeansUtil.getNbsp(3)+"        return year+\"-\"+month+\"-\"+day;\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    }else if(type == 2){\n"+
					    SysCardFormBeansUtil.getNbsp(3)+"        return year+\"-\"+month+\"-\"+day+\" \"+hh+\":\"+mm;\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    }else if(type == 3){\n"+
					    SysCardFormBeansUtil.getNbsp(3)+"        return hh+\":\"+mm;\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    }else if(type == 4){\n"+
					    SysCardFormBeansUtil.getNbsp(3)+"        return year+\"/\"+month+\"/\"+day;\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    }else if(type == 5){\n"+
					    SysCardFormBeansUtil.getNbsp(3)+"        return year+month;\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"    }\n"+
					    SysCardFormBeansUtil.getNbsp(2)+"  }\n"+
					    SysCardFormBeansUtil.getNbsp(1)+"}\n"*/;
			} else {
					str =	"if('isView'=='${param.isView}'){\n" +	
							"	cardIsViewFunction();\n" +
							//"	$(\".BTNGROUP_"+formId+"\").css(\"display\",\"none\");\n" +
							"}\n" +
							"cardDateWidInitFunction(); \n" +
						"});\n"+
					    
					"function getdata(buttonId,formId){\n"+
					SysCardFormBeansUtil.getNbsp(1)+"return cardGetdata(buttonId,formId);\n"+
					"}\n";
			}
			return str;
		}
	//jsp尾
		
		public static String getDateFomat(){
			String tempString = SysCardFormBeansUtil.getNbsp(1)+"function formatDatebox(value,key) {\n"+
					SysCardFormBeansUtil.getNbsp(2)+"  if(value!=null){\n"+
					SysCardFormBeansUtil.getNbsp(2)+"	 var type = document.getElementById(key).getAttribute(\"dateType\");\n"+
					SysCardFormBeansUtil.getNbsp(2)+"	 type = type.substr(type.length-1,1);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var year=value.substr(0,4);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var index1=value.indexOf(\"-\");\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var index2=value.lastIndexOf(\"-\");\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var d1=parseInt(index2)-(parseInt(index1)+1);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var month=value.substr((parseInt(index1)+1),d1);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var kg=value.indexOf(\" \");\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    d2=parseInt(kg)-parseInt(index2);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var day=value.substr(parseInt(index2)+1,d2);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var mh=value.indexOf(\":\");\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    d3=parseInt(mh)-(parseInt(kg)+1);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var hh=value.substr(parseInt(kg)+1,d3);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var mh2=value.lastIndexOf(\":\");\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    d4=parseInt(mh2)-(parseInt(mh)+1);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var mm=value.substr(parseInt(mh)+1,d4);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var mh2=value.lastIndexOf(\":\");\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    var ss=value.substr(parseInt(mh2)+1);\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    if(type == 1){\n"+
				    SysCardFormBeansUtil.getNbsp(3)+"        return year+\"-\"+month+\"-\"+day;\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    }else if(type == 2){\n"+
				    SysCardFormBeansUtil.getNbsp(3)+"        return year+\"-\"+month+\"-\"+day+\" \"+hh+\":\"+mm;\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    }else if(type == 3){\n"+
				    SysCardFormBeansUtil.getNbsp(3)+"        return hh+\":\"+mm;\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    }else if(type == 4){\n"+
				    SysCardFormBeansUtil.getNbsp(3)+"        return year+\"/\"+month+\"/\"+day;\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    }else if(type == 5){\n"+
				    SysCardFormBeansUtil.getNbsp(3)+"        return year+month;\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"    }\n"+
				    SysCardFormBeansUtil.getNbsp(2)+"  }\n"+
				    SysCardFormBeansUtil.getNbsp(1)+"}\n";
			return tempString;
		}
		
		public static String getBuildCardForm4(String formId,String pkFieldName,String TableName,String formDefCode,String formDefName) {
			// TODO 自动生成方法存根
			String getBuildCardForm4 =SysCardFormBeansUtil.getNbsp(1)+"//初始化表单权限字段\n"
			+SysCardFormBeansUtil.getNbsp(1)+"function initFieldRuleColumn(formId){"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"    var url = '/myehr/FieldList/selectColumnWithFieldRule.action?formId='+formId;"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"    $.ajax({"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"        url:url,"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"        type:'post',"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"        cache: false,"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"        async: false,"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"        contentType:'application/json',"+"\n" 
			+SysCardFormBeansUtil.getNbsp(1)+"        success:function(datas){"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"            for(var i=0;i<datas.length;i++){"+"\n"
			+SysCardFormBeansUtil.getNbsp(2)+"                var obj = $(\"[id='\"+datas[i].fieldRuleJspId+\"']\")[0];"+"\n"
			+SysCardFormBeansUtil.getNbsp(2)+"                obj.value=getRealRule(datas[i].fieldRuleValue);"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"            }"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"        }"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"    });"+"\n"
			+SysCardFormBeansUtil.getNbsp(1)+"}"+"\n";
			
			getBuildCardForm4 +=SysCardFormBeansUtil.getNbsp(1)+"//初始化表单权限字段\n"
					+SysCardFormBeansUtil.getNbsp(1)+"function initRoleColumn(formId){"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"    var url = '/myehr/form/queryCardFormColumnsWithUserId.action?formId='+formId;"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"    $.ajax({"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"        url:url,"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"        type:'post',"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"        cache: false,"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"        async: false,"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"        contentType:'application/json',"+"\n" 
					+SysCardFormBeansUtil.getNbsp(1)+"        success:function(datas){"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"            for(var i=0;i<datas.length;i++){"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"                if(datas[i].formColumnShowType=='hide'){"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"                    continue;"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"                }"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"                if(datas[i].formColumnUsName==0 || datas[i].formColumnUsName==3 || datas[i].formColumnUsName==4){"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                if(datas[i].formColumnGuiType==1){"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var entityTablename = datas[i].formEntityTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var fieldTablename = datas[i].formFieldTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+"+formId+";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var obj = $(\"[id='\"+columnName+\"']\")[0].parentNode.parentNode;"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    obj.style.display=\"none\";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                }else if(datas[i].formColumnGuiType==2){"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var entityTablename = datas[i].formEntityTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var fieldTablename = datas[i].formFieldTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+"+formId+";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var obj = $(\"[id='\"+columnName+\"']\")[0].parentNode.parentNode;"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    obj.style.display=\"none\";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                }else if(datas[i].formColumnGuiType==6){"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var entityTablename = datas[i].formEntityTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var fieldTablename = datas[i].formFieldTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+"+formId+";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var obj = $(\"[id='\"+columnName+\"']\")[0].parentNode.parentNode.parentNode;"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    obj.style.display=\"none\";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                }"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"                }"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"                if(datas[i].formColumnUsName==2){"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                if(datas[i].formColumnGuiType==1){"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var entityTablename = datas[i].formEntityTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var fieldTablename = datas[i].formFieldTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+"+formId+";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var obj = $(\"[id='\"+columnName+\"']\")[0];"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    obj.readonly=true;"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                }else if(datas[i].formColumnGuiType==2){"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var entityTablename = datas[i].formEntityTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var fieldTablename = datas[i].formFieldTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+"+formId+";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var obj = $(\"[id='\"+columnName+\"']\")[0];"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    obj.disabled=true;"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                }else if(datas[i].formColumnGuiType==6){"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var entityTablename = datas[i].formEntityTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var fieldTablename = datas[i].formFieldTablename.toUpperCase();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var columnName=entityTablename+'.'+entityTablename.replace(/_/g,'')+'_'+fieldTablename+'_'+"+formId+";"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    var obj = $(\"[id='\"+columnName+\"']\")[0];"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    $(\"[id='\"+columnName+\"']\").next().remove();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                    $(\"[id='\"+columnName+\"']\").next().remove();"+"\n"
					+SysCardFormBeansUtil.getNbsp(2)+"                }"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"                }"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"            }"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"        }"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"    });"+"\n"
					+SysCardFormBeansUtil.getNbsp(1)+"}"+"\n";
			
			getBuildCardForm4 += "//初始化表单按钮字段\n"
					+"function initRoleButtons(){"+"\n"
					+"    var url = '/myehr/form/queryCardFormButtonsWithUserId.action?formId="+formId+"';"+"\n"
					+"    $.ajax({"+"\n"
					+"        url:url,"+"\n"
					+"        type:'post',"+"\n"
					+"        cache: false,"+"\n"
					+"        async: false,"+"\n"
					+"        contentType:'application/json',"+"\n" 
					+"        success:function(datas){"+"\n"
					+"            for(var i=0;i<datas.length;i++){"+"\n"
					+"                if(datas[i].powerType==4){"+"\n"
					+"                    var obj = $(\"#\"+datas[i].formButtonCode+\""+formDefCode+"\");"+"\n"
					+"                    obj.parent().remove();"+"\n"
//					+"                    obj[0].parentNode.style.display=\"none\";"+"\n"
					+"                }else if(datas[i].powerType==3){"+"\n"
					+"                    var obj = $(\"#\"+datas[i].formButtonCode+\""+formDefCode+"\");"+"\n"
					//+"                    obj[0].parentNode.style.display=\"none\";"+"\n"
					+"                        obj.parent().remove();"+"\n"
					+"                }else if(datas[i].powerType==2){"+"\n"
					+"                    var obj = $(\"#\"+datas[i].formButtonCode+\""+formDefCode+"\");"+"\n"
					+"                    obj[0].disabled=true;"+"\n"
					+"                }else if(datas[i].powerType==0){"+"\n"
					+"                    var obj = $(\"#\"+datas[i].formButtonCode+\""+formDefCode+"\");"+"\n"
					+"                    obj.parent().remove();"+"\n"
//					+"                    obj[0].parentNode.style.display=\"none\";"+"\n"
					+"                }"+"\n"
					+"            }"+"\n"
					+"        }"+"\n"
					+"    });"+"\n"
					+"}"+"\n";
			
			getBuildCardForm4+="function selectSqlDictEntryByValue(id,value,dataField,DictName){\n"+
					"    $.ajax({\n"+
					"        url:'/myehr/dict/selectSqlDictEntryByValue.action?value='+value+'&dataField='+dataField+'&DictName='+DictName,\n"+
					"        type:'post',\n"+
					"        cache: false,\n"+
					"        contentType: 'application/json;charset=utf-8',\n"+
					"    	 async: false,\n"+
					"        success: function (data) { \n"+
					"            document.getElementById(id).value=data[value];\n"+
					"            document.getElementById(id+\"_value\").value=value;\n"+
					"        }\n"+
					"    });\n"+
					"}\n";
			
			String[] aa = formDefName.split("[+]");
			String colString = "";
			String colSum = "";
			if(aa.length>1){
				for (int i = 0; i < aa.length; i++) {
					String b=aa[i].substring(1, aa[i].length()-1);
					String[] bb = b.split("[.]");
					colString+="var "+bb[1]+" = document.getElementById('"+bb[0]+"."+ChangeCode.getUniqueCode(bb[0], bb[1])+"_"+formId+"').value;\n";
					colSum+=bb[1]+"+";
				}
				colSum = "total = "+colSum.substring(0,colSum.length()-1)+";\n";
			}
			
			
			getBuildCardForm4+="function initFormNameWithSelectColumn(){\n"+
					"    var total = '';\n"+
					colString+
					colSum+
					"    var obj = document.getElementById('formTitle').innerText = total;\n"+
					"}\n";
			
			getBuildCardForm4 += SysCardFormBeansUtil.getNbsp(1)+"//唯一验证\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"function uniqueVerifyBlur(obj){ \n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    var id = obj.id;\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    var strs= new Array();\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    strs= id.split(\"\\.\");\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    var tableName= strs[0];\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    strs= strs[1].split(\"_\");\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    var fieldName= strs[0];\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    var value = document.getElementById(id).value;\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    var pkId = document.getElementById(\""+TableName+"."+pkFieldName+"_"+formId+"\").value;\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"    $.ajax({ \n"+
									  SysCardFormBeansUtil.getNbsp(1)+"	       url:'/myehr/form/checkUniqueVerify.action?tableName='+tableName+'&fieldName='+fieldName+'&value='+value+'&pkId='+pkId+'&pkFieldName="+pkFieldName+"',\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"        type:'post',\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"		   cache: false,\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"		   contentType: 'application/json;charset=utf-8',\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"		   success: function (text) {\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"			   if(text[0]=='1'){\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"				   obj.value='';\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"				   obj.style['border-color']='red';\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"				   obj.setAttribute(\"placeholder\",text[1]);\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"			   }\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"			   if(text[0]=='0'){\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"				   obj.style['border-color']='#CCC';\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"			   }\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"		   }\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"	   });\n"+
									  SysCardFormBeansUtil.getNbsp(1)+"}\n"+
									  "</script>\n</body>\n</html>\n";
			return getBuildCardForm4;
		}
		
		
		public static String RichText(String id,long formId,String columnId) {
			// TODO 自动生成方法存根
			String getBuildCardForm4 =	SysCardFormBeansUtil.getNbsp(1)+"\nvar "+id.split("\\.")[0]+"__"+id.split("\\.")[1]+" = UE.getEditor('"+id.split("\\.")[0]+"__"+id.split("\\.")[1]+"');\n" 
										+SysCardFormBeansUtil.getNbsp(1)+id.split("\\.")[0]+"__"+id.split("\\.")[1]+".addListener(\"contentChange\",copyContentTo_"+columnId+");\n"
										+SysCardFormBeansUtil.getNbsp(3)+"setTimeout(\""+id.split("\\.")[0]+"__"+id.split("\\.")[1]+"_xxx()\",\"1500\");\n"
										+SysCardFormBeansUtil.getNbsp(1)+"function "+id.split("\\.")[0]+"__"+id.split("\\.")[1]+"_xxx(){\n"
										+SysCardFormBeansUtil.getNbsp(3)+"$(\"[id='"+id.replace(".", "__")+"']\").find(\".edui-editor-toolbarbox\").eq(0).hide();\n"//
										+SysCardFormBeansUtil.getNbsp(3)+"$(\"[id='"+id.replace(".", "__")+"']\").find(\".edui-editor-bottombar\").eq(0).hide();\n"
										+SysCardFormBeansUtil.getNbsp(3)+"$(\"[id='"+id.replace(".", "__")+"']\").find(\".edui-editor\").eq(0).css(\"border\",\"none\");\n"
										+SysCardFormBeansUtil.getNbsp(3)+"$(\"[id='"+id.replace(".", "__")+"']\").find(\".edui-editor-wordcount\").eq(0).html(\"\");\n"
										+SysCardFormBeansUtil.getNbsp(3)+"r"+columnId+"++;\n"
										+SysCardFormBeansUtil.getNbsp(1)+"}\n"
										
										+SysCardFormBeansUtil.getNbsp(1)+"function copyContentTo_"+columnId+"(){\n"
										+SysCardFormBeansUtil.getNbsp(3)+"setTimeout(\"copyContentTo_"+columnId+"1()\",\"2000\");\n"
										+SysCardFormBeansUtil.getNbsp(1)+"}\n"
										+SysCardFormBeansUtil.getNbsp(1)+"function copyContentTo_"+columnId+"1(){\n"
										+SysCardFormBeansUtil.getNbsp(3)+"$(\"[id='"+id+"']\").val("+id.split("\\.")[0]+"__"+id.split("\\.")[1]+".getContent());\n"
										+SysCardFormBeansUtil.getNbsp(1)+"}\n"
										+SysCardFormBeansUtil.getNbsp(1)+"var r"+columnId+"=0;\n"
										+SysCardFormBeansUtil.getNbsp(1)+"function "+id.replace(".", "__")+"_change(){\n"
										+SysCardFormBeansUtil.getNbsp(3)+"if(r"+columnId+"==0){\n"
										+SysCardFormBeansUtil.getNbsp(4)+"var html= $(\"[id='"+id+"']\").val();\n"
										+SysCardFormBeansUtil.getNbsp(4)+id.replace(".", "__")+".ready(function(){\n"
										+SysCardFormBeansUtil.getNbsp(6)+id.replace(".", "__")+".setContent(html);\n"
										+SysCardFormBeansUtil.getNbsp(4)+"});\n"
										+SysCardFormBeansUtil.getNbsp(4)+"r"+columnId+"++;\n"
										+SysCardFormBeansUtil.getNbsp(3)+"};\n"
										+SysCardFormBeansUtil.getNbsp(1)+"}";
			return getBuildCardForm4;
		}
		

}
