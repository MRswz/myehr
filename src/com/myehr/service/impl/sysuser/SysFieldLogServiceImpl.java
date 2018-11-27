package com.myehr.service.impl.sysuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.mapper.sysuser.SysFieldLogMapper;
import com.myehr.pojo.sysuser.SysFieldLog;
import com.myehr.service.sysuser.ISysFieldLogService;



@Service("SysFieldLogServiceImpl")
public class SysFieldLogServiceImpl implements ISysFieldLogService {
	
	@Autowired
	private SysFieldLogMapper sysFieldLogMapper;
	
	@Override
	public String insertFieldLog(SysFieldLog fieldLog) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sysFieldLogMapper.insert(fieldLog);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	
}
