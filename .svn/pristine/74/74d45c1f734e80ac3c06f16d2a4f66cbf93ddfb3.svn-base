package com.myehr.service.impl.formmanage.form.widget;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.widget.SysFormFileuploadMapper;
import com.myehr.pojo.formmanage.widget.SysFormFileupload;
import com.myehr.pojo.formmanage.widget.SysFormFileuploadExample;
import com.myehr.service.formmanage.form.widget.IFormFileuploadService;

public class FormFileuploadServiceImpl implements IFormFileuploadService {

	@Autowired
	SysFormFileuploadMapper fMapper;
	
	@Override
	public SysFormFileupload queryFileuploadDetailByColumnId(String columnId) {
		// TODO Auto-generated method stub
		SysFormFileuploadExample example = new SysFormFileuploadExample();
		example.or().andFileuploadFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormFileupload> fList = fMapper.selectByExample(example);
		if (fList.size()>0) {
			return fList.get(0);
		} else {
			return null;
		}
	}

}
