package com.example.demo;

import com.example.demo.bean_factory.Car;
import com.example.demo.bean_factory.MyInstantiationAwareBeanPostProcessor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author: nitzschhong
 * @create: 2022-10-08 20:52
 */
public class BeanFactoryTest {

    @Test
    public void getBeanByBeanFactory() {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("beans.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // BeanFactory 需要通过手工调用addBeanPostProcessor()方法进行注册
        beanFactory.addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        Car benz = beanFactory.getBean("benz", Car.class);
        benz.introduce();
    }

    @Test
    public void getBeanByApplicationContext() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Car benz = applicationContext.getBean("benz", Car.class);
        benz.introduce();
    }
}
