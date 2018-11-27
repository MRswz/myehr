package com.myehr.pojo.formmanage.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysActfreeHisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysActfreeHisExample() {
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

        public Criteria andAssigreeIsNull() {
            addCriterion("ASSIGREE is null");
            return (Criteria) this;
        }

        public Criteria andAssigreeIsNotNull() {
            addCriterion("ASSIGREE is not null");
            return (Criteria) this;
        }

        public Criteria andAssigreeEqualTo(String value) {
            addCriterion("ASSIGREE =", value, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeNotEqualTo(String value) {
            addCriterion("ASSIGREE <>", value, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeGreaterThan(String value) {
            addCriterion("ASSIGREE >", value, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGREE >=", value, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeLessThan(String value) {
            addCriterion("ASSIGREE <", value, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeLessThanOrEqualTo(String value) {
            addCriterion("ASSIGREE <=", value, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeLike(String value) {
            addCriterion("ASSIGREE like", value, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeNotLike(String value) {
            addCriterion("ASSIGREE not like", value, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeIn(List<String> values) {
            addCriterion("ASSIGREE in", values, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeNotIn(List<String> values) {
            addCriterion("ASSIGREE not in", values, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeBetween(String value1, String value2) {
            addCriterion("ASSIGREE between", value1, value2, "assigree");
            return (Criteria) this;
        }

        public Criteria andAssigreeNotBetween(String value1, String value2) {
            addCriterion("ASSIGREE not between", value1, value2, "assigree");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNextassigreeIsNull() {
            addCriterion("NEXTASSIGREE is null");
            return (Criteria) this;
        }

        public Criteria andNextassigreeIsNotNull() {
            addCriterion("NEXTASSIGREE is not null");
            return (Criteria) this;
        }

        public Criteria andNextassigreeEqualTo(String value) {
            addCriterion("NEXTASSIGREE =", value, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeNotEqualTo(String value) {
            addCriterion("NEXTASSIGREE <>", value, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeGreaterThan(String value) {
            addCriterion("NEXTASSIGREE >", value, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeGreaterThanOrEqualTo(String value) {
            addCriterion("NEXTASSIGREE >=", value, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeLessThan(String value) {
            addCriterion("NEXTASSIGREE <", value, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeLessThanOrEqualTo(String value) {
            addCriterion("NEXTASSIGREE <=", value, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeLike(String value) {
            addCriterion("NEXTASSIGREE like", value, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeNotLike(String value) {
            addCriterion("NEXTASSIGREE not like", value, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeIn(List<String> values) {
            addCriterion("NEXTASSIGREE in", values, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeNotIn(List<String> values) {
            addCriterion("NEXTASSIGREE not in", values, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeBetween(String value1, String value2) {
            addCriterion("NEXTASSIGREE between", value1, value2, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andNextassigreeNotBetween(String value1, String value2) {
            addCriterion("NEXTASSIGREE not between", value1, value2, "nextassigree");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andComentIsNull() {
            addCriterion("COMENT is null");
            return (Criteria) this;
        }

        public Criteria andComentIsNotNull() {
            addCriterion("COMENT is not null");
            return (Criteria) this;
        }

        public Criteria andComentEqualTo(String value) {
            addCriterion("COMENT =", value, "coment");
            return (Criteria) this;
        }

        public Criteria andComentNotEqualTo(String value) {
            addCriterion("COMENT <>", value, "coment");
            return (Criteria) this;
        }

        public Criteria andComentGreaterThan(String value) {
            addCriterion("COMENT >", value, "coment");
            return (Criteria) this;
        }

        public Criteria andComentGreaterThanOrEqualTo(String value) {
            addCriterion("COMENT >=", value, "coment");
            return (Criteria) this;
        }

        public Criteria andComentLessThan(String value) {
            addCriterion("COMENT <", value, "coment");
            return (Criteria) this;
        }

        public Criteria andComentLessThanOrEqualTo(String value) {
            addCriterion("COMENT <=", value, "coment");
            return (Criteria) this;
        }

        public Criteria andComentLike(String value) {
            addCriterion("COMENT like", value, "coment");
            return (Criteria) this;
        }

        public Criteria andComentNotLike(String value) {
            addCriterion("COMENT not like", value, "coment");
            return (Criteria) this;
        }

        public Criteria andComentIn(List<String> values) {
            addCriterion("COMENT in", values, "coment");
            return (Criteria) this;
        }

        public Criteria andComentNotIn(List<String> values) {
            addCriterion("COMENT not in", values, "coment");
            return (Criteria) this;
        }

        public Criteria andComentBetween(String value1, String value2) {
            addCriterion("COMENT between", value1, value2, "coment");
            return (Criteria) this;
        }

        public Criteria andComentNotBetween(String value1, String value2) {
            addCriterion("COMENT not between", value1, value2, "coment");
            return (Criteria) this;
        }

        public Criteria andStatusaIsNull() {
            addCriterion("STATUSA is null");
            return (Criteria) this;
        }

        public Criteria andStatusaIsNotNull() {
            addCriterion("STATUSA is not null");
            return (Criteria) this;
        }

        public Criteria andStatusaEqualTo(String value) {
            addCriterion("STATUSA =", value, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaNotEqualTo(String value) {
            addCriterion("STATUSA <>", value, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaGreaterThan(String value) {
            addCriterion("STATUSA >", value, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaGreaterThanOrEqualTo(String value) {
            addCriterion("STATUSA >=", value, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaLessThan(String value) {
            addCriterion("STATUSA <", value, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaLessThanOrEqualTo(String value) {
            addCriterion("STATUSA <=", value, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaLike(String value) {
            addCriterion("STATUSA like", value, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaNotLike(String value) {
            addCriterion("STATUSA not like", value, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaIn(List<String> values) {
            addCriterion("STATUSA in", values, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaNotIn(List<String> values) {
            addCriterion("STATUSA not in", values, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaBetween(String value1, String value2) {
            addCriterion("STATUSA between", value1, value2, "statusa");
            return (Criteria) this;
        }

        public Criteria andStatusaNotBetween(String value1, String value2) {
            addCriterion("STATUSA not between", value1, value2, "statusa");
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