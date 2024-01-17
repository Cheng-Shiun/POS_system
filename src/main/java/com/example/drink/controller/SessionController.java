package com.example.drink.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SessionController {
    @GetMapping("/setSession")
    public String setSession(HttpSession session) {
        // 在 session 中存儲一個屬性
        session.setAttribute("username", "John");
        return "redirect:/showSession";
    }

    @GetMapping("/showSession")
    public String showSession(HttpSession session, Model model) {
        // 從 session 中讀取屬性
        String username = (String) session.getAttribute("username");

        // 將屬性傳遞給 Thymeleaf 模板
        model.addAttribute("username", username);
        return "showSession";
    }

    // 新增一個 RESTful 路徑用於獲取 Session 屬性的值
    @GetMapping("/getSessionData")
    public String getSessionData(HttpSession session) {
        // 從 session 中讀取 "username" 屬性的值
        String username = (String) session.getAttribute("username");
        return username != null ? username : "No Session Data";
    }
}
