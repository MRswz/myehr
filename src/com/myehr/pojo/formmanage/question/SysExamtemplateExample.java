package com.myehr.pojo.formmanage.question;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysExamtemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysExamtemplateExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("CNAME is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("CNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("CNAME =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("CNAME <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("CNAME >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("CNAME >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("CNAME <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("CNAME <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("CNAME like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("CNAME not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("CNAME in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("CNAME not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("CNAME between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("CNAME not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ENAME is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ENAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ENAME =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ENAME <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ENAME >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENAME >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ENAME <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ENAME <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ENAME like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ENAME not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ENAME in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ENAME not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ENAME between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ENAME not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andBegindescIsNull() {
            addCriterion("BEGINDESC is null");
            return (Criteria) this;
        }

        public Criteria andBegindescIsNotNull() {
            addCriterion("BEGINDESC is not null");
            return (Criteria) this;
        }

        public Criteria andBegindescEqualTo(String value) {
            addCriterion("BEGINDESC =", value, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescNotEqualTo(String value) {
            addCriterion("BEGINDESC <>", value, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescGreaterThan(String value) {
            addCriterion("BEGINDESC >", value, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescGreaterThanOrEqualTo(String value) {
            addCriterion("BEGINDESC >=", value, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescLessThan(String value) {
            addCriterion("BEGINDESC <", value, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescLessThanOrEqualTo(String value) {
            addCriterion("BEGINDESC <=", value, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescLike(String value) {
            addCriterion("BEGINDESC like", value, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescNotLike(String value) {
            addCriterion("BEGINDESC not like", value, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescIn(List<String> values) {
            addCriterion("BEGINDESC in", values, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescNotIn(List<String> values) {
            addCriterion("BEGINDESC not in", values, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescBetween(String value1, String value2) {
            addCriterion("BEGINDESC between", value1, value2, "begindesc");
            return (Criteria) this;
        }

        public Criteria andBegindescNotBetween(String value1, String value2) {
            addCriterion("BEGINDESC not between", value1, value2, "begindesc");
            return (Criteria) this;
        }

        public Criteria andEnddescIsNull() {
            addCriterion("ENDDESC is null");
            return (Criteria) this;
        }

        public Criteria andEnddescIsNotNull() {
            addCriterion("ENDDESC is not null");
            return (Criteria) this;
        }

        public Criteria andEnddescEqualTo(String value) {
            addCriterion("ENDDESC =", value, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescNotEqualTo(String value) {
            addCriterion("ENDDESC <>", value, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescGreaterThan(String value) {
            addCriterion("ENDDESC >", value, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescGreaterThanOrEqualTo(String value) {
            addCriterion("ENDDESC >=", value, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescLessThan(String value) {
            addCriterion("ENDDESC <", value, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescLessThanOrEqualTo(String value) {
            addCriterion("ENDDESC <=", value, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescLike(String value) {
            addCriterion("ENDDESC like", value, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescNotLike(String value) {
            addCriterion("ENDDESC not like", value, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescIn(List<String> values) {
            addCriterion("ENDDESC in", values, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescNotIn(List<String> values) {
            addCriterion("ENDDESC not in", values, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescBetween(String value1, String value2) {
            addCriterion("ENDDESC between", value1, value2, "enddesc");
            return (Criteria) this;
        }

        public Criteria andEnddescNotBetween(String value1, String value2) {
            addCriterion("ENDDESC not between", value1, value2, "enddesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescIsNull() {
            addCriterion("TEMPLATEDESC is null");
            return (Criteria) this;
        }

        public Criteria andTemplatedescIsNotNull() {
            addCriterion("TEMPLATEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatedescEqualTo(String value) {
            addCriterion("TEMPLATEDESC =", value, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescNotEqualTo(String value) {
            addCriterion("TEMPLATEDESC <>", value, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescGreaterThan(String value) {
            addCriterion("TEMPLATEDESC >", value, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATEDESC >=", value, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescLessThan(String value) {
            addCriterion("TEMPLATEDESC <", value, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATEDESC <=", value, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescLike(String value) {
            addCriterion("TEMPLATEDESC like", value, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescNotLike(String value) {
            addCriterion("TEMPLATEDESC not like", value, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescIn(List<String> values) {
            addCriterion("TEMPLATEDESC in", values, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescNotIn(List<String> values) {
            addCriterion("TEMPLATEDESC not in", values, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescBetween(String value1, String value2) {
            addCriterion("TEMPLATEDESC between", value1, value2, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andTemplatedescNotBetween(String value1, String value2) {
            addCriterion("TEMPLATEDESC not between", value1, value2, "templatedesc");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andMarkTypeIsNull() {
            addCriterion("MARK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMarkTypeIsNotNull() {
            addCriterion("MARK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMarkTypeEqualTo(String value) {
            addCriterion("MARK_TYPE =", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotEqualTo(String value) {
            addCriterion("MARK_TYPE <>", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeGreaterThan(String value) {
            addCriterion("MARK_TYPE >", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MARK_TYPE >=", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLessThan(String value) {
            addCriterion("MARK_TYPE <", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLessThanOrEqualTo(String value) {
            addCriterion("MARK_TYPE <=", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLike(String value) {
            addCriterion("MARK_TYPE like", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotLike(String value) {
            addCriterion("MARK_TYPE not like", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeIn(List<String> values) {
            addCriterion("MARK_TYPE in", values, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotIn(List<String> values) {
            addCriterion("MARK_TYPE not in", values, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeBetween(String value1, String value2) {
            addCriterion("MARK_TYPE between", value1, value2, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotBetween(String value1, String value2) {
            addCriterion("MARK_TYPE not between", value1, value2, "markType");
            return (Criteria) this;
        }

        public Criteria andCountNumberIsNull() {
            addCriterion("COUNT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCountNumberIsNotNull() {
            addCriterion("COUNT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCountNumberEqualTo(Integer value) {
            addCriterion("COUNT_NUMBER =", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberNotEqualTo(Integer value) {
            addCriterion("COUNT_NUMBER <>", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberGreaterThan(Integer value) {
            addCriterion("COUNT_NUMBER >", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_NUMBER >=", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberLessThan(Integer value) {
            addCriterion("COUNT_NUMBER <", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_NUMBER <=", value, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberIn(List<Integer> values) {
            addCriterion("COUNT_NUMBER in", values, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberNotIn(List<Integer> values) {
            addCriterion("COUNT_NUMBER not in", values, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_NUMBER between", value1, value2, "countNumber");
            return (Criteria) this;
        }

        public Criteria andCountNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_NUMBER not between", value1, value2, "countNumber");
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