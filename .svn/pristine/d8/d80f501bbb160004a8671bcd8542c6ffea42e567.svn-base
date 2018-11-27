package com.myehr.common.util;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.misc.BASE64Encoder;



public class AuthorizationUtil {
	private static Logger logger = LoggerFactory.getLogger(AuthorizationUtil.class);

	static final String key = "MyeHR";
	
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		
		logger.info(EncoderByMd5("Ehr123456"));
	}
	
	
	public static String getCpuId() throws Exception{
		String cpuId = "";
		try { 
			Process process = Runtime.getRuntime().exec(  
					new String[] { "wmic", "cpu", "get", "ProcessorId" });  
			process.getOutputStream().close();  
			Scanner sc = new Scanner(process.getInputStream());  
			String property = sc.next();  
			String serial = sc.next();  
			cpuId = serial;
		} catch (IOException e) {  
			// TODO Auto-generated catch block  
			e.printStackTrace();logger.error(e.getMessage(),e);  
		}  
		return cpuId;
	}
	
	public static String getCmdId() throws Exception{
		String cpuId = "";
		try {  
			Process process = Runtime.getRuntime().exec(  
					new String[] { "wmic", "BaseBoard", "get", "Product" });  
			process.getOutputStream().close();  
			Scanner sc = new Scanner(process.getInputStream());  
			String property = sc.next();  
			String serial = sc.next();  
			cpuId = serial;
		} catch (IOException e) {  
			// TODO Auto-generated catch block  
			e.printStackTrace();logger.error(e.getMessage(),e);  
		}  
		return cpuId;
	}
	
	public static String getHdId() throws Exception{
		String cpuId = "";
		try {   
			Process process = Runtime.getRuntime().exec(  
					new String[] { "wmic", "diskdrive", "get", "SerialNumber" });  
			process.getOutputStream().close();  
			Scanner sc = new Scanner(process.getInputStream());  
			String property = sc.next();  
			String serial = sc.next();  
			cpuId = property;
		} catch (IOException e) {  
			// TODO Auto-generated catch block  
			e.printStackTrace();logger.error(e.getMessage(),e);  
		}  
		return cpuId;
	}
	
	/**利用MD5进行加密
	 * @param str  待加密的字符串
	 * @return  加密后的字符串
	 * @throws NoSuchAlgorithmException  没有这种产生消息摘要的算法
	 * @throws UnsupportedEncodingException  
	 */
	public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		//确定计算方法
		MessageDigest md5=MessageDigest.getInstance("MD5");
		BASE64Encoder base64en = new BASE64Encoder();
		//加密后的字符串
		String newstr=base64en.encode(md5.digest(str.getBytes("utf-8")));
		newstr = newstr.substring(0, newstr.length()-2);
		return newstr;
	}
	
	public static String getKeyProperties(String keyName){
//		String path =  System.getProperty("user.dir").replace("\\", "/").replace("bin", "");
//		path = path+"webapps/myehr/WEB-INF/classes/key.properties";
		String path = "E:/workspace/Myeclipse/.metadata/.me_tcat/webapps/myehr/WEB-INF/classes/key.properties";
		String keyValue = GetDBPropertiesValue.readValue(path,keyName);
		return keyValue;
	}
	
	public static String createHardwareProperties() throws IOException{
//		String path =  System.getProperty("user.dir").replace("\\", "/").replace("bin", "");
//		path = path+"webapps/myehr/WEB-INF/classes/hardware.properties";
		String path = "E:/workspace/Myeclipse/.metadata/.me_tcat/webapps/myehr/WEB-INF/classes/hardware.properties";
		File f = new File(path);
		if (f.exists()) {  
			System.out.print("文件存在");  
		} else {  
			System.out.print("文件不存在");  
			f.createNewFile();// 不存在则创建
		}
		return path;
	}
	
	public static Boolean checkStartKey() throws NoSuchAlgorithmException, UnsupportedEncodingException{
		Boolean isMachine = true;
		String cpuId;
		String cmdId;
		String hdId;
		try {
			cpuId = EncoderByMd5(getCpuId()+key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			cpuId = "0";
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		/*try {
			cmdId = EncoderByMd5(getCmdId()+key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			cmdId = "0";
			e.printStackTrace();logger.error(e.getMessage(),e);
		}*/
		/*try {
			hdId = EncoderByMd5(getHdId()+key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			hdId = "0";
			e.printStackTrace();logger.error(e.getMessage(),e);
		}*/
		String path = null ;
		try {
			path = createHardwareProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}

		/*String cpuId = EncoderByMd5(getCpuId()+key);
		String cmdId = EncoderByMd5(getCmdId()+key);
		String hdId = EncoderByMd5(getHdId()+key);
		
		GetDBPropertiesValue.writeProperties(path,"cpuId",cpuId);
		/*GetDBPropertiesValue.writeProperties(path,"cmdId",cmdId);*/
		/*GetDBPropertiesValue.writeProperties(path,"hdId",hdId);*/
		
		String machineKey = getKeyProperties("key.machine");
		if (machineKey!=null&&machineKey.equals(cpuId)) {
			isMachine = true;
		}
		return isMachine;
	}
	
	
}
