package com.myehr.controller.form.parambean;

import java.util.Map;

/**
 * 初始化表单数据的
 * @author Administrator
 *
 */
public class ExportCardformInitDataParams {

	//请求参数
	Map requestParam ;
	
	//表单ID
	String formId;
	
	public String getButtonId() {
		return buttonId;
	}

	public void setButtonId(String buttonId) {
		this.buttonId = buttonId;
	}

	String buttonId;
	
	String filename;
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	String userIds;
	
    Map[] heightGrade;
    
    Map fieldArray;
    
    //容器参数
  	Map containerParam ;

  	public Map getContainerParam() {
  		return containerParam;
  	}

  	public void setContainerParam(Map containerParam) {
  		this.containerParam = containerParam;
  	}
	
	

	//过滤条件参数值

	public String getUserIds() {
		return userIds;
	}
	
	public Map getFieldArray() {
		return fieldArray;
	}

	public void setFieldArray(Map fieldArray) {
		this.fieldArray = fieldArray;
	}

	public Map[] getHeightGrade() {
		return heightGrade;
	}

	public void setHeightGrade(Map[] heightGrade) {
		this.heightGrade = heightGrade;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	Map filter;
	
	//高级查参数
	//Map[] heightGrade;
	
	//是否预览模式
	String isView;
	
	//其它参数
	Map paramsMap;
	
	public Map getRequestParam() {
		return requestParam;
	}

	public void setRequestParam(Map requestParam) {
		this.requestParam = requestParam;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Map getFilter() {
		return filter;
	}

	public void setFilter(Map filter) {
		this.filter = filter;
	}

	/*public Map[] getHeightGrade() {
		return heightGrade;
	}

	public void setHeightGrade(Map[] heightGrade) {
		this.heightGrade = heightGrade;
	}*/

	public String getIsView() {
		return isView;
	}

	public void setIsView(String isView) {
		this.isView = isView;
	}

	public Map getParamsMap() {
		return paramsMap;
	}

	public void setParamsMap(Map paramsMap) {
		this.paramsMap = paramsMap;
	}

}
