package com.myehr.controller.handsontable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.util.Batch;
import com.myehr.pojo.formmanage.cache.SysFormWhereCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.SysGridFilterCache;
import com.myehr.pojo.formmanage.cache.SysGridFilterColumnCache;
import com.myehr.service.formmanage.form.IFormService;
import com.myehr.service.primaryKey.PrimaryKeyService;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/handsontable")
public class HandsontableController {
	
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	
//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
	
//	@Autowired
	@Resource(name = "IFormService")
	private IFormService formService;
	
	
	//查询数据
	@RequestMapping("/searchData")
	public @ResponseBody Map searchData(HttpServletRequest request,@RequestBody SearchDataWithFiter params) throws Exception{
		Map map = new HashMap();
		String userId = request.getSession().getAttribute("userid")+"";
		String excutesql =params.getExcutesql();
		String codesAndIdCardNumbers =params.getCodesAndIdCardNumbers();
		String pageNo =params.getRowNumberStart();
		String pageSize =params.getRowNumberEnd();
		String searchData =params.getSearchData();
		String formId =params.getFormId();
		Map requestParam = params.getRequestParam();
		String excutesqlAll = "";
		
		SysFormconfigCache form = formService.getForm(formId);
		List<SysFormWhereCache> wheres = form.getWheres();
		String requestString = "";
		for (int i = 0; i < wheres.size(); i++) {
			Set<Entry<String, String>> entries = requestParam.entrySet();
			for (Entry<String, String> entry : entries) {
				String field =  entry.getKey();
				String value =  entry.getValue();
				if (value !=null && value !="") {
					if (wheres.get(i).getFormWhereValue().equals(field)) {
						if (wheres.get(i).getFormWhereCpRule().equals("like")) {
							requestString +=" and "+field+" "+wheres.get(i).getFormWhereCpRule()+" '%"+value+"%' ";
						}else {
							requestString +=" and "+field+" "+wheres.get(i).getFormWhereCpRule()+" '"+value+"' ";
						}
					}
				}
			}  
		}
		
		
		
		if (pageNo ==null || pageNo=="") {
			pageNo = "1";
			if (pageSize ==null || pageSize=="") {
				pageSize = "10";
			}
		}else {
			if (pageSize ==null || pageSize=="") {
				Integer rowNumberStart1 = Integer.valueOf(pageNo);
				Integer rowNumberEnd1 = Integer.valueOf(pageSize);
				rowNumberStart1 = rowNumberStart1*rowNumberEnd1+rowNumberEnd1;
				pageSize = (rowNumberStart1+100)+"";
			}else {
				pageSize = "10";
				Integer rowNumberStart1 = Integer.valueOf(pageNo);
				Integer rowNumberEnd1 = Integer.valueOf(pageSize);
				pageNo = (rowNumberStart1*rowNumberEnd1-rowNumberEnd1)+"";
				pageSize = (rowNumberStart1*rowNumberEnd1)+"";
			}
		}
		String bb = "";
		String[] aa = codesAndIdCardNumbers.split(",");
		if (codesAndIdCardNumbers!=null && codesAndIdCardNumbers!="") {
			for (int i = 0; i < aa.length; i++) {
				bb += "'"+aa[i]+"',";
			}
			bb = bb.substring(0,bb.length()-1);
			excutesql ="select * from  ("+excutesql+ ") tt where 1=1 and A01_A0188 in ("+bb+")";
			List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(excutesql);
			if (t.size()>0) {
				List<Map> t1 = new ArrayList<Map>();
				for (int j = 0; j < aa.length; j++) {
					if (aa[j]==null || aa[j].equals("")) {
						continue;
					}else {
						for (int i = 0; i < t.size(); i++) {
							String empCode = (Integer) t.get(i).get("A01_A0188")+"";
							if (aa[j].equals(empCode)) {
								t1.add(t.get(i));
							}
						}
					}
				}
				map.put("listMap", t1);
			}else {
				//map.put("primaryKey", primaryKey);
			}
		}else{
			excutesqlAll = excutesql;
			excutesql ="select * from (select  ROW_NUMBER() over(order by A01_A0101) as rn, ttt.* from ("+excutesql+ ") ttt) tt where rn >="+pageNo+" and rn <="+pageSize+requestString +" and 1=1";
			List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(excutesql);
			List<Map> t1 = (List<Map>) tMapperExt.queryByFormDefSql(excutesqlAll);
			map.put("listMap", t);
			map.put("total", t1.size()/10);
		}
		
		return  map;
	}
	
