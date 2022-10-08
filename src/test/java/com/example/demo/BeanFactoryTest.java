package com.example.demo;

import com.example.demo.beans.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author: nitzschhong
 * @create: 2022-10-08 20:52
 */
public class BeanFactoryTest {

    @Test
    public void getBean() {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("beans.xml");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        Car benz = beanFactory.getBean("benz", Car.class);
        benz.introduce();
    }
}
