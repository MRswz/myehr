package com.myehr.service.impl.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myehr.common.mybatis.Pagers;
import com.myehr.common.util.ResultMap;
import com.myehr.mapper.entity.SysEntityMapper;
import com.myehr.mapper.entityexpand.EntityMapperExpand;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.field.SysField;
import com.myehr.service.entity.EntityService;
import com.myehr.service.field.FieldService;
import com.myehr.service.impl.field.FieldServiceImpl;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;
@Service("EntityServiceImpl")
public class EntityServiceImpl implements EntityService {

	@Autowired
	EntityMapperExpand eMapperExpand;
	@Autowired
	SysEntityMapper sMapper;
//	@Autowired
	@Resource(name = "FieldService")  
	FieldService fServiceImpl;
//	@Autowired
	@Resource(name = "PrimaryKeyService")  
	private PrimaryKeyService pImpl;
	
	@Override
	public ResultMap getAllEntityOracle(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		String sql;
		Pagers pagers=fServiceImpl.translateRequest(request, "entityType");
		if((pagers.getExpand()==null)||(pagers.getExpand().equals("null"))||(pagers.getExpand().equals(""))){
			//oracle
			sql = "SELECT a1.* FROM(SELECT sys_entity.*, ROWNUM rn FROM sys_entity WHERE ROWNUM <= "+pagers.getPageSize()*pagers.getLimit()+" and DELETE_MARK = "+"'"+pagers.getDeleteMark()+"'"+") a1 WHERE rn >= "+ ((pagers.getPageSize()-1)*pagers.getLimit()+1);
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<SysEntity> list = eMapperExpand.getAllEntity(maps); //当前页显示的数据  
	        sql = "select count(1) from sys_entity where DELETE_MARK = "+"'"+pagers.getDeleteMark()+"'";
	        maps.put("sql", sql);
	        Integer total = eMapperExpand.getTotalEntity(maps);  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysEntity u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;
		}else {
			//oracle
			sql = "SELECT a1.* FROM(SELECT sys_entity.*, ROWNUM rn FROM sys_entity WHERE ROWNUM <= "+pagers.getPageSize()*pagers.getLimit()+" and DELETE_MARK = "+"'"+pagers.getDeleteMark()+"' and entity_type = '"+pagers.getExpand()+"') a1 WHERE rn >= "+ ((pagers.getPageSize()-1)*pagers.getLimit()+1);
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<SysEntity> list = eMapperExpand.getAllEntity(maps); //当前页显示的数据  
	        sql = "select count(1) from sys_entity where DELETE_MARK = "+"'"+pagers.getDeleteMark()+"' and entity_type = '"+pagers.getExpand()+"'";
	        maps.put("sql", sql);
	        Integer total = eMapperExpand.getTotalEntity(maps);  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysEntity u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;
		}
	}
	
