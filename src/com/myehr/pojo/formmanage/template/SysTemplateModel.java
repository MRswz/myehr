package com.myehr.pojo.formmanage.template;

import java.math.BigDecimal;
import java.util.Date;

public class SysTemplateModel {
    private BigDecimal id;

    private String templateCode;

    private String templateType;

    private String templateRank;

    private String templateTimes;

    private String templatePhoto;

    private String templateRemark;

    private String editName;

    private Date editTime;

    private String createName;

    private Date createTime;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    public String getTemplateRank() {
        return templateRank;
    }

    public void setTemplateRank(String templateRank) {
        this.templateRank = templateRank == null ? null : templateRank.trim();
    }

    public String getTemplateTimes() {
        return templateTimes;
    }

    public void setTemplateTimes(String templateTimes) {
        this.templateTimes = templateTimes == null ? null : templateTimes.trim();
    }

    public String getTemplatePhoto() {
        return templatePhoto;
    }

    public void setTemplatePhoto(String templatePhoto) {
        this.templatePhoto = templatePhoto == null ? null : templatePhoto.trim();
    }

    public String getTemplateRemark() {
        return templateRemark;
    }

    public void setTemplateRemark(String templateRemark) {
        this.templateRemark = templateRemark == null ? null : templateRemark.trim();
    }

    public String getEditName() {
        return editName;
    }

    public void setEditName(String editName) {
        this.editName = editName == null ? null : editName.trim();
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}