package com.backend.springboot_1.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/11 16:02
 */
@Data
public class User {
    @NotBlank(message = "用户名不能为空")
    private String name;
    private Integer age;
}
