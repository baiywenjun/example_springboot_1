package com.backend.springboot_1.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/17 15:57
 */
@Configuration
@Slf4j
public class MyConfig3 {

    @Value("${local.ip}")
    private String localIp;

    @Autowired
    private Environment env;

    public void show(){
      log.info("通过@value注解获取：localIp={}",localIp);
      log.info("通过注入Environment类获取:localIp={}",env.getProperty("local.ip"));
    }
}
