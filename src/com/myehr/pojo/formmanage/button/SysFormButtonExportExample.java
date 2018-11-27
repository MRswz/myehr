package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormButtonExportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonExportExample() {
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

        public Criteria andButtonExportIdIsNull() {
            addCriterion("BUTTON_EXPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdIsNotNull() {
            addCriterion("BUTTON_EXPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdEqualTo(BigDecimal value) {
            addCriterion("BUTTON_EXPORT_ID =", value, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdNotEqualTo(BigDecimal value) {
            addCriterion("BUTTON_EXPORT_ID <>", value, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdGreaterThan(BigDecimal value) {
            addCriterion("BUTTON_EXPORT_ID >", value, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_EXPORT_ID >=", value, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdLessThan(BigDecimal value) {
            addCriterion("BUTTON_EXPORT_ID <", value, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_EXPORT_ID <=", value, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdIn(List<BigDecimal> values) {
            addCriterion("BUTTON_EXPORT_ID in", values, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdNotIn(List<BigDecimal> values) {
            addCriterion("BUTTON_EXPORT_ID not in", values, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_EXPORT_ID between", value1, value2, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andButtonExportIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_EXPORT_ID not between", value1, value2, "buttonExportId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdIsNull() {
            addCriterion("FORM_BUTTON_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdIsNotNull() {
            addCriterion("FORM_BUTTON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID =", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID <>", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID >", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID >=", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdLessThan(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID <", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID <=", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdIn(List<BigDecimal> values) {
            addCriterion("FORM_BUTTON_ID in", values, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_BUTTON_ID not in", values, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_BUTTON_ID between", value1, value2, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_BUTTON_ID not between", value1, value2, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeIsNull() {
            addCriterion("BUTTON_EXPORT_EXC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeIsNotNull() {
            addCriterion("BUTTON_EXPORT_EXC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE =", value, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeNotEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE <>", value, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeGreaterThan(String value) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE >", value, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE >=", value, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeLessThan(String value) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE <", value, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE <=", value, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeLike(String value) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE like", value, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeNotLike(String value) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE not like", value, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE in", values, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeNotIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE not in", values, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE between", value1, value2, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportExcTypeNotBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_EXC_TYPE not between", value1, value2, "buttonExportExcType");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunIsNull() {
            addCriterion("BUTTON_EXPORT_FUN is null");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunIsNotNull() {
            addCriterion("BUTTON_EXPORT_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FUN =", value, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunNotEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FUN <>", value, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunGreaterThan(String value) {
            addCriterion("BUTTON_EXPORT_FUN >", value, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FUN >=", value, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunLessThan(String value) {
            addCriterion("BUTTON_EXPORT_FUN <", value, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FUN <=", value, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunLike(String value) {
            addCriterion("BUTTON_EXPORT_FUN like", value, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunNotLike(String value) {
            addCriterion("BUTTON_EXPORT_FUN not like", value, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_FUN in", values, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunNotIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_FUN not in", values, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_FUN between", value1, value2, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFunNotBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_FUN not between", value1, value2, "buttonExportFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlIsNull() {
            addCriterion("BUTTON_EXPORT_URL is null");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlIsNotNull() {
            addCriterion("BUTTON_EXPORT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_URL =", value, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlNotEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_URL <>", value, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlGreaterThan(String value) {
            addCriterion("BUTTON_EXPORT_URL >", value, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_URL >=", value, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlLessThan(String value) {
            addCriterion("BUTTON_EXPORT_URL <", value, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_URL <=", value, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlLike(String value) {
            addCriterion("BUTTON_EXPORT_URL like", value, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlNotLike(String value) {
            addCriterion("BUTTON_EXPORT_URL not like", value, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_URL in", values, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlNotIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_URL not in", values, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_URL between", value1, value2, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportUrlNotBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_URL not between", value1, value2, "buttonExportUrl");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlIsNull() {
            addCriterion("BUTTON_EXPORT_SQL is null");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlIsNotNull() {
            addCriterion("BUTTON_EXPORT_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_SQL =", value, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlNotEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_SQL <>", value, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlGreaterThan(String value) {
            addCriterion("BUTTON_EXPORT_SQL >", value, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_SQL >=", value, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlLessThan(String value) {
            addCriterion("BUTTON_EXPORT_SQL <", value, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_SQL <=", value, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlLike(String value) {
            addCriterion("BUTTON_EXPORT_SQL like", value, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlNotLike(String value) {
            addCriterion("BUTTON_EXPORT_SQL not like", value, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_SQL in", values, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlNotIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_SQL not in", values, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_SQL between", value1, value2, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportSqlNotBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_SQL not between", value1, value2, "buttonExportSql");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunIsNull() {
            addCriterion("BUTTON_EXPORT_INIT_FUN is null");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunIsNotNull() {
            addCriterion("BUTTON_EXPORT_INIT_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_INIT_FUN =", value, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunNotEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_INIT_FUN <>", value, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunGreaterThan(String value) {
            addCriterion("BUTTON_EXPORT_INIT_FUN >", value, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_INIT_FUN >=", value, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunLessThan(String value) {
            addCriterion("BUTTON_EXPORT_INIT_FUN <", value, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_INIT_FUN <=", value, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunLike(String value) {
            addCriterion("BUTTON_EXPORT_INIT_FUN like", value, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunNotLike(String value) {
            addCriterion("BUTTON_EXPORT_INIT_FUN not like", value, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_INIT_FUN in", values, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunNotIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_INIT_FUN not in", values, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_INIT_FUN between", value1, value2, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportInitFunNotBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_INIT_FUN not between", value1, value2, "buttonExportInitFun");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameIsNull() {
            addCriterion("BUTTON_EXPORT_FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameIsNotNull() {
            addCriterion("BUTTON_EXPORT_FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FILENAME =", value, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameNotEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FILENAME <>", value, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameGreaterThan(String value) {
            addCriterion("BUTTON_EXPORT_FILENAME >", value, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FILENAME >=", value, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameLessThan(String value) {
            addCriterion("BUTTON_EXPORT_FILENAME <", value, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FILENAME <=", value, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameLike(String value) {
            addCriterion("BUTTON_EXPORT_FILENAME like", value, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameNotLike(String value) {
            addCriterion("BUTTON_EXPORT_FILENAME not like", value, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_FILENAME in", values, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameNotIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_FILENAME not in", values, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_FILENAME between", value1, value2, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFilenameNotBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_FILENAME not between", value1, value2, "buttonExportFilename");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesIsNull() {
            addCriterion("BUTTON_EXPORT_FIELDNAMES is null");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesIsNotNull() {
            addCriterion("BUTTON_EXPORT_FIELDNAMES is not null");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES =", value, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesNotEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES <>", value, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesGreaterThan(String value) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES >", value, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES >=", value, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesLessThan(String value) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES <", value, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES <=", value, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesLike(String value) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES like", value, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesNotLike(String value) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES not like", value, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES in", values, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesNotIn(List<String> values) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES not in", values, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES between", value1, value2, "buttonExportFieldnames");
            return (Criteria) this;
        }

        public Criteria andButtonExportFieldnamesNotBetween(String value1, String value2) {
            addCriterion("BUTTON_EXPORT_FIELDNAMES not between", value1, value2, "buttonExportFieldnames");
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