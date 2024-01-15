package com.example.drink.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FranchiseModel {
    private String name;
    private String gender;
    private String phone;
    private String lineID;
    private String address;
    private String budget;
    private String opentime;
    private String contacttime;
    private String description;
}
