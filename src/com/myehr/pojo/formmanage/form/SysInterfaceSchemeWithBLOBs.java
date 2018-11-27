package com.myehr.pojo.formmanage.form;

public class SysInterfaceSchemeWithBLOBs extends SysInterfaceScheme {
    private String interfaceSchemeEntitySql;

    private String interfaceSchemeDefSql;

    public String getInterfaceSchemeEntitySql() {
        return interfaceSchemeEntitySql;
    }

    public void setInterfaceSchemeEntitySql(String interfaceSchemeEntitySql) {
        this.interfaceSchemeEntitySql = interfaceSchemeEntitySql == null ? null : interfaceSchemeEntitySql.trim();
    }

    public String getInterfaceSchemeDefSql() {
        return interfaceSchemeDefSql;
    }

    public void setInterfaceSchemeDefSql(String interfaceSchemeDefSql) {
        this.interfaceSchemeDefSql = interfaceSchemeDefSql == null ? null : interfaceSchemeDefSql.trim();
    }
}