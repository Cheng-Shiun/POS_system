package com.example.drink.service;

import com.example.drink.Dao.MemberRepository;
import com.example.drink.Dao.mapper.MemberMapper;
import com.example.drink.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Member> getMemberAll() {
        MemberMapper memberMapper = new MemberMapper();

        List<Member> allmember = jdbcTemplate.query( "select * from member",memberMapper);
        return allmember;
    }

    public List<Member> getMemberById(int mid) {
        return jdbcTemplate.query( "select * from member where mid=" + mid, new MemberMapper());
    }

    public List<Member> getMemberByName(String name) {
        return jdbcTemplate.query( "select * from member where memberName=" + name, new MemberMapper());
    }


}
