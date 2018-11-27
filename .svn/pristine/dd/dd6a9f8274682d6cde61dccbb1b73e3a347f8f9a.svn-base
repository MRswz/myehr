package com.myehr.pojo.sysmenu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysSystemSchemeMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSystemSchemeMenuExample() {
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

        public Criteria andSchemeMenuIdIsNull() {
            addCriterion("SCHEME_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdIsNotNull() {
            addCriterion("SCHEME_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdEqualTo(BigDecimal value) {
            addCriterion("SCHEME_MENU_ID =", value, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdNotEqualTo(BigDecimal value) {
            addCriterion("SCHEME_MENU_ID <>", value, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdGreaterThan(BigDecimal value) {
            addCriterion("SCHEME_MENU_ID >", value, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_MENU_ID >=", value, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdLessThan(BigDecimal value) {
            addCriterion("SCHEME_MENU_ID <", value, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCHEME_MENU_ID <=", value, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdIn(List<BigDecimal> values) {
            addCriterion("SCHEME_MENU_ID in", values, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdNotIn(List<BigDecimal> values) {
            addCriterion("SCHEME_MENU_ID not in", values, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_MENU_ID between", value1, value2, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSchemeMenuIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCHEME_MENU_ID not between", value1, value2, "schemeMenuId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdIsNull() {
            addCriterion("SYS_SYSTEM_SCHEME_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdIsNotNull() {
            addCriterion("SYS_SYSTEM_SCHEME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdEqualTo(BigDecimal value) {
            addCriterion("SYS_SYSTEM_SCHEME_ID =", value, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdNotEqualTo(BigDecimal value) {
            addCriterion("SYS_SYSTEM_SCHEME_ID <>", value, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdGreaterThan(BigDecimal value) {
            addCriterion("SYS_SYSTEM_SCHEME_ID >", value, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYS_SYSTEM_SCHEME_ID >=", value, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdLessThan(BigDecimal value) {
            addCriterion("SYS_SYSTEM_SCHEME_ID <", value, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYS_SYSTEM_SCHEME_ID <=", value, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdIn(List<BigDecimal> values) {
            addCriterion("SYS_SYSTEM_SCHEME_ID in", values, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdNotIn(List<BigDecimal> values) {
            addCriterion("SYS_SYSTEM_SCHEME_ID not in", values, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYS_SYSTEM_SCHEME_ID between", value1, value2, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andSysSystemSchemeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYS_SYSTEM_SCHEME_ID not between", value1, value2, "sysSystemSchemeId");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIsNull() {
            addCriterion("MENU_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIsNotNull() {
            addCriterion("MENU_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeEqualTo(String value) {
            addCriterion("MENU_CODE =", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotEqualTo(String value) {
            addCriterion("MENU_CODE <>", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThan(String value) {
            addCriterion("MENU_CODE >", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_CODE >=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThan(String value) {
            addCriterion("MENU_CODE <", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThanOrEqualTo(String value) {
            addCriterion("MENU_CODE <=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLike(String value) {
            addCriterion("MENU_CODE like", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotLike(String value) {
            addCriterion("MENU_CODE not like", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIn(List<String> values) {
            addCriterion("MENU_CODE in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotIn(List<String> values) {
            addCriterion("MENU_CODE not in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeBetween(String value1, String value2) {
            addCriterion("MENU_CODE between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotBetween(String value1, String value2) {
            addCriterion("MENU_CODE not between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNull() {
            addCriterion("MENU_DESC is null");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNotNull() {
            addCriterion("MENU_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDescEqualTo(String value) {
            addCriterion("MENU_DESC =", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotEqualTo(String value) {
            addCriterion("MENU_DESC <>", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThan(String value) {
            addCriterion("MENU_DESC >", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_DESC >=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThan(String value) {
            addCriterion("MENU_DESC <", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThanOrEqualTo(String value) {
            addCriterion("MENU_DESC <=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLike(String value) {
            addCriterion("MENU_DESC like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotLike(String value) {
            addCriterion("MENU_DESC not like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescIn(List<String> values) {
            addCriterion("MENU_DESC in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotIn(List<String> values) {
            addCriterion("MENU_DESC not in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescBetween(String value1, String value2) {
            addCriterion("MENU_DESC between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotBetween(String value1, String value2) {
            addCriterion("MENU_DESC not between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("MENU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("MENU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("MENU_TYPE =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("MENU_TYPE <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("MENU_TYPE >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("MENU_TYPE <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("MENU_TYPE like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("MENU_TYPE not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("MENU_TYPE in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("MENU_TYPE not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("MENU_TYPE between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("MENU_TYPE not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeIsNull() {
            addCriterion("MENU_PARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeIsNotNull() {
            addCriterion("MENU_PARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeEqualTo(String value) {
            addCriterion("MENU_PARENT_CODE =", value, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeNotEqualTo(String value) {
            addCriterion("MENU_PARENT_CODE <>", value, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeGreaterThan(String value) {
            addCriterion("MENU_PARENT_CODE >", value, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PARENT_CODE >=", value, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeLessThan(String value) {
            addCriterion("MENU_PARENT_CODE <", value, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeLessThanOrEqualTo(String value) {
            addCriterion("MENU_PARENT_CODE <=", value, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeLike(String value) {
            addCriterion("MENU_PARENT_CODE like", value, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeNotLike(String value) {
            addCriterion("MENU_PARENT_CODE not like", value, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeIn(List<String> values) {
            addCriterion("MENU_PARENT_CODE in", values, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeNotIn(List<String> values) {
            addCriterion("MENU_PARENT_CODE not in", values, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeBetween(String value1, String value2) {
            addCriterion("MENU_PARENT_CODE between", value1, value2, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuParentCodeNotBetween(String value1, String value2) {
            addCriterion("MENU_PARENT_CODE not between", value1, value2, "menuParentCode");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNull() {
            addCriterion("MENU_SORT is null");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNotNull() {
            addCriterion("MENU_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSortEqualTo(Long value) {
            addCriterion("MENU_SORT =", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotEqualTo(Long value) {
            addCriterion("MENU_SORT <>", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThan(Long value) {
            addCriterion("MENU_SORT >", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThanOrEqualTo(Long value) {
            addCriterion("MENU_SORT >=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThan(Long value) {
            addCriterion("MENU_SORT <", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThanOrEqualTo(Long value) {
            addCriterion("MENU_SORT <=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortIn(List<Long> values) {
            addCriterion("MENU_SORT in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotIn(List<Long> values) {
            addCriterion("MENU_SORT not in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortBetween(Long value1, Long value2) {
            addCriterion("MENU_SORT between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotBetween(Long value1, Long value2) {
            addCriterion("MENU_SORT not between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSeqIsNull() {
            addCriterion("MENU_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andMenuSeqIsNotNull() {
            addCriterion("MENU_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSeqEqualTo(String value) {
            addCriterion("MENU_SEQ =", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotEqualTo(String value) {
            addCriterion("MENU_SEQ <>", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqGreaterThan(String value) {
            addCriterion("MENU_SEQ >", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_SEQ >=", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqLessThan(String value) {
            addCriterion("MENU_SEQ <", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqLessThanOrEqualTo(String value) {
            addCriterion("MENU_SEQ <=", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqLike(String value) {
            addCriterion("MENU_SEQ like", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotLike(String value) {
            addCriterion("MENU_SEQ not like", value, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqIn(List<String> values) {
            addCriterion("MENU_SEQ in", values, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotIn(List<String> values) {
            addCriterion("MENU_SEQ not in", values, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqBetween(String value1, String value2) {
            addCriterion("MENU_SEQ between", value1, value2, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuSeqNotBetween(String value1, String value2) {
            addCriterion("MENU_SEQ not between", value1, value2, "menuSeq");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeIsNull() {
            addCriterion("MENU_ICON_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeIsNotNull() {
            addCriterion("MENU_ICON_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeEqualTo(String value) {
            addCriterion("MENU_ICON_CODE =", value, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeNotEqualTo(String value) {
            addCriterion("MENU_ICON_CODE <>", value, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeGreaterThan(String value) {
            addCriterion("MENU_ICON_CODE >", value, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ICON_CODE >=", value, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeLessThan(String value) {
            addCriterion("MENU_ICON_CODE <", value, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeLessThanOrEqualTo(String value) {
            addCriterion("MENU_ICON_CODE <=", value, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeLike(String value) {
            addCriterion("MENU_ICON_CODE like", value, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeNotLike(String value) {
            addCriterion("MENU_ICON_CODE not like", value, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeIn(List<String> values) {
            addCriterion("MENU_ICON_CODE in", values, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeNotIn(List<String> values) {
            addCriterion("MENU_ICON_CODE not in", values, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeBetween(String value1, String value2) {
            addCriterion("MENU_ICON_CODE between", value1, value2, "menuIconCode");
            return (Criteria) this;
        }

        public Criteria andMenuIconCodeNotBetween(String value1, String value2) {
            addCriterion("MENU_ICON_CODE not between", value1, value2, "menuIconCode");
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

        public Criteria andSysMenuIdIsNull() {
            addCriterion("SYS_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdIsNotNull() {
            addCriterion("SYS_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdEqualTo(BigDecimal value) {
            addCriterion("SYS_MENU_ID =", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotEqualTo(BigDecimal value) {
            addCriterion("SYS_MENU_ID <>", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdGreaterThan(BigDecimal value) {
            addCriterion("SYS_MENU_ID >", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYS_MENU_ID >=", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdLessThan(BigDecimal value) {
            addCriterion("SYS_MENU_ID <", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYS_MENU_ID <=", value, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdIn(List<BigDecimal> values) {
            addCriterion("SYS_MENU_ID in", values, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotIn(List<BigDecimal> values) {
            addCriterion("SYS_MENU_ID not in", values, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYS_MENU_ID between", value1, value2, "sysMenuId");
            return (Criteria) this;
        }

        public Criteria andSysMenuIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYS_MENU_ID not between", value1, value2, "sysMenuId");
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

        public Criteria andMenuUrlIsNull() {
            addCriterion("MENU_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("MENU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("MENU_URL =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("MENU_URL <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("MENU_URL >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_URL >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("MENU_URL <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("MENU_URL <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("MENU_URL like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("MENU_URL not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("MENU_URL in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("MENU_URL not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("MENU_URL between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("MENU_URL not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeIsNull() {
            addCriterion("MENU_DICT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeIsNotNull() {
            addCriterion("MENU_DICT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeEqualTo(String value) {
            addCriterion("MENU_DICT_CODE =", value, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeNotEqualTo(String value) {
            addCriterion("MENU_DICT_CODE <>", value, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeGreaterThan(String value) {
            addCriterion("MENU_DICT_CODE >", value, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_DICT_CODE >=", value, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeLessThan(String value) {
            addCriterion("MENU_DICT_CODE <", value, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeLessThanOrEqualTo(String value) {
            addCriterion("MENU_DICT_CODE <=", value, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeLike(String value) {
            addCriterion("MENU_DICT_CODE like", value, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeNotLike(String value) {
            addCriterion("MENU_DICT_CODE not like", value, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeIn(List<String> values) {
            addCriterion("MENU_DICT_CODE in", values, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeNotIn(List<String> values) {
            addCriterion("MENU_DICT_CODE not in", values, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeBetween(String value1, String value2) {
            addCriterion("MENU_DICT_CODE between", value1, value2, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuDictCodeNotBetween(String value1, String value2) {
            addCriterion("MENU_DICT_CODE not between", value1, value2, "menuDictCode");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormIsNull() {
            addCriterion("MENU_IS_DYNAMIC_FORM is null");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormIsNotNull() {
            addCriterion("MENU_IS_DYNAMIC_FORM is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormEqualTo(String value) {
            addCriterion("MENU_IS_DYNAMIC_FORM =", value, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormNotEqualTo(String value) {
            addCriterion("MENU_IS_DYNAMIC_FORM <>", value, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormGreaterThan(String value) {
            addCriterion("MENU_IS_DYNAMIC_FORM >", value, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_IS_DYNAMIC_FORM >=", value, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormLessThan(String value) {
            addCriterion("MENU_IS_DYNAMIC_FORM <", value, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormLessThanOrEqualTo(String value) {
            addCriterion("MENU_IS_DYNAMIC_FORM <=", value, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormLike(String value) {
            addCriterion("MENU_IS_DYNAMIC_FORM like", value, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormNotLike(String value) {
            addCriterion("MENU_IS_DYNAMIC_FORM not like", value, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormIn(List<String> values) {
            addCriterion("MENU_IS_DYNAMIC_FORM in", values, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormNotIn(List<String> values) {
            addCriterion("MENU_IS_DYNAMIC_FORM not in", values, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormBetween(String value1, String value2) {
            addCriterion("MENU_IS_DYNAMIC_FORM between", value1, value2, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuIsDynamicFormNotBetween(String value1, String value2) {
            addCriterion("MENU_IS_DYNAMIC_FORM not between", value1, value2, "menuIsDynamicForm");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdIsNull() {
            addCriterion("MENU_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdIsNotNull() {
            addCriterion("MENU_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdEqualTo(String value) {
            addCriterion("MENU_FORM_ID =", value, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdNotEqualTo(String value) {
            addCriterion("MENU_FORM_ID <>", value, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdGreaterThan(String value) {
            addCriterion("MENU_FORM_ID >", value, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_FORM_ID >=", value, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdLessThan(String value) {
            addCriterion("MENU_FORM_ID <", value, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_FORM_ID <=", value, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdLike(String value) {
            addCriterion("MENU_FORM_ID like", value, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdNotLike(String value) {
            addCriterion("MENU_FORM_ID not like", value, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdIn(List<String> values) {
            addCriterion("MENU_FORM_ID in", values, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdNotIn(List<String> values) {
            addCriterion("MENU_FORM_ID not in", values, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdBetween(String value1, String value2) {
            addCriterion("MENU_FORM_ID between", value1, value2, "menuFormId");
            return (Criteria) this;
        }

        public Criteria andMenuFormIdNotBetween(String value1, String value2) {
            addCriterion("MENU_FORM_ID not between", value1, value2, "menuFormId");
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