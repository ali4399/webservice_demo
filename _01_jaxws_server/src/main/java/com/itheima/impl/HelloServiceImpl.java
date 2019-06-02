package com.itheima.impl;

import com.itheima.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello";
    }
}
