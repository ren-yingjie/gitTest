package com.zhongwang.data.entity;

import java.util.ArrayList;
import java.util.List;

public class SupplierSubsciribedInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierSubsciribedInfoExample() {
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

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeIsNull() {
            addCriterion("shareholder_type is null");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeIsNotNull() {
            addCriterion("shareholder_type is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeEqualTo(String value) {
            addCriterion("shareholder_type =", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeNotEqualTo(String value) {
            addCriterion("shareholder_type <>", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeGreaterThan(String value) {
            addCriterion("shareholder_type >", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder_type >=", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeLessThan(String value) {
            addCriterion("shareholder_type <", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeLessThanOrEqualTo(String value) {
            addCriterion("shareholder_type <=", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeLike(String value) {
            addCriterion("shareholder_type like", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeNotLike(String value) {
            addCriterion("shareholder_type not like", value, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeIn(List<String> values) {
            addCriterion("shareholder_type in", values, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeNotIn(List<String> values) {
            addCriterion("shareholder_type not in", values, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeBetween(String value1, String value2) {
            addCriterion("shareholder_type between", value1, value2, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderTypeNotBetween(String value1, String value2) {
            addCriterion("shareholder_type not between", value1, value2, "shareholderType");
            return (Criteria) this;
        }

        public Criteria andShareholderNameIsNull() {
            addCriterion("shareholder_name is null");
            return (Criteria) this;
        }

        public Criteria andShareholderNameIsNotNull() {
            addCriterion("shareholder_name is not null");
            return (Criteria) this;
        }

        public Criteria andShareholderNameEqualTo(String value) {
            addCriterion("shareholder_name =", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameNotEqualTo(String value) {
            addCriterion("shareholder_name <>", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameGreaterThan(String value) {
            addCriterion("shareholder_name >", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameGreaterThanOrEqualTo(String value) {
            addCriterion("shareholder_name >=", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameLessThan(String value) {
            addCriterion("shareholder_name <", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameLessThanOrEqualTo(String value) {
            addCriterion("shareholder_name <=", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameLike(String value) {
            addCriterion("shareholder_name like", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameNotLike(String value) {
            addCriterion("shareholder_name not like", value, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameIn(List<String> values) {
            addCriterion("shareholder_name in", values, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameNotIn(List<String> values) {
            addCriterion("shareholder_name not in", values, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameBetween(String value1, String value2) {
            addCriterion("shareholder_name between", value1, value2, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andShareholderNameNotBetween(String value1, String value2) {
            addCriterion("shareholder_name not between", value1, value2, "shareholderName");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayIsNull() {
            addCriterion("subscribed_way is null");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayIsNotNull() {
            addCriterion("subscribed_way is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayEqualTo(String value) {
            addCriterion("subscribed_way =", value, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayNotEqualTo(String value) {
            addCriterion("subscribed_way <>", value, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayGreaterThan(String value) {
            addCriterion("subscribed_way >", value, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayGreaterThanOrEqualTo(String value) {
            addCriterion("subscribed_way >=", value, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayLessThan(String value) {
            addCriterion("subscribed_way <", value, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayLessThanOrEqualTo(String value) {
            addCriterion("subscribed_way <=", value, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayLike(String value) {
            addCriterion("subscribed_way like", value, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayNotLike(String value) {
            addCriterion("subscribed_way not like", value, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayIn(List<String> values) {
            addCriterion("subscribed_way in", values, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayNotIn(List<String> values) {
            addCriterion("subscribed_way not in", values, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayBetween(String value1, String value2) {
            addCriterion("subscribed_way between", value1, value2, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedWayNotBetween(String value1, String value2) {
            addCriterion("subscribed_way not between", value1, value2, "subscribedWay");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountIsNull() {
            addCriterion("subscribed_amount is null");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountIsNotNull() {
            addCriterion("subscribed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountEqualTo(String value) {
            addCriterion("subscribed_amount =", value, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountNotEqualTo(String value) {
            addCriterion("subscribed_amount <>", value, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountGreaterThan(String value) {
            addCriterion("subscribed_amount >", value, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountGreaterThanOrEqualTo(String value) {
            addCriterion("subscribed_amount >=", value, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountLessThan(String value) {
            addCriterion("subscribed_amount <", value, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountLessThanOrEqualTo(String value) {
            addCriterion("subscribed_amount <=", value, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountLike(String value) {
            addCriterion("subscribed_amount like", value, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountNotLike(String value) {
            addCriterion("subscribed_amount not like", value, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountIn(List<String> values) {
            addCriterion("subscribed_amount in", values, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountNotIn(List<String> values) {
            addCriterion("subscribed_amount not in", values, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountBetween(String value1, String value2) {
            addCriterion("subscribed_amount between", value1, value2, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andSubscribedAmountNotBetween(String value1, String value2) {
            addCriterion("subscribed_amount not between", value1, value2, "subscribedAmount");
            return (Criteria) this;
        }

        public Criteria andShareScaleIsNull() {
            addCriterion("share_scale is null");
            return (Criteria) this;
        }

        public Criteria andShareScaleIsNotNull() {
            addCriterion("share_scale is not null");
            return (Criteria) this;
        }

        public Criteria andShareScaleEqualTo(String value) {
            addCriterion("share_scale =", value, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleNotEqualTo(String value) {
            addCriterion("share_scale <>", value, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleGreaterThan(String value) {
            addCriterion("share_scale >", value, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleGreaterThanOrEqualTo(String value) {
            addCriterion("share_scale >=", value, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleLessThan(String value) {
            addCriterion("share_scale <", value, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleLessThanOrEqualTo(String value) {
            addCriterion("share_scale <=", value, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleLike(String value) {
            addCriterion("share_scale like", value, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleNotLike(String value) {
            addCriterion("share_scale not like", value, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleIn(List<String> values) {
            addCriterion("share_scale in", values, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleNotIn(List<String> values) {
            addCriterion("share_scale not in", values, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleBetween(String value1, String value2) {
            addCriterion("share_scale between", value1, value2, "shareScale");
            return (Criteria) this;
        }

        public Criteria andShareScaleNotBetween(String value1, String value2) {
            addCriterion("share_scale not between", value1, value2, "shareScale");
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