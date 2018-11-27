package com.myehr.pojo.formmanage.template;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysTemplateSqlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTemplateSqlExample() {
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

        public Criteria andTemplateSqlIdIsNull() {
            addCriterion("TEMPLATE_SQL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdIsNotNull() {
            addCriterion("TEMPLATE_SQL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_SQL_ID =", value, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdNotEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_SQL_ID <>", value, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdGreaterThan(BigDecimal value) {
            addCriterion("TEMPLATE_SQL_ID >", value, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_SQL_ID >=", value, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdLessThan(BigDecimal value) {
            addCriterion("TEMPLATE_SQL_ID <", value, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_SQL_ID <=", value, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_SQL_ID in", values, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdNotIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_SQL_ID not in", values, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_SQL_ID between", value1, value2, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_SQL_ID not between", value1, value2, "templateSqlId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameIsNull() {
            addCriterion("TEMPLATE_ENTITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameIsNotNull() {
            addCriterion("TEMPLATE_ENTITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_NAME =", value, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameNotEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_NAME <>", value, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameGreaterThan(String value) {
            addCriterion("TEMPLATE_ENTITY_NAME >", value, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_NAME >=", value, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameLessThan(String value) {
            addCriterion("TEMPLATE_ENTITY_NAME <", value, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_NAME <=", value, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameLike(String value) {
            addCriterion("TEMPLATE_ENTITY_NAME like", value, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameNotLike(String value) {
            addCriterion("TEMPLATE_ENTITY_NAME not like", value, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameIn(List<String> values) {
            addCriterion("TEMPLATE_ENTITY_NAME in", values, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameNotIn(List<String> values) {
            addCriterion("TEMPLATE_ENTITY_NAME not in", values, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ENTITY_NAME between", value1, value2, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityNameNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ENTITY_NAME not between", value1, value2, "templateEntityName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameIsNull() {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameIsNotNull() {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME =", value, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameNotEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME <>", value, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameGreaterThan(String value) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME >", value, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME >=", value, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameLessThan(String value) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME <", value, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME <=", value, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameLike(String value) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME like", value, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameNotLike(String value) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME not like", value, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameIn(List<String> values) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME in", values, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameNotIn(List<String> values) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME not in", values, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME between", value1, value2, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityOtherNameNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ENTITY_OTHER_NAME not between", value1, value2, "templateEntityOtherName");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyIsNull() {
            addCriterion("TEMPLATE_PROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyIsNotNull() {
            addCriterion("TEMPLATE_PROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyEqualTo(String value) {
            addCriterion("TEMPLATE_PROPERTY =", value, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyNotEqualTo(String value) {
            addCriterion("TEMPLATE_PROPERTY <>", value, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyGreaterThan(String value) {
            addCriterion("TEMPLATE_PROPERTY >", value, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_PROPERTY >=", value, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyLessThan(String value) {
            addCriterion("TEMPLATE_PROPERTY <", value, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_PROPERTY <=", value, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyLike(String value) {
            addCriterion("TEMPLATE_PROPERTY like", value, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyNotLike(String value) {
            addCriterion("TEMPLATE_PROPERTY not like", value, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyIn(List<String> values) {
            addCriterion("TEMPLATE_PROPERTY in", values, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyNotIn(List<String> values) {
            addCriterion("TEMPLATE_PROPERTY not in", values, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyBetween(String value1, String value2) {
            addCriterion("TEMPLATE_PROPERTY between", value1, value2, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplatePropertyNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_PROPERTY not between", value1, value2, "templateProperty");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolIsNull() {
            addCriterion("TEMPLATE_LINK_SYMBOL is null");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolIsNotNull() {
            addCriterion("TEMPLATE_LINK_SYMBOL is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolEqualTo(String value) {
            addCriterion("TEMPLATE_LINK_SYMBOL =", value, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolNotEqualTo(String value) {
            addCriterion("TEMPLATE_LINK_SYMBOL <>", value, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolGreaterThan(String value) {
            addCriterion("TEMPLATE_LINK_SYMBOL >", value, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_LINK_SYMBOL >=", value, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolLessThan(String value) {
            addCriterion("TEMPLATE_LINK_SYMBOL <", value, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_LINK_SYMBOL <=", value, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolLike(String value) {
            addCriterion("TEMPLATE_LINK_SYMBOL like", value, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolNotLike(String value) {
            addCriterion("TEMPLATE_LINK_SYMBOL not like", value, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolIn(List<String> values) {
            addCriterion("TEMPLATE_LINK_SYMBOL in", values, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolNotIn(List<String> values) {
            addCriterion("TEMPLATE_LINK_SYMBOL not in", values, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolBetween(String value1, String value2) {
            addCriterion("TEMPLATE_LINK_SYMBOL between", value1, value2, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateLinkSymbolNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_LINK_SYMBOL not between", value1, value2, "templateLinkSymbol");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionIsNull() {
            addCriterion("TEMPLATE_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionIsNotNull() {
            addCriterion("TEMPLATE_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionEqualTo(String value) {
            addCriterion("TEMPLATE_CONDITION =", value, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionNotEqualTo(String value) {
            addCriterion("TEMPLATE_CONDITION <>", value, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionGreaterThan(String value) {
            addCriterion("TEMPLATE_CONDITION >", value, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_CONDITION >=", value, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionLessThan(String value) {
            addCriterion("TEMPLATE_CONDITION <", value, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_CONDITION <=", value, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionLike(String value) {
            addCriterion("TEMPLATE_CONDITION like", value, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionNotLike(String value) {
            addCriterion("TEMPLATE_CONDITION not like", value, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionIn(List<String> values) {
            addCriterion("TEMPLATE_CONDITION in", values, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionNotIn(List<String> values) {
            addCriterion("TEMPLATE_CONDITION not in", values, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionBetween(String value1, String value2) {
            addCriterion("TEMPLATE_CONDITION between", value1, value2, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateConditionNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_CONDITION not between", value1, value2, "templateCondition");
            return (Criteria) this;
        }

        public Criteria andTemplateSortIsNull() {
            addCriterion("TEMPLATE_SORT is null");
            return (Criteria) this;
        }

        public Criteria andTemplateSortIsNotNull() {
            addCriterion("TEMPLATE_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateSortEqualTo(String value) {
            addCriterion("TEMPLATE_SORT =", value, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortNotEqualTo(String value) {
            addCriterion("TEMPLATE_SORT <>", value, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortGreaterThan(String value) {
            addCriterion("TEMPLATE_SORT >", value, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_SORT >=", value, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortLessThan(String value) {
            addCriterion("TEMPLATE_SORT <", value, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_SORT <=", value, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortLike(String value) {
            addCriterion("TEMPLATE_SORT like", value, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortNotLike(String value) {
            addCriterion("TEMPLATE_SORT not like", value, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortIn(List<String> values) {
            addCriterion("TEMPLATE_SORT in", values, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortNotIn(List<String> values) {
            addCriterion("TEMPLATE_SORT not in", values, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortBetween(String value1, String value2) {
            addCriterion("TEMPLATE_SORT between", value1, value2, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateSortNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_SORT not between", value1, value2, "templateSort");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(BigDecimal value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(BigDecimal value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdIsNull() {
            addCriterion("TEMPLATE_ENTITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdIsNotNull() {
            addCriterion("TEMPLATE_ENTITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ENTITY_ID =", value, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdNotEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ENTITY_ID <>", value, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdGreaterThan(BigDecimal value) {
            addCriterion("TEMPLATE_ENTITY_ID >", value, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ENTITY_ID >=", value, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdLessThan(BigDecimal value) {
            addCriterion("TEMPLATE_ENTITY_ID <", value, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ENTITY_ID <=", value, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_ENTITY_ID in", values, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdNotIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_ENTITY_ID not in", values, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_ENTITY_ID between", value1, value2, "templateEntityId");
            return (Criteria) this;
        }

        public Criteria andTemplateEntityIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_ENTITY_ID not between", value1, value2, "templateEntityId");
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