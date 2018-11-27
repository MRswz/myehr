package com.myehr.pojo.sysRole;

public class SysUserOrg {
    private Integer userOrgId;

    private Integer userId;

    private Integer orgId;

    private String includeSubordinate;

    public Integer getUserOrgId() {
        return userOrgId;
    }

    public void setUserOrgId(Integer userOrgId) {
        this.userOrgId = userOrgId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getIncludeSubordinate() {
        return includeSubordinate;
    }

    public void setIncludeSubordinate(String includeSubordinate) {
        this.includeSubordinate = includeSubordinate == null ? null : includeSubordinate.trim();
    }
}