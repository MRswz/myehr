package com.myehr.service.formmanage.form.widget;

import java.util.Date;
import java.util.Map;

import com.myehr.pojo.formmanage.widget.SysFormRichtext;


public interface IRichtextService {
	/**
	 * 保存富文本配置信息
	 * @param richtext 
	 * @param userid 
	 * @param operatorTime 
	 * @return
	 */
	public Map<String, Object> saveRichtextInfo(SysFormRichtext richtext,String userid,Date operatorTime)throws Exception ;
	
	/**
	 * 根据主键查询富文本信息
	 * @param richtextId
	 * @return
	 */
	public SysFormRichtext queryRichtextDetailByColumnId(String columnId);
}
