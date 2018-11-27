package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;

public class Constants implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 数据源名称
	 */
	public static final String DATASOURCE_NAME = "default";
	
	// 换行符
	public static final String NEWLINE = "\r\n";
	
	/**
	 * 日期格式 yyyy-MM-dd HH mm ss
	 */
	public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH mm ss";
	
	/**
	 * 日期格式 yyyy-MM-dd
	 */
	public static final String DATE_PATTERN = "yyyy-MM-dd";
	
	public static final String DEFAULT_PWD = "ZwsUcorZkCrsujLiL6T2vQ==";
	
	public static final String USER_ID = "userId";
	public static final String USER_CODE = "userCode";
	public static final String USER_NAME = "userName";
	
	// 页面换行
	public static final String PAGE_NEWLINE = "<br/>";
	

	public static final String MODULE_DICT="dict-config";

	public static final String GROUP_EXCEL="excel-config";

	/**
	 * EXCEL模板路径
	 */
	public static final String EXCEL_TEMPLATE_PATH="EXCEL_TEMPLATE_PATH";
	
	/**
	 * 导出EXCEL最大行数
	 */
	public static final String EXCEL_EXPORT_MAXNUM="EXPORT_EXCEL_MAXROW";
	/**
	 * 在线文档保存路径
	 */
	
}
