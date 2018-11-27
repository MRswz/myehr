
package com.myehr.pojo.formmanage.cache;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.exception.DcfException;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.controller.login.Login;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpand;
import com.myehr.pojo.formmanage.form.SysCardtocardConfig;
import com.myehr.pojo.formmanage.form.SysFileuploadConfig;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormFolderTree;
import com.myehr.pojo.formmanage.form.SysFormFolderTreeExample;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.form.SysFormReport;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormYkReport;
import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparams;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.pojo.formmanage.question.SysExamtemplate;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestion;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IButtonService;
import com.myehr.service.formmanage.form.IListFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.IsysFormColumnService;
import com.myehr.service.impl.formmanage.form.generalparam.SysFormGeneralParamServiceImpl;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class SysFormconfigCache implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private static Logger logger = LoggerFactory.getLogger(SysFormconfigCache.class);
		private SysFormconfigWithBLOBs pojoform ;
		
		public SysFormconfigWithBLOBs getPojoform() {
			return pojoform;
		}

		public void setPojoform(SysFormconfigWithBLOBs pojoform) {
			this.pojoform = pojoform;
		}
		
		
		private String formOtherColumnSql;
		
		//初始化前置JS
		private String formDefInitQzJs;
		
		private String formTreePath;
		
		//是否包含lookup控件
		private boolean isContainLookup;
		
		//当前表单主键字段名称
		private SysFormColumnCache pkColumn; 
		
		// 关联表格
		private SysFormGridCache grid;
		
		public void setTree(SysFormconfigTreeCache tree) {
			this.tree = tree;
		}


		// 关联树
		private SysFormconfigTreeCache tree;
		
		//关联树节点
		private SysTreeNodeType treeNodeType;
		
		//关联所有字段安字段顺序
		private List<SysFormColumnCache> columns = new ArrayList<SysFormColumnCache>() ; 
		//移动端显示字段
		private List<SysFormColumnCache> mobildeColumns = new ArrayList<SysFormColumnCache>() ; 
		//允许排序字段
		private List<SysFormColumnCache> sortCs = new ArrayList<SysFormColumnCache>() ; 
		//默认排序字段
		private SysFormColumnCache defaultSortC = new SysFormColumnCache() ; 
		//关联所有字段按配置格式顺序
		private List<SysFormColumnCache> columnForApps = new ArrayList<SysFormColumnCache>() ; 
				
		//关联字典字段
		private List<SysFormColumnCache> dictColumns = new ArrayList<SysFormColumnCache>() ; 
		
		//关联字典字段
		private List<SysFormColumnCache> dateColumns = new ArrayList<SysFormColumnCache>() ; 
		
		//关联组
		public List<SysFormGroupCache> groups = new ArrayList<SysFormGroupCache>();
		
		
		//未分组字段对象集合
		public List<SysFormColumnCache> free = new ArrayList<SysFormColumnCache>();
		
		//按钮集合
		private List<SysFormButtonCache> buttons = new  ArrayList<SysFormButtonCache>();
		
		//移动端按钮区域
		private List<SysFormButtonCache> rightButtons = new  ArrayList<SysFormButtonCache>();
		private List<SysFormButtonCache> leftButtons = new  ArrayList<SysFormButtonCache>();
		private List<SysFormButtonCache> slidButtons = new  ArrayList<SysFormButtonCache>();
		private List<SysFormButtonCache> bottomButtons = new  ArrayList<SysFormButtonCache>();
		
		//过滤集合
		private List<SysFormWhereCache> wheres = new  ArrayList<SysFormWhereCache>();
		
		private List<SysTreeNodeTypeCache> nodeCaches = new ArrayList<SysTreeNodeTypeCache>();
		
		//问卷表单试题集合
		private List<SysExamtemplateQuestionCache> questions = new ArrayList<SysExamtemplateQuestionCache>();
		
		//问卷表单关联试卷
		private SysExamtemplate examtemplate = new SysExamtemplate();
		
		//业务主键字段
		private List<Map> busPkField = new  ArrayList<Map>();
		
		//表单中所需要引入的其他js控件
		public Map<String,String> importJs = new HashMap<String,String>();
		
		private SysGridFilterCache  filter ;
		
		private SysFileuploadConfig fileuploadConfig;
		
		private boolean haveRich;
		
		private SysCardtocardConfig cardtocardConfig;
		
		private List<SysSqlParams> ykParams;
		private SysFormYkReport YKreport;
		public SysCardtocardConfig getCardtocardConfig() {
			return cardtocardConfig;
		}

		public void setCardtocardConfig(SysCardtocardConfig cardtocardConfig) {
			this.cardtocardConfig = cardtocardConfig;
		}

		public boolean isHaveRich() {
			return haveRich;
		}

		public SysFileuploadConfig getFileuploadConfig() {
			return fileuploadConfig;
		}

		public void setFileuploadConfig(SysFileuploadConfig fileuploadConfig) {
			this.fileuploadConfig = fileuploadConfig;
		}

		public void setHaveRich(boolean haveRich) {
			this.haveRich = haveRich;
		}

		public List<SysTreeNodeTypeCache> getNodeCaches() {
			return nodeCaches;
		}

		public void setQuestions(List<SysExamtemplateQuestionCache> questions) {
			this.questions = questions;
		}


		//表单配置js全局参数；
		private Map<String, List<SysFormGeneralParamCache>> generalParams = new HashMap<String,List<SysFormGeneralParamCache>>();
		
		public Map<String, List<SysFormGeneralParamCache>> getGeneralParams() {
			return generalParams;
		}

		public List<SysFormColumnCache> getFree() {
			return free;
		}

		public void setFree(List<SysFormColumnCache> free) {
			this.free = free;
		}

		public List<SysFormColumnCache> getDateColumns() {
			return dateColumns;
		}

		public void setDateColumns(List<SysFormColumnCache> dateColumns) {
			this.dateColumns = dateColumns;
		}

		public void setGrid(SysFormGridCache grid) {
			this.grid = grid;
		}

		public void setColumns(List<SysFormColumnCache> columns) {
			this.columns = columns;
		}

		public void setGroups(List<SysFormGroupCache> groups) {
			this.groups = groups;
		}

		public void setButtons(List<SysFormButtonCache> buttons) {
			this.buttons = buttons;
		}

		public void setWheres(List<SysFormWhereCache> wheres) {
			this.wheres = wheres;
		}

		public void setImportJs(Map<String, String> importJs) {
			this.importJs = importJs;
		}

		public void setFilter(SysGridFilterCache filter) {
			this.filter = filter;
		}

		public SysExamtemplate getExamtemplate() {
			return examtemplate;
		}

		public void setExamtemplate(SysExamtemplate examtemplate) {
			this.examtemplate = examtemplate;
		}

		public void setGeneralParams(Map<String, List<SysFormGeneralParamCache>> generalParams) {
			this.generalParams = generalParams;
		}
		//主从表tab的关联对象
		private SysFormconfigMstTabCache mstTab ;
		
		//sql参数集合
		private List<String[]> params = new ArrayList<String[]>();
		
		//报表配置对象
		private SysFormReport report;
		
		//此表单是否记录字段日志
		private boolean fieldIsLog;
		
		public String getFormAuthorityIsControl() {
			return pojoform.getFormAuthorityIsControl();
		}
		
		public boolean isFieldIsLog() {
			return fieldIsLog;
		}
		public void setFieldIsLog(boolean fieldIsLog) {
			this.fieldIsLog = fieldIsLog;
		}
		
		public List<String[]> getParams() {
			return params;
		}
		public void setParams(List<String[]> params) {
			this.params = params;
		}
		
		public SysFormReport getReport() {
			return report;
		}

		public void setReport(SysFormReport report) {
			this.report = report;
		}
		
		public SysFormconfigMstTabCache getMstTab() {
			return mstTab;
		}
	 
		public void setMstTab(SysFormconfigMstTabCache mstTab) {
			this.mstTab = mstTab;
		}
		
		public String getIsShowFlowTitle() {
			return pojoform.getIsShowFlowTitle();
		}

		public SysGridFilterCache getFilter() {
			return filter;
		}

		public Map<String, String> getImportJs() {
			return importJs;
		}
		
		public void setImportJs(String key ,String value) {
			this.importJs.put(key, value);
		}

		public List<SysFormButtonCache> getButtons(){
			return this.buttons;
		}
		
		public List<SysFormWhereCache> getWheres() {		
			return wheres;
		}
		
		public SysFormGridCache getGrid() {
			return grid;
		}
		
		public SysFormconfigTreeCache getTree() {
			return tree;
		}
		
		public List<SysFormColumnCache> getColumnForApps() {
			return columnForApps;
		}

		public void setColumnForApps(List<SysFormColumnCache> columnForApps) {
			this.columnForApps = columnForApps;
		}

		public List<SysFormGroupCache> getGroups() {
			return groups;
		}
		
		public List<SysFormColumnCache> getColumns(){
			return this.columns;
		}
		
		public List<SysExamtemplateQuestionCache> getQuestions(){
			return this.questions;
		}
		
		public int getformDefFolderId() {
			return pojoform.getFormDefFolderId().intValue();
		}

	

		public String getFormTreePath() {
			return formTreePath;
		}

		public void setFormTreePath(String formTreePath) {
			this.formTreePath = formTreePath;
		}

		public String getFormDefCode() {
			return pojoform.getFormDefCode();
		}

		public String getFormDefDesc() {
			return pojoform.getFormDefDesc();
		}


		public String getFormDefEntitySql() {
			return  pojoform.getFormDefEntitySql();
		}

		public long getFormDefId() {
			return pojoform.getFormDefId().longValue();
		}
		
		public String getFormDefLayoutType() {
			return pojoform.getFormDefLayoutType();
		}

		public String getFormDefName() {
			return pojoform.getFormDefName();
		}

		public String getFormDefRowCount() {
			return pojoform.getFormDefRowCount();
		}

		public String getFormUrl() {
			return pojoform.getFormUrl();
		}

		public String getFormDefSql() {
			return  pojoform.getFormDefSql();
		}

		public String getOperatorName() {
			return pojoform.getOperatorName();
		}

		public Date getOperatorTime() {
			return pojoform.getOperatorTime();
		}
		
		public String getFormLableWidth() {
			return pojoform.getFormLableWidth();
		}

		public String getFormDefSaveTable() {
			return pojoform.getFormDefSavetable();
		}

		public String getFormOtherColumnSql() {
			return formOtherColumnSql;
		}

		public void setFormOtherColumnSql(String formOtherColumnSql) {
			this.formOtherColumnSql = formOtherColumnSql;
		}
		
		public List<SysFormColumnCache> getMobildeColumns() {
			return mobildeColumns;
		}

		public void setMobildeColumns(List<SysFormColumnCache> mobildeColumns) {
			this.mobildeColumns = mobildeColumns;
		}

		public List<SysFormColumnCache> getSortCs() {
			return sortCs;
		}

		public void setSortCs(List<SysFormColumnCache> sortCs) {
			this.sortCs = sortCs;
		}

		public SysFormColumnCache getDefaultSortC() {
			return defaultSortC;
		}

		public void setDefaultSortC(SysFormColumnCache defaultSortC) {
			this.defaultSortC = defaultSortC;
		}

		public boolean getContainLookup() {
			return isContainLookup;
		}

		public String getPowerSql() {
	        return this.pojoform.getPowerSql();
	    }

	    public String getOrderSql() {
	        return this.pojoform.getOrderSql();
	    }
		
		public void setContainLookup(boolean isContainLookup) {
			this.isContainLookup = isContainLookup;
		}

		public List<SysFormColumnCache> getDictColumns() {
			return dictColumns;
		}
		
		

		public SysFormColumnCache getPkColumn() {
			return pkColumn;
		}

		public void setPkColumn(SysFormColumnCache pkColumn) {
			this.pkColumn = pkColumn;
		}

		public String getFormSubmitStatus() {
			return pojoform.getFormSubmitStatus();
		}

		public Date getFormSubmitTime() {
			return pojoform.getFormSubmitTime();
		}

		public String getFormSubmitUrl() {
			return pojoform.getFormSubmitUrl();
		}
		
		public String getExpandField() {
			return pojoform.getExpandField();
		}

	    public String getExpand1() {
	        return pojoform.getExpand1();
	    }
		
		public int getFormSubmitUserId() {
			if(pojoform.getFormSubmitUserId()!=null){
				return pojoform.getFormSubmitUserId().intValue();
			}
			return 0;
		}

		public String getFormDefIsProcess() {
			return pojoform.getFormDefIsProcess();
		}

		public String getFormDefProcessDefName() {
			return pojoform.getFormDefProcessDefName();
		}
		
		public String getFormDefProcessDefNameText() {
			return pojoform.getFormDefProcessDefNameText();
		}

		public SysTreeNodeType getTreeNodeType() {
			return treeNodeType;
		}

		public void setTreeNodeType(SysTreeNodeType treeNodeType) {
			this.treeNodeType = treeNodeType;
		}

		public List<SysFormButtonCache> getRightButtons() {
			return rightButtons;
		}

		public void setRightButtons(List<SysFormButtonCache> rightButtons) {
			this.rightButtons = rightButtons;
		}

		public List<SysFormButtonCache> getLeftButtons() {
			return leftButtons;
		}

		public void setLeftButtons(List<SysFormButtonCache> leftButtons) {
			this.leftButtons = leftButtons;
		}

		public List<SysFormButtonCache> getSlidButtons() {
			return slidButtons;
		}

		public void setSlidButtons(List<SysFormButtonCache> slidButtons) {
			this.slidButtons = slidButtons;
		}

		public SysFormYkReport getYKreport() {
			return YKreport;
		}

		public List<SysFormButtonCache> getBottomButtons() {
			return bottomButtons;
		}

		public void setBottomButtons(List<SysFormButtonCache> bottomButtons) {
			this.bottomButtons = bottomButtons;
		}

		public List<SysSqlParams> getYkParams() {
			return ykParams;
		}

		/**
		 * 设置对应的查询字段信息
		 *
		 */
		public void setFilter() {
			if("2".equals(this.getFormDefLayoutType())||"10".equals(this.getFormDefLayoutType())||"11".equals(this.getFormDefLayoutType())){
				SysGridFilterCache f = new SysGridFilterCache(this.getFormDefId()+"",this);
				this.filter = f;
			}
		}

		/**
		 * 提供空的构造函数SysFormconfigCache
		 *
		 */
		public SysFormconfigCache(){}
		
		/**
		 * 
		 * 构造函数 通过数据库加载对象
		 * @param obj
		 * @param form
		 * @throws Exception 
		 */
		public SysFormconfigCache(String formId,ISysformconfigService sysformconfigService) throws Exception {
			//创建form对象
			SysFormconfigWithBLOBs obj =  sysformconfigService.getFormInfo(formId);
			if(obj==null){
				return;
			}
			this.pojoform = obj;
			String formDefLayoutType = pojoform.getFormDefLayoutType();
			//表单在表单树的路径findSysFormFolderTreeById
			this.setFormTreePath(this.getformDefFolderId(),sysformconfigService);
			if("2".equals(formDefLayoutType)||"10".equals(formDefLayoutType)||"11".equals(formDefLayoutType)){
				// 加载grid扩展属性对象
				this.setGrid();
			}else if("3".equals(formDefLayoutType)){
				// 加载tree扩展属性对象List<SysTreeNodeType> objs = service.queryTreeNodeTypeByFormId(formId);
				 this.setTree();
				 this.setTreeNodeType();
				 this.setTreeNodeTypeCache();
			}else if("5".equals(formDefLayoutType)){
				//初始化主从tab页的主表配置对象
				this.mstTab = new SysFormconfigMstTabCache(Long.parseLong(formId),this);
				this.setCardtocardConfig(formId,sysformconfigService);
				return ;
			}else if("8".equals(formDefLayoutType)){
				this.YKreport = sysformconfigService.getYkreportByformId(formId);
				if (this.YKreport!=null) {
					this.ykParams = sysformconfigService.getYkParamsByreportId(this.YKreport.getReportId());
				}
			}else if("7".equals(formDefLayoutType)){
				//初始化多tab页的主表配置对象
				this.mstTab = new SysFormconfigMstTabCache(Long.parseLong(formId),this);
				return ;
			}
//			//加载字段对象
			this.setColumns(formId,sysformconfigService);
			//加载关联字典字段对象
			//this.setDdictColumns(this.columns);
			
			//加载分组对象
			this.setGroups();
			//为当前表单对象的的各个字段设置对应组对象
			this.setColumnToGroup();

			
			//加载grid扩展属性对象
			//未分组对象加入free集合中
			this.setFree();
			//加载...
//			加载按钮控件
			this.setButtons(sysformconfigService);
			
//			加载数据过滤初始化条件
			this.setWheres(sysformconfigService);
			
			//加载查询条件数据
			this.setFilter();
			
			//加载试卷数据
			this.setExamtemplate(sysformconfigService);
			
			//加载查询题目数据
			this.setQuestion(formId,sysformconfigService);
			
			//加载js全局变量设置
			//this.setTreeGeneralParam(formId);
			
//			加载完所有字段后确定各字段是否有combox联动 如果有需要在字段对象中填充下拉数据初始化化函数名
			this.setFormColumnComboboxGuiInitFun();
			
			this.setFileuploadConfig(sysformconfigService);
			//处理参数sql
			SqlUtil.dealTreeSolutionParam(params, this.getFormDefSql());
			
		}
		
		private void setFormTreePath(int getformDefFolderId,ISysformconfigService sysformconfigService) {
			this.formTreePath = sysformconfigService.findSysFormFolderTreeById(getformDefFolderId, "");
		}
		
		private void setDdictColumns(List<SysFormColumnCache> columns2) {
			List<SysFormColumnCache> dictColumns = new ArrayList<SysFormColumnCache>();
			List<SysFormColumnCache> dateColumns = new ArrayList<SysFormColumnCache>();
			for (SysFormColumnCache sysFormColumnCache : columns2) {
				if (sysFormColumnCache.getFormColumnGuiType()!=null&&sysFormColumnCache.getFormColumnGuiType().equals("2")) {
					dictColumns.add(sysFormColumnCache);
				}else if (sysFormColumnCache.getFormColumnGuiType()!=null&&sysFormColumnCache.getFormColumnGuiType().equals("6")) {
					dateColumns.add(sysFormColumnCache);
				}
			}
			this.dictColumns = dictColumns;
			this.dateColumns = dateColumns;
		}

		private void setCardtocardConfig(String formId,ISysformconfigService sysformconfigService) {
			this.cardtocardConfig = sysformconfigService.getCardandcardConfigByFormId(formId);
		}

		private void setFileuploadConfig(ISysformconfigService sysformconfigService) {
			this.fileuploadConfig = sysformconfigService.getFileuploadConfigById(this.getPojoform().getFileuploadConfig());
		}

		/**
		 * 加载完所有字段后确定各字段是否有combox联动 如果有需要在字段对象中填充下拉数据初始化化函数名
		 */	
		public void setFormColumnComboboxGuiInitFun(){
			/*for(int i=0;i<this.columns.size(); i++){
				SysFormColumnCache c = this.columns.get(i);
				//找出该字段中的combbobox控件
				String guiType = c.getFormColumnGuiType();
				if("2".equals(guiType)){ //找出combobox控件字段
					SysFormComboboxCache combobox = (SysFormComboboxCache)c.getFormColumGui();
					if(combobox.getPojo()!=null&&combobox.getPojo().getComboboxId().intValue()!=0){ //确定配置了combobox属性
						if("sql".equals(combobox.getComboboxGuiInitType())) { //如果是sql初始化
							SysFormGeneralExecSqlCache s = combobox.getInitSql();
							if(s!=null){
								List<String[]> list = s.getParams();
								for(String[] arr:list){
									if("c".equals(arr[0])){ //确定是否有关联字段参数
										String columnId = arr[1].substring(arr[1].lastIndexOf("_")+1,arr[1].length());
										SysFormColumnCache cc = this.serchColumnByColumnId(Long.parseLong(columnId));
										String funname = "combobox_init_"+c.getFormFiledTablename()+"()";
										cc.setFormColumnComboboxGuiInitFun(funname);
									}
								}
							}
							
						}
					}
				}
			}*/
		}
		
		/**
		 * 
		 * 构造函数 通过DataObject加载对象
		 * @param obj
		 * @param form
		 *//*
		public SysFormconfig(DataObject obj){
			this.setThisByDataObject(obj);
			String formId = obj.getString("formDefId");
			//加载字段对象
			this.setColumns(formId);
			//加载组
			this.setGroups();
			
			//未分组对象加入free集合中
			this.setFree();
			//加载grid扩展属性对象
			
			//加载按钮控件
			this.setButtons();
			
			//加载数据过滤初始化条件
			this.setWheres();
			
//			加载查询条件数据
			this.setFilter();
		}*/
		
		public void setWheres(ISysformconfigService sysformconfigService) {
			//初始条件对象
			List<SysFormWhere> ws = sysformconfigService.getFormWheres(this.pojoform.getFormDefId(), null);
			if (ws!=null) {
				for(SysFormWhere temp:ws){
					this.wheres.add(new SysFormWhereCache(temp,this));
				}
			}
			
		}

	
		public void setButtons(ISysformconfigService sysformconfigService) throws NumberFormatException, DcfException, Exception {
			//初始化按钮
			List<SysFormButton> objs  =sysformconfigService.getFormButtons(this.pojoform.getFormDefId(), null);
			if(objs!=null&&objs.size()>0){	
				for(SysFormButton obj:objs){
					SysFormButtonCache buttonCache = new SysFormButtonCache(obj,this);
					this.buttons.add(buttonCache);
					String area = obj.getShowArea();
					String isShowMobile = obj.getIsshowmobile();
					if(isShowMobile!=null&&isShowMobile.equals("true")){//
						if (area!=null&&area.equals("right")) {
							this.rightButtons.add(buttonCache); 
						}else if (area!=null&&area.equals("bottom")) {
							this.bottomButtons.add(buttonCache);
						}else if (area!=null&&area.equals("slid")) {
							this.slidButtons.add(buttonCache);
						}else if (area!=null&&area.equals("left")) {
							this.leftButtons.add(buttonCache);
						}
					}
				}
			}
		}
		
		public void setQuestion(String formId,ISysformconfigService sysformconfigService) throws NumberFormatException, DcfException, Exception {
			//初始化按钮
			if (this.pojoform.getFormDefLayoutType().equals("13")) {
				List<SysExamtemplateQuestion> objs  = sysformconfigService.getExamtemplateQuestions(this.pojoform.getFormDefId(),this.pojoform.getExpand1(), null);
				if(objs!=null&&objs.size()>0){	
					for(SysExamtemplateQuestion obj:objs){
						this.questions.add(new SysExamtemplateQuestionCache(obj,this));
					}
				}
			}
		}
		
		public void setExamtemplate(ISysformconfigService sysformconfigService) throws NumberFormatException, DcfException, Exception {
			//初始化按钮
			if (this.pojoform.getFormDefLayoutType().equals("13")) {
				SysExamtemplate obj  = sysformconfigService.getExamtemplate(Integer.valueOf(this.pojoform.getExpand1()));
				this.examtemplate = obj;
			}
		}
		
		/**
		 * 把没有分组的字段对象加入到free集合中
		 *
		 */
		private void setFree(){
			for(SysFormColumnCache c:this.columns){
				if(c.getFormColumnGroupId()==null||"0".equals(c.getFormColumnGroupId())||"".equals(c.getFormColumnGroupId())){
					free.add(c);
				}
			}
		}
		
		private void setGrid(){
			this.grid = new SysFormGridCache(this.getFormDefId()+"",this.getFormDefCode());
		}
		private void setTree() throws Exception{
			this.tree = new SysFormconfigTreeCache(this.pojoform.getFormDefId().toString(),this.pojoform.getFormDefCode());
		}
		private void setTreeNodeType() throws Exception{
			IListFormService service =  (IListFormService)SpringContextUtils.getBeanById("ListFormService");
			if(service.queryTreeNodeTypeByFormId(this.getFormDefId()).size()>0){
				this.treeNodeType = service.queryTreeNodeTypeByFormId(this.getFormDefId()).get(0);
			}
		}
		
		public void setNodeCaches(List<SysTreeNodeTypeCache> nodeCaches) {
			this.nodeCaches = nodeCaches;
		}

		private void setTreeNodeTypeCache() throws Exception{
			IListFormService service =  (IListFormService)SpringContextUtils.getBeanById("ListFormService");
			List<SysTreeNodeType> nodes = service.queryTreeNodeTypeByFormId(this.getFormDefId());
			List<SysTreeNodeTypeCache> nodeCaches = new ArrayList<SysTreeNodeTypeCache>();
			ISysformconfigService service1 =  (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
			for (SysTreeNodeType sysTreeNodeType : nodes) {
				SysTreeNodeTypeCache nodeCache = new SysTreeNodeTypeCache(sysTreeNodeType,service1);
				nodeCaches.add(nodeCache);
			}
			this.nodeCaches = nodeCaches;
		}
		private void setGroups(){
			ISysformconfigService service =  (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
			List<SysFormGroup> objs = service.querySysFormGroup(this.pojoform.getFormDefId()+"", null);
			if(objs==null||objs.size()==0){
				return ;
			}
			for(SysFormGroup obj:objs){
				SysFormGroupCache g = new SysFormGroupCache(obj,this);
				g.setForm(this);
				this.groups.add(new SysFormGroupCache(obj,this));
			}
		}
		
		/**
		 * 根据按钮ID获取按钮对象
		 * @param columnId
		 * @return
		 */
		public SysFormButtonCache serchButtonButtonId(String buttonId){
			for(int i=0 ;i<this.buttons.size(); i++){
				SysFormButtonCache temp = buttons.get(i);
				if(temp.getFormButtonId().equals(buttonId)){
					return temp;
				}
			}
			return null;
		}
		
		/**
		 * 根据字段id获取字段对象
		 * @param columnId
		 * @return
		 */
		public SysFormColumnCache serchColumnByColumnId(Long columnId){
			for(int i=0 ;i<this.columns.size(); i++){
				SysFormColumnCache temp = columns.get(i);
//				logger.info(temp.getFormColumnId()+"");
				if (i==this.columns.size()-1) {
					logger.info("STOP");
				}
				if(temp.getFormColumnId()==columnId){
					return temp;
				}
			}
			return null;
		}
		
		/**
		 * 根据字段NAME获取字段对象
		 * @param columnId
		 * @return
		 */
		public SysFormColumnCache serchColumnByColumnName(String columnName,String formId){
			for(int i=0 ;i<this.columns.size(); i++){
				SysFormColumnCache temp = columns.get(i);
				String xx = columnName+"_"+formId;
				if(xx.equals(temp.getJsId("name",formId))){
					return temp;
				}
			}
			return null;
		}

		private void setColumns(String formId,ISysformconfigService sysformconfigService) throws Exception{
			//设置字段列
			IsysFormColumnService service =  (IsysFormColumnService)SpringContextUtils.getBeanById("SysFormColumnServiceImpl");
			if(formId==null){
				//log.error("实例化表单字段错误； 表单ID："+formId+"。 错误；原因：未提供表单id", new Exception("实例化表单字段异常"));
				logger.info("实例化表单字段错误； 表单ID："+formId+"。 错误；原因：未提供表单id");
				return;
			}
			List<SysFormColumn> objs = sysformconfigService.getFormColumns(formId);
			List<SysFormColumn> objs2 = sysformconfigService.getAppFormColumns(formId);
			if(objs==null||objs.size()==0){
				//log.error("实例化表单字段错误；表单ID："+formId+"。 错误；原因：根据表单读取字段数据为空", new Exception("实例化表单字段异常"));
				logger.info("实例化表单字段错误；表单ID："+formId+"。 错误；原因：根据表单读取字段数据为空");
				return;
			}

			for(SysFormColumn obj :objs){
				if (obj==null) {
					break;
				}
				SysFormColumnCache column = new SysFormColumnCache(obj,this);
				column.setForm(this);
				if("7".equals(obj.getFormColumnGuiType())){
					this.isContainLookup = true;
				}
				this.columns.add(column);
				//判断是否是主键
				boolean isPk = service.isPkColumn(column.getFormColumnId()+"",this.getFormDefSaveTable());
				if(isPk){
					this.pkColumn = column;
				}
//				判断是否是业务主键
				Map busPk = (Map) service.isBusPkColumn(column.getFormColumnId()+"",this.getFormDefSaveTable());
				if(busPk!=null){
					this.busPkField.add(busPk);
				}
				if (obj.getFormColumnGuiType()!=null&&obj.getFormColumnGuiType().equals("10")) {
					this.haveRich = true;
				} 
				String isDefaultSort = obj.getDefaultsort();
				if (isDefaultSort!=null&&isDefaultSort.equals("true")) {
					this.defaultSortC = column;
				}
				String isShowMobile = obj.getIsshowmobile();
				if (isShowMobile!=null&&isShowMobile.equals("true")) {
					this.mobildeColumns.add(column);
					String isSort = obj.getIssort();
					if (isSort!=null&&isSort.equals("true")) {
						this.sortCs.add(column);
					}
				}
				if (obj.getFormColumnGuiType()!=null&&obj.getFormColumnGuiType().equals("2")) {
					this.dictColumns.add(column);
				}else if (obj.getFormColumnGuiType()!=null&&obj.getFormColumnGuiType().equals("6")) {
					this.dateColumns.add(column);
				}
			}
			//columnForApps
			for (SysFormColumn sysFormColumn : objs2) {
				if (sysFormColumn==null) {
					break;
				}
				SysFormColumnCache column = new SysFormColumnCache(sysFormColumn,this);
				this.columnForApps.add(column);
			}
			
		}
		
		
		
		/**
		 * 为当前表单下的字段对象设置对应的组
		 *
		 */
		private void setColumnToGroup() {
			for(SysFormColumnCache c :this.columns){
				c.setGroup();
			}
		}
		
		/**
		 * 最终展现页面入口
		 * 
		 * 传入：request 可以获取参数  还需一个集合  用户存放有权限字段，最终展现字段根据这个传入集合进行展现
		 * @param i 
		 * @throws Exception 
		 *
		 */
		public StringBuffer[] showPage(SysRequestParam request,String isApp,ActNodePropertiesExpand actNodePropertiesExpand,String MstFormType, int i) throws Exception {
			StringBuffer[] rets = new StringBuffer[22];
			rets[10] = new StringBuffer();
			rets[11] = new StringBuffer();
			rets[12] = new StringBuffer();
			rets[13] = new StringBuffer();
			rets[14] = new StringBuffer();
			rets[16] = new StringBuffer();
			rets[17] = new StringBuffer();
			
			rets[10].append(SysCardFormBeansUtil.getBuildCardForm1(this.getPojoform().getFormDefId().toString(),isApp));
			rets[11].append(SysCardFormBeansUtil.getBuildCardForm2);
			rets[12].append(SysCardFormBeansUtil.getBuildCardForm3(this,isApp));
			
			rets[16].append(SysCardFormBeansUtil.getBuildCardForm3_1(this,isApp));
			rets[17].append(SysCardFormBeansUtil.getBuildCardForm3_2(this,isApp));
			
			rets[14].append(SysCardFormBeansUtil.getBuildCardForm5(this.getPojoform().getFormDefId().toString(),isApp));
			
			String fieldTableName="";
			String fieldColumnName="";
			
			String isFreeAct = isApp;
			
			/*if(){
				
			}*/
			
			if (this.getPkColumn()!=null) {
				fieldColumnName=this.getPkColumn().getFormFiledTablename();
				fieldTableName =this.getPkColumn().getFormEntityTablename();
			}
			rets[13].append(SysCardFormBeansUtil.getBuildCardForm4(this.getPojoform().getFormDefId().toString(),fieldColumnName,fieldTableName,this.getPojoform().getFormDefCode(),this.getPojoform().getFormDefName()));
			try {
				String userid = request.getSession().getAttribute("userid")+"";
				String isView =  request.getIsView();
				
				List<Map> fields = new ArrayList<Map>();
				
				StringBuffer[] sbs = SysCardFormBeansUtil.getSbs();
				//角标13存储s全局参数
				sbs[13] = SysCardFormBeansUtil.getFormJsParam(this.getGeneralParams(), request,"3".equals(this.pojoform.getFormDefLayoutType()));
				
				sbs[7].append("");
				// 判断布局类型
				if ("1".equals(this.pojoform.getFormDefLayoutType())) { // 卡片式表单展现页面逻辑
					rets[7] = new StringBuffer(this.hasGroup(fields, isView).toString());
					// 角标6代表button按钮代码段
					// 此处需要增加权限控制逻辑
					// /...
					// 获取组中表单的html'代码
					this.writeForm(request, sbs, userid, fields,isApp);
					
					// 获取未分组中的html代码
					this.wirtFormForFree(request, sbs, fields,isApp);
					// 生成按钮代码
					this.writeButtons(request, sbs, this.getFormDefId(),isApp,actNodePropertiesExpand);
					// 生成初始话数据js函数代码
					this.writeInitData(request, sbs ,MstFormType);
					// 表单结束代码

					rets[0] = sbs[0]; // 表单table内的内容
					rets[1] = sbs[6]; // 按钮的内容
					rets[2] = getCardFormJavacriptOnload(sbs, request,this.pojoform.getFormDefId()+""); // js的内容
					rets[5] = getCardFormJavacript(sbs); // js的内容
					rets[3] = sbs[7]; // 隐藏域
					
					rets[4] = sbs[8]; // 全局专用

					Map<String, String> m = this.getImportJs();
					String ueImportJs = m.get("ue");
					ueImportJs = ueImportJs == null ? "" : ueImportJs;
					String swfUploadJs = m.get("swfupload");
					swfUploadJs = swfUploadJs == null ? "" : swfUploadJs;
//					rets[5] = new StringBuffer(ueImportJs + swfUploadJs); // 引入js代码
//					rets[5] = new StringBuffer(SysCardFormBeansUtil.RichText());
					rets[6] = sbs[9];// js开头代码
					rets[8] = sbs[10]; // 保存前的一段处理富文本和附件的逻辑 传递给流程的保存方法使用
					rets[9] = sbs[13];
					rets[19] = sbs[19];
					rets[18] = sbs[18];
				} else if ("2".equals(this.pojoform.getFormDefLayoutType())||"10".equals(this.pojoform.getFormDefLayoutType())||"11".equals(this.pojoform.getFormDefLayoutType())) { // 表格展现页面逻辑
					if (isApp!=null&&isApp.equals("SELECT_FORM")) {
						// 生成初始话数据js函数代码
						if (isApp!=null&&(isApp.equals("CARDANDCARD")||isApp.equals("CARDANDGRID"))) {
							this.writeGridInitData(request, sbs,isApp,i);
						} else {
							this.writeGridInitData(request, sbs,isApp,0);
						}
						// 表单结束代码
	
						
						sbs[55].append(SysGridFormBeansUtil.getBuildJsp4_1(this));
						
						sbs[54].append(SysGridFormBeansUtil.getBuildJsp20());
						sbs[30].append(SysCardFormBeansUtil.getFormIdJs(this.pojoform.getFormDefId()+"")+SysCardFormBeansUtil.NEW_LINE);
						
						sbs[20].append(SysGridFormBeansUtil.getBuildJsp6(this));
					
						if(this.grid.getPojo().getFormIsCheckbox()!=null && !this.grid.getPojo().getFormIsCheckbox().equals("true")){
	//						sbs[36].append(SysGridFormBeansUtil.getBuildJsp6_2());
						}else{
							sbs[36].append(SysGridFormBeansUtil.getBuildJsp6_2());
						}
						if(this.grid.getPojo().getFormIsIndex()!=null && this.grid.getPojo().getFormIsIndex().equals("true")){
							sbs[37].append(SysGridFormBeansUtil.getBuildJsp6_3());
						}
						
						sbs[21].append(SysGridFormBeansUtil.getBuildJsp7_1(this));
						sbs[31].append(SysGridFormBeansUtil.getBuildJsp7(this));
						
						sbs[47].append(SysGridFormBeansUtil.getHeightSearch(this.pojoform.getFormDefCode(), this.pojoform.getFormDefId().toString(),this.pojoform.getFormDefLayoutType()));
						
						return sbs;
					}else {
						this.writeGridForm(request, sbs, userid, fields,isApp);
						
						this.writeFreeGridForm(request, sbs, userid, fields,isApp);
	
						// 生成按钮代码
						this.writeButtons(request, sbs, this.pojoform.getFormDefId().longValue(),isFreeAct,actNodePropertiesExpand);
	
						// 生成初始话数据js函数代码
						if (isApp!=null&&(isApp.equals("CARDANDCARD")||isApp.equals("CARDANDGRID"))) {
							this.writeGridInitData(request, sbs,isApp,i);
						} else {
							this.writeGridInitData(request, sbs,isApp,0);
						}
						// 表单结束代码
	
						// 获取查询过滤条件字段
						this.getFilter().writeFilter(request, sbs, this.pojoform.getFormDefId()+"",isApp,"Filter");
						
						//生成grid合计函数代码
						this.writeGridDrawSummaryCell(sbs);
	
						sbs[16].append(SysGridFormBeansUtil.getBuildJsp1());
						
						sbs[17].append(SysGridFormBeansUtil.getBuildJsp3(this.pojoform.getFormDefCode()));
						
						sbs[18].append(SysGridFormBeansUtil.getBuildJsp4());
						sbs[55].append(SysGridFormBeansUtil.getBuildJsp4_1(this));
						sbs[56].append(SysGridFormBeansUtil.getBuildJsp4_2());
						
						sbs[54].append(SysGridFormBeansUtil.getBuildJsp20());
						sbs[28].append(SysGridFormBeansUtil.getBuildJsp13(this.pojoform.getFormDefId()+""));
						sbs[29].append(SysGridFormBeansUtil.getBuildJsp14());
						sbs[23].append(SysGridFormBeansUtil.getBuildJsp14_1(this.pojoform));
						sbs[34].append(SysGridFormBeansUtil.getBuildJsp16());
						//sbs[35].append(SysGridFormBeansUtil.getBuildJsp15());
						sbs[30].append(SysCardFormBeansUtil.getFormIdJs(this.pojoform.getFormDefId()+"")+SysCardFormBeansUtil.NEW_LINE);
						
						sbs[19].append(SysGridFormBeansUtil.getBuildJsp5());
						
						sbs[20].append(SysGridFormBeansUtil.getBuildJsp6(this));
					
						if(this.grid.getPojo().getFormIsCheckbox()!=null && !this.grid.getPojo().getFormIsCheckbox().equals("true")){
	//						sbs[36].append(SysGridFormBeansUtil.getBuildJsp6_2());
						}else{
							sbs[36].append(SysGridFormBeansUtil.getBuildJsp6_2());
						}
						if(this.grid.getPojo().getFormIsIndex()!=null && this.grid.getPojo().getFormIsIndex().equals("true")){
							sbs[37].append(SysGridFormBeansUtil.getBuildJsp6_3());
						}else{
	//						sbs[36].append(SysGridFormBeansUtil.getBuildJsp6_2());
						}
						
						sbs[21].append(SysGridFormBeansUtil.getBuildJsp7_1(this));
						sbs[31].append(SysGridFormBeansUtil.getBuildJsp7(this));
						/** 刷新页面 */  
						sbs[22].append(SysGridFormBeansUtil.getBuildJsp8(this.pojoform.getFormDefCode())); 
						
						/**查询条件与分页数据 */  
						//sbs[23].append(SysGridFormBeansUtil.getBuildJsp9());
						
						/**初始化下拉控件  */
						//sbs[25].append(SysGridFormBeansUtil.getBuildJsp10());
						
						/**初始化日期控件  */
						//sbs[27].append(SysGridFormBeansUtil.getBuildJsp12());
						
						/**取url参数值  */
						//sbs[26].append(SysGridFormBeansUtil.getBuildJsp11());
						
						
						/**取列表单选  */
						sbs[32].append(SysGridFormBeansUtil.getBuildJsp15(this.pojoform.getFormDefCode()));
						
						sbs[47].append(SysGridFormBeansUtil.getHeightSearch(this.pojoform.getFormDefCode(), this.pojoform.getFormDefId().toString(),this.pojoform.getFormDefLayoutType()));
						
						return sbs;
					}
				}else if ("3".equals(this.pojoform.getFormDefLayoutType())) { // 树展现页面逻辑
					
					// 生成节点配置代码
					this.writeTreeNodeTypeData(request, sbs,this.getFormDefId());	
////				 生成按钮代码
					this.writeButtons(request, sbs, this.pojoform.getFormDefId().longValue(),isApp,actNodePropertiesExpand);
					
					return sbs;
				}else if ("4".equals(this.pojoform.getFormDefLayoutType()) || "9".equals(this.pojoform.getFormDefLayoutType())) { //报表生成逻辑
					
					// 生成节点配置代码
					this.writeTreeNodeTypeData(request, sbs,this.getFormDefId());	
//					 生成按钮代码
					this.writeButtons(request, sbs, this.pojoform.getFormDefId().longValue(),isApp,actNodePropertiesExpand);
					return sbs;
				}
			} catch (Exception e) {
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw e;
			}
			
			return rets;
			
		}
		
		public void writeReportQueryParams(){
			
			
		}
//		
		/**
		 * 判断流程是否需要增加分组
		 * @param fields 有权字段
		 * @return
		 */
		private String hasGroup(@SuppressWarnings("rawtypes") List<Map> fields, String isView) {
			String has = "";
			for (SysFormColumnCache c : this.free) {
				String _columnId_ = c.getFormColumnId() + "";
				boolean hsFieldRigt = SysCardFormBeansUtil.hasFiled(fields,_columnId_, isView,this.pojoform.getFormAuthorityIsControl());
				if (hsFieldRigt == false) { // 无权限跳过
					continue;
				}
				if("hide".equals(c.getFormColumnShowType())){
					continue;
				}
				has = "false";
				break;
			}
			return has;
		}
		
		private void writeInitData(SysRequestParam request, StringBuffer[] sbs,String mstFormType) {
			// TODO 自动生成方法存根
			//sbs[5].append(SysCardFormBeansUtil.checkNullJs());
			sbs[5].append(SysCardFormBeansUtil.getCardFormInitFunction(request, this,sbs,mstFormType));
		}
		
		private void writeButtons(SysRequestParam request, StringBuffer[] sbs, long formId,String isApp,ActNodePropertiesExpand actNodePropertiesExpand) {

			String isView = "false" ;
			IButtonService service =  (IButtonService)SpringContextUtils.getBeanById("IButtonService");
//			List<SysFormButton> hasbuttons = service.queryFormButton(formId+"", null);
			// TODO 自动生成方法存根
			if (this.buttons.size() > 0) {
				if (isApp!=null&&isApp.equals("APP")) {
					sbs[6].append(SysCardFormBeansUtil.getNbsp(2)+"<div class=\"mui-slider-right mui-disabled\">\n");
				} else {
					sbs[6].append(SysCardFormBeansUtil.getNbsp(2)+"<div class=\"BTNGROUP BTNGROUP_"+formId+"\" style=\"margin:5px auto; display:inline-block;height: 30px;z-index: 6;\">\n");
				}
				for (int i = 0; i < buttons.size(); i++) {
					SysFormButtonCache button  = buttons.get(i);
	 				if (SysCardFormBeansUtil.hasButtons(buttons, button.getFormButtonId(), isView,this.pojoform.getFormAuthorityIsControl())) {
//	 					logger.info(this.pojoform.getFormDefId().toString());
	 					sbs[6].append(button.getHtml(this.pojoform.getFormDefCode(), request,this.pojoform.getFormDefId().toString(),isApp));
	 					if (button.getFormButtonType().equals("editorModel")||button.getFormButtonType().equals("message")||button.getFormButtonType().equals("email")) {
	 						sbs[6].append("<input id=\"editorModel"+button.getFormButtonCode()+"\" type=\"hidden\" value=\"\"/>");
						}
	 					try {
							if (!"true".equals(request.getIsView())) {
								button.getJs(sbs, this.pojoform.getFormDefCode(), request, this,isApp);
							}
						} catch (Exception e) {
							e.printStackTrace();logger.error(e.getMessage(),e);
						}
	 				}
				}
				sbs[6].append(SysCardFormBeansUtil.getActivitiButton(this.pojoform.getFormDefId()+"", "",actNodePropertiesExpand));
				
				if (isApp!=null&&isApp.equals("APP")) {
					sbs[6].append(SysCardFormBeansUtil.getNbsp(2)+"</div>\n" +
						      SysCardFormBeansUtil.getNbsp(2)+"<div class=\"list-item mui-slider-handle\">\n");
				} else {
					sbs[6].append(SysCardFormBeansUtil.getNbsp(2)+"</div>\n");
				}
				
			}
		}

		@SuppressWarnings("unused")
		public  void writeForm(SysRequestParam request, StringBuffer[] sbs,String userid,List<Map> fields,String isApp) throws Exception{
			if(this.groups!=null&&this.groups.size()>0){
				//获取当前用户ID
		
				for (SysFormGroupCache g : this.groups) {
					if(g.getColumns().size()==0) {
						continue;
					}
					String groupName = g.getFormGroupName();
					String temp = "";
					List<SysFormColumnCache> l = g.getColumns();
					int groupRowCount = g.getFormGroupRowCount();
					if (l != null && l.size() > 0) {
						temp+=(SysCardFormBeansUtil.getCardFormGroupStart(groupName, g.getIsOpen(),isApp));
						int ccount = l.size();
//						//logger.info("求余数:"+(ccount/groupRowCount)%2);
////						计算总共需要多少行
						int i=0;
						int rowCount = 0;
						int k = 0;
						while(i<ccount){
//							//生成td
							SysFormColumnCache c = l.get(i);
							String showType = c.getFormColumnShowType();
							//处理流程字段中显示类型
							/*if(processcolumns!=null){
								for(ActivityColumn temp2:processcolumns){
									if(temp2.getFormColumnId()==c.getFormColumnId()) {
										showType = temp2.getActivityColumnShowType();	
										break;
									}
								}
							}
							if(flowContext!=null){
								if("2".equals(flowContext.getOperType())){
									showType = "show".equals(showType)?"readonly":showType;
								}
							}*/
							
							//获取字段ID
							String columnId_ =  c.getFormColumnId()+"";
							String formColumnIsDev = "N" ;
							try {
								formColumnIsDev = c.getFormColumnIsDev();
							} catch (Exception e) {
								// TODO: handle exception
								c.getPojo().setFormColumnIsDev(formColumnIsDev);
							}
							if("Y".equals(formColumnIsDev)){ //开发字段跳过
								i++;
								continue;
							}
							boolean hsFieldRigt = SysCardFormBeansUtil.hasFiled(fields, columnId_, request.getIsView(),this.pojoform.getFormAuthorityIsControl());
//							if (hsFieldRigt == false) { // 无权限跳过
//								i++;
//								continue;
//							}
//							int contField = 1;
//							try {
//								contField = c.getFormColumnColSpan();
//							} catch (Exception e) {
//								// TODO: handle exception
//								c.getPojo().setFormColumnColSpan(new BigDecimal(contField));
//							}
//							contField =  contField<2?1:contField;
//							int rcount = contField*2-1;
							//先确认当前循环的行能不能放的了当前字段的跨字段数
							//获取当前行后面还能够放几字段
//							int leaveCount = groupRowCount - rowCount;
	 						String temptd = null;
							String[] htmls = null;
//							if (contField > leaveCount) { // 说明后面字段不够放，重新起下一行
//								temptd = SysCardFormBeansUtil.getEmptyTd((leaveCount - contField) * 3);
//							} else {
							htmls = c.getHtmlsFrom(request,showType,isApp);
//							}
							if("hide".equals(showType)){ //隐藏字段不占长度
								sbs[7].append(htmls[7]);
							}else {
//								if(rowCount==0){ //生成tr开始
								int contField = c.getFormColumnColSpan();
								if (isApp!=null&&isApp.equals("APP")) {
									temp+=SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START_ONLY_APP;
								} else {
									if (contField==3) {
										temp+=(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START_ONLY);
									}else if (contField==2){
										temp+=(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START_ONLY);
									}else {
										temp+=(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START);
									}
								}
//								}
								if(temptd!=null){
									temp+=(temptd);
//									rowCount = groupRowCount-contField; //直接设置行尾 以便下一循环会重起一行
									i--;
								}else {
									temp+=(htmls[0]);
								}
//								logger.info(c.getFormColumnLable());
//								if(rowCount==groupRowCount-contField){ //生成tr结束
								if (isApp!=null&&isApp.equals("APP")) {
									temp+=(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_END_APP);
								} else {
									temp+=(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_END);
								}
//								}
//								rowCount+=contField;
							}
							if(htmls!=null&&htmls[1]!=null&&!"".equals(htmls[1]))
								sbs[1].append(htmls[1]);
							if(htmls!=null&&htmls[2]!=null&&!"".equals(htmls[2]))
								sbs[2].append(htmls[2]);
							if(htmls!=null&&htmls[3]!=null&&!"".equals(htmls[3]))
								sbs[3].append(htmls[3]);
							if(htmls!=null&&htmls[4]!=null&&!"".equals(htmls[4]))
								sbs[4].append(htmls[4]);
							if(htmls!=null&&htmls[8]!=null&&!"".equals(htmls[8]))
								sbs[8].append(htmls[8]);
							if(htmls!=null&&htmls[9]!=null&&!"".equals(htmls[9])) //js引入代码
								sbs[9].append(htmls[9]);
							if(htmls!=null&&htmls[10]!=null&&!"".equals(htmls[10])) //js开头代码
								sbs[10].append(htmls[10]);
							if(htmls!=null&&htmls[11]!=null&&!"".equals(htmls[11])) //js开头代码
								sbs[11].append(htmls[11]);
							if(htmls!=null&&htmls[14]!=null&&!"".equals(htmls[14])) //js开头代码
								sbs[14].append(htmls[14]);
							if(htmls!=null&&htmls[15]!=null&&!"".equals(htmls[15])) //js开头代码
								sbs[15].append(htmls[15]);
							i++;
							if(!"hide".equals(c.getFormColumnShowType())){
								k++;
							}
							if(groupRowCount==rowCount){
								rowCount = 0;
							}
						}
						if (k != 0) {
							/*sbs[0].append(temp);
							sbs[0].append(SysCardFormBeansUtil.CARD_FORM_TABLE_END);
							sbs[0].append(SysCardFormBeansUtil.CARD_FORM_FIELD_SET_END);
							sbs[0].append(temp);*/
							if (isApp!=null&&isApp.equals("APP")) {
								sbs[0].append("</div>\n");
							} else {
								sbs[0].append(temp);
								sbs[0].append(SysCardFormBeansUtil.CARD_FORM_TABLE_END);
								sbs[0].append(SysCardFormBeansUtil.CARD_FORM_FIELD_SET_END);
								//sbs[0].append(temp);
							}
						}
					}
				}
			}
		}
//		
		/**
		 * 把未分组的字段对象转成html代码 和分组逻辑区别不大
		 * @param sb
		 * @throws Exception 
		 */
		@SuppressWarnings("unused")
		public void wirtFormForFree(SysRequestParam request,StringBuffer[] sbs,List<Map> fields,String isApp) throws Exception{
			List<SysFormColumnCache> l = this.free;
			if(l!=null&&l.size()>0){
				
				/*//去流程活动定义的字段信息
				List<ActivityColumn> processcolumns = null;
				FlowContext flowContext = null;
				if("Y".equals(this.getFormDefIsProcess())){ 
					DcfReponse dcfReponse =  (DcfReponse)request.getAttribute("dcfReponse");
					Map map = (Map)dcfReponse.getResult();
					// 环节配置
					ActivityConfig activityConfig = (ActivityConfig)map.get("activityConfig");
					flowContext = (FlowContext)map.get("flowContext");
					if(activityConfig!=null){
						processcolumns = activityConfig.getActivityColumn();
					}
				}*/
				
				int ccount = l.size();
				//满足条件
				//sbs[0].append(SysCardFormBeansUtil.CARD_FORM_TABLE_START);
				if (isApp!=null&&isApp.equals("APP")) {
					String htmlString = "<form class=\"mui-input-group\">\n"+
											"<h5>其他：</h5>\n";
					sbs[0].append(htmlString);
				}else {
					sbs[0].append(SysCardFormBeansUtil.CARD_FORM_TABLE_START);
				}
				//计算总共需要多少行
				int i=0;
				int rowCount = 0;
				while(i<ccount){
					//生成td
					SysFormColumnCache c = l.get(i);
					String showType = c.getFormColumnShowType();
					
					/*//处理流程字段中显示类型0
					if(processcolumns!=null){
						for(ActivityColumn temp:processcolumns){
							if(temp.getFormColumnId()==c.getFormColumnId()) {
								showType = temp.getActivityColumnShowType();	
								break;
							}
						}
					}*/
					/*if(flowContext!=null){
						if("2".equals(flowContext.getOperType())){
							showType = "show".equals(showType)?"readonly":showType;
						}
					}*/
					
					//获取当前用户ID
					//获取当前用户所有字段权限
					//获取显示方式
				
					//获取字段ID
					String columnId_ =  c.getFormColumnId()+"";
					try {
						String formColumnIsDev = c.getFormColumnIsDev();
					} catch (Exception e) {
						// TODO: handle exception
						c.getPojo().setFormColumnIsDev("N");
					}
					if("Y".equals(c.getFormColumnIsDev())){ //开发字段跳过
						i++;
						continue;
					}
					boolean hsFieldRigt = SysCardFormBeansUtil.hasFiled(fields, columnId_, request.getIsView(),this.pojoform.getFormAuthorityIsControl());
//					if (hsFieldRigt == false) { // 无权限跳过
//						i++;
//						continue;
//					}
					int contField = 1;
					try {
						contField = c.getFormColumnColSpan();
					} catch (Exception e) {
						// TODO: handle exception
						c.getPojo().setFormColumnColSpan(new BigDecimal(contField));
					}
					
					//先确认当前循环的行能不能放的了当前字段的跨字段数
					//获取当前行后面还能够放几字段
					String temptd = null;
					String[] htmls = null;
					htmls = c.getHtmlsFrom(request,showType,isApp);
					if("hide".equals(showType)){ //隐藏字段不占长度
						sbs[7].append(htmls[7]);
					}else {
							/*int contField = c.getFormColumnColSpan();
							if (contField==3) {
								sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START_ONLY);
							}else if (contField==2){
								sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START_ONLY);
							}else {
								sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START);
							}*/
						if (isApp!=null&&isApp.equals("APP")) {
							sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START_ONLY_APP);
						} else {
							if (contField==3) {
								sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START_ONLY);
							}else if (contField==2){
								sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START_ONLY);
							}else {
								sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_START);
							}
						}
						if(temptd!=null){
							sbs[0].append(temptd);
							i--;
						}else {
							sbs[0].append(htmls[0]);
						}
						/*sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_END);*/
						if (isApp!=null&&isApp.equals("APP")) {
							sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_END_APP);
						} else {
							sbs[0].append(SysCardFormBeansUtil.CARD_FORM_BIG_CELL_END);
						}
					}
					if(htmls!=null&&htmls[1]!=null&&!"".equals(htmls[1]))
						sbs[1].append(htmls[1]);
					if(htmls!=null&&htmls[2]!=null&&!"".equals(htmls[2]))
						sbs[2].append(htmls[2]);
					if(htmls!=null&&htmls[3]!=null&&!"".equals(htmls[3]))
						sbs[3].append(htmls[3]);
					if(htmls!=null&&htmls[4]!=null&&!"".equals(htmls[4]))
						sbs[4].append(htmls[4]);
					if(htmls!=null&&htmls[8]!=null&&!"".equals(htmls[8]))
						sbs[8].append(htmls[8]);
					
					String str = htmls[8];
					
					if(htmls!=null&&htmls[9]!=null&&!"".equals(htmls[9])) //js引入代码
						sbs[9].append(htmls[9]);
					if(htmls!=null&&htmls[10]!=null&&!"".equals(htmls[10])) //js开头代码
						sbs[10].append(htmls[10]);
					if(htmls!=null&&htmls[11]!=null&&!"".equals(htmls[11])) //js开头代码
						sbs[11].append(htmls[11]);
					if(htmls!=null&&htmls[14]!=null&&!"".equals(htmls[14])) //js开头代码
						sbs[14].append(htmls[14]);
					if(htmls!=null&&htmls[15]!=null&&!"".equals(htmls[15])) //js开头代码
						sbs[15].append(htmls[15]);
					i++;
				}
				//sbs[0].append(SysCardFormBeansUtil.CARD_FORM_TABLE_END);
				if (isApp!=null&&isApp.equals("APP")) {
					sbs[0].append("</form>\n");
				} else {

					sbs[0].append(SysCardFormBeansUtil.CARD_FORM_TABLE_END);
				}
			}
		}
