package com.backend.springboot_1.component;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Title: 容器初始化
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/24 16:06
 */
public class MyAppInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("bean count : " + applicationContext.getBeanDefinitionCount());
    }
}
