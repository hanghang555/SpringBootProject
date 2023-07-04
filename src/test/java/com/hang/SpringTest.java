package com.hang;

import com.hang.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringTest {
    @Autowired
    private MyService myService;

    @Test
    public void test(){
        System.out.println("hello==================================");
    }
}
