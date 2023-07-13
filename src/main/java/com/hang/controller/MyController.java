package com.hang.controller;

import com.hang.entity.test.ParamBean;
import com.hang.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.pattern.PathPattern;

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

    /**
     * consumes: request contentType
     * produces: response contentType
     * */
    @RequestMapping(path = "/username/{name}/{age}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    String getUserNameAndAge(@PathVariable("name") String username, @PathVariable String age){
        System.out.println("==============UserNameAndAge controller starting=================");
        return "name:"+ username +",age:" + age;
    }

    /**
     * consumes: request contentType
     * produces: response contentType
     * */
    @RequestMapping(path = "/paramTest",params = "name=hang")
    String getParamTest(){
        System.out.println("==============getParamTest controller starting=================");
        return "success";
    }

}
