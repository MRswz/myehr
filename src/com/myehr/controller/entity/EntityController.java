package com.myehr.controller.entity;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.myehr.common.util.CreateFileUtil;
import com.myehr.common.util.ExcelUtil;
import com.myehr.common.util.ExcelUtils;
import com.myehr.common.util.GetDBPropertiesValue;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.ResultMap;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.mapper.entity.SysEntityExpandMapper;
import com.myehr.mapper.entity.SysEntityFieldMappingMapper;
import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.entityexpand.EntityMapperExpand;
import com.myehr.mapper.field.SysFieldExpandMapper;
import com.myehr.mapper.field.SysFieldMapper;
import com.myehr.mapper.formmanage.widget.SysFileuploadMapper;
import com.myehr.mapper.sysParam.SysSourceMapper;
import com.myehr.mapper.validation.SysSoftwareValidationMapper;
import com.myehr.pojo.TreeModel;
import com.myehr.pojo.dict.SysDictEntryExpand;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.entity.SysEntityExample;
import com.myehr.pojo.entity.SysEntityExpand;
import com.myehr.pojo.entity.SysEntityFieldMapping;
import com.myehr.pojo.entity.SysEntityFieldMappingExample;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldExample;
import com.myehr.pojo.field.SysFieldExpand;
import com.myehr.pojo.formmanage.widget.SysFileupload;
import com.myehr.pojo.validation.SysSoftwareValidation;
import com.myehr.service.entity.EntityService;
import com.myehr.service.impl.entity.EntityServiceImpl;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.impl.sysdict.SysDictServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;

@Controller
@RequestMapping("/EntityList")
public class EntityController {
	private static Logger logger = LoggerFactory.getLogger(EntityController.class);
//	@Autowired
	@Resource(name = "EntityService")
	EntityService enServiceImpl;
//	@Autowired
	@Resource(name = "PrimaryKeyService") 
	private PrimaryKeyService pImpl;
	@Autowired
	private SysDictServiceImpl serviceImpl;
	@Autowired
	SysEntityMapper sMapper;
	@Autowired
	SysEntityExpandMapper sMapperExpand;
	@Autowired
	SysFieldMapper sFieldMapper;
	@Autowired
	SysFieldExpandMapper sFieldExpandMapper;
	@Autowired 
	private SysFileuploadMapper sysFileuploadMapper;
	@Autowired
	EntityMapperExpand eMapperExpand;
	@Autowired
	SysEntityFieldMappingMapper sysEntityFieldMappingMapper;
	@Autowired
	SysSourceMapper sysSourceMapper;
	@Autowired
	SysSoftwareValidationMapper sysSoftwareValidationMapper;
	
	//查询所有数据
	@RequestMapping("/findEntityList")
	 public @ResponseBody ResultMap findEntityList(HttpServletRequest request) throws Exception {
	        try {  
	            return enServiceImpl.getAllEntityMysql(request);  
	        } catch (Exception e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        }  
	        return null; 
	}
	
	@RequestMapping("/searchEntityListByTemplate")
	 public @ResponseBody ResultMap searchEntityListByTemplate(HttpServletRequest request) throws Exception {
	        try {  
	            return enServiceImpl.getAllEntityMsSqlByTemplate(request);  
	        } catch (Exception e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        }  
	        return null; 
	}
	
