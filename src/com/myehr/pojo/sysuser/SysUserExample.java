package com.myehr.pojo.sysuser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("USER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("USER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("USER_CODE =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("USER_CODE <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("USER_CODE >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CODE >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("USER_CODE <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_CODE <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("USER_CODE like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("USER_CODE not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("USER_CODE in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("USER_CODE not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("USER_CODE between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("USER_CODE not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneIsNull() {
            addCriterion("USER_TALEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneIsNotNull() {
            addCriterion("USER_TALEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneEqualTo(String value) {
            addCriterion("USER_TALEPHONE =", value, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneNotEqualTo(String value) {
            addCriterion("USER_TALEPHONE <>", value, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneGreaterThan(String value) {
            addCriterion("USER_TALEPHONE >", value, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TALEPHONE >=", value, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneLessThan(String value) {
            addCriterion("USER_TALEPHONE <", value, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneLessThanOrEqualTo(String value) {
            addCriterion("USER_TALEPHONE <=", value, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneLike(String value) {
            addCriterion("USER_TALEPHONE like", value, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneNotLike(String value) {
            addCriterion("USER_TALEPHONE not like", value, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneIn(List<String> values) {
            addCriterion("USER_TALEPHONE in", values, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneNotIn(List<String> values) {
            addCriterion("USER_TALEPHONE not in", values, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneBetween(String value1, String value2) {
            addCriterion("USER_TALEPHONE between", value1, value2, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserTalephoneNotBetween(String value1, String value2) {
            addCriterion("USER_TALEPHONE not between", value1, value2, "userTalephone");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("USER_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("USER_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("USER_EMAIL =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("USER_EMAIL <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("USER_EMAIL >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("USER_EMAIL <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("USER_EMAIL <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("USER_EMAIL like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("USER_EMAIL not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("USER_EMAIL in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("USER_EMAIL not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("USER_EMAIL between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("USER_EMAIL not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("USER_STATUS =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("USER_STATUS <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("USER_STATUS >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATUS >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("USER_STATUS <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("USER_STATUS <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("USER_STATUS like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("USER_STATUS not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("USER_STATUS in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("USER_STATUS not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("USER_STATUS between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("USER_STATUS not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartIsNull() {
            addCriterion("USER_TIME_START is null");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartIsNotNull() {
            addCriterion("USER_TIME_START is not null");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartEqualTo(Date value) {
            addCriterion("USER_TIME_START =", value, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartNotEqualTo(Date value) {
            addCriterion("USER_TIME_START <>", value, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartGreaterThan(Date value) {
            addCriterion("USER_TIME_START >", value, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_TIME_START >=", value, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartLessThan(Date value) {
            addCriterion("USER_TIME_START <", value, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("USER_TIME_START <=", value, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartIn(List<Date> values) {
            addCriterion("USER_TIME_START in", values, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartNotIn(List<Date> values) {
            addCriterion("USER_TIME_START not in", values, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartBetween(Date value1, Date value2) {
            addCriterion("USER_TIME_START between", value1, value2, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("USER_TIME_START not between", value1, value2, "userTimeStart");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndIsNull() {
            addCriterion("USER_TIME_END is null");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndIsNotNull() {
            addCriterion("USER_TIME_END is not null");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndEqualTo(Date value) {
            addCriterion("USER_TIME_END =", value, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndNotEqualTo(Date value) {
            addCriterion("USER_TIME_END <>", value, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndGreaterThan(Date value) {
            addCriterion("USER_TIME_END >", value, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_TIME_END >=", value, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndLessThan(Date value) {
            addCriterion("USER_TIME_END <", value, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("USER_TIME_END <=", value, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndIn(List<Date> values) {
            addCriterion("USER_TIME_END in", values, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndNotIn(List<Date> values) {
            addCriterion("USER_TIME_END not in", values, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndBetween(Date value1, Date value2) {
            addCriterion("USER_TIME_END between", value1, value2, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("USER_TIME_END not between", value1, value2, "userTimeEnd");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNull() {
            addCriterion("USER_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNotNull() {
            addCriterion("USER_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStyleEqualTo(String value) {
            addCriterion("USER_STYLE =", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotEqualTo(String value) {
            addCriterion("USER_STYLE <>", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThan(String value) {
            addCriterion("USER_STYLE >", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STYLE >=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThan(String value) {
            addCriterion("USER_STYLE <", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThanOrEqualTo(String value) {
            addCriterion("USER_STYLE <=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLike(String value) {
            addCriterion("USER_STYLE like", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotLike(String value) {
            addCriterion("USER_STYLE not like", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleIn(List<String> values) {
            addCriterion("USER_STYLE in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotIn(List<String> values) {
            addCriterion("USER_STYLE not in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleBetween(String value1, String value2) {
            addCriterion("USER_STYLE between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotBetween(String value1, String value2) {
            addCriterion("USER_STYLE not between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserLastloginIsNull() {
            addCriterion("USER_LASTLOGIN is null");
            return (Criteria) this;
        }

        public Criteria andUserLastloginIsNotNull() {
            addCriterion("USER_LASTLOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastloginEqualTo(Date value) {
            addCriterion("USER_LASTLOGIN =", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginNotEqualTo(Date value) {
            addCriterion("USER_LASTLOGIN <>", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginGreaterThan(Date value) {
            addCriterion("USER_LASTLOGIN >", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_LASTLOGIN >=", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginLessThan(Date value) {
            addCriterion("USER_LASTLOGIN <", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginLessThanOrEqualTo(Date value) {
            addCriterion("USER_LASTLOGIN <=", value, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginIn(List<Date> values) {
            addCriterion("USER_LASTLOGIN in", values, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginNotIn(List<Date> values) {
            addCriterion("USER_LASTLOGIN not in", values, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginBetween(Date value1, Date value2) {
            addCriterion("USER_LASTLOGIN between", value1, value2, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserLastloginNotBetween(Date value1, Date value2) {
            addCriterion("USER_LASTLOGIN not between", value1, value2, "userLastlogin");
            return (Criteria) this;
        }

        public Criteria andUserErrcountIsNull() {
            addCriterion("USER_ERRCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUserErrcountIsNotNull() {
            addCriterion("USER_ERRCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUserErrcountEqualTo(Integer value) {
            addCriterion("USER_ERRCOUNT =", value, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountNotEqualTo(Integer value) {
            addCriterion("USER_ERRCOUNT <>", value, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountGreaterThan(Integer value) {
            addCriterion("USER_ERRCOUNT >", value, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ERRCOUNT >=", value, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountLessThan(Integer value) {
            addCriterion("USER_ERRCOUNT <", value, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ERRCOUNT <=", value, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountIn(List<Integer> values) {
            addCriterion("USER_ERRCOUNT in", values, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountNotIn(List<Integer> values) {
            addCriterion("USER_ERRCOUNT not in", values, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountBetween(Integer value1, Integer value2) {
            addCriterion("USER_ERRCOUNT between", value1, value2, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserErrcountNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ERRCOUNT not between", value1, value2, "userErrcount");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressIsNull() {
            addCriterion("USER_IPADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressIsNotNull() {
            addCriterion("USER_IPADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressEqualTo(String value) {
            addCriterion("USER_IPADDRESS =", value, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressNotEqualTo(String value) {
            addCriterion("USER_IPADDRESS <>", value, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressGreaterThan(String value) {
            addCriterion("USER_IPADDRESS >", value, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IPADDRESS >=", value, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressLessThan(String value) {
            addCriterion("USER_IPADDRESS <", value, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressLessThanOrEqualTo(String value) {
            addCriterion("USER_IPADDRESS <=", value, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressLike(String value) {
            addCriterion("USER_IPADDRESS like", value, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressNotLike(String value) {
            addCriterion("USER_IPADDRESS not like", value, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressIn(List<String> values) {
            addCriterion("USER_IPADDRESS in", values, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressNotIn(List<String> values) {
            addCriterion("USER_IPADDRESS not in", values, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressBetween(String value1, String value2) {
            addCriterion("USER_IPADDRESS between", value1, value2, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserIpaddressNotBetween(String value1, String value2) {
            addCriterion("USER_IPADDRESS not between", value1, value2, "userIpaddress");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNull() {
            addCriterion("USER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNotNull() {
            addCriterion("USER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkEqualTo(String value) {
            addCriterion("USER_REMARK =", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotEqualTo(String value) {
            addCriterion("USER_REMARK <>", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThan(String value) {
            addCriterion("USER_REMARK >", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("USER_REMARK >=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThan(String value) {
            addCriterion("USER_REMARK <", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThanOrEqualTo(String value) {
            addCriterion("USER_REMARK <=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLike(String value) {
            addCriterion("USER_REMARK like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotLike(String value) {
            addCriterion("USER_REMARK not like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIn(List<String> values) {
            addCriterion("USER_REMARK in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotIn(List<String> values) {
            addCriterion("USER_REMARK not in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkBetween(String value1, String value2) {
            addCriterion("USER_REMARK between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotBetween(String value1, String value2) {
            addCriterion("USER_REMARK not between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
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

        public Criteria andOrgUnitIsNull() {
            addCriterion("ORG_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andOrgUnitIsNotNull() {
            addCriterion("ORG_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andOrgUnitEqualTo(String value) {
            addCriterion("ORG_UNIT =", value, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitNotEqualTo(String value) {
            addCriterion("ORG_UNIT <>", value, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitGreaterThan(String value) {
            addCriterion("ORG_UNIT >", value, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_UNIT >=", value, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitLessThan(String value) {
            addCriterion("ORG_UNIT <", value, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitLessThanOrEqualTo(String value) {
            addCriterion("ORG_UNIT <=", value, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitLike(String value) {
            addCriterion("ORG_UNIT like", value, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitNotLike(String value) {
            addCriterion("ORG_UNIT not like", value, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitIn(List<String> values) {
            addCriterion("ORG_UNIT in", values, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitNotIn(List<String> values) {
            addCriterion("ORG_UNIT not in", values, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitBetween(String value1, String value2) {
            addCriterion("ORG_UNIT between", value1, value2, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andOrgUnitNotBetween(String value1, String value2) {
            addCriterion("ORG_UNIT not between", value1, value2, "orgUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitIsNull() {
            addCriterion("AREA_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAreaUnitIsNotNull() {
            addCriterion("AREA_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAreaUnitEqualTo(String value) {
            addCriterion("AREA_UNIT =", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitNotEqualTo(String value) {
            addCriterion("AREA_UNIT <>", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitGreaterThan(String value) {
            addCriterion("AREA_UNIT >", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_UNIT >=", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitLessThan(String value) {
            addCriterion("AREA_UNIT <", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitLessThanOrEqualTo(String value) {
            addCriterion("AREA_UNIT <=", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitLike(String value) {
            addCriterion("AREA_UNIT like", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitNotLike(String value) {
            addCriterion("AREA_UNIT not like", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitIn(List<String> values) {
            addCriterion("AREA_UNIT in", values, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitNotIn(List<String> values) {
            addCriterion("AREA_UNIT not in", values, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitBetween(String value1, String value2) {
            addCriterion("AREA_UNIT between", value1, value2, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitNotBetween(String value1, String value2) {
            addCriterion("AREA_UNIT not between", value1, value2, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitIsNull() {
            addCriterion("PERSON_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPersonUnitIsNotNull() {
            addCriterion("PERSON_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPersonUnitEqualTo(String value) {
            addCriterion("PERSON_UNIT =", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitNotEqualTo(String value) {
            addCriterion("PERSON_UNIT <>", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitGreaterThan(String value) {
            addCriterion("PERSON_UNIT >", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_UNIT >=", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitLessThan(String value) {
            addCriterion("PERSON_UNIT <", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitLessThanOrEqualTo(String value) {
            addCriterion("PERSON_UNIT <=", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitLike(String value) {
            addCriterion("PERSON_UNIT like", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitNotLike(String value) {
            addCriterion("PERSON_UNIT not like", value, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitIn(List<String> values) {
            addCriterion("PERSON_UNIT in", values, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitNotIn(List<String> values) {
            addCriterion("PERSON_UNIT not in", values, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitBetween(String value1, String value2) {
            addCriterion("PERSON_UNIT between", value1, value2, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPersonUnitNotBetween(String value1, String value2) {
            addCriterion("PERSON_UNIT not between", value1, value2, "personUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitIsNull() {
            addCriterion("PAY_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPayUnitIsNotNull() {
            addCriterion("PAY_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPayUnitEqualTo(String value) {
            addCriterion("PAY_UNIT =", value, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitNotEqualTo(String value) {
            addCriterion("PAY_UNIT <>", value, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitGreaterThan(String value) {
            addCriterion("PAY_UNIT >", value, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_UNIT >=", value, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitLessThan(String value) {
            addCriterion("PAY_UNIT <", value, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitLessThanOrEqualTo(String value) {
            addCriterion("PAY_UNIT <=", value, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitLike(String value) {
            addCriterion("PAY_UNIT like", value, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitNotLike(String value) {
            addCriterion("PAY_UNIT not like", value, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitIn(List<String> values) {
            addCriterion("PAY_UNIT in", values, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitNotIn(List<String> values) {
            addCriterion("PAY_UNIT not in", values, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitBetween(String value1, String value2) {
            addCriterion("PAY_UNIT between", value1, value2, "payUnit");
            return (Criteria) this;
        }

        public Criteria andPayUnitNotBetween(String value1, String value2) {
            addCriterion("PAY_UNIT not between", value1, value2, "payUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitIsNull() {
            addCriterion("ATT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAttUnitIsNotNull() {
            addCriterion("ATT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAttUnitEqualTo(String value) {
            addCriterion("ATT_UNIT =", value, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitNotEqualTo(String value) {
            addCriterion("ATT_UNIT <>", value, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitGreaterThan(String value) {
            addCriterion("ATT_UNIT >", value, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ATT_UNIT >=", value, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitLessThan(String value) {
            addCriterion("ATT_UNIT <", value, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitLessThanOrEqualTo(String value) {
            addCriterion("ATT_UNIT <=", value, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitLike(String value) {
            addCriterion("ATT_UNIT like", value, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitNotLike(String value) {
            addCriterion("ATT_UNIT not like", value, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitIn(List<String> values) {
            addCriterion("ATT_UNIT in", values, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitNotIn(List<String> values) {
            addCriterion("ATT_UNIT not in", values, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitBetween(String value1, String value2) {
            addCriterion("ATT_UNIT between", value1, value2, "attUnit");
            return (Criteria) this;
        }

        public Criteria andAttUnitNotBetween(String value1, String value2) {
            addCriterion("ATT_UNIT not between", value1, value2, "attUnit");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyIsNull() {
            addCriterion("PERFORMANCE_UNIY is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyIsNotNull() {
            addCriterion("PERFORMANCE_UNIY is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyEqualTo(String value) {
            addCriterion("PERFORMANCE_UNIY =", value, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyNotEqualTo(String value) {
            addCriterion("PERFORMANCE_UNIY <>", value, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyGreaterThan(String value) {
            addCriterion("PERFORMANCE_UNIY >", value, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyGreaterThanOrEqualTo(String value) {
            addCriterion("PERFORMANCE_UNIY >=", value, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyLessThan(String value) {
            addCriterion("PERFORMANCE_UNIY <", value, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyLessThanOrEqualTo(String value) {
            addCriterion("PERFORMANCE_UNIY <=", value, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyLike(String value) {
            addCriterion("PERFORMANCE_UNIY like", value, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyNotLike(String value) {
            addCriterion("PERFORMANCE_UNIY not like", value, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyIn(List<String> values) {
            addCriterion("PERFORMANCE_UNIY in", values, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyNotIn(List<String> values) {
            addCriterion("PERFORMANCE_UNIY not in", values, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyBetween(String value1, String value2) {
            addCriterion("PERFORMANCE_UNIY between", value1, value2, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andPerformanceUniyNotBetween(String value1, String value2) {
            addCriterion("PERFORMANCE_UNIY not between", value1, value2, "performanceUniy");
            return (Criteria) this;
        }

        public Criteria andProjectUnitIsNull() {
            addCriterion("PROJECT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andProjectUnitIsNotNull() {
            addCriterion("PROJECT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectUnitEqualTo(String value) {
            addCriterion("PROJECT_UNIT =", value, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitNotEqualTo(String value) {
            addCriterion("PROJECT_UNIT <>", value, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitGreaterThan(String value) {
            addCriterion("PROJECT_UNIT >", value, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_UNIT >=", value, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitLessThan(String value) {
            addCriterion("PROJECT_UNIT <", value, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_UNIT <=", value, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitLike(String value) {
            addCriterion("PROJECT_UNIT like", value, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitNotLike(String value) {
            addCriterion("PROJECT_UNIT not like", value, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitIn(List<String> values) {
            addCriterion("PROJECT_UNIT in", values, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitNotIn(List<String> values) {
            addCriterion("PROJECT_UNIT not in", values, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitBetween(String value1, String value2) {
            addCriterion("PROJECT_UNIT between", value1, value2, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andProjectUnitNotBetween(String value1, String value2) {
            addCriterion("PROJECT_UNIT not between", value1, value2, "projectUnit");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIsNull() {
            addCriterion("BUSINESS_LINE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIsNotNull() {
            addCriterion("BUSINESS_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLineEqualTo(String value) {
            addCriterion("BUSINESS_LINE =", value, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineNotEqualTo(String value) {
            addCriterion("BUSINESS_LINE <>", value, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineGreaterThan(String value) {
            addCriterion("BUSINESS_LINE >", value, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LINE >=", value, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineLessThan(String value) {
            addCriterion("BUSINESS_LINE <", value, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LINE <=", value, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineLike(String value) {
            addCriterion("BUSINESS_LINE like", value, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineNotLike(String value) {
            addCriterion("BUSINESS_LINE not like", value, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineIn(List<String> values) {
            addCriterion("BUSINESS_LINE in", values, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineNotIn(List<String> values) {
            addCriterion("BUSINESS_LINE not in", values, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineBetween(String value1, String value2) {
            addCriterion("BUSINESS_LINE between", value1, value2, "businessLine");
            return (Criteria) this;
        }

        public Criteria andBusinessLineNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LINE not between", value1, value2, "businessLine");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNull() {
            addCriterion("SCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNotNull() {
            addCriterion("SCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdEqualTo(String value) {
            addCriterion("SCHEME_ID =", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotEqualTo(String value) {
            addCriterion("SCHEME_ID <>", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThan(String value) {
            addCriterion("SCHEME_ID >", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEME_ID >=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThan(String value) {
            addCriterion("SCHEME_ID <", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThanOrEqualTo(String value) {
            addCriterion("SCHEME_ID <=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLike(String value) {
            addCriterion("SCHEME_ID like", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotLike(String value) {
            addCriterion("SCHEME_ID not like", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIn(List<String> values) {
            addCriterion("SCHEME_ID in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotIn(List<String> values) {
            addCriterion("SCHEME_ID not in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdBetween(String value1, String value2) {
            addCriterion("SCHEME_ID between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotBetween(String value1, String value2) {
            addCriterion("SCHEME_ID not between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andUserIsagentIsNull() {
            addCriterion("USER_ISAGENT is null");
            return (Criteria) this;
        }

        public Criteria andUserIsagentIsNotNull() {
            addCriterion("USER_ISAGENT is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsagentEqualTo(Integer value) {
            addCriterion("USER_ISAGENT =", value, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentNotEqualTo(Integer value) {
            addCriterion("USER_ISAGENT <>", value, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentGreaterThan(Integer value) {
            addCriterion("USER_ISAGENT >", value, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ISAGENT >=", value, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentLessThan(Integer value) {
            addCriterion("USER_ISAGENT <", value, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ISAGENT <=", value, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentIn(List<Integer> values) {
            addCriterion("USER_ISAGENT in", values, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentNotIn(List<Integer> values) {
            addCriterion("USER_ISAGENT not in", values, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentBetween(Integer value1, Integer value2) {
            addCriterion("USER_ISAGENT between", value1, value2, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserIsagentNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ISAGENT not between", value1, value2, "userIsagent");
            return (Criteria) this;
        }

        public Criteria andUserImCodeIsNull() {
            addCriterion("USER_IM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserImCodeIsNotNull() {
            addCriterion("USER_IM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserImCodeEqualTo(String value) {
            addCriterion("USER_IM_CODE =", value, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeNotEqualTo(String value) {
            addCriterion("USER_IM_CODE <>", value, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeGreaterThan(String value) {
            addCriterion("USER_IM_CODE >", value, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IM_CODE >=", value, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeLessThan(String value) {
            addCriterion("USER_IM_CODE <", value, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_IM_CODE <=", value, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeLike(String value) {
            addCriterion("USER_IM_CODE like", value, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeNotLike(String value) {
            addCriterion("USER_IM_CODE not like", value, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeIn(List<String> values) {
            addCriterion("USER_IM_CODE in", values, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeNotIn(List<String> values) {
            addCriterion("USER_IM_CODE not in", values, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeBetween(String value1, String value2) {
            addCriterion("USER_IM_CODE between", value1, value2, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserImCodeNotBetween(String value1, String value2) {
            addCriterion("USER_IM_CODE not between", value1, value2, "userImCode");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIsNull() {
            addCriterion("USER_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIsNotNull() {
            addCriterion("USER_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andUserCategoryEqualTo(Integer value) {
            addCriterion("USER_CATEGORY =", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotEqualTo(Integer value) {
            addCriterion("USER_CATEGORY <>", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryGreaterThan(Integer value) {
            addCriterion("USER_CATEGORY >", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_CATEGORY >=", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryLessThan(Integer value) {
            addCriterion("USER_CATEGORY <", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("USER_CATEGORY <=", value, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryIn(List<Integer> values) {
            addCriterion("USER_CATEGORY in", values, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotIn(List<Integer> values) {
            addCriterion("USER_CATEGORY not in", values, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryBetween(Integer value1, Integer value2) {
            addCriterion("USER_CATEGORY between", value1, value2, "userCategory");
            return (Criteria) this;
        }

        public Criteria andUserCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_CATEGORY not between", value1, value2, "userCategory");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("HEAD is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("HEAD is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("HEAD =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("HEAD <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("HEAD >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("HEAD <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("HEAD <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("HEAD like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("HEAD not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("HEAD in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("HEAD not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("HEAD between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("HEAD not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andComipIsNull() {
            addCriterion("COMIP is null");
            return (Criteria) this;
        }

        public Criteria andComipIsNotNull() {
            addCriterion("COMIP is not null");
            return (Criteria) this;
        }

        public Criteria andComipEqualTo(Integer value) {
            addCriterion("COMIP =", value, "comip");
            return (Criteria) this;
        }

        public Criteria andComipNotEqualTo(Integer value) {
            addCriterion("COMIP <>", value, "comip");
            return (Criteria) this;
        }

        public Criteria andComipGreaterThan(Integer value) {
            addCriterion("COMIP >", value, "comip");
            return (Criteria) this;
        }

        public Criteria andComipGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMIP >=", value, "comip");
            return (Criteria) this;
        }

        public Criteria andComipLessThan(Integer value) {
            addCriterion("COMIP <", value, "comip");
            return (Criteria) this;
        }

        public Criteria andComipLessThanOrEqualTo(Integer value) {
            addCriterion("COMIP <=", value, "comip");
            return (Criteria) this;
        }

        public Criteria andComipIn(List<Integer> values) {
            addCriterion("COMIP in", values, "comip");
            return (Criteria) this;
        }

        public Criteria andComipNotIn(List<Integer> values) {
            addCriterion("COMIP not in", values, "comip");
            return (Criteria) this;
        }

        public Criteria andComipBetween(Integer value1, Integer value2) {
            addCriterion("COMIP between", value1, value2, "comip");
            return (Criteria) this;
        }

        public Criteria andComipNotBetween(Integer value1, Integer value2) {
            addCriterion("COMIP not between", value1, value2, "comip");
            return (Criteria) this;
        }

        public Criteria andDepidIsNull() {
            addCriterion("DEPID is null");
            return (Criteria) this;
        }

        public Criteria andDepidIsNotNull() {
            addCriterion("DEPID is not null");
            return (Criteria) this;
        }

        public Criteria andDepidEqualTo(Integer value) {
            addCriterion("DEPID =", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotEqualTo(Integer value) {
            addCriterion("DEPID <>", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThan(Integer value) {
            addCriterion("DEPID >", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPID >=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThan(Integer value) {
            addCriterion("DEPID <", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidLessThanOrEqualTo(Integer value) {
            addCriterion("DEPID <=", value, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidIn(List<Integer> values) {
            addCriterion("DEPID in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotIn(List<Integer> values) {
            addCriterion("DEPID not in", values, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidBetween(Integer value1, Integer value2) {
            addCriterion("DEPID between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andDepidNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPID not between", value1, value2, "depid");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("JOBID is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("JOBID is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("JOBID =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("JOBID <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("JOBID >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JOBID >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("JOBID <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("JOBID <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("JOBID in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("JOBID not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("JOBID between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("JOBID not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andEmpUnitIsNull() {
            addCriterion("EMP_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andEmpUnitIsNotNull() {
            addCriterion("EMP_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andEmpUnitEqualTo(Integer value) {
            addCriterion("EMP_UNIT =", value, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitNotEqualTo(Integer value) {
            addCriterion("EMP_UNIT <>", value, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitGreaterThan(Integer value) {
            addCriterion("EMP_UNIT >", value, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMP_UNIT >=", value, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitLessThan(Integer value) {
            addCriterion("EMP_UNIT <", value, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitLessThanOrEqualTo(Integer value) {
            addCriterion("EMP_UNIT <=", value, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitIn(List<Integer> values) {
            addCriterion("EMP_UNIT in", values, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitNotIn(List<Integer> values) {
            addCriterion("EMP_UNIT not in", values, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitBetween(Integer value1, Integer value2) {
            addCriterion("EMP_UNIT between", value1, value2, "empUnit");
            return (Criteria) this;
        }

        public Criteria andEmpUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("EMP_UNIT not between", value1, value2, "empUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitIsNull() {
            addCriterion("ATTEND_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAttendUnitIsNotNull() {
            addCriterion("ATTEND_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAttendUnitEqualTo(Integer value) {
            addCriterion("ATTEND_UNIT =", value, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitNotEqualTo(Integer value) {
            addCriterion("ATTEND_UNIT <>", value, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitGreaterThan(Integer value) {
            addCriterion("ATTEND_UNIT >", value, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ATTEND_UNIT >=", value, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitLessThan(Integer value) {
            addCriterion("ATTEND_UNIT <", value, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitLessThanOrEqualTo(Integer value) {
            addCriterion("ATTEND_UNIT <=", value, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitIn(List<Integer> values) {
            addCriterion("ATTEND_UNIT in", values, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitNotIn(List<Integer> values) {
            addCriterion("ATTEND_UNIT not in", values, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitBetween(Integer value1, Integer value2) {
            addCriterion("ATTEND_UNIT between", value1, value2, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andAttendUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("ATTEND_UNIT not between", value1, value2, "attendUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitIsNull() {
            addCriterion("PER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPerUnitIsNotNull() {
            addCriterion("PER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPerUnitEqualTo(Integer value) {
            addCriterion("PER_UNIT =", value, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitNotEqualTo(Integer value) {
            addCriterion("PER_UNIT <>", value, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitGreaterThan(Integer value) {
            addCriterion("PER_UNIT >", value, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("PER_UNIT >=", value, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitLessThan(Integer value) {
            addCriterion("PER_UNIT <", value, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitLessThanOrEqualTo(Integer value) {
            addCriterion("PER_UNIT <=", value, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitIn(List<Integer> values) {
            addCriterion("PER_UNIT in", values, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitNotIn(List<Integer> values) {
            addCriterion("PER_UNIT not in", values, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitBetween(Integer value1, Integer value2) {
            addCriterion("PER_UNIT between", value1, value2, "perUnit");
            return (Criteria) this;
        }

        public Criteria andPerUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("PER_UNIT not between", value1, value2, "perUnit");
            return (Criteria) this;
        }

        public Criteria andLimitIpIsNull() {
            addCriterion("Limit_IP is null");
            return (Criteria) this;
        }

        public Criteria andLimitIpIsNotNull() {
            addCriterion("Limit_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLimitIpEqualTo(String value) {
            addCriterion("Limit_IP =", value, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpNotEqualTo(String value) {
            addCriterion("Limit_IP <>", value, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpGreaterThan(String value) {
            addCriterion("Limit_IP >", value, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpGreaterThanOrEqualTo(String value) {
            addCriterion("Limit_IP >=", value, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpLessThan(String value) {
            addCriterion("Limit_IP <", value, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpLessThanOrEqualTo(String value) {
            addCriterion("Limit_IP <=", value, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpLike(String value) {
            addCriterion("Limit_IP like", value, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpNotLike(String value) {
            addCriterion("Limit_IP not like", value, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpIn(List<String> values) {
            addCriterion("Limit_IP in", values, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpNotIn(List<String> values) {
            addCriterion("Limit_IP not in", values, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpBetween(String value1, String value2) {
            addCriterion("Limit_IP between", value1, value2, "limitIp");
            return (Criteria) this;
        }

        public Criteria andLimitIpNotBetween(String value1, String value2) {
            addCriterion("Limit_IP not between", value1, value2, "limitIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNull() {
            addCriterion("USER_IP is null");
            return (Criteria) this;
        }

        public Criteria andUserIpIsNotNull() {
            addCriterion("USER_IP is not null");
            return (Criteria) this;
        }

        public Criteria andUserIpEqualTo(String value) {
            addCriterion("USER_IP =", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotEqualTo(String value) {
            addCriterion("USER_IP <>", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThan(String value) {
            addCriterion("USER_IP >", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpGreaterThanOrEqualTo(String value) {
            addCriterion("USER_IP >=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThan(String value) {
            addCriterion("USER_IP <", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLessThanOrEqualTo(String value) {
            addCriterion("USER_IP <=", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpLike(String value) {
            addCriterion("USER_IP like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotLike(String value) {
            addCriterion("USER_IP not like", value, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpIn(List<String> values) {
            addCriterion("USER_IP in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotIn(List<String> values) {
            addCriterion("USER_IP not in", values, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpBetween(String value1, String value2) {
            addCriterion("USER_IP between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andUserIpNotBetween(String value1, String value2) {
            addCriterion("USER_IP not between", value1, value2, "userIp");
            return (Criteria) this;
        }

        public Criteria andDigitalIsNull() {
            addCriterion("DIGITAL is null");
            return (Criteria) this;
        }

        public Criteria andDigitalIsNotNull() {
            addCriterion("DIGITAL is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalEqualTo(String value) {
            addCriterion("DIGITAL =", value, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalNotEqualTo(String value) {
            addCriterion("DIGITAL <>", value, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalGreaterThan(String value) {
            addCriterion("DIGITAL >", value, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalGreaterThanOrEqualTo(String value) {
            addCriterion("DIGITAL >=", value, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalLessThan(String value) {
            addCriterion("DIGITAL <", value, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalLessThanOrEqualTo(String value) {
            addCriterion("DIGITAL <=", value, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalLike(String value) {
            addCriterion("DIGITAL like", value, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalNotLike(String value) {
            addCriterion("DIGITAL not like", value, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalIn(List<String> values) {
            addCriterion("DIGITAL in", values, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalNotIn(List<String> values) {
            addCriterion("DIGITAL not in", values, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalBetween(String value1, String value2) {
            addCriterion("DIGITAL between", value1, value2, "digital");
            return (Criteria) this;
        }

        public Criteria andDigitalNotBetween(String value1, String value2) {
            addCriterion("DIGITAL not between", value1, value2, "digital");
            return (Criteria) this;
        }

        public Criteria andLockingTimeIsNull() {
            addCriterion("LOCKING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLockingTimeIsNotNull() {
            addCriterion("LOCKING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLockingTimeEqualTo(Date value) {
            addCriterion("LOCKING_TIME =", value, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeNotEqualTo(Date value) {
            addCriterion("LOCKING_TIME <>", value, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeGreaterThan(Date value) {
            addCriterion("LOCKING_TIME >", value, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCKING_TIME >=", value, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeLessThan(Date value) {
            addCriterion("LOCKING_TIME <", value, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOCKING_TIME <=", value, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeIn(List<Date> values) {
            addCriterion("LOCKING_TIME in", values, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeNotIn(List<Date> values) {
            addCriterion("LOCKING_TIME not in", values, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeBetween(Date value1, Date value2) {
            addCriterion("LOCKING_TIME between", value1, value2, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andLockingTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOCKING_TIME not between", value1, value2, "lockingTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIsNull() {
            addCriterion("UNLOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIsNotNull() {
            addCriterion("UNLOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeEqualTo(Date value) {
            addCriterion("UNLOCK_TIME =", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotEqualTo(Date value) {
            addCriterion("UNLOCK_TIME <>", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeGreaterThan(Date value) {
            addCriterion("UNLOCK_TIME >", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UNLOCK_TIME >=", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeLessThan(Date value) {
            addCriterion("UNLOCK_TIME <", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeLessThanOrEqualTo(Date value) {
            addCriterion("UNLOCK_TIME <=", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIn(List<Date> values) {
            addCriterion("UNLOCK_TIME in", values, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotIn(List<Date> values) {
            addCriterion("UNLOCK_TIME not in", values, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeBetween(Date value1, Date value2) {
            addCriterion("UNLOCK_TIME between", value1, value2, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotBetween(Date value1, Date value2) {
            addCriterion("UNLOCK_TIME not between", value1, value2, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andNailImIsNull() {
            addCriterion("NAIL_IM is null");
            return (Criteria) this;
        }

        public Criteria andNailImIsNotNull() {
            addCriterion("NAIL_IM is not null");
            return (Criteria) this;
        }

        public Criteria andNailImEqualTo(String value) {
            addCriterion("NAIL_IM =", value, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImNotEqualTo(String value) {
            addCriterion("NAIL_IM <>", value, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImGreaterThan(String value) {
            addCriterion("NAIL_IM >", value, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImGreaterThanOrEqualTo(String value) {
            addCriterion("NAIL_IM >=", value, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImLessThan(String value) {
            addCriterion("NAIL_IM <", value, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImLessThanOrEqualTo(String value) {
            addCriterion("NAIL_IM <=", value, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImLike(String value) {
            addCriterion("NAIL_IM like", value, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImNotLike(String value) {
            addCriterion("NAIL_IM not like", value, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImIn(List<String> values) {
            addCriterion("NAIL_IM in", values, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImNotIn(List<String> values) {
            addCriterion("NAIL_IM not in", values, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImBetween(String value1, String value2) {
            addCriterion("NAIL_IM between", value1, value2, "nailIm");
            return (Criteria) this;
        }

        public Criteria andNailImNotBetween(String value1, String value2) {
            addCriterion("NAIL_IM not between", value1, value2, "nailIm");
            return (Criteria) this;
        }

        public Criteria andWechatImIsNull() {
            addCriterion("WECHAT_IM is null");
            return (Criteria) this;
        }

        public Criteria andWechatImIsNotNull() {
            addCriterion("WECHAT_IM is not null");
            return (Criteria) this;
        }

        public Criteria andWechatImEqualTo(String value) {
            addCriterion("WECHAT_IM =", value, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImNotEqualTo(String value) {
            addCriterion("WECHAT_IM <>", value, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImGreaterThan(String value) {
            addCriterion("WECHAT_IM >", value, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT_IM >=", value, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImLessThan(String value) {
            addCriterion("WECHAT_IM <", value, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImLessThanOrEqualTo(String value) {
            addCriterion("WECHAT_IM <=", value, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImLike(String value) {
            addCriterion("WECHAT_IM like", value, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImNotLike(String value) {
            addCriterion("WECHAT_IM not like", value, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImIn(List<String> values) {
            addCriterion("WECHAT_IM in", values, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImNotIn(List<String> values) {
            addCriterion("WECHAT_IM not in", values, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImBetween(String value1, String value2) {
            addCriterion("WECHAT_IM between", value1, value2, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andWechatImNotBetween(String value1, String value2) {
            addCriterion("WECHAT_IM not between", value1, value2, "wechatIm");
            return (Criteria) this;
        }

        public Criteria andTencentImIsNull() {
            addCriterion("TENCENT_IM is null");
            return (Criteria) this;
        }

        public Criteria andTencentImIsNotNull() {
            addCriterion("TENCENT_IM is not null");
            return (Criteria) this;
        }

        public Criteria andTencentImEqualTo(String value) {
            addCriterion("TENCENT_IM =", value, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImNotEqualTo(String value) {
            addCriterion("TENCENT_IM <>", value, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImGreaterThan(String value) {
            addCriterion("TENCENT_IM >", value, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImGreaterThanOrEqualTo(String value) {
            addCriterion("TENCENT_IM >=", value, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImLessThan(String value) {
            addCriterion("TENCENT_IM <", value, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImLessThanOrEqualTo(String value) {
            addCriterion("TENCENT_IM <=", value, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImLike(String value) {
            addCriterion("TENCENT_IM like", value, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImNotLike(String value) {
            addCriterion("TENCENT_IM not like", value, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImIn(List<String> values) {
            addCriterion("TENCENT_IM in", values, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImNotIn(List<String> values) {
            addCriterion("TENCENT_IM not in", values, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImBetween(String value1, String value2) {
            addCriterion("TENCENT_IM between", value1, value2, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andTencentImNotBetween(String value1, String value2) {
            addCriterion("TENCENT_IM not between", value1, value2, "tencentIm");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentIsNull() {
            addCriterion("USER_EQUIPMENT is null");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentIsNotNull() {
            addCriterion("USER_EQUIPMENT is not null");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentEqualTo(String value) {
            addCriterion("USER_EQUIPMENT =", value, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentNotEqualTo(String value) {
            addCriterion("USER_EQUIPMENT <>", value, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentGreaterThan(String value) {
            addCriterion("USER_EQUIPMENT >", value, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EQUIPMENT >=", value, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentLessThan(String value) {
            addCriterion("USER_EQUIPMENT <", value, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentLessThanOrEqualTo(String value) {
            addCriterion("USER_EQUIPMENT <=", value, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentLike(String value) {
            addCriterion("USER_EQUIPMENT like", value, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentNotLike(String value) {
            addCriterion("USER_EQUIPMENT not like", value, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentIn(List<String> values) {
            addCriterion("USER_EQUIPMENT in", values, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentNotIn(List<String> values) {
            addCriterion("USER_EQUIPMENT not in", values, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentBetween(String value1, String value2) {
            addCriterion("USER_EQUIPMENT between", value1, value2, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andUserEquipmentNotBetween(String value1, String value2) {
            addCriterion("USER_EQUIPMENT not between", value1, value2, "userEquipment");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeIsNull() {
            addCriterion("PASSWORD_WARNING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeIsNotNull() {
            addCriterion("PASSWORD_WARNING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeEqualTo(Date value) {
            addCriterion("PASSWORD_WARNING_TIME =", value, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeNotEqualTo(Date value) {
            addCriterion("PASSWORD_WARNING_TIME <>", value, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeGreaterThan(Date value) {
            addCriterion("PASSWORD_WARNING_TIME >", value, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PASSWORD_WARNING_TIME >=", value, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeLessThan(Date value) {
            addCriterion("PASSWORD_WARNING_TIME <", value, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeLessThanOrEqualTo(Date value) {
            addCriterion("PASSWORD_WARNING_TIME <=", value, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeIn(List<Date> values) {
            addCriterion("PASSWORD_WARNING_TIME in", values, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeNotIn(List<Date> values) {
            addCriterion("PASSWORD_WARNING_TIME not in", values, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeBetween(Date value1, Date value2) {
            addCriterion("PASSWORD_WARNING_TIME between", value1, value2, "passwordWarningTime");
            return (Criteria) this;
        }

        public Criteria andPasswordWarningTimeNotBetween(Date value1, Date value2) {
            addCriterion("PASSWORD_WARNING_TIME not between", value1, value2, "passwordWarningTime");
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