package com.myehr.service.formmanage.runtime;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.pojo.field.SysField;
import com.myehr.pojo.formmanage.cache.UserObject;


public interface IRuntimeGridFormService {
	
	/**
	 * 删除grid列表数据
	 * @throws Exception 
	 * 	public String removeDatas(Map[] datas, String formId,Map<String,Object[]> tabparam,UserObject user,HttpServletRequest request) throws Exception {

	 */
	public String removeDatas(Map[] datas, String formId,Map<String,Object[]> tabparam,UserObject user,HttpServletRequest request,String sourceType) throws Throwable ;
	
	public String copyDatas(List<SysField> sysFields,Map[] datas, String formSaveTable,String pkColumn,UserObject user,HttpServletRequest request) throws Throwable ;
	
}
