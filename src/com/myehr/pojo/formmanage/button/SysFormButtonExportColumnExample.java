package com.myehr.pojo.formmanage.button;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormButtonExportColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonExportColumnExample() {
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

        public Criteria andExportColumnIdIsNull() {
            addCriterion("EXPORT_COLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdIsNotNull() {
            addCriterion("EXPORT_COLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_ID =", value, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdNotEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_ID <>", value, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdGreaterThan(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_ID >", value, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_ID >=", value, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdLessThan(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_ID <", value, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_ID <=", value, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdIn(List<BigDecimal> values) {
            addCriterion("EXPORT_COLUMN_ID in", values, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdNotIn(List<BigDecimal> values) {
            addCriterion("EXPORT_COLUMN_ID not in", values, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPORT_COLUMN_ID between", value1, value2, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPORT_COLUMN_ID not between", value1, value2, "exportColumnId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdIsNull() {
            addCriterion("EXPORT_COLUMN_REL_ID is null");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdIsNotNull() {
            addCriterion("EXPORT_COLUMN_REL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_REL_ID =", value, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdNotEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_REL_ID <>", value, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdGreaterThan(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_REL_ID >", value, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_REL_ID >=", value, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdLessThan(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_REL_ID <", value, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_REL_ID <=", value, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdIn(List<BigDecimal> values) {
            addCriterion("EXPORT_COLUMN_REL_ID in", values, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdNotIn(List<BigDecimal> values) {
            addCriterion("EXPORT_COLUMN_REL_ID not in", values, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPORT_COLUMN_REL_ID between", value1, value2, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnRelIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPORT_COLUMN_REL_ID not between", value1, value2, "exportColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeIsNull() {
            addCriterion("EXPORT_COLUMN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeIsNotNull() {
            addCriterion("EXPORT_COLUMN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeEqualTo(String value) {
            addCriterion("EXPORT_COLUMN_TYPE =", value, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeNotEqualTo(String value) {
            addCriterion("EXPORT_COLUMN_TYPE <>", value, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeGreaterThan(String value) {
            addCriterion("EXPORT_COLUMN_TYPE >", value, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXPORT_COLUMN_TYPE >=", value, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeLessThan(String value) {
            addCriterion("EXPORT_COLUMN_TYPE <", value, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeLessThanOrEqualTo(String value) {
            addCriterion("EXPORT_COLUMN_TYPE <=", value, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeLike(String value) {
            addCriterion("EXPORT_COLUMN_TYPE like", value, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeNotLike(String value) {
            addCriterion("EXPORT_COLUMN_TYPE not like", value, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeIn(List<String> values) {
            addCriterion("EXPORT_COLUMN_TYPE in", values, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeNotIn(List<String> values) {
            addCriterion("EXPORT_COLUMN_TYPE not in", values, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeBetween(String value1, String value2) {
            addCriterion("EXPORT_COLUMN_TYPE between", value1, value2, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnTypeNotBetween(String value1, String value2) {
            addCriterion("EXPORT_COLUMN_TYPE not between", value1, value2, "exportColumnType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeIsNull() {
            addCriterion("export_column_dict_type is null");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeIsNotNull() {
            addCriterion("export_column_dict_type is not null");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeEqualTo(String value) {
            addCriterion("export_column_dict_type =", value, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeNotEqualTo(String value) {
            addCriterion("export_column_dict_type <>", value, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeGreaterThan(String value) {
            addCriterion("export_column_dict_type >", value, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeGreaterThanOrEqualTo(String value) {
            addCriterion("export_column_dict_type >=", value, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeLessThan(String value) {
            addCriterion("export_column_dict_type <", value, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeLessThanOrEqualTo(String value) {
            addCriterion("export_column_dict_type <=", value, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeLike(String value) {
            addCriterion("export_column_dict_type like", value, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeNotLike(String value) {
            addCriterion("export_column_dict_type not like", value, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeIn(List<String> values) {
            addCriterion("export_column_dict_type in", values, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeNotIn(List<String> values) {
            addCriterion("export_column_dict_type not in", values, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeBetween(String value1, String value2) {
            addCriterion("export_column_dict_type between", value1, value2, "exportColumnDictType");
            return (Criteria) this;
        }

        public Criteria andExportColumnDictTypeNotBetween(String value1, String value2) {
            addCriterion("export_column_dict_type not between", value1, value2, "exportColumnDictType");
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

        public Criteria andExportColumnButtonIdIsNull() {
            addCriterion("export_column_button_id is null");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdIsNotNull() {
            addCriterion("export_column_button_id is not null");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdEqualTo(BigDecimal value) {
            addCriterion("export_column_button_id =", value, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdNotEqualTo(BigDecimal value) {
            addCriterion("export_column_button_id <>", value, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdGreaterThan(BigDecimal value) {
            addCriterion("export_column_button_id >", value, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("export_column_button_id >=", value, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdLessThan(BigDecimal value) {
            addCriterion("export_column_button_id <", value, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("export_column_button_id <=", value, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdIn(List<BigDecimal> values) {
            addCriterion("export_column_button_id in", values, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdNotIn(List<BigDecimal> values) {
            addCriterion("export_column_button_id not in", values, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("export_column_button_id between", value1, value2, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnButtonIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("export_column_button_id not between", value1, value2, "exportColumnButtonId");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyIsNull() {
            addCriterion("export_column_bus_key is null");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyIsNotNull() {
            addCriterion("export_column_bus_key is not null");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyEqualTo(String value) {
            addCriterion("export_column_bus_key =", value, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyNotEqualTo(String value) {
            addCriterion("export_column_bus_key <>", value, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyGreaterThan(String value) {
            addCriterion("export_column_bus_key >", value, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyGreaterThanOrEqualTo(String value) {
            addCriterion("export_column_bus_key >=", value, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyLessThan(String value) {
            addCriterion("export_column_bus_key <", value, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyLessThanOrEqualTo(String value) {
            addCriterion("export_column_bus_key <=", value, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyLike(String value) {
            addCriterion("export_column_bus_key like", value, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyNotLike(String value) {
            addCriterion("export_column_bus_key not like", value, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyIn(List<String> values) {
            addCriterion("export_column_bus_key in", values, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyNotIn(List<String> values) {
            addCriterion("export_column_bus_key not in", values, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyBetween(String value1, String value2) {
            addCriterion("export_column_bus_key between", value1, value2, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportColumnBusKeyNotBetween(String value1, String value2) {
            addCriterion("export_column_bus_key not between", value1, value2, "exportColumnBusKey");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdIsNull() {
            addCriterion("export_re_column_rel_id is null");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdIsNotNull() {
            addCriterion("export_re_column_rel_id is not null");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdEqualTo(BigDecimal value) {
            addCriterion("export_re_column_rel_id =", value, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdNotEqualTo(BigDecimal value) {
            addCriterion("export_re_column_rel_id <>", value, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdGreaterThan(BigDecimal value) {
            addCriterion("export_re_column_rel_id >", value, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("export_re_column_rel_id >=", value, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdLessThan(BigDecimal value) {
            addCriterion("export_re_column_rel_id <", value, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("export_re_column_rel_id <=", value, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdIn(List<BigDecimal> values) {
            addCriterion("export_re_column_rel_id in", values, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdNotIn(List<BigDecimal> values) {
            addCriterion("export_re_column_rel_id not in", values, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("export_re_column_rel_id between", value1, value2, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportReColumnRelIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("export_re_column_rel_id not between", value1, value2, "exportReColumnRelId");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortIsNull() {
            addCriterion("EXPORT_COLUMN_SORT is null");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortIsNotNull() {
            addCriterion("EXPORT_COLUMN_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_SORT =", value, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortNotEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_SORT <>", value, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortGreaterThan(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_SORT >", value, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_SORT >=", value, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortLessThan(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_SORT <", value, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPORT_COLUMN_SORT <=", value, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortIn(List<BigDecimal> values) {
            addCriterion("EXPORT_COLUMN_SORT in", values, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortNotIn(List<BigDecimal> values) {
            addCriterion("EXPORT_COLUMN_SORT not in", values, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPORT_COLUMN_SORT between", value1, value2, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnSortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPORT_COLUMN_SORT not between", value1, value2, "exportColumnSort");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidIsNull() {
            addCriterion("export_column_forbid is null");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidIsNotNull() {
            addCriterion("export_column_forbid is not null");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidEqualTo(String value) {
            addCriterion("export_column_forbid =", value, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidNotEqualTo(String value) {
            addCriterion("export_column_forbid <>", value, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidGreaterThan(String value) {
            addCriterion("export_column_forbid >", value, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidGreaterThanOrEqualTo(String value) {
            addCriterion("export_column_forbid >=", value, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidLessThan(String value) {
            addCriterion("export_column_forbid <", value, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidLessThanOrEqualTo(String value) {
            addCriterion("export_column_forbid <=", value, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidLike(String value) {
            addCriterion("export_column_forbid like", value, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidNotLike(String value) {
            addCriterion("export_column_forbid not like", value, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidIn(List<String> values) {
            addCriterion("export_column_forbid in", values, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidNotIn(List<String> values) {
            addCriterion("export_column_forbid not in", values, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidBetween(String value1, String value2) {
            addCriterion("export_column_forbid between", value1, value2, "exportColumnForbid");
            return (Criteria) this;
        }

        public Criteria andExportColumnForbidNotBetween(String value1, String value2) {
            addCriterion("export_column_forbid not between", value1, value2, "exportColumnForbid");
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