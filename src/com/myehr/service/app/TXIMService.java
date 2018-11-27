package com.myehr.service.app;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.ResultMap;
import com.myehr.pojo.app.SysWxDepartment;
import com.myehr.pojo.app.SysWxEmployee;
import com.myehr.pojo.entity.SysEntity;

public interface TXIMService {
	public Map importDatas(String[] userCode);//导入用户
	public Map friendImport(String[] frendsCode,String userCode);//导入好友
	public Map createGroupFriendImport(String GroupName,String[] frendsCode,String userCode);//创建分组,并插入好友
	public Map batchUpdateFrendGroupInfo(String[] frendsCode,String GroupNameNew,String userCode);//批量修改分组信息
	public Object insertDepartmentWY(List<SysWxDepartment> departments);
	public Map deleteDepartmentWY(List<SysWxDepartment> departments);
	public Map updateDepartmentWY(List<SysWxDepartment> departments);
	Object insertEmployeeWY(List<SysWxEmployee> emps);
	
	
}
