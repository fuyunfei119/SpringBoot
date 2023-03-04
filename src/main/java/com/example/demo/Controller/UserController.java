package com.example.demo.Controller;

import com.example.demo.Config.UserBeanConfig;
import com.example.demo.Config.OrderBeanConfig;
import com.example.demo.Entity.Order;
import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserBeanConfig userBeanConfig;
    @Autowired
    private OrderBeanConfig orderBeanConfig;

    @GetMapping("/User")
    public User test() {
        return userBeanConfig.GetRandomUser();
    }

    @GetMapping("/Order")
    public Order orderTest() {
        return orderBeanConfig.GetRandomOrder();
    }
}
