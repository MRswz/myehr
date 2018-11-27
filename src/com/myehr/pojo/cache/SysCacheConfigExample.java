package com.myehr.pojo.cache;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCacheConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysCacheConfigExample() {
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

        public Criteria andObjTypeIsNull() {
            addCriterion("OBJ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andObjTypeIsNotNull() {
            addCriterion("OBJ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andObjTypeEqualTo(String value) {
            addCriterion("OBJ_TYPE =", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotEqualTo(String value) {
            addCriterion("OBJ_TYPE <>", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeGreaterThan(String value) {
            addCriterion("OBJ_TYPE >", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_TYPE >=", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeLessThan(String value) {
            addCriterion("OBJ_TYPE <", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeLessThanOrEqualTo(String value) {
            addCriterion("OBJ_TYPE <=", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeLike(String value) {
            addCriterion("OBJ_TYPE like", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotLike(String value) {
            addCriterion("OBJ_TYPE not like", value, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeIn(List<String> values) {
            addCriterion("OBJ_TYPE in", values, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotIn(List<String> values) {
            addCriterion("OBJ_TYPE not in", values, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeBetween(String value1, String value2) {
            addCriterion("OBJ_TYPE between", value1, value2, "objType");
            return (Criteria) this;
        }

        public Criteria andObjTypeNotBetween(String value1, String value2) {
            addCriterion("OBJ_TYPE not between", value1, value2, "objType");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNull() {
            addCriterion("OBJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNotNull() {
            addCriterion("OBJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjIdEqualTo(BigDecimal value) {
            addCriterion("OBJ_ID =", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotEqualTo(BigDecimal value) {
            addCriterion("OBJ_ID <>", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThan(BigDecimal value) {
            addCriterion("OBJ_ID >", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJ_ID >=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThan(BigDecimal value) {
            addCriterion("OBJ_ID <", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJ_ID <=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdIn(List<BigDecimal> values) {
            addCriterion("OBJ_ID in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotIn(List<BigDecimal> values) {
            addCriterion("OBJ_ID not in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJ_ID between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJ_ID not between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andCacheTypeIsNull() {
            addCriterion("CACHE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCacheTypeIsNotNull() {
            addCriterion("CACHE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCacheTypeEqualTo(String value) {
            addCriterion("CACHE_TYPE =", value, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeNotEqualTo(String value) {
            addCriterion("CACHE_TYPE <>", value, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeGreaterThan(String value) {
            addCriterion("CACHE_TYPE >", value, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CACHE_TYPE >=", value, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeLessThan(String value) {
            addCriterion("CACHE_TYPE <", value, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeLessThanOrEqualTo(String value) {
            addCriterion("CACHE_TYPE <=", value, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeLike(String value) {
            addCriterion("CACHE_TYPE like", value, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeNotLike(String value) {
            addCriterion("CACHE_TYPE not like", value, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeIn(List<String> values) {
            addCriterion("CACHE_TYPE in", values, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeNotIn(List<String> values) {
            addCriterion("CACHE_TYPE not in", values, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeBetween(String value1, String value2) {
            addCriterion("CACHE_TYPE between", value1, value2, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheTypeNotBetween(String value1, String value2) {
            addCriterion("CACHE_TYPE not between", value1, value2, "cacheType");
            return (Criteria) this;
        }

        public Criteria andCacheIdIsNull() {
            addCriterion("CACHE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCacheIdIsNotNull() {
            addCriterion("CACHE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCacheIdEqualTo(String value) {
            addCriterion("CACHE_ID =", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdNotEqualTo(String value) {
            addCriterion("CACHE_ID <>", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdGreaterThan(String value) {
            addCriterion("CACHE_ID >", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdGreaterThanOrEqualTo(String value) {
            addCriterion("CACHE_ID >=", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdLessThan(String value) {
            addCriterion("CACHE_ID <", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdLessThanOrEqualTo(String value) {
            addCriterion("CACHE_ID <=", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdLike(String value) {
            addCriterion("CACHE_ID like", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdNotLike(String value) {
            addCriterion("CACHE_ID not like", value, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdIn(List<String> values) {
            addCriterion("CACHE_ID in", values, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdNotIn(List<String> values) {
            addCriterion("CACHE_ID not in", values, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdBetween(String value1, String value2) {
            addCriterion("CACHE_ID between", value1, value2, "cacheId");
            return (Criteria) this;
        }

        public Criteria andCacheIdNotBetween(String value1, String value2) {
            addCriterion("CACHE_ID not between", value1, value2, "cacheId");
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