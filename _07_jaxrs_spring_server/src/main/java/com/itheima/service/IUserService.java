package com.itheima.service;

import com.itheima.entity.User;

import javax.ws.rs.*;
import java.util.List;

//访问当前服务接口对应的路径
@Path("/userService")
@Produces("*/*")
public interface IUserService {

    @POST
    @Path("/user")
    //服务器支持的请求的数据格式类型
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    @GET
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public User findUserById(@PathParam("id") Integer id);

    @GET
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public List<User> findAllUser();

    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(@PathParam("id") Integer id);

}
