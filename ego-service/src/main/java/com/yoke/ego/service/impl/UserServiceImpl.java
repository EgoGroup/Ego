package com.yoke.ego.service.impl;

import com.yoke.ego.common.mapper.UserMapper;
import com.yoke.ego.common.pojo.User;
import com.yoke.ego.common.pojo.UserExample;
import com.yoke.ego.common.service.impl.BaseServiceImpl;
import com.yoke.ego.service.UserService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Yoke on 2018/3/19
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User, UserExample> implements UserService {


    public Boolean isLogin(HttpServletRequest servletRequest) {
        User user = (User) servletRequest.getSession().getAttribute("user");
        return user != null;
    }
}
