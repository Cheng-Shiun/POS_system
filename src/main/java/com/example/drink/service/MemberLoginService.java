package com.example.drink.service;

import com.example.drink.Dao.MemberLoginRepository;
import com.example.drink.Dao.NewMemberRepository;
import com.example.drink.model.MemberLoginModel;
import com.example.drink.model.MemberParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberLoginService {
    @Autowired
    MemberLoginRepository memberLoginRepository;

    public int memberLogin(MemberLoginModel memberLoginModel) {
        if (memberLoginModel.getName().contains("select") || memberLoginModel.getName().contains("delate")) {
            return 3;
        }

        if ( checkMember(memberLoginModel.getName())) {
            return 2;
        }

        int count = memberLoginRepository.memberLogin(memberLoginModel);
        if (count > 0) {
            return 1;
        } else {
            return count;
        }
    }

    public boolean checkMember (String memberName) {
        long count = memberLoginRepository.checkMember(memberName);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public List<MemberLoginModel> checkMemberByName (String name) {
        return memberLoginRepository.checkMemberByName(name);
    }

    public List<MemberLoginModel> checkMemberByPhone (String phone) {
        return memberLoginRepository.checkMemberByPhone(phone);
    }

    public List<MemberLoginModel> checkMemberAll() {
        return memberLoginRepository.checkMemberAll();
    }
}
