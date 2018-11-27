package com.myehr.controller.message;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.pojo.message.SysMessageTemplate;
import com.myehr.pojo.message.SysMessageTemplateWithBLOBs;
import com.myehr.service.message.MessageTemplateService;

/**
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/message")
public class MessageTemplateController {
	@Autowired
	private MessageTemplateService  messageTemplateService;
	@RequestMapping("/getTemplates")
	public @ResponseBody List<SysMessageTemplate> queryTemplate(String keyword){
		
		return messageTemplateService.queryMessageTemplate(keyword) ;
	}
	
	/**
	 * 保存
	 * @param entity
	 * @return
	 */
	@RequestMapping("/saveTemplate2")
	public @ResponseBody String saveMessageTemplate2(@RequestBody SysMessageTemplateWithBLOBs entity) {
		entity.setOperatorTime(new Date());
		return messageTemplateService.insertSysMessageTemplate(entity);
	}
	
	
	
	/**
	 * 保存
	 * @param entity
	 * @return
	 */
	@RequestMapping("/getTemplatesById")
	public @ResponseBody SysMessageTemplateWithBLOBs getTemplatesById( String id) {
		return  messageTemplateService.queryTemplateById(id) ;
	}
	
	/**
	 * 保存
	 * @param entity
	 * @return
	 */
	@RequestMapping("/saveTemplate")
	public @ResponseBody String saveMessageTemplate(@RequestBody SysMessageTemplateWithBLOBs entity) {
		entity.setOperatorTime(new Date());
		return messageTemplateService.insertSysMessageTemplate(entity);
	}
}
