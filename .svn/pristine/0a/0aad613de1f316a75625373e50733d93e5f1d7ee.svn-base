package com.myehr.common.mybatis;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *<h1>系统定制工具类</h1><br>
 *<p>
 *提供日志处理类的获取功能和httpclient通过http协议获取信息的方法
 *</p>
 */
public class DcfUtil {
	/**
	 * 获取日志处理类
	 * @param cls 要日志处理的类Class类型
	 * @return Logger 日志处理类
	 */
/*	public static Logger getLogger(Class cls) {
		return TraceLoggerFactory.getLogger(cls);
	}*/
	
	/**
	 * 获取UUID生产的唯一主键信息
	 * @return 唯一的
	 */
	public static synchronized String getPrimaryKeyUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}
	
	/*public static synchronized long getPrimaryKey(String keyName) throws Exception {
		
		
		
		return DatabaseExt.getNextSequence(keyName);
	}*/
	
	/**
	 * 转换流程操作时间字符串到日期格式的字符串（20160324133836到2016-03-24 13:38:36）
	 */
	public static String convertFlowTime(String flowTime) {
		if (flowTime != null && flowTime.length() >= 14) {
			String time = "";
			time = flowTime.substring(0, 4) + "-";
			time += flowTime.substring(4, 6) + "-";
			time += flowTime.substring(6, 8) + " ";
			time += flowTime.substring(8, 10) + ":";
			time += flowTime.substring(10, 12) + ":";
			time += flowTime.substring(12, 14);
			return time;
		} else {
			return flowTime;
		}
	}
	
