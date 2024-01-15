package com.example.drink.controller;

import com.example.drink.model.FranchiseModel;
import com.example.drink.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("franchise")
public class FranchiseController {
    @Autowired
    FranchiseService franchiseService;

    @PostMapping("/submitForm")
    public String submitForm(@RequestParam("name") String name,
                             @RequestParam(value = "gender", required = false) String gender, //equired = false 框架在資料綁定時，允許該欄位的值(參數)可以不存在(空字串)或為空（null）
                             @RequestParam("phone") String phone,
                             @RequestParam("lineID") String lineID,
                             @RequestParam("address") String address,
                             @RequestParam("budget") String budget,
                             @RequestParam("opentime") String opentime,
                             @RequestParam("contacttime") String contacttime,
                             @RequestParam("description") String description){
        FranchiseModel franchiseModel = new FranchiseModel (name,gender,phone,lineID,address,budget,opentime,contacttime,description);
        int result = franchiseService.submitFranchiseForm (franchiseModel);

        if(result ==1){
            return "success"; // 提交成功並存入DB資料表 導到成功頁面
        }
        else if(result == 2){
            return "exists";    // 加盟者已存在 導到提示已存在頁面
        }
        else if(result == 3){
            return "invalid";   // 有保留字 導到錯誤輸入頁面
        }
        else {
            return "error";       // 其他情况，重定向到默认错误頁面
        }
    }
}
