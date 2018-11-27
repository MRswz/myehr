package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.form.SysEvaluationMapper;
import com.myehr.mapper.formmanage.form.SysNewsMapper;
import com.myehr.mapper.formmanage.form.SysReplyMapper;
import com.myehr.pojo.formmanage.form.SysEvaluation;
import com.myehr.pojo.formmanage.form.SysEvaluationExample;
import com.myehr.pojo.formmanage.form.SysNews;
import com.myehr.pojo.formmanage.form.SysNewsExample;
import com.myehr.pojo.formmanage.form.SysReply;

import com.myehr.pojo.formmanage.form.SysReplyExample;
import com.myehr.service.formmanage.form.ISysEvaluationService;


public class EvaluationServiceImpl implements ISysEvaluationService {
	@Autowired SysEvaluationMapper sysEvaluationMapper;
	@Autowired SysReplyMapper sysReplyMapper;
	@Autowired SysNewsMapper sysNewsMapper;

	@Override
	public List<SysEvaluation> findSysEvaluationByFormId(int formId) {
		SysEvaluationExample example = new SysEvaluationExample();
		BigDecimal FormDefId = new BigDecimal(formId);
		example.or().andEvaluationFormidEqualTo(FormDefId);
		List<SysEvaluation> objs = sysEvaluationMapper.selectByExample(example);
		return objs;
	}

	@Override
	public List<SysReply> findSysReplyByEvaluationId(int EvaluationId) {
		SysReplyExample example=new SysReplyExample();
		BigDecimal EvaluationDefId = new BigDecimal(EvaluationId);
		example.or().andEvaluationIdEqualTo(EvaluationDefId);
		List<SysReply> sysreply = sysReplyMapper.selectByExample(example);
		return sysreply;
	}

	@Override
	public List<SysNews> findSysNewsByFormId(int Id) {
		SysNewsExample example = new SysNewsExample();
	    example.or().andCodeEqualTo("1");
		List<SysNews> objs = sysNewsMapper.selectByExample(example);
		return objs;
	}

	@Override
	public List<SysNews> findSysNewsByNewId(int id) {
		SysNewsExample example = new SysNewsExample();
	    example.or().andIdEqualTo(id);
		List<SysNews> objs = sysNewsMapper.selectByExample(example);
		return objs;
	}
}
