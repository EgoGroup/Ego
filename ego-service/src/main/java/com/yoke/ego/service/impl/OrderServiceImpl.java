package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.OrderMapper;
import com.yoke.ego.common.pojo.Order;
import com.yoke.ego.common.pojo.OrderExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper,Order,OrderExample> implements OrderService {
}
