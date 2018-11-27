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
import com.myehr.pojo.formmanage.widget.SysFormLookup;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.generalparam.ISysFormGeneralParamService;

public class SysFormLookupCacheCopy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SysFormLookup pojoLookup;
	
	//自定义回填sql对象
	private SysFormGeneralExecSqlCacheCopy backSql ;
	
	public SysFormGeneralExecSqlCacheCopy getBackSql() {
		return backSql;
	}

	public void setBackSql(SysFormGeneralExecSqlCacheCopy backSql) {
		this.backSql = backSql;
	}
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
	
	public String getLookupWinTitle() {
		return pojoLookup.getLookupWinTitle();
	}

	public String getLookupClickFun() {
		return pojoLookup.getLookupClickFun();
	}

	public String getLookupDatabackType() {
		return pojoLookup.getLookupDatabackType();
	}

	public String getLookupDatabackValue() {
		return pojoLookup.getLookupDatabackValue();
	}

	public String getLookupDataFromType() {
		return pojoLookup.getLookupDataFromType();
	}

	public String getLookupDataFromValue() {
		return pojoLookup.getLookupDataFromValue();
	}

	public String getLookupFormColumnId() {
		return pojoLookup.getLookupFormColumnId().toString();
	}

	public String getLookupFormId() {
		return pojoLookup.getLookupFormId();
	}

	public String getLookupFormUrl() {
		return pojoLookup.getLookupFormUrl();
	}

	public String getLookupFormWinType() {
		return pojoLookup.getLookupFormWinType();
	}

	public long getLookupId() {
		return pojoLookup.getLookupId().longValue();
	}

	public String getLookupInitFun() {
		return pojoLookup.getLookupInitFun();
	}

	public String getLookupMuliselect() {
		return pojoLookup.getLookupMuliselect();
	}

	public String getLookupShowProperty() {
		return pojoLookup.getLookupShowProperty();
	}

	public String getLookupValuechangeFun() {
		return pojoLookup.getLookupValuechangeFun();
	}

	public String getLookupValueProperty() {
		return pojoLookup.getLookupValueProperty();
	}

	public String getLookupWinHeight() {
		return pojoLookup.getLookupWinHeight();
	}

	public String getLookupWinWidth() {
		return pojoLookup.getLookupWinWidth();
	}

	public String getOperatorName() {
		return pojoLookup.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojoLookup.getOperatorTime();
	}
	
	public String getLookupButtonclickFun() {
		return pojoLookup.getLookupButtonclickFun();
	}
	
	public String getLookupCheckFun() {
		return pojoLookup.getLookupCheckFun();
	}
	
	public String getlookupCustomDataback() {
		return pojoLookup.getLookupCustomDataback();
	}
	
	public String getlookupCustomDatabackFun() {
		return pojoLookup.getLookupCustomDatabackFun();
	}
	
	public  SysFormLookupCacheCopy(String columnId) {
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormLookup obj = service.getLookup(columnId);
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
		//加载通用参数对象数据
		//ISysFormGeneralParamService
//		ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)ApplicationContextFactory.getContext().getBean("ISysFormGeneralParamService");
		ISysFormGeneralParamService paramService = (ISysFormGeneralParamService)SpringContextUtils.getBeanById("ISysFormGeneralParamService");
		String paramType = FormParamConstants.COLUMN_LOOKUP;
		List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,this.pojoLookup.getLookupId().longValue());
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
		if("sql".equals(this.pojoLookup.getLookupDatabackType())){
			String type = FormParamConstants.EXECSQL_LOOKUPBACK;
			this.backSql = new SysFormGeneralExecSqlCacheCopy(type,this.pojoLookup.getLookupId()+"");
		}
		
		
	}
	
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormLookup obj){
		this.pojoLookup = obj;
	}
}