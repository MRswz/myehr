package com.myehr.pojo.process;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FreeProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreeProcessExample() {
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

        public Criteria andFreeProcessIdIsNull() {
            addCriterion("free_process_id is null");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdIsNotNull() {
            addCriterion("free_process_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdEqualTo(Long value) {
            addCriterion("free_process_id =", value, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdNotEqualTo(Long value) {
            addCriterion("free_process_id <>", value, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdGreaterThan(Long value) {
            addCriterion("free_process_id >", value, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("free_process_id >=", value, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdLessThan(Long value) {
            addCriterion("free_process_id <", value, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdLessThanOrEqualTo(Long value) {
            addCriterion("free_process_id <=", value, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdIn(List<Long> values) {
            addCriterion("free_process_id in", values, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdNotIn(List<Long> values) {
            addCriterion("free_process_id not in", values, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdBetween(Long value1, Long value2) {
            addCriterion("free_process_id between", value1, value2, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessIdNotBetween(Long value1, Long value2) {
            addCriterion("free_process_id not between", value1, value2, "freeProcessId");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitIsNull() {
            addCriterion("free_process_commit is null");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitIsNotNull() {
            addCriterion("free_process_commit is not null");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitEqualTo(String value) {
            addCriterion("free_process_commit =", value, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitNotEqualTo(String value) {
            addCriterion("free_process_commit <>", value, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitGreaterThan(String value) {
            addCriterion("free_process_commit >", value, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitGreaterThanOrEqualTo(String value) {
            addCriterion("free_process_commit >=", value, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitLessThan(String value) {
            addCriterion("free_process_commit <", value, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitLessThanOrEqualTo(String value) {
            addCriterion("free_process_commit <=", value, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitLike(String value) {
            addCriterion("free_process_commit like", value, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitNotLike(String value) {
            addCriterion("free_process_commit not like", value, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitIn(List<String> values) {
            addCriterion("free_process_commit in", values, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitNotIn(List<String> values) {
            addCriterion("free_process_commit not in", values, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitBetween(String value1, String value2) {
            addCriterion("free_process_commit between", value1, value2, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessCommitNotBetween(String value1, String value2) {
            addCriterion("free_process_commit not between", value1, value2, "freeProcessCommit");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveIsNull() {
            addCriterion("free_process_approve is null");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveIsNotNull() {
            addCriterion("free_process_approve is not null");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveEqualTo(String value) {
            addCriterion("free_process_approve =", value, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveNotEqualTo(String value) {
            addCriterion("free_process_approve <>", value, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveGreaterThan(String value) {
            addCriterion("free_process_approve >", value, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveGreaterThanOrEqualTo(String value) {
            addCriterion("free_process_approve >=", value, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveLessThan(String value) {
            addCriterion("free_process_approve <", value, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveLessThanOrEqualTo(String value) {
            addCriterion("free_process_approve <=", value, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveLike(String value) {
            addCriterion("free_process_approve like", value, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveNotLike(String value) {
            addCriterion("free_process_approve not like", value, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveIn(List<String> values) {
            addCriterion("free_process_approve in", values, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveNotIn(List<String> values) {
            addCriterion("free_process_approve not in", values, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveBetween(String value1, String value2) {
            addCriterion("free_process_approve between", value1, value2, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeProcessApproveNotBetween(String value1, String value2) {
            addCriterion("free_process_approve not between", value1, value2, "freeProcessApprove");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserIsNull() {
            addCriterion("free_now_user is null");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserIsNotNull() {
            addCriterion("free_now_user is not null");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserEqualTo(String value) {
            addCriterion("free_now_user =", value, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserNotEqualTo(String value) {
            addCriterion("free_now_user <>", value, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserGreaterThan(String value) {
            addCriterion("free_now_user >", value, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserGreaterThanOrEqualTo(String value) {
            addCriterion("free_now_user >=", value, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserLessThan(String value) {
            addCriterion("free_now_user <", value, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserLessThanOrEqualTo(String value) {
            addCriterion("free_now_user <=", value, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserLike(String value) {
            addCriterion("free_now_user like", value, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserNotLike(String value) {
            addCriterion("free_now_user not like", value, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserIn(List<String> values) {
            addCriterion("free_now_user in", values, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserNotIn(List<String> values) {
            addCriterion("free_now_user not in", values, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserBetween(String value1, String value2) {
            addCriterion("free_now_user between", value1, value2, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeNowUserNotBetween(String value1, String value2) {
            addCriterion("free_now_user not between", value1, value2, "freeNowUser");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdIsNull() {
            addCriterion("free_form_id is null");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdIsNotNull() {
            addCriterion("free_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdEqualTo(String value) {
            addCriterion("free_form_id =", value, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdNotEqualTo(String value) {
            addCriterion("free_form_id <>", value, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdGreaterThan(String value) {
            addCriterion("free_form_id >", value, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("free_form_id >=", value, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdLessThan(String value) {
            addCriterion("free_form_id <", value, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdLessThanOrEqualTo(String value) {
            addCriterion("free_form_id <=", value, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdLike(String value) {
            addCriterion("free_form_id like", value, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdNotLike(String value) {
            addCriterion("free_form_id not like", value, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdIn(List<String> values) {
            addCriterion("free_form_id in", values, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdNotIn(List<String> values) {
            addCriterion("free_form_id not in", values, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdBetween(String value1, String value2) {
            addCriterion("free_form_id between", value1, value2, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreeFormIdNotBetween(String value1, String value2) {
            addCriterion("free_form_id not between", value1, value2, "freeFormId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdIsNull() {
            addCriterion("free_pk_id is null");
            return (Criteria) this;
        }

        public Criteria andFreePkIdIsNotNull() {
            addCriterion("free_pk_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreePkIdEqualTo(String value) {
            addCriterion("free_pk_id =", value, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdNotEqualTo(String value) {
            addCriterion("free_pk_id <>", value, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdGreaterThan(String value) {
            addCriterion("free_pk_id >", value, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdGreaterThanOrEqualTo(String value) {
            addCriterion("free_pk_id >=", value, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdLessThan(String value) {
            addCriterion("free_pk_id <", value, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdLessThanOrEqualTo(String value) {
            addCriterion("free_pk_id <=", value, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdLike(String value) {
            addCriterion("free_pk_id like", value, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdNotLike(String value) {
            addCriterion("free_pk_id not like", value, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdIn(List<String> values) {
            addCriterion("free_pk_id in", values, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdNotIn(List<String> values) {
            addCriterion("free_pk_id not in", values, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdBetween(String value1, String value2) {
            addCriterion("free_pk_id between", value1, value2, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreePkIdNotBetween(String value1, String value2) {
            addCriterion("free_pk_id not between", value1, value2, "freePkId");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserIsNull() {
            addCriterion("free_next_user is null");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserIsNotNull() {
            addCriterion("free_next_user is not null");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserEqualTo(String value) {
            addCriterion("free_next_user =", value, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserNotEqualTo(String value) {
            addCriterion("free_next_user <>", value, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserGreaterThan(String value) {
            addCriterion("free_next_user >", value, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserGreaterThanOrEqualTo(String value) {
            addCriterion("free_next_user >=", value, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserLessThan(String value) {
            addCriterion("free_next_user <", value, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserLessThanOrEqualTo(String value) {
            addCriterion("free_next_user <=", value, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserLike(String value) {
            addCriterion("free_next_user like", value, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserNotLike(String value) {
            addCriterion("free_next_user not like", value, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserIn(List<String> values) {
            addCriterion("free_next_user in", values, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserNotIn(List<String> values) {
            addCriterion("free_next_user not in", values, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserBetween(String value1, String value2) {
            addCriterion("free_next_user between", value1, value2, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNextUserNotBetween(String value1, String value2) {
            addCriterion("free_next_user not between", value1, value2, "freeNextUser");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusIsNull() {
            addCriterion("free_node_status is null");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusIsNotNull() {
            addCriterion("free_node_status is not null");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusEqualTo(String value) {
            addCriterion("free_node_status =", value, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusNotEqualTo(String value) {
            addCriterion("free_node_status <>", value, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusGreaterThan(String value) {
            addCriterion("free_node_status >", value, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("free_node_status >=", value, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusLessThan(String value) {
            addCriterion("free_node_status <", value, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusLessThanOrEqualTo(String value) {
            addCriterion("free_node_status <=", value, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusLike(String value) {
            addCriterion("free_node_status like", value, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusNotLike(String value) {
            addCriterion("free_node_status not like", value, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusIn(List<String> values) {
            addCriterion("free_node_status in", values, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusNotIn(List<String> values) {
            addCriterion("free_node_status not in", values, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusBetween(String value1, String value2) {
            addCriterion("free_node_status between", value1, value2, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStatusNotBetween(String value1, String value2) {
            addCriterion("free_node_status not between", value1, value2, "freeNodeStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusIsNull() {
            addCriterion("free_all_status is null");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusIsNotNull() {
            addCriterion("free_all_status is not null");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusEqualTo(String value) {
            addCriterion("free_all_status =", value, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusNotEqualTo(String value) {
            addCriterion("free_all_status <>", value, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusGreaterThan(String value) {
            addCriterion("free_all_status >", value, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusGreaterThanOrEqualTo(String value) {
            addCriterion("free_all_status >=", value, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusLessThan(String value) {
            addCriterion("free_all_status <", value, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusLessThanOrEqualTo(String value) {
            addCriterion("free_all_status <=", value, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusLike(String value) {
            addCriterion("free_all_status like", value, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusNotLike(String value) {
            addCriterion("free_all_status not like", value, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusIn(List<String> values) {
            addCriterion("free_all_status in", values, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusNotIn(List<String> values) {
            addCriterion("free_all_status not in", values, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusBetween(String value1, String value2) {
            addCriterion("free_all_status between", value1, value2, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeAllStatusNotBetween(String value1, String value2) {
            addCriterion("free_all_status not between", value1, value2, "freeAllStatus");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeIsNull() {
            addCriterion("free_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeIsNotNull() {
            addCriterion("free_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeEqualTo(Date value) {
            addCriterion("free_start_time =", value, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeNotEqualTo(Date value) {
            addCriterion("free_start_time <>", value, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeGreaterThan(Date value) {
            addCriterion("free_start_time >", value, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("free_start_time >=", value, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeLessThan(Date value) {
            addCriterion("free_start_time <", value, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("free_start_time <=", value, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeIn(List<Date> values) {
            addCriterion("free_start_time in", values, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeNotIn(List<Date> values) {
            addCriterion("free_start_time not in", values, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeBetween(Date value1, Date value2) {
            addCriterion("free_start_time between", value1, value2, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("free_start_time not between", value1, value2, "freeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeIsNull() {
            addCriterion("free_ent_time is null");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeIsNotNull() {
            addCriterion("free_ent_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeEqualTo(Date value) {
            addCriterion("free_ent_time =", value, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeNotEqualTo(Date value) {
            addCriterion("free_ent_time <>", value, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeGreaterThan(Date value) {
            addCriterion("free_ent_time >", value, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("free_ent_time >=", value, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeLessThan(Date value) {
            addCriterion("free_ent_time <", value, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeLessThanOrEqualTo(Date value) {
            addCriterion("free_ent_time <=", value, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeIn(List<Date> values) {
            addCriterion("free_ent_time in", values, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeNotIn(List<Date> values) {
            addCriterion("free_ent_time not in", values, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeBetween(Date value1, Date value2) {
            addCriterion("free_ent_time between", value1, value2, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeEntTimeNotBetween(Date value1, Date value2) {
            addCriterion("free_ent_time not between", value1, value2, "freeEntTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeIsNull() {
            addCriterion("free_node_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeIsNotNull() {
            addCriterion("free_node_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeEqualTo(Date value) {
            addCriterion("free_node_start_time =", value, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeNotEqualTo(Date value) {
            addCriterion("free_node_start_time <>", value, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeGreaterThan(Date value) {
            addCriterion("free_node_start_time >", value, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("free_node_start_time >=", value, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeLessThan(Date value) {
            addCriterion("free_node_start_time <", value, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("free_node_start_time <=", value, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeIn(List<Date> values) {
            addCriterion("free_node_start_time in", values, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeNotIn(List<Date> values) {
            addCriterion("free_node_start_time not in", values, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeBetween(Date value1, Date value2) {
            addCriterion("free_node_start_time between", value1, value2, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("free_node_start_time not between", value1, value2, "freeNodeStartTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeIsNull() {
            addCriterion("free_node_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeIsNotNull() {
            addCriterion("free_node_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeEqualTo(Date value) {
            addCriterion("free_node_end_time =", value, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeNotEqualTo(Date value) {
            addCriterion("free_node_end_time <>", value, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeGreaterThan(Date value) {
            addCriterion("free_node_end_time >", value, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("free_node_end_time >=", value, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeLessThan(Date value) {
            addCriterion("free_node_end_time <", value, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("free_node_end_time <=", value, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeIn(List<Date> values) {
            addCriterion("free_node_end_time in", values, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeNotIn(List<Date> values) {
            addCriterion("free_node_end_time not in", values, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeBetween(Date value1, Date value2) {
            addCriterion("free_node_end_time between", value1, value2, "freeNodeEndTime");
            return (Criteria) this;
        }

        public Criteria andFreeNodeEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("free_node_end_time not between", value1, value2, "freeNodeEndTime");
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