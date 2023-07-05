package com.hang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private InjectService injectServicel;

    private InjectService01 injectService01;

    @Autowired
    private ApplicationArguments applicationArguments;

    @Autowired
    public MyService(InjectService injectServicel, InjectService01 injectService01) {
        this.injectServicel = injectServicel;
        this.injectService01 = injectService01;
    }

    public String getRunParam(){
        var flag = applicationArguments.containsOption("debug");
        System.out.println("ApplicationArguments flag:"+ flag);
        List<String> files = applicationArguments.getNonOptionArgs();
        if (flag){
            System.out.println("output fileName is " + files);
            //return files.get(0);
            return applicationArguments.getOptionValues("debug").get(0);
        }
        return "there is no param";
    }
}
