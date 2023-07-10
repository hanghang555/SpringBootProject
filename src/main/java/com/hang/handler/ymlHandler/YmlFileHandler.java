package com.hang.handler.ymlHandler;

import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.env.YamlPropertySourceLoader;

public class YmlFileHandler {

    private final YamlMapFactoryBean yamlMapFactoryBean = new YamlMapFactoryBean();

    private final YamlPropertySourceLoader sourceLoader = new YamlPropertySourceLoader();

    private final YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();

    public void handler(){

    }
}
