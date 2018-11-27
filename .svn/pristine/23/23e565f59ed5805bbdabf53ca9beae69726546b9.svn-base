package com.myehr.service.impl.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.mapper.formmanage.button.QSysformCalculateSolutionMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonAddMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonCalculateMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonEditorMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonExportColumnMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonImportColumnMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonImportMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonIntrDetailMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonIntroduceMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonRemoveMapper;
import com.myehr.mapper.formmanage.button.SysFormButtonSaveMapper;
import com.myehr.mapper.formmanage.form.SysButtonRoleMapper;
import com.myehr.mapper.formmanage.form.SysExecSqlMapper;
import com.myehr.mapper.formmanage.form.SysFormButtonExpandMapper;
import com.myehr.mapper.formmanage.form.SysFormButtonMapper;
import com.myehr.mapper.sysUserRole.SysUserRoleMapper;
import com.myehr.pojo.formmanage.button.QSysformCalculateSolution;
import com.myehr.pojo.formmanage.button.QSysformCalculateSolutionExample;
import com.myehr.pojo.formmanage.button.SysFormButtonAdd;
import com.myehr.pojo.formmanage.button.SysFormButtonAddExample;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculate;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculateExample;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorExample;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import com.myehr.pojo.formmanage.button.SysFormButtonExportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonExportColumnExample;
import com.myehr.pojo.formmanage.button.SysFormButtonImport;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumnExample;
import com.myehr.pojo.formmanage.button.SysFormButtonImportExample;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetail;
import com.myehr.pojo.formmanage.button.SysFormButtonIntrDetailExample;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduce;
import com.myehr.pojo.formmanage.button.SysFormButtonIntroduceExample;
import com.myehr.pojo.formmanage.button.SysFormButtonRemove;
import com.myehr.pojo.formmanage.button.SysFormButtonRemoveExample;
import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.button.SysFormButtonSaveExample;
import com.myehr.pojo.formmanage.form.SysButtonRole;
import com.myehr.pojo.formmanage.form.SysButtonRoleExample;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysExecSqlExample;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormButtonExample;
import com.myehr.pojo.sysUserRole.SysUserRole;
import com.myehr.pojo.sysUserRole.SysUserRoleExample;
import com.myehr.service.formmanage.form.IButtonService;

public class ButtonServiceImpl implements IButtonService {
	private static Logger logger = LoggerFactory.getLogger(ButtonServiceImpl.class);
	@Autowired
	SysFormButtonExpandMapper expandMapper ;
	
	@Autowired
	SysFormButtonMapper mapper;
	
	@Autowired
	SysUserRoleMapper sysUserRoleMapper;
	
	@Autowired
	SysButtonRoleMapper sysButtonRoleMapper;
	
	@Autowired
	SysExecSqlMapper esqlMaper ;
	
	@Autowired
	SysFormButtonEditorMapper sysFormButtonEditorMapper;
	
	@Autowired
	SysFormButtonSaveMapper saveBtnMapper;
	
	@Autowired
	SysFormButtonAddMapper addBtnMapper;
	
	@Autowired
	SysFormButtonRemoveMapper removeBtnMapper;
	
	@Autowired
	SysFormButtonCalculateMapper calculateBtnMapper;
	
	@Autowired
	SysFormButtonImportMapper sysFormButtonImportMapper;
	
	@Autowired
	SysFormButtonImportColumnMapper sysFormButtonImportColumnMapper;
	
	@Autowired
	SysFormButtonExportColumnMapper sysFormButtonExportColumnMapper;
	
	@Autowired
	private QSysformCalculateSolutionMapper qCulateSolutionMapper;
	
	@Autowired
	private SysFormButtonIntroduceMapper sIntroduceMapper;
	
