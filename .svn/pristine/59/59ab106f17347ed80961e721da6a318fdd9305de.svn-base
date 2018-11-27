package com.myehr.service.formmanage.form;

import java.util.List;
import java.util.Map;

import com.myehr.pojo.app.grid.SysAppClass;
import com.myehr.pojo.formmanage.form.SysFormColumn;


public interface IsysFormColumnService {
	/**
	 * 批量更新表单字段
	 * @param datas
	 * @param formId
	 * @return
	 * @throws Exception
	 */
	String saveFormColumns(List<Map> datas,String formId) throws Exception ;
	
	/**
	 * 通过表单ID获取表单下字段
	 * @param formId
	 * @return
	 */
	List<SysFormColumn> queryCardFormColumns(String formId,boolean filterAuthority,boolean isShowSaveColumn,String userId);
	
	/**
	 * 通过表单ID获取表单下字段
	 * @param formId
	 * @return
	 */
	List<SysFormColumn> queryColumnsByFormIdAndUserId(String formId,String userId);
	
	/**
	 * //通过字段id判断当前字段是否是主键字段
	 * @param formId
	 * @return
	 */
	boolean  isPkColumn(String columnId,String formDefSaveTableormDef); 
	
	/**
	 * 通过实体名称获取实体对象
	 * @param name
	 * @return
	 */
	List<Map> queryEntitysByName(String name);
	
	/**
	 * 检查字段是否已保存对应的控件
	 * @param columnId
	 * @return
	 */
	String checkColumnUi(String columnId);
	
	/**
	 * 删除修改前的表单控件
	 * @param columnId
	 * @param oldGuiType
	 * @param newGuiType
	 * @return
	 */
	String deleteOldGuiTypeAndSaveNew(String columnId,String oldGuiType ,String newGuiType);
	
	/**
	 * 通过id获取字段对象
	 * @param columnId
	 * @return
	 */
	public SysFormColumn queryColumnInfoByColumnId(String columnId);

	/**
	 * 通过id获取字段对象
	 * @param columnId
	 * @return
	 */
	public SysAppClass queryAppClassByColumnId(String columnId) throws Exception;
	
	/**
	 * 检查是否业务主键
	 * @param string
	 * @param formDefSaveTable
	 * @return
	 */
	public Object isBusPkColumn(String string, String formDefSaveTable);

	Map queryEntityColumnByColumnId(String string, String formDefSaveTable);

	List<SysFormColumn> queryimportColumns(String formId,String userId);
	
}
