package com.myehr.controller.app.QyWY;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.myehr.common.util.QywxUtil;
import com.myehr.mapper.sysuser.SysUserLoginLogMapper;
import com.myehr.pojo.sysParam.SysSystemParam;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserLoginLog;
import com.myehr.service.app.TXIMService;
import com.myehr.service.impl.formmanage.form.SysformconfigService;

@Controller
@RequestMapping("/wy")
public class wyController {
	String access_token = "";//QywxUtil.getTokenx("2fMtEvuK0O_8oBwudmkSIyMs8bqn9abpYLHDIfwMusc");
	Map mapx = new HashMap();
	@Autowired
	private SysformconfigService sysformconfigService;
	@Autowired
	private SysUserLoginLogMapper sysUserLoginLogMapper;
	@Resource(name = "TXIMService")
	TXIMService txitservice;
	@RequestMapping("/login")
	public Map getUerInfo(HttpServletRequest request) throws Exception{
//		ModelAndView mv = null;
		Map mapx = new HashMap();
		String code = request.getParameter("code");
		String flag = mapx.get(code)+"";
		/*if (flag.equals("true")) {
			mv = new ModelAndView("redirect:/error.html");
			return mv;
		}else{
			mapx.put(code,"true");
		}*/
		HttpSession session = request.getSession();
		String token = access_token;
		Map map = QywxUtil.getUserInfoWY(token,code);
		String user_ticket = map.get("user_ticket")+"";
		Map maps = QywxUtil.getUserDetailWY(token, user_ticket);
		String userMobile = maps.get("mobile")+"";
		SysUser user = sysformconfigService.getUserByMobile(userMobile);
		SysUserLoginLog log = QywxUtil.login(sysformconfigService, session, user, "", "");
		sysUserLoginLogMapper.insert(log);
		mapx.put("result","success");
		mapx.put("username",user.getUserName());
		mapx.put("password",user.getUserPassword());
//		mv = new ModelAndView("redirect:/indexApp.html");
		return mapx;
	}
	
	@RequestMapping("/getSessionInfo")
	public @ResponseBody Map getSessionInfoByUser(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		Map map = new HashMap();
		map.put("ipAddress", session.getAttribute("ipAddress"));
		map.put("empid", session.getAttribute("empid"));
		SysSystemParam param = sysformconfigService.getSystemParam("SOFT_INFO");
		if(param!=null){
			map.put("softwareTitle", session.getAttribute("softwareTitle"));
			map.put("softwareName", session.getAttribute("softwareName"));
			map.put("softwareImg", session.getAttribute("softwareImg"));
		}else {
			map.put("softwareTitle", session.getAttribute("softwareTitle"));
			map.put("softwareName", session.getAttribute("softwareName"));
			map.put("softwareImg", session.getAttribute("softwareImg"));
		}
		map.put("userid", session.getAttribute("userid"));
		map.put("ROLEID", session.getAttribute("ROLEID"));
		map.put("userId", session.getAttribute("userId"));
		map.put("userCode", session.getAttribute("userCode"));
		map.put("userName", session.getAttribute("userName"));
		map.put("userPassword", session.getAttribute("userPassword"));
		map.put("orgUnit", session.getAttribute("orgUnit"));
		map.put("areaUnit", session.getAttribute("areaUnit"));
		map.put("personUnit", session.getAttribute("personUnit"));
		map.put("payUnit", session.getAttribute("payUnit"));
		map.put("attUnit", session.getAttribute("attUnit"));
		map.put("performanceUnit", session.getAttribute("performanceUnit"));
		map.put("projectUnit", session.getAttribute("projectUnit"));
		map.put("businessLine", session.getAttribute("businessLine"));
		map.put("productName", session.getAttribute("productName"));
		map.put("langType", session.getAttribute("langType"));
		SysSystemParam param2 = sysformconfigService.getSystemParam("EMP_ENTITY");
		String[] columns = param2.getSysParamRemark().split(",");
		for (String column : columns) {
			map.put(column, session.getAttribute(column));
		}
		return map;
	}
}
