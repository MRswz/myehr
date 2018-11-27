package com.myehr.pojo.sysmenu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysSystemSchemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSystemSchemeExample() {
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

        public Criteria andSchemeIdIsNull() {
            addCriterion("SCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIsNotNull() {
            addCriterion("SCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeIdEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID =", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID <>", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThan(BigDecimal value) {
            addCriterion("SCHEME_ID >", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID >=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThan(BigDecimal value) {
            addCriterion("SCHEME_ID <", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_ID <=", value, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdIn(List<BigDecimal> values) {
            addCriterion("SCHEME_ID in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotIn(List<BigDecimal> values) {
            addCriterion("SCHEME_ID not in", values, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_ID between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_ID not between", value1, value2, "schemeId");
            return (Criteria) this;
        }

        public Criteria andSchemeNameIsNull() {
            addCriterion("SCHEME_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSchemeNameIsNotNull() {
            addCriterion("SCHEME_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeNameEqualTo(String value) {
            addCriterion("SCHEME_NAME =", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameNotEqualTo(String value) {
            addCriterion("SCHEME_NAME <>", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameGreaterThan(String value) {
            addCriterion("SCHEME_NAME >", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEME_NAME >=", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameLessThan(String value) {
            addCriterion("SCHEME_NAME <", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameLessThanOrEqualTo(String value) {
            addCriterion("SCHEME_NAME <=", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameLike(String value) {
            addCriterion("SCHEME_NAME like", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameNotLike(String value) {
            addCriterion("SCHEME_NAME not like", value, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameIn(List<String> values) {
            addCriterion("SCHEME_NAME in", values, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameNotIn(List<String> values) {
            addCriterion("SCHEME_NAME not in", values, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameBetween(String value1, String value2) {
            addCriterion("SCHEME_NAME between", value1, value2, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeNameNotBetween(String value1, String value2) {
            addCriterion("SCHEME_NAME not between", value1, value2, "schemeName");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeIsNull() {
            addCriterion("SCHEME_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeIsNotNull() {
            addCriterion("SCHEME_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeEqualTo(String value) {
            addCriterion("SCHEME_CODE =", value, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeNotEqualTo(String value) {
            addCriterion("SCHEME_CODE <>", value, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeGreaterThan(String value) {
            addCriterion("SCHEME_CODE >", value, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEME_CODE >=", value, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeLessThan(String value) {
            addCriterion("SCHEME_CODE <", value, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeLessThanOrEqualTo(String value) {
            addCriterion("SCHEME_CODE <=", value, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeLike(String value) {
            addCriterion("SCHEME_CODE like", value, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeNotLike(String value) {
            addCriterion("SCHEME_CODE not like", value, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeIn(List<String> values) {
            addCriterion("SCHEME_CODE in", values, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeNotIn(List<String> values) {
            addCriterion("SCHEME_CODE not in", values, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeBetween(String value1, String value2) {
            addCriterion("SCHEME_CODE between", value1, value2, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeCodeNotBetween(String value1, String value2) {
            addCriterion("SCHEME_CODE not between", value1, value2, "schemeCode");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeIsNull() {
            addCriterion("SCHEME_DEF_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeIsNotNull() {
            addCriterion("SCHEME_DEF_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeEqualTo(String value) {
            addCriterion("SCHEME_DEF_TYPE =", value, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeNotEqualTo(String value) {
            addCriterion("SCHEME_DEF_TYPE <>", value, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeGreaterThan(String value) {
            addCriterion("SCHEME_DEF_TYPE >", value, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEME_DEF_TYPE >=", value, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeLessThan(String value) {
            addCriterion("SCHEME_DEF_TYPE <", value, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeLessThanOrEqualTo(String value) {
            addCriterion("SCHEME_DEF_TYPE <=", value, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeLike(String value) {
            addCriterion("SCHEME_DEF_TYPE like", value, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeNotLike(String value) {
            addCriterion("SCHEME_DEF_TYPE not like", value, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeIn(List<String> values) {
            addCriterion("SCHEME_DEF_TYPE in", values, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeNotIn(List<String> values) {
            addCriterion("SCHEME_DEF_TYPE not in", values, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeBetween(String value1, String value2) {
            addCriterion("SCHEME_DEF_TYPE between", value1, value2, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSchemeDefTypeNotBetween(String value1, String value2) {
            addCriterion("SCHEME_DEF_TYPE not between", value1, value2, "schemeDefType");
            return (Criteria) this;
        }

        public Criteria andSystemTitleIsNull() {
            addCriterion("SYSTEM_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSystemTitleIsNotNull() {
            addCriterion("SYSTEM_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTitleEqualTo(String value) {
            addCriterion("SYSTEM_TITLE =", value, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleNotEqualTo(String value) {
            addCriterion("SYSTEM_TITLE <>", value, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleGreaterThan(String value) {
            addCriterion("SYSTEM_TITLE >", value, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_TITLE >=", value, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleLessThan(String value) {
            addCriterion("SYSTEM_TITLE <", value, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_TITLE <=", value, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleLike(String value) {
            addCriterion("SYSTEM_TITLE like", value, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleNotLike(String value) {
            addCriterion("SYSTEM_TITLE not like", value, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleIn(List<String> values) {
            addCriterion("SYSTEM_TITLE in", values, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleNotIn(List<String> values) {
            addCriterion("SYSTEM_TITLE not in", values, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleBetween(String value1, String value2) {
            addCriterion("SYSTEM_TITLE between", value1, value2, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemTitleNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_TITLE not between", value1, value2, "systemTitle");
            return (Criteria) this;
        }

        public Criteria andSystemLogIsNull() {
            addCriterion("SYSTEM_LOG is null");
            return (Criteria) this;
        }

        public Criteria andSystemLogIsNotNull() {
            addCriterion("SYSTEM_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andSystemLogEqualTo(String value) {
            addCriterion("SYSTEM_LOG =", value, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogNotEqualTo(String value) {
            addCriterion("SYSTEM_LOG <>", value, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogGreaterThan(String value) {
            addCriterion("SYSTEM_LOG >", value, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_LOG >=", value, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogLessThan(String value) {
            addCriterion("SYSTEM_LOG <", value, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_LOG <=", value, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogLike(String value) {
            addCriterion("SYSTEM_LOG like", value, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogNotLike(String value) {
            addCriterion("SYSTEM_LOG not like", value, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogIn(List<String> values) {
            addCriterion("SYSTEM_LOG in", values, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogNotIn(List<String> values) {
            addCriterion("SYSTEM_LOG not in", values, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogBetween(String value1, String value2) {
            addCriterion("SYSTEM_LOG between", value1, value2, "systemLog");
            return (Criteria) this;
        }

        public Criteria andSystemLogNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_LOG not between", value1, value2, "systemLog");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("DEVICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("DEVICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("DEVICE_TYPE =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("DEVICE_TYPE <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("DEVICE_TYPE >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_TYPE >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("DEVICE_TYPE <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_TYPE <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("DEVICE_TYPE like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("DEVICE_TYPE not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("DEVICE_TYPE in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("DEVICE_TYPE not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("DEVICE_TYPE between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("DEVICE_TYPE not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelIsNull() {
            addCriterion("SCHEME_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelIsNotNull() {
            addCriterion("SCHEME_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelEqualTo(BigDecimal value) {
            addCriterion("SCHEME_LEVEL =", value, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelNotEqualTo(BigDecimal value) {
            addCriterion("SCHEME_LEVEL <>", value, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelGreaterThan(BigDecimal value) {
            addCriterion("SCHEME_LEVEL >", value, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_LEVEL >=", value, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelLessThan(BigDecimal value) {
            addCriterion("SCHEME_LEVEL <", value, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_LEVEL <=", value, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelIn(List<BigDecimal> values) {
            addCriterion("SCHEME_LEVEL in", values, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelNotIn(List<BigDecimal> values) {
            addCriterion("SCHEME_LEVEL not in", values, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_LEVEL between", value1, value2, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andSchemeLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_LEVEL not between", value1, value2, "schemeLevel");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDeskTypeIsNull() {
            addCriterion("DESK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeskTypeIsNotNull() {
            addCriterion("DESK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeskTypeEqualTo(String value) {
            addCriterion("DESK_TYPE =", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeNotEqualTo(String value) {
            addCriterion("DESK_TYPE <>", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeGreaterThan(String value) {
            addCriterion("DESK_TYPE >", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DESK_TYPE >=", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeLessThan(String value) {
            addCriterion("DESK_TYPE <", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeLessThanOrEqualTo(String value) {
            addCriterion("DESK_TYPE <=", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeLike(String value) {
            addCriterion("DESK_TYPE like", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeNotLike(String value) {
            addCriterion("DESK_TYPE not like", value, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeIn(List<String> values) {
            addCriterion("DESK_TYPE in", values, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeNotIn(List<String> values) {
            addCriterion("DESK_TYPE not in", values, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeBetween(String value1, String value2) {
            addCriterion("DESK_TYPE between", value1, value2, "deskType");
            return (Criteria) this;
        }

        public Criteria andDeskTypeNotBetween(String value1, String value2) {
            addCriterion("DESK_TYPE not between", value1, value2, "deskType");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceIsNull() {
            addCriterion("SCHEME_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceIsNotNull() {
            addCriterion("SCHEME_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceEqualTo(String value) {
            addCriterion("SCHEME_SOURCE =", value, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceNotEqualTo(String value) {
            addCriterion("SCHEME_SOURCE <>", value, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceGreaterThan(String value) {
            addCriterion("SCHEME_SOURCE >", value, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEME_SOURCE >=", value, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceLessThan(String value) {
            addCriterion("SCHEME_SOURCE <", value, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceLessThanOrEqualTo(String value) {
            addCriterion("SCHEME_SOURCE <=", value, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceLike(String value) {
            addCriterion("SCHEME_SOURCE like", value, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceNotLike(String value) {
            addCriterion("SCHEME_SOURCE not like", value, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceIn(List<String> values) {
            addCriterion("SCHEME_SOURCE in", values, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceNotIn(List<String> values) {
            addCriterion("SCHEME_SOURCE not in", values, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceBetween(String value1, String value2) {
            addCriterion("SCHEME_SOURCE between", value1, value2, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andSchemeSourceNotBetween(String value1, String value2) {
            addCriterion("SCHEME_SOURCE not between", value1, value2, "schemeSource");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNull() {
            addCriterion("COMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNotNull() {
            addCriterion("COMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompIdEqualTo(String value) {
            addCriterion("COMP_ID =", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotEqualTo(String value) {
            addCriterion("COMP_ID <>", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThan(String value) {
            addCriterion("COMP_ID >", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_ID >=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThan(String value) {
            addCriterion("COMP_ID <", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThanOrEqualTo(String value) {
            addCriterion("COMP_ID <=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLike(String value) {
            addCriterion("COMP_ID like", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotLike(String value) {
            addCriterion("COMP_ID not like", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdIn(List<String> values) {
            addCriterion("COMP_ID in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotIn(List<String> values) {
            addCriterion("COMP_ID not in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdBetween(String value1, String value2) {
            addCriterion("COMP_ID between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotBetween(String value1, String value2) {
            addCriterion("COMP_ID not between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateIsNull() {
            addCriterion("MENU_NAVIGATE is null");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateIsNotNull() {
            addCriterion("MENU_NAVIGATE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateEqualTo(String value) {
            addCriterion("MENU_NAVIGATE =", value, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateNotEqualTo(String value) {
            addCriterion("MENU_NAVIGATE <>", value, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateGreaterThan(String value) {
            addCriterion("MENU_NAVIGATE >", value, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAVIGATE >=", value, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateLessThan(String value) {
            addCriterion("MENU_NAVIGATE <", value, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAVIGATE <=", value, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateLike(String value) {
            addCriterion("MENU_NAVIGATE like", value, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateNotLike(String value) {
            addCriterion("MENU_NAVIGATE not like", value, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateIn(List<String> values) {
            addCriterion("MENU_NAVIGATE in", values, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateNotIn(List<String> values) {
            addCriterion("MENU_NAVIGATE not in", values, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateBetween(String value1, String value2) {
            addCriterion("MENU_NAVIGATE between", value1, value2, "menuNavigate");
            return (Criteria) this;
        }

        public Criteria andMenuNavigateNotBetween(String value1, String value2) {
            addCriterion("MENU_NAVIGATE not between", value1, value2, "menuNavigate");
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