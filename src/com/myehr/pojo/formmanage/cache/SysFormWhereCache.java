package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.myehr.pojo.formmanage.form.SysFormWhere;



/**
 * 表单数据初始化sql条件对象
 * @author Administrator
 *
 */
public class SysFormWhereCache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormWhere pojo;
	
	//保留字段对象
	private SysFormColumnCache column;

	public SysFormColumnCache getColumn() {
		return column;
	}

	public void setColumn(SysFormColumnCache column) {
		this.column = column;
	}

	public String getFormWhereValueType() {
		return pojo.getFormWhereValueType();
	}

	public String getFormWhereColumnId() {
		return pojo.getFormWhereColumnId();
	}

	public String getFormWhereCpRule() {
		return pojo.getFormWhereCpRule();
	}

	public String getFormWhereFormDefId() {
		return pojo.getFormWhereFormDefId()+"";
	}
	
	public String getFormWhereId() {
		return pojo.getFormWhereId()+"";
	}

	public String getFormWhereJoinRule() {
		return pojo.getFormWhereJoinRule();
	}

	public String getFormWhereNullIs() {
		return pojo.getFormWhereNullIs();
	}

	public float getFormWhereSort() {
		return pojo.getFormWhereSort().floatValue();
	}

	public String getFormWhereValue() {
		return pojo.getFormWhereValue();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}
	
	public String getFormWhereLeftBracket() {
		return pojo.getFormWhereLeftBracket();
	}

	public String getFormWhereRightBracket() {
		return pojo.getFormWhereRightBracket();
	}
	
	public SysFormWhere getPojo() {
		return pojo;
	}

	public void setPojo(SysFormWhere pojo) {
		this.pojo = pojo;
	}

	/**
	 * 构造函数 通过DataObject构造
	 * @param obj
	 */
	public SysFormWhereCache(SysFormWhere obj,SysFormconfigCache form){
		this.pojo = obj;
		//把当前where条件的字段的字段对象设置到当前对象中
		List<SysFormColumnCache> list = form.getColumns();
		for(SysFormColumnCache c:list){
			if(this.pojo.getFormWhereColumnId().equals(c.getFormColumnId()+"")){
				this.column = c;
			}
		}
	}

	public SysFormWhereCache() {
	}


}
