package com.example.demo.lite_flow;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

/**
 * @author: nitzschhong
 * @create: 2022-07-21 19:23
 */
@Component("c")
public class CCmp extends NodeComponent {

    @Override
    public void process() {
        //do your business
        System.out.println("CCC");
    }
}

