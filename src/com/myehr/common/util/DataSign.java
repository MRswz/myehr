package com.myehr.common.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.myehr.controller.form.FormController;
import com.myehr.controller.form.parambean.RemoveDataformParams;
import com.myehr.controller.form.parambean.SaveButtonParams;

public class DataSign{  
	private static Logger logger = LoggerFactory.getLogger(FormController.class);

	 public static void main(String[] args)    
	    {    
	        System.out.println("admin字符串经过32位MD5加密结果为:"+getMD5Str("admin"));    
	    }    
	    
	    public static String getMD5Str(String str)    
	    {    
	        MessageDigest messageDigest = null;    
	        try    
	        {    
	            messageDigest = MessageDigest.getInstance("MD5");    
	            messageDigest.reset();    
	            messageDigest.update(str.getBytes("UTF-8"));    
	        } catch (NoSuchAlgorithmException e)    
	        {    
	            System.out.println("NoSuchAlgorithmException caught!");    
	            System.exit(-1);    
	        } catch (UnsupportedEncodingException e)    
	        {    
	            e.printStackTrace();    
	        }    
	    
	        byte[] byteArray = messageDigest.digest();    
	    
	        StringBuffer md5StrBuff = new StringBuffer();    
	    
	        for (int i = 0; i < byteArray.length; i++)    
	        {    
	            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)    
	                md5StrBuff.append("0").append(Integer.toHexString(0xFF & byteArray[i]));    
	            else    
	                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));    
	        }    
	        return md5StrBuff.toString().toUpperCase();    
	    }
	    
	    
	    public static String OutData(HttpServletRequest request){
	    	Map parammap=request.getParameterMap();  
			String str = "";
			String author = "";
			String b ="";
			
		    Set keSet=parammap.entrySet();  
		    Map map1 = new HashMap();
		    for(Iterator itr=keSet.iterator();itr.hasNext();){  
		        Map.Entry me=(Map.Entry)itr.next();  
		        Object ok=me.getKey();  
		        Object ov=me.getValue();  
		        String[] value=new String[1];  
		        if(ov instanceof String[]){  
		            value=(String[])ov;  
		        }else{  
		            value[0]=ov.toString();  
		        }
		        
		        map1.put(ok,value[0]);
		        
		        for(int k=0;k<value.length;k++){  
		            logger.info(ok+"="+value[k]);  
		            StringBuilder bulid = new StringBuilder();
		            	b += bulid.append(ok+"="+value[k]).toString().trim()+"&";
		            	logger.info(b);   
		        }  
		        String order = request.getParameter("order");
		        System.out.println("0000="+order);
		      }  
		    
			
			String author1 = request.getParameter("author1");
			logger.info("前端传入过来的加密后数据" + author1);
			
			
			if (author1 != null&&author1!="") {
				logger.info(author1);
				String order = request.getParameter("order");
				System.out.println("order=="+order);
				if (order != null) {
					String arr[] = order.split(",");
					str = arr[0];
					for (int i = 0; i < arr.length - 1; i++) {
						if (i == 0) {
							str += "=" + map1.get(arr[i]);
						} else {
							str += "&" + arr[i] + "=" + map1.get(arr[i]);
						}

					}
				}
				DataSign datasign = new DataSign();
				System.out.println("str="+str);
				if (!str.equals("")) {
					author = datasign.getMD5Str(str);
				} else {
					b = b.substring(0, b.indexOf("author1") - 1);
					System.out.println("b=" + b);

					author = datasign.getMD5Str(b);
				}
				logger.info("后端加密后的结果" + author);
				if (b.indexOf("aa=dd&")<0&&b.indexOf("activeTab=0&")<0&&b.indexOf("intrToId=&")<0&&b.indexOf("intrButtonId=")<0) {
					if (!author.equalsIgnoreCase(author1)) {
						
						logger.info("前后请求不一致");
						
						logger.info("跳到错误界面");
						// 访问 WEB-INF/jsp/user/login.jsp文件
						return "000";
					}
					
				}
				
			}
			return "111";
			
	    }
  public static String OutData2(HttpServletRequest request, @RequestBody SaveButtonParams params){
	  logger.info(request.getParameter("sign")+"加密前端");
		//后台参数
	  DataSign datasign = new DataSign();
				JSONObject json = JSONObject.fromObject(params);//将java对象转换为json对象
				String str = json.toString();//将json对象转换为字符串
				logger.info(str.replace("\"", ""));
				str=str.replace("\"", "").replace("\\", "");
				str = str.replace("excresult:[],", "");
				str = str.replaceAll(":", "=");
				logger.info(str+"str序列化");
				String author= datasign.getMD5Str(str);
				logger.info(author+"加密后端");
				if(!author.equalsIgnoreCase(request.getParameter("sign"))){
					logger.info("前后请求不一致");
					logger.info("跳到错误界面");
					return "000";      
				}
				return "111";
  }
  
  public static String removedata1(HttpServletRequest request, @RequestBody RemoveDataformParams params){
	  
	  logger.info(request.getParameter("sign")+"加密前端");
		//后台参数
	  DataSign datasign = new DataSign();
				JSONObject json = JSONObject.fromObject(params);//将java对象转换为json对象
				String str = json.toString();//将json对象转换为字符串
				if (params.getTabparam()==null){
					int index = str.indexOf("tabparam");
					str =  str.substring(0,index-2)+"}";
				}
				str=str.replace("\"", "").replace("\\", "");
				str = str.replace("excresult:[],", "");
				str = str.replaceAll(":", "=");
				logger.info(str+"str序列化");
				String author= datasign.getMD5Str(str);
				logger.info(author+"加密后端");
				if(!author.equalsIgnoreCase(request.getParameter("sign"))){
					logger.info("前后请求不一致");
					logger.info("跳到错误界面");
					return "000";     
				}
	return null;
	  
  }
  
  public static String UpdataFormparm(HttpServletRequest request,String sGrid1){
	  DataSign datasign = new DataSign();
	  String author= datasign.getMD5Str(sGrid1);
	  String sign = request.getParameter("sign");
		if(!author.equalsIgnoreCase(request.getParameter("sign"))){
			logger.info("前后请求不一致");			
			logger.info("跳到错误界面");
			return "2";     
		}
		return null;
  }
}  