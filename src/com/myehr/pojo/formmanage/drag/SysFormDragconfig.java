package com.myehr.pojo.formmanage.drag;

import java.math.BigDecimal;

public class SysFormDragconfig {
    private BigDecimal dragconfigId;

    private String dragconfigCode;

    private BigDecimal dragconfigPid;

    private String dragconfigCname;

    private String deleteMark;

    public BigDecimal getDragconfigId() {
        return dragconfigId;
    }

    public void setDragconfigId(BigDecimal dragconfigId) {
        this.dragconfigId = dragconfigId;
    }

    public String getDragconfigCode() {
        return dragconfigCode;
    }

    public void setDragconfigCode(String dragconfigCode) {
        this.dragconfigCode = dragconfigCode == null ? null : dragconfigCode.trim();
    }

    public BigDecimal getDragconfigPid() {
        return dragconfigPid;
    }

    public void setDragconfigPid(BigDecimal dragconfigPid) {
        this.dragconfigPid = dragconfigPid;
    }

    public String getDragconfigCname() {
        return dragconfigCname;
    }

    public void setDragconfigCname(String dragconfigCname) {
        this.dragconfigCname = dragconfigCname == null ? null : dragconfigCname.trim();
    }

    public String getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(String deleteMark) {
        this.deleteMark = deleteMark == null ? null : deleteMark.trim();
    }
}