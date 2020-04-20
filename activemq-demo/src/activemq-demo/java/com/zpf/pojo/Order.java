package com.zpf.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class Order implements Serializable{
    private Integer orderid;
    private Integer num;
    private String orderName;

    public Order(Integer orderid, Integer num, String orderName) {
        this.orderid = orderid;
        this.num = num;
        this.orderName = orderName;
    }

}
