package com.myehr.pojo.sysmenu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuParamExample() {
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

        public Criteria andMenuParamIdIsNull() {
            addCriterion("MENU_PARAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdIsNotNull() {
            addCriterion("MENU_PARAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdEqualTo(BigDecimal value) {
            addCriterion("MENU_PARAM_ID =", value, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdNotEqualTo(BigDecimal value) {
            addCriterion("MENU_PARAM_ID <>", value, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdGreaterThan(BigDecimal value) {
            addCriterion("MENU_PARAM_ID >", value, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MENU_PARAM_ID >=", value, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdLessThan(BigDecimal value) {
            addCriterion("MENU_PARAM_ID <", value, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MENU_PARAM_ID <=", value, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdIn(List<BigDecimal> values) {
            addCriterion("MENU_PARAM_ID in", values, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdNotIn(List<BigDecimal> values) {
            addCriterion("MENU_PARAM_ID not in", values, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MENU_PARAM_ID between", value1, value2, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuParamIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MENU_PARAM_ID not between", value1, value2, "menuParamId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(BigDecimal value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(BigDecimal value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(BigDecimal value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(BigDecimal value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<BigDecimal> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<BigDecimal> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameIsNull() {
            addCriterion("MENU_PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameIsNotNull() {
            addCriterion("MENU_PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameEqualTo(String value) {
            addCriterion("MENU_PARAM_NAME =", value, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameNotEqualTo(String value) {
            addCriterion("MENU_PARAM_NAME <>", value, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameGreaterThan(String value) {
            addCriterion("MENU_PARAM_NAME >", value, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_NAME >=", value, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameLessThan(String value) {
            addCriterion("MENU_PARAM_NAME <", value, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_NAME <=", value, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameLike(String value) {
            addCriterion("MENU_PARAM_NAME like", value, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameNotLike(String value) {
            addCriterion("MENU_PARAM_NAME not like", value, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameIn(List<String> values) {
            addCriterion("MENU_PARAM_NAME in", values, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameNotIn(List<String> values) {
            addCriterion("MENU_PARAM_NAME not in", values, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_NAME between", value1, value2, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamNameNotBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_NAME not between", value1, value2, "menuParamName");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescIsNull() {
            addCriterion("MENU_PARAM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescIsNotNull() {
            addCriterion("MENU_PARAM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescEqualTo(String value) {
            addCriterion("MENU_PARAM_DESC =", value, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescNotEqualTo(String value) {
            addCriterion("MENU_PARAM_DESC <>", value, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescGreaterThan(String value) {
            addCriterion("MENU_PARAM_DESC >", value, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_DESC >=", value, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescLessThan(String value) {
            addCriterion("MENU_PARAM_DESC <", value, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescLessThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_DESC <=", value, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescLike(String value) {
            addCriterion("MENU_PARAM_DESC like", value, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescNotLike(String value) {
            addCriterion("MENU_PARAM_DESC not like", value, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescIn(List<String> values) {
            addCriterion("MENU_PARAM_DESC in", values, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescNotIn(List<String> values) {
            addCriterion("MENU_PARAM_DESC not in", values, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_DESC between", value1, value2, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamDescNotBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_DESC not between", value1, value2, "menuParamDesc");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromIsNull() {
            addCriterion("MENU_PARAM_FROM is null");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromIsNotNull() {
            addCriterion("MENU_PARAM_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromEqualTo(String value) {
            addCriterion("MENU_PARAM_FROM =", value, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromNotEqualTo(String value) {
            addCriterion("MENU_PARAM_FROM <>", value, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromGreaterThan(String value) {
            addCriterion("MENU_PARAM_FROM >", value, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_FROM >=", value, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromLessThan(String value) {
            addCriterion("MENU_PARAM_FROM <", value, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromLessThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_FROM <=", value, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromLike(String value) {
            addCriterion("MENU_PARAM_FROM like", value, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromNotLike(String value) {
            addCriterion("MENU_PARAM_FROM not like", value, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromIn(List<String> values) {
            addCriterion("MENU_PARAM_FROM in", values, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromNotIn(List<String> values) {
            addCriterion("MENU_PARAM_FROM not in", values, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_FROM between", value1, value2, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamFromNotBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_FROM not between", value1, value2, "menuParamFrom");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueIsNull() {
            addCriterion("MENU_PARAM_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueIsNotNull() {
            addCriterion("MENU_PARAM_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueEqualTo(String value) {
            addCriterion("MENU_PARAM_VALUE =", value, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueNotEqualTo(String value) {
            addCriterion("MENU_PARAM_VALUE <>", value, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueGreaterThan(String value) {
            addCriterion("MENU_PARAM_VALUE >", value, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_VALUE >=", value, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueLessThan(String value) {
            addCriterion("MENU_PARAM_VALUE <", value, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueLessThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_VALUE <=", value, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueLike(String value) {
            addCriterion("MENU_PARAM_VALUE like", value, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueNotLike(String value) {
            addCriterion("MENU_PARAM_VALUE not like", value, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueIn(List<String> values) {
            addCriterion("MENU_PARAM_VALUE in", values, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueNotIn(List<String> values) {
            addCriterion("MENU_PARAM_VALUE not in", values, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_VALUE between", value1, value2, "menuParamValue");
            return (Criteria) this;
        }

        public Criteria andMenuParamValueNotBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_VALUE not between", value1, value2, "menuParamValue");
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

        public Criteria andMenuParamClassIsNull() {
            addCriterion("MENU_PARAM_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassIsNotNull() {
            addCriterion("MENU_PARAM_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassEqualTo(String value) {
            addCriterion("MENU_PARAM_CLASS =", value, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassNotEqualTo(String value) {
            addCriterion("MENU_PARAM_CLASS <>", value, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassGreaterThan(String value) {
            addCriterion("MENU_PARAM_CLASS >", value, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_CLASS >=", value, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassLessThan(String value) {
            addCriterion("MENU_PARAM_CLASS <", value, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassLessThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_CLASS <=", value, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassLike(String value) {
            addCriterion("MENU_PARAM_CLASS like", value, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassNotLike(String value) {
            addCriterion("MENU_PARAM_CLASS not like", value, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassIn(List<String> values) {
            addCriterion("MENU_PARAM_CLASS in", values, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassNotIn(List<String> values) {
            addCriterion("MENU_PARAM_CLASS not in", values, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_CLASS between", value1, value2, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamClassNotBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_CLASS not between", value1, value2, "menuParamClass");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeIsNull() {
            addCriterion("MENU_PARAM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeIsNotNull() {
            addCriterion("MENU_PARAM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeEqualTo(String value) {
            addCriterion("MENU_PARAM_TYPE =", value, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeNotEqualTo(String value) {
            addCriterion("MENU_PARAM_TYPE <>", value, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeGreaterThan(String value) {
            addCriterion("MENU_PARAM_TYPE >", value, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_TYPE >=", value, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeLessThan(String value) {
            addCriterion("MENU_PARAM_TYPE <", value, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeLessThanOrEqualTo(String value) {
            addCriterion("MENU_PARAM_TYPE <=", value, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeLike(String value) {
            addCriterion("MENU_PARAM_TYPE like", value, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeNotLike(String value) {
            addCriterion("MENU_PARAM_TYPE not like", value, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeIn(List<String> values) {
            addCriterion("MENU_PARAM_TYPE in", values, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeNotIn(List<String> values) {
            addCriterion("MENU_PARAM_TYPE not in", values, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_TYPE between", value1, value2, "menuParamType");
            return (Criteria) this;
        }

        public Criteria andMenuParamTypeNotBetween(String value1, String value2) {
            addCriterion("MENU_PARAM_TYPE not between", value1, value2, "menuParamType");
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