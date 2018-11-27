package com.myehr.pojo.formmanage.formCopy;
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
import com.myehr.pojo.formmanage.cache.FormParamConstants;
import com.myehr.pojo.formmanage.cache.SqlUtil;
import com.myehr.pojo.formmanage.cache.SysCardFormBeansUtil;
import com.myehr.pojo.formmanage.cache.SysFormGroupCache;
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
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.pojo.formmanage.question.SysExamtemplate;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestion;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IButtonService;
import com.myehr.service.formmanage.form.IListFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.IsysFormColumnService;
import com.myehr.service.impl.formmanage.form.generalparam.SysFormGeneralParamServiceImpl;

public class SysFormCopyCache implements Serializable{
		private SysFormconfigWithBLOBs pojoform ;
		//当前表单主键字段名称
		private SysFormColumnCacheCopy pkColumn;
		// 关联表格
		private SysFormGridCacheCopy grid;
		// 关联树
		private SysFormconfigTreeCacheCopy tree;
		//关联树节点
		private SysTreeNodeType treeNodeType;
		//关联字段
		private List<SysFormColumnCacheCopy> columns = new ArrayList<SysFormColumnCacheCopy>() ; 
		//关联组
		public List<SysFormGroupCacheCopy> groups = new ArrayList<SysFormGroupCacheCopy>();
		//未分组字段对象集合
		public List<SysFormColumnCacheCopy> free = new ArrayList<SysFormColumnCacheCopy>();
		//按钮集合
		private List<SysFormButtonCacheCopy> buttons = new  ArrayList<SysFormButtonCacheCopy>();
		//过滤集合
		private List<SysFormWhereCacheCopy> wheres = new  ArrayList<SysFormWhereCacheCopy>();
		//问卷表单试题集合
		private List<SysExamtemplateQuestionCacheCopy> questions = new ArrayList<SysExamtemplateQuestionCacheCopy>();
		//问卷表单关联试卷
		private SysExamtemplate examtemplate = new SysExamtemplate();
		private SysGridFilterCacheCopy  filter ;
		private SysFileuploadConfig fileuploadConfig;
		private SysCardtocardConfig cardtocardConfig;//表单配置js全局参数；
		private Map<String, List<SysFormGeneralParamCacheCopy>> generalParams = new HashMap<String,List<SysFormGeneralParamCacheCopy>>();
		
		public SysFormconfigWithBLOBs getPojoform() {
			return pojoform;
		}
		public void setPojoform(SysFormconfigWithBLOBs pojoform) {
			this.pojoform = pojoform;
		}
		public SysCardtocardConfig getCardtocardConfig() {
			return cardtocardConfig;
		}
		public void setCardtocardConfig(SysCardtocardConfig cardtocardConfig) {
			this.cardtocardConfig = cardtocardConfig;
		}
		public SysFileuploadConfig getFileuploadConfig() {
			return fileuploadConfig;
		}

		public void setFileuploadConfig(SysFileuploadConfig fileuploadConfig) {
			this.fileuploadConfig = fileuploadConfig;
		}

		public void setQuestions(List<SysExamtemplateQuestionCacheCopy> questions) {
			this.questions = questions;
		}


		
		public Map<String, List<SysFormGeneralParamCacheCopy>> getGeneralParams() {
			return generalParams;
		}

		public SysExamtemplate getExamtemplate() {
			return examtemplate;
		}

		public void setExamtemplate(SysExamtemplate examtemplate) {
			this.examtemplate = examtemplate;
		}

		public void setGeneralParams(Map<String, List<SysFormGeneralParamCacheCopy>> generalParams) {
			this.generalParams = generalParams;
		}
		//主从表tab的关联对象
		private SysFormconfigMstTabCacheCopy mstTab ;
		
		//sql参数集合
		private List<String[]> params = new ArrayList<String[]>();
		
