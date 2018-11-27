package com.myehr.controller.form.parambean;

import java.util.Map;

import com.myehr.common.mybatis.Pager;

/**
 * 删除表单的逻辑接收参数类
 * @author Administrator
 *
 */
@SuppressWarnings("unchecked")
public class RemoveDataformParams {

	//请求参数
	Map[] params ;
	
	//表单ID
	String formId;
	
	//其它参数
	Map tabparam;
	
	public Map[] getParams() {
		return params;
	}

	public void setParams(Map[] params) {
		this.params = params;
	}


	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Map getTabparam() {
		return tabparam;
	}

	public void setTabparam(Map tabparam) {
		this.tabparam = tabparam;
	}

}
