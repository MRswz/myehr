package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.service.formmanage.form.ISysformconfigService;

public class SysFormGroupCacheCopy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormGroup pojo;
	
	private String isOpen = "Y";
	
	//组列
	private List<SysFormColumnCacheCopy> columns = new ArrayList<SysFormColumnCacheCopy>();	
	
	
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
	
	public List<SysFormColumnCacheCopy> getColumns() {
		return columns;
	}
	
	public String getIsOpen() {
		return isOpen;
	}

	/**
	 * 提供空的构造函数
	 *
	 */
	public SysFormGroupCacheCopy(){};
	
	
	/**
	 * 通过group获取对应字段对象
	 * @param groupId 
	 * @param l 
	 * @param service 
	 * @param columns
	 * @throws Exception 
	 */
	public void setColumns(SysFormCopyCache form, String groupId, ISysformconfigService service) throws Exception {
		List<SysFormColumn> list = service.getFormColumnsByGroupId(form.getFormDefId()+"",groupId);
		for(SysFormColumn c:list){
			SysFormColumnCacheCopy column = new SysFormColumnCacheCopy(c,form);
			this.columns.add(column);
		}
	}
	
	/**
	 * 构造函数 DataObject构造对象
	 * @param obj
	 * @throws Exception 
	 */
	public SysFormGroupCacheCopy(SysFormGroup obj,SysFormCopyCache form) throws Exception{
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		setThisByDataObject(obj);
		setColumns(form,obj.getFormGroupId()+"",service);
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

}
