package com.myehr.service.sysuser;

import com.myehr.pojo.sysuser.SysFieldLog;



public interface ISysFieldLogService {
	
	/*新增操作日志*/
	public String insertFieldLog(SysFieldLog fieldLog) throws Exception;
	
}
 