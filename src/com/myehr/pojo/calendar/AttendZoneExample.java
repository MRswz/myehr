package com.myehr.pojo.calendar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AttendZoneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendZoneExample() {
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

        public Criteria andAzIdIsNull() {
            addCriterion("az_id is null");
            return (Criteria) this;
        }

        public Criteria andAzIdIsNotNull() {
            addCriterion("az_id is not null");
            return (Criteria) this;
        }

        public Criteria andAzIdEqualTo(Integer value) {
            addCriterion("az_id =", value, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdNotEqualTo(Integer value) {
            addCriterion("az_id <>", value, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdGreaterThan(Integer value) {
            addCriterion("az_id >", value, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("az_id >=", value, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdLessThan(Integer value) {
            addCriterion("az_id <", value, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdLessThanOrEqualTo(Integer value) {
            addCriterion("az_id <=", value, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdIn(List<Integer> values) {
            addCriterion("az_id in", values, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdNotIn(List<Integer> values) {
            addCriterion("az_id not in", values, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdBetween(Integer value1, Integer value2) {
            addCriterion("az_id between", value1, value2, "azId");
            return (Criteria) this;
        }

        public Criteria andAzIdNotBetween(Integer value1, Integer value2) {
            addCriterion("az_id not between", value1, value2, "azId");
            return (Criteria) this;
        }

        public Criteria andAzCnameIsNull() {
            addCriterion("az_cname is null");
            return (Criteria) this;
        }

        public Criteria andAzCnameIsNotNull() {
            addCriterion("az_cname is not null");
            return (Criteria) this;
        }

        public Criteria andAzCnameEqualTo(String value) {
            addCriterion("az_cname =", value, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameNotEqualTo(String value) {
            addCriterion("az_cname <>", value, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameGreaterThan(String value) {
            addCriterion("az_cname >", value, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameGreaterThanOrEqualTo(String value) {
            addCriterion("az_cname >=", value, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameLessThan(String value) {
            addCriterion("az_cname <", value, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameLessThanOrEqualTo(String value) {
            addCriterion("az_cname <=", value, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameLike(String value) {
            addCriterion("az_cname like", value, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameNotLike(String value) {
            addCriterion("az_cname not like", value, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameIn(List<String> values) {
            addCriterion("az_cname in", values, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameNotIn(List<String> values) {
            addCriterion("az_cname not in", values, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameBetween(String value1, String value2) {
            addCriterion("az_cname between", value1, value2, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzCnameNotBetween(String value1, String value2) {
            addCriterion("az_cname not between", value1, value2, "azCname");
            return (Criteria) this;
        }

        public Criteria andAzEnameIsNull() {
            addCriterion("az_ename is null");
            return (Criteria) this;
        }

        public Criteria andAzEnameIsNotNull() {
            addCriterion("az_ename is not null");
            return (Criteria) this;
        }

        public Criteria andAzEnameEqualTo(String value) {
            addCriterion("az_ename =", value, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameNotEqualTo(String value) {
            addCriterion("az_ename <>", value, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameGreaterThan(String value) {
            addCriterion("az_ename >", value, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameGreaterThanOrEqualTo(String value) {
            addCriterion("az_ename >=", value, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameLessThan(String value) {
            addCriterion("az_ename <", value, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameLessThanOrEqualTo(String value) {
            addCriterion("az_ename <=", value, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameLike(String value) {
            addCriterion("az_ename like", value, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameNotLike(String value) {
            addCriterion("az_ename not like", value, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameIn(List<String> values) {
            addCriterion("az_ename in", values, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameNotIn(List<String> values) {
            addCriterion("az_ename not in", values, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameBetween(String value1, String value2) {
            addCriterion("az_ename between", value1, value2, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzEnameNotBetween(String value1, String value2) {
            addCriterion("az_ename not between", value1, value2, "azEname");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatIsNull() {
            addCriterion("az_monthflat is null");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatIsNotNull() {
            addCriterion("az_monthflat is not null");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatEqualTo(Integer value) {
            addCriterion("az_monthflat =", value, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatNotEqualTo(Integer value) {
            addCriterion("az_monthflat <>", value, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatGreaterThan(Integer value) {
            addCriterion("az_monthflat >", value, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatGreaterThanOrEqualTo(Integer value) {
            addCriterion("az_monthflat >=", value, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatLessThan(Integer value) {
            addCriterion("az_monthflat <", value, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatLessThanOrEqualTo(Integer value) {
            addCriterion("az_monthflat <=", value, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatIn(List<Integer> values) {
            addCriterion("az_monthflat in", values, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatNotIn(List<Integer> values) {
            addCriterion("az_monthflat not in", values, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatBetween(Integer value1, Integer value2) {
            addCriterion("az_monthflat between", value1, value2, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzMonthflatNotBetween(Integer value1, Integer value2) {
            addCriterion("az_monthflat not between", value1, value2, "azMonthflat");
            return (Criteria) this;
        }

        public Criteria andAzBegindateIsNull() {
            addCriterion("az_begindate is null");
            return (Criteria) this;
        }

        public Criteria andAzBegindateIsNotNull() {
            addCriterion("az_begindate is not null");
            return (Criteria) this;
        }

        public Criteria andAzBegindateEqualTo(Integer value) {
            addCriterion("az_begindate =", value, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateNotEqualTo(Integer value) {
            addCriterion("az_begindate <>", value, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateGreaterThan(Integer value) {
            addCriterion("az_begindate >", value, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateGreaterThanOrEqualTo(Integer value) {
            addCriterion("az_begindate >=", value, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateLessThan(Integer value) {
            addCriterion("az_begindate <", value, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateLessThanOrEqualTo(Integer value) {
            addCriterion("az_begindate <=", value, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateIn(List<Integer> values) {
            addCriterion("az_begindate in", values, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateNotIn(List<Integer> values) {
            addCriterion("az_begindate not in", values, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateBetween(Integer value1, Integer value2) {
            addCriterion("az_begindate between", value1, value2, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzBegindateNotBetween(Integer value1, Integer value2) {
            addCriterion("az_begindate not between", value1, value2, "azBegindate");
            return (Criteria) this;
        }

        public Criteria andAzRemarkIsNull() {
            addCriterion("az_remark is null");
            return (Criteria) this;
        }

        public Criteria andAzRemarkIsNotNull() {
            addCriterion("az_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAzRemarkEqualTo(String value) {
            addCriterion("az_remark =", value, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkNotEqualTo(String value) {
            addCriterion("az_remark <>", value, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkGreaterThan(String value) {
            addCriterion("az_remark >", value, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("az_remark >=", value, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkLessThan(String value) {
            addCriterion("az_remark <", value, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkLessThanOrEqualTo(String value) {
            addCriterion("az_remark <=", value, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkLike(String value) {
            addCriterion("az_remark like", value, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkNotLike(String value) {
            addCriterion("az_remark not like", value, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkIn(List<String> values) {
            addCriterion("az_remark in", values, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkNotIn(List<String> values) {
            addCriterion("az_remark not in", values, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkBetween(String value1, String value2) {
            addCriterion("az_remark between", value1, value2, "azRemark");
            return (Criteria) this;
        }

        public Criteria andAzRemarkNotBetween(String value1, String value2) {
            addCriterion("az_remark not between", value1, value2, "azRemark");
            return (Criteria) this;
        }

        public Criteria andOtmodeIsNull() {
            addCriterion("otmode is null");
            return (Criteria) this;
        }

        public Criteria andOtmodeIsNotNull() {
            addCriterion("otmode is not null");
            return (Criteria) this;
        }

        public Criteria andOtmodeEqualTo(BigDecimal value) {
            addCriterion("otmode =", value, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeNotEqualTo(BigDecimal value) {
            addCriterion("otmode <>", value, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeGreaterThan(BigDecimal value) {
            addCriterion("otmode >", value, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("otmode >=", value, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeLessThan(BigDecimal value) {
            addCriterion("otmode <", value, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("otmode <=", value, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeIn(List<BigDecimal> values) {
            addCriterion("otmode in", values, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeNotIn(List<BigDecimal> values) {
            addCriterion("otmode not in", values, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("otmode between", value1, value2, "otmode");
            return (Criteria) this;
        }

        public Criteria andOtmodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("otmode not between", value1, value2, "otmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeIsNull() {
            addCriterion("cotmode is null");
            return (Criteria) this;
        }

        public Criteria andCotmodeIsNotNull() {
            addCriterion("cotmode is not null");
            return (Criteria) this;
        }

        public Criteria andCotmodeEqualTo(BigDecimal value) {
            addCriterion("cotmode =", value, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeNotEqualTo(BigDecimal value) {
            addCriterion("cotmode <>", value, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeGreaterThan(BigDecimal value) {
            addCriterion("cotmode >", value, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cotmode >=", value, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeLessThan(BigDecimal value) {
            addCriterion("cotmode <", value, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cotmode <=", value, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeIn(List<BigDecimal> values) {
            addCriterion("cotmode in", values, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeNotIn(List<BigDecimal> values) {
            addCriterion("cotmode not in", values, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cotmode between", value1, value2, "cotmode");
            return (Criteria) this;
        }

        public Criteria andCotmodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cotmode not between", value1, value2, "cotmode");
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