package com.hang.handler.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname UserHandler
 * @Description TODO
 * @Date 2023/7/25 15:03
 * @Author hang
 * @Version 1.0
 */
@Component
public class UserHandler {
    @ResponseBody
    public String getName(String name){
        return "21";
    }

}
