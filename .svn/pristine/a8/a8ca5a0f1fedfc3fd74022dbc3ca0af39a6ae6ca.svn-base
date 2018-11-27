package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.cache.SqlUtil;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysSqlParams;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.IButtonService;
import com.myehr.service.sysParam.ISysParamService;

public class SysFormGeneralExecSqlCacheCopy implements Serializable {
	private static Logger logger = LoggerFactory.getLogger(SysFormGeneralExecSqlCacheCopy.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysExecSql pojo;
	
	private boolean hasColumn = false;
	
	
	
	private String[] sqlList;
	private List<String[]> params = new ArrayList<String[]>();
	
	public SysExecSql getPojo(){
		return pojo;
	}
	
	
	public String getEntitySql() {
		return pojo.getEntitySql();
	}
	public String getExecSql() {
		return pojo.getExecSql();
	}
	public long getExecSqlId() {
		return pojo.getExecSqlId().longValue();
	}
	
	public long getExecSqlRelaid() {
		return pojo.getExecSqlRelaid().longValue();
	}
	
	public String getExecSqlType() {
		return pojo.getExecSqlType();
	}
	
	
	public String getAfterExecFun() {
		return pojo.getAfterExecFun();
	}
	public String getAfterExecType() {
		return pojo.getAfterExecType();
	}
	public List<String[]> getParams() {
		return params;
	}
	public void setParams(List<String[]> params) {
		this.params = params;
	}
	public String[] getSqlList() {
		return sqlList;
	}
	public void setSqlList(String[] sqlList) {
		this.sqlList = sqlList;
	}
	
	
	public boolean isHasColumn() {
		return hasColumn;
	}
	public void setHasColumn(boolean hasColumn) {
		this.hasColumn = hasColumn;
	}
	public SysFormGeneralExecSqlCacheCopy(String buttonExecSqlType, String buttonId) {
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		/*IButtonService service = (IButtonService)ApplicationContextFactory.getContext().getBean("IButtonService");*/
		SysExecSql obj  = service.queryButtonExecSqlById(buttonExecSqlType, buttonId);
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	/**
	 * 通过id初始化
	 * @param exeSqlId
	 */
	public SysFormGeneralExecSqlCacheCopy(long exeSqlId) {
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		SysExecSql obj  = service.queryButtonExecSqlById(exeSqlId);
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	public SysFormGeneralExecSqlCacheCopy(SysExecSql obj) {
		if(obj!=null){
			this.setThisByDataObject(obj);
		}
	}
	
	public void setThisByDataObject(SysExecSql obj){
		this.pojo = obj;
		if(this.getExecSql()!=null){
			sqlList = this.getExecSql().split(";");
			SqlUtil.dealTreeSolutionParam(params, this.getExecSql());
			
			for(String[] param : params){
				if("c".equals(param[0])){
					this.hasColumn = true;
					break;
				}
			}
		}
	}
	
	public String getColumnParamsNames(){
		
		return null;
	}
}