//		
		/**
		 * 获取form卡片式表单的window.onload脚本
		 * @param sbs
		 * @return
		 */
		public  StringBuffer getCardFormJavacriptOnload(StringBuffer[] sbs,SysRequestParam request,String formId){
			StringBuffer sb = new StringBuffer();
			//sb.append(SysBeansUtil.JAVASCRIPT_START+SysBeansUtil.NEW_LINE_ONLY);
			sbs[18].append(SysCardFormBeansUtil.getFormIdJs(this.pojoform.getFormDefId()+"")+SysCardFormBeansUtil.NEW_LINE);
			//String str1 = sbs[1]==null?null:sbs[1].toString();
			String str2 = sbs[2]==null?null:sbs[2].toString();
			String str14 = sbs[14]==null?null:sbs[14].toString();
			String str3 = sbs[3]==null?null: sbs[3].toString();
			String str4 = sbs[4]==null?null: sbs[4].toString();
			String str5 = sbs[5]==null?null: sbs[5].toString();
			String str8 = sbs[8]==null?null: sbs[8].toString(); //lookup buttonclick
			//生成初始化函数
			sbs[19].append(SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_WINDOW_ONLOAD+"initRoleColumn('"+this.getFormDefId()+"');\ninitFieldRuleColumn('"+this.getFormDefId()+"');\ninitRoleButtons();\n"+SysCardFormBeansUtil.NEW_LINE_ONLY);
			
			//确定是否需要执行初始化函数
			String inExcInit = request.getIsInit();
			
			sb.append(sbs[1]==null?"":sbs[1].toString()+SysCardFormBeansUtil.NEW_LINE_ONLY);
			if(this.getFormDefInitQzJs()!=null){
				sb.append(SysCardFormBeansUtil.getNbsp(2)+this.getFormDefInitQzJs()+SysCardFormBeansUtil.NEW_LINE);
			}
			if (this.pojoform.getFormDefIsProcess().equals("Y")) {
				sb.append("approveList();");
			}
			
			//角标str14 初始化 函数
			if(str14!=null&&!"".equals(str14)){
				sb.append(SysCardFormBeansUtil.getNbsp(2)+sbs[14].toString()+SysCardFormBeansUtil.NEW_LINE);
			}
			
			if("true".equals(inExcInit)) {
//				调用初始化数据函数
				//if(str5!=null&&!"".equals(str5)){
				sb.append(SysCardFormBeansUtil.getNbsp(2)+"_initData_"+formId+"(null)"+SysCardFormBeansUtil.NEW_LINE);
				//}
			}
			
			sb.append(SysCardFormBeansUtil.getNbsp(1)+SysCardFormBeansUtil.JAVASCRIPT_FUN_END+SysCardFormBeansUtil.NEW_LINE_ONLY);
			
			return sb;
		}
		
		/**
		 * 获取form卡片式表单的js脚本
		 * @param sbs
		 * @return
		 */
		public  StringBuffer getCardFormJavacript(StringBuffer[] sbs){
			StringBuffer sb = new StringBuffer();
			String str2 = sbs[2]==null?null:sbs[2].toString();
			String str3 = sbs[3]==null?null: sbs[3].toString();
			String str4 = sbs[4]==null?null: sbs[4].toString();
			String str5 = sbs[5]==null?null: sbs[5].toString();
			String str8 = sbs[8]==null?null: sbs[8].toString(); //lookup buttonclick

			//角标2 onclick 函数
			if(str2!=null&&!"".equals(str2)){
				sb.append(sbs[2].toString());
			}
			
			//角标3 onvaluechange函数
			if(str3!=null&&!"".equals(str3)){
				sb.append(sbs[3].toString());
			}
			
//			角标4 onvalidation函数
			if(str4!=null&&!"".equals(str4)){
				sb.append(sbs[4].toString());
			}
			
//			角标5 初始化数据函数
			if(str5!=null&&!"".equals(str5)){
				sb.append(sbs[5].toString());
			}
			
//			角标8 lookup buttonClick
			if(str8!=null&&!"".equals(str8)){
				sb.append(sbs[8].toString());
			}	

			return sb;
		}
