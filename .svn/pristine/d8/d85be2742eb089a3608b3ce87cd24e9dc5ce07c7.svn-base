package com.myehr.pojo.sysParam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SystemParmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemParmExample() {
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

        public Criteria andParmIdIsNull() {
            addCriterion("PARM_ID is null");
            return (Criteria) this;
        }

        public Criteria andParmIdIsNotNull() {
            addCriterion("PARM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParmIdEqualTo(BigDecimal value) {
            addCriterion("PARM_ID =", value, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdNotEqualTo(BigDecimal value) {
            addCriterion("PARM_ID <>", value, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdGreaterThan(BigDecimal value) {
            addCriterion("PARM_ID >", value, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PARM_ID >=", value, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdLessThan(BigDecimal value) {
            addCriterion("PARM_ID <", value, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PARM_ID <=", value, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdIn(List<BigDecimal> values) {
            addCriterion("PARM_ID in", values, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdNotIn(List<BigDecimal> values) {
            addCriterion("PARM_ID not in", values, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARM_ID between", value1, value2, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PARM_ID not between", value1, value2, "parmId");
            return (Criteria) this;
        }

        public Criteria andParmNameIsNull() {
            addCriterion("PARM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParmNameIsNotNull() {
            addCriterion("PARM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParmNameEqualTo(String value) {
            addCriterion("PARM_NAME =", value, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameNotEqualTo(String value) {
            addCriterion("PARM_NAME <>", value, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameGreaterThan(String value) {
            addCriterion("PARM_NAME >", value, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARM_NAME >=", value, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameLessThan(String value) {
            addCriterion("PARM_NAME <", value, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameLessThanOrEqualTo(String value) {
            addCriterion("PARM_NAME <=", value, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameLike(String value) {
            addCriterion("PARM_NAME like", value, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameNotLike(String value) {
            addCriterion("PARM_NAME not like", value, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameIn(List<String> values) {
            addCriterion("PARM_NAME in", values, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameNotIn(List<String> values) {
            addCriterion("PARM_NAME not in", values, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameBetween(String value1, String value2) {
            addCriterion("PARM_NAME between", value1, value2, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmNameNotBetween(String value1, String value2) {
            addCriterion("PARM_NAME not between", value1, value2, "parmName");
            return (Criteria) this;
        }

        public Criteria andParmPriceIsNull() {
            addCriterion("PARM_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andParmPriceIsNotNull() {
            addCriterion("PARM_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andParmPriceEqualTo(String value) {
            addCriterion("PARM_PRICE =", value, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceNotEqualTo(String value) {
            addCriterion("PARM_PRICE <>", value, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceGreaterThan(String value) {
            addCriterion("PARM_PRICE >", value, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceGreaterThanOrEqualTo(String value) {
            addCriterion("PARM_PRICE >=", value, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceLessThan(String value) {
            addCriterion("PARM_PRICE <", value, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceLessThanOrEqualTo(String value) {
            addCriterion("PARM_PRICE <=", value, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceLike(String value) {
            addCriterion("PARM_PRICE like", value, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceNotLike(String value) {
            addCriterion("PARM_PRICE not like", value, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceIn(List<String> values) {
            addCriterion("PARM_PRICE in", values, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceNotIn(List<String> values) {
            addCriterion("PARM_PRICE not in", values, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceBetween(String value1, String value2) {
            addCriterion("PARM_PRICE between", value1, value2, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmPriceNotBetween(String value1, String value2) {
            addCriterion("PARM_PRICE not between", value1, value2, "parmPrice");
            return (Criteria) this;
        }

        public Criteria andParmExplainIsNull() {
            addCriterion("PARM_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andParmExplainIsNotNull() {
            addCriterion("PARM_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andParmExplainEqualTo(String value) {
            addCriterion("PARM_EXPLAIN =", value, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainNotEqualTo(String value) {
            addCriterion("PARM_EXPLAIN <>", value, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainGreaterThan(String value) {
            addCriterion("PARM_EXPLAIN >", value, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainGreaterThanOrEqualTo(String value) {
            addCriterion("PARM_EXPLAIN >=", value, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainLessThan(String value) {
            addCriterion("PARM_EXPLAIN <", value, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainLessThanOrEqualTo(String value) {
            addCriterion("PARM_EXPLAIN <=", value, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainLike(String value) {
            addCriterion("PARM_EXPLAIN like", value, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainNotLike(String value) {
            addCriterion("PARM_EXPLAIN not like", value, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainIn(List<String> values) {
            addCriterion("PARM_EXPLAIN in", values, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainNotIn(List<String> values) {
            addCriterion("PARM_EXPLAIN not in", values, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainBetween(String value1, String value2) {
            addCriterion("PARM_EXPLAIN between", value1, value2, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmExplainNotBetween(String value1, String value2) {
            addCriterion("PARM_EXPLAIN not between", value1, value2, "parmExplain");
            return (Criteria) this;
        }

        public Criteria andParmTypeIsNull() {
            addCriterion("PARM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andParmTypeIsNotNull() {
            addCriterion("PARM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParmTypeEqualTo(String value) {
            addCriterion("PARM_TYPE =", value, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeNotEqualTo(String value) {
            addCriterion("PARM_TYPE <>", value, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeGreaterThan(String value) {
            addCriterion("PARM_TYPE >", value, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARM_TYPE >=", value, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeLessThan(String value) {
            addCriterion("PARM_TYPE <", value, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeLessThanOrEqualTo(String value) {
            addCriterion("PARM_TYPE <=", value, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeLike(String value) {
            addCriterion("PARM_TYPE like", value, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeNotLike(String value) {
            addCriterion("PARM_TYPE not like", value, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeIn(List<String> values) {
            addCriterion("PARM_TYPE in", values, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeNotIn(List<String> values) {
            addCriterion("PARM_TYPE not in", values, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeBetween(String value1, String value2) {
            addCriterion("PARM_TYPE between", value1, value2, "parmType");
            return (Criteria) this;
        }

        public Criteria andParmTypeNotBetween(String value1, String value2) {
            addCriterion("PARM_TYPE not between", value1, value2, "parmType");
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