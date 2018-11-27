package com.myehr.pojo.sysmenu;

import java.math.BigDecimal;

public class SysSystemScheme {
    private BigDecimal schemeId;

    private String schemeName;

    private String schemeCode;

    private String schemeDefType;

    private String systemTitle;

    private String systemLog;

    private String deviceType;

    private BigDecimal schemeLevel;

    private String status;

    private String deskType;

    private String schemeSource;

    private String compId;

    private String menuNavigate;

    public BigDecimal getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(BigDecimal schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName == null ? null : schemeName.trim();
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode == null ? null : schemeCode.trim();
    }

    public String getSchemeDefType() {
        return schemeDefType;
    }

    public void setSchemeDefType(String schemeDefType) {
        this.schemeDefType = schemeDefType == null ? null : schemeDefType.trim();
    }

    public String getSystemTitle() {
        return systemTitle;
    }

    public void setSystemTitle(String systemTitle) {
        this.systemTitle = systemTitle == null ? null : systemTitle.trim();
    }

    public String getSystemLog() {
        return systemLog;
    }

    public void setSystemLog(String systemLog) {
        this.systemLog = systemLog == null ? null : systemLog.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public BigDecimal getSchemeLevel() {
        return schemeLevel;
    }

    public void setSchemeLevel(BigDecimal schemeLevel) {
        this.schemeLevel = schemeLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDeskType() {
        return deskType;
    }

    public void setDeskType(String deskType) {
        this.deskType = deskType == null ? null : deskType.trim();
    }

    public String getSchemeSource() {
        return schemeSource;
    }

    public void setSchemeSource(String schemeSource) {
        this.schemeSource = schemeSource == null ? null : schemeSource.trim();
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId == null ? null : compId.trim();
    }

    public String getMenuNavigate() {
        return menuNavigate;
    }

    public void setMenuNavigate(String menuNavigate) {
        this.menuNavigate = menuNavigate == null ? null : menuNavigate.trim();
    }
}