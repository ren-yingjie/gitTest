package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierZs0159Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierZs0159Example() {
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

        public Criteria andAnnounceIdIsNull() {
            addCriterion("announce_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdIsNotNull() {
            addCriterion("announce_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdEqualTo(Integer value) {
            addCriterion("announce_id =", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdNotEqualTo(Integer value) {
            addCriterion("announce_id <>", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdGreaterThan(Integer value) {
            addCriterion("announce_id >", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("announce_id >=", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdLessThan(Integer value) {
            addCriterion("announce_id <", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdLessThanOrEqualTo(Integer value) {
            addCriterion("announce_id <=", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdIn(List<Integer> values) {
            addCriterion("announce_id in", values, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdNotIn(List<Integer> values) {
            addCriterion("announce_id not in", values, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdBetween(Integer value1, Integer value2) {
            addCriterion("announce_id between", value1, value2, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("announce_id not between", value1, value2, "announceId");
            return (Criteria) this;
        }

        public Criteria andBltnnoIsNull() {
            addCriterion("bltnno is null");
            return (Criteria) this;
        }

        public Criteria andBltnnoIsNotNull() {
            addCriterion("bltnno is not null");
            return (Criteria) this;
        }

        public Criteria andBltnnoEqualTo(String value) {
            addCriterion("bltnno =", value, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoNotEqualTo(String value) {
            addCriterion("bltnno <>", value, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoGreaterThan(String value) {
            addCriterion("bltnno >", value, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoGreaterThanOrEqualTo(String value) {
            addCriterion("bltnno >=", value, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoLessThan(String value) {
            addCriterion("bltnno <", value, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoLessThanOrEqualTo(String value) {
            addCriterion("bltnno <=", value, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoLike(String value) {
            addCriterion("bltnno like", value, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoNotLike(String value) {
            addCriterion("bltnno not like", value, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoIn(List<String> values) {
            addCriterion("bltnno in", values, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoNotIn(List<String> values) {
            addCriterion("bltnno not in", values, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoBetween(String value1, String value2) {
            addCriterion("bltnno between", value1, value2, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnnoNotBetween(String value1, String value2) {
            addCriterion("bltnno not between", value1, value2, "bltnno");
            return (Criteria) this;
        }

        public Criteria andBltnstateIsNull() {
            addCriterion("bltnstate is null");
            return (Criteria) this;
        }

        public Criteria andBltnstateIsNotNull() {
            addCriterion("bltnstate is not null");
            return (Criteria) this;
        }

        public Criteria andBltnstateEqualTo(String value) {
            addCriterion("bltnstate =", value, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateNotEqualTo(String value) {
            addCriterion("bltnstate <>", value, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateGreaterThan(String value) {
            addCriterion("bltnstate >", value, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateGreaterThanOrEqualTo(String value) {
            addCriterion("bltnstate >=", value, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateLessThan(String value) {
            addCriterion("bltnstate <", value, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateLessThanOrEqualTo(String value) {
            addCriterion("bltnstate <=", value, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateLike(String value) {
            addCriterion("bltnstate like", value, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateNotLike(String value) {
            addCriterion("bltnstate not like", value, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateIn(List<String> values) {
            addCriterion("bltnstate in", values, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateNotIn(List<String> values) {
            addCriterion("bltnstate not in", values, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateBetween(String value1, String value2) {
            addCriterion("bltnstate between", value1, value2, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltnstateNotBetween(String value1, String value2) {
            addCriterion("bltnstate not between", value1, value2, "bltnstate");
            return (Criteria) this;
        }

        public Criteria andBltntypeIsNull() {
            addCriterion("bltntype is null");
            return (Criteria) this;
        }

        public Criteria andBltntypeIsNotNull() {
            addCriterion("bltntype is not null");
            return (Criteria) this;
        }

        public Criteria andBltntypeEqualTo(String value) {
            addCriterion("bltntype =", value, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeNotEqualTo(String value) {
            addCriterion("bltntype <>", value, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeGreaterThan(String value) {
            addCriterion("bltntype >", value, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeGreaterThanOrEqualTo(String value) {
            addCriterion("bltntype >=", value, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeLessThan(String value) {
            addCriterion("bltntype <", value, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeLessThanOrEqualTo(String value) {
            addCriterion("bltntype <=", value, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeLike(String value) {
            addCriterion("bltntype like", value, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeNotLike(String value) {
            addCriterion("bltntype not like", value, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeIn(List<String> values) {
            addCriterion("bltntype in", values, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeNotIn(List<String> values) {
            addCriterion("bltntype not in", values, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeBetween(String value1, String value2) {
            addCriterion("bltntype between", value1, value2, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypeNotBetween(String value1, String value2) {
            addCriterion("bltntype not between", value1, value2, "bltntype");
            return (Criteria) this;
        }

        public Criteria andBltntypenameIsNull() {
            addCriterion("bltntypename is null");
            return (Criteria) this;
        }

        public Criteria andBltntypenameIsNotNull() {
            addCriterion("bltntypename is not null");
            return (Criteria) this;
        }

        public Criteria andBltntypenameEqualTo(String value) {
            addCriterion("bltntypename =", value, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameNotEqualTo(String value) {
            addCriterion("bltntypename <>", value, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameGreaterThan(String value) {
            addCriterion("bltntypename >", value, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameGreaterThanOrEqualTo(String value) {
            addCriterion("bltntypename >=", value, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameLessThan(String value) {
            addCriterion("bltntypename <", value, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameLessThanOrEqualTo(String value) {
            addCriterion("bltntypename <=", value, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameLike(String value) {
            addCriterion("bltntypename like", value, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameNotLike(String value) {
            addCriterion("bltntypename not like", value, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameIn(List<String> values) {
            addCriterion("bltntypename in", values, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameNotIn(List<String> values) {
            addCriterion("bltntypename not in", values, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameBetween(String value1, String value2) {
            addCriterion("bltntypename between", value1, value2, "bltntypename");
            return (Criteria) this;
        }

        public Criteria andBltntypenameNotBetween(String value1, String value2) {
            addCriterion("bltntypename not between", value1, value2, "bltntypename");
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

        public Criteria andCourtflagIsNull() {
            addCriterion("courtflag is null");
            return (Criteria) this;
        }

        public Criteria andCourtflagIsNotNull() {
            addCriterion("courtflag is not null");
            return (Criteria) this;
        }

        public Criteria andCourtflagEqualTo(String value) {
            addCriterion("courtflag =", value, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagNotEqualTo(String value) {
            addCriterion("courtflag <>", value, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagGreaterThan(String value) {
            addCriterion("courtflag >", value, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagGreaterThanOrEqualTo(String value) {
            addCriterion("courtflag >=", value, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagLessThan(String value) {
            addCriterion("courtflag <", value, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagLessThanOrEqualTo(String value) {
            addCriterion("courtflag <=", value, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagLike(String value) {
            addCriterion("courtflag like", value, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagNotLike(String value) {
            addCriterion("courtflag not like", value, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagIn(List<String> values) {
            addCriterion("courtflag in", values, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagNotIn(List<String> values) {
            addCriterion("courtflag not in", values, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagBetween(String value1, String value2) {
            addCriterion("courtflag between", value1, value2, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtflagNotBetween(String value1, String value2) {
            addCriterion("courtflag not between", value1, value2, "courtflag");
            return (Criteria) this;
        }

        public Criteria andCourtcodeIsNull() {
            addCriterion("courtcode is null");
            return (Criteria) this;
        }

        public Criteria andCourtcodeIsNotNull() {
            addCriterion("courtcode is not null");
            return (Criteria) this;
        }

        public Criteria andCourtcodeEqualTo(String value) {
            addCriterion("courtcode =", value, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeNotEqualTo(String value) {
            addCriterion("courtcode <>", value, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeGreaterThan(String value) {
            addCriterion("courtcode >", value, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeGreaterThanOrEqualTo(String value) {
            addCriterion("courtcode >=", value, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeLessThan(String value) {
            addCriterion("courtcode <", value, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeLessThanOrEqualTo(String value) {
            addCriterion("courtcode <=", value, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeLike(String value) {
            addCriterion("courtcode like", value, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeNotLike(String value) {
            addCriterion("courtcode not like", value, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeIn(List<String> values) {
            addCriterion("courtcode in", values, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeNotIn(List<String> values) {
            addCriterion("courtcode not in", values, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeBetween(String value1, String value2) {
            addCriterion("courtcode between", value1, value2, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCourtcodeNotBetween(String value1, String value2) {
            addCriterion("courtcode not between", value1, value2, "courtcode");
            return (Criteria) this;
        }

        public Criteria andCustomnoIsNull() {
            addCriterion("customno is null");
            return (Criteria) this;
        }

        public Criteria andCustomnoIsNotNull() {
            addCriterion("customno is not null");
            return (Criteria) this;
        }

        public Criteria andCustomnoEqualTo(String value) {
            addCriterion("customno =", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoNotEqualTo(String value) {
            addCriterion("customno <>", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoGreaterThan(String value) {
            addCriterion("customno >", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoGreaterThanOrEqualTo(String value) {
            addCriterion("customno >=", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoLessThan(String value) {
            addCriterion("customno <", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoLessThanOrEqualTo(String value) {
            addCriterion("customno <=", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoLike(String value) {
            addCriterion("customno like", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoNotLike(String value) {
            addCriterion("customno not like", value, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoIn(List<String> values) {
            addCriterion("customno in", values, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoNotIn(List<String> values) {
            addCriterion("customno not in", values, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoBetween(String value1, String value2) {
            addCriterion("customno between", value1, value2, "customno");
            return (Criteria) this;
        }

        public Criteria andCustomnoNotBetween(String value1, String value2) {
            addCriterion("customno not between", value1, value2, "customno");
            return (Criteria) this;
        }

        public Criteria andDealgradeIsNull() {
            addCriterion("dealgrade is null");
            return (Criteria) this;
        }

        public Criteria andDealgradeIsNotNull() {
            addCriterion("dealgrade is not null");
            return (Criteria) this;
        }

        public Criteria andDealgradeEqualTo(String value) {
            addCriterion("dealgrade =", value, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeNotEqualTo(String value) {
            addCriterion("dealgrade <>", value, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeGreaterThan(String value) {
            addCriterion("dealgrade >", value, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeGreaterThanOrEqualTo(String value) {
            addCriterion("dealgrade >=", value, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeLessThan(String value) {
            addCriterion("dealgrade <", value, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeLessThanOrEqualTo(String value) {
            addCriterion("dealgrade <=", value, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeLike(String value) {
            addCriterion("dealgrade like", value, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeNotLike(String value) {
            addCriterion("dealgrade not like", value, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeIn(List<String> values) {
            addCriterion("dealgrade in", values, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeNotIn(List<String> values) {
            addCriterion("dealgrade not in", values, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeBetween(String value1, String value2) {
            addCriterion("dealgrade between", value1, value2, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradeNotBetween(String value1, String value2) {
            addCriterion("dealgrade not between", value1, value2, "dealgrade");
            return (Criteria) this;
        }

        public Criteria andDealgradenameIsNull() {
            addCriterion("dealgradename is null");
            return (Criteria) this;
        }

        public Criteria andDealgradenameIsNotNull() {
            addCriterion("dealgradename is not null");
            return (Criteria) this;
        }

        public Criteria andDealgradenameEqualTo(String value) {
            addCriterion("dealgradename =", value, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameNotEqualTo(String value) {
            addCriterion("dealgradename <>", value, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameGreaterThan(String value) {
            addCriterion("dealgradename >", value, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameGreaterThanOrEqualTo(String value) {
            addCriterion("dealgradename >=", value, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameLessThan(String value) {
            addCriterion("dealgradename <", value, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameLessThanOrEqualTo(String value) {
            addCriterion("dealgradename <=", value, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameLike(String value) {
            addCriterion("dealgradename like", value, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameNotLike(String value) {
            addCriterion("dealgradename not like", value, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameIn(List<String> values) {
            addCriterion("dealgradename in", values, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameNotIn(List<String> values) {
            addCriterion("dealgradename not in", values, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameBetween(String value1, String value2) {
            addCriterion("dealgradename between", value1, value2, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andDealgradenameNotBetween(String value1, String value2) {
            addCriterion("dealgradename not between", value1, value2, "dealgradename");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNull() {
            addCriterion("judge is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIsNotNull() {
            addCriterion("judge is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeEqualTo(String value) {
            addCriterion("judge =", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotEqualTo(String value) {
            addCriterion("judge <>", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThan(String value) {
            addCriterion("judge >", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeGreaterThanOrEqualTo(String value) {
            addCriterion("judge >=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThan(String value) {
            addCriterion("judge <", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLessThanOrEqualTo(String value) {
            addCriterion("judge <=", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeLike(String value) {
            addCriterion("judge like", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotLike(String value) {
            addCriterion("judge not like", value, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeIn(List<String> values) {
            addCriterion("judge in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotIn(List<String> values) {
            addCriterion("judge not in", values, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeBetween(String value1, String value2) {
            addCriterion("judge between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgeNotBetween(String value1, String value2) {
            addCriterion("judge not between", value1, value2, "judge");
            return (Criteria) this;
        }

        public Criteria andJudgephoneIsNull() {
            addCriterion("judgephone is null");
            return (Criteria) this;
        }

        public Criteria andJudgephoneIsNotNull() {
            addCriterion("judgephone is not null");
            return (Criteria) this;
        }

        public Criteria andJudgephoneEqualTo(String value) {
            addCriterion("judgephone =", value, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneNotEqualTo(String value) {
            addCriterion("judgephone <>", value, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneGreaterThan(String value) {
            addCriterion("judgephone >", value, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneGreaterThanOrEqualTo(String value) {
            addCriterion("judgephone >=", value, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneLessThan(String value) {
            addCriterion("judgephone <", value, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneLessThanOrEqualTo(String value) {
            addCriterion("judgephone <=", value, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneLike(String value) {
            addCriterion("judgephone like", value, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneNotLike(String value) {
            addCriterion("judgephone not like", value, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneIn(List<String> values) {
            addCriterion("judgephone in", values, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneNotIn(List<String> values) {
            addCriterion("judgephone not in", values, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneBetween(String value1, String value2) {
            addCriterion("judgephone between", value1, value2, "judgephone");
            return (Criteria) this;
        }

        public Criteria andJudgephoneNotBetween(String value1, String value2) {
            addCriterion("judgephone not between", value1, value2, "judgephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("mobilephone =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("mobilephone <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("mobilephone >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobilephone >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("mobilephone <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("mobilephone <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("mobilephone like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("mobilephone not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("mobilephone in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("mobilephone not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("mobilephone between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("mobilephone not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("publishdate is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("publishdate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(String value) {
            addCriterion("publishdate =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(String value) {
            addCriterion("publishdate <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(String value) {
            addCriterion("publishdate >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(String value) {
            addCriterion("publishdate >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(String value) {
            addCriterion("publishdate <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(String value) {
            addCriterion("publishdate <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLike(String value) {
            addCriterion("publishdate like", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotLike(String value) {
            addCriterion("publishdate not like", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<String> values) {
            addCriterion("publishdate in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<String> values) {
            addCriterion("publishdate not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(String value1, String value2) {
            addCriterion("publishdate between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(String value1, String value2) {
            addCriterion("publishdate not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishpageIsNull() {
            addCriterion("publishpage is null");
            return (Criteria) this;
        }

        public Criteria andPublishpageIsNotNull() {
            addCriterion("publishpage is not null");
            return (Criteria) this;
        }

        public Criteria andPublishpageEqualTo(String value) {
            addCriterion("publishpage =", value, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageNotEqualTo(String value) {
            addCriterion("publishpage <>", value, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageGreaterThan(String value) {
            addCriterion("publishpage >", value, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageGreaterThanOrEqualTo(String value) {
            addCriterion("publishpage >=", value, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageLessThan(String value) {
            addCriterion("publishpage <", value, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageLessThanOrEqualTo(String value) {
            addCriterion("publishpage <=", value, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageLike(String value) {
            addCriterion("publishpage like", value, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageNotLike(String value) {
            addCriterion("publishpage not like", value, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageIn(List<String> values) {
            addCriterion("publishpage in", values, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageNotIn(List<String> values) {
            addCriterion("publishpage not in", values, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageBetween(String value1, String value2) {
            addCriterion("publishpage between", value1, value2, "publishpage");
            return (Criteria) this;
        }

        public Criteria andPublishpageNotBetween(String value1, String value2) {
            addCriterion("publishpage not between", value1, value2, "publishpage");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateIsNull() {
            addCriterion("showtxtdate is null");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateIsNotNull() {
            addCriterion("showtxtdate is not null");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateEqualTo(String value) {
            addCriterion("showtxtdate =", value, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateNotEqualTo(String value) {
            addCriterion("showtxtdate <>", value, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateGreaterThan(String value) {
            addCriterion("showtxtdate >", value, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateGreaterThanOrEqualTo(String value) {
            addCriterion("showtxtdate >=", value, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateLessThan(String value) {
            addCriterion("showtxtdate <", value, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateLessThanOrEqualTo(String value) {
            addCriterion("showtxtdate <=", value, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateLike(String value) {
            addCriterion("showtxtdate like", value, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateNotLike(String value) {
            addCriterion("showtxtdate not like", value, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateIn(List<String> values) {
            addCriterion("showtxtdate in", values, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateNotIn(List<String> values) {
            addCriterion("showtxtdate not in", values, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateBetween(String value1, String value2) {
            addCriterion("showtxtdate between", value1, value2, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andShowtxtdateNotBetween(String value1, String value2) {
            addCriterion("showtxtdate not between", value1, value2, "showtxtdate");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnIsNull() {
            addCriterion("tmpsaversn is null");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnIsNotNull() {
            addCriterion("tmpsaversn is not null");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnEqualTo(String value) {
            addCriterion("tmpsaversn =", value, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnNotEqualTo(String value) {
            addCriterion("tmpsaversn <>", value, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnGreaterThan(String value) {
            addCriterion("tmpsaversn >", value, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnGreaterThanOrEqualTo(String value) {
            addCriterion("tmpsaversn >=", value, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnLessThan(String value) {
            addCriterion("tmpsaversn <", value, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnLessThanOrEqualTo(String value) {
            addCriterion("tmpsaversn <=", value, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnLike(String value) {
            addCriterion("tmpsaversn like", value, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnNotLike(String value) {
            addCriterion("tmpsaversn not like", value, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnIn(List<String> values) {
            addCriterion("tmpsaversn in", values, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnNotIn(List<String> values) {
            addCriterion("tmpsaversn not in", values, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnBetween(String value1, String value2) {
            addCriterion("tmpsaversn between", value1, value2, "tmpsaversn");
            return (Criteria) this;
        }

        public Criteria andTmpsaversnNotBetween(String value1, String value2) {
            addCriterion("tmpsaversn not between", value1, value2, "tmpsaversn");
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