	//查询数据
	@RequestMapping("/searchDataBySql")
	public @ResponseBody Map searchDataBySql(HttpServletRequest request,@RequestBody SearchDataBySql param) throws Exception{
		Map map = new HashMap();
		String excutesql = param.getExcutesql();
		String pageNo = param.getPageNo();
		String pageSize =param.getPageSize();
		
		if (pageNo==null || pageNo.equals("undefined")) {
			pageNo="1";
		}
		if (pageSize==null || pageSize.equals("undefined")) {
			pageSize="20";
		}
		
		String tableName = Batch.getTableName(excutesql);
		
		String getPKFieldSql= "SELECT TABLE_NAME,COLUMN_NAME FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE WHERE TABLE_NAME='"+tableName+"'"; 
		String PKField = ((List<Map>) tMapperExt.queryByFormDefSql(getPKFieldSql)).get(0).get("COLUMN_NAME")+"";
		String primaryKey = tableName+"."+PKField;
		
		
		Integer rowNumberStart1 = Integer.valueOf(pageNo);
		Integer rowNumberEnd1 = Integer.valueOf(pageSize);
		pageNo = (rowNumberStart1*rowNumberEnd1-rowNumberEnd1)+"";
		pageSize = (rowNumberStart1*rowNumberEnd1)+"";
		
		String getCountSql = "select COUNT(*) as total from ("+excutesql+") o" ;
		String total = ((List<Map>) tMapperExt.queryByFormDefSql(getCountSql)).get(0).get("total")+"";
		//excutesql = "select top "+a+" from("+excutesql+") o";
		
		excutesql ="select * from (select  ROW_NUMBER() over(order by "+PKField+") as rn, ttt.* from ("+excutesql+ ") ttt) tt where rn >"+pageNo+" and rn <="+pageSize+" and 1=1";
		
		List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(excutesql);
		map.put("listMap", t);
		map.put("primaryKey", primaryKey);
		map.put("total", (Integer.parseInt(total))/20+1);

		return  map;
	}
	
