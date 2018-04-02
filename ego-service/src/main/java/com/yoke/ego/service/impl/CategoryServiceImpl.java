package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.CategoryMapper;
import com.yoke.ego.common.mapper.ItemMapper;
import com.yoke.ego.common.pojo.*;
import com.yoke.ego.common.properties.CommonProperties;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class CategoryServiceImpl extends BaseServiceImpl<CategoryMapper, Category, CategoryExample> implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private CommonProperties commonProperties;

    @Override
    public List<CategoryWithItem> indexCategory() {
        // 查出所有parentId=1的分类
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.or().andCategoryParentIdEqualTo(0L);
        List<Category> categories = categoryMapper.selectByExample(categoryExample);

        // 查出每个主页分类下商品categpry_id为主页分类id的商品
        List<CategoryWithItem> categoryWithItems = new ArrayList<>();
        ItemExample itemExample = new ItemExample();
       categories.stream().map(category -> {
            itemExample.or().andItemCategoryIdEqualTo(category.getCategoryId());
            List<Item> items = itemMapper.selectByExample(itemExample);
            this.transferItems(items);
            categoryWithItems.add(new CategoryWithItem(category, items));
            return categoryWithItems;
        }).collect(Collectors.toList());
        return categoryWithItems;
    }

    @Override
    public List<Item> transferItems(List<Item> items) {
        items.stream()
                .peek(item -> item.setItemImage(commonProperties.getFrontPage().getHost() + item.getItemImage())).collect(Collectors.toList());
        return items;
    }
}
