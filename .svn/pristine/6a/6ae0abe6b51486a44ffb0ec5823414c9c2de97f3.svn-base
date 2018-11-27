package com.myehr.service;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.ResultMap;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExample;


public interface SysUserService {

	/*根据ID获取数据*/
	public SysUser findSysUserById(int id) throws Exception;
	
	public ResultMap findSysUserAll(SysUserExample sExample) throws Exception;
	
	public String updateSysUser(SysUser user) throws Exception;
	
	public String deleteSysUser(SysUser user) throws Exception;
	
	public String insertSysUser(SysUser user) throws Exception;
	
	public ResultMap searchUserList(String condition) throws Exception;
	
	public ResultMap getAllEmployee (HttpServletRequest request) throws Exception;
	
}
 