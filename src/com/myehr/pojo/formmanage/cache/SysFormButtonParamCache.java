package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import com.myehr.pojo.formmanage.button.SysFormButtonParam;

public class SysFormButtonParamCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysFormButtonParam pojo;
	
	public String getButtonAddId() {
		return pojo.getButtonAddId()+"";
	}

	public String getButtonParamDesc() {
		return pojo.getButtonParamDesc();
	}

	public String getButtonParamFrom() {
		return pojo.getButtonParamFrom();
	}

	public long getButtonParamId() {
		return pojo.getButtonParamId().longValue();
	}

	public String getButtonParamName() {
		return pojo.getButtonParamName();
	}

	public String getButtonParamValue() {
		return pojo.getButtonParamValue();
	}

	public String getOperatorName() {
		return pojo.getOperatorName()+"";
	}
	
	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}
	
	/**
	 * 空构造函数
	 *
	 */
	public SysFormButtonParamCache(){};

	/*
	 * 构造函数 通过DataObject加载对象
	 */
	public SysFormButtonParamCache(Map obj){
		this.setThisByDataObject(obj);
			//查询对应的参数表信息
	}
	
	/**
	 * @param obj
	 */
	public void setThisByDataObject(Map obj){
		this.pojo= (SysFormButtonParam) obj;
	}

	
}
