package com.myehr.mapper.primaryKey;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.primaryKey.PrimaryKeyTableExpand;

public interface PrimaryKeyTableExpandMapper {
	/*根据ID获取数据*/
	List<PrimaryKeyTableExpand> searchByCondition(String condition);
	
	List<PrimaryKeyTableExpand> getPrimaryKey(Map<String,Object> map);
	
	int getPrimaryKey1(Map<String,Object> map);
	
	int getTotalEmployee(Map<String,Object> map);
	
	int getPrimaryKeyTableId(Map<String,Object> map);
	
	int getMaxIdByTablename(Map<String,Object> map);
	
	int checkTableIsNull(Map<String,Object> map);
	
	int insert(Map<String,Object> map);
	
	int update(Map<String,Object> map);
	
	String getPrimaryKeyByTableNameOracle(Map<String,Object> map);
	
	String getPrimaryKeyByTableNameSqlServer(Map<String,Object> map);
	
	String getFieldTypeByTableNameAndFieldName(Map<String,Object> map);
	
	List<Map> getFieldNamesByTableName(Map<String,Object> map);
}