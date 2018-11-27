package com.myehr.service.sysFlowMenu;

import java.util.List;

import com.myehr.pojo.sysFlowMenu.SysFlowMenu;

public interface SysFlowMenuService {
	
	/*根据角色id查授权菜单*/
	public List<SysFlowMenu> searchSysFlowMenu() throws Exception;
	

}
