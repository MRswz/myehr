package com.myehr.controller.sysuser;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletRequestEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.MySessionContext;
import com.myehr.common.util.ResultMap;
import com.myehr.common.util.ResultMapNew;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.sysmenu.UserDatas;
import com.myehr.mapper.sysuser.ApproveAccreditMapper;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.pojo.sysuser.ApproveAccredit;
import com.myehr.pojo.sysuser.ApproveAccreditExample;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExample;
import com.myehr.pojo.sysuser.SysUserSelect;
import com.myehr.service.field.FieldService;
import com.myehr.service.impl.field.FieldServiceImpl;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.impl.sysuser.SysUserServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.service.sysuser.SysUserService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/SysUserList")
public class SysUserListController {
	private static Logger logger = LoggerFactory.getLogger(SysUserListController.class);
//	@Autowired
	@Resource(name = "SysUserService")
	private SysUserService serviceImpl;
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	@Autowired
	private SysUserMapper mapper;
	
	@Autowired
	private ApproveAccreditMapper approveAccreditMapper;
//	@Autowired
	@Resource(name = "FieldService")
	FieldService fServiceImpl;
	
//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;

	
	@RequestMapping("/updateSysUser")
	public @ResponseBody Object updateSysUser(HttpServletRequest request) throws Exception{
		SysUser user = (SysUser) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUser.class);  
        String reCode = serviceImpl.updateSysUser(user);
        return reCode;
    }
	
	@RequestMapping("/deleteSysUser")
	public @ResponseBody Object deleteSysUser(HttpServletRequest request) throws Exception{
		SysUser user = (SysUser) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUser.class);  
        String reCode = serviceImpl.deleteSysUser(user);
        return reCode;
    }
	
	@RequestMapping("/insertSysUser")
	public @ResponseBody Object insertSysUser(HttpServletRequest request) throws Exception{
		SysUser user = (SysUser) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUser.class); 
		user.setUserId(keyserviceImpl.getPrimaryKey("sys_user", "USER_ID"));
		user.setDeleteMark("N");
        String reCode = serviceImpl.insertSysUser(user);
        return reCode;
    }
	
	@RequestMapping("/recoverSysUser")
	public @ResponseBody Object recoverSysUser(HttpServletRequest request) throws Exception{
		SysUser user = (SysUser) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUser.class); 
		user.setDeleteMark("N");
		String reCode = serviceImpl.updateSysUser(user);
		return reCode;
	}
	
	//初始化
	@RequestMapping("/initializeSysUser")
	public @ResponseBody Object initializeSysUser(HttpServletRequest request) throws Exception{
		SysUser user = (SysUser) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUser.class); 
		user.setUserPassword("000000");
		String reCode = serviceImpl.updateSysUser(user);
		return reCode;
	}

	//模糊查询   吴涛封装的查询方法   页面封装 condition对象
	@RequestMapping("/searchSysUserList")
	public @ResponseBody ResultMap searchSysUserList(HttpServletRequest request) throws Exception{
		try {
			return serviceImpl.searchUserList(request);
		} catch (Exception e) {
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		return null;
	}
	
	//查询  条件查询
		@RequestMapping("/findSysUserById")
		public @ResponseBody SysUser findSysUserById(HttpServletRequest request) throws Exception{
			SysUser user = (SysUser) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUser.class);  
			int id=user.getUserId().intValue();
			SysUser sysUser=serviceImpl.findSysUserById(id);
			return sysUser;
		}
	
		
		// 条件  查询
		@RequestMapping("/findSysUser")
		public @ResponseBody ResultMap findSysUser(HttpServletRequest request) throws Exception{
			SysUserSelect sysSelect=(SysUserSelect) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUserSelect.class);
			try {  
				ResultMap r = new ResultMap();
				r=serviceImpl.findSysUser(sysSelect);
	            return r;  
	        } catch (Exception e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        }  
	        return null; 
		}
		
		//模糊查询
		@RequestMapping("/search")
		public @ResponseBody Object search(HttpServletRequest request) throws Exception{
			SysUser user = (SysUser) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUser.class);  
			
			SysUserExample example= new SysUserExample();
	 	   com.myehr.pojo.sysuser.SysUserExample.Criteria criteria = example.createCriteria();
	 	   criteria.andUserCodeEqualTo(user.getUserCode());
	 	   Object data= mapper.selectByExample(example);
			return  data;
			
		}
		
		/**
		 * 查询授权用户列表
		 * @param request
		 * @param params
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryAuthorizerUserList")
		public @ResponseBody ResultMapNew queryAuthorizerUserList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
			Map requestParam = params.getRequestParam();
			Map paramsMap = params.getParamsMap();
			Map filter = params.getFilter();
			String offset = params.getOffset();
			String limit = params.getLimit();
			//Map paramsMap = params.getParamsMap();
			Pager page = params.getPage();
			page = new Pager();
			if(offset==null&&limit==null){
				
			}else {
				int start=Integer.parseInt(offset);
				page.setStart(start); //不能设置为0
				page.setLimt(Integer.parseInt(limit));
			}
			
			String userId = (String) paramsMap.get("userId");
			
			ResultMapNew resultMap = new ResultMapNew();
			String sql = "select sys_user.user_id as userId, " +
					" sys_user.user_code as userCode, " +
					" sys_user.user_name as userName from sys_user left join approve_accredit on sys_user.USER_ID = approve_accredit.authorizer_user_id where approve_accredit.approve_user_id = "+userId;
			List<Map> filters = tMapperExt.queryByFormDefSql(sql);
			
			resultMap.setRows(filters);
			resultMap.setTotal(filters.size());
			
			return resultMap;
		}
		
		/**
		 * 查询所有用户列表
		 * @param request
		 * @param params
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryAllUserList")
		public @ResponseBody ResultMapNew queryAllUserList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
			Map requestParam = params.getRequestParam();
			Map paramsMap = params.getParamsMap();
			Map filter = params.getFilter();
			String offset = params.getOffset();
			String limit = params.getLimit();
			String filterValue = (String) filter.get("searchValue"); 
			//Map paramsMap = params.getParamsMap();
			Pager page = params.getPage();
			page = new Pager();
			if(offset==null&&limit==null){
				
			}else {
				int start=Integer.parseInt(offset);
				page.setStart(start); //不能设置为0
				page.setLimt(Integer.parseInt(limit));
			}
			int num = page.getStart();
			String userId = (String) paramsMap.get("userId");
		
			ResultMapNew resultMap = new ResultMapNew();
			String sql = "select top "+page.getLimt()+" o.user_id as userId, "
					+" o.user_code as userCode, "
					+" o.user_name as userName "
					+" from sys_user o where user_id not in (select top "+num+" o.user_id as userId from sys_user o) and (o.user_code like '%"+filterValue+"%' or o.user_name like '%"+filterValue+"%')";
			List<Map> filters = tMapperExt.queryByFormDefSql(sql);
			
			String sql1 = "select sys_user.user_id from sys_user";
			List<Map> allUsers = tMapperExt.queryByFormDefSql(sql1);
			
			resultMap.setRows(filters);
			resultMap.setTotal(allUsers.size());
			
			return resultMap;
		}
		
		/**
		 * 保存方案用户
		 * @param request
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/saveAuthorizerUserByUserId")
		public @ResponseBody String saveAuthorizerUserByUserId(HttpServletRequest request,@RequestBody UserDatas params) throws Exception{
			long userId = params.getSchemeId();
			
			List<Map> users= params.getSelectUsers();
			String userIds = "";
			for (int i = 0; i < users.size(); i++) {
				Map user = users.get(i);
				Integer authorizerId = (Integer) user.get("userId");
				ApproveAccreditExample example1 = new ApproveAccreditExample();
				com.myehr.pojo.sysuser.ApproveAccreditExample.Criteria criteria = example1.createCriteria();
				criteria.andApproveUserIdEqualTo(Long.valueOf(userId));
				criteria.andAuthorizerUserIdEqualTo(Long.valueOf(authorizerId));
				List<ApproveAccredit> approveAccredits = approveAccreditMapper.selectByExample(example1);
				if (approveAccredits.size()>0) {
					continue;
				}else {
					ApproveAccredit approveAccredit = new ApproveAccredit();
					approveAccredit.setApproveUserId(userId);
					approveAccredit.setAuthorizerUserId(Long.valueOf(authorizerId));
					approveAccredit.setAuthorizationTime(new Date());
					approveAccreditMapper.insert(approveAccredit);
				}
			}
			return "success";
		}
	
	/**
	 * 查询方案用户列表
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryUserList")
	public @ResponseBody ResultMapNew queryUserList(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		Map requestParam = params.getRequestParam();
		Map filter = params.getFilter();
		String offset = params.getOffset();
		String limit = params.getLimit();
		//Map paramsMap = params.getParamsMap();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		String sql = "select sys_user.user_id as userId, "+
				" sys_user.user_code as userCode, "+
				" sys_user.user_name as userName, "+
				" sys_online_user.user_login_time as userLoginTime "+
				" from sys_user,sys_online_user "+
				" where sys_user.user_id = sys_online_user.user_id";
		
		ResultMapNew resultMap = new ResultMapNew();
		
		List<Map> rs = new ArrayList<Map>();
		try {
			rs = MybatisUtil.queryList("runtime.selectSql", sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		} 
		
		List<Map> userList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>rs.size()) {
			end = rs.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			userList.add(rs.get(i));
		}

		resultMap.setTotal(rs.size());
		resultMap.setRows(userList);
		return resultMap;
	}
	
	
	/**
	 * 保存方案用户
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/downlineUsers")
	public @ResponseBody String downlineUsers(HttpServletRequest request) throws Exception{
		String userIds =  request.getParameter("userIds");
		String sql = "select * from sys_online_user where user_id in ("+userIds.substring(0, userIds.length()-1)+")";
		List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql);
		for (int i = 0; i < rs.size(); i++) {
			String sessionId = rs.get(i).get("SESSION_ID")+"";
			
			MySessionContext myc= MySessionContext.getInstance();  
			HttpSession sess = myc.getSession(sessionId);
			sess.invalidate();
		}
				
		return "success";
	}
}
