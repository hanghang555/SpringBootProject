package com.hang.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Classname EnvironmentHandler
 * @Description TODO
 * @Date 2023/7/7 15:27
 * @Author hang
 * @Version 1.0
 */
public class EnvironmentHandler implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        
    }
}
