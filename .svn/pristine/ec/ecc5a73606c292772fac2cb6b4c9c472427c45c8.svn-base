package com.myehr.pojo.formmanage.formCopy;

import com.myehr.pojo.formmanage.button.SysFormButtonExportColumn;
import com.myehr.pojo.formmanage.cache.FormParamConstants;
import com.myehr.pojo.formmanage.cache.SysFormGeneralExecSql;

/**
 * 导入字段配置
 * @author Administrator
 *
 */
public class SysFormButtonExportColumnCacheCopy {
	
	private SysFormButtonExportColumn pojo;
	
	private SysFormGeneralExecSql backsql;

	/**
	 * 关联字段名称
	 */
	private String exportColumnRelColumnName;
	
	/**
	 * 关联重指向导入字段名称
	 */
	private String exportReColumnRelColumnName;
	
	public String getExportColumnBusKey() {
		return pojo.getExportColumnBusKey();
	}
	
	public long getExportColumnButtonId() {
		return pojo.getExportColumnButtonId().longValue();
	}

	public String getExportColumnDictType() {
		return pojo.getExportColumnDictType();
	}

	public long getExportcolumnId() {
		return pojo.getExportColumnId().longValue();
	}

	public long getExportColumnRelId() {
		return pojo.getExportColumnRelId().longValue();
	}

	public String getExportColumnType() {
		return pojo.getExportColumnType();
	}
	
	public String getExportColumnRelColumnName() {
		return exportColumnRelColumnName;
	}

	public void setExportColumnRelColumnName(String exportColumnRelColumnName) {
		this.exportColumnRelColumnName = exportColumnRelColumnName;
	}

	public SysFormGeneralExecSql getBacksql() {
		return backsql;
	}

	public void setBacksql(SysFormGeneralExecSql backsql) {
		this.backsql = backsql;
	}

	public long getExportReColumnRelId() {
		return pojo.getExportReColumnRelId().longValue();
	}




	/**
	 * 空构造函数
	 *
	 */
	public SysFormButtonExportColumnCacheCopy(){}

	/**
	 * 
	 * @param obj
	 * @param form
	 */
	public SysFormButtonExportColumnCacheCopy(SysFormButtonExportColumn obj,SysFormCopyCache form) {
		this.pojo = obj;
		if(form.serchColumnByColumnId(this.pojo.getExportColumnRelId().longValue())!=null){
			this.exportColumnRelColumnName = form.serchColumnByColumnId(this.pojo.getExportColumnRelId().longValue()).getJsId("name",form.getFormDefId()+"");
			if("sql".equals(this.pojo.getExportColumnType())){
				this.backsql = new SysFormGeneralExecSql(FormParamConstants.EXECSQL_EXPORT_COLUMN_TYPE,this.pojo.getExportColumnId()+"");
			}
		}
		
	}

	public String getExportReColumnRelColumnName() {
		return exportReColumnRelColumnName;
	}

	public void setExportReColumnRelColumnName(String exportReColumnRelColumnName) {
		this.exportReColumnRelColumnName = exportReColumnRelColumnName;
	}


}
