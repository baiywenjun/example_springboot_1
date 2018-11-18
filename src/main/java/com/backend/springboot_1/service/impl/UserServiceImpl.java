package com.backend.springboot_1.service.impl;

import com.backend.springboot_1.entity.User;
import com.backend.springboot_1.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/11 16:50
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser() {
        return null;
    }

    @Override
    public String getMessage() {
        return "test ok";
    }
}
