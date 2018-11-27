package com.myehr.mapper.sysdict;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExpand;

public interface SysDictExpandMapper {
	
	List<SysDictEntryExpand> searchByCondition(String condition);
	
	List<SysDictEntryExpand> getAllEmployee(Map<String,Object> map);
	
	int getTotalEmployee(Map<String,Object> map);
	
	SysDictEntry getSysDictEntryByCode(String dictEntry);
	
	List<SysDictEntryExpand> searchByTypeId(int dictTypeId);
	
	List<SysDictEntryExpand> searchByDeleteMark(String deleteMark);
	
}
