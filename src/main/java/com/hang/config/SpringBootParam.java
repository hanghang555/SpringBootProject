package com.hang.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringBootParam {
    public SpringBootParam(ApplicationArguments args) {
        System.out.println("=================SpringBootParam build success================");
        var flag = args.containsOption("debug");
        System.out.println("ApplicationArguments flag:"+ flag);
        List<String> files = args.getNonOptionArgs();
        if (flag){
            System.out.println("output fileName is " + files);
        }
    }
}
