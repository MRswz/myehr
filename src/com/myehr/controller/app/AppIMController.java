package com.myehr.controller.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.myehr.common.app.login.tls_sigature;
import com.myehr.common.app.login.tls_sigature.GenTLSSignatureResult;
import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.mapper.app.im.SysCheckTokenMapper;
import com.myehr.mapper.app.im.SysImInformationMapper;
import com.myehr.mapper.app.im.SysImInformationRecordMapper;
import com.myehr.mapper.app.im.SysImMessageMapper;
import com.myehr.mapper.sysParam.SysSystemParamMapper;
import com.myehr.mapper.sysuser.SysUserExpandMapper;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.pojo.UserExample;
import com.myehr.pojo.act.Act;
import com.myehr.pojo.app.im.ReturnInfoMessage;
import com.myehr.pojo.app.im.SysCheckTokenExample;
import com.myehr.pojo.app.im.SysImInformation;
import com.myehr.pojo.app.im.SysImInformationRecord;
import com.myehr.pojo.app.im.SysImMessage;
import com.myehr.pojo.sysParam.SysSystemParam;
import com.myehr.pojo.sysParam.SysSystemParamExample;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExample;
import com.myehr.service.app.TXIMService;
import com.myehr.service.flow.ActTaskService;
import com.myehr.service.menu.SysMenuService;

@Controller
@RequestMapping("/login")
public class AppIMController {
	private static Logger logger = LoggerFactory.getLogger(AppIMController.class);
	@Autowired SysImMessageMapper iMapper;
	@Autowired SysUserMapper uMapper;
	@Autowired SysCheckTokenMapper checkTokenMapper;
	@Autowired SysImInformationRecordMapper recordMapper;
	@Autowired SysImInformationMapper informationMapper;
	@Autowired private SysUserExpandMapper sysUserExpandMapper;
	@Autowired private SysSystemParamMapper sParamMapper;
	@Resource(name = "TXIMService")  TXIMService txitservice;
	@Autowired 
	private SysMenuService sMService;
	@Autowired
	private ActTaskService actTaskService;
	@RequestMapping("/saveMessage")
	public @ResponseBody Object saveMessage(HttpServletRequest request){
		SysImMessage message = new SysImMessage();
//		obj.sendto = 'account110';
//		obj.sendfrom = 'account120';
//		obj.messagetext = 'account120发的一条消息';
//		obj.messagetype = 'text';
		String id = request.getParameter("id");
		String sendto = request.getParameter("sendto");
		String sendfrom = request.getParameter("sendfrom");
		String messagetext = request.getParameter("messagetext");
		String messagetype = request.getParameter("messagetype");
		String isreaded = request.getParameter("isreaded");
		String messagecontent = request.getParameter("messagecontent");
		ReturnInfoMessage infoMessage = new ReturnInfoMessage();
		if (id!=null&&!id.equals("")) {
			try {
				message = iMapper.selectByPrimaryKey(new BigDecimal(id));
				message.setIsreaded(isreaded);
				infoMessage.setMessageId(message.getId());
				iMapper.updateByPrimaryKeyWithBLOBs(message);
				infoMessage.setSaveStatus("success");
				infoMessage.setOperationType("edit");
				return infoMessage;
			} catch (Exception e) {
				// TODO: handle exception
				infoMessage.setMessageId(null);
				infoMessage.setSaveStatus("error");
				infoMessage.setOperationType("edit");
				return infoMessage;
			}
		} else {
			
			if(sendto==null){
				infoMessage.setMessageId(null);
				infoMessage.setSaveStatus("error3");
				infoMessage.setOperationType("add");
				return infoMessage;
			}
			if(sendfrom==null){
				infoMessage.setMessageId(null);
				infoMessage.setSaveStatus("error4");
				infoMessage.setOperationType("add");
				return infoMessage;
			}
			if(isreaded==null){
				infoMessage.setMessageId(null);
				infoMessage.setSaveStatus("error5");
				infoMessage.setOperationType("add");
				return infoMessage;
			}
			if(messagetext==null){
				infoMessage.setMessageId(null);
				infoMessage.setSaveStatus("error6");
				infoMessage.setOperationType("add");
				return infoMessage;
			}
			message.setIsreaded(isreaded);
			message.setMessagecontent(messagecontent);
			message.setMessagetype(messagetype);
			message.setMessagetext(messagetext);
			message.setSendto(sendto);
			message.setSendfrom(sendfrom);
			try {
				message.setSenddate(new Date());
				iMapper.insert(message);
				infoMessage.setMessageId(message.getId());
				infoMessage.setSaveStatus("success");
				infoMessage.setOperationType("add");
				return infoMessage;
			} catch (Exception e) {
				// TODO: handle exception
				infoMessage.setMessageId(null);
				infoMessage.setSaveStatus("error1");
				infoMessage.setOperationType("add");
				return infoMessage;
			}
		}
	}
	@RequestMapping("/login")
	public @ResponseBody ModelAndView IMlogin(HttpServletRequest request){
		String UserCode = request.getParameter("UserCode");
		HttpSession session = request.getSession();
		ModelAndView mv = null;
		SysUserExample example = new SysUserExample();
		example.or().andUserCodeEqualTo(UserCode);
		if (uMapper.selectByExample(example).size()>0) {
			SysUser user2 = uMapper.selectByExample(example).get(0);
			session.setAttribute("userid", new BigDecimal(user2.getUserId()));
			session.setAttribute("userCode", user2.getUserCode());
			session.setAttribute("userName", user2.getUserName());
			session.setAttribute("userPassword", user2.getUserPassword());
			session.setAttribute("orgUnit", "");
			session.setAttribute("areaUnit", "");
			session.setAttribute("personUnit", "");
			session.setAttribute("payUnit", "");
			session.setAttribute("attUnit", "");
			session.setAttribute("performanceUnit", "");
			session.setAttribute("projectUnit", "");
			session.setAttribute("businessLine", "");
			session.setAttribute("productName", "Oracle");
			session.setAttribute("langType","ch");
			mv = new ModelAndView("redirect:/menuApp.jsp?formType=APP");
		}else {
			mv = new ModelAndView("redirect:/login.jsp");
		}
		return mv;
	}
	
