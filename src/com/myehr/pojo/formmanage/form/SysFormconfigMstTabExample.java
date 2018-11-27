package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysFormconfigMstTabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormconfigMstTabExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMstTabIdIsNull() {
            addCriterion("MST_TAB_ID is null");
            return (Criteria) this;
        }

        public Criteria andMstTabIdIsNotNull() {
            addCriterion("MST_TAB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMstTabIdEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_ID =", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdNotEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_ID <>", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdGreaterThan(BigDecimal value) {
            addCriterion("MST_TAB_ID >", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_ID >=", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdLessThan(BigDecimal value) {
            addCriterion("MST_TAB_ID <", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_ID <=", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdIn(List<BigDecimal> values) {
            addCriterion("MST_TAB_ID in", values, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdNotIn(List<BigDecimal> values) {
            addCriterion("MST_TAB_ID not in", values, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MST_TAB_ID between", value1, value2, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MST_TAB_ID not between", value1, value2, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdIsNull() {
            addCriterion("MST_TAB_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdIsNotNull() {
            addCriterion("MST_TAB_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_FORM_ID =", value, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdNotEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_FORM_ID <>", value, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdGreaterThan(BigDecimal value) {
            addCriterion("MST_TAB_FORM_ID >", value, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_FORM_ID >=", value, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdLessThan(BigDecimal value) {
            addCriterion("MST_TAB_FORM_ID <", value, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_FORM_ID <=", value, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdIn(List<BigDecimal> values) {
            addCriterion("MST_TAB_FORM_ID in", values, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdNotIn(List<BigDecimal> values) {
            addCriterion("MST_TAB_FORM_ID not in", values, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MST_TAB_FORM_ID between", value1, value2, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabFormIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MST_TAB_FORM_ID not between", value1, value2, "mstTabFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdIsNull() {
            addCriterion("MST_TAB_MAIN_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdIsNotNull() {
            addCriterion("MST_TAB_MAIN_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_MAIN_FORM_ID =", value, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdNotEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_MAIN_FORM_ID <>", value, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdGreaterThan(BigDecimal value) {
            addCriterion("MST_TAB_MAIN_FORM_ID >", value, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_MAIN_FORM_ID >=", value, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdLessThan(BigDecimal value) {
            addCriterion("MST_TAB_MAIN_FORM_ID <", value, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_MAIN_FORM_ID <=", value, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdIn(List<BigDecimal> values) {
            addCriterion("MST_TAB_MAIN_FORM_ID in", values, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdNotIn(List<BigDecimal> values) {
            addCriterion("MST_TAB_MAIN_FORM_ID not in", values, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MST_TAB_MAIN_FORM_ID between", value1, value2, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MST_TAB_MAIN_FORM_ID not between", value1, value2, "mstTabMainFormId");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightIsNull() {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightIsNotNull() {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightEqualTo(String value) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT =", value, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightNotEqualTo(String value) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT <>", value, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightGreaterThan(String value) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT >", value, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightGreaterThanOrEqualTo(String value) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT >=", value, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightLessThan(String value) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT <", value, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightLessThanOrEqualTo(String value) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT <=", value, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightLike(String value) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT like", value, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightNotLike(String value) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT not like", value, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightIn(List<String> values) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT in", values, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightNotIn(List<String> values) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT not in", values, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightBetween(String value1, String value2) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT between", value1, value2, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabMainFormHeightNotBetween(String value1, String value2) {
            addCriterion("MST_TAB_MAIN_FORM_HEIGHT not between", value1, value2, "mstTabMainFormHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightIsNull() {
            addCriterion("MST_TAB_DETAIL_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightIsNotNull() {
            addCriterion("MST_TAB_DETAIL_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightEqualTo(String value) {
            addCriterion("MST_TAB_DETAIL_HEIGHT =", value, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightNotEqualTo(String value) {
            addCriterion("MST_TAB_DETAIL_HEIGHT <>", value, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightGreaterThan(String value) {
            addCriterion("MST_TAB_DETAIL_HEIGHT >", value, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightGreaterThanOrEqualTo(String value) {
            addCriterion("MST_TAB_DETAIL_HEIGHT >=", value, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightLessThan(String value) {
            addCriterion("MST_TAB_DETAIL_HEIGHT <", value, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightLessThanOrEqualTo(String value) {
            addCriterion("MST_TAB_DETAIL_HEIGHT <=", value, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightLike(String value) {
            addCriterion("MST_TAB_DETAIL_HEIGHT like", value, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightNotLike(String value) {
            addCriterion("MST_TAB_DETAIL_HEIGHT not like", value, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightIn(List<String> values) {
            addCriterion("MST_TAB_DETAIL_HEIGHT in", values, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightNotIn(List<String> values) {
            addCriterion("MST_TAB_DETAIL_HEIGHT not in", values, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightBetween(String value1, String value2) {
            addCriterion("MST_TAB_DETAIL_HEIGHT between", value1, value2, "mstTabDetailHeight");
            return (Criteria) this;
        }

        public Criteria andMstTabDetailHeightNotBetween(String value1, String value2) {
            addCriterion("MST_TAB_DETAIL_HEIGHT not between", value1, value2, "mstTabDetailHeight");
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
            addCriterionForJDBCDate("OPERATOR_TIME =", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME <>", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME >", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME >=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThan(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME <", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME <=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATOR_TIME in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATOR_TIME not in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATOR_TIME between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATOR_TIME not between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andFormShowAllIsNull() {
            addCriterion("FORM_SHOW_ALL is null");
            return (Criteria) this;
        }

        public Criteria andFormShowAllIsNotNull() {
            addCriterion("FORM_SHOW_ALL is not null");
            return (Criteria) this;
        }

        public Criteria andFormShowAllEqualTo(String value) {
            addCriterion("FORM_SHOW_ALL =", value, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllNotEqualTo(String value) {
            addCriterion("FORM_SHOW_ALL <>", value, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllGreaterThan(String value) {
            addCriterion("FORM_SHOW_ALL >", value, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_SHOW_ALL >=", value, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllLessThan(String value) {
            addCriterion("FORM_SHOW_ALL <", value, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllLessThanOrEqualTo(String value) {
            addCriterion("FORM_SHOW_ALL <=", value, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllLike(String value) {
            addCriterion("FORM_SHOW_ALL like", value, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllNotLike(String value) {
            addCriterion("FORM_SHOW_ALL not like", value, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllIn(List<String> values) {
            addCriterion("FORM_SHOW_ALL in", values, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllNotIn(List<String> values) {
            addCriterion("FORM_SHOW_ALL not in", values, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllBetween(String value1, String value2) {
            addCriterion("FORM_SHOW_ALL between", value1, value2, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andFormShowAllNotBetween(String value1, String value2) {
            addCriterion("FORM_SHOW_ALL not between", value1, value2, "formShowAll");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeIsNull() {
            addCriterion("VERTICALTYPE is null");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeIsNotNull() {
            addCriterion("VERTICALTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeEqualTo(String value) {
            addCriterion("VERTICALTYPE =", value, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeNotEqualTo(String value) {
            addCriterion("VERTICALTYPE <>", value, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeGreaterThan(String value) {
            addCriterion("VERTICALTYPE >", value, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeGreaterThanOrEqualTo(String value) {
            addCriterion("VERTICALTYPE >=", value, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeLessThan(String value) {
            addCriterion("VERTICALTYPE <", value, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeLessThanOrEqualTo(String value) {
            addCriterion("VERTICALTYPE <=", value, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeLike(String value) {
            addCriterion("VERTICALTYPE like", value, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeNotLike(String value) {
            addCriterion("VERTICALTYPE not like", value, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeIn(List<String> values) {
            addCriterion("VERTICALTYPE in", values, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeNotIn(List<String> values) {
            addCriterion("VERTICALTYPE not in", values, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeBetween(String value1, String value2) {
            addCriterion("VERTICALTYPE between", value1, value2, "verticaltype");
            return (Criteria) this;
        }

        public Criteria andVerticaltypeNotBetween(String value1, String value2) {
            addCriterion("VERTICALTYPE not between", value1, value2, "verticaltype");
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