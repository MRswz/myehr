package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysFormFolderTreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormFolderTreeExample() {
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

        public Criteria andFolderTreeIdIsNull() {
            addCriterion("FOLDER_TREE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdIsNotNull() {
            addCriterion("FOLDER_TREE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdEqualTo(BigDecimal value) {
            addCriterion("FOLDER_TREE_ID =", value, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdNotEqualTo(BigDecimal value) {
            addCriterion("FOLDER_TREE_ID <>", value, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdGreaterThan(BigDecimal value) {
            addCriterion("FOLDER_TREE_ID >", value, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOLDER_TREE_ID >=", value, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdLessThan(BigDecimal value) {
            addCriterion("FOLDER_TREE_ID <", value, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOLDER_TREE_ID <=", value, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdIn(List<BigDecimal> values) {
            addCriterion("FOLDER_TREE_ID in", values, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdNotIn(List<BigDecimal> values) {
            addCriterion("FOLDER_TREE_ID not in", values, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOLDER_TREE_ID between", value1, value2, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOLDER_TREE_ID not between", value1, value2, "folderTreeId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameIsNull() {
            addCriterion("FOLDER_TREE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameIsNotNull() {
            addCriterion("FOLDER_TREE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameEqualTo(String value) {
            addCriterion("FOLDER_TREE_NAME =", value, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameNotEqualTo(String value) {
            addCriterion("FOLDER_TREE_NAME <>", value, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameGreaterThan(String value) {
            addCriterion("FOLDER_TREE_NAME >", value, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameGreaterThanOrEqualTo(String value) {
            addCriterion("FOLDER_TREE_NAME >=", value, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameLessThan(String value) {
            addCriterion("FOLDER_TREE_NAME <", value, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameLessThanOrEqualTo(String value) {
            addCriterion("FOLDER_TREE_NAME <=", value, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameLike(String value) {
            addCriterion("FOLDER_TREE_NAME like", value, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameNotLike(String value) {
            addCriterion("FOLDER_TREE_NAME not like", value, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameIn(List<String> values) {
            addCriterion("FOLDER_TREE_NAME in", values, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameNotIn(List<String> values) {
            addCriterion("FOLDER_TREE_NAME not in", values, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameBetween(String value1, String value2) {
            addCriterion("FOLDER_TREE_NAME between", value1, value2, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeNameNotBetween(String value1, String value2) {
            addCriterion("FOLDER_TREE_NAME not between", value1, value2, "folderTreeName");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdIsNull() {
            addCriterion("FOLDER_TREE_PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdIsNotNull() {
            addCriterion("FOLDER_TREE_PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdEqualTo(BigDecimal value) {
            addCriterion("FOLDER_TREE_PARENT_ID =", value, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdNotEqualTo(BigDecimal value) {
            addCriterion("FOLDER_TREE_PARENT_ID <>", value, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdGreaterThan(BigDecimal value) {
            addCriterion("FOLDER_TREE_PARENT_ID >", value, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FOLDER_TREE_PARENT_ID >=", value, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdLessThan(BigDecimal value) {
            addCriterion("FOLDER_TREE_PARENT_ID <", value, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FOLDER_TREE_PARENT_ID <=", value, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdIn(List<BigDecimal> values) {
            addCriterion("FOLDER_TREE_PARENT_ID in", values, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdNotIn(List<BigDecimal> values) {
            addCriterion("FOLDER_TREE_PARENT_ID not in", values, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOLDER_TREE_PARENT_ID between", value1, value2, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeParentIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FOLDER_TREE_PARENT_ID not between", value1, value2, "folderTreeParentId");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqIsNull() {
            addCriterion("FOLDER_TREE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqIsNotNull() {
            addCriterion("FOLDER_TREE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqEqualTo(String value) {
            addCriterion("FOLDER_TREE_SEQ =", value, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqNotEqualTo(String value) {
            addCriterion("FOLDER_TREE_SEQ <>", value, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqGreaterThan(String value) {
            addCriterion("FOLDER_TREE_SEQ >", value, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqGreaterThanOrEqualTo(String value) {
            addCriterion("FOLDER_TREE_SEQ >=", value, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqLessThan(String value) {
            addCriterion("FOLDER_TREE_SEQ <", value, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqLessThanOrEqualTo(String value) {
            addCriterion("FOLDER_TREE_SEQ <=", value, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqLike(String value) {
            addCriterion("FOLDER_TREE_SEQ like", value, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqNotLike(String value) {
            addCriterion("FOLDER_TREE_SEQ not like", value, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqIn(List<String> values) {
            addCriterion("FOLDER_TREE_SEQ in", values, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqNotIn(List<String> values) {
            addCriterion("FOLDER_TREE_SEQ not in", values, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqBetween(String value1, String value2) {
            addCriterion("FOLDER_TREE_SEQ between", value1, value2, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeSeqNotBetween(String value1, String value2) {
            addCriterion("FOLDER_TREE_SEQ not between", value1, value2, "folderTreeSeq");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeIsNull() {
            addCriterion("FOLDER_TREE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeIsNotNull() {
            addCriterion("FOLDER_TREE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeEqualTo(String value) {
            addCriterion("FOLDER_TREE_CODE =", value, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeNotEqualTo(String value) {
            addCriterion("FOLDER_TREE_CODE <>", value, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeGreaterThan(String value) {
            addCriterion("FOLDER_TREE_CODE >", value, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FOLDER_TREE_CODE >=", value, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeLessThan(String value) {
            addCriterion("FOLDER_TREE_CODE <", value, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeLessThanOrEqualTo(String value) {
            addCriterion("FOLDER_TREE_CODE <=", value, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeLike(String value) {
            addCriterion("FOLDER_TREE_CODE like", value, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeNotLike(String value) {
            addCriterion("FOLDER_TREE_CODE not like", value, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeIn(List<String> values) {
            addCriterion("FOLDER_TREE_CODE in", values, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeNotIn(List<String> values) {
            addCriterion("FOLDER_TREE_CODE not in", values, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeBetween(String value1, String value2) {
            addCriterion("FOLDER_TREE_CODE between", value1, value2, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeCodeNotBetween(String value1, String value2) {
            addCriterion("FOLDER_TREE_CODE not between", value1, value2, "folderTreeCode");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescIsNull() {
            addCriterion("FOLDER_TREE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescIsNotNull() {
            addCriterion("FOLDER_TREE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescEqualTo(String value) {
            addCriterion("FOLDER_TREE_DESC =", value, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescNotEqualTo(String value) {
            addCriterion("FOLDER_TREE_DESC <>", value, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescGreaterThan(String value) {
            addCriterion("FOLDER_TREE_DESC >", value, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescGreaterThanOrEqualTo(String value) {
            addCriterion("FOLDER_TREE_DESC >=", value, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescLessThan(String value) {
            addCriterion("FOLDER_TREE_DESC <", value, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescLessThanOrEqualTo(String value) {
            addCriterion("FOLDER_TREE_DESC <=", value, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescLike(String value) {
            addCriterion("FOLDER_TREE_DESC like", value, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescNotLike(String value) {
            addCriterion("FOLDER_TREE_DESC not like", value, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescIn(List<String> values) {
            addCriterion("FOLDER_TREE_DESC in", values, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescNotIn(List<String> values) {
            addCriterion("FOLDER_TREE_DESC not in", values, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescBetween(String value1, String value2) {
            addCriterion("FOLDER_TREE_DESC between", value1, value2, "folderTreeDesc");
            return (Criteria) this;
        }

        public Criteria andFolderTreeDescNotBetween(String value1, String value2) {
            addCriterion("FOLDER_TREE_DESC not between", value1, value2, "folderTreeDesc");
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