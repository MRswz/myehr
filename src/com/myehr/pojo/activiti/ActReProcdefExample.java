package com.myehr.pojo.activiti;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ActReProcdefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActReProcdefExample() {
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
            addCriterion("ID_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Object value) {
            addCriterion("ID_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Object value) {
            addCriterion("ID_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Object value) {
            addCriterion("ID_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Object value) {
            addCriterion("ID_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Object value) {
            addCriterion("ID_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Object value) {
            addCriterion("ID_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Object> values) {
            addCriterion("ID_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Object> values) {
            addCriterion("ID_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Object value1, Object value2) {
            addCriterion("ID_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Object value1, Object value2) {
            addCriterion("ID_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRevIsNull() {
            addCriterion("REV_ is null");
            return (Criteria) this;
        }

        public Criteria andRevIsNotNull() {
            addCriterion("REV_ is not null");
            return (Criteria) this;
        }

        public Criteria andRevEqualTo(BigDecimal value) {
            addCriterion("REV_ =", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotEqualTo(BigDecimal value) {
            addCriterion("REV_ <>", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevGreaterThan(BigDecimal value) {
            addCriterion("REV_ >", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_ >=", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevLessThan(BigDecimal value) {
            addCriterion("REV_ <", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_ <=", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevIn(List<BigDecimal> values) {
            addCriterion("REV_ in", values, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotIn(List<BigDecimal> values) {
            addCriterion("REV_ not in", values, "rev");
            return (Criteria) this;
        }

        public Criteria andRevBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_ between", value1, value2, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_ not between", value1, value2, "rev");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY_ is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY_ is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Object value) {
            addCriterion("CATEGORY_ =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Object value) {
            addCriterion("CATEGORY_ <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Object value) {
            addCriterion("CATEGORY_ >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Object value) {
            addCriterion("CATEGORY_ >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Object value) {
            addCriterion("CATEGORY_ <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Object value) {
            addCriterion("CATEGORY_ <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Object> values) {
            addCriterion("CATEGORY_ in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Object> values) {
            addCriterion("CATEGORY_ not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Object value1, Object value2) {
            addCriterion("CATEGORY_ between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Object value1, Object value2) {
            addCriterion("CATEGORY_ not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(Object value) {
            addCriterion("NAME_ =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(Object value) {
            addCriterion("NAME_ <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(Object value) {
            addCriterion("NAME_ >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(Object value) {
            addCriterion("NAME_ >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(Object value) {
            addCriterion("NAME_ <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(Object value) {
            addCriterion("NAME_ <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<Object> values) {
            addCriterion("NAME_ in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<Object> values) {
            addCriterion("NAME_ not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(Object value1, Object value2) {
            addCriterion("NAME_ between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(Object value1, Object value2) {
            addCriterion("NAME_ not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("KEY_ is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("KEY_ is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(Object value) {
            addCriterion("KEY_ =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(Object value) {
            addCriterion("KEY_ <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(Object value) {
            addCriterion("KEY_ >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(Object value) {
            addCriterion("KEY_ >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(Object value) {
            addCriterion("KEY_ <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(Object value) {
            addCriterion("KEY_ <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<Object> values) {
            addCriterion("KEY_ in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<Object> values) {
            addCriterion("KEY_ not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(Object value1, Object value2) {
            addCriterion("KEY_ between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(Object value1, Object value2) {
            addCriterion("KEY_ not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION_ is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION_ is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(BigDecimal value) {
            addCriterion("VERSION_ =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(BigDecimal value) {
            addCriterion("VERSION_ <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(BigDecimal value) {
            addCriterion("VERSION_ >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION_ >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(BigDecimal value) {
            addCriterion("VERSION_ <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VERSION_ <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<BigDecimal> values) {
            addCriterion("VERSION_ in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<BigDecimal> values) {
            addCriterion("VERSION_ not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION_ between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VERSION_ not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIsNull() {
            addCriterion("DEPLOYMENT_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIsNotNull() {
            addCriterion("DEPLOYMENT_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdEqualTo(Object value) {
            addCriterion("DEPLOYMENT_ID_ =", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotEqualTo(Object value) {
            addCriterion("DEPLOYMENT_ID_ <>", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdGreaterThan(Object value) {
            addCriterion("DEPLOYMENT_ID_ >", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdGreaterThanOrEqualTo(Object value) {
            addCriterion("DEPLOYMENT_ID_ >=", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdLessThan(Object value) {
            addCriterion("DEPLOYMENT_ID_ <", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdLessThanOrEqualTo(Object value) {
            addCriterion("DEPLOYMENT_ID_ <=", value, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdIn(List<Object> values) {
            addCriterion("DEPLOYMENT_ID_ in", values, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotIn(List<Object> values) {
            addCriterion("DEPLOYMENT_ID_ not in", values, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdBetween(Object value1, Object value2) {
            addCriterion("DEPLOYMENT_ID_ between", value1, value2, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andDeploymentIdNotBetween(Object value1, Object value2) {
            addCriterion("DEPLOYMENT_ID_ not between", value1, value2, "deploymentId");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNull() {
            addCriterion("RESOURCE_NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("RESOURCE_NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(Object value) {
            addCriterion("RESOURCE_NAME_ =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(Object value) {
            addCriterion("RESOURCE_NAME_ <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(Object value) {
            addCriterion("RESOURCE_NAME_ >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(Object value) {
            addCriterion("RESOURCE_NAME_ >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(Object value) {
            addCriterion("RESOURCE_NAME_ <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(Object value) {
            addCriterion("RESOURCE_NAME_ <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<Object> values) {
            addCriterion("RESOURCE_NAME_ in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<Object> values) {
            addCriterion("RESOURCE_NAME_ not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(Object value1, Object value2) {
            addCriterion("RESOURCE_NAME_ between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(Object value1, Object value2) {
            addCriterion("RESOURCE_NAME_ not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameIsNull() {
            addCriterion("DGRM_RESOURCE_NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameIsNotNull() {
            addCriterion("DGRM_RESOURCE_NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameEqualTo(String value) {
            addCriterion("DGRM_RESOURCE_NAME_ =", value, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameNotEqualTo(String value) {
            addCriterion("DGRM_RESOURCE_NAME_ <>", value, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameGreaterThan(String value) {
            addCriterion("DGRM_RESOURCE_NAME_ >", value, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("DGRM_RESOURCE_NAME_ >=", value, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameLessThan(String value) {
            addCriterion("DGRM_RESOURCE_NAME_ <", value, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameLessThanOrEqualTo(String value) {
            addCriterion("DGRM_RESOURCE_NAME_ <=", value, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameLike(String value) {
            addCriterion("DGRM_RESOURCE_NAME_ like", value, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameNotLike(String value) {
            addCriterion("DGRM_RESOURCE_NAME_ not like", value, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameIn(List<String> values) {
            addCriterion("DGRM_RESOURCE_NAME_ in", values, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameNotIn(List<String> values) {
            addCriterion("DGRM_RESOURCE_NAME_ not in", values, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameBetween(String value1, String value2) {
            addCriterion("DGRM_RESOURCE_NAME_ between", value1, value2, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDgrmResourceNameNotBetween(String value1, String value2) {
            addCriterion("DGRM_RESOURCE_NAME_ not between", value1, value2, "dgrmResourceName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION_ is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION_ is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(Object value) {
            addCriterion("DESCRIPTION_ =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(Object value) {
            addCriterion("DESCRIPTION_ <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(Object value) {
            addCriterion("DESCRIPTION_ >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(Object value) {
            addCriterion("DESCRIPTION_ >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(Object value) {
            addCriterion("DESCRIPTION_ <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(Object value) {
            addCriterion("DESCRIPTION_ <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<Object> values) {
            addCriterion("DESCRIPTION_ in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<Object> values) {
            addCriterion("DESCRIPTION_ not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(Object value1, Object value2) {
            addCriterion("DESCRIPTION_ between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(Object value1, Object value2) {
            addCriterion("DESCRIPTION_ not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyIsNull() {
            addCriterion("HAS_START_FORM_KEY_ is null");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyIsNotNull() {
            addCriterion("HAS_START_FORM_KEY_ is not null");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyEqualTo(Short value) {
            addCriterion("HAS_START_FORM_KEY_ =", value, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyNotEqualTo(Short value) {
            addCriterion("HAS_START_FORM_KEY_ <>", value, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyGreaterThan(Short value) {
            addCriterion("HAS_START_FORM_KEY_ >", value, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyGreaterThanOrEqualTo(Short value) {
            addCriterion("HAS_START_FORM_KEY_ >=", value, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyLessThan(Short value) {
            addCriterion("HAS_START_FORM_KEY_ <", value, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyLessThanOrEqualTo(Short value) {
            addCriterion("HAS_START_FORM_KEY_ <=", value, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyIn(List<Short> values) {
            addCriterion("HAS_START_FORM_KEY_ in", values, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyNotIn(List<Short> values) {
            addCriterion("HAS_START_FORM_KEY_ not in", values, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyBetween(Short value1, Short value2) {
            addCriterion("HAS_START_FORM_KEY_ between", value1, value2, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasStartFormKeyNotBetween(Short value1, Short value2) {
            addCriterion("HAS_START_FORM_KEY_ not between", value1, value2, "hasStartFormKey");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationIsNull() {
            addCriterion("HAS_GRAPHICAL_NOTATION_ is null");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationIsNotNull() {
            addCriterion("HAS_GRAPHICAL_NOTATION_ is not null");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationEqualTo(Short value) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ =", value, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationNotEqualTo(Short value) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ <>", value, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationGreaterThan(Short value) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ >", value, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationGreaterThanOrEqualTo(Short value) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ >=", value, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationLessThan(Short value) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ <", value, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationLessThanOrEqualTo(Short value) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ <=", value, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationIn(List<Short> values) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ in", values, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationNotIn(List<Short> values) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ not in", values, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationBetween(Short value1, Short value2) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ between", value1, value2, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andHasGraphicalNotationNotBetween(Short value1, Short value2) {
            addCriterion("HAS_GRAPHICAL_NOTATION_ not between", value1, value2, "hasGraphicalNotation");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateIsNull() {
            addCriterion("SUSPENSION_STATE_ is null");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateIsNotNull() {
            addCriterion("SUSPENSION_STATE_ is not null");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateEqualTo(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ =", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateNotEqualTo(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ <>", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateGreaterThan(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ >", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ >=", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateLessThan(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ <", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUSPENSION_STATE_ <=", value, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateIn(List<BigDecimal> values) {
            addCriterion("SUSPENSION_STATE_ in", values, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateNotIn(List<BigDecimal> values) {
            addCriterion("SUSPENSION_STATE_ not in", values, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUSPENSION_STATE_ between", value1, value2, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andSuspensionStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUSPENSION_STATE_ not between", value1, value2, "suspensionState");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(Object value) {
            addCriterion("TENANT_ID_ =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(Object value) {
            addCriterion("TENANT_ID_ <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(Object value) {
            addCriterion("TENANT_ID_ >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(Object value) {
            addCriterion("TENANT_ID_ >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(Object value) {
            addCriterion("TENANT_ID_ <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(Object value) {
            addCriterion("TENANT_ID_ <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<Object> values) {
            addCriterion("TENANT_ID_ in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<Object> values) {
            addCriterion("TENANT_ID_ not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(Object value1, Object value2) {
            addCriterion("TENANT_ID_ between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(Object value1, Object value2) {
            addCriterion("TENANT_ID_ not between", value1, value2, "tenantId");
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