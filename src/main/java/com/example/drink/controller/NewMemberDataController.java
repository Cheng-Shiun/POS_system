package com.example.drink.controller;

import com.example.drink.model.MemberParam;
import com.example.drink.service.NewMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@Controller
public class NewMemberDataController {
    @Autowired
    NewMemberService newMemberService;

    @GetMapping("/api/checkMemberByName/{name}")
    public List<MemberParam> queryByName(@PathVariable String name) { return newMemberService.checkMemberByName(name); }

    @GetMapping("/api/checkMemberByPhone/{phone}")
    public List<MemberParam> queryByPhone(@PathVariable String phone) { return newMemberService.checkMemberByPhone(phone); }
//    @GetMapping("/checkMemberByName")
//    public String newMemberProcess(@ModelAttribute MemberParam memberParam, Model model) {
//
//        String msg = null;
//
//        int result = newMemberService.newMember(memberParam);
//
//        switch (result) {
//            case 0:
//                msg = "新增失敗";
//                break;
//            case 1:
//                msg = "註冊完畢";
//                break;
//            case 2:
//                msg = "已註冊過";
//                break;
//            case 3:
//                msg = "禁止關鍵字";
//                break;
//            default:
//                msg = "其它原因";
//                break;
//        }
//
//        model.addAttribute("name", memberParam.getName());
//        model.addAttribute("phone", memberParam.getPhone());
//        model.addAttribute("address", memberParam.getAddress());
//        model.addAttribute("birthday", memberParam.getBirthday());
//        model.addAttribute("gender", memberParam.getGender());
//        model.addAttribute("email", memberParam.getEmail());
//
//        model.addAttribute("mesg", msg);
//        return "newMemberResult";
//    }
}


