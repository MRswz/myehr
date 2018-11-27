package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.exception.DcfException;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.dict.DictData;
import com.myehr.pojo.dict.SysDictEntry;
import com.myehr.pojo.formmanage.cache.SysFormButtonImportCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonImportColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormGeneralExecSqlCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.service.impl.formmanage.form.SysformconfigService;
import com.myehr.service.impl.formmanage.runtime.RuntimeUtil;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.service.sysdict.SysDictService;



public class ImportButtonManager {
	private static Logger logger = LoggerFactory.getLogger(ImportButtonManager.class);

	//private static final Logger log = DcfUtil.getLogger(ImportButtonManager.class);
	public static String getFieldName(String cellName, Map<String, String>[] fieldSet) {
		String fieldName = "";
		if (fieldSet != null && fieldSet.length > 0) {
			for (int i = 0; i < fieldSet.length; i++) {
				String tempCell = fieldSet[i].get("cell");
				if (tempCell!=null && tempCell!="" && tempCell.equals(cellName)) {
					fieldName = fieldSet[i].get("importfield");
					break;
				}
			}
		}
		
		return fieldName;
	}
	
	public static String getCellName(String fieldName, Map<String, String>[] fieldSet) {
		String cellName = "";
		if (fieldSet != null && fieldSet.length > 0) {
			for (int i = 0; i<fieldSet.length; i++) {
				String tempField = fieldSet[i].get("importfield");
				String retempField = fieldSet[i].get("reimportfield");
				if (tempField !=null && tempField!="" && tempField.toUpperCase().equals(fieldName.toUpperCase())) {
					cellName = fieldSet[i].get("cell");
					break;
				}
				if (retempField!=null && retempField!="" && retempField.toUpperCase().equals(fieldName.toUpperCase())) {
					cellName = fieldSet[i].get("cell");
					break;
				}
			}
		}
		return cellName;
	}
	
	/**
	 * 获取字段与字段值的映射
	 * @throws DcfException 
	 */
	@SuppressWarnings("unchecked")
	public static Map getSaveData(SysFormconfigCache form, Map<String, String>[] fieldSet, Map<String, Object> importData) throws DcfException {
		Map map = null;		
		if (fieldSet != null && fieldSet.length > 0) {
			map = new HashMap();
			for (int i = 0; i < fieldSet.length; i++) {
				String tempCell = fieldSet[i].get("cell");
				if (tempCell!=null && tempCell!="") {
					String _vale = (String)importData.get(tempCell);
					
					String importfield = "";
					if (fieldSet[i].get("reimportfield") != null) {
						importfield = fieldSet[i].get("reimportfield");
					} else {
						importfield = fieldSet[i].get("importfield");
					}
					
					map.put(importfield, _vale);
				}
			}
		}
		return map;
	}
	
	/**
	 * 获取字段与字段值的映射
	 * @throws DcfException 
	 */
	@SuppressWarnings("unchecked")
	public static Map getSaveDataUp(SysFormconfigCache form, Map<String, String>[] fieldSet, Map<String, Object> importData) throws DcfException {
		Map map = null;		
		if (fieldSet != null && fieldSet.length > 0) {
			map = new HashMap();
			for (int i = 0; i < fieldSet.length; i++) {
				String tempCell = fieldSet[i].get("cell");
				if (tempCell!=null && tempCell!="") {
					String _vale = (String)importData.get(tempCell);
					
					String importfield = "";
					if (fieldSet[i].get("reimportfield") != null) {
						importfield = fieldSet[i].get("reimportfield");
					} else {
						importfield = fieldSet[i].get("importfield");
					}
					
					map.put(importfield.toUpperCase(), _vale);
				}
			}
		}
		return map;
	}
	
