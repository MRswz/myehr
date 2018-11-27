package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.button.SysFormButtonParamMapper;
import com.myehr.pojo.formmanage.button.SysFormButtonParam;
import com.myehr.pojo.formmanage.button.SysFormButtonParamExample;
import com.myehr.service.formmanage.form.IButtonParamService;

public class ButtonParamServiceImpl implements IButtonParamService {
	
	@Autowired
	SysFormButtonParamMapper buttonParamMapper;
	
	@Override
	public List<SysFormButtonParam> querySysFormButtonParamByButtonId(String buttonId) {
		// TODO Auto-generated method stub
		SysFormButtonParamExample example = new SysFormButtonParamExample();
		example.or().andButtonAddIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonParam> list = buttonParamMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}
		System.out.println("info:按钮ID为:"+buttonId+",找不到对应按钮参数信息(SysFormButtonParam)");
		return null;
	}

}
