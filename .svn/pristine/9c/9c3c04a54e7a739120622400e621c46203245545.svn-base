package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.form.SysFormconfigTreeMapper;
import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.formmanage.form.SysFormconfigTreeExample;
import com.myehr.service.formmanage.form.ITreeService;

public class TreeServiceImpl implements ITreeService{
	
	@Autowired
	SysFormconfigTreeMapper mapper;

	@Override
	public SysFormconfigTree queryFormTree(String fromId,
			String fromPartition) {
		// TODO Auto-generated method stub
		SysFormconfigTreeExample example = new SysFormconfigTreeExample();
		example.or().andFormTreeFormIdEqualTo(new BigDecimal(fromId));
		List<SysFormconfigTree> list = mapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		//System.out.println("info:按钮ID为:"+buttonId+",找不到对应保存按钮信息(SysFormButtonSave)");
		return null;
	}
	
	

}
