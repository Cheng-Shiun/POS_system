package com.example.drink.controller;

import com.example.drink.model.FranchiseModel;
import com.example.drink.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/franchise")
public class FranchiseController {

    @Autowired
    private FranchiseService franchiseService;

    @GetMapping
    public String showFranchiseForm(Model model) {
        model.addAttribute("franchiseModel", new FranchiseModel());
        return "franchise";
    }

    @PostMapping
    public String submitFranchiseForm(@ModelAttribute FranchiseModel franchiseModel, Model model) {
//        System.out.println("Received form data: " + franchiseModel.toString()); //確定資料的來源
        int result = franchiseService.submitFranchiseForm(franchiseModel);

        if (result == 1) {
            // 成功新增
            return "success";
        } else if (result == 2) {
            // 重複的phone.name
            return "exists";
        } else if (result == 3) {
            // 包含保留字的情况
            return "invalid";
        } else if(result == 4){
            // 失敗的情况
            System.out.println("進入資料未填寫完整的區段");
            return "otherError";
        } else {
            System.out.println("未知的結果: " + result);
            return "error";
        }
    }
}

