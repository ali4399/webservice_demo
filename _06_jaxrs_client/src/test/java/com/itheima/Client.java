package com.itheima;

import com.itheima.entity.Car;
import com.itheima.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

public class Client {

    @Test
    public  void testSave(){
        User user1 = new User();
        List<Car> list = new ArrayList<>();
        Car car1 = new Car();
        car1.setCarName("宝马");
        car1.setId(2);
        car1.setPrice(new Double(300));
        list.add(car1);
        user1.setCity("北京");
        user1.setId(1);
        user1.setCars(list);
        WebClient.create("http://localhost:8080/ws/userUserService/user")
        .type(MediaType.APPLICATION_JSON_TYPE)//改行去掉，默认xml，这里指定json
        .post(user1);
//        如果有返回值
//                User user =WebClient.create("http://localhost:8080/ws/userUserService/user/1")
//                        .type(MediaType.APPLICATION_JSON_TYPE)//改行去掉，默认xml，这里指定json
//                        .get(User.class);
    }
}
