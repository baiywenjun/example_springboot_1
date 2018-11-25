package com.backend.springboot_1.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/24 16:16
 */
@Component
public class MyServerReport implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("=====应用启动完毕=====");
    }
}
