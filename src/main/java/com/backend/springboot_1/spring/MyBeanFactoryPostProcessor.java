package com.backend.springboot_1.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Title: todoedit
 * Description: 对spring容器，预置一些事情
 * author: wenjun
 * date: 2018/11/12 20:58
 */
@Component
@Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.warn("初始化了bean的数量:"+beanFactory.getBeanDefinitionCount());
    }
}
