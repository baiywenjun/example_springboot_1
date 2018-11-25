package com.backend.springboot_1.event;

import org.springframework.context.ApplicationEvent;

/**
 * Title: todoedit
 * Description: springboot_1
 * author: wenjun
 * date: 2018/11/24 15:32
 */
public class MyEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
