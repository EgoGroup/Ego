package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemDescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemDescExample() {
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

        public Criteria andItemDescIdIsNull() {
            addCriterion("item_desc_id is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIdIsNotNull() {
            addCriterion("item_desc_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescIdEqualTo(Long value) {
            addCriterion("item_desc_id =", value, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdNotEqualTo(Long value) {
            addCriterion("item_desc_id <>", value, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdGreaterThan(Long value) {
            addCriterion("item_desc_id >", value, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_desc_id >=", value, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdLessThan(Long value) {
            addCriterion("item_desc_id <", value, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdLessThanOrEqualTo(Long value) {
            addCriterion("item_desc_id <=", value, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdIn(List<Long> values) {
            addCriterion("item_desc_id in", values, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdNotIn(List<Long> values) {
            addCriterion("item_desc_id not in", values, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdBetween(Long value1, Long value2) {
            addCriterion("item_desc_id between", value1, value2, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescIdNotBetween(Long value1, Long value2) {
            addCriterion("item_desc_id not between", value1, value2, "itemDescId");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedIsNull() {
            addCriterion("item_desc_created is null");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedIsNotNull() {
            addCriterion("item_desc_created is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedEqualTo(Date value) {
            addCriterion("item_desc_created =", value, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedNotEqualTo(Date value) {
            addCriterion("item_desc_created <>", value, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedGreaterThan(Date value) {
            addCriterion("item_desc_created >", value, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("item_desc_created >=", value, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedLessThan(Date value) {
            addCriterion("item_desc_created <", value, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedLessThanOrEqualTo(Date value) {
            addCriterion("item_desc_created <=", value, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedIn(List<Date> values) {
            addCriterion("item_desc_created in", values, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedNotIn(List<Date> values) {
            addCriterion("item_desc_created not in", values, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedBetween(Date value1, Date value2) {
            addCriterion("item_desc_created between", value1, value2, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescCreatedNotBetween(Date value1, Date value2) {
            addCriterion("item_desc_created not between", value1, value2, "itemDescCreated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedIsNull() {
            addCriterion("item_desc_updated is null");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedIsNotNull() {
            addCriterion("item_desc_updated is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedEqualTo(Date value) {
            addCriterion("item_desc_updated =", value, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedNotEqualTo(Date value) {
            addCriterion("item_desc_updated <>", value, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedGreaterThan(Date value) {
            addCriterion("item_desc_updated >", value, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("item_desc_updated >=", value, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedLessThan(Date value) {
            addCriterion("item_desc_updated <", value, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("item_desc_updated <=", value, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedIn(List<Date> values) {
            addCriterion("item_desc_updated in", values, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedNotIn(List<Date> values) {
            addCriterion("item_desc_updated not in", values, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedBetween(Date value1, Date value2) {
            addCriterion("item_desc_updated between", value1, value2, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("item_desc_updated not between", value1, value2, "itemDescUpdated");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdIsNull() {
            addCriterion("item_desc_item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdIsNotNull() {
            addCriterion("item_desc_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdEqualTo(Long value) {
            addCriterion("item_desc_item_id =", value, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdNotEqualTo(Long value) {
            addCriterion("item_desc_item_id <>", value, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdGreaterThan(Long value) {
            addCriterion("item_desc_item_id >", value, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_desc_item_id >=", value, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdLessThan(Long value) {
            addCriterion("item_desc_item_id <", value, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_desc_item_id <=", value, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdIn(List<Long> values) {
            addCriterion("item_desc_item_id in", values, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdNotIn(List<Long> values) {
            addCriterion("item_desc_item_id not in", values, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdBetween(Long value1, Long value2) {
            addCriterion("item_desc_item_id between", value1, value2, "itemDescItemId");
            return (Criteria) this;
        }

        public Criteria andItemDescItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_desc_item_id not between", value1, value2, "itemDescItemId");
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