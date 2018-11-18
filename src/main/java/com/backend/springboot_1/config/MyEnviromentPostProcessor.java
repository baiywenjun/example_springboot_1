package com.backend.springboot_1.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

/**
 * Title: todoedit
 * Description: 动态获取配置
 * author: wenjun
 * date: 2018/11/17 16:54
 */
@Component
public class MyEnviromentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
         // 暂时搁置
    }
}
