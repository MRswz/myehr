package com.myehr.pojo.formmanage.gui;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCardTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysCardTemplateExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIsNull() {
            addCriterion("template_title is null");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIsNotNull() {
            addCriterion("template_title is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleEqualTo(String value) {
            addCriterion("template_title =", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotEqualTo(String value) {
            addCriterion("template_title <>", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleGreaterThan(String value) {
            addCriterion("template_title >", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleGreaterThanOrEqualTo(String value) {
            addCriterion("template_title >=", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLessThan(String value) {
            addCriterion("template_title <", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLessThanOrEqualTo(String value) {
            addCriterion("template_title <=", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleLike(String value) {
            addCriterion("template_title like", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotLike(String value) {
            addCriterion("template_title not like", value, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleIn(List<String> values) {
            addCriterion("template_title in", values, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotIn(List<String> values) {
            addCriterion("template_title not in", values, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleBetween(String value1, String value2) {
            addCriterion("template_title between", value1, value2, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateTitleNotBetween(String value1, String value2) {
            addCriterion("template_title not between", value1, value2, "templateTitle");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressIsNull() {
            addCriterion("template_address is null");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressIsNotNull() {
            addCriterion("template_address is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressEqualTo(String value) {
            addCriterion("template_address =", value, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressNotEqualTo(String value) {
            addCriterion("template_address <>", value, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressGreaterThan(String value) {
            addCriterion("template_address >", value, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressGreaterThanOrEqualTo(String value) {
            addCriterion("template_address >=", value, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressLessThan(String value) {
            addCriterion("template_address <", value, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressLessThanOrEqualTo(String value) {
            addCriterion("template_address <=", value, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressLike(String value) {
            addCriterion("template_address like", value, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressNotLike(String value) {
            addCriterion("template_address not like", value, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressIn(List<String> values) {
            addCriterion("template_address in", values, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressNotIn(List<String> values) {
            addCriterion("template_address not in", values, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressBetween(String value1, String value2) {
            addCriterion("template_address between", value1, value2, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplateAddressNotBetween(String value1, String value2) {
            addCriterion("template_address not between", value1, value2, "templateAddress");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoIsNull() {
            addCriterion("template_photo is null");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoIsNotNull() {
            addCriterion("template_photo is not null");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoEqualTo(String value) {
            addCriterion("template_photo =", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoNotEqualTo(String value) {
            addCriterion("template_photo <>", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoGreaterThan(String value) {
            addCriterion("template_photo >", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("template_photo >=", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoLessThan(String value) {
            addCriterion("template_photo <", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoLessThanOrEqualTo(String value) {
            addCriterion("template_photo <=", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoLike(String value) {
            addCriterion("template_photo like", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoNotLike(String value) {
            addCriterion("template_photo not like", value, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoIn(List<String> values) {
            addCriterion("template_photo in", values, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoNotIn(List<String> values) {
            addCriterion("template_photo not in", values, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoBetween(String value1, String value2) {
            addCriterion("template_photo between", value1, value2, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplatePhotoNotBetween(String value1, String value2) {
            addCriterion("template_photo not between", value1, value2, "templatePhoto");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNull() {
            addCriterion("template_name is null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIsNotNull() {
            addCriterion("template_name is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateNameEqualTo(String value) {
            addCriterion("template_name =", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotEqualTo(String value) {
            addCriterion("template_name <>", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThan(String value) {
            addCriterion("template_name >", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameGreaterThanOrEqualTo(String value) {
            addCriterion("template_name >=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThan(String value) {
            addCriterion("template_name <", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLessThanOrEqualTo(String value) {
            addCriterion("template_name <=", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameLike(String value) {
            addCriterion("template_name like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotLike(String value) {
            addCriterion("template_name not like", value, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameIn(List<String> values) {
            addCriterion("template_name in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotIn(List<String> values) {
            addCriterion("template_name not in", values, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameBetween(String value1, String value2) {
            addCriterion("template_name between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateNameNotBetween(String value1, String value2) {
            addCriterion("template_name not between", value1, value2, "templateName");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1IsNull() {
            addCriterion("template_content1 is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1IsNotNull() {
            addCriterion("template_content1 is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1EqualTo(String value) {
            addCriterion("template_content1 =", value, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1NotEqualTo(String value) {
            addCriterion("template_content1 <>", value, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1GreaterThan(String value) {
            addCriterion("template_content1 >", value, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1GreaterThanOrEqualTo(String value) {
            addCriterion("template_content1 >=", value, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1LessThan(String value) {
            addCriterion("template_content1 <", value, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1LessThanOrEqualTo(String value) {
            addCriterion("template_content1 <=", value, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1Like(String value) {
            addCriterion("template_content1 like", value, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1NotLike(String value) {
            addCriterion("template_content1 not like", value, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1In(List<String> values) {
            addCriterion("template_content1 in", values, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1NotIn(List<String> values) {
            addCriterion("template_content1 not in", values, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1Between(String value1, String value2) {
            addCriterion("template_content1 between", value1, value2, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent1NotBetween(String value1, String value2) {
            addCriterion("template_content1 not between", value1, value2, "templateContent1");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2IsNull() {
            addCriterion("template_content2 is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2IsNotNull() {
            addCriterion("template_content2 is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2EqualTo(String value) {
            addCriterion("template_content2 =", value, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2NotEqualTo(String value) {
            addCriterion("template_content2 <>", value, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2GreaterThan(String value) {
            addCriterion("template_content2 >", value, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2GreaterThanOrEqualTo(String value) {
            addCriterion("template_content2 >=", value, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2LessThan(String value) {
            addCriterion("template_content2 <", value, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2LessThanOrEqualTo(String value) {
            addCriterion("template_content2 <=", value, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2Like(String value) {
            addCriterion("template_content2 like", value, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2NotLike(String value) {
            addCriterion("template_content2 not like", value, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2In(List<String> values) {
            addCriterion("template_content2 in", values, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2NotIn(List<String> values) {
            addCriterion("template_content2 not in", values, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2Between(String value1, String value2) {
            addCriterion("template_content2 between", value1, value2, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent2NotBetween(String value1, String value2) {
            addCriterion("template_content2 not between", value1, value2, "templateContent2");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3IsNull() {
            addCriterion("template_content3 is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3IsNotNull() {
            addCriterion("template_content3 is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3EqualTo(String value) {
            addCriterion("template_content3 =", value, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3NotEqualTo(String value) {
            addCriterion("template_content3 <>", value, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3GreaterThan(String value) {
            addCriterion("template_content3 >", value, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3GreaterThanOrEqualTo(String value) {
            addCriterion("template_content3 >=", value, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3LessThan(String value) {
            addCriterion("template_content3 <", value, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3LessThanOrEqualTo(String value) {
            addCriterion("template_content3 <=", value, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3Like(String value) {
            addCriterion("template_content3 like", value, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3NotLike(String value) {
            addCriterion("template_content3 not like", value, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3In(List<String> values) {
            addCriterion("template_content3 in", values, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3NotIn(List<String> values) {
            addCriterion("template_content3 not in", values, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3Between(String value1, String value2) {
            addCriterion("template_content3 between", value1, value2, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent3NotBetween(String value1, String value2) {
            addCriterion("template_content3 not between", value1, value2, "templateContent3");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4IsNull() {
            addCriterion("template_content4 is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4IsNotNull() {
            addCriterion("template_content4 is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4EqualTo(String value) {
            addCriterion("template_content4 =", value, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4NotEqualTo(String value) {
            addCriterion("template_content4 <>", value, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4GreaterThan(String value) {
            addCriterion("template_content4 >", value, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4GreaterThanOrEqualTo(String value) {
            addCriterion("template_content4 >=", value, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4LessThan(String value) {
            addCriterion("template_content4 <", value, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4LessThanOrEqualTo(String value) {
            addCriterion("template_content4 <=", value, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4Like(String value) {
            addCriterion("template_content4 like", value, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4NotLike(String value) {
            addCriterion("template_content4 not like", value, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4In(List<String> values) {
            addCriterion("template_content4 in", values, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4NotIn(List<String> values) {
            addCriterion("template_content4 not in", values, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4Between(String value1, String value2) {
            addCriterion("template_content4 between", value1, value2, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent4NotBetween(String value1, String value2) {
            addCriterion("template_content4 not between", value1, value2, "templateContent4");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5IsNull() {
            addCriterion("template_content5 is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5IsNotNull() {
            addCriterion("template_content5 is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5EqualTo(String value) {
            addCriterion("template_content5 =", value, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5NotEqualTo(String value) {
            addCriterion("template_content5 <>", value, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5GreaterThan(String value) {
            addCriterion("template_content5 >", value, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5GreaterThanOrEqualTo(String value) {
            addCriterion("template_content5 >=", value, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5LessThan(String value) {
            addCriterion("template_content5 <", value, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5LessThanOrEqualTo(String value) {
            addCriterion("template_content5 <=", value, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5Like(String value) {
            addCriterion("template_content5 like", value, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5NotLike(String value) {
            addCriterion("template_content5 not like", value, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5In(List<String> values) {
            addCriterion("template_content5 in", values, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5NotIn(List<String> values) {
            addCriterion("template_content5 not in", values, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5Between(String value1, String value2) {
            addCriterion("template_content5 between", value1, value2, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent5NotBetween(String value1, String value2) {
            addCriterion("template_content5 not between", value1, value2, "templateContent5");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6IsNull() {
            addCriterion("template_content6 is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6IsNotNull() {
            addCriterion("template_content6 is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6EqualTo(String value) {
            addCriterion("template_content6 =", value, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6NotEqualTo(String value) {
            addCriterion("template_content6 <>", value, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6GreaterThan(String value) {
            addCriterion("template_content6 >", value, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6GreaterThanOrEqualTo(String value) {
            addCriterion("template_content6 >=", value, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6LessThan(String value) {
            addCriterion("template_content6 <", value, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6LessThanOrEqualTo(String value) {
            addCriterion("template_content6 <=", value, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6Like(String value) {
            addCriterion("template_content6 like", value, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6NotLike(String value) {
            addCriterion("template_content6 not like", value, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6In(List<String> values) {
            addCriterion("template_content6 in", values, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6NotIn(List<String> values) {
            addCriterion("template_content6 not in", values, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6Between(String value1, String value2) {
            addCriterion("template_content6 between", value1, value2, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent6NotBetween(String value1, String value2) {
            addCriterion("template_content6 not between", value1, value2, "templateContent6");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7IsNull() {
            addCriterion("template_content7 is null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7IsNotNull() {
            addCriterion("template_content7 is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7EqualTo(String value) {
            addCriterion("template_content7 =", value, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7NotEqualTo(String value) {
            addCriterion("template_content7 <>", value, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7GreaterThan(String value) {
            addCriterion("template_content7 >", value, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7GreaterThanOrEqualTo(String value) {
            addCriterion("template_content7 >=", value, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7LessThan(String value) {
            addCriterion("template_content7 <", value, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7LessThanOrEqualTo(String value) {
            addCriterion("template_content7 <=", value, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7Like(String value) {
            addCriterion("template_content7 like", value, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7NotLike(String value) {
            addCriterion("template_content7 not like", value, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7In(List<String> values) {
            addCriterion("template_content7 in", values, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7NotIn(List<String> values) {
            addCriterion("template_content7 not in", values, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7Between(String value1, String value2) {
            addCriterion("template_content7 between", value1, value2, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andTemplateContent7NotBetween(String value1, String value2) {
            addCriterion("template_content7 not between", value1, value2, "templateContent7");
            return (Criteria) this;
        }

        public Criteria andSmallNumIsNull() {
            addCriterion("small_num is null");
            return (Criteria) this;
        }

        public Criteria andSmallNumIsNotNull() {
            addCriterion("small_num is not null");
            return (Criteria) this;
        }

        public Criteria andSmallNumEqualTo(BigDecimal value) {
            addCriterion("small_num =", value, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumNotEqualTo(BigDecimal value) {
            addCriterion("small_num <>", value, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumGreaterThan(BigDecimal value) {
            addCriterion("small_num >", value, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("small_num >=", value, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumLessThan(BigDecimal value) {
            addCriterion("small_num <", value, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("small_num <=", value, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumIn(List<BigDecimal> values) {
            addCriterion("small_num in", values, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumNotIn(List<BigDecimal> values) {
            addCriterion("small_num not in", values, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("small_num between", value1, value2, "smallNum");
            return (Criteria) this;
        }

        public Criteria andSmallNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("small_num not between", value1, value2, "smallNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumIsNull() {
            addCriterion("middle_num is null");
            return (Criteria) this;
        }

        public Criteria andMiddleNumIsNotNull() {
            addCriterion("middle_num is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleNumEqualTo(BigDecimal value) {
            addCriterion("middle_num =", value, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumNotEqualTo(BigDecimal value) {
            addCriterion("middle_num <>", value, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumGreaterThan(BigDecimal value) {
            addCriterion("middle_num >", value, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("middle_num >=", value, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumLessThan(BigDecimal value) {
            addCriterion("middle_num <", value, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("middle_num <=", value, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumIn(List<BigDecimal> values) {
            addCriterion("middle_num in", values, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumNotIn(List<BigDecimal> values) {
            addCriterion("middle_num not in", values, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("middle_num between", value1, value2, "middleNum");
            return (Criteria) this;
        }

        public Criteria andMiddleNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("middle_num not between", value1, value2, "middleNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumIsNull() {
            addCriterion("large_num is null");
            return (Criteria) this;
        }

        public Criteria andLargeNumIsNotNull() {
            addCriterion("large_num is not null");
            return (Criteria) this;
        }

        public Criteria andLargeNumEqualTo(BigDecimal value) {
            addCriterion("large_num =", value, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumNotEqualTo(BigDecimal value) {
            addCriterion("large_num <>", value, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumGreaterThan(BigDecimal value) {
            addCriterion("large_num >", value, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("large_num >=", value, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumLessThan(BigDecimal value) {
            addCriterion("large_num <", value, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("large_num <=", value, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumIn(List<BigDecimal> values) {
            addCriterion("large_num in", values, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumNotIn(List<BigDecimal> values) {
            addCriterion("large_num not in", values, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("large_num between", value1, value2, "largeNum");
            return (Criteria) this;
        }

        public Criteria andLargeNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("large_num not between", value1, value2, "largeNum");
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

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
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