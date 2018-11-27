package com.myehr.pojo;

import java.util.Date;

public class SysDictEntry {
    private Integer dictEntryId;

    private String dictEntryCode;

    private String dictEntryName;

    private Integer dictTypeId;

    private String dictEntryRemark;

    private String dictParentCode;

    private Float dictEntrySort;

    private String dictEntrySeq;

    private String operatorName;

    private Date operatorTime;

    private String approveName;

    private Date approveTime;

    private String deleteMark;

    private String deleteMarkBack;

    public Integer getDictEntryId() {
        return dictEntryId;
    }

    public void setDictEntryId(Integer dictEntryId) {
        this.dictEntryId = dictEntryId;
    }

    public String getDictEntryCode() {
        return dictEntryCode;
    }

    public void setDictEntryCode(String dictEntryCode) {
        this.dictEntryCode = dictEntryCode == null ? null : dictEntryCode.trim();
    }

    public String getDictEntryName() {
        return dictEntryName;
    }

    public void setDictEntryName(String dictEntryName) {
        this.dictEntryName = dictEntryName == null ? null : dictEntryName.trim();
    }

    public Integer getDictTypeId() {
        return dictTypeId;
    }

    public void setDictTypeId(Integer dictTypeId) {
        this.dictTypeId = dictTypeId;
    }

    public String getDictEntryRemark() {
        return dictEntryRemark;
    }

    public void setDictEntryRemark(String dictEntryRemark) {
        this.dictEntryRemark = dictEntryRemark == null ? null : dictEntryRemark.trim();
    }

    public String getDictParentCode() {
        return dictParentCode;
    }

    public void setDictParentCode(String dictParentCode) {
        this.dictParentCode = dictParentCode == null ? null : dictParentCode.trim();
    }

    public Float getDictEntrySort() {
        return dictEntrySort;
    }

    public void setDictEntrySort(Float dictEntrySort) {
        this.dictEntrySort = dictEntrySort;
    }

    public String getDictEntrySeq() {
        return dictEntrySeq;
    }

    public void setDictEntrySeq(String dictEntrySeq) {
        this.dictEntrySeq = dictEntrySeq == null ? null : dictEntrySeq.trim();
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