package com.yoke.ego.common.pojo;

import java.util.List;

/**
 * Created by Yoke on 2018/3/23
 */
public class CategoryWithItem {
    private Category category;
    private List<Item> items;

    public CategoryWithItem(Category category, List<Item> items) {
        this.category = category;
        this.items = items;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
