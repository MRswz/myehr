package com.myehr.pojo.activiti;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActHiActinstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActHiActinstExample() {
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

        public Criteria andActIdIsNull() {
            addCriterion("ACT_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("ACT_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Object value) {
            addCriterion("ACT_ID_ =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Object value) {
            addCriterion("ACT_ID_ <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Object value) {
            addCriterion("ACT_ID_ >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Object value) {
            addCriterion("ACT_ID_ >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Object value) {
            addCriterion("ACT_ID_ <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Object value) {
            addCriterion("ACT_ID_ <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Object> values) {
            addCriterion("ACT_ID_ in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Object> values) {
            addCriterion("ACT_ID_ not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Object value1, Object value2) {
            addCriterion("ACT_ID_ between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Object value1, Object value2) {
            addCriterion("ACT_ID_ not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Object value) {
            addCriterion("TASK_ID_ =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Object value) {
            addCriterion("TASK_ID_ <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Object value) {
            addCriterion("TASK_ID_ >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Object value) {
            addCriterion("TASK_ID_ >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Object value) {
            addCriterion("TASK_ID_ <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Object value) {
            addCriterion("TASK_ID_ <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Object> values) {
            addCriterion("TASK_ID_ in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Object> values) {
            addCriterion("TASK_ID_ not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Object value1, Object value2) {
            addCriterion("TASK_ID_ between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Object value1, Object value2) {
            addCriterion("TASK_ID_ not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdIsNull() {
            addCriterion("CALL_PROC_INST_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdIsNotNull() {
            addCriterion("CALL_PROC_INST_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdEqualTo(Object value) {
            addCriterion("CALL_PROC_INST_ID_ =", value, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdNotEqualTo(Object value) {
            addCriterion("CALL_PROC_INST_ID_ <>", value, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdGreaterThan(Object value) {
            addCriterion("CALL_PROC_INST_ID_ >", value, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdGreaterThanOrEqualTo(Object value) {
            addCriterion("CALL_PROC_INST_ID_ >=", value, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdLessThan(Object value) {
            addCriterion("CALL_PROC_INST_ID_ <", value, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdLessThanOrEqualTo(Object value) {
            addCriterion("CALL_PROC_INST_ID_ <=", value, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdIn(List<Object> values) {
            addCriterion("CALL_PROC_INST_ID_ in", values, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdNotIn(List<Object> values) {
            addCriterion("CALL_PROC_INST_ID_ not in", values, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdBetween(Object value1, Object value2) {
            addCriterion("CALL_PROC_INST_ID_ between", value1, value2, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andCallProcInstIdNotBetween(Object value1, Object value2) {
            addCriterion("CALL_PROC_INST_ID_ not between", value1, value2, "callProcInstId");
            return (Criteria) this;
        }

        public Criteria andActNameIsNull() {
            addCriterion("ACT_NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("ACT_NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(Object value) {
            addCriterion("ACT_NAME_ =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(Object value) {
            addCriterion("ACT_NAME_ <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(Object value) {
            addCriterion("ACT_NAME_ >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(Object value) {
            addCriterion("ACT_NAME_ >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(Object value) {
            addCriterion("ACT_NAME_ <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(Object value) {
            addCriterion("ACT_NAME_ <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<Object> values) {
            addCriterion("ACT_NAME_ in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<Object> values) {
            addCriterion("ACT_NAME_ not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(Object value1, Object value2) {
            addCriterion("ACT_NAME_ between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(Object value1, Object value2) {
            addCriterion("ACT_NAME_ not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNull() {
            addCriterion("ACT_TYPE_ is null");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNotNull() {
            addCriterion("ACT_TYPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andActTypeEqualTo(Object value) {
            addCriterion("ACT_TYPE_ =", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotEqualTo(Object value) {
            addCriterion("ACT_TYPE_ <>", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThan(Object value) {
            addCriterion("ACT_TYPE_ >", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThanOrEqualTo(Object value) {
            addCriterion("ACT_TYPE_ >=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThan(Object value) {
            addCriterion("ACT_TYPE_ <", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThanOrEqualTo(Object value) {
            addCriterion("ACT_TYPE_ <=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeIn(List<Object> values) {
            addCriterion("ACT_TYPE_ in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotIn(List<Object> values) {
            addCriterion("ACT_TYPE_ not in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeBetween(Object value1, Object value2) {
            addCriterion("ACT_TYPE_ between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotBetween(Object value1, Object value2) {
            addCriterion("ACT_TYPE_ not between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andAssigneeIsNull() {
            addCriterion("ASSIGNEE_ is null");
            return (Criteria) this;
        }

        public Criteria andAssigneeIsNotNull() {
            addCriterion("ASSIGNEE_ is not null");
            return (Criteria) this;
        }

        public Criteria andAssigneeEqualTo(Object value) {
            addCriterion("ASSIGNEE_ =", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeNotEqualTo(Object value) {
            addCriterion("ASSIGNEE_ <>", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeGreaterThan(Object value) {
            addCriterion("ASSIGNEE_ >", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeGreaterThanOrEqualTo(Object value) {
            addCriterion("ASSIGNEE_ >=", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeLessThan(Object value) {
            addCriterion("ASSIGNEE_ <", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeLessThanOrEqualTo(Object value) {
            addCriterion("ASSIGNEE_ <=", value, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeIn(List<Object> values) {
            addCriterion("ASSIGNEE_ in", values, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeNotIn(List<Object> values) {
            addCriterion("ASSIGNEE_ not in", values, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeBetween(Object value1, Object value2) {
            addCriterion("ASSIGNEE_ between", value1, value2, "assignee");
            return (Criteria) this;
        }

        public Criteria andAssigneeNotBetween(Object value1, Object value2) {
            addCriterion("ASSIGNEE_ not between", value1, value2, "assignee");
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