package com.myehr.pojo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysEntityExample() {
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

        public Criteria andEntityIdIsNull() {
            addCriterion("ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(Integer value) {
            addCriterion("ENTITY_ID =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(Integer value) {
            addCriterion("ENTITY_ID <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(Integer value) {
            addCriterion("ENTITY_ID >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTITY_ID >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(Integer value) {
            addCriterion("ENTITY_ID <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTITY_ID <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<Integer> values) {
            addCriterion("ENTITY_ID in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<Integer> values) {
            addCriterion("ENTITY_ID not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTITY_ID between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTITY_ID not between", value1, value2, "entityId");
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

        public Criteria andEntityTablenameIsNull() {
            addCriterion("ENTITY_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameIsNotNull() {
            addCriterion("ENTITY_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameEqualTo(String value) {
            addCriterion("ENTITY_TABLENAME =", value, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameNotEqualTo(String value) {
            addCriterion("ENTITY_TABLENAME <>", value, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameGreaterThan(String value) {
            addCriterion("ENTITY_TABLENAME >", value, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_TABLENAME >=", value, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameLessThan(String value) {
            addCriterion("ENTITY_TABLENAME <", value, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_TABLENAME <=", value, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameLike(String value) {
            addCriterion("ENTITY_TABLENAME like", value, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameNotLike(String value) {
            addCriterion("ENTITY_TABLENAME not like", value, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameIn(List<String> values) {
            addCriterion("ENTITY_TABLENAME in", values, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameNotIn(List<String> values) {
            addCriterion("ENTITY_TABLENAME not in", values, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameBetween(String value1, String value2) {
            addCriterion("ENTITY_TABLENAME between", value1, value2, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTablenameNotBetween(String value1, String value2) {
            addCriterion("ENTITY_TABLENAME not between", value1, value2, "entityTablename");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("ENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("ENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(String value) {
            addCriterion("ENTITY_TYPE =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(String value) {
            addCriterion("ENTITY_TYPE <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(String value) {
            addCriterion("ENTITY_TYPE >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_TYPE >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(String value) {
            addCriterion("ENTITY_TYPE <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_TYPE <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLike(String value) {
            addCriterion("ENTITY_TYPE like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotLike(String value) {
            addCriterion("ENTITY_TYPE not like", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<String> values) {
            addCriterion("ENTITY_TYPE in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<String> values) {
            addCriterion("ENTITY_TYPE not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(String value1, String value2) {
            addCriterion("ENTITY_TYPE between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(String value1, String value2) {
            addCriterion("ENTITY_TYPE not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameIsNull() {
            addCriterion("ENTITY_CHINANAME is null");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameIsNotNull() {
            addCriterion("ENTITY_CHINANAME is not null");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameEqualTo(String value) {
            addCriterion("ENTITY_CHINANAME =", value, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameNotEqualTo(String value) {
            addCriterion("ENTITY_CHINANAME <>", value, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameGreaterThan(String value) {
            addCriterion("ENTITY_CHINANAME >", value, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_CHINANAME >=", value, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameLessThan(String value) {
            addCriterion("ENTITY_CHINANAME <", value, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_CHINANAME <=", value, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameLike(String value) {
            addCriterion("ENTITY_CHINANAME like", value, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameNotLike(String value) {
            addCriterion("ENTITY_CHINANAME not like", value, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameIn(List<String> values) {
            addCriterion("ENTITY_CHINANAME in", values, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameNotIn(List<String> values) {
            addCriterion("ENTITY_CHINANAME not in", values, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameBetween(String value1, String value2) {
            addCriterion("ENTITY_CHINANAME between", value1, value2, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntityChinanameNotBetween(String value1, String value2) {
            addCriterion("ENTITY_CHINANAME not between", value1, value2, "entityChinaname");
            return (Criteria) this;
        }

        public Criteria andEntitySortIsNull() {
            addCriterion("ENTITY_SORT is null");
            return (Criteria) this;
        }

        public Criteria andEntitySortIsNotNull() {
            addCriterion("ENTITY_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andEntitySortEqualTo(Integer value) {
            addCriterion("ENTITY_SORT =", value, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortNotEqualTo(Integer value) {
            addCriterion("ENTITY_SORT <>", value, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortGreaterThan(Integer value) {
            addCriterion("ENTITY_SORT >", value, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTITY_SORT >=", value, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortLessThan(Integer value) {
            addCriterion("ENTITY_SORT <", value, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortLessThanOrEqualTo(Integer value) {
            addCriterion("ENTITY_SORT <=", value, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortIn(List<Integer> values) {
            addCriterion("ENTITY_SORT in", values, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortNotIn(List<Integer> values) {
            addCriterion("ENTITY_SORT not in", values, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortBetween(Integer value1, Integer value2) {
            addCriterion("ENTITY_SORT between", value1, value2, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntitySortNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTITY_SORT not between", value1, value2, "entitySort");
            return (Criteria) this;
        }

        public Criteria andEntityDesIsNull() {
            addCriterion("ENTITY_DES is null");
            return (Criteria) this;
        }

        public Criteria andEntityDesIsNotNull() {
            addCriterion("ENTITY_DES is not null");
            return (Criteria) this;
        }

        public Criteria andEntityDesEqualTo(String value) {
            addCriterion("ENTITY_DES =", value, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesNotEqualTo(String value) {
            addCriterion("ENTITY_DES <>", value, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesGreaterThan(String value) {
            addCriterion("ENTITY_DES >", value, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_DES >=", value, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesLessThan(String value) {
            addCriterion("ENTITY_DES <", value, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_DES <=", value, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesLike(String value) {
            addCriterion("ENTITY_DES like", value, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesNotLike(String value) {
            addCriterion("ENTITY_DES not like", value, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesIn(List<String> values) {
            addCriterion("ENTITY_DES in", values, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesNotIn(List<String> values) {
            addCriterion("ENTITY_DES not in", values, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesBetween(String value1, String value2) {
            addCriterion("ENTITY_DES between", value1, value2, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityDesNotBetween(String value1, String value2) {
            addCriterion("ENTITY_DES not between", value1, value2, "entityDes");
            return (Criteria) this;
        }

        public Criteria andEntityStateIsNull() {
            addCriterion("ENTITY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andEntityStateIsNotNull() {
            addCriterion("ENTITY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andEntityStateEqualTo(String value) {
            addCriterion("ENTITY_STATE =", value, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateNotEqualTo(String value) {
            addCriterion("ENTITY_STATE <>", value, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateGreaterThan(String value) {
            addCriterion("ENTITY_STATE >", value, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_STATE >=", value, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateLessThan(String value) {
            addCriterion("ENTITY_STATE <", value, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_STATE <=", value, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateLike(String value) {
            addCriterion("ENTITY_STATE like", value, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateNotLike(String value) {
            addCriterion("ENTITY_STATE not like", value, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateIn(List<String> values) {
            addCriterion("ENTITY_STATE in", values, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateNotIn(List<String> values) {
            addCriterion("ENTITY_STATE not in", values, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateBetween(String value1, String value2) {
            addCriterion("ENTITY_STATE between", value1, value2, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityStateNotBetween(String value1, String value2) {
            addCriterion("ENTITY_STATE not between", value1, value2, "entityState");
            return (Criteria) this;
        }

        public Criteria andEntityMarkIsNull() {
            addCriterion("ENTITY_MARK is null");
            return (Criteria) this;
        }

        public Criteria andEntityMarkIsNotNull() {
            addCriterion("ENTITY_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andEntityMarkEqualTo(String value) {
            addCriterion("ENTITY_MARK =", value, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkNotEqualTo(String value) {
            addCriterion("ENTITY_MARK <>", value, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkGreaterThan(String value) {
            addCriterion("ENTITY_MARK >", value, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkGreaterThanOrEqualTo(String value) {
            addCriterion("ENTITY_MARK >=", value, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkLessThan(String value) {
            addCriterion("ENTITY_MARK <", value, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkLessThanOrEqualTo(String value) {
            addCriterion("ENTITY_MARK <=", value, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkLike(String value) {
            addCriterion("ENTITY_MARK like", value, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkNotLike(String value) {
            addCriterion("ENTITY_MARK not like", value, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkIn(List<String> values) {
            addCriterion("ENTITY_MARK in", values, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkNotIn(List<String> values) {
            addCriterion("ENTITY_MARK not in", values, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkBetween(String value1, String value2) {
            addCriterion("ENTITY_MARK between", value1, value2, "entityMark");
            return (Criteria) this;
        }

        public Criteria andEntityMarkNotBetween(String value1, String value2) {
            addCriterion("ENTITY_MARK not between", value1, value2, "entityMark");
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