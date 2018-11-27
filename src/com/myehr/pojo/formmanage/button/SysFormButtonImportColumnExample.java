package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormButtonImportColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonImportColumnExample() {
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

        public Criteria andImportColumnIdIsNull() {
            addCriterion("IMPORT_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdIsNotNull() {
            addCriterion("IMPORT_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdEqualTo(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_ID =", value, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_ID <>", value, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdGreaterThan(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_ID >", value, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_ID >=", value, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdLessThan(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_ID <", value, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_ID <=", value, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdIn(List<BigDecimal> values) {
            addCriterion("IMPORT_COLUMN_ID in", values, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("IMPORT_COLUMN_ID not in", values, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPORT_COLUMN_ID between", value1, value2, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPORT_COLUMN_ID not between", value1, value2, "importColumnId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdIsNull() {
            addCriterion("IMPORT_COLUMN_REL_ID is null");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdIsNotNull() {
            addCriterion("IMPORT_COLUMN_REL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdEqualTo(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_REL_ID =", value, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdNotEqualTo(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_REL_ID <>", value, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdGreaterThan(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_REL_ID >", value, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_REL_ID >=", value, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdLessThan(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_REL_ID <", value, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPORT_COLUMN_REL_ID <=", value, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdIn(List<BigDecimal> values) {
            addCriterion("IMPORT_COLUMN_REL_ID in", values, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdNotIn(List<BigDecimal> values) {
            addCriterion("IMPORT_COLUMN_REL_ID not in", values, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPORT_COLUMN_REL_ID between", value1, value2, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnRelIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPORT_COLUMN_REL_ID not between", value1, value2, "importColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeIsNull() {
            addCriterion("IMPORT_COLUMN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeIsNotNull() {
            addCriterion("IMPORT_COLUMN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeEqualTo(String value) {
            addCriterion("IMPORT_COLUMN_TYPE =", value, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeNotEqualTo(String value) {
            addCriterion("IMPORT_COLUMN_TYPE <>", value, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeGreaterThan(String value) {
            addCriterion("IMPORT_COLUMN_TYPE >", value, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORT_COLUMN_TYPE >=", value, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeLessThan(String value) {
            addCriterion("IMPORT_COLUMN_TYPE <", value, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeLessThanOrEqualTo(String value) {
            addCriterion("IMPORT_COLUMN_TYPE <=", value, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeLike(String value) {
            addCriterion("IMPORT_COLUMN_TYPE like", value, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeNotLike(String value) {
            addCriterion("IMPORT_COLUMN_TYPE not like", value, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeIn(List<String> values) {
            addCriterion("IMPORT_COLUMN_TYPE in", values, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeNotIn(List<String> values) {
            addCriterion("IMPORT_COLUMN_TYPE not in", values, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeBetween(String value1, String value2) {
            addCriterion("IMPORT_COLUMN_TYPE between", value1, value2, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnTypeNotBetween(String value1, String value2) {
            addCriterion("IMPORT_COLUMN_TYPE not between", value1, value2, "importColumnType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeIsNull() {
            addCriterion("import_column_dict_type is null");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeIsNotNull() {
            addCriterion("import_column_dict_type is not null");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeEqualTo(String value) {
            addCriterion("import_column_dict_type =", value, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeNotEqualTo(String value) {
            addCriterion("import_column_dict_type <>", value, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeGreaterThan(String value) {
            addCriterion("import_column_dict_type >", value, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("import_column_dict_type >=", value, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeLessThan(String value) {
            addCriterion("import_column_dict_type <", value, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeLessThanOrEqualTo(String value) {
            addCriterion("import_column_dict_type <=", value, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeLike(String value) {
            addCriterion("import_column_dict_type like", value, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeNotLike(String value) {
            addCriterion("import_column_dict_type not like", value, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeIn(List<String> values) {
            addCriterion("import_column_dict_type in", values, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeNotIn(List<String> values) {
            addCriterion("import_column_dict_type not in", values, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeBetween(String value1, String value2) {
            addCriterion("import_column_dict_type between", value1, value2, "importColumnDictType");
            return (Criteria) this;
        }

        public Criteria andImportColumnDictTypeNotBetween(String value1, String value2) {
            addCriterion("import_column_dict_type not between", value1, value2, "importColumnDictType");
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

        public Criteria andImportColumnButtonIdIsNull() {
            addCriterion("import_column_button_id is null");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdIsNotNull() {
            addCriterion("import_column_button_id is not null");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdEqualTo(BigDecimal value) {
            addCriterion("import_column_button_id =", value, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdNotEqualTo(BigDecimal value) {
            addCriterion("import_column_button_id <>", value, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdGreaterThan(BigDecimal value) {
            addCriterion("import_column_button_id >", value, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("import_column_button_id >=", value, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdLessThan(BigDecimal value) {
            addCriterion("import_column_button_id <", value, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("import_column_button_id <=", value, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdIn(List<BigDecimal> values) {
            addCriterion("import_column_button_id in", values, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdNotIn(List<BigDecimal> values) {
            addCriterion("import_column_button_id not in", values, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("import_column_button_id between", value1, value2, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnButtonIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("import_column_button_id not between", value1, value2, "importColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyIsNull() {
            addCriterion("import_column_bus_key is null");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyIsNotNull() {
            addCriterion("import_column_bus_key is not null");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyEqualTo(String value) {
            addCriterion("import_column_bus_key =", value, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyNotEqualTo(String value) {
            addCriterion("import_column_bus_key <>", value, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyGreaterThan(String value) {
            addCriterion("import_column_bus_key >", value, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyGreaterThanOrEqualTo(String value) {
            addCriterion("import_column_bus_key >=", value, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyLessThan(String value) {
            addCriterion("import_column_bus_key <", value, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyLessThanOrEqualTo(String value) {
            addCriterion("import_column_bus_key <=", value, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyLike(String value) {
            addCriterion("import_column_bus_key like", value, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyNotLike(String value) {
            addCriterion("import_column_bus_key not like", value, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyIn(List<String> values) {
            addCriterion("import_column_bus_key in", values, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyNotIn(List<String> values) {
            addCriterion("import_column_bus_key not in", values, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyBetween(String value1, String value2) {
            addCriterion("import_column_bus_key between", value1, value2, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportColumnBusKeyNotBetween(String value1, String value2) {
            addCriterion("import_column_bus_key not between", value1, value2, "importColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdIsNull() {
            addCriterion("import_re_column_rel_id is null");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdIsNotNull() {
            addCriterion("import_re_column_rel_id is not null");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdEqualTo(BigDecimal value) {
            addCriterion("import_re_column_rel_id =", value, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdNotEqualTo(BigDecimal value) {
            addCriterion("import_re_column_rel_id <>", value, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdGreaterThan(BigDecimal value) {
            addCriterion("import_re_column_rel_id >", value, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("import_re_column_rel_id >=", value, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdLessThan(BigDecimal value) {
            addCriterion("import_re_column_rel_id <", value, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("import_re_column_rel_id <=", value, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdIn(List<BigDecimal> values) {
            addCriterion("import_re_column_rel_id in", values, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdNotIn(List<BigDecimal> values) {
            addCriterion("import_re_column_rel_id not in", values, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("import_re_column_rel_id between", value1, value2, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportReColumnRelIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("import_re_column_rel_id not between", value1, value2, "importReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueIsNull() {
            addCriterion("IMPORT_COLUMN_UNIQUE is null");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueIsNotNull() {
            addCriterion("IMPORT_COLUMN_UNIQUE is not null");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueEqualTo(String value) {
            addCriterion("IMPORT_COLUMN_UNIQUE =", value, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueNotEqualTo(String value) {
            addCriterion("IMPORT_COLUMN_UNIQUE <>", value, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueGreaterThan(String value) {
            addCriterion("IMPORT_COLUMN_UNIQUE >", value, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORT_COLUMN_UNIQUE >=", value, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueLessThan(String value) {
            addCriterion("IMPORT_COLUMN_UNIQUE <", value, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueLessThanOrEqualTo(String value) {
            addCriterion("IMPORT_COLUMN_UNIQUE <=", value, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueLike(String value) {
            addCriterion("IMPORT_COLUMN_UNIQUE like", value, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueNotLike(String value) {
            addCriterion("IMPORT_COLUMN_UNIQUE not like", value, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueIn(List<String> values) {
            addCriterion("IMPORT_COLUMN_UNIQUE in", values, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueNotIn(List<String> values) {
            addCriterion("IMPORT_COLUMN_UNIQUE not in", values, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueBetween(String value1, String value2) {
            addCriterion("IMPORT_COLUMN_UNIQUE between", value1, value2, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnUniqueNotBetween(String value1, String value2) {
            addCriterion("IMPORT_COLUMN_UNIQUE not between", value1, value2, "importColumnUnique");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidIsNull() {
            addCriterion("import_column_forbid is null");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidIsNotNull() {
            addCriterion("import_column_forbid is not null");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidEqualTo(String value) {
            addCriterion("import_column_forbid =", value, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidNotEqualTo(String value) {
            addCriterion("import_column_forbid <>", value, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidGreaterThan(String value) {
            addCriterion("import_column_forbid >", value, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidGreaterThanOrEqualTo(String value) {
            addCriterion("import_column_forbid >=", value, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidLessThan(String value) {
            addCriterion("import_column_forbid <", value, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidLessThanOrEqualTo(String value) {
            addCriterion("import_column_forbid <=", value, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidLike(String value) {
            addCriterion("import_column_forbid like", value, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidNotLike(String value) {
            addCriterion("import_column_forbid not like", value, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidIn(List<String> values) {
            addCriterion("import_column_forbid in", values, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidNotIn(List<String> values) {
            addCriterion("import_column_forbid not in", values, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidBetween(String value1, String value2) {
            addCriterion("import_column_forbid between", value1, value2, "importColumnForbid");
            return (Criteria) this;
        }

        public Criteria andImportColumnForbidNotBetween(String value1, String value2) {
            addCriterion("import_column_forbid not between", value1, value2, "importColumnForbid");
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