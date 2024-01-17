package com.example.drink.controller;

import com.example.drink.model.MemberLoginModel;
import com.example.drink.model.MemberParam;
import com.example.drink.service.MemberLoginService;
import com.example.drink.service.NewMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberLoginController {
    @Autowired
    MemberLoginService memberLoginService;
    @GetMapping("/memberLogin")
    public String memberLogin(Model model) {
        MemberLoginModel memberLoginModel = new MemberLoginModel();
        model.addAttribute("memberLoginModel", memberLoginModel);
        return "memberLogin";
    }

    @PostMapping("/memberLogin")
    public String memberLoginProcess(@ModelAttribute MemberLoginModel memberLoginModel, Model model) {
        String msg = null;

        int result = memberLoginService.memberLogin(memberLoginModel);

        switch (result) {
            case 0:
                msg = "新增失敗";
                break;
            case 1:
                msg = "註冊完畢";
                break;
            case 2:
                msg = "登入成功";
                break;
            case 3:
                msg = "禁止關鍵字";
                break;
            default:
                msg = "其它原因";
                break;
        }

        model.addAttribute("name", memberLoginModel.getName());
        model.addAttribute("phone", memberLoginModel.getPhone());

        model.addAttribute("mesg", msg);
        return "memberLoginResult";
    }
}
