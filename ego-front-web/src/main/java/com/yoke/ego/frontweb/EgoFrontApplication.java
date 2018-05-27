package com.yoke.ego.frontweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Yoke on 2018/3/19
 */
@SpringBootApplication(scanBasePackages = "com.yoke")
@MapperScan("com.yoke.ego.common.mapper")
public class EgoFrontApplication {
    public static void main(String[] args) {
        SpringApplication.run(EgoFrontApplication.class, args);
    }
}
