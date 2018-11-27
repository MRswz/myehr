package com.myehr.common.util;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * 
 * @author Administrator 
 * 
 */ 
public class MyEhrJDBCUtil {
	private static Logger logger = LoggerFactory.getLogger(MyEhrJDBCUtil.class);
	public static void main(String[] args) {
		String psql = "ask_for_leave.back_years(391,?,?)";
		execPrepare(null,psql);
	}
	
	/**
	 * @param conn
	 * @param prepareSql
	 * @return
	 */
	public static String[] execPrepare(Connection conn,String prepareSql) {
		String[] result = new String[2];
		CallableStatement statement = null;
	  //  String strUrl = "jdbc:oracle:thin:@166.3.96.9:1521:ciitehr";
		    
	    try { 
			statement=conn.prepareCall("{"+prepareSql+"}");  
			statement.registerOutParameter(1, java.sql.Types.VARCHAR);  
			//statement.registerOutParameter(2, Types.VARCHAR);  
			statement.execute();
			String str1 = statement.getString(1);
			//String str2 = statement.getString(2);
			logger.info("param1:"+str1);
			if(str1==null || str1.equals("")){
				str1="0";
			}
			//logger.info("param2:"+str2);
			result[0] = str1;
			result[1] = "执行成功";
		}
		catch (Exception e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
			result[0] = "error";
			logger.info(e.getMessage());
			result[1] = prepareSql+"执行错误！错误原因："+e.getMessage();
		}
		finally{
			try {
				if(statement!=null){  
					  statement.close();
					  statement = null;
				}
			} catch (Exception e) {
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
		}
		return result;
	}
	
	/**
	 * @param containerParam
	 * @param excSql
	 * @return
	 */
	public static String repleaceContainerParam(Map<String, String> containerParam,String excSql) {
	
		String rgex = "\\[co:(.*?)\\]";
		List<String> fields = DealStrSub.getSubUtil(excSql, rgex);
		for (int i = 0; i < fields.size(); i++) {
			String field = fields.get(i);
			String value = containerParam.get(field);
			if (value==null) {
				value="";
			}
			String oldChar = "[co:"+field+"]";
			excSql = excSql.replace(oldChar, value);
		}
		
		return excSql;
	}
	
	public static String execPrepareStr(Connection conn, String prepareSql) {
		String[] result = MyEhrJDBCUtil.execPrepare(conn, prepareSql);
		if (!"000000".equals(result[0])) {
			// 取零时表数据
			return null;

		} else {
			return result[1];
		}
	}
	
	/**
	 * @param conn带返回结果集的存储过程
	 * 此函数只针对oracle有效
	 * @param prepareSql
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<Map> execPrepareList(Connection conn,String prepareSql) {
		String[] result =MyEhrJDBCUtil.execPrepare(conn, prepareSql);
		Statement statement = null;
		ResultSet rs  = null;
		List<Map> objs = new ArrayList<Map>();
		if(!"000000".equals(result[0])){
			//取零时表数据
			return null;
			
		}
		String sql = "select * from "+result[1];
		
	    try {  
			statement=conn.createStatement();  
			rs = statement.executeQuery(sql);
			while(rs.next()){
				Map temp = new HashMap();
				ResultSetMetaData   resultMetaData = rs.getMetaData();
				int   count = resultMetaData.getColumnCount(); //获取字段个数
				for(int j=1; j<=count; j++){
					String name = resultMetaData.getColumnName(j);
					//int ctype = resultMetaData.getColumnType(j);
					 switch (resultMetaData.getColumnType(j))                     //translate the column of table type to java type then write to vector  
	                 {
	                 case Types.VARCHAR:
	                	 temp.put(name,rs.getString(resultMetaData.getColumnName(j)));
	                   break;
	                 case Types.INTEGER:
	                	 temp.put(name,new Integer(rs.getInt(resultMetaData.getColumnName(j))));
	                   break;
	                 case Types.TIMESTAMP:
	                	 temp.put(name,rs.getDate(resultMetaData.getColumnName(j)));
	                   break;
	                 case Types.DOUBLE:
	                	 temp.put(name,rs.getDouble(resultMetaData.getColumnName(j)));
	                   break;
	                 case Types.FLOAT:
	                	 temp.put(name,rs.getFloat(resultMetaData.getColumnName(j)));
	                   break;
	                 case Types.NUMERIC:
	                	 temp.put(name,rs.getBigDecimal(resultMetaData.getColumnName(j)));
	                   break;
	                 case Types.CLOB:
	                	 //temp.set(name,rs.getBlob(resultMetaData.getColumnName(j)));
	                     break;
	                 default:
	                     temp.put(name,"error");
	                 }
					
				}
				objs.add(temp);
				 
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		finally{
			try {
				if(rs!=null){
					rs.close();
					rs = null;
				}
				if(statement!=null){  
					statement.close();
					statement = null;
				}  
				if(conn!=null){  
				    conn.close(); 
				    conn = null;
				}  
			} catch (Exception e) {
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
		}
		return objs;
	}
	
}
