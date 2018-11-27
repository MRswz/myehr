package com.myehr.service.formmanage.form.generalparam;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.SysFormGeneralParam;

public interface ISysFormGeneralParamService {

	/**
	 * 根据通用参数分类模糊皮套和关联值查询对应配置的参数数据
	 * @return
	 */
	public List<SysFormGeneralParam>  queryGeneralParamByTypeAndTypeValue(String paramTypeLike,long value);
	
	/**
	 * 保存参数配置
	 */
	public String saveFormGeneralParams(Map[] formGeneralParams) throws Exception;
	
	/**
	 * 根据通用参数分类模糊皮套和关联值查询对应配置的参数数据
	 * @return
	 */
	public Map[] loadGeneralParamInfo(String paramType,long value);
	
	/**
	 * 通过方案ID获取该方案对应的计算按钮配置参数
	 * @return
	 */
	public Map[] loadFormGeneralParamSolutionTree(long solutionId);
	
	/**
	 * 通过id加载参数对象
	 * @return
	 */
	public Map loadGeneralParamInfoById(long paramId);
}
