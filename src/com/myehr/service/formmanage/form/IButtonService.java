package com.myehr.service.formmanage.form;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.myehr.pojo.formmanage.button.QSysformCalculateSolution;
import com.myehr.pojo.formmanage.button.SysFormButtonAdd;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculate;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import com.myehr.pojo.formmanage.button.SysFormButtonExportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetail;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduce;
import com.myehr.pojo.formmanage.button.SysFormButtonRemove;
import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysFormButton;


public interface IButtonService {
	
	/**
	 * 批量保存按钮
	 * @param objs
	 * @return
	 * @throws Exception
	 */
	String saveButtonToCardForm(List<Map> objs) throws Exception;
	
	/**
	 * 通过表单id获取按钮列表
	 * @param fromId
	 * @param fromPartition
	 * @return
	 */
	List<SysFormButton> queryFormButton(String fromId,String fromPartition);
	
	/**
	 * 通过表单id和用户获取按钮列表
	 * @param fromId
	 * @param fromPartition
	 * @return
	 */
	List<Map> queryFormButtonWithUserId(String fromId,String userId);
	
	/**
	 * 保存 “保存按钮”扩展信息
	 * @param obj
	 * @return
	 */
	String saveButtonExt_save(Map obj) throws Exception ;
	
	
	/**
	 * 保存 “导出按钮”字段信息
	 */
	public String saveExportButtonColumn(List<Map> objs,long buttonId) throws Throwable ;
	
	/**
	 * 保存 “计算按钮”扩展信息
	 * @param obj
	 * @return
	 * @throws Exception 
	 */
	public String saveButtonCalculate(Map calculate,List<Map> caculateSolution) throws Throwable ;
	
	/**
	 * 保存 “导出按钮”扩展信息
	 */
	public String saveExportButton(Map obj) throws Throwable;
	
	/**
	 * 保存 “导入按钮”扩展信息
	 */
	public String saveImportButton(Map obj,List<Map> importColumns) throws Throwable;
	
	/**
	 * 通过buttonId获取对应保存按钮扩展信息 
	 * @param buttonId
	 * @return
	 */
	SysFormButtonSave  queryButtonExt_saveByButtonId(String buttonId);
	
	/**
	 * 通过calculateId获取对应的方案和计算按钮的关系数据 
	 * @param buttonId
	 * @return
	 */
	public List<QSysformCalculateSolution>  queryCalculateSoluton(String calculateId);
	
	/**
	 * 通过buttonId获取对应计算按钮的扩展信息 
	 * @param buttonId
	 * @return
	 */
	public SysFormButtonCalculate queryButtonCalculate(String buttonId);

	/**
	 * 通过buttonId获取对应新增或编辑按钮扩展信息 
	 * @param buttonId
	 * @return
	 */
	SysFormButtonAdd queryButtonAddOrEditButtonByButtonId(String buttonId);
	
	/**
	 * 通过类型和关联id获取执行sql数据
	 * @param buttonExecSqlType
	 * @param buttonId
	 * @return
	 */
	public SysExecSql queryButtonExecSqlById(String buttonExecSqlType, String buttonId);
	
	
	/**
	 * 通过类型和关联id获取富文本模板数据
	 * @param buttonExecSqlType
	 * @param buttonId
	 * @return
	 */
	public SysFormButtonEditorWithBLOBs queryButtonEditorById(String buttonExecSqlType, String buttonId);
	
	/**
	 * 根据菜单ID获取菜单信息
	 */
	public Map getExportButtonExt(String buttonId);
	
	/**
	 * 根据按钮ID获取导入按钮的配置信息
	 */
	public SysFormButtonImport getImportButtonExt(String buttonId);
	
	/**
	 * 根据按钮ID获取导出按钮对应导出字段信息
	 * @param buttonId
	 * @return
	 */
	public List<Map> getExportButtonColumns(long buttonId);
	
	/**
	 * 根据按钮ID获取导入按钮配置字段
	 */
	public List<SysFormButtonImportColumn> getImportButtonColumnconfig(String buttonId) ;
	
	/**
	 * 根据按钮ID获取导出按钮配置字段
	 */
	public List<SysFormButtonExportColumn> getExportButtonColumnconfig(String buttonId) ;
	
	/**
	 * 根据按钮ID获取导出按钮对应的字段配置信息
	 */
	public List<Map> getExportColumnconfigs(String buttonId) ;
	
	/**
	 * 通过新增或编辑按钮扩展信息id获取对应的参数对象信息
	 * @param buttonId
	 * @return
	 */
	List<Map> queryButtonParam(String buttonAddId);
	
	/**
	 * 通过关联按钮id获取对应的删除按钮信息
	 * @param buttonId
	 * @return
	 */
	SysFormButtonRemove queryButtomRemov(String buttonId);
	
	
	/**
	 * 通过formId and  buttonId query calculate button Id 
	 * @param buttonId
	 * @return
	 */
	public List<Map> queryCalculateIdByButtonId(String formId,String buttonId);
	
	/**
	 * 查询执行sql
	 * @param execSqlType
	 * @param execSqlRelaid
	 * @return
	 */
	public Map queryExecSql(String execSqlType, Long execSqlRelaid);
	
	/**
	 * 保存
	 * @param sql
	 * @return
	 */
	public long saveExecSql(Map sql);
	
	
	/**
	 * 通过sqlID获取执行sql数据
	 * @param exeSqlId
	 * @return
	 */
	public SysExecSql queryButtonExecSqlById(long exeSqlId) ;
	
	/**
	 * 通过sqlID获取按钮模板数据
	 * @param exeSqlId
	 * @return
	 */
	public SysFormButtonEditorWithBLOBs queryButtonEditorById(long exeSqlId) ;
	
	
	/**
	 * 保存按钮的引入扩展对象
	 * @param entity
	 * @param datas
	 * @throws Exception 
	 */
	public void saveButtonIntroduce(Map entity,List<Map> datas) throws Exception;
	
	/**
	 * 通过按钮ID查询引入按钮配置数据
	 * @param buttonId
	 * @return
	 */
	public SysFormButtonIntroduce queryIntroduceByButtonId(long buttonId);
	
	/**
	 * 通过引入配置id获取映射字段明细
	 * @param buttonId
	 * @return
	 */
	public List<SysFormButtonIntrDetail> queryIntroduceDetailByIntroduceId(long introduceId);
	
	
	/**
	 * 查询某个方案是否绑定公式，并获取第一个
	 * @return
	 */
	public String querySolutionFormId(String solutionId);
	
	/**
	 * 根据按钮ID获取导入按钮对应的字段配置信息
	 */
	public List<Map> getImportColumnconfigs(String buttonId) ;
	
}
