package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Byte value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Byte value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Byte value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Byte value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Byte value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Byte> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Byte> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Byte value1, Byte value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemCreatedIsNull() {
            addCriterion("item_created is null");
            return (Criteria) this;
        }

        public Criteria andItemCreatedIsNotNull() {
            addCriterion("item_created is not null");
            return (Criteria) this;
        }

        public Criteria andItemCreatedEqualTo(Date value) {
            addCriterion("item_created =", value, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedNotEqualTo(Date value) {
            addCriterion("item_created <>", value, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedGreaterThan(Date value) {
            addCriterion("item_created >", value, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("item_created >=", value, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedLessThan(Date value) {
            addCriterion("item_created <", value, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedLessThanOrEqualTo(Date value) {
            addCriterion("item_created <=", value, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedIn(List<Date> values) {
            addCriterion("item_created in", values, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedNotIn(List<Date> values) {
            addCriterion("item_created not in", values, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedBetween(Date value1, Date value2) {
            addCriterion("item_created between", value1, value2, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemCreatedNotBetween(Date value1, Date value2) {
            addCriterion("item_created not between", value1, value2, "itemCreated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedIsNull() {
            addCriterion("item_updated is null");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedIsNotNull() {
            addCriterion("item_updated is not null");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedEqualTo(Date value) {
            addCriterion("item_updated =", value, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedNotEqualTo(Date value) {
            addCriterion("item_updated <>", value, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedGreaterThan(Date value) {
            addCriterion("item_updated >", value, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("item_updated >=", value, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedLessThan(Date value) {
            addCriterion("item_updated <", value, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("item_updated <=", value, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedIn(List<Date> values) {
            addCriterion("item_updated in", values, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedNotIn(List<Date> values) {
            addCriterion("item_updated not in", values, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedBetween(Date value1, Date value2) {
            addCriterion("item_updated between", value1, value2, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("item_updated not between", value1, value2, "itemUpdated");
            return (Criteria) this;
        }

        public Criteria andItemMemoIsNull() {
            addCriterion("item_memo is null");
            return (Criteria) this;
        }

        public Criteria andItemMemoIsNotNull() {
            addCriterion("item_memo is not null");
            return (Criteria) this;
        }

        public Criteria andItemMemoEqualTo(String value) {
            addCriterion("item_memo =", value, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoNotEqualTo(String value) {
            addCriterion("item_memo <>", value, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoGreaterThan(String value) {
            addCriterion("item_memo >", value, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoGreaterThanOrEqualTo(String value) {
            addCriterion("item_memo >=", value, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoLessThan(String value) {
            addCriterion("item_memo <", value, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoLessThanOrEqualTo(String value) {
            addCriterion("item_memo <=", value, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoLike(String value) {
            addCriterion("item_memo like", value, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoNotLike(String value) {
            addCriterion("item_memo not like", value, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoIn(List<String> values) {
            addCriterion("item_memo in", values, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoNotIn(List<String> values) {
            addCriterion("item_memo not in", values, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoBetween(String value1, String value2) {
            addCriterion("item_memo between", value1, value2, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemMemoNotBetween(String value1, String value2) {
            addCriterion("item_memo not between", value1, value2, "itemMemo");
            return (Criteria) this;
        }

        public Criteria andItemTitleIsNull() {
            addCriterion("item_title is null");
            return (Criteria) this;
        }

        public Criteria andItemTitleIsNotNull() {
            addCriterion("item_title is not null");
            return (Criteria) this;
        }

        public Criteria andItemTitleEqualTo(String value) {
            addCriterion("item_title =", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotEqualTo(String value) {
            addCriterion("item_title <>", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleGreaterThan(String value) {
            addCriterion("item_title >", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleGreaterThanOrEqualTo(String value) {
            addCriterion("item_title >=", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLessThan(String value) {
            addCriterion("item_title <", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLessThanOrEqualTo(String value) {
            addCriterion("item_title <=", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleLike(String value) {
            addCriterion("item_title like", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotLike(String value) {
            addCriterion("item_title not like", value, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleIn(List<String> values) {
            addCriterion("item_title in", values, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotIn(List<String> values) {
            addCriterion("item_title not in", values, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleBetween(String value1, String value2) {
            addCriterion("item_title between", value1, value2, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemTitleNotBetween(String value1, String value2) {
            addCriterion("item_title not between", value1, value2, "itemTitle");
            return (Criteria) this;
        }

        public Criteria andItemImageIsNull() {
            addCriterion("item_image is null");
            return (Criteria) this;
        }

        public Criteria andItemImageIsNotNull() {
            addCriterion("item_image is not null");
            return (Criteria) this;
        }

        public Criteria andItemImageEqualTo(String value) {
            addCriterion("item_image =", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotEqualTo(String value) {
            addCriterion("item_image <>", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageGreaterThan(String value) {
            addCriterion("item_image >", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageGreaterThanOrEqualTo(String value) {
            addCriterion("item_image >=", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageLessThan(String value) {
            addCriterion("item_image <", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageLessThanOrEqualTo(String value) {
            addCriterion("item_image <=", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageLike(String value) {
            addCriterion("item_image like", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotLike(String value) {
            addCriterion("item_image not like", value, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageIn(List<String> values) {
            addCriterion("item_image in", values, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotIn(List<String> values) {
            addCriterion("item_image not in", values, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageBetween(String value1, String value2) {
            addCriterion("item_image between", value1, value2, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemImageNotBetween(String value1, String value2) {
            addCriterion("item_image not between", value1, value2, "itemImage");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdIsNull() {
            addCriterion("item_category_id is null");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdIsNotNull() {
            addCriterion("item_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdEqualTo(Long value) {
            addCriterion("item_category_id =", value, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdNotEqualTo(Long value) {
            addCriterion("item_category_id <>", value, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdGreaterThan(Long value) {
            addCriterion("item_category_id >", value, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_category_id >=", value, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdLessThan(Long value) {
            addCriterion("item_category_id <", value, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("item_category_id <=", value, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdIn(List<Long> values) {
            addCriterion("item_category_id in", values, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdNotIn(List<Long> values) {
            addCriterion("item_category_id not in", values, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdBetween(Long value1, Long value2) {
            addCriterion("item_category_id between", value1, value2, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("item_category_id not between", value1, value2, "itemCategoryId");
            return (Criteria) this;
        }

        public Criteria andItemSellNumIsNull() {
            addCriterion("item_sell_num is null");
            return (Criteria) this;
        }

        public Criteria andItemSellNumIsNotNull() {
            addCriterion("item_sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andItemSellNumEqualTo(Long value) {
            addCriterion("item_sell_num =", value, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumNotEqualTo(Long value) {
            addCriterion("item_sell_num <>", value, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumGreaterThan(Long value) {
            addCriterion("item_sell_num >", value, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumGreaterThanOrEqualTo(Long value) {
            addCriterion("item_sell_num >=", value, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumLessThan(Long value) {
            addCriterion("item_sell_num <", value, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumLessThanOrEqualTo(Long value) {
            addCriterion("item_sell_num <=", value, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumIn(List<Long> values) {
            addCriterion("item_sell_num in", values, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumNotIn(List<Long> values) {
            addCriterion("item_sell_num not in", values, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumBetween(Long value1, Long value2) {
            addCriterion("item_sell_num between", value1, value2, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemSellNumNotBetween(Long value1, Long value2) {
            addCriterion("item_sell_num not between", value1, value2, "itemSellNum");
            return (Criteria) this;
        }

        public Criteria andItemIsbagIsNull() {
            addCriterion("item_isbag is null");
            return (Criteria) this;
        }

        public Criteria andItemIsbagIsNotNull() {
            addCriterion("item_isbag is not null");
            return (Criteria) this;
        }

        public Criteria andItemIsbagEqualTo(Byte value) {
            addCriterion("item_isbag =", value, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagNotEqualTo(Byte value) {
            addCriterion("item_isbag <>", value, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagGreaterThan(Byte value) {
            addCriterion("item_isbag >", value, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagGreaterThanOrEqualTo(Byte value) {
            addCriterion("item_isbag >=", value, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagLessThan(Byte value) {
            addCriterion("item_isbag <", value, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagLessThanOrEqualTo(Byte value) {
            addCriterion("item_isbag <=", value, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagIn(List<Byte> values) {
            addCriterion("item_isbag in", values, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagNotIn(List<Byte> values) {
            addCriterion("item_isbag not in", values, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagBetween(Byte value1, Byte value2) {
            addCriterion("item_isbag between", value1, value2, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemIsbagNotBetween(Byte value1, Byte value2) {
            addCriterion("item_isbag not between", value1, value2, "itemIsbag");
            return (Criteria) this;
        }

        public Criteria andItemSellIdIsNull() {
            addCriterion("item_sell_id is null");
            return (Criteria) this;
        }

        public Criteria andItemSellIdIsNotNull() {
            addCriterion("item_sell_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemSellIdEqualTo(Long value) {
            addCriterion("item_sell_id =", value, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdNotEqualTo(Long value) {
            addCriterion("item_sell_id <>", value, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdGreaterThan(Long value) {
            addCriterion("item_sell_id >", value, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_sell_id >=", value, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdLessThan(Long value) {
            addCriterion("item_sell_id <", value, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdLessThanOrEqualTo(Long value) {
            addCriterion("item_sell_id <=", value, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdIn(List<Long> values) {
            addCriterion("item_sell_id in", values, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdNotIn(List<Long> values) {
            addCriterion("item_sell_id not in", values, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdBetween(Long value1, Long value2) {
            addCriterion("item_sell_id between", value1, value2, "itemSellId");
            return (Criteria) this;
        }

        public Criteria andItemSellIdNotBetween(Long value1, Long value2) {
            addCriterion("item_sell_id not between", value1, value2, "itemSellId");
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