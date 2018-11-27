package com.myehr.controller.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.servlet.http.HttpServletRequest;


import org.apache.cxf.binding.corba.wsdl.Array;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.myehr.common.ecache.EhCacheTestService;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.mapper.app.grid.SysAppClassMapper;
import com.myehr.mapper.app.im.OrgVWyMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.pojo.app.AccessTokenParam;
import com.myehr.pojo.app.AppStyleAndColumn;
import com.myehr.pojo.app.SysWxDepartment;
import com.myehr.pojo.app.SysWxEmployee;
import com.myehr.pojo.app.grid.SysAppClass;
import com.myehr.pojo.app.grid.SysAppClassExample;
import com.myehr.pojo.app.im.OrgVWy;
import com.myehr.pojo.app.im.OrgVWyExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.template.SysTemplateColumn;
import com.myehr.service.app.TXIMService;

@Controller
@RequestMapping("/app")
public class AppController {
	private static Logger logger = LoggerFactory.getLogger(AppController.class);
	@Autowired SysFormColumnMapper columnMapper;
	@Autowired SysAppClassMapper appClassMapper;

	@Autowired OrgVWyMapper orgVWyMapper;
	@Resource(name = "TXIMService")
	TXIMService txitservice;
	@RequestMapping("/login")
	public @ResponseBody Object getUerInfo(HttpServletRequest request){
		/*微信端介入, @RequestBody AccessTokenParam atParam
		//data.corpid = 'wx5cbd67e7d9956eeb';
		//data.corpsecret = '2fMtEvuK0O_8oBwudmkSI-tB5ZRd2MdMUHcFHcakmx0';
		atParam.setCorpid("wx5cbd67e7d9956eeb");
		atParam.setCorpsecret("2fMtEvuK0O_8oBwudmkSIyMs8bqn9abpYLHDIfwMusc");
		//发送get请求,获取access_token
		String getATurl = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=wx5cbd67e7d9956eeb&corpsecret=2fMtEvuK0O_8oBwudmkSIyMs8bqn9abpYLHDIfwMusc";
		Map maps = (Map)JSON.parse(httpsRequest(getATurl,"GET",null));
		String access_token = (String) maps.get("access_token");
		logger.info(access_token);
		//发送GET请求,获取用户信息
		//https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token="+access_token+"&code="+code;
		String getUIurl = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token="+access_token+"&code="+atParam.getCode();
		maps = (Map)JSON.parse(httpsRequest(getUIurl,"GET",null));
		String user_ticket = (String) maps.get("user_ticket");
		logger.info(user_ticket);
		//发送POST请求,获取用户详细信息
		//https://qyapi.weixin.qq.com/cgi-bin/user/getuserdetail?access_token="+access_token;
		String getUDurl = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserdetail?access_token="+access_token;
		String data = "{\"user_ticket\": \""+user_ticket+"\"}";
		maps = (Map)JSON.parse(httpsRequest(getUIurl,"POST",data));
		logger.info(maps);
		*/
		
		/*钉钉端接入*/
		//data.corpid = 'dingb289864923d3f10035c2f4657eb6378f';
		//data.corpsecret = 'q4iWcWVf1KwECqeoXVpspDczHU32cuXzZwY0zXWO4d28e-VZt63rOqiQNwThxKui';
		//发送get请求,获取access_token
		//String code = atParam.getCode();
		//if (code!=null&&code!="") {
			String getATurl = "https://oapi.dingtalk.com/gettoken?corpid=dingb289864923d3f10035c2f4657eb6378f&corpsecret=q4iWcWVf1KwECqeoXVpspDczHU32cuXzZwY0zXWO4d28e-VZt63rOqiQNwThxKui";
			Map maps = (Map)JSON.parse(httpsRequest(getATurl,"GET",null));
			String access_token = (String) maps.get("access_token");
			logger.info(access_token);
			//发送GET请求,获取jsapi_ticket
			//https://oapi.dingtalk.com/get_jsapi_ticket?access_token=ACCESS_TOKE
			String getTKurl = "https://oapi.dingtalk.com/get_jsapi_ticket?access_token="+access_token;
			maps = (Map)JSON.parse(httpsRequest(getTKurl,"GET",null));
			String ticket = (String) maps.get("ticket");
			
			String nonceStr = "abcdefg";
            long timeStamp = System.currentTimeMillis()/1000;
            //String url = "http://192.168.1.115:8080/myehr/loginApp.jsp";//本地
            String url = "http://www.myehr.net:9876/myehr/loginApp.jsp";//120服务器
            
            String plainTex = "jsapi_ticket=" + ticket +"&noncestr=" + nonceStr +"&timestamp=" + timeStamp + "&url=" + url;
            logger.info(plainTex);
            String signature = "";
            try{
                MessageDigest crypt = MessageDigest.getInstance("SHA-1");
                crypt.reset();
                crypt.update(plainTex.getBytes("UTF-8"));
                signature = byteToHex(crypt.digest());
            }catch (Exception e){
            	logger.info(e+"");
            }
			Map map = new HashMap();
			map.put("url",url);
			map.put("nonceStr",nonceStr );
			map.put("timeStamp",timeStamp );
			map.put("corpId","dingb289864923d3f10035c2f4657eb6378f");
			map.put("signature",signature);
			map.put("jsticket",ticket);
			map.put("access_token",access_token);

	        String configValue = "{jsticket:'" + ticket + "',signature:'" + signature + "',nonceStr:'" + nonceStr + "',timeStamp:'"
	                + timeStamp + "',corpId:'dingb289864923d3f10035c2f4657eb6378f',agentid:''}";
	        logger.info(configValue);
	        return map;
			
			
            /*
			//发送GET请求,获取用户信息
			//https://oapi.dingtalk.com/user/getuserinfo?access_token="+access_token+"&code="+atParam.getCode()
			String getUIurl = "https://oapi.dingtalk.com/user/getuserinfo?access_token="+access_token+"&code="+code;
			maps = (Map)JSON.parse(httpsRequest(getUIurl,"GET",null));
			String userid = (String) maps.get("userid");
			logger.info(userid);
			//发送GET请求,获取用户详细信息
			//https://oapi.dingtalk.com/user/get?access_token="+access_token+"&userid=zhangsan"+userid;
			String getUDurl = "https://oapi.dingtalk.com/user/get?access_token="+access_token+"&userid=zhangsan"+userid;
			maps = (Map)JSON.parse(httpsRequest(getUIurl,"GET",null));
			logger.info(maps);
			return maps.get("mobile");
			*/
		//}
		//return null;
		
	}
	
