package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.mapper.formmanage.form.SysTreeSolutionColumnMapper;
import com.myehr.mapper.formmanage.form.SysTreeSolutionMapper;
import com.myehr.pojo.formmanage.form.SysTreeSolution;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumn;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumnExample;
import com.myehr.pojo.formmanage.form.SysTreeSolutionExample;
import com.myehr.pojo.formmanage.form.SysTreeSolutionExample.Criteria;
import com.myehr.service.formmanage.form.ISysFormTreeService;
@Service("SysFormTreeServiceImpl")
public class SysFormTreeServiceImpl implements ISysFormTreeService {
	@Autowired
	SysTreeSolutionMapper mapper;
	@Autowired
	SysTreeSolutionColumnMapper cMapper;
	
	

	@Override
	public String saveFormTreeSolution(Map treeSolution) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysTreeSolution queryFormTreeSolutionById(BigDecimal solutionId) {
		
//		SysTreeSolutionExample example= new SysTreeSolutionExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andTreeSolutionIdEqualTo(solutionId);
//		List<SysTreeSolution> list= mapper.selectByExample(example);
		SysTreeSolution solution = mapper.selectByPrimaryKey(solutionId);
		// TODO Auto-generated method stub
		return solution;
	}
	
	@Override
	public boolean checkTreeSolutionCode(String treecode) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public List<Map<String, String>> getTreeSolutionColumns(String entitySql,
			long treeSolutionId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveFormTreeSolutionColumn(List<Map> datas,
			long treeSolutionId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysTreeSolutionColumn> queryTreeSolutionColumnBySolutionId(BigDecimal treeSolutionId)
			throws Exception {
		
		SysTreeSolutionColumnExample example= new SysTreeSolutionColumnExample();
		com.myehr.pojo.formmanage.form.SysTreeSolutionColumnExample.Criteria criteria = example.createCriteria();
		criteria.andTreeSolutionIdEqualTo(treeSolutionId);
		List<SysTreeSolutionColumn> list= cMapper.selectByExample(example);
		
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public String saveFolder(Map sysFormFolderTree) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> buildTreeNodes(long nodeId, String nodeCode,
			String nodeExt, String nodeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map querySysTreeFolderById(long folderTreeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> queryTreeSolutionList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFormFolderById(long folderTreeId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteTreeSolution(List<Map> solutions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String restorTreeSolution(List<Map> solutions) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getTreeConfigInitData(long formId, long treeSolutionId) {
		// TODO Auto-generated method stub
		return null;
	}

}
