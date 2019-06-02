package com.itheima.service;

import javax.jws.WebService;

@WebService(targetNamespace = "http://itheima.com/", name = "HelloServiceImplService", serviceName = "HelloServiceImplService")
public interface HelloService {
    String sayHello(String name);
}
