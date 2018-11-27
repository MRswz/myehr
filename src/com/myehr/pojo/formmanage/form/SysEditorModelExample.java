package com.myehr.pojo.formmanage.form;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysEditorModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysEditorModelExample() {
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

        public Criteria andEditorModelFormidIsNull() {
            addCriterion("editor_model_formId is null");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidIsNotNull() {
            addCriterion("editor_model_formId is not null");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidEqualTo(Long value) {
            addCriterion("editor_model_formId =", value, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidNotEqualTo(Long value) {
            addCriterion("editor_model_formId <>", value, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidGreaterThan(Long value) {
            addCriterion("editor_model_formId >", value, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidGreaterThanOrEqualTo(Long value) {
            addCriterion("editor_model_formId >=", value, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidLessThan(Long value) {
            addCriterion("editor_model_formId <", value, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidLessThanOrEqualTo(Long value) {
            addCriterion("editor_model_formId <=", value, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidIn(List<Long> values) {
            addCriterion("editor_model_formId in", values, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidNotIn(List<Long> values) {
            addCriterion("editor_model_formId not in", values, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidBetween(Long value1, Long value2) {
            addCriterion("editor_model_formId between", value1, value2, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormidNotBetween(Long value1, Long value2) {
            addCriterion("editor_model_formId not between", value1, value2, "editorModelFormid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidIsNull() {
            addCriterion("editor_model_buttonId is null");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidIsNotNull() {
            addCriterion("editor_model_buttonId is not null");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidEqualTo(Long value) {
            addCriterion("editor_model_buttonId =", value, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidNotEqualTo(Long value) {
            addCriterion("editor_model_buttonId <>", value, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidGreaterThan(Long value) {
            addCriterion("editor_model_buttonId >", value, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidGreaterThanOrEqualTo(Long value) {
            addCriterion("editor_model_buttonId >=", value, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidLessThan(Long value) {
            addCriterion("editor_model_buttonId <", value, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidLessThanOrEqualTo(Long value) {
            addCriterion("editor_model_buttonId <=", value, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidIn(List<Long> values) {
            addCriterion("editor_model_buttonId in", values, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidNotIn(List<Long> values) {
            addCriterion("editor_model_buttonId not in", values, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidBetween(Long value1, Long value2) {
            addCriterion("editor_model_buttonId between", value1, value2, "editorModelButtonid");
            return (Criteria) this;
        }

        public Criteria andEditorModelButtonidNotBetween(Long value1, Long value2) {
            addCriterion("editor_model_buttonId not between", value1, value2, "editorModelButtonid");
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

        public Criteria andEditorModelCodeIsNull() {
            addCriterion("editor_model_code is null");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeIsNotNull() {
            addCriterion("editor_model_code is not null");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeEqualTo(String value) {
            addCriterion("editor_model_code =", value, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeNotEqualTo(String value) {
            addCriterion("editor_model_code <>", value, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeGreaterThan(String value) {
            addCriterion("editor_model_code >", value, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("editor_model_code >=", value, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeLessThan(String value) {
            addCriterion("editor_model_code <", value, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeLessThanOrEqualTo(String value) {
            addCriterion("editor_model_code <=", value, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeLike(String value) {
            addCriterion("editor_model_code like", value, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeNotLike(String value) {
            addCriterion("editor_model_code not like", value, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeIn(List<String> values) {
            addCriterion("editor_model_code in", values, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeNotIn(List<String> values) {
            addCriterion("editor_model_code not in", values, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeBetween(String value1, String value2) {
            addCriterion("editor_model_code between", value1, value2, "editorModelCode");
            return (Criteria) this;
        }

        public Criteria andEditorModelCodeNotBetween(String value1, String value2) {
            addCriterion("editor_model_code not between", value1, value2, "editorModelCode");
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

        public Criteria andEditorModelFolderIdIsNull() {
            addCriterion("editor_model_folder_id is null");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdIsNotNull() {
            addCriterion("editor_model_folder_id is not null");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdEqualTo(Long value) {
            addCriterion("editor_model_folder_id =", value, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdNotEqualTo(Long value) {
            addCriterion("editor_model_folder_id <>", value, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdGreaterThan(Long value) {
            addCriterion("editor_model_folder_id >", value, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("editor_model_folder_id >=", value, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdLessThan(Long value) {
            addCriterion("editor_model_folder_id <", value, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdLessThanOrEqualTo(Long value) {
            addCriterion("editor_model_folder_id <=", value, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdIn(List<Long> values) {
            addCriterion("editor_model_folder_id in", values, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdNotIn(List<Long> values) {
            addCriterion("editor_model_folder_id not in", values, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdBetween(Long value1, Long value2) {
            addCriterion("editor_model_folder_id between", value1, value2, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andEditorModelFolderIdNotBetween(Long value1, Long value2) {
            addCriterion("editor_model_folder_id not between", value1, value2, "editorModelFolderId");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(Long value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(Long value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(Long value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(Long value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(Long value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(Long value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<Long> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<Long> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(Long value1, Long value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(Long value1, Long value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNull() {
            addCriterion("operator_time is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNotNull() {
            addCriterion("operator_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeEqualTo(Date value) {
            addCriterion("operator_time =", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotEqualTo(Date value) {
            addCriterion("operator_time <>", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThan(Date value) {
            addCriterion("operator_time >", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operator_time >=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThan(Date value) {
            addCriterion("operator_time <", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(Date value) {
            addCriterion("operator_time <=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIn(List<Date> values) {
            addCriterion("operator_time in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotIn(List<Date> values) {
            addCriterion("operator_time not in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeBetween(Date value1, Date value2) {
            addCriterion("operator_time between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotBetween(Date value1, Date value2) {
            addCriterion("operator_time not between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNull() {
            addCriterion("delete_mark is null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIsNotNull() {
            addCriterion("delete_mark is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkEqualTo(String value) {
            addCriterion("delete_mark =", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotEqualTo(String value) {
            addCriterion("delete_mark <>", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThan(String value) {
            addCriterion("delete_mark >", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkGreaterThanOrEqualTo(String value) {
            addCriterion("delete_mark >=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThan(String value) {
            addCriterion("delete_mark <", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLessThanOrEqualTo(String value) {
            addCriterion("delete_mark <=", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkLike(String value) {
            addCriterion("delete_mark like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotLike(String value) {
            addCriterion("delete_mark not like", value, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkIn(List<String> values) {
            addCriterion("delete_mark in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotIn(List<String> values) {
            addCriterion("delete_mark not in", values, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkBetween(String value1, String value2) {
            addCriterion("delete_mark between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andDeleteMarkNotBetween(String value1, String value2) {
            addCriterion("delete_mark not between", value1, value2, "deleteMark");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameIsNull() {
            addCriterion("editor_model_form_name is null");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameIsNotNull() {
            addCriterion("editor_model_form_name is not null");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameEqualTo(String value) {
            addCriterion("editor_model_form_name =", value, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameNotEqualTo(String value) {
            addCriterion("editor_model_form_name <>", value, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameGreaterThan(String value) {
            addCriterion("editor_model_form_name >", value, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameGreaterThanOrEqualTo(String value) {
            addCriterion("editor_model_form_name >=", value, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameLessThan(String value) {
            addCriterion("editor_model_form_name <", value, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameLessThanOrEqualTo(String value) {
            addCriterion("editor_model_form_name <=", value, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameLike(String value) {
            addCriterion("editor_model_form_name like", value, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameNotLike(String value) {
            addCriterion("editor_model_form_name not like", value, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameIn(List<String> values) {
            addCriterion("editor_model_form_name in", values, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameNotIn(List<String> values) {
            addCriterion("editor_model_form_name not in", values, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameBetween(String value1, String value2) {
            addCriterion("editor_model_form_name between", value1, value2, "editorModelFormName");
            return (Criteria) this;
        }

        public Criteria andEditorModelFormNameNotBetween(String value1, String value2) {
            addCriterion("editor_model_form_name not between", value1, value2, "editorModelFormName");
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