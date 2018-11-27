package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.List;

import oracle.net.aso.f;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.widget.SysFileuploadMapper;
import com.myehr.mapper.formmanage.widget.SysFormFileuploadMapper;
import com.myehr.pojo.formmanage.widget.SysFileupload;
import com.myehr.pojo.formmanage.widget.SysFormFileupload;
import com.myehr.pojo.formmanage.widget.SysFormFileuploadExample;
import com.myehr.service.formmanage.form.IFileUploadService;

public class FileUploadServiceImpl implements IFileUploadService{
	
	@Autowired 
	private SysFileuploadMapper fileuploadMapper;
	@Autowired
	private SysFormFileuploadMapper fMapper;
	@Override
	public SysFileupload selectByPrimaryKey(String fileId) {
		// TODO Auto-generated method stub
		SysFileupload file = fileuploadMapper.selectByPrimaryKey(new BigDecimal(fileId));
		return file;
	}

	

}