	@Autowired
	private SysFormButtonIntrDetailMapper sIntrDetailMapper;

	
	@Override
	public String saveButtonToCardForm(List<Map> objs) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysFormButton> queryFormButton(String fromId, String fromPartition) {
		// TODO Auto-generated method stub
		/*if (request==null) {
			String userId = request.getSession().getAttribute("userid")+"";
			SysUserRoleExample userRoleExample = new SysUserRoleExample();
			userRoleExample.or().andUserIdEqualTo(Integer.parseInt(userId));
			List<SysUserRole> userRoless = sysUserRoleMapper.selectByExample(userRoleExample);
			
			List<BigDecimal> roleIdValues=new ArrayList<BigDecimal>();
			for (int i = 0; i < userRoless.size(); i++) {
				roleIdValues.add(new BigDecimal(userRoless.get(i).getRoleId()));
			}
			
			SysButtonRoleExample buttonRoleExample = new SysButtonRoleExample();
			buttonRoleExample.or().andRoleIdIn(roleIdValues).andFormIdEqualTo(new BigDecimal(fromId));
			List<SysButtonRole> buttonRoless = sysButtonRoleMapper.selectByExample(buttonRoleExample);
			
			
			List<BigDecimal> buttonIdValues=new ArrayList<BigDecimal>();
			for (int i = 0; i < buttonRoless.size(); i++) {
				buttonIdValues.add(buttonRoless.get(i).getButtonId());
			}
			
			SysFormButtonExample example = new SysFormButtonExample();
			example.setOrderByClause("FORM_BUTTON_SORT");
			if (buttonRoless.size()>0) {
				example.or().andFormButtonFormDefIdEqualTo(new BigDecimal(fromId)).andFormButtonIdIn(buttonIdValues);
				return mapper.selectByExample(example);
			} else {
				example.or().andFormButtonFormDefIdEqualTo(new BigDecimal(fromId));
				return mapper.selectByExample(example);
			}
			
			
		}else {*/
			SysFormButtonExample example = new SysFormButtonExample();
			example.setOrderByClause("FORM_BUTTON_SORT");
			example.or().andFormButtonFormDefIdEqualTo(new BigDecimal(fromId));
			return mapper.selectByExample(example);
		/*}*/
		// TODO 自动生成方法存根
		/*CriteriaType criteria = CriteriaType.FACTORY.create();
		criteria.set_entity("com.dcf.form.formbuttondataset.QSysFormButton");
		criteria.set("_expr[1]/_property", "formButtonFormDefId");
		criteria.set("_expr[1]/_value", fromId);
		criteria.set("_orderby[1]/_property", "formButtonSort");
		IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
		DataObject[] objs = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, ida);
		return objs;*/
	}
	
