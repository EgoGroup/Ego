package com.yoke.ego.service;

import com.yoke.ego.common.pojo.User;
import com.yoke.ego.common.pojo.UserExample;
import com.yoke.ego.common.service.impl.BaseService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Yoke on 2018/3/19
 */
public interface UserService extends BaseService<User, UserExample> {
    /**
     * 判断当前用户是否登录
     *
     * @return 返回当前登录的用户，如果没有登陆，则返回Null
     */
    User isLogin(HttpServletRequest servletRequest);

}
