package com.example.drink.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MemberParam {
    private String name;
    private String phone;
    private String address;
    private LocalDate birthday;
    private String gender;
    private String email;
}
