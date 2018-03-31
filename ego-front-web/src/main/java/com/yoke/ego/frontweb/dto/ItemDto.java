package com.yoke.ego.frontweb.dto;

import com.yoke.ego.common.pojo.Attribute;
import com.yoke.ego.common.pojo.ItemImage;

import java.util.List;

/**
 * Created by Yoke on 2018/3/28
 */
public class ItemDto {
    private Long id;

    private String itemMemo;

    private Long itemSellNum;
    private Byte itemIsbag;
    /**
     * 商品不通参数的集合
     */
    List<Attribute> attributes;
    /**
     * 商品图片的集合
     */
    List<ItemImage> itemImages;

    public ItemDto() {
    }

    public ItemDto(Long id, String itemMemo, Long itemSellNum, Byte itemIsbag, List<Attribute> attributes, List<ItemImage> itemImages) {
        this.id = id;
        this.itemMemo = itemMemo;
        this.itemSellNum = itemSellNum;
        this.itemIsbag = itemIsbag;
        this.attributes = attributes;
        this.itemImages = itemImages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemMemo() {
        return itemMemo;
    }

    public void setItemMemo(String itemMemo) {
        this.itemMemo = itemMemo;
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

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<ItemImage> getItemImages() {
        return itemImages;
    }

    public void setItemImages(List<ItemImage> itemImages) {
        this.itemImages = itemImages;
    }
}
