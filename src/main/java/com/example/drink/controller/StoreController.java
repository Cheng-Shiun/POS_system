package com.example.drink.controller;

import com.example.drink.model.StoreModel;
import com.example.drink.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StoreController {
    @Autowired
    StoreService storeService;

    @GetMapping("/store/{area}")
    public String getStore(@PathVariable String area, Model model){
        //接收資料
        List<StoreModel> stores = storeService.getStoreByArea(area);
        model.addAttribute("stores", stores);
        return "store";
    }

}
