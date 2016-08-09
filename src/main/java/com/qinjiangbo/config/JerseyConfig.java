package com.qinjiangbo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Created by Richard on 7/15/16.
 */
@Component
@ApplicationPath("/rest")
@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.qinjiangbo.resource");
    }
}
