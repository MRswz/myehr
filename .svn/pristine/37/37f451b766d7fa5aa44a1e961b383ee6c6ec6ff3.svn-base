package com.myehr.pojo.sysuser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFieldLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFieldLogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(BigDecimal value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(BigDecimal value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(BigDecimal value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(BigDecimal value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<BigDecimal> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<BigDecimal> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogTableNameIsNull() {
            addCriterion("LOG_TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLogTableNameIsNotNull() {
            addCriterion("LOG_TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLogTableNameEqualTo(String value) {
            addCriterion("LOG_TABLE_NAME =", value, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameNotEqualTo(String value) {
            addCriterion("LOG_TABLE_NAME <>", value, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameGreaterThan(String value) {
            addCriterion("LOG_TABLE_NAME >", value, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TABLE_NAME >=", value, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameLessThan(String value) {
            addCriterion("LOG_TABLE_NAME <", value, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameLessThanOrEqualTo(String value) {
            addCriterion("LOG_TABLE_NAME <=", value, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameLike(String value) {
            addCriterion("LOG_TABLE_NAME like", value, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameNotLike(String value) {
            addCriterion("LOG_TABLE_NAME not like", value, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameIn(List<String> values) {
            addCriterion("LOG_TABLE_NAME in", values, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameNotIn(List<String> values) {
            addCriterion("LOG_TABLE_NAME not in", values, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameBetween(String value1, String value2) {
            addCriterion("LOG_TABLE_NAME between", value1, value2, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogTableNameNotBetween(String value1, String value2) {
            addCriterion("LOG_TABLE_NAME not between", value1, value2, "logTableName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameIsNull() {
            addCriterion("LOG_FIELD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameIsNotNull() {
            addCriterion("LOG_FIELD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameEqualTo(String value) {
            addCriterion("LOG_FIELD_NAME =", value, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameNotEqualTo(String value) {
            addCriterion("LOG_FIELD_NAME <>", value, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameGreaterThan(String value) {
            addCriterion("LOG_FIELD_NAME >", value, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_FIELD_NAME >=", value, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameLessThan(String value) {
            addCriterion("LOG_FIELD_NAME <", value, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameLessThanOrEqualTo(String value) {
            addCriterion("LOG_FIELD_NAME <=", value, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameLike(String value) {
            addCriterion("LOG_FIELD_NAME like", value, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameNotLike(String value) {
            addCriterion("LOG_FIELD_NAME not like", value, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameIn(List<String> values) {
            addCriterion("LOG_FIELD_NAME in", values, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameNotIn(List<String> values) {
            addCriterion("LOG_FIELD_NAME not in", values, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameBetween(String value1, String value2) {
            addCriterion("LOG_FIELD_NAME between", value1, value2, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldNameNotBetween(String value1, String value2) {
            addCriterion("LOG_FIELD_NAME not between", value1, value2, "logFieldName");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeIsNull() {
            addCriterion("LOG_FIELD_BEFORE is null");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeIsNotNull() {
            addCriterion("LOG_FIELD_BEFORE is not null");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeEqualTo(String value) {
            addCriterion("LOG_FIELD_BEFORE =", value, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeNotEqualTo(String value) {
            addCriterion("LOG_FIELD_BEFORE <>", value, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeGreaterThan(String value) {
            addCriterion("LOG_FIELD_BEFORE >", value, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_FIELD_BEFORE >=", value, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeLessThan(String value) {
            addCriterion("LOG_FIELD_BEFORE <", value, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeLessThanOrEqualTo(String value) {
            addCriterion("LOG_FIELD_BEFORE <=", value, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeLike(String value) {
            addCriterion("LOG_FIELD_BEFORE like", value, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeNotLike(String value) {
            addCriterion("LOG_FIELD_BEFORE not like", value, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeIn(List<String> values) {
            addCriterion("LOG_FIELD_BEFORE in", values, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeNotIn(List<String> values) {
            addCriterion("LOG_FIELD_BEFORE not in", values, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeBetween(String value1, String value2) {
            addCriterion("LOG_FIELD_BEFORE between", value1, value2, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldBeforeNotBetween(String value1, String value2) {
            addCriterion("LOG_FIELD_BEFORE not between", value1, value2, "logFieldBefore");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterIsNull() {
            addCriterion("LOG_FIELD_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterIsNotNull() {
            addCriterion("LOG_FIELD_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterEqualTo(String value) {
            addCriterion("LOG_FIELD_AFTER =", value, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterNotEqualTo(String value) {
            addCriterion("LOG_FIELD_AFTER <>", value, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterGreaterThan(String value) {
            addCriterion("LOG_FIELD_AFTER >", value, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_FIELD_AFTER >=", value, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterLessThan(String value) {
            addCriterion("LOG_FIELD_AFTER <", value, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterLessThanOrEqualTo(String value) {
            addCriterion("LOG_FIELD_AFTER <=", value, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterLike(String value) {
            addCriterion("LOG_FIELD_AFTER like", value, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterNotLike(String value) {
            addCriterion("LOG_FIELD_AFTER not like", value, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterIn(List<String> values) {
            addCriterion("LOG_FIELD_AFTER in", values, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterNotIn(List<String> values) {
            addCriterion("LOG_FIELD_AFTER not in", values, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterBetween(String value1, String value2) {
            addCriterion("LOG_FIELD_AFTER between", value1, value2, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogFieldAfterNotBetween(String value1, String value2) {
            addCriterion("LOG_FIELD_AFTER not between", value1, value2, "logFieldAfter");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(String value) {
            addCriterion("LOG_TYPE =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(String value) {
            addCriterion("LOG_TYPE <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(String value) {
            addCriterion("LOG_TYPE >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(String value) {
            addCriterion("LOG_TYPE <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(String value) {
            addCriterion("LOG_TYPE <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLike(String value) {
            addCriterion("LOG_TYPE like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotLike(String value) {
            addCriterion("LOG_TYPE not like", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<String> values) {
            addCriterion("LOG_TYPE in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<String> values) {
            addCriterion("LOG_TYPE not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(String value1, String value2) {
            addCriterion("LOG_TYPE between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(String value1, String value2) {
            addCriterion("LOG_TYPE not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("LOG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("LOG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("LOG_TIME =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("LOG_TIME <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("LOG_TIME >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOG_TIME >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("LOG_TIME <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOG_TIME <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("LOG_TIME in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("LOG_TIME not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("LOG_TIME between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOG_TIME not between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogOperatorIsNull() {
            addCriterion("LOG_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andLogOperatorIsNotNull() {
            addCriterion("LOG_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andLogOperatorEqualTo(String value) {
            addCriterion("LOG_OPERATOR =", value, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorNotEqualTo(String value) {
            addCriterion("LOG_OPERATOR <>", value, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorGreaterThan(String value) {
            addCriterion("LOG_OPERATOR >", value, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_OPERATOR >=", value, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorLessThan(String value) {
            addCriterion("LOG_OPERATOR <", value, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorLessThanOrEqualTo(String value) {
            addCriterion("LOG_OPERATOR <=", value, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorLike(String value) {
            addCriterion("LOG_OPERATOR like", value, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorNotLike(String value) {
            addCriterion("LOG_OPERATOR not like", value, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorIn(List<String> values) {
            addCriterion("LOG_OPERATOR in", values, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorNotIn(List<String> values) {
            addCriterion("LOG_OPERATOR not in", values, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorBetween(String value1, String value2) {
            addCriterion("LOG_OPERATOR between", value1, value2, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogOperatorNotBetween(String value1, String value2) {
            addCriterion("LOG_OPERATOR not between", value1, value2, "logOperator");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNull() {
            addCriterion("LOG_IP is null");
            return (Criteria) this;
        }

        public Criteria andLogIpIsNotNull() {
            addCriterion("LOG_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLogIpEqualTo(String value) {
            addCriterion("LOG_IP =", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotEqualTo(String value) {
            addCriterion("LOG_IP <>", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThan(String value) {
            addCriterion("LOG_IP >", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpGreaterThanOrEqualTo(String value) {
            addCriterion("LOG_IP >=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThan(String value) {
            addCriterion("LOG_IP <", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLessThanOrEqualTo(String value) {
            addCriterion("LOG_IP <=", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpLike(String value) {
            addCriterion("LOG_IP like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotLike(String value) {
            addCriterion("LOG_IP not like", value, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpIn(List<String> values) {
            addCriterion("LOG_IP in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotIn(List<String> values) {
            addCriterion("LOG_IP not in", values, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpBetween(String value1, String value2) {
            addCriterion("LOG_IP between", value1, value2, "logIp");
            return (Criteria) this;
        }

        public Criteria andLogIpNotBetween(String value1, String value2) {
            addCriterion("LOG_IP not between", value1, value2, "logIp");
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