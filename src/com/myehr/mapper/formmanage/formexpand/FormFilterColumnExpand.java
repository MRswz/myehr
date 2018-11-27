package com.myehr.mapper.formmanage.formexpand;

import java.math.BigDecimal;

public class FormFilterColumnExpand {
	
	private BigDecimal queryColumnId;
	
	private String formEntityTablename;
	
	private String formFieldTablename;
	
	private String gridColumnLable;
	
	private String formColumnGuiType;
	
	private String gridColumnFilterRule;
	
	private String gridColumnWidth;
	
	private String gridColumnColSpan;
	
	private String gridColumnIsIntervais;
	
	private BigDecimal formColumnSort;
	
	private BigDecimal formColumnFormDefId;

	private BigDecimal gridColumnId;
	
	private String formColumnWidth;

	private String isshowweb;
	
	private String isshowmobile;

    public BigDecimal getQueryColumnId() {
		return queryColumnId;
	}

	public void setQueryColumnId(BigDecimal queryColumnId) {
		this.queryColumnId = queryColumnId;
	}

	public String getFormEntityTablename() {
		return formEntityTablename;
	}

	public void setFormEntityTablename(String formEntityTablename) {
		this.formEntityTablename = formEntityTablename == null ? null : formEntityTablename.trim();
	}

	public String getFormFieldTablename() {
		return formFieldTablename;
	}

	public void setFormFieldTablename(String formFieldTablename) {
		this.formFieldTablename = formFieldTablename == null ? null : formFieldTablename.trim();
	}

	public String getGridColumnLable() {
		return gridColumnLable;
	}

	public void setGridColumnLable(String gridColumnLable) {
		this.gridColumnLable = gridColumnLable == null ? null : gridColumnLable.trim();
	}

	public String getFormColumnGuiType() {
		return formColumnGuiType;
	}

	public void setFormColumnGuiType(String formColumnGuiType) {
		this.formColumnGuiType = formColumnGuiType == null ? null : formColumnGuiType.trim();
	}

	public String getGridColumnFilterRule() {
		return gridColumnFilterRule;
	}

	public void setGridColumnFilterRule(String gridColumnFilterRule) {
		this.gridColumnFilterRule = gridColumnFilterRule == null ? null : gridColumnFilterRule.trim();
	}

	public String getGridColumnWidth() {
		return gridColumnWidth;
	}

	public void setGridColumnWidth(String gridColumnWidth) {
		this.gridColumnWidth = gridColumnWidth == null ? null : gridColumnWidth.trim();
	}

	public String getGridColumnColSpan() {
		return gridColumnColSpan;
	}

	public void setGridColumnColSpan(String gridColumnColSpan) {
		this.gridColumnColSpan = gridColumnColSpan == null ? null : gridColumnColSpan.trim();
	}

	public String getGridColumnIsIntervais() {
		return gridColumnIsIntervais;
	}

	public void setGridColumnIsIntervais(String gridColumnIsIntervais) {
		this.gridColumnIsIntervais = gridColumnIsIntervais == null ? null : gridColumnIsIntervais.trim();
	}

	public BigDecimal getFormColumnSort() {
		return formColumnSort;
	}

	public void setFormColumnSort(BigDecimal formColumnSort) {
		this.formColumnSort = formColumnSort;
	}

	public BigDecimal getFormColumnFormDefId() {
		return formColumnFormDefId;
	}

	public void setFormColumnFormDefId(BigDecimal formColumnFormDefId) {
		this.formColumnFormDefId = formColumnFormDefId;
	}

	public BigDecimal getGridColumnId() {
		return gridColumnId;
	}

	public String getIsshowweb() {
		return isshowweb;
	}

	public void setIsshowweb(String isshowweb) {
		this.isshowweb = isshowweb;
	}

	public String getIsshowmobile() {
		return isshowmobile;
	}

	public void setIsshowmobile(String isshowmobile) {
		this.isshowmobile = isshowmobile;
	}

	public void setGridColumnId(BigDecimal gridColumnId) {
		this.gridColumnId = gridColumnId;
	}

	public String getFormColumnWidth() {
		return formColumnWidth;
	}

	public void setFormColumnWidth(String formColumnWidth) {
		this.formColumnWidth = formColumnWidth == null ? null : formColumnWidth.trim();
	}

	public String getFormColumnHeight() {
		return formColumnHeight;
	}

	public void setFormColumnHeight(String formColumnHeight) {
		this.formColumnHeight = formColumnHeight == null ? null : formColumnHeight.trim();
	}

	private String formColumnHeight;

}
