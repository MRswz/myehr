package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.cache.FormParamConstants;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.widget.SysFormRadiobuttonlist;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormRadiobuttonlistCacheCopy implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//主键
	private long radiolistId;
	
	//数据初始化类型
	private String radiolistDataFromType;
	
	//数据初始化来源值
	private String radiolistDataFromValue;
	
	//控件数据初始化类型
	private String radiolistGuiInitType;
	
	//控件初始化值
	private String radiolistGuiInitValue;
	
	//自定义数据初始化方案
	private String radiolistInitFun;
	
	private String radiolistRepeatitems;
	
	private String radiolistRepeatlayout;
	
	private String radiolistTextField;
	
	private String radiolistValueField;
	
	private String radiolistDataField;
	
	private String radiolistRepeatdirection;
	
	private String radiolistValuechangeFun;
	
	private String radiolistClickFun;
	
	private String radiolistFormColumnId;
	
	/**
	 * 该控件对应的通用参数
	 */
	private  Map<String,List<SysFormGeneralParamCacheCopy>> generalParams = new HashMap<String,List<SysFormGeneralParamCacheCopy>>();

	public Map<String,List<SysFormGeneralParamCacheCopy>> getGeneralParams() {
		return generalParams;
	}

	public void setGeneralParams(Map<String,List<SysFormGeneralParamCacheCopy>> generalParams) {
		this.generalParams = generalParams;
	}

	
	//区分是checkbox或者radiobox
	private String checkboxOrRadiobox;
	
	private Date operatorTime;
	
	private String  operatorName;

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Date getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}

	public String getRadiolistDataField() {
		return radiolistDataField;
	}

	public void setRadiolistDataField(String radiolistDataField) {
		this.radiolistDataField = radiolistDataField;
	}

	public String getRadiolistInitFun() {
		return radiolistInitFun;
	}

	public void setRadiolistInitFun(String radiolistInitFun) {
		this.radiolistInitFun = radiolistInitFun;
	}

	public String getRadiolistRepeatitems() {
		return radiolistRepeatitems;
	}

	public void setRadiolistRepeatitems(String radiolistRepeatitems) {
		this.radiolistRepeatitems = radiolistRepeatitems;
	}

	public String getRadiolistRepeatlayout() {
		return radiolistRepeatlayout;
	}

	public void setRadiolistRepeatlayout(String radiolistRepeatlayout) {
		this.radiolistRepeatlayout = radiolistRepeatlayout;
	}

	public String getRadiolistTextField() {
		return radiolistTextField;
	}

	public void setRadiolistTextField(String radiolistTextField) {
		this.radiolistTextField = radiolistTextField;
	}

	public String getRadiolistValueField() {
		return radiolistValueField;
	}

	public void setRadiolistValueField(String radiolistValueField) {
		this.radiolistValueField = radiolistValueField;
	}

	public String getRadiolistClickFun() {
		return radiolistClickFun;
	}

	public void setRadiolistClickFun(String radiolistClickFun) {
		this.radiolistClickFun = radiolistClickFun;
	}

	public String getRadiolistDataFromType() {
		return radiolistDataFromType;
	}

	public void setRadiolistDataFromType(String radiolistDataFromType) {
		this.radiolistDataFromType = radiolistDataFromType;
	}

	public String getRadiolistDataFromValue() {
		return radiolistDataFromValue;
	}

	public void setRadiolistDataFromValue(String radiolistDataFromValue) {
		this.radiolistDataFromValue = radiolistDataFromValue;
	}

	public String getRadiolistFormColumnId() {
		return radiolistFormColumnId;
	}

	public void setRadiolistFormColumnId(String radiolistFormColumnId) {
		this.radiolistFormColumnId = radiolistFormColumnId;
	}

	public String getRadiolistGuiInitType() {
		return radiolistGuiInitType;
	}

	public void setRadiolistGuiInitType(String radiolistGuiInitType) {
		this.radiolistGuiInitType = radiolistGuiInitType;
	}

	public String getRadiolistGuiInitValue() {
		return radiolistGuiInitValue;
	}

	public void setRadiolistGuiInitValue(String radiolistGuiInitValue) {
		this.radiolistGuiInitValue = radiolistGuiInitValue;
	}

	public long getRadiolistId() {
		return radiolistId;
	}

	public void setRadiolistId(long radiolistId) {
		this.radiolistId = radiolistId;
	}


	public String getRadiolistRepeatdirection() {
		return radiolistRepeatdirection;
	}

	public void setRadiolistRepeatdirection(String radiolistRepeatdirection) {
		this.radiolistRepeatdirection = radiolistRepeatdirection;
	}

	public String getRadiolistValuechangeFun() {
		return radiolistValuechangeFun;
	}

	public void setRadiolistValuechangeFun(String radiolistValuechangeFun) {
		this.radiolistValuechangeFun = radiolistValuechangeFun;
	}
	
	public String getCheckboxOrRadiobox() {
		return checkboxOrRadiobox;
	}

	public void setCheckboxOrRadiobox(String checkboxOrRadiobox) {
		this.checkboxOrRadiobox = checkboxOrRadiobox;
	}
	
	public SysFormRadiobuttonlistCacheCopy(String columnId) {
		//IRadioButtonListService service = (IRadioButtonListService)ApplicationContextFactory.getContext().getBean("IRadioButtonListService");
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormRadiobuttonlist obj = service.getRadiobuttonlist(columnId);
		if(obj!=null){
			this.setThisByDataObject(obj);
			ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
			String paramType = FormParamConstants.COLUMN_RADIOLIST_OR_CHECKBOXLIST;
			List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,this.radiolistId);
			for(int i=0; i<params.size(); i++){
				SysFormGeneralParamCacheCopy p = new SysFormGeneralParamCacheCopy(params.get(i));
				String type = p.getParamTypeEnd();
				if(this.generalParams.containsKey(type)){
					List<SysFormGeneralParamCacheCopy> l = this.generalParams.get(type);
					l.add(p);
					this.generalParams.put(type, l);
				}else {
					List<SysFormGeneralParamCacheCopy> l = new ArrayList<SysFormGeneralParamCacheCopy>();
					l.add(p);
					this.generalParams.put(type, l);
				}
			}
		}
	}
	
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormRadiobuttonlist obj){
		this.operatorName = obj.getOperatorName();
		this.operatorTime = obj.getOperatorTime();
		this.radiolistDataField =  obj.getRadiolistDatafield();
		this.radiolistInitFun =  obj.getRadiolistInitFun();
		this.radiolistRepeatitems =  obj.getRadiolistRepeatitems();
		this.radiolistRepeatlayout =  obj.getRadiolistRepeatlayout();
		this.radiolistTextField =  obj.getRadiolistTextfield();
		this.radiolistValueField =  obj.getRadiolistValuefield();
		this.radiolistClickFun =  obj.getRadiolistClickFun();
		this.radiolistDataFromType =  obj.getRadiolistDataFromType();
		this.radiolistDataFromValue =  obj.getRadiolistDataFromValue();
		this.radiolistFormColumnId =  obj.getRadiolistFormColumnId()+"";
		this.radiolistGuiInitType =  obj.getRadiolistGuiInitType();
		this.radiolistGuiInitValue =  obj.getRadiolistGuiInitValue();
		this.radiolistId =  Long.valueOf(obj.getRadiolistId()+"");
		this.radiolistInitFun =  obj.getRadiolistInitFun();
		this.radiolistRepeatdirection =  obj.getRadiolistRepeatdirection();
		this.radiolistValuechangeFun =  obj.getRadiolistValuechangeFun();
		this.checkboxOrRadiobox = obj.getCheckboxOrRadiobox();
	}
	
}
