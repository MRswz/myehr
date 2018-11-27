package com.myehr.pojo.activiti;

public class SysActTitle {
    private Long id;

    private String title;

    private Long businessid;

    private String modelKey;

    private String expandColumn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Long businessid) {
        this.businessid = businessid;
    }

    public String getModelKey() {
        return modelKey;
    }

    public void setModelKey(String modelKey) {
        this.modelKey = modelKey == null ? null : modelKey.trim();
    }

    public String getExpandColumn() {
        return expandColumn;
    }

    public void setExpandColumn(String expandColumn) {
        this.expandColumn = expandColumn == null ? null : expandColumn.trim();
    }
}