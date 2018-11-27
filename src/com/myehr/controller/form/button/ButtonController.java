package com.myehr.controller.form.button;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.ChangeCode;
import com.myehr.controller.dict.param.ResultMapNew;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.form.parambean.ResultFilters;
import com.myehr.controller.form.parambean.ResultMap;
import com.myehr.controller.form.parambean.SaveButtonParams;
import com.myehr.controller.sysmenu.SaveMenuParamParams;
import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.field.SysFieldMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonAddMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonEditorMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonExportColumnMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonExportMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonImportColumnMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonImportMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonInterfaceMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonIntrDetailMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonIntroduceMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonParamMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonRemoveMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonSaveMapper;
import com.myehr.mapper.formmanage.button.SysMailsendMapper;
import com.myehr.mapper.formmanage.button.SysMessagesendMapper;
import com.myehr.mapper.formmanage.form.SysExecSqlMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.mapper.formmanage.form.SysFormGeneralParamMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.formmanage.form.SysTreeNodeTypeMapper;
import com.myehr.mapper.formmanage.template.widget.SysTemplateComboboxMapper;
import com.myehr.mapper.formmanage.widget.SysFormComboboxMapper;
import com.myehr.mapper.task.SysTimerMapper;
import com.myehr.pojo.email.SendHTMLEmail;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.entity.SysEntityExample;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldExample;
import com.myehr.pojo.formmanage.button.IntroduceParam;
import com.myehr.pojo.formmanage.button.SysFormButtonAdd;
import com.myehr.pojo.formmanage.button.SysFormButtonAddExample;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorExample;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import com.myehr.pojo.formmanage.button.SysFormButtonExport;
import com.myehr.pojo.formmanage.button.SysFormButtonExportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonExportExample;
import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonImportExample;
import com.myehr.pojo.formmanage.button.SysFormButtonInterface;
import com.myehr.pojo.formmanage.button.SysFormButtonInterfaceExample;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetail;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetailExample;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduce;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduceExample;
import com.myehr.pojo.formmanage.button.SysFormButtonParam;
import com.myehr.pojo.formmanage.button.SysFormButtonRemove;
import com.myehr.pojo.formmanage.button.SysFormButtonRemoveExample;
import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.button.SysFormButtonSaveExample;
import com.myehr.pojo.formmanage.button.SysMailsend;
import com.myehr.pojo.formmanage.button.SysMessagesend;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigExample;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.pojo.formmanage.form.SysTreeNodeTypeExample;
import com.myehr.pojo.formmanage.template.widget.SysTemplateCombobox;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.task.SysTimer;
import com.myehr.service.formmanage.runtime.IRuntmeButtonService;
import com.myehr.service.impl.formmanage.form.SysformconfigService;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/button")
public class ButtonController {
	
	@Autowired
	private SysFormButtonAddMapper sysFormButtonAddMapper;
	
	@Autowired
	private SysFormButtonSaveMapper sysFormButtonSaveMapper;
	
	@Autowired
	private SysFormButtonImportMapper sysFormButtonImportMapper;
	
	@Autowired
	private SysFormButtonExportMapper sysFormButtonExportMapper;
	
	@Autowired
	private SysFormButtonRemoveMapper sysFormButtonRemoveMapper;
	
	@Autowired
	private SysFormButtonInterfaceMapper sysFormButtonInterfaceMapper;
	
	@Autowired
	private SysFormButtonParamMapper sysFormButtonParamMapper;
	
	@Autowired
	private SysFormButtonImportColumnMapper sysFormButtonImportColumnMapper;
	
	@Autowired
	private SysFormButtonExportColumnMapper sysFormButtonExportColumnMapper;
	
	@Autowired
	private SysFormButtonIntroduceMapper sysFormButtonIntroduceMapper;
	
	@Autowired
	private SysFormconfigMapper sysFormConfigMapper;
	
	@Autowired
	private SysExecSqlMapper sysExecSqlMapper;
	
	@Autowired
	private SysEntityMapper sEntityMapper;
	
	@Autowired
	private SysFieldMapper sFieldMapper;
	
	@Autowired
	private SysFormGeneralParamMapper sysFormGeneralParamMapper;
	
	@Autowired
	private SysFormButtonIntrDetailMapper sysFormButtonIntrDetailMapper;
	
//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
	@Autowired
	private SysFormColumnMapper columnMapper;
	
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	@Autowired
	private SysFormComboboxMapper sComboboxMapper;
	@Autowired
	private SysTemplateComboboxMapper sTComboboxMapper;
	@Autowired
	private SysTreeNodeTypeMapper sNodeTypeMapper;
//	@Autowired
	@Resource(name = "IRuntmeButtonService")
	private IRuntmeButtonService butService;
	@Autowired
	private SysFormButtonEditorMapper sysFormButtonEditorMapper;
	@Autowired
	private SysMessagesendMapper sysMessagesendMapper;
	@Autowired
	private SysMailsendMapper sysMailsendMapper;
	@Autowired
	private SysTimerMapper sysTimerMapper;
	
	@Autowired
	private SysformconfigService sysformconfigService;
	
	@RequestMapping("/queryAddButtonById")
	public @ResponseBody SysFormButtonAdd queryAddButtonById(HttpServletRequest request) throws Exception{
		String buttonAddButtonId = request.getParameter("buttonAddButtonId");
		
		SysFormButtonAddExample example = new SysFormButtonAddExample();
		com.myehr.pojo.formmanage.button.SysFormButtonAddExample.Criteria criteria = example.createCriteria();
		criteria.andButtonAddButtonIdEqualTo(new BigDecimal(buttonAddButtonId));
		List<SysFormButtonAdd> buttonAdds = sysFormButtonAddMapper.selectByExample(example);
		if (buttonAdds.size()>0) {
			return buttonAdds.get(0);
		}else {
			SysFormButtonAdd SysFormButtonAdd = new SysFormButtonAdd();
			SysFormButtonAdd.setButtonAddButtonId(new BigDecimal(buttonAddButtonId));
			SysFormButtonAdd.setButtonAddType("addUrl");
			SysFormButtonAdd.setButtonAddExcType("default");
			SysFormButtonAdd.setButtonAddHeight("600");
			SysFormButtonAdd.setButtonAddWidth("800");
			sysFormButtonAddMapper.insert(SysFormButtonAdd);
			
			return sysFormButtonAddMapper.selectByExample(example).get(0);
		}
	}
	
	@RequestMapping("/saveAddButton")
	public @ResponseBody String saveAddButton(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		String formId = params.getFormId();
		int reCode = 0;
		
		String buttonAddId = (String) param.get("buttonAddId");
		SysFormButtonAdd buttonAdd = new SysFormButtonAdd();
		String buttonFormId = (String) param.get("buttonFormId");
		if (buttonFormId!=null && !buttonFormId.equals("")) {
			buttonAdd.setButtonFormId(new BigDecimal(buttonFormId));
		}
		if (buttonAddId==null || buttonAddId=="") {
			buttonAdd.setButtonAddButtonId(new BigDecimal((String) param.get("buttonAddButtonId")));
			buttonAdd.setButtonAddType((String) param.get("buttonAddType"));
			buttonAdd.setButtonAddExcType((String) param.get("buttonAddExcType"));
			buttonAdd.setButtonAddUrl((String) param.get("buttonAddUrl"));
			buttonAdd.setButtonFormName((String) param.get("buttonFormName"));
			buttonAdd.setButtonAddTitle((String) param.get("buttonAddTitle"));
			buttonAdd.setButtonAddWidth((String) param.get("buttonAddWidth"));
			buttonAdd.setButtonAddHeight((String) param.get("buttonAddHeight"));
			buttonAdd.setButtonAddSuccessDeal((String) param.get("buttonAddSuccessDeal"));
			buttonAdd.setButtonAddInitFun((String) param.get("buttonAddInitFun"));
			buttonAdd.setButtonAddFun((String) param.get("buttonAddFun"));
			buttonAdd.setButtonAddSuccessSelfFun((String) param.get("buttonAddSuccessSelfFun"));
			reCode = sysFormButtonAddMapper.insert(buttonAdd);
		}else {
			buttonAdd.setButtonAddId(new BigDecimal(buttonAddId));
			buttonAdd.setButtonAddButtonId(new BigDecimal((String) param.get("buttonAddButtonId")));
			buttonAdd.setButtonAddType((String) param.get("buttonAddType"));
			buttonAdd.setButtonAddExcType((String) param.get("buttonAddExcType"));
			buttonAdd.setButtonAddUrl((String) param.get("buttonAddUrl"));
			buttonAdd.setButtonFormName((String) param.get("buttonFormName"));
			buttonAdd.setButtonAddTitle((String) param.get("buttonAddTitle"));
			buttonAdd.setButtonAddWidth((String) param.get("buttonAddWidth"));
			buttonAdd.setButtonAddHeight((String) param.get("buttonAddHeight"));
			buttonAdd.setButtonAddSuccessDeal((String) param.get("buttonAddSuccessDeal"));
			buttonAdd.setButtonAddInitFun((String) param.get("buttonAddInitFun"));
			buttonAdd.setButtonAddFun((String) param.get("buttonAddFun"));
			buttonAdd.setButtonAddSuccessSelfFun((String) param.get("buttonAddSuccessSelfFun"));
			reCode = sysFormButtonAddMapper.updateByPrimaryKey(buttonAdd);
		}
		
		return menuJson;
	}
	
