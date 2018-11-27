package com.myehr.pojo.sysParam;

public class SysSource {
    private Long sysSourceId;

    private String sysSourceCode;

    private String sysSourceName;

    private String sysSoruceDriver;

    private String sysSoruceDriverValue;

    private String sysSoruceUrl;

    private String sysSoruceUrlValue;

    private String sysSoruceUsername;

    private String sysSoruceUsernameValue;

    private String sysSorucePassword;

    private String sysSorucePasswordValue;

    private String sysSourceType;

    public Long getSysSourceId() {
        return sysSourceId;
    }

    public void setSysSourceId(Long sysSourceId) {
        this.sysSourceId = sysSourceId;
    }

    public String getSysSourceCode() {
        return sysSourceCode;
    }

    public void setSysSourceCode(String sysSourceCode) {
        this.sysSourceCode = sysSourceCode == null ? null : sysSourceCode.trim();
    }

    public String getSysSourceName() {
        return sysSourceName;
    }

    public void setSysSourceName(String sysSourceName) {
        this.sysSourceName = sysSourceName == null ? null : sysSourceName.trim();
    }

    public String getSysSoruceDriver() {
        return sysSoruceDriver;
    }

    public void setSysSoruceDriver(String sysSoruceDriver) {
        this.sysSoruceDriver = sysSoruceDriver == null ? null : sysSoruceDriver.trim();
    }

    public String getSysSoruceDriverValue() {
        return sysSoruceDriverValue;
    }

    public void setSysSoruceDriverValue(String sysSoruceDriverValue) {
        this.sysSoruceDriverValue = sysSoruceDriverValue == null ? null : sysSoruceDriverValue.trim();
    }

    public String getSysSoruceUrl() {
        return sysSoruceUrl;
    }

    public void setSysSoruceUrl(String sysSoruceUrl) {
        this.sysSoruceUrl = sysSoruceUrl == null ? null : sysSoruceUrl.trim();
    }

    public String getSysSoruceUrlValue() {
        return sysSoruceUrlValue;
    }

    public void setSysSoruceUrlValue(String sysSoruceUrlValue) {
        this.sysSoruceUrlValue = sysSoruceUrlValue == null ? null : sysSoruceUrlValue.trim();
    }

    public String getSysSoruceUsername() {
        return sysSoruceUsername;
    }

    public void setSysSoruceUsername(String sysSoruceUsername) {
        this.sysSoruceUsername = sysSoruceUsername == null ? null : sysSoruceUsername.trim();
    }

    public String getSysSoruceUsernameValue() {
        return sysSoruceUsernameValue;
    }

    public void setSysSoruceUsernameValue(String sysSoruceUsernameValue) {
        this.sysSoruceUsernameValue = sysSoruceUsernameValue == null ? null : sysSoruceUsernameValue.trim();
    }

    public String getSysSorucePassword() {
        return sysSorucePassword;
    }

    public void setSysSorucePassword(String sysSorucePassword) {
        this.sysSorucePassword = sysSorucePassword == null ? null : sysSorucePassword.trim();
    }

    public String getSysSorucePasswordValue() {
        return sysSorucePasswordValue;
    }

    public void setSysSorucePasswordValue(String sysSorucePasswordValue) {
        this.sysSorucePasswordValue = sysSorucePasswordValue == null ? null : sysSorucePasswordValue.trim();
    }

    public String getSysSourceType() {
        return sysSourceType;
    }

    public void setSysSourceType(String sysSourceType) {
        this.sysSourceType = sysSourceType == null ? null : sysSourceType.trim();
    }
}