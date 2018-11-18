package com.backend.springboot_1.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Title: todoedit
 * Description:
 * author: wenjun
 * date: 2018/11/12 13:53
 */
@Slf4j
public class Cat {

    public void init(){
        log.info("==init==");
    }

    public void destroy(){
        log.info("==destroy==");
    }
}
