package com.yoke.ego.frontweb.web;

import com.yoke.ego.common.pojo.CategoryWithItem;
import com.yoke.ego.common.properties.CommonProperties;
import com.yoke.ego.frontweb.common.EgoResult;
import com.yoke.ego.frontweb.util.ResultUtil;
import com.yoke.ego.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Yoke on 2018/3/22
 */
@Api(description = "商品页面展示")
@RestController
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CommonProperties commonProperties;

    @GetMapping("")
    @ApiOperation(value = "主界面")
    public EgoResult<Object> index(HttpServletRequest servletRequest) {
        LOGGER.info("-------------------" + commonProperties.getFrontPage().getHost());
        List<CategoryWithItem> categoryWithItems = categoryService.indexCategory();
        System.out.println(categoryWithItems.size());
        return new ResultUtil<>().setData(categoryWithItems);
    }

}
