package com.example.drink.Dao;

import com.example.drink.model.MemberParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NewMemberRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int newMember (MemberParam memberParam) {
        String sql = "insert into member(memberName,memberPhone,memberAddress,birthday,gender,email) values (?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, memberParam.getName(), memberParam.getPhone(), memberParam.getAddress(), memberParam.getBirthday(), memberParam.getGender(), memberParam.getEmail());
    }

    public long checkMember (String memberName) {
        String sql = "select count(*) from member where memberName=?";
        return jdbcTemplate.queryForObject(sql, Long.class, memberName);
    }
}
