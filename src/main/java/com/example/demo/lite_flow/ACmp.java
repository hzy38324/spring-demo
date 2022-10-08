package com.example.demo.lite_flow;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author: nitzschhong
 * @create: 2022-07-21 19:23
 */
@Component("a")
public class ACmp extends NodeComponent implements InitializingBean {

    @Override
    public void process() {
        //do your business
        System.out.println("AAA");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @PostConstruct
    public void init() {
        // do some initialization work
        System.out.println("PostConstruct init");
    }


}

