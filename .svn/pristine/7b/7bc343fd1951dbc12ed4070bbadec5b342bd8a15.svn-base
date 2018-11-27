package com.myehr.service.impl.formmanage.runtime;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ChangeCode;
import com.myehr.common.util.StringUtils;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.formmanage.cache.SysCardFormColumnUtil;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormComboboxCache;
import com.myehr.pojo.formmanage.cache.SysFormGeneralExecSqlCache;
import com.myehr.pojo.formmanage.cache.SysFormWhereCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.SysGridFilterCache;
import com.myehr.pojo.formmanage.cache.SysGridFilterColumnCache;
import com.myehr.pojo.formmanage.cache.UserObject;

import net.sf.json.JSONObject;


public class RuntimeUtilSqlServer {
	private static Logger logger = LoggerFactory.getLogger(RuntimeUtilSqlServer.class);
	//private static final Logger log = DcfUtil.getLogger(RuntimeUtilSqlServer.class);
	public static String dataBaseType ;
	static{
		Connection conn = null;
		try {
			conn = MybatisUtil.getConnection();
			DatabaseMetaData metadata = conn.getMetaData();
			if(metadata.getDatabaseProductName().indexOf("Oracle") != -1){
				dataBaseType = "Oracle";
			}
		} catch (SQLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();logger.error(e.getMessage(),e);
		}finally{
			if(conn!=null){
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					// TODO 自动生成 catch 块
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}
		}
	}
	
	/**
	 * json转map
	 * @param json
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String,Object> jsonToMap(String json){
		JSONObject mapjson = JSONObject.fromObject(json);
		Iterator<String> it = mapjson.keys();
		Map<String,Object> params = new HashMap<String,Object>();
		while(it.hasNext()){
			String key = it.next();
			String value = mapjson.getString(key);
			params.put(key, value);
		}
		return params;
	}
	
	/**
	 * 获取检查id是否存在的sql
	 * @param pkname
	 * @param pkValue
	 * @param tablename
	 * @return
	 */
	public static String getCheckSqlPkDataSql(String pkname,String pkValue,String tablename){
		
		return "select 1 from "+tablename +" where "+ChangeCode.getRealCode(pkname) +"="+pkValue;
	}
	

	
	public static String getInsertSql(List<String> insert,List<String> values,List<SysField> fields,String tablename) throws Exception{
		
		String insertStr = "";
		String valuesStr = "";
		for(int i=0; i<insert.size(); i++){
			String fieldName = insert.get(i);
			//获取当前字段的数据类型 
			String fieldType = getFieldByFieldTablename(fieldName,fields);
			Object value = values.get(i);
			logger.info(fieldName);
			String tempValue = null;
			String tempField = fieldName+",";
			//if("Oracle".equals(dataBaseType)) { //oracle数据库
				if(value==null||"".equals(value)){
					tempValue = "null,";
				}else {
					//gfdgfdg
					tempValue = getFieldValue(fieldType,value+"",null,true);
				}
			//}
			insertStr+=tempField;
			
			valuesStr+=tempValue;
			
		}
		insertStr = insertStr.substring(0,insertStr.length()-1);
		valuesStr = valuesStr.substring(0,valuesStr.length()-1);
		return "INSERT INTO "+tablename+" ("+insertStr+") VALUES ("+valuesStr+")";
	}
	
	public static String getFieldByFieldTablename(String fieldTablename,List<SysField> fields){
		for(int i=0;i<fields.size(); i++){
			if(fieldTablename.equals((String)fields.get(i).getFieldTablename())){
				return (String)fields.get(i).getFieldType();
			}
		}
		
		return null;
	}
	
