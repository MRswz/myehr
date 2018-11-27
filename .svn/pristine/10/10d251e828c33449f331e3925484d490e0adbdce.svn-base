package com.myehr.service.sysRole;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.ResultMap;
import com.myehr.pojo.sysRole.SysRole;

public interface SysRoleService {

	/*根据id获取角色信息*/
	public SysRole findSysRoleById(int id) throws Exception;
	
	
	/*根据条件查角色*/
	public ResultMap searchSysRoleList(HttpServletRequest request) throws Exception;

	/*更新角色*/
	public String updateSysRole(SysRole sysRole) throws Exception;
	
	/*删除角色  */
	public String deleteSysRole(SysRole sysRole) throws Exception;
	
	/*新增角色*/
	public String insertSysRole(SysRole sysRole) throws Exception;
	
	/*恢复*/
	String recoverSysRole(SysRole sysRole) throws Exception;
	
	
	
	
}
 