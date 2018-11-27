package com.myehr.pojo.sysuser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApproveAccreditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApproveAccreditExample() {
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

        public Criteria andApproveAccreditIdIsNull() {
            addCriterion("approve_accredit_id is null");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdIsNotNull() {
            addCriterion("approve_accredit_id is not null");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdEqualTo(Long value) {
            addCriterion("approve_accredit_id =", value, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdNotEqualTo(Long value) {
            addCriterion("approve_accredit_id <>", value, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdGreaterThan(Long value) {
            addCriterion("approve_accredit_id >", value, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("approve_accredit_id >=", value, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdLessThan(Long value) {
            addCriterion("approve_accredit_id <", value, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdLessThanOrEqualTo(Long value) {
            addCriterion("approve_accredit_id <=", value, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdIn(List<Long> values) {
            addCriterion("approve_accredit_id in", values, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdNotIn(List<Long> values) {
            addCriterion("approve_accredit_id not in", values, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdBetween(Long value1, Long value2) {
            addCriterion("approve_accredit_id between", value1, value2, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveAccreditIdNotBetween(Long value1, Long value2) {
            addCriterion("approve_accredit_id not between", value1, value2, "approveAccreditId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdIsNull() {
            addCriterion("approve_user_id is null");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdIsNotNull() {
            addCriterion("approve_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdEqualTo(Long value) {
            addCriterion("approve_user_id =", value, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdNotEqualTo(Long value) {
            addCriterion("approve_user_id <>", value, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdGreaterThan(Long value) {
            addCriterion("approve_user_id >", value, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("approve_user_id >=", value, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdLessThan(Long value) {
            addCriterion("approve_user_id <", value, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdLessThanOrEqualTo(Long value) {
            addCriterion("approve_user_id <=", value, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdIn(List<Long> values) {
            addCriterion("approve_user_id in", values, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdNotIn(List<Long> values) {
            addCriterion("approve_user_id not in", values, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdBetween(Long value1, Long value2) {
            addCriterion("approve_user_id between", value1, value2, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andApproveUserIdNotBetween(Long value1, Long value2) {
            addCriterion("approve_user_id not between", value1, value2, "approveUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdIsNull() {
            addCriterion("authorizer_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdIsNotNull() {
            addCriterion("authorizer_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdEqualTo(Long value) {
            addCriterion("authorizer_user_id =", value, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdNotEqualTo(Long value) {
            addCriterion("authorizer_user_id <>", value, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdGreaterThan(Long value) {
            addCriterion("authorizer_user_id >", value, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("authorizer_user_id >=", value, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdLessThan(Long value) {
            addCriterion("authorizer_user_id <", value, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdLessThanOrEqualTo(Long value) {
            addCriterion("authorizer_user_id <=", value, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdIn(List<Long> values) {
            addCriterion("authorizer_user_id in", values, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdNotIn(List<Long> values) {
            addCriterion("authorizer_user_id not in", values, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdBetween(Long value1, Long value2) {
            addCriterion("authorizer_user_id between", value1, value2, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerUserIdNotBetween(Long value1, Long value2) {
            addCriterion("authorizer_user_id not between", value1, value2, "authorizerUserId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateIsNull() {
            addCriterion("authorization_state is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateIsNotNull() {
            addCriterion("authorization_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateEqualTo(String value) {
            addCriterion("authorization_state =", value, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateNotEqualTo(String value) {
            addCriterion("authorization_state <>", value, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateGreaterThan(String value) {
            addCriterion("authorization_state >", value, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateGreaterThanOrEqualTo(String value) {
            addCriterion("authorization_state >=", value, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateLessThan(String value) {
            addCriterion("authorization_state <", value, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateLessThanOrEqualTo(String value) {
            addCriterion("authorization_state <=", value, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateLike(String value) {
            addCriterion("authorization_state like", value, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateNotLike(String value) {
            addCriterion("authorization_state not like", value, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateIn(List<String> values) {
            addCriterion("authorization_state in", values, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateNotIn(List<String> values) {
            addCriterion("authorization_state not in", values, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateBetween(String value1, String value2) {
            addCriterion("authorization_state between", value1, value2, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationStateNotBetween(String value1, String value2) {
            addCriterion("authorization_state not between", value1, value2, "authorizationState");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeIsNull() {
            addCriterion("authorization_time is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeIsNotNull() {
            addCriterion("authorization_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeEqualTo(Date value) {
            addCriterion("authorization_time =", value, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeNotEqualTo(Date value) {
            addCriterion("authorization_time <>", value, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeGreaterThan(Date value) {
            addCriterion("authorization_time >", value, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("authorization_time >=", value, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeLessThan(Date value) {
            addCriterion("authorization_time <", value, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeLessThanOrEqualTo(Date value) {
            addCriterion("authorization_time <=", value, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeIn(List<Date> values) {
            addCriterion("authorization_time in", values, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeNotIn(List<Date> values) {
            addCriterion("authorization_time not in", values, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeBetween(Date value1, Date value2) {
            addCriterion("authorization_time between", value1, value2, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTimeNotBetween(Date value1, Date value2) {
            addCriterion("authorization_time not between", value1, value2, "authorizationTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIsNull() {
            addCriterion("failure_time is null");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIsNotNull() {
            addCriterion("failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andFailureTimeEqualTo(Date value) {
            addCriterion("failure_time =", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotEqualTo(Date value) {
            addCriterion("failure_time <>", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeGreaterThan(Date value) {
            addCriterion("failure_time >", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("failure_time >=", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeLessThan(Date value) {
            addCriterion("failure_time <", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeLessThanOrEqualTo(Date value) {
            addCriterion("failure_time <=", value, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeIn(List<Date> values) {
            addCriterion("failure_time in", values, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotIn(List<Date> values) {
            addCriterion("failure_time not in", values, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeBetween(Date value1, Date value2) {
            addCriterion("failure_time between", value1, value2, "failureTime");
            return (Criteria) this;
        }

        public Criteria andFailureTimeNotBetween(Date value1, Date value2) {
            addCriterion("failure_time not between", value1, value2, "failureTime");
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