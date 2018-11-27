package com.myehr.service.menu;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.exception.DcfException;
import com.myehr.common.util.ResultMap;
import com.myehr.pojo.sysmenu.SysMenu;
import com.myehr.pojo.sysmenu.SysMenuExample;


public interface SysMenuService {

	/*根据id获取菜单*/
	public SysMenu findSysMenuById(int id) throws Exception;
	/*根据条件获取菜单*/
	public ResultMap findSysMenuAll(SysMenuExample mExample) throws Exception;
	/*更新菜单*/
	public String updateSysMenu(SysMenu menu) throws Exception;
	/*删除菜单*/
	public String deleteSysMenu(SysMenu menu) throws Exception;
	/*新增菜单*/
	public String insertSysMenu(SysMenu menu) throws Exception;
	/*模糊查询*/
	public ResultMap searchMenuList(String condition) throws Exception;
	/*查询子菜单*/
	public ResultMap selectByPId(String condition) throws Exception;
	/*查询菜单Id*/
	ResultMap searchByCode(String condition) throws Exception;
	
	
	/**
	 * 根据用户获取用户的所有可操作的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	public String  queryMainframeMenu(String userId,HttpServletRequest request);
	public String  queryMainframeMenuByPcode(String userId,String schemeId,String menuCode, boolean isApp) throws DcfException, Exception;
	
	/**
	 * 根据角色获取角色的所有可操作的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	public String  queryMainframeMenuWithRoleId(String roleId,HttpServletRequest request);
	
	
	/**
	 * 根据角色重新加载可操作的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	public void  reinitMainframeMenuWithRoleId(String roleId,HttpServletRequest request);
	
	/**
	 * 根据用户获取用户的所有可操作的菜单
	 * @param isSuperAdmin 是否超级管理员
	 * @param userId 用户ID 
	 * 2017-07-29 
	 * @return
	 */
	public String  queryMainframeMenuWithScheme(String schemeId,String userId,HttpServletRequest request,String isApp);
	public String queryMainframeMenuWithSchemex(String schemeId, String userId,
			HttpServletRequest request, String isApp);
	public Map getMenuWithSchemeAllx(String userId) throws Exception;
	public void setMenuWithSchemeAllx(String userId) throws Exception;
	
	
}
 