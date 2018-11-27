package com.myehr.pojo.formmanage.template;

import java.math.BigDecimal;
import java.util.Date;

public class SysTemplate {
    private BigDecimal templateId;

    private String templateCode;

    private String templateName;

    private Date operatorTime;

    private String operatorName;

    private BigDecimal templateFolderId;

    private String templateSql;

    private String pcEditCardShow;

    private String pcGridShow;

    private String appGridShow;

    private String pcAddCardShow;

    private String appAddCardShow;

    private String appEditCardShow;

    public BigDecimal getTemplateId() {
        return templateId;
    }

    public void setTemplateId(BigDecimal templateId) {
        this.templateId = templateId;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
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

    public BigDecimal getTemplateFolderId() {
        return templateFolderId;
    }

    public void setTemplateFolderId(BigDecimal templateFolderId) {
        this.templateFolderId = templateFolderId;
    }

    public String getTemplateSql() {
        return templateSql;
    }

    public void setTemplateSql(String templateSql) {
        this.templateSql = templateSql == null ? null : templateSql.trim();
    }

    public String getPcEditCardShow() {
        return pcEditCardShow;
    }

    public void setPcEditCardShow(String pcEditCardShow) {
        this.pcEditCardShow = pcEditCardShow == null ? null : pcEditCardShow.trim();
    }

    public String getPcGridShow() {
        return pcGridShow;
    }

    public void setPcGridShow(String pcGridShow) {
        this.pcGridShow = pcGridShow == null ? null : pcGridShow.trim();
    }

    public String getAppGridShow() {
        return appGridShow;
    }

    public void setAppGridShow(String appGridShow) {
        this.appGridShow = appGridShow == null ? null : appGridShow.trim();
    }

    public String getPcAddCardShow() {
        return pcAddCardShow;
    }

    public void setPcAddCardShow(String pcAddCardShow) {
        this.pcAddCardShow = pcAddCardShow == null ? null : pcAddCardShow.trim();
    }

    public String getAppAddCardShow() {
        return appAddCardShow;
    }

    public void setAppAddCardShow(String appAddCardShow) {
        this.appAddCardShow = appAddCardShow == null ? null : appAddCardShow.trim();
    }

    public String getAppEditCardShow() {
        return appEditCardShow;
    }

    public void setAppEditCardShow(String appEditCardShow) {
        this.appEditCardShow = appEditCardShow == null ? null : appEditCardShow.trim();
    }
}