package com.yoke.ego.frontweb.web;

import com.yoke.ego.common.pojo.User;
import com.yoke.ego.common.pojo.UserExample;
import com.yoke.ego.frontweb.common.EgoResult;
import com.yoke.ego.frontweb.dto.UserDto;
import com.yoke.ego.frontweb.util.ResultUtil;
import com.yoke.ego.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Yoke on 2018/3/26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public EgoResult<Object> login(@RequestBody UserDto userDto, HttpServletRequest request) {
        LOGGER.info(userDto.toString());
        EgoResult result = null;
        UserExample userExample = new UserExample();
        userExample.or().andUserNameEqualTo(userDto.getUsername());
        List<User> list = userService.selectByExample(userExample);

        if (list.size() == 0) {
            return new ResultUtil<>().setError("用户名不存在");
        }
        User user = list.get(0);
        if (user.getUserPassword().equals(userDto.getPassword())) {
            request.getSession().setAttribute("user", user);
            return new ResultUtil<>().setData(null);
        } else {
            return new ResultUtil<>().setError("用户名密码不匹配");
        }
    }

    @GetMapping("/isLogin")
    public EgoResult isLogin(HttpServletRequest servletRequest) {
        Boolean isLogin = userService.isLogin(servletRequest);
        return new ResultUtil<>().setData(isLogin);
    }
}
