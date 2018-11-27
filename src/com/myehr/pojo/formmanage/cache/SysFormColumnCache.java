package com.myehr.pojo.formmanage.cache;

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
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.pojo.formmanage.widget.SysFormRichtext;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.IsysFormColumnService;



public class SysFormColumnCache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(SysFormColumnCache.class);
	//private static final Logger log = DcfUtil.getLogger(SysFormColumn.class);
	
	private SysFormColumn pojo;
	
	private SysField field;
	
	private SysEntity entity;
	
	//列的数据类型(张乐添加)
	private String columnDataType;
	
	//保留form对象引用
	private SysFormconfigCache form ;
	
	//关联表单布局对象
	
	//表单控件对象
	private Object formColumGui;
	
	//该字段涉及实体数据
	private Map entityColumn;
	
	private String formColumnComboboxGuiInitFun;
	
	/**
	 * 保留当前对象对应组
	 */
	private SysFormGroupCache group ;
	
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
	public void setGroup(SysFormGroupCache group) {
		this.group = group;
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
	
	public SysFormconfigCache getForm() {
		return form;
	}

	public void setForm(SysFormconfigCache form) {
		this.form = form;
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
	
	public SysFormGroupCache getGroup() {
		return group;
	}
	
	public SysEntity getEntity() {
		return entity;
	}
	public void setEntity(SysEntity entity) {
		this.entity = entity;
	}
	/**
	 * 获取onclick函数名称
	 * @return
	 */
	public String getOnClickFunName(){
		//获取当前字段的onclick方法名称
		return this.pojo.getFormEntityTablename()+"_"+this.pojo.getFormFieldTablename()+this.form.getFormDefCode()+"_click(e)";
	}
	
	/**
	 * 获取drawdate方法 （针对日期控件）
	 * @return
	 */
	public String getOnDrawdateFunName(){
		//获取当前字段的onclick方法名称
		return this.pojo.getFormEntityTablename()+"_"+this.pojo.getFormFieldTablename()+this.form.getFormDefCode()+"_drawdate";
	}
	

	/**
	 * 获取onbuttonclick函数名称 lookup专用
	 * @return
	 */
	public String getOnButtonClickFunName(String formId){
		//获取当前字段的onclick方法名称
		String id=this.getJsId("fun",formId);
		return id+"_"+this.form.getFormDefCode()+"_onbuttonclick";
	}
	
	/**
	 * 获取数据库类型
	 * @return
	 */
	public String getDatabaseType(){
		return (String)entityColumn.get("fieldType");
	}
	

	
	
	/**
	 * 获取onvaluechange函数名称
	 * @return
	 */
	public String getOnValueChangeFunName(long formId){
		//获取当前字段的onclick方法名称
		return this.pojo.getFormEntityTablename()+"_"+ChangeCode.getUniqueCode(this.pojo.getFormEntityTablename(), this.pojo.getFormFieldTablename()).toUpperCase()+"_valueChange_"+String.valueOf(formId)+"(e)";
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
	
	public String getJsId1(String flage){
		String[] ef = this.getFiledName();
		String entityName = ef[0];
		String fieldName = ef[1];
		
		if("fun".equals(flage)) {
			return entityName+"_"+fieldName;
		}else if("id".equals(flage)){
			return entityName+"."+fieldName;
		}else if("name".equals(flage)) {
			return fieldName;
		}
		return entityName+"."+fieldName;
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
	
	/**
	 * 获取onvaluechange函数名称
	 * @return
	 */
	public String getOnValidationFunName(){
		//获取当前字段的onclick方法名称
		return this.pojo.getFormEntityTablename()+"_"+this.pojo.getFormFieldTablename()+"_validation(e)";
	}




	/**
	 * 提供空的构造函数
	 *
	 */
	public SysFormColumnCache(){}
	
	/**
	 * 构造函数  通过数据库加载
	 * @param columnId
	 */
	public SysFormColumnCache(SysFormColumn pojo,SysFormconfigCache form) throws Exception{
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		this.form =form;
		SysFormColumn obj =  sysformconfigService.getFormColumnReal(pojo.getFormColumnId().toString());
		if(obj==null){
			//log.error("实例化字段错误; 字段ID:"+columnId+" 原因:找不到该字段id的数据对象",new Exception("实例化字段错误"));
			return ;
		}
		this.setThisByMap(obj);
//		初始化字段实体信息
		this.pojo = pojo;
		this.setEntityColumn();
		this.setField();
		this.setEntity();
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
						form.setFieldIsLog(true);
					}
				}
			}
		}
	
	}
	
	/**
	 * 构造函数  通过Map<String,Object>加载
	 * @param obj
	 */
	public SysFormColumnCache(Map<String,Object> obj,SysFormconfigCache form){
		this.form = form;
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
					form.setFieldIsLog(true);
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
		this.field = sysformconfigService.getFieldById(this.getPojo().getFormColumnColumnId()+"");
	}
	
	private void setEntity() {
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		this.entity = sysformconfigService.getEntityById(this.field.getFieldEntityId()+"");
	}
	
	//setAppClass
	public void setAppClass() throws Exception{
		IsysFormColumnService columnService = (IsysFormColumnService)SpringContextUtils.getBeanById("SysFormColumnServiceImpl");
		//logger.info(columnService.queryAppClassByColumnId(this.getPojo().getFormColumnColumnId()+""));
		this.appClass = columnService.queryAppClassByColumnId(this.getPojo().getFormColumnId()+"");
	}
	
	/**
	 * 找到当前属于哪个组
	 * @param group
	 */
	public void setGroup() {
		List<SysFormGroupCache> groups = this.form.getGroups();
		for(SysFormGroupCache g:groups){
			if((g.getFormGroupId()+"").equals(this.pojo.getFormColumnGroupId())){
				this.group = g;
			}
		}
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
			this.formColumGui = new SysTextBoxCache(this.getFormColumnId()+"");
			
		}else if("2".equals(this.getFormColumnGuiType())){ //单选下拉控件
			this.formColumGui = new SysFormComboboxCache(this.getFormColumnId()+"",this);
			
		}else if("3".equals(this.getFormColumnGuiType())){ //单选框组
			this.formColumGui = new SysFormRadiobuttonlistCache(this.getFormColumnId()+"");
		}else if("4".equals(this.getFormColumnGuiType())){ //复选框组
			this.formColumGui = new SysFormRadiobuttonlistCache(this.getFormColumnId()+"");
		}/*else if("5".equals(this.getFormColumnGuiType())){
			this.formColumGui = new SysFormCheckboxCache(this.formColumnId+"");
		}*/else if("6".equals(this.getFormColumnGuiType())){
			this.formColumGui = new SysDatepickerCache(this.getFormColumnId()+"");
		}else if("7".equals(this.getFormColumnGuiType())){
			this.formColumGui = new SysFormLookupCache(this.getFormColumnId()+"");
		}else if("10".equals(this.getFormColumnGuiType())){ //富文本
			this.formColumGui = new SysFormRichtextCache(this.getFormColumnId()+"",this.getJsId("fun",form.getFormDefId()+""));
			
		}else if("9".equals(this.getFormColumnGuiType())){
			this.formColumGui = new SysFormFileuploadCache(this.getFormColumnId()+"",this.getJsId("fun",form.getFormDefId()+""));
		}
		
		return htmls ;
	}
	
	/**
	 *
	 * @return 返回字符串数组有固定长度为5  根据不同的页面布局类型每个角标的字符串对应意义可能有区别
	 * @throws Exception 
	 */
	@SuppressWarnings("unused")
	public String[] getHtmlsFrom(SysRequestParam request,String showType,String isApp) throws Exception{	
		String[] htmls = new String[SysCardFormBeansUtil.HTML_SILZE];
		//判断布局类型
		String formLayoutType = this.form.getFormDefLayoutType();
		//强转控件对象
		boolean isHide = false;
		boolean isDisable = false;//是否只读  默为可编辑
		boolean isAslable = false; //是否作为 lable显示
		boolean isAccount = false; //是否做合计字段
		if (this.getPojo().getFormColumnTotal()!=null&&this.getPojo().getFormColumnTotal().equals("Y")) {
			isAccount = true;
		} 
		//隐藏域
		if("hide".equals(showType)){
			isHide = true;
		}else if("readonly".equals(showType)) {
			isDisable = true;
		}else if("lable".equals(showType)){
			isAslable = true;
		}
		String str = "";
		
		String entityName = "";
		String fieldName = "";
		boolean isRequired ="Y".equals(this.pojo.getFormColumnRequired());
		if("1".equals(this.pojo.getFormColumnType())){ //实体列需要总对应实体对象中获取表名和字段名
			entityName = (String) this.entityColumn.get("entityTableName");
			fieldName = (String) this.entityColumn.get("fieldTablename");
		}else if("2".equals(this.pojo.getFormColumnType())){ //虚拟列直接从当前对象中获取
			entityName=this.pojo.getFormEntityTablename();
			fieldName = this.pojo.getFormFieldTablename();
		}
		
		String vtype = null;
		String errorText = null;// 验证信息
		String emptyText = null;
		boolean isValueChange =false;
		boolean isOnclick = false;
		boolean isValidation = false;
		
		String dictTypeId = null;
		String url = null;
		String data = null;
		String ColumnName = ChangeCode.getUniqueCode(this.getPojo().getFormEntityTablename().toUpperCase(), this.getPojo().getFormFieldTablename()).toUpperCase();
		if("1".equals(formLayoutType)||(isApp!=null&&isApp.equals("CARDANDCARD"))||(isApp!=null&&isApp.equals("CARDANDCARD_MAIN"))){ //卡片式表单

			String formId = this.getPojo().getFormColumnFormDefId().toString();
			/**
			 * 角标0 存储的是body等html代码对应的html片段
			 * 角标1 存储的为页面中window.onload的js片段 包含数据初始化和控件初始化两种类型js
			 * 角标2 存储的是onclick时间
			 * 角标3 存储的是onvaluechange对应的js片段
			 * 角标4 自定义校验js m.
			 * 角标7表单hidden区的html代码
			 * 角标8表单控件独有js代码 //加入combobox初始化控件js
			 * 角标9表单控件独有js代码 js变量全局区 头部位置
			 * 角标10单独存放富文本中必填配置时所需要生成的js
			 * 角标11当表单初始化函数请求数据后需要把对应富文本的内容回填上
			 * 角标12 流程表单上判断是否需要分组 使用
			 * 角标16卡卡附表字段只读样式
			 * 角标17卡卡附表字段隐藏样式
			 * 角标18卡卡主表展开参数值定义//列表表单字典数据
			 * 角标19卡卡附表合计参数值定义
			 * 角标20卡卡附表合计字段样式
			 * 角标21卡卡修改操作参数取值
			 * 角标22卡卡修改操作控件样式改变
			 * 角标23卡卡修改操作控件样式改变后赋值
			 * 角标24卡卡附表展开参数值定义
			 * 角标25卡卡附表jsp中初始化参数(获取会话参数/请求参数/常量)
			 * 角标26字典对象
			 * 
			 * 
			 * 
			 * 
			 * 角标15 生成lookup函数
			 */
			if((isApp!=null&&isApp.equals("CARDANDCARD"))||(isApp!=null&&isApp.equals("CARDANDCARD_MAIN"))){
				String jsForCC = "";
				
				htmls[18] = "var "+ColumnName+" = '';\n"+
							"if(arr.length>0&&arr[i]."+ColumnName+"!=null&&flowAction!='start'){\n"+
							ColumnName+" = arr[i]."+ColumnName+";\n"+
							"}\n";
				
				htmls[24] = "var "+ColumnName+" = '';\n"+
							"if(arr.length>0&&arr[i]."+ColumnName+"!=null){\n"+
							ColumnName+" = arr[i]."+ColumnName+";\n"+
							"}\n";
				if (isHide == true){
					jsForCC = CardAndCardFormBeansUtil.getTextBoxHtmlForCC(SysCardFormBeansUtil.CARD_FORM_HIDDEN, this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName, vtype, "",errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),this.getFormColumnHeight(),this.getPojo().getFormColumnFormDefId().longValue(),isApp,"",this.pojo.getFormColumnLable());
					htmls[17] = jsForCC;
				}else{
					jsForCC = CardAndCardFormBeansUtil.getTextBoxHtmlForCC(SysCardFormBeansUtil.CARD_FORM_TEXT_BOX, this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName, vtype, "",errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),this.getFormColumnHeight(),this.getPojo().getFormColumnFormDefId().longValue(),isApp,"",this.pojo.getFormColumnLable());
					htmls[16] = jsForCC;
				}
				if(isAccount){
					jsForCC = "var "+ColumnName+"_all = 0;\n"+
							  "for (var i = arr.length - 1; i >= 0; i--) {\n"+
							  "    "+ColumnName+"_all += parseInt(arr[i]."+ColumnName+");\n"+
							  "}\n";
					htmls[19] = jsForCC;
					jsForCC = CardAndCardFormBeansUtil.getTextBoxHtmlForCC(SysCardFormBeansUtil.CARD_FORM_TEXT_BOX, this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_all",fieldName+"_all", vtype, "",errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),this.getFormColumnHeight(),this.getPojo().getFormColumnFormDefId().longValue(),isApp,"",this.pojo.getFormColumnLable()+"总计");
					htmls[20] = jsForCC;
				}
			}
			String guiType = this.getFormColumnGuiType(); //获取控件类型
			if (isHide == false) {
//				str+=SysCardFormBeansUtil.getTdHtml(null, null, this.form.getPojoform().getFormLableWidth(), null,0);
				if (isApp!=null&&isApp.equals("APP")) {
					str+=SysCardFormBeansUtil.CARD_FORM_CELL_START_APP;
					str+=SysCardFormBeansUtil.CARD_FORM_lable_START_APP;
				} else {
					str+=SysCardFormBeansUtil.CARD_FORM_CELL_START;
					str+=SysCardFormBeansUtil.CARD_FORM_lable_START;
				}
				
				str+=this.pojo.getFormColumnLable()+": ";
				
				if (isApp!=null&&isApp.equals("APP")) {
					str+=SysCardFormBeansUtil.CARD_FORM_lable_END_APP;
				} else {
					str+=SysCardFormBeansUtil.CARD_FORM_lable_END;
				}
//				str+=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
//				str+=SysCardFormBeansUtil.getTdHtml(this.pojo.getFormColumnAlign(), null, null, null,this.getFormColumnColSpan());
			}
			if ("1".equals(guiType) || "8".equals(guiType)) { // textbox控件处理
				SysTextBoxCache textbox  = (SysTextBoxCache)this.formColumGui;
				try {
					emptyText = textbox.getTextboxEmptytext();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				if (isHide == true) {
					String textboxCheckType = "";
					if(textbox.getPojo()!=null&&textbox.getPojo().getTextboxId()!=null&&!"0".equals(textbox.getPojo().getTextboxId())){ //满足说明用户保存该控件的扩展属性
						textboxCheckType = textbox.getPojo().getTextboxCheckType();
						Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, textbox.getTextboxDataFromType(), textbox.getTextboxDataFromValue(), null, null,  textbox.getTextboxInitFun(), 
								null, null,null, this,false,null,null,false,null,isApp);
					}
					
					//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAslable, params);
					if (isApp!=null&&isApp.equals("CARDANDCARD")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,textboxCheckType,this.pojo.getFormColumnLable());
						htmls[0] = str;
					}else if (isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
						if(this.getPojo().getFormFieldTablename().equals("businessId_IS")){
							str = "'<div class=\"BUSSINESS_ID\"><h5 class=\"BUSSINESS_ID_label\">"+this.getPojo().getFormColumnLable()+":</h5><input class=\"BUSSINESS_ID_value\" readonly type=\"text\" id=\""+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"\" name=\""+ColumnName+"\" value=\"'+"+ColumnName+"+'\"/></div>'+\n";
							htmls[0] = str;
							htmls[18] += "if(flowAction=='start'){\n";
							htmls[18] += ColumnName+"= getBUSSINESSID_IS(8,16);\n";
							htmls[18] += "}\n";
						}else {
							str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2_MAIN(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,textboxCheckType,this.pojo.getFormColumnLable());
							htmls[0] = str;
							htmls[25] = getInitDateMain(textbox.getTextboxDataFromType(),textbox.getTextboxDataFromValue(),formId,this.getFormColumnId()+"");
							htmls[18] += "if(flowAction=='start'){\n";
							htmls[18] += getSetInitDateMain(ColumnName,textbox.getTextboxDataFromType(),textbox.getTextboxDataFromValue(),textbox.getTextboxInitFun(),formId,this.getFormColumnId()+"");
							htmls[18] += "}\n";
						}
					} else {
						str += SysCardFormBeansUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,textboxCheckType,this.getPojo().getFormColumnLable());
						htmls[7] = str;
					}
				}else {
					String textboxCheckType = "";
					if (textbox.getPojo() != null && textbox.getPojo().getTextboxId() != null && !"0".equals(textbox.getPojo().getTextboxId())) { //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getTextBoxHtml(textbox, entityName, fieldName, htmls, request, this, isAslable,isApp);
						vtype = (String)ret[0];
						errorText = (String)ret[8];
						isValueChange = (Boolean) ret[2];
						isOnclick = (Boolean) ret[3];
						isValidation = (Boolean) ret[4];
						
						textboxCheckType = textbox.getPojo().getTextboxCheckType();
					}
					
					String classType = "1".equals(guiType)? SysCardFormBeansUtil.CARD_FORM_TEXT_BOX:SysCardFormBeansUtil.CARD_FORM_TEXT_AREA;
					
					String othervtype = "";
					// 张乐修改，把最小值和最大值放在其他验证里
					String maxLength = this.getFormColumnMaxLength();
					String minLength = this.getFormColumnMinLength();
					
					if (!maxLength.equals("")&&maxLength!=null) {
						othervtype += "maxLength:" + maxLength + ";";
					} 
					
					if (!minLength.equals("")&&minLength!=null) {
						othervtype += "minLength:" + minLength + ";";
					}
					
					try {
						if (!vtype.equals("")&&vtype!=null) {
							if (vtype.endsWith(";")) {
								vtype += "illegalChar";
							} else {
								vtype += ";illegalChar";
							}
						} else {
							vtype = "illegalChar";
						}
					} catch (Exception e) {
						// TODO: handle exception
						vtype = "illegalChar";
					}
					if (isApp!=null&&isApp.equals("CARDANDCARD")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2(classType, this.getJsId("id",formId),fieldName, vtype, othervtype,errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),this.getFormColumnHeight(),this.getPojo().getFormColumnFormDefId().longValue(),isApp,textboxCheckType,this.pojo.getFormColumnLable());
						if (!isDisable) {
							if(vtype!=null&&(vtype.indexOf("int")!=-1||vtype.indexOf("float")!=-1||vtype.indexOf("naturalNumber")!=-1)){
								htmls[22] = "xx.find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"']\").attr(\"readonly\",false);\n" +
											"xx.find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"']\").attr(\"class\",\"form-control\");\n" +
											"xx.find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"']\").css(\"display\",\"inline\");\n" +
											"xx.find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"']\").attr(\"type\",\"number\");\n";
							}else {
								htmls[22] = "xx.find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"']\").attr(\"readonly\",false);\n" +
											"xx.find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"']\").css(\"display\",\"inline\");\n" +	
											"xx.find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"']\").attr(\"class\",\"form-control\");\n";
							}
							if (isValueChange) {
								htmls[22] += "xx.find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"']\").attr(\"onchange\",\"" + (entityName + "_" + fieldName.toUpperCase()).replaceAll("\\.", "_") + "_valueChange_"+String.valueOf(formId)+"(this)\");\n";
							}
						}
					}else if (isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2_MAIN(classType, this.getJsId("id",formId),fieldName, vtype, othervtype,errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),this.getFormColumnHeight(),this.getPojo().getFormColumnFormDefId().longValue(),isApp,textboxCheckType,this.pojo.getFormColumnLable());
						if (textbox.getTextboxDataFromType()!=null&&!textbox.getTextboxDataFromType().equals("choose")) {
							htmls[25] = getInitDateMain(textbox.getTextboxDataFromType(),textbox.getTextboxDataFromValue(),formId,this.getFormColumnId()+"");
							htmls[18] += "if(flowAction=='start'){\n";
							htmls[18] += getSetInitDateMain(ColumnName,textbox.getTextboxDataFromType(),textbox.getTextboxDataFromValue(),textbox.getTextboxInitFun(),formId,this.getFormColumnId()+"");
							htmls[18] += "}\n";
						}
					} else {
						str += SysCardFormBeansUtil.getTextBoxHtml(classType, this.getJsId("id",formId),fieldName, vtype, othervtype,errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),this.getFormColumnHeight(),this.getPojo().getFormColumnFormDefId().longValue(),isApp,textboxCheckType,this.getPojo().getFormColumnLable());
						str+=SysCardFormBeansUtil.CARD_FORM_CELL_END;
					}
					
					htmls[0] = str;
				}
			} else if ("2".equals(guiType)) { // comnbox控件处理
				SysFormComboboxCache combobox =  (SysFormComboboxCache)this.formColumGui;
				boolean isExit = false;
				if(combobox!=null&&combobox.getComboboxId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				boolean ShowNullItem = true;
				if(combobox.getPojo().getComboboxShownullitem()!=null){
					if(combobox.getPojo().getComboboxShownullitem().equals("N")||combobox.getPojo().getComboboxShownullitem().equals("")){
						ShowNullItem = false;
					}
				}else {
					ShowNullItem = false;
				}
				
				boolean multiselect = false; 
				if(combobox.getPojo().getComboboxMultiselect()!=null&&(combobox.getPojo().getComboboxMultiselect().equals("Y")||combobox.getPojo().getComboboxMultiselect().equals("true"))){
					multiselect = true;
				}
				String textField = isExit==false?null:(combobox.getComboboxTextfield());
				String valueField = isExit==false?null:(combobox.getComboboxValuefield());
				emptyText = isExit==false?null:( combobox.getComboboxEmptytext());
				boolean allowInput = isExit==false?false:( "1".equals(combobox.getComboboxAllowinput()));
				String dataField =isExit==false?null:( combobox.getComboboxDatafield());
				String nullItemText =isExit==false?null:( combobox.getComboboxNullitemtext());
				if(!ShowNullItem){
					nullItemText=null;
				}
				
				if (isHide == true) {
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, combobox.getComboboxDataFromType(), combobox.getComboboxDataFromValue(), null, null,  combobox.getComboboxInitFun(), 
								null, null,null, this,false,null,null,false,combobox.getPojo().getComboboxDictNameColumn()+"",isApp);
					}
					//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAslable, params);
					if (isApp!=null&&isApp.equals("CARDANDCARD")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"","");
						htmls[0] = str;
					}else if (isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2_MAIN(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"","");
						htmls[0] = str;
					}else {
						str += SysCardFormBeansUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"",this.getPojo().getFormColumnLable());
						htmls[7] = str;
					}
				} else {
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getComboboxHtml(combobox, entityName, fieldName, htmls, request, this,isAslable,this.formColumnComboboxGuiInitFun,false,combobox.getPojo().getComboboxDictNameColumn(),isApp);
						vtype =(String)ret[0];
						isValueChange =(Boolean)ret[2];
						isOnclick =(Boolean)ret[3];
						isValidation =(Boolean)ret[4];
						dictTypeId = (String)ret[5];
						url = (String)ret[6];
						data = (String)ret[7];
					}
					if (combobox.getPojo().getComboboxDictNameColumn()!=null && !combobox.getPojo().getComboboxDictNameColumn().equals("")) {
						isValueChange = true;
					}
					String paramType = "";
					String paramValeu = "";
					if(combobox.getComboboxDataFromType()!=null&&combobox.getComboboxDataFromValue()!=null){
						paramType = combobox.getComboboxDataFromType();
						paramValeu = combobox.getComboboxDataFromValue();
					}
					String classType = dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_COMBO_BOX:SysCardFormBeansUtil.CARD_FORM_DICT_COMBO_BOX;
					String isSearch = "N";
					if (combobox!=null&&combobox.getPojo().getComboboxIsSearch()!=null&&(combobox.getPojo().getComboboxIsSearch().equals("Y")||combobox.getPojo().getComboboxIsSearch().equals("true"))) {
						isSearch = "Y"; 
					}
					//String guiInitType = combobox.getPojo().getComboboxGuiInitType();
					if (isApp!=null&&isApp.equals("CARDANDCARD")) {
						
						htmls[18] += ColumnName+" = "+combobox.getPojo().getComboboxGuiInitValue()+"["+ColumnName+"];\n";
						htmls[18] += "var "+ColumnName+"_DICTNAME = '';\n"+
									 "if(arr.length>0&&arr[i]."+ColumnName+"_DICTNAME!=null&&flowAction!='start'){\n"+
									 ColumnName+"_DICTNAME = arr[i]."+ColumnName+"_DICTNAME;\n"+
									 "}\n";
						htmls[24] += "var "+ColumnName+"_DICTNAME = '';\n"+
									"if(arr.length>0&&arr[i]."+ColumnName+"_DICTNAME!=null){\n"+
									ColumnName+"_DICTNAME = arr[i]."+ColumnName+"_DICTNAME;\n"+
									"}\n";
						htmls[16] = CardAndCardFormBeansUtil.getComboboxHtmlForCC_MAIN(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,this.pojo.getFormColumnLable(),vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,true,entityName,this.getFormColumnWidth()
									,ShowNullItem,textField,valueField,allowInput,combobox.getPojo().getComboboxGuiInitValue(),nullItemText,url,data,dataField,multiselect,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.getFormColumnId()+"",paramType,paramValeu,"",isSearch);
						
						str = CardAndCardFormBeansUtil.getComboboxHtmlForCC(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,this.pojo.getFormColumnLable(),vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth()
								,ShowNullItem,textField,valueField,allowInput,combobox.getPojo().getComboboxGuiInitValue(),nullItemText,url,data,dataField,multiselect,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.getFormColumnId()+"",paramType,paramValeu,"",isSearch);
						if (!isDisable) {
							htmls[21] = "var "+this.getPojo().getFormFieldTablename()+"_value = xx.find(\"[name='"+ColumnName+"']\").eq(1).val();\n";
							htmls[22] = CardAndCardFormBeansUtil.getComboboxHtmlForCC2(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,this.pojo.getFormColumnLable(),vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth()
									,ShowNullItem,textField,valueField,allowInput,combobox.getPojo().getComboboxGuiInitValue(),nullItemText,url,data,dataField,multiselect,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.getFormColumnId()+"",paramType,paramValeu,"",isSearch);

							if(isSearch.equals("N")){
								htmls[23] = "$(\"#\"+x).find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"_select']\").val("+this.getPojo().getFormFieldTablename()+"_value);\n";
							}else{
								htmls[23] = "$(\"#\"+x).find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"_select']\").selectpicker('val', "+this.getPojo().getFormFieldTablename()+"_value);\n";
							}
						}
						
						
						
					}else if (isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
						
						str = CardAndCardFormBeansUtil.getComboboxHtmlForCC_MAIN(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,this.pojo.getFormColumnLable(),vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth()
								,ShowNullItem,textField,valueField,allowInput,combobox.getPojo().getComboboxGuiInitValue(),nullItemText,url,data,dataField,multiselect,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.getFormColumnId()+"",paramType,paramValeu,"",isSearch);
						if (this.getPojo().getFormColumnShowType()!=null&&this.getPojo().getFormColumnShowType().equals("readonly")) {
							htmls[25] = getInitDateMain(combobox.getComboboxDataFromType(),combobox.getComboboxDataFromValue(),formId,this.getFormColumnId()+"");
							htmls[18] += "var "+ColumnName+"_DICTNAME = '';\n"+
										 "if(arr.length>0&&arr[i]."+ColumnName+"_DICTNAME!=null&&flowAction!='start'){\n"+
										 ColumnName+"_DICTNAME = arr[i]."+ColumnName+"_DICTNAME;\n"+
										 "}\n";
							htmls[18] += "if(flowAction=='start'){\n";
							htmls[18] += getSetInitDateMain(ColumnName,combobox.getComboboxDataFromType(),combobox.getComboboxDataFromValue(),combobox.getComboboxInitFun(),formId,this.getFormColumnId()+"");
							htmls[18] += ColumnName+"_DICTNAME = "+ColumnName+";\n";
							htmls[18] += "}\n";
						}else {
							if(isSearch.equals("N")){
								if (multiselect) {
									htmls[23] = "if("+fieldName.toUpperCase()+".indexOf(\",\")>-1){\n" +
												"	$(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"']\").selectpicker('val',"+fieldName.toUpperCase()+".split(','));\n" +
												"}\n";
								}else{
									htmls[23] = "$(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"']\").val("+fieldName.toUpperCase()+");\n";
								}
								
							}else{
								htmls[23] = "$(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"']\").selectpicker('val',"+fieldName.toUpperCase()+");\n";
							}
						}
					} else {
						str += SysCardFormBeansUtil.getComboboxHtml(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,this.pojo.getFormColumnLable(),vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth()
								,ShowNullItem,textField,valueField,allowInput,combobox.getPojo().getComboboxGuiInitValue(),nullItemText,url,data,dataField,multiselect,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.getFormColumnId()+"",paramType,paramValeu,"",isSearch);
						str+=SysCardFormBeansUtil.CARD_FORM_CELL_END;
					}
					
					htmls[0] = str;
				}
			}else if("3".equals(guiType)||"4".equals(guiType)) { //单选框组 或者复选框组
				SysFormRadiobuttonlistCache radio = (SysFormRadiobuttonlistCache)this.formColumGui;
				boolean isExit = false; 
				if(radio!=null&&radio.getRadiolistId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				String repeatItems =isExit==false?null:( radio.getRadiolistRepeatitems());
				String repeatdirection =isExit==false?null:(  radio.getRadiolistRepeatdirection());
				String repeatLayout =isExit==false?null:(  radio.getRadiolistRepeatlayout());
				String textField = isExit==false?null:( radio.getRadiolistTextField());
				String valueField =isExit==false?null:( radio.getRadiolistValueField());
				String dataField = isExit==false?null:( radio.getRadiolistDataField());
				
				if(isHide==true){
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, radio.getRadiolistDataFromType(), radio.getRadiolistDataFromValue(), null, null,  radio.getRadiolistInitFun(), 
								null, null,null, this,false,null,null,false,null,isApp);
					}
					
					//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAslable, params);
					if (isApp!=null&&isApp.equals("CARDANDCARD")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"","");
						htmls[0] = str;
					}else if (isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2_MAIN(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"","");
						htmls[0] = str;
					}else {
						str += SysCardFormBeansUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN, this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"",this.getPojo().getFormColumnLable());
						htmls[7] = str;
					}
					
				}else {
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getRadiolistHtml(radio, entityName, fieldName, htmls, request, this,isAslable,isApp);
						vtype =(String)ret[0];
						isValueChange =(Boolean)ret[2];
						isOnclick =(Boolean)ret[3];
						isValidation =(Boolean)ret[4];
						dictTypeId = (String)ret[5];
						url = (String)ret[6];
						data = (String)ret[7];
					}
					String classType = null;
					if("3".equals(guiType)){
						classType=dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_RIDIOLIST_BOX:SysCardFormBeansUtil.CARD_FORM_DICT_RIDIOLIST_BOX;
					}else {
						classType=dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_CHECK_BOX_LIST:SysCardFormBeansUtil.CARD_FORM_DICT_CHECK_BOX_LIST;
					}
					 if (isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
							str = CardAndCardFormBeansUtil.getRadiolistHtml(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),repeatItems,textField,valueField,repeatdirection,dictTypeId,repeatLayout,url,data,dataField,Long.valueOf(this.getPojo().getFormColumnFormDefId()+""),this.getFormColumnLable());
							htmls[25] = getInitDateMain(radio.getRadiolistDataFromType(),radio.getRadiolistDataFromValue(),formId,this.getFormColumnId()+"");
							htmls[18] += "var "+ColumnName+"_DICTNAME = '';\n"+
										 "if(arr.length>0&&arr[i]."+ColumnName+"_DICTNAME!=null&&flowAction!='start'){\n"+
										 ColumnName+"_DICTNAME = arr[i]."+ColumnName+"_DICTNAME;\n"+
										 "}\n";
							htmls[18] += "if(flowAction=='start'){\n";
							//htmls[18] += getSetInitDateMain(ColumnName,combobox.getComboboxDataFromType(),combobox.getComboboxDataFromValue(),combobox.getComboboxInitFun(),formId,this.getFormColumnId()+"");
							htmls[18] += ColumnName+"_DICTNAME = "+ColumnName+";\n";
							htmls[18] += "}\n";
							
							htmls[23] = "$(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"']\").find(\"[value='\"+"+fieldName.toUpperCase()+"+\"']\").click();\n";
							
						} else {
							str += SysCardFormBeansUtil.getRadiolistHtml(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),repeatItems,textField,valueField,repeatdirection,dictTypeId,repeatLayout,url,data,dataField,Long.valueOf(this.getPojo().getFormColumnFormDefId()+""));
							str +=SysCardFormBeansUtil.CARD_FORM_TABLE_TD_END;
						}
					htmls[0] = str;
				}
				
			}else if("5".equals(guiType)) { //单个复选框
				SysCheckboxCache checkbox = (SysCheckboxCache)this.formColumGui;
				boolean isExit = false; 
				if(checkbox!=null&&checkbox.getCheckboxId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				String showName = isExit==false?null:checkbox.getCheckboxShowName();
				
				if(isHide==true){
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, checkbox.getCheckboxDataFromType(), checkbox.getCheckboxDataFromValue(), null, null,  checkbox.getCheckboxInitFun(), 
								null, null,null, this,false,null,null,false,null,isApp);
					}
					str += SysCardFormBeansUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"",this.getPojo().getFormColumnLable());
					htmls[7] = str;
				}else {
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getCheckboxHtml(checkbox, entityName, fieldName, htmls, request, this,isAslable,isApp);
						vtype =(String)ret[0];
						isValueChange =(Boolean)ret[2];
						isOnclick =(Boolean)ret[3];
						isValidation =(Boolean)ret[4];
					}
					String classType = null;
					classType=SysCardFormBeansUtil.CARD_FORM_CHECKBOX;
					str +=SysCardFormBeansUtil.getCheckboxHtml(classType, this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype, emptyText, isRequired, isValueChange, isOnclick, isValidation, isDisable, entityName, this.getFormColumnWidth(), showName,this.getPojo().getFormColumnFormDefId().longValue());
					str+=SysCardFormBeansUtil.CARD_FORM_CELL_END;
					htmls[0] = str;
				}
				
			}else if("6".equals(guiType)) { //日期格式控件
				SysDatepickerCache datepicker = (SysDatepickerCache)this.formColumGui;
				boolean isExit = false; 
				if(datepicker!=null&&datepicker.getDatepickerId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				String format = isExit==false?null:datepicker.getDatepickerFormat();
				String timeformat = isExit==false?null:datepicker.getDatepickerTimeformat();
				boolean showtime = isExit==false?false:"1".equals(datepicker.getDatepickerShowtime());
				boolean showokbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowokbutton());
				boolean showclearbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowclearbutton());
				boolean allowinput = isExit==false?false:"1".equals(datepicker.getDatepickerAllowinput());
				boolean showtodaybutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowtodaybutton());
				boolean isDrawdate = datepicker.getDatepickerDrawdateFun()!=null&&!"".equals(datepicker.getDatepickerDrawdateFun());
				
				if(isHide==true){
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, datepicker.getDatepickerDataFromType(), datepicker.getDatepickerDataFromValue(), null, null,  datepicker.getDatepickerInitFun(), 
								null, null,null, this,false,null,null,false,null,isApp);
					}
					if (isApp!=null&&isApp.equals("CARDANDCARD")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"","");
						htmls[0] = str;
					}else if (isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
						str = CardAndCardFormBeansUtil.getTextBoxHtmlForCC2_MAIN(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"","");
						htmls[0] = str;
					} else {
						str += SysCardFormBeansUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,this.getPojo().getFormColumnFormDefId().longValue(),isApp,"",this.getPojo().getFormColumnLable());
						htmls[7] = str;
					}
				}else {
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getDatepickerHtml(datepicker, entityName, fieldName, htmls, request, this,isAslable,false,isApp);
						vtype =(String)ret[0];
						isValueChange =(Boolean)ret[2];
						isOnclick =(Boolean)ret[3];
						isValidation =(Boolean)ret[4];
					}
					
					String classType = null;
					
