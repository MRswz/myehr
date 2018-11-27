package com.myehr.pojo.formmanage.cache;


import java.io.Serializable;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumn;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormTreeSolutionColumnCache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysTreeSolutionColumn pojo;
	
	SysEntity entity;
	
	SysField field;
	
	public SysFormTreeSolutionColumnCache(){}
	
	
	public SysTreeSolutionColumn getPojo() {
		return pojo;
	}


	public void setPojo(SysTreeSolutionColumn pojo) {
		this.pojo = pojo;
	}
	
	

	public SysEntity getEntity() {
		return entity;
	}


	public SysField getField() {
		return field;
	}


	public void setEntity(SysEntity entity) {
		this.entity = entity;
	}


	public void setField(SysField field) {
		this.field = field;
	}


	private void setField() {
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		this.field = sysformconfigService.getFieldById(this.getPojo().getTreeColumnId()+"");
	}
	
	private void setEntity() {
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		this.entity = sysformconfigService.getEntityById(this.getPojo().getTreeEntityId()+"");
	}


	/**
	 * DataObject 初始化数据
	 */
	public SysFormTreeSolutionColumnCache(SysTreeSolutionColumn obj){
		this.pojo=obj;
		this.setEntity();
		this.setField(); 
	}



}
