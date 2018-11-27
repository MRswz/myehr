package com.myehr.pojo.app.im;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysImMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysImMessageExample() {
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

        public Criteria andSendtoIsNull() {
            addCriterion("SENDTO is null");
            return (Criteria) this;
        }

        public Criteria andSendtoIsNotNull() {
            addCriterion("SENDTO is not null");
            return (Criteria) this;
        }

        public Criteria andSendtoEqualTo(String value) {
            addCriterion("SENDTO =", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoNotEqualTo(String value) {
            addCriterion("SENDTO <>", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoGreaterThan(String value) {
            addCriterion("SENDTO >", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoGreaterThanOrEqualTo(String value) {
            addCriterion("SENDTO >=", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoLessThan(String value) {
            addCriterion("SENDTO <", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoLessThanOrEqualTo(String value) {
            addCriterion("SENDTO <=", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoLike(String value) {
            addCriterion("SENDTO like", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoNotLike(String value) {
            addCriterion("SENDTO not like", value, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoIn(List<String> values) {
            addCriterion("SENDTO in", values, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoNotIn(List<String> values) {
            addCriterion("SENDTO not in", values, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoBetween(String value1, String value2) {
            addCriterion("SENDTO between", value1, value2, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendtoNotBetween(String value1, String value2) {
            addCriterion("SENDTO not between", value1, value2, "sendto");
            return (Criteria) this;
        }

        public Criteria andSendfromIsNull() {
            addCriterion("SENDFROM is null");
            return (Criteria) this;
        }

        public Criteria andSendfromIsNotNull() {
            addCriterion("SENDFROM is not null");
            return (Criteria) this;
        }

        public Criteria andSendfromEqualTo(String value) {
            addCriterion("SENDFROM =", value, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromNotEqualTo(String value) {
            addCriterion("SENDFROM <>", value, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromGreaterThan(String value) {
            addCriterion("SENDFROM >", value, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromGreaterThanOrEqualTo(String value) {
            addCriterion("SENDFROM >=", value, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromLessThan(String value) {
            addCriterion("SENDFROM <", value, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromLessThanOrEqualTo(String value) {
            addCriterion("SENDFROM <=", value, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromLike(String value) {
            addCriterion("SENDFROM like", value, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromNotLike(String value) {
            addCriterion("SENDFROM not like", value, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromIn(List<String> values) {
            addCriterion("SENDFROM in", values, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromNotIn(List<String> values) {
            addCriterion("SENDFROM not in", values, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromBetween(String value1, String value2) {
            addCriterion("SENDFROM between", value1, value2, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andSendfromNotBetween(String value1, String value2) {
            addCriterion("SENDFROM not between", value1, value2, "sendfrom");
            return (Criteria) this;
        }

        public Criteria andMessagetextIsNull() {
            addCriterion("MESSAGETEXT is null");
            return (Criteria) this;
        }

        public Criteria andMessagetextIsNotNull() {
            addCriterion("MESSAGETEXT is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetextEqualTo(String value) {
            addCriterion("MESSAGETEXT =", value, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextNotEqualTo(String value) {
            addCriterion("MESSAGETEXT <>", value, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextGreaterThan(String value) {
            addCriterion("MESSAGETEXT >", value, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGETEXT >=", value, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextLessThan(String value) {
            addCriterion("MESSAGETEXT <", value, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextLessThanOrEqualTo(String value) {
            addCriterion("MESSAGETEXT <=", value, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextLike(String value) {
            addCriterion("MESSAGETEXT like", value, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextNotLike(String value) {
            addCriterion("MESSAGETEXT not like", value, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextIn(List<String> values) {
            addCriterion("MESSAGETEXT in", values, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextNotIn(List<String> values) {
            addCriterion("MESSAGETEXT not in", values, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextBetween(String value1, String value2) {
            addCriterion("MESSAGETEXT between", value1, value2, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetextNotBetween(String value1, String value2) {
            addCriterion("MESSAGETEXT not between", value1, value2, "messagetext");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNull() {
            addCriterion("MESSAGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNotNull() {
            addCriterion("MESSAGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeEqualTo(String value) {
            addCriterion("MESSAGETYPE =", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotEqualTo(String value) {
            addCriterion("MESSAGETYPE <>", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThan(String value) {
            addCriterion("MESSAGETYPE >", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGETYPE >=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThan(String value) {
            addCriterion("MESSAGETYPE <", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThanOrEqualTo(String value) {
            addCriterion("MESSAGETYPE <=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLike(String value) {
            addCriterion("MESSAGETYPE like", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotLike(String value) {
            addCriterion("MESSAGETYPE not like", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIn(List<String> values) {
            addCriterion("MESSAGETYPE in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotIn(List<String> values) {
            addCriterion("MESSAGETYPE not in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeBetween(String value1, String value2) {
            addCriterion("MESSAGETYPE between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotBetween(String value1, String value2) {
            addCriterion("MESSAGETYPE not between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andSenddateIsNull() {
            addCriterion("SENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andSenddateIsNotNull() {
            addCriterion("SENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSenddateEqualTo(Date value) {
            addCriterion("SENDDATE =", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotEqualTo(Date value) {
            addCriterion("SENDDATE <>", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateGreaterThan(Date value) {
            addCriterion("SENDDATE >", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("SENDDATE >=", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateLessThan(Date value) {
            addCriterion("SENDDATE <", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateLessThanOrEqualTo(Date value) {
            addCriterion("SENDDATE <=", value, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateIn(List<Date> values) {
            addCriterion("SENDDATE in", values, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotIn(List<Date> values) {
            addCriterion("SENDDATE not in", values, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateBetween(Date value1, Date value2) {
            addCriterion("SENDDATE between", value1, value2, "senddate");
            return (Criteria) this;
        }

        public Criteria andSenddateNotBetween(Date value1, Date value2) {
            addCriterion("SENDDATE not between", value1, value2, "senddate");
            return (Criteria) this;
        }

        public Criteria andIsreadedIsNull() {
            addCriterion("ISREADED is null");
            return (Criteria) this;
        }

        public Criteria andIsreadedIsNotNull() {
            addCriterion("ISREADED is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadedEqualTo(String value) {
            addCriterion("ISREADED =", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedNotEqualTo(String value) {
            addCriterion("ISREADED <>", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedGreaterThan(String value) {
            addCriterion("ISREADED >", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedGreaterThanOrEqualTo(String value) {
            addCriterion("ISREADED >=", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedLessThan(String value) {
            addCriterion("ISREADED <", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedLessThanOrEqualTo(String value) {
            addCriterion("ISREADED <=", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedLike(String value) {
            addCriterion("ISREADED like", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedNotLike(String value) {
            addCriterion("ISREADED not like", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedIn(List<String> values) {
            addCriterion("ISREADED in", values, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedNotIn(List<String> values) {
            addCriterion("ISREADED not in", values, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedBetween(String value1, String value2) {
            addCriterion("ISREADED between", value1, value2, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedNotBetween(String value1, String value2) {
            addCriterion("ISREADED not between", value1, value2, "isreaded");
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