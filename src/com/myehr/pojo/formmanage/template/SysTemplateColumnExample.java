package com.myehr.pojo.formmanage.template;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysTemplateColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTemplateColumnExample() {
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

        public Criteria andTemplateColumnIdIsNull() {
            addCriterion("TEMPLATE_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ID =", value, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdNotEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ID <>", value, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdGreaterThan(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ID >", value, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ID >=", value, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdLessThan(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ID <", value, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ID <=", value, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdIn(List<Integer> values) {
            addCriterion("TEMPLATE_COLUMN_ID in", values, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdNotIn(List<Integer> values) {
            addCriterion("TEMPLATE_COLUMN_ID not in", values, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_COLUMN_ID between", value1, value2, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_COLUMN_ID not between", value1, value2, "templateColumnId");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListIsNull() {
            addCriterion("IS_SHOW_PC_LIST is null");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListIsNotNull() {
            addCriterion("IS_SHOW_PC_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListEqualTo(String value) {
            addCriterion("IS_SHOW_PC_LIST =", value, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListNotEqualTo(String value) {
            addCriterion("IS_SHOW_PC_LIST <>", value, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListGreaterThan(String value) {
            addCriterion("IS_SHOW_PC_LIST >", value, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOW_PC_LIST >=", value, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListLessThan(String value) {
            addCriterion("IS_SHOW_PC_LIST <", value, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOW_PC_LIST <=", value, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListLike(String value) {
            addCriterion("IS_SHOW_PC_LIST like", value, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListNotLike(String value) {
            addCriterion("IS_SHOW_PC_LIST not like", value, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListIn(List<String> values) {
            addCriterion("IS_SHOW_PC_LIST in", values, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListNotIn(List<String> values) {
            addCriterion("IS_SHOW_PC_LIST not in", values, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListBetween(String value1, String value2) {
            addCriterion("IS_SHOW_PC_LIST between", value1, value2, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcListNotBetween(String value1, String value2) {
            addCriterion("IS_SHOW_PC_LIST not between", value1, value2, "isShowPcList");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardIsNull() {
            addCriterion("IS_SHOW_PC_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardIsNotNull() {
            addCriterion("IS_SHOW_PC_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardEqualTo(String value) {
            addCriterion("IS_SHOW_PC_CARD =", value, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardNotEqualTo(String value) {
            addCriterion("IS_SHOW_PC_CARD <>", value, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardGreaterThan(String value) {
            addCriterion("IS_SHOW_PC_CARD >", value, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOW_PC_CARD >=", value, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardLessThan(String value) {
            addCriterion("IS_SHOW_PC_CARD <", value, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOW_PC_CARD <=", value, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardLike(String value) {
            addCriterion("IS_SHOW_PC_CARD like", value, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardNotLike(String value) {
            addCriterion("IS_SHOW_PC_CARD not like", value, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardIn(List<String> values) {
            addCriterion("IS_SHOW_PC_CARD in", values, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardNotIn(List<String> values) {
            addCriterion("IS_SHOW_PC_CARD not in", values, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardBetween(String value1, String value2) {
            addCriterion("IS_SHOW_PC_CARD between", value1, value2, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowPcCardNotBetween(String value1, String value2) {
            addCriterion("IS_SHOW_PC_CARD not between", value1, value2, "isShowPcCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListIsNull() {
            addCriterion("IS_SHOW_APP_LIST is null");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListIsNotNull() {
            addCriterion("IS_SHOW_APP_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListEqualTo(String value) {
            addCriterion("IS_SHOW_APP_LIST =", value, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListNotEqualTo(String value) {
            addCriterion("IS_SHOW_APP_LIST <>", value, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListGreaterThan(String value) {
            addCriterion("IS_SHOW_APP_LIST >", value, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOW_APP_LIST >=", value, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListLessThan(String value) {
            addCriterion("IS_SHOW_APP_LIST <", value, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOW_APP_LIST <=", value, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListLike(String value) {
            addCriterion("IS_SHOW_APP_LIST like", value, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListNotLike(String value) {
            addCriterion("IS_SHOW_APP_LIST not like", value, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListIn(List<String> values) {
            addCriterion("IS_SHOW_APP_LIST in", values, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListNotIn(List<String> values) {
            addCriterion("IS_SHOW_APP_LIST not in", values, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListBetween(String value1, String value2) {
            addCriterion("IS_SHOW_APP_LIST between", value1, value2, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppListNotBetween(String value1, String value2) {
            addCriterion("IS_SHOW_APP_LIST not between", value1, value2, "isShowAppList");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardIsNull() {
            addCriterion("IS_SHOW_APP_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardIsNotNull() {
            addCriterion("IS_SHOW_APP_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardEqualTo(String value) {
            addCriterion("IS_SHOW_APP_CARD =", value, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardNotEqualTo(String value) {
            addCriterion("IS_SHOW_APP_CARD <>", value, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardGreaterThan(String value) {
            addCriterion("IS_SHOW_APP_CARD >", value, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOW_APP_CARD >=", value, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardLessThan(String value) {
            addCriterion("IS_SHOW_APP_CARD <", value, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOW_APP_CARD <=", value, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardLike(String value) {
            addCriterion("IS_SHOW_APP_CARD like", value, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardNotLike(String value) {
            addCriterion("IS_SHOW_APP_CARD not like", value, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardIn(List<String> values) {
            addCriterion("IS_SHOW_APP_CARD in", values, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardNotIn(List<String> values) {
            addCriterion("IS_SHOW_APP_CARD not in", values, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardBetween(String value1, String value2) {
            addCriterion("IS_SHOW_APP_CARD between", value1, value2, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andIsShowAppCardNotBetween(String value1, String value2) {
            addCriterion("IS_SHOW_APP_CARD not between", value1, value2, "isShowAppCard");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionIsNull() {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION =", value, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION <>", value, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION >", value, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION >=", value, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION <", value, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION <=", value, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionLike(String value) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION like", value, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION not like", value, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION in", values, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION not in", values, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION between", value1, value2, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnExpressionNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_EXPRESSION not between", value1, value2, "templateColumnExpression");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherIsNull() {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER =", value, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER <>", value, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER >", value, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER >=", value, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER <", value, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER <=", value, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherLike(String value) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER like", value, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER not like", value, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER in", values, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER not in", values, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER between", value1, value2, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTableOtherNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_TABLE_OTHER not between", value1, value2, "templateColumnTableOther");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameIsNull() {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME =", value, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME <>", value, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME >", value, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME >=", value, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME <", value, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME <=", value, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameLike(String value) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME like", value, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME not like", value, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME in", values, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME not in", values, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME between", value1, value2, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnOtherNameNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_OTHER_NAME not between", value1, value2, "templateColumnOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdIsNull() {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID =", value, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdNotEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID <>", value, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdGreaterThan(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID >", value, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID >=", value, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdLessThan(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID <", value, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID <=", value, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdIn(List<Integer> values) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID in", values, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdNotIn(List<Integer> values) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID not in", values, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID between", value1, value2, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnEntityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_COLUMN_ENTITY_ID not between", value1, value2, "templateColumnEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdIsNull() {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID =", value, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdNotEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID <>", value, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdGreaterThan(Integer value) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID >", value, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID >=", value, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdLessThan(Integer value) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID <", value, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID <=", value, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdIn(List<Integer> values) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID in", values, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdNotIn(List<Integer> values) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID not in", values, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID between", value1, value2, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColumnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_COLUMN_COLUMN_ID not between", value1, value2, "templateColumnColumnId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameIsNull() {
            addCriterion("TEMPLATE_ENTITY_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameIsNotNull() {
            addCriterion("TEMPLATE_ENTITY_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME =", value, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameNotEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME <>", value, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameGreaterThan(String value) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME >", value, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME >=", value, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameLessThan(String value) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME <", value, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME <=", value, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameLike(String value) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME like", value, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameNotLike(String value) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME not like", value, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameIn(List<String> values) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME in", values, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameNotIn(List<String> values) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME not in", values, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME between", value1, value2, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityTablenameNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ENTITY_TABLENAME not between", value1, value2, "templateEntityTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameIsNull() {
            addCriterion("TEMPLATE_FIELD_TABLENAME is null");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameIsNotNull() {
            addCriterion("TEMPLATE_FIELD_TABLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameEqualTo(String value) {
            addCriterion("TEMPLATE_FIELD_TABLENAME =", value, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameNotEqualTo(String value) {
            addCriterion("TEMPLATE_FIELD_TABLENAME <>", value, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameGreaterThan(String value) {
            addCriterion("TEMPLATE_FIELD_TABLENAME >", value, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_FIELD_TABLENAME >=", value, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameLessThan(String value) {
            addCriterion("TEMPLATE_FIELD_TABLENAME <", value, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_FIELD_TABLENAME <=", value, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameLike(String value) {
            addCriterion("TEMPLATE_FIELD_TABLENAME like", value, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameNotLike(String value) {
            addCriterion("TEMPLATE_FIELD_TABLENAME not like", value, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameIn(List<String> values) {
            addCriterion("TEMPLATE_FIELD_TABLENAME in", values, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameNotIn(List<String> values) {
            addCriterion("TEMPLATE_FIELD_TABLENAME not in", values, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameBetween(String value1, String value2) {
            addCriterion("TEMPLATE_FIELD_TABLENAME between", value1, value2, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateFieldTablenameNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_FIELD_TABLENAME not between", value1, value2, "templateFieldTablename");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameIsNull() {
            addCriterion("TEMPLATE_COLUMN_US_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_US_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_US_NAME =", value, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_US_NAME <>", value, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_US_NAME >", value, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_US_NAME >=", value, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_US_NAME <", value, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_US_NAME <=", value, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameLike(String value) {
            addCriterion("TEMPLATE_COLUMN_US_NAME like", value, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_US_NAME not like", value, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_US_NAME in", values, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_US_NAME not in", values, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_US_NAME between", value1, value2, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnUsNameNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_US_NAME not between", value1, value2, "templateColumnUsName");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelIsNull() {
            addCriterion("TEMPLATE_COLUMN_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL =", value, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL <>", value, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL >", value, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL >=", value, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL <", value, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL <=", value, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelLike(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL like", value, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL not like", value, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_LABEL in", values, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_LABEL not in", values, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_LABEL between", value1, value2, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_LABEL not between", value1, value2, "templateColumnLabel");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthIsNull() {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH =", value, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH <>", value, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH >", value, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH >=", value, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH <", value, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH <=", value, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthLike(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH like", value, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH not like", value, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH in", values, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH not in", values, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH between", value1, value2, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnLabelWidthNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_LABEL_WIDTH not between", value1, value2, "templateColumnLabelWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeIsNull() {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE =", value, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE <>", value, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE >", value, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE >=", value, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE <", value, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE <=", value, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeLike(String value) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE like", value, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE not like", value, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE in", values, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE not in", values, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE between", value1, value2, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGuiTypeNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_GUI_TYPE not between", value1, value2, "templateColumnGuiType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthIsNull() {
            addCriterion("TEMPLATE_COLUMN_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_WIDTH =", value, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_WIDTH <>", value, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_WIDTH >", value, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_WIDTH >=", value, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_WIDTH <", value, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_WIDTH <=", value, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthLike(String value) {
            addCriterion("TEMPLATE_COLUMN_WIDTH like", value, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_WIDTH not like", value, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_WIDTH in", values, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_WIDTH not in", values, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_WIDTH between", value1, value2, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnWidthNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_WIDTH not between", value1, value2, "templateColumnWidth");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignIsNull() {
            addCriterion("TEMPLATE_COLUMN_ALIGN is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_ALIGN is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_ALIGN =", value, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_ALIGN <>", value, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_ALIGN >", value, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_ALIGN >=", value, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_ALIGN <", value, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_ALIGN <=", value, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignLike(String value) {
            addCriterion("TEMPLATE_COLUMN_ALIGN like", value, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_ALIGN not like", value, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_ALIGN in", values, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_ALIGN not in", values, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_ALIGN between", value1, value2, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnAlignNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_ALIGN not between", value1, value2, "templateColumnAlign");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightIsNull() {
            addCriterion("TEMPLATE_COLUMN_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT =", value, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT <>", value, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT >", value, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT >=", value, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT <", value, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT <=", value, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightLike(String value) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT like", value, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT not like", value, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT in", values, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT not in", values, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT between", value1, value2, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnHeightNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_HEIGHT not between", value1, value2, "templateColumnHeight");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortIsNull() {
            addCriterion("TEMPLATE_COLUMN_SORT is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_SORT =", value, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortNotEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_SORT <>", value, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortGreaterThan(Integer value) {
            addCriterion("TEMPLATE_COLUMN_SORT >", value, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_SORT >=", value, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortLessThan(Integer value) {
            addCriterion("TEMPLATE_COLUMN_SORT <", value, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_COLUMN_SORT <=", value, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortIn(List<Integer> values) {
            addCriterion("TEMPLATE_COLUMN_SORT in", values, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortNotIn(List<Integer> values) {
            addCriterion("TEMPLATE_COLUMN_SORT not in", values, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_COLUMN_SORT between", value1, value2, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnSortNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_COLUMN_SORT not between", value1, value2, "templateColumnSort");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeIsNull() {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE =", value, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE <>", value, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE >", value, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE >=", value, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE <", value, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE <=", value, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeLike(String value) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE like", value, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE not like", value, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE in", values, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE not in", values, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE between", value1, value2, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnShowTypeNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_SHOW_TYPE not between", value1, value2, "templateColumnShowType");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdIsNull() {
            addCriterion("TEMPLATE_TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdEqualTo(Integer value) {
            addCriterion("TEMPLATE_TEMPLATE_ID =", value, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdNotEqualTo(Integer value) {
            addCriterion("TEMPLATE_TEMPLATE_ID <>", value, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdGreaterThan(Integer value) {
            addCriterion("TEMPLATE_TEMPLATE_ID >", value, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_TEMPLATE_ID >=", value, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdLessThan(Integer value) {
            addCriterion("TEMPLATE_TEMPLATE_ID <", value, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_TEMPLATE_ID <=", value, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdIn(List<Integer> values) {
            addCriterion("TEMPLATE_TEMPLATE_ID in", values, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdNotIn(List<Integer> values) {
            addCriterion("TEMPLATE_TEMPLATE_ID not in", values, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_TEMPLATE_ID between", value1, value2, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_TEMPLATE_ID not between", value1, value2, "templateTemplateId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredIsNull() {
            addCriterion("TEMPLATE_COLUMN_REQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_REQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED =", value, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED <>", value, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED >", value, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED >=", value, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED <", value, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED <=", value, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredLike(String value) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED like", value, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED not like", value, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED in", values, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED not in", values, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED between", value1, value2, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnRequiredNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_REQUIRED not between", value1, value2, "templateColumnRequired");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanIsNull() {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN =", value, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanNotEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN <>", value, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanGreaterThan(BigDecimal value) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN >", value, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN >=", value, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanLessThan(BigDecimal value) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN <", value, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN <=", value, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN in", values, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanNotIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN not in", values, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN between", value1, value2, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColSpanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_COLUMN_COL_SPAN not between", value1, value2, "templateColumnColSpan");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalIsNull() {
            addCriterion("TEMPLATE_COLUMN_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_TOTAL =", value, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_TOTAL <>", value, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_TOTAL >", value, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_TOTAL >=", value, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_TOTAL <", value, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_TOTAL <=", value, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalLike(String value) {
            addCriterion("TEMPLATE_COLUMN_TOTAL like", value, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_TOTAL not like", value, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_TOTAL in", values, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_TOTAL not in", values, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_TOTAL between", value1, value2, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnTotalNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_TOTAL not between", value1, value2, "templateColumnTotal");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthIsNull() {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthEqualTo(Long value) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH =", value, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthNotEqualTo(Long value) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH <>", value, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthGreaterThan(Long value) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH >", value, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH >=", value, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthLessThan(Long value) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH <", value, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthLessThanOrEqualTo(Long value) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH <=", value, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthIn(List<Long> values) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH in", values, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthNotIn(List<Long> values) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH not in", values, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthBetween(Long value1, Long value2) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH between", value1, value2, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMaxLengthNotBetween(Long value1, Long value2) {
            addCriterion("TEMPLATE_COLUMN_MAX_LENGTH not between", value1, value2, "templateColumnMaxLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthIsNull() {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthEqualTo(Long value) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH =", value, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthNotEqualTo(Long value) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH <>", value, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthGreaterThan(Long value) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH >", value, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthGreaterThanOrEqualTo(Long value) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH >=", value, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthLessThan(Long value) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH <", value, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthLessThanOrEqualTo(Long value) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH <=", value, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthIn(List<Long> values) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH in", values, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthNotIn(List<Long> values) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH not in", values, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthBetween(Long value1, Long value2) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH between", value1, value2, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnMinLengthNotBetween(Long value1, Long value2) {
            addCriterion("TEMPLATE_COLUMN_MIN_LENGTH not between", value1, value2, "templateColumnMinLength");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorIsNull() {
            addCriterion("TEMPLATE_COLUMN_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR =", value, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR <>", value, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR >", value, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR >=", value, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR <", value, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR <=", value, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorLike(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR like", value, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR not like", value, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_COLOR in", values, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_COLOR not in", values, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_COLOR between", value1, value2, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_COLOR not between", value1, value2, "templateColumnColor");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionIsNull() {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION =", value, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION <>", value, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION >", value, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION >=", value, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION <", value, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION <=", value, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionLike(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION like", value, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION not like", value, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION in", values, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION not in", values, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION between", value1, value2, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnColorConditionNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_COLOR_CONDITION not between", value1, value2, "templateColumnColorCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdIsNull() {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdIsNotNull() {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID =", value, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdNotEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID <>", value, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdGreaterThan(String value) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID >", value, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID >=", value, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdLessThan(String value) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID <", value, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID <=", value, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdLike(String value) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID like", value, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdNotLike(String value) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID not like", value, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID in", values, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdNotIn(List<String> values) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID not in", values, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID between", value1, value2, "templateColumnGroupId");
            return (Criteria) this;
        }

        public Criteria andTemplateColumnGroupIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_COLUMN_GROUP_ID not between", value1, value2, "templateColumnGroupId");
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