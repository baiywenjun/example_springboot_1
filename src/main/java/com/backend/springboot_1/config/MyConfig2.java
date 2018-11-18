package com.backend.springboot_1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Title: todoedit
 * Description: 自定义扫描
 * author: wenjun
 * date: 2018/11/12 14:29
 */
@ComponentScan(value = "com.backend.springboot_1",excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {Dog.class}))
@Configuration
public class MyConfig2 {
}
