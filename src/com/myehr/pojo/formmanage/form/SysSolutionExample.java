package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysSolutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSolutionExample() {
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

        public Criteria andSolutionIdIsNull() {
            addCriterion("SOLUTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSolutionIdIsNotNull() {
            addCriterion("SOLUTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionIdEqualTo(Long value) {
            addCriterion("SOLUTION_ID =", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotEqualTo(Long value) {
            addCriterion("SOLUTION_ID <>", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdGreaterThan(Long value) {
            addCriterion("SOLUTION_ID >", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SOLUTION_ID >=", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdLessThan(Long value) {
            addCriterion("SOLUTION_ID <", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdLessThanOrEqualTo(Long value) {
            addCriterion("SOLUTION_ID <=", value, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdIn(List<Long> values) {
            addCriterion("SOLUTION_ID in", values, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotIn(List<Long> values) {
            addCriterion("SOLUTION_ID not in", values, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdBetween(Long value1, Long value2) {
            addCriterion("SOLUTION_ID between", value1, value2, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionIdNotBetween(Long value1, Long value2) {
            addCriterion("SOLUTION_ID not between", value1, value2, "solutionId");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeIsNull() {
            addCriterion("SOLUTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeIsNotNull() {
            addCriterion("SOLUTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeEqualTo(String value) {
            addCriterion("SOLUTION_CODE =", value, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeNotEqualTo(String value) {
            addCriterion("SOLUTION_CODE <>", value, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeGreaterThan(String value) {
            addCriterion("SOLUTION_CODE >", value, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SOLUTION_CODE >=", value, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeLessThan(String value) {
            addCriterion("SOLUTION_CODE <", value, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeLessThanOrEqualTo(String value) {
            addCriterion("SOLUTION_CODE <=", value, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeLike(String value) {
            addCriterion("SOLUTION_CODE like", value, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeNotLike(String value) {
            addCriterion("SOLUTION_CODE not like", value, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeIn(List<String> values) {
            addCriterion("SOLUTION_CODE in", values, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeNotIn(List<String> values) {
            addCriterion("SOLUTION_CODE not in", values, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeBetween(String value1, String value2) {
            addCriterion("SOLUTION_CODE between", value1, value2, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionCodeNotBetween(String value1, String value2) {
            addCriterion("SOLUTION_CODE not between", value1, value2, "solutionCode");
            return (Criteria) this;
        }

        public Criteria andSolutionNameIsNull() {
            addCriterion("SOLUTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSolutionNameIsNotNull() {
            addCriterion("SOLUTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionNameEqualTo(String value) {
            addCriterion("SOLUTION_NAME =", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameNotEqualTo(String value) {
            addCriterion("SOLUTION_NAME <>", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameGreaterThan(String value) {
            addCriterion("SOLUTION_NAME >", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("SOLUTION_NAME >=", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameLessThan(String value) {
            addCriterion("SOLUTION_NAME <", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameLessThanOrEqualTo(String value) {
            addCriterion("SOLUTION_NAME <=", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameLike(String value) {
            addCriterion("SOLUTION_NAME like", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameNotLike(String value) {
            addCriterion("SOLUTION_NAME not like", value, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameIn(List<String> values) {
            addCriterion("SOLUTION_NAME in", values, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameNotIn(List<String> values) {
            addCriterion("SOLUTION_NAME not in", values, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameBetween(String value1, String value2) {
            addCriterion("SOLUTION_NAME between", value1, value2, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionNameNotBetween(String value1, String value2) {
            addCriterion("SOLUTION_NAME not between", value1, value2, "solutionName");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdIsNull() {
            addCriterion("SOLUTION_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdIsNotNull() {
            addCriterion("SOLUTION_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdEqualTo(String value) {
            addCriterion("SOLUTION_PARENT_ID =", value, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdNotEqualTo(String value) {
            addCriterion("SOLUTION_PARENT_ID <>", value, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdGreaterThan(String value) {
            addCriterion("SOLUTION_PARENT_ID >", value, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOLUTION_PARENT_ID >=", value, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdLessThan(String value) {
            addCriterion("SOLUTION_PARENT_ID <", value, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdLessThanOrEqualTo(String value) {
            addCriterion("SOLUTION_PARENT_ID <=", value, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdLike(String value) {
            addCriterion("SOLUTION_PARENT_ID like", value, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdNotLike(String value) {
            addCriterion("SOLUTION_PARENT_ID not like", value, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdIn(List<String> values) {
            addCriterion("SOLUTION_PARENT_ID in", values, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdNotIn(List<String> values) {
            addCriterion("SOLUTION_PARENT_ID not in", values, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdBetween(String value1, String value2) {
            addCriterion("SOLUTION_PARENT_ID between", value1, value2, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionParentIdNotBetween(String value1, String value2) {
            addCriterion("SOLUTION_PARENT_ID not between", value1, value2, "solutionParentId");
            return (Criteria) this;
        }

        public Criteria andSolutionSortIsNull() {
            addCriterion("SOLUTION_SORT is null");
            return (Criteria) this;
        }

        public Criteria andSolutionSortIsNotNull() {
            addCriterion("SOLUTION_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionSortEqualTo(String value) {
            addCriterion("SOLUTION_SORT =", value, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortNotEqualTo(String value) {
            addCriterion("SOLUTION_SORT <>", value, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortGreaterThan(String value) {
            addCriterion("SOLUTION_SORT >", value, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortGreaterThanOrEqualTo(String value) {
            addCriterion("SOLUTION_SORT >=", value, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortLessThan(String value) {
            addCriterion("SOLUTION_SORT <", value, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortLessThanOrEqualTo(String value) {
            addCriterion("SOLUTION_SORT <=", value, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortLike(String value) {
            addCriterion("SOLUTION_SORT like", value, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortNotLike(String value) {
            addCriterion("SOLUTION_SORT not like", value, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortIn(List<String> values) {
            addCriterion("SOLUTION_SORT in", values, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortNotIn(List<String> values) {
            addCriterion("SOLUTION_SORT not in", values, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortBetween(String value1, String value2) {
            addCriterion("SOLUTION_SORT between", value1, value2, "solutionSort");
            return (Criteria) this;
        }

        public Criteria andSolutionSortNotBetween(String value1, String value2) {
            addCriterion("SOLUTION_SORT not between", value1, value2, "solutionSort");
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

        public Criteria andApproveTimeIsNull() {
            addCriterion("APPROVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIsNotNull() {
            addCriterion("APPROVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeEqualTo(Date value) {
            addCriterion("APPROVE_TIME =", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotEqualTo(Date value) {
            addCriterion("APPROVE_TIME <>", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThan(Date value) {
            addCriterion("APPROVE_TIME >", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPROVE_TIME >=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThan(Date value) {
            addCriterion("APPROVE_TIME <", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPROVE_TIME <=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIn(List<Date> values) {
            addCriterion("APPROVE_TIME in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotIn(List<Date> values) {
            addCriterion("APPROVE_TIME not in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeBetween(Date value1, Date value2) {
            addCriterion("APPROVE_TIME between", value1, value2, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPROVE_TIME not between", value1, value2, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveNameIsNull() {
            addCriterion("APPROVE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andApproveNameIsNotNull() {
            addCriterion("APPROVE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andApproveNameEqualTo(String value) {
            addCriterion("APPROVE_NAME =", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameNotEqualTo(String value) {
            addCriterion("APPROVE_NAME <>", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameGreaterThan(String value) {
            addCriterion("APPROVE_NAME >", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVE_NAME >=", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameLessThan(String value) {
            addCriterion("APPROVE_NAME <", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameLessThanOrEqualTo(String value) {
            addCriterion("APPROVE_NAME <=", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameLike(String value) {
            addCriterion("APPROVE_NAME like", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameNotLike(String value) {
            addCriterion("APPROVE_NAME not like", value, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameIn(List<String> values) {
            addCriterion("APPROVE_NAME in", values, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameNotIn(List<String> values) {
            addCriterion("APPROVE_NAME not in", values, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameBetween(String value1, String value2) {
            addCriterion("APPROVE_NAME between", value1, value2, "approveName");
            return (Criteria) this;
        }

        public Criteria andApproveNameNotBetween(String value1, String value2) {
            addCriterion("APPROVE_NAME not between", value1, value2, "approveName");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNull() {
            addCriterion("DELETE_MARK is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNotNull() {
            addCriterion("DELETE_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkEqualTo(String value) {
            addCriterion("DELETE_MARK =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(String value) {
            addCriterion("DELETE_MARK <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(String value) {
            addCriterion("DELETE_MARK >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(String value) {
            addCriterion("DELETE_MARK <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLike(String value) {
            addCriterion("DELETE_MARK like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotLike(String value) {
            addCriterion("DELETE_MARK not like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<String> values) {
            addCriterion("DELETE_MARK in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<String> values) {
            addCriterion("DELETE_MARK not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(String value1, String value2) {
            addCriterion("DELETE_MARK between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(String value1, String value2) {
            addCriterion("DELETE_MARK not between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdIsNull() {
            addCriterion("SOLUTION_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdIsNotNull() {
            addCriterion("SOLUTION_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdEqualTo(String value) {
            addCriterion("SOLUTION_MENU_ID =", value, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdNotEqualTo(String value) {
            addCriterion("SOLUTION_MENU_ID <>", value, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdGreaterThan(String value) {
            addCriterion("SOLUTION_MENU_ID >", value, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOLUTION_MENU_ID >=", value, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdLessThan(String value) {
            addCriterion("SOLUTION_MENU_ID <", value, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdLessThanOrEqualTo(String value) {
            addCriterion("SOLUTION_MENU_ID <=", value, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdLike(String value) {
            addCriterion("SOLUTION_MENU_ID like", value, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdNotLike(String value) {
            addCriterion("SOLUTION_MENU_ID not like", value, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdIn(List<String> values) {
            addCriterion("SOLUTION_MENU_ID in", values, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdNotIn(List<String> values) {
            addCriterion("SOLUTION_MENU_ID not in", values, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdBetween(String value1, String value2) {
            addCriterion("SOLUTION_MENU_ID between", value1, value2, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andSolutionMenuIdNotBetween(String value1, String value2) {
            addCriterion("SOLUTION_MENU_ID not between", value1, value2, "solutionMenuId");
            return (Criteria) this;
        }

        public Criteria andFolderIdIsNull() {
            addCriterion("FOLDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFolderIdIsNotNull() {
            addCriterion("FOLDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFolderIdEqualTo(BigDecimal value) {
            addCriterion("FOLDER_ID =", value, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdNotEqualTo(BigDecimal value) {
            addCriterion("FOLDER_ID <>", value, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdGreaterThan(BigDecimal value) {
            addCriterion("FOLDER_ID >", value, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOLDER_ID >=", value, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdLessThan(BigDecimal value) {
            addCriterion("FOLDER_ID <", value, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOLDER_ID <=", value, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdIn(List<BigDecimal> values) {
            addCriterion("FOLDER_ID in", values, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdNotIn(List<BigDecimal> values) {
            addCriterion("FOLDER_ID not in", values, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOLDER_ID between", value1, value2, "folderId");
            return (Criteria) this;
        }

        public Criteria andFolderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOLDER_ID not between", value1, value2, "folderId");
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