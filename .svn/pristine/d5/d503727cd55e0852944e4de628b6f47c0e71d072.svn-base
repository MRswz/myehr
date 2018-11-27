package com.myehr.service.sysuser;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.ResultMap;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserSelect;


public interface SysUserService {

	/*根据id获取用户信息*/
	public SysUser findSysUserById(int id) throws Exception;
	
	/*根据条件查用户*/
	public ResultMap findSysUserAll(HttpServletRequest request) throws Exception;
	
	/*模糊查询*/
	public ResultMap searchUserList(HttpServletRequest request) throws Exception;

	/*更新用户*/
	public String updateSysUser(SysUser user) throws Exception;
	/*删除用户    判断用户删除状态*/
	public String deleteSysUser(SysUser user) throws Exception;
	/*新增用户*/
	public String insertSysUser(SysUser user) throws Exception;

	ResultMap findSysUser(SysUserSelect sys) throws Exception;
	
}
 