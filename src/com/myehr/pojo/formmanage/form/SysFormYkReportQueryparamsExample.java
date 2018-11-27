package com.myehr.pojo.formmanage.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFormYkReportQueryparamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormYkReportQueryparamsExample() {
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

        public Criteria andQueryParamIdIsNull() {
            addCriterion("QUERY_PARAM_ID is null");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdIsNotNull() {
            addCriterion("QUERY_PARAM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdEqualTo(Long value) {
            addCriterion("QUERY_PARAM_ID =", value, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdNotEqualTo(Long value) {
            addCriterion("QUERY_PARAM_ID <>", value, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdGreaterThan(Long value) {
            addCriterion("QUERY_PARAM_ID >", value, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QUERY_PARAM_ID >=", value, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdLessThan(Long value) {
            addCriterion("QUERY_PARAM_ID <", value, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdLessThanOrEqualTo(Long value) {
            addCriterion("QUERY_PARAM_ID <=", value, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdIn(List<Long> values) {
            addCriterion("QUERY_PARAM_ID in", values, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdNotIn(List<Long> values) {
            addCriterion("QUERY_PARAM_ID not in", values, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdBetween(Long value1, Long value2) {
            addCriterion("QUERY_PARAM_ID between", value1, value2, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andQueryParamIdNotBetween(Long value1, Long value2) {
            addCriterion("QUERY_PARAM_ID not between", value1, value2, "queryParamId");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNull() {
            addCriterion("REPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("REPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(Long value) {
            addCriterion("REPORT_ID =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(Long value) {
            addCriterion("REPORT_ID <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(Long value) {
            addCriterion("REPORT_ID >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORT_ID >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(Long value) {
            addCriterion("REPORT_ID <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(Long value) {
            addCriterion("REPORT_ID <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<Long> values) {
            addCriterion("REPORT_ID in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<Long> values) {
            addCriterion("REPORT_ID not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(Long value1, Long value2) {
            addCriterion("REPORT_ID between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(Long value1, Long value2) {
            addCriterion("REPORT_ID not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andParamsIdIsNull() {
            addCriterion("PARAMS_ID is null");
            return (Criteria) this;
        }

        public Criteria andParamsIdIsNotNull() {
            addCriterion("PARAMS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParamsIdEqualTo(Long value) {
            addCriterion("PARAMS_ID =", value, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdNotEqualTo(Long value) {
            addCriterion("PARAMS_ID <>", value, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdGreaterThan(Long value) {
            addCriterion("PARAMS_ID >", value, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARAMS_ID >=", value, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdLessThan(Long value) {
            addCriterion("PARAMS_ID <", value, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdLessThanOrEqualTo(Long value) {
            addCriterion("PARAMS_ID <=", value, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdIn(List<Long> values) {
            addCriterion("PARAMS_ID in", values, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdNotIn(List<Long> values) {
            addCriterion("PARAMS_ID not in", values, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdBetween(Long value1, Long value2) {
            addCriterion("PARAMS_ID between", value1, value2, "paramsId");
            return (Criteria) this;
        }

        public Criteria andParamsIdNotBetween(Long value1, Long value2) {
            addCriterion("PARAMS_ID not between", value1, value2, "paramsId");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Long value) {
            addCriterion("SORT =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Long value) {
            addCriterion("SORT <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Long value) {
            addCriterion("SORT >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Long value) {
            addCriterion("SORT >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Long value) {
            addCriterion("SORT <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Long value) {
            addCriterion("SORT <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Long> values) {
            addCriterion("SORT in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Long> values) {
            addCriterion("SORT not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Long value1, Long value2) {
            addCriterion("SORT between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Long value1, Long value2) {
            addCriterion("SORT not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andColspanCountIsNull() {
            addCriterion("COLSPAN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andColspanCountIsNotNull() {
            addCriterion("COLSPAN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andColspanCountEqualTo(Long value) {
            addCriterion("COLSPAN_COUNT =", value, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountNotEqualTo(Long value) {
            addCriterion("COLSPAN_COUNT <>", value, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountGreaterThan(Long value) {
            addCriterion("COLSPAN_COUNT >", value, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountGreaterThanOrEqualTo(Long value) {
            addCriterion("COLSPAN_COUNT >=", value, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountLessThan(Long value) {
            addCriterion("COLSPAN_COUNT <", value, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountLessThanOrEqualTo(Long value) {
            addCriterion("COLSPAN_COUNT <=", value, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountIn(List<Long> values) {
            addCriterion("COLSPAN_COUNT in", values, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountNotIn(List<Long> values) {
            addCriterion("COLSPAN_COUNT not in", values, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountBetween(Long value1, Long value2) {
            addCriterion("COLSPAN_COUNT between", value1, value2, "colspanCount");
            return (Criteria) this;
        }

        public Criteria andColspanCountNotBetween(Long value1, Long value2) {
            addCriterion("COLSPAN_COUNT not between", value1, value2, "colspanCount");
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

        public Criteria andParamsWidthIsNull() {
            addCriterion("PARAMS_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andParamsWidthIsNotNull() {
            addCriterion("PARAMS_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andParamsWidthEqualTo(String value) {
            addCriterion("PARAMS_WIDTH =", value, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthNotEqualTo(String value) {
            addCriterion("PARAMS_WIDTH <>", value, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthGreaterThan(String value) {
            addCriterion("PARAMS_WIDTH >", value, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_WIDTH >=", value, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthLessThan(String value) {
            addCriterion("PARAMS_WIDTH <", value, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_WIDTH <=", value, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthLike(String value) {
            addCriterion("PARAMS_WIDTH like", value, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthNotLike(String value) {
            addCriterion("PARAMS_WIDTH not like", value, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthIn(List<String> values) {
            addCriterion("PARAMS_WIDTH in", values, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthNotIn(List<String> values) {
            addCriterion("PARAMS_WIDTH not in", values, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthBetween(String value1, String value2) {
            addCriterion("PARAMS_WIDTH between", value1, value2, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andParamsWidthNotBetween(String value1, String value2) {
            addCriterion("PARAMS_WIDTH not between", value1, value2, "paramsWidth");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNull() {
            addCriterion("SHOW_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShowTypeIsNotNull() {
            addCriterion("SHOW_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShowTypeEqualTo(String value) {
            addCriterion("SHOW_TYPE =", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotEqualTo(String value) {
            addCriterion("SHOW_TYPE <>", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThan(String value) {
            addCriterion("SHOW_TYPE >", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_TYPE >=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThan(String value) {
            addCriterion("SHOW_TYPE <", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLessThanOrEqualTo(String value) {
            addCriterion("SHOW_TYPE <=", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeLike(String value) {
            addCriterion("SHOW_TYPE like", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotLike(String value) {
            addCriterion("SHOW_TYPE not like", value, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeIn(List<String> values) {
            addCriterion("SHOW_TYPE in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotIn(List<String> values) {
            addCriterion("SHOW_TYPE not in", values, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeBetween(String value1, String value2) {
            addCriterion("SHOW_TYPE between", value1, value2, "showType");
            return (Criteria) this;
        }

        public Criteria andShowTypeNotBetween(String value1, String value2) {
            addCriterion("SHOW_TYPE not between", value1, value2, "showType");
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