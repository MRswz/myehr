package com.myehr.service.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;

import net.sf.json.JSONArray;

import com.myehr.common.exception.DcfException;
import com.myehr.pojo.activiti.ActHiProcinst;
import com.myehr.pojo.activiti.ActReModel;
import com.myehr.pojo.cache.SysCacheConfig;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldRule;
import com.myehr.pojo.fileinput.C11;
import com.myehr.pojo.formmanage.button.SysFormButtonAdd;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculate;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import com.myehr.pojo.formmanage.button.SysFormButtonExport;
import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduce;
import com.myehr.pojo.formmanage.button.SysFormButtonRemove;
import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.form.SysActfreeConduct;
import com.myehr.pojo.formmanage.form.SysActfreeHis;
import com.myehr.pojo.formmanage.form.SysActfreeModel;
import com.myehr.pojo.formmanage.form.SysActfreeTask;
import com.myehr.pojo.formmanage.form.SysActfreeWay;
import com.myehr.pojo.formmanage.form.SysCardtocardConfig;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysFileuploadConfig;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormYkReport;
import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparams;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysGridFilter;
import com.myehr.pojo.formmanage.form.SysGridFilterColumn;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.formmanage.question.SysExamtemplate;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestion;
import com.myehr.pojo.formmanage.question.SysQuestion;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormFileupload;
import com.myehr.pojo.formmanage.widget.SysFormLookup;
import com.myehr.pojo.formmanage.widget.SysFormRadiobuttonlist;
import com.myehr.pojo.formmanage.widget.SysFormRichtext;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.pojo.sysParam.SysSystemParam;
import com.myehr.pojo.sysmenu.SysMenu;
import com.myehr.pojo.sysuser.EmpVEmp1basic;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExpand;
import com.myehr.pojo.task.SysTask;

public interface ISysformconfigService {
	
	List<SysDictEntry> getDictEntrys(String dictTypeCode) throws DcfException, Exception;
	
	List<SysField> getSysFields(String entityCode) throws DcfException, Exception;
	
	List<SysMenu> getSysMenus(BigDecimal roleId) throws DcfException, Exception;
	
	SysFormconfigWithBLOBs getFormInfo(String formId) throws DcfException, Exception;
	
	void setFormInfo(String formId) ;
	
	void setFormInfos(List<SysFormconfigWithBLOBs> forms) throws DcfException, Exception;
	
	SysFormconfigCache getForm(String formId) throws DcfException, Exception;
	
	List<SysFormColumn> getFormColumns(String formId) throws DcfException, Exception;
	
	void setFormColumns(List<SysFormColumn> columns) throws Exception;
	
	SysFormColumn getFormColumn(String columnId) throws DcfException, Exception;
	
	void setGridFilters(List<SysGridFilter> filters) throws Exception;
	
	SysGridFilter getFormFilter(String columnId);
	
	void setFormFilter(String formId);
	
	Map getEntityColumnByColumnId(String columnId);
	
	void setEntityColumnByColumnId(String columnId);
	
	List<SysFormButton> getFormButtons(BigDecimal formId,String userId) throws DcfException, Exception;
	
	List<SysFormWhere> getFormWheres(BigDecimal formId,String otherType);
	
	void setFormWheres(String formId);
	
	List<SysGridFilterColumn> getFormFilterColumns(String formId);
	
	void setFormFilterColumns(String formId);
	
	void setTextboxs(List<SysFormTextbox> textboxs) throws Exception;
	
	SysFormTextbox getTextbox(String columnId) ;
	
	void setTextbox(String columnId) ;
	
	void setComboboxs(List<SysFormCombobox> comboboxs) throws Exception;
	
	SysFormCombobox getCombobox(String columnId) ;
	
	void setCombobox(String columnId);
	
	void setRadiobuttonlists(List<SysFormRadiobuttonlist> radiobuttonlists) throws Exception;
	
	SysFormRadiobuttonlist getRadiobuttonlist(String columnId);
	
	void setRadiobuttonlist(String columnId);
	
	void setDatepickers(List<SysFormDatepicker> datepickers) throws Exception;
	
	SysFormDatepicker getDatepicker(String columnId) ;
	
	void setDatepicker(String columnId);
	
	void setLookups(List<SysFormLookup> lookups) throws Exception;
	
	SysFormLookup getLookup(String columnId) ;
	
	void setLookup(String columnId);
	
