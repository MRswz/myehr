package com.myehr.pojo.formmanage;

public class FormConstant {
	
	//应用的根据路径
	public static String appJspRootPath = "";
	
	//开发跟路径
	public static String ecpliseJspRootPath = "D:\\Users\\Administrator\\Workspaces\\MyEclipse 8.5\\myehr\\WebRoot\\jsp\\formbuld\\";
	
	
	//jsp头
	public static String JSP_START = "<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n" +
										   "<%@ include file=\"/common/common.jsp\" %>" +
										   "<html>"+getNbsp(1,true)+"<head>"+getNbsp(1,true)+"</head>"+getNbsp(2,true)+"<body>";
	
	
	
	public static String getNbsp(int len,boolean isbr){
		String r = "";
		for(int i=0; i<len; i++){
			r+= "	";
		}
		return r+(isbr==true?"\n":"");
	}
	
	/**
	 * jsp结尾
	 */
	public static String JSP_END = getNbsp(2,true)+"</body>"+getNbsp(1,true)+"</html>";
	
}
