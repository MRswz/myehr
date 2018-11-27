package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysSqlParamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSqlParamsExample() {
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

        public Criteria andSqlParamsIdIsNull() {
            addCriterion("SQL_PARAMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdIsNotNull() {
            addCriterion("SQL_PARAMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAMS_ID =", value, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdNotEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAMS_ID <>", value, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdGreaterThan(BigDecimal value) {
            addCriterion("SQL_PARAMS_ID >", value, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAMS_ID >=", value, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdLessThan(BigDecimal value) {
            addCriterion("SQL_PARAMS_ID <", value, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAMS_ID <=", value, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdIn(List<BigDecimal> values) {
            addCriterion("SQL_PARAMS_ID in", values, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdNotIn(List<BigDecimal> values) {
            addCriterion("SQL_PARAMS_ID not in", values, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQL_PARAMS_ID between", value1, value2, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQL_PARAMS_ID not between", value1, value2, "sqlParamsId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeIsNull() {
            addCriterion("SQL_PARAMS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeIsNotNull() {
            addCriterion("SQL_PARAMS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeEqualTo(String value) {
            addCriterion("SQL_PARAMS_CODE =", value, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeNotEqualTo(String value) {
            addCriterion("SQL_PARAMS_CODE <>", value, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeGreaterThan(String value) {
            addCriterion("SQL_PARAMS_CODE >", value, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_CODE >=", value, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeLessThan(String value) {
            addCriterion("SQL_PARAMS_CODE <", value, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeLessThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_CODE <=", value, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeLike(String value) {
            addCriterion("SQL_PARAMS_CODE like", value, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeNotLike(String value) {
            addCriterion("SQL_PARAMS_CODE not like", value, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeIn(List<String> values) {
            addCriterion("SQL_PARAMS_CODE in", values, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeNotIn(List<String> values) {
            addCriterion("SQL_PARAMS_CODE not in", values, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_CODE between", value1, value2, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsCodeNotBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_CODE not between", value1, value2, "sqlParamsCode");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameIsNull() {
            addCriterion("SQL_PARAMS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameIsNotNull() {
            addCriterion("SQL_PARAMS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameEqualTo(String value) {
            addCriterion("SQL_PARAMS_NAME =", value, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameNotEqualTo(String value) {
            addCriterion("SQL_PARAMS_NAME <>", value, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameGreaterThan(String value) {
            addCriterion("SQL_PARAMS_NAME >", value, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_NAME >=", value, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameLessThan(String value) {
            addCriterion("SQL_PARAMS_NAME <", value, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameLessThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_NAME <=", value, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameLike(String value) {
            addCriterion("SQL_PARAMS_NAME like", value, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameNotLike(String value) {
            addCriterion("SQL_PARAMS_NAME not like", value, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameIn(List<String> values) {
            addCriterion("SQL_PARAMS_NAME in", values, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameNotIn(List<String> values) {
            addCriterion("SQL_PARAMS_NAME not in", values, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_NAME between", value1, value2, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsNameNotBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_NAME not between", value1, value2, "sqlParamsName");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeIsNull() {
            addCriterion("SQL_PARAMS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeIsNotNull() {
            addCriterion("SQL_PARAMS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeEqualTo(String value) {
            addCriterion("SQL_PARAMS_TYPE =", value, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeNotEqualTo(String value) {
            addCriterion("SQL_PARAMS_TYPE <>", value, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeGreaterThan(String value) {
            addCriterion("SQL_PARAMS_TYPE >", value, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_TYPE >=", value, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeLessThan(String value) {
            addCriterion("SQL_PARAMS_TYPE <", value, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeLessThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_TYPE <=", value, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeLike(String value) {
            addCriterion("SQL_PARAMS_TYPE like", value, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeNotLike(String value) {
            addCriterion("SQL_PARAMS_TYPE not like", value, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeIn(List<String> values) {
            addCriterion("SQL_PARAMS_TYPE in", values, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeNotIn(List<String> values) {
            addCriterion("SQL_PARAMS_TYPE not in", values, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_TYPE between", value1, value2, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsTypeNotBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_TYPE not between", value1, value2, "sqlParamsType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdIsNull() {
            addCriterion("SQL_PARAMS_FOLDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdIsNotNull() {
            addCriterion("SQL_PARAMS_FOLDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAMS_FOLDER_ID =", value, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdNotEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAMS_FOLDER_ID <>", value, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdGreaterThan(BigDecimal value) {
            addCriterion("SQL_PARAMS_FOLDER_ID >", value, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAMS_FOLDER_ID >=", value, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdLessThan(BigDecimal value) {
            addCriterion("SQL_PARAMS_FOLDER_ID <", value, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAMS_FOLDER_ID <=", value, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdIn(List<BigDecimal> values) {
            addCriterion("SQL_PARAMS_FOLDER_ID in", values, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdNotIn(List<BigDecimal> values) {
            addCriterion("SQL_PARAMS_FOLDER_ID not in", values, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQL_PARAMS_FOLDER_ID between", value1, value2, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsFolderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQL_PARAMS_FOLDER_ID not between", value1, value2, "sqlParamsFolderId");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeIsNull() {
            addCriterion("SQL_PARAMS_DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeIsNotNull() {
            addCriterion("SQL_PARAMS_DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeEqualTo(String value) {
            addCriterion("SQL_PARAMS_DATA_TYPE =", value, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeNotEqualTo(String value) {
            addCriterion("SQL_PARAMS_DATA_TYPE <>", value, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeGreaterThan(String value) {
            addCriterion("SQL_PARAMS_DATA_TYPE >", value, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_DATA_TYPE >=", value, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeLessThan(String value) {
            addCriterion("SQL_PARAMS_DATA_TYPE <", value, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeLessThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_DATA_TYPE <=", value, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeLike(String value) {
            addCriterion("SQL_PARAMS_DATA_TYPE like", value, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeNotLike(String value) {
            addCriterion("SQL_PARAMS_DATA_TYPE not like", value, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeIn(List<String> values) {
            addCriterion("SQL_PARAMS_DATA_TYPE in", values, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeNotIn(List<String> values) {
            addCriterion("SQL_PARAMS_DATA_TYPE not in", values, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_DATA_TYPE between", value1, value2, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDataTypeNotBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_DATA_TYPE not between", value1, value2, "sqlParamsDataType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescIsNull() {
            addCriterion("SQL_PARAMS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescIsNotNull() {
            addCriterion("SQL_PARAMS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescEqualTo(String value) {
            addCriterion("SQL_PARAMS_DESC =", value, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescNotEqualTo(String value) {
            addCriterion("SQL_PARAMS_DESC <>", value, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescGreaterThan(String value) {
            addCriterion("SQL_PARAMS_DESC >", value, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_DESC >=", value, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescLessThan(String value) {
            addCriterion("SQL_PARAMS_DESC <", value, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescLessThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_DESC <=", value, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescLike(String value) {
            addCriterion("SQL_PARAMS_DESC like", value, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescNotLike(String value) {
            addCriterion("SQL_PARAMS_DESC not like", value, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescIn(List<String> values) {
            addCriterion("SQL_PARAMS_DESC in", values, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescNotIn(List<String> values) {
            addCriterion("SQL_PARAMS_DESC not in", values, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_DESC between", value1, value2, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamsDescNotBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_DESC not between", value1, value2, "sqlParamsDesc");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdIsNull() {
            addCriterion("SQL_PARAM_SCHEMA_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdIsNotNull() {
            addCriterion("SQL_PARAM_SCHEMA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAM_SCHEMA_ID =", value, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdNotEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAM_SCHEMA_ID <>", value, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdGreaterThan(BigDecimal value) {
            addCriterion("SQL_PARAM_SCHEMA_ID >", value, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAM_SCHEMA_ID >=", value, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdLessThan(BigDecimal value) {
            addCriterion("SQL_PARAM_SCHEMA_ID <", value, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SQL_PARAM_SCHEMA_ID <=", value, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdIn(List<BigDecimal> values) {
            addCriterion("SQL_PARAM_SCHEMA_ID in", values, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdNotIn(List<BigDecimal> values) {
            addCriterion("SQL_PARAM_SCHEMA_ID not in", values, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQL_PARAM_SCHEMA_ID between", value1, value2, "sqlParamSchemaId");
            return (Criteria) this;
        }

        public Criteria andSqlParamSchemaIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SQL_PARAM_SCHEMA_ID not between", value1, value2, "sqlParamSchemaId");
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

        public Criteria andSqlParamsGuiTypeIsNull() {
            addCriterion("SQL_PARAMS_GUI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeIsNotNull() {
            addCriterion("SQL_PARAMS_GUI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeEqualTo(String value) {
            addCriterion("SQL_PARAMS_GUI_TYPE =", value, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeNotEqualTo(String value) {
            addCriterion("SQL_PARAMS_GUI_TYPE <>", value, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeGreaterThan(String value) {
            addCriterion("SQL_PARAMS_GUI_TYPE >", value, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_GUI_TYPE >=", value, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeLessThan(String value) {
            addCriterion("SQL_PARAMS_GUI_TYPE <", value, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeLessThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_GUI_TYPE <=", value, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeLike(String value) {
            addCriterion("SQL_PARAMS_GUI_TYPE like", value, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeNotLike(String value) {
            addCriterion("SQL_PARAMS_GUI_TYPE not like", value, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeIn(List<String> values) {
            addCriterion("SQL_PARAMS_GUI_TYPE in", values, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeNotIn(List<String> values) {
            addCriterion("SQL_PARAMS_GUI_TYPE not in", values, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_GUI_TYPE between", value1, value2, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsGuiTypeNotBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_GUI_TYPE not between", value1, value2, "sqlParamsGuiType");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueIsNull() {
            addCriterion("SQL_PARAMS_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueIsNotNull() {
            addCriterion("SQL_PARAMS_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueEqualTo(String value) {
            addCriterion("SQL_PARAMS_VALUE =", value, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueNotEqualTo(String value) {
            addCriterion("SQL_PARAMS_VALUE <>", value, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueGreaterThan(String value) {
            addCriterion("SQL_PARAMS_VALUE >", value, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_VALUE >=", value, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueLessThan(String value) {
            addCriterion("SQL_PARAMS_VALUE <", value, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueLessThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_VALUE <=", value, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueLike(String value) {
            addCriterion("SQL_PARAMS_VALUE like", value, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueNotLike(String value) {
            addCriterion("SQL_PARAMS_VALUE not like", value, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueIn(List<String> values) {
            addCriterion("SQL_PARAMS_VALUE in", values, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueNotIn(List<String> values) {
            addCriterion("SQL_PARAMS_VALUE not in", values, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_VALUE between", value1, value2, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsValueNotBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_VALUE not between", value1, value2, "sqlParamsValue");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredIsNull() {
            addCriterion("SQL_PARAMS_IS_REQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredIsNotNull() {
            addCriterion("SQL_PARAMS_IS_REQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredEqualTo(String value) {
            addCriterion("SQL_PARAMS_IS_REQUIRED =", value, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredNotEqualTo(String value) {
            addCriterion("SQL_PARAMS_IS_REQUIRED <>", value, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredGreaterThan(String value) {
            addCriterion("SQL_PARAMS_IS_REQUIRED >", value, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_IS_REQUIRED >=", value, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredLessThan(String value) {
            addCriterion("SQL_PARAMS_IS_REQUIRED <", value, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredLessThanOrEqualTo(String value) {
            addCriterion("SQL_PARAMS_IS_REQUIRED <=", value, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredLike(String value) {
            addCriterion("SQL_PARAMS_IS_REQUIRED like", value, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredNotLike(String value) {
            addCriterion("SQL_PARAMS_IS_REQUIRED not like", value, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredIn(List<String> values) {
            addCriterion("SQL_PARAMS_IS_REQUIRED in", values, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredNotIn(List<String> values) {
            addCriterion("SQL_PARAMS_IS_REQUIRED not in", values, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_IS_REQUIRED between", value1, value2, "sqlParamsIsRequired");
            return (Criteria) this;
        }

        public Criteria andSqlParamsIsRequiredNotBetween(String value1, String value2) {
            addCriterion("SQL_PARAMS_IS_REQUIRED not between", value1, value2, "sqlParamsIsRequired");
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