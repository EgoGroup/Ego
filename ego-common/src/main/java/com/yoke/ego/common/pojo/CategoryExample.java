package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusIsNull() {
            addCriterion("category_status is null");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusIsNotNull() {
            addCriterion("category_status is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusEqualTo(Byte value) {
            addCriterion("category_status =", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotEqualTo(Byte value) {
            addCriterion("category_status <>", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusGreaterThan(Byte value) {
            addCriterion("category_status >", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("category_status >=", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusLessThan(Byte value) {
            addCriterion("category_status <", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusLessThanOrEqualTo(Byte value) {
            addCriterion("category_status <=", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusIn(List<Byte> values) {
            addCriterion("category_status in", values, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotIn(List<Byte> values) {
            addCriterion("category_status not in", values, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusBetween(Byte value1, Byte value2) {
            addCriterion("category_status between", value1, value2, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("category_status not between", value1, value2, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedIsNull() {
            addCriterion("category_created is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedIsNotNull() {
            addCriterion("category_created is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedEqualTo(Date value) {
            addCriterion("category_created =", value, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedNotEqualTo(Date value) {
            addCriterion("category_created <>", value, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedGreaterThan(Date value) {
            addCriterion("category_created >", value, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("category_created >=", value, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedLessThan(Date value) {
            addCriterion("category_created <", value, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedLessThanOrEqualTo(Date value) {
            addCriterion("category_created <=", value, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedIn(List<Date> values) {
            addCriterion("category_created in", values, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedNotIn(List<Date> values) {
            addCriterion("category_created not in", values, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedBetween(Date value1, Date value2) {
            addCriterion("category_created between", value1, value2, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatedNotBetween(Date value1, Date value2) {
            addCriterion("category_created not between", value1, value2, "categoryCreated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedIsNull() {
            addCriterion("category_updated is null");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedIsNotNull() {
            addCriterion("category_updated is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedEqualTo(Date value) {
            addCriterion("category_updated =", value, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedNotEqualTo(Date value) {
            addCriterion("category_updated <>", value, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedGreaterThan(Date value) {
            addCriterion("category_updated >", value, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("category_updated >=", value, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedLessThan(Date value) {
            addCriterion("category_updated <", value, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("category_updated <=", value, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedIn(List<Date> values) {
            addCriterion("category_updated in", values, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedNotIn(List<Date> values) {
            addCriterion("category_updated not in", values, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedBetween(Date value1, Date value2) {
            addCriterion("category_updated between", value1, value2, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("category_updated not between", value1, value2, "categoryUpdated");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoIsNull() {
            addCriterion("category_memo is null");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoIsNotNull() {
            addCriterion("category_memo is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoEqualTo(String value) {
            addCriterion("category_memo =", value, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoNotEqualTo(String value) {
            addCriterion("category_memo <>", value, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoGreaterThan(String value) {
            addCriterion("category_memo >", value, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoGreaterThanOrEqualTo(String value) {
            addCriterion("category_memo >=", value, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoLessThan(String value) {
            addCriterion("category_memo <", value, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoLessThanOrEqualTo(String value) {
            addCriterion("category_memo <=", value, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoLike(String value) {
            addCriterion("category_memo like", value, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoNotLike(String value) {
            addCriterion("category_memo not like", value, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoIn(List<String> values) {
            addCriterion("category_memo in", values, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoNotIn(List<String> values) {
            addCriterion("category_memo not in", values, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoBetween(String value1, String value2) {
            addCriterion("category_memo between", value1, value2, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryMemoNotBetween(String value1, String value2) {
            addCriterion("category_memo not between", value1, value2, "categoryMemo");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIsNull() {
            addCriterion("category_title is null");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIsNotNull() {
            addCriterion("category_title is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleEqualTo(String value) {
            addCriterion("category_title =", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotEqualTo(String value) {
            addCriterion("category_title <>", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleGreaterThan(String value) {
            addCriterion("category_title >", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleGreaterThanOrEqualTo(String value) {
            addCriterion("category_title >=", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLessThan(String value) {
            addCriterion("category_title <", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLessThanOrEqualTo(String value) {
            addCriterion("category_title <=", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleLike(String value) {
            addCriterion("category_title like", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotLike(String value) {
            addCriterion("category_title not like", value, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleIn(List<String> values) {
            addCriterion("category_title in", values, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotIn(List<String> values) {
            addCriterion("category_title not in", values, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleBetween(String value1, String value2) {
            addCriterion("category_title between", value1, value2, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryTitleNotBetween(String value1, String value2) {
            addCriterion("category_title not between", value1, value2, "categoryTitle");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIsNull() {
            addCriterion("category_icon is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIsNotNull() {
            addCriterion("category_icon is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIconEqualTo(String value) {
            addCriterion("category_icon =", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotEqualTo(String value) {
            addCriterion("category_icon <>", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconGreaterThan(String value) {
            addCriterion("category_icon >", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconGreaterThanOrEqualTo(String value) {
            addCriterion("category_icon >=", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLessThan(String value) {
            addCriterion("category_icon <", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLessThanOrEqualTo(String value) {
            addCriterion("category_icon <=", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconLike(String value) {
            addCriterion("category_icon like", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotLike(String value) {
            addCriterion("category_icon not like", value, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconIn(List<String> values) {
            addCriterion("category_icon in", values, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotIn(List<String> values) {
            addCriterion("category_icon not in", values, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconBetween(String value1, String value2) {
            addCriterion("category_icon between", value1, value2, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryIconNotBetween(String value1, String value2) {
            addCriterion("category_icon not between", value1, value2, "categoryIcon");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderIsNull() {
            addCriterion("category_sort_order is null");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderIsNotNull() {
            addCriterion("category_sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderEqualTo(Integer value) {
            addCriterion("category_sort_order =", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderNotEqualTo(Integer value) {
            addCriterion("category_sort_order <>", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderGreaterThan(Integer value) {
            addCriterion("category_sort_order >", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_sort_order >=", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderLessThan(Integer value) {
            addCriterion("category_sort_order <", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("category_sort_order <=", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderIn(List<Integer> values) {
            addCriterion("category_sort_order in", values, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderNotIn(List<Integer> values) {
            addCriterion("category_sort_order not in", values, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderBetween(Integer value1, Integer value2) {
            addCriterion("category_sort_order between", value1, value2, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("category_sort_order not between", value1, value2, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIsNull() {
            addCriterion("category_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIsNotNull() {
            addCriterion("category_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdEqualTo(Long value) {
            addCriterion("category_parent_id =", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotEqualTo(Long value) {
            addCriterion("category_parent_id <>", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdGreaterThan(Long value) {
            addCriterion("category_parent_id >", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_parent_id >=", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdLessThan(Long value) {
            addCriterion("category_parent_id <", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdLessThanOrEqualTo(Long value) {
            addCriterion("category_parent_id <=", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIn(List<Long> values) {
            addCriterion("category_parent_id in", values, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotIn(List<Long> values) {
            addCriterion("category_parent_id not in", values, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdBetween(Long value1, Long value2) {
            addCriterion("category_parent_id between", value1, value2, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotBetween(Long value1, Long value2) {
            addCriterion("category_parent_id not between", value1, value2, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndIsNull() {
            addCriterion("category_is_end is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndIsNotNull() {
            addCriterion("category_is_end is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndEqualTo(Byte value) {
            addCriterion("category_is_end =", value, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndNotEqualTo(Byte value) {
            addCriterion("category_is_end <>", value, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndGreaterThan(Byte value) {
            addCriterion("category_is_end >", value, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndGreaterThanOrEqualTo(Byte value) {
            addCriterion("category_is_end >=", value, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndLessThan(Byte value) {
            addCriterion("category_is_end <", value, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndLessThanOrEqualTo(Byte value) {
            addCriterion("category_is_end <=", value, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndIn(List<Byte> values) {
            addCriterion("category_is_end in", values, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndNotIn(List<Byte> values) {
            addCriterion("category_is_end not in", values, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndBetween(Byte value1, Byte value2) {
            addCriterion("category_is_end between", value1, value2, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryIsEndNotBetween(Byte value1, Byte value2) {
            addCriterion("category_is_end not between", value1, value2, "categoryIsEnd");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumIsNull() {
            addCriterion("category_item_num is null");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumIsNotNull() {
            addCriterion("category_item_num is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumEqualTo(Integer value) {
            addCriterion("category_item_num =", value, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumNotEqualTo(Integer value) {
            addCriterion("category_item_num <>", value, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumGreaterThan(Integer value) {
            addCriterion("category_item_num >", value, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_item_num >=", value, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumLessThan(Integer value) {
            addCriterion("category_item_num <", value, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumLessThanOrEqualTo(Integer value) {
            addCriterion("category_item_num <=", value, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumIn(List<Integer> values) {
            addCriterion("category_item_num in", values, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumNotIn(List<Integer> values) {
            addCriterion("category_item_num not in", values, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumBetween(Integer value1, Integer value2) {
            addCriterion("category_item_num between", value1, value2, "categoryItemNum");
            return (Criteria) this;
        }

        public Criteria andCategoryItemNumNotBetween(Integer value1, Integer value2) {
            addCriterion("category_item_num not between", value1, value2, "categoryItemNum");
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