package com.yoke.ego.common.config;

import com.yoke.ego.common.properties.CommonProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Yoke on 2018/3/23
 */
@Configuration
@EnableConfigurationProperties(CommonProperties.class)  // 让配置类生效
public class EgoCoreConfig {
}
