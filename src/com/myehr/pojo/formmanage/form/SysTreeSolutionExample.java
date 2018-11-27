package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysTreeSolutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTreeSolutionExample() {
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

        public Criteria andTreeSolutionIdIsNull() {
            addCriterion("TREE_SOLUTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdIsNotNull() {
            addCriterion("TREE_SOLUTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdEqualTo(BigDecimal value) {
            addCriterion("TREE_SOLUTION_ID =", value, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdNotEqualTo(BigDecimal value) {
            addCriterion("TREE_SOLUTION_ID <>", value, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdGreaterThan(BigDecimal value) {
            addCriterion("TREE_SOLUTION_ID >", value, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_SOLUTION_ID >=", value, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdLessThan(BigDecimal value) {
            addCriterion("TREE_SOLUTION_ID <", value, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_SOLUTION_ID <=", value, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdIn(List<BigDecimal> values) {
            addCriterion("TREE_SOLUTION_ID in", values, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdNotIn(List<BigDecimal> values) {
            addCriterion("TREE_SOLUTION_ID not in", values, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_SOLUTION_ID between", value1, value2, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_SOLUTION_ID not between", value1, value2, "treeSolutionId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeIsNull() {
            addCriterion("TREE_SOLUTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeIsNotNull() {
            addCriterion("TREE_SOLUTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeEqualTo(String value) {
            addCriterion("TREE_SOLUTION_CODE =", value, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeNotEqualTo(String value) {
            addCriterion("TREE_SOLUTION_CODE <>", value, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeGreaterThan(String value) {
            addCriterion("TREE_SOLUTION_CODE >", value, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TREE_SOLUTION_CODE >=", value, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeLessThan(String value) {
            addCriterion("TREE_SOLUTION_CODE <", value, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeLessThanOrEqualTo(String value) {
            addCriterion("TREE_SOLUTION_CODE <=", value, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeLike(String value) {
            addCriterion("TREE_SOLUTION_CODE like", value, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeNotLike(String value) {
            addCriterion("TREE_SOLUTION_CODE not like", value, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeIn(List<String> values) {
            addCriterion("TREE_SOLUTION_CODE in", values, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeNotIn(List<String> values) {
            addCriterion("TREE_SOLUTION_CODE not in", values, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeBetween(String value1, String value2) {
            addCriterion("TREE_SOLUTION_CODE between", value1, value2, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionCodeNotBetween(String value1, String value2) {
            addCriterion("TREE_SOLUTION_CODE not between", value1, value2, "treeSolutionCode");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameIsNull() {
            addCriterion("TREE_SOLUTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameIsNotNull() {
            addCriterion("TREE_SOLUTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameEqualTo(String value) {
            addCriterion("TREE_SOLUTION_NAME =", value, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameNotEqualTo(String value) {
            addCriterion("TREE_SOLUTION_NAME <>", value, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameGreaterThan(String value) {
            addCriterion("TREE_SOLUTION_NAME >", value, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("TREE_SOLUTION_NAME >=", value, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameLessThan(String value) {
            addCriterion("TREE_SOLUTION_NAME <", value, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameLessThanOrEqualTo(String value) {
            addCriterion("TREE_SOLUTION_NAME <=", value, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameLike(String value) {
            addCriterion("TREE_SOLUTION_NAME like", value, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameNotLike(String value) {
            addCriterion("TREE_SOLUTION_NAME not like", value, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameIn(List<String> values) {
            addCriterion("TREE_SOLUTION_NAME in", values, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameNotIn(List<String> values) {
            addCriterion("TREE_SOLUTION_NAME not in", values, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameBetween(String value1, String value2) {
            addCriterion("TREE_SOLUTION_NAME between", value1, value2, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionNameNotBetween(String value1, String value2) {
            addCriterion("TREE_SOLUTION_NAME not between", value1, value2, "treeSolutionName");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlIsNull() {
            addCriterion("TREE_SOLUTION_ENTITY_SQL is null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlIsNotNull() {
            addCriterion("TREE_SOLUTION_ENTITY_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlEqualTo(String value) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL =", value, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlNotEqualTo(String value) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL <>", value, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlGreaterThan(String value) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL >", value, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlGreaterThanOrEqualTo(String value) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL >=", value, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlLessThan(String value) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL <", value, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlLessThanOrEqualTo(String value) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL <=", value, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlLike(String value) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL like", value, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlNotLike(String value) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL not like", value, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlIn(List<String> values) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL in", values, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlNotIn(List<String> values) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL not in", values, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlBetween(String value1, String value2) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL between", value1, value2, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionEntitySqlNotBetween(String value1, String value2) {
            addCriterion("TREE_SOLUTION_ENTITY_SQL not between", value1, value2, "treeSolutionEntitySql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlIsNull() {
            addCriterion("TREE_SOLUTION_EXC_SQL is null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlIsNotNull() {
            addCriterion("TREE_SOLUTION_EXC_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlEqualTo(String value) {
            addCriterion("TREE_SOLUTION_EXC_SQL =", value, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlNotEqualTo(String value) {
            addCriterion("TREE_SOLUTION_EXC_SQL <>", value, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlGreaterThan(String value) {
            addCriterion("TREE_SOLUTION_EXC_SQL >", value, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlGreaterThanOrEqualTo(String value) {
            addCriterion("TREE_SOLUTION_EXC_SQL >=", value, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlLessThan(String value) {
            addCriterion("TREE_SOLUTION_EXC_SQL <", value, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlLessThanOrEqualTo(String value) {
            addCriterion("TREE_SOLUTION_EXC_SQL <=", value, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlLike(String value) {
            addCriterion("TREE_SOLUTION_EXC_SQL like", value, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlNotLike(String value) {
            addCriterion("TREE_SOLUTION_EXC_SQL not like", value, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlIn(List<String> values) {
            addCriterion("TREE_SOLUTION_EXC_SQL in", values, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlNotIn(List<String> values) {
            addCriterion("TREE_SOLUTION_EXC_SQL not in", values, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlBetween(String value1, String value2) {
            addCriterion("TREE_SOLUTION_EXC_SQL between", value1, value2, "treeSolutionExcSql");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionExcSqlNotBetween(String value1, String value2) {
            addCriterion("TREE_SOLUTION_EXC_SQL not between", value1, value2, "treeSolutionExcSql");
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

        public Criteria andTreeSolutionFolderIdIsNull() {
            addCriterion("TREE_SOLUTION_FOLDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdIsNotNull() {
            addCriterion("TREE_SOLUTION_FOLDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdEqualTo(BigDecimal value) {
            addCriterion("TREE_SOLUTION_FOLDER_ID =", value, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdNotEqualTo(BigDecimal value) {
            addCriterion("TREE_SOLUTION_FOLDER_ID <>", value, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdGreaterThan(BigDecimal value) {
            addCriterion("TREE_SOLUTION_FOLDER_ID >", value, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_SOLUTION_FOLDER_ID >=", value, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdLessThan(BigDecimal value) {
            addCriterion("TREE_SOLUTION_FOLDER_ID <", value, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_SOLUTION_FOLDER_ID <=", value, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdIn(List<BigDecimal> values) {
            addCriterion("TREE_SOLUTION_FOLDER_ID in", values, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdNotIn(List<BigDecimal> values) {
            addCriterion("TREE_SOLUTION_FOLDER_ID not in", values, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_SOLUTION_FOLDER_ID between", value1, value2, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andTreeSolutionFolderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_SOLUTION_FOLDER_ID not between", value1, value2, "treeSolutionFolderId");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNull() {
            addCriterion("DELETE_MARK is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNotNull() {
            addCriterion("DELETE_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkEqualTo(String value) {
            addCriterion("DELETE_MARK =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(String value) {
            addCriterion("DELETE_MARK <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(String value) {
            addCriterion("DELETE_MARK >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(String value) {
            addCriterion("DELETE_MARK <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLike(String value) {
            addCriterion("DELETE_MARK like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotLike(String value) {
            addCriterion("DELETE_MARK not like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<String> values) {
            addCriterion("DELETE_MARK in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<String> values) {
            addCriterion("DELETE_MARK not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(String value1, String value2) {
            addCriterion("DELETE_MARK between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(String value1, String value2) {
            addCriterion("DELETE_MARK not between", value1, value2, "deleteMark");
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