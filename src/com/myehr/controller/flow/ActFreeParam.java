package com.myehr.controller.flow;

import java.util.Map;

public class ActFreeParam {
	//流程Id
	String taskId;
	
	String content;
	
	String action;
	
	ActionDetail detail;
	
	String orderBy;
	
	String buttonId;
	
	String formId;
	
	Map param;
	
	Map paramsMap;

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public ActionDetail getDetail() {
		return detail;
	}

	public void setDetail(ActionDetail detail) {
		this.detail = detail;
	}

	public String getButtonId() {
		return buttonId;
	}

	public void setButtonId(String buttonId) {
		this.buttonId = buttonId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Map getParam() {
		return param;
	}

	public void setParam(Map param) {
		this.param = param;
	}

	public Map getParamsMap() {
		return paramsMap;
	}

	public void setParamsMap(Map paramsMap) {
		this.paramsMap = paramsMap;
	}

	
	
	
	
}
