package com.myehr.service.impl.sysFlowMenu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.mapper.sysFlowMenu.SysFlowMenuMapper;
import com.myehr.pojo.sysFlowMenu.SysFlowMenu;
import com.myehr.pojo.sysFlowMenu.SysFlowMenuExample;
import com.myehr.service.sysFlowMenu.SysFlowMenuService;
@Service("SysFlowMenuServiceImpl")
public class SysFlowMenuServiceImpl implements SysFlowMenuService {
	@Autowired
	private SysFlowMenuMapper sMapper;

	@Override
	public List searchSysFlowMenu() throws Exception {
		
		SysFlowMenuExample example = new SysFlowMenuExample();
		List<SysFlowMenu> list = sMapper.selectByExample(example);
	
	        return list;  
	}

}
