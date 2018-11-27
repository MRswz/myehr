package com.myehr.pojo.dict;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDictEntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDictEntryExample() {
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

        public Criteria andDictEntryIdIsNull() {
            addCriterion("DICT_ENTRY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdIsNotNull() {
            addCriterion("DICT_ENTRY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdEqualTo(Integer value) {
            addCriterion("DICT_ENTRY_ID =", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdNotEqualTo(Integer value) {
            addCriterion("DICT_ENTRY_ID <>", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdGreaterThan(Integer value) {
            addCriterion("DICT_ENTRY_ID >", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICT_ENTRY_ID >=", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdLessThan(Integer value) {
            addCriterion("DICT_ENTRY_ID <", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdLessThanOrEqualTo(Integer value) {
            addCriterion("DICT_ENTRY_ID <=", value, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdIn(List<Integer> values) {
            addCriterion("DICT_ENTRY_ID in", values, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdNotIn(List<Integer> values) {
            addCriterion("DICT_ENTRY_ID not in", values, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdBetween(Integer value1, Integer value2) {
            addCriterion("DICT_ENTRY_ID between", value1, value2, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DICT_ENTRY_ID not between", value1, value2, "dictEntryId");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeIsNull() {
            addCriterion("DICT_ENTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeIsNotNull() {
            addCriterion("DICT_ENTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeEqualTo(String value) {
            addCriterion("DICT_ENTRY_CODE =", value, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeNotEqualTo(String value) {
            addCriterion("DICT_ENTRY_CODE <>", value, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeGreaterThan(String value) {
            addCriterion("DICT_ENTRY_CODE >", value, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_ENTRY_CODE >=", value, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeLessThan(String value) {
            addCriterion("DICT_ENTRY_CODE <", value, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeLessThanOrEqualTo(String value) {
            addCriterion("DICT_ENTRY_CODE <=", value, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeLike(String value) {
            addCriterion("DICT_ENTRY_CODE like", value, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeNotLike(String value) {
            addCriterion("DICT_ENTRY_CODE not like", value, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeIn(List<String> values) {
            addCriterion("DICT_ENTRY_CODE in", values, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeNotIn(List<String> values) {
            addCriterion("DICT_ENTRY_CODE not in", values, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeBetween(String value1, String value2) {
            addCriterion("DICT_ENTRY_CODE between", value1, value2, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryCodeNotBetween(String value1, String value2) {
            addCriterion("DICT_ENTRY_CODE not between", value1, value2, "dictEntryCode");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameIsNull() {
            addCriterion("DICT_ENTRY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameIsNotNull() {
            addCriterion("DICT_ENTRY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameEqualTo(String value) {
            addCriterion("DICT_ENTRY_NAME =", value, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameNotEqualTo(String value) {
            addCriterion("DICT_ENTRY_NAME <>", value, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameGreaterThan(String value) {
            addCriterion("DICT_ENTRY_NAME >", value, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_ENTRY_NAME >=", value, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameLessThan(String value) {
            addCriterion("DICT_ENTRY_NAME <", value, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameLessThanOrEqualTo(String value) {
            addCriterion("DICT_ENTRY_NAME <=", value, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameLike(String value) {
            addCriterion("DICT_ENTRY_NAME like", value, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameNotLike(String value) {
            addCriterion("DICT_ENTRY_NAME not like", value, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameIn(List<String> values) {
            addCriterion("DICT_ENTRY_NAME in", values, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameNotIn(List<String> values) {
            addCriterion("DICT_ENTRY_NAME not in", values, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameBetween(String value1, String value2) {
            addCriterion("DICT_ENTRY_NAME between", value1, value2, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictEntryNameNotBetween(String value1, String value2) {
            addCriterion("DICT_ENTRY_NAME not between", value1, value2, "dictEntryName");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNull() {
            addCriterion("DICT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNotNull() {
            addCriterion("DICT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdEqualTo(Integer value) {
            addCriterion("DICT_TYPE_ID =", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotEqualTo(Integer value) {
            addCriterion("DICT_TYPE_ID <>", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThan(Integer value) {
            addCriterion("DICT_TYPE_ID >", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICT_TYPE_ID >=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThan(Integer value) {
            addCriterion("DICT_TYPE_ID <", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("DICT_TYPE_ID <=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIn(List<Integer> values) {
            addCriterion("DICT_TYPE_ID in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotIn(List<Integer> values) {
            addCriterion("DICT_TYPE_ID not in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("DICT_TYPE_ID between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DICT_TYPE_ID not between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkIsNull() {
            addCriterion("DICT_ENTRY_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkIsNotNull() {
            addCriterion("DICT_ENTRY_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkEqualTo(String value) {
            addCriterion("DICT_ENTRY_REMARK =", value, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkNotEqualTo(String value) {
            addCriterion("DICT_ENTRY_REMARK <>", value, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkGreaterThan(String value) {
            addCriterion("DICT_ENTRY_REMARK >", value, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_ENTRY_REMARK >=", value, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkLessThan(String value) {
            addCriterion("DICT_ENTRY_REMARK <", value, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkLessThanOrEqualTo(String value) {
            addCriterion("DICT_ENTRY_REMARK <=", value, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkLike(String value) {
            addCriterion("DICT_ENTRY_REMARK like", value, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkNotLike(String value) {
            addCriterion("DICT_ENTRY_REMARK not like", value, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkIn(List<String> values) {
            addCriterion("DICT_ENTRY_REMARK in", values, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkNotIn(List<String> values) {
            addCriterion("DICT_ENTRY_REMARK not in", values, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkBetween(String value1, String value2) {
            addCriterion("DICT_ENTRY_REMARK between", value1, value2, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictEntryRemarkNotBetween(String value1, String value2) {
            addCriterion("DICT_ENTRY_REMARK not between", value1, value2, "dictEntryRemark");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeIsNull() {
            addCriterion("DICT_PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeIsNotNull() {
            addCriterion("DICT_PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeEqualTo(String value) {
            addCriterion("DICT_PARENT_CODE =", value, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeNotEqualTo(String value) {
            addCriterion("DICT_PARENT_CODE <>", value, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeGreaterThan(String value) {
            addCriterion("DICT_PARENT_CODE >", value, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_PARENT_CODE >=", value, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeLessThan(String value) {
            addCriterion("DICT_PARENT_CODE <", value, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeLessThanOrEqualTo(String value) {
            addCriterion("DICT_PARENT_CODE <=", value, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeLike(String value) {
            addCriterion("DICT_PARENT_CODE like", value, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeNotLike(String value) {
            addCriterion("DICT_PARENT_CODE not like", value, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeIn(List<String> values) {
            addCriterion("DICT_PARENT_CODE in", values, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeNotIn(List<String> values) {
            addCriterion("DICT_PARENT_CODE not in", values, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeBetween(String value1, String value2) {
            addCriterion("DICT_PARENT_CODE between", value1, value2, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictParentCodeNotBetween(String value1, String value2) {
            addCriterion("DICT_PARENT_CODE not between", value1, value2, "dictParentCode");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortIsNull() {
            addCriterion("DICT_ENTRY_SORT is null");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortIsNotNull() {
            addCriterion("DICT_ENTRY_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortEqualTo(Float value) {
            addCriterion("DICT_ENTRY_SORT =", value, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortNotEqualTo(Float value) {
            addCriterion("DICT_ENTRY_SORT <>", value, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortGreaterThan(Float value) {
            addCriterion("DICT_ENTRY_SORT >", value, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortGreaterThanOrEqualTo(Float value) {
            addCriterion("DICT_ENTRY_SORT >=", value, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortLessThan(Float value) {
            addCriterion("DICT_ENTRY_SORT <", value, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortLessThanOrEqualTo(Float value) {
            addCriterion("DICT_ENTRY_SORT <=", value, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortIn(List<Float> values) {
            addCriterion("DICT_ENTRY_SORT in", values, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortNotIn(List<Float> values) {
            addCriterion("DICT_ENTRY_SORT not in", values, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortBetween(Float value1, Float value2) {
            addCriterion("DICT_ENTRY_SORT between", value1, value2, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySortNotBetween(Float value1, Float value2) {
            addCriterion("DICT_ENTRY_SORT not between", value1, value2, "dictEntrySort");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqIsNull() {
            addCriterion("DICT_ENTRY_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqIsNotNull() {
            addCriterion("DICT_ENTRY_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqEqualTo(String value) {
            addCriterion("DICT_ENTRY_SEQ =", value, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqNotEqualTo(String value) {
            addCriterion("DICT_ENTRY_SEQ <>", value, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqGreaterThan(String value) {
            addCriterion("DICT_ENTRY_SEQ >", value, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqGreaterThanOrEqualTo(String value) {
            addCriterion("DICT_ENTRY_SEQ >=", value, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqLessThan(String value) {
            addCriterion("DICT_ENTRY_SEQ <", value, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqLessThanOrEqualTo(String value) {
            addCriterion("DICT_ENTRY_SEQ <=", value, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqLike(String value) {
            addCriterion("DICT_ENTRY_SEQ like", value, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqNotLike(String value) {
            addCriterion("DICT_ENTRY_SEQ not like", value, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqIn(List<String> values) {
            addCriterion("DICT_ENTRY_SEQ in", values, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqNotIn(List<String> values) {
            addCriterion("DICT_ENTRY_SEQ not in", values, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqBetween(String value1, String value2) {
            addCriterion("DICT_ENTRY_SEQ between", value1, value2, "dictEntrySeq");
            return (Criteria) this;
        }

        public Criteria andDictEntrySeqNotBetween(String value1, String value2) {
            addCriterion("DICT_ENTRY_SEQ not between", value1, value2, "dictEntrySeq");
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