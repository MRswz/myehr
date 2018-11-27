package com.myehr.pojo.field;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFieldRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFieldRuleExample() {
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

        public Criteria andFieldRuleIdIsNull() {
            addCriterion("FIELD_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdIsNotNull() {
            addCriterion("FIELD_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdEqualTo(Long value) {
            addCriterion("FIELD_RULE_ID =", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdNotEqualTo(Long value) {
            addCriterion("FIELD_RULE_ID <>", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdGreaterThan(Long value) {
            addCriterion("FIELD_RULE_ID >", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FIELD_RULE_ID >=", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdLessThan(Long value) {
            addCriterion("FIELD_RULE_ID <", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("FIELD_RULE_ID <=", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdIn(List<Long> values) {
            addCriterion("FIELD_RULE_ID in", values, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdNotIn(List<Long> values) {
            addCriterion("FIELD_RULE_ID not in", values, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdBetween(Long value1, Long value2) {
            addCriterion("FIELD_RULE_ID between", value1, value2, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("FIELD_RULE_ID not between", value1, value2, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixIsNull() {
            addCriterion("FIELD_RULE_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixIsNotNull() {
            addCriterion("FIELD_RULE_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixEqualTo(String value) {
            addCriterion("FIELD_RULE_PREFIX =", value, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixNotEqualTo(String value) {
            addCriterion("FIELD_RULE_PREFIX <>", value, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixGreaterThan(String value) {
            addCriterion("FIELD_RULE_PREFIX >", value, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_PREFIX >=", value, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixLessThan(String value) {
            addCriterion("FIELD_RULE_PREFIX <", value, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixLessThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_PREFIX <=", value, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixLike(String value) {
            addCriterion("FIELD_RULE_PREFIX like", value, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixNotLike(String value) {
            addCriterion("FIELD_RULE_PREFIX not like", value, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixIn(List<String> values) {
            addCriterion("FIELD_RULE_PREFIX in", values, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixNotIn(List<String> values) {
            addCriterion("FIELD_RULE_PREFIX not in", values, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_PREFIX between", value1, value2, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRulePrefixNotBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_PREFIX not between", value1, value2, "fieldRulePrefix");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitIsNull() {
            addCriterion("FIELD_RULE_DIGIT is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitIsNotNull() {
            addCriterion("FIELD_RULE_DIGIT is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitEqualTo(String value) {
            addCriterion("FIELD_RULE_DIGIT =", value, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitNotEqualTo(String value) {
            addCriterion("FIELD_RULE_DIGIT <>", value, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitGreaterThan(String value) {
            addCriterion("FIELD_RULE_DIGIT >", value, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_DIGIT >=", value, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitLessThan(String value) {
            addCriterion("FIELD_RULE_DIGIT <", value, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitLessThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_DIGIT <=", value, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitLike(String value) {
            addCriterion("FIELD_RULE_DIGIT like", value, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitNotLike(String value) {
            addCriterion("FIELD_RULE_DIGIT not like", value, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitIn(List<String> values) {
            addCriterion("FIELD_RULE_DIGIT in", values, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitNotIn(List<String> values) {
            addCriterion("FIELD_RULE_DIGIT not in", values, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_DIGIT between", value1, value2, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleDigitNotBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_DIGIT not between", value1, value2, "fieldRuleDigit");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseIsNull() {
            addCriterion("FIELD_RULE_RAISE is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseIsNotNull() {
            addCriterion("FIELD_RULE_RAISE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseEqualTo(String value) {
            addCriterion("FIELD_RULE_RAISE =", value, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseNotEqualTo(String value) {
            addCriterion("FIELD_RULE_RAISE <>", value, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseGreaterThan(String value) {
            addCriterion("FIELD_RULE_RAISE >", value, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_RAISE >=", value, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseLessThan(String value) {
            addCriterion("FIELD_RULE_RAISE <", value, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseLessThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_RAISE <=", value, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseLike(String value) {
            addCriterion("FIELD_RULE_RAISE like", value, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseNotLike(String value) {
            addCriterion("FIELD_RULE_RAISE not like", value, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseIn(List<String> values) {
            addCriterion("FIELD_RULE_RAISE in", values, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseNotIn(List<String> values) {
            addCriterion("FIELD_RULE_RAISE not in", values, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_RAISE between", value1, value2, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleRaiseNotBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_RAISE not between", value1, value2, "fieldRuleRaise");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxIsNull() {
            addCriterion("FIELD_RULE_MAX is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxIsNotNull() {
            addCriterion("FIELD_RULE_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxEqualTo(String value) {
            addCriterion("FIELD_RULE_MAX =", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxNotEqualTo(String value) {
            addCriterion("FIELD_RULE_MAX <>", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxGreaterThan(String value) {
            addCriterion("FIELD_RULE_MAX >", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_MAX >=", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxLessThan(String value) {
            addCriterion("FIELD_RULE_MAX <", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxLessThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_MAX <=", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxLike(String value) {
            addCriterion("FIELD_RULE_MAX like", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxNotLike(String value) {
            addCriterion("FIELD_RULE_MAX not like", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxIn(List<String> values) {
            addCriterion("FIELD_RULE_MAX in", values, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxNotIn(List<String> values) {
            addCriterion("FIELD_RULE_MAX not in", values, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_MAX between", value1, value2, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxNotBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_MAX not between", value1, value2, "fieldRuleMax");
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

        public Criteria andFieldRuleCodeIsNull() {
            addCriterion("FIELD_RULE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeIsNotNull() {
            addCriterion("FIELD_RULE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeEqualTo(String value) {
            addCriterion("FIELD_RULE_CODE =", value, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeNotEqualTo(String value) {
            addCriterion("FIELD_RULE_CODE <>", value, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeGreaterThan(String value) {
            addCriterion("FIELD_RULE_CODE >", value, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_CODE >=", value, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeLessThan(String value) {
            addCriterion("FIELD_RULE_CODE <", value, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeLessThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_CODE <=", value, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeLike(String value) {
            addCriterion("FIELD_RULE_CODE like", value, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeNotLike(String value) {
            addCriterion("FIELD_RULE_CODE not like", value, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeIn(List<String> values) {
            addCriterion("FIELD_RULE_CODE in", values, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeNotIn(List<String> values) {
            addCriterion("FIELD_RULE_CODE not in", values, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_CODE between", value1, value2, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleCodeNotBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_CODE not between", value1, value2, "fieldRuleCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameIsNull() {
            addCriterion("FIELD_RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameIsNotNull() {
            addCriterion("FIELD_RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameEqualTo(String value) {
            addCriterion("FIELD_RULE_NAME =", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameNotEqualTo(String value) {
            addCriterion("FIELD_RULE_NAME <>", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameGreaterThan(String value) {
            addCriterion("FIELD_RULE_NAME >", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_NAME >=", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameLessThan(String value) {
            addCriterion("FIELD_RULE_NAME <", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_NAME <=", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameLike(String value) {
            addCriterion("FIELD_RULE_NAME like", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameNotLike(String value) {
            addCriterion("FIELD_RULE_NAME not like", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameIn(List<String> values) {
            addCriterion("FIELD_RULE_NAME in", values, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameNotIn(List<String> values) {
            addCriterion("FIELD_RULE_NAME not in", values, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_NAME between", value1, value2, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameNotBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_NAME not between", value1, value2, "fieldRuleName");
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