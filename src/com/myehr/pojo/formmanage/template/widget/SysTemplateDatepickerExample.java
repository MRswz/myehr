package com.myehr.pojo.formmanage.template.widget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysTemplateDatepickerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTemplateDatepickerExample() {
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

        public Criteria andDatepickerIdIsNull() {
            addCriterion("DATEPICKER_ID is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdIsNotNull() {
            addCriterion("DATEPICKER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdEqualTo(BigDecimal value) {
            addCriterion("DATEPICKER_ID =", value, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdNotEqualTo(BigDecimal value) {
            addCriterion("DATEPICKER_ID <>", value, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdGreaterThan(BigDecimal value) {
            addCriterion("DATEPICKER_ID >", value, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DATEPICKER_ID >=", value, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdLessThan(BigDecimal value) {
            addCriterion("DATEPICKER_ID <", value, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DATEPICKER_ID <=", value, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdIn(List<BigDecimal> values) {
            addCriterion("DATEPICKER_ID in", values, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdNotIn(List<BigDecimal> values) {
            addCriterion("DATEPICKER_ID not in", values, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATEPICKER_ID between", value1, value2, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATEPICKER_ID not between", value1, value2, "datepickerId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdIsNull() {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdIsNotNull() {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdEqualTo(BigDecimal value) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID =", value, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID <>", value, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdGreaterThan(BigDecimal value) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID >", value, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID >=", value, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdLessThan(BigDecimal value) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID <", value, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID <=", value, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdIn(List<BigDecimal> values) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID in", values, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID not in", values, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID between", value1, value2, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerTemplateColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATEPICKER_TEMPLATE_COLUMN_ID not between", value1, value2, "datepickerTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeIsNull() {
            addCriterion("DATEPICKER_CHECK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeIsNotNull() {
            addCriterion("DATEPICKER_CHECK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_TYPE =", value, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeNotEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_TYPE <>", value, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeGreaterThan(String value) {
            addCriterion("DATEPICKER_CHECK_TYPE >", value, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_TYPE >=", value, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeLessThan(String value) {
            addCriterion("DATEPICKER_CHECK_TYPE <", value, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_TYPE <=", value, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeLike(String value) {
            addCriterion("DATEPICKER_CHECK_TYPE like", value, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeNotLike(String value) {
            addCriterion("DATEPICKER_CHECK_TYPE not like", value, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeIn(List<String> values) {
            addCriterion("DATEPICKER_CHECK_TYPE in", values, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeNotIn(List<String> values) {
            addCriterion("DATEPICKER_CHECK_TYPE not in", values, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeBetween(String value1, String value2) {
            addCriterion("DATEPICKER_CHECK_TYPE between", value1, value2, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckTypeNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_CHECK_TYPE not between", value1, value2, "datepickerCheckType");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfIsNull() {
            addCriterion("DATEPICKER_CHECK_SELF is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfIsNotNull() {
            addCriterion("DATEPICKER_CHECK_SELF is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_SELF =", value, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfNotEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_SELF <>", value, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfGreaterThan(String value) {
            addCriterion("DATEPICKER_CHECK_SELF >", value, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_SELF >=", value, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfLessThan(String value) {
            addCriterion("DATEPICKER_CHECK_SELF <", value, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_SELF <=", value, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfLike(String value) {
            addCriterion("DATEPICKER_CHECK_SELF like", value, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfNotLike(String value) {
            addCriterion("DATEPICKER_CHECK_SELF not like", value, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfIn(List<String> values) {
            addCriterion("DATEPICKER_CHECK_SELF in", values, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfNotIn(List<String> values) {
            addCriterion("DATEPICKER_CHECK_SELF not in", values, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfBetween(String value1, String value2) {
            addCriterion("DATEPICKER_CHECK_SELF between", value1, value2, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckSelfNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_CHECK_SELF not between", value1, value2, "datepickerCheckSelf");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunIsNull() {
            addCriterion("DATEPICKER_CHECK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunIsNotNull() {
            addCriterion("DATEPICKER_CHECK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_FUN =", value, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunNotEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_FUN <>", value, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunGreaterThan(String value) {
            addCriterion("DATEPICKER_CHECK_FUN >", value, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_FUN >=", value, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunLessThan(String value) {
            addCriterion("DATEPICKER_CHECK_FUN <", value, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_CHECK_FUN <=", value, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunLike(String value) {
            addCriterion("DATEPICKER_CHECK_FUN like", value, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunNotLike(String value) {
            addCriterion("DATEPICKER_CHECK_FUN not like", value, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunIn(List<String> values) {
            addCriterion("DATEPICKER_CHECK_FUN in", values, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunNotIn(List<String> values) {
            addCriterion("DATEPICKER_CHECK_FUN not in", values, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunBetween(String value1, String value2) {
            addCriterion("DATEPICKER_CHECK_FUN between", value1, value2, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerCheckFunNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_CHECK_FUN not between", value1, value2, "datepickerCheckFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunIsNull() {
            addCriterion("DATEPICKER_INIT_FUN is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunIsNotNull() {
            addCriterion("DATEPICKER_INIT_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunEqualTo(String value) {
            addCriterion("DATEPICKER_INIT_FUN =", value, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunNotEqualTo(String value) {
            addCriterion("DATEPICKER_INIT_FUN <>", value, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunGreaterThan(String value) {
            addCriterion("DATEPICKER_INIT_FUN >", value, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_INIT_FUN >=", value, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunLessThan(String value) {
            addCriterion("DATEPICKER_INIT_FUN <", value, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_INIT_FUN <=", value, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunLike(String value) {
            addCriterion("DATEPICKER_INIT_FUN like", value, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunNotLike(String value) {
            addCriterion("DATEPICKER_INIT_FUN not like", value, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunIn(List<String> values) {
            addCriterion("DATEPICKER_INIT_FUN in", values, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunNotIn(List<String> values) {
            addCriterion("DATEPICKER_INIT_FUN not in", values, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunBetween(String value1, String value2) {
            addCriterion("DATEPICKER_INIT_FUN between", value1, value2, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerInitFunNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_INIT_FUN not between", value1, value2, "datepickerInitFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunIsNull() {
            addCriterion("DATEPICKER_VALUECHANGE_FUN is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunIsNotNull() {
            addCriterion("DATEPICKER_VALUECHANGE_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunEqualTo(String value) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN =", value, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunNotEqualTo(String value) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN <>", value, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunGreaterThan(String value) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN >", value, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN >=", value, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunLessThan(String value) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN <", value, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN <=", value, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunLike(String value) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN like", value, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunNotLike(String value) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN not like", value, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunIn(List<String> values) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN in", values, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunNotIn(List<String> values) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN not in", values, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunBetween(String value1, String value2) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN between", value1, value2, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerValuechangeFunNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_VALUECHANGE_FUN not between", value1, value2, "datepickerValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunIsNull() {
            addCriterion("DATEPICKER_CLICK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunIsNotNull() {
            addCriterion("DATEPICKER_CLICK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunEqualTo(String value) {
            addCriterion("DATEPICKER_CLICK_FUN =", value, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunNotEqualTo(String value) {
            addCriterion("DATEPICKER_CLICK_FUN <>", value, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunGreaterThan(String value) {
            addCriterion("DATEPICKER_CLICK_FUN >", value, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_CLICK_FUN >=", value, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunLessThan(String value) {
            addCriterion("DATEPICKER_CLICK_FUN <", value, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_CLICK_FUN <=", value, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunLike(String value) {
            addCriterion("DATEPICKER_CLICK_FUN like", value, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunNotLike(String value) {
            addCriterion("DATEPICKER_CLICK_FUN not like", value, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunIn(List<String> values) {
            addCriterion("DATEPICKER_CLICK_FUN in", values, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunNotIn(List<String> values) {
            addCriterion("DATEPICKER_CLICK_FUN not in", values, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunBetween(String value1, String value2) {
            addCriterion("DATEPICKER_CLICK_FUN between", value1, value2, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerClickFunNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_CLICK_FUN not between", value1, value2, "datepickerClickFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeIsNull() {
            addCriterion("DATEPICKER_DATA_FROM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeIsNotNull() {
            addCriterion("DATEPICKER_DATA_FROM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeEqualTo(String value) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE =", value, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeNotEqualTo(String value) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE <>", value, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeGreaterThan(String value) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE >", value, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE >=", value, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeLessThan(String value) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE <", value, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE <=", value, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeLike(String value) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE like", value, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeNotLike(String value) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE not like", value, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeIn(List<String> values) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE in", values, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeNotIn(List<String> values) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE not in", values, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeBetween(String value1, String value2) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE between", value1, value2, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromTypeNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_DATA_FROM_TYPE not between", value1, value2, "datepickerDataFromType");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueIsNull() {
            addCriterion("DATEPICKER_DATA_FROM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueIsNotNull() {
            addCriterion("DATEPICKER_DATA_FROM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueEqualTo(String value) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE =", value, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueNotEqualTo(String value) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE <>", value, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueGreaterThan(String value) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE >", value, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE >=", value, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueLessThan(String value) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE <", value, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE <=", value, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueLike(String value) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE like", value, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueNotLike(String value) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE not like", value, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueIn(List<String> values) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE in", values, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueNotIn(List<String> values) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE not in", values, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueBetween(String value1, String value2) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE between", value1, value2, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerDataFromValueNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_DATA_FROM_VALUE not between", value1, value2, "datepickerDataFromValue");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatIsNull() {
            addCriterion("DATEPICKER_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatIsNotNull() {
            addCriterion("DATEPICKER_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatEqualTo(String value) {
            addCriterion("DATEPICKER_FORMAT =", value, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatNotEqualTo(String value) {
            addCriterion("DATEPICKER_FORMAT <>", value, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatGreaterThan(String value) {
            addCriterion("DATEPICKER_FORMAT >", value, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_FORMAT >=", value, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatLessThan(String value) {
            addCriterion("DATEPICKER_FORMAT <", value, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_FORMAT <=", value, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatLike(String value) {
            addCriterion("DATEPICKER_FORMAT like", value, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatNotLike(String value) {
            addCriterion("DATEPICKER_FORMAT not like", value, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatIn(List<String> values) {
            addCriterion("DATEPICKER_FORMAT in", values, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatNotIn(List<String> values) {
            addCriterion("DATEPICKER_FORMAT not in", values, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatBetween(String value1, String value2) {
            addCriterion("DATEPICKER_FORMAT between", value1, value2, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerFormatNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_FORMAT not between", value1, value2, "datepickerFormat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatIsNull() {
            addCriterion("DATEPICKER_TIMEFORMAT is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatIsNotNull() {
            addCriterion("DATEPICKER_TIMEFORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatEqualTo(String value) {
            addCriterion("DATEPICKER_TIMEFORMAT =", value, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatNotEqualTo(String value) {
            addCriterion("DATEPICKER_TIMEFORMAT <>", value, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatGreaterThan(String value) {
            addCriterion("DATEPICKER_TIMEFORMAT >", value, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_TIMEFORMAT >=", value, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatLessThan(String value) {
            addCriterion("DATEPICKER_TIMEFORMAT <", value, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_TIMEFORMAT <=", value, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatLike(String value) {
            addCriterion("DATEPICKER_TIMEFORMAT like", value, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatNotLike(String value) {
            addCriterion("DATEPICKER_TIMEFORMAT not like", value, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatIn(List<String> values) {
            addCriterion("DATEPICKER_TIMEFORMAT in", values, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatNotIn(List<String> values) {
            addCriterion("DATEPICKER_TIMEFORMAT not in", values, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatBetween(String value1, String value2) {
            addCriterion("DATEPICKER_TIMEFORMAT between", value1, value2, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerTimeformatNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_TIMEFORMAT not between", value1, value2, "datepickerTimeformat");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeIsNull() {
            addCriterion("DATEPICKER_SHOWTIME is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeIsNotNull() {
            addCriterion("DATEPICKER_SHOWTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWTIME =", value, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeNotEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWTIME <>", value, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeGreaterThan(String value) {
            addCriterion("DATEPICKER_SHOWTIME >", value, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWTIME >=", value, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeLessThan(String value) {
            addCriterion("DATEPICKER_SHOWTIME <", value, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWTIME <=", value, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeLike(String value) {
            addCriterion("DATEPICKER_SHOWTIME like", value, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeNotLike(String value) {
            addCriterion("DATEPICKER_SHOWTIME not like", value, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeIn(List<String> values) {
            addCriterion("DATEPICKER_SHOWTIME in", values, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeNotIn(List<String> values) {
            addCriterion("DATEPICKER_SHOWTIME not in", values, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeBetween(String value1, String value2) {
            addCriterion("DATEPICKER_SHOWTIME between", value1, value2, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtimeNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_SHOWTIME not between", value1, value2, "datepickerShowtime");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonIsNull() {
            addCriterion("DATEPICKER_SHOWOKBUTTON is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonIsNotNull() {
            addCriterion("DATEPICKER_SHOWOKBUTTON is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWOKBUTTON =", value, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonNotEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWOKBUTTON <>", value, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonGreaterThan(String value) {
            addCriterion("DATEPICKER_SHOWOKBUTTON >", value, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWOKBUTTON >=", value, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonLessThan(String value) {
            addCriterion("DATEPICKER_SHOWOKBUTTON <", value, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWOKBUTTON <=", value, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonLike(String value) {
            addCriterion("DATEPICKER_SHOWOKBUTTON like", value, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonNotLike(String value) {
            addCriterion("DATEPICKER_SHOWOKBUTTON not like", value, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonIn(List<String> values) {
            addCriterion("DATEPICKER_SHOWOKBUTTON in", values, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonNotIn(List<String> values) {
            addCriterion("DATEPICKER_SHOWOKBUTTON not in", values, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonBetween(String value1, String value2) {
            addCriterion("DATEPICKER_SHOWOKBUTTON between", value1, value2, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowokbuttonNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_SHOWOKBUTTON not between", value1, value2, "datepickerShowokbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonIsNull() {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonIsNotNull() {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON =", value, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonNotEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON <>", value, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonGreaterThan(String value) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON >", value, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON >=", value, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonLessThan(String value) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON <", value, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON <=", value, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonLike(String value) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON like", value, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonNotLike(String value) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON not like", value, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonIn(List<String> values) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON in", values, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonNotIn(List<String> values) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON not in", values, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonBetween(String value1, String value2) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON between", value1, value2, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowclearbuttonNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_SHOWCLEARBUTTON not between", value1, value2, "datepickerShowclearbutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputIsNull() {
            addCriterion("DATEPICKER_ALLOWINPUT is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputIsNotNull() {
            addCriterion("DATEPICKER_ALLOWINPUT is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputEqualTo(String value) {
            addCriterion("DATEPICKER_ALLOWINPUT =", value, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputNotEqualTo(String value) {
            addCriterion("DATEPICKER_ALLOWINPUT <>", value, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputGreaterThan(String value) {
            addCriterion("DATEPICKER_ALLOWINPUT >", value, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_ALLOWINPUT >=", value, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputLessThan(String value) {
            addCriterion("DATEPICKER_ALLOWINPUT <", value, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_ALLOWINPUT <=", value, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputLike(String value) {
            addCriterion("DATEPICKER_ALLOWINPUT like", value, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputNotLike(String value) {
            addCriterion("DATEPICKER_ALLOWINPUT not like", value, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputIn(List<String> values) {
            addCriterion("DATEPICKER_ALLOWINPUT in", values, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputNotIn(List<String> values) {
            addCriterion("DATEPICKER_ALLOWINPUT not in", values, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputBetween(String value1, String value2) {
            addCriterion("DATEPICKER_ALLOWINPUT between", value1, value2, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerAllowinputNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_ALLOWINPUT not between", value1, value2, "datepickerAllowinput");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonIsNull() {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonIsNotNull() {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON =", value, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonNotEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON <>", value, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonGreaterThan(String value) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON >", value, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON >=", value, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonLessThan(String value) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON <", value, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON <=", value, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonLike(String value) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON like", value, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonNotLike(String value) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON not like", value, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonIn(List<String> values) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON in", values, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonNotIn(List<String> values) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON not in", values, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonBetween(String value1, String value2) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON between", value1, value2, "datepickerShowtodaybutton");
            return (Criteria) this;
        }

        public Criteria andDatepickerShowtodaybuttonNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_SHOWTODAYBUTTON not between", value1, value2, "datepickerShowtodaybutton");
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

        public Criteria andDatepickerDrawdateFunIsNull() {
            addCriterion("DATEPICKER_DRAWDATE_FUN is null");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunIsNotNull() {
            addCriterion("DATEPICKER_DRAWDATE_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunEqualTo(String value) {
            addCriterion("DATEPICKER_DRAWDATE_FUN =", value, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunNotEqualTo(String value) {
            addCriterion("DATEPICKER_DRAWDATE_FUN <>", value, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunGreaterThan(String value) {
            addCriterion("DATEPICKER_DRAWDATE_FUN >", value, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunGreaterThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_DRAWDATE_FUN >=", value, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunLessThan(String value) {
            addCriterion("DATEPICKER_DRAWDATE_FUN <", value, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunLessThanOrEqualTo(String value) {
            addCriterion("DATEPICKER_DRAWDATE_FUN <=", value, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunLike(String value) {
            addCriterion("DATEPICKER_DRAWDATE_FUN like", value, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunNotLike(String value) {
            addCriterion("DATEPICKER_DRAWDATE_FUN not like", value, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunIn(List<String> values) {
            addCriterion("DATEPICKER_DRAWDATE_FUN in", values, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunNotIn(List<String> values) {
            addCriterion("DATEPICKER_DRAWDATE_FUN not in", values, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunBetween(String value1, String value2) {
            addCriterion("DATEPICKER_DRAWDATE_FUN between", value1, value2, "datepickerDrawdateFun");
            return (Criteria) this;
        }

        public Criteria andDatepickerDrawdateFunNotBetween(String value1, String value2) {
            addCriterion("DATEPICKER_DRAWDATE_FUN not between", value1, value2, "datepickerDrawdateFun");
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