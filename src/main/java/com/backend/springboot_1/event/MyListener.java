package com.backend.springboot_1.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Title: 定义事件监听
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/24 15:33
 */
@Component
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        System.out.println("=======我监听到了事件"+event.getClass());
    }
}