	//保存修改
	@RequestMapping("/saveEntity")
	 public @ResponseBody Object saveEntity(HttpServletRequest request) throws Exception {
		int reCode = 2;
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysEntity> sEntitys = JSONArray.toList(jArray,new SysEntity(), new JsonConfig()); 
		String useridString = (String)(request.getSession().getAttribute("userid")+"");
		for (SysEntity sysEntity : sEntitys) {
			sysEntity.setOperatorName(useridString);
			sysEntity.setOperatorTime(new Date());
			if (sysEntity.getEntityId()!=null&&!sysEntity.getEntityId().equals("")) {
				reCode=sMapper.updateByPrimaryKey(sysEntity);
			} else {
				reCode=sMapper.insert(sysEntity);
			}
		}
        return reCode;
	}
	/**
	 * 删除实体
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/deleteEntity")
	public @ResponseBody String[]  deleteEntity(HttpServletRequest request,@RequestBody SysEntity entity) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		if (entity.getDeleteMark().equals("N")) {
			SysEntity entity2 = sMapper.selectByPrimaryKey(entity.getEntityId());
			entity2.setDeleteMark("Y");
			sMapper.updateByPrimaryKey(entity2);
		} else {
			sMapper.deleteByPrimaryKey(entity.getEntityId());
			SysFieldExample example = new SysFieldExample();
			example.or().andFieldEntityIdEqualTo(new BigDecimal(entity.getEntityId()));
			sFieldMapper.deleteByExample(example);
		}
		
		
		return recode;
	}
	
	/**
	 * 验证实体字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/checkField")
	public @ResponseBody String[]  checkField(HttpServletRequest request,HttpServletResponse response,@RequestBody SysEntity entity) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		
		String sql = "select * from sys_field where (sys_field.field_code = 'pid' "+
		" or sys_field.field_code = 'pId' "+
		" or sys_field.field_code = 'p_id' "+
		" or sys_field.field_code = 'parent_code' "+
		" or sys_field.field_code = 'PANENT_CODE') "+
		" and sys_field.field_entity_id = "+entity.getEntityId();
		
		List<Map> datas= MybatisUtil.queryList("runtime.selectSql", sql);
		if (datas.size()>0) {
			recode[0] = datas.size()+"";
			recode[1] = datas.get(0).get("field_code")+"";
		}else {
			SysEntityFieldMappingExample example = new SysEntityFieldMappingExample();
			example.or().andEntityMappingCodeEqualTo(+entity.getEntityId()+"").andEntityFieldTypeEqualTo("pid");
			List<SysEntityFieldMapping> objs = sysEntityFieldMappingMapper.selectByExample(example);
			if (objs.size()>0) {
				recode[0] = objs.size()+"";
				recode[1] = objs.get(0).getEntityFieldNewCode();
			}
		}
		return recode;
	}
	
	/**
	 * 映射实体字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/chooseFieldMapping")
	public @ResponseBody String[]  chooseFieldMapping(HttpServletRequest request,HttpServletResponse response,@RequestBody SysField field) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		String type = request.getParameter("type");
		SysEntityFieldMappingExample example = new SysEntityFieldMappingExample();
		example.or().andEntityMappingCodeEqualTo(field.getFieldEntityId()+"").andEntityFieldTypeEqualTo(type);
		List<SysEntityFieldMapping> objs = sysEntityFieldMappingMapper.selectByExample(example);
		if (objs.size()>0) {
			
		}else {
			SysEntityFieldMapping obj = new SysEntityFieldMapping();
			obj.setEntityMappingCode(field.getFieldEntityId()+"");
			obj.setEntityFieldOldCode(field.getFieldCode());
			if (type.equals("id")) {
				obj.setEntityFieldNewCode("ID_NEW_MAPPING");
			}else {
				obj.setEntityFieldNewCode("PID_NEW_MAPPING");
			}
			
			obj.setEntityFieldType(type);
			sysEntityFieldMappingMapper.insert(obj);
		}
		return recode;
	}	
	
	/**
	 * 导出实体数据
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/exportField")
	public @ResponseBody String[]  exportField(HttpServletRequest request,HttpServletResponse response,@RequestBody SysEntity entity) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		
		SysEntity sysEntity = sMapper.selectByPrimaryKey(entity.getEntityId());
		
		SysEntityFieldMappingExample example = new SysEntityFieldMappingExample();
		example.or().andEntityMappingCodeEqualTo(entity.getEntityId()+"");
		List<SysEntityFieldMapping> objs1 = sysEntityFieldMappingMapper.selectByExample(example);
		
		String queryDataSql = "Select "+sysEntity.getEntityCode()+".*,'"+sysEntity.getEntityCode()+"' as entity_code from "+sysEntity.getEntityCode();
		String sql = "select a.name tablename,b.name fieldname,c.name fieldtype,c.length fieldlength from sysobjects a,syscolumns b,systypes c where a.id=b.id "+
				"and a.name='"+sysEntity.getEntityCode()+"' and a.xtype='U' and c.name<> 'sysname'"+
				"and b.xtype=c.xtype";
		List<Map> datas= MybatisUtil.queryList("runtime.selectSql", queryDataSql);
		List<Map> objs= MybatisUtil.queryList("runtime.selectSql", sql);
		
		for (int j = 0; j < datas.size(); j++) {
			for (int i = 0; i < objs1.size(); i++) {
				if ((datas.get(j).get("fieldCode")+"").equals(objs1.get(i).getEntityFieldOldCode())) {
					
				}
			}
		}
		
		LinkedHashMap<String,String> fieldMap = new LinkedHashMap<String,String>();
		for (int i = 0; i < objs.size(); i++) {
			fieldMap.put(objs.get(i).get("fieldname")+"", (objs.get(i).get("fieldtype")+":"+objs.get(i).get("fieldname")+""));
		}
		fieldMap.put("entity_code","entity_code");
		ExcelUtils.listToExcel(datas, fieldMap,"", sysEntity.getEntityCode()+"表数据", response);
		
		return recode;
	}	
	
	/**
	 * 导出实体字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/exportFieldAll")
	public @ResponseBody String[]  exportFieldAll(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		String  entityCodes = request.getParameter("entityCodes");
		entityCodes = entityCodes.substring(0, entityCodes.length()-1);
		
		List<SysFieldExpand> sysFields = sFieldExpandMapper.queryAllExportField(entityCodes);
		String sql = "select a.name tablename,b.name fieldname,c.name fieldtype,c.length fieldlength from sysobjects a,syscolumns b,systypes c where a.id=b.id "+
				"and a.name='sys_field' and a.xtype='U' and c.name<> 'sysname'"+
				"and b.xtype=c.xtype";
		List<Map> objs= MybatisUtil.queryList("runtime.selectSql", sql);
		LinkedHashMap<String,String> fieldMap = new LinkedHashMap<String,String>();
		for (int i = 0; i < objs.size(); i++) {
			fieldMap.put(objs.get(i).get("fieldname")+"", (objs.get(i).get("fieldtype")+":"+objs.get(i).get("fieldname")+""));
		}
		fieldMap.put("entity_code","entity_code");
		ExcelUtils.listToExcel(sysFields, fieldMap,"", "数据结构字段表", response);
		
		return recode;
	}	
	
	/**
	 * 导出实体字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/exportFieldByEntityId")
	public @ResponseBody String[]  exportFieldByEntityId(HttpServletRequest request,HttpServletResponse response,@RequestBody SysEntity entity) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		entity = sMapper.selectByPrimaryKey(entity.getEntityId());
		String entityCode = "'"+entity.getEntityCode()+"'";
		
		SysEntityFieldMappingExample example = new SysEntityFieldMappingExample();
		example.or().andEntityMappingCodeEqualTo(entity.getEntityId()+"");
		List<SysEntityFieldMapping> objs1 = sysEntityFieldMappingMapper.selectByExample(example);
		
		List<SysFieldExpand> sysFields = sFieldExpandMapper.queryAllExportField(entityCode);
		SysFieldExpand newIdField = new SysFieldExpand();
		SysFieldExpand newPidField = new SysFieldExpand();
		for (int i = 0; i < sysFields.size(); i++) {
			String fieldCode = sysFields.get(i).getFieldCode();
			for (int j = 0; j < objs1.size(); j++) {
				String oldCode = objs1.get(j).getEntityFieldOldCode();
				String newCode = objs1.get(j).getEntityFieldNewCode();
				String type = objs1.get(j).getEntityFieldType();
				if (oldCode.equals(fieldCode)) {
					if (type.equals("id")) {
						newIdField.setApproveName(sysFields.get(i).getApproveName());
						newIdField.setApproveTime(sysFields.get(i).getApproveTime());
						newIdField.setControlType(sysFields.get(i).getControlType());
						newIdField.setDeleteMark(sysFields.get(i).getDeleteMark());
						newIdField.setDeleteMarkBack(sysFields.get(i).getDeleteMarkBack());
						newIdField.setDictCode(sysFields.get(i).getDictCode());
						newIdField.setEntityCode(sysFields.get(i).getEntityCode());
						newIdField.setFieldChinaName(sysFields.get(i).getFieldChinaName());
						newIdField.setFieldCode(newCode);
						newIdField.setFieldDataType(sysFields.get(i).getFieldDataType());
						newIdField.setFieldDict(sysFields.get(i).getFieldDict());
						newIdField.setFieldEntityId(sysFields.get(i).getFieldEntityId());
						newIdField.setFieldId(sysFields.get(i).getFieldId());
						newIdField.setFieldIsBusKey(sysFields.get(i).getFieldIsBusKey());
						newIdField.setFieldIsKey(sysFields.get(i).getFieldIsKey());
						newIdField.setFieldIsLog(sysFields.get(i).getFieldIsLog());
						newIdField.setFieldIsMark(sysFields.get(i).getFieldIsMark());
						newIdField.setFieldIsNull(sysFields.get(i).getFieldIsNull());
						newIdField.setFieldLen(sysFields.get(i).getFieldLen());
						newIdField.setFieldSort(sysFields.get(i).getFieldSort());
						newIdField.setFieldState(sysFields.get(i).getFieldState());
						newIdField.setFieldTablename(sysFields.get(i).getFieldTablename());
						newIdField.setFieldType(sysFields.get(i).getFieldType());
						newIdField.setOperatorName(sysFields.get(i).getOperatorName());
						newIdField.setOperatorTime(sysFields.get(i).getOperatorTime());
					}else {
						newPidField.setApproveName(sysFields.get(i).getApproveName());
						newPidField.setApproveTime(sysFields.get(i).getApproveTime());
						newPidField.setControlType(sysFields.get(i).getControlType());
						newPidField.setDeleteMark(sysFields.get(i).getDeleteMark());
						newPidField.setDeleteMarkBack(sysFields.get(i).getDeleteMarkBack());
						newPidField.setDictCode(sysFields.get(i).getDictCode());
						newPidField.setEntityCode(sysFields.get(i).getEntityCode());
						newPidField.setFieldChinaName(sysFields.get(i).getFieldChinaName());
						newPidField.setFieldCode(newCode);
						newPidField.setFieldDataType(sysFields.get(i).getFieldDataType());
						newPidField.setFieldDict(sysFields.get(i).getFieldDict());
						newPidField.setFieldEntityId(sysFields.get(i).getFieldEntityId());
						newPidField.setFieldId(sysFields.get(i).getFieldId());
						newPidField.setFieldIsBusKey(sysFields.get(i).getFieldIsBusKey());
						newPidField.setFieldIsKey(sysFields.get(i).getFieldIsKey());
						newPidField.setFieldIsLog(sysFields.get(i).getFieldIsLog());
						newPidField.setFieldIsMark(sysFields.get(i).getFieldIsMark());
						newPidField.setFieldIsNull(sysFields.get(i).getFieldIsNull());
						newPidField.setFieldLen(sysFields.get(i).getFieldLen());
						newPidField.setFieldSort(sysFields.get(i).getFieldSort());
						newPidField.setFieldState(sysFields.get(i).getFieldState());
						newPidField.setFieldTablename(sysFields.get(i).getFieldTablename());
						newPidField.setFieldType(sysFields.get(i).getFieldType());
						newPidField.setOperatorName(sysFields.get(i).getOperatorName());
						newPidField.setOperatorTime(sysFields.get(i).getOperatorTime());
					}
					
				}
			}
		}
		sysFields.add(newIdField);
		sysFields.add(newPidField);
		
		String sql = "select a.name tablename,b.name fieldname,c.name fieldtype,c.length fieldlength from sysobjects a,syscolumns b,systypes c where a.id=b.id "+
				"and a.name='sys_field' and a.xtype='U' and c.name<> 'sysname'"+
				"and b.xtype=c.xtype";
		List<Map> objs= MybatisUtil.queryList("runtime.selectSql", sql);
		LinkedHashMap<String,String> fieldMap = new LinkedHashMap<String,String>();
		for (int i = 0; i < objs.size(); i++) {
			fieldMap.put(objs.get(i).get("fieldname")+"", (objs.get(i).get("fieldtype")+":"+objs.get(i).get("fieldname")+""));
		}
		fieldMap.put("entity_code","entity_code");
		ExcelUtils.listToExcel(sysFields, fieldMap,"", "数据结构字段表", response);
		
		return recode;
	}	
	
	/**
	 * 导出实体
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/exportEntity")
	public @ResponseBody String[]  exportEntity(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		String  entityCodes = request.getParameter("entityCodes");
		entityCodes = entityCodes.substring(0, entityCodes.length()-1);
		
		List<SysEntityExpand> sysEntitys = sMapperExpand.selectEntityWithKey(entityCodes);
		String sql1 = "select a.name tablename,b.name fieldname,c.name fieldtype,c.length fieldlength from sysobjects a,syscolumns b,systypes c where a.id=b.id "+
				"and a.name='sys_entity' and a.xtype='U' and c.name<> 'sysname'"+
				"and b.xtype=c.xtype";
		List<Map> objs= MybatisUtil.queryList("runtime.selectSql", sql1);
		LinkedHashMap<String,String> fieldMap = new LinkedHashMap<String,String>();
		for (int i = 0; i < objs.size(); i++) {
			fieldMap.put(objs.get(i).get("fieldname")+"", (objs.get(i).get("fieldtype")+":"+objs.get(i).get("fieldname")+""));
		}
		fieldMap.put("field_code","field_code");
		fieldMap.put("field_type","field_type");
		fieldMap.put("field_len","field_len");
		String path =  System.getProperty("user.dir").replace("\\", "/").replace("bin", "");
		path = path+"webapps/myehr/WEB-INF/classes/sysparam.properties";
//		String path = "E:/workspace/Myeclipse/.metadata/.me_tcat/webapps/myehr/WEB-INF/classes/sysparam.properties";
		
		String baseExclePath = GetDBPropertiesValue.readValue(path,"excel.exportTempPath");
		CreateFileUtil.createDir(baseExclePath);
		ExcelUtils.listToExcel(sysEntitys, fieldMap,baseExclePath, "数据结构实体表", response);
		
		return recode;
	}	
	
	/**
	 * 导入实体
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/importEntity")
	public @ResponseBody String[]  importEntity(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		String fieldId = request.getParameter("fileid");
		SysFileupload file = sysFileuploadMapper.selectByPrimaryKey(new BigDecimal(fieldId));
		String filePath = file.getFilepath();
		List<Map<String, Object>> importDatas = null;
		Map<String, String> map = new HashMap<String, String>();
		if (filePath.endsWith(".xls")) {
			map =ExcelUtil.readExcelHeadFor2003(filePath, 1);
			importDatas = ExcelUtil.readExcelFor2003(filePath, 2);
		} else if (filePath.endsWith(".xlsx")) {
			map =ExcelUtil.readExcelHeadFor2007(filePath, 1);
			importDatas = ExcelUtil.readExcelFor2007(filePath, 2);
		}
		for (int i = 0; i < importDatas.size(); i++) {
			Map data = importDatas.get(i);
			String tableValue = "";
			String tableName = "";
	        String primaryKeyValue = "";
	        String primaryKeyType = "";
	        String primaryKeyLen = "";
			for(Entry<String,String> entry:map.entrySet()){
	            String cell=entry.getKey();
	            String field=entry.getValue();
	            String fieldValue = (String) data.get(cell);
	           
	            if (field.equals("ENTITY_CODE")) {
	            	tableValue = fieldValue;
				}
	            if (field.equals("ENTITY_CHINANAME")) {
	            	tableName = fieldValue;
				}
	            if (field.equals("field_code")) {
	            	primaryKeyValue = fieldValue;
				}
	            if (field.equals("field_type")) {
	            	primaryKeyType = fieldValue;
				}
	            if (field.equals("field_len")) {
	            	primaryKeyLen = fieldValue;
				}
	        }
			if (primaryKeyValue==null||primaryKeyValue.equals("")) {
				continue;
			}
			String checkSql ="SELECT Name FROM SysObjects Where XType='U' and name = '"+tableValue+"'";
			List<Map> objs= MybatisUtil.queryList("runtime.selectSql", checkSql);
			if (objs.size()>0) {
				continue;
			}
			
			String sql = " create table "+tableValue+"("+
	        " "+primaryKeyValue+" "+primaryKeyType+"("+primaryKeyLen+") not null primary key"+
			" ) ";
			Map<String, Object> maps=new HashMap<String, Object>();
			maps.put("sql", sql);
			eMapperExpand.operation(maps);//建表及主键
	        String sql1 = " EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'主键' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'"+tableValue+"', @level2type=N'COLUMN',@level2name=N'"+primaryKeyValue+"' ";
	        maps.put("sql", sql1);
			eMapperExpand.operation(maps);//添加主键
	        String sql2 = " EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'"+tableName+"' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'"+tableValue+"' ";
	        maps.put("sql", sql2);
			eMapperExpand.operation(maps);//添加表
		}
		return recode;
	}	
	
	/**
	 * 导入字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/importHardwareProperties")
	public @ResponseBody String[]  importHardwareProperties(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		String fieldId = request.getParameter("fileid");
		SysFileupload file = sysFileuploadMapper.selectByPrimaryKey(new BigDecimal(fieldId));
		String filePath = file.getFilepath();
		
		String cpuId = GetDBPropertiesValue.readValue(filePath,"cpuId");
		String cmdId = GetDBPropertiesValue.readValue(filePath,"cmdId");
		String hdId = GetDBPropertiesValue.readValue(filePath,"hdId");
		SysSoftwareValidation sysSoftwareValidation = new SysSoftwareValidation();
		sysSoftwareValidation.setSoftwareValidationHardware(cpuId+":"+cmdId+":"+hdId);
		sysSoftwareValidationMapper.insert(sysSoftwareValidation);
		return recode;
	}
	
	/**
	 * 导入字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/importField")
	public @ResponseBody String[]  importField(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		String fieldId = request.getParameter("fileid");
		SysFileupload file = sysFileuploadMapper.selectByPrimaryKey(new BigDecimal(fieldId));
		String filePath = file.getFilepath();
		List<Map<String, Object>> importDatas = null;
		Map<String, String> map = new HashMap<String, String>();
		Map<String, Object> maps=new HashMap<String, Object>();
		if (filePath.endsWith(".xls")) {
			map =ExcelUtil.readExcelHeadFor2003(filePath, 1);
			importDatas = ExcelUtil.readExcelFor2003(filePath, 2);
		} else if (filePath.endsWith(".xlsx")) {
			map =ExcelUtil.readExcelHeadFor2007(filePath, 1);
			importDatas = ExcelUtil.readExcelFor2007(filePath, 2);
		}
		for (int i = 0; i < importDatas.size(); i++) {
			Map data = importDatas.get(i);
			String tableName = "";
			String fieldCode = "";
	        String fieldChinaName = "";
	        String fieldIsIsNull = "";
	        String fieldIsIsKey = "";
	        String fieldType = "";
	        String fieldLen = "";
			for(Entry<String,String> entry:map.entrySet()){
	            String cell=entry.getKey();
	            String field=entry.getValue();
	            String fieldValue = (String) data.get(cell);
	           
	            if (field.equals("entity_code")) {
	            	tableName = fieldValue;
				}
	            if (field.equals("FIELD_CODE")) {
	            	fieldCode = fieldValue;
				}
	            if (field.equals("FIELD_CHINA_NAME")) {
	            	fieldChinaName = fieldValue;
				}
	            if (field.equals("FIELD_IS_NULL")) {
	            	fieldIsIsNull = fieldValue;
				}
	            if (field.equals("FIELD_IS_KEY")) {
	            	fieldIsIsKey = fieldValue;
				}
	            if (field.equals("FIELD_TYPE")) {
	            	fieldType = fieldValue;
				}
	            if (field.equals("FIELD_LEN")) {
	            	fieldLen = fieldValue;
				}
	        }
			
			fieldIsIsNull = " null ";
			
			if (fieldType.equals("datetime")) {
				fieldLen = " ";
			}else {
				fieldLen = "("+fieldLen+")";
			}
			if (fieldIsIsKey!=null && fieldIsIsKey.equals("Y")) {
				fieldCode = fieldCode+"_COPY";
				String checkSql ="select * from syscolumns where id=object_id('"+tableName+"')   and   name='"+fieldCode+"'";
				List<Map> objs= MybatisUtil.queryList("runtime.selectSql", checkSql);
				if (objs.size()>0) {
					continue;
				}else {
					String sql = " alter table "+tableName+" ADD "+fieldCode+" "+fieldType+fieldLen+fieldIsIsNull;
					maps.put("sql", sql);
					eMapperExpand.operation(maps);//添加字段
			        String sql1 = " EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'"+fieldChinaName+"' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'"+tableName+"', @level2type=N'COLUMN',@level2name=N'"+fieldCode+"' ";
			        maps.put("sql", sql1);
					eMapperExpand.operation(maps);//添加字段注释
				}
			}else{
				String checkSql ="select * from syscolumns where id=object_id('"+tableName+"')   and   name='"+fieldCode+"'";
				List<Map> objs= MybatisUtil.queryList("runtime.selectSql", checkSql);
				if (objs.size()>0) {
					continue;
				}
				
				String sql = " alter table "+tableName+" ADD "+fieldCode+" "+fieldType+fieldLen+fieldIsIsNull;
				maps.put("sql", sql);
				eMapperExpand.operation(maps);//添加字段
		        String sql1 = " EXEC sys.sp_addextendedproperty @name=N'MS_Description', @value=N'"+fieldChinaName+"' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'TABLE',@level1name=N'"+tableName+"', @level2type=N'COLUMN',@level2name=N'"+fieldCode+"' ";
		        maps.put("sql", sql1);
				eMapperExpand.operation(maps);//添加字段注释
			}
		}
		return recode;
	}	
	
	/**
	 * 导入数据
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/importData")
	public @ResponseBody String[]  importData(HttpServletRequest request,HttpServletResponse response) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		String fieldId = request.getParameter("fileid");
		SysFileupload file = sysFileuploadMapper.selectByPrimaryKey(new BigDecimal(fieldId));
		String filePath = file.getFilepath();
		String fileName =  file.getFilename();
		String[] aa = fileName.split("表");
		String entityName = aa[0];
		SysEntityExample entityExample = new SysEntityExample();
		entityExample.or().andEntityCodeEqualTo(entityName);
		SysEntity entity = sMapper.selectByExample(entityExample).get(0);
		
		SysFieldExample fieldExample = new SysFieldExample();
		fieldExample.or().andFieldEntityIdEqualTo(new BigDecimal(entity.getEntityId()));
		List<SysField> fields = sFieldMapper.selectByExample(fieldExample);
		
		SysEntityFieldMappingExample example = new SysEntityFieldMappingExample();
		example.or().andEntityMappingCodeEqualTo(entity.getEntityId()+"");
		List<SysEntityFieldMapping> objs1 = sysEntityFieldMappingMapper.selectByExample(example);
		
		List<Map<String, Object>> importDatas = null;
		Map<String, String> map = new HashMap<String, String>();
		Map<String, Object> maps=new HashMap<String, Object>();
		if (filePath.endsWith(".xls")) {
			map =ExcelUtil.readExcelHeadFor2003(filePath, 1);
			importDatas = ExcelUtil.readExcelFor2003(filePath, 2);
		} else if (filePath.endsWith(".xlsx")) {
			map =ExcelUtil.readExcelHeadFor2007(filePath, 1);
			importDatas = ExcelUtil.readExcelFor2007(filePath, 2);
		}
		for (int i = 0; i < importDatas.size(); i++) {
			Map data = importDatas.get(i);
			String insertColumns = "";
			String insertValues = "";
			
			for (int j = 0; j < fields.size(); j++) {
				SysField sysField = fields.get(j);
				String column = sysField.getFieldCode();
				String value = "";
				for(Entry<String,String> entry:map.entrySet()){
		            String cell=entry.getKey();
		            String field=entry.getValue();
		            if (field.equals(column)) {
		            	value= (String) data.get(cell);
					}
		        }
				String oldEntityFieldMapping ="";
				String newEntityFieldMapping ="";
				Boolean mappingField = false;
				for (int k = 0; k < objs1.size(); k++) {
					if (mappingField) {
						continue;
					}else{
						oldEntityFieldMapping = objs1.get(k).getEntityFieldOldCode();
						newEntityFieldMapping = objs1.get(k).getEntityFieldNewCode();
						if (oldEntityFieldMapping.equals(column)) {
							mappingField =true;
						}else {
							continue;
						}
					}
					
				}
				if (mappingField) {
					if (sysField.getFieldIsKey().equals("N")) {
						insertColumns+=column+",";
						insertColumns+=newEntityFieldMapping+",";
						if((sysField.getFieldType().toUpperCase()).equals("NVARCHAR")){
							if (value==null||value.equals("")) {
								insertValues+="null,";
								insertValues+="null,";
							}else {
								insertValues+="'"+value+"',";
								insertValues+="'"+value+"',";
							}
							
						}else if((sysField.getFieldType().toUpperCase()).equals("DATETIME")){
							if (value==null||value.equals("")) {
								insertValues+="null,";
								insertValues+="null,";
							}else {
								insertValues+="'"+value+"',";
								insertValues+="'"+value+"',";
							}
						}else {
							if (value==null||value.equals("")) {
								insertValues+="null,";
								insertValues+="null,";
							}else {
								insertValues+=""+value+",";
								insertValues+=""+value+",";
							}
						}
					}else {
						insertColumns+=newEntityFieldMapping+",";
						if((sysField.getFieldType().toUpperCase()).equals("NVARCHAR")){
							if (value==null||value.equals("")) {
								insertValues+="null,";
							}else {
								insertValues+="'"+value+"',";
							}
							
						}else if((sysField.getFieldType().toUpperCase()).equals("DATETIME")){
							if (value==null||value.equals("")) {
								insertValues+="null,";
							}else {
								insertValues+="'"+value+"',";
							}
						}else {
							if (value==null||value.equals("")) {
								insertValues+="null,";
							}else {
								insertValues+=""+value+",";
							}
						}
					}
				}else {
					if (sysField.getFieldIsKey().equals("N")) {
						insertColumns+=column+",";
						if((sysField.getFieldType().toUpperCase()).equals("NVARCHAR")){
							if (value==null||value.equals("")) {
								insertValues+="null,";
							}else {
								insertValues+="'"+value+"',";
							}
							
						}else if((sysField.getFieldType().toUpperCase()).equals("DATETIME")){
							if (value==null||value.equals("")) {
								insertValues+="null,";
							}else {
								insertValues+="'"+value+"',";
							}
						}else {
							if (value==null||value.equals("")) {
								insertValues+="null,";
							}else {
								insertValues+=""+value+",";
							}
						}
					}
				}		
			}
			
			
			
			
				
			insertColumns = insertColumns.substring(0, insertColumns.length()-1);
			insertValues = insertValues.substring(0, insertValues.length()-1);
			
			String sql = "INSERT INTO "+entityName+"("+insertColumns+") values ("+insertValues+")";
			maps.put("sql", sql);
			eMapperExpand.operation(maps);//添加字段
		}
		return recode;
	}	
	
	
	//添加数据
	@RequestMapping("/insertEntity")
	public @ResponseBody Object insertEntity(HttpServletRequest request) throws Exception{
		//新建实体表数据
		SysEntity sEntity = (SysEntity) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysEntity.class);
		sEntity.setEntityId(pImpl.getPrimaryKey("sys_entity", "ENTITY_ID"));
		java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
		sEntity.setOperatorTime(currentDate);
		String useridString = (String)(request.getSession().getAttribute("userid")+"");
		sEntity.setOperatorName(useridString);
        String reCode = enServiceImpl.insertSysEntity(sEntity);
        if (reCode.equals("0")) {//插入数据成功
			//reCode=enServiceImpl.addTableMysql(sEntity);
        	reCode=enServiceImpl.addTableOracle(sEntity);
		}
        return reCode;
    }
	
	//添加数据,返回实体ID
		@RequestMapping("/insertEntity2")
		public @ResponseBody Object insertEntity2(HttpServletRequest request) throws Exception{
			//新建实体表数据
			String reCode = "1";
			SysEntity sEntity = (SysEntity) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysEntity.class);
			SysEntityExample example = new SysEntityExample();
			example.or().andEntityChinanameEqualTo(sEntity.getEntityChinaname());
			if(sMapper.selectByExample(example).size()==0){
				java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
				sEntity.setOperatorTime(currentDate);
		        reCode = enServiceImpl.insertSysEntity(sEntity);
		        SysEntityExample example2 = new SysEntityExample();
		        example2.or().andEntityCodeEqualTo(sEntity.getEntityCode());
		        SysEntity sEntity2 = sMapper.selectByExample(example2).get(0);
		        if (reCode.equals("0")) {
					return sEntity2.getEntityId();
				}else {
			        return reCode;
				}
			}else {
				return reCode;
			}
	        
	    }
	//搜索数据
	@RequestMapping("/searchEntityList")
	public @ResponseBody ResultMap searchEntityList(HttpServletRequest request) throws Exception{
		ResultMap resultMap=enServiceImpl.searchEntityList(request);
		return resultMap;
	}
	//删除数据
	@RequestMapping("/removeEntity")
	public @ResponseBody Object removeEntity(HttpServletRequest request) throws Exception{
        SysEntity entity = (SysEntity) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysEntity.class);  
        String reCode = enServiceImpl.deleteSysEntity(entity);
        return reCode;
    }
	//批量删除数据
	@RequestMapping("/removeEntitys")
	public @ResponseBody Object removeEntitys(HttpServletRequest request) throws Exception{
		String reCode =new String();
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysEntity> sEntity = JSONArray.toList(jArray,new SysEntity(), new JsonConfig()); 
        for (SysEntity sysEntity : sEntity) {
			if(sysEntity.getDeleteMark().equals("N")){
				sysEntity.setDeleteMark("Y");
				reCode = enServiceImpl.updateSysEntity(sysEntity);
			}else {
				reCode = enServiceImpl.deleteSysEntity(sysEntity);
			}
		}
        return reCode;
    }
	
	//引入数据结构,获取数据表名...
	@RequestMapping("/findTableList")
	 public @ResponseBody ResultMap findTableList(HttpServletRequest request) throws Exception {
	        try {  
	            return enServiceImpl.getAllTableMysql(request);  
	        } catch (Exception e) {  
	            e.printStackTrace();logger.error(e.getMessage(),e);  
	        }  
	        return null; 
	}
	
	//恢复数据
		@RequestMapping("/recoverEntity")
		 public @ResponseBody Object recoverEntity(HttpServletRequest request,@RequestBody SysEntity entity) throws Exception {
			int reCode = 11;
	        SysEntity entity2 = sMapper.selectByPrimaryKey(entity.getEntityId());
	        entity2.setDeleteMark("N");
	        //entity2.setDeleteMarkBack("Y");
	        reCode = sMapper.updateByPrimaryKey(entity2);
	        return reCode;
		}
		
	//搜索数据表数据
	@RequestMapping("/searchTableList")
	public @ResponseBody ResultMap searchTableList(HttpServletRequest request) throws Exception{
		ResultMap resultMap=enServiceImpl.searchTableListOracle(request);
		return resultMap;
	}
	
	//搜索数据表数据
		@RequestMapping("/test")
		public @ResponseBody Object test(HttpServletRequest request) throws Exception{
			JSONArray json =JSONArray.fromObject("[{'value': '0', 'text': 'INT'},{'value': '1', 'text': 'VARCHAR'},{'value': '2', 'text': 'DATE'}]");
			return json;
		}
	
	//添加数据
		@RequestMapping("/leadDataTable")
		public @ResponseBody Object leadDataTable(HttpServletRequest request) throws Exception{
			//新建实体表数据
			SysEntity sEntity = (SysEntity) JSONObject.toBean(GetRequestJsonUtils.getJsonObject(request), SysEntity.class);
			sEntity.setEntityId(pImpl.getPrimaryKey("sys_entity", "ENTITY_ID"));
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
			sEntity.setOperatorTime(currentDate);
	        String reCode = enServiceImpl.insertSysEntity(sEntity);
	        return reCode;
	    }
		
		/**
		 * 查找实体树
		 * @param request
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/selectTree")
		public @ResponseBody Object selectTree(HttpServletRequest request) throws Exception{
			List<TreeModel> tList =new ArrayList<TreeModel>();
			TreeModel test1 = new TreeModel();
			test1.setId("SYS_ENTITY_CATALOG");
			test1.setIsParent(true);
			test1.setName("实体类");
			test1.setOpen(false);
			test1.setPid("Root");
			tList.add(test1);
			
			TreeModel test5 = new TreeModel();
			test5.setId("baseSource");
			test5.setIsParent(true);
			test5.setName("默认数据库");
			test5.setOpen(false);
			test5.setPid("SYS_ENTITY_CATALOG");
			tList.add(test5);
			
			CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_sqlserver);
			
			List<SysDictEntryExpand> list2  = serviceImpl.searchDictEntryListByTypeId(7);
			
			
			
			for (SysDictEntryExpand sysDictEntryExpand : list2) {
				TreeModel test2 = new TreeModel();
				test2.setId(sysDictEntryExpand.getDictEntryCode());
				test2.setIsParent(true);
				test2.setName(sysDictEntryExpand.getDictEntryName());
				test2.setOpen(false);
				test2.setPid("baseSource");
				tList.add(test2);
				
				//List<SysEntity> sList = enServiceImpl.getEntityByEntityType(sysDictEntryExpand.getDictEntryCode());
				SysEntityExample example =new SysEntityExample();
				SysEntityExample.Criteria criteria= example.createCriteria();
				criteria.andEntityTypeEqualTo(sysDictEntryExpand.getDictEntryCode());
				List<SysEntity> sList = sMapper.selectByExample(example);
				//List<SysEntity> sList = test.searchSysEntityListByDataSource1(sysDictEntryExpand.getDictEntryCode());
				for (SysEntity sysEntity : sList) {
					TreeModel test3 = new TreeModel();
					test3.setId(String.valueOf(sysEntity.getEntityId()));
					test3.setIsParent(false);
					test3.setName(sysEntity.getEntityChinaname()+"("+sysEntity.getEntityTablename()+")");
					test3.setOpen(true);
					test3.setPid(sysEntity.getEntityType());
					tList.add(test3);
				}
			}
			
			/*SysSourceExample example = new SysSourceExample();
			List<SysSource> sysSources = sysSourceMapper.selectByExample(example);
			for (int i = 0; i < sysSources.size(); i++) {
				TreeModel test4 = new TreeModel();
				test4.setId(sysSources.get(i).getSysSourceCode());
				test4.setIsParent(true);
				test4.setName(sysSources.get(i).getSysSourceName());
				test4.setOpen(false);
				test4.setPid("SYS_ENTITY_CATALOG");
				tList.add(test4);
			}*/
			/*TreeModel test6 = new TreeModel();
			test6.setId("oracleSource");
			test6.setIsParent(true);
			test6.setName("oracle数据库");
			test6.setOpen(false);
			test6.setPid("SYS_ENTITY_CATALOG");
			tList.add(test6);
			
			CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_oracle);
			String sql = "SELECT * FROM sys_dict_entry WHERE DICT_TYPE_ID = 7 order by dict_entry_sort";
			List<Map> objs = MybatisUtil.queryList("runtime.selectSql", sql);
			
			for (Map obj : objs) {
				TreeModel test2 = new TreeModel();
				test2.setId(obj.get("DICT_ENTRY_CODE")+"");
				test2.setIsParent(true);
				test2.setName(obj.get("DICT_ENTRY_NAME")+"");
				test2.setOpen(false);
				test2.setPid("oracleSource");
				tList.add(test2);
				
				//List<SysEntity> sList = enServiceImpl.getEntityByEntityType(sysDictEntryExpand.getDictEntryCode());
				SysEntityExample example =new SysEntityExample();
				SysEntityExample.Criteria criteria= example.createCriteria();
				criteria.andEntityTypeEqualTo(obj.get("DICT_ENTRY_NAME")+"");
				List<SysEntity> sList = sMapper.selectByExample(example);
				//List<SysEntity> sList = test.searchSysEntityListByDataSource1(sysDictEntryExpand.getDictEntryCode());
				for (SysEntity sysEntity : sList) {
					TreeModel test3 = new TreeModel();
					test3.setId(String.valueOf(sysEntity.getEntityId()));
					test3.setIsParent(false);
					test3.setName(sysEntity.getEntityChinaname()+"("+sysEntity.getEntityTablename()+")");
					test3.setOpen(true);
					test3.setPid(sysEntity.getEntityType());
					tList.add(test3);
				}
			}
			
			CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_sqlserver);*/
			
			
			JSONArray jsonArray=JSONArray.fromObject(tList);
	    	String str=jsonArray.toString();
	    	String newStr = str.replaceAll("pid","pId");
	    	JSONArray json = JSONArray.fromObject(newStr);
			return json;
		}
		
		/**
		 * 查找实体树+字段
		 * @param request
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/selectFullTree")
		public @ResponseBody Object selectFullTree(HttpServletRequest request) throws Exception{
			 String id = request.getParameter("id");
			 String lv = request.getParameter("lv");
			 String name = request.getParameter("n");
			 
			List<TreeModel> tList =new ArrayList<TreeModel>();
			//全加载
			if (id==null&&lv==null&&name==null) {
				List<SysDictEntryExpand> list= serviceImpl.searchDictEntryListByTypeId(7);
				for (SysDictEntryExpand sysDictEntryExpand : list) {
					TreeModel test2 = new TreeModel();
					test2.setId(sysDictEntryExpand.getDictEntryCode());
					test2.setIsParent(true);
					test2.setName(sysDictEntryExpand.getDictEntryName());
					test2.setOpen(false);
					test2.setPid("");
					tList.add(test2);
					SysEntityExample example =new SysEntityExample();
					SysEntityExample.Criteria criteria= example.createCriteria();
					criteria.andEntityTypeEqualTo(sysDictEntryExpand.getDictEntryCode());
					List<SysEntity> sList = sMapper.selectByExample(example);
					for (SysEntity sysEntity : sList) {
						TreeModel test3 = new TreeModel();
						test3.setId(String.valueOf(sysEntity.getEntityId()));
						test3.setIsParent(true);
						test3.setName(sysEntity.getEntityChinaname()+"("+sysEntity.getEntityTablename()+")");
						test3.setOpen(true);
						test3.setPid(sysEntity.getEntityType());
						tList.add(test3);
					}
				}
			} else if(lv.equals("1")){
				SysFieldExample example2 = new SysFieldExample();
				example2.or().andFieldEntityIdEqualTo(new BigDecimal(id));
					List<SysField> sFields = sFieldMapper.selectByExample(example2);
					for (SysField sysField : sFields) {
						TreeModel test4 = new TreeModel();
						test4.setId(String.valueOf(sysField.getFieldId()));
						test4.setIsParent(false);
						test4.setName(sysField.getFieldChinaName());
						test4.setOpen(true);
						test4.setPid(id);
						tList.add(test4);
					}
			}
			/*List<SysDictEntryExpand> list= serviceImpl.searchDictEntryListByTypeId(7);
			for (SysDictEntryExpand sysDictEntryExpand : list) {
				TreeModel test2 = new TreeModel();
				test2.setId(sysDictEntryExpand.getDictEntryCode());
				test2.setIsParent(true);
				test2.setName(sysDictEntryExpand.getDictEntryName());
				test2.setOpen(false);
				test2.setPid("");
				tList.add(test2);
				//List<SysEntity> sList = enServiceImpl.getEntityByEntityType(sysDictEntryExpand.getDictEntryCode());
				SysEntityExample example =new SysEntityExample();
				SysEntityExample.Criteria criteria= example.createCriteria();
				criteria.andEntityTypeEqualTo(sysDictEntryExpand.getDictEntryCode());
				List<SysEntity> sList = sMapper.selectByExample(example);
				for (SysEntity sysEntity : sList) {
					TreeModel test3 = new TreeModel();
					test3.setId(String.valueOf(sysEntity.getEntityId()));
					test3.setIsParent(false);
					test3.setName(sysEntity.getEntityChinaname()+"("+sysEntity.getEntityTablename()+")");
					test3.setOpen(true);
					test3.setPid(sysEntity.getEntityType());
					tList.add(test3);
					SysFieldExample example2 = new SysFieldExample();
					example2.or().andFieldEntityIdEqualTo(sysEntity.getEntityId());
					List<SysField> sFields = sFieldMapper.selectByExample(example2);
					for (SysField sysField : sFields) {
						TreeModel test4 = new TreeModel();
						test4.setId(String.valueOf(sysField.getFieldId()));
						test4.setIsParent(false);
						test4.setName(sysField.getFieldChinaName());
						test4.setOpen(true);
						test4.setPid(String.valueOf(sysEntity.getEntityId()));
						tList.add(test4);
					}
				}
			}*/			
			JSONArray jsonArray=JSONArray.fromObject(tList);
	    	String str=jsonArray.toString();
	    	String newStr = str.replaceAll("pid","pId");
	    	JSONArray json = JSONArray.fromObject(newStr);
			return json;
		}
		
		/**
		 * 查找实体树
		 * @param request
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/selectChooseTree")
		public @ResponseBody Object selectChooseTree(HttpServletRequest request) throws Exception{
			List<TreeModel> tList =new ArrayList<TreeModel>();
			TreeModel test1 = new TreeModel();
			test1.setId("SYS_ENTITY_CATALOG");
			test1.setIsParent(true);
			test1.setName("实体类");
			test1.setOpen(false);
			test1.setPid("");
			tList.add(test1);
			//全加载
			List<SysDictEntryExpand> list= serviceImpl.searchDictEntryListByTypeId(7);
			for (SysDictEntryExpand sysDictEntryExpand : list) {
				TreeModel test2 = new TreeModel();
				test2.setId(sysDictEntryExpand.getDictEntryCode());
				test2.setIsParent(true);
				test2.setName(sysDictEntryExpand.getDictEntryName());
				test2.setOpen(false);
				test2.setPid("SYS_ENTITY_CATALOG");
				tList.add(test2);
			}
			JSONArray jsonArray=JSONArray.fromObject(tList);
	    	String str=jsonArray.toString();
	    	String newStr = str.replaceAll("pid","pId");
	    	JSONArray json = JSONArray.fromObject(newStr);
			return json;
		}
		
		/**
		 * 查找实体树
		 * @param request
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/selectChooseField")
		public @ResponseBody Object selectChooseField(HttpServletRequest request) throws Exception{
			String[] entityName = request.getParameter("entityName").split(",");			
			List<TreeModel> tList =new ArrayList<TreeModel>();
			TreeModel test1 = new TreeModel();
			test1.setId("SYS_ENTITY_CATALOG");
			test1.setIsParent(true);
			test1.setName("所选实体");
			test1.setOpen(true);
			test1.setPid("");
			tList.add(test1);
			//全加载
			for (int i = 0 ;i<entityName.length;i++) {
				SysEntityExample example = new SysEntityExample();
				example.or().andEntityCodeEqualTo(entityName[i]);
				SysEntity sEntity= sMapper.selectByExample(example).get(0);
				TreeModel test2 = new TreeModel();
				test2.setId(String.valueOf(sEntity.getEntityId()));
				test2.setIsParent(true);
				test2.setName(sEntity.getEntityTablename());
				test2.setOpen(false);
				test2.setPid("SYS_ENTITY_CATALOG");
				tList.add(test2);
			}
			JSONArray jsonArray=JSONArray.fromObject(tList);
	    	String str=jsonArray.toString();
	    	String newStr = str.replaceAll("pid","pId");
	    	JSONArray json = JSONArray.fromObject(newStr);
			return json;
		}
}
