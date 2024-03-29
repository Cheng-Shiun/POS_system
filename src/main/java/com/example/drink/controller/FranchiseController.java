package com.example.drink.controller;

import com.example.drink.DAO.FranchiseRepository;
import com.example.drink.model.FranchiseModel;
import com.example.drink.service.FranchiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("franchise")
public class FranchiseController {
    @Autowired
    FranchiseService franchiseService;

    @PostMapping("/submitForm")
    public String submitForm(@RequestParam(value = "name",required = false) String name,
                             @RequestParam(value = "gender", required = false) String gender, //equired = false 框架在資料綁定時，允許該欄位的值(參數)可以不存在(空字串)或為空（null）
                             @RequestParam(value = "phone",required = false) String phone,
                             @RequestParam(value = "lineID",required = false) String lineID,
                             @RequestParam(value = "address",required = false) String address,
                             @RequestParam(value = "budget",required = false) String budget,
                             @RequestParam(value = "opentime",required = false) String opentime,
                             @RequestParam(value = "contacttime",required = false) String contacttime,
                             @RequestParam(value = "description",required = false) String description){

        if(phone==null||phone.isEmpty()||address==null||
                address.isEmpty()||budget==null||budget.isEmpty()||
                opentime==null||opentime.isEmpty()||
                contacttime==null||contacttime.isEmpty()){
            return "otherError";        //檢查必填欄位 若未填寫會跳錯誤頁面
        }

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
            return "otherError";       // 其他情况 導到其他錯誤頁面 ex.未填完
        }
    }

    //調用FranchiseService 若Service有要另任條件判斷
//    @PostMapping("/checkPhoneNumber")
//    @ResponseBody
//    //處理POST請求 用來接收 傳前端傳來的 參數(phone)
//    public Map<String, Boolean> checkPhoneNumber(@RequestParam("phone") String phone) {
//        Map<String, Boolean> response = new HashMap<>();  //建一個 Map 存放 後端處理後的結果
//        boolean exists = franchiseService.checkFranchiseByPhone(phone);    //這裡用 franchiseService
//        response.put("exists", exists); //把檢查的結果放入 Map  用exists作為key。
//        return response;
//    }

    //調用FranchiseRepository 不在Service做任何條件判斷
    @Autowired
    FranchiseRepository franchiseRepository;  //因為是用Repository 因此要加入FranchiseRepository
    @PostMapping("/checkPhoneNumber")
    @ResponseBody
    public Map<String, Boolean> checkPhoneNumber(@RequestParam("phone") String phone) {
        Map<String, Boolean> response = new HashMap<>();
        boolean exists = franchiseRepository.checkFranchiseByPhone(phone);  //這裡改 franchiseRepository
        response.put("exists", exists);
        return response;
    }


}