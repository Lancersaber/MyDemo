package com.springboot.dubboconsumer.Impl;

import com.springboot.dubbointerface.Interface.UserService;
import com.springboot.dubbointerface.bean.UserAdderss;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * 1、将服务提供者注册到注册中心(暴露服务)
 *      1）导入dubbo依赖
 * 2、让服务消费者去注册中心订阅服务提供者的服务地址
 * 3、
 */
public class UserServiceImpl implements UserService, Serializable {
    @Override
    public List<UserAdderss> getAddress(String id) {

           UserAdderss userAdderss1 = new UserAdderss(1, "Mike", "北京");
           UserAdderss userAdderss = new UserAdderss(2, "Jack", "北京");
           return Arrays.asList(userAdderss,userAdderss1);

    }
}
