package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierZs0162Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierZs0162Example() {
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

        public Criteria andCasecodeIsNull() {
            addCriterion("caseCode is null");
            return (Criteria) this;
        }

        public Criteria andCasecodeIsNotNull() {
            addCriterion("caseCode is not null");
            return (Criteria) this;
        }

        public Criteria andCasecodeEqualTo(String value) {
            addCriterion("caseCode =", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeNotEqualTo(String value) {
            addCriterion("caseCode <>", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeGreaterThan(String value) {
            addCriterion("caseCode >", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeGreaterThanOrEqualTo(String value) {
            addCriterion("caseCode >=", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeLessThan(String value) {
            addCriterion("caseCode <", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeLessThanOrEqualTo(String value) {
            addCriterion("caseCode <=", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeLike(String value) {
            addCriterion("caseCode like", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeNotLike(String value) {
            addCriterion("caseCode not like", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeIn(List<String> values) {
            addCriterion("caseCode in", values, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeNotIn(List<String> values) {
            addCriterion("caseCode not in", values, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeBetween(String value1, String value2) {
            addCriterion("caseCode between", value1, value2, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeNotBetween(String value1, String value2) {
            addCriterion("caseCode not between", value1, value2, "casecode");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameIsNull() {
            addCriterion("execCourtName is null");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameIsNotNull() {
            addCriterion("execCourtName is not null");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameEqualTo(String value) {
            addCriterion("execCourtName =", value, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameNotEqualTo(String value) {
            addCriterion("execCourtName <>", value, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameGreaterThan(String value) {
            addCriterion("execCourtName >", value, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameGreaterThanOrEqualTo(String value) {
            addCriterion("execCourtName >=", value, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameLessThan(String value) {
            addCriterion("execCourtName <", value, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameLessThanOrEqualTo(String value) {
            addCriterion("execCourtName <=", value, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameLike(String value) {
            addCriterion("execCourtName like", value, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameNotLike(String value) {
            addCriterion("execCourtName not like", value, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameIn(List<String> values) {
            addCriterion("execCourtName in", values, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameNotIn(List<String> values) {
            addCriterion("execCourtName not in", values, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameBetween(String value1, String value2) {
            addCriterion("execCourtName between", value1, value2, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andExeccourtnameNotBetween(String value1, String value2) {
            addCriterion("execCourtName not between", value1, value2, "execcourtname");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPartycardnumIsNull() {
            addCriterion("partyCardNum is null");
            return (Criteria) this;
        }

        public Criteria andPartycardnumIsNotNull() {
            addCriterion("partyCardNum is not null");
            return (Criteria) this;
        }

        public Criteria andPartycardnumEqualTo(String value) {
            addCriterion("partyCardNum =", value, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumNotEqualTo(String value) {
            addCriterion("partyCardNum <>", value, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumGreaterThan(String value) {
            addCriterion("partyCardNum >", value, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumGreaterThanOrEqualTo(String value) {
            addCriterion("partyCardNum >=", value, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumLessThan(String value) {
            addCriterion("partyCardNum <", value, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumLessThanOrEqualTo(String value) {
            addCriterion("partyCardNum <=", value, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumLike(String value) {
            addCriterion("partyCardNum like", value, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumNotLike(String value) {
            addCriterion("partyCardNum not like", value, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumIn(List<String> values) {
            addCriterion("partyCardNum in", values, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumNotIn(List<String> values) {
            addCriterion("partyCardNum not in", values, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumBetween(String value1, String value2) {
            addCriterion("partyCardNum between", value1, value2, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andPartycardnumNotBetween(String value1, String value2) {
            addCriterion("partyCardNum not between", value1, value2, "partycardnum");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeIsNull() {
            addCriterion("caseCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeIsNotNull() {
            addCriterion("caseCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeEqualTo(String value) {
            addCriterion("caseCreateTime =", value, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeNotEqualTo(String value) {
            addCriterion("caseCreateTime <>", value, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeGreaterThan(String value) {
            addCriterion("caseCreateTime >", value, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("caseCreateTime >=", value, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeLessThan(String value) {
            addCriterion("caseCreateTime <", value, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeLessThanOrEqualTo(String value) {
            addCriterion("caseCreateTime <=", value, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeLike(String value) {
            addCriterion("caseCreateTime like", value, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeNotLike(String value) {
            addCriterion("caseCreateTime not like", value, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeIn(List<String> values) {
            addCriterion("caseCreateTime in", values, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeNotIn(List<String> values) {
            addCriterion("caseCreateTime not in", values, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeBetween(String value1, String value2) {
            addCriterion("caseCreateTime between", value1, value2, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andCasecreatetimeNotBetween(String value1, String value2) {
            addCriterion("caseCreateTime not between", value1, value2, "casecreatetime");
            return (Criteria) this;
        }

        public Criteria andExecmoneyIsNull() {
            addCriterion("execMoney is null");
            return (Criteria) this;
        }

        public Criteria andExecmoneyIsNotNull() {
            addCriterion("execMoney is not null");
            return (Criteria) this;
        }

        public Criteria andExecmoneyEqualTo(String value) {
            addCriterion("execMoney =", value, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyNotEqualTo(String value) {
            addCriterion("execMoney <>", value, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyGreaterThan(String value) {
            addCriterion("execMoney >", value, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("execMoney >=", value, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyLessThan(String value) {
            addCriterion("execMoney <", value, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyLessThanOrEqualTo(String value) {
            addCriterion("execMoney <=", value, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyLike(String value) {
            addCriterion("execMoney like", value, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyNotLike(String value) {
            addCriterion("execMoney not like", value, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyIn(List<String> values) {
            addCriterion("execMoney in", values, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyNotIn(List<String> values) {
            addCriterion("execMoney not in", values, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyBetween(String value1, String value2) {
            addCriterion("execMoney between", value1, value2, "execmoney");
            return (Criteria) this;
        }

        public Criteria andExecmoneyNotBetween(String value1, String value2) {
            addCriterion("execMoney not between", value1, value2, "execmoney");
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