  package com.myehr.controller.field;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.ResultMap;
import com.myehr.common.util.ResultMapNew;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.form.parambean.SaveButtonParams;
import com.myehr.mapper.datafield.DatafieldMapper;
import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.field.SysFieldMapper;
import com.myehr.mapper.field.SysFieldRuleMapper;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.field.DataField;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldRule;
import com.myehr.pojo.field.SysFieldRuleExample;
import com.myehr.service.field.FieldService;
import com.myehr.service.impl.field.FieldServiceImpl;
import com.myehr.service.impl.formmanage.form.SysformconfigService;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;


@Controller
@RequestMapping("/FieldList")
public class FieldController {
	private static Logger logger = LoggerFactory.getLogger(FieldController.class);
//	@Autowired
	@Resource(name = "FieldService") 
	FieldService fServiceImpl;
//	@Autowired
	@Resource(name = "PrimaryKeyService") 
	private PrimaryKeyService pImpl;
	@Autowired
	SysEntityMapper sEntityMapper;
	@Autowired
	SysFieldMapper sFieldMapper;
	@Autowired
	DatafieldMapper datafieldMapper;
	@Autowired
	SysformconfigService sysformconfigService;
	@Autowired
	SysFieldRuleMapper sysFieldRuleMapper;
	//查询所有数据
	@RequestMapping("/findFieldList")
	 public @ResponseBody ResultMap findFieldList(HttpServletRequest request) throws Exception {
	        try {  
	            return fServiceImpl.getAllFieldMysql(request);  
	        } catch (Exception e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        }  
	        return null; 
	}
	
	//保存修改
	@RequestMapping("/saveFields")
	 public @ResponseBody Object saveFields(HttpServletRequest request) throws Exception {
		int reCode = 2;
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysField> sFields = JSONArray.toList(jArray,new SysField(), new JsonConfig()); 
		String useridString = (String)(request.getSession().getAttribute("userid")+"");
		int entityId = sFields.get(0).getFieldEntityId().intValue();
		String entityCode = sEntityMapper.selectByPrimaryKey(entityId).getEntityCode();
		for (SysField sField : sFields) {
			sField.setOperatorName(useridString);
			sField.setOperatorTime(new Date());
			if (sField.getFieldId()!=null&&!sField.getFieldId().equals("")) {
				sField.setFieldTablename(ChangeCode.getUniqueCode(entityCode, sField.getFieldCode()));
				//sField.setFieldTablename(sField.getFieldCode());
				reCode=sFieldMapper.updateByPrimaryKey(sField);
			} else {
				sField.setFieldTablename(ChangeCode.getUniqueCode(entityCode, sField.getFieldCode()));
				//sField.setFieldTablename(sField.getFieldCode());
				reCode=sFieldMapper.insert(sField);
			}
			
		}
        return reCode;
	}
	
	//保存修改
	@RequestMapping("/saveDataAndCreate")
	 public @ResponseBody Object saveDataAndCreate(HttpServletRequest request) throws Exception {
		int reCode = 2;
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysField> sFields = JSONArray.toList(jArray,new SysField(), new JsonConfig()); 
		String useridString = (String)(request.getSession().getAttribute("userid")+"");
		int entityId = sFields.get(0).getFieldEntityId().intValue();
		String entityCode = sEntityMapper.selectByPrimaryKey(entityId).getEntityCode();
		for (SysField sField : sFields) {
			sField.setOperatorName(useridString);
			sField.setOperatorTime(new Date());
			//sField.setFieldTablename(ChangeCode.getUniqueCode(entityCode, sField.getFieldCode()));
			sField.setFieldTablename(sField.getFieldCode());
			reCode=sFieldMapper.insert(sField);
			fServiceImpl.insertField(sField);
		}
        return reCode;
	}
		
