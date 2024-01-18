package com.example.drink.controller;

import com.example.drink.model.MemberLoginModel;
import com.example.drink.model.MemberParam;
import com.example.drink.service.MemberLoginService;
import com.example.drink.service.NewMemberService;
import jakarta.servlet.http.HttpSession;
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
    public String memberLogin(Model model, HttpSession httpSession) {
        MemberLoginModel memberLoginModel = new MemberLoginModel();
        model.addAttribute("memberLoginModel", memberLoginModel);

        httpSession.setAttribute("nameSession", memberLoginModel.getName());
        httpSession.setAttribute("phoneSession", memberLoginModel.getPhone());
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

    @GetMapping("/setSessionLogin")
    public String setSession(HttpSession session) {
        // 在 session 中存儲一個屬性
        session.setAttribute("username", "John");
        return "redirect:/showSessionLogin";
    }

    @GetMapping("/showSessionLogin")
    public String showSession(HttpSession session, Model model) {
        // 從 session 中讀取屬性
        String username = (String) session.getAttribute("username");

        // 將屬性傳遞給 Thymeleaf 模板
        model.addAttribute("username", username);
        return "showSession";
    }
}
