package com.myehr.service.impl.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.myehr.common.app.login.tls_sigcheck;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.QywxUtil;
import com.myehr.controller.app.AppController;
import com.myehr.controller.app.MyX509TrustManager;
import com.myehr.mapper.app.im.OrgVWyMapper;
import com.myehr.pojo.app.SysWxDepartment;
import com.myehr.pojo.app.SysWxEmployee;
import com.myehr.service.app.TXIMService;
@Service("TXIMServiceImpy")
public class TXIMServiceImpy implements TXIMService {
	private static Logger logger = LoggerFactory.getLogger(AppController.class);
	String identifier = "sysadmin";
	String sdkappid = "1400113421";
	String usersig = "eJxlj11PgzAYhe-5FYTbGW0pVWPiBe4jKbJMFNzcTYO0kHcIVNp9afzvRlxiE8-t8*ScnE-HdV0vjZ-O86Lotq3h5qik5964HvLO-qBSIHhuOOnFPygPCnrJ89LIfoCYUuojZDsgZGughJOhjzoXDbSWoUXNh5nfigAhjEngY1uBaoDzaTZmyWQxD6tClOn1jKpi3DwrnS3u6Mdolj6wjITr5KBf2bZYjiZ7Vk3jx-t1875BSdvEy7Dur3LJNheyDsruBb9l0cpEu2qVQMRurUkDjTx9IvgyIAG2X*1kr6FrB8FHmGKfoJ94zpfzDcTJXss_";

	String ACCESS_TOKEN = "";//QywxUtil.getToken();
	
	@Override
	public Map friendImport(String[] frendsCode,String userCode) {
		/*{
		    "From_Account":"id",
		    "AddFriendItem":
		    [
		        {
		            "To_Account":"id1",
		            "AddSource":"AddSource_Type_XXXXXXXX"
		        }
		    ]
		}*/
		int lengths = 1000;
		if (frendsCode.length<1000) {
			lengths = frendsCode.length;
		}
		int num = lengths/200+1;
		for (int j = 0; j < num; j++) {
			String postStr = "{\"From_Account\":\""+userCode+"\",\"AddFriendItem\":[";
			for (int i = 0; i < 200; i++) {
				int num2 = j*200+i;
				if (num2<lengths) {
					if (!frendsCode[num2].equals(userCode)) {
						if (i==0) {
							postStr += "{\"To_Account\":\""+frendsCode[num2]+"\",\"AddSource\":\"AddSource_Type_Android\"}";
						} else {
							postStr += ",{\"To_Account\":\""+frendsCode[num2]+"\",\"AddSource\":\"AddSource_Type_Android\"}";
						}
					}
				}
			}
			postStr += "]}";
			String httpString = "https://console.tim.qq.com/v4/sns/friend_import?usersig="+usersig+"&identifier="+identifier+"&sdkappid="+sdkappid+"&random=99999999&contenttype=json";
			Map map = (Map)JSON.parse(ChangeCode.httpsRequest(httpString,"POST",postStr));
			System.out.println(map);
		}
		return null;
	}

	@Override
	public Map createGroupFriendImport(String GroupName, String[] frendsCode,String userCode) {
		/*{
		    "From_Account":"id",
		    "GroupName":["group1","group2","group3"],
		    "To_Account":["id1","id2","id3","id4"]
		}*/
		String postStr = "{\"From_Account\":\""+userCode+"\",\"GroupName\":[\""+GroupName+"\"],\"To_Account\":[";
		for (int i = 0; i < frendsCode.length; i++) {
			if (i==0) {
				postStr += "\""+frendsCode[i]+"\"";
			} else {
				postStr += ",\""+frendsCode[i]+"\"";
			}
		}
		postStr += "]}";
		String httpString = "https://console.tim.qq.com/v4/sns/group_add?usersig="+usersig+"&identifier="+identifier+"&sdkappid="+sdkappid+"&random=99999999&contenttype=json";
		Map map = (Map)JSON.parse(ChangeCode.httpsRequest(httpString,"POST",postStr));
		return map;
	}

