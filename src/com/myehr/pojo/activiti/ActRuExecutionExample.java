package com.myehr.pojo.activiti;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActRuExecutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActRuExecutionExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Object value) {
            addCriterion("PARENT_ID_ =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Object value) {
            addCriterion("PARENT_ID_ <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Object value) {
            addCriterion("PARENT_ID_ >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Object value) {
            addCriterion("PARENT_ID_ >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Object value) {
            addCriterion("PARENT_ID_ <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Object value) {
            addCriterion("PARENT_ID_ <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Object> values) {
            addCriterion("PARENT_ID_ in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Object> values) {
            addCriterion("PARENT_ID_ not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Object value1, Object value2) {
            addCriterion("PARENT_ID_ between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Object value1, Object value2) {
            addCriterion("PARENT_ID_ not between", value1, value2, "parentId");
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

        public Criteria andSuperExecIsNull() {
            addCriterion("SUPER_EXEC_ is null");
            return (Criteria) this;
        }

        public Criteria andSuperExecIsNotNull() {
            addCriterion("SUPER_EXEC_ is not null");
            return (Criteria) this;
        }

        public Criteria andSuperExecEqualTo(Object value) {
            addCriterion("SUPER_EXEC_ =", value, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecNotEqualTo(Object value) {
            addCriterion("SUPER_EXEC_ <>", value, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecGreaterThan(Object value) {
            addCriterion("SUPER_EXEC_ >", value, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecGreaterThanOrEqualTo(Object value) {
            addCriterion("SUPER_EXEC_ >=", value, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecLessThan(Object value) {
            addCriterion("SUPER_EXEC_ <", value, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecLessThanOrEqualTo(Object value) {
            addCriterion("SUPER_EXEC_ <=", value, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecIn(List<Object> values) {
            addCriterion("SUPER_EXEC_ in", values, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecNotIn(List<Object> values) {
            addCriterion("SUPER_EXEC_ not in", values, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecBetween(Object value1, Object value2) {
            addCriterion("SUPER_EXEC_ between", value1, value2, "superExec");
            return (Criteria) this;
        }

        public Criteria andSuperExecNotBetween(Object value1, Object value2) {
            addCriterion("SUPER_EXEC_ not between", value1, value2, "superExec");
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

        public Criteria andIsActiveIsNull() {
            addCriterion("IS_ACTIVE_ is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("IS_ACTIVE_ is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Short value) {
            addCriterion("IS_ACTIVE_ =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Short value) {
            addCriterion("IS_ACTIVE_ <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Short value) {
            addCriterion("IS_ACTIVE_ >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_ACTIVE_ >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Short value) {
            addCriterion("IS_ACTIVE_ <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Short value) {
            addCriterion("IS_ACTIVE_ <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Short> values) {
            addCriterion("IS_ACTIVE_ in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Short> values) {
            addCriterion("IS_ACTIVE_ not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Short value1, Short value2) {
            addCriterion("IS_ACTIVE_ between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Short value1, Short value2) {
            addCriterion("IS_ACTIVE_ not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentIsNull() {
            addCriterion("IS_CONCURRENT_ is null");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentIsNotNull() {
            addCriterion("IS_CONCURRENT_ is not null");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentEqualTo(Short value) {
            addCriterion("IS_CONCURRENT_ =", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentNotEqualTo(Short value) {
            addCriterion("IS_CONCURRENT_ <>", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentGreaterThan(Short value) {
            addCriterion("IS_CONCURRENT_ >", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_CONCURRENT_ >=", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentLessThan(Short value) {
            addCriterion("IS_CONCURRENT_ <", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentLessThanOrEqualTo(Short value) {
            addCriterion("IS_CONCURRENT_ <=", value, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentIn(List<Short> values) {
            addCriterion("IS_CONCURRENT_ in", values, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentNotIn(List<Short> values) {
            addCriterion("IS_CONCURRENT_ not in", values, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentBetween(Short value1, Short value2) {
            addCriterion("IS_CONCURRENT_ between", value1, value2, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsConcurrentNotBetween(Short value1, Short value2) {
            addCriterion("IS_CONCURRENT_ not between", value1, value2, "isConcurrent");
            return (Criteria) this;
        }

        public Criteria andIsScopeIsNull() {
            addCriterion("IS_SCOPE_ is null");
            return (Criteria) this;
        }

        public Criteria andIsScopeIsNotNull() {
            addCriterion("IS_SCOPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andIsScopeEqualTo(Short value) {
            addCriterion("IS_SCOPE_ =", value, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeNotEqualTo(Short value) {
            addCriterion("IS_SCOPE_ <>", value, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeGreaterThan(Short value) {
            addCriterion("IS_SCOPE_ >", value, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_SCOPE_ >=", value, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeLessThan(Short value) {
            addCriterion("IS_SCOPE_ <", value, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeLessThanOrEqualTo(Short value) {
            addCriterion("IS_SCOPE_ <=", value, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeIn(List<Short> values) {
            addCriterion("IS_SCOPE_ in", values, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeNotIn(List<Short> values) {
            addCriterion("IS_SCOPE_ not in", values, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeBetween(Short value1, Short value2) {
            addCriterion("IS_SCOPE_ between", value1, value2, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsScopeNotBetween(Short value1, Short value2) {
            addCriterion("IS_SCOPE_ not between", value1, value2, "isScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeIsNull() {
            addCriterion("IS_EVENT_SCOPE_ is null");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeIsNotNull() {
            addCriterion("IS_EVENT_SCOPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeEqualTo(Short value) {
            addCriterion("IS_EVENT_SCOPE_ =", value, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeNotEqualTo(Short value) {
            addCriterion("IS_EVENT_SCOPE_ <>", value, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeGreaterThan(Short value) {
            addCriterion("IS_EVENT_SCOPE_ >", value, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_EVENT_SCOPE_ >=", value, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeLessThan(Short value) {
            addCriterion("IS_EVENT_SCOPE_ <", value, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeLessThanOrEqualTo(Short value) {
            addCriterion("IS_EVENT_SCOPE_ <=", value, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeIn(List<Short> values) {
            addCriterion("IS_EVENT_SCOPE_ in", values, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeNotIn(List<Short> values) {
            addCriterion("IS_EVENT_SCOPE_ not in", values, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeBetween(Short value1, Short value2) {
            addCriterion("IS_EVENT_SCOPE_ between", value1, value2, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andIsEventScopeNotBetween(Short value1, Short value2) {
            addCriterion("IS_EVENT_SCOPE_ not between", value1, value2, "isEventScope");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateIsNull() {
            addCriterion("SUSPENSION_STATE_ is null");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateIsNotNull() {
            addCriterion("SUSPENSION_STATE_ is not null");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateEqualTo(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ =", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateNotEqualTo(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ <>", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateGreaterThan(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ >", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ >=", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateLessThan(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ <", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ <=", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateIn(List<BigDecimal> values) {
            addCriterion("SUSPENSION_STATE_ in", values, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateNotIn(List<BigDecimal> values) {
            addCriterion("SUSPENSION_STATE_ not in", values, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUSPENSION_STATE_ between", value1, value2, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUSPENSION_STATE_ not between", value1, value2, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateIsNull() {
            addCriterion("CACHED_ENT_STATE_ is null");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateIsNotNull() {
            addCriterion("CACHED_ENT_STATE_ is not null");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateEqualTo(BigDecimal value) {
            addCriterion("CACHED_ENT_STATE_ =", value, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateNotEqualTo(BigDecimal value) {
            addCriterion("CACHED_ENT_STATE_ <>", value, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateGreaterThan(BigDecimal value) {
            addCriterion("CACHED_ENT_STATE_ >", value, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CACHED_ENT_STATE_ >=", value, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateLessThan(BigDecimal value) {
            addCriterion("CACHED_ENT_STATE_ <", value, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CACHED_ENT_STATE_ <=", value, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateIn(List<BigDecimal> values) {
            addCriterion("CACHED_ENT_STATE_ in", values, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateNotIn(List<BigDecimal> values) {
            addCriterion("CACHED_ENT_STATE_ not in", values, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CACHED_ENT_STATE_ between", value1, value2, "cachedEntState");
            return (Criteria) this;
        }

        public Criteria andCachedEntStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CACHED_ENT_STATE_ not between", value1, value2, "cachedEntState");
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

        public Criteria andLockTimeIsNull() {
            addCriterion("LOCK_TIME_ is null");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNotNull() {
            addCriterion("LOCK_TIME_ is not null");
            return (Criteria) this;
        }

        public Criteria andLockTimeEqualTo(Date value) {
            addCriterion("LOCK_TIME_ =", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotEqualTo(Date value) {
            addCriterion("LOCK_TIME_ <>", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThan(Date value) {
            addCriterion("LOCK_TIME_ >", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_TIME_ >=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThan(Date value) {
            addCriterion("LOCK_TIME_ <", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_TIME_ <=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeIn(List<Date> values) {
            addCriterion("LOCK_TIME_ in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotIn(List<Date> values) {
            addCriterion("LOCK_TIME_ not in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeBetween(Date value1, Date value2) {
            addCriterion("LOCK_TIME_ between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_TIME_ not between", value1, value2, "lockTime");
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