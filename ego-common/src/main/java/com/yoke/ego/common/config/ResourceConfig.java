package com.yoke.ego.common.config;

import com.yoke.ego.common.properties.CommonProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Yoke on 2018/3/23
 */
@Configuration
public class ResourceConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private CommonProperties commonProperties;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println(commonProperties.getUpload().getImglocation());
        registry.addResourceHandler("/pic/**").addResourceLocations("file:" + commonProperties.getUpload().getImglocation()).setCachePeriod(1);
        super.addResourceHandlers(registry);
    }
}
