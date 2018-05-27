package com.yoke.ego.frontweb.web;

import com.yoke.ego.common.pojo.CategoryExample;
import com.yoke.ego.frontweb.common.EgoResult;
import com.yoke.ego.frontweb.util.ResultUtil;
import com.yoke.ego.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yoke on 2018/3/25
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public EgoResult<Object> list() {
        LOGGER.info("vue 通过了访问");
        return new ResultUtil<>().setData(categoryService.selectByExample(new CategoryExample()));
    }
}
