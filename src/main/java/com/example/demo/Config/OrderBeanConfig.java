package com.example.demo.Config;

import com.example.demo.Entity.Order;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@ConfigurationPropertiesScan
public class OrderBeanConfig {

    private String orderNo;
    private String itemName;
    private Double itemPrice;
    private Date orderedDate;


    @Bean
    @ConfigurationProperties("orders")
    public Order GetRandomOrder() {
        return new Order(
                orderNo,
                itemName,
                itemPrice,
                orderedDate
        );
    }
}
