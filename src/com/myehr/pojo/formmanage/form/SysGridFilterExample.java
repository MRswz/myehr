package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysGridFilterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysGridFilterExample() {
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

        public Criteria andGridFilterIdIsNull() {
            addCriterion("GRID_FILTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdIsNotNull() {
            addCriterion("GRID_FILTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_ID =", value, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdNotEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_ID <>", value, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdGreaterThan(BigDecimal value) {
            addCriterion("GRID_FILTER_ID >", value, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_ID >=", value, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdLessThan(BigDecimal value) {
            addCriterion("GRID_FILTER_ID <", value, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_ID <=", value, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdIn(List<BigDecimal> values) {
            addCriterion("GRID_FILTER_ID in", values, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdNotIn(List<BigDecimal> values) {
            addCriterion("GRID_FILTER_ID not in", values, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_FILTER_ID between", value1, value2, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_FILTER_ID not between", value1, value2, "gridFilterId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdIsNull() {
            addCriterion("GRID_FILTER_FORM_DEF_ID is null");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdIsNotNull() {
            addCriterion("GRID_FILTER_FORM_DEF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_FORM_DEF_ID =", value, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdNotEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_FORM_DEF_ID <>", value, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdGreaterThan(BigDecimal value) {
            addCriterion("GRID_FILTER_FORM_DEF_ID >", value, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_FORM_DEF_ID >=", value, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdLessThan(BigDecimal value) {
            addCriterion("GRID_FILTER_FORM_DEF_ID <", value, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_FORM_DEF_ID <=", value, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdIn(List<BigDecimal> values) {
            addCriterion("GRID_FILTER_FORM_DEF_ID in", values, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdNotIn(List<BigDecimal> values) {
            addCriterion("GRID_FILTER_FORM_DEF_ID not in", values, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_FILTER_FORM_DEF_ID between", value1, value2, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterFormDefIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_FILTER_FORM_DEF_ID not between", value1, value2, "gridFilterFormDefId");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountIsNull() {
            addCriterion("GRID_FILTER_ROW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountIsNotNull() {
            addCriterion("GRID_FILTER_ROW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_ROW_COUNT =", value, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountNotEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_ROW_COUNT <>", value, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountGreaterThan(BigDecimal value) {
            addCriterion("GRID_FILTER_ROW_COUNT >", value, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_ROW_COUNT >=", value, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountLessThan(BigDecimal value) {
            addCriterion("GRID_FILTER_ROW_COUNT <", value, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_ROW_COUNT <=", value, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountIn(List<BigDecimal> values) {
            addCriterion("GRID_FILTER_ROW_COUNT in", values, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountNotIn(List<BigDecimal> values) {
            addCriterion("GRID_FILTER_ROW_COUNT not in", values, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_FILTER_ROW_COUNT between", value1, value2, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterRowCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_FILTER_ROW_COUNT not between", value1, value2, "gridFilterRowCount");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeIsNull() {
            addCriterion("GRID_FILTER_HEIGHT_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeIsNotNull() {
            addCriterion("GRID_FILTER_HEIGHT_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeEqualTo(String value) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE =", value, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeNotEqualTo(String value) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE <>", value, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeGreaterThan(String value) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE >", value, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE >=", value, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeLessThan(String value) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE <", value, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeLessThanOrEqualTo(String value) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE <=", value, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeLike(String value) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE like", value, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeNotLike(String value) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE not like", value, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeIn(List<String> values) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE in", values, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeNotIn(List<String> values) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE not in", values, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeBetween(String value1, String value2) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE between", value1, value2, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterHeightGradeNotBetween(String value1, String value2) {
            addCriterion("GRID_FILTER_HEIGHT_GRADE not between", value1, value2, "gridFilterHeightGrade");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuIsNull() {
            addCriterion("GRID_FILTER_GROPU is null");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuIsNotNull() {
            addCriterion("GRID_FILTER_GROPU is not null");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_GROPU =", value, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuNotEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_GROPU <>", value, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuGreaterThan(BigDecimal value) {
            addCriterion("GRID_FILTER_GROPU >", value, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_GROPU >=", value, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuLessThan(BigDecimal value) {
            addCriterion("GRID_FILTER_GROPU <", value, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_FILTER_GROPU <=", value, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuIn(List<BigDecimal> values) {
            addCriterion("GRID_FILTER_GROPU in", values, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuNotIn(List<BigDecimal> values) {
            addCriterion("GRID_FILTER_GROPU not in", values, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_FILTER_GROPU between", value1, value2, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterGropuNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_FILTER_GROPU not between", value1, value2, "gridFilterGropu");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutIsNull() {
            addCriterion("GRID_FILTER_BTN_LAYOUT is null");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutIsNotNull() {
            addCriterion("GRID_FILTER_BTN_LAYOUT is not null");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutEqualTo(String value) {
            addCriterion("GRID_FILTER_BTN_LAYOUT =", value, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutNotEqualTo(String value) {
            addCriterion("GRID_FILTER_BTN_LAYOUT <>", value, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutGreaterThan(String value) {
            addCriterion("GRID_FILTER_BTN_LAYOUT >", value, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_FILTER_BTN_LAYOUT >=", value, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutLessThan(String value) {
            addCriterion("GRID_FILTER_BTN_LAYOUT <", value, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutLessThanOrEqualTo(String value) {
            addCriterion("GRID_FILTER_BTN_LAYOUT <=", value, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutLike(String value) {
            addCriterion("GRID_FILTER_BTN_LAYOUT like", value, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutNotLike(String value) {
            addCriterion("GRID_FILTER_BTN_LAYOUT not like", value, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutIn(List<String> values) {
            addCriterion("GRID_FILTER_BTN_LAYOUT in", values, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutNotIn(List<String> values) {
            addCriterion("GRID_FILTER_BTN_LAYOUT not in", values, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutBetween(String value1, String value2) {
            addCriterion("GRID_FILTER_BTN_LAYOUT between", value1, value2, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterBtnLayoutNotBetween(String value1, String value2) {
            addCriterion("GRID_FILTER_BTN_LAYOUT not between", value1, value2, "gridFilterBtnLayout");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthIsNull() {
            addCriterion("GRID_FILTER_LABLE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthIsNotNull() {
            addCriterion("GRID_FILTER_LABLE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthEqualTo(String value) {
            addCriterion("GRID_FILTER_LABLE_WIDTH =", value, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthNotEqualTo(String value) {
            addCriterion("GRID_FILTER_LABLE_WIDTH <>", value, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthGreaterThan(String value) {
            addCriterion("GRID_FILTER_LABLE_WIDTH >", value, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_FILTER_LABLE_WIDTH >=", value, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthLessThan(String value) {
            addCriterion("GRID_FILTER_LABLE_WIDTH <", value, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthLessThanOrEqualTo(String value) {
            addCriterion("GRID_FILTER_LABLE_WIDTH <=", value, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthLike(String value) {
            addCriterion("GRID_FILTER_LABLE_WIDTH like", value, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthNotLike(String value) {
            addCriterion("GRID_FILTER_LABLE_WIDTH not like", value, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthIn(List<String> values) {
            addCriterion("GRID_FILTER_LABLE_WIDTH in", values, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthNotIn(List<String> values) {
            addCriterion("GRID_FILTER_LABLE_WIDTH not in", values, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthBetween(String value1, String value2) {
            addCriterion("GRID_FILTER_LABLE_WIDTH between", value1, value2, "gridFilterLableWidth");
            return (Criteria) this;
        }

        public Criteria andGridFilterLableWidthNotBetween(String value1, String value2) {
            addCriterion("GRID_FILTER_LABLE_WIDTH not between", value1, value2, "gridFilterLableWidth");
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