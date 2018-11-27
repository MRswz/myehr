package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.JedisFactory;
import com.myehr.common.util.SerializeUtil;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.mapper.activiti.ActHiProcinstMapper;
import com.myehr.mapper.activiti.ActReModelMapper;
import com.myehr.mapper.activiti.SysActTitleMapper;
import com.myehr.mapper.activiti.expand.ActNodePropertiesExpandMapper;
import com.myehr.mapper.cache.SysCacheConfigMapper;
import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.field.SysFieldMapper;
import com.myehr.mapper.field.SysFieldRuleMapper;
import com.myehr.mapper.fileinput.ActShowHisMapper;
import com.myehr.mapper.fileinput.C11Mapper;
import com.myehr.mapper.formmanage.button.SysFormButtonAddMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonCalculateMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonEditorMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonExportMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonImportMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonIntroduceMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonRemoveMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonSaveMapper;
import com.myehr.mapper.formmanage.form.SysActfreeConductMapper;
import com.myehr.mapper.formmanage.form.SysActfreeHisMapper;
import com.myehr.mapper.formmanage.form.SysActfreeModelMapper;
import com.myehr.mapper.formmanage.form.SysActfreeTaskMapper;
import com.myehr.mapper.formmanage.form.SysActfreeWayMapper;
import com.myehr.mapper.formmanage.form.SysCardtocardConfigMapper;
import com.myehr.mapper.formmanage.form.SysExecSqlMapper;
import com.myehr.mapper.formmanage.form.SysFileuploadConfigMapper;
import com.myehr.mapper.formmanage.form.SysFormButtonMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnExpandMapper;
import com.myehr.mapper.formmanage.form.SysFormColumnMapper;
import com.myehr.mapper.formmanage.form.SysFormFolderTreeMapper;
import com.myehr.mapper.formmanage.form.SysFormGeneralParamMapper;
import com.myehr.mapper.formmanage.form.SysFormGroupMapper;
import com.myehr.mapper.formmanage.form.SysFormWhereMapper;
import com.myehr.mapper.formmanage.form.SysFormYkReportMapper;
import com.myehr.mapper.formmanage.form.SysFormYkReportQueryparamsMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.formmanage.form.SysGridFilterColumnMapper;
import com.myehr.mapper.formmanage.form.SysGridFilterMapper;
import com.myehr.mapper.formmanage.form.SysSqlParamsMapper;
import com.myehr.mapper.formmanage.question.SysExamtemplateMapper;
import com.myehr.mapper.formmanage.question.SysExamtemplateQuestionMapper;
import com.myehr.mapper.formmanage.question.SysQuestionMapper;
import com.myehr.mapper.formmanage.template.gridbycard.SysGridbycardTemplateColumnMapper;
import com.myehr.mapper.formmanage.widget.SysFormComboboxMapper;
import com.myehr.mapper.formmanage.widget.SysFormDatepickerMapper;
import com.myehr.mapper.formmanage.widget.SysFormFileuploadMapper;
import com.myehr.mapper.formmanage.widget.SysFormLookupMapper;
import com.myehr.mapper.formmanage.widget.SysFormRadiobuttonlistMapper;
import com.myehr.mapper.formmanage.widget.SysFormRichtextMapper;
import com.myehr.mapper.formmanage.widget.SysFormTextboxMapper;
import com.myehr.mapper.sysMenuRole.SysMenuRoleMapper;
import com.myehr.mapper.sysParam.SysSystemParamMapper;
import com.myehr.mapper.sysUserRole.SysUserRoleMapper;
import com.myehr.mapper.sysdict.SysDictEntryMapper;
import com.myehr.mapper.sysdict.SysDictTypeMapper;
import com.myehr.mapper.sysmenu.SysMenuMapper;
import com.myehr.mapper.sysmenu.SysMenuMapperExpand;
import com.myehr.mapper.sysuser.EmpVEmp1basicMapper;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.mapper.task.SysTaskMapper;
import com.myehr.pojo.activiti.ActHiProcinst;
import com.myehr.pojo.activiti.ActHiProcinstExample;
import com.myehr.pojo.activiti.ActReModel;
import com.myehr.pojo.activiti.ActReModelExample;
import com.myehr.pojo.activiti.SysActTitle;
import com.myehr.pojo.activiti.SysActTitleExample;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpand;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpandExample;
import com.myehr.pojo.cache.SysCacheConfig;
import com.myehr.pojo.cache.SysCacheConfigExample;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.dict.SysDictEntryExample;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.dict.SysDictTypeExample;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.entity.SysEntityExample;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldExample;
import com.myehr.pojo.field.SysFieldRule;
import com.myehr.pojo.fileinput.ActShowHis;
import com.myehr.pojo.fileinput.ActShowHisExample;
import com.myehr.pojo.fileinput.C11;
import com.myehr.pojo.fileinput.C11Example;
import com.myehr.pojo.formmanage.button.SysFormButtonAdd;
import com.myehr.pojo.formmanage.button.SysFormButtonAddExample;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculate;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculateExample;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorExample;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import com.myehr.pojo.formmanage.button.SysFormButtonExport;
import com.myehr.pojo.formmanage.button.SysFormButtonExportExample;
import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonImportExample;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduce;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduceExample;
import com.myehr.pojo.formmanage.button.SysFormButtonRemove;
import com.myehr.pojo.formmanage.button.SysFormButtonRemoveExample;
import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.button.SysFormButtonSaveExample;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.form.SysActfreeConduct;
import com.myehr.pojo.formmanage.form.SysActfreeConductExample;
import com.myehr.pojo.formmanage.form.SysActfreeHis;
import com.myehr.pojo.formmanage.form.SysActfreeHisExample;
import com.myehr.pojo.formmanage.form.SysActfreeModel;
import com.myehr.pojo.formmanage.form.SysActfreeModelExample;
import com.myehr.pojo.formmanage.form.SysActfreeTask;
import com.myehr.pojo.formmanage.form.SysActfreeTaskExample;
import com.myehr.pojo.formmanage.form.SysActfreeWay;
import com.myehr.pojo.formmanage.form.SysActfreeWayExample;
import com.myehr.pojo.formmanage.form.SysCardtocardConfig;
import com.myehr.pojo.formmanage.form.SysCardtocardConfigExample;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import com.myehr.pojo.formmanage.form.SysFileuploadConfig;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormButtonExample;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormColumnExample;
import com.myehr.pojo.formmanage.form.SysFormFolderTree;
import com.myehr.pojo.formmanage.form.SysFormFolderTreeExample;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGeneralParamExample;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.form.SysFormGroupExample;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormWhereExample;
import com.myehr.pojo.formmanage.form.SysFormYkReport;
import com.myehr.pojo.formmanage.form.SysFormYkReportExample;
import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparams;
import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparamsExample;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigExample;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysGridFilter;
import com.myehr.pojo.formmanage.form.SysGridFilterColumn;
import com.myehr.pojo.formmanage.form.SysGridFilterExample;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.formmanage.question.SysExamtemplate;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestion;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestionExample;
import com.myehr.pojo.formmanage.question.SysQuestion;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumn;
import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumnExample;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormComboboxExample;
import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormDatepickerExample;
import com.myehr.pojo.formmanage.widget.SysFormFileupload;
import com.myehr.pojo.formmanage.widget.SysFormFileuploadExample;
import com.myehr.pojo.formmanage.widget.SysFormLookup;
import com.myehr.pojo.formmanage.widget.SysFormLookupExample;
import com.myehr.pojo.formmanage.widget.SysFormRadiobuttonlist;
import com.myehr.pojo.formmanage.widget.SysFormRadiobuttonlistExample;
import com.myehr.pojo.formmanage.widget.SysFormRichtext;
import com.myehr.pojo.formmanage.widget.SysFormRichtextExample;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.pojo.formmanage.widget.SysFormTextboxExample;
import com.myehr.pojo.sysMenuRole.SysMenuRoleExample;
import com.myehr.pojo.sysParam.SysSystemParam;
import com.myehr.pojo.sysParam.SysSystemParamExample;
import com.myehr.pojo.sysUserRole.SysUserRole;
import com.myehr.pojo.sysUserRole.SysUserRoleExample;
import com.myehr.pojo.sysmenu.SysMenu;
import com.myehr.pojo.sysuser.EmpVEmp1basic;
import com.myehr.pojo.sysuser.EmpVEmp1basicExample;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExample;
import com.myehr.pojo.sysuser.SysUserExpand;
import com.myehr.pojo.task.SysTask;
import com.myehr.pojo.task.SysTaskExample;
import com.myehr.service.formmanage.form.IFilterService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.menu.SysMenuService;
import com.sun.org.apache.bcel.internal.generic.NEW;
public class SysformconfigService implements   ISysformconfigService {
	private static Logger logger = LoggerFactory.getLogger(SysformconfigService.class);
	@Autowired
	SysFormGroupMapper mapper;
	
	@Autowired
	SysFormColumnMapper sColumnMapper;
	
	@Autowired
	SysDictTypeMapper sysDictTypeMapper;
	
	@Autowired
	SysDictEntryMapper sysDictEntryMapper;
	
	@Autowired
	SysEntityMapper sysEntityMapper;
	@Autowired
	SysCardtocardConfigMapper cardtocardConfigMapper;
	@Autowired
	SysFieldMapper sysFieldMapper;
	@Autowired
	SysFieldRuleMapper sysFieldRuleMapper;
	@Autowired
	SysMenuRoleMapper sysMenuRoleMapper;
	
	@Autowired
	SysMenuMapperExpand sysMenuMapperExpand;	
	
	@Autowired
	SysMenuMapper sysMenuMapper;
	
	@Autowired
	SysFormColumnMapper sysFormColumnMapper;
	
	@Autowired
	SysGridFilterMapper sysGridFilterMapper;
	
	@Autowired
	SysFormWhereMapper sysFormWhereMapper;
	
	@Autowired
	SysGridFilterColumnMapper sysGridFilterColumnMapper;
	
	@Autowired
	SysFormButtonMapper sysFormButtonMapper;
	
	@Autowired
	SysFormconfigMapper sysFormconfigMapper;
	
	@Autowired
	SysFormColumnExpandMapper sysFormColumnExpandMapper ;
	
	@Autowired
	SysFormTextboxMapper sysFormTextboxMapper;
	
	@Autowired
	SysFormComboboxMapper sysFormComboboxMapper;

	@Autowired 
	private SysMenuService sMService;
	@Autowired
	SysFormRadiobuttonlistMapper sysFormRadiobuttonlistMapper;
	
	@Autowired
	SysFormDatepickerMapper sysFormDatepickerMapper;
	
	@Autowired
	SysFormLookupMapper sysFormLookupMapper;
	
	@Autowired
	SysFormRichtextMapper sysFormRichtextMapper;
	
	@Autowired
	SysFormFileuploadMapper sysFormFileuploadMapper;
	
	@Autowired
	SysFormButtonSaveMapper sysFormButtonSaveMapper;
	
	@Autowired
	SysFormButtonAddMapper sysFormButtonAddMapper;
	
	@Autowired
	SysFormButtonRemoveMapper sysFormButtonRemoveMapper;
	
	@Autowired
	SysFormButtonImportMapper sysFormButtonImportMapper;
	
	@Autowired
	SysFormButtonExportMapper sysFormButtonExportMapper;
	
	@Autowired
	SysFormButtonCalculateMapper sysFormButtonCalculateMapper;
	
	@Autowired
	SysFormButtonIntroduceMapper sysFormButtonIntroduceMapper;
	
	@Autowired
	SysFormButtonEditorMapper sysFormButtonEditorMapper;
	
	@Autowired
	SysExecSqlMapper sysExecSqlMapper;
	
	@Autowired
	SysExamtemplateQuestionMapper sQuestionMapper;
	
	@Autowired
	SysQuestionMapper sQuestionMapper2;
	
	@Autowired
	SysExamtemplateMapper sExamtemplateMapper;
	
	@Autowired
	EmpVEmp1basicMapper empVEmp1basicMapper;
	@Autowired
	IFilterService IFilterService;
	@Autowired
	C11Mapper cMapper;
	
	@Autowired
	SysFormGeneralParamMapper sysFormGeneralParamMapper;
	@Autowired
	SysFileuploadConfigMapper fileuploadConfigMapper;
	@Autowired
	SysFormFolderTreeMapper sysFormFolderTreeMapper;
	@Autowired
	SysCacheConfigMapper cacheConfigMapper;
	@Autowired
	SysSystemParamMapper sysSystemParamMapper;
	@Autowired
	ActShowHisMapper actShowHisMapper;
	@Autowired
	SysUserMapper userMapper;

	@Autowired
	private ActReModelMapper actReModelMapper;

	@Autowired
	private ActHiProcinstMapper actHiProcinstMapper;
	
	@Autowired
	private ActNodePropertiesExpandMapper actNodePropertiesExpandMapper;
	@Autowired
	SysActTitleMapper actTitleMapper;
	@Autowired
	SysUserRoleMapper sysUserRoleMapper;
	@Autowired
	SysActfreeWayMapper sysActfreeWayMapper;
	@Autowired
	SysActfreeTaskMapper sysActfreeTaskMapper;
	@Autowired
	SysActfreeConductMapper sysActfreeConductMapper;
	@Autowired
	SysActfreeHisMapper sysActfreeHisMapper;
	@Autowired
	SysActfreeModelMapper sysActfreeModelMapper;
	@Autowired 
	SysGridbycardTemplateColumnMapper gridbycardTemplateColumnMapper;
	@Autowired
	private SysTaskMapper sysTaskMapper;
	@Autowired
	SysFormYkReportQueryparamsMapper ykReportQueryparamsMapper;
	@Autowired
	SysFormYkReportMapper ykReportMapper;
	@Autowired
	SysSqlParamsMapper sqlParamsMapper;
	private static Map<String,SysFormconfigCache> formMap  =new ConcurrentHashMap<String, SysFormconfigCache>();
	private static Map<String,Map> entityMap = new ConcurrentHashMap<String, Map>();
	private static Map<String,JSONArray> dictsGridMap = new ConcurrentHashMap<String, JSONArray>();
	private static Map<String,List<DictData>> dictsGridTypeMap = new ConcurrentHashMap<String, List<DictData>>();
	private static Map<String,List<DictData>> dictsCardMap = new ConcurrentHashMap<String, List<DictData>>();
	private static Map<String,List<DictData>> dictsCardTypeMap = new ConcurrentHashMap<String, List<DictData>>();
	private static Map<String,Map> dictNameMap = new ConcurrentHashMap<String,Map>();
	private static Map<String,Map> dictValueMap = new ConcurrentHashMap<String,Map>();
	private static Map<String,List<SysFormColumn>> columnFormByUseridMap = new ConcurrentHashMap<String,List<SysFormColumn>>();
	private static Map<String,List<Map>> columnWithFieldRuleMap = new ConcurrentHashMap<String, List<Map>>();
	private static Map<String,List<SysFormGeneralParam>> generalParamByRuleIdMap = new ConcurrentHashMap<String, List<SysFormGeneralParam>>();
	private static Map<String,Map> formDictMap = new ConcurrentHashMap<String, Map>();//表单字典临时缓存
	private static Map<String,SysSystemParam> systemParamMap = new ConcurrentHashMap<String, SysSystemParam>();
	private static Map<String,SysUser> userMap = new ConcurrentHashMap<String,SysUser>();//当前登录用户信息缓存;
	
