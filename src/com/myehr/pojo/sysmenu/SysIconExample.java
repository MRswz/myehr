package com.myehr.pojo.sysmenu;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SysIconExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysIconExample() {
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

        public Criteria andIconIdIsNull() {
            addCriterion("ICON_ID is null");
            return (Criteria) this;
        }

        public Criteria andIconIdIsNotNull() {
            addCriterion("ICON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIconIdEqualTo(BigDecimal value) {
            addCriterion("ICON_ID =", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotEqualTo(BigDecimal value) {
            addCriterion("ICON_ID <>", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdGreaterThan(BigDecimal value) {
            addCriterion("ICON_ID >", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ICON_ID >=", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLessThan(BigDecimal value) {
            addCriterion("ICON_ID <", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ICON_ID <=", value, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdIn(List<BigDecimal> values) {
            addCriterion("ICON_ID in", values, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotIn(List<BigDecimal> values) {
            addCriterion("ICON_ID not in", values, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ICON_ID between", value1, value2, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ICON_ID not between", value1, value2, "iconId");
            return (Criteria) this;
        }

        public Criteria andIconTypeIsNull() {
            addCriterion("ICON_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIconTypeIsNotNull() {
            addCriterion("ICON_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIconTypeEqualTo(String value) {
            addCriterion("ICON_TYPE =", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeNotEqualTo(String value) {
            addCriterion("ICON_TYPE <>", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeGreaterThan(String value) {
            addCriterion("ICON_TYPE >", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_TYPE >=", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeLessThan(String value) {
            addCriterion("ICON_TYPE <", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeLessThanOrEqualTo(String value) {
            addCriterion("ICON_TYPE <=", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeLike(String value) {
            addCriterion("ICON_TYPE like", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeNotLike(String value) {
            addCriterion("ICON_TYPE not like", value, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeIn(List<String> values) {
            addCriterion("ICON_TYPE in", values, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeNotIn(List<String> values) {
            addCriterion("ICON_TYPE not in", values, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeBetween(String value1, String value2) {
            addCriterion("ICON_TYPE between", value1, value2, "iconType");
            return (Criteria) this;
        }

        public Criteria andIconTypeNotBetween(String value1, String value2) {
            addCriterion("ICON_TYPE not between", value1, value2, "iconType");
            return (Criteria) this;
        }

        public Criteria andImgFileIsNull() {
            addCriterion("IMG_FILE is null");
            return (Criteria) this;
        }

        public Criteria andImgFileIsNotNull() {
            addCriterion("IMG_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andImgFileEqualTo(String value) {
            addCriterion("IMG_FILE =", value, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileNotEqualTo(String value) {
            addCriterion("IMG_FILE <>", value, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileGreaterThan(String value) {
            addCriterion("IMG_FILE >", value, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_FILE >=", value, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileLessThan(String value) {
            addCriterion("IMG_FILE <", value, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileLessThanOrEqualTo(String value) {
            addCriterion("IMG_FILE <=", value, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileLike(String value) {
            addCriterion("IMG_FILE like", value, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileNotLike(String value) {
            addCriterion("IMG_FILE not like", value, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileIn(List<String> values) {
            addCriterion("IMG_FILE in", values, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileNotIn(List<String> values) {
            addCriterion("IMG_FILE not in", values, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileBetween(String value1, String value2) {
            addCriterion("IMG_FILE between", value1, value2, "imgFile");
            return (Criteria) this;
        }

        public Criteria andImgFileNotBetween(String value1, String value2) {
            addCriterion("IMG_FILE not between", value1, value2, "imgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileIsNull() {
            addCriterion("CHECKED_IMG_FILE is null");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileIsNotNull() {
            addCriterion("CHECKED_IMG_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileEqualTo(String value) {
            addCriterion("CHECKED_IMG_FILE =", value, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileNotEqualTo(String value) {
            addCriterion("CHECKED_IMG_FILE <>", value, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileGreaterThan(String value) {
            addCriterion("CHECKED_IMG_FILE >", value, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKED_IMG_FILE >=", value, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileLessThan(String value) {
            addCriterion("CHECKED_IMG_FILE <", value, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileLessThanOrEqualTo(String value) {
            addCriterion("CHECKED_IMG_FILE <=", value, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileLike(String value) {
            addCriterion("CHECKED_IMG_FILE like", value, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileNotLike(String value) {
            addCriterion("CHECKED_IMG_FILE not like", value, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileIn(List<String> values) {
            addCriterion("CHECKED_IMG_FILE in", values, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileNotIn(List<String> values) {
            addCriterion("CHECKED_IMG_FILE not in", values, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileBetween(String value1, String value2) {
            addCriterion("CHECKED_IMG_FILE between", value1, value2, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andCheckedImgFileNotBetween(String value1, String value2) {
            addCriterion("CHECKED_IMG_FILE not between", value1, value2, "checkedImgFile");
            return (Criteria) this;
        }

        public Criteria andIconNameIsNull() {
            addCriterion("ICON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIconNameIsNotNull() {
            addCriterion("ICON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIconNameEqualTo(String value) {
            addCriterion("ICON_NAME =", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameNotEqualTo(String value) {
            addCriterion("ICON_NAME <>", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameGreaterThan(String value) {
            addCriterion("ICON_NAME >", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_NAME >=", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameLessThan(String value) {
            addCriterion("ICON_NAME <", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameLessThanOrEqualTo(String value) {
            addCriterion("ICON_NAME <=", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameLike(String value) {
            addCriterion("ICON_NAME like", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameNotLike(String value) {
            addCriterion("ICON_NAME not like", value, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameIn(List<String> values) {
            addCriterion("ICON_NAME in", values, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameNotIn(List<String> values) {
            addCriterion("ICON_NAME not in", values, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameBetween(String value1, String value2) {
            addCriterion("ICON_NAME between", value1, value2, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconNameNotBetween(String value1, String value2) {
            addCriterion("ICON_NAME not between", value1, value2, "iconName");
            return (Criteria) this;
        }

        public Criteria andIconColorIsNull() {
            addCriterion("ICON_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andIconColorIsNotNull() {
            addCriterion("ICON_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andIconColorEqualTo(String value) {
            addCriterion("ICON_COLOR =", value, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorNotEqualTo(String value) {
            addCriterion("ICON_COLOR <>", value, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorGreaterThan(String value) {
            addCriterion("ICON_COLOR >", value, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorGreaterThanOrEqualTo(String value) {
            addCriterion("ICON_COLOR >=", value, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorLessThan(String value) {
            addCriterion("ICON_COLOR <", value, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorLessThanOrEqualTo(String value) {
            addCriterion("ICON_COLOR <=", value, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorLike(String value) {
            addCriterion("ICON_COLOR like", value, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorNotLike(String value) {
            addCriterion("ICON_COLOR not like", value, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorIn(List<String> values) {
            addCriterion("ICON_COLOR in", values, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorNotIn(List<String> values) {
            addCriterion("ICON_COLOR not in", values, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorBetween(String value1, String value2) {
            addCriterion("ICON_COLOR between", value1, value2, "iconColor");
            return (Criteria) this;
        }

        public Criteria andIconColorNotBetween(String value1, String value2) {
            addCriterion("ICON_COLOR not between", value1, value2, "iconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorIsNull() {
            addCriterion("CHECKED_ICON_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorIsNotNull() {
            addCriterion("CHECKED_ICON_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorEqualTo(String value) {
            addCriterion("CHECKED_ICON_COLOR =", value, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorNotEqualTo(String value) {
            addCriterion("CHECKED_ICON_COLOR <>", value, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorGreaterThan(String value) {
            addCriterion("CHECKED_ICON_COLOR >", value, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKED_ICON_COLOR >=", value, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorLessThan(String value) {
            addCriterion("CHECKED_ICON_COLOR <", value, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorLessThanOrEqualTo(String value) {
            addCriterion("CHECKED_ICON_COLOR <=", value, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorLike(String value) {
            addCriterion("CHECKED_ICON_COLOR like", value, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorNotLike(String value) {
            addCriterion("CHECKED_ICON_COLOR not like", value, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorIn(List<String> values) {
            addCriterion("CHECKED_ICON_COLOR in", values, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorNotIn(List<String> values) {
            addCriterion("CHECKED_ICON_COLOR not in", values, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorBetween(String value1, String value2) {
            addCriterion("CHECKED_ICON_COLOR between", value1, value2, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andCheckedIconColorNotBetween(String value1, String value2) {
            addCriterion("CHECKED_ICON_COLOR not between", value1, value2, "checkedIconColor");
            return (Criteria) this;
        }

        public Criteria andImgOpacityIsNull() {
            addCriterion("IMG_OPACITY is null");
            return (Criteria) this;
        }

        public Criteria andImgOpacityIsNotNull() {
            addCriterion("IMG_OPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andImgOpacityEqualTo(String value) {
            addCriterion("IMG_OPACITY =", value, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityNotEqualTo(String value) {
            addCriterion("IMG_OPACITY <>", value, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityGreaterThan(String value) {
            addCriterion("IMG_OPACITY >", value, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_OPACITY >=", value, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityLessThan(String value) {
            addCriterion("IMG_OPACITY <", value, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityLessThanOrEqualTo(String value) {
            addCriterion("IMG_OPACITY <=", value, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityLike(String value) {
            addCriterion("IMG_OPACITY like", value, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityNotLike(String value) {
            addCriterion("IMG_OPACITY not like", value, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityIn(List<String> values) {
            addCriterion("IMG_OPACITY in", values, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityNotIn(List<String> values) {
            addCriterion("IMG_OPACITY not in", values, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityBetween(String value1, String value2) {
            addCriterion("IMG_OPACITY between", value1, value2, "imgOpacity");
            return (Criteria) this;
        }

        public Criteria andImgOpacityNotBetween(String value1, String value2) {
            addCriterion("IMG_OPACITY not between", value1, value2, "imgOpacity");
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