package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.LogMapper;
import com.yoke.ego.common.pojo.Log;
import com.yoke.ego.common.pojo.LogExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.LogService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class LogServiceImpl extends BaseServiceImpl<LogMapper,Log,LogExample> implements LogService {
}
