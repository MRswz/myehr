package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.myehr.pojo.formmanage.form.SysRuleWithBLOBs;

/**
 * 公式类
 * @author Administrator
 *
 */
public class SysRuleCache implements Serializable {
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
	private SysSolutionCache solution;
	
	//公式所涉及到的参数信息
	private List<SysSqlParamsCache> sysSqlParams = new ArrayList<SysSqlParamsCache>();
	
	
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

	public void setSysSqlParams(List<SysSqlParamsCache> sysSqlParams) {
		this.sysSqlParams = sysSqlParams;
	}

	public List<SysSqlParamsCache> getSysSqlParams() {
		return sysSqlParams;
	}

	public void setRuleCode(List<SysSqlParamsCache> sysSqlParams) {
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

	public SysSolutionCache getSolution() {
		return solution;
	}

	public void setSolution(SysSolutionCache solution) {
		this.solution = solution;
	}
	

	public SysRuleCache(SysRuleWithBLOBs obj,SysSolutionCache sol) {
		// TODO 自动生成构造函数存根
		this.setThisByDataObject(obj);
		this.solution=sol;
		//解析sql中断的公式
		initParams();
	}
	
	/**
	 * 初始化公式对应sql参数信息
	 *
	 */
	public void initParams(){
		String excSql = this.getRuleExcSql();
		this.sysSqlParams = SqlUtil.getSysSqlParamsBySql(excSql,this);
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
