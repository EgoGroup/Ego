package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.MemberMapper;
import com.yoke.ego.common.pojo.Member;
import com.yoke.ego.common.pojo.MemberExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * Created by Yoke on 2018/3/22
 */
@Service
public class MemberServiceImpl extends BaseServiceImpl<MemberMapper,Member,MemberExample> implements MemberService {
}
