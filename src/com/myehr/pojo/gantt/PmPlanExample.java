package com.myehr.pojo.gantt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmPlanExample() {
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

        public Criteria andProjectscheduleIdIsNull() {
            addCriterion("PROJECTSCHEDULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdIsNotNull() {
            addCriterion("PROJECTSCHEDULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdEqualTo(Integer value) {
            addCriterion("PROJECTSCHEDULE_ID =", value, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdNotEqualTo(Integer value) {
            addCriterion("PROJECTSCHEDULE_ID <>", value, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdGreaterThan(Integer value) {
            addCriterion("PROJECTSCHEDULE_ID >", value, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECTSCHEDULE_ID >=", value, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdLessThan(Integer value) {
            addCriterion("PROJECTSCHEDULE_ID <", value, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECTSCHEDULE_ID <=", value, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdIn(List<Integer> values) {
            addCriterion("PROJECTSCHEDULE_ID in", values, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdNotIn(List<Integer> values) {
            addCriterion("PROJECTSCHEDULE_ID not in", values, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdBetween(Integer value1, Integer value2) {
            addCriterion("PROJECTSCHEDULE_ID between", value1, value2, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andProjectscheduleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECTSCHEDULE_ID not between", value1, value2, "projectscheduleId");
            return (Criteria) this;
        }

        public Criteria andPsProIdIsNull() {
            addCriterion("PS_PRO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPsProIdIsNotNull() {
            addCriterion("PS_PRO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPsProIdEqualTo(Integer value) {
            addCriterion("PS_PRO_ID =", value, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdNotEqualTo(Integer value) {
            addCriterion("PS_PRO_ID <>", value, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdGreaterThan(Integer value) {
            addCriterion("PS_PRO_ID >", value, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_PRO_ID >=", value, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdLessThan(Integer value) {
            addCriterion("PS_PRO_ID <", value, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdLessThanOrEqualTo(Integer value) {
            addCriterion("PS_PRO_ID <=", value, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdIn(List<Integer> values) {
            addCriterion("PS_PRO_ID in", values, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdNotIn(List<Integer> values) {
            addCriterion("PS_PRO_ID not in", values, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdBetween(Integer value1, Integer value2) {
            addCriterion("PS_PRO_ID between", value1, value2, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_PRO_ID not between", value1, value2, "psProId");
            return (Criteria) this;
        }

        public Criteria andPsProStageIsNull() {
            addCriterion("PS_PRO_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andPsProStageIsNotNull() {
            addCriterion("PS_PRO_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPsProStageEqualTo(String value) {
            addCriterion("PS_PRO_STAGE =", value, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageNotEqualTo(String value) {
            addCriterion("PS_PRO_STAGE <>", value, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageGreaterThan(String value) {
            addCriterion("PS_PRO_STAGE >", value, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageGreaterThanOrEqualTo(String value) {
            addCriterion("PS_PRO_STAGE >=", value, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageLessThan(String value) {
            addCriterion("PS_PRO_STAGE <", value, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageLessThanOrEqualTo(String value) {
            addCriterion("PS_PRO_STAGE <=", value, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageLike(String value) {
            addCriterion("PS_PRO_STAGE like", value, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageNotLike(String value) {
            addCriterion("PS_PRO_STAGE not like", value, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageIn(List<String> values) {
            addCriterion("PS_PRO_STAGE in", values, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageNotIn(List<String> values) {
            addCriterion("PS_PRO_STAGE not in", values, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageBetween(String value1, String value2) {
            addCriterion("PS_PRO_STAGE between", value1, value2, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPsProStageNotBetween(String value1, String value2) {
            addCriterion("PS_PRO_STAGE not between", value1, value2, "psProStage");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("P_ID is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("P_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("P_ID =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("P_ID <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("P_ID >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("P_ID >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("P_ID <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("P_ID <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("P_ID in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("P_ID not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("P_ID between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("P_ID not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPsResourcesIsNull() {
            addCriterion("PS_RESOURCES is null");
            return (Criteria) this;
        }

        public Criteria andPsResourcesIsNotNull() {
            addCriterion("PS_RESOURCES is not null");
            return (Criteria) this;
        }

        public Criteria andPsResourcesEqualTo(String value) {
            addCriterion("PS_RESOURCES =", value, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesNotEqualTo(String value) {
            addCriterion("PS_RESOURCES <>", value, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesGreaterThan(String value) {
            addCriterion("PS_RESOURCES >", value, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesGreaterThanOrEqualTo(String value) {
            addCriterion("PS_RESOURCES >=", value, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesLessThan(String value) {
            addCriterion("PS_RESOURCES <", value, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesLessThanOrEqualTo(String value) {
            addCriterion("PS_RESOURCES <=", value, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesLike(String value) {
            addCriterion("PS_RESOURCES like", value, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesNotLike(String value) {
            addCriterion("PS_RESOURCES not like", value, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesIn(List<String> values) {
            addCriterion("PS_RESOURCES in", values, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesNotIn(List<String> values) {
            addCriterion("PS_RESOURCES not in", values, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesBetween(String value1, String value2) {
            addCriterion("PS_RESOURCES between", value1, value2, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsResourcesNotBetween(String value1, String value2) {
            addCriterion("PS_RESOURCES not between", value1, value2, "psResources");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentIsNull() {
            addCriterion("PS_JOBCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentIsNotNull() {
            addCriterion("PS_JOBCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentEqualTo(String value) {
            addCriterion("PS_JOBCONTENT =", value, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentNotEqualTo(String value) {
            addCriterion("PS_JOBCONTENT <>", value, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentGreaterThan(String value) {
            addCriterion("PS_JOBCONTENT >", value, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentGreaterThanOrEqualTo(String value) {
            addCriterion("PS_JOBCONTENT >=", value, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentLessThan(String value) {
            addCriterion("PS_JOBCONTENT <", value, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentLessThanOrEqualTo(String value) {
            addCriterion("PS_JOBCONTENT <=", value, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentLike(String value) {
            addCriterion("PS_JOBCONTENT like", value, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentNotLike(String value) {
            addCriterion("PS_JOBCONTENT not like", value, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentIn(List<String> values) {
            addCriterion("PS_JOBCONTENT in", values, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentNotIn(List<String> values) {
            addCriterion("PS_JOBCONTENT not in", values, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentBetween(String value1, String value2) {
            addCriterion("PS_JOBCONTENT between", value1, value2, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsJobcontentNotBetween(String value1, String value2) {
            addCriterion("PS_JOBCONTENT not between", value1, value2, "psJobcontent");
            return (Criteria) this;
        }

        public Criteria andPsImpleIsNull() {
            addCriterion("PS_IMPLE is null");
            return (Criteria) this;
        }

        public Criteria andPsImpleIsNotNull() {
            addCriterion("PS_IMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andPsImpleEqualTo(String value) {
            addCriterion("PS_IMPLE =", value, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleNotEqualTo(String value) {
            addCriterion("PS_IMPLE <>", value, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleGreaterThan(String value) {
            addCriterion("PS_IMPLE >", value, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleGreaterThanOrEqualTo(String value) {
            addCriterion("PS_IMPLE >=", value, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleLessThan(String value) {
            addCriterion("PS_IMPLE <", value, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleLessThanOrEqualTo(String value) {
            addCriterion("PS_IMPLE <=", value, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleLike(String value) {
            addCriterion("PS_IMPLE like", value, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleNotLike(String value) {
            addCriterion("PS_IMPLE not like", value, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleIn(List<String> values) {
            addCriterion("PS_IMPLE in", values, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleNotIn(List<String> values) {
            addCriterion("PS_IMPLE not in", values, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleBetween(String value1, String value2) {
            addCriterion("PS_IMPLE between", value1, value2, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsImpleNotBetween(String value1, String value2) {
            addCriterion("PS_IMPLE not between", value1, value2, "psImple");
            return (Criteria) this;
        }

        public Criteria andPsUserIsNull() {
            addCriterion("PS_USER is null");
            return (Criteria) this;
        }

        public Criteria andPsUserIsNotNull() {
            addCriterion("PS_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPsUserEqualTo(String value) {
            addCriterion("PS_USER =", value, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserNotEqualTo(String value) {
            addCriterion("PS_USER <>", value, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserGreaterThan(String value) {
            addCriterion("PS_USER >", value, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserGreaterThanOrEqualTo(String value) {
            addCriterion("PS_USER >=", value, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserLessThan(String value) {
            addCriterion("PS_USER <", value, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserLessThanOrEqualTo(String value) {
            addCriterion("PS_USER <=", value, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserLike(String value) {
            addCriterion("PS_USER like", value, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserNotLike(String value) {
            addCriterion("PS_USER not like", value, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserIn(List<String> values) {
            addCriterion("PS_USER in", values, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserNotIn(List<String> values) {
            addCriterion("PS_USER not in", values, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserBetween(String value1, String value2) {
            addCriterion("PS_USER between", value1, value2, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsUserNotBetween(String value1, String value2) {
            addCriterion("PS_USER not between", value1, value2, "psUser");
            return (Criteria) this;
        }

        public Criteria andPsStartdateIsNull() {
            addCriterion("PS_STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andPsStartdateIsNotNull() {
            addCriterion("PS_STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPsStartdateEqualTo(Date value) {
            addCriterion("PS_STARTDATE =", value, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateNotEqualTo(Date value) {
            addCriterion("PS_STARTDATE <>", value, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateGreaterThan(Date value) {
            addCriterion("PS_STARTDATE >", value, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PS_STARTDATE >=", value, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateLessThan(Date value) {
            addCriterion("PS_STARTDATE <", value, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateLessThanOrEqualTo(Date value) {
            addCriterion("PS_STARTDATE <=", value, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateIn(List<Date> values) {
            addCriterion("PS_STARTDATE in", values, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateNotIn(List<Date> values) {
            addCriterion("PS_STARTDATE not in", values, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateBetween(Date value1, Date value2) {
            addCriterion("PS_STARTDATE between", value1, value2, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsStartdateNotBetween(Date value1, Date value2) {
            addCriterion("PS_STARTDATE not between", value1, value2, "psStartdate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateIsNull() {
            addCriterion("PS_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andPsEnddateIsNotNull() {
            addCriterion("PS_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPsEnddateEqualTo(Date value) {
            addCriterion("PS_ENDDATE =", value, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateNotEqualTo(Date value) {
            addCriterion("PS_ENDDATE <>", value, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateGreaterThan(Date value) {
            addCriterion("PS_ENDDATE >", value, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("PS_ENDDATE >=", value, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateLessThan(Date value) {
            addCriterion("PS_ENDDATE <", value, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateLessThanOrEqualTo(Date value) {
            addCriterion("PS_ENDDATE <=", value, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateIn(List<Date> values) {
            addCriterion("PS_ENDDATE in", values, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateNotIn(List<Date> values) {
            addCriterion("PS_ENDDATE not in", values, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateBetween(Date value1, Date value2) {
            addCriterion("PS_ENDDATE between", value1, value2, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsEnddateNotBetween(Date value1, Date value2) {
            addCriterion("PS_ENDDATE not between", value1, value2, "psEnddate");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeIsNull() {
            addCriterion("PS_WORKTIME is null");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeIsNotNull() {
            addCriterion("PS_WORKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeEqualTo(Integer value) {
            addCriterion("PS_WORKTIME =", value, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeNotEqualTo(Integer value) {
            addCriterion("PS_WORKTIME <>", value, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeGreaterThan(Integer value) {
            addCriterion("PS_WORKTIME >", value, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PS_WORKTIME >=", value, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeLessThan(Integer value) {
            addCriterion("PS_WORKTIME <", value, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeLessThanOrEqualTo(Integer value) {
            addCriterion("PS_WORKTIME <=", value, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeIn(List<Integer> values) {
            addCriterion("PS_WORKTIME in", values, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeNotIn(List<Integer> values) {
            addCriterion("PS_WORKTIME not in", values, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeBetween(Integer value1, Integer value2) {
            addCriterion("PS_WORKTIME between", value1, value2, "psWorktime");
            return (Criteria) this;
        }

        public Criteria andPsWorktimeNotBetween(Integer value1, Integer value2) {
            addCriterion("PS_WORKTIME not between", value1, value2, "psWorktime");
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