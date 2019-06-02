package com.itheima;

import javax.jws.WebService;

@WebService(targetNamespace = "http://itheima.com/", name = "HelloServiceImplService", serviceName = "HelloServiceImplService")
public interface HelloService {

    /**
     * 对外发布
     */
     String sayHello(String name);
}