	/**
	 * 
	 * @param columns 业务主键字段
	 * @param importData 导入excel数据
	 * @param saveTable 需要校验表
	 * @return DataObject  非空代表有记录  代表无记录
	 * @throws DcfException 
	 */
	public static Map checkBusPk(List<SysFormColumnCache> columns,Map<String, Object> importData,String saveTable, Map<String, String>[] fieldSet) throws DcfException{
		//HttpSession session = (HttpSession) DcfUtil.getSession();
		//String productName =(String)session.getAttribute("productName");
		String sql = "SELECT * FROM "+saveTable+" WHERE 1=1 "  ;
		String whereSql = "";
		for(int i=0; i<columns.size(); i++){
			if(columns.get(i)!=null){
				SysFormColumnCache c = columns.get(i);
				String fieldType =c.getDatabaseType();
				String columnFieldName = c.getFormFiledTablename();
				String cellName = ImportButtonManager.getCellName(columnFieldName, fieldSet);// 获取单元格第几列
				Object busiPkValueObj = importData.get(cellName);// 获取单元格的值
				String databasevalue = "";
				if (busiPkValueObj == null||"".equals(busiPkValueObj)){
					logger.info("XXXX");
				}
				if (busiPkValueObj != null&&!"".equals(busiPkValueObj)) {
					try {
						//if(productName.equals("Oracle")){
							//databasevalue  = RuntimeUtil.getFieldValue(fieldType,(String)busiPkValueObj+"",null,false);
						//}else if(productName.equals("SqlServer")){
							databasevalue  = RuntimeUtil.getFieldValueMsSql(fieldType,(String)busiPkValueObj+"",null,false,null,null,"sqlserver");
						//}
						
					} catch (Exception e) {
						// TODO 自动生成 catch 块
						e.printStackTrace();logger.error(e.getMessage(),e);
						DcfException dcfe = new DcfException(e.getMessage());
						throw dcfe;
					}
					whereSql += " AND "+columnFieldName + " = " + databasevalue  ;
				}else {
					String message = "字段名为："+c.getFormColumnLable()+"为导入的业务主键，但是导入时该值为空，此行导入失败!";
					DcfException dcfe = new DcfException(message);
					//log.error(message);
					throw dcfe;
				}
			}
		}
		if(whereSql.length()>1){
			sql += whereSql;
			List<Map> selectObjs;
			try {
				selectObjs = MybatisUtil.queryList("runtime.selectSql", sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();logger.error(e.getMessage(),e);
				throw new DcfException(e);
			}
			/*Map<String, String> map = new HashMap<String, String>();
			map.put("selectSql", sql);
			Object[] selectObjs = DatabaseExt.queryByNamedSql(Constants.DATASOURCE_NAME, "com.dcf.form.button.buttonSql.selectTableInfo", map);*/
			if (selectObjs != null && selectObjs.size() > 0) {
				return (Map)selectObjs.get(0);
			}else {
				return null;
			}
		}
		
		return null;
	}
	
	// 验证唯一性
	@SuppressWarnings("null")
	public static String checkUnique(SysFormconfigCache form, SysFormButtonImportCache button, Map<String, Object> importData, String saveTable) throws DcfException{
		String uniqueNames = "";
		
		List<SysFormButtonImportColumnCache> importColumnconfigs = button.getImportColumnconfigs();
		if (importColumnconfigs != null && importColumnconfigs.size() > 0) {
			List<SysFormColumnCache> columns = form.getColumns();
			if (columns != null && columns.size() > 0) {
				String pkStr = form.getPkColumn().getFormFiledTablename();// 获取主键
				
				String sql = "SELECT " + pkStr + " FROM " + saveTable + " WHERE 1=1 ";
				String whereSql = "";
				
				Object pkObj = importData.get(pkStr);
				if (pkObj != null) {
					whereSql += "and " + pkStr + " != '" + (String)(pkObj+"") + "' ";
				} 
				
				
				for (int i = 0; i < importColumnconfigs.size(); i++) {
					String importColumnUnique = importColumnconfigs.get(i).getImportColumnUnique();
					if (importColumnUnique ==null || "".equals(importColumnUnique)==true) {
						continue;
					}
					String[] uniqueArr = null;
					if (importColumnUnique!=null) {
						uniqueArr = importColumnUnique.split(",");
						if (uniqueArr == null || uniqueArr.length <= 0) {
							continue;
						}
					}
					
					
					
					uniqueNames = "";
					boolean isExistUnique = false;
					for (int k = 0; k < uniqueArr.length; k++) {
						long columnUniqueId = Long.parseLong(uniqueArr[k]);
						for (int m = 0; m < columns.size(); m++) {
							if (columnUniqueId==columns.get(m).getFormColumnId()) {
								String columnUniqueCode = columns.get(m).getFormFiledTablename();
								Object columnUniqueValue = importData.get(columnUniqueCode);
								if (columnUniqueValue != null) {
									whereSql += "and " + columnUniqueCode + " = '" + columnUniqueValue + "' ";
									isExistUnique = true;
								} else {
									whereSql += "and " + columnUniqueCode + " = '' ";
								}
								
								uniqueNames += columns.get(m).getFormColumnLable() + ",";
							}
						}
					}
					
					if (isExistUnique == true) {
						sql += whereSql;
						/*Map<String, String> map = new HashMap<String, String>();
						map.put("selectSql", sql);
						List<Map> selectObjs = MybatisUtil.queryByNamedSql(Constants.DATASOURCE_NAME, "com.dcf.form.button.buttonSql.selectTableInfo", map);*/
						List<Map> selectObjs = null;
						try {
							selectObjs = MybatisUtil.queryList("runtime.selectSql", sql);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();logger.error(e.getMessage(),e);
						}
						if (selectObjs != null && selectObjs.size() > 0) {
							break;
						} else {
							uniqueNames = "";
						}
					} else {
						uniqueNames = "";
					}
				}
			}
		}
		
		if (uniqueNames!=null && uniqueNames!="") {
			uniqueNames = uniqueNames.substring(0, uniqueNames.length() - 1);
		}
		
		return uniqueNames;
	}

	/**
	 * 处理字典和翻译的sql
	 * @param importData
	 * @param fieldSet
	 * @param form
	 * @param s
	 * @param template
	 * @return
	 * @throws DcfException 
	 */
	public static Map<String, Object> dealBusDictAndSql(Map<String, Object> importData, Map<String, String>[] fieldSet, SysFormconfigCache form, SysFormButtonImportCache s, PrimaryKeyService pkService,HttpServletRequest request,String sourceType) throws Exception {
		Map<String, Object> importDatar = importData;
		Map<String, Object> cloneImportDatar = new HashMap<String,Object>();
		cloneImportDatar.putAll(importDatar);
		// TODO 自动生成方法存根
		
		if (fieldSet != null && fieldSet.length > 0) {
			for (int i = 0; i < fieldSet.length; i++) {
				String tempCell = fieldSet[i].get("cell");
				if (tempCell!=null&&tempCell!="") {
					String tempname = fieldSet[i].get("importfield").toUpperCase();
					SysFormButtonImportColumnCache ic = s.getColumnconfigByName(tempname);
					String _vale = (String)importData.get(tempCell);
					//字典翻译
					if(_vale!=null){
						if (ic!=null) {
							if("dict".equals(ic.getImportColumnType())){ //字典翻译
								String sysDictCode = ic.getImportColumnDictType();
								
								SysformconfigService service = (SysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
								List<DictData> entrys = service.getCardDictDataByDictTypeCode(sysDictCode, "dict");
								if (entrys!=null) {
									for (int j = 0; j < entrys.size(); j++) {
										if (entrys.get(j).getName().equals(_vale)) {
											_vale  = entrys.get(j).getCode();
											break;
										}
										
									}
								}
								
							}
							if("sql".equals(ic.getImportColumnType())){ //sql翻译
								SysFormGeneralExecSqlCache gsql = ic.getBacksql();
								Map<String,Object> p = new HashMap<String,Object>();
								for(String[] param : gsql.getParams()){
									if("c".equals(param[0])){
										String str = param[1].substring(param[1].indexOf("_")+1);
										SysFormColumnCache sfc = form.serchColumnByColumnId(Long.parseLong(str));
										String cname = sfc.getJsId("name",form.getFormDefId()+"");
										String[] aa = cname.split("_");
										String b="";
										for (int j = 1; j < aa.length-1; j++) {
											b+=aa[j]+"_";
										}
										String str3 ="c_" + str  ;
										b = b.substring(0,b.length()-1);
										p.put(str3, getCellValue(fieldSet,b,cloneImportDatar));
									} 
								}
								HttpSession session = null;
								List<Map> objs = RuntimeUtil.execsql(gsql, pkService, p,session,sourceType);
								if(objs!=null&&objs.size()>0){
									String importReColumnRelId = ic.getImportReColumnRelId()+"";
									String retempname = "";
									if (!importReColumnRelId.equals("")&&!importReColumnRelId.equals("0")) {
										retempname = fieldSet[i].get("reimportfield");
									}else {
										retempname = fieldSet[i].get("importfield");
									}
									_vale = objs.get(0).get(retempname.toUpperCase())+"";
								}else {
									_vale = null;
									//throw new DcfException("无法获取列"+tempCell+"关联数据");
								}
							}
							//_vale = BusinessDictUtil.getDictName(ic.getImportColumnDictType(), (String)importData.get(tempCell));
						}
					}else {
						if("session".equals(ic.getImportColumnType())){ //会话参数
							HttpSession session = request.getSession();
							String userId = (BigDecimal)session.getAttribute("userid")+"";
							_vale  = userId;
						}
						
						if("timenow".equals(ic.getImportColumnType())){ //当前时间
							SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String date = format.format(new Date());
							_vale  = date;
						}
					}
					importData.put(tempCell, _vale);
				}
			}
		}
		return importDatar;
		
	}
	
	public static String getCellValue(Map<String, String>[] fieldSet,String cname,Map<String, Object> importData){
		if(cname==null){
			return null;
		}
		for(int i=0; i<fieldSet.length; i++){
			//logger.info(fieldSet[i].get("importfield"));
			String fieldName = fieldSet[i].get("importfield").toUpperCase();
			if(cname.equals(fieldName)==true){
				String cell = fieldSet[i].get("cell");
				
				return (String)importData.get(cell);
			}
		}
		return null;
	}
	
	
}