	@Override
	public List<Map> queryFormButtonWithUserId(String fromId,String userId) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT FORMBUTTONCODE as formButtonCode,MIN(POWERTYPE) as powerType FROM ( SELECT FORM_BUTTON_CODE as formButtonCode,1 powerType FROM sys_form_button WHERE FORM_BUTTON_ID IN ( "+
				 " 		SELECT button_ID FROM sys_button_role WHERE ROLE_ID IN ( "+
				 " 		SELECT ROLE_ID FROM SYS_USER_ROLE WHERE USER_ID = "+userId+") "+
				 " AND FORM_ID = "+fromId+" AND FORM_BUTTON_TYPE = 1 "+
				 " ) "+
				 " union "+
				 " SELECT FORM_BUTTON_CODE as formButtonCode,2 powerType FROM sys_form_button WHERE FORM_BUTTON_ID IN ( "+
				 " SELECT button_ID FROM sys_button_role WHERE ROLE_ID IN ( "+
				 " 		SELECT ROLE_ID FROM SYS_USER_ROLE WHERE USER_ID = "+userId+") "+
				 " AND FORM_ID = "+fromId+" AND FORM_BUTTON_TYPE = 2 "+
				 " ) "+
				 " union "+
				 " SELECT FORM_BUTTON_CODE as formButtonCode,3 powerType FROM sys_form_button WHERE FORM_BUTTON_ID IN ( "+
				 " SELECT button_ID FROM sys_button_role WHERE ROLE_ID IN ( "+
				 " 		SELECT ROLE_ID FROM SYS_USER_ROLE WHERE USER_ID = "+userId+") "+
				 " AND FORM_ID = "+fromId+" AND FORM_BUTTON_TYPE = 3 "+
				 " ) "+
				 " union "+
				 " SELECT FORM_BUTTON_CODE as formButtonCode,4 powerType FROM sys_form_button WHERE FORM_BUTTON_ID IN ( "+
				 " SELECT button_ID FROM sys_button_role WHERE ROLE_ID IN ( "+
				 " 		SELECT ROLE_ID FROM SYS_USER_ROLE WHERE USER_ID = "+userId+") "+
				 " AND FORM_ID = "+fromId+" AND FORM_BUTTON_TYPE = 4 "+
				 " ) "+
				 " union "+
				 " SELECT FORM_BUTTON_CODE as formButtonCode,0 powerType FROM sys_form_button WHERE FORM_BUTTON_FORM_DEF_ID = "+fromId+" and FORM_BUTTON_ID not IN ( "+
				 " SELECT button_ID FROM sys_button_role WHERE ROLE_ID IN ( "+
				 "       SELECT ROLE_ID FROM SYS_USER_ROLE WHERE USER_ID = "+userId+") "+
				 " AND FORM_ID = "+fromId+" "+
				 " ) )B GROUP BY FORMBUTTONCODE";
		List<Map> dataObject;
		try {
			dataObject = MybatisUtil.queryList("runtime.selectSql", sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
			throw new DcfException(e);
		}
		/*SysUserRoleExample userRoleExample = new SysUserRoleExample();
		userRoleExample.or().andUserIdEqualTo(Integer.parseInt(userId));
		List<SysUserRole> userRoless = sysUserRoleMapper.selectByExample(userRoleExample);
		
		List<BigDecimal> roleIdValues=new ArrayList<BigDecimal>();
		for (int i = 0; i < userRoless.size(); i++) {
			roleIdValues.add(new BigDecimal(userRoless.get(i).getRoleId()));
		}
		
		SysButtonRoleExample buttonRoleExample = new SysButtonRoleExample();
		buttonRoleExample.or().andRoleIdIn(roleIdValues).andFormIdEqualTo(new BigDecimal(fromId));
		List<SysButtonRole> buttonRoless = sysButtonRoleMapper.selectByExample(buttonRoleExample);
		
		
		List<BigDecimal> buttonIdValues=new ArrayList<BigDecimal>();
		for (int i = 0; i < buttonRoless.size(); i++) {
			buttonIdValues.add(buttonRoless.get(i).getButtonId());
		}
		
		SysFormButtonExample example = new SysFormButtonExample();
		example.setOrderByClause("FORM_BUTTON_SORT");
		if (buttonRoless.size()>0) {
			example.or().andFormButtonFormDefIdEqualTo(new BigDecimal(fromId)).andFormButtonIdNotIn(buttonIdValues);
			return mapper.selectByExample(example);
		} else {
			example.or().andFormButtonFormDefIdEqualTo(new BigDecimal(fromId));
			return mapper.selectByExample(example);
		}*/
		return dataObject;
	}

	@Override
	public String saveButtonExt_save(Map obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveExportButtonColumn(List<Map> objs, long buttonId)
			throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveButtonCalculate(Map calculate, List<Map> caculateSolution)
			throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveExportButton(Map obj) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveImportButton(Map obj, List<Map> importColumns)
			throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysFormButtonSave queryButtonExt_saveByButtonId(String buttonId) {
		// TODO Auto-generated method stub
		// TODO 自动生成方法存根
		SysFormButtonSaveExample example = new SysFormButtonSaveExample();
		example.or().andButtonSaveButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonSave> list = saveBtnMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		logger.info("info:按钮ID为:"+buttonId+",找不到对应保存按钮信息(SysFormButtonSave)");
		return null;
	}

	@Override
	public List<QSysformCalculateSolution> queryCalculateSoluton(String calculateId) {
		
		QSysformCalculateSolutionExample example = new QSysformCalculateSolutionExample();
		QSysformCalculateSolutionExample.Criteria criteria =  example.createCriteria();
		criteria.andCalculateIdEqualTo(new BigDecimal(calculateId));
		example.setOrderByClause("SORT");
		List<QSysformCalculateSolution> objs = qCulateSolutionMapper.selectByExample(example);
		return objs;
	}

	@Override
	public SysFormButtonCalculate queryButtonCalculate(String buttonId) {
		// TODO Auto-generated method stub
		// TODO 自动生成方法存根
		//SysFormButtonCa
		SysFormButtonCalculateExample example = new SysFormButtonCalculateExample();
		SysFormButtonCalculateExample.Criteria criteria = example.createCriteria();
		criteria.andCalculateButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonCalculate> list =  calculateBtnMapper.selectByExample(example);
		if(list.size()>0){
			return list.get(0);
		}
		
		
		
		/*
		CriteriaType criteria = CriteriaType.FACTORY.create();
		criteria.set_entity("com.dcf.form.formbuttondataset.SysFormButtonCalculate");
		criteria.set("_expr[1]/_property", "calculateButtonId");
		criteria.set("_expr[1]/_value", buttonId);
		IDASCriteria ida = getDASTemplate().criteriaTypeToDASCriteria(criteria);
		DataObject[] objs = getDASTemplate().queryEntitiesByCriteriaEntity(DataObject.class, ida);
		if (objs != null && objs.length > 0) {
			return objs[0];
		}*/
		
		
		
		return null;
		
		
	}

	@Override
	public SysFormButtonAdd queryButtonAddOrEditButtonByButtonId(String buttonId) {
		// TODO Auto-generated method stub
		SysFormButtonAddExample example = new SysFormButtonAddExample();
		example.or().andButtonAddButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonAdd> list = addBtnMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		logger.info("info:按钮ID为:"+buttonId+",找不到对应新增按钮信息(SysFormButtonAdd)");
		return null;
	}

	@Override
	public SysExecSql queryButtonExecSqlById(String buttonExecSqlType, String buttonId) {
		// TODO Auto-generated method stub
		SysExecSqlExample example = new SysExecSqlExample();
		example.or().andExecSqlTypeEqualTo(buttonExecSqlType).andExecSqlRelaidEqualTo(new Long(buttonId));
		List<SysExecSql> list = esqlMaper.selectByExample(example);
		if(list.size()==0){
			logger.info("info:按钮ID为 ："+buttonId+" ,按钮sql执行类型为："+buttonExecSqlType+" 无对应执行SysExecSql 结果集！");
			return null;
		}else {
			return list.get(0);
		}
	}
	
	
	@Override
	public SysFormButtonEditorWithBLOBs queryButtonEditorById(String buttonExecSqlType, String buttonId) {
		// TODO Auto-generated method stub
		SysFormButtonEditorExample example = new SysFormButtonEditorExample();
		//example.or().andExecSqlTypeEqualTo(buttonExecSqlType).andExecSqlRelaidEqualTo(new Long(buttonId));
		example.or().andButtonEditorModelButtonidEqualTo(new Long(buttonId));
		List<SysFormButtonEditorWithBLOBs> list = sysFormButtonEditorMapper.selectByExampleWithBLOBs(example);
		if(list.size()==0){
			logger.info("info:按钮ID为 ："+buttonId+" ,按钮sql执行类型为："+buttonExecSqlType+" 无对应执行SysExecSql 结果集！");
			return null;
		}else {
			return list.get(0);
		}
	}

	@Override
	public Map getExportButtonExt(String buttonId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysFormButtonImport getImportButtonExt(String buttonId) {
		// TODO Auto-generated method stub
		SysFormButtonImportExample example = new SysFormButtonImportExample();
		example.or().andFormButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonImport> list = sysFormButtonImportMapper.selectByExample(example);
		if(list.size()==0){
			logger.info("info:按钮ID为 ："+buttonId);
			return null;
		}else {
			return list.get(0);
		}
	}

	@Override
	public List<Map> getExportButtonColumns(long buttonId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysFormButtonImportColumn> getImportButtonColumnconfig(String buttonId) {
		// TODO Auto-generated method stub
		SysFormButtonImportColumnExample example = new SysFormButtonImportColumnExample();
		example.or().andImportColumnButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonImportColumn> list = sysFormButtonImportColumnMapper.selectByExample(example);
		return list;
	}
	
	@Override
	public List<SysFormButtonExportColumn> getExportButtonColumnconfig(String buttonId) {
		// TODO Auto-generated method stub
		SysFormButtonExportColumnExample example = new SysFormButtonExportColumnExample();
		example.or().andExportColumnButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonExportColumn> list = sysFormButtonExportColumnMapper.selectByExample(example);
		return list;
	}

	@Override
	public List<Map> getExportColumnconfigs(String buttonId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> queryButtonParam(String buttonAddId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysFormButtonRemove queryButtomRemov(String buttonId) {
		// TODO Auto-generated method stub
		SysFormButtonRemoveExample example = new SysFormButtonRemoveExample();
		example.or().andButtonRemoveButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonRemove> list = removeBtnMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		logger.info("info:按钮ID为:"+buttonId+",找不到对应删除按钮信息(SysFormButtonRemove)");
		return null;
	}

	@Override
	public List<Map> queryCalculateIdByButtonId(String formId, String buttonId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map queryExecSql(String execSqlType, Long execSqlRelaid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long saveExecSql(Map sql) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysExecSql queryButtonExecSqlById(long exeSqlId) {
		//long execSqlId = sql.getLong("execSqlId");
		return esqlMaper.selectByPrimaryKey(new BigDecimal(exeSqlId));
	}
	
	@Override
	public SysFormButtonEditorWithBLOBs queryButtonEditorById(long exeSqlId) {
		//long execSqlId = sql.getLong("execSqlId");
		return sysFormButtonEditorMapper.selectByPrimaryKey(exeSqlId);
	}

	@Override
	public void saveButtonIntroduce(Map entity, List<Map> datas)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public SysFormButtonIntroduce queryIntroduceByButtonId(long buttonId) {
		// TODO Auto-generated method stub
		SysFormButtonIntroduceExample example = new SysFormButtonIntroduceExample();
		example.or().andIntroduceButtonIdEqualTo(new BigDecimal(buttonId));
		List<SysFormButtonIntroduce> objs = sIntroduceMapper.selectByExample(example);
		if (objs.size()>0) {
			return objs.get(0);
		}
		return null;
	}

	@Override
	public List<SysFormButtonIntrDetail> queryIntroduceDetailByIntroduceId(long introduceId) {
		// TODO Auto-generated method stub
		SysFormButtonIntrDetailExample example = new SysFormButtonIntrDetailExample();
		example.or().andIntroduceIdEqualTo(new BigDecimal(introduceId));
		List<SysFormButtonIntrDetail> objs = sIntrDetailMapper.selectByExample(example);
		return objs;
	}

	@Override
	public String querySolutionFormId(String solutionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map> getImportColumnconfigs(String buttonId) {
		// TODO Auto-generated method stub
		return null;
	}

}
