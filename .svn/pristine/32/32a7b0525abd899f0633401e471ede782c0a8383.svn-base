package com.myehr.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.ResultMap;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;

public interface SysDictService {
	/*根据ID获取数据*/
	public SysDictEntry findSysDictEntryById(int id) throws Exception;
	
	public List<SysDictEntry> findSysDictEntryByDictTypeId(int dictTypeId) throws Exception;
	
	public ResultMap findSysDictEntryAll(SysDictEntryExample sExample) throws Exception;
	
	public void saveSysDictEntry() throws Exception;
	
	public String updateSysDictEntry(SysDictEntry dict) throws Exception;
	
	public String deleteSysDictEntry(SysDictEntry dict) throws Exception;
	
	public String insertSysDictEntry(SysDictEntry dict) throws Exception;
	
	public ResultMap searchDictEntryList(String condition) throws Exception;
	
	public ResultMap getAllEmployee (HttpServletRequest request) throws Exception;

}
