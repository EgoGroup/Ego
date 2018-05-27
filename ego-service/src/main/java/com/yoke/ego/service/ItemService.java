package com.yoke.ego.service;

import com.yoke.ego.common.pojo.Item;
import com.yoke.ego.common.pojo.ItemExample;
import com.yoke.ego.common.service.impl.BaseService;

import java.util.Map;

/**
 * Created by Yoke on 2018/3/22
 */
public interface ItemService extends BaseService<Item, ItemExample> {
    /**
     * 列出某个大分类下边的商品
     *
     * @param id 分类的id
     * @return
     */
    Map<String, Object> listAll(Long id);
}
