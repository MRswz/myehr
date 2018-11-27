package com.myehr.pojo.formmanage.template;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysTemplateModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTemplateModelExample() {
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIsNull() {
            addCriterion("TEMPLATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIsNotNull() {
            addCriterion("TEMPLATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeEqualTo(String value) {
            addCriterion("TEMPLATE_CODE =", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotEqualTo(String value) {
            addCriterion("TEMPLATE_CODE <>", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeGreaterThan(String value) {
            addCriterion("TEMPLATE_CODE >", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_CODE >=", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLessThan(String value) {
            addCriterion("TEMPLATE_CODE <", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_CODE <=", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeLike(String value) {
            addCriterion("TEMPLATE_CODE like", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotLike(String value) {
            addCriterion("TEMPLATE_CODE not like", value, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeIn(List<String> values) {
            addCriterion("TEMPLATE_CODE in", values, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotIn(List<String> values) {
            addCriterion("TEMPLATE_CODE not in", values, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeBetween(String value1, String value2) {
            addCriterion("TEMPLATE_CODE between", value1, value2, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateCodeNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_CODE not between", value1, value2, "templateCode");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNull() {
            addCriterion("TEMPLATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIsNotNull() {
            addCriterion("TEMPLATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeEqualTo(String value) {
            addCriterion("TEMPLATE_TYPE =", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotEqualTo(String value) {
            addCriterion("TEMPLATE_TYPE <>", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThan(String value) {
            addCriterion("TEMPLATE_TYPE >", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_TYPE >=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThan(String value) {
            addCriterion("TEMPLATE_TYPE <", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_TYPE <=", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeLike(String value) {
            addCriterion("TEMPLATE_TYPE like", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotLike(String value) {
            addCriterion("TEMPLATE_TYPE not like", value, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeIn(List<String> values) {
            addCriterion("TEMPLATE_TYPE in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotIn(List<String> values) {
            addCriterion("TEMPLATE_TYPE not in", values, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeBetween(String value1, String value2) {
            addCriterion("TEMPLATE_TYPE between", value1, value2, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateTypeNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_TYPE not between", value1, value2, "templateType");
            return (Criteria) this;
        }

        public Criteria andTemplateRankIsNull() {
            addCriterion("TEMPLATE_RANK is null");
            return (Criteria) this;
        }

        public Criteria andTemplateRankIsNotNull() {
            addCriterion("TEMPLATE_RANK is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateRankEqualTo(String value) {
            addCriterion("TEMPLATE_RANK =", value, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankNotEqualTo(String value) {
            addCriterion("TEMPLATE_RANK <>", value, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankGreaterThan(String value) {
            addCriterion("TEMPLATE_RANK >", value, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_RANK >=", value, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankLessThan(String value) {
            addCriterion("TEMPLATE_RANK <", value, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_RANK <=", value, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankLike(String value) {
            addCriterion("TEMPLATE_RANK like", value, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankNotLike(String value) {
            addCriterion("TEMPLATE_RANK not like", value, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankIn(List<String> values) {
            addCriterion("TEMPLATE_RANK in", values, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankNotIn(List<String> values) {
            addCriterion("TEMPLATE_RANK not in", values, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankBetween(String value1, String value2) {
            addCriterion("TEMPLATE_RANK between", value1, value2, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateRankNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_RANK not between", value1, value2, "templateRank");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesIsNull() {
            addCriterion("TEMPLATE_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesIsNotNull() {
            addCriterion("TEMPLATE_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesEqualTo(String value) {
            addCriterion("TEMPLATE_TIMES =", value, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesNotEqualTo(String value) {
            addCriterion("TEMPLATE_TIMES <>", value, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesGreaterThan(String value) {
            addCriterion("TEMPLATE_TIMES >", value, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_TIMES >=", value, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesLessThan(String value) {
            addCriterion("TEMPLATE_TIMES <", value, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_TIMES <=", value, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesLike(String value) {
            addCriterion("TEMPLATE_TIMES like", value, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesNotLike(String value) {
            addCriterion("TEMPLATE_TIMES not like", value, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesIn(List<String> values) {
            addCriterion("TEMPLATE_TIMES in", values, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesNotIn(List<String> values) {
            addCriterion("TEMPLATE_TIMES not in", values, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesBetween(String value1, String value2) {
            addCriterion("TEMPLATE_TIMES between", value1, value2, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplateTimesNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_TIMES not between", value1, value2, "templateTimes");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoIsNull() {
            addCriterion("TEMPLATE_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoIsNotNull() {
            addCriterion("TEMPLATE_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoEqualTo(String value) {
            addCriterion("TEMPLATE_PHOTO =", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoNotEqualTo(String value) {
            addCriterion("TEMPLATE_PHOTO <>", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoGreaterThan(String value) {
            addCriterion("TEMPLATE_PHOTO >", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_PHOTO >=", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoLessThan(String value) {
            addCriterion("TEMPLATE_PHOTO <", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_PHOTO <=", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoLike(String value) {
            addCriterion("TEMPLATE_PHOTO like", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoNotLike(String value) {
            addCriterion("TEMPLATE_PHOTO not like", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoIn(List<String> values) {
            addCriterion("TEMPLATE_PHOTO in", values, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoNotIn(List<String> values) {
            addCriterion("TEMPLATE_PHOTO not in", values, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoBetween(String value1, String value2) {
            addCriterion("TEMPLATE_PHOTO between", value1, value2, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_PHOTO not between", value1, value2, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkIsNull() {
            addCriterion("TEMPLATE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkIsNotNull() {
            addCriterion("TEMPLATE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkEqualTo(String value) {
            addCriterion("TEMPLATE_REMARK =", value, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkNotEqualTo(String value) {
            addCriterion("TEMPLATE_REMARK <>", value, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkGreaterThan(String value) {
            addCriterion("TEMPLATE_REMARK >", value, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_REMARK >=", value, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkLessThan(String value) {
            addCriterion("TEMPLATE_REMARK <", value, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_REMARK <=", value, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkLike(String value) {
            addCriterion("TEMPLATE_REMARK like", value, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkNotLike(String value) {
            addCriterion("TEMPLATE_REMARK not like", value, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkIn(List<String> values) {
            addCriterion("TEMPLATE_REMARK in", values, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkNotIn(List<String> values) {
            addCriterion("TEMPLATE_REMARK not in", values, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkBetween(String value1, String value2) {
            addCriterion("TEMPLATE_REMARK between", value1, value2, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andTemplateRemarkNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_REMARK not between", value1, value2, "templateRemark");
            return (Criteria) this;
        }

        public Criteria andEditNameIsNull() {
            addCriterion("EDIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEditNameIsNotNull() {
            addCriterion("EDIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEditNameEqualTo(String value) {
            addCriterion("EDIT_NAME =", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameNotEqualTo(String value) {
            addCriterion("EDIT_NAME <>", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameGreaterThan(String value) {
            addCriterion("EDIT_NAME >", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameGreaterThanOrEqualTo(String value) {
            addCriterion("EDIT_NAME >=", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameLessThan(String value) {
            addCriterion("EDIT_NAME <", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameLessThanOrEqualTo(String value) {
            addCriterion("EDIT_NAME <=", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameLike(String value) {
            addCriterion("EDIT_NAME like", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameNotLike(String value) {
            addCriterion("EDIT_NAME not like", value, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameIn(List<String> values) {
            addCriterion("EDIT_NAME in", values, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameNotIn(List<String> values) {
            addCriterion("EDIT_NAME not in", values, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameBetween(String value1, String value2) {
            addCriterion("EDIT_NAME between", value1, value2, "editName");
            return (Criteria) this;
        }

        public Criteria andEditNameNotBetween(String value1, String value2) {
            addCriterion("EDIT_NAME not between", value1, value2, "editName");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("EDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("EDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(Date value) {
            addCriterion("EDIT_TIME =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(Date value) {
            addCriterion("EDIT_TIME <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(Date value) {
            addCriterion("EDIT_TIME >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EDIT_TIME >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(Date value) {
            addCriterion("EDIT_TIME <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("EDIT_TIME <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<Date> values) {
            addCriterion("EDIT_TIME in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<Date> values) {
            addCriterion("EDIT_TIME not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(Date value1, Date value2) {
            addCriterion("EDIT_TIME between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("EDIT_TIME not between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("CREATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("CREATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("CREATE_NAME =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("CREATE_NAME <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("CREATE_NAME >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NAME >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("CREATE_NAME <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NAME <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("CREATE_NAME like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("CREATE_NAME not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("CREATE_NAME in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("CREATE_NAME not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("CREATE_NAME between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_NAME not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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