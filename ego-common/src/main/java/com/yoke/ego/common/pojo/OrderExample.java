package com.yoke.ego.common.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIsNull() {
            addCriterion("order_memo is null");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIsNotNull() {
            addCriterion("order_memo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMemoEqualTo(String value) {
            addCriterion("order_memo =", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotEqualTo(String value) {
            addCriterion("order_memo <>", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoGreaterThan(String value) {
            addCriterion("order_memo >", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoGreaterThanOrEqualTo(String value) {
            addCriterion("order_memo >=", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLessThan(String value) {
            addCriterion("order_memo <", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLessThanOrEqualTo(String value) {
            addCriterion("order_memo <=", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLike(String value) {
            addCriterion("order_memo like", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotLike(String value) {
            addCriterion("order_memo not like", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIn(List<String> values) {
            addCriterion("order_memo in", values, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotIn(List<String> values) {
            addCriterion("order_memo not in", values, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoBetween(String value1, String value2) {
            addCriterion("order_memo between", value1, value2, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotBetween(String value1, String value2) {
            addCriterion("order_memo not between", value1, value2, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Integer value) {
            addCriterion("order_count =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Integer value) {
            addCriterion("order_count >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Integer value) {
            addCriterion("order_count <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Integer> values) {
            addCriterion("order_count in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeIsNull() {
            addCriterion("order_post_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeIsNotNull() {
            addCriterion("order_post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeEqualTo(Float value) {
            addCriterion("order_post_fee =", value, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeNotEqualTo(Float value) {
            addCriterion("order_post_fee <>", value, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeGreaterThan(Float value) {
            addCriterion("order_post_fee >", value, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("order_post_fee >=", value, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeLessThan(Float value) {
            addCriterion("order_post_fee <", value, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeLessThanOrEqualTo(Float value) {
            addCriterion("order_post_fee <=", value, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeIn(List<Float> values) {
            addCriterion("order_post_fee in", values, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeNotIn(List<Float> values) {
            addCriterion("order_post_fee not in", values, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeBetween(Float value1, Float value2) {
            addCriterion("order_post_fee between", value1, value2, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderPostFeeNotBetween(Float value1, Float value2) {
            addCriterion("order_post_fee not between", value1, value2, "orderPostFee");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceIsNull() {
            addCriterion("order_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceIsNotNull() {
            addCriterion("order_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceEqualTo(Float value) {
            addCriterion("order_unit_price =", value, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceNotEqualTo(Float value) {
            addCriterion("order_unit_price <>", value, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceGreaterThan(Float value) {
            addCriterion("order_unit_price >", value, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("order_unit_price >=", value, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceLessThan(Float value) {
            addCriterion("order_unit_price <", value, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceLessThanOrEqualTo(Float value) {
            addCriterion("order_unit_price <=", value, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceIn(List<Float> values) {
            addCriterion("order_unit_price in", values, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceNotIn(List<Float> values) {
            addCriterion("order_unit_price not in", values, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceBetween(Float value1, Float value2) {
            addCriterion("order_unit_price between", value1, value2, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderUnitPriceNotBetween(Float value1, Float value2) {
            addCriterion("order_unit_price not between", value1, value2, "orderUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIsNull() {
            addCriterion("order_payment is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIsNotNull() {
            addCriterion("order_payment is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentEqualTo(Float value) {
            addCriterion("order_payment =", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentNotEqualTo(Float value) {
            addCriterion("order_payment <>", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentGreaterThan(Float value) {
            addCriterion("order_payment >", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentGreaterThanOrEqualTo(Float value) {
            addCriterion("order_payment >=", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentLessThan(Float value) {
            addCriterion("order_payment <", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentLessThanOrEqualTo(Float value) {
            addCriterion("order_payment <=", value, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentIn(List<Float> values) {
            addCriterion("order_payment in", values, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentNotIn(List<Float> values) {
            addCriterion("order_payment not in", values, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentBetween(Float value1, Float value2) {
            addCriterion("order_payment between", value1, value2, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentNotBetween(Float value1, Float value2) {
            addCriterion("order_payment not between", value1, value2, "orderPayment");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeIsNull() {
            addCriterion("order_consign_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeIsNotNull() {
            addCriterion("order_consign_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeEqualTo(Date value) {
            addCriterion("order_consign_time =", value, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeNotEqualTo(Date value) {
            addCriterion("order_consign_time <>", value, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeGreaterThan(Date value) {
            addCriterion("order_consign_time >", value, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_consign_time >=", value, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeLessThan(Date value) {
            addCriterion("order_consign_time <", value, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_consign_time <=", value, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeIn(List<Date> values) {
            addCriterion("order_consign_time in", values, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeNotIn(List<Date> values) {
            addCriterion("order_consign_time not in", values, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeBetween(Date value1, Date value2) {
            addCriterion("order_consign_time between", value1, value2, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderConsignTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_consign_time not between", value1, value2, "orderConsignTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedIsNull() {
            addCriterion("order_updated is null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedIsNotNull() {
            addCriterion("order_updated is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedEqualTo(Date value) {
            addCriterion("order_updated =", value, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedNotEqualTo(Date value) {
            addCriterion("order_updated <>", value, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedGreaterThan(Date value) {
            addCriterion("order_updated >", value, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("order_updated >=", value, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedLessThan(Date value) {
            addCriterion("order_updated <", value, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("order_updated <=", value, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedIn(List<Date> values) {
            addCriterion("order_updated in", values, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedNotIn(List<Date> values) {
            addCriterion("order_updated not in", values, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedBetween(Date value1, Date value2) {
            addCriterion("order_updated between", value1, value2, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("order_updated not between", value1, value2, "orderUpdated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedIsNull() {
            addCriterion("order_created is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedIsNotNull() {
            addCriterion("order_created is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedEqualTo(Date value) {
            addCriterion("order_created =", value, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedNotEqualTo(Date value) {
            addCriterion("order_created <>", value, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedGreaterThan(Date value) {
            addCriterion("order_created >", value, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("order_created >=", value, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedLessThan(Date value) {
            addCriterion("order_created <", value, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedLessThanOrEqualTo(Date value) {
            addCriterion("order_created <=", value, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedIn(List<Date> values) {
            addCriterion("order_created in", values, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedNotIn(List<Date> values) {
            addCriterion("order_created not in", values, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedBetween(Date value1, Date value2) {
            addCriterion("order_created between", value1, value2, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderCreatedNotBetween(Date value1, Date value2) {
            addCriterion("order_created not between", value1, value2, "orderCreated");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeIsNull() {
            addCriterion("order_payment_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeIsNotNull() {
            addCriterion("order_payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeEqualTo(Integer value) {
            addCriterion("order_payment_type =", value, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeNotEqualTo(Integer value) {
            addCriterion("order_payment_type <>", value, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeGreaterThan(Integer value) {
            addCriterion("order_payment_type >", value, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_payment_type >=", value, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeLessThan(Integer value) {
            addCriterion("order_payment_type <", value, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_payment_type <=", value, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeIn(List<Integer> values) {
            addCriterion("order_payment_type in", values, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeNotIn(List<Integer> values) {
            addCriterion("order_payment_type not in", values, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_payment_type between", value1, value2, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_payment_type not between", value1, value2, "orderPaymentType");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameIsNull() {
            addCriterion("order_shopping_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameIsNotNull() {
            addCriterion("order_shopping_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameEqualTo(String value) {
            addCriterion("order_shopping_name =", value, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameNotEqualTo(String value) {
            addCriterion("order_shopping_name <>", value, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameGreaterThan(String value) {
            addCriterion("order_shopping_name >", value, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_shopping_name >=", value, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameLessThan(String value) {
            addCriterion("order_shopping_name <", value, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameLessThanOrEqualTo(String value) {
            addCriterion("order_shopping_name <=", value, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameLike(String value) {
            addCriterion("order_shopping_name like", value, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameNotLike(String value) {
            addCriterion("order_shopping_name not like", value, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameIn(List<String> values) {
            addCriterion("order_shopping_name in", values, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameNotIn(List<String> values) {
            addCriterion("order_shopping_name not in", values, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameBetween(String value1, String value2) {
            addCriterion("order_shopping_name between", value1, value2, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingNameNotBetween(String value1, String value2) {
            addCriterion("order_shopping_name not between", value1, value2, "orderShoppingName");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdIsNull() {
            addCriterion("order_byer_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdIsNotNull() {
            addCriterion("order_byer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdEqualTo(Long value) {
            addCriterion("order_byer_id =", value, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdNotEqualTo(Long value) {
            addCriterion("order_byer_id <>", value, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdGreaterThan(Long value) {
            addCriterion("order_byer_id >", value, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_byer_id >=", value, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdLessThan(Long value) {
            addCriterion("order_byer_id <", value, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdLessThanOrEqualTo(Long value) {
            addCriterion("order_byer_id <=", value, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdIn(List<Long> values) {
            addCriterion("order_byer_id in", values, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdNotIn(List<Long> values) {
            addCriterion("order_byer_id not in", values, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdBetween(Long value1, Long value2) {
            addCriterion("order_byer_id between", value1, value2, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderByerIdNotBetween(Long value1, Long value2) {
            addCriterion("order_byer_id not between", value1, value2, "orderByerId");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeIsNull() {
            addCriterion("order_shopping_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeIsNotNull() {
            addCriterion("order_shopping_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeEqualTo(String value) {
            addCriterion("order_shopping_code =", value, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeNotEqualTo(String value) {
            addCriterion("order_shopping_code <>", value, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeGreaterThan(String value) {
            addCriterion("order_shopping_code >", value, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_shopping_code >=", value, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeLessThan(String value) {
            addCriterion("order_shopping_code <", value, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeLessThanOrEqualTo(String value) {
            addCriterion("order_shopping_code <=", value, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeLike(String value) {
            addCriterion("order_shopping_code like", value, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeNotLike(String value) {
            addCriterion("order_shopping_code not like", value, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeIn(List<String> values) {
            addCriterion("order_shopping_code in", values, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeNotIn(List<String> values) {
            addCriterion("order_shopping_code not in", values, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeBetween(String value1, String value2) {
            addCriterion("order_shopping_code between", value1, value2, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderShoppingCodeNotBetween(String value1, String value2) {
            addCriterion("order_shopping_code not between", value1, value2, "orderShoppingCode");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateIsNull() {
            addCriterion("order_buyer_rate is null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateIsNotNull() {
            addCriterion("order_buyer_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateEqualTo(Byte value) {
            addCriterion("order_buyer_rate =", value, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateNotEqualTo(Byte value) {
            addCriterion("order_buyer_rate <>", value, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateGreaterThan(Byte value) {
            addCriterion("order_buyer_rate >", value, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_buyer_rate >=", value, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateLessThan(Byte value) {
            addCriterion("order_buyer_rate <", value, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateLessThanOrEqualTo(Byte value) {
            addCriterion("order_buyer_rate <=", value, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateIn(List<Byte> values) {
            addCriterion("order_buyer_rate in", values, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateNotIn(List<Byte> values) {
            addCriterion("order_buyer_rate not in", values, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateBetween(Byte value1, Byte value2) {
            addCriterion("order_buyer_rate between", value1, value2, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerRateNotBetween(Byte value1, Byte value2) {
            addCriterion("order_buyer_rate not between", value1, value2, "orderBuyerRate");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameIsNull() {
            addCriterion("order_user_store_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameIsNotNull() {
            addCriterion("order_user_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameEqualTo(String value) {
            addCriterion("order_user_store_name =", value, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameNotEqualTo(String value) {
            addCriterion("order_user_store_name <>", value, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameGreaterThan(String value) {
            addCriterion("order_user_store_name >", value, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_user_store_name >=", value, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameLessThan(String value) {
            addCriterion("order_user_store_name <", value, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameLessThanOrEqualTo(String value) {
            addCriterion("order_user_store_name <=", value, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameLike(String value) {
            addCriterion("order_user_store_name like", value, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameNotLike(String value) {
            addCriterion("order_user_store_name not like", value, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameIn(List<String> values) {
            addCriterion("order_user_store_name in", values, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameNotIn(List<String> values) {
            addCriterion("order_user_store_name not in", values, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameBetween(String value1, String value2) {
            addCriterion("order_user_store_name between", value1, value2, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderUserStoreNameNotBetween(String value1, String value2) {
            addCriterion("order_user_store_name not between", value1, value2, "orderUserStoreName");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptIsNull() {
            addCriterion("order_receipt is null");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptIsNotNull() {
            addCriterion("order_receipt is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptEqualTo(Date value) {
            addCriterion("order_receipt =", value, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptNotEqualTo(Date value) {
            addCriterion("order_receipt <>", value, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptGreaterThan(Date value) {
            addCriterion("order_receipt >", value, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptGreaterThanOrEqualTo(Date value) {
            addCriterion("order_receipt >=", value, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptLessThan(Date value) {
            addCriterion("order_receipt <", value, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptLessThanOrEqualTo(Date value) {
            addCriterion("order_receipt <=", value, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptIn(List<Date> values) {
            addCriterion("order_receipt in", values, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptNotIn(List<Date> values) {
            addCriterion("order_receipt not in", values, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptBetween(Date value1, Date value2) {
            addCriterion("order_receipt between", value1, value2, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderReceiptNotBetween(Date value1, Date value2) {
            addCriterion("order_receipt not between", value1, value2, "orderReceipt");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameIsNull() {
            addCriterion("order_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameIsNotNull() {
            addCriterion("order_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameEqualTo(String value) {
            addCriterion("order_user_name =", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameNotEqualTo(String value) {
            addCriterion("order_user_name <>", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameGreaterThan(String value) {
            addCriterion("order_user_name >", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_user_name >=", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameLessThan(String value) {
            addCriterion("order_user_name <", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameLessThanOrEqualTo(String value) {
            addCriterion("order_user_name <=", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameLike(String value) {
            addCriterion("order_user_name like", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameNotLike(String value) {
            addCriterion("order_user_name not like", value, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameIn(List<String> values) {
            addCriterion("order_user_name in", values, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameNotIn(List<String> values) {
            addCriterion("order_user_name not in", values, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameBetween(String value1, String value2) {
            addCriterion("order_user_name between", value1, value2, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderUserNameNotBetween(String value1, String value2) {
            addCriterion("order_user_name not between", value1, value2, "orderUserName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageIsNull() {
            addCriterion("order_buy_message is null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageIsNotNull() {
            addCriterion("order_buy_message is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageEqualTo(String value) {
            addCriterion("order_buy_message =", value, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageNotEqualTo(String value) {
            addCriterion("order_buy_message <>", value, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageGreaterThan(String value) {
            addCriterion("order_buy_message >", value, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageGreaterThanOrEqualTo(String value) {
            addCriterion("order_buy_message >=", value, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageLessThan(String value) {
            addCriterion("order_buy_message <", value, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageLessThanOrEqualTo(String value) {
            addCriterion("order_buy_message <=", value, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageLike(String value) {
            addCriterion("order_buy_message like", value, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageNotLike(String value) {
            addCriterion("order_buy_message not like", value, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageIn(List<String> values) {
            addCriterion("order_buy_message in", values, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageNotIn(List<String> values) {
            addCriterion("order_buy_message not in", values, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageBetween(String value1, String value2) {
            addCriterion("order_buy_message between", value1, value2, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyMessageNotBetween(String value1, String value2) {
            addCriterion("order_buy_message not between", value1, value2, "orderBuyMessage");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNull() {
            addCriterion("order_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNotNull() {
            addCriterion("order_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdEqualTo(Long value) {
            addCriterion("order_user_id =", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotEqualTo(Long value) {
            addCriterion("order_user_id <>", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThan(Long value) {
            addCriterion("order_user_id >", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_user_id >=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThan(Long value) {
            addCriterion("order_user_id <", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThanOrEqualTo(Long value) {
            addCriterion("order_user_id <=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIn(List<Long> values) {
            addCriterion("order_user_id in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotIn(List<Long> values) {
            addCriterion("order_user_id not in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdBetween(Long value1, Long value2) {
            addCriterion("order_user_id between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotBetween(Long value1, Long value2) {
            addCriterion("order_user_id not between", value1, value2, "orderUserId");
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