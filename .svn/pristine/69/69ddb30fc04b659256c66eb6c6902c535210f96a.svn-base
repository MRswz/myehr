package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.service.formmanage.form.IListFormService;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysTreeNodeTypeCache implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	SysTreeNodeType node;
	
	SysFormconfigCache form ;
	
	

    public SysTreeNodeType getNode() {
		return node;
	}

	public void setNode(SysTreeNodeType node) {
		this.node = node;
	}

	public SysFormconfigCache getForm() {
		return form;
	}

	public void setForm() {
		SysFormconfigCache formCache = new SysFormconfigCache();
	}

	public BigDecimal getTreeNodeTypeId() {
        return this.getNode().getTreeNodeTypeId();
    }

    public String getTreeNodeTypeCode() {
        return this.getNode().getTreeNodeTypeCode();
    }

    public String getTreeNodeTypeIcon() {
        return this.getNode().getTreeNodeTypeIcon();
    }

    public String getTreeNodeTypeTittle() {
        return this.getNode().getTreeNodeTypeTittle();
    }

    public String getTreeNodeTypeExcType() {
        return this.getNode().getTreeNodeTypeExcType();
    }

    public BigDecimal getTreeNodeTypeFormId() {
        return this.getNode().getTreeNodeTypeFormId();
    }

    public BigDecimal getFormTreeFormId() {
        return this.getNode().getFormTreeFormId();
    }

    public String getTreeNodeTypeUrl() {
        return this.getNode().getTreeNodeTypeUrl();
    }

    public String getTreeNodeTypeFormName() {
        return this.getNode().getTreeNodeTypeFormName();
    }

    public String getOperatorName() {
        return this.getNode().getOperatorName();
    }
    public Date getOperatorTime() {
        return this.getNode().getOperatorTime();
    }
    
    /**
	 * 提供空的构造函数SysFormconfigCache
	 *
	 */
	public SysTreeNodeTypeCache(){}
	
	/**
	 * 
	 * 构造函数 通过数据库加载对象
	 * @param obj
	 * @param form
	 * @throws Exception 
	 */
	public SysTreeNodeTypeCache(SysTreeNodeType node,ISysformconfigService sysformconfigService) throws Exception {
		this.node = node;
		if (node.getTreeNodeTypeExcType().equals("default")) {
			this.form = sysformconfigService.getForm(node.getTreeNodeTypeFormId()+"");
		}
	}

	public void setForm(SysFormconfigCache form) {
		this.form = form;
	}

	
}