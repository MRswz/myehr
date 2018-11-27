package com.myehr.controller.test;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.ecache.EhCacheTestService;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.controller.form.parambean.SaveButtonParams;

@Controller
@RequestMapping("/dockingOA")
public class DockingOAController {
	private static Logger logger = LoggerFactory.getLogger(DockingOAController.class);
	@Autowired()
	private EhCacheTestService testServiceImpl;

	@RequestMapping("/exec")
	public void test(){
		System.out.println("***********************"+testServiceImpl.getForm(1).getFormDefCode());
	}
		
	@RequestMapping("/saveTalentRecruitmentToOA")
	public @ResponseBody String[] saveTalentRecruitmentToOA(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String[] result = new String[2];
		Map param = params.getParam();
		
		String url = "http://192.101.1.196:8080/site/cmsadmin/content/oa_save.do";
		String channelId = param.get("channelId")+"";
		if (channelId.equals("社会招聘")) {
			param.put("channelId", "425");
		}
		if (channelId.equals("校园招聘")) {
			param.put("channelId", "426");
		}
		param.put("siteId", "1");
		String result1 = sendPost(url,param);
		
		if (channelId.equals("社会招聘")) {
			param.put("channelId", "509");
		}
		if (channelId.equals("校园招聘")) {
			param.put("channelId", "510");
		}
		param.put("siteId", "2");
		String result2 = sendPost(url,param);
		
		result[0] = result1;
		result[1] = result2;
		
		return result;
	}
    
    public static String sendPost(String url,Map param){
		String reCode="";
		JSONObject json = JSONObject.fromObject(param);
		DefaultHttpClient hc=new DefaultHttpClient();
		try {
			HttpPost method = new HttpPost(url);
			StringEntity entity = new StringEntity(json.toString(),"utf-8");
			entity.setContentEncoding("UTF-8");
			entity.setContentType("application/json");
			method.setEntity(entity);
			
			HttpResponse result = hc.execute(method);
			url = URLDecoder.decode(url, "UTF-8");
			if (result.getStatusLine().getStatusCode()==200) {
				String str = "";
				try {
					str = EntityUtils.toString(result.getEntity());
					reCode = str;
				} catch (Exception e) {
					// TODO: handle exception
					reCode = "推送失败";
				}
				
			}
		} catch (Exception e) {
			reCode = "推送失败";
			// TODO: handle exception
		}
		return reCode;
	}
    
