package com.myehr.pojo.formmanage.button;

import java.util.ArrayList;
import java.util.List;

public class SysMessagesendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMessagesendExample() {
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

        public Criteria andMessagetypeIsNull() {
            addCriterion("MESSAGETYPE is null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIsNotNull() {
            addCriterion("MESSAGETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetypeEqualTo(Integer value) {
            addCriterion("MESSAGETYPE =", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotEqualTo(Integer value) {
            addCriterion("MESSAGETYPE <>", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThan(Integer value) {
            addCriterion("MESSAGETYPE >", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MESSAGETYPE >=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThan(Integer value) {
            addCriterion("MESSAGETYPE <", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeLessThanOrEqualTo(Integer value) {
            addCriterion("MESSAGETYPE <=", value, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeIn(List<Integer> values) {
            addCriterion("MESSAGETYPE in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotIn(List<Integer> values) {
            addCriterion("MESSAGETYPE not in", values, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGETYPE between", value1, value2, "messagetype");
            return (Criteria) this;
        }

        public Criteria andMessagetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MESSAGETYPE not between", value1, value2, "messagetype");
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

        public Criteria andSendstatusIsNull() {
            addCriterion("SENDSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSendstatusIsNotNull() {
            addCriterion("SENDSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSendstatusEqualTo(Integer value) {
            addCriterion("SENDSTATUS =", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotEqualTo(Integer value) {
            addCriterion("SENDSTATUS <>", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThan(Integer value) {
            addCriterion("SENDSTATUS >", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("SENDSTATUS >=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThan(Integer value) {
            addCriterion("SENDSTATUS <", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusLessThanOrEqualTo(Integer value) {
            addCriterion("SENDSTATUS <=", value, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusIn(List<Integer> values) {
            addCriterion("SENDSTATUS in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotIn(List<Integer> values) {
            addCriterion("SENDSTATUS not in", values, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusBetween(Integer value1, Integer value2) {
            addCriterion("SENDSTATUS between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andSendstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("SENDSTATUS not between", value1, value2, "sendstatus");
            return (Criteria) this;
        }

        public Criteria andFalsereasonIsNull() {
            addCriterion("FALSEREASON is null");
            return (Criteria) this;
        }

        public Criteria andFalsereasonIsNotNull() {
            addCriterion("FALSEREASON is not null");
            return (Criteria) this;
        }

        public Criteria andFalsereasonEqualTo(String value) {
            addCriterion("FALSEREASON =", value, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonNotEqualTo(String value) {
            addCriterion("FALSEREASON <>", value, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonGreaterThan(String value) {
            addCriterion("FALSEREASON >", value, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonGreaterThanOrEqualTo(String value) {
            addCriterion("FALSEREASON >=", value, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonLessThan(String value) {
            addCriterion("FALSEREASON <", value, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonLessThanOrEqualTo(String value) {
            addCriterion("FALSEREASON <=", value, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonLike(String value) {
            addCriterion("FALSEREASON like", value, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonNotLike(String value) {
            addCriterion("FALSEREASON not like", value, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonIn(List<String> values) {
            addCriterion("FALSEREASON in", values, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonNotIn(List<String> values) {
            addCriterion("FALSEREASON not in", values, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonBetween(String value1, String value2) {
            addCriterion("FALSEREASON between", value1, value2, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFalsereasonNotBetween(String value1, String value2) {
            addCriterion("FALSEREASON not between", value1, value2, "falsereason");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNull() {
            addCriterion("FEEDBACK is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNotNull() {
            addCriterion("FEEDBACK is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackEqualTo(Integer value) {
            addCriterion("FEEDBACK =", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotEqualTo(Integer value) {
            addCriterion("FEEDBACK <>", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThan(Integer value) {
            addCriterion("FEEDBACK >", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThanOrEqualTo(Integer value) {
            addCriterion("FEEDBACK >=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThan(Integer value) {
            addCriterion("FEEDBACK <", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThanOrEqualTo(Integer value) {
            addCriterion("FEEDBACK <=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackIn(List<Integer> values) {
            addCriterion("FEEDBACK in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotIn(List<Integer> values) {
            addCriterion("FEEDBACK not in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackBetween(Integer value1, Integer value2) {
            addCriterion("FEEDBACK between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotBetween(Integer value1, Integer value2) {
            addCriterion("FEEDBACK not between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIsNull() {
            addCriterion("MESSAGETITLE is null");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIsNotNull() {
            addCriterion("MESSAGETITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMessagetitleEqualTo(String value) {
            addCriterion("MESSAGETITLE =", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotEqualTo(String value) {
            addCriterion("MESSAGETITLE <>", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleGreaterThan(String value) {
            addCriterion("MESSAGETITLE >", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleGreaterThanOrEqualTo(String value) {
            addCriterion("MESSAGETITLE >=", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLessThan(String value) {
            addCriterion("MESSAGETITLE <", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLessThanOrEqualTo(String value) {
            addCriterion("MESSAGETITLE <=", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleLike(String value) {
            addCriterion("MESSAGETITLE like", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotLike(String value) {
            addCriterion("MESSAGETITLE not like", value, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleIn(List<String> values) {
            addCriterion("MESSAGETITLE in", values, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotIn(List<String> values) {
            addCriterion("MESSAGETITLE not in", values, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleBetween(String value1, String value2) {
            addCriterion("MESSAGETITLE between", value1, value2, "messagetitle");
            return (Criteria) this;
        }

        public Criteria andMessagetitleNotBetween(String value1, String value2) {
            addCriterion("MESSAGETITLE not between", value1, value2, "messagetitle");
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