	/*private static Map<String,List<SysField>> fieldsMap  =new ConcurrentHashMap<String, List<SysField>>();
	
	private static Map<String,List<SysMenu>> menusMap  =new ConcurrentHashMap<String, List<SysMenu>>();
	
	private static Map<String,SysFormconfigWithBLOBs> formInfoMap  =new ConcurrentHashMap<String, SysFormconfigWithBLOBs>();
	
	private static Map<String,List<SysFormColumn>> columnsMap  =new ConcurrentHashMap<String, List<SysFormColumn>>();
	
	private static Map<String,SysFormColumn> columnMap  =new ConcurrentHashMap<String, SysFormColumn>();
	
	private static Map<String,List<SysFormButton>> buttonsMap  =new ConcurrentHashMap<String, List<SysFormButton>>();
	
	private static Map<String,List<SysFormWhere>> wheresMap  =new ConcurrentHashMap<String, List<SysFormWhere>>();
	
	private static Map<String,SysGridFilter> filterMap  =new ConcurrentHashMap<String, SysGridFilter>();
	
	private static Map<String,List<SysGridFilterColumn>> filterColumnsMap  =new ConcurrentHashMap<String, List<SysGridFilterColumn>>();
	
	private static Map<String,SysFormTextbox> textboxMap  =new ConcurrentHashMap<String, SysFormTextbox>();
	
	private static Map<String,SysFormCombobox> comboboxMap  =new ConcurrentHashMap<String, SysFormCombobox>();
	
	private static Map<String,SysFormRadiobuttonlist> radiobuttonlistMap  =new ConcurrentHashMap<String, SysFormRadiobuttonlist>();
	
	private static Map<String,SysFormDatepicker> datepickerMap  =new ConcurrentHashMap<String, SysFormDatepicker>();
	
	private static Map<String,SysFormLookup> lookupMap  =new ConcurrentHashMap<String, SysFormLookup>();
	
	private static Map<String,SysFormRichtext> richtextMap  =new ConcurrentHashMap<String, SysFormRichtext>();
	
	private static Map<String,SysFormFileupload> fileuploadMap  =new ConcurrentHashMap<String, SysFormFileupload>();
	
	private static Map<String,SysFormButtonSave> buttonSaveMap  =new ConcurrentHashMap<String, SysFormButtonSave>();
	
	private static Map<String,SysFormButtonAdd> buttonAddMap  =new ConcurrentHashMap<String, SysFormButtonAdd>();
	
	private static Map<String,SysFormButtonRemove> buttonRemoveMap  =new ConcurrentHashMap<String, SysFormButtonRemove>();
	
	private static Map<String,SysFormButtonImport> buttonImportMap  =new ConcurrentHashMap<String, SysFormButtonImport>();
	
	private static Map<String,SysFormButtonCalculate> buttonCalculateMap  =new ConcurrentHashMap<String, SysFormButtonCalculate>();
	
	private static Map<String,SysFormButtonIntroduce> buttonIntroduceMap  =new ConcurrentHashMap<String, SysFormButtonIntroduce>();
	
	private static Map<String,SysExecSql> sysExecSqlMap  =new ConcurrentHashMap<String, SysExecSql>();
	
	private static Map<String,List<SysExamtemplateQuestion>> sysQuestionsMap = new ConcurrentHashMap<String, List<SysExamtemplateQuestion>>();
	
	private static Map<String,SysExamtemplate> sysExamtemplateMap  =new ConcurrentHashMap<String, SysExamtemplate>();*/
	@Override
	public SysSystemParam getSystemParam(String paramCode) throws Exception {
		try {
			if(systemParamMap.get(paramCode)==null){
				SysSystemParamExample example = new SysSystemParamExample();
				example.or().andSysParamCodeEqualTo(paramCode);
				sysSystemParamMapper.selectByExample(example);
				systemParamMap.put(paramCode,sysSystemParamMapper.selectByExample(example).get(0));
			}
			return systemParamMap.get(paramCode);
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@Override
	public void setSystemParam() {
		SysSystemParamExample example = new SysSystemParamExample();
		sysSystemParamMapper.selectByExample(example);
		List<SysSystemParam> params = sysSystemParamMapper.selectByExample(example);
		for (SysSystemParam sysSystemParam : params) {
			systemParamMap.put(sysSystemParam.getSysParamCode(),sysSystemParam);
		}
	}
	
	@Override
	public List<SysFormGroup> querySysFormGroup(String formId, String groupId) {
		// TODO Auto-generated method stub
		
		SysFormGroupExample example = new SysFormGroupExample();
		SysFormGroupExample.Criteria criteria = example.createCriteria();
		if(formId!=null&&!formId.equals("null")){
			criteria.andGroupFormDefIdEqualTo(new BigDecimal(formId));
		}
		if(groupId!=null&&!groupId.equals("null")){
			criteria.andFormGroupIdEqualTo(new BigDecimal(groupId));
		}
		example.setOrderByClause("FORM_GROUP_SORT");
		List<SysFormGroup> list = mapper.selectByExample(example);
		return list;
	}

	@Override
	public SysFormColumn querySysFormColumnById(long columnId) {
		// TODO Auto-generated method stub
		SysFormColumn obj = sColumnMapper.selectByPrimaryKey(new BigDecimal(columnId));
		return obj;
	}
	
	/**
	 * 通过字典类编码存字典项缓存
	 */
	@Override
	public List<SysDictEntry> getDictEntrys(String dictTypeCode) throws Exception {
		
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] sysDictEntrysByte = jedis.get(("dict_"+dictTypeCode).getBytes());
		if(sysDictEntrysByte==null){
		// TODO Auto-generated method stub
			SysDictTypeExample example = new SysDictTypeExample();
			example.or().andDictTypeCodeEqualTo(dictTypeCode);
			List<SysDictType> sysDictTypes = sysDictTypeMapper.selectByExample(example);
			if (sysDictTypes.size()>0) {
				logger.info(dictTypeCode);
				SysDictType dictType = sysDictTypeMapper.selectByExample(example).get(0);
				SysDictEntryExample entryExample = new SysDictEntryExample();
				entryExample.or().andDictTypeIdEqualTo(dictType.getDictTypeId());
				entryExample.setOrderByClause("DICT_ENTRY_SORT");
				List<SysDictEntry> entrys = sysDictEntryMapper.selectByExample(entryExample);
				if(entrys.size()>0){
					jedis.set(("dict_"+dictTypeCode).getBytes(), SerializeUtil.serializeList(entrys));
				}
		    	return entrys;
			}else {
				return null;
			}
		}else {
			List<SysDictEntry> entrys =(List<SysDictEntry>) SerializeUtil.unserializeList(sysDictEntrysByte);
			return entrys;
		}
	}
	
	/**
	 * 通过字典类编码存字典项缓存
	 */
	@Override
	public void setDictEntrysByTypeCode(int dictTypeId) throws Exception {
		SysDictType dictType1 = sysDictTypeMapper.selectByPrimaryKey(dictTypeId);
		String dictTypeCode = dictType1.getDictTypeCode();
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] sysDictEntrysByte = jedis.get(("dict_"+dictTypeCode).getBytes());
		// TODO Auto-generated method stub
		SysDictTypeExample example = new SysDictTypeExample();
		example.or().andDictTypeCodeEqualTo(dictTypeCode);
		List<SysDictType> sysDictTypes = sysDictTypeMapper.selectByExample(example);
		if (sysDictTypes.size()>0) {
			logger.info(dictTypeCode);
			SysDictType dictType = sysDictTypeMapper.selectByExample(example).get(0);
			SysDictEntryExample entryExample = new SysDictEntryExample();
			entryExample.or().andDictTypeIdEqualTo(dictType.getDictTypeId());
			entryExample.setOrderByClause("DICT_ENTRY_SORT");
			List<SysDictEntry> entrys = sysDictEntryMapper.selectByExample(entryExample);
			if(entrys.size()>0){
				jedis.set(("dict_"+dictTypeCode).getBytes(), SerializeUtil.serializeList(entrys));
			}
		}
	}
	
