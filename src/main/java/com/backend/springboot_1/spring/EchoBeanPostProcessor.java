package com.backend.springboot_1.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Title: todoedit
 * Description: 会在每个bean初始化时预置一些事情
 * author: wenjun
 * date: 2018/11/12 20:12
 */
//@Component
@Slf4j
public class EchoBeanPostProcessor implements BeanPostProcessor {

    /**
     * 在依赖装配后触发
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("==postProcessBeforeInitialization=="+beanName);
        return bean;
    }

    /**
     * 在bean init方法执行之后触发
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("==postProcessAfterInitialization=="+beanName);
        return bean;
    }
}