	@RequestMapping("/querySaveButtonById")
	public @ResponseBody SysFormButtonSave querySaveButtonById(HttpServletRequest request) throws Exception{
		String buttonSaveButtonId = request.getParameter("buttonSaveButtonId");
		
		SysFormButtonSaveExample example = new SysFormButtonSaveExample();
		com.myehr.pojo.formmanage.button.SysFormButtonSaveExample.Criteria criteria = example.createCriteria();
		criteria.andButtonSaveButtonIdEqualTo(new BigDecimal(buttonSaveButtonId));
		List<SysFormButtonSave> buttonSaves = sysFormButtonSaveMapper.selectByExample(example);
		if (buttonSaves.size()>0) {
			return buttonSaves.get(0);
		}else {
			SysFormButtonSave buttonSave = new SysFormButtonSave();
			buttonSave.setButtonSaveButtonId(new BigDecimal(buttonSaveButtonId));
			buttonSave.setButtonSaveType("1");
			buttonSave.setButtonSaveExcType("default");
			buttonSave.setButtonSaveSuccessDeal("1");
			sysFormButtonSaveMapper.insert(buttonSave);
			return sysFormButtonSaveMapper.selectByExample(example).get(0);
		}
	}
	
	@RequestMapping("/saveSaveButton")
	public @ResponseBody String saveSaveButton(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String buttonSaveId = (String) param.get("buttonSaveId");
		SysFormButtonSave buttonSave = new SysFormButtonSave();
		if (buttonSaveId==null || buttonSaveId=="") {
			int primarykey = keyserviceImpl.getMaxId("SYS_FORM_BUTTON_SAVE", "BUTTON_SAVE_ID");
			buttonSave.setButtonSaveId(new BigDecimal(primarykey));
			buttonSave.setButtonSaveButtonId(new BigDecimal((String) param.get("buttonSaveButtonId")));
			buttonSave.setButtonSaveExcType((String) param.get("buttonSaveExcType"));
			buttonSave.setButtonSaveType((String) param.get("buttonSaveType"));
			buttonSave.setButtonSaveSuccessDeal((String) param.get("buttonSaveSuccessDeal"));
			buttonSave.setButtonSaveInitFun((String) param.get("buttonSaveInitFun"));
			buttonSave.setButtonSaveFun((String) param.get("buttonSaveFun"));
			buttonSave.setButtonSaveSuccessFun((String) param.get("buttonSaveSuccessFun"));
			reCode = sysFormButtonSaveMapper.insert(buttonSave);
		}else {
			buttonSave.setButtonSaveId(new BigDecimal(buttonSaveId));
			buttonSave.setButtonSaveButtonId(new BigDecimal((String) param.get("buttonSaveButtonId")));
			buttonSave.setButtonSaveExcType((String) param.get("buttonSaveExcType"));
			buttonSave.setButtonSaveType((String) param.get("buttonSaveType"));
			buttonSave.setButtonSaveSuccessDeal((String) param.get("buttonSaveSuccessDeal"));
			buttonSave.setButtonSaveInitFun((String) param.get("buttonSaveInitFun"));
			buttonSave.setButtonSaveFun((String) param.get("buttonSaveFun"));
			buttonSave.setButtonSaveSuccessFun((String) param.get("buttonSaveSuccessFun"));
			reCode = sysFormButtonSaveMapper.updateByPrimaryKey(buttonSave);
		}
		return menuJson;
	}
	
	
	@RequestMapping("/queryRemoveButtonById")
	public @ResponseBody SysFormButtonRemove queryRemoveButtonById(HttpServletRequest request) throws Exception{
		String buttonRemoveButtonId = request.getParameter("buttonRemoveButtonId");
		
		SysFormButtonRemoveExample example = new SysFormButtonRemoveExample();
		com.myehr.pojo.formmanage.button.SysFormButtonRemoveExample.Criteria criteria = example.createCriteria();
		criteria.andButtonRemoveButtonIdEqualTo(new BigDecimal(buttonRemoveButtonId));
		List<SysFormButtonRemove> buttonRemoves = sysFormButtonRemoveMapper.selectByExample(example);
		if (buttonRemoves.size()>0) {
			return buttonRemoves.get(0);
		}else {
			SysFormButtonRemove buttonRemove = new SysFormButtonRemove();
			buttonRemove.setButtonRemoveButtonId(new BigDecimal(buttonRemoveButtonId));
			buttonRemove.setButtonRemoveExcType("default");
			buttonRemove.setButtonRemoveType("2");
			sysFormButtonRemoveMapper.insert(buttonRemove);
			return sysFormButtonRemoveMapper.selectByExample(example).get(0);
		}
	}
	
	@RequestMapping("/queryInterfaceButtonById")
	public @ResponseBody SysFormButtonInterface queryInterfaceButtonById(HttpServletRequest request) throws Exception{
		String buttonInterfaceButtonId = request.getParameter("buttonInterfaceButtonId");
		
		SysFormButtonInterfaceExample example = new SysFormButtonInterfaceExample();
		com.myehr.pojo.formmanage.button.SysFormButtonInterfaceExample.Criteria criteria = example.createCriteria();
		criteria.andButtonInterfaceButtonIdEqualTo(new BigDecimal(buttonInterfaceButtonId));
		List<SysFormButtonInterface> buttonInterfaces = sysFormButtonInterfaceMapper.selectByExample(example);
		if (buttonInterfaces.size()>0) {
			return buttonInterfaces.get(0);
		}else {
			return null;
		}
	}
	
	@RequestMapping("/saveRemoveButton")
	public @ResponseBody String saveRemoveButton(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String buttonRemoveId = (String) param.get("buttonRemoveId");
		SysFormButtonRemove buttonRemove = new SysFormButtonRemove();
		if (buttonRemoveId==null || buttonRemoveId=="") {
			int primarykey = keyserviceImpl.getMaxId("SYS_FORM_BUTTON_REMOVE", "BUTTON_REMOVE_ID");
			buttonRemove.setButtonRemoveId(new BigDecimal(primarykey));
			buttonRemove.setButtonRemoveButtonId(new BigDecimal((String) param.get("buttonRemoveButtonId")));
			buttonRemove.setButtonRemoveType((String) param.get("buttonRemoveType"));
			buttonRemove.setButtonRemoveExcType((String) param.get("buttonRemoveExcType"));
			buttonRemove.setButtonRemoveInitFun((String) param.get("buttonRemoveInitFun"));
			buttonRemove.setButtonRemoveFun((String) param.get("buttonRemoveFun"));
			reCode = sysFormButtonRemoveMapper.insert(buttonRemove);
		}else {
			buttonRemove.setButtonRemoveId(new BigDecimal(buttonRemoveId));
			buttonRemove.setButtonRemoveButtonId(new BigDecimal((String) param.get("buttonRemoveButtonId")));
			buttonRemove.setButtonRemoveType((String) param.get("buttonRemoveType"));
			buttonRemove.setButtonRemoveExcType((String) param.get("buttonRemoveExcType"));
			buttonRemove.setButtonRemoveInitFun((String) param.get("buttonRemoveInitFun"));
			buttonRemove.setButtonRemoveFun((String) param.get("buttonRemoveFun"));
			reCode = sysFormButtonRemoveMapper.updateByPrimaryKey(buttonRemove);
		}
		
		return menuJson;
	}
	
	@RequestMapping("/saveInterfaceButton")
	public @ResponseBody String saveInterfaceButton(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String buttonInterfaceId = (String) param.get("buttonInterfaceId");
		SysFormButtonInterface buttonInterface = new SysFormButtonInterface();
		if (buttonInterfaceId==null || buttonInterfaceId=="") {
			buttonInterface.setButtonInterfaceButtonId(new BigDecimal((String) param.get("buttonInterfaceButtonId")));
			buttonInterface.setButtonInterfaceSchemeId(new BigDecimal((String) param.get("buttonInterfaceSchemeId")));
			buttonInterface.setOperatorName(request.getSession().getAttribute("userid")+"");
			buttonInterface.setOperatorTime(new Date());
			reCode = sysFormButtonInterfaceMapper.insert(buttonInterface);
		}else {
			buttonInterface.setButtonInterfaceId(new BigDecimal(buttonInterfaceId));
			buttonInterface.setButtonInterfaceButtonId(new BigDecimal((String) param.get("buttonInterfaceButtonId")));
			buttonInterface.setButtonInterfaceSchemeId(new BigDecimal((String) param.get("buttonInterfaceSchemeId")));
			buttonInterface.setOperatorName(request.getSession().getAttribute("userid")+"");
			buttonInterface.setOperatorTime(new Date());
			reCode = sysFormButtonInterfaceMapper.updateByPrimaryKey(buttonInterface);
		}
		
		return menuJson;
	}
	
	
	@RequestMapping("/queryImportColumnByButtonId")
	public @ResponseBody ResultMap queryImportColumnByButtonId(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		Map requestParam = params.getRequestParam();
		Map filter = params.getFilter();
		String offset = params.getOffset();
		String limit = params.getLimit();
		//Map paramsMap = params.getParamsMap();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		String formButtonId = (String) requestParam.get("formButtonId");
		String searchValue = (String) filter.get("searchValue");
		
		String sql = "select T.FORM_COLUMN_ID, "
				   +" T.FORM_COLUMN_SORT, "
				   +" T.FORM_ENTITY_TABLENAME, "
			       +" T.FORM_FIELD_TABLENAME, "
			       +" T.FORM_COLUMN_LABLE, "
			       +" TC.IMPORT_COLUMN_TYPE, "
			       +" TC.IMPORT_COLUMN_ID, "
			       +" TC.IMPORT_COLUMN_DICT_TYPE, "
			       +" TC.IMPORT_RE_COLUMN_REL_ID, "
			       +" TC.IMPORT_COLUMN_UNIQUE, "
			       +" ( "
			       +"    case when  tc.import_column_bus_key is null then 'N' else tc.import_column_bus_key end  "
		           +" ) IMPORT_COLUMN_BUS_KEY, "
		           +" ( "
			       +"    case when  tc.import_column_forbid is null then 'N' else tc.import_column_forbid end  "
		           +" ) IMPORT_COLUMN_FORBID, "
			       +" (case "
			       +"   when tc.import_column_type = 'sql' then "
			       +"    (select (case when entity_sql is not null then '已编写sql' else null end  ) remarks "
			       +"       from sys_exec_sql "
			       +"      where exec_sql_type = 'EXECSQL_IMPORT_COLUMN_TYPE' "
			       +"        and exec_sql_relaid = tc.import_column_id) "
			       +" end) ESQL, "
			       +" (case when tc.import_column_type = 'dict' then "
			       +"   (SELECT DICT_TYPE_NAME "
			       +"     FROM SYS_DICT_TYPE "
			       +"    WHERE DICT_TYPE_CODE = TC.IMPORT_COLUMN_DICT_TYPE) end) DICT_NAME  "
		           +" from (select t1.*, t3.form_button_id "
		           +" from sys_form_column t1, sys_formconfig t2, sys_form_button t3 "
		           +" where t1.form_column_form_def_id = t2.form_def_id "
		           +" and t3.form_button_form_def_id = t2.form_def_id "
		           +" and t3.form_button_id = "+formButtonId
		           +" ) t "
		           +" left join (select * "
		           +"     from sys_form_button_import_column tn "
		           +"    where tn.import_column_button_id = "+formButtonId+") tc on t.form_column_id = tc.import_column_rel_id "
		           +"    ORDER BY T.FORM_COLUMN_SORT";
		List<Map> schemes = tMapperExt.queryByFormDefSql(sql);
		
		
		ResultMap resultMap=new ResultMap();
		
		
		List<Map> schemeList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>schemes.size()) {
			end = schemes.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			schemeList.add(schemes.get(i));
		}

