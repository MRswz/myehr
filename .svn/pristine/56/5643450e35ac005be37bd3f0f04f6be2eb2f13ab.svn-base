package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysExecSqlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysExecSqlExample() {
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

        public Criteria andExecSqlIdIsNull() {
            addCriterion("EXEC_SQL_ID is null");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdIsNotNull() {
            addCriterion("EXEC_SQL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdEqualTo(BigDecimal value) {
            addCriterion("EXEC_SQL_ID =", value, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdNotEqualTo(BigDecimal value) {
            addCriterion("EXEC_SQL_ID <>", value, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdGreaterThan(BigDecimal value) {
            addCriterion("EXEC_SQL_ID >", value, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXEC_SQL_ID >=", value, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdLessThan(BigDecimal value) {
            addCriterion("EXEC_SQL_ID <", value, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXEC_SQL_ID <=", value, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdIn(List<BigDecimal> values) {
            addCriterion("EXEC_SQL_ID in", values, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdNotIn(List<BigDecimal> values) {
            addCriterion("EXEC_SQL_ID not in", values, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXEC_SQL_ID between", value1, value2, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andExecSqlIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXEC_SQL_ID not between", value1, value2, "execSqlId");
            return (Criteria) this;
        }

        public Criteria andEntitySqlIsNull() {
            addCriterion("ENTITY_SQL is null");
            return (Criteria) this;
        }

        public Criteria andEntitySqlIsNotNull() {
            addCriterion("ENTITY_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andEntitySqlEqualTo(String value) {
            addCriterion("ENTITY_SQL =", value, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlNotEqualTo(String value) {
            addCriterion("ENTITY_SQL <>", value, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlGreaterThan(String value) {
            addCriterion("ENTITY_SQL >", value, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_SQL >=", value, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlLessThan(String value) {
            addCriterion("ENTITY_SQL <", value, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_SQL <=", value, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlLike(String value) {
            addCriterion("ENTITY_SQL like", value, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlNotLike(String value) {
            addCriterion("ENTITY_SQL not like", value, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlIn(List<String> values) {
            addCriterion("ENTITY_SQL in", values, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlNotIn(List<String> values) {
            addCriterion("ENTITY_SQL not in", values, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlBetween(String value1, String value2) {
            addCriterion("ENTITY_SQL between", value1, value2, "entitySql");
            return (Criteria) this;
        }

        public Criteria andEntitySqlNotBetween(String value1, String value2) {
            addCriterion("ENTITY_SQL not between", value1, value2, "entitySql");
            return (Criteria) this;
        }

        public Criteria andExecSqlIsNull() {
            addCriterion("EXEC_SQL is null");
            return (Criteria) this;
        }

        public Criteria andExecSqlIsNotNull() {
            addCriterion("EXEC_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andExecSqlEqualTo(String value) {
            addCriterion("EXEC_SQL =", value, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlNotEqualTo(String value) {
            addCriterion("EXEC_SQL <>", value, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlGreaterThan(String value) {
            addCriterion("EXEC_SQL >", value, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_SQL >=", value, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlLessThan(String value) {
            addCriterion("EXEC_SQL <", value, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlLessThanOrEqualTo(String value) {
            addCriterion("EXEC_SQL <=", value, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlLike(String value) {
            addCriterion("EXEC_SQL like", value, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlNotLike(String value) {
            addCriterion("EXEC_SQL not like", value, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlIn(List<String> values) {
            addCriterion("EXEC_SQL in", values, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlNotIn(List<String> values) {
            addCriterion("EXEC_SQL not in", values, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlBetween(String value1, String value2) {
            addCriterion("EXEC_SQL between", value1, value2, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlNotBetween(String value1, String value2) {
            addCriterion("EXEC_SQL not between", value1, value2, "execSql");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeIsNull() {
            addCriterion("EXEC_SQL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeIsNotNull() {
            addCriterion("EXEC_SQL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeEqualTo(String value) {
            addCriterion("EXEC_SQL_TYPE =", value, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeNotEqualTo(String value) {
            addCriterion("EXEC_SQL_TYPE <>", value, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeGreaterThan(String value) {
            addCriterion("EXEC_SQL_TYPE >", value, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_SQL_TYPE >=", value, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeLessThan(String value) {
            addCriterion("EXEC_SQL_TYPE <", value, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeLessThanOrEqualTo(String value) {
            addCriterion("EXEC_SQL_TYPE <=", value, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeLike(String value) {
            addCriterion("EXEC_SQL_TYPE like", value, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeNotLike(String value) {
            addCriterion("EXEC_SQL_TYPE not like", value, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeIn(List<String> values) {
            addCriterion("EXEC_SQL_TYPE in", values, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeNotIn(List<String> values) {
            addCriterion("EXEC_SQL_TYPE not in", values, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeBetween(String value1, String value2) {
            addCriterion("EXEC_SQL_TYPE between", value1, value2, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlTypeNotBetween(String value1, String value2) {
            addCriterion("EXEC_SQL_TYPE not between", value1, value2, "execSqlType");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidIsNull() {
            addCriterion("EXEC_SQL_RELAID is null");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidIsNotNull() {
            addCriterion("EXEC_SQL_RELAID is not null");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidEqualTo(Long value) {
            addCriterion("EXEC_SQL_RELAID =", value, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidNotEqualTo(Long value) {
            addCriterion("EXEC_SQL_RELAID <>", value, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidGreaterThan(Long value) {
            addCriterion("EXEC_SQL_RELAID >", value, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidGreaterThanOrEqualTo(Long value) {
            addCriterion("EXEC_SQL_RELAID >=", value, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidLessThan(Long value) {
            addCriterion("EXEC_SQL_RELAID <", value, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidLessThanOrEqualTo(Long value) {
            addCriterion("EXEC_SQL_RELAID <=", value, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidIn(List<Long> values) {
            addCriterion("EXEC_SQL_RELAID in", values, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidNotIn(List<Long> values) {
            addCriterion("EXEC_SQL_RELAID not in", values, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidBetween(Long value1, Long value2) {
            addCriterion("EXEC_SQL_RELAID between", value1, value2, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andExecSqlRelaidNotBetween(Long value1, Long value2) {
            addCriterion("EXEC_SQL_RELAID not between", value1, value2, "execSqlRelaid");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeIsNull() {
            addCriterion("AFTER_EXEC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeIsNotNull() {
            addCriterion("AFTER_EXEC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeEqualTo(String value) {
            addCriterion("AFTER_EXEC_TYPE =", value, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeNotEqualTo(String value) {
            addCriterion("AFTER_EXEC_TYPE <>", value, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeGreaterThan(String value) {
            addCriterion("AFTER_EXEC_TYPE >", value, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("AFTER_EXEC_TYPE >=", value, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeLessThan(String value) {
            addCriterion("AFTER_EXEC_TYPE <", value, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeLessThanOrEqualTo(String value) {
            addCriterion("AFTER_EXEC_TYPE <=", value, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeLike(String value) {
            addCriterion("AFTER_EXEC_TYPE like", value, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeNotLike(String value) {
            addCriterion("AFTER_EXEC_TYPE not like", value, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeIn(List<String> values) {
            addCriterion("AFTER_EXEC_TYPE in", values, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeNotIn(List<String> values) {
            addCriterion("AFTER_EXEC_TYPE not in", values, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeBetween(String value1, String value2) {
            addCriterion("AFTER_EXEC_TYPE between", value1, value2, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecTypeNotBetween(String value1, String value2) {
            addCriterion("AFTER_EXEC_TYPE not between", value1, value2, "afterExecType");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunIsNull() {
            addCriterion("AFTER_EXEC_FUN is null");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunIsNotNull() {
            addCriterion("AFTER_EXEC_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunEqualTo(String value) {
            addCriterion("AFTER_EXEC_FUN =", value, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunNotEqualTo(String value) {
            addCriterion("AFTER_EXEC_FUN <>", value, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunGreaterThan(String value) {
            addCriterion("AFTER_EXEC_FUN >", value, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunGreaterThanOrEqualTo(String value) {
            addCriterion("AFTER_EXEC_FUN >=", value, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunLessThan(String value) {
            addCriterion("AFTER_EXEC_FUN <", value, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunLessThanOrEqualTo(String value) {
            addCriterion("AFTER_EXEC_FUN <=", value, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunLike(String value) {
            addCriterion("AFTER_EXEC_FUN like", value, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunNotLike(String value) {
            addCriterion("AFTER_EXEC_FUN not like", value, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunIn(List<String> values) {
            addCriterion("AFTER_EXEC_FUN in", values, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunNotIn(List<String> values) {
            addCriterion("AFTER_EXEC_FUN not in", values, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunBetween(String value1, String value2) {
            addCriterion("AFTER_EXEC_FUN between", value1, value2, "afterExecFun");
            return (Criteria) this;
        }

        public Criteria andAfterExecFunNotBetween(String value1, String value2) {
            addCriterion("AFTER_EXEC_FUN not between", value1, value2, "afterExecFun");
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