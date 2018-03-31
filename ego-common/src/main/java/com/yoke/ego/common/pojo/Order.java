package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Long orderId;

    private String orderMemo;

    private Byte orderStatus;

    private Integer orderCount;

    private Float orderPostFee;

    private Float orderUnitPrice;

    private Float orderPayment;

    private Date orderConsignTime;

    private Date orderUpdated;

    private Date orderCreated;

    private Integer orderPaymentType;

    private String orderShoppingName;

    private Long orderByerId;

    private String orderShoppingCode;

    private Byte orderBuyerRate;

    private String orderUserStoreName;

    private Date orderReceipt;

    private String orderUserName;

    private String orderBuyMessage;

    private Long orderUserId;

    private static final long serialVersionUID = 1L;

    public Order(Long orderId, String orderMemo, Byte orderStatus, Integer orderCount, Float orderPostFee, Float orderUnitPrice, Float orderPayment, Date orderConsignTime, Date orderUpdated, Date orderCreated, Integer orderPaymentType, String orderShoppingName, Long orderByerId, String orderShoppingCode, Byte orderBuyerRate, String orderUserStoreName, Date orderReceipt, String orderUserName, String orderBuyMessage, Long orderUserId) {
        this.orderId = orderId;
        this.orderMemo = orderMemo;
        this.orderStatus = orderStatus;
        this.orderCount = orderCount;
        this.orderPostFee = orderPostFee;
        this.orderUnitPrice = orderUnitPrice;
        this.orderPayment = orderPayment;
        this.orderConsignTime = orderConsignTime;
        this.orderUpdated = orderUpdated;
        this.orderCreated = orderCreated;
        this.orderPaymentType = orderPaymentType;
        this.orderShoppingName = orderShoppingName;
        this.orderByerId = orderByerId;
        this.orderShoppingCode = orderShoppingCode;
        this.orderBuyerRate = orderBuyerRate;
        this.orderUserStoreName = orderUserStoreName;
        this.orderReceipt = orderReceipt;
        this.orderUserName = orderUserName;
        this.orderBuyMessage = orderBuyMessage;
        this.orderUserId = orderUserId;
    }

    public Order() {
        super();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderMemo() {
        return orderMemo;
    }

    public void setOrderMemo(String orderMemo) {
        this.orderMemo = orderMemo == null ? null : orderMemo.trim();
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Float getOrderPostFee() {
        return orderPostFee;
    }

    public void setOrderPostFee(Float orderPostFee) {
        this.orderPostFee = orderPostFee;
    }

    public Float getOrderUnitPrice() {
        return orderUnitPrice;
    }

    public void setOrderUnitPrice(Float orderUnitPrice) {
        this.orderUnitPrice = orderUnitPrice;
    }

    public Float getOrderPayment() {
        return orderPayment;
    }

    public void setOrderPayment(Float orderPayment) {
        this.orderPayment = orderPayment;
    }

    public Date getOrderConsignTime() {
        return orderConsignTime;
    }

    public void setOrderConsignTime(Date orderConsignTime) {
        this.orderConsignTime = orderConsignTime;
    }

    public Date getOrderUpdated() {
        return orderUpdated;
    }

    public void setOrderUpdated(Date orderUpdated) {
        this.orderUpdated = orderUpdated;
    }

    public Date getOrderCreated() {
        return orderCreated;
    }

    public void setOrderCreated(Date orderCreated) {
        this.orderCreated = orderCreated;
    }

    public Integer getOrderPaymentType() {
        return orderPaymentType;
    }

    public void setOrderPaymentType(Integer orderPaymentType) {
        this.orderPaymentType = orderPaymentType;
    }

    public String getOrderShoppingName() {
        return orderShoppingName;
    }

    public void setOrderShoppingName(String orderShoppingName) {
        this.orderShoppingName = orderShoppingName == null ? null : orderShoppingName.trim();
    }

    public Long getOrderByerId() {
        return orderByerId;
    }

    public void setOrderByerId(Long orderByerId) {
        this.orderByerId = orderByerId;
    }

    public String getOrderShoppingCode() {
        return orderShoppingCode;
    }

    public void setOrderShoppingCode(String orderShoppingCode) {
        this.orderShoppingCode = orderShoppingCode == null ? null : orderShoppingCode.trim();
    }

    public Byte getOrderBuyerRate() {
        return orderBuyerRate;
    }

    public void setOrderBuyerRate(Byte orderBuyerRate) {
        this.orderBuyerRate = orderBuyerRate;
    }

    public String getOrderUserStoreName() {
        return orderUserStoreName;
    }

    public void setOrderUserStoreName(String orderUserStoreName) {
        this.orderUserStoreName = orderUserStoreName == null ? null : orderUserStoreName.trim();
    }

    public Date getOrderReceipt() {
        return orderReceipt;
    }

    public void setOrderReceipt(Date orderReceipt) {
        this.orderReceipt = orderReceipt;
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public void setOrderUserName(String orderUserName) {
        this.orderUserName = orderUserName == null ? null : orderUserName.trim();
    }

    public String getOrderBuyMessage() {
        return orderBuyMessage;
    }

    public void setOrderBuyMessage(String orderBuyMessage) {
        this.orderBuyMessage = orderBuyMessage == null ? null : orderBuyMessage.trim();
    }

    public Long getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Long orderUserId) {
        this.orderUserId = orderUserId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getOrderMemo() == null ? other.getOrderMemo() == null : this.getOrderMemo().equals(other.getOrderMemo()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getOrderCount() == null ? other.getOrderCount() == null : this.getOrderCount().equals(other.getOrderCount()))
            && (this.getOrderPostFee() == null ? other.getOrderPostFee() == null : this.getOrderPostFee().equals(other.getOrderPostFee()))
            && (this.getOrderUnitPrice() == null ? other.getOrderUnitPrice() == null : this.getOrderUnitPrice().equals(other.getOrderUnitPrice()))
            && (this.getOrderPayment() == null ? other.getOrderPayment() == null : this.getOrderPayment().equals(other.getOrderPayment()))
            && (this.getOrderConsignTime() == null ? other.getOrderConsignTime() == null : this.getOrderConsignTime().equals(other.getOrderConsignTime()))
            && (this.getOrderUpdated() == null ? other.getOrderUpdated() == null : this.getOrderUpdated().equals(other.getOrderUpdated()))
            && (this.getOrderCreated() == null ? other.getOrderCreated() == null : this.getOrderCreated().equals(other.getOrderCreated()))
            && (this.getOrderPaymentType() == null ? other.getOrderPaymentType() == null : this.getOrderPaymentType().equals(other.getOrderPaymentType()))
            && (this.getOrderShoppingName() == null ? other.getOrderShoppingName() == null : this.getOrderShoppingName().equals(other.getOrderShoppingName()))
            && (this.getOrderByerId() == null ? other.getOrderByerId() == null : this.getOrderByerId().equals(other.getOrderByerId()))
            && (this.getOrderShoppingCode() == null ? other.getOrderShoppingCode() == null : this.getOrderShoppingCode().equals(other.getOrderShoppingCode()))
            && (this.getOrderBuyerRate() == null ? other.getOrderBuyerRate() == null : this.getOrderBuyerRate().equals(other.getOrderBuyerRate()))
            && (this.getOrderUserStoreName() == null ? other.getOrderUserStoreName() == null : this.getOrderUserStoreName().equals(other.getOrderUserStoreName()))
            && (this.getOrderReceipt() == null ? other.getOrderReceipt() == null : this.getOrderReceipt().equals(other.getOrderReceipt()))
            && (this.getOrderUserName() == null ? other.getOrderUserName() == null : this.getOrderUserName().equals(other.getOrderUserName()))
            && (this.getOrderBuyMessage() == null ? other.getOrderBuyMessage() == null : this.getOrderBuyMessage().equals(other.getOrderBuyMessage()))
            && (this.getOrderUserId() == null ? other.getOrderUserId() == null : this.getOrderUserId().equals(other.getOrderUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getOrderMemo() == null) ? 0 : getOrderMemo().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getOrderCount() == null) ? 0 : getOrderCount().hashCode());
        result = prime * result + ((getOrderPostFee() == null) ? 0 : getOrderPostFee().hashCode());
        result = prime * result + ((getOrderUnitPrice() == null) ? 0 : getOrderUnitPrice().hashCode());
        result = prime * result + ((getOrderPayment() == null) ? 0 : getOrderPayment().hashCode());
        result = prime * result + ((getOrderConsignTime() == null) ? 0 : getOrderConsignTime().hashCode());
        result = prime * result + ((getOrderUpdated() == null) ? 0 : getOrderUpdated().hashCode());
        result = prime * result + ((getOrderCreated() == null) ? 0 : getOrderCreated().hashCode());
        result = prime * result + ((getOrderPaymentType() == null) ? 0 : getOrderPaymentType().hashCode());
        result = prime * result + ((getOrderShoppingName() == null) ? 0 : getOrderShoppingName().hashCode());
        result = prime * result + ((getOrderByerId() == null) ? 0 : getOrderByerId().hashCode());
        result = prime * result + ((getOrderShoppingCode() == null) ? 0 : getOrderShoppingCode().hashCode());
        result = prime * result + ((getOrderBuyerRate() == null) ? 0 : getOrderBuyerRate().hashCode());
        result = prime * result + ((getOrderUserStoreName() == null) ? 0 : getOrderUserStoreName().hashCode());
        result = prime * result + ((getOrderReceipt() == null) ? 0 : getOrderReceipt().hashCode());
        result = prime * result + ((getOrderUserName() == null) ? 0 : getOrderUserName().hashCode());
        result = prime * result + ((getOrderBuyMessage() == null) ? 0 : getOrderBuyMessage().hashCode());
        result = prime * result + ((getOrderUserId() == null) ? 0 : getOrderUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", orderMemo=").append(orderMemo);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderCount=").append(orderCount);
        sb.append(", orderPostFee=").append(orderPostFee);
        sb.append(", orderUnitPrice=").append(orderUnitPrice);
        sb.append(", orderPayment=").append(orderPayment);
        sb.append(", orderConsignTime=").append(orderConsignTime);
        sb.append(", orderUpdated=").append(orderUpdated);
        sb.append(", orderCreated=").append(orderCreated);
        sb.append(", orderPaymentType=").append(orderPaymentType);
        sb.append(", orderShoppingName=").append(orderShoppingName);
        sb.append(", orderByerId=").append(orderByerId);
        sb.append(", orderShoppingCode=").append(orderShoppingCode);
        sb.append(", orderBuyerRate=").append(orderBuyerRate);
        sb.append(", orderUserStoreName=").append(orderUserStoreName);
        sb.append(", orderReceipt=").append(orderReceipt);
        sb.append(", orderUserName=").append(orderUserName);
        sb.append(", orderBuyMessage=").append(orderBuyMessage);
        sb.append(", orderUserId=").append(orderUserId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}