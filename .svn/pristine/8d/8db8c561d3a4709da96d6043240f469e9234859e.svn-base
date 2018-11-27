package com.myehr.pojo.activiti;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActRuJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActRuJobExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Object value) {
            addCriterion("ID_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Object value) {
            addCriterion("ID_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Object value) {
            addCriterion("ID_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Object value) {
            addCriterion("ID_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Object value) {
            addCriterion("ID_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Object value) {
            addCriterion("ID_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Object> values) {
            addCriterion("ID_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Object> values) {
            addCriterion("ID_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Object value1, Object value2) {
            addCriterion("ID_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Object value1, Object value2) {
            addCriterion("ID_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRevIsNull() {
            addCriterion("REV_ is null");
            return (Criteria) this;
        }

        public Criteria andRevIsNotNull() {
            addCriterion("REV_ is not null");
            return (Criteria) this;
        }

        public Criteria andRevEqualTo(BigDecimal value) {
            addCriterion("REV_ =", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotEqualTo(BigDecimal value) {
            addCriterion("REV_ <>", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevGreaterThan(BigDecimal value) {
            addCriterion("REV_ >", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_ >=", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevLessThan(BigDecimal value) {
            addCriterion("REV_ <", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_ <=", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevIn(List<BigDecimal> values) {
            addCriterion("REV_ in", values, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotIn(List<BigDecimal> values) {
            addCriterion("REV_ not in", values, "rev");
            return (Criteria) this;
        }

        public Criteria andRevBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_ between", value1, value2, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_ not between", value1, value2, "rev");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE_ is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Object value) {
            addCriterion("TYPE_ =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Object value) {
            addCriterion("TYPE_ <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Object value) {
            addCriterion("TYPE_ >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("TYPE_ >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Object value) {
            addCriterion("TYPE_ <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Object value) {
            addCriterion("TYPE_ <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Object> values) {
            addCriterion("TYPE_ in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Object> values) {
            addCriterion("TYPE_ not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Object value1, Object value2) {
            addCriterion("TYPE_ between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Object value1, Object value2) {
            addCriterion("TYPE_ not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeIsNull() {
            addCriterion("LOCK_EXP_TIME_ is null");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeIsNotNull() {
            addCriterion("LOCK_EXP_TIME_ is not null");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeEqualTo(Date value) {
            addCriterion("LOCK_EXP_TIME_ =", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeNotEqualTo(Date value) {
            addCriterion("LOCK_EXP_TIME_ <>", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeGreaterThan(Date value) {
            addCriterion("LOCK_EXP_TIME_ >", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_EXP_TIME_ >=", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeLessThan(Date value) {
            addCriterion("LOCK_EXP_TIME_ <", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_EXP_TIME_ <=", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeIn(List<Date> values) {
            addCriterion("LOCK_EXP_TIME_ in", values, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeNotIn(List<Date> values) {
            addCriterion("LOCK_EXP_TIME_ not in", values, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeBetween(Date value1, Date value2) {
            addCriterion("LOCK_EXP_TIME_ between", value1, value2, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_EXP_TIME_ not between", value1, value2, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockOwnerIsNull() {
            addCriterion("LOCK_OWNER_ is null");
            return (Criteria) this;
        }

        public Criteria andLockOwnerIsNotNull() {
            addCriterion("LOCK_OWNER_ is not null");
            return (Criteria) this;
        }

        public Criteria andLockOwnerEqualTo(Object value) {
            addCriterion("LOCK_OWNER_ =", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerNotEqualTo(Object value) {
            addCriterion("LOCK_OWNER_ <>", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerGreaterThan(Object value) {
            addCriterion("LOCK_OWNER_ >", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerGreaterThanOrEqualTo(Object value) {
            addCriterion("LOCK_OWNER_ >=", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerLessThan(Object value) {
            addCriterion("LOCK_OWNER_ <", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerLessThanOrEqualTo(Object value) {
            addCriterion("LOCK_OWNER_ <=", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerIn(List<Object> values) {
            addCriterion("LOCK_OWNER_ in", values, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerNotIn(List<Object> values) {
            addCriterion("LOCK_OWNER_ not in", values, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerBetween(Object value1, Object value2) {
            addCriterion("LOCK_OWNER_ between", value1, value2, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerNotBetween(Object value1, Object value2) {
            addCriterion("LOCK_OWNER_ not between", value1, value2, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andExclusiveIsNull() {
            addCriterion("EXCLUSIVE_ is null");
            return (Criteria) this;
        }

        public Criteria andExclusiveIsNotNull() {
            addCriterion("EXCLUSIVE_ is not null");
            return (Criteria) this;
        }

        public Criteria andExclusiveEqualTo(Short value) {
            addCriterion("EXCLUSIVE_ =", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotEqualTo(Short value) {
            addCriterion("EXCLUSIVE_ <>", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveGreaterThan(Short value) {
            addCriterion("EXCLUSIVE_ >", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveGreaterThanOrEqualTo(Short value) {
            addCriterion("EXCLUSIVE_ >=", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveLessThan(Short value) {
            addCriterion("EXCLUSIVE_ <", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveLessThanOrEqualTo(Short value) {
            addCriterion("EXCLUSIVE_ <=", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveIn(List<Short> values) {
            addCriterion("EXCLUSIVE_ in", values, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotIn(List<Short> values) {
            addCriterion("EXCLUSIVE_ not in", values, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveBetween(Short value1, Short value2) {
            addCriterion("EXCLUSIVE_ between", value1, value2, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotBetween(Short value1, Short value2) {
            addCriterion("EXCLUSIVE_ not between", value1, value2, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExecutionIdIsNull() {
            addCriterion("EXECUTION_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andExecutionIdIsNotNull() {
            addCriterion("EXECUTION_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionIdEqualTo(Object value) {
            addCriterion("EXECUTION_ID_ =", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdNotEqualTo(Object value) {
            addCriterion("EXECUTION_ID_ <>", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdGreaterThan(Object value) {
            addCriterion("EXECUTION_ID_ >", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdGreaterThanOrEqualTo(Object value) {
            addCriterion("EXECUTION_ID_ >=", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdLessThan(Object value) {
            addCriterion("EXECUTION_ID_ <", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdLessThanOrEqualTo(Object value) {
            addCriterion("EXECUTION_ID_ <=", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdIn(List<Object> values) {
            addCriterion("EXECUTION_ID_ in", values, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdNotIn(List<Object> values) {
            addCriterion("EXECUTION_ID_ not in", values, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdBetween(Object value1, Object value2) {
            addCriterion("EXECUTION_ID_ between", value1, value2, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdNotBetween(Object value1, Object value2) {
            addCriterion("EXECUTION_ID_ not between", value1, value2, "executionId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("PROCESS_INSTANCE_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("PROCESS_INSTANCE_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(Object value) {
            addCriterion("PROCESS_INSTANCE_ID_ =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(Object value) {
            addCriterion("PROCESS_INSTANCE_ID_ <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(Object value) {
            addCriterion("PROCESS_INSTANCE_ID_ >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(Object value) {
            addCriterion("PROCESS_INSTANCE_ID_ >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(Object value) {
            addCriterion("PROCESS_INSTANCE_ID_ <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(Object value) {
            addCriterion("PROCESS_INSTANCE_ID_ <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<Object> values) {
            addCriterion("PROCESS_INSTANCE_ID_ in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<Object> values) {
            addCriterion("PROCESS_INSTANCE_ID_ not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(Object value1, Object value2) {
            addCriterion("PROCESS_INSTANCE_ID_ between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(Object value1, Object value2) {
            addCriterion("PROCESS_INSTANCE_ID_ not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIsNull() {
            addCriterion("PROC_DEF_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIsNotNull() {
            addCriterion("PROC_DEF_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andProcDefIdEqualTo(Object value) {
            addCriterion("PROC_DEF_ID_ =", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotEqualTo(Object value) {
            addCriterion("PROC_DEF_ID_ <>", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdGreaterThan(Object value) {
            addCriterion("PROC_DEF_ID_ >", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdGreaterThanOrEqualTo(Object value) {
            addCriterion("PROC_DEF_ID_ >=", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdLessThan(Object value) {
            addCriterion("PROC_DEF_ID_ <", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdLessThanOrEqualTo(Object value) {
            addCriterion("PROC_DEF_ID_ <=", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIn(List<Object> values) {
            addCriterion("PROC_DEF_ID_ in", values, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotIn(List<Object> values) {
            addCriterion("PROC_DEF_ID_ not in", values, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdBetween(Object value1, Object value2) {
            addCriterion("PROC_DEF_ID_ between", value1, value2, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotBetween(Object value1, Object value2) {
            addCriterion("PROC_DEF_ID_ not between", value1, value2, "procDefId");
            return (Criteria) this;
        }

        public Criteria andRetriesIsNull() {
            addCriterion("RETRIES_ is null");
            return (Criteria) this;
        }

        public Criteria andRetriesIsNotNull() {
            addCriterion("RETRIES_ is not null");
            return (Criteria) this;
        }

        public Criteria andRetriesEqualTo(BigDecimal value) {
            addCriterion("RETRIES_ =", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesNotEqualTo(BigDecimal value) {
            addCriterion("RETRIES_ <>", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesGreaterThan(BigDecimal value) {
            addCriterion("RETRIES_ >", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETRIES_ >=", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesLessThan(BigDecimal value) {
            addCriterion("RETRIES_ <", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETRIES_ <=", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesIn(List<BigDecimal> values) {
            addCriterion("RETRIES_ in", values, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesNotIn(List<BigDecimal> values) {
            addCriterion("RETRIES_ not in", values, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETRIES_ between", value1, value2, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETRIES_ not between", value1, value2, "retries");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdIsNull() {
            addCriterion("EXCEPTION_STACK_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdIsNotNull() {
            addCriterion("EXCEPTION_STACK_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdEqualTo(Object value) {
            addCriterion("EXCEPTION_STACK_ID_ =", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdNotEqualTo(Object value) {
            addCriterion("EXCEPTION_STACK_ID_ <>", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdGreaterThan(Object value) {
            addCriterion("EXCEPTION_STACK_ID_ >", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdGreaterThanOrEqualTo(Object value) {
            addCriterion("EXCEPTION_STACK_ID_ >=", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdLessThan(Object value) {
            addCriterion("EXCEPTION_STACK_ID_ <", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdLessThanOrEqualTo(Object value) {
            addCriterion("EXCEPTION_STACK_ID_ <=", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdIn(List<Object> values) {
            addCriterion("EXCEPTION_STACK_ID_ in", values, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdNotIn(List<Object> values) {
            addCriterion("EXCEPTION_STACK_ID_ not in", values, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdBetween(Object value1, Object value2) {
            addCriterion("EXCEPTION_STACK_ID_ between", value1, value2, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdNotBetween(Object value1, Object value2) {
            addCriterion("EXCEPTION_STACK_ID_ not between", value1, value2, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgIsNull() {
            addCriterion("EXCEPTION_MSG_ is null");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgIsNotNull() {
            addCriterion("EXCEPTION_MSG_ is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgEqualTo(Object value) {
            addCriterion("EXCEPTION_MSG_ =", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgNotEqualTo(Object value) {
            addCriterion("EXCEPTION_MSG_ <>", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgGreaterThan(Object value) {
            addCriterion("EXCEPTION_MSG_ >", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgGreaterThanOrEqualTo(Object value) {
            addCriterion("EXCEPTION_MSG_ >=", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgLessThan(Object value) {
            addCriterion("EXCEPTION_MSG_ <", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgLessThanOrEqualTo(Object value) {
            addCriterion("EXCEPTION_MSG_ <=", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgIn(List<Object> values) {
            addCriterion("EXCEPTION_MSG_ in", values, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgNotIn(List<Object> values) {
            addCriterion("EXCEPTION_MSG_ not in", values, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgBetween(Object value1, Object value2) {
            addCriterion("EXCEPTION_MSG_ between", value1, value2, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgNotBetween(Object value1, Object value2) {
            addCriterion("EXCEPTION_MSG_ not between", value1, value2, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNull() {
            addCriterion("DUEDATE_ is null");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNotNull() {
            addCriterion("DUEDATE_ is not null");
            return (Criteria) this;
        }

        public Criteria andDuedateEqualTo(Date value) {
            addCriterion("DUEDATE_ =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(Date value) {
            addCriterion("DUEDATE_ <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(Date value) {
            addCriterion("DUEDATE_ >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("DUEDATE_ >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(Date value) {
            addCriterion("DUEDATE_ <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(Date value) {
            addCriterion("DUEDATE_ <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<Date> values) {
            addCriterion("DUEDATE_ in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<Date> values) {
            addCriterion("DUEDATE_ not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(Date value1, Date value2) {
            addCriterion("DUEDATE_ between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(Date value1, Date value2) {
            addCriterion("DUEDATE_ not between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andRepeatIsNull() {
            addCriterion("REPEAT_ is null");
            return (Criteria) this;
        }

        public Criteria andRepeatIsNotNull() {
            addCriterion("REPEAT_ is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatEqualTo(Object value) {
            addCriterion("REPEAT_ =", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotEqualTo(Object value) {
            addCriterion("REPEAT_ <>", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatGreaterThan(Object value) {
            addCriterion("REPEAT_ >", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatGreaterThanOrEqualTo(Object value) {
            addCriterion("REPEAT_ >=", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatLessThan(Object value) {
            addCriterion("REPEAT_ <", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatLessThanOrEqualTo(Object value) {
            addCriterion("REPEAT_ <=", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatIn(List<Object> values) {
            addCriterion("REPEAT_ in", values, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotIn(List<Object> values) {
            addCriterion("REPEAT_ not in", values, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatBetween(Object value1, Object value2) {
            addCriterion("REPEAT_ between", value1, value2, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotBetween(Object value1, Object value2) {
            addCriterion("REPEAT_ not between", value1, value2, "repeat");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeIsNull() {
            addCriterion("HANDLER_TYPE_ is null");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeIsNotNull() {
            addCriterion("HANDLER_TYPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeEqualTo(Object value) {
            addCriterion("HANDLER_TYPE_ =", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeNotEqualTo(Object value) {
            addCriterion("HANDLER_TYPE_ <>", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeGreaterThan(Object value) {
            addCriterion("HANDLER_TYPE_ >", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("HANDLER_TYPE_ >=", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeLessThan(Object value) {
            addCriterion("HANDLER_TYPE_ <", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeLessThanOrEqualTo(Object value) {
            addCriterion("HANDLER_TYPE_ <=", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeIn(List<Object> values) {
            addCriterion("HANDLER_TYPE_ in", values, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeNotIn(List<Object> values) {
            addCriterion("HANDLER_TYPE_ not in", values, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeBetween(Object value1, Object value2) {
            addCriterion("HANDLER_TYPE_ between", value1, value2, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeNotBetween(Object value1, Object value2) {
            addCriterion("HANDLER_TYPE_ not between", value1, value2, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgIsNull() {
            addCriterion("HANDLER_CFG_ is null");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgIsNotNull() {
            addCriterion("HANDLER_CFG_ is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgEqualTo(Object value) {
            addCriterion("HANDLER_CFG_ =", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgNotEqualTo(Object value) {
            addCriterion("HANDLER_CFG_ <>", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgGreaterThan(Object value) {
            addCriterion("HANDLER_CFG_ >", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgGreaterThanOrEqualTo(Object value) {
            addCriterion("HANDLER_CFG_ >=", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgLessThan(Object value) {
            addCriterion("HANDLER_CFG_ <", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgLessThanOrEqualTo(Object value) {
            addCriterion("HANDLER_CFG_ <=", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgIn(List<Object> values) {
            addCriterion("HANDLER_CFG_ in", values, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgNotIn(List<Object> values) {
            addCriterion("HANDLER_CFG_ not in", values, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgBetween(Object value1, Object value2) {
            addCriterion("HANDLER_CFG_ between", value1, value2, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgNotBetween(Object value1, Object value2) {
            addCriterion("HANDLER_CFG_ not between", value1, value2, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Object value) {
            addCriterion("TENANT_ID_ =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Object value) {
            addCriterion("TENANT_ID_ <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Object value) {
            addCriterion("TENANT_ID_ >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Object value) {
            addCriterion("TENANT_ID_ >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Object value) {
            addCriterion("TENANT_ID_ <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Object value) {
            addCriterion("TENANT_ID_ <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Object> values) {
            addCriterion("TENANT_ID_ in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Object> values) {
            addCriterion("TENANT_ID_ not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Object value1, Object value2) {
            addCriterion("TENANT_ID_ between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Object value1, Object value2) {
            addCriterion("TENANT_ID_ not between", value1, value2, "tenantId");
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