		//报表配置对象
		private SysFormReport report;
		
		
		public String getFormAuthorityIsControl() {
			return pojoform.getFormAuthorityIsControl();
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
		
		public SysFormconfigMstTabCacheCopy getMstTab() {
			return mstTab;
		}
	 
		public void setMstTab(SysFormconfigMstTabCacheCopy mstTab) {
			this.mstTab = mstTab;
		}
		
		public String getIsShowFlowTitle() {
			return pojoform.getIsShowFlowTitle();
		}

		public SysGridFilterCacheCopy getFilter() {
			return filter;
		}

		public List<SysFormButtonCacheCopy> getButtons(){
			return this.buttons;
		}
		
		public List<SysFormWhereCacheCopy> getWheres() {		
			return wheres;
		}
		
		public SysFormGridCacheCopy getGrid() {
			return grid;
		}
		
		public SysFormconfigTreeCacheCopy getTree() {
			return tree;
		}
		
		public List<SysFormGroupCacheCopy> getGroups() {
			return groups;
		}
		
		public List<SysFormColumnCacheCopy> getColumns(){
			return this.columns;
		}
		
		public List<SysExamtemplateQuestionCacheCopy> getQuestions(){
			return this.questions;
		}
		
		public int getformDefFolderId() {
			return pojoform.getFormDefFolderId().intValue();
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

		public String getPowerSql() {
	        return this.pojoform.getPowerSql();
	    }

	    public String getOrderSql() {
	        return this.pojoform.getOrderSql();
	    }
		public SysFormColumnCacheCopy getPkColumn() {
			return pkColumn;
		}

		public void setPkColumn(SysFormColumnCacheCopy pkColumn) {
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
			return pojoform.getFormSubmitUserId().intValue();
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

		/**
		 * 设置对应的查询字段信息
		 *
		 */
		public void setFilter() {
			if("2".equals(this.getFormDefLayoutType())||"10".equals(this.getFormDefLayoutType())||"11".equals(this.getFormDefLayoutType())){
				SysGridFilterCacheCopy f = new SysGridFilterCacheCopy(this.getFormDefId()+"",this);
				this.filter = f;
			}
		}

		/**
		 * 提供空的构造函数SysFormconfigCache
		 *
		 */
		public SysFormCopyCache(){}
		
		/**
		 * 
		 * 构造函数 通过数据库加载对象
		 * @param obj
		 * @param form
		 * @throws Exception 
		 */
		public SysFormCopyCache(String formId,ISysformconfigService sysformconfigService) throws Exception {
			//创建form对象
			SysFormconfigWithBLOBs obj =  sysformconfigService.getFormInfo(formId);
			this.pojoform = obj;
			String formDefLayoutType = pojoform.getFormDefLayoutType();
			
			//加载分组对象
			this.setGroups();
			
			if("2".equals(formDefLayoutType)||"10".equals(formDefLayoutType)||"11".equals(formDefLayoutType)){
				// 加载grid扩展属性对象
				this.setGrid();
			}else if("3".equals(formDefLayoutType)){
				// 加载tree扩展属性对象List<SysTreeNodeType> objs = service.queryTreeNodeTypeByFormId(formId);
				 this.setTree();
				 this.setTreeNodeType();
			}else if("5".equals(formDefLayoutType)){
				//初始化主从tab页的主表配置对象
				this.mstTab = new SysFormconfigMstTabCacheCopy(Long.parseLong(formId),this);
				this.setCardtocardConfig(formId,sysformconfigService);
				return ;
			}else if("7".equals(formDefLayoutType)){
				//初始化多tab页的主表配置对象
				this.mstTab = new SysFormconfigMstTabCacheCopy(Long.parseLong(formId),this);
				return ;
			}
//			//加载字段对象
			this.setColumns(formId,sysformconfigService);
			
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
			for(int i=0;i<this.columns.size(); i++){
				SysFormColumnCacheCopy c = this.columns.get(i);
				//找出该字段中的combbobox控件
				String guiType = c.getFormColumnGuiType();
				if("2".equals(guiType)){ //找出combobox控件字段
					SysFormComboboxCacheCopy combobox = (SysFormComboboxCacheCopy)c.getFormColumGui();
					if(combobox.getPojo()!=null&&combobox.getPojo().getComboboxId().intValue()!=0){ //确定配置了combobox属性
						if("sql".equals(combobox.getComboboxGuiInitType())) { //如果是sql初始化
							SysFormGeneralExecSqlCacheCopy s = combobox.getInitSql();
							if(s!=null){
								List<String[]> list = s.getParams();
								for(String[] arr:list){
									if("c".equals(arr[0])){ //确定是否有关联字段参数
										String columnId = arr[1].substring(arr[1].lastIndexOf("_")+1,arr[1].length());
										SysFormColumnCacheCopy cc = this.serchColumnByColumnId(Long.parseLong(columnId));
										String funname = "combobox_init_"+c.getFormFiledTablename()+"()";
										cc.setFormColumnComboboxGuiInitFun(funname);
									}
								}
							}
							
						}
					}
				}
			}
		}
		
		public void setWheres(ISysformconfigService sysformconfigService) {
			//初始条件对象
			List<SysFormWhere> ws = sysformconfigService.getFormWheres(this.pojoform.getFormDefId(), null);
			if (ws!=null) {
				for(SysFormWhere temp:ws){
					this.wheres.add(new SysFormWhereCacheCopy(temp,this));
				}
			}
			
		}

	
		public void setButtons(ISysformconfigService sysformconfigService) throws NumberFormatException, DcfException, Exception {
			//初始化按钮
			List<SysFormButton> objs  =sysformconfigService.getFormButtons(this.pojoform.getFormDefId(), null);
			if(objs!=null&&objs.size()>0){	
				for(SysFormButton obj:objs){
					this.buttons.add(new SysFormButtonCacheCopy(obj,this));
				}
			}
		}
		
		public void setQuestion(String formId,ISysformconfigService sysformconfigService) throws NumberFormatException, DcfException, Exception {
			//初始化按钮
			if (this.pojoform.getFormDefLayoutType().equals("13")) {
				List<SysExamtemplateQuestion> objs  = sysformconfigService.getExamtemplateQuestions(this.pojoform.getFormDefId(),this.pojoform.getExpand1(), null);
				if(objs!=null&&objs.size()>0){	
					for(SysExamtemplateQuestion obj:objs){
						this.questions.add(new SysExamtemplateQuestionCacheCopy(obj,this));
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
			for(SysFormColumnCacheCopy c:this.columns){
				if(c.getFormColumnGroupId()==null||"0".equals(c.getFormColumnGroupId())||"".equals(c.getFormColumnGroupId())){
					free.add(c);
				}
			}
		}
		
		private void setGrid(){
			this.grid = new SysFormGridCacheCopy(this.getFormDefId()+"",this.getFormDefCode());
		}
		private void setTree() throws Exception{
			this.tree = new SysFormconfigTreeCacheCopy(this.pojoform.getFormDefId().toString(),this.pojoform.getFormDefCode());
		}
		private void setTreeNodeType() throws Exception{
			IListFormService service =  (IListFormService)SpringContextUtils.getBeanById("ListFormService");
			if(service.queryTreeNodeTypeByFormId(this.getFormDefId()).size()>0){
				this.treeNodeType = service.queryTreeNodeTypeByFormId(this.getFormDefId()).get(0);
			}
		}
		private void setGroups() throws Exception{
			ISysformconfigService service =  (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
			List<SysFormGroup> objs = service.querySysFormGroup(this.pojoform.getFormDefId()+"", null);
			if(objs==null||objs.size()==0){
				return ;
			}
			for(SysFormGroup obj:objs){
				this.groups.add(new SysFormGroupCacheCopy(obj,this));
			}
		}
		
		/**
		 * 根据按钮ID获取按钮对象
		 * @param columnId
		 * @return
		 */
		public SysFormButtonCacheCopy serchButtonButtonId(String buttonId){
			for(int i=0 ;i<this.buttons.size(); i++){
				SysFormButtonCacheCopy temp = buttons.get(i);
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
		public SysFormColumnCacheCopy serchColumnByColumnId(Long columnId){
			for(int i=0 ;i<this.columns.size(); i++){
				SysFormColumnCacheCopy temp = columns.get(i);
				if(temp.getFormColumnId()==columnId){
					return temp;
				}
			}
			return null;
		}

		private void setColumns(String formId,ISysformconfigService sysformconfigService) throws Exception{
			//设置字段列
			IsysFormColumnService service =  (IsysFormColumnService)SpringContextUtils.getBeanById("SysFormColumnServiceImpl");
			List<SysFormColumn> objs = sysformconfigService.getFormColumnsNoGroup(formId);
			for(SysFormColumn obj :objs){
				SysFormColumnCacheCopy column = new SysFormColumnCacheCopy(obj,this);
				this.columns.add(column);
			}
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
				SysFormGeneralParamCacheCopy p = new SysFormGeneralParamCacheCopy(params.get(i));
				String type = p.getParamTypeEnd();
				if(this.generalParams.containsKey(type)){
					List<SysFormGeneralParamCacheCopy> l = this.generalParams.get(type);
					l.add(p);
					this.generalParams.put(paramType, l);
				}else {
					List<SysFormGeneralParamCacheCopy> l = new ArrayList<SysFormGeneralParamCacheCopy>();
					l.add(p);
					this.generalParams.put(paramType, l);
				}
			}
		}
		
		public SysFormButtonCacheCopy getButton(long buttonId){
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
		public SysFormButtonCacheCopy getButtonByButtonId(String buttonId){
			if(this.buttons!=null){
				for(int i=0; i<buttons.size(); i++){
					if(buttons.get(i).getFormButtonId().equals(buttonId)){
						return buttons.get(i);
					}
					
				}
			}
			return null;
		}
}
