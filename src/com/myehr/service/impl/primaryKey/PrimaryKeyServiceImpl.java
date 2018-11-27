package com.myehr.service.impl.primaryKey;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.mapper.primaryKey.PrimaryKeyTableExpandMapper;
import com.myehr.pojo.primaryKey.PrimaryKeyTableExpand;
import com.myehr.service.primaryKey.PrimaryKeyService;

@Service("PrimaryKeyServiceImpl")
public class PrimaryKeyServiceImpl implements PrimaryKeyService{
	
	@Autowired
	private PrimaryKeyTableExpandMapper sMapperAdd;
	
	public int getPrimaryKey(String tableName ,String columnName) throws SQLException{
		String sql = "SELECT MAX("+columnName+") FROM " + tableName;
		Map<String, Object> maps=new HashMap<String, Object>();
        maps.put("sql", sql);
        List<PrimaryKeyTableExpand> list = sMapperAdd.getPrimaryKey(maps); //当前页显示的数据
        if (list.size() == 0) {
        	String sql1 ="select nvl(MAX(id),0) as maxid from primary_key_table";
        	maps.put("sql1", sql1);
        	int primaryKeyTableId = sMapperAdd.getPrimaryKeyTableId(maps); //当前页显示的数据
        	primaryKeyTableId+=1;
        	
        	String sql2 = "select nvl(MAX("+columnName+"),0) as max_id from "+tableName;
        	maps.put("sql2", sql2);
        	int maxTableId = sMapperAdd.getMaxIdByTablename(maps);
        	maxTableId+=1;
        	
        	String insertSql = "insert into primary_key_table values("+primaryKeyTableId+",'"+tableName+"','"+columnName+"',"+maxTableId+")";
        	maps.put("insertSql", insertSql);
        	sMapperAdd.insert(maps);
        	return maxTableId;
		}else {
			int primaryKey= sMapperAdd.getPrimaryKey1(maps);
			primaryKey+=1;
			String updateSql = "update primary_key_table  set primary_key_value ='" + primaryKey + "'where table_name='"+tableName+"'";
			maps.put("updateSql", updateSql);
			sMapperAdd.update(maps);
			
			return primaryKey;
		}
	}
	
	public int getMaxId(String tableName ,String columnName) throws SQLException{
		Map<String, Object> maps=new HashMap<String, Object>();
		String sql1 = "select count(*) from "+tableName;
//		String sql2 = "select MAX(cast("+columnName+" as int)) as max_id from "+tableName;
		String sql2 = "select cast(ident_current('"+tableName+"')as int)";
    	maps.put("sql2", sql2);
    	maps.put("sql1", sql1);
    	int countNum = sMapperAdd.checkTableIsNull(maps);
    	int nextId = 1;
    	if (countNum==0) {
		} else {
			int maxTableId = sMapperAdd.getMaxIdByTablename(maps);
	    	nextId = maxTableId+1;
		}
		return nextId;
	}
	
	public String getFieldTypeSqlServer(String tableName ,String fieldName) throws SQLException{
		Map<String, Object> maps=new HashMap<String, Object>();
		String sql2 = "select data_type from information_schema.columns where table_name = '"+tableName+"' and column_name='"+fieldName+"'";
    	maps.put("sql2", sql2);
    	String fieldType = sMapperAdd.getFieldTypeByTableNameAndFieldName(maps);
		return fieldType;
	}
	
	public String getFieldTypeOracle(String tableName ,String fieldName) throws SQLException{
		Map<String, Object> maps=new HashMap<String, Object>();
		String sql2 = "select data_type From all_tab_columns where table_name=upper('"+tableName+"') AND column_name=upper('"+fieldName+"')";
    	maps.put("sql2", sql2);
    	String fieldType = sMapperAdd.getFieldTypeByTableNameAndFieldName(maps);
		return fieldType;
	}
	
	public List<Map> getFieldNamesOracle(String tableName) throws SQLException{
		Map<String, Object> maps=new HashMap<String, Object>();
		String sql2 = "select column_name from user_tab_cols where table_name=upper('"+tableName+"')";
    	maps.put("sql2", sql2);
    	List<Map> fieldType = sMapperAdd.getFieldNamesByTableName(maps);
		return fieldType;
	}
	
	public List<Map> getFieldNamesSqlServer(String tableName) throws SQLException{
		Map<String, Object> maps=new HashMap<String, Object>();
		String sql2 = "select column_name from information_schema.columns where table_name=upper('"+tableName+"')";
    	maps.put("sql2", sql2);
    	List<Map> fieldType = sMapperAdd.getFieldNamesByTableName(maps);
		return fieldType;
	}

	@Override
	public int getPrimaryKey(String tableNamColumnName) throws SQLException {
		// TODO Auto-generated method stub
		String[] arr = tableNamColumnName.split("\\.");
		if(arr.length==2){
			return getPrimaryKey(arr[0],arr[1]);
		}
		return 0;
	}

}
