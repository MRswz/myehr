package com.myehr.service.formmanage.form;

import java.util.Date;
import java.util.Map;

import com.myehr.pojo.formmanage.widget.SysFormDatepicker;


public interface IDatePickerService {
	/**
	 * 保存下拉列表配置信息
	 * @param datePicker 
	 * @param userid 
	 * @param operatorTime 
	 * @return
	 */
	public Map<String, Object> saveDatePickerInfo(SysFormDatepicker datePicker,String userid,Date operatorTime)throws Exception ;
	
	/**
	 * 根据主键查询下拉列表信息
	 * @param comboboxId
	 * @return
	 */
	public SysFormDatepicker queryDatePickerDetailByColumnId(String columnId);
}
