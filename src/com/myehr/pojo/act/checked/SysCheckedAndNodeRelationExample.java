package com.myehr.pojo.act.checked;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCheckedAndNodeRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysCheckedAndNodeRelationExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andActNodeIdIsNull() {
            addCriterion("ACT_NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andActNodeIdIsNotNull() {
            addCriterion("ACT_NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActNodeIdEqualTo(String value) {
            addCriterion("ACT_NODE_ID =", value, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdNotEqualTo(String value) {
            addCriterion("ACT_NODE_ID <>", value, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdGreaterThan(String value) {
            addCriterion("ACT_NODE_ID >", value, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_NODE_ID >=", value, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdLessThan(String value) {
            addCriterion("ACT_NODE_ID <", value, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdLessThanOrEqualTo(String value) {
            addCriterion("ACT_NODE_ID <=", value, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdLike(String value) {
            addCriterion("ACT_NODE_ID like", value, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdNotLike(String value) {
            addCriterion("ACT_NODE_ID not like", value, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdIn(List<String> values) {
            addCriterion("ACT_NODE_ID in", values, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdNotIn(List<String> values) {
            addCriterion("ACT_NODE_ID not in", values, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdBetween(String value1, String value2) {
            addCriterion("ACT_NODE_ID between", value1, value2, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeIdNotBetween(String value1, String value2) {
            addCriterion("ACT_NODE_ID not between", value1, value2, "actNodeId");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyIsNull() {
            addCriterion("ACT_NODE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyIsNotNull() {
            addCriterion("ACT_NODE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyEqualTo(String value) {
            addCriterion("ACT_NODE_KEY =", value, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyNotEqualTo(String value) {
            addCriterion("ACT_NODE_KEY <>", value, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyGreaterThan(String value) {
            addCriterion("ACT_NODE_KEY >", value, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_NODE_KEY >=", value, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyLessThan(String value) {
            addCriterion("ACT_NODE_KEY <", value, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyLessThanOrEqualTo(String value) {
            addCriterion("ACT_NODE_KEY <=", value, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyLike(String value) {
            addCriterion("ACT_NODE_KEY like", value, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyNotLike(String value) {
            addCriterion("ACT_NODE_KEY not like", value, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyIn(List<String> values) {
            addCriterion("ACT_NODE_KEY in", values, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyNotIn(List<String> values) {
            addCriterion("ACT_NODE_KEY not in", values, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyBetween(String value1, String value2) {
            addCriterion("ACT_NODE_KEY between", value1, value2, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andActNodeKeyNotBetween(String value1, String value2) {
            addCriterion("ACT_NODE_KEY not between", value1, value2, "actNodeKey");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeIsNull() {
            addCriterion("CHECKED_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeIsNotNull() {
            addCriterion("CHECKED_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeEqualTo(String value) {
            addCriterion("CHECKED_CODE =", value, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeNotEqualTo(String value) {
            addCriterion("CHECKED_CODE <>", value, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeGreaterThan(String value) {
            addCriterion("CHECKED_CODE >", value, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKED_CODE >=", value, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeLessThan(String value) {
            addCriterion("CHECKED_CODE <", value, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeLessThanOrEqualTo(String value) {
            addCriterion("CHECKED_CODE <=", value, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeLike(String value) {
            addCriterion("CHECKED_CODE like", value, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeNotLike(String value) {
            addCriterion("CHECKED_CODE not like", value, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeIn(List<String> values) {
            addCriterion("CHECKED_CODE in", values, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeNotIn(List<String> values) {
            addCriterion("CHECKED_CODE not in", values, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeBetween(String value1, String value2) {
            addCriterion("CHECKED_CODE between", value1, value2, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedCodeNotBetween(String value1, String value2) {
            addCriterion("CHECKED_CODE not between", value1, value2, "checkedCode");
            return (Criteria) this;
        }

        public Criteria andCheckedNameIsNull() {
            addCriterion("CHECKED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCheckedNameIsNotNull() {
            addCriterion("CHECKED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedNameEqualTo(String value) {
            addCriterion("CHECKED_NAME =", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameNotEqualTo(String value) {
            addCriterion("CHECKED_NAME <>", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameGreaterThan(String value) {
            addCriterion("CHECKED_NAME >", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKED_NAME >=", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameLessThan(String value) {
            addCriterion("CHECKED_NAME <", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameLessThanOrEqualTo(String value) {
            addCriterion("CHECKED_NAME <=", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameLike(String value) {
            addCriterion("CHECKED_NAME like", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameNotLike(String value) {
            addCriterion("CHECKED_NAME not like", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameIn(List<String> values) {
            addCriterion("CHECKED_NAME in", values, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameNotIn(List<String> values) {
            addCriterion("CHECKED_NAME not in", values, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameBetween(String value1, String value2) {
            addCriterion("CHECKED_NAME between", value1, value2, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameNotBetween(String value1, String value2) {
            addCriterion("CHECKED_NAME not between", value1, value2, "checkedName");
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

        public Criteria andPowerIsNull() {
            addCriterion("POWER is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("POWER is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("POWER =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("POWER <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("POWER >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("POWER >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("POWER <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("POWER <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("POWER like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("POWER not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("POWER in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("POWER not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("POWER between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("POWER not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNull() {
            addCriterion("CREATER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIsNotNull() {
            addCriterion("CREATER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeEqualTo(Date value) {
            addCriterion("CREATER_TIME =", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotEqualTo(Date value) {
            addCriterion("CREATER_TIME <>", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThan(Date value) {
            addCriterion("CREATER_TIME >", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATER_TIME >=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThan(Date value) {
            addCriterion("CREATER_TIME <", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATER_TIME <=", value, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeIn(List<Date> values) {
            addCriterion("CREATER_TIME in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotIn(List<Date> values) {
            addCriterion("CREATER_TIME not in", values, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeBetween(Date value1, Date value2) {
            addCriterion("CREATER_TIME between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATER_TIME not between", value1, value2, "createrTime");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIsNull() {
            addCriterion("CREATER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIsNotNull() {
            addCriterion("CREATER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterNameEqualTo(String value) {
            addCriterion("CREATER_NAME =", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotEqualTo(String value) {
            addCriterion("CREATER_NAME <>", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameGreaterThan(String value) {
            addCriterion("CREATER_NAME >", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER_NAME >=", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLessThan(String value) {
            addCriterion("CREATER_NAME <", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLessThanOrEqualTo(String value) {
            addCriterion("CREATER_NAME <=", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameLike(String value) {
            addCriterion("CREATER_NAME like", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotLike(String value) {
            addCriterion("CREATER_NAME not like", value, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameIn(List<String> values) {
            addCriterion("CREATER_NAME in", values, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotIn(List<String> values) {
            addCriterion("CREATER_NAME not in", values, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameBetween(String value1, String value2) {
            addCriterion("CREATER_NAME between", value1, value2, "createrName");
            return (Criteria) this;
        }

        public Criteria andCreaterNameNotBetween(String value1, String value2) {
            addCriterion("CREATER_NAME not between", value1, value2, "createrName");
            return (Criteria) this;
        }

        public Criteria andDutyTypeIsNull() {
            addCriterion("DUTY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDutyTypeIsNotNull() {
            addCriterion("DUTY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDutyTypeEqualTo(String value) {
            addCriterion("DUTY_TYPE =", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeNotEqualTo(String value) {
            addCriterion("DUTY_TYPE <>", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeGreaterThan(String value) {
            addCriterion("DUTY_TYPE >", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_TYPE >=", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeLessThan(String value) {
            addCriterion("DUTY_TYPE <", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeLessThanOrEqualTo(String value) {
            addCriterion("DUTY_TYPE <=", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeLike(String value) {
            addCriterion("DUTY_TYPE like", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeNotLike(String value) {
            addCriterion("DUTY_TYPE not like", value, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeIn(List<String> values) {
            addCriterion("DUTY_TYPE in", values, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeNotIn(List<String> values) {
            addCriterion("DUTY_TYPE not in", values, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeBetween(String value1, String value2) {
            addCriterion("DUTY_TYPE between", value1, value2, "dutyType");
            return (Criteria) this;
        }

        public Criteria andDutyTypeNotBetween(String value1, String value2) {
            addCriterion("DUTY_TYPE not between", value1, value2, "dutyType");
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