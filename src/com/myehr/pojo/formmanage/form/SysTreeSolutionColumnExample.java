package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysTreeSolutionColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTreeSolutionColumnExample() {
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

        public Criteria andTreeSluIdIsNull() {
            addCriterion("TREE_SLU_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdIsNotNull() {
            addCriterion("TREE_SLU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdEqualTo(BigDecimal value) {
            addCriterion("TREE_SLU_ID =", value, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdNotEqualTo(BigDecimal value) {
            addCriterion("TREE_SLU_ID <>", value, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdGreaterThan(BigDecimal value) {
            addCriterion("TREE_SLU_ID >", value, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_SLU_ID >=", value, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdLessThan(BigDecimal value) {
            addCriterion("TREE_SLU_ID <", value, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_SLU_ID <=", value, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdIn(List<BigDecimal> values) {
            addCriterion("TREE_SLU_ID in", values, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdNotIn(List<BigDecimal> values) {
            addCriterion("TREE_SLU_ID not in", values, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_SLU_ID between", value1, value2, "treeSluId");
            return (Criteria) this;
        }

        public Criteria andTreeSluIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_SLU_ID not between", value1, value2, "treeSluId");
            return (Criteria) this;
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

        public Criteria andTreeEntityIdIsNull() {
            addCriterion("TREE_ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdIsNotNull() {
            addCriterion("TREE_ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdEqualTo(BigDecimal value) {
            addCriterion("TREE_ENTITY_ID =", value, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdNotEqualTo(BigDecimal value) {
            addCriterion("TREE_ENTITY_ID <>", value, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdGreaterThan(BigDecimal value) {
            addCriterion("TREE_ENTITY_ID >", value, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_ENTITY_ID >=", value, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdLessThan(BigDecimal value) {
            addCriterion("TREE_ENTITY_ID <", value, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_ENTITY_ID <=", value, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdIn(List<BigDecimal> values) {
            addCriterion("TREE_ENTITY_ID in", values, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdNotIn(List<BigDecimal> values) {
            addCriterion("TREE_ENTITY_ID not in", values, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_ENTITY_ID between", value1, value2, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_ENTITY_ID not between", value1, value2, "treeEntityId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdIsNull() {
            addCriterion("TREE_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdIsNotNull() {
            addCriterion("TREE_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdEqualTo(BigDecimal value) {
            addCriterion("TREE_COLUMN_ID =", value, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("TREE_COLUMN_ID <>", value, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdGreaterThan(BigDecimal value) {
            addCriterion("TREE_COLUMN_ID >", value, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_COLUMN_ID >=", value, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdLessThan(BigDecimal value) {
            addCriterion("TREE_COLUMN_ID <", value, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TREE_COLUMN_ID <=", value, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdIn(List<BigDecimal> values) {
            addCriterion("TREE_COLUMN_ID in", values, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("TREE_COLUMN_ID not in", values, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_COLUMN_ID between", value1, value2, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TREE_COLUMN_ID not between", value1, value2, "treeColumnId");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameIsNull() {
            addCriterion("TREE_ENTITY_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameIsNotNull() {
            addCriterion("TREE_ENTITY_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameEqualTo(String value) {
            addCriterion("TREE_ENTITY_TABLENAME =", value, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameNotEqualTo(String value) {
            addCriterion("TREE_ENTITY_TABLENAME <>", value, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameGreaterThan(String value) {
            addCriterion("TREE_ENTITY_TABLENAME >", value, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TREE_ENTITY_TABLENAME >=", value, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameLessThan(String value) {
            addCriterion("TREE_ENTITY_TABLENAME <", value, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameLessThanOrEqualTo(String value) {
            addCriterion("TREE_ENTITY_TABLENAME <=", value, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameLike(String value) {
            addCriterion("TREE_ENTITY_TABLENAME like", value, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameNotLike(String value) {
            addCriterion("TREE_ENTITY_TABLENAME not like", value, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameIn(List<String> values) {
            addCriterion("TREE_ENTITY_TABLENAME in", values, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameNotIn(List<String> values) {
            addCriterion("TREE_ENTITY_TABLENAME not in", values, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameBetween(String value1, String value2) {
            addCriterion("TREE_ENTITY_TABLENAME between", value1, value2, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeEntityTablenameNotBetween(String value1, String value2) {
            addCriterion("TREE_ENTITY_TABLENAME not between", value1, value2, "treeEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameIsNull() {
            addCriterion("TREE_FIELD_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameIsNotNull() {
            addCriterion("TREE_FIELD_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameEqualTo(String value) {
            addCriterion("TREE_FIELD_TABLENAME =", value, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameNotEqualTo(String value) {
            addCriterion("TREE_FIELD_TABLENAME <>", value, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameGreaterThan(String value) {
            addCriterion("TREE_FIELD_TABLENAME >", value, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TREE_FIELD_TABLENAME >=", value, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameLessThan(String value) {
            addCriterion("TREE_FIELD_TABLENAME <", value, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameLessThanOrEqualTo(String value) {
            addCriterion("TREE_FIELD_TABLENAME <=", value, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameLike(String value) {
            addCriterion("TREE_FIELD_TABLENAME like", value, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameNotLike(String value) {
            addCriterion("TREE_FIELD_TABLENAME not like", value, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameIn(List<String> values) {
            addCriterion("TREE_FIELD_TABLENAME in", values, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameNotIn(List<String> values) {
            addCriterion("TREE_FIELD_TABLENAME not in", values, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameBetween(String value1, String value2) {
            addCriterion("TREE_FIELD_TABLENAME between", value1, value2, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeFieldTablenameNotBetween(String value1, String value2) {
            addCriterion("TREE_FIELD_TABLENAME not between", value1, value2, "treeFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeIsNull() {
            addCriterion("TREE_COLUMN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeIsNotNull() {
            addCriterion("TREE_COLUMN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeEqualTo(String value) {
            addCriterion("TREE_COLUMN_TYPE =", value, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeNotEqualTo(String value) {
            addCriterion("TREE_COLUMN_TYPE <>", value, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeGreaterThan(String value) {
            addCriterion("TREE_COLUMN_TYPE >", value, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TREE_COLUMN_TYPE >=", value, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeLessThan(String value) {
            addCriterion("TREE_COLUMN_TYPE <", value, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeLessThanOrEqualTo(String value) {
            addCriterion("TREE_COLUMN_TYPE <=", value, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeLike(String value) {
            addCriterion("TREE_COLUMN_TYPE like", value, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeNotLike(String value) {
            addCriterion("TREE_COLUMN_TYPE not like", value, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeIn(List<String> values) {
            addCriterion("TREE_COLUMN_TYPE in", values, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeNotIn(List<String> values) {
            addCriterion("TREE_COLUMN_TYPE not in", values, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeBetween(String value1, String value2) {
            addCriterion("TREE_COLUMN_TYPE between", value1, value2, "treeColumnType");
            return (Criteria) this;
        }

        public Criteria andTreeColumnTypeNotBetween(String value1, String value2) {
            addCriterion("TREE_COLUMN_TYPE not between", value1, value2, "treeColumnType");
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