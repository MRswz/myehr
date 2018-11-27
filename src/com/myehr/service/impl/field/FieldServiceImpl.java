package com.myehr.service.impl.field;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.mybatis.Pagers;
import com.myehr.common.util.ChangeSqlColumn;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.entityexpand.EntityMapperExpand;
import com.myehr.mapper.field.SysFieldMapper;
import com.myehr.mapper.fieldexpand.DataFieldMapperExpand;
import com.myehr.mapper.fieldexpand.FieldMapperExpand;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.field.DataField;
import com.myehr.pojo.field.SysField;
import com.myehr.service.field.FieldService;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;


	@Service("FieldServiceImpl")
	public class FieldServiceImpl implements FieldService {

		@Autowired
		SysFieldMapper sMapper;
		@Autowired
		FieldMapperExpand fMapperExpand;
		@Autowired
		SysEntityMapper sEntityMapper;
		@Autowired
		EntityMapperExpand expand;
		@Autowired
		DataFieldMapperExpand dMapperExpand;
//		@Autowired
		@Resource(name = "PrimaryKeyService")  
		private PrimaryKeyService pImpl;
		
		public Pagers translateRequest(HttpServletRequest request,String expand) {
			ChangeSqlColumn csColumn=new ChangeSqlColumn();
			Pagers pagers=new Pagers();
			Map<String, String[]> map=request.getParameterMap();  
		    Set<Entry<String, String[]>> keSet=map.entrySet();
		    for(Iterator<Entry<String, String[]>> itr=keSet.iterator();itr.hasNext();){  
		        @SuppressWarnings("rawtypes")
				Map.Entry me=(Map.Entry)itr.next();  
		        Object ok=me.getKey();  
		        Object ov=me.getValue();  
		        String[] value=new String[1];  
		        if(ov instanceof String[]){  
		            value=(String[])ov;  
		        }else{  
		            value[0]=ov.toString();  
		        } 
		        for(int k=0;k<value.length;k++){  
		            if(ok.equals("limit")){
		            	pagers.setLimit(Integer.valueOf(value[k]));
		            }
		            if (ok.equals("pageSize")) {
		            	pagers.setPageSize(Integer.valueOf(value[k]));
					}
		            if (ok.equals("order")) {
		            	if(value[k].equals(""))
		            	{
		            		pagers.setOrder("asc");
		            	}else {
			            	pagers.setOrder(value[k]);
						}
					}
		            if (ok.equals("sort")) {
		            	if(value[k].equals("")||value[k]==null)
		            	{
		            		pagers.setSort("");
		            	}else {
			            	pagers.setSort("order by "+value[k]+" ");
						}
		                
					}
		            if (ok.equals("condition")) {
			            pagers.setConditionString(value[k]);
					}
		            if (ok.equals(expand)) {
		                pagers.setExpand(value[k]);
					}
		            if (ok.equals("deleteMark")) {
		            	if(value[k].equals(""))
		            	{
		            		pagers.setDeleteMark("N");
		            	}else {
		            		pagers.setDeleteMark(value[k]);
						}
					}
		        }
		      }
		    
	        if(pagers.getLimit()==0){
	        	pagers.setLimit(1000);
	        }
			return pagers;
		}
		
		@Override
		public ResultMap getAllFieldOracle(HttpServletRequest request) throws Exception {
			// TODO Auto-generated method stub
			String sql;
			Pagers pagers=translateRequest(request,"fieldEntityId");
			//oracle
			sql="	SELECT a1.* FROM(SELECT a.*, ROWNUM rn FROM (select * from sys_field ORDER BY FIELD_SORT) a WHERE (upper(FIELD_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_CHINA_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_TYPE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_LEN) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_DICT) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_IS_BUS_KEY) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_IS_KEY) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_IS_LOG) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_IS_NULL) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_DATA_TYPE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_SORT) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(CONTROL_TYPE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(DICT_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
					"AND DELETE_MARK = '"+pagers.getDeleteMark()+"'"+
					"AND FIELD_ENTITY_ID = "+String.valueOf(pagers.getExpand())+" and ROWNUM <= "+pagers.getPageSize()*pagers.getLimit()+" ORDER BY "+pagers.getSort().toUpperCase()+" "+pagers.getOrder()+")a1 WHERE rn >= "+((pagers.getPageSize()-1)*pagers.getLimit()+1);
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<SysField> list = fMapperExpand.getAllField(maps); //当前页显示的数据  
	        sql="SELECT COUNT(*) from (select * FROM sys_field WHERE ((FIELD_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_CHINA_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_TYPE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_LEN) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_DICT) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_IS_BUS_KEY) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_IS_KEY) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_IS_LOG) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_IS_NULL) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_DATA_TYPE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_SORT) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(CONTROL_TYPE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(DICT_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
					"AND DELETE_MARK = '"+pagers.getDeleteMark()+"'"+
					"AND FIELD_ENTITY_ID = "+String.valueOf(pagers.getExpand())+") a";
	        maps.put("sql", sql);
	        Integer total = fMapperExpand.operation3(maps);  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysField u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;  
		}
		
		@Override
		public ResultMap getAllFieldMysql(HttpServletRequest request) throws Exception {
			// TODO Auto-generated method stub
			String sql;
			Pagers pagers=translateRequest(request,"fieldEntityId");
			//mysql
			sql = " SELECT TOP "+pagers.getLimit()+" * "+
				  "	FROM sys_field "+
				  "	WHERE (field_id NOT IN "+
				  "	(SELECT TOP ("+pagers.getLimit()+"*("+pagers.getPageSize()+"-1)) field_id "+
				  "	FROM sys_field WHERE (field_tablename like '%"+pagers.getConditionString()+"%' or field_code like '%"+pagers.getConditionString()+"%' or field_china_name like '%"+pagers.getConditionString()+"%' ) AND FIELD_ENTITY_ID = "+String.valueOf(pagers.getExpand())+" and delete_mark = '"+pagers.getDeleteMark()+"' "+pagers.getSort()+")) and (field_tablename like '%"+pagers.getConditionString()+"%' or field_code like '%"+pagers.getConditionString()+"%' or field_china_name like '%"+pagers.getConditionString()+"%' ) AND FIELD_ENTITY_ID = "+String.valueOf(pagers.getExpand())+" and delete_mark = '"+pagers.getDeleteMark()+"' "+pagers.getSort();	
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<SysField> list = fMapperExpand.getAllField(maps); //当前页显示的数据  
	        sql="SELECT COUNT(*) from (select * FROM sys_field WHERE ((FIELD_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_CHINA_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%'"+
					"OR upper(FIELD_TABLENAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%')"+
					"AND DELETE_MARK = '"+pagers.getDeleteMark()+"'"+
					"AND FIELD_ENTITY_ID = "+String.valueOf(pagers.getExpand())+") a";
	        maps.put("sql", sql);
	        Integer total = fMapperExpand.operation3(maps);  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysField u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;  
		}

		@Override
		public String updateSysField(SysField sField) throws Exception {
			// TODO Auto-generated method stub
			String reCode;
			try {
				sMapper.updateByPrimaryKey(sField);
			} catch (Exception e) {
				// TODO: handle exception
				reCode="1";
			}
			reCode = "0";
			return reCode;
		}

		@Override
		public String deleteSysFieldOracle(SysField sField) throws Exception {
			// TODO Auto-generated method stub
			String reCode;
			String sql;
			Map<String, Object> map = new HashMap<String, Object>();
			try {
				//删除表中字段
				sql = "select * from sys_entity where entity_id = "+ sField.getFieldEntityId();
				map.put("sql", sql);
				SysEntity sEntity=expand.getSysEntityById(map);
				if(sField.getFieldCode().toUpperCase().equals(sEntity.getEntityTablename().toUpperCase()+"_ID")){
					reCode="2";//主键不允许删除
				}else {
					sMapper.deleteByPrimaryKey(sField.getFieldId());
					//ORACLE
					sql = "alter table "+sEntity.getEntityCode()+" drop ("+sField.getFieldCode()+")";
					map.put("sql", sql);
			        fMapperExpand.operation(map);
					reCode = "0";//删除成功
				}
			} catch (Exception e) {
				// TODO: handle exception
				reCode="1";//删除异常
			}
			return reCode;
		}
		
		@Override
		public String deleteSysFieldMysql(SysField sField) throws Exception {
			// TODO Auto-generated method stub
			String reCode;
			String sql;
			Map<String, Object> map = new HashMap<String, Object>();
			try {
				//删除表中字段
				sql = "select * from sys_entity where entity_id = "+ sField.getFieldEntityId();
				map.put("sql", sql);
				SysEntity sEntity=expand.getSysEntityById(map);
				if(sField.getFieldCode().toUpperCase().equals(sEntity.getEntityTablename().toUpperCase()+"_ID")){
					reCode="2";//主键不允许删除
				}else {
					sMapper.deleteByPrimaryKey(sField.getFieldId());
					//MYSQL
					sql = "alter table "+sEntity.getEntityCode()+" drop "+sField.getFieldCode()+"";
					map.put("sql", sql);
			        fMapperExpand.operation(map);
					reCode = "0";//删除成功
				}
			} catch (Exception e) {
				// TODO: handle exception
				reCode="1";//删除异常
			}
			return reCode;
		}

		@Override
		public String insertSysField(SysField sField) throws Exception {
			// TODO Auto-generated method stub
			String reCode;
			try {
				sMapper.insert(sField);
				reCode = "0";//成功
			} catch (Exception e) {
				// TODO: handle exception
				reCode="1";//异常
			}
			return reCode;
		}
		@Override
		public String insertField(SysField sField) throws Exception {
			// TODO Auto-generated method stub
			String reCode;
			String sql;
			Map<String, Object> map = new HashMap<String, Object>();
			sql = "select * from sys_entity where entity_id = "+ sField.getFieldEntityId();
			map.put("sql", sql);
			SysEntity sEntity=expand.getSysEntityById(map);
			if (isSameName2(sField,sEntity).equals("0")) {
				//str.toUpperCase()转大写;
				sField.setFieldType(sField.getFieldType().toUpperCase());
				sField.setFieldCode(sField.getFieldCode().toUpperCase());
				sField.setFieldTablename(sField.getFieldCode().toUpperCase());
				reCode=addFieldMysql(sEntity, sField);
//				reCode=addFieldOracle(sEntity, sField);
			}
			else{
				reCode="2";//字段名重复
			}
			return reCode;
		}

		public String addFieldMysql(SysEntity sEntity,SysField sField) {
			String reCodeString;
			String sql = "";
			String sql1 = "";
			try {
				Map<String, Object> map = new HashMap<String, Object>();
				if (sField.getFieldIsNull().equals("Y")) {
					if(sField.getFieldType().equals("DATETIME")){
						sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+sField.getFieldType()+" DEFAULT NULL ";
						sql1 = "EXECUTE sp_addextendedproperty 'MS_Description', '"+sField.getFieldChinaName()+"', 'user', 'dbo', 'table', '"+sEntity.getEntityCode()+"', 'column', '"+sField.getFieldCode()+"'";
					}else if (sField.getFieldType().equals("FLOAT")) {
						if (sField.getFieldDict().equals("")) {
							sField.setFieldDict("0");
						}
						sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+sField.getFieldType()+"("+sField.getFieldLen()+","+sField.getFieldDict()+") DEFAULT NULL ";
						sql1 = "EXECUTE sp_addextendedproperty 'MS_Description', '"+sField.getFieldChinaName()+"', 'user', 'dbo', 'table', '"+sEntity.getEntityCode()+"', 'column', '"+sField.getFieldCode()+"'";
					}/*else if (sField.getFieldType().equals("INT")) {
						sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+sField.getFieldType()+"("+sField.getFieldLen()+") DEFAULT NULL COMMENT '"+sField.getFieldChinaName()+"'";
				    }*/else {
				    	sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+sField.getFieldType()+"("+sField.getFieldLen()+") DEFAULT NULL ";
				    	sql1 = "EXECUTE sp_addextendedproperty 'MS_Description', '"+sField.getFieldChinaName()+"', 'user', 'dbo', 'table', '"+sEntity.getEntityCode()+"', 'column', '"+sField.getFieldCode()+"'";
				    }
				}else {
					if(sField.getFieldType().equals("DATETIME")){
						sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+sField.getFieldType()+" NOT NULL ";
						sql1 = "EXECUTE sp_addextendedproperty 'MS_Description', '"+sField.getFieldChinaName()+"', 'user', 'dbo', 'table', '"+sEntity.getEntityCode()+"', 'column', '"+sField.getFieldCode()+"'";
					}else if (sField.getFieldType().equals("FLOAT")) {
						if (sField.getFieldDict().equals("")) {
							sField.setFieldDict("0");
						}
						sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+sField.getFieldType()+"("+sField.getFieldLen()+","+sField.getFieldDict()+") NOT NULL ";
						sql1 = "EXECUTE sp_addextendedproperty 'MS_Description', '"+sField.getFieldChinaName()+"', 'user', 'dbo', 'table', '"+sEntity.getEntityCode()+"', 'column', '"+sField.getFieldCode()+"'";
					}/*else if (sField.getFieldType().equals("INT")) {
						sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+sField.getFieldType()+"("+sField.getFieldLen()+") NOT NULL COMMENT '"+sField.getFieldChinaName()+"'";
				    }*/else {
				    	sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+sField.getFieldType()+"("+sField.getFieldLen()+") NOT NULL ";
				    	sql1 = "EXECUTE sp_addextendedproperty 'MS_Description', '"+sField.getFieldChinaName()+"', 'user', 'dbo', 'table', '"+sEntity.getEntityCode()+"', 'column', '"+sField.getFieldCode()+"'";
					}
				}
				map.put("sql", sql);
		        fMapperExpand.operation(map);
		        map.put("sql", sql1);
		        fMapperExpand.operation(map);
		        reCodeString = "0";//完全成功
		} catch (Exception e) {
			// TODO: handle exception
			reCodeString="1";//异常报错
		}
			return reCodeString;
		}
		public String addFieldOracle(SysEntity sEntity,SysField sField) {
			String reCodeString;
			String sql;
			Map<String, Object> map = new HashMap<String, Object>();
			try {
				String FieldType1=new String();
				if(("DATE").equals(sField.getFieldType())||("datetime").equals(sField.getFieldType())||("DATETIME").equals(sField.getFieldType())||("date").equals(sField.getFieldType())){
				}
				else{
				if((sField.getFieldDict())!=null){
					if("NUMBER".equals(sField.getFieldType())||"DECIMAL".equals(sField.getFieldType()))
					{
						FieldType1= sField.getFieldType()+"("+sField.getFieldLen()+","+sField.getFieldDict()+")";
					}
					else{
						FieldType1=sField.getFieldType()+"("+sField.getFieldLen()+")";
					}
				}else
					{
						FieldType1=sField.getFieldType()+"("+sField.getFieldLen()+")";//varchar2
					}
				}
				
				if("Y".equals(sField.getFieldIsNull())){
					if("NUMBER".equals(sField.getFieldType())||"VARCHAR2".equals(sField.getFieldType())||"DECIMAL".equals(sField.getFieldType())||"NVARCHAR".equals(sField.getFieldType())){//允许空,类型带长度
						sql="alter TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+" "+FieldType1;
						map.put("sql", sql);
						fMapperExpand.operation(map);
					}else{//允许空,类型不带长度
						sql="alter TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+sField.getFieldType();
						map.put("sql", sql);
						fMapperExpand.operation(map);
					}
				}else{
					if("NUMBER".equals(sField.getFieldType())||"VARCHAR2".equals(sField.getFieldType())||"DECIMAL".equals(sField.getFieldType())||"NVARCHAR".equals(sField.getFieldType())){//不允许空,类型带长度
						sql = "alter TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+FieldType1+" not null";
						map.put("sql", sql);
						fMapperExpand.operation(map);
					}else{//不允许空,类型不带长度
						sql = "alter TABLE "+sEntity.getEntityCode()+" ADD "+sField.getFieldCode()+sField.getFieldType()+" not null";
						map.put("sql", sql);
						fMapperExpand.operation(map);
					}
				}
				/*if("Oracle".equalsIgnoreCase(productName)){
					getDASTemplate().executeNamedSql(nameSqlPath + "addzhushiOracle", map);
				}else if("SqlServer".equalsIgnoreCase(productName)){
					getDASTemplate().executeNamedSql(nameSqlPath + "addzhushiMsSql", map);
				}*/
				sql = "comment on column "+sEntity.getEntityCode()+"."+sField.getFieldCode()+" is '"+sField.getFieldChinaName()+"'";
				map.put("sql", sql);
				fMapperExpand.operation(map);
		        reCodeString = "0";//完全成功
		} catch (Exception e) {
			// TODO: handle exception
			reCodeString="1";//异常报错
		}
			return reCodeString;
		}

		public String isSameName(SysField sField,SysEntity sEntity) {
			String reCode;
			String sql = "select count(*) from sys_field where field_entity_id='"+sEntity.getEntityId()+"' and field_code='"+sField.getFieldCode()+"'";
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sql", sql);
	        try {
	        	reCode=fMapperExpand.operation2(map);
			} catch (Exception e) {
				// TODO: handle exception
				reCode="1";
			}
			return reCode;
		}//字段表判重
		
		public String isSameName2(SysField sField,SysEntity sEntity) {
			String reCode;
			String sql = "select count(*) from (select * from sys_entity WHERE ENTITY_CODE='"+sField.getFieldCode()+"') a";
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sql", sql);
	        try {
	        	reCode=fMapperExpand.operation2(map);
			} catch (Exception e) {
				reCode="1";
			}
			return reCode;
		}//数据库字段判重

		public ResultMap findStandardsFieldListOracle(HttpServletRequest request) {
			// TODO Auto-generated method stub
			String sql;
			Pagers pagers=translateRequest(request,"fieldEntityId");
			SysEntity sEntity=sEntityMapper.selectByPrimaryKey(Integer.valueOf(pagers.getExpand()));
			//ORACLE
			sql = "SELECT a1.* FROM (SELECT DATAFIELD.*, ROWNUM rn FROM DATAFIELD WHERE '"+sEntity.getEntityTablename()+"_' || FIELD_CODE NOT IN ( SELECT FIELD_CODE FROM sys_field WHERE FIELD_ENTITY_ID = '"+sEntity.getEntityId()+"' ) ) a1 WHERE rn >= "+ ((pagers.getPageSize()-1)*pagers.getLimit()+1);
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<DataField> list = dMapperExpand.getAllDataField(maps); //当前页显示的数据  
	        
	        for (DataField dataField : list) {
				dataField.setFieldCode(sEntity.getEntityTablename()+"_"+dataField.getFieldCode());
				dataField.setTableCode(sEntity.getEntityCode().toLowerCase());
				dataField.setTableName(String.valueOf(sEntity.getEntityId()));
				dataField.setEntityCode(sEntity.getEntityTablename().toUpperCase());
			}
	        //oracle
	        sql = "select count(*) from (select * from DATAFIELD WHERE '"+sEntity.getEntityTablename()+"_'||FIELD_CODE NOT IN (SELECT FIELD_CODE FROM sys_field WHERE FIELD_ENTITY_ID='"+sEntity.getEntityId()+"'))";
	        maps.put("sql", sql);
	        Integer total = dMapperExpand.getTotalField(maps);  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (DataField u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;
		}

		public ResultMap findStandardsFieldListMssql(HttpServletRequest request) {
			// TODO Auto-generated method stub
			String sql;
			Pagers pagers=translateRequest(request,"fieldEntityId");
			SysEntity sEntity=sEntityMapper.selectByPrimaryKey(Integer.valueOf(pagers.getExpand()));
			//MYSQL
		    //sql="select * from data_field WHERE CONCAT('"+sEntity.getEntityTablename()+"','_', FIELD_CODE) NOT IN (SELECT FIELD_CODE FROM sys_field WHERE FIELD_ENTITY_ID="+sEntity.getEntityId()+") order by  "+ pagers.getSort() +" "+ pagers.getOrder() + " limit " + (pagers.getPageSize()-1)*pagers.getLimit()+","+pagers.getLimit();
			sql="SELECT * FROM datafield WHERE (FIELD_CODE LIKE '%"+pagers.getConditionString()+"%' OR FIELD_NAME LIKE '%"+pagers.getConditionString()+"%' ) AND  FIELD_CODE NOT IN (SELECT FIELD_CODE FROM sys_field WHERE FIELD_ENTITY_ID = " + sEntity.getEntityId () + ")" + pagers.getSort () ;
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<DataField> list = dMapperExpand.getAllDataField(maps); //当前页显示的数据  
	        
	        for (DataField dataField : list) {
				dataField.setTableCode(sEntity.getEntityCode().toLowerCase());
				dataField.setTableName(String.valueOf(sEntity.getEntityId()));
				dataField.setEntityCode(sEntity.getEntityTablename().toUpperCase());
			}
	        
	        Integer total = list.size();  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (DataField u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;
		}
		
		@Override
		public String insertStandartsField(List<DataField> dataFields)
				throws Exception {
			for (DataField dataField : dataFields) {
				SysField sysField=new SysField();
				sysField.setFieldCode(dataField.getFieldCode());
				sysField.setFieldEntityId(new BigDecimal(dataField.getTableName()));
				sysField.setFieldTablename(dataField.getEntityCode());
				sysField.setFieldChinaName(dataField.getFieldName());
				sysField.setFieldIsNull(dataField.getIsrequired());
				sysField.setFieldIsKey(dataField.getIspk());
				sysField.setFieldType(dataField.getFieldType());
				sysField.setFieldLen(dataField.getFieldLen());
//				sysField.setFieldDict(fieldDict);
//				sysField.setFieldSort(fieldSort);
//				sysField.setFieldState(fieldState);
//				sysField.setFieldIsMark(fieldIsMark);
				sysField.setDeleteMark("N");
				sysField.setDeleteMarkBack("N");
				sysField.setFieldDataType(dataField.getDataType());
//				sysField.setFieldIsLog(fieldIsLog);
				sysField.setFieldIsBusKey(dataField.getIsnk());
//				sysField.setControlType(controlType);
//				sysField.setDictCode(dictCode);
				insertSysField(sysField);
				insertField(sysField);
			}
			return "0";
		}

		@Override
		//mysql
		public ResultMap findFieldByEntityCode(HttpServletRequest request)
				throws Exception {
				Pagers pagers=translateRequest(request, "fieldEntityCode");
				String sql ="";
				Map<String, Object> map=new HashMap<String, Object>();
				sql=	"SELECT COLUMN_NAME AS field_code,COLUMN_COMMENT AS field_china_name,IS_NULLABLE AS field_is_null,COLUMN_KEY AS field_is_key,"+
						"DATA_TYPE AS field_type,COLUMN_TYPE AS field_len,ORDINAL_POSITION AS field_sort FROM information_schema. COLUMNS WHERE "+
						"table_name = '"+pagers.getExpand()+"'";
				map.put("sql", sql);
				List<SysField> list=fMapperExpand.getAllField(map);
				for (SysField sysField : list) {
					if(sysField.getFieldIsNull().equals("NO")){
						sysField.setFieldIsNull("N");
					}else{
						sysField.setFieldIsNull("Y");
					}
					if(sysField.getFieldIsKey().equals("PRI")){
						sysField.setFieldIsKey("Y");
					}else{
						sysField.setFieldIsKey("N");
					}
					if(sysField.getFieldType().equals("int")||sysField.getFieldType().equals("varchar")){
						sysField.setFieldLen(substringLen2(sysField.getFieldLen())[0]);
					}else if (sysField.getFieldType().equals("float")) {
						sysField.setFieldLen(substringLen2(sysField.getFieldLen())[0]);
						sysField.setFieldDict(substringLen2(sysField.getFieldLen())[1]);
					}else {
						sysField.setFieldLen("");
					}
				}
				long total=10;
				ResultMap rMap=new ResultMap();
				List<Object> list_obj=new ArrayList<Object>();
				for (SysField u : list) {
					list_obj.add(u);
				}
				rMap.setRows(list_obj);
				rMap.setTotal(total);
				return rMap;
		}
		
		public ResultMap findFieldByEntityCodeOracle(HttpServletRequest request){
			Pagers pagers=translateRequest(request, "fieldEntityCode");
			
			Map<String, Object> map=new HashMap<String, Object>();
			String sql =	"SELECT UTCL.column_name as field_code,UTCL.column_id as field_sort, UTCL.data_type as field_type, UTCL.data_length as field_len, UTCL.data_scale as field_dict, UTCL.nullable as field_is_null, UCCM.COMMENTS as field_china_name"+
							" FROM user_tab_columns utcl LEFT JOIN user_col_comments uccm ON uccm.column_name = utcl.column_name and uccm.table_name=utcl.table_name WHERE	utcl.table_name = UPPER ('"+pagers.getExpand()+"')";
			map.put("sql", sql);
			List<SysField> list=fMapperExpand.getAllField(map);
			sql = "select column_name as field_code from user_cons_columns a, user_constraints b  where a.constraint_name = b.constraint_name  and b.constraint_type = 'P' and a.table_name = UPPER ('"+pagers.getExpand()+"')";
			map.put("sql", sql);
			String fieldCodePK = fMapperExpand.operation2(map);
			for (SysField sysField : list) {
				if (sysField.getFieldCode().equals(fieldCodePK)) {
					sysField.setFieldIsKey("Y");
				}else {
					sysField.setFieldIsKey("N");
				}
				sysField.setFieldIsLog("Y");
				sysField.setFieldIsBusKey("N");
			}
			long total=10;
			ResultMap rMap=new ResultMap();
			List<Object> list_obj=new ArrayList<Object>();
			for (SysField u : list) {
				list_obj.add(u);
			}
			rMap.setRows(list_obj);
			rMap.setTotal(total);
			return rMap;
		}
		
		public ResultMap findFieldByEntityCodeMssql(HttpServletRequest request){
			Pagers pagers=translateRequest(request, "fieldEntityCode");
			
			Map<String, Object> map=new HashMap<String, Object>();
			
			String sql = "	SELECT distinct field_tablename=d.name,"+
					 	 "			field_code=a.name,a.id,a.colorder,"+
					 	 "	field_is_key=case   when   exists(SELECT   1   FROM   sysobjects   where   xtype='PK'   and   name   in   ("+
					 	 "  SELECT   name   FROM   sysindexes   WHERE   indid   in("+
					     "  SELECT   indid   FROM   sysindexkeys   WHERE   id   =   a.id   AND   colid=a.colid"+
					 	 "   )))   then   'Y'   else   'N'   end,"+
					     "   field_type=b.name,"+
						 "   FIELD_LEN=COLUMNPROPERTY(a.id,a.name,'PRECISION'),"+
						 "   FIELD_dict=isnull(COLUMNPROPERTY(a.id,a.name,'Scale'),0),"+
						 "   field_is_null=case   when   a.isnullable=1   then   'Y'else   'N'   end,"+
						 "    FIELD_CHINA_NAME=isnull(CAST (g.[value] AS nvarchar(500)),''),"+
						 "    field_sort=a.colorder"+
						 "     FROM   syscolumns   a"+
						 "    left   join   systypes   b   on   a.xusertype=b.xusertype"+
						 "    inner   join   sysobjects   d   on   a.id=d.id     and   (d.xtype='U' or d.xtype='V') "+
						 "    left   join   syscomments   e   on   a.cdefault=e.id"+
						 "     left   join   sys.extended_properties   g   on   a.id=g.major_id   and   a.colid=g.minor_id"+
						 "     left   join   sys.extended_properties   f   on   d.id=f.major_id   and   f.minor_id=0"+
						 "    where   d.name='"+pagers.getExpand()+"'"+
						 "    order   by   a.id,a.colorder";	
			map.put("sql", sql);
			List<SysField> list=fMapperExpand.getAllField(map);			
			long total=list.size();
			ResultMap rMap=new ResultMap();
			List<Object> list_obj=new ArrayList<Object>();
			for (SysField u : list) {
				if (u.getFieldIsNull().equals("1")) {
					u.setFieldIsNull("Y");
				} else {
					u.setFieldIsNull("N");
				}
				u.setFieldIsBusKey("N");
				u.setFieldIsLog("Y");
				u.setDeleteMark("N");
				list_obj.add(u);
			}
			rMap.setRows(list_obj);
			rMap.setTotal(total);
			return rMap;
		}
		
		public String[] substringLen2(String str) {
			String[] anArray=new String[6];
			int index1 = str.indexOf('(');
			int index3 = str.indexOf(')');
			int index2 = str.indexOf(',');
			if(index2>0){
			anArray[0]= str.substring(index1 + 1, index2);
			anArray[1]= str.substring(index2 + 1, index3);
			}else if (index1>0&&index3>0) {
				anArray[0] = str.substring(index1 + 1, index3);
			}
			return anArray;
		}

		@Override
		public ResultMap getAllFieldListByTemplate(HttpServletRequest request)
				throws Exception {
			String sql;
			Pagers pagers=translateRequest(request,"fieldEntityId");
			sql = "select sys_field.* from sys_field where field_entity_id = "+pagers.getExpand()+" and field_id not in (select template_column_column_id from sys_template_column where template_template_id = "+pagers.getDeleteMark()+") "+ pagers.getSort()  ;
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<SysField> list = fMapperExpand.getAllField(maps); //当前页显示的数据  
	        
	        //mysqls
	        sql="select count(*) from (select sys_field.* from sys_field where field_entity_id = "+pagers.getExpand()+" and field_id not in (select template_column_column_id from sys_template_column where template_template_id = "+pagers.getDeleteMark()+"))a";
	        maps.put("sql", sql);
	        Integer total = dMapperExpand.getTotalField(maps);  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysField u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;
		}
	}