//					classType="yyyy-MM-dd HH:mm:ss".equals(datepicker.getDatepickerFormat())?SysCardFormBeansUtil.CARD_FORM_DATEPICKER1:SysCardFormBeansUtil.CARD_FORM_DATEPICKER1;
					String dateChange = ColumnName+" = new Date(parseInt("+ColumnName+")).Format(\""+datepicker.getDatepickerFormat()+"\");\n";
					if (isApp!=null&&isApp.equals("APP")) {
						if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd")) {
							classType = "date";
						}else if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd HH:mm:ss")) {
							classType = "datetime";
						}else if (datepicker.getDatepickerFormat().equals("hh:mm")) {
							classType = "time";
						}else if (datepicker.getDatepickerFormat().equals("yyyyMM")) {
							classType = "month";
						}
					} else {
						if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd")) {
							classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER1;
						}else if (datepicker.getDatepickerFormat().equals("yyyy-MM-dd HH:mm:ss")) {
							classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER2;
						}else if (datepicker.getDatepickerFormat().equals("hh:mm")) {
							classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER3;
						}else if (datepicker.getDatepickerFormat().equals("yyyyMM")) {
							classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER4;
							dateChange = "";
						}else if (datepicker.getDatepickerFormat().equals("yyyy/MM/dd")) {
							classType = SysCardFormBeansUtil.CARD_FORM_DATEPICKER5;
						}
					}
					
					if (isApp!=null&&isApp.equals("CARDANDCARD")) {
						htmls[18] += "if("+ColumnName+"!=null&&"+ColumnName+"!=''&&flowAction!='start'){\n"+
									 ColumnName+" = new Date(parseInt("+ColumnName+")).Format(\""+datepicker.getDatepickerFormat()+"\");\n"+
									 "}else{"+ColumnName+"=\"\"}\n";
						htmls[24] += "if("+ColumnName+"!=null&&"+ColumnName+"!=''){\n"+
									 "		"+dateChange+
									 "}else{"+ColumnName+"=\"\"}\n";
						str = CardAndCardFormBeansUtil.getDatepickerHtmlForCC(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth()
								,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,isDrawdate,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.pojo.getFormColumnLable());
						if (!isDisable) {
							htmls[21] = "var "+this.getPojo().getFormFieldTablename()+"_value = xx.find(\"[name='"+ColumnName+"']\").eq(0).val();\n";
							htmls[22] = CardAndCardFormBeansUtil.getDatepickerHtmlForCC2(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth()
									,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,isDrawdate,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.pojo.getFormColumnLable());
							htmls[23] = "$(\"#\"+x).find(\"[id='"+this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString())+"_\"+num+\"_datepick']\").val("+this.getPojo().getFormFieldTablename()+"_value);\n";
						}
						
					}else if (isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
						htmls[18] += "if("+ColumnName+"!=null&&"+ColumnName+"!=\"\"){\n"+
									 "		"+dateChange+
									 "}else{"+ColumnName+"=\"\"}\n";
						htmls[24] += "if("+ColumnName+"!=null&&"+ColumnName+"!=\"\"){\n"+
									 "		"+dateChange+
									 "}else{"+ColumnName+"=\"\"}\n";
						str = CardAndCardFormBeansUtil.getDatepickerHtmlForCC_MAIN(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth()
								,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,isDrawdate,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.pojo.getFormColumnLable());
						if (datepicker.getDatepickerDataFromType()!=null&&!datepicker.getDatepickerDataFromType().equals("choose")) {
							htmls[25] = getInitDateMain(datepicker.getDatepickerDataFromType(),datepicker.getDatepickerDataFromValue(),formId,this.getFormColumnId()+"");
							htmls[18] += "if(flowAction=='start'){\n";
							htmls[18] += getSetInitDateMain(ColumnName,datepicker.getDatepickerDataFromType(),datepicker.getDatepickerDataFromValue(),datepicker.getDatepickerInitFun(),formId,this.getFormColumnId()+"");
							htmls[18] += "}\n";
						}
					} else {
						str += SysCardFormBeansUtil.getDatepickerHtml(classType,this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth()
								,format,timeformat,showtime,showokbutton,showclearbutton,allowinput,showtodaybutton,isDrawdate,this.getPojo().getFormColumnFormDefId().longValue(),isApp,this.getPojo().getFormColumnLable());
						str += SysCardFormBeansUtil.CARD_FORM_CELL_END;
					}
					htmls[0] = str;//CARDANDCARD_MAIN
				}
			} else if ("7".equals(guiType)) { // lookup控件
				SysFormLookupCache lookup = (SysFormLookupCache)this.formColumGui;
				boolean isExit = false; 
				if(lookup!=null&&lookup.getLookupId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				
				if(isHide==true){
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, lookup.getLookupDataFromType(), lookup.getLookupDataFromValue(), null, null,  lookup.getLookupInitFun(), 
								null, null,null, this,false,null,null,false,null,isApp);
					}
					//SysCardFormColumnUtil.getCardFormGuiHtml(htmls, request, entityName, fieldName, null, null, null, null, initFun, guiInitType, guiInitValue, busId, column, isAslable, params);
					str += SysCardFormBeansUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN,this.getJsId("id",String.valueOf(form.getFormDefId())), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,form.getFormDefId(),isApp,"",this.getPojo().getFormColumnLable());
					htmls[7] = str;
				} else {
//					SysFormColumn c = this.form.serchColumnByColumnId(columnId)
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysCardFormColumnUtil.getLookupHtml(lookup, entityName, fieldName, htmls, request, this,isAslable,false,isApp);
						vtype =(String)ret[0];
						emptyText =(String)ret[1];
						isValueChange =(Boolean)ret[2];
						isOnclick =(Boolean)ret[3];
						isValidation =(Boolean)ret[4];
					}
					String classType = null;
					classType=SysCardFormBeansUtil.CARD_FORM_LOOKUP;
					str += SysCardFormBeansUtil.getLookupHtml(classType,this.getJsId("id",String.valueOf(form.getFormDefId())),fieldName,vtype , emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),this.getOnButtonClickFunName(String.valueOf(form.getFormDefId())),form.getFormDefId());
					str+=SysCardFormBeansUtil.CARD_FORM_CELL_END;
					htmls[0] = str;
				}
			}else if("10".equals(guiType)) { //富文本控件
				htmls[49] = "true";
				SysFormRichtextCache richtext = (SysFormRichtextCache)this.formColumGui;
				String textRichName = richtext.getRichTextName();
				boolean isExit = false; 
				if(textRichName!=null&&richtext.getRichTextId()!=0){ //满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				
				if(isHide==true){
					str += SysCardFormBeansUtil.getTextBoxHtml(SysCardFormBeansUtil.CARD_FORM_HIDDEN, this.getJsId("id",String.valueOf(form.getFormDefId())), fieldName, vtype,null, errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),null,form.getFormDefId(),isApp,"",this.getPojo().getFormColumnLable());
					htmls[7] = str;
				}else {
					if(isExit) {
						try {
							Object[] ret = SysCardFormColumnUtil.getRichtextHtml(richtext, entityName, fieldName, htmls, request, this,isRequired,isDisable,isAslable);
						}catch (Exception e) {
							e.printStackTrace();logger.error(e.getMessage(),e);
						}
					}
					textRichName = this.getPojo().getFormFieldTablename();
					str +=SysCardFormBeansUtil.getRichTextHtml(this.getJsId("id",this.getFormColumnFormDefId()+""),textRichName,fieldName,entityName,this.getFormColumnFormDefId(),isApp,this.getJsId("id",this.getFormColumnFormDefId()+""));
					str += SysCardFormBeansUtil.CARD_FORM_CELL_END;
					htmls[0] = str;
					richtext.setRichTextName(this.getPojo().getFormFieldTablename());
					if (htmls[9]==null) {
						htmls[9] = SysCardFormBeansUtil.RichText(this.getJsId("id",this.getFormColumnFormDefId()+""), this.getFormColumnFormDefId(),this.getPojo().getFormColumnId()+"");
					} else {
						htmls[9] += SysCardFormBeansUtil.RichText(this.getJsId("id",this.getFormColumnFormDefId()+""), this.getFormColumnFormDefId(),this.getPojo().getFormColumnId()+"");
					}
					
				}
			} else if ("9".equals(guiType)) { // 附件上传下载
				SysFormFileuploadCache fileupload = (SysFormFileuploadCache)this.formColumGui;
				String classType = "1".equals(guiType)? SysCardFormBeansUtil.CARD_FORM_TEXT_BOX:SysCardFormBeansUtil.CARD_FORM_TEXT_AREA;				
				boolean isExit = false; 
				if (fileupload != null && fileupload.getPojo().getFileuploadId().intValue() != 0) { // 满足说明用户保存该控件的扩展属性
					isExit = true;
				}
				String textboxCheckType = "";
				String othervtype = "";
				if (isHide == true) {
					str += SysCardFormBeansUtil.getTextBoxHtml(classType, this.getJsId("id",this.getPojo().getFormColumnFormDefId().toString()),fieldName, vtype, othervtype,errorText, emptyText, isRequired, isValueChange, isOnclick,isValidation,isDisable,entityName,this.getFormColumnWidth(),this.getFormColumnHeight(),this.getPojo().getFormColumnFormDefId().longValue(),isApp,textboxCheckType,this.getPojo().getFormColumnLable());
					htmls[7] = str;
				} else {
					if(isExit) {
						try {
							Object[] ret = SysCardFormColumnUtil.getFileuploadHtml(this.getJsId("id",this.getFormColumnFormDefId()+""),fileupload, entityName, fieldName, htmls, request, this,isRequired,isDisable,isAslable,this.getFormColumnId()+"");
						}catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();logger.error(e.getMessage(),e);
						}
					}
					str += SysCardFormBeansUtil.getFileuploadHtml(this.getJsId("id",this.getFormColumnFormDefId()+""), fileupload, fieldName, entityName, this.getFormColumnWidth(), isDisable,this.getFormColumnId()+"");
					str += SysCardFormBeansUtil.CARD_FORM_CELL_END;
					htmls[0] = str;
				}
			}
			
			if(isAslable){
				
				if(htmls[1]==null)htmls[1]="";
				String temp = SysCardFormBeansUtil.getAslableJs(this.getJsId("jsId",this.getPojo().getFormColumnFormDefId().toString()));
				htmls[1]+=temp;
			}
		} else if (("2".equals(formLayoutType)||"10".equals(formLayoutType)||"11".equals(formLayoutType))&&(!isApp.equals("CARDANDCARD"))) {//列表
	
			/**
			 * 角标0 存储的是body等html代码对应的html片段
			 * 角标1 存储的为页面中window.onload的js片段 包含数据初始化和控件初始化两种类型js
			 * 角标2 存储的是onclick时间
			 * 角标3 存储的是onvaluechange对应的js片段
			 * 角标4 自定义校验js m.
			 * 
			 * 
			 * 角标7表单hidden区的html代码
			 * 角标8表单控件独有js代码
			 * 角标9表单控件独有js代码 js变量全局区 头部位置
			 * 角标10单独存放富文本中必填配置时所需要生成的js
			 * 角标11当表单初始化函数请求数据后需要把对应富文本的内容回填上
			 * 角标18下拉字典参数
			 * 57,批量修改
			 */
			//根据不同的控件类型做不同处理
			boolean isCellEdite =false;
			boolean isRender =false;
			boolean readonly = false;
			boolean isSelfValidation = false;
			boolean isEdit = false;
			if (this.getPojo().getFormColumnShowType()!=null&&"edit".equalsIgnoreCase(this.getPojo().getFormColumnShowType())) {
				isEdit = true;
			}
			if(isAslable==true||isDisable==true){
				readonly = true;
			}
			
			if(1==2){
				//logger.info(111);
			}else {
				//logger.info(fieldName);
				String showtypeString = "visible : columnvisible."+fieldName;
				if(isHide==true){
					showtypeString = "visible : false";
				}
				String guiType = this.getFormColumnGuiType(); //获取控件类型
				String columnPosition = "left ";
				if (isApp!=null&&isApp.equals("APP")) {
					if (this.getAppClass()!=null) {
						columnPosition += this.getAppClass().getFontStyle()+" "+this.getAppClass().getTagStyle()+" ";
						if (this.getAppClass().getIsblod()!=null&&this.getAppClass().getIsblod().equals("Y")) {
							columnPosition += "bold";
						}
						if (this.getAppClass().getIshidden()!=null&&this.getAppClass().getIshidden().equals("Y")) {
							columnPosition += "hidden";
						}
					} 
				}
				if("1".equals(guiType)||"8".equals(guiType)) { //textbox控件处理
					SysTextBoxCache textbox  = (SysTextBoxCache)this.formColumGui;
					if(textbox.getPojo()!=null&&textbox.getPojo().getTextboxId()!=null&&!"0".equals(textbox.getPojo().getTextboxId())){ //满足说明用户保存该控件的扩展属性
						emptyText = textbox.getPojo().getTextboxEmptytext();
						Object[] ret = SysGridFormColumnUtil.getTextBoxHtml(textbox, entityName, fieldName, htmls, request, this,isAslable);
						vtype =(String)ret[0];
						isCellEdite =(Boolean)ret[2];
						isRender =(Boolean)ret[3];
						isValidation =(Boolean)ret[4];
						dictTypeId = (String)ret[5];
						url = (String)ret[6];
						data = (String)ret[7];
						isSelfValidation = (Boolean)ret[8];
					}
					String classType = "1".equals(guiType)? SysCardFormBeansUtil.CARD_FORM_TEXT_BOX:SysCardFormBeansUtil.CARD_FORM_TEXT_AREA;
					
					String othervtype = "";
					// 张乐修改，把最小值和最大值放在其他验证里
					String maxLength = this.getFormColumnMaxLength();
					String minLength = this.getFormColumnMinLength();
					if (!maxLength.equals("")&&maxLength!=null) {
						othervtype += "maxLength:" + maxLength + ";";
					} 
					
					if (!minLength.equals("")&&minLength!=null) {
						othervtype += "minLength:" + minLength + ";";
					}
					
					if (vtype!=null) {
						if (vtype.endsWith(";")) {
							vtype += "illegalChar";
						} else {
							vtype += ";illegalChar";
						}
					} else {
						vtype = "illegalChar";
					}
					
					String textboxCheckSelf = null;
					if(textbox.getPojo()!=null){
						textboxCheckSelf = textbox.getPojo().getTextboxCheckSelf();
					}
					
					htmls[13] = SysGridFormBeansUtil.getTextLinkAlertJs(textbox).toString();//textbox
				
					htmls[26]  = str + SysGridFormBeansUtil.getTextBoxHtmlForGrid(classType,this.getJsId("fun",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype ,othervtype, emptyText, isRequired,
							isValidation,isDisable,entityName,this.pojo.getFormColumnWidth(),this.pojo.getFormColumnLable(),isRender,this.getForm().getFormDefCode(),readonly,this.pojo.getFormColumnAlign(),textboxCheckSelf,this.pojo.getFormColumnHeight(),showtypeString,this.pojo.getFormColumnShowType(),this.pojo.getFormColumnColor(),textbox,isApp,columnPosition,isAccount);
					
					str += SysGridFormBeansUtil.getTextBoxHtml(classType,this.getJsId("fun",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype ,othervtype, emptyText, isRequired,
							isValidation,isDisable,entityName,this.pojo.getFormColumnWidth(),this.pojo.getFormColumnLable(),isRender,this.getForm().getFormDefCode(),readonly,this.pojo.getFormColumnAlign(),textboxCheckSelf,this.pojo.getFormColumnHeight(),showtypeString,this.pojo.getFormColumnColorCondition(),this.pojo.getFormColumnColor(),textbox,isApp,columnPosition,isAccount);
					htmls[0] = str;
					
				}else if("10".equals(guiType)){ //富文本框
					String othervtype = "";
					String textboxCheckSelf = null;
					SysFormRichtextCache richtextCache = (SysFormRichtextCache)this.formColumGui;
					str += SysGridFormBeansUtil.getTextBoxHtml("richText",this.getJsId("fun",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype ,othervtype, emptyText, isRequired,
							isValidation,isDisable,entityName,this.pojo.getFormColumnWidth(),this.pojo.getFormColumnLable(),isRender,this.getForm().getFormDefCode(),readonly,this.pojo.getFormColumnAlign(),textboxCheckSelf,this.pojo.getFormColumnHeight(),showtypeString,this.pojo.getFormColumnColorCondition(),this.pojo.getFormColumnColor(),null,isApp,columnPosition,isAccount);
					htmls[26] = str;
					htmls[0] = str;
				}else if("5".equals(guiType)){ //复选框
					SysCheckboxCache checkbox = (SysCheckboxCache)this.formColumGui;
					boolean isExit = false; 
					if(checkbox!=null&&checkbox.getCheckboxId()!=0){ //满足说明用户保存该控件的扩展属性
						isExit = true;
					}
					String showName = isExit==false?null:checkbox.getCheckboxShowName();
					if(isExit){ //满足说明用户保存该控件的扩展属性
						Object[] ret = SysGridFormColumnUtil.getCheckboxHtml(checkbox, entityName, fieldName, htmls, request, this,isAslable);
						vtype =(String)ret[0];
						isValueChange =(Boolean)ret[2];
						isRender =(Boolean)ret[3];
						isCellEdite =(Boolean)ret[2];
						isValidation =(Boolean)ret[4];
					}
					String classType = null;
					classType=SysCardFormBeansUtil.CARD_FORM_CHECKBOX;
					//
					str +=SysGridFormBeansUtil.getCheckboxHtml(classType, this.getJsId("fun",this.getPojo().getFormColumnFormDefId().toString()), fieldName, vtype, emptyText, isRequired, isCellEdite, isRender,
							isValidation, isDisable, entityName, this.getFormColumnWidth(), showName,this.getFormColumnLable(),this.form.getFormDefCode(),this.getFormColumnAlign());
					htmls[0] = str;
					htmls[26] = str;
				}else if("6".equals(guiType)){ //日期处理控件
					String str2 = "";
					fieldName = fieldName.toUpperCase();
					SysDatepickerCache datepicker = (SysDatepickerCache)this.formColumGui;
					boolean isExit = false; 
					if(datepicker!=null&&datepicker.getDatepickerId()!=0){ //满足说明用户保存该控件的扩展属性
						isExit = true;
					}
					String format = isExit==false?null:datepicker.getDatepickerFormat();
					String timeformat = isExit==false?null:datepicker.getDatepickerTimeformat();
					boolean showtime = isExit==false?false:"1".equals(datepicker.getDatepickerShowtime());
					boolean showokbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowokbutton());
					boolean showclearbutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowclearbutton());
					boolean allowinput = isExit==false?false:"1".equals(datepicker.getDatepickerAllowinput());
					boolean showtodaybutton =isExit==false?false: "1".equals(datepicker.getDatepickerShowtodaybutton());
					String width = "100";
					
					if(!this.getFormColumnWidth().equals("")&&this.getFormColumnWidth()!=null){
						width = this.getFormColumnWidth().substring(this.getFormColumnWidth().length()-2, this.getFormColumnWidth().length());
					}
					if (isApp!=null&&isApp.equals("APP")) {
						str =    "<div class=\""+columnPosition+" hidden\" v-if=\"item."+fieldName.toUpperCase()+"\">{{item."+fieldName.toUpperCase()+"}}</div>\n";
						str +=    "<div class=\""+columnPosition+"\" v-if=\"item."+fieldName.toUpperCase()+"_NEWDATE\">{{item."+fieldName.toUpperCase()+"_NEWDATE}}</div>\n";
					} else {
						str =    "            {"+"\n"
								+"                title : '"+this.getFormColumnLable()+"',"+"\n"
								+"                field : '"+fieldName+"',"+"\n"
								+"                align : 'center',"+"\n"
								+"                "+showtypeString+","+"\n"
								+"                valign : '"+this.getFormColumnAlign()+"',"+"\n"
//								+"                sortable : true,"+"\n"
								+"                formatter: function (value, row, index) {"+"\n";
						if (datepicker.getDatepickerDrawdateFun()!=null&&!datepicker.getDatepickerDrawdateFun().equals("")&&datepicker.getDatepickerDrawdateFun().indexOf("自定义")!=-1) {
							str +=   datepicker.getDatepickerDrawdateFun();
						}else {
							str +=    "                    var date = \"-\";"+"\n"
									+"                    if(value!=null){"+"\n"
									+"                    var val = value+\"\";\n"
									+"                    	if(((\""+datepicker.getDatepickerFormat().replace("HH", "hh")+"\"==\"hh:mm\")&&val.indexOf(\":\")>1)||(\""+datepicker.getDatepickerFormat()+"\"==\"yyyyMM\")){"+"\n"
									+"                    		date = value ;\n"
									+"                    	}else{\n"
									+"                        	date = new Date(value).Format(\""+datepicker.getDatepickerFormat().replace("HH", "hh")+"\");"+"\n"
									+"                    	}\n"
									+"                    }\n";
							String colorCondition = this.getPojo().getFormColumnColorCondition();
							str2 = str;
							if(colorCondition!=null && !colorCondition.equals("")){
								String[] conditions = colorCondition.split(";");//条件
								for (int i = 0; i < conditions.length; i++) {
									String[] params = conditions[i].split("\\|");
									if (i==0) {
										str += "		if("+params[0]+"){\n";
									} else {
										str += "	}else if("+params[0]+"){\n";
									}
									if (params[2].equals("hang")) {
										str += "               				return "+"\""+"<a class=\\\"eli w"+width+" changeHangColorForGrid\\\" changeColor=\\\""+params[1]+"\\\" style=\\\"font-size:12px;text-decoration:none;color:black;width:"+this.getFormColumnWidth()+"\\\" name="+"\\"+"\""+fieldName+"\\"+"\" data-type="+"\\"+"\"text"+"\\"+"\" data-pk="+"\\"+"\""+"\""+"+row.Id+"+"\""+"\\"+"\" data-title="+"\\"+"\""+this.getFormColumnLable()+"\\"+"\">"+"\""+"+"+ "date" +"+"+"\""+"</a>"+"\""+";"+"\n";
									}else{
										str += "               				return "+"\""+"<a class=\\\"eli w"+width+"\\\" style=\\\"font-size:12px;text-decoration:none;color:"+params[1]+";width:"+this.getFormColumnWidth()+"\\\" name="+"\\"+"\""+fieldName+"\\"+"\" data-type="+"\\"+"\"text"+"\\"+"\" data-pk="+"\\"+"\""+"\""+"+row.Id+"+"\""+"\\"+"\" data-title="+"\\"+"\""+this.getFormColumnLable()+"\\"+"\">"+"\""+"+"+ "date" +"+"+"\""+"</a>"+"\""+";"+"\n";
									}
								}
								str += "		}else{\n" +
									   "               return "+"\""+"<a class=\\\"eli w"+width+"\\\" style=\\\"font-size:12px;text-decoration:none;color:black;width:"+this.getFormColumnWidth()+"\\\" name="+"\\"+"\""+fieldName+"\\"+"\" data-type="+"\\"+"\"text"+"\\"+"\" data-pk="+"\\"+"\""+"\""+"+row.Id+"+"\""+"\\"+"\" data-title="+"\\"+"\""+this.getFormColumnLable()+"\\"+"\">"+"\""+"+"+ "date" +"+"+"\""+"</a>"+"\""+";"+"\n"+
									   "		}\n";
							}else{
								str += "        return "+"\""+"<a class=\\\"eli w"+width+"\\\" style=\\\"font-size:12px;text-decoration:none;color:black;width:"+this.getFormColumnWidth()+"\\\" name="+"\\"+"\""+fieldName+"\\"+"\" data-type="+"\\"+"\"text"+"\\"+"\" data-pk="+"\\"+"\""+"\""+"+row.Id+"+"\""+"\\"+"\" data-title="+"\\"+"\""+this.getFormColumnLable()+"\\"+"\">"+"\""+"+"+ "date" +"+"+"\""+"</a>"+"\""+";"+"\n";
							}
							str2  += "        return "+"\""+"<input class=\\\"eli w"+width+"\\\" style=\\\"font-size:12px;text-decoration:none;color:black;width:"+this.getFormColumnWidth()+"\\\" name="+"\\"+"\""+fieldName+"\\"+"\" data-type="+"\\"+"\"text"+"\\"+"\" data-pk="+"\\"+"\""+"\""+"+row.Id+"+"\""+"\\"+"\" value=\\\""+"\""+"+"+ "date" +"+"+"\""+"\\\" data-title="+"\\"+"\""+this.getFormColumnLable()+"\\"+"\">"+"\""+";"+"\n";
						}
						str +=   "                }"+"\n"
								+"            },"+"\n";
						str2+=   "                }"+"\n"
								+"            },"+"\n";
					}
					

					htmls[0] = str;
					if (isEdit) {
						htmls[26] = str2;
					}else {
						htmls[26] = str;
					}
				}else if("7".equals(guiType)) { //lookup控件
					
					str = "";
					htmls[0] = str;
					htmls[26] = str;
				}else if("2".equals(guiType)){ //单选下拉列表
					SysFormComboboxCache combobox =  (SysFormComboboxCache)this.formColumGui;
					boolean isExit = false;
					if(combobox.getPojo()!=null&&combobox.getComboboxId()!=0){ //满足说明用户保存该控件的扩展属性
						isExit = true;
					}
					boolean ShowNullItem =isExit==false?false:( "1".equals(combobox.getComboboxShownullitem())); //是否显示空项；
					boolean multiselect =isExit==false?false:( "Y".equals(combobox.getComboboxMultiselect())); 
					//logger.info(combobox.getComboboxMultiselect());
					String textField = isExit==false?null:(combobox.getComboboxTextfield());
					String valueField = isExit==false?null:(combobox.getComboboxValuefield());
					emptyText = isExit==false?null:( combobox.getComboboxEmptytext());
					boolean allowInput = isExit==false?false:( "1".equals(combobox.getComboboxAllowinput()));
					String dataField =isExit==false?null:( combobox.getComboboxDatafield());
					String nullItemText =isExit==false?null:( combobox.getComboboxNullitemtext());
					if(isExit) { //满足说明用户保存该控件的扩展属性
						Object[] ret = SysGridFormColumnUtil.getComboboxHtml(combobox, entityName, fieldName, htmls, request, this,isAslable);
						vtype =(String)ret[0];
						isValidation =(Boolean)ret[2];
						isRender =(Boolean)ret[3];
						isValidation =(Boolean)ret[4];
						dictTypeId = combobox.getComboboxGuiInitValue();
						url = (String)ret[6];
						data = (String)ret[7];
					}
					String classType = dictTypeId==null?SysCardFormBeansUtil.CARD_FORM_COMBO_BOX:SysCardFormBeansUtil.CARD_FORM_DICT_COMBO_BOX;
					str += SysGridFormBeansUtil.getComboboxHtml(classType, this.getJsId("fun",this.getPojo().getFormColumnFormDefId().toString()), fieldName, "11", emptyText, isRequired, isValidation, isDisable, entityName, getFormColumnWidth(), this.getFormColumnLable(),
							isRender, this.getForm().getFormDefCode(), readonly, getFormColumnAlign(), null, false, textField, valueField, allowInput, dictTypeId, nullItemText, url, data, dataField, multiselect,showtypeString,isApp,columnPosition,this.getPojo().getFormColumnId()+"",this.getPojo().getFormColumnColorCondition());
//					htmls[18] = "var dictDatas_"+this.form.getFormDefCode()+"_"+this.getFormColumnId()+" = '"+getDictDatas(combobox)+"';\n";
					htmls[18] = "var dictDatas_"+this.form.getFormDefCode()+"_"+this.getFormColumnId()+" = '';\n";
					htmls[19] = "dictDatas_"+this.form.getFormDefCode()+"_"+this.getFormColumnId()+" = obj.dictDatas_"+this.form.getFormDefCode()+"_"+this.getFormColumnId()+";\n";
					str +=SysCardFormBeansUtil.NEW_LINE_ONLY;
					htmls[0] = str;
					htmls[26] = str;
				}else if("11".equals(guiType)){ 
					SysTextBoxCache textbox  = (SysTextBoxCache)this.formColumGui;
					if(textbox.getPojo()!=null&&textbox.getPojo().getTextboxId()!=null&&!"0".equals(textbox.getPojo().getTextboxId())){ //满足说明用户保存该控件的扩展属性
						emptyText = textbox.getPojo().getTextboxEmptytext();
						Object[] ret = SysGridFormColumnUtil.getTextBoxHtml(textbox, entityName, fieldName, htmls, request, this,isAslable);
						vtype =(String)ret[0];
						isCellEdite =(Boolean)ret[2];
						isRender =(Boolean)ret[3];
						isValidation =(Boolean)ret[4];
						dictTypeId = (String)ret[5];
						url = (String)ret[6];
						data = (String)ret[7];
						isSelfValidation = (Boolean)ret[8];
					}
					String classType = "1".equals(guiType)? SysCardFormBeansUtil.CARD_FORM_TEXT_BOX:SysCardFormBeansUtil.CARD_FORM_TEXT_AREA;
					
					String othervtype = "";
					// 张乐修改，把最小值和最大值放在其他验证里
					String maxLength = this.getFormColumnMaxLength();
					String minLength = this.getFormColumnMinLength();
					if (!maxLength.equals("")&&maxLength!=null) {
						othervtype += "maxLength:" + maxLength + ";";
					} 
					
					if (!minLength.equals("")&&minLength!=null) {
						othervtype += "minLength:" + minLength + ";";
					}
					
					if (vtype!=null) {
						if (vtype.endsWith(";")) {
							vtype += "illegalChar";
						} else {
							vtype += ";illegalChar";
						}
					} else {
						vtype = "illegalChar";
					}
					
					String textboxCheckSelf = null;
					if(textbox.getPojo()!=null){
						textboxCheckSelf = textbox.getPojo().getTextboxCheckSelf();
					}
					str += SysGridFormBeansUtil.getPicHtml(classType,this.getJsId("fun",this.getPojo().getFormColumnFormDefId().toString()),fieldName,vtype ,othervtype, emptyText, isRequired,
							isValidation,isDisable,entityName,this.pojo.getFormColumnWidth(),this.pojo.getFormColumnLable(),isRender,this.getForm().getFormDefCode(),readonly,this.pojo.getFormColumnAlign(),textboxCheckSelf,this.pojo.getFormColumnHeight(),showtypeString,this.pojo.getFormColumnColorCondition(),this.pojo.getFormColumnColor(),textbox,isApp,columnPosition,isAccount);
					htmls[0] = str;
					htmls[26] = str;
				}
			}
		}
		return htmls;
	}
	
	private String getSetInitDateMain(String columnName,
			String dataFromType,String dataFromValue,String initJs, String formId,String columnId) {
		String initParam = "";
		if (dataFromType!=null&&dataFromType.equals("session")) {
			initParam = columnName+" = "+dataFromValue+"_session_"+formId+";\n";
		}else if(dataFromType!=null&&dataFromType.equals("parameter")){
			initParam = columnName+" = "+dataFromValue+"_parameter_"+formId+";\n";
		}else if(dataFromType!=null&&dataFromType.equals("constant")){
			initParam = columnName+" = constant_"+formId+"_"+columnId+";\n";
		}else if(dataFromType!=null&&dataFromType.equals("currentdate")){
			initParam = columnName+" = currentdate_"+formId+"_"+columnId+"\n";
		}else if(dataFromType!=null&&dataFromType.equals("initFun")){
			initParam = columnName+" = "+initJs+";\n";
		}
		return initParam;
	}
	private String getInitDateMain(String dataFromType,String dataFromValue, String formId,String columnId ) {
		String initParam = "";
		if (dataFromType!=null&&dataFromType.equals("session")) {
			initParam = "var "+dataFromValue+"_session_"+formId+"='';\nif('${sessionScope."+dataFromValue+"}'!='null'){"+dataFromValue+"_session_"+formId+"='${sessionScope."+dataFromValue+"}'}\n";
		}else if(dataFromType!=null&&dataFromType.equals("parameter")){
			initParam = "var "+dataFromValue+"_parameter_"+formId+"='${param."+dataFromValue+"}';\n";
		}else if(dataFromType!=null&&dataFromType.equals("constant")){
			initParam = "var constant_"+formId+"_"+columnId+"='"+dataFromValue+"';\n";
		}else if(dataFromType!=null&&dataFromType.equals("currentdate")){
			initParam = "var currentdate_"+formId+"_"+columnId+"= getSystemDate();\n";
		}else if(dataFromType!=null&&dataFromType.equals("initFun")){
			initParam = "var "+dataFromValue+"initFun"+formId+"= '';\n";
		}
		
		return initParam;
	}
	private String getDictNames(SysFormComboboxCache combobox) {
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		// TODO Auto-generated method stub
		String guiInitType = combobox.getPojo().getComboboxGuiInitType();
		String result = "var "+combobox.getPojo().getComboboxFormColumnId()+"_ByName = {";
		String sql = "";
		List<DictData> rs2 = null;
		if (guiInitType.equals("sql")) {
			String guiInitValue = combobox.getPojo().getComboboxGuiInitValue();
			try {
				rs2 = sysformconfigService.getCardDictDataByDictTypeCode(guiInitValue, "sql");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
		} else {
			String guiInitValue = combobox.getPojo().getComboboxGuiInitValue();
			try {
				rs2 = sysformconfigService.getCardDictDataByDictTypeCode(guiInitValue, "dict");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
		}
		for (int i = 0; i < rs2.size(); i++) {
			//var kvArray = [{key: 1, value: 10},
			//				 {key: 2, value: 20},
			//				 {key: 3, value: 30}];
			if (i==0) {
				result += "'"+rs2.get(i).getName()+"':'"+rs2.get(i).getCode()+"'";
			} else {
				result += ",'"+rs2.get(i).getName()+"':'"+rs2.get(i).getCode()+"'";
			}
		}
		result += "};\n";
		return result;
	}
	private String getDictValues(SysFormComboboxCache combobox) {
		ISysformconfigService sysformconfigService = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		// TODO Auto-generated method stub
		String guiInitType = combobox.getPojo().getComboboxGuiInitType();
		String result = "var "+combobox.getPojo().getComboboxGuiInitValue()+"_ByValue = {";
		String sql = "";
		List<DictData> rs2 = null;
		if (guiInitType.equals("sql")) {
			String guiInitValue = combobox.getPojo().getComboboxGuiInitValue();
			try {
				rs2 = sysformconfigService.getCardDictDataByDictTypeCode(guiInitValue, "sql");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
		} else {
			String guiInitValue = combobox.getPojo().getComboboxGuiInitValue();
			try {
				rs2 = sysformconfigService.getCardDictDataByDictTypeCode(guiInitValue, "dict");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
		}
		for (int i = 0; i < rs2.size(); i++) {
			if (i==0) {
				result += "'"+rs2.get(i).getCode()+"':'"+rs2.get(i).getName()+"'";
			} else {
				result += ",'"+rs2.get(i).getCode()+"':'"+rs2.get(i).getName()+"'";
			}
		}
		result += "};\n";
		return result;
	}


}
