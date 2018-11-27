package com.myehr.service.sysdict;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.ResultMap;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import com.myehr.pojo.dict.SysDictEntryExpand;

public interface SysDictService {
	/*根据ID获取数据*/
	public SysDictEntry findSysDictEntryById(int id) throws Exception;
	
	public List<SysDictEntry> findSysDictEntryByDictTypeCode(String dictTypeCode) throws Exception;
	
	public ResultMap findSysDictEntryAll(SysDictEntryExample sExample) throws Exception;
	
	public void saveSysDictEntry() throws Exception;
	
	public String updateSysDictEntry(SysDictEntry dict) throws Exception;
	
	public String deleteSysDictEntry(SysDictEntry dict) throws Exception;
	
	public String insertSysDictEntry(SysDictEntry dict) throws Exception;
	
	public ResultMap searchDictEntryList(String condition) throws Exception;
	
	public ResultMap getAllEmployee (HttpServletRequest request) throws Exception;
	
	/*根据字典编码获取数据*/
	public SysDictEntry findSysDictEntryByCode(String dictTypeCode) throws Exception;

	List<SysDictEntryExpand> searchDictEntryListByTypeId(int dictTypeId) throws Exception;
	
	ResultMap searchByDeleteMark(String deleteMark) throws Exception;

}
