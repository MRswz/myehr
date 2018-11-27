package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysFormButtonIntrDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonIntrDetailExample() {
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

        public Criteria andIntrDetailIdIsNull() {
            addCriterion("INTR_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdIsNotNull() {
            addCriterion("INTR_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdEqualTo(BigDecimal value) {
            addCriterion("INTR_DETAIL_ID =", value, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdNotEqualTo(BigDecimal value) {
            addCriterion("INTR_DETAIL_ID <>", value, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdGreaterThan(BigDecimal value) {
            addCriterion("INTR_DETAIL_ID >", value, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTR_DETAIL_ID >=", value, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdLessThan(BigDecimal value) {
            addCriterion("INTR_DETAIL_ID <", value, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTR_DETAIL_ID <=", value, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdIn(List<BigDecimal> values) {
            addCriterion("INTR_DETAIL_ID in", values, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdNotIn(List<BigDecimal> values) {
            addCriterion("INTR_DETAIL_ID not in", values, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTR_DETAIL_ID between", value1, value2, "intrDetailId");
            return (Criteria) this;
        }

        public Criteria andIntrDetailIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTR_DETAIL_ID not between", value1, value2, "intrDetailId");
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

        public Criteria andTargetColumnIdIsNull() {
            addCriterion("TARGET_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdIsNotNull() {
            addCriterion("TARGET_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdEqualTo(String value) {
            addCriterion("TARGET_COLUMN_ID =", value, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdNotEqualTo(String value) {
            addCriterion("TARGET_COLUMN_ID <>", value, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdGreaterThan(String value) {
            addCriterion("TARGET_COLUMN_ID >", value, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_COLUMN_ID >=", value, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdLessThan(String value) {
            addCriterion("TARGET_COLUMN_ID <", value, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdLessThanOrEqualTo(String value) {
            addCriterion("TARGET_COLUMN_ID <=", value, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdLike(String value) {
            addCriterion("TARGET_COLUMN_ID like", value, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdNotLike(String value) {
            addCriterion("TARGET_COLUMN_ID not like", value, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdIn(List<String> values) {
            addCriterion("TARGET_COLUMN_ID in", values, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdNotIn(List<String> values) {
            addCriterion("TARGET_COLUMN_ID not in", values, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdBetween(String value1, String value2) {
            addCriterion("TARGET_COLUMN_ID between", value1, value2, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnIdNotBetween(String value1, String value2) {
            addCriterion("TARGET_COLUMN_ID not between", value1, value2, "targetColumnId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdIsNull() {
            addCriterion("INTRODUCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdIsNotNull() {
            addCriterion("INTRODUCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdEqualTo(BigDecimal value) {
            addCriterion("INTRODUCE_ID =", value, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdNotEqualTo(BigDecimal value) {
            addCriterion("INTRODUCE_ID <>", value, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdGreaterThan(BigDecimal value) {
            addCriterion("INTRODUCE_ID >", value, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTRODUCE_ID >=", value, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdLessThan(BigDecimal value) {
            addCriterion("INTRODUCE_ID <", value, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTRODUCE_ID <=", value, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdIn(List<BigDecimal> values) {
            addCriterion("INTRODUCE_ID in", values, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdNotIn(List<BigDecimal> values) {
            addCriterion("INTRODUCE_ID not in", values, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTRODUCE_ID between", value1, value2, "introduceId");
            return (Criteria) this;
        }

        public Criteria andIntroduceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTRODUCE_ID not between", value1, value2, "introduceId");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeIsNull() {
            addCriterion("TARGET_COLUMN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeIsNotNull() {
            addCriterion("TARGET_COLUMN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeEqualTo(String value) {
            addCriterion("TARGET_COLUMN_TYPE =", value, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeNotEqualTo(String value) {
            addCriterion("TARGET_COLUMN_TYPE <>", value, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeGreaterThan(String value) {
            addCriterion("TARGET_COLUMN_TYPE >", value, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TARGET_COLUMN_TYPE >=", value, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeLessThan(String value) {
            addCriterion("TARGET_COLUMN_TYPE <", value, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeLessThanOrEqualTo(String value) {
            addCriterion("TARGET_COLUMN_TYPE <=", value, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeLike(String value) {
            addCriterion("TARGET_COLUMN_TYPE like", value, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeNotLike(String value) {
            addCriterion("TARGET_COLUMN_TYPE not like", value, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeIn(List<String> values) {
            addCriterion("TARGET_COLUMN_TYPE in", values, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeNotIn(List<String> values) {
            addCriterion("TARGET_COLUMN_TYPE not in", values, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeBetween(String value1, String value2) {
            addCriterion("TARGET_COLUMN_TYPE between", value1, value2, "targetColumnType");
            return (Criteria) this;
        }

        public Criteria andTargetColumnTypeNotBetween(String value1, String value2) {
            addCriterion("TARGET_COLUMN_TYPE not between", value1, value2, "targetColumnType");
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