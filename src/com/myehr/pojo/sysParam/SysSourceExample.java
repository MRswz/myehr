package com.myehr.pojo.sysParam;

import java.util.ArrayList;
import java.util.List;

public class SysSourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSourceExample() {
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

        public Criteria andSysSourceIdIsNull() {
            addCriterion("SYS_SOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdIsNotNull() {
            addCriterion("SYS_SOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdEqualTo(Long value) {
            addCriterion("SYS_SOURCE_ID =", value, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdNotEqualTo(Long value) {
            addCriterion("SYS_SOURCE_ID <>", value, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdGreaterThan(Long value) {
            addCriterion("SYS_SOURCE_ID >", value, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_SOURCE_ID >=", value, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdLessThan(Long value) {
            addCriterion("SYS_SOURCE_ID <", value, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdLessThanOrEqualTo(Long value) {
            addCriterion("SYS_SOURCE_ID <=", value, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdIn(List<Long> values) {
            addCriterion("SYS_SOURCE_ID in", values, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdNotIn(List<Long> values) {
            addCriterion("SYS_SOURCE_ID not in", values, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdBetween(Long value1, Long value2) {
            addCriterion("SYS_SOURCE_ID between", value1, value2, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceIdNotBetween(Long value1, Long value2) {
            addCriterion("SYS_SOURCE_ID not between", value1, value2, "sysSourceId");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeIsNull() {
            addCriterion("SYS_SOURCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeIsNotNull() {
            addCriterion("SYS_SOURCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeEqualTo(String value) {
            addCriterion("SYS_SOURCE_CODE =", value, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeNotEqualTo(String value) {
            addCriterion("SYS_SOURCE_CODE <>", value, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeGreaterThan(String value) {
            addCriterion("SYS_SOURCE_CODE >", value, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SOURCE_CODE >=", value, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeLessThan(String value) {
            addCriterion("SYS_SOURCE_CODE <", value, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_SOURCE_CODE <=", value, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeLike(String value) {
            addCriterion("SYS_SOURCE_CODE like", value, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeNotLike(String value) {
            addCriterion("SYS_SOURCE_CODE not like", value, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeIn(List<String> values) {
            addCriterion("SYS_SOURCE_CODE in", values, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeNotIn(List<String> values) {
            addCriterion("SYS_SOURCE_CODE not in", values, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeBetween(String value1, String value2) {
            addCriterion("SYS_SOURCE_CODE between", value1, value2, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_SOURCE_CODE not between", value1, value2, "sysSourceCode");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameIsNull() {
            addCriterion("SYS_SOURCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameIsNotNull() {
            addCriterion("SYS_SOURCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameEqualTo(String value) {
            addCriterion("SYS_SOURCE_NAME =", value, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameNotEqualTo(String value) {
            addCriterion("SYS_SOURCE_NAME <>", value, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameGreaterThan(String value) {
            addCriterion("SYS_SOURCE_NAME >", value, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SOURCE_NAME >=", value, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameLessThan(String value) {
            addCriterion("SYS_SOURCE_NAME <", value, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameLessThanOrEqualTo(String value) {
            addCriterion("SYS_SOURCE_NAME <=", value, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameLike(String value) {
            addCriterion("SYS_SOURCE_NAME like", value, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameNotLike(String value) {
            addCriterion("SYS_SOURCE_NAME not like", value, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameIn(List<String> values) {
            addCriterion("SYS_SOURCE_NAME in", values, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameNotIn(List<String> values) {
            addCriterion("SYS_SOURCE_NAME not in", values, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameBetween(String value1, String value2) {
            addCriterion("SYS_SOURCE_NAME between", value1, value2, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSourceNameNotBetween(String value1, String value2) {
            addCriterion("SYS_SOURCE_NAME not between", value1, value2, "sysSourceName");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverIsNull() {
            addCriterion("SYS_SORUCE_DRIVER is null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverIsNotNull() {
            addCriterion("SYS_SORUCE_DRIVER is not null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverEqualTo(String value) {
            addCriterion("SYS_SORUCE_DRIVER =", value, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverNotEqualTo(String value) {
            addCriterion("SYS_SORUCE_DRIVER <>", value, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverGreaterThan(String value) {
            addCriterion("SYS_SORUCE_DRIVER >", value, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_DRIVER >=", value, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverLessThan(String value) {
            addCriterion("SYS_SORUCE_DRIVER <", value, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverLessThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_DRIVER <=", value, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverLike(String value) {
            addCriterion("SYS_SORUCE_DRIVER like", value, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverNotLike(String value) {
            addCriterion("SYS_SORUCE_DRIVER not like", value, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverIn(List<String> values) {
            addCriterion("SYS_SORUCE_DRIVER in", values, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverNotIn(List<String> values) {
            addCriterion("SYS_SORUCE_DRIVER not in", values, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_DRIVER between", value1, value2, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverNotBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_DRIVER not between", value1, value2, "sysSoruceDriver");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueIsNull() {
            addCriterion("SYS_SORUCE_DRIVER_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueIsNotNull() {
            addCriterion("SYS_SORUCE_DRIVER_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueEqualTo(String value) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE =", value, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueNotEqualTo(String value) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE <>", value, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueGreaterThan(String value) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE >", value, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE >=", value, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueLessThan(String value) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE <", value, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueLessThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE <=", value, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueLike(String value) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE like", value, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueNotLike(String value) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE not like", value, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueIn(List<String> values) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE in", values, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueNotIn(List<String> values) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE not in", values, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE between", value1, value2, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceDriverValueNotBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_DRIVER_VALUE not between", value1, value2, "sysSoruceDriverValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlIsNull() {
            addCriterion("SYS_SORUCE_URL is null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlIsNotNull() {
            addCriterion("SYS_SORUCE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlEqualTo(String value) {
            addCriterion("SYS_SORUCE_URL =", value, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlNotEqualTo(String value) {
            addCriterion("SYS_SORUCE_URL <>", value, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlGreaterThan(String value) {
            addCriterion("SYS_SORUCE_URL >", value, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_URL >=", value, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlLessThan(String value) {
            addCriterion("SYS_SORUCE_URL <", value, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlLessThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_URL <=", value, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlLike(String value) {
            addCriterion("SYS_SORUCE_URL like", value, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlNotLike(String value) {
            addCriterion("SYS_SORUCE_URL not like", value, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlIn(List<String> values) {
            addCriterion("SYS_SORUCE_URL in", values, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlNotIn(List<String> values) {
            addCriterion("SYS_SORUCE_URL not in", values, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_URL between", value1, value2, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlNotBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_URL not between", value1, value2, "sysSoruceUrl");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueIsNull() {
            addCriterion("SYS_SORUCE_URL_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueIsNotNull() {
            addCriterion("SYS_SORUCE_URL_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueEqualTo(String value) {
            addCriterion("SYS_SORUCE_URL_VALUE =", value, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueNotEqualTo(String value) {
            addCriterion("SYS_SORUCE_URL_VALUE <>", value, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueGreaterThan(String value) {
            addCriterion("SYS_SORUCE_URL_VALUE >", value, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_URL_VALUE >=", value, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueLessThan(String value) {
            addCriterion("SYS_SORUCE_URL_VALUE <", value, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueLessThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_URL_VALUE <=", value, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueLike(String value) {
            addCriterion("SYS_SORUCE_URL_VALUE like", value, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueNotLike(String value) {
            addCriterion("SYS_SORUCE_URL_VALUE not like", value, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueIn(List<String> values) {
            addCriterion("SYS_SORUCE_URL_VALUE in", values, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueNotIn(List<String> values) {
            addCriterion("SYS_SORUCE_URL_VALUE not in", values, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_URL_VALUE between", value1, value2, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUrlValueNotBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_URL_VALUE not between", value1, value2, "sysSoruceUrlValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameIsNull() {
            addCriterion("SYS_SORUCE_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameIsNotNull() {
            addCriterion("SYS_SORUCE_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameEqualTo(String value) {
            addCriterion("SYS_SORUCE_USERNAME =", value, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameNotEqualTo(String value) {
            addCriterion("SYS_SORUCE_USERNAME <>", value, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameGreaterThan(String value) {
            addCriterion("SYS_SORUCE_USERNAME >", value, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_USERNAME >=", value, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameLessThan(String value) {
            addCriterion("SYS_SORUCE_USERNAME <", value, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameLessThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_USERNAME <=", value, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameLike(String value) {
            addCriterion("SYS_SORUCE_USERNAME like", value, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameNotLike(String value) {
            addCriterion("SYS_SORUCE_USERNAME not like", value, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameIn(List<String> values) {
            addCriterion("SYS_SORUCE_USERNAME in", values, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameNotIn(List<String> values) {
            addCriterion("SYS_SORUCE_USERNAME not in", values, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_USERNAME between", value1, value2, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameNotBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_USERNAME not between", value1, value2, "sysSoruceUsername");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueIsNull() {
            addCriterion("SYS_SORUCE_USERNAME_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueIsNotNull() {
            addCriterion("SYS_SORUCE_USERNAME_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueEqualTo(String value) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE =", value, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueNotEqualTo(String value) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE <>", value, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueGreaterThan(String value) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE >", value, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE >=", value, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueLessThan(String value) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE <", value, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueLessThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE <=", value, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueLike(String value) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE like", value, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueNotLike(String value) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE not like", value, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueIn(List<String> values) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE in", values, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueNotIn(List<String> values) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE not in", values, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE between", value1, value2, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSoruceUsernameValueNotBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_USERNAME_VALUE not between", value1, value2, "sysSoruceUsernameValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordIsNull() {
            addCriterion("SYS_SORUCE_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordIsNotNull() {
            addCriterion("SYS_SORUCE_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordEqualTo(String value) {
            addCriterion("SYS_SORUCE_PASSWORD =", value, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordNotEqualTo(String value) {
            addCriterion("SYS_SORUCE_PASSWORD <>", value, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordGreaterThan(String value) {
            addCriterion("SYS_SORUCE_PASSWORD >", value, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_PASSWORD >=", value, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordLessThan(String value) {
            addCriterion("SYS_SORUCE_PASSWORD <", value, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordLessThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_PASSWORD <=", value, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordLike(String value) {
            addCriterion("SYS_SORUCE_PASSWORD like", value, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordNotLike(String value) {
            addCriterion("SYS_SORUCE_PASSWORD not like", value, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordIn(List<String> values) {
            addCriterion("SYS_SORUCE_PASSWORD in", values, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordNotIn(List<String> values) {
            addCriterion("SYS_SORUCE_PASSWORD not in", values, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_PASSWORD between", value1, value2, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordNotBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_PASSWORD not between", value1, value2, "sysSorucePassword");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueIsNull() {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueIsNotNull() {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueEqualTo(String value) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE =", value, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueNotEqualTo(String value) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE <>", value, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueGreaterThan(String value) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE >", value, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE >=", value, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueLessThan(String value) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE <", value, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueLessThanOrEqualTo(String value) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE <=", value, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueLike(String value) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE like", value, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueNotLike(String value) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE not like", value, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueIn(List<String> values) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE in", values, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueNotIn(List<String> values) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE not in", values, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE between", value1, value2, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSorucePasswordValueNotBetween(String value1, String value2) {
            addCriterion("SYS_SORUCE_PASSWORD_VALUE not between", value1, value2, "sysSorucePasswordValue");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeIsNull() {
            addCriterion("SYS_SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeIsNotNull() {
            addCriterion("SYS_SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeEqualTo(String value) {
            addCriterion("SYS_SOURCE_TYPE =", value, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeNotEqualTo(String value) {
            addCriterion("SYS_SOURCE_TYPE <>", value, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeGreaterThan(String value) {
            addCriterion("SYS_SOURCE_TYPE >", value, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_SOURCE_TYPE >=", value, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeLessThan(String value) {
            addCriterion("SYS_SOURCE_TYPE <", value, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("SYS_SOURCE_TYPE <=", value, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeLike(String value) {
            addCriterion("SYS_SOURCE_TYPE like", value, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeNotLike(String value) {
            addCriterion("SYS_SOURCE_TYPE not like", value, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeIn(List<String> values) {
            addCriterion("SYS_SOURCE_TYPE in", values, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeNotIn(List<String> values) {
            addCriterion("SYS_SOURCE_TYPE not in", values, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeBetween(String value1, String value2) {
            addCriterion("SYS_SOURCE_TYPE between", value1, value2, "sysSourceType");
            return (Criteria) this;
        }

        public Criteria andSysSourceTypeNotBetween(String value1, String value2) {
            addCriterion("SYS_SOURCE_TYPE not between", value1, value2, "sysSourceType");
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