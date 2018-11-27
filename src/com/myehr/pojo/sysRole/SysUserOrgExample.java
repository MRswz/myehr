package com.myehr.pojo.sysRole;

import java.util.ArrayList;
import java.util.List;

public class SysUserOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserOrgExample() {
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

        public Criteria andUserOrgIdIsNull() {
            addCriterion("USER_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdIsNotNull() {
            addCriterion("USER_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdEqualTo(Integer value) {
            addCriterion("USER_ORG_ID =", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdNotEqualTo(Integer value) {
            addCriterion("USER_ORG_ID <>", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdGreaterThan(Integer value) {
            addCriterion("USER_ORG_ID >", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ORG_ID >=", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdLessThan(Integer value) {
            addCriterion("USER_ORG_ID <", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ORG_ID <=", value, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdIn(List<Integer> values) {
            addCriterion("USER_ORG_ID in", values, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdNotIn(List<Integer> values) {
            addCriterion("USER_ORG_ID not in", values, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ORG_ID between", value1, value2, "userOrgId");
            return (Criteria) this;
        }

        public Criteria andUserOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ORG_ID not between", value1, value2, "userOrgId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateIsNull() {
            addCriterion("Include_subordinate is null");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateIsNotNull() {
            addCriterion("Include_subordinate is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateEqualTo(String value) {
            addCriterion("Include_subordinate =", value, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateNotEqualTo(String value) {
            addCriterion("Include_subordinate <>", value, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateGreaterThan(String value) {
            addCriterion("Include_subordinate >", value, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateGreaterThanOrEqualTo(String value) {
            addCriterion("Include_subordinate >=", value, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateLessThan(String value) {
            addCriterion("Include_subordinate <", value, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateLessThanOrEqualTo(String value) {
            addCriterion("Include_subordinate <=", value, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateLike(String value) {
            addCriterion("Include_subordinate like", value, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateNotLike(String value) {
            addCriterion("Include_subordinate not like", value, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateIn(List<String> values) {
            addCriterion("Include_subordinate in", values, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateNotIn(List<String> values) {
            addCriterion("Include_subordinate not in", values, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateBetween(String value1, String value2) {
            addCriterion("Include_subordinate between", value1, value2, "includeSubordinate");
            return (Criteria) this;
        }

        public Criteria andIncludeSubordinateNotBetween(String value1, String value2) {
            addCriterion("Include_subordinate not between", value1, value2, "includeSubordinate");
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