package com.myehr.service.impl.formmanage.form.widget;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.widget.SysFormLookupMapper;
import com.myehr.pojo.formmanage.widget.SysFormLookup;
import com.myehr.pojo.formmanage.widget.SysFormLookupExample;
import com.myehr.service.formmanage.form.widget.ILookUpService;

public class LookUpServiceImpl implements ILookUpService {

	@Autowired
	SysFormLookupMapper sLookupMapper;
	
	@Override
	public Map<String, Object> saveLookupInfo(Map lookup, String userid,
			Date operatorTime) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysFormLookup queryLookupDetailByColumnId(String columnId) {
		// TODO Auto-generated method stub
		SysFormLookupExample example = new SysFormLookupExample();
		example.or().andLookupFormColumnIdEqualTo(new BigDecimal(columnId));
		SysFormLookup obj = sLookupMapper.selectByExample(example).get(0);
		return obj;
	}

	@Override
	public List<Map> queryColumnByFromIdFromCache(String formId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
