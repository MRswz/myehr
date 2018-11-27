package com.myehr.service.impl.sysParam;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.mapper.formmanage.form.SysSqlParamsMapper;
import com.myehr.mapper.primaryKey.PrimaryKeyTableExpandMapper;
import com.myehr.mapper.sysParam.SysSystemParamMapper;
import com.myehr.mapper.sysParam.SystemParmMapper;
import com.myehr.pojo.formmanage.form.SysRule;
import com.myehr.pojo.formmanage.form.SysRuleExample;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.formmanage.form.SysSqlParamsExample;
import com.myehr.pojo.sysParam.SysSystemParam;
import com.myehr.pojo.sysParam.SysSystemParamExample;
import com.myehr.pojo.sysParam.SystemParm;
import com.myehr.pojo.sysParam.SystemParmExample;
import com.myehr.service.sysParam.ISysParamService;

@Service("SysParamServiceImpl")
public class SysParamServiceImpl implements ISysParamService{
	@Autowired
	private SysSystemParamMapper sysSystemParamMapper;

	@Autowired
	SysSqlParamsMapper sParamsMapper;
	
	@Override
	public SysSystemParam getParamValueByParamName(String paramName)
			throws SQLException {
		// TODO Auto-generated method stub
		SysSystemParamExample example = new SysSystemParamExample();
		com.myehr.pojo.sysParam.SysSystemParamExample.Criteria criteria = example.createCriteria();
		criteria.andSysParamTypeEqualTo("报表配置");
		List<SysSystemParam> sysParams = sysSystemParamMapper.selectByExample(example);
		if (sysParams.size()>0) {
			return sysParams.get(0);
		}
		return null;
	}
	
	@Override
	public SysSqlParams getSysSqlParamsByCode(String paramCode)
			throws SQLException {
		// TODO Auto-generated method stub
		SysSqlParamsExample example = new SysSqlParamsExample();
		example.or().andSqlParamsCodeEqualTo(paramCode);
		SysSqlParams sParams = sParamsMapper.selectByExample(example).get(0);
		return sParams;
	}

}
