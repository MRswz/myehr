package com.myehr.service.message;

import java.util.List;

import com.myehr.pojo.message.SysMessageTemplate;
import com.myehr.pojo.message.SysMessageTemplateWithBLOBs;

/**
 * 信息模板类
 * @author Administrator
 *
 */
public interface MessageTemplateService {

	/**
	 * 查列表
	 * @return
	 */
	public List<SysMessageTemplate> queryMessageTemplate(String keyword);
	
	/**
	 * 保存
	 */
	public String insertSysMessageTemplate (SysMessageTemplateWithBLOBs sysMessageTemplate );

	/**
	 * 通过id查询
	 * @param id
	 * @return
	 */
	public SysMessageTemplateWithBLOBs queryTemplateById(String id);
}
