package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.apache.cxf.binding.corba.wsdl.Array;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.controller.login.Login;
import com.myehr.pojo.app.grid.SysAppClass;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.formmanage.cache.SysFormGroupCache;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.pojo.formmanage.widget.SysFormRichtext;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.IsysFormColumnService;



public class SysFormColumnCacheCopy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(SysFormColumnCacheCopy.class);
	//private static final Logger log = DcfUtil.getLogger(SysFormColumn.class);
	
	private SysFormColumn pojo;
	
	private SysField field;
	//列的数据类型(张乐添加)
	private String columnDataType;
	
	private String formDefId;
	//关联表单布局对象
	
	//表单控件对象
	private Object formColumGui;
	
	//该字段涉及实体数据
	private Map entityColumn;
	
	private String formColumnComboboxGuiInitFun;
	
	private SysAppClass appClass;
	
	
	//此表单是否记录字段日志
	private boolean fieldIsLog;
	
	public boolean isFieldIsLog() {
		return fieldIsLog;
	}
	public void setFieldIsLog(boolean fieldIsLog) {
		this.fieldIsLog = fieldIsLog;
	}

	public Object getFormColumGui() {
		return formColumGui;
	}

	public String getFormColumnAlign() {
		return pojo.getFormColumnAlign();
	}

	public String getFormColumnChangeFun() {
		return pojo.getFormColumnChangeFun();
	}

	public int getFormColumnColSpan() {
		if (pojo.getFormColumnColSpan()==null) {
			pojo.setFormColumnColSpan(new BigDecimal("0"));
		} 
		return pojo.getFormColumnColSpan().intValue();
	}

	public SysFormColumn getPojo() {
		return pojo;
	}
	public void setPojo(SysFormColumn pojo) {
		this.pojo = pojo;
	}
	public SysField getField() {
		return field;
	}
	public void setField(SysField field) {
		this.field = field;
	}
	public void setFormColumGui(Object formColumGui) {
		this.formColumGui = formColumGui;
	}
	public void setEntityColumn(Map<String, Object> entityColumn) {
		this.entityColumn = entityColumn;
	}
	
	public String getFormDefId() {
		return formDefId;
	}
	public void setFormDefId(String formDefId) {
		this.formDefId = formDefId;
	}
	public SysAppClass getAppClass() {
		return appClass;
	}
	public void setAppClass(SysAppClass appClass) {
		this.appClass = appClass;
	}
	
	public long getFormColumnEntityId() {
		return pojo.getFormColumnEntityId().longValue();
	}

	public String getFormColumnGuiType() {
		return pojo.getFormColumnGuiType();
	}

	public String getFormColumnHeight() {
		return pojo.getFormColumnHeight();
	}

	public long getFormColumnId() {
		return pojo.getFormColumnId().longValue();
	}

	public String getFormColumnInitFun() {
		return pojo.getFormColumnInitFun();
	}

	public String getFormColumnLable() {
		return pojo.getFormColumnLable();
	}

	public String getFormColumnRequired() {
		return pojo.getFormColumnRequired();
	}

	public String getFormColumnRigist() {
		return pojo.getFormColumnRigist();
	}

	public int getFormColumnRowSpan() {
		return pojo.getFormColumnRowSpan().intValue();
	}

	public String getFormColumnShowType() {
		return pojo.getFormColumnShowType();
	}

	public int getFormColumnSort() {
		return pojo.getFormColumnSort().intValue();
	}

	public String getFormColumnSql() {
		return pojo.getFormColumnSql();
	}

	public String getFormColumnWidth() {
		return pojo.getFormColumnWidth();
	}

	public BigDecimal getFormColumnColumnId() {
		return pojo.getFormColumnColumnId();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}
	
	public long getFormColumnFormDefId() {
		return pojo.getFormColumnFormDefId().longValue();
	}
	
	public String getFormColumnType() {
		return pojo.getFormColumnType();
	}
	
	public String getFormColumnGroupId() {
		return pojo.getFormColumnGroupId();
	}
	
	public Map<String,Object> getEntityColumn() {
		return entityColumn;
	}
	
	public String getFormEntityTablename() {
		return pojo.getFormEntityTablename();
	}

	public String getFormFiledTablename() {
		return pojo.getFormFieldTablename();
	}
	
	public String getColumnDataType() {
		return columnDataType;
	}

	public void setColumnDataType(String columnDataType) {
		this.columnDataType = columnDataType;
	}

	public String getFormColumnTotal() {
		return pojo.getFormColumnTotal();
	}

	public String getFormColumnComboboxGuiInitFun() {
		return formColumnComboboxGuiInitFun;
	}

	public void setFormColumnComboboxGuiInitFun(String formColumnComboboxGuiInitFun) {
		this.formColumnComboboxGuiInitFun = formColumnComboboxGuiInitFun;
	}
	
	public String getFormColumnIsDev() {
		return pojo.getFormColumnIsDev();
	}
	
	public String getFormColumnMaxLength() {
		return pojo.getFormColumnMaxLength()+"";
	}
	
	public String getFormColumnMinLength() {
		return pojo.getFormColumnMinLength()+"";
	}
	
	/**
	 * 获取数据库类型
	 * @return
	 */
	public String getDatabaseType(){
		return (String)entityColumn.get("fieldType");
	}

	/**
	 * 提供空的构造函数
	 *
	 */
	public SysFormColumnCacheCopy(){}
	
	/**
	 * 构造函数  通过数据库加载
	 * @param columnId
	 */
	public SysFormColumnCacheCopy(SysFormColumn pojo,SysFormCopyCache form) throws Exception{
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysFormColumn obj =  sysformconfigService.getFormColumn(pojo.getFormColumnId().toString());
//		初始化字段实体信息
		this.pojo = pojo;
		this.setEntityColumn();
		this.setField();
		//初始化控件
		this.setFormColumGui();
		//初始化app模板
		this.setAppClass();
		
		if(this.pojo.getFormColumnType()!=null&&"1".endsWith(this.pojo.getFormColumnType())){
			if (entityColumn!=null) {
				String tablename =entityColumn.get("entityTableName")+"";
				String islog = entityColumn.get("fieldIsLog")+"";
				if("Y".equals(islog)){
					String formDefSaveTable = form.getFormDefSaveTable();
					if(tablename.equals(formDefSaveTable)){
						this.fieldIsLog = true;
					}
				}
			}
		}
		this.formDefId = form.getFormDefId()+"";
	}
	
	/**
	 * 构造函数  通过Map<String,Object>加载
	 * @param obj
	 */
	public SysFormColumnCacheCopy(Map<String,Object> obj,SysFormCopyCache form){
		setThisByMap((SysFormColumn)obj);
//		初始化字段实体信息
		this.setEntityColumn();
		//初始化控件
		this.setFormColumGui();
		
		
		if("1".endsWith(this.pojo.getFormColumnType())){
			String tablename = (String)entityColumn.get("entityTablename");
			String islog = (String)entityColumn.get("fieldIsLog");
			if("Y".equals(islog)){
				if(tablename.equals(form.getFormDefSaveTable())){
					this.fieldIsLog = true;
				}
			}
		}
		

	}
	
	
	/**
	 * Map<String,Object> 填充对象
	 * @param obj
	 */
	private void setThisByMap(SysFormColumn obj){
		this.pojo = obj;
	}
	
	/**
	 * 初始化对应字段的实体信息
	 *
	 */
	@SuppressWarnings("unchecked")
	private void setEntityColumn() {
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		//后期修改 0326 尹恒
		if(this.getFormFiledTablename().equals("xh")){
			
		}else {
			this.entityColumn = sysformconfigService.getEntityColumnByColumnId(this.getPojo().getFormColumnColumnId()+"");
			logger.info(this.entityColumn+"");
		}
	}
	
	private void setField() {
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		//后期修改 0326 尹恒
		this.field = sysformconfigService.getFieldById(this.getPojo().getFormColumnColumnId()+"");
	}
	
	//setAppClass
	public void setAppClass() throws Exception{
		IsysFormColumnService columnService = (IsysFormColumnService)SpringContextUtils.getBeanById("SysFormColumnServiceImpl");
		//logger.info(columnService.queryAppClassByColumnId(this.getPojo().getFormColumnColumnId()+""));
		this.appClass = columnService.queryAppClassByColumnId(this.getPojo().getFormColumnId()+"");
	}
	
	/**
	 * 加载控件
	 * @param columnId
	 */
	private String[] setFormColumGui(){
		//后期修改 0326 尹恒
		String[] htmls = null;// new String[SysCardFormBeansUtil.HTML_SILZE];
		
		if(this.pojo.getFormColumnGuiType()==null){
			return null;
		}
		//查询textbox件类型
		if("1".equals(this.getFormColumnGuiType())||"8".equals(this.getFormColumnGuiType())){ //textbox控件
			this.formColumGui = new SysTextBoxCacheCopy(this.getFormColumnId()+"");
			
		}else if("2".equals(this.getFormColumnGuiType())){ //单选下拉控件
			this.formColumGui = new SysFormComboboxCacheCopy(this.getFormColumnId()+"");
			
		}else if("3".equals(this.getFormColumnGuiType())){ //单选框组
			this.formColumGui = new SysFormRadiobuttonlistCacheCopy(this.getFormColumnId()+"");
		}else if("4".equals(this.getFormColumnGuiType())){ //复选框组
			this.formColumGui = new SysFormRadiobuttonlistCacheCopy(this.getFormColumnId()+"");
		}/*else if("5".equals(this.getFormColumnGuiType())){
			this.formColumGui = new SysFormCheckboxCache(this.formColumnId+"");
		}*/else if("6".equals(this.getFormColumnGuiType())){
			this.formColumGui = new SysDatepickerCacheCopy(this.getFormColumnId()+"");
		}else if("7".equals(this.getFormColumnGuiType())){
			this.formColumGui = new SysFormLookupCacheCopy(this.getFormColumnId()+"");
		}else if("10".equals(this.getFormColumnGuiType())){ //富文本
			this.formColumGui = new SysFormRichtextCacheCopy(this.getFormColumnId()+"",this.getJsId("fun",this.formDefId));
		}else if("9".equals(this.getFormColumnGuiType())){
			this.formColumGui = new SysFormFileuploadCacheCopy(this.getFormColumnId()+"",this.getJsId("fun",this.formDefId));
		}
		
		return htmls ;
	}
	public String getJsId(String flage,String formId){
		String[] ef = this.getFiledName();
		String entityName = ef[0].toUpperCase();
		String fieldName = ef[1].toUpperCase();
		
		if(entityName==null){
			entityName = "VIR";
		}
		
		if("fun".equals(flage)) {
			return entityName+"_"+fieldName+"_"+formId;
		}else if("id".equals(flage)){
			return entityName+"."+fieldName+"_"+formId;
		}else if("name".equals(flage)) {
			return fieldName+"_"+formId;
		}
		return entityName.toUpperCase()+"."+fieldName.toUpperCase()+"_"+formId;
	}
	public String[] getFiledName(){
		String fieldName = "";
		String entityName = "";
		if("1".equals(this.pojo.getFormColumnType())){ //实体列需要总对应实体对象中获取表名和字段名
			entityName = (String)this.entityColumn.get("entityTableName");
			fieldName = (String)this.entityColumn.get("fieldTablename");
		}else if("2".equals(this.pojo.getFormColumnType())){ //虚拟列直接从当前对象中获取
			entityName=this.pojo.getFormEntityTablename();
			fieldName = this.pojo.getFormFieldTablename();
		}
		return new String[]{entityName.toUpperCase(),fieldName.toUpperCase()};
	}
	


}
