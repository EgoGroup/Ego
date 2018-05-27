package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.ShopcartMapper;
import com.yoke.ego.common.pojo.Shopcart;
import com.yoke.ego.common.pojo.ShopcartExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.ShopcartService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class ShopcartServiceImpl extends BaseServiceImpl<ShopcartMapper,Shopcart,ShopcartExample> implements ShopcartService {
}
