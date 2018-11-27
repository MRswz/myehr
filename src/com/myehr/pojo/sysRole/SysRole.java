package com.myehr.pojo.sysRole;

import java.math.BigDecimal;
import java.util.Date;

public class SysRole {
    private BigDecimal roleId;

    private String roleCode;

    private String roleName;

    private String roleDesc;

    private String roleType;

    private String roleParentCode;

    private String roleStatus;

    private Date roleTimeStart;

    private Date roleTimeEnd;

    private String roleSeq;

    private String operatorName;

    private Date operatorTime;

    private String approveName;

    private Date approveTime;

    private String deleteMark;

    private String deleteMarkBack;

    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    public String getRoleParentCode() {
        return roleParentCode;
    }

    public void setRoleParentCode(String roleParentCode) {
        this.roleParentCode = roleParentCode == null ? null : roleParentCode.trim();
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus == null ? null : roleStatus.trim();
    }

    public Date getRoleTimeStart() {
        return roleTimeStart;
    }

    public void setRoleTimeStart(Date roleTimeStart) {
        this.roleTimeStart = roleTimeStart;
    }

    public Date getRoleTimeEnd() {
        return roleTimeEnd;
    }

    public void setRoleTimeEnd(Date roleTimeEnd) {
        this.roleTimeEnd = roleTimeEnd;
    }

    public String getRoleSeq() {
        return roleSeq;
    }

    public void setRoleSeq(String roleSeq) {
        this.roleSeq = roleSeq == null ? null : roleSeq.trim();
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

    public String getApproveName() {
        return approveName;
    }

    public void setApproveName(String approveName) {
        this.approveName = approveName == null ? null : approveName.trim();
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public String getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark == null ? null : deleteMark.trim();
    }

    public String getDeleteMarkBack() {
        return deleteMarkBack;
    }

    public void setDeleteMarkBack(String deleteMarkBack) {
        this.deleteMarkBack = deleteMarkBack == null ? null : deleteMarkBack.trim();
    }
}