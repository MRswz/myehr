package com.myehr.pojo.formmanage.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FormChartsBarColumnExample implements Serializable{
	private static final long serialVersionUID = 1L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FormChartsBarColumnExample() {
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

        public Criteria andChartsBarColumnIdIsNull() {
            addCriterion("charts_bar_column_id is null");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdIsNotNull() {
            addCriterion("charts_bar_column_id is not null");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdEqualTo(BigDecimal value) {
            addCriterion("charts_bar_column_id =", value, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("charts_bar_column_id <>", value, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdGreaterThan(BigDecimal value) {
            addCriterion("charts_bar_column_id >", value, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charts_bar_column_id >=", value, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdLessThan(BigDecimal value) {
            addCriterion("charts_bar_column_id <", value, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charts_bar_column_id <=", value, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdIn(List<BigDecimal> values) {
            addCriterion("charts_bar_column_id in", values, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("charts_bar_column_id not in", values, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charts_bar_column_id between", value1, value2, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charts_bar_column_id not between", value1, value2, "chartsBarColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdIsNull() {
            addCriterion("select_form_column_id is null");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdIsNotNull() {
            addCriterion("select_form_column_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdEqualTo(BigDecimal value) {
            addCriterion("select_form_column_id =", value, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("select_form_column_id <>", value, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdGreaterThan(BigDecimal value) {
            addCriterion("select_form_column_id >", value, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("select_form_column_id >=", value, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdLessThan(BigDecimal value) {
            addCriterion("select_form_column_id <", value, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("select_form_column_id <=", value, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdIn(List<BigDecimal> values) {
            addCriterion("select_form_column_id in", values, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("select_form_column_id not in", values, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("select_form_column_id between", value1, value2, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("select_form_column_id not between", value1, value2, "selectFormColumnId");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableIsNull() {
            addCriterion("select_form_column_table is null");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableIsNotNull() {
            addCriterion("select_form_column_table is not null");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableEqualTo(String value) {
            addCriterion("select_form_column_table =", value, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableNotEqualTo(String value) {
            addCriterion("select_form_column_table <>", value, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableGreaterThan(String value) {
            addCriterion("select_form_column_table >", value, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableGreaterThanOrEqualTo(String value) {
            addCriterion("select_form_column_table >=", value, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableLessThan(String value) {
            addCriterion("select_form_column_table <", value, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableLessThanOrEqualTo(String value) {
            addCriterion("select_form_column_table <=", value, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableLike(String value) {
            addCriterion("select_form_column_table like", value, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableNotLike(String value) {
            addCriterion("select_form_column_table not like", value, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableIn(List<String> values) {
            addCriterion("select_form_column_table in", values, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableNotIn(List<String> values) {
            addCriterion("select_form_column_table not in", values, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableBetween(String value1, String value2) {
            addCriterion("select_form_column_table between", value1, value2, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnTableNotBetween(String value1, String value2) {
            addCriterion("select_form_column_table not between", value1, value2, "selectFormColumnTable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameIsNull() {
            addCriterion("select_form_column_name is null");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameIsNotNull() {
            addCriterion("select_form_column_name is not null");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameEqualTo(String value) {
            addCriterion("select_form_column_name =", value, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameNotEqualTo(String value) {
            addCriterion("select_form_column_name <>", value, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameGreaterThan(String value) {
            addCriterion("select_form_column_name >", value, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("select_form_column_name >=", value, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameLessThan(String value) {
            addCriterion("select_form_column_name <", value, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameLessThanOrEqualTo(String value) {
            addCriterion("select_form_column_name <=", value, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameLike(String value) {
            addCriterion("select_form_column_name like", value, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameNotLike(String value) {
            addCriterion("select_form_column_name not like", value, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameIn(List<String> values) {
            addCriterion("select_form_column_name in", values, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameNotIn(List<String> values) {
            addCriterion("select_form_column_name not in", values, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameBetween(String value1, String value2) {
            addCriterion("select_form_column_name between", value1, value2, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnNameNotBetween(String value1, String value2) {
            addCriterion("select_form_column_name not between", value1, value2, "selectFormColumnName");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableIsNull() {
            addCriterion("select_form_column_lable is null");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableIsNotNull() {
            addCriterion("select_form_column_lable is not null");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableEqualTo(String value) {
            addCriterion("select_form_column_lable =", value, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableNotEqualTo(String value) {
            addCriterion("select_form_column_lable <>", value, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableGreaterThan(String value) {
            addCriterion("select_form_column_lable >", value, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableGreaterThanOrEqualTo(String value) {
            addCriterion("select_form_column_lable >=", value, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableLessThan(String value) {
            addCriterion("select_form_column_lable <", value, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableLessThanOrEqualTo(String value) {
            addCriterion("select_form_column_lable <=", value, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableLike(String value) {
            addCriterion("select_form_column_lable like", value, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableNotLike(String value) {
            addCriterion("select_form_column_lable not like", value, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableIn(List<String> values) {
            addCriterion("select_form_column_lable in", values, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableNotIn(List<String> values) {
            addCriterion("select_form_column_lable not in", values, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableBetween(String value1, String value2) {
            addCriterion("select_form_column_lable between", value1, value2, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andSelectFormColumnLableNotBetween(String value1, String value2) {
            addCriterion("select_form_column_lable not between", value1, value2, "selectFormColumnLable");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeIsNull() {
            addCriterion("charts_bar_column_type is null");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeIsNotNull() {
            addCriterion("charts_bar_column_type is not null");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeEqualTo(String value) {
            addCriterion("charts_bar_column_type =", value, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeNotEqualTo(String value) {
            addCriterion("charts_bar_column_type <>", value, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeGreaterThan(String value) {
            addCriterion("charts_bar_column_type >", value, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charts_bar_column_type >=", value, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeLessThan(String value) {
            addCriterion("charts_bar_column_type <", value, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeLessThanOrEqualTo(String value) {
            addCriterion("charts_bar_column_type <=", value, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeLike(String value) {
            addCriterion("charts_bar_column_type like", value, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeNotLike(String value) {
            addCriterion("charts_bar_column_type not like", value, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeIn(List<String> values) {
            addCriterion("charts_bar_column_type in", values, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeNotIn(List<String> values) {
            addCriterion("charts_bar_column_type not in", values, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeBetween(String value1, String value2) {
            addCriterion("charts_bar_column_type between", value1, value2, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnTypeNotBetween(String value1, String value2) {
            addCriterion("charts_bar_column_type not between", value1, value2, "chartsBarColumnType");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorIsNull() {
            addCriterion("charts_bar_column_color is null");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorIsNotNull() {
            addCriterion("charts_bar_column_color is not null");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorEqualTo(String value) {
            addCriterion("charts_bar_column_color =", value, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorNotEqualTo(String value) {
            addCriterion("charts_bar_column_color <>", value, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorGreaterThan(String value) {
            addCriterion("charts_bar_column_color >", value, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorGreaterThanOrEqualTo(String value) {
            addCriterion("charts_bar_column_color >=", value, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorLessThan(String value) {
            addCriterion("charts_bar_column_color <", value, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorLessThanOrEqualTo(String value) {
            addCriterion("charts_bar_column_color <=", value, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorLike(String value) {
            addCriterion("charts_bar_column_color like", value, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorNotLike(String value) {
            addCriterion("charts_bar_column_color not like", value, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorIn(List<String> values) {
            addCriterion("charts_bar_column_color in", values, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorNotIn(List<String> values) {
            addCriterion("charts_bar_column_color not in", values, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorBetween(String value1, String value2) {
            addCriterion("charts_bar_column_color between", value1, value2, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsBarColumnColorNotBetween(String value1, String value2) {
            addCriterion("charts_bar_column_color not between", value1, value2, "chartsBarColumnColor");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdIsNull() {
            addCriterion("charts_form_id is null");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdIsNotNull() {
            addCriterion("charts_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdEqualTo(BigDecimal value) {
            addCriterion("charts_form_id =", value, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdNotEqualTo(BigDecimal value) {
            addCriterion("charts_form_id <>", value, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdGreaterThan(BigDecimal value) {
            addCriterion("charts_form_id >", value, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("charts_form_id >=", value, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdLessThan(BigDecimal value) {
            addCriterion("charts_form_id <", value, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("charts_form_id <=", value, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdIn(List<BigDecimal> values) {
            addCriterion("charts_form_id in", values, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdNotIn(List<BigDecimal> values) {
            addCriterion("charts_form_id not in", values, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charts_form_id between", value1, value2, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsFormIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("charts_form_id not between", value1, value2, "chartsFormId");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeIsNull() {
            addCriterion("charts_pie_type is null");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeIsNotNull() {
            addCriterion("charts_pie_type is not null");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeEqualTo(String value) {
            addCriterion("charts_pie_type =", value, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeNotEqualTo(String value) {
            addCriterion("charts_pie_type <>", value, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeGreaterThan(String value) {
            addCriterion("charts_pie_type >", value, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charts_pie_type >=", value, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeLessThan(String value) {
            addCriterion("charts_pie_type <", value, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeLessThanOrEqualTo(String value) {
            addCriterion("charts_pie_type <=", value, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeLike(String value) {
            addCriterion("charts_pie_type like", value, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeNotLike(String value) {
            addCriterion("charts_pie_type not like", value, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeIn(List<String> values) {
            addCriterion("charts_pie_type in", values, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeNotIn(List<String> values) {
            addCriterion("charts_pie_type not in", values, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeBetween(String value1, String value2) {
            addCriterion("charts_pie_type between", value1, value2, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsPieTypeNotBetween(String value1, String value2) {
            addCriterion("charts_pie_type not between", value1, value2, "chartsPieType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeIsNull() {
            addCriterion("charts_bar_type is null");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeIsNotNull() {
            addCriterion("charts_bar_type is not null");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeEqualTo(String value) {
            addCriterion("charts_bar_type =", value, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeNotEqualTo(String value) {
            addCriterion("charts_bar_type <>", value, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeGreaterThan(String value) {
            addCriterion("charts_bar_type >", value, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charts_bar_type >=", value, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeLessThan(String value) {
            addCriterion("charts_bar_type <", value, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeLessThanOrEqualTo(String value) {
            addCriterion("charts_bar_type <=", value, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeLike(String value) {
            addCriterion("charts_bar_type like", value, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeNotLike(String value) {
            addCriterion("charts_bar_type not like", value, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeIn(List<String> values) {
            addCriterion("charts_bar_type in", values, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeNotIn(List<String> values) {
            addCriterion("charts_bar_type not in", values, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeBetween(String value1, String value2) {
            addCriterion("charts_bar_type between", value1, value2, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andChartsBarTypeNotBetween(String value1, String value2) {
            addCriterion("charts_bar_type not between", value1, value2, "chartsBarType");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterIsNull() {
            addCriterion("pie_outer_ring_diameter is null");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterIsNotNull() {
            addCriterion("pie_outer_ring_diameter is not null");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterEqualTo(String value) {
            addCriterion("pie_outer_ring_diameter =", value, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterNotEqualTo(String value) {
            addCriterion("pie_outer_ring_diameter <>", value, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterGreaterThan(String value) {
            addCriterion("pie_outer_ring_diameter >", value, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterGreaterThanOrEqualTo(String value) {
            addCriterion("pie_outer_ring_diameter >=", value, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterLessThan(String value) {
            addCriterion("pie_outer_ring_diameter <", value, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterLessThanOrEqualTo(String value) {
            addCriterion("pie_outer_ring_diameter <=", value, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterLike(String value) {
            addCriterion("pie_outer_ring_diameter like", value, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterNotLike(String value) {
            addCriterion("pie_outer_ring_diameter not like", value, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterIn(List<String> values) {
            addCriterion("pie_outer_ring_diameter in", values, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterNotIn(List<String> values) {
            addCriterion("pie_outer_ring_diameter not in", values, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterBetween(String value1, String value2) {
            addCriterion("pie_outer_ring_diameter between", value1, value2, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieOuterRingDiameterNotBetween(String value1, String value2) {
            addCriterion("pie_outer_ring_diameter not between", value1, value2, "pieOuterRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterIsNull() {
            addCriterion("pie_inner_ring_diameter is null");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterIsNotNull() {
            addCriterion("pie_inner_ring_diameter is not null");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterEqualTo(String value) {
            addCriterion("pie_inner_ring_diameter =", value, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterNotEqualTo(String value) {
            addCriterion("pie_inner_ring_diameter <>", value, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterGreaterThan(String value) {
            addCriterion("pie_inner_ring_diameter >", value, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterGreaterThanOrEqualTo(String value) {
            addCriterion("pie_inner_ring_diameter >=", value, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterLessThan(String value) {
            addCriterion("pie_inner_ring_diameter <", value, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterLessThanOrEqualTo(String value) {
            addCriterion("pie_inner_ring_diameter <=", value, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterLike(String value) {
            addCriterion("pie_inner_ring_diameter like", value, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterNotLike(String value) {
            addCriterion("pie_inner_ring_diameter not like", value, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterIn(List<String> values) {
            addCriterion("pie_inner_ring_diameter in", values, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterNotIn(List<String> values) {
            addCriterion("pie_inner_ring_diameter not in", values, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterBetween(String value1, String value2) {
            addCriterion("pie_inner_ring_diameter between", value1, value2, "pieInnerRingDiameter");
            return (Criteria) this;
        }

        public Criteria andPieInnerRingDiameterNotBetween(String value1, String value2) {
            addCriterion("pie_inner_ring_diameter not between", value1, value2, "pieInnerRingDiameter");
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