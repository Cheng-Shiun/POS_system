package com.example.drink.service;

import com.example.drink.Dao.NewMemberRepository;
import com.example.drink.model.MemberParam;
import com.example.drink.model.OrderItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewMemberService {
    @Autowired
    NewMemberRepository newMemberRepository;

    public int newMember(MemberParam memberParam) {
        if (memberParam.getName().contains("select") || memberParam.getName().contains("delate")) {
            return 3;
        }

        if ( checkMember(memberParam.getName())) {
            return 2;
        }

        int count = newMemberRepository.newMember(memberParam);
        if (count > 0) {
            return 1;
        } else {
            return count;
        }
    }

    public boolean checkMember (String memberName) {
        long count = newMemberRepository.checkMember(memberName);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<MemberParam> checkMemberByName (String name) {
        return newMemberRepository.checkMemberByName(name);
    }

    public List<MemberParam> checkMemberByPhone (String phone) {
        return newMemberRepository.checkMemberByPhone(phone);
    }

    public List<MemberParam> checkMemberAll() {
        return newMemberRepository.checkMemberAll();
    }
}