	/**
	 * 此方法针对Oraccle数据库
	 * 
	 * @param fieldType 数据库字段类型 
	 * @param value 字段值
	 * @param joinRule where条件中的连接规则
	 * @param b 是否在末尾增加","
	 * @return
	 * @throws Exception
	 */
	public static String  getFieldValue(String fieldType,String value,String cpRule,boolean b) throws Exception{
		String tempValue =null;
		String d = ",";
		if(!b){
			d = "";
		}
		if(fieldType.indexOf("TIMESTAMP")>=0||"datetime".equals(fieldType)||"DATE".equals(fieldType)){ //日期格式处理
			String reg1 = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2} [0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}"; //"yyyy-mmm-dd hh:mm:ss" 格式的日期
			String reg2 = "[0-9]{4}/[0-9]{1,2}/[0-9]{1,2} [0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}"; //"yyyy/mmm/dd hh:mm:ss" 格式的日期
			String reg1_1 = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2} [0-9]{1,2}:[0-9]{1,2}"; //"yyyy-mmm-dd hh:mm" 格式的日期
			String reg2_1 = "[0-9]{4}/[0-9]{1,2}/[0-9]{1,2} [0-9]{1,2}:[0-9]{1,2}"; //"yyyy/mmm/dd hh:mm:ss" 格式的日期
			String reg1_2 = "[0-9]{4}[0-9]{1,2}[0-9]{1,2} [0-9]{1,2}:[0-9]{1,2}:[0-9]{1,2}"; //"yyyymmmdd hh:mm:ss" 格式的日期
			String reg3 = "[0-9]{4}-[0-9]{1,2}-[0-9]{1,2}";//"yyyy-mmm-dd" 格式的日期
			String reg4 = "[0-9]{4}/[0-9]{1,2}/[0-9]{1,2}";//"yyyy/mmm/dd" 格式的日期
			String reg5 = "[0-9]{4}[0-9]{1,2}[0-9]{1,2}";//"yyyymmmdd" 格式的日期
			Pattern p = Pattern.compile(reg1);
			Matcher m = p.matcher(value.toString());
		
			if(m.find()){
				 String ret = m.group();
				 tempValue = "TO_DATE('"+ret+"','YYYY-MM-DD HH24:MI:SS')"+d;
			}else {
				p = Pattern.compile(reg1_1);
				m = p.matcher(value.toString());
				if(m.find()){
					 String ret = m.group();
					 tempValue = "TO_DATE('"+ret+"','YYYY-MM-DD HH24:MI')"+d;
				}else {
					p = Pattern.compile(reg2);
					m = p.matcher(value.toString());
					if(m.find()){
						 String ret = m.group();
						 tempValue = "TO_DATE('"+ret+"','YYYY-MM-DD HH24:MI:SS')"+d;
					}else {
						p = Pattern.compile(reg2_1);
						m = p.matcher(value.toString());
						if(m.find()){
							 String ret = m.group();
							 tempValue = "TO_DATE('"+ret+"','YYYY-MM-DD HH24:MI')"+d;
						}else {
							p = Pattern.compile(reg3);
							m = p.matcher(value.toString());
							if(m.find()){
								 String ret = m.group();
								 tempValue = "TO_DATE('"+ret+"','YYYY-MM-DD')"+d;
							}else {
								p = Pattern.compile(reg4);
								m = p.matcher(value.toString());
								if(m.find()){
									 String ret = m.group();
									 tempValue = "TO_DATE('"+ret+"','YYYY-MM-DD')"+d;
								}else {
									p = Pattern.compile(reg5);
									m = p.matcher(value.toString());
									if(m.find()){
										 String ret = m.group();
										 tempValue = "TO_DATE('"+ret+"','YYYYMMDD')"+d;
									}else {
										p = Pattern.compile(reg1_2);
										m = p.matcher(value.toString());
										if(m.find()){
											 String ret = m.group();
											 tempValue = "TO_DATE('"+ret+"','YYYYMMDD HH24:MI:SS')"+d;
										}
									}
								}
							}
						}
					}
				}
			}
			
