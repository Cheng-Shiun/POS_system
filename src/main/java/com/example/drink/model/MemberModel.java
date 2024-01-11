package com.example.drink.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MemberModel {
    private String id;
    private String memberName;
    private String password;
    private String gender;
    private String cellPhone;
    private String Email;
}