	//查询数据
	@RequestMapping("/searchDataByEmpCode")
	public @ResponseBody Map searchDataByEmpCode(HttpServletRequest request,@RequestBody SearchDataWithFiter params) throws Exception{
		Map map = new HashMap();
		String userId = request.getSession().getAttribute("userid")+"";
		String excutesql =params.getExcutesql();
		String codesAndIdCardNumbers =params.getCodesAndIdCardNumbers();
		String rowNumberStart =params.getRowNumberStart();
		String rowNumberEnd =params.getRowNumberEnd();
		String searchData =params.getSearchData();
		String formId =params.getFormId();
		
		
		Map requestParam = params.getRequestParam();
		Map filter = params.getFilter();
		
		
		SysFormconfigCache form = formService.getForm(formId);
		List<SysFormWhereCache> wheres = form.getWheres();
		String requestString = "";
		for (int i = 0; i < wheres.size(); i++) {
			Set<Entry<String, String>> entries = requestParam.entrySet();
			for (Entry<String, String> entry : entries) {
				String field =  entry.getKey();
				String value =  entry.getValue();
				if (value !=null && value !="") {
					if (wheres.get(i).getFormWhereValue().equals(field)) {
						if (wheres.get(i).getFormWhereCpRule().equals("like")) {
							requestString +=" and "+field+" "+wheres.get(i).getFormWhereCpRule()+" '%"+value+"%' ";
						}else {
							requestString +=" and "+field+" "+wheres.get(i).getFormWhereCpRule()+" '"+value+"' ";
						}
					}
				}
			}  
		}
		
		SysGridFilterCache sysGridFilter= form.getFilter();
		List<SysGridFilterColumnCache> filterColumns=sysGridFilter.getFilterColumns();
		String filterString = "";
		String searchString = "";
		for (int i = 0; i < filterColumns.size(); i++) {
			if (filterColumns.get(i).getColumn().getPojo().getFormColumnGuiType().equals("1")) {
				searchString +=""+filterColumns.get(i).getColumn().getFormFiledTablename()+" like '%"+searchData+"%' or ";
			}else {
				Set<Entry<String, String>> entries = filter.entrySet();
				for (Entry<String, String> entry : entries) {
					String field =  entry.getKey();
					String value =  entry.getValue();
					if (value !=null && value !="") {
						if (filterColumns.get(i).getColumn().getFormFiledTablename().equals(field)) {
							String ruleString = filterColumns.get(i).getPojo().getGridColumnFilterRule();
							if (ruleString.equals("like")) {
								filterString +=" and "+field+" "+wheres.get(i).getFormWhereCpRule()+" '%"+value+"%' ";
							}else {
								filterString +=" and "+field+" "+wheres.get(i).getFormWhereCpRule()+" '"+value+"' ";
							}
						}
					}
				} 
			}
		}
		searchString =searchString.substring(0, searchString.length()-3);
		searchString = "("+searchString+")";
		
		
		if (rowNumberStart ==null || rowNumberStart=="") {
			rowNumberStart = "1";
			if (rowNumberEnd ==null || rowNumberEnd=="") {
				rowNumberEnd = "100";
			}
		}else {
			if (rowNumberEnd ==null || rowNumberEnd=="") {
				Integer rowNumberStart1 = Integer.valueOf(rowNumberStart);
				rowNumberEnd = rowNumberStart1+"";
			}
		}
		String bb = "";
		String[] aa = codesAndIdCardNumbers.split(",");
		if (codesAndIdCardNumbers!=null && codesAndIdCardNumbers!="") {
			for (int i = 0; i < aa.length; i++) {
				bb += "'"+aa[i]+"',";
			}
			bb = bb.substring(0,bb.length()-1);
			excutesql ="select * from (select  ROW_NUMBER() over(order by A0190) as rn,ttt.* from ("+excutesql+ ") ttt)tt where rn >="+rowNumberStart+" and rn <="+rowNumberEnd+requestString+filterString+" and "+searchString+" and (A0190 in ("+bb+") or A019A in ("+bb+"))";
			List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(excutesql);
			if (t.size()>0) {
				List<Map> t1 = new ArrayList<Map>();
				for (int j = 0; j < aa.length; j++) {
					for (int i = 0; i < t.size(); i++) {
						String empCode = (String) t.get(i).get("A0190");
						String empNoCode = (String) t.get(i).get("A019A");
						if (aa[j].equals(empCode) || aa[j].equals(empNoCode)) {
							t1.add(t.get(i));
						}
					}
				}
				map.put("listMap", t1);
				//map.put("primaryKey", primaryKey);
			}else {
				//map.put("primaryKey", primaryKey);
			}
		}else{
			excutesql ="select * from (select ROW_NUMBER() over(order by A0190) as rn,ttt.* from ("+excutesql+ ") ttt) tt where rn >="+rowNumberStart+"and rn <="+rowNumberEnd+requestString+filterString+" and "+searchString+" and 1=1";
			List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(excutesql);
			map.put("listMap", t);
		}
		
		return  map;
	}
	
