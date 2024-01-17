package com.example.drink.Dao;

import com.example.drink.Dao.mapper.MemberLoginMapper;
import com.example.drink.Dao.mapper.MemberParamMapper;
import com.example.drink.model.MemberLoginModel;
import com.example.drink.model.MemberParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberLoginRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int memberLogin (MemberLoginModel memberLoginModel) {
        String sql = "insert into member(memberName,memberPhone) values (?,?)";
        return jdbcTemplate.update(sql, memberLoginModel.getName(), memberLoginModel.getPhone());
    }

    public long checkMember (String memberName) {
        String sql = "select count(*) from member where memberName=?";
        return jdbcTemplate.queryForObject(sql, Long.class, memberName);
    }

    public List<MemberLoginModel> checkMemberAll() {
        return jdbcTemplate.query("select * from member", new MemberLoginMapper());
    }

    public List<MemberLoginModel> checkMemberByName (String name) {
        return jdbcTemplate.query("select * from member where memberName=?", new MemberLoginMapper(), name);
    }

    public List<MemberLoginModel> checkMemberByPhone (String phone) {
        return jdbcTemplate.query("select * from member where memberPhone=?", new MemberLoginMapper(), phone);
    }
}
