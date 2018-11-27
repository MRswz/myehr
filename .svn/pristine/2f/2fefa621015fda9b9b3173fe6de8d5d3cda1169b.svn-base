package com.myehr.pojo.formmanage.template;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysTemplateExample() {
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

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(BigDecimal value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(BigDecimal value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
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

        public Criteria andTemplateNameIsNull() {
            addCriterion("TEMPLATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("TEMPLATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("TEMPLATE_NAME =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("TEMPLATE_NAME <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("TEMPLATE_NAME >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_NAME >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("TEMPLATE_NAME <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_NAME <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("TEMPLATE_NAME like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("TEMPLATE_NAME not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("TEMPLATE_NAME in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("TEMPLATE_NAME not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("TEMPLATE_NAME between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_NAME not between", value1, value2, "templateName");
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

        public Criteria andTemplateFolderIdIsNull() {
            addCriterion("TEMPLATE_FOLDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdIsNotNull() {
            addCriterion("TEMPLATE_FOLDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_FOLDER_ID =", value, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdNotEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_FOLDER_ID <>", value, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdGreaterThan(BigDecimal value) {
            addCriterion("TEMPLATE_FOLDER_ID >", value, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_FOLDER_ID >=", value, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdLessThan(BigDecimal value) {
            addCriterion("TEMPLATE_FOLDER_ID <", value, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPLATE_FOLDER_ID <=", value, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_FOLDER_ID in", values, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdNotIn(List<BigDecimal> values) {
            addCriterion("TEMPLATE_FOLDER_ID not in", values, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_FOLDER_ID between", value1, value2, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateFolderIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPLATE_FOLDER_ID not between", value1, value2, "templateFolderId");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIsNull() {
            addCriterion("TEMPLATE_SQL is null");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIsNotNull() {
            addCriterion("TEMPLATE_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlEqualTo(String value) {
            addCriterion("TEMPLATE_SQL =", value, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlNotEqualTo(String value) {
            addCriterion("TEMPLATE_SQL <>", value, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlGreaterThan(String value) {
            addCriterion("TEMPLATE_SQL >", value, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_SQL >=", value, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlLessThan(String value) {
            addCriterion("TEMPLATE_SQL <", value, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_SQL <=", value, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlLike(String value) {
            addCriterion("TEMPLATE_SQL like", value, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlNotLike(String value) {
            addCriterion("TEMPLATE_SQL not like", value, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlIn(List<String> values) {
            addCriterion("TEMPLATE_SQL in", values, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlNotIn(List<String> values) {
            addCriterion("TEMPLATE_SQL not in", values, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlBetween(String value1, String value2) {
            addCriterion("TEMPLATE_SQL between", value1, value2, "templateSql");
            return (Criteria) this;
        }

        public Criteria andTemplateSqlNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_SQL not between", value1, value2, "templateSql");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowIsNull() {
            addCriterion("PC_EDIT_CARD_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowIsNotNull() {
            addCriterion("PC_EDIT_CARD_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowEqualTo(String value) {
            addCriterion("PC_EDIT_CARD_SHOW =", value, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowNotEqualTo(String value) {
            addCriterion("PC_EDIT_CARD_SHOW <>", value, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowGreaterThan(String value) {
            addCriterion("PC_EDIT_CARD_SHOW >", value, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowGreaterThanOrEqualTo(String value) {
            addCriterion("PC_EDIT_CARD_SHOW >=", value, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowLessThan(String value) {
            addCriterion("PC_EDIT_CARD_SHOW <", value, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowLessThanOrEqualTo(String value) {
            addCriterion("PC_EDIT_CARD_SHOW <=", value, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowLike(String value) {
            addCriterion("PC_EDIT_CARD_SHOW like", value, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowNotLike(String value) {
            addCriterion("PC_EDIT_CARD_SHOW not like", value, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowIn(List<String> values) {
            addCriterion("PC_EDIT_CARD_SHOW in", values, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowNotIn(List<String> values) {
            addCriterion("PC_EDIT_CARD_SHOW not in", values, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowBetween(String value1, String value2) {
            addCriterion("PC_EDIT_CARD_SHOW between", value1, value2, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcEditCardShowNotBetween(String value1, String value2) {
            addCriterion("PC_EDIT_CARD_SHOW not between", value1, value2, "pcEditCardShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowIsNull() {
            addCriterion("PC_GRID_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andPcGridShowIsNotNull() {
            addCriterion("PC_GRID_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andPcGridShowEqualTo(String value) {
            addCriterion("PC_GRID_SHOW =", value, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowNotEqualTo(String value) {
            addCriterion("PC_GRID_SHOW <>", value, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowGreaterThan(String value) {
            addCriterion("PC_GRID_SHOW >", value, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowGreaterThanOrEqualTo(String value) {
            addCriterion("PC_GRID_SHOW >=", value, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowLessThan(String value) {
            addCriterion("PC_GRID_SHOW <", value, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowLessThanOrEqualTo(String value) {
            addCriterion("PC_GRID_SHOW <=", value, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowLike(String value) {
            addCriterion("PC_GRID_SHOW like", value, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowNotLike(String value) {
            addCriterion("PC_GRID_SHOW not like", value, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowIn(List<String> values) {
            addCriterion("PC_GRID_SHOW in", values, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowNotIn(List<String> values) {
            addCriterion("PC_GRID_SHOW not in", values, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowBetween(String value1, String value2) {
            addCriterion("PC_GRID_SHOW between", value1, value2, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andPcGridShowNotBetween(String value1, String value2) {
            addCriterion("PC_GRID_SHOW not between", value1, value2, "pcGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowIsNull() {
            addCriterion("APP_GRID_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andAppGridShowIsNotNull() {
            addCriterion("APP_GRID_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andAppGridShowEqualTo(String value) {
            addCriterion("APP_GRID_SHOW =", value, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowNotEqualTo(String value) {
            addCriterion("APP_GRID_SHOW <>", value, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowGreaterThan(String value) {
            addCriterion("APP_GRID_SHOW >", value, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowGreaterThanOrEqualTo(String value) {
            addCriterion("APP_GRID_SHOW >=", value, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowLessThan(String value) {
            addCriterion("APP_GRID_SHOW <", value, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowLessThanOrEqualTo(String value) {
            addCriterion("APP_GRID_SHOW <=", value, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowLike(String value) {
            addCriterion("APP_GRID_SHOW like", value, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowNotLike(String value) {
            addCriterion("APP_GRID_SHOW not like", value, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowIn(List<String> values) {
            addCriterion("APP_GRID_SHOW in", values, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowNotIn(List<String> values) {
            addCriterion("APP_GRID_SHOW not in", values, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowBetween(String value1, String value2) {
            addCriterion("APP_GRID_SHOW between", value1, value2, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andAppGridShowNotBetween(String value1, String value2) {
            addCriterion("APP_GRID_SHOW not between", value1, value2, "appGridShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowIsNull() {
            addCriterion("PC_ADD_CARD_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowIsNotNull() {
            addCriterion("PC_ADD_CARD_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowEqualTo(String value) {
            addCriterion("PC_ADD_CARD_SHOW =", value, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowNotEqualTo(String value) {
            addCriterion("PC_ADD_CARD_SHOW <>", value, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowGreaterThan(String value) {
            addCriterion("PC_ADD_CARD_SHOW >", value, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowGreaterThanOrEqualTo(String value) {
            addCriterion("PC_ADD_CARD_SHOW >=", value, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowLessThan(String value) {
            addCriterion("PC_ADD_CARD_SHOW <", value, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowLessThanOrEqualTo(String value) {
            addCriterion("PC_ADD_CARD_SHOW <=", value, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowLike(String value) {
            addCriterion("PC_ADD_CARD_SHOW like", value, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowNotLike(String value) {
            addCriterion("PC_ADD_CARD_SHOW not like", value, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowIn(List<String> values) {
            addCriterion("PC_ADD_CARD_SHOW in", values, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowNotIn(List<String> values) {
            addCriterion("PC_ADD_CARD_SHOW not in", values, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowBetween(String value1, String value2) {
            addCriterion("PC_ADD_CARD_SHOW between", value1, value2, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andPcAddCardShowNotBetween(String value1, String value2) {
            addCriterion("PC_ADD_CARD_SHOW not between", value1, value2, "pcAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowIsNull() {
            addCriterion("APP_ADD_CARD_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowIsNotNull() {
            addCriterion("APP_ADD_CARD_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowEqualTo(String value) {
            addCriterion("APP_ADD_CARD_SHOW =", value, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowNotEqualTo(String value) {
            addCriterion("APP_ADD_CARD_SHOW <>", value, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowGreaterThan(String value) {
            addCriterion("APP_ADD_CARD_SHOW >", value, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowGreaterThanOrEqualTo(String value) {
            addCriterion("APP_ADD_CARD_SHOW >=", value, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowLessThan(String value) {
            addCriterion("APP_ADD_CARD_SHOW <", value, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowLessThanOrEqualTo(String value) {
            addCriterion("APP_ADD_CARD_SHOW <=", value, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowLike(String value) {
            addCriterion("APP_ADD_CARD_SHOW like", value, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowNotLike(String value) {
            addCriterion("APP_ADD_CARD_SHOW not like", value, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowIn(List<String> values) {
            addCriterion("APP_ADD_CARD_SHOW in", values, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowNotIn(List<String> values) {
            addCriterion("APP_ADD_CARD_SHOW not in", values, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowBetween(String value1, String value2) {
            addCriterion("APP_ADD_CARD_SHOW between", value1, value2, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppAddCardShowNotBetween(String value1, String value2) {
            addCriterion("APP_ADD_CARD_SHOW not between", value1, value2, "appAddCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowIsNull() {
            addCriterion("APP_EDIT_CARD_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowIsNotNull() {
            addCriterion("APP_EDIT_CARD_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowEqualTo(String value) {
            addCriterion("APP_EDIT_CARD_SHOW =", value, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowNotEqualTo(String value) {
            addCriterion("APP_EDIT_CARD_SHOW <>", value, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowGreaterThan(String value) {
            addCriterion("APP_EDIT_CARD_SHOW >", value, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowGreaterThanOrEqualTo(String value) {
            addCriterion("APP_EDIT_CARD_SHOW >=", value, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowLessThan(String value) {
            addCriterion("APP_EDIT_CARD_SHOW <", value, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowLessThanOrEqualTo(String value) {
            addCriterion("APP_EDIT_CARD_SHOW <=", value, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowLike(String value) {
            addCriterion("APP_EDIT_CARD_SHOW like", value, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowNotLike(String value) {
            addCriterion("APP_EDIT_CARD_SHOW not like", value, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowIn(List<String> values) {
            addCriterion("APP_EDIT_CARD_SHOW in", values, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowNotIn(List<String> values) {
            addCriterion("APP_EDIT_CARD_SHOW not in", values, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowBetween(String value1, String value2) {
            addCriterion("APP_EDIT_CARD_SHOW between", value1, value2, "appEditCardShow");
            return (Criteria) this;
        }

        public Criteria andAppEditCardShowNotBetween(String value1, String value2) {
            addCriterion("APP_EDIT_CARD_SHOW not between", value1, value2, "appEditCardShow");
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