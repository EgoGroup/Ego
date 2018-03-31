package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andUserAddressIdIsNull() {
            addCriterion("user_address_id is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdIsNotNull() {
            addCriterion("user_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdEqualTo(Long value) {
            addCriterion("user_address_id =", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotEqualTo(Long value) {
            addCriterion("user_address_id <>", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdGreaterThan(Long value) {
            addCriterion("user_address_id >", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_address_id >=", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLessThan(Long value) {
            addCriterion("user_address_id <", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdLessThanOrEqualTo(Long value) {
            addCriterion("user_address_id <=", value, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdIn(List<Long> values) {
            addCriterion("user_address_id in", values, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotIn(List<Long> values) {
            addCriterion("user_address_id not in", values, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdBetween(Long value1, Long value2) {
            addCriterion("user_address_id between", value1, value2, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressIdNotBetween(Long value1, Long value2) {
            addCriterion("user_address_id not between", value1, value2, "userAddressId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdIsNull() {
            addCriterion("user_address_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdIsNotNull() {
            addCriterion("user_address_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdEqualTo(Long value) {
            addCriterion("user_address_user_id =", value, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdNotEqualTo(Long value) {
            addCriterion("user_address_user_id <>", value, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdGreaterThan(Long value) {
            addCriterion("user_address_user_id >", value, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_address_user_id >=", value, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdLessThan(Long value) {
            addCriterion("user_address_user_id <", value, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_address_user_id <=", value, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdIn(List<Long> values) {
            addCriterion("user_address_user_id in", values, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdNotIn(List<Long> values) {
            addCriterion("user_address_user_id not in", values, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdBetween(Long value1, Long value2) {
            addCriterion("user_address_user_id between", value1, value2, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserAddressUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_address_user_id not between", value1, value2, "userAddressUserId");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNull() {
            addCriterion("user_tel is null");
            return (Criteria) this;
        }

        public Criteria andUserTelIsNotNull() {
            addCriterion("user_tel is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelEqualTo(String value) {
            addCriterion("user_tel =", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotEqualTo(String value) {
            addCriterion("user_tel <>", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThan(String value) {
            addCriterion("user_tel >", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("user_tel >=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThan(String value) {
            addCriterion("user_tel <", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLessThanOrEqualTo(String value) {
            addCriterion("user_tel <=", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelLike(String value) {
            addCriterion("user_tel like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotLike(String value) {
            addCriterion("user_tel not like", value, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelIn(List<String> values) {
            addCriterion("user_tel in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotIn(List<String> values) {
            addCriterion("user_tel not in", values, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelBetween(String value1, String value2) {
            addCriterion("user_tel between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserTelNotBetween(String value1, String value2) {
            addCriterion("user_tel not between", value1, value2, "userTel");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameIsNull() {
            addCriterion("user_address_name is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameIsNotNull() {
            addCriterion("user_address_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameEqualTo(String value) {
            addCriterion("user_address_name =", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameNotEqualTo(String value) {
            addCriterion("user_address_name <>", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameGreaterThan(String value) {
            addCriterion("user_address_name >", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_name >=", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameLessThan(String value) {
            addCriterion("user_address_name <", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameLessThanOrEqualTo(String value) {
            addCriterion("user_address_name <=", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameLike(String value) {
            addCriterion("user_address_name like", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameNotLike(String value) {
            addCriterion("user_address_name not like", value, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameIn(List<String> values) {
            addCriterion("user_address_name in", values, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameNotIn(List<String> values) {
            addCriterion("user_address_name not in", values, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameBetween(String value1, String value2) {
            addCriterion("user_address_name between", value1, value2, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressNameNotBetween(String value1, String value2) {
            addCriterion("user_address_name not between", value1, value2, "userAddressName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameIsNull() {
            addCriterion("user_address_street_name is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameIsNotNull() {
            addCriterion("user_address_street_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameEqualTo(String value) {
            addCriterion("user_address_street_name =", value, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameNotEqualTo(String value) {
            addCriterion("user_address_street_name <>", value, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameGreaterThan(String value) {
            addCriterion("user_address_street_name >", value, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_street_name >=", value, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameLessThan(String value) {
            addCriterion("user_address_street_name <", value, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameLessThanOrEqualTo(String value) {
            addCriterion("user_address_street_name <=", value, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameLike(String value) {
            addCriterion("user_address_street_name like", value, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameNotLike(String value) {
            addCriterion("user_address_street_name not like", value, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameIn(List<String> values) {
            addCriterion("user_address_street_name in", values, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameNotIn(List<String> values) {
            addCriterion("user_address_street_name not in", values, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameBetween(String value1, String value2) {
            addCriterion("user_address_street_name between", value1, value2, "userAddressStreetName");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetNameNotBetween(String value1, String value2) {
            addCriterion("user_address_street_name not between", value1, value2, "userAddressStreetName");
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