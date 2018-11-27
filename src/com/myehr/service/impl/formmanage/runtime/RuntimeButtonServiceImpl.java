package com.myehr.service.impl.formmanage.runtime;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.DcfReponse;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.ExcelException;
import com.myehr.common.util.ExcelUtil;
import com.myehr.common.util.ExcelUtils;
import com.myehr.common.util.GetDBPropertiesValue;
import com.myehr.common.util.MyEhrJDBCUtil;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.common.util.StringUtils;
import com.myehr.common.util.datasource.CustomerContextHolder;
import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.field.SysFieldExpandMapper;
import com.myehr.mapper.field.SysFieldMapper;
import com.myehr.mapper.formmanage.button.ImportField;
import com.myehr.mapper.sysuser.SysFieldLogMapper;
import com.myehr.pojo.cache.SysCacheConfig;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.entity.SysEntityExample;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldExample;
import com.myehr.pojo.field.SysFieldRule;
import com.myehr.pojo.formmanage.button.ImportButtonManager;
import com.myehr.pojo.formmanage.cache.SysDatepickerCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonImportCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonImportColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonIntrDetailCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonIntroduceCache;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormGeneralExecSqlCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.sysuser.SysFieldLog;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.form.IsysFormColumnService;
import com.myehr.service.formmanage.runtime.IRuntmeButtonService;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.test.dao.TMapperExt;


/**
 * 按钮服务类
 */
@Service
public class RuntimeButtonServiceImpl  implements  IRuntmeButtonService {
	private static Logger logger = LoggerFactory.getLogger(RuntimeButtonServiceImpl.class);
	@Autowired
	private ISysformconfigService sysformconfigService;
	
	@Autowired
	SysEntityMapper mapper ;
	
	@Autowired
	SysFieldMapper sfmapper ;
	
	@Autowired
	SysFieldExpandMapper sfmapperExpand ;
	
//	@Autowired
	@Resource(name = "PrimaryKeyService") 
	private PrimaryKeyService keyserviceImpl;
	
	@Autowired
	private SysFieldLogMapper sysFieldLogMapper;
	
//	@Autowired
	@Resource(name = "TMapperExt") 
	private TMapperExt tMapperExt;
	
//	@Autowired
//	private SqlSessionFactory sqlSessionFactory;
	
