package com.myehr.controller.flow;

import java.util.Map;

import com.myehr.common.mybatis.Pager;

/**
 * 初始化表单数据的
 * @author Administrator
 *
 */
@SuppressWarnings("unchecked")
public class ActSaveDataParams {

	Map param ;
	
	//表单ID
	String formId;
	
	//其它参数
	Map paramsMap;
	
	Map actFlowParams;
	
	//排序
	String order;
	
	//当前页
	int offset;
	
	//页面条数
	int limit;
	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public Map getActFlowParams() {
		return actFlowParams;
	}

	public void setActFlowParams(Map actFlowParams) {
		this.actFlowParams = actFlowParams;
	}

	//按钮ID
	String buttonId;

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

	public String getButtonId() {
		return buttonId;
	}

	public void setButtonId(String buttonId) {
		this.buttonId = buttonId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("param:"+param+",formId:"+formId+",buttonId:"+buttonId+",buttonId:"+buttonId);
	}

}
