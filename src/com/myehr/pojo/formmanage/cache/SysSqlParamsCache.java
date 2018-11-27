package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.sqlparams.ISysSqlParamsService;

/*
 * sql参数类
 */
public class SysSqlParamsCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysSqlParams pojo;
	
	public SysSqlParams getPojo() {
		return pojo;
	}

	public void setPojo(SysSqlParams pojo) {
		this.pojo = pojo;
	}

	//	控件类型
	private Object gui ;
	
	public Object getGui() {
		return gui;
	}

	public void setGui(Object gui) {
		this.gui = gui;
	}


	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	public String getSqlParamsCode() {
		return pojo.getSqlParamsCode();
	}

	public String getSqlParamsDataType() {
		return pojo.getSqlParamsDataType();
	}

	public String getSqlParamsDesc() { 
		return pojo.getSqlParamsDesc();
	}

	public String getSqlParamsGuiType() {
		return pojo.getSqlParamsGuiType();
	}

	public long getSqlParamsId() {
		return pojo.getSqlParamsId().longValue();
	}

	public String getSqlParamsName() {
		return pojo.getSqlParamsName();
	}
	
	public String getSqlParamsType() {
		return pojo.getSqlParamsType();
	}

	public String getSqlParamsValue() {
		return pojo.getSqlParamsValue();
	}
	
	
	public String getSqlParamsIsRequired() {
		return pojo.getSqlParamsIsRequired();
	}

	
	/**
	 * 获取点击事件函数名
	 * @return
	 */
	public String getOnClickFunName(String jsName){
		String rjsName = jsName.replace(".", "_");
		return rjsName+"_click()";
	}
	
	public String getOnValueChangeFunName(String jsName){
		String rjsName = jsName.replace(".", "_");
		return rjsName+"_valueChange()";
	}
	
	public String getOnValidationFunName(String jsName){
		String rjsName = jsName.replace(".", "_");
		return rjsName+"_validation()";
	}
	
	
	/**
	 * 空构造函数
	 *
	 */
	public SysSqlParamsCache(){};
	
	/**
	 * 通过参数id或者参数名称加载加载当前数据对象
	 *
	 */
	public SysSqlParamsCache(long sqlParamsId,String sqlParamsName){
		
		
		ISysSqlParamsService service = (ISysSqlParamsService)SpringContextUtils.getBeanById("ISysSqlParamsService");
		Map<String,String > param = new HashMap<String,String>();
		List<SysSqlParams>  objs = null;
		if(sqlParamsId!=0){
			param.put("sqlParamsId", sqlParamsId+"");
			objs = service.querySqlParams(null, param);
		}else if(sqlParamsName!=null) {
			param.put("sqlParamsName", sqlParamsName);
			objs = service.querySqlParams(null, param);
		}
		if(objs==null||objs.size()==0){
//			throw new RuntimeException("无法加载sqlParamsId："+sqlParamsId+" sqlParamsName:"+sqlParamsName+"对应的sql参数信息!");
		}else {
			setThisByDataObject(objs.get(0));
			//加载控件
			setgui();
		}
	};
	
	
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysSqlParams obj){
		this.pojo =  obj;
	}
	
	/**
	 * 加载控件
	 * @param columnId
	 */
	private void setgui(){
		if(this.getSqlParamsGuiType()==null){
			this.gui = null;
			return ;
		}
		//查询textbox件类型
		if("1".equals(this.getSqlParamsGuiType())||"8".equals(this.getSqlParamsGuiType())){ //textbox控件
			this.gui = new SysTextBoxCache(this.getSqlParamsId()+"");
			
		}else if("2".equals(this.getSqlParamsGuiType())){ //单选下拉控件
			this.gui = new SysFormComboboxCache(this.getSqlParamsId()+"",null);
			
		/*}else if("3".equals(this.getSqlParamsGuiType())){ //单选框组
			this.gui = new SysRadiobuttonlist(this.sqlParamsId+"");
		}else if("4".equals(this.getSqlParamsGuiType())){ //复选框组
			this.gui = new SysRadiobuttonlist(this.sqlParamsId+"");*/
		}else if("5".equals(this.getSqlParamsGuiType())){
			this.gui = new SysCheckboxCache(this.getSqlParamsId()+"");
		}else if("6".equals(this.getSqlParamsGuiType())){
			this.gui = new SysDatepickerCache(this.getSqlParamsId()+"");
		/*}else if("7".equals(this.sqlParamsGuiType)){
			this.gui = new SysLookup(this.sqlParamsId+"");*/
		}
	}
	
	/**
	 *
	 * @return 返回字符串数组  生成字段html
	 * @throws Exception 
	 */
	@SuppressWarnings("unused")
	public String[] getHtmlsForm(SysRequestParam request ,boolean isHide ,boolean isRequired,String jsName,String lableWidth,String width,String isApp) throws Exception{	
		String[] htmls = new String[SysCardFormBeansUtil.HTML_SILZE];
		//判断布局类型
		
		String str = "";
		
		String entityName = "params";
		String fieldName = this.getSqlParamsCode();
		
		String vtype = null;
		String errorText = null;// 验证信息
		String emptyText = null;
		String dictTypeId = null;
		String url = null;
		String data = null;
		boolean isValueChange =false;
		boolean isOnclick = false;
		boolean isValidation = false;
		
		String guiType = this.getSqlParamsGuiType(); //获取控件类型
		if (isHide == false) {
			str+=SysCardFormBeansUtil.getTdHtml(null, null, lableWidth, null,0);
			str+=SysCardFormBeansUtil.CARD_FORM_lable_START;
//			str+=this.getSqlParamsName()+"：";
			str+= this.getSqlParamsName()+": ";
			str+=SysCardFormBeansUtil.CARD_FORM_lable_END;
			str+=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
			str+=SysCardFormBeansUtil.getTdHtml("left", null, width, null,0);
		}
		width="100%";
		
		if ("1".equals(guiType) || "8".equals(guiType)) { // textbox控件处理
			SysTextBoxCache textbox  = (SysTextBoxCache)this.gui;
			emptyText = textbox.getTextboxEmptytext();
			
			if (isHide == true) {
				/*if(textbox!=null&&textbox.getTextboxid()!=null&&!"0".equals(textbox.getTextboxid())){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getCardFormGuiHtml(htmls, request,  null, null, null, textbox.getTextboxDataFromType(), textbox.getTextboxDataFromValue(), null, null,  textbox.getTextboxInitFun(), 
							null, null,null, this,false,null, jsName);
				}
				//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAsLabel, params);
				str += SysSqlParamReportUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,vtype, errorText, emptyText, isRequired, 
						isValueChange, isOnclick,isValidation,false,entityName,"100%",null,jsName);*/
				htmls[7] = str;
			}else {
				if (textbox != null && textbox.getTextboxid() != null && !"0".equals(textbox.getTextboxid())) { //满足说明用户保存该控件的扩展属性
					/*Object[] ret = SysSqlParamReportUtil.getTextBoxHtml(textbox, jsName, htmls, request, this, false);
					
					vtype = (String)ret[0];
					errorText = (String)ret[8];
					isValueChange = (Boolean) ret[2];
					isOnclick = (Boolean) ret[3];
					isValidation = (Boolean) ret[4];*/
				}
				String classType = "1".equals(guiType)? SysCardFormBeansUtil.CARD_FORM_TEXT_BOX:SysCardFormBeansUtil.CARD_FORM_TEXT_AREA;
				str += SysSqlParamReportUtil.getTextBoxHtml(classType, vtype, errorText, 
						emptyText, isRequired, isValueChange, isOnclick,isValidation,false,entityName,
						"100%",null,jsName);
				str +=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				htmls[0] = str;
			}
		} else if ("2".equals(guiType)) { // comnbox控件处理
			SysFormComboboxCache combobox =  (SysFormComboboxCache)this.gui;
			boolean isExit = false;
			if(combobox!=null&&combobox.getComboboxId()!=0){ //满足说明用户保存该控件的扩展属性
				isExit = true;
			}
			boolean ShowNullItem =isExit==false?false:( "1".equals(combobox.getComboboxShownullitem())); //是否显示空项；
			boolean multiselect =isExit==false?false:( "1".equals(combobox.getComboboxMultiselect())); 
			String textField = isExit==false?null:(combobox.getComboboxTextfield());
			String valueField = isExit==false?null:(combobox.getComboboxValuefield());
			emptyText = isExit==false?null:( combobox.getComboboxEmptytext());
			boolean allowInput = isExit==false?false:( "1".equals(combobox.getComboboxAllowinput()));
			String dataField =isExit==false?null:( combobox.getComboboxDatafield());
			String nullItemText =isExit==false?null:( combobox.getComboboxNullitemtext());
			
			if (isHide == true) {
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getCardFormGuiHtml(htmls, request, null, null, null, combobox.getComboboxDataFromType(), combobox.getComboboxDataFromValue(), null, null,  combobox.getComboboxInitFun(), 
							null, null,null, this,false,null,jsName,isApp);
				}
				//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAsLabel, params);
				str += SysSqlParamReportUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,vtype, errorText, emptyText, isRequired, isValueChange, isOnclick,
							isValidation,false,entityName,null,null,jsName);
				htmls[7] = str;
			} else {
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getComboboxHtml(combobox,  jsName, htmls, request, this,false,this.getSqlParamsId(),isApp);
					vtype =(String)ret[0];
					isValueChange =(Boolean)ret[2];
					isOnclick =(Boolean)ret[3];
					isValidation =(Boolean)ret[4];
					dictTypeId = (String)ret[5];
					url = (String)ret[6];
					data = (String)ret[7];
				}
				String classType = dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_COMBO_BOX:SysCardFormBeansUtil.CARD_FORM_DICT_COMBO_BOX;
				str += SysSqlParamReportUtil.getComboboxHtml(classType,jsName,vtype , emptyText, isRequired, isValueChange, 
						isOnclick,isValidation,false,"100%"
						,ShowNullItem,textField,valueField,allowInput,dictTypeId,nullItemText,url,data,dataField,multiselect);
				str +=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				htmls[0] = str;
			}
		/*}else if("3".equals(guiType)||"4".equals(guiType)) { //单选框组 或者复选框组
			SysRadiobuttonlist radio = (SysRadiobuttonlist)this.gui;
			boolean isExit = false; 
			if(radio!=null&&radio.getRadiolistId()!=0){ //满足说明用户保存该控件的扩展属性
				isExit = true;
			}
			String repeatItems =isExit==false?null:( radio.getRadiolistRepeatitems());
			String repeatdirection =isExit==false?null:(  radio.getRadiolistRepeatdirection());
			String repeatLayout =isExit==false?null:(  radio.getRadiolistRepeatlayout());
			String textField = isExit==false?null:( radio.getRadiolistTextField());
			String valueField =isExit==false?null:( radio.getRadiolistValueField());
			String dataField = isExit==false?null:( radio.getRadiolistDataField());
			
			if(isHide==true){
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getCardFormGuiHtml(htmls, request, null, null, null, radio.getRadiolistDataFromType(), radio.getRadiolistDataFromValue(), null, null,  radio.getRadiolistInitFun(), 
							null, null,null, this,false,null,null);
				}
				//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAsLabel, params);
				str += SysSqlParamReportUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,vtype, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,"isDisable".equals(""),entityName,width,null,jsName);
				htmls[7] = str;
			}else {
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getRadiolistHtml(radio, jsName, htmls, request, this,"isAsLabel".equals(""));
					vtype =(String)ret[0];
					isValueChange =(Boolean)ret[2];
					isOnclick =(Boolean)ret[3];
					isValidation =(Boolean)ret[4];
					dictTypeId = (String)ret[5];
					url = (String)ret[6];
					data = (String)ret[7];
				}
				String classType = null;
				if("3".equals(guiType)){
					classType=dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_RIDIOLIST_BOX:SysCardFormBeansUtil.CARD_FORM_DICT_RIDIOLIST_BOX;
				}else {
					classType=dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_CHECK_BOX_LIST:SysCardFormBeansUtil.CARD_FORM_DICT_CHECK_BOX_LIST;
				}
				str += SysSqlParamReportUtil.getRadiolistHtml(classType,jsName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,"isDisable".equals(""),entityName,width
						,repeatItems,textField,valueField,repeatdirection,dictTypeId,repeatLayout,url,data,dataField);
				str +=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				htmls[0] = str;
			}*/
		}else if("5".equals(guiType)) { //单个复选框
			SysCheckboxCache checkbox = (SysCheckboxCache)this.gui;
			boolean isExit = false; 
			if(checkbox!=null&&checkbox.getCheckboxId()!=0){ //满足说明用户保存该控件的扩展属性
				isExit = true;
			}
			String showName = isExit==false?null:checkbox.getCheckboxShowName();
			
			if(isHide==true){
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getCardFormGuiHtml(htmls, request,  null, null, null, checkbox.getCheckboxDataFromType(), checkbox.getCheckboxDataFromValue(), null, null,  checkbox.getCheckboxInitFun(), 
							null, null,null, this,false,null,null,isApp);
				}
				//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAsLabel, params);
				str += SysSqlParamReportUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,vtype, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,"isDisable".equals(""),entityName,width,null,jsName);
				htmls[7] = str;
			}else {
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getCheckboxHtml(checkbox, jsName, htmls, request, this,"isAsLabel".equals(""),isApp);
					vtype =(String)ret[0];
					isValueChange =(Boolean)ret[2];
					isOnclick =(Boolean)ret[3];
					isValidation =(Boolean)ret[4];
				}
				String classType = null;
				classType=SysCardFormBeansUtil.CARD_FORM_CHECKBOX;
				str +=SysSqlParamReportUtil.getCheckboxHtml(classType, jsName, vtype, emptyText, isRequired, isValueChange, isOnclick, isValidation, "isDisable".equals(""), entityName, width, showName);
				str +=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				htmls[0] = str;
			}
			
		}else if("6".equals(guiType)) { //日期格式控件
			SysDatepickerCache datepicker = (SysDatepickerCache)this.gui;
			boolean isExit = false; 
			if(datepicker!=null&&datepicker.getDatepickerId()!=0){ //满足说明用户保存该控件的扩展属性
				isExit = true;
			}
			String format = isExit==false?null:datepicker.getDatepickerFormat();
			String timeformat = isExit==false?null:datepicker.getDatepickerTimeformat();
			boolean showtime = isExit==false?false:"1".equals(datepicker.getDatepickerShowtime());
			boolean showokbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowokbutton());
			boolean showclearbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowclearbutton());
			boolean allowinput = isExit==false?false:"1".equals(datepicker.getDatepickerAllowinput());
			boolean showtodaybutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowtodaybutton());
			boolean isDrawdate = datepicker.getDatepickerDrawdateFun()!=null&&!"".equals(datepicker.getDatepickerDrawdateFun());
			
			if(isHide==true){
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getCardFormGuiHtml(htmls, request,  null, null, null, datepicker.getDatepickerDataFromType(), datepicker.getDatepickerDataFromValue(), null, null,  datepicker.getDatepickerInitFun(), 
							null, null,null, this,false,null,jsName,isApp);
				}
				//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAsLabel, params);
				str += SysSqlParamReportUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN, vtype, errorText, emptyText, isRequired, isValueChange, isOnclick,
						isValidation,false,entityName,width,null,jsName);
				htmls[7] = str;
			}else {
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getDatepickerHtml(datepicker, jsName, htmls, request, this,false,isApp);
					vtype =(String)ret[0];
					isValueChange =(Boolean)ret[2];
					isOnclick =(Boolean)ret[3];
					isValidation =(Boolean)ret[4];
				}
				String classType = null;
