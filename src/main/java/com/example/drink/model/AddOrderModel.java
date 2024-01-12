package com.example.drink.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddOrderModel {
    //    private int on;
    private String type;
    private String product;
    private String material;
    private int qty;
    private String states;
//    private Date date;
}
