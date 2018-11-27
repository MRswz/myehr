package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormGroupExample() {
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

        public Criteria andFormGroupIdIsNull() {
            addCriterion("FORM_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdIsNotNull() {
            addCriterion("FORM_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_ID =", value, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_ID <>", value, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_GROUP_ID >", value, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_ID >=", value, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdLessThan(BigDecimal value) {
            addCriterion("FORM_GROUP_ID <", value, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_ID <=", value, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdIn(List<BigDecimal> values) {
            addCriterion("FORM_GROUP_ID in", values, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_GROUP_ID not in", values, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_GROUP_ID between", value1, value2, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andFormGroupIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_GROUP_ID not between", value1, value2, "formGroupId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdIsNull() {
            addCriterion("GROUP_FORM_DEF_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdIsNotNull() {
            addCriterion("GROUP_FORM_DEF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdEqualTo(BigDecimal value) {
            addCriterion("GROUP_FORM_DEF_ID =", value, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdNotEqualTo(BigDecimal value) {
            addCriterion("GROUP_FORM_DEF_ID <>", value, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdGreaterThan(BigDecimal value) {
            addCriterion("GROUP_FORM_DEF_ID >", value, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GROUP_FORM_DEF_ID >=", value, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdLessThan(BigDecimal value) {
            addCriterion("GROUP_FORM_DEF_ID <", value, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GROUP_FORM_DEF_ID <=", value, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdIn(List<BigDecimal> values) {
            addCriterion("GROUP_FORM_DEF_ID in", values, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdNotIn(List<BigDecimal> values) {
            addCriterion("GROUP_FORM_DEF_ID not in", values, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROUP_FORM_DEF_ID between", value1, value2, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andGroupFormDefIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROUP_FORM_DEF_ID not between", value1, value2, "groupFormDefId");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthIsNull() {
            addCriterion("FORM_GROUP_LABLE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthIsNotNull() {
            addCriterion("FORM_GROUP_LABLE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthEqualTo(String value) {
            addCriterion("FORM_GROUP_LABLE_WIDTH =", value, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthNotEqualTo(String value) {
            addCriterion("FORM_GROUP_LABLE_WIDTH <>", value, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthGreaterThan(String value) {
            addCriterion("FORM_GROUP_LABLE_WIDTH >", value, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_GROUP_LABLE_WIDTH >=", value, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthLessThan(String value) {
            addCriterion("FORM_GROUP_LABLE_WIDTH <", value, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthLessThanOrEqualTo(String value) {
            addCriterion("FORM_GROUP_LABLE_WIDTH <=", value, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthLike(String value) {
            addCriterion("FORM_GROUP_LABLE_WIDTH like", value, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthNotLike(String value) {
            addCriterion("FORM_GROUP_LABLE_WIDTH not like", value, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthIn(List<String> values) {
            addCriterion("FORM_GROUP_LABLE_WIDTH in", values, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthNotIn(List<String> values) {
            addCriterion("FORM_GROUP_LABLE_WIDTH not in", values, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthBetween(String value1, String value2) {
            addCriterion("FORM_GROUP_LABLE_WIDTH between", value1, value2, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupLableWidthNotBetween(String value1, String value2) {
            addCriterion("FORM_GROUP_LABLE_WIDTH not between", value1, value2, "formGroupLableWidth");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeIsNull() {
            addCriterion("FORM_GROUP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeIsNotNull() {
            addCriterion("FORM_GROUP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeEqualTo(String value) {
            addCriterion("FORM_GROUP_CODE =", value, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeNotEqualTo(String value) {
            addCriterion("FORM_GROUP_CODE <>", value, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeGreaterThan(String value) {
            addCriterion("FORM_GROUP_CODE >", value, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_GROUP_CODE >=", value, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeLessThan(String value) {
            addCriterion("FORM_GROUP_CODE <", value, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("FORM_GROUP_CODE <=", value, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeLike(String value) {
            addCriterion("FORM_GROUP_CODE like", value, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeNotLike(String value) {
            addCriterion("FORM_GROUP_CODE not like", value, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeIn(List<String> values) {
            addCriterion("FORM_GROUP_CODE in", values, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeNotIn(List<String> values) {
            addCriterion("FORM_GROUP_CODE not in", values, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeBetween(String value1, String value2) {
            addCriterion("FORM_GROUP_CODE between", value1, value2, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupCodeNotBetween(String value1, String value2) {
            addCriterion("FORM_GROUP_CODE not between", value1, value2, "formGroupCode");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameIsNull() {
            addCriterion("FORM_GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameIsNotNull() {
            addCriterion("FORM_GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameEqualTo(String value) {
            addCriterion("FORM_GROUP_NAME =", value, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameNotEqualTo(String value) {
            addCriterion("FORM_GROUP_NAME <>", value, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameGreaterThan(String value) {
            addCriterion("FORM_GROUP_NAME >", value, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_GROUP_NAME >=", value, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameLessThan(String value) {
            addCriterion("FORM_GROUP_NAME <", value, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameLessThanOrEqualTo(String value) {
            addCriterion("FORM_GROUP_NAME <=", value, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameLike(String value) {
            addCriterion("FORM_GROUP_NAME like", value, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameNotLike(String value) {
            addCriterion("FORM_GROUP_NAME not like", value, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameIn(List<String> values) {
            addCriterion("FORM_GROUP_NAME in", values, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameNotIn(List<String> values) {
            addCriterion("FORM_GROUP_NAME not in", values, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameBetween(String value1, String value2) {
            addCriterion("FORM_GROUP_NAME between", value1, value2, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupNameNotBetween(String value1, String value2) {
            addCriterion("FORM_GROUP_NAME not between", value1, value2, "formGroupName");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountIsNull() {
            addCriterion("FORM_GROUP_ROW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountIsNotNull() {
            addCriterion("FORM_GROUP_ROW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_ROW_COUNT =", value, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountNotEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_ROW_COUNT <>", value, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountGreaterThan(BigDecimal value) {
            addCriterion("FORM_GROUP_ROW_COUNT >", value, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_ROW_COUNT >=", value, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountLessThan(BigDecimal value) {
            addCriterion("FORM_GROUP_ROW_COUNT <", value, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_ROW_COUNT <=", value, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountIn(List<BigDecimal> values) {
            addCriterion("FORM_GROUP_ROW_COUNT in", values, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountNotIn(List<BigDecimal> values) {
            addCriterion("FORM_GROUP_ROW_COUNT not in", values, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_GROUP_ROW_COUNT between", value1, value2, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupRowCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_GROUP_ROW_COUNT not between", value1, value2, "formGroupRowCount");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortIsNull() {
            addCriterion("FORM_GROUP_SORT is null");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortIsNotNull() {
            addCriterion("FORM_GROUP_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_SORT =", value, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortNotEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_SORT <>", value, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortGreaterThan(BigDecimal value) {
            addCriterion("FORM_GROUP_SORT >", value, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_SORT >=", value, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortLessThan(BigDecimal value) {
            addCriterion("FORM_GROUP_SORT <", value, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_GROUP_SORT <=", value, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortIn(List<BigDecimal> values) {
            addCriterion("FORM_GROUP_SORT in", values, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortNotIn(List<BigDecimal> values) {
            addCriterion("FORM_GROUP_SORT not in", values, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_GROUP_SORT between", value1, value2, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_GROUP_SORT not between", value1, value2, "formGroupSort");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenIsNull() {
            addCriterion("FORM_GROUP_ISOPEN is null");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenIsNotNull() {
            addCriterion("FORM_GROUP_ISOPEN is not null");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenEqualTo(String value) {
            addCriterion("FORM_GROUP_ISOPEN =", value, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenNotEqualTo(String value) {
            addCriterion("FORM_GROUP_ISOPEN <>", value, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenGreaterThan(String value) {
            addCriterion("FORM_GROUP_ISOPEN >", value, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_GROUP_ISOPEN >=", value, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenLessThan(String value) {
            addCriterion("FORM_GROUP_ISOPEN <", value, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenLessThanOrEqualTo(String value) {
            addCriterion("FORM_GROUP_ISOPEN <=", value, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenLike(String value) {
            addCriterion("FORM_GROUP_ISOPEN like", value, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenNotLike(String value) {
            addCriterion("FORM_GROUP_ISOPEN not like", value, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenIn(List<String> values) {
            addCriterion("FORM_GROUP_ISOPEN in", values, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenNotIn(List<String> values) {
            addCriterion("FORM_GROUP_ISOPEN not in", values, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenBetween(String value1, String value2) {
            addCriterion("FORM_GROUP_ISOPEN between", value1, value2, "formGroupIsopen");
            return (Criteria) this;
        }

        public Criteria andFormGroupIsopenNotBetween(String value1, String value2) {
            addCriterion("FORM_GROUP_ISOPEN not between", value1, value2, "formGroupIsopen");
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