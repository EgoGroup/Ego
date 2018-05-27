package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.ItemImageMapper;
import com.yoke.ego.common.pojo.ItemImage;
import com.yoke.ego.common.pojo.ItemImageExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.ItemImageService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class ItemImageServiceImpl extends BaseServiceImpl<ItemImageMapper,ItemImage,ItemImageExample> implements ItemImageService {
}
