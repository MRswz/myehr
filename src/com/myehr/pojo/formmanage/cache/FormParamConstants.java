package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
/**
 * 
 */


/**
 * @author YICS
 *
 */
public class FormParamConstants implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * 参数配置类型
	 */
	
	/**
	 * 表单参数输出类型
	 */
	public static final String FORM_TAB ="FORM_TAB";
	

	/**
	 * 表单按钮中的引入按钮类型
	 */
	public static final String BUTTON_INTRODUCE ="BUTTON_INTRODUCE";
	
	/**
	 * TAB页主从表参数
	 */
	public static final String FORM_MST_TAB ="FORM_MST_TAB";
	
	/**
	 * 表单按钮参数类型
	 */
	public static final String FORM_BUTTON="FORM_BUTTON";
	
	/**
	 * 计算按钮参数
	 */
	public static final String BUTTON_CALCULATE="BUTTON_CALCULATE";
	
	/**
	 * 字段textBox控件配置参数类型
	 */
	public static final String COLUMN_TEXTBOX="COLUMN_TEXTBOX";
	
	/**
	 * 控件textBox字段链接参数
	 */
	public static final String COLUMN_LINK="COLUMN_LINK";
	
	/**
	 * 字段comboBox控件配置参数类型
	 */
	public static final String COLUMN_COMBOBOX="COLUMN_COMBOBOX";
	
	/**
	 * 字段RADIOLIST OR CHECKBOXLIST控件配置参数类型
	 */
	public static final String COLUMN_RADIOLIST_OR_CHECKBOXLIST="COLUMN_RADIOLIST";
	
	/**
	 * 表单按钮中的引入按钮引入列表参数
	 */
	public static final String INTRODUCE_TARGET_FORM ="INTRODUCE_TARGET_FORM";
	
	/**
	 * lookup控件参数 
	 */
	public static final String COLUMN_LOOKUP="COLUMN_LOOKUP";
	
	/**
	 * 控件数据初始化化biz
	 */
	public static final String GUI_DATA_INIT_BIZ="GUI_DATA_INIT_BIZ";

	/**
	 * 字段lookup配置打开页面参数
	 */
	public static final String COLUMN_LOOKUP_OPENPAGE="OPENPAGE";
	/**
	 * 字段lookup配置URL数据回显参数
	 */
	public static final String OPENPAGE_DATA_RETURN="OPENPAGE_DATA_RETURN";
	
	/**
	 * 树控件类型
	 */
	public static final String FORMCONFIG_TREE ="FORMCONFIG_TREE";
	
	/**
	 * 加载树控件参数
	 */
	public static final String TREE_BIZ_URL ="TREE_BIZ_URL";
	
	/**
	 * form表单类型
	 */
	public static final String FORMCONFIG ="FORMCONFIG";
	
	/**
	 * js全局参数
	 */
	public static final String JS_VAR ="JS_VAR";
	

	/**
	 * 执行SQL类型
	 * 
	 */
	public static final String EXECSQL_BUTTON = "buttonExecSQL";
	public static final String EXECSQL_COMBOBOX = "COMBOBOX_INIT";
	public static final String EXECSQL_LOOKUPBACK = "EXECSQL_LOOKUPBACK";
	
	//导入按钮配置中，翻译方式为sql方式
	public static final String EXECSQL_IMPORT_COLUMN_TYPE = "EXECSQL_IMPORT_COLUMN_TYPE";
	
//	导出按钮配置中，翻译方式为sql方式
	public static final String EXECSQL_EXPORT_COLUMN_TYPE = "EXECSQL_EXPORT_COLUMN_TYPE";
	
	//	按钮配置中，后置调用sql
	public static final String EXECSQL_BUTTON_HZ_TYPE = "EXECSQL_BUTTON_HZ_TYPE";
//	按钮配置中，前置调用sql
	public static final String EXECSQL_BUTTON_QZ_TYPE = "EXECSQL_BUTTON_QZ_TYPE";
	
}
