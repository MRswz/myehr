package com.myehr.pojo.sysFlowMenu;

import java.util.Date;

public class SysFlowMenu {
    private Integer flowMenuId;

    private String flowMenuName;

    private String flowMenuDefId;

    private String operatorName;

    private Date operatorTime;

    private Float flowMenuSort;

    private String menuType;

    private String flowMenuUrl;

    private String flowOperatorName;

    private String flowMenuPtUrl;

    private String flowMenuHdUrl;

    public Integer getFlowMenuId() {
        return flowMenuId;
    }

    public void setFlowMenuId(Integer flowMenuId) {
        this.flowMenuId = flowMenuId;
    }

    public String getFlowMenuName() {
        return flowMenuName;
    }

    public void setFlowMenuName(String flowMenuName) {
        this.flowMenuName = flowMenuName == null ? null : flowMenuName.trim();
    }

    public String getFlowMenuDefId() {
        return flowMenuDefId;
    }

    public void setFlowMenuDefId(String flowMenuDefId) {
        this.flowMenuDefId = flowMenuDefId == null ? null : flowMenuDefId.trim();
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

    public Float getFlowMenuSort() {
        return flowMenuSort;
    }

    public void setFlowMenuSort(Float flowMenuSort) {
        this.flowMenuSort = flowMenuSort;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getFlowMenuUrl() {
        return flowMenuUrl;
    }

    public void setFlowMenuUrl(String flowMenuUrl) {
        this.flowMenuUrl = flowMenuUrl == null ? null : flowMenuUrl.trim();
    }

    public String getFlowOperatorName() {
        return flowOperatorName;
    }

    public void setFlowOperatorName(String flowOperatorName) {
        this.flowOperatorName = flowOperatorName == null ? null : flowOperatorName.trim();
    }

    public String getFlowMenuPtUrl() {
        return flowMenuPtUrl;
    }

    public void setFlowMenuPtUrl(String flowMenuPtUrl) {
        this.flowMenuPtUrl = flowMenuPtUrl == null ? null : flowMenuPtUrl.trim();
    }

    public String getFlowMenuHdUrl() {
        return flowMenuHdUrl;
    }

    public void setFlowMenuHdUrl(String flowMenuHdUrl) {
        this.flowMenuHdUrl = flowMenuHdUrl == null ? null : flowMenuHdUrl.trim();
    }
}