	@Override
	public Map batchUpdateFrendGroupInfo(String[] frendsCode,String GroupNameNew,String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map importDatas(String[] userCode) {
		/*{
			"Accounts":["test1","test2","test3","test4","test5"]
		}*/
		int num = userCode.length/80+1;
		for (int j = 0; j < num; j++) {
			String postStr = "{\"Accounts\":[";
			for (int i = 0; i < 80; i++) {
				int num2 = j*80+i;
				if (num2<userCode.length) {
					if (i==0) {
						postStr += "\""+userCode[num2]+"\"";
					} else {
						postStr += ",\""+userCode[num2]+"\"";
					}
				}
			}
			postStr += "]}";
			String httpString = "https://console.tim.qq.com/v4/im_open_login_svc/multiaccount_import?usersig="+usersig+"&identifier="+identifier+"&sdkappid="+sdkappid+"&random=99999999&contenttype=json";
			Map map = (Map)JSON.parse(ChangeCode.httpsRequest(httpString,"POST",postStr));
			//System.out.println(map);
		}
		return null;
	}
/**
	{
	    "From_Account":"id",
	    "ProfileItem":
	    [
	        {
	            "Tag":"Tag_Profile_IM_Nick",
	            "Value":"系统管理员"
	        },{
	            "Tag":"Tag_Profile_IM_Image",
	            "Value":"http://116.62.243.28:9875/W7.jpg"
	        },
	    ]
	}
	**/
	/*@Override
	public Map updateUserInfo(String[] userCode) {
		{
			"Accounts":["test1","test2","test3","test4","test5"]
		}
		int num = userCode.length/80+1;
		for (int j = 0; j < num; j++) {
			String postStr = "{\"Accounts\":[";
			for (int i = 0; i < 80; i++) {
				int num2 = j*80+i;
				if (num2<userCode.length) {
					if (i==0) {
						postStr += "\""+userCode[num2]+"\"";
					} else {
						postStr += ",\""+userCode[num2]+"\"";
					}
				}
			}
			postStr += "]}";
			String httpString = "https://console.tim.qq.com/v4/im_open_login_svc/multiaccount_import?usersig="+usersig+"&identifier="+identifier+"&sdkappid="+sdkappid+"&random=99999999&contenttype=json";
			Map map = (Map)JSON.parse(ChangeCode.httpsRequest(httpString,"POST",postStr));
			//System.out.println(map);
		}
		return null;
	}*/

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
	    	e.printStackTrace();
	    	logger.error(e.getMessage(),e);  
	    }  
	    return buffer.toString();  
    }
	
	
	@Override
	public Object insertDepartmentWY(List<SysWxDepartment> departments) {
		String getinfo = "https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token="+ACCESS_TOKEN;
		List<Map> maps = new ArrayList<Map>();
		for (SysWxDepartment sysWxDepartment : departments) {
			String param = "{"+
						   "	\"name\":\""+sysWxDepartment.getName()+"\","+
						   "	\"parentid\":\""+sysWxDepartment.getPid()+"\","+
						   "	\"order\":\""+sysWxDepartment.getOrder()+"\","+
						   "	\"id\":\""+sysWxDepartment.getId()+"\""+
						   "}";
			Map map = (Map)JSON.parse(httpsRequest(getinfo,"POST",param));
			maps.add(map);
		}
		return maps;
	}
	
	@Override
	public Object insertEmployeeWY(List<SysWxEmployee> emps){
		String getinfo = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token="+ACCESS_TOKEN;
		List<Map> maps = new ArrayList<Map>();
		for (SysWxEmployee emp : emps) {
			String param =  "{\n"+
							"    \"userid\": \""+emp.getUserid()+"\",\n"+
							"    \"name\": \""+emp.getName()+"\",\n"+
							"    \"alias\": \""+emp.getAlias()+"\",\n"+
							"    \"mobile\": \""+emp.getMobile()+"\",\n"+
							"    \"department\": "+emp.getDepartment()+",\n"+
							"    \"order\":"+emp.getOrder()+",\n"+
							"    \"gender\": \""+emp.getGender()+"\",\n"+
							"    \"enable\":1,\n"+
							"    \"to_invite\": false\n"+
							"}";
			Map map = (Map)JSON.parse(httpsRequest(getinfo,"POST",param));
			maps.add(map);
		}
		return maps;
	}

	@Override
	public Map deleteDepartmentWY(List<SysWxDepartment> departments) {
		List<Map> maps = new ArrayList<Map>();
		
		for (SysWxDepartment sysWxDepartment : departments) {
			String getinfo = "https://qyapi.weixin.qq.com/cgi-bin/department/delete?access_token="+ACCESS_TOKEN+"&id="+sysWxDepartment.getId();
			Map map = (Map)JSON.parse(httpsRequest(getinfo,"GET",null));
			maps.add(map);
		}
		Map map = new HashMap();
		map.put("result", maps);
		return map;
	}

	@Override
	public Map updateDepartmentWY(List<SysWxDepartment> departments) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
