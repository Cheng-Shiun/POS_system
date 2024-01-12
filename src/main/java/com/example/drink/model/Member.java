package com.example.drink.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Member {
    private int mid;
    private String name;
    private String phone;
    private String address;
    private Date birthday;
    private String gender;
    private String email;
}
