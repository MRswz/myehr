package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysFormCalculateSolutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormCalculateSolutionExample() {
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

        public Criteria andCalculateSolutionIdIsNull() {
            addCriterion("CALCULATE_SOLUTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdIsNotNull() {
            addCriterion("CALCULATE_SOLUTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_SOLUTION_ID =", value, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdNotEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_SOLUTION_ID <>", value, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdGreaterThan(BigDecimal value) {
            addCriterion("CALCULATE_SOLUTION_ID >", value, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_SOLUTION_ID >=", value, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdLessThan(BigDecimal value) {
            addCriterion("CALCULATE_SOLUTION_ID <", value, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CALCULATE_SOLUTION_ID <=", value, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdIn(List<BigDecimal> values) {
            addCriterion("CALCULATE_SOLUTION_ID in", values, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdNotIn(List<BigDecimal> values) {
            addCriterion("CALCULATE_SOLUTION_ID not in", values, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALCULATE_SOLUTION_ID between", value1, value2, "calculateSolutionId");
            return (Criteria) this;
        }

        public Criteria andCalculateSolutionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CALCULATE_SOLUTION_ID not between", value1, value2, "calculateSolutionId");
            return (Criteria) this;
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

        public Criteria andSolutionIdIsNull() {
            addCriterion("SOLUTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSolutionIdIsNotNull() {
            addCriterion("SOLUTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionIdEqualTo(BigDecimal value) {
            addCriterion("SOLUTION_ID =", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotEqualTo(BigDecimal value) {
            addCriterion("SOLUTION_ID <>", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdGreaterThan(BigDecimal value) {
            addCriterion("SOLUTION_ID >", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOLUTION_ID >=", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdLessThan(BigDecimal value) {
            addCriterion("SOLUTION_ID <", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOLUTION_ID <=", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdIn(List<BigDecimal> values) {
            addCriterion("SOLUTION_ID in", values, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotIn(List<BigDecimal> values) {
            addCriterion("SOLUTION_ID not in", values, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOLUTION_ID between", value1, value2, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOLUTION_ID not between", value1, value2, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(BigDecimal value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(BigDecimal value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(BigDecimal value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(BigDecimal value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<BigDecimal> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<BigDecimal> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SORT not between", value1, value2, "sort");
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