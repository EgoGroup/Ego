package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class Shopcart implements Serializable {
    private Long shopcartId;

    private Long shopcartUserId;

    private Date shopcartCreated;

    private Date shopcartUpdated;

    private String shopcartMemo;

    private Long shopcartItemId;

    private Integer shopcartCount;

    private Byte shopcartStatus;

    private static final long serialVersionUID = 1L;

    public Shopcart(Long shopcartId, Long shopcartUserId, Date shopcartCreated, Date shopcartUpdated, String shopcartMemo, Long shopcartItemId, Integer shopcartCount, Byte shopcartStatus) {
        this.shopcartId = shopcartId;
        this.shopcartUserId = shopcartUserId;
        this.shopcartCreated = shopcartCreated;
        this.shopcartUpdated = shopcartUpdated;
        this.shopcartMemo = shopcartMemo;
        this.shopcartItemId = shopcartItemId;
        this.shopcartCount = shopcartCount;
        this.shopcartStatus = shopcartStatus;
    }

    public Shopcart() {
        super();
    }

    public Long getShopcartId() {
        return shopcartId;
    }

    public void setShopcartId(Long shopcartId) {
        this.shopcartId = shopcartId;
    }

    public Long getShopcartUserId() {
        return shopcartUserId;
    }

    public void setShopcartUserId(Long shopcartUserId) {
        this.shopcartUserId = shopcartUserId;
    }

    public Date getShopcartCreated() {
        return shopcartCreated;
    }

    public void setShopcartCreated(Date shopcartCreated) {
        this.shopcartCreated = shopcartCreated;
    }

    public Date getShopcartUpdated() {
        return shopcartUpdated;
    }

    public void setShopcartUpdated(Date shopcartUpdated) {
        this.shopcartUpdated = shopcartUpdated;
    }

    public String getShopcartMemo() {
        return shopcartMemo;
    }

    public void setShopcartMemo(String shopcartMemo) {
        this.shopcartMemo = shopcartMemo == null ? null : shopcartMemo.trim();
    }

    public Long getShopcartItemId() {
        return shopcartItemId;
    }

    public void setShopcartItemId(Long shopcartItemId) {
        this.shopcartItemId = shopcartItemId;
    }

    public Integer getShopcartCount() {
        return shopcartCount;
    }

    public void setShopcartCount(Integer shopcartCount) {
        this.shopcartCount = shopcartCount;
    }

    public Byte getShopcartStatus() {
        return shopcartStatus;
    }

    public void setShopcartStatus(Byte shopcartStatus) {
        this.shopcartStatus = shopcartStatus;
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
        Shopcart other = (Shopcart) that;
        return (this.getShopcartId() == null ? other.getShopcartId() == null : this.getShopcartId().equals(other.getShopcartId()))
            && (this.getShopcartUserId() == null ? other.getShopcartUserId() == null : this.getShopcartUserId().equals(other.getShopcartUserId()))
            && (this.getShopcartCreated() == null ? other.getShopcartCreated() == null : this.getShopcartCreated().equals(other.getShopcartCreated()))
            && (this.getShopcartUpdated() == null ? other.getShopcartUpdated() == null : this.getShopcartUpdated().equals(other.getShopcartUpdated()))
            && (this.getShopcartMemo() == null ? other.getShopcartMemo() == null : this.getShopcartMemo().equals(other.getShopcartMemo()))
            && (this.getShopcartItemId() == null ? other.getShopcartItemId() == null : this.getShopcartItemId().equals(other.getShopcartItemId()))
            && (this.getShopcartCount() == null ? other.getShopcartCount() == null : this.getShopcartCount().equals(other.getShopcartCount()))
            && (this.getShopcartStatus() == null ? other.getShopcartStatus() == null : this.getShopcartStatus().equals(other.getShopcartStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getShopcartId() == null) ? 0 : getShopcartId().hashCode());
        result = prime * result + ((getShopcartUserId() == null) ? 0 : getShopcartUserId().hashCode());
        result = prime * result + ((getShopcartCreated() == null) ? 0 : getShopcartCreated().hashCode());
        result = prime * result + ((getShopcartUpdated() == null) ? 0 : getShopcartUpdated().hashCode());
        result = prime * result + ((getShopcartMemo() == null) ? 0 : getShopcartMemo().hashCode());
        result = prime * result + ((getShopcartItemId() == null) ? 0 : getShopcartItemId().hashCode());
        result = prime * result + ((getShopcartCount() == null) ? 0 : getShopcartCount().hashCode());
        result = prime * result + ((getShopcartStatus() == null) ? 0 : getShopcartStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopcartId=").append(shopcartId);
        sb.append(", shopcartUserId=").append(shopcartUserId);
        sb.append(", shopcartCreated=").append(shopcartCreated);
        sb.append(", shopcartUpdated=").append(shopcartUpdated);
        sb.append(", shopcartMemo=").append(shopcartMemo);
        sb.append(", shopcartItemId=").append(shopcartItemId);
        sb.append(", shopcartCount=").append(shopcartCount);
        sb.append(", shopcartStatus=").append(shopcartStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}