	@Override
	public ResultMap getAllEntityMysql(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		String sql;
		Pagers pagers=fServiceImpl.translateRequest(request, "entityType");
		if((pagers.getExpand().equals("null"))||(pagers.getExpand()==null)||(pagers.getExpand().equals(""))){
			//mysql
			sql = " SELECT TOP "+pagers.getLimit()+" * "+
					  "	FROM sys_entity "+
					  "	WHERE (entity_id NOT IN "+
					  "	(SELECT TOP ("+pagers.getLimit()+"*("+pagers.getPageSize()+"-1)) entity_id "+
					  "	FROM sys_entity WHERE (entity_code like '%"+pagers.getConditionString()+"%' or entity_chinaname like '%"+pagers.getConditionString()+"%' ) and delete_mark = '"+pagers.getDeleteMark()+"' "+pagers.getSort()+")) and (entity_code like '%"+pagers.getConditionString()+"%' or entity_chinaname like '%"+pagers.getConditionString()+"%' ) and delete_mark = '"+pagers.getDeleteMark()+"' "+pagers.getSort();	
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<SysEntity> list = eMapperExpand.getAllEntity(maps); //当前页显示的数据  
	        sql = "select count(1) from sys_entity where DELETE_MARK = "+"'"+pagers.getDeleteMark()+"' and (entity_code like '%"+pagers.getConditionString()+"%' or entity_chinaname like '%"+pagers.getConditionString()+"%' ) " ;
	        maps.put("sql", sql);
	        Integer total = eMapperExpand.getTotalEntity(maps);  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysEntity u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;
		}else {
			//mysql
			sql = " SELECT TOP "+pagers.getLimit()+" * "+
					  "	FROM sys_entity "+
					  "	WHERE (entity_id NOT IN "+
					  "	(SELECT TOP ("+pagers.getLimit()+"*("+pagers.getPageSize()+"-1)) entity_id "+
					  "	FROM sys_entity WHERE (entity_code like '%"+pagers.getConditionString()+"%' or entity_chinaname like '%"+pagers.getConditionString()+"%' ) and delete_mark = '"+pagers.getDeleteMark()+"' and entity_type='"+pagers.getExpand()+"' "+pagers.getSort()+")) and (entity_code like '%"+pagers.getConditionString()+"%' or entity_chinaname like '%"+pagers.getConditionString()+"%' ) and delete_mark = '"+pagers.getDeleteMark()+"' and entity_type='"+pagers.getExpand()+"' "+pagers.getSort();									
			ResultMap pageresponse = new ResultMap();  
	        Map<String, Object> maps=new HashMap<String, Object>();
	        maps.put("sql", sql);
	        List<SysEntity> list = eMapperExpand.getAllEntity(maps); //当前页显示的数据  
	        sql = "select count(1) from sys_entity where DELETE_MARK = "+"'"+pagers.getDeleteMark()+"' and (entity_code like '%"+pagers.getConditionString()+"%' or entity_chinaname like '%"+pagers.getConditionString()+"%' ) and entity_type='"+pagers.getExpand()+"'" ;
	        maps.put("sql", sql);
	        Integer total = eMapperExpand.getTotalEntity(maps);  //数据总条数  
	        List<Object> list_obj=new ArrayList<Object>();
			for (SysEntity u : list) {
				list_obj.add(u);
			}
	        pageresponse.setRows(list_obj);  
	        pageresponse.setTotal(total);  
	        return pageresponse;
		}
	}

