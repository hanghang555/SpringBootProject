package com.hang;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hang.entity.test.MyProperties;
import com.hang.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import java.util.Locale;

@SpringBootTest(useMainMethod = SpringBootTest.UseMainMethod.ALWAYS)
@Import(TestClass.class)
public class SpringTest {
    @Autowired
    private MyService myService;

    @Autowired
    private MyProperties myProperties;

    @Autowired
    private ApplicationAvailability availability;

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TestClass testClass;

    @Test
    public void test(){
        System.out.println("===============test is running===================");
        System.out.println("LivenessState:" + availability.getLivenessState());
        System.out.println("ReadinessState" + availability.getReadinessState());
        System.out.println("myProperties:" + myProperties);
    }


    @Test
    public void i18nTest(){
        System.out.println("==============i18n test start================");
        String messageForCh = messageSource.getMessage("menu.file", new String[]{"HELLO"}, "ee", Locale.US);
        System.out.println("messageForCh is " + messageForCh);
        String messageForCh1 = messageSource.getMessage("menu.edit", null, "ee", Locale.US);
        System.out.println("messageForCh1 is " + messageForCh1);
    }

    @Test
    public void jsonTest() throws JsonProcessingException {
        System.out.println("==============json se test start================");
        String value = objectMapper.writeValueAsString(myProperties);
        System.out.println("after se:" + value);

        System.out.println("==============json de test start================");
        MyProperties properties = objectMapper.readValue(value, MyProperties.class);
        System.out.println("properties :"+ properties);
    }
}
@TestConfiguration
class TestClass{
    private String name = "hh";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
