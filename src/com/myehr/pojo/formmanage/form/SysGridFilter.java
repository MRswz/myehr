package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysGridFilter implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal gridFilterId;

    private BigDecimal gridFilterFormDefId;

    private BigDecimal gridFilterRowCount;

    private String gridFilterHeightGrade;

    private BigDecimal gridFilterGropu;

    private String gridFilterBtnLayout;

    private String gridFilterLableWidth;

    private Date operatorTime;

    private String operatorName;

    public BigDecimal getGridFilterId() {
        return gridFilterId;
    }

    public void setGridFilterId(BigDecimal gridFilterId) {
        this.gridFilterId = gridFilterId;
    }

    public BigDecimal getGridFilterFormDefId() {
        return gridFilterFormDefId;
    }

    public void setGridFilterFormDefId(BigDecimal gridFilterFormDefId) {
        this.gridFilterFormDefId = gridFilterFormDefId;
    }

    public BigDecimal getGridFilterRowCount() {
        return gridFilterRowCount;
    }

    public void setGridFilterRowCount(BigDecimal gridFilterRowCount) {
        this.gridFilterRowCount = gridFilterRowCount;
    }

    public String getGridFilterHeightGrade() {
        return gridFilterHeightGrade;
    }

    public void setGridFilterHeightGrade(String gridFilterHeightGrade) {
        this.gridFilterHeightGrade = gridFilterHeightGrade == null ? null : gridFilterHeightGrade.trim();
    }

    public BigDecimal getGridFilterGropu() {
        return gridFilterGropu;
    }

    public void setGridFilterGropu(BigDecimal gridFilterGropu) {
        this.gridFilterGropu = gridFilterGropu;
    }

    public String getGridFilterBtnLayout() {
        return gridFilterBtnLayout;
    }

    public void setGridFilterBtnLayout(String gridFilterBtnLayout) {
        this.gridFilterBtnLayout = gridFilterBtnLayout == null ? null : gridFilterBtnLayout.trim();
    }

    public String getGridFilterLableWidth() {
        return gridFilterLableWidth;
    }

    public void setGridFilterLableWidth(String gridFilterLableWidth) {
        this.gridFilterLableWidth = gridFilterLableWidth == null ? null : gridFilterLableWidth.trim();
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }
}