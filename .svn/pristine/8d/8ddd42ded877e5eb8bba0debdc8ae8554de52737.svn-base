package com.myehr.service.impl.sysMenuRole;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.util.ResultMap;
import com.myehr.mapper.sysMenuRole.SysMenuRoleMapper;
import com.myehr.mapper.sysMenuRoleExpand.SysMenuRoleExpandMapper;
import com.myehr.pojo.sysMenuRole.SysMenuRole;
import com.myehr.pojo.sysmenu.SysMenu;
import com.myehr.service.sysMenuRole.SysMenuRoleService;

@Service("SysMenuRoleServiceImpl")
public class SysMenuRoleServiceImpl implements SysMenuRoleService {
	@Autowired
	private SysMenuRoleMapper  sMapper;
	@Autowired
	private SysMenuRoleExpandMapper  eMapper;

	@Override
	public ResultMap searchSysMenuRoleList(Integer integer) throws Exception {
		Map<String, Object> map=new HashMap<String, Object>();
        map.put("roleId", integer);
		List<SysMenuRole> list=eMapper.searchSysMenuRoleList(map);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysMenuRole u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}

	@Override
	public String deleteSysMenuRole(SysMenuRole sys) throws Exception {
		String reCode;
		try {
			sMapper.deleteByPrimaryKey(sys.getMenuRoleId());
		} catch (Exception e) {
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	
	@Override
	public String insertSysMenuRole(SysMenuRole sys) throws Exception {
		String reCode;
		try {
			sMapper.insertSelective(sys);
		} catch (Exception e) {
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

}
