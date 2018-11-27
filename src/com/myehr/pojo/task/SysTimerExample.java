package com.myehr.pojo.task;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysTimerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTimerExample() {
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

        public Criteria andSysTimerIdIsNull() {
            addCriterion("sys_timer_id is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdIsNotNull() {
            addCriterion("sys_timer_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdEqualTo(Long value) {
            addCriterion("sys_timer_id =", value, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdNotEqualTo(Long value) {
            addCriterion("sys_timer_id <>", value, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdGreaterThan(Long value) {
            addCriterion("sys_timer_id >", value, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sys_timer_id >=", value, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdLessThan(Long value) {
            addCriterion("sys_timer_id <", value, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdLessThanOrEqualTo(Long value) {
            addCriterion("sys_timer_id <=", value, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdIn(List<Long> values) {
            addCriterion("sys_timer_id in", values, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdNotIn(List<Long> values) {
            addCriterion("sys_timer_id not in", values, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdBetween(Long value1, Long value2) {
            addCriterion("sys_timer_id between", value1, value2, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerIdNotBetween(Long value1, Long value2) {
            addCriterion("sys_timer_id not between", value1, value2, "sysTimerId");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeIsNull() {
            addCriterion("sys_timer_type is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeIsNotNull() {
            addCriterion("sys_timer_type is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeEqualTo(String value) {
            addCriterion("sys_timer_type =", value, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeNotEqualTo(String value) {
            addCriterion("sys_timer_type <>", value, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeGreaterThan(String value) {
            addCriterion("sys_timer_type >", value, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_timer_type >=", value, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeLessThan(String value) {
            addCriterion("sys_timer_type <", value, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeLessThanOrEqualTo(String value) {
            addCriterion("sys_timer_type <=", value, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeLike(String value) {
            addCriterion("sys_timer_type like", value, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeNotLike(String value) {
            addCriterion("sys_timer_type not like", value, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeIn(List<String> values) {
            addCriterion("sys_timer_type in", values, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeNotIn(List<String> values) {
            addCriterion("sys_timer_type not in", values, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeBetween(String value1, String value2) {
            addCriterion("sys_timer_type between", value1, value2, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerTypeNotBetween(String value1, String value2) {
            addCriterion("sys_timer_type not between", value1, value2, "sysTimerType");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyIsNull() {
            addCriterion("sys_timer_frequency is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyIsNotNull() {
            addCriterion("sys_timer_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyEqualTo(String value) {
            addCriterion("sys_timer_frequency =", value, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyNotEqualTo(String value) {
            addCriterion("sys_timer_frequency <>", value, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyGreaterThan(String value) {
            addCriterion("sys_timer_frequency >", value, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("sys_timer_frequency >=", value, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyLessThan(String value) {
            addCriterion("sys_timer_frequency <", value, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyLessThanOrEqualTo(String value) {
            addCriterion("sys_timer_frequency <=", value, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyLike(String value) {
            addCriterion("sys_timer_frequency like", value, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyNotLike(String value) {
            addCriterion("sys_timer_frequency not like", value, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyIn(List<String> values) {
            addCriterion("sys_timer_frequency in", values, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyNotIn(List<String> values) {
            addCriterion("sys_timer_frequency not in", values, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyBetween(String value1, String value2) {
            addCriterion("sys_timer_frequency between", value1, value2, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerFrequencyNotBetween(String value1, String value2) {
            addCriterion("sys_timer_frequency not between", value1, value2, "sysTimerFrequency");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueIsNull() {
            addCriterion("sys_timer_repeat_value is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueIsNotNull() {
            addCriterion("sys_timer_repeat_value is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueEqualTo(Integer value) {
            addCriterion("sys_timer_repeat_value =", value, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueNotEqualTo(Integer value) {
            addCriterion("sys_timer_repeat_value <>", value, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueGreaterThan(Integer value) {
            addCriterion("sys_timer_repeat_value >", value, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_timer_repeat_value >=", value, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueLessThan(Integer value) {
            addCriterion("sys_timer_repeat_value <", value, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueLessThanOrEqualTo(Integer value) {
            addCriterion("sys_timer_repeat_value <=", value, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueIn(List<Integer> values) {
            addCriterion("sys_timer_repeat_value in", values, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueNotIn(List<Integer> values) {
            addCriterion("sys_timer_repeat_value not in", values, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueBetween(Integer value1, Integer value2) {
            addCriterion("sys_timer_repeat_value between", value1, value2, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatValueNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_timer_repeat_value not between", value1, value2, "sysTimerRepeatValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusIsNull() {
            addCriterion("sys_timer_status is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusIsNotNull() {
            addCriterion("sys_timer_status is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusEqualTo(Integer value) {
            addCriterion("sys_timer_status =", value, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusNotEqualTo(Integer value) {
            addCriterion("sys_timer_status <>", value, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusGreaterThan(Integer value) {
            addCriterion("sys_timer_status >", value, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_timer_status >=", value, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusLessThan(Integer value) {
            addCriterion("sys_timer_status <", value, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sys_timer_status <=", value, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusIn(List<Integer> values) {
            addCriterion("sys_timer_status in", values, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusNotIn(List<Integer> values) {
            addCriterion("sys_timer_status not in", values, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusBetween(Integer value1, Integer value2) {
            addCriterion("sys_timer_status between", value1, value2, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_timer_status not between", value1, value2, "sysTimerStatus");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameIsNull() {
            addCriterion("sys_timer_name is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameIsNotNull() {
            addCriterion("sys_timer_name is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameEqualTo(String value) {
            addCriterion("sys_timer_name =", value, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameNotEqualTo(String value) {
            addCriterion("sys_timer_name <>", value, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameGreaterThan(String value) {
            addCriterion("sys_timer_name >", value, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameGreaterThanOrEqualTo(String value) {
            addCriterion("sys_timer_name >=", value, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameLessThan(String value) {
            addCriterion("sys_timer_name <", value, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameLessThanOrEqualTo(String value) {
            addCriterion("sys_timer_name <=", value, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameLike(String value) {
            addCriterion("sys_timer_name like", value, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameNotLike(String value) {
            addCriterion("sys_timer_name not like", value, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameIn(List<String> values) {
            addCriterion("sys_timer_name in", values, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameNotIn(List<String> values) {
            addCriterion("sys_timer_name not in", values, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameBetween(String value1, String value2) {
            addCriterion("sys_timer_name between", value1, value2, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerNameNotBetween(String value1, String value2) {
            addCriterion("sys_timer_name not between", value1, value2, "sysTimerName");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeIsNull() {
            addCriterion("sys_timer_exec_type is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeIsNotNull() {
            addCriterion("sys_timer_exec_type is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeEqualTo(String value) {
            addCriterion("sys_timer_exec_type =", value, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeNotEqualTo(String value) {
            addCriterion("sys_timer_exec_type <>", value, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeGreaterThan(String value) {
            addCriterion("sys_timer_exec_type >", value, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_timer_exec_type >=", value, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeLessThan(String value) {
            addCriterion("sys_timer_exec_type <", value, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeLessThanOrEqualTo(String value) {
            addCriterion("sys_timer_exec_type <=", value, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeLike(String value) {
            addCriterion("sys_timer_exec_type like", value, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeNotLike(String value) {
            addCriterion("sys_timer_exec_type not like", value, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeIn(List<String> values) {
            addCriterion("sys_timer_exec_type in", values, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeNotIn(List<String> values) {
            addCriterion("sys_timer_exec_type not in", values, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeBetween(String value1, String value2) {
            addCriterion("sys_timer_exec_type between", value1, value2, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecTypeNotBetween(String value1, String value2) {
            addCriterion("sys_timer_exec_type not between", value1, value2, "sysTimerExecType");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatIsNull() {
            addCriterion("sys_timer_is_repeat is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatIsNotNull() {
            addCriterion("sys_timer_is_repeat is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatEqualTo(String value) {
            addCriterion("sys_timer_is_repeat =", value, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatNotEqualTo(String value) {
            addCriterion("sys_timer_is_repeat <>", value, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatGreaterThan(String value) {
            addCriterion("sys_timer_is_repeat >", value, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatGreaterThanOrEqualTo(String value) {
            addCriterion("sys_timer_is_repeat >=", value, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatLessThan(String value) {
            addCriterion("sys_timer_is_repeat <", value, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatLessThanOrEqualTo(String value) {
            addCriterion("sys_timer_is_repeat <=", value, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatLike(String value) {
            addCriterion("sys_timer_is_repeat like", value, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatNotLike(String value) {
            addCriterion("sys_timer_is_repeat not like", value, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatIn(List<String> values) {
            addCriterion("sys_timer_is_repeat in", values, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatNotIn(List<String> values) {
            addCriterion("sys_timer_is_repeat not in", values, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatBetween(String value1, String value2) {
            addCriterion("sys_timer_is_repeat between", value1, value2, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerIsRepeatNotBetween(String value1, String value2) {
            addCriterion("sys_timer_is_repeat not between", value1, value2, "sysTimerIsRepeat");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeIsNull() {
            addCriterion("sys_timer_repeat_type is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeIsNotNull() {
            addCriterion("sys_timer_repeat_type is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeEqualTo(String value) {
            addCriterion("sys_timer_repeat_type =", value, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeNotEqualTo(String value) {
            addCriterion("sys_timer_repeat_type <>", value, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeGreaterThan(String value) {
            addCriterion("sys_timer_repeat_type >", value, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_timer_repeat_type >=", value, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeLessThan(String value) {
            addCriterion("sys_timer_repeat_type <", value, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeLessThanOrEqualTo(String value) {
            addCriterion("sys_timer_repeat_type <=", value, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeLike(String value) {
            addCriterion("sys_timer_repeat_type like", value, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeNotLike(String value) {
            addCriterion("sys_timer_repeat_type not like", value, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeIn(List<String> values) {
            addCriterion("sys_timer_repeat_type in", values, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeNotIn(List<String> values) {
            addCriterion("sys_timer_repeat_type not in", values, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeBetween(String value1, String value2) {
            addCriterion("sys_timer_repeat_type between", value1, value2, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerRepeatTypeNotBetween(String value1, String value2) {
            addCriterion("sys_timer_repeat_type not between", value1, value2, "sysTimerRepeatType");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdIsNull() {
            addCriterion("sys_timer_exec_sql_id is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdIsNotNull() {
            addCriterion("sys_timer_exec_sql_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdEqualTo(Integer value) {
            addCriterion("sys_timer_exec_sql_id =", value, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdNotEqualTo(Integer value) {
            addCriterion("sys_timer_exec_sql_id <>", value, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdGreaterThan(Integer value) {
            addCriterion("sys_timer_exec_sql_id >", value, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_timer_exec_sql_id >=", value, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdLessThan(Integer value) {
            addCriterion("sys_timer_exec_sql_id <", value, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_timer_exec_sql_id <=", value, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdIn(List<Integer> values) {
            addCriterion("sys_timer_exec_sql_id in", values, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdNotIn(List<Integer> values) {
            addCriterion("sys_timer_exec_sql_id not in", values, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_timer_exec_sql_id between", value1, value2, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerExecSqlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_timer_exec_sql_id not between", value1, value2, "sysTimerExecSqlId");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeIsNull() {
            addCriterion("sys_timer_start_time is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeIsNotNull() {
            addCriterion("sys_timer_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeEqualTo(Date value) {
            addCriterion("sys_timer_start_time =", value, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeNotEqualTo(Date value) {
            addCriterion("sys_timer_start_time <>", value, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeGreaterThan(Date value) {
            addCriterion("sys_timer_start_time >", value, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_timer_start_time >=", value, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeLessThan(Date value) {
            addCriterion("sys_timer_start_time <", value, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_timer_start_time <=", value, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeIn(List<Date> values) {
            addCriterion("sys_timer_start_time in", values, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeNotIn(List<Date> values) {
            addCriterion("sys_timer_start_time not in", values, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeBetween(Date value1, Date value2) {
            addCriterion("sys_timer_start_time between", value1, value2, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_timer_start_time not between", value1, value2, "sysTimerStartTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeIsNull() {
            addCriterion("sys_timer_end_time is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeIsNotNull() {
            addCriterion("sys_timer_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeEqualTo(Date value) {
            addCriterion("sys_timer_end_time =", value, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeNotEqualTo(Date value) {
            addCriterion("sys_timer_end_time <>", value, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeGreaterThan(Date value) {
            addCriterion("sys_timer_end_time >", value, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_timer_end_time >=", value, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeLessThan(Date value) {
            addCriterion("sys_timer_end_time <", value, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_timer_end_time <=", value, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeIn(List<Date> values) {
            addCriterion("sys_timer_end_time in", values, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeNotIn(List<Date> values) {
            addCriterion("sys_timer_end_time not in", values, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeBetween(Date value1, Date value2) {
            addCriterion("sys_timer_end_time between", value1, value2, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_timer_end_time not between", value1, value2, "sysTimerEndTime");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueIsNull() {
            addCriterion("sys_timer_delayed_value is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueIsNotNull() {
            addCriterion("sys_timer_delayed_value is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueEqualTo(String value) {
            addCriterion("sys_timer_delayed_value =", value, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueNotEqualTo(String value) {
            addCriterion("sys_timer_delayed_value <>", value, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueGreaterThan(String value) {
            addCriterion("sys_timer_delayed_value >", value, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueGreaterThanOrEqualTo(String value) {
            addCriterion("sys_timer_delayed_value >=", value, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueLessThan(String value) {
            addCriterion("sys_timer_delayed_value <", value, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueLessThanOrEqualTo(String value) {
            addCriterion("sys_timer_delayed_value <=", value, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueLike(String value) {
            addCriterion("sys_timer_delayed_value like", value, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueNotLike(String value) {
            addCriterion("sys_timer_delayed_value not like", value, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueIn(List<String> values) {
            addCriterion("sys_timer_delayed_value in", values, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueNotIn(List<String> values) {
            addCriterion("sys_timer_delayed_value not in", values, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueBetween(String value1, String value2) {
            addCriterion("sys_timer_delayed_value between", value1, value2, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedValueNotBetween(String value1, String value2) {
            addCriterion("sys_timer_delayed_value not between", value1, value2, "sysTimerDelayedValue");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeIsNull() {
            addCriterion("sys_timer_delayed_type is null");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeIsNotNull() {
            addCriterion("sys_timer_delayed_type is not null");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeEqualTo(String value) {
            addCriterion("sys_timer_delayed_type =", value, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeNotEqualTo(String value) {
            addCriterion("sys_timer_delayed_type <>", value, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeGreaterThan(String value) {
            addCriterion("sys_timer_delayed_type >", value, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sys_timer_delayed_type >=", value, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeLessThan(String value) {
            addCriterion("sys_timer_delayed_type <", value, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeLessThanOrEqualTo(String value) {
            addCriterion("sys_timer_delayed_type <=", value, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeLike(String value) {
            addCriterion("sys_timer_delayed_type like", value, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeNotLike(String value) {
            addCriterion("sys_timer_delayed_type not like", value, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeIn(List<String> values) {
            addCriterion("sys_timer_delayed_type in", values, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeNotIn(List<String> values) {
            addCriterion("sys_timer_delayed_type not in", values, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeBetween(String value1, String value2) {
            addCriterion("sys_timer_delayed_type between", value1, value2, "sysTimerDelayedType");
            return (Criteria) this;
        }

        public Criteria andSysTimerDelayedTypeNotBetween(String value1, String value2) {
            addCriterion("sys_timer_delayed_type not between", value1, value2, "sysTimerDelayedType");
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