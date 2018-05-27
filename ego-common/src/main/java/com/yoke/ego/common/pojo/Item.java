package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class Item implements Serializable {
    private Long itemId;

    private Byte itemStatus;

    private Date itemCreated;

    private Date itemUpdated;

    private String itemMemo;

    private String itemTitle;

    private String itemImage;

    private Long itemCategoryId;

    private Long itemSellNum;

    private Byte itemIsbag;

    private Long itemSellId;

    private static final long serialVersionUID = 1L;

    public Item(Long itemId, Byte itemStatus, Date itemCreated, Date itemUpdated, String itemMemo, String itemTitle, String itemImage, Long itemCategoryId, Long itemSellNum, Byte itemIsbag, Long itemSellId) {
        this.itemId = itemId;
        this.itemStatus = itemStatus;
        this.itemCreated = itemCreated;
        this.itemUpdated = itemUpdated;
        this.itemMemo = itemMemo;
        this.itemTitle = itemTitle;
        this.itemImage = itemImage;
        this.itemCategoryId = itemCategoryId;
        this.itemSellNum = itemSellNum;
        this.itemIsbag = itemIsbag;
        this.itemSellId = itemSellId;
    }

    public Item() {
        super();
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Byte getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Byte itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Date getItemCreated() {
        return itemCreated;
    }

    public void setItemCreated(Date itemCreated) {
        this.itemCreated = itemCreated;
    }

    public Date getItemUpdated() {
        return itemUpdated;
    }

    public void setItemUpdated(Date itemUpdated) {
        this.itemUpdated = itemUpdated;
    }

    public String getItemMemo() {
        return itemMemo;
    }

    public void setItemMemo(String itemMemo) {
        this.itemMemo = itemMemo == null ? null : itemMemo.trim();
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle == null ? null : itemTitle.trim();
    }

    public String getItemImage() {
        return itemImage;
    }

    public void setItemImage(String itemImage) {
        this.itemImage = itemImage == null ? null : itemImage.trim();
    }

    public Long getItemCategoryId() {
        return itemCategoryId;
    }

    public void setItemCategoryId(Long itemCategoryId) {
        this.itemCategoryId = itemCategoryId;
    }

    public Long getItemSellNum() {
        return itemSellNum;
    }

    public void setItemSellNum(Long itemSellNum) {
        this.itemSellNum = itemSellNum;
    }

    public Byte getItemIsbag() {
        return itemIsbag;
    }

    public void setItemIsbag(Byte itemIsbag) {
        this.itemIsbag = itemIsbag;
    }

    public Long getItemSellId() {
        return itemSellId;
    }

    public void setItemSellId(Long itemSellId) {
        this.itemSellId = itemSellId;
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
        Item other = (Item) that;
        return (this.getItemId() == null ? other.getItemId() == null : this.getItemId().equals(other.getItemId()))
            && (this.getItemStatus() == null ? other.getItemStatus() == null : this.getItemStatus().equals(other.getItemStatus()))
            && (this.getItemCreated() == null ? other.getItemCreated() == null : this.getItemCreated().equals(other.getItemCreated()))
            && (this.getItemUpdated() == null ? other.getItemUpdated() == null : this.getItemUpdated().equals(other.getItemUpdated()))
            && (this.getItemMemo() == null ? other.getItemMemo() == null : this.getItemMemo().equals(other.getItemMemo()))
            && (this.getItemTitle() == null ? other.getItemTitle() == null : this.getItemTitle().equals(other.getItemTitle()))
            && (this.getItemImage() == null ? other.getItemImage() == null : this.getItemImage().equals(other.getItemImage()))
            && (this.getItemCategoryId() == null ? other.getItemCategoryId() == null : this.getItemCategoryId().equals(other.getItemCategoryId()))
            && (this.getItemSellNum() == null ? other.getItemSellNum() == null : this.getItemSellNum().equals(other.getItemSellNum()))
            && (this.getItemIsbag() == null ? other.getItemIsbag() == null : this.getItemIsbag().equals(other.getItemIsbag()))
            && (this.getItemSellId() == null ? other.getItemSellId() == null : this.getItemSellId().equals(other.getItemSellId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItemId() == null) ? 0 : getItemId().hashCode());
        result = prime * result + ((getItemStatus() == null) ? 0 : getItemStatus().hashCode());
        result = prime * result + ((getItemCreated() == null) ? 0 : getItemCreated().hashCode());
        result = prime * result + ((getItemUpdated() == null) ? 0 : getItemUpdated().hashCode());
        result = prime * result + ((getItemMemo() == null) ? 0 : getItemMemo().hashCode());
        result = prime * result + ((getItemTitle() == null) ? 0 : getItemTitle().hashCode());
        result = prime * result + ((getItemImage() == null) ? 0 : getItemImage().hashCode());
        result = prime * result + ((getItemCategoryId() == null) ? 0 : getItemCategoryId().hashCode());
        result = prime * result + ((getItemSellNum() == null) ? 0 : getItemSellNum().hashCode());
        result = prime * result + ((getItemIsbag() == null) ? 0 : getItemIsbag().hashCode());
        result = prime * result + ((getItemSellId() == null) ? 0 : getItemSellId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemId=").append(itemId);
        sb.append(", itemStatus=").append(itemStatus);
        sb.append(", itemCreated=").append(itemCreated);
        sb.append(", itemUpdated=").append(itemUpdated);
        sb.append(", itemMemo=").append(itemMemo);
        sb.append(", itemTitle=").append(itemTitle);
        sb.append(", itemImage=").append(itemImage);
        sb.append(", itemCategoryId=").append(itemCategoryId);
        sb.append(", itemSellNum=").append(itemSellNum);
        sb.append(", itemIsbag=").append(itemIsbag);
        sb.append(", itemSellId=").append(itemSellId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}