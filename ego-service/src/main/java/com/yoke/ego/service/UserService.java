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
     * @return
     */
    Boolean isLogin(HttpServletRequest servletRequest);

}
