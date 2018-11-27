package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;

import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.pojo.formmanage.cache.FormParamConstants;

/**
 * 导入字段配置
 * @author Administrator
 *
 */
public class SysFormButtonImportColumnCacheCopy implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormButtonImportColumn pojo;
	
	private SysFormGeneralExecSqlCacheCopy backsql;
	
	/**
	 * 关联字段名称
	 */
	private String importColumnRelColumnName;
	
	/**
	 * 关联重指向导入字段名称
	 */
	private String importReColumnRelColumnName;
	
	public String getImportColumnBusKey() {
		return pojo.getImportColumnBusKey();
	}
	
	public String getImportColumnForbid() {
		return pojo.getImportColumnForbid();
	}

	public long getImportColumnButtonId() {
		return pojo.getImportColumnButtonId().longValue();
	}

	public String getImportColumnDictType() {
		return pojo.getImportColumnDictType();
	}

	public long getImportcolumnId() {
		return pojo.getImportColumnId().longValue();
	}

	public long getImportColumnRelId() {
		return pojo.getImportColumnRelId().longValue();
	}

	public String getImportColumnType() {
		return pojo.getImportColumnType();
	}
	
	public String getImportColumnRelColumnName() {
		return importColumnRelColumnName;
	}

	public void setImportColumnRelColumnName(String importColumnRelColumnName) {
		this.importColumnRelColumnName = importColumnRelColumnName;
	}

	public SysFormGeneralExecSqlCacheCopy getBacksql() {
		return backsql;
	}

	public void setBacksql(SysFormGeneralExecSqlCacheCopy backsql) {
		this.backsql = backsql;
	}

	public long getImportReColumnRelId() {
		if(pojo.getImportReColumnRelId()!=null){
			return pojo.getImportReColumnRelId().longValue();
		}else {
			return 0;
		}
		
	}

	/**
	 * 空构造函数
	 *
	 */
	public SysFormButtonImportColumnCacheCopy(){}

	/**
	 * 
	 * @param obj
	 * @param form
	 */
	public SysFormButtonImportColumnCacheCopy(SysFormButtonImportColumn obj,SysFormCopyCache form) {
		this.pojo = obj;
		System.out.println(form.serchColumnByColumnId(this.getImportColumnRelId()));
		if (form.serchColumnByColumnId(this.getImportColumnRelId())!=null) {
			this.importColumnRelColumnName = form.serchColumnByColumnId(this.getImportColumnRelId()).getJsId("name",form.getFormDefId()+"");
		}
		if(this.getImportReColumnRelId()>0){
			if (form.serchColumnByColumnId(this.getImportColumnRelId())!=null) {
				this.importReColumnRelColumnName = form.serchColumnByColumnId(this.getImportReColumnRelId()).getJsId("name",form.getFormDefId()+"");
			}
			
		}
		if("sql".equals(this.getImportColumnType())){
			this.backsql = new SysFormGeneralExecSqlCacheCopy(FormParamConstants.EXECSQL_IMPORT_COLUMN_TYPE,this.getImportcolumnId()+"");
		}
	}

	public String getImportReColumnRelColumnName() {
		return importReColumnRelColumnName;
	}

	public void setImportReColumnRelColumnName(String importReColumnRelColumnName) {
		this.importReColumnRelColumnName = importReColumnRelColumnName;
	}

	public String getImportColumnUnique() {
		return pojo.getImportColumnUnique();
	}

}
