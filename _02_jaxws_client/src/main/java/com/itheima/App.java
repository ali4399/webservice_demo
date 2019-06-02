package com.itheima;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ){

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        factory.setAddress("http://localhost:8080/ws/hello");

        factory.setServiceClass(HelloService.class);

        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getInInterceptors().add(new LoggingOutInterceptor());

        HelloService helloService = factory.create(HelloService.class);

        System.out.println(helloService.getClass());

        String content  = helloService.sayHello("steven");
        System.out.println(content);
    }
}
