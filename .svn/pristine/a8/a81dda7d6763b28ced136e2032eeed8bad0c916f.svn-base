package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.SysFormButtonRemove;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormButtonRemoveCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysFormButtonRemove pojo;
	
	public String getButtonRemoveCascadeDelete() {
		return pojo.getButtonRemoveCascadeDelete();
	}

	public String getButtonRemoveButtonId() {
		return pojo.getButtonRemoveButtonId()+"";
	}

	public String getButtonRemoveExcType() {
		return pojo.getButtonRemoveExcType();
	}

	public String getButtonRemoveFun() {
		return pojo.getButtonRemoveFun();
	}

	public long getButtonRemoveId() {
		return pojo.getButtonRemoveId().longValue();
	}

	public String getButtonRemoveInitFun() {
		return pojo.getButtonRemoveInitFun();
	}

	public String getButtonRemoveSql() {
		return pojo.getButtonRemoveSql();
	}

	public String getButtonRemoveType() {
		return pojo.getButtonRemoveType();
	}

	public String getButtonRemoveUrl() {
		return pojo.getButtonRemoveUrl();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}
	
	
	
	public SysFormButtonRemoveCache(String formButtonId) {
		// TODO 自动生成构造函数存根
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormButtonRemove obj = service.getButtonRemove(formButtonId);
		if(obj!=null){
			this.pojo=obj;
		}else{
			this.pojo=new SysFormButtonRemove();
			this.pojo.setButtonRemoveType("1");
			this.pojo.setButtonRemoveExcType("default");
			this.pojo.setButtonRemoveButtonId(new BigDecimal(formButtonId));
			this.pojo.setButtonRemoveId(new BigDecimal(234));
		}
		//查询对应的参数表信息
	}

	/**
	 * @param obj
	 */
	public void setThisByDataObject(SysFormButtonRemove obj){
		this.pojo= obj;
	}



}
