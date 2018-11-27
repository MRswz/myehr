package com.myehr.service.formmanage.runtime;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.FormConfigResultMap;
import com.myehr.pojo.formmanage.cache.UserObject;


public interface IRuntimeCardFormService {
	/**
	 * 初始化卡片表单数据
	 * @param requestParam
	 * @param pkId
	 * @return
	 */
	public FormConfigResultMap cardFormInitData(Map<String,String> requestParam,Map<String,String> filter, Map<String,String>[] heightGrade,
			String pkId,String formId,String currentUserId,Pager page,UserObject user, String isView,Map<String, String> paramsMap
			,HttpServletRequest request,String userIds,Map<String,String> containerParam,String queryType,String sourceType) throws Throwable;
	
	public FormConfigResultMap exportCardFormInitData(Map<String,String> requestParam,Map<String,String> filter, Map<String,String>[] heightGrade,
			String pkId,String formId,String currentUserId,Pager page,UserObject user, String isView,Map<String, String> paramsMap
			,HttpServletRequest request,String userIds,Map<String,String> containerParam,String queryType,String sourceType) throws Throwable;
	
	public FormConfigResultMap cardFormInitData_Question(Map requestParam, Map filter,
			Map[] heightGrade, String pkId, String formId,
			String currentUserId, Pager page, UserObject user, String isView,
			Map paramsMap, HttpServletRequest request, String userIds,
			Map containerParam, String queryType, String templateId)
			throws Throwable;
	
	/**
	 * 导出数据
	 *//*
	public DcfReponse exportGridData(Map<String, String> requestParam,
			Map<String, String> filter, Map<String, String>[] heightGrade,
			String pkId, String formId, String currentUserId, Pager page,
			UserObject user, String fileName, long buttonId,Map<String, String> paramsMap);
	
	*//**
	 * 检查唯一
	 * @param formId
	 * @param field
	 * @param value
	 * @return
	 *//*

	public Boolean checkUniqueVerify(String formId, String field, String value,String pkValue) ;
	
	
	
	//通过自定sql查询combobox下拉数据等控件；
	public Map[] queryGuiInitDatas(String  paramsJson ,String execType,String _value) throws DcfException;
	*/
}
