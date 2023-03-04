package com.example.demo.Entity;

import lombok.*;

import java.util.Date;

public class Order {

    private String orderNo;
    private String itemName;
    private Double itemPrice;
    private Date orderedDate;

    public Order() {
    }

    public Order(String orderNo, String itemName, Double itemPrice, Date orderedDate) {
        this.orderNo = orderNo;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.orderedDate = orderedDate;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getItemName() {
        return itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }
}
