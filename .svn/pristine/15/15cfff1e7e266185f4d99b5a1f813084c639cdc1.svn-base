package com.myehr.controller.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

import com.alibaba.fastjson.JSON;
import com.myehr.common.app.login.tls_sigature;
import com.myehr.common.app.login.tls_sigature.GenTLSSignatureResult;
import com.myehr.common.app.login.tls_sigcheck;
import com.myehr.common.util.JedisFactory;
import com.myehr.common.util.SerializeUtil;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExample;
@Controller
@RequestMapping("/appLogin")
public class AppLoginController {
	private static Logger logger = LoggerFactory.getLogger(AppLoginController.class);
	@Autowired
	private SysUserMapper sMapper;
	@RequestMapping("/login")
	public @ResponseBody ModelAndView getUerInfo(HttpServletRequest request){
		Map map = new HashMap();
		String DCode = request.getParameter("DCode");
		String access_token = request.getParameter("access_token");
		//https://oapi.dingtalk.com/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE
		String getinfo = "https://oapi.dingtalk.com/user/getuserinfo?access_token="+access_token+"&code="+DCode;
		map = (Map)JSON.parse(httpsRequest(getinfo,"GET",null));
		//https://oapi.dingtalk.com/user/get?access_token=ACCESS_TOKEN&userid=zhangsan
		String userid = (String) map.get("userid");
		String getDinfo = "https://oapi.dingtalk.com/user/get?access_token="+access_token+"&userid="+userid;
		map = (Map)JSON.parse(httpsRequest(getDinfo,"GET",null));
		String mobile = (String) map.get("mobile");
		String email = (String) map.get("email");
		
		ModelAndView mv = null;
		SysUserExample example = new SysUserExample();
		example.or().andUserTalephoneEqualTo(mobile);
		List<SysUser> users = sMapper.selectByExample(example);
		if (!mobile.equals("")&&users.size()>0) {
			SysUser user = users.get(0);
			HttpSession session = request.getSession();
			session.setAttribute("userid", user.getUserId());
			session.setAttribute("userCode", user.getUserCode());
			session.setAttribute("userName", user.getUserName());
			session.setAttribute("userPassword", user.getUserPassword());
			session.setAttribute("productName", "Oracle");
			session.setAttribute("langType","ZH");
			mv = new ModelAndView("redirect:/menuApp.jsp");
			return mv;
		} else {
			logger.info("非企业用户");
			mv = new ModelAndView("../login");
			mv.addObject("reCode","-2");
			return mv;
		}
	}
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
	
	
	
public static void main(String args[]) throws Exception {
		Map map = new HashMap();
		//https://oapi.dingtalk.com/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE
		String getinfo = "http://192.168.0.161:8081/myehr/FormCopy/cardFormCopyToOther.action?formId=3377";
		byte[] sysFormInfoByte = (byte[])JSON.parse(httpsRequest(getinfo,"GET",null));
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	SysFormconfigCache formcache =(SysFormconfigCache) SerializeUtil.unserialize(sysFormInfoByte);
        /*tls_sigcheck demo = new tls_sigcheck();
        // 使用前请修改动态库的加载路径
        demo.loadJniLib("E:\\work\\下载\\TLS后台API\\20151230\\tls_sig_api-windows-64\\lib\\jni\\jnisigcheck.dll");//windows
        File priKeyFile = new File("private_key");
        StringBuilder strBuilder = new StringBuilder();
        String s = "";
        BufferedReader br = new BufferedReader(new FileReader(priKeyFile));
        while ((s = br.readLine()) != null) {
            strBuilder.append(s + '\n');
        }
        br.close();
        String priKey = strBuilder.toString();        
		int ret = demo.tls_gen_signature_ex2("1400113421", "test1", priKey);
        
        if (0 != ret) {
            logger.info("ret " + ret + " " + demo.getErrMsg());
        }
        else
        {
            logger.info("sig:\n" + demo.getSig());
        }      

        File pubKeyFile = new File("public.pem");
        br = new BufferedReader(new FileReader(pubKeyFile));
		strBuilder.setLength(0);
        while ((s = br.readLine()) != null) {
            strBuilder.append(s + '\n');
        }
        br.close();
        String pubKey = strBuilder.toString();        
		ret = demo.tls_check_signature_ex2(demo.getSig(), pubKey, "1400000267", "xiaojun");
        if (0 != ret) {
            logger.info("ret " + ret + " " + demo.getErrMsg());
        }
        else
        {
            logger.info("--\nverify ok -- expire time " + demo.getExpireTime() + " -- init time " + demo.getInitTime());
        }  */    
    }
}
