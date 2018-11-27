package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.myehr.pojo.formmanage.form.SysGridFilterColumn;
import com.myehr.pojo.sysParam.SysRequestParam;


public class SysGridFilterColumnCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SysGridFilterColumn getPojo() {
		return pojo;
	}

	public void setPojo(SysGridFilterColumn pojo) {
		this.pojo = pojo;
	}

	private SysGridFilterColumn pojo ;
	
	private long queryColumnId;
	
	private long gridColumnFilterId;
	
	private String gridColumnLable	;
	
	private long gridColumnId;
	
	private String gridColumnFilterRule;
	
	private int gridColumnSort;
	
	private int gridColumnColSpan;
	
	private String gridColumnIsIntervais; 
	
	private SysGridFilterCacheCopy gridFilter ;
	
	private String gridColumnWidth;
	
	
	private Date operatorTime;
	
	private String operatorName;

	public int getGridColumnColSpan() {
		return gridColumnColSpan;
	}

	public void setGridColumnColSpan(int gridColumnColSpan) {
		this.gridColumnColSpan = gridColumnColSpan;
	}

	public long getGridColumnFilterId() {
		return gridColumnFilterId;
	}

	public void setGridColumnFilterId(long gridColumnFilterId) {
		this.gridColumnFilterId = gridColumnFilterId;
	}

	public String getGridColumnFilterRule() {
		return gridColumnFilterRule;
	}

	public void setGridColumnFilterRule(String gridColumnFilterRule) {
		this.gridColumnFilterRule = gridColumnFilterRule;
	}

	public long getGridColumnId() {
		return gridColumnId;
	}

	public void setGridColumnId(long gridColumnId) {
		this.gridColumnId = gridColumnId;
	}

	public String getGridColumnIsIntervais() {
		return gridColumnIsIntervais;
	}

	public void setGridColumnIsIntervais(String gridColumnIsIntervais) {
		this.gridColumnIsIntervais = gridColumnIsIntervais;
	}

	public String getGridColumnLable() {
		return gridColumnLable;
	}

	public void setGridColumnLable(String gridColumnLable) {
		this.gridColumnLable = gridColumnLable;
	}

	public int getGridColumnSort() {
		return gridColumnSort;
	}

	public void setGridColumnSort(int gridColumnSort) {
		this.gridColumnSort = gridColumnSort;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Date getOperatorTime() {
		return operatorTime;
	}

	public void setOperatorTime(Date operatorTime) {
		this.operatorTime = operatorTime;
	}

	public long getQueryColumnId() {
		return queryColumnId;
	}

	public void setQueryColumnId(long queryColumnId) {
		this.queryColumnId = queryColumnId;
	}
	
	public SysGridFilterCacheCopy getGridFilter() {
		return gridFilter;
	}

	public void setGridFilter(SysGridFilterCacheCopy gridFilter) {
		this.gridFilter = gridFilter;
	}
	
	public String getGridColumnWidth() {
		return gridColumnWidth;
	}

	public void setGridColumnWidth(String gridColumnWidth) {
		this.gridColumnWidth = gridColumnWidth;
	}


	
	public  SysGridFilterColumnCacheCopy(SysGridFilterColumn obj,SysFormCopyCache form,SysGridFilterCacheCopy gridFilter) {
		// TODO 自动生成构造函数存根
		this.setThisByDataObject(obj);
		this.gridFilter = gridFilter;
	}
	
	

	/**
	 * @param obj
	 */
	public void setThisByDataObject(SysGridFilterColumn obj){
		this.pojo=obj;
	}
}
