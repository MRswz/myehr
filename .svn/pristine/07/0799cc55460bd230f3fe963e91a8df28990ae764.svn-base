package com.myehr.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.regex.Pattern;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.controller.app.MyX509TrustManager;

public class ChangeCode {
	private static Logger logger = LoggerFactory.getLogger(ChangeCode.class);

	//表名_字段名-->字段名
	public static String getRealCode(String pkname) {
		String[] pknames = pkname.split("_");
		String pknString = "";
		for (int i = 1; i < pknames.length; i++) {
			if (i==1) {
				pknString = pknString+pknames[i];
			} else {
				pknString = pknString+"_"+pknames[i];
			}
		}
		return pknString;
	}
	
	/**
	 * 判断是否为数字
	 * @param str
	 * @return
	 */
	 public static boolean isInteger(String str) {  
	        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");  
	        return pattern.matcher(str).matches();  
	  }
	
	//字段名-->表名_字段名
	public static String getUniqueCode(String entityCode,String fieldCode) {
		
		String pknString = entityCode.replace("_", "")+"_"+fieldCode;
		return pknString;
	}
	/*
	//表名_字段名-->字段名
	public static String getRealCode(String pkname) {
		return pkname;
	}
	
	//字段名-->表名_字段名
	public static String getUniqueCode(String entityCode,String fieldCode) {
		return fieldCode;
	}*/
	
	public static String httpsRequest(String requestUrl,String requestMethod,String outputStr){  
	    StringBuffer buffer=null;  
	    try{  
		    //创建SSLContext  
		    SSLContext sslContext=SSLContext.getInstance("SSL");  
		    TrustManager[] tm={new MyX509TrustManager()};  
		    //初始化  
		    sslContext.init(null, tm, new java.security.SecureRandom());;  
		    //获取SSLSocketFactory对象  
		    SSLSocketFactory ssf=sslContext.getSocketFactory();  
		    URL url=new URL(requestUrl);  
		    HttpsURLConnection conn=(HttpsURLConnection)url.openConnection();  
		    conn.setDoOutput(true);  
		    conn.setDoInput(true);  
		    conn.setUseCaches(false);  
		    conn.setRequestMethod(requestMethod);  
		    //设置当前实例使用的SSLSoctetFactory  
		    conn.setSSLSocketFactory(ssf);  
		    conn.connect();  
		    //往服务器端写内容  
		    if(null!=outputStr){  
		    OutputStream os=conn.getOutputStream();  
		    os.write(outputStr.getBytes("utf-8"));  
		    os.close();  
		    }  
		    //读取服务器端返回的内容  
		    InputStream is=conn.getInputStream();  
		    InputStreamReader isr=new InputStreamReader(is,"utf-8");  
		    BufferedReader br=new BufferedReader(isr);  
		    buffer=new StringBuffer();  
		    String line=null;  
		    while((line=br.readLine())!=null){  
		    buffer.append(line);  
		    }  
	    }catch(Exception e){  
	    	e.printStackTrace();logger.error(e.getMessage(),e);  
	    }  
	    return buffer.toString();  
    }
}
