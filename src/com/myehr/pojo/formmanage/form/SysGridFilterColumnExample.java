package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysGridFilterColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysGridFilterColumnExample() {
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

        public Criteria andQueryColumnIdIsNull() {
            addCriterion("QUERY_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdIsNotNull() {
            addCriterion("QUERY_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdEqualTo(BigDecimal value) {
            addCriterion("QUERY_COLUMN_ID =", value, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("QUERY_COLUMN_ID <>", value, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdGreaterThan(BigDecimal value) {
            addCriterion("QUERY_COLUMN_ID >", value, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUERY_COLUMN_ID >=", value, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdLessThan(BigDecimal value) {
            addCriterion("QUERY_COLUMN_ID <", value, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUERY_COLUMN_ID <=", value, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdIn(List<BigDecimal> values) {
            addCriterion("QUERY_COLUMN_ID in", values, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("QUERY_COLUMN_ID not in", values, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUERY_COLUMN_ID between", value1, value2, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andQueryColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUERY_COLUMN_ID not between", value1, value2, "queryColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdIsNull() {
            addCriterion("GRID_COLUMN_FILTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdIsNotNull() {
            addCriterion("GRID_COLUMN_FILTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_FILTER_ID =", value, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdNotEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_FILTER_ID <>", value, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdGreaterThan(BigDecimal value) {
            addCriterion("GRID_COLUMN_FILTER_ID >", value, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_FILTER_ID >=", value, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdLessThan(BigDecimal value) {
            addCriterion("GRID_COLUMN_FILTER_ID <", value, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_FILTER_ID <=", value, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdIn(List<BigDecimal> values) {
            addCriterion("GRID_COLUMN_FILTER_ID in", values, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdNotIn(List<BigDecimal> values) {
            addCriterion("GRID_COLUMN_FILTER_ID not in", values, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_COLUMN_FILTER_ID between", value1, value2, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_COLUMN_FILTER_ID not between", value1, value2, "gridColumnFilterId");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableIsNull() {
            addCriterion("GRID_COLUMN_LABLE is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableIsNotNull() {
            addCriterion("GRID_COLUMN_LABLE is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableEqualTo(String value) {
            addCriterion("GRID_COLUMN_LABLE =", value, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableNotEqualTo(String value) {
            addCriterion("GRID_COLUMN_LABLE <>", value, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableGreaterThan(String value) {
            addCriterion("GRID_COLUMN_LABLE >", value, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_LABLE >=", value, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableLessThan(String value) {
            addCriterion("GRID_COLUMN_LABLE <", value, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableLessThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_LABLE <=", value, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableLike(String value) {
            addCriterion("GRID_COLUMN_LABLE like", value, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableNotLike(String value) {
            addCriterion("GRID_COLUMN_LABLE not like", value, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableIn(List<String> values) {
            addCriterion("GRID_COLUMN_LABLE in", values, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableNotIn(List<String> values) {
            addCriterion("GRID_COLUMN_LABLE not in", values, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_LABLE between", value1, value2, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnLableNotBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_LABLE not between", value1, value2, "gridColumnLable");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdIsNull() {
            addCriterion("GRID_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdIsNotNull() {
            addCriterion("GRID_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_ID =", value, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_ID <>", value, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdGreaterThan(BigDecimal value) {
            addCriterion("GRID_COLUMN_ID >", value, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_ID >=", value, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdLessThan(BigDecimal value) {
            addCriterion("GRID_COLUMN_ID <", value, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_ID <=", value, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdIn(List<BigDecimal> values) {
            addCriterion("GRID_COLUMN_ID in", values, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("GRID_COLUMN_ID not in", values, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_COLUMN_ID between", value1, value2, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_COLUMN_ID not between", value1, value2, "gridColumnId");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleIsNull() {
            addCriterion("GRID_COLUMN_FILTER_RULE is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleIsNotNull() {
            addCriterion("GRID_COLUMN_FILTER_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleEqualTo(String value) {
            addCriterion("GRID_COLUMN_FILTER_RULE =", value, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleNotEqualTo(String value) {
            addCriterion("GRID_COLUMN_FILTER_RULE <>", value, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleGreaterThan(String value) {
            addCriterion("GRID_COLUMN_FILTER_RULE >", value, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_FILTER_RULE >=", value, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleLessThan(String value) {
            addCriterion("GRID_COLUMN_FILTER_RULE <", value, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleLessThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_FILTER_RULE <=", value, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleLike(String value) {
            addCriterion("GRID_COLUMN_FILTER_RULE like", value, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleNotLike(String value) {
            addCriterion("GRID_COLUMN_FILTER_RULE not like", value, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleIn(List<String> values) {
            addCriterion("GRID_COLUMN_FILTER_RULE in", values, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleNotIn(List<String> values) {
            addCriterion("GRID_COLUMN_FILTER_RULE not in", values, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_FILTER_RULE between", value1, value2, "gridColumnFilterRule");
            return (Criteria) this;
        }

        public Criteria andGridColumnFilterRuleNotBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_FILTER_RULE not between", value1, value2, "gridColumnFilterRule");
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

        public Criteria andGridColumnIsShowIsNull() {
            addCriterion("GRID_COLUMN_IS_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowIsNotNull() {
            addCriterion("GRID_COLUMN_IS_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowEqualTo(String value) {
            addCriterion("GRID_COLUMN_IS_SHOW =", value, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowNotEqualTo(String value) {
            addCriterion("GRID_COLUMN_IS_SHOW <>", value, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowGreaterThan(String value) {
            addCriterion("GRID_COLUMN_IS_SHOW >", value, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_IS_SHOW >=", value, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowLessThan(String value) {
            addCriterion("GRID_COLUMN_IS_SHOW <", value, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowLessThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_IS_SHOW <=", value, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowLike(String value) {
            addCriterion("GRID_COLUMN_IS_SHOW like", value, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowNotLike(String value) {
            addCriterion("GRID_COLUMN_IS_SHOW not like", value, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowIn(List<String> values) {
            addCriterion("GRID_COLUMN_IS_SHOW in", values, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowNotIn(List<String> values) {
            addCriterion("GRID_COLUMN_IS_SHOW not in", values, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_IS_SHOW between", value1, value2, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsShowNotBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_IS_SHOW not between", value1, value2, "gridColumnIsShow");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanIsNull() {
            addCriterion("GRID_COLUMN_ROW_SPAN is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanIsNotNull() {
            addCriterion("GRID_COLUMN_ROW_SPAN is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanEqualTo(String value) {
            addCriterion("GRID_COLUMN_ROW_SPAN =", value, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanNotEqualTo(String value) {
            addCriterion("GRID_COLUMN_ROW_SPAN <>", value, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanGreaterThan(String value) {
            addCriterion("GRID_COLUMN_ROW_SPAN >", value, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_ROW_SPAN >=", value, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanLessThan(String value) {
            addCriterion("GRID_COLUMN_ROW_SPAN <", value, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanLessThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_ROW_SPAN <=", value, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanLike(String value) {
            addCriterion("GRID_COLUMN_ROW_SPAN like", value, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanNotLike(String value) {
            addCriterion("GRID_COLUMN_ROW_SPAN not like", value, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanIn(List<String> values) {
            addCriterion("GRID_COLUMN_ROW_SPAN in", values, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanNotIn(List<String> values) {
            addCriterion("GRID_COLUMN_ROW_SPAN not in", values, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_ROW_SPAN between", value1, value2, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnRowSpanNotBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_ROW_SPAN not between", value1, value2, "gridColumnRowSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanIsNull() {
            addCriterion("GRID_COLUMN_COL_SPAN is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanIsNotNull() {
            addCriterion("GRID_COLUMN_COL_SPAN is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanEqualTo(String value) {
            addCriterion("GRID_COLUMN_COL_SPAN =", value, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanNotEqualTo(String value) {
            addCriterion("GRID_COLUMN_COL_SPAN <>", value, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanGreaterThan(String value) {
            addCriterion("GRID_COLUMN_COL_SPAN >", value, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_COL_SPAN >=", value, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanLessThan(String value) {
            addCriterion("GRID_COLUMN_COL_SPAN <", value, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanLessThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_COL_SPAN <=", value, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanLike(String value) {
            addCriterion("GRID_COLUMN_COL_SPAN like", value, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanNotLike(String value) {
            addCriterion("GRID_COLUMN_COL_SPAN not like", value, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanIn(List<String> values) {
            addCriterion("GRID_COLUMN_COL_SPAN in", values, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanNotIn(List<String> values) {
            addCriterion("GRID_COLUMN_COL_SPAN not in", values, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_COL_SPAN between", value1, value2, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnColSpanNotBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_COL_SPAN not between", value1, value2, "gridColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightIsNull() {
            addCriterion("GRID_COLUMN_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightIsNotNull() {
            addCriterion("GRID_COLUMN_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightEqualTo(String value) {
            addCriterion("GRID_COLUMN_HEIGHT =", value, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightNotEqualTo(String value) {
            addCriterion("GRID_COLUMN_HEIGHT <>", value, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightGreaterThan(String value) {
            addCriterion("GRID_COLUMN_HEIGHT >", value, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_HEIGHT >=", value, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightLessThan(String value) {
            addCriterion("GRID_COLUMN_HEIGHT <", value, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightLessThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_HEIGHT <=", value, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightLike(String value) {
            addCriterion("GRID_COLUMN_HEIGHT like", value, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightNotLike(String value) {
            addCriterion("GRID_COLUMN_HEIGHT not like", value, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightIn(List<String> values) {
            addCriterion("GRID_COLUMN_HEIGHT in", values, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightNotIn(List<String> values) {
            addCriterion("GRID_COLUMN_HEIGHT not in", values, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_HEIGHT between", value1, value2, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnHeightNotBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_HEIGHT not between", value1, value2, "gridColumnHeight");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthIsNull() {
            addCriterion("GRID_COLUMN_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthIsNotNull() {
            addCriterion("GRID_COLUMN_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthEqualTo(String value) {
            addCriterion("GRID_COLUMN_WIDTH =", value, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthNotEqualTo(String value) {
            addCriterion("GRID_COLUMN_WIDTH <>", value, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthGreaterThan(String value) {
            addCriterion("GRID_COLUMN_WIDTH >", value, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_WIDTH >=", value, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthLessThan(String value) {
            addCriterion("GRID_COLUMN_WIDTH <", value, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthLessThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_WIDTH <=", value, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthLike(String value) {
            addCriterion("GRID_COLUMN_WIDTH like", value, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthNotLike(String value) {
            addCriterion("GRID_COLUMN_WIDTH not like", value, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthIn(List<String> values) {
            addCriterion("GRID_COLUMN_WIDTH in", values, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthNotIn(List<String> values) {
            addCriterion("GRID_COLUMN_WIDTH not in", values, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_WIDTH between", value1, value2, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnWidthNotBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_WIDTH not between", value1, value2, "gridColumnWidth");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupIsNull() {
            addCriterion("GRID_COLUMN_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupIsNotNull() {
            addCriterion("GRID_COLUMN_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_GROUP =", value, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupNotEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_GROUP <>", value, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupGreaterThan(BigDecimal value) {
            addCriterion("GRID_COLUMN_GROUP >", value, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_GROUP >=", value, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupLessThan(BigDecimal value) {
            addCriterion("GRID_COLUMN_GROUP <", value, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRID_COLUMN_GROUP <=", value, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupIn(List<BigDecimal> values) {
            addCriterion("GRID_COLUMN_GROUP in", values, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupNotIn(List<BigDecimal> values) {
            addCriterion("GRID_COLUMN_GROUP not in", values, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_COLUMN_GROUP between", value1, value2, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnGroupNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRID_COLUMN_GROUP not between", value1, value2, "gridColumnGroup");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisIsNull() {
            addCriterion("GRID_COLUMN_IS_INTERVAIS is null");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisIsNotNull() {
            addCriterion("GRID_COLUMN_IS_INTERVAIS is not null");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisEqualTo(String value) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS =", value, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisNotEqualTo(String value) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS <>", value, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisGreaterThan(String value) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS >", value, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisGreaterThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS >=", value, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisLessThan(String value) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS <", value, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisLessThanOrEqualTo(String value) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS <=", value, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisLike(String value) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS like", value, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisNotLike(String value) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS not like", value, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisIn(List<String> values) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS in", values, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisNotIn(List<String> values) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS not in", values, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS between", value1, value2, "gridColumnIsIntervais");
            return (Criteria) this;
        }

        public Criteria andGridColumnIsIntervaisNotBetween(String value1, String value2) {
            addCriterion("GRID_COLUMN_IS_INTERVAIS not between", value1, value2, "gridColumnIsIntervais");
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