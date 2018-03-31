package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopcartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopcartExample() {
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

        public Criteria andShopcartIdIsNull() {
            addCriterion("shopcart_id is null");
            return (Criteria) this;
        }

        public Criteria andShopcartIdIsNotNull() {
            addCriterion("shopcart_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartIdEqualTo(Long value) {
            addCriterion("shopcart_id =", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdNotEqualTo(Long value) {
            addCriterion("shopcart_id <>", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdGreaterThan(Long value) {
            addCriterion("shopcart_id >", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shopcart_id >=", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdLessThan(Long value) {
            addCriterion("shopcart_id <", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdLessThanOrEqualTo(Long value) {
            addCriterion("shopcart_id <=", value, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdIn(List<Long> values) {
            addCriterion("shopcart_id in", values, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdNotIn(List<Long> values) {
            addCriterion("shopcart_id not in", values, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdBetween(Long value1, Long value2) {
            addCriterion("shopcart_id between", value1, value2, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartIdNotBetween(Long value1, Long value2) {
            addCriterion("shopcart_id not between", value1, value2, "shopcartId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdIsNull() {
            addCriterion("shopcart_user_id is null");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdIsNotNull() {
            addCriterion("shopcart_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdEqualTo(Long value) {
            addCriterion("shopcart_user_id =", value, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdNotEqualTo(Long value) {
            addCriterion("shopcart_user_id <>", value, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdGreaterThan(Long value) {
            addCriterion("shopcart_user_id >", value, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shopcart_user_id >=", value, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdLessThan(Long value) {
            addCriterion("shopcart_user_id <", value, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdLessThanOrEqualTo(Long value) {
            addCriterion("shopcart_user_id <=", value, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdIn(List<Long> values) {
            addCriterion("shopcart_user_id in", values, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdNotIn(List<Long> values) {
            addCriterion("shopcart_user_id not in", values, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdBetween(Long value1, Long value2) {
            addCriterion("shopcart_user_id between", value1, value2, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartUserIdNotBetween(Long value1, Long value2) {
            addCriterion("shopcart_user_id not between", value1, value2, "shopcartUserId");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedIsNull() {
            addCriterion("shopcart_created is null");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedIsNotNull() {
            addCriterion("shopcart_created is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedEqualTo(Date value) {
            addCriterion("shopcart_created =", value, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedNotEqualTo(Date value) {
            addCriterion("shopcart_created <>", value, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedGreaterThan(Date value) {
            addCriterion("shopcart_created >", value, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("shopcart_created >=", value, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedLessThan(Date value) {
            addCriterion("shopcart_created <", value, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedLessThanOrEqualTo(Date value) {
            addCriterion("shopcart_created <=", value, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedIn(List<Date> values) {
            addCriterion("shopcart_created in", values, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedNotIn(List<Date> values) {
            addCriterion("shopcart_created not in", values, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedBetween(Date value1, Date value2) {
            addCriterion("shopcart_created between", value1, value2, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartCreatedNotBetween(Date value1, Date value2) {
            addCriterion("shopcart_created not between", value1, value2, "shopcartCreated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedIsNull() {
            addCriterion("shopcart_updated is null");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedIsNotNull() {
            addCriterion("shopcart_updated is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedEqualTo(Date value) {
            addCriterion("shopcart_updated =", value, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedNotEqualTo(Date value) {
            addCriterion("shopcart_updated <>", value, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedGreaterThan(Date value) {
            addCriterion("shopcart_updated >", value, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("shopcart_updated >=", value, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedLessThan(Date value) {
            addCriterion("shopcart_updated <", value, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("shopcart_updated <=", value, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedIn(List<Date> values) {
            addCriterion("shopcart_updated in", values, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedNotIn(List<Date> values) {
            addCriterion("shopcart_updated not in", values, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedBetween(Date value1, Date value2) {
            addCriterion("shopcart_updated between", value1, value2, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("shopcart_updated not between", value1, value2, "shopcartUpdated");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoIsNull() {
            addCriterion("shopcart_memo is null");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoIsNotNull() {
            addCriterion("shopcart_memo is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoEqualTo(String value) {
            addCriterion("shopcart_memo =", value, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoNotEqualTo(String value) {
            addCriterion("shopcart_memo <>", value, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoGreaterThan(String value) {
            addCriterion("shopcart_memo >", value, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoGreaterThanOrEqualTo(String value) {
            addCriterion("shopcart_memo >=", value, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoLessThan(String value) {
            addCriterion("shopcart_memo <", value, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoLessThanOrEqualTo(String value) {
            addCriterion("shopcart_memo <=", value, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoLike(String value) {
            addCriterion("shopcart_memo like", value, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoNotLike(String value) {
            addCriterion("shopcart_memo not like", value, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoIn(List<String> values) {
            addCriterion("shopcart_memo in", values, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoNotIn(List<String> values) {
            addCriterion("shopcart_memo not in", values, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoBetween(String value1, String value2) {
            addCriterion("shopcart_memo between", value1, value2, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartMemoNotBetween(String value1, String value2) {
            addCriterion("shopcart_memo not between", value1, value2, "shopcartMemo");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdIsNull() {
            addCriterion("shopcart_item_id is null");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdIsNotNull() {
            addCriterion("shopcart_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdEqualTo(Long value) {
            addCriterion("shopcart_item_id =", value, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdNotEqualTo(Long value) {
            addCriterion("shopcart_item_id <>", value, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdGreaterThan(Long value) {
            addCriterion("shopcart_item_id >", value, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shopcart_item_id >=", value, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdLessThan(Long value) {
            addCriterion("shopcart_item_id <", value, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdLessThanOrEqualTo(Long value) {
            addCriterion("shopcart_item_id <=", value, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdIn(List<Long> values) {
            addCriterion("shopcart_item_id in", values, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdNotIn(List<Long> values) {
            addCriterion("shopcart_item_id not in", values, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdBetween(Long value1, Long value2) {
            addCriterion("shopcart_item_id between", value1, value2, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartItemIdNotBetween(Long value1, Long value2) {
            addCriterion("shopcart_item_id not between", value1, value2, "shopcartItemId");
            return (Criteria) this;
        }

        public Criteria andShopcartCountIsNull() {
            addCriterion("shopcart_count is null");
            return (Criteria) this;
        }

        public Criteria andShopcartCountIsNotNull() {
            addCriterion("shopcart_count is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartCountEqualTo(Integer value) {
            addCriterion("shopcart_count =", value, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountNotEqualTo(Integer value) {
            addCriterion("shopcart_count <>", value, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountGreaterThan(Integer value) {
            addCriterion("shopcart_count >", value, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopcart_count >=", value, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountLessThan(Integer value) {
            addCriterion("shopcart_count <", value, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountLessThanOrEqualTo(Integer value) {
            addCriterion("shopcart_count <=", value, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountIn(List<Integer> values) {
            addCriterion("shopcart_count in", values, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountNotIn(List<Integer> values) {
            addCriterion("shopcart_count not in", values, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountBetween(Integer value1, Integer value2) {
            addCriterion("shopcart_count between", value1, value2, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartCountNotBetween(Integer value1, Integer value2) {
            addCriterion("shopcart_count not between", value1, value2, "shopcartCount");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusIsNull() {
            addCriterion("shopcart_status is null");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusIsNotNull() {
            addCriterion("shopcart_status is not null");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusEqualTo(Byte value) {
            addCriterion("shopcart_status =", value, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusNotEqualTo(Byte value) {
            addCriterion("shopcart_status <>", value, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusGreaterThan(Byte value) {
            addCriterion("shopcart_status >", value, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("shopcart_status >=", value, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusLessThan(Byte value) {
            addCriterion("shopcart_status <", value, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusLessThanOrEqualTo(Byte value) {
            addCriterion("shopcart_status <=", value, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusIn(List<Byte> values) {
            addCriterion("shopcart_status in", values, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusNotIn(List<Byte> values) {
            addCriterion("shopcart_status not in", values, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusBetween(Byte value1, Byte value2) {
            addCriterion("shopcart_status between", value1, value2, "shopcartStatus");
            return (Criteria) this;
        }

        public Criteria andShopcartStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("shopcart_status not between", value1, value2, "shopcartStatus");
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