	//更新或插入数据
	@RequestMapping("/updateData")
	public @ResponseBody List<Map> updateData(HttpServletRequest request,@RequestBody UpdateDataParam params) throws Exception{
		List<Map> kbasecodes = params.getKbasecodes();
		String primaryKeyString = params.getPrimaryKey();
		String keyrule =  params.getKeyrule();
		String[] strs = primaryKeyString.split("\\.");
		String tableName = strs[0];
		String primaryKey = strs[1];
		
		for (int i = 0; i < kbasecodes.size(); i++) {
			Set<Entry<String, String>> entries = kbasecodes.get(i).entrySet();
			String fields="";
			String values="";
			String updateString="";
			String primaryKeyValue = "";
			for (Entry<String, String> entry : entries) {
				String field = entry.getKey();
				String value = entry.getValue();
				if (field.equals(primaryKey)) {
					if (value.equals("")) {
						continue;
					}else {
						primaryKeyValue=value;
					}
					continue;
				}
				if (field.equals("选择")) {
					continue;
				}
				String fieldType = keyserviceImpl.getFieldTypeSqlServer(tableName, field);
				fieldType=fieldType.toLowerCase();
				if (fieldType.equals("nvarchar")  || fieldType.equals("varchar") || fieldType.equals("char") || fieldType.equals("varchar2")) {
					values+="'"+value+"',";
					updateString+=field+"='"+value+"',";
				}else if(fieldType.equals("decimal") || fieldType.equals("numeric") || fieldType.equals("number") || fieldType.equals("int")){
					if (value!=null && value!="") {
						values+=""+value+",";
						updateString+=field+"="+value+",";
					}else {
						values+="null,";
						updateString+=field+"=null,";
					}
					
				}else if (fieldType.equals("smalldatetime") || fieldType.equals("datetime")) {
					if (value!=null && value!="") {
						if  (value.substring(0, 1).equals("-")){
							values+="'',";
							updateString+=field+"='',";
						}else if (value.indexOf("-")!=-1) {
							values+="'"+value+"',";
							updateString+=field+"='"+value+"',";
						}else{
							
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							value = sdf.format(new Date(Long.valueOf(value)));
							values+="'"+value+"',";
							updateString+=field+"='"+value+"',";
						}
					}else {
						values+="'"+value+"',";
						updateString+=field+"='"+value+"',";
					}
				}
				fields+=field+",";
			}
			fields = fields.substring(0, fields.length()-1);
			values = values.substring(0, values.length()-1);
			updateString = updateString.substring(0, updateString.length()-1);
			if (primaryKeyValue.equals("")) {
				String insertSql="";
				if (keyrule.endsWith("ADDID")) {
					insertSql = "insert into "+tableName+"("+fields+") values ("+values+")";
				}else {
					if (keyrule.endsWith("MAXID")) {
						int id=keyserviceImpl.getMaxId(tableName,primaryKey);
						insertSql = "insert into "+tableName+" ("+fields+","+primaryKey+") values ("+values+","+id+")";
					}else {
						String pkid =UUID.randomUUID().toString();
						insertSql = "insert into "+tableName+"("+fields+","+primaryKey+") values ("+values+",'"+pkid+"')";
					}
				}
				System.out.println(insertSql);
				Batch.goBatch(insertSql);
			}else{
				String updateSql = "update "+tableName+" set "+updateString+" where "+primaryKey+" = '"+primaryKeyValue+"'";
				System.out.println(updateSql);
				Batch.goBatch(updateSql);
			}
		}
		
		return  kbasecodes;
	}
	
