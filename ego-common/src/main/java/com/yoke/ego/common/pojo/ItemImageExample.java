package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemImageExample() {
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

        public Criteria andItemImageIdIsNull() {
            addCriterion("item_image_id is null");
            return (Criteria) this;
        }

        public Criteria andItemImageIdIsNotNull() {
            addCriterion("item_image_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemImageIdEqualTo(Long value) {
            addCriterion("item_image_id =", value, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdNotEqualTo(Long value) {
            addCriterion("item_image_id <>", value, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdGreaterThan(Long value) {
            addCriterion("item_image_id >", value, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_image_id >=", value, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdLessThan(Long value) {
            addCriterion("item_image_id <", value, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdLessThanOrEqualTo(Long value) {
            addCriterion("item_image_id <=", value, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdIn(List<Long> values) {
            addCriterion("item_image_id in", values, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdNotIn(List<Long> values) {
            addCriterion("item_image_id not in", values, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdBetween(Long value1, Long value2) {
            addCriterion("item_image_id between", value1, value2, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageIdNotBetween(Long value1, Long value2) {
            addCriterion("item_image_id not between", value1, value2, "itemImageId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdIsNull() {
            addCriterion("item_image_attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdIsNotNull() {
            addCriterion("item_image_attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdEqualTo(Long value) {
            addCriterion("item_image_attribute_id =", value, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdNotEqualTo(Long value) {
            addCriterion("item_image_attribute_id <>", value, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdGreaterThan(Long value) {
            addCriterion("item_image_attribute_id >", value, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_image_attribute_id >=", value, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdLessThan(Long value) {
            addCriterion("item_image_attribute_id <", value, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdLessThanOrEqualTo(Long value) {
            addCriterion("item_image_attribute_id <=", value, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdIn(List<Long> values) {
            addCriterion("item_image_attribute_id in", values, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdNotIn(List<Long> values) {
            addCriterion("item_image_attribute_id not in", values, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdBetween(Long value1, Long value2) {
            addCriterion("item_image_attribute_id between", value1, value2, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageAttributeIdNotBetween(Long value1, Long value2) {
            addCriterion("item_image_attribute_id not between", value1, value2, "itemImageAttributeId");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlIsNull() {
            addCriterion("item_image_url is null");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlIsNotNull() {
            addCriterion("item_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlEqualTo(String value) {
            addCriterion("item_image_url =", value, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlNotEqualTo(String value) {
            addCriterion("item_image_url <>", value, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlGreaterThan(String value) {
            addCriterion("item_image_url >", value, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("item_image_url >=", value, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlLessThan(String value) {
            addCriterion("item_image_url <", value, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlLessThanOrEqualTo(String value) {
            addCriterion("item_image_url <=", value, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlLike(String value) {
            addCriterion("item_image_url like", value, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlNotLike(String value) {
            addCriterion("item_image_url not like", value, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlIn(List<String> values) {
            addCriterion("item_image_url in", values, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlNotIn(List<String> values) {
            addCriterion("item_image_url not in", values, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlBetween(String value1, String value2) {
            addCriterion("item_image_url between", value1, value2, "itemImageUrl");
            return (Criteria) this;
        }

        public Criteria andItemImageUrlNotBetween(String value1, String value2) {
            addCriterion("item_image_url not between", value1, value2, "itemImageUrl");
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