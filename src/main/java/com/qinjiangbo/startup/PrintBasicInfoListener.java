package com.qinjiangbo.startup;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Richard on 7/17/16.
 */
@Component
public class PrintBasicInfoListener implements ApplicationListener<ApplicationReadyEvent>{

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("Adding PrintBasicInfoListener to Spring Boot system!");
        System.out.println("(**)(**)(**)(**)(**)");
    }
}