		resultMap.setTotal(schemes.size());
		resultMap.setRows(schemeList);
		return resultMap;
	}
	
	@RequestMapping("/queryExportColumnByButtonId")
	public @ResponseBody ResultMap queryExportColumnByButtonId(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		Map requestParam = params.getRequestParam();
		Map filter = params.getFilter();
		String offset = params.getOffset();
		String limit = params.getLimit();
		//Map paramsMap = params.getParamsMap();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		String formButtonId = (String) requestParam.get("formButtonId");
		String searchValue = (String) filter.get("searchValue");
		
		String sql = "select T.FORM_COLUMN_ID, "
				   +" T.FORM_COLUMN_SORT, "
				   +" T.FORM_ENTITY_TABLENAME, "
			       +" T.FORM_FIELD_TABLENAME, "
			       +" T.FORM_COLUMN_LABLE, "
			       +" TC.EXPORT_COLUMN_TYPE, "
			       +" TC.EXPORT_COLUMN_ID, "
			       +" TC.EXPORT_COLUMN_DICT_TYPE, "
			       +" TC.EXPORT_RE_COLUMN_REL_ID, "
			       +" ( "
			       +"    case when  tc.export_column_bus_key is null then 'N' else tc.export_column_bus_key end  "
		           +" ) EXPORT_COLUMN_BUS_KEY, "
		           +" ( "
			       +"    case when  tc.export_column_forbid is null then 'N' else tc.export_column_forbid end  "
		           +" ) EXPORT_COLUMN_FORBID, "
			       +" (case "
			       +"   when tc.EXPORT_COLUMN_TYPE = 'sql' then "
			       +"    (select (case when entity_sql is not null then '已编写sql' else null end  ) remarks "
			       +"       from sys_exec_sql "
			       +"      where exec_sql_type = 'EXECSQL_IMPORT_COLUMN_TYPE' "
			       +"        and exec_sql_relaid = tc.EXPORT_COLUMN_ID) "
			       +" end) ESQL, "
			       +" (case when tc.EXPORT_COLUMN_TYPE = 'dict' then "
			       +"   (SELECT DICT_TYPE_NAME "
			       +"     FROM SYS_DICT_TYPE "
			       +"    WHERE DICT_TYPE_CODE = TC.export_column_dict_type) end) DICT_NAME  "
		           +" from (select t1.*, t3.form_button_id "
		           +" from sys_form_column t1, sys_formconfig t2, sys_form_button t3 "
		           +" where t1.form_column_form_def_id = t2.form_def_id "
		           +" and t3.form_button_form_def_id = t2.form_def_id "
		           +" and t3.form_button_id = "+formButtonId
		           +" ) t "
		           +" left join (select * "
		           +"     from SYS_FORM_BUTTON_EXPORT_COLUMN tn "
		           +"    where tn.export_column_button_id = "+formButtonId+") tc on t.form_column_id = tc.EXPORT_COLUMN_REL_ID "
		           +"    ORDER BY T.FORM_COLUMN_SORT";
		List<Map> schemes = tMapperExt.queryByFormDefSql(sql);
		
		
		ResultMap resultMap=new ResultMap();
		
		
		List<Map> schemeList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>schemes.size()) {
			end = schemes.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			schemeList.add(schemes.get(i));
		}

		resultMap.setTotal(schemes.size());
		resultMap.setRows(schemeList);
		return resultMap;
	}
	
	/**
	 * 查询导入按钮配置信息
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryImportButtonById")
	public @ResponseBody SysFormButtonImport queryImportButtonById(HttpServletRequest request) throws Exception{
		String formButtonId = request.getParameter("formButtonId");
		
		SysFormButtonImportExample example = new SysFormButtonImportExample();
		com.myehr.pojo.formmanage.button.SysFormButtonImportExample.Criteria criteria = example.createCriteria();
		criteria.andFormButtonIdEqualTo(new BigDecimal(formButtonId));
		List<SysFormButtonImport> buttonImports = sysFormButtonImportMapper.selectByExample(example);
		if (buttonImports.size()>0) {
			return buttonImports.get(0);
		}
		return null;
	}
	
	/**
	 * 查询导出按钮配置信息
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryExportButtonById")
	public @ResponseBody SysFormButtonExport queryExportButtonById(HttpServletRequest request) throws Exception{
		String formButtonId = request.getParameter("formButtonId");
		
		SysFormButtonExportExample example = new SysFormButtonExportExample();
		com.myehr.pojo.formmanage.button.SysFormButtonExportExample.Criteria criteria = example.createCriteria();
		criteria.andFormButtonIdEqualTo(new BigDecimal(formButtonId));
		List<SysFormButtonExport> buttonExports = sysFormButtonExportMapper.selectByExample(example);
		if (buttonExports.size()>0) {
			return buttonExports.get(0);
		}
		return null;
	}
	
	/**
	 * 通过按钮Id查询参数
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryButtonParamByButtonId")
	public @ResponseBody ResultMapNew queryButtonParamByButtonId(HttpServletRequest request) throws Exception{
		String formButtonId = request.getParameter("formButtonId");
		
		String sql = "select SYS_FORM_BUTTON_PARAM.BUTTON_PARAM_ID as buttonParamId, "+
				 " SYS_FORM_BUTTON_PARAM.BUTTON_ADD_ID as buttonAddId, "+
				 " SYS_FORM_BUTTON_PARAM.BUTTON_PARAM_NAME as buttonParamName, "+
				 " SYS_FORM_BUTTON_PARAM.BUTTON_PARAM_DESC as buttonParamDesc, "+
				 " SYS_FORM_BUTTON_PARAM.BUTTON_PARAM_FROM as buttonParamFrom, "+
				 " SYS_FORM_BUTTON_PARAM.BUTTON_PARAM_VALUE as buttonParamValue, "+
				 " SYS_FORM_BUTTON_PARAM.OPERATOR_NAME as operatorName, "+
				 " SYS_FORM_BUTTON_PARAM.OPERATOR_TIME as operatorTime "+
                 " from SYS_FORM_BUTTON_PARAM "+
				 " where SYS_FORM_BUTTON_PARAM.BUTTON_ADD_ID = "+formButtonId;
		List<Map> sysMenuParams = tMapperExt.queryByFormDefSql(sql);
		
		ResultMapNew resultMap=new ResultMapNew();
		
		resultMap.setTotal(sysMenuParams.size());
		resultMap.setRows(sysMenuParams);
		return resultMap;
	}
	
	
	/**
	 * 保存按钮参数
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/saveButtonParam")
	public @ResponseBody String[]  saveButtonParam(HttpServletRequest request,@RequestBody SaveMenuParamParams param) throws Throwable {
		String[] recode = new String[2];
		BigDecimal userId = (BigDecimal)request.getSession().getAttribute("userid");
		recode[0]="0";
		recode[1]="操作成功";
		
		List<Map> menuParams = param.getColumns();
		String buttonAddId = request.getParameter("buttonAddId");
		
		for (int i = 0; i < menuParams.size(); i++) {
			SysFormButtonParam buttonParam = new SysFormButtonParam();
			Map obj = menuParams.get(i);
			buttonParam.setButtonAddId(new BigDecimal(buttonAddId));
			buttonParam.setButtonParamName((String)obj.get("buttonParamName"));
			buttonParam.setButtonParamFrom((String)obj.get("buttonParamFrom"));
			buttonParam.setButtonParamValue((String)obj.get("buttonParamValue"));
			buttonParam.setOperatorName( userId);
			buttonParam.setOperatorTime(new Date());
			
			String buttonParamId = (String)obj.get("buttonParamId");
			
			if (buttonParamId==null || buttonParamId.equals("")) {
				sysFormButtonParamMapper.insert(buttonParam);
			}else{
				buttonParam.setButtonParamId(new BigDecimal(buttonParamId));
				sysFormButtonParamMapper.updateByPrimaryKey(buttonParam);
			}
		}
		
		return recode;
	}
	
	/**
	 * 保存导入字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/saveImportButtonColumn")
	public @ResponseBody String[]  saveImportButtonColumn(HttpServletRequest request,@RequestBody SaveMenuParamParams param) throws Throwable {
		String[] recode = new String[2];
		BigDecimal userId = (BigDecimal)request.getSession().getAttribute("userid");
		recode[0]="0";
		recode[1]="操作成功";
		
		List<Map> menuParams = param.getColumns();
		String formButtonId = request.getParameter("formButtonId");
		/*SysFormButtonImportColumnExample example = new SysFormButtonImportColumnExample();
		example.or().andImportColumnButtonIdEqualTo(new BigDecimal(formButtonId));
		sysFormButtonImportColumnMapper.deleteByExample(example);*/
		
		for (int i = 0; i < menuParams.size(); i++) {
			SysFormButtonImportColumn importParam = new SysFormButtonImportColumn();
			Map obj = menuParams.get(i);
			String importColumnType = (String)obj.get("importColumnType");
			if(importColumnType!=null&&importColumnType.equals("sql")){
				importParam.setImportColumnDictType(null);
			}else {
				importParam.setImportColumnDictType((String)obj.get("importColumnDictType"));
			}
			importParam.setImportColumnRelId(new BigDecimal((String)obj.get("importColumnRelId")));
			importParam.setImportColumnType(importColumnType);
			
			importParam.setImportColumnButtonId(new BigDecimal(formButtonId));
			importParam.setImportColumnBusKey((String)obj.get("importColumnBusKey"));
			importParam.setImportColumnForbid((String)obj.get("importColumnForbid"));
			String importReColumnRelId = (String)obj.get("importReColumnRelId");
			if(importReColumnRelId!=null && !importReColumnRelId.equals("")){
				importParam.setImportReColumnRelId(new BigDecimal((String)obj.get("importReColumnRelId")));
			}
			importParam.setImportColumnUnique((String)obj.get("importColumnUnique"));
			importParam.setOperatorName(userId+"");
			importParam.setOperatorTime(new Date());
			
			String importColumnId = (String)obj.get("importColumnId");
			
			if (importColumnId==null || importColumnId.equals("") || importColumnId.equals("null")) {
				sysFormButtonImportColumnMapper.insert(importParam);
			}else{
				importParam.setImportColumnId(new BigDecimal(importColumnId));
				sysFormButtonImportColumnMapper.updateByPrimaryKey(importParam);
			}
		}
		
		return recode;
	}
	
	/**
	 * 保存导入字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/saveExportButtonColumn")
	public @ResponseBody String[]  saveExportButtonColumn(HttpServletRequest request,@RequestBody SaveMenuParamParams param) throws Throwable {
		String[] recode = new String[2];
		BigDecimal userId = (BigDecimal)request.getSession().getAttribute("userid");
		recode[0]="0";
		recode[1]="操作成功";
		
		List<Map> menuParams = param.getColumns();
		String formButtonId = request.getParameter("formButtonId");
		
		for (int i = 0; i < menuParams.size(); i++) {
			SysFormButtonExportColumn exportParam = new SysFormButtonExportColumn();
			Map obj = menuParams.get(i);
			String exportColumnType = (String)obj.get("exportColumnType");
			if(exportColumnType!=null&&exportColumnType.equals("sql")){
				exportParam.setExportColumnDictType(null);
			}else {
				exportParam.setExportColumnDictType((String)obj.get("exportColumnDictType"));
			}
			exportParam.setExportColumnRelId(new BigDecimal((String)obj.get("exportColumnRelId")));
			exportParam.setExportColumnType(exportColumnType);
			
			exportParam.setExportColumnButtonId(new BigDecimal(formButtonId));
			exportParam.setExportColumnBusKey((String)obj.get("exportColumnBusKey"));
			exportParam.setExportColumnForbid((String)obj.get("exportColumnForbid"));
			String importReColumnRelId = (String)obj.get("exportReColumnRelId");
			if(importReColumnRelId!=null && !importReColumnRelId.equals("")){
				exportParam.setExportReColumnRelId(new BigDecimal((String)obj.get("exportReColumnRelId")));
			}
			exportParam.setOperatorName(userId+"");
			exportParam.setOperatorTime(new Date());
			
			String exportColumnId = (String)obj.get("exportColumnId");
			
			if (exportColumnId==null || exportColumnId.equals("") || exportColumnId.equals("null")) {
				sysFormButtonExportColumnMapper.insert(exportParam);
			}else{
				exportParam.setExportColumnId(new BigDecimal(exportColumnId));
				sysFormButtonExportColumnMapper.updateByPrimaryKey(exportParam);
			}
		}
		
		return recode;
	}
	
	@RequestMapping("/saveImportButton")
	public @ResponseBody String saveImportButton(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		String userId = request.getSession().getAttribute("userid")+"";
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		String formId = params.getFormId();
		int reCode = 0;
		
		String buttonImportId = (String) param.get("buttonImportId");
		String formButtonId = (String) param.get("formButtonId");
		
		if (buttonImportId==null || buttonImportId=="") {
			SysFormButtonImport buttonImport = new SysFormButtonImport();
			if (formButtonId!=null && !formButtonId.equals("")) {
				buttonImport.setFormButtonId(new BigDecimal(formButtonId));
			}
			buttonImport.setButtonImportExcType((String) param.get("buttonImportExcType"));
			buttonImport.setButtonImportInitFun((String) param.get("buttonImportInitFun"));
			buttonImport.setButtonImportFun((String) param.get("buttonImportFun"));
			buttonImport.setButtonImportTemplate((String) param.get("buttonImportTemplate"));
			buttonImport.setButtonImportUrl((String) param.get("buttonImportUrl"));
			buttonImport.setButtonImportSql((String) param.get("buttonImportSql"));
			buttonImport.setOperatorName(userId);
			buttonImport.setOperatorTime(new Date());
			reCode = sysFormButtonImportMapper.insert(buttonImport);
		}else {
			SysFormButtonImport buttonImport = sysFormButtonImportMapper.selectByPrimaryKey(new BigDecimal(buttonImportId));
			if (formButtonId!=null && !formButtonId.equals("")) {
				buttonImport.setFormButtonId(new BigDecimal(formButtonId));
			}
			buttonImport.setButtonImportExcType((String) param.get("buttonImportExcType"));
			buttonImport.setButtonImportInitFun((String) param.get("buttonImportInitFun"));
			buttonImport.setButtonImportFun((String) param.get("buttonImportFun"));
			buttonImport.setButtonImportTemplate((String) param.get("buttonImportTemplate"));
			buttonImport.setButtonImportUrl((String) param.get("buttonImportUrl"));
			buttonImport.setButtonImportSql((String) param.get("buttonImportSql"));
			buttonImport.setOperatorName(userId);
			buttonImport.setOperatorTime(new Date());
			reCode = sysFormButtonImportMapper.updateByPrimaryKey(buttonImport);
		}
		
		return menuJson;
	}
	
	
	@RequestMapping("/saveExportButton")
	public @ResponseBody String saveExportButton(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		String userId = request.getSession().getAttribute("userid")+"";
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		String formId = params.getFormId();
		int reCode = 0;
		
		String buttonExportId = (String) param.get("buttonExportId");
		SysFormButtonExport buttonExport = new SysFormButtonExport();
		String formButtonId = (String) param.get("formButtonId");
		if (formButtonId!=null && !formButtonId.equals("")) {
			buttonExport.setFormButtonId(new BigDecimal(formButtonId));
		}
		if (buttonExportId==null || buttonExportId=="") {
			buttonExport.setButtonExportFilename((String) param.get("buttonExportFilename"));
			buttonExport.setButtonExportExcType((String) param.get("buttonExportExcType"));
			buttonExport.setButtonExportInitFun((String) param.get("buttonExportInitFun"));
			buttonExport.setButtonExportFun((String) param.get("buttonExportFun"));
			buttonExport.setButtonExportSql((String) param.get("buttonExportSql"));
			buttonExport.setOperatorName(userId);
			buttonExport.setOperatorTime(new Date());
			reCode = sysFormButtonExportMapper.insert(buttonExport);
		}else {
			buttonExport.setButtonExportId(new BigDecimal(buttonExportId));
			buttonExport.setButtonExportFilename((String) param.get("buttonExportFilename"));
			buttonExport.setButtonExportExcType((String) param.get("buttonExportExcType"));
			buttonExport.setButtonExportInitFun((String) param.get("buttonExportInitFun"));
			buttonExport.setButtonExportFun((String) param.get("buttonExportFun"));
			buttonExport.setButtonExportSql((String) param.get("buttonExportSql"));
			buttonExport.setOperatorName(userId);
			buttonExport.setOperatorTime(new Date());
			reCode = sysFormButtonExportMapper.updateByPrimaryKey(buttonExport);
		}
		
		return menuJson;
	}
	
	/**
	 * 删除按钮参数
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/deleteButtonParamById")
	public @ResponseBody String[]  deleteButtonParamById(HttpServletRequest request,@RequestBody SysFormButtonParam buttonParam) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		
		sysFormButtonParamMapper.deleteByPrimaryKey(buttonParam.getButtonParamId());
		
		return recode;
	}
	
	@RequestMapping("/querySysFormButtonIntroduceById")
	public @ResponseBody SysFormButtonIntroduce querySysFormButtonIntroduceById(HttpServletRequest request) throws Exception{
		String userId = (BigDecimal)request.getSession().getAttribute("userid")+"";
		String introduceButtonId = request.getParameter("formButtonId");
		
		SysFormButtonIntroduceExample example = new SysFormButtonIntroduceExample();
		com.myehr.pojo.formmanage.button.SysFormButtonIntroduceExample.Criteria criteria = example.createCriteria();
		criteria.andIntroduceButtonIdEqualTo(new BigDecimal(introduceButtonId));
		List<SysFormButtonIntroduce> buttonIntroduceS = sysFormButtonIntroduceMapper.selectByExample(example);
		if (buttonIntroduceS.size()>0) {
			return buttonIntroduceS.get(0);
		}else{
			SysFormButtonIntroduce  introduce = new SysFormButtonIntroduce();
			introduce.setIntroduceButtonId(new BigDecimal(introduceButtonId));
			introduce.setIntroduceType("default");
			introduce.setIntroduceTitle("");
			introduce.setIntroduceWidth("1000");
			introduce.setIntroduceHeight("600");
			introduce.setIntroduceInitFun("");
			introduce.setIntroduceSelfFun("");
			introduce.setIntroduceUrl("");
			introduce.setOperatorName(userId);
			introduce.setOperatorTime(new Date());
			sysFormButtonIntroduceMapper.insert(introduce);
			List<SysFormButtonIntroduce> buttonIntroduceS1 = sysFormButtonIntroduceMapper.selectByExample(example);
			return buttonIntroduceS1.get(0);
		}
	}
	
	@RequestMapping("/querySysFormNameByFormId")
	public @ResponseBody SysFormconfig querySysFormNameByFormId(HttpServletRequest request) throws Exception{
		String introduceFormId = request.getParameter("introduceFormId");
		
		SysFormconfigExample example = new SysFormconfigExample();
		com.myehr.pojo.formmanage.form.SysFormconfigExample.Criteria criteria = example.createCriteria();
		criteria.andFormDefIdEqualTo(new BigDecimal(introduceFormId));
		List<SysFormconfig> forms = sysFormConfigMapper.selectByExample(example);

		return forms.get(0);
	}
	
	/**
	 * 保存引入按钮信息
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveSysFormButtonIntroduce")
	public @ResponseBody String saveSysFormButtonIntroduce(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		String userId = (BigDecimal)request.getSession().getAttribute("userid")+"";
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String introduceId = (String) param.get("introduceId")+"";
		SysFormButtonIntroduce  introduce = new SysFormButtonIntroduce();
		if (introduceId==null || introduceId.equals("")) {
			String  introduceExcsqlId = (String) param.get("introduceButtonId");
			if (introduceExcsqlId!=null && !introduceExcsqlId.equals("")) {
				introduce.setIntroduceExcsqlId(new BigDecimal(introduceExcsqlId));
			}
			String  introduceFormId = (String) param.get("introduceFormId");
			if (introduceFormId!=null && !introduceFormId.equals("")) {
				introduce.setIntroduceFormId(new BigDecimal(introduceFormId));
			}
			introduce.setIntroduceButtonId(new BigDecimal((String) param.get("introduceButtonId")));
			introduce.setIntroduceType((String) param.get("introduceType"));
			introduce.setIntroduceTitle((String) param.get("introduceTitle"));
			introduce.setIntroduceWidth((String) param.get("introduceWidth"));
			introduce.setIntroduceHeight((String) param.get("introduceHeight"));
			introduce.setIntroduceInitFun((String) param.get("introduceInitFun"));
			introduce.setIntroduceSelfFun((String) param.get("introduceSelfFun"));
			introduce.setIntroduceUrl((String) param.get("introduceUrl"));
			
			introduce.setOperatorName(userId);
			introduce.setOperatorTime(new Date());
			reCode = sysFormButtonIntroduceMapper.insert(introduce);
		}else {
			introduce.setIntroduceId(new BigDecimal((String) param.get("introduceId")));
			String  introduceExcsqlId = (String) param.get("introduceButtonId");
			if (introduceExcsqlId!=null && !introduceExcsqlId.equals("")) {
				introduce.setIntroduceExcsqlId(new BigDecimal(introduceExcsqlId));
			}
			String  introduceFormId = (String) param.get("introduceFormId");
			if (introduceFormId!=null && !introduceFormId.equals("")) {
				introduce.setIntroduceFormId(new BigDecimal(introduceFormId));
			}
			introduce.setIntroduceButtonId(new BigDecimal((String) param.get("introduceButtonId")));
			introduce.setIntroduceType((String) param.get("introduceType"));
			introduce.setIntroduceTitle((String) param.get("introduceTitle"));
			introduce.setIntroduceWidth((String) param.get("introduceWidth"));
			introduce.setIntroduceHeight((String) param.get("introduceHeight"));
			introduce.setIntroduceInitFun((String) param.get("introduceInitFun"));
			introduce.setIntroduceSelfFun((String) param.get("introduceSelfFun"));
			introduce.setIntroduceUrl((String) param.get("introduceUrl"));
			
			introduce.setOperatorName(userId);
			introduce.setOperatorTime(new Date());
			reCode = sysFormButtonIntroduceMapper.updateByPrimaryKey(introduce);
		}
		
		return menuJson;
	}
	
	
	/**
	 * 查询引入按钮参数
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/queryParamByIntroduceId")
	public @ResponseBody ResultFilters  queryParamByIntroduceId(HttpServletRequest request) throws Throwable {
		String introduceId = request.getParameter("introduceId");
		String paramType = request.getParameter("paramType");
		
		ResultFilters resultMap = new ResultFilters();
		String sql = "select t.PARAM_ID as paramId,"
				+" t.PARAM_TYPE as paramType,"
				+" t.PARAM_TYPE_VALUE as paramTypeValue,"
				+" t.PARAM_NAME as paramName,"
				+" t.PARAM_FROM_TYPE as paramFromType,"
				+" t.PARAM_FROM_VALUE as paramFromValue"
				+"  from SYS_FORM_GENERAL_PARAM t"
				+"  where t.PARAM_TYPE_VALUE = "+introduceId
				+"  and t.PARAM_TYPE = '"+paramType+"'";
		List<Map> filters = tMapperExt.queryByFormDefSql(sql);
		
		resultMap.setRows(filters);
		resultMap.setTotal(filters.size());
		
		return resultMap;
	}
	
	/**
	 * 保存引入按钮参数
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/saveIntroduceButtonParam")
	public @ResponseBody String[]  saveIntroduceButtonParam(HttpServletRequest request,@RequestBody List<SysFormGeneralParam> generalParams) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		
		for (int i = 0; i < generalParams.size(); i++) {
			SysFormGeneralParam generalParam = generalParams.get(i);
			if (generalParam.getParamId()!=null && !(generalParam.getParamId()+"").equals("")) {
				sysFormGeneralParamMapper.updateByPrimaryKey(generalParam);
			}else{
				sysFormGeneralParamMapper.insert(generalParam);
			}
		}
		
		return recode;
	}
	
	/**
	 * 删除引入按钮参数
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/deleteIntroduceButtonParamById")
	public @ResponseBody String[]  deleteIntroduceButtonParamById(HttpServletRequest request,@RequestBody SysFormGeneralParam param) throws Throwable {
		String[] recode = new String[2];
		
		sysFormGeneralParamMapper.deleteByPrimaryKey(param.getParamId());
		
		recode[0]="0";
		recode[1]="操作成功";
		
		return recode;
	}
	
	/**
	 * 查询引入按钮引入表单字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/queryIntroduceColumnByFormId")
	public @ResponseBody ResultFilters  queryIntroduceColumnByformId(HttpServletRequest request) throws Throwable {
		String formId = request.getParameter("formId");
		String introduceId = request.getParameter("introduceId");
		
		ResultFilters resultMap = new ResultFilters();
		String sql = "select t.FORM_COLUMN_ID as formColumnId,"
				+" t.FORM_ENTITY_TABLENAME as formEntityTablename,"
				+" t.FORM_FIELD_TABLENAME as formFieldTablename,"
				+" t.FORM_COLUMN_LABLE as formColumnLable"
				+"  from SYS_FORM_COLUMN t"
				+"  where t.FORM_COLUMN_ID not in ( Select SYS_FORM_BUTTON_INTR_DETAIL.FORM_COLUMN_ID from SYS_FORM_BUTTON_INTR_DETAIL where SYS_FORM_BUTTON_INTR_DETAIL.INTRODUCE_ID="+introduceId+") and t.FORM_COLUMN_FORM_DEF_ID = "+formId;
		List<Map> filters = tMapperExt.queryByFormDefSql(sql);
		
		resultMap.setRows(filters);
		resultMap.setTotal(filters.size());
		
		return resultMap;
	}
	
	/**
	 * 查询引入按钮引入表单字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 *//*
	@RequestMapping("/queryIntroduceDetailByIntroduceId")
	public @ResponseBody ResultFilters  queryIntroduceDetailByIntroduceId(HttpServletRequest request) throws Throwable {
		String formId = request.getParameter("formId");
		
		ResultFilters resultMap = new ResultFilters();
		String sql = "select t.FORM_COLUMN_ID as formColumnId,"
				+" t.FORM_ENTITY_TABLENAME as formEntityTablename,"
				+" t.FORM_FIELD_TABLENAME as formFieldTablename,"
				+" t.FORM_COLUMN_LABLE as formColumnLable"
				+"  from SYS_FORM_COLUMN t"
				+"  where t.FORM_COLUMN_FORM_DEF_ID = "+formId;
		List<Map> filters = tMapperExt.queryByFormDefSql(sql);
		
		resultMap.setRows(filters);
		resultMap.setTotal(filters.size());
		
		return resultMap;
	}*/
	
	/**
	 * 查询引入按钮所选表单字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/queryIntroduceColumnByTargetFormId")
	public @ResponseBody ResultFilters  queryIntroduceColumnByTargetFormId(HttpServletRequest request) throws Throwable {
		String formId = request.getParameter("targetFormId");
		
		ResultFilters resultMap = new ResultFilters();
		String sql = "select t.FORM_COLUMN_ID as formColumnId,"
				+" t.FORM_ENTITY_TABLENAME as formEntityTablename,"
				+" t.FORM_FIELD_TABLENAME as formFieldTablename,"
				+" t.FORM_COLUMN_LABLE as formColumnLable"
				+"  from SYS_FORM_COLUMN t"
				+"  where t.FORM_COLUMN_FORM_DEF_ID = "+formId;
		List<Map> filters = tMapperExt.queryByFormDefSql(sql);
		
		resultMap.setRows(filters);
		resultMap.setTotal(filters.size());
		
		return resultMap;
	}
	
	/**
	 * 查询引入按钮字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/queryIntroduceColumnByIntroduceId")
	public @ResponseBody ResultFilters  queryIntroduceColumnByIntroduceId(HttpServletRequest request) throws Throwable {
		String introduceId = request.getParameter("introduceId");
		
		ResultFilters resultMap = new ResultFilters();
		String sql = "select o.INTR_DETAIL_ID as intrDetailId, "
				+" o.FORM_COLUMN_ID as formColumnId, "
				+" o.TARGET_COLUMN_ID as targetColumnId, "
				+" o.INTRODUCE_ID as introduceId, "
				+" o.TARGET_COLUMN_TYPE as targetColumnType, "
				+" o.FORM_COLUMN_LABLE as formColumnLable, "
				+" o.TARGET_COLUMN_LABLE as targetColumnLable "
				+" from (select t1.*, "
				+" t2.form_column_lable FORM_COLUMN_LABLE, "
				+" T3.FORM_COLUMN_LABLE TARGET_COLUMN_LABLE "
				+" from SYS_FORM_BUTTON_INTR_DETAIL t1 "
				+" left join sys_form_column t2 "
				+" on t1.form_column_id = t2.form_column_id "
				+" left JOIN sys_form_column T3 "
				+" ON T3.FORM_COLUMN_ID = T1.TARGET_COLUMN_ID "
				+" where t1.target_column_type = 'c' "
				+" union all "
				+" select t1.*, "
				+" t2.form_column_lable FORM_COLUMN_LABLE, "
				+" T1.TARGET_COLUMN_ID TARGET_COLUMN_LABLE "
				+" from SYS_FORM_BUTTON_INTR_DETAIL t1 "
				+" left join sys_form_column t2 "
				+" on t1.form_column_id = t2.form_column_id "
				+" where t1.target_column_type != 'c') o"
				+"  where o.INTRODUCE_ID = "+introduceId+" ORDER BY intrDetailId";
		List<Map> filters = tMapperExt.queryByFormDefSql(sql);
		
		resultMap.setRows(filters);
		resultMap.setTotal(filters.size());
		
		return resultMap;
	}
	
	
	/**
	 * 保存引入按钮参数
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/saveIntroduceColumn")
	public @ResponseBody String[]  saveIntroduceColumn(HttpServletRequest request,@RequestBody List<SysFormButtonIntrDetail> sysFormButtonIntrDetails) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		
		for (int i = 0; i < sysFormButtonIntrDetails.size(); i++) {
			SysFormButtonIntrDetail sysFormButtonIntrDetail = sysFormButtonIntrDetails.get(i);
			if (sysFormButtonIntrDetail.getIntrDetailId()!=null && !(sysFormButtonIntrDetail.getIntrDetailId()+"").equals("")) {
				sysFormButtonIntrDetailMapper.updateByPrimaryKey(sysFormButtonIntrDetail);
			}else{
				sysFormButtonIntrDetailMapper.insert(sysFormButtonIntrDetail);
			}
		}
		return recode;
	}
	
	@RequestMapping("/getCreateParamById")
	public @ResponseBody String[]  getCreateParamById(HttpServletRequest request) throws Throwable {
		String intrToId = request.getParameter("intrToId");//引入数据表单ID
		String intrButtonId = request.getParameter("intrButtonId");//引入按钮ID
		SysFormButtonIntroduceExample example = new SysFormButtonIntroduceExample();
		example.or().andIntroduceButtonIdEqualTo(new BigDecimal(intrButtonId));
		List<SysFormButtonIntroduce> introduces = sysFormButtonIntroduceMapper.selectByExample(example);
		if (introduces.size()>0) {
			SysFormButtonIntrDetailExample example2 = new SysFormButtonIntrDetailExample();
			example2.or().andIntroduceIdEqualTo(introduces.get(0).getIntroduceId()).andTargetColumnTypeEqualTo("l");
			List<SysFormButtonIntrDetail> intrDetails = sysFormButtonIntrDetailMapper.selectByExample(example2);
			String[] creatParams = new String[intrDetails.size()];
			int i = 0 ;
			for (SysFormButtonIntrDetail sysFormButtonIntrDetail : intrDetails) {
				creatParams[i] = sysFormButtonIntrDetail.getTargetColumnId();
				i++;
			}
			return creatParams;
		}
		return null;
	}
	
	@RequestMapping("/getRequestParamById")
	public @ResponseBody String[]  getRequestParamById(HttpServletRequest request) throws Throwable {
		String intrToId = request.getParameter("intrToId");//引入数据表单ID
		String intrButtonId = request.getParameter("intrButtonId");//引入按钮ID
		SysFormButtonIntroduceExample example = new SysFormButtonIntroduceExample();
		example.or().andIntroduceButtonIdEqualTo(new BigDecimal(intrButtonId));
		List<SysFormButtonIntroduce> introduces = sysFormButtonIntroduceMapper.selectByExample(example);
		if (introduces.size()>0) {
			SysFormButtonIntrDetailExample example2 = new SysFormButtonIntrDetailExample();
			example2.or().andIntroduceIdEqualTo(introduces.get(0).getIntroduceId()).andTargetColumnTypeEqualTo("r");
			List<SysFormButtonIntrDetail> intrDetails = sysFormButtonIntrDetailMapper.selectByExample(example2);
			String[] requestParams = new String[intrDetails.size()];
			int i = 0 ;
			for (SysFormButtonIntrDetail sysFormButtonIntrDetail : intrDetails) {
				requestParams[i] = sysFormButtonIntrDetail.getTargetColumnId();
				i++;
			}
			return requestParams;
		}
		return null;
	}
	
	/**
	 * 列表引入数据保存
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/saveIntroduceGrid")
	public @ResponseBody Object  saveIntroduceGrid(HttpServletRequest request,@RequestBody IntroduceParam param) throws Throwable {
		String formId = request.getParameter("formId");//引入数据来源表单ID
		String intrToId = request.getParameter("intrToId");//引入数据表单ID
		String intrButtonId = request.getParameter("intrButtonId");//引入按钮ID
		String[] recode = new String[2];
		HttpSession session = request.getSession();
		//引入按钮信息
		SysFormButtonIntroduceExample example = new SysFormButtonIntroduceExample();
		example.or().andIntroduceButtonIdEqualTo(new BigDecimal(intrButtonId));
		List<SysFormButtonIntroduce> introduces = sysFormButtonIntroduceMapper.selectByExample(example);
		if (introduces.size()>0) {
			SysFormButtonIntrDetailExample example2 = new SysFormButtonIntrDetailExample();
			example2.or().andIntroduceIdEqualTo(introduces.get(0).getIntroduceId());
			List<SysFormButtonIntrDetail> intrDetails = sysFormButtonIntrDetailMapper.selectByExample(example2);
			for (int i = 0; i < param.getColumns().size(); i++) {
				Map map = new HashMap();
				for (SysFormButtonIntrDetail sysFormButtonIntrDetail : intrDetails) {
					//当前表关联表单字段ID
					String formColumnCode1 = getColumnCodeById(sysFormButtonIntrDetail.getFormColumnId()+"");
					if (sysFormButtonIntrDetail.getTargetColumnType().toLowerCase().equals("c")) {
						//目标表关联字段ID
						String formColumnCode2 = getColumnCodeById(sysFormButtonIntrDetail.getTargetColumnId()+"").toUpperCase();
						map.put(formColumnCode1,param.getColumns().get(i).get(formColumnCode2)+"");//
					} else if (sysFormButtonIntrDetail.getTargetColumnType().toLowerCase().equals("l")){
						String formColumnCode2 = sysFormButtonIntrDetail.getTargetColumnId()+"";
						map.put(formColumnCode1,param.getCreatParam().get(formColumnCode2)+"");//
					} else if (sysFormButtonIntrDetail.getTargetColumnType().toLowerCase().equals("r")){
						String formColumnCode2 = sysFormButtonIntrDetail.getTargetColumnId()+"";
						map.put(formColumnCode1,param.getRequestParam().get(formColumnCode2)+"");//
					} else if (sysFormButtonIntrDetail.getTargetColumnType().toLowerCase().equals("s")){
						String formColumnCode2 = sysFormButtonIntrDetail.getTargetColumnId()+"";
						map.put(formColumnCode1,(String)(session.getAttribute(formColumnCode2)+""));//
					} else if (sysFormButtonIntrDetail.getTargetColumnType().toLowerCase().equals("x")){
						String formColumnCode2 = sysFormButtonIntrDetail.getTargetColumnId()+"";
						Date now = new Date(); 
						/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//可以方便地修改日期格式
						String hehe = dateFormat.format(now);*/
						
						if (formColumnCode2.equals("NOW&DATE")) {
							map.put(formColumnCode1,now.getTime()+"");//
						} else {
							map.put(formColumnCode1,formColumnCode2);//
						}
						
					}
				}
				SaveButtonParams params = new SaveButtonParams();
				params.setFormId(intrToId);
				params.setButtonId(intrButtonId);
				params.setParam(map);
				if(params!=null){
					 recode = butService.cardFormSaveButtonSave(params.getParam(),params.getFormId(), params.getParamsMap(), params.getButtonId(), request,"introduce","sqlserver");
				}
			}
			recode[0]="0";
			recode[1]="操作成功";
			return recode;
		} else {
			return null;
		}
		
	}
	
	public String getColumnCodeById(String formColumnId){
		SysFormColumn column = columnMapper.selectByPrimaryKey(new BigDecimal(formColumnId));
		return ChangeCode.getUniqueCode(column.getFormEntityTablename(), column.getFormFieldTablename());
	}
	
	@RequestMapping("/isTreeOrGrid")
	public @ResponseBody int  isTreeOrGrid(HttpServletRequest request) throws Throwable {
		int recode = 0;
		String formDefId = request.getParameter("formDefId");
		SysFormconfig form = sysFormConfigMapper.selectByPrimaryKey(new BigDecimal(formDefId));
		try {
			if (form.getFormDefLayoutType().equals("3")) {
				SysTreeNodeTypeExample example = new SysTreeNodeTypeExample();
				example.or().andFormTreeFormIdEqualTo(new BigDecimal(formDefId));
				List<SysTreeNodeType> nodeType = sNodeTypeMapper.selectByExample(example);
				if (nodeType.size()>1) {
					return 2;//关联树不止一个节点
				}else if (nodeType.size()==1) {
					return nodeType.get(0).getTreeNodeTypeFormId().intValue();
				}else {
					return 1;//关联树没有节点
				}
			}else{
				return Integer.valueOf(formDefId);
			}
		} catch (Exception e) {
			// TODO: handle exception
			return recode;
		}
	}
	
	@RequestMapping("/deleteIntroduceColumn")
	public @ResponseBody String deleteIntroduceColumn(HttpServletRequest request) throws Exception{
		String reCode = "";
		
		String intrDetailIds = request.getParameter("intrDetailIds");
		String[] solutionId = intrDetailIds.split(",");
		for (int i = 0; i < solutionId.length; i++) {
			reCode = sysFormButtonIntrDetailMapper.deleteByPrimaryKey(new BigDecimal(solutionId[i]))+"";
		}	
		return reCode;
	}
	
	@RequestMapping("/queryExecSql")
	public @ResponseBody SysExecSql queryExecSql(HttpServletRequest request) throws Exception{
		String execSqlRelaid = request.getParameter("execSqlRelaid");
		String execSqlType = request.getParameter("execSqlType");
		
		SysExecSqlExample example = new SysExecSqlExample();
		com.myehr.pojo.formmanage.form.SysExecSqlExample.Criteria criteria = example.createCriteria();
		criteria.andExecSqlRelaidEqualTo(Long.parseLong(execSqlRelaid));
		if (execSqlType!=null && !execSqlType.equals("")) {
			criteria.andExecSqlTypeEqualTo(execSqlType);
		}
		List<SysExecSql> forms = sysExecSqlMapper.selectByExample(example);
		if (forms.size()>0) {
			return forms.get(0);
		}
		return null;
	}
	
	@RequestMapping("/queryExecSqlWidget")
	public @ResponseBody SysExecSql queryExecSqlWidget(HttpServletRequest request) throws Exception{
		String execId = request.getParameter("execId");		
		SysExecSql forms = sysExecSqlMapper.selectByPrimaryKey(new BigDecimal(execId));
		if (forms!=null) {
			return forms;
		}
		return null;
	}
	
	@RequestMapping("/saveExecSql")
	public @ResponseBody String saveExecSql(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		String userId = (BigDecimal)request.getSession().getAttribute("userid")+"";
		String execSqlId = (String) param.get("execSqlId");
		SysExecSql sysExecSql = new SysExecSql();
		String typeString = ((String) param.get("execSqlType")).toUpperCase();
		if (execSqlId==null || execSqlId.equals("")) {
			sysExecSql.setExecSqlRelaid(Long.parseLong((String) param.get("execSqlRelaid")));
			sysExecSql.setExecSqlType((String) param.get("execSqlType"));
			sysExecSql.setAfterExecFun((String) param.get("afterExecFun"));
			sysExecSql.setAfterExecType((String) param.get("afterExecType"));
			sysExecSql.setEntitySql((String) param.get("entitySql"));
			sysExecSql.setExecSql(getRealSql((String) param.get("entitySql")));
			if (sysExecSql.getExecSqlType().toUpperCase().equals("TEMPLATE_COMBOBOX_INIT")||sysExecSql.getExecSqlType().toUpperCase().equals("COMBOBOX_INIT")) {
				//sysExecSql.setExecSqlType("COMBOBOX_INIT");
				reCode = sysExecSqlMapper.insert(sysExecSql);
			}else {
				reCode = sysExecSqlMapper.insert(sysExecSql);
			}
		}else {
			sysExecSql.setExecSqlType(typeString);
			sysExecSql.setExecSqlId(new BigDecimal(execSqlId));
			sysExecSql.setExecSqlRelaid(Long.parseLong((String) param.get("execSqlRelaid")));
			sysExecSql.setAfterExecFun((String) param.get("afterExecFun"));
			sysExecSql.setAfterExecType((String) param.get("afterExecType"));
			sysExecSql.setEntitySql((String) param.get("entitySql"));
			sysExecSql.setExecSql(getRealSql((String) param.get("entitySql")));
			reCode = sysExecSqlMapper.updateByPrimaryKey(sysExecSql);
		}
		if (typeString.equals("TIMERSQL")) {
			String timerId = sysExecSql.getExecSqlRelaid()+"";
			SysTimer sysTimer = sysTimerMapper.selectByPrimaryKey(Long.parseLong(timerId));
			sysTimer.setSysTimerExecSqlId(sysExecSql.getExecSqlId().intValue());
			sysTimerMapper.updateByPrimaryKey(sysTimer);
		}
		if (typeString.equals("COMBOBOX_INIT")) {
			String comboboxId = sysExecSql.getExecSqlRelaid()+"";
			SysFormCombobox sCombobox = sComboboxMapper.selectByPrimaryKey(new BigDecimal(comboboxId));
			sCombobox.setComboboxGuiInitExcsqlId(sysExecSql.getExecSqlId());
			sCombobox.setOperatorName(userId);
			sCombobox.setOperatorTime(new Date());
			sComboboxMapper.updateByPrimaryKey(sCombobox);
			sysformconfigService.setCardDictDataByColumnId(sCombobox.getComboboxFormColumnId()+"",userId);
		}
		if (typeString.equals("TEMPLATE_COMBOBOX_INIT")) {
			String comboboxId = sysExecSql.getExecSqlRelaid()+"";
			SysTemplateCombobox sCombobox = sTComboboxMapper.selectByPrimaryKey(new BigDecimal(comboboxId));
			sCombobox.setComboboxGuiInitExcsqlId(sysExecSql.getExecSqlId());
			sTComboboxMapper.updateByPrimaryKey(sCombobox);
		}
		return menuJson;
	}
	
	public String getRealSql(String entitySql) {
		if(entitySql==null){
			return null;
		}
		String result = new String(entitySql);
		
		//获取所有实体字段名并替换为表字段名
		String reg = "\\[[^c:^p:^s:^r:^a:].*?\\]";
		Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(entitySql);
        while(m .find()){
        	   String ret = m.group();
        	   if(ret.indexOf(".*")>-1){  //[xx.*]的处理
        		   String tableChinesName = ret.substring(ret.indexOf("[")+1,ret.indexOf(".*]"));
        		   SysEntityExample example = new SysEntityExample();
        		   example.or().andEntityChinanameEqualTo(tableChinesName).andDeleteMarkEqualTo("N");
        		   //String ss = sEntityMapper.selectByExample(example).get(0).getEntityTablename();
        		   SysEntity entity = sEntityMapper.selectByExample(example).get(0);
        		   SysFieldExample example2 = new SysFieldExample();
        		   example2.or().andFieldEntityIdEqualTo(new BigDecimal(entity.getEntityId()));
        		   List<SysField> fields = sFieldMapper.selectByExample(example2);
        		   String ss = "";
        		   int i = 0;
        		   for (SysField sysField : fields) {
        			   if(i==0){
        				   ss = entity.getEntityCode()+"."+sysField.getFieldCode()+" AS "+sysField.getFieldTablename();
        			   }else {
        				   ss = ss+","+ entity.getEntityCode()+"."+sysField.getFieldCode()+" AS "+sysField.getFieldTablename();
        			   }
        			   i++;
        		   }
        		   //大改
        		   result = result.replace(""+ret+"",ss);
        		   continue;
        	   }
        	   String reg1="\\[.+\\..*?\\]";
        	   Pattern p1 = Pattern.compile(reg1);
        	   Matcher m1 = p1.matcher(ret);
               if(m1.find()){  //[xx.zz]的处理
               		String temp = m1.group();
               		String tableChinesName = temp.substring(ret.indexOf("[")+1,ret.indexOf("."));
               		String columnChinaname = ret.substring(ret.indexOf(".")+1,ret.indexOf("]"));
               		SysEntityExample example = new SysEntityExample();
               		example.or().andEntityChinanameEqualTo(tableChinesName).andDeleteMarkEqualTo("N");
               		SysEntity entity = sEntityMapper.selectByExample(example).get(0);
               		SysFieldExample example2 = new SysFieldExample();
               		example2.or().andFieldEntityIdEqualTo(new BigDecimal(entity.getEntityId())).andFieldChinaNameEqualTo(columnChinaname);
               		List<SysField> obj =  sFieldMapper.selectByExample(example2);
               		if(obj.size()==0){
               			return "通过实体中文名:\""+tableChinesName+"\"和字段中文名\""+columnChinaname+"\"无法获取对应的数据库字段名!";
               		}
               		//String fieldTablename = obj.get(0).getFieldTablename();
               		String fieldTablename = obj.get(0).getFieldCode();
               		String entityTableName =entity.getEntityTablename();
               		//小改
               		result = result.replace(""+temp+"",entityTableName+"."+fieldTablename+" AS "+ entityTableName+"_"+fieldTablename);
               		continue;
               }
               String reg2="\\[.+.*?\\]";
               Pattern p2 = Pattern.compile(reg2);
        	   Matcher m2 = p2.matcher(ret);
               if(m2.find()){ //[xx]的处理
               		String temp = m2.group();
               		String tableChinesName = temp.substring(ret.indexOf("[")+1,ret.indexOf("]"));
               		SysEntityExample example = new SysEntityExample();
               		example.or().andEntityChinanameEqualTo(tableChinesName).andDeleteMarkEqualTo("N");
               		SysEntity entity2 = sEntityMapper.selectByExample(example).get(0);
               		if(entity2==null||entity2.getEntityTablename()==null){
            			return "通过实体中文名:\""+tableChinesName+"\"无法获取对应数据库表名!";
               		}
               		String entityName = entity2.getEntityTablename();
               		result = result.replace(""+temp+"",entityName);
               		continue;
               }
        }
        //获取非实体列字段
        //获取第一个select 到 from 之间的字符串
		return result;
	}
	
	
	@RequestMapping("/saveEditorModel")
	public @ResponseBody String saveEditorModel(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String buttonEditorModelId = (String) param.get("buttonEditorModelId");
		SysFormButtonEditorWithBLOBs buttonEditor = new SysFormButtonEditorWithBLOBs();
		if (buttonEditorModelId==null || buttonEditorModelId.equals("")) {
			buttonEditor.setButtonEditorModelValue((String) param.get("buttonEditorModelValue"));
			buttonEditor.setButtonEditorModelHtml((String) param.get("buttonEditorModelHtml"));
			buttonEditor.setButtonEditorModelFormid(Long.parseLong(params.getFormId()));
			buttonEditor.setButtonEditorModelButtonid(Long.parseLong(params.getButtonId()));
			buttonEditor.setEditorModelType("editor");
			reCode = sysFormButtonEditorMapper.insert(buttonEditor);
		}else {
			buttonEditor.setButtonEditorModelId(new BigDecimal(buttonEditorModelId).longValue());
			buttonEditor.setButtonEditorModelValue((String) param.get("buttonEditorModelValue"));
			buttonEditor.setButtonEditorModelHtml((String) param.get("buttonEditorModelHtml"));
			buttonEditor.setButtonEditorModelFormid(Long.parseLong(params.getFormId()));
			buttonEditor.setButtonEditorModelButtonid(Long.parseLong(params.getButtonId()));
			buttonEditor.setEditorModelType("editor");
			reCode = sysFormButtonEditorMapper.updateByPrimaryKeyWithBLOBs(buttonEditor);
		}
		return menuJson;
	}
	
	
	@RequestMapping("/saveEmailModel")
	public @ResponseBody String saveEmailModel(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String buttonEditorModelId = (String) param.get("buttonEditorModelId");
		SysFormButtonEditorWithBLOBs buttonEditor = new SysFormButtonEditorWithBLOBs();
		if (buttonEditorModelId==null || buttonEditorModelId.equals("")) {
			buttonEditor.setButtonEditorModelValue((String) param.get("buttonEditorModelValue"));
			buttonEditor.setButtonEditorModelHtml((String) param.get("buttonEditorModelHtml"));
			buttonEditor.setButtonEditorModelFormid(Long.parseLong(params.getFormId()));
			buttonEditor.setButtonEditorModelButtonid(Long.parseLong(params.getButtonId()));
			buttonEditor.setEditorModelType("email");
			if (param.get("editorModelId")==null || param.get("editorModelId").equals("")) {
				
			}else {
				buttonEditor.setEditorModelId(Long.parseLong((String) param.get("editorModelId")));
			}
			
			buttonEditor.setEditorModelName((String) param.get("editorModelName"));
			buttonEditor.setEditorMessageType((String) param.get("editorMessageType"));
			reCode = sysFormButtonEditorMapper.insert(buttonEditor);
		}else {
			buttonEditor.setButtonEditorModelId(new BigDecimal(buttonEditorModelId).longValue());
			buttonEditor.setButtonEditorModelValue((String) param.get("buttonEditorModelValue"));
			buttonEditor.setButtonEditorModelHtml((String) param.get("buttonEditorModelHtml"));
			buttonEditor.setButtonEditorModelFormid(Long.parseLong(params.getFormId()));
			buttonEditor.setButtonEditorModelButtonid(Long.parseLong(params.getButtonId()));
			buttonEditor.setEditorModelType("email");
			if (param.get("editorModelId")==null || param.get("editorModelId").equals("")) {
				
			}else {
				buttonEditor.setEditorModelId(Long.parseLong((String) param.get("editorModelId")));
			}
			
			buttonEditor.setEditorModelName((String) param.get("editorModelName"));
			buttonEditor.setEditorMessageType((String) param.get("editorMessageType"));
			reCode = sysFormButtonEditorMapper.updateByPrimaryKeyWithBLOBs(buttonEditor);
		}
		return menuJson;
	}
	
	@RequestMapping("/saveMessageModel")
	public @ResponseBody String saveMessageModel(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String menuJson = "";
		
		Map param = params.getParam();
		Map paramsMap = params.getParamsMap();
		int reCode = 0;
		
		String buttonEditorModelId = (String) param.get("buttonEditorModelId");
		SysFormButtonEditorWithBLOBs buttonEditor = new SysFormButtonEditorWithBLOBs();
		if (buttonEditorModelId==null || buttonEditorModelId.equals("")) {
			buttonEditor.setButtonEditorModelValue((String) param.get("buttonEditorModelValue"));
			buttonEditor.setButtonEditorModelHtml((String) param.get("buttonEditorModelHtml"));
			buttonEditor.setButtonEditorModelFormid(Long.parseLong(params.getFormId()));
			buttonEditor.setButtonEditorModelButtonid(Long.parseLong(params.getButtonId()));
			buttonEditor.setEditorModelType("message");
			buttonEditor.setEditorModelId(Long.parseLong((String) param.get("editorModelId")));
			buttonEditor.setEditorModelName((String) param.get("editorModelName"));
			buttonEditor.setEditorMessageType((String) param.get("editorMessageType"));
			reCode = sysFormButtonEditorMapper.insert(buttonEditor);
		}else {
			buttonEditor.setButtonEditorModelId(new BigDecimal(buttonEditorModelId).longValue());
			buttonEditor.setButtonEditorModelValue((String) param.get("buttonEditorModelValue"));
			buttonEditor.setButtonEditorModelHtml((String) param.get("buttonEditorModelHtml"));
			buttonEditor.setButtonEditorModelFormid(Long.parseLong(params.getFormId()));
			buttonEditor.setButtonEditorModelButtonid(Long.parseLong(params.getButtonId()));
			buttonEditor.setEditorModelType("message");
			buttonEditor.setEditorModelId(Long.parseLong((String) param.get("editorModelId")));
			buttonEditor.setEditorModelName((String) param.get("editorModelName"));
			buttonEditor.setEditorMessageType((String) param.get("editorMessageType"));
			reCode = sysFormButtonEditorMapper.updateByPrimaryKeyWithBLOBs(buttonEditor);
		}
		return menuJson;
	}
	
	@RequestMapping("/saveMessages")
	public @ResponseBody String saveMessages(HttpServletRequest request, @RequestBody SaveMessageParams params) throws Exception{
		String menuJson = "";
		
		Map param = new HashMap();
		int reCode = 0;
		String[] messages = params.getMessages();
		String messagetype = params.getMessageType();
		for (int i = 0; i < messages.length; i++) {
			SysMessagesend messagesend = new SysMessagesend();
			messagesend.setMessagetype(Integer.parseInt(messagetype));
			messagesend.setMessagecontent(messages[i]);
			sysMessagesendMapper.insert(messagesend);
		}
		return menuJson;
	}
	
	@RequestMapping("/saveEmails")
	public @ResponseBody String saveEmails(HttpServletRequest request, @RequestBody SaveMessageParams params) throws Exception{
		String menuJson = "";
		
		Map param = new HashMap();
		int reCode = 0;
		String[] emails = params.getMessages();
		//String messagetype = params.getMessageType();
		for (int i = 0; i < emails.length; i++) {
			SysMailsend mailsend = new SysMailsend();
			mailsend.setMailcontent(emails[i]);
			sysMailsendMapper.insert(mailsend);
			SendHTMLEmail.sendEmailBy163("wz971254207@163.com","wz13093376302","myehr@163.com",emails[i],"");
		}
		return menuJson;
	}
	
	@RequestMapping("/queryEditorModel")
	public @ResponseBody SysFormButtonEditorWithBLOBs queryEditorModel(HttpServletRequest request) throws Exception{
		String execSqlRelaid = request.getParameter("execSqlRelaid");
		
		
		SysFormButtonEditorExample example = new SysFormButtonEditorExample();
		com.myehr.pojo.formmanage.button.SysFormButtonEditorExample.Criteria criteria = example.createCriteria();
		criteria.andButtonEditorModelButtonidEqualTo(Long.parseLong(execSqlRelaid));
		List<SysFormButtonEditorWithBLOBs> editors = sysFormButtonEditorMapper.selectByExampleWithBLOBs(example);
		if (editors.size()>0) {
			return editors.get(0);
		}
		return null;
	}
}
