package com.example.demo.Service;


import com.example.demo.Entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByName(String name);
}
