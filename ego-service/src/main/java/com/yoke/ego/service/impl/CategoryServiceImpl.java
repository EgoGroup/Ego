package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.CategoryMapper;
import com.yoke.ego.common.mapper.ItemMapper;
import com.yoke.ego.common.pojo.*;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class CategoryServiceImpl extends BaseServiceImpl<CategoryMapper, Category, CategoryExample> implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ItemMapper itemMapper;

    public List indexCategory() {
        // 查出所有parentId=1的分类
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.or().andCategoryParentIdEqualTo(0L);
        List<Category> categories = categoryMapper.selectByExample(categoryExample);

        // 查出每个主页分类下商品categpry_id为主页分类id的商品
        List<CategoryWithItem> categoryWithItems = new ArrayList<CategoryWithItem>();
        ItemExample itemExample = new ItemExample();
        for (Category category : categories) {
            itemExample.or().andItemCategoryIdEqualTo(category.getCategoryId());
            List<Item> items = itemMapper.selectByExample(itemExample);
            categoryWithItems.add(new CategoryWithItem(category, items));
            itemExample.clear();
        }
        return categoryWithItems;
    }
}
