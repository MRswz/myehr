package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.myehr.common.exception.DcfException;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTab;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetail;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormconfigMstTabDetailCache implements Serializable{
	private static Logger logger = LoggerFactory.getLogger(SysFormconfigMstTabDetailCache.class);
	private static final long serialVersionUID = 1L;
	
	SysFormconfigMstTabDetail pojo;
	
	//主表表对象
	private SysFormconfigMstTab mstTab;
	
	//从表表单对象
	private SysFormconfigCache form ;

	public SysFormconfigMstTabDetail getPojo() {
		return pojo;
	}

	public void setPojo(SysFormconfigMstTabDetail pojo) {
		this.pojo = pojo;
	}

	public BigDecimal getMstTabId() {
		return this.pojo.getMstTabId();
	}

	public String getOperatorName() {
		return this.pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return this.pojo.getOperatorTime();
	}

	public BigDecimal getTabDetailFormId() {
		return this.pojo.getTabDetailFormId();
	}

	public String getTabDetailFormTitle() {
		return this.pojo.getTabDetailFormTitle();
	}

	public String getTabDetailFormUrl() {
		return this.pojo.getTabDetailFormUrl();
	}

	public BigDecimal getTabDetailId() {
		return this.pojo.getTabDetailId();
	}

	public String getTabDetailIsForm() {
		return this.pojo.getTabDetailIsForm();
	}

	public BigDecimal getTabDetailSort() {
		return this.pojo.getTabDetailSort();
	}
	
	
	public SysFormconfigCache getForm() {
		return form;
	}

	public void setForm(SysFormconfigCache form) {
		this.form = form;
	}

	public SysFormconfigMstTab getMstTab() {
		return mstTab;
	}

	public void setMstTab(SysFormconfigMstTab mstTab) {
		this.mstTab = mstTab;
	}
	
	/**
	 空构造函数
	 *
	 */
	public SysFormconfigMstTabDetailCache(){};
	
	/**
	 * 构造函数
	 * @param obj
	 */
	public SysFormconfigMstTabDetailCache(SysFormconfigMstTabDetail obj,SysFormconfigMstTab tab){
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		this.setThisByDataObject(obj);
		try {
			this.form = sysformconfigService.getForm(this.pojo.getTabDetailFormId()+"");
		} catch (DcfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		if(this.form==null){
//			log.error("初始化主从tab的字表对象时，无法获取表单id为："+this.tabDetailFormId+" 的表单对象");
			logger.info("初始化主从tab的字表对象时，无法获取表单id为："+this.pojo.getTabDetailFormId()+" 的表单对象");
		}else {
			this.mstTab = tab;
		}
	}
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormconfigMstTabDetail obj){
		this.pojo = obj;
	
	}
}