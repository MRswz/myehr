package com.myehr.service.formmanage.form;

import java.util.List;

import com.myehr.pojo.formmanage.button.SysFormButtonParam;

public interface IButtonParamService {
	
	/**
	 * 通过buttonId获取对应新增或编辑按钮扩展信息 
	 * @param buttonId
	 * @return
	 */
	List<SysFormButtonParam> querySysFormButtonParamByButtonId(String buttonId);

}
