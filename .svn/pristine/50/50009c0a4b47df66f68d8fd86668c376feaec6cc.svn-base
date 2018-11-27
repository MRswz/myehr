package com.myehr.service.sqlparams;

import java.util.List;
import java.util.Map;

import com.myehr.common.mybatis.Pager;
import com.myehr.pojo.formmanage.form.SysSqlParams;


/**
 * sql 
 * @author Administrator
 *
 */
public interface ISysSqlParamsService {
	
	/**
	 * 保存sql参数数据
	 * @param param
	 * @return -3 编码为空； -4 名称为空； -33 编码重复； -44 名称重复 ；1 成功状态
	 * @throws Exception 
	 */
	public String saveSqlParams(Map param) throws Exception;
	
	
	
	/**
	 * 构建参数树
	 * @return
	 */
	public Map[] buidSqlParamsTree(String nodeId);
	
	/**
	 *  分页查询sql参数
	 * @return
	 */
	public List<SysSqlParams>  querySqlParams(Pager page,Map<String,String> param);
	
	/**
	 * 获取目录信息
	 * @return
	 */
	public Map querySqlParamsFolderById(String folderTreeId) ;
	
	/**
	 * 参数目录树查询
	 */
	public Map[] buildTreeNodes(String nodeId,String nodeType);
	
	/**
	 * 保存参数目录信息
	 */
	public String saveSqlParamsFolder(Map sqlParamsFolderTree) throws Exception;
	
	/**
	 * 校验目录下是否存在数据
	 */
	public String checkSqlParamsByFolderId(String folderTreeId);
	
	/**
	 * 校验参数目录是否有子节点
	 * @param folderTreeId
	 * @return
	 */
	public String queryChildById(String folderTreeId);
	
	/**
	 * 删除参数目录
	 * @param folderTreeId
	 */
	public void deleteSqlParamsFolderById(String folderTreeId);
	
	/**
	 * 构建sql参数目录树
	 * @param nodeId
	 * @param nodeType
	 * @return
	 */
	public Map[] buidSqlParamFolderTree(String nodeId,String nodeType);
}
