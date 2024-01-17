package com.example.drink.controller;

import com.example.drink.model.Member;
import com.example.drink.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("/memberList")
    public String showMembers(Model model){
        List<Member> members = memberService.getMemberAll();
        model.addAttribute("members",members);
        return "memberList";
    }

    @GetMapping("/memberByNo")
    public String getByNo(Model model, @RequestParam int mid){
        model.addAttribute("members",memberService.getMemberById(mid));
        return "memberList";
    }

    @GetMapping("/memberByName")
    public String getByName(Model model, @RequestParam String name){
        model.addAttribute("members",memberService.getMemberByName(name));
        return "memberList";
    }

    @PostMapping("/memberNew")
    public String newMembers(@RequestBody Member member, Model model){
        System.out.println("接收 name=" + member.getName());
        System.out.println("接收 phone=" + member.getPhone());
        System.out.println("接收 address=" + member.getAddress());
        return "memberList";
    }

    //登入
    @GetMapping("/login")
    public String memberLogin(){
        return "login";
    }

}
