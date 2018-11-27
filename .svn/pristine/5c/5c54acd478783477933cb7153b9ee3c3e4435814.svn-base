package com.myehr.controller.sysUserRole;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.pojo.sysRole.SysRole;
import com.myehr.pojo.sysUserRole.SysUserRole;
import com.myehr.pojo.sysUserRole.SysUserRoleSelect;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.impl.sysUserRole.SysUserRoleServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;

@Controller
@RequestMapping("/SysUserRoleController")
public class SysUserRoleController {
	private static Logger logger = LoggerFactory.getLogger(SysUserRoleController.class);
	@Autowired
	private SysUserRoleServiceImpl serviceImpl;
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	
	//根据code查询roleId 
	@RequestMapping("/selectRoleId")
	public @ResponseBody Object selectRoleId(HttpServletRequest request) throws Exception{
		
		SysRole role = (SysRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysRole.class);
		return serviceImpl.selectRoleId(role.getRoleCode());
		
	}
	
	//根据roleId查询userId    没用上
	@RequestMapping("/selectUserId")
	public @ResponseBody Object selectUserId(HttpServletRequest request) throws Exception{
		SysUserRole sRrole = (SysUserRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUserRole.class);
		return serviceImpl.selectUserId(sRrole);
		
	}
	
	
	//删除
	@RequestMapping("/deleteUserRole")
	public @ResponseBody Object deleteUserRole(HttpServletRequest request) throws Exception{
		
		SysUserRole sRrole = (SysUserRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUserRole.class);
		return serviceImpl.deleteUserRole(sRrole);
		
	}
	
	
	
	//新增      
	
	@RequestMapping("/insertSysUserRole")
	public @ResponseBody Object insertSysUserRole(HttpServletRequest request) throws Exception{
		SysUserRole sRrole = (SysUserRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUserRole.class);
		sRrole.setUserRoleId(keyserviceImpl.getPrimaryKey("sys_user_role", "USER_ROLE_ID"));
		return serviceImpl.insertSysUserRole(sRrole);
		
	}
	
	
	
	
	@RequestMapping("/selectSysUser")
	public @ResponseBody Object selectSysUser(HttpServletRequest request)throws Exception{
		
		SysUserRoleSelect sysSelect=(SysUserRoleSelect) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysUserRoleSelect.class);
		try {  
            return serviceImpl.selectSysUser(sysSelect);  
        } catch (Exception e) {  
            e.printStackTrace();logger.error(e.getMessage(),e);  
        }  
        return null; 
		
	}
	

}
