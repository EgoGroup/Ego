package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class ItemDesc implements Serializable {
    private Long itemDescId;

    private Date itemDescCreated;

    private Date itemDescUpdated;

    private Long itemDescItemId;

    private String itemDescText;

    private static final long serialVersionUID = 1L;

    public ItemDesc(Long itemDescId, Date itemDescCreated, Date itemDescUpdated, Long itemDescItemId) {
        this.itemDescId = itemDescId;
        this.itemDescCreated = itemDescCreated;
        this.itemDescUpdated = itemDescUpdated;
        this.itemDescItemId = itemDescItemId;
    }

    public ItemDesc(Long itemDescId, Date itemDescCreated, Date itemDescUpdated, Long itemDescItemId, String itemDescText) {
        this.itemDescId = itemDescId;
        this.itemDescCreated = itemDescCreated;
        this.itemDescUpdated = itemDescUpdated;
        this.itemDescItemId = itemDescItemId;
        this.itemDescText = itemDescText;
    }

    public ItemDesc() {
        super();
    }

    public Long getItemDescId() {
        return itemDescId;
    }

    public void setItemDescId(Long itemDescId) {
        this.itemDescId = itemDescId;
    }

    public Date getItemDescCreated() {
        return itemDescCreated;
    }

    public void setItemDescCreated(Date itemDescCreated) {
        this.itemDescCreated = itemDescCreated;
    }

    public Date getItemDescUpdated() {
        return itemDescUpdated;
    }

    public void setItemDescUpdated(Date itemDescUpdated) {
        this.itemDescUpdated = itemDescUpdated;
    }

    public Long getItemDescItemId() {
        return itemDescItemId;
    }

    public void setItemDescItemId(Long itemDescItemId) {
        this.itemDescItemId = itemDescItemId;
    }

    public String getItemDescText() {
        return itemDescText;
    }

    public void setItemDescText(String itemDescText) {
        this.itemDescText = itemDescText == null ? null : itemDescText.trim();
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
        ItemDesc other = (ItemDesc) that;
        return (this.getItemDescId() == null ? other.getItemDescId() == null : this.getItemDescId().equals(other.getItemDescId()))
            && (this.getItemDescCreated() == null ? other.getItemDescCreated() == null : this.getItemDescCreated().equals(other.getItemDescCreated()))
            && (this.getItemDescUpdated() == null ? other.getItemDescUpdated() == null : this.getItemDescUpdated().equals(other.getItemDescUpdated()))
            && (this.getItemDescItemId() == null ? other.getItemDescItemId() == null : this.getItemDescItemId().equals(other.getItemDescItemId()))
            && (this.getItemDescText() == null ? other.getItemDescText() == null : this.getItemDescText().equals(other.getItemDescText()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemDescId() == null) ? 0 : getItemDescId().hashCode());
        result = prime * result + ((getItemDescCreated() == null) ? 0 : getItemDescCreated().hashCode());
        result = prime * result + ((getItemDescUpdated() == null) ? 0 : getItemDescUpdated().hashCode());
        result = prime * result + ((getItemDescItemId() == null) ? 0 : getItemDescItemId().hashCode());
        result = prime * result + ((getItemDescText() == null) ? 0 : getItemDescText().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemDescId=").append(itemDescId);
        sb.append(", itemDescCreated=").append(itemDescCreated);
        sb.append(", itemDescUpdated=").append(itemDescUpdated);
        sb.append(", itemDescItemId=").append(itemDescItemId);
        sb.append(", itemDescText=").append(itemDescText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}