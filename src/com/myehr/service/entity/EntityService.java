package com.myehr.service.entity;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.ResultMap;
import com.myehr.pojo.entity.SysEntity;

public interface EntityService {
	
	public ResultMap getAllEntityMysql (HttpServletRequest request) throws Exception;
	
	public ResultMap getAllEntityOracle (HttpServletRequest request) throws Exception;
	
	public String updateSysEntity(SysEntity sEntity) throws Exception;
	
	public String deleteSysEntity(SysEntity sEntity) throws Exception;
	
	public String insertSysEntity(SysEntity sEntity) throws Exception;
	
	public ResultMap searchEntityList(HttpServletRequest request) throws Exception;
	
	public ResultMap searchTableListOracle(HttpServletRequest request) throws Exception;
	
	public ResultMap searchTableListMysql(HttpServletRequest request) throws Exception;
	
	public ResultMap getAllTableOracle(HttpServletRequest request) throws Exception;
	
	public ResultMap getAllTableMysql(HttpServletRequest request) throws Exception;
	
	public ResultMap getAllEntityOracleByTemplate(HttpServletRequest request) throws Exception;
	
	public ResultMap getAllEntityMsSqlByTemplate(HttpServletRequest request) throws Exception;
	
	public List<SysEntity> getEntityByEntityType (String EntityType) throws Exception;

	public String addTableOracle(SysEntity sEntity);
	
}
