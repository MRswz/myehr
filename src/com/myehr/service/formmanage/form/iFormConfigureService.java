package com.myehr.service.formmanage.form;

import javax.servlet.http.HttpServletRequest;
import com.myehr.common.util.ResultMap;
import com.myehr.pojo.formmanage.form.SysFormconfig;

public interface iFormConfigureService {

	public ResultMap getAllForm (HttpServletRequest request) throws Exception;
	
	public String updateSysForm(SysFormconfig sForm) throws Exception;
	
	public String deleteSysForm(SysFormconfig sForm) throws Exception;
	
	public String insertSysForm(SysFormconfig sForm) throws Exception;	

	public String insertForm(SysFormconfig sForm) throws Exception;
	
	public ResultMap findStandardsFormList (HttpServletRequest request) throws Exception;
	
	public ResultMap findFormByEntityCode (HttpServletRequest request) throws Exception;
	
	public String convertSql(String sql) throws Exception;
}
