package com.myehr.service.formmanage.form.widget;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.widget.SysFormLookup;


public interface ILookUpService {
	/**
	 * 保存查询选择控件配置信息
	 * @param comboBox 
	 * @param userid 
	 * @param operatorTime 
	 * @return
	 */
	public Map<String, Object> saveLookupInfo(Map lookup,String userid,Date operatorTime)throws Exception ;
	
	/**
	 * 根据主键查询查询选择控件配置详情信息
	 * @param lookupId
	 * @return
	 */
	public SysFormLookup queryLookupDetailByColumnId(String columnId);
	
	/**
	 * 通过formId获取对应的字段信息 通过缓存获取
	 * @param lookupId
	 * @return
	 */
	public List<Map> queryColumnByFromIdFromCache(String formId);
}
