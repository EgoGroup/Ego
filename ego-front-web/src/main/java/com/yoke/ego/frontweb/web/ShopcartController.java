package com.yoke.ego.frontweb.web;

import com.yoke.ego.common.pojo.Shopcart;
import com.yoke.ego.common.pojo.ShopcartExample;
import com.yoke.ego.common.pojo.User;
import com.yoke.ego.frontweb.common.EgoResult;
import com.yoke.ego.frontweb.util.ResultUtil;
import com.yoke.ego.service.ShopcartService;
import com.yoke.ego.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yoke on 2018/3/28
 */
@RestController
@RequestMapping("/shopcart")
public class ShopcartController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShopcartController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private ShopcartService shopcartService;

    @GetMapping("/list/{userId}")
    public EgoResult list(@PathVariable Long userId) {
        if (userId == null) {
            throw new NullPointerException("查询用户购物车的id为空");
        }
        User user = userService.selectByPrimaryKey(userId);
        if (user == null) {
            throw new NullPointerException("用户不存在");
        }
        ShopcartExample shopcartExample = new ShopcartExample();
        shopcartExample.or().andShopcartUserIdEqualTo(userId);
        Shopcart shopcart = shopcartService.selectByExample(shopcartExample).get(0);
        return new ResultUtil<>().setData(shopcart);
    }

    @GetMapping("/cancle/{itemId}")
    public EgoResult<Object> cancle(@PathVariable Long itemId) {
        if (itemId == null) {
            throw new NullPointerException("所要取消的商品id为空");
        }
        ShopcartExample shopcartExample = new ShopcartExample();
        shopcartExample.or().andShopcartItemIdEqualTo(itemId);
        try {
            shopcartService.deleteByExample(shopcartExample);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            e.printStackTrace();
            return new ResultUtil<>().setError("取消商品失败");
        }
        return new ResultUtil<>().setData(null);
    }
}
