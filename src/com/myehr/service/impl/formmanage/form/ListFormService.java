package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.mapper.formmanage.form.SysFormconfigGridMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigTreeMapper;
import com.myehr.mapper.formmanage.form.SysTreeNodeTypeMapper;
import com.myehr.mapper.formmanage.formexpand.SysFormconfigMapperExpand;
import com.myehr.pojo.formmanage.form.SysFormconfigGrid;
import com.myehr.pojo.formmanage.form.SysFormconfigGridExample;
import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.formmanage.form.SysFormconfigTreeExample;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.pojo.formmanage.form.SysTreeNodeTypeExample;
import com.myehr.service.formmanage.form.IListFormService;

import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;

public class ListFormService implements IListFormService {
	@Autowired
	SysFormconfigMapperExpand sFormconfigMapperExpand;
	@Autowired
	SysFormconfigTreeMapper sysFormconfigTreeMapper;
	@Autowired
	SysFormconfigGridMapper sFormconfigGridMapper;
	@Autowired
	SysTreeNodeTypeMapper treeMapper;
	
	@Override
	public SysFormconfigWithBLOBs queryListFormsById(String id) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("formDefId", id);
		SysFormconfigWithBLOBs sFormconfig = sFormconfigMapperExpand.getFormconfigWithBLOBsById(map);
		return sFormconfig;
	}

	@Override
	public void saveForms(List<Map> objs) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public String saveForm(Map obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysFormconfigGrid queryListGirdByFormId(String id) {
		// TODO Auto-generated method stub
		SysFormconfigGridExample example = new SysFormconfigGridExample();
		SysFormconfigGridExample.Criteria criteria =  example.createCriteria();
		criteria.andFormGridFromIdEqualTo(new BigDecimal(id));
		List<SysFormconfigGrid> list = sFormconfigGridMapper.selectByExample(example);
		if(list!=null&&list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public SysFormconfigTree queryListTreeById(String id) {
		SysFormconfigTreeExample example = new SysFormconfigTreeExample();   
		BigDecimal groupFormDefId = new BigDecimal(id); 
		example.or().andFormTreeFormIdEqualTo(groupFormDefId);
		List<SysFormconfigTree> groups = sysFormconfigTreeMapper.selectByExample(example);
		SysFormconfigTree sys=groups.get(0);
		return sys;
	}

	@Override
	public void deleteListForms(List<Map> objs, String cuserid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateListForms(List<Map> objs, String cuserid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkFormCode(Map obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Map> queryColumnsByEntityCodeAndFormId(String entityCode,
			String formId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String entitySqlConvertSql(String entitySql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getFormGrid(String formId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysTreeNodeType> queryTreeNodeTypeByFormId(long formId) {
		// TODO Auto-generated method stub
//		CriteriaType criteria = CriteriaType.FACTORY.create();
//		criteria.set_entity("com.dcf.form.formdataset.SysTreeNodeType");
//		criteria.set("_expr[1]/formTreeFormId", formId);
//		IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
//		DataObject[] objs = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, ida);	
//		return objs;
//		SysEntityExample example =new SysEntityExample();
//		SysEntityExample.Criteria criteria= example.createCriteria();
//		criteria.andEntityTypeEqualTo(sysDictEntryExpand.getDictEntryCode());
//		List<SysEntity> sList = sMapper.selectByExample(example);
		SysTreeNodeTypeExample example = new SysTreeNodeTypeExample();
		SysTreeNodeTypeExample.Criteria criteria = example.createCriteria(); 
		criteria.andFormTreeFormIdEqualTo(new BigDecimal(formId));
		List<SysTreeNodeType> treeNodeTypes = treeMapper.selectByExample(example);
		return treeNodeTypes;
	}

	@Override
	public Map queryFormGridSummaryData(String formId,
			Map<String, String> filter) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSelectFormId(String formId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getSysFormconfigChartsById(String formDefId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map getFormCharts(String formId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateformCharts(Long formDefId, Long selectFormId,
			String formchartsx, String formchartsy, String formchartstype)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveformCharts(Map obj) throws Exception {
		// TODO Auto-generated method stub
		
	}


}
