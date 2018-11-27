package com.myehr.pojo.lang;

import java.util.ArrayList;
import java.util.List;

public class SysLangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLangExample() {
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

        public Criteria andLangCodeIsNull() {
            addCriterion("LANG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLangCodeIsNotNull() {
            addCriterion("LANG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLangCodeEqualTo(String value) {
            addCriterion("LANG_CODE =", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeNotEqualTo(String value) {
            addCriterion("LANG_CODE <>", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeGreaterThan(String value) {
            addCriterion("LANG_CODE >", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LANG_CODE >=", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeLessThan(String value) {
            addCriterion("LANG_CODE <", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeLessThanOrEqualTo(String value) {
            addCriterion("LANG_CODE <=", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeLike(String value) {
            addCriterion("LANG_CODE like", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeNotLike(String value) {
            addCriterion("LANG_CODE not like", value, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeIn(List<String> values) {
            addCriterion("LANG_CODE in", values, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeNotIn(List<String> values) {
            addCriterion("LANG_CODE not in", values, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeBetween(String value1, String value2) {
            addCriterion("LANG_CODE between", value1, value2, "langCode");
            return (Criteria) this;
        }

        public Criteria andLangCodeNotBetween(String value1, String value2) {
            addCriterion("LANG_CODE not between", value1, value2, "langCode");
            return (Criteria) this;
        }

        public Criteria andEnIsNull() {
            addCriterion("EN is null");
            return (Criteria) this;
        }

        public Criteria andEnIsNotNull() {
            addCriterion("EN is not null");
            return (Criteria) this;
        }

        public Criteria andEnEqualTo(String value) {
            addCriterion("EN =", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotEqualTo(String value) {
            addCriterion("EN <>", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnGreaterThan(String value) {
            addCriterion("EN >", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnGreaterThanOrEqualTo(String value) {
            addCriterion("EN >=", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnLessThan(String value) {
            addCriterion("EN <", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnLessThanOrEqualTo(String value) {
            addCriterion("EN <=", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnLike(String value) {
            addCriterion("EN like", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotLike(String value) {
            addCriterion("EN not like", value, "en");
            return (Criteria) this;
        }

        public Criteria andEnIn(List<String> values) {
            addCriterion("EN in", values, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotIn(List<String> values) {
            addCriterion("EN not in", values, "en");
            return (Criteria) this;
        }

        public Criteria andEnBetween(String value1, String value2) {
            addCriterion("EN between", value1, value2, "en");
            return (Criteria) this;
        }

        public Criteria andEnNotBetween(String value1, String value2) {
            addCriterion("EN not between", value1, value2, "en");
            return (Criteria) this;
        }

        public Criteria andZhIsNull() {
            addCriterion("ZH is null");
            return (Criteria) this;
        }

        public Criteria andZhIsNotNull() {
            addCriterion("ZH is not null");
            return (Criteria) this;
        }

        public Criteria andZhEqualTo(String value) {
            addCriterion("ZH =", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotEqualTo(String value) {
            addCriterion("ZH <>", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhGreaterThan(String value) {
            addCriterion("ZH >", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhGreaterThanOrEqualTo(String value) {
            addCriterion("ZH >=", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhLessThan(String value) {
            addCriterion("ZH <", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhLessThanOrEqualTo(String value) {
            addCriterion("ZH <=", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhLike(String value) {
            addCriterion("ZH like", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotLike(String value) {
            addCriterion("ZH not like", value, "zh");
            return (Criteria) this;
        }

        public Criteria andZhIn(List<String> values) {
            addCriterion("ZH in", values, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotIn(List<String> values) {
            addCriterion("ZH not in", values, "zh");
            return (Criteria) this;
        }

        public Criteria andZhBetween(String value1, String value2) {
            addCriterion("ZH between", value1, value2, "zh");
            return (Criteria) this;
        }

        public Criteria andZhNotBetween(String value1, String value2) {
            addCriterion("ZH not between", value1, value2, "zh");
            return (Criteria) this;
        }

        public Criteria andEucIsNull() {
            addCriterion("EUC is null");
            return (Criteria) this;
        }

        public Criteria andEucIsNotNull() {
            addCriterion("EUC is not null");
            return (Criteria) this;
        }

        public Criteria andEucEqualTo(String value) {
            addCriterion("EUC =", value, "euc");
            return (Criteria) this;
        }

        public Criteria andEucNotEqualTo(String value) {
            addCriterion("EUC <>", value, "euc");
            return (Criteria) this;
        }

        public Criteria andEucGreaterThan(String value) {
            addCriterion("EUC >", value, "euc");
            return (Criteria) this;
        }

        public Criteria andEucGreaterThanOrEqualTo(String value) {
            addCriterion("EUC >=", value, "euc");
            return (Criteria) this;
        }

        public Criteria andEucLessThan(String value) {
            addCriterion("EUC <", value, "euc");
            return (Criteria) this;
        }

        public Criteria andEucLessThanOrEqualTo(String value) {
            addCriterion("EUC <=", value, "euc");
            return (Criteria) this;
        }

        public Criteria andEucLike(String value) {
            addCriterion("EUC like", value, "euc");
            return (Criteria) this;
        }

        public Criteria andEucNotLike(String value) {
            addCriterion("EUC not like", value, "euc");
            return (Criteria) this;
        }

        public Criteria andEucIn(List<String> values) {
            addCriterion("EUC in", values, "euc");
            return (Criteria) this;
        }

        public Criteria andEucNotIn(List<String> values) {
            addCriterion("EUC not in", values, "euc");
            return (Criteria) this;
        }

        public Criteria andEucBetween(String value1, String value2) {
            addCriterion("EUC between", value1, value2, "euc");
            return (Criteria) this;
        }

        public Criteria andEucNotBetween(String value1, String value2) {
            addCriterion("EUC not between", value1, value2, "euc");
            return (Criteria) this;
        }

        public Criteria andBig5IsNull() {
            addCriterion("BIG5 is null");
            return (Criteria) this;
        }

        public Criteria andBig5IsNotNull() {
            addCriterion("BIG5 is not null");
            return (Criteria) this;
        }

        public Criteria andBig5EqualTo(String value) {
            addCriterion("BIG5 =", value, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5NotEqualTo(String value) {
            addCriterion("BIG5 <>", value, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5GreaterThan(String value) {
            addCriterion("BIG5 >", value, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5GreaterThanOrEqualTo(String value) {
            addCriterion("BIG5 >=", value, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5LessThan(String value) {
            addCriterion("BIG5 <", value, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5LessThanOrEqualTo(String value) {
            addCriterion("BIG5 <=", value, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5Like(String value) {
            addCriterion("BIG5 like", value, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5NotLike(String value) {
            addCriterion("BIG5 not like", value, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5In(List<String> values) {
            addCriterion("BIG5 in", values, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5NotIn(List<String> values) {
            addCriterion("BIG5 not in", values, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5Between(String value1, String value2) {
            addCriterion("BIG5 between", value1, value2, "big5");
            return (Criteria) this;
        }

        public Criteria andBig5NotBetween(String value1, String value2) {
            addCriterion("BIG5 not between", value1, value2, "big5");
            return (Criteria) this;
        }

        public Criteria andLangTypeIsNull() {
            addCriterion("LANG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLangTypeIsNotNull() {
            addCriterion("LANG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLangTypeEqualTo(String value) {
            addCriterion("LANG_TYPE =", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeNotEqualTo(String value) {
            addCriterion("LANG_TYPE <>", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeGreaterThan(String value) {
            addCriterion("LANG_TYPE >", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LANG_TYPE >=", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeLessThan(String value) {
            addCriterion("LANG_TYPE <", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeLessThanOrEqualTo(String value) {
            addCriterion("LANG_TYPE <=", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeLike(String value) {
            addCriterion("LANG_TYPE like", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeNotLike(String value) {
            addCriterion("LANG_TYPE not like", value, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeIn(List<String> values) {
            addCriterion("LANG_TYPE in", values, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeNotIn(List<String> values) {
            addCriterion("LANG_TYPE not in", values, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeBetween(String value1, String value2) {
            addCriterion("LANG_TYPE between", value1, value2, "langType");
            return (Criteria) this;
        }

        public Criteria andLangTypeNotBetween(String value1, String value2) {
            addCriterion("LANG_TYPE not between", value1, value2, "langType");
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