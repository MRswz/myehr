package com.myehr.mapper.sysdict;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.dict.SysDictType;

public interface SysDictTypeExpandMapper {
	
	List<SysDictType> searchByCondition(String condition);
	
	List<SysDictType> getAllEmployee(Map<String,Object> map);
	
	int getTotalEmployee(Map<String,Object> map);
	
	List<SysDictType> searchByDeleteMark(String deleteMark);
	
	SysDictType getSysDictEntryByCode(String dictTypeCode);
}
