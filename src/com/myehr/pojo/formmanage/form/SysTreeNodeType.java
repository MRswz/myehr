package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.service.formmanage.form.IListFormService;

public class SysTreeNodeType implements Serializable{
	
	private static final long serialVersionUID = 1L;
    private BigDecimal treeNodeTypeId;

    private String treeNodeTypeCode;

    private String treeNodeTypeIcon;

    private String treeNodeTypeTittle;

    private String treeNodeTypeExcType;

    private BigDecimal treeNodeTypeFormId;

    private BigDecimal formTreeFormId;

    private String treeNodeTypeUrl;

    private String treeNodeTypeFormName;

    private String operatorName;

    private Date operatorTime;

    public BigDecimal getTreeNodeTypeId() {
        return treeNodeTypeId;
    }

    public void setTreeNodeTypeId(BigDecimal treeNodeTypeId) {
        this.treeNodeTypeId = treeNodeTypeId;
    }

    public String getTreeNodeTypeCode() {
        return treeNodeTypeCode;
    }

    public void setTreeNodeTypeCode(String treeNodeTypeCode) {
        this.treeNodeTypeCode = treeNodeTypeCode == null ? null : treeNodeTypeCode.trim();
    }

    public String getTreeNodeTypeIcon() {
        return treeNodeTypeIcon;
    }

    public void setTreeNodeTypeIcon(String treeNodeTypeIcon) {
        this.treeNodeTypeIcon = treeNodeTypeIcon == null ? null : treeNodeTypeIcon.trim();
    }

    public String getTreeNodeTypeTittle() {
        return treeNodeTypeTittle;
    }

    public void setTreeNodeTypeTittle(String treeNodeTypeTittle) {
        this.treeNodeTypeTittle = treeNodeTypeTittle == null ? null : treeNodeTypeTittle.trim();
    }

    public String getTreeNodeTypeExcType() {
        return treeNodeTypeExcType;
    }

    public void setTreeNodeTypeExcType(String treeNodeTypeExcType) {
        this.treeNodeTypeExcType = treeNodeTypeExcType == null ? null : treeNodeTypeExcType.trim();
    }

    public BigDecimal getTreeNodeTypeFormId() {
        return treeNodeTypeFormId;
    }

    public void setTreeNodeTypeFormId(BigDecimal treeNodeTypeFormId) {
        this.treeNodeTypeFormId = treeNodeTypeFormId;
    }

    public BigDecimal getFormTreeFormId() {
        return formTreeFormId;
    }

    public void setFormTreeFormId(BigDecimal formTreeFormId) {
        this.formTreeFormId = formTreeFormId;
    }

    public String getTreeNodeTypeUrl() {
        return treeNodeTypeUrl;
    }

    public void setTreeNodeTypeUrl(String treeNodeTypeUrl) {
        this.treeNodeTypeUrl = treeNodeTypeUrl == null ? null : treeNodeTypeUrl.trim();
    }

    public String getTreeNodeTypeFormName() {
        return treeNodeTypeFormName;
    }

    public void setTreeNodeTypeFormName(String treeNodeTypeFormName) {
        this.treeNodeTypeFormName = treeNodeTypeFormName == null ? null : treeNodeTypeFormName.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}