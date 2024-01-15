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
    //因DB將gender設 可為null 且本身為radio 所以需要再寫getter/setter
    //取得gender的值
    public String getGender(){
        return gender;
    }
    //設定gender的值
    public void setGender(String gender){
        this.gender = gender;
    }
    private String phone;
    private String lineID;
    private String address;
    private String budget;
    private String opentime;
    private String contacttime;
    private String description;
}
