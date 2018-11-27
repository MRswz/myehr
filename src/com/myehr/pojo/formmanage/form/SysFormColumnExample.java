package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormColumnExample() {
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

        public Criteria andFormColumnIdIsNull() {
            addCriterion("FORM_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdIsNotNull() {
            addCriterion("FORM_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID =", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID <>", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID >", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID >=", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID <", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID <=", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_ID in", values, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_ID not in", values, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_ID between", value1, value2, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_ID not between", value1, value2, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdIsNull() {
            addCriterion("FORM_COLUMN_FORM_DEF_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdIsNotNull() {
            addCriterion("FORM_COLUMN_FORM_DEF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID =", value, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID <>", value, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID >", value, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID >=", value, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID <", value, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID <=", value, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID in", values, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID not in", values, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID between", value1, value2, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnFormDefIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_FORM_DEF_ID not between", value1, value2, "formColumnFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdIsNull() {
            addCriterion("FORM_COLUMN_ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdIsNotNull() {
            addCriterion("FORM_COLUMN_ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ENTITY_ID =", value, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ENTITY_ID <>", value, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_ENTITY_ID >", value, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ENTITY_ID >=", value, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_ENTITY_ID <", value, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ENTITY_ID <=", value, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_ENTITY_ID in", values, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_ENTITY_ID not in", values, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_ENTITY_ID between", value1, value2, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnEntityIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_ENTITY_ID not between", value1, value2, "formColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdIsNull() {
            addCriterion("FORM_COLUMN_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdIsNotNull() {
            addCriterion("FORM_COLUMN_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_COLUMN_ID =", value, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_COLUMN_ID <>", value, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_COLUMN_ID >", value, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_COLUMN_ID >=", value, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_COLUMN_ID <", value, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_COLUMN_ID <=", value, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_COLUMN_ID in", values, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_COLUMN_ID not in", values, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_COLUMN_ID between", value1, value2, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_COLUMN_ID not between", value1, value2, "formColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameIsNull() {
            addCriterion("FORM_ENTITY_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameIsNotNull() {
            addCriterion("FORM_ENTITY_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameEqualTo(String value) {
            addCriterion("FORM_ENTITY_TABLENAME =", value, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameNotEqualTo(String value) {
            addCriterion("FORM_ENTITY_TABLENAME <>", value, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameGreaterThan(String value) {
            addCriterion("FORM_ENTITY_TABLENAME >", value, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_ENTITY_TABLENAME >=", value, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameLessThan(String value) {
            addCriterion("FORM_ENTITY_TABLENAME <", value, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameLessThanOrEqualTo(String value) {
            addCriterion("FORM_ENTITY_TABLENAME <=", value, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameLike(String value) {
            addCriterion("FORM_ENTITY_TABLENAME like", value, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameNotLike(String value) {
            addCriterion("FORM_ENTITY_TABLENAME not like", value, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameIn(List<String> values) {
            addCriterion("FORM_ENTITY_TABLENAME in", values, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameNotIn(List<String> values) {
            addCriterion("FORM_ENTITY_TABLENAME not in", values, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameBetween(String value1, String value2) {
            addCriterion("FORM_ENTITY_TABLENAME between", value1, value2, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormEntityTablenameNotBetween(String value1, String value2) {
            addCriterion("FORM_ENTITY_TABLENAME not between", value1, value2, "formEntityTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameIsNull() {
            addCriterion("FORM_FIELD_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameIsNotNull() {
            addCriterion("FORM_FIELD_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameEqualTo(String value) {
            addCriterion("FORM_FIELD_TABLENAME =", value, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameNotEqualTo(String value) {
            addCriterion("FORM_FIELD_TABLENAME <>", value, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameGreaterThan(String value) {
            addCriterion("FORM_FIELD_TABLENAME >", value, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_FIELD_TABLENAME >=", value, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameLessThan(String value) {
            addCriterion("FORM_FIELD_TABLENAME <", value, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameLessThanOrEqualTo(String value) {
            addCriterion("FORM_FIELD_TABLENAME <=", value, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameLike(String value) {
            addCriterion("FORM_FIELD_TABLENAME like", value, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameNotLike(String value) {
            addCriterion("FORM_FIELD_TABLENAME not like", value, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameIn(List<String> values) {
            addCriterion("FORM_FIELD_TABLENAME in", values, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameNotIn(List<String> values) {
            addCriterion("FORM_FIELD_TABLENAME not in", values, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameBetween(String value1, String value2) {
            addCriterion("FORM_FIELD_TABLENAME between", value1, value2, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormFieldTablenameNotBetween(String value1, String value2) {
            addCriterion("FORM_FIELD_TABLENAME not between", value1, value2, "formFieldTablename");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameIsNull() {
            addCriterion("FORM_COLUMN_US_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameIsNotNull() {
            addCriterion("FORM_COLUMN_US_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameEqualTo(String value) {
            addCriterion("FORM_COLUMN_US_NAME =", value, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_US_NAME <>", value, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameGreaterThan(String value) {
            addCriterion("FORM_COLUMN_US_NAME >", value, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_US_NAME >=", value, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameLessThan(String value) {
            addCriterion("FORM_COLUMN_US_NAME <", value, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_US_NAME <=", value, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameLike(String value) {
            addCriterion("FORM_COLUMN_US_NAME like", value, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameNotLike(String value) {
            addCriterion("FORM_COLUMN_US_NAME not like", value, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameIn(List<String> values) {
            addCriterion("FORM_COLUMN_US_NAME in", values, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_US_NAME not in", values, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_US_NAME between", value1, value2, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnUsNameNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_US_NAME not between", value1, value2, "formColumnUsName");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableIsNull() {
            addCriterion("FORM_COLUMN_LABLE is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableIsNotNull() {
            addCriterion("FORM_COLUMN_LABLE is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableEqualTo(String value) {
            addCriterion("FORM_COLUMN_LABLE =", value, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_LABLE <>", value, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableGreaterThan(String value) {
            addCriterion("FORM_COLUMN_LABLE >", value, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_LABLE >=", value, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableLessThan(String value) {
            addCriterion("FORM_COLUMN_LABLE <", value, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_LABLE <=", value, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableLike(String value) {
            addCriterion("FORM_COLUMN_LABLE like", value, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableNotLike(String value) {
            addCriterion("FORM_COLUMN_LABLE not like", value, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableIn(List<String> values) {
            addCriterion("FORM_COLUMN_LABLE in", values, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_LABLE not in", values, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_LABLE between", value1, value2, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_LABLE not between", value1, value2, "formColumnLable");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthIsNull() {
            addCriterion("FORM_COLUMN_LABLE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthIsNotNull() {
            addCriterion("FORM_COLUMN_LABLE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthEqualTo(String value) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH =", value, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH <>", value, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthGreaterThan(String value) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH >", value, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH >=", value, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthLessThan(String value) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH <", value, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH <=", value, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthLike(String value) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH like", value, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthNotLike(String value) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH not like", value, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthIn(List<String> values) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH in", values, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH not in", values, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH between", value1, value2, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnLableWidthNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_LABLE_WIDTH not between", value1, value2, "formColumnLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlIsNull() {
            addCriterion("FORM_COLUMN_SQL is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlIsNotNull() {
            addCriterion("FORM_COLUMN_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlEqualTo(String value) {
            addCriterion("FORM_COLUMN_SQL =", value, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_SQL <>", value, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlGreaterThan(String value) {
            addCriterion("FORM_COLUMN_SQL >", value, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_SQL >=", value, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlLessThan(String value) {
            addCriterion("FORM_COLUMN_SQL <", value, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_SQL <=", value, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlLike(String value) {
            addCriterion("FORM_COLUMN_SQL like", value, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlNotLike(String value) {
            addCriterion("FORM_COLUMN_SQL not like", value, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlIn(List<String> values) {
            addCriterion("FORM_COLUMN_SQL in", values, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_SQL not in", values, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_SQL between", value1, value2, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnSqlNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_SQL not between", value1, value2, "formColumnSql");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeIsNull() {
            addCriterion("FORM_COLUMN_GUI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeIsNotNull() {
            addCriterion("FORM_COLUMN_GUI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeEqualTo(String value) {
            addCriterion("FORM_COLUMN_GUI_TYPE =", value, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_GUI_TYPE <>", value, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeGreaterThan(String value) {
            addCriterion("FORM_COLUMN_GUI_TYPE >", value, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_GUI_TYPE >=", value, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeLessThan(String value) {
            addCriterion("FORM_COLUMN_GUI_TYPE <", value, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_GUI_TYPE <=", value, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeLike(String value) {
            addCriterion("FORM_COLUMN_GUI_TYPE like", value, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeNotLike(String value) {
            addCriterion("FORM_COLUMN_GUI_TYPE not like", value, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeIn(List<String> values) {
            addCriterion("FORM_COLUMN_GUI_TYPE in", values, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_GUI_TYPE not in", values, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_GUI_TYPE between", value1, value2, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnGuiTypeNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_GUI_TYPE not between", value1, value2, "formColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthIsNull() {
            addCriterion("FORM_COLUMN_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthIsNotNull() {
            addCriterion("FORM_COLUMN_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthEqualTo(String value) {
            addCriterion("FORM_COLUMN_WIDTH =", value, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_WIDTH <>", value, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthGreaterThan(String value) {
            addCriterion("FORM_COLUMN_WIDTH >", value, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_WIDTH >=", value, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthLessThan(String value) {
            addCriterion("FORM_COLUMN_WIDTH <", value, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_WIDTH <=", value, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthLike(String value) {
            addCriterion("FORM_COLUMN_WIDTH like", value, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthNotLike(String value) {
            addCriterion("FORM_COLUMN_WIDTH not like", value, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthIn(List<String> values) {
            addCriterion("FORM_COLUMN_WIDTH in", values, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_WIDTH not in", values, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_WIDTH between", value1, value2, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnWidthNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_WIDTH not between", value1, value2, "formColumnWidth");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignIsNull() {
            addCriterion("FORM_COLUMN_ALIGN is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignIsNotNull() {
            addCriterion("FORM_COLUMN_ALIGN is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignEqualTo(String value) {
            addCriterion("FORM_COLUMN_ALIGN =", value, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_ALIGN <>", value, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignGreaterThan(String value) {
            addCriterion("FORM_COLUMN_ALIGN >", value, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_ALIGN >=", value, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignLessThan(String value) {
            addCriterion("FORM_COLUMN_ALIGN <", value, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_ALIGN <=", value, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignLike(String value) {
            addCriterion("FORM_COLUMN_ALIGN like", value, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignNotLike(String value) {
            addCriterion("FORM_COLUMN_ALIGN not like", value, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignIn(List<String> values) {
            addCriterion("FORM_COLUMN_ALIGN in", values, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_ALIGN not in", values, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_ALIGN between", value1, value2, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnAlignNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_ALIGN not between", value1, value2, "formColumnAlign");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightIsNull() {
            addCriterion("FORM_COLUMN_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightIsNotNull() {
            addCriterion("FORM_COLUMN_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightEqualTo(String value) {
            addCriterion("FORM_COLUMN_HEIGHT =", value, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_HEIGHT <>", value, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightGreaterThan(String value) {
            addCriterion("FORM_COLUMN_HEIGHT >", value, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_HEIGHT >=", value, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightLessThan(String value) {
            addCriterion("FORM_COLUMN_HEIGHT <", value, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_HEIGHT <=", value, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightLike(String value) {
            addCriterion("FORM_COLUMN_HEIGHT like", value, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightNotLike(String value) {
            addCriterion("FORM_COLUMN_HEIGHT not like", value, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightIn(List<String> values) {
            addCriterion("FORM_COLUMN_HEIGHT in", values, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_HEIGHT not in", values, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_HEIGHT between", value1, value2, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnHeightNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_HEIGHT not between", value1, value2, "formColumnHeight");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortIsNull() {
            addCriterion("FORM_COLUMN_SORT is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortIsNotNull() {
            addCriterion("FORM_COLUMN_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_SORT =", value, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_SORT <>", value, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_SORT >", value, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_SORT >=", value, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_SORT <", value, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_SORT <=", value, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_SORT in", values, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_SORT not in", values, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_SORT between", value1, value2, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_SORT not between", value1, value2, "formColumnSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeIsNull() {
            addCriterion("FORM_COLUMN_SHOW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeIsNotNull() {
            addCriterion("FORM_COLUMN_SHOW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeEqualTo(String value) {
            addCriterion("FORM_COLUMN_SHOW_TYPE =", value, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_SHOW_TYPE <>", value, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeGreaterThan(String value) {
            addCriterion("FORM_COLUMN_SHOW_TYPE >", value, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_SHOW_TYPE >=", value, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeLessThan(String value) {
            addCriterion("FORM_COLUMN_SHOW_TYPE <", value, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_SHOW_TYPE <=", value, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeLike(String value) {
            addCriterion("FORM_COLUMN_SHOW_TYPE like", value, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeNotLike(String value) {
            addCriterion("FORM_COLUMN_SHOW_TYPE not like", value, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeIn(List<String> values) {
            addCriterion("FORM_COLUMN_SHOW_TYPE in", values, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_SHOW_TYPE not in", values, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_SHOW_TYPE between", value1, value2, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnShowTypeNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_SHOW_TYPE not between", value1, value2, "formColumnShowType");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanIsNull() {
            addCriterion("FORM_COLUMN_ROW_SPAN is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanIsNotNull() {
            addCriterion("FORM_COLUMN_ROW_SPAN is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ROW_SPAN =", value, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ROW_SPAN <>", value, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_ROW_SPAN >", value, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ROW_SPAN >=", value, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_ROW_SPAN <", value, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ROW_SPAN <=", value, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_ROW_SPAN in", values, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_ROW_SPAN not in", values, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_ROW_SPAN between", value1, value2, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRowSpanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_ROW_SPAN not between", value1, value2, "formColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanIsNull() {
            addCriterion("FORM_COLUMN_COL_SPAN is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanIsNotNull() {
            addCriterion("FORM_COLUMN_COL_SPAN is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_COL_SPAN =", value, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_COL_SPAN <>", value, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_COL_SPAN >", value, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_COL_SPAN >=", value, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_COL_SPAN <", value, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_COL_SPAN <=", value, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_COL_SPAN in", values, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_COL_SPAN not in", values, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_COL_SPAN between", value1, value2, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnColSpanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_COL_SPAN not between", value1, value2, "formColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredIsNull() {
            addCriterion("FORM_COLUMN_REQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredIsNotNull() {
            addCriterion("FORM_COLUMN_REQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredEqualTo(String value) {
            addCriterion("FORM_COLUMN_REQUIRED =", value, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_REQUIRED <>", value, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredGreaterThan(String value) {
            addCriterion("FORM_COLUMN_REQUIRED >", value, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_REQUIRED >=", value, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredLessThan(String value) {
            addCriterion("FORM_COLUMN_REQUIRED <", value, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_REQUIRED <=", value, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredLike(String value) {
            addCriterion("FORM_COLUMN_REQUIRED like", value, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredNotLike(String value) {
            addCriterion("FORM_COLUMN_REQUIRED not like", value, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredIn(List<String> values) {
            addCriterion("FORM_COLUMN_REQUIRED in", values, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_REQUIRED not in", values, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_REQUIRED between", value1, value2, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnRequiredNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_REQUIRED not between", value1, value2, "formColumnRequired");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdIsNull() {
            addCriterion("FORM_COLUMN_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdIsNotNull() {
            addCriterion("FORM_COLUMN_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdEqualTo(String value) {
            addCriterion("FORM_COLUMN_GROUP_ID =", value, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_GROUP_ID <>", value, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdGreaterThan(String value) {
            addCriterion("FORM_COLUMN_GROUP_ID >", value, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_GROUP_ID >=", value, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdLessThan(String value) {
            addCriterion("FORM_COLUMN_GROUP_ID <", value, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_GROUP_ID <=", value, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdLike(String value) {
            addCriterion("FORM_COLUMN_GROUP_ID like", value, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdNotLike(String value) {
            addCriterion("FORM_COLUMN_GROUP_ID not like", value, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdIn(List<String> values) {
            addCriterion("FORM_COLUMN_GROUP_ID in", values, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_GROUP_ID not in", values, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_GROUP_ID between", value1, value2, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnGroupIdNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_GROUP_ID not between", value1, value2, "formColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunIsNull() {
            addCriterion("FORM_COLUMN_CHANGE_FUN is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunIsNotNull() {
            addCriterion("FORM_COLUMN_CHANGE_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunEqualTo(String value) {
            addCriterion("FORM_COLUMN_CHANGE_FUN =", value, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_CHANGE_FUN <>", value, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunGreaterThan(String value) {
            addCriterion("FORM_COLUMN_CHANGE_FUN >", value, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_CHANGE_FUN >=", value, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunLessThan(String value) {
            addCriterion("FORM_COLUMN_CHANGE_FUN <", value, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_CHANGE_FUN <=", value, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunLike(String value) {
            addCriterion("FORM_COLUMN_CHANGE_FUN like", value, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunNotLike(String value) {
            addCriterion("FORM_COLUMN_CHANGE_FUN not like", value, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunIn(List<String> values) {
            addCriterion("FORM_COLUMN_CHANGE_FUN in", values, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_CHANGE_FUN not in", values, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_CHANGE_FUN between", value1, value2, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnChangeFunNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_CHANGE_FUN not between", value1, value2, "formColumnChangeFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunIsNull() {
            addCriterion("FORM_COLUMN_INIT_FUN is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunIsNotNull() {
            addCriterion("FORM_COLUMN_INIT_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunEqualTo(String value) {
            addCriterion("FORM_COLUMN_INIT_FUN =", value, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_INIT_FUN <>", value, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunGreaterThan(String value) {
            addCriterion("FORM_COLUMN_INIT_FUN >", value, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_INIT_FUN >=", value, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunLessThan(String value) {
            addCriterion("FORM_COLUMN_INIT_FUN <", value, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_INIT_FUN <=", value, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunLike(String value) {
            addCriterion("FORM_COLUMN_INIT_FUN like", value, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunNotLike(String value) {
            addCriterion("FORM_COLUMN_INIT_FUN not like", value, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunIn(List<String> values) {
            addCriterion("FORM_COLUMN_INIT_FUN in", values, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_INIT_FUN not in", values, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_INIT_FUN between", value1, value2, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnInitFunNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_INIT_FUN not between", value1, value2, "formColumnInitFun");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketIsNull() {
            addCriterion("FORM_COLUMN_ISLOCKET is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketIsNotNull() {
            addCriterion("FORM_COLUMN_ISLOCKET is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketEqualTo(String value) {
            addCriterion("FORM_COLUMN_ISLOCKET =", value, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_ISLOCKET <>", value, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketGreaterThan(String value) {
            addCriterion("FORM_COLUMN_ISLOCKET >", value, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_ISLOCKET >=", value, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketLessThan(String value) {
            addCriterion("FORM_COLUMN_ISLOCKET <", value, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_ISLOCKET <=", value, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketLike(String value) {
            addCriterion("FORM_COLUMN_ISLOCKET like", value, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketNotLike(String value) {
            addCriterion("FORM_COLUMN_ISLOCKET not like", value, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketIn(List<String> values) {
            addCriterion("FORM_COLUMN_ISLOCKET in", values, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_ISLOCKET not in", values, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_ISLOCKET between", value1, value2, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnIslocketNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_ISLOCKET not between", value1, value2, "formColumnIslocket");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistIsNull() {
            addCriterion("FORM_COLUMN_RIGIST is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistIsNotNull() {
            addCriterion("FORM_COLUMN_RIGIST is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistEqualTo(String value) {
            addCriterion("FORM_COLUMN_RIGIST =", value, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_RIGIST <>", value, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistGreaterThan(String value) {
            addCriterion("FORM_COLUMN_RIGIST >", value, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_RIGIST >=", value, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistLessThan(String value) {
            addCriterion("FORM_COLUMN_RIGIST <", value, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_RIGIST <=", value, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistLike(String value) {
            addCriterion("FORM_COLUMN_RIGIST like", value, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistNotLike(String value) {
            addCriterion("FORM_COLUMN_RIGIST not like", value, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistIn(List<String> values) {
            addCriterion("FORM_COLUMN_RIGIST in", values, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_RIGIST not in", values, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_RIGIST between", value1, value2, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnRigistNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_RIGIST not between", value1, value2, "formColumnRigist");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeIsNull() {
            addCriterion("FORM_COLUMN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeIsNotNull() {
            addCriterion("FORM_COLUMN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeEqualTo(String value) {
            addCriterion("FORM_COLUMN_TYPE =", value, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_TYPE <>", value, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeGreaterThan(String value) {
            addCriterion("FORM_COLUMN_TYPE >", value, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_TYPE >=", value, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeLessThan(String value) {
            addCriterion("FORM_COLUMN_TYPE <", value, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_TYPE <=", value, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeLike(String value) {
            addCriterion("FORM_COLUMN_TYPE like", value, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeNotLike(String value) {
            addCriterion("FORM_COLUMN_TYPE not like", value, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeIn(List<String> values) {
            addCriterion("FORM_COLUMN_TYPE in", values, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_TYPE not in", values, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_TYPE between", value1, value2, "formColumnType");
            return (Criteria) this;
        }

        public Criteria andFormColumnTypeNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_TYPE not between", value1, value2, "formColumnType");
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

        public Criteria andFormColumnTotalIsNull() {
            addCriterion("FORM_COLUMN_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalIsNotNull() {
            addCriterion("FORM_COLUMN_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalEqualTo(String value) {
            addCriterion("FORM_COLUMN_TOTAL =", value, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_TOTAL <>", value, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalGreaterThan(String value) {
            addCriterion("FORM_COLUMN_TOTAL >", value, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_TOTAL >=", value, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalLessThan(String value) {
            addCriterion("FORM_COLUMN_TOTAL <", value, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_TOTAL <=", value, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalLike(String value) {
            addCriterion("FORM_COLUMN_TOTAL like", value, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalNotLike(String value) {
            addCriterion("FORM_COLUMN_TOTAL not like", value, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalIn(List<String> values) {
            addCriterion("FORM_COLUMN_TOTAL in", values, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_TOTAL not in", values, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_TOTAL between", value1, value2, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnTotalNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_TOTAL not between", value1, value2, "formColumnTotal");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevIsNull() {
            addCriterion("FORM_COLUMN_IS_DEV is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevIsNotNull() {
            addCriterion("FORM_COLUMN_IS_DEV is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevEqualTo(String value) {
            addCriterion("FORM_COLUMN_IS_DEV =", value, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_IS_DEV <>", value, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevGreaterThan(String value) {
            addCriterion("FORM_COLUMN_IS_DEV >", value, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_IS_DEV >=", value, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevLessThan(String value) {
            addCriterion("FORM_COLUMN_IS_DEV <", value, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_IS_DEV <=", value, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevLike(String value) {
            addCriterion("FORM_COLUMN_IS_DEV like", value, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevNotLike(String value) {
            addCriterion("FORM_COLUMN_IS_DEV not like", value, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevIn(List<String> values) {
            addCriterion("FORM_COLUMN_IS_DEV in", values, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_IS_DEV not in", values, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_IS_DEV between", value1, value2, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnIsDevNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_IS_DEV not between", value1, value2, "formColumnIsDev");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthIsNull() {
            addCriterion("FORM_COLUMN_MAX_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthIsNotNull() {
            addCriterion("FORM_COLUMN_MAX_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_MAX_LENGTH =", value, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_MAX_LENGTH <>", value, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_MAX_LENGTH >", value, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_MAX_LENGTH >=", value, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_MAX_LENGTH <", value, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_MAX_LENGTH <=", value, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_MAX_LENGTH in", values, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_MAX_LENGTH not in", values, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_MAX_LENGTH between", value1, value2, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMaxLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_MAX_LENGTH not between", value1, value2, "formColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthIsNull() {
            addCriterion("FORM_COLUMN_MIN_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthIsNotNull() {
            addCriterion("FORM_COLUMN_MIN_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_MIN_LENGTH =", value, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_MIN_LENGTH <>", value, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_MIN_LENGTH >", value, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_MIN_LENGTH >=", value, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_MIN_LENGTH <", value, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_MIN_LENGTH <=", value, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_MIN_LENGTH in", values, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_MIN_LENGTH not in", values, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_MIN_LENGTH between", value1, value2, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnMinLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_MIN_LENGTH not between", value1, value2, "formColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorIsNull() {
            addCriterion("FORM_COLUMN_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorIsNotNull() {
            addCriterion("FORM_COLUMN_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorEqualTo(String value) {
            addCriterion("FORM_COLUMN_COLOR =", value, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_COLOR <>", value, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorGreaterThan(String value) {
            addCriterion("FORM_COLUMN_COLOR >", value, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_COLOR >=", value, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorLessThan(String value) {
            addCriterion("FORM_COLUMN_COLOR <", value, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_COLOR <=", value, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorLike(String value) {
            addCriterion("FORM_COLUMN_COLOR like", value, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorNotLike(String value) {
            addCriterion("FORM_COLUMN_COLOR not like", value, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorIn(List<String> values) {
            addCriterion("FORM_COLUMN_COLOR in", values, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_COLOR not in", values, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_COLOR between", value1, value2, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_COLOR not between", value1, value2, "formColumnColor");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionIsNull() {
            addCriterion("FORM_COLUMN_COLOR_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionIsNotNull() {
            addCriterion("FORM_COLUMN_COLOR_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionEqualTo(String value) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION =", value, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION <>", value, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionGreaterThan(String value) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION >", value, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION >=", value, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionLessThan(String value) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION <", value, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION <=", value, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionLike(String value) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION like", value, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionNotLike(String value) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION not like", value, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionIn(List<String> values) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION in", values, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION not in", values, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION between", value1, value2, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnColorConditionNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_COLOR_CONDITION not between", value1, value2, "formColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdIsNull() {
            addCriterion("FORM_COLUMN_POSITION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdIsNotNull() {
            addCriterion("FORM_COLUMN_POSITION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdEqualTo(String value) {
            addCriterion("FORM_COLUMN_POSITION_ID =", value, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdNotEqualTo(String value) {
            addCriterion("FORM_COLUMN_POSITION_ID <>", value, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdGreaterThan(String value) {
            addCriterion("FORM_COLUMN_POSITION_ID >", value, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_POSITION_ID >=", value, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdLessThan(String value) {
            addCriterion("FORM_COLUMN_POSITION_ID <", value, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdLessThanOrEqualTo(String value) {
            addCriterion("FORM_COLUMN_POSITION_ID <=", value, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdLike(String value) {
            addCriterion("FORM_COLUMN_POSITION_ID like", value, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdNotLike(String value) {
            addCriterion("FORM_COLUMN_POSITION_ID not like", value, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdIn(List<String> values) {
            addCriterion("FORM_COLUMN_POSITION_ID in", values, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdNotIn(List<String> values) {
            addCriterion("FORM_COLUMN_POSITION_ID not in", values, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_POSITION_ID between", value1, value2, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionIdNotBetween(String value1, String value2) {
            addCriterion("FORM_COLUMN_POSITION_ID not between", value1, value2, "formColumnPositionId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdIsNull() {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdIsNotNull() {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdEqualTo(Long value) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID =", value, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdNotEqualTo(Long value) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID <>", value, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdGreaterThan(Long value) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID >", value, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID >=", value, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdLessThan(Long value) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID <", value, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdLessThanOrEqualTo(Long value) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID <=", value, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdIn(List<Long> values) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID in", values, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdNotIn(List<Long> values) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID not in", values, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdBetween(Long value1, Long value2) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID between", value1, value2, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnTemplateColumnIdNotBetween(Long value1, Long value2) {
            addCriterion("FORM_COLUMN_TEMPLATE_COLUMN_ID not between", value1, value2, "formColumnTemplateColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortIsNull() {
            addCriterion("FORM_COLUMN_POSITION_SORT is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortIsNotNull() {
            addCriterion("FORM_COLUMN_POSITION_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortEqualTo(Float value) {
            addCriterion("FORM_COLUMN_POSITION_SORT =", value, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortNotEqualTo(Float value) {
            addCriterion("FORM_COLUMN_POSITION_SORT <>", value, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortGreaterThan(Float value) {
            addCriterion("FORM_COLUMN_POSITION_SORT >", value, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortGreaterThanOrEqualTo(Float value) {
            addCriterion("FORM_COLUMN_POSITION_SORT >=", value, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortLessThan(Float value) {
            addCriterion("FORM_COLUMN_POSITION_SORT <", value, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortLessThanOrEqualTo(Float value) {
            addCriterion("FORM_COLUMN_POSITION_SORT <=", value, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortIn(List<Float> values) {
            addCriterion("FORM_COLUMN_POSITION_SORT in", values, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortNotIn(List<Float> values) {
            addCriterion("FORM_COLUMN_POSITION_SORT not in", values, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortBetween(Float value1, Float value2) {
            addCriterion("FORM_COLUMN_POSITION_SORT between", value1, value2, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andFormColumnPositionSortNotBetween(Float value1, Float value2) {
            addCriterion("FORM_COLUMN_POSITION_SORT not between", value1, value2, "formColumnPositionSort");
            return (Criteria) this;
        }

        public Criteria andIsshowwebIsNull() {
            addCriterion("isShowWeb is null");
            return (Criteria) this;
        }

        public Criteria andIsshowwebIsNotNull() {
            addCriterion("isShowWeb is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowwebEqualTo(String value) {
            addCriterion("isShowWeb =", value, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebNotEqualTo(String value) {
            addCriterion("isShowWeb <>", value, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebGreaterThan(String value) {
            addCriterion("isShowWeb >", value, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebGreaterThanOrEqualTo(String value) {
            addCriterion("isShowWeb >=", value, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebLessThan(String value) {
            addCriterion("isShowWeb <", value, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebLessThanOrEqualTo(String value) {
            addCriterion("isShowWeb <=", value, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebLike(String value) {
            addCriterion("isShowWeb like", value, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebNotLike(String value) {
            addCriterion("isShowWeb not like", value, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebIn(List<String> values) {
            addCriterion("isShowWeb in", values, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebNotIn(List<String> values) {
            addCriterion("isShowWeb not in", values, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebBetween(String value1, String value2) {
            addCriterion("isShowWeb between", value1, value2, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowwebNotBetween(String value1, String value2) {
            addCriterion("isShowWeb not between", value1, value2, "isshowweb");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileIsNull() {
            addCriterion("isShowMobile is null");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileIsNotNull() {
            addCriterion("isShowMobile is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileEqualTo(String value) {
            addCriterion("isShowMobile =", value, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileNotEqualTo(String value) {
            addCriterion("isShowMobile <>", value, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileGreaterThan(String value) {
            addCriterion("isShowMobile >", value, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileGreaterThanOrEqualTo(String value) {
            addCriterion("isShowMobile >=", value, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileLessThan(String value) {
            addCriterion("isShowMobile <", value, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileLessThanOrEqualTo(String value) {
            addCriterion("isShowMobile <=", value, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileLike(String value) {
            addCriterion("isShowMobile like", value, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileNotLike(String value) {
            addCriterion("isShowMobile not like", value, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileIn(List<String> values) {
            addCriterion("isShowMobile in", values, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileNotIn(List<String> values) {
            addCriterion("isShowMobile not in", values, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileBetween(String value1, String value2) {
            addCriterion("isShowMobile between", value1, value2, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andIsshowmobileNotBetween(String value1, String value2) {
            addCriterion("isShowMobile not between", value1, value2, "isshowmobile");
            return (Criteria) this;
        }

        public Criteria andDefaultsortIsNull() {
            addCriterion("defaultSort is null");
            return (Criteria) this;
        }

        public Criteria andDefaultsortIsNotNull() {
            addCriterion("defaultSort is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultsortEqualTo(String value) {
            addCriterion("defaultSort =", value, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortNotEqualTo(String value) {
            addCriterion("defaultSort <>", value, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortGreaterThan(String value) {
            addCriterion("defaultSort >", value, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortGreaterThanOrEqualTo(String value) {
            addCriterion("defaultSort >=", value, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortLessThan(String value) {
            addCriterion("defaultSort <", value, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortLessThanOrEqualTo(String value) {
            addCriterion("defaultSort <=", value, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortLike(String value) {
            addCriterion("defaultSort like", value, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortNotLike(String value) {
            addCriterion("defaultSort not like", value, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortIn(List<String> values) {
            addCriterion("defaultSort in", values, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortNotIn(List<String> values) {
            addCriterion("defaultSort not in", values, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortBetween(String value1, String value2) {
            addCriterion("defaultSort between", value1, value2, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andDefaultsortNotBetween(String value1, String value2) {
            addCriterion("defaultSort not between", value1, value2, "defaultsort");
            return (Criteria) this;
        }

        public Criteria andIssortIsNull() {
            addCriterion("isSort is null");
            return (Criteria) this;
        }

        public Criteria andIssortIsNotNull() {
            addCriterion("isSort is not null");
            return (Criteria) this;
        }

        public Criteria andIssortEqualTo(String value) {
            addCriterion("isSort =", value, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortNotEqualTo(String value) {
            addCriterion("isSort <>", value, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortGreaterThan(String value) {
            addCriterion("isSort >", value, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortGreaterThanOrEqualTo(String value) {
            addCriterion("isSort >=", value, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortLessThan(String value) {
            addCriterion("isSort <", value, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortLessThanOrEqualTo(String value) {
            addCriterion("isSort <=", value, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortLike(String value) {
            addCriterion("isSort like", value, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortNotLike(String value) {
            addCriterion("isSort not like", value, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortIn(List<String> values) {
            addCriterion("isSort in", values, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortNotIn(List<String> values) {
            addCriterion("isSort not in", values, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortBetween(String value1, String value2) {
            addCriterion("isSort between", value1, value2, "issort");
            return (Criteria) this;
        }

        public Criteria andIssortNotBetween(String value1, String value2) {
            addCriterion("isSort not between", value1, value2, "issort");
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