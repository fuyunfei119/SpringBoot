package com.example.demo.Controller;

import com.example.demo.Aop.OnBeforeQueryAllEvent;
import com.example.demo.Entity.User;
import com.example.demo.Exception.UserNameNotFoundException;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserMyBatisController {

    private UserService userService;

    @Autowired
    public UserMyBatisController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/Users")
    @OnBeforeQueryAllEvent
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/User/{name}")
    public User findByName(@PathVariable String name) {
        User user = userService.findByName(name);
        if (user == null) {
            throw new UserNameNotFoundException("Not Found the User with name");
        }else {
            return user;
        }
    }
}
