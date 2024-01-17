package com.example.drink.Dao.mapper;

import com.example.drink.model.MemberLoginModel;
import com.example.drink.model.MemberParam;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberLoginMapper implements RowMapper<MemberLoginModel> {
    @Override
    public MemberLoginModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        MemberLoginModel memberLoginModel = new MemberLoginModel();
        memberLoginModel.setName( rs.getString("memberName"));
        memberLoginModel.setPhone( rs.getString("memberPhone"));
        return memberLoginModel;
    }
}
