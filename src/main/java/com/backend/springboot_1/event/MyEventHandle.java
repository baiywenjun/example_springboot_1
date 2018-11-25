package com.backend.springboot_1.event;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/24 15:57
 */
@Component
public class MyEventHandle {

    @EventListener
    public void event(ContextStoppedEvent event){
        System.out.println("app停止事件:"+event.getClass());
    }
}
