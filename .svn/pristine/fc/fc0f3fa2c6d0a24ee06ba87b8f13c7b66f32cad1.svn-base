package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.myehr.pojo.formmanage.cache.SqlUtil;
import com.myehr.pojo.formmanage.form.SysRuleWithBLOBs;

/**
 * 公式类
 * @author Administrator
 *
 */
public class SysRuleCacheCopy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysRuleWithBLOBs pojo;
	
	public SysRuleWithBLOBs getPojo() {
		return pojo;
	}

	public void setPojo(SysRuleWithBLOBs pojo) {
		this.pojo = pojo;
	}

	public void setSqlList(String[] sqlList) {
		this.sqlList = sqlList;
	}

	//关联方案
	private SysSolutionCacheCopy solution;
	
	//公式所涉及到的参数信息
	private List<SysSqlParamsCacheCopy> sysSqlParams = new ArrayList<SysSqlParamsCacheCopy>();
	
	
	private String[] sqlList;
	
//	公式所涉及关联计算按钮的参数
	private List<String[]> params = new ArrayList<String[]>();
	
	public List<String[]> getParams() {
		return params;
	}

	public void setParams(List<String[]> params) {
		this.params = params;
	}

	public String[] getSqlList() {
		return sqlList;
	}

	public void setSysSqlParams(List<SysSqlParamsCacheCopy> sysSqlParams) {
		this.sysSqlParams = sysSqlParams;
	}

	public List<SysSqlParamsCacheCopy> getSysSqlParams() {
		return sysSqlParams;
	}

	public void setRuleCode(List<SysSqlParamsCacheCopy> sysSqlParams) {
		this.sysSqlParams = sysSqlParams;
	}
	public String getRuleCode() {
		return pojo.getRuleCode();
	}

	public String getRuleExcSql() {
		return pojo.getRuleExeSql();//.getRuleExcSql();
	}

	public long getRuleId() {
		return pojo.getRuleId();
	}

	public String getRuleJavaSql() {
		return pojo.getRuleJavaSql();
	}

	public String getRuleName() {
		return pojo.getRuleName();
	}

	public long getRuleSolutionId() {
		return Long.parseLong(pojo.getRuleSolutionId().toString());
	}

	public long getRuleSort() {
		return  Long.parseLong(pojo.getRuleSort().toString());
	}

	public String getRuleStatus() {
		return pojo.getRuleStatus();
	}

	public SysSolutionCacheCopy getSolution() {
		return solution;
	}

	public void setSolution(SysSolutionCacheCopy solution) {
		this.solution = solution;
	}
	

	public SysRuleCacheCopy(SysRuleWithBLOBs obj,SysSolutionCacheCopy sol) {
		// TODO 自动生成构造函数存根
		this.setThisByDataObject(obj);
		this.solution=sol;
	}
	
	
	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(SysRuleWithBLOBs obj){
		this.pojo =  obj;
		
		sqlList = this.getRuleExcSql().split(";");
		SqlUtil.dealRuleSolutionParam(params, this.getRuleExcSql());
	}
}
