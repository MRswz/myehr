package com.myehr.pojo.sysRole;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(BigDecimal value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(BigDecimal value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<BigDecimal> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<BigDecimal> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNull() {
            addCriterion("ROLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNotNull() {
            addCriterion("ROLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("ROLE_CODE =", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("ROLE_CODE <>", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("ROLE_CODE >", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_CODE >=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("ROLE_CODE <", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("ROLE_CODE <=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLike(String value) {
            addCriterion("ROLE_CODE like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotLike(String value) {
            addCriterion("ROLE_CODE not like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIn(List<String> values) {
            addCriterion("ROLE_CODE in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotIn(List<String> values) {
            addCriterion("ROLE_CODE not in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("ROLE_CODE between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("ROLE_CODE not between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleDescIsNull() {
            addCriterion("ROLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRoleDescIsNotNull() {
            addCriterion("ROLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDescEqualTo(String value) {
            addCriterion("ROLE_DESC =", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotEqualTo(String value) {
            addCriterion("ROLE_DESC <>", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescGreaterThan(String value) {
            addCriterion("ROLE_DESC >", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_DESC >=", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLessThan(String value) {
            addCriterion("ROLE_DESC <", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLessThanOrEqualTo(String value) {
            addCriterion("ROLE_DESC <=", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescLike(String value) {
            addCriterion("ROLE_DESC like", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotLike(String value) {
            addCriterion("ROLE_DESC not like", value, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescIn(List<String> values) {
            addCriterion("ROLE_DESC in", values, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotIn(List<String> values) {
            addCriterion("ROLE_DESC not in", values, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescBetween(String value1, String value2) {
            addCriterion("ROLE_DESC between", value1, value2, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleDescNotBetween(String value1, String value2) {
            addCriterion("ROLE_DESC not between", value1, value2, "roleDesc");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNull() {
            addCriterion("ROLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("ROLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(String value) {
            addCriterion("ROLE_TYPE =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(String value) {
            addCriterion("ROLE_TYPE <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(String value) {
            addCriterion("ROLE_TYPE >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_TYPE >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(String value) {
            addCriterion("ROLE_TYPE <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("ROLE_TYPE <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLike(String value) {
            addCriterion("ROLE_TYPE like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotLike(String value) {
            addCriterion("ROLE_TYPE not like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<String> values) {
            addCriterion("ROLE_TYPE in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<String> values) {
            addCriterion("ROLE_TYPE not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(String value1, String value2) {
            addCriterion("ROLE_TYPE between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(String value1, String value2) {
            addCriterion("ROLE_TYPE not between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeIsNull() {
            addCriterion("ROLE_PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeIsNotNull() {
            addCriterion("ROLE_PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeEqualTo(String value) {
            addCriterion("ROLE_PARENT_CODE =", value, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeNotEqualTo(String value) {
            addCriterion("ROLE_PARENT_CODE <>", value, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeGreaterThan(String value) {
            addCriterion("ROLE_PARENT_CODE >", value, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_PARENT_CODE >=", value, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeLessThan(String value) {
            addCriterion("ROLE_PARENT_CODE <", value, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeLessThanOrEqualTo(String value) {
            addCriterion("ROLE_PARENT_CODE <=", value, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeLike(String value) {
            addCriterion("ROLE_PARENT_CODE like", value, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeNotLike(String value) {
            addCriterion("ROLE_PARENT_CODE not like", value, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeIn(List<String> values) {
            addCriterion("ROLE_PARENT_CODE in", values, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeNotIn(List<String> values) {
            addCriterion("ROLE_PARENT_CODE not in", values, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeBetween(String value1, String value2) {
            addCriterion("ROLE_PARENT_CODE between", value1, value2, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleParentCodeNotBetween(String value1, String value2) {
            addCriterion("ROLE_PARENT_CODE not between", value1, value2, "roleParentCode");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIsNull() {
            addCriterion("ROLE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIsNotNull() {
            addCriterion("ROLE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRoleStatusEqualTo(String value) {
            addCriterion("ROLE_STATUS =", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotEqualTo(String value) {
            addCriterion("ROLE_STATUS <>", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusGreaterThan(String value) {
            addCriterion("ROLE_STATUS >", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_STATUS >=", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLessThan(String value) {
            addCriterion("ROLE_STATUS <", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLessThanOrEqualTo(String value) {
            addCriterion("ROLE_STATUS <=", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusLike(String value) {
            addCriterion("ROLE_STATUS like", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotLike(String value) {
            addCriterion("ROLE_STATUS not like", value, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusIn(List<String> values) {
            addCriterion("ROLE_STATUS in", values, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotIn(List<String> values) {
            addCriterion("ROLE_STATUS not in", values, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusBetween(String value1, String value2) {
            addCriterion("ROLE_STATUS between", value1, value2, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleStatusNotBetween(String value1, String value2) {
            addCriterion("ROLE_STATUS not between", value1, value2, "roleStatus");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartIsNull() {
            addCriterion("ROLE_TIME_START is null");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartIsNotNull() {
            addCriterion("ROLE_TIME_START is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartEqualTo(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_START =", value, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_START <>", value, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartGreaterThan(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_START >", value, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_START >=", value, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartLessThan(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_START <", value, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_START <=", value, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartIn(List<Date> values) {
            addCriterionForJDBCDate("ROLE_TIME_START in", values, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("ROLE_TIME_START not in", values, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ROLE_TIME_START between", value1, value2, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ROLE_TIME_START not between", value1, value2, "roleTimeStart");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndIsNull() {
            addCriterion("ROLE_TIME_END is null");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndIsNotNull() {
            addCriterion("ROLE_TIME_END is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndEqualTo(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_END =", value, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_END <>", value, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndGreaterThan(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_END >", value, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_END >=", value, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndLessThan(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_END <", value, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ROLE_TIME_END <=", value, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndIn(List<Date> values) {
            addCriterionForJDBCDate("ROLE_TIME_END in", values, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("ROLE_TIME_END not in", values, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ROLE_TIME_END between", value1, value2, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleTimeEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ROLE_TIME_END not between", value1, value2, "roleTimeEnd");
            return (Criteria) this;
        }

        public Criteria andRoleSeqIsNull() {
            addCriterion("ROLE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRoleSeqIsNotNull() {
            addCriterion("ROLE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSeqEqualTo(String value) {
            addCriterion("ROLE_SEQ =", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqNotEqualTo(String value) {
            addCriterion("ROLE_SEQ <>", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqGreaterThan(String value) {
            addCriterion("ROLE_SEQ >", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_SEQ >=", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqLessThan(String value) {
            addCriterion("ROLE_SEQ <", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqLessThanOrEqualTo(String value) {
            addCriterion("ROLE_SEQ <=", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqLike(String value) {
            addCriterion("ROLE_SEQ like", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqNotLike(String value) {
            addCriterion("ROLE_SEQ not like", value, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqIn(List<String> values) {
            addCriterion("ROLE_SEQ in", values, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqNotIn(List<String> values) {
            addCriterion("ROLE_SEQ not in", values, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqBetween(String value1, String value2) {
            addCriterion("ROLE_SEQ between", value1, value2, "roleSeq");
            return (Criteria) this;
        }

        public Criteria andRoleSeqNotBetween(String value1, String value2) {
            addCriterion("ROLE_SEQ not between", value1, value2, "roleSeq");
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

        public Criteria andOperatorTimeIsNull() {
            addCriterion("OPERATOR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNotNull() {
            addCriterion("OPERATOR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME =", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME <>", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME >", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME >=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThan(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME <", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("OPERATOR_TIME <=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATOR_TIME in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("OPERATOR_TIME not in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATOR_TIME between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("OPERATOR_TIME not between", value1, value2, "operatorTime");
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

        public Criteria andApproveTimeIsNull() {
            addCriterion("APPROVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIsNotNull() {
            addCriterion("APPROVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andApproveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("APPROVE_TIME =", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("APPROVE_TIME <>", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("APPROVE_TIME >", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPROVE_TIME >=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThan(Date value) {
            addCriterionForJDBCDate("APPROVE_TIME <", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPROVE_TIME <=", value, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("APPROVE_TIME in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("APPROVE_TIME not in", values, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPROVE_TIME between", value1, value2, "approveTime");
            return (Criteria) this;
        }

        public Criteria andApproveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPROVE_TIME not between", value1, value2, "approveTime");
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

        public Criteria andDeleteMarkBackIsNull() {
            addCriterion("DELETE_MARK_BACK is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackIsNotNull() {
            addCriterion("DELETE_MARK_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackEqualTo(String value) {
            addCriterion("DELETE_MARK_BACK =", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackNotEqualTo(String value) {
            addCriterion("DELETE_MARK_BACK <>", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackGreaterThan(String value) {
            addCriterion("DELETE_MARK_BACK >", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK_BACK >=", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackLessThan(String value) {
            addCriterion("DELETE_MARK_BACK <", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackLessThanOrEqualTo(String value) {
            addCriterion("DELETE_MARK_BACK <=", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackLike(String value) {
            addCriterion("DELETE_MARK_BACK like", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackNotLike(String value) {
            addCriterion("DELETE_MARK_BACK not like", value, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackIn(List<String> values) {
            addCriterion("DELETE_MARK_BACK in", values, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackNotIn(List<String> values) {
            addCriterion("DELETE_MARK_BACK not in", values, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackBetween(String value1, String value2) {
            addCriterion("DELETE_MARK_BACK between", value1, value2, "deleteMarkBack");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBackNotBetween(String value1, String value2) {
            addCriterion("DELETE_MARK_BACK not between", value1, value2, "deleteMarkBack");
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