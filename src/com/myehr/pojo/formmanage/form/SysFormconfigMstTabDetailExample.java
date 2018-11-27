package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormconfigMstTabDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormconfigMstTabDetailExample() {
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

        public Criteria andTabDetailIdIsNull() {
            addCriterion("TAB_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdIsNotNull() {
            addCriterion("TAB_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_ID =", value, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdNotEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_ID <>", value, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdGreaterThan(BigDecimal value) {
            addCriterion("TAB_DETAIL_ID >", value, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_ID >=", value, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdLessThan(BigDecimal value) {
            addCriterion("TAB_DETAIL_ID <", value, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_ID <=", value, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdIn(List<BigDecimal> values) {
            addCriterion("TAB_DETAIL_ID in", values, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdNotIn(List<BigDecimal> values) {
            addCriterion("TAB_DETAIL_ID not in", values, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAB_DETAIL_ID between", value1, value2, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAB_DETAIL_ID not between", value1, value2, "tabDetailId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdIsNull() {
            addCriterion("MST_TAB_ID is null");
            return (Criteria) this;
        }

        public Criteria andMstTabIdIsNotNull() {
            addCriterion("MST_TAB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMstTabIdEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_ID =", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdNotEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_ID <>", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdGreaterThan(BigDecimal value) {
            addCriterion("MST_TAB_ID >", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_ID >=", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdLessThan(BigDecimal value) {
            addCriterion("MST_TAB_ID <", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MST_TAB_ID <=", value, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdIn(List<BigDecimal> values) {
            addCriterion("MST_TAB_ID in", values, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdNotIn(List<BigDecimal> values) {
            addCriterion("MST_TAB_ID not in", values, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MST_TAB_ID between", value1, value2, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andMstTabIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MST_TAB_ID not between", value1, value2, "mstTabId");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormIsNull() {
            addCriterion("TAB_DETAIL_IS_FORM is null");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormIsNotNull() {
            addCriterion("TAB_DETAIL_IS_FORM is not null");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormEqualTo(String value) {
            addCriterion("TAB_DETAIL_IS_FORM =", value, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormNotEqualTo(String value) {
            addCriterion("TAB_DETAIL_IS_FORM <>", value, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormGreaterThan(String value) {
            addCriterion("TAB_DETAIL_IS_FORM >", value, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormGreaterThanOrEqualTo(String value) {
            addCriterion("TAB_DETAIL_IS_FORM >=", value, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormLessThan(String value) {
            addCriterion("TAB_DETAIL_IS_FORM <", value, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormLessThanOrEqualTo(String value) {
            addCriterion("TAB_DETAIL_IS_FORM <=", value, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormLike(String value) {
            addCriterion("TAB_DETAIL_IS_FORM like", value, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormNotLike(String value) {
            addCriterion("TAB_DETAIL_IS_FORM not like", value, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormIn(List<String> values) {
            addCriterion("TAB_DETAIL_IS_FORM in", values, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormNotIn(List<String> values) {
            addCriterion("TAB_DETAIL_IS_FORM not in", values, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormBetween(String value1, String value2) {
            addCriterion("TAB_DETAIL_IS_FORM between", value1, value2, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailIsFormNotBetween(String value1, String value2) {
            addCriterion("TAB_DETAIL_IS_FORM not between", value1, value2, "tabDetailIsForm");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlIsNull() {
            addCriterion("TAB_DETAIL_FORM_URL is null");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlIsNotNull() {
            addCriterion("TAB_DETAIL_FORM_URL is not null");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlEqualTo(String value) {
            addCriterion("TAB_DETAIL_FORM_URL =", value, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlNotEqualTo(String value) {
            addCriterion("TAB_DETAIL_FORM_URL <>", value, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlGreaterThan(String value) {
            addCriterion("TAB_DETAIL_FORM_URL >", value, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlGreaterThanOrEqualTo(String value) {
            addCriterion("TAB_DETAIL_FORM_URL >=", value, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlLessThan(String value) {
            addCriterion("TAB_DETAIL_FORM_URL <", value, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlLessThanOrEqualTo(String value) {
            addCriterion("TAB_DETAIL_FORM_URL <=", value, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlLike(String value) {
            addCriterion("TAB_DETAIL_FORM_URL like", value, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlNotLike(String value) {
            addCriterion("TAB_DETAIL_FORM_URL not like", value, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlIn(List<String> values) {
            addCriterion("TAB_DETAIL_FORM_URL in", values, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlNotIn(List<String> values) {
            addCriterion("TAB_DETAIL_FORM_URL not in", values, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlBetween(String value1, String value2) {
            addCriterion("TAB_DETAIL_FORM_URL between", value1, value2, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormUrlNotBetween(String value1, String value2) {
            addCriterion("TAB_DETAIL_FORM_URL not between", value1, value2, "tabDetailFormUrl");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdIsNull() {
            addCriterion("TAB_DETAIL_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdIsNotNull() {
            addCriterion("TAB_DETAIL_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_FORM_ID =", value, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdNotEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_FORM_ID <>", value, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdGreaterThan(BigDecimal value) {
            addCriterion("TAB_DETAIL_FORM_ID >", value, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_FORM_ID >=", value, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdLessThan(BigDecimal value) {
            addCriterion("TAB_DETAIL_FORM_ID <", value, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_FORM_ID <=", value, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdIn(List<BigDecimal> values) {
            addCriterion("TAB_DETAIL_FORM_ID in", values, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdNotIn(List<BigDecimal> values) {
            addCriterion("TAB_DETAIL_FORM_ID not in", values, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAB_DETAIL_FORM_ID between", value1, value2, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAB_DETAIL_FORM_ID not between", value1, value2, "tabDetailFormId");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleIsNull() {
            addCriterion("tab_detail_form_title is null");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleIsNotNull() {
            addCriterion("tab_detail_form_title is not null");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleEqualTo(String value) {
            addCriterion("tab_detail_form_title =", value, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleNotEqualTo(String value) {
            addCriterion("tab_detail_form_title <>", value, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleGreaterThan(String value) {
            addCriterion("tab_detail_form_title >", value, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tab_detail_form_title >=", value, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleLessThan(String value) {
            addCriterion("tab_detail_form_title <", value, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleLessThanOrEqualTo(String value) {
            addCriterion("tab_detail_form_title <=", value, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleLike(String value) {
            addCriterion("tab_detail_form_title like", value, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleNotLike(String value) {
            addCriterion("tab_detail_form_title not like", value, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleIn(List<String> values) {
            addCriterion("tab_detail_form_title in", values, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleNotIn(List<String> values) {
            addCriterion("tab_detail_form_title not in", values, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleBetween(String value1, String value2) {
            addCriterion("tab_detail_form_title between", value1, value2, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailFormTitleNotBetween(String value1, String value2) {
            addCriterion("tab_detail_form_title not between", value1, value2, "tabDetailFormTitle");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortIsNull() {
            addCriterion("TAB_DETAIL_SORT is null");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortIsNotNull() {
            addCriterion("TAB_DETAIL_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_SORT =", value, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortNotEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_SORT <>", value, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortGreaterThan(BigDecimal value) {
            addCriterion("TAB_DETAIL_SORT >", value, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_SORT >=", value, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortLessThan(BigDecimal value) {
            addCriterion("TAB_DETAIL_SORT <", value, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAB_DETAIL_SORT <=", value, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortIn(List<BigDecimal> values) {
            addCriterion("TAB_DETAIL_SORT in", values, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortNotIn(List<BigDecimal> values) {
            addCriterion("TAB_DETAIL_SORT not in", values, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAB_DETAIL_SORT between", value1, value2, "tabDetailSort");
            return (Criteria) this;
        }

        public Criteria andTabDetailSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAB_DETAIL_SORT not between", value1, value2, "tabDetailSort");
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

        public Criteria andTabDetailConfigIsNull() {
            addCriterion("TAB_DETAIL_CONFIG is null");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigIsNotNull() {
            addCriterion("TAB_DETAIL_CONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigEqualTo(String value) {
            addCriterion("TAB_DETAIL_CONFIG =", value, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigNotEqualTo(String value) {
            addCriterion("TAB_DETAIL_CONFIG <>", value, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigGreaterThan(String value) {
            addCriterion("TAB_DETAIL_CONFIG >", value, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigGreaterThanOrEqualTo(String value) {
            addCriterion("TAB_DETAIL_CONFIG >=", value, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigLessThan(String value) {
            addCriterion("TAB_DETAIL_CONFIG <", value, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigLessThanOrEqualTo(String value) {
            addCriterion("TAB_DETAIL_CONFIG <=", value, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigLike(String value) {
            addCriterion("TAB_DETAIL_CONFIG like", value, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigNotLike(String value) {
            addCriterion("TAB_DETAIL_CONFIG not like", value, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigIn(List<String> values) {
            addCriterion("TAB_DETAIL_CONFIG in", values, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigNotIn(List<String> values) {
            addCriterion("TAB_DETAIL_CONFIG not in", values, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigBetween(String value1, String value2) {
            addCriterion("TAB_DETAIL_CONFIG between", value1, value2, "tabDetailConfig");
            return (Criteria) this;
        }

        public Criteria andTabDetailConfigNotBetween(String value1, String value2) {
            addCriterion("TAB_DETAIL_CONFIG not between", value1, value2, "tabDetailConfig");
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