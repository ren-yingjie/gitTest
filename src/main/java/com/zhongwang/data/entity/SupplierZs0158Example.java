package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierZs0158Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierZs0158Example() {
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

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andCourtIsNull() {
            addCriterion("court is null");
            return (Criteria) this;
        }

        public Criteria andCourtIsNotNull() {
            addCriterion("court is not null");
            return (Criteria) this;
        }

        public Criteria andCourtEqualTo(String value) {
            addCriterion("court =", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotEqualTo(String value) {
            addCriterion("court <>", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtGreaterThan(String value) {
            addCriterion("court >", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtGreaterThanOrEqualTo(String value) {
            addCriterion("court >=", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLessThan(String value) {
            addCriterion("court <", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLessThanOrEqualTo(String value) {
            addCriterion("court <=", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtLike(String value) {
            addCriterion("court like", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotLike(String value) {
            addCriterion("court not like", value, "court");
            return (Criteria) this;
        }

        public Criteria andCourtIn(List<String> values) {
            addCriterion("court in", values, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotIn(List<String> values) {
            addCriterion("court not in", values, "court");
            return (Criteria) this;
        }

        public Criteria andCourtBetween(String value1, String value2) {
            addCriterion("court between", value1, value2, "court");
            return (Criteria) this;
        }

        public Criteria andCourtNotBetween(String value1, String value2) {
            addCriterion("court not between", value1, value2, "court");
            return (Criteria) this;
        }

        public Criteria andSearchtypeIsNull() {
            addCriterion("searchType is null");
            return (Criteria) this;
        }

        public Criteria andSearchtypeIsNotNull() {
            addCriterion("searchType is not null");
            return (Criteria) this;
        }

        public Criteria andSearchtypeEqualTo(String value) {
            addCriterion("searchType =", value, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeNotEqualTo(String value) {
            addCriterion("searchType <>", value, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeGreaterThan(String value) {
            addCriterion("searchType >", value, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeGreaterThanOrEqualTo(String value) {
            addCriterion("searchType >=", value, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeLessThan(String value) {
            addCriterion("searchType <", value, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeLessThanOrEqualTo(String value) {
            addCriterion("searchType <=", value, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeLike(String value) {
            addCriterion("searchType like", value, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeNotLike(String value) {
            addCriterion("searchType not like", value, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeIn(List<String> values) {
            addCriterion("searchType in", values, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeNotIn(List<String> values) {
            addCriterion("searchType not in", values, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeBetween(String value1, String value2) {
            addCriterion("searchType between", value1, value2, "searchtype");
            return (Criteria) this;
        }

        public Criteria andSearchtypeNotBetween(String value1, String value2) {
            addCriterion("searchType not between", value1, value2, "searchtype");
            return (Criteria) this;
        }

        public Criteria andCasereasonIsNull() {
            addCriterion("casereason is null");
            return (Criteria) this;
        }

        public Criteria andCasereasonIsNotNull() {
            addCriterion("casereason is not null");
            return (Criteria) this;
        }

        public Criteria andCasereasonEqualTo(String value) {
            addCriterion("casereason =", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonNotEqualTo(String value) {
            addCriterion("casereason <>", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonGreaterThan(String value) {
            addCriterion("casereason >", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonGreaterThanOrEqualTo(String value) {
            addCriterion("casereason >=", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonLessThan(String value) {
            addCriterion("casereason <", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonLessThanOrEqualTo(String value) {
            addCriterion("casereason <=", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonLike(String value) {
            addCriterion("casereason like", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonNotLike(String value) {
            addCriterion("casereason not like", value, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonIn(List<String> values) {
            addCriterion("casereason in", values, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonNotIn(List<String> values) {
            addCriterion("casereason not in", values, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonBetween(String value1, String value2) {
            addCriterion("casereason between", value1, value2, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasereasonNotBetween(String value1, String value2) {
            addCriterion("casereason not between", value1, value2, "casereason");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNull() {
            addCriterion("caseno is null");
            return (Criteria) this;
        }

        public Criteria andCasenoIsNotNull() {
            addCriterion("caseno is not null");
            return (Criteria) this;
        }

        public Criteria andCasenoEqualTo(String value) {
            addCriterion("caseno =", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotEqualTo(String value) {
            addCriterion("caseno <>", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThan(String value) {
            addCriterion("caseno >", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoGreaterThanOrEqualTo(String value) {
            addCriterion("caseno >=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThan(String value) {
            addCriterion("caseno <", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLessThanOrEqualTo(String value) {
            addCriterion("caseno <=", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoLike(String value) {
            addCriterion("caseno like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotLike(String value) {
            addCriterion("caseno not like", value, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoIn(List<String> values) {
            addCriterion("caseno in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotIn(List<String> values) {
            addCriterion("caseno not in", values, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoBetween(String value1, String value2) {
            addCriterion("caseno between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andCasenoNotBetween(String value1, String value2) {
            addCriterion("caseno not between", value1, value2, "caseno");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("_type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("_type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("_type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("_type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("_type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("_type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("_type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("_type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("_type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("_type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("_type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("_type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("_type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("_type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDyidIsNull() {
            addCriterion("dyid is null");
            return (Criteria) this;
        }

        public Criteria andDyidIsNotNull() {
            addCriterion("dyid is not null");
            return (Criteria) this;
        }

        public Criteria andDyidEqualTo(String value) {
            addCriterion("dyid =", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidNotEqualTo(String value) {
            addCriterion("dyid <>", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidGreaterThan(String value) {
            addCriterion("dyid >", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidGreaterThanOrEqualTo(String value) {
            addCriterion("dyid >=", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidLessThan(String value) {
            addCriterion("dyid <", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidLessThanOrEqualTo(String value) {
            addCriterion("dyid <=", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidLike(String value) {
            addCriterion("dyid like", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidNotLike(String value) {
            addCriterion("dyid not like", value, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidIn(List<String> values) {
            addCriterion("dyid in", values, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidNotIn(List<String> values) {
            addCriterion("dyid not in", values, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidBetween(String value1, String value2) {
            addCriterion("dyid between", value1, value2, "dyid");
            return (Criteria) this;
        }

        public Criteria andDyidNotBetween(String value1, String value2) {
            addCriterion("dyid not between", value1, value2, "dyid");
            return (Criteria) this;
        }

        public Criteria andDocidIsNull() {
            addCriterion("docid is null");
            return (Criteria) this;
        }

        public Criteria andDocidIsNotNull() {
            addCriterion("docid is not null");
            return (Criteria) this;
        }

        public Criteria andDocidEqualTo(String value) {
            addCriterion("docid =", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotEqualTo(String value) {
            addCriterion("docid <>", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThan(String value) {
            addCriterion("docid >", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThanOrEqualTo(String value) {
            addCriterion("docid >=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThan(String value) {
            addCriterion("docid <", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThanOrEqualTo(String value) {
            addCriterion("docid <=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLike(String value) {
            addCriterion("docid like", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotLike(String value) {
            addCriterion("docid not like", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidIn(List<String> values) {
            addCriterion("docid in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotIn(List<String> values) {
            addCriterion("docid not in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidBetween(String value1, String value2) {
            addCriterion("docid between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotBetween(String value1, String value2) {
            addCriterion("docid not between", value1, value2, "docid");
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

        public Criteria andAppelleeidIsNull() {
            addCriterion("appelleeId is null");
            return (Criteria) this;
        }

        public Criteria andAppelleeidIsNotNull() {
            addCriterion("appelleeId is not null");
            return (Criteria) this;
        }

        public Criteria andAppelleeidEqualTo(String value) {
            addCriterion("appelleeId =", value, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidNotEqualTo(String value) {
            addCriterion("appelleeId <>", value, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidGreaterThan(String value) {
            addCriterion("appelleeId >", value, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidGreaterThanOrEqualTo(String value) {
            addCriterion("appelleeId >=", value, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidLessThan(String value) {
            addCriterion("appelleeId <", value, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidLessThanOrEqualTo(String value) {
            addCriterion("appelleeId <=", value, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidLike(String value) {
            addCriterion("appelleeId like", value, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidNotLike(String value) {
            addCriterion("appelleeId not like", value, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidIn(List<String> values) {
            addCriterion("appelleeId in", values, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidNotIn(List<String> values) {
            addCriterion("appelleeId not in", values, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidBetween(String value1, String value2) {
            addCriterion("appelleeId between", value1, value2, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAppelleeidNotBetween(String value1, String value2) {
            addCriterion("appelleeId not between", value1, value2, "appelleeid");
            return (Criteria) this;
        }

        public Criteria andAbstractsIsNull() {
            addCriterion("abstracts is null");
            return (Criteria) this;
        }

        public Criteria andAbstractsIsNotNull() {
            addCriterion("abstracts is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractsEqualTo(String value) {
            addCriterion("abstracts =", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsNotEqualTo(String value) {
            addCriterion("abstracts <>", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsGreaterThan(String value) {
            addCriterion("abstracts >", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsGreaterThanOrEqualTo(String value) {
            addCriterion("abstracts >=", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsLessThan(String value) {
            addCriterion("abstracts <", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsLessThanOrEqualTo(String value) {
            addCriterion("abstracts <=", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsLike(String value) {
            addCriterion("abstracts like", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsNotLike(String value) {
            addCriterion("abstracts not like", value, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsIn(List<String> values) {
            addCriterion("abstracts in", values, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsNotIn(List<String> values) {
            addCriterion("abstracts not in", values, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsBetween(String value1, String value2) {
            addCriterion("abstracts between", value1, value2, "abstracts");
            return (Criteria) this;
        }

        public Criteria andAbstractsNotBetween(String value1, String value2) {
            addCriterion("abstracts not between", value1, value2, "abstracts");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNull() {
            addCriterion("submittime is null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIsNotNull() {
            addCriterion("submittime is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittimeEqualTo(String value) {
            addCriterion("submittime =", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotEqualTo(String value) {
            addCriterion("submittime <>", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThan(String value) {
            addCriterion("submittime >", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeGreaterThanOrEqualTo(String value) {
            addCriterion("submittime >=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThan(String value) {
            addCriterion("submittime <", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLessThanOrEqualTo(String value) {
            addCriterion("submittime <=", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeLike(String value) {
            addCriterion("submittime like", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotLike(String value) {
            addCriterion("submittime not like", value, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeIn(List<String> values) {
            addCriterion("submittime in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotIn(List<String> values) {
            addCriterion("submittime not in", values, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeBetween(String value1, String value2) {
            addCriterion("submittime between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andSubmittimeNotBetween(String value1, String value2) {
            addCriterion("submittime not between", value1, value2, "submittime");
            return (Criteria) this;
        }

        public Criteria andDefendantidIsNull() {
            addCriterion("defendantId is null");
            return (Criteria) this;
        }

        public Criteria andDefendantidIsNotNull() {
            addCriterion("defendantId is not null");
            return (Criteria) this;
        }

        public Criteria andDefendantidEqualTo(String value) {
            addCriterion("defendantId =", value, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidNotEqualTo(String value) {
            addCriterion("defendantId <>", value, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidGreaterThan(String value) {
            addCriterion("defendantId >", value, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidGreaterThanOrEqualTo(String value) {
            addCriterion("defendantId >=", value, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidLessThan(String value) {
            addCriterion("defendantId <", value, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidLessThanOrEqualTo(String value) {
            addCriterion("defendantId <=", value, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidLike(String value) {
            addCriterion("defendantId like", value, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidNotLike(String value) {
            addCriterion("defendantId not like", value, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidIn(List<String> values) {
            addCriterion("defendantId in", values, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidNotIn(List<String> values) {
            addCriterion("defendantId not in", values, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidBetween(String value1, String value2) {
            addCriterion("defendantId between", value1, value2, "defendantid");
            return (Criteria) this;
        }

        public Criteria andDefendantidNotBetween(String value1, String value2) {
            addCriterion("defendantId not between", value1, value2, "defendantid");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNull() {
            addCriterion("casetype is null");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNotNull() {
            addCriterion("casetype is not null");
            return (Criteria) this;
        }

        public Criteria andCasetypeEqualTo(String value) {
            addCriterion("casetype =", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotEqualTo(String value) {
            addCriterion("casetype <>", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThan(String value) {
            addCriterion("casetype >", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("casetype >=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThan(String value) {
            addCriterion("casetype <", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThanOrEqualTo(String value) {
            addCriterion("casetype <=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLike(String value) {
            addCriterion("casetype like", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotLike(String value) {
            addCriterion("casetype not like", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeIn(List<String> values) {
            addCriterion("casetype in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotIn(List<String> values) {
            addCriterion("casetype not in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeBetween(String value1, String value2) {
            addCriterion("casetype between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotBetween(String value1, String value2) {
            addCriterion("casetype not between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andAppellantidIsNull() {
            addCriterion("appellantId is null");
            return (Criteria) this;
        }

        public Criteria andAppellantidIsNotNull() {
            addCriterion("appellantId is not null");
            return (Criteria) this;
        }

        public Criteria andAppellantidEqualTo(String value) {
            addCriterion("appellantId =", value, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidNotEqualTo(String value) {
            addCriterion("appellantId <>", value, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidGreaterThan(String value) {
            addCriterion("appellantId >", value, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidGreaterThanOrEqualTo(String value) {
            addCriterion("appellantId >=", value, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidLessThan(String value) {
            addCriterion("appellantId <", value, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidLessThanOrEqualTo(String value) {
            addCriterion("appellantId <=", value, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidLike(String value) {
            addCriterion("appellantId like", value, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidNotLike(String value) {
            addCriterion("appellantId not like", value, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidIn(List<String> values) {
            addCriterion("appellantId in", values, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidNotIn(List<String> values) {
            addCriterion("appellantId not in", values, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidBetween(String value1, String value2) {
            addCriterion("appellantId between", value1, value2, "appellantid");
            return (Criteria) this;
        }

        public Criteria andAppellantidNotBetween(String value1, String value2) {
            addCriterion("appellantId not between", value1, value2, "appellantid");
            return (Criteria) this;
        }

        public Criteria andEventtimeIsNull() {
            addCriterion("eventTime is null");
            return (Criteria) this;
        }

        public Criteria andEventtimeIsNotNull() {
            addCriterion("eventTime is not null");
            return (Criteria) this;
        }

        public Criteria andEventtimeEqualTo(String value) {
            addCriterion("eventTime =", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotEqualTo(String value) {
            addCriterion("eventTime <>", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeGreaterThan(String value) {
            addCriterion("eventTime >", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeGreaterThanOrEqualTo(String value) {
            addCriterion("eventTime >=", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLessThan(String value) {
            addCriterion("eventTime <", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLessThanOrEqualTo(String value) {
            addCriterion("eventTime <=", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeLike(String value) {
            addCriterion("eventTime like", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotLike(String value) {
            addCriterion("eventTime not like", value, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeIn(List<String> values) {
            addCriterion("eventTime in", values, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotIn(List<String> values) {
            addCriterion("eventTime not in", values, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeBetween(String value1, String value2) {
            addCriterion("eventTime between", value1, value2, "eventtime");
            return (Criteria) this;
        }

        public Criteria andEventtimeNotBetween(String value1, String value2) {
            addCriterion("eventTime not between", value1, value2, "eventtime");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNull() {
            addCriterion("doctype is null");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNotNull() {
            addCriterion("doctype is not null");
            return (Criteria) this;
        }

        public Criteria andDoctypeEqualTo(String value) {
            addCriterion("doctype =", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotEqualTo(String value) {
            addCriterion("doctype <>", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThan(String value) {
            addCriterion("doctype >", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThanOrEqualTo(String value) {
            addCriterion("doctype >=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThan(String value) {
            addCriterion("doctype <", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThanOrEqualTo(String value) {
            addCriterion("doctype <=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLike(String value) {
            addCriterion("doctype like", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotLike(String value) {
            addCriterion("doctype not like", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeIn(List<String> values) {
            addCriterion("doctype in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotIn(List<String> values) {
            addCriterion("doctype not in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeBetween(String value1, String value2) {
            addCriterion("doctype between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotBetween(String value1, String value2) {
            addCriterion("doctype not between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("agent like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("agent not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesIsNull() {
            addCriterion("thirdParties is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesIsNotNull() {
            addCriterion("thirdParties is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesEqualTo(String value) {
            addCriterion("thirdParties =", value, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesNotEqualTo(String value) {
            addCriterion("thirdParties <>", value, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesGreaterThan(String value) {
            addCriterion("thirdParties >", value, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesGreaterThanOrEqualTo(String value) {
            addCriterion("thirdParties >=", value, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesLessThan(String value) {
            addCriterion("thirdParties <", value, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesLessThanOrEqualTo(String value) {
            addCriterion("thirdParties <=", value, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesLike(String value) {
            addCriterion("thirdParties like", value, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesNotLike(String value) {
            addCriterion("thirdParties not like", value, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesIn(List<String> values) {
            addCriterion("thirdParties in", values, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesNotIn(List<String> values) {
            addCriterion("thirdParties not in", values, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesBetween(String value1, String value2) {
            addCriterion("thirdParties between", value1, value2, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andThirdpartiesNotBetween(String value1, String value2) {
            addCriterion("thirdParties not between", value1, value2, "thirdparties");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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