	/**
	 * 通过字典类编码存字典项缓存
	 */
	@Override
	public void setDictEntrysByTypeCode(String dictTypeCode) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] sysDictEntrysByte = jedis.get(("dict_"+dictTypeCode).getBytes());
		// TODO Auto-generated method stub
		SysDictTypeExample example = new SysDictTypeExample();
		example.or().andDictTypeCodeEqualTo(dictTypeCode);
		List<SysDictType> sysDictTypes = sysDictTypeMapper.selectByExample(example);
		if (sysDictTypes.size()>0) {
			logger.info(dictTypeCode);
			SysDictType dictType = sysDictTypeMapper.selectByExample(example).get(0);
			SysDictEntryExample entryExample = new SysDictEntryExample();
			entryExample.or().andDictTypeIdEqualTo(dictType.getDictTypeId());
			entryExample.setOrderByClause("DICT_ENTRY_SORT");
			List<SysDictEntry> entrys = sysDictEntryMapper.selectByExample(entryExample);
			if(entrys.size()>0){
				jedis.set(("dict_"+dictTypeCode).getBytes(), SerializeUtil.serializeList(entrys));
			}
		}
	}
	
	/**
	 * 通过实体表名存实体字段缓存
	 */
	@Override
	public List<SysField> getSysFields(String entityCode) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] sysFieldsByte = jedis.get(("entity_"+entityCode).getBytes());
		if(sysFieldsByte==null){
		// TODO Auto-generated method stub
			SysEntityExample example = new SysEntityExample();
			example.or().andEntityCodeEqualTo(entityCode);
			List<SysEntity> sysEntitys = sysEntityMapper.selectByExample(example);
			if (sysEntitys.size()>0) {
				SysEntity sysEntity = sysEntitys.get(0);
				
				SysFieldExample fieldExample = new SysFieldExample();
				fieldExample.or().andFieldEntityIdEqualTo(new BigDecimal(sysEntity.getEntityId()));
				fieldExample.setOrderByClause("FIELD_SORT");
				List<SysField> fields = sysFieldMapper.selectByExample(fieldExample);
				
		    	jedis.set(("entity_"+entityCode).getBytes(), SerializeUtil.serializeList(fields));
		    	return fields;
			}else {
				return null;
			}
		}else {
			List<SysField> fields =(List<SysField>) SerializeUtil.unserializeList(sysFieldsByte);
			return fields;
		}
	}
	
	
	/**
	 * 通过角色ID存菜单缓存
	 */
	@Override
	public List<SysMenu> getSysMenus(BigDecimal roleId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] sysMenusByte = jedis.get(("menu_"+roleId).getBytes());
		if(sysMenusByte==null){
		// TODO Auto-generated method stub
			SysMenuRoleExample example = new SysMenuRoleExample();
			example.or().andRoleIdEqualTo(roleId);
			List<SysMenu> menus = sysMenuMapperExpand.queryMenusByRoleId(roleId+"");
			if (menus.size()>0) {
		    	jedis.set(("menu_"+roleId).getBytes(), SerializeUtil.serializeList(menus));
		    	return menus;
			}else {
				return null;
			}
		}else {
			List<SysMenu> menus =(List<SysMenu>) SerializeUtil.unserializeList(sysMenusByte);
			return menus;
		}
	}
	
	
	/**
	 * 通过角色ID存菜单缓存
	 */
	@Override
	public SysFormconfigCache getForm(String formId) throws Exception {
		try {
			if(formMap.get("formCacheInfo"+formId)==null){
				JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
		    	Jedis jedis = factory.getJedis();
		    	byte[] sysFormInfoByte = jedis.get(("formCacheInfo"+formId).getBytes());
				if(sysFormInfoByte==null){
					//先塞map缓存
					SysFormconfigCache formcache = new SysFormconfigCache(formId,this);
					formMap.put("formCacheInfo"+formId,formcache);
					//再塞redis缓存serialize
					jedis.set(("formCacheInfo"+formId).getBytes(), SerializeUtil.serialize(formcache));
				    return formcache;
				}else {
					SysFormconfigCache formcache =(SysFormconfigCache) SerializeUtil.unserialize(sysFormInfoByte);
					formMap.put("formCacheInfo"+formId,formcache);
					return formcache;
				}
			}else {
				SysFormconfigCache formcache = formMap.get("formCacheInfo"+formId);
				return formcache;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	/**
	 * 通过角色ID和字段ID取字典缓存
	 */
	@Override
	public JSONArray getGridDictDataByColumnId(String columnId,String userId) throws Exception {
		if(dictsGridMap.get(columnId)==null){
			// TODO Auto-generated method stub
			//SysFormconfigCache form = new SysFormconfigCache(formId,userId);
			SysFormComboboxExample example = new SysFormComboboxExample();
			example.or().andComboboxFormColumnIdEqualTo(new BigDecimal(columnId));
			SysFormCombobox sCombobox = sysFormComboboxMapper.selectByExample(example).get(0);
			SysExecSqlExample sqlExample = new SysExecSqlExample();
			sqlExample.or().andExecSqlRelaidEqualTo(sCombobox.getComboboxId().longValue());
			String sql = sysExecSqlMapper.selectByExample(sqlExample).get(0).getExecSql();
			String getFormSql = "select sys_formconfig.FORM_DEF_SOURCE from sys_formconfig left join  SYS_FORM_COLUMN on sys_formconfig.FORM_DEF_ID = SYS_FORM_COLUMN.FORM_COLUMN_FORM_DEF_ID where SYS_FORM_COLUMN.FORM_COLUMN_ID = "+sCombobox.getComboboxFormColumnId();
			Map form = (Map) MybatisUtil.queryList("runtime.selectSql", getFormSql).get(0);
			if (form.get("FORM_DEF_SOURCE")!=null&&form.get("FORM_DEF_SOURCE").equals("oracle1")) {
				CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_oracle);
			}
			List<Map> ids = MybatisUtil.queryList("runtime.selectSql", sql);
			CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_sqlserver);
			if (ids.size()>0) {
				StringBuffer sb = new StringBuffer("[");
				for (int i = 0; i < ids.size(); i++) {
					sb.append("{'value':'"+ids.get(i).get("DICTVALUE")+"','text':'"+ids.get(i).get("DICTENTRY")+"'},");
				}
				String str = sb.toString();
				String str1 = str.substring(0, str.length()-1);
				str1+="]";
				logger.info(str1);
				JSONArray list2 = JSONArray.fromObject(str1);
				dictsGridMap.put(columnId,list2);
			}else { 
				dictsGridMap.put(columnId,null);
			}
		}else {
			return dictsGridMap.get(columnId);
		}
		return dictsGridMap.get(columnId);
	}
	
	
	/**
	 * 通过角色ID和字段ID载入字典缓存
	 */
	@Override
	public void setCardDictDataByColumnId(String columnId,String userId) throws Exception {
		SysFormComboboxExample example = new SysFormComboboxExample();
		example.or().andComboboxFormColumnIdEqualTo(new BigDecimal(columnId));
		SysFormCombobox sCombobox = sysFormComboboxMapper.selectByExample(example).get(0);
		if (sCombobox.getComboboxGuiInitType()!=null&&sCombobox.getComboboxGuiInitType().equals("dict")) {
			SysDictTypeExample dictTypeExample = new SysDictTypeExample();
			dictTypeExample.or().andDictTypeCodeEqualTo(sCombobox.getComboboxGuiInitValue());
			List<SysDictType> types = sysDictTypeMapper.selectByExample(dictTypeExample);
			if (types.size()>0) {
				SysDictEntryExample dictEntryExample = new SysDictEntryExample();
				dictEntryExample.or().andDictTypeIdEqualTo(types.get(0).getDictTypeId());
				dictEntryExample.setOrderByClause("DICT_ENTRY_SORT");
				List<SysDictEntry> entries = sysDictEntryMapper.selectByExample(dictEntryExample);
				List<DictData> rs = new ArrayList<DictData>();
				for (SysDictEntry sysDictEntry : entries) {
					DictData data = new DictData();
					data.setName(sysDictEntry.getDictEntryName());
					data.setCode(sysDictEntry.getDictEntryCode());
					rs.add(data);
				}
				dictsCardMap.put("columnId_"+columnId,rs);
			}
		} else if (sCombobox.getComboboxGuiInitType()!=null&&sCombobox.getComboboxGuiInitType().equals("sql")) {
			SysExecSql execSql = sysExecSqlMapper.selectByPrimaryKey(sCombobox.getComboboxGuiInitExcsqlId());
			String sql = execSql.getExecSql();
			List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql);
			List<DictData> datas = new ArrayList<DictData>();
			for (Map map : rs) {
				DictData data = new DictData();
				data.setName(map.get("DICTENTRY")+"");
				data.setCode(map.get("DICTVALUE")+"");
				datas.add(data);
			}
			dictsCardMap.put("columnId_"+columnId,datas);
		}
	}
	
	/**
	 * 通过角色ID和字段ID取字典缓存
	 */
	@Override
	public List<DictData> getCardDictDataByColumnId(String columnId,String userId) throws Exception {
		if(dictsCardMap.get("columnId_"+columnId)==null){
			//SysFormconfigCache form = new SysFormconfigCache(formId,userId);
			SysFormComboboxExample example = new SysFormComboboxExample();
			example.or().andComboboxFormColumnIdEqualTo(new BigDecimal(columnId));
			SysFormCombobox sCombobox = sysFormComboboxMapper.selectByExample(example).get(0);
			if (sCombobox.getComboboxGuiInitType()!=null&&sCombobox.getComboboxGuiInitType().equals("dict")) {
				SysDictTypeExample dictTypeExample = new SysDictTypeExample();
				dictTypeExample.or().andDictTypeCodeEqualTo(sCombobox.getComboboxGuiInitValue());
				SysDictEntryExample dictEntryExample = new SysDictEntryExample();
				dictEntryExample.or().andDictTypeIdEqualTo(sysDictTypeMapper.selectByExample(dictTypeExample).get(0).getDictTypeId());
				List<SysDictEntry> entries = sysDictEntryMapper.selectByExample(dictEntryExample);
				List<DictData> rs = new ArrayList<DictData>();
				for (SysDictEntry sysDictEntry : entries) {
					DictData data = new DictData();
					data.setName(sysDictEntry.getDictEntryName());
					data.setCode(sysDictEntry.getDictEntryCode());
					rs.add(data);
				}
				dictsCardMap.put("columnId_"+columnId,rs);
			} else if (sCombobox.getComboboxGuiInitType()!=null&&sCombobox.getComboboxGuiInitType().equals("sql")) {
				SysExecSql execSql = sysExecSqlMapper.selectByPrimaryKey(sCombobox.getComboboxGuiInitExcsqlId());
				String sql = execSql.getExecSql();
				List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql);
				List<DictData> datas = new ArrayList<DictData>();
				for (Map map : rs) {
					DictData data = new DictData();
					data.setName(map.get("DICTENTRY")+"");
					data.setCode(map.get("DICTVALUE")+"");
					datas.add(data);
				}
				dictsCardMap.put("columnId_"+columnId,datas);
			}
		}else {
			return dictsCardMap.get("columnId_"+columnId);
		}
		return dictsCardMap.get("columnId_"+columnId);
	}
	
	/**
	 * 通过字典ID取字典缓存
	 */
	@Override
	public List<DictData> getCardDictDataByDictTypeId(int dictTypeId,String type) throws Exception {
		if(dictsCardTypeMap.get("dictTypeId_"+dictTypeId)==null){
			SysDictType dictType = sysDictTypeMapper.selectByPrimaryKey(dictTypeId);
			if (type.equals("dict")) {
				SysDictEntryExample dictEntryExample = new SysDictEntryExample();
				dictEntryExample.or().andDictTypeIdEqualTo(dictTypeId);
				List<SysDictEntry> entries = sysDictEntryMapper.selectByExample(dictEntryExample);
				List<DictData> rs = new ArrayList<DictData>();
				for (SysDictEntry sysDictEntry : entries) {
					DictData data = new DictData();
					data.setName(sysDictEntry.getDictEntryName());
					data.setCode(sysDictEntry.getDictEntryCode());
					rs.add(data);
				}
				dictsCardTypeMap.put("dictTypeId_"+dictTypeId,rs);
			} else if(type.equals("sql")) {
				String sql = dictType.getDictTypeRemark();
				List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql);
				List<DictData> datas = new ArrayList<DictData>();
				for (Map map : rs) {
					DictData data = new DictData();
					data.setName(map.get("DICTENTRY")+"");
					data.setCode(map.get("DICTVALUE")+"");
					datas.add(data);
				}
				dictsCardTypeMap.put("dictTypeId_"+dictTypeId,datas);
			}
		}else {
			return dictsCardTypeMap.get("dictTypeId_"+dictTypeId);
		}
		return dictsCardTypeMap.get("dictTypeId_"+dictTypeId);
	}
	
	/**
	 * 重载字典缓存
	 */
	@Override
	public void setCardDictDataByDictTypeCode(String dictTypeCode,String type) throws Exception {
		SysDictTypeExample dictTypeExample = new SysDictTypeExample();
		dictTypeExample.or().andDictTypeCodeEqualTo(dictTypeCode);
		SysDictType dictType = sysDictTypeMapper.selectByExample(dictTypeExample).get(0);
		int dictTypeId = dictType.getDictTypeId();
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	Map nameMap = new HashMap(); 
		Map valueMap = new HashMap(); 
		if (type.equals("dict")) {
			SysDictEntryExample dictEntryExample = new SysDictEntryExample();
			dictEntryExample.or().andDictTypeIdEqualTo(dictTypeId);
			dictEntryExample.setOrderByClause("DICT_ENTRY_SORT");
			List<SysDictEntry> entries = sysDictEntryMapper.selectByExample(dictEntryExample);
			List<DictData> rs = new ArrayList<DictData>();
			for (SysDictEntry sysDictEntry : entries) {
				DictData data = new DictData();
				data.setName(sysDictEntry.getDictEntryName());
				data.setCode(sysDictEntry.getDictEntryCode());
				rs.add(data);
				nameMap.put(sysDictEntry.getDictEntryName(), sysDictEntry.getDictEntryCode());
				valueMap.put(sysDictEntry.getDictEntryCode(), sysDictEntry.getDictEntryName());
			}
	    	jedis.set(("dictTypeCode_"+dictTypeCode).getBytes(), SerializeUtil.serializeList(rs));
	    	jedis.set(("dictTypeCode_"+dictTypeCode+"ForNamemap").getBytes(), SerializeUtil.serialize(nameMap));//map格式缓存
	    	jedis.set(("dictTypeCode_"+dictTypeCode+"ForValuemap").getBytes(), SerializeUtil.serialize(valueMap));//map格式缓存
	    	dictValueMap.put(("dictTypeCode_"+dictTypeCode+"ForValuemap"),valueMap);
	    	dictNameMap.put(("dictTypeCode_"+dictTypeCode+"ForNamemap"),nameMap);
			dictsCardTypeMap.put("dictTypeCode_"+dictTypeCode,rs);
		} else if(type.equals("sql")) {
			String sql = dictType.getDictTypeRemark();
			List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql);
			List<DictData> datas = new ArrayList<DictData>();
			for (Map map : rs) {
				DictData data = new DictData();
				data.setName(map.get("DICTENTRY")+"");
				data.setCode(map.get("DICTVALUE")+"");
				datas.add(data);
				nameMap.put(map.get("DICTENTRY")+"",map.get("DICTVALUE")+"");
				valueMap.put(map.get("DICTVALUE")+"",map.get("DICTENTRY")+"");
			}
	    	jedis.set(("dictTypeCode_"+dictTypeCode).getBytes(), SerializeUtil.serializeList(datas));
	    	jedis.set(("dictTypeCode_"+dictTypeCode+"ForNamemap").getBytes(), SerializeUtil.serialize(nameMap));//map格式缓存
	    	jedis.set(("dictTypeCode_"+dictTypeCode+"ForValuemap").getBytes(), SerializeUtil.serialize(valueMap));//map格式缓存
	    	dictValueMap.put(("dictTypeCode_"+dictTypeCode+"ForValuemap"),valueMap);
	    	dictNameMap.put(("dictTypeCode_"+dictTypeCode+"ForNamemap"),nameMap);
			dictsCardTypeMap.put("dictTypeCode_"+dictTypeCode,datas);
		}
	}
	
	/**
	 * 通过编码获取字典值Map,根据值取中文名
	 */
	@Override
	public Map getDictNameMap(String dictTypeCode) {
		if(dictNameMap.get("dictTypeCode_"+dictTypeCode+"ForNamemap")!=null){
			return dictNameMap.get(("dictTypeCode_"+dictTypeCode+"ForNamemap"));
		}else {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis(); 
	    	byte[] dictMapByte = jedis.get(("dictTypeCode_"+dictTypeCode+"ForNamemap").getBytes());
	    	if (dictMapByte!=null) {
	    		Map map =(Map) SerializeUtil.unserialize(dictMapByte);
	    		dictNameMap.put(("dictTypeCode_"+dictTypeCode+"ForNamemap"),map);
	    		return map;
			}else {
				SysDictTypeExample dictTypeExample = new SysDictTypeExample();
				dictTypeExample.or().andDictTypeCodeEqualTo(dictTypeCode);
				if(sysDictTypeMapper.selectByExample(dictTypeExample).size()>0){
					Map nameMap = new HashMap(); 
					SysDictType dictType = sysDictTypeMapper.selectByExample(dictTypeExample).get(0);
					int dictTypeId = dictType.getDictTypeId();
					if (dictType.getDictTypeClass().equals("SQL")) {
						String sql = dictType.getDictTypeRemark();
						List<Map> rs = new ArrayList<Map>();
						try {
							rs = MybatisUtil.queryList("runtime.selectSql", sql);
							for (Map map : rs) {
								nameMap.put(map.get("DICTENTRY")+"",map.get("DICTVALUE")+"");
							}
					    	jedis.set(("dictTypeCode_"+dictTypeCode+"ForNamemap").getBytes(), SerializeUtil.serialize(nameMap));//map格式缓存
					    	dictNameMap.put(("dictTypeCode_"+dictTypeCode+"ForNamemap"),nameMap);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();logger.error(e.getMessage(),e);
							return null;
						}
					} else{
						SysDictEntryExample dictEntryExample = new SysDictEntryExample();
						dictEntryExample.or().andDictTypeIdEqualTo(dictTypeId);
						List<SysDictEntry> entries = sysDictEntryMapper.selectByExample(dictEntryExample);
						for (SysDictEntry sysDictEntry : entries) {
							nameMap.put(sysDictEntry.getDictEntryName(),sysDictEntry.getDictEntryCode());
						}
				    	jedis.set(("dictTypeCode_"+dictTypeCode+"ForNamemap").getBytes(), SerializeUtil.serialize(nameMap));//map格式缓存
				    	dictNameMap.put(("dictTypeCode_"+dictTypeCode+"ForNamemap"),nameMap);
					}
					return nameMap;
				}
				return null;
			}
		}
	}
	
	/**
	 * 通过编码获取字典名Map,根据中文名取值
	 */
	@Override
	public Map getDictValueMap(String dictTypeCode){
		if(dictValueMap.get("dictTypeCode_"+dictTypeCode+"ForValuemap")!=null){
			return dictValueMap.get(("dictTypeCode_"+dictTypeCode+"ForValuemap"));
		}else {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis(); 
	    	byte[] dictMapByte = jedis.get(("dictTypeCode_"+dictTypeCode+"ForValuemap").getBytes());
	    	if (dictMapByte!=null) {
	    		Map map =(Map) SerializeUtil.unserialize(dictMapByte);
	    		dictValueMap.put(("dictTypeCode_"+dictTypeCode+"ForValuemap"),map);
	    		return map;
			}else {
				SysDictTypeExample dictTypeExample = new SysDictTypeExample();
				dictTypeExample.or().andDictTypeCodeEqualTo(dictTypeCode);
				if(sysDictTypeMapper.selectByExample(dictTypeExample).size()>0){
					Map valueMap = new HashMap(); 
					SysDictType dictType = sysDictTypeMapper.selectByExample(dictTypeExample).get(0);
					int dictTypeId = dictType.getDictTypeId();
					if (dictType.getDictTypeClass().equals("SQL")) {
						String sql = dictType.getDictTypeRemark();
						List<Map> rs = new ArrayList<Map>();
						try {
							rs = MybatisUtil.queryList("runtime.selectSql", sql);
							for (Map map : rs) {
								valueMap.put(map.get("DICTVALUE")+"",map.get("DICTENTRY")+"");
							}
					    	jedis.set(("dictTypeCode_"+dictTypeCode+"ForValuemap").getBytes(), SerializeUtil.serialize(valueMap));//map格式缓存
					    	dictValueMap.put(("dictTypeCode_"+dictTypeCode+"ForValuemap"),valueMap);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();logger.error(e.getMessage(),e);
							return null;
						}
					} else{
						SysDictEntryExample dictEntryExample = new SysDictEntryExample();
						dictEntryExample.or().andDictTypeIdEqualTo(dictTypeId);
						List<SysDictEntry> entries = sysDictEntryMapper.selectByExample(dictEntryExample);
						for (SysDictEntry sysDictEntry : entries) {
							valueMap.put(sysDictEntry.getDictEntryCode(),sysDictEntry.getDictEntryName());
						}
				    	jedis.set(("dictTypeCode_"+dictTypeCode+"ForValuemap").getBytes(), SerializeUtil.serialize(valueMap));//map格式缓存
				    	dictValueMap.put(("dictTypeCode_"+dictTypeCode+"ForValuemap"),valueMap);
					}
					return valueMap;
				}
				return null;
			}
		}
	}
	
	/**
	 * 通过字典Code取字典缓存
	 */
	@Override
	public List<DictData> getCardDictDataByDictTypeCode(String dictTypeCode,String type) throws Exception {
		if(dictsCardTypeMap.get("dictTypeCode_"+dictTypeCode)==null){
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis(); 
	    	byte[] dictInfoByte = jedis.get(("dictTypeCode_"+dictTypeCode).getBytes());
	    	if (dictInfoByte!=null) {
	    		List<DictData> rs =(List<DictData>) SerializeUtil.unserializeList(dictInfoByte);
	    		dictsCardTypeMap.put("dictTypeCode_"+dictTypeCode,rs);
	    		return dictsCardTypeMap.get("dictTypeCode_"+dictTypeCode);
			}else {
				SysDictTypeExample dictTypeExample = new SysDictTypeExample();
				dictTypeExample.or().andDictTypeCodeEqualTo(dictTypeCode);
				if(sysDictTypeMapper.selectByExample(dictTypeExample).size()>0){
					SysDictType dictType = sysDictTypeMapper.selectByExample(dictTypeExample).get(0);
					int dictTypeId = dictType.getDictTypeId();
					if (type.equals("dict")) {
						SysDictEntryExample dictEntryExample = new SysDictEntryExample();
						dictEntryExample.or().andDictTypeIdEqualTo(dictTypeId);
						List<SysDictEntry> entries = sysDictEntryMapper.selectByExample(dictEntryExample);
						List<DictData> rs = new ArrayList<DictData>();
						for (SysDictEntry sysDictEntry : entries) {
							DictData data = new DictData();
							data.setName(sysDictEntry.getDictEntryName());
							data.setCode(sysDictEntry.getDictEntryCode());
							rs.add(data);
						}
						jedis.set(("dictTypeCode_"+dictTypeCode).getBytes(), SerializeUtil.serializeList(rs));
						dictsCardTypeMap.put("dictTypeCode_"+dictTypeCode,rs);
						return dictsCardTypeMap.get("dictTypeCode_"+dictTypeCode);
					} else if(type.equals("sql")) {
						String sql = dictType.getDictTypeRemark();
						List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql);
						if(rs.size()>0){
							List<DictData> datas = new ArrayList<DictData>();
							for (Map map : rs) {
								DictData data = new DictData();
								data.setName(map.get("DICTENTRY")+"");
								data.setCode(map.get("DICTVALUE")+"");
								datas.add(data);
							}
							jedis.set(("dictTypeCode_"+dictTypeCode).getBytes(), SerializeUtil.serializeList(datas));
							dictsCardTypeMap.put("dictTypeCode_"+dictTypeCode,datas);
							return dictsCardTypeMap.get("dictTypeCode_"+dictTypeCode);
						}else {
							return null;
						}
					}
				}else {
					logger.info(dictTypeCode);
				}
			}
		}else {
			return dictsCardTypeMap.get("dictTypeCode_"+dictTypeCode);
		}
		return null;
	}
	
	/**
	 * 加载字典缓存
	 */
	@Override
	public void setCardDictDataByDictTypeId(int dictTypeId) throws Exception {
		SysDictEntryExample dictEntryExample = new SysDictEntryExample();
		dictEntryExample.or().andDictTypeIdEqualTo(dictTypeId);
		List<SysDictEntry> entries = sysDictEntryMapper.selectByExample(dictEntryExample);
		List<DictData> rs = new ArrayList<DictData>();
		for (SysDictEntry sysDictEntry : entries) {
			DictData data = new DictData();
			data.setName(sysDictEntry.getDictEntryName());
			data.setCode(sysDictEntry.getDictEntryCode());
			rs.add(data);
		}
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	jedis.set(("dictTypeId_"+dictTypeId).getBytes(), SerializeUtil.serializeList(rs));
		dictsCardTypeMap.put("dictTypeId_"+dictTypeId,rs);
	}
	/**
	 * 加载sql字典缓存
	 */
	@Override
	public void setCardDictSqlDataByDictTypeId(int dictTypeId) throws Exception {
		SysDictType dictType = sysDictTypeMapper.selectByPrimaryKey(dictTypeId);
		String sql = dictType.getDictTypeRemark();
		List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql);
		List<DictData> datas = new ArrayList<DictData>();
		for (Map map : rs) {
			DictData data = new DictData();
			data.setName(map.get("DICTENTRY")+"");
			data.setCode(map.get("DICTVALUE")+"");
			datas.add(data);
		}
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	jedis.set(("dictTypeId_"+dictTypeId).getBytes(), SerializeUtil.serializeList(rs));
		dictsCardTypeMap.put("dictTypeId_"+dictTypeId,datas);
	}
	
	
	/*
	 * 根据表单ID和用户ID获取字段信息
	 */
	@Override
	public List<SysFormColumn> getFormColumnByUserid(String formId,String userId) throws Exception {
		String formUserId = formId+"_"+userId;
		if(columnFormByUseridMap.get("formUserId_"+formUserId)==null){
			List<SysFormColumn> columns = sysFormColumnExpandMapper.queryColumnsByFormIdAndUserIdAll(formId,userId);
			columnFormByUseridMap.put("formUserId_"+formUserId, columns);
		}else{
		  return columnFormByUseridMap.get("formUserId_"+formUserId);
		}
		return columnFormByUseridMap.get("formUserId_"+formUserId);
	}
	/*
	 * 根据表单ID和用户ID塞字段信息
	 */
	@Override
	public void setFormColumnByUserid(String formId,String userId) throws Exception {
		String formUserId = formId+"_"+userId;
			List<SysFormColumn> columns = sysFormColumnExpandMapper.queryColumnsByFormIdAndUserIdAll(formId,userId);
			columnFormByUseridMap.put("formUserId_"+formUserId, columns);
	}
	
	/*
	 * 根据表单ID获取字段权限信息columnWithFieldRuleMap
	 */
	@Override
	public List<Map> getColumnWithFieldRuleByFormId(String formId) throws Exception {
		String sql = "select * from SYS_FORM_COLUMN " +
					" left join SYS_FIELD on SYS_FORM_COLUMN.FORM_COLUMN_COLUMN_ID = SYS_FIELD.FIELD_ID "+
					" where FORM_COLUMN_FORM_DEF_ID = " + formId +
					" and FIELD_RULE_ID is not null";
		List<Map> objs = MybatisUtil.queryList("runtime.selectSql", sql);
		for (int i = 0; i < objs.size(); i++) {
			Map obj = objs.get(i);
			String fieldRuleId = obj.get("FIELD_RULE_ID")+"";
			SysFieldRule fieldRule = sysFieldRuleMapper.selectByPrimaryKey(Long.parseLong(fieldRuleId));
			String fieldRuleMax = obj.get("FIELD_RULE_MAX")+"";
			String fieldRulePrefix = fieldRule.getFieldRulePrefix();
			String fieldRuleDigit = fieldRule.getFieldRuleDigit();
			String fieldEntityTablename =  obj.get("FORM_ENTITY_TABLENAME")+"";
			String fieldTablename =  obj.get("FIELD_TABLENAME")+"";
			String formColumnFormDefId =  obj.get("FORM_COLUMN_FORM_DEF_ID")+"";
			
			if (fieldRuleMax==null||fieldRuleMax.equals("")||fieldRuleMax.equals("null")) {
				String a = getSting(Integer.parseInt(fieldRuleDigit)-1);
				String value = fieldRulePrefix+a+1;
				obj.put("fieldRuleJspId",fieldEntityTablename+"."+fieldTablename.toUpperCase()+"_"+formColumnFormDefId);
				obj.put("fieldRuleValue",value);
			}else{
				String fieldRuleRaise = fieldRule.getFieldRuleRaise();
				String b = Integer.parseInt(fieldRuleMax)+Integer.parseInt(fieldRuleRaise)+"";
				String a = getSting(Integer.parseInt(fieldRuleDigit)-b.length());
				String value = fieldRulePrefix+a+b;
				obj.put("fieldRuleJspId",fieldEntityTablename+"."+fieldTablename.toUpperCase()+"_"+formColumnFormDefId);
				obj.put("fieldRuleValue",value);
			}
		}
			
		return objs;
		
	}
	public String getSting(int num) {
		String str = "";
		for (int i = 0; i < num; i++) {
			str+="0";
		}
		return str;
	}
	/**
	 * 通过表单ID存字段缓存
	 * 重新加载表单缓存
	 */
	@Override
	public void setForm(String formId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	SysFormconfigCache formcache = new SysFormconfigCache(formId,this);
    	jedis.set(("formCacheInfo"+formId).getBytes(), SerializeUtil.serialize(formcache));
		formMap.put("formCacheInfo"+formId,formcache);//formCacheInfo
	}
	
	/**
	 * 刷新表单字段缓存
	 */
	@Override
	public void setColumn(String columnId) throws Exception {
		SysFormColumn formColumn = sysFormColumnMapper.selectByPrimaryKey(new BigDecimal(columnId));
		//columnMap.put(columnId,formColumn);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	jedis.set(("column"+columnId).getBytes(), SerializeUtil.serialize(formColumn));
	}
	
	/**
	 * 刷新表单按钮缓存
	 */
	@Override
	public void setButton(String buttonId) throws Exception {
		SysFormButton formButton = sysFormButtonMapper.selectByPrimaryKey(new BigDecimal(buttonId));
		//buttonMap.put(buttonId,formButton);
		JedisFactory factory = new  JedisFactory(new JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	jedis.set(("button"+buttonId).getBytes(), SerializeUtil.serialize(formButton));
	}
	/**
	 * 重新加载通过表单ID存字段缓存
	 */
	@Override
	public void setFormColumns(String formId) throws Exception {
		// TODO Auto-generated method stub
			logger.info(formId);
			SysFormColumnExample example = new SysFormColumnExample();
			example.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formId));
			example.setOrderByClause("FORM_COLUMN_POSITION_SORT");
			example.setOrderByClause("FORM_COLUMN_SORT");
			List<SysFormColumn> formColumns = sysFormColumnMapper.selectByExample(example);
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis(); 
			if(formColumns.size()>0){
		    	jedis.set(("column_"+formId).getBytes(), SerializeUtil.serializeList(formColumns));
			}else {
				jedis.del(("column_"+formId).getBytes());
			}
	}
	
	
	/**
	 * 通过表单ID存字段缓存
	 */
	@Override
	public void setFormInfos(List<SysFormconfigWithBLOBs> forms) throws Exception {
		for (int i = 0; i < forms.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis(); 
	    	jedis.set(("formInfo"+forms.get(i).getFormDefId()).getBytes(), SerializeUtil.serialize(forms.get(i)));
		}
	}
	
	/**
	 * 通过表单ID存菜单缓存
	 */
	@Override
	public SysFormconfigWithBLOBs getFormInfo(String formId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
		SysFormconfigWithBLOBs form = sysFormconfigMapper.selectByPrimaryKey(new BigDecimal(formId));
		if (form!=null) {
	    	jedis.set(("formInfo"+formId).getBytes(), SerializeUtil.serialize(form));
	    	return form;
		}else {
			return null;
		}
	}
	
	/**
	 * 通过表单ID存数据库
	 * author wz
	 */
	@Override
	public SysFormconfigWithBLOBs getFormInfoReal(String formId) throws Exception {
		SysFormconfigExample example = new  SysFormconfigExample();
		example.or().andFormDefIdEqualTo(new BigDecimal(formId));
		List<SysFormconfig> sysformconfig = sysFormconfigMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
		return null;
	}
	
	/**
	 * 通过EMPID存照片缓存
	 */
	@Override
	public C11 getEmpPhotoInfo(String empId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] photoInfoByte = jedis.get(("Emp_Photo"+empId).getBytes());
		if(photoInfoByte==null){
		// TODO Auto-generated method stub
			C11Example example = new C11Example();
			example.or().andA0188EqualTo(Integer.valueOf(empId));
			List<C11> c11s = cMapper.selectByExampleWithBLOBs(example);
			if (c11s.size()>0) {
		    	jedis.set(("Emp_Photo"+empId).getBytes(), SerializeUtil.serialize(c11s.get(0)));
		    	return c11s.get(0);
			}else {
				return null;
			}
		}else {
			C11 c11 =(C11) SerializeUtil.unserialize(photoInfoByte);
			return c11;
		}
	}
	/**
	 * 通过EMPID存照片缓存
	 */
	@Override
	public void setEmpPhotoInfo(String empId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
		C11Example example = new C11Example();
		example.or().andA0188EqualTo(Integer.valueOf(empId));
		List<C11> c11s = cMapper.selectByExampleWithBLOBs(example);
		if (c11s.size()>0) {
	    	jedis.set(("Emp_Photo"+empId).getBytes(), SerializeUtil.serialize(c11s.get(0)));
		}
	}
	
	@Override
	public List<SysFormColumn> getFormColumns(String formId) throws Exception {
		SysFormColumnExample example = new SysFormColumnExample();
		example.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formId));
		example.setOrderByClause("FORM_COLUMN_SORT");
		List<SysFormColumn> formColumns = sysFormColumnMapper.selectByExample(example);
		if (formColumns.size()>0) {
	    	return formColumns;
		}else {
			return null;
		}
	}
	
	@Override
	public List<SysFormColumn> getAppFormColumns(String formId) throws Exception {
		SysFormColumnExample example = new SysFormColumnExample();
		example.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formId));
		example.setOrderByClause("FORM_COLUMN_POSITION_SORT");
		List<SysFormColumn> formColumns = sysFormColumnMapper.selectByExample(example);
		if (formColumns.size()>0) {
	    	return formColumns;
		}else {
			return null;
		}
	}
	
	@Override
	public List<SysFormColumn> getFormColumnsByGroupId(String formId,String groupId) throws Exception {
		SysFormColumnExample example = new SysFormColumnExample();
		example.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formId)).andFormColumnGroupIdEqualTo(groupId);
		example.setOrderByClause("FORM_COLUMN_SORT");
		List<SysFormColumn> formColumns = sysFormColumnMapper.selectByExample(example);
		if (formColumns.size()>0) {
	    	return formColumns;
		}else {
			return null;
		}
	}
	
	@Override
	public List<SysFormColumn> getFormColumnsNoGroup(String formId) throws Exception {
		SysFormColumnExample example = new SysFormColumnExample();
		example.or().andFormColumnFormDefIdEqualTo(new BigDecimal(formId)).andFormColumnGroupIdIsNull();
		example.setOrderByClause("FORM_COLUMN_POSITION_SORT");
		example.setOrderByClause("FORM_COLUMN_SORT");
		List<SysFormColumn> formColumns = sysFormColumnMapper.selectByExample(example);
		if (formColumns.size()>0) {
	    	return formColumns;
		}else {
			return null;
		}
	}
	
	
	/**
	 * 存入所有字段缓存
	 */
	@Override
	public void setFormColumns(List<SysFormColumn> columns) throws Exception {
		for (int i = 0; i < columns.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("column_"+columns.get(i).getFormColumnId()).getBytes(), SerializeUtil.serialize(columns.get(i)));
		}
	}
	
	/**
	 * 通过字段ID存字段缓存
	 */
	@Override
	public SysFormColumn getFormColumn(String columnId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] columnInfoByte = jedis.get(("columnInfo"+columnId).getBytes());
    	if (columnInfoByte!=null) {
    		SysFormColumn columnInfo =(SysFormColumn) SerializeUtil.unserialize(columnInfoByte);
    		return columnInfo;
		}else {
			SysFormColumnExample example = new SysFormColumnExample();
			example.or().andFormColumnIdEqualTo(new BigDecimal(columnId));
			SysFormColumn formColumn = sysFormColumnMapper.selectByExample(example).get(0);
	    	jedis.set(("columnInfo"+columnId).getBytes(), SerializeUtil.serialize(formColumn));
	    	return formColumn;
		}
	}
	
	/**
	 * 通过字段ID获取数据库数据
	 */
	@Override
	public SysFormColumn getFormColumnReal(String columnId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysFormColumnExample example = new SysFormColumnExample();
		example.or().andFormColumnIdEqualTo(new BigDecimal(columnId));
		if(sysFormColumnMapper.selectByExample(example).size()>0){
			jedis.set(("columnInfo"+columnId).getBytes(), SerializeUtil.serialize(sysFormColumnMapper.selectByExample(example).get(0)));
	    	return sysFormColumnMapper.selectByExample(example).get(0);
		}else{
			return null;
		}
	}
	
	/**
	 * 通过字段ID存字段缓存
	 */
	@Override
	public Map getEntityColumnByColumnId(String columnId){
//		if(entityMap.get(columnId)==null){
//		// TODO Auto-generated method stub
//			if (!columnId.equals("null")) {
//				logger.info(columnId);
//				Map map = new HashMap();
//				map.put("fieldId", columnId);
//				Map obj = sysFormColumnExpandMapper.queryEntityColumnByColumnId(map);
//				if (obj!=null) {
//					entityMap.put(columnId,obj);
//				}
//			}
//		}else {
//			return entityMap.get(columnId);
//		}
//		
//		return entityMap.get(columnId);
//		Map map = new HashMap();
//		map.put("fieldId", columnId);
//		Map obj = sysFormColumnExpandMapper.queryEntityColumnByColumnId(map);
		String sql = "SELECT "+
				 "	T1.FIELD_ID            \"fieldId\","+
				 "	T1.FIELD_CODE          \"fieldCode\","+
				 "	T1.FIELD_ENTITY_ID     \"fieldEntityId\","+
				 "	T1.FIELD_TABLENAME     \"fieldTablename\","+
				 "	T1.FIELD_CHINA_NAME    \"fieldChinaName\","+
				 "	T1.FIELD_IS_NULL       \"fieldIsNull\","+
				 "	T1.FIELD_IS_KEY        \"fieldIsKey\","+
				 "	T1.FIELD_TYPE          \"fieldType\","+
				 "	T1.FIELD_LEN           \"fieldLen\","+
				 "	T1.FIELD_DICT          \"fieldDict\","+
				 "	T1.FIELD_SORT          \"fieldSort\","+
				 "	T1.FIELD_STATE         \"fieldState\","+
				 "	T1.FIELD_IS_MARK       \"fieldIsMark\","+
				 "	T1.OPERATOR_NAME       \"operatorName\","+
				 "	T1.OPERATOR_TIME       \"operatorTime\","+
				 "	T1.APPROVE_NAME        \"approveName\","+
				 "	T1.APPROVE_TIME        \"approveTime\","+
				 "	T1.DELETE_MARK         \"deleteMark\","+
				 "	T1.DELETE_MARK_BACK    \"deleteMarkBack\","+
				 "	T1.FIELD_DATA_TYPE     \"fieldDataType\","+
				 "	T1.FIELD_IS_LOG      	\"fieldIsLog\","+
				 "	T1.FIELD_IS_BUS_KEY  	\"fieldIsBusKey\","+
				 "	T2.ENTITY_CODE \"entityCode\", T2.ENTITY_TABLENAME \"entityTableName\", T2.ENTITY_CHINANAME \"entityChinaname\""+
				 "	FROM SYS_FIELD T1 JOIN SYS_ENTITY T2 ON T1.FIELD_ENTITY_ID = T2.ENTITY_ID WHERE T2.DELETE_MARK = 'N' and t1.FIELD_ID = "+columnId;
		Map map = new HashMap();
		try {
			map = MybatisUtil.queryOne("runtime.selectSql", sql);
			return map;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
			return null;
		}
		
	}
	
	/**
	 * 通过表单ID存按钮缓存
	 */
	@Override
	public List<SysFormButton> getFormButtons(BigDecimal formId,String userId) throws Exception {
//		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
//    	Jedis jedis = factory.getJedis();
//    	byte[] sysFormButtonByte = jedis.get(("formButton_"+formId).getBytes());
//		if(sysFormButtonByte==null){
//		// TODO Auto-generated method stub
//			SysFormButtonExample example = new SysFormButtonExample();
//			example.or().andFormButtonFormDefIdEqualTo(formId);
//			example.setOrderByClause("FORM_BUTTON_SORT");
//			List<SysFormButton> formButtons = sysFormButtonMapper.selectByExample(example);
//			if (formButtons.size()>0) {
//		    	jedis.set(("formButton_"+formId).getBytes(), SerializeUtil.serializeList(formButtons));
//		    	return formButtons;
//			}else {
//				return null;
//			}
//		}else {
//			List<SysFormButton> formButtons =(List<SysFormButton>) SerializeUtil.unserializeList(sysFormButtonByte);
//			return formButtons;
//		}
		SysFormButtonExample example = new SysFormButtonExample();
		example.or().andFormButtonFormDefIdEqualTo(formId);
		example.setOrderByClause("FORM_BUTTON_SORT");
		List<SysFormButton> formButtons = sysFormButtonMapper.selectByExample(example);
		if (formButtons.size()>0) {
	    	return formButtons;
		}else {
			return null;
		}
	}
	
	/**
	 * 通过taskID刷新通过人员名单
	 */
	@Override
	public void setApproveId(String task,String userIds) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	if (userIds.length()>0) {
	    	jedis.set(("approveUser_"+task).getBytes(), SerializeUtil.serialize(userIds));
    	}else {
    		jedis.del(("approveUser_"+task).getBytes());
		}
	}
	/**
	 * 通过taskID获取通过人员名单
	 */
	@Override
	public String getApproveId(String task) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] userInfoByte = jedis.get(("approveUser_"+task).getBytes());
    	if (userInfoByte!=null) {
    		String userInfo = (String) SerializeUtil.unserialize(userInfoByte);
    		return userInfo;
    	}else {
			return "";
		}
	}
	
	/*
	 * 根据userId获取用户信息
	 */
	@Override
	public SysUser getUserByUserid(String userId) throws Exception {
		if(userMap.get("NowUser_"+userId)==null){
			SysUser user = userMapper.selectByPrimaryKey(Integer.valueOf(userId));
			userMap.put("NowUser_"+userId,user);
		}else{
		  return userMap.get("NowUser_"+userId);
		}
		return userMap.get("NowUser_"+userId);
	}
	/*
	 * 根据手机号获取用户信息
	 */
	@Override
	public SysUser getUserByMobile(String userMobile) {
		// TODO Auto-generated method stub
		SysUserExample example = new SysUserExample();
		example.or().andUserTalephoneEqualTo(userMobile);
		List<SysUser> users = userMapper.selectByExample(example);
		if (users.size()>0) {
			return users.get(0);
		} else {
			return null;
		}
	}
	/*
	 *  根据userId重载用户信息缓存
	 */
	@Override
	public void setUserByUserid(String userId) throws Exception {
		SysUser user = userMapper.selectByPrimaryKey(Integer.valueOf(userId));
		userMap.put("NowUser_"+userId,user);
	}
	
	
	
	/**
	 * 通过actmodelKey获取模板信息
	 */
	@Override
	public ActReModel getActModelByKey(String modelKey) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] actModelInfoByte = jedis.get(("ActModel_"+modelKey).getBytes());
    	if (actModelInfoByte==null) {
        	ActReModelExample actReModelExample = new ActReModelExample();
    		actReModelExample.or().andKeyEqualTo(modelKey);
    		List<ActReModel> actReModel = actReModelMapper.selectByExample(actReModelExample);
        	if (actReModel.size()>0) {
    	    	jedis.set(("ActModel_"+modelKey).getBytes(), SerializeUtil.serialize(actReModel.get(0)));
    	    	actModelInfoByte = jedis.get(("ActModel_"+modelKey).getBytes());
        	}else {
        		jedis.del(("ActModel_"+modelKey).getBytes());
    		}
		}
    	return (ActReModel) SerializeUtil.unserialize(actModelInfoByte);
	}
	
	
	/**
	 * 通过actmodelKey刷新模板信息缓存
	 */
	@Override
	public void setNodeByModelId(String modelId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	ActNodePropertiesExpandExample example = new ActNodePropertiesExpandExample();//actNodePropertiesExpandMapper
    	example.or().andActModelIdEqualTo(modelId);
		List<ActNodePropertiesExpand> nodes = actNodePropertiesExpandMapper.selectByExample(example);
		Map map = new HashMap();
		for (ActNodePropertiesExpand actNodePropertiesExpand : nodes) {
			map.put(actNodePropertiesExpand.getActNodeName(), actNodePropertiesExpand);
		}
    	if (map.size()>0) {
	    	jedis.set(("NodeExpand_"+modelId).getBytes(), SerializeUtil.serialize(map));
    	}else {
    		jedis.del(("NodeExpand_"+modelId).getBytes());
		}
    	
		ActReModel actReModel = actReModelMapper.selectByPrimaryKey(modelId);
    	if (actReModel!=null) {
	    	jedis.set(("ActModel_"+actReModel.getKey()).getBytes(), SerializeUtil.serialize(actReModel));
    	}else {
    		jedis.del(("ActModel_"+actReModel.getKey()).getBytes());
		}
    	
    	ActReModelExample example2 = new ActReModelExample();
    	example2.or().andCategoryEqualTo(actReModel.getCategory());
    	List<ActReModel> models = actReModelMapper.selectByExample(example2);
    	if (models.size()>0) {
	    	jedis.set(("ActModels_"+actReModel.getCategory()).getBytes(), SerializeUtil.serializeList(models));
    	}else {
    		jedis.del(("ActModels_"+actReModel.getCategory()).getBytes());
		}
	}
	
	/**
	 * 通过userId刷新角色字段按钮权限
	 */
	@Override
	public void setButtonOrColumnByUserId(String formId,String userId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	List<SysFormColumn> columns = sysFormColumnExpandMapper.queryColumnsByFormIdAndUserId(formId,userId);
    	if (columns!=null&&columns.size()>0) {
	    	jedis.set(("ColumnPower_"+formId+"_"+userId).getBytes(), SerializeUtil.serializeList(columns));
    	}else {
    		jedis.del(("ColumnPower_"+formId+"_"+userId).getBytes());
		}
	}
	
	/**
	 * 通过userId获取角色字段按钮权限
	 */
	@Override
	public List<SysFormColumn> getColumnPowerById(String formId,String userId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] columnsInfoByte = jedis.get(("ColumnPower_"+formId+"_"+userId).getBytes());
    	if (columnsInfoByte==null) {
    		List<SysFormColumn> columns = sysFormColumnExpandMapper.queryColumnsByFormIdAndUserId(formId,userId);
        	if (columns!=null&&columns.size()>0) {
    	    	jedis.set(("ColumnPower_"+formId+"_"+userId).getBytes(), SerializeUtil.serializeList(columns));
        	}else {
        		jedis.del(("ColumnPower_"+formId+"_"+userId).getBytes());
    		}
        	return columns;
		}
    	return (List<SysFormColumn>) SerializeUtil.unserializeList(columnsInfoByte);
	}
	
	/**
	 * 通过businessId和modelKey存流程标题
	 */
	@Override
	public void setActTitle(String modelKeyAndBusinessId,String title) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
	    jedis.set(("actTitle_"+modelKeyAndBusinessId).getBytes(), SerializeUtil.serialize(title));
	}
	
	/**
	 * 通过userId获取roleIds
	 */
	@Override
	public String getRoleIdsbyUserId(String userId) throws Exception {
		/*JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] rolesInfoByte = jedis.get(("Roles_"+userId).getBytes());
    	if (rolesInfoByte==null) {
    		SysUserRoleExample example = new SysUserRoleExample();
    		example.or().andUserIdEqualTo(Integer.valueOf(userId));
    		List<SysUserRole> roles = sysUserRoleMapper.selectByExample(example);
        	if (roles.size()>0) {
        		String roleIds = "";
        		for (SysUserRole sysUserRole : roles) {
        			roleIds += sysUserRole.getRoleId()+",";
				}
    	    	jedis.set(("Roles_"+userId).getBytes(), SerializeUtil.serialize(roleIds));
    	    	rolesInfoByte = jedis.get(("Roles_"+userId).getBytes());
        	}else {
        		jedis.del(("Roles_"+userId).getBytes());
    		}
		}
    	return (String) SerializeUtil.unserialize(rolesInfoByte);*/
		SysUserRoleExample example = new SysUserRoleExample();
		example.or().andUserIdEqualTo(Integer.valueOf(userId));
		List<SysUserRole> roles = sysUserRoleMapper.selectByExample(example);
		String roleIds = "";
    	if (roles.size()>0) {
    		for (SysUserRole sysUserRole : roles) {
    			roleIds += sysUserRole.getRoleId()+",";
			}
    	}
		return roleIds;
	}
	/**
	 * 通过userId重载roleIds
	 */
	@Override
	public void setRoleIdsbyUserId(String userId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
		SysUserRoleExample example = new SysUserRoleExample();
		example.or().andUserIdEqualTo(Integer.valueOf(userId));
		List<SysUserRole> roles = sysUserRoleMapper.selectByExample(example);
    	if (roles.size()>0) {
    		String roleIds = "";
    		for (SysUserRole sysUserRole : roles) {
    			roleIds += sysUserRole.getRoleId()+",";
			}
	    	jedis.set(("Roles_"+userId).getBytes(), SerializeUtil.serialize(roleIds));
    	}else {
    		jedis.del(("Roles_"+userId).getBytes());
		}
	}
	
	/**
	 * 通过actmodelKey获取模板信息
	 */
	@Override
	public String getActTitle(String modelKey,String businessId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] titleInfoByte = jedis.get(("actTitle_"+modelKey+businessId).getBytes());
    	if (titleInfoByte==null) {
    		SysActTitleExample example = new SysActTitleExample();
    		example.or().andBusinessidEqualTo(Long.valueOf(businessId)).andModelKeyEqualTo(modelKey);
    		List<SysActTitle> actTitles = actTitleMapper.selectByExample(example);
        	if (actTitles.size()>0) {
    	    	jedis.set(("actTitle_"+modelKey+businessId).getBytes(), SerializeUtil.serialize(actTitles.get(0).getTitle()));
    	    	titleInfoByte = jedis.get(("actTitle_"+modelKey+businessId).getBytes());
        	}else {
        		jedis.del(("actTitle_"+modelKey+businessId).getBytes());
    		}
		}
    	return (String) SerializeUtil.unserialize(titleInfoByte);
	}
	
	/**
	 * 通过flowType获取模板信息
	 */
	@Override
	public List<ActReModel> getActModelsByCode(String code) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] actModelsInfoByte = jedis.get(("ActModels_"+code).getBytes());
    	if (actModelsInfoByte==null) {
    		ActReModelExample example2 = new ActReModelExample();
        	example2.or().andCategoryEqualTo(code);
        	List<ActReModel> models = actReModelMapper.selectByExample(example2);
        	jedis.set(("ActModels_"+code).getBytes(), SerializeUtil.serializeList(models));
        	if (models.size()>0) {
    	    	jedis.set(("ActModels_"+code).getBytes(), SerializeUtil.serializeList(models));
        	}else {
        		jedis.del(("ActModels_"+code).getBytes());
    		}
		}
    	return (List<ActReModel>) SerializeUtil.unserializeList(actModelsInfoByte);
	}
	
	/**
	 * 通过actmodelKey刷新模板信息缓存
	 */
	@Override
	public ActHiProcinst getActHiProcinstByPid(String pid) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
		byte[] actHiProcinstInfoByte = jedis.get(("ActHiProcinst_"+pid).getBytes());
    	if (actHiProcinstInfoByte==null) {
        	ActHiProcinstExample example = new ActHiProcinstExample();
        	example.or().andProcInstIdEqualTo(pid);
    		List<ActHiProcinst> list = actHiProcinstMapper.selectByExample(example);
        	if (list.size()>0) {
    	    	jedis.set(("ActHiProcinst_"+pid).getBytes(), SerializeUtil.serialize(list.get(0)));
    	    	actHiProcinstInfoByte = jedis.get(("ActHiProcinst_"+pid).getBytes());
        	}else {
        		jedis.del(("ActHiProcinst_"+pid).getBytes());
    		}
		}
    	return (ActHiProcinst) SerializeUtil.unserialize(actHiProcinstInfoByte);
	}
	
	/**
	 * 通过actmodelKey获取模板信息
	 */
	@Override
	public Map getNodeByModelId(String modelId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] nodeExpandInfoByte = jedis.get(("NodeExpand_"+modelId).getBytes());
    	if (nodeExpandInfoByte==null) {
    		ActNodePropertiesExpandExample example = new ActNodePropertiesExpandExample();//actNodePropertiesExpandMapper
        	example.or().andActModelIdEqualTo(modelId);
    		List<ActNodePropertiesExpand> nodes = actNodePropertiesExpandMapper.selectByExample(example);
    		Map map = new HashMap();
    		for (ActNodePropertiesExpand actNodePropertiesExpand : nodes) {
    			map.put(actNodePropertiesExpand.getActNodeName(), actNodePropertiesExpand);
    		}
        	if (map.size()>0) {
    	    	jedis.set(("NodeExpand_"+modelId).getBytes(), SerializeUtil.serialize(map));
    	    	nodeExpandInfoByte = jedis.get(("NodeExpand_"+modelId).getBytes());
        	}else {
        		jedis.del(("NodeExpand_"+modelId).getBytes());
    		}
		}
    	return (Map) SerializeUtil.unserialize(nodeExpandInfoByte);
	}
	
	/**
	 * 通过taskID刷新通过人员名单
	 */
	@Override
	public void setHtmlPicByMBId(String task,String htmlPic) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	if (htmlPic.length()>0) {
	    	jedis.set(("HtmlPic_"+task).getBytes(), SerializeUtil.serialize(htmlPic));
    	}else {
    		jedis.del(("HtmlPic_"+task).getBytes());
		}
	}
	/**
	 * 通过taskID获取通过人员名单
	 */
	@Override
	public String getHtmlPicByMBId(String task) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] userInfoByte = jedis.get(("HtmlPic_"+task).getBytes());
    	if (userInfoByte!=null) {
    		String userInfo = (String) SerializeUtil.unserialize(userInfoByte);
    		return userInfo;
    	}else {
    		ActShowHisExample example = new ActShowHisExample();
    		example.or().andMarkEqualTo(task);
    		if (actShowHisMapper.selectByExample(example).size()>0) {
    			ActShowHis showHis = actShowHisMapper.selectByExample(example).get(0);
    			jedis.set(("HtmlPic_"+task).getBytes(), SerializeUtil.serialize(showHis.getImg()));
    			return showHis.getImg();
    		} else {
    			return null;
    		}
		}
	}
	
	/**
	 * 通过表单ID刷新表单按钮缓存
	 */
	@Override
	public void setFormbuttons(String formId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	SysFormButtonExample example = new SysFormButtonExample();
		example.or().andFormButtonFormDefIdEqualTo(new BigDecimal(formId));
		example.setOrderByClause("FORM_BUTTON_SORT");
		List<SysFormButton> formButtons = sysFormButtonMapper.selectByExample(example);
		if (formButtons.size()>0) {
	    	jedis.set(("formButton_"+formId).getBytes(), SerializeUtil.serializeList(formButtons));
		}else {
			jedis.del(("formButton_"+formId).getBytes());
			logger.info("找不到表单ID为"+formId+"的按钮配置信息");
		}
	}
	
	/**
	 * 通过表单ID存按钮缓存
	 */
	@Override
	public List<SysExamtemplateQuestion> getExamtemplateQuestions(BigDecimal formId,String templateId,String userId) throws Exception {
		SysExamtemplateQuestionExample example = new SysExamtemplateQuestionExample();
		example.or().andTemplateidEqualTo(Integer.valueOf(templateId));
		example.setOrderByClause("xorder");
		List<SysExamtemplateQuestion> questions = sQuestionMapper.selectByExample(example);
		if (questions.size()>0) {
	    	return questions;
		}else {
			return null;
		}
	}
	
	/**
	 * 存入所有文本字段缓存
	 */
	@Override
	public void setTextboxs(List<SysFormTextbox> textboxs) throws Exception {
		for (int i = 0; i < textboxs.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("textboxInfo_"+textboxs.get(i).getTextboxFormColumnId()).getBytes(), SerializeUtil.serialize(textboxs.get(i)));
		}
	}
	
	/**
	 * 通过字段ID存文本字段缓存
	 */
	@Override
	public SysFormTextbox getTextbox(String columnId) {
		SysFormTextboxExample example = new SysFormTextboxExample();
		example.or().andTextboxFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormTextbox> textboxs = sysFormTextboxMapper.selectByExample(example);
		if (textboxs.size()>0) {
			return textboxs.get(0);
		}else {
			logger.info("找不到字段ID为"+columnId+"的文本控件信息");
			return null;
		}
	}
	
	
	/**
	 * 通过字段ID刷新文本字段缓存
	 */
	@Override
	public void setTextbox(String columnId) {
		SysFormTextboxExample example = new SysFormTextboxExample();
		example.or().andTextboxFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormTextbox> textboxs = sysFormTextboxMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (textboxs.size()>0) {
			jedis.set(("textboxInfo"+columnId).getBytes(), SerializeUtil.serialize(textboxs.get(0)));
		}else {
			jedis.del(("textboxInfo"+columnId).getBytes());
			logger.info("找不到字段ID为"+columnId+"的文本控件信息");
		}
	}
	
	/**
	 * 存入所有下拉字段缓存
	 */
	@Override
	public void setComboboxs(List<SysFormCombobox> comboboxs) throws Exception {
		for (int i = 0; i < comboboxs.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("comboboxInfo"+comboboxs.get(i).getComboboxFormColumnId()).getBytes(), SerializeUtil.serialize(comboboxs.get(i)));
		}
	}
	
	/**
	 * 通过字段ID存下拉字段缓存
	 */
	@Override
	public SysFormCombobox getCombobox(String columnId) {
		JedisFactory factory = new  JedisFactory(new JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		byte[] comboboxInfoByte = jedis.get(("comboboxInfo"+columnId).getBytes());
    	if (comboboxInfoByte!=null) {
    		SysFormCombobox comboboxs = (SysFormCombobox) SerializeUtil.unserialize(comboboxInfoByte);
    		return comboboxs;
		}else {
			SysFormComboboxExample example = new SysFormComboboxExample();
			example.or().andComboboxFormColumnIdEqualTo(new BigDecimal(columnId));
			List<SysFormCombobox> comboboxs = sysFormComboboxMapper.selectByExample(example);
			if (comboboxs.size()>0) {
				jedis.set(("comboboxInfo"+columnId).getBytes(), SerializeUtil.serialize(comboboxs.get(0)));
				return comboboxs.get(0);
			}else {
				logger.info("找不到字段ID为"+columnId+"的文本控件信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过字段ID刷新下拉字段缓存
	 */
	@Override
	public void setCombobox(String columnId) {
		SysFormComboboxExample example = new SysFormComboboxExample();
		example.or().andComboboxFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormCombobox> comboboxs = sysFormComboboxMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory(new JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (comboboxs.size()>0) {
			jedis.set(("comboboxInfo"+columnId).getBytes(), SerializeUtil.serialize(comboboxs.get(0)));
		}else {
			jedis.del(("comboboxInfo"+columnId).getBytes());
			logger.info("找不到字段ID为"+columnId+"的下拉控件信息");
		}
	}
	
	/**
	 * 存入所有单选多选字段缓存
	 */
	@Override
	public void setRadiobuttonlists(List<SysFormRadiobuttonlist> radiobuttonlists) throws Exception {
		for (int i = 0; i < radiobuttonlists.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("radiobuttonlistInfo_"+radiobuttonlists.get(i).getRadiolistFormColumnId()).getBytes(), SerializeUtil.serialize(radiobuttonlists.get(i)));
		}
	}
	
	/**
	 * 通过字段ID存多选单选字段缓存
	 */
	@Override
	public SysFormRadiobuttonlist getRadiobuttonlist(String columnId) {
//		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
//    	Jedis jedis = factory.getJedis(); 
//    	byte[] radiobuttonlistInfoByte = jedis.get(("radiobuttonlistInfo_"+columnId).getBytes());
//    	if (radiobuttonlistInfoByte!=null) {
//    		SysFormRadiobuttonlist radiobuttonlistInfo =(SysFormRadiobuttonlist) SerializeUtil.unserialize(radiobuttonlistInfoByte);
//    		return radiobuttonlistInfo;
//		}else {
//			SysFormRadiobuttonlistExample example = new SysFormRadiobuttonlistExample();
//			example.or().andRadiolistFormColumnIdEqualTo(new BigDecimal(columnId));
//			List<SysFormRadiobuttonlist> radiobuttonlists = sysFormRadiobuttonlistMapper.selectByExample(example);
//			if (radiobuttonlists.size()>0) {
//				jedis.set(("radiobuttonlistInfo_"+columnId).getBytes(), SerializeUtil.serialize(radiobuttonlists.get(0)));
//				return radiobuttonlists.get(0);
//			}else {
//				logger.info("找不到字段ID为"+columnId+"的文本控件信息");
//				return null;
//			}
//		}
		SysFormRadiobuttonlistExample example = new SysFormRadiobuttonlistExample();
		example.or().andRadiolistFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormRadiobuttonlist> radiobuttonlists = sysFormRadiobuttonlistMapper.selectByExample(example);
		if (radiobuttonlists.size()>0) {
			return radiobuttonlists.get(0);
		}else {
			logger.info("找不到字段ID为"+columnId+"的文本控件信息");
			return null;
		}
	}
	
	/**
	 * 通过字段ID刷新多选单选字段缓存
	 */
	@Override
	public void setRadiobuttonlist(String columnId) {
		SysFormRadiobuttonlistExample example = new SysFormRadiobuttonlistExample();
		example.or().andRadiolistFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormRadiobuttonlist> radiobuttonlists = sysFormRadiobuttonlistMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (radiobuttonlists.size()>0) {
			jedis.set(("radiobuttonlistInfo_"+columnId).getBytes(), SerializeUtil.serialize(radiobuttonlists.get(0)));
			//radiobuttonlistMap.put(columnId,radiobuttonlists.get(0));
		}else {
			jedis.del(("radiobuttonlistInfo_"+columnId).getBytes());
			logger.info("找不到字段ID为"+columnId+"的单选多选组控件信息");
		}
	}
	
	/**
	 * 存入所有日期字段缓存
	 */
	@Override
	public void setDatepickers(List<SysFormDatepicker> datepickers) throws Exception {
		for (int i = 0; i < datepickers.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("datepickerInfo_"+datepickers.get(i).getDatepickerFormColumnId()).getBytes(), SerializeUtil.serialize(datepickers.get(i)));
		}
	}
	
	/**
	 * 通过字段ID存日期字段缓存
	 */
	@Override
	public SysFormDatepicker getDatepicker(String columnId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] datepickerInfoByte = jedis.get(("datepickerInfo_"+columnId).getBytes());
    	if (datepickerInfoByte!=null) {
    		SysFormDatepicker datepickerInfo =(SysFormDatepicker) SerializeUtil.unserialize(datepickerInfoByte);
    		return datepickerInfo;
		}else {
			SysFormDatepickerExample example = new SysFormDatepickerExample();
			example.or().andDatepickerFormColumnIdEqualTo(new BigDecimal(columnId));
			List<SysFormDatepicker> datepickers = sysFormDatepickerMapper.selectByExample(example);
			if (datepickers.size()>0) {
				jedis.set(("datepickerInfo_"+columnId).getBytes(), SerializeUtil.serialize(datepickers.get(0)));
				return datepickers.get(0);
			}else {
				logger.info("找不到字段ID为"+columnId+"的文本控件信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过字段ID刷新日期字段缓存
	 */
	@Override
	public void setDatepicker(String columnId) {
		SysFormDatepickerExample example = new SysFormDatepickerExample();
		example.or().andDatepickerFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormDatepicker> datepickers = sysFormDatepickerMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (datepickers.size()>0) {
			jedis.set(("datepickerInfo_"+columnId).getBytes(), SerializeUtil.serialize(datepickers.get(0)));
			//datepickerMap.put(columnId,datepickers.get(0));
		}else {
			jedis.del(("datepickerInfo_"+columnId).getBytes());
			logger.info("找不到字段ID为"+columnId+"的日期控件信息");
		}
	}
	
	/**
	 * 存入所有下拉弹出字段缓存
	 */
	@Override
	public void setLookups(List<SysFormLookup> lookups) throws Exception {
		for (int i = 0; i < lookups.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("lookupInfo_"+lookups.get(i).getLookupFormColumnId()).getBytes(), SerializeUtil.serialize(lookups.get(i)));
		}
	}
	
	/**
	 * 通过字段ID存下拉弹出字段缓存
	 */
	@Override
	public SysFormLookup getLookup(String columnId) {

		SysFormLookupExample example = new SysFormLookupExample();
		example.or().andLookupFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormLookup> lookups = sysFormLookupMapper.selectByExample(example);
		if (lookups.size()>0) {
			return lookups.get(0);
		}else {
			logger.info("找不到字段ID为"+columnId+"的文本控件信息");
			return null;
		}
	}
	
	/**
	 * 通过字段ID刷新下拉弹出字段缓存
	 */
	@Override
	public void setLookup(String columnId) {
		SysFormLookupExample example = new SysFormLookupExample();
		example.or().andLookupFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormLookup> lookups = sysFormLookupMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (lookups.size()>0) {
			jedis.set(("lookupInfo_"+columnId).getBytes(), SerializeUtil.serialize(lookups.get(0)));
			//lookupMap.put(columnId,lookups.get(0));
		}else {
			jedis.del(("lookupInfo_"+columnId).getBytes());
			logger.info("找不到字段ID为"+columnId+"的下拉弹出控件信息");
		}
	}
	
	/**
	 * 存入所有富文本字段缓存
	 */
	@Override
	public void setRichtexts(List<SysFormRichtext> richtexts) throws Exception {
		for (int i = 0; i < richtexts.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("richtextInfo_"+richtexts.get(i).getRichtextFormColumnId()).getBytes(), SerializeUtil.serialize(richtexts.get(i)));
		}
	}
	
	/**
	 * 通过字段ID存富文本字段缓存
	 */
	@Override
	public SysFormRichtext getRichtext(String columnId) {

		SysFormRichtextExample example = new SysFormRichtextExample();
		example.or().andRichtextFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormRichtext> richtexts = sysFormRichtextMapper.selectByExample(example);
		if (richtexts.size()>0) {
			return richtexts.get(0);
		}else {
			logger.info("找不到字段ID为"+columnId+"的文本控件信息");
			return null;
		}
	}
	
	/**
	 * 通过字段ID刷新富文本字段缓存
	 */
	@Override
	public void setRichtext(String columnId) {
		SysFormRichtextExample example = new SysFormRichtextExample();
		example.or().andRichtextFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormRichtext> richtexts = sysFormRichtextMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (richtexts.size()>0) {
			jedis.set(("richtextInfo_"+columnId).getBytes(), SerializeUtil.serialize(richtexts.get(0)));
			//richtextMap.put(columnId,richtexts.get(0));
		}else {
			jedis.del(("richtextInfo_"+columnId).getBytes());
			logger.info("找不到字段ID为"+columnId+"的富文本控件信息");
		}
	}
	
	/**
	 * 存入所有附件字段缓存
	 */
	@Override
	public void setFileuploads(List<SysFormFileupload> fileuploads) throws Exception {
		for (int i = 0; i < fileuploads.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("fileuploadInfo_"+fileuploads.get(i).getFileuploadFormColumnId()).getBytes(), SerializeUtil.serialize(fileuploads.get(i)));
		}
	}
	
	/**
	 * 通过字段ID存取附件字段缓存
	 */
	@Override
	public SysFormFileupload getFileupload(String columnId) {

		SysFormFileuploadExample example = new SysFormFileuploadExample();
		example.or().andFileuploadFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormFileupload> fileuploads = sysFormFileuploadMapper.selectByExample(example);
		if (fileuploads.size()>0) {
			return fileuploads.get(0);
		}else {
			logger.info("找不到字段ID为"+columnId+"的文本控件信息");
			return null;
		}
	}
	
	/**
	 * 通过字段ID刷新附件字段缓存
	 */
	@Override
	public void setFileupload(String columnId) {
		SysFormFileuploadExample example = new SysFormFileuploadExample();
		example.or().andFileuploadFormColumnIdEqualTo(new BigDecimal(columnId));
		List<SysFormFileupload> fileuploads = sysFormFileuploadMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (fileuploads.size()>0) {
			jedis.set(("fileuploadInfo_"+columnId).getBytes(), SerializeUtil.serialize(fileuploads.get(0)));
		}else {
			jedis.del(("fileuploadInfo_"+columnId).getBytes());
			logger.info("找不到字段ID为"+columnId+"的附件上传控件信息");
		}
	}
	
	
	
	public void initAllDicts(){
		
	}

	@Override
	public void setButtonSaves(List<SysFormButtonSave> buttonSaves)
			throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < buttonSaves.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("buttonSaveInfo_"+buttonSaves.get(i).getButtonSaveButtonId()).getBytes(), SerializeUtil.serialize(buttonSaves.get(i)));
		}
	}

	@Override
	public SysFormButtonSave getButtonSave(String buttonId) {
		// TODO Auto-generated method stub
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] buttonSaveInfoByte = jedis.get(("buttonSaveInfo_"+buttonId).getBytes());
    	if (buttonSaveInfoByte!=null) {
    		SysFormButtonSave buttonSaveInfo =(SysFormButtonSave) SerializeUtil.unserialize(buttonSaveInfoByte);
    		return buttonSaveInfo;
		}else {
			SysFormButtonSaveExample example = new SysFormButtonSaveExample();
			example.or().andButtonSaveButtonIdEqualTo(new BigDecimal(buttonId));
			List<SysFormButtonSave> buttonSaves = sysFormButtonSaveMapper.selectByExample(example);
			if (buttonSaves.size()>0) {
				jedis.set(("buttonSaveInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonSaves.get(0)));
				return buttonSaves.get(0);
			}else {
				logger.info("找不到按钮ID为"+buttonId+"的保存按钮信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过按钮ID刷新保存按钮缓存
	 */
	@Override
	public void setButtonSave(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysFormButtonSaveExample example = new SysFormButtonSaveExample();
		example.or().andButtonSaveButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonSave> buttonSaves = sysFormButtonSaveMapper.selectByExample(example);
		if (buttonSaves.size()>0) {
			jedis.set(("buttonSaveInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonSaves.get(0)));
		}else {
			jedis.del(("buttonSaveInfo_"+buttonId).getBytes());
			logger.info("找不到按钮ID为"+buttonId+"的保存按钮信息");
		}
	}

	@Override
	public void setButtonAdds(List<SysFormButtonAdd> buttonAdds)
			throws Exception {
		for (int i = 0; i < buttonAdds.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("buttonAddInfo_"+buttonAdds.get(i).getButtonAddButtonId()).getBytes(), SerializeUtil.serialize(buttonAdds.get(i)));
		}
	}

	@Override
	public SysFormButtonAdd getButtonAdd(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] buttonAddInfoByte = jedis.get(("buttonAddInfo_"+buttonId).getBytes());
    	if (buttonAddInfoByte!=null) {
    		SysFormButtonAdd buttonAddInfo =(SysFormButtonAdd) SerializeUtil.unserialize(buttonAddInfoByte);
    		return buttonAddInfo;
		}else {
			SysFormButtonAddExample example = new SysFormButtonAddExample();
			example.or().andButtonAddButtonIdEqualTo(new BigDecimal(buttonId));
			List<SysFormButtonAdd> buttonAdds = sysFormButtonAddMapper.selectByExample(example);
			if (buttonAdds.size()>0) {
				jedis.set(("buttonAddInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonAdds.get(0)));
				return buttonAdds.get(0);
			}else {
				logger.info("找不到按钮ID为"+buttonId+"的新增按钮信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过按钮ID刷新新增按钮缓存
	 */
	@Override
	public void setButtonAdd(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysFormButtonAddExample example = new SysFormButtonAddExample();
		example.or().andButtonAddButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonAdd> buttonAdds = sysFormButtonAddMapper.selectByExample(example);
		if (buttonAdds.size()>0) {
			jedis.set(("buttonAddInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonAdds.get(0)));
		}else {
			jedis.del(("buttonAddInfo_"+buttonId).getBytes());
			logger.info("找不到按钮ID为"+buttonId+"的新增按钮信息");
		}
	}

	@Override
	public void setButtonRemoves(List<SysFormButtonRemove> buttonRemoves)
			throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < buttonRemoves.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("buttonRemoveInfo_"+buttonRemoves.get(i).getButtonRemoveButtonId()).getBytes(), SerializeUtil.serialize(buttonRemoves.get(i)));
		}
		
	}

	@Override
	public SysFormButtonRemove getButtonRemove(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] buttonRemoveInfoByte = jedis.get(("buttonRemoveInfo_"+buttonId).getBytes());
    	if (buttonRemoveInfoByte!=null) {
    		SysFormButtonRemove buttonRemoveInfo =(SysFormButtonRemove) SerializeUtil.unserialize(buttonRemoveInfoByte);
    		return buttonRemoveInfo;
		}else {
			SysFormButtonRemoveExample example = new SysFormButtonRemoveExample();
			example.or().andButtonRemoveButtonIdEqualTo(new BigDecimal(buttonId));
			List<SysFormButtonRemove> buttonRemoves = sysFormButtonRemoveMapper.selectByExample(example);
			if (buttonRemoves.size()>0) {
				jedis.set(("buttonRemoveInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonRemoves.get(0)));
				return buttonRemoves.get(0);
			}else {
				logger.info("找不到按钮ID为"+buttonId+"的新增按钮信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过按钮ID刷新删除按钮缓存
	 */
	@Override
	public void setButtonRemove(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysFormButtonRemoveExample example = new SysFormButtonRemoveExample();
		example.or().andButtonRemoveButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonRemove> buttonRemoves = sysFormButtonRemoveMapper.selectByExample(example);
		if (buttonRemoves.size()>0) {
			jedis.set(("buttonRemoveInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonRemoves.get(0)));
		}else {
			jedis.del(("buttonRemoveInfo_"+buttonId).getBytes());
			logger.info("找不到按钮ID为"+buttonId+"的新增按钮信息");
		}
	}

	@Override
	public void setButtonImports(List<SysFormButtonImport> buttonImports)
			throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < buttonImports.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("buttonImportInfo_"+buttonImports.get(i).getFormButtonId()).getBytes(), SerializeUtil.serialize(buttonImports.get(i)));
		}
	}

	@Override
	public SysFormButtonImport getButtonImport(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] buttonImportInfoByte = jedis.get(("buttonImportInfo_"+buttonId).getBytes());
    	if (buttonImportInfoByte!=null) {
    		SysFormButtonImport buttonImportInfo =(SysFormButtonImport) SerializeUtil.unserialize(buttonImportInfoByte);
    		return buttonImportInfo;
		}else {
			SysFormButtonImportExample example = new SysFormButtonImportExample();
			example.or().andFormButtonIdEqualTo(new BigDecimal(buttonId));
			List<SysFormButtonImport> buttonImports = sysFormButtonImportMapper.selectByExample(example);
			if (buttonImports.size()>0) {
				jedis.set(("buttonImportInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonImports.get(0)));
				return buttonImports.get(0);
			}else {
				logger.info("找不到按钮ID为"+buttonId+"的导入按钮信息");
				return null;
			}
		}
	}
	
	@Override
	public SysFormButtonExport getButtonExport(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] buttonExportInfoByte = jedis.get(("buttonExportInfo_"+buttonId).getBytes());
    	if (buttonExportInfoByte!=null) {
    		SysFormButtonExport buttonExportInfo =(SysFormButtonExport) SerializeUtil.unserialize(buttonExportInfoByte);
    		return buttonExportInfo;
		}else {
			SysFormButtonExportExample example = new SysFormButtonExportExample();
			example.or().andFormButtonIdEqualTo(new BigDecimal(buttonId));
			List<SysFormButtonExport> buttonExports = sysFormButtonExportMapper.selectByExample(example);
			if (buttonExports.size()>0) {
				jedis.set(("buttonExportInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonExports.get(0)));
				return buttonExports.get(0);
			}else {
				logger.info("找不到按钮ID为"+buttonId+"的导出按钮信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过按钮ID刷新导入按钮缓存
	 */
	@Override
	public void setButtonImport(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysFormButtonImportExample example = new SysFormButtonImportExample();
		example.or().andFormButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonImport> buttonImports = sysFormButtonImportMapper.selectByExample(example);
		if (buttonImports.size()>0) {
			jedis.set(("buttonImportInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonImports.get(0)));
		}else {
			jedis.del(("buttonImportInfo_"+buttonId).getBytes());
			logger.info("找不到按钮ID为"+buttonId+"的导入按钮信息");
		}
	}

	@Override
	public void setButtonCalculates(
			List<SysFormButtonCalculate> buttonCalculates) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < buttonCalculates.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("buttonCalculateInfo_"+buttonCalculates.get(i).getCalculateButtonId()).getBytes(), SerializeUtil.serialize(buttonCalculates.get(i)));
		}
	}

	@Override
	public SysFormButtonCalculate getButtonCalculate(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] buttonCalculateInfoByte = jedis.get(("buttonCalculateInfo_"+buttonId).getBytes());
    	if (buttonCalculateInfoByte!=null) {
    		SysFormButtonCalculate buttonCalculateInfo =(SysFormButtonCalculate) SerializeUtil.unserialize(buttonCalculateInfoByte);
    		return buttonCalculateInfo;
		}else {
			SysFormButtonCalculateExample example = new SysFormButtonCalculateExample();
			example.or().andCalculateButtonIdEqualTo(new BigDecimal(buttonId));
			List<SysFormButtonCalculate> buttonCalculates = sysFormButtonCalculateMapper.selectByExample(example);
			if (buttonCalculates.size()>0) {
				jedis.set(("buttonCalculateInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonCalculates.get(0)));
				return buttonCalculates.get(0);
			}else {
				logger.info("找不到按钮ID为"+buttonId+"的计算按钮信息");
				return null;
			}
		}
	}
	
	@Override
	public SysFormButtonEditorWithBLOBs getButtonEditor(String type, String buttonId) {
		SysFormButtonEditorExample example = new SysFormButtonEditorExample();
		example.or().andButtonEditorModelButtonidEqualTo(Long.parseLong(buttonId));
		List<SysFormButtonEditorWithBLOBs> buttonEditors = sysFormButtonEditorMapper.selectByExampleWithBLOBs(example);
		if (buttonEditors.size()>0) {
			return buttonEditors.get(0);
		}else {
			logger.info("找不到按钮ID为"+buttonId+"的m模板按钮信息");
			return null;
		}
	}
	
	/**
	 * 通过按钮ID刷新计算按钮缓存
	 */
	@Override
	public void setButtonCalculate(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysFormButtonCalculateExample example = new SysFormButtonCalculateExample();
		example.or().andCalculateButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonCalculate> buttonCalculates = sysFormButtonCalculateMapper.selectByExample(example);
		if (buttonCalculates.size()>0) {
			jedis.set(("buttonCalculateInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonCalculates.get(0)));
		}else {
			jedis.del(("buttonCalculateInfo_"+buttonId).getBytes());
			logger.info("找不到按钮ID为"+buttonId+"的计算按钮信息");
		}
	}

	@Override
	public void setButtonIntroduces(
			List<SysFormButtonIntroduce> buttonIntroduces) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < buttonIntroduces.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("buttonIntroduceInfo_"+buttonIntroduces.get(i).getIntroduceButtonId()).getBytes(), SerializeUtil.serialize(buttonIntroduces.get(i)));
		}
	}

	@Override
	public SysFormButtonIntroduce getButtonIntroduce(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] buttonIntroduceInfoByte = jedis.get(("buttonIntroduceInfo_"+buttonId).getBytes());
    	if (buttonIntroduceInfoByte!=null) {
    		SysFormButtonIntroduce buttonIntroduceInfo =(SysFormButtonIntroduce) SerializeUtil.unserialize(buttonIntroduceInfoByte);
    		return buttonIntroduceInfo;
		}else {
			SysFormButtonIntroduceExample example = new SysFormButtonIntroduceExample();
			example.or().andIntroduceButtonIdEqualTo(new BigDecimal(buttonId));
			List<SysFormButtonIntroduce> buttonIntroduces = sysFormButtonIntroduceMapper.selectByExample(example);
			if (buttonIntroduces.size()>0) {
				jedis.set(("buttonIntroduceInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonIntroduces.get(0)));
				return buttonIntroduces.get(0);
			}else {
				logger.info("找不到按钮ID为"+buttonId+"的导入按钮信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过按钮ID刷新引入按钮缓存
	 */
	@Override
	public void setButtonIntroduce(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysFormButtonIntroduceExample example = new SysFormButtonIntroduceExample();
		example.or().andIntroduceButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonIntroduce> buttonIntroduces = sysFormButtonIntroduceMapper.selectByExample(example);
		if (buttonIntroduces.size()>0) {
			jedis.set(("buttonIntroduceInfo_"+buttonId).getBytes(), SerializeUtil.serialize(buttonIntroduces.get(0)));
		}else {
			jedis.del(("buttonIntroduceInfo_"+buttonId).getBytes());
			logger.info("找不到按钮ID为"+buttonId+"的导入按钮信息");
		}
	}

	@Override
	public void setSysExecSqls(List<SysExecSql> sysExecSqls) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < sysExecSqls.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("buttonSysExecSqlInfo_"+sysExecSqls.get(i).getExecSqlRelaid()).getBytes(), SerializeUtil.serialize(sysExecSqls.get(i)));
		}
	}

	@Override
	public SysExecSql getSysExecSql(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] buttonSysExecSqlInfoByte = jedis.get(("buttonSysExecSqlInfo_"+buttonId).getBytes());
    	if (buttonSysExecSqlInfoByte!=null) {
    		SysExecSql buttonSysExecSqlInfo =(SysExecSql) SerializeUtil.unserialize(buttonSysExecSqlInfoByte);
    		return buttonSysExecSqlInfo;
		}else {
			SysExecSqlExample example = new SysExecSqlExample();
			example.or().andExecSqlRelaidEqualTo(Long.parseLong(buttonId)).andExecSqlTypeEqualTo("buttonExecSQL");
			List<SysExecSql> sysExecSqls = sysExecSqlMapper.selectByExample(example);
			if (sysExecSqls.size()>0) {
				jedis.set(("buttonSysExecSqlInfo_"+buttonId).getBytes(), SerializeUtil.serialize(sysExecSqls.get(0)));
				return sysExecSqls.get(0);
			}else {
				logger.info("找不到按钮ID为"+buttonId+"的调用SQL按钮信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过按钮ID刷新调用sql按钮缓存
	 */
	@Override
	public void setSysExecSql(String buttonId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysExecSqlExample example = new SysExecSqlExample();
		example.or().andExecSqlRelaidEqualTo(Long.parseLong(buttonId)).andExecSqlTypeEqualTo("buttonExecSQL");
		List<SysExecSql> sysExecSqls = sysExecSqlMapper.selectByExample(example);
		if (sysExecSqls.size()>0) {
			jedis.set(("buttonSysExecSqlInfo_"+buttonId).getBytes(), SerializeUtil.serialize(sysExecSqls.get(0)));
		}else {
			jedis.del(("buttonSysExecSqlInfo_"+buttonId).getBytes());
			logger.info("找不到按钮ID为"+buttonId+"的调用SQL按钮信息");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<SysFormWhere> getFormWheres(BigDecimal formId, String otherType){
//		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
//    	Jedis jedis = factory.getJedis();
//    	byte[] sysFormWhereByte = jedis.get(("formWhere_"+formId).getBytes());
//		if(sysFormWhereByte==null){
//			SysFormWhereExample example = new SysFormWhereExample();
//			SysFormWhereExample.Criteria criteria = example.createCriteria();
//			criteria.andFormWhereFormDefIdEqualTo(formId);
//			example.setOrderByClause("FORM_WHERE_SORT");
//			List<SysFormWhere> objs = sysFormWhereMapper.selectByExample(example);
//			if (objs.size()>0) {
//		    	jedis.set(("formWhere_"+formId).getBytes(), SerializeUtil.serializeList(objs));
//		    	return objs;
//			}else {
//				return null;
//			}
//		}else {
//			List<SysFormWhere> objs =(List<SysFormWhere>) SerializeUtil.unserializeList(sysFormWhereByte);
//			return objs;
//		}
		SysFormWhereExample example = new SysFormWhereExample();
		SysFormWhereExample.Criteria criteria = example.createCriteria();
		criteria.andFormWhereFormDefIdEqualTo(formId);
		example.setOrderByClause("FORM_WHERE_SORT");
		List<SysFormWhere> objs = sysFormWhereMapper.selectByExample(example);
		if (objs.size()>0) {
	    	return objs;
		}else {
			return null;
		}
	}
	
	@Override
	public void setFormWheres(String formId){
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
		SysFormWhereExample example = new SysFormWhereExample();
		SysFormWhereExample.Criteria criteria = example.createCriteria();
		criteria.andFormWhereFormDefIdEqualTo(new BigDecimal(formId));
		example.setOrderByClause("FORM_WHERE_SORT");
		List<SysFormWhere> objs = sysFormWhereMapper.selectByExample(example);
		if (objs.size()>0) {
	    	jedis.set(("formWhere_"+formId).getBytes(), SerializeUtil.serializeList(objs));
		}else {
			jedis.del(("formWhere_"+formId).getBytes());
		}
	}
	
	/**
	 * 根据表单ID取过滤信息缓存
	 */
	@Override
	public SysGridFilter getFormFilter(String formId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] sysGridFilterInfoByte = jedis.get(("sysGridFilterInfo_"+formId).getBytes());
    	if (sysGridFilterInfoByte!=null) {
    		SysGridFilter sysGridFilterInfo =(SysGridFilter) SerializeUtil.unserialize(sysGridFilterInfoByte);
    		return sysGridFilterInfo;
		}else {
			SysGridFilterExample example = new SysGridFilterExample();
			SysGridFilterExample.Criteria criteria =  example.createCriteria();
			criteria.andGridFilterFormDefIdEqualTo(new BigDecimal(formId));
			List<SysGridFilter> list = sysGridFilterMapper.selectByExample(example);
			if (list.size()>0) {
				jedis.set(("sysGridFilterInfo_"+formId).getBytes(), SerializeUtil.serialize(list.get(0)));
				return list.get(0);
			}else {
				logger.info("找不到表单ID为"+formId+"的查询配置信息");
				return null;
			}
		}
	}
	
	/**
	 * 根据表单ID刷新过滤信息缓存
	 */
	@Override
	public void setFormFilter(String formId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysGridFilterExample example = new SysGridFilterExample();
		SysGridFilterExample.Criteria criteria =  example.createCriteria();
		criteria.andGridFilterFormDefIdEqualTo(new BigDecimal(formId));
		List<SysGridFilter> list = sysGridFilterMapper.selectByExample(example);
		if (list.size()>0) {
			jedis.set(("sysGridFilterInfo_"+formId).getBytes(), SerializeUtil.serialize(list.get(0)));
		}else {
			jedis.del(("sysGridFilterInfo_"+formId).getBytes());
			logger.info("找不到表单ID为"+formId+"的查询配置信息");
		}
	}
	
	/**
	 * 加载所有过滤信息缓存
	 */
	@Override
	public void setGridFilters(List<SysGridFilter> filters) throws Exception {
		for (int i = 0; i < filters.size(); i++) {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis();
	    	jedis.set(("sysGridFilterInfo_"+filters.get(i).getGridFilterFormDefId()).getBytes(), SerializeUtil.serialize(filters.get(i)));
		}
	}
	
	@Override
	public void setFormFilterColumns(String formId) {
		List<SysGridFilterColumn> list = IFilterService.queryFilterColumnList(formId);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
		if(list!=null&&list.size()>0){
	    	jedis.set(("sysGridFilterColumns_"+formId).getBytes(), SerializeUtil.serializeList(list));
		}else {
			jedis.del(("sysGridFilterColumns_"+formId).getBytes());
		}
	}

	@Override
	public List<SysGridFilterColumn> getFormFilterColumns(String formId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] sysGridFilterColumnsByte = jedis.get(("sysGridFilterColumns_"+formId).getBytes());
		if(sysGridFilterColumnsByte==null){
			List<SysGridFilterColumn> list = IFilterService.queryFilterColumnList(formId);
			if (list!=null&&list.size()>0) {
		    	jedis.set(("sysGridFilterColumns_"+formId).getBytes(), SerializeUtil.serializeList(list));
		    	return list;
			} else {
				return null;
			}
		}else {
			List<SysGridFilterColumn> objs =(List<SysGridFilterColumn>) SerializeUtil.unserializeList(sysGridFilterColumnsByte);
			return objs;
		}
	}
	
	@Override
	public List<SysGridFilterColumn> getFormFilterColumnsFromData(String formId) {
		List<SysGridFilterColumn> list = IFilterService.queryFilterColumnList(formId);
	    return list;
	}

	@Override
	public SysFileuploadConfig getFileuploadConfigById(String fileuploadConfig) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] sysFileuploadConfigByte = jedis.get(("sysFileuploadConfigBy_"+fileuploadConfig).getBytes());
		if(sysFileuploadConfigByte==null){
			if(fileuploadConfig!=null&&!fileuploadConfig.equals("")){
				SysFileuploadConfig config = fileuploadConfigMapper.selectByPrimaryKey(new BigDecimal(fileuploadConfig));
				if (config!=null) {
			    	jedis.set(("sysFileuploadConfigBy_"+fileuploadConfig).getBytes(), SerializeUtil.serialize(config));
			    	return config;
				} else {
					return null;
				}
			}else{
				return null;
			}
			
		}else {
			@SuppressWarnings("unchecked")
			SysFileuploadConfig config = (SysFileuploadConfig) SerializeUtil.unserialize(sysFileuploadConfigByte);
			return config;
		}
	}
	
	@Override
	public void setFileuploadConfigById(String formId) {
		try {
			SysFormconfigWithBLOBs form = this.getFormInfo(formId);
			String fileuploadConfig = form.getFileuploadConfig();
			if (fileuploadConfig!=null) {
				SysFileuploadConfig config = fileuploadConfigMapper.selectByPrimaryKey(new BigDecimal(fileuploadConfig));
				JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
		    	Jedis jedis = factory.getJedis();
				if(config!=null){
			    	jedis.set(("sysFileuploadConfigBy_"+fileuploadConfig).getBytes(), SerializeUtil.serialize(config));
				}else {
					jedis.del(("sysFileuploadConfigBy_"+fileuploadConfig).getBytes());
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
	}
	
	@Override
	public SysQuestion getQuestion(int questionId) {
		return sQuestionMapper2.selectByPrimaryKey(questionId);
	}

	@Override
	public SysExamtemplate getExamtemplate(int templateId) {
		// TODO Auto-generated method stub
		return sExamtemplateMapper.selectByPrimaryKey(templateId);
	}
	
	/**
	 * 通过字段名称加载sql字典缓存
	 */
	@Override
	public String setColumnSqlDict(String realFieldColumn,String sql){
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	String columnSqlDictDatas = jedis.get("columnSqlDictDatas"+realFieldColumn);
    	if (columnSqlDictDatas!=null) {
    		return columnSqlDictDatas;
		}else {
			//sql = MyEhrJDBCUtil.repleaceContainerParam(containerParam, sql);
			List<Map> ids = null;
			try {
				ids = MybatisUtil.queryList("runtime.selectSql", sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
			}
			
			if (ids.size()>0) {
				StringBuffer sb = new StringBuffer("[");
				for (int i = 0; i < ids.size(); i++) {
					sb.append("{'value':'"+ids.get(i).get("DICTVALUE")+"','text':'"+ids.get(i).get("DICTENTRY")+"'},");
				}
				String str = sb.toString();
				String str1 = str.substring(0, str.length()-1);
				str1+="]";
				jedis.set("columnSqlDictDatas"+realFieldColumn,str1);
				return str1;
			}else {
				return null;
			}
		}
	}
	
	/**
	 * 通过字段名称加载sql字典缓存
	 */
	@Override
	public String getColumnSqlDict(String dataField){
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	String columnSqlDictDatas = jedis.get("columnSqlDictDatas"+dataField);
    	return columnSqlDictDatas;
	}

	/**
	 * 通过表单ID刷新表单缓存
	 */
	@Override
	public void setFormInfo(String formId){
		SysFormconfigWithBLOBs form = sysFormconfigMapper.selectByPrimaryKey(new BigDecimal(formId));
		//formInfoMap.put(formId,form);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	jedis.set(("formInfo"+formId).getBytes(), SerializeUtil.serialize(form));
	}

	/**
	 * 通过字段ID刷新实体字段缓存
	 */
	@Override
	public void setEntityColumnByColumnId(String columnId){
		if (!columnId.equals("null")) {
			logger.info(columnId);
			Map map = new HashMap();
			map.put("fieldId", columnId);
			Map obj = sysFormColumnExpandMapper.queryEntityColumnByColumnId(map);
			if (obj!=null) {
				entityMap.put(columnId,obj);
			}
		}
	}

	

	@Override
	public void setFormInfo(String formId, String userId) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	Map obj = new HashMap();
	}
	
	@Override
	public void setGenParamByRuleId(String ruleId,List<SysFormGeneralParam> params) throws Exception {
		generalParamByRuleIdMap.put(ruleId, params);
	}
	
	/**
	 * 通过公式Id获取参数信息
	 */
	@Override
	public List<SysFormGeneralParam> getGenParamByRuleId(String ruleId){
		if (generalParamByRuleIdMap.get(ruleId)==null) {
			SysFormGeneralParamExample example = new SysFormGeneralParamExample();
			example.or().andParamTypeEqualTo("CALCULATE").andParamTypeValueEqualTo(new BigDecimal(ruleId));
			List<SysFormGeneralParam> params = sysFormGeneralParamMapper.selectByExample(example);
			generalParamByRuleIdMap.put(ruleId, params);
		}else{
			return generalParamByRuleIdMap.get(ruleId);
		}
		return generalParamByRuleIdMap.get(ruleId);
	}

	@Override
	public SysField getFieldById(String fieldId) {
		return sysFieldMapper.selectByPrimaryKey(new BigDecimal(fieldId));
	}

	@Override
	public SysEntity getEntityById(String entityId) {
		return sysEntityMapper.selectByPrimaryKey(Integer.valueOf(entityId));
	}

	@Override
	public Map getSysParam() {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] EmpInfoByte = jedis.get(("sysSystemParam").getBytes());
    	return (Map) SerializeUtil.unserialize(EmpInfoByte);
	}

	@Override
	public SysCardtocardConfig getCardandcardConfigByFormId(String formId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] cardtocardConfigInfoByte = jedis.get(("cardtocardConfig"+formId).getBytes());
    	if (cardtocardConfigInfoByte!=null) {
    		SysCardtocardConfig cardtocardConfig =(SysCardtocardConfig) SerializeUtil.unserialize(cardtocardConfigInfoByte);
    		return cardtocardConfig;
		}else {
			SysCardtocardConfigExample example = new SysCardtocardConfigExample();
			example.or().andFormIdEqualTo(Long.valueOf(formId));
			List<SysCardtocardConfig> configs = cardtocardConfigMapper.selectByExample(example);
			if (configs.size()>0) {
				jedis.set(("cardtocardConfig"+formId).getBytes(), SerializeUtil.serialize(configs.get(0)));
				return configs.get(0);
			}else {
				logger.info("找不到表单ID为"+formId+"的卡卡配置信息");
				return null;
			}
		}
	}
	
	/**
	 * 通过字段ID刷新下拉弹出字段缓存
	 */
	@Override
	public void setCardandcardConfig(String formId) {
		SysCardtocardConfigExample example = new SysCardtocardConfigExample();
		example.or().andFormIdEqualTo(Long.valueOf(formId));
		List<SysCardtocardConfig> configs = cardtocardConfigMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (configs.size()>0) {
			jedis.set(("cardtocardConfig"+formId).getBytes(), SerializeUtil.serialize(configs.get(0)));
		}else {
			jedis.del(("cardtocardConfig"+formId).getBytes());
			logger.info("找不到字段ID为"+formId+"的下拉弹出控件信息");
		}
	}

	@Override
	public String findSysFormFolderTreeById(int folderTreeId,String path) {
		// TODO Auto-generated method stub
		SysFormFolderTreeExample example = new SysFormFolderTreeExample();
		BigDecimal treeFormDefId = new BigDecimal(folderTreeId);
		example.or().andFolderTreeIdEqualTo(treeFormDefId);
		List<SysFormFolderTree> sysFormFolderTrees = sysFormFolderTreeMapper.selectByExample(example);
		SysFormFolderTree tree = null;
		if (sysFormFolderTrees.size()>0) {
			tree = sysFormFolderTrees.get(0);
			path = tree.getFolderTreeCode()+"/"+path;
			if (tree.getFolderTreeParentId()!=null) {
				path = findSysFormFolderTreeById(tree.getFolderTreeParentId().intValue(),path);
			}else {
				return path;
			}
		}
		return path;
	}

	@Override
	public List<SysCacheConfig> getFreshCache(String objType, String objId,String cacheType) {
		SysCacheConfigExample example = new SysCacheConfigExample();
		example.or().andObjTypeEqualTo(objType).andObjIdEqualTo(new BigDecimal(objId)).andCacheTypeEqualTo(cacheType);
		List<SysCacheConfig> configs = cacheConfigMapper.selectByExample(example);
		return configs;
	}
	
	@Override
	public void importFormDatas(String oldFormId) throws Exception {
		ISysformconfigService service =  new SysformconfigService();
		SysFormconfigCache formCache = service.getForm(oldFormId);
		JSONObject json = JSONObject.fromObject(formCache);
	}

	@Override
	public SysFieldRule getFieldRuleById(Long fieldRuleId) {
		SysFieldRule fieldRule = sysFieldRuleMapper.selectByPrimaryKey(fieldRuleId);
		return fieldRule;
	}
	
	@Override
	public void setFreeWaysByTaskId(String taskid) {
		SysActfreeWayExample example = new SysActfreeWayExample();
		example.or().andTaskidEqualTo(taskid);
		example.setOrderByClause("ORDERBY");
		List<SysActfreeWay> ways = sysActfreeWayMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		if (ways.size()>0) {
			jedis.set(("FreeWay_"+taskid).getBytes(), SerializeUtil.serializeList(ways));
			for (int i = 0; i < ways.size(); i++) {
				jedis.set(("FreeWay_"+taskid+"_order_"+ways.get(i).getOrderby()).getBytes(), SerializeUtil.serialize(ways.get(i)));
				if (i<ways.size()-1) {
					jedis.set(("FreeWay_"+taskid+"_next_"+ways.get(i).getOrderby()).getBytes(), SerializeUtil.serialize(ways.get(i+1)));
				}
				jedis.set(("FreeWay_"+taskid+"_now_"+ways.get(i).getOrderby()).getBytes(), SerializeUtil.serialize(ways.get(i)));
			}
		}else {
			jedis.del(("FreeWay_"+taskid).getBytes());
		}
	}
	
	@Override
	public SysActfreeWay getNextFreeWayByTOId(String taskid,String orderBy){
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeWaysInfoByte = jedis.get(("FreeWay_"+taskid+"_next_"+orderBy).getBytes());
    	if (freeWaysInfoByte!=null) {
    		SysActfreeWay ways = (SysActfreeWay)SerializeUtil.unserialize(freeWaysInfoByte);
    		return ways;
    	}else {
    		setFreeWaysByTaskId(taskid);
    		freeWaysInfoByte = jedis.get(("FreeWay_"+taskid+"_next_"+orderBy).getBytes());
    		if (freeWaysInfoByte!=null) {
        		SysActfreeWay ways = (SysActfreeWay)SerializeUtil.unserialize(freeWaysInfoByte);
        		return ways;
        	}else {
    			return null;
        	}
		}
	}
	
	@Override
	public SysActfreeWay getNowFreeWayByTOId(String taskid,String orderBy){
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeWaysInfoByte = jedis.get(("FreeWay_"+taskid+"_now_"+orderBy).getBytes());
    	if (freeWaysInfoByte!=null) {
    		SysActfreeWay ways = (SysActfreeWay)SerializeUtil.unserialize(freeWaysInfoByte);
    		return ways;
    	}else {
    		setFreeWaysByTaskId(taskid);
    		freeWaysInfoByte = jedis.get(("FreeWay_"+taskid+"_now_"+orderBy).getBytes());
    		if (freeWaysInfoByte!=null) {
        		SysActfreeWay ways = (SysActfreeWay)SerializeUtil.unserialize(freeWaysInfoByte);
        		return ways;
        	}else {
    			return null;
    		}
		}
	}
	
	@Override
	public List<SysActfreeWay> getFreeWaysByTaskId(String taskid){
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeWaysInfoByte = jedis.get(("FreeWay_"+taskid).getBytes());
    	if (freeWaysInfoByte!=null) {
    		List<SysActfreeWay> ways = (List<SysActfreeWay>)SerializeUtil.unserializeList(freeWaysInfoByte);
    		return ways;
    	}else {
    		SysActfreeWayExample example = new SysActfreeWayExample();
    		example.or().andTaskidEqualTo(taskid);
    		example.setOrderByClause("ORDERBY");
    		List<SysActfreeWay> ways = sysActfreeWayMapper.selectByExample(example);
    		if (ways.size()>0) {
    			jedis.set(("FreeWay_"+taskid).getBytes(), SerializeUtil.serializeList(ways));
    		}
    		return ways;
		}
	}
	@Override
	public void setActfreeTask(String taskId) {
		SysActfreeTask task = sysActfreeTaskMapper.selectByPrimaryKey(taskId);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	if (task!=null) {
    		jedis.set(("FreeActTask_"+taskId).getBytes(), SerializeUtil.serialize(task));
		}else {
			jedis.del(("FreeActTask_"+taskId).getBytes());
		}
    	//sysActFreeTask载入缓存
    	SysActfreeTaskExample example = new SysActfreeTaskExample();
    	example.or().andModelkeyEqualTo(task.getModelkey());
    	example.setOrderByClause("ACTCODE");
    	List<SysActfreeTask> tasks = sysActfreeTaskMapper.selectByExample(example);
    	if (tasks!=null&&tasks.size()>0) {
    		jedis.set(("FreeActTaskMaxCode_"+task.getModelkey()).getBytes(), SerializeUtil.serialize(tasks.get(tasks.size()-1)));
    	}else {
    		jedis.del(("FreeActTaskMaxCode_"+task.getModelkey()).getBytes());
		}
    	//sysActFreeHis载入缓存
    	SysActfreeHisExample example2 = new SysActfreeHisExample();
    	example2.or().andTaskidEqualTo(taskId);
    	example2.setOrderByClause("STARTTIME");
    	List<SysActfreeHis> his = sysActfreeHisMapper.selectByExample(example2);
    	if (his!=null&&his.size()>0) {
    		jedis.set(("FreeActTaskHis_"+taskId).getBytes(), SerializeUtil.serializeList(his));
    	}else {
    		jedis.del(("FreeActTaskHis_"+taskId).getBytes());
		}
	}
	
	@Override
	public List<SysActfreeHis> getFreeActHisByTaskid(String taskId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeTaskInfoByte = jedis.get(("FreeActTaskHis_"+taskId).getBytes());
    	if (freeTaskInfoByte!=null) {
    		List<SysActfreeHis> his = (List<SysActfreeHis>) SerializeUtil.unserializeList(freeTaskInfoByte);
    		return his;
		}else {
			SysActfreeHisExample example2 = new SysActfreeHisExample();
	    	example2.or().andTaskidEqualTo(taskId);
	    	example2.setOrderByClause("STARTTIME");
	    	List<SysActfreeHis> his = sysActfreeHisMapper.selectByExample(example2);
	    	if (his!=null&&his.size()>0) {
	    		jedis.set(("FreeActTaskHis_"+taskId).getBytes(), SerializeUtil.serializeList(his));
	    	}else {
	    		jedis.del(("FreeActTaskHis_"+taskId).getBytes());
			}
			return (List<SysActfreeHis>) SerializeUtil.unserializeList(freeTaskInfoByte);
		}
	}
	
	@Override
	public SysActfreeTask getFreeActTaskMaxCode(String modelKey) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeTaskInfoByte = jedis.get(("FreeActTaskMaxCode_"+modelKey).getBytes());
    	if (freeTaskInfoByte!=null) {
    		SysActfreeTask task = (SysActfreeTask) SerializeUtil.unserialize(freeTaskInfoByte);
    		return task;
		}else {
			SysActfreeTaskExample example = new SysActfreeTaskExample();
	    	example.or().andModelkeyEqualTo(modelKey);
	    	example.setOrderByClause("ACTCODE");
	    	List<SysActfreeTask> tasks = sysActfreeTaskMapper.selectByExample(example);
	    	if (tasks!=null&&tasks.size()>0) {
	    		jedis.set(("FreeActTaskMaxCode_"+modelKey).getBytes(), SerializeUtil.serialize(tasks.get(tasks.size()-1)));
	    		freeTaskInfoByte = jedis.get(("FreeActTaskMaxCode_"+modelKey).getBytes());
	    	}else {
	    		jedis.del(("FreeActTaskMaxCode_"+modelKey).getBytes());
			}
			return (SysActfreeTask) SerializeUtil.unserialize(freeTaskInfoByte);
		}
	}
	
	
	@Override
	public SysActfreeTask getActfreeTask(String taskId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeTaskInfoByte = jedis.get(("FreeActTask_"+taskId).getBytes());
    	if (freeTaskInfoByte!=null) {
    		SysActfreeTask task = (SysActfreeTask) SerializeUtil.unserialize(freeTaskInfoByte);
    		return task;
		}else {
			SysActfreeTask task = sysActfreeTaskMapper.selectByPrimaryKey(taskId);
	    	if (task!=null) {
	    		jedis.set(("FreeActTask_"+taskId).getBytes(), SerializeUtil.serialize(task));
	    		freeTaskInfoByte = jedis.get(("FreeActTask_"+taskId).getBytes());
			}else {
				jedis.del(("FreeActTask_"+taskId).getBytes());
			}
	    	return (SysActfreeTask) SerializeUtil.unserialize(freeTaskInfoByte);
		}
	}
	@Override
	public SysActfreeConduct getActFreeConductByTaskId(String taskId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeConductInfoByte = jedis.get(("FreeConduct_"+taskId).getBytes());
    	if (freeConductInfoByte!=null) {
    		SysActfreeConduct task = (SysActfreeConduct) SerializeUtil.unserialize(freeConductInfoByte);
    		return task;
		}else {
			setActFreeConductByTaskId(taskId);
			freeConductInfoByte = jedis.get(("FreeConduct_"+taskId).getBytes());
			if (freeConductInfoByte!=null) {
	    		SysActfreeConduct task = (SysActfreeConduct) SerializeUtil.unserialize(freeConductInfoByte);
	    		return task;
			}else {
				return null;
			}
		}
	}
	@Override
	public List<SysActfreeConduct> getActFreeConductByUserId(String userId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeConductInfoByte = jedis.get(("FreeConducts_USERID_"+userId).getBytes());
    	if (freeConductInfoByte!=null) {
    		List<SysActfreeConduct> conducts = (List<SysActfreeConduct>) SerializeUtil.unserializeList(freeConductInfoByte);
    		return conducts;
		}else {
			SysActfreeConductExample example2 = new SysActfreeConductExample();
        	example2.or().andAssigneeEqualTo(userId);
        	List<SysActfreeConduct> conducts2 = sysActfreeConductMapper.selectByExample(example2);
        	if (conducts2!=null&&conducts2.size()>0) {
        		jedis.set(("FreeConducts_USERID_"+userId).getBytes(), SerializeUtil.serializeList(conducts2));
        		freeConductInfoByte = jedis.get(("FreeConducts_USERID_"+userId).getBytes());
    		}
        	return (List<SysActfreeConduct>) SerializeUtil.unserializeList(freeConductInfoByte);
		}
	}
	@Override
	public void setActFreeConductByTaskId(String taskId) {
		SysActfreeConductExample example = new SysActfreeConductExample();
		example.or().andTaskidEqualTo(taskId);
		List<SysActfreeConduct> conducts = sysActfreeConductMapper.selectByExample(example);
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	if (conducts!=null&&conducts.size()>0) {
    		jedis.set(("FreeConduct_"+taskId).getBytes(), SerializeUtil.serialize(conducts.get(0)));
    		SysActfreeConductExample example2 = new SysActfreeConductExample();
        	example2.or().andAssigneeEqualTo(conducts.get(0).getAssignee());
        	List<SysActfreeConduct> conducts2 = sysActfreeConductMapper.selectByExample(example2);
        	if (conducts2!=null) {
        		jedis.set(("FreeConducts_USERID_"+conducts.get(0).getAssignee()).getBytes(), SerializeUtil.serializeList(conducts2));
    		}else {
    			jedis.del(("FreeConducts_USERID_"+conducts.get(0).getAssignee()).getBytes());
    		}
		}else {
			jedis.del(("FreeConduct_"+taskId).getBytes());
		}
    	
	}

	@Override
	public SysActfreeModel getSysActfreeModelBytaskId(String taskid) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] freeMoldeInfoByte = jedis.get(("FreeModel"+taskid).getBytes());
    	if (freeMoldeInfoByte!=null) {
    		SysActfreeModel model = (SysActfreeModel) SerializeUtil.unserialize(freeMoldeInfoByte);
    		return model;
		}else {
			SysActfreeTask task = getActfreeTask(taskid);
			String modelKey = task.getModelkey();
			if (modelKey!=null) {
				SysActfreeModelExample example = new SysActfreeModelExample();
				example.or().andModelkeyEqualTo(modelKey);
				List<SysActfreeModel> models = sysActfreeModelMapper.selectByExample(example);
				if (models!=null&&models.size()>0) {
					jedis.set(("FreeModel"+taskid).getBytes(), SerializeUtil.serialize(models.get(0)));
				} else {
					jedis.del(("FreeModel"+taskid).getBytes());
				}
				return (SysActfreeModel) SerializeUtil.unserialize(freeMoldeInfoByte);
			}else {
				return null;
			}
			
		}
		
	}
	
	
	@Override
	public void initSystemParam() {
		SysSystemParamExample example = new SysSystemParamExample();
		List<SysSystemParam> params = sysSystemParamMapper.selectByExample(example);
		Map map = new HashMap();
		for (SysSystemParam sysSystemParam : params) {
			map.put(sysSystemParam.getSysParamCode(), sysSystemParam);
			systemParamMap.put(sysSystemParam.getSysParamCode(),sysSystemParam);
		}
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	jedis.set(("sysSystemParam").getBytes(), SerializeUtil.serialize(map));
	}

	@Override
	public SysFormTreeSolutionCache getTreeSolutionById(BigDecimal formTreeSolutionId) throws Exception {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] sysFormTreeSolutionInfoByte = jedis.get(("sysFormTreeSolution"+formTreeSolutionId).getBytes());
    	if (sysFormTreeSolutionInfoByte!=null) {
    		SysFormTreeSolutionCache solutionCache = (SysFormTreeSolutionCache) SerializeUtil.unserialize(sysFormTreeSolutionInfoByte);
    		return solutionCache;
		}else {
			SysFormTreeSolutionCache solutionCache = new SysFormTreeSolutionCache(formTreeSolutionId+"");
			if (solutionCache!=null) {
				jedis.set(("sysFormTreeSolution"+formTreeSolutionId).getBytes(), SerializeUtil.serialize(solutionCache));
				return solutionCache;
			}else {
				jedis.del(("sysFormTreeSolution"+formTreeSolutionId).getBytes());
				return null;
			}
		}
	}
	
	@Override
	public void setTreeSolutionById(BigDecimal formTreeSolutionId) throws Exception{
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
		SysFormTreeSolutionCache solutionCache = new SysFormTreeSolutionCache(formTreeSolutionId+"");
		if (solutionCache!=null) {
			jedis.set(("sysFormTreeSolution"+formTreeSolutionId).getBytes(), SerializeUtil.serialize(solutionCache));
		}else {
			jedis.del(("sysFormTreeSolution"+formTreeSolutionId).getBytes());
		}
	}

	@Override
	public Map getChartConfigByformId(String formId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] chartConfigInfoByte = jedis.get(("chartConfig"+formId).getBytes());
    	Map map = new HashMap();
    	if (chartConfigInfoByte!=null) {
		}else {
			SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
			example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(formId));
			List<SysGridbycardTemplateColumn> columns = gridbycardTemplateColumnMapper.selectByExample(example);
			if (columns!=null&&columns.size()>0) {
				jedis.set(("chartConfig"+formId).getBytes(), SerializeUtil.serializeList(columns));
			} else {
				jedis.del(("chartConfig"+formId).getBytes());
			}
			chartConfigInfoByte = jedis.get(("chartConfig"+formId).getBytes());
		}
    	List<SysGridbycardTemplateColumn> columns = (List<SysGridbycardTemplateColumn>) SerializeUtil.unserializeList(chartConfigInfoByte);
    	for (SysGridbycardTemplateColumn sysGridbycardTemplateColumn : columns) {
			map.put(sysGridbycardTemplateColumn.getTemplateColumnCode(), sysGridbycardTemplateColumn);
		}
    	return map;
	}
	
	@Override
	public void setChartConfigByformId(String formId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	Map map = new HashMap();
		SysGridbycardTemplateColumnExample example = new SysGridbycardTemplateColumnExample();
		example.or().andTemplateColumnFormDefIdEqualTo(Integer.valueOf(formId));
		List<SysGridbycardTemplateColumn> columns = gridbycardTemplateColumnMapper.selectByExample(example);
		if (columns!=null&&columns.size()>0) {
			jedis.set(("chartConfig"+formId).getBytes(), SerializeUtil.serializeList(columns));
		} else {
			jedis.del(("chartConfig"+formId).getBytes());
		}
	}
	
	@Override
	public void setEmpPhotoByUserId(String empId, String photoPath) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
        SysUserExample example = new SysUserExample();
        example.or().andEmpIdEqualTo(Integer.valueOf(empId));
        SysUser user = userMapper.selectByExample(example).get(0);
        user.setHead(photoPath);
        userMapper.updateByPrimaryKey(user);
    	user.setHead(photoPath);
    	jedis.set(("userForPhoto_"+empId).getBytes(), SerializeUtil.serialize(user));
	}
	
	@Override
	public String getEmpPhotoByUserId(String empId){
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis();
    	byte[] empPhotoInfoByte = jedis.get(("userForPhoto_"+empId).getBytes());
    	if (empPhotoInfoByte!=null) {
    		SysUser user = (SysUser) SerializeUtil.unserialize(empPhotoInfoByte);
    		return user.getHead();
		}else {
			SysUserExample example = new SysUserExample();
			example.or().andEmpIdEqualTo(Integer.valueOf(empId));
			SysUser user = userMapper.selectByExample(example).get(0);
	    	jedis.set(("userForPhoto_"+empId).getBytes(), SerializeUtil.serialize(user));
			return user.getHead();
		}
	}

	@Override
	public List<SysTask> getTaskDatasByUserId(String userId) {
		SysTaskExample example = new SysTaskExample();
		
			example.or().andSysTaskStatusEqualTo("0").andSysTaskIdentifierEqualTo("unconnected").andSysTaskCreateUseridEqualTo(userId);
			example.setOrderByClause("sys_task_create_time DESC");
			List<SysTask> taskList = sysTaskMapper.selectByExample(example);
			for (int i = 0; i < taskList.size(); i++) {
				SysTask sysTask = taskList.get(i);
				String formId = sysTask.getSysTaskFormid();
				if (formId!=null && !formId.equals("")) {
					SysFormWhereExample example1 = new SysFormWhereExample();
					example1.or().andFormWhereFormDefIdEqualTo(new BigDecimal(formId));
					List<SysFormWhere> wheres = sysFormWhereMapper.selectByExample(example1);
					if (wheres.size()>0) {
						sysTask.setSysTaskFormid(formId+":"+wheres.get(0).getFormWhereValue());
					}
				}	
			}
			return taskList;
	}

	@Override
	public String getMainframeMenuWithSchemex(String code, String userId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] menusByte = jedis.get(("sysCustomMenus_"+code+userId).getBytes());
    	if (menusByte!=null) {
    		String result = new String(menusByte);
    		return result;
		}else {
			String result = sMService.queryMainframeMenuWithSchemex(code,userId,null,"N");
			jedis.set(("sysCustomMenus_"+code+userId).getBytes(), result.getBytes());
			return result;
		}
	}
	
	@Override
	public int setMainframeMenuWithSchemex(String code, String userId) {
		try {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis(); 
	    	String result = sMService.queryMainframeMenuWithSchemex(code,userId,null,"N");
			jedis.set(("sysCustomMenus_"+code+userId).getBytes(), result.getBytes());
		} catch (Exception e) {
			return 1;
		}
		return 0;
	}

	@Override
	public EmpVEmp1basic getPersonInfoByuserId(String userId) {
		JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
    	Jedis jedis = factory.getJedis(); 
    	byte[] personInfoByte = jedis.get(("personInfo_"+userId).getBytes());
    	if (personInfoByte!=null) {
    		EmpVEmp1basic person = (EmpVEmp1basic) SerializeUtil.unserialize(personInfoByte);
    		return person;
		}else {
			String sql = "SELECT * from EMP_V_EMP1BASIC WHERE isnull(userid,0)="+userId;
			Map map;
			try {
				map = MybatisUtil.queryOne("runtime.selectSql", sql);
				EmpVEmp1basic personInfo = new EmpVEmp1basic();
				//{BIRTHDAY=null, CNAME=王A骏, WORKPHONE=null, EMPID=7, MOBILE=null, SEX=女, JOBID=D1.CNAME, WORKEMAIL=null, DEPID=D.CNAME, EMPCODE=E07, USERID=17275}
				if (map!=null) {
					String BIRTHDAY = map.get("BIRTHDAY")==null?"生日":map.get("BIRTHDAY")+"";
					String CNAME = map.get("CNAME")==null?"姓名":map.get("CNAME")+"";
					String DEPID = map.get("DEPID")==null?"部门":map.get("DEPID")+"";
					String EMPCODE = map.get("EMPCODE")==null?"工号":map.get("EMPCODE")+"";
					String EMPID = map.get("EMPID")==null?"未维护":map.get("EMPID")+"";
					String JOBID = map.get("JOBID")==null?"岗位":map.get("JOBID")+"";
					String MOBILE = map.get("MOBILE")==null?"手机号码":map.get("MOBILE")+"";
					String SEX = map.get("SEX")==null?"性别":map.get("SEX")+"";
					String USERID = map.get("USERID")==null?"未维护":map.get("USERID")+"";
					String WORKEMAIL = map.get("WORKEMAIL")==null?"工作邮箱":map.get("WORKEMAIL")+"";
					String WORKPHONE = map.get("WORKPHONE")==null?"工作电话":map.get("WORKPHONE")+"";
					personInfo.setBirthday(BIRTHDAY);
					personInfo.setCname(CNAME);
					personInfo.setDepid(DEPID);
					personInfo.setEmpcode(EMPCODE);
					personInfo.setEmpid(EMPID);
					personInfo.setJobid(JOBID);
					personInfo.setMobile(MOBILE);
					personInfo.setSex(SEX);
					personInfo.setUserid(USERID);
					personInfo.setWorkemail(WORKEMAIL);
					personInfo.setWorkphone(WORKPHONE);
					jedis.set(("personInfo_"+userId).getBytes(), SerializeUtil.serialize(personInfo));
				}else {
					personInfo.setBirthday("生日");
					personInfo.setCname("姓名");
					personInfo.setDepid("部门");
					personInfo.setEmpcode("工号");
					personInfo.setEmpid("未维护");
					personInfo.setJobid("岗位");
					personInfo.setMobile("手机号码");
					personInfo.setSex("性别");
					personInfo.setUserid("未维护");
					personInfo.setWorkemail("工作邮箱");
					personInfo.setWorkphone("工作电话");
				}
				return personInfo;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
			
		}
	}
	
	@Override
	public int setPersonInfoByuserId(String userId) {
		try {
			JedisFactory factory = new  JedisFactory( new  JedisPoolConfig());  
	    	Jedis jedis = factory.getJedis(); 
	    	byte[] personInfoByte = jedis.get(("personInfo_"+userId).getBytes());
	    	EmpVEmp1basicExample example = new EmpVEmp1basicExample();
			example.or().andUseridEqualTo(Integer.valueOf(userId));
			List<EmpVEmp1basic> persons = empVEmp1basicMapper.selectByExample(example);
			if (persons!=null&&persons.size()>0) {
				jedis.set(("personInfo_"+userId).getBytes(), SerializeUtil.serialize(persons.get(0)));
			}else {
				jedis.del(("personInfo_"+userId).getBytes());
			}
		} catch (Exception e) {
			return 1;
		}
		return 0;
	}

	@Override
	public List<SysSqlParams> getYkParamsByreportId(Long reportId) {
		SysFormYkReportQueryparamsExample example = new SysFormYkReportQueryparamsExample();
		example.or().andReportIdEqualTo(reportId);
		List<SysFormYkReportQueryparams> ykParamsEs = ykReportQueryparamsMapper.selectByExample(example);
		List<SysSqlParams> params = new ArrayList<SysSqlParams>();
		for (SysFormYkReportQueryparams sysFormYkReportQueryparams : ykParamsEs) {
			SysSqlParams param = sqlParamsMapper.selectByPrimaryKey(new BigDecimal(sysFormYkReportQueryparams.getParamsId()));
			params.add(param);
		}
		return params;
	}
	
	@Override
	public SysFormYkReport getYkreportByformId(String formId) {
		SysFormYkReportExample example0 = new SysFormYkReportExample();
		example0.or().andReportFormIdEqualTo(Long.valueOf(formId));
		if (ykReportMapper.selectByExample(example0)!=null&&ykReportMapper.selectByExample(example0).size()>0) {
			SysFormYkReport report = ykReportMapper.selectByExample(example0).get(0);
			return report;
		}
		return null;
		
	}
	
}
