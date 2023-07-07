package com.hang.entity.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParamBean {

    @Value("${name:default}") //if name is null, value will be default
    private String name;

    public String getName() {
        return name;
    }
}
