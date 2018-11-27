package com.myehr.controller.form.parambean;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.SysFormColumn;

/**
 * 初始化表单数据的
 * @author Administrator
 *
 */
public class SaveSelectFilterColumnParams {
	String formId;
	
	String gridFilterId;

	List<Map> columns ;
	
	public String getFormId() {
		return formId;
	}
	public void setFormId(String formId) {
		this.formId = formId;
	}
	
	public String getGridFilterId() {
		return gridFilterId;
	}
	public void setGridFilterId(String gridFilterId) {
		this.gridFilterId = gridFilterId;
	}
	public List<Map> getColumns() {
		return columns;
	}
	public void setColumns(List<Map> columns) {
		this.columns = columns;
	}
	

}
