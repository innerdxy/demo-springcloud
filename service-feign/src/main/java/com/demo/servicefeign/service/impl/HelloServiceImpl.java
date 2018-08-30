package com.demo.servicefeign.service.impl;

import com.demo.servicefeign.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
