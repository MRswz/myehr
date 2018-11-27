package com.myehr.pojo.formmanage.drag;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysFormDragconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormDragconfigExample() {
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

        public Criteria andDragconfigIdIsNull() {
            addCriterion("DRAGCONFIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdIsNotNull() {
            addCriterion("DRAGCONFIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdEqualTo(BigDecimal value) {
            addCriterion("DRAGCONFIG_ID =", value, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdNotEqualTo(BigDecimal value) {
            addCriterion("DRAGCONFIG_ID <>", value, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdGreaterThan(BigDecimal value) {
            addCriterion("DRAGCONFIG_ID >", value, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAGCONFIG_ID >=", value, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdLessThan(BigDecimal value) {
            addCriterion("DRAGCONFIG_ID <", value, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAGCONFIG_ID <=", value, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdIn(List<BigDecimal> values) {
            addCriterion("DRAGCONFIG_ID in", values, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdNotIn(List<BigDecimal> values) {
            addCriterion("DRAGCONFIG_ID not in", values, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAGCONFIG_ID between", value1, value2, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAGCONFIG_ID not between", value1, value2, "dragconfigId");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeIsNull() {
            addCriterion("DRAGCONFIG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeIsNotNull() {
            addCriterion("DRAGCONFIG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeEqualTo(String value) {
            addCriterion("DRAGCONFIG_CODE =", value, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeNotEqualTo(String value) {
            addCriterion("DRAGCONFIG_CODE <>", value, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeGreaterThan(String value) {
            addCriterion("DRAGCONFIG_CODE >", value, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DRAGCONFIG_CODE >=", value, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeLessThan(String value) {
            addCriterion("DRAGCONFIG_CODE <", value, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeLessThanOrEqualTo(String value) {
            addCriterion("DRAGCONFIG_CODE <=", value, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeLike(String value) {
            addCriterion("DRAGCONFIG_CODE like", value, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeNotLike(String value) {
            addCriterion("DRAGCONFIG_CODE not like", value, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeIn(List<String> values) {
            addCriterion("DRAGCONFIG_CODE in", values, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeNotIn(List<String> values) {
            addCriterion("DRAGCONFIG_CODE not in", values, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeBetween(String value1, String value2) {
            addCriterion("DRAGCONFIG_CODE between", value1, value2, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigCodeNotBetween(String value1, String value2) {
            addCriterion("DRAGCONFIG_CODE not between", value1, value2, "dragconfigCode");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidIsNull() {
            addCriterion("DRAGCONFIG_PID is null");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidIsNotNull() {
            addCriterion("DRAGCONFIG_PID is not null");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidEqualTo(BigDecimal value) {
            addCriterion("DRAGCONFIG_PID =", value, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidNotEqualTo(BigDecimal value) {
            addCriterion("DRAGCONFIG_PID <>", value, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidGreaterThan(BigDecimal value) {
            addCriterion("DRAGCONFIG_PID >", value, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAGCONFIG_PID >=", value, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidLessThan(BigDecimal value) {
            addCriterion("DRAGCONFIG_PID <", value, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAGCONFIG_PID <=", value, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidIn(List<BigDecimal> values) {
            addCriterion("DRAGCONFIG_PID in", values, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidNotIn(List<BigDecimal> values) {
            addCriterion("DRAGCONFIG_PID not in", values, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAGCONFIG_PID between", value1, value2, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigPidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAGCONFIG_PID not between", value1, value2, "dragconfigPid");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameIsNull() {
            addCriterion("DRAGCONFIG_CNAME is null");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameIsNotNull() {
            addCriterion("DRAGCONFIG_CNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameEqualTo(String value) {
            addCriterion("DRAGCONFIG_CNAME =", value, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameNotEqualTo(String value) {
            addCriterion("DRAGCONFIG_CNAME <>", value, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameGreaterThan(String value) {
            addCriterion("DRAGCONFIG_CNAME >", value, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameGreaterThanOrEqualTo(String value) {
            addCriterion("DRAGCONFIG_CNAME >=", value, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameLessThan(String value) {
            addCriterion("DRAGCONFIG_CNAME <", value, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameLessThanOrEqualTo(String value) {
            addCriterion("DRAGCONFIG_CNAME <=", value, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameLike(String value) {
            addCriterion("DRAGCONFIG_CNAME like", value, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameNotLike(String value) {
            addCriterion("DRAGCONFIG_CNAME not like", value, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameIn(List<String> values) {
            addCriterion("DRAGCONFIG_CNAME in", values, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameNotIn(List<String> values) {
            addCriterion("DRAGCONFIG_CNAME not in", values, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameBetween(String value1, String value2) {
            addCriterion("DRAGCONFIG_CNAME between", value1, value2, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDragconfigCnameNotBetween(String value1, String value2) {
            addCriterion("DRAGCONFIG_CNAME not between", value1, value2, "dragconfigCname");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNull() {
            addCriterion("DELETE_MARK is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNotNull() {
            addCriterion("DELETE_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkEqualTo(String value) {
            addCriterion("DELETE_MARK =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(String value) {
            addCriterion("DELETE_MARK <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(String value) {
            addCriterion("DELETE_MARK >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(String value) {
            addCriterion("DELETE_MARK <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLike(String value) {
            addCriterion("DELETE_MARK like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotLike(String value) {
            addCriterion("DELETE_MARK not like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<String> values) {
            addCriterion("DELETE_MARK in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<String> values) {
            addCriterion("DELETE_MARK not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(String value1, String value2) {
            addCriterion("DELETE_MARK between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(String value1, String value2) {
            addCriterion("DELETE_MARK not between", value1, value2, "deleteMark");
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