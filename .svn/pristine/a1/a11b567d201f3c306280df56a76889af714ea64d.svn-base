package com.myehr.service.formmanage.form;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.SysTreeSolution;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumn;



/**
 * 表单树处理类
 * @author Administrator
 *
 */
public interface ISysFormTreeService {
	
	/**
	 * 保存方案树
	 * 
	 * @param treeSolution
	 * @return
	 */
	public String saveFormTreeSolution(Map treeSolution) throws Exception;
	
	/**
	 * 通过ID获取树方案对象数据
	 * @param solutionId
	 * @return
	 */
	public SysTreeSolution queryFormTreeSolutionById(BigDecimal solutionId);

	/**
	 * 校验树方案编码是否唯一
	 */
	public boolean checkTreeSolutionCode(String treecode);
	
	/**
	 * 通过实体sql获取各映射字段
	 * @param entitySql
	 * @return
	 * @throws Exception
	 */
	public List<Map<String,String>> getTreeSolutionColumns(String entitySql,long treeSolutionId) throws Exception;
	
	

	/**
	 * 保存树方案映射字段
	 * @param datas
	 * @return
	 * @throws Exception
	 */
	public String saveFormTreeSolutionColumn(List<Map> datas,long treeSolutionId) throws Exception;
	
	

	/**
	 * 查询树方案字段
	 * @param datas
	 * @return
	 * @throws Exception
	 */
	public List<SysTreeSolutionColumn> queryTreeSolutionColumnBySolutionId(BigDecimal treeSolutionId) throws Exception;
	
	/**
	 * 保存目录信息
	 */
	public String saveFolder(Map sysFormFolderTree) throws Exception;
	
	
	/**
	 * 表单目录树
	 */
	public List<Map> buildTreeNodes(long nodeId, String nodeCode,
			String nodeExt,String nodeType) ;
	
	/**
	 * 获取目录信息
	 * @return
	 */
	public Map querySysTreeFolderById(long folderTreeId) ;
	
	/**
	 * 
	 * @param criteria
	 * @param pageCond
	 * @param sortField
	 * @param sortOrder
	 * @return
	 */
	public List<Map> queryTreeSolutionList();
	
	
	/**
	 * 删除目录
	 * @param folderTreeId
	 */
	public void deleteFormFolderById(long folderTreeId);
	
	/**
	 *删除方案
	 * @param sysRules
	 * @return
	 */
	public String deleteTreeSolution(List<Map> solutions) ;
	
	
	/**
	 * 恢复方案
	 * @param solutions
	 * @return
	 * @throws Exception 
	 */
	public String restorTreeSolution(List<Map> solutions) ;
	
	
	/**
	 * 获取树初始化数据
	 * @param formId
	 * @return
	 */
	public String[]  getTreeConfigInitData(long formId,long treeSolutionId);
	
}
