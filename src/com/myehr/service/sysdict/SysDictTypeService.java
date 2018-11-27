package com.myehr.service.sysdict;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.ResultMap;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.pojo.dict.SysDictType;

public interface SysDictTypeService {
	/*根据ID获取数据*/
	public SysDictType findSysDictTypeById(int id) throws Exception;
	
	public ResultMap findSysDictTypeAll(SysDictTypeExample sExample) throws Exception;
	
	public void saveSysDictType() throws Exception;
	
	public String updateSysDictType(SysDictType dict) throws Exception;
	
	public String deleteSysDictType(SysDictType dict) throws Exception;
	
	public String insertSysDictType(SysDictType dict) throws Exception;
	
	public ResultMap searchDictTypeList(String condition) throws Exception;
	
	public ResultMap getAllDictTypeList (HttpServletRequest request) throws Exception;

	ResultMap searchByDeleteMark(String deleteMark) throws Exception;

	SysDictType findSysDictTypeByCode(String dictTypeCode) throws Exception;

}
