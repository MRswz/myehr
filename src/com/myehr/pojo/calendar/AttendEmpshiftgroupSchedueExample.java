package com.myehr.pojo.calendar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendEmpshiftgroupSchedueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendEmpshiftgroupSchedueExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNull() {
            addCriterion("empid is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("empid is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(Integer value) {
            addCriterion("empid =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(Integer value) {
            addCriterion("empid <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(Integer value) {
            addCriterion("empid >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("empid >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(Integer value) {
            addCriterion("empid <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(Integer value) {
            addCriterion("empid <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<Integer> values) {
            addCriterion("empid in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<Integer> values) {
            addCriterion("empid not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(Integer value1, Integer value2) {
            addCriterion("empid between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(Integer value1, Integer value2) {
            addCriterion("empid not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Integer value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Integer value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Integer value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Integer value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Integer value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Integer> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Integer> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Integer value1, Integer value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Integer value1, Integer value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andShiftorgIsNull() {
            addCriterion("shiftorg is null");
            return (Criteria) this;
        }

        public Criteria andShiftorgIsNotNull() {
            addCriterion("shiftorg is not null");
            return (Criteria) this;
        }

        public Criteria andShiftorgEqualTo(Integer value) {
            addCriterion("shiftorg =", value, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgNotEqualTo(Integer value) {
            addCriterion("shiftorg <>", value, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgGreaterThan(Integer value) {
            addCriterion("shiftorg >", value, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgGreaterThanOrEqualTo(Integer value) {
            addCriterion("shiftorg >=", value, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgLessThan(Integer value) {
            addCriterion("shiftorg <", value, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgLessThanOrEqualTo(Integer value) {
            addCriterion("shiftorg <=", value, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgIn(List<Integer> values) {
            addCriterion("shiftorg in", values, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgNotIn(List<Integer> values) {
            addCriterion("shiftorg not in", values, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgBetween(Integer value1, Integer value2) {
            addCriterion("shiftorg between", value1, value2, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andShiftorgNotBetween(Integer value1, Integer value2) {
            addCriterion("shiftorg not between", value1, value2, "shiftorg");
            return (Criteria) this;
        }

        public Criteria andAttmonthIsNull() {
            addCriterion("attmonth is null");
            return (Criteria) this;
        }

        public Criteria andAttmonthIsNotNull() {
            addCriterion("attmonth is not null");
            return (Criteria) this;
        }

        public Criteria andAttmonthEqualTo(Date value) {
            addCriterion("attmonth =", value, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthNotEqualTo(Date value) {
            addCriterion("attmonth <>", value, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthGreaterThan(Date value) {
            addCriterion("attmonth >", value, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthGreaterThanOrEqualTo(Date value) {
            addCriterion("attmonth >=", value, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthLessThan(Date value) {
            addCriterion("attmonth <", value, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthLessThanOrEqualTo(Date value) {
            addCriterion("attmonth <=", value, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthIn(List<Date> values) {
            addCriterion("attmonth in", values, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthNotIn(List<Date> values) {
            addCriterion("attmonth not in", values, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthBetween(Date value1, Date value2) {
            addCriterion("attmonth between", value1, value2, "attmonth");
            return (Criteria) this;
        }

        public Criteria andAttmonthNotBetween(Date value1, Date value2) {
            addCriterion("attmonth not between", value1, value2, "attmonth");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(Date value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(Date value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(Date value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(Date value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(Date value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(Date value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<Date> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<Date> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(Date value1, Date value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(Date value1, Date value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andDaytypeIsNull() {
            addCriterion("daytype is null");
            return (Criteria) this;
        }

        public Criteria andDaytypeIsNotNull() {
            addCriterion("daytype is not null");
            return (Criteria) this;
        }

        public Criteria andDaytypeEqualTo(Integer value) {
            addCriterion("daytype =", value, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeNotEqualTo(Integer value) {
            addCriterion("daytype <>", value, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeGreaterThan(Integer value) {
            addCriterion("daytype >", value, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("daytype >=", value, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeLessThan(Integer value) {
            addCriterion("daytype <", value, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("daytype <=", value, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeIn(List<Integer> values) {
            addCriterion("daytype in", values, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeNotIn(List<Integer> values) {
            addCriterion("daytype not in", values, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeBetween(Integer value1, Integer value2) {
            addCriterion("daytype between", value1, value2, "daytype");
            return (Criteria) this;
        }

        public Criteria andDaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("daytype not between", value1, value2, "daytype");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupid is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupid is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("groupid =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("groupid <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("groupid >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("groupid >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("groupid <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("groupid <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("groupid in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("groupid not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("groupid between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("groupid not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andShifttypeIsNull() {
            addCriterion("shifttype is null");
            return (Criteria) this;
        }

        public Criteria andShifttypeIsNotNull() {
            addCriterion("shifttype is not null");
            return (Criteria) this;
        }

        public Criteria andShifttypeEqualTo(Integer value) {
            addCriterion("shifttype =", value, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeNotEqualTo(Integer value) {
            addCriterion("shifttype <>", value, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeGreaterThan(Integer value) {
            addCriterion("shifttype >", value, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shifttype >=", value, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeLessThan(Integer value) {
            addCriterion("shifttype <", value, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeLessThanOrEqualTo(Integer value) {
            addCriterion("shifttype <=", value, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeIn(List<Integer> values) {
            addCriterion("shifttype in", values, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeNotIn(List<Integer> values) {
            addCriterion("shifttype not in", values, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeBetween(Integer value1, Integer value2) {
            addCriterion("shifttype between", value1, value2, "shifttype");
            return (Criteria) this;
        }

        public Criteria andShifttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("shifttype not between", value1, value2, "shifttype");
            return (Criteria) this;
        }

        public Criteria andWorktimesIsNull() {
            addCriterion("worktimes is null");
            return (Criteria) this;
        }

        public Criteria andWorktimesIsNotNull() {
            addCriterion("worktimes is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimesEqualTo(BigDecimal value) {
            addCriterion("worktimes =", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesNotEqualTo(BigDecimal value) {
            addCriterion("worktimes <>", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesGreaterThan(BigDecimal value) {
            addCriterion("worktimes >", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("worktimes >=", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesLessThan(BigDecimal value) {
            addCriterion("worktimes <", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("worktimes <=", value, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesIn(List<BigDecimal> values) {
            addCriterion("worktimes in", values, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesNotIn(List<BigDecimal> values) {
            addCriterion("worktimes not in", values, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("worktimes between", value1, value2, "worktimes");
            return (Criteria) this;
        }

        public Criteria andWorktimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("worktimes not between", value1, value2, "worktimes");
            return (Criteria) this;
        }

        public Criteria andBegintime1IsNull() {
            addCriterion("begintime1 is null");
            return (Criteria) this;
        }

        public Criteria andBegintime1IsNotNull() {
            addCriterion("begintime1 is not null");
            return (Criteria) this;
        }

        public Criteria andBegintime1EqualTo(Date value) {
            addCriterion("begintime1 =", value, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1NotEqualTo(Date value) {
            addCriterion("begintime1 <>", value, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1GreaterThan(Date value) {
            addCriterion("begintime1 >", value, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1GreaterThanOrEqualTo(Date value) {
            addCriterion("begintime1 >=", value, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1LessThan(Date value) {
            addCriterion("begintime1 <", value, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1LessThanOrEqualTo(Date value) {
            addCriterion("begintime1 <=", value, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1In(List<Date> values) {
            addCriterion("begintime1 in", values, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1NotIn(List<Date> values) {
            addCriterion("begintime1 not in", values, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1Between(Date value1, Date value2) {
            addCriterion("begintime1 between", value1, value2, "begintime1");
            return (Criteria) this;
        }

        public Criteria andBegintime1NotBetween(Date value1, Date value2) {
            addCriterion("begintime1 not between", value1, value2, "begintime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1IsNull() {
            addCriterion("endtime1 is null");
            return (Criteria) this;
        }

        public Criteria andEndtime1IsNotNull() {
            addCriterion("endtime1 is not null");
            return (Criteria) this;
        }

        public Criteria andEndtime1EqualTo(Date value) {
            addCriterion("endtime1 =", value, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1NotEqualTo(Date value) {
            addCriterion("endtime1 <>", value, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1GreaterThan(Date value) {
            addCriterion("endtime1 >", value, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1GreaterThanOrEqualTo(Date value) {
            addCriterion("endtime1 >=", value, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1LessThan(Date value) {
            addCriterion("endtime1 <", value, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1LessThanOrEqualTo(Date value) {
            addCriterion("endtime1 <=", value, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1In(List<Date> values) {
            addCriterion("endtime1 in", values, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1NotIn(List<Date> values) {
            addCriterion("endtime1 not in", values, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1Between(Date value1, Date value2) {
            addCriterion("endtime1 between", value1, value2, "endtime1");
            return (Criteria) this;
        }

        public Criteria andEndtime1NotBetween(Date value1, Date value2) {
            addCriterion("endtime1 not between", value1, value2, "endtime1");
            return (Criteria) this;
        }

        public Criteria andBegintime2IsNull() {
            addCriterion("begintime2 is null");
            return (Criteria) this;
        }

        public Criteria andBegintime2IsNotNull() {
            addCriterion("begintime2 is not null");
            return (Criteria) this;
        }

        public Criteria andBegintime2EqualTo(Date value) {
            addCriterion("begintime2 =", value, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2NotEqualTo(Date value) {
            addCriterion("begintime2 <>", value, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2GreaterThan(Date value) {
            addCriterion("begintime2 >", value, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2GreaterThanOrEqualTo(Date value) {
            addCriterion("begintime2 >=", value, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2LessThan(Date value) {
            addCriterion("begintime2 <", value, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2LessThanOrEqualTo(Date value) {
            addCriterion("begintime2 <=", value, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2In(List<Date> values) {
            addCriterion("begintime2 in", values, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2NotIn(List<Date> values) {
            addCriterion("begintime2 not in", values, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2Between(Date value1, Date value2) {
            addCriterion("begintime2 between", value1, value2, "begintime2");
            return (Criteria) this;
        }

        public Criteria andBegintime2NotBetween(Date value1, Date value2) {
            addCriterion("begintime2 not between", value1, value2, "begintime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2IsNull() {
            addCriterion("endtime2 is null");
            return (Criteria) this;
        }

        public Criteria andEndtime2IsNotNull() {
            addCriterion("endtime2 is not null");
            return (Criteria) this;
        }

        public Criteria andEndtime2EqualTo(Date value) {
            addCriterion("endtime2 =", value, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2NotEqualTo(Date value) {
            addCriterion("endtime2 <>", value, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2GreaterThan(Date value) {
            addCriterion("endtime2 >", value, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2GreaterThanOrEqualTo(Date value) {
            addCriterion("endtime2 >=", value, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2LessThan(Date value) {
            addCriterion("endtime2 <", value, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2LessThanOrEqualTo(Date value) {
            addCriterion("endtime2 <=", value, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2In(List<Date> values) {
            addCriterion("endtime2 in", values, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2NotIn(List<Date> values) {
            addCriterion("endtime2 not in", values, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2Between(Date value1, Date value2) {
            addCriterion("endtime2 between", value1, value2, "endtime2");
            return (Criteria) this;
        }

        public Criteria andEndtime2NotBetween(Date value1, Date value2) {
            addCriterion("endtime2 not between", value1, value2, "endtime2");
            return (Criteria) this;
        }

        public Criteria andCardtimesIsNull() {
            addCriterion("cardtimes is null");
            return (Criteria) this;
        }

        public Criteria andCardtimesIsNotNull() {
            addCriterion("cardtimes is not null");
            return (Criteria) this;
        }

        public Criteria andCardtimesEqualTo(Integer value) {
            addCriterion("cardtimes =", value, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesNotEqualTo(Integer value) {
            addCriterion("cardtimes <>", value, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesGreaterThan(Integer value) {
            addCriterion("cardtimes >", value, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("cardtimes >=", value, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesLessThan(Integer value) {
            addCriterion("cardtimes <", value, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesLessThanOrEqualTo(Integer value) {
            addCriterion("cardtimes <=", value, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesIn(List<Integer> values) {
            addCriterion("cardtimes in", values, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesNotIn(List<Integer> values) {
            addCriterion("cardtimes not in", values, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesBetween(Integer value1, Integer value2) {
            addCriterion("cardtimes between", value1, value2, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andCardtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("cardtimes not between", value1, value2, "cardtimes");
            return (Criteria) this;
        }

        public Criteria andScanendtimeIsNull() {
            addCriterion("scanendtime is null");
            return (Criteria) this;
        }

        public Criteria andScanendtimeIsNotNull() {
            addCriterion("scanendtime is not null");
            return (Criteria) this;
        }

        public Criteria andScanendtimeEqualTo(Date value) {
            addCriterion("scanendtime =", value, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeNotEqualTo(Date value) {
            addCriterion("scanendtime <>", value, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeGreaterThan(Date value) {
            addCriterion("scanendtime >", value, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scanendtime >=", value, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeLessThan(Date value) {
            addCriterion("scanendtime <", value, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeLessThanOrEqualTo(Date value) {
            addCriterion("scanendtime <=", value, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeIn(List<Date> values) {
            addCriterion("scanendtime in", values, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeNotIn(List<Date> values) {
            addCriterion("scanendtime not in", values, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeBetween(Date value1, Date value2) {
            addCriterion("scanendtime between", value1, value2, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanendtimeNotBetween(Date value1, Date value2) {
            addCriterion("scanendtime not between", value1, value2, "scanendtime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeIsNull() {
            addCriterion("scanbegintime is null");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeIsNotNull() {
            addCriterion("scanbegintime is not null");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeEqualTo(Date value) {
            addCriterion("scanbegintime =", value, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeNotEqualTo(Date value) {
            addCriterion("scanbegintime <>", value, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeGreaterThan(Date value) {
            addCriterion("scanbegintime >", value, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scanbegintime >=", value, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeLessThan(Date value) {
            addCriterion("scanbegintime <", value, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeLessThanOrEqualTo(Date value) {
            addCriterion("scanbegintime <=", value, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeIn(List<Date> values) {
            addCriterion("scanbegintime in", values, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeNotIn(List<Date> values) {
            addCriterion("scanbegintime not in", values, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeBetween(Date value1, Date value2) {
            addCriterion("scanbegintime between", value1, value2, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andScanbegintimeNotBetween(Date value1, Date value2) {
            addCriterion("scanbegintime not between", value1, value2, "scanbegintime");
            return (Criteria) this;
        }

        public Criteria andLatemiuIsNull() {
            addCriterion("latemiu is null");
            return (Criteria) this;
        }

        public Criteria andLatemiuIsNotNull() {
            addCriterion("latemiu is not null");
            return (Criteria) this;
        }

        public Criteria andLatemiuEqualTo(Integer value) {
            addCriterion("latemiu =", value, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuNotEqualTo(Integer value) {
            addCriterion("latemiu <>", value, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuGreaterThan(Integer value) {
            addCriterion("latemiu >", value, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuGreaterThanOrEqualTo(Integer value) {
            addCriterion("latemiu >=", value, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuLessThan(Integer value) {
            addCriterion("latemiu <", value, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuLessThanOrEqualTo(Integer value) {
            addCriterion("latemiu <=", value, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuIn(List<Integer> values) {
            addCriterion("latemiu in", values, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuNotIn(List<Integer> values) {
            addCriterion("latemiu not in", values, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuBetween(Integer value1, Integer value2) {
            addCriterion("latemiu between", value1, value2, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLatemiuNotBetween(Integer value1, Integer value2) {
            addCriterion("latemiu not between", value1, value2, "latemiu");
            return (Criteria) this;
        }

        public Criteria andLateabsIsNull() {
            addCriterion("lateabs is null");
            return (Criteria) this;
        }

        public Criteria andLateabsIsNotNull() {
            addCriterion("lateabs is not null");
            return (Criteria) this;
        }

        public Criteria andLateabsEqualTo(Integer value) {
            addCriterion("lateabs =", value, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsNotEqualTo(Integer value) {
            addCriterion("lateabs <>", value, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsGreaterThan(Integer value) {
            addCriterion("lateabs >", value, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsGreaterThanOrEqualTo(Integer value) {
            addCriterion("lateabs >=", value, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsLessThan(Integer value) {
            addCriterion("lateabs <", value, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsLessThanOrEqualTo(Integer value) {
            addCriterion("lateabs <=", value, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsIn(List<Integer> values) {
            addCriterion("lateabs in", values, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsNotIn(List<Integer> values) {
            addCriterion("lateabs not in", values, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsBetween(Integer value1, Integer value2) {
            addCriterion("lateabs between", value1, value2, "lateabs");
            return (Criteria) this;
        }

        public Criteria andLateabsNotBetween(Integer value1, Integer value2) {
            addCriterion("lateabs not between", value1, value2, "lateabs");
            return (Criteria) this;
        }

        public Criteria andEarlymiuIsNull() {
            addCriterion("earlymiu is null");
            return (Criteria) this;
        }

        public Criteria andEarlymiuIsNotNull() {
            addCriterion("earlymiu is not null");
            return (Criteria) this;
        }

        public Criteria andEarlymiuEqualTo(Integer value) {
            addCriterion("earlymiu =", value, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuNotEqualTo(Integer value) {
            addCriterion("earlymiu <>", value, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuGreaterThan(Integer value) {
            addCriterion("earlymiu >", value, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuGreaterThanOrEqualTo(Integer value) {
            addCriterion("earlymiu >=", value, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuLessThan(Integer value) {
            addCriterion("earlymiu <", value, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuLessThanOrEqualTo(Integer value) {
            addCriterion("earlymiu <=", value, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuIn(List<Integer> values) {
            addCriterion("earlymiu in", values, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuNotIn(List<Integer> values) {
            addCriterion("earlymiu not in", values, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuBetween(Integer value1, Integer value2) {
            addCriterion("earlymiu between", value1, value2, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlymiuNotBetween(Integer value1, Integer value2) {
            addCriterion("earlymiu not between", value1, value2, "earlymiu");
            return (Criteria) this;
        }

        public Criteria andEarlabsIsNull() {
            addCriterion("earlabs is null");
            return (Criteria) this;
        }

        public Criteria andEarlabsIsNotNull() {
            addCriterion("earlabs is not null");
            return (Criteria) this;
        }

        public Criteria andEarlabsEqualTo(Integer value) {
            addCriterion("earlabs =", value, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsNotEqualTo(Integer value) {
            addCriterion("earlabs <>", value, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsGreaterThan(Integer value) {
            addCriterion("earlabs >", value, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsGreaterThanOrEqualTo(Integer value) {
            addCriterion("earlabs >=", value, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsLessThan(Integer value) {
            addCriterion("earlabs <", value, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsLessThanOrEqualTo(Integer value) {
            addCriterion("earlabs <=", value, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsIn(List<Integer> values) {
            addCriterion("earlabs in", values, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsNotIn(List<Integer> values) {
            addCriterion("earlabs not in", values, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsBetween(Integer value1, Integer value2) {
            addCriterion("earlabs between", value1, value2, "earlabs");
            return (Criteria) this;
        }

        public Criteria andEarlabsNotBetween(Integer value1, Integer value2) {
            addCriterion("earlabs not between", value1, value2, "earlabs");
            return (Criteria) this;
        }

        public Criteria andFlextimeIsNull() {
            addCriterion("flextime is null");
            return (Criteria) this;
        }

        public Criteria andFlextimeIsNotNull() {
            addCriterion("flextime is not null");
            return (Criteria) this;
        }

        public Criteria andFlextimeEqualTo(Integer value) {
            addCriterion("flextime =", value, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeNotEqualTo(Integer value) {
            addCriterion("flextime <>", value, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeGreaterThan(Integer value) {
            addCriterion("flextime >", value, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("flextime >=", value, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeLessThan(Integer value) {
            addCriterion("flextime <", value, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeLessThanOrEqualTo(Integer value) {
            addCriterion("flextime <=", value, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeIn(List<Integer> values) {
            addCriterion("flextime in", values, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeNotIn(List<Integer> values) {
            addCriterion("flextime not in", values, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeBetween(Integer value1, Integer value2) {
            addCriterion("flextime between", value1, value2, "flextime");
            return (Criteria) this;
        }

        public Criteria andFlextimeNotBetween(Integer value1, Integer value2) {
            addCriterion("flextime not between", value1, value2, "flextime");
            return (Criteria) this;
        }

        public Criteria andHolidyot3IsNull() {
            addCriterion("holidyot3 is null");
            return (Criteria) this;
        }

        public Criteria andHolidyot3IsNotNull() {
            addCriterion("holidyot3 is not null");
            return (Criteria) this;
        }

        public Criteria andHolidyot3EqualTo(Integer value) {
            addCriterion("holidyot3 =", value, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3NotEqualTo(Integer value) {
            addCriterion("holidyot3 <>", value, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3GreaterThan(Integer value) {
            addCriterion("holidyot3 >", value, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3GreaterThanOrEqualTo(Integer value) {
            addCriterion("holidyot3 >=", value, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3LessThan(Integer value) {
            addCriterion("holidyot3 <", value, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3LessThanOrEqualTo(Integer value) {
            addCriterion("holidyot3 <=", value, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3In(List<Integer> values) {
            addCriterion("holidyot3 in", values, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3NotIn(List<Integer> values) {
            addCriterion("holidyot3 not in", values, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3Between(Integer value1, Integer value2) {
            addCriterion("holidyot3 between", value1, value2, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andHolidyot3NotBetween(Integer value1, Integer value2) {
            addCriterion("holidyot3 not between", value1, value2, "holidyot3");
            return (Criteria) this;
        }

        public Criteria andZoneidIsNull() {
            addCriterion("zoneid is null");
            return (Criteria) this;
        }

        public Criteria andZoneidIsNotNull() {
            addCriterion("zoneid is not null");
            return (Criteria) this;
        }

        public Criteria andZoneidEqualTo(Integer value) {
            addCriterion("zoneid =", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidNotEqualTo(Integer value) {
            addCriterion("zoneid <>", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidGreaterThan(Integer value) {
            addCriterion("zoneid >", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zoneid >=", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidLessThan(Integer value) {
            addCriterion("zoneid <", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidLessThanOrEqualTo(Integer value) {
            addCriterion("zoneid <=", value, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidIn(List<Integer> values) {
            addCriterion("zoneid in", values, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidNotIn(List<Integer> values) {
            addCriterion("zoneid not in", values, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidBetween(Integer value1, Integer value2) {
            addCriterion("zoneid between", value1, value2, "zoneid");
            return (Criteria) this;
        }

        public Criteria andZoneidNotBetween(Integer value1, Integer value2) {
            addCriterion("zoneid not between", value1, value2, "zoneid");
            return (Criteria) this;
        }

        public Criteria andLockshiftIsNull() {
            addCriterion("lockshift is null");
            return (Criteria) this;
        }

        public Criteria andLockshiftIsNotNull() {
            addCriterion("lockshift is not null");
            return (Criteria) this;
        }

        public Criteria andLockshiftEqualTo(Integer value) {
            addCriterion("lockshift =", value, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftNotEqualTo(Integer value) {
            addCriterion("lockshift <>", value, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftGreaterThan(Integer value) {
            addCriterion("lockshift >", value, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("lockshift >=", value, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftLessThan(Integer value) {
            addCriterion("lockshift <", value, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftLessThanOrEqualTo(Integer value) {
            addCriterion("lockshift <=", value, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftIn(List<Integer> values) {
            addCriterion("lockshift in", values, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftNotIn(List<Integer> values) {
            addCriterion("lockshift not in", values, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftBetween(Integer value1, Integer value2) {
            addCriterion("lockshift between", value1, value2, "lockshift");
            return (Criteria) this;
        }

        public Criteria andLockshiftNotBetween(Integer value1, Integer value2) {
            addCriterion("lockshift not between", value1, value2, "lockshift");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeIsNull() {
            addCriterion("newshifttype is null");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeIsNotNull() {
            addCriterion("newshifttype is not null");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeEqualTo(Integer value) {
            addCriterion("newshifttype =", value, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeNotEqualTo(Integer value) {
            addCriterion("newshifttype <>", value, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeGreaterThan(Integer value) {
            addCriterion("newshifttype >", value, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("newshifttype >=", value, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeLessThan(Integer value) {
            addCriterion("newshifttype <", value, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeLessThanOrEqualTo(Integer value) {
            addCriterion("newshifttype <=", value, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeIn(List<Integer> values) {
            addCriterion("newshifttype in", values, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeNotIn(List<Integer> values) {
            addCriterion("newshifttype not in", values, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeBetween(Integer value1, Integer value2) {
            addCriterion("newshifttype between", value1, value2, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andNewshifttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("newshifttype not between", value1, value2, "newshifttype");
            return (Criteria) this;
        }

        public Criteria andRestdateIsNull() {
            addCriterion("restdate is null");
            return (Criteria) this;
        }

        public Criteria andRestdateIsNotNull() {
            addCriterion("restdate is not null");
            return (Criteria) this;
        }

        public Criteria andRestdateEqualTo(Date value) {
            addCriterion("restdate =", value, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateNotEqualTo(Date value) {
            addCriterion("restdate <>", value, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateGreaterThan(Date value) {
            addCriterion("restdate >", value, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateGreaterThanOrEqualTo(Date value) {
            addCriterion("restdate >=", value, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateLessThan(Date value) {
            addCriterion("restdate <", value, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateLessThanOrEqualTo(Date value) {
            addCriterion("restdate <=", value, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateIn(List<Date> values) {
            addCriterion("restdate in", values, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateNotIn(List<Date> values) {
            addCriterion("restdate not in", values, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateBetween(Date value1, Date value2) {
            addCriterion("restdate between", value1, value2, "restdate");
            return (Criteria) this;
        }

        public Criteria andRestdateNotBetween(Date value1, Date value2) {
            addCriterion("restdate not between", value1, value2, "restdate");
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