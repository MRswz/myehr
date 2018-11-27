package com.myehr.service.impl.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.mapper.message.SysMessageTemplateMapper;
import com.myehr.pojo.message.SysMessageTemplate;
import com.myehr.pojo.message.SysMessageTemplateExample;
import com.myehr.pojo.message.SysMessageTemplateWithBLOBs;
import com.myehr.service.message.MessageTemplateService;

/**
 * 
 * @author Administrator
 *
 */
@Service
public class MessageTemplateServiceImpl implements MessageTemplateService {

	@Autowired
	SysMessageTemplateMapper sysMessageTemplateMapper;
	
	@Override
	
	public  List<SysMessageTemplate> queryMessageTemplate(String keyword) {
		// TODO Auto-generated method stub
		SysMessageTemplateExample example = new SysMessageTemplateExample();
		if(keyword!=null){
			example.or().andTitleLike(keyword);
		}
		List<SysMessageTemplate> list = sysMessageTemplateMapper.selectByExample(example);
		
		return list;
	}
	
	@Override
	public String insertSysMessageTemplate(SysMessageTemplateWithBLOBs sysMessageTemplate) {
		// TODO Auto-generated method stub
		sysMessageTemplateMapper.insertSelective(sysMessageTemplate);
		return "1";
	}
	
	@Override
	public SysMessageTemplateWithBLOBs queryTemplateById(String id) {
		// TODO Auto-generated method stub
		 return sysMessageTemplateMapper.selectByPrimaryKey(Integer.parseInt(id));
	}

}
