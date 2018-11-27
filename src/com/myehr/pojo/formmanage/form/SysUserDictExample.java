package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserDictExample() {
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

        public Criteria andUserDictIdIsNull() {
            addCriterion("USER_DICT_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserDictIdIsNotNull() {
            addCriterion("USER_DICT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserDictIdEqualTo(BigDecimal value) {
            addCriterion("USER_DICT_ID =", value, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdNotEqualTo(BigDecimal value) {
            addCriterion("USER_DICT_ID <>", value, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdGreaterThan(BigDecimal value) {
            addCriterion("USER_DICT_ID >", value, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_DICT_ID >=", value, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdLessThan(BigDecimal value) {
            addCriterion("USER_DICT_ID <", value, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_DICT_ID <=", value, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdIn(List<BigDecimal> values) {
            addCriterion("USER_DICT_ID in", values, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdNotIn(List<BigDecimal> values) {
            addCriterion("USER_DICT_ID not in", values, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_DICT_ID between", value1, value2, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserDictIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_DICT_ID not between", value1, value2, "userDictId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(BigDecimal value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(BigDecimal value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(BigDecimal value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(BigDecimal value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<BigDecimal> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<BigDecimal> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdIsNull() {
            addCriterion("DICT_ENTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdIsNotNull() {
            addCriterion("DICT_ENTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdEqualTo(BigDecimal value) {
            addCriterion("DICT_ENTRY_ID =", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdNotEqualTo(BigDecimal value) {
            addCriterion("DICT_ENTRY_ID <>", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdGreaterThan(BigDecimal value) {
            addCriterion("DICT_ENTRY_ID >", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DICT_ENTRY_ID >=", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdLessThan(BigDecimal value) {
            addCriterion("DICT_ENTRY_ID <", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DICT_ENTRY_ID <=", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdIn(List<BigDecimal> values) {
            addCriterion("DICT_ENTRY_ID in", values, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdNotIn(List<BigDecimal> values) {
            addCriterion("DICT_ENTRY_ID not in", values, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DICT_ENTRY_ID between", value1, value2, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DICT_ENTRY_ID not between", value1, value2, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNull() {
            addCriterion("DICT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNotNull() {
            addCriterion("DICT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdEqualTo(BigDecimal value) {
            addCriterion("DICT_TYPE_ID =", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotEqualTo(BigDecimal value) {
            addCriterion("DICT_TYPE_ID <>", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThan(BigDecimal value) {
            addCriterion("DICT_TYPE_ID >", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DICT_TYPE_ID >=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThan(BigDecimal value) {
            addCriterion("DICT_TYPE_ID <", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DICT_TYPE_ID <=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIn(List<BigDecimal> values) {
            addCriterion("DICT_TYPE_ID in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotIn(List<BigDecimal> values) {
            addCriterion("DICT_TYPE_ID not in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DICT_TYPE_ID between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DICT_TYPE_ID not between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkIsNull() {
            addCriterion("USER_DICT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkIsNotNull() {
            addCriterion("USER_DICT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkEqualTo(String value) {
            addCriterion("USER_DICT_REMARK =", value, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkNotEqualTo(String value) {
            addCriterion("USER_DICT_REMARK <>", value, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkGreaterThan(String value) {
            addCriterion("USER_DICT_REMARK >", value, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DICT_REMARK >=", value, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkLessThan(String value) {
            addCriterion("USER_DICT_REMARK <", value, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkLessThanOrEqualTo(String value) {
            addCriterion("USER_DICT_REMARK <=", value, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkLike(String value) {
            addCriterion("USER_DICT_REMARK like", value, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkNotLike(String value) {
            addCriterion("USER_DICT_REMARK not like", value, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkIn(List<String> values) {
            addCriterion("USER_DICT_REMARK in", values, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkNotIn(List<String> values) {
            addCriterion("USER_DICT_REMARK not in", values, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkBetween(String value1, String value2) {
            addCriterion("USER_DICT_REMARK between", value1, value2, "userDictRemark");
            return (Criteria) this;
        }

        public Criteria andUserDictRemarkNotBetween(String value1, String value2) {
            addCriterion("USER_DICT_REMARK not between", value1, value2, "userDictRemark");
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