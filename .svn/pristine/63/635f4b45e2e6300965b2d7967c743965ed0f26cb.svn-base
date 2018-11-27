package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestion;
import com.myehr.pojo.formmanage.question.SysQuestion;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysExamtemplateQuestionCache implements Serializable {
	private static final long serialVersionUID = 1L;
	private SysExamtemplateQuestion pojo;
	
	private SysQuestion question;
	
	public SysExamtemplateQuestion getPojo() {
		return pojo;
	}

	public void setPojo(SysExamtemplateQuestion pojo) {
		this.pojo = pojo;
	}

	public SysQuestion getQuestion() {
		return question;
	}

	public void setQuestion(SysQuestion question) {
		this.question = question;
	}

	/**
	 * 构造函数  通过数据库加载
	 * @param columnId
	 */
	public SysExamtemplateQuestionCache(SysExamtemplateQuestion obj,SysFormconfigCache form) throws Exception{
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		this.pojo = obj;
		//把当前where条件的字段的字段对象设置到当前对象中
		this.question = sysformconfigService.getQuestion(obj.getQuestionid());
	}
	
	
	
}
