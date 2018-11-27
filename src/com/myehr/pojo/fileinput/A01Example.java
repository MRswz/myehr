package com.myehr.pojo.fileinput;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class A01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public A01Example() {
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

        public Criteria andA0188IsNull() {
            addCriterion("A0188 is null");
            return (Criteria) this;
        }

        public Criteria andA0188IsNotNull() {
            addCriterion("A0188 is not null");
            return (Criteria) this;
        }

        public Criteria andA0188EqualTo(Integer value) {
            addCriterion("A0188 =", value, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188NotEqualTo(Integer value) {
            addCriterion("A0188 <>", value, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188GreaterThan(Integer value) {
            addCriterion("A0188 >", value, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188GreaterThanOrEqualTo(Integer value) {
            addCriterion("A0188 >=", value, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188LessThan(Integer value) {
            addCriterion("A0188 <", value, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188LessThanOrEqualTo(Integer value) {
            addCriterion("A0188 <=", value, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188In(List<Integer> values) {
            addCriterion("A0188 in", values, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188NotIn(List<Integer> values) {
            addCriterion("A0188 not in", values, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188Between(Integer value1, Integer value2) {
            addCriterion("A0188 between", value1, value2, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0188NotBetween(Integer value1, Integer value2) {
            addCriterion("A0188 not between", value1, value2, "a0188");
            return (Criteria) this;
        }

        public Criteria andA0101IsNull() {
            addCriterion("A0101 is null");
            return (Criteria) this;
        }

        public Criteria andA0101IsNotNull() {
            addCriterion("A0101 is not null");
            return (Criteria) this;
        }

        public Criteria andA0101EqualTo(String value) {
            addCriterion("A0101 =", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotEqualTo(String value) {
            addCriterion("A0101 <>", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101GreaterThan(String value) {
            addCriterion("A0101 >", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101GreaterThanOrEqualTo(String value) {
            addCriterion("A0101 >=", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101LessThan(String value) {
            addCriterion("A0101 <", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101LessThanOrEqualTo(String value) {
            addCriterion("A0101 <=", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101Like(String value) {
            addCriterion("A0101 like", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotLike(String value) {
            addCriterion("A0101 not like", value, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101In(List<String> values) {
            addCriterion("A0101 in", values, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotIn(List<String> values) {
            addCriterion("A0101 not in", values, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101Between(String value1, String value2) {
            addCriterion("A0101 between", value1, value2, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0101NotBetween(String value1, String value2) {
            addCriterion("A0101 not between", value1, value2, "a0101");
            return (Criteria) this;
        }

        public Criteria andA0107IsNull() {
            addCriterion("A0107 is null");
            return (Criteria) this;
        }

        public Criteria andA0107IsNotNull() {
            addCriterion("A0107 is not null");
            return (Criteria) this;
        }

        public Criteria andA0107EqualTo(String value) {
            addCriterion("A0107 =", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotEqualTo(String value) {
            addCriterion("A0107 <>", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107GreaterThan(String value) {
            addCriterion("A0107 >", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107GreaterThanOrEqualTo(String value) {
            addCriterion("A0107 >=", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107LessThan(String value) {
            addCriterion("A0107 <", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107LessThanOrEqualTo(String value) {
            addCriterion("A0107 <=", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107Like(String value) {
            addCriterion("A0107 like", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotLike(String value) {
            addCriterion("A0107 not like", value, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107In(List<String> values) {
            addCriterion("A0107 in", values, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotIn(List<String> values) {
            addCriterion("A0107 not in", values, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107Between(String value1, String value2) {
            addCriterion("A0107 between", value1, value2, "a0107");
            return (Criteria) this;
        }

        public Criteria andA0107NotBetween(String value1, String value2) {
            addCriterion("A0107 not between", value1, value2, "a0107");
            return (Criteria) this;
        }

        public Criteria andA01103IsNull() {
            addCriterion("A01103 is null");
            return (Criteria) this;
        }

        public Criteria andA01103IsNotNull() {
            addCriterion("A01103 is not null");
            return (Criteria) this;
        }

        public Criteria andA01103EqualTo(String value) {
            addCriterion("A01103 =", value, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103NotEqualTo(String value) {
            addCriterion("A01103 <>", value, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103GreaterThan(String value) {
            addCriterion("A01103 >", value, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103GreaterThanOrEqualTo(String value) {
            addCriterion("A01103 >=", value, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103LessThan(String value) {
            addCriterion("A01103 <", value, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103LessThanOrEqualTo(String value) {
            addCriterion("A01103 <=", value, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103Like(String value) {
            addCriterion("A01103 like", value, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103NotLike(String value) {
            addCriterion("A01103 not like", value, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103In(List<String> values) {
            addCriterion("A01103 in", values, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103NotIn(List<String> values) {
            addCriterion("A01103 not in", values, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103Between(String value1, String value2) {
            addCriterion("A01103 between", value1, value2, "a01103");
            return (Criteria) this;
        }

        public Criteria andA01103NotBetween(String value1, String value2) {
            addCriterion("A01103 not between", value1, value2, "a01103");
            return (Criteria) this;
        }

        public Criteria andA0111IsNull() {
            addCriterion("A0111 is null");
            return (Criteria) this;
        }

        public Criteria andA0111IsNotNull() {
            addCriterion("A0111 is not null");
            return (Criteria) this;
        }

        public Criteria andA0111EqualTo(Date value) {
            addCriterion("A0111 =", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotEqualTo(Date value) {
            addCriterion("A0111 <>", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111GreaterThan(Date value) {
            addCriterion("A0111 >", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111GreaterThanOrEqualTo(Date value) {
            addCriterion("A0111 >=", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111LessThan(Date value) {
            addCriterion("A0111 <", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111LessThanOrEqualTo(Date value) {
            addCriterion("A0111 <=", value, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111In(List<Date> values) {
            addCriterion("A0111 in", values, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotIn(List<Date> values) {
            addCriterion("A0111 not in", values, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111Between(Date value1, Date value2) {
            addCriterion("A0111 between", value1, value2, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0111NotBetween(Date value1, Date value2) {
            addCriterion("A0111 not between", value1, value2, "a0111");
            return (Criteria) this;
        }

        public Criteria andA0114IsNull() {
            addCriterion("A0114 is null");
            return (Criteria) this;
        }

        public Criteria andA0114IsNotNull() {
            addCriterion("A0114 is not null");
            return (Criteria) this;
        }

        public Criteria andA0114EqualTo(String value) {
            addCriterion("A0114 =", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114NotEqualTo(String value) {
            addCriterion("A0114 <>", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114GreaterThan(String value) {
            addCriterion("A0114 >", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114GreaterThanOrEqualTo(String value) {
            addCriterion("A0114 >=", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114LessThan(String value) {
            addCriterion("A0114 <", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114LessThanOrEqualTo(String value) {
            addCriterion("A0114 <=", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114Like(String value) {
            addCriterion("A0114 like", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114NotLike(String value) {
            addCriterion("A0114 not like", value, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114In(List<String> values) {
            addCriterion("A0114 in", values, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114NotIn(List<String> values) {
            addCriterion("A0114 not in", values, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114Between(String value1, String value2) {
            addCriterion("A0114 between", value1, value2, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0114NotBetween(String value1, String value2) {
            addCriterion("A0114 not between", value1, value2, "a0114");
            return (Criteria) this;
        }

        public Criteria andA0121IsNull() {
            addCriterion("A0121 is null");
            return (Criteria) this;
        }

        public Criteria andA0121IsNotNull() {
            addCriterion("A0121 is not null");
            return (Criteria) this;
        }

        public Criteria andA0121EqualTo(String value) {
            addCriterion("A0121 =", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotEqualTo(String value) {
            addCriterion("A0121 <>", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121GreaterThan(String value) {
            addCriterion("A0121 >", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121GreaterThanOrEqualTo(String value) {
            addCriterion("A0121 >=", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121LessThan(String value) {
            addCriterion("A0121 <", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121LessThanOrEqualTo(String value) {
            addCriterion("A0121 <=", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121Like(String value) {
            addCriterion("A0121 like", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotLike(String value) {
            addCriterion("A0121 not like", value, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121In(List<String> values) {
            addCriterion("A0121 in", values, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotIn(List<String> values) {
            addCriterion("A0121 not in", values, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121Between(String value1, String value2) {
            addCriterion("A0121 between", value1, value2, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0121NotBetween(String value1, String value2) {
            addCriterion("A0121 not between", value1, value2, "a0121");
            return (Criteria) this;
        }

        public Criteria andA0127IsNull() {
            addCriterion("A0127 is null");
            return (Criteria) this;
        }

        public Criteria andA0127IsNotNull() {
            addCriterion("A0127 is not null");
            return (Criteria) this;
        }

        public Criteria andA0127EqualTo(String value) {
            addCriterion("A0127 =", value, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127NotEqualTo(String value) {
            addCriterion("A0127 <>", value, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127GreaterThan(String value) {
            addCriterion("A0127 >", value, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127GreaterThanOrEqualTo(String value) {
            addCriterion("A0127 >=", value, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127LessThan(String value) {
            addCriterion("A0127 <", value, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127LessThanOrEqualTo(String value) {
            addCriterion("A0127 <=", value, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127Like(String value) {
            addCriterion("A0127 like", value, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127NotLike(String value) {
            addCriterion("A0127 not like", value, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127In(List<String> values) {
            addCriterion("A0127 in", values, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127NotIn(List<String> values) {
            addCriterion("A0127 not in", values, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127Between(String value1, String value2) {
            addCriterion("A0127 between", value1, value2, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0127NotBetween(String value1, String value2) {
            addCriterion("A0127 not between", value1, value2, "a0127");
            return (Criteria) this;
        }

        public Criteria andA0141IsNull() {
            addCriterion("A0141 is null");
            return (Criteria) this;
        }

        public Criteria andA0141IsNotNull() {
            addCriterion("A0141 is not null");
            return (Criteria) this;
        }

        public Criteria andA0141EqualTo(Date value) {
            addCriterion("A0141 =", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141NotEqualTo(Date value) {
            addCriterion("A0141 <>", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141GreaterThan(Date value) {
            addCriterion("A0141 >", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141GreaterThanOrEqualTo(Date value) {
            addCriterion("A0141 >=", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141LessThan(Date value) {
            addCriterion("A0141 <", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141LessThanOrEqualTo(Date value) {
            addCriterion("A0141 <=", value, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141In(List<Date> values) {
            addCriterion("A0141 in", values, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141NotIn(List<Date> values) {
            addCriterion("A0141 not in", values, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141Between(Date value1, Date value2) {
            addCriterion("A0141 between", value1, value2, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0141NotBetween(Date value1, Date value2) {
            addCriterion("A0141 not between", value1, value2, "a0141");
            return (Criteria) this;
        }

        public Criteria andA0144IsNull() {
            addCriterion("A0144 is null");
            return (Criteria) this;
        }

        public Criteria andA0144IsNotNull() {
            addCriterion("A0144 is not null");
            return (Criteria) this;
        }

        public Criteria andA0144EqualTo(Date value) {
            addCriterion("A0144 =", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144NotEqualTo(Date value) {
            addCriterion("A0144 <>", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144GreaterThan(Date value) {
            addCriterion("A0144 >", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144GreaterThanOrEqualTo(Date value) {
            addCriterion("A0144 >=", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144LessThan(Date value) {
            addCriterion("A0144 <", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144LessThanOrEqualTo(Date value) {
            addCriterion("A0144 <=", value, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144In(List<Date> values) {
            addCriterion("A0144 in", values, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144NotIn(List<Date> values) {
            addCriterion("A0144 not in", values, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144Between(Date value1, Date value2) {
            addCriterion("A0144 between", value1, value2, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0144NotBetween(Date value1, Date value2) {
            addCriterion("A0144 not between", value1, value2, "a0144");
            return (Criteria) this;
        }

        public Criteria andA0146IsNull() {
            addCriterion("A0146 is null");
            return (Criteria) this;
        }

        public Criteria andA0146IsNotNull() {
            addCriterion("A0146 is not null");
            return (Criteria) this;
        }

        public Criteria andA0146EqualTo(String value) {
            addCriterion("A0146 =", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146NotEqualTo(String value) {
            addCriterion("A0146 <>", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146GreaterThan(String value) {
            addCriterion("A0146 >", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146GreaterThanOrEqualTo(String value) {
            addCriterion("A0146 >=", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146LessThan(String value) {
            addCriterion("A0146 <", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146LessThanOrEqualTo(String value) {
            addCriterion("A0146 <=", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146Like(String value) {
            addCriterion("A0146 like", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146NotLike(String value) {
            addCriterion("A0146 not like", value, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146In(List<String> values) {
            addCriterion("A0146 in", values, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146NotIn(List<String> values) {
            addCriterion("A0146 not in", values, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146Between(String value1, String value2) {
            addCriterion("A0146 between", value1, value2, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0146NotBetween(String value1, String value2) {
            addCriterion("A0146 not between", value1, value2, "a0146");
            return (Criteria) this;
        }

        public Criteria andA0147IsNull() {
            addCriterion("A0147 is null");
            return (Criteria) this;
        }

        public Criteria andA0147IsNotNull() {
            addCriterion("A0147 is not null");
            return (Criteria) this;
        }

        public Criteria andA0147EqualTo(String value) {
            addCriterion("A0147 =", value, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147NotEqualTo(String value) {
            addCriterion("A0147 <>", value, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147GreaterThan(String value) {
            addCriterion("A0147 >", value, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147GreaterThanOrEqualTo(String value) {
            addCriterion("A0147 >=", value, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147LessThan(String value) {
            addCriterion("A0147 <", value, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147LessThanOrEqualTo(String value) {
            addCriterion("A0147 <=", value, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147Like(String value) {
            addCriterion("A0147 like", value, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147NotLike(String value) {
            addCriterion("A0147 not like", value, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147In(List<String> values) {
            addCriterion("A0147 in", values, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147NotIn(List<String> values) {
            addCriterion("A0147 not in", values, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147Between(String value1, String value2) {
            addCriterion("A0147 between", value1, value2, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0147NotBetween(String value1, String value2) {
            addCriterion("A0147 not between", value1, value2, "a0147");
            return (Criteria) this;
        }

        public Criteria andA0190IsNull() {
            addCriterion("A0190 is null");
            return (Criteria) this;
        }

        public Criteria andA0190IsNotNull() {
            addCriterion("A0190 is not null");
            return (Criteria) this;
        }

        public Criteria andA0190EqualTo(String value) {
            addCriterion("A0190 =", value, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190NotEqualTo(String value) {
            addCriterion("A0190 <>", value, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190GreaterThan(String value) {
            addCriterion("A0190 >", value, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190GreaterThanOrEqualTo(String value) {
            addCriterion("A0190 >=", value, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190LessThan(String value) {
            addCriterion("A0190 <", value, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190LessThanOrEqualTo(String value) {
            addCriterion("A0190 <=", value, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190Like(String value) {
            addCriterion("A0190 like", value, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190NotLike(String value) {
            addCriterion("A0190 not like", value, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190In(List<String> values) {
            addCriterion("A0190 in", values, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190NotIn(List<String> values) {
            addCriterion("A0190 not in", values, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190Between(String value1, String value2) {
            addCriterion("A0190 between", value1, value2, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0190NotBetween(String value1, String value2) {
            addCriterion("A0190 not between", value1, value2, "a0190");
            return (Criteria) this;
        }

        public Criteria andA0191IsNull() {
            addCriterion("A0191 is null");
            return (Criteria) this;
        }

        public Criteria andA0191IsNotNull() {
            addCriterion("A0191 is not null");
            return (Criteria) this;
        }

        public Criteria andA0191EqualTo(String value) {
            addCriterion("A0191 =", value, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191NotEqualTo(String value) {
            addCriterion("A0191 <>", value, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191GreaterThan(String value) {
            addCriterion("A0191 >", value, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191GreaterThanOrEqualTo(String value) {
            addCriterion("A0191 >=", value, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191LessThan(String value) {
            addCriterion("A0191 <", value, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191LessThanOrEqualTo(String value) {
            addCriterion("A0191 <=", value, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191Like(String value) {
            addCriterion("A0191 like", value, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191NotLike(String value) {
            addCriterion("A0191 not like", value, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191In(List<String> values) {
            addCriterion("A0191 in", values, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191NotIn(List<String> values) {
            addCriterion("A0191 not in", values, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191Between(String value1, String value2) {
            addCriterion("A0191 between", value1, value2, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0191NotBetween(String value1, String value2) {
            addCriterion("A0191 not between", value1, value2, "a0191");
            return (Criteria) this;
        }

        public Criteria andA0193IsNull() {
            addCriterion("A0193 is null");
            return (Criteria) this;
        }

        public Criteria andA0193IsNotNull() {
            addCriterion("A0193 is not null");
            return (Criteria) this;
        }

        public Criteria andA0193EqualTo(BigDecimal value) {
            addCriterion("A0193 =", value, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193NotEqualTo(BigDecimal value) {
            addCriterion("A0193 <>", value, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193GreaterThan(BigDecimal value) {
            addCriterion("A0193 >", value, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A0193 >=", value, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193LessThan(BigDecimal value) {
            addCriterion("A0193 <", value, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193LessThanOrEqualTo(BigDecimal value) {
            addCriterion("A0193 <=", value, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193In(List<BigDecimal> values) {
            addCriterion("A0193 in", values, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193NotIn(List<BigDecimal> values) {
            addCriterion("A0193 not in", values, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("A0193 between", value1, value2, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0193NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A0193 not between", value1, value2, "a0193");
            return (Criteria) this;
        }

        public Criteria andA0199IsNull() {
            addCriterion("A0199 is null");
            return (Criteria) this;
        }

        public Criteria andA0199IsNotNull() {
            addCriterion("A0199 is not null");
            return (Criteria) this;
        }

        public Criteria andA0199EqualTo(BigDecimal value) {
            addCriterion("A0199 =", value, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199NotEqualTo(BigDecimal value) {
            addCriterion("A0199 <>", value, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199GreaterThan(BigDecimal value) {
            addCriterion("A0199 >", value, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A0199 >=", value, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199LessThan(BigDecimal value) {
            addCriterion("A0199 <", value, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199LessThanOrEqualTo(BigDecimal value) {
            addCriterion("A0199 <=", value, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199In(List<BigDecimal> values) {
            addCriterion("A0199 in", values, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199NotIn(List<BigDecimal> values) {
            addCriterion("A0199 not in", values, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("A0199 between", value1, value2, "a0199");
            return (Criteria) this;
        }

        public Criteria andA0199NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A0199 not between", value1, value2, "a0199");
            return (Criteria) this;
        }

        public Criteria andA019aIsNull() {
            addCriterion("A019A is null");
            return (Criteria) this;
        }

        public Criteria andA019aIsNotNull() {
            addCriterion("A019A is not null");
            return (Criteria) this;
        }

        public Criteria andA019aEqualTo(String value) {
            addCriterion("A019A =", value, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aNotEqualTo(String value) {
            addCriterion("A019A <>", value, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aGreaterThan(String value) {
            addCriterion("A019A >", value, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aGreaterThanOrEqualTo(String value) {
            addCriterion("A019A >=", value, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aLessThan(String value) {
            addCriterion("A019A <", value, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aLessThanOrEqualTo(String value) {
            addCriterion("A019A <=", value, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aLike(String value) {
            addCriterion("A019A like", value, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aNotLike(String value) {
            addCriterion("A019A not like", value, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aIn(List<String> values) {
            addCriterion("A019A in", values, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aNotIn(List<String> values) {
            addCriterion("A019A not in", values, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aBetween(String value1, String value2) {
            addCriterion("A019A between", value1, value2, "a019a");
            return (Criteria) this;
        }

        public Criteria andA019aNotBetween(String value1, String value2) {
            addCriterion("A019A not between", value1, value2, "a019a");
            return (Criteria) this;
        }

        public Criteria andA01a8IsNull() {
            addCriterion("A01A8 is null");
            return (Criteria) this;
        }

        public Criteria andA01a8IsNotNull() {
            addCriterion("A01A8 is not null");
            return (Criteria) this;
        }

        public Criteria andA01a8EqualTo(BigDecimal value) {
            addCriterion("A01A8 =", value, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8NotEqualTo(BigDecimal value) {
            addCriterion("A01A8 <>", value, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8GreaterThan(BigDecimal value) {
            addCriterion("A01A8 >", value, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01A8 >=", value, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8LessThan(BigDecimal value) {
            addCriterion("A01A8 <", value, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01A8 <=", value, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8In(List<BigDecimal> values) {
            addCriterion("A01A8 in", values, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8NotIn(List<BigDecimal> values) {
            addCriterion("A01A8 not in", values, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01A8 between", value1, value2, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01a8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01A8 not between", value1, value2, "a01a8");
            return (Criteria) this;
        }

        public Criteria andA01adIsNull() {
            addCriterion("A01AD is null");
            return (Criteria) this;
        }

        public Criteria andA01adIsNotNull() {
            addCriterion("A01AD is not null");
            return (Criteria) this;
        }

        public Criteria andA01adEqualTo(String value) {
            addCriterion("A01AD =", value, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adNotEqualTo(String value) {
            addCriterion("A01AD <>", value, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adGreaterThan(String value) {
            addCriterion("A01AD >", value, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adGreaterThanOrEqualTo(String value) {
            addCriterion("A01AD >=", value, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adLessThan(String value) {
            addCriterion("A01AD <", value, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adLessThanOrEqualTo(String value) {
            addCriterion("A01AD <=", value, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adLike(String value) {
            addCriterion("A01AD like", value, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adNotLike(String value) {
            addCriterion("A01AD not like", value, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adIn(List<String> values) {
            addCriterion("A01AD in", values, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adNotIn(List<String> values) {
            addCriterion("A01AD not in", values, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adBetween(String value1, String value2) {
            addCriterion("A01AD between", value1, value2, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01adNotBetween(String value1, String value2) {
            addCriterion("A01AD not between", value1, value2, "a01ad");
            return (Criteria) this;
        }

        public Criteria andA01afIsNull() {
            addCriterion("A01AF is null");
            return (Criteria) this;
        }

        public Criteria andA01afIsNotNull() {
            addCriterion("A01AF is not null");
            return (Criteria) this;
        }

        public Criteria andA01afEqualTo(String value) {
            addCriterion("A01AF =", value, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afNotEqualTo(String value) {
            addCriterion("A01AF <>", value, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afGreaterThan(String value) {
            addCriterion("A01AF >", value, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afGreaterThanOrEqualTo(String value) {
            addCriterion("A01AF >=", value, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afLessThan(String value) {
            addCriterion("A01AF <", value, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afLessThanOrEqualTo(String value) {
            addCriterion("A01AF <=", value, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afLike(String value) {
            addCriterion("A01AF like", value, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afNotLike(String value) {
            addCriterion("A01AF not like", value, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afIn(List<String> values) {
            addCriterion("A01AF in", values, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afNotIn(List<String> values) {
            addCriterion("A01AF not in", values, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afBetween(String value1, String value2) {
            addCriterion("A01AF between", value1, value2, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01afNotBetween(String value1, String value2) {
            addCriterion("A01AF not between", value1, value2, "a01af");
            return (Criteria) this;
        }

        public Criteria andA01ahIsNull() {
            addCriterion("A01AH is null");
            return (Criteria) this;
        }

        public Criteria andA01ahIsNotNull() {
            addCriterion("A01AH is not null");
            return (Criteria) this;
        }

        public Criteria andA01ahEqualTo(String value) {
            addCriterion("A01AH =", value, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahNotEqualTo(String value) {
            addCriterion("A01AH <>", value, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahGreaterThan(String value) {
            addCriterion("A01AH >", value, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahGreaterThanOrEqualTo(String value) {
            addCriterion("A01AH >=", value, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahLessThan(String value) {
            addCriterion("A01AH <", value, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahLessThanOrEqualTo(String value) {
            addCriterion("A01AH <=", value, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahLike(String value) {
            addCriterion("A01AH like", value, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahNotLike(String value) {
            addCriterion("A01AH not like", value, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahIn(List<String> values) {
            addCriterion("A01AH in", values, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahNotIn(List<String> values) {
            addCriterion("A01AH not in", values, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahBetween(String value1, String value2) {
            addCriterion("A01AH between", value1, value2, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01ahNotBetween(String value1, String value2) {
            addCriterion("A01AH not between", value1, value2, "a01ah");
            return (Criteria) this;
        }

        public Criteria andA01aoIsNull() {
            addCriterion("A01AO is null");
            return (Criteria) this;
        }

        public Criteria andA01aoIsNotNull() {
            addCriterion("A01AO is not null");
            return (Criteria) this;
        }

        public Criteria andA01aoEqualTo(Date value) {
            addCriterion("A01AO =", value, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoNotEqualTo(Date value) {
            addCriterion("A01AO <>", value, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoGreaterThan(Date value) {
            addCriterion("A01AO >", value, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoGreaterThanOrEqualTo(Date value) {
            addCriterion("A01AO >=", value, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoLessThan(Date value) {
            addCriterion("A01AO <", value, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoLessThanOrEqualTo(Date value) {
            addCriterion("A01AO <=", value, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoIn(List<Date> values) {
            addCriterion("A01AO in", values, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoNotIn(List<Date> values) {
            addCriterion("A01AO not in", values, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoBetween(Date value1, Date value2) {
            addCriterion("A01AO between", value1, value2, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01aoNotBetween(Date value1, Date value2) {
            addCriterion("A01AO not between", value1, value2, "a01ao");
            return (Criteria) this;
        }

        public Criteria andA01arIsNull() {
            addCriterion("A01AR is null");
            return (Criteria) this;
        }

        public Criteria andA01arIsNotNull() {
            addCriterion("A01AR is not null");
            return (Criteria) this;
        }

        public Criteria andA01arEqualTo(BigDecimal value) {
            addCriterion("A01AR =", value, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arNotEqualTo(BigDecimal value) {
            addCriterion("A01AR <>", value, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arGreaterThan(BigDecimal value) {
            addCriterion("A01AR >", value, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01AR >=", value, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arLessThan(BigDecimal value) {
            addCriterion("A01AR <", value, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01AR <=", value, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arIn(List<BigDecimal> values) {
            addCriterion("A01AR in", values, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arNotIn(List<BigDecimal> values) {
            addCriterion("A01AR not in", values, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01AR between", value1, value2, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01arNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01AR not between", value1, value2, "a01ar");
            return (Criteria) this;
        }

        public Criteria andA01asIsNull() {
            addCriterion("A01AS is null");
            return (Criteria) this;
        }

        public Criteria andA01asIsNotNull() {
            addCriterion("A01AS is not null");
            return (Criteria) this;
        }

        public Criteria andA01asEqualTo(BigDecimal value) {
            addCriterion("A01AS =", value, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asNotEqualTo(BigDecimal value) {
            addCriterion("A01AS <>", value, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asGreaterThan(BigDecimal value) {
            addCriterion("A01AS >", value, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01AS >=", value, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asLessThan(BigDecimal value) {
            addCriterion("A01AS <", value, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01AS <=", value, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asIn(List<BigDecimal> values) {
            addCriterion("A01AS in", values, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asNotIn(List<BigDecimal> values) {
            addCriterion("A01AS not in", values, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01AS between", value1, value2, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01asNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01AS not between", value1, value2, "a01as");
            return (Criteria) this;
        }

        public Criteria andA01atIsNull() {
            addCriterion("A01AT is null");
            return (Criteria) this;
        }

        public Criteria andA01atIsNotNull() {
            addCriterion("A01AT is not null");
            return (Criteria) this;
        }

        public Criteria andA01atEqualTo(Date value) {
            addCriterion("A01AT =", value, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atNotEqualTo(Date value) {
            addCriterion("A01AT <>", value, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atGreaterThan(Date value) {
            addCriterion("A01AT >", value, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atGreaterThanOrEqualTo(Date value) {
            addCriterion("A01AT >=", value, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atLessThan(Date value) {
            addCriterion("A01AT <", value, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atLessThanOrEqualTo(Date value) {
            addCriterion("A01AT <=", value, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atIn(List<Date> values) {
            addCriterion("A01AT in", values, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atNotIn(List<Date> values) {
            addCriterion("A01AT not in", values, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atBetween(Date value1, Date value2) {
            addCriterion("A01AT between", value1, value2, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01atNotBetween(Date value1, Date value2) {
            addCriterion("A01AT not between", value1, value2, "a01at");
            return (Criteria) this;
        }

        public Criteria andA01auIsNull() {
            addCriterion("A01AU is null");
            return (Criteria) this;
        }

        public Criteria andA01auIsNotNull() {
            addCriterion("A01AU is not null");
            return (Criteria) this;
        }

        public Criteria andA01auEqualTo(Date value) {
            addCriterion("A01AU =", value, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auNotEqualTo(Date value) {
            addCriterion("A01AU <>", value, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auGreaterThan(Date value) {
            addCriterion("A01AU >", value, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auGreaterThanOrEqualTo(Date value) {
            addCriterion("A01AU >=", value, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auLessThan(Date value) {
            addCriterion("A01AU <", value, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auLessThanOrEqualTo(Date value) {
            addCriterion("A01AU <=", value, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auIn(List<Date> values) {
            addCriterion("A01AU in", values, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auNotIn(List<Date> values) {
            addCriterion("A01AU not in", values, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auBetween(Date value1, Date value2) {
            addCriterion("A01AU between", value1, value2, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01auNotBetween(Date value1, Date value2) {
            addCriterion("A01AU not between", value1, value2, "a01au");
            return (Criteria) this;
        }

        public Criteria andA01axIsNull() {
            addCriterion("A01AX is null");
            return (Criteria) this;
        }

        public Criteria andA01axIsNotNull() {
            addCriterion("A01AX is not null");
            return (Criteria) this;
        }

        public Criteria andA01axEqualTo(String value) {
            addCriterion("A01AX =", value, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axNotEqualTo(String value) {
            addCriterion("A01AX <>", value, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axGreaterThan(String value) {
            addCriterion("A01AX >", value, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axGreaterThanOrEqualTo(String value) {
            addCriterion("A01AX >=", value, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axLessThan(String value) {
            addCriterion("A01AX <", value, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axLessThanOrEqualTo(String value) {
            addCriterion("A01AX <=", value, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axLike(String value) {
            addCriterion("A01AX like", value, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axNotLike(String value) {
            addCriterion("A01AX not like", value, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axIn(List<String> values) {
            addCriterion("A01AX in", values, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axNotIn(List<String> values) {
            addCriterion("A01AX not in", values, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axBetween(String value1, String value2) {
            addCriterion("A01AX between", value1, value2, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01axNotBetween(String value1, String value2) {
            addCriterion("A01AX not between", value1, value2, "a01ax");
            return (Criteria) this;
        }

        public Criteria andA01ayIsNull() {
            addCriterion("A01AY is null");
            return (Criteria) this;
        }

        public Criteria andA01ayIsNotNull() {
            addCriterion("A01AY is not null");
            return (Criteria) this;
        }

        public Criteria andA01ayEqualTo(String value) {
            addCriterion("A01AY =", value, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayNotEqualTo(String value) {
            addCriterion("A01AY <>", value, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayGreaterThan(String value) {
            addCriterion("A01AY >", value, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayGreaterThanOrEqualTo(String value) {
            addCriterion("A01AY >=", value, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayLessThan(String value) {
            addCriterion("A01AY <", value, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayLessThanOrEqualTo(String value) {
            addCriterion("A01AY <=", value, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayLike(String value) {
            addCriterion("A01AY like", value, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayNotLike(String value) {
            addCriterion("A01AY not like", value, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayIn(List<String> values) {
            addCriterion("A01AY in", values, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayNotIn(List<String> values) {
            addCriterion("A01AY not in", values, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayBetween(String value1, String value2) {
            addCriterion("A01AY between", value1, value2, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01ayNotBetween(String value1, String value2) {
            addCriterion("A01AY not between", value1, value2, "a01ay");
            return (Criteria) this;
        }

        public Criteria andA01b2IsNull() {
            addCriterion("A01B2 is null");
            return (Criteria) this;
        }

        public Criteria andA01b2IsNotNull() {
            addCriterion("A01B2 is not null");
            return (Criteria) this;
        }

        public Criteria andA01b2EqualTo(Date value) {
            addCriterion("A01B2 =", value, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2NotEqualTo(Date value) {
            addCriterion("A01B2 <>", value, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2GreaterThan(Date value) {
            addCriterion("A01B2 >", value, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2GreaterThanOrEqualTo(Date value) {
            addCriterion("A01B2 >=", value, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2LessThan(Date value) {
            addCriterion("A01B2 <", value, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2LessThanOrEqualTo(Date value) {
            addCriterion("A01B2 <=", value, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2In(List<Date> values) {
            addCriterion("A01B2 in", values, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2NotIn(List<Date> values) {
            addCriterion("A01B2 not in", values, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2Between(Date value1, Date value2) {
            addCriterion("A01B2 between", value1, value2, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b2NotBetween(Date value1, Date value2) {
            addCriterion("A01B2 not between", value1, value2, "a01b2");
            return (Criteria) this;
        }

        public Criteria andA01b6IsNull() {
            addCriterion("A01B6 is null");
            return (Criteria) this;
        }

        public Criteria andA01b6IsNotNull() {
            addCriterion("A01B6 is not null");
            return (Criteria) this;
        }

        public Criteria andA01b6EqualTo(String value) {
            addCriterion("A01B6 =", value, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6NotEqualTo(String value) {
            addCriterion("A01B6 <>", value, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6GreaterThan(String value) {
            addCriterion("A01B6 >", value, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6GreaterThanOrEqualTo(String value) {
            addCriterion("A01B6 >=", value, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6LessThan(String value) {
            addCriterion("A01B6 <", value, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6LessThanOrEqualTo(String value) {
            addCriterion("A01B6 <=", value, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6Like(String value) {
            addCriterion("A01B6 like", value, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6NotLike(String value) {
            addCriterion("A01B6 not like", value, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6In(List<String> values) {
            addCriterion("A01B6 in", values, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6NotIn(List<String> values) {
            addCriterion("A01B6 not in", values, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6Between(String value1, String value2) {
            addCriterion("A01B6 between", value1, value2, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b6NotBetween(String value1, String value2) {
            addCriterion("A01B6 not between", value1, value2, "a01b6");
            return (Criteria) this;
        }

        public Criteria andA01b8IsNull() {
            addCriterion("A01B8 is null");
            return (Criteria) this;
        }

        public Criteria andA01b8IsNotNull() {
            addCriterion("A01B8 is not null");
            return (Criteria) this;
        }

        public Criteria andA01b8EqualTo(String value) {
            addCriterion("A01B8 =", value, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8NotEqualTo(String value) {
            addCriterion("A01B8 <>", value, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8GreaterThan(String value) {
            addCriterion("A01B8 >", value, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8GreaterThanOrEqualTo(String value) {
            addCriterion("A01B8 >=", value, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8LessThan(String value) {
            addCriterion("A01B8 <", value, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8LessThanOrEqualTo(String value) {
            addCriterion("A01B8 <=", value, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8Like(String value) {
            addCriterion("A01B8 like", value, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8NotLike(String value) {
            addCriterion("A01B8 not like", value, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8In(List<String> values) {
            addCriterion("A01B8 in", values, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8NotIn(List<String> values) {
            addCriterion("A01B8 not in", values, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8Between(String value1, String value2) {
            addCriterion("A01B8 between", value1, value2, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b8NotBetween(String value1, String value2) {
            addCriterion("A01B8 not between", value1, value2, "a01b8");
            return (Criteria) this;
        }

        public Criteria andA01b9IsNull() {
            addCriterion("A01B9 is null");
            return (Criteria) this;
        }

        public Criteria andA01b9IsNotNull() {
            addCriterion("A01B9 is not null");
            return (Criteria) this;
        }

        public Criteria andA01b9EqualTo(Date value) {
            addCriterion("A01B9 =", value, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9NotEqualTo(Date value) {
            addCriterion("A01B9 <>", value, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9GreaterThan(Date value) {
            addCriterion("A01B9 >", value, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9GreaterThanOrEqualTo(Date value) {
            addCriterion("A01B9 >=", value, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9LessThan(Date value) {
            addCriterion("A01B9 <", value, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9LessThanOrEqualTo(Date value) {
            addCriterion("A01B9 <=", value, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9In(List<Date> values) {
            addCriterion("A01B9 in", values, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9NotIn(List<Date> values) {
            addCriterion("A01B9 not in", values, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9Between(Date value1, Date value2) {
            addCriterion("A01B9 between", value1, value2, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01b9NotBetween(Date value1, Date value2) {
            addCriterion("A01B9 not between", value1, value2, "a01b9");
            return (Criteria) this;
        }

        public Criteria andA01baIsNull() {
            addCriterion("A01BA is null");
            return (Criteria) this;
        }

        public Criteria andA01baIsNotNull() {
            addCriterion("A01BA is not null");
            return (Criteria) this;
        }

        public Criteria andA01baEqualTo(Date value) {
            addCriterion("A01BA =", value, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baNotEqualTo(Date value) {
            addCriterion("A01BA <>", value, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baGreaterThan(Date value) {
            addCriterion("A01BA >", value, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baGreaterThanOrEqualTo(Date value) {
            addCriterion("A01BA >=", value, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baLessThan(Date value) {
            addCriterion("A01BA <", value, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baLessThanOrEqualTo(Date value) {
            addCriterion("A01BA <=", value, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baIn(List<Date> values) {
            addCriterion("A01BA in", values, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baNotIn(List<Date> values) {
            addCriterion("A01BA not in", values, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baBetween(Date value1, Date value2) {
            addCriterion("A01BA between", value1, value2, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01baNotBetween(Date value1, Date value2) {
            addCriterion("A01BA not between", value1, value2, "a01ba");
            return (Criteria) this;
        }

        public Criteria andA01bbIsNull() {
            addCriterion("A01BB is null");
            return (Criteria) this;
        }

        public Criteria andA01bbIsNotNull() {
            addCriterion("A01BB is not null");
            return (Criteria) this;
        }

        public Criteria andA01bbEqualTo(BigDecimal value) {
            addCriterion("A01BB =", value, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbNotEqualTo(BigDecimal value) {
            addCriterion("A01BB <>", value, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbGreaterThan(BigDecimal value) {
            addCriterion("A01BB >", value, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01BB >=", value, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbLessThan(BigDecimal value) {
            addCriterion("A01BB <", value, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01BB <=", value, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbIn(List<BigDecimal> values) {
            addCriterion("A01BB in", values, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbNotIn(List<BigDecimal> values) {
            addCriterion("A01BB not in", values, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01BB between", value1, value2, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bbNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01BB not between", value1, value2, "a01bb");
            return (Criteria) this;
        }

        public Criteria andA01bcIsNull() {
            addCriterion("A01BC is null");
            return (Criteria) this;
        }

        public Criteria andA01bcIsNotNull() {
            addCriterion("A01BC is not null");
            return (Criteria) this;
        }

        public Criteria andA01bcEqualTo(String value) {
            addCriterion("A01BC =", value, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcNotEqualTo(String value) {
            addCriterion("A01BC <>", value, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcGreaterThan(String value) {
            addCriterion("A01BC >", value, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcGreaterThanOrEqualTo(String value) {
            addCriterion("A01BC >=", value, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcLessThan(String value) {
            addCriterion("A01BC <", value, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcLessThanOrEqualTo(String value) {
            addCriterion("A01BC <=", value, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcLike(String value) {
            addCriterion("A01BC like", value, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcNotLike(String value) {
            addCriterion("A01BC not like", value, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcIn(List<String> values) {
            addCriterion("A01BC in", values, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcNotIn(List<String> values) {
            addCriterion("A01BC not in", values, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcBetween(String value1, String value2) {
            addCriterion("A01BC between", value1, value2, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bcNotBetween(String value1, String value2) {
            addCriterion("A01BC not between", value1, value2, "a01bc");
            return (Criteria) this;
        }

        public Criteria andA01bdIsNull() {
            addCriterion("A01BD is null");
            return (Criteria) this;
        }

        public Criteria andA01bdIsNotNull() {
            addCriterion("A01BD is not null");
            return (Criteria) this;
        }

        public Criteria andA01bdEqualTo(String value) {
            addCriterion("A01BD =", value, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdNotEqualTo(String value) {
            addCriterion("A01BD <>", value, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdGreaterThan(String value) {
            addCriterion("A01BD >", value, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdGreaterThanOrEqualTo(String value) {
            addCriterion("A01BD >=", value, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdLessThan(String value) {
            addCriterion("A01BD <", value, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdLessThanOrEqualTo(String value) {
            addCriterion("A01BD <=", value, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdLike(String value) {
            addCriterion("A01BD like", value, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdNotLike(String value) {
            addCriterion("A01BD not like", value, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdIn(List<String> values) {
            addCriterion("A01BD in", values, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdNotIn(List<String> values) {
            addCriterion("A01BD not in", values, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdBetween(String value1, String value2) {
            addCriterion("A01BD between", value1, value2, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01bdNotBetween(String value1, String value2) {
            addCriterion("A01BD not between", value1, value2, "a01bd");
            return (Criteria) this;
        }

        public Criteria andA01beIsNull() {
            addCriterion("A01BE is null");
            return (Criteria) this;
        }

        public Criteria andA01beIsNotNull() {
            addCriterion("A01BE is not null");
            return (Criteria) this;
        }

        public Criteria andA01beEqualTo(String value) {
            addCriterion("A01BE =", value, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beNotEqualTo(String value) {
            addCriterion("A01BE <>", value, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beGreaterThan(String value) {
            addCriterion("A01BE >", value, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beGreaterThanOrEqualTo(String value) {
            addCriterion("A01BE >=", value, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beLessThan(String value) {
            addCriterion("A01BE <", value, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beLessThanOrEqualTo(String value) {
            addCriterion("A01BE <=", value, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beLike(String value) {
            addCriterion("A01BE like", value, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beNotLike(String value) {
            addCriterion("A01BE not like", value, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beIn(List<String> values) {
            addCriterion("A01BE in", values, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beNotIn(List<String> values) {
            addCriterion("A01BE not in", values, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beBetween(String value1, String value2) {
            addCriterion("A01BE between", value1, value2, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01beNotBetween(String value1, String value2) {
            addCriterion("A01BE not between", value1, value2, "a01be");
            return (Criteria) this;
        }

        public Criteria andA01bfIsNull() {
            addCriterion("A01BF is null");
            return (Criteria) this;
        }

        public Criteria andA01bfIsNotNull() {
            addCriterion("A01BF is not null");
            return (Criteria) this;
        }

        public Criteria andA01bfEqualTo(String value) {
            addCriterion("A01BF =", value, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfNotEqualTo(String value) {
            addCriterion("A01BF <>", value, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfGreaterThan(String value) {
            addCriterion("A01BF >", value, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfGreaterThanOrEqualTo(String value) {
            addCriterion("A01BF >=", value, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfLessThan(String value) {
            addCriterion("A01BF <", value, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfLessThanOrEqualTo(String value) {
            addCriterion("A01BF <=", value, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfLike(String value) {
            addCriterion("A01BF like", value, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfNotLike(String value) {
            addCriterion("A01BF not like", value, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfIn(List<String> values) {
            addCriterion("A01BF in", values, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfNotIn(List<String> values) {
            addCriterion("A01BF not in", values, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfBetween(String value1, String value2) {
            addCriterion("A01BF between", value1, value2, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bfNotBetween(String value1, String value2) {
            addCriterion("A01BF not between", value1, value2, "a01bf");
            return (Criteria) this;
        }

        public Criteria andA01bgIsNull() {
            addCriterion("A01BG is null");
            return (Criteria) this;
        }

        public Criteria andA01bgIsNotNull() {
            addCriterion("A01BG is not null");
            return (Criteria) this;
        }

        public Criteria andA01bgEqualTo(String value) {
            addCriterion("A01BG =", value, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgNotEqualTo(String value) {
            addCriterion("A01BG <>", value, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgGreaterThan(String value) {
            addCriterion("A01BG >", value, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgGreaterThanOrEqualTo(String value) {
            addCriterion("A01BG >=", value, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgLessThan(String value) {
            addCriterion("A01BG <", value, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgLessThanOrEqualTo(String value) {
            addCriterion("A01BG <=", value, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgLike(String value) {
            addCriterion("A01BG like", value, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgNotLike(String value) {
            addCriterion("A01BG not like", value, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgIn(List<String> values) {
            addCriterion("A01BG in", values, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgNotIn(List<String> values) {
            addCriterion("A01BG not in", values, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgBetween(String value1, String value2) {
            addCriterion("A01BG between", value1, value2, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bgNotBetween(String value1, String value2) {
            addCriterion("A01BG not between", value1, value2, "a01bg");
            return (Criteria) this;
        }

        public Criteria andA01bhIsNull() {
            addCriterion("A01BH is null");
            return (Criteria) this;
        }

        public Criteria andA01bhIsNotNull() {
            addCriterion("A01BH is not null");
            return (Criteria) this;
        }

        public Criteria andA01bhEqualTo(BigDecimal value) {
            addCriterion("A01BH =", value, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhNotEqualTo(BigDecimal value) {
            addCriterion("A01BH <>", value, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhGreaterThan(BigDecimal value) {
            addCriterion("A01BH >", value, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01BH >=", value, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhLessThan(BigDecimal value) {
            addCriterion("A01BH <", value, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01BH <=", value, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhIn(List<BigDecimal> values) {
            addCriterion("A01BH in", values, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhNotIn(List<BigDecimal> values) {
            addCriterion("A01BH not in", values, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01BH between", value1, value2, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01bhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01BH not between", value1, value2, "a01bh");
            return (Criteria) this;
        }

        public Criteria andA01biIsNull() {
            addCriterion("A01BI is null");
            return (Criteria) this;
        }

        public Criteria andA01biIsNotNull() {
            addCriterion("A01BI is not null");
            return (Criteria) this;
        }

        public Criteria andA01biEqualTo(String value) {
            addCriterion("A01BI =", value, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biNotEqualTo(String value) {
            addCriterion("A01BI <>", value, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biGreaterThan(String value) {
            addCriterion("A01BI >", value, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biGreaterThanOrEqualTo(String value) {
            addCriterion("A01BI >=", value, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biLessThan(String value) {
            addCriterion("A01BI <", value, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biLessThanOrEqualTo(String value) {
            addCriterion("A01BI <=", value, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biLike(String value) {
            addCriterion("A01BI like", value, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biNotLike(String value) {
            addCriterion("A01BI not like", value, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biIn(List<String> values) {
            addCriterion("A01BI in", values, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biNotIn(List<String> values) {
            addCriterion("A01BI not in", values, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biBetween(String value1, String value2) {
            addCriterion("A01BI between", value1, value2, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01biNotBetween(String value1, String value2) {
            addCriterion("A01BI not between", value1, value2, "a01bi");
            return (Criteria) this;
        }

        public Criteria andA01bjIsNull() {
            addCriterion("A01BJ is null");
            return (Criteria) this;
        }

        public Criteria andA01bjIsNotNull() {
            addCriterion("A01BJ is not null");
            return (Criteria) this;
        }

        public Criteria andA01bjEqualTo(String value) {
            addCriterion("A01BJ =", value, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjNotEqualTo(String value) {
            addCriterion("A01BJ <>", value, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjGreaterThan(String value) {
            addCriterion("A01BJ >", value, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjGreaterThanOrEqualTo(String value) {
            addCriterion("A01BJ >=", value, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjLessThan(String value) {
            addCriterion("A01BJ <", value, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjLessThanOrEqualTo(String value) {
            addCriterion("A01BJ <=", value, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjLike(String value) {
            addCriterion("A01BJ like", value, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjNotLike(String value) {
            addCriterion("A01BJ not like", value, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjIn(List<String> values) {
            addCriterion("A01BJ in", values, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjNotIn(List<String> values) {
            addCriterion("A01BJ not in", values, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjBetween(String value1, String value2) {
            addCriterion("A01BJ between", value1, value2, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bjNotBetween(String value1, String value2) {
            addCriterion("A01BJ not between", value1, value2, "a01bj");
            return (Criteria) this;
        }

        public Criteria andA01bkIsNull() {
            addCriterion("A01BK is null");
            return (Criteria) this;
        }

        public Criteria andA01bkIsNotNull() {
            addCriterion("A01BK is not null");
            return (Criteria) this;
        }

        public Criteria andA01bkEqualTo(String value) {
            addCriterion("A01BK =", value, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkNotEqualTo(String value) {
            addCriterion("A01BK <>", value, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkGreaterThan(String value) {
            addCriterion("A01BK >", value, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkGreaterThanOrEqualTo(String value) {
            addCriterion("A01BK >=", value, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkLessThan(String value) {
            addCriterion("A01BK <", value, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkLessThanOrEqualTo(String value) {
            addCriterion("A01BK <=", value, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkLike(String value) {
            addCriterion("A01BK like", value, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkNotLike(String value) {
            addCriterion("A01BK not like", value, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkIn(List<String> values) {
            addCriterion("A01BK in", values, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkNotIn(List<String> values) {
            addCriterion("A01BK not in", values, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkBetween(String value1, String value2) {
            addCriterion("A01BK between", value1, value2, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bkNotBetween(String value1, String value2) {
            addCriterion("A01BK not between", value1, value2, "a01bk");
            return (Criteria) this;
        }

        public Criteria andA01bmIsNull() {
            addCriterion("A01BM is null");
            return (Criteria) this;
        }

        public Criteria andA01bmIsNotNull() {
            addCriterion("A01BM is not null");
            return (Criteria) this;
        }

        public Criteria andA01bmEqualTo(String value) {
            addCriterion("A01BM =", value, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmNotEqualTo(String value) {
            addCriterion("A01BM <>", value, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmGreaterThan(String value) {
            addCriterion("A01BM >", value, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmGreaterThanOrEqualTo(String value) {
            addCriterion("A01BM >=", value, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmLessThan(String value) {
            addCriterion("A01BM <", value, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmLessThanOrEqualTo(String value) {
            addCriterion("A01BM <=", value, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmLike(String value) {
            addCriterion("A01BM like", value, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmNotLike(String value) {
            addCriterion("A01BM not like", value, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmIn(List<String> values) {
            addCriterion("A01BM in", values, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmNotIn(List<String> values) {
            addCriterion("A01BM not in", values, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmBetween(String value1, String value2) {
            addCriterion("A01BM between", value1, value2, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01bmNotBetween(String value1, String value2) {
            addCriterion("A01BM not between", value1, value2, "a01bm");
            return (Criteria) this;
        }

        public Criteria andA01boIsNull() {
            addCriterion("A01BO is null");
            return (Criteria) this;
        }

        public Criteria andA01boIsNotNull() {
            addCriterion("A01BO is not null");
            return (Criteria) this;
        }

        public Criteria andA01boEqualTo(String value) {
            addCriterion("A01BO =", value, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boNotEqualTo(String value) {
            addCriterion("A01BO <>", value, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boGreaterThan(String value) {
            addCriterion("A01BO >", value, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boGreaterThanOrEqualTo(String value) {
            addCriterion("A01BO >=", value, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boLessThan(String value) {
            addCriterion("A01BO <", value, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boLessThanOrEqualTo(String value) {
            addCriterion("A01BO <=", value, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boLike(String value) {
            addCriterion("A01BO like", value, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boNotLike(String value) {
            addCriterion("A01BO not like", value, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boIn(List<String> values) {
            addCriterion("A01BO in", values, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boNotIn(List<String> values) {
            addCriterion("A01BO not in", values, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boBetween(String value1, String value2) {
            addCriterion("A01BO between", value1, value2, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01boNotBetween(String value1, String value2) {
            addCriterion("A01BO not between", value1, value2, "a01bo");
            return (Criteria) this;
        }

        public Criteria andA01bqIsNull() {
            addCriterion("A01BQ is null");
            return (Criteria) this;
        }

        public Criteria andA01bqIsNotNull() {
            addCriterion("A01BQ is not null");
            return (Criteria) this;
        }

        public Criteria andA01bqEqualTo(Date value) {
            addCriterion("A01BQ =", value, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqNotEqualTo(Date value) {
            addCriterion("A01BQ <>", value, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqGreaterThan(Date value) {
            addCriterion("A01BQ >", value, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqGreaterThanOrEqualTo(Date value) {
            addCriterion("A01BQ >=", value, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqLessThan(Date value) {
            addCriterion("A01BQ <", value, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqLessThanOrEqualTo(Date value) {
            addCriterion("A01BQ <=", value, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqIn(List<Date> values) {
            addCriterion("A01BQ in", values, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqNotIn(List<Date> values) {
            addCriterion("A01BQ not in", values, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqBetween(Date value1, Date value2) {
            addCriterion("A01BQ between", value1, value2, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01bqNotBetween(Date value1, Date value2) {
            addCriterion("A01BQ not between", value1, value2, "a01bq");
            return (Criteria) this;
        }

        public Criteria andA01brIsNull() {
            addCriterion("A01BR is null");
            return (Criteria) this;
        }

        public Criteria andA01brIsNotNull() {
            addCriterion("A01BR is not null");
            return (Criteria) this;
        }

        public Criteria andA01brEqualTo(String value) {
            addCriterion("A01BR =", value, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brNotEqualTo(String value) {
            addCriterion("A01BR <>", value, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brGreaterThan(String value) {
            addCriterion("A01BR >", value, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brGreaterThanOrEqualTo(String value) {
            addCriterion("A01BR >=", value, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brLessThan(String value) {
            addCriterion("A01BR <", value, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brLessThanOrEqualTo(String value) {
            addCriterion("A01BR <=", value, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brLike(String value) {
            addCriterion("A01BR like", value, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brNotLike(String value) {
            addCriterion("A01BR not like", value, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brIn(List<String> values) {
            addCriterion("A01BR in", values, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brNotIn(List<String> values) {
            addCriterion("A01BR not in", values, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brBetween(String value1, String value2) {
            addCriterion("A01BR between", value1, value2, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01brNotBetween(String value1, String value2) {
            addCriterion("A01BR not between", value1, value2, "a01br");
            return (Criteria) this;
        }

        public Criteria andA01btIsNull() {
            addCriterion("A01BT is null");
            return (Criteria) this;
        }

        public Criteria andA01btIsNotNull() {
            addCriterion("A01BT is not null");
            return (Criteria) this;
        }

        public Criteria andA01btEqualTo(String value) {
            addCriterion("A01BT =", value, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btNotEqualTo(String value) {
            addCriterion("A01BT <>", value, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btGreaterThan(String value) {
            addCriterion("A01BT >", value, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btGreaterThanOrEqualTo(String value) {
            addCriterion("A01BT >=", value, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btLessThan(String value) {
            addCriterion("A01BT <", value, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btLessThanOrEqualTo(String value) {
            addCriterion("A01BT <=", value, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btLike(String value) {
            addCriterion("A01BT like", value, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btNotLike(String value) {
            addCriterion("A01BT not like", value, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btIn(List<String> values) {
            addCriterion("A01BT in", values, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btNotIn(List<String> values) {
            addCriterion("A01BT not in", values, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btBetween(String value1, String value2) {
            addCriterion("A01BT between", value1, value2, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01btNotBetween(String value1, String value2) {
            addCriterion("A01BT not between", value1, value2, "a01bt");
            return (Criteria) this;
        }

        public Criteria andA01buIsNull() {
            addCriterion("A01BU is null");
            return (Criteria) this;
        }

        public Criteria andA01buIsNotNull() {
            addCriterion("A01BU is not null");
            return (Criteria) this;
        }

        public Criteria andA01buEqualTo(String value) {
            addCriterion("A01BU =", value, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buNotEqualTo(String value) {
            addCriterion("A01BU <>", value, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buGreaterThan(String value) {
            addCriterion("A01BU >", value, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buGreaterThanOrEqualTo(String value) {
            addCriterion("A01BU >=", value, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buLessThan(String value) {
            addCriterion("A01BU <", value, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buLessThanOrEqualTo(String value) {
            addCriterion("A01BU <=", value, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buLike(String value) {
            addCriterion("A01BU like", value, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buNotLike(String value) {
            addCriterion("A01BU not like", value, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buIn(List<String> values) {
            addCriterion("A01BU in", values, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buNotIn(List<String> values) {
            addCriterion("A01BU not in", values, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buBetween(String value1, String value2) {
            addCriterion("A01BU between", value1, value2, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01buNotBetween(String value1, String value2) {
            addCriterion("A01BU not between", value1, value2, "a01bu");
            return (Criteria) this;
        }

        public Criteria andA01bvIsNull() {
            addCriterion("A01BV is null");
            return (Criteria) this;
        }

        public Criteria andA01bvIsNotNull() {
            addCriterion("A01BV is not null");
            return (Criteria) this;
        }

        public Criteria andA01bvEqualTo(BigDecimal value) {
            addCriterion("A01BV =", value, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvNotEqualTo(BigDecimal value) {
            addCriterion("A01BV <>", value, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvGreaterThan(BigDecimal value) {
            addCriterion("A01BV >", value, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01BV >=", value, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvLessThan(BigDecimal value) {
            addCriterion("A01BV <", value, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01BV <=", value, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvIn(List<BigDecimal> values) {
            addCriterion("A01BV in", values, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvNotIn(List<BigDecimal> values) {
            addCriterion("A01BV not in", values, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01BV between", value1, value2, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01BV not between", value1, value2, "a01bv");
            return (Criteria) this;
        }

        public Criteria andA01bxIsNull() {
            addCriterion("A01BX is null");
            return (Criteria) this;
        }

        public Criteria andA01bxIsNotNull() {
            addCriterion("A01BX is not null");
            return (Criteria) this;
        }

        public Criteria andA01bxEqualTo(String value) {
            addCriterion("A01BX =", value, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxNotEqualTo(String value) {
            addCriterion("A01BX <>", value, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxGreaterThan(String value) {
            addCriterion("A01BX >", value, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxGreaterThanOrEqualTo(String value) {
            addCriterion("A01BX >=", value, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxLessThan(String value) {
            addCriterion("A01BX <", value, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxLessThanOrEqualTo(String value) {
            addCriterion("A01BX <=", value, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxLike(String value) {
            addCriterion("A01BX like", value, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxNotLike(String value) {
            addCriterion("A01BX not like", value, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxIn(List<String> values) {
            addCriterion("A01BX in", values, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxNotIn(List<String> values) {
            addCriterion("A01BX not in", values, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxBetween(String value1, String value2) {
            addCriterion("A01BX between", value1, value2, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bxNotBetween(String value1, String value2) {
            addCriterion("A01BX not between", value1, value2, "a01bx");
            return (Criteria) this;
        }

        public Criteria andA01bzIsNull() {
            addCriterion("A01BZ is null");
            return (Criteria) this;
        }

        public Criteria andA01bzIsNotNull() {
            addCriterion("A01BZ is not null");
            return (Criteria) this;
        }

        public Criteria andA01bzEqualTo(String value) {
            addCriterion("A01BZ =", value, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzNotEqualTo(String value) {
            addCriterion("A01BZ <>", value, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzGreaterThan(String value) {
            addCriterion("A01BZ >", value, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzGreaterThanOrEqualTo(String value) {
            addCriterion("A01BZ >=", value, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzLessThan(String value) {
            addCriterion("A01BZ <", value, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzLessThanOrEqualTo(String value) {
            addCriterion("A01BZ <=", value, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzLike(String value) {
            addCriterion("A01BZ like", value, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzNotLike(String value) {
            addCriterion("A01BZ not like", value, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzIn(List<String> values) {
            addCriterion("A01BZ in", values, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzNotIn(List<String> values) {
            addCriterion("A01BZ not in", values, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzBetween(String value1, String value2) {
            addCriterion("A01BZ between", value1, value2, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01bzNotBetween(String value1, String value2) {
            addCriterion("A01BZ not between", value1, value2, "a01bz");
            return (Criteria) this;
        }

        public Criteria andA01c0IsNull() {
            addCriterion("A01C0 is null");
            return (Criteria) this;
        }

        public Criteria andA01c0IsNotNull() {
            addCriterion("A01C0 is not null");
            return (Criteria) this;
        }

        public Criteria andA01c0EqualTo(String value) {
            addCriterion("A01C0 =", value, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0NotEqualTo(String value) {
            addCriterion("A01C0 <>", value, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0GreaterThan(String value) {
            addCriterion("A01C0 >", value, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0GreaterThanOrEqualTo(String value) {
            addCriterion("A01C0 >=", value, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0LessThan(String value) {
            addCriterion("A01C0 <", value, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0LessThanOrEqualTo(String value) {
            addCriterion("A01C0 <=", value, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0Like(String value) {
            addCriterion("A01C0 like", value, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0NotLike(String value) {
            addCriterion("A01C0 not like", value, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0In(List<String> values) {
            addCriterion("A01C0 in", values, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0NotIn(List<String> values) {
            addCriterion("A01C0 not in", values, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0Between(String value1, String value2) {
            addCriterion("A01C0 between", value1, value2, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c0NotBetween(String value1, String value2) {
            addCriterion("A01C0 not between", value1, value2, "a01c0");
            return (Criteria) this;
        }

        public Criteria andA01c3IsNull() {
            addCriterion("A01C3 is null");
            return (Criteria) this;
        }

        public Criteria andA01c3IsNotNull() {
            addCriterion("A01C3 is not null");
            return (Criteria) this;
        }

        public Criteria andA01c3EqualTo(String value) {
            addCriterion("A01C3 =", value, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3NotEqualTo(String value) {
            addCriterion("A01C3 <>", value, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3GreaterThan(String value) {
            addCriterion("A01C3 >", value, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3GreaterThanOrEqualTo(String value) {
            addCriterion("A01C3 >=", value, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3LessThan(String value) {
            addCriterion("A01C3 <", value, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3LessThanOrEqualTo(String value) {
            addCriterion("A01C3 <=", value, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3Like(String value) {
            addCriterion("A01C3 like", value, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3NotLike(String value) {
            addCriterion("A01C3 not like", value, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3In(List<String> values) {
            addCriterion("A01C3 in", values, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3NotIn(List<String> values) {
            addCriterion("A01C3 not in", values, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3Between(String value1, String value2) {
            addCriterion("A01C3 between", value1, value2, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c3NotBetween(String value1, String value2) {
            addCriterion("A01C3 not between", value1, value2, "a01c3");
            return (Criteria) this;
        }

        public Criteria andA01c4IsNull() {
            addCriterion("A01C4 is null");
            return (Criteria) this;
        }

        public Criteria andA01c4IsNotNull() {
            addCriterion("A01C4 is not null");
            return (Criteria) this;
        }

        public Criteria andA01c4EqualTo(BigDecimal value) {
            addCriterion("A01C4 =", value, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4NotEqualTo(BigDecimal value) {
            addCriterion("A01C4 <>", value, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4GreaterThan(BigDecimal value) {
            addCriterion("A01C4 >", value, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01C4 >=", value, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4LessThan(BigDecimal value) {
            addCriterion("A01C4 <", value, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01C4 <=", value, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4In(List<BigDecimal> values) {
            addCriterion("A01C4 in", values, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4NotIn(List<BigDecimal> values) {
            addCriterion("A01C4 not in", values, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01C4 between", value1, value2, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01C4 not between", value1, value2, "a01c4");
            return (Criteria) this;
        }

        public Criteria andA01c5IsNull() {
            addCriterion("A01C5 is null");
            return (Criteria) this;
        }

        public Criteria andA01c5IsNotNull() {
            addCriterion("A01C5 is not null");
            return (Criteria) this;
        }

        public Criteria andA01c5EqualTo(String value) {
            addCriterion("A01C5 =", value, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5NotEqualTo(String value) {
            addCriterion("A01C5 <>", value, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5GreaterThan(String value) {
            addCriterion("A01C5 >", value, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5GreaterThanOrEqualTo(String value) {
            addCriterion("A01C5 >=", value, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5LessThan(String value) {
            addCriterion("A01C5 <", value, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5LessThanOrEqualTo(String value) {
            addCriterion("A01C5 <=", value, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5Like(String value) {
            addCriterion("A01C5 like", value, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5NotLike(String value) {
            addCriterion("A01C5 not like", value, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5In(List<String> values) {
            addCriterion("A01C5 in", values, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5NotIn(List<String> values) {
            addCriterion("A01C5 not in", values, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5Between(String value1, String value2) {
            addCriterion("A01C5 between", value1, value2, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c5NotBetween(String value1, String value2) {
            addCriterion("A01C5 not between", value1, value2, "a01c5");
            return (Criteria) this;
        }

        public Criteria andA01c7IsNull() {
            addCriterion("A01C7 is null");
            return (Criteria) this;
        }

        public Criteria andA01c7IsNotNull() {
            addCriterion("A01C7 is not null");
            return (Criteria) this;
        }

        public Criteria andA01c7EqualTo(String value) {
            addCriterion("A01C7 =", value, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7NotEqualTo(String value) {
            addCriterion("A01C7 <>", value, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7GreaterThan(String value) {
            addCriterion("A01C7 >", value, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7GreaterThanOrEqualTo(String value) {
            addCriterion("A01C7 >=", value, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7LessThan(String value) {
            addCriterion("A01C7 <", value, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7LessThanOrEqualTo(String value) {
            addCriterion("A01C7 <=", value, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7Like(String value) {
            addCriterion("A01C7 like", value, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7NotLike(String value) {
            addCriterion("A01C7 not like", value, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7In(List<String> values) {
            addCriterion("A01C7 in", values, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7NotIn(List<String> values) {
            addCriterion("A01C7 not in", values, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7Between(String value1, String value2) {
            addCriterion("A01C7 between", value1, value2, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01c7NotBetween(String value1, String value2) {
            addCriterion("A01C7 not between", value1, value2, "a01c7");
            return (Criteria) this;
        }

        public Criteria andA01cdIsNull() {
            addCriterion("A01CD is null");
            return (Criteria) this;
        }

        public Criteria andA01cdIsNotNull() {
            addCriterion("A01CD is not null");
            return (Criteria) this;
        }

        public Criteria andA01cdEqualTo(String value) {
            addCriterion("A01CD =", value, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdNotEqualTo(String value) {
            addCriterion("A01CD <>", value, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdGreaterThan(String value) {
            addCriterion("A01CD >", value, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdGreaterThanOrEqualTo(String value) {
            addCriterion("A01CD >=", value, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdLessThan(String value) {
            addCriterion("A01CD <", value, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdLessThanOrEqualTo(String value) {
            addCriterion("A01CD <=", value, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdLike(String value) {
            addCriterion("A01CD like", value, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdNotLike(String value) {
            addCriterion("A01CD not like", value, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdIn(List<String> values) {
            addCriterion("A01CD in", values, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdNotIn(List<String> values) {
            addCriterion("A01CD not in", values, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdBetween(String value1, String value2) {
            addCriterion("A01CD between", value1, value2, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01cdNotBetween(String value1, String value2) {
            addCriterion("A01CD not between", value1, value2, "a01cd");
            return (Criteria) this;
        }

        public Criteria andA01ceIsNull() {
            addCriterion("A01CE is null");
            return (Criteria) this;
        }

        public Criteria andA01ceIsNotNull() {
            addCriterion("A01CE is not null");
            return (Criteria) this;
        }

        public Criteria andA01ceEqualTo(Date value) {
            addCriterion("A01CE =", value, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceNotEqualTo(Date value) {
            addCriterion("A01CE <>", value, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceGreaterThan(Date value) {
            addCriterion("A01CE >", value, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceGreaterThanOrEqualTo(Date value) {
            addCriterion("A01CE >=", value, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceLessThan(Date value) {
            addCriterion("A01CE <", value, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceLessThanOrEqualTo(Date value) {
            addCriterion("A01CE <=", value, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceIn(List<Date> values) {
            addCriterion("A01CE in", values, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceNotIn(List<Date> values) {
            addCriterion("A01CE not in", values, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceBetween(Date value1, Date value2) {
            addCriterion("A01CE between", value1, value2, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01ceNotBetween(Date value1, Date value2) {
            addCriterion("A01CE not between", value1, value2, "a01ce");
            return (Criteria) this;
        }

        public Criteria andA01cfIsNull() {
            addCriterion("A01CF is null");
            return (Criteria) this;
        }

        public Criteria andA01cfIsNotNull() {
            addCriterion("A01CF is not null");
            return (Criteria) this;
        }

        public Criteria andA01cfEqualTo(String value) {
            addCriterion("A01CF =", value, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfNotEqualTo(String value) {
            addCriterion("A01CF <>", value, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfGreaterThan(String value) {
            addCriterion("A01CF >", value, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfGreaterThanOrEqualTo(String value) {
            addCriterion("A01CF >=", value, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfLessThan(String value) {
            addCriterion("A01CF <", value, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfLessThanOrEqualTo(String value) {
            addCriterion("A01CF <=", value, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfLike(String value) {
            addCriterion("A01CF like", value, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfNotLike(String value) {
            addCriterion("A01CF not like", value, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfIn(List<String> values) {
            addCriterion("A01CF in", values, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfNotIn(List<String> values) {
            addCriterion("A01CF not in", values, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfBetween(String value1, String value2) {
            addCriterion("A01CF between", value1, value2, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cfNotBetween(String value1, String value2) {
            addCriterion("A01CF not between", value1, value2, "a01cf");
            return (Criteria) this;
        }

        public Criteria andA01cgIsNull() {
            addCriterion("A01CG is null");
            return (Criteria) this;
        }

        public Criteria andA01cgIsNotNull() {
            addCriterion("A01CG is not null");
            return (Criteria) this;
        }

        public Criteria andA01cgEqualTo(String value) {
            addCriterion("A01CG =", value, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgNotEqualTo(String value) {
            addCriterion("A01CG <>", value, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgGreaterThan(String value) {
            addCriterion("A01CG >", value, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgGreaterThanOrEqualTo(String value) {
            addCriterion("A01CG >=", value, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgLessThan(String value) {
            addCriterion("A01CG <", value, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgLessThanOrEqualTo(String value) {
            addCriterion("A01CG <=", value, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgLike(String value) {
            addCriterion("A01CG like", value, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgNotLike(String value) {
            addCriterion("A01CG not like", value, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgIn(List<String> values) {
            addCriterion("A01CG in", values, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgNotIn(List<String> values) {
            addCriterion("A01CG not in", values, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgBetween(String value1, String value2) {
            addCriterion("A01CG between", value1, value2, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01cgNotBetween(String value1, String value2) {
            addCriterion("A01CG not between", value1, value2, "a01cg");
            return (Criteria) this;
        }

        public Criteria andA01chIsNull() {
            addCriterion("A01CH is null");
            return (Criteria) this;
        }

        public Criteria andA01chIsNotNull() {
            addCriterion("A01CH is not null");
            return (Criteria) this;
        }

        public Criteria andA01chEqualTo(Date value) {
            addCriterion("A01CH =", value, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chNotEqualTo(Date value) {
            addCriterion("A01CH <>", value, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chGreaterThan(Date value) {
            addCriterion("A01CH >", value, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chGreaterThanOrEqualTo(Date value) {
            addCriterion("A01CH >=", value, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chLessThan(Date value) {
            addCriterion("A01CH <", value, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chLessThanOrEqualTo(Date value) {
            addCriterion("A01CH <=", value, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chIn(List<Date> values) {
            addCriterion("A01CH in", values, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chNotIn(List<Date> values) {
            addCriterion("A01CH not in", values, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chBetween(Date value1, Date value2) {
            addCriterion("A01CH between", value1, value2, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01chNotBetween(Date value1, Date value2) {
            addCriterion("A01CH not between", value1, value2, "a01ch");
            return (Criteria) this;
        }

        public Criteria andA01ciIsNull() {
            addCriterion("A01CI is null");
            return (Criteria) this;
        }

        public Criteria andA01ciIsNotNull() {
            addCriterion("A01CI is not null");
            return (Criteria) this;
        }

        public Criteria andA01ciEqualTo(BigDecimal value) {
            addCriterion("A01CI =", value, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciNotEqualTo(BigDecimal value) {
            addCriterion("A01CI <>", value, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciGreaterThan(BigDecimal value) {
            addCriterion("A01CI >", value, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01CI >=", value, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciLessThan(BigDecimal value) {
            addCriterion("A01CI <", value, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01CI <=", value, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciIn(List<BigDecimal> values) {
            addCriterion("A01CI in", values, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciNotIn(List<BigDecimal> values) {
            addCriterion("A01CI not in", values, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01CI between", value1, value2, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ciNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01CI not between", value1, value2, "a01ci");
            return (Criteria) this;
        }

        public Criteria andA01ckIsNull() {
            addCriterion("A01CK is null");
            return (Criteria) this;
        }

        public Criteria andA01ckIsNotNull() {
            addCriterion("A01CK is not null");
            return (Criteria) this;
        }

        public Criteria andA01ckEqualTo(BigDecimal value) {
            addCriterion("A01CK =", value, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckNotEqualTo(BigDecimal value) {
            addCriterion("A01CK <>", value, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckGreaterThan(BigDecimal value) {
            addCriterion("A01CK >", value, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01CK >=", value, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckLessThan(BigDecimal value) {
            addCriterion("A01CK <", value, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01CK <=", value, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckIn(List<BigDecimal> values) {
            addCriterion("A01CK in", values, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckNotIn(List<BigDecimal> values) {
            addCriterion("A01CK not in", values, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01CK between", value1, value2, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01ckNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01CK not between", value1, value2, "a01ck");
            return (Criteria) this;
        }

        public Criteria andA01clIsNull() {
            addCriterion("A01CL is null");
            return (Criteria) this;
        }

        public Criteria andA01clIsNotNull() {
            addCriterion("A01CL is not null");
            return (Criteria) this;
        }

        public Criteria andA01clEqualTo(BigDecimal value) {
            addCriterion("A01CL =", value, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clNotEqualTo(BigDecimal value) {
            addCriterion("A01CL <>", value, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clGreaterThan(BigDecimal value) {
            addCriterion("A01CL >", value, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01CL >=", value, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clLessThan(BigDecimal value) {
            addCriterion("A01CL <", value, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01CL <=", value, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clIn(List<BigDecimal> values) {
            addCriterion("A01CL in", values, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clNotIn(List<BigDecimal> values) {
            addCriterion("A01CL not in", values, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01CL between", value1, value2, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01clNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01CL not between", value1, value2, "a01cl");
            return (Criteria) this;
        }

        public Criteria andA01cmIsNull() {
            addCriterion("A01CM is null");
            return (Criteria) this;
        }

        public Criteria andA01cmIsNotNull() {
            addCriterion("A01CM is not null");
            return (Criteria) this;
        }

        public Criteria andA01cmEqualTo(BigDecimal value) {
            addCriterion("A01CM =", value, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmNotEqualTo(BigDecimal value) {
            addCriterion("A01CM <>", value, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmGreaterThan(BigDecimal value) {
            addCriterion("A01CM >", value, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01CM >=", value, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmLessThan(BigDecimal value) {
            addCriterion("A01CM <", value, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01CM <=", value, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmIn(List<BigDecimal> values) {
            addCriterion("A01CM in", values, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmNotIn(List<BigDecimal> values) {
            addCriterion("A01CM not in", values, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01CM between", value1, value2, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01CM not between", value1, value2, "a01cm");
            return (Criteria) this;
        }

        public Criteria andA01cnIsNull() {
            addCriterion("A01CN is null");
            return (Criteria) this;
        }

        public Criteria andA01cnIsNotNull() {
            addCriterion("A01CN is not null");
            return (Criteria) this;
        }

        public Criteria andA01cnEqualTo(String value) {
            addCriterion("A01CN =", value, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnNotEqualTo(String value) {
            addCriterion("A01CN <>", value, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnGreaterThan(String value) {
            addCriterion("A01CN >", value, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnGreaterThanOrEqualTo(String value) {
            addCriterion("A01CN >=", value, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnLessThan(String value) {
            addCriterion("A01CN <", value, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnLessThanOrEqualTo(String value) {
            addCriterion("A01CN <=", value, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnLike(String value) {
            addCriterion("A01CN like", value, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnNotLike(String value) {
            addCriterion("A01CN not like", value, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnIn(List<String> values) {
            addCriterion("A01CN in", values, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnNotIn(List<String> values) {
            addCriterion("A01CN not in", values, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnBetween(String value1, String value2) {
            addCriterion("A01CN between", value1, value2, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01cnNotBetween(String value1, String value2) {
            addCriterion("A01CN not between", value1, value2, "a01cn");
            return (Criteria) this;
        }

        public Criteria andA01coIsNull() {
            addCriterion("A01CO is null");
            return (Criteria) this;
        }

        public Criteria andA01coIsNotNull() {
            addCriterion("A01CO is not null");
            return (Criteria) this;
        }

        public Criteria andA01coEqualTo(String value) {
            addCriterion("A01CO =", value, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coNotEqualTo(String value) {
            addCriterion("A01CO <>", value, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coGreaterThan(String value) {
            addCriterion("A01CO >", value, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coGreaterThanOrEqualTo(String value) {
            addCriterion("A01CO >=", value, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coLessThan(String value) {
            addCriterion("A01CO <", value, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coLessThanOrEqualTo(String value) {
            addCriterion("A01CO <=", value, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coLike(String value) {
            addCriterion("A01CO like", value, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coNotLike(String value) {
            addCriterion("A01CO not like", value, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coIn(List<String> values) {
            addCriterion("A01CO in", values, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coNotIn(List<String> values) {
            addCriterion("A01CO not in", values, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coBetween(String value1, String value2) {
            addCriterion("A01CO between", value1, value2, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01coNotBetween(String value1, String value2) {
            addCriterion("A01CO not between", value1, value2, "a01co");
            return (Criteria) this;
        }

        public Criteria andA01gl1IsNull() {
            addCriterion("A01GL1 is null");
            return (Criteria) this;
        }

        public Criteria andA01gl1IsNotNull() {
            addCriterion("A01GL1 is not null");
            return (Criteria) this;
        }

        public Criteria andA01gl1EqualTo(BigDecimal value) {
            addCriterion("A01GL1 =", value, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1NotEqualTo(BigDecimal value) {
            addCriterion("A01GL1 <>", value, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1GreaterThan(BigDecimal value) {
            addCriterion("A01GL1 >", value, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01GL1 >=", value, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1LessThan(BigDecimal value) {
            addCriterion("A01GL1 <", value, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01GL1 <=", value, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1In(List<BigDecimal> values) {
            addCriterion("A01GL1 in", values, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1NotIn(List<BigDecimal> values) {
            addCriterion("A01GL1 not in", values, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01GL1 between", value1, value2, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01GL1 not between", value1, value2, "a01gl1");
            return (Criteria) this;
        }

        public Criteria andA01gl2IsNull() {
            addCriterion("A01GL2 is null");
            return (Criteria) this;
        }

        public Criteria andA01gl2IsNotNull() {
            addCriterion("A01GL2 is not null");
            return (Criteria) this;
        }

        public Criteria andA01gl2EqualTo(BigDecimal value) {
            addCriterion("A01GL2 =", value, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2NotEqualTo(BigDecimal value) {
            addCriterion("A01GL2 <>", value, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2GreaterThan(BigDecimal value) {
            addCriterion("A01GL2 >", value, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01GL2 >=", value, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2LessThan(BigDecimal value) {
            addCriterion("A01GL2 <", value, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01GL2 <=", value, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2In(List<BigDecimal> values) {
            addCriterion("A01GL2 in", values, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2NotIn(List<BigDecimal> values) {
            addCriterion("A01GL2 not in", values, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01GL2 between", value1, value2, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01gl2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01GL2 not between", value1, value2, "a01gl2");
            return (Criteria) this;
        }

        public Criteria andA01ltIsNull() {
            addCriterion("A01LT is null");
            return (Criteria) this;
        }

        public Criteria andA01ltIsNotNull() {
            addCriterion("A01LT is not null");
            return (Criteria) this;
        }

        public Criteria andA01ltEqualTo(String value) {
            addCriterion("A01LT =", value, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltNotEqualTo(String value) {
            addCriterion("A01LT <>", value, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltGreaterThan(String value) {
            addCriterion("A01LT >", value, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltGreaterThanOrEqualTo(String value) {
            addCriterion("A01LT >=", value, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltLessThan(String value) {
            addCriterion("A01LT <", value, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltLessThanOrEqualTo(String value) {
            addCriterion("A01LT <=", value, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltLike(String value) {
            addCriterion("A01LT like", value, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltNotLike(String value) {
            addCriterion("A01LT not like", value, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltIn(List<String> values) {
            addCriterion("A01LT in", values, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltNotIn(List<String> values) {
            addCriterion("A01LT not in", values, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltBetween(String value1, String value2) {
            addCriterion("A01LT between", value1, value2, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01ltNotBetween(String value1, String value2) {
            addCriterion("A01LT not between", value1, value2, "a01lt");
            return (Criteria) this;
        }

        public Criteria andA01luIsNull() {
            addCriterion("A01LU is null");
            return (Criteria) this;
        }

        public Criteria andA01luIsNotNull() {
            addCriterion("A01LU is not null");
            return (Criteria) this;
        }

        public Criteria andA01luEqualTo(String value) {
            addCriterion("A01LU =", value, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luNotEqualTo(String value) {
            addCriterion("A01LU <>", value, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luGreaterThan(String value) {
            addCriterion("A01LU >", value, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luGreaterThanOrEqualTo(String value) {
            addCriterion("A01LU >=", value, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luLessThan(String value) {
            addCriterion("A01LU <", value, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luLessThanOrEqualTo(String value) {
            addCriterion("A01LU <=", value, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luLike(String value) {
            addCriterion("A01LU like", value, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luNotLike(String value) {
            addCriterion("A01LU not like", value, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luIn(List<String> values) {
            addCriterion("A01LU in", values, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luNotIn(List<String> values) {
            addCriterion("A01LU not in", values, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luBetween(String value1, String value2) {
            addCriterion("A01LU between", value1, value2, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01luNotBetween(String value1, String value2) {
            addCriterion("A01LU not between", value1, value2, "a01lu");
            return (Criteria) this;
        }

        public Criteria andA01lvIsNull() {
            addCriterion("A01LV is null");
            return (Criteria) this;
        }

        public Criteria andA01lvIsNotNull() {
            addCriterion("A01LV is not null");
            return (Criteria) this;
        }

        public Criteria andA01lvEqualTo(String value) {
            addCriterion("A01LV =", value, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvNotEqualTo(String value) {
            addCriterion("A01LV <>", value, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvGreaterThan(String value) {
            addCriterion("A01LV >", value, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvGreaterThanOrEqualTo(String value) {
            addCriterion("A01LV >=", value, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvLessThan(String value) {
            addCriterion("A01LV <", value, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvLessThanOrEqualTo(String value) {
            addCriterion("A01LV <=", value, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvLike(String value) {
            addCriterion("A01LV like", value, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvNotLike(String value) {
            addCriterion("A01LV not like", value, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvIn(List<String> values) {
            addCriterion("A01LV in", values, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvNotIn(List<String> values) {
            addCriterion("A01LV not in", values, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvBetween(String value1, String value2) {
            addCriterion("A01LV between", value1, value2, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lvNotBetween(String value1, String value2) {
            addCriterion("A01LV not between", value1, value2, "a01lv");
            return (Criteria) this;
        }

        public Criteria andA01lwIsNull() {
            addCriterion("A01LW is null");
            return (Criteria) this;
        }

        public Criteria andA01lwIsNotNull() {
            addCriterion("A01LW is not null");
            return (Criteria) this;
        }

        public Criteria andA01lwEqualTo(String value) {
            addCriterion("A01LW =", value, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwNotEqualTo(String value) {
            addCriterion("A01LW <>", value, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwGreaterThan(String value) {
            addCriterion("A01LW >", value, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwGreaterThanOrEqualTo(String value) {
            addCriterion("A01LW >=", value, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwLessThan(String value) {
            addCriterion("A01LW <", value, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwLessThanOrEqualTo(String value) {
            addCriterion("A01LW <=", value, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwLike(String value) {
            addCriterion("A01LW like", value, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwNotLike(String value) {
            addCriterion("A01LW not like", value, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwIn(List<String> values) {
            addCriterion("A01LW in", values, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwNotIn(List<String> values) {
            addCriterion("A01LW not in", values, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwBetween(String value1, String value2) {
            addCriterion("A01LW between", value1, value2, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lwNotBetween(String value1, String value2) {
            addCriterion("A01LW not between", value1, value2, "a01lw");
            return (Criteria) this;
        }

        public Criteria andA01lxIsNull() {
            addCriterion("A01LX is null");
            return (Criteria) this;
        }

        public Criteria andA01lxIsNotNull() {
            addCriterion("A01LX is not null");
            return (Criteria) this;
        }

        public Criteria andA01lxEqualTo(String value) {
            addCriterion("A01LX =", value, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxNotEqualTo(String value) {
            addCriterion("A01LX <>", value, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxGreaterThan(String value) {
            addCriterion("A01LX >", value, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxGreaterThanOrEqualTo(String value) {
            addCriterion("A01LX >=", value, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxLessThan(String value) {
            addCriterion("A01LX <", value, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxLessThanOrEqualTo(String value) {
            addCriterion("A01LX <=", value, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxLike(String value) {
            addCriterion("A01LX like", value, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxNotLike(String value) {
            addCriterion("A01LX not like", value, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxIn(List<String> values) {
            addCriterion("A01LX in", values, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxNotIn(List<String> values) {
            addCriterion("A01LX not in", values, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxBetween(String value1, String value2) {
            addCriterion("A01LX between", value1, value2, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lxNotBetween(String value1, String value2) {
            addCriterion("A01LX not between", value1, value2, "a01lx");
            return (Criteria) this;
        }

        public Criteria andA01lyIsNull() {
            addCriterion("A01LY is null");
            return (Criteria) this;
        }

        public Criteria andA01lyIsNotNull() {
            addCriterion("A01LY is not null");
            return (Criteria) this;
        }

        public Criteria andA01lyEqualTo(String value) {
            addCriterion("A01LY =", value, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyNotEqualTo(String value) {
            addCriterion("A01LY <>", value, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyGreaterThan(String value) {
            addCriterion("A01LY >", value, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyGreaterThanOrEqualTo(String value) {
            addCriterion("A01LY >=", value, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyLessThan(String value) {
            addCriterion("A01LY <", value, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyLessThanOrEqualTo(String value) {
            addCriterion("A01LY <=", value, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyLike(String value) {
            addCriterion("A01LY like", value, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyNotLike(String value) {
            addCriterion("A01LY not like", value, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyIn(List<String> values) {
            addCriterion("A01LY in", values, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyNotIn(List<String> values) {
            addCriterion("A01LY not in", values, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyBetween(String value1, String value2) {
            addCriterion("A01LY between", value1, value2, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lyNotBetween(String value1, String value2) {
            addCriterion("A01LY not between", value1, value2, "a01ly");
            return (Criteria) this;
        }

        public Criteria andA01lzIsNull() {
            addCriterion("A01LZ is null");
            return (Criteria) this;
        }

        public Criteria andA01lzIsNotNull() {
            addCriterion("A01LZ is not null");
            return (Criteria) this;
        }

        public Criteria andA01lzEqualTo(Date value) {
            addCriterion("A01LZ =", value, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzNotEqualTo(Date value) {
            addCriterion("A01LZ <>", value, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzGreaterThan(Date value) {
            addCriterion("A01LZ >", value, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzGreaterThanOrEqualTo(Date value) {
            addCriterion("A01LZ >=", value, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzLessThan(Date value) {
            addCriterion("A01LZ <", value, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzLessThanOrEqualTo(Date value) {
            addCriterion("A01LZ <=", value, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzIn(List<Date> values) {
            addCriterion("A01LZ in", values, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzNotIn(List<Date> values) {
            addCriterion("A01LZ not in", values, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzBetween(Date value1, Date value2) {
            addCriterion("A01LZ between", value1, value2, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01lzNotBetween(Date value1, Date value2) {
            addCriterion("A01LZ not between", value1, value2, "a01lz");
            return (Criteria) this;
        }

        public Criteria andA01m0IsNull() {
            addCriterion("A01M0 is null");
            return (Criteria) this;
        }

        public Criteria andA01m0IsNotNull() {
            addCriterion("A01M0 is not null");
            return (Criteria) this;
        }

        public Criteria andA01m0EqualTo(BigDecimal value) {
            addCriterion("A01M0 =", value, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0NotEqualTo(BigDecimal value) {
            addCriterion("A01M0 <>", value, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0GreaterThan(BigDecimal value) {
            addCriterion("A01M0 >", value, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01M0 >=", value, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0LessThan(BigDecimal value) {
            addCriterion("A01M0 <", value, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01M0 <=", value, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0In(List<BigDecimal> values) {
            addCriterion("A01M0 in", values, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0NotIn(List<BigDecimal> values) {
            addCriterion("A01M0 not in", values, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01M0 between", value1, value2, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01M0 not between", value1, value2, "a01m0");
            return (Criteria) this;
        }

        public Criteria andA01m2IsNull() {
            addCriterion("A01M2 is null");
            return (Criteria) this;
        }

        public Criteria andA01m2IsNotNull() {
            addCriterion("A01M2 is not null");
            return (Criteria) this;
        }

        public Criteria andA01m2EqualTo(BigDecimal value) {
            addCriterion("A01M2 =", value, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2NotEqualTo(BigDecimal value) {
            addCriterion("A01M2 <>", value, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2GreaterThan(BigDecimal value) {
            addCriterion("A01M2 >", value, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01M2 >=", value, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2LessThan(BigDecimal value) {
            addCriterion("A01M2 <", value, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01M2 <=", value, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2In(List<BigDecimal> values) {
            addCriterion("A01M2 in", values, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2NotIn(List<BigDecimal> values) {
            addCriterion("A01M2 not in", values, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01M2 between", value1, value2, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01M2 not between", value1, value2, "a01m2");
            return (Criteria) this;
        }

        public Criteria andA01m3IsNull() {
            addCriterion("A01M3 is null");
            return (Criteria) this;
        }

        public Criteria andA01m3IsNotNull() {
            addCriterion("A01M3 is not null");
            return (Criteria) this;
        }

        public Criteria andA01m3EqualTo(String value) {
            addCriterion("A01M3 =", value, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3NotEqualTo(String value) {
            addCriterion("A01M3 <>", value, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3GreaterThan(String value) {
            addCriterion("A01M3 >", value, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3GreaterThanOrEqualTo(String value) {
            addCriterion("A01M3 >=", value, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3LessThan(String value) {
            addCriterion("A01M3 <", value, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3LessThanOrEqualTo(String value) {
            addCriterion("A01M3 <=", value, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3Like(String value) {
            addCriterion("A01M3 like", value, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3NotLike(String value) {
            addCriterion("A01M3 not like", value, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3In(List<String> values) {
            addCriterion("A01M3 in", values, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3NotIn(List<String> values) {
            addCriterion("A01M3 not in", values, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3Between(String value1, String value2) {
            addCriterion("A01M3 between", value1, value2, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m3NotBetween(String value1, String value2) {
            addCriterion("A01M3 not between", value1, value2, "a01m3");
            return (Criteria) this;
        }

        public Criteria andA01m4IsNull() {
            addCriterion("A01M4 is null");
            return (Criteria) this;
        }

        public Criteria andA01m4IsNotNull() {
            addCriterion("A01M4 is not null");
            return (Criteria) this;
        }

        public Criteria andA01m4EqualTo(String value) {
            addCriterion("A01M4 =", value, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4NotEqualTo(String value) {
            addCriterion("A01M4 <>", value, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4GreaterThan(String value) {
            addCriterion("A01M4 >", value, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4GreaterThanOrEqualTo(String value) {
            addCriterion("A01M4 >=", value, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4LessThan(String value) {
            addCriterion("A01M4 <", value, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4LessThanOrEqualTo(String value) {
            addCriterion("A01M4 <=", value, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4Like(String value) {
            addCriterion("A01M4 like", value, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4NotLike(String value) {
            addCriterion("A01M4 not like", value, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4In(List<String> values) {
            addCriterion("A01M4 in", values, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4NotIn(List<String> values) {
            addCriterion("A01M4 not in", values, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4Between(String value1, String value2) {
            addCriterion("A01M4 between", value1, value2, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m4NotBetween(String value1, String value2) {
            addCriterion("A01M4 not between", value1, value2, "a01m4");
            return (Criteria) this;
        }

        public Criteria andA01m5IsNull() {
            addCriterion("A01M5 is null");
            return (Criteria) this;
        }

        public Criteria andA01m5IsNotNull() {
            addCriterion("A01M5 is not null");
            return (Criteria) this;
        }

        public Criteria andA01m5EqualTo(String value) {
            addCriterion("A01M5 =", value, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5NotEqualTo(String value) {
            addCriterion("A01M5 <>", value, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5GreaterThan(String value) {
            addCriterion("A01M5 >", value, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5GreaterThanOrEqualTo(String value) {
            addCriterion("A01M5 >=", value, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5LessThan(String value) {
            addCriterion("A01M5 <", value, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5LessThanOrEqualTo(String value) {
            addCriterion("A01M5 <=", value, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5Like(String value) {
            addCriterion("A01M5 like", value, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5NotLike(String value) {
            addCriterion("A01M5 not like", value, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5In(List<String> values) {
            addCriterion("A01M5 in", values, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5NotIn(List<String> values) {
            addCriterion("A01M5 not in", values, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5Between(String value1, String value2) {
            addCriterion("A01M5 between", value1, value2, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01m5NotBetween(String value1, String value2) {
            addCriterion("A01M5 not between", value1, value2, "a01m5");
            return (Criteria) this;
        }

        public Criteria andA01tzbuIsNull() {
            addCriterion("A01TZBU is null");
            return (Criteria) this;
        }

        public Criteria andA01tzbuIsNotNull() {
            addCriterion("A01TZBU is not null");
            return (Criteria) this;
        }

        public Criteria andA01tzbuEqualTo(String value) {
            addCriterion("A01TZBU =", value, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuNotEqualTo(String value) {
            addCriterion("A01TZBU <>", value, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuGreaterThan(String value) {
            addCriterion("A01TZBU >", value, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuGreaterThanOrEqualTo(String value) {
            addCriterion("A01TZBU >=", value, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuLessThan(String value) {
            addCriterion("A01TZBU <", value, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuLessThanOrEqualTo(String value) {
            addCriterion("A01TZBU <=", value, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuLike(String value) {
            addCriterion("A01TZBU like", value, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuNotLike(String value) {
            addCriterion("A01TZBU not like", value, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuIn(List<String> values) {
            addCriterion("A01TZBU in", values, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuNotIn(List<String> values) {
            addCriterion("A01TZBU not in", values, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuBetween(String value1, String value2) {
            addCriterion("A01TZBU between", value1, value2, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbuNotBetween(String value1, String value2) {
            addCriterion("A01TZBU not between", value1, value2, "a01tzbu");
            return (Criteria) this;
        }

        public Criteria andA01tzbvIsNull() {
            addCriterion("A01TZBV is null");
            return (Criteria) this;
        }

        public Criteria andA01tzbvIsNotNull() {
            addCriterion("A01TZBV is not null");
            return (Criteria) this;
        }

        public Criteria andA01tzbvEqualTo(String value) {
            addCriterion("A01TZBV =", value, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvNotEqualTo(String value) {
            addCriterion("A01TZBV <>", value, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvGreaterThan(String value) {
            addCriterion("A01TZBV >", value, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvGreaterThanOrEqualTo(String value) {
            addCriterion("A01TZBV >=", value, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvLessThan(String value) {
            addCriterion("A01TZBV <", value, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvLessThanOrEqualTo(String value) {
            addCriterion("A01TZBV <=", value, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvLike(String value) {
            addCriterion("A01TZBV like", value, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvNotLike(String value) {
            addCriterion("A01TZBV not like", value, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvIn(List<String> values) {
            addCriterion("A01TZBV in", values, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvNotIn(List<String> values) {
            addCriterion("A01TZBV not in", values, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvBetween(String value1, String value2) {
            addCriterion("A01TZBV between", value1, value2, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbvNotBetween(String value1, String value2) {
            addCriterion("A01TZBV not between", value1, value2, "a01tzbv");
            return (Criteria) this;
        }

        public Criteria andA01tzbwIsNull() {
            addCriterion("A01TZBW is null");
            return (Criteria) this;
        }

        public Criteria andA01tzbwIsNotNull() {
            addCriterion("A01TZBW is not null");
            return (Criteria) this;
        }

        public Criteria andA01tzbwEqualTo(Date value) {
            addCriterion("A01TZBW =", value, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwNotEqualTo(Date value) {
            addCriterion("A01TZBW <>", value, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwGreaterThan(Date value) {
            addCriterion("A01TZBW >", value, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwGreaterThanOrEqualTo(Date value) {
            addCriterion("A01TZBW >=", value, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwLessThan(Date value) {
            addCriterion("A01TZBW <", value, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwLessThanOrEqualTo(Date value) {
            addCriterion("A01TZBW <=", value, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwIn(List<Date> values) {
            addCriterion("A01TZBW in", values, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwNotIn(List<Date> values) {
            addCriterion("A01TZBW not in", values, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwBetween(Date value1, Date value2) {
            addCriterion("A01TZBW between", value1, value2, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbwNotBetween(Date value1, Date value2) {
            addCriterion("A01TZBW not between", value1, value2, "a01tzbw");
            return (Criteria) this;
        }

        public Criteria andA01tzbxIsNull() {
            addCriterion("A01TZBX is null");
            return (Criteria) this;
        }

        public Criteria andA01tzbxIsNotNull() {
            addCriterion("A01TZBX is not null");
            return (Criteria) this;
        }

        public Criteria andA01tzbxEqualTo(Date value) {
            addCriterion("A01TZBX =", value, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxNotEqualTo(Date value) {
            addCriterion("A01TZBX <>", value, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxGreaterThan(Date value) {
            addCriterion("A01TZBX >", value, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxGreaterThanOrEqualTo(Date value) {
            addCriterion("A01TZBX >=", value, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxLessThan(Date value) {
            addCriterion("A01TZBX <", value, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxLessThanOrEqualTo(Date value) {
            addCriterion("A01TZBX <=", value, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxIn(List<Date> values) {
            addCriterion("A01TZBX in", values, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxNotIn(List<Date> values) {
            addCriterion("A01TZBX not in", values, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxBetween(Date value1, Date value2) {
            addCriterion("A01TZBX between", value1, value2, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbxNotBetween(Date value1, Date value2) {
            addCriterion("A01TZBX not between", value1, value2, "a01tzbx");
            return (Criteria) this;
        }

        public Criteria andA01tzbyIsNull() {
            addCriterion("A01TZBY is null");
            return (Criteria) this;
        }

        public Criteria andA01tzbyIsNotNull() {
            addCriterion("A01TZBY is not null");
            return (Criteria) this;
        }

        public Criteria andA01tzbyEqualTo(BigDecimal value) {
            addCriterion("A01TZBY =", value, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyNotEqualTo(BigDecimal value) {
            addCriterion("A01TZBY <>", value, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyGreaterThan(BigDecimal value) {
            addCriterion("A01TZBY >", value, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01TZBY >=", value, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyLessThan(BigDecimal value) {
            addCriterion("A01TZBY <", value, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01TZBY <=", value, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyIn(List<BigDecimal> values) {
            addCriterion("A01TZBY in", values, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyNotIn(List<BigDecimal> values) {
            addCriterion("A01TZBY not in", values, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01TZBY between", value1, value2, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01tzbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01TZBY not between", value1, value2, "a01tzby");
            return (Criteria) this;
        }

        public Criteria andA01zwdmIsNull() {
            addCriterion("A01ZWDM is null");
            return (Criteria) this;
        }

        public Criteria andA01zwdmIsNotNull() {
            addCriterion("A01ZWDM is not null");
            return (Criteria) this;
        }

        public Criteria andA01zwdmEqualTo(String value) {
            addCriterion("A01ZWDM =", value, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmNotEqualTo(String value) {
            addCriterion("A01ZWDM <>", value, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmGreaterThan(String value) {
            addCriterion("A01ZWDM >", value, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmGreaterThanOrEqualTo(String value) {
            addCriterion("A01ZWDM >=", value, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmLessThan(String value) {
            addCriterion("A01ZWDM <", value, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmLessThanOrEqualTo(String value) {
            addCriterion("A01ZWDM <=", value, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmLike(String value) {
            addCriterion("A01ZWDM like", value, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmNotLike(String value) {
            addCriterion("A01ZWDM not like", value, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmIn(List<String> values) {
            addCriterion("A01ZWDM in", values, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmNotIn(List<String> values) {
            addCriterion("A01ZWDM not in", values, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmBetween(String value1, String value2) {
            addCriterion("A01ZWDM between", value1, value2, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andA01zwdmNotBetween(String value1, String value2) {
            addCriterion("A01ZWDM not between", value1, value2, "a01zwdm");
            return (Criteria) this;
        }

        public Criteria andC0105IsNull() {
            addCriterion("C0105 is null");
            return (Criteria) this;
        }

        public Criteria andC0105IsNotNull() {
            addCriterion("C0105 is not null");
            return (Criteria) this;
        }

        public Criteria andC0105EqualTo(String value) {
            addCriterion("C0105 =", value, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105NotEqualTo(String value) {
            addCriterion("C0105 <>", value, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105GreaterThan(String value) {
            addCriterion("C0105 >", value, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105GreaterThanOrEqualTo(String value) {
            addCriterion("C0105 >=", value, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105LessThan(String value) {
            addCriterion("C0105 <", value, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105LessThanOrEqualTo(String value) {
            addCriterion("C0105 <=", value, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105Like(String value) {
            addCriterion("C0105 like", value, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105NotLike(String value) {
            addCriterion("C0105 not like", value, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105In(List<String> values) {
            addCriterion("C0105 in", values, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105NotIn(List<String> values) {
            addCriterion("C0105 not in", values, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105Between(String value1, String value2) {
            addCriterion("C0105 between", value1, value2, "c0105");
            return (Criteria) this;
        }

        public Criteria andC0105NotBetween(String value1, String value2) {
            addCriterion("C0105 not between", value1, value2, "c0105");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(BigDecimal value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(BigDecimal value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(BigDecimal value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(BigDecimal value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<BigDecimal> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<BigDecimal> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andA01uptmIsNull() {
            addCriterion("A01UPTM is null");
            return (Criteria) this;
        }

        public Criteria andA01uptmIsNotNull() {
            addCriterion("A01UPTM is not null");
            return (Criteria) this;
        }

        public Criteria andA01uptmEqualTo(Date value) {
            addCriterion("A01UPTM =", value, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmNotEqualTo(Date value) {
            addCriterion("A01UPTM <>", value, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmGreaterThan(Date value) {
            addCriterion("A01UPTM >", value, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmGreaterThanOrEqualTo(Date value) {
            addCriterion("A01UPTM >=", value, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmLessThan(Date value) {
            addCriterion("A01UPTM <", value, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmLessThanOrEqualTo(Date value) {
            addCriterion("A01UPTM <=", value, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmIn(List<Date> values) {
            addCriterion("A01UPTM in", values, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmNotIn(List<Date> values) {
            addCriterion("A01UPTM not in", values, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmBetween(Date value1, Date value2) {
            addCriterion("A01UPTM between", value1, value2, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01uptmNotBetween(Date value1, Date value2) {
            addCriterion("A01UPTM not between", value1, value2, "a01uptm");
            return (Criteria) this;
        }

        public Criteria andA01tzbsIsNull() {
            addCriterion("A01TZBS is null");
            return (Criteria) this;
        }

        public Criteria andA01tzbsIsNotNull() {
            addCriterion("A01TZBS is not null");
            return (Criteria) this;
        }

        public Criteria andA01tzbsEqualTo(String value) {
            addCriterion("A01TZBS =", value, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsNotEqualTo(String value) {
            addCriterion("A01TZBS <>", value, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsGreaterThan(String value) {
            addCriterion("A01TZBS >", value, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsGreaterThanOrEqualTo(String value) {
            addCriterion("A01TZBS >=", value, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsLessThan(String value) {
            addCriterion("A01TZBS <", value, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsLessThanOrEqualTo(String value) {
            addCriterion("A01TZBS <=", value, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsLike(String value) {
            addCriterion("A01TZBS like", value, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsNotLike(String value) {
            addCriterion("A01TZBS not like", value, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsIn(List<String> values) {
            addCriterion("A01TZBS in", values, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsNotIn(List<String> values) {
            addCriterion("A01TZBS not in", values, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsBetween(String value1, String value2) {
            addCriterion("A01TZBS between", value1, value2, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andA01tzbsNotBetween(String value1, String value2) {
            addCriterion("A01TZBS not between", value1, value2, "a01tzbs");
            return (Criteria) this;
        }

        public Criteria andPydmIsNull() {
            addCriterion("PYDM is null");
            return (Criteria) this;
        }

        public Criteria andPydmIsNotNull() {
            addCriterion("PYDM is not null");
            return (Criteria) this;
        }

        public Criteria andPydmEqualTo(String value) {
            addCriterion("PYDM =", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmNotEqualTo(String value) {
            addCriterion("PYDM <>", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmGreaterThan(String value) {
            addCriterion("PYDM >", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmGreaterThanOrEqualTo(String value) {
            addCriterion("PYDM >=", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmLessThan(String value) {
            addCriterion("PYDM <", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmLessThanOrEqualTo(String value) {
            addCriterion("PYDM <=", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmLike(String value) {
            addCriterion("PYDM like", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmNotLike(String value) {
            addCriterion("PYDM not like", value, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmIn(List<String> values) {
            addCriterion("PYDM in", values, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmNotIn(List<String> values) {
            addCriterion("PYDM not in", values, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmBetween(String value1, String value2) {
            addCriterion("PYDM between", value1, value2, "pydm");
            return (Criteria) this;
        }

        public Criteria andPydmNotBetween(String value1, String value2) {
            addCriterion("PYDM not between", value1, value2, "pydm");
            return (Criteria) this;
        }

        public Criteria andA01tzbzIsNull() {
            addCriterion("A01TZBZ is null");
            return (Criteria) this;
        }

        public Criteria andA01tzbzIsNotNull() {
            addCriterion("A01TZBZ is not null");
            return (Criteria) this;
        }

        public Criteria andA01tzbzEqualTo(Integer value) {
            addCriterion("A01TZBZ =", value, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzNotEqualTo(Integer value) {
            addCriterion("A01TZBZ <>", value, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzGreaterThan(Integer value) {
            addCriterion("A01TZBZ >", value, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzGreaterThanOrEqualTo(Integer value) {
            addCriterion("A01TZBZ >=", value, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzLessThan(Integer value) {
            addCriterion("A01TZBZ <", value, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzLessThanOrEqualTo(Integer value) {
            addCriterion("A01TZBZ <=", value, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzIn(List<Integer> values) {
            addCriterion("A01TZBZ in", values, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzNotIn(List<Integer> values) {
            addCriterion("A01TZBZ not in", values, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzBetween(Integer value1, Integer value2) {
            addCriterion("A01TZBZ between", value1, value2, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01tzbzNotBetween(Integer value1, Integer value2) {
            addCriterion("A01TZBZ not between", value1, value2, "a01tzbz");
            return (Criteria) this;
        }

        public Criteria andA01lsIsNull() {
            addCriterion("A01LS is null");
            return (Criteria) this;
        }

        public Criteria andA01lsIsNotNull() {
            addCriterion("A01LS is not null");
            return (Criteria) this;
        }

        public Criteria andA01lsEqualTo(BigDecimal value) {
            addCriterion("A01LS =", value, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsNotEqualTo(BigDecimal value) {
            addCriterion("A01LS <>", value, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsGreaterThan(BigDecimal value) {
            addCriterion("A01LS >", value, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("A01LS >=", value, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsLessThan(BigDecimal value) {
            addCriterion("A01LS <", value, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("A01LS <=", value, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsIn(List<BigDecimal> values) {
            addCriterion("A01LS in", values, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsNotIn(List<BigDecimal> values) {
            addCriterion("A01LS not in", values, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01LS between", value1, value2, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01lsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("A01LS not between", value1, value2, "a01ls");
            return (Criteria) this;
        }

        public Criteria andA01caIsNull() {
            addCriterion("A01CA is null");
            return (Criteria) this;
        }

        public Criteria andA01caIsNotNull() {
            addCriterion("A01CA is not null");
            return (Criteria) this;
        }

        public Criteria andA01caEqualTo(String value) {
            addCriterion("A01CA =", value, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caNotEqualTo(String value) {
            addCriterion("A01CA <>", value, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caGreaterThan(String value) {
            addCriterion("A01CA >", value, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caGreaterThanOrEqualTo(String value) {
            addCriterion("A01CA >=", value, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caLessThan(String value) {
            addCriterion("A01CA <", value, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caLessThanOrEqualTo(String value) {
            addCriterion("A01CA <=", value, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caLike(String value) {
            addCriterion("A01CA like", value, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caNotLike(String value) {
            addCriterion("A01CA not like", value, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caIn(List<String> values) {
            addCriterion("A01CA in", values, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caNotIn(List<String> values) {
            addCriterion("A01CA not in", values, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caBetween(String value1, String value2) {
            addCriterion("A01CA between", value1, value2, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01caNotBetween(String value1, String value2) {
            addCriterion("A01CA not between", value1, value2, "a01ca");
            return (Criteria) this;
        }

        public Criteria andA01cbIsNull() {
            addCriterion("A01CB is null");
            return (Criteria) this;
        }

        public Criteria andA01cbIsNotNull() {
            addCriterion("A01CB is not null");
            return (Criteria) this;
        }

        public Criteria andA01cbEqualTo(String value) {
            addCriterion("A01CB =", value, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbNotEqualTo(String value) {
            addCriterion("A01CB <>", value, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbGreaterThan(String value) {
            addCriterion("A01CB >", value, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbGreaterThanOrEqualTo(String value) {
            addCriterion("A01CB >=", value, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbLessThan(String value) {
            addCriterion("A01CB <", value, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbLessThanOrEqualTo(String value) {
            addCriterion("A01CB <=", value, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbLike(String value) {
            addCriterion("A01CB like", value, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbNotLike(String value) {
            addCriterion("A01CB not like", value, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbIn(List<String> values) {
            addCriterion("A01CB in", values, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbNotIn(List<String> values) {
            addCriterion("A01CB not in", values, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbBetween(String value1, String value2) {
            addCriterion("A01CB between", value1, value2, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01cbNotBetween(String value1, String value2) {
            addCriterion("A01CB not between", value1, value2, "a01cb");
            return (Criteria) this;
        }

        public Criteria andA01ccIsNull() {
            addCriterion("A01CC is null");
            return (Criteria) this;
        }

        public Criteria andA01ccIsNotNull() {
            addCriterion("A01CC is not null");
            return (Criteria) this;
        }

        public Criteria andA01ccEqualTo(String value) {
            addCriterion("A01CC =", value, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccNotEqualTo(String value) {
            addCriterion("A01CC <>", value, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccGreaterThan(String value) {
            addCriterion("A01CC >", value, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccGreaterThanOrEqualTo(String value) {
            addCriterion("A01CC >=", value, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccLessThan(String value) {
            addCriterion("A01CC <", value, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccLessThanOrEqualTo(String value) {
            addCriterion("A01CC <=", value, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccLike(String value) {
            addCriterion("A01CC like", value, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccNotLike(String value) {
            addCriterion("A01CC not like", value, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccIn(List<String> values) {
            addCriterion("A01CC in", values, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccNotIn(List<String> values) {
            addCriterion("A01CC not in", values, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccBetween(String value1, String value2) {
            addCriterion("A01CC between", value1, value2, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01ccNotBetween(String value1, String value2) {
            addCriterion("A01CC not between", value1, value2, "a01cc");
            return (Criteria) this;
        }

        public Criteria andA01bmbsIsNull() {
            addCriterion("A01BMBS is null");
            return (Criteria) this;
        }

        public Criteria andA01bmbsIsNotNull() {
            addCriterion("A01BMBS is not null");
            return (Criteria) this;
        }

        public Criteria andA01bmbsEqualTo(String value) {
            addCriterion("A01BMBS =", value, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsNotEqualTo(String value) {
            addCriterion("A01BMBS <>", value, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsGreaterThan(String value) {
            addCriterion("A01BMBS >", value, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsGreaterThanOrEqualTo(String value) {
            addCriterion("A01BMBS >=", value, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsLessThan(String value) {
            addCriterion("A01BMBS <", value, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsLessThanOrEqualTo(String value) {
            addCriterion("A01BMBS <=", value, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsLike(String value) {
            addCriterion("A01BMBS like", value, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsNotLike(String value) {
            addCriterion("A01BMBS not like", value, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsIn(List<String> values) {
            addCriterion("A01BMBS in", values, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsNotIn(List<String> values) {
            addCriterion("A01BMBS not in", values, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsBetween(String value1, String value2) {
            addCriterion("A01BMBS between", value1, value2, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01bmbsNotBetween(String value1, String value2) {
            addCriterion("A01BMBS not between", value1, value2, "a01bmbs");
            return (Criteria) this;
        }

        public Criteria andA01wxIsNull() {
            addCriterion("A01WX is null");
            return (Criteria) this;
        }

        public Criteria andA01wxIsNotNull() {
            addCriterion("A01WX is not null");
            return (Criteria) this;
        }

        public Criteria andA01wxEqualTo(String value) {
            addCriterion("A01WX =", value, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxNotEqualTo(String value) {
            addCriterion("A01WX <>", value, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxGreaterThan(String value) {
            addCriterion("A01WX >", value, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxGreaterThanOrEqualTo(String value) {
            addCriterion("A01WX >=", value, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxLessThan(String value) {
            addCriterion("A01WX <", value, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxLessThanOrEqualTo(String value) {
            addCriterion("A01WX <=", value, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxLike(String value) {
            addCriterion("A01WX like", value, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxNotLike(String value) {
            addCriterion("A01WX not like", value, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxIn(List<String> values) {
            addCriterion("A01WX in", values, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxNotIn(List<String> values) {
            addCriterion("A01WX not in", values, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxBetween(String value1, String value2) {
            addCriterion("A01WX between", value1, value2, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01wxNotBetween(String value1, String value2) {
            addCriterion("A01WX not between", value1, value2, "a01wx");
            return (Criteria) this;
        }

        public Criteria andA01d1IsNull() {
            addCriterion("A01D1 is null");
            return (Criteria) this;
        }

        public Criteria andA01d1IsNotNull() {
            addCriterion("A01D1 is not null");
            return (Criteria) this;
        }

        public Criteria andA01d1EqualTo(String value) {
            addCriterion("A01D1 =", value, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1NotEqualTo(String value) {
            addCriterion("A01D1 <>", value, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1GreaterThan(String value) {
            addCriterion("A01D1 >", value, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1GreaterThanOrEqualTo(String value) {
            addCriterion("A01D1 >=", value, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1LessThan(String value) {
            addCriterion("A01D1 <", value, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1LessThanOrEqualTo(String value) {
            addCriterion("A01D1 <=", value, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1Like(String value) {
            addCriterion("A01D1 like", value, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1NotLike(String value) {
            addCriterion("A01D1 not like", value, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1In(List<String> values) {
            addCriterion("A01D1 in", values, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1NotIn(List<String> values) {
            addCriterion("A01D1 not in", values, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1Between(String value1, String value2) {
            addCriterion("A01D1 between", value1, value2, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d1NotBetween(String value1, String value2) {
            addCriterion("A01D1 not between", value1, value2, "a01d1");
            return (Criteria) this;
        }

        public Criteria andA01d3IsNull() {
            addCriterion("A01D3 is null");
            return (Criteria) this;
        }

        public Criteria andA01d3IsNotNull() {
            addCriterion("A01D3 is not null");
            return (Criteria) this;
        }

        public Criteria andA01d3EqualTo(String value) {
            addCriterion("A01D3 =", value, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3NotEqualTo(String value) {
            addCriterion("A01D3 <>", value, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3GreaterThan(String value) {
            addCriterion("A01D3 >", value, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3GreaterThanOrEqualTo(String value) {
            addCriterion("A01D3 >=", value, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3LessThan(String value) {
            addCriterion("A01D3 <", value, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3LessThanOrEqualTo(String value) {
            addCriterion("A01D3 <=", value, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3Like(String value) {
            addCriterion("A01D3 like", value, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3NotLike(String value) {
            addCriterion("A01D3 not like", value, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3In(List<String> values) {
            addCriterion("A01D3 in", values, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3NotIn(List<String> values) {
            addCriterion("A01D3 not in", values, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3Between(String value1, String value2) {
            addCriterion("A01D3 between", value1, value2, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d3NotBetween(String value1, String value2) {
            addCriterion("A01D3 not between", value1, value2, "a01d3");
            return (Criteria) this;
        }

        public Criteria andA01d2IsNull() {
            addCriterion("A01D2 is null");
            return (Criteria) this;
        }

        public Criteria andA01d2IsNotNull() {
            addCriterion("A01D2 is not null");
            return (Criteria) this;
        }

        public Criteria andA01d2EqualTo(String value) {
            addCriterion("A01D2 =", value, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2NotEqualTo(String value) {
            addCriterion("A01D2 <>", value, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2GreaterThan(String value) {
            addCriterion("A01D2 >", value, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2GreaterThanOrEqualTo(String value) {
            addCriterion("A01D2 >=", value, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2LessThan(String value) {
            addCriterion("A01D2 <", value, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2LessThanOrEqualTo(String value) {
            addCriterion("A01D2 <=", value, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2Like(String value) {
            addCriterion("A01D2 like", value, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2NotLike(String value) {
            addCriterion("A01D2 not like", value, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2In(List<String> values) {
            addCriterion("A01D2 in", values, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2NotIn(List<String> values) {
            addCriterion("A01D2 not in", values, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2Between(String value1, String value2) {
            addCriterion("A01D2 between", value1, value2, "a01d2");
            return (Criteria) this;
        }

        public Criteria andA01d2NotBetween(String value1, String value2) {
            addCriterion("A01D2 not between", value1, value2, "a01d2");
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