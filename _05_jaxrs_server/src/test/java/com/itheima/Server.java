package com.itheima;

import com.itheima.service.Impl.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class Server {
    public static void main(String[] args) {
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        factory.setAddress("http://localhost:8080/ws/");

        factory.setServiceBean(new UserServiceImpl());

        //日志输入输出拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());


        factory.create();
        System.out.println("服务发布成功");
    }
}
