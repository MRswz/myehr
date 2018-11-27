package com.myehr.pojo.formmanage.widget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormRadiobuttonlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormRadiobuttonlistExample() {
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

        public Criteria andRadiolistIdIsNull() {
            addCriterion("RADIOLIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdIsNotNull() {
            addCriterion("RADIOLIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdEqualTo(BigDecimal value) {
            addCriterion("RADIOLIST_ID =", value, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdNotEqualTo(BigDecimal value) {
            addCriterion("RADIOLIST_ID <>", value, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdGreaterThan(BigDecimal value) {
            addCriterion("RADIOLIST_ID >", value, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RADIOLIST_ID >=", value, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdLessThan(BigDecimal value) {
            addCriterion("RADIOLIST_ID <", value, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RADIOLIST_ID <=", value, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdIn(List<BigDecimal> values) {
            addCriterion("RADIOLIST_ID in", values, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdNotIn(List<BigDecimal> values) {
            addCriterion("RADIOLIST_ID not in", values, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RADIOLIST_ID between", value1, value2, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RADIOLIST_ID not between", value1, value2, "radiolistId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdIsNull() {
            addCriterion("RADIOLIST_FORM_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdIsNotNull() {
            addCriterion("RADIOLIST_FORM_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdEqualTo(BigDecimal value) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID =", value, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID <>", value, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdGreaterThan(BigDecimal value) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID >", value, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID >=", value, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdLessThan(BigDecimal value) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID <", value, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID <=", value, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdIn(List<BigDecimal> values) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID in", values, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID not in", values, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID between", value1, value2, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistFormColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RADIOLIST_FORM_COLUMN_ID not between", value1, value2, "radiolistFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeIsNull() {
            addCriterion("RADIOLIST_CHECK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeIsNotNull() {
            addCriterion("RADIOLIST_CHECK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_TYPE =", value, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeNotEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_TYPE <>", value, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeGreaterThan(String value) {
            addCriterion("RADIOLIST_CHECK_TYPE >", value, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_TYPE >=", value, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeLessThan(String value) {
            addCriterion("RADIOLIST_CHECK_TYPE <", value, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_TYPE <=", value, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeLike(String value) {
            addCriterion("RADIOLIST_CHECK_TYPE like", value, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeNotLike(String value) {
            addCriterion("RADIOLIST_CHECK_TYPE not like", value, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeIn(List<String> values) {
            addCriterion("RADIOLIST_CHECK_TYPE in", values, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeNotIn(List<String> values) {
            addCriterion("RADIOLIST_CHECK_TYPE not in", values, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeBetween(String value1, String value2) {
            addCriterion("RADIOLIST_CHECK_TYPE between", value1, value2, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckTypeNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_CHECK_TYPE not between", value1, value2, "radiolistCheckType");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfIsNull() {
            addCriterion("RADIOLIST_CHECK_SELF is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfIsNotNull() {
            addCriterion("RADIOLIST_CHECK_SELF is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_SELF =", value, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfNotEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_SELF <>", value, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfGreaterThan(String value) {
            addCriterion("RADIOLIST_CHECK_SELF >", value, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_SELF >=", value, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfLessThan(String value) {
            addCriterion("RADIOLIST_CHECK_SELF <", value, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_SELF <=", value, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfLike(String value) {
            addCriterion("RADIOLIST_CHECK_SELF like", value, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfNotLike(String value) {
            addCriterion("RADIOLIST_CHECK_SELF not like", value, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfIn(List<String> values) {
            addCriterion("RADIOLIST_CHECK_SELF in", values, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfNotIn(List<String> values) {
            addCriterion("RADIOLIST_CHECK_SELF not in", values, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfBetween(String value1, String value2) {
            addCriterion("RADIOLIST_CHECK_SELF between", value1, value2, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckSelfNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_CHECK_SELF not between", value1, value2, "radiolistCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunIsNull() {
            addCriterion("RADIOLIST_CHECK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunIsNotNull() {
            addCriterion("RADIOLIST_CHECK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_FUN =", value, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunNotEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_FUN <>", value, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunGreaterThan(String value) {
            addCriterion("RADIOLIST_CHECK_FUN >", value, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_FUN >=", value, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunLessThan(String value) {
            addCriterion("RADIOLIST_CHECK_FUN <", value, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_CHECK_FUN <=", value, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunLike(String value) {
            addCriterion("RADIOLIST_CHECK_FUN like", value, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunNotLike(String value) {
            addCriterion("RADIOLIST_CHECK_FUN not like", value, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunIn(List<String> values) {
            addCriterion("RADIOLIST_CHECK_FUN in", values, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunNotIn(List<String> values) {
            addCriterion("RADIOLIST_CHECK_FUN not in", values, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunBetween(String value1, String value2) {
            addCriterion("RADIOLIST_CHECK_FUN between", value1, value2, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistCheckFunNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_CHECK_FUN not between", value1, value2, "radiolistCheckFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunIsNull() {
            addCriterion("RADIOLIST_INIT_FUN is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunIsNotNull() {
            addCriterion("RADIOLIST_INIT_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunEqualTo(String value) {
            addCriterion("RADIOLIST_INIT_FUN =", value, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunNotEqualTo(String value) {
            addCriterion("RADIOLIST_INIT_FUN <>", value, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunGreaterThan(String value) {
            addCriterion("RADIOLIST_INIT_FUN >", value, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_INIT_FUN >=", value, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunLessThan(String value) {
            addCriterion("RADIOLIST_INIT_FUN <", value, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_INIT_FUN <=", value, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunLike(String value) {
            addCriterion("RADIOLIST_INIT_FUN like", value, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunNotLike(String value) {
            addCriterion("RADIOLIST_INIT_FUN not like", value, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunIn(List<String> values) {
            addCriterion("RADIOLIST_INIT_FUN in", values, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunNotIn(List<String> values) {
            addCriterion("RADIOLIST_INIT_FUN not in", values, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunBetween(String value1, String value2) {
            addCriterion("RADIOLIST_INIT_FUN between", value1, value2, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitFunNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_INIT_FUN not between", value1, value2, "radiolistInitFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlIsNull() {
            addCriterion("RADIOLIST_INIT_SQL is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlIsNotNull() {
            addCriterion("RADIOLIST_INIT_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlEqualTo(String value) {
            addCriterion("RADIOLIST_INIT_SQL =", value, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlNotEqualTo(String value) {
            addCriterion("RADIOLIST_INIT_SQL <>", value, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlGreaterThan(String value) {
            addCriterion("RADIOLIST_INIT_SQL >", value, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_INIT_SQL >=", value, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlLessThan(String value) {
            addCriterion("RADIOLIST_INIT_SQL <", value, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_INIT_SQL <=", value, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlLike(String value) {
            addCriterion("RADIOLIST_INIT_SQL like", value, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlNotLike(String value) {
            addCriterion("RADIOLIST_INIT_SQL not like", value, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlIn(List<String> values) {
            addCriterion("RADIOLIST_INIT_SQL in", values, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlNotIn(List<String> values) {
            addCriterion("RADIOLIST_INIT_SQL not in", values, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlBetween(String value1, String value2) {
            addCriterion("RADIOLIST_INIT_SQL between", value1, value2, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistInitSqlNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_INIT_SQL not between", value1, value2, "radiolistInitSql");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunIsNull() {
            addCriterion("RADIOLIST_VALUECHANGE_FUN is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunIsNotNull() {
            addCriterion("RADIOLIST_VALUECHANGE_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunEqualTo(String value) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN =", value, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunNotEqualTo(String value) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN <>", value, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunGreaterThan(String value) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN >", value, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN >=", value, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunLessThan(String value) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN <", value, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN <=", value, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunLike(String value) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN like", value, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunNotLike(String value) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN not like", value, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunIn(List<String> values) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN in", values, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunNotIn(List<String> values) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN not in", values, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunBetween(String value1, String value2) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN between", value1, value2, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuechangeFunNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_VALUECHANGE_FUN not between", value1, value2, "radiolistValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunIsNull() {
            addCriterion("RADIOLIST_CLICK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunIsNotNull() {
            addCriterion("RADIOLIST_CLICK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunEqualTo(String value) {
            addCriterion("RADIOLIST_CLICK_FUN =", value, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunNotEqualTo(String value) {
            addCriterion("RADIOLIST_CLICK_FUN <>", value, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunGreaterThan(String value) {
            addCriterion("RADIOLIST_CLICK_FUN >", value, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_CLICK_FUN >=", value, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunLessThan(String value) {
            addCriterion("RADIOLIST_CLICK_FUN <", value, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_CLICK_FUN <=", value, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunLike(String value) {
            addCriterion("RADIOLIST_CLICK_FUN like", value, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunNotLike(String value) {
            addCriterion("RADIOLIST_CLICK_FUN not like", value, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunIn(List<String> values) {
            addCriterion("RADIOLIST_CLICK_FUN in", values, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunNotIn(List<String> values) {
            addCriterion("RADIOLIST_CLICK_FUN not in", values, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunBetween(String value1, String value2) {
            addCriterion("RADIOLIST_CLICK_FUN between", value1, value2, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistClickFunNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_CLICK_FUN not between", value1, value2, "radiolistClickFun");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeIsNull() {
            addCriterion("RADIOLIST_DATA_FROM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeIsNotNull() {
            addCriterion("RADIOLIST_DATA_FROM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeEqualTo(String value) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE =", value, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeNotEqualTo(String value) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE <>", value, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeGreaterThan(String value) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE >", value, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE >=", value, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeLessThan(String value) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE <", value, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE <=", value, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeLike(String value) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE like", value, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeNotLike(String value) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE not like", value, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeIn(List<String> values) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE in", values, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeNotIn(List<String> values) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE not in", values, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeBetween(String value1, String value2) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE between", value1, value2, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromTypeNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_DATA_FROM_TYPE not between", value1, value2, "radiolistDataFromType");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueIsNull() {
            addCriterion("RADIOLIST_DATA_FROM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueIsNotNull() {
            addCriterion("RADIOLIST_DATA_FROM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueEqualTo(String value) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE =", value, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueNotEqualTo(String value) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE <>", value, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueGreaterThan(String value) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE >", value, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE >=", value, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueLessThan(String value) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE <", value, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE <=", value, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueLike(String value) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE like", value, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueNotLike(String value) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE not like", value, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueIn(List<String> values) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE in", values, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueNotIn(List<String> values) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE not in", values, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueBetween(String value1, String value2) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE between", value1, value2, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistDataFromValueNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_DATA_FROM_VALUE not between", value1, value2, "radiolistDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeIsNull() {
            addCriterion("RADIOLIST_GUI_INIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeIsNotNull() {
            addCriterion("RADIOLIST_GUI_INIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeEqualTo(String value) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE =", value, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeNotEqualTo(String value) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE <>", value, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeGreaterThan(String value) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE >", value, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE >=", value, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeLessThan(String value) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE <", value, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE <=", value, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeLike(String value) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE like", value, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeNotLike(String value) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE not like", value, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeIn(List<String> values) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE in", values, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeNotIn(List<String> values) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE not in", values, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeBetween(String value1, String value2) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE between", value1, value2, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitTypeNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_GUI_INIT_TYPE not between", value1, value2, "radiolistGuiInitType");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueIsNull() {
            addCriterion("RADIOLIST_GUI_INIT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueIsNotNull() {
            addCriterion("RADIOLIST_GUI_INIT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueEqualTo(String value) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE =", value, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueNotEqualTo(String value) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE <>", value, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueGreaterThan(String value) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE >", value, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE >=", value, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueLessThan(String value) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE <", value, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE <=", value, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueLike(String value) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE like", value, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueNotLike(String value) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE not like", value, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueIn(List<String> values) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE in", values, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueNotIn(List<String> values) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE not in", values, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueBetween(String value1, String value2) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE between", value1, value2, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistGuiInitValueNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_GUI_INIT_VALUE not between", value1, value2, "radiolistGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionIsNull() {
            addCriterion("RADIOLIST_REPEATDIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionIsNotNull() {
            addCriterion("RADIOLIST_REPEATDIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATDIRECTION =", value, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionNotEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATDIRECTION <>", value, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionGreaterThan(String value) {
            addCriterion("RADIOLIST_REPEATDIRECTION >", value, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATDIRECTION >=", value, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionLessThan(String value) {
            addCriterion("RADIOLIST_REPEATDIRECTION <", value, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATDIRECTION <=", value, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionLike(String value) {
            addCriterion("RADIOLIST_REPEATDIRECTION like", value, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionNotLike(String value) {
            addCriterion("RADIOLIST_REPEATDIRECTION not like", value, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionIn(List<String> values) {
            addCriterion("RADIOLIST_REPEATDIRECTION in", values, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionNotIn(List<String> values) {
            addCriterion("RADIOLIST_REPEATDIRECTION not in", values, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionBetween(String value1, String value2) {
            addCriterion("RADIOLIST_REPEATDIRECTION between", value1, value2, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatdirectionNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_REPEATDIRECTION not between", value1, value2, "radiolistRepeatdirection");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldIsNull() {
            addCriterion("RADIOLIST_TEXTFIELD is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldIsNotNull() {
            addCriterion("RADIOLIST_TEXTFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldEqualTo(String value) {
            addCriterion("RADIOLIST_TEXTFIELD =", value, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldNotEqualTo(String value) {
            addCriterion("RADIOLIST_TEXTFIELD <>", value, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldGreaterThan(String value) {
            addCriterion("RADIOLIST_TEXTFIELD >", value, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_TEXTFIELD >=", value, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldLessThan(String value) {
            addCriterion("RADIOLIST_TEXTFIELD <", value, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_TEXTFIELD <=", value, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldLike(String value) {
            addCriterion("RADIOLIST_TEXTFIELD like", value, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldNotLike(String value) {
            addCriterion("RADIOLIST_TEXTFIELD not like", value, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldIn(List<String> values) {
            addCriterion("RADIOLIST_TEXTFIELD in", values, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldNotIn(List<String> values) {
            addCriterion("RADIOLIST_TEXTFIELD not in", values, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldBetween(String value1, String value2) {
            addCriterion("RADIOLIST_TEXTFIELD between", value1, value2, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistTextfieldNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_TEXTFIELD not between", value1, value2, "radiolistTextfield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldIsNull() {
            addCriterion("RADIOLIST_VALUEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldIsNotNull() {
            addCriterion("RADIOLIST_VALUEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldEqualTo(String value) {
            addCriterion("RADIOLIST_VALUEFIELD =", value, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldNotEqualTo(String value) {
            addCriterion("RADIOLIST_VALUEFIELD <>", value, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldGreaterThan(String value) {
            addCriterion("RADIOLIST_VALUEFIELD >", value, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_VALUEFIELD >=", value, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldLessThan(String value) {
            addCriterion("RADIOLIST_VALUEFIELD <", value, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_VALUEFIELD <=", value, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldLike(String value) {
            addCriterion("RADIOLIST_VALUEFIELD like", value, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldNotLike(String value) {
            addCriterion("RADIOLIST_VALUEFIELD not like", value, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldIn(List<String> values) {
            addCriterion("RADIOLIST_VALUEFIELD in", values, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldNotIn(List<String> values) {
            addCriterion("RADIOLIST_VALUEFIELD not in", values, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldBetween(String value1, String value2) {
            addCriterion("RADIOLIST_VALUEFIELD between", value1, value2, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistValuefieldNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_VALUEFIELD not between", value1, value2, "radiolistValuefield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldIsNull() {
            addCriterion("RADIOLIST_DATAFIELD is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldIsNotNull() {
            addCriterion("RADIOLIST_DATAFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldEqualTo(String value) {
            addCriterion("RADIOLIST_DATAFIELD =", value, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldNotEqualTo(String value) {
            addCriterion("RADIOLIST_DATAFIELD <>", value, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldGreaterThan(String value) {
            addCriterion("RADIOLIST_DATAFIELD >", value, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_DATAFIELD >=", value, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldLessThan(String value) {
            addCriterion("RADIOLIST_DATAFIELD <", value, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_DATAFIELD <=", value, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldLike(String value) {
            addCriterion("RADIOLIST_DATAFIELD like", value, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldNotLike(String value) {
            addCriterion("RADIOLIST_DATAFIELD not like", value, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldIn(List<String> values) {
            addCriterion("RADIOLIST_DATAFIELD in", values, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldNotIn(List<String> values) {
            addCriterion("RADIOLIST_DATAFIELD not in", values, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldBetween(String value1, String value2) {
            addCriterion("RADIOLIST_DATAFIELD between", value1, value2, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistDatafieldNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_DATAFIELD not between", value1, value2, "radiolistDatafield");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutIsNull() {
            addCriterion("RADIOLIST_REPEATLAYOUT is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutIsNotNull() {
            addCriterion("RADIOLIST_REPEATLAYOUT is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATLAYOUT =", value, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutNotEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATLAYOUT <>", value, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutGreaterThan(String value) {
            addCriterion("RADIOLIST_REPEATLAYOUT >", value, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATLAYOUT >=", value, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutLessThan(String value) {
            addCriterion("RADIOLIST_REPEATLAYOUT <", value, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATLAYOUT <=", value, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutLike(String value) {
            addCriterion("RADIOLIST_REPEATLAYOUT like", value, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutNotLike(String value) {
            addCriterion("RADIOLIST_REPEATLAYOUT not like", value, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutIn(List<String> values) {
            addCriterion("RADIOLIST_REPEATLAYOUT in", values, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutNotIn(List<String> values) {
            addCriterion("RADIOLIST_REPEATLAYOUT not in", values, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutBetween(String value1, String value2) {
            addCriterion("RADIOLIST_REPEATLAYOUT between", value1, value2, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatlayoutNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_REPEATLAYOUT not between", value1, value2, "radiolistRepeatlayout");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsIsNull() {
            addCriterion("RADIOLIST_REPEATITEMS is null");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsIsNotNull() {
            addCriterion("RADIOLIST_REPEATITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATITEMS =", value, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsNotEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATITEMS <>", value, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsGreaterThan(String value) {
            addCriterion("RADIOLIST_REPEATITEMS >", value, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsGreaterThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATITEMS >=", value, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsLessThan(String value) {
            addCriterion("RADIOLIST_REPEATITEMS <", value, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsLessThanOrEqualTo(String value) {
            addCriterion("RADIOLIST_REPEATITEMS <=", value, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsLike(String value) {
            addCriterion("RADIOLIST_REPEATITEMS like", value, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsNotLike(String value) {
            addCriterion("RADIOLIST_REPEATITEMS not like", value, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsIn(List<String> values) {
            addCriterion("RADIOLIST_REPEATITEMS in", values, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsNotIn(List<String> values) {
            addCriterion("RADIOLIST_REPEATITEMS not in", values, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsBetween(String value1, String value2) {
            addCriterion("RADIOLIST_REPEATITEMS between", value1, value2, "radiolistRepeatitems");
            return (Criteria) this;
        }

        public Criteria andRadiolistRepeatitemsNotBetween(String value1, String value2) {
            addCriterion("RADIOLIST_REPEATITEMS not between", value1, value2, "radiolistRepeatitems");
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

        public Criteria andCheckboxOrRadioboxIsNull() {
            addCriterion("CHECKBOX_OR_RADIOBOX is null");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxIsNotNull() {
            addCriterion("CHECKBOX_OR_RADIOBOX is not null");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxEqualTo(String value) {
            addCriterion("CHECKBOX_OR_RADIOBOX =", value, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxNotEqualTo(String value) {
            addCriterion("CHECKBOX_OR_RADIOBOX <>", value, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxGreaterThan(String value) {
            addCriterion("CHECKBOX_OR_RADIOBOX >", value, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKBOX_OR_RADIOBOX >=", value, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxLessThan(String value) {
            addCriterion("CHECKBOX_OR_RADIOBOX <", value, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxLessThanOrEqualTo(String value) {
            addCriterion("CHECKBOX_OR_RADIOBOX <=", value, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxLike(String value) {
            addCriterion("CHECKBOX_OR_RADIOBOX like", value, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxNotLike(String value) {
            addCriterion("CHECKBOX_OR_RADIOBOX not like", value, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxIn(List<String> values) {
            addCriterion("CHECKBOX_OR_RADIOBOX in", values, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxNotIn(List<String> values) {
            addCriterion("CHECKBOX_OR_RADIOBOX not in", values, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxBetween(String value1, String value2) {
            addCriterion("CHECKBOX_OR_RADIOBOX between", value1, value2, "checkboxOrRadiobox");
            return (Criteria) this;
        }

        public Criteria andCheckboxOrRadioboxNotBetween(String value1, String value2) {
            addCriterion("CHECKBOX_OR_RADIOBOX not between", value1, value2, "checkboxOrRadiobox");
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