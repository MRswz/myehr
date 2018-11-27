package com.myehr.pojo.formmanage.cache;

import com.myehr.pojo.formmanage.button.SysFormButtonExportColumn;
import com.myehr.pojo.formmanage.button.SysFormButtonImportColumn;
import com.myehr.pojo.formmanage.form.SysFormColumn;

/**
 * 导入字段配置
 * @author Administrator
 *
 */
public class SysFormButtonExportColumnCache {
	
	private SysFormButtonExportColumn pojo;
	
	/*//主键
	private long exportcolumnId;
	
	//关联字段ID
	private long exportColumnRelId;
	
//	重新指定导入字段
	private long exportReColumnRelId;
	
	//翻译类型
	private String exportColumnType;	
	
	//字典类
	private String exportColumnDictType;
	
	//关联字典ID
	private long exportColumnButtonId;
	
	//是否业务主键 IMPORT_COLUMN_BUS_KEY
	private String exportColumnBusKey; */
	
	//关联字段对象
	private SysFormColumnCache column;
	
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
	
	public SysFormColumnCache getColumn() {
		return column;
	}

	public void setColumn(SysFormColumnCache column) {
		this.column = column;
	}




	/**
	 * 空构造函数
	 *
	 */
	public SysFormButtonExportColumnCache(){}

	/**
	 * 
	 * @param obj
	 * @param form
	 */
	public SysFormButtonExportColumnCache(SysFormButtonExportColumn obj,SysFormconfigCache form) {
		this.pojo = obj;
		if(form.serchColumnByColumnId(this.pojo.getExportColumnRelId().longValue())!=null){
			this.exportColumnRelColumnName = form.serchColumnByColumnId(this.pojo.getExportColumnRelId().longValue()).getJsId("name",form.getFormDefId()+"");
			this.column = form.serchColumnByColumnId(this.pojo.getExportColumnRelId().longValue());
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
