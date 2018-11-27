package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormButtonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonExample() {
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

        public Criteria andFormButtonIdIsNull() {
            addCriterion("FORM_BUTTON_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdIsNotNull() {
            addCriterion("FORM_BUTTON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID =", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID <>", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID >", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID >=", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdLessThan(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID <", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_ID <=", value, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdIn(List<BigDecimal> values) {
            addCriterion("FORM_BUTTON_ID in", values, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_BUTTON_ID not in", values, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_BUTTON_ID between", value1, value2, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_BUTTON_ID not between", value1, value2, "formButtonId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdIsNull() {
            addCriterion("FORM_BUTTON_FORM_DEF_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdIsNotNull() {
            addCriterion("FORM_BUTTON_FORM_DEF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID =", value, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID <>", value, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID >", value, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID >=", value, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdLessThan(BigDecimal value) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID <", value, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID <=", value, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdIn(List<BigDecimal> values) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID in", values, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID not in", values, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID between", value1, value2, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormDefIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_BUTTON_FORM_DEF_ID not between", value1, value2, "formButtonFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeIsNull() {
            addCriterion("FORM_BUTTON_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeIsNotNull() {
            addCriterion("FORM_BUTTON_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeEqualTo(String value) {
            addCriterion("FORM_BUTTON_TYPE =", value, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_TYPE <>", value, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeGreaterThan(String value) {
            addCriterion("FORM_BUTTON_TYPE >", value, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_TYPE >=", value, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeLessThan(String value) {
            addCriterion("FORM_BUTTON_TYPE <", value, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_TYPE <=", value, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeLike(String value) {
            addCriterion("FORM_BUTTON_TYPE like", value, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeNotLike(String value) {
            addCriterion("FORM_BUTTON_TYPE not like", value, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeIn(List<String> values) {
            addCriterion("FORM_BUTTON_TYPE in", values, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_TYPE not in", values, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_TYPE between", value1, value2, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonTypeNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_TYPE not between", value1, value2, "formButtonType");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeIsNull() {
            addCriterion("FORM_BUTTON_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeIsNotNull() {
            addCriterion("FORM_BUTTON_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeEqualTo(String value) {
            addCriterion("FORM_BUTTON_CODE =", value, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_CODE <>", value, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeGreaterThan(String value) {
            addCriterion("FORM_BUTTON_CODE >", value, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_CODE >=", value, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeLessThan(String value) {
            addCriterion("FORM_BUTTON_CODE <", value, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_CODE <=", value, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeLike(String value) {
            addCriterion("FORM_BUTTON_CODE like", value, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeNotLike(String value) {
            addCriterion("FORM_BUTTON_CODE not like", value, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeIn(List<String> values) {
            addCriterion("FORM_BUTTON_CODE in", values, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_CODE not in", values, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_CODE between", value1, value2, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonCodeNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_CODE not between", value1, value2, "formButtonCode");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameIsNull() {
            addCriterion("FORM_BUTTON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameIsNotNull() {
            addCriterion("FORM_BUTTON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameEqualTo(String value) {
            addCriterion("FORM_BUTTON_NAME =", value, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_NAME <>", value, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameGreaterThan(String value) {
            addCriterion("FORM_BUTTON_NAME >", value, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_NAME >=", value, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameLessThan(String value) {
            addCriterion("FORM_BUTTON_NAME <", value, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_NAME <=", value, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameLike(String value) {
            addCriterion("FORM_BUTTON_NAME like", value, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameNotLike(String value) {
            addCriterion("FORM_BUTTON_NAME not like", value, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameIn(List<String> values) {
            addCriterion("FORM_BUTTON_NAME in", values, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_NAME not in", values, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_NAME between", value1, value2, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonNameNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_NAME not between", value1, value2, "formButtonName");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortIsNull() {
            addCriterion("FORM_BUTTON_SORT is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortIsNotNull() {
            addCriterion("FORM_BUTTON_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_SORT =", value, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortNotEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_SORT <>", value, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortGreaterThan(BigDecimal value) {
            addCriterion("FORM_BUTTON_SORT >", value, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_SORT >=", value, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortLessThan(BigDecimal value) {
            addCriterion("FORM_BUTTON_SORT <", value, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_BUTTON_SORT <=", value, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortIn(List<BigDecimal> values) {
            addCriterion("FORM_BUTTON_SORT in", values, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortNotIn(List<BigDecimal> values) {
            addCriterion("FORM_BUTTON_SORT not in", values, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_BUTTON_SORT between", value1, value2, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_BUTTON_SORT not between", value1, value2, "formButtonSort");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdIsNull() {
            addCriterion("FORM_BUTTON_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdIsNotNull() {
            addCriterion("FORM_BUTTON_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdEqualTo(String value) {
            addCriterion("FORM_BUTTON_FORM_ID =", value, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_FORM_ID <>", value, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdGreaterThan(String value) {
            addCriterion("FORM_BUTTON_FORM_ID >", value, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_FORM_ID >=", value, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdLessThan(String value) {
            addCriterion("FORM_BUTTON_FORM_ID <", value, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_FORM_ID <=", value, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdLike(String value) {
            addCriterion("FORM_BUTTON_FORM_ID like", value, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdNotLike(String value) {
            addCriterion("FORM_BUTTON_FORM_ID not like", value, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdIn(List<String> values) {
            addCriterion("FORM_BUTTON_FORM_ID in", values, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_FORM_ID not in", values, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_FORM_ID between", value1, value2, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonFormIdNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_FORM_ID not between", value1, value2, "formButtonFormId");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthIsNull() {
            addCriterion("FORM_BUTTON_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthIsNotNull() {
            addCriterion("FORM_BUTTON_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthEqualTo(String value) {
            addCriterion("FORM_BUTTON_WIDTH =", value, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_WIDTH <>", value, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthGreaterThan(String value) {
            addCriterion("FORM_BUTTON_WIDTH >", value, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_WIDTH >=", value, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthLessThan(String value) {
            addCriterion("FORM_BUTTON_WIDTH <", value, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_WIDTH <=", value, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthLike(String value) {
            addCriterion("FORM_BUTTON_WIDTH like", value, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthNotLike(String value) {
            addCriterion("FORM_BUTTON_WIDTH not like", value, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthIn(List<String> values) {
            addCriterion("FORM_BUTTON_WIDTH in", values, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_WIDTH not in", values, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_WIDTH between", value1, value2, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonWidthNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_WIDTH not between", value1, value2, "formButtonWidth");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightIsNull() {
            addCriterion("FORM_BUTTON_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightIsNotNull() {
            addCriterion("FORM_BUTTON_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightEqualTo(String value) {
            addCriterion("FORM_BUTTON_HEIGHT =", value, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_HEIGHT <>", value, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightGreaterThan(String value) {
            addCriterion("FORM_BUTTON_HEIGHT >", value, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_HEIGHT >=", value, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightLessThan(String value) {
            addCriterion("FORM_BUTTON_HEIGHT <", value, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_HEIGHT <=", value, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightLike(String value) {
            addCriterion("FORM_BUTTON_HEIGHT like", value, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightNotLike(String value) {
            addCriterion("FORM_BUTTON_HEIGHT not like", value, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightIn(List<String> values) {
            addCriterion("FORM_BUTTON_HEIGHT in", values, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_HEIGHT not in", values, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_HEIGHT between", value1, value2, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonHeightNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_HEIGHT not between", value1, value2, "formButtonHeight");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconIsNull() {
            addCriterion("FORM_BUTTON_ICON is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconIsNotNull() {
            addCriterion("FORM_BUTTON_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconEqualTo(String value) {
            addCriterion("FORM_BUTTON_ICON =", value, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_ICON <>", value, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconGreaterThan(String value) {
            addCriterion("FORM_BUTTON_ICON >", value, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_ICON >=", value, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconLessThan(String value) {
            addCriterion("FORM_BUTTON_ICON <", value, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_ICON <=", value, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconLike(String value) {
            addCriterion("FORM_BUTTON_ICON like", value, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconNotLike(String value) {
            addCriterion("FORM_BUTTON_ICON not like", value, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconIn(List<String> values) {
            addCriterion("FORM_BUTTON_ICON in", values, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_ICON not in", values, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_ICON between", value1, value2, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonIconNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_ICON not between", value1, value2, "formButtonIcon");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssIsNull() {
            addCriterion("FORM_BUTTON_CSS is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssIsNotNull() {
            addCriterion("FORM_BUTTON_CSS is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssEqualTo(String value) {
            addCriterion("FORM_BUTTON_CSS =", value, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_CSS <>", value, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssGreaterThan(String value) {
            addCriterion("FORM_BUTTON_CSS >", value, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_CSS >=", value, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssLessThan(String value) {
            addCriterion("FORM_BUTTON_CSS <", value, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_CSS <=", value, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssLike(String value) {
            addCriterion("FORM_BUTTON_CSS like", value, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssNotLike(String value) {
            addCriterion("FORM_BUTTON_CSS not like", value, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssIn(List<String> values) {
            addCriterion("FORM_BUTTON_CSS in", values, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_CSS not in", values, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_CSS between", value1, value2, "formButtonCss");
            return (Criteria) this;
        }

        public Criteria andFormButtonCssNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_CSS not between", value1, value2, "formButtonCss");
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

        public Criteria andFormButtonWarningInfoIsNull() {
            addCriterion("FORM_BUTTON_WARNING_INFO is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoIsNotNull() {
            addCriterion("FORM_BUTTON_WARNING_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoEqualTo(String value) {
            addCriterion("FORM_BUTTON_WARNING_INFO =", value, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_WARNING_INFO <>", value, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoGreaterThan(String value) {
            addCriterion("FORM_BUTTON_WARNING_INFO >", value, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_WARNING_INFO >=", value, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoLessThan(String value) {
            addCriterion("FORM_BUTTON_WARNING_INFO <", value, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_WARNING_INFO <=", value, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoLike(String value) {
            addCriterion("FORM_BUTTON_WARNING_INFO like", value, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoNotLike(String value) {
            addCriterion("FORM_BUTTON_WARNING_INFO not like", value, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoIn(List<String> values) {
            addCriterion("FORM_BUTTON_WARNING_INFO in", values, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_WARNING_INFO not in", values, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_WARNING_INFO between", value1, value2, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonWarningInfoNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_WARNING_INFO not between", value1, value2, "formButtonWarningInfo");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunIsNull() {
            addCriterion("FORM_BUTTON_CHECK_FUN is null");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunIsNotNull() {
            addCriterion("FORM_BUTTON_CHECK_FUN is not null");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunEqualTo(String value) {
            addCriterion("FORM_BUTTON_CHECK_FUN =", value, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunNotEqualTo(String value) {
            addCriterion("FORM_BUTTON_CHECK_FUN <>", value, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunGreaterThan(String value) {
            addCriterion("FORM_BUTTON_CHECK_FUN >", value, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_CHECK_FUN >=", value, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunLessThan(String value) {
            addCriterion("FORM_BUTTON_CHECK_FUN <", value, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunLessThanOrEqualTo(String value) {
            addCriterion("FORM_BUTTON_CHECK_FUN <=", value, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunLike(String value) {
            addCriterion("FORM_BUTTON_CHECK_FUN like", value, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunNotLike(String value) {
            addCriterion("FORM_BUTTON_CHECK_FUN not like", value, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunIn(List<String> values) {
            addCriterion("FORM_BUTTON_CHECK_FUN in", values, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunNotIn(List<String> values) {
            addCriterion("FORM_BUTTON_CHECK_FUN not in", values, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_CHECK_FUN between", value1, value2, "formButtonCheckFun");
            return (Criteria) this;
        }

        public Criteria andFormButtonCheckFunNotBetween(String value1, String value2) {
            addCriterion("FORM_BUTTON_CHECK_FUN not between", value1, value2, "formButtonCheckFun");
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

        public Criteria andShowAreaIsNull() {
            addCriterion("SHOW_AREA is null");
            return (Criteria) this;
        }

        public Criteria andShowAreaIsNotNull() {
            addCriterion("SHOW_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andShowAreaEqualTo(String value) {
            addCriterion("SHOW_AREA =", value, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaNotEqualTo(String value) {
            addCriterion("SHOW_AREA <>", value, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaGreaterThan(String value) {
            addCriterion("SHOW_AREA >", value, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_AREA >=", value, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaLessThan(String value) {
            addCriterion("SHOW_AREA <", value, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaLessThanOrEqualTo(String value) {
            addCriterion("SHOW_AREA <=", value, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaLike(String value) {
            addCriterion("SHOW_AREA like", value, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaNotLike(String value) {
            addCriterion("SHOW_AREA not like", value, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaIn(List<String> values) {
            addCriterion("SHOW_AREA in", values, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaNotIn(List<String> values) {
            addCriterion("SHOW_AREA not in", values, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaBetween(String value1, String value2) {
            addCriterion("SHOW_AREA between", value1, value2, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowAreaNotBetween(String value1, String value2) {
            addCriterion("SHOW_AREA not between", value1, value2, "showArea");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNull() {
            addCriterion("SHOW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNotNull() {
            addCriterion("SHOW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShowTypeEqualTo(String value) {
            addCriterion("SHOW_TYPE =", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotEqualTo(String value) {
            addCriterion("SHOW_TYPE <>", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThan(String value) {
            addCriterion("SHOW_TYPE >", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_TYPE >=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThan(String value) {
            addCriterion("SHOW_TYPE <", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanOrEqualTo(String value) {
            addCriterion("SHOW_TYPE <=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLike(String value) {
            addCriterion("SHOW_TYPE like", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotLike(String value) {
            addCriterion("SHOW_TYPE not like", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeIn(List<String> values) {
            addCriterion("SHOW_TYPE in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotIn(List<String> values) {
            addCriterion("SHOW_TYPE not in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeBetween(String value1, String value2) {
            addCriterion("SHOW_TYPE between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotBetween(String value1, String value2) {
            addCriterion("SHOW_TYPE not between", value1, value2, "showType");
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