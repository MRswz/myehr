package com.myehr.common.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
  
public class Batch {
	private static Logger logger = LoggerFactory.getLogger(Batch.class);

    /** 判断数据库是否支持批处理 */
    public static boolean supportBatch(Connection con) {
        try {
            // 得到数据库的元数据
            DatabaseMetaData md = con.getMetaData();
            return md.supportsBatchUpdates();
        } catch (SQLException e) {
            e.printStackTrace();logger.error(e.getMessage(),e);
        }
        return false;
    }
  
    /** 执行一批SQL语句 */
    public static int[] goBatch(String sql) throws Exception {
    	Connection con = null;
    	con = getConnection();// 获得数据库连接
        if (sql == null) {
            return null;
        }
        Statement sm = null;
        try {
            sm = con.createStatement();
            sm.addBatch(sql);// 将所有的SQL语句添加到Statement中
            // 一次执行多条SQL语句
            return sm.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();logger.error(e.getMessage(),e);
        } finally {
            sm.close();
        }
        return null;
    }
  
    public static Connection getConnection() {// 数据库连接
    	Connection con = null;
    	String path =  System.getProperty("user.dir").replace("\\", "/").replace("bin", "");
		path = path+"webapps/myehr/WEB-INF/classes/db.properties";
    	//String path = "E:/myehr/Myeclipse/myeclipse/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes/db.properties";
    	//String path = "E:/workspace/Myeclipse/.metadata/.me_tcat/webapps/myehr/WEB-INF/classes/db.properties";
    	//String path = "E:/myehr/Myeclipse/myeclipse/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes/db.properties";
    	//String path="C:/apache-tomcat-6.0.45.xmrcb.hr/webapps/myehr/WEB-INF/classes/db.properties";

		String url = GetDBPropertiesValue.readValue(path,"jdbc.url");
		String driverClassName = GetDBPropertiesValue.readValue(path,"jdbc.driver");
		String username = GetDBPropertiesValue.readValue(path,"jdbc.username");
		String password = GetDBPropertiesValue.readValue(path,"jdbc.password");
    	try {
            Class.forName(driverClassName);// 加载数据库驱动
            con = DriverManager.getConnection(url, username, password);// 创建数据连接
        } catch (Exception e) {
            logger.info("数据库连接失败");
        }
        return con;
    }
    
    public static String getConnectionByConfigure(String jdbcDriver,String jdbcUrl,String username,String password) {// 数据库连接
        Connection con = null;
        try {
            Class.forName(jdbcDriver);// 加载数据库驱动
            con = DriverManager.getConnection(jdbcUrl, username, password);// 创建数据连接
        } catch (Exception e) {
            logger.info("数据库连接失败");
            return "error";
        }
        return "success";
    }
  
    public static void query() throws Exception {// 查询所有的数据
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from staff");
        while (rs.next()) {
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String sex = rs.getString("sex");
            String address = rs.getString("address");
            String depart = rs.getString("depart");
            String worklen = rs.getString("worklen");
            String wage = rs.getString("wage");
            logger.info(name + " " + age + " " + sex + " " + address
                    + " " + depart + " " + worklen + " " + wage);
        }
    }
    
    public static List queryBySql(String sql) throws Exception {// 查询所有的数据
        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        List list=convertList(rs);
        return list;
    }
    
    private static List convertList(ResultSet rs) throws SQLException{
    	List list = new ArrayList();
    	ResultSetMetaData md = rs.getMetaData();//获取键名
    	int columnCount = md.getColumnCount();//获取行的数量
    	while (rs.next()) {
    		Map rowData = new HashMap();//声明Map
    		for (int i = 1; i <= columnCount; i++) {
    			rowData.put(md.getColumnName(i), rs.getObject(i));//获取键名及值
    		}
    		list.add(rowData);
    		}
    	return list;
   }
    
    public static String getPrimaryKeys(String tableName) throws Exception {// 查询所有的数据
    	ResultSet rst = null;
    	Connection con = getConnection();
    	rst = con.getMetaData().getPrimaryKeys(null,null,tableName);
    	String primaryKey="";
    	try {
    		if (!rst.isAfterLast()) {
                rst.next();
                primaryKey=rst.getString("TABLE_NAME") + "." +rst.getString("COLUMN_NAME");
                logger.info(rst.getString("TABLE_NAME") + "." +rst.getString("COLUMN_NAME"));
            }
		} catch (Exception e) {
			// TODO: handle exception
		} finally{
			rst.close();
			con.close();
		}
    	
    	return primaryKey;
    }
    
    public static String getTableName(String sql){
    	Matcher matcher = null;
    	Matcher matcher1 = null;
    	matcher = Pattern.compile("(.*from\\s)(\\w*)(.*)").matcher(sql);
    	matcher1 = Pattern.compile("(.*FROM\\s)(\\w*)(.*)").matcher(sql);
        if(matcher.find()){
            return matcher.group(2);
        }else if (matcher1.find()) {
        	 return matcher1.group(2);
		}
    	return null;
    }
    
    public static String matchSql(String sql){
        Matcher matcher = null;
        //SELECT 列名称 FROM 表名称
        //SELECT * FROM 表名称
        if( sql.startsWith("select") ){
            matcher = Pattern.compile("select\\s.+from\\s(.+)where\\s(.*)").matcher(sql);
            if(matcher.find()){
                return matcher.group(1);
            }
        }
        //INSERT INTO 表名称 VALUES (值1, 值2,....)
        //INSERT INTO table_name (列1, 列2,...) VALUES (值1, 值2,....)
        if( sql.startsWith("insert") ){
            matcher = Pattern.compile("insert\\sinto\\s(.+)\\(.*\\)\\s.*").matcher(sql);
            if(matcher.find()){
                return matcher.group(1);
            }
        }
        //UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
        if( sql.startsWith("update") ){
            matcher = Pattern.compile("update\\s(.+)set\\s.*").matcher(sql);
            if(matcher.find()){
                return matcher.group(1);
            }
        }
        //DELETE FROM 表名称 WHERE 列名称 = 值
        if( sql.startsWith("delete") ){
            matcher = Pattern.compile("delete\\sfrom\\s(.+)where\\s(.*)").matcher(sql);
            if(matcher.find()){
                return matcher.group(1);
            }
        }
        return null;
    }
    
    public static void main(String[] args) throws Exception {
        //SELECT 列名称（*所有列） FROM 表名称
        //SELECT 列名称 FROM 表名称 where 条件
        String sqlString = "CALL PAY_SP_BENSTANDARDVALID([c:主键_28675],[s:userId],[s:userId],?)";
        sqlString = sqlString.replace("[s:userId]", "1");
        logger.info(sqlString);

    }
  
}