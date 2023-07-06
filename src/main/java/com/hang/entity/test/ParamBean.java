package com.hang.entity.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParamBean {

    @Value("${name}")
    private String name;

    public String getName() {
        return name;
    }
}
