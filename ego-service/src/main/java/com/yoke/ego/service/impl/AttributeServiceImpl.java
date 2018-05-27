package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.AttributeMapper;
import com.yoke.ego.common.pojo.Attribute;
import com.yoke.ego.common.pojo.AttributeExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.AttributeService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/28
 */
@Service
public class AttributeServiceImpl extends BaseServiceImpl<AttributeMapper, Attribute, AttributeExample> implements AttributeService {
}
