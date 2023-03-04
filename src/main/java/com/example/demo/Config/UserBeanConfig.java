package com.example.demo.Config;

import com.example.demo.Entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Configuration
public class UserBeanConfig {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;
    @Value("${balance}")
    private Double balance;
    @Value("${birthday}")
    private Date birthday;
    @Value("${isSuperUser}")
    private Boolean isSuperUser;
    @Value("${permissions}")
    private List<String> permissions;
    @Value("#{${ordered_Items}}")
    private Map<String,Double> ordered_Items;

    @Bean
    public User GetRandomUser() {
        return new User(
                UUID.randomUUID().toString(),
                name,
                age,
                balance,
                isSuperUser,
                birthday,
                permissions,
                ordered_Items
        );
    }

}
