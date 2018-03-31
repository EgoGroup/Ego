package com.yoke.ego.frontweb.web;

import com.yoke.ego.common.pojo.User;
import com.yoke.ego.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Yoke on 2018/3/22
 */
@Api(description = "商品页面展示")
@Controller
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    @ApiOperation(value = "主界面")
    public ModelAndView index(ModelAndView modelAndView, HttpServletRequest servletRequest) {
        User user = (User) servletRequest.getSession().getAttribute("user");
        if (user != null) {
            modelAndView.addObject("userName", user.getUserName());
        }
        modelAndView.addObject("categoryWithItems", categoryService.indexCategory());
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
