package com.itheima;

import com.itheima.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        factory.setAddress("http://localhost:8080/ws/hello");

        factory.setServiceBean(new HelloServiceImpl());

        factory.create();
        System.out.println("发布成功");
    }
}
