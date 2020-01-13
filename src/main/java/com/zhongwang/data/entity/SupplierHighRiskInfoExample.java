package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierHighRiskInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierHighRiskInfoExample() {
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

        public Criteria andRiskEventIsNull() {
            addCriterion("risk_event is null");
            return (Criteria) this;
        }

        public Criteria andRiskEventIsNotNull() {
            addCriterion("risk_event is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEventEqualTo(String value) {
            addCriterion("risk_event =", value, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventNotEqualTo(String value) {
            addCriterion("risk_event <>", value, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventGreaterThan(String value) {
            addCriterion("risk_event >", value, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventGreaterThanOrEqualTo(String value) {
            addCriterion("risk_event >=", value, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventLessThan(String value) {
            addCriterion("risk_event <", value, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventLessThanOrEqualTo(String value) {
            addCriterion("risk_event <=", value, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventLike(String value) {
            addCriterion("risk_event like", value, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventNotLike(String value) {
            addCriterion("risk_event not like", value, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventIn(List<String> values) {
            addCriterion("risk_event in", values, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventNotIn(List<String> values) {
            addCriterion("risk_event not in", values, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventBetween(String value1, String value2) {
            addCriterion("risk_event between", value1, value2, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventNotBetween(String value1, String value2) {
            addCriterion("risk_event not between", value1, value2, "riskEvent");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeIsNull() {
            addCriterion("risk_event_type is null");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeIsNotNull() {
            addCriterion("risk_event_type is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeEqualTo(String value) {
            addCriterion("risk_event_type =", value, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeNotEqualTo(String value) {
            addCriterion("risk_event_type <>", value, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeGreaterThan(String value) {
            addCriterion("risk_event_type >", value, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("risk_event_type >=", value, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeLessThan(String value) {
            addCriterion("risk_event_type <", value, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeLessThanOrEqualTo(String value) {
            addCriterion("risk_event_type <=", value, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeLike(String value) {
            addCriterion("risk_event_type like", value, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeNotLike(String value) {
            addCriterion("risk_event_type not like", value, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeIn(List<String> values) {
            addCriterion("risk_event_type in", values, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeNotIn(List<String> values) {
            addCriterion("risk_event_type not in", values, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeBetween(String value1, String value2) {
            addCriterion("risk_event_type between", value1, value2, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andRiskEventTypeNotBetween(String value1, String value2) {
            addCriterion("risk_event_type not between", value1, value2, "riskEventType");
            return (Criteria) this;
        }

        public Criteria andWarningDateIsNull() {
            addCriterion("warning_date is null");
            return (Criteria) this;
        }

        public Criteria andWarningDateIsNotNull() {
            addCriterion("warning_date is not null");
            return (Criteria) this;
        }

        public Criteria andWarningDateEqualTo(String value) {
            addCriterion("warning_date =", value, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateNotEqualTo(String value) {
            addCriterion("warning_date <>", value, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateGreaterThan(String value) {
            addCriterion("warning_date >", value, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateGreaterThanOrEqualTo(String value) {
            addCriterion("warning_date >=", value, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateLessThan(String value) {
            addCriterion("warning_date <", value, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateLessThanOrEqualTo(String value) {
            addCriterion("warning_date <=", value, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateLike(String value) {
            addCriterion("warning_date like", value, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateNotLike(String value) {
            addCriterion("warning_date not like", value, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateIn(List<String> values) {
            addCriterion("warning_date in", values, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateNotIn(List<String> values) {
            addCriterion("warning_date not in", values, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateBetween(String value1, String value2) {
            addCriterion("warning_date between", value1, value2, "warningDate");
            return (Criteria) this;
        }

        public Criteria andWarningDateNotBetween(String value1, String value2) {
            addCriterion("warning_date not between", value1, value2, "warningDate");
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