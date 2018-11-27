package com.myehr.pojo.formmanage.widget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormRichtextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormRichtextExample() {
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

        public Criteria andRichtextIdIsNull() {
            addCriterion("RICHTEXT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRichtextIdIsNotNull() {
            addCriterion("RICHTEXT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextIdEqualTo(BigDecimal value) {
            addCriterion("RICHTEXT_ID =", value, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdNotEqualTo(BigDecimal value) {
            addCriterion("RICHTEXT_ID <>", value, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdGreaterThan(BigDecimal value) {
            addCriterion("RICHTEXT_ID >", value, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHTEXT_ID >=", value, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdLessThan(BigDecimal value) {
            addCriterion("RICHTEXT_ID <", value, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHTEXT_ID <=", value, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdIn(List<BigDecimal> values) {
            addCriterion("RICHTEXT_ID in", values, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdNotIn(List<BigDecimal> values) {
            addCriterion("RICHTEXT_ID not in", values, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHTEXT_ID between", value1, value2, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHTEXT_ID not between", value1, value2, "richtextId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdIsNull() {
            addCriterion("RICHTEXT_FORM_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdIsNotNull() {
            addCriterion("RICHTEXT_FORM_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdEqualTo(BigDecimal value) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID =", value, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID <>", value, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdGreaterThan(BigDecimal value) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID >", value, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID >=", value, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdLessThan(BigDecimal value) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID <", value, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID <=", value, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdIn(List<BigDecimal> values) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID in", values, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID not in", values, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID between", value1, value2, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextFormColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RICHTEXT_FORM_COLUMN_ID not between", value1, value2, "richtextFormColumnId");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunIsNull() {
            addCriterion("RICHTEXT_CHECK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunIsNotNull() {
            addCriterion("RICHTEXT_CHECK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_FUN =", value, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunNotEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_FUN <>", value, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunGreaterThan(String value) {
            addCriterion("RICHTEXT_CHECK_FUN >", value, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunGreaterThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_FUN >=", value, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunLessThan(String value) {
            addCriterion("RICHTEXT_CHECK_FUN <", value, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunLessThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_FUN <=", value, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunLike(String value) {
            addCriterion("RICHTEXT_CHECK_FUN like", value, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunNotLike(String value) {
            addCriterion("RICHTEXT_CHECK_FUN not like", value, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunIn(List<String> values) {
            addCriterion("RICHTEXT_CHECK_FUN in", values, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunNotIn(List<String> values) {
            addCriterion("RICHTEXT_CHECK_FUN not in", values, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunBetween(String value1, String value2) {
            addCriterion("RICHTEXT_CHECK_FUN between", value1, value2, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckFunNotBetween(String value1, String value2) {
            addCriterion("RICHTEXT_CHECK_FUN not between", value1, value2, "richtextCheckFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunIsNull() {
            addCriterion("RICHTEXT_INIT_FUN is null");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunIsNotNull() {
            addCriterion("RICHTEXT_INIT_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunEqualTo(String value) {
            addCriterion("RICHTEXT_INIT_FUN =", value, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunNotEqualTo(String value) {
            addCriterion("RICHTEXT_INIT_FUN <>", value, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunGreaterThan(String value) {
            addCriterion("RICHTEXT_INIT_FUN >", value, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunGreaterThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_INIT_FUN >=", value, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunLessThan(String value) {
            addCriterion("RICHTEXT_INIT_FUN <", value, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunLessThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_INIT_FUN <=", value, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunLike(String value) {
            addCriterion("RICHTEXT_INIT_FUN like", value, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunNotLike(String value) {
            addCriterion("RICHTEXT_INIT_FUN not like", value, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunIn(List<String> values) {
            addCriterion("RICHTEXT_INIT_FUN in", values, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunNotIn(List<String> values) {
            addCriterion("RICHTEXT_INIT_FUN not in", values, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunBetween(String value1, String value2) {
            addCriterion("RICHTEXT_INIT_FUN between", value1, value2, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextInitFunNotBetween(String value1, String value2) {
            addCriterion("RICHTEXT_INIT_FUN not between", value1, value2, "richtextInitFun");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeIsNull() {
            addCriterion("RICHTEXT_DATA_FROM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeIsNotNull() {
            addCriterion("RICHTEXT_DATA_FROM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeEqualTo(String value) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE =", value, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeNotEqualTo(String value) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE <>", value, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeGreaterThan(String value) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE >", value, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE >=", value, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeLessThan(String value) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE <", value, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeLessThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE <=", value, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeLike(String value) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE like", value, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeNotLike(String value) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE not like", value, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeIn(List<String> values) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE in", values, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeNotIn(List<String> values) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE not in", values, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeBetween(String value1, String value2) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE between", value1, value2, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromTypeNotBetween(String value1, String value2) {
            addCriterion("RICHTEXT_DATA_FROM_TYPE not between", value1, value2, "richtextDataFromType");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueIsNull() {
            addCriterion("RICHTEXT_DATA_FROM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueIsNotNull() {
            addCriterion("RICHTEXT_DATA_FROM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueEqualTo(String value) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE =", value, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueNotEqualTo(String value) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE <>", value, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueGreaterThan(String value) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE >", value, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueGreaterThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE >=", value, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueLessThan(String value) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE <", value, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueLessThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE <=", value, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueLike(String value) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE like", value, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueNotLike(String value) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE not like", value, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueIn(List<String> values) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE in", values, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueNotIn(List<String> values) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE not in", values, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueBetween(String value1, String value2) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE between", value1, value2, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextDataFromValueNotBetween(String value1, String value2) {
            addCriterion("RICHTEXT_DATA_FROM_VALUE not between", value1, value2, "richtextDataFromValue");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeIsNull() {
            addCriterion("RICHTEXT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeIsNotNull() {
            addCriterion("RICHTEXT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeEqualTo(String value) {
            addCriterion("RICHTEXT_TYPE =", value, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeNotEqualTo(String value) {
            addCriterion("RICHTEXT_TYPE <>", value, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeGreaterThan(String value) {
            addCriterion("RICHTEXT_TYPE >", value, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_TYPE >=", value, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeLessThan(String value) {
            addCriterion("RICHTEXT_TYPE <", value, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeLessThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_TYPE <=", value, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeLike(String value) {
            addCriterion("RICHTEXT_TYPE like", value, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeNotLike(String value) {
            addCriterion("RICHTEXT_TYPE not like", value, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeIn(List<String> values) {
            addCriterion("RICHTEXT_TYPE in", values, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeNotIn(List<String> values) {
            addCriterion("RICHTEXT_TYPE not in", values, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeBetween(String value1, String value2) {
            addCriterion("RICHTEXT_TYPE between", value1, value2, "richtextType");
            return (Criteria) this;
        }

        public Criteria andRichtextTypeNotBetween(String value1, String value2) {
            addCriterion("RICHTEXT_TYPE not between", value1, value2, "richtextType");
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

        public Criteria andRichtextCheckTypeIsNull() {
            addCriterion("RICHTEXT_CHECK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeIsNotNull() {
            addCriterion("RICHTEXT_CHECK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_TYPE =", value, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeNotEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_TYPE <>", value, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeGreaterThan(String value) {
            addCriterion("RICHTEXT_CHECK_TYPE >", value, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_TYPE >=", value, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeLessThan(String value) {
            addCriterion("RICHTEXT_CHECK_TYPE <", value, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_TYPE <=", value, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeLike(String value) {
            addCriterion("RICHTEXT_CHECK_TYPE like", value, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeNotLike(String value) {
            addCriterion("RICHTEXT_CHECK_TYPE not like", value, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeIn(List<String> values) {
            addCriterion("RICHTEXT_CHECK_TYPE in", values, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeNotIn(List<String> values) {
            addCriterion("RICHTEXT_CHECK_TYPE not in", values, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeBetween(String value1, String value2) {
            addCriterion("RICHTEXT_CHECK_TYPE between", value1, value2, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckTypeNotBetween(String value1, String value2) {
            addCriterion("RICHTEXT_CHECK_TYPE not between", value1, value2, "richtextCheckType");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyIsNull() {
            addCriterion("RICHTEXT_READONLY is null");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyIsNotNull() {
            addCriterion("RICHTEXT_READONLY is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyEqualTo(String value) {
            addCriterion("RICHTEXT_READONLY =", value, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyNotEqualTo(String value) {
            addCriterion("RICHTEXT_READONLY <>", value, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyGreaterThan(String value) {
            addCriterion("RICHTEXT_READONLY >", value, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyGreaterThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_READONLY >=", value, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyLessThan(String value) {
            addCriterion("RICHTEXT_READONLY <", value, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyLessThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_READONLY <=", value, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyLike(String value) {
            addCriterion("RICHTEXT_READONLY like", value, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyNotLike(String value) {
            addCriterion("RICHTEXT_READONLY not like", value, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyIn(List<String> values) {
            addCriterion("RICHTEXT_READONLY in", values, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyNotIn(List<String> values) {
            addCriterion("RICHTEXT_READONLY not in", values, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyBetween(String value1, String value2) {
            addCriterion("RICHTEXT_READONLY between", value1, value2, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextReadonlyNotBetween(String value1, String value2) {
            addCriterion("RICHTEXT_READONLY not between", value1, value2, "richtextReadonly");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfIsNull() {
            addCriterion("RICHTEXT_CHECK_SELF is null");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfIsNotNull() {
            addCriterion("RICHTEXT_CHECK_SELF is not null");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_SELF =", value, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfNotEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_SELF <>", value, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfGreaterThan(String value) {
            addCriterion("RICHTEXT_CHECK_SELF >", value, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfGreaterThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_SELF >=", value, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfLessThan(String value) {
            addCriterion("RICHTEXT_CHECK_SELF <", value, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfLessThanOrEqualTo(String value) {
            addCriterion("RICHTEXT_CHECK_SELF <=", value, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfLike(String value) {
            addCriterion("RICHTEXT_CHECK_SELF like", value, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfNotLike(String value) {
            addCriterion("RICHTEXT_CHECK_SELF not like", value, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfIn(List<String> values) {
            addCriterion("RICHTEXT_CHECK_SELF in", values, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfNotIn(List<String> values) {
            addCriterion("RICHTEXT_CHECK_SELF not in", values, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfBetween(String value1, String value2) {
            addCriterion("RICHTEXT_CHECK_SELF between", value1, value2, "richtextCheckSelf");
            return (Criteria) this;
        }

        public Criteria andRichtextCheckSelfNotBetween(String value1, String value2) {
            addCriterion("RICHTEXT_CHECK_SELF not between", value1, value2, "richtextCheckSelf");
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