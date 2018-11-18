package com.backend.springboot_1.controller;

import com.backend.springboot_1.entity.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/11 16:05
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public User getUser(){
        User user = new User();
        user.setAge(22);
        user.setName("Jim");
        return user;
    }

    @PostMapping
    public String addUser(@Valid User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            StringBuffer buf = new StringBuffer();
            for (ObjectError error : allErrors) {
                String defaultMessage = error.getDefaultMessage();
                buf.append(defaultMessage);
            }
            return buf.toString();
        }
        return "ok";
    }
}
