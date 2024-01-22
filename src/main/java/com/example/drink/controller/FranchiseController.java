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
        return "Franchise";
    }
    //new
    @PostMapping("/checkPhoneNumber")
    @ResponseBody
    public boolean checkPhoneNumber(@RequestParam String phone){
        return franchiseService.isPhoneDuplicate (phone);
    }

    @PostMapping
    public String submitFranchiseForm(@ModelAttribute("franchiseModel") FranchiseModel franchiseModel, Model model) {
        String phoneNumber = franchiseModel.getPhone ();
//        if(franchiseService.isPhoneDuplicate (phoneNumber)){
//            model.addAttribute ("duplicate",true);
//            return "franchise";// 返回加盟表單的視圖名稱，顯示錯誤消息
//        }
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
            // 資料未填寫完整
            return "otherError";
        } else if(result == 5){
            // 資料未填寫完整
            return "phoneLen";
        }else {
            System.out.println("未知的結果: " + result);
            return "error";
        }
    }
}

