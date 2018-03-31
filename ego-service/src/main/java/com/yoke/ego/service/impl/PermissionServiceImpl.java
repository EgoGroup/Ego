package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.PermissionMapper;
import com.yoke.ego.common.pojo.Permission;
import com.yoke.ego.common.pojo.PermissionExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.PermissionService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class PermissionServiceImpl extends BaseServiceImpl<PermissionMapper,Permission,PermissionExample> implements PermissionService {
}
