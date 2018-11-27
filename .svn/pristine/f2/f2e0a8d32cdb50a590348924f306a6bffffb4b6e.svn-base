package com.myehr.service.impl.formmanage.form.widget;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.widget.SysFormRadiobuttonlistMapper;
import com.myehr.pojo.formmanage.widget.SysFormLookup;
import com.myehr.pojo.formmanage.widget.SysFormLookupExample;
import com.myehr.pojo.formmanage.widget.SysFormRadiobuttonlist;
import com.myehr.pojo.formmanage.widget.SysFormRadiobuttonlistExample;
import com.myehr.service.formmanage.form.widget.IRadioButtonListService;

public class RadioButtonListServiceImpl implements IRadioButtonListService {
	
	@Autowired SysFormRadiobuttonlistMapper sMapper;
	
	@Override
	public SysFormRadiobuttonlist queryRadiobuttonlistByColumnId(String columnId) {
		// TODO Auto-generated method stub
		SysFormRadiobuttonlistExample example = new SysFormRadiobuttonlistExample();
		example.or().andRadiolistFormColumnIdEqualTo(new BigDecimal(columnId));
		SysFormRadiobuttonlist obj = sMapper.selectByExample(example).get(0);
		return obj;
	}
	
}
