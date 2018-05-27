package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class Attribute implements Serializable {
    private Long itemAttributeId;

    private String itemAttributeData;

    private Date itemAttributeCreated;

    private Date itemAttributeUpdated;

    private Integer itemAttributeCount;

    private Float itemAttributePrice;

    private Integer itemAttributeLimitNum;

    private Long itemAttributeItemId;

    private static final long serialVersionUID = 1L;

    public Attribute(Long itemAttributeId, String itemAttributeData, Date itemAttributeCreated, Date itemAttributeUpdated, Integer itemAttributeCount, Float itemAttributePrice, Integer itemAttributeLimitNum, Long itemAttributeItemId) {
        this.itemAttributeId = itemAttributeId;
        this.itemAttributeData = itemAttributeData;
        this.itemAttributeCreated = itemAttributeCreated;
        this.itemAttributeUpdated = itemAttributeUpdated;
        this.itemAttributeCount = itemAttributeCount;
        this.itemAttributePrice = itemAttributePrice;
        this.itemAttributeLimitNum = itemAttributeLimitNum;
        this.itemAttributeItemId = itemAttributeItemId;
    }

    public Attribute() {
        super();
    }

    public Long getItemAttributeId() {
        return itemAttributeId;
    }

    public void setItemAttributeId(Long itemAttributeId) {
        this.itemAttributeId = itemAttributeId;
    }

    public String getItemAttributeData() {
        return itemAttributeData;
    }

    public void setItemAttributeData(String itemAttributeData) {
        this.itemAttributeData = itemAttributeData == null ? null : itemAttributeData.trim();
    }

    public Date getItemAttributeCreated() {
        return itemAttributeCreated;
    }

    public void setItemAttributeCreated(Date itemAttributeCreated) {
        this.itemAttributeCreated = itemAttributeCreated;
    }

    public Date getItemAttributeUpdated() {
        return itemAttributeUpdated;
    }

    public void setItemAttributeUpdated(Date itemAttributeUpdated) {
        this.itemAttributeUpdated = itemAttributeUpdated;
    }

    public Integer getItemAttributeCount() {
        return itemAttributeCount;
    }

    public void setItemAttributeCount(Integer itemAttributeCount) {
        this.itemAttributeCount = itemAttributeCount;
    }

    public Float getItemAttributePrice() {
        return itemAttributePrice;
    }

    public void setItemAttributePrice(Float itemAttributePrice) {
        this.itemAttributePrice = itemAttributePrice;
    }

    public Integer getItemAttributeLimitNum() {
        return itemAttributeLimitNum;
    }

    public void setItemAttributeLimitNum(Integer itemAttributeLimitNum) {
        this.itemAttributeLimitNum = itemAttributeLimitNum;
    }

    public Long getItemAttributeItemId() {
        return itemAttributeItemId;
    }

    public void setItemAttributeItemId(Long itemAttributeItemId) {
        this.itemAttributeItemId = itemAttributeItemId;
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
        Attribute other = (Attribute) that;
        return (this.getItemAttributeId() == null ? other.getItemAttributeId() == null : this.getItemAttributeId().equals(other.getItemAttributeId()))
            && (this.getItemAttributeData() == null ? other.getItemAttributeData() == null : this.getItemAttributeData().equals(other.getItemAttributeData()))
            && (this.getItemAttributeCreated() == null ? other.getItemAttributeCreated() == null : this.getItemAttributeCreated().equals(other.getItemAttributeCreated()))
            && (this.getItemAttributeUpdated() == null ? other.getItemAttributeUpdated() == null : this.getItemAttributeUpdated().equals(other.getItemAttributeUpdated()))
            && (this.getItemAttributeCount() == null ? other.getItemAttributeCount() == null : this.getItemAttributeCount().equals(other.getItemAttributeCount()))
            && (this.getItemAttributePrice() == null ? other.getItemAttributePrice() == null : this.getItemAttributePrice().equals(other.getItemAttributePrice()))
            && (this.getItemAttributeLimitNum() == null ? other.getItemAttributeLimitNum() == null : this.getItemAttributeLimitNum().equals(other.getItemAttributeLimitNum()))
            && (this.getItemAttributeItemId() == null ? other.getItemAttributeItemId() == null : this.getItemAttributeItemId().equals(other.getItemAttributeItemId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemAttributeId() == null) ? 0 : getItemAttributeId().hashCode());
        result = prime * result + ((getItemAttributeData() == null) ? 0 : getItemAttributeData().hashCode());
        result = prime * result + ((getItemAttributeCreated() == null) ? 0 : getItemAttributeCreated().hashCode());
        result = prime * result + ((getItemAttributeUpdated() == null) ? 0 : getItemAttributeUpdated().hashCode());
        result = prime * result + ((getItemAttributeCount() == null) ? 0 : getItemAttributeCount().hashCode());
        result = prime * result + ((getItemAttributePrice() == null) ? 0 : getItemAttributePrice().hashCode());
        result = prime * result + ((getItemAttributeLimitNum() == null) ? 0 : getItemAttributeLimitNum().hashCode());
        result = prime * result + ((getItemAttributeItemId() == null) ? 0 : getItemAttributeItemId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemAttributeId=").append(itemAttributeId);
        sb.append(", itemAttributeData=").append(itemAttributeData);
        sb.append(", itemAttributeCreated=").append(itemAttributeCreated);
        sb.append(", itemAttributeUpdated=").append(itemAttributeUpdated);
        sb.append(", itemAttributeCount=").append(itemAttributeCount);
        sb.append(", itemAttributePrice=").append(itemAttributePrice);
        sb.append(", itemAttributeLimitNum=").append(itemAttributeLimitNum);
        sb.append(", itemAttributeItemId=").append(itemAttributeItemId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}