package com.yoke.ego.frontweb.config;

import com.yoke.ego.frontweb.directive.CategoryListDirective;
import freemarker.template.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Yoke on 2018/3/24
 */
@Component
public class DirectiveConfig {
    private final Configuration configuration;
    private final CategoryListDirective categoryListDirective;

    @Autowired
    public DirectiveConfig(Configuration configuration, CategoryListDirective categoryListDirective) {
        this.configuration = configuration;
        this.categoryListDirective = categoryListDirective;
    }

    @PostConstruct
    public void setShareVarible() {
        configuration.setSharedVariable("ego_category", categoryListDirective);
    }
}
