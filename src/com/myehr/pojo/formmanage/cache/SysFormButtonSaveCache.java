package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.Date;

import com.myehr.pojo.formmanage.button.SysFormButtonSave;


public class SysFormButtonSaveCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SysFormButtonSave pojo;
	
	public String getButtonSaveSuccessFun() {
		return pojo.getButtonSaveSuccessFun();
	}

	public String getButtonSaveButtonId() {
		return pojo.getButtonSaveButtonId()+"";
	}

	public String getButtonSaveExcType() {
		return pojo.getButtonSaveExcType();
	}

	public String getButtonSaveFun() {
		return pojo.getButtonSaveFun();
	}

	public String getButtonSaveId() {
		return pojo.getButtonSaveId()+"";
	}

	public String getButtonSaveInitFun() {
		return pojo.getButtonSaveInitFun();
	}

	public String getButtonSaveSql() {
		return pojo.getButtonSaveSql();
	}

	public String getButtonSaveType() {
		return pojo.getButtonSaveType();
	}

	public String getButtonSaveUrl() {
		return pojo.getButtonSaveUrl();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	public String getButtonSaveSuccessDeal() {
		return pojo.getButtonSaveSuccessDeal();
	}
	
	public SysFormButtonSave getPojo() {
		return pojo;
	}

	public void setPojo(SysFormButtonSave pojo) {
		this.pojo = pojo;
	}

	/*
	 * 构造函数 通过DataObject加载对象
	 */
	public SysFormButtonSaveCache(SysFormButtonSave obj){
		this.setThisByDataObject(obj);
	}
	
	public SysFormButtonSaveCache() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param obj
	 */
	public void setThisByDataObject(SysFormButtonSave obj){
		this.pojo = obj;
	}

	
}
