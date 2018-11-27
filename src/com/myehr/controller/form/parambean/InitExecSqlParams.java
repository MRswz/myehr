package com.myehr.controller.form.parambean;

import java.util.Map;

/**
 * 保存按钮参数类
 * @author Administrator
 *
 */
public class InitExecSqlParams {
	//保存按钮表单或列参数
	Map param ;
	
	//表单ID
	String formId;
	
	//其它参数
	Map paramsMap;

	public Map getParam() {
		return param;
	}

	public void setParam(Map param) {
		this.param = param;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Map getParamsMap() {
		return paramsMap;
	}

	public void setParamsMap(Map paramsMap) {
		this.paramsMap = paramsMap;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("param:"+param+",formId:"+formId);
	}
	
}
