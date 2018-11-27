package com.myehr.pojo.formmanage.form;

import java.util.ArrayList;
import java.util.List;

public class SysActfreeWayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysActfreeWayExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("TASKID is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("TASKID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("TASKID =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("TASKID <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("TASKID >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("TASKID >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("TASKID <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("TASKID <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("TASKID like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("TASKID not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("TASKID in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("TASKID not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("TASKID between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("TASKID not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNull() {
            addCriterion("ORDERBY is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("ORDERBY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyEqualTo(String value) {
            addCriterion("ORDERBY =", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotEqualTo(String value) {
            addCriterion("ORDERBY <>", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThan(String value) {
            addCriterion("ORDERBY >", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERBY >=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThan(String value) {
            addCriterion("ORDERBY <", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(String value) {
            addCriterion("ORDERBY <=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLike(String value) {
            addCriterion("ORDERBY like", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotLike(String value) {
            addCriterion("ORDERBY not like", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyIn(List<String> values) {
            addCriterion("ORDERBY in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotIn(List<String> values) {
            addCriterion("ORDERBY not in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyBetween(String value1, String value2) {
            addCriterion("ORDERBY between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotBetween(String value1, String value2) {
            addCriterion("ORDERBY not between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("STEP is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("STEP is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(String value) {
            addCriterion("STEP =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(String value) {
            addCriterion("STEP <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(String value) {
            addCriterion("STEP >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(String value) {
            addCriterion("STEP >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(String value) {
            addCriterion("STEP <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(String value) {
            addCriterion("STEP <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLike(String value) {
            addCriterion("STEP like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotLike(String value) {
            addCriterion("STEP not like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<String> values) {
            addCriterion("STEP in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<String> values) {
            addCriterion("STEP not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(String value1, String value2) {
            addCriterion("STEP between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(String value1, String value2) {
            addCriterion("STEP not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andAssigreeidIsNull() {
            addCriterion("ASSIGREEID is null");
            return (Criteria) this;
        }

        public Criteria andAssigreeidIsNotNull() {
            addCriterion("ASSIGREEID is not null");
            return (Criteria) this;
        }

        public Criteria andAssigreeidEqualTo(String value) {
            addCriterion("ASSIGREEID =", value, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidNotEqualTo(String value) {
            addCriterion("ASSIGREEID <>", value, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidGreaterThan(String value) {
            addCriterion("ASSIGREEID >", value, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGREEID >=", value, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidLessThan(String value) {
            addCriterion("ASSIGREEID <", value, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidLessThanOrEqualTo(String value) {
            addCriterion("ASSIGREEID <=", value, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidLike(String value) {
            addCriterion("ASSIGREEID like", value, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidNotLike(String value) {
            addCriterion("ASSIGREEID not like", value, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidIn(List<String> values) {
            addCriterion("ASSIGREEID in", values, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidNotIn(List<String> values) {
            addCriterion("ASSIGREEID not in", values, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidBetween(String value1, String value2) {
            addCriterion("ASSIGREEID between", value1, value2, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andAssigreeidNotBetween(String value1, String value2) {
            addCriterion("ASSIGREEID not between", value1, value2, "assigreeid");
            return (Criteria) this;
        }

        public Criteria andExpandinfoIsNull() {
            addCriterion("EXPANDINFO is null");
            return (Criteria) this;
        }

        public Criteria andExpandinfoIsNotNull() {
            addCriterion("EXPANDINFO is not null");
            return (Criteria) this;
        }

        public Criteria andExpandinfoEqualTo(String value) {
            addCriterion("EXPANDINFO =", value, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoNotEqualTo(String value) {
            addCriterion("EXPANDINFO <>", value, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoGreaterThan(String value) {
            addCriterion("EXPANDINFO >", value, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoGreaterThanOrEqualTo(String value) {
            addCriterion("EXPANDINFO >=", value, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoLessThan(String value) {
            addCriterion("EXPANDINFO <", value, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoLessThanOrEqualTo(String value) {
            addCriterion("EXPANDINFO <=", value, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoLike(String value) {
            addCriterion("EXPANDINFO like", value, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoNotLike(String value) {
            addCriterion("EXPANDINFO not like", value, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoIn(List<String> values) {
            addCriterion("EXPANDINFO in", values, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoNotIn(List<String> values) {
            addCriterion("EXPANDINFO not in", values, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoBetween(String value1, String value2) {
            addCriterion("EXPANDINFO between", value1, value2, "expandinfo");
            return (Criteria) this;
        }

        public Criteria andExpandinfoNotBetween(String value1, String value2) {
            addCriterion("EXPANDINFO not between", value1, value2, "expandinfo");
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