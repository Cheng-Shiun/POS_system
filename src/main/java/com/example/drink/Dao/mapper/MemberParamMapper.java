package com.example.drink.Dao.mapper;

import com.example.drink.model.Member;
import com.example.drink.model.MemberParam;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberParamMapper implements RowMapper<MemberParam> {
    @Override
    public MemberParam mapRow(ResultSet rs, int rowNum) throws SQLException {
        MemberParam memberParam = new MemberParam();
        memberParam.setName( rs.getString("memberName"));
        memberParam.setPhone( rs.getString("memberPhone"));
        memberParam.setAddress( rs.getString("memberAddress"));
        memberParam.setBirthday(rs.getDate("birthday").toLocalDate());
        memberParam.setGender( rs. getString("gender"));
        memberParam.setEmail( rs.getString("email"));
        return memberParam;
    }
}
