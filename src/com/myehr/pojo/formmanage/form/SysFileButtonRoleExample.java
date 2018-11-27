package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFileButtonRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFileButtonRoleExample() {
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

        public Criteria andButtonRoleIdIsNull() {
            addCriterion("BUTTON_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdIsNotNull() {
            addCriterion("BUTTON_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdEqualTo(BigDecimal value) {
            addCriterion("BUTTON_ROLE_ID =", value, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdNotEqualTo(BigDecimal value) {
            addCriterion("BUTTON_ROLE_ID <>", value, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdGreaterThan(BigDecimal value) {
            addCriterion("BUTTON_ROLE_ID >", value, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_ROLE_ID >=", value, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdLessThan(BigDecimal value) {
            addCriterion("BUTTON_ROLE_ID <", value, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_ROLE_ID <=", value, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdIn(List<BigDecimal> values) {
            addCriterion("BUTTON_ROLE_ID in", values, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdNotIn(List<BigDecimal> values) {
            addCriterion("BUTTON_ROLE_ID not in", values, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_ROLE_ID between", value1, value2, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonRoleIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_ROLE_ID not between", value1, value2, "buttonRoleId");
            return (Criteria) this;
        }

        public Criteria andButtonCodeIsNull() {
            addCriterion("BUTTON_CODE is null");
            return (Criteria) this;
        }

        public Criteria andButtonCodeIsNotNull() {
            addCriterion("BUTTON_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andButtonCodeEqualTo(String value) {
            addCriterion("BUTTON_CODE =", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeNotEqualTo(String value) {
            addCriterion("BUTTON_CODE <>", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeGreaterThan(String value) {
            addCriterion("BUTTON_CODE >", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_CODE >=", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeLessThan(String value) {
            addCriterion("BUTTON_CODE <", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_CODE <=", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeLike(String value) {
            addCriterion("BUTTON_CODE like", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeNotLike(String value) {
            addCriterion("BUTTON_CODE not like", value, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeIn(List<String> values) {
            addCriterion("BUTTON_CODE in", values, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeNotIn(List<String> values) {
            addCriterion("BUTTON_CODE not in", values, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeBetween(String value1, String value2) {
            addCriterion("BUTTON_CODE between", value1, value2, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andButtonCodeNotBetween(String value1, String value2) {
            addCriterion("BUTTON_CODE not between", value1, value2, "buttonCode");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(BigDecimal value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(BigDecimal value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<BigDecimal> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<BigDecimal> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(BigDecimal value) {
            addCriterion("FORM_ID =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_ID <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_ID >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_ID >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(BigDecimal value) {
            addCriterion("FORM_ID <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_ID <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<BigDecimal> values) {
            addCriterion("FORM_ID in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_ID not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_ID between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_ID not between", value1, value2, "formId");
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

        public Criteria andButtonRoleRemarkIsNull() {
            addCriterion("BUTTON_ROLE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkIsNotNull() {
            addCriterion("BUTTON_ROLE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkEqualTo(String value) {
            addCriterion("BUTTON_ROLE_REMARK =", value, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkNotEqualTo(String value) {
            addCriterion("BUTTON_ROLE_REMARK <>", value, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkGreaterThan(String value) {
            addCriterion("BUTTON_ROLE_REMARK >", value, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_ROLE_REMARK >=", value, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkLessThan(String value) {
            addCriterion("BUTTON_ROLE_REMARK <", value, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_ROLE_REMARK <=", value, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkLike(String value) {
            addCriterion("BUTTON_ROLE_REMARK like", value, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkNotLike(String value) {
            addCriterion("BUTTON_ROLE_REMARK not like", value, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkIn(List<String> values) {
            addCriterion("BUTTON_ROLE_REMARK in", values, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkNotIn(List<String> values) {
            addCriterion("BUTTON_ROLE_REMARK not in", values, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkBetween(String value1, String value2) {
            addCriterion("BUTTON_ROLE_REMARK between", value1, value2, "buttonRoleRemark");
            return (Criteria) this;
        }

        public Criteria andButtonRoleRemarkNotBetween(String value1, String value2) {
            addCriterion("BUTTON_ROLE_REMARK not between", value1, value2, "buttonRoleRemark");
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