package com.hang;

import com.hang.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.AvailabilityState;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.event.ApplicationEventMulticaster;

@SpringBootTest
public class SpringTest {
    @Autowired
    private MyService myService;

    @Autowired
    private ApplicationAvailability availability;
    @Test
    public void test(){
        System.out.println("hello==================================");
        System.out.println(availability.getLivenessState());//����״̬
        System.out.println(availability.getReadinessState());//�Ƿ�ɼ�������
    }
}
