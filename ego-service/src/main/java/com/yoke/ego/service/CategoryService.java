package com.yoke.ego.service;

import com.yoke.ego.common.pojo.Category;
import com.yoke.ego.common.pojo.CategoryExample;
import com.yoke.ego.common.pojo.CategoryWithItem;
import com.yoke.ego.common.pojo.Item;
import com.yoke.ego.common.service.impl.BaseService;

import java.util.List;

/**
 * Created by Yoke on 2018/3/22
 */
public interface CategoryService extends BaseService<Category, CategoryExample> {
    /**
     * 查询首页展示的分类，以及部分销售好的商品,销售量排前6的商品
     *
     * @return
     */
    List<CategoryWithItem> indexCategory();

    /**
     * 配置item的路径
      * @param items
     * @return
     */
    List<Item> transferItems(List<Item> items);

}
