package com.hang.config;

import com.hang.handler.handler.UserHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.result.method.RequestMappingInfo;
import org.springframework.web.reactive.result.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * @Classname MappingConfig
 * @Description TODO
 * @Date 2023/7/25 15:01
 * @Author hang
 * @Version 1.0
 */
@Configuration
public class MappingConfig {
    @Autowired
    public void setHandlerMapping(RequestMappingHandlerMapping handlerMapping, UserHandler handler) throws NoSuchMethodException {
        RequestMappingInfo info = RequestMappingInfo //match info
                .paths("/user/{name}")
                .methods(RequestMethod.GET)
                .build();

        Method method = UserHandler.class.getMethod("getName", String.class);//handler method
        handlerMapping.registerMapping(info,handler,method);
    }
}
