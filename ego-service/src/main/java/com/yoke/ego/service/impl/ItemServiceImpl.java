package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.CategoryMapper;
import com.yoke.ego.common.mapper.ItemMapper;
import com.yoke.ego.common.pojo.Category;
import com.yoke.ego.common.pojo.CategoryExample;
import com.yoke.ego.common.pojo.Item;
import com.yoke.ego.common.pojo.ItemExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class ItemServiceImpl extends BaseServiceImpl<ItemMapper, Item, ItemExample> implements ItemService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceImpl.class);
    @Autowired
    private ItemMapper itemMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Map<String, Object> listAll(Long id) {
        Category c = null;
        try {
            c = categoryMapper.selectByPrimaryKey(id);
        } catch (NullPointerException e) {
            LOGGER.info("没有找到要查询的分类：{}", e);
        }

        // 查找出父亲分类的所有子分类
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.or().andCategoryParentIdEqualTo(id);
        List<Category> categories = categoryMapper.selectByExample(categoryExample);
        ItemExample itemExample = new ItemExample();
        List<Item> items = new ArrayList<>();
        if (categories != null) {
            List itemList = categories.stream().map(category -> {
                itemExample.or().andItemCategoryIdEqualTo(category.getCategoryId());
                return itemMapper.selectByExample(itemExample);
            }).collect(Collectors.toList());
            LOGGER.info("list集合的内容{}" + itemList);
            items.addAll(itemList);
        }
        itemExample.clear();
        // 查出当前分类的所有商品
        itemExample.or().andItemCategoryIdEqualTo(id);
        items.addAll(itemMapper.selectByExample(itemExample));
        // 将查询出来的信息放到map集合中
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("categories", categories);
        map.put("items", items);
        return map;
    }
}