/*	*//**
	 * 获取数据库连接
	 * @return
	 *//*
	public static Connection getConnection() {
		return ConnectionHelper.getCurrentContributionConnection(Constants.DATASOURCE_NAME);
	}
	
	*//**
	 * 设置表的公共字段信息
	 * @param dataObject 数据对象
	 * @param deleteMark 删除标识
	 *//*
	public static void setCommonInfo(DataObject dataObject, String deleteMark) {
		dataObject.set("operatorName", getUserId());
		dataObject.set("operatorTime", DateUtil.getCurrentDate(Constants.DATE_TIME_PATTERN));
		if(StringUtil.isNotNullAndBlank(deleteMark)) {
			dataObject.set("deleteMark", deleteMark);
			dataObject.set("deleteMarkBack", deleteMark);
		}
	}
	
	*//**
	 * 设置表的公共字段信息
	 * @param dataObject 数据对象
	 *//*
	public static void setCommonInfo(DataObject dataObject) {
		dataObject.set("operatorName", getUserId());
		dataObject.set("operatorOrgid", "");
		dataObject.set("operatorTime", DateUtil.getCurrentDate(Constants.DATE_TIME_PATTERN));
	}
	
	*//**
	 * 获取当前session的用户Id
	 * @return
	 *//*
	public static String getUserId() {
		HttpSession session = (HttpSession) getSession();
		return (String)session.getAttribute(Constants.USER_ID);
	}
	

	*//**
	 * 获取当前session的用户name
	 * @return
	 *//*
	public static String getUserName() {
		HttpSession session = (HttpSession) getSession();
		return (String)session.getAttribute(Constants.USER_NAME);
	}
	
	*//**
	 * 获取当前session的用户ip
	 * @return
	 *//*
	public static String getUserIp() {
		HttpSession session = (HttpSession) getSession();
		UserObject user = (UserObject)session.getAttribute("userObject");
		return user.getUserRemoteIP();
	}
	
	
	
	
	*//**
	 * 设置表的公共字段信息
	 * @param dataObject 数据对象
	 * @param deleteMark 删除标识
	 *//*
	public static void setCommonInfo(DataObject[] dataObjects,String deleteMark){
		if (dataObjects != null && dataObjects.length > 0) {
			for (int i = 0; i < dataObjects.length; i++) {
				setCommonInfo(dataObjects[i], deleteMark);
			}
		}
	}
	
	*//**
	 * 设置表的seq字段值
	 * @param parentSeq 上级SEQ
	 * @param currentCode 当前记录的编码
	 *//*
	public static String setSeq(String parentSeq, String currentCode) {
		if (StringUtil.isNotNullAndBlank(parentSeq)) {
			return parentSeq + "." + currentCode;
		} else {
			return "." + currentCode;
		}
	}
	
	*//**
	 * 获取字典项的名称
	 * @param dictTypeId 字典类型
	 * @param dictId 字典项ID
	 *//*
	public static String getDictEntryName(String dictTypeId, String dictId) {
		try {
			return BusinessDictUtil.getDictName(dictTypeId, dictId);
		} catch (Throwable t) {
			return dictId;
		}
	}
	
	*//**
	 * @return 当前的request对象
	 *//*
	public static ServletRequest getRequest() {
		IMapContextFactory fact = DataContextManager.current().getMapContextFactory();
		if (null == fact || fact instanceof HttpMapContextFactory == false)
			return MyHttpServlet.getRequest();

		HttpMapContextFactory http = (HttpMapContextFactory) fact;
		return ((HttpRequestMap) http.getRequestMap()).getRequest();
	}

	*//**
	 * @return 当前的response对象
	 *//*
	public static ServletResponse getResponse() {
		IMapContextFactory fact = DataContextManager.current().getMapContextFactory();
		if (null == fact || fact instanceof MyHttpServlet.MyHttpMapContextFactory == false) {
			return MyHttpServlet.getResponse();
		}

		MyHttpServlet.MyHttpMapContextFactory http = (MyHttpServlet.MyHttpMapContextFactory) fact;
		return http.getResponse();
	}

	*//**
	 * @return 当前的session对象
	 *//*
	public static HttpSession getSession() {
		IMapContextFactory fact = DataContextManager.current().getMapContextFactory();
		if (null == fact || fact instanceof HttpMapContextFactory == false)
			return MyHttpServlet.getSession();

		HttpMapContextFactory http = (HttpMapContextFactory) fact;
		HttpServletRequest req = (HttpServletRequest) ((HttpRequestMap) http.getRequestMap()).getRequest();
		return req.getSession();
	}
	
	*//**
	 * 获取数据源连接类型
	 * 
	 * @param dsName 数据源名称
	 *//*
	public static String getConnectType(String dsName) throws SQLException {
		Connection conn =  ConnectionHelper.getCurrentContributionConnection(dsName);
		try {
			String productName = conn.getMetaData().getDatabaseProductName();
			if ("Microsoft SQL Server".equals(productName)) {
				productName = "SqlServer";
			} else if ("Oracle".equals(productName)) {
				productName = "Oracle";
			}
			
			return productName;
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			throw e;
		} finally {
			closeSession(null, conn);
		}
	}
	
	*//**
	 * 关闭命名sql的DAS session和数据库连接
	 * 
	 * @param session 数据访问会话对象
	 * @param conn 数据库连接
	 *//*
	public static void closeSession(INamedSqlSession session, Connection conn) {
		if (session != null) {
			try {
				session.close();
			} catch (Exception e) {}
		}
		if (conn != null) {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (Exception e) {}
		}
	}
	
	*//**
	 * 是否打印SQl
	 *//*
	public static boolean isPrintSql() {
		String isPrintSql = ConfigurationUtil.getUserConfigSingleValue("UserDefine", "Interceptor", "IS_PRINT_SQL");
		if (StringUtil.isNullOrBlank(isPrintSql)) {
			return false;
		} else {
			return Boolean.parseBoolean(isPrintSql);
		}
	}
	
	*//**
	 * 是否记录审计日志
	 *//*
	public static boolean isAuditlog() {
		String isPrintSql = ConfigurationUtil.getUserConfigSingleValue("UserDefine", "Interceptor", "IS_AUDIT_LOG");
		if (StringUtil.isNullOrBlank(isPrintSql)) {
			return false;
		} else {
			return Boolean.parseBoolean(isPrintSql);
		}
	}
	
	*//**
	 * 表单显示是否使用预览模式
	 *//*
	public static boolean isPreviewMode() {
		String isPreviewMode = ConfigurationUtil.getUserConfigSingleValue("UserDefine", "Form", "IS_FORM_PREVIEW_MODE");
		if (StringUtil.isNullOrBlank(isPreviewMode)) {
			return true;
		} else {
			return Boolean.parseBoolean(isPreviewMode);
		}
	}
	
	*//**
	 * 获取应用的url
	 *//*
	public static String getAppUrl() {
		String appUrl = ConfigurationUtil.getUserConfigSingleValue("UserDefine", "appDefine", "URL");
		if (StringUtil.isNullOrBlank(appUrl)) {
			return "";
		} else {
			return appUrl;
		}
	}
	
	*//**
	 * 获取邮件发送url
	 *//*
	public static String getSendMailUrl(){
		return  ConfigurationUtil.getUserConfigSingleValue("UserDefine", "MailDefine", "URL");
	}
	*//**
	 * 获取邮件发送ID
	 *//*
	public static String getSendFromUserId(){
		String formUserOaId = ConfigurationUtil.getUserConfigSingleValue("UserDefine", "MailDefine", "FROMUSEROAID");
		return formUserOaId;
	}
	
	*//**
	 * 获取系统默认员工相片id
	 *//*
	public static String getFilePhotoId() {
		String filePhotoId = ConfigurationUtil.getUserConfigSingleValue("UserDefine", "File", "FILE_PHOTO_ID");
		return filePhotoId;
	}
	
	*//**
	 * 获取文件上传后的跟路径
	 *//*
	public static String getFileUploadPath() {
		String fileUploadPath = ConfigurationUtil.getUserConfigSingleValue("UserDefine", "File", "FILE_UPLOAD_PATH");
		if (StringUtil.isNullOrBlank(fileUploadPath)) {
			return "";
		} else {
			return fileUploadPath;
		}
	}
	
	public static Map<String, String> getExportExcelConfig() {
		String[] parame = new String[]{"UserDefine", "Excel", "EXPORT_EXCEL_PATH", "UserDefine", "Excel", "EXPORT_EXCEL_SUFFIX", "UserDefine", "Excel", "EXPORT_EXCEL_MAXROW"};
		DataObject excelConfig = ConfigurationUtil.getUserConfigMultiValue(parame);
		if (excelConfig != null) {
			Map<String, String> map = new HashMap<String, String>();
			String exportExcelPath = excelConfig.getString("EXPORT_EXCEL_PATH");
			if (StringUtil.isNullOrBlank(exportExcelPath)) {
				exportExcelPath = "";
			} 
			
			String exportExcelSuffix = excelConfig.getString("EXPORT_EXCEL_SUFFIX");
			if (StringUtil.isNullOrBlank(exportExcelSuffix)) {
				exportExcelSuffix = "xls";
			} 
			exportExcelSuffix = exportExcelSuffix.startsWith(".") ? exportExcelSuffix : "." + exportExcelSuffix;
			
			String exportExcelMaxRow = excelConfig.getString("EXPORT_EXCEL_MAXROW");
			
			map.put("exportExcelPath", exportExcelPath);
			map.put("exportExcelSuffix", exportExcelSuffix);
			map.put("exportExcelMaxRow", exportExcelMaxRow);
			
			return map;
		} else {
			return null;
		}
	}*/
}
