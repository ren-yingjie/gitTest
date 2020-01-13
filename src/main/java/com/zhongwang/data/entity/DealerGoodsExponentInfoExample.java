package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DealerGoodsExponentInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealerGoodsExponentInfoExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeIsNull() {
            addCriterion("dealer_index_type is null");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeIsNotNull() {
            addCriterion("dealer_index_type is not null");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeEqualTo(String value) {
            addCriterion("dealer_index_type =", value, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeNotEqualTo(String value) {
            addCriterion("dealer_index_type <>", value, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeGreaterThan(String value) {
            addCriterion("dealer_index_type >", value, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_index_type >=", value, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeLessThan(String value) {
            addCriterion("dealer_index_type <", value, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeLessThanOrEqualTo(String value) {
            addCriterion("dealer_index_type <=", value, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeLike(String value) {
            addCriterion("dealer_index_type like", value, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeNotLike(String value) {
            addCriterion("dealer_index_type not like", value, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeIn(List<String> values) {
            addCriterion("dealer_index_type in", values, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeNotIn(List<String> values) {
            addCriterion("dealer_index_type not in", values, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeBetween(String value1, String value2) {
            addCriterion("dealer_index_type between", value1, value2, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andDealerIndexTypeNotBetween(String value1, String value2) {
            addCriterion("dealer_index_type not between", value1, value2, "dealerIndexType");
            return (Criteria) this;
        }

        public Criteria andMonth1IsNull() {
            addCriterion("month1 is null");
            return (Criteria) this;
        }

        public Criteria andMonth1IsNotNull() {
            addCriterion("month1 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth1EqualTo(String value) {
            addCriterion("month1 =", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1NotEqualTo(String value) {
            addCriterion("month1 <>", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1GreaterThan(String value) {
            addCriterion("month1 >", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1GreaterThanOrEqualTo(String value) {
            addCriterion("month1 >=", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1LessThan(String value) {
            addCriterion("month1 <", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1LessThanOrEqualTo(String value) {
            addCriterion("month1 <=", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1Like(String value) {
            addCriterion("month1 like", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1NotLike(String value) {
            addCriterion("month1 not like", value, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1In(List<String> values) {
            addCriterion("month1 in", values, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1NotIn(List<String> values) {
            addCriterion("month1 not in", values, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1Between(String value1, String value2) {
            addCriterion("month1 between", value1, value2, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth1NotBetween(String value1, String value2) {
            addCriterion("month1 not between", value1, value2, "month1");
            return (Criteria) this;
        }

        public Criteria andMonth2IsNull() {
            addCriterion("month2 is null");
            return (Criteria) this;
        }

        public Criteria andMonth2IsNotNull() {
            addCriterion("month2 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth2EqualTo(String value) {
            addCriterion("month2 =", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2NotEqualTo(String value) {
            addCriterion("month2 <>", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2GreaterThan(String value) {
            addCriterion("month2 >", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2GreaterThanOrEqualTo(String value) {
            addCriterion("month2 >=", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2LessThan(String value) {
            addCriterion("month2 <", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2LessThanOrEqualTo(String value) {
            addCriterion("month2 <=", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2Like(String value) {
            addCriterion("month2 like", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2NotLike(String value) {
            addCriterion("month2 not like", value, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2In(List<String> values) {
            addCriterion("month2 in", values, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2NotIn(List<String> values) {
            addCriterion("month2 not in", values, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2Between(String value1, String value2) {
            addCriterion("month2 between", value1, value2, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth2NotBetween(String value1, String value2) {
            addCriterion("month2 not between", value1, value2, "month2");
            return (Criteria) this;
        }

        public Criteria andMonth3IsNull() {
            addCriterion("month3 is null");
            return (Criteria) this;
        }

        public Criteria andMonth3IsNotNull() {
            addCriterion("month3 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth3EqualTo(String value) {
            addCriterion("month3 =", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3NotEqualTo(String value) {
            addCriterion("month3 <>", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3GreaterThan(String value) {
            addCriterion("month3 >", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3GreaterThanOrEqualTo(String value) {
            addCriterion("month3 >=", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3LessThan(String value) {
            addCriterion("month3 <", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3LessThanOrEqualTo(String value) {
            addCriterion("month3 <=", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3Like(String value) {
            addCriterion("month3 like", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3NotLike(String value) {
            addCriterion("month3 not like", value, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3In(List<String> values) {
            addCriterion("month3 in", values, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3NotIn(List<String> values) {
            addCriterion("month3 not in", values, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3Between(String value1, String value2) {
            addCriterion("month3 between", value1, value2, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth3NotBetween(String value1, String value2) {
            addCriterion("month3 not between", value1, value2, "month3");
            return (Criteria) this;
        }

        public Criteria andMonth4IsNull() {
            addCriterion("month4 is null");
            return (Criteria) this;
        }

        public Criteria andMonth4IsNotNull() {
            addCriterion("month4 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth4EqualTo(String value) {
            addCriterion("month4 =", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4NotEqualTo(String value) {
            addCriterion("month4 <>", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4GreaterThan(String value) {
            addCriterion("month4 >", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4GreaterThanOrEqualTo(String value) {
            addCriterion("month4 >=", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4LessThan(String value) {
            addCriterion("month4 <", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4LessThanOrEqualTo(String value) {
            addCriterion("month4 <=", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4Like(String value) {
            addCriterion("month4 like", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4NotLike(String value) {
            addCriterion("month4 not like", value, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4In(List<String> values) {
            addCriterion("month4 in", values, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4NotIn(List<String> values) {
            addCriterion("month4 not in", values, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4Between(String value1, String value2) {
            addCriterion("month4 between", value1, value2, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth4NotBetween(String value1, String value2) {
            addCriterion("month4 not between", value1, value2, "month4");
            return (Criteria) this;
        }

        public Criteria andMonth5IsNull() {
            addCriterion("month5 is null");
            return (Criteria) this;
        }

        public Criteria andMonth5IsNotNull() {
            addCriterion("month5 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth5EqualTo(String value) {
            addCriterion("month5 =", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5NotEqualTo(String value) {
            addCriterion("month5 <>", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5GreaterThan(String value) {
            addCriterion("month5 >", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5GreaterThanOrEqualTo(String value) {
            addCriterion("month5 >=", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5LessThan(String value) {
            addCriterion("month5 <", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5LessThanOrEqualTo(String value) {
            addCriterion("month5 <=", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5Like(String value) {
            addCriterion("month5 like", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5NotLike(String value) {
            addCriterion("month5 not like", value, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5In(List<String> values) {
            addCriterion("month5 in", values, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5NotIn(List<String> values) {
            addCriterion("month5 not in", values, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5Between(String value1, String value2) {
            addCriterion("month5 between", value1, value2, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth5NotBetween(String value1, String value2) {
            addCriterion("month5 not between", value1, value2, "month5");
            return (Criteria) this;
        }

        public Criteria andMonth6IsNull() {
            addCriterion("month6 is null");
            return (Criteria) this;
        }

        public Criteria andMonth6IsNotNull() {
            addCriterion("month6 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth6EqualTo(String value) {
            addCriterion("month6 =", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6NotEqualTo(String value) {
            addCriterion("month6 <>", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6GreaterThan(String value) {
            addCriterion("month6 >", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6GreaterThanOrEqualTo(String value) {
            addCriterion("month6 >=", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6LessThan(String value) {
            addCriterion("month6 <", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6LessThanOrEqualTo(String value) {
            addCriterion("month6 <=", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6Like(String value) {
            addCriterion("month6 like", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6NotLike(String value) {
            addCriterion("month6 not like", value, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6In(List<String> values) {
            addCriterion("month6 in", values, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6NotIn(List<String> values) {
            addCriterion("month6 not in", values, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6Between(String value1, String value2) {
            addCriterion("month6 between", value1, value2, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth6NotBetween(String value1, String value2) {
            addCriterion("month6 not between", value1, value2, "month6");
            return (Criteria) this;
        }

        public Criteria andMonth7IsNull() {
            addCriterion("month7 is null");
            return (Criteria) this;
        }

        public Criteria andMonth7IsNotNull() {
            addCriterion("month7 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth7EqualTo(String value) {
            addCriterion("month7 =", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7NotEqualTo(String value) {
            addCriterion("month7 <>", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7GreaterThan(String value) {
            addCriterion("month7 >", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7GreaterThanOrEqualTo(String value) {
            addCriterion("month7 >=", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7LessThan(String value) {
            addCriterion("month7 <", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7LessThanOrEqualTo(String value) {
            addCriterion("month7 <=", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7Like(String value) {
            addCriterion("month7 like", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7NotLike(String value) {
            addCriterion("month7 not like", value, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7In(List<String> values) {
            addCriterion("month7 in", values, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7NotIn(List<String> values) {
            addCriterion("month7 not in", values, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7Between(String value1, String value2) {
            addCriterion("month7 between", value1, value2, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth7NotBetween(String value1, String value2) {
            addCriterion("month7 not between", value1, value2, "month7");
            return (Criteria) this;
        }

        public Criteria andMonth8IsNull() {
            addCriterion("month8 is null");
            return (Criteria) this;
        }

        public Criteria andMonth8IsNotNull() {
            addCriterion("month8 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth8EqualTo(String value) {
            addCriterion("month8 =", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8NotEqualTo(String value) {
            addCriterion("month8 <>", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8GreaterThan(String value) {
            addCriterion("month8 >", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8GreaterThanOrEqualTo(String value) {
            addCriterion("month8 >=", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8LessThan(String value) {
            addCriterion("month8 <", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8LessThanOrEqualTo(String value) {
            addCriterion("month8 <=", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8Like(String value) {
            addCriterion("month8 like", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8NotLike(String value) {
            addCriterion("month8 not like", value, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8In(List<String> values) {
            addCriterion("month8 in", values, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8NotIn(List<String> values) {
            addCriterion("month8 not in", values, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8Between(String value1, String value2) {
            addCriterion("month8 between", value1, value2, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth8NotBetween(String value1, String value2) {
            addCriterion("month8 not between", value1, value2, "month8");
            return (Criteria) this;
        }

        public Criteria andMonth9IsNull() {
            addCriterion("month9 is null");
            return (Criteria) this;
        }

        public Criteria andMonth9IsNotNull() {
            addCriterion("month9 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth9EqualTo(String value) {
            addCriterion("month9 =", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9NotEqualTo(String value) {
            addCriterion("month9 <>", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9GreaterThan(String value) {
            addCriterion("month9 >", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9GreaterThanOrEqualTo(String value) {
            addCriterion("month9 >=", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9LessThan(String value) {
            addCriterion("month9 <", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9LessThanOrEqualTo(String value) {
            addCriterion("month9 <=", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9Like(String value) {
            addCriterion("month9 like", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9NotLike(String value) {
            addCriterion("month9 not like", value, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9In(List<String> values) {
            addCriterion("month9 in", values, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9NotIn(List<String> values) {
            addCriterion("month9 not in", values, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9Between(String value1, String value2) {
            addCriterion("month9 between", value1, value2, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth9NotBetween(String value1, String value2) {
            addCriterion("month9 not between", value1, value2, "month9");
            return (Criteria) this;
        }

        public Criteria andMonth10IsNull() {
            addCriterion("month10 is null");
            return (Criteria) this;
        }

        public Criteria andMonth10IsNotNull() {
            addCriterion("month10 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth10EqualTo(String value) {
            addCriterion("month10 =", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10NotEqualTo(String value) {
            addCriterion("month10 <>", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10GreaterThan(String value) {
            addCriterion("month10 >", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10GreaterThanOrEqualTo(String value) {
            addCriterion("month10 >=", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10LessThan(String value) {
            addCriterion("month10 <", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10LessThanOrEqualTo(String value) {
            addCriterion("month10 <=", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10Like(String value) {
            addCriterion("month10 like", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10NotLike(String value) {
            addCriterion("month10 not like", value, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10In(List<String> values) {
            addCriterion("month10 in", values, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10NotIn(List<String> values) {
            addCriterion("month10 not in", values, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10Between(String value1, String value2) {
            addCriterion("month10 between", value1, value2, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth10NotBetween(String value1, String value2) {
            addCriterion("month10 not between", value1, value2, "month10");
            return (Criteria) this;
        }

        public Criteria andMonth11IsNull() {
            addCriterion("month11 is null");
            return (Criteria) this;
        }

        public Criteria andMonth11IsNotNull() {
            addCriterion("month11 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth11EqualTo(String value) {
            addCriterion("month11 =", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11NotEqualTo(String value) {
            addCriterion("month11 <>", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11GreaterThan(String value) {
            addCriterion("month11 >", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11GreaterThanOrEqualTo(String value) {
            addCriterion("month11 >=", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11LessThan(String value) {
            addCriterion("month11 <", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11LessThanOrEqualTo(String value) {
            addCriterion("month11 <=", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11Like(String value) {
            addCriterion("month11 like", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11NotLike(String value) {
            addCriterion("month11 not like", value, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11In(List<String> values) {
            addCriterion("month11 in", values, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11NotIn(List<String> values) {
            addCriterion("month11 not in", values, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11Between(String value1, String value2) {
            addCriterion("month11 between", value1, value2, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth11NotBetween(String value1, String value2) {
            addCriterion("month11 not between", value1, value2, "month11");
            return (Criteria) this;
        }

        public Criteria andMonth12IsNull() {
            addCriterion("month12 is null");
            return (Criteria) this;
        }

        public Criteria andMonth12IsNotNull() {
            addCriterion("month12 is not null");
            return (Criteria) this;
        }

        public Criteria andMonth12EqualTo(String value) {
            addCriterion("month12 =", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12NotEqualTo(String value) {
            addCriterion("month12 <>", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12GreaterThan(String value) {
            addCriterion("month12 >", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12GreaterThanOrEqualTo(String value) {
            addCriterion("month12 >=", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12LessThan(String value) {
            addCriterion("month12 <", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12LessThanOrEqualTo(String value) {
            addCriterion("month12 <=", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12Like(String value) {
            addCriterion("month12 like", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12NotLike(String value) {
            addCriterion("month12 not like", value, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12In(List<String> values) {
            addCriterion("month12 in", values, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12NotIn(List<String> values) {
            addCriterion("month12 not in", values, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12Between(String value1, String value2) {
            addCriterion("month12 between", value1, value2, "month12");
            return (Criteria) this;
        }

        public Criteria andMonth12NotBetween(String value1, String value2) {
            addCriterion("month12 not between", value1, value2, "month12");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeIsNull() {
            addCriterion("index_year_time is null");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeIsNotNull() {
            addCriterion("index_year_time is not null");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeEqualTo(String value) {
            addCriterion("index_year_time =", value, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeNotEqualTo(String value) {
            addCriterion("index_year_time <>", value, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeGreaterThan(String value) {
            addCriterion("index_year_time >", value, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeGreaterThanOrEqualTo(String value) {
            addCriterion("index_year_time >=", value, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeLessThan(String value) {
            addCriterion("index_year_time <", value, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeLessThanOrEqualTo(String value) {
            addCriterion("index_year_time <=", value, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeLike(String value) {
            addCriterion("index_year_time like", value, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeNotLike(String value) {
            addCriterion("index_year_time not like", value, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeIn(List<String> values) {
            addCriterion("index_year_time in", values, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeNotIn(List<String> values) {
            addCriterion("index_year_time not in", values, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeBetween(String value1, String value2) {
            addCriterion("index_year_time between", value1, value2, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andIndexYearTimeNotBetween(String value1, String value2) {
            addCriterion("index_year_time not between", value1, value2, "indexYearTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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