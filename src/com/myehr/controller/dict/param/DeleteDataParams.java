package com.myehr.controller.dict.param;

import java.util.List;
import java.util.Map;

/**
 * 初始化表单数据的
 * @author Administrator
 *
 */
public class DeleteDataParams {
	
	//容器参数
	List<Map> deleteParams ;

	public List<Map> getDeleteParams() {
		return deleteParams;
	}

	public void setDeleteParams(List<Map> deleteParams) {
		this.deleteParams = deleteParams;
	}

}
