package com.myehr.pojo.formmanage.button;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysFormButtonImportColumn implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BigDecimal importColumnId;

    private BigDecimal importColumnRelId;

    private String importColumnType;

    private String importColumnDictType;

    private String operatorName;

    private Date operatorTime;

    private BigDecimal importColumnButtonId;

    private String importColumnBusKey;

    private BigDecimal importReColumnRelId;

    private String importColumnUnique;

    private String importColumnForbid;

    public BigDecimal getImportColumnId() {
        return importColumnId;
    }

    public void setImportColumnId(BigDecimal importColumnId) {
        this.importColumnId = importColumnId;
    }

    public BigDecimal getImportColumnRelId() {
        return importColumnRelId;
    }

    public void setImportColumnRelId(BigDecimal importColumnRelId) {
        this.importColumnRelId = importColumnRelId;
    }

    public String getImportColumnType() {
        return importColumnType;
    }

    public void setImportColumnType(String importColumnType) {
        this.importColumnType = importColumnType == null ? null : importColumnType.trim();
    }

    public String getImportColumnDictType() {
        return importColumnDictType;
    }

    public void setImportColumnDictType(String importColumnDictType) {
        this.importColumnDictType = importColumnDictType == null ? null : importColumnDictType.trim();
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

    public BigDecimal getImportColumnButtonId() {
        return importColumnButtonId;
    }

    public void setImportColumnButtonId(BigDecimal importColumnButtonId) {
        this.importColumnButtonId = importColumnButtonId;
    }

    public String getImportColumnBusKey() {
        return importColumnBusKey;
    }

    public void setImportColumnBusKey(String importColumnBusKey) {
        this.importColumnBusKey = importColumnBusKey == null ? null : importColumnBusKey.trim();
    }

    public BigDecimal getImportReColumnRelId() {
        return importReColumnRelId;
    }

    public void setImportReColumnRelId(BigDecimal importReColumnRelId) {
        this.importReColumnRelId = importReColumnRelId;
    }

    public String getImportColumnUnique() {
        return importColumnUnique;
    }

    public void setImportColumnUnique(String importColumnUnique) {
        this.importColumnUnique = importColumnUnique == null ? null : importColumnUnique.trim();
    }

    public String getImportColumnForbid() {
        return importColumnForbid;
    }

    public void setImportColumnForbid(String importColumnForbid) {
        this.importColumnForbid = importColumnForbid == null ? null : importColumnForbid.trim();
    }
}