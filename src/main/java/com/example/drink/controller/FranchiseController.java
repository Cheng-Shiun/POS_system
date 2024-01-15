package com.example.drink.controller;

import com.example.drink.model.FranchiseModel;
import com.example.drink.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FranchiseController {
    @Autowired
    private FranchiseService franchiseService;

    @GetMapping("/franchise")
    public String showFranchiseForm(Model model) {
        model.addAttribute("franchiseModel", new FranchiseModel());
        return "franchise";
    }

    @PostMapping("/franchise")
    public String submitFranchiseForm(@ModelAttribute FranchiseModel franchiseModel) {
        franchiseService.saveFranchise(franchiseModel);
        return "index"; // 重定向到成功頁面或其他頁面
    }
}
