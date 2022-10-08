package com.example.demo.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author: nitzschhong
 * @create: 2022-07-26 21:57
 */
@Component
public class SpringAwareDemo implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    public Object getBean(String beanName){
        return context.getBean(beanName);
    }
}
