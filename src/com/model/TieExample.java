package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TieExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public TieExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
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

        public Criteria andTieIdIsNull() {
            addCriterion("tie_id is null");
            return (Criteria) this;
        }

        public Criteria andTieIdIsNotNull() {
            addCriterion("tie_id is not null");
            return (Criteria) this;
        }

        public Criteria andTieIdEqualTo(Integer value) {
            addCriterion("tie_id =", value, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdNotEqualTo(Integer value) {
            addCriterion("tie_id <>", value, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdGreaterThan(Integer value) {
            addCriterion("tie_id >", value, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tie_id >=", value, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdLessThan(Integer value) {
            addCriterion("tie_id <", value, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdLessThanOrEqualTo(Integer value) {
            addCriterion("tie_id <=", value, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdIn(List<Integer> values) {
            addCriterion("tie_id in", values, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdNotIn(List<Integer> values) {
            addCriterion("tie_id not in", values, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdBetween(Integer value1, Integer value2) {
            addCriterion("tie_id between", value1, value2, "tieId");
            return (Criteria) this;
        }

        public Criteria andTieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tie_id not between", value1, value2, "tieId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdIsNull() {
            addCriterion("leibie_id is null");
            return (Criteria) this;
        }

        public Criteria andLeibieIdIsNotNull() {
            addCriterion("leibie_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeibieIdEqualTo(Integer value) {
            addCriterion("leibie_id =", value, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdNotEqualTo(Integer value) {
            addCriterion("leibie_id <>", value, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdGreaterThan(Integer value) {
            addCriterion("leibie_id >", value, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("leibie_id >=", value, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdLessThan(Integer value) {
            addCriterion("leibie_id <", value, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdLessThanOrEqualTo(Integer value) {
            addCriterion("leibie_id <=", value, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdIn(List<Integer> values) {
            addCriterion("leibie_id in", values, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdNotIn(List<Integer> values) {
            addCriterion("leibie_id not in", values, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdBetween(Integer value1, Integer value2) {
            addCriterion("leibie_id between", value1, value2, "leibieId");
            return (Criteria) this;
        }

        public Criteria andLeibieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("leibie_id not between", value1, value2, "leibieId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andGuanjianziIsNull() {
            addCriterion("guanjianzi is null");
            return (Criteria) this;
        }

        public Criteria andGuanjianziIsNotNull() {
            addCriterion("guanjianzi is not null");
            return (Criteria) this;
        }

        public Criteria andGuanjianziEqualTo(String value) {
            addCriterion("guanjianzi =", value, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziNotEqualTo(String value) {
            addCriterion("guanjianzi <>", value, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziGreaterThan(String value) {
            addCriterion("guanjianzi >", value, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziGreaterThanOrEqualTo(String value) {
            addCriterion("guanjianzi >=", value, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziLessThan(String value) {
            addCriterion("guanjianzi <", value, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziLessThanOrEqualTo(String value) {
            addCriterion("guanjianzi <=", value, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziLike(String value) {
            addCriterion("guanjianzi like", value, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziNotLike(String value) {
            addCriterion("guanjianzi not like", value, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziIn(List<String> values) {
            addCriterion("guanjianzi in", values, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziNotIn(List<String> values) {
            addCriterion("guanjianzi not in", values, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziBetween(String value1, String value2) {
            addCriterion("guanjianzi between", value1, value2, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andGuanjianziNotBetween(String value1, String value2) {
            addCriterion("guanjianzi not between", value1, value2, "guanjianzi");
            return (Criteria) this;
        }

        public Criteria andLiulanIsNull() {
            addCriterion("liulan is null");
            return (Criteria) this;
        }

        public Criteria andLiulanIsNotNull() {
            addCriterion("liulan is not null");
            return (Criteria) this;
        }

        public Criteria andLiulanEqualTo(Integer value) {
            addCriterion("liulan =", value, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanNotEqualTo(Integer value) {
            addCriterion("liulan <>", value, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanGreaterThan(Integer value) {
            addCriterion("liulan >", value, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanGreaterThanOrEqualTo(Integer value) {
            addCriterion("liulan >=", value, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanLessThan(Integer value) {
            addCriterion("liulan <", value, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanLessThanOrEqualTo(Integer value) {
            addCriterion("liulan <=", value, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanIn(List<Integer> values) {
            addCriterion("liulan in", values, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanNotIn(List<Integer> values) {
            addCriterion("liulan not in", values, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanBetween(Integer value1, Integer value2) {
            addCriterion("liulan between", value1, value2, "liulan");
            return (Criteria) this;
        }

        public Criteria andLiulanNotBetween(Integer value1, Integer value2) {
            addCriterion("liulan not between", value1, value2, "liulan");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDengjiIsNull() {
            addCriterion("dengji is null");
            return (Criteria) this;
        }

        public Criteria andDengjiIsNotNull() {
            addCriterion("dengji is not null");
            return (Criteria) this;
        }

        public Criteria andDengjiEqualTo(Integer value) {
            addCriterion("dengji =", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiNotEqualTo(Integer value) {
            addCriterion("dengji <>", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiGreaterThan(Integer value) {
            addCriterion("dengji >", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("dengji >=", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiLessThan(Integer value) {
            addCriterion("dengji <", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiLessThanOrEqualTo(Integer value) {
            addCriterion("dengji <=", value, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiIn(List<Integer> values) {
            addCriterion("dengji in", values, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiNotIn(List<Integer> values) {
            addCriterion("dengji not in", values, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiBetween(Integer value1, Integer value2) {
            addCriterion("dengji between", value1, value2, "dengji");
            return (Criteria) this;
        }

        public Criteria andDengjiNotBetween(Integer value1, Integer value2) {
            addCriterion("dengji not between", value1, value2, "dengji");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tie
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 22 15:44:56 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tie
     *
     * @mbggenerated Thu Jun 22 15:44:56 CST 2017
     */
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