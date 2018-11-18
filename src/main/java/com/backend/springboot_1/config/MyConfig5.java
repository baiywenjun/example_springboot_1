package com.backend.springboot_1.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Title: todoedit
 * Description: 指定环境下才会装配的bean
 * author: wenjun
 * date: 2018/11/17 17:20
 */
@Configuration
@Slf4j
public class MyConfig5 {

    @Bean
    @Profile("dev")
    public Runnable createRunnableDev(){
        log.info("dev-env Bean");
        return ()->{};
    }

    @Bean
    @Profile("test")
    public Runnable createRunnableTest(){
        log.info("test-env Bean");
        return ()->{};
    }
}
