package com.yoke.ego.frontweb.directive;

import com.yoke.ego.common.pojo.Category;
import com.yoke.ego.common.pojo.CategoryExample;
import com.yoke.ego.frontweb.util.DirectiveUtil;
import com.yoke.ego.service.CategoryService;
import freemarker.core.Environment;
import freemarker.template.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by Yoke on 2018/3/24
 */
@Component
public class CategoryListDirective implements TemplateDirectiveModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(CategoryListDirective.class);
    private static final String PARAM_ID = "categoryid";

    private static final String PARAM_RET = "ret";
    @Autowired
    private CategoryService categoryService;

    public void execute(Environment environment, Map map, TemplateModel[] templateModels, TemplateDirectiveBody templateDirectiveBody) throws TemplateException, IOException {
        String id = DirectiveUtil.getString(PARAM_ID, map);
        if (id == null) {
            throw new TemplateException("categoryid is null" + PARAM_ID, environment);
        }


        Category category = null;
        Long categoryId = Long.valueOf(id);
        try {
            category = categoryService.selectByPrimaryKey(categoryId);
        } catch (NumberFormatException e) {
            LOGGER.error("查询的分类{}为空:{}", id, e);
        }
        CategoryExample categoryExample = new CategoryExample();
        categoryExample.or().andCategoryParentIdEqualTo(categoryId);
        List<Category> categories = categoryService.selectByExample(categoryExample);
        DefaultObjectWrapperBuilder builder = new DefaultObjectWrapperBuilder(Configuration.getVersion());
        environment.setVariable("categories", builder.build().wrap(categories));
        if (templateDirectiveBody != null) {
            templateDirectiveBody.render(environment.getOut());
        }
    }
}
