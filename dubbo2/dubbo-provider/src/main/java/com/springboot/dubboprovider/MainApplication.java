package com.springboot.dubboprovider;

import com.springboot.dubbointerface.Interface.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");

        OrderService bean = context.getBean(OrderService.class);
        bean.initOrder("1");

        System.in.read();
    }
}
