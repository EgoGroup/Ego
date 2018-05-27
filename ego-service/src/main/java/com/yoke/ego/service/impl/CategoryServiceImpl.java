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
        // 查出所有parentId=0的分类
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.or().andCategoryParentIdEqualTo(0L);
        ItemExample itemExample = new ItemExample();
        List<CategoryWithItem> categoryWithItems = new ArrayList<>();
        // 列出所有的主页的分类
        categoryMapper.selectByExample(categoryExample).stream()
                .map(category -> {
                    itemExample.or().andItemCategoryIdEqualTo(category.getCategoryId());
                    List<Item> itemList = itemMapper.selectByExample(itemExample);
                    this.transferItems(itemList);
                    categoryWithItems.add(new CategoryWithItem(category, itemList));
                    itemExample.clear();
                    return categoryWithItems;
                }).collect(Collectors.toList());
        return categoryWithItems;
    }

    @Override
    public List<Item> transferItems(List<Item> items) {
        return items.stream()
                .peek(item -> item.setItemImage(commonProperties.getFrontPage().getHost() + item.getItemImage())).collect(Collectors.toList());
    }
}
