package com.hang.controller;

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

    @Value("${debug}")
    private String debug; //param --debug=hello.txt
    @RequestMapping("/")
    String home(){
        return myService.getRunParam();
        //return "param:"+ debug;
    }
}
