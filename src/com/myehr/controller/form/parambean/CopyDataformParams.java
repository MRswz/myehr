package com.myehr.controller.form.parambean;

import java.util.Map;

/**
 * 表单复制的逻辑接收参数类
 * @author Administrator
 *
 */
public class CopyDataformParams {

	//请求参数
	Map[] params ;
	
	//表单保存表名
	String formSaveTable;
	
	//表单主键字段
	String pkColumn;
	
	public Map[] getParams() {
		return params;
	}

	public void setParams(Map[] params) {
		this.params = params;
	}

	public String getFormSaveTable() {
		return formSaveTable;
	}

	public void setFormSaveTable(String formSaveTable) {
		this.formSaveTable = formSaveTable;
	}

	public String getPkColumn() {
		return pkColumn;
	}

	public void setPkColumn(String pkColumn) {
		this.pkColumn = pkColumn;
	}
	
}
