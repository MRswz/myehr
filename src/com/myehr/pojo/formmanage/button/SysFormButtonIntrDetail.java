package com.myehr.pojo.formmanage.button;

import java.io.Serializable;
import java.math.BigDecimal;

public class SysFormButtonIntrDetail implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal intrDetailId;

    private BigDecimal formColumnId;

    private String targetColumnId;

    private BigDecimal introduceId;

    private String targetColumnType;

    public BigDecimal getIntrDetailId() {
        return intrDetailId;
    }

    public void setIntrDetailId(BigDecimal intrDetailId) {
        this.intrDetailId = intrDetailId;
    }

    public BigDecimal getFormColumnId() {
        return formColumnId;
    }

    public void setFormColumnId(BigDecimal formColumnId) {
        this.formColumnId = formColumnId;
    }

    public String getTargetColumnId() {
        return targetColumnId;
    }

    public void setTargetColumnId(String targetColumnId) {
        this.targetColumnId = targetColumnId == null ? null : targetColumnId.trim();
    }

    public BigDecimal getIntroduceId() {
        return introduceId;
    }

    public void setIntroduceId(BigDecimal introduceId) {
        this.introduceId = introduceId;
    }

    public String getTargetColumnType() {
        return targetColumnType;
    }

    public void setTargetColumnType(String targetColumnType) {
        this.targetColumnType = targetColumnType == null ? null : targetColumnType.trim();
    }
}