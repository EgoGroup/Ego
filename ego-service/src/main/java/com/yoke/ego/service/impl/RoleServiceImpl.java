package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.RoleMapper;
import com.yoke.ego.common.pojo.Role;
import com.yoke.ego.common.pojo.RoleExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper,Role,RoleExample> implements RoleService {
}
