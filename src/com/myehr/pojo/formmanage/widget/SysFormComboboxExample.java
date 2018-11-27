package com.myehr.pojo.formmanage.widget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormComboboxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormComboboxExample() {
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

        public Criteria andComboboxIdIsNull() {
            addCriterion("COMBOBOX_ID is null");
            return (Criteria) this;
        }

        public Criteria andComboboxIdIsNotNull() {
            addCriterion("COMBOBOX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxIdEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_ID =", value, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdNotEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_ID <>", value, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdGreaterThan(BigDecimal value) {
            addCriterion("COMBOBOX_ID >", value, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_ID >=", value, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdLessThan(BigDecimal value) {
            addCriterion("COMBOBOX_ID <", value, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_ID <=", value, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdIn(List<BigDecimal> values) {
            addCriterion("COMBOBOX_ID in", values, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdNotIn(List<BigDecimal> values) {
            addCriterion("COMBOBOX_ID not in", values, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMBOBOX_ID between", value1, value2, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMBOBOX_ID not between", value1, value2, "comboboxId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdIsNull() {
            addCriterion("COMBOBOX_FORM_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdIsNotNull() {
            addCriterion("COMBOBOX_FORM_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID =", value, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID <>", value, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdGreaterThan(BigDecimal value) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID >", value, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID >=", value, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdLessThan(BigDecimal value) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID <", value, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID <=", value, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdIn(List<BigDecimal> values) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID in", values, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID not in", values, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID between", value1, value2, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxFormColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMBOBOX_FORM_COLUMN_ID not between", value1, value2, "comboboxFormColumnId");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeIsNull() {
            addCriterion("COMBOBOX_CHECK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeIsNotNull() {
            addCriterion("COMBOBOX_CHECK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeEqualTo(String value) {
            addCriterion("COMBOBOX_CHECK_TYPE =", value, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeNotEqualTo(String value) {
            addCriterion("COMBOBOX_CHECK_TYPE <>", value, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeGreaterThan(String value) {
            addCriterion("COMBOBOX_CHECK_TYPE >", value, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_CHECK_TYPE >=", value, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeLessThan(String value) {
            addCriterion("COMBOBOX_CHECK_TYPE <", value, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_CHECK_TYPE <=", value, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeLike(String value) {
            addCriterion("COMBOBOX_CHECK_TYPE like", value, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeNotLike(String value) {
            addCriterion("COMBOBOX_CHECK_TYPE not like", value, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeIn(List<String> values) {
            addCriterion("COMBOBOX_CHECK_TYPE in", values, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeNotIn(List<String> values) {
            addCriterion("COMBOBOX_CHECK_TYPE not in", values, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeBetween(String value1, String value2) {
            addCriterion("COMBOBOX_CHECK_TYPE between", value1, value2, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckTypeNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_CHECK_TYPE not between", value1, value2, "comboboxCheckType");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfIsNull() {
            addCriterion("COMBOBOX_CHECK_SELF is null");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfIsNotNull() {
            addCriterion("COMBOBOX_CHECK_SELF is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfEqualTo(String value) {
            addCriterion("COMBOBOX_CHECK_SELF =", value, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfNotEqualTo(String value) {
            addCriterion("COMBOBOX_CHECK_SELF <>", value, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfGreaterThan(String value) {
            addCriterion("COMBOBOX_CHECK_SELF >", value, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_CHECK_SELF >=", value, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfLessThan(String value) {
            addCriterion("COMBOBOX_CHECK_SELF <", value, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_CHECK_SELF <=", value, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfLike(String value) {
            addCriterion("COMBOBOX_CHECK_SELF like", value, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfNotLike(String value) {
            addCriterion("COMBOBOX_CHECK_SELF not like", value, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfIn(List<String> values) {
            addCriterion("COMBOBOX_CHECK_SELF in", values, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfNotIn(List<String> values) {
            addCriterion("COMBOBOX_CHECK_SELF not in", values, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfBetween(String value1, String value2) {
            addCriterion("COMBOBOX_CHECK_SELF between", value1, value2, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxCheckSelfNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_CHECK_SELF not between", value1, value2, "comboboxCheckSelf");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunIsNull() {
            addCriterion("COMBOBOXCHECK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunIsNotNull() {
            addCriterion("COMBOBOXCHECK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunEqualTo(String value) {
            addCriterion("COMBOBOXCHECK_FUN =", value, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunNotEqualTo(String value) {
            addCriterion("COMBOBOXCHECK_FUN <>", value, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunGreaterThan(String value) {
            addCriterion("COMBOBOXCHECK_FUN >", value, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOXCHECK_FUN >=", value, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunLessThan(String value) {
            addCriterion("COMBOBOXCHECK_FUN <", value, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOXCHECK_FUN <=", value, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunLike(String value) {
            addCriterion("COMBOBOXCHECK_FUN like", value, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunNotLike(String value) {
            addCriterion("COMBOBOXCHECK_FUN not like", value, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunIn(List<String> values) {
            addCriterion("COMBOBOXCHECK_FUN in", values, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunNotIn(List<String> values) {
            addCriterion("COMBOBOXCHECK_FUN not in", values, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunBetween(String value1, String value2) {
            addCriterion("COMBOBOXCHECK_FUN between", value1, value2, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxcheckFunNotBetween(String value1, String value2) {
            addCriterion("COMBOBOXCHECK_FUN not between", value1, value2, "comboboxcheckFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunIsNull() {
            addCriterion("COMBOBOX_INIT_FUN is null");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunIsNotNull() {
            addCriterion("COMBOBOX_INIT_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunEqualTo(String value) {
            addCriterion("COMBOBOX_INIT_FUN =", value, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunNotEqualTo(String value) {
            addCriterion("COMBOBOX_INIT_FUN <>", value, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunGreaterThan(String value) {
            addCriterion("COMBOBOX_INIT_FUN >", value, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_INIT_FUN >=", value, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunLessThan(String value) {
            addCriterion("COMBOBOX_INIT_FUN <", value, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_INIT_FUN <=", value, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunLike(String value) {
            addCriterion("COMBOBOX_INIT_FUN like", value, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunNotLike(String value) {
            addCriterion("COMBOBOX_INIT_FUN not like", value, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunIn(List<String> values) {
            addCriterion("COMBOBOX_INIT_FUN in", values, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunNotIn(List<String> values) {
            addCriterion("COMBOBOX_INIT_FUN not in", values, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunBetween(String value1, String value2) {
            addCriterion("COMBOBOX_INIT_FUN between", value1, value2, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxInitFunNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_INIT_FUN not between", value1, value2, "comboboxInitFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunIsNull() {
            addCriterion("COMBOBOX_VALUECHANGE_FUN is null");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunIsNotNull() {
            addCriterion("COMBOBOX_VALUECHANGE_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunEqualTo(String value) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN =", value, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunNotEqualTo(String value) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN <>", value, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunGreaterThan(String value) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN >", value, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN >=", value, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunLessThan(String value) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN <", value, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN <=", value, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunLike(String value) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN like", value, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunNotLike(String value) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN not like", value, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunIn(List<String> values) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN in", values, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunNotIn(List<String> values) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN not in", values, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunBetween(String value1, String value2) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN between", value1, value2, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxValuechangeFunNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_VALUECHANGE_FUN not between", value1, value2, "comboboxValuechangeFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunIsNull() {
            addCriterion("COMBOBOX_CLICK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunIsNotNull() {
            addCriterion("COMBOBOX_CLICK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunEqualTo(String value) {
            addCriterion("COMBOBOX_CLICK_FUN =", value, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunNotEqualTo(String value) {
            addCriterion("COMBOBOX_CLICK_FUN <>", value, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunGreaterThan(String value) {
            addCriterion("COMBOBOX_CLICK_FUN >", value, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_CLICK_FUN >=", value, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunLessThan(String value) {
            addCriterion("COMBOBOX_CLICK_FUN <", value, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_CLICK_FUN <=", value, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunLike(String value) {
            addCriterion("COMBOBOX_CLICK_FUN like", value, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunNotLike(String value) {
            addCriterion("COMBOBOX_CLICK_FUN not like", value, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunIn(List<String> values) {
            addCriterion("COMBOBOX_CLICK_FUN in", values, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunNotIn(List<String> values) {
            addCriterion("COMBOBOX_CLICK_FUN not in", values, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunBetween(String value1, String value2) {
            addCriterion("COMBOBOX_CLICK_FUN between", value1, value2, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxClickFunNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_CLICK_FUN not between", value1, value2, "comboboxClickFun");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeIsNull() {
            addCriterion("COMBOBOX_DATA_FROM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeIsNotNull() {
            addCriterion("COMBOBOX_DATA_FROM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeEqualTo(String value) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE =", value, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeNotEqualTo(String value) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE <>", value, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeGreaterThan(String value) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE >", value, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE >=", value, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeLessThan(String value) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE <", value, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE <=", value, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeLike(String value) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE like", value, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeNotLike(String value) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE not like", value, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeIn(List<String> values) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE in", values, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeNotIn(List<String> values) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE not in", values, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE between", value1, value2, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromTypeNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DATA_FROM_TYPE not between", value1, value2, "comboboxDataFromType");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueIsNull() {
            addCriterion("COMBOBOX_DATA_FROM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueIsNotNull() {
            addCriterion("COMBOBOX_DATA_FROM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueEqualTo(String value) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE =", value, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueNotEqualTo(String value) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE <>", value, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueGreaterThan(String value) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE >", value, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE >=", value, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueLessThan(String value) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE <", value, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE <=", value, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueLike(String value) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE like", value, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueNotLike(String value) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE not like", value, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueIn(List<String> values) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE in", values, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueNotIn(List<String> values) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE not in", values, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE between", value1, value2, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxDataFromValueNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DATA_FROM_VALUE not between", value1, value2, "comboboxDataFromValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeIsNull() {
            addCriterion("COMBOBOX_GUI_INIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeIsNotNull() {
            addCriterion("COMBOBOX_GUI_INIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeEqualTo(String value) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE =", value, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeNotEqualTo(String value) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE <>", value, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeGreaterThan(String value) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE >", value, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE >=", value, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeLessThan(String value) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE <", value, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE <=", value, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeLike(String value) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE like", value, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeNotLike(String value) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE not like", value, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeIn(List<String> values) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE in", values, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeNotIn(List<String> values) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE not in", values, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeBetween(String value1, String value2) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE between", value1, value2, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitTypeNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_GUI_INIT_TYPE not between", value1, value2, "comboboxGuiInitType");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueIsNull() {
            addCriterion("COMBOBOX_GUI_INIT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueIsNotNull() {
            addCriterion("COMBOBOX_GUI_INIT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueEqualTo(String value) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE =", value, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueNotEqualTo(String value) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE <>", value, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueGreaterThan(String value) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE >", value, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE >=", value, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueLessThan(String value) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE <", value, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE <=", value, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueLike(String value) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE like", value, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueNotLike(String value) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE not like", value, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueIn(List<String> values) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE in", values, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueNotIn(List<String> values) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE not in", values, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueBetween(String value1, String value2) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE between", value1, value2, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitValueNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_GUI_INIT_VALUE not between", value1, value2, "comboboxGuiInitValue");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldIsNull() {
            addCriterion("COMBOBOX_TEXTFIELD is null");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldIsNotNull() {
            addCriterion("COMBOBOX_TEXTFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldEqualTo(String value) {
            addCriterion("COMBOBOX_TEXTFIELD =", value, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldNotEqualTo(String value) {
            addCriterion("COMBOBOX_TEXTFIELD <>", value, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldGreaterThan(String value) {
            addCriterion("COMBOBOX_TEXTFIELD >", value, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_TEXTFIELD >=", value, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldLessThan(String value) {
            addCriterion("COMBOBOX_TEXTFIELD <", value, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_TEXTFIELD <=", value, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldLike(String value) {
            addCriterion("COMBOBOX_TEXTFIELD like", value, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldNotLike(String value) {
            addCriterion("COMBOBOX_TEXTFIELD not like", value, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldIn(List<String> values) {
            addCriterion("COMBOBOX_TEXTFIELD in", values, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldNotIn(List<String> values) {
            addCriterion("COMBOBOX_TEXTFIELD not in", values, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldBetween(String value1, String value2) {
            addCriterion("COMBOBOX_TEXTFIELD between", value1, value2, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxTextfieldNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_TEXTFIELD not between", value1, value2, "comboboxTextfield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldIsNull() {
            addCriterion("COMBOBOX_VALUEFIELD is null");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldIsNotNull() {
            addCriterion("COMBOBOX_VALUEFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldEqualTo(String value) {
            addCriterion("COMBOBOX_VALUEFIELD =", value, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldNotEqualTo(String value) {
            addCriterion("COMBOBOX_VALUEFIELD <>", value, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldGreaterThan(String value) {
            addCriterion("COMBOBOX_VALUEFIELD >", value, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_VALUEFIELD >=", value, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldLessThan(String value) {
            addCriterion("COMBOBOX_VALUEFIELD <", value, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_VALUEFIELD <=", value, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldLike(String value) {
            addCriterion("COMBOBOX_VALUEFIELD like", value, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldNotLike(String value) {
            addCriterion("COMBOBOX_VALUEFIELD not like", value, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldIn(List<String> values) {
            addCriterion("COMBOBOX_VALUEFIELD in", values, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldNotIn(List<String> values) {
            addCriterion("COMBOBOX_VALUEFIELD not in", values, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldBetween(String value1, String value2) {
            addCriterion("COMBOBOX_VALUEFIELD between", value1, value2, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxValuefieldNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_VALUEFIELD not between", value1, value2, "comboboxValuefield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldIsNull() {
            addCriterion("COMBOBOX_DATAFIELD is null");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldIsNotNull() {
            addCriterion("COMBOBOX_DATAFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldEqualTo(String value) {
            addCriterion("COMBOBOX_DATAFIELD =", value, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldNotEqualTo(String value) {
            addCriterion("COMBOBOX_DATAFIELD <>", value, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldGreaterThan(String value) {
            addCriterion("COMBOBOX_DATAFIELD >", value, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DATAFIELD >=", value, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldLessThan(String value) {
            addCriterion("COMBOBOX_DATAFIELD <", value, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DATAFIELD <=", value, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldLike(String value) {
            addCriterion("COMBOBOX_DATAFIELD like", value, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldNotLike(String value) {
            addCriterion("COMBOBOX_DATAFIELD not like", value, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldIn(List<String> values) {
            addCriterion("COMBOBOX_DATAFIELD in", values, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldNotIn(List<String> values) {
            addCriterion("COMBOBOX_DATAFIELD not in", values, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DATAFIELD between", value1, value2, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxDatafieldNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DATAFIELD not between", value1, value2, "comboboxDatafield");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextIsNull() {
            addCriterion("COMBOBOX_EMPTYTEXT is null");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextIsNotNull() {
            addCriterion("COMBOBOX_EMPTYTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextEqualTo(String value) {
            addCriterion("COMBOBOX_EMPTYTEXT =", value, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextNotEqualTo(String value) {
            addCriterion("COMBOBOX_EMPTYTEXT <>", value, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextGreaterThan(String value) {
            addCriterion("COMBOBOX_EMPTYTEXT >", value, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_EMPTYTEXT >=", value, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextLessThan(String value) {
            addCriterion("COMBOBOX_EMPTYTEXT <", value, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_EMPTYTEXT <=", value, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextLike(String value) {
            addCriterion("COMBOBOX_EMPTYTEXT like", value, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextNotLike(String value) {
            addCriterion("COMBOBOX_EMPTYTEXT not like", value, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextIn(List<String> values) {
            addCriterion("COMBOBOX_EMPTYTEXT in", values, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextNotIn(List<String> values) {
            addCriterion("COMBOBOX_EMPTYTEXT not in", values, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextBetween(String value1, String value2) {
            addCriterion("COMBOBOX_EMPTYTEXT between", value1, value2, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxEmptytextNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_EMPTYTEXT not between", value1, value2, "comboboxEmptytext");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputIsNull() {
            addCriterion("COMBOBOX_ALLOWINPUT is null");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputIsNotNull() {
            addCriterion("COMBOBOX_ALLOWINPUT is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputEqualTo(String value) {
            addCriterion("COMBOBOX_ALLOWINPUT =", value, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputNotEqualTo(String value) {
            addCriterion("COMBOBOX_ALLOWINPUT <>", value, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputGreaterThan(String value) {
            addCriterion("COMBOBOX_ALLOWINPUT >", value, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_ALLOWINPUT >=", value, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputLessThan(String value) {
            addCriterion("COMBOBOX_ALLOWINPUT <", value, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_ALLOWINPUT <=", value, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputLike(String value) {
            addCriterion("COMBOBOX_ALLOWINPUT like", value, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputNotLike(String value) {
            addCriterion("COMBOBOX_ALLOWINPUT not like", value, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputIn(List<String> values) {
            addCriterion("COMBOBOX_ALLOWINPUT in", values, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputNotIn(List<String> values) {
            addCriterion("COMBOBOX_ALLOWINPUT not in", values, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputBetween(String value1, String value2) {
            addCriterion("COMBOBOX_ALLOWINPUT between", value1, value2, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxAllowinputNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_ALLOWINPUT not between", value1, value2, "comboboxAllowinput");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectIsNull() {
            addCriterion("COMBOBOX_MULTISELECT is null");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectIsNotNull() {
            addCriterion("COMBOBOX_MULTISELECT is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectEqualTo(String value) {
            addCriterion("COMBOBOX_MULTISELECT =", value, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectNotEqualTo(String value) {
            addCriterion("COMBOBOX_MULTISELECT <>", value, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectGreaterThan(String value) {
            addCriterion("COMBOBOX_MULTISELECT >", value, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_MULTISELECT >=", value, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectLessThan(String value) {
            addCriterion("COMBOBOX_MULTISELECT <", value, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_MULTISELECT <=", value, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectLike(String value) {
            addCriterion("COMBOBOX_MULTISELECT like", value, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectNotLike(String value) {
            addCriterion("COMBOBOX_MULTISELECT not like", value, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectIn(List<String> values) {
            addCriterion("COMBOBOX_MULTISELECT in", values, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectNotIn(List<String> values) {
            addCriterion("COMBOBOX_MULTISELECT not in", values, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectBetween(String value1, String value2) {
            addCriterion("COMBOBOX_MULTISELECT between", value1, value2, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxMultiselectNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_MULTISELECT not between", value1, value2, "comboboxMultiselect");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemIsNull() {
            addCriterion("COMBOBOX_SHOWNULLITEM is null");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemIsNotNull() {
            addCriterion("COMBOBOX_SHOWNULLITEM is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemEqualTo(String value) {
            addCriterion("COMBOBOX_SHOWNULLITEM =", value, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemNotEqualTo(String value) {
            addCriterion("COMBOBOX_SHOWNULLITEM <>", value, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemGreaterThan(String value) {
            addCriterion("COMBOBOX_SHOWNULLITEM >", value, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_SHOWNULLITEM >=", value, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemLessThan(String value) {
            addCriterion("COMBOBOX_SHOWNULLITEM <", value, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_SHOWNULLITEM <=", value, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemLike(String value) {
            addCriterion("COMBOBOX_SHOWNULLITEM like", value, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemNotLike(String value) {
            addCriterion("COMBOBOX_SHOWNULLITEM not like", value, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemIn(List<String> values) {
            addCriterion("COMBOBOX_SHOWNULLITEM in", values, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemNotIn(List<String> values) {
            addCriterion("COMBOBOX_SHOWNULLITEM not in", values, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemBetween(String value1, String value2) {
            addCriterion("COMBOBOX_SHOWNULLITEM between", value1, value2, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxShownullitemNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_SHOWNULLITEM not between", value1, value2, "comboboxShownullitem");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextIsNull() {
            addCriterion("COMBOBOX_NULLITEMTEXT is null");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextIsNotNull() {
            addCriterion("COMBOBOX_NULLITEMTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextEqualTo(String value) {
            addCriterion("COMBOBOX_NULLITEMTEXT =", value, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextNotEqualTo(String value) {
            addCriterion("COMBOBOX_NULLITEMTEXT <>", value, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextGreaterThan(String value) {
            addCriterion("COMBOBOX_NULLITEMTEXT >", value, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_NULLITEMTEXT >=", value, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextLessThan(String value) {
            addCriterion("COMBOBOX_NULLITEMTEXT <", value, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_NULLITEMTEXT <=", value, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextLike(String value) {
            addCriterion("COMBOBOX_NULLITEMTEXT like", value, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextNotLike(String value) {
            addCriterion("COMBOBOX_NULLITEMTEXT not like", value, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextIn(List<String> values) {
            addCriterion("COMBOBOX_NULLITEMTEXT in", values, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextNotIn(List<String> values) {
            addCriterion("COMBOBOX_NULLITEMTEXT not in", values, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextBetween(String value1, String value2) {
            addCriterion("COMBOBOX_NULLITEMTEXT between", value1, value2, "comboboxNullitemtext");
            return (Criteria) this;
        }

        public Criteria andComboboxNullitemtextNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_NULLITEMTEXT not between", value1, value2, "comboboxNullitemtext");
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

        public Criteria andComboboxGuiInitExcsqlIdIsNull() {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID is null");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdIsNotNull() {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID =", value, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdNotEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID <>", value, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdGreaterThan(BigDecimal value) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID >", value, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID >=", value, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdLessThan(BigDecimal value) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID <", value, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID <=", value, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdIn(List<BigDecimal> values) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID in", values, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdNotIn(List<BigDecimal> values) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID not in", values, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID between", value1, value2, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxGuiInitExcsqlIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMBOBOX_GUI_INIT_EXCSQL_ID not between", value1, value2, "comboboxGuiInitExcsqlId");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextIsNull() {
            addCriterion("COMBOBOX_ISTEXT is null");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextIsNotNull() {
            addCriterion("COMBOBOX_ISTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextEqualTo(String value) {
            addCriterion("COMBOBOX_ISTEXT =", value, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextNotEqualTo(String value) {
            addCriterion("COMBOBOX_ISTEXT <>", value, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextGreaterThan(String value) {
            addCriterion("COMBOBOX_ISTEXT >", value, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_ISTEXT >=", value, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextLessThan(String value) {
            addCriterion("COMBOBOX_ISTEXT <", value, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_ISTEXT <=", value, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextLike(String value) {
            addCriterion("COMBOBOX_ISTEXT like", value, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextNotLike(String value) {
            addCriterion("COMBOBOX_ISTEXT not like", value, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextIn(List<String> values) {
            addCriterion("COMBOBOX_ISTEXT in", values, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextNotIn(List<String> values) {
            addCriterion("COMBOBOX_ISTEXT not in", values, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextBetween(String value1, String value2) {
            addCriterion("COMBOBOX_ISTEXT between", value1, value2, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIstextNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_ISTEXT not between", value1, value2, "comboboxIstext");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchIsNull() {
            addCriterion("combobox_is_search is null");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchIsNotNull() {
            addCriterion("combobox_is_search is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchEqualTo(String value) {
            addCriterion("combobox_is_search =", value, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchNotEqualTo(String value) {
            addCriterion("combobox_is_search <>", value, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchGreaterThan(String value) {
            addCriterion("combobox_is_search >", value, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchGreaterThanOrEqualTo(String value) {
            addCriterion("combobox_is_search >=", value, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchLessThan(String value) {
            addCriterion("combobox_is_search <", value, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchLessThanOrEqualTo(String value) {
            addCriterion("combobox_is_search <=", value, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchLike(String value) {
            addCriterion("combobox_is_search like", value, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchNotLike(String value) {
            addCriterion("combobox_is_search not like", value, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchIn(List<String> values) {
            addCriterion("combobox_is_search in", values, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchNotIn(List<String> values) {
            addCriterion("combobox_is_search not in", values, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchBetween(String value1, String value2) {
            addCriterion("combobox_is_search between", value1, value2, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxIsSearchNotBetween(String value1, String value2) {
            addCriterion("combobox_is_search not between", value1, value2, "comboboxIsSearch");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlIsNull() {
            addCriterion("COMBOBOX_DICT_SQL is null");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlIsNotNull() {
            addCriterion("COMBOBOX_DICT_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlEqualTo(String value) {
            addCriterion("COMBOBOX_DICT_SQL =", value, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlNotEqualTo(String value) {
            addCriterion("COMBOBOX_DICT_SQL <>", value, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlGreaterThan(String value) {
            addCriterion("COMBOBOX_DICT_SQL >", value, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DICT_SQL >=", value, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlLessThan(String value) {
            addCriterion("COMBOBOX_DICT_SQL <", value, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DICT_SQL <=", value, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlLike(String value) {
            addCriterion("COMBOBOX_DICT_SQL like", value, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlNotLike(String value) {
            addCriterion("COMBOBOX_DICT_SQL not like", value, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlIn(List<String> values) {
            addCriterion("COMBOBOX_DICT_SQL in", values, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlNotIn(List<String> values) {
            addCriterion("COMBOBOX_DICT_SQL not in", values, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DICT_SQL between", value1, value2, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxDictSqlNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DICT_SQL not between", value1, value2, "comboboxDictSql");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldIsNull() {
            addCriterion("COMBOBOX_ISFIELD is null");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldIsNotNull() {
            addCriterion("COMBOBOX_ISFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldEqualTo(String value) {
            addCriterion("COMBOBOX_ISFIELD =", value, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldNotEqualTo(String value) {
            addCriterion("COMBOBOX_ISFIELD <>", value, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldGreaterThan(String value) {
            addCriterion("COMBOBOX_ISFIELD >", value, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_ISFIELD >=", value, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldLessThan(String value) {
            addCriterion("COMBOBOX_ISFIELD <", value, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_ISFIELD <=", value, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldLike(String value) {
            addCriterion("COMBOBOX_ISFIELD like", value, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldNotLike(String value) {
            addCriterion("COMBOBOX_ISFIELD not like", value, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldIn(List<String> values) {
            addCriterion("COMBOBOX_ISFIELD in", values, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldNotIn(List<String> values) {
            addCriterion("COMBOBOX_ISFIELD not in", values, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldBetween(String value1, String value2) {
            addCriterion("COMBOBOX_ISFIELD between", value1, value2, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxIsfieldNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_ISFIELD not between", value1, value2, "comboboxIsfield");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnIsNull() {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN is null");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnIsNotNull() {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN is not null");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnEqualTo(String value) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN =", value, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnNotEqualTo(String value) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN <>", value, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnGreaterThan(String value) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN >", value, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnGreaterThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN >=", value, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnLessThan(String value) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN <", value, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnLessThanOrEqualTo(String value) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN <=", value, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnLike(String value) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN like", value, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnNotLike(String value) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN not like", value, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnIn(List<String> values) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN in", values, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnNotIn(List<String> values) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN not in", values, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN between", value1, value2, "comboboxDictNameColumn");
            return (Criteria) this;
        }

        public Criteria andComboboxDictNameColumnNotBetween(String value1, String value2) {
            addCriterion("COMBOBOX_DICT_NAME_COLUMN not between", value1, value2, "comboboxDictNameColumn");
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