package com.yoke.ego.common.pojo;

import java.io.Serializable;

public class ItemImage implements Serializable {
    private Long itemImageId;

    private Long itemImageAttributeId;

    private String itemImageUrl;

    private static final long serialVersionUID = 1L;

    public ItemImage(Long itemImageId, Long itemImageAttributeId, String itemImageUrl) {
        this.itemImageId = itemImageId;
        this.itemImageAttributeId = itemImageAttributeId;
        this.itemImageUrl = itemImageUrl;
    }

    public ItemImage() {
        super();
    }

    public Long getItemImageId() {
        return itemImageId;
    }

    public void setItemImageId(Long itemImageId) {
        this.itemImageId = itemImageId;
    }

    public Long getItemImageAttributeId() {
        return itemImageAttributeId;
    }

    public void setItemImageAttributeId(Long itemImageAttributeId) {
        this.itemImageAttributeId = itemImageAttributeId;
    }

    public String getItemImageUrl() {
        return itemImageUrl;
    }

    public void setItemImageUrl(String itemImageUrl) {
        this.itemImageUrl = itemImageUrl == null ? null : itemImageUrl.trim();
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
        ItemImage other = (ItemImage) that;
        return (this.getItemImageId() == null ? other.getItemImageId() == null : this.getItemImageId().equals(other.getItemImageId()))
            && (this.getItemImageAttributeId() == null ? other.getItemImageAttributeId() == null : this.getItemImageAttributeId().equals(other.getItemImageAttributeId()))
            && (this.getItemImageUrl() == null ? other.getItemImageUrl() == null : this.getItemImageUrl().equals(other.getItemImageUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemImageId() == null) ? 0 : getItemImageId().hashCode());
        result = prime * result + ((getItemImageAttributeId() == null) ? 0 : getItemImageAttributeId().hashCode());
        result = prime * result + ((getItemImageUrl() == null) ? 0 : getItemImageUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemImageId=").append(itemImageId);
        sb.append(", itemImageAttributeId=").append(itemImageAttributeId);
        sb.append(", itemImageUrl=").append(itemImageUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}