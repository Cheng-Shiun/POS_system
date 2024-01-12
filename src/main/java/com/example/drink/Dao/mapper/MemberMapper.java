package com.example.drink.Dao.mapper;

import com.example.drink.model.Member;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberMapper implements RowMapper<Member> {
    @Override
    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
        Member member = new Member();
        member.setMid( rs.getInt("mid"));
        member.setName( rs.getString("memberName"));
        member.setPhone( rs.getString("memberPhone"));
        member.setAddress( rs.getString("memberAddress"));
        member.setBirthday( rs. getDate("birthday"));
        member.setGender( rs. getString("gender"));
        member.setEmail( rs.getString("email"));
        return member;
    }
}
