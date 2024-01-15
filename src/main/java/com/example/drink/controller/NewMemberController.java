package com.example.drink.controller;

import com.example.drink.model.MemberParam;
import com.example.drink.service.NewMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewMemberController {
    @Autowired
    NewMemberService newMemberService;

    @GetMapping("/newMember")
    public String newMember(Model model) {
        MemberParam memberParam = new MemberParam();
        model.addAttribute("memberParam", memberParam);
        return "newMember";
    }

    @PostMapping("/newMember")
    public String newMemberProcess(@ModelAttribute MemberParam memberParam, Model model) {
        String msg = null;

        int result = newMemberService.newMember(memberParam);

        switch (result) {
            case 0:
                msg = "新增失敗";
                break;
            case 1:
                msg = "註冊完畢";
                break;
            case 2:
                msg = "已註冊過";
                break;
            case 3:
                msg = "禁止關鍵字";
                break;
            default:
                msg = "其它原因";
                break;
        }

        model.addAttribute("name", memberParam.getName());
        model.addAttribute("phone", memberParam.getPhone());
        model.addAttribute("address", memberParam.getAddress());
        model.addAttribute("birthday", memberParam.getBirthday());
        model.addAttribute("gender", memberParam.getGender());
        model.addAttribute("email", memberParam.getEmail());

        model.addAttribute("mesg", msg);
        return "newMemberResult";
    }
}
