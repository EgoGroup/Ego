package com.yoke.ego.common.pojo;

import java.io.Serializable;

public class Address implements Serializable {
    private Long userAddressId;

    private Long userAddressUserId;

    private String userTel;

    private String userAddressName;

    private String userAddressStreetName;

    private static final long serialVersionUID = 1L;

    public Address(Long userAddressId, Long userAddressUserId, String userTel, String userAddressName, String userAddressStreetName) {
        this.userAddressId = userAddressId;
        this.userAddressUserId = userAddressUserId;
        this.userTel = userTel;
        this.userAddressName = userAddressName;
        this.userAddressStreetName = userAddressStreetName;
    }

    public Address() {
        super();
    }

    public Long getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(Long userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Long getUserAddressUserId() {
        return userAddressUserId;
    }

    public void setUserAddressUserId(Long userAddressUserId) {
        this.userAddressUserId = userAddressUserId;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserAddressName() {
        return userAddressName;
    }

    public void setUserAddressName(String userAddressName) {
        this.userAddressName = userAddressName == null ? null : userAddressName.trim();
    }

    public String getUserAddressStreetName() {
        return userAddressStreetName;
    }

    public void setUserAddressStreetName(String userAddressStreetName) {
        this.userAddressStreetName = userAddressStreetName == null ? null : userAddressStreetName.trim();
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
        Address other = (Address) that;
        return (this.getUserAddressId() == null ? other.getUserAddressId() == null : this.getUserAddressId().equals(other.getUserAddressId()))
            && (this.getUserAddressUserId() == null ? other.getUserAddressUserId() == null : this.getUserAddressUserId().equals(other.getUserAddressUserId()))
            && (this.getUserTel() == null ? other.getUserTel() == null : this.getUserTel().equals(other.getUserTel()))
            && (this.getUserAddressName() == null ? other.getUserAddressName() == null : this.getUserAddressName().equals(other.getUserAddressName()))
            && (this.getUserAddressStreetName() == null ? other.getUserAddressStreetName() == null : this.getUserAddressStreetName().equals(other.getUserAddressStreetName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserAddressId() == null) ? 0 : getUserAddressId().hashCode());
        result = prime * result + ((getUserAddressUserId() == null) ? 0 : getUserAddressUserId().hashCode());
        result = prime * result + ((getUserTel() == null) ? 0 : getUserTel().hashCode());
        result = prime * result + ((getUserAddressName() == null) ? 0 : getUserAddressName().hashCode());
        result = prime * result + ((getUserAddressStreetName() == null) ? 0 : getUserAddressStreetName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userAddressId=").append(userAddressId);
        sb.append(", userAddressUserId=").append(userAddressUserId);
        sb.append(", userTel=").append(userTel);
        sb.append(", userAddressName=").append(userAddressName);
        sb.append(", userAddressStreetName=").append(userAddressStreetName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}