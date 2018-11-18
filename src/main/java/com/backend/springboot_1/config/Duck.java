package com.backend.springboot_1.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/17 16:26
 */
@Component
@Slf4j
public class Duck {

    @Value("${host.name}")
    private String hostName;
    @Value("${host.ip}")
    private String hostIp;

    public void show(){
        log.info("=========MyProperties==========");
        log.info("host.name={}",hostName);
        log.info("host.ip={}",hostIp);
    }
}
