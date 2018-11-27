package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormButtonInterfaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonInterfaceExample() {
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

        public Criteria andButtonInterfaceIdIsNull() {
            addCriterion("BUTTON_INTERFACE_ID is null");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdIsNotNull() {
            addCriterion("BUTTON_INTERFACE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_ID =", value, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdNotEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_ID <>", value, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdGreaterThan(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_ID >", value, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_ID >=", value, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdLessThan(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_ID <", value, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_ID <=", value, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdIn(List<BigDecimal> values) {
            addCriterion("BUTTON_INTERFACE_ID in", values, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdNotIn(List<BigDecimal> values) {
            addCriterion("BUTTON_INTERFACE_ID not in", values, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_INTERFACE_ID between", value1, value2, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_INTERFACE_ID not between", value1, value2, "buttonInterfaceId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdIsNull() {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID is null");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdIsNotNull() {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID =", value, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdNotEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID <>", value, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdGreaterThan(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID >", value, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID >=", value, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdLessThan(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID <", value, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID <=", value, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdIn(List<BigDecimal> values) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID in", values, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdNotIn(List<BigDecimal> values) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID not in", values, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID between", value1, value2, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceButtonIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_INTERFACE_BUTTON_ID not between", value1, value2, "buttonInterfaceButtonId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdIsNull() {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdIsNotNull() {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID =", value, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdNotEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID <>", value, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdGreaterThan(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID >", value, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID >=", value, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdLessThan(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID <", value, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID <=", value, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdIn(List<BigDecimal> values) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID in", values, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdNotIn(List<BigDecimal> values) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID not in", values, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID between", value1, value2, "buttonInterfaceSchemeId");
            return (Criteria) this;
        }

        public Criteria andButtonInterfaceSchemeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_INTERFACE_SCHEME_ID not between", value1, value2, "buttonInterfaceSchemeId");
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