	//更新或插入数据
	@RequestMapping("/updateFormData")
	public @ResponseBody List<Map> updateFormData(HttpServletRequest request,@RequestBody UpdateDataParam params) throws Exception{
		List<Map> kbasecodes = params.getKbasecodes();
		String primaryKeyString = params.getPrimaryKey();
		String keyrule =  params.getKeyrule();
		//String formId =  params.getFormId();
		//SysFormconfigCache aa = formService.getForm(formId);
		String[] strs = primaryKeyString.split("\\.");
		String tableName = strs[0];
		String primaryKey = strs[1];
		List<Map> fieldNames = keyserviceImpl.getFieldNamesSqlServer(tableName);
		
		for (int i = 0; i < kbasecodes.size()-2; i++) {
			Set<Entry<String, String>> entries = kbasecodes.get(i).entrySet();
			String fields="";
			String values="";
			String updateString="";
			String primaryKeyValue = "";
			for (int j = 0; j < fieldNames.size(); j++) {
				String fieldName = (String) fieldNames.get(j).get("column_name");
				
				for (Entry<String, String> entry : entries) {
					String field = entry.getKey();
					if (fieldName!=null && fieldName!="") {
						if (fieldName.equals(field)) {
							String value = entry.getValue();
							if (field.equals(primaryKey)) {
								if (value.equals("")) {
									continue;
								}else {
									primaryKeyValue=value;
								}
								continue;
							}
							if (field.equals("选择")) {
								continue;
							}
							String fieldType = keyserviceImpl.getFieldTypeSqlServer(tableName, field);
							fieldType=fieldType.toLowerCase();
							if (fieldType.equals("nvarchar")  || fieldType.equals("varchar") || fieldType.equals("char") || fieldType.equals("varchar2")) {
								values+="'"+value+"',";
								updateString+=field+"='"+value+"',";
							}else if(fieldType.equals("decimal") || fieldType.equals("numeric") || fieldType.equals("number")){
								if (value!=null && value!="") {
									values+=""+value+",";
									updateString+=field+"="+value+",";
								}else {
									values+="null,";
									updateString+=field+"=null,";
								}
								
							}else if (fieldType.equals("smalldatetime") || fieldType.equals("datetime")) {
								if (value!=null && value!="") {
									if (value.indexOf("-")!=-1) {
										values+="'"+value+"',";
										updateString+=field+"='"+value+"',";
									}else {
										SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
										value = sdf.format(new Date(Long.valueOf(value)));
										values+="'"+value+"',";
										updateString+=field+"='"+value+"',";
									}
								}
							}
							fields+=field+",";
						}else {
							continue;
						}
					}
					
					
				}
			}
			
			fields = fields.substring(0, fields.length()-1);
			values = values.substring(0, values.length()-1);
			updateString = updateString.substring(0, updateString.length()-1);
			if (primaryKeyValue.equals("")) {
				String insertSql="";
				if (keyrule.endsWith("ADDID")) {
					insertSql = "insert into "+tableName+"("+fields+") values ("+values+")";
				}else {
					if (keyrule.endsWith("MAXID")) {
						int id=keyserviceImpl.getMaxId(tableName,primaryKey);
						insertSql = "insert into "+tableName+" ("+fields+","+primaryKey+") values ("+values+","+id+")";
					}else {
						String pkid =UUID.randomUUID().toString();
						insertSql = "insert into "+tableName+"("+fields+","+primaryKey+") values ("+values+",'"+pkid+"')";
					}
				}
				System.out.println(insertSql);
				Batch.goBatch(insertSql);
			}else{
				String updateSql = "update "+tableName+" set "+updateString+" where "+primaryKey+" = '"+primaryKeyValue+"'";
				System.out.println(updateSql);
				Batch.goBatch(updateSql);
			}
		}
		
		return  kbasecodes;
	}
	
	
	//删除数据
	@RequestMapping("/deleteData")
	public @ResponseBody String deleteData(HttpServletRequest request,@RequestBody DeleteDataParam params) throws Exception{
		List<Map> kbasecodes = params.getKbasecodes();
		String primaryKeyString = params.getPrimaryKey();
		String[] strs = primaryKeyString.split("\\.");
		String tableName = strs[0];
		String primaryKey = strs[1];
		
		for (int i = 0; i < kbasecodes.size(); i++) {
			Set<Entry<String, String>> entries = kbasecodes.get(i).entrySet();
			String values="";
			String primaryKeyValue = "";
			String checkValue = "";
			for (Entry<String, String> entry : entries) {
				String field = entry.getKey();
				String value = entry.getValue();
				if (field.equals(primaryKey)) {
					if (value.equals("")) {
						continue;
					}else {
						primaryKeyValue=value;
					}
					continue;
				}
				if (field.equals("选择")) {
					if (value.equals("")) {
						continue;
					}else {
						checkValue=value;
					}
					continue;
				}
				
				
			}
			
			if (checkValue.equals("yes")) {
				String Sql="";
				Sql = "delete from "+tableName+" where "+primaryKey+"="+primaryKeyValue;
				Batch.goBatch(Sql);
		
			}
		}
		return "";
	}

}
