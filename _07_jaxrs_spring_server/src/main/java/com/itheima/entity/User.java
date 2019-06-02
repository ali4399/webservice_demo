package com.itheima.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * 基于restful风格的webservice,可以传递xml或json
 * @XmlRootElement指定对象序列化为xml或json数据时根节点的名称
 *<User>
 *     <id></id>
 *     <username></username>
 *     <city></city>
 *</User>
 *
 *   {"User":{"id":100,"username":"jack","city":"广州"}}
 */


@XmlRootElement(name="User")
public class User {
    private Integer id;
    private String username;
    private String city;

    private List<Car> cars = new ArrayList<Car>();


    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
