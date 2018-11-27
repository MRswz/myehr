package com.myehr.service.sysUserRole;


import com.myehr.common.util.ResultMap;
import com.myehr.pojo.sysRole.SysRole;
import com.myehr.pojo.sysUserRole.SysUserRole;
import com.myehr.pojo.sysUserRole.SysUserRoleSelect;

public interface sysUserRoleService {
	
	//查询角色id
	public SysRole selectRoleId(String roleCode) throws Exception;

	//查询同角色id的用户id   
	public ResultMap selectUserId(SysUserRole sys) throws Exception;
	
	//查询方法
	public ResultMap selectSysUser(SysUserRoleSelect sys) throws Exception;
	
	/*新增角色菜单授权*/
	public String insertSysUserRole(SysUserRole sys) throws Exception;

	public int deleteUserRole(SysUserRole sys) throws Exception;
	
}
