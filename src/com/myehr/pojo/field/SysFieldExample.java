package com.myehr.pojo.field;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFieldExample() {
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

        public Criteria andFieldIdIsNull() {
            addCriterion("FIELD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFieldIdIsNotNull() {
            addCriterion("FIELD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIdEqualTo(BigDecimal value) {
            addCriterion("FIELD_ID =", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotEqualTo(BigDecimal value) {
            addCriterion("FIELD_ID <>", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThan(BigDecimal value) {
            addCriterion("FIELD_ID >", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIELD_ID >=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThan(BigDecimal value) {
            addCriterion("FIELD_ID <", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIELD_ID <=", value, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdIn(List<BigDecimal> values) {
            addCriterion("FIELD_ID in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotIn(List<BigDecimal> values) {
            addCriterion("FIELD_ID not in", values, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIELD_ID between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIELD_ID not between", value1, value2, "fieldId");
            return (Criteria) this;
        }

        public Criteria andFieldCodeIsNull() {
            addCriterion("FIELD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFieldCodeIsNotNull() {
            addCriterion("FIELD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldCodeEqualTo(String value) {
            addCriterion("FIELD_CODE =", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeNotEqualTo(String value) {
            addCriterion("FIELD_CODE <>", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeGreaterThan(String value) {
            addCriterion("FIELD_CODE >", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_CODE >=", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeLessThan(String value) {
            addCriterion("FIELD_CODE <", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeLessThanOrEqualTo(String value) {
            addCriterion("FIELD_CODE <=", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeLike(String value) {
            addCriterion("FIELD_CODE like", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeNotLike(String value) {
            addCriterion("FIELD_CODE not like", value, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeIn(List<String> values) {
            addCriterion("FIELD_CODE in", values, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeNotIn(List<String> values) {
            addCriterion("FIELD_CODE not in", values, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeBetween(String value1, String value2) {
            addCriterion("FIELD_CODE between", value1, value2, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldCodeNotBetween(String value1, String value2) {
            addCriterion("FIELD_CODE not between", value1, value2, "fieldCode");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdIsNull() {
            addCriterion("FIELD_ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdIsNotNull() {
            addCriterion("FIELD_ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdEqualTo(BigDecimal value) {
            addCriterion("FIELD_ENTITY_ID =", value, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdNotEqualTo(BigDecimal value) {
            addCriterion("FIELD_ENTITY_ID <>", value, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdGreaterThan(BigDecimal value) {
            addCriterion("FIELD_ENTITY_ID >", value, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIELD_ENTITY_ID >=", value, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdLessThan(BigDecimal value) {
            addCriterion("FIELD_ENTITY_ID <", value, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIELD_ENTITY_ID <=", value, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdIn(List<BigDecimal> values) {
            addCriterion("FIELD_ENTITY_ID in", values, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdNotIn(List<BigDecimal> values) {
            addCriterion("FIELD_ENTITY_ID not in", values, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIELD_ENTITY_ID between", value1, value2, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldEntityIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIELD_ENTITY_ID not between", value1, value2, "fieldEntityId");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameIsNull() {
            addCriterion("FIELD_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameIsNotNull() {
            addCriterion("FIELD_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameEqualTo(String value) {
            addCriterion("FIELD_TABLENAME =", value, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameNotEqualTo(String value) {
            addCriterion("FIELD_TABLENAME <>", value, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameGreaterThan(String value) {
            addCriterion("FIELD_TABLENAME >", value, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_TABLENAME >=", value, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameLessThan(String value) {
            addCriterion("FIELD_TABLENAME <", value, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_TABLENAME <=", value, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameLike(String value) {
            addCriterion("FIELD_TABLENAME like", value, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameNotLike(String value) {
            addCriterion("FIELD_TABLENAME not like", value, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameIn(List<String> values) {
            addCriterion("FIELD_TABLENAME in", values, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameNotIn(List<String> values) {
            addCriterion("FIELD_TABLENAME not in", values, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameBetween(String value1, String value2) {
            addCriterion("FIELD_TABLENAME between", value1, value2, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldTablenameNotBetween(String value1, String value2) {
            addCriterion("FIELD_TABLENAME not between", value1, value2, "fieldTablename");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameIsNull() {
            addCriterion("FIELD_CHINA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameIsNotNull() {
            addCriterion("FIELD_CHINA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameEqualTo(String value) {
            addCriterion("FIELD_CHINA_NAME =", value, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameNotEqualTo(String value) {
            addCriterion("FIELD_CHINA_NAME <>", value, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameGreaterThan(String value) {
            addCriterion("FIELD_CHINA_NAME >", value, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_CHINA_NAME >=", value, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameLessThan(String value) {
            addCriterion("FIELD_CHINA_NAME <", value, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_CHINA_NAME <=", value, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameLike(String value) {
            addCriterion("FIELD_CHINA_NAME like", value, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameNotLike(String value) {
            addCriterion("FIELD_CHINA_NAME not like", value, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameIn(List<String> values) {
            addCriterion("FIELD_CHINA_NAME in", values, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameNotIn(List<String> values) {
            addCriterion("FIELD_CHINA_NAME not in", values, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameBetween(String value1, String value2) {
            addCriterion("FIELD_CHINA_NAME between", value1, value2, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldChinaNameNotBetween(String value1, String value2) {
            addCriterion("FIELD_CHINA_NAME not between", value1, value2, "fieldChinaName");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullIsNull() {
            addCriterion("FIELD_IS_NULL is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullIsNotNull() {
            addCriterion("FIELD_IS_NULL is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullEqualTo(String value) {
            addCriterion("FIELD_IS_NULL =", value, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullNotEqualTo(String value) {
            addCriterion("FIELD_IS_NULL <>", value, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullGreaterThan(String value) {
            addCriterion("FIELD_IS_NULL >", value, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_NULL >=", value, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullLessThan(String value) {
            addCriterion("FIELD_IS_NULL <", value, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullLessThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_NULL <=", value, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullLike(String value) {
            addCriterion("FIELD_IS_NULL like", value, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullNotLike(String value) {
            addCriterion("FIELD_IS_NULL not like", value, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullIn(List<String> values) {
            addCriterion("FIELD_IS_NULL in", values, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullNotIn(List<String> values) {
            addCriterion("FIELD_IS_NULL not in", values, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullBetween(String value1, String value2) {
            addCriterion("FIELD_IS_NULL between", value1, value2, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsNullNotBetween(String value1, String value2) {
            addCriterion("FIELD_IS_NULL not between", value1, value2, "fieldIsNull");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyIsNull() {
            addCriterion("FIELD_IS_KEY is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyIsNotNull() {
            addCriterion("FIELD_IS_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyEqualTo(String value) {
            addCriterion("FIELD_IS_KEY =", value, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyNotEqualTo(String value) {
            addCriterion("FIELD_IS_KEY <>", value, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyGreaterThan(String value) {
            addCriterion("FIELD_IS_KEY >", value, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_KEY >=", value, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyLessThan(String value) {
            addCriterion("FIELD_IS_KEY <", value, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyLessThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_KEY <=", value, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyLike(String value) {
            addCriterion("FIELD_IS_KEY like", value, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyNotLike(String value) {
            addCriterion("FIELD_IS_KEY not like", value, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyIn(List<String> values) {
            addCriterion("FIELD_IS_KEY in", values, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyNotIn(List<String> values) {
            addCriterion("FIELD_IS_KEY not in", values, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyBetween(String value1, String value2) {
            addCriterion("FIELD_IS_KEY between", value1, value2, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsKeyNotBetween(String value1, String value2) {
            addCriterion("FIELD_IS_KEY not between", value1, value2, "fieldIsKey");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIsNull() {
            addCriterion("FIELD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIsNotNull() {
            addCriterion("FIELD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTypeEqualTo(String value) {
            addCriterion("FIELD_TYPE =", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotEqualTo(String value) {
            addCriterion("FIELD_TYPE <>", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeGreaterThan(String value) {
            addCriterion("FIELD_TYPE >", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_TYPE >=", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLessThan(String value) {
            addCriterion("FIELD_TYPE <", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLessThanOrEqualTo(String value) {
            addCriterion("FIELD_TYPE <=", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeLike(String value) {
            addCriterion("FIELD_TYPE like", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotLike(String value) {
            addCriterion("FIELD_TYPE not like", value, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeIn(List<String> values) {
            addCriterion("FIELD_TYPE in", values, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotIn(List<String> values) {
            addCriterion("FIELD_TYPE not in", values, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeBetween(String value1, String value2) {
            addCriterion("FIELD_TYPE between", value1, value2, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldTypeNotBetween(String value1, String value2) {
            addCriterion("FIELD_TYPE not between", value1, value2, "fieldType");
            return (Criteria) this;
        }

        public Criteria andFieldLenIsNull() {
            addCriterion("FIELD_LEN is null");
            return (Criteria) this;
        }

        public Criteria andFieldLenIsNotNull() {
            addCriterion("FIELD_LEN is not null");
            return (Criteria) this;
        }

        public Criteria andFieldLenEqualTo(String value) {
            addCriterion("FIELD_LEN =", value, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenNotEqualTo(String value) {
            addCriterion("FIELD_LEN <>", value, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenGreaterThan(String value) {
            addCriterion("FIELD_LEN >", value, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_LEN >=", value, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenLessThan(String value) {
            addCriterion("FIELD_LEN <", value, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenLessThanOrEqualTo(String value) {
            addCriterion("FIELD_LEN <=", value, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenLike(String value) {
            addCriterion("FIELD_LEN like", value, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenNotLike(String value) {
            addCriterion("FIELD_LEN not like", value, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenIn(List<String> values) {
            addCriterion("FIELD_LEN in", values, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenNotIn(List<String> values) {
            addCriterion("FIELD_LEN not in", values, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenBetween(String value1, String value2) {
            addCriterion("FIELD_LEN between", value1, value2, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldLenNotBetween(String value1, String value2) {
            addCriterion("FIELD_LEN not between", value1, value2, "fieldLen");
            return (Criteria) this;
        }

        public Criteria andFieldDictIsNull() {
            addCriterion("FIELD_DICT is null");
            return (Criteria) this;
        }

        public Criteria andFieldDictIsNotNull() {
            addCriterion("FIELD_DICT is not null");
            return (Criteria) this;
        }

        public Criteria andFieldDictEqualTo(String value) {
            addCriterion("FIELD_DICT =", value, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictNotEqualTo(String value) {
            addCriterion("FIELD_DICT <>", value, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictGreaterThan(String value) {
            addCriterion("FIELD_DICT >", value, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_DICT >=", value, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictLessThan(String value) {
            addCriterion("FIELD_DICT <", value, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictLessThanOrEqualTo(String value) {
            addCriterion("FIELD_DICT <=", value, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictLike(String value) {
            addCriterion("FIELD_DICT like", value, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictNotLike(String value) {
            addCriterion("FIELD_DICT not like", value, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictIn(List<String> values) {
            addCriterion("FIELD_DICT in", values, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictNotIn(List<String> values) {
            addCriterion("FIELD_DICT not in", values, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictBetween(String value1, String value2) {
            addCriterion("FIELD_DICT between", value1, value2, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldDictNotBetween(String value1, String value2) {
            addCriterion("FIELD_DICT not between", value1, value2, "fieldDict");
            return (Criteria) this;
        }

        public Criteria andFieldSortIsNull() {
            addCriterion("FIELD_SORT is null");
            return (Criteria) this;
        }

        public Criteria andFieldSortIsNotNull() {
            addCriterion("FIELD_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andFieldSortEqualTo(BigDecimal value) {
            addCriterion("FIELD_SORT =", value, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortNotEqualTo(BigDecimal value) {
            addCriterion("FIELD_SORT <>", value, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortGreaterThan(BigDecimal value) {
            addCriterion("FIELD_SORT >", value, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIELD_SORT >=", value, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortLessThan(BigDecimal value) {
            addCriterion("FIELD_SORT <", value, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIELD_SORT <=", value, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortIn(List<BigDecimal> values) {
            addCriterion("FIELD_SORT in", values, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortNotIn(List<BigDecimal> values) {
            addCriterion("FIELD_SORT not in", values, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIELD_SORT between", value1, value2, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIELD_SORT not between", value1, value2, "fieldSort");
            return (Criteria) this;
        }

        public Criteria andFieldStateIsNull() {
            addCriterion("FIELD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andFieldStateIsNotNull() {
            addCriterion("FIELD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldStateEqualTo(String value) {
            addCriterion("FIELD_STATE =", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotEqualTo(String value) {
            addCriterion("FIELD_STATE <>", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateGreaterThan(String value) {
            addCriterion("FIELD_STATE >", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_STATE >=", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLessThan(String value) {
            addCriterion("FIELD_STATE <", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLessThanOrEqualTo(String value) {
            addCriterion("FIELD_STATE <=", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateLike(String value) {
            addCriterion("FIELD_STATE like", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotLike(String value) {
            addCriterion("FIELD_STATE not like", value, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateIn(List<String> values) {
            addCriterion("FIELD_STATE in", values, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotIn(List<String> values) {
            addCriterion("FIELD_STATE not in", values, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateBetween(String value1, String value2) {
            addCriterion("FIELD_STATE between", value1, value2, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldStateNotBetween(String value1, String value2) {
            addCriterion("FIELD_STATE not between", value1, value2, "fieldState");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkIsNull() {
            addCriterion("FIELD_IS_MARK is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkIsNotNull() {
            addCriterion("FIELD_IS_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkEqualTo(String value) {
            addCriterion("FIELD_IS_MARK =", value, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkNotEqualTo(String value) {
            addCriterion("FIELD_IS_MARK <>", value, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkGreaterThan(String value) {
            addCriterion("FIELD_IS_MARK >", value, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_MARK >=", value, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkLessThan(String value) {
            addCriterion("FIELD_IS_MARK <", value, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkLessThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_MARK <=", value, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkLike(String value) {
            addCriterion("FIELD_IS_MARK like", value, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkNotLike(String value) {
            addCriterion("FIELD_IS_MARK not like", value, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkIn(List<String> values) {
            addCriterion("FIELD_IS_MARK in", values, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkNotIn(List<String> values) {
            addCriterion("FIELD_IS_MARK not in", values, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkBetween(String value1, String value2) {
            addCriterion("FIELD_IS_MARK between", value1, value2, "fieldIsMark");
            return (Criteria) this;
        }

        public Criteria andFieldIsMarkNotBetween(String value1, String value2) {
            addCriterion("FIELD_IS_MARK not between", value1, value2, "fieldIsMark");
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

        public Criteria andApproveNameIsNull() {
            addCriterion("APPROVE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApproveNameIsNotNull() {
            addCriterion("APPROVE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApproveNameEqualTo(String value) {
            addCriterion("APPROVE_NAME =", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameNotEqualTo(String value) {
            addCriterion("APPROVE_NAME <>", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameGreaterThan(String value) {
            addCriterion("APPROVE_NAME >", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_NAME >=", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameLessThan(String value) {
            addCriterion("APPROVE_NAME <", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_NAME <=", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameLike(String value) {
            addCriterion("APPROVE_NAME like", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameNotLike(String value) {
            addCriterion("APPROVE_NAME not like", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameIn(List<String> values) {
            addCriterion("APPROVE_NAME in", values, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameNotIn(List<String> values) {
            addCriterion("APPROVE_NAME not in", values, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameBetween(String value1, String value2) {
            addCriterion("APPROVE_NAME between", value1, value2, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameNotBetween(String value1, String value2) {
            addCriterion("APPROVE_NAME not between", value1, value2, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIsNull() {
            addCriterion("APPROVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIsNotNull() {
            addCriterion("APPROVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeEqualTo(Date value) {
            addCriterion("APPROVE_TIME =", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotEqualTo(Date value) {
            addCriterion("APPROVE_TIME <>", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThan(Date value) {
            addCriterion("APPROVE_TIME >", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVE_TIME >=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThan(Date value) {
            addCriterion("APPROVE_TIME <", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPROVE_TIME <=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIn(List<Date> values) {
            addCriterion("APPROVE_TIME in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotIn(List<Date> values) {
            addCriterion("APPROVE_TIME not in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeBetween(Date value1, Date value2) {
            addCriterion("APPROVE_TIME between", value1, value2, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPROVE_TIME not between", value1, value2, "approveTime");
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

        public Criteria andDeleteMarkBackIsNull() {
            addCriterion("DELETE_MARK_BACK is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackIsNotNull() {
            addCriterion("DELETE_MARK_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackEqualTo(String value) {
            addCriterion("DELETE_MARK_BACK =", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackNotEqualTo(String value) {
            addCriterion("DELETE_MARK_BACK <>", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackGreaterThan(String value) {
            addCriterion("DELETE_MARK_BACK >", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK_BACK >=", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackLessThan(String value) {
            addCriterion("DELETE_MARK_BACK <", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackLessThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK_BACK <=", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackLike(String value) {
            addCriterion("DELETE_MARK_BACK like", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackNotLike(String value) {
            addCriterion("DELETE_MARK_BACK not like", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackIn(List<String> values) {
            addCriterion("DELETE_MARK_BACK in", values, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackNotIn(List<String> values) {
            addCriterion("DELETE_MARK_BACK not in", values, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackBetween(String value1, String value2) {
            addCriterion("DELETE_MARK_BACK between", value1, value2, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackNotBetween(String value1, String value2) {
            addCriterion("DELETE_MARK_BACK not between", value1, value2, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIsNull() {
            addCriterion("FIELD_DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIsNotNull() {
            addCriterion("FIELD_DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeEqualTo(String value) {
            addCriterion("FIELD_DATA_TYPE =", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotEqualTo(String value) {
            addCriterion("FIELD_DATA_TYPE <>", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeGreaterThan(String value) {
            addCriterion("FIELD_DATA_TYPE >", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_DATA_TYPE >=", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLessThan(String value) {
            addCriterion("FIELD_DATA_TYPE <", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLessThanOrEqualTo(String value) {
            addCriterion("FIELD_DATA_TYPE <=", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeLike(String value) {
            addCriterion("FIELD_DATA_TYPE like", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotLike(String value) {
            addCriterion("FIELD_DATA_TYPE not like", value, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeIn(List<String> values) {
            addCriterion("FIELD_DATA_TYPE in", values, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotIn(List<String> values) {
            addCriterion("FIELD_DATA_TYPE not in", values, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeBetween(String value1, String value2) {
            addCriterion("FIELD_DATA_TYPE between", value1, value2, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldDataTypeNotBetween(String value1, String value2) {
            addCriterion("FIELD_DATA_TYPE not between", value1, value2, "fieldDataType");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogIsNull() {
            addCriterion("FIELD_IS_LOG is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogIsNotNull() {
            addCriterion("FIELD_IS_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogEqualTo(String value) {
            addCriterion("FIELD_IS_LOG =", value, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogNotEqualTo(String value) {
            addCriterion("FIELD_IS_LOG <>", value, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogGreaterThan(String value) {
            addCriterion("FIELD_IS_LOG >", value, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_LOG >=", value, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogLessThan(String value) {
            addCriterion("FIELD_IS_LOG <", value, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogLessThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_LOG <=", value, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogLike(String value) {
            addCriterion("FIELD_IS_LOG like", value, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogNotLike(String value) {
            addCriterion("FIELD_IS_LOG not like", value, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogIn(List<String> values) {
            addCriterion("FIELD_IS_LOG in", values, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogNotIn(List<String> values) {
            addCriterion("FIELD_IS_LOG not in", values, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogBetween(String value1, String value2) {
            addCriterion("FIELD_IS_LOG between", value1, value2, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsLogNotBetween(String value1, String value2) {
            addCriterion("FIELD_IS_LOG not between", value1, value2, "fieldIsLog");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyIsNull() {
            addCriterion("FIELD_IS_BUS_KEY is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyIsNotNull() {
            addCriterion("FIELD_IS_BUS_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyEqualTo(String value) {
            addCriterion("FIELD_IS_BUS_KEY =", value, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyNotEqualTo(String value) {
            addCriterion("FIELD_IS_BUS_KEY <>", value, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyGreaterThan(String value) {
            addCriterion("FIELD_IS_BUS_KEY >", value, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_BUS_KEY >=", value, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyLessThan(String value) {
            addCriterion("FIELD_IS_BUS_KEY <", value, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyLessThanOrEqualTo(String value) {
            addCriterion("FIELD_IS_BUS_KEY <=", value, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyLike(String value) {
            addCriterion("FIELD_IS_BUS_KEY like", value, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyNotLike(String value) {
            addCriterion("FIELD_IS_BUS_KEY not like", value, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyIn(List<String> values) {
            addCriterion("FIELD_IS_BUS_KEY in", values, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyNotIn(List<String> values) {
            addCriterion("FIELD_IS_BUS_KEY not in", values, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyBetween(String value1, String value2) {
            addCriterion("FIELD_IS_BUS_KEY between", value1, value2, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andFieldIsBusKeyNotBetween(String value1, String value2) {
            addCriterion("FIELD_IS_BUS_KEY not between", value1, value2, "fieldIsBusKey");
            return (Criteria) this;
        }

        public Criteria andControlTypeIsNull() {
            addCriterion("CONTROL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andControlTypeIsNotNull() {
            addCriterion("CONTROL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andControlTypeEqualTo(String value) {
            addCriterion("CONTROL_TYPE =", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotEqualTo(String value) {
            addCriterion("CONTROL_TYPE <>", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeGreaterThan(String value) {
            addCriterion("CONTROL_TYPE >", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROL_TYPE >=", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeLessThan(String value) {
            addCriterion("CONTROL_TYPE <", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTROL_TYPE <=", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeLike(String value) {
            addCriterion("CONTROL_TYPE like", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotLike(String value) {
            addCriterion("CONTROL_TYPE not like", value, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeIn(List<String> values) {
            addCriterion("CONTROL_TYPE in", values, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotIn(List<String> values) {
            addCriterion("CONTROL_TYPE not in", values, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeBetween(String value1, String value2) {
            addCriterion("CONTROL_TYPE between", value1, value2, "controlType");
            return (Criteria) this;
        }

        public Criteria andControlTypeNotBetween(String value1, String value2) {
            addCriterion("CONTROL_TYPE not between", value1, value2, "controlType");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNull() {
            addCriterion("DICT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNotNull() {
            addCriterion("DICT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDictCodeEqualTo(String value) {
            addCriterion("DICT_CODE =", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotEqualTo(String value) {
            addCriterion("DICT_CODE <>", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThan(String value) {
            addCriterion("DICT_CODE >", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_CODE >=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThan(String value) {
            addCriterion("DICT_CODE <", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThanOrEqualTo(String value) {
            addCriterion("DICT_CODE <=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLike(String value) {
            addCriterion("DICT_CODE like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotLike(String value) {
            addCriterion("DICT_CODE not like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeIn(List<String> values) {
            addCriterion("DICT_CODE in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotIn(List<String> values) {
            addCriterion("DICT_CODE not in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeBetween(String value1, String value2) {
            addCriterion("DICT_CODE between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotBetween(String value1, String value2) {
            addCriterion("DICT_CODE not between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdIsNull() {
            addCriterion("FIELD_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdIsNotNull() {
            addCriterion("FIELD_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdEqualTo(Long value) {
            addCriterion("FIELD_RULE_ID =", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdNotEqualTo(Long value) {
            addCriterion("FIELD_RULE_ID <>", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdGreaterThan(Long value) {
            addCriterion("FIELD_RULE_ID >", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FIELD_RULE_ID >=", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdLessThan(Long value) {
            addCriterion("FIELD_RULE_ID <", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("FIELD_RULE_ID <=", value, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdIn(List<Long> values) {
            addCriterion("FIELD_RULE_ID in", values, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdNotIn(List<Long> values) {
            addCriterion("FIELD_RULE_ID not in", values, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdBetween(Long value1, Long value2) {
            addCriterion("FIELD_RULE_ID between", value1, value2, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("FIELD_RULE_ID not between", value1, value2, "fieldRuleId");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxIsNull() {
            addCriterion("FIELD_RULE_MAX is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxIsNotNull() {
            addCriterion("FIELD_RULE_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxEqualTo(String value) {
            addCriterion("FIELD_RULE_MAX =", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxNotEqualTo(String value) {
            addCriterion("FIELD_RULE_MAX <>", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxGreaterThan(String value) {
            addCriterion("FIELD_RULE_MAX >", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_MAX >=", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxLessThan(String value) {
            addCriterion("FIELD_RULE_MAX <", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxLessThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_MAX <=", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxLike(String value) {
            addCriterion("FIELD_RULE_MAX like", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxNotLike(String value) {
            addCriterion("FIELD_RULE_MAX not like", value, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxIn(List<String> values) {
            addCriterion("FIELD_RULE_MAX in", values, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxNotIn(List<String> values) {
            addCriterion("FIELD_RULE_MAX not in", values, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_MAX between", value1, value2, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleMaxNotBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_MAX not between", value1, value2, "fieldRuleMax");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameIsNull() {
            addCriterion("FIELD_RULE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameIsNotNull() {
            addCriterion("FIELD_RULE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameEqualTo(String value) {
            addCriterion("FIELD_RULE_NAME =", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameNotEqualTo(String value) {
            addCriterion("FIELD_RULE_NAME <>", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameGreaterThan(String value) {
            addCriterion("FIELD_RULE_NAME >", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_NAME >=", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameLessThan(String value) {
            addCriterion("FIELD_RULE_NAME <", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_RULE_NAME <=", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameLike(String value) {
            addCriterion("FIELD_RULE_NAME like", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameNotLike(String value) {
            addCriterion("FIELD_RULE_NAME not like", value, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameIn(List<String> values) {
            addCriterion("FIELD_RULE_NAME in", values, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameNotIn(List<String> values) {
            addCriterion("FIELD_RULE_NAME not in", values, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_NAME between", value1, value2, "fieldRuleName");
            return (Criteria) this;
        }

        public Criteria andFieldRuleNameNotBetween(String value1, String value2) {
            addCriterion("FIELD_RULE_NAME not between", value1, value2, "fieldRuleName");
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