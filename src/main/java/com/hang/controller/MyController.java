package com.hang.controller;

import com.hang.entity.test.ParamBean;
import com.hang.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class MyController {

    @Autowired
    private MyService myService; //param --debug hello.txt

    @Value("${debug:debug}")
    private String debug; //param --debug=hello.txt

    @Value("${username1}")
    private String username;

    @Autowired
    private ParamBean paramBean;
    @RequestMapping("/")
    String home(){
        return myService.getRunParam();
        //return "param:"+ debug;
    }
    @RequestMapping("/name")
    String getName(){
        System.out.println("==============name controller starting=================");
        return paramBean.getName();
    }

    @RequestMapping("/username")
    String getUserName(){
        System.out.println("==============username1 controller starting=================");
        return username;
    }

}