	@RequestMapping(value="/IMlogin", produces = "text/html;charset=UTF-8")
	public @ResponseBody String IMloginNew(HttpServletRequest request){
		String result = "";
		Map map=new HashMap();
		String userCode = request.getParameter("UserCode")+"";
		String password = request.getParameter("PassWord")+"";
		SysUser user = new SysUser();
		user.setUserCode(userCode);
		user.setUserPassword(password);
		SysUser user2 =sysUserExpandMapper.selectByUsercode(user.getUserCode());//根据人员编码查询人员信息
		if (user2!=null) {
			if (user2.getUserPassword().toUpperCase().equals(password.toUpperCase())) {
				HttpSession session = request.getSession();
				if (user2.getEmpId()!=null) {
					SysSystemParamExample example = new SysSystemParamExample();
					example.or().andSysParamCodeEqualTo("EMP_ENTITY");
					if(sParamMapper.selectByExample(example).size()>0){
						SysSystemParam param = sParamMapper.selectByExample(example).get(0);
						session.setAttribute("empid", new BigDecimal(user2.getEmpId()));
						String sqlx = "select "+param.getSysParamRemark()+" from "+param.getSysParamValue1()+" where "+param.getSysParamValue2()+" = '"+user2.getEmpId()+"'";
						Map map1 = new HashMap();
						try {
							map1 = MybatisUtil.queryOne("runtime.selectSql", sqlx);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();logger.error(e.getMessage(),e);
						}
						String[] columns = param.getSysParamRemark().split(",");
						int num = 0;
						if(map1!=null){
							for (String column : columns) {
								String columnName = column;
								String columnValue = map1.get(column)+"";
								session.setAttribute(columnName,columnValue);
								num++;
							}
						}
					}
				}
				session.setAttribute("userid", new BigDecimal(user2.getUserId()));
				session.setAttribute("userId", new BigDecimal(user2.getUserId()));
				session.setAttribute("userCode", userCode);
				session.setAttribute("userName", user2.getUserName());
				session.setAttribute("userPassword", user2.getUserPassword());
				session.setAttribute("orgUnit", "");
				session.setAttribute("areaUnit", "");
				session.setAttribute("personUnit", "");
				session.setAttribute("payUnit", "");
				session.setAttribute("attUnit", "");
				session.setAttribute("performanceUnit", "");
				session.setAttribute("projectUnit", "");
				session.setAttribute("businessLine", "");
				session.setAttribute("productName", "Oracle");
				session.setAttribute("langType","ch");
				map.put("result","success");
				map.put("data",getPrivateStr(userCode));
			} else {
				map.put("result","error");
				map.put("type","1");
				map.put("desc","密码不正确");
			}
		}else{
			map.put("result","error");
			map.put("type","0");
			map.put("desc","不存在此用户");
		}
		result= JSON.toJSONString(map);
		return result;
	}
	@RequestMapping(value="/getMenuByPcode", produces = "text/html;charset=UTF-8")
	public @ResponseBody Object queryMainframeMenuByPcode(HttpServletRequest request) throws DcfException, Exception{		
		String userId = request.getSession().getAttribute("userid")+"";
		String pCode = request.getParameter("menuCode");
		String schemeId = request.getParameter("schemeId");
		boolean isApp = true;
		return sMService.queryMainframeMenuByPcode(userId,schemeId,pCode,isApp);
	}
	@RequestMapping("/getToDoList")
	public @ResponseBody Object getToDoList(HttpServletRequest request) throws DcfException, Exception{		
		String userId = request.getSession().getAttribute("userid")+"";
		Act act = new Act();
		return actTaskService.todoList_New(act,userId,null,null,null);
	}
	
