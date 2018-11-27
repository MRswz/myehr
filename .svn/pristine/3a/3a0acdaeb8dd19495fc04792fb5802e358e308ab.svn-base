package com.myehr.pojo.calendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KcalendarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KcalendarExample() {
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

        public Criteria andKguidIsNull() {
            addCriterion("kguid is null");
            return (Criteria) this;
        }

        public Criteria andKguidIsNotNull() {
            addCriterion("kguid is not null");
            return (Criteria) this;
        }

        public Criteria andKguidEqualTo(String value) {
            addCriterion("kguid =", value, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidNotEqualTo(String value) {
            addCriterion("kguid <>", value, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidGreaterThan(String value) {
            addCriterion("kguid >", value, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidGreaterThanOrEqualTo(String value) {
            addCriterion("kguid >=", value, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidLessThan(String value) {
            addCriterion("kguid <", value, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidLessThanOrEqualTo(String value) {
            addCriterion("kguid <=", value, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidLike(String value) {
            addCriterion("kguid like", value, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidNotLike(String value) {
            addCriterion("kguid not like", value, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidIn(List<String> values) {
            addCriterion("kguid in", values, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidNotIn(List<String> values) {
            addCriterion("kguid not in", values, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidBetween(String value1, String value2) {
            addCriterion("kguid between", value1, value2, "kguid");
            return (Criteria) this;
        }

        public Criteria andKguidNotBetween(String value1, String value2) {
            addCriterion("kguid not between", value1, value2, "kguid");
            return (Criteria) this;
        }

        public Criteria andItemDateIsNull() {
            addCriterion("Item_date is null");
            return (Criteria) this;
        }

        public Criteria andItemDateIsNotNull() {
            addCriterion("Item_date is not null");
            return (Criteria) this;
        }

        public Criteria andItemDateEqualTo(Date value) {
            addCriterion("Item_date =", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotEqualTo(Date value) {
            addCriterion("Item_date <>", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateGreaterThan(Date value) {
            addCriterion("Item_date >", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateGreaterThanOrEqualTo(Date value) {
            addCriterion("Item_date >=", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateLessThan(Date value) {
            addCriterion("Item_date <", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateLessThanOrEqualTo(Date value) {
            addCriterion("Item_date <=", value, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateIn(List<Date> values) {
            addCriterion("Item_date in", values, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotIn(List<Date> values) {
            addCriterion("Item_date not in", values, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateBetween(Date value1, Date value2) {
            addCriterion("Item_date between", value1, value2, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemDateNotBetween(Date value1, Date value2) {
            addCriterion("Item_date not between", value1, value2, "itemDate");
            return (Criteria) this;
        }

        public Criteria andItemCaptionIsNull() {
            addCriterion("Item_Caption is null");
            return (Criteria) this;
        }

        public Criteria andItemCaptionIsNotNull() {
            addCriterion("Item_Caption is not null");
            return (Criteria) this;
        }

        public Criteria andItemCaptionEqualTo(String value) {
            addCriterion("Item_Caption =", value, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionNotEqualTo(String value) {
            addCriterion("Item_Caption <>", value, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionGreaterThan(String value) {
            addCriterion("Item_Caption >", value, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("Item_Caption >=", value, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionLessThan(String value) {
            addCriterion("Item_Caption <", value, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionLessThanOrEqualTo(String value) {
            addCriterion("Item_Caption <=", value, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionLike(String value) {
            addCriterion("Item_Caption like", value, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionNotLike(String value) {
            addCriterion("Item_Caption not like", value, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionIn(List<String> values) {
            addCriterion("Item_Caption in", values, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionNotIn(List<String> values) {
            addCriterion("Item_Caption not in", values, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionBetween(String value1, String value2) {
            addCriterion("Item_Caption between", value1, value2, "itemCaption");
            return (Criteria) this;
        }

        public Criteria andItemCaptionNotBetween(String value1, String value2) {
            addCriterion("Item_Caption not between", value1, value2, "itemCaption");
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