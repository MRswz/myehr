package com.myehr.pojo.sysmenu;

import java.math.BigDecimal;

public class SysSystemSchemeRole {
    private BigDecimal schemeId;

    private String roleId;

    public BigDecimal getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(BigDecimal schemeId) {
        this.schemeId = schemeId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}