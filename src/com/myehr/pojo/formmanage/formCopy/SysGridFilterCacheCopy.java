package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysCardFormBeansUtil;
import com.myehr.pojo.formmanage.form.SysGridFilter;
import com.myehr.pojo.formmanage.form.SysGridFilterColumn;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.formmanage.form.ISysformconfigService;



public class SysGridFilterCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private SysGridFilter pojo;
	
	public SysGridFilter getPojo() {
		return pojo;
	}

	public void setPojo(SysGridFilter pojo) {
		this.pojo = pojo;
	}


	private List<SysGridFilterColumnCacheCopy> filterColumns = new ArrayList<SysGridFilterColumnCacheCopy>();
	

	public long getGridFilterFormDefId() {
		return pojo.getGridFilterFormDefId().longValue();
	}

	

	public String getGridFilterHeightGrade() {
		return pojo.getGridFilterHeightGrade();
	}


	public long getGridFilterId() {
		return pojo.getGridFilterId().longValue();
	}


	public int getGridFilterRowCount() {
		return  pojo.getGridFilterRowCount().intValue();
	}


	public String getOperatorName() {
		return pojo.getOperatorName();
	}

	public Date getOperatorTime() {
		return pojo.getOperatorTime();
	}

	

	public List<SysGridFilterColumnCacheCopy> getFilterColumns() {
		return filterColumns;
	}
	
	public String getGridFilterLableWidth() {
		return pojo.getGridFilterLableWidth();
	}


	public void setFilterColumns(String formId,SysFormCopyCache form) {
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		List<SysGridFilterColumn> objs = service.getFormFilterColumns(formId);
		if(objs!=null&&objs.size()>0){
			for(SysGridFilterColumn temp:objs){
				SysGridFilterColumnCacheCopy gc = new SysGridFilterColumnCacheCopy(temp,form,this);
				this.filterColumns.add(gc);
			}
		}
	}

	/*
	 * 构造函数 通过DataObject加载对象
	 */
	public SysGridFilterCacheCopy(String formId,SysFormCopyCache form){
		ISysformconfigService service = (ISysformconfigService)SpringContextUtils.getBeanById("ISysformconfigService");
		SysGridFilter obj = service.getFormFilter(formId);
		if(obj!=null){
			this.setThisByDataObject(obj);
//			加载对应查询字段列表信息
			this.setFilterColumns(formId,form);
		}
		
	}
	
	/**
	 * @param obj
	 */
	public void setThisByDataObject(SysGridFilter obj){
		this.pojo=obj;
	}
	
	 
	
}