	@SuppressWarnings("unchecked")
	@Transactional
	public String[] cardFormSaveButtonSave(Map obj,String formId,Map<String,Object> paramsMap,String buttonId,HttpServletRequest request,String buttonType,String sourceType) throws Exception {
		// TODO 自动生成方法存根
		//获取当前需要修改和新增的表名
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userid")+"";
		SysFormconfigCache form = sysformconfigService.getForm(formId);
		String saveTableName = form.getFormDefSaveTable();
		List<Map> busPkField = form.getBusPkField();
		if(saveTableName!=null){
			SysEntity sysEntity;
			
			SysEntityExample example = new SysEntityExample();
			example.or().andEntityTablenameEqualTo(saveTableName);
			List<SysEntity> sysEntitys = mapper.selectByExample(example);
			if (sysEntitys.size() > 0) {
				//前置触发
				if(paramsMap!=null&&buttonId!=null&&!"null".equalsIgnoreCase(buttonId)&&!"0".equalsIgnoreCase(buttonId)) {
					this.execQzsql(paramsMap, formId, buttonId, null,session,sourceType);
				}
				
				sysEntity = sysEntitys.get(0);
				//获取对应的主键字段
				int entityId = sysEntity.getEntityId();
				List<SysField> fields = sfmapperExpand.queryFieldByEntityId(entityId+"");
				Map param = obj;
				
				String[] excresult = null;
				if (buttonType.equalsIgnoreCase("import")) {
					excresult =  getAndExcuteSql(fields,saveTableName,param,busPkField,request.getSession(),sourceType);
					return excresult; 
				}else if (buttonType.equalsIgnoreCase("introduce")){
					excresult =  getAndExcuteSqlIntroduceSave(fields,saveTableName,param,busPkField,request.getSession(),formId);
				}else {
					excresult =  getAndExcuteSqlSave(fields,saveTableName,param,busPkField,request.getSession(),formId,sourceType);
				}
				
				if(excresult!=null && "error".endsWith(excresult[0])){
					return excresult;
				}
				if(paramsMap!=null&&buttonId!=null&&!"null".equalsIgnoreCase(buttonId)&&!"0".equalsIgnoreCase(buttonId)) {
					SysFormButtonCache button = form.getButtonByButtonId(buttonId);
					SysFormGeneralExecSqlCache buttonExecSql = button.getHzSql();
					if(buttonExecSql!=null&&buttonExecSql.getPojo()!=null&&buttonExecSql.getExecSqlId()>0){
						return excresult;
					}else {
						List<SysCacheConfig> configs = form.getButton(Long.valueOf(buttonId)).getCacheConfig();
						if(configs!=null){
							for (SysCacheConfig sysCacheConfig : configs) {
								sysformconfigService.setCardDictDataByDictTypeCode(sysCacheConfig.getCacheId(), "sql");
							}
						}
						return new String[]{"000000","操作成功"};
						
					}
				} else if (paramsMap == null && buttonId == null) {
					return excresult;
				} else if (buttonId.equalsIgnoreCase("0")) {
					return new String[]{"000000","操作成功"};
				}
			} else {
				return new String[]{"error","保存失败！系统未找到保存目标数据表"};
			}
		}
		return new String[]{"error","保存失败！系统未找到保存目标数据表"};
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public String[] cardFormSaveButtonSave(Map obj,SysFormconfigCache form,Map<String,Object> paramsMap,String buttonId,HttpServletRequest request,String buttonType,String sourceType) throws Exception {
		// TODO 自动生成方法存根
		//获取当前需要修改和新增的表名
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userid")+"";
		String formId = form.getFormDefId()+"";
//		SysFormconfigCache form = sysformconfigService.getForm(formId);
		String saveTableName = form.getFormDefSaveTable();
		List<Map> busPkField = form.getBusPkField();
		if(saveTableName!=null){
			SysEntity sysEntity;
			
			SysEntityExample example = new SysEntityExample();
			SysEntityExample.Criteria criteria =example.createCriteria();
			criteria.andEntityTablenameEqualTo(saveTableName);
			
			List<SysEntity> sysEntitys = mapper.selectByExample(example);
			if (sysEntitys.size() > 0) {
				//前置触发
				if(paramsMap!=null&&buttonId!=null&&!"null".equalsIgnoreCase(buttonId)&&!"0".equalsIgnoreCase(buttonId)) {
					this.execQzsql(paramsMap, formId, buttonId, null,session,sourceType);
				}
				
				sysEntity = sysEntitys.get(0);
				//获取对应的主键字段
				int entityId = sysEntity.getEntityId();
				List<SysField> fields = sfmapperExpand.queryFieldByEntityId(entityId+"");
				Map param = obj;
				
				String[] excresult = null;
				if (buttonType.equalsIgnoreCase("import")) {
					excresult =  getAndExcuteSql(fields,saveTableName,param,busPkField,request.getSession(),sourceType);
					return excresult; 
				}else if (buttonType.equalsIgnoreCase("introduce")){
					excresult =  getAndExcuteSqlIntroduceSave(fields,saveTableName,param,busPkField,request.getSession(),formId);
				}else {
					excresult =  getAndExcuteSqlSave(fields,saveTableName,param,busPkField,request.getSession(),formId,sourceType);
				}
				
				if(excresult!=null && "error".endsWith(excresult[0])){
					return excresult;
				}
				if(paramsMap!=null&&buttonId!=null&&!"null".equalsIgnoreCase(buttonId)&&!"0".equalsIgnoreCase(buttonId)) {
					SysFormButtonCache button = form.getButtonByButtonId(buttonId);
					if (button==null) {
						return new String[]{"000000","操作成功"};
					}
					SysFormGeneralExecSqlCache buttonExecSql = button.getHzSql();
					if(buttonExecSql!=null&&buttonExecSql.getPojo()!=null&&buttonExecSql.getExecSqlId()>0){
						return excresult;
					}else {
						List<SysCacheConfig> configs = form.getButton(Long.valueOf(buttonId)).getCacheConfig();
						if(configs!=null){
							for (SysCacheConfig sysCacheConfig : configs) {
								sysformconfigService.setCardDictDataByDictTypeCode(sysCacheConfig.getCacheId(), "sql");
							}
						}
						return new String[]{"000000","操作成功"};
						
					}
				} else if (paramsMap == null && buttonId == null) {
					return excresult;
				} else if (buttonId.equalsIgnoreCase("0")) {
					return new String[]{"000000","操作成功"};
				}
			} else {
				return new String[]{"error","保存失败！系统未找到保存目标数据表"};
			}
		}
		return new String[]{"error","保存失败！系统未找到保存目标数据表"};
	}

	/**
	 * 按钮调用sql逻辑处理
	 * @param paramMap
	 * @param res
	 * @param formId
	 * @param buttonId
	 * @param buttonType
	 * @return
	 * @throws Exception 
	 */
	@Override
	public String[] execHzsql(Map<String,Object> paramMap,String[] res,String formId,String buttonId,String buttonType,HttpSession session,String sourceType) throws Exception{
		String userId = session.getAttribute("userid")+"";
		SysFormconfigCache form = sysformconfigService.getForm(formId);
		SysFormButtonCache button = form.getButtonByButtonId(buttonId);
		SysFormGeneralExecSqlCache buttonExecSql = button.getHzSql();
		if(buttonExecSql!=null&&buttonExecSql.getPojo()!=null&&buttonExecSql.getExecSqlId()>0){
			String execSql = buttonExecSql.getExecSql();
			execSql = execSql.trim();
			SysFormColumnCache c = form.serchColumnByColumnName(res[0],formId);
			if(c!=null){
			long c_i= c.getFormColumnId();
			
			paramMap.put("c_"+c_i, res[1]);
			try {
				if(execSql.toUpperCase().indexOf("CALL ") == 0){//存储过程
					return RuntimeUtil.execPrepare(buttonExecSql, keyserviceImpl,paramMap,MybatisUtil.getConnection(),session);
				} else {//sql
					try {
						RuntimeUtil.execsql(buttonExecSql,keyserviceImpl,paramMap,session,sourceType);
						List<SysCacheConfig> configs = form.getButton(Long.valueOf(buttonId)).getCacheConfig();
						if(configs!=null){
							for (SysCacheConfig sysCacheConfig : configs) {
								sysformconfigService.setCardDictDataByDictTypeCode(sysCacheConfig.getCacheId(), "sql");
							}
						}
					} catch (Exception e) {
						return new String[]{"error", e.getMessage()};
					}
				}
			}catch (Exception e) {
				// TODO: handle exception
				throw new DcfException(e.getMessage());
			}
			}else{
				try {
					if(execSql.toUpperCase().indexOf("CALL ") == 0){//存储过程
						return RuntimeUtil.execPrepare(buttonExecSql, keyserviceImpl,paramMap,MybatisUtil.getConnection(),session);
					} else {//sql
						try {
							RuntimeUtil.execsql(buttonExecSql,keyserviceImpl,paramMap,session,sourceType);
							List<SysCacheConfig> configs = form.getButton(Long.valueOf(buttonId)).getCacheConfig();
							if(configs!=null){
								for (SysCacheConfig sysCacheConfig : configs) {
									sysformconfigService.setCardDictDataByDictTypeCode(sysCacheConfig.getCacheId(), "sql");
								}
							}
						} catch (Exception e) {
							return new String[]{"error", e.getMessage()};
						}
					}
				}catch (Exception e) {
					// TODO: handle exception
					throw new DcfException(e.getMessage());
				}
			}
			return new String[]{"000000","操作成功"};
		}
		return new String[]{"000000","操作成功"};
	}
	
	@Override
	public String[] execQzsql(Map<String,Object> paramMap,String formId,String buttonId,String buttonType,HttpSession session,String sourceType) throws Exception{
		String userId = session.getAttribute("userid")+"";
		SysFormconfigCache form = sysformconfigService.getForm(formId);
		SysFormButtonCache button = form.getButtonByButtonId(buttonId);
		if (button==null) {
			return new String[]{"000000","操作成功"};
		}
		SysFormGeneralExecSqlCache buttonExecSql = button.getQzSql();
		if(buttonExecSql!=null&&buttonExecSql.getPojo()!=null&&buttonExecSql.getExecSqlId()>0){
			String execSql = buttonExecSql.getExecSql();
			execSql = execSql.trim();
			try {
				if(execSql.toUpperCase().indexOf("CALL ") == 0){//存储过程
					return RuntimeUtil.execPrepare(buttonExecSql, keyserviceImpl,paramMap,MybatisUtil.getConnection(),session);
				} else {//sql
					try {
						RuntimeUtil.execsql(buttonExecSql,keyserviceImpl,paramMap,session,sourceType);
					} catch (Exception e) {
						return new String[]{"error", e.getMessage()};
					}
				}
			}catch (Exception e) {
				// TODO: handle exception
				throw new DcfException(e.getMessage());
			}
			return new String[]{"000000","操作成功"};
		}
		return new String[]{"000000","操作成功"};
	}
	
	/**
	 * @param 列表式保存按钮保存逻辑
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String[] gridFormSaveButtonSave(Map<String,String>[] datas, String formId,Map<String,Object> paramsMap, String buttonId,HttpServletRequest request,String sourceType) throws Exception {
		// TODO 自动生成方法存根
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userid")+"";
		SysFormconfigCache form = sysformconfigService.getForm(formId);
		List<Map> busPkField = form.getBusPkField();
		String tempids = "";
		String tempfield = "";
		String saveTableName = form.getFormDefSaveTable();
		if(saveTableName!=null){
			if(datas==null||datas.length==0||formId==null){
				return new String[]{"error","保存参数异常"};
			}
			SysEntity sysEntity;
			SysEntityExample example = new SysEntityExample();
			SysEntityExample.Criteria criteria =example.createCriteria();
			criteria.andEntityTablenameEqualTo(saveTableName);
			
			List<SysEntity> sysEntitys = mapper.selectByExample(example);
			if(sysEntitys.size()>0){
				sysEntity = sysEntitys.get(0);
				//获取对应的主键字段
				int entityId = sysEntity.getEntityId();

				SysFieldExample sfexample = new SysFieldExample();
				SysFieldExample.Criteria sfcriteria = sfexample.createCriteria();
				sfcriteria.andFieldEntityIdEqualTo(new BigDecimal(entityId));
				List<SysField> fields = sfmapper.selectByExample(sfexample);
				
				for(Map<String,String> temp:datas){
					String _state = (String)temp.get("_state");
					if("added".equalsIgnoreCase(_state)||"modified".equalsIgnoreCase(_state)){
						String[] ress = getAndExcuteSql(fields,saveTableName,temp,busPkField,session,"sqlserver");
						if("error".equalsIgnoreCase(ress[0])){
							return ress;
						}
						
						if(buttonId!=null&&!"null".equalsIgnoreCase(buttonId)&&!"0".equalsIgnoreCase(buttonId)) {
							SysFormButtonCache button = form.getButtonByButtonId(buttonId);
							SysFormGeneralExecSqlCache buttonExecSql = button.getHzSql();
							
							List<String[]> ps = buttonExecSql.getParams();
							for(String[] tempps:ps){
								if(tempps[0].equalsIgnoreCase("c")){
									String columnId = tempps[1].substring(tempps[1].lastIndexOf("_")+1);
									SysFormColumnCache c = form.serchColumnByColumnId(Long.parseLong(columnId));
									String fieldName = c.getJsId("name",formId);
									String tempValue = temp.get(fieldName);
									if(c.getDatabaseType().equalsIgnoreCase("DATE")||c.getDatabaseType().equalsIgnoreCase("TIMESTAMP")){
										tempValue = tempValue!=null?tempValue.replace("T", " "):tempValue;
									}
									
									paramsMap.put("c_"+columnId, tempValue);
								}
							}
							//(Map<String,Object> paramMap,String[] res,String formId,String buttonId,String buttonType,HttpSession session)
							String[] excresult2 = this.execHzsql(paramsMap, ress, formId, buttonId, null,session,sourceType);
							if("error".equals(excresult2)){
								return excresult2;
							}
						}
						
						tempids += ress[1]+",";
						tempfield = ress[0];
					}
					if("removed".equalsIgnoreCase(_state)){
						String sql = RuntimeUtil.removeData(form,temp);
						logger.info("删除sql:"+sql);
						MybatisUtil.delete("runtime.deleteSql", new HashMap().put("deleteSql", sql));
					}
				}
			}
		}
		tempids = tempids.length()>1?tempids.substring(0,tempids.length()-1):tempids;
		return new String[]{tempfield,tempids};
	}
	
	/**
	 * 生成sql update或者insert语句
	 * @param fields
	 * @param tablename
	 * @param params
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public String[] getAndExcuteSql(List<SysField> fields,String tablename,Map param,List<Map> busPkField,HttpSession session,String sourceType) throws RuntimeException{
		String productName =(String)session.getAttribute("productName");
		String[] retcode = new String[2];
		//1 确定主键字段 
		String pkField = getPkField(fields); 
		if( pkField==null){
			return  null;
		}
		//2 确定主键值
		String pkValueStr = param.get(ChangeCode.getRealCode(pkField))+"";
		if (pkValueStr==null||pkValueStr.equalsIgnoreCase("null")) {
			pkValueStr = param.get(ChangeCode.getRealCode(pkField).toUpperCase())+"";
			if (!pkValueStr.equalsIgnoreCase("null")) {
				pkField = pkField.toUpperCase();
			}
		}
		Long pkValue = 0l;
		boolean isPkvalue = false;
		if(StringUtils.isNotNullAndBlank(pkValueStr)) {
			pkValue = Long.parseLong(pkValueStr);
//			确定插入或更新
			String sql = RuntimeUtil.getCheckSqlPkDataSql(pkField,pkValueStr,tablename);
			List<Map> objs;
			try {
				Map map= new HashMap();
				map.put("formDefSql", sql);
				objs = MybatisUtil.queryList("runtime.queryByFormDefSql", map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new DcfException(e);
			}
			//DataObject[] objs = getDASTemplate().queryByNamedSql(DataObject.class, "com.dcf.form.runtime.cardform.excuteQuerySql", sql);
			if(objs.size()>0){
				isPkvalue = true;
			}
		}
		
		if(pkValue==null||pkValue<=0||isPkvalue==false){ //生成insert
			List<String> insert = new ArrayList<String>();
			List values = new ArrayList();
			Map maxRuleIdMap = new HashMap();//存放自增编码最大值
			for(int i=0; i<fields.size();i++){
				SysField field = fields.get(i);
				String filedTablename = field.getFieldTablename();
				if(pkField.equalsIgnoreCase(filedTablename)){
					//主键字段
					String pkv = (String)param.get(ChangeCode.getRealCode(filedTablename));
					if(pkv==null||pkv==""){
						long pk;
						try {
							pk = keyserviceImpl.getMaxId(tablename,ChangeCode.getRealCode(pkField));
						} catch (SQLException e) {
							throw new DcfException(e);
						}
						if(productName.equalsIgnoreCase("Oracle")){
							retcode[0]=pkField+"";
							retcode[1]=pk+"";
							if(!pkValueStr.equals("null")){
								insert.add(ChangeCode.getRealCode(pkField));
								values.add(pkValueStr);
							}
						}else if(productName.equalsIgnoreCase("SqlServer")){
						}
					}else {
						insert.add(ChangeCode.getRealCode(pkField));
						retcode[0]=pkField+"";
						retcode[1]=pkv+"";
						values.add(pkv);
					}
				}else {//非主键字段
					if(param.containsKey(ChangeCode.getRealCode(filedTablename).toUpperCase())){ //传入的参数中包含此字段
						String fielsBusKey = "";
						/*String fieldBusKeyType =fields.get(i).getField.getString("fieldBusKeyType");
						
						if("1".equalsIgnoreCase(fieldBusKeyType)){
							String empCompId = (String)param.get("EMP_COMP_ID");
							if(empCompId !=null){
								long pk = DcfUtil.getPrimaryKey(tablename+"."+pkField);
								Random random=new Random();
						        long randomint = random.nextInt(899999)+100000;
								fielsBusKey = empCompId+"-"+pk+"-"+randomint;
							}
						}*/
						insert.add(ChangeCode.getRealCode(filedTablename));
						String fieldValue = (String)param.get(ChangeCode.getRealCode(filedTablename));
						if(fielsBusKey==null||fielsBusKey==""){
							values.add(fieldValue);
						}else{
							values.add(fielsBusKey);
						}
						
						String islog =fields.get(i).getFieldIsLog();
						
						/*
						if("2".equalsIgnoreCase(fieldBusKeyType)){
							String fieldChinaName =fields[i].getString("fieldChinaName");
							logger.info(fieldChinaName);
						}
						if("3".equalsIgnoreCase(fieldBusKeyType)){
							String fieldChinaName =fields[i].getString("fieldChinaName");
							logger.info(fieldChinaName);
						}*/
						if("Y".equalsIgnoreCase(islog)){ //判断是否要记录操作记录
							//生成数据 后期实现
							/*if( param.get(filedTablename)!=null){
								DataObject flog = DataObjectUtil.createDataObject("com.dcf.system.entity.entitydataset.SysFieldLog");
								flog.set("logId", DcfUtil.getPrimaryKey("SYS_FIELD_LOG.LOG_ID"));
								flog.set("logTableName", tablename);
								flog.set("logFieldName", filedTablename);
								//LOG_FIELD_AFTER
								flog.set("logFieldAfter", param.get(filedTablename));
								flog.set("logType", "1");
								DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
						        String date1=date.format(new Date());
						        SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd" );
						        Date logTime = sdf.parse(date1);
								flog.set("logTime", logTime);
								flog.set("logOperator", DcfUtil.getUserId());
								flog.set("logIp", DcfUtil.getUserIp());
								getDASTemplate().saveEntity(flog);
							}*/
						}
						Long fieldRuleId =field.getFieldRuleId();
						if (fieldRuleId!=null) {//是否自增编码
							//获取自增规则
							int fieldRuleMax = Integer.valueOf(field.getFieldRuleMax());
							SysFieldRule fieldRule = sysformconfigService.getFieldRuleById(fieldRuleId);
							int codeLength = fieldRule.getFieldRulePrefix().length();
							int fieldRuleValue = Integer.valueOf(fieldValue.substring(codeLength, fieldValue.length()-1));
							if (fieldRuleValue>fieldRuleMax) {
								maxRuleIdMap.put(field.getFieldCode(),fieldRuleValue);
							}
							/*if (fieldRuleMax==null||fieldRuleMax.equalsIgnoreCase("")) {
								fields.get(i).setFieldRuleMax("1");
							}else {
								fields.get(i).setFieldRuleMax((Long.parseLong(fieldRuleMax)+1)+"");
							}
							sfmapper.updateByPrimaryKey(fields.get(i));*/
						}
					}
				}
			}
			//检查业务主键是否重复
			String sql2;
			try {
				sql2 = RuntimeUtil.getCheckSqlBusPkDataSqlImport(tablename,param, busPkField,session,sourceType);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			if(sql2!=null) {
				List<Map> objs2;
				try {
					objs2 = MybatisUtil.queryList("runtime.selectSql",sql2);
				} catch (Exception e) {
					e.printStackTrace();logger.error(e.getMessage(),e);
					throw new DcfException(e);
				}
				if(objs2.size()>0){ //如果技术主键判断为新增 且业务技术主键查出结果==2条 是不允许
					String labletablename = "";
					for(Map temp :busPkField){
						labletablename+=(String)temp.get("fieldChinaname")+"、";
					}
					return new String[]{"error","保存失败！("+labletablename+")存在重复，请检查!"};
				}
				
			}
			
			String sql = "";
			try {
				sql = RuntimeUtil.getInsertSqlImport(insert, values, fields,tablename,session,sourceType);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				
				
				throw new DcfException(e);
			}
			try {
				MybatisUtil.insert("runtime.insertSql", sql);
				retcode[0]="000000";
				retcode[1]="导入成功";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			//getDASTemplate().executeNamedSql("com.dcf.form.runtime.cardform.excuteSql", sql);
		}else {//生成update
			List<String> update = new ArrayList<String>();
			List values = new ArrayList();
			for(int i=0; i<fields.size();i++){
				SysField field = fields.get(i);
				String filedTablename = field.getFieldTablename();
				if(pkField.equalsIgnoreCase(filedTablename)){
					retcode[0]=pkField+"";
					retcode[1]=pkValue+"";
				}else {//非主键字段
					if(param.containsKey(ChangeCode.getRealCode(filedTablename).toUpperCase())){ //传入的参数中包含此字段
						update.add(ChangeCode.getRealCode(filedTablename));
						values.add((String)param.get(ChangeCode.getRealCode(filedTablename)));
						String islog =fields.get(i).getFieldIsLog();
						if("Y".equalsIgnoreCase(islog)){ //判断是否要记录操作记录
							/*//当前字段值
							String afterFieldValue =  param.get(filedTablename);
							//查原有记录	
							String formatFieldname = RuntimeUtil.getSelectFieldFormat(filedTablename, fields[i]);
							String queryBeforeSql = "select "+formatFieldname+" from  "+tablename+" t WHERE t."+pkField+" = "+pkValue;
							logger.info(queryBeforeSql);
							DataObject[] before = getDASTemplate().queryByNamedSql(DataObject.class,"com.dcf.form.runtime.cardform.excuteQuerySql", queryBeforeSql);
							String beforValue = null;
							if(before.length>0){
								beforValue = before[0].getString(filedTablename);
							}
							if(!(afterFieldValue==null&&beforValue==null)){
								
								boolean isLog = (afterFieldValue==null&&beforValue!=null)||(afterFieldValue!=null&&beforValue==null)
												||!(afterFieldValue.equalsIgnoreCase(beforValue));
								if(isLog){
									DataObject flog = DataObjectUtil.createDataObject("com.dcf.system.entity.entitydataset.SysFieldLog");
									flog.set("logId", DcfUtil.getPrimaryKey("SYS_FIELD_LOG.LOG_ID"));
									flog.set("logTableName", tablename);
									flog.set("logFieldName", filedTablename);
									//LOG_FIELD_AFTER
									flog.set("logFieldBefore", beforValue);
									flog.set("logFieldAfter", param.get(filedTablename));
									flog.set("logType", "2");
									DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
							        String date1=date.format(new Date());
							        SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd" );
							        Date logTime = sdf.parse(date1);
									flog.set("logTime", logTime);
									flog.set("logOperator", DcfUtil.getUserId());
									flog.set("logIp", DcfUtil.getUserIp());
									getDASTemplate().saveEntity(flog);
								}
								
							}*/
						}
					}
					
				}
			}
			String sql;
			try {
				sql = RuntimeUtil.getUpdateSqlImport(update, values, fields,tablename,pkField,pkValue,session,sourceType);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			//log.info(sql);
			try {
				Map map= new HashMap();
				map.put("updateSql", sql);
				MybatisUtil.update("runtime.updateSql", map);
				retcode[0]="000000";
				retcode[1]="导入成功";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			//getDASTemplate().executeNamedSql("com.dcf.form.runtime.cardform.excuteSql", sql);

			
		}
		
		return retcode;
	}
	
	private String[] getAndExcuteSqlIntroduceSave(List<SysField> fields,String tablename,Map param,List<Map> busPkField,HttpSession session,String formId) {
		// TODO Auto-generated method stub
		String productName =(String)session.getAttribute("productName");
		String[] retcode = new String[2];
		//1 确定主键字段 
		String pkField = getPkField(fields); 
		if( pkField==null){
			return  null;
		}
		
		String userId = session.getAttribute("userid")+"";
		
		IsysFormColumnService service = (IsysFormColumnService)SpringContextUtils.getBeanById("SysFormColumnServiceImpl");
		//获取当前表单和当前用户下所有有权限字段集合。
		List<SysFormColumn> roleFields = service.queryColumnsByFormIdAndUserId(formId+"", userId);
		//2 确定主键值
		String pkValueStr = param.get(pkField)+"";
		Long pkValue = 0l;
		boolean isPkvalue = false;
		if(StringUtils.isNotNullAndBlank(pkValueStr)) {
			pkValue = Long.parseLong(pkValueStr);
//			确定插入或更新
			String sql = RuntimeUtil.getCheckSqlPkDataSql(pkField,pkValueStr,tablename);
			List<Map> objs;
			try {
				Map map= new HashMap();
				map.put("formDefSql", sql);
				objs = MybatisUtil.queryList("runtime.queryByFormDefSql", map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new DcfException(e);
			}
			//DataObject[] objs = getDASTemplate().queryByNamedSql(DataObject.class, "com.dcf.form.runtime.cardform.excuteQuerySql", sql);
			if(objs.size()>0){
				isPkvalue = true;
			}
		}
		
		if(pkValue==null||pkValue<=0||isPkvalue==false){ //生成insert
			List<String> insert = new ArrayList<String>();
			List values = new ArrayList();
			for(int i=0; i<fields.size();i++){
				SysField field = fields.get(i);
				Boolean isInRole = false;
				for (int j = 0; j < roleFields.size(); j++) {
					if (ChangeCode.getRealCode(field.getFieldTablename()).equalsIgnoreCase(roleFields.get(j).getFormFieldTablename())) {
						isInRole= true;
					}
				}
				if(!userId.equalsIgnoreCase("1")){
					if (isInRole==false) {
						continue;
					}
				}
				String filedTablename = field.getFieldTablename();
				if(pkField.equalsIgnoreCase(filedTablename)){
					//主键字段
					String pkv = (String)param.get(ChangeCode.getRealCode(filedTablename));
					if(pkv==null||pkv==""){
					long pk;
					try {
						pk = keyserviceImpl.getMaxId(tablename,ChangeCode.getRealCode(pkField));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						throw new DcfException(e);
					}
					if(productName.equalsIgnoreCase("Oracle")){
						//insert.add(pkField);
						retcode[0]=pkField+"";
						retcode[1]=pk+"";
						//values.add(pk);
					}else if(productName.equalsIgnoreCase("SqlServer")){
						
					}
					}else {
							//insert.add(pkField);
							retcode[0]=pkField+"";
							retcode[1]=pkv+"";
							//values.add(pkv);
					}
				}else {//非主键字段
					if(param.containsKey(filedTablename)){ //传入的参数中包含此字段
						String fielsBusKey = "";
						/*String fieldBusKeyType =fields.get(i).getField.getString("fieldBusKeyType");
						
						if("1".equalsIgnoreCase(fieldBusKeyType)){
							String empCompId = (String)param.get("EMP_COMP_ID");
							if(empCompId !=null){
								long pk = DcfUtil.getPrimaryKey(tablename+"."+pkField);
								Random random=new Random();
						        long randomint = random.nextInt(899999)+100000;
								fielsBusKey = empCompId+"-"+pk+"-"+randomint;
							}
						}*/
						insert.add(filedTablename);
						if(fielsBusKey==null||fielsBusKey==""){
							values.add((String)param.get(filedTablename));
						}else{
							values.add(fielsBusKey);
						}
						
						String islog =fields.get(i).getFieldIsLog();
						
						/*
						if("2".equalsIgnoreCase(fieldBusKeyType)){
							String fieldChinaName =fields[i].getString("fieldChinaName");
							logger.info(fieldChinaName);
						}
						if("3".equalsIgnoreCase(fieldBusKeyType)){
							String fieldChinaName =fields[i].getString("fieldChinaName");
							logger.info(fieldChinaName);
						}*/
						if("Y".equalsIgnoreCase(islog)){ //判断是否要记录操作记录
							//生成数据 后期实现
							if( param.get(filedTablename)!=null){
								//ISysFieldLogService service = (ISysFieldLogService)SpringContextUtils.getBeanById("ISysFieldLogService");
								SysFieldLog flog = new SysFieldLog();
								flog.setLogTableName(tablename);
								flog.setLogFieldName(ChangeCode.getRealCode(filedTablename));
								//LOG_FIELD_AFTER
								flog.setLogFieldAfter(param.get(filedTablename)+"");
								flog.setLogType("1");
								DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						        String date1=date.format(new Date());
						        SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
						        Date logTime = null;
								try {
									logTime = sdf.parse(date1);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();logger.error(e.getMessage(),e);
								}
								flog.setLogTime(logTime);
								flog.setLogOperator(session.getAttribute("userid")+"");
								flog.setLogIp(session.getAttribute("ipAddress")+"");

								sysFieldLogMapper.insert(flog);
							}
						}
					}
				}
			}
			//检查业务主键是否重复
			String sql2;
			try {
				sql2 = RuntimeUtil.getCheckSqlBusPkDataSql(tablename,param, busPkField,session,"sqlserver");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			if(sql2!=null) {
				List<Map> objs2;
				try {
					objs2 = MybatisUtil.queryList("runtime.selectSql",sql2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
					throw new DcfException(e);
				}
				//DataObject[] objs2 = getDASTemplate().queryByNamedSql(DataObject.class, "com.dcf.form.runtime.cardform.excuteQuerySql", sql2);
				if(objs2.size()>0){ //如果技术主键判断为新增 且业务技术主键查出结果==2条 是不允许
					String labletablename = "";
					for(Map temp :busPkField){
						labletablename+=(String)temp.get("fieldChinaname")+"、";
					}
					return new String[]{"error","保存失败！("+labletablename+")存在重复，请检查!"};
				}
				
			}
			
			String sql = "";
			try {
				sql = RuntimeUtil.getIntroduceInsertSql(insert, values, fields,tablename,session);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				
				
				throw new DcfException(e);
			}
			logger.info("insertSql:"+sql);
			try {
				MybatisUtil.insert("runtime.insertSql", sql);
				//retcode[0]="0";
				//retcode[1]="执行成功";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			//getDASTemplate().executeNamedSql("com.dcf.form.runtime.cardform.excuteSql", sql);
		}else {//生成update
			List<String> update = new ArrayList<String>();
			List values = new ArrayList();
			
			for(int i=0; i<fields.size();i++){
				SysField field = fields.get(i);
				String filedTablename = field.getFieldTablename();
				if(pkField.equalsIgnoreCase(filedTablename)){
					retcode[0]=pkField+"";
					retcode[1]=pkValue+"";
				}else {//非主键字段
					if(param.containsKey(filedTablename)){ //传入的参数中包含此字段
						update.add(filedTablename);
						values.add((String)param.get(filedTablename));
						String islog =fields.get(i).getFieldIsLog();
						if("Y".equalsIgnoreCase(islog)){ //判断是否要记录操作记录
							//ISysFieldLogService service = (ISysFieldLogService)SpringContextUtils.getBeanById("ISysFieldLogService");
							//当前字段值
							String afterFieldValue =  param.get(filedTablename)+"";
							
							//查原有记录	
							String formatFieldname = fields.get(i).getFieldCode();
							String queryBeforeSql = "select "+formatFieldname+" from  "+tablename+" t WHERE t."+ChangeCode.getRealCode(pkField)+" = "+pkValue;
							logger.info(queryBeforeSql);
							List<Map> before = tMapperExt.queryByFormDefSql(queryBeforeSql);
							
							String beforValue = null;
							if(before.size()>0){
								String realField = ChangeCode.getRealCode(filedTablename);
								beforValue = before.get(0).get(realField)+"";
							}
							if(!(afterFieldValue==null&&beforValue==null)){
								
								boolean isLog = (afterFieldValue==null&&beforValue!=null)||(afterFieldValue!=null&&beforValue==null)
												||!(afterFieldValue.equalsIgnoreCase(beforValue));
								if(isLog){
									SysFieldLog flog = new SysFieldLog();
									flog.setLogTableName(tablename);
									flog.setLogFieldName(ChangeCode.getRealCode(filedTablename));
									//LOG_FIELD_AFTER
									flog.setLogFieldBefore(beforValue);
									flog.setLogFieldAfter(param.get(filedTablename)+"");
									flog.setLogType("2");
									DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							        String date1=date.format(new Date());
							        SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
							        Date logTime = null;
									try {
										logTime = sdf.parse(date1);
									} catch (ParseException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();logger.error(e.getMessage(),e);
									}
									flog.setLogTime(logTime);
									flog.setLogOperator(session.getAttribute("userid")+"");
									flog.setLogIp(session.getAttribute("ipAddress")+"");
									sysFieldLogMapper.insert(flog);
								}
								
							}
						}
					}
					
				}
			}
			String sql;
			try {
				sql = RuntimeUtil.getUpdateSql(update, values, fields,tablename,pkField,pkValue,session,"sqlserver");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			logger.info("updateSql:"+sql);
			//log.info(sql);
			try {
				Map map= new HashMap();
				map.put("updateSql", sql);
				MybatisUtil.update("runtime.updateSql", map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			//getDASTemplate().executeNamedSql("com.dcf.form.runtime.cardform.excuteSql", sql);
		}
		return retcode;
	}
	
	/**
	 * 生成sql update或者insert语句
	 * @param fields
	 * @param tablename
	 * @param params
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public String[] getAndExcuteSqlSave(List<SysField> fields,String tablename,Map param,List<Map> busPkField,HttpSession session,String formId,String sourceType) throws RuntimeException{
 		String productName =(String)session.getAttribute("productName");
		String[] retcode = new String[2];
		//1 确定主键字段 
		String pkField = getPkField(fields).toUpperCase(); 
		if( pkField==null){
			return  null;
		}
		
		String userId = session.getAttribute("userid")+"";
		
		IsysFormColumnService service = (IsysFormColumnService)SpringContextUtils.getBeanById("SysFormColumnServiceImpl");
		//获取当前表单和当前用户下所有有权限字段集合。
		List<SysFormColumn> roleFields = service.queryColumnsByFormIdAndUserId(formId+"", userId);
		//2 确定主键值
		String pkValueStr = param.get(pkField)+"";
		Long pkValue = 0l;
		boolean isPkvalue = false;
		if(StringUtils.isNotNullAndBlank(pkValueStr)) {
			pkValue = Long.parseLong(pkValueStr);
//			确定插入或更新
			String sql = RuntimeUtil.getCheckSqlPkDataSql(pkField,pkValueStr,tablename);
			List<Map> objs;
			try {
				Map map= new HashMap();
				map.put("formDefSql", sql);
				objs = MybatisUtil.queryList("runtime.queryByFormDefSql", map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new DcfException(e);
			}
			//DataObject[] objs = getDASTemplate().queryByNamedSql(DataObject.class, "com.dcf.form.runtime.cardform.excuteQuerySql", sql);
			if(objs.size()>0){
				isPkvalue = true;
			}
		}
		
		if(pkValue==null||pkValue<=0||isPkvalue==false){ //生成insert
			List<String> insert = new ArrayList<String>();
			List values = new ArrayList();
			for(int i=0; i<fields.size();i++){
				SysField field = fields.get(i);
				Boolean isInRole = false;
				for (int j = 0; j < roleFields.size(); j++) {
					if (ChangeCode.getRealCode(field.getFieldTablename()).equalsIgnoreCase(roleFields.get(j).getFormFieldTablename())) {
						isInRole= true;
					}
				}
				
				
				String sql = "select role_id from sys_user_role where user_id = "+userId;
				List<Map> dataObject = null;
				CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_sqlserver);
				try {
					dataObject = MybatisUtil.queryList("runtime.selectSql", sql);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(sourceType.toUpperCase().equalsIgnoreCase("ORACLE")){
					CustomerContextHolder.setContextType(CustomerContextHolder.session_factory_oracle);
				}
				
				Boolean isAdmin = false;
				for (int j = 0; j < dataObject.size(); j++) {
					if ((dataObject.get(j).get("role_id")+"").equalsIgnoreCase("229")||(dataObject.get(j).get("ROLE_ID")+"").equalsIgnoreCase("229")) {
						isAdmin = true;
					}
				}
				if(isAdmin==false){
					if (isInRole==false) {
						continue;
					}
				}
				String filedTablename = field.getFieldTablename().toUpperCase();
				if(pkField.equalsIgnoreCase(filedTablename)){
					//主键字段
//					String pkv = (String)param.get(ChangeCode.getRealCode(filedTablename));
					String pkv = (String)param.get(filedTablename);
					if(pkv==null||pkv==""){
					long pk;
					try {
						pk = keyserviceImpl.getMaxId(tablename,ChangeCode.getRealCode(pkField));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						throw new DcfException(e);
					}
					if(productName.equalsIgnoreCase("Oracle")){
						//insert.add(pkField);
						retcode[0]=pkField+"";
						retcode[1]=pk+"";
						//values.add(pk);
					}else if(productName.equalsIgnoreCase("SqlServer")){
						
					}
					}else {
							//insert.add(pkField);
							retcode[0]=pkField+"";
							retcode[1]=pkv+"";
							//values.add(pkv);
					}
				}else {//非主键字段
					if(param.containsKey(filedTablename)){ //传入的参数中包含此字段
						String fielsBusKey = "";
						/*String fieldBusKeyType =fields.get(i).getField.getString("fieldBusKeyType");
						
						if("1".equalsIgnoreCase(fieldBusKeyType)){
							String empCompId = (String)param.get("EMP_COMP_ID");
							if(empCompId !=null){
								long pk = DcfUtil.getPrimaryKey(tablename+"."+pkField);
								Random random=new Random();
						        long randomint = random.nextInt(899999)+100000;
								fielsBusKey = empCompId+"-"+pk+"-"+randomint;
							}
						}*/
						insert.add(filedTablename);
						if(fielsBusKey==null||fielsBusKey==""){
							values.add((String)param.get(filedTablename));
						}else{
							values.add(fielsBusKey);
						}
						
						String islog =fields.get(i).getFieldIsLog();
						
						/*
						if("2".equalsIgnoreCase(fieldBusKeyType)){
							String fieldChinaName =fields[i].getString("fieldChinaName");
							logger.info(fieldChinaName);
						}
						if("3".equalsIgnoreCase(fieldBusKeyType)){
							String fieldChinaName =fields[i].getString("fieldChinaName");
							logger.info(fieldChinaName);
						}*/
						if("Y".equalsIgnoreCase(islog)){ //判断是否要记录操作记录
							//生成数据 后期实现
							if( param.get(filedTablename)!=null){
								//ISysFieldLogService service = (ISysFieldLogService)SpringContextUtils.getBeanById("ISysFieldLogService");
								SysFieldLog flog = new SysFieldLog();
								flog.setLogTableName(tablename);
								flog.setLogFieldName(ChangeCode.getRealCode(filedTablename));
								//LOG_FIELD_AFTER
								flog.setLogFieldAfter(param.get(filedTablename)+"");
								flog.setLogType("1");
								DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						        String date1=date.format(new Date());
						        SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
						        Date logTime = null;
								try {
									logTime = sdf.parse(date1);
								} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();logger.error(e.getMessage(),e);
								}
								flog.setLogTime(logTime);
								flog.setLogOperator(session.getAttribute("userid")+"");
								flog.setLogIp(session.getAttribute("ipAddress")+"");

								sysFieldLogMapper.insert(flog);
							}
						}
						
						Long fieldRuleId =fields.get(i).getFieldRuleId();
						String fieldRuleMax =fields.get(i).getFieldRuleMax();
						if (fieldRuleId!=null) {
							if (fieldRuleMax==null||fieldRuleMax.equalsIgnoreCase("")) {
								fields.get(i).setFieldRuleMax("1");
							}else {
								fields.get(i).setFieldRuleMax((Long.parseLong(fieldRuleMax)+1)+"");
							}
							sfmapper.updateByPrimaryKey(fields.get(i));
						}
					}
				}
			}
			//检查业务主键是否重复
			String sql2;
			try {
				sql2 = RuntimeUtil.getCheckSqlBusPkDataSql(tablename,param, busPkField,session,sourceType);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			if(sql2!=null) {
				List<Map> objs2;
				try {
					objs2 = MybatisUtil.queryList("runtime.selectSql",sql2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
					throw new DcfException(e);
				}
				//DataObject[] objs2 = getDASTemplate().queryByNamedSql(DataObject.class, "com.dcf.form.runtime.cardform.excuteQuerySql", sql2);
				if(objs2.size()>0){ //如果技术主键判断为新增 且业务技术主键查出结果==2条 是不允许
					String labletablename = "";
					for(Map temp :busPkField){
						labletablename+=(String)temp.get("fieldChinaname")+"、";
					}
					return new String[]{"error","保存失败！("+labletablename+")存在重复，请检查!"};
				}
				
			}
			
			String sql = "";
			try {
				sql = RuntimeUtil.getInsertSql(insert, values, fields,tablename,session,sourceType);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				
				
				throw new DcfException(e);
			}
			logger.info("insertSql:"+sql);
			try {
				MybatisUtil.insert("runtime.insertSql", sql);
				if(retcode[0]==null&&retcode[1]==null){
					retcode[0]="0";
					retcode[1]="执行成功";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			//getDASTemplate().executeNamedSql("com.dcf.form.runtime.cardform.excuteSql", sql);
		}else {//生成update
			List<String> update = new ArrayList<String>();
			List values = new ArrayList();
			
			for(int i=0; i<fields.size();i++){
				SysField field = fields.get(i);
				String filedTablename = field.getFieldTablename().toUpperCase();
				if(pkField.equalsIgnoreCase(filedTablename)){
					retcode[0]=pkField+"";
					retcode[1]=pkValue+"";
				}else {//非主键字段
					if(param.containsKey(filedTablename)){ //传入的参数中包含此字段
						update.add(filedTablename);
						logger.info(param.get(filedTablename)+"");
						String fieldType = getFieldByFieldTablename(filedTablename,fields);
						if(fieldType.equals("DATETIME")||fieldType.equals("datetime")){
							values.add(param.get(filedTablename+"_NEWDATE")+"");
						}else{
						values.add(param.get(filedTablename)+"");
						}
						String islog =fields.get(i).getFieldIsLog();
						if("Y".equalsIgnoreCase(islog)){ //判断是否要记录操作记录
							//ISysFieldLogService service = (ISysFieldLogService)SpringContextUtils.getBeanById("ISysFieldLogService");
							//当前字段值
							String afterFieldValue =  param.get(filedTablename)+"";
							
							//查原有记录	
							String formatFieldname = fields.get(i).getFieldCode();
							String queryBeforeSql = "select "+formatFieldname+" from  "+tablename+" t WHERE t."+ChangeCode.getRealCode(pkField)+" = "+pkValue;
							logger.info(queryBeforeSql);
							List<Map> before = tMapperExt.queryByFormDefSql(queryBeforeSql);
							
							String beforValue = null;
							if(before.size()>0){
								String realField = ChangeCode.getRealCode(filedTablename);
								beforValue = before.get(0).get(realField)+"";
							} 
							if(!(afterFieldValue==null&&beforValue==null)){
								
								boolean isLog = (afterFieldValue==null&&beforValue!=null)||(afterFieldValue!=null&&beforValue==null)
												||!(afterFieldValue.equalsIgnoreCase(beforValue));
								if(isLog){
									SysFieldLog flog = new SysFieldLog();
									flog.setLogTableName(tablename);
									flog.setLogFieldName(ChangeCode.getRealCode(filedTablename));
									//LOG_FIELD_AFTER
									flog.setLogFieldBefore(beforValue);
									flog.setLogFieldAfter(param.get(filedTablename)+"");
									flog.setLogType("2");
									DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							        String date1=date.format(new Date());
							        SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" );
							        Date logTime = null;
									try {
										logTime = sdf.parse(date1);
									} catch (ParseException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();logger.error(e.getMessage(),e);
									}
									flog.setLogTime(logTime);
									flog.setLogOperator(session.getAttribute("userid")+"");
									flog.setLogIp(session.getAttribute("ipAddress")+"");
									sysFieldLogMapper.insert(flog);
								}
								
							}
						}
					}
					
				}
			}
			String sql;
			try {
				sql = RuntimeUtil.getUpdateSql(update, values, fields,tablename,pkField,pkValue,session,sourceType);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			logger.info("updateSql:"+sql);
			//log.info(sql);
			try {
				Map map= new HashMap();
				map.put("updateSql", sql);
				MybatisUtil.update("runtime.updateSql", map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			//getDASTemplate().executeNamedSql("com.dcf.form.runtime.cardform.excuteSql", sql);
		}
		return retcode;
	}
	
	public static String getPkField(List<SysField> fields){
		for(SysField f:fields){
			System.out.println(f.getFieldIsKey());
			if("Y".equalsIgnoreCase(f.getFieldIsKey())){
				return f.getFieldTablename();
			}
		}
		return null;
	}

	/**
	 * 执行sql调用的sql
	 * @throws Exception 
	 * @throws SQLException 
	 */
	public String[] execButtonExecSql(String formId, long execSqlRelaid, Map<String, Object> p,HttpSession session,String sourceType) throws Exception {
		String userId = session.getAttribute("userid")+"";
		SysFormconfigCache form = sysformconfigService.getForm(formId);
		SysFormButtonCache button = form.getButton(execSqlRelaid);
		SysFormGeneralExecSqlCache buttonExecSql = (SysFormGeneralExecSqlCache)button.getButtonExt();
		
		String execSql = buttonExecSql.getExecSql();
		execSql = execSql.trim();
		try {
			if(execSql.indexOf("call") == 0){//存储过程
				return RuntimeUtil.execPrepare(buttonExecSql, keyserviceImpl, p,MybatisUtil.getConnection(),session);
			}
			else {//sql
					 RuntimeUtil.execsql(buttonExecSql, keyserviceImpl, p,session,sourceType);
			}
		}catch (Exception e) {
			// TODO: handle exception
			throw new DcfException(e.getMessage());
		}
		return new String[]{"000000","操作成功"};
	}
	
	/**
	 * 执行存储过程
	 * @throws SQLException 
	 */
	public String[] execPrepare(Map<String, Object> p,String pname ) throws DcfException, SQLException { 
//		 TODO 自动生成方法存根
		pname="call "+pname+"(?,?)";
		String res [] = MyEhrJDBCUtil.execPrepare(MybatisUtil.getConnection(), pname);
		return res;
	}
	
	/**
	 * 执行sql调用的sql
	 * @throws SQLException 
	 */
	public String[] execExecSqlForColumnName(long formId,long columnId, long execSqlRelaid, Map<String, String> p) throws SQLException {
		//暂时不实现
		/*SysFormconfigCache form = formService.getForm(""+formId);
		SysFormColumnCache column = form.serchColumnByColumnId(columnId);
		
		SysLookup lookup = (SysLookup)column.getFormColumGui();
		SysFormGeneralExecSql buttonExecSql = (SysFormGeneralExecSql)lookup.getBackSql();
		String execSql = buttonExecSql.getExecSql();
		execSql = execSql.trim();
		//if(execSql.indexOf("call") == 0){//存储过程
		//	return RuntimeUtil.execPrepare(buttonExecSql, getDASTemplate(), p,getDASTemplate().getDataSource().getConnection());
		//}
		//else {//sql
		String ret = RuntimeUtil.execsqlForColumnName(buttonExecSql, getDASTemplate(), p);
		if(ret!=null){
			return new String[]{"000000",ret};
		}*/
		//}
		return new String[]{"-1",null};
	}
	
	/**
	 * 引入公共逻辑
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public String[] introduceData(long formId,long buttonId,Map<String,String>[] arr,Map<String, String> params) throws Exception{
		//后期开发
		SysFormconfigCache form  = sysformconfigService.getForm(formId+"");
		String result[] = new String[2];
		result[0] = "success";
		result[1] = "引入成功";
		//主要生产保存map参数
		SysFormButtonCache button = form.getButton(buttonId);
		SysFormButtonIntroduceCache introduce = (SysFormButtonIntroduceCache)button.getButtonExt();
		List<SysFormButtonIntrDetailCache> details = introduce.getDetails();
		
		/**
		 * 请求和会话参数处理
		 */
		Map<String, String> paramobj = new HashMap<String,String>();
		Iterator<String> paramkeys = params.keySet().iterator();
		while(paramkeys.hasNext()){
			String key = (String) paramkeys.next();
			String value = params.get(key);
			for(int k=0; k<details.size(); k++){
				if("r".equalsIgnoreCase(details.get(k).getTargetColumnType()) || "s".equalsIgnoreCase(details.get(k).getTargetColumnType())||"1".equalsIgnoreCase(details.get(k).getTargetColumnType())){
					if(key.equalsIgnoreCase(details.get(k).getTargetColumnId())){
						SysFormColumnCache column = details.get(k).getFormColumn();
						paramobj.put(column.getFormFiledTablename(), value);
						break;
					}
				}
			}
		}
		
	/**
	 * 开发参数处理
	 */
			
		for(int k=0; k<details.size(); k++){
			String type = details.get(k).getTargetColumnType();
			if("l".equalsIgnoreCase(type)){
				SysFormColumnCache column = details.get(k).getFormColumn();
				String target = details.get(k).getTargetColumnId();
				String value =arr[0].get(target);
				paramobj.put(column.getFormFiledTablename(), value);
				break;
			}
		}

		for(int i=0; i<arr.length; i++){
			Map obj = new HashMap();
			Map<String,String> temp = arr[i];
			Iterator<String> keys = temp.keySet().iterator();
			while(keys.hasNext()) {
				String key = (String) keys.next();
				String value=temp.get(key);
				for(int k=0; k<details.size(); k++){
					if("r".equalsIgnoreCase(details.get(k).getTargetColumnType()) || "s".equalsIgnoreCase(details.get(k).getTargetColumnType())||"l".equalsIgnoreCase(details.get(k).getTargetColumnType()) ){
						continue;
					}
					SysFormColumnCache column = details.get(k).getFormColumn();
					SysFormColumnCache targetColumn = details.get(k).getTargetColumn();
					if(targetColumn.getFormFiledTablename().equalsIgnoreCase(key)){
						obj.put(column.getFormFiledTablename(), value);
						break;
					}
				}
			}
			obj.putAll(paramobj);
			
			//
			
			Map<String,Object> paramsMap = new HashMap<String,Object>();
			//处理字段参数
			SysFormButtonCache b = form.serchButtonButtonId(buttonId+"");
			SysFormGeneralExecSqlCache a = b.getHzSql();
			if(a!=null&&a.getExecSqlId()!=0){
				List<String[]> p = a.getParams();
				for(String[] ptemp:p){
					if(ptemp[0].equalsIgnoreCase("c")){
						String columnId = ptemp[1].substring(ptemp[1].lastIndexOf("_")+1);
						String fieldName = (form.serchColumnByColumnId(Long.parseLong(columnId)).getJsId("name",String.valueOf(form.getFormDefId())));
						paramsMap.put("c_"+columnId, paramobj.get(fieldName));
					}
				}
			}
			String[] r  = this.cardFormSaveButtonSave(obj, formId+"",paramsMap,buttonId+"",null,"introduce","sqlserver");
			if(!r[0].endsWith("error")){
				continue;
			}else {
				return r;
			}
		}
		
		return result;
	}
	
	/**
	 * 获取导入文件头信息
	 */
	public DcfReponse getImportFileHead(String filePath) {
		DcfReponse dcfReponse = new DcfReponse();
		if (filePath !=null && filePath!="") {
			try {
				Map<String, String> headMap = null;
				
				if (filePath.endsWith(".xls")) {
					headMap = ExcelUtil.readExcelHeadFor2003(filePath, 1);
				} else if (filePath.endsWith(".xlsx")) {
					headMap = ExcelUtil.readExcelHeadFor2007(filePath, 1);
				}
				
				dcfReponse.setSuccessResponse(headMap);
			} catch (FileNotFoundException e) {
				dcfReponse.setFailureMsg("根据文件路径未找到导入的文件", e);
			} catch (IOException e) {
				dcfReponse.setFailureMsg("导入异常，请联系管理员", e);
			} catch (Throwable t) {
				dcfReponse.setFailureMsg("导入异常，请联系管理员", t);
				t.printStackTrace();
			}
		} else {
			dcfReponse.setFailureMsg("上传文件地址为空", null);
		}
		
		return dcfReponse;
	}
	
	/**
	 * 获取form的表单配置字段
	 * */
	 
	public ImportField[] getFormField(String formId) {
		ImportField[] importField = null;
		
		//IsysFormColumnService service = (IsysFormColumnService)ApplicationContextFactory.getContext().getBean("EntityCardFormBean");
		IsysFormColumnService service =  (IsysFormColumnService)SpringContextUtils.getBeanById("SysFormColumnServiceImpl");
		if (formId == null) {
			return null;
		} else {
			List<SysFormColumn> objs = service.queryCardFormColumns(formId, false,false,"1");
			if (objs != null && objs.size() > 0) {
				importField = new ImportField[objs.size()];
				for (int i = 0; i < objs.size(); i++) {
					importField[i] = new ImportField();
					importField[i].setFieldId(objs.get(i).getFormColumnId().longValue());
					importField[i].setFieldTalbename(objs.get(i).getFormFieldTablename());
					importField[i].setFieldLableName(objs.get(i).getFormColumnLable());
				}
			}
			
			return importField;
		}
	}
	
	/**
	 * 导入Excel数据
	 * @param fromId 表单ID
	 * @param fileName 导入的excel在服务器的名称
	 * @param repeOper 重复操作标识
	 * @param execptOper 导入异常操作标识
	 * @param fieldSet 字段映射配置
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Transactional(noRollbackFor=RuntimeException.class) 
	public DcfReponse importExcelData(String formId, String filePath, String clientFileName, String repeOper, String execptOper, Map<String, String>[] fieldSet,long buttonId,HttpServletRequest request,String sourceType) {
		DcfReponse dcfReponse = new DcfReponse();
		
		//ITransactionManager txManager = null;
		
		/*if (!"1".equalsIgnoreCase(execptOper)) {
			txManager = TransactionManagerFactory.getTransactionManager();// 事务
			txManager.begin();// 事务开始
		}*/
		String userId = request.getSession().getAttribute("userid")+"";
		List<Map<String, Object>> errorDatas = new ArrayList<Map<String, Object>>();
		try {
			SysFormconfigCache form = sysformconfigService.getForm(formId);
			if (form != null) {
				String saveTableName = form.getFormDefSaveTable();
				SysFormColumnCache techPkColumn = form.getPkColumn();
				if (techPkColumn == null) {
					throw new DcfException("表单[" + formId + "]未配置主键信息，请联系系统管理员");
				}
				
				String teckPkName = techPkColumn.getFormFiledTablename();// 技术主键
				
				// 获取业务主键 字段
				SysFormButtonImportCache s = (SysFormButtonImportCache) form.getButton(buttonId).getButtonExt();
				List<SysFormColumnCache> busiPkColumns = s.getBusKeyColumns();
				
				List<Map<String, Object>> importDatas = null;
				if (filePath.endsWith(".xls")) {
					importDatas = ExcelUtil.readExcelFor2003(filePath, 2);
				} else if (filePath.endsWith(".xlsx")) {
					importDatas = ExcelUtil.readExcelFor2007(filePath, 2);
				}
				
				List<SysFormColumnCache> columns = form.getColumns();
				
				// fieldSet 处理字段被重新指定导入字段
				for (int k = 0; k < fieldSet.length; k++) {
					String tempname = fieldSet[k].get("importfield");
					SysFormButtonImportColumnCache ic = s.getColumnconfigByName(tempname);
					if (ic!=null && ic.getImportReColumnRelId() > 0) {
						String importReColumnRelColumnName = ic.getImportReColumnRelColumnName();
						String[] aa = importReColumnRelColumnName.split("_");
						String importReColumnRelColumnNameNew = "";
						for (int i = 0; i < aa.length-1; i++) {
							importReColumnRelColumnNameNew+=aa[i]+"_";
						}
						importReColumnRelColumnNameNew = importReColumnRelColumnNameNew.substring(0,importReColumnRelColumnNameNew.length()-1);
						fieldSet[k].put("reimportfield", ChangeCode.getRealCode(importReColumnRelColumnNameNew));
						tempname = ic.getImportReColumnRelColumnName();
					}
					
					String tempCell = fieldSet[k].get("cell");
					if (tempCell!=null && tempCell!="") {
						for (int m = 0; m < columns.size(); m++) {
							if (tempname.equalsIgnoreCase(columns.get(m).getFormFiledTablename())) {
								String formColumnGuiType = columns.get(m).getFormColumnGuiType();
								if ("6".equalsIgnoreCase(formColumnGuiType)) {
									Object datepickerObject = columns.get(m).getFormColumGui();
									if (datepickerObject != null) {
										SysDatepickerCache datepicker = (SysDatepickerCache)datepickerObject;
										String formatStr = datepicker.getDatepickerFormat();
										if ("yyyy-MM".equalsIgnoreCase(formatStr)) {
											for (int n = 0; n < importDatas.size(); n++) {
												String tempValue = (String)importDatas.get(n).get(tempCell);
												if (tempValue!=null && tempValue!="") {
													importDatas.get(n).put(tempCell, tempValue.substring(0, 7));
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
				if (importDatas != null && importDatas.size() > 0) {
					int errorCount = 0;
					for (int i = 0; i < importDatas.size(); i++) {
						Map<String, Object> importData = importDatas.get(i);
						//确定当前字段是否需要翻译
						Map dataObj = null;// 获取待入库的数据
						Map selectobj = null;
						Boolean importForbid = false;
						for (int k = 0; k < fieldSet.length; k++) {
							String tempname = fieldSet[k].get("importfield").toUpperCase();
							String cellname = fieldSet[k].get("cell");
							//if (tempname.equalsIgnoreCase("POLITICALSTATUS")) {
								//logger.info(tempname);
							//}
							SysFormButtonImportColumnCache ic = s.getColumnconfigByName(tempname);
							if (ic==null) {
								//logger.info(tempname);
								continue;
							}
							String importColumnForbid = ic.getImportColumnForbid();
							if (importColumnForbid!=null && importColumnForbid.equalsIgnoreCase("null")) {
								String value = importData.get(cellname)+"";
								if (value.equalsIgnoreCase("")||value.equalsIgnoreCase("-")) {
									importForbid=true;
								}
							}else if (importColumnForbid!=null && importColumnForbid.equalsIgnoreCase("0")) {
								String value = importData.get(cellname)+"";
								if (value.equalsIgnoreCase("0")) {
									importForbid=true;
								}
							}else if (importColumnForbid!=null && importColumnForbid.equalsIgnoreCase("1")) {
								String value = importData.get(cellname)+"";
								if (value.equalsIgnoreCase("1")) {
									importForbid=true;
								}
							}
						}
						if (importForbid==true) {
							continue;
						}
						try {
							//处理字典或者sql翻译
							PrimaryKeyService pkService = null;
							importData = ImportButtonManager.dealBusDictAndSql(importData, fieldSet, form, s,pkService,request,sourceType);
							
							//检查是否业务主键重复
							selectobj = ImportButtonManager.checkBusPk(busiPkColumns, importData, saveTableName, fieldSet);
						} catch (Exception t) {// 校验失败
							errorCount++;
							t.printStackTrace();
							String message = t.getMessage();
							if (message!=null && message!="") {
								importData.put("cellError", message);
							} else {
								importData.put("cellError", "未知错误");
							}
							continue;
						}
						
						if (selectobj != null) {
							// 根据业务主键查询到记录信息，根据用户导入时的重复操作，判断是否更新记录
							if ("1".equalsIgnoreCase(repeOper)) {
								dataObj = ImportButtonManager.getSaveData(form, fieldSet, importData);
								if (dataObj != null && dataObj.size() > 0) {
									if (!dataObj.containsKey(teckPkName)) {
										dataObj.put(teckPkName, selectobj.get(teckPkName));
									}
								}
							}
						} else {
							// 新增记录
							dataObj = ImportButtonManager.getSaveData(form, fieldSet, importData);
						}
						
						// 判断是否存在唯一约束冲突的
						try {
							String uniqueStr = ImportButtonManager.checkUnique(form, s, dataObj, saveTableName);
							if (uniqueStr!=null&&uniqueStr!="") {
								errorCount++;
								importData.put("cellError", uniqueStr + "违反唯一约束");
								continue;
							}
						} catch (Exception t) {// 校验失败
							errorCount++;
							t.printStackTrace();
							String message = t.getMessage();
							if (message!=""&& message!="") {
								importData.put("cellError", message);
							} else {
								importData.put("cellError", "未知错误");
							}
							
							continue;
						}
						if (dataObj != null && dataObj.size() > 0) {
							try {
								Map<String,Object> paramsMap = new HashMap<String,Object>();
								//处理字段参数
								SysFormButtonCache b = form.serchButtonButtonId(buttonId+"");
								SysFormGeneralExecSqlCache a = b.getHzSql();
								if(a!=null&& a.getPojo()!=null &&a.getExecSqlId()!=0){
									List<String[]> p = a.getParams();
									for(String[] temp:p){
										if(temp[0].equalsIgnoreCase("c")){
											String columnId = temp[1].substring(temp[1].lastIndexOf("_")+1);
											String fieldName = (form.serchColumnByColumnId(Long.parseLong(columnId)).getJsId("name",formId));
											paramsMap.put("c_"+columnId, dataObj.get(fieldName));
										}
									}
								}
								if ("1".equalsIgnoreCase(execptOper)) {
									/*txManager = TransactionManagerFactory.getTransactionManager();// 事务
									txManager.begin();// 事务开始
*/								}
								String[] returnInfo = null;
								
								try {
									returnInfo = cardFormSaveButtonSave(dataObj, formId,paramsMap,buttonId+"",request,"import",sourceType);
								} catch (Exception e) {
									importData.put("cell"+importData.size(), e.getMessage());
									errorDatas.add(importData);
									e.printStackTrace();logger.error(e.getMessage(),e);
									returnInfo = new String[]{"error", e.getMessage()};
								}
								
								if (returnInfo != null && returnInfo.length == 2) {
									if ("error".equalsIgnoreCase(returnInfo[0])) {// 保存出错
										errorCount++;
										importData.put("cellError", returnInfo[1]);
										throw new Throwable(returnInfo[1]);
									}
								}
								if ("1".equalsIgnoreCase(execptOper)) {
									/*if (txManager != null) {
										txManager.commit();// 事务提交
									}*/
								}
								dcfReponse.setMsg(returnInfo[0]);
							} catch (Throwable t) {// 保存失败
								errorCount++;
								String message = t.getMessage();
								if (message!=null&& message!="") {
									importData.put("cellError", message);
								} else {
									importData.put("cellError", "未知错误");
								}
								
								if ("1".equalsIgnoreCase(execptOper)) {
									/*if (txManager != null) {
										logger.info(txManager.getStatus());
										if (!"STATUS_MARKED_ROLLBACK".equalsIgnoreCase(txManager.getStatus())) {
											txManager.rollback();// 事务回滚
										}
									}*/
								}else {
									throw t;
								}
								
							}
						}
					}
					
					if (errorCount > 0) {// 存在错误
						Map<String, String> errorFile = null;
						if (filePath.endsWith(".xls")) {
							//errorFile = ExcelUtil.writeExcelErrorFor2003(filePath, 2, importDatas, importDatas.get(0).size()-2, clientFileName);
						} else if (filePath.endsWith(".xlsx")) {
							//errorFile = ExcelUtil.writeExcelErrorFor2007(filePath, 2, importDatas, importDatas.get(0).size()-2, clientFileName);
						}
						
						dcfReponse.setSuccessResponse(errorFile);
					} else {
						dcfReponse.setSuccessResponse(null);
					}
				} else {
					throw new DcfException("导入的Excel无数据");
				}
			} else {
				throw new DcfException("根据表单ID[" + formId + "]没有获取到表单信息，请联系系统管理员");
			}
			
			if (!"1".equalsIgnoreCase(execptOper)) {
				/*if (txManager != null) {
					txManager.commit();// 事务提交
				}*/
			}
		} catch (Throwable t) {
			t.printStackTrace();
			
			if (!"1".equalsIgnoreCase(execptOper)) {
				/*if (txManager != null) {
					txManager.rollback();// 事务回滚
				}*/
			}
			dcfReponse.setException(t);
		}
		
		return dcfReponse;
	}
	
	/**
	 * 导入Excel数据
	 * @param fromId 表单ID
	 * @param fileName 导入的excel在服务器的名称
	 * @param repeOper 重复操作标识
	 * @param execptOper 导入异常操作标识
	 * @param fieldSet 字段映射配置
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Transactional(noRollbackFor=RuntimeException.class) 
	public String[] importExcelDatax(String formId, String filePath, String clientFileName, String repeOper, String execptOper, Map<String, String>[] fieldSet,long buttonId,HttpServletRequest request,String sourceType,HttpServletResponse response) {
		DcfReponse dcfReponse = new DcfReponse();

		Long startTime = new Date().getTime();
		//ITransactionManager txManager = null;
		
		/*if (!"1".equalsIgnoreCase(execptOper)) {
			txManager = TransactionManagerFactory.getTransactionManager();// 事务
			txManager.begin();// 事务开始
		}*/
		String userId = request.getSession().getAttribute("userid")+"";
		List<Map<String, Object>> errorDatas = new ArrayList<Map<String, Object>>();
		Map<String, Object>  importDatas1 = null;
		Map<String, Object>  importDatas2 = null;
		try {
			SysFormconfigCache form = sysformconfigService.getForm(formId);
			if (form != null) {
				String saveTableName = form.getFormDefSaveTable();
				SysFormColumnCache techPkColumn = form.getPkColumn();
				if (techPkColumn == null) {
					throw new DcfException("表单[" + formId + "]未配置主键信息，请联系系统管理员");
				}
				
				String teckPkName = techPkColumn.getFormFiledTablename();// 技术主键
				
				// 获取业务主键 字段
				SysFormButtonImportCache s = (SysFormButtonImportCache) form.getButton(buttonId).getButtonExt();
				List<SysFormColumnCache> busiPkColumns = s.getBusKeyColumns();
				
				List<Map<String, Object>> importDatas = null;
				
				if (filePath.endsWith(".xls")) {
					importDatas = ExcelUtil.readExcelFor2003(filePath, 2);
					importDatas1 = ExcelUtil.readExcelFor2003(filePath, 1).get(0);
				} else if (filePath.endsWith(".xlsx")) {
					importDatas = ExcelUtil.readExcelFor2007(filePath, 2);
					importDatas2 = ExcelUtil.readExcelFor2007(filePath, 1).get(0);
				}
				List<SysFormColumnCache> columns = form.getColumns();
				logger.info("**********************************标签111********"+(new Date().getTime()-startTime)+"S******************************************");
				// fieldSet 处理字段被重新指定导入字段
				for (int k = 0; k < fieldSet.length; k++) {
					String tempname = fieldSet[k].get("importfield");
					SysFormButtonImportColumnCache ic = s.getColumnconfigByName(tempname);
					if (ic!=null && ic.getImportReColumnRelId() > 0) {
						String importReColumnRelColumnName = ic.getImportReColumnRelColumnName();
						String[] aa = importReColumnRelColumnName.split("_");
						String importReColumnRelColumnNameNew = "";
						for (int i = 0; i < aa.length-1; i++) {
							importReColumnRelColumnNameNew+=aa[i]+"_";
						}
						importReColumnRelColumnNameNew = importReColumnRelColumnNameNew.substring(0,importReColumnRelColumnNameNew.length()-1);
						fieldSet[k].put("reimportfield", ChangeCode.getRealCode(importReColumnRelColumnNameNew));
//						Map<String, Object> map = new HashMap<String, Object>();
//						map.put("cell", "cell"+fieldSet.length.l)
						tempname = ic.getImportReColumnRelColumnName();
					}
					String tempCell = fieldSet[k].get("cell");
					if (tempCell!=null && tempCell!="") {
						for (int m = 0; m < columns.size(); m++) {
							if (tempname.equalsIgnoreCase(columns.get(m).getFormFiledTablename())) {
								String formColumnGuiType = columns.get(m).getFormColumnGuiType();
								if ("6".equalsIgnoreCase(formColumnGuiType)) {
									Object datepickerObject = columns.get(m).getFormColumGui();
									if (datepickerObject != null) {
										SysDatepickerCache datepicker = (SysDatepickerCache)datepickerObject;
										String formatStr = datepicker.getDatepickerFormat();
										if ("yyyy-MM".equalsIgnoreCase(formatStr)) {
											for (int n = 0; n < importDatas.size(); n++) {
												String tempValue = (String)importDatas.get(n).get(tempCell);
												if (tempValue!=null && tempValue!="") {
													importDatas.get(n).put(tempCell, tempValue.substring(0, 7));
												}
											}
										}
									}
								}
							}
						}
					}
				}

				logger.info("**********************************标签111********"+(new Date().getTime()-startTime)+"S******************************************");
				if (importDatas != null && importDatas.size() > 0) {
					int errorCount = 0;
					for (int i = 0; i < importDatas.size(); i++) {
						Map<String, Object> importData = importDatas.get(i);
						//确定当前字段是否需要翻译
						Map dataObj = null;// 获取待入库的数据
						Map selectobj = null;
						Boolean importForbid = false;
						for (int k = 0; k < fieldSet.length; k++) {
							String tempname = fieldSet[k].get("importfield").toUpperCase();
							String cellname = fieldSet[k].get("cell");
							//if (tempname.equalsIgnoreCase("POLITICALSTATUS")) {
								//logger.info(tempname);
							//}
							SysFormButtonImportColumnCache ic = s.getColumnconfigByName(tempname);
							if (ic==null) {
								//logger.info(tempname);
								continue;
							}
							String importColumnForbid = ic.getImportColumnForbid();
							if (importColumnForbid!=null && importColumnForbid.equalsIgnoreCase("null")) {
								String value = importData.get(cellname)+"";
								if (value.equalsIgnoreCase("")||value.equalsIgnoreCase("-")) {
									importForbid=true;
								}
							}else if (importColumnForbid!=null && importColumnForbid.equalsIgnoreCase("0")) {
								String value = importData.get(cellname)+"";
								if (value.equalsIgnoreCase("0")) {
									importForbid=true;
								}
							}else if (importColumnForbid!=null && importColumnForbid.equalsIgnoreCase("1")) {
								String value = importData.get(cellname)+"";
								if (value.equalsIgnoreCase("1")) {
									importForbid=true;
								}
							}
						}
						if (importForbid==true) {
							continue;
						}
						try {
							//处理字典或者sql翻译
							PrimaryKeyService pkService = null;
							importData = ImportButtonManager.dealBusDictAndSql(importData, fieldSet, form, s,pkService,request,sourceType);
							
							//检查是否业务主键重复
							selectobj = ImportButtonManager.checkBusPk(busiPkColumns, importData, saveTableName, fieldSet);
						} catch (Exception t) {// 校验失败
							errorCount++;
							t.printStackTrace();
							String message = t.getMessage();
							if (message!=null && message!="") {
								importData.put("cellError", message);
							} else {
								importData.put("cellError", "未知错误");
							}
							errorDatas.add(importData);
							continue;
						}
						
						if (selectobj != null) {
							// 根据业务主键查询到记录信息，根据用户导入时的重复操作，判断是否更新记录
							if ("1".equalsIgnoreCase(repeOper)) {
								dataObj = ImportButtonManager.getSaveData(form, fieldSet, importData);
								if (dataObj != null && dataObj.size() > 0) {
									if (!dataObj.containsKey(teckPkName)) {
										dataObj.put(teckPkName, selectobj.get(teckPkName));
									}
								}
							}
						} else {
							// 新增记录
							dataObj = ImportButtonManager.getSaveDataUp(form, fieldSet, importData);
						}
						
						// 判断是否存在唯一约束冲突的
						try {
							String uniqueStr = ImportButtonManager.checkUnique(form, s, dataObj, saveTableName);
							if (uniqueStr!=null&&uniqueStr!="") {
								errorCount++;
								importData.put("cellError", uniqueStr + "违反唯一约束");
								errorDatas.add(importData);
								continue;
							}
						} catch (Exception t) {// 校验失败
							errorCount++;
							t.printStackTrace();
							String message = t.getMessage();
							if (message!=""&& message!="") {
								importData.put("cellError", message);
							} else {
								importData.put("cellError", "未知错误");
							}
							errorDatas.add(importData);
							continue;
						}
						if (dataObj != null && dataObj.size() > 0) {
							try {
								Map<String,Object> paramsMap = new HashMap<String,Object>();
								//处理字段参数
								SysFormButtonCache b = form.serchButtonButtonId(buttonId+"");
								SysFormGeneralExecSqlCache a = b.getHzSql();
								if(a!=null&& a.getPojo()!=null &&a.getExecSqlId()!=0){
									List<String[]> p = a.getParams();
									for(String[] temp:p){
										if(temp[0].equalsIgnoreCase("c")){
											String columnId = temp[1].substring(temp[1].lastIndexOf("_")+1);
											String fieldName = (form.serchColumnByColumnId(Long.parseLong(columnId)).getJsId("name",formId));
											paramsMap.put("c_"+columnId, dataObj.get(fieldName));
										}
									}
								}
								if ("1".equalsIgnoreCase(execptOper)) {
									/*txManager = TransactionManagerFactory.getTransactionManager();// 事务
									txManager.begin();// 事务开始
*/								}
								String[] returnInfo = null;
								
								try {
									returnInfo = cardFormSaveButtonSave(dataObj, formId,paramsMap,buttonId+"",request,"import",sourceType);
								} catch (Exception e) {
									e.printStackTrace();logger.error(e.getMessage(),e);
									returnInfo = new String[]{"error", e.getMessage()};
								}
								
								if (returnInfo != null && returnInfo.length == 2) {
									if ("error".equalsIgnoreCase(returnInfo[0])) {// 保存出错
										errorCount++;
										importData.put("cellError", returnInfo[1]);
										throw new Throwable(returnInfo[1]);
									}
								}
								if ("1".equalsIgnoreCase(execptOper)) {
									/*if (txManager != null) {
										txManager.commit();// 事务提交
									}*/
								}
								dcfReponse.setMsg(returnInfo[0]);
							} catch (Throwable t) {// 保存失败
								errorCount++;
								String message = t.getMessage();
								if (message!=null&& message!="") {
									importData.put("cellError", message);
								} else {
									importData.put("cellError", "未知错误");
								}
								errorDatas.add(importData);
								if ("1".equalsIgnoreCase(execptOper)) {
									/*if (txManager != null) {
										logger.info(txManager.getStatus());
										if (!"STATUS_MARKED_ROLLBACK".equalsIgnoreCase(txManager.getStatus())) {
											txManager.rollback();// 事务回滚
										}
									}*/
								}else {
									throw t;
								}
								
							}
						}
					}
					logger.info("**********************************标签111********"+(new Date().getTime()-startTime)+"S******************************************");
					
					if (errorCount > 0) {// 存在错误
						/*if (filePath.endsWith(".xls")) {
							filePath=filePath.split(".xls")[0];
							ExcelUtils.listToExcel(errorDatas,null,filePath,clientFileName,response);
						} else if (filePath.endsWith(".xlsx")) {
							ExcelUtils.listToExcelBigData(errorDatas,null,filePath,clientFileName,response);
						}
						*/
					} else {
						dcfReponse.setSuccessResponse(null);
					}
				} else {
					throw new DcfException("导入的Excel无数据");
				}
			} else {
				throw new DcfException("根据表单ID[" + formId + "]没有获取到表单信息，请联系系统管理员");
			}
			
			if (!"1".equalsIgnoreCase(execptOper)) {
				/*if (txManager != null) {
					txManager.commit();// 事务提交
				}*/
			}
		} catch (Throwable t) {
			t.printStackTrace();
			
			if (!"1".equalsIgnoreCase(execptOper)) {
				/*if (txManager != null) {
					txManager.rollback();// 事务回滚
				}*/
			}
			dcfReponse.setException(t);
		}

		String[] errorN = {"0","success",""};
		if (errorDatas.size()>0) {
			if(importDatas1!=null){
				filePath=filePath.split(".xls")[0];
				LinkedHashMap<String,String> title = new LinkedHashMap<String,String>();
				for (Map.Entry<String, Object> entry : importDatas1.entrySet()) {
					title.put(entry.getKey()+"",entry.getValue()+"");
					//cellError
			    }
				title.put("cellError","异常原因");
				try {
					ExcelUtils.listToExcel(errorDatas,title,filePath, "错误报告"+userId, response);
				} catch (ExcelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}else if (importDatas2!=null) {
				filePath=filePath.split(".xlsx")[0];
				LinkedHashMap<String,String> title = new LinkedHashMap<String,String>();
				for (Map.Entry<String, Object> entry : importDatas2.entrySet()) {
					title.put(entry.getKey()+"",entry.getValue()+"");
					//cellError
			    }
				title.put("cellError","异常原因");
				try {
					ExcelUtils.listToExcel(errorDatas,title,filePath, "错误报告"+userId, response);
				} catch (ExcelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}
			
			
			
			errorN[0] = "1";
			errorN[1] = filePath;
			errorN[2] = "错误报告"+userId;
		} 
		//后置触发
				Map<String,Object> paramMap = new HashMap<String, Object>();
				
				String[] res=new String[1];
					try {
						
						String[] excresult2 =this.execHzsql(paramMap, res, formId,buttonId+"", "",request.getSession(),sourceType);
						System.out.println(excresult2);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
		return errorN;
	}
	public static String getFieldByFieldTablename(String fieldTablename,List<SysField> fields ){
		for(int i=0;i<fields.size(); i++){
			if(fieldTablename.equalsIgnoreCase(fields.get(i).getFieldTablename().toUpperCase())){
				return fields.get(i).getFieldType();
			}
		}
		
		return null;
	}

} 
