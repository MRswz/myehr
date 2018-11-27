package com.myehr.pojo.formmanage.button;

import java.util.ArrayList;
import java.util.List;

public class SysFormButtonEditorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFormButtonEditorExample() {
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

        public Criteria andButtonEditorModelIdIsNull() {
            addCriterion("button_editor_model_id is null");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdIsNotNull() {
            addCriterion("button_editor_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdEqualTo(Long value) {
            addCriterion("button_editor_model_id =", value, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdNotEqualTo(Long value) {
            addCriterion("button_editor_model_id <>", value, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdGreaterThan(Long value) {
            addCriterion("button_editor_model_id >", value, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("button_editor_model_id >=", value, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdLessThan(Long value) {
            addCriterion("button_editor_model_id <", value, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdLessThanOrEqualTo(Long value) {
            addCriterion("button_editor_model_id <=", value, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdIn(List<Long> values) {
            addCriterion("button_editor_model_id in", values, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdNotIn(List<Long> values) {
            addCriterion("button_editor_model_id not in", values, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdBetween(Long value1, Long value2) {
            addCriterion("button_editor_model_id between", value1, value2, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelIdNotBetween(Long value1, Long value2) {
            addCriterion("button_editor_model_id not between", value1, value2, "buttonEditorModelId");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidIsNull() {
            addCriterion("button_editor_model_formId is null");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidIsNotNull() {
            addCriterion("button_editor_model_formId is not null");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidEqualTo(Long value) {
            addCriterion("button_editor_model_formId =", value, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidNotEqualTo(Long value) {
            addCriterion("button_editor_model_formId <>", value, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidGreaterThan(Long value) {
            addCriterion("button_editor_model_formId >", value, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidGreaterThanOrEqualTo(Long value) {
            addCriterion("button_editor_model_formId >=", value, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidLessThan(Long value) {
            addCriterion("button_editor_model_formId <", value, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidLessThanOrEqualTo(Long value) {
            addCriterion("button_editor_model_formId <=", value, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidIn(List<Long> values) {
            addCriterion("button_editor_model_formId in", values, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidNotIn(List<Long> values) {
            addCriterion("button_editor_model_formId not in", values, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidBetween(Long value1, Long value2) {
            addCriterion("button_editor_model_formId between", value1, value2, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelFormidNotBetween(Long value1, Long value2) {
            addCriterion("button_editor_model_formId not between", value1, value2, "buttonEditorModelFormid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidIsNull() {
            addCriterion("button_editor_model_buttonId is null");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidIsNotNull() {
            addCriterion("button_editor_model_buttonId is not null");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidEqualTo(Long value) {
            addCriterion("button_editor_model_buttonId =", value, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidNotEqualTo(Long value) {
            addCriterion("button_editor_model_buttonId <>", value, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidGreaterThan(Long value) {
            addCriterion("button_editor_model_buttonId >", value, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidGreaterThanOrEqualTo(Long value) {
            addCriterion("button_editor_model_buttonId >=", value, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidLessThan(Long value) {
            addCriterion("button_editor_model_buttonId <", value, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidLessThanOrEqualTo(Long value) {
            addCriterion("button_editor_model_buttonId <=", value, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidIn(List<Long> values) {
            addCriterion("button_editor_model_buttonId in", values, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidNotIn(List<Long> values) {
            addCriterion("button_editor_model_buttonId not in", values, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidBetween(Long value1, Long value2) {
            addCriterion("button_editor_model_buttonId between", value1, value2, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andButtonEditorModelButtonidNotBetween(Long value1, Long value2) {
            addCriterion("button_editor_model_buttonId not between", value1, value2, "buttonEditorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeIsNull() {
            addCriterion("editor_model_type is null");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeIsNotNull() {
            addCriterion("editor_model_type is not null");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeEqualTo(String value) {
            addCriterion("editor_model_type =", value, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeNotEqualTo(String value) {
            addCriterion("editor_model_type <>", value, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeGreaterThan(String value) {
            addCriterion("editor_model_type >", value, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("editor_model_type >=", value, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeLessThan(String value) {
            addCriterion("editor_model_type <", value, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeLessThanOrEqualTo(String value) {
            addCriterion("editor_model_type <=", value, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeLike(String value) {
            addCriterion("editor_model_type like", value, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeNotLike(String value) {
            addCriterion("editor_model_type not like", value, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeIn(List<String> values) {
            addCriterion("editor_model_type in", values, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeNotIn(List<String> values) {
            addCriterion("editor_model_type not in", values, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeBetween(String value1, String value2) {
            addCriterion("editor_model_type between", value1, value2, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorModelTypeNotBetween(String value1, String value2) {
            addCriterion("editor_model_type not between", value1, value2, "editorModelType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeIsNull() {
            addCriterion("editor_message_type is null");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeIsNotNull() {
            addCriterion("editor_message_type is not null");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeEqualTo(String value) {
            addCriterion("editor_message_type =", value, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeNotEqualTo(String value) {
            addCriterion("editor_message_type <>", value, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeGreaterThan(String value) {
            addCriterion("editor_message_type >", value, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("editor_message_type >=", value, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeLessThan(String value) {
            addCriterion("editor_message_type <", value, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("editor_message_type <=", value, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeLike(String value) {
            addCriterion("editor_message_type like", value, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeNotLike(String value) {
            addCriterion("editor_message_type not like", value, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeIn(List<String> values) {
            addCriterion("editor_message_type in", values, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeNotIn(List<String> values) {
            addCriterion("editor_message_type not in", values, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeBetween(String value1, String value2) {
            addCriterion("editor_message_type between", value1, value2, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorMessageTypeNotBetween(String value1, String value2) {
            addCriterion("editor_message_type not between", value1, value2, "editorMessageType");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdIsNull() {
            addCriterion("editor_model_id is null");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdIsNotNull() {
            addCriterion("editor_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdEqualTo(Long value) {
            addCriterion("editor_model_id =", value, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdNotEqualTo(Long value) {
            addCriterion("editor_model_id <>", value, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdGreaterThan(Long value) {
            addCriterion("editor_model_id >", value, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("editor_model_id >=", value, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdLessThan(Long value) {
            addCriterion("editor_model_id <", value, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdLessThanOrEqualTo(Long value) {
            addCriterion("editor_model_id <=", value, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdIn(List<Long> values) {
            addCriterion("editor_model_id in", values, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdNotIn(List<Long> values) {
            addCriterion("editor_model_id not in", values, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdBetween(Long value1, Long value2) {
            addCriterion("editor_model_id between", value1, value2, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelIdNotBetween(Long value1, Long value2) {
            addCriterion("editor_model_id not between", value1, value2, "editorModelId");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameIsNull() {
            addCriterion("editor_model_name is null");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameIsNotNull() {
            addCriterion("editor_model_name is not null");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameEqualTo(String value) {
            addCriterion("editor_model_name =", value, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameNotEqualTo(String value) {
            addCriterion("editor_model_name <>", value, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameGreaterThan(String value) {
            addCriterion("editor_model_name >", value, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("editor_model_name >=", value, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameLessThan(String value) {
            addCriterion("editor_model_name <", value, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameLessThanOrEqualTo(String value) {
            addCriterion("editor_model_name <=", value, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameLike(String value) {
            addCriterion("editor_model_name like", value, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameNotLike(String value) {
            addCriterion("editor_model_name not like", value, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameIn(List<String> values) {
            addCriterion("editor_model_name in", values, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameNotIn(List<String> values) {
            addCriterion("editor_model_name not in", values, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameBetween(String value1, String value2) {
            addCriterion("editor_model_name between", value1, value2, "editorModelName");
            return (Criteria) this;
        }

        public Criteria andEditorModelNameNotBetween(String value1, String value2) {
            addCriterion("editor_model_name not between", value1, value2, "editorModelName");
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