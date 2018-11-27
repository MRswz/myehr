package com.myehr.pojo.formmanage.question;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraAnswerExample() {
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

        public Criteria andEmpidIsNull() {
            addCriterion("EMPID is null");
            return (Criteria) this;
        }

        public Criteria andEmpidIsNotNull() {
            addCriterion("EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpidEqualTo(String value) {
            addCriterion("EMPID =", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotEqualTo(String value) {
            addCriterion("EMPID <>", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThan(String value) {
            addCriterion("EMPID >", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPID >=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThan(String value) {
            addCriterion("EMPID <", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLessThanOrEqualTo(String value) {
            addCriterion("EMPID <=", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidLike(String value) {
            addCriterion("EMPID like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotLike(String value) {
            addCriterion("EMPID not like", value, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidIn(List<String> values) {
            addCriterion("EMPID in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotIn(List<String> values) {
            addCriterion("EMPID not in", values, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidBetween(String value1, String value2) {
            addCriterion("EMPID between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andEmpidNotBetween(String value1, String value2) {
            addCriterion("EMPID not between", value1, value2, "empid");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNull() {
            addCriterion("PLANID is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("PLANID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Integer value) {
            addCriterion("PLANID =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Integer value) {
            addCriterion("PLANID <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Integer value) {
            addCriterion("PLANID >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLANID >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Integer value) {
            addCriterion("PLANID <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("PLANID <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Integer> values) {
            addCriterion("PLANID in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Integer> values) {
            addCriterion("PLANID not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Integer value1, Integer value2) {
            addCriterion("PLANID between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("PLANID not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidIsNull() {
            addCriterion("QNTEMPLATEID is null");
            return (Criteria) this;
        }

        public Criteria andQntemplateidIsNotNull() {
            addCriterion("QNTEMPLATEID is not null");
            return (Criteria) this;
        }

        public Criteria andQntemplateidEqualTo(String value) {
            addCriterion("QNTEMPLATEID =", value, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidNotEqualTo(String value) {
            addCriterion("QNTEMPLATEID <>", value, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidGreaterThan(String value) {
            addCriterion("QNTEMPLATEID >", value, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidGreaterThanOrEqualTo(String value) {
            addCriterion("QNTEMPLATEID >=", value, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidLessThan(String value) {
            addCriterion("QNTEMPLATEID <", value, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidLessThanOrEqualTo(String value) {
            addCriterion("QNTEMPLATEID <=", value, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidLike(String value) {
            addCriterion("QNTEMPLATEID like", value, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidNotLike(String value) {
            addCriterion("QNTEMPLATEID not like", value, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidIn(List<String> values) {
            addCriterion("QNTEMPLATEID in", values, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidNotIn(List<String> values) {
            addCriterion("QNTEMPLATEID not in", values, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidBetween(String value1, String value2) {
            addCriterion("QNTEMPLATEID between", value1, value2, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQntemplateidNotBetween(String value1, String value2) {
            addCriterion("QNTEMPLATEID not between", value1, value2, "qntemplateid");
            return (Criteria) this;
        }

        public Criteria andQidIsNull() {
            addCriterion("QID is null");
            return (Criteria) this;
        }

        public Criteria andQidIsNotNull() {
            addCriterion("QID is not null");
            return (Criteria) this;
        }

        public Criteria andQidEqualTo(String value) {
            addCriterion("QID =", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotEqualTo(String value) {
            addCriterion("QID <>", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThan(String value) {
            addCriterion("QID >", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidGreaterThanOrEqualTo(String value) {
            addCriterion("QID >=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThan(String value) {
            addCriterion("QID <", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLessThanOrEqualTo(String value) {
            addCriterion("QID <=", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidLike(String value) {
            addCriterion("QID like", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotLike(String value) {
            addCriterion("QID not like", value, "qid");
            return (Criteria) this;
        }

        public Criteria andQidIn(List<String> values) {
            addCriterion("QID in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotIn(List<String> values) {
            addCriterion("QID not in", values, "qid");
            return (Criteria) this;
        }

        public Criteria andQidBetween(String value1, String value2) {
            addCriterion("QID between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andQidNotBetween(String value1, String value2) {
            addCriterion("QID not between", value1, value2, "qid");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("ANSWER =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("ANSWER <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("ANSWER >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("ANSWER >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("ANSWER <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("ANSWER <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("ANSWER like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("ANSWER not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("ANSWER in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("ANSWER not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("ANSWER between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("ANSWER not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andIsanswerIsNull() {
            addCriterion("ISANSWER is null");
            return (Criteria) this;
        }

        public Criteria andIsanswerIsNotNull() {
            addCriterion("ISANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andIsanswerEqualTo(String value) {
            addCriterion("ISANSWER =", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerNotEqualTo(String value) {
            addCriterion("ISANSWER <>", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerGreaterThan(String value) {
            addCriterion("ISANSWER >", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerGreaterThanOrEqualTo(String value) {
            addCriterion("ISANSWER >=", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerLessThan(String value) {
            addCriterion("ISANSWER <", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerLessThanOrEqualTo(String value) {
            addCriterion("ISANSWER <=", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerLike(String value) {
            addCriterion("ISANSWER like", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerNotLike(String value) {
            addCriterion("ISANSWER not like", value, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerIn(List<String> values) {
            addCriterion("ISANSWER in", values, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerNotIn(List<String> values) {
            addCriterion("ISANSWER not in", values, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerBetween(String value1, String value2) {
            addCriterion("ISANSWER between", value1, value2, "isanswer");
            return (Criteria) this;
        }

        public Criteria andIsanswerNotBetween(String value1, String value2) {
            addCriterion("ISANSWER not between", value1, value2, "isanswer");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andScoremanIsNull() {
            addCriterion("SCOREMAN is null");
            return (Criteria) this;
        }

        public Criteria andScoremanIsNotNull() {
            addCriterion("SCOREMAN is not null");
            return (Criteria) this;
        }

        public Criteria andScoremanEqualTo(String value) {
            addCriterion("SCOREMAN =", value, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanNotEqualTo(String value) {
            addCriterion("SCOREMAN <>", value, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanGreaterThan(String value) {
            addCriterion("SCOREMAN >", value, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanGreaterThanOrEqualTo(String value) {
            addCriterion("SCOREMAN >=", value, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanLessThan(String value) {
            addCriterion("SCOREMAN <", value, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanLessThanOrEqualTo(String value) {
            addCriterion("SCOREMAN <=", value, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanLike(String value) {
            addCriterion("SCOREMAN like", value, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanNotLike(String value) {
            addCriterion("SCOREMAN not like", value, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanIn(List<String> values) {
            addCriterion("SCOREMAN in", values, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanNotIn(List<String> values) {
            addCriterion("SCOREMAN not in", values, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanBetween(String value1, String value2) {
            addCriterion("SCOREMAN between", value1, value2, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoremanNotBetween(String value1, String value2) {
            addCriterion("SCOREMAN not between", value1, value2, "scoreman");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andXorderIsNull() {
            addCriterion("XORDER is null");
            return (Criteria) this;
        }

        public Criteria andXorderIsNotNull() {
            addCriterion("XORDER is not null");
            return (Criteria) this;
        }

        public Criteria andXorderEqualTo(Integer value) {
            addCriterion("XORDER =", value, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderNotEqualTo(Integer value) {
            addCriterion("XORDER <>", value, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderGreaterThan(Integer value) {
            addCriterion("XORDER >", value, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("XORDER >=", value, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderLessThan(Integer value) {
            addCriterion("XORDER <", value, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderLessThanOrEqualTo(Integer value) {
            addCriterion("XORDER <=", value, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderIn(List<Integer> values) {
            addCriterion("XORDER in", values, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderNotIn(List<Integer> values) {
            addCriterion("XORDER not in", values, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderBetween(Integer value1, Integer value2) {
            addCriterion("XORDER between", value1, value2, "xorder");
            return (Criteria) this;
        }

        public Criteria andXorderNotBetween(Integer value1, Integer value2) {
            addCriterion("XORDER not between", value1, value2, "xorder");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRegbyIsNull() {
            addCriterion("REGBY is null");
            return (Criteria) this;
        }

        public Criteria andRegbyIsNotNull() {
            addCriterion("REGBY is not null");
            return (Criteria) this;
        }

        public Criteria andRegbyEqualTo(String value) {
            addCriterion("REGBY =", value, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyNotEqualTo(String value) {
            addCriterion("REGBY <>", value, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyGreaterThan(String value) {
            addCriterion("REGBY >", value, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyGreaterThanOrEqualTo(String value) {
            addCriterion("REGBY >=", value, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyLessThan(String value) {
            addCriterion("REGBY <", value, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyLessThanOrEqualTo(String value) {
            addCriterion("REGBY <=", value, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyLike(String value) {
            addCriterion("REGBY like", value, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyNotLike(String value) {
            addCriterion("REGBY not like", value, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyIn(List<String> values) {
            addCriterion("REGBY in", values, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyNotIn(List<String> values) {
            addCriterion("REGBY not in", values, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyBetween(String value1, String value2) {
            addCriterion("REGBY between", value1, value2, "regby");
            return (Criteria) this;
        }

        public Criteria andRegbyNotBetween(String value1, String value2) {
            addCriterion("REGBY not between", value1, value2, "regby");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("REGTIME is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("REGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Date value) {
            addCriterion("REGTIME =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Date value) {
            addCriterion("REGTIME <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Date value) {
            addCriterion("REGTIME >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGTIME >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Date value) {
            addCriterion("REGTIME <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Date value) {
            addCriterion("REGTIME <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Date> values) {
            addCriterion("REGTIME in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Date> values) {
            addCriterion("REGTIME not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Date value1, Date value2) {
            addCriterion("REGTIME between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Date value1, Date value2) {
            addCriterion("REGTIME not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNull() {
            addCriterion("XTYPE is null");
            return (Criteria) this;
        }

        public Criteria andXtypeIsNotNull() {
            addCriterion("XTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andXtypeEqualTo(Integer value) {
            addCriterion("XTYPE =", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotEqualTo(Integer value) {
            addCriterion("XTYPE <>", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThan(Integer value) {
            addCriterion("XTYPE >", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("XTYPE >=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThan(Integer value) {
            addCriterion("XTYPE <", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeLessThanOrEqualTo(Integer value) {
            addCriterion("XTYPE <=", value, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeIn(List<Integer> values) {
            addCriterion("XTYPE in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotIn(List<Integer> values) {
            addCriterion("XTYPE not in", values, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeBetween(Integer value1, Integer value2) {
            addCriterion("XTYPE between", value1, value2, "xtype");
            return (Criteria) this;
        }

        public Criteria andXtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("XTYPE not between", value1, value2, "xtype");
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