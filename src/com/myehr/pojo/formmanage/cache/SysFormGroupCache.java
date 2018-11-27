package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormGroupCache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormGroup pojo;
	
	private String isOpen = "Y";
	
	//组列
	private List<SysFormColumnCache> columns = new ArrayList<SysFormColumnCache>();	
	//组列
	private List<SysFormColumnCache> appColumns = new ArrayList<SysFormColumnCache>();	
	
	//保留关联表单引用对象
	private SysFormconfigCache form ; 

	public SysFormconfigCache getForm() {
		return form;
	}

	public void setForm(SysFormconfigCache form) {
		this.form = form;
	}
	
	public String getFormGroupLableWidth() {
		return pojo.getFormGroupLableWidth();
	}

	public String getFormGroupCode() {
		return pojo.getFormGroupCode();
	}

	public String getFormGroupName() {
		return pojo.getFormGroupName();
	}

	public int getFormGroupRowCount() {
		return pojo.getFormGroupRowCount().intValue();
	}

	public List<SysFormColumnCache> getAppColumns() {
		return appColumns;
	}

	public void setAppColumns(List<SysFormColumnCache> appColumns) {
		this.appColumns = appColumns;
	}

	public int getFormGroupSort() {
		return pojo.getFormGroupSort().intValue();
	}

	public long getFormGroupId() {
		return pojo.getFormGroupId().longValue();
	}

	public long getGroupFormDefId() {
		return pojo.getGroupFormDefId().longValue();
	}

	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}
	
	public List<SysFormColumnCache> getColumns() {
		return columns;
	}
	
	public String getIsOpen() {
		return isOpen;
	}

	public SysFormGroup getPojo() {
		return pojo;
	}

	public void setPojo(SysFormGroup pojo) {
		this.pojo = pojo;
	}

	/**
	 * 提供空的构造函数
	 *
	 */
	public SysFormGroupCache(){};
	
	/**
	 * 构造函数 数据库加载
	 * @param groupId
	 */
	public SysFormGroupCache(String groupId,SysFormconfigCache form){
		ISysformconfigService service =  (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		List<SysFormGroup> objs = service.querySysFormGroup(null, groupId);
		if(objs==null||objs.size()==0){
			return ;
		}
		SysFormGroup obj = objs.get(0);
		setThisByDataObject(obj);
		this.form = form;
		setColumns();
	}
	
	/**
	 * 构造函数 DataObject构造对象
	 * @param obj
	 */
	public SysFormGroupCache(SysFormGroup obj,SysFormconfigCache form){
		setThisByDataObject(obj);
		this.form = form;
		setColumns();
	}
	
	/**
	 *DataObject填充对象
	 * @param obj
	 */
	public void setThisByDataObject(SysFormGroup obj){
		this.pojo=obj;
		String formGroupIsopen = obj.getFormGroupIsopen();
		if(formGroupIsopen.isEmpty() || formGroupIsopen==null) {
			this.isOpen = "Y";
		} else {
			this.isOpen = formGroupIsopen;
		}
	}

	/**
	 * 通过group获取对应字段对象
	 * @param columns
	 */
	public void setColumns() {
		List<SysFormColumnCache> list = this.form.getColumns();
		for(SysFormColumnCache c:list){
			if((this.pojo.getFormGroupId()+"").equals(c.getFormColumnGroupId())){
				this.columns.add(c);
			}
		}
		
		List<SysFormColumnCache> appList = this.form.getColumnForApps();
		for(SysFormColumnCache c:appList){
			if((this.pojo.getFormGroupId()+"").equals(c.getFormColumnGroupId())){
				this.appColumns.add(c);
			}
		}
	}
}
