package com.myehr.pojo.field;

import java.util.ArrayList;
import java.util.List;

public class DataFieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataFieldExample() {
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

        public Criteria andDtIdIsNull() {
            addCriterion("DT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDtIdIsNotNull() {
            addCriterion("DT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDtIdEqualTo(Integer value) {
            addCriterion("DT_ID =", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotEqualTo(Integer value) {
            addCriterion("DT_ID <>", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThan(Integer value) {
            addCriterion("DT_ID >", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DT_ID >=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThan(Integer value) {
            addCriterion("DT_ID <", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThanOrEqualTo(Integer value) {
            addCriterion("DT_ID <=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdIn(List<Integer> values) {
            addCriterion("DT_ID in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotIn(List<Integer> values) {
            addCriterion("DT_ID not in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdBetween(Integer value1, Integer value2) {
            addCriterion("DT_ID between", value1, value2, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DT_ID not between", value1, value2, "dtId");
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

        public Criteria andFieldNameIsNull() {
            addCriterion("FIELD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("FIELD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("FIELD_NAME =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("FIELD_NAME <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("FIELD_NAME >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("FIELD_NAME <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("FIELD_NAME like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("FIELD_NAME not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("FIELD_NAME in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("FIELD_NAME not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("FIELD_NAME between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("FIELD_NAME not between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIsNull() {
            addCriterion("ISREQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIsNotNull() {
            addCriterion("ISREQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andIsrequiredEqualTo(String value) {
            addCriterion("ISREQUIRED =", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotEqualTo(String value) {
            addCriterion("ISREQUIRED <>", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredGreaterThan(String value) {
            addCriterion("ISREQUIRED >", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredGreaterThanOrEqualTo(String value) {
            addCriterion("ISREQUIRED >=", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLessThan(String value) {
            addCriterion("ISREQUIRED <", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLessThanOrEqualTo(String value) {
            addCriterion("ISREQUIRED <=", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLike(String value) {
            addCriterion("ISREQUIRED like", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotLike(String value) {
            addCriterion("ISREQUIRED not like", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIn(List<String> values) {
            addCriterion("ISREQUIRED in", values, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotIn(List<String> values) {
            addCriterion("ISREQUIRED not in", values, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredBetween(String value1, String value2) {
            addCriterion("ISREQUIRED between", value1, value2, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotBetween(String value1, String value2) {
            addCriterion("ISREQUIRED not between", value1, value2, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIspkIsNull() {
            addCriterion("ISPK is null");
            return (Criteria) this;
        }

        public Criteria andIspkIsNotNull() {
            addCriterion("ISPK is not null");
            return (Criteria) this;
        }

        public Criteria andIspkEqualTo(String value) {
            addCriterion("ISPK =", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkNotEqualTo(String value) {
            addCriterion("ISPK <>", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkGreaterThan(String value) {
            addCriterion("ISPK >", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkGreaterThanOrEqualTo(String value) {
            addCriterion("ISPK >=", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkLessThan(String value) {
            addCriterion("ISPK <", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkLessThanOrEqualTo(String value) {
            addCriterion("ISPK <=", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkLike(String value) {
            addCriterion("ISPK like", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkNotLike(String value) {
            addCriterion("ISPK not like", value, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkIn(List<String> values) {
            addCriterion("ISPK in", values, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkNotIn(List<String> values) {
            addCriterion("ISPK not in", values, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkBetween(String value1, String value2) {
            addCriterion("ISPK between", value1, value2, "ispk");
            return (Criteria) this;
        }

        public Criteria andIspkNotBetween(String value1, String value2) {
            addCriterion("ISPK not between", value1, value2, "ispk");
            return (Criteria) this;
        }

        public Criteria andIsnkIsNull() {
            addCriterion("ISNK is null");
            return (Criteria) this;
        }

        public Criteria andIsnkIsNotNull() {
            addCriterion("ISNK is not null");
            return (Criteria) this;
        }

        public Criteria andIsnkEqualTo(String value) {
            addCriterion("ISNK =", value, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkNotEqualTo(String value) {
            addCriterion("ISNK <>", value, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkGreaterThan(String value) {
            addCriterion("ISNK >", value, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkGreaterThanOrEqualTo(String value) {
            addCriterion("ISNK >=", value, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkLessThan(String value) {
            addCriterion("ISNK <", value, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkLessThanOrEqualTo(String value) {
            addCriterion("ISNK <=", value, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkLike(String value) {
            addCriterion("ISNK like", value, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkNotLike(String value) {
            addCriterion("ISNK not like", value, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkIn(List<String> values) {
            addCriterion("ISNK in", values, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkNotIn(List<String> values) {
            addCriterion("ISNK not in", values, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkBetween(String value1, String value2) {
            addCriterion("ISNK between", value1, value2, "isnk");
            return (Criteria) this;
        }

        public Criteria andIsnkNotBetween(String value1, String value2) {
            addCriterion("ISNK not between", value1, value2, "isnk");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameIsNull() {
            addCriterion("FIELD_ENGLISHNAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameIsNotNull() {
            addCriterion("FIELD_ENGLISHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameEqualTo(String value) {
            addCriterion("FIELD_ENGLISHNAME =", value, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameNotEqualTo(String value) {
            addCriterion("FIELD_ENGLISHNAME <>", value, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameGreaterThan(String value) {
            addCriterion("FIELD_ENGLISHNAME >", value, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_ENGLISHNAME >=", value, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameLessThan(String value) {
            addCriterion("FIELD_ENGLISHNAME <", value, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_ENGLISHNAME <=", value, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameLike(String value) {
            addCriterion("FIELD_ENGLISHNAME like", value, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameNotLike(String value) {
            addCriterion("FIELD_ENGLISHNAME not like", value, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameIn(List<String> values) {
            addCriterion("FIELD_ENGLISHNAME in", values, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameNotIn(List<String> values) {
            addCriterion("FIELD_ENGLISHNAME not in", values, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameBetween(String value1, String value2) {
            addCriterion("FIELD_ENGLISHNAME between", value1, value2, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andFieldEnglishnameNotBetween(String value1, String value2) {
            addCriterion("FIELD_ENGLISHNAME not between", value1, value2, "fieldEnglishname");
            return (Criteria) this;
        }

        public Criteria andTableCodeIsNull() {
            addCriterion("TABLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTableCodeIsNotNull() {
            addCriterion("TABLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTableCodeEqualTo(String value) {
            addCriterion("TABLE_CODE =", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeNotEqualTo(String value) {
            addCriterion("TABLE_CODE <>", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeGreaterThan(String value) {
            addCriterion("TABLE_CODE >", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_CODE >=", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeLessThan(String value) {
            addCriterion("TABLE_CODE <", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeLessThanOrEqualTo(String value) {
            addCriterion("TABLE_CODE <=", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeLike(String value) {
            addCriterion("TABLE_CODE like", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeNotLike(String value) {
            addCriterion("TABLE_CODE not like", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeIn(List<String> values) {
            addCriterion("TABLE_CODE in", values, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeNotIn(List<String> values) {
            addCriterion("TABLE_CODE not in", values, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeBetween(String value1, String value2) {
            addCriterion("TABLE_CODE between", value1, value2, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeNotBetween(String value1, String value2) {
            addCriterion("TABLE_CODE not between", value1, value2, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andEntityCodeIsNull() {
            addCriterion("ENTITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEntityCodeIsNotNull() {
            addCriterion("ENTITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityCodeEqualTo(String value) {
            addCriterion("ENTITY_CODE =", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotEqualTo(String value) {
            addCriterion("ENTITY_CODE <>", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeGreaterThan(String value) {
            addCriterion("ENTITY_CODE >", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_CODE >=", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLessThan(String value) {
            addCriterion("ENTITY_CODE <", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_CODE <=", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeLike(String value) {
            addCriterion("ENTITY_CODE like", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotLike(String value) {
            addCriterion("ENTITY_CODE not like", value, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeIn(List<String> values) {
            addCriterion("ENTITY_CODE in", values, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotIn(List<String> values) {
            addCriterion("ENTITY_CODE not in", values, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeBetween(String value1, String value2) {
            addCriterion("ENTITY_CODE between", value1, value2, "entityCode");
            return (Criteria) this;
        }

        public Criteria andEntityCodeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_CODE not between", value1, value2, "entityCode");
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

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("DATA_TYPE like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("DATA_TYPE not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
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