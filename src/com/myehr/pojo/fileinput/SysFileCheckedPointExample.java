package com.myehr.pojo.fileinput;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFileCheckedPointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFileCheckedPointExample() {
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

        public Criteria andCheckedIdIsNull() {
            addCriterion("CHECKED_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIdIsNotNull() {
            addCriterion("CHECKED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedIdEqualTo(BigDecimal value) {
            addCriterion("CHECKED_ID =", value, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdNotEqualTo(BigDecimal value) {
            addCriterion("CHECKED_ID <>", value, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdGreaterThan(BigDecimal value) {
            addCriterion("CHECKED_ID >", value, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKED_ID >=", value, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdLessThan(BigDecimal value) {
            addCriterion("CHECKED_ID <", value, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHECKED_ID <=", value, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdIn(List<BigDecimal> values) {
            addCriterion("CHECKED_ID in", values, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdNotIn(List<BigDecimal> values) {
            addCriterion("CHECKED_ID not in", values, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKED_ID between", value1, value2, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHECKED_ID not between", value1, value2, "checkedId");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireIsNull() {
            addCriterion("CHECKED_REQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireIsNotNull() {
            addCriterion("CHECKED_REQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireEqualTo(String value) {
            addCriterion("CHECKED_REQUIRE =", value, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireNotEqualTo(String value) {
            addCriterion("CHECKED_REQUIRE <>", value, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireGreaterThan(String value) {
            addCriterion("CHECKED_REQUIRE >", value, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKED_REQUIRE >=", value, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireLessThan(String value) {
            addCriterion("CHECKED_REQUIRE <", value, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireLessThanOrEqualTo(String value) {
            addCriterion("CHECKED_REQUIRE <=", value, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireLike(String value) {
            addCriterion("CHECKED_REQUIRE like", value, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireNotLike(String value) {
            addCriterion("CHECKED_REQUIRE not like", value, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireIn(List<String> values) {
            addCriterion("CHECKED_REQUIRE in", values, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireNotIn(List<String> values) {
            addCriterion("CHECKED_REQUIRE not in", values, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireBetween(String value1, String value2) {
            addCriterion("CHECKED_REQUIRE between", value1, value2, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andCheckedRequireNotBetween(String value1, String value2) {
            addCriterion("CHECKED_REQUIRE not between", value1, value2, "checkedRequire");
            return (Criteria) this;
        }

        public Criteria andIsAchieveIsNull() {
            addCriterion("IS_ACHIEVE is null");
            return (Criteria) this;
        }

        public Criteria andIsAchieveIsNotNull() {
            addCriterion("IS_ACHIEVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsAchieveEqualTo(String value) {
            addCriterion("IS_ACHIEVE =", value, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveNotEqualTo(String value) {
            addCriterion("IS_ACHIEVE <>", value, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveGreaterThan(String value) {
            addCriterion("IS_ACHIEVE >", value, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACHIEVE >=", value, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveLessThan(String value) {
            addCriterion("IS_ACHIEVE <", value, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveLessThanOrEqualTo(String value) {
            addCriterion("IS_ACHIEVE <=", value, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveLike(String value) {
            addCriterion("IS_ACHIEVE like", value, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveNotLike(String value) {
            addCriterion("IS_ACHIEVE not like", value, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveIn(List<String> values) {
            addCriterion("IS_ACHIEVE in", values, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveNotIn(List<String> values) {
            addCriterion("IS_ACHIEVE not in", values, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveBetween(String value1, String value2) {
            addCriterion("IS_ACHIEVE between", value1, value2, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andIsAchieveNotBetween(String value1, String value2) {
            addCriterion("IS_ACHIEVE not between", value1, value2, "isAchieve");
            return (Criteria) this;
        }

        public Criteria andCheckedContentIsNull() {
            addCriterion("CHECKED_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCheckedContentIsNotNull() {
            addCriterion("CHECKED_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedContentEqualTo(String value) {
            addCriterion("CHECKED_CONTENT =", value, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentNotEqualTo(String value) {
            addCriterion("CHECKED_CONTENT <>", value, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentGreaterThan(String value) {
            addCriterion("CHECKED_CONTENT >", value, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKED_CONTENT >=", value, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentLessThan(String value) {
            addCriterion("CHECKED_CONTENT <", value, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentLessThanOrEqualTo(String value) {
            addCriterion("CHECKED_CONTENT <=", value, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentLike(String value) {
            addCriterion("CHECKED_CONTENT like", value, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentNotLike(String value) {
            addCriterion("CHECKED_CONTENT not like", value, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentIn(List<String> values) {
            addCriterion("CHECKED_CONTENT in", values, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentNotIn(List<String> values) {
            addCriterion("CHECKED_CONTENT not in", values, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentBetween(String value1, String value2) {
            addCriterion("CHECKED_CONTENT between", value1, value2, "checkedContent");
            return (Criteria) this;
        }

        public Criteria andCheckedContentNotBetween(String value1, String value2) {
            addCriterion("CHECKED_CONTENT not between", value1, value2, "checkedContent");
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