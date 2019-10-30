package com.springboot.dubboprovider.Impl;

import com.springboot.dubbointerface.Interface.OrderService;
import com.springboot.dubbointerface.Interface.UserService;
import com.springboot.dubbointerface.bean.UserAdderss;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService, Serializable {


    @Autowired
    UserService service;

    @Override
    public void initOrder(String userId) {

        System.out.println("用户id "+userId);
        //查询用户的收货地址
        List<UserAdderss> address = service.getAddress(userId);
        for (UserAdderss userAdderss:address){
            System.out.println(userAdderss);
        }
        System.out.println(address);

    }
}
