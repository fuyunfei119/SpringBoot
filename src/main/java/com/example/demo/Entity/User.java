package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;
    private String name;
    private Integer age;
    private Double balance;
    private Boolean isSuperUser;
    private Date birthday;
    private List<String> permissions;
    private Map<String,Double> ordered_Items;

}
