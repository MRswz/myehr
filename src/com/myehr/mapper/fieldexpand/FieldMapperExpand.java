package com.myehr.mapper.fieldexpand;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.field.SysField;

public interface FieldMapperExpand {
	
	List<SysField> searchByCondition(Map<String,Object> map);
	
	List<SysField> getAllField(Map<String,Object> map);
	
	int getTotalField(Map<String,Object> map);
	
	int operation3(Map<String,Object> map);
	
	int operation4(Map map);
	
	void operation(Map<String,Object> map);
	
	String operation2(Map<String,Object> map);

	List<SysField> getFieldsByEntitycode(Map<String,Object> map);
}
