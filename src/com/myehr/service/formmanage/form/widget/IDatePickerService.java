package com.myehr.service.formmanage.form.widget;

import java.util.Map;

import com.myehr.pojo.formmanage.widget.SysFormDatepicker;

public interface IDatePickerService {
	/**
	 * 通过字段id获取texbox控件信息
	 * @param columnId
	 * @return
	 */
	SysFormDatepicker queryDatePickerDetailByColumnId(String columnId);
	
	/**
	 * 保存textbox控件信息
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	String saveDatePickerInfo(Map obj) throws Exception;

}
