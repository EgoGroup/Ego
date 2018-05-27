package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.AddressMapper;
import com.yoke.ego.common.pojo.Address;
import com.yoke.ego.common.pojo.AddressExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.AddressService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class AddressServiceImpl extends BaseServiceImpl<AddressMapper, Address, AddressExample> implements AddressService {
}
