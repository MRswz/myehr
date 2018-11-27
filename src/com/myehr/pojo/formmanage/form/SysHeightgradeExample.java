package com.myehr.pojo.formmanage.form;

import java.util.ArrayList;
import java.util.List;

public class SysHeightgradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysHeightgradeExample() {
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

        public Criteria andFormidIsNull() {
            addCriterion("FormId is null");
            return (Criteria) this;
        }

        public Criteria andFormidIsNotNull() {
            addCriterion("FormId is not null");
            return (Criteria) this;
        }

        public Criteria andFormidEqualTo(Integer value) {
            addCriterion("FormId =", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotEqualTo(Integer value) {
            addCriterion("FormId <>", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThan(Integer value) {
            addCriterion("FormId >", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FormId >=", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLessThan(Integer value) {
            addCriterion("FormId <", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidLessThanOrEqualTo(Integer value) {
            addCriterion("FormId <=", value, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidIn(List<Integer> values) {
            addCriterion("FormId in", values, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotIn(List<Integer> values) {
            addCriterion("FormId not in", values, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidBetween(Integer value1, Integer value2) {
            addCriterion("FormId between", value1, value2, "formid");
            return (Criteria) this;
        }

        public Criteria andFormidNotBetween(Integer value1, Integer value2) {
            addCriterion("FormId not between", value1, value2, "formid");
            return (Criteria) this;
        }

        public Criteria andConnectionIsNull() {
            addCriterion("Connection is null");
            return (Criteria) this;
        }

        public Criteria andConnectionIsNotNull() {
            addCriterion("Connection is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionEqualTo(String value) {
            addCriterion("Connection =", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionNotEqualTo(String value) {
            addCriterion("Connection <>", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionGreaterThan(String value) {
            addCriterion("Connection >", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionGreaterThanOrEqualTo(String value) {
            addCriterion("Connection >=", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionLessThan(String value) {
            addCriterion("Connection <", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionLessThanOrEqualTo(String value) {
            addCriterion("Connection <=", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionLike(String value) {
            addCriterion("Connection like", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionNotLike(String value) {
            addCriterion("Connection not like", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionIn(List<String> values) {
            addCriterion("Connection in", values, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionNotIn(List<String> values) {
            addCriterion("Connection not in", values, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionBetween(String value1, String value2) {
            addCriterion("Connection between", value1, value2, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionNotBetween(String value1, String value2) {
            addCriterion("Connection not between", value1, value2, "connection");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisIsNull() {
            addCriterion("Leftparenthesis is null");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisIsNotNull() {
            addCriterion("Leftparenthesis is not null");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisEqualTo(String value) {
            addCriterion("Leftparenthesis =", value, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisNotEqualTo(String value) {
            addCriterion("Leftparenthesis <>", value, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisGreaterThan(String value) {
            addCriterion("Leftparenthesis >", value, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisGreaterThanOrEqualTo(String value) {
            addCriterion("Leftparenthesis >=", value, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisLessThan(String value) {
            addCriterion("Leftparenthesis <", value, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisLessThanOrEqualTo(String value) {
            addCriterion("Leftparenthesis <=", value, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisLike(String value) {
            addCriterion("Leftparenthesis like", value, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisNotLike(String value) {
            addCriterion("Leftparenthesis not like", value, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisIn(List<String> values) {
            addCriterion("Leftparenthesis in", values, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisNotIn(List<String> values) {
            addCriterion("Leftparenthesis not in", values, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisBetween(String value1, String value2) {
            addCriterion("Leftparenthesis between", value1, value2, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andLeftparenthesisNotBetween(String value1, String value2) {
            addCriterion("Leftparenthesis not between", value1, value2, "leftparenthesis");
            return (Criteria) this;
        }

        public Criteria andFieldIsNull() {
            addCriterion("Field is null");
            return (Criteria) this;
        }

        public Criteria andFieldIsNotNull() {
            addCriterion("Field is not null");
            return (Criteria) this;
        }

        public Criteria andFieldEqualTo(String value) {
            addCriterion("Field =", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotEqualTo(String value) {
            addCriterion("Field <>", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThan(String value) {
            addCriterion("Field >", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldGreaterThanOrEqualTo(String value) {
            addCriterion("Field >=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThan(String value) {
            addCriterion("Field <", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLessThanOrEqualTo(String value) {
            addCriterion("Field <=", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldLike(String value) {
            addCriterion("Field like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotLike(String value) {
            addCriterion("Field not like", value, "field");
            return (Criteria) this;
        }

        public Criteria andFieldIn(List<String> values) {
            addCriterion("Field in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotIn(List<String> values) {
            addCriterion("Field not in", values, "field");
            return (Criteria) this;
        }

        public Criteria andFieldBetween(String value1, String value2) {
            addCriterion("Field between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andFieldNotBetween(String value1, String value2) {
            addCriterion("Field not between", value1, value2, "field");
            return (Criteria) this;
        }

        public Criteria andFilterIsNull() {
            addCriterion("Filter is null");
            return (Criteria) this;
        }

        public Criteria andFilterIsNotNull() {
            addCriterion("Filter is not null");
            return (Criteria) this;
        }

        public Criteria andFilterEqualTo(String value) {
            addCriterion("Filter =", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterNotEqualTo(String value) {
            addCriterion("Filter <>", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterGreaterThan(String value) {
            addCriterion("Filter >", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterGreaterThanOrEqualTo(String value) {
            addCriterion("Filter >=", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterLessThan(String value) {
            addCriterion("Filter <", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterLessThanOrEqualTo(String value) {
            addCriterion("Filter <=", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterLike(String value) {
            addCriterion("Filter like", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterNotLike(String value) {
            addCriterion("Filter not like", value, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterIn(List<String> values) {
            addCriterion("Filter in", values, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterNotIn(List<String> values) {
            addCriterion("Filter not in", values, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterBetween(String value1, String value2) {
            addCriterion("Filter between", value1, value2, "filter");
            return (Criteria) this;
        }

        public Criteria andFilterNotBetween(String value1, String value2) {
            addCriterion("Filter not between", value1, value2, "filter");
            return (Criteria) this;
        }

        public Criteria andFiltervalueIsNull() {
            addCriterion("FilterValue is null");
            return (Criteria) this;
        }

        public Criteria andFiltervalueIsNotNull() {
            addCriterion("FilterValue is not null");
            return (Criteria) this;
        }

        public Criteria andFiltervalueEqualTo(String value) {
            addCriterion("FilterValue =", value, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueNotEqualTo(String value) {
            addCriterion("FilterValue <>", value, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueGreaterThan(String value) {
            addCriterion("FilterValue >", value, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueGreaterThanOrEqualTo(String value) {
            addCriterion("FilterValue >=", value, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueLessThan(String value) {
            addCriterion("FilterValue <", value, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueLessThanOrEqualTo(String value) {
            addCriterion("FilterValue <=", value, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueLike(String value) {
            addCriterion("FilterValue like", value, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueNotLike(String value) {
            addCriterion("FilterValue not like", value, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueIn(List<String> values) {
            addCriterion("FilterValue in", values, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueNotIn(List<String> values) {
            addCriterion("FilterValue not in", values, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueBetween(String value1, String value2) {
            addCriterion("FilterValue between", value1, value2, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andFiltervalueNotBetween(String value1, String value2) {
            addCriterion("FilterValue not between", value1, value2, "filtervalue");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNull() {
            addCriterion("ORDERBY is null");
            return (Criteria) this;
        }

        public Criteria andOrderbyIsNotNull() {
            addCriterion("ORDERBY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbyEqualTo(String value) {
            addCriterion("ORDERBY =", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotEqualTo(String value) {
            addCriterion("ORDERBY <>", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThan(String value) {
            addCriterion("ORDERBY >", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERBY >=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThan(String value) {
            addCriterion("ORDERBY <", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLessThanOrEqualTo(String value) {
            addCriterion("ORDERBY <=", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyLike(String value) {
            addCriterion("ORDERBY like", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotLike(String value) {
            addCriterion("ORDERBY not like", value, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyIn(List<String> values) {
            addCriterion("ORDERBY in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotIn(List<String> values) {
            addCriterion("ORDERBY not in", values, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyBetween(String value1, String value2) {
            addCriterion("ORDERBY between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andOrderbyNotBetween(String value1, String value2) {
            addCriterion("ORDERBY not between", value1, value2, "orderby");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisIsNull() {
            addCriterion("Rightparenthesis is null");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisIsNotNull() {
            addCriterion("Rightparenthesis is not null");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisEqualTo(String value) {
            addCriterion("Rightparenthesis =", value, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisNotEqualTo(String value) {
            addCriterion("Rightparenthesis <>", value, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisGreaterThan(String value) {
            addCriterion("Rightparenthesis >", value, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisGreaterThanOrEqualTo(String value) {
            addCriterion("Rightparenthesis >=", value, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisLessThan(String value) {
            addCriterion("Rightparenthesis <", value, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisLessThanOrEqualTo(String value) {
            addCriterion("Rightparenthesis <=", value, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisLike(String value) {
            addCriterion("Rightparenthesis like", value, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisNotLike(String value) {
            addCriterion("Rightparenthesis not like", value, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisIn(List<String> values) {
            addCriterion("Rightparenthesis in", values, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisNotIn(List<String> values) {
            addCriterion("Rightparenthesis not in", values, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisBetween(String value1, String value2) {
            addCriterion("Rightparenthesis between", value1, value2, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andRightparenthesisNotBetween(String value1, String value2) {
            addCriterion("Rightparenthesis not between", value1, value2, "rightparenthesis");
            return (Criteria) this;
        }

        public Criteria andNameidIsNull() {
            addCriterion("Nameid is null");
            return (Criteria) this;
        }

        public Criteria andNameidIsNotNull() {
            addCriterion("Nameid is not null");
            return (Criteria) this;
        }

        public Criteria andNameidEqualTo(Integer value) {
            addCriterion("Nameid =", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotEqualTo(Integer value) {
            addCriterion("Nameid <>", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidGreaterThan(Integer value) {
            addCriterion("Nameid >", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Nameid >=", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidLessThan(Integer value) {
            addCriterion("Nameid <", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidLessThanOrEqualTo(Integer value) {
            addCriterion("Nameid <=", value, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidIn(List<Integer> values) {
            addCriterion("Nameid in", values, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotIn(List<Integer> values) {
            addCriterion("Nameid not in", values, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidBetween(Integer value1, Integer value2) {
            addCriterion("Nameid between", value1, value2, "nameid");
            return (Criteria) this;
        }

        public Criteria andNameidNotBetween(Integer value1, Integer value2) {
            addCriterion("Nameid not between", value1, value2, "nameid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
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