	void setRichtexts(List<SysFormRichtext> richtexts) throws Exception;
	
	SysFormRichtext getRichtext(String columnId) ;
	
	void setRichtext(String columnId);
	
	void setFileuploads(List<SysFormFileupload> fileuploads) throws Exception;
	
	SysFormFileupload getFileupload(String columnId) ;
	
	void setFileupload(String columnId);
	
	void setButtonSaves(List<SysFormButtonSave> buttonSaves) throws Exception;
	
	SysFormButtonSave getButtonSave(String buttonId);
	
	void setButtonSave(String buttonId);
	
	void setButtonAdds(List<SysFormButtonAdd> buttonAdds) throws Exception;
	
	SysFormButtonAdd getButtonAdd(String buttonId);
	
	void setButtonAdd(String buttonId) ;
	
	void setButtonRemoves(List<SysFormButtonRemove> buttonRemoves) throws Exception;
	
	SysFormButtonRemove getButtonRemove(String buttonId);
	
	void setButtonRemove(String buttonId);
	
	void setButtonImports(List<SysFormButtonImport> buttonImports) throws Exception;
	
	SysFormButtonImport getButtonImport(String buttonId);
	
	SysFormButtonExport getButtonExport(String buttonId);
	
	void setButtonImport(String buttonId);
	
	void setButtonCalculates(List<SysFormButtonCalculate> buttonCalculates) throws Exception;
	
	SysFormButtonCalculate getButtonCalculate(String buttonId);
	
	void setButtonCalculate(String buttonId);
	
	void setButtonIntroduces(List<SysFormButtonIntroduce> buttonIntroduces) throws Exception;
	
	SysFormButtonIntroduce getButtonIntroduce(String buttonId);
	
	void setButtonIntroduce(String buttonId);
	
	void setSysExecSqls(List<SysExecSql> sysExecSqls) throws Exception;
	
	SysExecSql getSysExecSql(String buttonId);
	
	void setSysExecSql(String buttonId);
	
	SysQuestion getQuestion(int questionId) ;
	
	/**
	 * 查询表单组
	 * @param formId
	 * @param groupId
	 * @return
	 */
	List<SysFormGroup>  querySysFormGroup(String formId,String groupId);
	
	/**
	 * 通过字段id字段数据
	 */
	public SysFormColumn querySysFormColumnById(long columnId) ;

	void setForm(String formId) throws Exception;

	void setColumn(String columnId) throws Exception;
	
	void setButton(String columnId) throws Exception;

	void setFormColumns(String formId)throws Exception;
	
	void setFormbuttons(String formId)throws Exception;

	List<SysExamtemplateQuestion> getExamtemplateQuestions(BigDecimal formId,
			String templateId, String userId) throws Exception;

	SysExamtemplate getExamtemplate(int templateId);
	
	String setColumnSqlDict(String realFieldColumn,String sql);
	
	String getColumnSqlDict(String dataField);
	
	void setFormInfo(String formId, String userId) throws Exception;
	
	public SysFormButtonEditorWithBLOBs getButtonEditor(String type, String buttonId);

	JSONArray getGridDictDataByColumnId(String columnId, String userId)
			throws Exception;

	List<DictData> getCardDictDataByColumnId(String columnId, String userId)
			throws Exception;

	List<SysFormColumn> getFormColumnByUserid(String formId, String userId)
			throws Exception;

	List<Map> getColumnWithFieldRuleByFormId(String formId) throws Exception;

	void setGenParamByRuleId(String ruleId, List<SysFormGeneralParam> params)
			throws Exception;

	List<SysFormGeneralParam> getGenParamByRuleId(String ruleId);

	void setCardDictDataByColumnId(String columnId, String userId)
			throws Exception;

	List<DictData> getCardDictDataByDictTypeId(int dictTypeId, String string) throws Exception;

	void setCardDictDataByDictTypeId(int dictTypeId) throws Exception;

	void setCardDictSqlDataByDictTypeId(int dictTypeId) throws Exception;

	void setDictEntrysByTypeCode(int dictTypeId) throws Exception;

	List<DictData> getCardDictDataByDictTypeCode(String dictTypeCode, String type)
			throws Exception;

	C11 getEmpPhotoInfo(String empId) throws Exception;

	void setEmpPhotoInfo(String empId) throws Exception;

	void setFormColumnByUserid(String formId, String userId) throws Exception;

	SysField getFieldById(String string);

