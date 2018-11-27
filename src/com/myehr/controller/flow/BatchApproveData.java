package com.myehr.controller.flow;

import java.util.List;
import java.util.Map;

/**
 * 初始化表单数据的
 * @author Administrator
 *
 */
public class BatchApproveData {
	
	//表单ID
	String approveRemark;
	
	//其它参数
	List<Map> selectsParam;

	public String getApproveRemark() {
		return approveRemark;
	}

	public void setApproveRemark(String approveRemark) {
		this.approveRemark = approveRemark;
	}

	public List<Map> getSelectsParam() {
		return selectsParam;
	}

	public void setSelects(List<Map> selectsParam) {
		this.selectsParam = selectsParam;
	}

}
