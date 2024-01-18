package com.example.drink.controller;
import com.example.drink.service.MemberTestService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    @Autowired
    private MemberTestService memberTestService;

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // Thymeleaf login page
    }

    @PostMapping("/login")
    public String login(@RequestParam String memberName, @RequestParam String memberPhone, HttpSession session) {
        boolean isAuthenticated =memberTestService.authenticate(memberName, memberPhone);
        if (isAuthenticated) {
            session.setAttribute("loggedIn", true);
            session.setAttribute("memberName", memberName);
            return "redirect:/home"; // Redirect to home page on successful login
        }
        return "login"; // Stay on login page on failure
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // Invalidate session to clear all attributes
        return "redirect:/login"; // Redirect to login page
    }

    // ... 其他方法 ...
}
