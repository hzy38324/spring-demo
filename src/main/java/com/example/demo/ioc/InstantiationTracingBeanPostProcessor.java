package com.example.demo.ioc;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-extension
 *
 * @author: nitzschhong
 * @create: 2022-07-26 22:15
 */
@Component
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {
    // simply return the instantiated bean as-is
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        return bean; // we could potentially return any object reference here...
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}
