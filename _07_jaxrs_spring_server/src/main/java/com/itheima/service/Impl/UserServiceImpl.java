package com.itheima.service.Impl;

import com.itheima.entity.Car;
import com.itheima.entity.User;
import com.itheima.service.IUserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl  implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save user"+user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user"+user);
    }

    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        List<User> users = new ArrayList<>();
        User user1= new User();
        user1.setId(1);
        user1.setUsername("小明");
        user1.setCity("上海");


        List<Car> carList = new ArrayList<>();
        Car car1 = new Car();
        car1.setId(101);
        car1.setCarName("保时捷");
        user1.setCars(carList);
        users.add(user1);
        return users;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("删除用户"+id);
    }
}
