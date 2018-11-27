package com.myehr.common.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class MyDataSource extends org.apache.commons.dbcp.BasicDataSource {

	public MyDataSource() {

		//E:/workspace/Myeclipse/.metadata/.me_tcat/webapps/myehr/WEB-INF/classes/db.properties
		//C:/MyeHR/MyeHR_MSSQL/app/myeclipse/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes/db.properties
		//C:/MyeHR/MyeHR_ORACLE/APP/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes/db.properties
		//F:/MyeHR/MyeHR_ORACLE/APP/apache-tomcat-6.0.45/webapps
		//C:/myehr_oracle/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes

		// TODO Auto-generated constructor stub
		//E:/workspace/Myeclipse/.metadata/.me_tcat/webapps/myehr/WEB-INF/classes/db.properties本机
		//C:/MyeHR/MyeHR_MSSQL/app/myeclipse/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes/db.properties109SQLSERVER
		//C:/MyeHR/MyeHR_ORACLE/APP/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes/db.properties109ORACLE
		//F:/MyeHR/MyeHR_ORACLE/APP/apache-tomcat-6.0.45/webapps
		//C:/myehr_oracle/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes139ORACLE
		//E:/myehr/Myeclipse/myeclipse/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes/
		//C:/MyeHR_MSSQL/apache-tomcat-6.0.45/webapps/myehr/WEB-INF/classes
		String path =  System.getProperty("user.dir").replace("\\", "/").replace("bin", "");
		path = path+"webapps/myehr/WEB-INF/classes/db.properties";

		String url = GetDBPropertiesValue.readValue(path,"jdbc.url");
		String driverClassName = GetDBPropertiesValue.readValue(path,"jdbc.driver");
		String username = GetDBPropertiesValue.readValue(path,"jdbc.username");
		String password = GetDBPropertiesValue.readValue(path,"jdbc.password");
		
		super.url = url;
		super.driverClassName = driverClassName;
		super.username = username;
		super.password = password;
	}

	
	@Override
	public void addConnectionProperty(String name, String value) {
		// TODO Auto-generated method stub
		super.addConnectionProperty(name, value);
	}
	@Override
	public synchronized void close() throws SQLException {
		// TODO Auto-generated method stub
		super.close();
	}
	@Override
	protected synchronized DataSource createDataSource() throws SQLException {
		// TODO Auto-generated method stub
		return super.createDataSource();
	}
	@Override
	public Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return super.getConnection();
	}
	@Override
	public Connection getConnection(String username, String password)
			throws SQLException {
		// TODO Auto-generated method stub
		return super.getConnection(username, password);
	}
	@Override
	public synchronized boolean getDefaultAutoCommit() {
		// TODO Auto-generated method stub
		return super.getDefaultAutoCommit();
	}
	@Override
	public synchronized String getDefaultCatalog() {
		// TODO Auto-generated method stub
		return super.getDefaultCatalog();
	}
	@Override
	public synchronized boolean getDefaultReadOnly() {
		// TODO Auto-generated method stub
		return super.getDefaultReadOnly();
	}
	@Override
	public synchronized int getDefaultTransactionIsolation() {
		// TODO Auto-generated method stub
		return super.getDefaultTransactionIsolation();
	}
	@Override
	public synchronized String getDriverClassName() {
		// TODO Auto-generated method stub
		return "oracle.jdbc.driver.OracleDriver";
	}
	@Override
	public synchronized int getInitialSize() {
		// TODO Auto-generated method stub
		return super.getInitialSize();
	}
	@Override
	public boolean getLogAbandoned() {
		// TODO Auto-generated method stub
		return super.getLogAbandoned();
	}
	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return super.getLogWriter();
	}
	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return super.getLoginTimeout();
	}
	@Override
	public synchronized int getMaxActive() {
		// TODO Auto-generated method stub
		return super.getMaxActive();
	}
	@Override
	public synchronized int getMaxIdle() {
		// TODO Auto-generated method stub
		return super.getMaxIdle();
	}
	@Override
	public synchronized int getMaxOpenPreparedStatements() {
		// TODO Auto-generated method stub
		return super.getMaxOpenPreparedStatements();
	}
	@Override
	public synchronized long getMaxWait() {
		// TODO Auto-generated method stub
		return super.getMaxWait();
	}
	@Override
	public synchronized long getMinEvictableIdleTimeMillis() {
		// TODO Auto-generated method stub
		return super.getMinEvictableIdleTimeMillis();
	}
	@Override
	public synchronized int getMinIdle() {
		// TODO Auto-generated method stub
		return super.getMinIdle();
	}
	@Override
	public synchronized int getNumActive() {
		// TODO Auto-generated method stub
		return super.getNumActive();
	}
	@Override
	public synchronized int getNumIdle() {
		// TODO Auto-generated method stub
		return super.getNumIdle();
	}
	@Override
	public synchronized int getNumTestsPerEvictionRun() {
		// TODO Auto-generated method stub
		return super.getNumTestsPerEvictionRun();
	}
	@Override
	public synchronized String getPassword() {
		// TODO Auto-generated method stub
		return "ehr";
	}
	@Override
	public boolean getRemoveAbandoned() {
		// TODO Auto-generated method stub
		return super.getRemoveAbandoned();
	}
	@Override
	public int getRemoveAbandonedTimeout() {
		// TODO Auto-generated method stub
		return super.getRemoveAbandonedTimeout();
	}
	@Override
	public synchronized boolean getTestOnBorrow() {
		// TODO Auto-generated method stub
		return super.getTestOnBorrow();
	}
	@Override
	public synchronized boolean getTestOnReturn() {
		// TODO Auto-generated method stub
		return super.getTestOnReturn();
	}
	@Override
	public synchronized boolean getTestWhileIdle() {
		// TODO Auto-generated method stub
		return super.getTestWhileIdle();
	}
	@Override
	public synchronized long getTimeBetweenEvictionRunsMillis() {
		// TODO Auto-generated method stub
		return super.getTimeBetweenEvictionRunsMillis();
	}
	@Override
	public synchronized String getUrl() {
		// TODO Auto-generated method stub
		return super.getUrl();
	}
	@Override
	public synchronized String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}
	@Override
	public synchronized String getValidationQuery() {
		// TODO Auto-generated method stub
		return super.getValidationQuery();
	}
	@Override
	public synchronized boolean isAccessToUnderlyingConnectionAllowed() {
		// TODO Auto-generated method stub
		return super.isAccessToUnderlyingConnectionAllowed();
	}
	@Override
	public synchronized boolean isPoolPreparedStatements() {
		// TODO Auto-generated method stub
		return super.isPoolPreparedStatements();
	}
	@Override
	public void removeConnectionProperty(String name) {
		// TODO Auto-generated method stub
		super.removeConnectionProperty(name);
	}
	@Override
	public synchronized void setAccessToUnderlyingConnectionAllowed(
			boolean allow) {
		// TODO Auto-generated method stub
		super.setAccessToUnderlyingConnectionAllowed(allow);
	}
	@Override
	public synchronized void setDefaultAutoCommit(boolean defaultAutoCommit) {
		// TODO Auto-generated method stub
		super.setDefaultAutoCommit(defaultAutoCommit);
	}
	@Override
	public synchronized void setDefaultCatalog(String defaultCatalog) {
		// TODO Auto-generated method stub
		super.setDefaultCatalog(defaultCatalog);
	}
	@Override
	public synchronized void setDefaultReadOnly(boolean defaultReadOnly) {
		// TODO Auto-generated method stub
		super.setDefaultReadOnly(defaultReadOnly);
	}
	@Override
	public synchronized void setDefaultTransactionIsolation(
			int defaultTransactionIsolation) {
		// TODO Auto-generated method stub
		super.setDefaultTransactionIsolation(defaultTransactionIsolation);
	}
	@Override
	public synchronized void setDriverClassName(String driverClassName) {
		// TODO Auto-generated method stub
		super.setDriverClassName(driverClassName);
	}
	@Override
	public synchronized void setInitialSize(int initialSize) {
		// TODO Auto-generated method stub
		super.setInitialSize(initialSize);
	}
	@Override
	public void setLogAbandoned(boolean logAbandoned) {
		// TODO Auto-generated method stub
		super.setLogAbandoned(logAbandoned);
	}
	@Override
	public void setLogWriter(PrintWriter logWriter) throws SQLException {
		// TODO Auto-generated method stub
		super.setLogWriter(logWriter);
	}
	@Override
	public void setLoginTimeout(int loginTimeout) throws SQLException {
		// TODO Auto-generated method stub
		super.setLoginTimeout(loginTimeout);
	}
	@Override
	public synchronized void setMaxActive(int maxActive) {
		// TODO Auto-generated method stub
		super.setMaxActive(maxActive);
	}
	@Override
	public synchronized void setMaxIdle(int maxIdle) {
		// TODO Auto-generated method stub
		super.setMaxIdle(maxIdle);
	}
	@Override
	public synchronized void setMaxOpenPreparedStatements(int maxOpenStatements) {
		// TODO Auto-generated method stub
		super.setMaxOpenPreparedStatements(maxOpenStatements);
	}
	@Override
	public synchronized void setMaxWait(long maxWait) {
		// TODO Auto-generated method stub
		super.setMaxWait(maxWait);
	}
	@Override
	public synchronized void setMinEvictableIdleTimeMillis(
			long minEvictableIdleTimeMillis) {
		// TODO Auto-generated method stub
		super.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
	}
	@Override
	public synchronized void setMinIdle(int minIdle) {
		// TODO Auto-generated method stub
		super.setMinIdle(minIdle);
	}
	@Override
	public synchronized void setNumTestsPerEvictionRun(
			int numTestsPerEvictionRun) {
		// TODO Auto-generated method stub
		super.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
	}
	@Override
	public synchronized void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}
	@Override
	public synchronized void setPoolPreparedStatements(boolean poolingStatements) {
		// TODO Auto-generated method stub
		super.setPoolPreparedStatements(poolingStatements);
	}
	@Override
	public void setRemoveAbandoned(boolean removeAbandoned) {
		// TODO Auto-generated method stub
		super.setRemoveAbandoned(removeAbandoned);
	}
	@Override
	public void setRemoveAbandonedTimeout(int removeAbandonedTimeout) {
		// TODO Auto-generated method stub
		super.setRemoveAbandonedTimeout(removeAbandonedTimeout);
	}
	@Override
	public synchronized void setTestOnBorrow(boolean testOnBorrow) {
		// TODO Auto-generated method stub
		super.setTestOnBorrow(testOnBorrow);
	}
	@Override
	public synchronized void setTestOnReturn(boolean testOnReturn) {
		// TODO Auto-generated method stub
		super.setTestOnReturn(testOnReturn);
	}
	@Override
	public synchronized void setTestWhileIdle(boolean testWhileIdle) {
		// TODO Auto-generated method stub
		super.setTestWhileIdle(testWhileIdle);
	}
	@Override
	public synchronized void setTimeBetweenEvictionRunsMillis(
			long timeBetweenEvictionRunsMillis) {
		// TODO Auto-generated method stub
		super.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
	}
	@Override
	public synchronized void setUrl(String url) {
		// TODO Auto-generated method stub
		super.setUrl(url);
	}
	@Override
	public synchronized void setUsername(String username) {
		// TODO Auto-generated method stub
		super.setUsername(username);
	}
	@Override
	public synchronized void setValidationQuery(String validationQuery) {
		// TODO Auto-generated method stub
		super.setValidationQuery(validationQuery);
	}
	
	public static void main(String[] args) {
		
	}
	
}
