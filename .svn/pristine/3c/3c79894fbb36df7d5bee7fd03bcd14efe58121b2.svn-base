package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormGeneralParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormGeneralParamExample() {
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

        public Criteria andParamIdIsNull() {
            addCriterion("PARAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andParamIdIsNotNull() {
            addCriterion("PARAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParamIdEqualTo(BigDecimal value) {
            addCriterion("PARAM_ID =", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotEqualTo(BigDecimal value) {
            addCriterion("PARAM_ID <>", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThan(BigDecimal value) {
            addCriterion("PARAM_ID >", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARAM_ID >=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThan(BigDecimal value) {
            addCriterion("PARAM_ID <", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARAM_ID <=", value, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdIn(List<BigDecimal> values) {
            addCriterion("PARAM_ID in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotIn(List<BigDecimal> values) {
            addCriterion("PARAM_ID not in", values, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARAM_ID between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARAM_ID not between", value1, value2, "paramId");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNull() {
            addCriterion("PARAM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andParamTypeIsNotNull() {
            addCriterion("PARAM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParamTypeEqualTo(String value) {
            addCriterion("PARAM_TYPE =", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotEqualTo(String value) {
            addCriterion("PARAM_TYPE <>", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThan(String value) {
            addCriterion("PARAM_TYPE >", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_TYPE >=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThan(String value) {
            addCriterion("PARAM_TYPE <", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLessThanOrEqualTo(String value) {
            addCriterion("PARAM_TYPE <=", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeLike(String value) {
            addCriterion("PARAM_TYPE like", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotLike(String value) {
            addCriterion("PARAM_TYPE not like", value, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeIn(List<String> values) {
            addCriterion("PARAM_TYPE in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotIn(List<String> values) {
            addCriterion("PARAM_TYPE not in", values, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeBetween(String value1, String value2) {
            addCriterion("PARAM_TYPE between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeNotBetween(String value1, String value2) {
            addCriterion("PARAM_TYPE not between", value1, value2, "paramType");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueIsNull() {
            addCriterion("PARAM_TYPE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueIsNotNull() {
            addCriterion("PARAM_TYPE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueEqualTo(BigDecimal value) {
            addCriterion("PARAM_TYPE_VALUE =", value, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueNotEqualTo(BigDecimal value) {
            addCriterion("PARAM_TYPE_VALUE <>", value, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueGreaterThan(BigDecimal value) {
            addCriterion("PARAM_TYPE_VALUE >", value, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARAM_TYPE_VALUE >=", value, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueLessThan(BigDecimal value) {
            addCriterion("PARAM_TYPE_VALUE <", value, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARAM_TYPE_VALUE <=", value, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueIn(List<BigDecimal> values) {
            addCriterion("PARAM_TYPE_VALUE in", values, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueNotIn(List<BigDecimal> values) {
            addCriterion("PARAM_TYPE_VALUE not in", values, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARAM_TYPE_VALUE between", value1, value2, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamTypeValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARAM_TYPE_VALUE not between", value1, value2, "paramTypeValue");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNull() {
            addCriterion("PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParamNameIsNotNull() {
            addCriterion("PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParamNameEqualTo(String value) {
            addCriterion("PARAM_NAME =", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotEqualTo(String value) {
            addCriterion("PARAM_NAME <>", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThan(String value) {
            addCriterion("PARAM_NAME >", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME >=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThan(String value) {
            addCriterion("PARAM_NAME <", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLessThanOrEqualTo(String value) {
            addCriterion("PARAM_NAME <=", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameLike(String value) {
            addCriterion("PARAM_NAME like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotLike(String value) {
            addCriterion("PARAM_NAME not like", value, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameIn(List<String> values) {
            addCriterion("PARAM_NAME in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotIn(List<String> values) {
            addCriterion("PARAM_NAME not in", values, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameBetween(String value1, String value2) {
            addCriterion("PARAM_NAME between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamNameNotBetween(String value1, String value2) {
            addCriterion("PARAM_NAME not between", value1, value2, "paramName");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeIsNull() {
            addCriterion("PARAM_FROM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeIsNotNull() {
            addCriterion("PARAM_FROM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeEqualTo(String value) {
            addCriterion("PARAM_FROM_TYPE =", value, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeNotEqualTo(String value) {
            addCriterion("PARAM_FROM_TYPE <>", value, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeGreaterThan(String value) {
            addCriterion("PARAM_FROM_TYPE >", value, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_FROM_TYPE >=", value, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeLessThan(String value) {
            addCriterion("PARAM_FROM_TYPE <", value, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeLessThanOrEqualTo(String value) {
            addCriterion("PARAM_FROM_TYPE <=", value, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeLike(String value) {
            addCriterion("PARAM_FROM_TYPE like", value, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeNotLike(String value) {
            addCriterion("PARAM_FROM_TYPE not like", value, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeIn(List<String> values) {
            addCriterion("PARAM_FROM_TYPE in", values, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeNotIn(List<String> values) {
            addCriterion("PARAM_FROM_TYPE not in", values, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeBetween(String value1, String value2) {
            addCriterion("PARAM_FROM_TYPE between", value1, value2, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromTypeNotBetween(String value1, String value2) {
            addCriterion("PARAM_FROM_TYPE not between", value1, value2, "paramFromType");
            return (Criteria) this;
        }

        public Criteria andParamFromValueIsNull() {
            addCriterion("PARAM_FROM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andParamFromValueIsNotNull() {
            addCriterion("PARAM_FROM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParamFromValueEqualTo(String value) {
            addCriterion("PARAM_FROM_VALUE =", value, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueNotEqualTo(String value) {
            addCriterion("PARAM_FROM_VALUE <>", value, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueGreaterThan(String value) {
            addCriterion("PARAM_FROM_VALUE >", value, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAM_FROM_VALUE >=", value, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueLessThan(String value) {
            addCriterion("PARAM_FROM_VALUE <", value, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueLessThanOrEqualTo(String value) {
            addCriterion("PARAM_FROM_VALUE <=", value, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueLike(String value) {
            addCriterion("PARAM_FROM_VALUE like", value, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueNotLike(String value) {
            addCriterion("PARAM_FROM_VALUE not like", value, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueIn(List<String> values) {
            addCriterion("PARAM_FROM_VALUE in", values, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueNotIn(List<String> values) {
            addCriterion("PARAM_FROM_VALUE not in", values, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueBetween(String value1, String value2) {
            addCriterion("PARAM_FROM_VALUE between", value1, value2, "paramFromValue");
            return (Criteria) this;
        }

        public Criteria andParamFromValueNotBetween(String value1, String value2) {
            addCriterion("PARAM_FROM_VALUE not between", value1, value2, "paramFromValue");
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