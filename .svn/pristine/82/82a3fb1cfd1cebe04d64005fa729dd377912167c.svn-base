package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysFormButtonCalculateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonCalculateExample() {
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

        public Criteria andCalculateIdIsNull() {
            addCriterion("CALCULATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCalculateIdIsNotNull() {
            addCriterion("CALCULATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateIdEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_ID =", value, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdNotEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_ID <>", value, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdGreaterThan(BigDecimal value) {
            addCriterion("CALCULATE_ID >", value, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_ID >=", value, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdLessThan(BigDecimal value) {
            addCriterion("CALCULATE_ID <", value, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_ID <=", value, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdIn(List<BigDecimal> values) {
            addCriterion("CALCULATE_ID in", values, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdNotIn(List<BigDecimal> values) {
            addCriterion("CALCULATE_ID not in", values, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALCULATE_ID between", value1, value2, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALCULATE_ID not between", value1, value2, "calculateId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdIsNull() {
            addCriterion("CALCULATE_BUTTON_ID is null");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdIsNotNull() {
            addCriterion("CALCULATE_BUTTON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_BUTTON_ID =", value, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdNotEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_BUTTON_ID <>", value, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdGreaterThan(BigDecimal value) {
            addCriterion("CALCULATE_BUTTON_ID >", value, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_BUTTON_ID >=", value, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdLessThan(BigDecimal value) {
            addCriterion("CALCULATE_BUTTON_ID <", value, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_BUTTON_ID <=", value, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdIn(List<BigDecimal> values) {
            addCriterion("CALCULATE_BUTTON_ID in", values, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdNotIn(List<BigDecimal> values) {
            addCriterion("CALCULATE_BUTTON_ID not in", values, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALCULATE_BUTTON_ID between", value1, value2, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateButtonIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALCULATE_BUTTON_ID not between", value1, value2, "calculateButtonId");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountIsNull() {
            addCriterion("CALCULATE_ROW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountIsNotNull() {
            addCriterion("CALCULATE_ROW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_ROW_COUNT =", value, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountNotEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_ROW_COUNT <>", value, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountGreaterThan(BigDecimal value) {
            addCriterion("CALCULATE_ROW_COUNT >", value, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_ROW_COUNT >=", value, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountLessThan(BigDecimal value) {
            addCriterion("CALCULATE_ROW_COUNT <", value, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_ROW_COUNT <=", value, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountIn(List<BigDecimal> values) {
            addCriterion("CALCULATE_ROW_COUNT in", values, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountNotIn(List<BigDecimal> values) {
            addCriterion("CALCULATE_ROW_COUNT not in", values, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALCULATE_ROW_COUNT between", value1, value2, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateRowCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALCULATE_ROW_COUNT not between", value1, value2, "calculateRowCount");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleIsNull() {
            addCriterion("CALCULATE_WIN_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleIsNotNull() {
            addCriterion("CALCULATE_WIN_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleEqualTo(String value) {
            addCriterion("CALCULATE_WIN_TITLE =", value, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleNotEqualTo(String value) {
            addCriterion("CALCULATE_WIN_TITLE <>", value, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleGreaterThan(String value) {
            addCriterion("CALCULATE_WIN_TITLE >", value, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleGreaterThanOrEqualTo(String value) {
            addCriterion("CALCULATE_WIN_TITLE >=", value, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleLessThan(String value) {
            addCriterion("CALCULATE_WIN_TITLE <", value, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleLessThanOrEqualTo(String value) {
            addCriterion("CALCULATE_WIN_TITLE <=", value, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleLike(String value) {
            addCriterion("CALCULATE_WIN_TITLE like", value, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleNotLike(String value) {
            addCriterion("CALCULATE_WIN_TITLE not like", value, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleIn(List<String> values) {
            addCriterion("CALCULATE_WIN_TITLE in", values, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleNotIn(List<String> values) {
            addCriterion("CALCULATE_WIN_TITLE not in", values, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleBetween(String value1, String value2) {
            addCriterion("CALCULATE_WIN_TITLE between", value1, value2, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinTitleNotBetween(String value1, String value2) {
            addCriterion("CALCULATE_WIN_TITLE not between", value1, value2, "calculateWinTitle");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightIsNull() {
            addCriterion("CALCULATE_WIN_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightIsNotNull() {
            addCriterion("CALCULATE_WIN_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightEqualTo(String value) {
            addCriterion("CALCULATE_WIN_HEIGHT =", value, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightNotEqualTo(String value) {
            addCriterion("CALCULATE_WIN_HEIGHT <>", value, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightGreaterThan(String value) {
            addCriterion("CALCULATE_WIN_HEIGHT >", value, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightGreaterThanOrEqualTo(String value) {
            addCriterion("CALCULATE_WIN_HEIGHT >=", value, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightLessThan(String value) {
            addCriterion("CALCULATE_WIN_HEIGHT <", value, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightLessThanOrEqualTo(String value) {
            addCriterion("CALCULATE_WIN_HEIGHT <=", value, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightLike(String value) {
            addCriterion("CALCULATE_WIN_HEIGHT like", value, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightNotLike(String value) {
            addCriterion("CALCULATE_WIN_HEIGHT not like", value, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightIn(List<String> values) {
            addCriterion("CALCULATE_WIN_HEIGHT in", values, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightNotIn(List<String> values) {
            addCriterion("CALCULATE_WIN_HEIGHT not in", values, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightBetween(String value1, String value2) {
            addCriterion("CALCULATE_WIN_HEIGHT between", value1, value2, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinHeightNotBetween(String value1, String value2) {
            addCriterion("CALCULATE_WIN_HEIGHT not between", value1, value2, "calculateWinHeight");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthIsNull() {
            addCriterion("CALCULATE_WIN_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthIsNotNull() {
            addCriterion("CALCULATE_WIN_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthEqualTo(String value) {
            addCriterion("CALCULATE_WIN_WIDTH =", value, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthNotEqualTo(String value) {
            addCriterion("CALCULATE_WIN_WIDTH <>", value, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthGreaterThan(String value) {
            addCriterion("CALCULATE_WIN_WIDTH >", value, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthGreaterThanOrEqualTo(String value) {
            addCriterion("CALCULATE_WIN_WIDTH >=", value, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthLessThan(String value) {
            addCriterion("CALCULATE_WIN_WIDTH <", value, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthLessThanOrEqualTo(String value) {
            addCriterion("CALCULATE_WIN_WIDTH <=", value, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthLike(String value) {
            addCriterion("CALCULATE_WIN_WIDTH like", value, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthNotLike(String value) {
            addCriterion("CALCULATE_WIN_WIDTH not like", value, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthIn(List<String> values) {
            addCriterion("CALCULATE_WIN_WIDTH in", values, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthNotIn(List<String> values) {
            addCriterion("CALCULATE_WIN_WIDTH not in", values, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthBetween(String value1, String value2) {
            addCriterion("CALCULATE_WIN_WIDTH between", value1, value2, "calculateWinWidth");
            return (Criteria) this;
        }

        public Criteria andCalculateWinWidthNotBetween(String value1, String value2) {
            addCriterion("CALCULATE_WIN_WIDTH not between", value1, value2, "calculateWinWidth");
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