	@RequestMapping("/getOrgAndPerInfo_imLoad")
	public @ResponseBody Object getOrgAndPerInfo(HttpServletRequest request){		
		String UserCode = request.getParameter("UserCode");
		SysUserExample example = new SysUserExample();
		example.or().andUserImCodeEqualTo(UserCode);
		List<SysUser> users = uMapper.selectByExample(example);
		ReturnInfoMessage infoMessage = new ReturnInfoMessage();
		if (users.size()>0) {
			String userId = users.get(0).getUserId()+"";
			String sql = "select * from EMP_V_ORGANIZATION P where P.ID in (select ID from dbo.F_SYS_USER_ORG_EMP(1))";//"+userId+"
			try {
				List<Map> dataObject = MybatisUtil.queryList("runtime.selectSql", sql);
				return dataObject;
			} catch (Exception e) {
				// TODO: handle exception
				infoMessage.setSaveStatus("error1");
				infoMessage.setOperationType("查询异常");
				return infoMessage;
			}
		}else {
			infoMessage.setSaveStatus("error2");
			infoMessage.setOperationType("无此用户");
			return infoMessage;
		}
	}
	
		//导入用户
		public void importDatas(String userCode){
			Map map = new HashMap();
			String identifier = "sysadmin";
			String sdkappid = "1400113421";
			String usersig = "eJxlj11PgzAYhe-5FYTbGW0pVWPiBe4jKbJMFNzcTYO0kHcIVNp9afzvRlxiE8-t8*ScnE-HdV0vjZ-O86Lotq3h5qik5964HvLO-qBSIHhuOOnFPygPCnrJ89LIfoCYUuojZDsgZGughJOhjzoXDbSWoUXNh5nfigAhjEngY1uBaoDzaTZmyWQxD6tClOn1jKpi3DwrnS3u6Mdolj6wjITr5KBf2bZYjiZ7Vk3jx-t1875BSdvEy7Dur3LJNheyDsruBb9l0cpEu2qVQMRurUkDjTx9IvgyIAG2X*1kr6FrB8FHmGKfoJ94zpfzDcTJXss_";
			//https://oapi.dingtalk.com/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE
			String getinfo = "https://console.tim.qq.com/v4/im_open_login_svc/multiaccount_import?usersig="+usersig+"&identifier="+identifier+"&sdkappid="+sdkappid+"&random=99999999&contenttype=json";
			String param = "{"+
						   "	\"Accounts\":[\""+userCode+"\"]"+
						   "}";
			map = (Map)JSON.parse(httpsRequest(getinfo,"POST",param));
		}
		
