package com.myehr.service.scheme;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.cache.SysRuleCache;
import com.myehr.pojo.formmanage.cache.SysSolutionCache;
import com.myehr.pojo.formmanage.form.SysRule;
import com.myehr.pojo.formmanage.form.SysRuleWithBLOBs;

public interface ISchemeService {
	

	/**
	 * 通过方案id 多个以分隔符隔开 获取方案公式树
	 * @param solutionIds
	 * @return
	 * @throws Exception 
	 */
	public Object[] querySolutionRuleTreeBySolutionIds(String solutionIds) throws Exception;
	
	/**
	 * 
	 * @param sysSolution
	 *            DataObject
	 */
	public String addSolution(SysSolutionCache sysSolution) throws Exception;
	
	/**
	 * 
	 * @param sysRule
	 * @return
	 * @throws Exception
	 */
	public String saveRule(SysRuleCache sysRule) throws Exception;
	
	
	/**
	 * 查询参数树
	 * @return
	 */
	public Map[] queryParamTree(String sysSolutionId,String paramType);
	
	/**
	 * 获取转换后的sql
	 * @param entitySql
	 * @return
	 * @throws Exception
	 */
	public String getRealSql(String entitySql) throws Exception;
	
	/**
	 * 
	 * @param criteria
	 * @param pageCond
	 * @param sortField
	 * @param sortOrder
	 * @return
	 */
	public Map[] queryParamList(String solutionId, String type);
	
	
	/**
	 * 
	 * @throws Exception 
	 */
	public Map querySolutionBySolutionId(long solutioinId) throws Exception ;
	
	/**
	 * 获取全部的计算公式信息（排除已删除的）
	 */
	public List<SysRuleWithBLOBs>  queryRuleBySolutionId(String ruleSolutionId,String deleteMark ,String ruleCode,String ruleName,String ruleId);
	
	/**
	 * 开始执行公式
	 * @param ruleIds
	 * @param formId
	 * @param buttonId
	 * @param params
	 * @return
	 * @throws Throwable 
	 */
	public String excRules(String ruleIds,String formId,String buttonId,Map<String,String> params,Map<String,String>  oparams) throws Throwable;
	
	/**
	 * 保存目录信息
	 */
	public String saveSysFormFolder(Map sysSolutionFolderTree) throws Exception ;
	
	/**
	 * 获取目录信息
	 * @return
	 */
	public Map querySolutionFolderById(String folderTreeId) ;
	
	/**
	 * 校验目录下是否有子目录
	 * @param folderTreeId
	 * @return
	 */
	public String queryChildById(String folderTreeId) ;
	
	/**
	 * 校验目录下是否存在其他业务数据
	 * @param folderTreeId
	 * @return
	 */
	public String querySolutionByFolderId(String folderTreeId) ;
	
	/**
	 * 删除目录
	 * @param folderTreeId
	 */
	public void deleteSolutionFolderById(String folderTreeId) ;
}