//
		private void writeGridForm(SysRequestParam request, StringBuffer[] sbs, String userid, List<Map> fields,String isApp) throws Exception {
			if(this.groups!=null&&this.groups.size()>0){
				for(SysFormGroupCache g:this.groups){
					String groupName = g.getFormGroupName();
					List<SysFormColumnCache> l = new ArrayList<SysFormColumnCache>();
					if (isApp!=null&&isApp.equals("APP")) {
						l = g.getAppColumns();
					}else {
						l = g.getColumns();
					}
					if(l!=null&&l.size()>0){
						sbs[0].append(SysGridFormBeansUtil.getCardFormGridGroupStart(groupName,isApp));
						if(groupName!=null&&isApp!=null&&groupName.equals("left")&&isApp.equals("APP")){
							l.get(0).getPojo().setFormColumnGuiType("11");
							SysGridFormBeansUtil.getGridColumns(l, fields, request, sbs,isApp);
							sbs[0].append("</div>\n" +
										  "</div>\n");
						}else if (groupName!=null&&isApp!=null&&isApp.equals("CARDANDCARD_MAIN")) {
							sbs[0].append(CardAndCardFormBeansUtil.getCardFormGridGroupStart(groupName,isApp));
							SysGridFormBeansUtil.getGridColumns(l, fields, request, sbs,isApp);
							sbs[0].append("'</div>'+\n");
						}else{
							SysGridFormBeansUtil.getGridColumns(l, fields, request, sbs,isApp);
						}
					}
				}
			}
			
		}
