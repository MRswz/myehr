package com.myehr.pojo.formmanage.widget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormFileuploadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormFileuploadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFileuploadIdIsNull() {
            addCriterion("FILEUPLOAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdIsNotNull() {
            addCriterion("FILEUPLOAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_ID =", value, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdNotEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_ID <>", value, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdGreaterThan(BigDecimal value) {
            addCriterion("FILEUPLOAD_ID >", value, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_ID >=", value, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdLessThan(BigDecimal value) {
            addCriterion("FILEUPLOAD_ID <", value, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_ID <=", value, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdIn(List<BigDecimal> values) {
            addCriterion("FILEUPLOAD_ID in", values, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdNotIn(List<BigDecimal> values) {
            addCriterion("FILEUPLOAD_ID not in", values, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILEUPLOAD_ID between", value1, value2, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILEUPLOAD_ID not between", value1, value2, "fileuploadId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdIsNull() {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdIsNotNull() {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID =", value, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID <>", value, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdGreaterThan(BigDecimal value) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID >", value, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID >=", value, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdLessThan(BigDecimal value) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID <", value, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID <=", value, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdIn(List<BigDecimal> values) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID in", values, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID not in", values, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID between", value1, value2, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadFormColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILEUPLOAD_FORM_COLUMN_ID not between", value1, value2, "fileuploadFormColumnId");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunIsNull() {
            addCriterion("FILEUPLOAD_CHECK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunIsNotNull() {
            addCriterion("FILEUPLOAD_CHECK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunEqualTo(String value) {
            addCriterion("FILEUPLOAD_CHECK_FUN =", value, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_CHECK_FUN <>", value, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunGreaterThan(String value) {
            addCriterion("FILEUPLOAD_CHECK_FUN >", value, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_CHECK_FUN >=", value, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunLessThan(String value) {
            addCriterion("FILEUPLOAD_CHECK_FUN <", value, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_CHECK_FUN <=", value, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunLike(String value) {
            addCriterion("FILEUPLOAD_CHECK_FUN like", value, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunNotLike(String value) {
            addCriterion("FILEUPLOAD_CHECK_FUN not like", value, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunIn(List<String> values) {
            addCriterion("FILEUPLOAD_CHECK_FUN in", values, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_CHECK_FUN not in", values, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_CHECK_FUN between", value1, value2, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadCheckFunNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_CHECK_FUN not between", value1, value2, "fileuploadCheckFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunIsNull() {
            addCriterion("FILEUPLOAD_INIT_FUN is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunIsNotNull() {
            addCriterion("FILEUPLOAD_INIT_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunEqualTo(String value) {
            addCriterion("FILEUPLOAD_INIT_FUN =", value, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_INIT_FUN <>", value, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunGreaterThan(String value) {
            addCriterion("FILEUPLOAD_INIT_FUN >", value, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_INIT_FUN >=", value, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunLessThan(String value) {
            addCriterion("FILEUPLOAD_INIT_FUN <", value, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_INIT_FUN <=", value, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunLike(String value) {
            addCriterion("FILEUPLOAD_INIT_FUN like", value, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunNotLike(String value) {
            addCriterion("FILEUPLOAD_INIT_FUN not like", value, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunIn(List<String> values) {
            addCriterion("FILEUPLOAD_INIT_FUN in", values, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_INIT_FUN not in", values, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_INIT_FUN between", value1, value2, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadInitFunNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_INIT_FUN not between", value1, value2, "fileuploadInitFun");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeIsNull() {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeIsNotNull() {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeEqualTo(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE =", value, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE <>", value, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeGreaterThan(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE >", value, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE >=", value, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeLessThan(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE <", value, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE <=", value, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeLike(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE like", value, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeNotLike(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE not like", value, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeIn(List<String> values) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE in", values, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE not in", values, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE between", value1, value2, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromTypeNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_DATA_FROM_TYPE not between", value1, value2, "fileuploadDataFromType");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueIsNull() {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueIsNotNull() {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueEqualTo(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE =", value, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE <>", value, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueGreaterThan(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE >", value, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE >=", value, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueLessThan(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE <", value, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE <=", value, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueLike(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE like", value, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueNotLike(String value) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE not like", value, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueIn(List<String> values) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE in", values, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE not in", values, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE between", value1, value2, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadDataFromValueNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_DATA_FROM_VALUE not between", value1, value2, "fileuploadDataFromValue");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeIsNull() {
            addCriterion("FILEUPLOAD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeIsNotNull() {
            addCriterion("FILEUPLOAD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeEqualTo(String value) {
            addCriterion("FILEUPLOAD_TYPE =", value, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_TYPE <>", value, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeGreaterThan(String value) {
            addCriterion("FILEUPLOAD_TYPE >", value, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_TYPE >=", value, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeLessThan(String value) {
            addCriterion("FILEUPLOAD_TYPE <", value, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_TYPE <=", value, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeLike(String value) {
            addCriterion("FILEUPLOAD_TYPE like", value, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeNotLike(String value) {
            addCriterion("FILEUPLOAD_TYPE not like", value, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeIn(List<String> values) {
            addCriterion("FILEUPLOAD_TYPE in", values, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_TYPE not in", values, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_TYPE between", value1, value2, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTypeNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_TYPE not between", value1, value2, "fileuploadType");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadIsNull() {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadIsNotNull() {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadEqualTo(String value) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD =", value, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD <>", value, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadGreaterThan(String value) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD >", value, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD >=", value, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadLessThan(String value) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD <", value, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD <=", value, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadLike(String value) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD like", value, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadNotLike(String value) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD not like", value, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadIn(List<String> values) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD in", values, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD not in", values, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD between", value1, value2, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadOnlyDownloadNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_ONLY_DOWNLOAD not between", value1, value2, "fileuploadOnlyDownload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadIsNull() {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadIsNotNull() {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadEqualTo(String value) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD =", value, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD <>", value, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadGreaterThan(String value) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD >", value, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD >=", value, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadLessThan(String value) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD <", value, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD <=", value, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadLike(String value) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD like", value, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadNotLike(String value) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD not like", value, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadIn(List<String> values) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD in", values, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD not in", values, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD between", value1, value2, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadAutoUploadNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_AUTO_UPLOAD not between", value1, value2, "fileuploadAutoUpload");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesIsNull() {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesIsNotNull() {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesEqualTo(String value) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES =", value, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES <>", value, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesGreaterThan(String value) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES >", value, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES >=", value, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesLessThan(String value) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES <", value, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES <=", value, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesLike(String value) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES like", value, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesNotLike(String value) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES not like", value, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesIn(List<String> values) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES in", values, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES not in", values, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES between", value1, value2, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andFileuploadUploadFiletypesNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_UPLOAD_FILETYPES not between", value1, value2, "fileuploadUploadFiletypes");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNull() {
            addCriterion("OPERATOR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNotNull() {
            addCriterion("OPERATOR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeEqualTo(Date value) {
            addCriterion("OPERATOR_TIME =", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotEqualTo(Date value) {
            addCriterion("OPERATOR_TIME <>", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThan(Date value) {
            addCriterion("OPERATOR_TIME >", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERATOR_TIME >=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThan(Date value) {
            addCriterion("OPERATOR_TIME <", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPERATOR_TIME <=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIn(List<Date> values) {
            addCriterion("OPERATOR_TIME in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotIn(List<Date> values) {
            addCriterion("OPERATOR_TIME not in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeBetween(Date value1, Date value2) {
            addCriterion("OPERATOR_TIME between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPERATOR_TIME not between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("OPERATOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("OPERATOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("OPERATOR_NAME =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("OPERATOR_NAME <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("OPERATOR_NAME >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_NAME >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("OPERATOR_NAME <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_NAME <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("OPERATOR_NAME like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("OPERATOR_NAME not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("OPERATOR_NAME in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("OPERATOR_NAME not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("OPERATOR_NAME between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_NAME not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountIsNull() {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountIsNotNull() {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT =", value, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountNotEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT <>", value, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountGreaterThan(BigDecimal value) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT >", value, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT >=", value, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountLessThan(BigDecimal value) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT <", value, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT <=", value, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountIn(List<BigDecimal> values) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT in", values, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountNotIn(List<BigDecimal> values) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT not in", values, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT between", value1, value2, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadMaxFileCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FILEUPLOAD_MAX_FILE_COUNT not between", value1, value2, "fileuploadMaxFileCount");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeIsNull() {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeIsNotNull() {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeEqualTo(String value) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE =", value, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeNotEqualTo(String value) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE <>", value, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeGreaterThan(String value) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE >", value, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE >=", value, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeLessThan(String value) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE <", value, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeLessThanOrEqualTo(String value) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE <=", value, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeLike(String value) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE like", value, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeNotLike(String value) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE not like", value, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeIn(List<String> values) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE in", values, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeNotIn(List<String> values) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE not in", values, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE between", value1, value2, "fileuploadTagGuiType");
            return (Criteria) this;
        }

        public Criteria andFileuploadTagGuiTypeNotBetween(String value1, String value2) {
            addCriterion("FILEUPLOAD_TAG_GUI_TYPE not between", value1, value2, "fileuploadTagGuiType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}