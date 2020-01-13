package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierZs0173Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierZs0173Example() {
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

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Integer value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Integer value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Integer value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Integer value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Integer value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Integer> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Integer> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Integer value1, Integer value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andRegtypeIsNull() {
            addCriterion("regType is null");
            return (Criteria) this;
        }

        public Criteria andRegtypeIsNotNull() {
            addCriterion("regType is not null");
            return (Criteria) this;
        }

        public Criteria andRegtypeEqualTo(String value) {
            addCriterion("regType =", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotEqualTo(String value) {
            addCriterion("regType <>", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeGreaterThan(String value) {
            addCriterion("regType >", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeGreaterThanOrEqualTo(String value) {
            addCriterion("regType >=", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeLessThan(String value) {
            addCriterion("regType <", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeLessThanOrEqualTo(String value) {
            addCriterion("regType <=", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeLike(String value) {
            addCriterion("regType like", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotLike(String value) {
            addCriterion("regType not like", value, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeIn(List<String> values) {
            addCriterion("regType in", values, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotIn(List<String> values) {
            addCriterion("regType not in", values, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeBetween(String value1, String value2) {
            addCriterion("regType between", value1, value2, "regtype");
            return (Criteria) this;
        }

        public Criteria andRegtypeNotBetween(String value1, String value2) {
            addCriterion("regType not between", value1, value2, "regtype");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberIsNull() {
            addCriterion("personIdNumber is null");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberIsNotNull() {
            addCriterion("personIdNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberEqualTo(String value) {
            addCriterion("personIdNumber =", value, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberNotEqualTo(String value) {
            addCriterion("personIdNumber <>", value, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberGreaterThan(String value) {
            addCriterion("personIdNumber >", value, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberGreaterThanOrEqualTo(String value) {
            addCriterion("personIdNumber >=", value, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberLessThan(String value) {
            addCriterion("personIdNumber <", value, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberLessThanOrEqualTo(String value) {
            addCriterion("personIdNumber <=", value, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberLike(String value) {
            addCriterion("personIdNumber like", value, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberNotLike(String value) {
            addCriterion("personIdNumber not like", value, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberIn(List<String> values) {
            addCriterion("personIdNumber in", values, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberNotIn(List<String> values) {
            addCriterion("personIdNumber not in", values, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberBetween(String value1, String value2) {
            addCriterion("personIdNumber between", value1, value2, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andPersonidnumberNotBetween(String value1, String value2) {
            addCriterion("personIdNumber not between", value1, value2, "personidnumber");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameIsNull() {
            addCriterion("legalpersonName is null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameIsNotNull() {
            addCriterion("legalpersonName is not null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameEqualTo(String value) {
            addCriterion("legalpersonName =", value, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameNotEqualTo(String value) {
            addCriterion("legalpersonName <>", value, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameGreaterThan(String value) {
            addCriterion("legalpersonName >", value, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("legalpersonName >=", value, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameLessThan(String value) {
            addCriterion("legalpersonName <", value, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameLessThanOrEqualTo(String value) {
            addCriterion("legalpersonName <=", value, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameLike(String value) {
            addCriterion("legalpersonName like", value, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameNotLike(String value) {
            addCriterion("legalpersonName not like", value, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameIn(List<String> values) {
            addCriterion("legalpersonName in", values, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameNotIn(List<String> values) {
            addCriterion("legalpersonName not in", values, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameBetween(String value1, String value2) {
            addCriterion("legalpersonName between", value1, value2, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLegalpersonnameNotBetween(String value1, String value2) {
            addCriterion("legalpersonName not between", value1, value2, "legalpersonname");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountIsNull() {
            addCriterion("ownTaxAmount is null");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountIsNotNull() {
            addCriterion("ownTaxAmount is not null");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountEqualTo(String value) {
            addCriterion("ownTaxAmount =", value, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountNotEqualTo(String value) {
            addCriterion("ownTaxAmount <>", value, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountGreaterThan(String value) {
            addCriterion("ownTaxAmount >", value, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountGreaterThanOrEqualTo(String value) {
            addCriterion("ownTaxAmount >=", value, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountLessThan(String value) {
            addCriterion("ownTaxAmount <", value, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountLessThanOrEqualTo(String value) {
            addCriterion("ownTaxAmount <=", value, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountLike(String value) {
            addCriterion("ownTaxAmount like", value, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountNotLike(String value) {
            addCriterion("ownTaxAmount not like", value, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountIn(List<String> values) {
            addCriterion("ownTaxAmount in", values, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountNotIn(List<String> values) {
            addCriterion("ownTaxAmount not in", values, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountBetween(String value1, String value2) {
            addCriterion("ownTaxAmount between", value1, value2, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andOwntaxamountNotBetween(String value1, String value2) {
            addCriterion("ownTaxAmount not between", value1, value2, "owntaxamount");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberIsNull() {
            addCriterion("taxIdNumber is null");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberIsNotNull() {
            addCriterion("taxIdNumber is not null");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberEqualTo(String value) {
            addCriterion("taxIdNumber =", value, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberNotEqualTo(String value) {
            addCriterion("taxIdNumber <>", value, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberGreaterThan(String value) {
            addCriterion("taxIdNumber >", value, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberGreaterThanOrEqualTo(String value) {
            addCriterion("taxIdNumber >=", value, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberLessThan(String value) {
            addCriterion("taxIdNumber <", value, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberLessThanOrEqualTo(String value) {
            addCriterion("taxIdNumber <=", value, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberLike(String value) {
            addCriterion("taxIdNumber like", value, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberNotLike(String value) {
            addCriterion("taxIdNumber not like", value, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberIn(List<String> values) {
            addCriterion("taxIdNumber in", values, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberNotIn(List<String> values) {
            addCriterion("taxIdNumber not in", values, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberBetween(String value1, String value2) {
            addCriterion("taxIdNumber between", value1, value2, "taxidnumber");
            return (Criteria) this;
        }

        public Criteria andTaxidnumberNotBetween(String value1, String value2) {
            addCriterion("taxIdNumber not between", value1, value2, "taxidnumber");
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

        public Criteria andTaxcategoryIsNull() {
            addCriterion("taxCategory is null");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryIsNotNull() {
            addCriterion("taxCategory is not null");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryEqualTo(String value) {
            addCriterion("taxCategory =", value, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryNotEqualTo(String value) {
            addCriterion("taxCategory <>", value, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryGreaterThan(String value) {
            addCriterion("taxCategory >", value, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("taxCategory >=", value, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryLessThan(String value) {
            addCriterion("taxCategory <", value, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryLessThanOrEqualTo(String value) {
            addCriterion("taxCategory <=", value, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryLike(String value) {
            addCriterion("taxCategory like", value, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryNotLike(String value) {
            addCriterion("taxCategory not like", value, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryIn(List<String> values) {
            addCriterion("taxCategory in", values, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryNotIn(List<String> values) {
            addCriterion("taxCategory not in", values, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryBetween(String value1, String value2) {
            addCriterion("taxCategory between", value1, value2, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxcategoryNotBetween(String value1, String value2) {
            addCriterion("taxCategory not between", value1, value2, "taxcategory");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeIsNull() {
            addCriterion("taxpayerType is null");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeIsNotNull() {
            addCriterion("taxpayerType is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeEqualTo(String value) {
            addCriterion("taxpayerType =", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeNotEqualTo(String value) {
            addCriterion("taxpayerType <>", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeGreaterThan(String value) {
            addCriterion("taxpayerType >", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeGreaterThanOrEqualTo(String value) {
            addCriterion("taxpayerType >=", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeLessThan(String value) {
            addCriterion("taxpayerType <", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeLessThanOrEqualTo(String value) {
            addCriterion("taxpayerType <=", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeLike(String value) {
            addCriterion("taxpayerType like", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeNotLike(String value) {
            addCriterion("taxpayerType not like", value, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeIn(List<String> values) {
            addCriterion("taxpayerType in", values, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeNotIn(List<String> values) {
            addCriterion("taxpayerType not in", values, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeBetween(String value1, String value2) {
            addCriterion("taxpayerType between", value1, value2, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andTaxpayertypeNotBetween(String value1, String value2) {
            addCriterion("taxpayerType not between", value1, value2, "taxpayertype");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceIsNull() {
            addCriterion("newOwnTaxBalance is null");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceIsNotNull() {
            addCriterion("newOwnTaxBalance is not null");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceEqualTo(String value) {
            addCriterion("newOwnTaxBalance =", value, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceNotEqualTo(String value) {
            addCriterion("newOwnTaxBalance <>", value, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceGreaterThan(String value) {
            addCriterion("newOwnTaxBalance >", value, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("newOwnTaxBalance >=", value, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceLessThan(String value) {
            addCriterion("newOwnTaxBalance <", value, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceLessThanOrEqualTo(String value) {
            addCriterion("newOwnTaxBalance <=", value, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceLike(String value) {
            addCriterion("newOwnTaxBalance like", value, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceNotLike(String value) {
            addCriterion("newOwnTaxBalance not like", value, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceIn(List<String> values) {
            addCriterion("newOwnTaxBalance in", values, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceNotIn(List<String> values) {
            addCriterion("newOwnTaxBalance not in", values, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceBetween(String value1, String value2) {
            addCriterion("newOwnTaxBalance between", value1, value2, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andNewowntaxbalanceNotBetween(String value1, String value2) {
            addCriterion("newOwnTaxBalance not between", value1, value2, "newowntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceIsNull() {
            addCriterion("ownTaxBalance is null");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceIsNotNull() {
            addCriterion("ownTaxBalance is not null");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceEqualTo(String value) {
            addCriterion("ownTaxBalance =", value, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceNotEqualTo(String value) {
            addCriterion("ownTaxBalance <>", value, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceGreaterThan(String value) {
            addCriterion("ownTaxBalance >", value, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceGreaterThanOrEqualTo(String value) {
            addCriterion("ownTaxBalance >=", value, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceLessThan(String value) {
            addCriterion("ownTaxBalance <", value, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceLessThanOrEqualTo(String value) {
            addCriterion("ownTaxBalance <=", value, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceLike(String value) {
            addCriterion("ownTaxBalance like", value, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceNotLike(String value) {
            addCriterion("ownTaxBalance not like", value, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceIn(List<String> values) {
            addCriterion("ownTaxBalance in", values, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceNotIn(List<String> values) {
            addCriterion("ownTaxBalance not in", values, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceBetween(String value1, String value2) {
            addCriterion("ownTaxBalance between", value1, value2, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andOwntaxbalanceNotBetween(String value1, String value2) {
            addCriterion("ownTaxBalance not between", value1, value2, "owntaxbalance");
            return (Criteria) this;
        }

        public Criteria andTaxnameIsNull() {
            addCriterion("taxname is null");
            return (Criteria) this;
        }

        public Criteria andTaxnameIsNotNull() {
            addCriterion("taxname is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnameEqualTo(String value) {
            addCriterion("taxname =", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameNotEqualTo(String value) {
            addCriterion("taxname <>", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameGreaterThan(String value) {
            addCriterion("taxname >", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameGreaterThanOrEqualTo(String value) {
            addCriterion("taxname >=", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameLessThan(String value) {
            addCriterion("taxname <", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameLessThanOrEqualTo(String value) {
            addCriterion("taxname <=", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameLike(String value) {
            addCriterion("taxname like", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameNotLike(String value) {
            addCriterion("taxname not like", value, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameIn(List<String> values) {
            addCriterion("taxname in", values, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameNotIn(List<String> values) {
            addCriterion("taxname not in", values, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameBetween(String value1, String value2) {
            addCriterion("taxname between", value1, value2, "taxname");
            return (Criteria) this;
        }

        public Criteria andTaxnameNotBetween(String value1, String value2) {
            addCriterion("taxname not between", value1, value2, "taxname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameIsNull() {
            addCriterion("personIdName is null");
            return (Criteria) this;
        }

        public Criteria andPersonidnameIsNotNull() {
            addCriterion("personIdName is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidnameEqualTo(String value) {
            addCriterion("personIdName =", value, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameNotEqualTo(String value) {
            addCriterion("personIdName <>", value, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameGreaterThan(String value) {
            addCriterion("personIdName >", value, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameGreaterThanOrEqualTo(String value) {
            addCriterion("personIdName >=", value, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameLessThan(String value) {
            addCriterion("personIdName <", value, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameLessThanOrEqualTo(String value) {
            addCriterion("personIdName <=", value, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameLike(String value) {
            addCriterion("personIdName like", value, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameNotLike(String value) {
            addCriterion("personIdName not like", value, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameIn(List<String> values) {
            addCriterion("personIdName in", values, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameNotIn(List<String> values) {
            addCriterion("personIdName not in", values, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameBetween(String value1, String value2) {
            addCriterion("personIdName between", value1, value2, "personidname");
            return (Criteria) this;
        }

        public Criteria andPersonidnameNotBetween(String value1, String value2) {
            addCriterion("personIdName not between", value1, value2, "personidname");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("publishDate is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("publishDate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(String value) {
            addCriterion("publishDate =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(String value) {
            addCriterion("publishDate <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(String value) {
            addCriterion("publishDate >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(String value) {
            addCriterion("publishDate >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(String value) {
            addCriterion("publishDate <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(String value) {
            addCriterion("publishDate <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLike(String value) {
            addCriterion("publishDate like", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotLike(String value) {
            addCriterion("publishDate not like", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<String> values) {
            addCriterion("publishDate in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<String> values) {
            addCriterion("publishDate not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(String value1, String value2) {
            addCriterion("publishDate between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(String value1, String value2) {
            addCriterion("publishDate not between", value1, value2, "publishdate");
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