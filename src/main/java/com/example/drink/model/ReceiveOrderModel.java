package com.example.drink.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReceiveOrderModel {
    private int oNumber;
    private String type;
    private String product;
    private String material;
    private int qty;
    private String states;
    private Date date;
    private Date eDate;
    public void completeOrder() {
        this.setEDate(new Date());
    }
}
