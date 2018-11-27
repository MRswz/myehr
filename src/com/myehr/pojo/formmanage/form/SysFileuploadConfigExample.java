package com.myehr.pojo.formmanage.form;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFileuploadConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFileuploadConfigExample() {
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

        public Criteria andSizeLimitIsNull() {
            addCriterion("SIZE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andSizeLimitIsNotNull() {
            addCriterion("SIZE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andSizeLimitEqualTo(BigDecimal value) {
            addCriterion("SIZE_LIMIT =", value, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitNotEqualTo(BigDecimal value) {
            addCriterion("SIZE_LIMIT <>", value, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitGreaterThan(BigDecimal value) {
            addCriterion("SIZE_LIMIT >", value, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_LIMIT >=", value, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitLessThan(BigDecimal value) {
            addCriterion("SIZE_LIMIT <", value, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_LIMIT <=", value, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitIn(List<BigDecimal> values) {
            addCriterion("SIZE_LIMIT in", values, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitNotIn(List<BigDecimal> values) {
            addCriterion("SIZE_LIMIT not in", values, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_LIMIT between", value1, value2, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andSizeLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_LIMIT not between", value1, value2, "sizeLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitIsNull() {
            addCriterion("NUM_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andNumLimitIsNotNull() {
            addCriterion("NUM_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andNumLimitEqualTo(BigDecimal value) {
            addCriterion("NUM_LIMIT =", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotEqualTo(BigDecimal value) {
            addCriterion("NUM_LIMIT <>", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitGreaterThan(BigDecimal value) {
            addCriterion("NUM_LIMIT >", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_LIMIT >=", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitLessThan(BigDecimal value) {
            addCriterion("NUM_LIMIT <", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_LIMIT <=", value, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitIn(List<BigDecimal> values) {
            addCriterion("NUM_LIMIT in", values, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotIn(List<BigDecimal> values) {
            addCriterion("NUM_LIMIT not in", values, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_LIMIT between", value1, value2, "numLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_LIMIT not between", value1, value2, "numLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitIsNull() {
            addCriterion("TYPE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andTypeLimitIsNotNull() {
            addCriterion("TYPE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTypeLimitEqualTo(String value) {
            addCriterion("TYPE_LIMIT =", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitNotEqualTo(String value) {
            addCriterion("TYPE_LIMIT <>", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitGreaterThan(String value) {
            addCriterion("TYPE_LIMIT >", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_LIMIT >=", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitLessThan(String value) {
            addCriterion("TYPE_LIMIT <", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitLessThanOrEqualTo(String value) {
            addCriterion("TYPE_LIMIT <=", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitLike(String value) {
            addCriterion("TYPE_LIMIT like", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitNotLike(String value) {
            addCriterion("TYPE_LIMIT not like", value, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitIn(List<String> values) {
            addCriterion("TYPE_LIMIT in", values, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitNotIn(List<String> values) {
            addCriterion("TYPE_LIMIT not in", values, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitBetween(String value1, String value2) {
            addCriterion("TYPE_LIMIT between", value1, value2, "typeLimit");
            return (Criteria) this;
        }

        public Criteria andTypeLimitNotBetween(String value1, String value2) {
            addCriterion("TYPE_LIMIT not between", value1, value2, "typeLimit");
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

        public Criteria andFileObjTypeIsNull() {
            addCriterion("FILE_OBJ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeIsNotNull() {
            addCriterion("FILE_OBJ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeEqualTo(String value) {
            addCriterion("FILE_OBJ_TYPE =", value, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeNotEqualTo(String value) {
            addCriterion("FILE_OBJ_TYPE <>", value, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeGreaterThan(String value) {
            addCriterion("FILE_OBJ_TYPE >", value, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_OBJ_TYPE >=", value, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeLessThan(String value) {
            addCriterion("FILE_OBJ_TYPE <", value, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeLessThanOrEqualTo(String value) {
            addCriterion("FILE_OBJ_TYPE <=", value, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeLike(String value) {
            addCriterion("FILE_OBJ_TYPE like", value, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeNotLike(String value) {
            addCriterion("FILE_OBJ_TYPE not like", value, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeIn(List<String> values) {
            addCriterion("FILE_OBJ_TYPE in", values, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeNotIn(List<String> values) {
            addCriterion("FILE_OBJ_TYPE not in", values, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeBetween(String value1, String value2) {
            addCriterion("FILE_OBJ_TYPE between", value1, value2, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjTypeNotBetween(String value1, String value2) {
            addCriterion("FILE_OBJ_TYPE not between", value1, value2, "fileObjType");
            return (Criteria) this;
        }

        public Criteria andFileObjValueIsNull() {
            addCriterion("FILE_OBJ_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFileObjValueIsNotNull() {
            addCriterion("FILE_OBJ_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFileObjValueEqualTo(String value) {
            addCriterion("FILE_OBJ_VALUE =", value, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueNotEqualTo(String value) {
            addCriterion("FILE_OBJ_VALUE <>", value, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueGreaterThan(String value) {
            addCriterion("FILE_OBJ_VALUE >", value, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_OBJ_VALUE >=", value, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueLessThan(String value) {
            addCriterion("FILE_OBJ_VALUE <", value, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueLessThanOrEqualTo(String value) {
            addCriterion("FILE_OBJ_VALUE <=", value, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueLike(String value) {
            addCriterion("FILE_OBJ_VALUE like", value, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueNotLike(String value) {
            addCriterion("FILE_OBJ_VALUE not like", value, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueIn(List<String> values) {
            addCriterion("FILE_OBJ_VALUE in", values, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueNotIn(List<String> values) {
            addCriterion("FILE_OBJ_VALUE not in", values, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueBetween(String value1, String value2) {
            addCriterion("FILE_OBJ_VALUE between", value1, value2, "fileObjValue");
            return (Criteria) this;
        }

        public Criteria andFileObjValueNotBetween(String value1, String value2) {
            addCriterion("FILE_OBJ_VALUE not between", value1, value2, "fileObjValue");
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