package com.myehr.pojo.sysuser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysOnlineUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOnlineUserExample() {
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

        public Criteria andOnlineUserIdIsNull() {
            addCriterion("ONLINE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdIsNotNull() {
            addCriterion("ONLINE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdEqualTo(Long value) {
            addCriterion("ONLINE_USER_ID =", value, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdNotEqualTo(Long value) {
            addCriterion("ONLINE_USER_ID <>", value, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdGreaterThan(Long value) {
            addCriterion("ONLINE_USER_ID >", value, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ONLINE_USER_ID >=", value, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdLessThan(Long value) {
            addCriterion("ONLINE_USER_ID <", value, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdLessThanOrEqualTo(Long value) {
            addCriterion("ONLINE_USER_ID <=", value, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdIn(List<Long> values) {
            addCriterion("ONLINE_USER_ID in", values, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdNotIn(List<Long> values) {
            addCriterion("ONLINE_USER_ID not in", values, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdBetween(Long value1, Long value2) {
            addCriterion("ONLINE_USER_ID between", value1, value2, "onlineUserId");
            return (Criteria) this;
        }

        public Criteria andOnlineUserIdNotBetween(Long value1, Long value2) {
            addCriterion("ONLINE_USER_ID not between", value1, value2, "onlineUserId");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNull() {
            addCriterion("USER_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIsNotNull() {
            addCriterion("USER_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeEqualTo(Date value) {
            addCriterion("USER_LOGIN_TIME =", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotEqualTo(Date value) {
            addCriterion("USER_LOGIN_TIME <>", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThan(Date value) {
            addCriterion("USER_LOGIN_TIME >", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_LOGIN_TIME >=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThan(Date value) {
            addCriterion("USER_LOGIN_TIME <", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("USER_LOGIN_TIME <=", value, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeIn(List<Date> values) {
            addCriterion("USER_LOGIN_TIME in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotIn(List<Date> values) {
            addCriterion("USER_LOGIN_TIME not in", values, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeBetween(Date value1, Date value2) {
            addCriterion("USER_LOGIN_TIME between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("USER_LOGIN_TIME not between", value1, value2, "userLoginTime");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("SESSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("SESSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("SESSION_ID =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("SESSION_ID <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("SESSION_ID >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SESSION_ID >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("SESSION_ID <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("SESSION_ID <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("SESSION_ID like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("SESSION_ID not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("SESSION_ID in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("SESSION_ID not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("SESSION_ID between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("SESSION_ID not between", value1, value2, "sessionId");
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