//		
		private void writeFreeGridForm(SysRequestParam request, StringBuffer[] sbs, String userid, List<Map> fields,String isApp) throws Exception {
			// TODO 自动生成方法存根
			List<SysFormColumnCache> l = this.free;
			if(l!=null&&l.size()>0){
				SysGridFormBeansUtil.getGridColumns(l, fields, request, sbs,isApp);
			}
		}
		
		/**
		 * 生成grid初始化函数
		 * @param request
		 * @param sbs
		 */
		private void writeGridInitData(SysRequestParam request, StringBuffer[] sbs,String isApp,int Num) {
			if (isApp!=null&&(isApp.equals("CARDANDCARD"))) {
				sbs[8].append(CardAndCardFormBeansUtil.getGridFormInitFunction(request, this,sbs,isApp,Num+""));
				sbs[8].append(CardAndCardFormBeansUtil.getGridFormInitFunctionx(request, this,sbs,isApp,Num+""));
			}else if (isApp.equals("CARDANDGRID")) {
				sbs[8].append(SysGridFormBeansUtil.getGridFormInitFunction(request, this,sbs,isApp));
				sbs[8].append(CardAndCardFormBeansUtil.getGridFormInitFunctionx(request, this,sbs,isApp,Num+""));
			} else {
				sbs[8].append(SysGridFormBeansUtil.getGridFormInitFunction(request, this,sbs,isApp));
			}
		}
		
		/**
		 * 生成grid合计函数
		 * @param sbs
		 */
		private void writeGridDrawSummaryCell(StringBuffer[] sbs){
			sbs[11].append(SysGridFormBeansUtil.getGridDrawSummaryCellFunction(this));
		}	
		
		/*private void writeFlowTitle(SysFormGroup group, ActivityConfig actConfig, boolean isExistData) {
			String groupId = String.valueOf(group.getFormGroupId());
			String type = actConfig.getActivityType();
			if ("XFQ".equals(type)) {
				
			}
		}*/
		/**
		 * 生成树节点参数
		 * @param request
		 * @param sbs
		 */
		private void writeTreeNodeTypeData(SysRequestParam request, StringBuffer[] sbs ,long formId) {
			String temp  = "";
			//IListFormService service = (IListFormService)ApplicationContextFactory.getContext().getBean("ListFormServiceBean2");
			IListFormService service =  (IListFormService)SpringContextUtils.getBeanById("ListFormService");
			List<SysTreeNodeType> objs = service.queryTreeNodeTypeByFormId(formId);
			if(objs.size()>0){
				String formIdZ = "";
				if (objs.get(0).getTreeNodeTypeFormId() !=null) {
					formIdZ = service.queryListFormsById(String.valueOf(objs.get(0).getTreeNodeTypeFormId())).getFormDefId().toString();
				}
				
				temp+= "var paramtabs_map = {";
				for(int i=0;i<objs.size();i++){
					if(i<objs.size()-1){
						if(objs.get(i).getTreeNodeTypeUrl()!=null&&!objs.get(i).getTreeNodeTypeUrl().equals("")){
							temp+="'"+objs.get(i).getTreeNodeTypeCode()+"': [{title:'"+objs.get(i).getTreeNodeTypeTittle()+"', url:'"+objs.get(i).getTreeNodeTypeUrl()+"'}],"+SysCardFormBeansUtil.NEW_LINE_ONLY;						
						}else if(objs.get(i).getTreeNodeTypeFormId()!=null){
							temp+="'"+objs.get(i).getTreeNodeTypeCode()+"': [{title:'"+objs.get(i).getTreeNodeTypeTittle()+"', url:'<%= basePath%>form/toForm.action?formId="+objs.get(i).getTreeNodeTypeFormId()+"'}],"+SysCardFormBeansUtil.NEW_LINE_ONLY;
						}
					}else if(i==objs.size()-1){
						if(objs.get(i).getTreeNodeTypeUrl()!=null&&!objs.get(i).getTreeNodeTypeUrl().equals("")){
							temp+="'"+objs.get(i).getTreeNodeTypeCode()+"': [{title:'"+objs.get(i).getTreeNodeTypeTittle()+"', url:'"+objs.get(i).getTreeNodeTypeUrl()+"'}]";//formTest						
						}else if(objs.get(i).getTreeNodeTypeFormId()!=null){
							temp+="'"+objs.get(i).getTreeNodeTypeCode()+"': [{title:'"+objs.get(i).getTreeNodeTypeTittle()+"', url:'<%= basePath%>form/toForm.action?formId="+objs.get(i).getTreeNodeTypeFormId()+"'}]";						
						}
					}				
				}	
				temp+="}";
				sbs[15].append(objs.get(0).getTreeNodeTypeCode());
			}
			sbs[9].append(temp);
		}
		/**
		 * 加载js全局参数
		 * @param formId
		 */
		public void setTreeGeneralParam(String formId){
			SysFormGeneralParamServiceImpl paramService = new SysFormGeneralParamServiceImpl();
			String paramType = FormParamConstants.FORMCONFIG;
			List<SysFormGeneralParam> params = paramService.queryGeneralParamByTypeAndTypeValue(paramType,Long.parseLong(formId));
			for(int i=0; i<params.size(); i++){
				SysFormGeneralParamCache p = new SysFormGeneralParamCache(params.get(i));
				String type = p.getParamTypeEnd();
				if(this.generalParams.containsKey(type)){
					List<SysFormGeneralParamCache> l = this.generalParams.get(type);
					l.add(p);
					this.generalParams.put(paramType, l);
				}else {
					List<SysFormGeneralParamCache> l = new ArrayList<SysFormGeneralParamCache>();
					l.add(p);
					this.generalParams.put(paramType, l);
				}
			}
		}
		
		public SysFormButtonCache getButton(long buttonId){
			for(int i=0; i<this.buttons.size(); i++){
				if(this.buttons.get(i).getFormButtonId().equals(buttonId+"")){
					return this.buttons.get(i);
				}
			}
			return null;
		}
		
		/**
		 * 获取指定id表单的按钮对象
		 * @param buttonId
		 * @return
		 */
		public SysFormButtonCache getButtonByButtonId(String buttonId){
			if(this.buttons!=null){
				for(int i=0; i<buttons.size(); i++){
					if(buttons.get(i).getFormButtonId().equals(buttonId)){
						return buttons.get(i);
					}
					
				}
			}
			return null;
		}
		public List<Map> getBusPkField() {
			return busPkField;
		}
		public void setBusPkField(List<Map> busPkField) {
			this.busPkField = busPkField;
		}
		public String getFormDefInitQzJs() {
			return formDefInitQzJs;
		}
		public void setFormDefInitQzJs(String formDefInitQzJs) {
			this.formDefInitQzJs = formDefInitQzJs;
		}
}