package com.myehr.controller.sysMenuRole;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.sysMenuRoleExpand.SysMenuRoleExpandMapper;
import com.myehr.pojo.sysMenuRole.SysMenuRole;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.impl.sysMenuRole.SysMenuRoleServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;

@Controller
@RequestMapping("/SysMenuRoleList")
public class SysMenuRoleListController {
	@Autowired
	private SysMenuRoleServiceImpl serviceImpl;
	@Autowired
	private SysMenuRoleExpandMapper eMapper;
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	
	//新增
	@RequestMapping("/insertSysRoleMenu")
	public @ResponseBody Object insertSysRoleMenu(HttpServletRequest request) throws Exception{
		SysMenuRole menu = (SysMenuRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenuRole.class);
		menu.setMenuRoleId(new BigDecimal(keyserviceImpl.getPrimaryKey("sys_menu_role", "MENU_ROLE_ID")));
        String reCode = serviceImpl.insertSysMenuRole(menu);
        return reCode;
    }
	
	
	//查询  角色已经授权的菜单
	@RequestMapping("/searchSysMenuRoleList")
	public @ResponseBody ResultMap searchSysMenuRoleList(HttpServletRequest request) throws Exception{
		SysMenuRole menu = (SysMenuRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenuRole.class);
		ResultMap resultMap= serviceImpl.searchSysMenuRoleList(menu.getRoleId().intValue());
		return resultMap;
	}
	
	//删除
	@RequestMapping("/deleteSysRoleMenu")
	public @ResponseBody Object deleteSysRoleMenu(HttpServletRequest request) throws Exception{
		SysMenuRole menu = (SysMenuRole) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysMenuRole.class);  
		Map<String, Object> map=new HashMap<String, Object>();
        map.put("roleId", menu.getRoleId());
		int reCode = eMapper.delete(map);
		return reCode;
	}
	
}
