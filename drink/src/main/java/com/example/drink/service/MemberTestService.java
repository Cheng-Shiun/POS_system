package com.example.drink.service;
import com.example.drink.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.drink.model.MemberTestModel;

@Service
public class MemberTestService {
    @Autowired
    private MemberRepository memberRepository;

    public boolean authenticate(String memberName, String memberPhone) {
        MemberTestModel member = memberRepository.findByMemberNameAndMemberPhone(memberName, memberPhone);
        return member != null;
    }
}
