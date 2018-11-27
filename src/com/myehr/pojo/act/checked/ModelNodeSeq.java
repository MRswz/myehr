package com.myehr.pojo.act.checked;

public class ModelNodeSeq {
    private Long modelNodeSeqId;

    private String modelNode;

    private String modelPreNode;

    private String modelProDef;

    private String modelName;

    private String modelPreName;

    public Long getModelNodeSeqId() {
        return modelNodeSeqId;
    }

    public void setModelNodeSeqId(Long modelNodeSeqId) {
        this.modelNodeSeqId = modelNodeSeqId;
    }

    public String getModelNode() {
        return modelNode;
    }

    public void setModelNode(String modelNode) {
        this.modelNode = modelNode == null ? null : modelNode.trim();
    }

    public String getModelPreNode() {
        return modelPreNode;
    }

    public void setModelPreNode(String modelPreNode) {
        this.modelPreNode = modelPreNode == null ? null : modelPreNode.trim();
    }

    public String getModelProDef() {
        return modelProDef;
    }

    public void setModelProDef(String modelProDef) {
        this.modelProDef = modelProDef == null ? null : modelProDef.trim();
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getModelPreName() {
        return modelPreName;
    }

    public void setModelPreName(String modelPreName) {
        this.modelPreName = modelPreName == null ? null : modelPreName.trim();
    }
}