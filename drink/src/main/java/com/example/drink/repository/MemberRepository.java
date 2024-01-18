package com.example.drink.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.drink.model.MemberTestModel;

public interface MemberRepository extends CrudRepository<MemberTestModel, Integer> {
    // Custom query to find a member by name and phone
    @Query("SELECT * FROM member WHERE memberName = :memberName AND memberPhone = :memberPhone")
    MemberTestModel findByMemberNameAndMemberPhone(String memberName, String memberPhone);
}