    public static boolean sendShortMsg(String phone, String msg){
		boolean flag=false;
		try{	 
			HttpClient hc=new HttpClient();
			PostMethod hm=new PostMethod("http://11.23.11.10:8088/MassText/api/receivemt");
			
			hm.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET,"utf-8");
			
			NameValuePair[] data={
				new NameValuePair("user","sjck"), new NameValuePair("pwd","window123"),
				new NameValuePair("phone",phone), new NameValuePair("content",msg)			
			};
			
			hm.setRequestBody(data);
			
			int status_code=hc.executeMethod(hm);
			if(status_code == HttpStatus.SC_OK){
				flag=true;
			}
			hm.releaseConnection();
			hm.getResponseBodyAsString();
		}
		catch (Exception e)
		{
			
		}
		return flag;
	}
    
    //同步待考评人员到数仓
  	@RequestMapping("/synchronousOraclePeople")
  	public @ResponseBody List<Map> synchronousOraclePeople(HttpServletRequest request) throws Exception {
  	    String selectSql = "select * from SC_TASK";
  	    List<Map> datas = null;
		try {
			datas = MybatisUtil.queryList("runtime.selectSql", selectSql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		
		String selectClassSql = "select * from XM_FTP_LVL_CLASS";
  	    List<Map> lvlClasses = null;
		try {
			lvlClasses = MybatisUtil.queryList("runtime.selectSql", selectClassSql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		Map lvlclass = new HashMap();
		for (int i = 0; i < lvlClasses.size(); i++) {
			Map class1 = lvlClasses.get(i);
			lvlclass.put(class1.get("classname"), class1.get("classid"));
		}
  	    
  	    CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_oracle);
  	    for (int i = 0; i < datas.size(); i++) {
  	    	Map obj = datas.get(i);
  	    	String empid = obj.get("empcode")+"";
  	    	String empname = obj.get("cname")+"";
  	    	String managertype = obj.get("managertype")+"";
  	    	String managercategory = obj.get("managercategory")+"";
  	    	String classname = "";
  	    	if (!managercategory.equals("")) {
  	    		classname = managercategory.replace("客户经理","")+managertype;
			}
  	    	String classId = lvlclass.get(classname)+"";
  	    	//String notes = obj.get("empid")+"";
  	    	String isshowlvl = obj.get("calculatedresults")+"";
  	    	String confirmdeop = obj.get("averagedeposit")+"";
  	    	String confirmprofit = obj.get("comprehensive")+"";
  	    	
  	    	
  	    	String virtualtime = obj.get("virtualtime")+"";
  	    	String indates = virtualtime.substring(0, 8).replace("-", "");
  	    	String[] aa = virtualtime.split("-");
  	    	String fromDate ="";
  	    	if (aa[1].equals("01")||aa[1].equals("02")||aa[1].equals("03")) {
  	    		fromDate = (Integer.parseInt(aa[0])-1)+"1001";
			}else if (aa[1].equals("04")||aa[1].equals("05")||aa[1].equals("06")) {
				fromDate = aa[0]+"0101";
			}else if (aa[1].equals("07")||aa[1].equals("08")||aa[1].equals("09")){
				fromDate = aa[0]+"0401";
			}else {
				fromDate = aa[0]+"0701";
			}
  	    	
  	    	String jobid = obj.get("jobid")+"";
  	    	
  	    	String sql = "insert into xm_ftp_lvl_mgr_hr(empid,empname,classid,isshowlvl,confirmdeop,confirmprofit,fromdate,todate,notes) values('"+empid+"','"+empname+"','"+classId+"','"+isshowlvl+"',"+confirmdeop+","+confirmprofit+",'"+fromDate+"','99991231','"+jobid+"')";
  	  		try {
  	  			MybatisUtil.insert1("runtime.insertSql", sql);
  	  		} catch (Exception e) {
  	  			// TODO Auto-generated catch block
  	  			e.printStackTrace();logger.error(e.getMessage(),e);
  	  		}
  	  		
  	  		String sql1 = "insert into XM_EMP_SPECIAL_INFO_HR(empid,empname,indates) values('"+empid+"','"+empname+"','"+indates+"')";
	  		try {
	  			MybatisUtil.insert1("runtime.insertSql", sql1);
	  		} catch (Exception e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();logger.error(e.getMessage(),e);
	  		}
		}
  		CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_sqlserver);
  		return datas; 
  	}
    
    //数据仓库数据查询
	@RequestMapping("/queryOracleData")
	public @ResponseBody List<Map> queryOracleData(HttpServletRequest request) throws Exception {
	    String dateMonth = request.getParameter("dateMonth");
	    String[] aa = dateMonth.split("-");
	    
	    CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_oracle);
		String sql = "select * from view_ftp_hr_lvl";
		List<Map> datas = null;
		try {
			datas = MybatisUtil.queryList("runtime.selectSql", sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		String sql1 = "select * from view_ftp_hr_pol";
		List<Map> datas1 = null;
		try {
			datas1 = MybatisUtil.queryList("runtime.selectSql", sql1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		
		CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_sqlserver);
		for (int i = 0; i < datas.size(); i++) {
			Map data = datas.get(i);
			String empcode = data.get("工号")+"";
			String cname = data.get("姓名")+"";
			String assessmentperiod = data.get("考核期")+"";
			String commitment = data.get("承诺是否已完成")+"";
			String assessment = data.get("开始考核季度")+"";
			String dailyaverage = data.get("实际日均存款")+"";
			String comprehensive = data.get("实际综合创利")+"";
			String calculation = data.get("数仓测算等级")+"";
			String depositsoffset = data.get("抵补后日均存款")+"";
			String comprehensivewe = data.get("抵补后综合创利")+"";
			String sql2 = "insert into SU_CUSTOMER(empcode,cname,assessmentperiod,commitment,assessment,dailyaverage,comprehensive,calculation,depositsoffset,comprehensivewe) " +
					" values('"+empcode+"','"+cname+"','"+assessmentperiod+"','"+commitment+"','"+assessment+"',"+dailyaverage+","+comprehensive+",'"+calculation+"',"+depositsoffset+","+comprehensivewe+")";
	  		try {
	  			MybatisUtil.insert1("runtime.insertSql", sql2);
	  		} catch (Exception e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();logger.error(e.getMessage(),e);
	  		}
		}
		
		for (int i = 0; i < datas1.size(); i++) {
			Map data = datas1.get(i);
			String empcode = data.get("工号")+"";
			String cname = data.get("姓名")+"";
			String employeeloan = data.get("员工贷款")+"";
			String social = data.get("社保")+"";
			String entrepreneurial = data.get("妇女创业贴息")+"";
			String venture = data.get("青年创业")+"";
			String jinbaojin = data.get("金包金")+"";
			String femaleloan = data.get("二女贷款")+"";
			String easyloan = data.get("农易贷")+"";
			String sql2 = "insert into SU_POLICY(empcode,cname,employeeloan,social,entrepreneurial,venture,jinbaojin,femaleloan,easyloan) " +
					" values('"+empcode+"','"+cname+"',"+employeeloan+","+social+","+entrepreneurial+","+venture+","+jinbaojin+",'"+femaleloan+"',"+easyloan+")";
	  		try {
	  			MybatisUtil.insert1("runtime.insertSql", sql2);
	  		} catch (Exception e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();logger.error(e.getMessage(),e);
	  		}
		}
		return datas; 
	}
}
