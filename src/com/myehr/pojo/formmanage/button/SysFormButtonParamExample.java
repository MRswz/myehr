package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormButtonParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonParamExample() {
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

        public Criteria andButtonParamIdIsNull() {
            addCriterion("BUTTON_PARAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdIsNotNull() {
            addCriterion("BUTTON_PARAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdEqualTo(BigDecimal value) {
            addCriterion("BUTTON_PARAM_ID =", value, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdNotEqualTo(BigDecimal value) {
            addCriterion("BUTTON_PARAM_ID <>", value, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdGreaterThan(BigDecimal value) {
            addCriterion("BUTTON_PARAM_ID >", value, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_PARAM_ID >=", value, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdLessThan(BigDecimal value) {
            addCriterion("BUTTON_PARAM_ID <", value, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_PARAM_ID <=", value, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdIn(List<BigDecimal> values) {
            addCriterion("BUTTON_PARAM_ID in", values, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdNotIn(List<BigDecimal> values) {
            addCriterion("BUTTON_PARAM_ID not in", values, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_PARAM_ID between", value1, value2, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonParamIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_PARAM_ID not between", value1, value2, "buttonParamId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdIsNull() {
            addCriterion("BUTTON_ADD_ID is null");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdIsNotNull() {
            addCriterion("BUTTON_ADD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdEqualTo(BigDecimal value) {
            addCriterion("BUTTON_ADD_ID =", value, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdNotEqualTo(BigDecimal value) {
            addCriterion("BUTTON_ADD_ID <>", value, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdGreaterThan(BigDecimal value) {
            addCriterion("BUTTON_ADD_ID >", value, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_ADD_ID >=", value, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdLessThan(BigDecimal value) {
            addCriterion("BUTTON_ADD_ID <", value, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTTON_ADD_ID <=", value, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdIn(List<BigDecimal> values) {
            addCriterion("BUTTON_ADD_ID in", values, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdNotIn(List<BigDecimal> values) {
            addCriterion("BUTTON_ADD_ID not in", values, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_ADD_ID between", value1, value2, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonAddIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTTON_ADD_ID not between", value1, value2, "buttonAddId");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameIsNull() {
            addCriterion("BUTTON_PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameIsNotNull() {
            addCriterion("BUTTON_PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameEqualTo(String value) {
            addCriterion("BUTTON_PARAM_NAME =", value, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameNotEqualTo(String value) {
            addCriterion("BUTTON_PARAM_NAME <>", value, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameGreaterThan(String value) {
            addCriterion("BUTTON_PARAM_NAME >", value, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_PARAM_NAME >=", value, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameLessThan(String value) {
            addCriterion("BUTTON_PARAM_NAME <", value, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_PARAM_NAME <=", value, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameLike(String value) {
            addCriterion("BUTTON_PARAM_NAME like", value, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameNotLike(String value) {
            addCriterion("BUTTON_PARAM_NAME not like", value, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameIn(List<String> values) {
            addCriterion("BUTTON_PARAM_NAME in", values, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameNotIn(List<String> values) {
            addCriterion("BUTTON_PARAM_NAME not in", values, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameBetween(String value1, String value2) {
            addCriterion("BUTTON_PARAM_NAME between", value1, value2, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamNameNotBetween(String value1, String value2) {
            addCriterion("BUTTON_PARAM_NAME not between", value1, value2, "buttonParamName");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescIsNull() {
            addCriterion("BUTTON_PARAM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescIsNotNull() {
            addCriterion("BUTTON_PARAM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescEqualTo(String value) {
            addCriterion("BUTTON_PARAM_DESC =", value, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescNotEqualTo(String value) {
            addCriterion("BUTTON_PARAM_DESC <>", value, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescGreaterThan(String value) {
            addCriterion("BUTTON_PARAM_DESC >", value, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_PARAM_DESC >=", value, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescLessThan(String value) {
            addCriterion("BUTTON_PARAM_DESC <", value, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_PARAM_DESC <=", value, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescLike(String value) {
            addCriterion("BUTTON_PARAM_DESC like", value, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescNotLike(String value) {
            addCriterion("BUTTON_PARAM_DESC not like", value, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescIn(List<String> values) {
            addCriterion("BUTTON_PARAM_DESC in", values, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescNotIn(List<String> values) {
            addCriterion("BUTTON_PARAM_DESC not in", values, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescBetween(String value1, String value2) {
            addCriterion("BUTTON_PARAM_DESC between", value1, value2, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamDescNotBetween(String value1, String value2) {
            addCriterion("BUTTON_PARAM_DESC not between", value1, value2, "buttonParamDesc");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromIsNull() {
            addCriterion("BUTTON_PARAM_FROM is null");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromIsNotNull() {
            addCriterion("BUTTON_PARAM_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromEqualTo(String value) {
            addCriterion("BUTTON_PARAM_FROM =", value, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromNotEqualTo(String value) {
            addCriterion("BUTTON_PARAM_FROM <>", value, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromGreaterThan(String value) {
            addCriterion("BUTTON_PARAM_FROM >", value, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_PARAM_FROM >=", value, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromLessThan(String value) {
            addCriterion("BUTTON_PARAM_FROM <", value, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_PARAM_FROM <=", value, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromLike(String value) {
            addCriterion("BUTTON_PARAM_FROM like", value, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromNotLike(String value) {
            addCriterion("BUTTON_PARAM_FROM not like", value, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromIn(List<String> values) {
            addCriterion("BUTTON_PARAM_FROM in", values, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromNotIn(List<String> values) {
            addCriterion("BUTTON_PARAM_FROM not in", values, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromBetween(String value1, String value2) {
            addCriterion("BUTTON_PARAM_FROM between", value1, value2, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamFromNotBetween(String value1, String value2) {
            addCriterion("BUTTON_PARAM_FROM not between", value1, value2, "buttonParamFrom");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueIsNull() {
            addCriterion("BUTTON_PARAM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueIsNotNull() {
            addCriterion("BUTTON_PARAM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueEqualTo(String value) {
            addCriterion("BUTTON_PARAM_VALUE =", value, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueNotEqualTo(String value) {
            addCriterion("BUTTON_PARAM_VALUE <>", value, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueGreaterThan(String value) {
            addCriterion("BUTTON_PARAM_VALUE >", value, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("BUTTON_PARAM_VALUE >=", value, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueLessThan(String value) {
            addCriterion("BUTTON_PARAM_VALUE <", value, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueLessThanOrEqualTo(String value) {
            addCriterion("BUTTON_PARAM_VALUE <=", value, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueLike(String value) {
            addCriterion("BUTTON_PARAM_VALUE like", value, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueNotLike(String value) {
            addCriterion("BUTTON_PARAM_VALUE not like", value, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueIn(List<String> values) {
            addCriterion("BUTTON_PARAM_VALUE in", values, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueNotIn(List<String> values) {
            addCriterion("BUTTON_PARAM_VALUE not in", values, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueBetween(String value1, String value2) {
            addCriterion("BUTTON_PARAM_VALUE between", value1, value2, "buttonParamValue");
            return (Criteria) this;
        }

        public Criteria andButtonParamValueNotBetween(String value1, String value2) {
            addCriterion("BUTTON_PARAM_VALUE not between", value1, value2, "buttonParamValue");
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

        public Criteria andOperatorNameEqualTo(BigDecimal value) {
            addCriterion("OPERATOR_NAME =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(BigDecimal value) {
            addCriterion("OPERATOR_NAME <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(BigDecimal value) {
            addCriterion("OPERATOR_NAME >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATOR_NAME >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(BigDecimal value) {
            addCriterion("OPERATOR_NAME <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATOR_NAME <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<BigDecimal> values) {
            addCriterion("OPERATOR_NAME in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<BigDecimal> values) {
            addCriterion("OPERATOR_NAME not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATOR_NAME between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATOR_NAME not between", value1, value2, "operatorName");
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