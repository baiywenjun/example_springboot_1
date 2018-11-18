package com.backend.springboot_1;

import com.backend.springboot_1.config.Dog;
import com.backend.springboot_1.config.MyConfig1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/12 13:17
 */
public class AppTest1 {
    public static void main(String[] args) {
        // 以前xml配置的方式，改为bean配置，那么需要一个配置来管理这些配置实体,核心注解@Bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig1.class);
        // 可以直接获取这些配置实体
        Dog dog = context.getBean(Dog.class);
        System.out.println(dog);
        context.close();
    }
}