	private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash){
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
	
    public static void main(String[] args) {
        //发送 POST 请求
        //if(sendPost("https://qyapi.weixin.qq.com/cgi-bin/gettoken","corpid=wx5cbd67e7d9956eeb&corpsecret=2fMtEvuK0O_8oBwudmkSI-tB5ZRd2MdMUHcFHcakmx0").equals("1")){
    	String s=httpsRequest("192.101.1.196:8080/site/cmsadmin/content/oa_save.do?channelId=406&title=bbbs&txtStr=kkkkkk&author=vvvvv&siteId=1","POST",null);  
    	Map maps = (Map)JSON.parse(s);
    	logger.info(maps.get("access_token")+"");  
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
    
    /*public static String sign(String ticket, String nonceStr, long timeStamp, String url) throws Exception {
        String plain = "jsapi_ticket=" + ticket + "&noncestr=" + nonceStr + "&timestamp=" + String.valueOf(timeStamp)
                + "&url=" + url;
        try {
            MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
            sha1.reset();
            sha1.update(plain.getBytes("UTF-8"));
            return bytesToHex(sha1.digest());
        } catch (NoSuchAlgorithmException e) {
            throw new OApiResultException(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            throw new OApiResultException(e.getMessage());
        }
    }*/
    
    //保存数据
  	@RequestMapping("/saveAppClass")
  	public @ResponseBody Object saveAppClass(HttpServletRequest request,@RequestBody AppStyleAndColumn appColumn) throws Exception{
  		SysAppClass appClassNew = appColumn.getAppClass();
  		for (SysFormColumn column : appColumn.getColumns()) {
  			SysAppClassExample example = new SysAppClassExample();
  			example.or().andFormColumnIdEqualTo(column.getFormColumnId());
  			if (appClassMapper.selectByExample(example).size()>0) {
  	  			SysAppClass appClassOld = appClassMapper.selectByExample(example).get(0);
  	  			if (appClassNew.getFontStyle()!=null&&!appClassNew.getFontStyle().equals("")) {
					if (appClassNew.getFontStyle().equals("赋空")) {
						appClassOld.setFontStyle("");
					} else {
						appClassOld.setFontStyle(appClassNew.getFontStyle());
					}
				}
	  	  		if (appClassNew.getTagStyle()!=null&&!appClassNew.getTagStyle().equals("")) {
					if (appClassNew.getTagStyle().equals("赋空")) {
						appClassOld.setTagStyle("");
					} else {
						appClassOld.setTagStyle(appClassNew.getTagStyle());
					}
				}
		  	  	if (appClassNew.getIsblod()!=null&&!appClassNew.getIsblod().equals("")) {
					if (appClassNew.getIsblod().equals("赋空")) {
						appClassOld.setIsblod("");
					} else {
						appClassOld.setIsblod(appClassNew.getIsblod());
					}
				}
		  	    if (appClassNew.getIshidden()!=null&&!appClassNew.getIshidden().equals("")) {
					if (appClassNew.getIshidden().equals("赋空")) {
						appClassOld.setIshidden("");
					} else {
						appClassOld.setIshidden(appClassNew.getIshidden());
					}
				}
		  	    appClassNew.setFormColumnId(column.getFormColumnId());
		  	    appClassMapper.updateByPrimaryKey(appClassOld);
			} else {
				if (appClassNew.getFontStyle().equals("赋空")) {
					appClassNew.setFontStyle("");
				} 
				if (appClassNew.getTagStyle().equals("赋空")) {
					appClassNew.setTagStyle("");
				} 
				if (appClassNew.getIsblod().equals("赋空")) {
					appClassNew.setIsblod("");
				} 
				if (appClassNew.getIshidden().equals("赋空")) {
					appClassNew.setIshidden("");
				} 
				appClassNew.setFormColumnId(column.getFormColumnId());
				appClassMapper.insert(appClassNew);
			}
			SysFormColumn column2 = columnMapper.selectByPrimaryKey(column.getFormColumnId());
			if (column.getFormColumnPositionSort()!=null&&!column.getFormColumnPositionSort().equals("")) {
				if (column.getFormColumnPositionSort().equals("赋空")) {
					column2.setFormColumnPositionSort(null);
				} else {
					column2.setFormColumnPositionSort(column.getFormColumnPositionSort());
				}
			}
			column2.setFormColumnPositionId(appClassMapper.selectByExample(example).get(0).getId()+"");
			columnMapper.updateByPrimaryKey(column2);
		}
  		return null;
      }
  	
  	/*
  	 * 测试插入 人员信息
  	 */
  	@RequestMapping("/insertEmployees")
	public @ResponseBody Object insertEmployee(HttpServletRequest request) throws Exception{
  		String sql = "SELECT	u.user_code as userid,	u.user_name as name,	e.ename as alias,	u.user_talephone as mobile,	o.id as department,  0 as orderx, "+
  					 "'' as positionx,	e.gender as gender,	u.user_email as email,	'' as telephone,	1 as enable "+
  					 "FROM SYS_USER u  JOIN EMPLOYEE_V_WY e ON u.EMP_ID = E.EMPID JOIN ORG_V_WY o ON o.ORGCODE = E.orgcode WHERE e.empstatus = 1";
  		List<Map> maps = MybatisUtil.queryList("runtime.selectSql", sql);
  		List<SysWxEmployee> emps = new ArrayList<SysWxEmployee>();
  		int[] rn = {6};
  		for (int i = 0; i < maps.size(); i++) {
  			SysWxEmployee emp = new SysWxEmployee();
  			String userid = maps.get(i).get("userid")+"";//,--用户id
  			String name = maps.get(i).get("name")+""  ;//,--姓名
  			String alias = maps.get(i).get("alias")+""  ;//,--别名
  			String mobile = maps.get(i).get("mobile")+""  ;//,--手机号
  			int mnum = 10000+i;
  			mobile = "192168"+mnum;
  			String department = maps.get(i).get("department")+""  ;//,--部门
  			String order = maps.get(i).get("orderx")+""  ;//,--部门内排序
  			String[] orders = department.split(",");
			order = "[";
			for (int j = 0; j < orders.length; j++) {
				if (j==0) {
					order += i+"";
				}else {
					order += ","+i;
				}
			}
			order += "]";
  			if (!department.equals("null")) {
  	  			department = getStringsBysplit(department,",");
			}else {
				continue;
			}
  			String gender = maps.get(i).get("gender")+""  ;//,--性别
  			String email = maps.get(i).get("email")+""  ;//,--邮箱
  			emp.setUserid(userid);
  			emp.setName(name);
  			emp.setAlias(alias);
  			emp.setDepartment(department);
  			emp.setEmail(email);
  			emp.setOrder(order);
  			emp.setGender(gender);
  			emp.setMobile(mobile);
  			emps.add(emp);
		}
  		return txitservice.insertEmployeeWY(emps);
  	}
  	
  	
  	/*
  	 * 分割字符串成数组格式
  	 */
  	private String getStringsBysplit(String str,String mark) {
  		String[]  departments = str.split(mark);
  		String department = "[";
		for (int j = 0; j < departments.length; j++) {
			if (j==0) {
  				department += departments[j];
			}else {
				department += ","+departments[j];
			}
		}
		department += "]";
		
		return department;
	}
  	
  	
  	/*
  	 * 测试插入 部门信息
  	 */
  	@RequestMapping("/syncDepartment")
	public @ResponseBody Object syncDepartment(HttpServletRequest request) throws Exception{
  			mapxxx = new HashMap();
  			List<OrgVWy> datas = getAllOrgs(true,"1");
			List<SysWxDepartment> departments = new ArrayList<SysWxDepartment>();
			Map xMap = new HashMap();
			for (OrgVWy map : datas) {
				try {
					xMap.put("x", map);
					SysWxDepartment dp = new SysWxDepartment();
					dp.setId(Integer.valueOf(map.getId()));
					dp.setName(map.getCname());
					if (map.getXorder()==null) {
						dp.setOrder(100);
					}else {
						dp.setOrder(map.getXorder());
					}
					dp.setPid(Integer.valueOf(map.getParentid()));
					departments.add(dp);
				} catch (Exception e) {
					logger.debug(e.getMessage());
				}
			}
			return txitservice.insertDepartmentWY(departments);
  	}
  	Map mapxxx = new HashMap();
  	private List<OrgVWy> getAllOrgs(Boolean flag,String pid) {
  		System.out.println(pid);
  		List<OrgVWy> data3x = new ArrayList<OrgVWy>();
  		if (mapxxx.get(pid)!=null) {
  			
		}else {
			mapxxx.put(pid, 0);
			Boolean xBoolean = true;
	  		if (flag) {
				OrgVWyExample example = new OrgVWyExample();
	  			example.or().andParentidEqualTo(pid);
	  			List<OrgVWy> datax = orgVWyMapper.selectByExample(example);//s0,s1,s2
	  			for (int i = 0 ;i<datax.size();i++) {
	  				OrgVWy orgVWy2 = datax.get(i);
	  				OrgVWyExample example2 = new OrgVWyExample();
	  	  			example2.or().andParentidEqualTo(orgVWy2.getId());
	  	  			List<OrgVWy> data2x = orgVWyMapper.selectByExample(example2);
	  	  			if (data2x.size()>0) {
	  	  				xBoolean = true;
	  	  				datax.addAll(getAllOrgs(xBoolean,orgVWy2.getId()));
					}
				}
				return datax;
			}
		}
  		return data3x;
  		
	}

	/*
  	 * 测试 删除 部门信息
  	 */
  	/*
  	 * 测试 同步 部门信息
  	 */
  	@RequestMapping("/deleteDepartment")
	public @ResponseBody Object deleteDepartment(HttpServletRequest request) throws Exception{
  		try {
  			String[] ids = (request.getParameter("ids")+"").split(",");
			List<SysWxDepartment> departments = new ArrayList<SysWxDepartment>();
			for (String id : ids) {
				SysWxDepartment dp = new SysWxDepartment();
				dp.setId(Integer.valueOf(id));
				departments.add(dp);
			}
			return txitservice.deleteDepartmentWY(departments);
		} catch (Exception e) {
			// TODO: handle exception
			logger.debug(e.getMessage());
		}
  		return null;
  	}
  	
	private int getIntValue(Object obj) {
		if (obj==null) {
			return 1;
		}else {
			int value = Integer.valueOf((obj+"").substring(1));
			return value;
		}
	}
}
