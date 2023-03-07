package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.Reposity.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private UserReposity userReposity;

    @Autowired
    public UserServiceImpl(UserReposity userReposity) {
        this.userReposity = userReposity;
    }

    @Override
    public List<User> findAll() {
        return userReposity.findAll();
    }

    @Override
    public User findByName(String name) {
        return userReposity.findByName(name);
    }
}
