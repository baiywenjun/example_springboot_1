package com.backend.springboot_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title: todoedit
 * Description: 创建Bean，并配置Bean
 * author: wenjun
 * date: 2018/11/12 13:13
 */
@Configuration
public class MyConfig1 {

    @Bean
    public Dog createDog(){
        return new Dog();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Cat createCat(){
        return new Cat();
    }
}