	//添加数据
	@RequestMapping("/insertField")
	public @ResponseBody Object insertField(HttpServletRequest request) throws Exception{
		//新建实体表数据
		SysField sField = (SysField) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysField.class);
		sField.setFieldId(new BigDecimal(pImpl.getPrimaryKey("sys_field", "FIELD_ID")));
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		sField.setOperatorTime(currentDate);
        String reCode = fServiceImpl.insertSysField(sField);//向字段表插数据
        if(reCode.equals("0")){
        	String reCode2 = fServiceImpl.insertField(sField);//向数据表中插字段
        	return reCode2;
        }else {
        	return reCode;
		} 
    }
	//删除实体字段表数据
	@RequestMapping("/removeField")
	public @ResponseBody Object removeField(HttpServletRequest request,@RequestBody SysField field) throws Exception{
        int reCode = 11;
        SysField field2 = sFieldMapper.selectByPrimaryKey(field.getFieldId());
        if(field.getDeleteMark().equals("N")){
        	SysEntity sEntity=sEntityMapper.selectByPrimaryKey(Integer.valueOf(field.getFieldEntityId().toString()));
			if(field2.getFieldIsKey().equals("Y")){
				reCode = 2;//主键不能删除
			}else {
				field2.setDeleteMark("Y");
	        	reCode = sFieldMapper.updateByPrimaryKey(field2);
			}
        }else {
            reCode = sFieldMapper.deleteByPrimaryKey(field.getFieldId());
		}
        return reCode;
    }
	//恢复删除的实体字段表数据
	@RequestMapping("/recoverField")
	public @ResponseBody Object recoverField(HttpServletRequest request,@RequestBody SysField field) throws Exception{
        int reCode = 11;
        SysField field2 = sFieldMapper.selectByPrimaryKey(field.getFieldId());
        field2.setDeleteMark("N");
        field2.setDeleteMarkBack("Y");
        reCode = sFieldMapper.updateByPrimaryKey(field2);
        return reCode;
    }
	
	//查询所有数据
	@RequestMapping("/findFieldListByTemplate")
	 public @ResponseBody ResultMap findFieldListByTemplate(HttpServletRequest request) throws Exception {
	        try {  
	            return fServiceImpl.getAllFieldListByTemplate(request);  
	        } catch (Exception e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        }  
	        return null; 
	}
	
	//查询所有数据
	@RequestMapping("/findFieldListByEntityId")
	public @ResponseBody ResultMapNew findFieldListByEntityId(HttpServletRequest request,@RequestBody CardformInitDataParams params) throws Exception {
		Map requestParam = params.getRequestParam();
		String entityId = requestParam.get("entityId")+"";
		String sql = " select sys_field.field_id as fieldId," +
				" sys_field.field_entity_id as fieldEntityId," +
				" sys_field.field_code as fieldCode," +
				" sys_field.field_china_name as fieldName" +
				" from sys_field where sys_field.field_entity_id = "+entityId;
		List<Map> datas= MybatisUtil.queryList("runtime.selectSql", sql);
		ResultMapNew resultMap = new ResultMapNew();
		resultMap.setRows(datas);
		resultMap.setTotal(datas.size());
		return resultMap; 
	}
		
	//搜索标准数据
	@RequestMapping("/findStandardsFieldList")
	public @ResponseBody ResultMap findStandardsFieldList(HttpServletRequest request) throws Exception{
		ResultMap resultMap=fServiceImpl.findStandardsFieldListMssql(request);
		return resultMap;
	}
		
	//引入字段
	@RequestMapping("/leadStandartsField")
	public @ResponseBody Object leadStandartsField(HttpServletRequest request) throws Exception{
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<DataField> dataFields = JSONArray.toList(jArray,new DataField(), new JsonConfig());
		String reCode = fServiceImpl.insertStandartsField(dataFields);
		return reCode;
	}
	//引入字段2
	@RequestMapping("/leadStandartsField2")
	public @ResponseBody Object leadStandartsField2(HttpServletRequest request,@RequestBody List<SysField> sList) throws Exception{
		//JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		//@SuppressWarnings("unchecked")
		//List<SysField> sList = JSONArray.toList(jArray,new SysField(), new JsonConfig());
		int entityId = Integer.valueOf(sList.get(0).getFieldEntityId().toString());
		String reCode = "";
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());		
		String useridString = (String)(request.getSession().getAttribute("userid")+"");		
		String entityCode = sEntityMapper.selectByPrimaryKey(entityId).getEntityCode();
		for (SysField sysField : sList) {
			sysField.setFieldEntityId(new BigDecimal(entityId));
			sysField.setFieldTablename(ChangeCode.getUniqueCode(entityCode, sysField.getFieldCode()));
			if(sysField.getFieldDataType()!=null){
				sysField.setFieldDataType(sysField.getFieldDataType().toUpperCase());
			}
			sysField.setOperatorTime(currentDate);
			sysField.setOperatorName(useridString);
			reCode = fServiceImpl.insertSysField(sysField);
		}
		return reCode;
	}	
		
	//搜索字段根据表明	
	@RequestMapping("/findFieldByEntityCode")
	public @ResponseBody ResultMap findFieldByEntityCode(HttpServletRequest request) throws Exception{
		ResultMap resultMap=fServiceImpl.findFieldByEntityCodeMssql(request);
		return resultMap;
	}
	
	//搜索字段根据表明	
	@RequestMapping("/findDatafield")
	public @ResponseBody ResultMapNew findDatafield(HttpServletRequest request) throws Exception{
		ResultMapNew resultMap = new ResultMapNew();
		String sql = "Select DT_ID as dtId, "
		+" FIELD_CODE as fieldCode,"
		+" FIELD_NAME as fieldName,"
		+"       (case"
		+"         when SYS_EXEC_SQL.exec_sql_id is not null then"
		+"          '已编写脚本'"
		+"         else"
		+"          '未编写脚本'"
		+"       end) execSql"
		+" from DATAFIELD left join SYS_EXEC_SQL on DATAFIELD.DT_ID = SYS_EXEC_SQL.EXEC_SQL_RELAID and SYS_EXEC_SQL.EXEC_SQL_TYPE = 'datafield_exec_sql'";
		
		List<Map> rs = MybatisUtil.queryList("runtime.selectSql", sql);
		resultMap.setRows(rs);
		resultMap.setTotal(rs.size());
		return resultMap;
	}
	
	@RequestMapping("/queryFieldRule")
	public @ResponseBody ResultMapNew queryFieldRule(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
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
		
		String sql = "select * from SYS_FIELD_RULE where 1=1 ";
		List<Map> rules = MybatisUtil.queryList("runtime.selectSql", sql);
		
		ResultMapNew resultMap=new ResultMapNew();
		
		List<Map> ruleList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>rules.size()) {
			end = rules.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			ruleList.add(rules.get(i));
		}

		resultMap.setTotal(rules.size());
		resultMap.setRows(ruleList);
		return resultMap;
	}
	
	@RequestMapping("/deleteFieldRule")
	public void deleteFieldRule(HttpServletRequest request, @RequestBody List<SysFieldRule> rules) throws Exception{
		for (SysFieldRule sysFieldRule : rules) {
			sysFieldRuleMapper.deleteByPrimaryKey(sysFieldRule.getFieldRuleId());
		}
	}
	
	@RequestMapping("/saveFieldRule")
	public @ResponseBody String saveFieldRule(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String userId = request.getSession().getAttribute("userid")+"";
		Map param = params.getParam();
		int reCode = 0;
		String fieldRuleId = (String) param.get("fieldRuleId");
		SysFieldRule fieldRule = new SysFieldRule();
		if (fieldRuleId==null || fieldRuleId=="") {
			fieldRule.setFieldRuleCode((String) param.get("fieldRuleCode"));
			fieldRule.setFieldRuleName((String) param.get("fieldRuleName"));
     		fieldRule.setFieldRulePrefix((String) param.get("fieldRulePrefix"));
     		fieldRule.setFieldRuleDigit((String) param.get("fieldRuleDigit"));
     		fieldRule.setFieldRuleRaise((String) param.get("fieldRuleRaise"));
			fieldRule.setOperatorName(userId);
			fieldRule.setOperatorTime(new Date());
			reCode = sysFieldRuleMapper.insert(fieldRule);
		}else {
			fieldRule.setFieldRuleId(Long.parseLong(fieldRuleId));
			fieldRule.setFieldRuleCode((String) param.get("fieldRuleCode"));
			fieldRule.setFieldRuleName((String) param.get("fieldRuleName"));
			fieldRule.setFieldRulePrefix((String) param.get("fieldRulePrefix"));
     		fieldRule.setFieldRuleDigit((String) param.get("fieldRuleDigit"));
     		fieldRule.setFieldRuleRaise((String) param.get("fieldRuleRaise"));
			fieldRule.setOperatorName(userId);
			fieldRule.setOperatorTime(new Date());
			reCode = sysFieldRuleMapper.updateByPrimaryKey(fieldRule);
		}
		return reCode+"";
	}
	
	@RequestMapping("/queryFieldRuleById")
	public @ResponseBody SysFieldRule queryFieldRuleById(HttpServletRequest request) throws Exception{
		
		String fieldRuleId = request.getParameter("fieldRuleId");
		SysFieldRuleExample example = new SysFieldRuleExample();
		example.or().andFieldRuleIdEqualTo(Long.valueOf(fieldRuleId));
		SysFieldRule fieldRule = sysFieldRuleMapper.selectByExample(example).get(0);
		return fieldRule;
	}
	
	@RequestMapping("/updateFieldWithFieldRule")
	public @ResponseBody String updateFieldWithFieldRule(HttpServletRequest request, @RequestBody UpdateFieldParams params) throws Exception{
		int reCode = 0;
		Map selectData = params.getSelectData();
		String fieldId = selectData.get("fieldId")+"";
		String fieldRuleId = selectData.get("fieldRuleId")+"";
		
		SysFieldRule SysFieldRule = sysFieldRuleMapper.selectByPrimaryKey(Long.parseLong(fieldRuleId));
		String rulePrefix = SysFieldRule.getFieldRulePrefix();
		String digit = SysFieldRule.getFieldRuleDigit();
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		String year1 = year+"";
		String month1 = "";
		if (month<10) {
			month1 = "0"+month;
		}
		String day1 = "";
		if (day < 10) {
			day1 = "0"+day;
		}
		logger.info(rulePrefix.replaceAll("\\[YYYY\\]", year1));
		if(rulePrefix.indexOf("[YYYY]")!=-1){
			rulePrefix=rulePrefix.replaceAll("\\[YYYY\\]", year1);
		}
		if(rulePrefix.indexOf("[MM]")!=-1){
			rulePrefix=rulePrefix.replaceAll("\\[MM\\]", month1);
		}
		if(rulePrefix.indexOf("[DD]")!=-1){
			rulePrefix=rulePrefix.replaceAll("\\[DD\\]", day1);
		}
		
		String fieldRuleName = selectData.get("fieldRuleName")+"";
		SysField sysField = sFieldMapper.selectByPrimaryKey(new BigDecimal(fieldId));
		
		SysEntity sysEntity = sEntityMapper.selectByPrimaryKey(sysField.getFieldEntityId().intValue());
		
		String sql = "select MAX(SUBSTRING("+sysField.getFieldCode()+","+(rulePrefix.length()+1)+","+digit+")) as fieldRuleMax from "+sysEntity.getEntityCode()+" where "+sysField.getFieldCode()+" like '"+rulePrefix+"%'";
		List<Map> objs = MybatisUtil.queryList("runtime.selectSql", sql);
		String fieldRuleMax = "";
		if (objs.size()>0) {
			if (objs.get(0).get("fieldRuleMax")==null) {
				fieldRuleMax = "0";
			}else{
				fieldRuleMax = objs.get(0).get("fieldRuleMax")+"";
			}
		}else {
			fieldRuleMax = "0";
		}
		
		sysField.setFieldRuleId(Long.parseLong(fieldRuleId));
		sysField.setFieldRuleName(fieldRuleName);
		sysField.setFieldRuleMax(Integer.parseInt(fieldRuleMax)+"");
		reCode =sFieldMapper.updateByPrimaryKey(sysField);
		
		return reCode+"";
	}
	
	@RequestMapping("/selectColumnWithFieldRule")
	public @ResponseBody List<Map> selectColumnWithFieldRule(HttpServletRequest request) throws Exception{
		String formId = request.getParameter("formId");
		return sysformconfigService.getColumnWithFieldRuleByFormId(formId);
	}
	
	public String getSting(int num) {
		String str = "";
		for (int i = 0; i < num; i++) {
			str+="0";
		}
		return str;
	}
	
	
		
	/*//恢复数据
	@RequestMapping("/recoverField")
	 public @ResponseBody Object recoverEntity(HttpServletRequest request) throws Exception {
        String reCode =new String();
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysField> sList = JSONArray.toList(jArray,new SysField(), new JsonConfig()); 
        for (SysField sysField : sList) {
				sysField.setDeleteMark("N");
				reCode = fServiceImpl.updateSysField(sysField);
		}
        return reCode;
	}*/
}