			if(tempValue==null&&value!=null&&!"".equals(value)){
				Exception e = new Exception("日期数据格式处理异常,日期格式值为"+value);
				//log.error(e);
				throw e;
			}
		}
		if("decimal".equals(fieldType)){ //数字类型
			if("".equals(value)){
				value = "null";
			}
			if("in".equals(cpRule)||"not in".equals(cpRule)){
				tempValue = dealInOrNotInRule("number",value)+d;
			}else {
				tempValue = value+d;
			}
		}
		if("nvarchar".equals(fieldType)||"NVARCHAR".equals(fieldType)||"ntext".equals(fieldType)||"NTEXT".equals(fieldType)||"CHAR".equals(fieldType)){ //字符类型
			
			if("in".equals(cpRule)||"not in".equals(cpRule)){
				tempValue = dealInOrNotInRule("string",value)+d;
			}else if("like".equals(cpRule)){
				tempValue = "'%"+value+"%'"+d;  
			}else {
				if(value==null||"null".equals(value)||"".equals(value)){
					tempValue = "null"+d;
				}else {
					tempValue = "'"+value+"'"+d;
				}
			}
		}
		
		if(tempValue==null){
			tempValue = "null"+d;
		}
		
		return tempValue;
	}
	
	/**
	 * 
	 * @param dataType number 代表数据中 string 代表字符
	 * @param value
	 * @param joinRule
	 * @return
	 */
	public static String dealInOrNotInRule(String dataType,String value){
		String tempValue = null;
		if("number".equals(dataType)){
			tempValue = " ("+value+") ";
		}else { //打单引号
			tempValue = "('"+value.replaceAll(",", "','")+"')";
		}
		return  tempValue;
	}
	
	
	public static String getWhereSql(SysFormconfigCache form, List<SysFormWhereCache> wheres,Map requestParam,Map<String,String> filterParam,
			SysGridFilterCache filter, Map<String, String>[] heightGrade,UserObject user) throws Exception{
		String whereSql = "";
	//	if("Oracle".equals(dataBaseType)) { //oracle数据库
//			生成条件sql语句
			
			//初始化化过滤的条件
			for(SysFormWhereCache where:wheres){
				String valueType = where.getFormWhereValueType();
				SysFormColumnCache c = where.getColumn();
				String columnName = c.getFormFiledTablename();
				String cpRule = where.getFormWhereCpRule();
				String joinRule = where.getFormWhereJoinRule();
				String leftBracket = where.getFormWhereLeftBracket();
				String rightBracket = where.getFormWhereRightBracket();
				String value = where.getFormWhereValue(); //参数名或者参数值
				leftBracket = leftBracket==null?"":leftBracket;
				rightBracket = rightBracket==null?"":rightBracket;
				
				if("is null".equals(cpRule)||"is not null".equals(cpRule)){
					whereSql += " "+joinRule+" "+leftBracket+columnName+" "+cpRule+" "+rightBracket;
					continue;
				}
				
				if("session".equals(valueType)){ //session区
					String sessionParamValue = value;
					String _value  = "";
					_value = SysCardFormColumnUtil.getSessionValue(null,sessionParamValue,user);//获取session对应值
					Map obj = c.getEntityColumn();
					if(_value==null){
						if("Y".equals(where.getFormWhereNullIs())) {
							whereSql += " "+joinRule+" "+leftBracket+columnName+" IS NULL "+rightBracket;
						}
					}else {
						String dataType = (String)obj.get("fieldType");
						whereSql += " "+joinRule+" "+leftBracket+columnName+" "+cpRule+" "+getFieldValue(dataType,_value,cpRule,false)+rightBracket;
					}
				}else if("global".equals(valueType)){ //全局参数区
					
				}else if("constant".equals(valueType)){
					Map obj = c.getEntityColumn();
					String dataType = (String)obj.get("fieldType");
					whereSql += " "+joinRule+" "+leftBracket+columnName+" "+cpRule+" "+getFieldValue(dataType,value,cpRule,false)+rightBracket;
				}else if("parameter".equals(valueType)) { //request请求参数
					String paramValue = requestParam.get(value)==null?null:(String)requestParam.get(value);
					//确定数据类型 
					Map obj = c.getEntityColumn();
					if(paramValue==null){
						if("Y".equals(where.getFormWhereNullIs())) {
							whereSql += " "+joinRule+" "+leftBracket+columnName+" IS NULL "+rightBracket;
						}
					}else {
						String dataType =(String) obj.get("fieldType");
						whereSql += " "+joinRule+" "+leftBracket+columnName+" "+cpRule+" "+getFieldValue(dataType,paramValue,cpRule,false)+rightBracket;
					}
				}
					
			}
			//流程特殊参数的特殊处理
			String flowPkValue = (String)requestParam.get("_workflowBusPrimaryKeyParamName");
			if(flowPkValue!=null&&!"".equals(flowPkValue)) {
				SysFormColumnCache pkColumn = form.getPkColumn();
				Map obj = pkColumn.getEntityColumn();
				String  pkColumnName = (String)obj.get("fieldTablename");
				String pkCoumnDataType = (String)obj.get("fieldType");
				whereSql += " AND "+" "+pkColumnName+" "+"="+" "+getFieldValue(pkCoumnDataType,flowPkValue,"=",false);
			}
			
			//处理字段条件查询
			if(filter!=null&&filter.getGridFilterId()!=0){
				List<SysGridFilterColumnCache> fs = filter.getFilterColumns();
				if(filter!=null&&filter.getFilterColumns().size()>0){
					for(SysGridFilterColumnCache f:fs){
						boolean isIntervailQuery =  "Y".equals(f.getGridColumnIsIntervais());
						String columnName = f.getColumn().getFormFiledTablename();
						//确定数据类型
						Map obj = f.getColumn().getEntityColumn();
						String cpRule = f.getGridColumnFilterRule();
						if(isIntervailQuery){
							String columnMinValue = filterParam.get("_INTERVAIL_MIN_"+columnName);
							String columnMaxValue = filterParam.get("_INTERVAIL_MAX_"+columnName);
							whereSql+=RuntimeUtilSqlServer.getFilterColumnStr(obj, columnName, columnMinValue, columnMaxValue, cpRule);
						}else {
							String columnValue = filterParam.get(columnName);
							if(columnValue!=null&&!"".equals(columnValue)) {
								String dataType = null;
								if(obj==null){
									dataType = "VARCHAR2";
								}else {
									dataType = (String)obj.get("fieldType");
								}
								whereSql += " and"+" "+columnName+" "+cpRule+" "+getFieldValue(dataType,columnValue,cpRule,false);
							}
						}
						
					}
				}
			}
			
			//处理高级查询
			if(heightGrade!=null&&heightGrade.length>0){
				for(Map<String,String> temp:heightGrade){
					String formColumnId = temp.get("formWhereColumnId");
					SysFormColumnCache c = form.serchColumnByColumnId(Long.parseLong(formColumnId));
					if(c!=null){
						String columnName = c.getFormFiledTablename();
						String leftBracket = temp.get("leftBracket");
						leftBracket = leftBracket==null?"":leftBracket;
						String rightBracket = temp.get("rightBracket");
						rightBracket = rightBracket==null?"":rightBracket;
						String columnValue =temp.get("formWhereValue");
						Map obj = c.getEntityColumn();
//						DataObject obj = f.getColumn().getEntityColumn();
						if(columnValue!=null&&!"".equals(columnValue)) {
							String dataType = "VARCHAR2";
							if(obj!=null){
								dataType = (String)obj.get("fieldType");
							}
							String cpRule = temp.get("formWhereCpRule");
							String formColumnGuiType = c.getFormColumnGuiType();
							boolean isTrans = false;
							if ("2".equals(formColumnGuiType)) {
								Object object = c.getFormColumGui();
								if (object != null) {
									SysFormComboboxCache  combobox = (SysFormComboboxCache)object;
									String comboboxGuiInitType = combobox.getComboboxGuiInitType();
									if ("dict".equals(comboboxGuiInitType)) {
										String comboboxGuiInitValue = combobox.getComboboxGuiInitValue();
										if (StringUtils.isNotNullAndBlank(comboboxGuiInitValue)) {
											isTrans = true;
											String dictSql = "SELECT DEN.DICT_ENTRY_CODE FROM SYS_DICT_ENTRY DEN, SYS_DICT_TYPE DT WHERE DEN.DICT_TYPE_ID=DT.DICT_TYPE_ID AND DT.DICT_TYPE_CODE='" + comboboxGuiInitValue + "'";
											
											dictSql += " and DEN.DICT_ENTRY_NAME " + cpRule + " " + getFieldValue(dataType,columnValue,cpRule,false);
											whereSql += " "+temp.get("formWhereJoinRule")+" "+leftBracket+columnName+" in (" + dictSql + ")" + rightBracket;
										}
									}
								}
							} 
							
							if (isTrans == false) {
								whereSql += " "+temp.get("formWhereJoinRule")+" "+leftBracket+columnName+" "+cpRule+" "+getFieldValue(dataType,columnValue,cpRule,false)+rightBracket;
							}
						}
					}
				}
			}
			
			//	}
		
		return whereSql;
	}
	
	
	/**
	 * 获取区间查询字段的sql段
	 * @param obj
	 * @param columnName
	 * @param columnValue
	 * @param cpRule
	 * @return
	 * @throws Exception 
	 */
	public static String getFilterColumnStr(Map obj ,String columnName,String columnMinValue,String columnMaxValue,String cpRule) throws Exception{
		if((columnMinValue==null||"".equals(columnMinValue))&&(columnMaxValue==null||"".equals(columnMaxValue))) {
			return "";
		}
		String whereSql = "and (";
		boolean isMin = false;
		if(columnMinValue!=null&&!"".equals(columnMinValue)) {
			String dataType = null;
			if(obj==null){
				dataType = "VARCHAR2";
			}else {
				dataType =(String) obj.get("fieldType");
			}
			whereSql += columnName+" >= "+" "+getFieldValue(dataType,columnMinValue,cpRule,false);
			isMin = true;
		}
		if(columnMaxValue!=null&&!"".equals(columnMaxValue)) {
			String dataType = null;
			if(obj==null){
				dataType = "VARCHAR2";
			}else {
				dataType = (String)obj.get("fieldType");
			}
			whereSql += (isMin?" and":"")+" "+columnName+" "+"<="+" "+getFieldValue(dataType,columnMaxValue,cpRule,false);
		}
		whereSql += " ) ";
		return whereSql;
	}

	/**
	 * form表单中保存按钮生成updatesql方法
	 * @param update
	 * @param values
	 * @param fields
	 * @param tablename
	 * @param pkField
	 * @param pkValue
	 * @return
	 * @throws Exception  
	 */
	public static String getUpdateSql(List<String> update, List values, List<SysField> fields, String tablename, String pkField, Long pkValue) throws Exception {
		// TODO 自动生成方法存根

		String updateStr = "";
		for(int i=0; i<update.size(); i++){
			String fieldName = update.get(i);
			//获取当前字段的数据类型 
			String fieldType = getFieldByFieldTablename(fieldName,fields);
			Object value = values.get(i);
			String tempValue = null;
			String tempField = fieldName;
			//if("Oracle".equals(dataBaseType)) { //oracle数据库
				if(value==null){
					tempValue = "null";
				}else {
					//gfdgfdg
					tempValue = getFieldValue(fieldType,(String) value,null,false);
				}
			//}
			updateStr= updateStr + tempField+"="+tempValue+",";
			
		}
		updateStr = updateStr.substring(0,updateStr.length()-1);
		return "UPDATE "+tablename+" SET  "+updateStr+" WHERE "+pkField+" = "+pkValue;
	}
	
	
	public static String removeData(SysFormconfigCache form,Map obj) throws DcfException{
		SysFormColumnCache pkColumn = form.getPkColumn();
		String sql = null;
		if(pkColumn!=null&&pkColumn.getFormColumnId()!=0){
			String[] ef = pkColumn.getFiledName();
			Object objPkValue = obj.get(ef[1]);
			if(objPkValue==null||"".equals(objPkValue)){
				throw new DcfException("主键主键字段值为空");
			}
			String pkValue = objPkValue.toString();
			
			sql = RuntimeUtilSqlServer.getDeleteSql(ef[0], ef[1], pkValue);
			
			
		}else {
			throw new DcfException("无主键字段");
		}
		return sql;
	}
	
	/**
	 * 
	 * @param form
	 * @param paramdata
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public static String getRemoveTabData(SysFormconfigCache form,Map<String,String>[] paramdata,UserObject user) throws Exception{
		if(paramdata!=null){
			for(int i=0; i<paramdata.length; i++){
				String sql = RuntimeUtilSqlServer.getWhereSql(form, form.getWheres(), paramdata[i], null, null, null, user);
				logger.info("**********"+sql);
			}
		}
		return null;
	}
	
	public static String getDeleteSql(String tablename,String pkName ,String pkValue){
		return "DELETE FROM "+tablename +" WHERE "+pkName +"='" +pkValue+"'";
	}
	
	public static String getSelectFieldFormat(String fieldName,Map fieldEntity){
//		logger.info(fieldName);
		String dataType = (String)fieldEntity.get("fieldType");
		fieldName = ChangeCode.getUniqueCode((String)fieldEntity.get("entityCode"), fieldName);
		//if("Oracle".equals(dataBaseType)) { //oracle数据库
		if("DATE".equals(dataType)||"date".equals(dataType)||dataType.indexOf("TIMESTAMP")>=0||dataType.indexOf("timestamp")>=0){
			return "TO_CHAR(t."+fieldName.toUpperCase()+",'YYYY-MM-DD HH24:MI:SS') "+fieldName.toUpperCase();
		}
		//}
		return "t."+fieldName.toUpperCase();
	}
	
/*	
	*//**
	 * 执行自定义存储过程
	 * @param formId
	 * @param execSqlRelaid
	 * @param p
	 * @return
	 *//*
	public static String[] execPrepare(SysFormGeneralExecSqlCache buttonExecSql, DASTemplate das,Map<String, Object> p,Connection conn){
		String[] sql = buttonExecSql.getSqlList();
		List<String[]> ps = buttonExecSql.getParams();
		for(int k=0;k<sql.length;k++){
			String tempSql = sql[k];
			for(int i=0; i<ps.size(); i++){
				String[] temp = ps.get(i);
				String key = null;
				String rstr = null;
				String value = null;
				if("c".equals(temp[0])){
					key = temp[0]+"_" + temp[1].substring(temp[1].indexOf("_")+1);
				}else if("r".equals(temp[0])){
					key = temp[0]+"_" + temp[1];
				}else if("k".equals(temp[0])){
					value = temp[1].replace("-", ".");
					long pk;
					try {
						pk = DcfUtil.getPrimaryKey(value);
					} catch (Exception e) {
						e.printStackTrace();logger.error(e.getMessage(),e);
						return new String[]{"-1",null};
					}
					value = Long.toString(pk);
				}
				else {
					key = temp[0]+"_"+temp[1];
				}
				if(!"k".equals(temp[0])) {
					value = (String)p.get(key);
					if(value == null){
						value= "";
					}
				}
				rstr = "["+temp[0]+":"+temp[1]+"]";
				while(tempSql.indexOf(rstr)>=0){
					if ("'null'".equals(value) || "null".equals(value)) {
						tempSql = tempSql.replace("'" + rstr + "'", "null");
						tempSql = tempSql.replace(rstr, "null");
					} else {
						tempSql = tempSql.replace(rstr, value);
					}
				}
			}
			logger.info("sql:"+tempSql);
			log.info("sql:"+tempSql);
			String[] result = DcfJDBCUtil.execPrepare(conn,tempSql);
			if(sql.length-1 == k){
				return result;
			}
		}
		return new String[]{"-1",null};
	}
	
	*//**
	 * 执行自定义sql
	 * @param formId
	 * @param execSqlRelaid
	 * @param p
	 * @return
	 * @throws DcfException 
	 *//*
	public static DataObject[] execsql(SysFormGeneralExecSql buttonExecSql, DASTemplate das,Map<String, Object> p) throws DcfException {
		String[] sql = buttonExecSql.getSqlList();
		List<String[]> ps = buttonExecSql.getParams();
		for(int k=0;k<sql.length;k++){
			String tempSql = sql[k];
			for(int i=0; i<ps.size(); i++){
				String[] temp = ps.get(i);
				String key = null;
				String rstr = null;
				String value = null;
				if("c".equals(temp[0])){
					key = temp[0]+"_" + temp[1].substring(temp[1].indexOf("_")+1);
				}else if("r".equals(temp[0])){
					key = temp[0]+"_" + temp[1];
				}else if("k".equals(temp[0])){
					value = temp[1].replace("-", ".");
					long pk;
					try {
						pk = DcfUtil.getPrimaryKey(value);
					} catch (Exception e) {
						e.printStackTrace();logger.error(e.getMessage(),e);
						return null;
					}
					value = Long.toString(pk);
				}
				else {
					key = temp[0]+"_"+temp[1];
				}
				if(!"k".equals(temp[0])) {
					value = (String)p.get(key);
					if(value == null){
						value = "null";
					}
				}
				rstr = "["+temp[0]+":"+temp[1]+"]";
				while(tempSql.indexOf(rstr)>=0){
					if(value==null||"null".equals(value)){
						value ="null";
						tempSql = tempSql.replace("'"+rstr+"'", value);
					}
					tempSql = tempSql.replace(rstr, value);
					
				}
			}
			log.info("sql:"+tempSql);
			String _value = (String)p.get("_combobox_value");
			if(_value!=null){
				SysCombobox combobox = (SysCombobox)p.get("_combobox_combobox");
				String valueField = combobox.getComboboxValuefield();
				String textField = combobox.getComboboxTextfield();
				if("Oracle".equals(dataBaseType)) { //oracle数据库
						try {
							//gfdgfdg
							String tempValue = getFieldValue(combobox.getColumn().getDatabaseType(),_value+"","=",false);
							tempSql = "select tt."+textField+" from ("+tempSql+") tt where tt."+valueField+" = "+tempValue;
							
						}catch (Exception e) {
							throw new DcfException(e.getMessage());
						}
				}
				
				
			}
			DataObject[] dataObject = das.queryByNamedSql(DataObject.class, "com.dcf.form.runtime.cardform.excuteQuerySql", tempSql);
			if(sql.length-1 == k){
				return dataObject;
			}
		}
		return null;
	}
	
	*//**
	 * 执行自定义sql
	 * @param formId
	 * @param execSqlRelaid
	 * @param p
	 * @return
	 *//*
	public static String execsqlForColumnName(SysFormGeneralExecSql buttonExecSql, DASTemplate das,Map<String, String> p) {
		String[] sql = buttonExecSql.getSqlList();
		List<String[]> ps = buttonExecSql.getParams();
		if(sql.length > 0){
			String tempSql = sql[0];
			for(int i=0; i<ps.size(); i++){
				String[] temp = ps.get(i);
				String key = null;
				String rstr = null;
				String value = null;
				if("c".equals(temp[0])){
					key = temp[0]+"_" + temp[1].substring(temp[1].indexOf("_")+1);
				}else if("k".equals(temp[0])){
					value = temp[1].replace("-", ".");
					long pk;
					try {
						pk = DcfUtil.getPrimaryKey(value);
					} catch (Exception e) {
						e.printStackTrace();logger.error(e.getMessage(),e);
						return null;
					}
					value = Long.toString(pk);
				}
				else {
					key = temp[0]+"_"+temp[1];
				}
				if(!"k".equals(temp[0])) {
					value = p.get(key);
					if(value == null){
						return null;
					}
				}
				rstr = "["+temp[0]+":"+temp[1]+"]";
				while(tempSql.indexOf(rstr)>=0){
					tempSql = tempSql.replace(rstr, value);
				}
			}
			logger.info("sql:"+tempSql);
			log.info("sql:"+tempSql);
			DataObject[] dataObject = das.queryByNamedSql(DataObject.class, "com.dcf.form.runtime.cardform.excuteQuerySql", tempSql);
			if(dataObject.length > 0){
				return dataObject[0].get(0).toString();
			}
		}
		return null;
	}
	
	*//**
	 * 检查业务主键是否重复
	 * @param tablename
	 * @param param
	 * @param busPkField
	 * @return
	 * @throws Exception 
	 *//*
	public static String getCheckSqlBusPkDataSql(String tablename, Map<String, String> param,List<DataObject> busPkField) throws Exception {
		// TODO 自动生成方法存根
		String whereStr = "";
		for(int i=0; i<busPkField.size(); i++){
			String fieldName = busPkField.get(i).getString("fieldTablename");
			//获取当前字段的数据类型 
			String fieldType = busPkField.get(i).getString("fieldType");;
			String value = param.get(fieldName);
			String tempValue = null;
			String tempField = fieldName;
			//if("Oracle".equals(dataBaseType)) { //oracle数据库
				if(value==null){
					tempValue = "null";
				}else {
					//gfdgfdg
					tempValue = getFieldValue(fieldType, value,null,false);
				}
			//}
			whereStr += tempField+"="+tempValue+" and ";
			
		}
		if(whereStr.equals("")){
			return null;
		}
		whereStr = whereStr.substring(0,whereStr.length()-5);
		return "select 1 from "+tablename+" where "+whereStr;
	}*/
}