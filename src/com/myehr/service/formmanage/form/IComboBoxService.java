package com.myehr.service.formmanage.form;

import java.util.Date;
import java.util.Map;

import com.myehr.pojo.formmanage.widget.SysFormCombobox;

public interface IComboBoxService {
	/**
	 * 保存下拉列表配置信息
	 * @param comboBox 
	 * @param userid 
	 * @param operatorTime 
	 * @return
	 */
	public Map<String, Object> saveComboBoxInfo(Map comboBox,String userid,Date operatorTime)throws Exception ;
	
	/**
	 * 根据主键查询下拉列表信息
	 * @param comboboxId
	 * @return
	 */
	public SysFormCombobox queryComboBoxByColumnId(String columnid);
	
}
