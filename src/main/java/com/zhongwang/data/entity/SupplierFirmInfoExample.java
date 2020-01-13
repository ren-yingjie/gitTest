package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierFirmInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierFirmInfoExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andFirmNameIsNull() {
            addCriterion("firm_name is null");
            return (Criteria) this;
        }

        public Criteria andFirmNameIsNotNull() {
            addCriterion("firm_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirmNameEqualTo(String value) {
            addCriterion("firm_name =", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameNotEqualTo(String value) {
            addCriterion("firm_name <>", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameGreaterThan(String value) {
            addCriterion("firm_name >", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameGreaterThanOrEqualTo(String value) {
            addCriterion("firm_name >=", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameLessThan(String value) {
            addCriterion("firm_name <", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameLessThanOrEqualTo(String value) {
            addCriterion("firm_name <=", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameLike(String value) {
            addCriterion("firm_name like", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameNotLike(String value) {
            addCriterion("firm_name not like", value, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameIn(List<String> values) {
            addCriterion("firm_name in", values, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameNotIn(List<String> values) {
            addCriterion("firm_name not in", values, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameBetween(String value1, String value2) {
            addCriterion("firm_name between", value1, value2, "firmName");
            return (Criteria) this;
        }

        public Criteria andFirmNameNotBetween(String value1, String value2) {
            addCriterion("firm_name not between", value1, value2, "firmName");
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

        public Criteria andCertificationInstitutionIsNull() {
            addCriterion("certification_institution is null");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionIsNotNull() {
            addCriterion("certification_institution is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionEqualTo(String value) {
            addCriterion("certification_institution =", value, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionNotEqualTo(String value) {
            addCriterion("certification_institution <>", value, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionGreaterThan(String value) {
            addCriterion("certification_institution >", value, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("certification_institution >=", value, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionLessThan(String value) {
            addCriterion("certification_institution <", value, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionLessThanOrEqualTo(String value) {
            addCriterion("certification_institution <=", value, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionLike(String value) {
            addCriterion("certification_institution like", value, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionNotLike(String value) {
            addCriterion("certification_institution not like", value, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionIn(List<String> values) {
            addCriterion("certification_institution in", values, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionNotIn(List<String> values) {
            addCriterion("certification_institution not in", values, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionBetween(String value1, String value2) {
            addCriterion("certification_institution between", value1, value2, "certificationInstitution");
            return (Criteria) this;
        }

        public Criteria andCertificationInstitutionNotBetween(String value1, String value2) {
            addCriterion("certification_institution not between", value1, value2, "certificationInstitution");
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

        public Criteria andCauseActionIsNull() {
            addCriterion("cause_action is null");
            return (Criteria) this;
        }

        public Criteria andCauseActionIsNotNull() {
            addCriterion("cause_action is not null");
            return (Criteria) this;
        }

        public Criteria andCauseActionEqualTo(String value) {
            addCriterion("cause_action =", value, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionNotEqualTo(String value) {
            addCriterion("cause_action <>", value, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionGreaterThan(String value) {
            addCriterion("cause_action >", value, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionGreaterThanOrEqualTo(String value) {
            addCriterion("cause_action >=", value, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionLessThan(String value) {
            addCriterion("cause_action <", value, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionLessThanOrEqualTo(String value) {
            addCriterion("cause_action <=", value, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionLike(String value) {
            addCriterion("cause_action like", value, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionNotLike(String value) {
            addCriterion("cause_action not like", value, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionIn(List<String> values) {
            addCriterion("cause_action in", values, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionNotIn(List<String> values) {
            addCriterion("cause_action not in", values, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionBetween(String value1, String value2) {
            addCriterion("cause_action between", value1, value2, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseActionNotBetween(String value1, String value2) {
            addCriterion("cause_action not between", value1, value2, "causeAction");
            return (Criteria) this;
        }

        public Criteria andCauseNoIsNull() {
            addCriterion("cause_no is null");
            return (Criteria) this;
        }

        public Criteria andCauseNoIsNotNull() {
            addCriterion("cause_no is not null");
            return (Criteria) this;
        }

        public Criteria andCauseNoEqualTo(String value) {
            addCriterion("cause_no =", value, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoNotEqualTo(String value) {
            addCriterion("cause_no <>", value, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoGreaterThan(String value) {
            addCriterion("cause_no >", value, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoGreaterThanOrEqualTo(String value) {
            addCriterion("cause_no >=", value, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoLessThan(String value) {
            addCriterion("cause_no <", value, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoLessThanOrEqualTo(String value) {
            addCriterion("cause_no <=", value, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoLike(String value) {
            addCriterion("cause_no like", value, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoNotLike(String value) {
            addCriterion("cause_no not like", value, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoIn(List<String> values) {
            addCriterion("cause_no in", values, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoNotIn(List<String> values) {
            addCriterion("cause_no not in", values, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoBetween(String value1, String value2) {
            addCriterion("cause_no between", value1, value2, "causeNo");
            return (Criteria) this;
        }

        public Criteria andCauseNoNotBetween(String value1, String value2) {
            addCriterion("cause_no not between", value1, value2, "causeNo");
            return (Criteria) this;
        }

        public Criteria andThatTimeIsNull() {
            addCriterion("that_time is null");
            return (Criteria) this;
        }

        public Criteria andThatTimeIsNotNull() {
            addCriterion("that_time is not null");
            return (Criteria) this;
        }

        public Criteria andThatTimeEqualTo(String value) {
            addCriterion("that_time =", value, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeNotEqualTo(String value) {
            addCriterion("that_time <>", value, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeGreaterThan(String value) {
            addCriterion("that_time >", value, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeGreaterThanOrEqualTo(String value) {
            addCriterion("that_time >=", value, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeLessThan(String value) {
            addCriterion("that_time <", value, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeLessThanOrEqualTo(String value) {
            addCriterion("that_time <=", value, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeLike(String value) {
            addCriterion("that_time like", value, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeNotLike(String value) {
            addCriterion("that_time not like", value, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeIn(List<String> values) {
            addCriterion("that_time in", values, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeNotIn(List<String> values) {
            addCriterion("that_time not in", values, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeBetween(String value1, String value2) {
            addCriterion("that_time between", value1, value2, "thatTime");
            return (Criteria) this;
        }

        public Criteria andThatTimeNotBetween(String value1, String value2) {
            addCriterion("that_time not between", value1, value2, "thatTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRiskScoreIsNull() {
            addCriterion("risk_score is null");
            return (Criteria) this;
        }

        public Criteria andRiskScoreIsNotNull() {
            addCriterion("risk_score is not null");
            return (Criteria) this;
        }

        public Criteria andRiskScoreEqualTo(String value) {
            addCriterion("risk_score =", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreNotEqualTo(String value) {
            addCriterion("risk_score <>", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreGreaterThan(String value) {
            addCriterion("risk_score >", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreGreaterThanOrEqualTo(String value) {
            addCriterion("risk_score >=", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreLessThan(String value) {
            addCriterion("risk_score <", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreLessThanOrEqualTo(String value) {
            addCriterion("risk_score <=", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreLike(String value) {
            addCriterion("risk_score like", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreNotLike(String value) {
            addCriterion("risk_score not like", value, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreIn(List<String> values) {
            addCriterion("risk_score in", values, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreNotIn(List<String> values) {
            addCriterion("risk_score not in", values, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreBetween(String value1, String value2) {
            addCriterion("risk_score between", value1, value2, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskScoreNotBetween(String value1, String value2) {
            addCriterion("risk_score not between", value1, value2, "riskScore");
            return (Criteria) this;
        }

        public Criteria andRiskGradeIsNull() {
            addCriterion("risk_grade is null");
            return (Criteria) this;
        }

        public Criteria andRiskGradeIsNotNull() {
            addCriterion("risk_grade is not null");
            return (Criteria) this;
        }

        public Criteria andRiskGradeEqualTo(String value) {
            addCriterion("risk_grade =", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeNotEqualTo(String value) {
            addCriterion("risk_grade <>", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeGreaterThan(String value) {
            addCriterion("risk_grade >", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeGreaterThanOrEqualTo(String value) {
            addCriterion("risk_grade >=", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeLessThan(String value) {
            addCriterion("risk_grade <", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeLessThanOrEqualTo(String value) {
            addCriterion("risk_grade <=", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeLike(String value) {
            addCriterion("risk_grade like", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeNotLike(String value) {
            addCriterion("risk_grade not like", value, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeIn(List<String> values) {
            addCriterion("risk_grade in", values, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeNotIn(List<String> values) {
            addCriterion("risk_grade not in", values, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeBetween(String value1, String value2) {
            addCriterion("risk_grade between", value1, value2, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andRiskGradeNotBetween(String value1, String value2) {
            addCriterion("risk_grade not between", value1, value2, "riskGrade");
            return (Criteria) this;
        }

        public Criteria andFirmUuidIsNull() {
            addCriterion("firm_uuid is null");
            return (Criteria) this;
        }

        public Criteria andFirmUuidIsNotNull() {
            addCriterion("firm_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andFirmUuidEqualTo(String value) {
            addCriterion("firm_uuid =", value, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidNotEqualTo(String value) {
            addCriterion("firm_uuid <>", value, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidGreaterThan(String value) {
            addCriterion("firm_uuid >", value, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidGreaterThanOrEqualTo(String value) {
            addCriterion("firm_uuid >=", value, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidLessThan(String value) {
            addCriterion("firm_uuid <", value, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidLessThanOrEqualTo(String value) {
            addCriterion("firm_uuid <=", value, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidLike(String value) {
            addCriterion("firm_uuid like", value, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidNotLike(String value) {
            addCriterion("firm_uuid not like", value, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidIn(List<String> values) {
            addCriterion("firm_uuid in", values, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidNotIn(List<String> values) {
            addCriterion("firm_uuid not in", values, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidBetween(String value1, String value2) {
            addCriterion("firm_uuid between", value1, value2, "firmUuid");
            return (Criteria) this;
        }

        public Criteria andFirmUuidNotBetween(String value1, String value2) {
            addCriterion("firm_uuid not between", value1, value2, "firmUuid");
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