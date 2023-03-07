package com.example.demo.Reposity;

import com.example.demo.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserReposity {

    List<User> findAll();

    User findByName(String name);
}
