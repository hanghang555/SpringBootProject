package com.hang;

import com.hang.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringTest {
    @Autowired
    private MyService myService;

    @Autowired
    private ApplicationAvailability availability;
    @Test
    public void test(){
        System.out.println("===============test is running===================");
        System.out.println("LivenessState:" + availability.getLivenessState());
        System.out.println("ReadinessState" + availability.getReadinessState());
    }
}
