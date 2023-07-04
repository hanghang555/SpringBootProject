package com.hang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private InjectService injectServicel;

    private InjectService01 injectService01;

    @Autowired
    public MyService(InjectService injectServicel, InjectService01 injectService01) {
        this.injectServicel = injectServicel;
        this.injectService01 = injectService01;
    }
}