		//获取私钥
		/**
		 * @param skdAppid 应用的 sdkappid
		 * @param identifier 用户 id
		 * @param privStr 私钥文件内容
		 * @param expire 有效期，以秒为单位，推荐时长一个月
		 * **/
		public GenTLSSignatureResult getPrivateStr(String userCode){
			Map map = new HashMap();
			String privStr = 	"-----BEGIN PRIVATE KEY-----\n"+
								"MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgisV6+BTmgerV8JhK"+
								"edu+Wb/BHqSSu9l3jaF7rGszqMyhRANCAAR94c7fetvwIarLJdx12pf+rS9i8H8m"+
								"Bm+Rn9np3qAUbZkswGe+c9A9KfcLyGLhDC3ZGxqZpbB+9a6v4LW3B+xM\n"+
								"-----END PRIVATE KEY-----"+
								";";
			try {
				GenTLSSignatureResult obj = tls_sigature.GenTLSSignatureEx(1400113421,userCode,privStr,100000000);
				logger.info(obj+"");
				importDatas(userCode);
				return obj;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				return null;
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
	@RequestMapping("/getWaitSendInfo")
	public @ResponseBody Object getWaitSendInfo(HttpServletRequest request){		
//		String UserCode = request.getParameter("UserCode");
		String token = request.getParameter("token");
		ReturnInfoMessage infoMessage = new ReturnInfoMessage();
		if(checkToken(token)){
//			SysUserExample example = new SysUserExample();
//			example.or().andUserImCodeEqualTo(UserCode);
//			List<SysUser> users = uMapper.selectByExample(example);
//			if (users.size()>0) {
				String sql = "SELECT * from SYS_V_IM_INFORMATION WHERE SENDSTATUS <> 0 and (COUNTTIMES < 6 or COUNTTIMES is null)";
				try {
					List<Map> dataObject = MybatisUtil.queryList("runtime.selectSql", sql);
					return dataObject;
				} catch (Exception e) {
					// TODO: handle exception
					infoMessage.setSaveStatus("error1");
					infoMessage.setOperationType("查询异常");
					return infoMessage;
				}
//			}else {
//				infoMessage.setSaveStatus("error2");
//				infoMessage.setOperationType("无此用户");
//				return infoMessage;
//			}
		}else {
			infoMessage.setSaveStatus("error3");
			infoMessage.setOperationType("token校验不通过");
			return infoMessage;
		}
	}
	@RequestMapping("/setWaitSendInfo")
	public @ResponseBody Object setWaitSendInfo(HttpServletRequest request,@RequestBody List<SysImInformationRecord> records){	
		String token = request.getParameter("token");
		ReturnInfoMessage infoMessage = new ReturnInfoMessage();
		if(checkToken(token)){
			for (SysImInformationRecord sysImInformationRecord : records) {
				SysImInformation information = informationMapper.selectByPrimaryKey(sysImInformationRecord.getId());
				information.setSendstatus(sysImInformationRecord.getSendstatus());
				information.setCounttimes(sysImInformationRecord.getCounttimes());
				informationMapper.updateByPrimaryKey(information);
				SysImInformationRecord record = new SysImInformationRecord();
				record.setCounttimes(sysImInformationRecord.getCounttimes());
				record.setIsreadtime(sysImInformationRecord.getIsreadtime());
				record.setMessagecontent(sysImInformationRecord.getMessagecontent());
				record.setMessagetitle(sysImInformationRecord.getMessagetitle());
				record.setMessagetype(sysImInformationRecord.getMessagetype());
				record.setSendfrom(sysImInformationRecord.getSendfrom());
				record.setSendstatus(sysImInformationRecord.getSendstatus());
				record.setSendto(sysImInformationRecord.getSendto());
				record.setFalsereason(sysImInformationRecord.getFalsereason());
				recordMapper.insert(record);
			}
			infoMessage.setSaveStatus("success");
			infoMessage.setOperationType("成功");
			return infoMessage;
		}else {
			infoMessage.setSaveStatus("error3");
			infoMessage.setOperationType("token校验不通过");
			return infoMessage;
		}
	}
	
	public boolean checkToken(String token) {
		SysCheckTokenExample example = new SysCheckTokenExample();
		example.or().andTokenEqualTo(token);
		if (checkTokenMapper.selectByExample(example).size()>0) {
			return true;
		} else {
			return false;
		}
	}
	
	//给指定用户导入所有用户做好友
	@RequestMapping("/importFrendAll")
	public @ResponseBody Object importFrendAll(HttpServletRequest request){
	     String sql = "DECLARE @var NVARCHAR(max) SET @var='' SELECT @var=@var+','+CAST(user_code AS NVARCHAR(100)) FROM	sys_user u join EMP_EMPLOYEE e on u.emp_id = e.empid WHERE	emp_id IS NOT NULL   SET @var=STUFF(@var,1,1,'') SELECT @var as frendsCode";
	     Map map = new HashMap();
			try {
				map = MybatisUtil.queryOne("runtime.selectSql",sql);
				String[] frendsCode = (map.get("frendsCode")+"").split(",");
			    String userCode = request.getParameter("userCode");
			    logger.info(map+"");
			    Map map2 = txitservice.friendImport(frendsCode, userCode);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
	     
	     return null;
	}
	//根据部门建组,并分配好友,针对指定用户
	@RequestMapping("/initGroupInfoAll")
	public @ResponseBody Object initGroupInfoAll(HttpServletRequest request){
	    String sql = "SELECT	e.depid as depid,	d.cname as groupName FROM 	sys_user u JOIN emp_employee e ON u.emp_id = e.empid JOIN ORG_DEPARTMENT d ON e.depid = d.depid WHERE	u.emp_id IS NOT NULL GROUP BY	e.depid,	d.cname";
		try {
			List<Map> maps = MybatisUtil.queryList("runtime.selectSql",sql);
			String userCode = request.getParameter("userCode");
			for (Map map : maps) {
				String depId = map.get("depid")+"";
				String sql2 = "DECLARE @var NVARCHAR (max) SET @var = '' SELECT	@var =@var + ',' + CAST (user_code AS NVARCHAR(100))FROM	sys_user u join EMP_EMPLOYEE e on u.emp_id = e.empid WHERE	emp_id IS NOT NULL and e.depid = "+depId+" SET @var = STUFF(@var, 1, 1, '') SELECT	@var AS frendsCode";
				Map map2 = MybatisUtil.queryOne("runtime.selectSql",sql2);
				String[] frendsCode = (map2.get("frendsCode")+"").split(",");
				Map map3 = txitservice.createGroupFriendImport(map.get("groupName")+"", frendsCode, userCode);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
	    return null;
	}
	//将所有用户导入腾讯云
	@RequestMapping("/importAllUserToIM")
	public @ResponseBody Object importAllUserToIM(HttpServletRequest request){
	   /* try {
			String sql2 = "DECLARE @var NVARCHAR (max) SET @var = '' SELECT	@var =@var + ',' + CAST (user_code AS NVARCHAR(100))FROM	sys_user u join EMP_EMPLOYEE e on u.emp_id = e.empid WHERE	emp_id IS NOT NULL  SET @var = STUFF(@var, 1, 1, '') SELECT	@var AS frendsCode";
			Map map2 = MybatisUtil.queryOne("runtime.selectSql",sql2);
			String[] frendsCode = (map2.get("frendsCode")+"").split(",");
			Map map3 = txitservice.importDatas(frendsCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
	    return null;*/
		String postStr = "{"+
				 "   \"From_Account\":\"sysadmin\","+
				 "   \"ProfileItem\":"+
				 "   ["+
				 "       {"+
				 "           \"Tag\":\"Tag_Profile_IM_Nick\","+
				 "           \"Value\":\"系统管理员xxx\""+
				 "       },{"+
				 "           \"Tag\":\"Tag_Profile_IM_Image\","+
				 "           \"Value\":\"http://116.62.243.28:9875/W7.jpg\""+
				 "       }"+
				 "   ]"+
				 "}";
		String identifier = "sysadmin";
		String sdkappid = "1400113421";
		String usersig = "eJxlj11PgzAYhe-5FYTbGW0pVWPiBe4jKbJMFNzcTYO0kHcIVNp9afzvRlxiE8-t8*ScnE-HdV0vjZ-O86Lotq3h5qik5964HvLO-qBSIHhuOOnFPygPCnrJ89LIfoCYUuojZDsgZGughJOhjzoXDbSWoUXNh5nfigAhjEngY1uBaoDzaTZmyWQxD6tClOn1jKpi3DwrnS3u6Mdolj6wjITr5KBf2bZYjiZ7Vk3jx-t1875BSdvEy7Dur3LJNheyDsruBb9l0cpEu2qVQMRurUkDjTx9IvgyIAG2X*1kr6FrB8FHmGKfoJ94zpfzDcTJXss_";
		
		String httpString = "https://console.tim.qq.com/v4/profile/portrait_set?usersig="+usersig+"&identifier="+identifier+"&sdkappid="+sdkappid+"&random=99999999&contenttype=json";
		Map map = (Map)JSON.parse(ChangeCode.httpsRequest(httpString,"POST",postStr));
		return null;
	}
}
