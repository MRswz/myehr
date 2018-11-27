package com.myehr.mapper.sysmenu;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.sysmenu.SysMenu;
import com.myehr.pojo.sysmenu.SysMenuExpand;

public interface SysMenuMapperExpand {
    List<SysMenu> selectByCondition(String condition);
    
    List<SysMenu> selectByPId(String condition);
    
    List<SysMenu> searchByCode(String condition);

	List<SysMenu> queryMenusByUserid(String userId);
	
	List<SysMenu> queryMenusByRoleId(String roleId);
	
	List<SysMenuExpand> queryMenusByUseridAndSchemeId(String schemeId);
	List<SysMenuExpand> queryMenusByUseridAndSchemeId(Map map);
	
	List<SysMenuExpand> selectByExample();
	
	List<SysMenuExpand> selectSchemeMenuByExample();

	List<SysMenuExpand> queryMenusByUseridAndPcode(Map map);

	List<SysMenuExpand> queryMenusByUseridAndSchemeIdx(Map map);

}