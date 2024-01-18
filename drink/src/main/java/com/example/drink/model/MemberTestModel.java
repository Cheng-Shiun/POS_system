package com.example.drink.model;


import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Getter
@Setter
@Table("member")
public class MemberTestModel {
    @Id
    private Integer mid;
    private String memberName;
    private String memberPhone;
    private String memberAddress;
    private Date birthday;
    private String gender;
    private String email;

    // Lombok will generate getters and setters automatically
}
