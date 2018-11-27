package com.myehr.service.formmanage.form;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.SysFormWhere;


public interface IWhereService {
	
	/**
	 * 通过表单ID获取当前表单下的设置过滤条件数据
	 * @param fromId
	 * @param otherType
	 * @return
	 */
	public List<SysFormWhere> queryFormWhere(String fromId,String otherType);
	
	/**
	 * 保存表单的过滤条件
	 * @param objs
	 * @return
	 * @throws Exception
	 */
	public String saveFormWhere(List<Map> objs) throws Exception; 
}
