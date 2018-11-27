package com.myehr.pojo.formmanage.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysActfreeModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysActfreeModelExample() {
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

        public Criteria andModelidIsNull() {
            addCriterion("MODELID is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("MODELID is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(String value) {
            addCriterion("MODELID =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(String value) {
            addCriterion("MODELID <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(String value) {
            addCriterion("MODELID >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(String value) {
            addCriterion("MODELID >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(String value) {
            addCriterion("MODELID <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(String value) {
            addCriterion("MODELID <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLike(String value) {
            addCriterion("MODELID like", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotLike(String value) {
            addCriterion("MODELID not like", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<String> values) {
            addCriterion("MODELID in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<String> values) {
            addCriterion("MODELID not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(String value1, String value2) {
            addCriterion("MODELID between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(String value1, String value2) {
            addCriterion("MODELID not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelkeyIsNull() {
            addCriterion("MODELKEY is null");
            return (Criteria) this;
        }

        public Criteria andModelkeyIsNotNull() {
            addCriterion("MODELKEY is not null");
            return (Criteria) this;
        }

        public Criteria andModelkeyEqualTo(String value) {
            addCriterion("MODELKEY =", value, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyNotEqualTo(String value) {
            addCriterion("MODELKEY <>", value, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyGreaterThan(String value) {
            addCriterion("MODELKEY >", value, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyGreaterThanOrEqualTo(String value) {
            addCriterion("MODELKEY >=", value, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyLessThan(String value) {
            addCriterion("MODELKEY <", value, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyLessThanOrEqualTo(String value) {
            addCriterion("MODELKEY <=", value, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyLike(String value) {
            addCriterion("MODELKEY like", value, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyNotLike(String value) {
            addCriterion("MODELKEY not like", value, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyIn(List<String> values) {
            addCriterion("MODELKEY in", values, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyNotIn(List<String> values) {
            addCriterion("MODELKEY not in", values, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyBetween(String value1, String value2) {
            addCriterion("MODELKEY between", value1, value2, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelkeyNotBetween(String value1, String value2) {
            addCriterion("MODELKEY not between", value1, value2, "modelkey");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNull() {
            addCriterion("MODELNAME is null");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNotNull() {
            addCriterion("MODELNAME is not null");
            return (Criteria) this;
        }

        public Criteria andModelnameEqualTo(String value) {
            addCriterion("MODELNAME =", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotEqualTo(String value) {
            addCriterion("MODELNAME <>", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThan(String value) {
            addCriterion("MODELNAME >", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("MODELNAME >=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThan(String value) {
            addCriterion("MODELNAME <", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThanOrEqualTo(String value) {
            addCriterion("MODELNAME <=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLike(String value) {
            addCriterion("MODELNAME like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotLike(String value) {
            addCriterion("MODELNAME not like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameIn(List<String> values) {
            addCriterion("MODELNAME in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotIn(List<String> values) {
            addCriterion("MODELNAME not in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameBetween(String value1, String value2) {
            addCriterion("MODELNAME between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotBetween(String value1, String value2) {
            addCriterion("MODELNAME not between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andFormidIsNull() {
            addCriterion("FORMID is null");
            return (Criteria) this;
        }

        public Criteria andFormidIsNotNull() {
            addCriterion("FORMID is not null");
            return (Criteria) this;
        }

        public Criteria andFormidEqualTo(String value) {
            addCriterion("FORMID =", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotEqualTo(String value) {
            addCriterion("FORMID <>", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThan(String value) {
            addCriterion("FORMID >", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThanOrEqualTo(String value) {
            addCriterion("FORMID >=", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLessThan(String value) {
            addCriterion("FORMID <", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLessThanOrEqualTo(String value) {
            addCriterion("FORMID <=", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLike(String value) {
            addCriterion("FORMID like", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotLike(String value) {
            addCriterion("FORMID not like", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidIn(List<String> values) {
            addCriterion("FORMID in", values, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotIn(List<String> values) {
            addCriterion("FORMID not in", values, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidBetween(String value1, String value2) {
            addCriterion("FORMID between", value1, value2, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotBetween(String value1, String value2) {
            addCriterion("FORMID not between", value1, value2, "formid");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNull() {
            addCriterion("MODELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNotNull() {
            addCriterion("MODELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andModeltypeEqualTo(String value) {
            addCriterion("MODELTYPE =", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotEqualTo(String value) {
            addCriterion("MODELTYPE <>", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThan(String value) {
            addCriterion("MODELTYPE >", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThanOrEqualTo(String value) {
            addCriterion("MODELTYPE >=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThan(String value) {
            addCriterion("MODELTYPE <", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThanOrEqualTo(String value) {
            addCriterion("MODELTYPE <=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLike(String value) {
            addCriterion("MODELTYPE like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotLike(String value) {
            addCriterion("MODELTYPE not like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeIn(List<String> values) {
            addCriterion("MODELTYPE in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotIn(List<String> values) {
            addCriterion("MODELTYPE not in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeBetween(String value1, String value2) {
            addCriterion("MODELTYPE between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotBetween(String value1, String value2) {
            addCriterion("MODELTYPE not between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNull() {
            addCriterion("CREATENAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatenameIsNotNull() {
            addCriterion("CREATENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatenameEqualTo(String value) {
            addCriterion("CREATENAME =", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotEqualTo(String value) {
            addCriterion("CREATENAME <>", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThan(String value) {
            addCriterion("CREATENAME >", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATENAME >=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThan(String value) {
            addCriterion("CREATENAME <", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLessThanOrEqualTo(String value) {
            addCriterion("CREATENAME <=", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameLike(String value) {
            addCriterion("CREATENAME like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotLike(String value) {
            addCriterion("CREATENAME not like", value, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameIn(List<String> values) {
            addCriterion("CREATENAME in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotIn(List<String> values) {
            addCriterion("CREATENAME not in", values, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameBetween(String value1, String value2) {
            addCriterion("CREATENAME between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatenameNotBetween(String value1, String value2) {
            addCriterion("CREATENAME not between", value1, value2, "createname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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