package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierRuleBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierRuleBaseInfoExample() {
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

        public Criteria andRuleBaseIdIsNull() {
            addCriterion("rule_base_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdIsNotNull() {
            addCriterion("rule_base_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdEqualTo(String value) {
            addCriterion("rule_base_id =", value, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdNotEqualTo(String value) {
            addCriterion("rule_base_id <>", value, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdGreaterThan(String value) {
            addCriterion("rule_base_id >", value, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("rule_base_id >=", value, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdLessThan(String value) {
            addCriterion("rule_base_id <", value, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdLessThanOrEqualTo(String value) {
            addCriterion("rule_base_id <=", value, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdLike(String value) {
            addCriterion("rule_base_id like", value, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdNotLike(String value) {
            addCriterion("rule_base_id not like", value, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdIn(List<String> values) {
            addCriterion("rule_base_id in", values, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdNotIn(List<String> values) {
            addCriterion("rule_base_id not in", values, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdBetween(String value1, String value2) {
            addCriterion("rule_base_id between", value1, value2, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseIdNotBetween(String value1, String value2) {
            addCriterion("rule_base_id not between", value1, value2, "ruleBaseId");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeIsNull() {
            addCriterion("rule_base_code is null");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeIsNotNull() {
            addCriterion("rule_base_code is not null");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeEqualTo(String value) {
            addCriterion("rule_base_code =", value, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeNotEqualTo(String value) {
            addCriterion("rule_base_code <>", value, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeGreaterThan(String value) {
            addCriterion("rule_base_code >", value, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_base_code >=", value, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeLessThan(String value) {
            addCriterion("rule_base_code <", value, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeLessThanOrEqualTo(String value) {
            addCriterion("rule_base_code <=", value, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeLike(String value) {
            addCriterion("rule_base_code like", value, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeNotLike(String value) {
            addCriterion("rule_base_code not like", value, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeIn(List<String> values) {
            addCriterion("rule_base_code in", values, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeNotIn(List<String> values) {
            addCriterion("rule_base_code not in", values, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeBetween(String value1, String value2) {
            addCriterion("rule_base_code between", value1, value2, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseCodeNotBetween(String value1, String value2) {
            addCriterion("rule_base_code not between", value1, value2, "ruleBaseCode");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameIsNull() {
            addCriterion("rule_base_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameIsNotNull() {
            addCriterion("rule_base_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameEqualTo(String value) {
            addCriterion("rule_base_name =", value, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameNotEqualTo(String value) {
            addCriterion("rule_base_name <>", value, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameGreaterThan(String value) {
            addCriterion("rule_base_name >", value, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_base_name >=", value, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameLessThan(String value) {
            addCriterion("rule_base_name <", value, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameLessThanOrEqualTo(String value) {
            addCriterion("rule_base_name <=", value, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameLike(String value) {
            addCriterion("rule_base_name like", value, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameNotLike(String value) {
            addCriterion("rule_base_name not like", value, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameIn(List<String> values) {
            addCriterion("rule_base_name in", values, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameNotIn(List<String> values) {
            addCriterion("rule_base_name not in", values, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameBetween(String value1, String value2) {
            addCriterion("rule_base_name between", value1, value2, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseNameNotBetween(String value1, String value2) {
            addCriterion("rule_base_name not between", value1, value2, "ruleBaseName");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusIsNull() {
            addCriterion("rule_base_status is null");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusIsNotNull() {
            addCriterion("rule_base_status is not null");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusEqualTo(String value) {
            addCriterion("rule_base_status =", value, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusNotEqualTo(String value) {
            addCriterion("rule_base_status <>", value, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusGreaterThan(String value) {
            addCriterion("rule_base_status >", value, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("rule_base_status >=", value, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusLessThan(String value) {
            addCriterion("rule_base_status <", value, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusLessThanOrEqualTo(String value) {
            addCriterion("rule_base_status <=", value, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusLike(String value) {
            addCriterion("rule_base_status like", value, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusNotLike(String value) {
            addCriterion("rule_base_status not like", value, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusIn(List<String> values) {
            addCriterion("rule_base_status in", values, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusNotIn(List<String> values) {
            addCriterion("rule_base_status not in", values, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusBetween(String value1, String value2) {
            addCriterion("rule_base_status between", value1, value2, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleBaseStatusNotBetween(String value1, String value2) {
            addCriterion("rule_base_status not between", value1, value2, "ruleBaseStatus");
            return (Criteria) this;
        }

        public Criteria andRuleExplainIsNull() {
            addCriterion("rule_explain is null");
            return (Criteria) this;
        }

        public Criteria andRuleExplainIsNotNull() {
            addCriterion("rule_explain is not null");
            return (Criteria) this;
        }

        public Criteria andRuleExplainEqualTo(String value) {
            addCriterion("rule_explain =", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainNotEqualTo(String value) {
            addCriterion("rule_explain <>", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainGreaterThan(String value) {
            addCriterion("rule_explain >", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainGreaterThanOrEqualTo(String value) {
            addCriterion("rule_explain >=", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainLessThan(String value) {
            addCriterion("rule_explain <", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainLessThanOrEqualTo(String value) {
            addCriterion("rule_explain <=", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainLike(String value) {
            addCriterion("rule_explain like", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainNotLike(String value) {
            addCriterion("rule_explain not like", value, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainIn(List<String> values) {
            addCriterion("rule_explain in", values, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainNotIn(List<String> values) {
            addCriterion("rule_explain not in", values, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainBetween(String value1, String value2) {
            addCriterion("rule_explain between", value1, value2, "ruleExplain");
            return (Criteria) this;
        }

        public Criteria andRuleExplainNotBetween(String value1, String value2) {
            addCriterion("rule_explain not between", value1, value2, "ruleExplain");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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