	@Override
	public String updateSysEntity(SysEntity sEntity) throws Exception {
		// TODO Auto-generated method stub
		
		String reCode;
		try {
			sMapper.updateByPrimaryKey(sEntity);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}

	@Override
	public String deleteSysEntity(SysEntity sEntity) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sMapper.deleteByPrimaryKey(sEntity.getEntityId());
			//删除实体表数据后,删除字段表中字段
			dropTable(sEntity);
		} catch (Exception e) {
			// TODO: handle exception
			reCode="1";
		}
		reCode = "0";
		return reCode;
	}
	
	public void dropTable(SysEntity sEntity) {
		String sql;
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			sql = "delete from sys_field where field_entity_id = "+sEntity.getEntityId();
	        map.put("sql", sql);
			eMapperExpand.operation(map);//删除字段
			//deleteTable(sEntity);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void deleteTable(SysEntity sEntity){
		Map<String, Object> map = new HashMap<String, Object>();
		String sql = "drop table "+sEntity.getEntityCode();
		map.put("sql", sql);
		eMapperExpand.operation(map);//删除表
	}
	
	public String addTableMysql(SysEntity sEntity) {
		String reCode;
		String sql;
		try {
			Map<String, Object> map = new HashMap<String, Object>();SysField sField = new SysField();
			sField.setFieldId(new BigDecimal(pImpl.getPrimaryKey("sys_field", "FIELD_ID")));
			sField.setFieldEntityId(new BigDecimal(sEntity.getEntityId()));
			sField.setFieldCode(sEntity.getEntityTablename()+"_ID");
			sField.setFieldTablename(sEntity.getEntityTablename()+"_ID");
			sField.setFieldChinaName(sEntity.getEntityChinaname()+"ID");
			sField.setFieldType("INT");
			sField.setFieldLen("20");
			sField.setFieldIsKey("Y");
			sField.setFieldIsBusKey("N");
			sField.setFieldIsLog("Y");
			sField.setFieldIsNull("N");
			sField.setFieldDataType("整型");
			sField.setFieldSort(new BigDecimal(0));
			sField.setDeleteMark("N");
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
			sField.setOperatorTime(currentDate);
			reCode=fServiceImpl.insertSysField(sField);
			sql = "CREATE TABLE "+sEntity.getEntityCode()+"("+sEntity.getEntityTablename()+"_ID INT(20) NOT NULL COMMENT '"+sEntity.getEntityChinaname()+"ID')";
	        map.put("sql", sql);
			eMapperExpand.operation(map);//建表及主键
			sql = "ALTER TABLE "+sEntity.getEntityCode()+" COMMENT='"+sEntity.getEntityChinaname()+"'";
			//往字段表中加入此主键字段信息,主键信息部分给定
			map.put("sql", sql);
			eMapperExpand.operation(map);//表注释
			sql = "ALTER TABLE "+sEntity.getEntityCode()+" ADD PRIMARY KEY("+sEntity.getEntityTablename()+"_ID)";
			map.put("sql", sql);
			eMapperExpand.operation(map);//表主键
			reCode = "0";//全部成功
		} catch (Exception e) {
			// TODO: handle exception
			reCode="3";//建表异常
		}
		return reCode;
	}
	
	public String addTableOracle(SysEntity sEntity){
		String reCode;
		String sql;
		try {
			Map<String, Object> map = new HashMap<String, Object>();SysField sField = new SysField();
			sField.setFieldId(new BigDecimal(pImpl.getPrimaryKey("sys_field", "FIELD_ID")));
			sField.setFieldEntityId(new BigDecimal(sEntity.getEntityId()));
			sField.setFieldCode(sEntity.getEntityTablename()+"_ID");
			sField.setFieldTablename(sEntity.getEntityTablename()+"_ID");
			sField.setFieldChinaName(sEntity.getEntityChinaname()+"ID");
			//MYSQL
			//sField.setFieldType("INT");
			//ORACLE
			sField.setFieldType("NUMBER");
			sField.setFieldLen("20");
			sField.setFieldIsKey("Y");
			sField.setFieldIsBusKey("N");
			sField.setFieldIsLog("Y");
			sField.setFieldIsNull("N");
			sField.setFieldDataType("整型");
			sField.setFieldSort(new BigDecimal(0));
			sField.setDeleteMark("N");
			java.sql.Date currentDate = new java.sql.Date(System.currentTimeMillis());
			sField.setOperatorTime(currentDate);
			reCode=fServiceImpl.insertSysField(sField);
			sql = "CREATE TABLE "+sEntity.getEntityCode()+" ("+sEntity.getEntityTablename()+"_ID number(20) CONSTRAINT "+sEntity.getEntityCode()+"_id_pk PRIMARY KEY)";
	        map.put("sql", sql);
			eMapperExpand.operation(map);//建表及主键
			sql = "comment on table "+sEntity.getEntityCode()+" is '"+sEntity.getEntityChinaname()+"'";
			//往字段表中加入此主键字段信息,主键信息部分给定
			map.put("sql", sql);
			eMapperExpand.operation(map);//表注释
			reCode = "0";//全部成功
		} catch (Exception e) {
			// TODO: handle exception
			reCode="3";//建表异常
		}
		return reCode;
	}
	
	@Override
	public String insertSysEntity(SysEntity sEntity) throws Exception {
		// TODO Auto-generated method stub
		String reCode;
		try {
			sMapper.insert(sEntity);
			reCode="0";
		} catch (Exception e) {
			reCode="2";//插入实体异常
		}
		return reCode;
	}

	@Override
	public ResultMap searchEntityList(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Pagers pagers=fServiceImpl.translateRequest(request, "entityType");
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("condition", "%"+pagers.getConditionString()+"%");
		map.put("deleteMark", pagers.getDeleteMark());
		String sql = "";
		if(pagers.getExpand()!=null&&!pagers.getExpand().equals("")){
			sql = "SELECT * FROM sys_entity WHERE "+
					 "(upper(ENTITY_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_TABLENAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_TYPE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_CHINANAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_SORT) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(OPERATOR_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(OPERATOR_TIME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') "+
					 "AND DELETE_MARK = '"+pagers.getDeleteMark()+"' "+
					 "AND ENTITY_TYPE = '"+pagers.getExpand()+"'";
		}else {
			sql = "SELECT * FROM sys_entity WHERE "+
					 "(upper(ENTITY_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_TABLENAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_TYPE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_CHINANAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_SORT) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(OPERATOR_NAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(OPERATOR_TIME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%') "+
					 "AND DELETE_MARK = '"+pagers.getDeleteMark()+"' ";
		}
		
		map.put("sql", sql);
		List<SysEntity> list=eMapperExpand.searchByCondition(map);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysEntity u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}

	public int isSameName(SysEntity sEntity) {
		Map<String, Object> map = new HashMap<String, Object>();
		String sql;
		int reCode=0;
		sql = "select COUNT(*) from sys_entity where entity_code = '"+sEntity.getEntityCode()+"'";
        map.put("sql", sql);
        try {
        	reCode=eMapperExpand.operation2(map);
		} catch (Exception e) {
			// TODO: handle exception
			reCode=1;
		}
		return reCode;
	}

	@Override
	public ResultMap getAllTableOracle(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		ResultMap rMap =new ResultMap();
		//oracle
		String sql ="SELECT TABLE_NAME AS entity_code, COMMENTS AS entity_chinaname FROM ( SELECT user_tables.TABLE_NAME,user_tab_comments.COMMENTS FROM user_tables, user_tab_comments WHERE user_tables.TABLE_NAME = user_tab_comments.TABLE_NAME AND user_tables.TABLE_NAME NOT IN (SELECT	entity_code AS TABLE_NAME FROM	sys_entity) ORDER BY TABLE_NAME )";
		map.put("sql", sql);
		List<SysEntity> sList= eMapperExpand.getAllEntity(map);
		//oracle
		sql="SELECT count(1) from (SELECT TABLE_NAME AS entity_code, COMMENTS AS entity_chinaname FROM ( SELECT user_tables.TABLE_NAME,user_tab_comments.COMMENTS FROM user_tables, user_tab_comments WHERE user_tables.TABLE_NAME = user_tab_comments.TABLE_NAME AND user_tables.TABLE_NAME NOT IN (SELECT	entity_code AS TABLE_NAME FROM	sys_entity) ORDER BY TABLE_NAME ))a";
		map.put("sql", sql);
		int total = eMapperExpand.getTotalTable(map);
		List<Object> list_obj=new ArrayList<Object>();
		for (SysEntity u : sList) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}

	@Override
	public ResultMap getAllTableMysql(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		ResultMap rMap =new ResultMap();
		//mysql
		Pagers pagers=fServiceImpl.translateRequest(request, "");
		String sql ="SELECT"+
					"	Name AS entity_code "+
					"FROM"+
					"	SysObjects "+
					"WHERE"+
					"	(XType = 'U' or XType = 'V') and Name like '%"+pagers.getConditionString().toUpperCase()+"%' "+
					"AND NOT exists ("+
					"	SELECT"+
					"		entity_code "+
					"	FROM"+
					"		sys_entity where SysObjects.Name=sys_entity.entity_code"+
					")"+
					"ORDER BY"+
					" Name";
		map.put("sql", sql);
		List<SysEntity> sList= eMapperExpand.getAllEntity(map);
		//mysql
		sql =		"SELECT"+
					"	count(1) "+
					"FROM"+
					"	SysObjects "+
					"WHERE"+
					"	XType = 'U' or XType = 'V' "+
					"AND NOT exists ("+
					"	SELECT"+
					"		entity_code"+
					"	FROM"+
					"		sys_entity where SysObjects.Name=sys_entity.entity_code"+
					")";
		map.put("sql", sql);
		int total = eMapperExpand.getTotalTable(map);
		List<Object> list_obj=new ArrayList<Object>();
		for (SysEntity u : sList) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}

	@Override
	public ResultMap searchTableListOracle(HttpServletRequest request)
			throws Exception {
		Pagers pagers=fServiceImpl.translateRequest(request, "");
		//oracle
		String sql ="SELECT TABLE_NAME AS entity_code, COMMENTS AS entity_chinaname FROM ( SELECT user_tables.TABLE_NAME,user_tab_comments.COMMENTS FROM user_tables, user_tab_comments WHERE user_tables.TABLE_NAME = user_tab_comments.TABLE_NAME AND user_tables.TABLE_NAME NOT IN (SELECT	entity_code AS TABLE_NAME FROM	sys_entity) ORDER BY TABLE_NAME ) where upper(TABLE_NAME) like '%"+pagers.getConditionString().toUpperCase()+"%'";
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("sql", sql);
		List<SysEntity> list=eMapperExpand.getAllEntity(map);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysEntity u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
	@Override
	public ResultMap searchTableListMysql(HttpServletRequest request)
			throws Exception {
		Pagers pagers=fServiceImpl.translateRequest(request, "");
		//mysql
		String sql ="SELECT TABLE_NAME AS entity_code,TABLE_COMMENT AS entity_chinaname FROM INFORMATION_SCHEMA. TABLES WHERE TABLE_SCHEMA = 'myehr' AND TABLE_NAME NOT IN (SELECT	entity_code AS TABLE_NAME FROM	sys_entity) and TABLE_NAME like '%"+pagers.getConditionString()+"%'";
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("sql", sql);
		List<SysEntity> list=eMapperExpand.getAllEntity(map);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysEntity u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}

	@Override
	public List<SysEntity> getEntityByEntityType(String EntityType)
			throws Exception {
		// TODO Auto-generated method stub
		String sql = "select * from sys_entity where entity_type = '"+EntityType+"'";
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("sql", sql);
		List<SysEntity> sList = eMapperExpand.searchByCondition(map);
		return sList;
	}

	@Override
	public ResultMap getAllEntityOracleByTemplate(HttpServletRequest request)
			throws Exception {
		Pagers pagers=fServiceImpl.translateRequest(request, "entityType");
		Map<String, Object> map=new HashMap<String, Object>();
		String sql = "";
		if(pagers.getExpand()!=null&&!pagers.getExpand().equals("")&&!pagers.getExpand().equals("null")){
			sql = "SELECT a1.* FROM ( select sys_entity.* , ROWNUM rn FROM sys_entity WHERE "+
					 "(upper(ENTITY_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_TABLENAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_CHINANAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 ")AND DELETE_MARK = 'N' "+
					 "AND ENTITY_TYPE = '"+pagers.getExpand()+"' and entity_id not in (select template_entity_id from sys_template_sql where template_id = 1) order by  "+ pagers.getSort() +") a1 WHERE rn >= "+ ((pagers.getPageSize()-1)*pagers.getLimit()+1);
		}else {
			sql = "SELECT a1.* FROM ( select sys_entity.* , ROWNUM rn FROM sys_entity WHERE "+
					 "(upper(ENTITY_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_TABLENAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_CHINANAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 ")AND DELETE_MARK = 'N' "+
					 "and entity_id not in (select template_entity_id from sys_template_sql where template_id = 1) order by  "+ pagers.getSort() +") a1 WHERE rn >= "+ ((pagers.getPageSize()-1)*pagers.getLimit()+1);
		}
		
		map.put("sql", sql);
		List<SysEntity> list=eMapperExpand.searchByCondition(map);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysEntity u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}

	@Override
	public ResultMap getAllEntityMsSqlByTemplate(HttpServletRequest request)
			throws Exception {
		Pagers pagers=fServiceImpl.translateRequest(request, "entityType");
		Map<String, Object> map=new HashMap<String, Object>();
		String sql = "";
		if(pagers.getExpand()!=null&&!pagers.getExpand().equals("")&&!pagers.getExpand().equals("null")){
			sql = "select sys_entity.* FROM sys_entity WHERE "+
					 "(upper(ENTITY_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_TABLENAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_CHINANAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 ")AND DELETE_MARK = 'N' "+
					 "AND ENTITY_TYPE = '"+pagers.getExpand()+"' and entity_id not in (select template_entity_id from sys_template_sql where template_id = 1) "+ pagers.getSort() +" "+ pagers.getOrder() ;
		}else {
			sql = "select sys_entity.* FROM sys_entity WHERE "+
					 "(upper(ENTITY_CODE) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_TABLENAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 "OR upper(ENTITY_CHINANAME) LIKE '%"+pagers.getConditionString().toUpperCase()+"%' "+
					 ")AND DELETE_MARK = 'N' "+
					 "and entity_id not in (select template_entity_id from sys_template_sql where template_id = 1) "+ pagers.getSort() +" "+ pagers.getOrder() ;
		}
		
		map.put("sql", sql);
		List<SysEntity> list=eMapperExpand.searchByCondition(map);
		long total=10;
		ResultMap rMap=new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysEntity u : list) {
			list_obj.add(u);
		}
		rMap.setRows(list_obj);
		rMap.setTotal(total);
		return rMap;
	}
	
}
