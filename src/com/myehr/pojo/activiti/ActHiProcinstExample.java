package com.myehr.pojo.activiti;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActHiProcinstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActHiProcinstExample() {
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

        public Criteria andProcInstIdIsNull() {
            addCriterion("PROC_INST_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andProcInstIdIsNotNull() {
            addCriterion("PROC_INST_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andProcInstIdEqualTo(Object value) {
            addCriterion("PROC_INST_ID_ =", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotEqualTo(Object value) {
            addCriterion("PROC_INST_ID_ <>", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdGreaterThan(Object value) {
            addCriterion("PROC_INST_ID_ >", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdGreaterThanOrEqualTo(Object value) {
            addCriterion("PROC_INST_ID_ >=", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdLessThan(Object value) {
            addCriterion("PROC_INST_ID_ <", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdLessThanOrEqualTo(Object value) {
            addCriterion("PROC_INST_ID_ <=", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdIn(List<Object> values) {
            addCriterion("PROC_INST_ID_ in", values, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotIn(List<Object> values) {
            addCriterion("PROC_INST_ID_ not in", values, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdBetween(Object value1, Object value2) {
            addCriterion("PROC_INST_ID_ between", value1, value2, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotBetween(Object value1, Object value2) {
            addCriterion("PROC_INST_ID_ not between", value1, value2, "procInstId");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyIsNull() {
            addCriterion("BUSINESS_KEY_ is null");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyIsNotNull() {
            addCriterion("BUSINESS_KEY_ is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyEqualTo(Object value) {
            addCriterion("BUSINESS_KEY_ =", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyNotEqualTo(Object value) {
            addCriterion("BUSINESS_KEY_ <>", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyGreaterThan(Object value) {
            addCriterion("BUSINESS_KEY_ >", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyGreaterThanOrEqualTo(Object value) {
            addCriterion("BUSINESS_KEY_ >=", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyLessThan(Object value) {
            addCriterion("BUSINESS_KEY_ <", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyLessThanOrEqualTo(Object value) {
            addCriterion("BUSINESS_KEY_ <=", value, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyIn(List<Object> values) {
            addCriterion("BUSINESS_KEY_ in", values, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyNotIn(List<Object> values) {
            addCriterion("BUSINESS_KEY_ not in", values, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyBetween(Object value1, Object value2) {
            addCriterion("BUSINESS_KEY_ between", value1, value2, "businessKey");
            return (Criteria) this;
        }

        public Criteria andBusinessKeyNotBetween(Object value1, Object value2) {
            addCriterion("BUSINESS_KEY_ not between", value1, value2, "businessKey");
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

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME_ is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME_ is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME_ =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME_ <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME_ >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME_ >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME_ <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME_ <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME_ in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME_ not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME_ between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME_ not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME_ is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME_ is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME_ =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME_ <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME_ >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME_ >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME_ <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME_ <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME_ in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME_ not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME_ between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME_ not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION_ is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION_ is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(BigDecimal value) {
            addCriterion("DURATION_ =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(BigDecimal value) {
            addCriterion("DURATION_ <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(BigDecimal value) {
            addCriterion("DURATION_ >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DURATION_ >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(BigDecimal value) {
            addCriterion("DURATION_ <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DURATION_ <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<BigDecimal> values) {
            addCriterion("DURATION_ in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<BigDecimal> values) {
            addCriterion("DURATION_ not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DURATION_ between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DURATION_ not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andStartUserIdIsNull() {
            addCriterion("START_USER_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andStartUserIdIsNotNull() {
            addCriterion("START_USER_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andStartUserIdEqualTo(Object value) {
            addCriterion("START_USER_ID_ =", value, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdNotEqualTo(Object value) {
            addCriterion("START_USER_ID_ <>", value, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdGreaterThan(Object value) {
            addCriterion("START_USER_ID_ >", value, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdGreaterThanOrEqualTo(Object value) {
            addCriterion("START_USER_ID_ >=", value, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdLessThan(Object value) {
            addCriterion("START_USER_ID_ <", value, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdLessThanOrEqualTo(Object value) {
            addCriterion("START_USER_ID_ <=", value, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdIn(List<Object> values) {
            addCriterion("START_USER_ID_ in", values, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdNotIn(List<Object> values) {
            addCriterion("START_USER_ID_ not in", values, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdBetween(Object value1, Object value2) {
            addCriterion("START_USER_ID_ between", value1, value2, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartUserIdNotBetween(Object value1, Object value2) {
            addCriterion("START_USER_ID_ not between", value1, value2, "startUserId");
            return (Criteria) this;
        }

        public Criteria andStartActIdIsNull() {
            addCriterion("START_ACT_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andStartActIdIsNotNull() {
            addCriterion("START_ACT_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andStartActIdEqualTo(Object value) {
            addCriterion("START_ACT_ID_ =", value, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdNotEqualTo(Object value) {
            addCriterion("START_ACT_ID_ <>", value, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdGreaterThan(Object value) {
            addCriterion("START_ACT_ID_ >", value, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdGreaterThanOrEqualTo(Object value) {
            addCriterion("START_ACT_ID_ >=", value, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdLessThan(Object value) {
            addCriterion("START_ACT_ID_ <", value, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdLessThanOrEqualTo(Object value) {
            addCriterion("START_ACT_ID_ <=", value, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdIn(List<Object> values) {
            addCriterion("START_ACT_ID_ in", values, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdNotIn(List<Object> values) {
            addCriterion("START_ACT_ID_ not in", values, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdBetween(Object value1, Object value2) {
            addCriterion("START_ACT_ID_ between", value1, value2, "startActId");
            return (Criteria) this;
        }

        public Criteria andStartActIdNotBetween(Object value1, Object value2) {
            addCriterion("START_ACT_ID_ not between", value1, value2, "startActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdIsNull() {
            addCriterion("END_ACT_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andEndActIdIsNotNull() {
            addCriterion("END_ACT_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andEndActIdEqualTo(Object value) {
            addCriterion("END_ACT_ID_ =", value, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdNotEqualTo(Object value) {
            addCriterion("END_ACT_ID_ <>", value, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdGreaterThan(Object value) {
            addCriterion("END_ACT_ID_ >", value, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdGreaterThanOrEqualTo(Object value) {
            addCriterion("END_ACT_ID_ >=", value, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdLessThan(Object value) {
            addCriterion("END_ACT_ID_ <", value, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdLessThanOrEqualTo(Object value) {
            addCriterion("END_ACT_ID_ <=", value, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdIn(List<Object> values) {
            addCriterion("END_ACT_ID_ in", values, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdNotIn(List<Object> values) {
            addCriterion("END_ACT_ID_ not in", values, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdBetween(Object value1, Object value2) {
            addCriterion("END_ACT_ID_ between", value1, value2, "endActId");
            return (Criteria) this;
        }

        public Criteria andEndActIdNotBetween(Object value1, Object value2) {
            addCriterion("END_ACT_ID_ not between", value1, value2, "endActId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdIsNull() {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdIsNotNull() {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdEqualTo(Object value) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ =", value, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdNotEqualTo(Object value) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ <>", value, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdGreaterThan(Object value) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ >", value, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdGreaterThanOrEqualTo(Object value) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ >=", value, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdLessThan(Object value) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ <", value, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdLessThanOrEqualTo(Object value) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ <=", value, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdIn(List<Object> values) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ in", values, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdNotIn(List<Object> values) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ not in", values, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdBetween(Object value1, Object value2) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ between", value1, value2, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andSuperProcessInstanceIdNotBetween(Object value1, Object value2) {
            addCriterion("SUPER_PROCESS_INSTANCE_ID_ not between", value1, value2, "superProcessInstanceId");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIsNull() {
            addCriterion("DELETE_REASON_ is null");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIsNotNull() {
            addCriterion("DELETE_REASON_ is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonEqualTo(Object value) {
            addCriterion("DELETE_REASON_ =", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonNotEqualTo(Object value) {
            addCriterion("DELETE_REASON_ <>", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonGreaterThan(Object value) {
            addCriterion("DELETE_REASON_ >", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonGreaterThanOrEqualTo(Object value) {
            addCriterion("DELETE_REASON_ >=", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonLessThan(Object value) {
            addCriterion("DELETE_REASON_ <", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonLessThanOrEqualTo(Object value) {
            addCriterion("DELETE_REASON_ <=", value, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonIn(List<Object> values) {
            addCriterion("DELETE_REASON_ in", values, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonNotIn(List<Object> values) {
            addCriterion("DELETE_REASON_ not in", values, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonBetween(Object value1, Object value2) {
            addCriterion("DELETE_REASON_ between", value1, value2, "deleteReason");
            return (Criteria) this;
        }

        public Criteria andDeleteReasonNotBetween(Object value1, Object value2) {
            addCriterion("DELETE_REASON_ not between", value1, value2, "deleteReason");
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

        public Criteria andNameIsNull() {
            addCriterion("NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(Object value) {
            addCriterion("NAME_ =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(Object value) {
            addCriterion("NAME_ <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(Object value) {
            addCriterion("NAME_ >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(Object value) {
            addCriterion("NAME_ >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(Object value) {
            addCriterion("NAME_ <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(Object value) {
            addCriterion("NAME_ <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<Object> values) {
            addCriterion("NAME_ in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<Object> values) {
            addCriterion("NAME_ not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(Object value1, Object value2) {
            addCriterion("NAME_ between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(Object value1, Object value2) {
            addCriterion("NAME_ not between", value1, value2, "name");
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