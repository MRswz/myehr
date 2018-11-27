package com.myehr.service.formmanage.form;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.form.SysFormconfigGrid;
import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;

public interface IListFormService {
	/**
	 * @param objs
	 */
	 void saveForms(List<Map> objs) throws Exception ;
	 
	 /**
	  * @param obj
	  */
	 String saveForm(Map obj) throws Exception ;
	 
	 /**
	  * 分页查询表单列表
	  * @param criteria
	  * @param page
	  * @param softField
	  * @param softOrder
	  * @return
	  */
	 //List<Map> queryListForms(CriteriaType criteria,PageCond page,String softField,String softOrder );
	 
	 /**
	  * 通过表单id获取表单数据
	  * @param id
	  * @return
	  */
	 SysFormconfigWithBLOBs queryListFormsById(String id);
	 
	 /**
	  * 通过表单id获取表格数据
	  * @param id
	  * @return
	  */
	 SysFormconfigGrid queryListGirdByFormId(String id);
	 
	 /**
	  * 通过表单id获取树数据
	  * @param id
	  * @return
	  */
	 SysFormconfigTree queryListTreeById(String id);
	 
	 /**
	  * 批量更新
	  * @param objs
	  * @param cuserid
	  */
	 void deleteListForms(List<Map> objs,String cuserid);
	 
	 /**
	  * 批量更新
	  * @param objs
	  * @param cuserid
	  */
	 void updateListForms(List<Map> objs,String cuserid);
	 
	 /**
	  * 
	  * @param obj
	  * @return
	  */
	 boolean checkFormCode(Map obj);
	 
	 /**
	  * @param entityCode
	  * @param formId
	  * @return
	  */
	 List<Map> queryColumnsByEntityCodeAndFormId(String entityCode,String formId);
	 
	 
	 String entitySqlConvertSql(String entitySql);
	 
	/**
	 * 通过表单ID获取grid扩展信息
	 * @param obj
	 * @throws Exception
	 */
	public Map getFormGrid(String formId) throws Exception ;
	
	/**
	  * 通过表单ID获取节点类型信息
	  * @param formId
	  * @return
	  */
	List<SysTreeNodeType> queryTreeNodeTypeByFormId(long formId);
	
	
	/**
	 * 通过表单ID、查询条件，获取grid合计数据
	 * @param formId
	 * @param filter
	 * @return
	 * @throws Exception 
	 */
	Map queryFormGridSummaryData(String formId,Map<String, String> filter) throws Exception;
	
	

	/**
	 * 通过表单ID获取关联表单id信息
	 * @param obj
	 * @throws Exception
	 */
	public String getSelectFormId(String formId);
	
	//根据配置表单id，查询配置数据
	
	public Map getSysFormconfigChartsById(String formDefId);

	//	   表单id：formChartsFormId   赋值以后获取整个表单数据       通过表单ID获取grid扩展信息   图表
	
	public Map getFormCharts(String formId) throws Exception;
	
	/**
	 * 更新图表扩展信息
	 * @param obj
	 * @throws Exception
	 */
	public String updateformCharts(Long formDefId,Long selectFormId,String formchartsx,String formchartsy,String formchartstype) throws Exception;
	
	/**
	 * 保存图表扩展信息
	 * @param obj
	 * @throws Exception
	 */
	public void saveformCharts(Map obj) throws Exception ;
}
