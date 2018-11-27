package com.myehr.pojo.app.grid;

import java.io.Serializable;
import java.math.BigDecimal;

public class SysAppClass implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private BigDecimal id;

    private String fontStyle;

    private String tagStyle;

    private String isblod;

    private String ishidden;

    private BigDecimal formColumnId;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle == null ? null : fontStyle.trim();
    }

    public String getTagStyle() {
        return tagStyle;
    }

    public void setTagStyle(String tagStyle) {
        this.tagStyle = tagStyle == null ? null : tagStyle.trim();
    }

    public String getIsblod() {
        return isblod;
    }

    public void setIsblod(String isblod) {
        this.isblod = isblod == null ? null : isblod.trim();
    }

    public String getIshidden() {
        return ishidden;
    }

    public void setIshidden(String ishidden) {
        this.ishidden = ishidden == null ? null : ishidden.trim();
    }

    public BigDecimal getFormColumnId() {
        return formColumnId;
    }

    public void setFormColumnId(BigDecimal formColumnId) {
        this.formColumnId = formColumnId;
    }
}