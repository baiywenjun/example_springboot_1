package com.backend.springboot_1;

import com.backend.springboot_1.config.Dog;
import com.backend.springboot_1.config.MyConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/12 13:17
 */
public class AppTest3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
        Dog dog = context.getBean(Dog.class);
        System.out.println(dog);
        context.close();
    }
}