//				classType="yyyy-MM".equals(datepicker.getDatepickerFormat())?SysCardFormBeansUtil.CARD_FORM_MONTHPICKER:SysCardFormBeansUtil.CARD_FORM_DATEPICKER;
				
				if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd")) {
					classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER1;
				}else if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd HH:mm:ss")) {
					classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER2;
				}else if (datepicker.getDatepickerFormat().equals("HH:mm")) {
					classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER3;
				}else if (datepicker.getDatepickerFormat().equals("yyyyMM")) {
					classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER4;
				}
				
				str += SysSqlParamReportUtil.getDatepickerHtml(classType,jsName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,false,entityName,width
						,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,isDrawdate);
				str +=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				htmls[0] = str;
			}
		/*} else if ("7".equals(guiType)) { // lookup控件
			SysLookup lookup = (SysLookup)this.gui;
			boolean isExit = false; 
			if(lookup!=null&&lookup.getLookupId()!=0){ //满足说明用户保存该控件的扩展属性
				isExit = true;
			}
			
			if(isHide==true){
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getCardFormGuiHtml(htmls, request,  null, null, null, lookup.getLookupDataFromType(), lookup.getLookupDataFromValue(), null, null,  lookup.getLookupInitFun(), 
							null, null,null, this,false,null,jsName);
				}
				//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAsLabel, params);
				str += SysSqlParamReportUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,  vtype, errorText, emptyText, isRequired, isValueChange, isOnclick,
						isValidation,false,entityName,width,null,jsName);
				htmls[7] = str;
			} else {
//				SysFormColumn c = this.form.serchColumnByColumnId(columnId)
				if(isExit){ //满足说明用户保存该控件的扩展属性
					Object[] ret = SysSqlParamReportUtil.getLookupHtml(lookup, jsName, htmls, request, this,false);
					vtype =(String)ret[0];
					emptyText =(String)ret[1];
					isValueChange =(Boolean)ret[2];
					isOnclick =(Boolean)ret[3];
					isValidation =(Boolean)ret[4];
				}
				String classType = null;
				classType=SysCardFormBeansUtil.CARD_FORM_LOOKUP;
				str += SysSqlParamReportUtil.getLookupHtml(classType,jsName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,false,entityName,width,jsName.replace(".", "_")+ "_onbuttonclick");
				str += SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
				htmls[0] = str;
			}*/
			
		}else if("10".equals(guiType)) { //富文本控件
			
		} else if ("9".equals(guiType)) { // 附件上传下载
			
		}	
		
		return htmls;
	}

}
