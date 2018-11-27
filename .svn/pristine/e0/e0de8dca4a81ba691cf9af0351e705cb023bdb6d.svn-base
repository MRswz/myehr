package com.myehr.service.field;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.mybatis.Pagers;
import com.myehr.common.util.ResultMap;
import com.myehr.pojo.field.DataField;
import com.myehr.pojo.field.SysField;

public interface FieldService {
	
	public ResultMap getAllFieldOracle (HttpServletRequest request) throws Exception;
	
	public ResultMap getAllFieldMysql (HttpServletRequest request) throws Exception;
	
	public String updateSysField(SysField sField) throws Exception;
	
	public String deleteSysFieldOracle(SysField sField) throws Exception;
	
	public String deleteSysFieldMysql(SysField sField) throws Exception;
	
	public String insertSysField(SysField sField) throws Exception;	

	public String insertField(SysField sField) throws Exception;
	
	public ResultMap findStandardsFieldListOracle (HttpServletRequest request) throws Exception;
	
	public ResultMap findStandardsFieldListMssql (HttpServletRequest request) throws Exception;
	
	public ResultMap getAllFieldListByTemplate (HttpServletRequest request) throws Exception;
	
	public String insertStandartsField(List<DataField> dataFields) throws Exception;
	
	public ResultMap findFieldByEntityCode (HttpServletRequest request) throws Exception;

	public ResultMap findFieldByEntityCodeMssql(HttpServletRequest request);

	public Pagers translateRequest(HttpServletRequest request, String string);
	
	
}