	void setCardDictDataByDictTypeCode(String dictTypeCode, String type) throws Exception;

	SysFileuploadConfig getFileuploadConfigById(String fileuploadConfig);

	void setFileuploadConfigById(String fileuploadConfig);

	SysCardtocardConfig getCardandcardConfigByFormId(String formId);

	void setCardandcardConfig(String formId);

	Map getDictNameMap(String dictCode);
	
	Map getDictValueMap(String dictCode);

	String findSysFormFolderTreeById(int folderTreeId, String path);

	List<SysCacheConfig> getFreshCache(String objType, String objId,String cacheType);

	void importFormDatas(String oldFormId) throws Exception;

	List<SysFormColumn> getFormColumnsNoGroup(String formId) throws Exception;

	List<SysFormColumn> getFormColumnsByGroupId(String formId, String groupId)
			throws Exception;

	void setApproveId(String task, String userIds) throws Exception;

	String getApproveId(String task) throws Exception;

	String getHtmlPicByMBId(String task) throws Exception;

	void setHtmlPicByMBId(String task, String htmlPic) throws Exception;

	SysEntity getEntityById(String entityId);

	SysUser getUserByUserid(String userId) throws Exception;

	void setUserByUserid(String userId) throws Exception;

	ActReModel getActModelByKey(String modelKey) throws Exception;

	Map getNodeByModelId(String modelId) throws Exception;

	void setNodeByModelId(String modelId) throws Exception;

	ActHiProcinst getActHiProcinstByPid(String pid) throws Exception;

	List<ActReModel> getActModelsByCode(String code) throws Exception;

	void setDictEntrysByTypeCode(String dictTypeCode) throws Exception;

	void setActTitle(String modelKeyAndBusinessId, String title)
			throws Exception;

	String getActTitle(String modelKey, String businessId)
			throws Exception;

	String getRoleIdsbyUserId(String userId) throws Exception;

	void setRoleIdsbyUserId(String userId) throws Exception;

	List<SysFormColumn> getAppFormColumns(String formId) throws Exception;

	SysFormColumn getFormColumnReal(String columnId) throws Exception;

	void setButtonOrColumnByUserId(String formId, String userId)
			throws Exception;

	List<SysFormColumn> getColumnPowerById(String formId, String userId)
			throws Exception;

	SysFieldRule getFieldRuleById(Long fieldRuleId);

	void setFreeWaysByTaskId(String taskid);

	List<SysActfreeWay> getFreeWaysByTaskId(String taskid);

	SysActfreeWay getNextFreeWayByTOId(String taskid, String orderBy);

	SysActfreeWay getNowFreeWayByTOId(String taskid, String orderBy);

	void setActfreeTask(String taskId);

	SysActfreeTask getActfreeTask(String taskId);

	SysActfreeConduct getActFreeConductByTaskId(String taskId);

	void setActFreeConductByTaskId(String taskId);

	List<SysActfreeConduct> getActFreeConductByUserId(String userId);

	SysActfreeModel getSysActfreeModelBytaskId(String taskid);

	SysActfreeTask getFreeActTaskMaxCode(String modelKey);

	SysFormconfigWithBLOBs getFormInfoReal(String formId) throws Exception;

	SysSystemParam getSystemParam(String paramCode) throws Exception;

	void initSystemParam();

	void setSystemParam();

	SysFormTreeSolutionCache getTreeSolutionById(BigDecimal formTreeSolutionId) throws Exception;

	void setTreeSolutionById(BigDecimal formTreeSolutionId) throws Exception;

	Map getChartConfigByformId(String string);

	void setChartConfigByformId(String formId);

	List<SysActfreeHis> getFreeActHisByTaskid(String taskId);

	List<SysGridFilterColumn> getFormFilterColumnsFromData(String formId);

	SysUser getUserByMobile(String userMobile);

	void setEmpPhotoByUserId(String string, String photoPath);

	String getEmpPhotoByUserId(String userId);

	Map getSysParam();

	List<SysTask> getTaskDatasByUserId(String userId);

	String getMainframeMenuWithSchemex(String code, String userId);

	int setMainframeMenuWithSchemex(String code, String userId);

	EmpVEmp1basic getPersonInfoByuserId(String userId);

	int setPersonInfoByuserId(String userId);

	List<SysSqlParams> getYkParamsByreportId(Long reportId);

	SysFormYkReport getYkreportByformId(String formId);

}
