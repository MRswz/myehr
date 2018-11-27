package com.myehr.pojo.formmanage.formCopy;

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

public class SysFormconfigMstTabDetailCacheCopy implements Serializable{
	private static Logger logger = LoggerFactory.getLogger(SysFormconfigMstTabDetailCacheCopy.class);
	private static final long serialVersionUID = 1L;
//	private static final Logger log = DcfUtil.getLogger(SysFormconfigMstTabDetail.class);
	/*@Autowired
	private IFormService formService;*/
	
	SysFormconfigMstTabDetail pojo;

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
	
	
	/**
	 空构造函数
	 *
	 */
	public SysFormconfigMstTabDetailCacheCopy(){};
	
	/**
	 * 构造函数
	 * @param obj
	 */
	public SysFormconfigMstTabDetailCacheCopy(SysFormconfigMstTabDetail obj,SysFormconfigMstTab tab){
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		this.setThisByDataObject(obj);
	}
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysFormconfigMstTabDetail obj){
		this.pojo = obj;
	
	}
}