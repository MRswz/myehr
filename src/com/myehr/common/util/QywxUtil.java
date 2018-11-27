package com.myehr.common.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Date;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.controller.app.MyX509TrustManager;
import com.myehr.pojo.sysParam.SysSystemParam;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserLoginLog;
import com.myehr.service.impl.formmanage.form.SysformconfigService;

public class QywxUtil {
	private static Logger logger = LoggerFactory.getLogger(QywxUtil.class);
	//获取access_token
	public static String getToken() {
		//发送get请求,获取access_token
		String getATurl = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=wx5cbd67e7d9956eeb&corpsecret=TAO1ahm_L4eJg2wzz3XepUhXpwQubKPn_smkZZ9u4HY";
		Map maps = (Map)JSON.parse(httpsRequest(getATurl,"GET",null));
		String access_token = (String) maps.get("access_token");
		logger.info(access_token);
		return access_token;
	}
	
	//获取access_token
	public static String getTokenx(String secret) {
		//发送get请求,获取access_token
		String getATurl = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=wx5cbd67e7d9956eeb&corpsecret="+secret;
		Map maps = (Map)JSON.parse(httpsRequest(getATurl,"GET",null));
		String access_token = (String) maps.get("access_token");
		logger.info(access_token);
		return access_token;
	}
	
	//获取用户信息
	public static Map getUserInfoWY(String token, String Code) {
		//https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token="+access_token+"&code="+code;
		String getUIurl = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token="+token+"&code="+Code;
		Map maps = (Map)JSON.parse(httpsRequest(getUIurl,"GET",null));
		String user_ticket = (String) maps.get("user_ticket");
		return maps;
	}
	//获取用户详细信息
	public static Map getUserDetailWY(String token, String user_ticket) {
		//发送POST请求,获取用户详细信息
		//https://qyapi.weixin.qq.com/cgi-bin/user/getuserdetail?access_token="+access_token;
		String getUDurl = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserdetail?access_token="+token;
		String data = "{\"user_ticket\": \""+user_ticket+"\"}";
		Map maps = (Map)JSON.parse(httpsRequest(getUDurl,"POST",data));
		return maps;
	}
	
	
	public static SysUserLoginLog login(SysformconfigService sysformconfigService,HttpSession session,SysUser user,String ipAddress,String language) throws Exception {
		SysUserLoginLog loginLog = new SysUserLoginLog();
		if (user.getEmpId()!=null) {
			SysSystemParam param = sysformconfigService.getSystemParam("EMP_ENTITY");
			if(param!=null){
				session.setAttribute("empid", new BigDecimal(user.getEmpId()));
				String sqlx = "select "+param.getSysParamRemark()+" from "+param.getSysParamValue1()+" where "+param.getSysParamValue2()+" = '"+user.getEmpId()+"'";
				Map map = MybatisUtil.queryOne("runtime.selectSql", sqlx);
				String[] columns = param.getSysParamRemark().split(",");
				int num = 0;
				if(map!=null){
					for (String column : columns) {
						String columnName = column;
						String columnValue = map.get(column)+"";
						session.setAttribute(columnName,columnValue);
						num++;
					}
				}
			}
		}
		loginLog.setLoginUserCode(user.getUserCode());
		loginLog.setLoginDate(new Date());
		loginLog.setLoginIp(ipAddress);
		loginLog.setLoginMark("0");
		session.setAttribute("ipAddress", ipAddress);
		if (user.getEmpId()!=null) {
			session.setAttribute("empid", new BigDecimal(user.getEmpId()));
		}
		SysSystemParam param = sysformconfigService.getSystemParam("SOFT_INFO");
		if(param!=null){
			session.setAttribute("softwareTitle", param.getSysParamValue1());
			session.setAttribute("softwareName", param.getSysParamValue2());
			session.setAttribute("softwareImg", param.getSysParamEntry());
		}else{
			session.setAttribute("softwareTitle", "MyeHR");
			session.setAttribute("softwareName", "高端人力资源管理软件方案");
			session.setAttribute("softwareImg", "./images/logo-2.png");
		}
		String roleIds = sysformconfigService.getRoleIdsbyUserId(user.getUserId()+"");
		session.setAttribute("ipAddress", ipAddress);
		session.setAttribute("userid", new BigDecimal(user.getUserId()));
		session.setAttribute("ROLEID", roleIds);
		session.setAttribute("userId", new BigDecimal(user.getUserId()));
		session.setAttribute("userCode", user.getUserCode());
		session.setAttribute("userName", user.getUserName());
		session.setAttribute("userPassword", user.getUserPassword());
		session.setAttribute("orgUnit", "");
		session.setAttribute("areaUnit", "");
		session.setAttribute("personUnit", "");
		session.setAttribute("payUnit", "");
		session.setAttribute("attUnit", "");
		session.setAttribute("performanceUnit","");
		session.setAttribute("projectUnit", "");
		session.setAttribute("businessLine", "");
		session.setAttribute("productName", "SqlServer");
		session.setAttribute("langType",language);
		sysformconfigService.setUserByUserid(user.getUserId()+"");//刷新当前登录用户缓存
		param = sysformconfigService.getSystemParam("WORKSPACE");
		return loginLog;
//		sysUserLoginLogMapper.insert();
	}
	
	/*
    * 处理https GET/POST请求 
    * 请求地址、请求方法、参数 
    * */  
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