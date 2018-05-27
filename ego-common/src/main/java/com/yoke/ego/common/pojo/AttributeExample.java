package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttributeExample() {
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

        public Criteria andItemAttributeIdIsNull() {
            addCriterion("item_attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdIsNotNull() {
            addCriterion("item_attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdEqualTo(Long value) {
            addCriterion("item_attribute_id =", value, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdNotEqualTo(Long value) {
            addCriterion("item_attribute_id <>", value, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdGreaterThan(Long value) {
            addCriterion("item_attribute_id >", value, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_attribute_id >=", value, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdLessThan(Long value) {
            addCriterion("item_attribute_id <", value, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdLessThanOrEqualTo(Long value) {
            addCriterion("item_attribute_id <=", value, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdIn(List<Long> values) {
            addCriterion("item_attribute_id in", values, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdNotIn(List<Long> values) {
            addCriterion("item_attribute_id not in", values, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdBetween(Long value1, Long value2) {
            addCriterion("item_attribute_id between", value1, value2, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeIdNotBetween(Long value1, Long value2) {
            addCriterion("item_attribute_id not between", value1, value2, "itemAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataIsNull() {
            addCriterion("item_attribute_data is null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataIsNotNull() {
            addCriterion("item_attribute_data is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataEqualTo(String value) {
            addCriterion("item_attribute_data =", value, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataNotEqualTo(String value) {
            addCriterion("item_attribute_data <>", value, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataGreaterThan(String value) {
            addCriterion("item_attribute_data >", value, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataGreaterThanOrEqualTo(String value) {
            addCriterion("item_attribute_data >=", value, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataLessThan(String value) {
            addCriterion("item_attribute_data <", value, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataLessThanOrEqualTo(String value) {
            addCriterion("item_attribute_data <=", value, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataLike(String value) {
            addCriterion("item_attribute_data like", value, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataNotLike(String value) {
            addCriterion("item_attribute_data not like", value, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataIn(List<String> values) {
            addCriterion("item_attribute_data in", values, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataNotIn(List<String> values) {
            addCriterion("item_attribute_data not in", values, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataBetween(String value1, String value2) {
            addCriterion("item_attribute_data between", value1, value2, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeDataNotBetween(String value1, String value2) {
            addCriterion("item_attribute_data not between", value1, value2, "itemAttributeData");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedIsNull() {
            addCriterion("item_attribute_created is null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedIsNotNull() {
            addCriterion("item_attribute_created is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedEqualTo(Date value) {
            addCriterion("item_attribute_created =", value, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedNotEqualTo(Date value) {
            addCriterion("item_attribute_created <>", value, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedGreaterThan(Date value) {
            addCriterion("item_attribute_created >", value, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("item_attribute_created >=", value, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedLessThan(Date value) {
            addCriterion("item_attribute_created <", value, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedLessThanOrEqualTo(Date value) {
            addCriterion("item_attribute_created <=", value, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedIn(List<Date> values) {
            addCriterion("item_attribute_created in", values, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedNotIn(List<Date> values) {
            addCriterion("item_attribute_created not in", values, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedBetween(Date value1, Date value2) {
            addCriterion("item_attribute_created between", value1, value2, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCreatedNotBetween(Date value1, Date value2) {
            addCriterion("item_attribute_created not between", value1, value2, "itemAttributeCreated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedIsNull() {
            addCriterion("item_attribute_updated is null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedIsNotNull() {
            addCriterion("item_attribute_updated is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedEqualTo(Date value) {
            addCriterion("item_attribute_updated =", value, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedNotEqualTo(Date value) {
            addCriterion("item_attribute_updated <>", value, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedGreaterThan(Date value) {
            addCriterion("item_attribute_updated >", value, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("item_attribute_updated >=", value, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedLessThan(Date value) {
            addCriterion("item_attribute_updated <", value, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("item_attribute_updated <=", value, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedIn(List<Date> values) {
            addCriterion("item_attribute_updated in", values, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedNotIn(List<Date> values) {
            addCriterion("item_attribute_updated not in", values, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedBetween(Date value1, Date value2) {
            addCriterion("item_attribute_updated between", value1, value2, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("item_attribute_updated not between", value1, value2, "itemAttributeUpdated");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountIsNull() {
            addCriterion("item_attribute_count is null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountIsNotNull() {
            addCriterion("item_attribute_count is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountEqualTo(Integer value) {
            addCriterion("item_attribute_count =", value, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountNotEqualTo(Integer value) {
            addCriterion("item_attribute_count <>", value, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountGreaterThan(Integer value) {
            addCriterion("item_attribute_count >", value, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_attribute_count >=", value, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountLessThan(Integer value) {
            addCriterion("item_attribute_count <", value, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountLessThanOrEqualTo(Integer value) {
            addCriterion("item_attribute_count <=", value, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountIn(List<Integer> values) {
            addCriterion("item_attribute_count in", values, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountNotIn(List<Integer> values) {
            addCriterion("item_attribute_count not in", values, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountBetween(Integer value1, Integer value2) {
            addCriterion("item_attribute_count between", value1, value2, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("item_attribute_count not between", value1, value2, "itemAttributeCount");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceIsNull() {
            addCriterion("item_attribute_price is null");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceIsNotNull() {
            addCriterion("item_attribute_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceEqualTo(Float value) {
            addCriterion("item_attribute_price =", value, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceNotEqualTo(Float value) {
            addCriterion("item_attribute_price <>", value, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceGreaterThan(Float value) {
            addCriterion("item_attribute_price >", value, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("item_attribute_price >=", value, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceLessThan(Float value) {
            addCriterion("item_attribute_price <", value, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceLessThanOrEqualTo(Float value) {
            addCriterion("item_attribute_price <=", value, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceIn(List<Float> values) {
            addCriterion("item_attribute_price in", values, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceNotIn(List<Float> values) {
            addCriterion("item_attribute_price not in", values, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceBetween(Float value1, Float value2) {
            addCriterion("item_attribute_price between", value1, value2, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributePriceNotBetween(Float value1, Float value2) {
            addCriterion("item_attribute_price not between", value1, value2, "itemAttributePrice");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumIsNull() {
            addCriterion("item_attribute_limit_num is null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumIsNotNull() {
            addCriterion("item_attribute_limit_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumEqualTo(Integer value) {
            addCriterion("item_attribute_limit_num =", value, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumNotEqualTo(Integer value) {
            addCriterion("item_attribute_limit_num <>", value, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumGreaterThan(Integer value) {
            addCriterion("item_attribute_limit_num >", value, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_attribute_limit_num >=", value, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumLessThan(Integer value) {
            addCriterion("item_attribute_limit_num <", value, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumLessThanOrEqualTo(Integer value) {
            addCriterion("item_attribute_limit_num <=", value, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumIn(List<Integer> values) {
            addCriterion("item_attribute_limit_num in", values, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumNotIn(List<Integer> values) {
            addCriterion("item_attribute_limit_num not in", values, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumBetween(Integer value1, Integer value2) {
            addCriterion("item_attribute_limit_num between", value1, value2, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeLimitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("item_attribute_limit_num not between", value1, value2, "itemAttributeLimitNum");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdIsNull() {
            addCriterion("item_attribute_item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdIsNotNull() {
            addCriterion("item_attribute_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdEqualTo(Long value) {
            addCriterion("item_attribute_item_id =", value, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdNotEqualTo(Long value) {
            addCriterion("item_attribute_item_id <>", value, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdGreaterThan(Long value) {
            addCriterion("item_attribute_item_id >", value, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_attribute_item_id >=", value, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdLessThan(Long value) {
            addCriterion("item_attribute_item_id <", value, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_attribute_item_id <=", value, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdIn(List<Long> values) {
            addCriterion("item_attribute_item_id in", values, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdNotIn(List<Long> values) {
            addCriterion("item_attribute_item_id not in", values, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdBetween(Long value1, Long value2) {
            addCriterion("item_attribute_item_id between", value1, value2, "itemAttributeItemId");
            return (Criteria) this;
        }

        public Criteria andItemAttributeItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_attribute_item_id not between", value1, value2, "itemAttributeItemId");
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