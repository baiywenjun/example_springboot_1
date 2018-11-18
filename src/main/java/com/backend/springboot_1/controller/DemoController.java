package com.backend.springboot_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/11 10:44
 */
@RestController
public class DemoController {

    @GetMapping("demo")
    public String demo(){
        return "SpringBoot step 1";
    }

}
