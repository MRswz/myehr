package com.myehr.service.formmanage.form;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.SysFormButton;


public interface IFormCacheBeanUtil {
	
	/**
	 * 初始化表单定义 对象
	 * @param fromId
	 * @return
	 */
	Map getFormBean(String fromId) ;
	
	/**
	 * 获取指定用户和表单下的所有有权限字段
	 * @param formId
	 * @param userId
	 * @return
	 */
	List<Map> queryFieldByUserIdAndFormId(String formId,String userId);
	
	/**
	 * 获取指定用户和表单下的所有按钮权限
	 * @param formId
	 * @param userId
	 * @return
	 */
	List<SysFormButton> queryButtonsByUserIdAndFormId(String formId,String userId);
}
