package com.myehr.pojo.app.grid;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysAppClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysAppClassExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFontStyleIsNull() {
            addCriterion("FONT_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andFontStyleIsNotNull() {
            addCriterion("FONT_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andFontStyleEqualTo(String value) {
            addCriterion("FONT_STYLE =", value, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleNotEqualTo(String value) {
            addCriterion("FONT_STYLE <>", value, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleGreaterThan(String value) {
            addCriterion("FONT_STYLE >", value, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleGreaterThanOrEqualTo(String value) {
            addCriterion("FONT_STYLE >=", value, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleLessThan(String value) {
            addCriterion("FONT_STYLE <", value, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleLessThanOrEqualTo(String value) {
            addCriterion("FONT_STYLE <=", value, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleLike(String value) {
            addCriterion("FONT_STYLE like", value, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleNotLike(String value) {
            addCriterion("FONT_STYLE not like", value, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleIn(List<String> values) {
            addCriterion("FONT_STYLE in", values, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleNotIn(List<String> values) {
            addCriterion("FONT_STYLE not in", values, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleBetween(String value1, String value2) {
            addCriterion("FONT_STYLE between", value1, value2, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andFontStyleNotBetween(String value1, String value2) {
            addCriterion("FONT_STYLE not between", value1, value2, "fontStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleIsNull() {
            addCriterion("TAG_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andTagStyleIsNotNull() {
            addCriterion("TAG_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andTagStyleEqualTo(String value) {
            addCriterion("TAG_STYLE =", value, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleNotEqualTo(String value) {
            addCriterion("TAG_STYLE <>", value, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleGreaterThan(String value) {
            addCriterion("TAG_STYLE >", value, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleGreaterThanOrEqualTo(String value) {
            addCriterion("TAG_STYLE >=", value, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleLessThan(String value) {
            addCriterion("TAG_STYLE <", value, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleLessThanOrEqualTo(String value) {
            addCriterion("TAG_STYLE <=", value, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleLike(String value) {
            addCriterion("TAG_STYLE like", value, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleNotLike(String value) {
            addCriterion("TAG_STYLE not like", value, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleIn(List<String> values) {
            addCriterion("TAG_STYLE in", values, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleNotIn(List<String> values) {
            addCriterion("TAG_STYLE not in", values, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleBetween(String value1, String value2) {
            addCriterion("TAG_STYLE between", value1, value2, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andTagStyleNotBetween(String value1, String value2) {
            addCriterion("TAG_STYLE not between", value1, value2, "tagStyle");
            return (Criteria) this;
        }

        public Criteria andIsblodIsNull() {
            addCriterion("ISBLOD is null");
            return (Criteria) this;
        }

        public Criteria andIsblodIsNotNull() {
            addCriterion("ISBLOD is not null");
            return (Criteria) this;
        }

        public Criteria andIsblodEqualTo(String value) {
            addCriterion("ISBLOD =", value, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodNotEqualTo(String value) {
            addCriterion("ISBLOD <>", value, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodGreaterThan(String value) {
            addCriterion("ISBLOD >", value, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodGreaterThanOrEqualTo(String value) {
            addCriterion("ISBLOD >=", value, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodLessThan(String value) {
            addCriterion("ISBLOD <", value, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodLessThanOrEqualTo(String value) {
            addCriterion("ISBLOD <=", value, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodLike(String value) {
            addCriterion("ISBLOD like", value, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodNotLike(String value) {
            addCriterion("ISBLOD not like", value, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodIn(List<String> values) {
            addCriterion("ISBLOD in", values, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodNotIn(List<String> values) {
            addCriterion("ISBLOD not in", values, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodBetween(String value1, String value2) {
            addCriterion("ISBLOD between", value1, value2, "isblod");
            return (Criteria) this;
        }

        public Criteria andIsblodNotBetween(String value1, String value2) {
            addCriterion("ISBLOD not between", value1, value2, "isblod");
            return (Criteria) this;
        }

        public Criteria andIshiddenIsNull() {
            addCriterion("ISHIDDEN is null");
            return (Criteria) this;
        }

        public Criteria andIshiddenIsNotNull() {
            addCriterion("ISHIDDEN is not null");
            return (Criteria) this;
        }

        public Criteria andIshiddenEqualTo(String value) {
            addCriterion("ISHIDDEN =", value, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenNotEqualTo(String value) {
            addCriterion("ISHIDDEN <>", value, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenGreaterThan(String value) {
            addCriterion("ISHIDDEN >", value, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenGreaterThanOrEqualTo(String value) {
            addCriterion("ISHIDDEN >=", value, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenLessThan(String value) {
            addCriterion("ISHIDDEN <", value, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenLessThanOrEqualTo(String value) {
            addCriterion("ISHIDDEN <=", value, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenLike(String value) {
            addCriterion("ISHIDDEN like", value, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenNotLike(String value) {
            addCriterion("ISHIDDEN not like", value, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenIn(List<String> values) {
            addCriterion("ISHIDDEN in", values, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenNotIn(List<String> values) {
            addCriterion("ISHIDDEN not in", values, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenBetween(String value1, String value2) {
            addCriterion("ISHIDDEN between", value1, value2, "ishidden");
            return (Criteria) this;
        }

        public Criteria andIshiddenNotBetween(String value1, String value2) {
            addCriterion("ISHIDDEN not between", value1, value2, "ishidden");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdIsNull() {
            addCriterion("FORM_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdIsNotNull() {
            addCriterion("FORM_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID =", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID <>", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID >", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID >=", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdLessThan(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID <", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_COLUMN_ID <=", value, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_ID in", values, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_COLUMN_ID not in", values, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_ID between", value1, value2, "formColumnId");
            return (Criteria) this;
        }

        public Criteria andFormColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_COLUMN_ID not between", value1, value2, "formColumnId");
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