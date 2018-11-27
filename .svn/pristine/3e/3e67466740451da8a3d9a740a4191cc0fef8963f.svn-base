package com.myehr.service.primaryKey;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public interface PrimaryKeyService {
	/*根据ID获取数据*/
	
	public int getPrimaryKey(String tableName ,String columnName) throws SQLException;
	
	public int getPrimaryKey(String tableNamColumnName) throws SQLException;
	
	public int getMaxId(String tableName ,String columnName) throws SQLException;
	
	public String getFieldTypeSqlServer(String tableName ,String fieldName) throws SQLException;
	
	public String getFieldTypeOracle(String tableName ,String fieldName) throws SQLException;
	
	List<Map> getFieldNamesOracle(String tableName) throws SQLException;
	
	List<Map> getFieldNamesSqlServer(String tableName) throws SQLException;
}
