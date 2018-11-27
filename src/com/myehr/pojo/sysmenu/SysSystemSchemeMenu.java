package com.myehr.pojo.sysmenu;

import java.math.BigDecimal;
import java.util.Date;

public class SysSystemSchemeMenu {
    private BigDecimal schemeMenuId;

    private BigDecimal sysSystemSchemeId;

    private String menuCode;

    private String menuName;

    private String menuDesc;

    private String menuType;

    private String menuParentCode;

    private Long menuSort;

    private String menuSeq;

    private String menuIconCode;

    private String operatorName;

    private BigDecimal sysMenuId;

    private Date operatorTime;

    private String approveName;

    private Date approveTime;

    private String deleteMark;

    private String deleteMarkBack;

    private String menuUrl;

    private String menuDictCode;

    private String menuIsDynamicForm;

    private String menuFormId;

    public BigDecimal getSchemeMenuId() {
        return schemeMenuId;
    }

    public void setSchemeMenuId(BigDecimal schemeMenuId) {
        this.schemeMenuId = schemeMenuId;
    }

    public BigDecimal getSysSystemSchemeId() {
        return sysSystemSchemeId;
    }

    public void setSysSystemSchemeId(BigDecimal sysSystemSchemeId) {
        this.sysSystemSchemeId = sysSystemSchemeId;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc == null ? null : menuDesc.trim();
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getMenuParentCode() {
        return menuParentCode;
    }

    public void setMenuParentCode(String menuParentCode) {
        this.menuParentCode = menuParentCode == null ? null : menuParentCode.trim();
    }

    public Long getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Long menuSort) {
        this.menuSort = menuSort;
    }

    public String getMenuSeq() {
        return menuSeq;
    }

    public void setMenuSeq(String menuSeq) {
        this.menuSeq = menuSeq == null ? null : menuSeq.trim();
    }

    public String getMenuIconCode() {
        return menuIconCode;
    }

    public void setMenuIconCode(String menuIconCode) {
        this.menuIconCode = menuIconCode == null ? null : menuIconCode.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public BigDecimal getSysMenuId() {
        return sysMenuId;
    }

    public void setSysMenuId(BigDecimal sysMenuId) {
        this.sysMenuId = sysMenuId;
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

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    public String getMenuDictCode() {
        return menuDictCode;
    }

    public void setMenuDictCode(String menuDictCode) {
        this.menuDictCode = menuDictCode == null ? null : menuDictCode.trim();
    }

    public String getMenuIsDynamicForm() {
        return menuIsDynamicForm;
    }

    public void setMenuIsDynamicForm(String menuIsDynamicForm) {
        this.menuIsDynamicForm = menuIsDynamicForm == null ? null : menuIsDynamicForm.trim();
    }

    public String getMenuFormId() {
        return menuFormId;
    }

    public void setMenuFormId(String menuFormId) {
        this.menuFormId = menuFormId == null ? null : menuFormId.trim();
    }
}