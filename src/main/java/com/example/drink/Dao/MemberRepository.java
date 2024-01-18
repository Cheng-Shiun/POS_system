package com.example.drink.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public long isMemberExists(String name){
        String sql = "SELECT count(*) FROM member WHERE name = ?";
        // select count(*) 回傳預設為 long 型別 (除非自己轉型)
        // 如果回傳值為1 表示有該使用者帳號
        return jdbcTemplate.queryForObject(sql, Long.class, name);

    }


}
