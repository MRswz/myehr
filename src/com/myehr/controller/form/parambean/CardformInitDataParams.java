package com.myehr.controller.form.parambean;

import java.util.Map;

import com.myehr.common.mybatis.Pager;

/**
 * 初始化表单数据的
 * @author Administrator
 *
 */
public class CardformInitDataParams {

	//请求参数
	Map requestParam ;
	
	//主键值参数
	String pkId;
	
	//表单ID
	String formId;
	
	//排序
	String order;
	
	//当前页
	String offset;
	
	//页面条数
	String limit;
	
	String userIds;
	
    Map[] heightGrade;
    
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

	public Map[] getHeightGrade() {
		return heightGrade;
	}

	public void setHeightGrade(Map[] heightGrade) {
		this.heightGrade = heightGrade;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	Map filter;
	
	//分页对象
	Pager page;
	
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

	public String getPkId() {
		return pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
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

	public Pager getPage() {
		return page;
	}

	public void setPage(Pager page) {
		this.page = page;
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
