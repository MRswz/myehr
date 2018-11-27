package com.myehr.pojo.formmanage.gui;

import java.math.BigDecimal;
import java.util.Date;

public class SysCardTemplate {
    private Integer id;

    private String templateTitle;

    private String templateAddress;

    private String templatePhoto;

    private String templateName;

    private String templateContent1;

    private String templateContent2;

    private String templateContent3;

    private String templateContent4;

    private String templateContent5;

    private String templateContent6;

    private String templateContent7;

    private BigDecimal smallNum;

    private BigDecimal middleNum;

    private BigDecimal largeNum;

    private String operatorName;

    private Date operatorTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemplateTitle() {
        return templateTitle;
    }

    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle == null ? null : templateTitle.trim();
    }

    public String getTemplateAddress() {
        return templateAddress;
    }

    public void setTemplateAddress(String templateAddress) {
        this.templateAddress = templateAddress == null ? null : templateAddress.trim();
    }

    public String getTemplatePhoto() {
        return templatePhoto;
    }

    public void setTemplatePhoto(String templatePhoto) {
        this.templatePhoto = templatePhoto == null ? null : templatePhoto.trim();
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String getTemplateContent1() {
        return templateContent1;
    }

    public void setTemplateContent1(String templateContent1) {
        this.templateContent1 = templateContent1 == null ? null : templateContent1.trim();
    }

    public String getTemplateContent2() {
        return templateContent2;
    }

    public void setTemplateContent2(String templateContent2) {
        this.templateContent2 = templateContent2 == null ? null : templateContent2.trim();
    }

    public String getTemplateContent3() {
        return templateContent3;
    }

    public void setTemplateContent3(String templateContent3) {
        this.templateContent3 = templateContent3 == null ? null : templateContent3.trim();
    }

    public String getTemplateContent4() {
        return templateContent4;
    }

    public void setTemplateContent4(String templateContent4) {
        this.templateContent4 = templateContent4 == null ? null : templateContent4.trim();
    }

    public String getTemplateContent5() {
        return templateContent5;
    }

    public void setTemplateContent5(String templateContent5) {
        this.templateContent5 = templateContent5 == null ? null : templateContent5.trim();
    }

    public String getTemplateContent6() {
        return templateContent6;
    }

    public void setTemplateContent6(String templateContent6) {
        this.templateContent6 = templateContent6 == null ? null : templateContent6.trim();
    }

    public String getTemplateContent7() {
        return templateContent7;
    }

    public void setTemplateContent7(String templateContent7) {
        this.templateContent7 = templateContent7 == null ? null : templateContent7.trim();
    }

    public BigDecimal getSmallNum() {
        return smallNum;
    }

    public void setSmallNum(BigDecimal smallNum) {
        this.smallNum = smallNum;
    }

    public BigDecimal getMiddleNum() {
        return middleNum;
    }

    public void setMiddleNum(BigDecimal middleNum) {
        this.middleNum = middleNum;
    }

    public BigDecimal getLargeNum() {
        return largeNum;
    }

    public void setLargeNum(BigDecimal largeNum) {
        this.largeNum = largeNum;
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